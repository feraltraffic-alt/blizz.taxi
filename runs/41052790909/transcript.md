# Sandbox transcript (2026-10-30T12:06:31Z, 95ad1f1)

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
  "correlation_id": "0f62b09a-b408-4017-ab1e-05e7a04991c9"
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
  "session_id": "fa487345-fdc6-438c-92ec-a4b1f9e3d611",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI4OTYsImlhdCI6MTc5MzM2MTk5NiwianRpIjoiOTcwZTNhZWEtM2RkZS00ZWFhLTk2OWItZWM1NGRkZmQyNWE2Iiwic2lkIjoiZmE0ODczNDUtZmRjNi00MzhjLTkyZWMtYTRiMWY5ZTNkNjExIn0.FZ_IYaCXHl1LxeBjKRsMCthtBMF6eSXRzQJFgwMvdzE",
  "access_expires_at": "2026-10-30T12:21:36.494111519Z",
  "refresh_token": "tkoWyzc1QMGNmTijFMkuRjoCfQTTRBa0V3Ovzxa-cW8",
  "refresh_expires_at": "2026-10-31T00:06:36.492572508Z",
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
  "session_id": "ba97280a-61dc-45e3-ae21-0e6fe66a5975",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI4OTcsImlhdCI6MTc5MzM2MTk5NywianRpIjoiYTVhMDNhZTYtNWY5OC00NmYzLWJhMGItYTYxYWUxOTIzOWMwIiwic2lkIjoiYmE5NzI4MGEtNjFkYy00NWUzLWFlMjEtMGU2ZmU2NmE1OTc1In0.9sMz4-Rz2-rrAnMI3sL-IWdG9CFDRdGsvMWPKrSS8tM",
  "access_expires_at": "2026-10-30T12:21:37.768342009Z",
  "refresh_token": "olliaXgCPvsEiJsvMHJCEK4fX4eddwDfDvNIdBqhXSw",
  "refresh_expires_at": "2026-10-31T00:06:37.767648954Z",
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
  "device_ref": "sandbox-32728"
}
```

```json
{
  "challenge_id": "0ebc07c4-7e44-432e-9374-7bf3667978af",
  "expires_at": "2026-10-30T12:11:38.165483423Z",
  "resend_available_at": "2026-10-30T12:06:39.165483423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "769866",
  "sent_at": "2026-10-30T12:06:38.174379545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ebc07c4-7e44-432e-9374-7bf3667978af",
  "code": "769866",
  "device_ref": "sandbox-32728"
}
```

```json
{
  "session_id": "1d1e405a-9c95-4224-9d54-4e774e07a6d4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjg5OCwiaWF0IjoxNzkzMzYxOTk4LCJqdGkiOiI0ZTc1NDBlMy1hYzhkLTRhYzktODAxMy1iZDEwNmUzZDFmNmUiLCJzaWQiOiIxZDFlNDA1YS05Yzk1LTQyMjQtOWQ1NC00ZTc3NGUwN2E2ZDQifQ.bWHO3pEVLcPl66OBqZNE2Ypi6EK0TyWLP3WM7l5EvgU",
  "access_expires_at": "2026-10-30T12:21:38.405998027Z",
  "refresh_token": "X-7ugi-OsHnvpQAp7pHAlhgF0KG1K_KK00_hAdoIy6Q",
  "refresh_expires_at": "2026-11-29T12:06:38.405100136Z",
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
  "command_id": "b9015e56-acf0-40f0-a72d-e7848055b2c7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:38Z",
    "sequence": 1793361998774
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eaa23055-88dc-40ba-b005-0ffa47292f81",
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
  "last_heartbeat_at": "2026-10-30T12:06:38.824761Z",
  "last_location_at": "2026-10-30T12:06:38.824761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633650707",
  "device_ref": "sandbox-6007"
}
```

```json
{
  "challenge_id": "033e05be-74a5-419f-a2fa-68b40be35a0f",
  "expires_at": "2026-10-30T12:11:39.012563116Z",
  "resend_available_at": "2026-10-30T12:06:40.012563116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633650707` → **200**

```json
{
  "phone": "+380633650707",
  "audience": "CLIENT",
  "code": "698311",
  "sent_at": "2026-10-30T12:06:39.016286098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "033e05be-74a5-419f-a2fa-68b40be35a0f",
  "code": "698311",
  "device_ref": "sandbox-6007"
}
```

```json
{
  "session_id": "1b45ff5a-5a50-4ca4-bc72-9c921d128dbc",
  "subject": {
    "type": "CLIENT",
    "id": "d89f0955-5307-4519-878e-4da91d508c7d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODlmMDk1NS01MzA3LTQ1MTktODc4ZS00ZGE5MWQ1MDhjN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyODk5LCJpYXQiOjE3OTMzNjE5OTksImp0aSI6IjRjNDUyNTQ5LWRjYzQtNDYzYS04MmQyLTkwM2VhNWEzYmYxMyIsInNpZCI6IjFiNDVmZjVhLTVhNTAtNGNhNC1iYzcyLTljOTIxZDEyOGRiYyJ9.2HHujJ0vVxkYc1hoiNUs6k-h21N1zZpyRacsQw0B96k",
  "access_expires_at": "2026-10-30T12:21:39.238258547Z",
  "refresh_token": "CNdj4OJWuHtRPvcDpn5XuFnKIAMGn6bHaHsOHH28lEQ",
  "refresh_expires_at": "2026-11-29T12:06:39.23762731Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ccd2caab-97f7-4bd6-b507-be501c9fb53d",
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
  "id": "ed400d05-1800-4204-bc2e-ee6fa44185c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:11:39.451899Z",
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
  "command_id": "e2746865-476d-47e5-8861-df8384db32db",
  "quote_id": "ed400d05-1800-4204-bc2e-ee6fa44185c4",
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
  "id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d89f0955-5307-4519-878e-4da91d508c7d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:06:39.702104Z",
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
    "id": "46fe0ec5-923c-4895-82d2-50f322a9c76b",
    "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
    "expires_at": "2026-10-30T12:06:54.709214Z",
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

`POST /api/driver/v1/offers/46fe0ec5-923c-4895-82d2-50f322a9c76b/accept` → **200**

```json
{
  "command_id": "13f4788c-8683-4d26-a4d4-759f20fbac2e"
}
```

```json
{
  "id": "2b59c99d-1398-4427-95db-dbd02cb41cc6",
  "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1241ed9c-a14d-4287-b14b-09dbe551f419",
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
  "command_id": "1658618f-7508-4e9b-a0b0-94c38e9e4546",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:06:40.566821105Z"
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
  "id": "1241ed9c-a14d-4287-b14b-09dbe551f419",
  "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
  "assignment_id": "2b59c99d-1398-4427-95db-dbd02cb41cc6",
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

`POST /api/driver/v1/work-sessions/eaa23055-88dc-40ba-b005-0ffa47292f81/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:41Z",
    "sequence": 1793362001162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eaa23055-88dc-40ba-b005-0ffa47292f81",
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
  "last_heartbeat_at": "2026-10-30T12:06:41.186295Z",
  "last_location_at": "2026-10-30T12:06:41.186295Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1241ed9c-a14d-4287-b14b-09dbe551f419/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3d226e6a-fd1c-4440-b144-da69fbf590ab",
  "expected_version": 0
}
```

```json
{
  "id": "1241ed9c-a14d-4287-b14b-09dbe551f419",
  "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
  "assignment_id": "2b59c99d-1398-4427-95db-dbd02cb41cc6",
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
  "arrived_at": "2026-10-30T12:06:41.403238Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1241ed9c-a14d-4287-b14b-09dbe551f419/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "87f78102-3d86-4002-a3cb-a10f62337c5f",
  "expected_version": 1
}
```

```json
{
  "id": "1241ed9c-a14d-4287-b14b-09dbe551f419",
  "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
  "assignment_id": "2b59c99d-1398-4427-95db-dbd02cb41cc6",
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
  "arrived_at": "2026-10-30T12:06:41.403238Z",
  "started_at": "2026-10-30T12:06:41.616463Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1241ed9c-a14d-4287-b14b-09dbe551f419/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f9dbd671-41be-4df2-862a-5a89b1092193",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:06:41Z",
  "cash_received": true
}
```

```json
{
  "id": "1241ed9c-a14d-4287-b14b-09dbe551f419",
  "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
  "assignment_id": "2b59c99d-1398-4427-95db-dbd02cb41cc6",
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
  "arrived_at": "2026-10-30T12:06:41.403238Z",
  "started_at": "2026-10-30T12:06:41.616463Z",
  "completed_at": "2026-10-30T12:06:41.823177Z",
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
  "session_id": "eaa23055-88dc-40ba-b005-0ffa47292f81",
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
  "last_heartbeat_at": "2026-10-30T12:06:41.186295Z",
  "last_location_at": "2026-10-30T12:06:41.186295Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eaa23055-88dc-40ba-b005-0ffa47292f81/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "992f297c-c656-4e8b-bf06-1ee411e1dab7",
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
  "command_id": "a1e9e295-ada1-4be7-ae81-715cf5b3f732",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:42Z",
    "sequence": 1793362002408
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
  "correlation_id": "65ffa208-8c51-47ee-a435-a874c8792e26",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "d4e534f0-3779-48cb-9603-9988dcc35c4a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:42Z",
    "sequence": 1793362002608
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f8c79f2-5306-4639-9b51-2e13ff0d6244",
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
  "last_heartbeat_at": "2026-10-30T12:06:42.626956Z",
  "last_location_at": "2026-10-30T12:06:42.626956Z",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T12:06:40.566821Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e148d0ab-2071-4c55-becb-ba24fd8774a5",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:06:43.053140372Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f8c79f2-5306-4639-9b51-2e13ff0d6244",
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
  "last_heartbeat_at": "2026-10-30T12:06:42.626956Z",
  "last_location_at": "2026-10-30T12:06:42.626956Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f8c79f2-5306-4639-9b51-2e13ff0d6244/close` → **200**

```json
{
  "command_id": "e2ca8b4d-a47d-4f0a-9850-d14aef91fcf2",
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
  "session_id": "30f81f1f-6c39-4280-b62c-a08101921f58",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5MDMsImlhdCI6MTc5MzM2MjAwMywianRpIjoiMjJlMzlmMWYtMTcxMC00ZDIzLTgzZjgtOGU1ZWEzYzA5ZmIzIiwic2lkIjoiMzBmODFmMWYtNmMzOS00MjgwLWI2MmMtYTA4MTAxOTIxZjU4In0.nRf9uT7tqlASHtd0fWKJEwXCy3-N0WFUvVtybjvcrEU",
  "access_expires_at": "2026-10-30T12:21:43.830723467Z",
  "refresh_token": "WOBZWAp9shnjD0mjEifN3npUwmel___rdh0FxNfXG44",
  "refresh_expires_at": "2026-10-31T00:06:43.830193069Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2c731a1a-93fa-474d-9935-608752335634",
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
  "id": "ce39da49-6ed3-4a13-9663-c83c5dd56519",
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
  "created_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "created_at": "2026-10-30T12:06:44.018579Z",
  "updated_at": "2026-10-30T12:06:44.018579Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637120843",
  "device_ref": "sandbox-10950"
}
```

```json
{
  "challenge_id": "429d7cd8-34fd-4829-8d28-be2b2f0b16a2",
  "expires_at": "2026-10-30T12:11:44.211400522Z",
  "resend_available_at": "2026-10-30T12:06:45.211400522Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637120843` → **200**

```json
{
  "phone": "+380637120843",
  "audience": "CLIENT",
  "code": "459528",
  "sent_at": "2026-10-30T12:06:44.214684473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "429d7cd8-34fd-4829-8d28-be2b2f0b16a2",
  "code": "459528",
  "device_ref": "sandbox-10950"
}
```

```json
{
  "session_id": "d2468a35-da47-4a4b-9b6e-752da219b9de",
  "subject": {
    "type": "CLIENT",
    "id": "b19a6d00-f60c-4e7d-9385-ccadb8fc1f04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTlhNmQwMC1mNjBjLTRlN2QtOTM4NS1jY2FkYjhmYzFmMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTA0LCJpYXQiOjE3OTMzNjIwMDQsImp0aSI6ImNlYTk1YmM4LWM3YjEtNDZkZS1hNTViLWQ4YTAxN2JmYjllYiIsInNpZCI6ImQyNDY4YTM1LWRhNDctNGE0Yi05YjZlLTc1MmRhMjE5YjlkZSJ9.GrisjbVuyO1NZYsQYsl5YYr1WcsaNt89tH62AlA1SPM",
  "access_expires_at": "2026-10-30T12:21:44.41644854Z",
  "refresh_token": "uVEczQGDmTM2uWglGpAKr0mg505eCLExzDfZQCdIzTE",
  "refresh_expires_at": "2026-11-29T12:06:44.415786628Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637120843` → **200**

```json
{
  "client_id": "b19a6d00-f60c-4e7d-9385-ccadb8fc1f04"
}
```

`POST /api/admin/v1/rider-wallets/b19a6d00-f60c-4e7d-9385-ccadb8fc1f04/top-ups` → **201**

```json
{
  "command_id": "e86b7c4b-d2f0-4279-b587-8ff233242b51",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b19a6d00-f60c-4e7d-9385-ccadb8fc1f04",
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
      "id": "2b404fcd-2e6c-4618-9de0-c66389f76bfb",
      "at": "2026-10-30T12:06:44.775691Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "75efc8f3-cab6-4ad5-810f-2e5e16900728",
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
  "id": "c627e6a7-d023-432a-b3ef-86806af9a87e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:11:44.975960Z",
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
      "id": "ce39da49-6ed3-4a13-9663-c83c5dd56519",
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
  "device_ref": "sandbox-28446"
}
```

```json
{
  "challenge_id": "601a4098-f193-409b-994d-38e6b25ed94f",
  "expires_at": "2026-10-30T12:11:45.16684861Z",
  "resend_available_at": "2026-10-30T12:06:46.16684861Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "439599",
  "sent_at": "2026-10-30T12:06:45.170143397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "601a4098-f193-409b-994d-38e6b25ed94f",
  "code": "439599",
  "device_ref": "sandbox-28446"
}
```

```json
{
  "session_id": "6fe07a15-5d7e-4101-be71-e7760e9db7d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkwNSwiaWF0IjoxNzkzMzYyMDA1LCJqdGkiOiI2YWQ1NGZiYi1hMDRiLTRkNDItYmQ4NC0zZDU1NmYyNGNhNDAiLCJzaWQiOiI2ZmUwN2ExNS01ZDdlLTQxMDEtYmU3MS1lNzc2MGU5ZGI3ZDYifQ.iJs_sMMhTsepm7yf_Odcp0w4u-tMoU3BlXQFGbNEiJE",
  "access_expires_at": "2026-10-30T12:21:45.375835635Z",
  "refresh_token": "8yFPBWg8-m_7m6KYEgfq2FsYlQ2hT0vy_QjTMzEjaPQ",
  "refresh_expires_at": "2026-11-29T12:06:45.375225971Z",
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
  "command_id": "7f5fb2c7-9391-4332-92d1-663585353348",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:45Z",
    "sequence": 1793362005741
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef46dd9e-43f0-41e4-be47-490e3646019b",
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
  "last_heartbeat_at": "2026-10-30T12:06:45.75934Z",
  "last_location_at": "2026-10-30T12:06:45.75934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c0e0f834-a90e-471d-947c-9251abf5ef72",
  "quote_id": "c627e6a7-d023-432a-b3ef-86806af9a87e",
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
  "id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b19a6d00-f60c-4e7d-9385-ccadb8fc1f04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:06:45.959425Z",
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
  "client_id": "b19a6d00-f60c-4e7d-9385-ccadb8fc1f04",
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
      "id": "2b404fcd-2e6c-4618-9de0-c66389f76bfb",
      "at": "2026-10-30T12:06:44.775691Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
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
    "id": "3df3e2d5-27d9-4479-9c20-53b3526fce5f",
    "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
    "expires_at": "2026-10-30T12:07:00.965331Z",
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

`POST /api/driver/v1/offers/3df3e2d5-27d9-4479-9c20-53b3526fce5f/accept` → **200**

```json
{
  "command_id": "ff5392e4-69c6-4d47-af8b-12a043c1c7d3"
}
```

```json
{
  "id": "95b7de28-261e-4ee4-ba10-06a8903c761a",
  "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a",
  "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
  "assignment_id": "95b7de28-261e-4ee4-ba10-06a8903c761a",
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

`POST /api/driver/v1/work-sessions/ef46dd9e-43f0-41e4-be47-490e3646019b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:46Z",
    "sequence": 1793362006880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef46dd9e-43f0-41e4-be47-490e3646019b",
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
  "last_heartbeat_at": "2026-10-30T12:06:46.897473Z",
  "last_location_at": "2026-10-30T12:06:46.897473Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a/arrive` → **200**

```json
{
  "command_id": "3f92f056-493d-4450-86bb-1c794c5732d5",
  "expected_version": 0
}
```

```json
{
  "id": "dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a",
  "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
  "assignment_id": "95b7de28-261e-4ee4-ba10-06a8903c761a",
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
  "arrived_at": "2026-10-30T12:06:47.095439Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a/start` → **200**

```json
{
  "command_id": "a46b07fb-da57-4600-aaf6-732e48c418f6",
  "expected_version": 1
}
```

```json
{
  "id": "dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a",
  "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
  "assignment_id": "95b7de28-261e-4ee4-ba10-06a8903c761a",
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
  "arrived_at": "2026-10-30T12:06:47.095439Z",
  "started_at": "2026-10-30T12:06:47.293571Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a/complete` → **200**

```json
{
  "command_id": "01ef9532-e401-4815-9866-1eaa32a277e6",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:06:47Z",
  "cash_received": true
}
```

```json
{
  "id": "dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a",
  "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
  "assignment_id": "95b7de28-261e-4ee4-ba10-06a8903c761a",
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
  "arrived_at": "2026-10-30T12:06:47.095439Z",
  "started_at": "2026-10-30T12:06:47.293571Z",
  "completed_at": "2026-10-30T12:06:47.502601Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b19a6d00-f60c-4e7d-9385-ccadb8fc1f04",
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
      "id": "4175b96b-2b15-4fa3-ba76-913cf776013c",
      "at": "2026-10-30T12:06:47.956103Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39"
    },
    {
      "id": "2b404fcd-2e6c-4618-9de0-c66389f76bfb",
      "at": "2026-10-30T12:06:44.775691Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/ce39da49-6ed3-4a13-9663-c83c5dd56519/archive` → **200**

```json
{
  "command_id": "2126d251-db66-470d-a7d6-4cf0e18f5528",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "ce39da49-6ed3-4a13-9663-c83c5dd56519",
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
  "created_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "created_at": "2026-10-30T12:06:44.018579Z",
  "updated_at": "2026-10-30T12:06:50.910526Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef46dd9e-43f0-41e4-be47-490e3646019b",
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
  "last_heartbeat_at": "2026-10-30T12:06:46.897473Z",
  "last_location_at": "2026-10-30T12:06:46.897473Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef46dd9e-43f0-41e4-be47-490e3646019b/close` → **200**

```json
{
  "command_id": "bb7718a6-acdb-40f6-9848-698aa90bf957",
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

Done: order ab344b84-6d11-4ecb-965a-98aa6f35bc39.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-5113"
}
```

```json
{
  "challenge_id": "5e693368-3caa-4bb0-a872-7310b8670ffe",
  "expires_at": "2026-10-30T12:11:51.464448311Z",
  "resend_available_at": "2026-10-30T12:06:52.464448311Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "485503",
  "sent_at": "2026-10-30T12:06:51.467985325Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e693368-3caa-4bb0-a872-7310b8670ffe",
  "code": "485503",
  "device_ref": "sandbox-5113"
}
```

```json
{
  "session_id": "5023c0fd-8c21-4003-9207-90f68d4abc60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkxMSwiaWF0IjoxNzkzMzYyMDExLCJqdGkiOiIxYTc0YjE0Yy02OWYzLTQ0YzEtODNiNy1hYWUzYTRkMGY3MzUiLCJzaWQiOiI1MDIzYzBmZC04YzIxLTQwMDMtOTIwNy05MGY2OGQ0YWJjNjAifQ.49XhjpsNuae8L0Z3RmS9CV_jB4hiBltMxlIxHrFwYso",
  "access_expires_at": "2026-10-30T12:21:51.668596854Z",
  "refresh_token": "Ujzxu3NZ0QLRdJMaHSQjNyM2b9MOI_MinZmv1c7CPHo",
  "refresh_expires_at": "2026-11-29T12:06:51.667927745Z",
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
  "device_ref": "sandbox-22619"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "bb1918cd-7a6d-4ae4-acd1-5d13b5a00667",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-22619"
}
```

```json
{
  "challenge_id": "34317962-74a5-46f4-b1bf-09eee7fc6e28",
  "expires_at": "2026-10-30T12:11:53.204725303Z",
  "resend_available_at": "2026-10-30T12:06:54.204725303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "069723",
  "sent_at": "2026-10-30T12:06:53.208219758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34317962-74a5-46f4-b1bf-09eee7fc6e28",
  "code": "069723",
  "device_ref": "sandbox-22619"
}
```

```json
{
  "session_id": "be97affd-f549-4f10-9b9f-fa2449d8bc72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkxMywiaWF0IjoxNzkzMzYyMDEzLCJqdGkiOiJhODgxNzg1Yi1kMWI5LTRjMTctYWU1ZS00N2ExYjE4YzQ5NjAiLCJzaWQiOiJiZTk3YWZmZC1mNTQ5LTRmMTAtOWI5Zi1mYTI0NDlkOGJjNzIifQ.YaL0R2yUFtkM8tnOk8_hbVBeMsxHz9RathubqDFTjcU",
  "access_expires_at": "2026-10-30T12:21:53.412296551Z",
  "refresh_token": "VSFDL5xMOgVTlxb6FaimByZkDLSVlGMvUldrNIPUHiI",
  "refresh_expires_at": "2026-11-29T12:06:53.411697909Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-19669"
}
```

```json
{
  "challenge_id": "07b547e1-6715-4557-b6a7-3bcb4b70453c",
  "expires_at": "2026-10-30T12:11:53.585846153Z",
  "resend_available_at": "2026-10-30T12:06:54.585846153Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "583074",
  "sent_at": "2026-10-30T12:06:53.588775417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07b547e1-6715-4557-b6a7-3bcb4b70453c",
  "code": "583074",
  "device_ref": "sandbox-19669"
}
```

```json
{
  "session_id": "7d99f2d5-84c2-4f29-8656-05f1e0623d15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkxMywiaWF0IjoxNzkzMzYyMDEzLCJqdGkiOiI3NDg2MDFlZS1lM2VhLTRhY2EtOTkxYy01OWFiOGE0ZjQxZjgiLCJzaWQiOiI3ZDk5ZjJkNS04NGMyLTRmMjktODY1Ni0wNWYxZTA2MjNkMTUifQ.-pkaHzIhi3j3oMYp61q9SBCyxcrQQa98kK5NLmwfWek",
  "access_expires_at": "2026-10-30T12:21:53.789863886Z",
  "refresh_token": "qMRczyqnx0i4bZHCIb3YMbPIdp6BLf7BBqxvsuTYBcs",
  "refresh_expires_at": "2026-11-29T12:06:53.789449974Z",
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
  "command_id": "3da8f0a0-1e86-4e83-8ea1-f0e5d5ff48a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:06:54Z",
    "sequence": 1793362014326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "22135ce9-9895-4353-bf1d-182c849ccb49",
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
  "last_heartbeat_at": "2026-10-30T12:06:54.3438Z",
  "last_location_at": "2026-10-30T12:06:54.3438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600881916",
  "device_ref": "sandbox-13171"
}
```

```json
{
  "challenge_id": "2c386fbf-b591-410c-8eda-3d3c30291ecf",
  "expires_at": "2026-10-30T12:11:54.532056614Z",
  "resend_available_at": "2026-10-30T12:06:55.532056614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600881916` → **200**

```json
{
  "phone": "+48600881916",
  "audience": "CLIENT",
  "code": "156111",
  "sent_at": "2026-10-30T12:06:54.534571904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c386fbf-b591-410c-8eda-3d3c30291ecf",
  "code": "156111",
  "device_ref": "sandbox-13171"
}
```

```json
{
  "session_id": "5376b7a3-c387-4e04-a352-31092cd159fc",
  "subject": {
    "type": "CLIENT",
    "id": "e0971f98-89b8-4da2-8706-37325f405420"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDk3MWY5OC04OWI4LTRkYTItODcwNi0zNzMyNWY0MDU0MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTE0LCJpYXQiOjE3OTMzNjIwMTQsImp0aSI6ImNjMzY5MjVmLTNiY2ItNDJlMi1iYjMzLWQ5ZmIyZGM5ZmYxYyIsInNpZCI6IjUzNzZiN2EzLWMzODctNGUwNC1hMzUyLTMxMDkyY2QxNTlmYyJ9.-4ev52XqLSQrE1VZTgstxzoQYJtP2qIDbKtytRVKujo",
  "access_expires_at": "2026-10-30T12:21:54.738193447Z",
  "refresh_token": "0bbL2pxRmh_UqI0SoqGA285LvzrydtBjpXOpzok_-Ng",
  "refresh_expires_at": "2026-11-29T12:06:54.737643713Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b97394e-5737-494b-995a-9bd3ec5365aa",
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
  "id": "ba3d6a37-6039-4df5-b008-4f76e5acce3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:11:54.925335Z",
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
  "command_id": "d8b862d7-5c5b-41f3-a4ae-39c94b1aa443",
  "quote_id": "ba3d6a37-6039-4df5-b008-4f76e5acce3d",
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
  "id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0971f98-89b8-4da2-8706-37325f405420",
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
  "created_at": "2026-10-30T12:06:55.139469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc` → **200**

```json
{
  "id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0971f98-89b8-4da2-8706-37325f405420",
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
  "created_at": "2026-10-30T12:06:55.139469Z",
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

`POST /api/driver/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc/claim` → **422**

```json
{
  "command_id": "c2ff7ee4-ded5-4a2f-ab30-07ea5b93480d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "d805af00-483c-4e35-a264-c8c4ac0deebb"
}
```

`GET /api/rider/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc` → **200**

```json
{
  "id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0971f98-89b8-4da2-8706-37325f405420",
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
  "created_at": "2026-10-30T12:06:55.139469Z",
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

`POST /api/driver/v1/orders/b72f8d57-5852-4df2-bc40-dfaaa2677bb9/claim` → **404**

```json
{
  "command_id": "e4358b93-10c2-44a8-b7ca-282a824b539c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b72f8d57-5852-4df2-bc40-dfaaa2677bb9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "147c643a-91dd-4f93-be1c-bbb0d4c94f76"
}
```

`POST /api/driver/v1/orders/a8d80fee-1e5f-4331-b1f4-0484ff597b78/claim` → **404**

```json
{
  "command_id": "e93bc023-519f-4244-9a42-cb315f3e601c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a8d80fee-1e5f-4331-b1f4-0484ff597b78/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b149fc65-3707-469c-9329-652da1421487"
}
```

`POST /api/driver/v1/orders/cde51bb0-ddf2-4c32-8c27-6260af4e3608/claim` → **404**

```json
{
  "command_id": "bd96a221-d178-48e3-ad5e-7981dc4ae324"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cde51bb0-ddf2-4c32-8c27-6260af4e3608/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bb3fa0b0-ff21-4d1c-acbd-29cf91431ba0"
}
```

`POST /api/driver/v1/orders/6ff26625-bf39-4862-ae81-ed816e1fc1d6/claim` → **404**

```json
{
  "command_id": "77f1ea40-b24f-4aee-a8df-87779cce3b04"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6ff26625-bf39-4862-ae81-ed816e1fc1d6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "74df51fc-b2df-45ff-804c-b098e27cc1d1"
}
```

`POST /api/driver/v1/orders/e8c4b7e5-97c3-41c2-a177-dcf50e699c34/claim` → **404**

```json
{
  "command_id": "a8e50fb6-6df1-4243-9695-e22925e41c97"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8c4b7e5-97c3-41c2-a177-dcf50e699c34/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "359616cb-ca68-4364-92fb-f72c2b132d15"
}
```

`POST /api/driver/v1/orders/78551ce6-e446-4501-9467-e89ba6a0f2a5/claim` → **404**

```json
{
  "command_id": "6e0d0ab7-6830-4998-912a-12bcf1664e3e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/78551ce6-e446-4501-9467-e89ba6a0f2a5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3dba9a42-7fc8-4877-99a1-f9ee3704fcb7"
}
```

`POST /api/driver/v1/orders/df293b51-7310-41ae-bfba-b92b3fd28321/claim` → **404**

```json
{
  "command_id": "dcdab2b3-955a-40c5-a934-c9eb979be249"
}
```

```json
{
  "instance": "/api/driver/v1/orders/df293b51-7310-41ae-bfba-b92b3fd28321/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3a9e9d43-bdbd-473b-8a84-fca6fe30e588"
}
```

`POST /api/driver/v1/orders/6f3ac102-5718-4f4e-b393-644f3ff35e29/claim` → **404**

```json
{
  "command_id": "eb794912-f384-4d5b-b5fd-2137a9dd8b1c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6f3ac102-5718-4f4e-b393-644f3ff35e29/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4e22c379-d56c-4afa-a734-5fabf4f06574"
}
```

`POST /api/driver/v1/orders/8cc2586c-9bee-45cd-b1ad-1ecaf7a19dd2/claim` → **404**

```json
{
  "command_id": "c79f4dad-33f3-481d-b7ed-633ec57f0632"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8cc2586c-9bee-45cd-b1ad-1ecaf7a19dd2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "819e5e10-bb8e-4c6d-9d23-7e9f0a0f5f75"
}
```

`POST /api/driver/v1/orders/bfb273c1-7518-438a-b706-2d7056072c77/claim` → **404**

```json
{
  "command_id": "3c7b887c-9f2f-4bc1-b205-c0ce4f595878"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bfb273c1-7518-438a-b706-2d7056072c77/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e4297434-24ac-4916-93d4-54c3ddd5e5b1"
}
```

`POST /api/driver/v1/orders/b9e7d7e6-ea5d-407b-a6fd-f0d1ce19c2ff/claim` → **404**

```json
{
  "command_id": "00547078-4b30-4d9d-bfff-72650a32fc19"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b9e7d7e6-ea5d-407b-a6fd-f0d1ce19c2ff/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0fab5c96-04ba-47eb-8144-f700547d7321"
}
```

`POST /api/driver/v1/orders/f69df1b8-68c4-4c12-87b7-666ccf496a46/claim` → **404**

```json
{
  "command_id": "541674a7-fc4a-46d9-bf02-14c03c14cfa6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f69df1b8-68c4-4c12-87b7-666ccf496a46/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "94fa1b70-7000-4f88-a466-f27eb3338957"
}
```

`POST /api/driver/v1/orders/86e4cfe5-c25f-4266-833e-bf2a95bb4f50/claim` → **404**

```json
{
  "command_id": "36e989e1-9753-4cf0-9928-2f09f5734f5c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/86e4cfe5-c25f-4266-833e-bf2a95bb4f50/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ad13ff1f-d19f-410d-a9aa-bc66079acfcf"
}
```

`POST /api/driver/v1/orders/9b6bb7bf-8cb0-45c2-9af8-7ea18486e83f/claim` → **404**

```json
{
  "command_id": "1b262c31-6958-47c6-af25-8bfe29c23619"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9b6bb7bf-8cb0-45c2-9af8-7ea18486e83f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dca17cf0-8a81-467f-ad5c-cdfc4ed0d4f8"
}
```

`POST /api/driver/v1/orders/15e96040-de03-4548-bec9-a59693d9d2f2/claim` → **404**

```json
{
  "command_id": "2d540689-3c5a-4fb6-ab39-e64f05566df4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/15e96040-de03-4548-bec9-a59693d9d2f2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8320e997-a4c7-4cda-b366-df22e6e72451"
}
```

`POST /api/driver/v1/orders/303f4e13-418d-4438-a642-77fc76cd9f85/claim` → **404**

```json
{
  "command_id": "2506441c-1808-416a-b570-fa8460e9924f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/303f4e13-418d-4438-a642-77fc76cd9f85/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "12805c9d-2ad3-4487-9c5d-db93d041d209"
}
```

`POST /api/driver/v1/orders/12214d04-dbbd-4556-b21f-7d78fd0f7050/claim` → **404**

```json
{
  "command_id": "926f7bac-2046-489e-ab6f-b9cf3a1bdcde"
}
```

```json
{
  "instance": "/api/driver/v1/orders/12214d04-dbbd-4556-b21f-7d78fd0f7050/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c9656579-8c6b-46d2-a38b-d1e7a6a50053"
}
```

`POST /api/driver/v1/orders/9ceb86b0-6656-4278-b913-f93ade659287/claim` → **404**

```json
{
  "command_id": "39ca5f2e-27b6-4209-8249-45741977cf43"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9ceb86b0-6656-4278-b913-f93ade659287/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a69b9fb7-86ed-494b-9021-f510875d1d2b"
}
```

`POST /api/driver/v1/orders/70845c8d-88f8-4a3d-8b46-49949b3c819e/claim` → **404**

```json
{
  "command_id": "90112e20-2fd1-4071-bb00-7779f7d91a41"
}
```

```json
{
  "instance": "/api/driver/v1/orders/70845c8d-88f8-4a3d-8b46-49949b3c819e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1d13432e-f91e-472e-be39-ddeeda1888e4"
}
```

`POST /api/driver/v1/orders/99a08105-fed2-4172-9e79-d1591a5590c3/claim` → **404**

```json
{
  "command_id": "5bf7f163-010b-4193-a499-fe918ca6e549"
}
```

```json
{
  "instance": "/api/driver/v1/orders/99a08105-fed2-4172-9e79-d1591a5590c3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cfdad3de-ead5-4ecb-b8f5-d335181df376"
}
```

`POST /api/driver/v1/orders/46df04f7-5d78-40cb-9f87-89837944e521/claim` → **404**

```json
{
  "command_id": "ffd29c21-a3bf-4d99-8120-7684e77334a8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/46df04f7-5d78-40cb-9f87-89837944e521/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ea76ba3d-e5cc-4b2e-a862-0516cf2d34ae"
}
```

`POST /api/driver/v1/orders/d69c6566-0876-4fef-aa5a-049e54665844/claim` → **404**

```json
{
  "command_id": "f1e66bb1-8e0d-4652-9021-a5bde1def42b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d69c6566-0876-4fef-aa5a-049e54665844/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "33781967-7200-4176-b7d2-b13bb9a1c056"
}
```

`POST /api/driver/v1/orders/6c4960d2-687d-4955-a307-499324c1068e/claim` → **404**

```json
{
  "command_id": "564187b1-ff6c-471b-9198-210399bef2e7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6c4960d2-687d-4955-a307-499324c1068e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "55142494-5891-49e4-bc88-771b997dc5f0"
}
```

`POST /api/driver/v1/orders/c1d91a53-7b38-48bc-b284-38ed136eb7d7/claim` → **404**

```json
{
  "command_id": "5a1f7364-9e4c-4913-8c5f-977c5f80a216"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c1d91a53-7b38-48bc-b284-38ed136eb7d7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0c23c101-1c5e-4ae2-95a9-a3c303d39885"
}
```

`POST /api/driver/v1/orders/09fd62f0-bdea-4140-a508-c8c36bb0a740/claim` → **404**

```json
{
  "command_id": "8ae00320-c6fa-44c9-8ddf-54bfed58f759"
}
```

```json
{
  "instance": "/api/driver/v1/orders/09fd62f0-bdea-4140-a508-c8c36bb0a740/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c36447ff-7d06-4a54-844d-db018949c391"
}
```

`POST /api/driver/v1/orders/d2b5cdf0-7bc4-4e06-a789-b62b2075e12b/claim` → **404**

```json
{
  "command_id": "78038220-14a4-4a15-80b6-3b27a5798f84"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d2b5cdf0-7bc4-4e06-a789-b62b2075e12b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b3916a3a-83bd-4d7a-816f-0a094d365250"
}
```

`POST /api/driver/v1/orders/75a281cc-08d7-407d-b0cd-e5a79a29b59a/claim` → **404**

```json
{
  "command_id": "e27da363-6790-439e-b435-473faccab402"
}
```

```json
{
  "instance": "/api/driver/v1/orders/75a281cc-08d7-407d-b0cd-e5a79a29b59a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "55fdf3b6-38c8-4634-aba8-c98d062e380e"
}
```

`POST /api/driver/v1/orders/9335c998-45b8-4560-9337-a06511aa2d98/claim` → **404**

```json
{
  "command_id": "285234df-22fe-42bf-ace6-ad06fca3d6e8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9335c998-45b8-4560-9337-a06511aa2d98/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2b76296c-de3f-4991-9230-beaeadd63eac"
}
```

`POST /api/driver/v1/orders/a81a3c97-7079-4428-a91d-24fc156a1e61/claim` → **404**

```json
{
  "command_id": "60abc7cd-a7c8-4b26-ab37-0925e258b09a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a81a3c97-7079-4428-a91d-24fc156a1e61/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cc3923e1-88de-48b7-98b6-bdd9d7d367dd"
}
```

`POST /api/driver/v1/orders/a812e052-e94f-4f88-bc3d-3ba664001f76/claim` → **429**

```json
{
  "command_id": "11051a18-9591-4d34-b6a7-057b4117da17"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a812e052-e94f-4f88-bc3d-3ba664001f76/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "8a781703-1d9e-4d18-81ff-bec67343cf99",
  "retryable": true,
  "retry_after_seconds": 594
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
  "command_id": "0f27f2ac-02f3-4be6-b256-d83f46e17de4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:02Z",
    "sequence": 1793362022145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3d60c4b6-5a96-469e-be9a-a20e02e7670a",
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
  "last_heartbeat_at": "2026-10-30T12:07:02.16135Z",
  "last_location_at": "2026-10-30T12:07:02.16135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
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

`POST /api/driver/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc/claim` → **409**

```json
{
  "command_id": "a55a8812-6922-40a1-82b9-b375865a5712"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0eb3abcc-2033-4438-ba05-f70f48de4777"
}
```

`POST /api/driver/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc/claim` → **200**

```json
{
  "command_id": "58ea0e8d-f55b-413d-b48b-5dd87b511aae"
}
```

```json
{
  "id": "3f5fde0c-e131-416a-b27b-18c6dab7a019",
  "order_id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "6074d448-f91d-4e9e-abd6-dcdd8740d8f4",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6074d448-f91d-4e9e-abd6-dcdd8740d8f4",
  "order_id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "assignment_id": "3f5fde0c-e131-416a-b27b-18c6dab7a019",
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

`POST /api/driver/v1/trips/6074d448-f91d-4e9e-abd6-dcdd8740d8f4/cancel` → **200**

```json
{
  "command_id": "8f20358b-b90e-464a-b5aa-47c04d5ccb94",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "6074d448-f91d-4e9e-abd6-dcdd8740d8f4",
  "order_id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "assignment_id": "3f5fde0c-e131-416a-b27b-18c6dab7a019",
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

`GET /api/rider/v1/orders/f6c08d9c-9825-4603-a499-308cdcea59fc` → **200**

```json
{
  "id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e0971f98-89b8-4da2-8706-37325f405420",
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
    "id": "3f5fde0c-e131-416a-b27b-18c6dab7a019",
    "order_id": "f6c08d9c-9825-4603-a499-308cdcea59fc",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "6074d448-f91d-4e9e-abd6-dcdd8740d8f4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:06:55.139469Z",
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
  "session_id": "22135ce9-9895-4353-bf1d-182c849ccb49",
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
  "last_heartbeat_at": "2026-10-30T12:06:54.3438Z",
  "last_location_at": "2026-10-30T12:06:54.3438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/22135ce9-9895-4353-bf1d-182c849ccb49/close` → **200**

```json
{
  "command_id": "ffe920f0-d850-4b80-aac8-95fc044d3443",
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
  "session_id": "3d60c4b6-5a96-469e-be9a-a20e02e7670a",
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
  "last_heartbeat_at": "2026-10-30T12:07:02.16135Z",
  "last_location_at": "2026-10-30T12:07:02.16135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d60c4b6-5a96-469e-be9a-a20e02e7670a/close` → **200**

```json
{
  "command_id": "e2bf0934-65e2-42fe-9698-816ff4d60f8b",
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
  "session_id": "4ac9dcb5-e502-4a0d-a224-7adfd2c0014d",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5MjQsImlhdCI6MTc5MzM2MjAyNCwianRpIjoiNTUwMTJjNjgtY2QwYi00YTMzLThmMzEtMjRlMmI1YWFkMDQ0Iiwic2lkIjoiNGFjOWRjYjUtZTUwMi00YTBkLWEyMjQtN2FkZmQyYzAwMTRkIn0.7H_ooqk-jQ8d3WPSAqhs3A9xTAn4Et2DiVSNfCs-SDM",
  "access_expires_at": "2026-10-30T12:22:04.421659662Z",
  "refresh_token": "TWl0mEKNK4F4tgpz5Ln08F1kQ9hnlxFAB9E96B8V92s",
  "refresh_expires_at": "2026-10-31T00:07:04.421277173Z",
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
  "command_id": "c68b8064-8ccf-4200-b75e-1240cdf4c63a",
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
  "session_id": "21ad1702-515b-47db-99e7-d35ac07f761b",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5MjUsImlhdCI6MTc5MzM2MjAyNSwianRpIjoiN2RjMGVjOGYtYzdiOC00NGM4LWEwNzQtZGYyNzFmY2E5YmZjIiwic2lkIjoiMjFhZDE3MDItNTE1Yi00N2RiLTk5ZTctZDM1YWMwN2Y3NjFiIn0.yXDnvAY4rvyLj29UNLnmVX5tVGF-SocccjHuQHhZYig",
  "access_expires_at": "2026-10-30T12:22:05.188044682Z",
  "refresh_token": "LZre43HK1in6ySUpK54MPFdCh9Czg40IjyAJRnoZctQ",
  "refresh_expires_at": "2026-10-31T00:07:05.187486789Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.565623835",
    "linkedid": "1730052700.565623835",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674538340"
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
    "id": "1730052700.565623835",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "60bb9600-315a-40e8-b161-5a8229d0ef0f",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.374874Z",
      "answered_at": null,
      "ended_at": "2026-10-30T12:07:05.396311Z",
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
    "id": "1730052600.1431524643",
    "linkedid": "1730052600.1431524643",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674538340"
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
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7598b049-3ecd-41d4-af70-2c0145ecbf18/answer` → **200**

```json
{
  "command_id": "23a1f90b-e0f4-4159-a6e5-29c08f41381f"
}
```

```json
{
  "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674538340",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "order_ids": [],
  "started_at": "2026-10-30T12:07:05.619612Z",
  "answered_at": "2026-10-30T12:07:05.843664Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1431524643",
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
    "id": "1730052600.1431524643",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": "2026-10-30T12:07:05.843664Z",
      "ended_at": "2026-10-30T12:07:06.057342Z",
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
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": "2026-10-30T12:07:05.843664Z",
      "ended_at": "2026-10-30T12:07:06.057342Z",
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
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": "2026-10-30T12:07:05.843664Z",
      "ended_at": "2026-10-30T12:07:06.057342Z",
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
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": "2026-10-30T12:07:05.843664Z",
      "ended_at": "2026-10-30T12:07:06.057342Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:07:10.665742Z"
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
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": "2026-10-30T12:07:05.843664Z",
      "ended_at": "2026-10-30T12:07:06.057342Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:07:10.665742Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7598b049-3ecd-41d4-af70-2c0145ecbf18/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7598b049-3ecd-41d4-af70-2c0145ecbf18/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7598b049-3ecd-41d4-af70-2c0145ecbf18` → **200**

```json
{
  "changes": [
    {
      "id": "8fb40d17-ae04-4670-ad57-e9f5cff194bc",
      "occurred_at": "2026-10-30T12:07:13.059312Z",
      "actor_type": "STAFF",
      "actor_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"cfe4b478-33cb-4db4-a511-3b1631846840\", \"order_ids\": []}",
      "correlation_id": "f4295b98-c5c6-4827-b91d-b50f4188b311"
    },
    {
      "id": "aa301d78-6123-42bd-b691-772233c6e440",
      "occurred_at": "2026-10-30T12:07:13.032974Z",
      "actor_type": "STAFF",
      "actor_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"cfe4b478-33cb-4db4-a511-3b1631846840\", \"order_ids\": []}",
      "correlation_id": "5d4c473b-feda-4b84-8950-6836dd05caa5"
    }
  ]
}
```

Done: call 7598b049-3ecd-41d4-af70-2c0145ecbf18 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11862"
}
```

```json
{
  "challenge_id": "bb3782a9-3fae-4762-8057-5fefbafda75d",
  "expires_at": "2026-10-30T12:12:13.279997791Z",
  "resend_available_at": "2026-10-30T12:07:14.279997791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "027312",
  "sent_at": "2026-10-30T12:07:13.282673113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb3782a9-3fae-4762-8057-5fefbafda75d",
  "code": "027312",
  "device_ref": "sandbox-11862"
}
```

```json
{
  "session_id": "287ad53a-f0d0-4fe5-996f-acfeff859afc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MjkzMywiaWF0IjoxNzkzMzYyMDMzLCJqdGkiOiI2ZDlmNTZhZS0xZDRiLTRiZWEtYTYwNi05OTJiZWZhNWRkZDIiLCJzaWQiOiIyODdhZDUzYS1mMGQwLTRmZTUtOTk2Zi1hY2ZlZmY4NTlhZmMifQ.qKUHiQY82SUUJmAqY7i526jrzTJwSr0IH22gR6p4Rds",
  "access_expires_at": "2026-10-30T12:22:13.504763883Z",
  "refresh_token": "ZGsVrLxpJxH9mGdqowTd8ZEg3xoJwkfjyeI2ojAMH8M",
  "refresh_expires_at": "2026-11-29T12:07:13.504231267Z",
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
  "command_id": "108da35e-5546-4335-9965-6b39840b8747",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:13Z",
    "sequence": 1793362033882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87d0cae2-0638-4339-b891-fe97d8327e80",
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
  "last_heartbeat_at": "2026-10-30T12:07:13.901055Z",
  "last_location_at": "2026-10-30T12:07:13.901055Z",
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
  "session_id": "a8d32cf6-056d-4e77-82d8-6c7955621eb2",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5MzQsImlhdCI6MTc5MzM2MjAzNCwianRpIjoiMTk3Nzk1ZDQtMTEzYi00NTkzLWI2NWEtOTQ2YjdjMTJkNWQ2Iiwic2lkIjoiYThkMzJjZjYtMDU2ZC00ZTc3LTgyZDgtNmM3OTU1NjIxZWIyIn0.btvUm5oRdt4miKnWoLx7ejMjrRKuIyrVeL0AkcOKnK0",
  "access_expires_at": "2026-10-30T12:22:14.308997593Z",
  "refresh_token": "43H5xZKaLGNXEA6x4NRhZ85ucyLOAC1yCg_gUpt66Bw",
  "refresh_expires_at": "2026-10-31T00:07:14.308557938Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e84beb5c-db94-449f-9d71-58be56f9969e",
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
  "id": "fd67e490-e76e-4d0e-b97d-91d6f3d1ff16",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:14.508763Z",
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
  "command_id": "facc6ebc-bdb3-4723-bc12-27825d29ea39",
  "quote_id": "fd67e490-e76e-4d0e-b97d-91d6f3d1ff16",
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
    "phone": "+380672616996"
  }
}
```

```json
{
  "id": "3a303f46-dea3-4abc-9226-587b5078df91",
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
  "created_at": "2026-10-30T12:07:14.746592Z",
  "caller": {
    "name": "Олена",
    "phone": "+380672616996"
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
    "id": "ec89c811-6943-4b49-a77c-78dd0c193a25",
    "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
    "expires_at": "2026-10-30T12:07:29.751102Z",
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

`POST /api/driver/v1/offers/ec89c811-6943-4b49-a77c-78dd0c193a25/accept` → **200**

```json
{
  "command_id": "f7d9bace-74fd-4ef1-a78e-229d47279a88"
}
```

```json
{
  "id": "e4b0e72d-2bd3-4cb8-9f49-7b56519de756",
  "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9ad172c1-6244-4279-8c46-889cbd382095",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ad172c1-6244-4279-8c46-889cbd382095",
  "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
  "assignment_id": "e4b0e72d-2bd3-4cb8-9f49-7b56519de756",
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
    "phone": "+380672616996"
  }
}
```

`POST /api/driver/v1/work-sessions/87d0cae2-0638-4339-b891-fe97d8327e80/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:17Z",
    "sequence": 1793362037684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87d0cae2-0638-4339-b891-fe97d8327e80",
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
  "last_heartbeat_at": "2026-10-30T12:07:17.701353Z",
  "last_location_at": "2026-10-30T12:07:17.701353Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9ad172c1-6244-4279-8c46-889cbd382095/arrive` → **200**

```json
{
  "command_id": "a01d65e1-bab4-409a-b755-156faaeb631f",
  "expected_version": 0
}
```

```json
{
  "id": "9ad172c1-6244-4279-8c46-889cbd382095",
  "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
  "assignment_id": "e4b0e72d-2bd3-4cb8-9f49-7b56519de756",
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
  "arrived_at": "2026-10-30T12:07:17.899414Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672616996"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  },
  {
    "phone": "+380672616996",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:18.872198902Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  },
  {
    "phone": "+380672616996",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:18.872198902Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672616996` → **200**

```json
[
  {
    "phone": "+380672616996",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:16.864627864Z"
  },
  {
    "phone": "+380672616996",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T12:07:18.872198902Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/9ad172c1-6244-4279-8c46-889cbd382095/start` → **200**

```json
{
  "command_id": "20b4752a-1096-4541-89bd-7d410c1accb3",
  "expected_version": 1
}
```

```json
{
  "id": "9ad172c1-6244-4279-8c46-889cbd382095",
  "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
  "assignment_id": "e4b0e72d-2bd3-4cb8-9f49-7b56519de756",
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
  "arrived_at": "2026-10-30T12:07:17.899414Z",
  "started_at": "2026-10-30T12:07:19.193856Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672616996"
  }
}
```

`POST /api/driver/v1/trips/9ad172c1-6244-4279-8c46-889cbd382095/complete` → **200**

```json
{
  "command_id": "352da061-f415-4b37-bf0c-eec221f8a54e",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:07:19Z",
  "cash_received": true
}
```

```json
{
  "id": "9ad172c1-6244-4279-8c46-889cbd382095",
  "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
  "assignment_id": "e4b0e72d-2bd3-4cb8-9f49-7b56519de756",
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
  "arrived_at": "2026-10-30T12:07:17.899414Z",
  "started_at": "2026-10-30T12:07:19.193856Z",
  "completed_at": "2026-10-30T12:07:19.402229Z",
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
  "session_id": "87d0cae2-0638-4339-b891-fe97d8327e80",
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
  "last_heartbeat_at": "2026-10-30T12:07:17.701353Z",
  "last_location_at": "2026-10-30T12:07:17.701353Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/87d0cae2-0638-4339-b891-fe97d8327e80/close` → **200**

```json
{
  "command_id": "ddec0b05-b7a8-4e28-b081-184b2bd8b915",
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
  "phone": "+380631422042",
  "device_ref": "sandbox-12725"
}
```

```json
{
  "challenge_id": "7bc18d2c-dc8c-4e85-9807-b90b5b37c4e5",
  "expires_at": "2026-10-30T12:12:20.010260468Z",
  "resend_available_at": "2026-10-30T12:07:21.010260468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631422042` → **200**

```json
{
  "phone": "+380631422042",
  "audience": "CLIENT",
  "code": "791342",
  "sent_at": "2026-10-30T12:07:20.013289931Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bc18d2c-dc8c-4e85-9807-b90b5b37c4e5",
  "code": "791342",
  "device_ref": "sandbox-12725"
}
```

```json
{
  "session_id": "b52cc867-776f-47cf-8f5c-0f1fca724675",
  "subject": {
    "type": "CLIENT",
    "id": "d26e0e7d-fb35-44bc-9d07-c366a0880839"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjZlMGU3ZC1mYjM1LTQ0YmMtOWQwNy1jMzY2YTA4ODA4MzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTQwLCJpYXQiOjE3OTMzNjIwNDAsImp0aSI6ImYwMzZmZGUxLTAzMTAtNDQ2ZS1iN2JiLTEwZTVlZDE1NmU0YiIsInNpZCI6ImI1MmNjODY3LTc3NmYtNDdjZi04ZjVjLTBmMWZjYTcyNDY3NSJ9._h13u528P1TAO7HzvEeEkIclQ8eJ9jT11J-CCK3IzkQ",
  "access_expires_at": "2026-10-30T12:22:20.240900694Z",
  "refresh_token": "sRPh-m6nlc4DePRkCVm6g1tMXgdAUGvU6cjxSfGi2Mg",
  "refresh_expires_at": "2026-11-29T12:07:20.240509844Z",
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
  "device_ref": "sandbox-15638"
}
```

```json
{
  "challenge_id": "b631602d-32eb-4d90-ad4f-665d7360d3ee",
  "expires_at": "2026-10-30T12:12:20.628534836Z",
  "resend_available_at": "2026-10-30T12:07:21.628534836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "049295",
  "sent_at": "2026-10-30T12:07:20.630982328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b631602d-32eb-4d90-ad4f-665d7360d3ee",
  "code": "049295",
  "device_ref": "sandbox-15638"
}
```

```json
{
  "session_id": "ead2f62f-8f9a-4eec-8204-3c2d9c2bebda",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjk0MCwiaWF0IjoxNzkzMzYyMDQwLCJqdGkiOiI2M2IwZjVjMS0yYThiLTQ2ZGYtOTdiNi1jZWFlZDFjOWFhNTAiLCJzaWQiOiJlYWQyZjYyZi04ZjlhLTRlZWMtODIwNC0zYzJkOWMyYmViZGEifQ.rFhb1E3UfR21UvCq1IH18w3TVeNOm5tYm6Twj94OFJA",
  "access_expires_at": "2026-10-30T12:22:20.877638205Z",
  "refresh_token": "8aNpvc3bQ7FT-KIq8x8GH8Od7GxGuTjjCV2fJFHKQx8",
  "refresh_expires_at": "2026-11-29T12:07:20.877098495Z",
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
  "session_id": "cc3565f2-636b-45c5-94b5-123adaed51c2",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5NDEsImlhdCI6MTc5MzM2MjA0MSwianRpIjoiNjcwMjVkMDMtYmJiNS00ODQ5LTg4YjItZWUzNTE4YWZmOWU2Iiwic2lkIjoiY2MzNTY1ZjItNjM2Yi00NWM1LTk0YjUtMTIzYWRhZWQ1MWMyIn0.Q6Cy4YWnsB1OvS_gNUFOtTnEN2wsr-0KXQCtukkDHzg",
  "access_expires_at": "2026-10-30T12:22:21.459287354Z",
  "refresh_token": "7FUuBQ7vJnhYFHEJqPJJxZ09rSMbOspBuysuBlAXxH4",
  "refresh_expires_at": "2026-10-31T00:07:21.45886994Z",
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
  "session_id": "1c4f31ce-5585-44bc-834e-273a7faaa681",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5NDEsImlhdCI6MTc5MzM2MjA0MSwianRpIjoiYTcwYjhjZjAtMTZiZi00MThmLTk1ZjYtOTMzZDU5ODcxY2YxIiwic2lkIjoiMWM0ZjMxY2UtNTU4NS00NGJjLTgzNGUtMjczYTdmYWFhNjgxIn0.iDt2NG_WtCULJSU8gB9H5GBiS2gy8ZEwz7pftL0kHyg",
  "access_expires_at": "2026-10-30T12:22:21.857529997Z",
  "refresh_token": "nCPkFvF1exAXmBmbqfra9cU8KKJvGJLyQyfXPWV08x8",
  "refresh_expires_at": "2026-10-31T00:07:21.857110163Z",
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
  "command_id": "18ba9af4-4ee7-4bb2-b1f6-1b0fcd73de24",
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
  "id": "c6ab86b8-768f-48dc-abd9-ac9cb9ae6826",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:22.253732Z",
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
  "command_id": "68aebc19-6a40-41d8-8f15-734d221f0dd4",
  "quote_id": "c6ab86b8-768f-48dc-abd9-ac9cb9ae6826",
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
  "id": "97e7de8b-d128-4cb3-9482-1a0e51a17877",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d26e0e7d-fb35-44bc-9d07-c366a0880839",
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
  "created_at": "2026-10-30T12:07:22.462727Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/97e7de8b-d128-4cb3-9482-1a0e51a17877` → **200**

```json
{
  "id": "97e7de8b-d128-4cb3-9482-1a0e51a17877",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d26e0e7d-fb35-44bc-9d07-c366a0880839",
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
  "created_at": "2026-10-30T12:07:22.462727Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/97e7de8b-d128-4cb3-9482-1a0e51a17877/cancel` → **200**

```json
{
  "command_id": "0c67dad4-7ac5-4a21-9b76-1ce41fa601b6",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "97e7de8b-d128-4cb3-9482-1a0e51a17877",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d26e0e7d-fb35-44bc-9d07-c366a0880839",
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
  "created_at": "2026-10-30T12:07:22.462727Z",
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
  "command_id": "ffcbd916-2db7-4373-b2ed-62470a5c9935",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:23Z",
    "sequence": 1793362043272
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "76f1950b-304f-4bfd-94ef-1ae92fc4bd58",
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
  "last_heartbeat_at": "2026-10-30T12:07:23.289966Z",
  "last_location_at": "2026-10-30T12:07:23.289966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7440"
}
```

```json
{
  "challenge_id": "7ddc73d4-bbfe-4764-aef4-7e9ec95642c7",
  "expires_at": "2026-10-30T12:12:23.495078448Z",
  "resend_available_at": "2026-10-30T12:07:24.495078448Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "150215",
  "sent_at": "2026-10-30T12:07:23.497160085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ddc73d4-bbfe-4764-aef4-7e9ec95642c7",
  "code": "150215",
  "device_ref": "sandbox-7440"
}
```

```json
{
  "session_id": "0fd3f6df-84e7-48c0-807a-edbab7df6a39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjk0MywiaWF0IjoxNzkzMzYyMDQzLCJqdGkiOiJiOGRjNTMyMC0zYmJkLTQ1Y2MtYjJmYS1hN2Q4NDdlOTIyMjciLCJzaWQiOiIwZmQzZjZkZi04NGU3LTQ4YzAtODA3YS1lZGJhYjdkZjZhMzkifQ.cOK449B_jJULe-taQz3SMGk51vtCDtPfbvnI0EObAss",
  "access_expires_at": "2026-10-30T12:22:23.730015588Z",
  "refresh_token": "W9Q0W9f1WQoCPROEl7IGtambK3Ctm7medts59Jz-82Q",
  "refresh_expires_at": "2026-11-29T12:07:23.729630015Z",
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
  "command_id": "12cefe4f-8fa8-45c4-95b2-a7c50f55125c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:24Z",
    "sequence": 1793362044100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:24.117829Z",
  "last_location_at": "2026-10-30T12:07:24.117829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1206e12e-0a0c-46c2-ac4c-1168d27daadb",
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
  "id": "5b01acfc-4533-451e-9b09-a3aad7012325",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:24.316704Z",
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
  "command_id": "f86b1bd8-82e7-4755-b82f-7f51ae624ccd",
  "quote_id": "5b01acfc-4533-451e-9b09-a3aad7012325",
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
  "id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d26e0e7d-fb35-44bc-9d07-c366a0880839",
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
  "created_at": "2026-10-30T12:07:24.523175Z",
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
    "id": "c8177f2f-6e52-493c-b033-9c72c64c87c6",
    "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
    "expires_at": "2026-10-30T12:07:39.526382Z",
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

`POST /api/driver/v1/offers/c8177f2f-6e52-493c-b033-9c72c64c87c6/accept` → **200**

```json
{
  "command_id": "ea364bf5-3e18-449a-ba25-e0baed1a47dd"
}
```

```json
{
  "id": "77fd6e0b-5358-4385-aabe-0933c0ded096",
  "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b4b922c-21ca-4ccc-bfde-90286f9e087e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b4b922c-21ca-4ccc-bfde-90286f9e087e",
  "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "assignment_id": "77fd6e0b-5358-4385-aabe-0933c0ded096",
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

`POST /api/driver/v1/trips/3b4b922c-21ca-4ccc-bfde-90286f9e087e/cancel` → **200**

```json
{
  "command_id": "58e2ba2a-2f49-4d19-a469-2af774416496",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "3b4b922c-21ca-4ccc-bfde-90286f9e087e",
  "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "assignment_id": "77fd6e0b-5358-4385-aabe-0933c0ded096",
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

`GET /api/rider/v1/orders/73a85a56-93ee-4f6e-8167-1edafd56e271` → **200**

```json
{
  "id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d26e0e7d-fb35-44bc-9d07-c366a0880839",
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
    "id": "77fd6e0b-5358-4385-aabe-0933c0ded096",
    "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3b4b922c-21ca-4ccc-bfde-90286f9e087e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:07:24.523175Z",
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
    "id": "784dce23-cef4-41ee-920f-121f964ea3ff",
    "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
    "expires_at": "2026-10-30T12:07:40.330519Z",
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

`POST /api/driver/v1/offers/784dce23-cef4-41ee-920f-121f964ea3ff/accept` → **200**

```json
{
  "command_id": "5640cc73-50c5-4e66-b85e-edfeea259b78"
}
```

```json
{
  "id": "2a5dad56-d59d-4cd7-9ed0-17e7831598c1",
  "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "000088a9-1abe-4381-854d-1f67125a5f2f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "000088a9-1abe-4381-854d-1f67125a5f2f",
  "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "assignment_id": "2a5dad56-d59d-4cd7-9ed0-17e7831598c1",
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

`POST /api/driver/v1/trips/000088a9-1abe-4381-854d-1f67125a5f2f/cancel` → **200**

```json
{
  "command_id": "0b2c6dad-eddb-46a7-9007-bd5199973c39",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "000088a9-1abe-4381-854d-1f67125a5f2f",
  "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
  "assignment_id": "2a5dad56-d59d-4cd7-9ed0-17e7831598c1",
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
    "id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:07:24.523175Z",
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
    "id": "97e7de8b-d128-4cb3-9482-1a0e51a17877",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:07:22.462727Z",
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

`GET /api/operator/v1/orders/73a85a56-93ee-4f6e-8167-1edafd56e271/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:07:24.523838Z",
      "actor": {
        "type": "CLIENT",
        "id": "d26e0e7d-fb35-44bc-9d07-c366a0880839",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
        "quote_id": "5b01acfc-4533-451e-9b09-a3aad7012325",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "3988a4be-2d21-4f26-a989-f0df9abaf102"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:07:24.525652Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
        "attempt_id": "ca416247-8160-4665-8448-91bee2f7b877",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3988a4be-2d21-4f26-a989-f0df9abaf102"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:07:24.538067Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c8177f2f-6e52-493c-b033-9c72c64c87c6",
        "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "3988a4be-2d21-4f26-a989-f0df9abaf102"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:07:24.943673Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c8177f2f-6e52-493c-b033-9c72c64c87c6",
        "order_id": "73a85a56-93ee-4f6e-8167-1edafd56e271",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "77fd6e0b-5358-4385-aabe-0933c0ded096"
      },
      "correlation_id": "6051d4b8-35aa-4a7d-b524-cb686ae534d7"
```

Done: orders 97e7de8b-d128-4cb3-9482-1a0e51a17877, 73a85a56-93ee-4f6e-8167-1edafd56e271.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735464260",
  "device_ref": "sandbox-21107"
}
```

```json
{
  "challenge_id": "93e7e510-193b-485b-a1bf-daf4d687a1de",
  "expires_at": "2026-10-30T12:12:26.915604647Z",
  "resend_available_at": "2026-10-30T12:07:27.915604647Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735464260` → **200**

```json
{
  "phone": "+380735464260",
  "audience": "CLIENT",
  "code": "994979",
  "sent_at": "2026-10-30T12:07:26.917866578Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93e7e510-193b-485b-a1bf-daf4d687a1de",
  "code": "994979",
  "device_ref": "sandbox-21107"
}
```

```json
{
  "session_id": "a2d2a189-a49e-4765-95ea-0f8dd74b5f35",
  "subject": {
    "type": "CLIENT",
    "id": "303ca3ad-d259-4769-bd69-e23d618886a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDNjYTNhZC1kMjU5LTQ3NjktYmQ2OS1lMjNkNjE4ODg2YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTQ3LCJpYXQiOjE3OTMzNjIwNDcsImp0aSI6IjJiMzYwYmIzLWJhNDItNDliMi05ZTYzLTYxMGJjZDI5ZDMwNCIsInNpZCI6ImEyZDJhMTg5LWE0OWUtNDc2NS05NWVhLTBmOGRkNzRiNWYzNSJ9.5mti7QI8cI4I34p0rboPNHpKwh-YKczHqqP42kbTqRo",
  "access_expires_at": "2026-10-30T12:22:27.128942169Z",
  "refresh_token": "nd9QuZfDpTQS0eMAyk0Xc2W0Ysn7Xg7q40DoYDYx6p8",
  "refresh_expires_at": "2026-11-29T12:07:27.128626933Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f47ebc31-2661-45fe-9a2b-1b4dafecaed8",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "dc9e9a58-6d78-4314-ade1-3cb506bb9012",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-dc9e9a58-6d78-4314-ade1-3cb506bb9012",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "da3a2db170a5da7fadc05eb5923178f5",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=dc9e9a58-6d78-4314-ade1-3cb506bb9012",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735464260"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=dc9e9a58-6d78-4314-ade1-3cb506bb9012",
  "expires_at": "2026-10-30T12:37:27.328955Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/dc9e9a58-6d78-4314-ade1-3cb506bb9012` → **200**

```json
{
  "id": "dc9e9a58-6d78-4314-ade1-3cb506bb9012",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T12:37:27.328955Z",
  "card": {
    "id": "b3ef30d0-cdb0-4de0-9493-7f458a72144a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4520",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:07:27.532281Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b3ef30d0-cdb0-4de0-9493-7f458a72144a",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4520",
      "card_type": "Visa",
      "created_at": "2026-10-30T12:07:27.532281Z"
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
  "device_ref": "sandbox-9887"
}
```

```json
{
  "challenge_id": "4b5a7eb9-18c1-401c-9f9f-7838751ec599",
  "expires_at": "2026-10-30T12:12:27.992796942Z",
  "resend_available_at": "2026-10-30T12:07:28.992796942Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "124152",
  "sent_at": "2026-10-30T12:07:27.99505034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b5a7eb9-18c1-401c-9f9f-7838751ec599",
  "code": "124152",
  "device_ref": "sandbox-9887"
}
```

```json
{
  "session_id": "4298e537-8766-4548-9bc4-990061d0e193",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjk0OCwiaWF0IjoxNzkzMzYyMDQ4LCJqdGkiOiI0N2IwNzQyYy1kNjA0LTRlOWYtOTY2My04ODk1YmNlZGYwNTQiLCJzaWQiOiI0Mjk4ZTUzNy04NzY2LTQ1NDgtOWJjNC05OTAwNjFkMGUxOTMifQ.TU0QcPKgznFV64hii9B6-wj_i9Csl1eDyeH2xzU3HQQ",
  "access_expires_at": "2026-10-30T12:22:28.204401869Z",
  "refresh_token": "yd1kG_9Weq4RO8l37c-51QqmzFtIDz8wU8fAD50z-HY",
  "refresh_expires_at": "2026-11-29T12:07:28.203976706Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:24.117829Z",
  "last_location_at": "2026-10-30T12:07:24.117829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd5a0c95-7013-4b67-aede-35b213fe8248/handover` → **200**

```json
{
  "command_id": "8e6fb134-ad01-4580-a4dc-f4b5fdd620e6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:24.117829Z",
  "last_location_at": "2026-10-30T12:07:24.117829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd5a0c95-7013-4b67-aede-35b213fe8248/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:28Z",
    "sequence": 1793362048791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:28.807737Z",
  "last_location_at": "2026-10-30T12:07:28.807737Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "74b4e0e1-3a52-4a46-a5f8-2c929a8fc9ab",
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
  "id": "6ceef0f6-1b60-421a-9bd3-d3fbff14340d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:29.028407Z",
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
  "command_id": "effd3205-17e6-47ad-b402-fe3ae026bf76",
  "quote_id": "6ceef0f6-1b60-421a-9bd3-d3fbff14340d",
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
  "id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
  "created_at": "2026-10-30T12:07:29.232799Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229` → **200**

```json
{
  "id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
  "created_at": "2026-10-30T12:07:29.232799Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229` → **200**

```json
{
  "id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
  "created_at": "2026-10-30T12:07:29.232799Z",
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
    "id": "73ca3e77-e38d-4332-adda-fa31745f1a31",
    "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
    "expires_at": "2026-10-30T12:07:45.254051Z",
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

`POST /api/driver/v1/offers/73ca3e77-e38d-4332-adda-fa31745f1a31/accept` → **200**

```json
{
  "command_id": "09b6a12e-b78c-48f9-b9a7-16e1b000ee27"
}
```

```json
{
  "id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "assignment_id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
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

`POST /api/driver/v1/work-sessions/fd5a0c95-7013-4b67-aede-35b213fe8248/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:31Z",
    "sequence": 1793362051462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:31.481462Z",
  "last_location_at": "2026-10-30T12:07:31.481462Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e1d2dc59-ef5f-4688-86ba-9b5437b4f051/arrive` → **200**

```json
{
  "command_id": "e746fea8-1219-469e-8491-77e807bec89c",
  "expected_version": 0
}
```

```json
{
  "id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "assignment_id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
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
  "arrived_at": "2026-10-30T12:07:31.688853Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e1d2dc59-ef5f-4688-86ba-9b5437b4f051/start` → **200**

```json
{
  "command_id": "badab3f4-13fe-47f0-a62a-f60ba0798171",
  "expected_version": 1
}
```

```json
{
  "id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "assignment_id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
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
  "arrived_at": "2026-10-30T12:07:31.688853Z",
  "started_at": "2026-10-30T12:07:31.885157Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e1d2dc59-ef5f-4688-86ba-9b5437b4f051/complete` → **200**

```json
{
  "command_id": "ecac6bcd-70bf-41d9-b0fe-4cfed8dd9a9a",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:07:32Z",
  "cash_received": true
}
```

```json
{
  "id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "assignment_id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
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
  "arrived_at": "2026-10-30T12:07:31.688853Z",
  "started_at": "2026-10-30T12:07:31.885157Z",
  "completed_at": "2026-10-30T12:07:32.084669Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229` → **200**

```json
{
  "id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
    "id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
    "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:07:29.232799Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229` → **200**

```json
{
  "id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
    "id": "66e29ed7-ab1d-494d-bc49-240530bd8448",
    "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e1d2dc59-ef5f-4688-86ba-9b5437b4f051",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:07:29.232799Z",
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

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229/tip` → **200**

```json
{
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
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
  "available_until": "2026-10-31T12:07:32.084669Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229/tip` → **201**

```json
{
  "command_id": "66daed74-85b8-4fc3-8af1-0c8e6d178eac",
  "amount_minor": 2500
}
```

```json
{
  "id": "e88d714e-1874-4785-a214-a19ee2c2a9aa",
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:07:34.106794Z"
}
```

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229/tip` → **200**

```json
{
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
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
  "available_until": "2026-10-31T12:07:32.084669Z",
  "open": false,
  "tip": {
    "id": "e88d714e-1874-4785-a214-a19ee2c2a9aa",
    "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T12:07:34.106794Z"
  }
}
```

`GET /api/rider/v1/orders/e13c4d33-c7fa-4a96-adba-78ed8a525229/tip` → **200**

```json
{
  "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
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
  "available_until": "2026-10-31T12:07:32.084669Z",
  "open": false,
  "tip": {
    "id": "e88d714e-1874-4785-a214-a19ee2c2a9aa",
    "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:07:34.106794Z"
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
      "id": "af988358-15a1-4753-8066-8ab0e3b10761",
      "at": "2026-10-30T12:07:35.349748Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
      "counterpart_id": null
    },
    {
      "id": "6cd56c7c-fa46-42fd-99b5-fac4c2b6ecf9",
      "at": "2026-10-30T12:07:32.298344Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "111d6bfb-89e7-47d9-b27e-6c0f28136ec0",
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
  "id": "e38f77df-47e5-4394-9fa1-7c66811c8733",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:35.901917Z",
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
  "session_id": "b8ffcff0-e135-42d9-b20c-fb32dcff9d64",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5NTYsImlhdCI6MTc5MzM2MjA1NiwianRpIjoiMjYyMDg2ZWItODA1YS00MTc0LWIyOGQtMDQ5NmU4N2RiZGI4Iiwic2lkIjoiYjhmZmNmZjAtZTEzNS00MmQ5LWIyMGMtZmIzMmRjZmY5ZDY0In0.2qOlmVuFcyjl5xNCAwxkWTVNlxUTX1Vhfnw4fGWqJnw",
  "access_expires_at": "2026-10-30T12:22:36.315104439Z",
  "refresh_token": "PHnB-Um3zr-WUTe-My98Dfnp-8FmkieFIVr7dCufFcU",
  "refresh_expires_at": "2026-10-31T00:07:36.31466576Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735464260` → **200**

```json
{
  "client_id": "303ca3ad-d259-4769-bd69-e23d618886a9"
}
```

`POST /api/admin/v1/rider-wallets/303ca3ad-d259-4769-bd69-e23d618886a9/top-ups` → **201**

```json
{
  "command_id": "eae8bdd4-0105-45ee-a86f-994e149b43b5",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
      "id": "caf39383-29ef-469d-96b9-4bb7aad51321",
      "at": "2026-10-30T12:07:36.688538Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "823be2fb-9ea9-41b0-9ddf-d6bfe1d249c9",
  "quote_id": "e38f77df-47e5-4394-9fa1-7c66811c8733",
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
  "id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
  "created_at": "2026-10-30T12:07:36.894357Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aeeba238-1620-4f5b-8db6-bab60755d297` → **200**

```json
{
  "id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
  "created_at": "2026-10-30T12:07:36.894357Z",
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
    "id": "aed607da-d7f2-463e-988e-28da6ac4fec7",
    "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
    "expires_at": "2026-10-30T12:07:51.89815Z",
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

`POST /api/driver/v1/offers/aed607da-d7f2-463e-988e-28da6ac4fec7/accept` → **200**

```json
{
  "command_id": "bcfb4596-e94b-4024-8af6-022e85efddcb"
}
```

```json
{
  "id": "3853e4fb-5e6e-4401-8476-768247f4067e",
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f0c57dd-6b12-45c7-8692-dbc84bea6ebc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f0c57dd-6b12-45c7-8692-dbc84bea6ebc",
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "assignment_id": "3853e4fb-5e6e-4401-8476-768247f4067e",
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

`POST /api/driver/v1/work-sessions/fd5a0c95-7013-4b67-aede-35b213fe8248/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:37Z",
    "sequence": 1793362057868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:37.885241Z",
  "last_location_at": "2026-10-30T12:07:37.885241Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6f0c57dd-6b12-45c7-8692-dbc84bea6ebc/arrive` → **200**

```json
{
  "command_id": "052b0852-a7d6-42fe-b9d6-1cb62eae55ba",
  "expected_version": 0
}
```

```json
{
  "id": "6f0c57dd-6b12-45c7-8692-dbc84bea6ebc",
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "assignment_id": "3853e4fb-5e6e-4401-8476-768247f4067e",
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
  "arrived_at": "2026-10-30T12:07:38.084284Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f0c57dd-6b12-45c7-8692-dbc84bea6ebc/start` → **200**

```json
{
  "command_id": "5bcb9c1e-6412-42ed-9427-8b902d2905d2",
  "expected_version": 1
}
```

```json
{
  "id": "6f0c57dd-6b12-45c7-8692-dbc84bea6ebc",
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "assignment_id": "3853e4fb-5e6e-4401-8476-768247f4067e",
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
  "arrived_at": "2026-10-30T12:07:38.084284Z",
  "started_at": "2026-10-30T12:07:38.328782Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f0c57dd-6b12-45c7-8692-dbc84bea6ebc/complete` → **200**

```json
{
  "command_id": "ffbd6dde-7d6b-4c81-be6a-57b71f0ac09a",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:07:38Z",
  "cash_received": true
}
```

```json
{
  "id": "6f0c57dd-6b12-45c7-8692-dbc84bea6ebc",
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "assignment_id": "3853e4fb-5e6e-4401-8476-768247f4067e",
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
  "arrived_at": "2026-10-30T12:07:38.084284Z",
  "started_at": "2026-10-30T12:07:38.328782Z",
  "completed_at": "2026-10-30T12:07:38.54883Z",
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
  "client_id": "303ca3ad-d259-4769-bd69-e23d618886a9",
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
      "id": "caf39383-29ef-469d-96b9-4bb7aad51321",
      "at": "2026-10-30T12:07:36.688538Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
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

`GET /api/rider/v1/orders/aeeba238-1620-4f5b-8db6-bab60755d297/tip` → **200**

```json
{
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
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
  "available_until": "2026-10-31T12:07:38.54883Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/aeeba238-1620-4f5b-8db6-bab60755d297/tip` → **201**

```json
{
  "command_id": "5a75e28b-8c40-40a3-a13e-67dd3087eb77",
  "amount_minor": 2500
}
```

```json
{
  "id": "76f76f9c-ad6c-42ab-9877-367a99587112",
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T12:07:39.33271Z"
}
```

`GET /api/rider/v1/orders/aeeba238-1620-4f5b-8db6-bab60755d297/tip` → **200**

```json
{
  "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
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
  "available_until": "2026-10-31T12:07:38.54883Z",
  "open": false,
  "tip": {
    "id": "76f76f9c-ad6c-42ab-9877-367a99587112",
    "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T12:07:39.33271Z"
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
      "id": "d4c3a5b3-5379-4389-9cda-206b59784609",
      "at": "2026-10-30T12:07:39.409412Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
      "counterpart_id": null
    },
    {
      "id": "af988358-15a1-4753-8066-8ab0e3b10761",
      "at": "2026-10-30T12:07:35.349748Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
      "counterpart_id": null
    },
    {
      "id": "6cd56c7c-fa46-42fd-99b5-fac4c2b6ecf9",
      "at": "2026-10-30T12:07:32.298344Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
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
      "id": "0b0a4fc0-043d-441a-b515-f1ebf01a1f9b",
      "at": "2026-10-30T12:07:40.426959Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
      "counterpart_id": null
    },
    {
      "id": "d4c3a5b3-5379-4389-9cda-206b59784609",
      "at": "2026-10-30T12:07:39.409412Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aeeba238-1620-4f5b-8db6-bab60755d297",
      "counterpart_id": null
    },
    {
      "id": "af988358-15a1-4753-8066-8ab0e3b10761",
      "at": "2026-10-30T12:07:35.349748Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
      "counterpart_id": null
    },
    {
      "id": "6cd56c7c-fa46-42fd-99b5-fac4c2b6ecf9",
      "at": "2026-10-30T12:07:32.298344Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e13c4d33-c7fa-4a96-adba-78ed8a525229",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fd5a0c95-7013-4b67-aede-35b213fe8248",
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
  "last_heartbeat_at": "2026-10-30T12:07:37.885241Z",
  "last_location_at": "2026-10-30T12:07:37.885241Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd5a0c95-7013-4b67-aede-35b213fe8248/close` → **200**

```json
{
  "command_id": "d11c3573-5ebb-4260-a518-d3fa6aa78688",
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

Done: card order aeeba238-1620-4f5b-8db6-bab60755d297.

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
  "phone": "+380736652711",
  "device_ref": "sandbox-13443"
}
```

```json
{
  "challenge_id": "81cdf311-8274-449b-b0c6-5621b7136016",
  "expires_at": "2026-10-30T12:12:41.685405956Z",
  "resend_available_at": "2026-10-30T12:07:42.685405956Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736652711` → **200**

```json
{
  "phone": "+380736652711",
  "audience": "CLIENT",
  "code": "506079",
  "sent_at": "2026-10-30T12:07:41.687547321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81cdf311-8274-449b-b0c6-5621b7136016",
  "code": "506079",
  "device_ref": "sandbox-13443"
}
```

```json
{
  "session_id": "8375022a-d6a3-494f-a558-f99174e876c2",
  "subject": {
    "type": "CLIENT",
    "id": "b71b5b7e-e661-4d28-aeac-b946430a0f6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzFiNWI3ZS1lNjYxLTRkMjgtYWVhYy1iOTQ2NDMwYTBmNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTYxLCJpYXQiOjE3OTMzNjIwNjEsImp0aSI6IjE4M2I0ZjNjLWZjYjMtNDBjMy05YTcwLTBhNDZjYTNjZjcwZSIsInNpZCI6IjgzNzUwMjJhLWQ2YTMtNDk0Zi1hNTU4LWY5OTE3NGU4NzZjMiJ9.3VhNJfiuocNsSCD8n3wvbJguoA9CKoCKh2iUgf6tYX0",
  "access_expires_at": "2026-10-30T12:22:41.899653003Z",
  "refresh_token": "szc6FwGQi4zqcZEnVge7_TbmXdzNqVJi6xPS5Rz96fI",
  "refresh_expires_at": "2026-11-29T12:07:41.899341974Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "75f0af6d-70c7-48df-893e-2e229a26520e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "20bab8a3-d014-4544-a75b-e833b5bf39c7",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-20bab8a3-d014-4544-a75b-e833b5bf39c7",
    "orderDate": "1793362062",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "a55803b1c4b9b08a1844cbd07809e1f3",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=20bab8a3-d014-4544-a75b-e833b5bf39c7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736652711"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=20bab8a3-d014-4544-a75b-e833b5bf39c7",
  "created_at": "2026-10-30T12:07:42.092587Z",
  "expires_at": "2026-10-30T12:37:42.092587Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/20bab8a3-d014-4544-a75b-e833b5bf39c7` → **200**

```json
{
  "id": "20bab8a3-d014-4544-a75b-e833b5bf39c7",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:07:42.092587Z",
  "expires_at": "2026-10-30T12:37:42.092587Z",
  "completed_at": "2026-10-30T12:07:42.279785Z",
  "masked_pan": "41****0197",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b71b5b7e-e661-4d28-aeac-b946430a0f6b",
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
      "id": "964616b2-e3db-42cf-8dd8-7aae7d25a4b5",
      "at": "2026-10-30T12:07:42.441975Z",
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
  "client_id": "b71b5b7e-e661-4d28-aeac-b946430a0f6b",
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
      "id": "964616b2-e3db-42cf-8dd8-7aae7d25a4b5",
      "at": "2026-10-30T12:07:42.441975Z",
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
  "device_ref": "sandbox-7778"
}
```

```json
{
  "challenge_id": "1c381e64-2dbf-47c7-a74f-b239168e723b",
  "expires_at": "2026-10-30T12:12:42.87168927Z",
  "resend_available_at": "2026-10-30T12:07:43.87168927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "551718",
  "sent_at": "2026-10-30T12:07:42.873907892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c381e64-2dbf-47c7-a74f-b239168e723b",
  "code": "551718",
  "device_ref": "sandbox-7778"
}
```

```json
{
  "session_id": "4d3e6680-93f7-4291-bc94-aad208f26e20",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjk2MywiaWF0IjoxNzkzMzYyMDYzLCJqdGkiOiI1YjgxMjVjOC1lMzJlLTQ4YjYtYTFmYS03M2NkOTFhZDVhMmIiLCJzaWQiOiI0ZDNlNjY4MC05M2Y3LTQyOTEtYmM5NC1hYWQyMDhmMjZlMjAifQ.1CyO9YgL2ILHgCib8AQI15nmRUd36U0dK_HHr45q-jQ",
  "access_expires_at": "2026-10-30T12:22:43.077564375Z",
  "refresh_token": "4XGykSaz2A0tDFVN4rLzXbflvFINrNTQAziIkKo5PpI",
  "refresh_expires_at": "2026-11-29T12:07:43.077187085Z",
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
  "command_id": "5b022b0b-0b01-4ac7-8f97-2ea9b7ff69f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "06154830-3d5d-4fa2-8d82-e595249967d5",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-06154830-3d5d-4fa2-8d82-e595249967d5",
    "orderDate": "1793362063",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "55e6a5c53509b53d5e6b9fa0ec13aa2b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=06154830-3d5d-4fa2-8d82-e595249967d5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=06154830-3d5d-4fa2-8d82-e595249967d5",
  "created_at": "2026-10-30T12:07:43.452651Z",
  "expires_at": "2026-10-30T12:37:43.452651Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/06154830-3d5d-4fa2-8d82-e595249967d5` → **200**

```json
{
  "id": "06154830-3d5d-4fa2-8d82-e595249967d5",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T12:07:43.452651Z",
  "expires_at": "2026-10-30T12:37:43.452651Z",
  "completed_at": "2026-10-30T12:07:43.644693Z",
  "masked_pan": "41****8565",
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
      "id": "496e0f49-0293-4756-aeff-07724887951f",
      "at": "2026-10-30T12:07:44.449328Z",
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
  "command_id": "51f15ba0-7c17-479d-9f47-05eaefd49fbb",
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
  "correlation_id": "1a71cb37-ebee-44af-bd1d-4c14338f0d6d"
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
  "device_ref": "sandbox-3720"
}
```

```json
{
  "challenge_id": "d609371f-4b2c-437d-8d56-00b32c29741f",
  "expires_at": "2026-10-30T12:12:45.456745412Z",
  "resend_available_at": "2026-10-30T12:07:46.456745412Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "390851",
  "sent_at": "2026-10-30T12:07:45.459274652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d609371f-4b2c-437d-8d56-00b32c29741f",
  "code": "390851",
  "device_ref": "sandbox-3720"
}
```

```json
{
  "session_id": "572b13a6-606f-4e5a-812f-0a6f64029da1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjk2NSwiaWF0IjoxNzkzMzYyMDY1LCJqdGkiOiI5YjYzOGM4ZC00YjUzLTRlYjUtOGY2My01MzliOTliNzEwZmIiLCJzaWQiOiI1NzJiMTNhNi02MDZmLTRlNWEtODEyZi0wYTZmNjQwMjlkYTEifQ.Yfa9090khC2DNY3n22a0ZPnOVLgqvy8zchSUseZAx4M",
  "access_expires_at": "2026-10-30T12:22:45.663775471Z",
  "refresh_token": "O1BpmBP31DNfEFhQKuE7L58XlPHvu0YJ2SJfKW_eBR4",
  "refresh_expires_at": "2026-11-29T12:07:45.663331943Z",
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
  "command_id": "515158b2-4088-4d5c-83eb-f8da01326a5b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:46Z",
    "sequence": 1793362066453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ebfcdc79-138a-4e55-acb9-b29a43caba4b",
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
  "last_heartbeat_at": "2026-10-30T12:07:46.060755Z",
  "last_location_at": "2026-10-30T12:07:46.060755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631210645",
  "device_ref": "sandbox-11322"
}
```

```json
{
  "challenge_id": "0561bebc-ae29-403c-9ec8-29de11340eab",
  "expires_at": "2026-10-30T12:12:46.251717933Z",
  "resend_available_at": "2026-10-30T12:07:47.251717933Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631210645` → **200**

```json
{
  "phone": "+380631210645",
  "audience": "CLIENT",
  "code": "874434",
  "sent_at": "2026-10-30T12:07:46.254252911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0561bebc-ae29-403c-9ec8-29de11340eab",
  "code": "874434",
  "device_ref": "sandbox-11322"
}
```

```json
{
  "session_id": "0e6076da-e933-4738-8f59-d7e480d2f3e1",
  "subject": {
    "type": "CLIENT",
    "id": "7b7363ec-6fb4-44a7-b979-ce65d3ef36b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjczNjNlYy02ZmI0LTQ0YTctYjk3OS1jZTY1ZDNlZjM2YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTY2LCJpYXQiOjE3OTMzNjIwNjYsImp0aSI6IjI5ZmU2MDgwLWI1NTUtNDhjZi04OGE5LTA5OWIwNzhmNTZlZCIsInNpZCI6IjBlNjA3NmRhLWU5MzMtNDczOC04ZjU5LWQ3ZTQ4MGQyZjNlMSJ9.3i1VIgARoES9wl1Xee4dU-K1oNQfLyqVysi0AOT-ikg",
  "access_expires_at": "2026-10-30T12:22:46.474850183Z",
  "refresh_token": "lbaUO73gM-VgwDilvUg4p4tbFGEX-qFXiyzXlAJpbOc",
  "refresh_expires_at": "2026-11-29T12:07:46.474496181Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "26a623d4-442a-48ed-9f6d-7d24d1df802c",
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
  "id": "91bf696d-703f-488a-8959-fe5ee71209b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:46.672371Z",
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
  "command_id": "605ab7fe-08f3-4def-bf1e-2b472c994c4d",
  "quote_id": "91bf696d-703f-488a-8959-fe5ee71209b4",
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
  "id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7b7363ec-6fb4-44a7-b979-ce65d3ef36b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:07:46.940124Z",
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
    "id": "46cf2f69-6b76-4af8-86c8-8ca702740f3a",
    "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
    "expires_at": "2026-10-30T12:08:01.942623Z",
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

`POST /api/driver/v1/offers/46cf2f69-6b76-4af8-86c8-8ca702740f3a/accept` → **200**

```json
{
  "command_id": "6983060a-e723-4afb-a754-7499d9559124"
}
```

```json
{
  "id": "6f2f2bf7-7a4a-4aed-871b-72042da3a570",
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49133fd6-9d3a-45d5-afac-2272340e9848",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "49133fd6-9d3a-45d5-afac-2272340e9848",
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "assignment_id": "6f2f2bf7-7a4a-4aed-871b-72042da3a570",
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

`POST /api/driver/v1/work-sessions/ebfcdc79-138a-4e55-acb9-b29a43caba4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:47Z",
    "sequence": 1793362067747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ebfcdc79-138a-4e55-acb9-b29a43caba4b",
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
  "last_heartbeat_at": "2026-10-30T12:07:47.765063Z",
  "last_location_at": "2026-10-30T12:07:47.765063Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/49133fd6-9d3a-45d5-afac-2272340e9848/arrive` → **200**

```json
{
  "command_id": "bb69ec18-c29d-439c-95d4-337b6209d21a",
  "expected_version": 0
}
```

```json
{
  "id": "49133fd6-9d3a-45d5-afac-2272340e9848",
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "assignment_id": "6f2f2bf7-7a4a-4aed-871b-72042da3a570",
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
  "arrived_at": "2026-10-30T12:07:47.979205Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49133fd6-9d3a-45d5-afac-2272340e9848/start` → **200**

```json
{
  "command_id": "ace5d79a-a94b-4ef7-a23a-4ab2b28f2d6c",
  "expected_version": 1
}
```

```json
{
  "id": "49133fd6-9d3a-45d5-afac-2272340e9848",
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "assignment_id": "6f2f2bf7-7a4a-4aed-871b-72042da3a570",
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
  "arrived_at": "2026-10-30T12:07:47.979205Z",
  "started_at": "2026-10-30T12:07:48.18255Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49133fd6-9d3a-45d5-afac-2272340e9848/complete` → **200**

```json
{
  "command_id": "ade4b114-80b2-4055-b3ff-55bbb59101d1",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:07:48Z",
  "cash_received": false
}
```

```json
{
  "id": "49133fd6-9d3a-45d5-afac-2272340e9848",
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "assignment_id": "6f2f2bf7-7a4a-4aed-871b-72042da3a570",
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
  "arrived_at": "2026-10-30T12:07:47.979205Z",
  "started_at": "2026-10-30T12:07:48.18255Z",
  "completed_at": "2026-10-30T12:07:48.39179Z",
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
  "session_id": "f577db5e-42b7-43b9-a362-afa47dbf9100",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5NjgsImlhdCI6MTc5MzM2MjA2OCwianRpIjoiN2JhYzhjYjItYjI4MC00N2Y1LTk5YzgtNzYyNmUwYTBkYmNhIiwic2lkIjoiZjU3N2RiNWUtNDJiNy00M2I5LWEzNjItYWZhNDdkYmY5MTAwIn0.qC3I8JlIvEWdL06aamV0EnzhCOu3t5qxHlxuIizaxW0",
  "access_expires_at": "2026-10-30T12:22:48.811872457Z",
  "refresh_token": "_0_9GutfwemHBOaZzuH3liiwVx6PiNyrnYYEkvYyl6k",
  "refresh_expires_at": "2026-10-31T00:07:48.811444935Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/b7ea6d37-71f8-40f0-8e0c-326f99b2de83/cash-dispute` → **200**

```json
{
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7b7363ec-6fb4-44a7-b979-ce65d3ef36b6",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:07:48.497176Z",
  "decide_by": "2026-11-13T12:07:48.497176Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T12:07:48.497176Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "7b7363ec-6fb4-44a7-b979-ce65d3ef36b6",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T12:07:48.497176Z",
      "decide_by": "2026-11-13T12:07:48.497176Z",
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

`POST /api/admin/v1/orders/b7ea6d37-71f8-40f0-8e0c-326f99b2de83/cash-dispute/decide` → **400**

```json
{
  "command_id": "b0f4ed67-5160-47de-9bb8-75541d704392",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/b7ea6d37-71f8-40f0-8e0c-326f99b2de83/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8c9e2825-0131-4640-a349-ec09dc6463ed",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/b7ea6d37-71f8-40f0-8e0c-326f99b2de83/cash-dispute/decide` → **200**

```json
{
  "command_id": "7484c065-8f27-40ed-82ed-692cd3056312",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7b7363ec-6fb4-44a7-b979-ce65d3ef36b6",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T12:07:48.497176Z",
  "decide_by": "2026-11-13T12:07:48.497176Z",
  "decision": "PAY_DRIVER",
  "decided_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T12:07:49.670394Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/b7ea6d37-71f8-40f0-8e0c-326f99b2de83/cash-dispute/decide` → **409**

```json
{
  "command_id": "db6281e9-2fd1-4918-b773-6485b3691fa8",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/b7ea6d37-71f8-40f0-8e0c-326f99b2de83/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "15ab7945-0f21-42a9-bba5-80d16372cbda"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ebfcdc79-138a-4e55-acb9-b29a43caba4b",
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
  "last_heartbeat_at": "2026-10-30T12:07:47.765063Z",
  "last_location_at": "2026-10-30T12:07:47.765063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ebfcdc79-138a-4e55-acb9-b29a43caba4b/close` → **200**

```json
{
  "command_id": "f4fa514f-e017-45fa-bd01-407f03878e94",
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
  "phone": "+380739002450",
  "device_ref": "sandbox-31122"
}
```

```json
{
  "challenge_id": "6d6ebf17-6f8b-4e5f-9e57-702ba02221a2",
  "expires_at": "2026-10-30T12:12:50.470573343Z",
  "resend_available_at": "2026-10-30T12:07:51.470573343Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739002450` → **200**

```json
{
  "phone": "+380739002450",
  "audience": "CLIENT",
  "code": "952725",
  "sent_at": "2026-10-30T12:07:50.472892991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d6ebf17-6f8b-4e5f-9e57-702ba02221a2",
  "code": "952725",
  "device_ref": "sandbox-31122"
}
```

```json
{
  "session_id": "8e700b5b-d7f1-4fc9-baa6-c81472ade16d",
  "subject": {
    "type": "CLIENT",
    "id": "8e52a174-3ac8-4328-8b91-2087646dc728"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTUyYTE3NC0zYWM4LTQzMjgtOGI5MS0yMDg3NjQ2ZGM3MjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTcwLCJpYXQiOjE3OTMzNjIwNzAsImp0aSI6IjJjNDAxNjBmLWIxY2UtNDFkMC1hMjZjLTcyNzhjYTU3Mjc4YiIsInNpZCI6IjhlNzAwYjViLWQ3ZjEtNGZjOS1iYWE2LWM4MTQ3MmFkZTE2ZCJ9.JoFPfcIMRx4rdt7WzfOFWdaCNxI6nkul-pgnlGfjcPE",
  "access_expires_at": "2026-10-30T12:22:50.697708166Z",
  "refresh_token": "8OPbqCR_jgRkVKzGAPtJg0Qp3KwT2kSv94rSm8g3oeE",
  "refresh_expires_at": "2026-11-29T12:07:50.697331792Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a3f2d6d6-f214-41fd-9791-c2494c88f432",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "39748d53-e78d-4aa4-8423-244c348e3c89",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-39748d53-e78d-4aa4-8423-244c348e3c89",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2c3755916a4609a27d16b3b8fa0c1c1c",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=39748d53-e78d-4aa4-8423-244c348e3c89",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739002450"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=39748d53-e78d-4aa4-8423-244c348e3c89",
  "expires_at": "2026-10-30T12:37:50.904649Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/39748d53-e78d-4aa4-8423-244c348e3c89` → **200**

```json
{
  "id": "39748d53-e78d-4aa4-8423-244c348e3c89",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T12:37:50.904649Z",
  "card": {
    "id": "3064c341-4d04-45a2-b121-ab1667fc9003",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4879",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:07:51.112653Z"
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
  "device_ref": "sandbox-5720"
}
```

```json
{
  "challenge_id": "6d2f24a0-1c6d-40d5-80d4-e4764dec0f26",
  "expires_at": "2026-10-30T12:12:51.328427756Z",
  "resend_available_at": "2026-10-30T12:07:52.328427756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "239758",
  "sent_at": "2026-10-30T12:07:51.330610447Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d2f24a0-1c6d-40d5-80d4-e4764dec0f26",
  "code": "239758",
  "device_ref": "sandbox-5720"
}
```

```json
{
  "session_id": "3d19d03e-88d1-43f0-bf11-344ed9d86e75",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Mjk3MSwiaWF0IjoxNzkzMzYyMDcxLCJqdGkiOiIzZGZhYmRjMi0xZjE4LTQ3NGItYWMxYS04NDUyMjQyM2FkOTIiLCJzaWQiOiIzZDE5ZDAzZS04OGQxLTQzZjAtYmYxMS0zNDRlZDlkODZlNzUifQ.amGM_VvzJihiA2eoCDo_zGOyqXnWaGoe3VUY6vJ7tx4",
  "access_expires_at": "2026-10-30T12:22:51.550551593Z",
  "refresh_token": "56bSGd67z-tF1THc4HokJ1-ROuFi261eEg4POW6p9wU",
  "refresh_expires_at": "2026-11-29T12:07:51.550206031Z",
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
  "command_id": "a72e2964-53e9-4cd6-8b39-5bf8ca4820cb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:51Z",
    "sequence": 1793362071932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "21038e9f-82fb-464e-b583-b7ffb2c57058",
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
  "last_heartbeat_at": "2026-10-30T12:07:51.94972Z",
  "last_location_at": "2026-10-30T12:07:51.94972Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0994d2b7-3f95-4acc-ab71-915a34d22ce4",
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
  "id": "e6ffb68f-d076-44fd-bedd-8b303865e8ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:12:52.166525Z",
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
  "command_id": "cf274e8d-18a1-4714-bdde-450d060de61d",
  "quote_id": "e6ffb68f-d076-44fd-bedd-8b303865e8ca",
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
  "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8e52a174-3ac8-4328-8b91-2087646dc728",
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
  "created_at": "2026-10-30T12:07:52.375789Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62` → **200**

```json
{
  "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8e52a174-3ac8-4328-8b91-2087646dc728",
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
  "created_at": "2026-10-30T12:07:52.375789Z",
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
    "id": "19165cb6-551b-4dd9-ac9c-7401cb586019",
    "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
    "expires_at": "2026-10-30T12:08:07.538697Z",
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

`POST /api/driver/v1/offers/19165cb6-551b-4dd9-ac9c-7401cb586019/accept` → **200**

```json
{
  "command_id": "c958ad5c-3fe8-4d19-a1e6-16ded82688dc"
}
```

```json
{
  "id": "bc3d0092-3541-412c-ab26-737a97fc538d",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "assignment_id": "bc3d0092-3541-412c-ab26-737a97fc538d",
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

`POST /api/rider/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/messages` → **201**

```json
{
  "command_id": "f722aaa6-d89a-430b-9f73-eacb6dbb3ff7",
  "body": "Я біля входу, мій номер +380739002450, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "c835f901-bf10-439d-815e-000c97fbaece",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739002450, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T12:07:53.380887697Z"
}
```

`POST /api/driver/v1/trips/e252f034-ef29-4677-b5ea-fb23efb75bd2/messages` → **201**

```json
{
  "command_id": "b19f4877-1c18-4557-9bcd-9e066fd15164",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "e41a47d1-4f40-4ab2-a6d8-56abd2c8b474",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T12:07:53.582661539Z"
}
```

`POST /api/driver/v1/work-sessions/21038e9f-82fb-464e-b583-b7ffb2c57058/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:53Z",
    "sequence": 1793362073777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "21038e9f-82fb-464e-b583-b7ffb2c57058",
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
  "last_heartbeat_at": "2026-10-30T12:07:53.793934Z",
  "last_location_at": "2026-10-30T12:07:53.793934Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e252f034-ef29-4677-b5ea-fb23efb75bd2/arrive` → **200**

```json
{
  "command_id": "da7ebced-39f9-4c0d-91d5-4e59a6ad7c26",
  "expected_version": 0
}
```

```json
{
  "id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "assignment_id": "bc3d0092-3541-412c-ab26-737a97fc538d",
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
  "arrived_at": "2026-10-30T12:07:54.013387Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e252f034-ef29-4677-b5ea-fb23efb75bd2/start` → **200**

```json
{
  "command_id": "4e6b010a-931a-422c-9ade-edb1b5471f8b",
  "expected_version": 1
}
```

```json
{
  "id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "assignment_id": "bc3d0092-3541-412c-ab26-737a97fc538d",
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
  "arrived_at": "2026-10-30T12:07:54.013387Z",
  "started_at": "2026-10-30T12:07:54.221168Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/21038e9f-82fb-464e-b583-b7ffb2c57058/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:07:54Z",
    "sequence": 1793362074415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "21038e9f-82fb-464e-b583-b7ffb2c57058",
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
  "last_heartbeat_at": "2026-10-30T12:07:54.431878Z",
  "last_location_at": "2026-10-30T12:07:54.431878Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e252f034-ef29-4677-b5ea-fb23efb75bd2/complete` → **200**

```json
{
  "command_id": "eee4876f-a7ac-4afd-bf3f-05ce6daec679",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:07:54Z",
  "cash_received": false
}
```

```json
{
  "id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "assignment_id": "bc3d0092-3541-412c-ab26-737a97fc538d",
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
  "arrived_at": "2026-10-30T12:07:54.013387Z",
  "started_at": "2026-10-30T12:07:54.221168Z",
  "completed_at": "2026-10-30T12:07:54.643729Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62` → **200**

```json
{
  "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e52a174-3ac8-4328-8b91-2087646dc728",
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
    "id": "bc3d0092-3541-412c-ab26-737a97fc538d",
    "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:07:52.375789Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62` → **200**

```json
{
  "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e52a174-3ac8-4328-8b91-2087646dc728",
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
    "id": "bc3d0092-3541-412c-ab26-737a97fc538d",
    "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:07:52.375789Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62` → **200**

```json
{
  "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8e52a174-3ac8-4328-8b91-2087646dc728",
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
    "id": "bc3d0092-3541-412c-ab26-737a97fc538d",
    "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:07:52.375789Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62` → **200**

```json
{
  "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8e52a174-3ac8-4328-8b91-2087646dc728",
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
    "id": "bc3d0092-3541-412c-ab26-737a97fc538d",
    "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e252f034-ef29-4677-b5ea-fb23efb75bd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:07:52.375789Z",
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
  "session_id": "21038e9f-82fb-464e-b583-b7ffb2c57058",
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
  "last_heartbeat_at": "2026-10-30T12:07:54.431878Z",
  "last_location_at": "2026-10-30T12:07:54.431878Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/21038e9f-82fb-464e-b583-b7ffb2c57058/close` → **200**

```json
{
  "command_id": "f6dd7b41-3790-493f-8496-3a6ae258fee4",
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
  "session_id": "c36e705a-ea9d-4218-ae24-e60d8108948f",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5NzksImlhdCI6MTc5MzM2MjA3OSwianRpIjoiZTczMzE3MWQtMTlmMS00NGY0LWFlYzItOThjMGQ2NmI4YjYyIiwic2lkIjoiYzM2ZTcwNWEtZWE5ZC00MjE4LWFlMjQtZTYwZDgxMDg5NDhmIn0.6c5avzh8LgA4sWeAfprkQ0wjfQYrVmf3L6sID-0gt20",
  "access_expires_at": "2026-10-30T12:22:59.272525824Z",
  "refresh_token": "HhsoaXPrCNClHGWdrj6l2tvhdhEqluORHfgsvBCBfOM",
  "refresh_expires_at": "2026-10-31T00:07:59.272186501Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a8fcdc31-38f7-497e-a7fe-80c6161fce11"
}
```

`GET /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T12:07:59.672693722Z",
  "order": {
    "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
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
    "created_at": "2026-10-30T12:07:52.375789Z",
    "assigned_at": "2026-10-30T12:07:52.998226Z",
    "arrived_at": "2026-10-30T12:07:54.013387Z",
    "started_at": "2026-10-30T12:07:54.221168Z",
    "completed_at": "2026-10-30T12:07:54.643729Z"
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
    "id": "8e52a174-3ac8-4328-8b91-2087646dc728",
    "registered_at": "2026-10-30T12:07:50.695819Z",
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
      "created_at": "2026-10-30T12:07:52.377912Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T12:07:55.594883Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks` → **422**

```json
{
  "command_id": "16927f14-29a5-47a8-982b-a1d4665793bc",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "36e8bd68-be54-40ed-bdf0-9d458498011c"
}
```

`POST /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks` → **201**

```json
{
  "command_id": "5a44b11c-8ea1-4fd6-95b5-3c86a41a56f3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "6fe5b70f-aae5-43bc-99b6-bd2ac3d48015",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:08:00.129773Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks` → **201**

```json
{
  "command_id": "5a44b11c-8ea1-4fd6-95b5-3c86a41a56f3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "6fe5b70f-aae5-43bc-99b6-bd2ac3d48015",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T12:08:00.129773Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/8e52a174-3ac8-4328-8b91-2087646dc728` → **200**

```json
{
  "client": {
    "id": "8e52a174-3ac8-4328-8b91-2087646dc728",
    "phone": "+380739002450",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:07:50.695819Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:07:52.375789Z",
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

`GET /api/admin/v1/clients/8e52a174-3ac8-4328-8b91-2087646dc728` → **200**

```json
{
  "client": {
    "id": "8e52a174-3ac8-4328-8b91-2087646dc728",
    "phone": "+380739002450",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:07:50.695819Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:07:52.375789Z",
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

`POST /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks/6fe5b70f-aae5-43bc-99b6-bd2ac3d48015/resolve` → **200**

```json
{
  "command_id": "eade1567-88b7-4cb5-b41f-d7752be32666",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "6fe5b70f-aae5-43bc-99b6-bd2ac3d48015",
  "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T12:08:00.129773Z",
  "resolved_at": "2026-10-30T12:08:02.015124Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/8e52a174-3ac8-4328-8b91-2087646dc728` → **200**

```json
{
  "client": {
    "id": "8e52a174-3ac8-4328-8b91-2087646dc728",
    "phone": "+380739002450",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:07:50.695819Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:07:52.375789Z",
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

`GET /api/admin/v1/clients/8e52a174-3ac8-4328-8b91-2087646dc728` → **200**

```json
{
  "client": {
    "id": "8e52a174-3ac8-4328-8b91-2087646dc728",
    "phone": "+380739002450",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:07:50.695819Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T12:07:52.375789Z",
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

`POST /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks/6fe5b70f-aae5-43bc-99b6-bd2ac3d48015/resolve` → **409**

```json
{
  "command_id": "96b30c95-0a6a-47ba-b2cc-a5ad99c087a6",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks/6fe5b70f-aae5-43bc-99b6-bd2ac3d48015/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c847ecc0-9322-4031-a82e-a43abbe63e03"
}
```

`GET /api/admin/v1/orders/5dd96a37-5982-44a9-82eb-c5e7d96fcf62/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "6fe5b70f-aae5-43bc-99b6-bd2ac3d48015",
      "order_id": "5dd96a37-5982-44a9-82eb-c5e7d96fcf62",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T12:08:00.129773Z",
      "resolved_at": "2026-10-30T12:08:02.015124Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 5dd96a37-5982-44a9-82eb-c5e7d96fcf62 without phone or card digits; chargeback 6fe5b70f-aae5-43bc-99b6-bd2ac3d48015 recorded and won.

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
  "session_id": "41dc483b-b8fc-4e8b-8e02-850f505e603f",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5ODQsImlhdCI6MTc5MzM2MjA4NCwianRpIjoiYjZjNTA1ZDItMGQyMC00NzU5LTk2YjctZWU5NDk5NmY2MDU0Iiwic2lkIjoiNDFkYzQ4M2ItYjhmYy00ZThiLThlMDItODUwZjUwNWU2MDNmIn0.Uvd5Z8km5umiMSpjoUFY18mWUAhGA4SRlHlizxZoVOs",
  "access_expires_at": "2026-10-30T12:23:04.493823502Z",
  "refresh_token": "Vx1as--T4nKpDVv2cgDZkjAxvfy80vPz253LcXvN-OE",
  "refresh_expires_at": "2026-10-31T00:08:04.493414656Z",
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
  "phone": "+48600411739",
  "device_ref": "sandbox-10397"
}
```

```json
{
  "challenge_id": "d638ccc2-cece-48cf-b421-c96936839ef2",
  "expires_at": "2026-10-30T12:13:05.100962821Z",
  "resend_available_at": "2026-10-30T12:08:06.100962821Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600411739` → **200**

```json
{
  "phone": "+48600411739",
  "audience": "CLIENT",
  "code": "137633",
  "sent_at": "2026-10-30T12:08:05.103458273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d638ccc2-cece-48cf-b421-c96936839ef2",
  "code": "137633",
  "device_ref": "sandbox-10397"
}
```

```json
{
  "session_id": "94ab334b-dba0-4194-bd4f-34152a1867ca",
  "subject": {
    "type": "CLIENT",
    "id": "e752d2e5-f436-43ab-a7fc-87019717e965"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzUyZDJlNS1mNDM2LTQzYWItYTdmYy04NzAxOTcxN2U5NjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTg1LCJpYXQiOjE3OTMzNjIwODUsImp0aSI6IjYzMDczMTNhLTVjODctNDkwNy1hNzIxLTNmN2M3MmVkNGNiNyIsInNpZCI6Ijk0YWIzMzRiLWRiYTAtNDE5NC1iZDRmLTM0MTUyYTE4NjdjYSJ9.sxgu3K4t0jgDYahGh2m1rYYdso27fSQ83OVDe8AKOxc",
  "access_expires_at": "2026-10-30T12:23:05.325547895Z",
  "refresh_token": "bsgP0zb2tfgYpkd_H4-dLSdzXXJaY8G4CzzbaeNUAZY",
  "refresh_expires_at": "2026-11-29T12:08:05.325183996Z",
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
  "command_id": "0aba39f4-2beb-4252-b1d3-08f4e357b8ff",
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
  "correlation_id": "f9f94164-1f80-4751-8489-b3517ef60311",
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
  "command_id": "c7bb399c-a764-44d8-bb61-f09bb532f90a",
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
  "paused_at": "2026-10-30T12:08:06.129684447Z",
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
  "command_id": "2cd31a1f-9573-4a73-b314-ca3e75cc7f2d",
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
  "id": "3f4a2a86-cbe8-4df6-be6f-8357197adb11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:06.533877Z",
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
  "command_id": "ca407793-2e6a-4d35-8b13-6b00fefb961e",
  "quote_id": "3f4a2a86-cbe8-4df6-be6f-8357197adb11",
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
  "correlation_id": "69da90eb-89c0-4c6a-8d37-f43baaf3187d"
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
  "paused_at": "2026-10-30T12:08:06.129684Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "664ee9a1-a549-4071-8b31-ed9e3acdb9c0",
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
  "command_id": "170085a5-3d93-4220-8f72-e3a6f7957dca",
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
  "command_id": "e4e9692f-74ab-4b4f-b51e-2503ff42d890",
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
  "id": "29d87219-3b2c-47eb-ae8d-5c4d3748eed6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:07.771207Z",
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
  "command_id": "32e755de-2ec4-4d2c-977c-9be47920a8b0",
  "quote_id": "29d87219-3b2c-47eb-ae8d-5c4d3748eed6",
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
  "correlation_id": "9aa77237-0c2e-42b8-ab7f-a32e6758d601"
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
  "command_id": "4a811077-9529-4d25-997a-2a0fd194a2e8",
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
      "from": "15:00",
      "to": "16:00"
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
      "from": "15:00",
      "to": "16:00"
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
  "command_id": "1ff6a145-51a1-4ccf-a070-38d7aac63ba3",
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
  "id": "1aa63a07-5af0-4a49-bb3c-c13867901eea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:08.645867Z",
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
  "command_id": "d3e2f8b0-62c7-4516-887a-e7a771e42d44",
  "quote_id": "1aa63a07-5af0-4a49-bb3c-c13867901eea",
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
  "correlation_id": "2a99ed11-e6fe-41ea-b00e-1934b1c18b35"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "005c8060-95bc-4f01-858a-c6369d3b680e",
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
  "correlation_id": "496ba6fe-a0e6-45eb-9a47-dcb765bbbd8b"
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
      "from": "15:00",
      "to": "16:00"
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
  "command_id": "85c2065b-fb63-4791-92a0-190501e19a3b",
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
  "phone": "+380675173092",
  "device_ref": "sandbox-14895"
}
```

```json
{
  "challenge_id": "e801bc36-eb0b-4567-8ec7-97d9f57a474e",
  "expires_at": "2026-10-30T12:13:09.713473868Z",
  "resend_available_at": "2026-10-30T12:08:10.713473868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675173092` → **200**

```json
{
  "phone": "+380675173092",
  "audience": "CLIENT",
  "code": "880492",
  "sent_at": "2026-10-30T12:08:09.715747055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e801bc36-eb0b-4567-8ec7-97d9f57a474e",
  "code": "880492",
  "device_ref": "sandbox-14895"
}
```

```json
{
  "session_id": "8e2b30b8-25a4-4e8c-8e41-c38c3e4352d7",
  "subject": {
    "type": "CLIENT",
    "id": "2f6bf1ad-3167-494d-b896-93651423fefc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjZiZjFhZC0zMTY3LTQ5NGQtYjg5Ni05MzY1MTQyM2ZlZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTg5LCJpYXQiOjE3OTMzNjIwODksImp0aSI6ImIxYTYzYWJiLTEzY2MtNDkyNS05YmQ1LWU3N2E4NWYzNTc1ZiIsInNpZCI6IjhlMmIzMGI4LTI1YTQtNGU4Yy04ZTQxLWMzOGMzZTQzNTJkNyJ9.99QNKeZCROMb-a2H0NEXqT2MqewTEzKapLGcozLERP4",
  "access_expires_at": "2026-10-30T12:23:09.94038414Z",
  "refresh_token": "Q-8ESSPnlkVtvA6NaBh_B65li52Q0UVPy__x5mnvFn4",
  "refresh_expires_at": "2026-11-29T12:08:09.940004646Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2f6bf1ad-3167-494d-b896-93651423fefc",
  "session_id": "8e2b30b8-25a4-4e8c-8e41-c38c3e4352d7",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77eea8c6-7f15-45f6-a5bd-2ef50bc4ab4b",
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
  "id": "30e97cad-5503-4b6c-a338-9c2e483c9ce5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:10.331811Z",
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
  "challenge_id": "b466eb9f-a40d-49df-bbd3-03e4c60a7cba",
  "expires_at": "2026-10-30T12:13:12.544210101Z",
  "resend_available_at": "2026-10-30T12:08:13.544210101Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675173092` → **200**

```json
{
  "phone": "+380675173092",
  "audience": "CLIENT",
  "code": "272697",
  "sent_at": "2026-10-30T12:08:12.546098253Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "7d1d3096-9031-4f50-8082-e98a600619a3",
  "challenge_id": "b466eb9f-a40d-49df-bbd3-03e4c60a7cba",
  "otp_code": "272697"
}
```

```json
{
  "client_id": "2f6bf1ad-3167-494d-b896-93651423fefc",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T12:08:12.776004524Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a1d5f50e-21cc-447a-b135-17cf498c8398",
  "quote_id": "30e97cad-5503-4b6c-a338-9c2e483c9ce5",
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
  "correlation_id": "31e05cf4-fb22-4874-ab54-38de32a338f8"
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
  "session_id": "bcc8bca4-0311-4554-b5bc-5f464d90d528",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5OTMsImlhdCI6MTc5MzM2MjA5MywianRpIjoiYTZjYzcyMTMtZTg0OC00YjBlLTk1ZTgtNjFmMzdiNmJiZmE4Iiwic2lkIjoiYmNjOGJjYTQtMDMxMS00NTU0LWI1YmMtNWY0NjRkOTBkNTI4In0.nJipanYj5BSLbk62RMiNs3BLiO-6ySIy2TzK02cUic4",
  "access_expires_at": "2026-10-30T12:23:13.403044778Z",
  "refresh_token": "1ze505H01Pj4WIQ4IcbQFZAA9s_g6W7RHXYXOoHz62o",
  "refresh_expires_at": "2026-10-31T00:08:13.402636262Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2f6bf1ad-3167-494d-b896-93651423fefc",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T12:08:12.776005Z",
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

`POST /api/admin/v1/client-deletions/2f6bf1ad-3167-494d-b896-93651423fefc/complete` → **200**

```json
{
  "command_id": "d9a08582-a4b5-4e49-8f2c-0994945cf77d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2f6bf1ad-3167-494d-b896-93651423fefc",
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
  "correlation_id": "dedcc358-8a04-4a88-b65e-18ac7edf906a"
}
```

Done: client 2f6bf1ad-3167-494d-b896-93651423fefc anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666648615",
  "device_ref": "sandbox-31671"
}
```

```json
{
  "challenge_id": "5dee9953-75e8-45f2-86fe-e160bf2b5130",
  "expires_at": "2026-10-30T12:13:14.304946871Z",
  "resend_available_at": "2026-10-30T12:08:15.304946871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666648615` → **200**

```json
{
  "phone": "+380666648615",
  "audience": "CLIENT",
  "code": "820481",
  "sent_at": "2026-10-30T12:08:14.307201539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dee9953-75e8-45f2-86fe-e160bf2b5130",
  "code": "820481",
  "device_ref": "sandbox-31671"
}
```

```json
{
  "session_id": "cf35a079-2523-4a33-8792-4beb4db09d93",
  "subject": {
    "type": "CLIENT",
    "id": "17042f58-3675-4de8-b860-1bd3ad49e67e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzA0MmY1OC0zNjc1LTRkZTgtYjg2MC0xYmQzYWQ0OWU2N2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYyOTk0LCJpYXQiOjE3OTMzNjIwOTQsImp0aSI6ImI1Mjc0ZjA2LTlmNWItNGM0Yi05M2ZmLWNiYjI2MTZhZTdlOSIsInNpZCI6ImNmMzVhMDc5LTI1MjMtNGEzMy04NzkyLTRiZWI0ZGIwOWQ5MyJ9.uKxP9bNuMMiRjy8BPdlKXJexaKLvx2-zxWsXTYEDdVg",
  "access_expires_at": "2026-10-30T12:23:14.530100542Z",
  "refresh_token": "JsF7EAJGFlrhX14PKWZ0_9iO-bGj9Op3E_qb56x0NgU",
  "refresh_expires_at": "2026-11-29T12:08:14.52974034Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
  "session_id": "cf35a079-2523-4a33-8792-4beb4db09d93",
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
  "session_id": "24c9aabe-118b-484f-b75d-a827e1f0579a",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjI5OTUsImlhdCI6MTc5MzM2MjA5NSwianRpIjoiNDg0OTQyNjQtZmEyOC00NDFjLWIxODgtM2YwYTdmMzI0N2JlIiwic2lkIjoiMjRjOWFhYmUtMTE4Yi00ODRmLWI3NWQtYTgyN2UxZjA1NzlhIn0.sqFJloLhNsQ_m6H7l6qAPmDWXbejYKdGf6fCHyIrwrs",
  "access_expires_at": "2026-10-30T12:23:15.138504777Z",
  "refresh_token": "IP5t6gpPSKI_KEFhBl_KiaqTHrxV5HzVWoafkPmrT-g",
  "refresh_expires_at": "2026-10-31T00:08:15.138107748Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6648615&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
      "phone": "+380666648615",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T12:08:14.528246Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/17042f58-3675-4de8-b860-1bd3ad49e67e` → **200**

```json
{
  "client": {
    "id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
    "phone": "+380666648615",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:08:14.528246Z",
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

`POST /api/admin/v1/clients/17042f58-3675-4de8-b860-1bd3ad49e67e/block` → **400**

```json
{
  "command_id": "f6d6bc3f-de0d-4459-b549-8bceb82c22b8",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/17042f58-3675-4de8-b860-1bd3ad49e67e/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "efc46628-659a-4c8d-a1b3-96c9336beb16",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/17042f58-3675-4de8-b860-1bd3ad49e67e/block` → **200**

```json
{
  "command_id": "b1b10661-31f5-4fe5-8593-0f9061159897",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
  "phone": "+380666648615",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T12:08:14.528246Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T12:08:15.988965Z",
    "by": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
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
  "correlation_id": "96252f88-98cf-4d25-b4f4-a39d31175ab7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666648615",
  "device_ref": "sandbox-25030"
}
```

```json
{
  "challenge_id": "21ad9252-add3-4a38-8851-29731ebea209",
  "expires_at": "2026-10-30T12:13:18.393451584Z",
  "resend_available_at": "2026-10-30T12:08:19.393451584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666648615` → **200**

```json
{
  "phone": "+380666648615",
  "audience": "CLIENT",
  "code": "023224",
  "sent_at": "2026-10-30T12:08:18.39553703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "21ad9252-add3-4a38-8851-29731ebea209",
  "code": "023224",
  "device_ref": "sandbox-25030"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "9d17179f-973f-44b6-9ee9-a6c619277726"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/17042f58-3675-4de8-b860-1bd3ad49e67e` → **200**

```json
{
  "client": {
    "id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
    "phone": "+380666648615",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T12:08:14.528246Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T12:08:15.988965Z",
      "by": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
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

`POST /api/admin/v1/clients/17042f58-3675-4de8-b860-1bd3ad49e67e/unblock` → **200**

```json
{
  "command_id": "470e772b-a203-4051-8a0e-5553e222e6b9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
  "phone": "+380666648615",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T12:08:14.528246Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666648615",
  "device_ref": "sandbox-11431"
}
```

```json
{
  "challenge_id": "5f591cf9-4b2c-4a2e-bc70-5f71ef3c621f",
  "expires_at": "2026-10-30T12:13:21.260050572Z",
  "resend_available_at": "2026-10-30T12:08:22.260050572Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666648615` → **200**

```json
{
  "phone": "+380666648615",
  "audience": "CLIENT",
  "code": "705319",
  "sent_at": "2026-10-30T12:08:21.262088176Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f591cf9-4b2c-4a2e-bc70-5f71ef3c621f",
  "code": "705319",
  "device_ref": "sandbox-11431"
}
```

```json
{
  "session_id": "52cf6a22-d970-4a6c-9af5-2a734d7797fc",
  "subject": {
    "type": "CLIENT",
    "id": "17042f58-3675-4de8-b860-1bd3ad49e67e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzA0MmY1OC0zNjc1LTRkZTgtYjg2MC0xYmQzYWQ0OWU2N2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDAxLCJpYXQiOjE3OTMzNjIxMDEsImp0aSI6IjIyMWM5YjRlLTQ5NDgtNDg5OC1hNjA5LWUwMmNmYjdkMWUyZSIsInNpZCI6IjUyY2Y2YTIyLWQ5NzAtNGE2Yy05YWY1LTJhNzM0ZDc3OTdmYyJ9.qjK1g8DpEVsSZjAv_ew4TGidecJhhF9xKLb0uf5fvnY",
  "access_expires_at": "2026-10-30T12:23:21.490888283Z",
  "refresh_token": "bA55RXWobbKeKB96FmLaA6_OfbPKbn0of8SbBVOJzUI",
  "refresh_expires_at": "2026-11-29T12:08:21.490520158Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "17042f58-3675-4de8-b860-1bd3ad49e67e",
  "session_id": "52cf6a22-d970-4a6c-9af5-2a734d7797fc",
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
  "phone": "+380666507145",
  "device_ref": "sandbox-13919"
}
```

```json
{
  "challenge_id": "8f915bbf-1ee3-4192-a036-c1a0cbfb5813",
  "expires_at": "2026-10-30T12:13:21.894620167Z",
  "resend_available_at": "2026-10-30T12:08:22.894620167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666507145` → **200**

```json
{
  "phone": "+380666507145",
  "audience": "CLIENT",
  "code": "659843",
  "sent_at": "2026-10-30T12:08:21.897299228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f915bbf-1ee3-4192-a036-c1a0cbfb5813",
  "code": "659843",
  "device_ref": "sandbox-13919"
}
```

```json
{
  "session_id": "09ddb50d-73bb-4195-99e9-d038f00a7766",
  "subject": {
    "type": "CLIENT",
    "id": "52f8a794-a1cc-4b70-8591-5cff6dc08da5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmY4YTc5NC1hMWNjLTRiNzAtODU5MS01Y2ZmNmRjMDhkYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDAyLCJpYXQiOjE3OTMzNjIxMDIsImp0aSI6IjNmNjliMjNmLTk0ZGUtNDUyNi05MTBlLTYyNDgzZTM4ZGEyZiIsInNpZCI6IjA5ZGRiNTBkLTczYmItNDE5NS05OWU5LWQwMzhmMDBhNzc2NiJ9.q307ABqIglLL8GdNqPDvDJcQEeELZ_dtsNU7L4ly1js",
  "access_expires_at": "2026-10-30T12:23:22.112745798Z",
  "refresh_token": "riHoVSjtmAfzTFKUBK9u_3PC15W9r-ASL161oK1doX0",
  "refresh_expires_at": "2026-11-29T12:08:22.1123959Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7cb9ee60-3da6-42d7-8b08-36db94078bc3",
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
  "id": "0436961e-c130-4f16-afff-f2ce372098aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:22.307532Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 0030dc63-5d40-4edb-8bc7-8338b5b10e1e) → **201**

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
  "session_id": "bfca8dae-de92-4cfc-a5b6-c73564eb2024",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMDIsImlhdCI6MTc5MzM2MjEwMiwianRpIjoiMjM5MTZkNGUtODkxMi00ZDIyLTljOGMtMGVmMmUxY2U1ZGU0Iiwic2lkIjoiYmZjYThkYWUtZGU5Mi00Y2ZjLWE1YjYtYzczNTY0ZWIyMDI0In0.9ztl50oy2ED-IH5D2RByErqEgL55sSgvXSBnB5O_IV8",
  "access_expires_at": "2026-10-30T12:23:22.744563006Z",
  "refresh_token": "7B0HZXKZjpP2sTJanjrB73Cx_XsTklw67tpcPMkj71c",
  "refresh_expires_at": "2026-10-31T00:08:22.74408153Z",
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
  "session_id": "dddb3283-801d-4a38-bd29-b7e6f4f4ea4f",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMDMsImlhdCI6MTc5MzM2MjEwMywianRpIjoiMmFmNWU5NWUtZTllNi00YTA3LTg4YjAtNjg2NjA4OGE1MDhlIiwic2lkIjoiZGRkYjMyODMtODAxZC00YTM4LWJkMjktYjdlNmY0ZjRlYTRmIn0.AQotONYAYs8rc3g3gwHWUhmWc4ob5bVN_vb9D5MS7rY",
  "access_expires_at": "2026-10-30T12:23:23.141559556Z",
  "refresh_token": "_7RSwIb3SwuCEYQGAoiBN9xQcad3_ACIKhI4YTCVH8k",
  "refresh_expires_at": "2026-10-31T00:08:23.14121089Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8f79307a-6661-4e2a-8a1c-d37029adc2ea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:08:22.507715Z",
      "actor": {
        "type": "CLIENT",
        "id": "52f8a794-a1cc-4b70-8591-5cff6dc08da5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
        "quote_id": "0436961e-c130-4f16-afff-f2ce372098aa",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0030dc63-5d40-4edb-8bc7-8338b5b10e1e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:08:22.508968Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
        "attempt_id": "3724effc-6d0e-4846-bc67-a2353f04cbcd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0030dc63-5d40-4edb-8bc7-8338b5b10e1e"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T12:08:22.515719Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
        "attempt_id": "3724effc-6d0e-4846-bc67-a2353f04cbcd"
      },
      "correlation_id": "0030dc63-5d40-4edb-8bc7-8338b5b10e1e"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "3724effc-6d0e-4846-bc67-a2353f04cbcd",
        "generation": 1,
        "started_at": "2026-10-30T12:08:22.508338Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T12:08:22.515719Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T12:08:22.509444Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/0030dc63-5d40-4edb-8bc7-8338b5b10e1e` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea:0",
      "order_id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
      "at": "2026-10-30T12:08:22.507715Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea:1",
      "order_id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
      "at": "2026-10-30T12:08:22.508968Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea:2",
      "order_id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
      "at": "2026-10-30T12:08:22.515719Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/b5f07698-981f-4fc4-ba41-44462ed8a3a7` → **200**

```json
{
  "found": []
}
```

Done: request 0030dc63-5d40-4edb-8bc7-8338b5b10e1e — order 8f79307a-6661-4e2a-8a1c-d37029adc2ea found by its id.

`GET /api/rider/v1/orders/8f79307a-6661-4e2a-8a1c-d37029adc2ea` → **200**

```json
{
  "id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52f8a794-a1cc-4b70-8591-5cff6dc08da5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:08:22.507346Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8f79307a-6661-4e2a-8a1c-d37029adc2ea/cancel` → **200**

```json
{
  "command_id": "f443f0d7-f0a3-41f2-a50e-9f7bfbdd1d61",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8f79307a-6661-4e2a-8a1c-d37029adc2ea",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52f8a794-a1cc-4b70-8591-5cff6dc08da5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:08:22.507346Z",
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
  "phone": "+380636104007",
  "device_ref": "sandbox-698"
}
```

```json
{
  "challenge_id": "8c396979-3619-4504-92a0-2384efffe4b1",
  "expires_at": "2026-10-30T12:13:24.391055913Z",
  "resend_available_at": "2026-10-30T12:08:25.391055913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636104007` → **200**

```json
{
  "phone": "+380636104007",
  "audience": "CLIENT",
  "code": "802433",
  "sent_at": "2026-10-30T12:08:24.393204444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c396979-3619-4504-92a0-2384efffe4b1",
  "code": "802433",
  "device_ref": "sandbox-698"
}
```

```json
{
  "session_id": "8f109a5e-25f7-4237-a4d8-e1dc82767442",
  "subject": {
    "type": "CLIENT",
    "id": "87697007-c071-4da0-af43-aa4bb68ddb58"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzY5NzAwNy1jMDcxLTRkYTAtYWY0My1hYTRiYjY4ZGRiNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDA0LCJpYXQiOjE3OTMzNjIxMDQsImp0aSI6ImJjZWM4OWQxLWIxYTItNDI4Ny1iMTJhLTI2YzgxMGM4Yzg4MCIsInNpZCI6IjhmMTA5YTVlLTI1ZjctNDIzNy1hNGQ4LWUxZGM4Mjc2NzQ0MiJ9.Xy0Edl3bN1JwouSlo3n9o5daDjrEp1xUdTUgOma3llI",
  "access_expires_at": "2026-10-30T12:23:24.614864502Z",
  "refresh_token": "DhEYSrt9EVQS5WkhldztoqHjYkm11mb3yC97DejSI2o",
  "refresh_expires_at": "2026-11-29T12:08:24.614372599Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "92776be2-3581-4a33-92e3-b73f3f0895eb",
  "expires_at": "2026-10-30T12:13:26.815668963Z",
  "resend_available_at": "2026-10-30T12:08:27.815668963Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636104007` → **200**

```json
{
  "phone": "+380636104007",
  "audience": "CLIENT",
  "code": "406301",
  "sent_at": "2026-10-30T12:08:26.817732566Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "fc11bdff-4340-4b08-82b3-5c6e4c684be1",
  "challenge_id": "92776be2-3581-4a33-92e3-b73f3f0895eb",
  "otp_code": "406301"
}
```

```json
{
  "id": "3f7abf9a-3416-4b58-82e4-94c8624e2bc8",
  "state": "PENDING",
  "created_at": "2026-10-30T12:08:27.050485Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8` → **200**

```json
{
  "id": "3f7abf9a-3416-4b58-82e4-94c8624e2bc8",
  "state": "PENDING",
  "created_at": "2026-10-30T12:08:27.050485Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8` → **200**

```json
{
  "id": "3f7abf9a-3416-4b58-82e4-94c8624e2bc8",
  "state": "PENDING",
  "created_at": "2026-10-30T12:08:27.050485Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8` → **200**

```json
{
  "id": "3f7abf9a-3416-4b58-82e4-94c8624e2bc8",
  "state": "PENDING",
  "created_at": "2026-10-30T12:08:27.050485Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8` → **200**

```json
{
  "id": "3f7abf9a-3416-4b58-82e4-94c8624e2bc8",
  "state": "READY",
  "created_at": "2026-10-30T12:08:27.050485Z",
  "ready_at": "2026-10-30T12:08:30.685288Z",
  "expires_at": "2026-11-06T12:08:30.685288Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632146800",
  "device_ref": "sandbox-9438"
}
```

```json
{
  "challenge_id": "f0ecfc3e-76d1-4f7a-8f0b-80ec8710f8c3",
  "expires_at": "2026-10-30T12:13:31.049208388Z",
  "resend_available_at": "2026-10-30T12:08:32.049208388Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632146800` → **200**

```json
{
  "phone": "+380632146800",
  "audience": "CLIENT",
  "code": "247502",
  "sent_at": "2026-10-30T12:08:31.051394514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0ecfc3e-76d1-4f7a-8f0b-80ec8710f8c3",
  "code": "247502",
  "device_ref": "sandbox-9438"
}
```

```json
{
  "session_id": "b9f8e2e3-e893-4c4f-b617-7e07a9f7a83f",
  "subject": {
    "type": "CLIENT",
    "id": "7a90a3c9-e8a3-4e1d-8cef-0b3e01045a21"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTkwYTNjOS1lOGEzLTRlMWQtOGNlZi0wYjNlMDEwNDVhMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDExLCJpYXQiOjE3OTMzNjIxMTEsImp0aSI6ImZhY2U1YWQ0LTY5ZDYtNDRkYi05MjM4LTFlMmEyYWQ0ZmEzYiIsInNpZCI6ImI5ZjhlMmUzLWU4OTMtNGM0Zi1iNjE3LTdlMDdhOWY3YTgzZiJ9.FgGC-n7y8Sy8haaEhiOISlJOC0k3VcX6A_88IM3fSOs",
  "access_expires_at": "2026-10-30T12:23:31.274628281Z",
  "refresh_token": "Tw5qe38HtKXSW8oiZsp-GCb9qzPSSyuN40hT6Fqls2Y",
  "refresh_expires_at": "2026-11-29T12:08:31.274257541Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3f7abf9a-3416-4b58-82e4-94c8624e2bc8/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ba9a4c0e-36fe-4a82-a675-72f4ddb81f1d"
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
  "session_id": "dfadc0a4-8c02-4d21-8586-f5750667db55",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMTEsImlhdCI6MTc5MzM2MjExMSwianRpIjoiOTRjYTE2OWItZDg3Ni00NzRhLWFlODMtZDYzZTFlMmMzNDhkIiwic2lkIjoiZGZhZGMwYTQtOGMwMi00ZDIxLTg1ODYtZjU3NTA2NjdkYjU1In0.mT4cNDro8hJPBfD-wAGoJ1O06MsZQHKOSVO2Q4zjmfw",
  "access_expires_at": "2026-10-30T12:23:31.875195506Z",
  "refresh_token": "oQkC4otZPFUpUEBjO2EWkES3NxJcpLm5xVUdIBpUQ5o",
  "refresh_expires_at": "2026-10-31T00:08:31.874843435Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "87697007-c071-4da0-af43-aa4bb68ddb58",
  "session_id": "8f109a5e-25f7-4237-a4d8-e1dc82767442",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/87697007-c071-4da0-af43-aa4bb68ddb58/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3f7abf9a-3416-4b58-82e4-94c8624e2bc8",
      "state": "READY",
      "created_at": "2026-10-30T12:08:27.050485Z",
      "ready_at": "2026-10-30T12:08:30.685288Z",
      "expires_at": "2026-11-06T12:08:30.685288Z",
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
  "device_ref": "sandbox-12602"
}
```

```json
{
  "challenge_id": "7700badc-0939-4247-9f69-413e52b63f45",
  "expires_at": "2026-10-30T12:13:32.474372683Z",
  "resend_available_at": "2026-10-30T12:08:33.474372683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "380875",
  "sent_at": "2026-10-30T12:08:32.476436986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7700badc-0939-4247-9f69-413e52b63f45",
  "code": "380875",
  "device_ref": "sandbox-12602"
}
```

```json
{
  "session_id": "32c73ddf-f68c-4b19-964c-e007188d3dd6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzAxMiwiaWF0IjoxNzkzMzYyMTEyLCJqdGkiOiJlNzhhYTI2Mi04OGYwLTRmNDItYjg1NC02YWRiODAwMDY4NDAiLCJzaWQiOiIzMmM3M2RkZi1mNjhjLTRiMTktOTY0Yy1lMDA3MTg4ZDNkZDYifQ.GgSew6vY6teJR9R_LEPJDY_qWHRs_UNDxOUwlc9sa7s",
  "access_expires_at": "2026-10-30T12:23:32.694307273Z",
  "refresh_token": "Uu3eFqlm7arWJosSm4lcwk0XIERSA-nZmVjegjE8ln8",
  "refresh_expires_at": "2026-11-29T12:08:32.693881965Z",
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
  "device_ref": "sandbox-20193"
}
```

```json
{
  "challenge_id": "18b32ad1-e59a-4246-8df4-db7a11a9bed4",
  "expires_at": "2026-10-30T12:13:33.109673285Z",
  "resend_available_at": "2026-10-30T12:08:34.109673285Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "778715",
  "sent_at": "2026-10-30T12:08:33.111683252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18b32ad1-e59a-4246-8df4-db7a11a9bed4",
  "code": "778715",
  "device_ref": "sandbox-20193"
}
```

```json
{
  "session_id": "a0a60512-d7a2-4eb8-8897-5276269dca28",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzAxMywiaWF0IjoxNzkzMzYyMTEzLCJqdGkiOiJlM2U0N2YxOS0yZGZiLTRkMDYtODQ3My1kOWQ2NGM1YWNkOWYiLCJzaWQiOiJhMGE2MDUxMi1kN2EyLTRlYjgtODg5Ny01Mjc2MjY5ZGNhMjgifQ.Dp-1DZPUK4zHORoIOnPxGWX6BaefbKImMEjRMkCFCdM",
  "access_expires_at": "2026-10-30T12:23:33.326106678Z",
  "refresh_token": "hHiQQJ1AcFMlSZBy5D9llQSgP80V5YBrWU7ZPnODcMg",
  "refresh_expires_at": "2026-11-29T12:08:33.325745854Z",
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
  "command_id": "5276439d-f497-4ec0-b045-09124b546859",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:08:33Z",
    "sequence": 1793362113713
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "16232afb-4ecc-4c80-ba70-656bc28da10d",
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
  "last_heartbeat_at": "2026-10-30T12:08:33.730565Z",
  "last_location_at": "2026-10-30T12:08:33.730565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-31217"
}
```

```json
{
  "challenge_id": "5d464941-4539-4eb0-bc30-0c6b5538274e",
  "expires_at": "2026-10-30T12:13:33.927547742Z",
  "resend_available_at": "2026-10-30T12:08:34.927547742Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "684256",
  "sent_at": "2026-10-30T12:08:33.929904921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d464941-4539-4eb0-bc30-0c6b5538274e",
  "code": "684256",
  "device_ref": "sandbox-31217"
}
```

```json
{
  "session_id": "17592982-508f-42d1-be02-50bfa523e3c0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzAxNCwiaWF0IjoxNzkzMzYyMTE0LCJqdGkiOiI2Yzk2YzI1ZS0yNTVjLTQ4NmUtYmFjYy02ZmYzNDI1MDhiOGUiLCJzaWQiOiIxNzU5Mjk4Mi01MDhmLTQyZDEtYmUwMi01MGJmYTUyM2UzYzAifQ.2IMOmdnmIZ4tV_Ae50HszRtHsJyjvAUUgYwey5n9OU4",
  "access_expires_at": "2026-10-30T12:23:34.146276466Z",
  "refresh_token": "qpKlESQHl5jsX0sVBghg0Kel4uWOwuxOJ7F5dMGNHBk",
  "refresh_expires_at": "2026-11-29T12:08:34.145926809Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "76f1950b-304f-4bfd-94ef-1ae92fc4bd58",
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
  "last_heartbeat_at": "2026-10-30T12:07:23.289966Z",
  "last_location_at": "2026-10-30T12:07:23.289966Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/76f1950b-304f-4bfd-94ef-1ae92fc4bd58/handover` → **200**

```json
{
  "command_id": "72ed6bf6-b04a-48ed-9e4c-d1414f213d8b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "76f1950b-304f-4bfd-94ef-1ae92fc4bd58",
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
  "last_heartbeat_at": "2026-10-30T12:07:23.289966Z",
  "last_location_at": "2026-10-30T12:07:23.289966Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/76f1950b-304f-4bfd-94ef-1ae92fc4bd58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:08:34Z",
    "sequence": 1793362114754
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "76f1950b-304f-4bfd-94ef-1ae92fc4bd58",
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
  "last_heartbeat_at": "2026-10-30T12:08:34.771756Z",
  "last_location_at": "2026-10-30T12:08:34.771756Z",
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
  "session_id": "95f4d4ab-11af-4bd1-82de-76acfe95ef77",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMTUsImlhdCI6MTc5MzM2MjExNSwianRpIjoiZDU0Y2E4NTUtNmM1YS00OWQyLTlmNzktM2EzOTA5YThkNzNiIiwic2lkIjoiOTVmNGQ0YWItMTFhZi00YmQxLTgyZGUtNzZhY2ZlOTVlZjc3In0.rIAr4eIe7Dd79hIR5UeaB-Iy_LdSeRYeZfuGYGQL0jU",
  "access_expires_at": "2026-10-30T12:23:35.181069616Z",
  "refresh_token": "V1Ko5FxpldRHIUu0CZOYdT1BZVXYnvGaeUCnZ4Zsv80",
  "refresh_expires_at": "2026-10-31T00:08:35.180722893Z",
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
  "session_id": "491d3106-014a-4a1e-b1b5-5cc5b2ac79af",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMTUsImlhdCI6MTc5MzM2MjExNSwianRpIjoiZWJiMzg1YzMtY2IzMi00N2YzLWJkYWMtOWI5MWRiZDFiOThlIiwic2lkIjoiNDkxZDMxMDYtMDE0YS00YTFlLWIxYjUtNWNjNWIyYWM3OWFmIn0.zdDiwynyIb0xo9Z5Al7WEGXQaK-dT56_INw9gayLHNM",
  "access_expires_at": "2026-10-30T12:23:35.578717514Z",
  "refresh_token": "v12CvnLUj_-BVTevCX_v0a3V99DHX_tf04tN283vZbw",
  "refresh_expires_at": "2026-10-31T00:08:35.578319435Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686094920",
  "device_ref": "sandbox-21584"
}
```

```json
{
  "challenge_id": "7846cee3-ce3b-4508-9e1b-07f8d5c38199",
  "expires_at": "2026-10-30T12:13:35.786004162Z",
  "resend_available_at": "2026-10-30T12:08:36.786004162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686094920` → **200**

```json
{
  "phone": "+380686094920",
  "audience": "CLIENT",
  "code": "333080",
  "sent_at": "2026-10-30T12:08:35.788106697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7846cee3-ce3b-4508-9e1b-07f8d5c38199",
  "code": "333080",
  "device_ref": "sandbox-21584"
}
```

```json
{
  "session_id": "e82f1998-b918-46db-8e98-5ae85076003f",
  "subject": {
    "type": "CLIENT",
    "id": "adf3dd6e-5ebc-4900-8cf6-0e61387e6bbb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGYzZGQ2ZS01ZWJjLTQ5MDAtOGNmNi0wZTYxMzg3ZTZiYmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDE2LCJpYXQiOjE3OTMzNjIxMTYsImp0aSI6IjA3Yzg4Y2YxLTA1ZDItNGMzYi04OTIxLWU4MTM5ODNhMGE3YiIsInNpZCI6ImU4MmYxOTk4LWI5MTgtNDZkYi04ZTk4LTVhZTg1MDc2MDAzZiJ9.w88KjSDY1ZEy8ug4X_0lmo7afdN0voccnVBjQ3DaZrE",
  "access_expires_at": "2026-10-30T12:23:36.019195549Z",
  "refresh_token": "ARkCX9ftUOdG6bPHlMTeOz2lozhjrLSLmOvZv9IvAHE",
  "refresh_expires_at": "2026-11-29T12:08:36.018774708Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e068316-6d86-4cd8-8193-0d549302cbad",
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
  "id": "8ae414d1-e5d2-48d0-9dc3-6d1bf68084e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:36.222168Z",
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
  "command_id": "138f8143-bfcc-4614-a083-6e4648c8d8f7",
  "quote_id": "8ae414d1-e5d2-48d0-9dc3-6d1bf68084e2",
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
  "id": "7eef291f-5182-4a4c-b51d-611686a28c93",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adf3dd6e-5ebc-4900-8cf6-0e61387e6bbb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:08:36.433566Z",
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
    "id": "21f2541b-8e33-4746-a0c3-dcfcccf24941",
    "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
    "expires_at": "2026-10-30T12:08:51.435802Z",
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

`POST /api/driver/v1/offers/21f2541b-8e33-4746-a0c3-dcfcccf24941/reject` → **204**

```json
{
  "command_id": "680bc109-e4f0-4fec-b9d8-f92ecacd79a5"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6e49916e-721c-41d1-bbfb-1994ea7c6b7f",
    "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
    "expires_at": "2026-10-30T12:08:51.876768Z",
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

`POST /api/driver/v1/offers/6e49916e-721c-41d1-bbfb-1994ea7c6b7f/accept` → **200**

```json
{
  "command_id": "28d610d2-0afd-4892-b132-923d4573278f"
}
```

```json
{
  "id": "385d0c4c-483e-4baf-913e-b8a67ea45436",
  "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa8375f6-cfdd-49f3-acc5-23620ca1b999",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/7eef291f-5182-4a4c-b51d-611686a28c93/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:08:36.433932Z",
      "actor": {
        "type": "CLIENT",
        "id": "adf3dd6e-5ebc-4900-8cf6-0e61387e6bbb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
        "quote_id": "8ae414d1-e5d2-48d0-9dc3-6d1bf68084e2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2284a231-4bd3-46b0-aec5-64056fd3f185"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:08:36.435301Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
        "attempt_id": "a7fc1e38-78f3-4f01-90c1-c6661dc9bd48",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2284a231-4bd3-46b0-aec5-64056fd3f185"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:08:36.437892Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "21f2541b-8e33-4746-a0c3-dcfcccf24941",
        "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "2284a231-4bd3-46b0-aec5-64056fd3f185"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T12:08:36.876054Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "21f2541b-8e33-4746-a0c3-dcfcccf24941",
        "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93"
      },
      "correlation_id": "b0c9b6f2-546a-4bdc-89ae-6b8d215e40db"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 7eef291f-5182-4a4c-b51d-611686a28c93 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/7eef291f-5182-4a4c-b51d-611686a28c93` → **200**

```json
{
  "id": "7eef291f-5182-4a4c-b51d-611686a28c93",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "adf3dd6e-5ebc-4900-8cf6-0e61387e6bbb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "385d0c4c-483e-4baf-913e-b8a67ea45436",
    "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "aa8375f6-cfdd-49f3-acc5-23620ca1b999",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:08:36.433566Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7eef291f-5182-4a4c-b51d-611686a28c93/cancel` → **200**

```json
{
  "command_id": "75453945-25a4-435b-88eb-8204589a8aff",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7eef291f-5182-4a4c-b51d-611686a28c93",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "adf3dd6e-5ebc-4900-8cf6-0e61387e6bbb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "385d0c4c-483e-4baf-913e-b8a67ea45436",
    "order_id": "7eef291f-5182-4a4c-b51d-611686a28c93",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "aa8375f6-cfdd-49f3-acc5-23620ca1b999",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:08:36.433566Z",
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
  "session_id": "16232afb-4ecc-4c80-ba70-656bc28da10d",
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
  "last_heartbeat_at": "2026-10-30T12:08:33.730565Z",
  "last_location_at": "2026-10-30T12:08:33.730565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/16232afb-4ecc-4c80-ba70-656bc28da10d/close` → **200**

```json
{
  "command_id": "75bcc01e-d55b-43d6-8468-a5d55489453e",
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
  "session_id": "76f1950b-304f-4bfd-94ef-1ae92fc4bd58",
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
  "last_heartbeat_at": "2026-10-30T12:08:34.771756Z",
  "last_location_at": "2026-10-30T12:08:34.771756Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/76f1950b-304f-4bfd-94ef-1ae92fc4bd58/close` → **200**

```json
{
  "command_id": "da25b831-5838-4700-808b-30cb83fd9365",
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
  "device_ref": "sandbox-13048"
}
```

```json
{
  "challenge_id": "8217de3f-ac0a-4a08-9960-b44eb5151271",
  "expires_at": "2026-10-30T12:13:38.783181992Z",
  "resend_available_at": "2026-10-30T12:08:39.783181992Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "900643",
  "sent_at": "2026-10-30T12:08:38.785285944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8217de3f-ac0a-4a08-9960-b44eb5151271",
  "code": "900643",
  "device_ref": "sandbox-13048"
}
```

```json
{
  "session_id": "76eedb51-4028-47e2-b72b-fd8eb858bfbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzAxOSwiaWF0IjoxNzkzMzYyMTE5LCJqdGkiOiJlNTU5OWZjYi1mNDcwLTQ5NmMtODA1MC1kOTdmYWUxMmJmOTciLCJzaWQiOiI3NmVlZGI1MS00MDI4LTQ3ZTItYjcyYi1mZDhlYjg1OGJmYmMifQ.pfbLcaA-xNhXbA5e5PFKUhHgqh_4asUUXqTgP7awQ80",
  "access_expires_at": "2026-10-30T12:23:39.005325309Z",
  "refresh_token": "4Pfh0Tyoo0r0STtn6zfuwRpO9TSDYtRGRTL1X-8253s",
  "refresh_expires_at": "2026-11-29T12:08:39.004973238Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "48c2fe21-c197-41d9-8eb9-12d4d2437295",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "04295517-453e-477d-a372-1efd488db260",
  "upload_path": "/api/driver/v1/uploads/04295517-453e-477d-a372-1efd488db260",
  "expires_at": "2026-10-30T12:23:39.208794182Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/04295517-453e-477d-a372-1efd488db260` → **200**

```json
{
  "file_id": "04295517-453e-477d-a372-1efd488db260",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/04295517-453e-477d-a372-1efd488db260`, first bytes `425a4631503c02f7` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/04295517-453e-477d-a372-1efd488db260` → **200**

SHA-256 uploaded `bdb06789b41f6d5d4e20a1a99d76fe5d218ec8771d976aa07c56249545a5de91`, downloaded `bdb06789b41f6d5d4e20a1a99d76fe5d218ec8771d976aa07c56249545a5de91`.

Done: document 04295517-453e-477d-a372-1efd488db260 is encrypted on disk and downloads unchanged.

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
  "session_id": "db822b8a-9189-472e-97da-e709736c07db",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMTksImlhdCI6MTc5MzM2MjExOSwianRpIjoiOGU0Mzg3OGMtM2Y5ZS00NGU1LTkyZTYtM2MzZWEwMDkwNmFjIiwic2lkIjoiZGI4MjJiOGEtOTE4OS00NzJlLTk3ZGEtZTcwOTczNmMwN2RiIn0._Jyrk3tT6CVl0otkhOJuVMOk0dYVMmTrGWRDi1unHUw",
  "access_expires_at": "2026-10-30T12:23:39.693079939Z",
  "refresh_token": "bz5uOGhgq9lWgY54oJ2A0IpUL4EjxbdmvcoVxEfJ6rc",
  "refresh_expires_at": "2026-10-31T00:08:39.692628253Z",
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
  "command_id": "3f813436-8070-4126-a688-08f5ddb97d26",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T12:08:40.098149Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "cc28c0bd-ceda-4af8-be2a-3ad3a790086e",
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
  "correlation_id": "a36eb46c-999d-4adc-acc8-4dec65724009"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "f6be204b-82cd-45d7-9c0d-d2eb8b3b0555",
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
  "correlation_id": "9ef61ea2-b4ab-4ed7-be91-b6f7dff398b9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636401415",
  "device_ref": "sandbox-15880"
}
```

```json
{
  "challenge_id": "14b56028-4152-4e35-8dad-83c8340a59f9",
  "expires_at": "2026-10-30T12:13:40.706403032Z",
  "resend_available_at": "2026-10-30T12:08:41.706403032Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636401415` → **200**

```json
{
  "phone": "+380636401415",
  "audience": "CLIENT",
  "code": "925890",
  "sent_at": "2026-10-30T12:08:40.709321323Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14b56028-4152-4e35-8dad-83c8340a59f9",
  "code": "925890",
  "device_ref": "sandbox-15880"
}
```

```json
{
  "session_id": "58ca0811-28a3-4944-8c11-b214aa734bb6",
  "subject": {
    "type": "CLIENT",
    "id": "cc6affac-44a2-4741-8f80-e4f665eb6817"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYzZhZmZhYy00NGEyLTQ3NDEtOGY4MC1lNGY2NjVlYjY4MTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDIwLCJpYXQiOjE3OTMzNjIxMjAsImp0aSI6ImVlYjdiZDlmLTYxYjctNDgzYS1hNzYwLTI3MWZhNDQ4MGUzNSIsInNpZCI6IjU4Y2EwODExLTI4YTMtNDk0NC04YzExLWIyMTRhYTczNGJiNiJ9.Si-amt1qVWwNOgL4uyfq0AgYdxBDA0TqEWOI0Y1m8EI",
  "access_expires_at": "2026-10-30T12:23:40.95232386Z",
  "refresh_token": "SIceSGOiNkQp_maWiwoRZQPtBDJL3EJLyQc1TOOoD6o",
  "refresh_expires_at": "2026-11-29T12:08:40.95181993Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "541ca7f0-4f62-4eb4-9807-19231d0a5a75",
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
  "id": "85cdb46a-bc5b-47dc-a4ce-de28b570bfe6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:41.150927Z",
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
  "command_id": "1efca2ac-436d-4c1b-b0cd-22766d5669e2",
  "quote_id": "85cdb46a-bc5b-47dc-a4ce-de28b570bfe6",
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
  "correlation_id": "9ecfd0f1-215f-4a15-ab2d-49b44c8e3599"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "52f76ae1-2fe5-48b1-8ef3-552aa653ea44",
  "quote_id": "85cdb46a-bc5b-47dc-a4ce-de28b570bfe6",
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
  "id": "6ceed85b-e149-4b3e-a14a-bc2e3e4c90eb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cc6affac-44a2-4741-8f80-e4f665eb6817",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:08:41.560543Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6ceed85b-e149-4b3e-a14a-bc2e3e4c90eb/cancel` → **200**

```json
{
  "command_id": "de2bd8cf-4b58-4709-87e2-eca7ab6753a4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6ceed85b-e149-4b3e-a14a-bc2e3e4c90eb",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cc6affac-44a2-4741-8f80-e4f665eb6817",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:08:41.560543Z",
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
  "command_id": "758db3ce-0c0a-4044-a7b8-e6b00c98d6a7",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T12:08:42.00091Z"
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
      "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T12:08:42.00091Z"
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
  "device_ref": "sandbox-4906"
}
```

```json
{
  "challenge_id": "3e5660af-8b9d-4278-88a8-33ca0ec1b049",
  "expires_at": "2026-10-30T12:13:42.656233286Z",
  "resend_available_at": "2026-10-30T12:08:43.656233286Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "847790",
  "sent_at": "2026-10-30T12:08:42.658890023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e5660af-8b9d-4278-88a8-33ca0ec1b049",
  "code": "847790",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "session_id": "9854f44a-e962-499e-ac1b-fd5ce18f375b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzAyMiwiaWF0IjoxNzkzMzYyMTIyLCJqdGkiOiJmMmRiODAyMC01NTg5LTQ0MGMtODY5ZS05ZGI1YWU2YWZjNDciLCJzaWQiOiI5ODU0ZjQ0YS1lOTYyLTQ5OWUtYWMxYi1mZDVjZTE4ZjM3NWIifQ.KsbOaiYzFYKJ0Y1pJe28vO5M7Dx3XEq6w_gqPotfUj0",
  "access_expires_at": "2026-10-30T12:23:42.881537959Z",
  "refresh_token": "5OVDybeLEbGSWHV8KM5qPfkpsbJCzXe-UCiR1iYqZyk",
  "refresh_expires_at": "2026-11-29T12:08:42.881101662Z",
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
  "command_id": "d8db46a1-1314-429a-bf62-b3932ba924fd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:08:43Z",
    "sequence": 1793362123261
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:08:43.277407Z",
  "last_location_at": "2026-10-30T12:08:43.277407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673351602",
  "device_ref": "sandbox-17877"
}
```

```json
{
  "challenge_id": "6be7ab00-b73a-409c-859d-edcc376692be",
  "expires_at": "2026-10-30T12:13:43.479279245Z",
  "resend_available_at": "2026-10-30T12:08:44.479279245Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673351602` → **200**

```json
{
  "phone": "+380673351602",
  "audience": "CLIENT",
  "code": "094256",
  "sent_at": "2026-10-30T12:08:43.481777674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6be7ab00-b73a-409c-859d-edcc376692be",
  "code": "094256",
  "device_ref": "sandbox-17877"
}
```

```json
{
  "session_id": "70dd635e-1e51-4da1-90c4-6d4201ddee0a",
  "subject": {
    "type": "CLIENT",
    "id": "ee0fb6cd-88e9-4030-a76f-16f89861da08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTBmYjZjZC04OGU5LTQwMzAtYTc2Zi0xNmY4OTg2MWRhMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDIzLCJpYXQiOjE3OTMzNjIxMjMsImp0aSI6IjIyZTQxZmFmLWVlNzQtNDYzOC05ZmY5LWZlMjk3OTE3YzZjMiIsInNpZCI6IjcwZGQ2MzVlLTFlNTEtNGRhMS05MGM0LTZkNDIwMWRkZWUwYSJ9.gZoArMHqX_XS7kKhHmueEkR1yczrfWORvDwR5dMGx08",
  "access_expires_at": "2026-10-30T12:23:43.698030447Z",
  "refresh_token": "78XQRjt4o65Xd7kPvvUAgX_ZDcS-UYZIOWPmFFSFaJg",
  "refresh_expires_at": "2026-11-29T12:08:43.697666428Z",
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
  "command_id": "25d54bc0-e1bf-4a7d-a13f-88a60bbbea22",
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
  "id": "5a8f3774-0713-47b9-accc-6f5da456791c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:44.089627Z",
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
  "command_id": "f004a199-c284-4c67-b838-2681cd0aac36",
  "platform": "ANDROID",
  "token": "sandbox-driver-a03572eb-ff34-4a64-9b26-1507e5f4d777"
}
```

```json
{
  "id": "cad959db-2837-422c-9d38-73d675983221",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:08:44.306853Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "3b046382-ff63-49f6-aacb-44eda51a604c",
  "platform": "ANDROID",
  "token": "sandbox-rider-3470af92-e35f-4bfb-a05f-9646f58f70e5"
}
```

```json
{
  "id": "3788323d-1cd0-45b0-8de0-c28ab4de7017",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T12:08:44.502807Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "652340de-ef8c-459a-adf2-5050f2eaf012",
  "quote_id": "5a8f3774-0713-47b9-accc-6f5da456791c",
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
  "id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee0fb6cd-88e9-4030-a76f-16f89861da08",
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
  "created_at": "2026-10-30T12:08:44.718454Z",
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
    "id": "d89b22ac-0eea-48b3-84ff-af4754fa362f",
    "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
    "expires_at": "2026-10-30T12:08:59.720607Z",
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

`POST /api/driver/v1/offers/d89b22ac-0eea-48b3-84ff-af4754fa362f/accept` → **200**

```json
{
  "command_id": "805e5807-b14c-4c71-95b5-71f185921a02"
}
```

```json
{
  "id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6589652c-30cd-4343-9509-e9525ede7233",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T12:08:44.695Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:08:45.109962758Z",
    "token_suffix": "f4d777",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "4cfbb281-6f89-4ef1-93cc-afe06b590897",
      "order_version": "2",
      "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673351602&after=2026-10-30T12:08:44.695Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380673351602&after=2026-10-30T12:08:44.695Z` → **200**

```json
[
  {
    "at": "2026-10-30T12:08:46.115518656Z",
    "token_suffix": "8f70e5",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "e8583d86-73c8-427a-b743-c847177a32dc",
      "order_version": "3",
      "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/7251ae59-aac6-4917-9bca-2c0766126f0c/messages` → **201**

```json
{
  "command_id": "971d6881-eb9e-4ea2-bc8f-61a2eae40ae2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "85a6e13e-df37-4b41-b7e7-0a86d8d8f905",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T12:08:46.423335303Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6589652c-30cd-4343-9509-e9525ede7233",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "assignment_id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
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

`POST /api/driver/v1/trips/6589652c-30cd-4343-9509-e9525ede7233/messages` → **201**

```json
{
  "command_id": "2e4ea54d-4ae0-4018-977a-2e0a1c0b2446",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "24f7ccdd-dc04-4a89-8238-c260503414f0",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T12:08:46.789670013Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/7251ae59-aac6-4917-9bca-2c0766126f0c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6589652c-30cd-4343-9509-e9525ede7233/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673351602"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:08:47Z",
    "sequence": 1793362127358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:08:47.379995Z",
  "last_location_at": "2026-10-30T12:08:47.379995Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6589652c-30cd-4343-9509-e9525ede7233",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "assignment_id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
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

`POST /api/driver/v1/trips/6589652c-30cd-4343-9509-e9525ede7233/arrive` → **200**

```json
{
  "command_id": "839a9fab-b51c-4e22-9c3f-c21cfb109060",
  "expected_version": 0
}
```

```json
{
  "id": "6589652c-30cd-4343-9509-e9525ede7233",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "assignment_id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
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
  "arrived_at": "2026-10-30T12:08:47.765516Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6589652c-30cd-4343-9509-e9525ede7233/start` → **200**

```json
{
  "command_id": "de40271e-39c7-4598-b096-9a0e3f5e6f90",
  "expected_version": 1
}
```

```json
{
  "id": "6589652c-30cd-4343-9509-e9525ede7233",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "assignment_id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
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
  "arrived_at": "2026-10-30T12:08:47.765516Z",
  "started_at": "2026-10-30T12:08:47.975214Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:08:48Z",
    "sequence": 1793362128168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:08:48.185029Z",
  "last_location_at": "2026-10-30T12:08:48.185029Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6589652c-30cd-4343-9509-e9525ede7233/complete` → **200**

```json
{
  "command_id": "33fcbab0-6f81-4904-bb0c-13950c05a71d",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:08:48Z",
  "cash_received": true
}
```

```json
{
  "id": "6589652c-30cd-4343-9509-e9525ede7233",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "assignment_id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
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
  "arrived_at": "2026-10-30T12:08:47.765516Z",
  "started_at": "2026-10-30T12:08:47.975214Z",
  "completed_at": "2026-10-30T12:08:48.387611Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/7251ae59-aac6-4917-9bca-2c0766126f0c` → **200**

```json
{
  "id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ee0fb6cd-88e9-4030-a76f-16f89861da08",
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
    "id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8",
    "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6589652c-30cd-4343-9509-e9525ede7233",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:08:44.718454Z",
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
    "id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:08:44.718454Z",
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
    "id": "6589652c-30cd-4343-9509-e9525ede7233",
    "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
    "order_short_number": 14,
    "created_at": "2026-10-30T12:08:45.129392Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "49133fd6-9d3a-45d5-afac-2272340e9848",
    "order_id": "b7ea6d37-71f8-40f0-8e0c-326f99b2de83",
    "order_short_number": 9,
    "created_at": "2026-10-30T12:07:47.359896Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9ad172c1-6244-4279-8c46-889cbd382095",
    "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
    "order_short_number": 4,
    "created_at": "2026-10-30T12:07:15.198445Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "dfed2a52-3a45-4aa5-b3a4-5e41dad2bc8a",
    "order_id": "ab344b84-6d11-4ecb-965a-98aa6f35bc39",
    "order_short_number": 2,
    "created_at": "2026-10-30T12:06:46.523488Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1241ed9c-a14d-4287-b14b-09dbe551f419",
    "order_id": "6d5e31bb-a9c2-4f97-84ca-9c2a562fc9eb",
    "order_short_number": 1,
    "created_at": "2026-10-30T12:06:40.164207Z",
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

`GET /api/rider/v1/orders/7251ae59-aac6-4917-9bca-2c0766126f0c/tip` → **200**

```json
{
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
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
  "available_until": "2026-10-31T12:08:48.387611Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7251ae59-aac6-4917-9bca-2c0766126f0c/tip` → **201**

```json
{
  "command_id": "0a3e8c6f-1f55-4898-ac5d-926817d433ca",
  "amount_minor": 1100
}
```

```json
{
  "id": "faa2c7d0-b515-456b-9ae3-dc67d7ea0fca",
  "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T12:08:52.825614Z"
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
  "session_id": "95b29513-d4f2-4967-8679-608fb5ba53f6",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMzMsImlhdCI6MTc5MzM2MjEzMywianRpIjoiNjcyZWE2NjctZTkzZS00M2YwLWIyNWUtZWEwZDJkMGYwZGNiIiwic2lkIjoiOTViMjk1MTMtZDRmMi00OTY3LTg2NzktNjA4ZmI1YmE1M2Y2In0.7hEl7ZWEkKSpEP25DkTZ37TcQhoLPW2BGuGZYwccJtc",
  "access_expires_at": "2026-10-30T12:23:53.271431033Z",
  "refresh_token": "jpilIyrd5HMQF-Kxhvu-7KuWNgrHpPefQ4imIEPadiU",
  "refresh_expires_at": "2026-10-31T00:08:53.270639267Z",
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
          "PHONE": 1,
          "APP": 12
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 2
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
      "CASH": 11,
      "CARD": 2
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
  "generated_at": "2026-10-30T12:08:53.462362443Z"
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
  "generated_at": "2026-10-30T12:08:53.656270538Z"
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
  "session_id": "eb0b42ca-f5b2-4e93-bcdc-044243622dc5",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMzQsImlhdCI6MTc5MzM2MjEzNCwianRpIjoiNWFhYjgyMzAtYWJiMC00OGUxLWI1M2EtNjAzNjBkYzNlYWRlIiwic2lkIjoiZWIwYjQyY2EtZjViMi00ZTkzLWJjZGMtMDQ0MjQzNjIyZGM1In0.nM5DYDLNiNrJxu_p9N5BdKptnT-4DJvKrQsFSLbMtjI",
  "access_expires_at": "2026-10-30T12:23:54.061831354Z",
  "refresh_token": "hsIwwHC0Zf3GICjkxV3GDUKpdLP183ch0KiHLBlyraw",
  "refresh_expires_at": "2026-10-31T00:08:54.061445882Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7251ae59-aac6-4917-9bca-2c0766126f0c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:08:44.718894Z",
      "actor": {
        "type": "CLIENT",
        "id": "ee0fb6cd-88e9-4030-a76f-16f89861da08",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
        "quote_id": "5a8f3774-0713-47b9-accc-6f5da456791c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c0ba5f24-5877-4d8c-adf8-1ab1ce5c4a73"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:08:44.720152Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
        "attempt_id": "ccdd35a8-0303-4855-bfbd-53d11a9e2771",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c0ba5f24-5877-4d8c-adf8-1ab1ce5c4a73"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:08:44.724931Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d89b22ac-0eea-48b3-84ff-af4754fa362f",
        "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c0ba5f24-5877-4d8c-adf8-1ab1ce5c4a73"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:08:45.130518Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d89b22ac-0eea-48b3-84ff-af4754fa362f",
        "order_id": "7251ae59-aac6-4917-9bca-2c0766126f0c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "76bbb93d-75b3-47b6-881d-a4a54b55f3a8"
      },
      "correlation_id": "b64e6a77-c4e2-4bff-b634-147cda3c7b04"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T12:08:54.526985233Z",
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
      "last_location_at": "2026-10-30T12:08:48.185029Z",
      "order_id": null
    }
  ]
}
```

Done: order 7251ae59-aac6-4917-9bca-2c0766126f0c.

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
  "session_id": "11b407d2-d2ea-4bdc-a418-4f05f1b14ce7",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMzQsImlhdCI6MTc5MzM2MjEzNCwianRpIjoiYWM5MWU0MGEtMDdlMS00YTU2LWE0MWMtOWZjZTVjYTg1OGI5Iiwic2lkIjoiMTFiNDA3ZDItZDJlYS00YmRjLWE0MTgtNGYwNWYxYjE0Y2U3In0.I5BZfSKPY6lcvXO8DtCi3fbMI44uQZRAVxjVRW4-geY",
  "access_expires_at": "2026-10-30T12:23:54.96214037Z",
  "refresh_token": "K7D4oo8YDeTx-X7RGntISdmvc9bpLkNT4RecePjdON4",
  "refresh_expires_at": "2026-10-31T00:08:54.961609038Z",
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
  "command_id": "fb907782-2baa-47c2-85b8-0dc99807521e",
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
  "timestamp": "2026-10-30T12:08:55.000+0000",
  "channel": {
    "id": "1730052000.2118513990",
    "linkedid": "1730052000.2118513990",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670816205"
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
  "timestamp": "2026-10-30T12:08:55.000+0000",
  "channel": {
    "id": "1730052000.2118513990",
    "linkedid": "1730052000.2118513990",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670816205"
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
  "session_id": "1d150781-0ed2-4ff4-9f71-140f331e0947",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwMzUsImlhdCI6MTc5MzM2MjEzNSwianRpIjoiMWRkYzhhNTktNGQxNS00MDc2LTk2MWQtODY3MGEwOTAyMjU5Iiwic2lkIjoiMWQxNTA3ODEtMGVkMi00ZmY0LTlmNzEtMTQwZjMzMWUwOTQ3In0.poTRGfd84l5U0BqiW8H7A9EV-IqInGVsR7HMhVH0Erc",
  "access_expires_at": "2026-10-30T12:23:55.802740889Z",
  "refresh_token": "zCH2JZmcEtveIi8Mj8DL_8zdQyTrVNjodphjgG28kqE",
  "refresh_expires_at": "2026-10-31T00:08:55.80231637Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "b44f262f-a1d4-4296-abec-29010eb62996",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670816205",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T12:08:55Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/b44f262f-a1d4-4296-abec-29010eb62996/answer` → **200**

```json
{
  "command_id": "adbcbedb-093b-4fda-a3a4-59be3b214d7b"
}
```

```json
{
  "id": "b44f262f-a1d4-4296-abec-29010eb62996",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670816205",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "order_ids": [],
  "started_at": "2026-10-30T12:08:55Z",
  "answered_at": "2026-10-30T12:08:56.196792Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2118513990",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "66a0116c-1a51-44e7-affe-96d35e7f2c3a",
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
  "id": "75e0ea83-7cb6-4a21-b38d-4743d2f4a0db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:56.419551Z",
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
  "command_id": "fe37ab3b-9b1f-4e5a-ad0c-7189f41afe83",
  "quote_id": "75e0ea83-7cb6-4a21-b38d-4743d2f4a0db",
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
    "phone": "+380670816205"
  },
  "call_id": "b44f262f-a1d4-4296-abec-29010eb62996"
}
```

```json
{
  "id": "4ce79a70-bed0-4aa2-b807-3ca7a2030795",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:08:56.628387Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670816205"
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
    "id": "1730052000.2118513990",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b44f262f-a1d4-4296-abec-29010eb62996",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670816205",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [
        "4ce79a70-bed0-4aa2-b807-3ca7a2030795"
      ],
      "started_at": "2026-10-30T12:08:55Z",
      "answered_at": "2026-10-30T12:08:56.196792Z",
      "ended_at": "2026-10-30T12:08:56.8452Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7598b049-3ecd-41d4-af70-2c0145ecbf18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674538340",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [],
      "started_at": "2026-10-30T12:07:05.619612Z",
      "answered_at": "2026-10-30T12:07:05.843664Z",
      "ended_at": "2026-10-30T12:07:06.057342Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:07:10.665742Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/4ce79a70-bed0-4aa2-b807-3ca7a2030795` → **200**

```json
{
  "id": "4ce79a70-bed0-4aa2-b807-3ca7a2030795",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:08:56.628387Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670816205"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/4ce79a70-bed0-4aa2-b807-3ca7a2030795` → **200**

```json
{
  "id": "4ce79a70-bed0-4aa2-b807-3ca7a2030795",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:08:56.628387Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670816205"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4ce79a70-bed0-4aa2-b807-3ca7a2030795/cancel` → **200**

```json
{
  "command_id": "196f2a16-d28e-4112-9712-10195de1fcee",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4ce79a70-bed0-4aa2-b807-3ca7a2030795",
  "short_number": 15,
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
  "created_at": "2026-10-30T12:08:56.628387Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670816205"
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

Done: call b44f262f-a1d4-4296-abec-29010eb62996 with order 4ce79a70-bed0-4aa2-b807-3ca7a2030795.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27711"
}
```

```json
{
  "challenge_id": "6eed41c6-7b3d-44b9-acba-1d4e8573e80e",
  "expires_at": "2026-10-30T12:13:57.713033872Z",
  "resend_available_at": "2026-10-30T12:08:58.713033872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "557010",
  "sent_at": "2026-10-30T12:08:57.715976476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eed41c6-7b3d-44b9-acba-1d4e8573e80e",
  "code": "557010",
  "device_ref": "sandbox-27711"
}
```

```json
{
  "session_id": "bba9010e-090d-4757-8582-410778c0965f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzAzNywiaWF0IjoxNzkzMzYyMTM3LCJqdGkiOiJiNjQxMjRkZC02NTVhLTQ0ZTMtYjQ2Mi05M2RmNWY5ZjBlYzgiLCJzaWQiOiJiYmE5MDEwZS0wOTBkLTQ3NTctODU4Mi00MTA3NzhjMDk2NWYifQ.HKscU_yzJxiWTGDCLov06pa0LBNkvW0fToNR-Xp_c7M",
  "access_expires_at": "2026-10-30T12:23:57.939502371Z",
  "refresh_token": "n08hcd1oIemjdHI3tjANLdiPcUYv3cilomoiDSgyZQ4",
  "refresh_expires_at": "2026-11-29T12:08:57.938935325Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:08:48.185029Z",
  "last_location_at": "2026-10-30T12:08:48.185029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/handover` → **200**

```json
{
  "command_id": "df011cc2-3c57-4c24-8519-7d2c51f54644",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:08:48.185029Z",
  "last_location_at": "2026-10-30T12:08:48.185029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:08:58Z",
    "sequence": 1793362138552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:08:58.568857Z",
  "last_location_at": "2026-10-30T12:08:58.568857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663284124",
  "device_ref": "sandbox-28934"
}
```

```json
{
  "challenge_id": "f23602b8-8a1f-4e51-97bb-ca966dddb454",
  "expires_at": "2026-10-30T12:13:58.760678647Z",
  "resend_available_at": "2026-10-30T12:08:59.760678647Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663284124` → **200**

```json
{
  "phone": "+380663284124",
  "audience": "CLIENT",
  "code": "392365",
  "sent_at": "2026-10-30T12:08:58.762665905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f23602b8-8a1f-4e51-97bb-ca966dddb454",
  "code": "392365",
  "device_ref": "sandbox-28934"
}
```

```json
{
  "session_id": "6ce672a5-51ed-4817-a81c-876305c49e05",
  "subject": {
    "type": "CLIENT",
    "id": "e4bf5819-6f98-4983-b30a-161c58ca3043"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGJmNTgxOS02Zjk4LTQ5ODMtYjMwYS0xNjFjNThjYTMwNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDM4LCJpYXQiOjE3OTMzNjIxMzgsImp0aSI6ImZmNzAyN2NhLWM0ZDUtNDM4Zi04ZWFlLWNlMjRmYjMyZWEyMSIsInNpZCI6IjZjZTY3MmE1LTUxZWQtNDgxNy1hODFjLTg3NjMwNWM0OWUwNSJ9.1aU-TX2gbbC0cRvFliNN0P0TOQTGbmFs87MBCnPIiQM",
  "access_expires_at": "2026-10-30T12:23:58.98621591Z",
  "refresh_token": "xs66_hpFYkrnZn9Nkz2Ld2k62xuT3BQZ6D4ajvZTpy4",
  "refresh_expires_at": "2026-11-29T12:08:58.985833173Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "874b2ef8-c0e2-45d4-8ed0-3e2e1b8cef5d",
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
  "id": "9e6ad01e-fd68-42ad-92f1-473af7b0701f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:13:59.187879Z",
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
  "command_id": "3c02bfb9-3694-4cc4-b0eb-5c6ff0c6000d",
  "quote_id": "9e6ad01e-fd68-42ad-92f1-473af7b0701f",
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
  "id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4bf5819-6f98-4983-b30a-161c58ca3043",
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
  "created_at": "2026-10-30T12:08:59.389188Z",
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
    "id": "ec16a787-e809-473a-8f60-20ac4d4a61ad",
    "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
    "expires_at": "2026-10-30T12:09:14.391491Z",
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

`POST /api/driver/v1/offers/ec16a787-e809-473a-8f60-20ac4d4a61ad/accept` → **200**

```json
{
  "command_id": "1a8152f3-73d4-44a2-9fc7-211f02ca0871"
}
```

```json
{
  "id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2",
  "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7",
  "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
  "assignment_id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2",
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

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:00Z",
    "sequence": 1793362140198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:09:00.215497Z",
  "last_location_at": "2026-10-30T12:09:00.215497Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7/arrive` → **200**

```json
{
  "command_id": "a4e667be-cfb6-48e2-8c3c-bdb2f1612ff2",
  "expected_version": 0
}
```

```json
{
  "id": "a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7",
  "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
  "assignment_id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2",
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
  "arrived_at": "2026-10-30T12:09:00.422868Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7/start` → **200**

```json
{
  "command_id": "68f29dca-27d4-4332-b029-04d8c1a7b53c",
  "expected_version": 1
}
```

```json
{
  "id": "a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7",
  "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
  "assignment_id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2",
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
  "arrived_at": "2026-10-30T12:09:00.422868Z",
  "started_at": "2026-10-30T12:09:00.632813Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:00Z",
    "sequence": 1793362140833
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:09:00.849004Z",
  "last_location_at": "2026-10-30T12:09:00.849004Z",
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
  "device_ref": "sandbox-12307"
}
```

```json
{
  "challenge_id": "6fc7240d-3000-4a2c-8495-6d9a73f5d473",
  "expires_at": "2026-10-30T12:14:01.047871015Z",
  "resend_available_at": "2026-10-30T12:09:02.047871015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "822699",
  "sent_at": "2026-10-30T12:09:01.049851838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fc7240d-3000-4a2c-8495-6d9a73f5d473",
  "code": "822699",
  "device_ref": "sandbox-12307"
}
```

```json
{
  "session_id": "449c3c4d-2162-4cad-afc4-6984f32cbb8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzA0MSwiaWF0IjoxNzkzMzYyMTQxLCJqdGkiOiJlNWE1YTc1OC1kZTFhLTQyYzgtOTQ4MS0yYWM5OTNhZjEzNDQiLCJzaWQiOiI0NDljM2M0ZC0yMTYyLTRjYWQtYWZjNC02OTg0ZjMyY2JiOGQifQ.ChVv8fBqOES468CUjwe_nLnIpazB8AywJdira9VFC5Q",
  "access_expires_at": "2026-10-30T12:24:01.292538372Z",
  "refresh_token": "_ieWfzhncI4yjoh9NESDszj_A_zPpS1AABbCjhIfLEI",
  "refresh_expires_at": "2026-11-29T12:09:01.292035503Z",
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
  "command_id": "b5b1f9ae-f056-4e26-8581-5bbfcb7b3c6d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:01Z",
    "sequence": 1793362141690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d3a0390a-9c37-4799-b332-aab951b1ca13",
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
  "last_heartbeat_at": "2026-10-30T12:09:01.707289Z",
  "last_location_at": "2026-10-30T12:09:01.707289Z",
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
  "session_id": "d9425086-b7e5-406b-b1ea-381eb7586a1d",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNDIsImlhdCI6MTc5MzM2MjE0MiwianRpIjoiMzIyYzg4YzYtYWMyYS00ZmVhLWI5Y2ItZmRiMzE3ODk3M2Y0Iiwic2lkIjoiZDk0MjUwODYtYjdlNS00MDZiLWIxZWEtMzgxZWI3NTg2YTFkIn0.Z1h6FBuMxmMaHER2nw9aRHFuiCwZRrnOs8vMYtcOshI",
  "access_expires_at": "2026-10-30T12:24:02.106760699Z",
  "refresh_token": "G48IHtIdPL0fxn3JTd0CEqLuitcge-E0uaENjYaeyfM",
  "refresh_expires_at": "2026-10-31T00:09:02.106296558Z",
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
  "session_id": "67c5023c-1bed-49bc-a7bc-fd9540c0791e",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNDIsImlhdCI6MTc5MzM2MjE0MiwianRpIjoiNTcxYWRiZTYtYTRlYi00ZTM3LThhMWQtM2M3M2YyOTNlYTk2Iiwic2lkIjoiNjdjNTAyM2MtMWJlZC00OWJjLWE3YmMtZmQ5NTQwYzA3OTFlIn0.EVU0gaS2IfdD2F39ZC25ZsGSfjkrsR36CgUTU-vQEAA",
  "access_expires_at": "2026-10-30T12:24:02.50514391Z",
  "refresh_token": "gw1UpsYc_HnzfB6RhIxqzu74Fnj1pY93oYisDJWqbv8",
  "refresh_expires_at": "2026-10-31T00:09:02.504768303Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a0a1231b-f2b8-4c25-ac1b-2074265de2e3` → **200**

```json
{
  "id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e4bf5819-6f98-4983-b30a-161c58ca3043",
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
    "id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2",
    "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T12:08:59.389188Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a0a1231b-f2b8-4c25-ac1b-2074265de2e3/interrupt` → **200**

```json
{
  "command_id": "b53084f6-a7d3-4464-a0ff-58b951867fb5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "e4bf5819-6f98-4983-b30a-161c58ca3043",
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
      "id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2",
      "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a81ee9d1-7e64-4a48-8a6a-9c3b59b808c7",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T12:08:59.389188Z",
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
    "id": "37e17809-5b54-471c-b820-5747d3ed762d",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "e4bf5819-6f98-4983-b30a-161c58ca3043",
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
    "id": "88525e13-b514-4820-8f00-be1c73bcdc63",
    "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
    "expires_at": "2026-10-30T12:09:17.922971Z",
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

`POST /api/driver/v1/offers/88525e13-b514-4820-8f00-be1c73bcdc63/accept` → **200**

```json
{
  "command_id": "e1a4ea3a-4fd4-4b3a-a65f-0c64c9aa3295"
}
```

```json
{
  "id": "c8c29ab7-9471-4d28-9206-bca3374a5c5c",
  "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e64e1f9-bdc8-407d-8a43-8ddd0447d57d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e64e1f9-bdc8-407d-8a43-8ddd0447d57d",
  "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
  "assignment_id": "c8c29ab7-9471-4d28-9206-bca3374a5c5c",
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
  "session_id": "d3a0390a-9c37-4799-b332-aab951b1ca13",
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
  "last_heartbeat_at": "2026-10-30T12:09:01.707289Z",
  "last_location_at": "2026-10-30T12:09:01.707289Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d3a0390a-9c37-4799-b332-aab951b1ca13/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:03Z",
    "sequence": 1793362143895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d3a0390a-9c37-4799-b332-aab951b1ca13",
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
  "last_heartbeat_at": "2026-10-30T12:09:03.911403Z",
  "last_location_at": "2026-10-30T12:09:03.911403Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4e64e1f9-bdc8-407d-8a43-8ddd0447d57d/arrive` → **200**

```json
{
  "command_id": "3fe376d7-c7ae-41b2-a8ba-791784502268",
  "expected_version": 0
}
```

```json
{
  "id": "4e64e1f9-bdc8-407d-8a43-8ddd0447d57d",
  "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
  "assignment_id": "c8c29ab7-9471-4d28-9206-bca3374a5c5c",
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
  "arrived_at": "2026-10-30T12:09:04.118112Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e64e1f9-bdc8-407d-8a43-8ddd0447d57d/start` → **200**

```json
{
  "command_id": "9b04dde8-2cda-48b0-9e25-8df39de5ddfc",
  "expected_version": 1
}
```

```json
{
  "id": "4e64e1f9-bdc8-407d-8a43-8ddd0447d57d",
  "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
  "assignment_id": "c8c29ab7-9471-4d28-9206-bca3374a5c5c",
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
  "arrived_at": "2026-10-30T12:09:04.118112Z",
  "started_at": "2026-10-30T12:09:04.32597Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e64e1f9-bdc8-407d-8a43-8ddd0447d57d/complete` → **200**

```json
{
  "command_id": "7c9ea9c1-1f29-4518-a03a-d8d4ea945843",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:09:04Z"
}
```

```json
{
  "id": "4e64e1f9-bdc8-407d-8a43-8ddd0447d57d",
  "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
  "assignment_id": "c8c29ab7-9471-4d28-9206-bca3374a5c5c",
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
  "arrived_at": "2026-10-30T12:09:04.118112Z",
  "started_at": "2026-10-30T12:09:04.32597Z",
  "completed_at": "2026-10-30T12:09:04.53579Z",
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
    "id": "37e17809-5b54-471c-b820-5747d3ed762d",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T12:09:02.915874Z",
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
    "id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T12:08:59.389188Z",
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

`GET /api/operator/v1/orders/a0a1231b-f2b8-4c25-ac1b-2074265de2e3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T12:08:59.389661Z",
      "actor": {
        "type": "CLIENT",
        "id": "e4bf5819-6f98-4983-b30a-161c58ca3043",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
        "quote_id": "9e6ad01e-fd68-42ad-92f1-473af7b0701f",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "5225d306-23ef-4e8f-8ea9-50710b3b3cd9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T12:08:59.390988Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
        "attempt_id": "7d6d86dc-b996-4c74-849d-672dbd0f5611",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5225d306-23ef-4e8f-8ea9-50710b3b3cd9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T12:08:59.395479Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ec16a787-e809-473a-8f60-20ac4d4a61ad",
        "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "5225d306-23ef-4e8f-8ea9-50710b3b3cd9"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T12:08:59.801188Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ec16a787-e809-473a-8f60-20ac4d4a61ad",
        "order_id": "a0a1231b-f2b8-4c25-ac1b-2074265de2e3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d8b4f81d-5c09-4d57-9ed4-c8fdb48da4b2"
      },
      "correlation_id": "2ca0d543-2f11-4ef5-8fa3-62233376e308"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/37e17809-5b54-471c-b820-5747d3ed762d/tip` → **200**

```json
{
  "order_id": "37e17809-5b54-471c-b820-5747d3ed762d",
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
  "available_until": "2026-10-31T12:09:04.53579Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/37e17809-5b54-471c-b820-5747d3ed762d/tip` → **409**

```json
{
  "command_id": "3026e16e-d8d8-41e0-9034-24f1207e1414",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/37e17809-5b54-471c-b820-5747d3ed762d/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a8b57bb8-b06a-45e1-84dd-31bfdc4dd747"
}
```

Done: interrupted a0a1231b-f2b8-4c25-ac1b-2074265de2e3, follow-up 37e17809-5b54-471c-b820-5747d3ed762d.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d8ffbe5c-98b3-47d2-80db-4d80262ca0ef",
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
  "last_heartbeat_at": "2026-10-30T12:09:00.849004Z",
  "last_location_at": "2026-10-30T12:09:00.849004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d8ffbe5c-98b3-47d2-80db-4d80262ca0ef/close` → **200**

```json
{
  "command_id": "b9877007-399d-430b-b6a3-66adeb792937",
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
  "session_id": "d3a0390a-9c37-4799-b332-aab951b1ca13",
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
  "last_heartbeat_at": "2026-10-30T12:09:03.911403Z",
  "last_location_at": "2026-10-30T12:09:03.911403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d3a0390a-9c37-4799-b332-aab951b1ca13/close` → **200**

```json
{
  "command_id": "c085e558-8cb1-4b69-87c6-7480e7a650fa",
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
  "session_id": "57fc957c-73c9-4708-9983-77b97c79c4ee",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNDksImlhdCI6MTc5MzM2MjE0OSwianRpIjoiN2IxNDJiZmEtNjM4Mi00OGY1LWE3Y2ItYjlmYWMyMDhjOWI1Iiwic2lkIjoiNTdmYzk1N2MtNzNjOS00NzA4LTk5ODMtNzdiOTdjNzljNGVlIn0.ON-1CcYNXoNdkBFEnhAFwpjIM-zPAsBizTwPg1wKH_g",
  "access_expires_at": "2026-10-30T12:24:09.782256634Z",
  "refresh_token": "uYQLSUFYADHAm19QNSl3ylIIzZuuihwNl_XlPfa2SAU",
  "refresh_expires_at": "2026-10-31T00:09:09.781695978Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "4f604d0f-45a2-44c6-80d8-c4657735bc14",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:09:09Z"
}
```

```json
{
  "id": "649493a6-6eaa-49ed-bd1f-5565593d19a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:09:09Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/649493a6-6eaa-49ed-bd1f-5565593d19a3/publish` → **200**

```json
{
  "command_id": "47052d54-6213-487a-bce7-080e3d24dc9c",
  "expected_version": 0
}
```

```json
{
  "id": "649493a6-6eaa-49ed-bd1f-5565593d19a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:09:10.197384Z",
  "published_at": "2026-10-30T12:09:10.197384Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "649493a6-6eaa-49ed-bd1f-5565593d19a3",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T12:09:10.197384Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634929495",
  "device_ref": "sandbox-11786"
}
```

```json
{
  "challenge_id": "3cca0e28-2f9f-4afc-a2f2-ff59cab128d4",
  "expires_at": "2026-10-30T12:14:10.592044856Z",
  "resend_available_at": "2026-10-30T12:09:11.592044856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634929495` → **200**

```json
{
  "phone": "+380634929495",
  "audience": "CLIENT",
  "code": "084873",
  "sent_at": "2026-10-30T12:09:10.594282113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3cca0e28-2f9f-4afc-a2f2-ff59cab128d4",
  "code": "084873",
  "device_ref": "sandbox-11786"
}
```

```json
{
  "session_id": "788b4706-c816-4cd5-98c5-5e3365e0c4f7",
  "subject": {
    "type": "CLIENT",
    "id": "47f86375-0d72-4846-99f5-ba34867637a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0N2Y4NjM3NS0wZDcyLTQ4NDYtOTlmNS1iYTM0ODY3NjM3YTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDUwLCJpYXQiOjE3OTMzNjIxNTAsImp0aSI6Ijk5Y2MzNGQ3LWU0NjctNGM2NC1iMzU3LWZiMDFkZjQ5NjljOCIsInNpZCI6Ijc4OGI0NzA2LWM4MTYtNGNkNS05OGM1LTVlMzM2NWUwYzRmNyJ9.VDXiYdjyobtG9dpDcS4LooXdHWwxMQ_h506RtImN45E",
  "access_expires_at": "2026-10-30T12:24:10.815963092Z",
  "refresh_token": "8Bzs_-C5DQNjUZRKw2urcKdDx-IYyj0g9ratAB3pchU",
  "refresh_expires_at": "2026-11-29T12:09:10.815531921Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "649493a6-6eaa-49ed-bd1f-5565593d19a3",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T12:09:10.197384Z",
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
  "command_id": "96a8241d-b8f7-4ebf-8620-db1003c4228a",
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
  "id": "054775fc-a83e-45a6-b538-4f42b9ba5c9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:11.232769Z",
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
  "command_id": "3d45d132-1b47-47ca-8210-4d69238c31b7",
  "quote_id": "054775fc-a83e-45a6-b538-4f42b9ba5c9e",
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
  "correlation_id": "c54c4fee-3570-44af-8712-04999b1f714f"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "8778f214-2ac1-468c-9acf-4f997262e8df",
  "version_id": "649493a6-6eaa-49ed-bd1f-5565593d19a3",
  "language": "uk"
}
```

```json
{
  "version_id": "649493a6-6eaa-49ed-bd1f-5565593d19a3",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T12:09:11.649976Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff7012b2-53e0-4373-8393-32c0ca89ae1d",
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
  "id": "934be00b-8c81-4f35-a3de-ca87aabb5d23",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:11.842943Z",
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
  "command_id": "1885dd68-6fb4-4317-8810-c585076fea4f",
  "quote_id": "934be00b-8c81-4f35-a3de-ca87aabb5d23",
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
  "id": "fb7329da-c906-4f3c-ad25-34a010a290df",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47f86375-0d72-4846-99f5-ba34867637a5",
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
  "created_at": "2026-10-30T12:09:12.048716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fb7329da-c906-4f3c-ad25-34a010a290df` → **200**

```json
{
  "id": "fb7329da-c906-4f3c-ad25-34a010a290df",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47f86375-0d72-4846-99f5-ba34867637a5",
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
  "created_at": "2026-10-30T12:09:12.048716Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fb7329da-c906-4f3c-ad25-34a010a290df/cancel` → **200**

```json
{
  "command_id": "8f556a05-23b1-4d0d-bb97-673cb4f5533b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fb7329da-c906-4f3c-ad25-34a010a290df",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "47f86375-0d72-4846-99f5-ba34867637a5",
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
  "created_at": "2026-10-30T12:09:12.048716Z",
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

`POST /api/admin/v1/legal-documents/649493a6-6eaa-49ed-bd1f-5565593d19a3` → **409**

```json
{
  "command_id": "e36149a8-ccc5-449f-b2a5-c4dc3ea720b0",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T12:09:12Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/649493a6-6eaa-49ed-bd1f-5565593d19a3",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f73132a8-7080-4b78-bb86-e93d66dc3e9c"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5c613c14-84a4-4f2d-83c5-55cc6c4b263a",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:09:12Z"
}
```

```json
{
  "id": "3bf70f68-7cb2-4c22-92f8-22a1b729a917",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:09:12Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3bf70f68-7cb2-4c22-92f8-22a1b729a917/publish` → **200**

```json
{
  "command_id": "de13c768-df43-4126-9990-85dfae879996",
  "expected_version": 0
}
```

```json
{
  "id": "3bf70f68-7cb2-4c22-92f8-22a1b729a917",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T12:09:13.099251Z",
  "published_at": "2026-10-30T12:09:13.099251Z",
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
  "device_ref": "sandbox-19505"
}
```

```json
{
  "challenge_id": "f5d550e7-8be9-409b-af9b-6c32117e5cd2",
  "expires_at": "2026-10-30T12:14:13.308398188Z",
  "resend_available_at": "2026-10-30T12:09:14.308398188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "669831",
  "sent_at": "2026-10-30T12:09:13.311249171Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5d550e7-8be9-409b-af9b-6c32117e5cd2",
  "code": "669831",
  "device_ref": "sandbox-19505"
}
```

```json
{
  "session_id": "4a74ecb6-c903-438e-a3d8-909041011be5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzA1MywiaWF0IjoxNzkzMzYyMTUzLCJqdGkiOiIxMDU1NDFiNC0wMDY4LTRjNjQtOGE2NS04MTU1YjNiODg0OTgiLCJzaWQiOiI0YTc0ZWNiNi1jOTAzLTQzOGUtYTNkOC05MDkwNDEwMTFiZTUifQ.NXo7S_TrNx3TkLrgoVmYlM02NAukpnI2rhvSBkae-lA",
  "access_expires_at": "2026-10-30T12:24:13.525924846Z",
  "refresh_token": "0KPVcTstnLlkywmp_gTtM4HN5eroUfrOK4KuGjF_ZwU",
  "refresh_expires_at": "2026-11-29T12:09:13.52555213Z",
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
  "command_id": "2513c0c4-ad91-46c3-b614-349180b4c1d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:13Z",
    "sequence": 1793362153913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "017f29b7-b747-442f-9ca6-0f585b1b4ff8",
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
  "last_heartbeat_at": "2026-10-30T12:09:13.929986Z",
  "last_location_at": "2026-10-30T12:09:13.929986Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673592221",
  "device_ref": "sandbox-17496"
}
```

```json
{
  "challenge_id": "20764402-c103-4f91-b5a7-2436d22d28f6",
  "expires_at": "2026-10-30T12:14:14.148161536Z",
  "resend_available_at": "2026-10-30T12:09:15.148161536Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673592221` → **200**

```json
{
  "phone": "+380673592221",
  "audience": "CLIENT",
  "code": "862297",
  "sent_at": "2026-10-30T12:09:14.151592608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20764402-c103-4f91-b5a7-2436d22d28f6",
  "code": "862297",
  "device_ref": "sandbox-17496"
}
```

```json
{
  "session_id": "d47b6ba3-7511-4d31-8ec9-aeb6383eef6f",
  "subject": {
    "type": "CLIENT",
    "id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjg2N2I2ZS1mOWRjLTRhZWItYmQ2Yy1kYmFiZGE3YTM4Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDU0LCJpYXQiOjE3OTMzNjIxNTQsImp0aSI6ImI4Zjk2OWJmLTczOWUtNDkwOS1hZDExLTkzOGEzMWIxZDQ1MCIsInNpZCI6ImQ0N2I2YmEzLTc1MTEtNGQzMS04ZWM5LWFlYjYzODNlZWY2ZiJ9.MknSh7-C9Oy3KEEO7_k5rSgp58vf73DeRt-M0oXDBR4",
  "access_expires_at": "2026-10-30T12:24:14.37360478Z",
  "refresh_token": "dnHKK3VfiIWIcYEJwsbT0ZNukBY5hXErvlEU4QAp8pc",
  "refresh_expires_at": "2026-11-29T12:09:14.37300715Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "445876a3-f6c2-4dab-aecb-a1d26eb45568",
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
  "id": "10854717-59dc-491d-b7d7-eaebd1bfb347",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:14.576503Z",
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
  "command_id": "27735095-318d-46b7-aab7-9e76acbae082",
  "quote_id": "10854717-59dc-491d-b7d7-eaebd1bfb347",
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
    "phone": "+380676535644"
  }
}
```

```json
{
  "id": "fb518003-273e-4e64-ae32-6d5ae745f761",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:09:14.790897Z",
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
    "id": "464eab98-e949-46cc-9263-5ea9c6156a41",
    "order_id": "fb518003-273e-4e64-ae32-6d5ae745f761",
    "expires_at": "2026-10-30T12:09:29.793848Z",
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

`POST /api/driver/v1/offers/464eab98-e949-46cc-9263-5ea9c6156a41/accept` → **200**

```json
{
  "command_id": "7af01bee-34d6-4beb-adbd-b39aac361300"
}
```

```json
{
  "id": "d0bd5a5b-4e98-49ab-b391-7a9414ab5976",
  "order_id": "fb518003-273e-4e64-ae32-6d5ae745f761",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c22ff29-7ba7-4c15-adf1-c344f615f4de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c22ff29-7ba7-4c15-adf1-c344f615f4de",
  "order_id": "fb518003-273e-4e64-ae32-6d5ae745f761",
  "assignment_id": "d0bd5a5b-4e98-49ab-b391-7a9414ab5976",
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
    "phone": "+380676535644"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "966e1c1c-31dd-41af-b0a1-fd43174b9e3d",
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
  "id": "7cdfa5ea-e4af-4b82-8e6f-0ed1e21c385e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:15.613097Z",
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
  "command_id": "bb37bb41-008b-4d78-ade5-a4710199be10",
  "quote_id": "7cdfa5ea-e4af-4b82-8e6f-0ed1e21c385e",
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
  "id": "bdb6dc26-e076-4d7b-a427-3e6f016bec96",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:09:15.830778Z",
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
  "command_id": "3c2f5bec-382a-4880-9106-2471f06dfcf0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T15:09:16Z"
}
```

```json
{
  "id": "30bbda34-e07d-43be-a758-34c221c08e06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:16.053976Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:09:16Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "360eb7ed-c3f3-4ffc-8199-0fb3f0dd41a1",
  "quote_id": "30bbda34-e07d-43be-a758-34c221c08e06",
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
  "pickup_at": "2026-10-30T15:09:16Z"
}
```

```json
{
  "id": "46e610ef-0eff-44b7-89c0-8f15b4ffc88c",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:09:16.260557Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:09:16Z",
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
  "command_id": "e7d883be-69a7-4e2f-b98b-b9d2d0422aea",
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
  "id": "e6160666-503c-4bd7-adce-0f8b76e350bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:16.473112Z",
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
  "command_id": "ae0b9328-e6a8-429f-9e8b-4ccad9fd3622",
  "quote_id": "e6160666-503c-4bd7-adce-0f8b76e350bb",
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
  "correlation_id": "576b48e6-f1f1-47ad-8ba6-a5c59059d67f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "46e610ef-0eff-44b7-89c0-8f15b4ffc88c",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T12:09:16.260557Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T15:09:16Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bdb6dc26-e076-4d7b-a427-3e6f016bec96",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T12:09:15.830778Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "fb518003-273e-4e64-ae32-6d5ae745f761",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "bdb6dc26-e076-4d7b-a427-3e6f016bec96",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:09:15.830778Z",
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

`GET /api/rider/v1/orders/fb518003-273e-4e64-ae32-6d5ae745f761` → **200**

```json
{
  "id": "fb518003-273e-4e64-ae32-6d5ae745f761",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d0bd5a5b-4e98-49ab-b391-7a9414ab5976",
    "order_id": "fb518003-273e-4e64-ae32-6d5ae745f761",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4c22ff29-7ba7-4c15-adf1-c344f615f4de",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T12:09:14.790897Z",
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
    "location_at": "2026-10-30T12:09:13.929986Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/fb518003-273e-4e64-ae32-6d5ae745f761/cancel` → **200**

```json
{
  "command_id": "81c35c49-66b8-47d4-b70d-27c3a98970cf",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fb518003-273e-4e64-ae32-6d5ae745f761",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d0bd5a5b-4e98-49ab-b391-7a9414ab5976",
    "order_id": "fb518003-273e-4e64-ae32-6d5ae745f761",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4c22ff29-7ba7-4c15-adf1-c344f615f4de",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T12:09:14.790897Z",
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

`GET /api/rider/v1/orders/bdb6dc26-e076-4d7b-a427-3e6f016bec96` → **200**

```json
{
  "id": "bdb6dc26-e076-4d7b-a427-3e6f016bec96",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:09:15.830778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bdb6dc26-e076-4d7b-a427-3e6f016bec96/cancel` → **200**

```json
{
  "command_id": "52370286-7145-438b-8354-7d7145236336",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bdb6dc26-e076-4d7b-a427-3e6f016bec96",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:09:15.830778Z",
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

`GET /api/rider/v1/orders/46e610ef-0eff-44b7-89c0-8f15b4ffc88c` → **200**

```json
{
  "id": "46e610ef-0eff-44b7-89c0-8f15b4ffc88c",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:09:16.260557Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:09:16Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/46e610ef-0eff-44b7-89c0-8f15b4ffc88c/cancel` → **200**

```json
{
  "command_id": "3686dbd7-00ba-495a-9f70-b70d74147f5d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "46e610ef-0eff-44b7-89c0-8f15b4ffc88c",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a6867b6e-f9dc-4aeb-bd6c-dbabda7a38cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T12:09:16.260557Z",
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
  "pickup_at": "2026-10-30T15:09:16Z",
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
  "session_id": "017f29b7-b747-442f-9ca6-0f585b1b4ff8",
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
  "last_heartbeat_at": "2026-10-30T12:09:13.929986Z",
  "last_location_at": "2026-10-30T12:09:13.929986Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/017f29b7-b747-442f-9ca6-0f585b1b4ff8/close` → **200**

```json
{
  "command_id": "dad63d01-c259-403a-9c65-348575414eaf",
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

Done: orders fb518003-273e-4e64-ae32-6d5ae745f761, bdb6dc26-e076-4d7b-a427-3e6f016bec96, 46e610ef-0eff-44b7-89c0-8f15b4ffc88c.

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
  "session_id": "2209e036-1880-42ad-a55d-e9c5abc77310",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNTksImlhdCI6MTc5MzM2MjE1OSwianRpIjoiNTdmY2IzZWItODIzNi00NjRjLThkMTEtYmUyYzY5ZDhhYzI4Iiwic2lkIjoiMjIwOWUwMzYtMTg4MC00MmFkLWE1NWQtZTljNWFiYzc3MzEwIn0.WP-p0me4d3nAXpJomRpQzAJ9HwwRiuzUK4EtL5ykUv8",
  "access_expires_at": "2026-10-30T12:24:19.151121045Z",
  "refresh_token": "TjSNON6ILlbqvzTyOvgMpO5xJYXEa9qSzFvt7jgW9mk",
  "refresh_expires_at": "2026-10-31T00:09:19.150688881Z",
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
  "session_id": "6108ed31-f660-484e-8832-b4a4dd33c5a2",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNTksImlhdCI6MTc5MzM2MjE1OSwianRpIjoiMjJjZWU1ODEtNGY5Yi00Mzc0LTg4YmYtNjA2MjZkYWY3OGZiIiwic2lkIjoiNjEwOGVkMzEtZjY2MC00ODRlLTg4MzItYjRhNGRkMzNjNWEyIn0.1BI_ust82K7zrde-edGeozbThIn5P0DSXlfmP8GgvSA",
  "access_expires_at": "2026-10-30T12:24:19.552936892Z",
  "refresh_token": "IXJsBAZENnQU-G1vMwaMcKYHPhWys5hR00PuUJNbJUI",
  "refresh_expires_at": "2026-10-31T00:09:19.552449975Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26257"
}
```

```json
{
  "challenge_id": "8d11ca59-80e9-47f1-8905-5511c629e4cf",
  "expires_at": "2026-10-30T12:14:19.796184008Z",
  "resend_available_at": "2026-10-30T12:09:20.796184008Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "107445",
  "sent_at": "2026-10-30T12:09:19.798212068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d11ca59-80e9-47f1-8905-5511c629e4cf",
  "code": "107445",
  "device_ref": "sandbox-26257"
}
```

```json
{
  "session_id": "67eed2e4-55af-4b7b-a967-e4db410f0fd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzA2MCwiaWF0IjoxNzkzMzYyMTYwLCJqdGkiOiJiYjNjMDA2MC1mNjlhLTQwODgtOWY3ZC04OTVkZTI2NGNhNDEiLCJzaWQiOiI2N2VlZDJlNC01NWFmLTRiN2ItYTk2Ny1lNGRiNDEwZjBmZDEifQ.51VisJhMYNjdDi6-SwsdzaDijPlLNg2AmzBEK01LTOg",
  "access_expires_at": "2026-10-30T12:24:20.031838311Z",
  "refresh_token": "dBokL9xUZQelXXWQTVApIO1gwfAaSfQ1LCLm_cqIJgI",
  "refresh_expires_at": "2026-11-29T12:09:20.031427229Z",
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
  "command_id": "8699eea5-00fe-4041-8858-ca839e3924bc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:20Z",
    "sequence": 1793362160421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06bc6b06-f5eb-4bc2-b36e-526f853dc997",
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
  "last_heartbeat_at": "2026-10-30T12:09:20.439794Z",
  "last_location_at": "2026-10-30T12:09:20.439794Z",
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
  "command_id": "a0ff3d6e-1104-48ec-9440-df6ae4bff51f",
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
  "effective_at": "2026-10-30T12:09:20.861565Z",
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T12:07:19.406829Z",
  "last_entries": [
    {
      "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:07:19.406829Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8a642710-44b9-4ebf-8389-e534ba17a1d0",
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
  "id": "6e4d9cb9-ded5-44af-b102-9e7b6f90deeb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:21.260778Z",
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
  "command_id": "0bc826d5-cf5f-40ce-962c-6647830e24d2",
  "quote_id": "6e4d9cb9-ded5-44af-b102-9e7b6f90deeb",
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
    "phone": "+3806711121606"
  }
}
```

```json
{
  "id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
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
  "created_at": "2026-10-30T12:09:21.463458Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121606"
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
    "id": "09b707c8-9bad-4383-a414-b1418e6df61f",
    "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
    "expires_at": "2026-10-30T12:09:36.466506Z",
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

`POST /api/driver/v1/offers/09b707c8-9bad-4383-a414-b1418e6df61f/accept` → **200**

```json
{
  "command_id": "e031d06f-5e19-4753-b04b-a8ff4dd538f6"
}
```

```json
{
  "id": "3398fc46-bf1f-4bc0-8791-fac10504aa2f",
  "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "028160fa-4c43-49f5-9494-de34b3b1f2bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "028160fa-4c43-49f5-9494-de34b3b1f2bf",
  "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
  "assignment_id": "3398fc46-bf1f-4bc0-8791-fac10504aa2f",
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
    "phone": "+3806711121606"
  }
}
```

`POST /api/driver/v1/work-sessions/06bc6b06-f5eb-4bc2-b36e-526f853dc997/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:22Z",
    "sequence": 1793362162255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06bc6b06-f5eb-4bc2-b36e-526f853dc997",
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
  "last_heartbeat_at": "2026-10-30T12:09:22.271817Z",
  "last_location_at": "2026-10-30T12:09:22.271817Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/028160fa-4c43-49f5-9494-de34b3b1f2bf/arrive` → **200**

```json
{
  "command_id": "2cbab9c5-1393-4991-ae0d-f03b5cb6dc9b",
  "expected_version": 0
}
```

```json
{
  "id": "028160fa-4c43-49f5-9494-de34b3b1f2bf",
  "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
  "assignment_id": "3398fc46-bf1f-4bc0-8791-fac10504aa2f",
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
  "arrived_at": "2026-10-30T12:09:22.470665Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121606"
  }
}
```

`POST /api/driver/v1/trips/028160fa-4c43-49f5-9494-de34b3b1f2bf/start` → **200**

```json
{
  "command_id": "a4b35ef0-f995-4af3-82da-17153e29dd59",
  "expected_version": 1
}
```

```json
{
  "id": "028160fa-4c43-49f5-9494-de34b3b1f2bf",
  "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
  "assignment_id": "3398fc46-bf1f-4bc0-8791-fac10504aa2f",
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
  "arrived_at": "2026-10-30T12:09:22.470665Z",
  "started_at": "2026-10-30T12:09:22.682219Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121606"
  }
}
```

`POST /api/driver/v1/trips/028160fa-4c43-49f5-9494-de34b3b1f2bf/complete` → **200**

```json
{
  "command_id": "f681cb49-60b0-4941-a3f9-51babf143449",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:09:22Z",
  "cash_received": true
}
```

```json
{
  "id": "028160fa-4c43-49f5-9494-de34b3b1f2bf",
  "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
  "assignment_id": "3398fc46-bf1f-4bc0-8791-fac10504aa2f",
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
  "arrived_at": "2026-10-30T12:09:22.470665Z",
  "started_at": "2026-10-30T12:09:22.682219Z",
  "completed_at": "2026-10-30T12:09:22.890115Z",
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
  "command_id": "4a5186fb-eb34-49ab-87a2-e58cec65732a",
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
  "id": "2b43b168-ca46-4fd8-befe-666a1bfe16a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:23.107835Z",
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
  "command_id": "ee9fd4be-3152-4928-ab18-b44b1802ba17",
  "quote_id": "2b43b168-ca46-4fd8-befe-666a1bfe16a5",
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
    "phone": "+3806711121725"
  }
}
```

```json
{
  "id": "65322191-3003-452c-a745-9d9939e16be0",
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
  "created_at": "2026-10-30T12:09:23.312513Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121725"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/65322191-3003-452c-a745-9d9939e16be0` → **200**

```json
{
  "id": "65322191-3003-452c-a745-9d9939e16be0",
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
  "created_at": "2026-10-30T12:09:23.312513Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121725"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/65322191-3003-452c-a745-9d9939e16be0/cancel` → **200**

```json
{
  "command_id": "8177672a-230b-4095-a69a-df4d35a6d7ed",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "65322191-3003-452c-a745-9d9939e16be0",
  "short_number": 23,
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
  "created_at": "2026-10-30T12:09:23.312513Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121725"
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
  "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T12:07:19.406829Z",
  "last_entries": [
    {
      "order_id": "65322191-3003-452c-a745-9d9939e16be0",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T12:09:23.737199Z"
    },
    {
      "order_id": "e61587ad-7385-4d4a-9472-0eb09f778b26",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T12:09:22.893723Z"
    },
    {
      "order_id": "3a303f46-dea3-4abc-9226-587b5078df91",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T12:07:19.406829Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06bc6b06-f5eb-4bc2-b36e-526f853dc997",
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
  "last_heartbeat_at": "2026-10-30T12:09:22.271817Z",
  "last_location_at": "2026-10-30T12:09:22.271817Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06bc6b06-f5eb-4bc2-b36e-526f853dc997/close` → **200**

```json
{
  "command_id": "b28a5634-49c8-405b-b5ad-b99e55eb17e3",
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

Done: operator bonus for fulfilled e61587ad-7385-4d4a-9472-0eb09f778b26 and operator-fault cancellation 65322191-3003-452c-a745-9d9939e16be0.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676416394",
  "device_ref": "sandbox-13844"
}
```

```json
{
  "challenge_id": "fb26330f-b4ca-44ae-9e0b-ce3f6c6b8ed7",
  "expires_at": "2026-10-30T12:14:27.760250491Z",
  "resend_available_at": "2026-10-30T12:09:28.760250491Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676416394` → **200**

```json
{
  "phone": "+380676416394",
  "audience": "CLIENT",
  "code": "844854",
  "sent_at": "2026-10-30T12:09:27.762801726Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674772452",
  "device_ref": "sandbox-17721",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ebe4d6a0-61bc-485a-a026-1aca934a939f",
  "expires_at": "2026-10-30T12:14:29.186753331Z",
  "resend_available_at": "2026-10-30T12:09:30.186753331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674772452` → **200**

```json
{
  "phone": "+380674772452",
  "audience": "CLIENT",
  "code": "312046",
  "sent_at": "2026-10-30T12:09:29.189403219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674772452",
  "device_ref": "sandbox-13892",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "91c43d3e-e084-4d83-ac02-fac5622011be",
  "expires_at": "2026-10-30T12:14:30.611275503Z",
  "resend_available_at": "2026-10-30T12:09:31.611275503Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674772452` → **200**

```json
{
  "phone": "+380674772452",
  "audience": "CLIENT",
  "code": "135816",
  "sent_at": "2026-10-30T12:09:30.613331827Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679900000",
  "device_ref": "sandbox-12748"
}
```

```json
{
  "challenge_id": "4de77414-fde3-4a48-8ac8-acc2bbc3fa22",
  "expires_at": "2026-10-30T12:14:32.036681541Z",
  "resend_available_at": "2026-10-30T12:09:33.036681541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679900000",
  "device_ref": "sandbox-24036"
}
```

```json
{
  "challenge_id": "4e4df93c-dfe6-44e1-9984-31b57f066026",
  "expires_at": "2026-10-30T12:14:33.429949866Z",
  "resend_available_at": "2026-10-30T12:09:34.429949866Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679900000` → **200**

```json
{
  "phone": "+380679900000",
  "audience": "CLIENT",
  "code": "480293",
  "sent_at": "2026-10-30T12:09:33.432545429Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679900000",
  "device_ref": "sandbox-24053",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "607eed12-629d-462c-9280-9931ab395582",
  "expires_at": "2026-10-30T12:14:34.854296353Z",
  "resend_available_at": "2026-10-30T12:09:35.854296353Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679900000` → **200**

```json
{
  "phone": "+380679900000",
  "audience": "CLIENT",
  "code": "406766",
  "sent_at": "2026-10-30T12:09:34.85629877Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679900000",
  "device_ref": "sandbox-11832",
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
  "correlation_id": "aad31ad2-d22a-41e8-b1ed-7611eddf7546",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000022657"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "649d655c-bb74-4e6f-8975-a660eb404319"
}
```

`GET /sandbox/v1/otp?phone=%2B442000022657` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120026237"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "aaa96ec1-26d1-4a9d-8f14-5c5618e4b418"
}
```

`GET /sandbox/v1/otp?phone=%2B37120026237` → **404**

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
  "session_id": "3519655f-309b-44d3-bee9-8004628cfd89",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNzcsImlhdCI6MTc5MzM2MjE3NywianRpIjoiMWY1YzBkNTctODJjMC00Yzg1LWExY2YtNjVmZWZkNDhlOTFiIiwic2lkIjoiMzUxOTY1NWYtMzA5Yi00NGQzLWJlZTktODAwNDYyOGNmZDg5In0.IIYvC5EI05irwFWNsq2bVms1P07mNx2aMvK1QqL3OEE",
  "access_expires_at": "2026-10-30T12:24:37.103788746Z",
  "refresh_token": "EE8MyZodsVjhtpZ82ETcsnfF7a3e4fId6F9g2vsW0v0",
  "refresh_expires_at": "2026-10-31T00:09:37.103424755Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679900000` → **200**

```json
{
  "deliveries": [
    {
      "id": "9db0a1f0-a688-406d-8670-94f614692534",
      "challenge_id": "607eed12-629d-462c-9280-9931ab395582",
      "phone": "+380679900000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-51b814b7-d08b-4b67-8aab-7719b2262db0",
      "error": null,
      "attempted_at": "2026-10-30T12:09:34.856662Z"
    },
    {
      "id": "d27cc177-00b6-48dd-9e65-db64bd8d50fd",
      "challenge_id": "4e4df93c-dfe6-44e1-9984-31b57f066026",
      "phone": "+380679900000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-cb7ea3ec-f1ab-4052-b77c-d3a5d83e5654",
      "error": null,
      "attempted_at": "2026-10-30T12:09:33.432926Z"
    },
    {
      "id": "6932cc95-7790-420f-ba6a-a54c3a39e1c1",
      "challenge_id": "4de77414-fde3-4a48-8ac8-acc2bbc3fa22",
      "phone": "+380679900000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T12:09:32.038748Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679900000` → **200**

```json
{
  "phone": "+380679900000",
  "audience": "CLIENT",
  "code": "406766",
  "sent_at": "2026-10-30T12:09:34.85629877Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674772452` → **200**

```json
{
  "deliveries": [
    {
      "id": "d41beda4-ad3e-4290-8204-df69d0957db6",
      "challenge_id": "91c43d3e-e084-4d83-ac02-fac5622011be",
      "phone": "+380674772452",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-686acc6b-7731-46de-8c02-4438179ba752",
      "error": null,
      "attempted_at": "2026-10-30T12:09:30.613799Z"
    },
    {
      "id": "8a305405-050e-4872-a2e8-8544547e97b1",
      "challenge_id": "ebe4d6a0-61bc-485a-a026-1aca934a939f",
      "phone": "+380674772452",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-78871e82-2b7b-4c1d-a288-6de865ce23ca",
      "error": null,
      "attempted_at": "2026-10-30T12:09:29.189951Z"
    }
  ]
}
```

Done: SMS to +380676416394; SMS then a call to +380674772452; a failed SMS, two calls and a refused third to +380679900000; +44 and +371 refused.

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
  "session_id": "89423d47-52e8-402d-8edc-90eebefe8b03",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNzcsImlhdCI6MTc5MzM2MjE3NywianRpIjoiY2M0ZTQwYTgtZjY5OS00YTI5LTk5MGUtMmQ2ODZiZDNlNDJmIiwic2lkIjoiODk0MjNkNDctNTJlOC00MDJkLThlZGMtOTBlZWJlZmU4YjAzIn0.d6UILE0hGNARTo5LjclH0wZ6LdVfDCmlNHaOa4H9nwI",
  "access_expires_at": "2026-10-30T12:24:37.924367566Z",
  "refresh_token": "k3iph7xlQoD9yw6LcAgEpChncFibTJcNgbI7wbJVY1Q",
  "refresh_expires_at": "2026-10-31T00:09:37.923956777Z",
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
  "session_id": "93f152b7-05c7-4f82-9905-894da9b8d733",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwNzgsImlhdCI6MTc5MzM2MjE3OCwianRpIjoiYTdmOGMyMjMtMDVhYS00MDJiLWI0ZjMtMmVmNWY4YWUzZTM0Iiwic2lkIjoiOTNmMTUyYjctMDVjNy00ZjgyLTk5MDUtODk0ZGE5YjhkNzMzIn0.2mflvlSItfj6vgC6cLjkIbfvsQ2zB81IBh4qbOI_dh0",
  "access_expires_at": "2026-10-30T12:24:38.322919765Z",
  "refresh_token": "b1anr_g8_1z1e-dxtnfvA7bqsilIOnjP9qJA4oW7sHU",
  "refresh_expires_at": "2026-10-31T00:09:38.322514428Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
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

`POST /api/admin/v1/staff-extensions/6fbc1d2f-1a95-4712-a755-694a60e75cab` → **200**

```json
{
  "command_id": "515e473b-4254-4020-8f40-a26cffa5cb19",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "08829722-6ae7-4f8d-a691-a25d18240ec7",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:09:39.109393Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T12:09:39.109393Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3f6389e3-a4a1-476b-9051-47d74bbf5b15",
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
  "id": "030357ad-3cfe-4f87-9e81-8a50a2748f95",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:39.526482Z",
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
  "command_id": "74dcb396-9c64-4904-9388-1c949c87f92e",
  "quote_id": "030357ad-3cfe-4f87-9e81-8a50a2748f95",
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
    "phone": "+380674630925"
  }
}
```

```json
{
  "id": "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6",
  "short_number": 24,
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
  "created_at": "2026-10-30T12:09:39.72682Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674630925"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6/calls` → **201**

```json
{
  "command_id": "344fe292-8781-44b3-aac1-a36febd93221",
  "to": "CALLER"
}
```

```json
{
  "id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "order_ids": [
    "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6"
  ],
  "started_at": "2026-10-30T12:09:39.943021Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6/calls` → **201**

```json
{
  "command_id": "344fe292-8781-44b3-aac1-a36febd93221",
  "to": "CALLER"
}
```

```json
{
  "id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "order_ids": [
    "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6"
  ],
  "started_at": "2026-10-30T12:09:39.943021Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674630925",
    "at": "2026-10-30T12:09:39.945234934Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11741",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "93b26e44-1ac8-4ff2-b57f-86a150e0763d"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6` → **200**

```json
{
  "calls": [
    {
      "id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [
        "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6"
      ],
      "started_at": "2026-10-30T12:09:39.943021Z",
      "answered_at": "2026-10-30T12:09:40.410298Z",
      "ended_at": "2026-10-30T12:09:40.42951Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6` → **200**

```json
{
  "calls": [
    {
      "id": "93b26e44-1ac8-4ff2-b57f-86a150e0763d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "order_ids": [
        "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6"
      ],
      "started_at": "2026-10-30T12:09:39.943021Z",
      "answered_at": "2026-10-30T12:09:40.410298Z",
      "ended_at": "2026-10-30T12:09:40.42951Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T12:09:40.703185Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6` → **200**

```json
{
  "id": "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6",
  "short_number": 24,
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
  "created_at": "2026-10-30T12:09:39.72682Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674630925"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6/cancel` → **200**

```json
{
  "command_id": "ecfdda52-13eb-4efb-bcf8-83d5ab14a333",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6",
  "short_number": 24,
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
  "created_at": "2026-10-30T12:09:39.72682Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674630925"
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
  "command_id": "843b5a33-90cc-4eca-b8c4-8325d376246d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T12:09:43.280447Z",
  "extension": "101"
}
```

Done: outgoing call 93b26e44-1ac8-4ff2-b57f-86a150e0763d from order bde56d5d-8d1b-4ae7-81c7-7f85456ef2c6, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638396360",
  "device_ref": "sandbox-3627"
}
```

```json
{
  "challenge_id": "03b1417c-4590-4837-b36b-322a14c939e9",
  "expires_at": "2026-10-30T12:14:43.480968181Z",
  "resend_available_at": "2026-10-30T12:09:44.480968181Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638396360` → **200**

```json
{
  "phone": "+380638396360",
  "audience": "CLIENT",
  "code": "023091",
  "sent_at": "2026-10-30T12:09:43.483248022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03b1417c-4590-4837-b36b-322a14c939e9",
  "code": "023091",
  "device_ref": "sandbox-3627"
}
```

```json
{
  "session_id": "7261af8e-6af0-4951-9cb1-19c64864ed42",
  "subject": {
    "type": "CLIENT",
    "id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDRjMTNmYS1jMDQwLTQyYzEtOTFlZi1iZDkxMGVhOGE0MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDgzLCJpYXQiOjE3OTMzNjIxODMsImp0aSI6IjcxZTk2M2JkLTY0ODItNDYwYi1hN2UyLTdmZWE5YWZhM2VmOSIsInNpZCI6IjcyNjFhZjhlLTZhZjAtNDk1MS05Y2IxLTE5YzY0ODY0ZWQ0MiJ9.noZSdgRJl6xgfSX_ELBUJ8ds-A65SVezN8lTDa3ijhI",
  "access_expires_at": "2026-10-30T12:24:43.696030868Z",
  "refresh_token": "ISpPdmb2G1AuD2KeiMvLkgPLuVm6IBE_zs9We_-xhmY",
  "refresh_expires_at": "2026-11-29T12:09:43.695723212Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
  "session_id": "7261af8e-6af0-4951-9cb1-19c64864ed42",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638396360",
  "device_ref": "sandbox-23880"
}
```

```json
{
  "challenge_id": "a20c624a-c620-4cde-b45c-52a23a42a468",
  "expires_at": "2026-10-30T12:14:46.066756616Z",
  "resend_available_at": "2026-10-30T12:09:47.066756616Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638396360` → **200**

```json
{
  "phone": "+380638396360",
  "audience": "CLIENT",
  "code": "992642",
  "sent_at": "2026-10-30T12:09:46.068768627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a20c624a-c620-4cde-b45c-52a23a42a468",
  "code": "992642",
  "device_ref": "sandbox-23880"
}
```

```json
{
  "session_id": "92abd743-f713-47e8-8095-e081c33279ce",
  "subject": {
    "type": "CLIENT",
    "id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDRjMTNmYS1jMDQwLTQyYzEtOTFlZi1iZDkxMGVhOGE0MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDg2LCJpYXQiOjE3OTMzNjIxODYsImp0aSI6IjEwMDdjOTY2LTIyYzQtNGVkOC1iNzI5LTUwNGU0ODc5NWQwOCIsInNpZCI6IjkyYWJkNzQzLWY3MTMtNDdlOC04MDk1LWUwODFjMzMyNzljZSJ9.dKhNp3jfBh11dTlhzG8dRmC5VHPOia_Us-SqEB3YHZk",
  "access_expires_at": "2026-10-30T12:24:46.281310807Z",
  "refresh_token": "fmRYc6S-F6-jqpdCkm1ADgGTMRw-84Nuopwg18g309g",
  "refresh_expires_at": "2026-11-29T12:09:46.28095544Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "c66e2588-7acf-4e0b-a563-fc0c4761cde7",
  "expires_at": "2026-10-30T12:14:48.470652804Z",
  "resend_available_at": "2026-10-30T12:09:49.470652804Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638396360` → **200**

```json
{
  "phone": "+380638396360",
  "audience": "CLIENT",
  "code": "294821",
  "sent_at": "2026-10-30T12:09:48.472580232Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633644409"
}
```

```json
{
  "challenge_id": "8f07cd65-8431-4267-8989-7f220295a63a",
  "expires_at": "2026-10-30T12:14:48.672854862Z",
  "resend_available_at": "2026-10-30T12:09:49.672854862Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633644409` → **200**

```json
{
  "phone": "+380633644409",
  "audience": "CLIENT",
  "code": "151794",
  "sent_at": "2026-10-30T12:09:48.674611912Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "29c78102-e0f4-4259-b9b5-c0f4d0b58727",
  "current_challenge_id": "c66e2588-7acf-4e0b-a563-fc0c4761cde7",
  "current_code": "000000",
  "new_challenge_id": "8f07cd65-8431-4267-8989-7f220295a63a",
  "new_code": "151794"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "42a9bfd3-aacf-4cfb-95d1-339e851358b4"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "58c7cdfd-8920-444a-af9c-d863ed1bf039",
  "current_challenge_id": "c66e2588-7acf-4e0b-a563-fc0c4761cde7",
  "current_code": "294821",
  "new_challenge_id": "8f07cd65-8431-4267-8989-7f220295a63a",
  "new_code": "151794"
}
```

```json
{
  "subject_id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
  "phone": "+380633644409",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
  "session_id": "7261af8e-6af0-4951-9cb1-19c64864ed42",
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
  "correlation_id": "7851373f-b64e-4561-8f6d-18cb02e34d14"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633644409",
  "device_ref": "sandbox-23045"
}
```

```json
{
  "challenge_id": "5979388d-f987-4781-918c-a58d70585ad9",
  "expires_at": "2026-10-30T12:14:51.702504572Z",
  "resend_available_at": "2026-10-30T12:09:52.702504572Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633644409` → **200**

```json
{
  "phone": "+380633644409",
  "audience": "CLIENT",
  "code": "670708",
  "sent_at": "2026-10-30T12:09:51.704887738Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5979388d-f987-4781-918c-a58d70585ad9",
  "code": "670708",
  "device_ref": "sandbox-23045"
}
```

```json
{
  "session_id": "2ab2400e-a10b-4e98-a5c6-92a24fff6541",
  "subject": {
    "type": "CLIENT",
    "id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDRjMTNmYS1jMDQwLTQyYzEtOTFlZi1iZDkxMGVhOGE0MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDkxLCJpYXQiOjE3OTMzNjIxOTEsImp0aSI6ImI1MzdhNGZlLWQ3MDAtNDVlNS1hMjc1LWU3ODQ5MmRmYjRjOSIsInNpZCI6IjJhYjI0MDBlLWExMGItNGU5OC1hNWM2LTkyYTI0ZmZmNjU0MSJ9.Y0hVwEIOZiUCGEnQRTbOR7Ogea_zeECtRqHAJRNkV_8",
  "access_expires_at": "2026-10-30T12:24:51.912334913Z",
  "refresh_token": "1dqlA95rVvPTUuEYN4n7qCW7GcwgN1BB2rNoLOxDI-g",
  "refresh_expires_at": "2026-11-29T12:09:51.911951913Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
  "session_id": "2ab2400e-a10b-4e98-a5c6-92a24fff6541",
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
  "session_id": "f74b58ca-d5a9-4be7-8fda-35b2a61f8e01",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwOTIsImlhdCI6MTc5MzM2MjE5MiwianRpIjoiMWFiZDUxYzctYTkxOS00NWI1LTk1OTktYzAyYjQ1NzRkMWQ1Iiwic2lkIjoiZjc0YjU4Y2EtZDVhOS00YmU3LThmZGEtMzViMmE2MWY4ZTAxIn0.7yixXkk2RiShF5CT4l-roygKof5Cf36Z8ISeQ1fDyRY",
  "access_expires_at": "2026-10-30T12:24:52.492439954Z",
  "refresh_token": "7f3g220kFGb-UfuWeCqC4gjq-RclhMmOY6clcmNN8sc",
  "refresh_expires_at": "2026-10-31T00:09:52.492056584Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f` → **200**

```json
{
  "client": {
    "id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
    "phone": "+380633644409",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T12:09:43.694237Z",
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

`POST /api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f/phone/new-code` → **201**

```json
{
  "phone": "+380630273937"
}
```

```json
{
  "challenge_id": "7d8fc170-6a5b-48f9-a3cb-335943908fb0",
  "expires_at": "2026-10-30T12:14:52.880867524Z",
  "resend_available_at": "2026-10-30T12:09:53.880867524Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630273937` → **200**

```json
{
  "phone": "+380630273937",
  "audience": "CLIENT",
  "code": "586125",
  "sent_at": "2026-10-30T12:09:52.882535157Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f/phone` → **422**

```json
{
  "command_id": "f2c915e9-db21-4afa-b6e1-0c0209073894",
  "expected_version": 3,
  "new_challenge_id": "7d8fc170-6a5b-48f9-a3cb-335943908fb0",
  "new_code": "586126",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "ebcf29be-cb5f-4d27-9cc5-33df4dfd728c"
}
```

`POST /api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f/phone` → **400**

```json
{
  "command_id": "64a05186-9c38-4d35-86e3-575f07853178",
  "expected_version": 3,
  "new_challenge_id": "7d8fc170-6a5b-48f9-a3cb-335943908fb0",
  "new_code": "586125",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1f303654-f5f5-45bd-b7f5-8614db6af11a",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/7d4c13fa-c040-42c1-91ef-bd910ea8a41f/phone` → **200**

```json
{
  "command_id": "b31aa28b-4792-42a2-86a5-a483cb358854",
  "expected_version": 3,
  "new_challenge_id": "7d8fc170-6a5b-48f9-a3cb-335943908fb0",
  "new_code": "586125",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
  "phone": "+380630273937",
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
  "correlation_id": "09e12e8a-5d04-479d-9435-32c2cc087896"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630273937",
  "device_ref": "sandbox-12394"
}
```

```json
{
  "challenge_id": "2a148307-3b13-4ace-a729-eb8e6736efd0",
  "expires_at": "2026-10-30T12:14:53.933088669Z",
  "resend_available_at": "2026-10-30T12:09:54.933088669Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630273937` → **200**

```json
{
  "phone": "+380630273937",
  "audience": "CLIENT",
  "code": "236399",
  "sent_at": "2026-10-30T12:09:53.935093309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a148307-3b13-4ace-a729-eb8e6736efd0",
  "code": "236399",
  "device_ref": "sandbox-12394"
}
```

```json
{
  "session_id": "ba471bb1-6b1e-4631-b757-5117c9891b60",
  "subject": {
    "type": "CLIENT",
    "id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDRjMTNmYS1jMDQwLTQyYzEtOTFlZi1iZDkxMGVhOGE0MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDk0LCJpYXQiOjE3OTMzNjIxOTQsImp0aSI6IjI3NjU0MjhhLTU3NGMtNDNlYi04MDI4LTBkNDc2NDEzNmQwZCIsInNpZCI6ImJhNDcxYmIxLTZiMWUtNDYzMS1iNzU3LTUxMTdjOTg5MWI2MCJ9.DOPMkBURekGV_pc5Tpk4hlnH7I8BgOdH4ldbLeBD52A",
  "access_expires_at": "2026-10-30T12:24:54.144655633Z",
  "refresh_token": "U_qphUP5jutOnsBYofHo3sAstcoIZNyeRs-MgfqR5Yk",
  "refresh_expires_at": "2026-11-29T12:09:54.144327951Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7d4c13fa-c040-42c1-91ef-bd910ea8a41f",
  "session_id": "ba471bb1-6b1e-4631-b757-5117c9891b60",
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
  "phone": "+380633068665",
  "device_ref": "sandbox-5014"
}
```

```json
{
  "challenge_id": "d2f25ae3-57a0-42ab-990b-df7bf6a7657d",
  "expires_at": "2026-10-30T12:14:54.519962769Z",
  "resend_available_at": "2026-10-30T12:09:55.519962769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633068665` → **200**

```json
{
  "phone": "+380633068665",
  "audience": "CLIENT",
  "code": "340216",
  "sent_at": "2026-10-30T12:09:54.52195434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2f25ae3-57a0-42ab-990b-df7bf6a7657d",
  "code": "340216",
  "device_ref": "sandbox-5014"
}
```

```json
{
  "session_id": "04c981f7-2003-4dc0-97de-4549f84a695f",
  "subject": {
    "type": "CLIENT",
    "id": "9f0fcd5f-2e37-4c9b-9f19-8e434e5ced57"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjBmY2Q1Zi0yZTM3LTRjOWItOWYxOS04ZTQzNGU1Y2VkNTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDk0LCJpYXQiOjE3OTMzNjIxOTQsImp0aSI6ImExOTZkNmEyLTkwNDQtNGJjNS05MTM4LTY2ZmYxNzA5MjFjOCIsInNpZCI6IjA0Yzk4MWY3LTIwMDMtNGRjMC05N2RlLTQ1NDlmODRhNjk1ZiJ9.6pCqp1-vbH0IDhr_rS-TnYIxPcPOROtT4c8iULbkwVU",
  "access_expires_at": "2026-10-30T12:24:54.736586372Z",
  "refresh_token": "z_kklwZvHeAwOzrtsBiAGYjlrEX-my6S3Izy1Kqtp08",
  "refresh_expires_at": "2026-11-29T12:09:54.736172827Z",
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
  "session_id": "4c1740cb-e6da-48de-a5be-df7a48c226c7",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwOTUsImlhdCI6MTc5MzM2MjE5NSwianRpIjoiMDc1ZGNiNmQtMjhiNi00MTgwLTgwNmYtZDYzYTFlNGFiMDJhIiwic2lkIjoiNGMxNzQwY2ItZTZkYS00OGRlLWE1YmUtZGY3YTQ4YzIyNmM3In0.2nTO5GJ7Y_GMIBN9vP1dEYCIgKG3fwXlZNxkYVFz42U",
  "access_expires_at": "2026-10-30T12:24:55.540362783Z",
  "refresh_token": "e8C_Qx4UBpm4bMKEqV1imyCQF7dME_meiLWv-CKny8k",
  "refresh_expires_at": "2026-10-31T00:09:55.539944831Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633068665` → **200**

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
  "correlation_id": "c66cd260-59ec-46a2-8e97-cb8844ae8bf1"
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
  "session_id": "cf6e4cce-0c9c-4a72-b710-fd346df40cf1",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwOTYsImlhdCI6MTc5MzM2MjE5NiwianRpIjoiZTRlZWUzM2UtMzFhMy00MzJlLTlhNGMtZWQxY2Q1MGJmOGYxIiwic2lkIjoiY2Y2ZTRjY2UtMGM5Yy00YTcyLWI3MTAtZmQzNDZkZjQwY2YxIn0.p0Z-V2NzMWxMx7S1MwtSnnv_iWug5A86kGDXK_1rxco",
  "access_expires_at": "2026-10-30T12:24:56.325765528Z",
  "refresh_token": "t7A3djEmLZDhpFK4Yr5OQaFgCClIREOL-kI7llwwD7o",
  "refresh_expires_at": "2026-10-31T00:09:56.325201575Z",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T12:06:43.05314Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "fc57b2a2-1761-4c6e-894d-79ae56871e93",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T12:09:56.705750995Z"
}
```

## The rider books the airport for 2026-10-30T15:09:56Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600170943",
  "device_ref": "sandbox-19880"
}
```

```json
{
  "challenge_id": "032e76bd-c49f-478b-acce-416f333c2098",
  "expires_at": "2026-10-30T12:14:56.905296479Z",
  "resend_available_at": "2026-10-30T12:09:57.905296479Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600170943` → **200**

```json
{
  "phone": "+48600170943",
  "audience": "CLIENT",
  "code": "299301",
  "sent_at": "2026-10-30T12:09:56.907287991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "032e76bd-c49f-478b-acce-416f333c2098",
  "code": "299301",
  "device_ref": "sandbox-19880"
}
```

```json
{
  "session_id": "02323eac-305f-419b-ac05-de5e2bba96c4",
  "subject": {
    "type": "CLIENT",
    "id": "cd1e2c80-1ab5-49d3-8652-e0fb99d37fb4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDFlMmM4MC0xYWI1LTQ5ZDMtODY1Mi1lMGZiOTlkMzdmYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMDk3LCJpYXQiOjE3OTMzNjIxOTcsImp0aSI6IjMyNDg0NDA2LTNkZTUtNDUzYS04NWE0LTNhMDM3OGMxYjkxNSIsInNpZCI6IjAyMzIzZWFjLTMwNWYtNDE5Yi1hYzA1LWRlNWUyYmJhOTZjNCJ9.fxBJ_WuhNaQ3bd65F2eFrV9qkVzDgkk3fh8XrCPox2E",
  "access_expires_at": "2026-10-30T12:24:57.122388835Z",
  "refresh_token": "s7NBJjhUCtOwQ6biHWaNTWZqHMURf1djL-sTJOHDYbM",
  "refresh_expires_at": "2026-11-29T12:09:57.122017909Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a6f5fec-c506-40c1-bfd3-97e3fdc3a956",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T15:09:56Z"
}
```

```json
{
  "id": "b0fbf62b-fb68-40cd-9d16-14f7567b63cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:14:57.324935Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T15:09:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2ed8d7e7-d9d6-4a60-b7fd-b2d90979be13",
  "quote_id": "b0fbf62b-fb68-40cd-9d16-14f7567b63cc",
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
  "pickup_at": "2026-10-30T15:09:56Z"
}
```

```json
{
  "id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cd1e2c80-1ab5-49d3-8652-e0fb99d37fb4",
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
  "created_at": "2026-10-30T12:09:57.52828Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T15:09:56Z",
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
  "device_ref": "sandbox-20599"
}
```

```json
{
  "challenge_id": "a76f1910-16a7-45a2-bb1b-cdb6848ab100",
  "expires_at": "2026-10-30T12:14:57.727529132Z",
  "resend_available_at": "2026-10-30T12:09:58.727529132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "974399",
  "sent_at": "2026-10-30T12:09:57.729586609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a76f1910-16a7-45a2-bb1b-cdb6848ab100",
  "code": "974399",
  "device_ref": "sandbox-20599"
}
```

```json
{
  "session_id": "712a933d-5032-4324-901a-e256b2957841",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzA5NywiaWF0IjoxNzkzMzYyMTk3LCJqdGkiOiI2M2RmYWE5Mi1kNzY0LTQwY2YtYWQ3OC02MGI1Yjc4NDA5ZWMiLCJzaWQiOiI3MTJhOTMzZC01MDMyLTQzMjQtOTAxYS1lMjU2YjI5NTc4NDEifQ.Qjd5ZktFC6SC4U0w2zmwvckgugyWI38UmelWwJ_7KlE",
  "access_expires_at": "2026-10-30T12:24:57.931913934Z",
  "refresh_token": "15qRBZ8EGU02x5TMha90rl4rqDNyLnbrrXSUgjVBwzA",
  "refresh_expires_at": "2026-11-29T12:09:57.931588111Z",
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
  "command_id": "448c00b4-e415-424d-ac97-136a8efe0405",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:09:58Z",
    "sequence": 1793362198300
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "78c66e6d-a704-45ef-a991-f607f1ca9923",
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
  "last_heartbeat_at": "2026-10-30T12:09:58.315568Z",
  "last_location_at": "2026-10-30T12:09:58.315568Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
      "short_number": 25,
      "pickup_at": "2026-10-30T15:09:56Z",
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

`POST /api/driver/v1/preorders/87340cdf-98eb-4b10-b58b-45e89d8bf0a2/reserve` → **200**

```json
{
  "command_id": "4676b909-61ca-4110-8896-28fab0b40dc0"
}
```

```json
{
  "id": "fc7afa8d-d529-4272-8c66-c7885d835c37",
  "state": "RESERVED",
  "order": {
    "order_id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
    "short_number": 25,
    "pickup_at": "2026-10-30T15:09:56Z",
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
  "reserved_at": "2026-10-30T12:09:58.704545Z",
  "confirm_from": "2026-10-30T14:39:56Z",
  "confirm_until": "2026-10-30T14:49:56Z",
  "drop_until": "2026-10-30T14:09:56Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "fc7afa8d-d529-4272-8c66-c7885d835c37",
      "state": "RESERVED",
      "order": {
        "order_id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:09:56Z",
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
      "reserved_at": "2026-10-30T12:09:58.704545Z",
      "confirm_from": "2026-10-30T14:39:56Z",
      "confirm_until": "2026-10-30T14:49:56Z",
      "drop_until": "2026-10-30T14:09:56Z"
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
      "id": "fc7afa8d-d529-4272-8c66-c7885d835c37",
      "state": "RESERVED",
      "order": {
        "order_id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
        "short_number": 25,
        "pickup_at": "2026-10-30T15:09:56Z",
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
      "reserved_at": "2026-10-30T12:09:58.704545Z",
      "confirm_from": "2026-10-30T14:39:56Z",
      "confirm_until": "2026-10-30T14:49:56Z",
      "drop_until": "2026-10-30T14:09:56Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/fc7afa8d-d529-4272-8c66-c7885d835c37/confirm` → **409**

```json
{
  "command_id": "0cb4d456-e014-4e6e-af82-921c53e166eb"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/fc7afa8d-d529-4272-8c66-c7885d835c37/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8af2c3ea-777e-471f-8dbe-bb42e6ab442a"
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
  "session_id": "3d05f1e2-2a19-4a4e-9120-3a981e3dc016",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMwOTksImlhdCI6MTc5MzM2MjE5OSwianRpIjoiNzBlMTFjNDUtODJmZS00MWQ0LTg5YTMtYTFmYjliZDcxNDNhIiwic2lkIjoiM2QwNWYxZTItMmExOS00YTRlLTkxMjAtM2E5ODFlM2RjMDE2In0.-mjJ5TzCVHMo_o66fd6xfe9uTBbMDmhSgfu1QysXD2U",
  "access_expires_at": "2026-10-30T12:24:59.699883483Z",
  "refresh_token": "E116o83OQqirAsyRoZ4ql91UfrVrOs1D5xRPKuGfqPU",
  "refresh_expires_at": "2026-10-31T00:09:59.699436236Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/87340cdf-98eb-4b10-b58b-45e89d8bf0a2` → **200**

```json
{
  "id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cd1e2c80-1ab5-49d3-8652-e0fb99d37fb4",
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
  "created_at": "2026-10-30T12:09:57.52828Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T15:09:56Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "fc7afa8d-d529-4272-8c66-c7885d835c37",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T12:09:58.704545Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/87340cdf-98eb-4b10-b58b-45e89d8bf0a2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T12:09:57.529112Z",
      "actor": {
        "type": "CLIENT",
        "id": "cd1e2c80-1ab5-49d3-8652-e0fb99d37fb4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
        "preorder": true,
        "quote_id": "b0fbf62b-fb68-40cd-9d16-14f7567b63cc",
        "pickup_at": "2026-10-30T15:09:56Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "eb1511a2-8a0a-4d04-b38a-b72133f1ae8a"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T12:09:58.705651Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "87340cdf-98eb-4b10-b58b-45e89d8bf0a2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "fc7afa8d-d529-4272-8c66-c7885d835c37"
      },
      "correlation_id": "b64913d2-a91d-4bdc-9010-16e8bed7f1c6"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 87340cdf-98eb-4b10-b58b-45e89d8bf0a2, reservation fc7afa8d-d529-4272-8c66-c7885d835c37.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12746"
}
```

```json
{
  "challenge_id": "21fe3509-be59-46a2-aa23-1cc463c8a82d",
  "expires_at": "2026-10-30T12:15:00.312025105Z",
  "resend_available_at": "2026-10-30T12:10:01.312025105Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "502473",
  "sent_at": "2026-10-30T12:10:00.314407088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21fe3509-be59-46a2-aa23-1cc463c8a82d",
  "code": "502473",
  "device_ref": "sandbox-12746"
}
```

```json
{
  "session_id": "eeab6de7-7011-44f8-9f5a-f28c7325e3d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEwMCwiaWF0IjoxNzkzMzYyMjAwLCJqdGkiOiI3YzJmZWM3Yi0zNGJlLTRhYWItODkzYi0wN2NhZjFkNDY1YmUiLCJzaWQiOiJlZWFiNmRlNy03MDExLTQ0ZjgtOWY1YS1mMjhjNzMyNWUzZDEifQ.s6O04Nx5Jx1qKdB-0XmbSokswxKdGt5vbzWYA1qm7Ek",
  "access_expires_at": "2026-10-30T12:25:00.532420586Z",
  "refresh_token": "Q3Aw9nWmvYs6o0k7sue6hS0Le-v9cgiF0hY7t10KT6U",
  "refresh_expires_at": "2026-11-29T12:10:00.531978192Z",
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
  "command_id": "2ec58f54-2f3a-4a1e-ab43-f1fe7c2e494c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:00Z",
    "sequence": 1793362200907
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:00.922888Z",
  "last_location_at": "2026-10-30T12:10:00.922888Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677683279",
  "device_ref": "sandbox-10820"
}
```

```json
{
  "challenge_id": "62681a8d-c56e-45ce-bc2a-e439073dba5a",
  "expires_at": "2026-10-30T12:15:01.105530105Z",
  "resend_available_at": "2026-10-30T12:10:02.105530105Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677683279` → **200**

```json
{
  "phone": "+380677683279",
  "audience": "CLIENT",
  "code": "294415",
  "sent_at": "2026-10-30T12:10:01.107406693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62681a8d-c56e-45ce-bc2a-e439073dba5a",
  "code": "294415",
  "device_ref": "sandbox-10820"
}
```

```json
{
  "session_id": "4cc2639b-812a-44c2-b939-30b9c3f0e5d0",
  "subject": {
    "type": "CLIENT",
    "id": "abfd0fa1-5e8d-453e-baa0-5ffdfc595a2b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmZkMGZhMS01ZThkLTQ1M2UtYmFhMC01ZmZkZmM1OTVhMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTAxLCJpYXQiOjE3OTMzNjIyMDEsImp0aSI6ImZiOGUzMTdlLTdiNDMtNDM5OS1hNDc2LWIzMDdkMGRhNmQ4OCIsInNpZCI6IjRjYzI2MzliLTgxMmEtNDRjMi1iOTM5LTMwYjljM2YwZTVkMCJ9.zACewp4n8bmAfcKvhMOQfK79nxkqqr0ua-IdruJU1oI",
  "access_expires_at": "2026-10-30T12:25:01.312716159Z",
  "refresh_token": "tIwg09MI1LAYXgaTMM0EctToIDgpX1Uu7MvfNdz5c0o",
  "refresh_expires_at": "2026-11-29T12:10:01.312408684Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "172fc959-29b9-4c29-840c-56680f31b35e",
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
  "id": "7954d80d-221e-40d9-b1f1-6cefe02ceacb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:01.514238Z",
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
  "command_id": "0018a950-65a8-4c87-9869-dd37147ef8a1",
  "quote_id": "7954d80d-221e-40d9-b1f1-6cefe02ceacb",
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
  "id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abfd0fa1-5e8d-453e-baa0-5ffdfc595a2b",
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
  "created_at": "2026-10-30T12:10:01.727176Z",
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
    "id": "58f4c164-d95b-40a6-aae8-d3c7fd33c0c8",
    "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
    "expires_at": "2026-10-30T12:10:16.729712Z",
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

`POST /api/driver/v1/offers/58f4c164-d95b-40a6-aae8-d3c7fd33c0c8/accept` → **200**

```json
{
  "command_id": "85c1ad32-a48d-4859-bc60-4e8ee2d6828b"
}
```

```json
{
  "id": "4f60e719-fb59-4e37-a7de-69d20f6eb808",
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c",
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "assignment_id": "4f60e719-fb59-4e37-a7de-69d20f6eb808",
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

`POST /api/driver/v1/work-sessions/f9966901-027f-4844-aa8c-90bc0499b34f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:02Z",
    "sequence": 1793362202517
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:02.533486Z",
  "last_location_at": "2026-10-30T12:10:02.533486Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c",
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "assignment_id": "4f60e719-fb59-4e37-a7de-69d20f6eb808",
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

`POST /api/driver/v1/trips/dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c/arrive` → **200**

```json
{
  "command_id": "cb9a7e41-310e-4dff-a7cc-9e74c5be45b9",
  "expected_version": 0
}
```

```json
{
  "id": "dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c",
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "assignment_id": "4f60e719-fb59-4e37-a7de-69d20f6eb808",
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
  "arrived_at": "2026-10-30T12:10:02.923828Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c/start` → **200**

```json
{
  "command_id": "2f6a56a0-b482-4c1f-bb43-9c4f14613105",
  "expected_version": 1
}
```

```json
{
  "id": "dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c",
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "assignment_id": "4f60e719-fb59-4e37-a7de-69d20f6eb808",
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
  "arrived_at": "2026-10-30T12:10:02.923828Z",
  "started_at": "2026-10-30T12:10:03.123601Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f9966901-027f-4844-aa8c-90bc0499b34f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:03Z",
    "sequence": 1793362203323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:03.338759Z",
  "last_location_at": "2026-10-30T12:10:03.338759Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c/complete` → **200**

```json
{
  "command_id": "e2c49431-ded9-4888-a262-0bd878ec3598",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:10:03Z",
  "cash_received": true
}
```

```json
{
  "id": "dceafeb3-1f42-4d42-a02e-b1d9d1b99b4c",
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "assignment_id": "4f60e719-fb59-4e37-a7de-69d20f6eb808",
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
  "arrived_at": "2026-10-30T12:10:02.923828Z",
  "started_at": "2026-10-30T12:10:03.123601Z",
  "completed_at": "2026-10-30T12:10:03.534407Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/2b800618-271d-4cd6-9d3f-be0342528827/rating` → **200**

```json
{
  "command_id": "6d0e0ce0-c18b-4172-a315-ae6ff1f09600",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "score": 5,
  "created_at": "2026-10-30T12:10:03.752317429Z"
}
```

`POST /api/driver/v1/orders/2b800618-271d-4cd6-9d3f-be0342528827/rating` → **200**

```json
{
  "command_id": "11bdbf68-86d1-4fa3-ac1b-3e2076725971",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
  "score": 4,
  "created_at": "2026-10-30T12:10:03.951480502Z"
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
  "session_id": "a4daf4df-44ab-4a6d-9079-f317b1461340",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMDQsImlhdCI6MTc5MzM2MjIwNCwianRpIjoiMWVlMWM2N2ItZjNjZS00MmM5LWI5YTgtZjk0YzhjNGVmYzA5Iiwic2lkIjoiYTRkYWY0ZGYtNDRhYi00YTZkLTkwNzktZjMxN2IxNDYxMzQwIn0.fNKNQkHMXx6VsZ3rbXDKde9X_yyQYjkK1ETh9fK12oQ",
  "access_expires_at": "2026-10-30T12:25:04.556093189Z",
  "refresh_token": "rdJDSkgzXAE1JJfvNghgJ5Bcyqswdps2Hp5brhVfu9o",
  "refresh_expires_at": "2026-10-31T00:10:04.555755008Z",
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
  "session_id": "10e26cad-ebac-4b32-8aa9-f5bd160feede",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMDQsImlhdCI6MTc5MzM2MjIwNCwianRpIjoiYjc0M2FlN2MtMGE1ZS00YjEwLTgxYzYtODU0Y2I1Yjc5ZTA5Iiwic2lkIjoiMTBlMjZjYWQtZWJhYy00YjMyLThhYTktZjViZDE2MGZlZWRlIn0.ht--PGwOi2TByoZ9dqwvG0oVBVgEDmPdd-YlNpKfBRo",
  "access_expires_at": "2026-10-30T12:25:04.955501158Z",
  "refresh_token": "hHRaoq5TQiUJSe-lEYTmf3DYroXSZoxqDzMhRRvr0fQ",
  "refresh_expires_at": "2026-10-31T00:10:04.955168234Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2b800618-271d-4cd6-9d3f-be0342528827/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
      "author_type": "RIDER",
      "author_id": "abfd0fa1-5e8d-453e-baa0-5ffdfc595a2b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T12:10:03.752317Z"
    },
    {
      "order_id": "2b800618-271d-4cd6-9d3f-be0342528827",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "abfd0fa1-5e8d-453e-baa0-5ffdfc595a2b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T12:10:03.951481Z"
    }
  ]
}
```

Done: ratings for order 2b800618-271d-4cd6-9d3f-be0342528827.

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
  "session_id": "0eaaf13e-4f46-4f44-8f03-0689dddae83c",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMDUsImlhdCI6MTc5MzM2MjIwNSwianRpIjoiZGY4NmYyMjItOWM5Yy00YjU4LTkyZjEtYmUxMjk0OTE0ZGVhIiwic2lkIjoiMGVhYWYxM2UtNGY0Ni00ZjQ0LThmMDMtMDY4OWRkZGFlODNjIn0.uJqUGpB-QYiA6pCMrolYhtSx7Kf4XzRgx1eAmiuP2-U",
  "access_expires_at": "2026-10-30T12:25:05.530019333Z",
  "refresh_token": "HrbdCv9OcMAu7CzIL_fk7ZliPcRLXACnwSH_rhp2v1g",
  "refresh_expires_at": "2026-10-31T00:10:05.529691167Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7d4d8650-cfdf-4399-8724-c12d5ff44394",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d6b746a3-5f0f-40ac-9578-3e3084c4f927",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:10:05.727685Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d6b746a3-5f0f-40ac-9578-3e3084c4f927` → **200**

```json
{
  "id": "d6b746a3-5f0f-40ac-9578-3e3084c4f927",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:10:05.727685Z",
  "ready_at": "2026-10-30T12:10:05.747764Z",
  "expires_at": "2026-10-31T12:10:05.747764Z"
}
```

`GET /api/admin/v1/reports/exports/d6b746a3-5f0f-40ac-9578-3e3084c4f927/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "451b4be9-ad02-4b76-984a-ff5626ea2511",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "78a95eb7-38c0-49d2-a4c9-732e7a1f914c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:10:06.155285Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78a95eb7-38c0-49d2-a4c9-732e7a1f914c` → **200**

```json
{
  "id": "78a95eb7-38c0-49d2-a4c9-732e7a1f914c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:10:06.155285Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78a95eb7-38c0-49d2-a4c9-732e7a1f914c` → **200**

```json
{
  "id": "78a95eb7-38c0-49d2-a4c9-732e7a1f914c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:10:06.155285Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78a95eb7-38c0-49d2-a4c9-732e7a1f914c` → **200**

```json
{
  "id": "78a95eb7-38c0-49d2-a4c9-732e7a1f914c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:10:06.155285Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78a95eb7-38c0-49d2-a4c9-732e7a1f914c` → **200**

```json
{
  "id": "78a95eb7-38c0-49d2-a4c9-732e7a1f914c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T12:10:06.155285Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/78a95eb7-38c0-49d2-a4c9-732e7a1f914c` → **200**

```json
{
  "id": "78a95eb7-38c0-49d2-a4c9-732e7a1f914c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T12:10:06.155285Z",
  "ready_at": "2026-10-30T12:10:10.755175Z",
  "expires_at": "2026-10-31T12:10:10.755175Z"
}
```

`GET /api/admin/v1/reports/exports/78a95eb7-38c0-49d2-a4c9-732e7a1f914c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e69d7c71-d37f-4b0e-aa50-ebed94532a41` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e69d7c71-d37f-4b0e-aa50-ebed94532a41",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a3cbc94e-1d7e-466a-9268-2f92e675fc84"
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
  "device_ref": "sandbox-3518"
}
```

```json
{
  "challenge_id": "1c562330-210a-4d4a-a2e1-9eea7fca9858",
  "expires_at": "2026-10-30T12:15:11.496386819Z",
  "resend_available_at": "2026-10-30T12:10:12.496386819Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "969872",
  "sent_at": "2026-10-30T12:10:11.498480111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c562330-210a-4d4a-a2e1-9eea7fca9858",
  "code": "969872",
  "device_ref": "sandbox-3518"
}
```

```json
{
  "session_id": "1e15a566-e043-4919-a77a-afcba6e80ccf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzExMSwiaWF0IjoxNzkzMzYyMjExLCJqdGkiOiI3YjNkYzRkOS1jYTYxLTQ3ZGYtOWY3My0zNTM4Yjk3M2ZiZDkiLCJzaWQiOiIxZTE1YTU2Ni1lMDQzLTQ5MTktYTc3YS1hZmNiYTZlODBjY2YifQ.3eeGc4jRhsY0JqZLp6zIRjpJJ-kkHS5fsBhJt7xwCXw",
  "access_expires_at": "2026-10-30T12:25:11.706067133Z",
  "refresh_token": "qJvCTn5SuuNGtc4-E8O3Zbld17Jp-Lsok96a1_Wiu3E",
  "refresh_expires_at": "2026-11-29T12:10:11.70568757Z",
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
  "command_id": "33e7f3ea-7b3e-45e6-a388-414db6bcab1a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:12Z",
    "sequence": 1793362212271
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "47a14c37-647e-45dc-a4b3-ec2c952f2a4b",
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
  "last_heartbeat_at": "2026-10-30T12:10:12.287224Z",
  "last_location_at": "2026-10-30T12:10:12.287224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "df8ebbc3-72fa-4e48-9325-e0d3cc8d37db",
  "points": [
    {
      "sequence": 1793362214489,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:09:14Z"
    },
    {
      "sequence": 1793362214498,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T12:10:14Z"
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
  "session_id": "ad86151a-cb71-48e5-a24b-15c8781018e3",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMTQsImlhdCI6MTc5MzM2MjIxNCwianRpIjoiNzgwYTkxODUtMTQ4MC00YzlkLTk5YmQtNTMzMmNjNWE2M2YyIiwic2lkIjoiYWQ4NjE1MWEtY2I3MS00OGU1LWEyNGItMTVjODc4MTAxOGUzIn0.XHjtJcz14LImDdsPmkjhb2JbZpIAtwZbd74TwI_yGFI",
  "access_expires_at": "2026-10-30T12:25:14.923396893Z",
  "refresh_token": "t0DEOvtv52pRgyLlqgMJyMrXsXQRHbEYKaK9kEP6Q6g",
  "refresh_expires_at": "2026-10-31T00:10:14.923054905Z",
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
      "id": "121816a5-4882-468a-8a3c-5a2d5912ce02",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T12:10:14Z",
        "track_point_id": "4410f16a-70a6-47f6-aa4a-a6c46f87f289",
        "work_session_id": "47a14c37-647e-45dc-a4b3-ec2c952f2a4b"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T12:10:14Z",
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/121816a5-4882-468a-8a3c-5a2d5912ce02/confirm` → **200**

```json
{
  "command_id": "a5e43613-ac52-49c0-afc9-751ad7e4bd8e",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "121816a5-4882-468a-8a3c-5a2d5912ce02",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T12:10:14Z",
    "track_point_id": "4410f16a-70a6-47f6-aa4a-a6c46f87f289",
    "work_session_id": "47a14c37-647e-45dc-a4b3-ec2c952f2a4b"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T12:10:14Z",
  "reason": null,
  "reviewed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reviewed_at": "2026-10-30T12:10:16.716198Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/121816a5-4882-468a-8a3c-5a2d5912ce02/dismiss` → **409**

```json
{
  "command_id": "9117d74a-0deb-48b8-a16f-94486095e078",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/121816a5-4882-468a-8a3c-5a2d5912ce02/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4fed02ae-8126-4128-91f2-d9900cba4637"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1aaa3811-54b2-4fc1-b6ea-0a5e0c82fccb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "d0e968a9-6062-4352-8d44-1968269f7101",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "raised_at": "2026-10-30T12:10:17.125652Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/d0e968a9-6062-4352-8d44-1968269f7101/dismiss` → **200**

```json
{
  "command_id": "17027646-dcd5-44e8-b136-4ed8417c00f9",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "d0e968a9-6062-4352-8d44-1968269f7101",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "raised_at": "2026-10-30T12:10:17.125652Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reviewed_at": "2026-10-30T12:10:17.332466Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "35cdd60c-22d1-46db-9297-e45a25c061b8",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "121816a5-4882-468a-8a3c-5a2d5912ce02"
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
      "actor_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:10:17.548879Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 121816a5-4882-468a-8a3c-5a2d5912ce02 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "3d0e4288-e8d5-49ac-a4fd-8da900a0b540",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMTgsImlhdCI6MTc5MzM2MjIxOCwianRpIjoiZDU4MjYwYzMtMzA1OC00M2M1LWFlNjEtMTE4YjBmYTQwOTkzIiwic2lkIjoiM2QwZTQyODgtZThkNS00OWFjLWE0ZmQtOGRhOTAwYTBiNTQwIn0.RF4caU9xjRMYCl3IhF__27TXndkGfdcGRMB4fyo7R7Y",
  "access_expires_at": "2026-10-30T12:25:18.161038771Z",
  "refresh_token": "BQMISqbEjYyXddH727pc3i41oGRnmWc7DtvPOyxesZ8",
  "refresh_expires_at": "2026-10-31T00:10:18.16065329Z",
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
      "actor_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:10:17.548879Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f019a930-2fba-4543-9760-472ebaf00c9b",
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
  "session_id": "47a14c37-647e-45dc-a4b3-ec2c952f2a4b",
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
  "last_heartbeat_at": "2026-10-30T12:10:12.287224Z",
  "last_location_at": "2026-10-30T12:10:12.287224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/47a14c37-647e-45dc-a4b3-ec2c952f2a4b/close` → **200**

```json
{
  "command_id": "5f196ff2-a101-4eab-897e-df7bf4e99e81",
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
  "session_id": "f7eaf80d-152b-460a-bdd4-facb9d2faa1f",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMTksImlhdCI6MTc5MzM2MjIxOSwianRpIjoiYzg3OGNjMGYtYTg0YS00YzFjLWIxMGYtYjUzMzIwMGU1YWI2Iiwic2lkIjoiZjdlYWY4MGQtMTUyYi00NjBhLWJkZDQtZmFjYjlkMmZhYTFmIn0.z0XRYWF9ByUeVh7QtLaS_ug38dfqBJDHgdU1OfKRJ9A",
  "access_expires_at": "2026-10-30T12:25:19.360557706Z",
  "refresh_token": "1qFilnbkGF95IpQE0AzfIxLRKzdxeXP7e5CYn0dgmeU",
  "refresh_expires_at": "2026-10-31T00:10:19.360173226Z",
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
  "command_id": "62c58496-48af-4d30-b6ab-d7274bf260ed",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:10:19.75078Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "62c58496-48af-4d30-b6ab-d7274bf260ed",
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
  "changed_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T12:10:19.75078Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48899010420",
  "device_ref": "sandbox-11127"
}
```

```json
{
  "challenge_id": "df612a00-b9c9-4147-92aa-1c1bc740b9e4",
  "expires_at": "2026-10-30T12:15:20.15392124Z",
  "resend_available_at": "2026-10-30T12:10:21.15392124Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48899010420` → **200**

```json
{
  "phone": "+48899010420",
  "audience": "CLIENT",
  "code": "241578",
  "sent_at": "2026-10-30T12:10:20.155944507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df612a00-b9c9-4147-92aa-1c1bc740b9e4",
  "code": "241578",
  "device_ref": "sandbox-11127"
}
```

```json
{
  "session_id": "aa7baa83-8197-457e-97a3-4b10f92d26db",
  "subject": {
    "type": "CLIENT",
    "id": "53c74888-00e6-4acc-9934-1bbaba7eb8b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2M3NDg4OC0wMGU2LTRhY2MtOTkzNC0xYmJhYmE3ZWI4YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTIwLCJpYXQiOjE3OTMzNjIyMjAsImp0aSI6IjJkNTBhMDk0LWRkNGYtNGYzNS04MzI4LWI0NGRiNGQ0MjEyYSIsInNpZCI6ImFhN2JhYTgzLTgxOTctNDU3ZS05N2EzLTRiMTBmOTJkMjZkYiJ9.k5XKVCZtBuHXy1iUo65F60uPBY8yvHHVx448VLpKVYs",
  "access_expires_at": "2026-10-30T12:25:20.368626643Z",
  "refresh_token": "3NI1815z2RoPH3Px8XYEMheSVTk03N75Ab14ZPYU4qM",
  "refresh_expires_at": "2026-11-29T12:10:20.368325738Z",
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
  "correlation_id": "3e9880b7-62c4-4499-83ef-e5cf6e5c7197"
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
  "device_ref": "sandbox-22712"
}
```

```json
{
  "challenge_id": "bf153fc6-355f-409f-af02-676559969ec4",
  "expires_at": "2026-10-30T12:15:20.931730077Z",
  "resend_available_at": "2026-10-30T12:10:21.931730077Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "212878",
  "sent_at": "2026-10-30T12:10:20.933717777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf153fc6-355f-409f-af02-676559969ec4",
  "code": "212878",
  "device_ref": "sandbox-22712"
}
```

```json
{
  "session_id": "1247dd4c-fcdc-49bf-8662-2ae0c96e45a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEyMSwiaWF0IjoxNzkzMzYyMjIxLCJqdGkiOiIxYWY2YjRiOC1kYmY5LTRiZjgtYTc3Yy03OWRkZTgzNTYzYmUiLCJzaWQiOiIxMjQ3ZGQ0Yy1mY2RjLTQ5YmYtODY2Mi0yYWUwYzk2ZTQ1YTkifQ.bLvN2uVx7UIRunOIqPj6AxmMuY-UB4_x4VZcKfUcqzs",
  "access_expires_at": "2026-10-30T12:25:21.140283855Z",
  "refresh_token": "zeryoWt53XVmsrjZ87gMZ346udEnzwxnl2OejGHqlxY",
  "refresh_expires_at": "2026-11-29T12:10:21.139934297Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "78c66e6d-a704-45ef-a991-f607f1ca9923",
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
  "last_heartbeat_at": "2026-10-30T12:09:58.315568Z",
  "last_location_at": "2026-10-30T12:09:58.315568Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/78c66e6d-a704-45ef-a991-f607f1ca9923/handover` → **200**

```json
{
  "command_id": "bc2cb60a-36de-4223-99e7-e0c0da20751b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "78c66e6d-a704-45ef-a991-f607f1ca9923",
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
  "last_heartbeat_at": "2026-10-30T12:09:58.315568Z",
  "last_location_at": "2026-10-30T12:09:58.315568Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/78c66e6d-a704-45ef-a991-f607f1ca9923/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:21Z",
    "sequence": 1793362221699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "78c66e6d-a704-45ef-a991-f607f1ca9923",
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
  "last_heartbeat_at": "2026-10-30T12:10:21.714684Z",
  "last_location_at": "2026-10-30T12:10:21.714684Z",
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
  "session_id": "78c66e6d-a704-45ef-a991-f607f1ca9923",
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
  "last_heartbeat_at": "2026-10-30T12:10:21.714684Z",
  "last_location_at": "2026-10-30T12:10:21.714684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/78c66e6d-a704-45ef-a991-f607f1ca9923/close` → **200**

```json
{
  "command_id": "939579ee-1902-4340-877f-9497318be88b",
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
  "correlation_id": "e4689c7e-cc05-44a0-a943-0e399241fdb8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671011696",
  "device_ref": "sandbox-7061"
}
```

```json
{
  "challenge_id": "052191fb-c3dc-47b5-91da-5ded15bae8bf",
  "expires_at": "2026-10-30T12:15:22.709805Z",
  "resend_available_at": "2026-10-30T12:10:23.709805Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671011696` → **200**

```json
{
  "phone": "+380671011696",
  "audience": "CLIENT",
  "code": "569630",
  "sent_at": "2026-10-30T12:10:22.711738022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "052191fb-c3dc-47b5-91da-5ded15bae8bf",
  "code": "569630",
  "device_ref": "sandbox-7061"
}
```

```json
{
  "session_id": "e1c873f8-0bde-464a-8d9b-99d5d78d9446",
  "subject": {
    "type": "CLIENT",
    "id": "62169666-7a41-4a29-a280-6d9abf29ce18"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjE2OTY2Ni03YTQxLTRhMjktYTI4MC02ZDlhYmYyOWNlMTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTIyLCJpYXQiOjE3OTMzNjIyMjIsImp0aSI6ImE4YTc0ODE4LWMzYzUtNGI3NC1iOWZiLTdmZDM1OTFhNzkxMCIsInNpZCI6ImUxYzg3M2Y4LTBiZGUtNDY0YS04ZDliLTk5ZDVkNzhkOTQ0NiJ9.njcMEiZ45tK45rKg9Q171SHkcTtGF_qM9QhdP3nAbaQ",
  "access_expires_at": "2026-10-30T12:25:22.913198187Z",
  "refresh_token": "_4OJ7VEvBll6wj1xE3QqB1rm-D9gy9EY2mMNFOmWv2E",
  "refresh_expires_at": "2026-11-29T12:10:22.912857322Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "cee7fb6e-b86a-4694-8760-f7921e991e21",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "a29c7731-ec14-4e33-9621-e5bb2dc29817",
  "upload_path": "/api/rider/v1/uploads/a29c7731-ec14-4e33-9621-e5bb2dc29817",
  "expires_at": "2026-10-30T12:25:23.107865435Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/a29c7731-ec14-4e33-9621-e5bb2dc29817` → **200**

```json
{
  "file_id": "a29c7731-ec14-4e33-9621-e5bb2dc29817",
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
  "command_id": "cfb13765-c88e-4576-b134-044745d8b0d4",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "dd8566d2-68f7-4cf2-a5b5-bd4d54631c81",
  "upload_path": "/api/rider/v1/uploads/dd8566d2-68f7-4cf2-a5b5-bd4d54631c81",
  "expires_at": "2026-10-30T12:25:23.323531855Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/dd8566d2-68f7-4cf2-a5b5-bd4d54631c81` → **200**

```json
{
  "file_id": "dd8566d2-68f7-4cf2-a5b5-bd4d54631c81",
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
  "command_id": "f9045328-2911-4320-b22b-ba5154e43be8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "62b83f10-19bd-4290-8987-31b34ac45b61",
  "upload_path": "/api/rider/v1/uploads/62b83f10-19bd-4290-8987-31b34ac45b61",
  "expires_at": "2026-10-30T12:25:23.531548359Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/62b83f10-19bd-4290-8987-31b34ac45b61` → **200**

```json
{
  "file_id": "62b83f10-19bd-4290-8987-31b34ac45b61",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "41e60c4d-9bcb-4117-91e3-aaa2e4be74e5",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "62b83f10-19bd-4290-8987-31b34ac45b61"
  ]
}
```

```json
{
  "id": "72790103-ca11-4b4e-b286-5a14ebad851d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:10:23.74393Z",
  "updated_at": "2026-10-30T12:10:23.74393Z",
  "respond_by": "2026-10-30T16:10:23.74393Z",
  "messages": [
    {
      "id": "39d157b7-9474-42f0-b7f3-43cd446fcdf3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:10:23.74467Z",
      "attachments": [
        {
          "file_id": "62b83f10-19bd-4290-8987-31b34ac45b61",
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
  "session_id": "58c1844f-ef33-42e6-b500-aa73a3a23f7b",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMjQsImlhdCI6MTc5MzM2MjIyNCwianRpIjoiNzQ2Y2ZjZjAtYWUxMi00YWJlLWE2ODQtNDM5MWZlMzA5OGI1Iiwic2lkIjoiNThjMTg0NGYtZWYzMy00MmU2LWI1MDAtYWE3M2EzYTIzZjdiIn0.t4Qh6S0Pd63MnwKfjP9OBWXiZCxdIH0d0KUtO8DbF3I",
  "access_expires_at": "2026-10-30T12:25:24.17729423Z",
  "refresh_token": "NxHQ4d-fP-exxH8Di0ohA7UfO4PxugzF-qw8okG23rE",
  "refresh_expires_at": "2026-10-31T00:10:24.176895812Z",
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
  "session_id": "cd90fb53-47d7-463d-b8ae-3de09417960f",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMjQsImlhdCI6MTc5MzM2MjIyNCwianRpIjoiYTBkZmFiYjUtMWM2YS00NTJiLWE2ODgtNGRmNDJkMDEwZWNkIiwic2lkIjoiY2Q5MGZiNTMtNDdkNy00NjNkLWI4YWUtM2RlMDk0MTc5NjBmIn0.WzV3EaG4_fr_9CQUMj9h_EOVnd1u87msGgb5QKoQeg8",
  "access_expires_at": "2026-10-30T12:25:24.569403333Z",
  "refresh_token": "y7nsIxLdpU24zhKeJQ9xXHPepUHTZwPTCLdn-UBnjq8",
  "refresh_expires_at": "2026-10-31T00:10:24.568936186Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/72790103-ca11-4b4e-b286-5a14ebad851d/attachments/62b83f10-19bd-4290-8987-31b34ac45b61` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "74a64bda-cda8-4f6b-871a-0fe0aa748523",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b8981864-a425-4121-b592-c51d056cfaac",
  "upload_path": "/api/operator/v1/uploads/b8981864-a425-4121-b592-c51d056cfaac",
  "expires_at": "2026-10-30T12:25:24.769555404Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b8981864-a425-4121-b592-c51d056cfaac` → **200**

```json
{
  "file_id": "b8981864-a425-4121-b592-c51d056cfaac",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/72790103-ca11-4b4e-b286-5a14ebad851d` → **200**

```json
{
  "id": "72790103-ca11-4b4e-b286-5a14ebad851d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T12:10:23.74393Z",
  "updated_at": "2026-10-30T12:10:23.74393Z",
  "respond_by": "2026-10-30T16:10:23.74393Z",
  "messages": [
    {
      "id": "39d157b7-9474-42f0-b7f3-43cd446fcdf3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:10:23.74467Z",
      "attachments": [
        {
          "file_id": "62b83f10-19bd-4290-8987-31b34ac45b61",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/72790103-ca11-4b4e-b286-5a14ebad851d/comments` → **200**

```json
{
  "command_id": "ad128013-0c3d-48a5-a9a0-98d25676ec2a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b8981864-a425-4121-b592-c51d056cfaac"
  ]
}
```

```json
{
  "id": "72790103-ca11-4b4e-b286-5a14ebad851d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:10:23.74393Z",
  "updated_at": "2026-10-30T12:10:25.163072Z",
  "respond_by": "2026-10-30T16:10:23.74393Z",
  "messages": [
    {
      "id": "39d157b7-9474-42f0-b7f3-43cd446fcdf3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:10:23.74467Z",
      "attachments": [
        {
          "file_id": "62b83f10-19bd-4290-8987-31b34ac45b61",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "098190d0-eee6-48ce-8589-b9fe9ed302da",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:10:25.162745Z",
      "attachments": [
        {
          "file_id": "b8981864-a425-4121-b592-c51d056cfaac",
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

`GET /api/rider/v1/support/cases/72790103-ca11-4b4e-b286-5a14ebad851d` → **200**

```json
{
  "id": "72790103-ca11-4b4e-b286-5a14ebad851d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T12:10:23.74393Z",
  "updated_at": "2026-10-30T12:10:25.163072Z",
  "respond_by": "2026-10-30T16:10:23.74393Z",
  "messages": [
    {
      "id": "39d157b7-9474-42f0-b7f3-43cd446fcdf3",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "62169666-7a41-4a29-a280-6d9abf29ce18",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T12:10:23.74467Z",
      "attachments": [
        {
          "file_id": "62b83f10-19bd-4290-8987-31b34ac45b61",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "098190d0-eee6-48ce-8589-b9fe9ed302da",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T12:10:25.162745Z",
      "attachments": [
        {
          "file_id": "b8981864-a425-4121-b592-c51d056cfaac",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/72790103-ca11-4b4e-b286-5a14ebad851d/attachments/b8981864-a425-4121-b592-c51d056cfaac` → **200**

Done: support case 72790103-ca11-4b4e-b286-5a14ebad851d, rider attachment 62b83f10-19bd-4290-8987-31b34ac45b61, operator attachment b8981864-a425-4121-b592-c51d056cfaac.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733157696",
  "device_ref": "sandbox-22141"
}
```

```json
{
  "challenge_id": "07e49d5a-6afb-404f-b991-17fa6f275b1b",
  "expires_at": "2026-10-30T12:15:25.559807127Z",
  "resend_available_at": "2026-10-30T12:10:26.559807127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733157696` → **200**

```json
{
  "phone": "+380733157696",
  "audience": "CLIENT",
  "code": "719108",
  "sent_at": "2026-10-30T12:10:25.562180413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07e49d5a-6afb-404f-b991-17fa6f275b1b",
  "code": "719108",
  "device_ref": "sandbox-22141"
}
```

```json
{
  "session_id": "b9364322-22d3-445d-a907-e921a138fffe",
  "subject": {
    "type": "CLIENT",
    "id": "fda0940f-a2a1-4f07-b246-8d44becd78bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZGEwOTQwZi1hMmExLTRmMDctYjI0Ni04ZDQ0YmVjZDc4YmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTI1LCJpYXQiOjE3OTMzNjIyMjUsImp0aSI6Ijg4NmUxMzhmLTliMTctNDhiMC05ZjhmLTAxZDZlYjEyOGI2YiIsInNpZCI6ImI5MzY0MzIyLTIyZDMtNDQ1ZC1hOTA3LWU5MjFhMTM4ZmZmZSJ9.hcsfxTt7HOwYQoSjF18fiuFY9lDyoClnphmDS-oEPNY",
  "access_expires_at": "2026-10-30T12:25:25.762836282Z",
  "refresh_token": "KZht4tlDxPd1JwvjIw3gEBLyji6bRXm7N-zPqi_cLwk",
  "refresh_expires_at": "2026-11-29T12:10:25.762507581Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6ba4d6fb-58bf-46ca-b2e3-29cfeca715c3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "fa8b70d4-46f4-4365-97b7-302fd3b58bc6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-fa8b70d4-46f4-4365-97b7-302fd3b58bc6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "95ef6d2bdd8bdb412b546aff1cca3e0f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=fa8b70d4-46f4-4365-97b7-302fd3b58bc6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733157696"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=fa8b70d4-46f4-4365-97b7-302fd3b58bc6",
  "expires_at": "2026-10-30T12:40:25.939119Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/fa8b70d4-46f4-4365-97b7-302fd3b58bc6` → **200**

```json
{
  "id": "fa8b70d4-46f4-4365-97b7-302fd3b58bc6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T12:40:25.939119Z",
  "card": {
    "id": "d44b9ac1-1734-4969-9500-01f7d40ffe0f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6774",
    "card_type": "Visa",
    "created_at": "2026-10-30T12:10:26.143293Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d791fe9a-e391-4510-b632-4a97112a437d",
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
  "id": "bfd199a6-3f3e-45ce-ab32-c2e4663fc897",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:26.350388Z",
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
  "command_id": "ae2e9c38-c3df-4fff-b842-b73ea766a365",
  "quote_id": "bfd199a6-3f3e-45ce-ab32-c2e4663fc897",
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
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c` → **200**

```json
{
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c` → **200**

```json
{
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
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

`GET /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c` → **200**

```json
{
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c/switch-to-cash` → **200**

```json
{
  "command_id": "5c3d34f1-e4c3-4385-b1b3-ce713a14b495",
  "expected_version": 3
}
```

```json
{
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c/switch-to-cash` → **409**

```json
{
  "command_id": "1f202af7-b222-4a27-bee0-34eb9985c265",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8f7607b2-8e47-41c2-b39c-29369602cf8e"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c` → **200**

```json
{
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f3da022a-0a43-44e7-b8ae-a0fce433d79c/cancel` → **200**

```json
{
  "command_id": "f206a1d7-8b61-4fa9-a9d9-c331a42d6995",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f3da022a-0a43-44e7-b8ae-a0fce433d79c",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fda0940f-a2a1-4f07-b246-8d44becd78bf",
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
  "created_at": "2026-10-30T12:10:26.54532Z",
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
  "session_id": "86b83f72-1182-4803-97d8-f6a196c03f41",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMjksImlhdCI6MTc5MzM2MjIyOSwianRpIjoiYzIyYTA5ZGMtMTYzZC00YjdlLWIyZjQtMjE1MjI5YzZkMzc0Iiwic2lkIjoiODZiODNmNzItMTE4Mi00ODAzLTk3ZDgtZjZhMTk2YzAzZjQxIn0.jWpU3sJUBH7uNW8Qm_KVUMolqWmycvQgDTKOwNcTQQY",
  "access_expires_at": "2026-10-30T12:25:29.349903653Z",
  "refresh_token": "vxOscix2ZVBT1O9z3CzeDCZpmeOUf-ueSZ6yqehIFXg",
  "refresh_expires_at": "2026-10-31T00:10:29.349601337Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8040"
}
```

```json
{
  "challenge_id": "5f0893de-7ab6-4df6-92f8-0439dce10128",
  "expires_at": "2026-10-30T12:15:29.5283439Z",
  "resend_available_at": "2026-10-30T12:10:30.5283439Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "028710",
  "sent_at": "2026-10-30T12:10:29.530759292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f0893de-7ab6-4df6-92f8-0439dce10128",
  "code": "028710",
  "device_ref": "sandbox-8040"
}
```

```json
{
  "session_id": "51240383-b548-44cf-b83c-b5cda134ae28",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEyOSwiaWF0IjoxNzkzMzYyMjI5LCJqdGkiOiIzYTgzOTQ4YS0wNGU5LTQyYzctODQ2Zi0zOTQ4ODU4YTU0NTAiLCJzaWQiOiI1MTI0MDM4My1iNTQ4LTQ0Y2YtYjgzYy1iNWNkYTEzNGFlMjgifQ.AuntvXtNTOjs59Ec9W7kTu856U2aOBmjbFdsh4-Xykw",
  "access_expires_at": "2026-10-30T12:25:29.73103549Z",
  "refresh_token": "7kHsEazH5k9O4GdjuWiqsuEAcfE1oJ_mvSXTeXjgAZg",
  "refresh_expires_at": "2026-11-29T12:10:29.730727526Z",
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
      "actor_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T12:10:17.548879Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T12:10:18.557866Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "7ef80733-dc6c-4fcb-b68b-1d32b1700712",
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
  "device_ref": "sandbox-15846"
}
```

```json
{
  "challenge_id": "38956e4f-f334-4e73-953e-1e2b7c0a98b0",
  "expires_at": "2026-10-30T12:15:30.457375904Z",
  "resend_available_at": "2026-10-30T12:10:31.457375904Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "997245",
  "sent_at": "2026-10-30T12:10:30.459147993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38956e4f-f334-4e73-953e-1e2b7c0a98b0",
  "code": "997245",
  "device_ref": "sandbox-15846"
}
```

```json
{
  "session_id": "d87984d0-6d69-4b29-9ba2-90aa1a2bd5f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEzMCwiaWF0IjoxNzkzMzYyMjMwLCJqdGkiOiJkNzYxZjViZC03MjYyLTQ3MjQtYjY2ZS0zNTJiOGZkNTg1NDAiLCJzaWQiOiJkODc5ODRkMC02ZDY5LTRiMjktOWJhMi05MGFhMWEyYmQ1ZjQifQ.h02qGQi4mYgEFkbWn0lUHlhOy2wwCUVHgOhErB10Rkc",
  "access_expires_at": "2026-10-30T12:25:30.655197707Z",
  "refresh_token": "NDnSDSIKyGbzxi00hT_HcJeAbEoB_xiLMxvJeAWaV1M",
  "refresh_expires_at": "2026-11-29T12:10:30.654813106Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:03.338759Z",
  "last_location_at": "2026-10-30T12:10:03.338759Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f9966901-027f-4844-aa8c-90bc0499b34f/handover` → **200**

```json
{
  "command_id": "0c20674d-15f9-4015-a062-7a3a7b7391b9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:03.338759Z",
  "last_location_at": "2026-10-30T12:10:03.338759Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f9966901-027f-4844-aa8c-90bc0499b34f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:31Z",
    "sequence": 1793362231197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:31.213073Z",
  "last_location_at": "2026-10-30T12:10:31.213073Z",
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
  "command_id": "8a0d90ba-3c3d-477e-8266-83eee363ecab",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:31Z",
    "sequence": 1793362231581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "613d1075-cbf5-4c5a-81fb-678569f9a255",
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
  "last_heartbeat_at": "2026-10-30T12:10:31.596475Z",
  "last_location_at": "2026-10-30T12:10:31.596475Z",
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
  "session_id": "ddb3193b-1bad-4810-b9ec-6c6541c77128",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMxMzEsImlhdCI6MTc5MzM2MjIzMSwianRpIjoiODJkM2MzMjMtNWM5OS00N2JhLWEzMTEtNjgwOTJlNjBmNjZhIiwic2lkIjoiZGRiMzE5M2ItMWJhZC00ODEwLWI5ZWMtNmM2NTQxYzc3MTI4In0.O1trGI_jRaa5HOsJxgg6wv8VPr4yFLlBH1U0OJMiKlI",
  "access_expires_at": "2026-10-30T12:25:31.977290167Z",
  "refresh_token": "CftM83212F4sd6wghPw95LNmJDYg7le84iz4uMuXYIA",
  "refresh_expires_at": "2026-10-31T00:10:31.976957474Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "226fffef-bdf1-476b-b964-3054f6e0afc0",
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
  "id": "5744b47b-4ec0-4608-bd4e-ffc39d813cc1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:32.161067Z",
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
  "command_id": "fc962e7e-b491-418f-bd79-d75e3892f975",
  "quote_id": "5744b47b-4ec0-4608-bd4e-ffc39d813cc1",
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
  "id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
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
  "created_at": "2026-10-30T12:10:32.350496Z",
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
    "id": "ee5dbdd0-7a1d-47bb-82d6-c39ad2705893",
    "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
    "expires_at": "2026-10-30T12:10:47.353593Z",
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

`POST /api/driver/v1/offers/ee5dbdd0-7a1d-47bb-82d6-c39ad2705893/accept` → **200**

```json
{
  "command_id": "f9a02886-6e54-4003-843c-6ae56d569133"
}
```

```json
{
  "id": "37132335-9659-430e-ac90-895ef1edd3d3",
  "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "53dc3b8a-0e36-49c7-8fb2-4d764397be97",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "53dc3b8a-0e36-49c7-8fb2-4d764397be97",
  "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
  "assignment_id": "37132335-9659-430e-ac90-895ef1edd3d3",
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

`POST /api/driver/v1/work-sessions/613d1075-cbf5-4c5a-81fb-678569f9a255/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T12:10:33Z",
    "sequence": 1793362233252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "613d1075-cbf5-4c5a-81fb-678569f9a255",
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
  "last_heartbeat_at": "2026-10-30T12:10:33.267015Z",
  "last_location_at": "2026-10-30T12:10:33.267015Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/53dc3b8a-0e36-49c7-8fb2-4d764397be97/arrive` → **200**

```json
{
  "command_id": "24323e20-ed98-4478-95a2-ca1e352ce574",
  "expected_version": 0
}
```

```json
{
  "id": "53dc3b8a-0e36-49c7-8fb2-4d764397be97",
  "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
  "assignment_id": "37132335-9659-430e-ac90-895ef1edd3d3",
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
  "arrived_at": "2026-10-30T12:10:33.467502Z",
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

`POST /api/driver/v1/trips/53dc3b8a-0e36-49c7-8fb2-4d764397be97/start` → **200**

```json
{
  "command_id": "15a8b1a3-2937-4a60-a8cc-c0ff69bfb7c8",
  "expected_version": 1
}
```

```json
{
  "id": "53dc3b8a-0e36-49c7-8fb2-4d764397be97",
  "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
  "assignment_id": "37132335-9659-430e-ac90-895ef1edd3d3",
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
  "arrived_at": "2026-10-30T12:10:33.467502Z",
  "started_at": "2026-10-30T12:10:33.656906Z",
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

`POST /api/driver/v1/trips/53dc3b8a-0e36-49c7-8fb2-4d764397be97/complete` → **200**

```json
{
  "command_id": "15cf7b06-adc1-418d-b5b5-8293af7d8de8",
  "expected_version": 2,
  "reported_at": "2026-10-30T12:10:33Z",
  "cash_received": true
}
```

```json
{
  "id": "53dc3b8a-0e36-49c7-8fb2-4d764397be97",
  "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
  "assignment_id": "37132335-9659-430e-ac90-895ef1edd3d3",
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
  "arrived_at": "2026-10-30T12:10:33.467502Z",
  "started_at": "2026-10-30T12:10:33.656906Z",
  "completed_at": "2026-10-30T12:10:33.852366Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/fd9d773b-1cc0-4757-872e-5f666bdc5eb0` → **200**

```json
{
  "id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
  "short_number": 28,
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
    "id": "37132335-9659-430e-ac90-895ef1edd3d3",
    "order_id": "fd9d773b-1cc0-4757-872e-5f666bdc5eb0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "53dc3b8a-0e36-49c7-8fb2-4d764397be97",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T12:10:32.350496Z",
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
  "session_id": "f9966901-027f-4844-aa8c-90bc0499b34f",
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
  "last_heartbeat_at": "2026-10-30T12:10:31.213073Z",
  "last_location_at": "2026-10-30T12:10:31.213073Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f9966901-027f-4844-aa8c-90bc0499b34f/close` → **200**

```json
{
  "command_id": "ee943825-79fd-4014-83b4-e3aeec5ed4ea",
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
  "session_id": "613d1075-cbf5-4c5a-81fb-678569f9a255",
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
  "last_heartbeat_at": "2026-10-30T12:10:33.267015Z",
  "last_location_at": "2026-10-30T12:10:33.267015Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/613d1075-cbf5-4c5a-81fb-678569f9a255/close` → **200**

```json
{
  "command_id": "24a5dae9-efe0-406e-85bc-d205cd6bfa56",
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

Done: terminal order fd9d773b-1cc0-4757-872e-5f666bdc5eb0 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23023"
}
```

```json
{
  "challenge_id": "ee9396df-76f9-47db-a88d-558a2e5272bf",
  "expires_at": "2026-10-30T12:15:38.190524415Z",
  "resend_available_at": "2026-10-30T12:10:39.190524415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "753743",
  "sent_at": "2026-10-30T12:10:38.192536711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee9396df-76f9-47db-a88d-558a2e5272bf",
  "code": "753743",
  "device_ref": "sandbox-23023"
}
```

```json
{
  "session_id": "679d3a35-d6bf-4eb4-bc00-f884b404c5d7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEzOCwiaWF0IjoxNzkzMzYyMjM4LCJqdGkiOiIzY2UzZjU0MS1mNDk0LTRkMWEtOTlmNS0yOTI0NWU3M2JlZTciLCJzaWQiOiI2NzlkM2EzNS1kNmJmLTRlYjQtYmMwMC1mODg0YjQwNGM1ZDcifQ.nzy_ooNGfxZh5T_RnaD5N0JYFZrE7vIcZB9H4B4hCBk",
  "access_expires_at": "2026-10-30T12:25:38.38767732Z",
  "refresh_token": "RV4WJYN8LAZMI8NqcyfMhHkH2zGa1EHWvDilM9oBgNQ",
  "refresh_expires_at": "2026-11-29T12:10:38.387334011Z",
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
  "device_ref": "sandbox-25030"
}
```

```json
{
  "challenge_id": "f0a39f3a-3bb8-40b2-a42f-dd6ca42a047f",
  "expires_at": "2026-10-30T12:15:38.79217191Z",
  "resend_available_at": "2026-10-30T12:10:39.79217191Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "749957",
  "sent_at": "2026-10-30T12:10:38.794278412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0a39f3a-3bb8-40b2-a42f-dd6ca42a047f",
  "code": "749957",
  "device_ref": "sandbox-25030"
}
```

```json
{
  "session_id": "e9a6ba22-8e48-46ac-a173-8a604f15ba35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEzOCwiaWF0IjoxNzkzMzYyMjM4LCJqdGkiOiJlMzlkYWVjNi1iY2FmLTQ1YmMtOGNkMS05MjQwMmVkZmIzNzQiLCJzaWQiOiJlOWE2YmEyMi04ZTQ4LTQ2YWMtYTE3My04YTYwNGYxNWJhMzUifQ.BXiiGTWH-FYlh9QAhjarhc4LifHzPKJnO7cSlHdZRjs",
  "access_expires_at": "2026-10-30T12:25:38.998958685Z",
  "refresh_token": "mI1sURbX8JZ6LgeBG0PM_n2cXj4k3xov9N5UBsig26I",
  "refresh_expires_at": "2026-11-29T12:10:38.998547763Z",
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
  "device_ref": "sandbox-27315"
}
```

```json
{
  "challenge_id": "d1ec2491-6e7b-445a-82bf-8cae3d30e7f2",
  "expires_at": "2026-10-30T12:15:39.356165816Z",
  "resend_available_at": "2026-10-30T12:10:40.356165816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "360863",
  "sent_at": "2026-10-30T12:10:39.358462812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1ec2491-6e7b-445a-82bf-8cae3d30e7f2",
  "code": "360863",
  "device_ref": "sandbox-27315"
}
```

```json
{
  "session_id": "7d881a47-12c4-421f-904b-a07b2abaa14d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2MzEzOSwiaWF0IjoxNzkzMzYyMjM5LCJqdGkiOiI3MGZlYmU4MC01MTJmLTQ4YzQtYjhkMS0xNzk5NjQ5YzNkMmMiLCJzaWQiOiI3ZDg4MWE0Ny0xMmM0LTQyMWYtOTA0Yi1hMDdiMmFiYWExNGQifQ.maI2D7JA6tyPsSSEp3CzRYdv6hbxczBIi7Jm0HpcBRc",
  "access_expires_at": "2026-10-30T12:25:39.561398348Z",
  "refresh_token": "RbfstqeByxnC3sNrT5-EnsU-3sgR8F_0yJrvQrBHSAI",
  "refresh_expires_at": "2026-11-29T12:10:39.561044853Z",
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
  "phone": "+380691979694",
  "device_ref": "sandbox-12487"
}
```

```json
{
  "challenge_id": "bef5eb53-2ced-4fe6-812c-93fc26acd682",
  "expires_at": "2026-10-30T12:15:39.937431407Z",
  "resend_available_at": "2026-10-30T12:10:40.937431407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691979694` → **200**

```json
{
  "phone": "+380691979694",
  "audience": "CLIENT",
  "code": "866929",
  "sent_at": "2026-10-30T12:10:39.939586482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bef5eb53-2ced-4fe6-812c-93fc26acd682",
  "code": "866929",
  "device_ref": "sandbox-12487"
}
```

```json
{
  "session_id": "cb480e1e-8e7b-4eab-b491-9aae7e820d03",
  "subject": {
    "type": "CLIENT",
    "id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmQ1M2VmYS1jOTQ5LTRiM2EtOWU5Mi1kMGI1ZjYxMzViYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzYzMTQwLCJpYXQiOjE3OTMzNjIyNDAsImp0aSI6IjgzYjcyNmJkLWRiYzItNDY5YS1hOWM5LTYzNzJjYmMyNGM0NSIsInNpZCI6ImNiNDgwZTFlLThlN2ItNGVhYi1iNDkxLTlhYWU3ZTgyMGQwMyJ9.Frpx06xJzbXudvAEgmvXmrk2Mr9sZNtrs6S42vOP8rQ",
  "access_expires_at": "2026-10-30T12:25:40.160693692Z",
  "refresh_token": "RVqzyk3zti5G08oDAQnEuz_1DdNWMt-LLzi0OYDeues",
  "refresh_expires_at": "2026-11-29T12:10:40.160276101Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "261eada6-b736-4cf5-9b50-0270b04ef0d8",
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
  "id": "be7d5ca7-27f0-46bc-ba86-d69be9b6b78d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T12:15:40.353313Z",
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
  "command_id": "893fa053-186c-418f-a1f9-807a5cb8a75f",
  "quote_id": "be7d5ca7-27f0-46bc-ba86-d69be9b6b78d",
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
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T12:10:40.551584Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:10:40.551584Z",
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
  "blizz_orders_total": 29,
  "blizz_orders_cancelled_total": 15,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 18,
  "blizz_dispatch_assigned_seconds_count": 18,
  "blizz_offers_total": 20,
  "blizz_dispatch_excluded_total": 10,
  "blizz_sms_sent_total": 77
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.56526129
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 9.266236063
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.140065069
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 21.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 70.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/dac10fd8-93c2-445f-a3fc-300afbb24248` → **200**

```json
{
  "id": "dac10fd8-93c2-445f-a3fc-300afbb24248",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6bd53efa-c949-4b3a-9e92-d0b5f6135bb0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T12:10:40.551584Z",
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
  "session_id": "62d3111d-0a32-479b-8f42-5b2c4afdbe22",
  "subject": {
    "type": "STAFF",
    "id": "6fbc1d2f-1a95-4712-a755-694a60e75cab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJjMWQyZi0xYTk1LTQ3MTItYTc1NS02OTRhNjBlNzVjYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjMzMjMsImlhdCI6MTc5MzM2MjQyMywianRpIjoiNDkwNTM3NDEtMGI2My00ZTVjLTg2YzYtMDg5MjA5ZjBiZmFhIiwic2lkIjoiNjJkMzExMWQtMGEzMi00NzliLThmNDItNWIyYzRhZmRiZTIyIn0.rEvMo97aIcjaZLf7_uYOj9UNV0HWbYTRKm7L4SCDwOI",
  "access_expires_at": "2026-10-30T12:28:43.423124045Z",
  "refresh_token": "kePMZLvgbghRhSyqpfEAZY9l2JuxX1VDsdzYkl24u0I",
  "refresh_expires_at": "2026-10-31T00:13:43.422678222Z",
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
  "id": "0a377fbd-acf9-4cb8-a079-a5db8220ce17",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.619224Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.61928Z",
  "updated_at": "2026-10-30T12:13:43.630468Z",
  "finished_at": "2026-10-30T12:13:43.630468Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/0a377fbd-acf9-4cb8-a079-a5db8220ce17` → **200**

```json
{
  "run": {
    "id": "0a377fbd-acf9-4cb8-a079-a5db8220ce17",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:13:43.619224Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:13:43.61928Z",
    "updated_at": "2026-10-30T12:13:43.630468Z",
    "finished_at": "2026-10-30T12:13:43.630468Z",
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
  "id": "0a377fbd-acf9-4cb8-a079-a5db8220ce17",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.619224Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.61928Z",
  "updated_at": "2026-10-30T12:13:43.630468Z",
  "finished_at": "2026-10-30T12:13:43.630468Z",
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
  "id": "0a377fbd-acf9-4cb8-a079-a5db8220ce17",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.619224Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.61928Z",
  "updated_at": "2026-10-30T12:13:43.630468Z",
  "finished_at": "2026-10-30T12:13:43.630468Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8a100791-8192-46b8-9bae-dc4a0a51e53f` → **204**

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
  "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.962192Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.962259Z",
  "updated_at": "2026-10-30T12:13:43.969091Z",
  "finished_at": "2026-10-30T12:13:43.969091Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/4572c76d-e7fd-4f13-acee-ea2f03763920` → **200**

```json
{
  "run": {
    "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:13:43.962192Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:13:43.962259Z",
    "updated_at": "2026-10-30T12:13:43.969091Z",
    "finished_at": "2026-10-30T12:13:43.969091Z",
    "version": 1
  },
  "items": [
    {
      "id": "d27eebd8-dc4f-4215-9007-e8561b651cc1",
      "run_id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "f8c1f7a6cbf0ea83923a42165914c37cc29640e5068c5d62df913bd8d8559458",
      "reference_display": "sandbox-reconciliation-8a#####-8192-46b8-9bae-dc4a0a51e53f",
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
      "provider_at": "2026-10-30T12:13:43Z",
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
  "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.962192Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.962259Z",
  "updated_at": "2026-10-30T12:13:43.969091Z",
  "finished_at": "2026-10-30T12:13:43.969091Z",
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
  "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.962192Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.962259Z",
  "updated_at": "2026-10-30T12:13:43.969091Z",
  "finished_at": "2026-10-30T12:13:43.969091Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/d27eebd8-dc4f-4215-9007-e8561b651cc1/resolve` → **200**

```json
{
  "command_id": "797b8b77-6115-47e5-87d7-cb621ed55639",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "d27eebd8-dc4f-4215-9007-e8561b651cc1",
  "run_id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "f8c1f7a6cbf0ea83923a42165914c37cc29640e5068c5d62df913bd8d8559458",
  "reference_display": "sandbox-reconciliation-8a#####-8192-46b8-9bae-dc4a0a51e53f",
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
  "provider_at": "2026-10-30T12:13:43Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "resolved_at": "2026-10-30T12:13:44.261493Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/d27eebd8-dc4f-4215-9007-e8561b651cc1/resolve` → **200**

```json
{
  "command_id": "797b8b77-6115-47e5-87d7-cb621ed55639",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "d27eebd8-dc4f-4215-9007-e8561b651cc1",
  "run_id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "f8c1f7a6cbf0ea83923a42165914c37cc29640e5068c5d62df913bd8d8559458",
  "reference_display": "sandbox-reconciliation-8a#####-8192-46b8-9bae-dc4a0a51e53f",
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
  "provider_at": "2026-10-30T12:13:43Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
  "resolved_at": "2026-10-30T12:13:44.261493Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/d27eebd8-dc4f-4215-9007-e8561b651cc1/resolve` → **409**

```json
{
  "command_id": "a0492a9b-7cc4-4947-a1a3-def32827fa68",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/d27eebd8-dc4f-4215-9007-e8561b651cc1/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8274af5f-a17f-43c1-8046-fff71cb61348"
}
```

`GET /api/admin/v1/payment-reconciliations/4572c76d-e7fd-4f13-acee-ea2f03763920` → **200**

```json
{
  "run": {
    "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T12:13:43.962192Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T12:13:43.962259Z",
    "updated_at": "2026-10-30T12:13:44.261493Z",
    "finished_at": "2026-10-30T12:13:43.969091Z",
    "version": 2
  },
  "items": [
    {
      "id": "d27eebd8-dc4f-4215-9007-e8561b651cc1",
      "run_id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "f8c1f7a6cbf0ea83923a42165914c37cc29640e5068c5d62df913bd8d8559458",
      "reference_display": "sandbox-reconciliation-8a#####-8192-46b8-9bae-dc4a0a51e53f",
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
      "provider_at": "2026-10-30T12:13:43Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "6fbc1d2f-1a95-4712-a755-694a60e75cab",
      "resolved_at": "2026-10-30T12:13:44.261493Z",
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
      "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T12:13:43.962192Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:13:43.962259Z",
      "updated_at": "2026-10-30T12:13:44.261493Z",
      "finished_at": "2026-10-30T12:13:43.969091Z",
      "version": 2
    },
    {
      "id": "2643069c-c7fb-4c74-9123-13f495d89f38",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T12:07:00.672503Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T12:07:00.672574Z",
      "updated_at": "2026-10-30T12:07:00.677005Z",
      "finished_at": "2026-10-30T12:07:00.677005Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8a100791-8192-46b8-9bae-dc4a0a51e53f` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "4572c76d-e7fd-4f13-acee-ea2f03763920",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T12:13:43.962192Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T12:13:43.962259Z",
  "updated_at": "2026-10-30T12:13:44.261493Z",
  "finished_at": "2026-10-30T12:13:43.969091Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793362550841E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793362551017E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793362551017E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793362550841E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793362551017E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
