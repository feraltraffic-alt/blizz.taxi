# Sandbox transcript (2026-10-30T14:43:18Z, f42559c)

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
  "correlation_id": "1247b845-966e-43e2-b922-4d2d74799443"
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
  "session_id": "6eb0ff25-f33f-483d-b7ea-ad1964c45e43",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzIzMDYsImlhdCI6MTc5MzM3MTQwNiwianRpIjoiZWMwMzE4M2MtNmZlZi00YTkwLTg3MGItMzdhYTc0OGMwNjFkIiwic2lkIjoiNmViMGZmMjUtZjMzZi00ODNkLWI3ZWEtYWQxOTY0YzQ1ZTQzIn0.ldvdI9WeMoHw5Ht_ZIhtQ8yhJm_OzGRCS1ev9PdxDS8",
  "access_expires_at": "2026-10-30T14:58:26.59640381Z",
  "refresh_token": "MqcfCI7mKi6BuifCFuH7WBLHTlbHJ2JDXCdWiUDdlmQ",
  "refresh_expires_at": "2026-10-31T02:43:26.591815422Z",
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
  "session_id": "a4c51c38-55db-4fb7-9f37-57194c33cec8",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzIzMDgsImlhdCI6MTc5MzM3MTQwOCwianRpIjoiNTY5M2Y5MzYtNDQ1Yy00NjFiLTgzMTgtMTQwNzhiMjA4ZTVkIiwic2lkIjoiYTRjNTFjMzgtNTVkYi00ZmI3LTlmMzctNTcxOTRjMzNjZWM4In0.cQJungubdkK3k9Np571QjIjCuG7XSwf3bFLHfBh_iQY",
  "access_expires_at": "2026-10-30T14:58:28.587571119Z",
  "refresh_token": "KhsnPWy3mymvGBj2VpwQsmQSoIV5nssnq00eIiq6V00",
  "refresh_expires_at": "2026-10-31T02:43:28.586340157Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "device_ref": "sandbox-3403"
}
```

```json
{
  "challenge_id": "b255fa6f-e6a1-444d-b359-74d74ff43252",
  "expires_at": "2026-10-30T14:48:29.204332123Z",
  "resend_available_at": "2026-10-30T14:43:30.204332123Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "992422",
  "sent_at": "2026-10-30T14:43:29.225527056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b255fa6f-e6a1-444d-b359-74d74ff43252",
  "code": "992422",
  "device_ref": "sandbox-3403"
}
```

```json
{
  "session_id": "5d3cf641-8bf7-411c-8498-07f038d08463",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjMwOSwiaWF0IjoxNzkzMzcxNDA5LCJqdGkiOiI3MDZlNGU0NC02ZTY2LTQzNjQtOGM0Yy03MTU2NDliZWI0NWEiLCJzaWQiOiI1ZDNjZjY0MS04YmY3LTQxMWMtODQ5OC0wN2YwMzhkMDg0NjMifQ.TSbbhwFFvWBfjIyM5hNIVKSnnnwFXPVmdDHaGJ1x2d4",
  "access_expires_at": "2026-10-30T14:58:29.566649161Z",
  "refresh_token": "SPNqjAB535opuRk-RCaPqlPEfJk9LOkNiECtWRBGZGo",
  "refresh_expires_at": "2026-11-29T14:43:29.565351825Z",
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
  "command_id": "dec9beda-f2e8-4849-9936-5349408187e4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:30Z",
    "sequence": 1793371410151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69f9b26b-dfe6-46f4-8c68-5a727ec26eb9",
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
  "last_heartbeat_at": "2026-10-30T14:43:30.339774Z",
  "last_location_at": "2026-10-30T14:43:30.339774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631128038",
  "device_ref": "sandbox-11160"
}
```

```json
{
  "challenge_id": "7854e68f-e98b-4399-81f6-f40df85d44b7",
  "expires_at": "2026-10-30T14:48:30.638164323Z",
  "resend_available_at": "2026-10-30T14:43:31.638164323Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631128038` → **200**

```json
{
  "phone": "+380631128038",
  "audience": "CLIENT",
  "code": "836605",
  "sent_at": "2026-10-30T14:43:30.64319069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7854e68f-e98b-4399-81f6-f40df85d44b7",
  "code": "836605",
  "device_ref": "sandbox-11160"
}
```

```json
{
  "session_id": "601a385c-abd1-4c20-a081-88b9b73920f3",
  "subject": {
    "type": "CLIENT",
    "id": "0b54b6f2-40b4-4ca8-ba53-15cc9952b86f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjU0YjZmMi00MGI0LTRjYTgtYmE1My0xNWNjOTk1MmI4NmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyMzEwLCJpYXQiOjE3OTMzNzE0MTAsImp0aSI6IjRmMjk1ZGNjLTk1Y2QtNDc0MS1hZDI5LTQ0M2M1ZGZhYmY0YyIsInNpZCI6IjYwMWEzODVjLWFiZDEtNGMyMC1hMDgxLTg4YjliNzM5MjBmMyJ9.zz_7jriXvZvhvTmYEoow9DafhLwARKmqnnAQNtZz5sE",
  "access_expires_at": "2026-10-30T14:58:30.9497602Z",
  "refresh_token": "xycXm_FH6omdXHTVXtUbcqIt0xN-914p5uJwTBRnLco",
  "refresh_expires_at": "2026-11-29T14:43:30.948617843Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6022990-6919-44f2-bba4-5430eb588401",
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
  "id": "89c997ec-d563-482c-9dac-0e5b7f867e22",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:48:31.274625Z",
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
  "command_id": "89ffe9d9-1806-4090-8886-6b5deecf74d9",
  "quote_id": "89c997ec-d563-482c-9dac-0e5b7f867e22",
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
  "id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b54b6f2-40b4-4ca8-ba53-15cc9952b86f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:43:31.687023Z",
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
    "id": "bb9cfda1-9652-4b1d-acbe-7ebf2d2202da",
    "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
    "expires_at": "2026-10-30T14:43:46.698617Z",
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

`POST /api/driver/v1/offers/bb9cfda1-9652-4b1d-acbe-7ebf2d2202da/accept` → **200**

```json
{
  "command_id": "bb86ecac-14fe-4e70-8b62-876c3395b039"
}
```

```json
{
  "id": "383e797e-9fe7-4a9f-a338-b51d83653b85",
  "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2044c6dd-653b-4076-8302-52c0983a6b87",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "command_id": "e53edaeb-0ae8-47e6-9987-41aceb8cf0a6",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T14:43:32.976539465Z"
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
  "id": "2044c6dd-653b-4076-8302-52c0983a6b87",
  "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
  "assignment_id": "383e797e-9fe7-4a9f-a338-b51d83653b85",
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

`POST /api/driver/v1/work-sessions/69f9b26b-dfe6-46f4-8c68-5a727ec26eb9/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:33Z",
    "sequence": 1793371413891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "69f9b26b-dfe6-46f4-8c68-5a727ec26eb9",
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
  "last_heartbeat_at": "2026-10-30T14:43:33.916196Z",
  "last_location_at": "2026-10-30T14:43:33.916196Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2044c6dd-653b-4076-8302-52c0983a6b87/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ee7f0436-a99e-427e-9879-e55d06bb223f",
  "expected_version": 0
}
```

```json
{
  "id": "2044c6dd-653b-4076-8302-52c0983a6b87",
  "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
  "assignment_id": "383e797e-9fe7-4a9f-a338-b51d83653b85",
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
  "arrived_at": "2026-10-30T14:43:34.222908Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2044c6dd-653b-4076-8302-52c0983a6b87/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f45d16f0-66fb-4d36-b9b7-bae439f33b9e",
  "expected_version": 1
}
```

```json
{
  "id": "2044c6dd-653b-4076-8302-52c0983a6b87",
  "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
  "assignment_id": "383e797e-9fe7-4a9f-a338-b51d83653b85",
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
  "arrived_at": "2026-10-30T14:43:34.222908Z",
  "started_at": "2026-10-30T14:43:34.525969Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2044c6dd-653b-4076-8302-52c0983a6b87/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7069c888-d618-4f44-b49a-12f54195fdb5",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:43:35Z",
  "cash_received": true
}
```

```json
{
  "id": "2044c6dd-653b-4076-8302-52c0983a6b87",
  "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
  "assignment_id": "383e797e-9fe7-4a9f-a338-b51d83653b85",
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
  "arrived_at": "2026-10-30T14:43:34.222908Z",
  "started_at": "2026-10-30T14:43:34.525969Z",
  "completed_at": "2026-10-30T14:43:35.057738Z",
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
  "session_id": "69f9b26b-dfe6-46f4-8c68-5a727ec26eb9",
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
  "last_heartbeat_at": "2026-10-30T14:43:33.916196Z",
  "last_location_at": "2026-10-30T14:43:33.916196Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69f9b26b-dfe6-46f4-8c68-5a727ec26eb9/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0fd7476a-5644-4989-8465-a06960e6befa",
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
  "command_id": "bf0fc42c-bad3-4075-9dfe-82b7ca8a51d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:35Z",
    "sequence": 1793371415966
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
  "correlation_id": "ee92497a-27c2-45f3-8c7d-f335e55329ea",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "60026161-5d89-4021-b73b-3e0c43608209",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:36Z",
    "sequence": 1793371416262
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "983354de-472f-4478-b7bf-f96e19da2e15",
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
  "last_heartbeat_at": "2026-10-30T14:43:36.283124Z",
  "last_location_at": "2026-10-30T14:43:36.283124Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T14:43:32.976539Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "409c6360-751e-4dd1-a409-9d849bf1ae49",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T14:43:36.869023495Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "983354de-472f-4478-b7bf-f96e19da2e15",
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
  "last_heartbeat_at": "2026-10-30T14:43:36.283124Z",
  "last_location_at": "2026-10-30T14:43:36.283124Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/983354de-472f-4478-b7bf-f96e19da2e15/close` → **200**

```json
{
  "command_id": "6c975f67-7739-4055-b8d5-df489042a298",
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
  "session_id": "674a0497-5ab2-4892-8cfb-682e5989d1a5",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzIzMTgsImlhdCI6MTc5MzM3MTQxOCwianRpIjoiMzAwY2U3MzktZWU4NC00MWUyLWFkODQtZjU2YjQ2ZjhmNTFhIiwic2lkIjoiNjc0YTA0OTctNWFiMi00ODkyLThjZmItNjgyZTU5ODlkMWE1In0.sU0bwo9n75hLdabbR99kPNq3r2yzuqYH3LwJLDTDwrg",
  "access_expires_at": "2026-10-30T14:58:38.079704977Z",
  "refresh_token": "buBboUD5zt0-8n0i7qvhNDkFJr2Qt1P1ssBagsUN-PI",
  "refresh_expires_at": "2026-10-31T02:43:38.078749961Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b6bad4ac-a367-40fc-b439-caf5f91aae2e",
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
  "id": "5390b2e4-7afc-4f6a-a620-9359d91f8d9a",
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
  "created_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "created_at": "2026-10-30T14:43:38.370635Z",
  "updated_at": "2026-10-30T14:43:38.370635Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638463004",
  "device_ref": "sandbox-7317"
}
```

```json
{
  "challenge_id": "aaca56c4-2633-4824-aa58-1668cb1748d2",
  "expires_at": "2026-10-30T14:48:38.663171483Z",
  "resend_available_at": "2026-10-30T14:43:39.663171483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638463004` → **200**

```json
{
  "phone": "+380638463004",
  "audience": "CLIENT",
  "code": "868011",
  "sent_at": "2026-10-30T14:43:38.669627654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aaca56c4-2633-4824-aa58-1668cb1748d2",
  "code": "868011",
  "device_ref": "sandbox-7317"
}
```

```json
{
  "session_id": "d9873f4e-2530-4b51-bef5-5507b77a8dd3",
  "subject": {
    "type": "CLIENT",
    "id": "e2477510-6a49-4960-9fd6-fc70e1da8cb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjQ3NzUxMC02YTQ5LTQ5NjAtOWZkNi1mYzcwZTFkYThjYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyMzE4LCJpYXQiOjE3OTMzNzE0MTgsImp0aSI6IjBkNWNjM2RjLWEzYzgtNDkxZC1hODMxLWE5Yzk2MThhZDE0OSIsInNpZCI6ImQ5ODczZjRlLTI1MzAtNGI1MS1iZWY1LTU1MDdiNzdhOGRkMyJ9.E61klxqbjcftCt1uK5rbeVy5tFvkDl6gJ_8MdM_0h4Y",
  "access_expires_at": "2026-10-30T14:58:38.977309914Z",
  "refresh_token": "Rpbi96BRy1i-UpAFPbg57rbQw3BcfOJz8Qfbia3qt34",
  "refresh_expires_at": "2026-11-29T14:43:38.976477484Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638463004` → **200**

```json
{
  "client_id": "e2477510-6a49-4960-9fd6-fc70e1da8cb8"
}
```

`POST /api/admin/v1/rider-wallets/e2477510-6a49-4960-9fd6-fc70e1da8cb8/top-ups` → **201**

```json
{
  "command_id": "ce6c9187-e90f-4083-af61-209931ea546f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e2477510-6a49-4960-9fd6-fc70e1da8cb8",
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
      "id": "20376c84-1d9b-45a4-a245-c10bde26ea26",
      "at": "2026-10-30T14:43:39.553152Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f1193f11-517b-4d27-9d9b-87436e7f0e9d",
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
  "id": "3e74b6d6-4003-4f5c-a32a-a016a3f70da5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:48:39.869723Z",
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
      "id": "5390b2e4-7afc-4f6a-a620-9359d91f8d9a",
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
  "device_ref": "sandbox-12940"
}
```

```json
{
  "challenge_id": "a2896230-7e90-4139-bb9f-9eb64e7f78c9",
  "expires_at": "2026-10-30T14:48:40.167754781Z",
  "resend_available_at": "2026-10-30T14:43:41.167754781Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "510355",
  "sent_at": "2026-10-30T14:43:40.172456088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2896230-7e90-4139-bb9f-9eb64e7f78c9",
  "code": "510355",
  "device_ref": "sandbox-12940"
}
```

```json
{
  "session_id": "24bece05-85c9-45dc-8879-7dc4d062d32a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjMyMCwiaWF0IjoxNzkzMzcxNDIwLCJqdGkiOiI3YWFmMjVlYy03NDkzLTRiMmYtYTBhNi00ODMxODBkNTg3MTIiLCJzaWQiOiIyNGJlY2UwNS04NWM5LTQ1ZGMtODg3OS03ZGM0ZDA2MmQzMmEifQ.lp11unHYxqxzHFtK7nZbjuvql9Ix3NePR4FFex9JUOY",
  "access_expires_at": "2026-10-30T14:58:40.478592578Z",
  "refresh_token": "aGFP0Ibx_Lwd25yjjAYwzdmPRzAyaYzw0Q_fxPpvT20",
  "refresh_expires_at": "2026-11-29T14:43:40.477767666Z",
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
  "command_id": "4bd4781e-0c5f-46a1-8c18-f2cdd3afb829",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:41Z",
    "sequence": 1793371421551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68228162-ef30-4244-9126-e6c8cc6195cb",
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
  "last_heartbeat_at": "2026-10-30T14:43:41.075616Z",
  "last_location_at": "2026-10-30T14:43:41.075616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5448effb-d2d9-4b5d-a6fd-29ef6c5c186e",
  "quote_id": "3e74b6d6-4003-4f5c-a32a-a016a3f70da5",
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
  "id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2477510-6a49-4960-9fd6-fc70e1da8cb8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:43:41.379195Z",
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
  "client_id": "e2477510-6a49-4960-9fd6-fc70e1da8cb8",
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
      "id": "20376c84-1d9b-45a4-a245-c10bde26ea26",
      "at": "2026-10-30T14:43:39.553152Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
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
    "id": "c4367431-a279-4eb8-bcd6-c45caa7631aa",
    "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
    "expires_at": "2026-10-30T14:43:56.388566Z",
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

`POST /api/driver/v1/offers/c4367431-a279-4eb8-bcd6-c45caa7631aa/accept` → **200**

```json
{
  "command_id": "46a72f06-0599-4e45-a3e1-5b0bcc14c9bf"
}
```

```json
{
  "id": "cb89178d-bbf9-4b43-b792-8d92e6e50b00",
  "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8c8b08c7-50e1-4bce-99cc-843ba6f99803",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8c8b08c7-50e1-4bce-99cc-843ba6f99803",
  "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
  "assignment_id": "cb89178d-bbf9-4b43-b792-8d92e6e50b00",
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

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/68228162-ef30-4244-9126-e6c8cc6195cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:45Z",
    "sequence": 1793371425854
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68228162-ef30-4244-9126-e6c8cc6195cb",
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
  "last_heartbeat_at": "2026-10-30T14:43:45.875027Z",
  "last_location_at": "2026-10-30T14:43:45.875027Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8c8b08c7-50e1-4bce-99cc-843ba6f99803/arrive` → **200**

```json
{
  "command_id": "3f387855-7ea7-4a78-af4c-df972c60aa16",
  "expected_version": 0
}
```

```json
{
  "id": "8c8b08c7-50e1-4bce-99cc-843ba6f99803",
  "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
  "assignment_id": "cb89178d-bbf9-4b43-b792-8d92e6e50b00",
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
  "arrived_at": "2026-10-30T14:43:46.162545Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8c8b08c7-50e1-4bce-99cc-843ba6f99803/start` → **200**

```json
{
  "command_id": "e97078ab-2894-4670-a6b3-fe6cc8480cad",
  "expected_version": 1
}
```

```json
{
  "id": "8c8b08c7-50e1-4bce-99cc-843ba6f99803",
  "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
  "assignment_id": "cb89178d-bbf9-4b43-b792-8d92e6e50b00",
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
  "arrived_at": "2026-10-30T14:43:46.162545Z",
  "started_at": "2026-10-30T14:43:46.461676Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/8c8b08c7-50e1-4bce-99cc-843ba6f99803/complete` → **200**

```json
{
  "command_id": "e3bdd062-39e5-4f17-8342-6049edebd45f",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:43:46Z",
  "cash_received": true
}
```

```json
{
  "id": "8c8b08c7-50e1-4bce-99cc-843ba6f99803",
  "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
  "assignment_id": "cb89178d-bbf9-4b43-b792-8d92e6e50b00",
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
  "arrived_at": "2026-10-30T14:43:46.162545Z",
  "started_at": "2026-10-30T14:43:46.461676Z",
  "completed_at": "2026-10-30T14:43:46.772668Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e2477510-6a49-4960-9fd6-fc70e1da8cb8",
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
      "id": "0d7e2e53-529f-4429-a466-6dac68b1f7d4",
      "at": "2026-10-30T14:43:46.879652Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c"
    },
    {
      "id": "20376c84-1d9b-45a4-a245-c10bde26ea26",
      "at": "2026-10-30T14:43:39.553152Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/5390b2e4-7afc-4f6a-a620-9359d91f8d9a/archive` → **200**

```json
{
  "command_id": "6e6f6441-b381-4b55-bdda-a90ac2c0b98c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "5390b2e4-7afc-4f6a-a620-9359d91f8d9a",
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
  "created_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "created_at": "2026-10-30T14:43:38.370635Z",
  "updated_at": "2026-10-30T14:43:50.368666Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "68228162-ef30-4244-9126-e6c8cc6195cb",
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
  "last_heartbeat_at": "2026-10-30T14:43:45.875027Z",
  "last_location_at": "2026-10-30T14:43:45.875027Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/68228162-ef30-4244-9126-e6c8cc6195cb/close` → **200**

```json
{
  "command_id": "b72bada0-80a4-4f0d-a5a2-79d022cfed85",
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

Done: order a79ad942-6e5a-41b7-b824-7791ad53772c.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-21847"
}
```

```json
{
  "challenge_id": "8d766378-f8a1-4983-b045-5abc91f3469f",
  "expires_at": "2026-10-30T14:48:51.245149338Z",
  "resend_available_at": "2026-10-30T14:43:52.245149338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "358989",
  "sent_at": "2026-10-30T14:43:51.24955407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d766378-f8a1-4983-b045-5abc91f3469f",
  "code": "358989",
  "device_ref": "sandbox-21847"
}
```

```json
{
  "session_id": "676fef69-9e5f-43bd-97fd-dd32cdb83e80",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjMzMSwiaWF0IjoxNzkzMzcxNDMxLCJqdGkiOiI2NWJjOTExNC1hYjI4LTRkOTMtOTI2NS0xZTc0N2UyYjRlMWMiLCJzaWQiOiI2NzZmZWY2OS05ZTVmLTQzYmQtOTdmZC1kZDMyY2RiODNlODAifQ.6j8gGn89R2cRy80GMvqntGRlVCoi8Syj3U-lZtQDwM0",
  "access_expires_at": "2026-10-30T14:58:51.546583041Z",
  "refresh_token": "AbO2j3T4Ec3FockDc6KroU21GuL7bS-pWLHbbxp2ptU",
  "refresh_expires_at": "2026-11-29T14:43:51.545492204Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "command_id": "99ff18dd-c35a-4dc9-a4cd-bcfd0daeedde",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:52Z",
    "sequence": 1793371432388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ac2be12d-50bc-40b2-8adc-26e404ee1840",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T14:43:52.409172Z",
  "last_location_at": "2026-10-30T14:43:52.409172Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/ac2be12d-50bc-40b2-8adc-26e404ee1840/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:57Z",
    "sequence": 1793371437695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ac2be12d-50bc-40b2-8adc-26e404ee1840",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T14:43:57.715316Z",
  "last_location_at": "2026-10-30T14:43:52.409172Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_STALE"
  ],
  "accepted": false
}
```

## The operator's map still shows her in Warsaw

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
  "session_id": "7e28e5b2-46f8-4007-8f5c-83b738ec1e96",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzIzMzgsImlhdCI6MTc5MzM3MTQzOCwianRpIjoiNjk0ZDQzOWMtMzdjNi00YTgwLWJkNDQtMTY5NDRmZmJiMGZlIiwic2lkIjoiN2UyOGU1YjItNDZmOC00MDA3LThmNWMtODNiNzM4ZWMxZTk2In0.VeXusV9Ggd1Cc8Ih2D8_R6j-KEBvglf54mZImF-X9Qc",
  "access_expires_at": "2026-10-30T14:58:58.328383279Z",
  "refresh_token": "HUkKqf9w5S62avmGyXjI8xl2dPMglhXhnYhVUJw6J_4",
  "refresh_expires_at": "2026-10-31T02:43:58.327686703Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T14:43:58.601351071Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000405",
      "name": "Anna Wiśniewska",
      "car": {
        "registration_number": "WA0002T",
        "make": "Kia",
        "model": "Ceed",
        "color": "blue",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "last_location_at": "2026-10-30T14:43:52.409172Z",
      "last_heartbeat_at": "2026-10-30T14:43:57.715316Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/ac2be12d-50bc-40b2-8adc-26e404ee1840/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:43:58Z",
    "sequence": 1793371438896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ac2be12d-50bc-40b2-8adc-26e404ee1840",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T14:43:58.916208Z",
  "last_location_at": "2026-10-30T14:43:58.916208Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

Done: the jump to Lviv was refused, the map kept Warsaw, the next plausible fix was accepted.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ac2be12d-50bc-40b2-8adc-26e404ee1840",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T14:43:58.916208Z",
  "last_location_at": "2026-10-30T14:43:58.916208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ac2be12d-50bc-40b2-8adc-26e404ee1840/close` → **200**

```json
{
  "command_id": "25cddad3-b860-4fc0-83a2-c275b90311a4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-17185"
}
```

```json
{
  "challenge_id": "69f5b44d-7d28-4984-9c70-662ea2dc92f7",
  "expires_at": "2026-10-30T14:48:59.802449004Z",
  "resend_available_at": "2026-10-30T14:44:00.802449004Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "525020",
  "sent_at": "2026-10-30T14:43:59.806541977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69f5b44d-7d28-4984-9c70-662ea2dc92f7",
  "code": "525020",
  "device_ref": "sandbox-17185"
}
```

```json
{
  "session_id": "cf7d4c8e-9720-450e-92f9-4d258a9871cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjM0MCwiaWF0IjoxNzkzMzcxNDQwLCJqdGkiOiI5ZmQ0NGVjMi1kNjhjLTRiM2QtYTlmMC01MDdmN2QxMjZhNDIiLCJzaWQiOiJjZjdkNGM4ZS05NzIwLTQ1MGUtOTJmOS00ZDI1OGE5ODcxY2MifQ.6cwtmwvVKUhuMW2QaSpDvPzShidSuPWHl2bZhuMlx1s",
  "access_expires_at": "2026-10-30T14:59:00.109937617Z",
  "refresh_token": "nCatv_ags4UC3eTkKIbENminbAwreuqyyyK0LbarBdo",
  "refresh_expires_at": "2026-11-29T14:44:00.109201825Z",
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

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-23012"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "fe2aa6f6-9dfc-4b3a-b661-613bbc3fc8e6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-23012"
}
```

```json
{
  "challenge_id": "e7bd3822-e7bb-4a7f-b1ac-5c5617667858",
  "expires_at": "2026-10-30T14:49:01.96221112Z",
  "resend_available_at": "2026-10-30T14:44:02.96221112Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "875315",
  "sent_at": "2026-10-30T14:44:01.969935179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7bd3822-e7bb-4a7f-b1ac-5c5617667858",
  "code": "875315",
  "device_ref": "sandbox-23012"
}
```

```json
{
  "session_id": "3c60ac07-b3b7-45a7-a86f-4fbbb063be22",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjM0MiwiaWF0IjoxNzkzMzcxNDQyLCJqdGkiOiJhYWQ4YjFkMi0yYTUwLTRhNmQtOTg0NC0yYmE3YWI5ZjA0NDkiLCJzaWQiOiIzYzYwYWMwNy1iM2I3LTQ1YTctYTg2Zi00ZmJiYjA2M2JlMjIifQ.IF3TpDumUeIBiO1WNoFeka9ybgHEiv-xCrOBCaR82gc",
  "access_expires_at": "2026-10-30T14:59:02.273562651Z",
  "refresh_token": "0tNRa-ug6uQWQOCHNNZvCOPtrF-sQPAYCaeSwjRL_Tk",
  "refresh_expires_at": "2026-11-29T14:44:02.272594539Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-5196"
}
```

```json
{
  "challenge_id": "94e61c7a-0bf0-44bd-a675-67e8a88bc9e0",
  "expires_at": "2026-10-30T14:49:02.553378941Z",
  "resend_available_at": "2026-10-30T14:44:03.553378941Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "084008",
  "sent_at": "2026-10-30T14:44:02.557158972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94e61c7a-0bf0-44bd-a675-67e8a88bc9e0",
  "code": "084008",
  "device_ref": "sandbox-5196"
}
```

```json
{
  "session_id": "2a9b20ae-085a-4064-9bd5-3510fe8f2e2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjM0MiwiaWF0IjoxNzkzMzcxNDQyLCJqdGkiOiIxMzllMWVjNC02NmQ3LTQ1OTAtYWUxNS0wMmE4NzY0MDI3MDgiLCJzaWQiOiIyYTliMjBhZS0wODVhLTQwNjQtOWJkNS0zNTEwZmU4ZjJlMmYifQ.xuQZI_4FoAs7xLa0ZJ-7wlqF-XOubw7dxn-HOsJyMA4",
  "access_expires_at": "2026-10-30T14:59:02.876012521Z",
  "refresh_token": "mD49tCs_oQCPWWiTgUk6lS43puijJSl4JCYl9tOuhGY",
  "refresh_expires_at": "2026-11-29T14:44:02.875356248Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

(the car drives 183 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "afda2493-f9b4-48b6-9368-558426cd7d12",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:47:06Z",
    "sequence": 1793371626721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a2c92ab8-11c7-4208-9a50-ca4cd9e6f041",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T14:47:06.741454Z",
  "last_location_at": "2026-10-30T14:47:06.741454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600388762",
  "device_ref": "sandbox-28930"
}
```

```json
{
  "challenge_id": "e9376582-546d-48e5-af4b-a17c1f375205",
  "expires_at": "2026-10-30T14:52:07.027483692Z",
  "resend_available_at": "2026-10-30T14:47:08.027483692Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600388762` → **200**

```json
{
  "phone": "+48600388762",
  "audience": "CLIENT",
  "code": "972931",
  "sent_at": "2026-10-30T14:47:07.031052758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9376582-546d-48e5-af4b-a17c1f375205",
  "code": "972931",
  "device_ref": "sandbox-28930"
}
```

```json
{
  "session_id": "ec7162f8-9fe8-4057-971f-30d6dbd3c269",
  "subject": {
    "type": "CLIENT",
    "id": "a7114d1b-8637-419e-8e64-aa25edbbf30c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzExNGQxYi04NjM3LTQxOWUtOGU2NC1hYTI1ZWRiYmYzMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNTI3LCJpYXQiOjE3OTMzNzE2MjcsImp0aSI6IjFlOTBjZTU1LWU4YWEtNGE5Mi04NjQyLWUyNTQ0OWRjMWExOSIsInNpZCI6ImVjNzE2MmY4LTlmZTgtNDA1Ny05NzFmLTMwZDZkYmQzYzI2OSJ9.i1D-XQdjfgaNTSPMYWG2nybUSySkSlwdQ4jEQBAb4Xk",
  "access_expires_at": "2026-10-30T15:02:07.337087256Z",
  "refresh_token": "jnO0_6Tj294iu5iOaRfuuy06CeYxxTZJKKiD37ztRwA",
  "refresh_expires_at": "2026-11-29T14:47:07.336526739Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb014969-05db-4dee-969f-dfebb43767bb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  }
}
```

```json
{
  "id": "b181d656-4fea-40b5-baab-7f30886853cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:52:07.632996Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 4942,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "938220c3-df0d-45ab-9dcb-b13483ac5a83",
  "quote_id": "b181d656-4fea-40b5-baab-7f30886853cb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH"
}
```

```json
{
  "id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7114d1b-8637-419e-8e64-aa25edbbf30c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:47:07.940764Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2` → **200**

```json
{
  "id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7114d1b-8637-419e-8e64-aa25edbbf30c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:47:07.940764Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2/claim` → **422**

```json
{
  "command_id": "09e7ebb2-48d2-4330-845d-227dec3a08a6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "6a95ec93-6175-4e89-aab7-660031b01e94"
}
```

`GET /api/rider/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2` → **200**

```json
{
  "id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7114d1b-8637-419e-8e64-aa25edbbf30c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:47:07.940764Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429

`POST /api/driver/v1/orders/14b62e4d-9dd5-46f8-b160-021e6094f868/claim` → **404**

```json
{
  "command_id": "4a4eff35-f0fb-4b03-a188-63212305d573"
}
```

```json
{
  "instance": "/api/driver/v1/orders/14b62e4d-9dd5-46f8-b160-021e6094f868/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8c84ceb7-e014-4c5c-9cd3-924d54efbd5d"
}
```

`POST /api/driver/v1/orders/bd81a250-b145-4509-af4c-a655bf28ae4f/claim` → **404**

```json
{
  "command_id": "5af4b0cf-8ab4-4d08-93da-d0f7a879fcfd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bd81a250-b145-4509-af4c-a655bf28ae4f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "37cc54c1-9445-4e2c-84fb-e68b71c6428e"
}
```

`POST /api/driver/v1/orders/6d5bceb0-7a31-431c-9b25-d93017799bf9/claim` → **404**

```json
{
  "command_id": "73a19055-70b5-499b-bf92-9e49810fd782"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6d5bceb0-7a31-431c-9b25-d93017799bf9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5ac55ecd-2bd5-4cbc-bc6f-72639cab658f"
}
```

`POST /api/driver/v1/orders/93a32d72-f754-4e40-abdb-094cc403132b/claim` → **404**

```json
{
  "command_id": "edba4c71-701a-44c8-9537-23d17bcca1ab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/93a32d72-f754-4e40-abdb-094cc403132b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "37c4daa7-96c0-4604-a919-4a653260e805"
}
```

`POST /api/driver/v1/orders/67fa3981-b858-4f2d-bceb-b971f104be74/claim` → **404**

```json
{
  "command_id": "755eeef8-a348-4011-ac72-0180f78abcbf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/67fa3981-b858-4f2d-bceb-b971f104be74/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6019a218-f633-4205-bdba-f7e11c9aea3f"
}
```

`POST /api/driver/v1/orders/532765a8-70b2-46f3-91f7-cbcd3bf71b95/claim` → **404**

```json
{
  "command_id": "a71aac80-5453-49ad-9722-852297ab7d28"
}
```

```json
{
  "instance": "/api/driver/v1/orders/532765a8-70b2-46f3-91f7-cbcd3bf71b95/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c080862b-4663-4e5c-ab2f-a0ad0a5dec58"
}
```

`POST /api/driver/v1/orders/81c4d342-33a9-4abf-b36f-6b7f1da3cafa/claim` → **404**

```json
{
  "command_id": "65f42657-34cb-433a-ac70-4676fcb0b017"
}
```

```json
{
  "instance": "/api/driver/v1/orders/81c4d342-33a9-4abf-b36f-6b7f1da3cafa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "13778f82-ab35-4a27-8a05-57917cd36ddc"
}
```

`POST /api/driver/v1/orders/accf7de6-196b-40c1-afb2-15063fcba515/claim` → **404**

```json
{
  "command_id": "03e277f1-a6fe-4818-a60b-3303135e9c40"
}
```

```json
{
  "instance": "/api/driver/v1/orders/accf7de6-196b-40c1-afb2-15063fcba515/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ac4b9b32-c212-4fa3-9f1f-621991d2291d"
}
```

`POST /api/driver/v1/orders/cb4a0769-2bc0-4917-9ad4-d4872c921337/claim` → **404**

```json
{
  "command_id": "941c2275-7d1c-4811-8528-26e23b4de0ce"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cb4a0769-2bc0-4917-9ad4-d4872c921337/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6be5520c-8161-426c-ae69-43b2d0e76c08"
}
```

`POST /api/driver/v1/orders/026addcf-2470-4f58-b769-4201977664bc/claim` → **404**

```json
{
  "command_id": "6bd2f0d2-827f-4dd0-a8c8-c3e18d2f4cf3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/026addcf-2470-4f58-b769-4201977664bc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ff50fea3-e3b4-4723-9344-c5fd562c44aa"
}
```

`POST /api/driver/v1/orders/54b257fa-375b-4659-9989-89ba4c3af115/claim` → **404**

```json
{
  "command_id": "c70e67bf-1cca-4526-bb51-e5653b866dbc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/54b257fa-375b-4659-9989-89ba4c3af115/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8661cdf6-0c97-4ec8-8d7e-6d9416ff3f75"
}
```

`POST /api/driver/v1/orders/b39cbee3-505b-4558-9f2d-932217d23a99/claim` → **404**

```json
{
  "command_id": "a10073e5-f735-4245-82da-1538b521a67a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b39cbee3-505b-4558-9f2d-932217d23a99/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "956efd4c-4d61-40c0-8067-5b84edf95154"
}
```

`POST /api/driver/v1/orders/a06337e2-04f7-4ff0-b3ff-48bf2929bada/claim` → **404**

```json
{
  "command_id": "169f4beb-24fd-4d7b-b3ef-450cef0699a3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a06337e2-04f7-4ff0-b3ff-48bf2929bada/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f6b0c6c5-19d5-4597-beb6-b0e98358a31e"
}
```

`POST /api/driver/v1/orders/b5e3fe8e-d9b9-478b-8ec0-64c05d37a962/claim` → **404**

```json
{
  "command_id": "d7887c24-af54-4e02-8327-e4a307bee65b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b5e3fe8e-d9b9-478b-8ec0-64c05d37a962/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f76b2f90-eedc-42f2-b93f-016de53ca7c4"
}
```

`POST /api/driver/v1/orders/a15ca5dd-0e8b-406b-acfd-c835c6c7f8a4/claim` → **404**

```json
{
  "command_id": "fedcf8be-3908-4070-9fcf-2354d13303e0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a15ca5dd-0e8b-406b-acfd-c835c6c7f8a4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3c6c17fe-c971-4f39-9634-9c585f9cc335"
}
```

`POST /api/driver/v1/orders/5ddf0434-4657-4e88-add1-1cce41e6b717/claim` → **404**

```json
{
  "command_id": "aefc166d-f4d2-415f-9af9-55938f84569f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5ddf0434-4657-4e88-add1-1cce41e6b717/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9a345027-5eac-4a0b-9322-b8738450eca0"
}
```

`POST /api/driver/v1/orders/3d08ec22-e72b-45c6-9dea-1d3aa3047201/claim` → **404**

```json
{
  "command_id": "7ce0d0e8-f3b8-41d3-82f3-f1c2a6b7e6c8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3d08ec22-e72b-45c6-9dea-1d3aa3047201/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d02c17bf-c962-4f43-bc8b-fcfa8b3b2169"
}
```

`POST /api/driver/v1/orders/6dd20a08-e545-4feb-af7f-58ff9ccb984c/claim` → **404**

```json
{
  "command_id": "6e21e56d-13be-40a6-850a-1bd13c9a175a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6dd20a08-e545-4feb-af7f-58ff9ccb984c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "90891229-39c8-4ab2-9a0c-0e45af6e4e0b"
}
```

`POST /api/driver/v1/orders/692cce7a-e25b-494a-9863-a40af7b8e549/claim` → **404**

```json
{
  "command_id": "45ba48fa-777f-4e19-93b1-d12971ea3c22"
}
```

```json
{
  "instance": "/api/driver/v1/orders/692cce7a-e25b-494a-9863-a40af7b8e549/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04e11f11-896d-4bbb-ab41-e74c84c0e98e"
}
```

`POST /api/driver/v1/orders/a6844fd0-09d2-4993-9f68-25ff0e4ad7f9/claim` → **404**

```json
{
  "command_id": "7de50281-6b88-4d18-8375-cf8a605cefcb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a6844fd0-09d2-4993-9f68-25ff0e4ad7f9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7f2fdb01-e3a4-4a22-8551-d6542590071e"
}
```

`POST /api/driver/v1/orders/b47319a6-5cac-4860-af6e-a6bf58cbb866/claim` → **404**

```json
{
  "command_id": "5c835972-8482-4a92-b102-a6ca18159030"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b47319a6-5cac-4860-af6e-a6bf58cbb866/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "12577ec4-5e1f-49f9-97fc-9a533f487b7c"
}
```

`POST /api/driver/v1/orders/499eb643-f72a-4406-bda6-47e519e946c2/claim` → **404**

```json
{
  "command_id": "e0d0046b-1a3d-4675-a7f7-ab315d62cda8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/499eb643-f72a-4406-bda6-47e519e946c2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "17622aa2-3564-45ed-996b-56f4878d23b1"
}
```

`POST /api/driver/v1/orders/40f3d4dc-e753-46bf-a19e-7799c7ec040d/claim` → **404**

```json
{
  "command_id": "7730417d-bed3-42d6-a8fe-cb49a05ca562"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40f3d4dc-e753-46bf-a19e-7799c7ec040d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "17e49907-f50d-41ad-afda-d996103a84b8"
}
```

`POST /api/driver/v1/orders/ee5eb482-5d51-430a-9d7d-6f517c211f9b/claim` → **404**

```json
{
  "command_id": "76ec935c-a03b-4c8d-b117-064a807f98e6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ee5eb482-5d51-430a-9d7d-6f517c211f9b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5c9b07c8-0bfd-4d7f-abc4-0840c8967aee"
}
```

`POST /api/driver/v1/orders/5db41694-6aac-453f-b412-67e39e69ef16/claim` → **404**

```json
{
  "command_id": "435c6489-6b10-48b9-a4c4-d9f7bbaded95"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5db41694-6aac-453f-b412-67e39e69ef16/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c03b499e-9066-47a1-9a9b-c9d5df717e1d"
}
```

`POST /api/driver/v1/orders/24f823da-5ec0-4bd9-879f-da4bf5f7c760/claim` → **404**

```json
{
  "command_id": "b9268e2e-07be-4b64-8c15-4eeec463f574"
}
```

```json
{
  "instance": "/api/driver/v1/orders/24f823da-5ec0-4bd9-879f-da4bf5f7c760/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7438b160-51ff-48ce-8d91-e64cc55dd472"
}
```

`POST /api/driver/v1/orders/b0f53bb8-235c-454a-83c5-4a33b08d32f7/claim` → **404**

```json
{
  "command_id": "69f6650c-2ec4-4d6e-97a7-5e81ff929e9b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b0f53bb8-235c-454a-83c5-4a33b08d32f7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "77ee2108-e88b-4cb9-bcf6-c025351a1cf5"
}
```

`POST /api/driver/v1/orders/2c82b7da-854a-446c-86d8-07c4463c2818/claim` → **404**

```json
{
  "command_id": "4a4aa8a2-30dc-4555-8f54-1290266e6315"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2c82b7da-854a-446c-86d8-07c4463c2818/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "719a3832-0c02-467e-b184-758f260511d5"
}
```

`POST /api/driver/v1/orders/e5f56646-3df2-4580-840f-f5fea29be9b8/claim` → **404**

```json
{
  "command_id": "4eb2c5c1-361e-41f5-ad6f-777e7f8dd2ae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e5f56646-3df2-4580-840f-f5fea29be9b8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8e6cc3fb-fb4d-4470-bb5d-074e4fab85fb"
}
```

`POST /api/driver/v1/orders/639c079f-cf59-470f-89c0-bc25441358ff/claim` → **429**

```json
{
  "command_id": "147384d7-b3a1-4612-bbb7-5bf7f28e9250"
}
```

```json
{
  "instance": "/api/driver/v1/orders/639c079f-cf59-470f-89c0-bc25441358ff/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "1fef33fc-f584-4f1b-aabc-f177bdd85ad1",
  "retryable": true,
  "retry_after_seconds": 591
}
```

## Piotr goes online next to the pickup on his phone; his other phone cannot claim, the phone with the shift can

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
  "command_id": "a23b86ce-fd2a-4747-9629-d5eae344e180",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:47:18Z",
    "sequence": 1793371638500
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "87332cca-8db5-4237-b7d5-099047fcfefa",
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
  "last_heartbeat_at": "2026-10-30T14:47:18.519916Z",
  "last_location_at": "2026-10-30T14:47:18.519916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "PKiN",
    "dropoff_label": "Lotnisko",
    "payment_method": "CASH",
    "price_minor": 4942,
    "currency": "PLN",
    "distance_m": 590
  }
]
```

`POST /api/driver/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2/claim` → **409**

```json
{
  "command_id": "3e9e2467-edfd-49b9-928c-459811a6e0b3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bf091c23-2920-4491-bf88-bf1282dd0763"
}
```

`POST /api/driver/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2/claim` → **200**

```json
{
  "command_id": "36c3290a-06a9-412b-b311-a9f722dcced2"
}
```

```json
{
  "id": "f6c66b38-e3db-4e19-93b5-1dc26c202994",
  "order_id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "f477e497-7dce-4c70-bb5d-cd9d1830a92a",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f477e497-7dce-4c70-bb5d-cd9d1830a92a",
  "order_id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "assignment_id": "f6c66b38-e3db-4e19-93b5-1dc26c202994",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f477e497-7dce-4c70-bb5d-cd9d1830a92a/cancel` → **200**

```json
{
  "command_id": "59860299-a2c3-44d0-9238-711fa9c51036",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f477e497-7dce-4c70-bb5d-cd9d1830a92a",
  "order_id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "assignment_id": "f6c66b38-e3db-4e19-93b5-1dc26c202994",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order.

`GET /api/rider/v1/orders/dd5c55b6-3b74-4275-8220-4a485519b8c2` → **200**

```json
{
  "id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a7114d1b-8637-419e-8e64-aa25edbbf30c",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "f6c66b38-e3db-4e19-93b5-1dc26c202994",
    "order_id": "dd5c55b6-3b74-4275-8220-4a485519b8c2",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "f477e497-7dce-4c70-bb5d-cd9d1830a92a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:47:07.940764Z",
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "a2c92ab8-11c7-4208-9a50-ca4cd9e6f041",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T14:47:06.741454Z",
  "last_location_at": "2026-10-30T14:47:06.741454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a2c92ab8-11c7-4208-9a50-ca4cd9e6f041/close` → **200**

```json
{
  "command_id": "389038b6-ab5a-4a88-be19-a8c4c8e8f5f2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "87332cca-8db5-4237-b7d5-099047fcfefa",
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
  "last_heartbeat_at": "2026-10-30T14:47:18.519916Z",
  "last_location_at": "2026-10-30T14:47:18.519916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/87332cca-8db5-4237-b7d5-099047fcfefa/close` → **200**

```json
{
  "command_id": "b7db7e53-788f-4780-b682-0e58c121b64f",
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
  "session_id": "d648d821-5ee6-4907-86d4-499b70259aef",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI1NDIsImlhdCI6MTc5MzM3MTY0MiwianRpIjoiNmU2ZDY3NjAtZjA2Ni00ZTg4LTliMDYtMmJlNDliZDk3ZWZlIiwic2lkIjoiZDY0OGQ4MjEtNWVlNi00OTA3LTg2ZDQtNDk5YjcwMjU5YWVmIn0.gUuLMuw3Jz5_tTPARj964Et_WU0EGH84OnnzD9pJ5qY",
  "access_expires_at": "2026-10-30T15:02:22.036475469Z",
  "refresh_token": "hg6NvqrjoZ9tr-6JOYC74qfWNV73zd_VG5QFyJp_xFQ",
  "refresh_expires_at": "2026-10-31T02:47:22.035813462Z",
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
  "command_id": "d7a2a112-cc59-4d1c-bb88-969d954e63ce",
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
  "session_id": "4687eb92-f952-45c2-8434-b89448bffa71",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI1NDMsImlhdCI6MTc5MzM3MTY0MywianRpIjoiMDViZWZiNTItZGQ0Yy00MzViLTk1MGYtM2MwODBkMjM2NWJmIiwic2lkIjoiNDY4N2ViOTItZjk1Mi00NWMyLTg0MzQtYjg5NDQ4YmZmYTcxIn0.vYb5zhPt30Dt7YexuGevBNf_wrHMWt2HHh53jIuTIlw",
  "access_expires_at": "2026-10-30T15:02:23.204702991Z",
  "refresh_token": "EaieNswJwlGnWvlA51PtrqnuANp9D3Yi7xzKD-gdXes",
  "refresh_expires_at": "2026-10-31T02:47:23.204164655Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1608917705",
    "linkedid": "1730052700.1608917705",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675749485"
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
    "id": "1730052700.1608917705",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "0299d4ba-464c-4c13-954d-ee4d3db438d4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.483439Z",
      "answered_at": null,
      "ended_at": "2026-10-30T14:47:23.506731Z",
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
    "id": "1730052600.146694569",
    "linkedid": "1730052600.146694569",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675749485"
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
      "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.830574Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/6dd7dea9-c886-4357-a085-1c9281e04d59/answer` → **200**

```json
{
  "command_id": "a18ddad1-66e8-4e74-9140-7c28b95e1df2"
}
```

```json
{
  "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675749485",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "order_ids": [],
  "started_at": "2026-10-30T14:47:23.830574Z",
  "answered_at": "2026-10-30T14:47:24.149991Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.146694569",
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
    "id": "1730052600.146694569",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.830574Z",
      "answered_at": "2026-10-30T14:47:24.149991Z",
      "ended_at": "2026-10-30T14:47:24.457805Z",
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
      "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.830574Z",
      "answered_at": "2026-10-30T14:47:24.149991Z",
      "ended_at": "2026-10-30T14:47:24.457805Z",
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
      "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.830574Z",
      "answered_at": "2026-10-30T14:47:24.149991Z",
      "ended_at": "2026-10-30T14:47:24.457805Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:47:27.310607Z"
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
      "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.830574Z",
      "answered_at": "2026-10-30T14:47:24.149991Z",
      "ended_at": "2026-10-30T14:47:24.457805Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:47:27.310607Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/6dd7dea9-c886-4357-a085-1c9281e04d59/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/6dd7dea9-c886-4357-a085-1c9281e04d59/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=6dd7dea9-c886-4357-a085-1c9281e04d59` → **200**

```json
{
  "changes": [
    {
      "id": "e8d2cc4e-727f-491e-a67e-2c089b23caa5",
      "occurred_at": "2026-10-30T14:47:29.645067Z",
      "actor_type": "STAFF",
      "actor_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"22fd3790-ff5b-401d-91a9-db27a60a486c\", \"order_ids\": []}",
      "correlation_id": "8903d4a8-1678-4330-9a3c-a81d74a762c5"
    },
    {
      "id": "4cdd2ca3-3b80-4cd1-bf54-235381a4717d",
      "occurred_at": "2026-10-30T14:47:29.61438Z",
      "actor_type": "STAFF",
      "actor_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"22fd3790-ff5b-401d-91a9-db27a60a486c\", \"order_ids\": []}",
      "correlation_id": "7cd1dff4-2841-4a55-b241-8092b619d08b"
    }
  ]
}
```

Done: call 6dd7dea9-c886-4357-a085-1c9281e04d59 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11625"
}
```

```json
{
  "challenge_id": "41318b9b-10df-41ab-b592-fc841879d7a1",
  "expires_at": "2026-10-30T14:52:29.96715467Z",
  "resend_available_at": "2026-10-30T14:47:30.96715467Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "747395",
  "sent_at": "2026-10-30T14:47:29.970402168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41318b9b-10df-41ab-b592-fc841879d7a1",
  "code": "747395",
  "device_ref": "sandbox-11625"
}
```

```json
{
  "session_id": "fd09abe5-accb-445a-ae3f-b7958fe8c19f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjU1MCwiaWF0IjoxNzkzMzcxNjUwLCJqdGkiOiIwNDllZTc2OC1kYTIyLTQ5Y2UtOGRmMS1lNDhmM2RhODEwY2IiLCJzaWQiOiJmZDA5YWJlNS1hY2NiLTQ0NWEtYWUzZi1iNzk1OGZlOGMxOWYifQ.DsudCj2FI1V21ZKdJlazxxX4k_ok-S9Xaf5I3nc46TQ",
  "access_expires_at": "2026-10-30T15:02:30.277812048Z",
  "refresh_token": "q4Er4X-mDdQWzbQ3xboitX3_cxVLL4JVSl4xE_n0sq0",
  "refresh_expires_at": "2026-11-29T14:47:30.276299831Z",
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
  "command_id": "cf3f7371-975d-4253-a183-d8c94136e9fa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:47:30Z",
    "sequence": 1793371650845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c98e90d9-6aee-4c3e-919c-820a6b2956b4",
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
  "last_heartbeat_at": "2026-10-30T14:47:30.864495Z",
  "last_location_at": "2026-10-30T14:47:30.864495Z",
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
  "session_id": "bee352d8-7710-41b9-bcb9-bd7414e734ec",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI1NTEsImlhdCI6MTc5MzM3MTY1MSwianRpIjoiMjVlYjgxNzAtMWNmMS00NjI2LTgwYTUtODg3MGQ0YzQ3MTBkIiwic2lkIjoiYmVlMzUyZDgtNzcxMC00MWI5LWJjYjktYmQ3NDE0ZTczNGVjIn0.cnCMN58_3WZaPtkGSLTWshhj0nlht0wibV0FuKJwhSM",
  "access_expires_at": "2026-10-30T15:02:31.468816332Z",
  "refresh_token": "UXtvadZyk1V9oFsotgTQErFpMgJGZszcDbQaebqfDOY",
  "refresh_expires_at": "2026-10-31T02:47:31.468269417Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "16eba6ed-301c-42a1-8f60-15889ba11e35",
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
  "id": "7fef682f-ce19-42c2-a6c1-2cd9a396e357",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:52:31.766208Z",
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
  "command_id": "9b055103-b813-48f9-a3b5-d6a69e330cef",
  "quote_id": "7fef682f-ce19-42c2-a6c1-2cd9a396e357",
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
    "phone": "+380675653434"
  }
}
```

```json
{
  "id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
  "short_number": 4,
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
  "created_at": "2026-10-30T14:47:32.077753Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675653434"
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
    "id": "5f5d0bfe-e8e5-401f-8125-49e0ad6acbcb",
    "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
    "expires_at": "2026-10-30T14:47:47.083465Z",
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

`POST /api/driver/v1/offers/5f5d0bfe-e8e5-401f-8125-49e0ad6acbcb/accept` → **200**

```json
{
  "command_id": "da5f07d3-2d65-4392-a124-6b293076486b"
}
```

```json
{
  "id": "43eefc34-eb48-49b3-8880-ba0ab130baa3",
  "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7a16c4e5-b9c9-4f74-bc38-50aa68319112",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7a16c4e5-b9c9-4f74-bc38-50aa68319112",
  "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
  "assignment_id": "43eefc34-eb48-49b3-8880-ba0ab130baa3",
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
    "phone": "+380675653434"
  }
}
```

`POST /api/driver/v1/work-sessions/c98e90d9-6aee-4c3e-919c-820a6b2956b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:47:34Z",
    "sequence": 1793371654370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c98e90d9-6aee-4c3e-919c-820a6b2956b4",
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
  "last_heartbeat_at": "2026-10-30T14:47:34.390032Z",
  "last_location_at": "2026-10-30T14:47:34.390032Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7a16c4e5-b9c9-4f74-bc38-50aa68319112/arrive` → **200**

```json
{
  "command_id": "23d3fc80-227c-4244-b125-6cbda53274e7",
  "expected_version": 0
}
```

```json
{
  "id": "7a16c4e5-b9c9-4f74-bc38-50aa68319112",
  "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
  "assignment_id": "43eefc34-eb48-49b3-8880-ba0ab130baa3",
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
  "arrived_at": "2026-10-30T14:47:34.675204Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675653434"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  },
  {
    "phone": "+380675653434",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:35.943746672Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  },
  {
    "phone": "+380675653434",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:35.943746672Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675653434` → **200**

```json
[
  {
    "phone": "+380675653434",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:33.935810403Z"
  },
  {
    "phone": "+380675653434",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T14:47:35.943746672Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/7a16c4e5-b9c9-4f74-bc38-50aa68319112/start` → **200**

```json
{
  "command_id": "3e46e9b5-a980-4c59-b216-b34cd19e6ca4",
  "expected_version": 1
}
```

```json
{
  "id": "7a16c4e5-b9c9-4f74-bc38-50aa68319112",
  "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
  "assignment_id": "43eefc34-eb48-49b3-8880-ba0ab130baa3",
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
  "arrived_at": "2026-10-30T14:47:34.675204Z",
  "started_at": "2026-10-30T14:47:36.067997Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675653434"
  }
}
```

`POST /api/driver/v1/trips/7a16c4e5-b9c9-4f74-bc38-50aa68319112/complete` → **200**

```json
{
  "command_id": "086a06cf-5f65-4a8f-b25a-0b1753f7529b",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:47:36Z",
  "cash_received": true
}
```

```json
{
  "id": "7a16c4e5-b9c9-4f74-bc38-50aa68319112",
  "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
  "assignment_id": "43eefc34-eb48-49b3-8880-ba0ab130baa3",
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
  "arrived_at": "2026-10-30T14:47:34.675204Z",
  "started_at": "2026-10-30T14:47:36.067997Z",
  "completed_at": "2026-10-30T14:47:36.364129Z",
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
  "session_id": "c98e90d9-6aee-4c3e-919c-820a6b2956b4",
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
  "last_heartbeat_at": "2026-10-30T14:47:34.390032Z",
  "last_location_at": "2026-10-30T14:47:34.390032Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c98e90d9-6aee-4c3e-919c-820a6b2956b4/close` → **200**

```json
{
  "command_id": "9c980191-3397-47b9-a664-0315a3a29e69",
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
  "phone": "+380631025643",
  "device_ref": "sandbox-16543"
}
```

```json
{
  "challenge_id": "d1af4c46-2e0a-4ed9-bb8c-200e39fad979",
  "expires_at": "2026-10-30T14:52:37.2393542Z",
  "resend_available_at": "2026-10-30T14:47:38.2393542Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631025643` → **200**

```json
{
  "phone": "+380631025643",
  "audience": "CLIENT",
  "code": "639313",
  "sent_at": "2026-10-30T14:47:37.242335397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1af4c46-2e0a-4ed9-bb8c-200e39fad979",
  "code": "639313",
  "device_ref": "sandbox-16543"
}
```

```json
{
  "session_id": "1d8b8fa1-6b8b-4399-9452-6bd74542ad8a",
  "subject": {
    "type": "CLIENT",
    "id": "fc3bfc90-50fd-4730-9726-69dcb5871162"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzNiZmM5MC01MGZkLTQ3MzAtOTcyNi02OWRjYjU4NzExNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNTU3LCJpYXQiOjE3OTMzNzE2NTcsImp0aSI6IjJjOGNlMzFkLTQ5M2YtNGU4Yy1hNmQ1LTZkMzFkODY1OWQwZCIsInNpZCI6IjFkOGI4ZmExLTZiOGItNDM5OS05NDUyLTZiZDc0NTQyYWQ4YSJ9.4EabLqr0--3VpNVSnnCFBjW9WnOuTrcEKZRhKbLKRzU",
  "access_expires_at": "2026-10-30T15:02:37.550901679Z",
  "refresh_token": "3mTvFuc8Glmahh_ZW8apd9TwyZ5cqx2yXgSH7d_dwwg",
  "refresh_expires_at": "2026-11-29T14:47:37.550196249Z",
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
  "device_ref": "sandbox-22623"
}
```

```json
{
  "challenge_id": "9af1d95d-bf34-4bd5-af90-fcbab106bdc1",
  "expires_at": "2026-10-30T14:52:38.105217122Z",
  "resend_available_at": "2026-10-30T14:47:39.105217122Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "345495",
  "sent_at": "2026-10-30T14:47:38.107907354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9af1d95d-bf34-4bd5-af90-fcbab106bdc1",
  "code": "345495",
  "device_ref": "sandbox-22623"
}
```

```json
{
  "session_id": "e78ddad7-e3f9-4305-be23-3e2eb90ce194",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjU1OCwiaWF0IjoxNzkzMzcxNjU4LCJqdGkiOiIwZWMzYTE0Mi1jYzYwLTQ4ZWItODUwNS1jMzIzM2IyMzEyOTYiLCJzaWQiOiJlNzhkZGFkNy1lM2Y5LTQzMDUtYmUyMy0zZTJlYjkwY2UxOTQifQ.1NF_1RZ5NhyA_UgwY937UC5CorKF2MQFBfDECrgmmmU",
  "access_expires_at": "2026-10-30T15:02:38.414214381Z",
  "refresh_token": "PdF9xuVYCXfBBVsMhZwFL-dlbpbw7IsXzR1BAgo2m3g",
  "refresh_expires_at": "2026-11-29T14:47:38.413653311Z",
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
  "session_id": "ebbb52b3-32ef-45cb-9c09-1c5aa20b4cd9",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI1NTksImlhdCI6MTc5MzM3MTY1OSwianRpIjoiMzUwYmYwNzktZWQwYy00ZDYxLWJmZGQtZjFiMWMzOGFlMWQzIiwic2lkIjoiZWJiYjUyYjMtMzJlZi00NWNiLTljMDktMWM1YWEyMGI0Y2Q5In0.JwZzFV-h88LSjhnr1TlQvjms2zydIy9j5qMuKpDOMAE",
  "access_expires_at": "2026-10-30T15:02:39.287367864Z",
  "refresh_token": "qMlBVKgYT_CyXVuIgHR7YATQPratUFWn83D7PICx1zM",
  "refresh_expires_at": "2026-10-31T02:47:39.286882198Z",
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
  "session_id": "daac03ff-4464-42f9-873b-19f3785e1099",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI1NTksImlhdCI6MTc5MzM3MTY1OSwianRpIjoiZTA3YzE2MjEtNGVlMi00MTMyLTgyNjgtOTNmMTY0ZmQ5Y2M3Iiwic2lkIjoiZGFhYzAzZmYtNDQ2NC00MmY5LTg3M2ItMTlmMzc4NWUxMDk5In0.d0twFWhsNJmoMjYFvszdK3JH8FOi16VaguQZ-Y8Bf-g",
  "access_expires_at": "2026-10-30T15:02:39.888825089Z",
  "refresh_token": "HIFEWeh60jbSndn_T06qXTl6Ix10_RcaahzJF0Rxugw",
  "refresh_expires_at": "2026-10-31T02:47:39.888020682Z",
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
  "command_id": "d79f7c56-fa93-45a3-8589-46edf0706173",
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
  "id": "a3755e51-632e-4d94-be7c-0c44d6696524",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:52:40.460667Z",
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
  "command_id": "9e7457ce-9601-4566-8d93-f239acc5916c",
  "quote_id": "a3755e51-632e-4d94-be7c-0c44d6696524",
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
  "id": "fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc3bfc90-50fd-4730-9726-69dcb5871162",
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
  "created_at": "2026-10-30T14:47:40.756012Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd` → **200**

```json
{
  "id": "fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc3bfc90-50fd-4730-9726-69dcb5871162",
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
  "created_at": "2026-10-30T14:47:40.756012Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd/cancel` → **200**

```json
{
  "command_id": "3d405073-bfb2-4ed7-b1f3-a438604c43ca",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fc3bfc90-50fd-4730-9726-69dcb5871162",
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
  "created_at": "2026-10-30T14:47:40.756012Z",
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
  "command_id": "e290a397-3ebe-4247-a0b1-04fc55da466e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:47:41Z",
    "sequence": 1793371661965
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "825f249f-b10f-4ba5-9f48-9caa3f795738",
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
  "last_heartbeat_at": "2026-10-30T14:47:41.983962Z",
  "last_location_at": "2026-10-30T14:47:41.983962Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17116"
}
```

```json
{
  "challenge_id": "6048e82c-5b91-4e0b-9eea-7c7ca3fba62b",
  "expires_at": "2026-10-30T14:52:42.26765972Z",
  "resend_available_at": "2026-10-30T14:47:43.26765972Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "130992",
  "sent_at": "2026-10-30T14:47:42.2715296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6048e82c-5b91-4e0b-9eea-7c7ca3fba62b",
  "code": "130992",
  "device_ref": "sandbox-17116"
}
```

```json
{
  "session_id": "aadbb346-9917-467d-ab8a-bc458c04387f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjU2MiwiaWF0IjoxNzkzMzcxNjYyLCJqdGkiOiJjMGFkNTU4Ny0xYzMwLTQ1YjMtODRhMi1lOTJjOTk5YWQ4NmEiLCJzaWQiOiJhYWRiYjM0Ni05OTE3LTQ2N2QtYWI4YS1iYzQ1OGMwNDM4N2YifQ.eDKg84nZWO-fL13k-G9HvbeETygn5lbAuc-1u1eduDo",
  "access_expires_at": "2026-10-30T15:02:42.5790505Z",
  "refresh_token": "wQ0m_70XpE5rjTDNN8YUnDddOBFrmAPAQBjxIWAV7mg",
  "refresh_expires_at": "2026-11-29T14:47:42.578530625Z",
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
  "command_id": "e64ec8a6-7fbf-45f7-b24b-0b34f93dd22b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:47:43Z",
    "sequence": 1793371663144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:47:43.163389Z",
  "last_location_at": "2026-10-30T14:47:43.163389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7ce63419-e646-47dc-897b-6531ce886bab",
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
  "id": "19e7a30f-6f44-4ecb-8f31-137e39f700ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:52:43.451905Z",
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
  "command_id": "786c0691-a7e3-4ad3-a8a0-3bf967e1b278",
  "quote_id": "19e7a30f-6f44-4ecb-8f31-137e39f700ac",
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
  "id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc3bfc90-50fd-4730-9726-69dcb5871162",
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
  "created_at": "2026-10-30T14:47:43.745125Z",
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
    "id": "945d5670-aad1-41ae-a7ce-b1742b90d34c",
    "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
    "expires_at": "2026-10-30T14:47:58.748966Z",
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

`POST /api/driver/v1/offers/945d5670-aad1-41ae-a7ce-b1742b90d34c/accept` → **200**

```json
{
  "command_id": "70791242-8859-4a0c-8492-e8ab0cb0fcb5"
}
```

```json
{
  "id": "c157a7cb-f3a5-4592-84cb-bf49a2bc65be",
  "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "abb8114f-e429-4d99-b51c-17a21c47d23e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "abb8114f-e429-4d99-b51c-17a21c47d23e",
  "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "assignment_id": "c157a7cb-f3a5-4592-84cb-bf49a2bc65be",
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

`POST /api/driver/v1/trips/abb8114f-e429-4d99-b51c-17a21c47d23e/cancel` → **200**

```json
{
  "command_id": "3f719755-7759-4d92-87b5-fe75cfc016dd",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "abb8114f-e429-4d99-b51c-17a21c47d23e",
  "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "assignment_id": "c157a7cb-f3a5-4592-84cb-bf49a2bc65be",
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

`GET /api/rider/v1/orders/44c221f4-c736-4c3b-b0a9-dd177725a27a` → **200**

```json
{
  "id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fc3bfc90-50fd-4730-9726-69dcb5871162",
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
    "id": "c157a7cb-f3a5-4592-84cb-bf49a2bc65be",
    "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "abb8114f-e429-4d99-b51c-17a21c47d23e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:47:43.745125Z",
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
    "id": "4ce9f8c2-c543-4a60-aee2-47ff79518d55",
    "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
    "expires_at": "2026-10-30T14:47:59.903116Z",
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

`POST /api/driver/v1/offers/4ce9f8c2-c543-4a60-aee2-47ff79518d55/accept` → **200**

```json
{
  "command_id": "4b4bc97c-719c-4ca5-a4ad-c4ee29d43f44"
}
```

```json
{
  "id": "65dc81d7-4924-4fba-aa4e-30b03747d92f",
  "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "581da967-5857-4212-8505-3758ca48fc77",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "581da967-5857-4212-8505-3758ca48fc77",
  "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "assignment_id": "65dc81d7-4924-4fba-aa4e-30b03747d92f",
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

`POST /api/driver/v1/trips/581da967-5857-4212-8505-3758ca48fc77/cancel` → **200**

```json
{
  "command_id": "e6162d1f-88ed-4b73-87e0-e161cf551b16",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "581da967-5857-4212-8505-3758ca48fc77",
  "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
  "assignment_id": "65dc81d7-4924-4fba-aa4e-30b03747d92f",
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
    "id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:47:43.745125Z",
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
    "id": "fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:47:40.756012Z",
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

`GET /api/operator/v1/orders/44c221f4-c736-4c3b-b0a9-dd177725a27a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:47:43.745816Z",
      "actor": {
        "type": "CLIENT",
        "id": "fc3bfc90-50fd-4730-9726-69dcb5871162",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
        "quote_id": "19e7a30f-6f44-4ecb-8f31-137e39f700ac",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "41482ff1-dcbb-4c9d-9268-cd1be9c788eb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:47:43.748026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
        "attempt_id": "9aa0c6ae-739c-4c2c-a5ad-3df28b1d5ec0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "41482ff1-dcbb-4c9d-9268-cd1be9c788eb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:47:43.756059Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "945d5670-aad1-41ae-a7ce-b1742b90d34c",
        "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "41482ff1-dcbb-4c9d-9268-cd1be9c788eb"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:47:44.330204Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "945d5670-aad1-41ae-a7ce-b1742b90d34c",
        "order_id": "44c221f4-c736-4c3b-b0a9-dd177725a27a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c157a7cb-f3a5-4592-84cb-bf49a2bc65be"
      },
      "correlation_id": "1e4a8522-fcd9-4849-9bb1-0b37b5c2e33b"
```

Done: orders fa97aa1c-ea66-4165-aaa3-7f47fc9bd4cd, 44c221f4-c736-4c3b-b0a9-dd177725a27a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731152989",
  "device_ref": "sandbox-21941"
}
```

```json
{
  "challenge_id": "07ccddad-932d-421a-af2e-5b93a4731288",
  "expires_at": "2026-10-30T14:52:47.203868466Z",
  "resend_available_at": "2026-10-30T14:47:48.203868466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731152989` → **200**

```json
{
  "phone": "+380731152989",
  "audience": "CLIENT",
  "code": "086365",
  "sent_at": "2026-10-30T14:47:47.206539991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07ccddad-932d-421a-af2e-5b93a4731288",
  "code": "086365",
  "device_ref": "sandbox-21941"
}
```

```json
{
  "session_id": "3d50dd92-5b81-46a6-92c9-1a6019891120",
  "subject": {
    "type": "CLIENT",
    "id": "b3359b42-3378-436b-96aa-95695c6be1a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzM1OWI0Mi0zMzc4LTQzNmItOTZhYS05NTY5NWM2YmUxYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNTY3LCJpYXQiOjE3OTMzNzE2NjcsImp0aSI6Ijc5MDY0NWFlLWI1MzMtNGNkNy05ZjA1LWE0YWRhODQ2MDY2YiIsInNpZCI6IjNkNTBkZDkyLTViODEtNDZhNi05MmM5LTFhNjAxOTg5MTEyMCJ9.CTn_CBlilZxkPqKvdRfGTYd2LPKXkREpaQm6_shSTrY",
  "access_expires_at": "2026-10-30T15:02:47.511749368Z",
  "refresh_token": "M0ZEDAOghRqM4s-aEWkLCNeGJfZla4G37FFWxKSGK0o",
  "refresh_expires_at": "2026-11-29T14:47:47.510874031Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4d57a7c8-0179-450a-aa48-7a158995bd12",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0184c340-8db8-4cab-a9e7-42f28275d704",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0184c340-8db8-4cab-a9e7-42f28275d704",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a4b34dcb0f1a6069d9766f26d0ef15a9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0184c340-8db8-4cab-a9e7-42f28275d704",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731152989"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0184c340-8db8-4cab-a9e7-42f28275d704",
  "expires_at": "2026-10-30T15:17:47.800737Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0184c340-8db8-4cab-a9e7-42f28275d704` → **200**

```json
{
  "id": "0184c340-8db8-4cab-a9e7-42f28275d704",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:17:47.800737Z",
  "card": {
    "id": "2ad05dd7-d82b-46ac-bd70-6fb65bc21f00",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0131",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:47:48.096115Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "2ad05dd7-d82b-46ac-bd70-6fb65bc21f00",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0131",
      "card_type": "Visa",
      "created_at": "2026-10-30T14:47:48.096115Z"
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
  "device_ref": "sandbox-11230"
}
```

```json
{
  "challenge_id": "4d62c895-dd9e-4c26-a404-af3adb86433e",
  "expires_at": "2026-10-30T14:52:48.667108309Z",
  "resend_available_at": "2026-10-30T14:47:49.667108309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "433779",
  "sent_at": "2026-10-30T14:47:48.670606978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d62c895-dd9e-4c26-a404-af3adb86433e",
  "code": "433779",
  "device_ref": "sandbox-11230"
}
```

```json
{
  "session_id": "e714ae1b-c9be-44bd-8e63-901b6285b32e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjU2OCwiaWF0IjoxNzkzMzcxNjY4LCJqdGkiOiI0ODE4YWU0Yi1iYWM3LTQ1OGUtYWNhZi01ODUwMWE0MmJmMmEiLCJzaWQiOiJlNzE0YWUxYi1jOWJlLTQ0YmQtOGU2My05MDFiNjI4NWIzMmUifQ.0j9Sq9becyTugG2yGfKlC2znOw_KF3OGyn9br6LwvDc",
  "access_expires_at": "2026-10-30T15:02:48.967003674Z",
  "refresh_token": "fFncZ8AxmTsapwGzpAFjJ-Q4lE78kndCgnRAmUJRW1c",
  "refresh_expires_at": "2026-11-29T14:47:48.966527149Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:47:43.163389Z",
  "last_location_at": "2026-10-30T14:47:43.163389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f913ba08-3eb1-4146-8609-5779c015d4a1/handover` → **200**

```json
{
  "command_id": "54cf41ee-5f70-4642-8634-ebc4d4d22a39",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:47:43.163389Z",
  "last_location_at": "2026-10-30T14:47:43.163389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 43 s to the next point)

`POST /api/driver/v1/work-sessions/f913ba08-3eb1-4146-8609-5779c015d4a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:48:32Z",
    "sequence": 1793371712828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:48:32.848434Z",
  "last_location_at": "2026-10-30T14:48:32.848434Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1aa2653-0a91-4204-8c76-e02ae0c450ed",
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
  "id": "6f0d1500-e33e-478d-bacc-0a32408f7f80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:53:33.146528Z",
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
  "command_id": "17cb36ce-def9-4d96-bb6b-65f260792c36",
  "quote_id": "6f0d1500-e33e-478d-bacc-0a32408f7f80",
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
  "id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
  "created_at": "2026-10-30T14:48:33.441713Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361` → **200**

```json
{
  "id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
  "created_at": "2026-10-30T14:48:33.441713Z",
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
    "id": "5516c13e-8d10-4b2a-be46-238947b7ce40",
    "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
    "expires_at": "2026-10-30T14:48:48.577902Z",
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

`POST /api/driver/v1/offers/5516c13e-8d10-4b2a-be46-238947b7ce40/accept` → **200**

```json
{
  "command_id": "57faaa35-6cb6-4ac5-b961-f8d57c14d7d7"
}
```

```json
{
  "id": "fe87ef73-364b-45c3-8018-42c5bc532726",
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "assignment_id": "fe87ef73-364b-45c3-8018-42c5bc532726",
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

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/f913ba08-3eb1-4146-8609-5779c015d4a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:48:41Z",
    "sequence": 1793371721900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:48:41.918215Z",
  "last_location_at": "2026-10-30T14:48:41.918215Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4f26e506-01b1-4a4a-8f77-0f7397612569/arrive` → **200**

```json
{
  "command_id": "926ee901-d6c4-4a80-b1d1-3e073de9c6f1",
  "expected_version": 0
}
```

```json
{
  "id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "assignment_id": "fe87ef73-364b-45c3-8018-42c5bc532726",
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
  "arrived_at": "2026-10-30T14:48:42.215812Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4f26e506-01b1-4a4a-8f77-0f7397612569/start` → **200**

```json
{
  "command_id": "68bf686d-78d4-4b12-b73d-21224ab0c4ad",
  "expected_version": 1
}
```

```json
{
  "id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "assignment_id": "fe87ef73-364b-45c3-8018-42c5bc532726",
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
  "arrived_at": "2026-10-30T14:48:42.215812Z",
  "started_at": "2026-10-30T14:48:42.51929Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4f26e506-01b1-4a4a-8f77-0f7397612569/complete` → **200**

```json
{
  "command_id": "0d51e617-01b3-4323-bdc6-0d817c477cc5",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:48:42Z",
  "cash_received": true
}
```

```json
{
  "id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "assignment_id": "fe87ef73-364b-45c3-8018-42c5bc532726",
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
  "arrived_at": "2026-10-30T14:48:42.215812Z",
  "started_at": "2026-10-30T14:48:42.51929Z",
  "completed_at": "2026-10-30T14:48:42.815965Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361` → **200**

```json
{
  "id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
    "id": "fe87ef73-364b-45c3-8018-42c5bc532726",
    "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:48:33.441713Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361` → **200**

```json
{
  "id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
    "id": "fe87ef73-364b-45c3-8018-42c5bc532726",
    "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:48:33.441713Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361` → **200**

```json
{
  "id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
    "id": "fe87ef73-364b-45c3-8018-42c5bc532726",
    "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4f26e506-01b1-4a4a-8f77-0f7397612569",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:48:33.441713Z",
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

`GET /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361/tip` → **200**

```json
{
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
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
  "available_until": "2026-10-31T14:48:42.815965Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361/tip` → **201**

```json
{
  "command_id": "b9e9deed-5279-469b-a441-b4ba6b540a06",
  "amount_minor": 2500
}
```

```json
{
  "id": "0ed06585-5426-4afe-a8c9-7af8fde861dd",
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T14:48:46.549951Z"
}
```

`GET /api/rider/v1/orders/86b959b7-b931-4d21-9f8e-5497933da361/tip` → **200**

```json
{
  "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
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
  "available_until": "2026-10-31T14:48:42.815965Z",
  "open": false,
  "tip": {
    "id": "0ed06585-5426-4afe-a8c9-7af8fde861dd",
    "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T14:48:46.549951Z"
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
      "id": "83c0f84b-0794-4799-96ce-aca142c2181a",
      "at": "2026-10-30T14:48:43.657651Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
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
      "id": "9dc5f8ac-25c6-4934-b815-c020185d17d7",
      "at": "2026-10-30T14:48:47.720459Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
      "counterpart_id": null
    },
    {
      "id": "83c0f84b-0794-4799-96ce-aca142c2181a",
      "at": "2026-10-30T14:48:43.657651Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "505667b9-30d5-4b6c-93ae-07cc0e7945bf",
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
  "id": "77c161d8-7e2d-4e92-89ae-ff8a9931836b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:53:48.711218Z",
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
  "session_id": "6cba447e-6bc7-4aeb-b2d4-eb824ed188f2",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI2MjksImlhdCI6MTc5MzM3MTcyOSwianRpIjoiNzNmMjYyYzEtOGViYS00Y2ZkLWJjN2QtNTY1ZTBiMjI1NGVjIiwic2lkIjoiNmNiYTQ0N2UtNmJjNy00YWViLWIyZDQtZWI4MjRlZDE4OGYyIn0.diIbc61bi1iD12vZ2e3P4Gb77MWBRarO86hINOnyDgE",
  "access_expires_at": "2026-10-30T15:03:49.323216467Z",
  "refresh_token": "XsBD3Ks2dcWWBnotC5Hz44-3swweXLQp9spyzZrt9ms",
  "refresh_expires_at": "2026-10-31T02:48:49.322677328Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731152989` → **200**

```json
{
  "client_id": "b3359b42-3378-436b-96aa-95695c6be1a2"
}
```

`POST /api/admin/v1/rider-wallets/b3359b42-3378-436b-96aa-95695c6be1a2/top-ups` → **201**

```json
{
  "command_id": "956adb10-ac6e-4dce-89b8-8671e1d00271",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
      "id": "8d62efb7-072f-414c-b636-4e505047fbf0",
      "at": "2026-10-30T14:48:49.8808Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "54328223-a2c1-4744-a7a1-e7597a4435c9",
  "quote_id": "77c161d8-7e2d-4e92-89ae-ff8a9931836b",
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
  "id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
  "created_at": "2026-10-30T14:48:50.176168Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4e650e14-4789-4ff6-8447-3e028a6e8765` → **200**

```json
{
  "id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
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
  "created_at": "2026-10-30T14:48:50.176168Z",
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
    "id": "326f79eb-de7f-4fab-a839-6f531716bd95",
    "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
    "expires_at": "2026-10-30T14:49:05.18032Z",
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

`POST /api/driver/v1/offers/326f79eb-de7f-4fab-a839-6f531716bd95/accept` → **200**

```json
{
  "command_id": "ce9ef2a0-a3b5-42ad-bd02-ed936be6431f"
}
```

```json
{
  "id": "3fde2ba3-a055-433d-ab94-04884491ac97",
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "06597e4d-8c43-4ddb-91ac-ce24d3136a2c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "06597e4d-8c43-4ddb-91ac-ce24d3136a2c",
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "assignment_id": "3fde2ba3-a055-433d-ab94-04884491ac97",
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

`POST /api/driver/v1/work-sessions/f913ba08-3eb1-4146-8609-5779c015d4a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:48:51Z",
    "sequence": 1793371731620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:48:51.638861Z",
  "last_location_at": "2026-10-30T14:48:51.638861Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/06597e4d-8c43-4ddb-91ac-ce24d3136a2c/arrive` → **200**

```json
{
  "command_id": "cf1272e6-cbf4-4e6e-9ce5-8c4adf9a1e16",
  "expected_version": 0
}
```

```json
{
  "id": "06597e4d-8c43-4ddb-91ac-ce24d3136a2c",
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "assignment_id": "3fde2ba3-a055-433d-ab94-04884491ac97",
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
  "arrived_at": "2026-10-30T14:48:51.930701Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/06597e4d-8c43-4ddb-91ac-ce24d3136a2c/start` → **200**

```json
{
  "command_id": "3914e0e4-2b97-4585-bbf4-3bdbb700c753",
  "expected_version": 1
}
```

```json
{
  "id": "06597e4d-8c43-4ddb-91ac-ce24d3136a2c",
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "assignment_id": "3fde2ba3-a055-433d-ab94-04884491ac97",
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
  "arrived_at": "2026-10-30T14:48:51.930701Z",
  "started_at": "2026-10-30T14:48:52.222591Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/06597e4d-8c43-4ddb-91ac-ce24d3136a2c/complete` → **200**

```json
{
  "command_id": "c23536e0-5f7e-43c1-a69a-db4f8514f109",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:48:52Z",
  "cash_received": true
}
```

```json
{
  "id": "06597e4d-8c43-4ddb-91ac-ce24d3136a2c",
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "assignment_id": "3fde2ba3-a055-433d-ab94-04884491ac97",
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
  "arrived_at": "2026-10-30T14:48:51.930701Z",
  "started_at": "2026-10-30T14:48:52.222591Z",
  "completed_at": "2026-10-30T14:48:52.521494Z",
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
  "client_id": "b3359b42-3378-436b-96aa-95695c6be1a2",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "5abe22c4-1065-49c6-a17b-43fddefe994e",
      "at": "2026-10-30T14:48:52.772464Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765"
    },
    {
      "id": "8d62efb7-072f-414c-b636-4e505047fbf0",
      "at": "2026-10-30T14:48:49.8808Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
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

`GET /api/rider/v1/orders/4e650e14-4789-4ff6-8447-3e028a6e8765/tip` → **200**

```json
{
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
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
  "available_until": "2026-10-31T14:48:52.521494Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4e650e14-4789-4ff6-8447-3e028a6e8765/tip` → **201**

```json
{
  "command_id": "51b8efa5-b2bf-48fd-a192-db3a5d1e2c14",
  "amount_minor": 2500
}
```

```json
{
  "id": "6a6f5f02-7130-4315-b888-1f1c93825d15",
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T14:48:53.683755Z"
}
```

`GET /api/rider/v1/orders/4e650e14-4789-4ff6-8447-3e028a6e8765/tip` → **200**

```json
{
  "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
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
  "available_until": "2026-10-31T14:48:52.521494Z",
  "open": false,
  "tip": {
    "id": "6a6f5f02-7130-4315-b888-1f1c93825d15",
    "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T14:48:53.683755Z"
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
      "id": "ceb4b8cd-8142-466e-bb20-e5fc2de97dc3",
      "at": "2026-10-30T14:48:52.764584Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
      "counterpart_id": null
    },
    {
      "id": "9dc5f8ac-25c6-4934-b815-c020185d17d7",
      "at": "2026-10-30T14:48:47.720459Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
      "counterpart_id": null
    },
    {
      "id": "83c0f84b-0794-4799-96ce-aca142c2181a",
      "at": "2026-10-30T14:48:43.657651Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
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
      "id": "0a99f26b-da70-42ee-9f4f-7e1106dab3cb",
      "at": "2026-10-30T14:48:54.796572Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
      "counterpart_id": null
    },
    {
      "id": "ceb4b8cd-8142-466e-bb20-e5fc2de97dc3",
      "at": "2026-10-30T14:48:52.764584Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4e650e14-4789-4ff6-8447-3e028a6e8765",
      "counterpart_id": null
    },
    {
      "id": "9dc5f8ac-25c6-4934-b815-c020185d17d7",
      "at": "2026-10-30T14:48:47.720459Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
      "counterpart_id": null
    },
    {
      "id": "83c0f84b-0794-4799-96ce-aca142c2181a",
      "at": "2026-10-30T14:48:43.657651Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "86b959b7-b931-4d21-9f8e-5497933da361",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f913ba08-3eb1-4146-8609-5779c015d4a1",
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
  "last_heartbeat_at": "2026-10-30T14:48:51.638861Z",
  "last_location_at": "2026-10-30T14:48:51.638861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f913ba08-3eb1-4146-8609-5779c015d4a1/close` → **200**

```json
{
  "command_id": "454c7058-6e66-48f7-b1fb-a0cc63a0a19f",
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

Done: card order 4e650e14-4789-4ff6-8447-3e028a6e8765.

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
  "phone": "+380738916560",
  "device_ref": "sandbox-29092"
}
```

```json
{
  "challenge_id": "38e7bf10-6ad1-40fd-ac39-ba707edf6c6d",
  "expires_at": "2026-10-30T14:53:56.662158543Z",
  "resend_available_at": "2026-10-30T14:48:57.662158543Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738916560` → **200**

```json
{
  "phone": "+380738916560",
  "audience": "CLIENT",
  "code": "290426",
  "sent_at": "2026-10-30T14:48:56.664792092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38e7bf10-6ad1-40fd-ac39-ba707edf6c6d",
  "code": "290426",
  "device_ref": "sandbox-29092"
}
```

```json
{
  "session_id": "5838a593-f8c6-48cc-aa23-a95bc53ee824",
  "subject": {
    "type": "CLIENT",
    "id": "3c8e3cc3-d9c2-4904-a1ce-2e5d81a93ef4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhlM2NjMy1kOWMyLTQ5MDQtYTFjZS0yZTVkODFhOTNlZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNjM2LCJpYXQiOjE3OTMzNzE3MzYsImp0aSI6IjQ4MzNiN2E4LTBkZTctNGUxZi04YmU5LWRjZmQ4MTU2NWE3OCIsInNpZCI6IjU4MzhhNTkzLWY4YzYtNDhjYy1hYTIzLWE5NWJjNTNlZTgyNCJ9.itRNWLqVxKnoSdmIy1n0weuxVHdSYsmNVS6UYRTGeyw",
  "access_expires_at": "2026-10-30T15:03:56.975220294Z",
  "refresh_token": "asz2AWVzLEAs3DO_j5pKwLQhvQj0KHzpLFk7Ts5UUTQ",
  "refresh_expires_at": "2026-11-29T14:48:56.974567543Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "f6aa47e2-05b8-4a1c-adaf-12182e921f1a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "ce4ef5e9-c0a4-4aa6-b46d-132c90c431fc",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ce4ef5e9-c0a4-4aa6-b46d-132c90c431fc",
    "orderDate": "1793371737",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "78f47488be0365c609f2e42f363dc75b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ce4ef5e9-c0a4-4aa6-b46d-132c90c431fc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738916560"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ce4ef5e9-c0a4-4aa6-b46d-132c90c431fc",
  "created_at": "2026-10-30T14:48:57.265392Z",
  "expires_at": "2026-10-30T15:18:57.265392Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/ce4ef5e9-c0a4-4aa6-b46d-132c90c431fc` → **200**

```json
{
  "id": "ce4ef5e9-c0a4-4aa6-b46d-132c90c431fc",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T14:48:57.265392Z",
  "expires_at": "2026-10-30T15:18:57.265392Z",
  "completed_at": "2026-10-30T14:48:57.552113Z",
  "masked_pan": "41****9563",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3c8e3cc3-d9c2-4904-a1ce-2e5d81a93ef4",
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
      "id": "6e3d4194-03cb-4110-a7d8-69714da34614",
      "at": "2026-10-30T14:48:57.818131Z",
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
  "client_id": "3c8e3cc3-d9c2-4904-a1ce-2e5d81a93ef4",
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
      "id": "6e3d4194-03cb-4110-a7d8-69714da34614",
      "at": "2026-10-30T14:48:57.818131Z",
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
  "device_ref": "sandbox-2740"
}
```

```json
{
  "challenge_id": "993d5857-7146-4d26-aa4d-ad21bafd1174",
  "expires_at": "2026-10-30T14:53:58.420386782Z",
  "resend_available_at": "2026-10-30T14:48:59.420386782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "016814",
  "sent_at": "2026-10-30T14:48:58.422739336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "993d5857-7146-4d26-aa4d-ad21bafd1174",
  "code": "016814",
  "device_ref": "sandbox-2740"
}
```

```json
{
  "session_id": "0e0f2d93-cb64-4bfe-a3ba-ab7232215d18",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjYzOCwiaWF0IjoxNzkzMzcxNzM4LCJqdGkiOiJhMzY3MmU2NS1mZDg0LTQ5NzUtYWJmOC0xZWM1YmViNTFjMTMiLCJzaWQiOiIwZTBmMmQ5My1jYjY0LTRiZmUtYTNiYS1hYjcyMzIyMTVkMTgifQ.U3yi3uu5aKIXeytzx-wqeQVn8L70lGp9qL8eY7n5RPs",
  "access_expires_at": "2026-10-30T15:03:58.726906479Z",
  "refresh_token": "X2h5-HJpbST6qMY6XpAcpZmnpvGzDLVRbRjV6DFODv4",
  "refresh_expires_at": "2026-11-29T14:48:58.72639729Z",
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
  "command_id": "65731862-d709-4c8b-8860-d5968138e421",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "46072267-c693-49d8-a7a7-188e5fb3b384",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-46072267-c693-49d8-a7a7-188e5fb3b384",
    "orderDate": "1793371739",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "f412e226510556c50ddb1cdf5addbe28",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=46072267-c693-49d8-a7a7-188e5fb3b384",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=46072267-c693-49d8-a7a7-188e5fb3b384",
  "created_at": "2026-10-30T14:48:59.277802Z",
  "expires_at": "2026-10-30T15:18:59.277802Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/46072267-c693-49d8-a7a7-188e5fb3b384` → **200**

```json
{
  "id": "46072267-c693-49d8-a7a7-188e5fb3b384",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T14:48:59.277802Z",
  "expires_at": "2026-10-30T15:18:59.277802Z",
  "completed_at": "2026-10-30T14:48:59.554558Z",
  "masked_pan": "41****3114",
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
      "id": "8b2a4116-875e-4795-9c13-2e7d4aea2fac",
      "at": "2026-10-30T14:48:59.826291Z",
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
  "command_id": "42a32407-9dab-4ede-973a-10c906d72c19",
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
  "correlation_id": "1117928a-eb96-4e4f-966f-a9e898f81f74"
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
  "device_ref": "sandbox-18234"
}
```

```json
{
  "challenge_id": "5dc89564-e915-43bf-b1bd-2bb0a0d6b793",
  "expires_at": "2026-10-30T14:54:00.419379454Z",
  "resend_available_at": "2026-10-30T14:49:01.419379454Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "710462",
  "sent_at": "2026-10-30T14:49:00.422467371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dc89564-e915-43bf-b1bd-2bb0a0d6b793",
  "code": "710462",
  "device_ref": "sandbox-18234"
}
```

```json
{
  "session_id": "ef140306-68e9-4fd8-be31-d964e0d66b50",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjY0MCwiaWF0IjoxNzkzMzcxNzQwLCJqdGkiOiJhYTEzY2NkZC04MTA1LTRkNTMtOWZhOS1iNmUxNzI3MDliNjkiLCJzaWQiOiJlZjE0MDMwNi02OGU5LTRmZDgtYmUzMS1kOTY0ZTBkNjZiNTAifQ.VfRws3J_AtdGW3ZZfyP9meaIa-OK4viq8-s2rYkrClE",
  "access_expires_at": "2026-10-30T15:04:00.724794381Z",
  "refresh_token": "ck61UMJHPLtEKo4GphoED4-xTKjvYFKu5QnLHewVHbQ",
  "refresh_expires_at": "2026-11-29T14:49:00.724104263Z",
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
  "command_id": "60fd5669-f1d9-48b3-8019-67e0a856468a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:49:01Z",
    "sequence": 1793371741293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4beec4aa-a694-465c-ab63-545f5270eecf",
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
  "last_heartbeat_at": "2026-10-30T14:49:01.311175Z",
  "last_location_at": "2026-10-30T14:49:01.311175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634406017",
  "device_ref": "sandbox-31724"
}
```

```json
{
  "challenge_id": "dfc79cb6-605b-4c30-936d-5406804f1d23",
  "expires_at": "2026-10-30T14:54:01.595746345Z",
  "resend_available_at": "2026-10-30T14:49:02.595746345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634406017` → **200**

```json
{
  "phone": "+380634406017",
  "audience": "CLIENT",
  "code": "544028",
  "sent_at": "2026-10-30T14:49:01.598766293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfc79cb6-605b-4c30-936d-5406804f1d23",
  "code": "544028",
  "device_ref": "sandbox-31724"
}
```

```json
{
  "session_id": "55085755-cddc-48d9-aba5-d3699f417c34",
  "subject": {
    "type": "CLIENT",
    "id": "ea0dec9e-8dc4-42aa-85c6-a48458f61a2e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYTBkZWM5ZS04ZGM0LTQyYWEtODVjNi1hNDg0NThmNjFhMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNjQxLCJpYXQiOjE3OTMzNzE3NDEsImp0aSI6ImM5MzQzYmMzLTEwZDktNDI2Ny1iZmYyLWU1ODFhMGU3ZTZiOCIsInNpZCI6IjU1MDg1NzU1LWNkZGMtNDhkOS1hYmE1LWQzNjk5ZjQxN2MzNCJ9.ZomOopbcL5mubrwFJnG4cc-uPAutNXZewzdHXVUh1zE",
  "access_expires_at": "2026-10-30T15:04:01.90245106Z",
  "refresh_token": "SyICz6YaBbB8gIUQq0c4RfgF68OEifbgDfq6clmQB9s",
  "refresh_expires_at": "2026-11-29T14:49:01.901871736Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e41e0635-8c2a-4820-87f2-5f14b1dbce0b",
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
  "id": "769776df-5ff8-4333-8181-0e072bb99aec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:54:02.190668Z",
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
  "command_id": "ffcbef71-93eb-4104-80d0-ee5cb1a4a072",
  "quote_id": "769776df-5ff8-4333-8181-0e072bb99aec",
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
  "id": "8256eb72-5586-4514-87af-1f00364a486e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ea0dec9e-8dc4-42aa-85c6-a48458f61a2e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:49:02.482495Z",
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
    "id": "556586ec-880c-4896-bf23-6d5259479b53",
    "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
    "expires_at": "2026-10-30T14:49:17.485225Z",
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

`POST /api/driver/v1/offers/556586ec-880c-4896-bf23-6d5259479b53/accept` → **200**

```json
{
  "command_id": "02d9277f-1a78-42f0-9a17-e85f132f0fbc"
}
```

```json
{
  "id": "bd4e007e-6ef2-4960-83f6-4e6e185d826a",
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5c9291e-67ad-4487-b69b-59dea37f0cb7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5c9291e-67ad-4487-b69b-59dea37f0cb7",
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "assignment_id": "bd4e007e-6ef2-4960-83f6-4e6e185d826a",
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

`POST /api/driver/v1/work-sessions/4beec4aa-a694-465c-ab63-545f5270eecf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:49:03Z",
    "sequence": 1793371743639
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4beec4aa-a694-465c-ab63-545f5270eecf",
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
  "last_heartbeat_at": "2026-10-30T14:49:03.656966Z",
  "last_location_at": "2026-10-30T14:49:03.656966Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/d5c9291e-67ad-4487-b69b-59dea37f0cb7/arrive` → **200**

```json
{
  "command_id": "42a3de00-5a68-4cf5-83b1-598559453bac",
  "expected_version": 0
}
```

```json
{
  "id": "d5c9291e-67ad-4487-b69b-59dea37f0cb7",
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "assignment_id": "bd4e007e-6ef2-4960-83f6-4e6e185d826a",
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
  "arrived_at": "2026-10-30T14:49:03.969914Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d5c9291e-67ad-4487-b69b-59dea37f0cb7/start` → **200**

```json
{
  "command_id": "c4fdceed-2928-41ae-a354-41f7522552d3",
  "expected_version": 1
}
```

```json
{
  "id": "d5c9291e-67ad-4487-b69b-59dea37f0cb7",
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "assignment_id": "bd4e007e-6ef2-4960-83f6-4e6e185d826a",
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
  "arrived_at": "2026-10-30T14:49:03.969914Z",
  "started_at": "2026-10-30T14:49:04.284186Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d5c9291e-67ad-4487-b69b-59dea37f0cb7/complete` → **200**

```json
{
  "command_id": "33b2f797-b5d3-472d-ac0b-ab2ccef54fc7",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:49:04Z",
  "cash_received": false
}
```

```json
{
  "id": "d5c9291e-67ad-4487-b69b-59dea37f0cb7",
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "assignment_id": "bd4e007e-6ef2-4960-83f6-4e6e185d826a",
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
  "arrived_at": "2026-10-30T14:49:03.969914Z",
  "started_at": "2026-10-30T14:49:04.284186Z",
  "completed_at": "2026-10-30T14:49:04.577057Z",
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
  "session_id": "423d2a97-c69d-452e-8002-2d984b4e12e1",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI2NDUsImlhdCI6MTc5MzM3MTc0NSwianRpIjoiZGNiZmVmN2UtY2U4Mi00OGUwLWFkYWMtMzRlMTljODlkYTg2Iiwic2lkIjoiNDIzZDJhOTctYzY5ZC00NTJlLTgwMDItMmQ5ODRiNGUxMmUxIn0.0aKxvtTUwuO2GBplzoDT5EKG_5AQRvi8xgDbN_2ffsc",
  "access_expires_at": "2026-10-30T15:04:05.185416956Z",
  "refresh_token": "XVRIiWHIaJKEJWyF-ss3mNbT5mYRyBOvr456OYkqt6Q",
  "refresh_expires_at": "2026-10-31T02:49:05.184924522Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8256eb72-5586-4514-87af-1f00364a486e/cash-dispute` → **200**

```json
{
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "ea0dec9e-8dc4-42aa-85c6-a48458f61a2e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T14:49:04.880874Z",
  "decide_by": "2026-11-13T14:49:04.880874Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T14:49:04.880874Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "ea0dec9e-8dc4-42aa-85c6-a48458f61a2e",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T14:49:04.880874Z",
      "decide_by": "2026-11-13T14:49:04.880874Z",
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

`POST /api/admin/v1/orders/8256eb72-5586-4514-87af-1f00364a486e/cash-dispute/decide` → **400**

```json
{
  "command_id": "b543e97d-a882-479b-84f6-b59410106964",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/8256eb72-5586-4514-87af-1f00364a486e/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9e6cd548-bdf6-4cd8-8bc6-4c4e26e4d227",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/8256eb72-5586-4514-87af-1f00364a486e/cash-dispute/decide` → **200**

```json
{
  "command_id": "a7b7c7ec-d019-4fad-9504-7ebb76d08bf7",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "ea0dec9e-8dc4-42aa-85c6-a48458f61a2e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T14:49:04.880874Z",
  "decide_by": "2026-11-13T14:49:04.880874Z",
  "decision": "PAY_DRIVER",
  "decided_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T14:49:06.35569Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/8256eb72-5586-4514-87af-1f00364a486e/cash-dispute/decide` → **409**

```json
{
  "command_id": "facfb388-6e53-4778-9152-5f2bbe1448c5",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8256eb72-5586-4514-87af-1f00364a486e/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "17bf1d17-9f43-4f54-bddd-3716d6bd2eee"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4beec4aa-a694-465c-ab63-545f5270eecf",
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
  "last_heartbeat_at": "2026-10-30T14:49:03.656966Z",
  "last_location_at": "2026-10-30T14:49:03.656966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4beec4aa-a694-465c-ab63-545f5270eecf/close` → **200**

```json
{
  "command_id": "f1a8edba-3d67-4fc4-849a-6ad2fda13258",
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
  "phone": "+380732490137",
  "device_ref": "sandbox-31728"
}
```

```json
{
  "challenge_id": "73e72c1e-fb1c-4c1d-9ed7-ca42cbf5d154",
  "expires_at": "2026-10-30T14:54:07.487497074Z",
  "resend_available_at": "2026-10-30T14:49:08.487497074Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732490137` → **200**

```json
{
  "phone": "+380732490137",
  "audience": "CLIENT",
  "code": "196250",
  "sent_at": "2026-10-30T14:49:07.491077518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73e72c1e-fb1c-4c1d-9ed7-ca42cbf5d154",
  "code": "196250",
  "device_ref": "sandbox-31728"
}
```

```json
{
  "session_id": "a9c3ea3b-b57d-45eb-82f2-59b0eb16eb48",
  "subject": {
    "type": "CLIENT",
    "id": "645ee277-cdc2-4283-88a1-37fda4e03eda"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDVlZTI3Ny1jZGMyLTQyODMtODhhMS0zN2ZkYTRlMDNlZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNjQ3LCJpYXQiOjE3OTMzNzE3NDcsImp0aSI6ImFkZjc0MzAzLWNkNDQtNDY4MS1hMGQ0LTYwYWMwM2ZjZTRhOCIsInNpZCI6ImE5YzNlYTNiLWI1N2QtNDVlYi04MmYyLTU5YjBlYjE2ZWI0OCJ9.c5sOb7g_DwMr1bkXjZm_C0hI6jFGGSbK-vxsKKKmF1g",
  "access_expires_at": "2026-10-30T15:04:07.802301306Z",
  "refresh_token": "sNhCuBxi0fkiaEPau9kgxFueNQLc-DIyCh4FnC2skYI",
  "refresh_expires_at": "2026-11-29T14:49:07.801625896Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6d4b81c4-fd69-4243-9366-7590e3b13f1c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b1c9fd92-f3fa-4dec-b525-44870403bd95",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b1c9fd92-f3fa-4dec-b525-44870403bd95",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "cab1901c8bcd0544ca987328c8e13a62",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b1c9fd92-f3fa-4dec-b525-44870403bd95",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732490137"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b1c9fd92-f3fa-4dec-b525-44870403bd95",
  "expires_at": "2026-10-30T15:19:08.091646Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b1c9fd92-f3fa-4dec-b525-44870403bd95` → **200**

```json
{
  "id": "b1c9fd92-f3fa-4dec-b525-44870403bd95",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:19:08.091646Z",
  "card": {
    "id": "48222319-bf55-4b92-a0bb-8a9fe592dc56",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4957",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:49:08.376818Z"
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
  "device_ref": "sandbox-26832"
}
```

```json
{
  "challenge_id": "d4491314-9fae-4bc8-b695-fdf4abd87b31",
  "expires_at": "2026-10-30T14:54:08.676350705Z",
  "resend_available_at": "2026-10-30T14:49:09.676350705Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "959268",
  "sent_at": "2026-10-30T14:49:08.67909943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4491314-9fae-4bc8-b695-fdf4abd87b31",
  "code": "959268",
  "device_ref": "sandbox-26832"
}
```

```json
{
  "session_id": "0595294a-47d2-4b75-8ac0-1bea622d4fbe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjY0OCwiaWF0IjoxNzkzMzcxNzQ4LCJqdGkiOiI1NTYzZDJhYS0wZWJkLTQzNmQtYTMwNS05ZjZiZDZmZGM4MGUiLCJzaWQiOiIwNTk1Mjk0YS00N2QyLTRiNzUtOGFjMC0xYmVhNjIyZDRmYmUifQ._KJR9E7vZm8tn5shEOELzIxcJaPg6cqtBQz7abM_Xnk",
  "access_expires_at": "2026-10-30T15:04:08.980053495Z",
  "refresh_token": "MVxsGUqzG8-FoCCN4tw_TlndQXtvgk_PWbKXle4sPr0",
  "refresh_expires_at": "2026-11-29T14:49:08.979590401Z",
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
  "command_id": "db5282c9-2813-4919-85f0-033afc8ce569",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:49:09Z",
    "sequence": 1793371749551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a1fb96f-52bb-440f-82f2-bca2c1678f12",
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
  "last_heartbeat_at": "2026-10-30T14:49:09.572278Z",
  "last_location_at": "2026-10-30T14:49:09.572278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd7ff252-9031-4259-a108-7fd678d74b1a",
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
  "id": "9ce0ece1-5e12-443a-9c59-2fc30723bf06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:54:09.866323Z",
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
  "command_id": "d9095df5-27a4-4386-8e7d-7a3297f76fd5",
  "quote_id": "9ce0ece1-5e12-443a-9c59-2fc30723bf06",
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
  "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
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
  "created_at": "2026-10-30T14:49:10.15295Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9` → **200**

```json
{
  "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
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
  "created_at": "2026-10-30T14:49:10.15295Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9` → **200**

```json
{
  "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
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
  "created_at": "2026-10-30T14:49:10.15295Z",
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
    "id": "ffa0c0d5-3270-4db9-8af7-0f2dcf815fd9",
    "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
    "expires_at": "2026-10-30T14:49:25.920987Z",
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

`POST /api/driver/v1/offers/ffa0c0d5-3270-4db9-8af7-0f2dcf815fd9/accept` → **200**

```json
{
  "command_id": "c70464fa-d533-4325-a645-a463fb9e1cc8"
}
```

```json
{
  "id": "021684c8-9052-49ae-9e0a-dc3109183910",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bdd80410-e054-49a7-a89a-c7427b78da11",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bdd80410-e054-49a7-a89a-c7427b78da11",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "assignment_id": "021684c8-9052-49ae-9e0a-dc3109183910",
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

`POST /api/rider/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/messages` → **201**

```json
{
  "command_id": "554042c2-0d21-4c4c-9f18-7ae1bca002f8",
  "body": "Я біля входу, мій номер +380732490137, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "bda34464-04fc-4ccd-aac5-4565ea425fd8",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732490137, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T14:49:12.889904239Z"
}
```

`POST /api/driver/v1/trips/bdd80410-e054-49a7-a89a-c7427b78da11/messages` → **201**

```json
{
  "command_id": "a33b7e9a-1cc2-40a1-91dc-5bc5a234edf2",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "3535768c-2c1b-4966-9611-d97cddceec36",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T14:49:13.182739458Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/0a1fb96f-52bb-440f-82f2-bca2c1678f12/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:49:18Z",
    "sequence": 1793371758478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a1fb96f-52bb-440f-82f2-bca2c1678f12",
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
  "last_heartbeat_at": "2026-10-30T14:49:18.496892Z",
  "last_location_at": "2026-10-30T14:49:18.496892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bdd80410-e054-49a7-a89a-c7427b78da11/arrive` → **200**

```json
{
  "command_id": "f26547a9-b410-4b0f-b6b5-46d2d5d1f6f4",
  "expected_version": 0
}
```

```json
{
  "id": "bdd80410-e054-49a7-a89a-c7427b78da11",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "assignment_id": "021684c8-9052-49ae-9e0a-dc3109183910",
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
  "arrived_at": "2026-10-30T14:49:18.784447Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bdd80410-e054-49a7-a89a-c7427b78da11/start` → **200**

```json
{
  "command_id": "5b9b0dea-0f6c-4236-b824-1f70b926427e",
  "expected_version": 1
}
```

```json
{
  "id": "bdd80410-e054-49a7-a89a-c7427b78da11",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "assignment_id": "021684c8-9052-49ae-9e0a-dc3109183910",
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
  "arrived_at": "2026-10-30T14:49:18.784447Z",
  "started_at": "2026-10-30T14:49:19.078341Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/0a1fb96f-52bb-440f-82f2-bca2c1678f12/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:50:49Z",
    "sequence": 1793371849391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a1fb96f-52bb-440f-82f2-bca2c1678f12",
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
  "last_heartbeat_at": "2026-10-30T14:50:49.412364Z",
  "last_location_at": "2026-10-30T14:50:49.412364Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bdd80410-e054-49a7-a89a-c7427b78da11/complete` → **200**

```json
{
  "command_id": "abd8041f-b073-4405-8a6e-5e5a8e074abd",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:50:49Z",
  "cash_received": false
}
```

```json
{
  "id": "bdd80410-e054-49a7-a89a-c7427b78da11",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "assignment_id": "021684c8-9052-49ae-9e0a-dc3109183910",
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
  "arrived_at": "2026-10-30T14:49:18.784447Z",
  "started_at": "2026-10-30T14:49:19.078341Z",
  "completed_at": "2026-10-30T14:50:49.707432Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9` → **200**

```json
{
  "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
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
    "id": "021684c8-9052-49ae-9e0a-dc3109183910",
    "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bdd80410-e054-49a7-a89a-c7427b78da11",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:49:10.15295Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9` → **200**

```json
{
  "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
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
    "id": "021684c8-9052-49ae-9e0a-dc3109183910",
    "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bdd80410-e054-49a7-a89a-c7427b78da11",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:49:10.15295Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9` → **200**

```json
{
  "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
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
    "id": "021684c8-9052-49ae-9e0a-dc3109183910",
    "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bdd80410-e054-49a7-a89a-c7427b78da11",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:49:10.15295Z",
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
  "session_id": "0a1fb96f-52bb-440f-82f2-bca2c1678f12",
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
  "last_heartbeat_at": "2026-10-30T14:50:49.412364Z",
  "last_location_at": "2026-10-30T14:50:49.412364Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a1fb96f-52bb-440f-82f2-bca2c1678f12/close` → **200**

```json
{
  "command_id": "14d1b804-d580-4b18-8719-a9ecc4b7b16c",
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
  "session_id": "468d77c1-c4c8-4550-b471-a5cbf0188ecd",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3NTMsImlhdCI6MTc5MzM3MTg1MywianRpIjoiZTkyOTU5NjMtZDczMC00Nzc1LTlmOWYtNDhjNjQ2Nzk0Yjg1Iiwic2lkIjoiNDY4ZDc3YzEtYzRjOC00NTUwLWI0NzEtYTVjYmYwMTg4ZWNkIn0.5Hm_QMkwlDkSzd4jwDFi9i3sOK9N-dPbi3b0iV6rGAc",
  "access_expires_at": "2026-10-30T15:05:53.756114947Z",
  "refresh_token": "QXeB7HT-gZKV6-NuugSLyH4SV8ObAxrGmYcvRXRxSE0",
  "refresh_expires_at": "2026-10-31T02:50:53.755410355Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "37e77c35-18c0-4ea8-bd98-c1bfd198d671"
}
```

`GET /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T14:50:54.312040464Z",
  "order": {
    "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
    "short_number": 10,
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
    "created_at": "2026-10-30T14:49:10.15295Z",
    "assigned_at": "2026-10-30T14:49:12.312654Z",
    "arrived_at": "2026-10-30T14:49:18.784447Z",
    "started_at": "2026-10-30T14:49:19.078341Z",
    "completed_at": "2026-10-30T14:50:49.707432Z"
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
    "id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
    "registered_at": "2026-10-30T14:49:07.799507Z",
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
      "created_at": "2026-10-30T14:49:10.154893Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T14:50:50.113273Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks` → **422**

```json
{
  "command_id": "7b1c7592-32c6-40b8-b344-36eae62d5243",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "a18c4687-5c52-449d-986c-af051dfecb7a"
}
```

`POST /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks` → **201**

```json
{
  "command_id": "9bd9587c-59c9-466d-b3e2-537cf1150c4b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "05c5e15c-ea33-4368-a7aa-22048397fbf3",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T14:50:54.957745Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks` → **201**

```json
{
  "command_id": "9bd9587c-59c9-466d-b3e2-537cf1150c4b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "05c5e15c-ea33-4368-a7aa-22048397fbf3",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T14:50:54.957745Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/645ee277-cdc2-4283-88a1-37fda4e03eda` → **200**

```json
{
  "client": {
    "id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
    "phone": "+380732490137",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:49:07.799507Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T14:49:10.15295Z",
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

`POST /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks/05c5e15c-ea33-4368-a7aa-22048397fbf3/resolve` → **200**

```json
{
  "command_id": "80fc17b8-c36e-47b5-b7fe-01788ca79791",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "05c5e15c-ea33-4368-a7aa-22048397fbf3",
  "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T14:50:54.957745Z",
  "resolved_at": "2026-10-30T14:50:55.873081Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/645ee277-cdc2-4283-88a1-37fda4e03eda` → **200**

```json
{
  "client": {
    "id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
    "phone": "+380732490137",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:49:07.799507Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T14:49:10.15295Z",
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

`GET /api/admin/v1/clients/645ee277-cdc2-4283-88a1-37fda4e03eda` → **200**

```json
{
  "client": {
    "id": "645ee277-cdc2-4283-88a1-37fda4e03eda",
    "phone": "+380732490137",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:49:07.799507Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T14:49:10.15295Z",
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

`POST /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks/05c5e15c-ea33-4368-a7aa-22048397fbf3/resolve` → **409**

```json
{
  "command_id": "58e07998-10a2-45e4-acd3-0b60a0e78f6c",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks/05c5e15c-ea33-4368-a7aa-22048397fbf3/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ead7dddb-0994-45d5-91bd-38d489967122"
}
```

`GET /api/admin/v1/orders/fd1668d8-c69c-47e8-8b68-fa1bd0e575f9/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "05c5e15c-ea33-4368-a7aa-22048397fbf3",
      "order_id": "fd1668d8-c69c-47e8-8b68-fa1bd0e575f9",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T14:50:54.957745Z",
      "resolved_at": "2026-10-30T14:50:55.873081Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order fd1668d8-c69c-47e8-8b68-fa1bd0e575f9 without phone or card digits; chargeback 05c5e15c-ea33-4368-a7aa-22048397fbf3 recorded and won.

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
  "session_id": "0153cb47-ccca-4959-a034-3993fd9bfbc4",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3NTgsImlhdCI6MTc5MzM3MTg1OCwianRpIjoiNWIzNWJiZDctNjhhNy00NmIxLWJlNGEtNDAwODQyZGIwMWRkIiwic2lkIjoiMDE1M2NiNDctY2NjYS00OTU5LWEwMzQtMzk5M2ZkOWJmYmM0In0.XRH92c3g0w5H0STHjxDLarjtkTNcd4LtZBCrrOUKxCg",
  "access_expires_at": "2026-10-30T15:05:58.95598256Z",
  "refresh_token": "90pQR7a__99IQRC-ZXWELJ6EkofeKYFIwbU-0SKVnAs",
  "refresh_expires_at": "2026-10-31T02:50:58.955511545Z",
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
  "phone": "+48600797638",
  "device_ref": "sandbox-5237"
}
```

```json
{
  "challenge_id": "af040414-e8c3-41b3-ab19-0b2a2a05756f",
  "expires_at": "2026-10-30T14:55:59.812128726Z",
  "resend_available_at": "2026-10-30T14:51:00.812128726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600797638` → **200**

```json
{
  "phone": "+48600797638",
  "audience": "CLIENT",
  "code": "751358",
  "sent_at": "2026-10-30T14:50:59.815059679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af040414-e8c3-41b3-ab19-0b2a2a05756f",
  "code": "751358",
  "device_ref": "sandbox-5237"
}
```

```json
{
  "session_id": "d80caaa9-1e56-4033-ad28-10baf5bc1626",
  "subject": {
    "type": "CLIENT",
    "id": "28505258-7931-4e16-80a0-71f1510e3d1d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODUwNTI1OC03OTMxLTRlMTYtODBhMC03MWYxNTEwZTNkMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzYwLCJpYXQiOjE3OTMzNzE4NjAsImp0aSI6ImQxYzgwNGM0LTc2MTYtNDM2ZC05NWQyLThjMzE5ZDQ0NjEwZCIsInNpZCI6ImQ4MGNhYWE5LTFlNTYtNDAzMy1hZDI4LTEwYmFmNWJjMTYyNiJ9.MuVbhlz6VBVtJN7wZxLKCFz9Ug0vUkM4J-4UqkBEzy4",
  "access_expires_at": "2026-10-30T15:06:00.110821881Z",
  "refresh_token": "1B7qaidvJAg6CQ73lG3mEpTm92ixFKZKfXcTTtKPwuw",
  "refresh_expires_at": "2026-11-29T14:51:00.110117166Z",
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
  "command_id": "958a83fa-4c2a-4640-8a73-ae138bee66f3",
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
  "correlation_id": "093b53a1-c051-4ea8-8516-249ba183e2fe",
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
  "command_id": "ad45ecf7-f752-40ca-984a-7c761310faff",
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
  "paused_at": "2026-10-30T14:51:01.244933282Z",
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
  "command_id": "47e3e305-60d2-494c-8ecb-df7a8514a829",
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
  "id": "b7164418-75de-4374-aba2-c299066e9751",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:01.826674Z",
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
  "command_id": "8dfbec11-1ae1-4e5f-88aa-fafdac4aebc4",
  "quote_id": "b7164418-75de-4374-aba2-c299066e9751",
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
  "correlation_id": "38f67ecd-3d7b-4b3b-9006-438a76b45f4b"
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
  "paused_at": "2026-10-30T14:51:01.244933Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "58a08deb-780f-486e-94dc-6185fab80bcc",
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
  "command_id": "9b031a3e-b402-4be5-8a61-02f712337247",
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
  "command_id": "f5461864-4899-4aec-883e-58f61a0e0176",
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
  "id": "c34aadaf-5cd6-4e93-a42d-01c069668096",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:03.539574Z",
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
  "command_id": "cb82f0a0-ba97-4715-b3d3-185faaf0202b",
  "quote_id": "c34aadaf-5cd6-4e93-a42d-01c069668096",
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
  "correlation_id": "8d4422aa-3e4a-4acd-83e8-9977c09c0b1f"
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
  "command_id": "28123d18-8c33-4218-836a-16f8aee5ce17",
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
  "command_id": "e863d280-5422-4e32-91a1-bac6c5758fc8",
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
  "id": "6a1926ba-df1f-4fdf-a018-5c814f266ef6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:04.748496Z",
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
  "command_id": "28e5e40e-2871-4ed3-ab6a-b69edc7124cd",
  "quote_id": "6a1926ba-df1f-4fdf-a018-5c814f266ef6",
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
  "correlation_id": "a647727f-a6c6-4abe-b39b-3dc4bc539192"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "7e624934-0a4a-49d1-a627-f8a9e8bc1145",
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
  "correlation_id": "f20939d0-9f50-47a2-b3c6-ff2f545539ca",
  "current_version": 4
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
  "command_id": "708a2051-11a4-417b-941d-9f59962e6b93",
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
  "phone": "+380673672940",
  "device_ref": "sandbox-17213"
}
```

```json
{
  "challenge_id": "bdb25b53-a441-41a5-98e2-d6ae8ae78092",
  "expires_at": "2026-10-30T14:56:06.197894429Z",
  "resend_available_at": "2026-10-30T14:51:07.197894429Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673672940` → **200**

```json
{
  "phone": "+380673672940",
  "audience": "CLIENT",
  "code": "536326",
  "sent_at": "2026-10-30T14:51:06.200914258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdb25b53-a441-41a5-98e2-d6ae8ae78092",
  "code": "536326",
  "device_ref": "sandbox-17213"
}
```

```json
{
  "session_id": "a4593d9b-29ba-4e97-872a-db2f7c62c355",
  "subject": {
    "type": "CLIENT",
    "id": "389758b4-817a-473f-9568-55d95be27355"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODk3NThiNC04MTdhLTQ3M2YtOTU2OC01NWQ5NWJlMjczNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzY2LCJpYXQiOjE3OTMzNzE4NjYsImp0aSI6ImEzYmU0MGJlLWE0OGMtNDMxNS05NTlhLTRjNzBlMGQ4YjJmNCIsInNpZCI6ImE0NTkzZDliLTI5YmEtNGU5Ny04NzJhLWRiMmY3YzYyYzM1NSJ9.4-PIeCd1WvvfTICGaffcQtpzRoP_zsM5-dPDsesxsCA",
  "access_expires_at": "2026-10-30T15:06:06.506201084Z",
  "refresh_token": "k_FfVuTLsbJgAOgl_j-rXgrSrJWAakPvnTcqg7EYY8g",
  "refresh_expires_at": "2026-11-29T14:51:06.505532011Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "389758b4-817a-473f-9568-55d95be27355",
  "session_id": "a4593d9b-29ba-4e97-872a-db2f7c62c355",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2295b6a3-3645-4ec8-8a9d-70db9146a29a",
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
  "id": "c74928b9-747b-4d2f-a327-56745b6f9514",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:07.057686Z",
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
  "challenge_id": "8347e3db-a49e-4f72-92cb-f3cf2b6621e8",
  "expires_at": "2026-10-30T14:56:09.347570882Z",
  "resend_available_at": "2026-10-30T14:51:10.347570882Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673672940` → **200**

```json
{
  "phone": "+380673672940",
  "audience": "CLIENT",
  "code": "112054",
  "sent_at": "2026-10-30T14:51:09.351132562Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f19fe26d-cd8e-4545-827a-cdc483d061db",
  "challenge_id": "8347e3db-a49e-4f72-92cb-f3cf2b6621e8",
  "otp_code": "112054"
}
```

```json
{
  "client_id": "389758b4-817a-473f-9568-55d95be27355",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T14:51:09.659202833Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c01768d6-4cb7-4b25-8b88-4f1fc691539c",
  "quote_id": "c74928b9-747b-4d2f-a327-56745b6f9514",
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
  "correlation_id": "fe77eed2-05f8-4978-ae4d-da4c66f8ae5b"
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
  "session_id": "42141705-e849-4db1-9c8a-fd78f06a65b5",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3NzAsImlhdCI6MTc5MzM3MTg3MCwianRpIjoiMmM1NjM0MGQtZGRhYS00ZGQxLTg1ZWUtYTk3ZGQxZGNlNWUwIiwic2lkIjoiNDIxNDE3MDUtZTg0OS00ZGIxLTljOGEtZmQ3OGYwNmE2NWI1In0.2zSAaBdyeY1Q3Mj9ta3jrCD993bjmK5pIWtGs__OylA",
  "access_expires_at": "2026-10-30T15:06:10.54856916Z",
  "refresh_token": "Ht0Rw-FSUJgW88aUnrq5zMjzFoEq7qAuhJtYT9sVCIo",
  "refresh_expires_at": "2026-10-31T02:51:10.548024171Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "389758b4-817a-473f-9568-55d95be27355",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T14:51:09.659203Z",
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

`POST /api/admin/v1/client-deletions/389758b4-817a-473f-9568-55d95be27355/complete` → **200**

```json
{
  "command_id": "4faeac1a-2c27-4f71-b6f9-291377d0c6ed",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "389758b4-817a-473f-9568-55d95be27355",
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
  "correlation_id": "f08de3a4-2f79-4a40-bcdb-253e48fb3364"
}
```

Done: client 389758b4-817a-473f-9568-55d95be27355 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660419167",
  "device_ref": "sandbox-15844"
}
```

```json
{
  "challenge_id": "2e9d8226-63c7-40a7-a89e-41b4a8bdf38b",
  "expires_at": "2026-10-30T14:56:11.692026386Z",
  "resend_available_at": "2026-10-30T14:51:12.692026386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660419167` → **200**

```json
{
  "phone": "+380660419167",
  "audience": "CLIENT",
  "code": "802537",
  "sent_at": "2026-10-30T14:51:11.694821527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e9d8226-63c7-40a7-a89e-41b4a8bdf38b",
  "code": "802537",
  "device_ref": "sandbox-15844"
}
```

```json
{
  "session_id": "a1cf66c3-008a-41ba-badf-445c534196c0",
  "subject": {
    "type": "CLIENT",
    "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGRkNjdlNC05ZTUxLTQ2NzItODJjZi1iZWVmNzUzZDNhNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzcxLCJpYXQiOjE3OTMzNzE4NzEsImp0aSI6IjgyZTUxMWYxLTAwZjMtNDJhZC04NTU2LWMyYWFiOTlkNjIwYyIsInNpZCI6ImExY2Y2NmMzLTAwOGEtNDFiYS1iYWRmLTQ0NWM1MzQxOTZjMCJ9.styqZYY8sWRLFNSNZ5xjjYoHen7gq9rR4VvzG9zbr_s",
  "access_expires_at": "2026-10-30T15:06:11.996074987Z",
  "refresh_token": "5FTt178Dp_x_hm0lPH7vbrrWK0jvfRFOI9RaJxYck7Q",
  "refresh_expires_at": "2026-11-29T14:51:11.995513003Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
  "session_id": "a1cf66c3-008a-41ba-badf-445c534196c0",
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
  "session_id": "f7bd8557-573c-485a-9dbb-21984c7183c0",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3NzIsImlhdCI6MTc5MzM3MTg3MiwianRpIjoiMzUwYjVmMGYtOGVlYi00ZTM2LTk0MWQtYjYxYTcxY2ZjOTgxIiwic2lkIjoiZjdiZDg1NTctNTczYy00ODVhLTlkYmItMjE5ODRjNzE4M2MwIn0.6d7eFE0m2Y8X1GsbeAV3qQVSXYQjILiVjqg5JwbJ5lk",
  "access_expires_at": "2026-10-30T15:06:12.860811609Z",
  "refresh_token": "r75RacS3g6qiZMuTx7iXY3yKa-F7VVfNiL79EJX-ta0",
  "refresh_expires_at": "2026-10-31T02:51:12.860328631Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0419167&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
      "phone": "+380660419167",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T14:51:11.993439Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/8ddd67e4-9e51-4672-82cf-beef753d3a4f` → **200**

```json
{
  "client": {
    "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
    "phone": "+380660419167",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:51:11.993439Z",
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

`POST /api/admin/v1/clients/8ddd67e4-9e51-4672-82cf-beef753d3a4f/block` → **400**

```json
{
  "command_id": "84c91244-1ec7-4e87-ad7f-d492c42e3f6e",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8ddd67e4-9e51-4672-82cf-beef753d3a4f/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "56170bcb-4c59-48aa-8b8c-e70f9616b2bb",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/8ddd67e4-9e51-4672-82cf-beef753d3a4f/block` → **200**

```json
{
  "command_id": "a220f5d1-462d-43cf-a4d9-649123c845e5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
  "phone": "+380660419167",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T14:51:11.993439Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T14:51:14.025417Z",
    "by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
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
  "correlation_id": "537b5ada-90e8-4778-a039-1abea7bd09db"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660419167",
  "device_ref": "sandbox-8015"
}
```

```json
{
  "challenge_id": "ad6a9408-a053-4e82-a9d0-72b66d64aa66",
  "expires_at": "2026-10-30T14:56:16.601925646Z",
  "resend_available_at": "2026-10-30T14:51:17.601925646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660419167` → **200**

```json
{
  "phone": "+380660419167",
  "audience": "CLIENT",
  "code": "568509",
  "sent_at": "2026-10-30T14:51:16.605018301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "ad6a9408-a053-4e82-a9d0-72b66d64aa66",
  "code": "568509",
  "device_ref": "sandbox-8015"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "237b26e3-c4d9-4720-b920-98cbe761ce47"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/8ddd67e4-9e51-4672-82cf-beef753d3a4f` → **200**

```json
{
  "client": {
    "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
    "phone": "+380660419167",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T14:51:11.993439Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T14:51:14.025417Z",
      "by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
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

`POST /api/admin/v1/clients/8ddd67e4-9e51-4672-82cf-beef753d3a4f/unblock` → **200**

```json
{
  "command_id": "4fe03c23-b636-4631-bb41-077e34f73833",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
  "phone": "+380660419167",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T14:51:11.993439Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660419167",
  "device_ref": "sandbox-27064"
}
```

```json
{
  "challenge_id": "e5c57f10-0aea-4a2c-a424-b3658f2392be",
  "expires_at": "2026-10-30T14:56:19.799650617Z",
  "resend_available_at": "2026-10-30T14:51:20.799650617Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660419167` → **200**

```json
{
  "phone": "+380660419167",
  "audience": "CLIENT",
  "code": "285706",
  "sent_at": "2026-10-30T14:51:19.802758906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5c57f10-0aea-4a2c-a424-b3658f2392be",
  "code": "285706",
  "device_ref": "sandbox-27064"
}
```

```json
{
  "session_id": "d724debf-ad7f-4f37-84c8-fc25e13aa8f6",
  "subject": {
    "type": "CLIENT",
    "id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGRkNjdlNC05ZTUxLTQ2NzItODJjZi1iZWVmNzUzZDNhNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzgwLCJpYXQiOjE3OTMzNzE4ODAsImp0aSI6Ijc0NTkwMjkyLTU2OGUtNGU1Ny04ZTRhLWEzZWEyMWViYWQ0ZCIsInNpZCI6ImQ3MjRkZWJmLWFkN2YtNGYzNy04NGM4LWZjMjVlMTNhYThmNiJ9.i3bZCWz8Vr2Ue4imony4mL8YWVXNCf4AS0xLFaq_zGo",
  "access_expires_at": "2026-10-30T15:06:20.105042455Z",
  "refresh_token": "2BmwWoXbXHexn9-xirAKPqGS6lnREX7AzgcJQWNzp-s",
  "refresh_expires_at": "2026-11-29T14:51:20.104492237Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8ddd67e4-9e51-4672-82cf-beef753d3a4f",
  "session_id": "d724debf-ad7f-4f37-84c8-fc25e13aa8f6",
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
  "phone": "+380667177915",
  "device_ref": "sandbox-30530"
}
```

```json
{
  "challenge_id": "6c967b67-d494-4f0f-9e23-30d04c51b536",
  "expires_at": "2026-10-30T14:56:20.666368299Z",
  "resend_available_at": "2026-10-30T14:51:21.666368299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667177915` → **200**

```json
{
  "phone": "+380667177915",
  "audience": "CLIENT",
  "code": "059934",
  "sent_at": "2026-10-30T14:51:20.668938199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c967b67-d494-4f0f-9e23-30d04c51b536",
  "code": "059934",
  "device_ref": "sandbox-30530"
}
```

```json
{
  "session_id": "cfa8aee2-f46c-4074-8080-4b3f32756908",
  "subject": {
    "type": "CLIENT",
    "id": "ba6ead94-c839-4e38-909a-22b6af65d223"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTZlYWQ5NC1jODM5LTRlMzgtOTA5YS0yMmI2YWY2NWQyMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzgwLCJpYXQiOjE3OTMzNzE4ODAsImp0aSI6IjI5ZjkxN2E5LTgzZjktNDBlZC1hZGJkLThhYzUzOTI0YmY4MiIsInNpZCI6ImNmYThhZWUyLWY0NmMtNDA3NC04MDgwLTRiM2YzMjc1NjkwOCJ9.l-ONxH-btQaCAjgfmsz5TQaH_3OVOb2kBU4T2sQTE5Y",
  "access_expires_at": "2026-10-30T15:06:20.97376549Z",
  "refresh_token": "YatSnbupyVmxf4XUCkZeo9gdnUpwYUcmsh7NYMoKCZk",
  "refresh_expires_at": "2026-11-29T14:51:20.97302617Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d7855fbe-fa99-4c5d-8745-2528af42ec42",
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
  "id": "6ee40109-d6dc-4bb3-a9c9-a78ea1cf54a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:21.261923Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: ef4a0433-1189-4cda-a6d1-b50ff3b1e9db) → **201**

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
  "session_id": "8bfddb67-4ff2-4e85-b28b-b90c0737082c",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3ODEsImlhdCI6MTc5MzM3MTg4MSwianRpIjoiODIxOTQ5OTUtYjFiYi00MzBiLWJhNzctZjE0NTQyMWY3NjFjIiwic2lkIjoiOGJmZGRiNjctNGZmMi00ZTg1LWIyOGItYjkwYzA3MzcwODJjIn0.IOhdt6yeX6XZHCYjs3I9oCD6Y65S11qlX1WpIZMsIrI",
  "access_expires_at": "2026-10-30T15:06:21.900421636Z",
  "refresh_token": "XeDL0pqnmpZHcFNp0TTgACjHAc3cxblyZWFEwdMFUhM",
  "refresh_expires_at": "2026-10-31T02:51:21.899837837Z",
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
  "session_id": "cea63a24-9e5b-49a4-b068-d362996c7bc5",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3ODIsImlhdCI6MTc5MzM3MTg4MiwianRpIjoiZTJiMWI3OWUtNGM2Ni00YWY2LTk3NmUtZDYwMzdmODYxZDhiIiwic2lkIjoiY2VhNjNhMjQtOWU1Yi00OWE0LWIwNjgtZDM2Mjk5NmM3YmM1In0.FNDMPXTZTwhWRFkcypwtgLL9zl5y0K_aQXN5E3dG1dM",
  "access_expires_at": "2026-10-30T15:06:22.498203987Z",
  "refresh_token": "On54qKaN-IoEyiDgr_47gNwhKTCwZ4MKy4nbwNJTlfw",
  "refresh_expires_at": "2026-10-31T02:51:22.497678712Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/368c8981-9440-4dfa-a46d-190e14e57e68/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:51:21.547053Z",
      "actor": {
        "type": "CLIENT",
        "id": "ba6ead94-c839-4e38-909a-22b6af65d223",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "368c8981-9440-4dfa-a46d-190e14e57e68",
        "quote_id": "6ee40109-d6dc-4bb3-a9c9-a78ea1cf54a8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ef4a0433-1189-4cda-a6d1-b50ff3b1e9db"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:51:21.548633Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "368c8981-9440-4dfa-a46d-190e14e57e68",
        "attempt_id": "d2c944e7-12e5-4a0e-92e6-9b00f9ba71e0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ef4a0433-1189-4cda-a6d1-b50ff3b1e9db"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T14:51:21.557834Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "368c8981-9440-4dfa-a46d-190e14e57e68",
        "attempt_id": "d2c944e7-12e5-4a0e-92e6-9b00f9ba71e0"
      },
      "correlation_id": "ef4a0433-1189-4cda-a6d1-b50ff3b1e9db"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d2c944e7-12e5-4a0e-92e6-9b00f9ba71e0",
        "generation": 1,
        "started_at": "2026-10-30T14:51:21.547895Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T14:51:21.557834Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T14:51:21.549121Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/ef4a0433-1189-4cda-a6d1-b50ff3b1e9db` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "368c8981-9440-4dfa-a46d-190e14e57e68:0",
      "order_id": "368c8981-9440-4dfa-a46d-190e14e57e68",
      "at": "2026-10-30T14:51:21.547053Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "368c8981-9440-4dfa-a46d-190e14e57e68:1",
      "order_id": "368c8981-9440-4dfa-a46d-190e14e57e68",
      "at": "2026-10-30T14:51:21.548633Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "368c8981-9440-4dfa-a46d-190e14e57e68:2",
      "order_id": "368c8981-9440-4dfa-a46d-190e14e57e68",
      "at": "2026-10-30T14:51:21.557834Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/deb6990b-18bd-4e57-a0ba-318e6dbd48c4` → **200**

```json
{
  "found": []
}
```

Done: request ef4a0433-1189-4cda-a6d1-b50ff3b1e9db — order 368c8981-9440-4dfa-a46d-190e14e57e68 found by its id.

`GET /api/rider/v1/orders/368c8981-9440-4dfa-a46d-190e14e57e68` → **200**

```json
{
  "id": "368c8981-9440-4dfa-a46d-190e14e57e68",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba6ead94-c839-4e38-909a-22b6af65d223",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:21.546518Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/368c8981-9440-4dfa-a46d-190e14e57e68/cancel` → **200**

```json
{
  "command_id": "2fc2a700-3d54-49b5-a483-d6f976da4443",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "368c8981-9440-4dfa-a46d-190e14e57e68",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ba6ead94-c839-4e38-909a-22b6af65d223",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:21.546518Z",
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
  "phone": "+380633982148",
  "device_ref": "sandbox-7444"
}
```

```json
{
  "challenge_id": "cc950719-00f7-4ff8-a2bd-4c8630d1841c",
  "expires_at": "2026-10-30T14:56:24.219331375Z",
  "resend_available_at": "2026-10-30T14:51:25.219331375Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633982148` → **200**

```json
{
  "phone": "+380633982148",
  "audience": "CLIENT",
  "code": "109328",
  "sent_at": "2026-10-30T14:51:24.221996297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc950719-00f7-4ff8-a2bd-4c8630d1841c",
  "code": "109328",
  "device_ref": "sandbox-7444"
}
```

```json
{
  "session_id": "1ae69e72-6e36-444d-9881-a658384af693",
  "subject": {
    "type": "CLIENT",
    "id": "88274808-0903-408f-9831-d330129da921"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODI3NDgwOC0wOTAzLTQwOGYtOTgzMS1kMzMwMTI5ZGE5MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzg0LCJpYXQiOjE3OTMzNzE4ODQsImp0aSI6ImE3ZDVjOGZmLWMyODQtNGRmMi04MTFlLWFjYWU3ZjAyOTBiYSIsInNpZCI6IjFhZTY5ZTcyLTZlMzYtNDQ0ZC05ODgxLWE2NTgzODRhZjY5MyJ9.AVA34Ruq8Q-lLg9HYYqRCtVfyA5rGhBv6irG42gLQIk",
  "access_expires_at": "2026-10-30T15:06:24.547747097Z",
  "refresh_token": "dS54oD3PV56BAygNJS-K3MFH-jgqYFZPPPAqfEBP4js",
  "refresh_expires_at": "2026-11-29T14:51:24.546916051Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d837e66b-bfdf-40f0-9a12-dd90039afd70",
  "expires_at": "2026-10-30T14:56:26.831809503Z",
  "resend_available_at": "2026-10-30T14:51:27.831809503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633982148` → **200**

```json
{
  "phone": "+380633982148",
  "audience": "CLIENT",
  "code": "135059",
  "sent_at": "2026-10-30T14:51:26.834363285Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "844519e7-8aa2-46d6-80c2-ba1580fcbaf9",
  "challenge_id": "d837e66b-bfdf-40f0-9a12-dd90039afd70",
  "otp_code": "135059"
}
```

```json
{
  "id": "477a2887-0498-4ef5-911e-fddb1dc597fb",
  "state": "PENDING",
  "created_at": "2026-10-30T14:51:27.150033Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/477a2887-0498-4ef5-911e-fddb1dc597fb` → **200**

```json
{
  "id": "477a2887-0498-4ef5-911e-fddb1dc597fb",
  "state": "READY",
  "created_at": "2026-10-30T14:51:27.150033Z",
  "ready_at": "2026-10-30T14:51:27.35745Z",
  "expires_at": "2026-11-06T14:51:27.35745Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/477a2887-0498-4ef5-911e-fddb1dc597fb/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631821688",
  "device_ref": "sandbox-15668"
}
```

```json
{
  "challenge_id": "93f1737f-47de-4518-9b91-1cb91b7b6465",
  "expires_at": "2026-10-30T14:56:27.734722883Z",
  "resend_available_at": "2026-10-30T14:51:28.734722883Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631821688` → **200**

```json
{
  "phone": "+380631821688",
  "audience": "CLIENT",
  "code": "795436",
  "sent_at": "2026-10-30T14:51:27.738065319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93f1737f-47de-4518-9b91-1cb91b7b6465",
  "code": "795436",
  "device_ref": "sandbox-15668"
}
```

```json
{
  "session_id": "e53432b4-6f16-4993-8e05-8859d655f258",
  "subject": {
    "type": "CLIENT",
    "id": "615082fd-3460-48f5-b30e-9450e1198a48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUwODJmZC0zNDYwLTQ4ZjUtYjMwZS05NDUwZTExOThhNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzg4LCJpYXQiOjE3OTMzNzE4ODgsImp0aSI6IjVkNWNmNmMzLWVhYTAtNGNkNS04ZTFlLThmNzJkZTViMzE4MiIsInNpZCI6ImU1MzQzMmI0LTZmMTYtNDk5My04ZTA1LTg4NTlkNjU1ZjI1OCJ9.KIXMR1n9HJLJkqZFADrsAWOWgLFBjmcLPL59M8x6Sjo",
  "access_expires_at": "2026-10-30T15:06:28.037282913Z",
  "refresh_token": "1NoFgLhYP9M8LHWAsEqbOR0mTGMic1D2dWhQZf2JuHk",
  "refresh_expires_at": "2026-11-29T14:51:28.036807044Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/477a2887-0498-4ef5-911e-fddb1dc597fb/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/477a2887-0498-4ef5-911e-fddb1dc597fb/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b0577afc-0ffd-404f-b928-8b9bb736cb2f"
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
  "session_id": "dc4efc74-5448-494d-9c2b-37b974a5a36e",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3ODgsImlhdCI6MTc5MzM3MTg4OCwianRpIjoiOTFhMTJmZDUtMjM1OC00ZGYxLWEyYTYtMmMwNDk4MjE3MDlhIiwic2lkIjoiZGM0ZWZjNzQtNTQ0OC00OTRkLTljMmItMzdiOTc0YTVhMzZlIn0.5P-jn90ZKwUrK5B6TBtJ2nYS_eDrZO7D5gZ0mnp4ma0",
  "access_expires_at": "2026-10-30T15:06:28.903996681Z",
  "refresh_token": "l2FsHnGA_H1hdgani-ZGWJxHjyMf42UXvrcbzzcJxIk",
  "refresh_expires_at": "2026-10-31T02:51:28.903541902Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "88274808-0903-408f-9831-d330129da921",
  "session_id": "1ae69e72-6e36-444d-9881-a658384af693",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/88274808-0903-408f-9831-d330129da921/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "477a2887-0498-4ef5-911e-fddb1dc597fb",
      "state": "READY",
      "created_at": "2026-10-30T14:51:27.150033Z",
      "ready_at": "2026-10-30T14:51:27.35745Z",
      "expires_at": "2026-11-06T14:51:27.35745Z",
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
  "device_ref": "sandbox-2184"
}
```

```json
{
  "challenge_id": "af0120b5-921a-46d3-90fe-6e575d63e28a",
  "expires_at": "2026-10-30T14:56:29.737064521Z",
  "resend_available_at": "2026-10-30T14:51:30.737064521Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "698584",
  "sent_at": "2026-10-30T14:51:29.739874496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af0120b5-921a-46d3-90fe-6e575d63e28a",
  "code": "698584",
  "device_ref": "sandbox-2184"
}
```

```json
{
  "session_id": "a0acb85a-3d7d-421d-8563-c01c0ef86dfd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Mjc5MCwiaWF0IjoxNzkzMzcxODkwLCJqdGkiOiI1MDk1MDhkMy00MTgwLTQzYWItYWFmYi0yNzBmZTlmMmVjNGYiLCJzaWQiOiJhMGFjYjg1YS0zZDdkLTQyMWQtODU2My1jMDFjMGVmODZkZmQifQ.lYLFsp7pVX6P9KB1vwom0j--STADPtVzbyiX6QwAMaw",
  "access_expires_at": "2026-10-30T15:06:30.042103364Z",
  "refresh_token": "SDO9OrMAACSM0U8scw_NOtyrSdM4EwIE2f2sxY2BNjI",
  "refresh_expires_at": "2026-11-29T14:51:30.041563795Z",
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
  "device_ref": "sandbox-2224"
}
```

```json
{
  "challenge_id": "1f93fcfd-5938-480a-98a2-07aaa39f0f6d",
  "expires_at": "2026-10-30T14:56:30.592082507Z",
  "resend_available_at": "2026-10-30T14:51:31.592082507Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "288945",
  "sent_at": "2026-10-30T14:51:30.595150341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f93fcfd-5938-480a-98a2-07aaa39f0f6d",
  "code": "288945",
  "device_ref": "sandbox-2224"
}
```

```json
{
  "session_id": "6be00506-f2c0-4e86-a070-8faf477e18da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Mjc5MCwiaWF0IjoxNzkzMzcxODkwLCJqdGkiOiIzZmE1NTYyNS05NGNmLTQxYjAtYWU0Zi0xMzg0Yjc5MzQ5N2YiLCJzaWQiOiI2YmUwMDUwNi1mMmMwLTRlODYtYTA3MC04ZmFmNDc3ZTE4ZGEifQ.M5_OD6YbXmgVucAX-PtP_6G2ZHuN0XA4FVuupvxcWAE",
  "access_expires_at": "2026-10-30T15:06:30.898503885Z",
  "refresh_token": "cM-IqCIw-Ls_l8FgUnNl2dG4TQxwNoCSlRO3bsF71pY",
  "refresh_expires_at": "2026-11-29T14:51:30.897909371Z",
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
  "command_id": "b0dbe063-bf5d-4943-9601-56146bbfb690",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:31Z",
    "sequence": 1793371891471
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f10d97b0-5890-4808-a1d0-0bb2df70cf8e",
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
  "last_heartbeat_at": "2026-10-30T14:51:31.48898Z",
  "last_location_at": "2026-10-30T14:51:31.48898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-5180"
}
```

```json
{
  "challenge_id": "963e7638-bd5a-434c-b900-f989e2113a9a",
  "expires_at": "2026-10-30T14:56:31.771916917Z",
  "resend_available_at": "2026-10-30T14:51:32.771916917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "100288",
  "sent_at": "2026-10-30T14:51:31.775220206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "963e7638-bd5a-434c-b900-f989e2113a9a",
  "code": "100288",
  "device_ref": "sandbox-5180"
}
```

```json
{
  "session_id": "cb191b43-4844-48e7-967c-7cecd0010da0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Mjc5MiwiaWF0IjoxNzkzMzcxODkyLCJqdGkiOiI0M2M3MTRiMC04ODE5LTQ3Y2UtOGMzMC01ZjViN2RkNGYxZjciLCJzaWQiOiJjYjE5MWI0My00ODQ0LTQ4ZTctOTY3Yy03Y2VjZDAwMTBkYTAifQ.tdIlNTKKAOpI_qTI5hVhHvC4w7E2_quG5QnHIIe6SDc",
  "access_expires_at": "2026-10-30T15:06:32.08116622Z",
  "refresh_token": "-Z0QhqUQN3nI6h9zYF0R7bTNZpvp7cLE1QYnCR9UChs",
  "refresh_expires_at": "2026-11-29T14:51:32.080683739Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "825f249f-b10f-4ba5-9f48-9caa3f795738",
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
  "last_heartbeat_at": "2026-10-30T14:47:41.983962Z",
  "last_location_at": "2026-10-30T14:47:41.983962Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/825f249f-b10f-4ba5-9f48-9caa3f795738/handover` → **200**

```json
{
  "command_id": "1908e0ca-8aa6-40f2-a457-fc1b2ef2d99a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "825f249f-b10f-4ba5-9f48-9caa3f795738",
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
  "last_heartbeat_at": "2026-10-30T14:47:41.983962Z",
  "last_location_at": "2026-10-30T14:47:41.983962Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/825f249f-b10f-4ba5-9f48-9caa3f795738/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:32Z",
    "sequence": 1793371892933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "825f249f-b10f-4ba5-9f48-9caa3f795738",
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
  "last_heartbeat_at": "2026-10-30T14:51:32.950965Z",
  "last_location_at": "2026-10-30T14:51:32.950965Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "089236df-0113-4bca-9bea-e14b3edb97f3",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3OTMsImlhdCI6MTc5MzM3MTg5MywianRpIjoiYWE3ZmYyOGUtNGM3Mi00YWIwLTk2NDUtMWU2MzFkYjEzMzM5Iiwic2lkIjoiMDg5MjM2ZGYtMDExMy00YmNhLTliZWEtZTE0YjNlZGI5N2YzIn0.PW4tdfZRxt01vfsdqMx0K-XxHFZCV8JlBpAr5CV-9co",
  "access_expires_at": "2026-10-30T15:06:33.547379618Z",
  "refresh_token": "dk6LVXnV7wD47VX2FfKDPj9niXLEVRfwIcDTsFTzUNA",
  "refresh_expires_at": "2026-10-31T02:51:33.546840598Z",
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
  "session_id": "350902a5-a69f-4571-8290-4cf015680a8b",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI3OTQsImlhdCI6MTc5MzM3MTg5NCwianRpIjoiMjZmMTZlNDctZTgwNS00OWMzLTlmZTItNzYxMjUzYmUxYmMzIiwic2lkIjoiMzUwOTAyYTUtYTY5Zi00NTcxLTgyOTAtNGNmMDE1NjgwYThiIn0._aVbHTWVl0cEEKZsDrTeKk40XkUDkr_tF48yN98PIPA",
  "access_expires_at": "2026-10-30T15:06:34.145102774Z",
  "refresh_token": "ahqRFaOqbBJWtGdh_i_d42IAHR-UQONBZVomS_o3juI",
  "refresh_expires_at": "2026-10-31T02:51:34.144610021Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684765845",
  "device_ref": "sandbox-110"
}
```

```json
{
  "challenge_id": "a14ace86-14d7-4bf8-ade7-8ff7acab1983",
  "expires_at": "2026-10-30T14:56:34.424921879Z",
  "resend_available_at": "2026-10-30T14:51:35.424921879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684765845` → **200**

```json
{
  "phone": "+380684765845",
  "audience": "CLIENT",
  "code": "167009",
  "sent_at": "2026-10-30T14:51:34.427685714Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a14ace86-14d7-4bf8-ade7-8ff7acab1983",
  "code": "167009",
  "device_ref": "sandbox-110"
}
```

```json
{
  "session_id": "935cd2c4-2927-4c40-9b41-1959534900dd",
  "subject": {
    "type": "CLIENT",
    "id": "45746135-b16b-4944-845e-98db1a314d86"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTc0NjEzNS1iMTZiLTQ5NDQtODQ1ZS05OGRiMWEzMTRkODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyNzk0LCJpYXQiOjE3OTMzNzE4OTQsImp0aSI6IjY3YzU5YzVmLTQwNzctNGE4Yi05YjdkLTc1NTE2NmYwNDMwZiIsInNpZCI6IjkzNWNkMmM0LTI5MjctNGM0MC05YjQxLTE5NTk1MzQ5MDBkZCJ9.apwq7YtVERApYImICY_tDwfv3D2thCHDkWBd2Qq_fes",
  "access_expires_at": "2026-10-30T15:06:34.750989258Z",
  "refresh_token": "87SMKRFqiaMNkvsygKONQ9oGPKYUH_jXR4FvrobHkfg",
  "refresh_expires_at": "2026-11-29T14:51:34.750432296Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc9b5244-04ec-4a1b-a3a2-e13173793657",
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
  "id": "d2990ea5-d671-48ec-8369-b61907582006",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:35.034088Z",
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
  "command_id": "9a33284c-2f45-4775-90b3-714e9bde4f47",
  "quote_id": "d2990ea5-d671-48ec-8369-b61907582006",
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
  "id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "45746135-b16b-4944-845e-98db1a314d86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:35.328089Z",
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
    "id": "3b57fc4b-6079-45c4-a517-3217e35012c9",
    "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
    "expires_at": "2026-10-30T14:51:50.330711Z",
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

`POST /api/driver/v1/offers/3b57fc4b-6079-45c4-a517-3217e35012c9/reject` → **204**

```json
{
  "command_id": "69d24683-4c84-4d8e-9080-2c961baf73f7"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "321880b3-aee7-4754-b6e3-54f6e3dc1393",
    "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
    "expires_at": "2026-10-30T14:51:50.91486Z",
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

`POST /api/driver/v1/offers/321880b3-aee7-4754-b6e3-54f6e3dc1393/accept` → **200**

```json
{
  "command_id": "759ac6a7-92db-4208-9cc7-32aae395463e"
}
```

```json
{
  "id": "68042b5f-0266-441d-aea7-b3c037be93f1",
  "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aaecf769-af05-4b3a-b3ea-da4bc780cc75",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/e9402814-af20-4c05-9909-1ea5ab59bf96/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:51:35.328611Z",
      "actor": {
        "type": "CLIENT",
        "id": "45746135-b16b-4944-845e-98db1a314d86",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
        "quote_id": "d2990ea5-d671-48ec-8369-b61907582006",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "eec535f3-e212-4f8f-b3d2-e830a08afc58"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:51:35.330132Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
        "attempt_id": "19eaf4d2-093e-4c9e-b959-7e4be2228b69",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "eec535f3-e212-4f8f-b3d2-e830a08afc58"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:51:35.336237Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3b57fc4b-6079-45c4-a517-3217e35012c9",
        "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "eec535f3-e212-4f8f-b3d2-e830a08afc58"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T14:51:35.913592Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3b57fc4b-6079-45c4-a517-3217e35012c9",
        "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96"
      },
      "correlation_id": "696b144f-45d1-4982-828e-b3284bf1f7e7"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order e9402814-af20-4c05-9909-1ea5ab59bf96 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/e9402814-af20-4c05-9909-1ea5ab59bf96` → **200**

```json
{
  "id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "45746135-b16b-4944-845e-98db1a314d86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "68042b5f-0266-441d-aea7-b3c037be93f1",
    "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "aaecf769-af05-4b3a-b3ea-da4bc780cc75",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T14:51:35.328089Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e9402814-af20-4c05-9909-1ea5ab59bf96/cancel` → **200**

```json
{
  "command_id": "a9916070-b45c-4cfc-b7fc-1bd616efd0f9",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "45746135-b16b-4944-845e-98db1a314d86",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "68042b5f-0266-441d-aea7-b3c037be93f1",
    "order_id": "e9402814-af20-4c05-9909-1ea5ab59bf96",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "aaecf769-af05-4b3a-b3ea-da4bc780cc75",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:51:35.328089Z",
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
  "session_id": "f10d97b0-5890-4808-a1d0-0bb2df70cf8e",
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
  "last_heartbeat_at": "2026-10-30T14:51:31.48898Z",
  "last_location_at": "2026-10-30T14:51:31.48898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f10d97b0-5890-4808-a1d0-0bb2df70cf8e/close` → **200**

```json
{
  "command_id": "0d436e8a-1aa8-4249-89b8-47a7014c4d6a",
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
  "session_id": "825f249f-b10f-4ba5-9f48-9caa3f795738",
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
  "last_heartbeat_at": "2026-10-30T14:51:32.950965Z",
  "last_location_at": "2026-10-30T14:51:32.950965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/825f249f-b10f-4ba5-9f48-9caa3f795738/close` → **200**

```json
{
  "command_id": "47070c70-de72-44d3-b492-838114a3fbf2",
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

# Scenario: document-at-rest

## Oleh uploads a scan of his licence

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6431"
}
```

```json
{
  "challenge_id": "4edb65fb-a809-4232-8efa-ba15e00c601c",
  "expires_at": "2026-10-30T14:56:38.589074841Z",
  "resend_available_at": "2026-10-30T14:51:39.589074841Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "727339",
  "sent_at": "2026-10-30T14:51:38.591581265Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4edb65fb-a809-4232-8efa-ba15e00c601c",
  "code": "727339",
  "device_ref": "sandbox-6431"
}
```

```json
{
  "session_id": "9bf367ad-472f-4539-8300-9ee72eda8c9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Mjc5OCwiaWF0IjoxNzkzMzcxODk4LCJqdGkiOiJlZTFhOWE3MC0xODk1LTRmZDItYTFkYi02MzQzMDc0Nzc1N2MiLCJzaWQiOiI5YmYzNjdhZC00NzJmLTQ1MzktODMwMC05ZWU3MmVkYThjOWUifQ.ii4JJBoWYaM7z1fhCCdW1AAb1f20F2FnVYBaDi886R8",
  "access_expires_at": "2026-10-30T15:06:38.889240094Z",
  "refresh_token": "K9SQVwN6yRCbOb3vUqbV94x9U6HZ6xzNtrRTw8f9l-o",
  "refresh_expires_at": "2026-11-29T14:51:38.88873154Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "7c6eb2a5-ab89-4bfb-9c74-8165d872df93",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "fe5b7abb-47a1-4324-9884-c26c7f337e95",
  "upload_path": "/api/driver/v1/uploads/fe5b7abb-47a1-4324-9884-c26c7f337e95",
  "expires_at": "2026-10-30T15:06:39.174816306Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/fe5b7abb-47a1-4324-9884-c26c7f337e95` → **200**

```json
{
  "file_id": "fe5b7abb-47a1-4324-9884-c26c7f337e95",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/fe5b7abb-47a1-4324-9884-c26c7f337e95`, first bytes `425a4631872c7e82` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/fe5b7abb-47a1-4324-9884-c26c7f337e95` → **200**

SHA-256 uploaded `05f8dd1acafe3aee915488568e16e7419670e460d8cc65467d85a9c8fbfac45c`, downloaded `05f8dd1acafe3aee915488568e16e7419670e460d8cc65467d85a9c8fbfac45c`.

Done: document fe5b7abb-47a1-4324-9884-c26c7f337e95 is encrypted on disk and downloads unchanged.

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16933"
}
```

```json
{
  "challenge_id": "bda1879e-7cfb-4a2c-b437-fe69b9c77c95",
  "expires_at": "2026-10-30T14:56:39.541254026Z",
  "resend_available_at": "2026-10-30T14:51:40.541254026Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "277842",
  "sent_at": "2026-10-30T14:51:39.544775743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bda1879e-7cfb-4a2c-b437-fe69b9c77c95",
  "code": "277842",
  "device_ref": "sandbox-16933"
}
```

```json
{
  "session_id": "6d19e773-5bb6-439e-aff7-e4e316d0cd3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Mjc5OSwiaWF0IjoxNzkzMzcxODk5LCJqdGkiOiJhZjk0ZDZlOS1mOGZjLTQ4MzEtYTZiMi04NzMwZGVmZDE2NjgiLCJzaWQiOiI2ZDE5ZTc3My01YmI2LTQzOWUtYWZmNy1lNGUzMTZkMGNkM2UifQ.XhHQB3IPrp4aRDfpVBLvS7-ui9JgSfiaCv9gOfwm27M",
  "access_expires_at": "2026-10-30T15:06:39.885680668Z",
  "refresh_token": "MX39SMuhI70kk6gga-fQeZ6vzxB_lsFisxhuHMfjH3M",
  "refresh_expires_at": "2026-11-29T14:51:39.884971588Z",
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
  "device_ref": "sandbox-22724"
}
```

```json
{
  "challenge_id": "98e2362a-c473-47a4-8d1b-6d1d9f82e86c",
  "expires_at": "2026-10-30T14:56:40.421967609Z",
  "resend_available_at": "2026-10-30T14:51:41.421967609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "931408",
  "sent_at": "2026-10-30T14:51:40.424482395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98e2362a-c473-47a4-8d1b-6d1d9f82e86c",
  "code": "931408",
  "device_ref": "sandbox-22724"
}
```

```json
{
  "session_id": "8822408b-13da-4eaa-85bd-ce6ebacb6c8f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjgwMCwiaWF0IjoxNzkzMzcxOTAwLCJqdGkiOiIyZWI5NjVlNC0zZGMzLTQwZmYtOTkxYy1mZmQ1NTNiODAyYTIiLCJzaWQiOiI4ODIyNDA4Yi0xM2RhLTRlYWEtODViZC1jZTZlYmFjYjZjOGYifQ.AnelBcrMmtVsOZm5lewY-AlmvvMMQB4RbJSxiXNzm64",
  "access_expires_at": "2026-10-30T15:06:40.728541099Z",
  "refresh_token": "1cfpQhN-FiaxkKU2Al29ibA1fD-KMfPhY63H85mWG1s",
  "refresh_expires_at": "2026-11-29T14:51:40.727875396Z",
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
  "command_id": "bf906ed7-465c-422e-b2d7-9d67c0d053de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:41Z",
    "sequence": 1793371901301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
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
  "last_heartbeat_at": "2026-10-30T14:51:41.319064Z",
  "last_location_at": "2026-10-30T14:51:41.319064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-25520"
}
```

```json
{
  "challenge_id": "44399b15-6055-4d96-9e72-dfd4e7d50e44",
  "expires_at": "2026-10-30T14:56:41.595698611Z",
  "resend_available_at": "2026-10-30T14:51:42.595698611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "702630",
  "sent_at": "2026-10-30T14:51:41.598516783Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44399b15-6055-4d96-9e72-dfd4e7d50e44",
  "code": "702630",
  "device_ref": "sandbox-25520"
}
```

```json
{
  "session_id": "cfab1b3d-0e98-4ed0-96f6-fd69333b0d19",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjgwMSwiaWF0IjoxNzkzMzcxOTAxLCJqdGkiOiJmOWQxYzdmNS1kM2RkLTRjNjUtOGYzMy04MzRlYjY5ZmIzZDAiLCJzaWQiOiJjZmFiMWIzZC0wZTk4LTRlZDAtOTZmNi1mZDY5MzMzYjBkMTkifQ.wsxOBLp9lSxccMEi8DKwlAPts9209MT92YA8TMXxaIo",
  "access_expires_at": "2026-10-30T15:06:41.897031668Z",
  "refresh_token": "K2KalYHiGlFIafSIRYy7cDhqfdqgDF49Nk9Km2dHWcU",
  "refresh_expires_at": "2026-11-29T14:51:41.896180408Z",
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
  "command_id": "87fc217d-be62-4590-b7cd-de4aa870d2a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:42Z",
    "sequence": 1793371902459
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a726dfb0-a610-431c-b0ff-d1cb4f123656",
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
  "last_heartbeat_at": "2026-10-30T14:51:42.476205Z",
  "last_location_at": "2026-10-30T14:51:42.476205Z",
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
  "session_id": "58e3ed14-178c-485e-bc1e-be3a36d0950a",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4MDMsImlhdCI6MTc5MzM3MTkwMywianRpIjoiMWY0NTA2MWQtZjQ2My00NmU2LThkYWMtNDAyNGNkOGY1NjNiIiwic2lkIjoiNThlM2VkMTQtMTc4Yy00ODVlLWJjMWUtYmUzYTM2ZDA5NTBhIn0.Emsqc6Fdm0RnKCh4O5M5GVQH8ksX2eU2OBQc0HPDBFA",
  "access_expires_at": "2026-10-30T15:06:43.077568861Z",
  "refresh_token": "S_uxSyimipvYbTifCoAO88aK1nfMR40mFdITJtytH_o",
  "refresh_expires_at": "2026-10-31T02:51:43.077071075Z",
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
  "session_id": "532e3cfa-7acf-4689-b9f6-fcf882151cd9",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4MDMsImlhdCI6MTc5MzM3MTkwMywianRpIjoiMmEwMzk2YzctNzhkYS00OTk5LWFjZjgtNDJjMWFiYTY3NTdmIiwic2lkIjoiNTMyZTNjZmEtN2FjZi00Njg5LWI5ZjYtZmNmODgyMTUxY2Q5In0.QUX7yBzyxbfJJpF60T3GEu7HOz421Smk2Mdzl0m1b5w",
  "access_expires_at": "2026-10-30T15:06:43.669880022Z",
  "refresh_token": "KgGjhM7iO0VSu2Sf_c-mx4rfjdUUh8ijZLWzFEmgOF0",
  "refresh_expires_at": "2026-10-31T02:51:43.66933881Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683763023",
  "device_ref": "sandbox-4830"
}
```

```json
{
  "challenge_id": "489a8a7e-015a-415e-8153-ffdd78b7e04e",
  "expires_at": "2026-10-30T14:56:43.942398895Z",
  "resend_available_at": "2026-10-30T14:51:44.942398895Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683763023` → **200**

```json
{
  "phone": "+380683763023",
  "audience": "CLIENT",
  "code": "730483",
  "sent_at": "2026-10-30T14:51:43.944701769Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "489a8a7e-015a-415e-8153-ffdd78b7e04e",
  "code": "730483",
  "device_ref": "sandbox-4830"
}
```

```json
{
  "session_id": "060a3149-9e57-4abc-a90e-44c2844367b0",
  "subject": {
    "type": "CLIENT",
    "id": "31382f8a-110b-4485-870e-008fc589d7df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTM4MmY4YS0xMTBiLTQ0ODUtODcwZS0wMDhmYzU4OWQ3ZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyODA0LCJpYXQiOjE3OTMzNzE5MDQsImp0aSI6IjgxM2QwYjBmLWM2NTYtNGU1NS1hMjQyLWY2MDNkN2RkYjkzMiIsInNpZCI6IjA2MGEzMTQ5LTllNTctNGFiYy1hOTBlLTQ0YzI4NDQzNjdiMCJ9._lKjI81PhZ_IlJGwNQKw9CNHVmdnmK5GpLkwaY8jHy4",
  "access_expires_at": "2026-10-30T15:06:44.243445353Z",
  "refresh_token": "6gXkMwNJSxOSiLLvSx-biPMW8nRPuCze3IQ6YTZqIfU",
  "refresh_expires_at": "2026-11-29T14:51:44.24292056Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "adff42d0-8bb6-46b3-b55b-f1ac50e8ab6b",
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
  "id": "74cefeaf-28f9-4f6f-87bf-d1587f70e484",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:44.528208Z",
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
  "command_id": "a042b84b-2c53-424e-984f-9adaf76a5857",
  "quote_id": "74cefeaf-28f9-4f6f-87bf-d1587f70e484",
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
  "id": "f2464169-8f68-4737-a6e2-cf96697942eb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:44.824454Z",
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
    "id": "20e93dc8-81dc-44fc-9a55-06cc7d15f545",
    "order_id": "f2464169-8f68-4737-a6e2-cf96697942eb",
    "expires_at": "2026-10-30T14:51:59.828009Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:41.319064Z",
  "last_location_at": "2026-10-30T14:51:41.319064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/pause` → **200**

```json
{
  "command_id": "50a89448-0c20-4f67-bcb3-a6b280143ab4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:41.319064Z",
  "last_location_at": "2026-10-30T14:51:41.319064Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/20e93dc8-81dc-44fc-9a55-06cc7d15f545/accept` → **409**

```json
{
  "command_id": "66b7ea11-7fb2-4e1f-89ae-4b2f24996526"
}
```

```json
{
  "instance": "/api/driver/v1/offers/20e93dc8-81dc-44fc-9a55-06cc7d15f545/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "df555140-d9bb-4e3a-a72e-3651359888e6"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "66708951-41c5-4705-a6f3-0f7ba1fe985f",
    "order_id": "f2464169-8f68-4737-a6e2-cf96697942eb",
    "expires_at": "2026-10-30T14:52:00.700652Z",
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

`POST /api/driver/v1/offers/66708951-41c5-4705-a6f3-0f7ba1fe985f/reject` → **204**

```json
{
  "command_id": "af36e6b5-dad2-4778-b72b-981ca15aef88"
}
```

`GET /api/operator/v1/orders/f2464169-8f68-4737-a6e2-cf96697942eb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:51:44.825062Z",
      "actor": {
        "type": "CLIENT",
        "id": "31382f8a-110b-4485-870e-008fc589d7df",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f2464169-8f68-4737-a6e2-cf96697942eb",
        "quote_id": "74cefeaf-28f9-4f6f-87bf-d1587f70e484",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0c684bb2-87f6-4eb7-8e6e-9fc67d29c572"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:51:44.827206Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f2464169-8f68-4737-a6e2-cf96697942eb",
        "attempt_id": "f58546ef-e826-4e87-80e7-7ee18f590b12",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0c684bb2-87f6-4eb7-8e6e-9fc67d29c572"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:51:44.832203Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "20e93dc8-81dc-44fc-9a55-06cc7d15f545",
        "order_id": "f2464169-8f68-4737-a6e2-cf96697942eb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "0c684bb2-87f6-4eb7-8e6e-9fc67d29c572"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T14:51:45.699894Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "20e93dc8-81dc-44fc-9a55-06cc7d15f545",
        "order_id": "f2464169-8f68-4737-a6e2-cf96697942eb",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "5335bfa6-2033-4242-bb5a-70683ad18b68"
    },
```

`GET /api/operator/v1/orders/f2464169-8f68-4737-a6e2-cf96697942eb` → **200**

```json
{
  "id": "f2464169-8f68-4737-a6e2-cf96697942eb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:44.824454Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f2464169-8f68-4737-a6e2-cf96697942eb/cancel` → **200**

```json
{
  "command_id": "9ea084ee-1c18-4165-8f54-3e19e87ea335",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f2464169-8f68-4737-a6e2-cf96697942eb",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:44.824454Z",
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

E2: offer 20e93dc8-81dc-44fc-9a55-06cc7d15f545 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a726dfb0-a610-431c-b0ff-d1cb4f123656",
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
  "last_heartbeat_at": "2026-10-30T14:51:42.476205Z",
  "last_location_at": "2026-10-30T14:51:42.476205Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a726dfb0-a610-431c-b0ff-d1cb4f123656/close` → **200**

```json
{
  "command_id": "0934478f-144d-446c-9558-f84772f7a227",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:41.319064Z",
  "last_location_at": "2026-10-30T14:51:41.319064Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/resume` → **200**

```json
{
  "command_id": "a5bbbad8-f7ba-4ef2-8338-7b91d0a10f49",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
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
  "last_heartbeat_at": "2026-10-30T14:51:41.319064Z",
  "last_location_at": "2026-10-30T14:51:41.319064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:48Z",
    "sequence": 1793371908659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
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
  "last_heartbeat_at": "2026-10-30T14:51:48.676994Z",
  "last_location_at": "2026-10-30T14:51:48.676994Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "737eb329-1529-4286-8fac-20e1da0ae665",
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
  "id": "89d25116-cefe-4278-89bb-acda3f301664",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:48.967738Z",
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
  "command_id": "81d69e26-2efb-4f10-bc43-611e759b4708",
  "quote_id": "89d25116-cefe-4278-89bb-acda3f301664",
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
  "id": "977c44bf-e4a4-416e-b9f7-50b693e4bf3d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:49.271158Z",
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
    "id": "8bd8323c-a4ea-4090-83e2-1e8722e463c0",
    "order_id": "977c44bf-e4a4-416e-b9f7-50b693e4bf3d",
    "expires_at": "2026-10-30T14:52:04.274778Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:48.676994Z",
  "last_location_at": "2026-10-30T14:51:48.676994Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/8bd8323c-a4ea-4090-83e2-1e8722e463c0/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/8bd8323c-a4ea-4090-83e2-1e8722e463c0/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "b1a7aa0d-ba9b-40a6-91b2-535123d57c82"
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:48.676994Z",
  "last_location_at": "2026-10-30T14:51:48.676994Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/977c44bf-e4a4-416e-b9f7-50b693e4bf3d` → **200**

```json
{
  "id": "977c44bf-e4a4-416e-b9f7-50b693e4bf3d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:49.271158Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/977c44bf-e4a4-416e-b9f7-50b693e4bf3d` → **200**

```json
{
  "id": "977c44bf-e4a4-416e-b9f7-50b693e4bf3d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:49.271158Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/977c44bf-e4a4-416e-b9f7-50b693e4bf3d/cancel` → **200**

```json
{
  "command_id": "6476db2c-2425-411e-8d2b-8109e4938ea8",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "977c44bf-e4a4-416e-b9f7-50b693e4bf3d",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:49.271158Z",
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
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:48.676994Z",
  "last_location_at": "2026-10-30T14:51:48.676994Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/resume` → **200**

```json
{
  "command_id": "d0539fd5-3a55-45b7-b614-97eaf9952497",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:48.676994Z",
  "last_location_at": "2026-10-30T14:51:48.676994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:51Z",
    "sequence": 1793371911673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:51.690507Z",
  "last_location_at": "2026-10-30T14:51:51.690507Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b6ab1f2a-9c8e-4387-891b-8d57342863a7",
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
  "id": "e9dc6f09-03b7-49f1-850d-a1dad4d463ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:51.973945Z",
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
  "command_id": "6aa818d7-6d11-4ab6-8b16-279f00337703",
  "quote_id": "e9dc6f09-03b7-49f1-850d-a1dad4d463ff",
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
  "id": "39dcc6b3-b2d9-4c6a-8aea-89d749d50933",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:52.267842Z",
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
    "id": "ce22a49c-5365-46e6-85e4-26f6f1c86663",
    "order_id": "39dcc6b3-b2d9-4c6a-8aea-89d749d50933",
    "expires_at": "2026-10-30T14:52:07.270907Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:51.690507Z",
  "last_location_at": "2026-10-30T14:51:51.690507Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/ce22a49c-5365-46e6-85e4-26f6f1c86663/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/ce22a49c-5365-46e6-85e4-26f6f1c86663/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "6e00d165-ba30-4d44-b252-87612dd80f2c"
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:51.690507Z",
  "last_location_at": "2026-10-30T14:51:51.690507Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 2: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/39dcc6b3-b2d9-4c6a-8aea-89d749d50933` → **200**

```json
{
  "id": "39dcc6b3-b2d9-4c6a-8aea-89d749d50933",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:52.267842Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/39dcc6b3-b2d9-4c6a-8aea-89d749d50933` → **200**

```json
{
  "id": "39dcc6b3-b2d9-4c6a-8aea-89d749d50933",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:52.267842Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/39dcc6b3-b2d9-4c6a-8aea-89d749d50933/cancel` → **200**

```json
{
  "command_id": "c1a73dd5-1dba-4cbe-a5a5-5b1a08dcf5cd",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "39dcc6b3-b2d9-4c6a-8aea-89d749d50933",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:52.267842Z",
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
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:51.690507Z",
  "last_location_at": "2026-10-30T14:51:51.690507Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/resume` → **200**

```json
{
  "command_id": "04ad03b5-1ea1-49e2-839f-7d22b25110ed",
  "expected_version": 5
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:51.690507Z",
  "last_location_at": "2026-10-30T14:51:51.690507Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:54Z",
    "sequence": 1793371914656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:54.674064Z",
  "last_location_at": "2026-10-30T14:51:54.674064Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55c17b7e-7c32-4692-a23e-2362c84a131f",
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
  "id": "e07fe166-c1d4-4852-aaf5-a259f94b0199",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:54.971400Z",
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
  "command_id": "14e03846-35e1-4611-8dec-bbff217c0623",
  "quote_id": "e07fe166-c1d4-4852-aaf5-a259f94b0199",
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
  "id": "9553f993-9e3e-4d75-9cf7-aa46aa42a852",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:55.261233Z",
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
    "id": "81df206f-f279-4a00-9904-286a4ecab0d1",
    "order_id": "9553f993-9e3e-4d75-9cf7-aa46aa42a852",
    "expires_at": "2026-10-30T14:52:10.264252Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:54.674064Z",
  "last_location_at": "2026-10-30T14:51:54.674064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/81df206f-f279-4a00-9904-286a4ecab0d1/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/81df206f-f279-4a00-9904-286a4ecab0d1/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "90352b50-2449-4e21-a573-52b25667eb98"
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:54.674064Z",
  "last_location_at": "2026-10-30T14:51:54.674064Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 3: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/9553f993-9e3e-4d75-9cf7-aa46aa42a852` → **200**

```json
{
  "id": "9553f993-9e3e-4d75-9cf7-aa46aa42a852",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:55.261233Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9553f993-9e3e-4d75-9cf7-aa46aa42a852` → **200**

```json
{
  "id": "9553f993-9e3e-4d75-9cf7-aa46aa42a852",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:55.261233Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9553f993-9e3e-4d75-9cf7-aa46aa42a852/cancel` → **200**

```json
{
  "command_id": "92de1979-7e66-4e4e-aba7-79c925b62836",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9553f993-9e3e-4d75-9cf7-aa46aa42a852",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:55.261233Z",
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
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:54.674064Z",
  "last_location_at": "2026-10-30T14:51:54.674064Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/resume` → **200**

```json
{
  "command_id": "e448eda5-c947-444d-b59e-de7b7f3f4321",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:54.674064Z",
  "last_location_at": "2026-10-30T14:51:54.674064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:51:57Z",
    "sequence": 1793371917623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:57.640862Z",
  "last_location_at": "2026-10-30T14:51:57.640862Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3f0136a3-a830-43fc-9e14-653bfe48cf6d",
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
  "id": "8fce58d7-35eb-4ba5-b23a-695ea8095e67",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:56:57.930918Z",
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
  "command_id": "9da1fa4c-d98d-4005-a0e5-278876824824",
  "quote_id": "8fce58d7-35eb-4ba5-b23a-695ea8095e67",
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
  "id": "ae0d51b6-c0a5-4154-a103-b51b4e40bc5d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:58.220616Z",
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
    "id": "75ba2621-5a28-461a-80b1-925328c0bedc",
    "order_id": "ae0d51b6-c0a5-4154-a103-b51b4e40bc5d",
    "expires_at": "2026-10-30T14:52:13.223428Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:57.640862Z",
  "last_location_at": "2026-10-30T14:51:57.640862Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/75ba2621-5a28-461a-80b1-925328c0bedc/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/75ba2621-5a28-461a-80b1-925328c0bedc/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "4da65694-239c-460f-a571-3b198704d4fc"
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:57.640862Z",
  "last_location_at": "2026-10-30T14:51:57.640862Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 4: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/ae0d51b6-c0a5-4154-a103-b51b4e40bc5d` → **200**

```json
{
  "id": "ae0d51b6-c0a5-4154-a103-b51b4e40bc5d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:58.220616Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ae0d51b6-c0a5-4154-a103-b51b4e40bc5d` → **200**

```json
{
  "id": "ae0d51b6-c0a5-4154-a103-b51b4e40bc5d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:51:58.220616Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ae0d51b6-c0a5-4154-a103-b51b4e40bc5d/cancel` → **200**

```json
{
  "command_id": "1482cc9e-760a-4a31-b739-d4258d27cbc3",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ae0d51b6-c0a5-4154-a103-b51b4e40bc5d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:51:58.220616Z",
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
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:57.640862Z",
  "last_location_at": "2026-10-30T14:51:57.640862Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/resume` → **200**

```json
{
  "command_id": "bd02a495-b717-4b4e-b890-484deb045774",
  "expected_version": 9
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:51:57.640862Z",
  "last_location_at": "2026-10-30T14:51:57.640862Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:52:00Z",
    "sequence": 1793371920601
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:00.617922Z",
  "last_location_at": "2026-10-30T14:52:00.617922Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd54bd06-12aa-4a5f-8155-321dd2d9c37e",
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
  "id": "7c57b031-d2cd-41be-8586-b20b128bf198",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:57:00.907098Z",
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
  "command_id": "226d96b1-c32e-47ba-9790-0859dc6b33bb",
  "quote_id": "7c57b031-d2cd-41be-8586-b20b128bf198",
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
  "id": "0433b4cf-c1b1-4120-ba50-0aea91acfcd6",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:52:01.20138Z",
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
    "id": "152168de-3c27-4b84-9ad0-a9a7f8413033",
    "order_id": "0433b4cf-c1b1-4120-ba50-0aea91acfcd6",
    "expires_at": "2026-10-30T14:52:16.204158Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:00.617922Z",
  "last_location_at": "2026-10-30T14:52:00.617922Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/152168de-3c27-4b84-9ad0-a9a7f8413033/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/152168de-3c27-4b84-9ad0-a9a7f8413033/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "654f9c32-eb64-40d2-ad8b-2b4212ccfdc4"
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:00.617922Z",
  "last_location_at": "2026-10-30T14:52:00.617922Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 5: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/0433b4cf-c1b1-4120-ba50-0aea91acfcd6` → **200**

```json
{
  "id": "0433b4cf-c1b1-4120-ba50-0aea91acfcd6",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:52:01.20138Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0433b4cf-c1b1-4120-ba50-0aea91acfcd6` → **200**

```json
{
  "id": "0433b4cf-c1b1-4120-ba50-0aea91acfcd6",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:52:01.20138Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0433b4cf-c1b1-4120-ba50-0aea91acfcd6/cancel` → **200**

```json
{
  "command_id": "ff4ef186-442f-4269-bcd1-24f0f2204edc",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0433b4cf-c1b1-4120-ba50-0aea91acfcd6",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "31382f8a-110b-4485-870e-008fc589d7df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:52:01.20138Z",
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

E5: 0 rounds won by the accept, 5 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:00.617922Z",
  "last_location_at": "2026-10-30T14:52:00.617922Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/resume` → **200**

```json
{
  "command_id": "eea334c6-57fa-488e-a43d-c38ef9f72d7e",
  "expected_version": 11
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:00.617922Z",
  "last_location_at": "2026-10-30T14:52:00.617922Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T14:52:03Z",
    "sequence": 1793371923554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:03.571344Z",
  "last_location_at": "2026-10-30T14:52:03.571344Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:52:03Z",
    "sequence": 1793371923855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:03.872765Z",
  "last_location_at": "2026-10-30T14:52:03.872765Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The support map shows when Near was last heard from

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T14:52:04.169312753Z",
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
        "lat": 50.4519,
        "lon": 30.5234
      },
      "last_location_at": "2026-10-30T14:52:03.872765Z",
      "last_heartbeat_at": "2026-10-30T14:52:03.872765Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (0/5), E4 and last_heartbeat_at 2026-10-30T14:52:03.872765Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:52:03.872765Z",
  "last_location_at": "2026-10-30T14:52:03.872765Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e6dffd-d5e9-44aa-a671-cbf4aa72ed94/close` → **200**

```json
{
  "command_id": "2544ef05-b217-4dbf-989d-4bc1185f85a5",
  "expected_version": 12
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
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "session_id": "c7f43597-3dea-4a0c-8f71-7da3eb2f66db",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4MjUsImlhdCI6MTc5MzM3MTkyNSwianRpIjoiOTIwMjMyZjYtODFhOC00NDJlLTlhM2MtMGZkYWIyODQ2ODBkIiwic2lkIjoiYzdmNDM1OTctM2RlYS00YTBjLThmNzEtN2RhM2ViMmY2NmRiIn0.LIujrBPyFTHTylktMvvfITF8ivonFVoZmQEubvNrgf0",
  "access_expires_at": "2026-10-30T15:07:05.661040102Z",
  "refresh_token": "629uVx3-ZQWSRSxXKRfqB-A42fw4R6tvv_piPr6QsJ0",
  "refresh_expires_at": "2026-10-31T02:52:05.660579042Z",
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
  "command_id": "16d01926-4692-46c9-a6da-afb5693db74d",
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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T14:52:06.239681Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "7202b915-a960-415b-aba2-0f39c5fde776",
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
  "correlation_id": "127c58e4-3f93-43b0-b34d-7504f9262627",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "33ac0567-3781-4e59-b5c1-30813159ab76",
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
  "correlation_id": "78d40b40-0817-4fdb-837c-984d65a8e6f3"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633858729",
  "device_ref": "sandbox-15828"
}
```

```json
{
  "challenge_id": "5ec782e7-55b1-45f0-948e-e14ee11f45b0",
  "expires_at": "2026-10-30T14:57:07.104649611Z",
  "resend_available_at": "2026-10-30T14:52:08.104649611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633858729` → **200**

```json
{
  "phone": "+380633858729",
  "audience": "CLIENT",
  "code": "168851",
  "sent_at": "2026-10-30T14:52:07.108589959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ec782e7-55b1-45f0-948e-e14ee11f45b0",
  "code": "168851",
  "device_ref": "sandbox-15828"
}
```

```json
{
  "session_id": "6c914d62-81f3-4bf8-a62e-45df46210feb",
  "subject": {
    "type": "CLIENT",
    "id": "81eb1b04-7260-4d29-af36-e04ce305687d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MWViMWIwNC03MjYwLTRkMjktYWYzNi1lMDRjZTMwNTY4N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyODI3LCJpYXQiOjE3OTMzNzE5MjcsImp0aSI6IjVlMTFiN2VjLTUxY2MtNDY5Ny05MGRlLWY2OTI3NGQyYWIyZCIsInNpZCI6IjZjOTE0ZDYyLTgxZjMtNGJmOC1hNjJlLTQ1ZGY0NjIxMGZlYiJ9.Lr75XHd-cj2RZSiTV2tO-FK2Gd1sqyEZpvk53Uv95YA",
  "access_expires_at": "2026-10-30T15:07:07.4155976Z",
  "refresh_token": "ig1NVtvuT42o3BS0N0TPdVp1nJfdkhqZEifVUF8gO88",
  "refresh_expires_at": "2026-11-29T14:52:07.415088001Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8cc2adb7-8882-45fb-a872-cf0861421814",
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
  "id": "19605516-d5d5-44f6-b128-b339bc7ba2cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:57:07.697527Z",
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
  "command_id": "97d90f0c-22c4-44e2-b359-44a3c6dff167",
  "quote_id": "19605516-d5d5-44f6-b128-b339bc7ba2cd",
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
  "correlation_id": "13c4c6a3-6526-471a-bad7-cc2b0d9ad111"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f6cf8f68-d8fd-4eda-8d61-8d444ed7d631",
  "quote_id": "19605516-d5d5-44f6-b128-b339bc7ba2cd",
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
  "id": "b8d6ba44-ed57-4543-8dd0-564d07373587",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "81eb1b04-7260-4d29-af36-e04ce305687d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:52:08.269663Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b8d6ba44-ed57-4543-8dd0-564d07373587/cancel` → **200**

```json
{
  "command_id": "0af56bd0-503e-476d-a068-c3dbb259baf1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b8d6ba44-ed57-4543-8dd0-564d07373587",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "81eb1b04-7260-4d29-af36-e04ce305687d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:52:08.269663Z",
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
  "command_id": "6ce84431-2190-49f1-9a44-46e12779ff03",
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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T14:52:08.875407Z"
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
      "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T14:52:08.875407Z"
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
  "device_ref": "sandbox-27450"
}
```

```json
{
  "challenge_id": "b54a99dd-a7ac-4149-9d5f-05dbee686d04",
  "expires_at": "2026-10-30T14:57:09.737133262Z",
  "resend_available_at": "2026-10-30T14:52:10.737133262Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "051252",
  "sent_at": "2026-10-30T14:52:09.73955896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b54a99dd-a7ac-4149-9d5f-05dbee686d04",
  "code": "051252",
  "device_ref": "sandbox-27450"
}
```

```json
{
  "session_id": "b8ae3c7d-818b-4fbd-8b59-8d92d24743e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MjgzMCwiaWF0IjoxNzkzMzcxOTMwLCJqdGkiOiI0ZmZlMWQ2ZC02ZmUzLTQxMmMtOTgyNy02ZDNlOGZkMDdiZTUiLCJzaWQiOiJiOGFlM2M3ZC04MThiLTRmYmQtOGI1OS04ZDkyZDI0NzQzZTgifQ.CpqdSlj_QaGanTdDTkQv6zxhvqkrBksrfkiUyiDWAW4",
  "access_expires_at": "2026-10-30T15:07:10.101918521Z",
  "refresh_token": "aDsTzC9_a62AWLCYCCvm27aLB3sIvySue0gbYibDBCE",
  "refresh_expires_at": "2026-11-29T14:52:10.101168688Z",
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
  "command_id": "a27da0ba-b3d1-4395-8d5d-160d4857a11c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:52:10Z",
    "sequence": 1793371930698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:52:10.714859Z",
  "last_location_at": "2026-10-30T14:52:10.714859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678211209",
  "device_ref": "sandbox-12672"
}
```

```json
{
  "challenge_id": "a7246791-3715-4bc0-8858-3b78fba45486",
  "expires_at": "2026-10-30T14:57:10.998232837Z",
  "resend_available_at": "2026-10-30T14:52:11.998232837Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678211209` → **200**

```json
{
  "phone": "+380678211209",
  "audience": "CLIENT",
  "code": "228983",
  "sent_at": "2026-10-30T14:52:11.000580662Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7246791-3715-4bc0-8858-3b78fba45486",
  "code": "228983",
  "device_ref": "sandbox-12672"
}
```

```json
{
  "session_id": "dd726a2e-6487-4913-af8b-6bbb48972960",
  "subject": {
    "type": "CLIENT",
    "id": "245835d2-f5a9-4683-8652-f992f7f3f6af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDU4MzVkMi1mNWE5LTQ2ODMtODY1Mi1mOTkyZjdmM2Y2YWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyODMxLCJpYXQiOjE3OTMzNzE5MzEsImp0aSI6IjI5N2I0NThiLTllNDItNDdkNy05ZTJmLWVjNWExM2RkNjVhNiIsInNpZCI6ImRkNzI2YTJlLTY0ODctNDkxMy1hZjhiLTZiYmI0ODk3Mjk2MCJ9.J1X7JwaMhYT2mvSXQ9Zxajd3IOSeKaJVzhoVzabKMRM",
  "access_expires_at": "2026-10-30T15:07:11.303041768Z",
  "refresh_token": "FVcUUtY-khfuVokbpIbXrX6mIVmj9bCuTziP1C3Bqnk",
  "refresh_expires_at": "2026-11-29T14:52:11.302486333Z",
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
  "command_id": "027deabe-b43f-4f38-a7db-b8bda477d782",
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
  "id": "05a237c7-3719-4da1-ad92-f7e6d20defeb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:57:11.858080Z",
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
  "command_id": "1437416d-22d6-4686-8811-117acbe19fcc",
  "platform": "ANDROID",
  "token": "sandbox-driver-f410318d-4b18-4b87-a04a-4b022b814ed5"
}
```

```json
{
  "id": "031d5616-8cd8-4deb-8155-063f867d2641",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T14:52:12.156431Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "db5630b3-522a-4ea7-830b-3de7ffec88c5",
  "platform": "ANDROID",
  "token": "sandbox-rider-310f730b-45a4-4d32-803a-bda4eb96cdbe"
}
```

```json
{
  "id": "8e1a5ff0-139e-4907-84b1-f07d45865f9d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T14:52:12.436402Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "869fb18a-18f3-4e78-bcdd-6a607c374083",
  "quote_id": "05a237c7-3719-4da1-ad92-f7e6d20defeb",
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
  "id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "245835d2-f5a9-4683-8652-f992f7f3f6af",
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
  "created_at": "2026-10-30T14:52:12.730157Z",
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
    "id": "e98bda83-e658-4b72-b165-38870f4373d6",
    "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
    "expires_at": "2026-10-30T14:52:27.73345Z",
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

`POST /api/driver/v1/offers/e98bda83-e658-4b72-b165-38870f4373d6/accept` → **200**

```json
{
  "command_id": "43fc1f69-04bb-4aab-8de4-386bb6a96cdc"
}
```

```json
{
  "id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T14:52:12.706Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T14:52:12.706Z` → **200**

```json
[
  {
    "at": "2026-10-30T14:52:14.538165583Z",
    "token_suffix": "814ed5",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
      "order_version": "2",
      "event_id": "64543a72-f371-456a-ab1a-6c1da1624243",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678211209&after=2026-10-30T14:52:12.706Z` → **200**

```json
[
  {
    "at": "2026-10-30T14:52:14.535464526Z",
    "token_suffix": "96cdbe",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
      "order_version": "3",
      "event_id": "7588ed6c-724e-4582-ba1a-ed825484a843",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b/messages` → **201**

```json
{
  "command_id": "884db9e4-12df-42de-a45a-47be14399293",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "e73a5bb7-0904-40ee-b551-61b7cf43c249",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T14:52:14.674864717Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "assignment_id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
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

`POST /api/driver/v1/trips/6c17089b-cf70-4e7d-9df8-13038e5b8b2c/messages` → **201**

```json
{
  "command_id": "b9c17c50-349c-4c25-8fae-ffdd54bc83c2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "cd38b6de-3c6b-48a6-aaee-5a3de9e3f87a",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T14:52:15.221209484Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6c17089b-cf70-4e7d-9df8-13038e5b8b2c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678211209"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:52:16Z",
    "sequence": 1793371936673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:52:16.085733Z",
  "last_location_at": "2026-10-30T14:52:16.085733Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "assignment_id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
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

`POST /api/driver/v1/trips/6c17089b-cf70-4e7d-9df8-13038e5b8b2c/arrive` → **200**

```json
{
  "command_id": "3a263e31-873f-4dcd-91a7-42325b830185",
  "expected_version": 0
}
```

```json
{
  "id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "assignment_id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
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
  "arrived_at": "2026-10-30T14:52:16.646794Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c17089b-cf70-4e7d-9df8-13038e5b8b2c/start` → **200**

```json
{
  "command_id": "aeb0359b-0339-4f66-83c1-9ea429de6ff4",
  "expected_version": 1
}
```

```json
{
  "id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "assignment_id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
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
  "arrived_at": "2026-10-30T14:52:16.646794Z",
  "started_at": "2026-10-30T14:52:16.935128Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:53:05Z",
    "sequence": 1793371985238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:53:05.255677Z",
  "last_location_at": "2026-10-30T14:53:05.255677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6c17089b-cf70-4e7d-9df8-13038e5b8b2c/complete` → **200**

```json
{
  "command_id": "15dac8ea-26d8-4fea-af70-6ab77d8a9fd5",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:53:05Z",
  "cash_received": true
}
```

```json
{
  "id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "assignment_id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
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
  "arrived_at": "2026-10-30T14:52:16.646794Z",
  "started_at": "2026-10-30T14:52:16.935128Z",
  "completed_at": "2026-10-30T14:53:05.539588Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b` → **200**

```json
{
  "id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "short_number": 20,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "245835d2-f5a9-4683-8652-f992f7f3f6af",
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
    "id": "f3b7041e-d403-468a-90a3-f49f28d07e6a",
    "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:52:12.730157Z",
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
    "id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
    "short_number": 20,
    "status": "FULFILLED",
    "created_at": "2026-10-30T14:52:12.730157Z",
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
    "id": "6c17089b-cf70-4e7d-9df8-13038e5b8b2c",
    "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
    "order_short_number": 20,
    "created_at": "2026-10-30T14:52:13.306064Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d5c9291e-67ad-4487-b69b-59dea37f0cb7",
    "order_id": "8256eb72-5586-4514-87af-1f00364a486e",
    "order_short_number": 9,
    "created_at": "2026-10-30T14:49:03.076894Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7a16c4e5-b9c9-4f74-bc38-50aa68319112",
    "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
    "order_short_number": 4,
    "created_at": "2026-10-30T14:47:32.693044Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8c8b08c7-50e1-4bce-99cc-843ba6f99803",
    "order_id": "a79ad942-6e5a-41b7-b824-7791ad53772c",
    "order_short_number": 2,
    "created_at": "2026-10-30T14:43:42.261874Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2044c6dd-653b-4076-8302-52c0983a6b87",
    "order_id": "794a7122-bc6b-4dc1-9165-c8378b6b8e07",
    "order_short_number": 1,
    "created_at": "2026-10-30T14:43:32.324602Z",
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

`GET /api/rider/v1/orders/1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b/tip` → **200**

```json
{
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
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
  "available_until": "2026-10-31T14:53:05.539588Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b/tip` → **201**

```json
{
  "command_id": "430873bd-8fff-452f-a49a-c7b2cd66471d",
  "amount_minor": 1100
}
```

```json
{
  "id": "4112fca8-1968-467f-b015-5cfcd698377b",
  "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T14:53:10.527751Z"
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
  "session_id": "07dce200-1c7b-4236-8734-d8dafaeb9ca8",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4OTEsImlhdCI6MTc5MzM3MTk5MSwianRpIjoiMmM3Y2ZmNWQtOTExYy00YTAyLWIwYzUtM2JiMTFlNmRhZDYyIiwic2lkIjoiMDdkY2UyMDAtMWM3Yi00MjM2LTg3MzQtZDhkYWZhZWI5Y2E4In0.os-JoW2snXQKwjMDvS9IpOdi8EOyVDtzS_VhW6kVjGo",
  "access_expires_at": "2026-10-30T15:08:11.129580502Z",
  "refresh_token": "NuJqJJcbofLNmiOKIjtYB2VrptxTfuWGiGm4RHJOSPc",
  "refresh_expires_at": "2026-10-31T02:53:11.128772784Z",
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
        "created": 19,
        "fulfilled": 8,
        "cancelled": 11,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 18,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 17,
          "CARD": 2
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
          "STAFF": 7
        }
      }
    }
  ],
  "total": {
    "created": 19,
    "fulfilled": 8,
    "cancelled": 11,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 18,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 17,
      "CARD": 2
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
      "STAFF": 7
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 7
    },
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
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
  "generated_at": "2026-10-30T14:53:11.407080605Z"
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
  "generated_at": "2026-10-30T14:53:11.688008225Z"
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
  "session_id": "c5f972aa-ea71-451c-a040-e160b0239455",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4OTIsImlhdCI6MTc5MzM3MTk5MiwianRpIjoiNzUwZWY0NzQtYWRjZS00MmEwLThlNmItODQ4ZjE5YmE0MjYyIiwic2lkIjoiYzVmOTcyYWEtZWE3MS00NTFjLWEwNDAtZTE2MGIwMjM5NDU1In0.UKBZPuncCESGNklOWGFa64yVAIDJi9bhUdmzUzFiXt4",
  "access_expires_at": "2026-10-30T15:08:12.294737388Z",
  "refresh_token": "JBh3nh7_1hnbCulxeFdVlVuQW77zDXm7Ka1b347B5aM",
  "refresh_expires_at": "2026-10-31T02:53:12.293712341Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:52:12.730807Z",
      "actor": {
        "type": "CLIENT",
        "id": "245835d2-f5a9-4683-8652-f992f7f3f6af",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
        "quote_id": "05a237c7-3719-4da1-ad92-f7e6d20defeb",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "269a0f47-c16d-4e04-85de-d7371b40368e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:52:12.732744Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
        "attempt_id": "7602d7a9-1ce4-4e77-9ed6-78ca6abc09f9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "269a0f47-c16d-4e04-85de-d7371b40368e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:52:12.735301Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e98bda83-e658-4b72-b165-38870f4373d6",
        "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "269a0f47-c16d-4e04-85de-d7371b40368e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:52:13.307387Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e98bda83-e658-4b72-b165-38870f4373d6",
        "order_id": "1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f3b7041e-d403-468a-90a3-f49f28d07e6a"
      },
      "correlation_id": "c3996ef6-2c5a-470f-9abb-8673985fa78e"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T14:53:12.859375863Z",
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
      "last_location_at": "2026-10-30T14:53:05.255677Z",
      "last_heartbeat_at": "2026-10-30T14:53:05.255677Z",
      "order_id": null
    }
  ]
}
```

Done: order 1fdd2304-0b55-4dff-8aa4-5fc3d8eabc8b.

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
  "session_id": "375995ea-47b8-455d-b649-32e6ee8f1d70",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4OTMsImlhdCI6MTc5MzM3MTk5MywianRpIjoiZjYxYjNiOTEtNTFlNi00OWI2LWEyNWYtZTQxNjgwNDNhM2IxIiwic2lkIjoiMzc1OTk1ZWEtNDdiOC00NTVkLWI2NDktMzJlNmVlOGYxZDcwIn0.73q_cMTghTY4Xw4o1E1dg38oDPjp2lPEUdZYAP3O5V4",
  "access_expires_at": "2026-10-30T15:08:13.46833618Z",
  "refresh_token": "QZDue2SiiX6cThnvPN4xPVB05UZ0JwYGi7-zzpxL7P8",
  "refresh_expires_at": "2026-10-31T02:53:13.467814264Z",
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
  "command_id": "2a14a873-edf3-46ad-a60a-a5282fbdb4b7",
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
  "timestamp": "2026-10-30T14:53:14.000+0000",
  "channel": {
    "id": "1730052000.1477728003",
    "linkedid": "1730052000.1477728003",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670904547"
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
  "timestamp": "2026-10-30T14:53:14.000+0000",
  "channel": {
    "id": "1730052000.1477728003",
    "linkedid": "1730052000.1477728003",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670904547"
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
  "session_id": "a2824779-3b47-4b1a-9d3b-68063c6be351",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzI4OTQsImlhdCI6MTc5MzM3MTk5NCwianRpIjoiMmRkYzhlZmItOGJiOS00ZTNkLWE2NTQtNjM1MGQ0NmM5NDdmIiwic2lkIjoiYTI4MjQ3NzktM2I0Ny00YjFhLTlkM2ItNjgwNjNjNmJlMzUxIn0.ZK4oWnBtCrrzRRHy6rUvvnir6v4mjD0f-SSZxaWABbY",
  "access_expires_at": "2026-10-30T15:08:14.668622277Z",
  "refresh_token": "42HS4VTKjG4J42zVvfBZ3g8sHh7yImxjzs_Kta7zzzA",
  "refresh_expires_at": "2026-10-31T02:53:14.668062854Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "22b77f02-406c-432a-8a46-8a04a1e8f214",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670904547",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:53:14Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/22b77f02-406c-432a-8a46-8a04a1e8f214/answer` → **200**

```json
{
  "command_id": "35a58bfa-3f3a-4b10-85be-c3635bf48b37"
}
```

```json
{
  "id": "22b77f02-406c-432a-8a46-8a04a1e8f214",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670904547",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "order_ids": [],
  "started_at": "2026-10-30T14:53:14Z",
  "answered_at": "2026-10-30T14:53:15.250846Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1477728003",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "187eb5f4-489c-4d9a-8879-4e88ce9b01cd",
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
  "id": "b4056577-d1a7-42bd-8da3-95b78c99c352",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:58:15.564824Z",
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
  "command_id": "d09de7af-05ed-4ebf-99b4-f2903d729f8f",
  "quote_id": "b4056577-d1a7-42bd-8da3-95b78c99c352",
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
    "phone": "+380670904547"
  },
  "call_id": "22b77f02-406c-432a-8a46-8a04a1e8f214"
}
```

```json
{
  "id": "72e27718-c1fc-4d51-90b8-e47bf3d4e6a0",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:53:15.856295Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670904547"
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
    "id": "1730052000.1477728003",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "22b77f02-406c-432a-8a46-8a04a1e8f214",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670904547",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [
        "72e27718-c1fc-4d51-90b8-e47bf3d4e6a0"
      ],
      "started_at": "2026-10-30T14:53:14Z",
      "answered_at": "2026-10-30T14:53:15.250846Z",
      "ended_at": "2026-10-30T14:53:16.173799Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "6dd7dea9-c886-4357-a085-1c9281e04d59",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675749485",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [],
      "started_at": "2026-10-30T14:47:23.830574Z",
      "answered_at": "2026-10-30T14:47:24.149991Z",
      "ended_at": "2026-10-30T14:47:24.457805Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:47:27.310607Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/72e27718-c1fc-4d51-90b8-e47bf3d4e6a0` → **200**

```json
{
  "id": "72e27718-c1fc-4d51-90b8-e47bf3d4e6a0",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:53:15.856295Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670904547"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/72e27718-c1fc-4d51-90b8-e47bf3d4e6a0` → **200**

```json
{
  "id": "72e27718-c1fc-4d51-90b8-e47bf3d4e6a0",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:53:15.856295Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670904547"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/72e27718-c1fc-4d51-90b8-e47bf3d4e6a0/cancel` → **200**

```json
{
  "command_id": "fbac614f-d312-4d2a-8477-eaed67093a24",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "72e27718-c1fc-4d51-90b8-e47bf3d4e6a0",
  "short_number": 21,
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
  "created_at": "2026-10-30T14:53:15.856295Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670904547"
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

Done: call 22b77f02-406c-432a-8a46-8a04a1e8f214 with order 72e27718-c1fc-4d51-90b8-e47bf3d4e6a0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15407"
}
```

```json
{
  "challenge_id": "4ebb88a1-9c73-4a70-a2bc-0f17e3db05f4",
  "expires_at": "2026-10-30T14:58:17.383148657Z",
  "resend_available_at": "2026-10-30T14:53:18.383148657Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "551115",
  "sent_at": "2026-10-30T14:53:17.386384252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ebb88a1-9c73-4a70-a2bc-0f17e3db05f4",
  "code": "551115",
  "device_ref": "sandbox-15407"
}
```

```json
{
  "session_id": "d5176d0e-6eae-4dec-9e1f-5e97dded4f06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3Mjg5NywiaWF0IjoxNzkzMzcxOTk3LCJqdGkiOiIxMTU4YTdlOC05NTU5LTQ5YTktYmE4YS1iNzUyZTczYTJhOWQiLCJzaWQiOiJkNTE3NmQwZS02ZWFlLTRkZWMtOWUxZi01ZTk3ZGRlZDRmMDYifQ.YYYivAccKVcsQ9XSgNvXj867bLwvwgNx0wJJqXxqzr8",
  "access_expires_at": "2026-10-30T15:08:17.686284409Z",
  "refresh_token": "MBNPguGuNMYOxqG6DOP3AZQ9whgIRAmDDEm9Lp61wkY",
  "refresh_expires_at": "2026-11-29T14:53:17.685473226Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:53:05.255677Z",
  "last_location_at": "2026-10-30T14:53:05.255677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/handover` → **200**

```json
{
  "command_id": "95d5e481-f2ce-4b61-9801-4f82ba765e1c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:53:05.255677Z",
  "last_location_at": "2026-10-30T14:53:05.255677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:54:44Z",
    "sequence": 1793372084532
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:54:44.549292Z",
  "last_location_at": "2026-10-30T14:54:44.549292Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662576017",
  "device_ref": "sandbox-32205"
}
```

```json
{
  "challenge_id": "ecd08fcc-86f3-44a9-8f6e-fd71c3032b9c",
  "expires_at": "2026-10-30T14:59:44.821117871Z",
  "resend_available_at": "2026-10-30T14:54:45.821117871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662576017` → **200**

```json
{
  "phone": "+380662576017",
  "audience": "CLIENT",
  "code": "642831",
  "sent_at": "2026-10-30T14:54:44.823549409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecd08fcc-86f3-44a9-8f6e-fd71c3032b9c",
  "code": "642831",
  "device_ref": "sandbox-32205"
}
```

```json
{
  "session_id": "f7bd3e5e-f04d-4fd4-b4a4-467b90ca9dbf",
  "subject": {
    "type": "CLIENT",
    "id": "0761acb7-3ea3-4144-8325-f074c9054549"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzYxYWNiNy0zZWEzLTQxNDQtODMyNS1mMDc0YzkwNTQ1NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcyOTg1LCJpYXQiOjE3OTMzNzIwODUsImp0aSI6ImEzMDMyMzA2LTkwY2QtNDdkNS1hNjYxLWJmZDNmODljM2VlOSIsInNpZCI6ImY3YmQzZTVlLWYwNGQtNGZkNC1iNGE0LTQ2N2I5MGNhOWRiZiJ9._ReUO0TJCLAsX0HR8LSosjnkkJwk3fTpbFVNMAaLp94",
  "access_expires_at": "2026-10-30T15:09:45.118160865Z",
  "refresh_token": "bilHZdBenxiBfeJX_-UndIqRLpaiyLSAcVs5Jk6bZCo",
  "refresh_expires_at": "2026-11-29T14:54:45.117454235Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9a8211f3-c611-4544-b3ea-1a8d33f03bb6",
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
  "id": "42a96569-80e9-43cf-88a7-124a8ec9e4cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:59:45.397350Z",
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
  "command_id": "20ae0345-838c-4cdd-9e68-8214daeba2e2",
  "quote_id": "42a96569-80e9-43cf-88a7-124a8ec9e4cb",
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
  "id": "eab8f206-518a-4636-9298-a22ec9256920",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0761acb7-3ea3-4144-8325-f074c9054549",
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
  "created_at": "2026-10-30T14:54:45.688298Z",
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
    "id": "91feead3-c005-41a2-bcf0-38665c0627fb",
    "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
    "expires_at": "2026-10-30T14:55:00.691785Z",
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

`POST /api/driver/v1/offers/91feead3-c005-41a2-bcf0-38665c0627fb/accept` → **200**

```json
{
  "command_id": "c8d8867a-e049-4eed-a30a-989468caa965"
}
```

```json
{
  "id": "635b39bb-42ee-47be-bf0f-34884d591527",
  "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2ee9de9-6a55-43f1-91dc-95d386b6c4eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2ee9de9-6a55-43f1-91dc-95d386b6c4eb",
  "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
  "assignment_id": "635b39bb-42ee-47be-bf0f-34884d591527",
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

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:54:46Z",
    "sequence": 1793372086822
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:54:46.839401Z",
  "last_location_at": "2026-10-30T14:54:46.839401Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b2ee9de9-6a55-43f1-91dc-95d386b6c4eb/arrive` → **200**

```json
{
  "command_id": "93e0915d-af27-41a5-99ef-ca3c41066704",
  "expected_version": 0
}
```

```json
{
  "id": "b2ee9de9-6a55-43f1-91dc-95d386b6c4eb",
  "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
  "assignment_id": "635b39bb-42ee-47be-bf0f-34884d591527",
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
  "arrived_at": "2026-10-30T14:54:47.11931Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b2ee9de9-6a55-43f1-91dc-95d386b6c4eb/start` → **200**

```json
{
  "command_id": "daf3756a-29b1-48ab-8311-a223aea12905",
  "expected_version": 1
}
```

```json
{
  "id": "b2ee9de9-6a55-43f1-91dc-95d386b6c4eb",
  "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
  "assignment_id": "635b39bb-42ee-47be-bf0f-34884d591527",
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
  "arrived_at": "2026-10-30T14:54:47.11931Z",
  "started_at": "2026-10-30T14:54:47.420961Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:55:46Z",
    "sequence": 1793372146718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:55:46.735312Z",
  "last_location_at": "2026-10-30T14:55:46.735312Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-2491"
}
```

```json
{
  "challenge_id": "b1f1a975-e9e4-442e-9601-4fb6eb9b54a0",
  "expires_at": "2026-10-30T15:00:47.01106951Z",
  "resend_available_at": "2026-10-30T14:55:48.01106951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "034935",
  "sent_at": "2026-10-30T14:55:47.014544331Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1f1a975-e9e4-442e-9601-4fb6eb9b54a0",
  "code": "034935",
  "device_ref": "sandbox-2491"
}
```

```json
{
  "session_id": "3fc4b39e-b496-4470-bb94-b5d07c970f46",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzA0NywiaWF0IjoxNzkzMzcyMTQ3LCJqdGkiOiI1MmU1ZTk0MS0zNmMwLTRmMDUtOTZhMC1lMTgwMzVjZjFkMzYiLCJzaWQiOiIzZmM0YjM5ZS1iNDk2LTQ0NzAtYmI5NC1iNWQwN2M5NzBmNDYifQ._esaUqKvr1AqxM2_R7uDDC24Oae1manNpsIVfz56BBc",
  "access_expires_at": "2026-10-30T15:10:47.307630764Z",
  "refresh_token": "Agr63w5RnEO-b6Ou_DLg7sDMl1KJxKuqgQgtHtRGz2Y",
  "refresh_expires_at": "2026-11-29T14:55:47.307114338Z",
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
  "command_id": "ff9786c6-e8c1-47e0-adce-ee057c2cc072",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:55:47Z",
    "sequence": 1793372147882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fd4d0031-2ddb-40d8-b75a-1441bc876a7d",
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
  "last_heartbeat_at": "2026-10-30T14:55:47.898917Z",
  "last_location_at": "2026-10-30T14:55:47.898917Z",
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
  "session_id": "ebfa0ea1-189a-44b5-8481-164168fc7f65",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMwNDgsImlhdCI6MTc5MzM3MjE0OCwianRpIjoiZWZhMWZmNzYtZTAzZi00ZmQ4LTkyMTEtYjc0NDMwNjEwNGM0Iiwic2lkIjoiZWJmYTBlYTEtMTg5YS00NGI1LTg0ODEtMTY0MTY4ZmM3ZjY1In0.eZqMnuJ7iXvU-PyleZJB4Mb3k-zAPiby3sBS-hUWcfQ",
  "access_expires_at": "2026-10-30T15:10:48.493811323Z",
  "refresh_token": "tV8Li_BeLySTpRcBmPozQv9Om4yFigtu4cTZEpcKXpk",
  "refresh_expires_at": "2026-10-31T02:55:48.493315622Z",
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
  "session_id": "d71353f6-fdf7-4a47-a0cb-16faa74c2a5d",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMwNDksImlhdCI6MTc5MzM3MjE0OSwianRpIjoiYzQzOTlhYTEtODhiYy00YjE2LWJlMGUtZjA0YTFkYjc1MjQ4Iiwic2lkIjoiZDcxMzUzZjYtZmRmNy00YTQ3LWEwY2ItMTZmYWE3NGMyYTVkIn0.HACSmad2lEQ03P-VpiYi_Lz-pfk24L5wM2MurA92vAs",
  "access_expires_at": "2026-10-30T15:10:49.083391438Z",
  "refresh_token": "UwRK_RLleCTori1JCb0_c0cWV5RWVgjJkCMkcD64qjw",
  "refresh_expires_at": "2026-10-31T02:55:49.082720923Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eab8f206-518a-4636-9298-a22ec9256920` → **200**

```json
{
  "id": "eab8f206-518a-4636-9298-a22ec9256920",
  "short_number": 22,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0761acb7-3ea3-4144-8325-f074c9054549",
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
    "id": "635b39bb-42ee-47be-bf0f-34884d591527",
    "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b2ee9de9-6a55-43f1-91dc-95d386b6c4eb",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T14:54:45.688298Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/eab8f206-518a-4636-9298-a22ec9256920/interrupt` → **200**

```json
{
  "command_id": "fbac0a7b-64a3-4d9a-8884-a757e3a90c0e",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "eab8f206-518a-4636-9298-a22ec9256920",
    "short_number": 22,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "0761acb7-3ea3-4144-8325-f074c9054549",
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
      "id": "635b39bb-42ee-47be-bf0f-34884d591527",
      "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b2ee9de9-6a55-43f1-91dc-95d386b6c4eb",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T14:54:45.688298Z",
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
    "id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
    "short_number": 23,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "0761acb7-3ea3-4144-8325-f074c9054549",
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
    "id": "8cd9cf27-4f41-4417-b9c7-12ee2f3a0927",
    "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
    "expires_at": "2026-10-30T14:56:04.673906Z",
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

`POST /api/driver/v1/offers/8cd9cf27-4f41-4417-b9c7-12ee2f3a0927/accept` → **200**

```json
{
  "command_id": "141033f9-d2b8-429a-b137-3f30a63da380"
}
```

```json
{
  "id": "e039d63c-dafa-4dd6-a260-3b7315e7a79f",
  "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6",
  "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
  "assignment_id": "e039d63c-dafa-4dd6-a260-3b7315e7a79f",
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
  "session_id": "fd4d0031-2ddb-40d8-b75a-1441bc876a7d",
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
  "last_heartbeat_at": "2026-10-30T14:55:47.898917Z",
  "last_location_at": "2026-10-30T14:55:47.898917Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/fd4d0031-2ddb-40d8-b75a-1441bc876a7d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:55:51Z",
    "sequence": 1793372151930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fd4d0031-2ddb-40d8-b75a-1441bc876a7d",
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
  "last_heartbeat_at": "2026-10-30T14:55:51.110742Z",
  "last_location_at": "2026-10-30T14:55:51.110742Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6/arrive` → **200**

```json
{
  "command_id": "2022bb4f-205a-4d9d-9821-4af71e8426ba",
  "expected_version": 0
}
```

```json
{
  "id": "0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6",
  "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
  "assignment_id": "e039d63c-dafa-4dd6-a260-3b7315e7a79f",
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
  "arrived_at": "2026-10-30T14:55:51.394729Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6/start` → **200**

```json
{
  "command_id": "0ff9a1c4-7c9b-4dce-bd1a-17706c65cc85",
  "expected_version": 1
}
```

```json
{
  "id": "0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6",
  "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
  "assignment_id": "e039d63c-dafa-4dd6-a260-3b7315e7a79f",
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
  "arrived_at": "2026-10-30T14:55:51.394729Z",
  "started_at": "2026-10-30T14:55:51.68564Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6/complete` → **200**

```json
{
  "command_id": "a36fadbd-453e-48a8-b58f-f249e95fa15a",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:55:51Z"
}
```

```json
{
  "id": "0e5d7eae-f7cf-4e1b-a4bf-2c23722928b6",
  "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
  "assignment_id": "e039d63c-dafa-4dd6-a260-3b7315e7a79f",
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
  "arrived_at": "2026-10-30T14:55:51.394729Z",
  "started_at": "2026-10-30T14:55:51.68564Z",
  "completed_at": "2026-10-30T14:55:51.984606Z",
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
    "id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
    "short_number": 23,
    "status": "FULFILLED",
    "created_at": "2026-10-30T14:55:49.662539Z",
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
    "id": "eab8f206-518a-4636-9298-a22ec9256920",
    "short_number": 22,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:54:45.688298Z",
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

`GET /api/operator/v1/orders/eab8f206-518a-4636-9298-a22ec9256920/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:54:45.68891Z",
      "actor": {
        "type": "CLIENT",
        "id": "0761acb7-3ea3-4144-8325-f074c9054549",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
        "quote_id": "42a96569-80e9-43cf-88a7-124a8ec9e4cb",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "99a0d037-b3fb-411f-a19e-3929a747c103"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:54:45.690994Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
        "attempt_id": "a634f023-4a01-4c74-ae34-2e2105c681f1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "99a0d037-b3fb-411f-a19e-3929a747c103"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:54:45.697315Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "91feead3-c005-41a2-bcf0-38665c0627fb",
        "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "99a0d037-b3fb-411f-a19e-3929a747c103"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:54:46.267782Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "91feead3-c005-41a2-bcf0-38665c0627fb",
        "order_id": "eab8f206-518a-4636-9298-a22ec9256920",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "635b39bb-42ee-47be-bf0f-34884d591527"
      },
      "correlation_id": "5bf1ccc6-30db-4892-b896-e0cf0d107218"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/a68f852f-0408-4f8f-ac04-6dcd7a5078b5/tip` → **200**

```json
{
  "order_id": "a68f852f-0408-4f8f-ac04-6dcd7a5078b5",
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
  "available_until": "2026-10-31T14:55:51.984606Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/a68f852f-0408-4f8f-ac04-6dcd7a5078b5/tip` → **409**

```json
{
  "command_id": "9791737d-bca3-4eb1-994c-9a8efd20f8b9",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/a68f852f-0408-4f8f-ac04-6dcd7a5078b5/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "54c0c8c4-a71a-4bbf-9ccd-eefe247f1d1f"
}
```

Done: interrupted eab8f206-518a-4636-9298-a22ec9256920, follow-up a68f852f-0408-4f8f-ac04-6dcd7a5078b5.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c4957be-e7d9-4ce1-b481-7facd7d86d46",
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
  "last_heartbeat_at": "2026-10-30T14:55:46.735312Z",
  "last_location_at": "2026-10-30T14:55:46.735312Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3c4957be-e7d9-4ce1-b481-7facd7d86d46/close` → **200**

```json
{
  "command_id": "d0e16230-a149-43a7-9e70-9bc3c668a044",
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
  "session_id": "fd4d0031-2ddb-40d8-b75a-1441bc876a7d",
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
  "last_heartbeat_at": "2026-10-30T14:55:51.110742Z",
  "last_location_at": "2026-10-30T14:55:51.110742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd4d0031-2ddb-40d8-b75a-1441bc876a7d/close` → **200**

```json
{
  "command_id": "bad483f1-4d43-449b-9971-dfa5459d3524",
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
  "session_id": "5520e94d-b2d5-4cab-8ea1-36db66a57253",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMwNTgsImlhdCI6MTc5MzM3MjE1OCwianRpIjoiYzM1YjAwZDItNGEzYy00ODgzLWE5YmQtMTVjZmQ5YjFkMmUzIiwic2lkIjoiNTUyMGU5NGQtYjJkNS00Y2FiLThlYTEtMzZkYjY2YTU3MjUzIn0.JZvXAGGCPYhBHA3I1Grk0p-r80S2iAu3NSyB9qaXGzw",
  "access_expires_at": "2026-10-30T15:10:58.132979338Z",
  "refresh_token": "3B8ItIFZkA12ARKz6LYJvE1yxddLpX8d2UINDV3V5cI",
  "refresh_expires_at": "2026-10-31T02:55:58.13249143Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "48d9195c-d9ee-446b-a8b2-c7d02d23ddfb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:55:58Z"
}
```

```json
{
  "id": "0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:55:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0eefe6e9-f5e5-486b-b355-20147d5ebeb8/publish` → **200**

```json
{
  "command_id": "b3142099-578c-4fb7-81f5-4565dfb4bdf7",
  "expected_version": 0
}
```

```json
{
  "id": "0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:55:58.715634Z",
  "published_at": "2026-10-30T14:55:58.715634Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T14:55:58.715634Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631159116",
  "device_ref": "sandbox-10464"
}
```

```json
{
  "challenge_id": "b7a89d7b-d255-4a23-b04e-70713269eb9f",
  "expires_at": "2026-10-30T15:00:59.288010457Z",
  "resend_available_at": "2026-10-30T14:56:00.288010457Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631159116` → **200**

```json
{
  "phone": "+380631159116",
  "audience": "CLIENT",
  "code": "476192",
  "sent_at": "2026-10-30T14:55:59.291127736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7a89d7b-d255-4a23-b04e-70713269eb9f",
  "code": "476192",
  "device_ref": "sandbox-10464"
}
```

```json
{
  "session_id": "30068bac-1c0b-4556-87b5-90c5d75aa639",
  "subject": {
    "type": "CLIENT",
    "id": "8a410f4f-22c1-4099-8848-f6ac5d665861"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YTQxMGY0Zi0yMmMxLTQwOTktODg0OC1mNmFjNWQ2NjU4NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMDU5LCJpYXQiOjE3OTMzNzIxNTksImp0aSI6ImViYzQ1MGYzLTRjYjktNGM5Zi1hMzgxLTljMWQ2Nzk2YjhlOSIsInNpZCI6IjMwMDY4YmFjLTFjMGItNDU1Ni04N2I1LTkwYzVkNzVhYTYzOSJ9.MOvHForFklOMLxRZCn1gs1Y131F82nPGz_httha7Jf8",
  "access_expires_at": "2026-10-30T15:10:59.58949608Z",
  "refresh_token": "MTWmQFVWLKasajhisUNi_TCX98qDrzjbrbIc8-RfIvQ",
  "refresh_expires_at": "2026-11-29T14:55:59.588793463Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T14:55:58.715634Z",
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
  "command_id": "122b301a-0791-4cc3-89b0-7916b0f0420b",
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
  "id": "1f12a610-8395-4b22-829f-7e6c430533da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:01:00.146492Z",
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
  "command_id": "1cab12cc-3a1c-4fd7-8752-133c83909594",
  "quote_id": "1f12a610-8395-4b22-829f-7e6c430533da",
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
  "correlation_id": "a7fdda97-1a3d-4b8b-aa63-b3a8a1e8ac97"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0025ef44-6af9-4195-9d79-74056919498a",
  "version_id": "0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
  "language": "uk"
}
```

```json
{
  "version_id": "0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T14:56:00.74001Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9503c0c-e096-401a-9f02-ee0afc11b9e0",
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
  "id": "8fa0747e-bb1e-41e8-9c79-4daff2bf2da4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:01:01.025854Z",
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
  "command_id": "ccc1fc61-0142-4b82-8f9d-ca27e5c8b1e6",
  "quote_id": "8fa0747e-bb1e-41e8-9c79-4daff2bf2da4",
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
  "id": "e56757e3-133a-4805-b13c-b7a51db0d5d5",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8a410f4f-22c1-4099-8848-f6ac5d665861",
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
  "created_at": "2026-10-30T14:56:01.324592Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e56757e3-133a-4805-b13c-b7a51db0d5d5` → **200**

```json
{
  "id": "e56757e3-133a-4805-b13c-b7a51db0d5d5",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8a410f4f-22c1-4099-8848-f6ac5d665861",
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
  "created_at": "2026-10-30T14:56:01.324592Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e56757e3-133a-4805-b13c-b7a51db0d5d5/cancel` → **200**

```json
{
  "command_id": "2b3a9714-5ce1-44fb-85dc-2dc6a679367b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e56757e3-133a-4805-b13c-b7a51db0d5d5",
  "short_number": 24,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8a410f4f-22c1-4099-8848-f6ac5d665861",
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
  "created_at": "2026-10-30T14:56:01.324592Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/0eefe6e9-f5e5-486b-b355-20147d5ebeb8` → **409**

```json
{
  "command_id": "cca1dc9a-d9cc-4f41-9952-74b17344b164",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:56:02Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/0eefe6e9-f5e5-486b-b355-20147d5ebeb8",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6cb463a6-ee1b-44ae-9631-80dcb85fe58b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ea85531f-f5f3-46e3-b774-13d334c40465",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:56:02Z"
}
```

```json
{
  "id": "e6f776be-2f37-4e7f-b09f-b6980e99d1fa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:56:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e6f776be-2f37-4e7f-b09f-b6980e99d1fa/publish` → **200**

```json
{
  "command_id": "49fdf571-42ab-4c62-b1f3-8a235682cb3a",
  "expected_version": 0
}
```

```json
{
  "id": "e6f776be-2f37-4e7f-b09f-b6980e99d1fa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:56:02.780831Z",
  "published_at": "2026-10-30T14:56:02.780831Z",
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
  "device_ref": "sandbox-25901"
}
```

```json
{
  "challenge_id": "9860917e-3339-4e78-b064-9d53b0816bb9",
  "expires_at": "2026-10-30T15:01:03.076833643Z",
  "resend_available_at": "2026-10-30T14:56:04.076833643Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "614972",
  "sent_at": "2026-10-30T14:56:03.07922406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9860917e-3339-4e78-b064-9d53b0816bb9",
  "code": "614972",
  "device_ref": "sandbox-25901"
}
```

```json
{
  "session_id": "7d917f31-ae76-4366-b625-c319d782f461",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzA2MywiaWF0IjoxNzkzMzcyMTYzLCJqdGkiOiI0NjBiYWM1OS1hYTViLTQ4NjktOThhYS0zNDE0Y2Q3N2I4MGIiLCJzaWQiOiI3ZDkxN2YzMS1hZTc2LTQzNjYtYjYyNS1jMzE5ZDc4MmY0NjEifQ.sqwlYO5LgQDdjmju91a8gpQwDslUm75i3z2uO-wN5ZY",
  "access_expires_at": "2026-10-30T15:11:03.374147008Z",
  "refresh_token": "PqO1HooqiZZ9hWkipLdlkAvM2s0EeIP-ixNEDN6tP7E",
  "refresh_expires_at": "2026-11-29T14:56:03.373567477Z",
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

(the car drives 72 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "da3688e8-b2a6-4edf-af12-d8f4be169a45",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:57:15Z",
    "sequence": 1793372235930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a71d4950-a7bd-4dea-befd-ee22854aab5b",
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
  "last_heartbeat_at": "2026-10-30T14:57:15.947136Z",
  "last_location_at": "2026-10-30T14:57:15.947136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677931235",
  "device_ref": "sandbox-29109"
}
```

```json
{
  "challenge_id": "0bdcd659-ca9f-4b07-a3e9-3e7a2d43e3eb",
  "expires_at": "2026-10-30T15:02:16.225447872Z",
  "resend_available_at": "2026-10-30T14:57:17.225447872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677931235` → **200**

```json
{
  "phone": "+380677931235",
  "audience": "CLIENT",
  "code": "068133",
  "sent_at": "2026-10-30T14:57:16.228230709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bdcd659-ca9f-4b07-a3e9-3e7a2d43e3eb",
  "code": "068133",
  "device_ref": "sandbox-29109"
}
```

```json
{
  "session_id": "70775607-d001-4908-bf7d-1bb7a0d2b800",
  "subject": {
    "type": "CLIENT",
    "id": "db69ffc0-e302-49ab-80bd-170bac91d299"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjY5ZmZjMC1lMzAyLTQ5YWItODBiZC0xNzBiYWM5MWQyOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTM2LCJpYXQiOjE3OTMzNzIyMzYsImp0aSI6ImExODZkODg1LWJkYzktNDM3Ny05MjM4LTVjZjA3OWUxYWYxYiIsInNpZCI6IjcwNzc1NjA3LWQwMDEtNDkwOC1iZjdkLTFiYjdhMGQyYjgwMCJ9.Ve03IRoKM8aQxsikKjgbWc5RwBIJKahL1U1t9YoV4_A",
  "access_expires_at": "2026-10-30T15:12:16.520660785Z",
  "refresh_token": "Jdd1P1k-9wORbyhYfK945bO5ytrJ52u6nYyq1spUpHg",
  "refresh_expires_at": "2026-11-29T14:57:16.520068857Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66516d60-68a1-45f7-ad9f-512f3f50a674",
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
  "id": "00010799-b2b6-4f45-b432-3a2b347d30a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:16.799090Z",
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
  "command_id": "37c500a5-765f-428c-9fb9-91e0d27771c0",
  "quote_id": "00010799-b2b6-4f45-b432-3a2b347d30a3",
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
    "phone": "+380677645454"
  }
}
```

```json
{
  "id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:57:17.088765Z",
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
    "id": "491fe858-6855-4783-8202-d26210518b32",
    "order_id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
    "expires_at": "2026-10-30T14:57:32.092143Z",
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

`POST /api/driver/v1/offers/491fe858-6855-4783-8202-d26210518b32/accept` → **200**

```json
{
  "command_id": "6087e422-3a1b-4c6a-907a-2b2512386c00"
}
```

```json
{
  "id": "c0a19e16-06e8-4a5b-bd47-94c4b9e3b861",
  "order_id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "16154eb7-23cb-4de7-92fc-cae7553b563e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16154eb7-23cb-4de7-92fc-cae7553b563e",
  "order_id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
  "assignment_id": "c0a19e16-06e8-4a5b-bd47-94c4b9e3b861",
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
    "phone": "+380677645454"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58d827ac-4e8c-43f4-8bc0-99762123ce80",
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
  "id": "312991f5-89d4-419d-9a40-b49c6f10abff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:18.228064Z",
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
  "command_id": "964be4c4-226a-4537-ae7c-558be3a93423",
  "quote_id": "312991f5-89d4-419d-9a40-b49c6f10abff",
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
  "id": "eab658d0-8600-48ae-b0a9-4dc4b6a81fdb",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:57:18.515344Z",
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
  "command_id": "e2508e63-b835-42b9-93ba-e38f5dade3fe",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T17:57:18Z"
}
```

```json
{
  "id": "5504074a-7aec-4196-b0cf-04da4625aa1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:18.805467Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T17:57:18Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "83a0e7ad-7fe2-4702-aa40-6548990c2c7d",
  "quote_id": "5504074a-7aec-4196-b0cf-04da4625aa1a",
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
  "pickup_at": "2026-10-30T17:57:18Z"
}
```

```json
{
  "id": "cb0669b6-24c0-4707-9d39-4859526e230d",
  "short_number": 27,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:57:19.093767Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:57:18Z",
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
  "command_id": "4aa43773-293b-4ea8-9bc1-ccdf01061645",
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
  "id": "af70ae94-87d8-4b21-8ca6-fc5c26f996da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:19.390310Z",
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
  "command_id": "b8b644f3-dea1-4cdb-9385-9ca0582c2a7b",
  "quote_id": "af70ae94-87d8-4b21-8ca6-fc5c26f996da",
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
  "correlation_id": "cfa837a6-c362-4a41-9a46-ce7ef7988141"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "cb0669b6-24c0-4707-9d39-4859526e230d",
      "short_number": 27,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T14:57:19.093767Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T17:57:18Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "eab658d0-8600-48ae-b0a9-4dc4b6a81fdb",
      "short_number": 26,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T14:57:18.515344Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
      "short_number": 25,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "eab658d0-8600-48ae-b0a9-4dc4b6a81fdb",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:57:18.515344Z",
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

`GET /api/rider/v1/orders/54bf69a0-3fb1-4f6b-9aa6-36d12871fa75` → **200**

```json
{
  "id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
  "short_number": 25,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c0a19e16-06e8-4a5b-bd47-94c4b9e3b861",
    "order_id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "16154eb7-23cb-4de7-92fc-cae7553b563e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T14:57:17.088765Z",
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
    "location_at": "2026-10-30T14:57:15.947136Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/54bf69a0-3fb1-4f6b-9aa6-36d12871fa75/cancel` → **200**

```json
{
  "command_id": "bc900809-560a-4dbd-bc7c-d626cb5d3497",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c0a19e16-06e8-4a5b-bd47-94c4b9e3b861",
    "order_id": "54bf69a0-3fb1-4f6b-9aa6-36d12871fa75",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "16154eb7-23cb-4de7-92fc-cae7553b563e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:57:17.088765Z",
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

`GET /api/rider/v1/orders/eab658d0-8600-48ae-b0a9-4dc4b6a81fdb` → **200**

```json
{
  "id": "eab658d0-8600-48ae-b0a9-4dc4b6a81fdb",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:57:18.515344Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/eab658d0-8600-48ae-b0a9-4dc4b6a81fdb/cancel` → **200**

```json
{
  "command_id": "911a2687-3937-4210-adc7-1748cf3c592a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "eab658d0-8600-48ae-b0a9-4dc4b6a81fdb",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:57:18.515344Z",
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

`GET /api/rider/v1/orders/cb0669b6-24c0-4707-9d39-4859526e230d` → **200**

```json
{
  "id": "cb0669b6-24c0-4707-9d39-4859526e230d",
  "short_number": 27,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:57:19.093767Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:57:18Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cb0669b6-24c0-4707-9d39-4859526e230d/cancel` → **200**

```json
{
  "command_id": "4c9eb14c-209b-40ad-891f-34b9c2064b74",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cb0669b6-24c0-4707-9d39-4859526e230d",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "db69ffc0-e302-49ab-80bd-170bac91d299",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:57:19.093767Z",
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
  "pickup_at": "2026-10-30T17:57:18Z",
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
  "session_id": "a71d4950-a7bd-4dea-befd-ee22854aab5b",
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
  "last_heartbeat_at": "2026-10-30T14:57:15.947136Z",
  "last_location_at": "2026-10-30T14:57:15.947136Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a71d4950-a7bd-4dea-befd-ee22854aab5b/close` → **200**

```json
{
  "command_id": "34fd0cd8-de8b-48a5-a64a-a5b4b75ef41d",
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

Done: orders 54bf69a0-3fb1-4f6b-9aa6-36d12871fa75, eab658d0-8600-48ae-b0a9-4dc4b6a81fdb, cb0669b6-24c0-4707-9d39-4859526e230d.

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
  "session_id": "046b8cfa-c97b-464f-9b6d-f65763e9886f",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxNDMsImlhdCI6MTc5MzM3MjI0MywianRpIjoiYjIyMWFjMjEtNGRiNi00NzIwLWIyZTEtYmYyOTczZWI0NDc2Iiwic2lkIjoiMDQ2YjhjZmEtYzk3Yi00NjRmLTliNmQtZjY1NzYzZTk4ODZmIn0.DE0RKGmvJCV3cOldOsrT4a2-rLG6cXE3f6R7m5zFfw8",
  "access_expires_at": "2026-10-30T15:12:23.16539029Z",
  "refresh_token": "Fuzdbtq34Zj8UC6_WpmTq51OqZhBHJAfyC0rr26IEYE",
  "refresh_expires_at": "2026-10-31T02:57:23.164837214Z",
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
  "session_id": "9582b2b4-06af-4549-ab60-dce8125ee948",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxNDMsImlhdCI6MTc5MzM3MjI0MywianRpIjoiYjc5ZjVjYTUtMTU3Mi00YWVlLTg0ZTQtYzA1OTI0OGY0MWJkIiwic2lkIjoiOTU4MmIyYjQtMDZhZi00NTQ5LWFiNjAtZGNlODEyNWVlOTQ4In0.tamx2yuP39yVvu5n-oUwikTQ9lbT4fEaYDnHfr4OUlw",
  "access_expires_at": "2026-10-30T15:12:23.751857919Z",
  "refresh_token": "4l-5XVSCoHB22fqo7CReQr5VqKnYFNqaGupiYoVtBQ0",
  "refresh_expires_at": "2026-10-31T02:57:23.751300119Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19758"
}
```

```json
{
  "challenge_id": "0f9e12e7-dedf-49fe-a996-06602a914bf3",
  "expires_at": "2026-10-30T15:02:24.02594188Z",
  "resend_available_at": "2026-10-30T14:57:25.02594188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "079164",
  "sent_at": "2026-10-30T14:57:24.029221364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f9e12e7-dedf-49fe-a996-06602a914bf3",
  "code": "079164",
  "device_ref": "sandbox-19758"
}
```

```json
{
  "session_id": "55a075cc-e2b8-4f91-b199-663aa7671baf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzE0NCwiaWF0IjoxNzkzMzcyMjQ0LCJqdGkiOiIzMTIzYmVmZS1iYjBkLTQ4MTAtOTc4Mi1kYmJhMjdlZTQwZDAiLCJzaWQiOiI1NWEwNzVjYy1lMmI4LTRmOTEtYjE5OS02NjNhYTc2NzFiYWYifQ.iuhlrXobY4tB-sMly1mzSQ4RaRuUmBq_3MI9RT0Mc-k",
  "access_expires_at": "2026-10-30T15:12:24.329739724Z",
  "refresh_token": "GVWMTgA8Sinep0qOoT21SGZECu_1gyoFkw7q2z8GdR4",
  "refresh_expires_at": "2026-11-29T14:57:24.328867394Z",
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
  "command_id": "9d1ed103-91fe-4737-bb6e-578b147490d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:57:24Z",
    "sequence": 1793372244889
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cc9c6ed-eb9a-4f08-be75-09118aa47778",
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
  "last_heartbeat_at": "2026-10-30T14:57:24.906395Z",
  "last_location_at": "2026-10-30T14:57:24.906395Z",
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
  "command_id": "c4fc2d72-d327-45c3-8089-55a8e79b1ae3",
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
  "effective_at": "2026-10-30T14:57:25.475799Z",
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T14:47:36.370808Z",
  "last_entries": [
    {
      "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T14:47:36.370808Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "18dc70b7-929e-445d-be80-75fec3f611f1",
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
  "id": "7e3e83a2-8919-49bb-97e1-9f78d777d94d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:26.050771Z",
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
  "command_id": "3523f218-a2e5-4e8d-8c79-2f7762e3fa9a",
  "quote_id": "7e3e83a2-8919-49bb-97e1-9f78d777d94d",
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
    "phone": "+3806711113345"
  }
}
```

```json
{
  "id": "3562f700-afe5-4705-b3ba-2144acee170b",
  "short_number": 28,
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
  "created_at": "2026-10-30T14:57:26.35741Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113345"
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
    "id": "d8c1366b-5a0c-48cd-8af7-6fc4a142e69a",
    "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
    "expires_at": "2026-10-30T14:57:41.362686Z",
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

`POST /api/driver/v1/offers/d8c1366b-5a0c-48cd-8af7-6fc4a142e69a/accept` → **200**

```json
{
  "command_id": "9a31557b-7094-4ad8-ade5-d8498dd2711e"
}
```

```json
{
  "id": "625b0652-d6ff-4ecf-bc25-05ed73c037b4",
  "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "907fa34d-fed2-4ed5-b3c2-ab93357975fa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "907fa34d-fed2-4ed5-b3c2-ab93357975fa",
  "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
  "assignment_id": "625b0652-d6ff-4ecf-bc25-05ed73c037b4",
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
    "phone": "+3806711113345"
  }
}
```

`POST /api/driver/v1/work-sessions/0cc9c6ed-eb9a-4f08-be75-09118aa47778/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:57:27Z",
    "sequence": 1793372247515
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cc9c6ed-eb9a-4f08-be75-09118aa47778",
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
  "last_heartbeat_at": "2026-10-30T14:57:27.532135Z",
  "last_location_at": "2026-10-30T14:57:27.532135Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/907fa34d-fed2-4ed5-b3c2-ab93357975fa/arrive` → **200**

```json
{
  "command_id": "06bc11e0-a42d-4377-ab0c-499781ec7826",
  "expected_version": 0
}
```

```json
{
  "id": "907fa34d-fed2-4ed5-b3c2-ab93357975fa",
  "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
  "assignment_id": "625b0652-d6ff-4ecf-bc25-05ed73c037b4",
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
  "arrived_at": "2026-10-30T14:57:27.819771Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113345"
  }
}
```

`POST /api/driver/v1/trips/907fa34d-fed2-4ed5-b3c2-ab93357975fa/start` → **200**

```json
{
  "command_id": "06645bb7-1ba1-4a45-9cf6-f309e95563d6",
  "expected_version": 1
}
```

```json
{
  "id": "907fa34d-fed2-4ed5-b3c2-ab93357975fa",
  "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
  "assignment_id": "625b0652-d6ff-4ecf-bc25-05ed73c037b4",
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
  "arrived_at": "2026-10-30T14:57:27.819771Z",
  "started_at": "2026-10-30T14:57:28.113317Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113345"
  }
}
```

`POST /api/driver/v1/trips/907fa34d-fed2-4ed5-b3c2-ab93357975fa/complete` → **200**

```json
{
  "command_id": "69596b4f-e9d4-4105-844a-f57d949b6d3f",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:57:28Z",
  "cash_received": true
}
```

```json
{
  "id": "907fa34d-fed2-4ed5-b3c2-ab93357975fa",
  "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
  "assignment_id": "625b0652-d6ff-4ecf-bc25-05ed73c037b4",
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
  "arrived_at": "2026-10-30T14:57:27.819771Z",
  "started_at": "2026-10-30T14:57:28.113317Z",
  "completed_at": "2026-10-30T14:57:28.40886Z",
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
  "command_id": "340a3b61-8c48-4ba4-aa13-ae1663f4fb76",
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
  "id": "8d5038a2-80ef-4448-9a87-a6efd1f88128",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:28.702838Z",
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
  "command_id": "d74d5244-0a26-4c6f-872a-75c73368f5c4",
  "quote_id": "8d5038a2-80ef-4448-9a87-a6efd1f88128",
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
    "phone": "+380671110889"
  }
}
```

```json
{
  "id": "547ef22d-18ac-4fa9-901d-71b8bd0b2b70",
  "short_number": 29,
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
  "created_at": "2026-10-30T14:57:28.998627Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110889"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/547ef22d-18ac-4fa9-901d-71b8bd0b2b70` → **200**

```json
{
  "id": "547ef22d-18ac-4fa9-901d-71b8bd0b2b70",
  "short_number": 29,
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
  "created_at": "2026-10-30T14:57:28.998627Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110889"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/547ef22d-18ac-4fa9-901d-71b8bd0b2b70/cancel` → **200**

```json
{
  "command_id": "cdecf08c-367f-486f-a582-7a022c2df93c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "547ef22d-18ac-4fa9-901d-71b8bd0b2b70",
  "short_number": 29,
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
  "created_at": "2026-10-30T14:57:28.998627Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110889"
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
  "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T14:47:36.370808Z",
  "last_entries": [
    {
      "order_id": "547ef22d-18ac-4fa9-901d-71b8bd0b2b70",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T14:57:29.628477Z"
    },
    {
      "order_id": "3562f700-afe5-4705-b3ba-2144acee170b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T14:57:28.413052Z"
    },
    {
      "order_id": "e8efa3d0-4faf-4c87-89a6-1efc6ec1b7f3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T14:47:36.370808Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cc9c6ed-eb9a-4f08-be75-09118aa47778",
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
  "last_heartbeat_at": "2026-10-30T14:57:27.532135Z",
  "last_location_at": "2026-10-30T14:57:27.532135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0cc9c6ed-eb9a-4f08-be75-09118aa47778/close` → **200**

```json
{
  "command_id": "024994e8-1d7e-4726-9462-f6207a079f6d",
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

Done: operator bonus for fulfilled 3562f700-afe5-4705-b3ba-2144acee170b and operator-fault cancellation 547ef22d-18ac-4fa9-901d-71b8bd0b2b70.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674626419",
  "device_ref": "sandbox-23169"
}
```

```json
{
  "challenge_id": "4f18792d-e0fc-4ed1-9a3d-10b39fa1af08",
  "expires_at": "2026-10-30T15:02:34.006597192Z",
  "resend_available_at": "2026-10-30T14:57:35.006597192Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674626419` → **200**

```json
{
  "phone": "+380674626419",
  "audience": "CLIENT",
  "code": "449818",
  "sent_at": "2026-10-30T14:57:34.011049398Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675427810",
  "device_ref": "sandbox-11528",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "9c9e72dd-72d3-4d7e-97f3-b6b8a48ea1c0",
  "expires_at": "2026-10-30T15:02:35.528129455Z",
  "resend_available_at": "2026-10-30T14:57:36.528129455Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675427810` → **200**

```json
{
  "phone": "+380675427810",
  "audience": "CLIENT",
  "code": "428841",
  "sent_at": "2026-10-30T14:57:35.530569336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675427810",
  "device_ref": "sandbox-17086",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "257392ec-da35-4d78-a626-fae6068d71d4",
  "expires_at": "2026-10-30T15:02:37.030046483Z",
  "resend_available_at": "2026-10-30T14:57:38.030046483Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675427810` → **200**

```json
{
  "phone": "+380675427810",
  "audience": "CLIENT",
  "code": "133542",
  "sent_at": "2026-10-30T14:57:37.032690589Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673750000",
  "device_ref": "sandbox-12767"
}
```

```json
{
  "challenge_id": "f203a976-4a1a-4430-bfec-3d617307e1a8",
  "expires_at": "2026-10-30T15:02:38.538962319Z",
  "resend_available_at": "2026-10-30T14:57:39.538962319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673750000",
  "device_ref": "sandbox-8107"
}
```

```json
{
  "challenge_id": "1cbb2969-e28f-43fe-b9e2-69e09e2969ca",
  "expires_at": "2026-10-30T15:02:40.017714973Z",
  "resend_available_at": "2026-10-30T14:57:41.017714973Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673750000` → **200**

```json
{
  "phone": "+380673750000",
  "audience": "CLIENT",
  "code": "256927",
  "sent_at": "2026-10-30T14:57:40.020458012Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673750000",
  "device_ref": "sandbox-25508",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7cd17bb3-0998-4ab9-b02e-0dfc20dc4836",
  "expires_at": "2026-10-30T15:02:41.524778156Z",
  "resend_available_at": "2026-10-30T14:57:42.524778156Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673750000` → **200**

```json
{
  "phone": "+380673750000",
  "audience": "CLIENT",
  "code": "304040",
  "sent_at": "2026-10-30T14:57:41.527485957Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380673750000",
  "device_ref": "sandbox-9542",
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
  "correlation_id": "454c5b1d-d1ef-403e-9c10-b6e69f46bee5",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000024448"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a2685d75-14a3-4ceb-bbc3-2f334eef91c8"
}
```

`GET /sandbox/v1/otp?phone=%2B442000024448` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120025552"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "0e2dbc69-1914-4f72-aad1-2154ff16c54b"
}
```

`GET /sandbox/v1/otp?phone=%2B37120025552` → **404**

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
  "session_id": "b2674188-96e0-48bd-8252-d92579f2342a",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxNjQsImlhdCI6MTc5MzM3MjI2NCwianRpIjoiOWUxYmU2YmUtM2QyNy00ZmU0LWJhNDYtYzg5NDlkZDBjMDg1Iiwic2lkIjoiYjI2NzQxODgtOTZlMC00OGJkLTgyNTItZDkyNTc5ZjIzNDJhIn0.ITRrGWE9xLXmd9XrJd-U_HCpA7UbJy9hNAYH7vi8igw",
  "access_expires_at": "2026-10-30T15:12:44.224133797Z",
  "refresh_token": "aahx37hIv99DGavOyIdaZx7z8TIDpddvPe8LXXV3zsM",
  "refresh_expires_at": "2026-10-31T02:57:44.223678939Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673750000` → **200**

```json
{
  "deliveries": [
    {
      "id": "3b702901-fa78-4d32-9b31-6ef1403beeb9",
      "challenge_id": "7cd17bb3-0998-4ab9-b02e-0dfc20dc4836",
      "phone": "+380673750000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a8cdf6ce-c2b9-43a0-badf-38d3e3dc1c14",
      "error": null,
      "attempted_at": "2026-10-30T14:57:41.527796Z"
    },
    {
      "id": "1d3f81f8-4e66-4d27-ad53-3668a93374b6",
      "challenge_id": "1cbb2969-e28f-43fe-b9e2-69e09e2969ca",
      "phone": "+380673750000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-46d011dc-a084-4f99-ae99-3915f9f6c1c0",
      "error": null,
      "attempted_at": "2026-10-30T14:57:40.020874Z"
    },
    {
      "id": "24de1ada-32e4-4877-981f-d03d846486c0",
      "challenge_id": "f203a976-4a1a-4430-bfec-3d617307e1a8",
      "phone": "+380673750000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T14:57:38.54187Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673750000` → **200**

```json
{
  "phone": "+380673750000",
  "audience": "CLIENT",
  "code": "304040",
  "sent_at": "2026-10-30T14:57:41.527485957Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675427810` → **200**

```json
{
  "deliveries": [
    {
      "id": "882013ca-ebe5-4ca1-b3d2-4e58475dc8fb",
      "challenge_id": "257392ec-da35-4d78-a626-fae6068d71d4",
      "phone": "+380675427810",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e31a9a64-33d7-4cef-9a18-21f224fb7f41",
      "error": null,
      "attempted_at": "2026-10-30T14:57:37.033098Z"
    },
    {
      "id": "4f65c01a-52c1-4255-ac50-d374671b59bc",
      "challenge_id": "9c9e72dd-72d3-4d7e-97f3-b6b8a48ea1c0",
      "phone": "+380675427810",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6f26b1b7-d1d7-4afa-9a58-bc90544b668f",
      "error": null,
      "attempted_at": "2026-10-30T14:57:35.530962Z"
    }
  ]
}
```

Done: SMS to +380674626419; SMS then a call to +380675427810; a failed SMS, two calls and a refused third to +380673750000; +44 and +371 refused.

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
  "session_id": "8ff3473f-5c03-45e7-8c5f-510fe862c9b5",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxNjUsImlhdCI6MTc5MzM3MjI2NSwianRpIjoiMGIwMDFkMmQtYzNlNy00NjJmLTkxMTYtN2RmZTVlYWMwOWM4Iiwic2lkIjoiOGZmMzQ3M2YtNWMwMy00NWU3LThjNWYtNTEwZmU4NjJjOWI1In0.xyGZCfbdwixkxV3ZyG06xX5SFyFohrZoFCsPjXmgXtc",
  "access_expires_at": "2026-10-30T15:12:45.429713065Z",
  "refresh_token": "BLJ5L8_5x4GqAFs6AJmx76sJquH_NqJIvbEpCWs1_ic",
  "refresh_expires_at": "2026-10-31T02:57:45.428672583Z",
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
  "session_id": "b3fdf1c6-32be-428c-9933-dcfec6567fdd",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxNjYsImlhdCI6MTc5MzM3MjI2NiwianRpIjoiOTA1OGJkN2MtNTJjMy00MmRkLTk3NzgtOGRiYTM3NGU1OTUzIiwic2lkIjoiYjNmZGYxYzYtMzJiZS00MjhjLTk5MzMtZGNmZWM2NTY3ZmRkIn0.A2Og2M-kEjAdyRI3fCrnR8gzBQYWZSzvuCL3Ed85tic",
  "access_expires_at": "2026-10-30T15:12:46.0188791Z",
  "refresh_token": "G2dCJ3RM_v0XY0xN3y2WMiw_Ay2xuBxjhVNqO_iKCUQ",
  "refresh_expires_at": "2026-10-31T02:57:46.018412384Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
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

`POST /api/admin/v1/staff-extensions/fc15168e-9caa-4367-8f7a-b6f4ace12f85` → **200**

```json
{
  "command_id": "f8b92799-a8cd-4d87-bf0d-f61ecb3959f2",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d9b54197-5a9b-46ed-8024-cd34addeebae",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T14:57:47.145849Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T14:57:47.145849Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4dc94f13-fece-4fd7-8692-4269aad719cf",
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
  "id": "2139f381-f74c-4df1-8c00-e7f9d3dbd39a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:02:47.736847Z",
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
  "command_id": "d0edbe17-224f-47ee-95ac-a783d3256d3b",
  "quote_id": "2139f381-f74c-4df1-8c00-e7f9d3dbd39a",
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
    "phone": "+380677300450"
  }
}
```

```json
{
  "id": "6d85411f-75fc-4d21-8326-fb00e2c8a288",
  "short_number": 30,
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
  "created_at": "2026-10-30T14:57:48.02436Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677300450"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/6d85411f-75fc-4d21-8326-fb00e2c8a288/calls` → **201**

```json
{
  "command_id": "d19d3fc0-1d1d-45cc-ae8c-923613375ecb",
  "to": "CALLER"
}
```

```json
{
  "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "order_ids": [
    "6d85411f-75fc-4d21-8326-fb00e2c8a288"
  ],
  "started_at": "2026-10-30T14:57:48.344319Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/6d85411f-75fc-4d21-8326-fb00e2c8a288/calls` → **201**

```json
{
  "command_id": "d19d3fc0-1d1d-45cc-ae8c-923613375ecb",
  "to": "CALLER"
}
```

```json
{
  "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "order_ids": [
    "6d85411f-75fc-4d21-8326-fb00e2c8a288"
  ],
  "started_at": "2026-10-30T14:57:48.344319Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677300450",
    "at": "2026-10-30T14:57:48.34691817Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.22548",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "06b954ae-924a-4a36-8d67-da03f8f73fec"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=6d85411f-75fc-4d21-8326-fb00e2c8a288` → **200**

```json
{
  "calls": [
    {
      "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [
        "6d85411f-75fc-4d21-8326-fb00e2c8a288"
      ],
      "started_at": "2026-10-30T14:57:48.344319Z",
      "answered_at": "2026-10-30T14:57:48.992897Z",
      "ended_at": "2026-10-30T14:57:49.012757Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6d85411f-75fc-4d21-8326-fb00e2c8a288` → **200**

```json
{
  "calls": [
    {
      "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [
        "6d85411f-75fc-4d21-8326-fb00e2c8a288"
      ],
      "started_at": "2026-10-30T14:57:48.344319Z",
      "answered_at": "2026-10-30T14:57:48.992897Z",
      "ended_at": "2026-10-30T14:57:49.012757Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6d85411f-75fc-4d21-8326-fb00e2c8a288` → **200**

```json
{
  "calls": [
    {
      "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [
        "6d85411f-75fc-4d21-8326-fb00e2c8a288"
      ],
      "started_at": "2026-10-30T14:57:48.344319Z",
      "answered_at": "2026-10-30T14:57:48.992897Z",
      "ended_at": "2026-10-30T14:57:49.012757Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6d85411f-75fc-4d21-8326-fb00e2c8a288` → **200**

```json
{
  "calls": [
    {
      "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [
        "6d85411f-75fc-4d21-8326-fb00e2c8a288"
      ],
      "started_at": "2026-10-30T14:57:48.344319Z",
      "answered_at": "2026-10-30T14:57:48.992897Z",
      "ended_at": "2026-10-30T14:57:49.012757Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6d85411f-75fc-4d21-8326-fb00e2c8a288` → **200**

```json
{
  "calls": [
    {
      "id": "06b954ae-924a-4a36-8d67-da03f8f73fec",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "order_ids": [
        "6d85411f-75fc-4d21-8326-fb00e2c8a288"
      ],
      "started_at": "2026-10-30T14:57:48.344319Z",
      "answered_at": "2026-10-30T14:57:48.992897Z",
      "ended_at": "2026-10-30T14:57:49.012757Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:57:57.420717Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/6d85411f-75fc-4d21-8326-fb00e2c8a288` → **200**

```json
{
  "id": "6d85411f-75fc-4d21-8326-fb00e2c8a288",
  "short_number": 30,
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
  "created_at": "2026-10-30T14:57:48.02436Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677300450"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6d85411f-75fc-4d21-8326-fb00e2c8a288/cancel` → **200**

```json
{
  "command_id": "aeefd33c-0160-478b-ae8a-be71f900abf1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6d85411f-75fc-4d21-8326-fb00e2c8a288",
  "short_number": 30,
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
  "created_at": "2026-10-30T14:57:48.02436Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677300450"
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
  "command_id": "3ad76445-6b28-4e8d-ac5a-32e849b4fdb6",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T14:57:59.073558Z",
  "extension": "101"
}
```

Done: outgoing call 06b954ae-924a-4a36-8d67-da03f8f73fec from order 6d85411f-75fc-4d21-8326-fb00e2c8a288, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634847491",
  "device_ref": "sandbox-22325"
}
```

```json
{
  "challenge_id": "497495a6-079c-40d8-9629-c32466a60164",
  "expires_at": "2026-10-30T15:02:59.361007716Z",
  "resend_available_at": "2026-10-30T14:58:00.361007716Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634847491` → **200**

```json
{
  "phone": "+380634847491",
  "audience": "CLIENT",
  "code": "892069",
  "sent_at": "2026-10-30T14:57:59.363428092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "497495a6-079c-40d8-9629-c32466a60164",
  "code": "892069",
  "device_ref": "sandbox-22325"
}
```

```json
{
  "session_id": "40d44688-ed25-434c-a8fd-7541096793a3",
  "subject": {
    "type": "CLIENT",
    "id": "61b7352a-1d72-4fc2-a5e3-2886f0454234"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWI3MzUyYS0xZDcyLTRmYzItYTVlMy0yODg2ZjA0NTQyMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTc5LCJpYXQiOjE3OTMzNzIyNzksImp0aSI6ImNiMDBiMDc3LTI0MDEtNDA4Yy1hODg3LWY4MGQ5ZTAzNTc2ZiIsInNpZCI6IjQwZDQ0Njg4LWVkMjUtNDM0Yy1hOGZkLTc1NDEwOTY3OTNhMyJ9.496NPsbYUz0gK8shNetJSHiNXWSKbfDCAFgK41clFyU",
  "access_expires_at": "2026-10-30T15:12:59.678010666Z",
  "refresh_token": "SnsSI1nMl9HyoG9cOjMcDnpGIzr5jqUBNapeFPwBYHA",
  "refresh_expires_at": "2026-11-29T14:57:59.677285451Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
  "session_id": "40d44688-ed25-434c-a8fd-7541096793a3",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634847491",
  "device_ref": "sandbox-2331"
}
```

```json
{
  "challenge_id": "0b36c818-a4e9-45d3-b92c-6707c4b5e2b6",
  "expires_at": "2026-10-30T15:03:02.227707375Z",
  "resend_available_at": "2026-10-30T14:58:03.227707375Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634847491` → **200**

```json
{
  "phone": "+380634847491",
  "audience": "CLIENT",
  "code": "915869",
  "sent_at": "2026-10-30T14:58:02.229851268Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b36c818-a4e9-45d3-b92c-6707c4b5e2b6",
  "code": "915869",
  "device_ref": "sandbox-2331"
}
```

```json
{
  "session_id": "82d433fc-c929-4094-8d2f-c27bd87dd79c",
  "subject": {
    "type": "CLIENT",
    "id": "61b7352a-1d72-4fc2-a5e3-2886f0454234"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWI3MzUyYS0xZDcyLTRmYzItYTVlMy0yODg2ZjA0NTQyMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTgyLCJpYXQiOjE3OTMzNzIyODIsImp0aSI6IjJlOWZjM2JlLTY3MTctNGRlNi05Yzc4LTE0NjQ2ODNiMjc3ZiIsInNpZCI6IjgyZDQzM2ZjLWM5MjktNDA5NC04ZDJmLWMyN2JkODdkZDc5YyJ9.Z4SU0Y8I2AWjxGukd84aQ0CEuk8w96lczzSsEzdrWXg",
  "access_expires_at": "2026-10-30T15:13:02.53199194Z",
  "refresh_token": "mq0aaaJdSiOJ-yKk6JgwsO9BEtoaSSIEgG09n-Di2ew",
  "refresh_expires_at": "2026-11-29T14:58:02.531509505Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "32f80c63-a334-4815-a5cb-29806081b941",
  "expires_at": "2026-10-30T15:03:04.81632725Z",
  "resend_available_at": "2026-10-30T14:58:05.81632725Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634847491` → **200**

```json
{
  "phone": "+380634847491",
  "audience": "CLIENT",
  "code": "293227",
  "sent_at": "2026-10-30T14:58:04.820909226Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637147797"
}
```

```json
{
  "challenge_id": "45c4cf3f-902a-471e-a3c4-ec60f2787ae1",
  "expires_at": "2026-10-30T15:03:05.11480808Z",
  "resend_available_at": "2026-10-30T14:58:06.11480808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637147797` → **200**

```json
{
  "phone": "+380637147797",
  "audience": "CLIENT",
  "code": "788117",
  "sent_at": "2026-10-30T14:58:05.117568631Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "ef61189b-25c1-47c6-8998-b59ec3b2f608",
  "current_challenge_id": "32f80c63-a334-4815-a5cb-29806081b941",
  "current_code": "000000",
  "new_challenge_id": "45c4cf3f-902a-471e-a3c4-ec60f2787ae1",
  "new_code": "788117"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e53248bf-13a0-4f81-9949-f4758103cc03"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "277114fb-82e0-45c9-abe2-8bd2149939e2",
  "current_challenge_id": "32f80c63-a334-4815-a5cb-29806081b941",
  "current_code": "293227",
  "new_challenge_id": "45c4cf3f-902a-471e-a3c4-ec60f2787ae1",
  "new_code": "788117"
}
```

```json
{
  "subject_id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
  "phone": "+380637147797",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
  "session_id": "40d44688-ed25-434c-a8fd-7541096793a3",
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
  "correlation_id": "9c4b33b2-6c78-454c-934d-e44c4bee46f9"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637147797",
  "device_ref": "sandbox-1922"
}
```

```json
{
  "challenge_id": "02d203c1-30fc-4b57-a184-211118dd4e55",
  "expires_at": "2026-10-30T15:03:08.542072702Z",
  "resend_available_at": "2026-10-30T14:58:09.542072702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637147797` → **200**

```json
{
  "phone": "+380637147797",
  "audience": "CLIENT",
  "code": "556448",
  "sent_at": "2026-10-30T14:58:08.544621666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02d203c1-30fc-4b57-a184-211118dd4e55",
  "code": "556448",
  "device_ref": "sandbox-1922"
}
```

```json
{
  "session_id": "d70dab1c-7510-4225-89f6-162c2b962331",
  "subject": {
    "type": "CLIENT",
    "id": "61b7352a-1d72-4fc2-a5e3-2886f0454234"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWI3MzUyYS0xZDcyLTRmYzItYTVlMy0yODg2ZjA0NTQyMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTg4LCJpYXQiOjE3OTMzNzIyODgsImp0aSI6IjQ3MmM1ZTNlLWIxMzAtNDQ1My1iYTkzLWI2MmU3ZGVmMzhjMCIsInNpZCI6ImQ3MGRhYjFjLTc1MTAtNDIyNS04OWY2LTE2MmMyYjk2MjMzMSJ9.HXJQiD-olBf9ydyeJpw1mowT3biadQp5nQjH_Z4wV6Y",
  "access_expires_at": "2026-10-30T15:13:08.84358398Z",
  "refresh_token": "L-kmVBwiFxj9IWPmhwLNcIOPprABvx6UC00PNHAiPyE",
  "refresh_expires_at": "2026-11-29T14:58:08.842898551Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
  "session_id": "d70dab1c-7510-4225-89f6-162c2b962331",
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
  "session_id": "73d3f69a-fa34-41f4-961c-a3249fc4534d",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxODksImlhdCI6MTc5MzM3MjI4OSwianRpIjoiZjY2NzRiMTgtYzc0Ny00ZWE5LTkxYmUtOTQyMGRjOTU3MmQ3Iiwic2lkIjoiNzNkM2Y2OWEtZmEzNC00MWY0LTk2MWMtYTMyNDlmYzQ1MzRkIn0.LmmRcwzzomHCqrgWRsHSiBAktD4l-jipI40PnaA5c00",
  "access_expires_at": "2026-10-30T15:13:09.702645676Z",
  "refresh_token": "Kej0UnvXAglEcHMKlNWo57E675EUEYBfujWydezO4gk",
  "refresh_expires_at": "2026-10-31T02:58:09.702164167Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234` → **200**

```json
{
  "client": {
    "id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
    "phone": "+380637147797",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:57:59.675193Z",
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

`POST /api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234/phone/new-code` → **201**

```json
{
  "phone": "+380632019859"
}
```

```json
{
  "challenge_id": "96f5472f-7b20-497f-8d8d-508955fdfba5",
  "expires_at": "2026-10-30T15:03:10.288755313Z",
  "resend_available_at": "2026-10-30T14:58:11.288755313Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632019859` → **200**

```json
{
  "phone": "+380632019859",
  "audience": "CLIENT",
  "code": "916883",
  "sent_at": "2026-10-30T14:58:10.291100397Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234/phone` → **422**

```json
{
  "command_id": "f0e52017-c725-4b2d-983c-a14f5b74d179",
  "expected_version": 3,
  "new_challenge_id": "96f5472f-7b20-497f-8d8d-508955fdfba5",
  "new_code": "916884",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "60499e26-5ced-4109-9385-4f16b5695382"
}
```

`POST /api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234/phone` → **400**

```json
{
  "command_id": "879f72fe-d445-4f2e-bdf1-00b3fefe19a0",
  "expected_version": 3,
  "new_challenge_id": "96f5472f-7b20-497f-8d8d-508955fdfba5",
  "new_code": "916883",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "90d40200-7c3b-43b3-ad43-e2b9fd5fc5c4",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/61b7352a-1d72-4fc2-a5e3-2886f0454234/phone` → **200**

```json
{
  "command_id": "5476e503-e53d-4333-bd13-d8139a76110d",
  "expected_version": 3,
  "new_challenge_id": "96f5472f-7b20-497f-8d8d-508955fdfba5",
  "new_code": "916883",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
  "phone": "+380632019859",
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
  "correlation_id": "af1ca826-67fc-406c-b677-0f456c7d14dc"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632019859",
  "device_ref": "sandbox-18297"
}
```

```json
{
  "challenge_id": "9b7eb993-33fb-43a3-93e2-973e088b85de",
  "expires_at": "2026-10-30T15:03:11.721013753Z",
  "resend_available_at": "2026-10-30T14:58:12.721013753Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632019859` → **200**

```json
{
  "phone": "+380632019859",
  "audience": "CLIENT",
  "code": "394896",
  "sent_at": "2026-10-30T14:58:11.723694482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b7eb993-33fb-43a3-93e2-973e088b85de",
  "code": "394896",
  "device_ref": "sandbox-18297"
}
```

```json
{
  "session_id": "7f010c59-f0ec-46b6-b615-9822673c453c",
  "subject": {
    "type": "CLIENT",
    "id": "61b7352a-1d72-4fc2-a5e3-2886f0454234"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWI3MzUyYS0xZDcyLTRmYzItYTVlMy0yODg2ZjA0NTQyMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTkyLCJpYXQiOjE3OTMzNzIyOTIsImp0aSI6IjhhYzkxMDE1LTZlZDQtNGU4NS1iNjU5LTNhMGUyNjQ3NTlmNyIsInNpZCI6IjdmMDEwYzU5LWYwZWMtNDZiNi1iNjE1LTk4MjI2NzNjNDUzYyJ9.jEl5r_mCb-epM2k84-kx3p6avU_eHDVtIfEnmQ6Q8Xs",
  "access_expires_at": "2026-10-30T15:13:12.021998101Z",
  "refresh_token": "Ww-1isuBoh67Q86LWJ_eraimJ6JjIBMnW6iroG3UjoE",
  "refresh_expires_at": "2026-11-29T14:58:12.021546203Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "61b7352a-1d72-4fc2-a5e3-2886f0454234",
  "session_id": "7f010c59-f0ec-46b6-b615-9822673c453c",
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
  "phone": "+380633836537",
  "device_ref": "sandbox-15719"
}
```

```json
{
  "challenge_id": "49fef935-081e-453b-b401-8f90d549f65f",
  "expires_at": "2026-10-30T15:03:12.562049302Z",
  "resend_available_at": "2026-10-30T14:58:13.562049302Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633836537` → **200**

```json
{
  "phone": "+380633836537",
  "audience": "CLIENT",
  "code": "319683",
  "sent_at": "2026-10-30T14:58:12.56451711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49fef935-081e-453b-b401-8f90d549f65f",
  "code": "319683",
  "device_ref": "sandbox-15719"
}
```

```json
{
  "session_id": "1e0424ce-783d-40a7-8026-3ac2e5ba5b58",
  "subject": {
    "type": "CLIENT",
    "id": "76a0f2c3-39fb-4739-8d7b-d899b2a4eb13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmEwZjJjMy0zOWZiLTQ3MzktOGQ3Yi1kODk5YjJhNGViMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTkyLCJpYXQiOjE3OTMzNzIyOTIsImp0aSI6ImY4YjY5MjViLTJiMzAtNGU0NC1iMGJhLTc0NGE1YWQwYjdlYyIsInNpZCI6IjFlMDQyNGNlLTc4M2QtNDBhNy04MDI2LTNhYzJlNWJhNWI1OCJ9.XMniifPvk_XP-TsKRXzpiRQB5ZjLJRTWVu2mKrsXtDo",
  "access_expires_at": "2026-10-30T15:13:12.87625204Z",
  "refresh_token": "neU3tCPB0ax9z8CYAmo0aAl-r4UNN9tdw6hM24CACKc",
  "refresh_expires_at": "2026-11-29T14:58:12.875842166Z",
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
  "session_id": "ae2133ad-6011-4ac5-96c7-6baf35592c67",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxOTQsImlhdCI6MTc5MzM3MjI5NCwianRpIjoiYzcxOWUwMmMtNjlkZC00Nzk0LTliMmItNDVkZDM5OGU4ZTUyIiwic2lkIjoiYWUyMTMzYWQtNjAxMS00YWM1LTk2YzctNmJhZjM1NTkyYzY3In0.SbF2nXZsyszOXo_28cDflC_U7WIXBXXjDAAbj4tXXSY",
  "access_expires_at": "2026-10-30T15:13:14.053962229Z",
  "refresh_token": "LdcVOD0rzV1KH-oTLVaLQ6wxr7htqgGktnyutHJ0PsA",
  "refresh_expires_at": "2026-10-31T02:58:14.053398252Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633836537` → **200**

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
  "correlation_id": "c02432a1-ad81-4252-af22-7771bf9db8fb"
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
  "session_id": "35f066dd-1b2d-4777-8a40-f81f06d78391",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMxOTUsImlhdCI6MTc5MzM3MjI5NSwianRpIjoiZGZjNzExODYtMjRmOS00NGEzLTg5M2YtOWY5YTcxNDQzZGE2Iiwic2lkIjoiMzVmMDY2ZGQtMWIyZC00Nzc3LThhNDAtZjgxZjA2ZDc4MzkxIn0.JJmBNk6bd1Md_cOUwqsyJ_mCv8Hq1ItsP7gDlRM8gvc",
  "access_expires_at": "2026-10-30T15:13:15.222078192Z",
  "refresh_token": "gSBLXzajY-xI2ts8mFoNK_tMhq_tiLQQNkTBmWd1CqQ",
  "refresh_expires_at": "2026-10-31T02:58:15.221629093Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T14:43:36.869023Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e5ae3891-0b92-46a3-a565-479b38e3741f",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T14:58:15.787951087Z"
}
```

## The rider books the airport for 2026-10-30T17:58:14Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600750549",
  "device_ref": "sandbox-3174"
}
```

```json
{
  "challenge_id": "542c525c-af90-46ec-a562-75cd484b8585",
  "expires_at": "2026-10-30T15:03:16.098140756Z",
  "resend_available_at": "2026-10-30T14:58:17.098140756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600750549` → **200**

```json
{
  "phone": "+48600750549",
  "audience": "CLIENT",
  "code": "287276",
  "sent_at": "2026-10-30T14:58:16.101744561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "542c525c-af90-46ec-a562-75cd484b8585",
  "code": "287276",
  "device_ref": "sandbox-3174"
}
```

```json
{
  "session_id": "48fcf693-5a2c-4311-b695-0058daa37d68",
  "subject": {
    "type": "CLIENT",
    "id": "6db312e0-f253-4c54-a647-2d950a4fa93e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGIzMTJlMC1mMjUzLTRjNTQtYTY0Ny0yZDk1MGE0ZmE5M2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMTk2LCJpYXQiOjE3OTMzNzIyOTYsImp0aSI6IjIzOWYyYTJiLWQ2ZDgtNGUzZi05NjYwLWUzYzgyMzUyY2VjZSIsInNpZCI6IjQ4ZmNmNjkzLTVhMmMtNDMxMS1iNjk1LTAwNThkYWEzN2Q2OCJ9.tBAInwAXUtoVgGnD0SPeODQ_UukUSHsVVn9E5JSEEnc",
  "access_expires_at": "2026-10-30T15:13:16.403664619Z",
  "refresh_token": "IVzSTaveIpCXsw73Z9EV6db3AM6ug5PQK1MylMHL6Wo",
  "refresh_expires_at": "2026-11-29T14:58:16.40315623Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8033e16-8435-4197-9699-34b14b8cffa9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T17:58:14Z"
}
```

```json
{
  "id": "de970630-dad6-48c8-abbf-54c3533f3159",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:03:16.691992Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T17:58:14Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "39736bb9-6184-4773-a476-fa882619e50e",
  "quote_id": "de970630-dad6-48c8-abbf-54c3533f3159",
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
  "pickup_at": "2026-10-30T17:58:14Z"
}
```

```json
{
  "id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
  "short_number": 31,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6db312e0-f253-4c54-a647-2d950a4fa93e",
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
  "created_at": "2026-10-30T14:58:16.983351Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:58:14Z",
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
  "device_ref": "sandbox-3440"
}
```

```json
{
  "challenge_id": "dcbce927-8923-4b31-996d-cc5a910d86f4",
  "expires_at": "2026-10-30T15:03:17.279018897Z",
  "resend_available_at": "2026-10-30T14:58:18.279018897Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "348022",
  "sent_at": "2026-10-30T14:58:17.281402913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dcbce927-8923-4b31-996d-cc5a910d86f4",
  "code": "348022",
  "device_ref": "sandbox-3440"
}
```

```json
{
  "session_id": "f2ce497a-1ac6-4483-bf2b-35a894a2cdd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzE5NywiaWF0IjoxNzkzMzcyMjk3LCJqdGkiOiIyNzU5ZmUyZS05Y2IzLTQ1OGMtYTIzNy0wNDU1ODA5NzJmMzIiLCJzaWQiOiJmMmNlNDk3YS0xYWM2LTQ0ODMtYmYyYi0zNWE4OTRhMmNkZDMifQ.KC1hiHmzyCxlUhL22KDft69d9cnNAAx2J-jpaexWG4k",
  "access_expires_at": "2026-10-30T15:13:17.586415123Z",
  "refresh_token": "b_0ppzuaFbHdZpKWflL4OCE1pLi5IwjhTcoQ3MSttnI",
  "refresh_expires_at": "2026-11-29T14:58:17.585899249Z",
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
  "command_id": "6a252150-55fa-4546-93a5-dfeb21c46a9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:58:18Z",
    "sequence": 1793372298143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "154dc1e3-cdc2-4cd9-a756-c6399cc2970d",
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
  "last_heartbeat_at": "2026-10-30T14:58:18.159439Z",
  "last_location_at": "2026-10-30T14:58:18.159439Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
      "short_number": 31,
      "pickup_at": "2026-10-30T17:58:14Z",
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

`POST /api/driver/v1/preorders/aee335e4-6c1c-469b-9a79-81bc6bd130b3/reserve` → **200**

```json
{
  "command_id": "6f4d965c-3eb6-4276-a748-0fa9a93689c2"
}
```

```json
{
  "id": "2130dd60-35ea-45a7-a72e-5399baadd5c2",
  "state": "RESERVED",
  "order": {
    "order_id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
    "short_number": 31,
    "pickup_at": "2026-10-30T17:58:14Z",
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
  "reserved_at": "2026-10-30T14:58:18.733628Z",
  "confirm_from": "2026-10-30T17:28:14Z",
  "confirm_until": "2026-10-30T17:38:14Z",
  "drop_until": "2026-10-30T16:58:14Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2130dd60-35ea-45a7-a72e-5399baadd5c2",
      "state": "RESERVED",
      "order": {
        "order_id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
        "short_number": 31,
        "pickup_at": "2026-10-30T17:58:14Z",
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
      "reserved_at": "2026-10-30T14:58:18.733628Z",
      "confirm_from": "2026-10-30T17:28:14Z",
      "confirm_until": "2026-10-30T17:38:14Z",
      "drop_until": "2026-10-30T16:58:14Z"
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
      "id": "2130dd60-35ea-45a7-a72e-5399baadd5c2",
      "state": "RESERVED",
      "order": {
        "order_id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
        "short_number": 31,
        "pickup_at": "2026-10-30T17:58:14Z",
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
      "reserved_at": "2026-10-30T14:58:18.733628Z",
      "confirm_from": "2026-10-30T17:28:14Z",
      "confirm_until": "2026-10-30T17:38:14Z",
      "drop_until": "2026-10-30T16:58:14Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2130dd60-35ea-45a7-a72e-5399baadd5c2/confirm` → **409**

```json
{
  "command_id": "a121d056-bffa-4e27-8515-b196cb596313"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2130dd60-35ea-45a7-a72e-5399baadd5c2/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e6fc8cad-699f-40d6-a844-bc158b51cd6f"
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
  "session_id": "6cc3fa59-13e4-45ce-ba07-1e0fc61294ca",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyMDAsImlhdCI6MTc5MzM3MjMwMCwianRpIjoiNGMwYTNhYTgtODIwMS00NDcwLWFhY2QtOGQwZDg0YWNlNDc1Iiwic2lkIjoiNmNjM2ZhNTktMTNlNC00NWNlLWJhMDctMWUwZmM2MTI5NGNhIn0.CoKbaRfh6x7wPD0Y8aGoWoASJJPpNrTWAvkWQsD0seE",
  "access_expires_at": "2026-10-30T15:13:20.176067688Z",
  "refresh_token": "i6NhfuCQeoO5oa02WQXKa_VbfdtDmefBxZO3Mfr6kis",
  "refresh_expires_at": "2026-10-31T02:58:20.175495571Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aee335e4-6c1c-469b-9a79-81bc6bd130b3` → **200**

```json
{
  "id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
  "short_number": 31,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6db312e0-f253-4c54-a647-2d950a4fa93e",
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
  "created_at": "2026-10-30T14:58:16.983351Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T17:58:14Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2130dd60-35ea-45a7-a72e-5399baadd5c2",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T14:58:18.733628Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/aee335e4-6c1c-469b-9a79-81bc6bd130b3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T14:58:16.984525Z",
      "actor": {
        "type": "CLIENT",
        "id": "6db312e0-f253-4c54-a647-2d950a4fa93e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
        "preorder": true,
        "quote_id": "de970630-dad6-48c8-abbf-54c3533f3159",
        "pickup_at": "2026-10-30T17:58:14Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "c84cb1fc-7cb3-4976-ac1c-432403633430"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T14:58:18.734865Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "aee335e4-6c1c-469b-9a79-81bc6bd130b3",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2130dd60-35ea-45a7-a72e-5399baadd5c2"
      },
      "correlation_id": "b8665db1-6e89-4f49-bbcf-5e95cd6b655d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order aee335e4-6c1c-469b-9a79-81bc6bd130b3, reservation 2130dd60-35ea-45a7-a72e-5399baadd5c2.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26463"
}
```

```json
{
  "challenge_id": "eeb017a1-6bd9-42a5-a926-cf4d2b3f8f53",
  "expires_at": "2026-10-30T15:03:21.030755779Z",
  "resend_available_at": "2026-10-30T14:58:22.030755779Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "012500",
  "sent_at": "2026-10-30T14:58:21.033480926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eeb017a1-6bd9-42a5-a926-cf4d2b3f8f53",
  "code": "012500",
  "device_ref": "sandbox-26463"
}
```

```json
{
  "session_id": "f45018a3-e4f3-4608-8cbf-8ddb05bb00b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzIwMSwiaWF0IjoxNzkzMzcyMzAxLCJqdGkiOiI5YWM5ZGNlZC1kNDEzLTQ4ODUtODBiNy1iMjAyMGI4NjFmZDEiLCJzaWQiOiJmNDUwMThhMy1lNGYzLTQ2MDgtOGNiZi04ZGRiMDViYjAwYjEifQ.4c83RO0uzgQqJ6uyT2iiMdvffTVCp3-RsFeTXaT7Q5Y",
  "access_expires_at": "2026-10-30T15:13:21.338431613Z",
  "refresh_token": "ow5-fOMLgfIyZOwGG0UrAKDJTqZIajva144o63O81Xc",
  "refresh_expires_at": "2026-11-29T14:58:21.337877062Z",
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
  "command_id": "cbdf1a3d-e45f-43c7-a657-57432b2d919c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:58:21Z",
    "sequence": 1793372301901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T14:58:21.918559Z",
  "last_location_at": "2026-10-30T14:58:21.918559Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673650559",
  "device_ref": "sandbox-6521"
}
```

```json
{
  "challenge_id": "2b110578-41f2-488a-8f1e-5ee6139f394e",
  "expires_at": "2026-10-30T15:03:22.194451169Z",
  "resend_available_at": "2026-10-30T14:58:23.194451169Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673650559` → **200**

```json
{
  "phone": "+380673650559",
  "audience": "CLIENT",
  "code": "182258",
  "sent_at": "2026-10-30T14:58:22.197017722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b110578-41f2-488a-8f1e-5ee6139f394e",
  "code": "182258",
  "device_ref": "sandbox-6521"
}
```

```json
{
  "session_id": "a9d9d4d6-32d0-4894-8fe7-bcede38c821e",
  "subject": {
    "type": "CLIENT",
    "id": "de876884-00ae-43e9-ae92-956dcc6080bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTg3Njg4NC0wMGFlLTQzZTktYWU5Mi05NTZkY2M2MDgwYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMjAyLCJpYXQiOjE3OTMzNzIzMDIsImp0aSI6IjVjODZlNjcxLTJkY2ItNGI4My1iOWEwLTcwOWNhMDk5MzVlZiIsInNpZCI6ImE5ZDlkNGQ2LTMyZDAtNDg5NC04ZmU3LWJjZWRlMzhjODIxZSJ9.v7jPCR-TsJN3QEu-QpJBI1PJliGaKGdfhUtVOV_xRpg",
  "access_expires_at": "2026-10-30T15:13:22.496005237Z",
  "refresh_token": "PUxBZGwdTJfOQvj-2fSi2O3lCOVcoe33armQJGpEN7M",
  "refresh_expires_at": "2026-11-29T14:58:22.495458943Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "234b1c89-4b5d-498e-a8e5-9cc3b0d616f1",
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
  "id": "e72ecd43-0b67-4ffc-8b22-1c3b754ff5ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:03:22.781185Z",
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
  "command_id": "1195f76b-a2fa-41e4-85cf-dd0e8b589b64",
  "quote_id": "e72ecd43-0b67-4ffc-8b22-1c3b754ff5ac",
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
  "id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "short_number": 32,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "de876884-00ae-43e9-ae92-956dcc6080bd",
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
  "created_at": "2026-10-30T14:58:23.070791Z",
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
    "id": "abdf0763-df9c-497d-ba65-b8fc9f7e35fa",
    "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
    "expires_at": "2026-10-30T14:58:38.074005Z",
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

`POST /api/driver/v1/offers/abdf0763-df9c-497d-ba65-b8fc9f7e35fa/accept` → **200**

```json
{
  "command_id": "badca00c-a0e6-4f56-8b2c-78bf1676ca5e"
}
```

```json
{
  "id": "cd643283-e429-4958-93b9-f3e008c02426",
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00d8fa68-3fe6-4cea-90d6-ad77dd4231ca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00d8fa68-3fe6-4cea-90d6-ad77dd4231ca",
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "assignment_id": "cd643283-e429-4958-93b9-f3e008c02426",
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

`POST /api/driver/v1/work-sessions/c97c544d-363a-4f5e-8178-21a108f258ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:58:24Z",
    "sequence": 1793372304208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T14:58:24.224084Z",
  "last_location_at": "2026-10-30T14:58:24.224084Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00d8fa68-3fe6-4cea-90d6-ad77dd4231ca",
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "assignment_id": "cd643283-e429-4958-93b9-f3e008c02426",
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

`POST /api/driver/v1/trips/00d8fa68-3fe6-4cea-90d6-ad77dd4231ca/arrive` → **200**

```json
{
  "command_id": "2f666ecd-6280-4cae-9262-23fd545c7b60",
  "expected_version": 0
}
```

```json
{
  "id": "00d8fa68-3fe6-4cea-90d6-ad77dd4231ca",
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "assignment_id": "cd643283-e429-4958-93b9-f3e008c02426",
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
  "arrived_at": "2026-10-30T14:58:24.776031Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/00d8fa68-3fe6-4cea-90d6-ad77dd4231ca/start` → **200**

```json
{
  "command_id": "87733c3b-46ba-428e-8905-07e43f33d589",
  "expected_version": 1
}
```

```json
{
  "id": "00d8fa68-3fe6-4cea-90d6-ad77dd4231ca",
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "assignment_id": "cd643283-e429-4958-93b9-f3e008c02426",
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
  "arrived_at": "2026-10-30T14:58:24.776031Z",
  "started_at": "2026-10-30T14:58:25.067581Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/c97c544d-363a-4f5e-8178-21a108f258ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:59:13Z",
    "sequence": 1793372353373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T14:59:13.389727Z",
  "last_location_at": "2026-10-30T14:59:13.389727Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/00d8fa68-3fe6-4cea-90d6-ad77dd4231ca/complete` → **200**

```json
{
  "command_id": "43c8aba0-0299-4b7d-a9da-e982a2f502d4",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:59:13Z",
  "cash_received": true
}
```

```json
{
  "id": "00d8fa68-3fe6-4cea-90d6-ad77dd4231ca",
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "assignment_id": "cd643283-e429-4958-93b9-f3e008c02426",
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
  "arrived_at": "2026-10-30T14:58:24.776031Z",
  "started_at": "2026-10-30T14:58:25.067581Z",
  "completed_at": "2026-10-30T14:59:13.672856Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/5942876d-358f-40a6-8efb-41d8177086a2/rating` → **200**

```json
{
  "command_id": "5b29d217-698b-4075-9d8e-8ee6b1278c0a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "score": 5,
  "created_at": "2026-10-30T14:59:13.984689788Z"
}
```

`POST /api/driver/v1/orders/5942876d-358f-40a6-8efb-41d8177086a2/rating` → **200**

```json
{
  "command_id": "3e095403-0e8c-4c06-8a3d-4bb9f99d1e02",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
  "score": 4,
  "created_at": "2026-10-30T14:59:14.263880109Z"
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
  "session_id": "0e5f3097-8647-4099-a8ab-5b5d04980227",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNTUsImlhdCI6MTc5MzM3MjM1NSwianRpIjoiZjI0ZWI3YjUtYWM3Yi00YTJiLWFmY2UtMDc5YWE2MTkxN2RmIiwic2lkIjoiMGU1ZjMwOTctODY0Ny00MDk5LWE4YWItNWI1ZDA0OTgwMjI3In0.DyxdNB6PEqQx29ZLmCW0hkpTMxK45p7a0m7B6CyKAuA",
  "access_expires_at": "2026-10-30T15:14:15.142765988Z",
  "refresh_token": "3m7yTH40GfULb9STAMlhQR7y6feNhoX0K_m6KgizPy8",
  "refresh_expires_at": "2026-10-31T02:59:15.142192735Z",
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
  "session_id": "d5550df5-8585-481a-90d0-724399510218",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNTUsImlhdCI6MTc5MzM3MjM1NSwianRpIjoiNDZkN2ZmN2MtZGMwZS00ZmY0LTlhNjAtYzZlNjAyNGU1NjE4Iiwic2lkIjoiZDU1NTBkZjUtODU4NS00ODFhLTkwZDAtNzI0Mzk5NTEwMjE4In0.ASHbUMt8kcb6IYF-DehSslBjs8nm6Cfw6QLtoTorI8Y",
  "access_expires_at": "2026-10-30T15:14:15.750549389Z",
  "refresh_token": "G8ARlGpUXcy0supFpic_lTRUIL50uv7r9up9TOdOuO0",
  "refresh_expires_at": "2026-10-31T02:59:15.750047143Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5942876d-358f-40a6-8efb-41d8177086a2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
      "author_type": "RIDER",
      "author_id": "de876884-00ae-43e9-ae92-956dcc6080bd",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T14:59:13.98469Z"
    },
    {
      "order_id": "5942876d-358f-40a6-8efb-41d8177086a2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "de876884-00ae-43e9-ae92-956dcc6080bd",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T14:59:14.26388Z"
    }
  ]
}
```

Done: ratings for order 5942876d-358f-40a6-8efb-41d8177086a2.

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
  "session_id": "73e5c34b-10a9-4b76-bcc7-768d8182f769",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNTYsImlhdCI6MTc5MzM3MjM1NiwianRpIjoiMjBkNGZiYmItOWU5MC00ODAzLTk1NGEtMmE0YTNjNmExMTBjIiwic2lkIjoiNzNlNWMzNGItMTBhOS00Yjc2LWJjYzctNzY4ZDgxODJmNzY5In0.Z99hUcx-qIvSiax8TrFgStaZ2zoVlKIyk3pOC4zEMZk",
  "access_expires_at": "2026-10-30T15:14:16.644680753Z",
  "refresh_token": "gHMsXvseCk1aXgkZ-DvqMByDedyLR0YcF73ud-_VIbc",
  "refresh_expires_at": "2026-10-31T02:59:16.644092273Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "45c6b17e-b581-4ff4-9a9f-3c7654f97c79",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "90389eef-da3d-4305-9153-530b9a3db736",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:59:16.933344Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/90389eef-da3d-4305-9153-530b9a3db736` → **200**

```json
{
  "id": "90389eef-da3d-4305-9153-530b9a3db736",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:59:16.933344Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/90389eef-da3d-4305-9153-530b9a3db736` → **200**

```json
{
  "id": "90389eef-da3d-4305-9153-530b9a3db736",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T14:59:16.933344Z",
  "ready_at": "2026-10-30T14:59:17.565193Z",
  "expires_at": "2026-10-31T14:59:17.565193Z"
}
```

`GET /api/admin/v1/reports/exports/90389eef-da3d-4305-9153-530b9a3db736/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,30,11,19,0,0,25,5,0,27,2,0,1,7,1,11
total,30,11,19,0,0,25,5,0,27,2,0,1,7,1,11
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7c0f1208-621c-4d90-b92c-2d5d22b16140",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "c310a294-f69e-45c3-8d5e-f71778c53dce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:59:18.80888Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c310a294-f69e-45c3-8d5e-f71778c53dce` → **200**

```json
{
  "id": "c310a294-f69e-45c3-8d5e-f71778c53dce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:59:18.80888Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c310a294-f69e-45c3-8d5e-f71778c53dce` → **200**

```json
{
  "id": "c310a294-f69e-45c3-8d5e-f71778c53dce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:59:18.80888Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c310a294-f69e-45c3-8d5e-f71778c53dce` → **200**

```json
{
  "id": "c310a294-f69e-45c3-8d5e-f71778c53dce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:59:18.80888Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c310a294-f69e-45c3-8d5e-f71778c53dce` → **200**

```json
{
  "id": "c310a294-f69e-45c3-8d5e-f71778c53dce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T14:59:18.80888Z",
  "ready_at": "2026-10-30T14:59:22.573195Z",
  "expires_at": "2026-10-31T14:59:22.573195Z"
}
```

`GET /api/admin/v1/reports/exports/c310a294-f69e-45c3-8d5e-f71778c53dce/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/174e9a44-b046-4695-a7db-d8533efa22d5` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/174e9a44-b046-4695-a7db-d8533efa22d5",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "80c92fdb-4521-424e-afda-1f575c80f64f"
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
  "session_id": "e008b466-cf86-44b1-b4fa-e3e328ce76d8",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNjMsImlhdCI6MTc5MzM3MjM2MywianRpIjoiYzc3OTA5ZTYtNWM5ZS00YmMzLThjN2MtZThjZWQ5Mzg0NmY4Iiwic2lkIjoiZTAwOGI0NjYtY2Y4Ni00NGIxLWI0ZmEtZTNlMzI4Y2U3NmQ4In0.dMYp7mttxaBU0CQIVcI0t_JjhoWiFYO1amtzaMzDf_8",
  "access_expires_at": "2026-10-30T15:14:23.857946098Z",
  "refresh_token": "qp4A2tbgMUROiSC9b8SB9jQH8MuZphqL_FQPPhfxMLU",
  "refresh_expires_at": "2026-10-31T02:59:23.857435855Z",
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
  "command_id": "90d04d84-4799-43cd-998d-ad22f6d347c8",
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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T14:59:24.434139896Z"
}
```

`POST /sandbox/v1/retention/fixtures/897eaf81-22d3-4871-b35a-3008b4c0730e` → **200**

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

`GET /sandbox/v1/retention/fixtures/897eaf81-22d3-4871-b35a-3008b4c0730e` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/897eaf81-22d3-4871-b35a-3008b4c0730e` → **204**

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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T14:59:24.43414Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "b1123571-03e2-4ae9-bcb6-0510a6e2310f",
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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T14:59:25.116971556Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19783"
}
```

```json
{
  "challenge_id": "a24aed36-f4b2-4a3d-8c1a-0b1e237aab6c",
  "expires_at": "2026-10-30T15:04:25.404349878Z",
  "resend_available_at": "2026-10-30T14:59:26.404349878Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "858089",
  "sent_at": "2026-10-30T14:59:25.407133289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a24aed36-f4b2-4a3d-8c1a-0b1e237aab6c",
  "code": "858089",
  "device_ref": "sandbox-19783"
}
```

```json
{
  "session_id": "39432229-b405-4727-82e1-7284a0824408",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzI2NSwiaWF0IjoxNzkzMzcyMzY1LCJqdGkiOiJjNmZkNTBkMS1kMmM2LTQ3NDUtODQ2Zi1kM2Y5ZDcxMjlmNzUiLCJzaWQiOiIzOTQzMjIyOS1iNDA1LTQ3MjctODJlMS03Mjg0YTA4MjQ0MDgifQ.UOMn0eqcWZTZfKlXEykbu7HW7sC3X61Ex708ujJjhV8",
  "access_expires_at": "2026-10-30T15:14:25.720070338Z",
  "refresh_token": "pd90cQydTRoIrKnqPSXkbP7vUch9yZOWnjKq2g22CvE",
  "refresh_expires_at": "2026-11-29T14:59:25.719429493Z",
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
  "command_id": "8c4abec2-7863-4048-b607-50fc69483d8f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:59:26Z",
    "sequence": 1793372366558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ad44bfd8-e2e7-4327-a0be-952d8c482364",
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
  "last_heartbeat_at": "2026-10-30T14:59:26.575923Z",
  "last_location_at": "2026-10-30T14:59:26.575923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "4a3a9e02-5457-4cae-b3dd-fc7ff8e2dd0b",
  "points": [
    {
      "sequence": 1793372368866,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T14:58:28Z"
    },
    {
      "sequence": 1793372368873,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T14:59:28Z"
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
  "session_id": "e3e14a93-d043-46da-914f-272db3c89145",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNjksImlhdCI6MTc5MzM3MjM2OSwianRpIjoiYTI1YzJiMDYtNWM0YS00MmU5LTg1ODktZTQ0OWIxNWZhYzhhIiwic2lkIjoiZTNlMTRhOTMtZDA0My00NmRhLTkxNGYtMjcyZGIzYzg5MTQ1In0.quZpbBj6p4RauN_7XGj8noMK5WRuMN7vuAwVuoRMwMk",
  "access_expires_at": "2026-10-30T15:14:29.522640707Z",
  "refresh_token": "CqBQC5wVu1KOlEmLnp33M1MwbAHxVGzJxWFUIVzKpu0",
  "refresh_expires_at": "2026-10-31T02:59:29.52203976Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "af2eee81-a6a1-44cb-9c0e-5b7c187d908a",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T14:59:28Z",
        "track_point_id": "5e783cfc-e81c-410f-baa4-a2bc42b97f8c",
        "work_session_id": "ad44bfd8-e2e7-4327-a0be-952d8c482364"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T14:59:28Z",
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/af2eee81-a6a1-44cb-9c0e-5b7c187d908a/confirm` → **200**

```json
{
  "command_id": "74cb9f62-2425-48a6-a970-dfd80131fd8a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "af2eee81-a6a1-44cb-9c0e-5b7c187d908a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T14:59:28Z",
    "track_point_id": "5e783cfc-e81c-410f-baa4-a2bc42b97f8c",
    "work_session_id": "ad44bfd8-e2e7-4327-a0be-952d8c482364"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T14:59:28Z",
  "reason": null,
  "reviewed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reviewed_at": "2026-10-30T14:59:30.394468Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/af2eee81-a6a1-44cb-9c0e-5b7c187d908a/dismiss` → **409**

```json
{
  "command_id": "cd020f4d-9867-4204-ab93-6e71614e94a3",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/af2eee81-a6a1-44cb-9c0e-5b7c187d908a/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d412962d-7d46-4c51-a8fc-1c969c4b28c2"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "563fbe4e-ed62-4e76-a0cb-4e34f994c66e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "fdc6a009-11d6-4a88-af19-c1ca29b9a5f9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "raised_at": "2026-10-30T14:59:30.975305Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/fdc6a009-11d6-4a88-af19-c1ca29b9a5f9/dismiss` → **200**

```json
{
  "command_id": "c9869d5d-dee4-4004-be44-e945c60b186d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "fdc6a009-11d6-4a88-af19-c1ca29b9a5f9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "raised_at": "2026-10-30T14:59:30.975305Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reviewed_at": "2026-10-30T14:59:31.263224Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "6dc0f08a-2f66-4bbb-9f8f-f5c71c9ecc9e",
  "expected_version": 6,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "af2eee81-a6a1-44cb-9c0e-5b7c187d908a"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
    "review_status": "SUSPENDED",
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
      "actor_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:59:31.564929Z"
    }
  ],
  "duplicates": []
}
```

Done: flag af2eee81-a6a1-44cb-9c0e-5b7c187d908a confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7551de5e-3dfe-4496-925e-b6ddace0e58f",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNzIsImlhdCI6MTc5MzM3MjM3MiwianRpIjoiOTE5YjBkOTYtMjBiOS00MDAwLWFiZjctZjdhNWU5N2Q5YjFlIiwic2lkIjoiNzU1MWRlNWUtM2RmZS00NDk2LTkyNWUtYjZkZGFjZTBlNThmIn0.dKg-yxa4fINEOyqsJZtaVFINhJfZxqiqNlPn5mTNWkg",
  "access_expires_at": "2026-10-30T15:14:32.445775522Z",
  "refresh_token": "BBF6EngPbCGw-9S5vvQjjNxms70Goa242EO6VYtulAM",
  "refresh_expires_at": "2026-10-31T02:59:32.445293489Z",
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
      "actor_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:59:31.564929Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5ab5554d-81bf-4075-9cf5-5909bff1100e",
  "expected_version": 7,
  "reason": "Sandbox clean-up"
}
```

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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ad44bfd8-e2e7-4327-a0be-952d8c482364",
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
  "last_heartbeat_at": "2026-10-30T14:59:26.575923Z",
  "last_location_at": "2026-10-30T14:59:26.575923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad44bfd8-e2e7-4327-a0be-952d8c482364/close` → **200**

```json
{
  "command_id": "42ad3e91-72e9-4a46-aa32-430d53c6e2a9",
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
  "session_id": "c6b76f62-551d-4345-be7e-1ce69f8b59a2",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyNzQsImlhdCI6MTc5MzM3MjM3NCwianRpIjoiMzJkN2ViOGUtMGE2NC00NzE2LTllZGYtNWQ2YjRmNzJkYzM1Iiwic2lkIjoiYzZiNzZmNjItNTUxZC00MzQ1LWJlN2UtMWNlNjlmOGI1OWEyIn0.V7vkQNUY6XR4KyV5vQZgvPKpkLlQLOCWMDu5IaMX4DU",
  "access_expires_at": "2026-10-30T15:14:34.211051848Z",
  "refresh_token": "8JQcDw0GWdEm4DJDISYT2lRhya8iEEqCr7RSeeI_4QY",
  "refresh_expires_at": "2026-10-31T02:59:34.210573042Z",
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
  "command_id": "c8477818-0303-4aa2-82c8-bbba9b9448c8",
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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T14:59:34.773423Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c8477818-0303-4aa2-82c8-bbba9b9448c8",
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
  "changed_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T14:59:34.773423Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48250813530",
  "device_ref": "sandbox-22911"
}
```

```json
{
  "challenge_id": "0a7c5981-f4eb-47cc-a293-dc3c5e105206",
  "expires_at": "2026-10-30T15:04:35.377534847Z",
  "resend_available_at": "2026-10-30T14:59:36.377534847Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48250813530` → **200**

```json
{
  "phone": "+48250813530",
  "audience": "CLIENT",
  "code": "875127",
  "sent_at": "2026-10-30T14:59:35.379917853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a7c5981-f4eb-47cc-a293-dc3c5e105206",
  "code": "875127",
  "device_ref": "sandbox-22911"
}
```

```json
{
  "session_id": "964d16f2-b73a-42bc-bec6-5c49b5e3b3d4",
  "subject": {
    "type": "CLIENT",
    "id": "a15c7fc8-400e-4a79-87cb-df538342de9f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTVjN2ZjOC00MDBlLTRhNzktODdjYi1kZjUzODM0MmRlOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMjc1LCJpYXQiOjE3OTMzNzIzNzUsImp0aSI6ImY2OWYyNWIyLWE4YWQtNGU4YS04ZTYxLWUwZmE3ZjNjOThkOCIsInNpZCI6Ijk2NGQxNmYyLWI3M2EtNDJiYy1iZWM2LTVjNDliNWUzYjNkNCJ9.tm6c7QKCl-7zPSldw4cCE7ceF5uFg-ASjpZiFpLh0H0",
  "access_expires_at": "2026-10-30T15:14:35.68177992Z",
  "refresh_token": "yYmfSu8DciOZoJPbwwD8S3RqMaxfvcL8pvQK2sPfrhg",
  "refresh_expires_at": "2026-11-29T14:59:35.681072379Z",
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
  "correlation_id": "a6d18326-eb48-425c-a0df-b9a2bdb9002a"
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
  "device_ref": "sandbox-31558"
}
```

```json
{
  "challenge_id": "03065c15-a76c-4fcb-b9b1-335b108394de",
  "expires_at": "2026-10-30T15:04:36.5134802Z",
  "resend_available_at": "2026-10-30T14:59:37.5134802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "807330",
  "sent_at": "2026-10-30T14:59:36.515917738Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03065c15-a76c-4fcb-b9b1-335b108394de",
  "code": "807330",
  "device_ref": "sandbox-31558"
}
```

```json
{
  "session_id": "a0c1914d-b7c1-42f1-b202-60bb8bcbad33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzI3NiwiaWF0IjoxNzkzMzcyMzc2LCJqdGkiOiI4N2I1NTc2OS03MmVhLTRmY2MtOTVjMy0zNGFjNzdmOTI3NWUiLCJzaWQiOiJhMGMxOTE0ZC1iN2MxLTQyZjEtYjIwMi02MGJiOGJjYmFkMzMifQ.OSbeB0w0o2rDK7X4qWXvKTrODlEapsO2vAHKs9zqjpU",
  "access_expires_at": "2026-10-30T15:14:36.825005557Z",
  "refresh_token": "l-XBgvJkejHg35MHnaWZNT5Ubillh2QMrZucpZtKY0A",
  "refresh_expires_at": "2026-11-29T14:59:36.824120265Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "154dc1e3-cdc2-4cd9-a756-c6399cc2970d",
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
  "last_heartbeat_at": "2026-10-30T14:58:18.159439Z",
  "last_location_at": "2026-10-30T14:58:18.159439Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/154dc1e3-cdc2-4cd9-a756-c6399cc2970d/handover` → **200**

```json
{
  "command_id": "a26c08ad-311c-477b-9a91-dcdc56735af0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "154dc1e3-cdc2-4cd9-a756-c6399cc2970d",
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
  "last_heartbeat_at": "2026-10-30T14:58:18.159439Z",
  "last_location_at": "2026-10-30T14:58:18.159439Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/154dc1e3-cdc2-4cd9-a756-c6399cc2970d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:59:37Z",
    "sequence": 1793372377692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "154dc1e3-cdc2-4cd9-a756-c6399cc2970d",
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
  "last_heartbeat_at": "2026-10-30T14:59:37.709701Z",
  "last_location_at": "2026-10-30T14:59:37.709701Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "154dc1e3-cdc2-4cd9-a756-c6399cc2970d",
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
  "last_heartbeat_at": "2026-10-30T14:59:37.709701Z",
  "last_location_at": "2026-10-30T14:59:37.709701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/154dc1e3-cdc2-4cd9-a756-c6399cc2970d/close` → **200**

```json
{
  "command_id": "284f4ae6-8f28-466f-b584-5058a20b42b8",
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
  "correlation_id": "586943cf-7013-423f-b511-5cb5f73aa7a0"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672401437",
  "device_ref": "sandbox-6316"
}
```

```json
{
  "challenge_id": "df012e32-715c-4558-830a-56cd41695acb",
  "expires_at": "2026-10-30T15:04:39.140917075Z",
  "resend_available_at": "2026-10-30T14:59:40.140917075Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672401437` → **200**

```json
{
  "phone": "+380672401437",
  "audience": "CLIENT",
  "code": "506647",
  "sent_at": "2026-10-30T14:59:39.143278222Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df012e32-715c-4558-830a-56cd41695acb",
  "code": "506647",
  "device_ref": "sandbox-6316"
}
```

```json
{
  "session_id": "8788ded8-17ab-43bf-aaf0-34f6eae99d80",
  "subject": {
    "type": "CLIENT",
    "id": "bb5a7151-04a9-42cd-9830-97ec261334b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjVhNzE1MS0wNGE5LTQyY2QtOTgzMC05N2VjMjYxMzM0YjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMjc5LCJpYXQiOjE3OTMzNzIzNzksImp0aSI6IjAyNzI1ZjUyLTBiM2QtNDRiNC1iYzllLWYwM2MxZTNjMGMwMiIsInNpZCI6Ijg3ODhkZWQ4LTE3YWItNDNiZi1hYWYwLTM0ZjZlYWU5OWQ4MCJ9.zRBG-Abof2-9DN0M8BYbwjLbZkVLi5j7aPnHj6cOmpY",
  "access_expires_at": "2026-10-30T15:14:39.442108845Z",
  "refresh_token": "UumMEqbcgs4qTW4cKMMSE4OOcQGgSK0znKfaKim3gr4",
  "refresh_expires_at": "2026-11-29T14:59:39.441505222Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "86d06549-d28f-4e6f-aefc-17a2baeb2064",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "692c3a80-d274-419d-b4fd-385560d0b273",
  "upload_path": "/api/rider/v1/uploads/692c3a80-d274-419d-b4fd-385560d0b273",
  "expires_at": "2026-10-30T15:14:39.734486224Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/692c3a80-d274-419d-b4fd-385560d0b273` → **200**

```json
{
  "file_id": "692c3a80-d274-419d-b4fd-385560d0b273",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "The file did not pass the malware check"
}
```

## A PDF with a JavaScript action behind a name escape (/J#61vaScript) is refused

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "98f4ef93-a315-4008-a519-2e7ffd746fbf",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "2be6641f-6544-4fc9-b737-b444fb516aac",
  "upload_path": "/api/rider/v1/uploads/2be6641f-6544-4fc9-b737-b444fb516aac",
  "expires_at": "2026-10-30T15:14:40.04474093Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/2be6641f-6544-4fc9-b737-b444fb516aac` → **200**

```json
{
  "file_id": "2be6641f-6544-4fc9-b737-b444fb516aac",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "PDF with active content is not accepted"
}
```

## Rider uploads a photo and opens a support case

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "5da708c8-1453-4028-acc9-e64885556f2d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3d683cac-eb39-4435-bf96-f43fe5cb8899",
  "upload_path": "/api/rider/v1/uploads/3d683cac-eb39-4435-bf96-f43fe5cb8899",
  "expires_at": "2026-10-30T15:14:40.348240184Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/3d683cac-eb39-4435-bf96-f43fe5cb8899` → **200**

```json
{
  "file_id": "3d683cac-eb39-4435-bf96-f43fe5cb8899",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "8bf2c2a5-1080-4b96-bf3b-eb10a036070b",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "3d683cac-eb39-4435-bf96-f43fe5cb8899"
  ]
}
```

```json
{
  "id": "703f7d26-146c-4aae-aac4-90557b95d1b2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T14:59:40.65151Z",
  "updated_at": "2026-10-30T14:59:40.65151Z",
  "respond_by": "2026-10-30T18:59:40.65151Z",
  "messages": [
    {
      "id": "22e02f19-230f-40a8-a91c-910e1d1dedcb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:59:40.652612Z",
      "attachments": [
        {
          "file_id": "3d683cac-eb39-4435-bf96-f43fe5cb8899",
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
  "session_id": "adf235af-e6a3-4cb1-ad57-b8d7f87ab7fc",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyODEsImlhdCI6MTc5MzM3MjM4MSwianRpIjoiZGYzMzU5MzMtZDBjZS00YmI5LWI0OTQtN2JhM2NmMjg3OTZmIiwic2lkIjoiYWRmMjM1YWYtZTZhMy00Y2IxLWFkNTctYjhkN2Y4N2FiN2ZjIn0.6frcWrEvun4ujBbU3k6y1FXWyUWlt6RnRSdW0A7Z0bs",
  "access_expires_at": "2026-10-30T15:14:41.290650026Z",
  "refresh_token": "VyoEa-Vhf1TkPXLKSYR3DcJduoRY32r954Tgl2fSWgI",
  "refresh_expires_at": "2026-10-31T02:59:41.290168985Z",
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
  "session_id": "a1dd6b8a-3780-4867-96f1-78ba4ed25461",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyODEsImlhdCI6MTc5MzM3MjM4MSwianRpIjoiMGVlYzdlOGEtMWUxYS00YjQ3LTg0N2MtZDk4ZWJhZGU0NTliIiwic2lkIjoiYTFkZDZiOGEtMzc4MC00ODY3LTk2ZjEtNzhiYTRlZDI1NDYxIn0.DFKHIJm8hGOlmXBFNba8_wVaZVqh2pYVkF15CGUI_30",
  "access_expires_at": "2026-10-30T15:14:41.882851374Z",
  "refresh_token": "s8EjdUutli8Qezg87GimX0mmIKR7uTKk-F5xnEXXlCE",
  "refresh_expires_at": "2026-10-31T02:59:41.882334091Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/703f7d26-146c-4aae-aac4-90557b95d1b2/attachments/3d683cac-eb39-4435-bf96-f43fe5cb8899` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "836679e1-e81a-478e-a1c0-e33a1c538cee",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e4070097-4741-4dc1-9da6-701aff2bb892",
  "upload_path": "/api/operator/v1/uploads/e4070097-4741-4dc1-9da6-701aff2bb892",
  "expires_at": "2026-10-30T15:14:42.178021861Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e4070097-4741-4dc1-9da6-701aff2bb892` → **200**

```json
{
  "file_id": "e4070097-4741-4dc1-9da6-701aff2bb892",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/703f7d26-146c-4aae-aac4-90557b95d1b2` → **200**

```json
{
  "id": "703f7d26-146c-4aae-aac4-90557b95d1b2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T14:59:40.65151Z",
  "updated_at": "2026-10-30T14:59:40.65151Z",
  "respond_by": "2026-10-30T18:59:40.65151Z",
  "messages": [
    {
      "id": "22e02f19-230f-40a8-a91c-910e1d1dedcb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:59:40.652612Z",
      "attachments": [
        {
          "file_id": "3d683cac-eb39-4435-bf96-f43fe5cb8899",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/703f7d26-146c-4aae-aac4-90557b95d1b2/comments` → **200**

```json
{
  "command_id": "7ad95ebe-5361-4ee9-b5f5-d77bdb85b1a3",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e4070097-4741-4dc1-9da6-701aff2bb892"
  ]
}
```

```json
{
  "id": "703f7d26-146c-4aae-aac4-90557b95d1b2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T14:59:40.65151Z",
  "updated_at": "2026-10-30T14:59:42.783556Z",
  "respond_by": "2026-10-30T18:59:40.65151Z",
  "messages": [
    {
      "id": "22e02f19-230f-40a8-a91c-910e1d1dedcb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:59:40.652612Z",
      "attachments": [
        {
          "file_id": "3d683cac-eb39-4435-bf96-f43fe5cb8899",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9d49548d-6ec5-4eeb-aa05-9fa66d5df3e9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T14:59:42.783082Z",
      "attachments": [
        {
          "file_id": "e4070097-4741-4dc1-9da6-701aff2bb892",
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

`GET /api/rider/v1/support/cases/703f7d26-146c-4aae-aac4-90557b95d1b2` → **200**

```json
{
  "id": "703f7d26-146c-4aae-aac4-90557b95d1b2",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T14:59:40.65151Z",
  "updated_at": "2026-10-30T14:59:42.783556Z",
  "respond_by": "2026-10-30T18:59:40.65151Z",
  "messages": [
    {
      "id": "22e02f19-230f-40a8-a91c-910e1d1dedcb",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "bb5a7151-04a9-42cd-9830-97ec261334b4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:59:40.652612Z",
      "attachments": [
        {
          "file_id": "3d683cac-eb39-4435-bf96-f43fe5cb8899",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9d49548d-6ec5-4eeb-aa05-9fa66d5df3e9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T14:59:42.783082Z",
      "attachments": [
        {
          "file_id": "e4070097-4741-4dc1-9da6-701aff2bb892",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/703f7d26-146c-4aae-aac4-90557b95d1b2/attachments/e4070097-4741-4dc1-9da6-701aff2bb892` → **200**

Done: support case 703f7d26-146c-4aae-aac4-90557b95d1b2, rider attachment 3d683cac-eb39-4435-bf96-f43fe5cb8899, operator attachment e4070097-4741-4dc1-9da6-701aff2bb892.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738219940",
  "device_ref": "sandbox-2631"
}
```

```json
{
  "challenge_id": "3d99a5e7-fff3-4a27-b24a-e36b498d54e2",
  "expires_at": "2026-10-30T15:04:43.391136849Z",
  "resend_available_at": "2026-10-30T14:59:44.391136849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738219940` → **200**

```json
{
  "phone": "+380738219940",
  "audience": "CLIENT",
  "code": "857170",
  "sent_at": "2026-10-30T14:59:43.394613147Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d99a5e7-fff3-4a27-b24a-e36b498d54e2",
  "code": "857170",
  "device_ref": "sandbox-2631"
}
```

```json
{
  "session_id": "5a7cd2e8-ae4a-4168-b6f3-f89f0bc68b24",
  "subject": {
    "type": "CLIENT",
    "id": "e9a5fe98-c06a-4734-9241-70a4e55068ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOWE1ZmU5OC1jMDZhLTQ3MzQtOTI0MS03MGE0ZTU1MDY4YWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMjgzLCJpYXQiOjE3OTMzNzIzODMsImp0aSI6IjgzNzA4ZWRlLWNkODctNDI0ZS05ZDY1LWY0NGQzMzY3ZWIxZCIsInNpZCI6IjVhN2NkMmU4LWFlNGEtNDE2OC1iNmYzLWY4OWYwYmM2OGIyNCJ9.C88GMghGA2jc48nMzT7PMg4CkOxQCWI9BkvRubbmEpc",
  "access_expires_at": "2026-10-30T15:14:43.69944185Z",
  "refresh_token": "1S7WMLm8SCCRhWzNaJLSzkJvdHdaiRkDDcipTqj4OM0",
  "refresh_expires_at": "2026-11-29T14:59:43.698828938Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d087b78f-8af3-4a46-870d-8d4e5052d8e3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a27f93c9-87b8-49e1-9aba-5fdf07c5177c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a27f93c9-87b8-49e1-9aba-5fdf07c5177c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "82b2a542f58fb2beafc413e64472b4f2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a27f93c9-87b8-49e1-9aba-5fdf07c5177c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738219940"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a27f93c9-87b8-49e1-9aba-5fdf07c5177c",
  "expires_at": "2026-10-30T15:29:43.975714Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/a27f93c9-87b8-49e1-9aba-5fdf07c5177c` → **200**

```json
{
  "id": "a27f93c9-87b8-49e1-9aba-5fdf07c5177c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:29:43.975714Z",
  "card": {
    "id": "28e83b3d-be92-4512-99ec-8a169aa058e3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9520",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:59:44.256162Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "601aa20e-b2f5-4997-b03d-3518da8d5b0d",
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
  "id": "c53f4720-5f24-463e-9f8c-9d136681c658",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:04:44.559594Z",
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
  "command_id": "d3a0e999-9b91-4897-a3e7-eb899aa2a495",
  "quote_id": "c53f4720-5f24-463e-9f8c-9d136681c658",
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
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0` → **200**

```json
{
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0` → **200**

```json
{
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
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

`GET /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0` → **200**

```json
{
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0/switch-to-cash` → **200**

```json
{
  "command_id": "918542b4-829a-48e1-8e85-778e63876666",
  "expected_version": 3
}
```

```json
{
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0/switch-to-cash` → **409**

```json
{
  "command_id": "121a2313-b219-4b19-8379-b9beaad90611",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c7debde7-8fd3-4392-87c6-5598530c3fe3"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0` → **200**

```json
{
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b637564a-0ea8-4d58-9bde-f957b9b31cc0/cancel` → **200**

```json
{
  "command_id": "8cdce1b1-427d-449a-8ab9-c6703e82776e",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b637564a-0ea8-4d58-9bde-f957b9b31cc0",
  "short_number": 33,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e9a5fe98-c06a-4734-9241-70a4e55068ae",
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
  "created_at": "2026-10-30T14:59:44.851629Z",
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
  "session_id": "9be43e39-c688-4282-afab-ccf3821fa106",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMyODgsImlhdCI6MTc5MzM3MjM4OCwianRpIjoiZjJhMGZhN2QtOTdkNi00ZDI4LTkyNTAtMWZkMTliZmY1OTM2Iiwic2lkIjoiOWJlNDNlMzktYzY4OC00MjgyLWFmYWItY2NmMzgyMWZhMTA2In0.FhcTohrtzlA9uu_XZxUvd2goAGPhCNCMkUWVYbu4yJc",
  "access_expires_at": "2026-10-30T15:14:48.547976134Z",
  "refresh_token": "NJ6lkOwHh2ZHB2JYdjQ8Z4m5A9fFBCIS9uGI4EFjfUg",
  "refresh_expires_at": "2026-10-31T02:59:48.547315938Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26243"
}
```

```json
{
  "challenge_id": "bd222617-1570-40de-a02e-441603c0643c",
  "expires_at": "2026-10-30T15:04:48.82130082Z",
  "resend_available_at": "2026-10-30T14:59:49.82130082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "239250",
  "sent_at": "2026-10-30T14:59:48.823650481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd222617-1570-40de-a02e-441603c0643c",
  "code": "239250",
  "device_ref": "sandbox-26243"
}
```

```json
{
  "session_id": "300990c2-e0dd-4a25-bfc5-aa37b4261ff1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzI4OSwiaWF0IjoxNzkzMzcyMzg5LCJqdGkiOiJjZjU5MTUxOC1iMGI3LTQ4ZjAtYmUzMy1jNjg1ZWE5ZDVmNjUiLCJzaWQiOiIzMDA5OTBjMi1lMGRkLTRhMjUtYmZjNS1hYTM3YjQyNjFmZjEifQ.4eIhDwdnmoyt6N5He_b_oJWZEk_iRYvEq8gfu6FwOv0",
  "access_expires_at": "2026-10-30T15:14:49.135686284Z",
  "refresh_token": "VVPrA1KwUhpyfPPR8YbzJ4agmrkvkt2RiVPrG36eB24",
  "refresh_expires_at": "2026-11-29T14:59:49.135186337Z",
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
  "version": 9,
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
    "version": 9,
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
      "actor_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:59:31.564929Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T14:59:33.020645Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "f8599e63-76f6-47d6-90ca-e96738ab21e3",
  "expected_version": 9,
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
  "version": 10,
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
  "device_ref": "sandbox-18049"
}
```

```json
{
  "challenge_id": "1a93ddd0-0310-4e8e-9b99-a8f338c51e45",
  "expires_at": "2026-10-30T15:04:50.282965587Z",
  "resend_available_at": "2026-10-30T14:59:51.282965587Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "518163",
  "sent_at": "2026-10-30T14:59:50.285421367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a93ddd0-0310-4e8e-9b99-a8f338c51e45",
  "code": "518163",
  "device_ref": "sandbox-18049"
}
```

```json
{
  "session_id": "a2e976b8-66df-4580-be15-7b4d3782c53d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzI5MCwiaWF0IjoxNzkzMzcyMzkwLCJqdGkiOiI5ZDNlM2Y4Mi1iZDg5LTRhYzEtYWQwMy1lOTlkY2UzNmMzOTUiLCJzaWQiOiJhMmU5NzZiOC02NmRmLTQ1ODAtYmUxNS03YjRkMzc4MmM1M2QifQ.g9Ktc40G7A9tip67cJ-NI89rXghcru4jnK-nSCAA2ig",
  "access_expires_at": "2026-10-30T15:14:50.590171578Z",
  "refresh_token": "YXIW3NSnDHvVcxRRffzIdbx8Js2h0eZgNYicdxCkNSU",
  "refresh_expires_at": "2026-11-29T14:59:50.589611143Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T14:59:13.389727Z",
  "last_location_at": "2026-10-30T14:59:13.389727Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c97c544d-363a-4f5e-8178-21a108f258ba/handover` → **200**

```json
{
  "command_id": "a9d60575-e211-4bc9-8c3b-c7e944ac30e6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T14:59:13.389727Z",
  "last_location_at": "2026-10-30T14:59:13.389727Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 11 s to the next point)

`POST /api/driver/v1/work-sessions/c97c544d-363a-4f5e-8178-21a108f258ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:00:02Z",
    "sequence": 1793372402468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T15:00:02.486453Z",
  "last_location_at": "2026-10-30T15:00:02.486453Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "command_id": "e97ff4ef-db07-42aa-b225-754417bff4d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:00:03Z",
    "sequence": 1793372403630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2fc14550-a9bc-4faf-97e5-b970e38b070d",
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
  "last_heartbeat_at": "2026-10-30T15:00:03.079706Z",
  "last_location_at": "2026-10-30T15:00:03.079706Z",
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
  "session_id": "79bd4141-00b5-4bf7-904d-720d3dc58140",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzMzMDMsImlhdCI6MTc5MzM3MjQwMywianRpIjoiYWM3N2E2OWUtZTAxMy00NDgzLTg3MWMtZjAwNGI1ZDIwNDJiIiwic2lkIjoiNzliZDQxNDEtMDBiNS00YmY3LTkwNGQtNzIwZDNkYzU4MTQwIn0.xTTT1EYioTudlHnzaKvf_5eik4j9rijhmZhjSm4-JbA",
  "access_expires_at": "2026-10-30T15:15:03.679682293Z",
  "refresh_token": "96-oYAUAPK3SrCmdOwXuZqNr6m5DXUJWfC4CUustJMU",
  "refresh_expires_at": "2026-10-31T03:00:03.679018574Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0be36879-d800-4755-bfea-50691240be20",
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
  "id": "c18ba748-c783-4938-8890-2efc9be6251b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:05:03.961647Z",
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
  "command_id": "4f5576ff-dc0b-4b90-91b0-d1866e3c204f",
  "quote_id": "c18ba748-c783-4938-8890-2efc9be6251b",
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
  "id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "short_number": 34,
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
  "created_at": "2026-10-30T15:00:04.259954Z",
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
    "id": "c55fe70f-9438-4e9d-9892-6dc207cc204c",
    "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
    "expires_at": "2026-10-30T15:00:19.264394Z",
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

`POST /api/driver/v1/offers/c55fe70f-9438-4e9d-9892-6dc207cc204c/accept` → **200**

```json
{
  "command_id": "b2a31bc4-3dac-4880-8986-d7e41472a99c"
}
```

```json
{
  "id": "d57fb2a1-7026-412e-9281-51c93d4b6723",
  "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "15e29506-c62b-4361-a7ae-9d115634a748",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "15e29506-c62b-4361-a7ae-9d115634a748",
  "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "assignment_id": "d57fb2a1-7026-412e-9281-51c93d4b6723",
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

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/2fc14550-a9bc-4faf-97e5-b970e38b070d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:00:15Z",
    "sequence": 1793372415758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2fc14550-a9bc-4faf-97e5-b970e38b070d",
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
  "last_heartbeat_at": "2026-10-30T15:00:15.77536Z",
  "last_location_at": "2026-10-30T15:00:15.77536Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/15e29506-c62b-4361-a7ae-9d115634a748/arrive` → **200**

```json
{
  "command_id": "d09a4697-21fd-4ece-9310-8aa0f010f3d7",
  "expected_version": 0
}
```

```json
{
  "id": "15e29506-c62b-4361-a7ae-9d115634a748",
  "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "assignment_id": "d57fb2a1-7026-412e-9281-51c93d4b6723",
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
  "arrived_at": "2026-10-30T15:00:16.059422Z",
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

`POST /api/driver/v1/trips/15e29506-c62b-4361-a7ae-9d115634a748/start` → **200**

```json
{
  "command_id": "fe86ca47-2d44-46b3-975c-4e7c0d7b5ea5",
  "expected_version": 1
}
```

```json
{
  "id": "15e29506-c62b-4361-a7ae-9d115634a748",
  "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "assignment_id": "d57fb2a1-7026-412e-9281-51c93d4b6723",
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
  "arrived_at": "2026-10-30T15:00:16.059422Z",
  "started_at": "2026-10-30T15:00:16.365301Z",
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

`POST /api/driver/v1/trips/15e29506-c62b-4361-a7ae-9d115634a748/complete` → **200**

```json
{
  "command_id": "dbd57709-7751-4d9f-96fa-1647113166d4",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:00:16Z",
  "cash_received": true
}
```

```json
{
  "id": "15e29506-c62b-4361-a7ae-9d115634a748",
  "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "assignment_id": "d57fb2a1-7026-412e-9281-51c93d4b6723",
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
  "arrived_at": "2026-10-30T15:00:16.059422Z",
  "started_at": "2026-10-30T15:00:16.365301Z",
  "completed_at": "2026-10-30T15:00:16.663437Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/8d6fe392-66e9-4e20-a249-35616bd196b2` → **200**

```json
{
  "id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
  "short_number": 34,
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
    "id": "d57fb2a1-7026-412e-9281-51c93d4b6723",
    "order_id": "8d6fe392-66e9-4e20-a249-35616bd196b2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "15e29506-c62b-4361-a7ae-9d115634a748",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:00:04.259954Z",
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
  "session_id": "c97c544d-363a-4f5e-8178-21a108f258ba",
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
  "last_heartbeat_at": "2026-10-30T15:00:02.486453Z",
  "last_location_at": "2026-10-30T15:00:02.486453Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c97c544d-363a-4f5e-8178-21a108f258ba/close` → **200**

```json
{
  "command_id": "c1bef284-4753-4985-a437-a1d8aa8447b3",
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
  "session_id": "2fc14550-a9bc-4faf-97e5-b970e38b070d",
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
  "last_heartbeat_at": "2026-10-30T15:00:15.77536Z",
  "last_location_at": "2026-10-30T15:00:15.77536Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2fc14550-a9bc-4faf-97e5-b970e38b070d/close` → **200**

```json
{
  "command_id": "aa835381-1d2d-4c0a-b67e-5645a59b3e29",
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

Done: terminal order 8d6fe392-66e9-4e20-a249-35616bd196b2 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6414"
}
```

```json
{
  "challenge_id": "bc64e914-0fd6-4b56-9cad-84dbfb588230",
  "expires_at": "2026-10-30T15:05:21.676691638Z",
  "resend_available_at": "2026-10-30T15:00:22.676691638Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "259165",
  "sent_at": "2026-10-30T15:00:21.680469082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc64e914-0fd6-4b56-9cad-84dbfb588230",
  "code": "259165",
  "device_ref": "sandbox-6414"
}
```

```json
{
  "session_id": "2529b323-d47b-4151-8487-06bc9e8c2d98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzMyMSwiaWF0IjoxNzkzMzcyNDIxLCJqdGkiOiI4NTRmYjI4Yi05NWZlLTQ5MjMtYjllZC1iZjg0MWY0M2U5YjEiLCJzaWQiOiIyNTI5YjMyMy1kNDdiLTQxNTEtODQ4Ny0wNmJjOWU4YzJkOTgifQ.8hrD9hGa7p8OWtpzqFMjgaqUbM-nDrAM2fTvSFNoPSw",
  "access_expires_at": "2026-10-30T15:15:21.986944004Z",
  "refresh_token": "TDvmbRb_wZo4lmByTuy1573qs1sZ6rTws5tvpL41vtY",
  "refresh_expires_at": "2026-11-29T15:00:21.986150963Z",
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
  "device_ref": "sandbox-14736"
}
```

```json
{
  "challenge_id": "84018c24-d31e-4fe2-977c-96276a22eefb",
  "expires_at": "2026-10-30T15:05:22.541738622Z",
  "resend_available_at": "2026-10-30T15:00:23.541738622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "722718",
  "sent_at": "2026-10-30T15:00:22.544424781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84018c24-d31e-4fe2-977c-96276a22eefb",
  "code": "722718",
  "device_ref": "sandbox-14736"
}
```

```json
{
  "session_id": "22ebda22-a6e8-4c32-b6cc-9e0d3e18b532",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzMyMiwiaWF0IjoxNzkzMzcyNDIyLCJqdGkiOiI1YjVlMjAzNi1kNDA2LTQ5MmQtYmYyMC1iZjk2ZjdmZDE3OTIiLCJzaWQiOiIyMmViZGEyMi1hNmU4LTRjMzItYjZjYy05ZTBkM2UxOGI1MzIifQ.KJn9ulXG3gXlT_kTOl-oAJh7T4jLLAhWpqqbLhiQyqY",
  "access_expires_at": "2026-10-30T15:15:22.846463207Z",
  "refresh_token": "5KvDnLumYqKXkqeUSlOgoxK_XTdr_T8_pJFmippEDk0",
  "refresh_expires_at": "2026-11-29T15:00:22.845921835Z",
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
  "device_ref": "sandbox-14708"
}
```

```json
{
  "challenge_id": "9a8270d8-9c7f-4f1b-abb3-aff8c26aacad",
  "expires_at": "2026-10-30T15:05:23.407655291Z",
  "resend_available_at": "2026-10-30T15:00:24.407655291Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "044122",
  "sent_at": "2026-10-30T15:00:23.411274113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a8270d8-9c7f-4f1b-abb3-aff8c26aacad",
  "code": "044122",
  "device_ref": "sandbox-14708"
}
```

```json
{
  "session_id": "4cb851ec-b300-44c4-9666-6b3d3d0f66d7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MzMyMywiaWF0IjoxNzkzMzcyNDIzLCJqdGkiOiIxZjJmODE2MC1iNDU1LTRkNzItOTNjZi05MmFhMDU3ODdlMGMiLCJzaWQiOiI0Y2I4NTFlYy1iMzAwLTQ0YzQtOTY2Ni02YjNkM2QwZjY2ZDcifQ.dUxLzECxkFzVBW4c5fz5g-nY593zBoqvPkmWp7yIb8A",
  "access_expires_at": "2026-10-30T15:15:23.714603488Z",
  "refresh_token": "1bekPX8MmQW5vqaujNVWUirix4-ONQuiyoOg1-7Wuk8",
  "refresh_expires_at": "2026-11-29T15:00:23.713893407Z",
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
  "phone": "+380697014744",
  "device_ref": "sandbox-5045"
}
```

```json
{
  "challenge_id": "492eca46-e4e2-4d12-b3d0-3c65d6aed7bf",
  "expires_at": "2026-10-30T15:05:24.265039803Z",
  "resend_available_at": "2026-10-30T15:00:25.265039803Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380697014744` → **200**

```json
{
  "phone": "+380697014744",
  "audience": "CLIENT",
  "code": "815983",
  "sent_at": "2026-10-30T15:00:24.267412626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "492eca46-e4e2-4d12-b3d0-3c65d6aed7bf",
  "code": "815983",
  "device_ref": "sandbox-5045"
}
```

```json
{
  "session_id": "01c93f59-7ad5-4d5c-8541-5d2420b4da97",
  "subject": {
    "type": "CLIENT",
    "id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2VkN2Y1ZC01MzI4LTQxOWItOWE1YS0xNDRjZTRlMGUzMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzczMzI0LCJpYXQiOjE3OTMzNzI0MjQsImp0aSI6ImE1MThiYTE0LTRjOWYtNDk0Ni05Y2RkLWM3NjFlZTc2MzNhZCIsInNpZCI6IjAxYzkzZjU5LTdhZDUtNGQ1Yy04NTQxLTVkMjQyMGI0ZGE5NyJ9.GPoT2ulH2j2JTJKzCNsJMSWutgCNOdvsni6VrxsZlAU",
  "access_expires_at": "2026-10-30T15:15:24.559745654Z",
  "refresh_token": "viLSiYJSls0brzlwwG5WkJWxHZCuygmQ0iS_1hRHI1A",
  "refresh_expires_at": "2026-11-29T15:00:24.559239597Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c51d037-599c-4bcb-8810-54e26c9a934f",
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
  "id": "19793f2c-08fa-4b11-8eb2-364658e34193",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:05:24.846912Z",
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
  "command_id": "ff8da08d-f1e3-452e-be2b-ea55c14fb6f5",
  "quote_id": "19793f2c-08fa-4b11-8eb2-364658e34193",
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
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:00:25.138057Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:00:25.138057Z",
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
  "blizz_orders_total": 35,
  "blizz_orders_cancelled_total": 21,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 24,
  "blizz_dispatch_assigned_seconds_count": 18,
  "blizz_offers_total": 27,
  "blizz_dispatch_excluded_total": 20,
  "blizz_sms_sent_total": 82
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.442347547
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.643940384
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 7.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 24
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.222333822
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 8.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 27.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 9.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 75.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/27840053-c074-438b-a53d-131598121e95` → **200**

```json
{
  "id": "27840053-c074-438b-a53d-131598121e95",
  "short_number": 35,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "13ed7f5d-5328-419b-9a5a-144ce4e0e320",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:00:25.138057Z",
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
  "session_id": "da969914-00c5-43f2-bb24-deb28601f23c",
  "subject": {
    "type": "STAFF",
    "id": "fc15168e-9caa-4367-8f7a-b6f4ace12f85"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzE1MTY4ZS05Y2FhLTQzNjctOGY3YS1iNmY0YWNlMTJmODUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzM1MTEsImlhdCI6MTc5MzM3MjYxMSwianRpIjoiMmZlMzlkNWYtMzNiNy00YzMyLWE1ODMtNzU1Yjg0MDVmZDNhIiwic2lkIjoiZGE5Njk5MTQtMDBjNS00M2YyLWJiMjQtZGViMjg2MDFmMjNjIn0.sl2nU3Ux4HCpTyyUdMp4as6jChJTj_dIXCkDP_X5wx4",
  "access_expires_at": "2026-10-30T15:18:31.950237233Z",
  "refresh_token": "WzYw_p_LaZTXp5BdUMpo9TZBvo1nLq6TUCIbDafcIEQ",
  "refresh_expires_at": "2026-10-31T03:03:31.949388293Z",
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
  "id": "857c6b99-f7df-4162-a581-d3bcd77e40e1",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.240869Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.240915Z",
  "updated_at": "2026-10-30T15:03:32.258696Z",
  "finished_at": "2026-10-30T15:03:32.258696Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/857c6b99-f7df-4162-a581-d3bcd77e40e1` → **200**

```json
{
  "run": {
    "id": "857c6b99-f7df-4162-a581-d3bcd77e40e1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:03:32.240869Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:03:32.240915Z",
    "updated_at": "2026-10-30T15:03:32.258696Z",
    "finished_at": "2026-10-30T15:03:32.258696Z",
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
  "id": "857c6b99-f7df-4162-a581-d3bcd77e40e1",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.240869Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.240915Z",
  "updated_at": "2026-10-30T15:03:32.258696Z",
  "finished_at": "2026-10-30T15:03:32.258696Z",
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
  "id": "857c6b99-f7df-4162-a581-d3bcd77e40e1",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.240869Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.240915Z",
  "updated_at": "2026-10-30T15:03:32.258696Z",
  "finished_at": "2026-10-30T15:03:32.258696Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/f82bc74e-7b5c-44e6-86af-0602b3431de7` → **204**

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
  "id": "26e9b624-83b4-405c-9b65-6df881557c69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.687111Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.687146Z",
  "updated_at": "2026-10-30T15:03:32.695073Z",
  "finished_at": "2026-10-30T15:03:32.695073Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/26e9b624-83b4-405c-9b65-6df881557c69` → **200**

```json
{
  "run": {
    "id": "26e9b624-83b4-405c-9b65-6df881557c69",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:03:32.687111Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:03:32.687146Z",
    "updated_at": "2026-10-30T15:03:32.695073Z",
    "finished_at": "2026-10-30T15:03:32.695073Z",
    "version": 1
  },
  "items": [
    {
      "id": "171a22a1-ff6e-4bf3-9254-b8ebfea35976",
      "run_id": "26e9b624-83b4-405c-9b65-6df881557c69",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "69a72552deb44faecb663a9b84b154de3c93aeeeff9fccd4984c7b8129614df4",
      "reference_display": "sandbox-reconciliation-f82bc74e-7b5c-44e6-86af-0602b3431de7",
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
      "provider_at": "2026-10-30T15:03:32Z",
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
  "id": "26e9b624-83b4-405c-9b65-6df881557c69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.687111Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.687146Z",
  "updated_at": "2026-10-30T15:03:32.695073Z",
  "finished_at": "2026-10-30T15:03:32.695073Z",
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
  "id": "26e9b624-83b4-405c-9b65-6df881557c69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.687111Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.687146Z",
  "updated_at": "2026-10-30T15:03:32.695073Z",
  "finished_at": "2026-10-30T15:03:32.695073Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/171a22a1-ff6e-4bf3-9254-b8ebfea35976/resolve` → **200**

```json
{
  "command_id": "fcf63982-1d99-47aa-8962-2a283d8089e6",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "171a22a1-ff6e-4bf3-9254-b8ebfea35976",
  "run_id": "26e9b624-83b4-405c-9b65-6df881557c69",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "69a72552deb44faecb663a9b84b154de3c93aeeeff9fccd4984c7b8129614df4",
  "reference_display": "sandbox-reconciliation-f82bc74e-7b5c-44e6-86af-0602b3431de7",
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
  "provider_at": "2026-10-30T15:03:32Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "resolved_at": "2026-10-30T15:03:33.103954Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/171a22a1-ff6e-4bf3-9254-b8ebfea35976/resolve` → **200**

```json
{
  "command_id": "fcf63982-1d99-47aa-8962-2a283d8089e6",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "171a22a1-ff6e-4bf3-9254-b8ebfea35976",
  "run_id": "26e9b624-83b4-405c-9b65-6df881557c69",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "69a72552deb44faecb663a9b84b154de3c93aeeeff9fccd4984c7b8129614df4",
  "reference_display": "sandbox-reconciliation-f82bc74e-7b5c-44e6-86af-0602b3431de7",
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
  "provider_at": "2026-10-30T15:03:32Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
  "resolved_at": "2026-10-30T15:03:33.103954Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/171a22a1-ff6e-4bf3-9254-b8ebfea35976/resolve` → **409**

```json
{
  "command_id": "18c8715d-8e08-4942-a109-73b2a810d8db",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/171a22a1-ff6e-4bf3-9254-b8ebfea35976/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6b046744-6e27-4341-aa44-4a854a333b57"
}
```

`GET /api/admin/v1/payment-reconciliations/26e9b624-83b4-405c-9b65-6df881557c69` → **200**

```json
{
  "run": {
    "id": "26e9b624-83b4-405c-9b65-6df881557c69",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:03:32.687111Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:03:32.687146Z",
    "updated_at": "2026-10-30T15:03:33.103954Z",
    "finished_at": "2026-10-30T15:03:32.695073Z",
    "version": 2
  },
  "items": [
    {
      "id": "171a22a1-ff6e-4bf3-9254-b8ebfea35976",
      "run_id": "26e9b624-83b4-405c-9b65-6df881557c69",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "69a72552deb44faecb663a9b84b154de3c93aeeeff9fccd4984c7b8129614df4",
      "reference_display": "sandbox-reconciliation-f82bc74e-7b5c-44e6-86af-0602b3431de7",
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
      "provider_at": "2026-10-30T15:03:32Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "fc15168e-9caa-4367-8f7a-b6f4ace12f85",
      "resolved_at": "2026-10-30T15:03:33.103954Z",
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
      "id": "26e9b624-83b4-405c-9b65-6df881557c69",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T15:03:32.687111Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:03:32.687146Z",
      "updated_at": "2026-10-30T15:03:33.103954Z",
      "finished_at": "2026-10-30T15:03:32.695073Z",
      "version": 2
    },
    {
      "id": "d10e1ae3-5ec4-4540-9461-43abfe87c05b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T14:43:47.274717Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T14:43:47.274856Z",
      "updated_at": "2026-10-30T14:43:47.281211Z",
      "finished_at": "2026-10-30T14:43:47.281211Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/f82bc74e-7b5c-44e6-86af-0602b3431de7` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "26e9b624-83b4-405c-9b65-6df881557c69",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:03:32.687111Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:03:32.687146Z",
  "updated_at": "2026-10-30T15:03:33.103954Z",
  "finished_at": "2026-10-30T15:03:32.695073Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793372737659E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79337273807E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79337273807E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793372737659E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79337273807E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
