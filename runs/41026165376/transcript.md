# Sandbox transcript (2026-10-30T08:24:51Z, 8de554f)

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
  "correlation_id": "b3e72bad-f448-4870-b49f-e0c5b10aff8a"
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
  "session_id": "9a7c28ed-92d5-4ee8-945c-17e32e72b4da",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk1OTgsImlhdCI6MTc5MzM0ODY5OCwianRpIjoiMDYxYmNiODEtNDg5My00ZWZjLTlkZTMtNWI4YjQxY2ZmOWY2Iiwic2lkIjoiOWE3YzI4ZWQtOTJkNS00ZWU4LTk0NWMtMTdlMzJlNzJiNGRhIn0.kftBJbBFilfB_zf34uHEueYLZMnddPJrXZaKjAbdBFA",
  "access_expires_at": "2026-10-30T08:39:58.333246114Z",
  "refresh_token": "4nvf0iXt7oUz_rTmtx16cNGr9UXxH8B4mO19hJtkmIw",
  "refresh_expires_at": "2026-10-30T20:24:58.330897894Z",
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
  "session_id": "7460dae5-9717-439e-8deb-00cf00ddb16e",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2MDAsImlhdCI6MTc5MzM0ODcwMCwianRpIjoiOWE2OTZjZTgtMDQ5Zi00YzgxLWE5NjEtYTYwMmQ2OWZiY2U5Iiwic2lkIjoiNzQ2MGRhZTUtOTcxNy00MzllLThkZWItMDBjZjAwZGRiMTZlIn0.EcuiGm5MPvf1CZTE9XXUb9dnpu7Fx--ssUg3a3m10u0",
  "access_expires_at": "2026-10-30T08:40:00.297726714Z",
  "refresh_token": "5MafA0PSnHFJSomfSF0A-kmTW8ATmS6VcMF7k9R9Fu8",
  "refresh_expires_at": "2026-10-30T20:25:00.296680318Z",
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
  "device_ref": "sandbox-15456"
}
```

```json
{
  "challenge_id": "333cdaf4-9af0-4b06-99e1-326c995bdc96",
  "expires_at": "2026-10-30T08:30:00.983287431Z",
  "resend_available_at": "2026-10-30T08:25:01.983287431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "941992",
  "sent_at": "2026-10-30T08:25:00.997270529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "333cdaf4-9af0-4b06-99e1-326c995bdc96",
  "code": "941992",
  "device_ref": "sandbox-15456"
}
```

```json
{
  "session_id": "364b19de-fe1a-41df-9df5-e79d72fcf024",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTYwMSwiaWF0IjoxNzkzMzQ4NzAxLCJqdGkiOiI0NzI0NmFlZC1iYTc1LTQzNmMtOTgwNi01YzJiNWVhYzY2N2QiLCJzaWQiOiIzNjRiMTlkZS1mZTFhLTQxZGYtOWRmNS1lNzlkNzJmY2YwMjQifQ.SUeRto3De5wLO_AxYARKfdUQzv6SmeS5joFHR33ThUc",
  "access_expires_at": "2026-10-30T08:40:01.352297761Z",
  "refresh_token": "Pk5Nh__k-GtSSIoGXzMAutBiYeQhf7SjV_SAHimO4Mg",
  "refresh_expires_at": "2026-11-29T08:25:01.351333174Z",
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
  "command_id": "db6cc7a6-9a7b-4609-8e93-c64885bd0c03",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:01Z",
    "sequence": 1793348701945
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f23df918-4cee-45be-9f13-492660a61c59",
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
  "last_heartbeat_at": "2026-10-30T08:25:02.046304Z",
  "last_location_at": "2026-10-30T08:25:02.046304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639795393",
  "device_ref": "sandbox-19906"
}
```

```json
{
  "challenge_id": "99e44c3e-9664-429b-ac24-9792cda046f6",
  "expires_at": "2026-10-30T08:30:02.364574152Z",
  "resend_available_at": "2026-10-30T08:25:03.364574152Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639795393` → **200**

```json
{
  "phone": "+380639795393",
  "audience": "CLIENT",
  "code": "791639",
  "sent_at": "2026-10-30T08:25:02.369577209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99e44c3e-9664-429b-ac24-9792cda046f6",
  "code": "791639",
  "device_ref": "sandbox-19906"
}
```

```json
{
  "session_id": "240a0641-a361-4692-a7ee-e257ac3eb514",
  "subject": {
    "type": "CLIENT",
    "id": "d210e7b0-4960-4f3b-8416-601d313a25c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjEwZTdiMC00OTYwLTRmM2ItODQxNi02MDFkMzEzYTI1YzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NjAyLCJpYXQiOjE3OTMzNDg3MDIsImp0aSI6ImNkNmI4ZjJmLTRlYmUtNDg5My05NTg2LTM4OGVkYzk3MDM3NiIsInNpZCI6IjI0MGEwNjQxLWEzNjEtNDY5Mi1hN2VlLWUyNTdhYzNlYjUxNCJ9.WilemeC-YE9TWUymu8xUEotfF8p0BYtDHjhCsbNNYbg",
  "access_expires_at": "2026-10-30T08:40:02.686960117Z",
  "refresh_token": "Hy4reDRD-YkZuQFD2pirklb1Y2oDhStc6pOGzxJ8g5E",
  "refresh_expires_at": "2026-11-29T08:25:02.685641472Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b599608b-7a8d-43f7-ba76-aa09057fdbc2",
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
  "id": "2327bb4a-6e71-4150-b2de-792b6a162e62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:30:03.031026Z",
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
  "command_id": "f7f8cb28-2437-4e4f-accd-641bcccd798f",
  "quote_id": "2327bb4a-6e71-4150-b2de-792b6a162e62",
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
  "id": "de671c24-e31c-4f97-89e6-7871344881c8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d210e7b0-4960-4f3b-8416-601d313a25c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:25:03.434566Z",
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
    "id": "c5708c39-c9a3-44c5-b369-08b9666ff616",
    "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
    "expires_at": "2026-10-30T08:25:18.443823Z",
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

`POST /api/driver/v1/offers/c5708c39-c9a3-44c5-b369-08b9666ff616/accept` → **200**

```json
{
  "command_id": "f5b678a9-6a69-4a1c-b371-16db7cb8f3fe"
}
```

```json
{
  "id": "633468e9-8226-4b66-984c-fa9862c39a84",
  "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "947516c0-8ad4-469b-8c43-2ab311282d1f",
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
  "command_id": "264c675e-0dab-4c6e-a7f9-633bde74d1d7",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:25:04.730541671Z"
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
  "id": "947516c0-8ad4-469b-8c43-2ab311282d1f",
  "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
  "assignment_id": "633468e9-8226-4b66-984c-fa9862c39a84",
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

`POST /api/driver/v1/work-sessions/f23df918-4cee-45be-9f13-492660a61c59/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:05Z",
    "sequence": 1793348705614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f23df918-4cee-45be-9f13-492660a61c59",
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
  "last_heartbeat_at": "2026-10-30T08:25:05.645815Z",
  "last_location_at": "2026-10-30T08:25:05.645815Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/947516c0-8ad4-469b-8c43-2ab311282d1f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "eddc265b-5331-408e-8307-a09cfdf0a722",
  "expected_version": 0
}
```

```json
{
  "id": "947516c0-8ad4-469b-8c43-2ab311282d1f",
  "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
  "assignment_id": "633468e9-8226-4b66-984c-fa9862c39a84",
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
  "arrived_at": "2026-10-30T08:25:05.987951Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/947516c0-8ad4-469b-8c43-2ab311282d1f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "640f6fc1-930e-4dd7-aff6-eaebfbba41da",
  "expected_version": 1
}
```

```json
{
  "id": "947516c0-8ad4-469b-8c43-2ab311282d1f",
  "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
  "assignment_id": "633468e9-8226-4b66-984c-fa9862c39a84",
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
  "arrived_at": "2026-10-30T08:25:05.987951Z",
  "started_at": "2026-10-30T08:25:06.285119Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/947516c0-8ad4-469b-8c43-2ab311282d1f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "91463ded-f9ce-4b4d-a934-0eea4e4abdf9",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:25:06Z",
  "cash_received": true
}
```

```json
{
  "id": "947516c0-8ad4-469b-8c43-2ab311282d1f",
  "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
  "assignment_id": "633468e9-8226-4b66-984c-fa9862c39a84",
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
  "arrived_at": "2026-10-30T08:25:05.987951Z",
  "started_at": "2026-10-30T08:25:06.285119Z",
  "completed_at": "2026-10-30T08:25:06.595761Z",
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
  "session_id": "f23df918-4cee-45be-9f13-492660a61c59",
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
  "last_heartbeat_at": "2026-10-30T08:25:05.645815Z",
  "last_location_at": "2026-10-30T08:25:05.645815Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f23df918-4cee-45be-9f13-492660a61c59/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "01034ba6-45be-42fc-aacd-7ae52a7ceeaf",
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
  "command_id": "6eaaac20-e80b-4407-97f7-2e63b423db02",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:07Z",
    "sequence": 1793348707500
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
  "correlation_id": "0f7c72b7-0a22-42b1-a9e9-86225870b541",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "0b3cae9f-3dda-4bc2-a80e-36cc8ad78880",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:07Z",
    "sequence": 1793348707830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "582590a2-4d08-4167-9dd8-58b7dba4a0a4",
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
  "last_heartbeat_at": "2026-10-30T08:25:07.858021Z",
  "last_location_at": "2026-10-30T08:25:07.858021Z",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:25:04.730542Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "634b29c6-430a-44fe-8d18-998bc4b13183",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:25:08.504001997Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "582590a2-4d08-4167-9dd8-58b7dba4a0a4",
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
  "last_heartbeat_at": "2026-10-30T08:25:07.858021Z",
  "last_location_at": "2026-10-30T08:25:07.858021Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/582590a2-4d08-4167-9dd8-58b7dba4a0a4/close` → **200**

```json
{
  "command_id": "06bafe84-73cb-49db-a545-0b655314a728",
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
  "session_id": "1a8fa70c-6b4c-4d34-b290-d8cf65174d79",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2MDksImlhdCI6MTc5MzM0ODcwOSwianRpIjoiOGM1MmVjMWYtOWExYi00OTMwLTk1YzctMmZkZTM3ODgxYTY2Iiwic2lkIjoiMWE4ZmE3MGMtNmI0Yy00ZDM0LWIyOTAtZDhjZjY1MTc0ZDc5In0.DZkJBlGkWUt6BcU23A78fA1WuMRdlkxvQ-dEYp2xzUg",
  "access_expires_at": "2026-10-30T08:40:09.686000758Z",
  "refresh_token": "bNct9ngycPJDnn-M8OaMJfth5nhr_FtW2DjnPoN2fec",
  "refresh_expires_at": "2026-10-30T20:25:09.68528482Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "1095cf8e-f6c6-4856-ba49-4bd99648218f",
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
  "id": "e5a88c3d-4f46-4613-986c-f7c1cbbbf09b",
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
  "created_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "created_at": "2026-10-30T08:25:09.995313Z",
  "updated_at": "2026-10-30T08:25:09.995313Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633979692",
  "device_ref": "sandbox-5298"
}
```

```json
{
  "challenge_id": "81539b38-4212-4015-8492-c47b104a8178",
  "expires_at": "2026-10-30T08:30:10.463515159Z",
  "resend_available_at": "2026-10-30T08:25:11.463515159Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633979692` → **200**

```json
{
  "phone": "+380633979692",
  "audience": "CLIENT",
  "code": "197792",
  "sent_at": "2026-10-30T08:25:10.467671812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81539b38-4212-4015-8492-c47b104a8178",
  "code": "197792",
  "device_ref": "sandbox-5298"
}
```

```json
{
  "session_id": "58aa2bdd-d89b-46ae-b1e0-e5518c0f2370",
  "subject": {
    "type": "CLIENT",
    "id": "cad982d2-d96a-45ee-9a99-ba684f7bc388"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYWQ5ODJkMi1kOTZhLTQ1ZWUtOWE5OS1iYTY4NGY3YmMzODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NjEwLCJpYXQiOjE3OTMzNDg3MTAsImp0aSI6IjAzZDg4YmJhLTE1OTktNGVhYy05OGEyLTFhYTA5M2I2OGVmMSIsInNpZCI6IjU4YWEyYmRkLWQ4OWItNDZhZS1iMWUwLWU1NTE4YzBmMjM3MCJ9.Qll3ZXTxAkXUJEETSCkMAAxeJBadLxylPiEzgXJU4-E",
  "access_expires_at": "2026-10-30T08:40:10.773389277Z",
  "refresh_token": "tIBW36JptQ9EhHdJz9irRKwnjaE7kXUjFMkm95SgEZg",
  "refresh_expires_at": "2026-11-29T08:25:10.772717534Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633979692` → **200**

```json
{
  "client_id": "cad982d2-d96a-45ee-9a99-ba684f7bc388"
}
```

`POST /api/admin/v1/rider-wallets/cad982d2-d96a-45ee-9a99-ba684f7bc388/top-ups` → **201**

```json
{
  "command_id": "f6d3a6ba-133b-4462-9f66-19483bc2bf5b",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "cad982d2-d96a-45ee-9a99-ba684f7bc388",
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
      "id": "58c66355-c401-461a-9a2c-e43ae2d15618",
      "at": "2026-10-30T08:25:11.337166Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad51f7a8-4a6b-415e-ac80-70935cd6502f",
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
  "id": "2fc06b9a-07f9-4d65-85e5-7957b8e58a1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:30:11.644842Z",
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
      "id": "e5a88c3d-4f46-4613-986c-f7c1cbbbf09b",
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
  "device_ref": "sandbox-8207"
}
```

```json
{
  "challenge_id": "13a5ddc1-7bd6-49bd-876f-c13087a4d582",
  "expires_at": "2026-10-30T08:30:11.954159734Z",
  "resend_available_at": "2026-10-30T08:25:12.954159734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "878739",
  "sent_at": "2026-10-30T08:25:11.959008258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13a5ddc1-7bd6-49bd-876f-c13087a4d582",
  "code": "878739",
  "device_ref": "sandbox-8207"
}
```

```json
{
  "session_id": "0f72d060-5ee2-42bc-8c9a-b2aadf26b657",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTYxMiwiaWF0IjoxNzkzMzQ4NzEyLCJqdGkiOiI3MzE1NTBmMC1hZDVkLTQyMDktYTA3NC1hZWRkNjA3NzM1NjAiLCJzaWQiOiIwZjcyZDA2MC01ZWUyLTQyYmMtOGM5YS1iMmFhZGYyNmI2NTcifQ.PhFicixCEgKk7mezEoBe2DhD7SjpcqRmjq5XzOxpGgE",
  "access_expires_at": "2026-10-30T08:40:12.264113519Z",
  "refresh_token": "GS17ZV7FVgJ9b_Jw9pKrTF9xRI-ZMNFBgss1aDmZ17Q",
  "refresh_expires_at": "2026-11-29T08:25:12.263344112Z",
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
  "command_id": "f0e4d7bb-8279-4185-a537-920ce05ab7d8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:12Z",
    "sequence": 1793348712824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aeffae0-d66f-4ed2-9277-e2c5063bac50",
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
  "last_heartbeat_at": "2026-10-30T08:25:12.848697Z",
  "last_location_at": "2026-10-30T08:25:12.848697Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "61546ced-e56c-42fa-bab0-c184325c72f1",
  "quote_id": "2fc06b9a-07f9-4d65-85e5-7957b8e58a1a",
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
  "id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cad982d2-d96a-45ee-9a99-ba684f7bc388",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:25:13.163829Z",
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
  "client_id": "cad982d2-d96a-45ee-9a99-ba684f7bc388",
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
      "id": "58c66355-c401-461a-9a2c-e43ae2d15618",
      "at": "2026-10-30T08:25:11.337166Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
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
    "id": "50ea344f-93dd-4750-b8a8-76bb4b161e5f",
    "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
    "expires_at": "2026-10-30T08:25:28.171809Z",
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

`POST /api/driver/v1/offers/50ea344f-93dd-4750-b8a8-76bb4b161e5f/accept` → **200**

```json
{
  "command_id": "22018f3f-d655-4444-8ed3-48370999395b"
}
```

```json
{
  "id": "46acffb7-e1b8-4b10-b9c1-b7a18e6038d1",
  "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aee23253-b153-4258-b753-870a625f77b9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aee23253-b153-4258-b753-870a625f77b9",
  "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
  "assignment_id": "46acffb7-e1b8-4b10-b9c1-b7a18e6038d1",
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

`POST /api/driver/v1/work-sessions/3aeffae0-d66f-4ed2-9277-e2c5063bac50/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:14Z",
    "sequence": 1793348714643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aeffae0-d66f-4ed2-9277-e2c5063bac50",
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
  "last_heartbeat_at": "2026-10-30T08:25:14.665253Z",
  "last_location_at": "2026-10-30T08:25:14.665253Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/aee23253-b153-4258-b753-870a625f77b9/arrive` → **200**

```json
{
  "command_id": "6692822b-28a9-4215-9cf8-875399cafc32",
  "expected_version": 0
}
```

```json
{
  "id": "aee23253-b153-4258-b753-870a625f77b9",
  "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
  "assignment_id": "46acffb7-e1b8-4b10-b9c1-b7a18e6038d1",
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
  "arrived_at": "2026-10-30T08:25:14.92678Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aee23253-b153-4258-b753-870a625f77b9/start` → **200**

```json
{
  "command_id": "f57588fa-70a5-476f-b601-babe7bec8c5e",
  "expected_version": 1
}
```

```json
{
  "id": "aee23253-b153-4258-b753-870a625f77b9",
  "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
  "assignment_id": "46acffb7-e1b8-4b10-b9c1-b7a18e6038d1",
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
  "arrived_at": "2026-10-30T08:25:14.92678Z",
  "started_at": "2026-10-30T08:25:15.206882Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/aee23253-b153-4258-b753-870a625f77b9/complete` → **200**

```json
{
  "command_id": "03437975-2f44-4cde-b61d-fd2f66767a9a",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:25:15Z",
  "cash_received": true
}
```

```json
{
  "id": "aee23253-b153-4258-b753-870a625f77b9",
  "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
  "assignment_id": "46acffb7-e1b8-4b10-b9c1-b7a18e6038d1",
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
  "arrived_at": "2026-10-30T08:25:14.92678Z",
  "started_at": "2026-10-30T08:25:15.206882Z",
  "completed_at": "2026-10-30T08:25:15.52547Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cad982d2-d96a-45ee-9a99-ba684f7bc388",
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
      "id": "66410623-35fd-4ad3-94dd-b07692353111",
      "at": "2026-10-30T08:25:16.269939Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46"
    },
    {
      "id": "58c66355-c401-461a-9a2c-e43ae2d15618",
      "at": "2026-10-30T08:25:11.337166Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e5a88c3d-4f46-4613-986c-f7c1cbbbf09b/archive` → **200**

```json
{
  "command_id": "9ff46b62-4a11-47ee-9ae2-e34014835588",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e5a88c3d-4f46-4613-986c-f7c1cbbbf09b",
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
  "created_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "created_at": "2026-10-30T08:25:09.995313Z",
  "updated_at": "2026-10-30T08:25:19.124275Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3aeffae0-d66f-4ed2-9277-e2c5063bac50",
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
  "last_heartbeat_at": "2026-10-30T08:25:14.665253Z",
  "last_location_at": "2026-10-30T08:25:14.665253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3aeffae0-d66f-4ed2-9277-e2c5063bac50/close` → **200**

```json
{
  "command_id": "4c9f86b0-807c-432e-91e5-b7b120e7c269",
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

Done: order ddca2c07-592b-4af8-9bcc-7089a5546e46.

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
  "session_id": "c9b6a0cc-f8d6-4c00-ae28-8191dc802710",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2MjAsImlhdCI6MTc5MzM0ODcyMCwianRpIjoiYjBmYjIyNDItZGNiMS00MzUzLTg1MDUtOGNiOGQyYjUzOGM4Iiwic2lkIjoiYzliNmEwY2MtZjhkNi00YzAwLWFlMjgtODE5MWRjODAyNzEwIn0.85FtUP8R0YG3TA1lWKZWXNtTDDOE5nCoKcjs0eBIQEc",
  "access_expires_at": "2026-10-30T08:40:20.306871497Z",
  "refresh_token": "cwWeBdhhM_uhfOZUlvu5vFmW9qyUbxlotsl_7IrcxWk",
  "refresh_expires_at": "2026-10-30T20:25:20.306180726Z",
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
  "command_id": "6a304364-1d40-430e-b81e-056903166b92",
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
  "session_id": "58b20a8e-0500-4be6-82bf-9801b875b578",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2MjEsImlhdCI6MTc5MzM0ODcyMSwianRpIjoiZTI3NmYxZGEtNDRjMC00NGFhLThmOTItZTA2M2FhNzdjZjMzIiwic2lkIjoiNThiMjBhOGUtMDUwMC00YmU2LTgyYmYtOTgwMWI4NzViNTc4In0.J9h35WoL_UGy6nclIXhWhpeJgOVGIUjdXffscdv8qFU",
  "access_expires_at": "2026-10-30T08:40:21.453724925Z",
  "refresh_token": "5CUU5I9rWT2gd-FEvNibW2-Zyg-RPnkoT6-n-HkIthw",
  "refresh_expires_at": "2026-10-30T20:25:21.453048775Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2087224883",
    "linkedid": "1730052700.2087224883",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670663693"
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
    "id": "1730052700.2087224883",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "c9b9dc5d-973a-4625-823c-d2812aa94ea6",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:25:21.745443Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:25:21.773287Z",
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
    "id": "1730052600.58161747",
    "linkedid": "1730052600.58161747",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670663693"
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
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/959b80d3-ec31-4429-8e7e-9ec64b35532a/answer` → **200**

```json
{
  "command_id": "f1906edc-07fc-4c4e-81a5-545123d50ff0"
}
```

```json
{
  "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670663693",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "order_ids": [],
  "started_at": "2026-10-30T08:25:22.087043Z",
  "answered_at": "2026-10-30T08:25:22.428885Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.58161747",
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
    "id": "1730052600.58161747",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": "2026-10-30T08:25:22.428885Z",
      "ended_at": "2026-10-30T08:25:22.755499Z",
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
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": "2026-10-30T08:25:22.428885Z",
      "ended_at": "2026-10-30T08:25:22.755499Z",
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
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": "2026-10-30T08:25:22.428885Z",
      "ended_at": "2026-10-30T08:25:22.755499Z",
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
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": "2026-10-30T08:25:22.428885Z",
      "ended_at": "2026-10-30T08:25:22.755499Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:25:29.597536Z"
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
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": "2026-10-30T08:25:22.428885Z",
      "ended_at": "2026-10-30T08:25:22.755499Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:25:29.597536Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/959b80d3-ec31-4429-8e7e-9ec64b35532a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/959b80d3-ec31-4429-8e7e-9ec64b35532a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=959b80d3-ec31-4429-8e7e-9ec64b35532a` → **200**

```json
{
  "changes": [
    {
      "id": "2a526c3a-1f36-4ff7-afa5-d2d047f614d5",
      "occurred_at": "2026-10-30T08:25:30.32235Z",
      "actor_type": "STAFF",
      "actor_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"89965dde-344f-4b6c-98b2-78ba1c0f9ba4\", \"order_ids\": []}",
      "correlation_id": "fb1eb633-77db-414f-8c45-924ac7d4b98f"
    },
    {
      "id": "bf679147-f5f8-4513-88f8-1e1ec77745f7",
      "occurred_at": "2026-10-30T08:25:30.287387Z",
      "actor_type": "STAFF",
      "actor_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"89965dde-344f-4b6c-98b2-78ba1c0f9ba4\", \"order_ids\": []}",
      "correlation_id": "320d16f0-371d-4eb1-84d9-9fb94f83f5aa"
    }
  ]
}
```

Done: call 959b80d3-ec31-4429-8e7e-9ec64b35532a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29565"
}
```

```json
{
  "challenge_id": "223ba7fe-bc63-4183-a436-8669a930b4f2",
  "expires_at": "2026-10-30T08:30:30.64109631Z",
  "resend_available_at": "2026-10-30T08:25:31.64109631Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "465382",
  "sent_at": "2026-10-30T08:25:30.645491474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "223ba7fe-bc63-4183-a436-8669a930b4f2",
  "code": "465382",
  "device_ref": "sandbox-29565"
}
```

```json
{
  "session_id": "55c9ef4a-a470-4402-a7c3-cc5e73652f81",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTYzMCwiaWF0IjoxNzkzMzQ4NzMwLCJqdGkiOiJjNWU1NDA4NS0yMGIxLTQwYjktOGE0OS02MGZmNWMyMjc1Y2EiLCJzaWQiOiI1NWM5ZWY0YS1hNDcwLTQ0MDItYTdjMy1jYzVlNzM2NTJmODEifQ.mvKcjVkSD6NUWI3ydx7tdE0A3f4F9vRAh9ew4QeEhJg",
  "access_expires_at": "2026-10-30T08:40:30.957824841Z",
  "refresh_token": "F25FqG99Lei6P5_-USpqHWO_V0fDNR1Qe-Nq8cePJC8",
  "refresh_expires_at": "2026-11-29T08:25:30.957277212Z",
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
  "command_id": "86b1d941-a0e6-4bc1-afac-b6ffe119539c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:31Z",
    "sequence": 1793348731486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b6f544c6-a0d6-4618-9d07-cadbcd788d54",
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
  "last_heartbeat_at": "2026-10-30T08:25:31.505725Z",
  "last_location_at": "2026-10-30T08:25:31.505725Z",
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
  "session_id": "c61717a3-a996-4525-bd69-136fe85961b8",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2MzIsImlhdCI6MTc5MzM0ODczMiwianRpIjoiOWEzZGI4MDAtZGRkNC00YTBhLTkwYjgtMDRmZjUyZTgyYjI1Iiwic2lkIjoiYzYxNzE3YTMtYTk5Ni00NTI1LWJkNjktMTM2ZmU4NTk2MWI4In0.2xr39xFSVRm0PcmME_KDWTJ_kYvSP-b3fIbzzr08WSs",
  "access_expires_at": "2026-10-30T08:40:32.031494255Z",
  "refresh_token": "sv5BoCyHuzk_Uw5G1L4YhX-ooSseSOuMdi6_ZrDL_QI",
  "refresh_expires_at": "2026-10-30T20:25:32.030821531Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4336c4ff-f2ac-4d25-b9d7-e32ed17b918b",
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
  "id": "95485791-469e-41f6-8bb1-73aad1491733",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:30:32.347701Z",
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
  "command_id": "d3a4820a-60e0-4c4f-a70e-f52b3ef076f6",
  "quote_id": "95485791-469e-41f6-8bb1-73aad1491733",
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
    "phone": "+380676496302"
  }
}
```

```json
{
  "id": "e36de718-5dca-412f-a923-5a8c2882654b",
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
  "created_at": "2026-10-30T08:25:32.695403Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676496302"
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
    "id": "da2f548e-c090-4487-a9f1-3189b723a4fb",
    "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
    "expires_at": "2026-10-30T08:25:47.700748Z",
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

`POST /api/driver/v1/offers/da2f548e-c090-4487-a9f1-3189b723a4fb/accept` → **200**

```json
{
  "command_id": "de183f85-137b-4de1-af79-64e5a26a9f98"
}
```

```json
{
  "id": "e752ef21-2880-48ea-94e6-6e4c2357c80b",
  "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa48fa6b-13b8-49c8-9939-bd58e9afd3dd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa48fa6b-13b8-49c8-9939-bd58e9afd3dd",
  "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
  "assignment_id": "e752ef21-2880-48ea-94e6-6e4c2357c80b",
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
    "phone": "+380676496302"
  }
}
```

`POST /api/driver/v1/work-sessions/b6f544c6-a0d6-4618-9d07-cadbcd788d54/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:35Z",
    "sequence": 1793348735104
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b6f544c6-a0d6-4618-9d07-cadbcd788d54",
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
  "last_heartbeat_at": "2026-10-30T08:25:35.12609Z",
  "last_location_at": "2026-10-30T08:25:35.12609Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/aa48fa6b-13b8-49c8-9939-bd58e9afd3dd/arrive` → **200**

```json
{
  "command_id": "fd0ddb8e-057d-4415-840b-1e1908605b55",
  "expected_version": 0
}
```

```json
{
  "id": "aa48fa6b-13b8-49c8-9939-bd58e9afd3dd",
  "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
  "assignment_id": "e752ef21-2880-48ea-94e6-6e4c2357c80b",
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
  "arrived_at": "2026-10-30T08:25:35.394164Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676496302"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  },
  {
    "phone": "+380676496302",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:36.897981364Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  },
  {
    "phone": "+380676496302",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:36.897981364Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676496302` → **200**

```json
[
  {
    "phone": "+380676496302",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:33.884890215Z"
  },
  {
    "phone": "+380676496302",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:25:36.897981364Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/aa48fa6b-13b8-49c8-9939-bd58e9afd3dd/start` → **200**

```json
{
  "command_id": "548a4c56-e101-49a3-abdd-5b972e1718e3",
  "expected_version": 1
}
```

```json
{
  "id": "aa48fa6b-13b8-49c8-9939-bd58e9afd3dd",
  "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
  "assignment_id": "e752ef21-2880-48ea-94e6-6e4c2357c80b",
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
  "arrived_at": "2026-10-30T08:25:35.394164Z",
  "started_at": "2026-10-30T08:25:37.796955Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676496302"
  }
}
```

`POST /api/driver/v1/trips/aa48fa6b-13b8-49c8-9939-bd58e9afd3dd/complete` → **200**

```json
{
  "command_id": "88db80d3-7ee4-4d91-a1c3-9901805216c0",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:25:38Z",
  "cash_received": true
}
```

```json
{
  "id": "aa48fa6b-13b8-49c8-9939-bd58e9afd3dd",
  "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
  "assignment_id": "e752ef21-2880-48ea-94e6-6e4c2357c80b",
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
  "arrived_at": "2026-10-30T08:25:35.394164Z",
  "started_at": "2026-10-30T08:25:37.796955Z",
  "completed_at": "2026-10-30T08:25:38.099436Z",
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
  "session_id": "b6f544c6-a0d6-4618-9d07-cadbcd788d54",
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
  "last_heartbeat_at": "2026-10-30T08:25:35.12609Z",
  "last_location_at": "2026-10-30T08:25:35.12609Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6f544c6-a0d6-4618-9d07-cadbcd788d54/close` → **200**

```json
{
  "command_id": "8fbf8219-fb4d-4563-9c0d-a7ae7809c08d",
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
  "phone": "+380630236651",
  "device_ref": "sandbox-17069"
}
```

```json
{
  "challenge_id": "c1961233-a6b3-4ea3-b636-8ffe9b0790e7",
  "expires_at": "2026-10-30T08:30:38.964617486Z",
  "resend_available_at": "2026-10-30T08:25:39.964617486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630236651` → **200**

```json
{
  "phone": "+380630236651",
  "audience": "CLIENT",
  "code": "168002",
  "sent_at": "2026-10-30T08:25:38.968842202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1961233-a6b3-4ea3-b636-8ffe9b0790e7",
  "code": "168002",
  "device_ref": "sandbox-17069"
}
```

```json
{
  "session_id": "1aba8325-55bd-4145-a48e-84b1af0101b6",
  "subject": {
    "type": "CLIENT",
    "id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGYxZjYwNi1jZDllLTQ4YTYtYTBhMy03ZjkwZmE4ZmMxNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NjM5LCJpYXQiOjE3OTMzNDg3MzksImp0aSI6IjllMmNiYWZjLTdlYTUtNGEzZC04M2JlLThlODU2YzQxMzFmNSIsInNpZCI6IjFhYmE4MzI1LTU1YmQtNDE0NS1hNDhlLTg0YjFhZjAxMDFiNiJ9.Jm-MuHrSicYp8XUJKz69OL0AVo7s70y84mYUWzoW_ro",
  "access_expires_at": "2026-10-30T08:40:39.26878879Z",
  "refresh_token": "IRto_W6tXevNF2WaYHLxHE8Les22rwJm205-xf15loQ",
  "refresh_expires_at": "2026-11-29T08:25:39.268227541Z",
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
  "device_ref": "sandbox-29511"
}
```

```json
{
  "challenge_id": "5d068ec3-6597-4b9e-96e9-57fb06a1abb1",
  "expires_at": "2026-10-30T08:30:39.856687017Z",
  "resend_available_at": "2026-10-30T08:25:40.856687017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "969361",
  "sent_at": "2026-10-30T08:25:39.860720638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d068ec3-6597-4b9e-96e9-57fb06a1abb1",
  "code": "969361",
  "device_ref": "sandbox-29511"
}
```

```json
{
  "session_id": "1cb43d30-323c-4100-85f6-76d8aa82de29",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTY0MCwiaWF0IjoxNzkzMzQ4NzQwLCJqdGkiOiI0N2JmZDBkYS1mYjI4LTQyM2QtYWM2OC1hODc3NDBiMTYyOGYiLCJzaWQiOiIxY2I0M2QzMC0zMjNjLTQxMDAtODVmNi03NmQ4YWE4MmRlMjkifQ.UoXytwK20KArY-ELC_O7X-dgarejHls0kgnNEsJlDyg",
  "access_expires_at": "2026-10-30T08:40:40.148404832Z",
  "refresh_token": "PyrDNP2WAtyiI77agTOfYzsRUjlPz-IUNPRJgdC7dII",
  "refresh_expires_at": "2026-11-29T08:25:40.147863356Z",
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
  "session_id": "7ed0c090-a988-4ba6-96b0-1c0a3da9dce0",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2NDEsImlhdCI6MTc5MzM0ODc0MSwianRpIjoiYmVhYmY2YzAtZDRhZS00MGQ2LWJmODgtNDk5YzkwZDY3ZGUzIiwic2lkIjoiN2VkMGMwOTAtYTk4OC00YmE2LTk2YjAtMWMwYTNkYTlkY2UwIn0.2WDs93wwqKQYAx0QpR-kwpMo9KWyA6L0PPlpq4Apzbs",
  "access_expires_at": "2026-10-30T08:40:41.002593402Z",
  "refresh_token": "nHpELamPHhFeHe3HNdEQBOqeMsVmmmSSKEaqxqU9zUg",
  "refresh_expires_at": "2026-10-30T20:25:41.002141094Z",
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
  "session_id": "0fef49b7-d4ae-41dd-a331-43b93ba15fef",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2NDEsImlhdCI6MTc5MzM0ODc0MSwianRpIjoiYmVhMTcyZjYtNTU2ZC00ODEyLTg3YjItY2VkZWI2NzA4NDg0Iiwic2lkIjoiMGZlZjQ5YjctZDRhZS00MWRkLWEzMzEtNDNiOTNiYTE1ZmVmIn0.su2F5BdBllKQEczS5jBAjzlmTqRyHe7l74qNM5tkpd4",
  "access_expires_at": "2026-10-30T08:40:41.573184474Z",
  "refresh_token": "xtZhS49ZH33XRc2rxoAFF_7fQr_EYBfyQKl878eMXpw",
  "refresh_expires_at": "2026-10-30T20:25:41.572666799Z",
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
  "command_id": "93a33fff-7bfa-40f2-b804-cef794bc5773",
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
  "id": "f23382a3-a96b-437f-9f90-49b1e320612d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:30:42.093648Z",
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
  "command_id": "49edeec1-3a2c-4e77-b9bc-4d8df2ebd68c",
  "quote_id": "f23382a3-a96b-437f-9f90-49b1e320612d",
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
  "id": "9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f",
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
  "created_at": "2026-10-30T08:25:42.38877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90` → **200**

```json
{
  "id": "9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f",
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
  "created_at": "2026-10-30T08:25:42.38877Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90/cancel` → **200**

```json
{
  "command_id": "f1bd6a17-dda0-4aff-87a5-d994dd353519",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f",
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
  "created_at": "2026-10-30T08:25:42.38877Z",
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
  "command_id": "eb031ae3-3979-4ff9-ade6-460fc2352ede",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:43Z",
    "sequence": 1793348743703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fc5f0f74-451f-4290-9c91-528b95f20df1",
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
  "last_heartbeat_at": "2026-10-30T08:25:43.724085Z",
  "last_location_at": "2026-10-30T08:25:43.724085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2936"
}
```

```json
{
  "challenge_id": "df695bb1-8824-4681-8c93-6067545539d1",
  "expires_at": "2026-10-30T08:30:44.006940033Z",
  "resend_available_at": "2026-10-30T08:25:45.006940033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "614606",
  "sent_at": "2026-10-30T08:25:44.010957356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df695bb1-8824-4681-8c93-6067545539d1",
  "code": "614606",
  "device_ref": "sandbox-2936"
}
```

```json
{
  "session_id": "be05ebe7-dca8-4a8c-96da-e6e1ad46206f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTY0NCwiaWF0IjoxNzkzMzQ4NzQ0LCJqdGkiOiI0ZGJjZTQ3Ni1kN2ZjLTQ5YTMtYWYxMi05NDFkZTFiZGVjMWQiLCJzaWQiOiJiZTA1ZWJlNy1kY2E4LTRhOGMtOTZkYS1lNmUxYWQ0NjIwNmYifQ.vtiIE1jsO6rWAlE0f8AnnHC7mj6I_HLZoKl4tU6SpMk",
  "access_expires_at": "2026-10-30T08:40:44.317767371Z",
  "refresh_token": "A_0J9V7Y3xFEjFIw0j9b5NwlEgBVlxNJ6Gp-JRR5qHk",
  "refresh_expires_at": "2026-11-29T08:25:44.317248384Z",
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
  "command_id": "ede80c1b-6967-4631-8705-a2a337c95ed0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:44Z",
    "sequence": 1793348744834
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:25:44.86219Z",
  "last_location_at": "2026-10-30T08:25:44.86219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d4bf86b-ccd7-4c32-b55a-185bf734d7ca",
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
  "id": "b5168b73-1616-4d78-8c48-6a8e3dcde390",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:30:45.210209Z",
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
  "command_id": "656d305e-8dff-4f06-95a8-aea8c8a5485d",
  "quote_id": "b5168b73-1616-4d78-8c48-6a8e3dcde390",
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
  "id": "60becd35-0982-481c-b3ae-adfade23418f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f",
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
  "created_at": "2026-10-30T08:25:45.496436Z",
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
    "id": "c3e905af-289a-4de3-ab88-163975666607",
    "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
    "expires_at": "2026-10-30T08:26:00.500016Z",
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

`POST /api/driver/v1/offers/c3e905af-289a-4de3-ab88-163975666607/accept` → **200**

```json
{
  "command_id": "82cd7c0a-7e7d-4c11-bbb0-f48c461e20b3"
}
```

```json
{
  "id": "f0d8efac-ae4a-45bd-87cc-991e2af712e9",
  "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba995a11-4b54-481a-8ba5-52572a61143a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba995a11-4b54-481a-8ba5-52572a61143a",
  "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
  "assignment_id": "f0d8efac-ae4a-45bd-87cc-991e2af712e9",
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

`POST /api/driver/v1/trips/ba995a11-4b54-481a-8ba5-52572a61143a/cancel` → **200**

```json
{
  "command_id": "ecaf8a40-169b-4aa5-9be2-a84b4a1996bc",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "ba995a11-4b54-481a-8ba5-52572a61143a",
  "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
  "assignment_id": "f0d8efac-ae4a-45bd-87cc-991e2af712e9",
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

`GET /api/rider/v1/orders/60becd35-0982-481c-b3ae-adfade23418f` → **200**

```json
{
  "id": "60becd35-0982-481c-b3ae-adfade23418f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f",
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
    "id": "f0d8efac-ae4a-45bd-87cc-991e2af712e9",
    "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ba995a11-4b54-481a-8ba5-52572a61143a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:25:45.496436Z",
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
    "id": "913ce7ff-bbbe-4024-b952-bf93883e5bb5",
    "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
    "expires_at": "2026-10-30T08:26:01.648276Z",
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

`POST /api/driver/v1/offers/913ce7ff-bbbe-4024-b952-bf93883e5bb5/accept` → **200**

```json
{
  "command_id": "31a946ae-5e90-47a9-8909-6ea2429d8820"
}
```

```json
{
  "id": "485428ea-b737-45a6-a068-8b6363fb1a1a",
  "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7658e558-d228-45d1-9677-0502a816d932",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7658e558-d228-45d1-9677-0502a816d932",
  "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
  "assignment_id": "485428ea-b737-45a6-a068-8b6363fb1a1a",
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

`POST /api/driver/v1/trips/7658e558-d228-45d1-9677-0502a816d932/cancel` → **200**

```json
{
  "command_id": "9ec9793b-8ba6-4dd5-a995-171c094985ef",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7658e558-d228-45d1-9677-0502a816d932",
  "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
  "assignment_id": "485428ea-b737-45a6-a068-8b6363fb1a1a",
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
    "id": "60becd35-0982-481c-b3ae-adfade23418f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:25:45.496436Z",
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
    "id": "9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:25:42.38877Z",
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

`GET /api/operator/v1/orders/60becd35-0982-481c-b3ae-adfade23418f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:25:45.497138Z",
      "actor": {
        "type": "CLIENT",
        "id": "14f1f606-cd9e-48a6-a0a3-7f90fa8fc14f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
        "quote_id": "b5168b73-1616-4d78-8c48-6a8e3dcde390",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "31aa6b8c-6abd-4bac-9951-91f325469006"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:25:45.499285Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
        "attempt_id": "dc5cb67a-d9a6-410f-87c1-b826693986e5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "31aa6b8c-6abd-4bac-9951-91f325469006"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:25:45.506028Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c3e905af-289a-4de3-ab88-163975666607",
        "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "31aa6b8c-6abd-4bac-9951-91f325469006"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:25:46.107834Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c3e905af-289a-4de3-ab88-163975666607",
        "order_id": "60becd35-0982-481c-b3ae-adfade23418f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f0d8efac-ae4a-45bd-87cc-991e2af712e9"
      },
      "correlation_id": "b02bf9e7-d442-4e31-a314-2972383e0cc7"
```

Done: orders 9f3bf9aa-b8ba-4c52-8298-0351ae3dbd90, 60becd35-0982-481c-b3ae-adfade23418f.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739765856",
  "device_ref": "sandbox-9554"
}
```

```json
{
  "challenge_id": "60c47ced-95b8-466d-8f18-4876b424415e",
  "expires_at": "2026-10-30T08:30:48.923056879Z",
  "resend_available_at": "2026-10-30T08:25:49.923056879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739765856` → **200**

```json
{
  "phone": "+380739765856",
  "audience": "CLIENT",
  "code": "963599",
  "sent_at": "2026-10-30T08:25:48.926501835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60c47ced-95b8-466d-8f18-4876b424415e",
  "code": "963599",
  "device_ref": "sandbox-9554"
}
```

```json
{
  "session_id": "60214aed-3567-4e05-bc27-0a7fa2a5fd62",
  "subject": {
    "type": "CLIENT",
    "id": "0dcc19a8-599b-405c-8e40-11ddb3de3005"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGNjMTlhOC01OTliLTQwNWMtOGU0MC0xMWRkYjNkZTMwMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NjQ5LCJpYXQiOjE3OTMzNDg3NDksImp0aSI6ImE4NWI3ZWNmLWNkMjktNDQzZC1hNGViLTg0OWFkODVkMDMyNiIsInNpZCI6IjYwMjE0YWVkLTM1NjctNGUwNS1iYzI3LTBhN2ZhMmE1ZmQ2MiJ9.3oWYvk0iTR8eBZreOFnSSkd7d7FxZn2Hbr6_PsTY3Hw",
  "access_expires_at": "2026-10-30T08:40:49.230407591Z",
  "refresh_token": "PcAaKdPj7UYVzXqTXHo1m4sE9oKFneP3jVmOv8EB8f4",
  "refresh_expires_at": "2026-11-29T08:25:49.229943535Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bba889d7-f929-4685-9f1a-3d0103c393d2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4835d59a-aebf-480f-bc64-1d9b01663b68",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4835d59a-aebf-480f-bc64-1d9b01663b68",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1c32dc1f4501cce079d0c92f43e29345",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4835d59a-aebf-480f-bc64-1d9b01663b68",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739765856"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4835d59a-aebf-480f-bc64-1d9b01663b68",
  "expires_at": "2026-10-30T08:55:49.524086Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4835d59a-aebf-480f-bc64-1d9b01663b68` → **200**

```json
{
  "id": "4835d59a-aebf-480f-bc64-1d9b01663b68",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:55:49.524086Z",
  "card": {
    "id": "3e33ea02-d434-4541-bc7d-62a3945d1755",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3181",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:25:49.80311Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3e33ea02-d434-4541-bc7d-62a3945d1755",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3181",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:25:49.80311Z"
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
  "device_ref": "sandbox-6939"
}
```

```json
{
  "challenge_id": "04e0f89a-a520-466c-a075-97296d786978",
  "expires_at": "2026-10-30T08:30:50.375344302Z",
  "resend_available_at": "2026-10-30T08:25:51.375344302Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "046524",
  "sent_at": "2026-10-30T08:25:50.378691473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04e0f89a-a520-466c-a075-97296d786978",
  "code": "046524",
  "device_ref": "sandbox-6939"
}
```

```json
{
  "session_id": "d274f03a-610c-4ff7-a7b7-b91e2816a24d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTY1MCwiaWF0IjoxNzkzMzQ4NzUwLCJqdGkiOiI5YTk3NDRlYy00ZGY0LTQ5MWMtOTdmYy00Njk1ODYyNTYwMmIiLCJzaWQiOiJkMjc0ZjAzYS02MTBjLTRmZjctYTdiNy1iOTFlMjgxNmEyNGQifQ.AYENgJ4r_9jP432oYefrXpBZjU6f217WKgTqASQzO54",
  "access_expires_at": "2026-10-30T08:40:50.652668958Z",
  "refresh_token": "dKZHXeqdjUEvLEjDVwIa8qJh6aNRbFI_zp5csb-biVU",
  "refresh_expires_at": "2026-11-29T08:25:50.652235487Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:25:44.86219Z",
  "last_location_at": "2026-10-30T08:25:44.86219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69304ca9-1859-4a00-ae65-afb95126c76b/handover` → **200**

```json
{
  "command_id": "cea9710f-0920-413b-82b1-829f39300166",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:25:44.86219Z",
  "last_location_at": "2026-10-30T08:25:44.86219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69304ca9-1859-4a00-ae65-afb95126c76b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:51Z",
    "sequence": 1793348751505
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:25:51.526256Z",
  "last_location_at": "2026-10-30T08:25:51.526256Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "29dc62d9-191c-4f28-b7a1-e24a557c07c9",
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
  "id": "d74ab034-9090-4089-b41d-a0f436259cb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:30:51.830621Z",
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
  "command_id": "0367a089-8cc4-4cc8-995c-156d6a93554f",
  "quote_id": "d74ab034-9090-4089-b41d-a0f436259cb4",
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
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
  "created_at": "2026-10-30T08:25:52.13761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d` → **200**

```json
{
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
  "created_at": "2026-10-30T08:25:52.13761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d` → **200**

```json
{
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
  "created_at": "2026-10-30T08:25:52.13761Z",
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
    "id": "8a526705-410d-4eed-9e05-08aa6a749be9",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "expires_at": "2026-10-30T08:26:07.622244Z",
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

`POST /api/driver/v1/offers/8a526705-410d-4eed-9e05-08aa6a749be9/accept` → **200**

```json
{
  "command_id": "80f11cc3-5f02-4279-8cce-38aea9ac1369"
}
```

```json
{
  "id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "256b74ce-f37e-4783-85f2-40975900ab66",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "256b74ce-f37e-4783-85f2-40975900ab66",
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "assignment_id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
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

`POST /api/driver/v1/work-sessions/69304ca9-1859-4a00-ae65-afb95126c76b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:25:54Z",
    "sequence": 1793348754873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:25:54.892922Z",
  "last_location_at": "2026-10-30T08:25:54.892922Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/256b74ce-f37e-4783-85f2-40975900ab66/arrive` → **200**

```json
{
  "command_id": "9a856ffd-91e6-4fd0-ba6a-dd3fe733df7c",
  "expected_version": 0
}
```

```json
{
  "id": "256b74ce-f37e-4783-85f2-40975900ab66",
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "assignment_id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
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
  "arrived_at": "2026-10-30T08:25:55.190281Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/256b74ce-f37e-4783-85f2-40975900ab66/start` → **200**

```json
{
  "command_id": "454f7651-132c-42ae-ad1b-4619519e932b",
  "expected_version": 1
}
```

```json
{
  "id": "256b74ce-f37e-4783-85f2-40975900ab66",
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "assignment_id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
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
  "arrived_at": "2026-10-30T08:25:55.190281Z",
  "started_at": "2026-10-30T08:25:55.503979Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/256b74ce-f37e-4783-85f2-40975900ab66/complete` → **200**

```json
{
  "command_id": "15c73d9b-7ff4-4e44-9a40-e3eaabbe27c8",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:25:55Z",
  "cash_received": true
}
```

```json
{
  "id": "256b74ce-f37e-4783-85f2-40975900ab66",
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "assignment_id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
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
  "arrived_at": "2026-10-30T08:25:55.190281Z",
  "started_at": "2026-10-30T08:25:55.503979Z",
  "completed_at": "2026-10-30T08:25:55.783186Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d` → **200**

```json
{
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
    "id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "256b74ce-f37e-4783-85f2-40975900ab66",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:25:52.13761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d` → **200**

```json
{
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
    "id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "256b74ce-f37e-4783-85f2-40975900ab66",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:25:52.13761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d` → **200**

```json
{
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
    "id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "256b74ce-f37e-4783-85f2-40975900ab66",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:25:52.13761Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d` → **200**

```json
{
  "id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
    "id": "cfbc4aa0-9e88-4c82-997f-0e10e4b65e9d",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "256b74ce-f37e-4783-85f2-40975900ab66",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:25:52.13761Z",
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

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d/tip` → **200**

```json
{
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
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
  "available_until": "2026-10-31T08:25:55.783186Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d/tip` → **201**

```json
{
  "command_id": "f833273c-4b93-4b75-89f1-0b0549257e5e",
  "amount_minor": 2500
}
```

```json
{
  "id": "26b0db1d-800e-4db6-bd54-288ed487abd5",
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:26:00.874544Z"
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d/tip` → **200**

```json
{
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
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
  "available_until": "2026-10-31T08:25:55.783186Z",
  "open": false,
  "tip": {
    "id": "26b0db1d-800e-4db6-bd54-288ed487abd5",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:26:00.874544Z"
  }
}
```

`GET /api/rider/v1/orders/c436a98e-1188-40fa-b203-da28c5a9994d/tip` → **200**

```json
{
  "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
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
  "available_until": "2026-10-31T08:25:55.783186Z",
  "open": false,
  "tip": {
    "id": "26b0db1d-800e-4db6-bd54-288ed487abd5",
    "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:26:00.874544Z"
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
      "id": "362f998b-7e7f-4c52-a2ce-adaaffad5ed6",
      "at": "2026-10-30T08:26:02.772061Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
      "counterpart_id": null
    },
    {
      "id": "18360254-1379-48d3-91cd-201487bfd7f9",
      "at": "2026-10-30T08:25:56.705148Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73e68dfa-c636-42df-a2bf-2b8b488979ab",
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
  "id": "a2cbda33-9ee5-48fb-9a7f-3b52b1f2213a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:03.105775Z",
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
  "session_id": "38084b91-6406-4e15-969a-56b677a0cde4",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2NjMsImlhdCI6MTc5MzM0ODc2MywianRpIjoiYjY1OTNhMTMtOTkwOS00MTE1LTgxMWYtMjIwNjc2NzliMDE4Iiwic2lkIjoiMzgwODRiOTEtNjQwNi00ZTE1LTk2OWEtNTZiNjc3YTBjZGU0In0.g0x4PRz98Qb-Kox6nGc8lLjz7prKJNocHMPXw0tUqyI",
  "access_expires_at": "2026-10-30T08:41:03.700575589Z",
  "refresh_token": "_zISMjEfobrhp-I-R9hefGMZrZLnNFd7diyn0-KE06s",
  "refresh_expires_at": "2026-10-30T20:26:03.699877367Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739765856` → **200**

```json
{
  "client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005"
}
```

`POST /api/admin/v1/rider-wallets/0dcc19a8-599b-405c-8e40-11ddb3de3005/top-ups` → **201**

```json
{
  "command_id": "6ffb4107-c39e-4107-8687-7ffcbee4f65c",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
      "id": "a8187a04-5f34-45e7-88a0-a8ca6cb53c9d",
      "at": "2026-10-30T08:26:04.293259Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3ca969cc-6d54-43ac-9e51-841d590b06e4",
  "quote_id": "a2cbda33-9ee5-48fb-9a7f-3b52b1f2213a",
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
  "id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
  "created_at": "2026-10-30T08:26:04.594162Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c8e11bf8-1ff5-4a53-9ec3-c511cda12a74` → **200**

```json
{
  "id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
  "created_at": "2026-10-30T08:26:04.594162Z",
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
    "id": "9ae17a45-dcdc-48de-bc1f-0e1985a1c140",
    "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
    "expires_at": "2026-10-30T08:26:19.600484Z",
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

`POST /api/driver/v1/offers/9ae17a45-dcdc-48de-bc1f-0e1985a1c140/accept` → **200**

```json
{
  "command_id": "8d94832a-8d06-4865-ad3c-fe8fa354557a"
}
```

```json
{
  "id": "7808a0e0-2c01-48ff-9a3a-cc987eec9b84",
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "39a9888f-4c71-4a19-9ad6-e087c070da6f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "39a9888f-4c71-4a19-9ad6-e087c070da6f",
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "assignment_id": "7808a0e0-2c01-48ff-9a3a-cc987eec9b84",
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

`POST /api/driver/v1/work-sessions/69304ca9-1859-4a00-ae65-afb95126c76b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:26:06Z",
    "sequence": 1793348766701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:26:06.026403Z",
  "last_location_at": "2026-10-30T08:26:06.026403Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/39a9888f-4c71-4a19-9ad6-e087c070da6f/arrive` → **200**

```json
{
  "command_id": "d4fcf71e-2468-43df-9b00-a2e84a7821c9",
  "expected_version": 0
}
```

```json
{
  "id": "39a9888f-4c71-4a19-9ad6-e087c070da6f",
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "assignment_id": "7808a0e0-2c01-48ff-9a3a-cc987eec9b84",
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
  "arrived_at": "2026-10-30T08:26:06.301703Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/39a9888f-4c71-4a19-9ad6-e087c070da6f/start` → **200**

```json
{
  "command_id": "914b20e3-1e36-44ec-9bb6-45160ce3442a",
  "expected_version": 1
}
```

```json
{
  "id": "39a9888f-4c71-4a19-9ad6-e087c070da6f",
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "assignment_id": "7808a0e0-2c01-48ff-9a3a-cc987eec9b84",
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
  "arrived_at": "2026-10-30T08:26:06.301703Z",
  "started_at": "2026-10-30T08:26:06.596665Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/39a9888f-4c71-4a19-9ad6-e087c070da6f/complete` → **200**

```json
{
  "command_id": "04b71f41-ec88-4703-85dc-6c4c324d4b53",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:26:06Z",
  "cash_received": true
}
```

```json
{
  "id": "39a9888f-4c71-4a19-9ad6-e087c070da6f",
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "assignment_id": "7808a0e0-2c01-48ff-9a3a-cc987eec9b84",
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
  "arrived_at": "2026-10-30T08:26:06.301703Z",
  "started_at": "2026-10-30T08:26:06.596665Z",
  "completed_at": "2026-10-30T08:26:06.882499Z",
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
  "client_id": "0dcc19a8-599b-405c-8e40-11ddb3de3005",
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
      "id": "a8187a04-5f34-45e7-88a0-a8ca6cb53c9d",
      "at": "2026-10-30T08:26:04.293259Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
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

`GET /api/rider/v1/orders/c8e11bf8-1ff5-4a53-9ec3-c511cda12a74/tip` → **200**

```json
{
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
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
  "available_until": "2026-10-31T08:26:06.882499Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c8e11bf8-1ff5-4a53-9ec3-c511cda12a74/tip` → **201**

```json
{
  "command_id": "58ccd2ee-f05b-4e86-8696-99d7b57a3346",
  "amount_minor": 2500
}
```

```json
{
  "id": "4afa6552-9d67-4a3e-929f-daeb3280ee8b",
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:26:07.947246Z"
}
```

`GET /api/rider/v1/orders/c8e11bf8-1ff5-4a53-9ec3-c511cda12a74/tip` → **200**

```json
{
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
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
  "available_until": "2026-10-31T08:26:06.882499Z",
  "open": false,
  "tip": {
    "id": "4afa6552-9d67-4a3e-929f-daeb3280ee8b",
    "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:26:07.947246Z"
  }
}
```

`GET /api/rider/v1/orders/c8e11bf8-1ff5-4a53-9ec3-c511cda12a74/tip` → **200**

```json
{
  "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
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
  "available_until": "2026-10-31T08:26:06.882499Z",
  "open": false,
  "tip": {
    "id": "4afa6552-9d67-4a3e-929f-daeb3280ee8b",
    "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:26:07.947246Z"
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
      "id": "98d782c8-f396-474a-8569-86e655549807",
      "at": "2026-10-30T08:26:07.830815Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
      "counterpart_id": null
    },
    {
      "id": "362f998b-7e7f-4c52-a2ce-adaaffad5ed6",
      "at": "2026-10-30T08:26:02.772061Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
      "counterpart_id": null
    },
    {
      "id": "18360254-1379-48d3-91cd-201487bfd7f9",
      "at": "2026-10-30T08:25:56.705148Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
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
      "id": "d854c224-9742-494d-b478-684db8f0187b",
      "at": "2026-10-30T08:26:09.863525Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
      "counterpart_id": null
    },
    {
      "id": "98d782c8-f396-474a-8569-86e655549807",
      "at": "2026-10-30T08:26:07.830815Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c8e11bf8-1ff5-4a53-9ec3-c511cda12a74",
      "counterpart_id": null
    },
    {
      "id": "362f998b-7e7f-4c52-a2ce-adaaffad5ed6",
      "at": "2026-10-30T08:26:02.772061Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
      "counterpart_id": null
    },
    {
      "id": "18360254-1379-48d3-91cd-201487bfd7f9",
      "at": "2026-10-30T08:25:56.705148Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c436a98e-1188-40fa-b203-da28c5a9994d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "69304ca9-1859-4a00-ae65-afb95126c76b",
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
  "last_heartbeat_at": "2026-10-30T08:26:06.026403Z",
  "last_location_at": "2026-10-30T08:26:06.026403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69304ca9-1859-4a00-ae65-afb95126c76b/close` → **200**

```json
{
  "command_id": "fcd49dd0-e3d1-48ad-becd-004137d3f7d0",
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

Done: card order c8e11bf8-1ff5-4a53-9ec3-c511cda12a74.

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
  "phone": "+380735675723",
  "device_ref": "sandbox-32226"
}
```

```json
{
  "challenge_id": "f72ff232-b066-444f-9026-d7bdbf40938a",
  "expires_at": "2026-10-30T08:31:12.135560384Z",
  "resend_available_at": "2026-10-30T08:26:13.135560384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735675723` → **200**

```json
{
  "phone": "+380735675723",
  "audience": "CLIENT",
  "code": "852423",
  "sent_at": "2026-10-30T08:26:12.138744796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f72ff232-b066-444f-9026-d7bdbf40938a",
  "code": "852423",
  "device_ref": "sandbox-32226"
}
```

```json
{
  "session_id": "ed39b5ef-261e-4be7-9ad4-e537d04f9b10",
  "subject": {
    "type": "CLIENT",
    "id": "1f4578f2-6865-475c-894f-cedd7b7b30b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjQ1NzhmMi02ODY1LTQ3NWMtODk0Zi1jZWRkN2I3YjMwYjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NjcyLCJpYXQiOjE3OTMzNDg3NzIsImp0aSI6IjNkMGE0Zjk0LWM1MjItNDY0Yy04N2QyLTc2MjhjNDY4ZDM0OSIsInNpZCI6ImVkMzliNWVmLTI2MWUtNGJlNy05YWQ0LWU1MzdkMDRmOWIxMCJ9.3S7yxLJX_vadVDleUYYFR0__zkAUKlj6wvDyJ3sHQRQ",
  "access_expires_at": "2026-10-30T08:41:12.439784306Z",
  "refresh_token": "VOONuPBT1lOisvX1xUKMmY2yCRaHBF7vLj98uAIndzg",
  "refresh_expires_at": "2026-11-29T08:26:12.439246671Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "54f7f754-d707-4e26-91ec-ca06f5ef02ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "0ea4dd88-e367-49ba-87cb-ee12da7605b7",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0ea4dd88-e367-49ba-87cb-ee12da7605b7",
    "orderDate": "1793348772",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "d9495f7de89aa810a82fa08dbdc7a3ec",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0ea4dd88-e367-49ba-87cb-ee12da7605b7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735675723"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0ea4dd88-e367-49ba-87cb-ee12da7605b7",
  "created_at": "2026-10-30T08:26:12.728242Z",
  "expires_at": "2026-10-30T08:56:12.728242Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/0ea4dd88-e367-49ba-87cb-ee12da7605b7` → **200**

```json
{
  "id": "0ea4dd88-e367-49ba-87cb-ee12da7605b7",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:26:12.728242Z",
  "expires_at": "2026-10-30T08:56:12.728242Z",
  "completed_at": "2026-10-30T08:26:12.983761Z",
  "masked_pan": "41****5779",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1f4578f2-6865-475c-894f-cedd7b7b30b2",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1f4578f2-6865-475c-894f-cedd7b7b30b2",
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
      "id": "150cb021-4cc5-4580-b6e8-f1a77a58ec28",
      "at": "2026-10-30T08:26:13.882588Z",
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
  "client_id": "1f4578f2-6865-475c-894f-cedd7b7b30b2",
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
      "id": "150cb021-4cc5-4580-b6e8-f1a77a58ec28",
      "at": "2026-10-30T08:26:13.882588Z",
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
  "device_ref": "sandbox-17697"
}
```

```json
{
  "challenge_id": "d68d53f4-7218-4f05-8ff1-c6b571cc749a",
  "expires_at": "2026-10-30T08:31:15.095476762Z",
  "resend_available_at": "2026-10-30T08:26:16.095476762Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "466755",
  "sent_at": "2026-10-30T08:26:15.100224422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d68d53f4-7218-4f05-8ff1-c6b571cc749a",
  "code": "466755",
  "device_ref": "sandbox-17697"
}
```

```json
{
  "session_id": "298b8294-8218-46d1-bd5a-cad3c43df920",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTY3NSwiaWF0IjoxNzkzMzQ4Nzc1LCJqdGkiOiJlMTdlZjMxZS02Zjk1LTQyZjMtYTI2Zi1jOGQzYTllOTJmZmUiLCJzaWQiOiIyOThiODI5NC04MjE4LTQ2ZDEtYmQ1YS1jYWQzYzQzZGY5MjAifQ.J6iUSCsHLzTPHYzuctXyJHmrEQ8KJKoz8KWQ0haqdEo",
  "access_expires_at": "2026-10-30T08:41:15.399691087Z",
  "refresh_token": "TEmTKr2Nu9OMO8o-wjkzu7u7V78Iy6FpIcPyHB3jT1o",
  "refresh_expires_at": "2026-11-29T08:26:15.398884214Z",
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
  "command_id": "4ecb678d-1798-4856-8e46-04fdd428c2b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b6078753-2c16-496b-92eb-a20b71bb94b1",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b6078753-2c16-496b-92eb-a20b71bb94b1",
    "orderDate": "1793348775",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "21ef9698d09ec77ef2e2ce6a38a8afb2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b6078753-2c16-496b-92eb-a20b71bb94b1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b6078753-2c16-496b-92eb-a20b71bb94b1",
  "created_at": "2026-10-30T08:26:15.970531Z",
  "expires_at": "2026-10-30T08:56:15.970531Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b6078753-2c16-496b-92eb-a20b71bb94b1` → **200**

```json
{
  "id": "b6078753-2c16-496b-92eb-a20b71bb94b1",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:26:15.970531Z",
  "expires_at": "2026-10-30T08:56:15.970531Z",
  "completed_at": "2026-10-30T08:26:16.232835Z",
  "masked_pan": "41****9505",
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
      "id": "5b1f6408-da87-4dbb-900f-370d28717d2b",
      "at": "2026-10-30T08:26:16.891377Z",
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
  "command_id": "e562c542-29b6-420c-a41c-385653820c0e",
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
  "correlation_id": "5c966b17-a249-4325-b55d-597b7265d806"
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
  "device_ref": "sandbox-16407"
}
```

```json
{
  "challenge_id": "4698c9e0-e2e2-435c-8971-c2a3e4f9415f",
  "expires_at": "2026-10-30T08:31:18.331397299Z",
  "resend_available_at": "2026-10-30T08:26:19.331397299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "482038",
  "sent_at": "2026-10-30T08:26:18.335425536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4698c9e0-e2e2-435c-8971-c2a3e4f9415f",
  "code": "482038",
  "device_ref": "sandbox-16407"
}
```

```json
{
  "session_id": "24d18eae-b8dd-487e-a1f3-f6c261746d49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTY3OCwiaWF0IjoxNzkzMzQ4Nzc4LCJqdGkiOiJhNGQ0MmMwMS1hZjc1LTQwMmQtYTA1MS0zNGU3ZWVhOWRkNDEiLCJzaWQiOiIyNGQxOGVhZS1iOGRkLTQ4N2UtYTFmMy1mNmMyNjE3NDZkNDkifQ.Xn5k_ta1jYyTUqALwlkCYBmynYYf1svDMf-3AgS7hdY",
  "access_expires_at": "2026-10-30T08:41:18.639848509Z",
  "refresh_token": "r6Aa5LKa0jccUDTF5LPsG3lczrntW9Fg-Kjpxd4qV1Q",
  "refresh_expires_at": "2026-11-29T08:26:18.639320018Z",
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
  "command_id": "635d3c0d-a448-49f7-a4de-915faf258663",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:26:19Z",
    "sequence": 1793348779161
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c027053c-e570-4fc8-bcf2-dfabd385fa9b",
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
  "last_heartbeat_at": "2026-10-30T08:26:19.183349Z",
  "last_location_at": "2026-10-30T08:26:19.183349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638437284",
  "device_ref": "sandbox-17904"
}
```

```json
{
  "challenge_id": "feaf1c1a-483d-4fe0-aa26-ca13a1f8c07c",
  "expires_at": "2026-10-30T08:31:19.482936476Z",
  "resend_available_at": "2026-10-30T08:26:20.482936476Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638437284` → **200**

```json
{
  "phone": "+380638437284",
  "audience": "CLIENT",
  "code": "045376",
  "sent_at": "2026-10-30T08:26:19.486578796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "feaf1c1a-483d-4fe0-aa26-ca13a1f8c07c",
  "code": "045376",
  "device_ref": "sandbox-17904"
}
```

```json
{
  "session_id": "ec5348b3-6f2b-45db-865e-8906d4dd30f1",
  "subject": {
    "type": "CLIENT",
    "id": "7ca4812d-336a-421b-aeaf-65cc7236268b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2E0ODEyZC0zMzZhLTQyMWItYWVhZi02NWNjNzIzNjI2OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5Njc5LCJpYXQiOjE3OTMzNDg3NzksImp0aSI6Ijg5MDk1NzU2LTNmZWItNGY3OS1hZjdmLWU0MDVkODIyYjM1ZiIsInNpZCI6ImVjNTM0OGIzLTZmMmItNDVkYi04NjVlLTg5MDZkNGRkMzBmMSJ9.EYej5_X6oUXSyzpwJH8CVb23k34qOsKJVZvDYuxF7NI",
  "access_expires_at": "2026-10-30T08:41:19.782413286Z",
  "refresh_token": "9QcunvTDsJFj61Hog-QUJwC7oN57YyW5EKnu68uZYoE",
  "refresh_expires_at": "2026-11-29T08:26:19.781788672Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93113051-2b8c-4f69-84d2-7121972e2d4f",
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
  "id": "8fe76546-89b3-487b-8b8f-8fd37f03e0f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:20.074474Z",
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
  "command_id": "4917237e-9ced-474f-9903-c9934f66b059",
  "quote_id": "8fe76546-89b3-487b-8b8f-8fd37f03e0f1",
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
  "id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7ca4812d-336a-421b-aeaf-65cc7236268b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:26:20.372582Z",
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
    "id": "9bb1af74-657b-4706-88ca-367eaa6132cf",
    "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
    "expires_at": "2026-10-30T08:26:35.375667Z",
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

`POST /api/driver/v1/offers/9bb1af74-657b-4706-88ca-367eaa6132cf/accept` → **200**

```json
{
  "command_id": "a4ddd230-d950-4031-93ed-39aa675ad0e7"
}
```

```json
{
  "id": "e9c29736-eb46-4697-95ed-bfb677b5169f",
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2949a714-c447-4138-9c13-7bffcc2dba7e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2949a714-c447-4138-9c13-7bffcc2dba7e",
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "assignment_id": "e9c29736-eb46-4697-95ed-bfb677b5169f",
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

`POST /api/driver/v1/work-sessions/c027053c-e570-4fc8-bcf2-dfabd385fa9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:26:21Z",
    "sequence": 1793348781470
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c027053c-e570-4fc8-bcf2-dfabd385fa9b",
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
  "last_heartbeat_at": "2026-10-30T08:26:21.489984Z",
  "last_location_at": "2026-10-30T08:26:21.489984Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2949a714-c447-4138-9c13-7bffcc2dba7e/arrive` → **200**

```json
{
  "command_id": "d723811a-1b8a-4354-ad7f-c175f43e5d00",
  "expected_version": 0
}
```

```json
{
  "id": "2949a714-c447-4138-9c13-7bffcc2dba7e",
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "assignment_id": "e9c29736-eb46-4697-95ed-bfb677b5169f",
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
  "arrived_at": "2026-10-30T08:26:21.770603Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2949a714-c447-4138-9c13-7bffcc2dba7e/start` → **200**

```json
{
  "command_id": "116f6436-9d28-442c-a28a-d7e1fe1a371d",
  "expected_version": 1
}
```

```json
{
  "id": "2949a714-c447-4138-9c13-7bffcc2dba7e",
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "assignment_id": "e9c29736-eb46-4697-95ed-bfb677b5169f",
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
  "arrived_at": "2026-10-30T08:26:21.770603Z",
  "started_at": "2026-10-30T08:26:22.077755Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2949a714-c447-4138-9c13-7bffcc2dba7e/complete` → **200**

```json
{
  "command_id": "7d4b1a82-35cd-4cc7-9c3c-396be5712667",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:26:22Z",
  "cash_received": false
}
```

```json
{
  "id": "2949a714-c447-4138-9c13-7bffcc2dba7e",
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "assignment_id": "e9c29736-eb46-4697-95ed-bfb677b5169f",
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
  "arrived_at": "2026-10-30T08:26:21.770603Z",
  "started_at": "2026-10-30T08:26:22.077755Z",
  "completed_at": "2026-10-30T08:26:22.390126Z",
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
  "session_id": "69b36382-e353-41b6-b3f2-16b288e3dd9a",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2ODIsImlhdCI6MTc5MzM0ODc4MiwianRpIjoiOTRlYmJhOTUtYzQ3OC00MmNkLTkzZjYtOWUxZmNhMjM3N2QxIiwic2lkIjoiNjliMzYzODItZTM1My00MWI2LWIzZjItMTZiMjg4ZTNkZDlhIn0.1ohw81sJabTgAb0Q-ZEPQxWiNUGzsAruDhEv8r4RfwU",
  "access_expires_at": "2026-10-30T08:41:22.986612471Z",
  "refresh_token": "8VoamRrjsrykSDL6RZ2AMsUPieOZxvS85LHWVeZggnY",
  "refresh_expires_at": "2026-10-30T20:26:22.985960086Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d/cash-dispute` → **200**

```json
{
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7ca4812d-336a-421b-aeaf-65cc7236268b",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:26:22.959958Z",
  "decide_by": "2026-11-13T08:26:22.959958Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:26:22.959958Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "7ca4812d-336a-421b-aeaf-65cc7236268b",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:26:22.959958Z",
      "decide_by": "2026-11-13T08:26:22.959958Z",
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

`POST /api/admin/v1/orders/cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d/cash-dispute/decide` → **400**

```json
{
  "command_id": "313284e4-a72f-49d6-a7b0-3ae2e63ee133",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "53c3a4a2-d228-4a8f-9716-bd558e486c5b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d/cash-dispute/decide` → **200**

```json
{
  "command_id": "6c93f4e3-5f8a-4e33-90a5-c671b38346b4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7ca4812d-336a-421b-aeaf-65cc7236268b",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:26:22.959958Z",
  "decide_by": "2026-11-13T08:26:22.959958Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:26:24.103075Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d/cash-dispute/decide` → **409**

```json
{
  "command_id": "9a6f9614-0dd5-497f-961f-ec1130c01531",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ce934055-a85a-475d-802d-40eb839f570d"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c027053c-e570-4fc8-bcf2-dfabd385fa9b",
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
  "last_heartbeat_at": "2026-10-30T08:26:21.489984Z",
  "last_location_at": "2026-10-30T08:26:21.489984Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c027053c-e570-4fc8-bcf2-dfabd385fa9b/close` → **200**

```json
{
  "command_id": "354e3876-a99d-4487-b320-3ad614cde831",
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
  "phone": "+380730039121",
  "device_ref": "sandbox-12032"
}
```

```json
{
  "challenge_id": "6c44e75f-8497-44e5-95eb-efb00d7a6518",
  "expires_at": "2026-10-30T08:31:25.257974763Z",
  "resend_available_at": "2026-10-30T08:26:26.257974763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730039121` → **200**

```json
{
  "phone": "+380730039121",
  "audience": "CLIENT",
  "code": "530276",
  "sent_at": "2026-10-30T08:26:25.260708621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c44e75f-8497-44e5-95eb-efb00d7a6518",
  "code": "530276",
  "device_ref": "sandbox-12032"
}
```

```json
{
  "session_id": "8ae0e60a-c264-4651-9c01-2d07b1f10550",
  "subject": {
    "type": "CLIENT",
    "id": "53da56cd-8cbd-4f67-a852-d643185424d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2RhNTZjZC04Y2JkLTRmNjctYTg1Mi1kNjQzMTg1NDI0ZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5Njg1LCJpYXQiOjE3OTMzNDg3ODUsImp0aSI6IjAxMWE2NzI1LWI1ZjgtNGNiYi1iMDBlLWFmZjMwYWM2YTgxYyIsInNpZCI6IjhhZTBlNjBhLWMyNjQtNDY1MS05YzAxLTJkMDdiMWYxMDU1MCJ9.O50D3Qcbky1mrcGGl53sCcnmwTl7MJRo-g2WHeDe-uM",
  "access_expires_at": "2026-10-30T08:41:25.565049094Z",
  "refresh_token": "NESArOwb07gTatvohwwg0-dkO08QeuFi2rxqo5SzGLA",
  "refresh_expires_at": "2026-11-29T08:26:25.564549681Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ab3bab08-4378-4a6a-8214-306c700d65d4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b59e63fc-dc1f-4ef2-9a17-b6fcb9f60d1c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b59e63fc-dc1f-4ef2-9a17-b6fcb9f60d1c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b7a0c1928c7b48bc3933c940c68b9252",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b59e63fc-dc1f-4ef2-9a17-b6fcb9f60d1c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730039121"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b59e63fc-dc1f-4ef2-9a17-b6fcb9f60d1c",
  "expires_at": "2026-10-30T08:56:25.842311Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b59e63fc-dc1f-4ef2-9a17-b6fcb9f60d1c` → **200**

```json
{
  "id": "b59e63fc-dc1f-4ef2-9a17-b6fcb9f60d1c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:56:25.842311Z",
  "card": {
    "id": "55497bc0-215b-49fb-a9f5-12edd9bbab80",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8207",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:26:26.109862Z"
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
  "device_ref": "sandbox-2735"
}
```

```json
{
  "challenge_id": "e2e54d22-33f7-4b53-9de9-9876a02b28e4",
  "expires_at": "2026-10-30T08:31:26.363093223Z",
  "resend_available_at": "2026-10-30T08:26:27.363093223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "811606",
  "sent_at": "2026-10-30T08:26:26.366217873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2e54d22-33f7-4b53-9de9-9876a02b28e4",
  "code": "811606",
  "device_ref": "sandbox-2735"
}
```

```json
{
  "session_id": "03436aa0-8338-4d7c-91f0-2a429fcd95c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTY4NiwiaWF0IjoxNzkzMzQ4Nzg2LCJqdGkiOiJlZDU0NTcyOC0xOTJmLTRmZjctOGNjNy1mZTk0MmIzNzIwMTEiLCJzaWQiOiIwMzQzNmFhMC04MzM4LTRkN2MtOTFmMC0yYTQyOWZjZDk1YzcifQ.mZMrIf70z_h0LQu9j-K6ujbcSv1MRfeedxpdd0ASNbM",
  "access_expires_at": "2026-10-30T08:41:26.66383488Z",
  "refresh_token": "-Cnf0rYZktm8WhBrRXtIdxRCLR-GlAU9dpXw8A9xmEY",
  "refresh_expires_at": "2026-11-29T08:26:26.663200702Z",
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
  "command_id": "87cd5c7e-8e24-4570-abe0-2396f6da84f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:26:27Z",
    "sequence": 1793348787198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9",
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
  "last_heartbeat_at": "2026-10-30T08:26:27.21923Z",
  "last_location_at": "2026-10-30T08:26:27.21923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "766ddb22-b485-4237-af37-551f8cb8494e",
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
  "id": "6b15fc7e-7cbf-4b16-92b8-c677043e6609",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:27.501079Z",
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
  "command_id": "2eff765f-6410-492f-ad2a-79bd78f0451f",
  "quote_id": "6b15fc7e-7cbf-4b16-92b8-c677043e6609",
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
  "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "53da56cd-8cbd-4f67-a852-d643185424d9",
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
  "created_at": "2026-10-30T08:26:27.796436Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a` → **200**

```json
{
  "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "53da56cd-8cbd-4f67-a852-d643185424d9",
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
  "created_at": "2026-10-30T08:26:27.796436Z",
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
    "id": "f7f37c5d-1024-4d07-8537-558aaba132c7",
    "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
    "expires_at": "2026-10-30T08:26:43.003844Z",
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

`POST /api/driver/v1/offers/f7f37c5d-1024-4d07-8537-558aaba132c7/accept` → **200**

```json
{
  "command_id": "aa732170-b23d-41af-ab44-f5347085e718"
}
```

```json
{
  "id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "assignment_id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
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

`POST /api/rider/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/messages` → **201**

```json
{
  "command_id": "9314a8d5-6636-4557-ab78-e3915ad249ad",
  "body": "Я біля входу, мій номер +380730039121, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "33e88003-4550-483a-857c-1e707e54f84b",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730039121, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:26:29.182524453Z"
}
```

`POST /api/driver/v1/trips/3ce1b899-f8fe-412e-9044-017788c37c2b/messages` → **201**

```json
{
  "command_id": "7328c545-3ae8-4706-befd-c26555665c8e",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "04795318-9520-4d2f-9e53-2ff7b08f48ad",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:26:29.478110073Z"
}
```

`POST /api/driver/v1/work-sessions/4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:26:29Z",
    "sequence": 1793348789753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9",
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
  "last_heartbeat_at": "2026-10-30T08:26:29.773718Z",
  "last_location_at": "2026-10-30T08:26:29.773718Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3ce1b899-f8fe-412e-9044-017788c37c2b/arrive` → **200**

```json
{
  "command_id": "6184b72d-2d74-4c66-afc0-6b2f63b6e5c6",
  "expected_version": 0
}
```

```json
{
  "id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "assignment_id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
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
  "arrived_at": "2026-10-30T08:26:30.061947Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3ce1b899-f8fe-412e-9044-017788c37c2b/start` → **200**

```json
{
  "command_id": "f95f8a70-df3f-45fe-adae-a49ef1eec43d",
  "expected_version": 1
}
```

```json
{
  "id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "assignment_id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
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
  "arrived_at": "2026-10-30T08:26:30.061947Z",
  "started_at": "2026-10-30T08:26:30.353815Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:26:30Z",
    "sequence": 1793348790616
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9",
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
  "last_heartbeat_at": "2026-10-30T08:26:30.636833Z",
  "last_location_at": "2026-10-30T08:26:30.636833Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/3ce1b899-f8fe-412e-9044-017788c37c2b/complete` → **200**

```json
{
  "command_id": "5523d271-08a9-4891-b043-90976fef3b8c",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:26:30Z",
  "cash_received": false
}
```

```json
{
  "id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "assignment_id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
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
  "arrived_at": "2026-10-30T08:26:30.061947Z",
  "started_at": "2026-10-30T08:26:30.353815Z",
  "completed_at": "2026-10-30T08:26:30.942653Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a` → **200**

```json
{
  "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "53da56cd-8cbd-4f67-a852-d643185424d9",
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
    "id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
    "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:26:27.796436Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a` → **200**

```json
{
  "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "53da56cd-8cbd-4f67-a852-d643185424d9",
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
    "id": "a9ae8ce1-70a6-400c-bc96-563baae1d83d",
    "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3ce1b899-f8fe-412e-9044-017788c37c2b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:26:27.796436Z",
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
  "session_id": "4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9",
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
  "last_heartbeat_at": "2026-10-30T08:26:30.636833Z",
  "last_location_at": "2026-10-30T08:26:30.636833Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4d522cf3-3df1-4b4e-91db-9a6d02bc5fe9/close` → **200**

```json
{
  "command_id": "03818196-89b1-46ec-a60f-aaf164e1ed0f",
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
  "session_id": "67c0060a-0f33-4bdf-87bf-81ded61264f3",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2OTMsImlhdCI6MTc5MzM0ODc5MywianRpIjoiMDY3M2MwZWItYTBiNi00OGEyLTgyNWMtOWMwOTMwNGI3ZTNkIiwic2lkIjoiNjdjMDA2MGEtMGYzMy00YmRmLTg3YmYtODFkZWQ2MTI2NGYzIn0.GNhz-0qAjEfSIQ0WZclD06lGY7Z5EpyFIbqNZy1DUC8",
  "access_expires_at": "2026-10-30T08:41:33.692273641Z",
  "refresh_token": "3qhGpYvGZKByhx4Yt1BI8gvZHgPxZme-JwLUU8h2-LM",
  "refresh_expires_at": "2026-10-30T20:26:33.691638097Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c464c902-67dd-42d8-8d4a-7ef06a7a654b"
}
```

`GET /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:26:34.216701879Z",
  "order": {
    "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
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
    "created_at": "2026-10-30T08:26:27.796436Z",
    "assigned_at": "2026-10-30T08:26:28.637157Z",
    "arrived_at": "2026-10-30T08:26:30.061947Z",
    "started_at": "2026-10-30T08:26:30.353815Z",
    "completed_at": "2026-10-30T08:26:30.942653Z"
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
    "id": "53da56cd-8cbd-4f67-a852-d643185424d9",
    "registered_at": "2026-10-30T08:26:25.562742Z",
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
      "created_at": "2026-10-30T08:26:27.798559Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:26:31.084808Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks` → **422**

```json
{
  "command_id": "0976afc3-e023-46db-97f6-32187994caa6",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "89b1c12b-01d5-4f58-a1c4-c36d0faf778c"
}
```

`POST /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks` → **201**

```json
{
  "command_id": "878103d1-620e-4fff-9153-cc4721b4b9cd",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "01c8c0f8-ba02-49bc-bd90-7b61c3433c1f",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:26:34.874027Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks` → **201**

```json
{
  "command_id": "878103d1-620e-4fff-9153-cc4721b4b9cd",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "01c8c0f8-ba02-49bc-bd90-7b61c3433c1f",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:26:34.874027Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/53da56cd-8cbd-4f67-a852-d643185424d9` → **200**

```json
{
  "client": {
    "id": "53da56cd-8cbd-4f67-a852-d643185424d9",
    "phone": "+380730039121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:26:25.562742Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:26:27.796436Z",
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

`POST /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks/01c8c0f8-ba02-49bc-bd90-7b61c3433c1f/resolve` → **200**

```json
{
  "command_id": "edf7d855-cb1f-45c0-a6c3-ed16a33bcc92",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "01c8c0f8-ba02-49bc-bd90-7b61c3433c1f",
  "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:26:34.874027Z",
  "resolved_at": "2026-10-30T08:26:35.740378Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/53da56cd-8cbd-4f67-a852-d643185424d9` → **200**

```json
{
  "client": {
    "id": "53da56cd-8cbd-4f67-a852-d643185424d9",
    "phone": "+380730039121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:26:25.562742Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:26:27.796436Z",
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

`GET /api/admin/v1/clients/53da56cd-8cbd-4f67-a852-d643185424d9` → **200**

```json
{
  "client": {
    "id": "53da56cd-8cbd-4f67-a852-d643185424d9",
    "phone": "+380730039121",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:26:25.562742Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:26:27.796436Z",
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

`POST /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks/01c8c0f8-ba02-49bc-bd90-7b61c3433c1f/resolve` → **409**

```json
{
  "command_id": "5d54ca89-2f66-4129-b8d2-a84e3a4e61cd",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks/01c8c0f8-ba02-49bc-bd90-7b61c3433c1f/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5dd813d9-a66d-43b5-b273-855879d788d4"
}
```

`GET /api/admin/v1/orders/146a907a-f4b8-423c-963f-7ad7fe6a954a/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "01c8c0f8-ba02-49bc-bd90-7b61c3433c1f",
      "order_id": "146a907a-f4b8-423c-963f-7ad7fe6a954a",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:26:34.874027Z",
      "resolved_at": "2026-10-30T08:26:35.740378Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 146a907a-f4b8-423c-963f-7ad7fe6a954a without phone or card digits; chargeback 01c8c0f8-ba02-49bc-bd90-7b61c3433c1f recorded and won.

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
  "session_id": "1cda7236-dbd9-499b-9cf5-9554aa5025a0",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk2OTgsImlhdCI6MTc5MzM0ODc5OCwianRpIjoiZThjNzhiYWEtOTc3ZC00MjYxLWE1NjQtMWNiZTNkM2Y3MjMyIiwic2lkIjoiMWNkYTcyMzYtZGJkOS00OTliLTljZjUtOTU1NGFhNTAyNWEwIn0.srQj7ilO92-tixI28uQsT7Sw8MRQmbrGCFauJpguv4A",
  "access_expires_at": "2026-10-30T08:41:38.722126595Z",
  "refresh_token": "VQj9VzAGbZc40cZ0l99vBwVzXIOOiKV2NnngIFJtVZ4",
  "refresh_expires_at": "2026-10-30T20:26:38.721497966Z",
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
  "phone": "+48600749063",
  "device_ref": "sandbox-29022"
}
```

```json
{
  "challenge_id": "1bfdd039-8dbb-4251-8ad6-332186199774",
  "expires_at": "2026-10-30T08:31:39.540134427Z",
  "resend_available_at": "2026-10-30T08:26:40.540134427Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600749063` → **200**

```json
{
  "phone": "+48600749063",
  "audience": "CLIENT",
  "code": "775408",
  "sent_at": "2026-10-30T08:26:39.542734603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bfdd039-8dbb-4251-8ad6-332186199774",
  "code": "775408",
  "device_ref": "sandbox-29022"
}
```

```json
{
  "session_id": "f2159b66-bf01-4e5d-ac8b-84d793ec328a",
  "subject": {
    "type": "CLIENT",
    "id": "39f3137f-5127-4303-85c0-f0a5ca2fa4bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWYzMTM3Zi01MTI3LTQzMDMtODVjMC1mMGE1Y2EyZmE0YmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5Njk5LCJpYXQiOjE3OTMzNDg3OTksImp0aSI6ImVlNzVjZDEwLTQ2YmEtNGVmYS04NDk3LTFkNWVkMWRlZmVmOCIsInNpZCI6ImYyMTU5YjY2LWJmMDEtNGU1ZC1hYzhiLTg0ZDc5M2VjMzI4YSJ9.rnLneI3XD8CIQliO3YCMOh133QJBatEIVRcvGN7UKk8",
  "access_expires_at": "2026-10-30T08:41:39.843344553Z",
  "refresh_token": "UvTRuaOdlWWPzi1mkydrDV4n8fgfxATbDUAaHqluEiM",
  "refresh_expires_at": "2026-11-29T08:26:39.84288969Z",
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
  "command_id": "700bdb7c-54f8-4765-9c0e-7fd7c837c19a",
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
  "correlation_id": "6c6746f8-78b5-40da-b041-be4e0276b573",
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
  "command_id": "33f03cc3-53be-48e5-a901-7309d2dc1df1",
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
  "paused_at": "2026-10-30T08:26:40.918852017Z",
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
  "command_id": "ae0c0be1-a928-4465-9f16-db4a9d2bb767",
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
  "id": "dc666844-2761-4483-81b7-dff0160a9834",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:41.502434Z",
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
  "command_id": "6d28dd20-6a3f-4aeb-996b-1c8f04610f67",
  "quote_id": "dc666844-2761-4483-81b7-dff0160a9834",
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
  "correlation_id": "4f6fca38-aed4-4410-8c15-25020fc4affc"
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
  "paused_at": "2026-10-30T08:26:40.918852Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "80addad5-d4b0-4dff-b901-9cbe14880d4e",
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
  "command_id": "8c39d71e-9670-4ebb-813d-a398185b84e1",
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
  "command_id": "20954fa8-feb9-4d92-98be-4fbe7c1facf4",
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
  "id": "cab882b7-ef97-45fb-b60b-472193a11a76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:43.162492Z",
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
  "command_id": "198ebc3f-8edc-4601-ac8b-af1ac1330b50",
  "quote_id": "cab882b7-ef97-45fb-b60b-472193a11a76",
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
  "correlation_id": "c3efd127-2594-46b6-81bc-43fa88279492"
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
  "command_id": "e65a68c6-ad17-4c67-a8ca-a9a42407e69a",
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
  "command_id": "2a176f45-03c3-495c-b28c-7ea8ecef2d31",
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
  "id": "d55d7b12-6a25-47f9-9704-3597debe6556",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:44.280527Z",
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
  "command_id": "a0438105-7a73-4f25-8403-f2c29822643f",
  "quote_id": "d55d7b12-6a25-47f9-9704-3597debe6556",
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
  "correlation_id": "d338b77d-367d-45f0-81ed-56e99e3a7db5"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "4ba63a9b-be2c-4742-85d2-2710ee9fde87",
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
  "correlation_id": "3e5dac28-cd32-4996-9e7e-b64150dc4fa9"
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
  "command_id": "fc04bc1d-55bd-4720-9ef4-68b2bfbcdba2",
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
  "phone": "+380679392107",
  "device_ref": "sandbox-13023"
}
```

```json
{
  "challenge_id": "dd5e9508-d6ee-4a7a-aa6d-c67d23cf2f32",
  "expires_at": "2026-10-30T08:31:45.755851837Z",
  "resend_available_at": "2026-10-30T08:26:46.755851837Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679392107` → **200**

```json
{
  "phone": "+380679392107",
  "audience": "CLIENT",
  "code": "428481",
  "sent_at": "2026-10-30T08:26:45.758203785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd5e9508-d6ee-4a7a-aa6d-c67d23cf2f32",
  "code": "428481",
  "device_ref": "sandbox-13023"
}
```

```json
{
  "session_id": "f7256bb5-712b-42c1-b767-f3051b0b96b0",
  "subject": {
    "type": "CLIENT",
    "id": "4ec4b357-c76d-48bc-81ac-71619682b191"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWM0YjM1Ny1jNzZkLTQ4YmMtODFhYy03MTYxOTY4MmIxOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzA2LCJpYXQiOjE3OTMzNDg4MDYsImp0aSI6ImI1NDBlNGU2LTRhNmItNDU2ZC1iMDI1LWMyN2YyMDU2MTFkZiIsInNpZCI6ImY3MjU2YmI1LTcxMmItNDJjMS1iNzY3LWYzMDUxYjBiOTZiMCJ9.BjPLQAMSQW0LrdznweumfltHE0xc7sj3ZyC6-7pESr0",
  "access_expires_at": "2026-10-30T08:41:46.052341767Z",
  "refresh_token": "NuTuPhWKn6lstjzR3mGjfEbqSW4lrSy8OjC28HSYtsg",
  "refresh_expires_at": "2026-11-29T08:26:46.051745506Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4ec4b357-c76d-48bc-81ac-71619682b191",
  "session_id": "f7256bb5-712b-42c1-b767-f3051b0b96b0",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "215939d5-022b-4b9c-aeef-d1404c0cd3b8",
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
  "id": "1750f966-5f84-469d-a756-00597065314c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:31:46.607263Z",
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
  "challenge_id": "45597564-6b1e-49f8-a141-ad5afc85c39d",
  "expires_at": "2026-10-30T08:31:48.891404891Z",
  "resend_available_at": "2026-10-30T08:26:49.891404891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679392107` → **200**

```json
{
  "phone": "+380679392107",
  "audience": "CLIENT",
  "code": "638120",
  "sent_at": "2026-10-30T08:26:48.894013529Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "10f0a1d6-47dd-497c-9dd9-499d3eab36f9",
  "challenge_id": "45597564-6b1e-49f8-a141-ad5afc85c39d",
  "otp_code": "638120"
}
```

```json
{
  "client_id": "4ec4b357-c76d-48bc-81ac-71619682b191",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:26:49.210280244Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e4c69ac9-ec3d-49e0-a4d2-e3cc88dd8d78",
  "quote_id": "1750f966-5f84-469d-a756-00597065314c",
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
  "correlation_id": "00b23969-afec-486e-ae35-1c6f30fd7112"
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
  "session_id": "de93c8e4-7e11-49f9-9be2-caf2d3baed7f",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MTAsImlhdCI6MTc5MzM0ODgxMCwianRpIjoiNWZjYzNhMDctY2VjZi00ODE1LTlhZWMtYzEzOGI3ZjZhOWJjIiwic2lkIjoiZGU5M2M4ZTQtN2UxMS00OWY5LTliZTItY2FmMmQzYmFlZDdmIn0.KQpcdFtni_XL0DYS1OnaWexM8T7D8rFiGHsxRb_Xbvo",
  "access_expires_at": "2026-10-30T08:41:50.091326052Z",
  "refresh_token": "rUSVa3Zp2_ARsUPvtrkK0ayYxSFyRZNO6-P310M0sqs",
  "refresh_expires_at": "2026-10-30T20:26:50.090844089Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4ec4b357-c76d-48bc-81ac-71619682b191",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:26:49.21028Z",
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

`POST /api/admin/v1/client-deletions/4ec4b357-c76d-48bc-81ac-71619682b191/complete` → **200**

```json
{
  "command_id": "6db0c43f-6045-4679-81c3-75b918e9f783",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4ec4b357-c76d-48bc-81ac-71619682b191",
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
  "correlation_id": "6c26a7b0-3135-41f0-b6fc-5428992d1431"
}
```

Done: client 4ec4b357-c76d-48bc-81ac-71619682b191 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663578036",
  "device_ref": "sandbox-18181"
}
```

```json
{
  "challenge_id": "e16650f9-3671-448d-b353-d663a751a5bc",
  "expires_at": "2026-10-30T08:31:51.204593017Z",
  "resend_available_at": "2026-10-30T08:26:52.204593017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663578036` → **200**

```json
{
  "phone": "+380663578036",
  "audience": "CLIENT",
  "code": "613823",
  "sent_at": "2026-10-30T08:26:51.207483371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e16650f9-3671-448d-b353-d663a751a5bc",
  "code": "613823",
  "device_ref": "sandbox-18181"
}
```

```json
{
  "session_id": "67d4da37-2fad-44a9-bfcb-e933edf0a5b7",
  "subject": {
    "type": "CLIENT",
    "id": "9e29501c-fb86-4483-819d-4e66c4d30e44"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTI5NTAxYy1mYjg2LTQ0ODMtODE5ZC00ZTY2YzRkMzBlNDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzExLCJpYXQiOjE3OTMzNDg4MTEsImp0aSI6IjY4NjI5Yjg3LWI2MjAtNDYyMy05ZjQyLWU4NGNjZDE2ZGYxOSIsInNpZCI6IjY3ZDRkYTM3LTJmYWQtNDRhOS1iZmNiLWU5MzNlZGYwYTViNyJ9.OqTXZ0N5hTYRloUCIeac5e6FYTb-Dp5sTs5YvWGGE0s",
  "access_expires_at": "2026-10-30T08:41:51.5048855Z",
  "refresh_token": "fafl_MbHSUqS5Z8u2E3hRe7e5B6xcaR-L3QzIGAtM-4",
  "refresh_expires_at": "2026-11-29T08:26:51.50431072Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
  "session_id": "67d4da37-2fad-44a9-bfcb-e933edf0a5b7",
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
  "session_id": "3136102c-6a47-43ce-a55a-25163141ed44",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MTIsImlhdCI6MTc5MzM0ODgxMiwianRpIjoiZmNjNjg0MDEtZmYyNy00YTdhLThlNzItOTY5MmE5ZDBlMGEyIiwic2lkIjoiMzEzNjEwMmMtNmE0Ny00M2NlLWE1NWEtMjUxNjMxNDFlZDQ0In0.8qMTdB7DNI7Rf17bq2ISLvV1cgPX776CMjcg7hpA8R4",
  "access_expires_at": "2026-10-30T08:41:52.338975953Z",
  "refresh_token": "0LlVO6tc7byWxYmvkOZOTNeTgHAzsk846iOCV7qaIZ4",
  "refresh_expires_at": "2026-10-30T20:26:52.338424407Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3578036&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
      "phone": "+380663578036",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:26:51.50229Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9e29501c-fb86-4483-819d-4e66c4d30e44` → **200**

```json
{
  "client": {
    "id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
    "phone": "+380663578036",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:26:51.50229Z",
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

`POST /api/admin/v1/clients/9e29501c-fb86-4483-819d-4e66c4d30e44/block` → **400**

```json
{
  "command_id": "31f6959a-47c5-4d4e-9894-ffcc6c94928a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9e29501c-fb86-4483-819d-4e66c4d30e44/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c6d83d58-80f7-4b09-9aad-9c7bddc95f22",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9e29501c-fb86-4483-819d-4e66c4d30e44/block` → **200**

```json
{
  "command_id": "1fc39a95-d2b2-4ddc-949f-ca37d0163282",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
  "phone": "+380663578036",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:26:51.50229Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:26:53.505776Z",
    "by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
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
  "correlation_id": "d04caa9f-dbf5-4410-abaf-3f6583c74dbd"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663578036",
  "device_ref": "sandbox-14573"
}
```

```json
{
  "challenge_id": "2ad635a9-f094-487f-a5ef-13ad4a2bbc1d",
  "expires_at": "2026-10-30T08:31:56.083498874Z",
  "resend_available_at": "2026-10-30T08:26:57.083498874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663578036` → **200**

```json
{
  "phone": "+380663578036",
  "audience": "CLIENT",
  "code": "108533",
  "sent_at": "2026-10-30T08:26:56.086266729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "2ad635a9-f094-487f-a5ef-13ad4a2bbc1d",
  "code": "108533",
  "device_ref": "sandbox-14573"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "091975ff-ac2c-4294-aa5d-9bfc29707d3a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9e29501c-fb86-4483-819d-4e66c4d30e44` → **200**

```json
{
  "client": {
    "id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
    "phone": "+380663578036",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:26:51.50229Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:26:53.505776Z",
      "by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
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

`POST /api/admin/v1/clients/9e29501c-fb86-4483-819d-4e66c4d30e44/unblock` → **200**

```json
{
  "command_id": "af3a2c2b-d802-477f-a658-4e14aabf16c6",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
  "phone": "+380663578036",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:26:51.50229Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663578036",
  "device_ref": "sandbox-1492"
}
```

```json
{
  "challenge_id": "b1ebf7cd-a45e-4a25-88e5-cbd3c3f4fc58",
  "expires_at": "2026-10-30T08:31:59.204494712Z",
  "resend_available_at": "2026-10-30T08:27:00.204494712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663578036` → **200**

```json
{
  "phone": "+380663578036",
  "audience": "CLIENT",
  "code": "824335",
  "sent_at": "2026-10-30T08:26:59.207784374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1ebf7cd-a45e-4a25-88e5-cbd3c3f4fc58",
  "code": "824335",
  "device_ref": "sandbox-1492"
}
```

```json
{
  "session_id": "d722a339-b087-4565-8f30-4b812b2db9fb",
  "subject": {
    "type": "CLIENT",
    "id": "9e29501c-fb86-4483-819d-4e66c4d30e44"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTI5NTAxYy1mYjg2LTQ0ODMtODE5ZC00ZTY2YzRkMzBlNDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzE5LCJpYXQiOjE3OTMzNDg4MTksImp0aSI6ImVhN2RjNWJhLWIwYWEtNDA5NC1hODU3LTc3MjBkNzFmN2M0OSIsInNpZCI6ImQ3MjJhMzM5LWIwODctNDU2NS04ZjMwLTRiODEyYjJkYjlmYiJ9.DC4eTwoV5CVHzDU8_tuPZjRLyls5-13N9IBd3WQBnqs",
  "access_expires_at": "2026-10-30T08:41:59.499883487Z",
  "refresh_token": "y7M8iIgMnUjdd8OMgB64HpexoFFKutmMNCX2DQHUR1c",
  "refresh_expires_at": "2026-11-29T08:26:59.499337339Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9e29501c-fb86-4483-819d-4e66c4d30e44",
  "session_id": "d722a339-b087-4565-8f30-4b812b2db9fb",
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
  "phone": "+380669998684",
  "device_ref": "sandbox-10303"
}
```

```json
{
  "challenge_id": "ea59607b-905a-4a93-8652-36fd349fe8ab",
  "expires_at": "2026-10-30T08:32:00.065896328Z",
  "resend_available_at": "2026-10-30T08:27:01.065896328Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669998684` → **200**

```json
{
  "phone": "+380669998684",
  "audience": "CLIENT",
  "code": "008880",
  "sent_at": "2026-10-30T08:27:00.069510647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea59607b-905a-4a93-8652-36fd349fe8ab",
  "code": "008880",
  "device_ref": "sandbox-10303"
}
```

```json
{
  "session_id": "1bd5101c-04ff-48aa-935e-8faba53b377d",
  "subject": {
    "type": "CLIENT",
    "id": "70f9582d-bd61-465f-8796-0e2839f2838b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGY5NTgyZC1iZDYxLTQ2NWYtODc5Ni0wZTI4MzlmMjgzOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzIwLCJpYXQiOjE3OTMzNDg4MjAsImp0aSI6IjA1MjUzODI0LTliMjQtNDRiOS05N2M4LTcwY2I4NzZiNThlYSIsInNpZCI6IjFiZDUxMDFjLTA0ZmYtNDhhYS05MzVlLThmYWJhNTNiMzc3ZCJ9.VqD2-nG6OoatXSCbKb2lB25OSHTsRZxF7dpglCvX2o4",
  "access_expires_at": "2026-10-30T08:42:00.369588147Z",
  "refresh_token": "gaTl0xxNCSQqXZT7mzeuF16wXEmFAe_uIr0VaB7ERS0",
  "refresh_expires_at": "2026-11-29T08:27:00.369133755Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "05282646-a74e-4f4c-ab8b-dcd145df69ed",
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
  "id": "0f0ed218-5162-4b4d-ab92-294d62bb6722",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:32:00.658945Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 87a83ece-c340-4264-95d5-a13af73debdc) → **201**

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
  "session_id": "d619c877-4511-4781-a14a-d78bf9fa19c8",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MjEsImlhdCI6MTc5MzM0ODgyMSwianRpIjoiMjIwMzU3OTUtMDBiOC00MTE3LTg0OWUtZjJiMDMzNjRkN2Q0Iiwic2lkIjoiZDYxOWM4NzctNDUxMS00NzgxLWExNGEtZDc4YmY5ZmExOWM4In0.ScmRuqCfPmSeM5Q4tpCt9S1a0eN_0o2wj24ikOHwi9w",
  "access_expires_at": "2026-10-30T08:42:01.298484081Z",
  "refresh_token": "09MLZSsdcUln7-jbEqgGOrhZoui-2q4oYt9Hn_p0h24",
  "refresh_expires_at": "2026-10-30T20:27:01.297904825Z",
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
  "session_id": "6c76a3d0-3994-4070-b88d-f38ab1ab4495",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MjEsImlhdCI6MTc5MzM0ODgyMSwianRpIjoiNTgyNDMyNDMtYzAwOS00N2UwLWFmZTItOGZmNjgxZTNjNzk4Iiwic2lkIjoiNmM3NmEzZDAtMzk5NC00MDcwLWI4OGQtZjM4YWIxYWI0NDk1In0.AqWEt_VwwrBMlNEs_bF7vkHwk4PH8JybCdeIyPxxzlg",
  "access_expires_at": "2026-10-30T08:42:01.88083724Z",
  "refresh_token": "-trNntBkhBhfwc8z7iio2sqmgi6dHOXXRzIbSOfAj9A",
  "refresh_expires_at": "2026-10-30T20:27:01.880409007Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f3d5d227-6057-44c5-89e1-4cdf0250533a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:27:00.966599Z",
      "actor": {
        "type": "CLIENT",
        "id": "70f9582d-bd61-465f-8796-0e2839f2838b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
        "quote_id": "0f0ed218-5162-4b4d-ab92-294d62bb6722",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "87a83ece-c340-4264-95d5-a13af73debdc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:27:00.969159Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
        "attempt_id": "353da794-b060-4094-85bb-a0557a1d821d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "87a83ece-c340-4264-95d5-a13af73debdc"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:27:00.979582Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
        "attempt_id": "353da794-b060-4094-85bb-a0557a1d821d"
      },
      "correlation_id": "87a83ece-c340-4264-95d5-a13af73debdc"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "353da794-b060-4094-85bb-a0557a1d821d",
        "generation": 1,
        "started_at": "2026-10-30T08:27:00.967882Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:27:00.979582Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:27:00.970019Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/87a83ece-c340-4264-95d5-a13af73debdc` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "f3d5d227-6057-44c5-89e1-4cdf0250533a:0",
      "order_id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
      "at": "2026-10-30T08:27:00.966599Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f3d5d227-6057-44c5-89e1-4cdf0250533a:1",
      "order_id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
      "at": "2026-10-30T08:27:00.969159Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f3d5d227-6057-44c5-89e1-4cdf0250533a:2",
      "order_id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
      "at": "2026-10-30T08:27:00.979582Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/a2244404-74ca-4d11-a042-dc2878b5fbcf` → **200**

```json
{
  "found": []
}
```

Done: request 87a83ece-c340-4264-95d5-a13af73debdc — order f3d5d227-6057-44c5-89e1-4cdf0250533a found by its id.

`GET /api/rider/v1/orders/f3d5d227-6057-44c5-89e1-4cdf0250533a` → **200**

```json
{
  "id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70f9582d-bd61-465f-8796-0e2839f2838b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:27:00.96577Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f3d5d227-6057-44c5-89e1-4cdf0250533a/cancel` → **200**

```json
{
  "command_id": "a56f3130-cadc-43b9-9ee1-0731fc2e24dd",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f3d5d227-6057-44c5-89e1-4cdf0250533a",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "70f9582d-bd61-465f-8796-0e2839f2838b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:27:00.96577Z",
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
  "phone": "+380634785620",
  "device_ref": "sandbox-22341"
}
```

```json
{
  "challenge_id": "1c2ce787-9e2f-4d35-9db7-a01a401237da",
  "expires_at": "2026-10-30T08:32:03.654961796Z",
  "resend_available_at": "2026-10-30T08:27:04.654961796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634785620` → **200**

```json
{
  "phone": "+380634785620",
  "audience": "CLIENT",
  "code": "382240",
  "sent_at": "2026-10-30T08:27:03.658112414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c2ce787-9e2f-4d35-9db7-a01a401237da",
  "code": "382240",
  "device_ref": "sandbox-22341"
}
```

```json
{
  "session_id": "b4d73d1d-783b-486b-8067-f96a34823a3d",
  "subject": {
    "type": "CLIENT",
    "id": "8132312b-b899-4cbb-b614-e75fd0add5bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTMyMzEyYi1iODk5LTRjYmItYjYxNC1lNzVmZDBhZGQ1YmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzIzLCJpYXQiOjE3OTMzNDg4MjMsImp0aSI6IjVmODk4YjUxLWI0NmYtNGY5Ni1iMGMwLWQ5MjQ0ZjBkNzg3NCIsInNpZCI6ImI0ZDczZDFkLTc4M2ItNDg2Yi04MDY3LWY5NmEzNDgyM2EzZCJ9.29R4ZSJeULiO35ETQHKpKvhtTeo9xA8UxtvtIwAsmk4",
  "access_expires_at": "2026-10-30T08:42:03.996447601Z",
  "refresh_token": "_qYnGX6qEPdS4J5Hxe2gBPBBKQFlr7Q1qmRCbVB1RZM",
  "refresh_expires_at": "2026-11-29T08:27:03.995995112Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "aa890a47-ec5a-4428-88cc-55b1a019364c",
  "expires_at": "2026-10-30T08:32:06.276183019Z",
  "resend_available_at": "2026-10-30T08:27:07.276183019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634785620` → **200**

```json
{
  "phone": "+380634785620",
  "audience": "CLIENT",
  "code": "064537",
  "sent_at": "2026-10-30T08:27:06.279375409Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "5bc27325-3bf9-474c-84df-1f55603843d4",
  "challenge_id": "aa890a47-ec5a-4428-88cc-55b1a019364c",
  "otp_code": "064537"
}
```

```json
{
  "id": "32ffca33-baf9-47c1-9778-61db917939de",
  "state": "PENDING",
  "created_at": "2026-10-30T08:27:06.615535Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de` → **200**

```json
{
  "id": "32ffca33-baf9-47c1-9778-61db917939de",
  "state": "PENDING",
  "created_at": "2026-10-30T08:27:06.615535Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de` → **200**

```json
{
  "id": "32ffca33-baf9-47c1-9778-61db917939de",
  "state": "PENDING",
  "created_at": "2026-10-30T08:27:06.615535Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de` → **200**

```json
{
  "id": "32ffca33-baf9-47c1-9778-61db917939de",
  "state": "PENDING",
  "created_at": "2026-10-30T08:27:06.615535Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de` → **200**

```json
{
  "id": "32ffca33-baf9-47c1-9778-61db917939de",
  "state": "READY",
  "created_at": "2026-10-30T08:27:06.615535Z",
  "ready_at": "2026-10-30T08:27:09.625093Z",
  "expires_at": "2026-11-06T08:27:09.625093Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631656293",
  "device_ref": "sandbox-32534"
}
```

```json
{
  "challenge_id": "eae6f802-3663-4122-a580-aa1166fe6c65",
  "expires_at": "2026-10-30T08:32:11.098656183Z",
  "resend_available_at": "2026-10-30T08:27:12.098656183Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631656293` → **200**

```json
{
  "phone": "+380631656293",
  "audience": "CLIENT",
  "code": "564589",
  "sent_at": "2026-10-30T08:27:11.102002546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eae6f802-3663-4122-a580-aa1166fe6c65",
  "code": "564589",
  "device_ref": "sandbox-32534"
}
```

```json
{
  "session_id": "6009cdd0-f261-4fc9-a7b0-1fb57ba2a5ec",
  "subject": {
    "type": "CLIENT",
    "id": "3edefa9e-4c9e-4393-8306-91d35b8bfa1f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWRlZmE5ZS00YzllLTQzOTMtODMwNi05MWQzNWI4YmZhMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzMxLCJpYXQiOjE3OTMzNDg4MzEsImp0aSI6IjM3MDMwNmI3LTUzYWQtNGIzNy1hNzRmLWRmZDlkMDJlNTI5NiIsInNpZCI6IjYwMDljZGQwLWYyNjEtNGZjOS1hN2IwLTFmYjU3YmEyYTVlYyJ9.w-Y9iJ4e9mFqK4NoCGVqTkCdCxeXzAlJFYMQmp_0Z_Y",
  "access_expires_at": "2026-10-30T08:42:11.411540932Z",
  "refresh_token": "f3XYtmijNPsZcJ1eeSvc0kJCOuzwZnrU_PiMt9THHug",
  "refresh_expires_at": "2026-11-29T08:27:11.41101863Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/32ffca33-baf9-47c1-9778-61db917939de/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ec6b485a-b7e7-4a97-87d1-dc69e22feb6d"
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
  "session_id": "153f3c88-fdff-4744-ac92-1d37bc557ed4",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MzIsImlhdCI6MTc5MzM0ODgzMiwianRpIjoiODVjMDk3NTAtZDE4Mi00ZTBiLWE3MWItMzk4NzE3NjJjNTU5Iiwic2lkIjoiMTUzZjNjODgtZmRmZi00NzQ0LWFjOTItMWQzN2JjNTU3ZWQ0In0.7_hP_XXubQx1bAglFncNBg-OOvDZ5W-rFxOoDTXkS_M",
  "access_expires_at": "2026-10-30T08:42:12.282742868Z",
  "refresh_token": "noyTZKbC-22wAEQYILJefjjqFrtIEdz7ZmTUaYWnR2c",
  "refresh_expires_at": "2026-10-30T20:27:12.282326413Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8132312b-b899-4cbb-b614-e75fd0add5bc",
  "session_id": "b4d73d1d-783b-486b-8067-f96a34823a3d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8132312b-b899-4cbb-b614-e75fd0add5bc/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "32ffca33-baf9-47c1-9778-61db917939de",
      "state": "READY",
      "created_at": "2026-10-30T08:27:06.615535Z",
      "ready_at": "2026-10-30T08:27:09.625093Z",
      "expires_at": "2026-11-06T08:27:09.625093Z",
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
  "device_ref": "sandbox-7686"
}
```

```json
{
  "challenge_id": "a1bd9471-01fe-4871-a363-ca0406799876",
  "expires_at": "2026-10-30T08:32:13.13751295Z",
  "resend_available_at": "2026-10-30T08:27:14.13751295Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "054231",
  "sent_at": "2026-10-30T08:27:13.140426493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1bd9471-01fe-4871-a363-ca0406799876",
  "code": "054231",
  "device_ref": "sandbox-7686"
}
```

```json
{
  "session_id": "e736a386-48c0-40a6-a544-25b801161d8b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTczMywiaWF0IjoxNzkzMzQ4ODMzLCJqdGkiOiIzZDkxYjg3NS1iNWZjLTQzZjktODU2MC0wYWExYjk5ZjQzYmIiLCJzaWQiOiJlNzM2YTM4Ni00OGMwLTQwYTYtYTU0NC0yNWI4MDExNjFkOGIifQ.igsavcBh9V9b8aI5rFWb3_BBrzySwbFR_R28iVfiLu8",
  "access_expires_at": "2026-10-30T08:42:13.479239182Z",
  "refresh_token": "PSjPrrA1KQm67dVUkjcEVkm-AH4NRkustLU5X1UvjfA",
  "refresh_expires_at": "2026-11-29T08:27:13.47873099Z",
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
  "device_ref": "sandbox-28705"
}
```

```json
{
  "challenge_id": "a5a83b3a-3799-4ce4-b3b9-57c46bce11d0",
  "expires_at": "2026-10-30T08:32:14.315437104Z",
  "resend_available_at": "2026-10-30T08:27:15.315437104Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "251152",
  "sent_at": "2026-10-30T08:27:14.318045987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5a83b3a-3799-4ce4-b3b9-57c46bce11d0",
  "code": "251152",
  "device_ref": "sandbox-28705"
}
```

```json
{
  "session_id": "fa59047b-311a-46c5-b13e-94e027b245bc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTczNCwiaWF0IjoxNzkzMzQ4ODM0LCJqdGkiOiI5ZDlhMDk1MC1lNGI5LTQxYmUtOWU2My0xMDU2ZGY1MjFmMTciLCJzaWQiOiJmYTU5MDQ3Yi0zMTFhLTQ2YzUtYjEzZS05NGUwMjdiMjQ1YmMifQ.05szI2VySNCGu5ds4-MgtOwqX6d5LJ3dlF5pjV38ijY",
  "access_expires_at": "2026-10-30T08:42:14.622374419Z",
  "refresh_token": "aO1DTSd5-CMRPkBErSLZ3Y8ISqhFg4DxQTSni9_kXvQ",
  "refresh_expires_at": "2026-11-29T08:27:14.621853965Z",
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
  "command_id": "a4670204-453e-4a53-8d68-87dbbc9a4290",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:15Z",
    "sequence": 1793348835212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d2204695-1dfd-4775-94da-3bb9351ce356",
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
  "last_heartbeat_at": "2026-10-30T08:27:15.233593Z",
  "last_location_at": "2026-10-30T08:27:15.233593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32280"
}
```

```json
{
  "challenge_id": "01881bd4-c64c-46ff-9202-41174deccc2e",
  "expires_at": "2026-10-30T08:32:15.506133828Z",
  "resend_available_at": "2026-10-30T08:27:16.506133828Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "061952",
  "sent_at": "2026-10-30T08:27:15.508647985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01881bd4-c64c-46ff-9202-41174deccc2e",
  "code": "061952",
  "device_ref": "sandbox-32280"
}
```

```json
{
  "session_id": "3ed3ba00-c877-4b4c-9081-551753138ce6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTczNSwiaWF0IjoxNzkzMzQ4ODM1LCJqdGkiOiI4ZjljYzg5Ni02YjNjLTQ0N2MtYTY4NS02YmIxMmYyYmIyN2EiLCJzaWQiOiIzZWQzYmEwMC1jODc3LTRiNGMtOTA4MS01NTE3NTMxMzhjZTYifQ.9phIMGrhumUlSxbqhLSacpDOGpFQVwIy7tE-_TIy-FU",
  "access_expires_at": "2026-10-30T08:42:15.820594847Z",
  "refresh_token": "Tcq1TpBBNJajU1sPFtnBGZ_2q5CFKCmS0RatyBlD6_A",
  "refresh_expires_at": "2026-11-29T08:27:15.820059035Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fc5f0f74-451f-4290-9c91-528b95f20df1",
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
  "last_heartbeat_at": "2026-10-30T08:25:43.724085Z",
  "last_location_at": "2026-10-30T08:25:43.724085Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fc5f0f74-451f-4290-9c91-528b95f20df1/handover` → **200**

```json
{
  "command_id": "4d669e08-31ef-47f5-96fb-df0083989cbf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fc5f0f74-451f-4290-9c91-528b95f20df1",
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
  "last_heartbeat_at": "2026-10-30T08:25:43.724085Z",
  "last_location_at": "2026-10-30T08:25:43.724085Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fc5f0f74-451f-4290-9c91-528b95f20df1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:16Z",
    "sequence": 1793348836694
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fc5f0f74-451f-4290-9c91-528b95f20df1",
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
  "last_heartbeat_at": "2026-10-30T08:27:16.714553Z",
  "last_location_at": "2026-10-30T08:27:16.714553Z",
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
  "session_id": "4de8c741-f0f5-4a48-90bf-9c02bc6fe5c2",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MzcsImlhdCI6MTc5MzM0ODgzNywianRpIjoiMTU0ZTQ0ZGQtZjVmYy00ZDZmLWE0ZGEtN2JhMWMzOTdjODBjIiwic2lkIjoiNGRlOGM3NDEtZjBmNS00YTQ4LTkwYmYtOWMwMmJjNmZlNWMyIn0.onX6tfXiiojrihjPgw_kg-YB04cJKsydnm0N7kLNhfA",
  "access_expires_at": "2026-10-30T08:42:17.271158524Z",
  "refresh_token": "bE6ypjyIZlu7DjTk-ohmCth2bnLy_ZxnoBSVhx52DVE",
  "refresh_expires_at": "2026-10-30T20:27:17.270595758Z",
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
  "session_id": "fe19e55b-ad8b-4941-898e-d20e1e7c2118",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3MzcsImlhdCI6MTc5MzM0ODgzNywianRpIjoiNzk3OTY5MDgtMzczNy00MzU2LWI4MDEtZmQ0YThhYzY1ZjhhIiwic2lkIjoiZmUxOWU1NWItYWQ4Yi00OTQxLTg5OGUtZDIwZTFlN2MyMTE4In0.wGtGwcx0GpqIYf3E_9cuZk324peyMmtDQ_7YeK2Wgks",
  "access_expires_at": "2026-10-30T08:42:17.862642063Z",
  "refresh_token": "JVLM_eW7yYx_L3TIJvxHw7hlU7WMNLhu1J1g9IsyvvA",
  "refresh_expires_at": "2026-10-30T20:27:17.862187947Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684134410",
  "device_ref": "sandbox-82"
}
```

```json
{
  "challenge_id": "36a43b09-500a-4b4e-ba4e-799a80b04925",
  "expires_at": "2026-10-30T08:32:18.103581074Z",
  "resend_available_at": "2026-10-30T08:27:19.103581074Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684134410` → **200**

```json
{
  "phone": "+380684134410",
  "audience": "CLIENT",
  "code": "574890",
  "sent_at": "2026-10-30T08:27:18.106221255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36a43b09-500a-4b4e-ba4e-799a80b04925",
  "code": "574890",
  "device_ref": "sandbox-82"
}
```

```json
{
  "session_id": "88a8b702-de67-44e1-9980-48beaf62a411",
  "subject": {
    "type": "CLIENT",
    "id": "22dbd651-0027-4789-a4cb-dfcd1b5c144e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmRiZDY1MS0wMDI3LTQ3ODktYTRjYi1kZmNkMWI1YzE0NGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzM4LCJpYXQiOjE3OTMzNDg4MzgsImp0aSI6IjZhNTE4YWNkLTMzN2EtNGIxYS1iYWRlLWExMGJmYjFkM2ZkNCIsInNpZCI6Ijg4YThiNzAyLWRlNjctNDRlMS05OTgwLTQ4YmVhZjYyYTQxMSJ9.GSgke5gvadlQyV0JyhyCGN2oU93frqYhs_xJ_pm7yIw",
  "access_expires_at": "2026-10-30T08:42:18.395982135Z",
  "refresh_token": "9KAptfOnWkuLe8kuC5OHtO4_RgxeqWS1vi6EO1GzCIU",
  "refresh_expires_at": "2026-11-29T08:27:18.39547464Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ccdfa7d-4e58-4dea-bb0e-d4d85eed7451",
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
  "id": "c8b47f96-6e51-4a25-8edc-6cb339ae89fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:32:18.700770Z",
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
  "command_id": "72afbca2-7b0b-476a-923f-ae764d8c5905",
  "quote_id": "c8b47f96-6e51-4a25-8edc-6cb339ae89fe",
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
  "id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "22dbd651-0027-4789-a4cb-dfcd1b5c144e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:27:18.98506Z",
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
    "id": "a8ce20c2-3d75-4c23-aee6-82f3f9d22035",
    "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
    "expires_at": "2026-10-30T08:27:33.98954Z",
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

`POST /api/driver/v1/offers/a8ce20c2-3d75-4c23-aee6-82f3f9d22035/reject` → **204**

```json
{
  "command_id": "ae11cc03-f68f-4347-9de4-40eadcf6a4cc"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "16b3b727-acf7-4f3c-911a-5308f012228b",
    "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
    "expires_at": "2026-10-30T08:27:34.575218Z",
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

`POST /api/driver/v1/offers/16b3b727-acf7-4f3c-911a-5308f012228b/accept` → **200**

```json
{
  "command_id": "717cd4fa-10f0-48c3-93a7-b934d1ac1976"
}
```

```json
{
  "id": "1099498f-697c-4a18-a3aa-4a210515e3f9",
  "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5a043bf5-28fc-41c8-9f51-98fd7aa46afc",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/47f08b2c-a54f-46d8-ae15-6265f96b086c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:27:18.985871Z",
      "actor": {
        "type": "CLIENT",
        "id": "22dbd651-0027-4789-a4cb-dfcd1b5c144e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
        "quote_id": "c8b47f96-6e51-4a25-8edc-6cb339ae89fe",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f7e18b76-1107-49a1-97c3-f04a4c1f249b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:27:18.98847Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
        "attempt_id": "0d6510e0-774e-4168-8244-6cb56ca6c59f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f7e18b76-1107-49a1-97c3-f04a4c1f249b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:27:18.999688Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a8ce20c2-3d75-4c23-aee6-82f3f9d22035",
        "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f7e18b76-1107-49a1-97c3-f04a4c1f249b"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:27:19.573597Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a8ce20c2-3d75-4c23-aee6-82f3f9d22035",
        "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c"
      },
      "correlation_id": "063a7906-e66b-4996-a55d-af23a8ba87ba"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 47f08b2c-a54f-46d8-ae15-6265f96b086c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/47f08b2c-a54f-46d8-ae15-6265f96b086c` → **200**

```json
{
  "id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "22dbd651-0027-4789-a4cb-dfcd1b5c144e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1099498f-697c-4a18-a3aa-4a210515e3f9",
    "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5a043bf5-28fc-41c8-9f51-98fd7aa46afc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:27:18.98506Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/47f08b2c-a54f-46d8-ae15-6265f96b086c/cancel` → **200**

```json
{
  "command_id": "5123e47a-f286-44e5-952f-f545e6a7df2a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "22dbd651-0027-4789-a4cb-dfcd1b5c144e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1099498f-697c-4a18-a3aa-4a210515e3f9",
    "order_id": "47f08b2c-a54f-46d8-ae15-6265f96b086c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5a043bf5-28fc-41c8-9f51-98fd7aa46afc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:27:18.98506Z",
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
  "session_id": "d2204695-1dfd-4775-94da-3bb9351ce356",
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
  "last_heartbeat_at": "2026-10-30T08:27:15.233593Z",
  "last_location_at": "2026-10-30T08:27:15.233593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d2204695-1dfd-4775-94da-3bb9351ce356/close` → **200**

```json
{
  "command_id": "f2d3daed-3cc2-4b0c-b8a6-df1c26b04b2e",
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
  "session_id": "fc5f0f74-451f-4290-9c91-528b95f20df1",
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
  "last_heartbeat_at": "2026-10-30T08:27:16.714553Z",
  "last_location_at": "2026-10-30T08:27:16.714553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fc5f0f74-451f-4290-9c91-528b95f20df1/close` → **200**

```json
{
  "command_id": "c77ea84e-0d4a-49b8-9712-49fb24c29a93",
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
  "session_id": "3659a29c-8e6d-4a6d-856c-35d5032d633e",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NDIsImlhdCI6MTc5MzM0ODg0MiwianRpIjoiOTlmZDY4MjgtYjRjZS00MjNiLTgwMDgtODU1NTBkOTFkOTJiIiwic2lkIjoiMzY1OWEyOWMtOGU2ZC00YTZkLTg1NmMtMzVkNTAzMmQ2MzNlIn0.AVGEOOhszaB1ztyTshSZN5x2KZpjbhkqIbnA01S9QCY",
  "access_expires_at": "2026-10-30T08:42:22.564452821Z",
  "refresh_token": "jlZzF_1e45Gb3Mn-9sH3qm9JwC1gai7sLcrinvnzMm0",
  "refresh_expires_at": "2026-10-30T20:27:22.563972251Z",
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
  "command_id": "d1ecccf6-a0d9-4cda-b82c-3cecdb94a4eb",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:27:23.139499Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "e5046625-2751-4557-9410-cbae5cd7f9e9",
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
  "correlation_id": "7cb41c37-8b1b-4b83-8c91-723c08026645"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "953b5511-f7d8-4f5e-9fe8-615bd3f53d8c",
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
  "correlation_id": "25651d38-fd12-46f5-b7bd-0927c3eadad9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633614352",
  "device_ref": "sandbox-18610"
}
```

```json
{
  "challenge_id": "f8d8d6b9-4eeb-4ed7-a4f6-6c8b47d251a9",
  "expires_at": "2026-10-30T08:32:23.92973584Z",
  "resend_available_at": "2026-10-30T08:27:24.92973584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633614352` → **200**

```json
{
  "phone": "+380633614352",
  "audience": "CLIENT",
  "code": "385630",
  "sent_at": "2026-10-30T08:27:23.932439903Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8d8d6b9-4eeb-4ed7-a4f6-6c8b47d251a9",
  "code": "385630",
  "device_ref": "sandbox-18610"
}
```

```json
{
  "session_id": "4a9f02b4-d652-4f92-8e2b-2e2b1a721b89",
  "subject": {
    "type": "CLIENT",
    "id": "ed7193b0-b6b4-4323-a90c-4ed333291c97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDcxOTNiMC1iNmI0LTQzMjMtYTkwYy00ZWQzMzMyOTFjOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzQ0LCJpYXQiOjE3OTMzNDg4NDQsImp0aSI6IjQyYTIyNzE4LWNhZjAtNDYwZC1hMTNhLTJkNWYxMjVkNjk5OSIsInNpZCI6IjRhOWYwMmI0LWQ2NTItNGY5Mi04ZTJiLTJlMmIxYTcyMWI4OSJ9.4VlBtB5V1LbhreE9EqkHKrLSQ-ZWXTP0vzZRN4vs05A",
  "access_expires_at": "2026-10-30T08:42:24.215663678Z",
  "refresh_token": "87MoKrfunYQ9irQJn_2RMgCSrvpoWXIN2QEzxRFPtAQ",
  "refresh_expires_at": "2026-11-29T08:27:24.215233692Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "738a661a-9407-4f9a-a7ef-b58b91a18133",
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
  "id": "a322fbf1-767b-42e7-b5c6-2c7ec8893b90",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:32:24.491226Z",
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
  "command_id": "d0b478eb-3311-4bd4-8a62-d80a24f5171b",
  "quote_id": "a322fbf1-767b-42e7-b5c6-2c7ec8893b90",
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
  "correlation_id": "68449359-57fc-4bbc-9cb1-c614f6f148dc"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5e3c85d5-4f4f-48c0-a595-711bd12cb4d7",
  "quote_id": "a322fbf1-767b-42e7-b5c6-2c7ec8893b90",
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
  "id": "4f00f6ab-397e-49b1-be88-234a7c97f968",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed7193b0-b6b4-4323-a90c-4ed333291c97",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:27:25.047964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4f00f6ab-397e-49b1-be88-234a7c97f968/cancel` → **200**

```json
{
  "command_id": "4c06ea7e-1027-4928-b910-4273af7a439f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4f00f6ab-397e-49b1-be88-234a7c97f968",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ed7193b0-b6b4-4323-a90c-4ed333291c97",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:27:25.047964Z",
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
  "command_id": "7d5df4c3-edaa-485c-adc1-9b31d7bc2570",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:27:25.658326Z"
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
      "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:27:25.658326Z"
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
  "device_ref": "sandbox-18558"
}
```

```json
{
  "challenge_id": "e9644893-066e-45b7-bafe-f021ffafa07c",
  "expires_at": "2026-10-30T08:32:26.514657701Z",
  "resend_available_at": "2026-10-30T08:27:27.514657701Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "150254",
  "sent_at": "2026-10-30T08:27:26.517510081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9644893-066e-45b7-bafe-f021ffafa07c",
  "code": "150254",
  "device_ref": "sandbox-18558"
}
```

```json
{
  "session_id": "f3115f6c-c72b-404b-b9bd-ce0a04d68b0b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTc0NiwiaWF0IjoxNzkzMzQ4ODQ2LCJqdGkiOiI5ZWQyYmU2OS1kYzQ2LTQ1ZDctOWI5MC1iNTk2YzhmZmJhNDAiLCJzaWQiOiJmMzExNWY2Yy1jNzJiLTQwNGItYjliZC1jZTBhMDRkNjhiMGIifQ.fJFrcGsUGjb_qcGzrvLtUUbNoW_lejyXesN3xsshhYY",
  "access_expires_at": "2026-10-30T08:42:26.825237724Z",
  "refresh_token": "Dl8yZZfDQI3QZ7bcrEWVBPRuXIoUccBJSB8FSufrUx0",
  "refresh_expires_at": "2026-11-29T08:27:26.824730554Z",
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
  "command_id": "08183a49-b8d1-410f-8437-cec3a14df8a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:27Z",
    "sequence": 1793348847428
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:27.448927Z",
  "last_location_at": "2026-10-30T08:27:27.448927Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678661935",
  "device_ref": "sandbox-5600"
}
```

```json
{
  "challenge_id": "af8a2217-92f8-437f-9851-7e325faa0fdb",
  "expires_at": "2026-10-30T08:32:27.720551023Z",
  "resend_available_at": "2026-10-30T08:27:28.720551023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678661935` → **200**

```json
{
  "phone": "+380678661935",
  "audience": "CLIENT",
  "code": "989385",
  "sent_at": "2026-10-30T08:27:27.723476407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af8a2217-92f8-437f-9851-7e325faa0fdb",
  "code": "989385",
  "device_ref": "sandbox-5600"
}
```

```json
{
  "session_id": "8ee5f057-9245-4f3e-909f-51919f4f3832",
  "subject": {
    "type": "CLIENT",
    "id": "cde6b26a-b32e-4002-b0e9-ee933de64e8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGU2YjI2YS1iMzJlLTQwMDItYjBlOS1lZTkzM2RlNjRlOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzQ4LCJpYXQiOjE3OTMzNDg4NDgsImp0aSI6IjQxZTczMDM1LTQ3ZGItNDJjMC05NzcyLWY0YmRmNTE1NDBiZCIsInNpZCI6IjhlZTVmMDU3LTkyNDUtNGYzZS05MDlmLTUxOTE5ZjRmMzgzMiJ9.Sr4Eh9eHt0bUgPqmaJWYaTr9Nhn2zkzujZFOf2fIycc",
  "access_expires_at": "2026-10-30T08:42:28.020335308Z",
  "refresh_token": "x9tIrSTv40pUF-Ucx-_oa6F_Y0KzRR0AxS6OYLHPbus",
  "refresh_expires_at": "2026-11-29T08:27:28.019816632Z",
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
  "command_id": "fa6aa29f-eb11-4974-a9ff-c1270e513018",
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
  "id": "4e71a950-ab4f-46a6-9915-900d9a65fd5c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:32:28.545922Z",
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
  "command_id": "263f7a1e-41ac-46bb-84be-16fc001cde45",
  "platform": "ANDROID",
  "token": "sandbox-driver-688f22d8-23ad-447b-9003-013303c54ddc"
}
```

```json
{
  "id": "e07794c5-97bf-4392-ac71-4099b4d32f97",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:27:28.834596Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "3a91e98e-7b7b-4cd6-a3a7-531ca95f8235",
  "platform": "ANDROID",
  "token": "sandbox-rider-12e86f2e-009b-4875-ad0c-19e2ab50f122"
}
```

```json
{
  "id": "9b55d48f-71ab-4ba7-a9ec-01bd51a4c708",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:27:29.097492Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bb103cc1-2b9c-4384-90f5-aac743ee94c5",
  "quote_id": "4e71a950-ab4f-46a6-9915-900d9a65fd5c",
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
  "id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cde6b26a-b32e-4002-b0e9-ee933de64e8a",
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
  "created_at": "2026-10-30T08:27:29.37406Z",
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
    "id": "0be2036d-57aa-45d5-82d7-bc6b64648554",
    "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
    "expires_at": "2026-10-30T08:27:44.376969Z",
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

`POST /api/driver/v1/offers/0be2036d-57aa-45d5-82d7-bc6b64648554/accept` → **200**

```json
{
  "command_id": "9411e23a-40a6-4418-b424-efb90eea5d36"
}
```

```json
{
  "id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:27:29.351Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:27:29.351Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:27:31.238757026Z",
    "token_suffix": "c54ddc",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
      "order_version": "2",
      "event_id": "ab3bf5c1-5627-46ad-b286-64d8db52f2ff",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678661935&after=2026-10-30T08:27:29.351Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:27:31.241730612Z",
    "token_suffix": "50f122",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
      "order_version": "3",
      "event_id": "b367f402-e31c-4bac-ac64-ea7c88b22dd7",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/0cc3573d-5713-4bba-961e-86109ae9d223/messages` → **201**

```json
{
  "command_id": "cd5181a9-09a1-43eb-8c83-79668aa69efc",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "315de8c6-d8ad-4792-a7fa-4cab18c9aaef",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:27:31.33955159Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "assignment_id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
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

`POST /api/driver/v1/trips/350b9c86-8a1c-4636-8e99-99b0da06cccc/messages` → **201**

```json
{
  "command_id": "c8f985f2-264b-4f14-bb3d-36ec64f7983a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8b6db119-a081-4b7f-836e-c31a250eaf87",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:27:31.885763374Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/0cc3573d-5713-4bba-961e-86109ae9d223/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/350b9c86-8a1c-4636-8e99-99b0da06cccc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678661935"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:32Z",
    "sequence": 1793348852721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:32.7426Z",
  "last_location_at": "2026-10-30T08:27:32.7426Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "assignment_id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
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

`POST /api/driver/v1/trips/350b9c86-8a1c-4636-8e99-99b0da06cccc/arrive` → **200**

```json
{
  "command_id": "6456f21f-5a29-4b88-bb8d-cc1747f3aa47",
  "expected_version": 0
}
```

```json
{
  "id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "assignment_id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
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
  "arrived_at": "2026-10-30T08:27:33.31441Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/350b9c86-8a1c-4636-8e99-99b0da06cccc/start` → **200**

```json
{
  "command_id": "3b837ce7-b0c2-4d89-8198-d24e480f200c",
  "expected_version": 1
}
```

```json
{
  "id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "assignment_id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
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
  "arrived_at": "2026-10-30T08:27:33.31441Z",
  "started_at": "2026-10-30T08:27:33.591124Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:33Z",
    "sequence": 1793348853887
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:33.915779Z",
  "last_location_at": "2026-10-30T08:27:33.915779Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/350b9c86-8a1c-4636-8e99-99b0da06cccc/complete` → **200**

```json
{
  "command_id": "dfdbba2c-e553-42a6-9ad7-8ba92ab0620d",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:27:34Z",
  "cash_received": true
}
```

```json
{
  "id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "assignment_id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
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
  "arrived_at": "2026-10-30T08:27:33.31441Z",
  "started_at": "2026-10-30T08:27:33.591124Z",
  "completed_at": "2026-10-30T08:27:34.231079Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/0cc3573d-5713-4bba-961e-86109ae9d223` → **200**

```json
{
  "id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cde6b26a-b32e-4002-b0e9-ee933de64e8a",
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
    "id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c",
    "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:27:29.37406Z",
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
    "id": "0cc3573d-5713-4bba-961e-86109ae9d223",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:27:29.37406Z",
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
    "id": "350b9c86-8a1c-4636-8e99-99b0da06cccc",
    "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
    "order_short_number": 13,
    "created_at": "2026-10-30T08:27:29.952466Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2949a714-c447-4138-9c13-7bffcc2dba7e",
    "order_id": "cd140fbc-5e3f-4fce-bb82-7d5fb6467a0d",
    "order_short_number": 8,
    "created_at": "2026-10-30T08:26:20.931266Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "aa48fa6b-13b8-49c8-9939-bd58e9afd3dd",
    "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
    "order_short_number": 3,
    "created_at": "2026-10-30T08:25:33.353233Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "aee23253-b153-4258-b753-870a625f77b9",
    "order_id": "ddca2c07-592b-4af8-9bcc-7089a5546e46",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:25:14.054227Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "947516c0-8ad4-469b-8c43-2ab311282d1f",
    "order_id": "de671c24-e31c-4f97-89e6-7871344881c8",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:25:04.129013Z",
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

`GET /api/rider/v1/orders/0cc3573d-5713-4bba-961e-86109ae9d223/tip` → **200**

```json
{
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
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
  "available_until": "2026-10-31T08:27:34.231079Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0cc3573d-5713-4bba-961e-86109ae9d223/tip` → **201**

```json
{
  "command_id": "696846b3-19f6-4cec-97e4-4b71ddea8fca",
  "amount_minor": 1100
}
```

```json
{
  "id": "4631368d-a73d-4277-b60f-b1488e3f99f3",
  "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:27:39.222338Z"
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
  "session_id": "8f0fa79b-622e-4a95-aa31-8904d065633a",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NTksImlhdCI6MTc5MzM0ODg1OSwianRpIjoiNzQ4MTRkYjMtNDg1My00MjFhLTg5YjctOGFkNjVjMTk3ZmFmIiwic2lkIjoiOGYwZmE3OWItNjIyZS00YTk1LWFhMzEtODkwNGQwNjU2MzNhIn0.EkdeqKRZIul0mafIebRLivfXpStOqR8Sk0eS2pw2--U",
  "access_expires_at": "2026-10-30T08:42:39.936677398Z",
  "refresh_token": "sLFss9xZM5ioYUcQ_Z6V8F_4dzDLMP5QpaG-CsjClj4",
  "refresh_expires_at": "2026-10-30T20:27:39.936132864Z",
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
          "RIDER": 3,
          "DRIVER": 1,
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
      "APP": 12,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 11,
      "CARD": 2
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
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
  "generated_at": "2026-10-30T08:27:40.20424841Z"
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
  "generated_at": "2026-10-30T08:27:40.495299466Z"
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
  "session_id": "1a7d7a13-ff98-4edd-bb1d-5b77dba61c78",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NjEsImlhdCI6MTc5MzM0ODg2MSwianRpIjoiYzVkZjM4MTAtNTAzMi00NzlhLWFiZTktNzU5NzlmMTJmMTE0Iiwic2lkIjoiMWE3ZDdhMTMtZmY5OC00ZWRkLWJiMWQtNWI3N2RiYTYxYzc4In0.jfETh7fPNHCDLr01u_I3PeOUXsh9nrHo6hdy8n5GbhM",
  "access_expires_at": "2026-10-30T08:42:41.071003327Z",
  "refresh_token": "3ypoQqDcwFmfCFGgwp4CS6I53ceUddGROuVJkg0DUes",
  "refresh_expires_at": "2026-10-30T20:27:41.070397959Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0cc3573d-5713-4bba-961e-86109ae9d223/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:27:29.374493Z",
      "actor": {
        "type": "CLIENT",
        "id": "cde6b26a-b32e-4002-b0e9-ee933de64e8a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
        "quote_id": "4e71a950-ab4f-46a6-9915-900d9a65fd5c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5ab0c171-8500-494a-857f-f09ba94d5402"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:27:29.376242Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
        "attempt_id": "1c9c1cb4-cb78-47c5-92ed-72dfc3dee0be",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5ab0c171-8500-494a-857f-f09ba94d5402"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:27:29.381947Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0be2036d-57aa-45d5-82d7-bc6b64648554",
        "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "5ab0c171-8500-494a-857f-f09ba94d5402"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:27:29.954164Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0be2036d-57aa-45d5-82d7-bc6b64648554",
        "order_id": "0cc3573d-5713-4bba-961e-86109ae9d223",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e75d9b84-f5e8-442d-a014-c910c95c0d7c"
      },
      "correlation_id": "1a9e8437-ca67-4230-b61c-5e1119fa6558"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:27:41.637648207Z",
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
      "last_location_at": "2026-10-30T08:27:33.915779Z",
      "order_id": null
    }
  ]
}
```

Done: order 0cc3573d-5713-4bba-961e-86109ae9d223.

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
  "session_id": "67c9bd59-61e8-43d2-b0f2-c7854cce561a",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NjIsImlhdCI6MTc5MzM0ODg2MiwianRpIjoiMmUwM2RkYjctMjg5NS00MjFjLWE0YmQtZjRjOGFlYWIwNTY1Iiwic2lkIjoiNjdjOWJkNTktNjFlOC00M2QyLWIwZjItYzc4NTRjY2U1NjFhIn0.xcT4HFUOtTIYfoT6xBEYRUtrFF__jcFhK4GJB_OWSeo",
  "access_expires_at": "2026-10-30T08:42:42.234261781Z",
  "refresh_token": "N5GW4KlnoKgz_T9u0JmCQY_icC6iobAn2i4R230_DsM",
  "refresh_expires_at": "2026-10-30T20:27:42.233776445Z",
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
  "command_id": "bf05470b-c05d-4baa-b37e-453367882e75",
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
  "timestamp": "2026-10-30T08:27:43.000+0000",
  "channel": {
    "id": "1730052000.121395203",
    "linkedid": "1730052000.121395203",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678689948"
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
  "timestamp": "2026-10-30T08:27:43.000+0000",
  "channel": {
    "id": "1730052000.121395203",
    "linkedid": "1730052000.121395203",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678689948"
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
  "session_id": "03044465-a50c-4134-b51c-04c4bd6c2a10",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NjMsImlhdCI6MTc5MzM0ODg2MywianRpIjoiYzhjNTlhODktMjA4My00NDE4LTljMzItNWZmNWFjYjAwYWE5Iiwic2lkIjoiMDMwNDQ0NjUtYTUwYy00MTM0LWI1MWMtMDRjNGJkNmMyYTEwIn0.h9eD65k4prFk17qH9BYVuDlso9DebQ8hNzTW123YW_k",
  "access_expires_at": "2026-10-30T08:42:43.43126901Z",
  "refresh_token": "HbXvrB4qciGoItsu-m7Fhn-0TH-33Nb57Zm0I7nOWSQ",
  "refresh_expires_at": "2026-10-30T20:27:43.430690507Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "19a132b4-bd4e-4c70-80a7-452529b8b954",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678689948",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:27:43Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/19a132b4-bd4e-4c70-80a7-452529b8b954/answer` → **200**

```json
{
  "command_id": "9a25bd7d-8c5a-4536-b16d-878ad74e7864"
}
```

```json
{
  "id": "19a132b4-bd4e-4c70-80a7-452529b8b954",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678689948",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "order_ids": [],
  "started_at": "2026-10-30T08:27:43Z",
  "answered_at": "2026-10-30T08:27:43.98021Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.121395203",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7011f573-3d1c-4e59-903d-ae8b4bc9001d",
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
  "id": "77e381ab-0225-4404-82d0-ce7254de6e6e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:32:44.293479Z",
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
  "command_id": "cadb0ff9-2721-4f10-a1c9-b0110e70001a",
  "quote_id": "77e381ab-0225-4404-82d0-ce7254de6e6e",
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
    "phone": "+380678689948"
  },
  "call_id": "19a132b4-bd4e-4c70-80a7-452529b8b954"
}
```

```json
{
  "id": "b29494da-d21b-42d4-9b43-2d719c4003cf",
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
  "created_at": "2026-10-30T08:27:44.579566Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678689948"
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
    "id": "1730052000.121395203",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "19a132b4-bd4e-4c70-80a7-452529b8b954",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678689948",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [
        "b29494da-d21b-42d4-9b43-2d719c4003cf"
      ],
      "started_at": "2026-10-30T08:27:43Z",
      "answered_at": "2026-10-30T08:27:43.98021Z",
      "ended_at": "2026-10-30T08:27:44.886299Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "959b80d3-ec31-4429-8e7e-9ec64b35532a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670663693",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [],
      "started_at": "2026-10-30T08:25:22.087043Z",
      "answered_at": "2026-10-30T08:25:22.428885Z",
      "ended_at": "2026-10-30T08:25:22.755499Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:25:29.597536Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b29494da-d21b-42d4-9b43-2d719c4003cf` → **200**

```json
{
  "id": "b29494da-d21b-42d4-9b43-2d719c4003cf",
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
  "created_at": "2026-10-30T08:27:44.579566Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678689948"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b29494da-d21b-42d4-9b43-2d719c4003cf` → **200**

```json
{
  "id": "b29494da-d21b-42d4-9b43-2d719c4003cf",
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
  "created_at": "2026-10-30T08:27:44.579566Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678689948"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b29494da-d21b-42d4-9b43-2d719c4003cf/cancel` → **200**

```json
{
  "command_id": "8ba24f58-40ab-4098-9525-21e26f6b369d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b29494da-d21b-42d4-9b43-2d719c4003cf",
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
  "created_at": "2026-10-30T08:27:44.579566Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678689948"
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

Done: call 19a132b4-bd4e-4c70-80a7-452529b8b954 with order b29494da-d21b-42d4-9b43-2d719c4003cf.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23930"
}
```

```json
{
  "challenge_id": "cfec5f5f-f7f4-4271-9740-ebd4eb174cf6",
  "expires_at": "2026-10-30T08:32:46.113645132Z",
  "resend_available_at": "2026-10-30T08:27:47.113645132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "558444",
  "sent_at": "2026-10-30T08:27:46.117240793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfec5f5f-f7f4-4271-9740-ebd4eb174cf6",
  "code": "558444",
  "device_ref": "sandbox-23930"
}
```

```json
{
  "session_id": "63510510-799b-4a08-a192-91b553457ab4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTc2NiwiaWF0IjoxNzkzMzQ4ODY2LCJqdGkiOiJhZjNlZWVlOC05MjFmLTQyZjAtODA3OS0xZjUzOGY1YTlmMzAiLCJzaWQiOiI2MzUxMDUxMC03OTliLTRhMDgtYTE5Mi05MWI1NTM0NTdhYjQifQ.Wja7DBzOevp1WFPtTXSwptEcC29jZVloPNQiLk6F95I",
  "access_expires_at": "2026-10-30T08:42:46.440578632Z",
  "refresh_token": "gH48wfl8pWib3sxDiKo5dKaRUud_mVVz6Ncfqm5JvaQ",
  "refresh_expires_at": "2026-11-29T08:27:46.439863637Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:33.915779Z",
  "last_location_at": "2026-10-30T08:27:33.915779Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/handover` → **200**

```json
{
  "command_id": "ede9dedd-dd4d-49bd-b2fe-d028f5fd6576",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:33.915779Z",
  "last_location_at": "2026-10-30T08:27:33.915779Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:47Z",
    "sequence": 1793348867279
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:47.304039Z",
  "last_location_at": "2026-10-30T08:27:47.304039Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669747275",
  "device_ref": "sandbox-23676"
}
```

```json
{
  "challenge_id": "bedc9e5b-cce5-46e3-9c5a-dd5969a1c537",
  "expires_at": "2026-10-30T08:32:47.59208912Z",
  "resend_available_at": "2026-10-30T08:27:48.59208912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669747275` → **200**

```json
{
  "phone": "+380669747275",
  "audience": "CLIENT",
  "code": "439859",
  "sent_at": "2026-10-30T08:27:47.594614797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bedc9e5b-cce5-46e3-9c5a-dd5969a1c537",
  "code": "439859",
  "device_ref": "sandbox-23676"
}
```

```json
{
  "session_id": "30a21476-addc-4d7a-aabf-1efe6c2a661e",
  "subject": {
    "type": "CLIENT",
    "id": "ce77484c-b86a-4f37-8ef6-d7f64ff4086a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTc3NDg0Yy1iODZhLTRmMzctOGVmNi1kN2Y2NGZmNDA4NmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzY3LCJpYXQiOjE3OTMzNDg4NjcsImp0aSI6ImMzMjRhNjZkLTZkMTgtNDhhYi04NTA0LTQ0NDgwYjhlYWY5NiIsInNpZCI6IjMwYTIxNDc2LWFkZGMtNGQ3YS1hYWJmLTFlZmU2YzJhNjYxZSJ9.trgzbCkCypBqx8eAiY5XRoIJe9QPkfFgLfSTjt-C2g4",
  "access_expires_at": "2026-10-30T08:42:47.908375067Z",
  "refresh_token": "muGEHFplBYu4ydz3Mhy37wkCRsl6Z_ZK03W0mndij-U",
  "refresh_expires_at": "2026-11-29T08:27:47.907917312Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a9a18a2-bc5d-46f6-baaa-b7c02651837a",
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
  "id": "4b41a043-f746-48ac-8b23-6423391adb00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:32:48.200640Z",
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
  "command_id": "5652364b-53aa-4ea0-b05e-352854729dc3",
  "quote_id": "4b41a043-f746-48ac-8b23-6423391adb00",
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
  "id": "9d191d81-54dd-484d-91b6-e706017a012c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce77484c-b86a-4f37-8ef6-d7f64ff4086a",
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
  "created_at": "2026-10-30T08:27:48.487895Z",
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
    "id": "d1cfffcd-9d08-44e5-a206-b1e3ba0d309a",
    "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
    "expires_at": "2026-10-30T08:28:03.491194Z",
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

`POST /api/driver/v1/offers/d1cfffcd-9d08-44e5-a206-b1e3ba0d309a/accept` → **200**

```json
{
  "command_id": "3c764084-c0d6-47fc-a13c-b62e9be5161b"
}
```

```json
{
  "id": "cd014731-0912-4842-97c1-007033f4f3cf",
  "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2",
  "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
  "assignment_id": "cd014731-0912-4842-97c1-007033f4f3cf",
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

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:49Z",
    "sequence": 1793348869649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:49.672099Z",
  "last_location_at": "2026-10-30T08:27:49.672099Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2/arrive` → **200**

```json
{
  "command_id": "da400f1a-b369-4486-8f34-03a8750fe95a",
  "expected_version": 0
}
```

```json
{
  "id": "b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2",
  "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
  "assignment_id": "cd014731-0912-4842-97c1-007033f4f3cf",
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
  "arrived_at": "2026-10-30T08:27:49.962678Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2/start` → **200**

```json
{
  "command_id": "caa64497-fdc9-49f3-8199-16210fb24a53",
  "expected_version": 1
}
```

```json
{
  "id": "b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2",
  "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
  "assignment_id": "cd014731-0912-4842-97c1-007033f4f3cf",
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
  "arrived_at": "2026-10-30T08:27:49.962678Z",
  "started_at": "2026-10-30T08:27:50.26426Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:50Z",
    "sequence": 1793348870557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:50.577428Z",
  "last_location_at": "2026-10-30T08:27:50.577428Z",
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
  "device_ref": "sandbox-17666"
}
```

```json
{
  "challenge_id": "59382c65-43ea-40ca-b470-4ae02601e91d",
  "expires_at": "2026-10-30T08:32:50.85078603Z",
  "resend_available_at": "2026-10-30T08:27:51.85078603Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "290432",
  "sent_at": "2026-10-30T08:27:50.853261181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59382c65-43ea-40ca-b470-4ae02601e91d",
  "code": "290432",
  "device_ref": "sandbox-17666"
}
```

```json
{
  "session_id": "c1d4f669-f967-4ea5-9b1f-edd18993889e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTc3MSwiaWF0IjoxNzkzMzQ4ODcxLCJqdGkiOiIxZWZhYWZlMy1jNjE4LTQyYTUtYTNiZS04ZWQyMDEyZTMwMDMiLCJzaWQiOiJjMWQ0ZjY2OS1mOTY3LTRlYTUtOWIxZi1lZGQxODk5Mzg4OWUifQ.0RShCPKKM_jFkZvg_Cv8tZHS79hnS3QaX4FuJum-2Wc",
  "access_expires_at": "2026-10-30T08:42:51.13447583Z",
  "refresh_token": "2lu1a3h0ZpKWQOFF97KJSE7O-xB0mc3PD-8A3hg9uIM",
  "refresh_expires_at": "2026-11-29T08:27:51.134089289Z",
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
  "command_id": "6291fe97-39ba-49d3-8005-4fbc166aa62e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:51Z",
    "sequence": 1793348871668
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f36bfbb1-0ef5-4084-9810-07949e4f7e7a",
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
  "last_heartbeat_at": "2026-10-30T08:27:51.68626Z",
  "last_location_at": "2026-10-30T08:27:51.68626Z",
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
  "session_id": "b694bc41-60ff-4385-823f-049599475860",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NzIsImlhdCI6MTc5MzM0ODg3MiwianRpIjoiZDgwMTY3NWMtYWZlZS00MmM1LWI5NTItMjJhZmQ0NDI5MmI0Iiwic2lkIjoiYjY5NGJjNDEtNjBmZi00Mzg1LTgyM2YtMDQ5NTk5NDc1ODYwIn0.kIWEXe6Grmcwy-CFRE11GfH_XF1Tg0jNnGwKwBb0B_o",
  "access_expires_at": "2026-10-30T08:42:52.253710637Z",
  "refresh_token": "u3mvR4MfwaijAbx4CYgNxmHy672aSHKyLLZYaLzU3Ys",
  "refresh_expires_at": "2026-10-30T20:27:52.253134335Z",
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
  "session_id": "5e21afa0-871c-4c82-be06-abb32e4bd287",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3NzIsImlhdCI6MTc5MzM0ODg3MiwianRpIjoiZjYwMzQyZDUtY2NhMS00NTRmLTgyMTQtMTMyM2FiNTNkMWU4Iiwic2lkIjoiNWUyMWFmYTAtODcxYy00YzgyLWJlMDYtYWJiMzJlNGJkMjg3In0.dXU3yqIunWYbZk8LHF1ouztAHq4iMIIkht5vD_1pk7o",
  "access_expires_at": "2026-10-30T08:42:52.813747179Z",
  "refresh_token": "L5fdMTxRyBuCo5GUan6T08jKuWYLe3VfZ4S61Z-Hres",
  "refresh_expires_at": "2026-10-30T20:27:52.813252318Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9d191d81-54dd-484d-91b6-e706017a012c` → **200**

```json
{
  "id": "9d191d81-54dd-484d-91b6-e706017a012c",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ce77484c-b86a-4f37-8ef6-d7f64ff4086a",
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
    "id": "cd014731-0912-4842-97c1-007033f4f3cf",
    "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:27:48.487895Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9d191d81-54dd-484d-91b6-e706017a012c/interrupt` → **200**

```json
{
  "command_id": "9662f011-aeb9-46b9-a29b-82dbe153de56",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "9d191d81-54dd-484d-91b6-e706017a012c",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "ce77484c-b86a-4f37-8ef6-d7f64ff4086a",
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
      "id": "cd014731-0912-4842-97c1-007033f4f3cf",
      "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b45dd0c5-ccd2-461a-aaf8-3902c53fd4c2",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:27:48.487895Z",
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
    "id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "ce77484c-b86a-4f37-8ef6-d7f64ff4086a",
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
    "id": "c38f6357-355c-4db9-94c1-0d29b15c5847",
    "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
    "expires_at": "2026-10-30T08:28:08.412462Z",
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

`POST /api/driver/v1/offers/c38f6357-355c-4db9-94c1-0d29b15c5847/accept` → **200**

```json
{
  "command_id": "3e48940e-78bd-463c-8092-2f23c023b65c"
}
```

```json
{
  "id": "555e8abd-4300-44e3-8105-0decb72cc5c1",
  "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f1d3806c-029f-496d-9f08-0cf0ec93c794",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f1d3806c-029f-496d-9f08-0cf0ec93c794",
  "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
  "assignment_id": "555e8abd-4300-44e3-8105-0decb72cc5c1",
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
  "session_id": "f36bfbb1-0ef5-4084-9810-07949e4f7e7a",
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
  "last_heartbeat_at": "2026-10-30T08:27:51.68626Z",
  "last_location_at": "2026-10-30T08:27:51.68626Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f36bfbb1-0ef5-4084-9810-07949e4f7e7a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:27:54Z",
    "sequence": 1793348874806
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f36bfbb1-0ef5-4084-9810-07949e4f7e7a",
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
  "last_heartbeat_at": "2026-10-30T08:27:54.827321Z",
  "last_location_at": "2026-10-30T08:27:54.827321Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f1d3806c-029f-496d-9f08-0cf0ec93c794/arrive` → **200**

```json
{
  "command_id": "eb99d0bc-62a0-41e2-b143-22d3009de393",
  "expected_version": 0
}
```

```json
{
  "id": "f1d3806c-029f-496d-9f08-0cf0ec93c794",
  "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
  "assignment_id": "555e8abd-4300-44e3-8105-0decb72cc5c1",
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
  "arrived_at": "2026-10-30T08:27:55.128882Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f1d3806c-029f-496d-9f08-0cf0ec93c794/start` → **200**

```json
{
  "command_id": "53ccdf72-96cb-46bf-ad27-f8b59cfc7482",
  "expected_version": 1
}
```

```json
{
  "id": "f1d3806c-029f-496d-9f08-0cf0ec93c794",
  "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
  "assignment_id": "555e8abd-4300-44e3-8105-0decb72cc5c1",
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
  "arrived_at": "2026-10-30T08:27:55.128882Z",
  "started_at": "2026-10-30T08:27:55.446981Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f1d3806c-029f-496d-9f08-0cf0ec93c794/complete` → **200**

```json
{
  "command_id": "6df071ad-0a9c-4ea9-92a1-a33327378502",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:27:55Z"
}
```

```json
{
  "id": "f1d3806c-029f-496d-9f08-0cf0ec93c794",
  "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
  "assignment_id": "555e8abd-4300-44e3-8105-0decb72cc5c1",
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
  "arrived_at": "2026-10-30T08:27:55.128882Z",
  "started_at": "2026-10-30T08:27:55.446981Z",
  "completed_at": "2026-10-30T08:27:55.770891Z",
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
    "id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:27:53.402275Z",
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
    "id": "9d191d81-54dd-484d-91b6-e706017a012c",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:27:48.487895Z",
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

`GET /api/operator/v1/orders/9d191d81-54dd-484d-91b6-e706017a012c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:27:48.488485Z",
      "actor": {
        "type": "CLIENT",
        "id": "ce77484c-b86a-4f37-8ef6-d7f64ff4086a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
        "quote_id": "4b41a043-f746-48ac-8b23-6423391adb00",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "9191fc6a-2c88-48e6-ab7b-e6b86c5c52c4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:27:48.490393Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
        "attempt_id": "9528adea-0e2b-40c1-af3b-b4c69b12159c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9191fc6a-2c88-48e6-ab7b-e6b86c5c52c4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:27:48.497153Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d1cfffcd-9d08-44e5-a206-b1e3ba0d309a",
        "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "9191fc6a-2c88-48e6-ab7b-e6b86c5c52c4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:27:49.093375Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d1cfffcd-9d08-44e5-a206-b1e3ba0d309a",
        "order_id": "9d191d81-54dd-484d-91b6-e706017a012c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "cd014731-0912-4842-97c1-007033f4f3cf"
      },
      "correlation_id": "95aabe0e-fb25-437b-82ed-953950a4a070"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a/tip` → **200**

```json
{
  "order_id": "b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a",
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
  "available_until": "2026-10-31T08:27:55.770891Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a/tip` → **409**

```json
{
  "command_id": "4db64c83-47bc-4366-838f-68272334a5dd",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6c02be9a-a347-4b29-a41f-58f74c87bf2b"
}
```

Done: interrupted 9d191d81-54dd-484d-91b6-e706017a012c, follow-up b0b6e7b0-1b0d-48a6-a6a0-a8ac0487746a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2b4d80c3-2e18-49c9-9e13-3a563e263aac",
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
  "last_heartbeat_at": "2026-10-30T08:27:50.577428Z",
  "last_location_at": "2026-10-30T08:27:50.577428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2b4d80c3-2e18-49c9-9e13-3a563e263aac/close` → **200**

```json
{
  "command_id": "600610b6-4a05-4617-915c-52d945683da9",
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
  "session_id": "f36bfbb1-0ef5-4084-9810-07949e4f7e7a",
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
  "last_heartbeat_at": "2026-10-30T08:27:54.827321Z",
  "last_location_at": "2026-10-30T08:27:54.827321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f36bfbb1-0ef5-4084-9810-07949e4f7e7a/close` → **200**

```json
{
  "command_id": "8bf8c133-322b-4499-a03f-e33dcef095f2",
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
  "session_id": "99d06075-6126-484b-ba90-6bb84970a6b6",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3ODIsImlhdCI6MTc5MzM0ODg4MiwianRpIjoiYjIxYzc4ZDAtMThkNi00MjFlLTg5ODMtMzEwODk0ZWVkZjMyIiwic2lkIjoiOTlkMDYwNzUtNjEyNi00ODRiLWJhOTAtNmJiODQ5NzBhNmI2In0.abMR31wlABDxseJhmEt2o5sOuSK7ntNHTExpm3Ol2Eo",
  "access_expires_at": "2026-10-30T08:43:02.010332708Z",
  "refresh_token": "5Stn6yX2kFF920kNKDh8tJ_zetcxNtqMJXCZiKOAW0U",
  "refresh_expires_at": "2026-10-30T20:28:02.009574128Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "85eef095-2b77-48d7-955c-90c9ea99a0e8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:28:02Z"
}
```

```json
{
  "id": "9c8c364b-9bc0-4a09-879d-943ab36e8d22",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:28:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9c8c364b-9bc0-4a09-879d-943ab36e8d22/publish` → **200**

```json
{
  "command_id": "574655ff-8d50-48c0-9753-6d08539ae3cb",
  "expected_version": 0
}
```

```json
{
  "id": "9c8c364b-9bc0-4a09-879d-943ab36e8d22",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:28:02.608512Z",
  "published_at": "2026-10-30T08:28:02.608512Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "9c8c364b-9bc0-4a09-879d-943ab36e8d22",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:28:02.608512Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637279438",
  "device_ref": "sandbox-18651"
}
```

```json
{
  "challenge_id": "ca941411-5470-4869-92a3-54365f0353e5",
  "expires_at": "2026-10-30T08:33:03.177159576Z",
  "resend_available_at": "2026-10-30T08:28:04.177159576Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637279438` → **200**

```json
{
  "phone": "+380637279438",
  "audience": "CLIENT",
  "code": "145117",
  "sent_at": "2026-10-30T08:28:03.181340869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca941411-5470-4869-92a3-54365f0353e5",
  "code": "145117",
  "device_ref": "sandbox-18651"
}
```

```json
{
  "session_id": "6d8b3ab2-d37a-4df7-9ad4-eedc18f92e03",
  "subject": {
    "type": "CLIENT",
    "id": "875488a0-09eb-4fc4-bc3a-85574ef25404"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzU0ODhhMC0wOWViLTRmYzQtYmMzYS04NTU3NGVmMjU0MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5NzgzLCJpYXQiOjE3OTMzNDg4ODMsImp0aSI6IjEyY2Y2ODVlLTI4ZmUtNDY0Yi04Nzc3LTFmYWY5NzYzMmMwMiIsInNpZCI6IjZkOGIzYWIyLWQzN2EtNGRmNy05YWQ0LWVlZGMxOGY5MmUwMyJ9.a9ghb1tHV_l_im5kMnU8LevplSm8Fs1vPMH4-1o-zYI",
  "access_expires_at": "2026-10-30T08:43:03.505579733Z",
  "refresh_token": "Are4gMYc6vjygF3g13M8Dg0-sjc1vhg4A2POFOxcd9k",
  "refresh_expires_at": "2026-11-29T08:28:03.504855342Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "9c8c364b-9bc0-4a09-879d-943ab36e8d22",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:28:02.608512Z",
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
  "command_id": "b631835b-f08f-4200-8b22-aa69c678706a",
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
  "id": "702e7ccf-8f39-4c2c-9e14-e33ac7ce05f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:04.038164Z",
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
  "command_id": "b906b584-e333-435b-bcf7-fac5a326ba21",
  "quote_id": "702e7ccf-8f39-4c2c-9e14-e33ac7ce05f6",
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
  "correlation_id": "8df10477-ffb3-432c-924d-1ef0d867e299"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "7b8e50bd-ffd0-4205-98e8-e28515dbe5bf",
  "version_id": "9c8c364b-9bc0-4a09-879d-943ab36e8d22",
  "language": "uk"
}
```

```json
{
  "version_id": "9c8c364b-9bc0-4a09-879d-943ab36e8d22",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:28:04.610088Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ec92667-5a15-4ed7-b5ac-9171fcb0773e",
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
  "id": "87394788-e4dc-4644-9103-be6a516afdff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:04.891210Z",
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
  "command_id": "a9152189-113c-4f6c-bc64-6e739f559a89",
  "quote_id": "87394788-e4dc-4644-9103-be6a516afdff",
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
  "id": "3aa6d8ff-92de-4955-912c-cd0f452e3da4",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "875488a0-09eb-4fc4-bc3a-85574ef25404",
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
  "created_at": "2026-10-30T08:28:05.193016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3aa6d8ff-92de-4955-912c-cd0f452e3da4` → **200**

```json
{
  "id": "3aa6d8ff-92de-4955-912c-cd0f452e3da4",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "875488a0-09eb-4fc4-bc3a-85574ef25404",
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
  "created_at": "2026-10-30T08:28:05.193016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3aa6d8ff-92de-4955-912c-cd0f452e3da4/cancel` → **200**

```json
{
  "command_id": "720ec64a-cd94-4f11-bf80-b78648c38856",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3aa6d8ff-92de-4955-912c-cd0f452e3da4",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "875488a0-09eb-4fc4-bc3a-85574ef25404",
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
  "created_at": "2026-10-30T08:28:05.193016Z",
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

`POST /api/admin/v1/legal-documents/9c8c364b-9bc0-4a09-879d-943ab36e8d22` → **409**

```json
{
  "command_id": "a08c8462-f2e2-4df6-a381-4f72aced0cac",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:28:06Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/9c8c364b-9bc0-4a09-879d-943ab36e8d22",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "22fb1957-995f-4f93-84bc-0ad0ac5732ea"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "46f18b47-beb9-47e5-8cda-09aa80b5ea4e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:28:06Z"
}
```

```json
{
  "id": "35a03617-4b63-4af7-a6d1-459674be5879",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:28:06Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/35a03617-4b63-4af7-a6d1-459674be5879/publish` → **200**

```json
{
  "command_id": "eabfa357-7d87-45ad-8ffe-36119227debc",
  "expected_version": 0
}
```

```json
{
  "id": "35a03617-4b63-4af7-a6d1-459674be5879",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:28:06.684145Z",
  "published_at": "2026-10-30T08:28:06.684145Z",
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
  "device_ref": "sandbox-21570"
}
```

```json
{
  "challenge_id": "0c633c2b-d3a3-4efe-a51d-082516cdb928",
  "expires_at": "2026-10-30T08:33:06.990627187Z",
  "resend_available_at": "2026-10-30T08:28:07.990627187Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "643176",
  "sent_at": "2026-10-30T08:28:06.994537497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c633c2b-d3a3-4efe-a51d-082516cdb928",
  "code": "643176",
  "device_ref": "sandbox-21570"
}
```

```json
{
  "session_id": "bd976591-2dd9-4fad-b26c-be65877e46aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTc4NywiaWF0IjoxNzkzMzQ4ODg3LCJqdGkiOiIzMTVjNzFhZC00NWFjLTQyYjAtYjAyZi0zMjVhZjg1OGViNjMiLCJzaWQiOiJiZDk3NjU5MS0yZGQ5LTRmYWQtYjI2Yy1iZTY1ODc3ZTQ2YWEifQ.APnFTlS6LdD8Yk7j8zdHeisG-j4Jxw21OqJWaGv76OQ",
  "access_expires_at": "2026-10-30T08:43:07.288473934Z",
  "refresh_token": "PWVf5YONyd72k7rXXjkLlD_IlhoAWfQoqeGdT5-LXic",
  "refresh_expires_at": "2026-11-29T08:28:07.287961193Z",
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
  "command_id": "7fab73d5-2458-45af-990f-1cd0a72d31ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:28:07Z",
    "sequence": 1793348887852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8b89017b-49ca-4e15-9c16-bfd3d69971ac",
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
  "last_heartbeat_at": "2026-10-30T08:28:07.8742Z",
  "last_location_at": "2026-10-30T08:28:07.8742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673742214",
  "device_ref": "sandbox-25232"
}
```

```json
{
  "challenge_id": "d5f30f88-a287-437c-836c-7f58f7bddfe4",
  "expires_at": "2026-10-30T08:33:08.149259846Z",
  "resend_available_at": "2026-10-30T08:28:09.149259846Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673742214` → **200**

```json
{
  "phone": "+380673742214",
  "audience": "CLIENT",
  "code": "411315",
  "sent_at": "2026-10-30T08:28:08.151556736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5f30f88-a287-437c-836c-7f58f7bddfe4",
  "code": "411315",
  "device_ref": "sandbox-25232"
}
```

```json
{
  "session_id": "e10880d8-dc6e-427f-b05c-f3724f107e97",
  "subject": {
    "type": "CLIENT",
    "id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjNmOTg2Ni04OGE1LTRhYTgtOTVmZC1iYjUyOWZkYTI0ZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5Nzg4LCJpYXQiOjE3OTMzNDg4ODgsImp0aSI6IjhiNTgxZDc4LWUxNDEtNGZmZC05YjFkLTBjMTBjMDMwMzEzNCIsInNpZCI6ImUxMDg4MGQ4LWRjNmUtNDI3Zi1iMDVjLWYzNzI0ZjEwN2U5NyJ9.9hTMbOUDqGF0MYNt7V1RfooMhB9vGE2f8e59ZMO4lXI",
  "access_expires_at": "2026-10-30T08:43:08.44294705Z",
  "refresh_token": "G1u6BOKkDpuVs-LbT3_cenpu_bmU1ZlFvLq1sf6fbTk",
  "refresh_expires_at": "2026-11-29T08:28:08.442381085Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c8972aa5-f108-4da3-a879-98967330470a",
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
  "id": "c3ffd132-0913-470a-ab16-7ad9f1987e89",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:08.744238Z",
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
  "command_id": "90f1479f-8014-49fd-b420-b1aeb5809c01",
  "quote_id": "c3ffd132-0913-470a-ab16-7ad9f1987e89",
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
    "phone": "+380674554448"
  }
}
```

```json
{
  "id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:28:09.023738Z",
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
    "id": "be084348-17ea-4414-892a-c076abea7522",
    "order_id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
    "expires_at": "2026-10-30T08:28:24.026807Z",
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

`POST /api/driver/v1/offers/be084348-17ea-4414-892a-c076abea7522/accept` → **200**

```json
{
  "command_id": "ec7a5a2f-a64a-4646-8a9f-315f5cfbe7f4"
}
```

```json
{
  "id": "9d967e64-4a62-498a-90df-eff83353cd69",
  "order_id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9b42e880-e9d4-49e9-887a-c1db48a6b9b2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9b42e880-e9d4-49e9-887a-c1db48a6b9b2",
  "order_id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
  "assignment_id": "9d967e64-4a62-498a-90df-eff83353cd69",
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
    "phone": "+380674554448"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1be6d2c-f1c8-489b-8fb1-1e25a4d52307",
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
  "id": "34069746-2752-46d6-98a5-05a3c9709f48",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:10.136760Z",
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
  "command_id": "a7fe827a-b375-47ef-bbb3-cfdc4acfa4c7",
  "quote_id": "34069746-2752-46d6-98a5-05a3c9709f48",
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
  "id": "9a0a2323-e335-4473-9e3d-565380e7b71d",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:28:10.454711Z",
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
  "command_id": "a054fcd0-c579-48f5-99c5-21ae1803fedf",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:28:10Z"
}
```

```json
{
  "id": "d35ce046-6026-4824-92c9-e83a125b1dee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:10.800091Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:28:10Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f164a5ee-98b4-459a-aaa6-da712beaeb88",
  "quote_id": "d35ce046-6026-4824-92c9-e83a125b1dee",
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
  "pickup_at": "2026-10-30T11:28:10Z"
}
```

```json
{
  "id": "9ede3155-5014-469f-ba96-f596f2d13608",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:28:11.118396Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:28:10Z",
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
  "command_id": "d4825fb3-d58a-421c-82c1-ca11c449edcb",
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
  "id": "6501065e-9b9a-48f7-bf86-36a83f68a58e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:11.447032Z",
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
  "command_id": "39773a36-032a-4554-8995-32418268b46d",
  "quote_id": "6501065e-9b9a-48f7-bf86-36a83f68a58e",
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
  "correlation_id": "5d98f73b-a1f6-4001-9008-fab18334b8a5"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9ede3155-5014-469f-ba96-f596f2d13608",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:28:11.118396Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:28:10Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "9a0a2323-e335-4473-9e3d-565380e7b71d",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T08:28:10.454711Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "9a0a2323-e335-4473-9e3d-565380e7b71d",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:28:10.454711Z",
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

`GET /api/rider/v1/orders/81cd8189-4688-497b-bc72-2aa2bedb7060` → **200**

```json
{
  "id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9d967e64-4a62-498a-90df-eff83353cd69",
    "order_id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9b42e880-e9d4-49e9-887a-c1db48a6b9b2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:28:09.023738Z",
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
    "location_at": "2026-10-30T08:28:07.8742Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/81cd8189-4688-497b-bc72-2aa2bedb7060/cancel` → **200**

```json
{
  "command_id": "c61364ba-7acc-441d-bc02-63aad39f6cd8",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9d967e64-4a62-498a-90df-eff83353cd69",
    "order_id": "81cd8189-4688-497b-bc72-2aa2bedb7060",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9b42e880-e9d4-49e9-887a-c1db48a6b9b2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:28:09.023738Z",
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

`GET /api/rider/v1/orders/9a0a2323-e335-4473-9e3d-565380e7b71d` → **200**

```json
{
  "id": "9a0a2323-e335-4473-9e3d-565380e7b71d",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:28:10.454711Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9a0a2323-e335-4473-9e3d-565380e7b71d/cancel` → **200**

```json
{
  "command_id": "9b8ea620-7cf6-4e6c-b51b-fc773a9fb72a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9a0a2323-e335-4473-9e3d-565380e7b71d",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:28:10.454711Z",
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

`GET /api/rider/v1/orders/9ede3155-5014-469f-ba96-f596f2d13608` → **200**

```json
{
  "id": "9ede3155-5014-469f-ba96-f596f2d13608",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:28:11.118396Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:28:10Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9ede3155-5014-469f-ba96-f596f2d13608/cancel` → **200**

```json
{
  "command_id": "8794dc63-fc10-4440-b007-02a70b7ea18b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9ede3155-5014-469f-ba96-f596f2d13608",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0b3f9866-88a5-4aa8-95fd-bb529fda24d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:28:11.118396Z",
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
  "pickup_at": "2026-10-30T11:28:10Z",
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
  "session_id": "8b89017b-49ca-4e15-9c16-bfd3d69971ac",
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
  "last_heartbeat_at": "2026-10-30T08:28:07.8742Z",
  "last_location_at": "2026-10-30T08:28:07.8742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b89017b-49ca-4e15-9c16-bfd3d69971ac/close` → **200**

```json
{
  "command_id": "b7e14fb5-144f-4975-96b0-21641cb01fa5",
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

Done: orders 81cd8189-4688-497b-bc72-2aa2bedb7060, 9a0a2323-e335-4473-9e3d-565380e7b71d, 9ede3155-5014-469f-ba96-f596f2d13608.

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
  "session_id": "4e25fda5-a871-4a50-8199-7aed2486ebef",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3OTUsImlhdCI6MTc5MzM0ODg5NSwianRpIjoiZjhkZTNiZjEtZTRiYS00ODc3LWI2MzEtNTRhNDExMDhjZjJhIiwic2lkIjoiNGUyNWZkYTUtYTg3MS00YTUwLTgxOTktN2FlZDI0ODZlYmVmIn0.qXDCxFy1JGJlV-Yczol1jzJTEJYinvhOyMAB_0rfogc",
  "access_expires_at": "2026-10-30T08:43:15.366014138Z",
  "refresh_token": "yCY3h0m-yNW5wwNK3lJL_TfDqlCaUmVdFApLRzN6pAs",
  "refresh_expires_at": "2026-10-30T20:28:15.365492969Z",
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
  "session_id": "94e99037-33ae-4fa1-8424-a12b6e22cb49",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk3OTUsImlhdCI6MTc5MzM0ODg5NSwianRpIjoiZmJmMDk3MGItMDUwNS00NWUyLThkZjYtNGNiYzdiNGQ3YjVkIiwic2lkIjoiOTRlOTkwMzctMzNhZS00ZmExLTg0MjQtYTEyYjZlMjJjYjQ5In0.ICxpNqV-joQtV5XI1OZ-JZwjlHmZecZoGJjw-N0cKeM",
  "access_expires_at": "2026-10-30T08:43:15.970001827Z",
  "refresh_token": "njlySZzwaXPfkhwdlTRjeqxnXi7Jz9jRIjeVS6Lmdrk",
  "refresh_expires_at": "2026-10-30T20:28:15.969456632Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7960"
}
```

```json
{
  "challenge_id": "47ec98fa-9668-483b-afda-d1e8b7409f4f",
  "expires_at": "2026-10-30T08:33:16.240977734Z",
  "resend_available_at": "2026-10-30T08:28:17.240977734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "910531",
  "sent_at": "2026-10-30T08:28:16.248243428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47ec98fa-9668-483b-afda-d1e8b7409f4f",
  "code": "910531",
  "device_ref": "sandbox-7960"
}
```

```json
{
  "session_id": "4b7da229-5c32-4259-9bd9-f563e9761c77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTc5NiwiaWF0IjoxNzkzMzQ4ODk2LCJqdGkiOiI1YzEwYjI4MC1lZTJkLTRhYTYtOGM3OS0wY2E0NTNhYTNhNzkiLCJzaWQiOiI0YjdkYTIyOS01YzMyLTQyNTktOWJkOS1mNTYzZTk3NjFjNzcifQ.F7-6FMHvJyJF0Xiv-OkP8UI_Phr6cU68iQ5l69SU2s0",
  "access_expires_at": "2026-10-30T08:43:16.573894025Z",
  "refresh_token": "6jNHo5yqZCKtcFQ_sJM9JF-jAr2v3mL-kN_KYkifxJg",
  "refresh_expires_at": "2026-11-29T08:28:16.573408858Z",
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
  "command_id": "98e8ada8-66e9-42cb-abdd-f7870b003867",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:28:17Z",
    "sequence": 1793348897100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8921c35f-ed0e-40d6-bee1-402ff0e84120",
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
  "last_heartbeat_at": "2026-10-30T08:28:17.120751Z",
  "last_location_at": "2026-10-30T08:28:17.120751Z",
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
  "command_id": "8d17290e-0579-456f-887e-9b036b230ccb",
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
  "effective_at": "2026-10-30T08:28:17.726898Z",
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:25:38.104339Z",
  "last_entries": [
    {
      "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:25:38.104339Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f0a0c706-e889-4c87-b0ed-02c360edb1cd",
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
  "id": "27986adf-1c47-4b28-a2e9-88d33f231239",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:18.322742Z",
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
  "command_id": "6274ef81-1264-4134-9bb3-ebbd37e6b7c7",
  "quote_id": "27986adf-1c47-4b28-a2e9-88d33f231239",
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
    "phone": "+380671113870"
  }
}
```

```json
{
  "id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
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
  "created_at": "2026-10-30T08:28:18.626088Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113870"
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
    "id": "59dfbedf-2f79-45cc-bb53-264790c940a6",
    "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
    "expires_at": "2026-10-30T08:28:33.629718Z",
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

`POST /api/driver/v1/offers/59dfbedf-2f79-45cc-bb53-264790c940a6/accept` → **200**

```json
{
  "command_id": "a1b59dce-b88d-4d27-8cfb-c4218187aee1"
}
```

```json
{
  "id": "bce65c66-9673-44aa-994b-ecc21427d493",
  "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3",
  "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
  "assignment_id": "bce65c66-9673-44aa-994b-ecc21427d493",
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
    "phone": "+380671113870"
  }
}
```

`POST /api/driver/v1/work-sessions/8921c35f-ed0e-40d6-bee1-402ff0e84120/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:28:19Z",
    "sequence": 1793348899787
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8921c35f-ed0e-40d6-bee1-402ff0e84120",
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
  "last_heartbeat_at": "2026-10-30T08:28:19.808374Z",
  "last_location_at": "2026-10-30T08:28:19.808374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3/arrive` → **200**

```json
{
  "command_id": "df83966a-8bb0-4767-877c-3132e32ea253",
  "expected_version": 0
}
```

```json
{
  "id": "0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3",
  "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
  "assignment_id": "bce65c66-9673-44aa-994b-ecc21427d493",
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
  "arrived_at": "2026-10-30T08:28:20.108469Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113870"
  }
}
```

`POST /api/driver/v1/trips/0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3/start` → **200**

```json
{
  "command_id": "d8e48e69-83c4-4d7a-a236-20499f4f3ba2",
  "expected_version": 1
}
```

```json
{
  "id": "0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3",
  "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
  "assignment_id": "bce65c66-9673-44aa-994b-ecc21427d493",
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
  "arrived_at": "2026-10-30T08:28:20.108469Z",
  "started_at": "2026-10-30T08:28:20.398759Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113870"
  }
}
```

`POST /api/driver/v1/trips/0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3/complete` → **200**

```json
{
  "command_id": "ad5b824f-5600-4fdb-9c6a-b9fb7f752d54",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:28:20Z",
  "cash_received": true
}
```

```json
{
  "id": "0a95e1de-1a96-4f53-aabe-fd1b6fa1f9c3",
  "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
  "assignment_id": "bce65c66-9673-44aa-994b-ecc21427d493",
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
  "arrived_at": "2026-10-30T08:28:20.108469Z",
  "started_at": "2026-10-30T08:28:20.398759Z",
  "completed_at": "2026-10-30T08:28:20.709119Z",
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
  "command_id": "05b5b24d-1aec-451b-a48d-659a12a63846",
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
  "id": "1f0bfdcf-ed27-48ea-ba4d-b92b36323787",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:21.021303Z",
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
  "command_id": "58938253-d7c6-4df7-bceb-3f45ad3c9a82",
  "quote_id": "1f0bfdcf-ed27-48ea-ba4d-b92b36323787",
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
    "phone": "+3806711113796"
  }
}
```

```json
{
  "id": "159eca8b-c023-47c4-ad10-20009c7894bf",
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
  "created_at": "2026-10-30T08:28:21.334156Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113796"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/159eca8b-c023-47c4-ad10-20009c7894bf` → **200**

```json
{
  "id": "159eca8b-c023-47c4-ad10-20009c7894bf",
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
  "created_at": "2026-10-30T08:28:21.334156Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113796"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/159eca8b-c023-47c4-ad10-20009c7894bf/cancel` → **200**

```json
{
  "command_id": "65390f9b-8dd2-4ee2-8473-a6f9eca100b4",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "159eca8b-c023-47c4-ad10-20009c7894bf",
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
  "created_at": "2026-10-30T08:28:21.334156Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113796"
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
  "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:25:38.104339Z",
  "last_entries": [
    {
      "order_id": "159eca8b-c023-47c4-ad10-20009c7894bf",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:28:21.954926Z"
    },
    {
      "order_id": "5ece130c-6ee8-40eb-90f0-a2324a49298e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:28:20.713874Z"
    },
    {
      "order_id": "e36de718-5dca-412f-a923-5a8c2882654b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:25:38.104339Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8921c35f-ed0e-40d6-bee1-402ff0e84120",
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
  "last_heartbeat_at": "2026-10-30T08:28:19.808374Z",
  "last_location_at": "2026-10-30T08:28:19.808374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8921c35f-ed0e-40d6-bee1-402ff0e84120/close` → **200**

```json
{
  "command_id": "44a83063-a626-429a-a52d-cc81bff87477",
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

Done: operator bonus for fulfilled 5ece130c-6ee8-40eb-90f0-a2324a49298e and operator-fault cancellation 159eca8b-c023-47c4-ad10-20009c7894bf.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675061327",
  "device_ref": "sandbox-611"
}
```

```json
{
  "challenge_id": "02eb25f8-765a-44cd-8777-86910b082d35",
  "expires_at": "2026-10-30T08:33:26.335896816Z",
  "resend_available_at": "2026-10-30T08:28:27.335896816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675061327` → **200**

```json
{
  "phone": "+380675061327",
  "audience": "CLIENT",
  "code": "794159",
  "sent_at": "2026-10-30T08:28:26.338376267Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672174787",
  "device_ref": "sandbox-21304",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6b2ffe45-0f7e-4417-bc3c-9bd710925176",
  "expires_at": "2026-10-30T08:33:27.857431065Z",
  "resend_available_at": "2026-10-30T08:28:28.857431065Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672174787` → **200**

```json
{
  "phone": "+380672174787",
  "audience": "CLIENT",
  "code": "964076",
  "sent_at": "2026-10-30T08:28:27.859622096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672174787",
  "device_ref": "sandbox-24906",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c5bcc8bd-d42d-4125-8eb5-c68916c04f5e",
  "expires_at": "2026-10-30T08:33:29.356231672Z",
  "resend_available_at": "2026-10-30T08:28:30.356231672Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672174787` → **200**

```json
{
  "phone": "+380672174787",
  "audience": "CLIENT",
  "code": "596721",
  "sent_at": "2026-10-30T08:28:29.359610206Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678170000",
  "device_ref": "sandbox-31729"
}
```

```json
{
  "challenge_id": "0fa43714-2bc0-4241-9e6c-b0d4da629f4c",
  "expires_at": "2026-10-30T08:33:30.896573399Z",
  "resend_available_at": "2026-10-30T08:28:31.896573399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678170000",
  "device_ref": "sandbox-25423"
}
```

```json
{
  "challenge_id": "102f2579-c051-45fb-93d0-1d30b05d182a",
  "expires_at": "2026-10-30T08:33:32.412504625Z",
  "resend_available_at": "2026-10-30T08:28:33.412504625Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678170000` → **200**

```json
{
  "phone": "+380678170000",
  "audience": "CLIENT",
  "code": "743626",
  "sent_at": "2026-10-30T08:28:32.415532736Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678170000",
  "device_ref": "sandbox-19972",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "fd1e49ae-75c4-45db-9a9b-4618af7a931b",
  "expires_at": "2026-10-30T08:33:33.936059535Z",
  "resend_available_at": "2026-10-30T08:28:34.936059535Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678170000` → **200**

```json
{
  "phone": "+380678170000",
  "audience": "CLIENT",
  "code": "464078",
  "sent_at": "2026-10-30T08:28:33.938650411Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380678170000",
  "device_ref": "sandbox-29818",
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
  "correlation_id": "8d3c4dee-1bce-473e-af17-c2c36751a596",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000019763"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "d3fc6921-f2c0-43ff-ac39-6e2ded32fef0"
}
```

`GET /sandbox/v1/otp?phone=%2B442000019763` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120028847"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "fb04ae44-c718-42be-9f1b-8f393648e941"
}
```

`GET /sandbox/v1/otp?phone=%2B37120028847` → **404**

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
  "session_id": "f2be8e9b-df68-44ac-9ffc-e5558523f7af",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4MTYsImlhdCI6MTc5MzM0ODkxNiwianRpIjoiNjBjMTM1NDQtYjdmZi00YThkLWEyYTQtZGE2YmZjYjNhYWIyIiwic2lkIjoiZjJiZThlOWItZGY2OC00NGFjLTlmZmMtZTU1NTg1MjNmN2FmIn0.v3E1N0fwIHPXKwsBlKJBjDP3AGmW8xbpjLzvBO26Mzc",
  "access_expires_at": "2026-10-30T08:43:36.710540781Z",
  "refresh_token": "O8D-EkDGuujOJayNW5AAG4TnHYIVNclEEoK9rp-hi_4",
  "refresh_expires_at": "2026-10-30T20:28:36.70996384Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678170000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8fc9b9d3-a2c1-4d71-8a8a-b5e42cffe40b",
      "challenge_id": "fd1e49ae-75c4-45db-9a9b-4618af7a931b",
      "phone": "+380678170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6739e9e8-2219-4162-907e-ff9d7a0b51d1",
      "error": null,
      "attempted_at": "2026-10-30T08:28:33.939204Z"
    },
    {
      "id": "e003030a-469f-4d98-84f1-b86e45ee8274",
      "challenge_id": "102f2579-c051-45fb-93d0-1d30b05d182a",
      "phone": "+380678170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3e094d7a-4c05-4c5c-bbe6-2abbf7dd20bb",
      "error": null,
      "attempted_at": "2026-10-30T08:28:32.416042Z"
    },
    {
      "id": "8a9f6f95-1c1f-4858-85cc-4e7d274b2d83",
      "challenge_id": "0fa43714-2bc0-4241-9e6c-b0d4da629f4c",
      "phone": "+380678170000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:28:30.900607Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678170000` → **200**

```json
{
  "phone": "+380678170000",
  "audience": "CLIENT",
  "code": "464078",
  "sent_at": "2026-10-30T08:28:33.938650411Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672174787` → **200**

```json
{
  "deliveries": [
    {
      "id": "d14004c8-3f22-453e-aa79-1f8ad8b4ae50",
      "challenge_id": "c5bcc8bd-d42d-4125-8eb5-c68916c04f5e",
      "phone": "+380672174787",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f1c91609-590c-415a-b081-2a8d7e16b4c1",
      "error": null,
      "attempted_at": "2026-10-30T08:28:29.360229Z"
    },
    {
      "id": "586b3b6c-7765-47d0-9e23-b2c035fbdbe1",
      "challenge_id": "6b2ffe45-0f7e-4417-bc3c-9bd710925176",
      "phone": "+380672174787",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e77f5382-b453-45ad-9438-ffe9f0ac40bb",
      "error": null,
      "attempted_at": "2026-10-30T08:28:27.859976Z"
    }
  ]
}
```

Done: SMS to +380675061327; SMS then a call to +380672174787; a failed SMS, two calls and a refused third to +380678170000; +44 and +371 refused.

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
  "session_id": "76032009-bd0a-4557-bc00-fb384bc56263",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4MTcsImlhdCI6MTc5MzM0ODkxNywianRpIjoiYTAyYzY2ZmUtYWZmMC00NjliLTg1ZTQtNTc1NDZmMTcyOWUwIiwic2lkIjoiNzYwMzIwMDktYmQwYS00NTU3LWJjMDAtZmIzODRiYzU2MjYzIn0.RJdUdnGYKHg6O4WHYyGu1ZQRkwPxAsRfb61WNINjoKc",
  "access_expires_at": "2026-10-30T08:43:37.964368146Z",
  "refresh_token": "iKllMV-bAgIjpB9v_xDZZpp6aWIgTr_XW0B0QcolkZI",
  "refresh_expires_at": "2026-10-30T20:28:37.963532162Z",
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
  "session_id": "385ef111-c8db-4a2b-bc4e-f87060ecb0b5",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4MTgsImlhdCI6MTc5MzM0ODkxOCwianRpIjoiMWY5OGEyMjgtZWRkOS00MjMyLWFhYzEtYzI0MzkwNjkyZTY1Iiwic2lkIjoiMzg1ZWYxMTEtYzhkYi00YTJiLWJjNGUtZjg3MDYwZWNiMGI1In0.JpZ0NX6c4bPWgdGiOXDVlpf4JdvvGamSNK-1QSqrRkk",
  "access_expires_at": "2026-10-30T08:43:38.570641307Z",
  "refresh_token": "r1h8HSYK1Ydi2RxSYt5tHTshkBtZOXHLgTlCQlabPno",
  "refresh_expires_at": "2026-10-30T20:28:38.570193075Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
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

`POST /api/admin/v1/staff-extensions/e062c55e-1844-4e6c-a9a2-f4dd260c11a1` → **200**

```json
{
  "command_id": "74802624-3b28-4ed1-b965-ab42765f7d28",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e35d191b-a8b2-45d9-a86a-f71d9911cfac",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:28:39.719576Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:28:39.719576Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b29f9e5d-6417-4dfd-9f17-25f735fb2677",
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
  "id": "64cb61b4-0bd3-4279-9640-bf2f406ae739",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:33:40.307288Z",
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
  "command_id": "97077866-8a68-44ed-b7a8-ee891dc5d5ff",
  "quote_id": "64cb61b4-0bd3-4279-9640-bf2f406ae739",
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
    "phone": "+380678268868"
  }
}
```

```json
{
  "id": "fa1b17a1-0018-4c18-94fe-fc49f2e9e699",
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
  "created_at": "2026-10-30T08:28:40.605693Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678268868"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/fa1b17a1-0018-4c18-94fe-fc49f2e9e699/calls` → **201**

```json
{
  "command_id": "4899ed4e-d6c1-48b9-bdcc-6f3c2fa85edd",
  "to": "CALLER"
}
```

```json
{
  "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "order_ids": [
    "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
  ],
  "started_at": "2026-10-30T08:28:40.955531Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/fa1b17a1-0018-4c18-94fe-fc49f2e9e699/calls` → **201**

```json
{
  "command_id": "4899ed4e-d6c1-48b9-bdcc-6f3c2fa85edd",
  "to": "CALLER"
}
```

```json
{
  "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "order_ids": [
    "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
  ],
  "started_at": "2026-10-30T08:28:40.955531Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "817a689c-d608-4d65-8362-b6f22e1646e1",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678268868",
    "at": "2026-10-30T08:28:40.957886116Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.30248",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "817a689c-d608-4d65-8362-b6f22e1646e1"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=fa1b17a1-0018-4c18-94fe-fc49f2e9e699` → **200**

```json
{
  "calls": [
    {
      "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [
        "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
      ],
      "started_at": "2026-10-30T08:28:40.955531Z",
      "answered_at": "2026-10-30T08:28:41.642301Z",
      "ended_at": "2026-10-30T08:28:41.668139Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=fa1b17a1-0018-4c18-94fe-fc49f2e9e699` → **200**

```json
{
  "calls": [
    {
      "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [
        "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
      ],
      "started_at": "2026-10-30T08:28:40.955531Z",
      "answered_at": "2026-10-30T08:28:41.642301Z",
      "ended_at": "2026-10-30T08:28:41.668139Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=fa1b17a1-0018-4c18-94fe-fc49f2e9e699` → **200**

```json
{
  "calls": [
    {
      "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [
        "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
      ],
      "started_at": "2026-10-30T08:28:40.955531Z",
      "answered_at": "2026-10-30T08:28:41.642301Z",
      "ended_at": "2026-10-30T08:28:41.668139Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=fa1b17a1-0018-4c18-94fe-fc49f2e9e699` → **200**

```json
{
  "calls": [
    {
      "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [
        "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
      ],
      "started_at": "2026-10-30T08:28:40.955531Z",
      "answered_at": "2026-10-30T08:28:41.642301Z",
      "ended_at": "2026-10-30T08:28:41.668139Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=fa1b17a1-0018-4c18-94fe-fc49f2e9e699` → **200**

```json
{
  "calls": [
    {
      "id": "817a689c-d608-4d65-8362-b6f22e1646e1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "order_ids": [
        "fa1b17a1-0018-4c18-94fe-fc49f2e9e699"
      ],
      "started_at": "2026-10-30T08:28:40.955531Z",
      "answered_at": "2026-10-30T08:28:41.642301Z",
      "ended_at": "2026-10-30T08:28:41.668139Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:28:49.651526Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/fa1b17a1-0018-4c18-94fe-fc49f2e9e699` → **200**

```json
{
  "id": "fa1b17a1-0018-4c18-94fe-fc49f2e9e699",
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
  "created_at": "2026-10-30T08:28:40.605693Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678268868"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fa1b17a1-0018-4c18-94fe-fc49f2e9e699/cancel` → **200**

```json
{
  "command_id": "4e87dad9-eb04-4e08-8c7c-d8c973bd5563",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fa1b17a1-0018-4c18-94fe-fc49f2e9e699",
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
  "created_at": "2026-10-30T08:28:40.605693Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678268868"
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
  "command_id": "f98ff67e-f527-4c4a-8a7c-ed1371e6f2a2",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:28:51.585878Z",
  "extension": "101"
}
```

Done: outgoing call 817a689c-d608-4d65-8362-b6f22e1646e1 from order fa1b17a1-0018-4c18-94fe-fc49f2e9e699, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637216563",
  "device_ref": "sandbox-19031"
}
```

```json
{
  "challenge_id": "8fcd553a-8a7d-4401-80ff-1856aed0cb9f",
  "expires_at": "2026-10-30T08:33:51.866822196Z",
  "resend_available_at": "2026-10-30T08:28:52.866822196Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637216563` → **200**

```json
{
  "phone": "+380637216563",
  "audience": "CLIENT",
  "code": "297121",
  "sent_at": "2026-10-30T08:28:51.869517564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fcd553a-8a7d-4401-80ff-1856aed0cb9f",
  "code": "297121",
  "device_ref": "sandbox-19031"
}
```

```json
{
  "session_id": "25276170-c7b8-4dda-bae4-da4dd4e4a29a",
  "subject": {
    "type": "CLIENT",
    "id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAyZjJhZC04YzNiLTQzYmYtYjhlMS04ZGI0ZjAyYjkxNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODMyLCJpYXQiOjE3OTMzNDg5MzIsImp0aSI6ImNmNjBkZDFlLWIzY2YtNDEzMi05MTE0LWU3YmU3YmVlOGM4YSIsInNpZCI6IjI1Mjc2MTcwLWM3YjgtNGRkYS1iYWU0LWRhNGRkNGU0YTI5YSJ9.oC0SGVeoqIvX3-DLggzM8Dezxk7FDhxUO9pAdeKLYdY",
  "access_expires_at": "2026-10-30T08:43:52.16489042Z",
  "refresh_token": "et5aZjaPTnoGaQJdhJc92vL6NtTc1mgoEX_lGpbGSas",
  "refresh_expires_at": "2026-11-29T08:28:52.164421037Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
  "session_id": "25276170-c7b8-4dda-bae4-da4dd4e4a29a",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637216563",
  "device_ref": "sandbox-21977"
}
```

```json
{
  "challenge_id": "4b3610a7-6e04-4451-ab39-68ac147f4aab",
  "expires_at": "2026-10-30T08:33:54.709121432Z",
  "resend_available_at": "2026-10-30T08:28:55.709121432Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637216563` → **200**

```json
{
  "phone": "+380637216563",
  "audience": "CLIENT",
  "code": "147523",
  "sent_at": "2026-10-30T08:28:54.711542511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b3610a7-6e04-4451-ab39-68ac147f4aab",
  "code": "147523",
  "device_ref": "sandbox-21977"
}
```

```json
{
  "session_id": "56b360dd-76b1-42c2-9945-eff2dd6f9d80",
  "subject": {
    "type": "CLIENT",
    "id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAyZjJhZC04YzNiLTQzYmYtYjhlMS04ZGI0ZjAyYjkxNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODM1LCJpYXQiOjE3OTMzNDg5MzUsImp0aSI6IjE2MzQzNGJiLWYwYWItNGZhZS1iNDkxLWVlZTk1MDNhMmY2YiIsInNpZCI6IjU2YjM2MGRkLTc2YjEtNDJjMi05OTQ1LWVmZjJkZDZmOWQ4MCJ9.PvtrCfMbok7brX2TJDiNZwGXvtvdCnKmJKOqZOMCGpQ",
  "access_expires_at": "2026-10-30T08:43:55.009293168Z",
  "refresh_token": "T0ri48ISL6q_PkpYCO9Y2Znx5YlA3LJEphG77NbAs3c",
  "refresh_expires_at": "2026-11-29T08:28:55.008762764Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "73a4742d-f6d8-431b-bffa-a1a0deebdcef",
  "expires_at": "2026-10-30T08:33:57.30988499Z",
  "resend_available_at": "2026-10-30T08:28:58.30988499Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637216563` → **200**

```json
{
  "phone": "+380637216563",
  "audience": "CLIENT",
  "code": "106174",
  "sent_at": "2026-10-30T08:28:57.312239857Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639762682"
}
```

```json
{
  "challenge_id": "afc9c9bb-84e5-4312-8bc4-6219a4114543",
  "expires_at": "2026-10-30T08:33:57.600149028Z",
  "resend_available_at": "2026-10-30T08:28:58.600149028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639762682` → **200**

```json
{
  "phone": "+380639762682",
  "audience": "CLIENT",
  "code": "026799",
  "sent_at": "2026-10-30T08:28:57.601945855Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d970f4d7-be1c-4de1-aec2-c1c3e7b9e633",
  "current_challenge_id": "73a4742d-f6d8-431b-bffa-a1a0deebdcef",
  "current_code": "000000",
  "new_challenge_id": "afc9c9bb-84e5-4312-8bc4-6219a4114543",
  "new_code": "026799"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "38be9037-0861-45a8-be50-9f1dc1128aab"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "a573153a-df7a-4432-94c4-940bf05f3fd5",
  "current_challenge_id": "73a4742d-f6d8-431b-bffa-a1a0deebdcef",
  "current_code": "106174",
  "new_challenge_id": "afc9c9bb-84e5-4312-8bc4-6219a4114543",
  "new_code": "026799"
}
```

```json
{
  "subject_id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
  "phone": "+380639762682",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
  "session_id": "25276170-c7b8-4dda-bae4-da4dd4e4a29a",
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
  "correlation_id": "3266d4d4-df35-44db-8dfa-990ff7aed968"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639762682",
  "device_ref": "sandbox-6460"
}
```

```json
{
  "challenge_id": "d14b3788-8187-44d7-8b77-b94465802f97",
  "expires_at": "2026-10-30T08:34:00.915602341Z",
  "resend_available_at": "2026-10-30T08:29:01.915602341Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639762682` → **200**

```json
{
  "phone": "+380639762682",
  "audience": "CLIENT",
  "code": "694300",
  "sent_at": "2026-10-30T08:29:00.918335993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d14b3788-8187-44d7-8b77-b94465802f97",
  "code": "694300",
  "device_ref": "sandbox-6460"
}
```

```json
{
  "session_id": "c9a4868c-30e3-434a-9e8b-65cc7223b80e",
  "subject": {
    "type": "CLIENT",
    "id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAyZjJhZC04YzNiLTQzYmYtYjhlMS04ZGI0ZjAyYjkxNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODQxLCJpYXQiOjE3OTMzNDg5NDEsImp0aSI6IjE2ZDcwNTJhLTYyNGQtNDEyOC05MmUyLWQ3YjU5YTkyNTgxMSIsInNpZCI6ImM5YTQ4NjhjLTMwZTMtNDM0YS05ZThiLTY1Y2M3MjIzYjgwZSJ9.iqDJy3cfuihReCLRzlLv9U254IfwLUyl-slrZQUBIi8",
  "access_expires_at": "2026-10-30T08:44:01.188680338Z",
  "refresh_token": "8VW085773SzuuEatdQjv0DE5xuiyApUFOCE0iLHSdx0",
  "refresh_expires_at": "2026-11-29T08:29:01.18825816Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
  "session_id": "c9a4868c-30e3-434a-9e8b-65cc7223b80e",
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
  "session_id": "e2ee6914-f23b-4cc3-a931-3b9fbf8dbfc4",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NDEsImlhdCI6MTc5MzM0ODk0MSwianRpIjoiODNiYzlkNzAtMmU2Ny00MTQ3LTkyYzgtZDQ4YjljZTgxYjY3Iiwic2lkIjoiZTJlZTY5MTQtZjIzYi00Y2MzLWE5MzEtM2I5ZmJmOGRiZmM0In0.APhufdpWatshxdhUrBJI3cYY_jUG5tDV5dyA81ZPnTw",
  "access_expires_at": "2026-10-30T08:44:01.945187389Z",
  "refresh_token": "jz4_sYQME6TRsRVceqFdSzGozQ0l6X8HyUVE0jy8mEc",
  "refresh_expires_at": "2026-10-30T20:29:01.944741504Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c` → **200**

```json
{
  "client": {
    "id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
    "phone": "+380639762682",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:28:52.162928Z",
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

`POST /api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c/phone/new-code` → **201**

```json
{
  "phone": "+380639476150"
}
```

```json
{
  "challenge_id": "e551c40f-08ca-4d86-82a7-0685395760e7",
  "expires_at": "2026-10-30T08:34:02.497862055Z",
  "resend_available_at": "2026-10-30T08:29:03.497862055Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639476150` → **200**

```json
{
  "phone": "+380639476150",
  "audience": "CLIENT",
  "code": "059959",
  "sent_at": "2026-10-30T08:29:02.499896076Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c/phone` → **422**

```json
{
  "command_id": "10cc47b8-b044-4ada-b77f-4d2eeead9c6b",
  "expected_version": 3,
  "new_challenge_id": "e551c40f-08ca-4d86-82a7-0685395760e7",
  "new_code": "059960",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "888bc4fe-6eba-4a37-9005-6b58b90261f8"
}
```

`POST /api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c/phone` → **400**

```json
{
  "command_id": "98522040-a215-4345-a943-f38812be1a8c",
  "expected_version": 3,
  "new_challenge_id": "e551c40f-08ca-4d86-82a7-0685395760e7",
  "new_code": "059959",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3f3a17f7-160d-49ef-b95d-a963968b22e5",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/c702f2ad-8c3b-43bf-b8e1-8db4f02b914c/phone` → **200**

```json
{
  "command_id": "5b1c21bf-8462-4cba-bbcf-4e8d70722228",
  "expected_version": 3,
  "new_challenge_id": "e551c40f-08ca-4d86-82a7-0685395760e7",
  "new_code": "059959",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
  "phone": "+380639476150",
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
  "correlation_id": "6c3abcf6-93e2-4718-b09a-5adbf90410a1"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639476150",
  "device_ref": "sandbox-31900"
}
```

```json
{
  "challenge_id": "2baf8f83-97e4-49d4-9ed6-47af7812e2de",
  "expires_at": "2026-10-30T08:34:03.840438273Z",
  "resend_available_at": "2026-10-30T08:29:04.840438273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639476150` → **200**

```json
{
  "phone": "+380639476150",
  "audience": "CLIENT",
  "code": "353027",
  "sent_at": "2026-10-30T08:29:03.843512538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2baf8f83-97e4-49d4-9ed6-47af7812e2de",
  "code": "353027",
  "device_ref": "sandbox-31900"
}
```

```json
{
  "session_id": "cd4aed88-d45e-4b6a-a1e4-db9416fdff3c",
  "subject": {
    "type": "CLIENT",
    "id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAyZjJhZC04YzNiLTQzYmYtYjhlMS04ZGI0ZjAyYjkxNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODQ0LCJpYXQiOjE3OTMzNDg5NDQsImp0aSI6Ijk3YzczNDNiLTU1NzktNDMzZi1iZTE1LWM3NzBiNzI0YTgzNSIsInNpZCI6ImNkNGFlZDg4LWQ0NWUtNGI2YS1hMWU0LWRiOTQxNmZkZmYzYyJ9.abMUl3BMt_JeqRG9Cr58jh9yIjtl5iYLoGx9vzOpVvY",
  "access_expires_at": "2026-10-30T08:44:04.123282318Z",
  "refresh_token": "tUzvTv7nigx1lm4h0m6fEcJByXVIBMqyfjHEI5U_5dY",
  "refresh_expires_at": "2026-11-29T08:29:04.122716963Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c702f2ad-8c3b-43bf-b8e1-8db4f02b914c",
  "session_id": "cd4aed88-d45e-4b6a-a1e4-db9416fdff3c",
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
  "phone": "+380631728176",
  "device_ref": "sandbox-23899"
}
```

```json
{
  "challenge_id": "8c8dd033-6137-451b-9407-33e4adbf9a0e",
  "expires_at": "2026-10-30T08:34:04.670337462Z",
  "resend_available_at": "2026-10-30T08:29:05.670337462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631728176` → **200**

```json
{
  "phone": "+380631728176",
  "audience": "CLIENT",
  "code": "401992",
  "sent_at": "2026-10-30T08:29:04.672621424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c8dd033-6137-451b-9407-33e4adbf9a0e",
  "code": "401992",
  "device_ref": "sandbox-23899"
}
```

```json
{
  "session_id": "965eb4c3-a4f1-4488-b3db-93840f02e6d1",
  "subject": {
    "type": "CLIENT",
    "id": "72a0cf75-255a-485d-8fd1-4de874cc0028"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmEwY2Y3NS0yNTVhLTQ4NWQtOGZkMS00ZGU4NzRjYzAwMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODQ0LCJpYXQiOjE3OTMzNDg5NDQsImp0aSI6IjFiNzRjZTM3LWQxY2MtNGZiMS1iNzg1LTZlZDE5ZmIyNzQwMiIsInNpZCI6Ijk2NWViNGMzLWE0ZjEtNDQ4OC1iM2RiLTkzODQwZjAyZTZkMSJ9.YP5yhKoKjtPzPnyGEHS8DRofBzNCMRK-66qna1foHT4",
  "access_expires_at": "2026-10-30T08:44:04.961519919Z",
  "refresh_token": "ItSp-kJ9CSKi8BVQvsJHl_myV-aMxzMtcw0InZdpLe0",
  "refresh_expires_at": "2026-11-29T08:29:04.960962716Z",
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
  "session_id": "1e9daed6-00b9-4b02-9d39-97d4d53bed33",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NDYsImlhdCI6MTc5MzM0ODk0NiwianRpIjoiMmEzMDIzYWUtOTMwNy00MzliLTg3NzQtNDhhYjNkMDQ2MGI0Iiwic2lkIjoiMWU5ZGFlZDYtMDBiOS00YjAyLTlkMzktOTdkNGQ1M2JlZDMzIn0.gZ3FpUfhEOzTgZrNlMpCsDXNrL65FKZlu-aNJR9xguo",
  "access_expires_at": "2026-10-30T08:44:06.115962809Z",
  "refresh_token": "P_Hx2l8k31erMIQm40zvjj5UE8IyvdisP_u9WcfF7OM",
  "refresh_expires_at": "2026-10-30T20:29:06.115454288Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631728176` → **200**

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
  "correlation_id": "d2c588a2-d70d-4f16-bca3-f21226c34bbd"
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
  "session_id": "b68f263d-9233-42d4-addb-9786229ae7fb",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NDcsImlhdCI6MTc5MzM0ODk0NywianRpIjoiM2U2MTRhMGItYzVlMi00YzBlLTljNWEtYTQ5NTA0YzYyMTVhIiwic2lkIjoiYjY4ZjI2M2QtOTIzMy00MmQ0LWFkZGItOTc4NjIyOWFlN2ZiIn0.LaHo82mMyqDJ2jQ4y2MmgPSqk6K5hea-tvpc8OsWURY",
  "access_expires_at": "2026-10-30T08:44:07.222335333Z",
  "refresh_token": "MjZMGBjTOjhoH7wy0fqHwgZPb8fL5b5b0UQ8tWYGB3Y",
  "refresh_expires_at": "2026-10-30T20:29:07.221837879Z",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:25:08.504002Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6a836453-bd40-4467-9460-eac461ac0adf",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:29:07.802285603Z"
}
```

## The rider books the airport for 2026-10-30T11:29:06Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600542297",
  "device_ref": "sandbox-4208"
}
```

```json
{
  "challenge_id": "f6592e11-acec-429d-8b7c-87bb1aefb8e8",
  "expires_at": "2026-10-30T08:34:08.064902598Z",
  "resend_available_at": "2026-10-30T08:29:09.064902598Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600542297` → **200**

```json
{
  "phone": "+48600542297",
  "audience": "CLIENT",
  "code": "480615",
  "sent_at": "2026-10-30T08:29:08.067263869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6592e11-acec-429d-8b7c-87bb1aefb8e8",
  "code": "480615",
  "device_ref": "sandbox-4208"
}
```

```json
{
  "session_id": "11502534-a31a-4e41-8f77-3f97912d804e",
  "subject": {
    "type": "CLIENT",
    "id": "5580e3c8-b2ba-482e-8783-85aba58503bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTgwZTNjOC1iMmJhLTQ4MmUtODc4My04NWFiYTU4NTAzYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODQ4LCJpYXQiOjE3OTMzNDg5NDgsImp0aSI6IjA1NTc1ZjY3LTk1ZTUtNGJlNC1iNzQ3LTIwMzE0MzlmN2M2ZiIsInNpZCI6IjExNTAyNTM0LWEzMWEtNGU0MS04Zjc3LTNmOTc5MTJkODA0ZSJ9.Re30Q68Cax0qdSJsaJ9WFBuyjx-bB-cBRUXdv8I_8KA",
  "access_expires_at": "2026-10-30T08:44:08.374754084Z",
  "refresh_token": "-6LA9DM6kvRV9h2186_LqwzIM4kBNz9Cuq0M7dk-VE0",
  "refresh_expires_at": "2026-11-29T08:29:08.374268627Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da5746d3-9198-42e6-9f54-eaa9f0914607",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:29:06Z"
}
```

```json
{
  "id": "23e9442a-c4c3-4f1a-8f2d-88bd09a66273",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:34:08.662612Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:29:06Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c2390532-c921-480e-9d3e-a1894a2f1558",
  "quote_id": "23e9442a-c4c3-4f1a-8f2d-88bd09a66273",
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
  "pickup_at": "2026-10-30T11:29:06Z"
}
```

```json
{
  "id": "78a4b970-c845-40af-8f13-c980acbca7b2",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5580e3c8-b2ba-482e-8783-85aba58503bd",
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
  "created_at": "2026-10-30T08:29:08.960192Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:29:06Z",
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
  "device_ref": "sandbox-4374"
}
```

```json
{
  "challenge_id": "637c45fd-0b8a-4a45-9c2c-a4823058b499",
  "expires_at": "2026-10-30T08:34:09.28146836Z",
  "resend_available_at": "2026-10-30T08:29:10.28146836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "320079",
  "sent_at": "2026-10-30T08:29:09.284442956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "637c45fd-0b8a-4a45-9c2c-a4823058b499",
  "code": "320079",
  "device_ref": "sandbox-4374"
}
```

```json
{
  "session_id": "3f585432-7fc4-4712-9e40-fa10f414ecbf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTg0OSwiaWF0IjoxNzkzMzQ4OTQ5LCJqdGkiOiI0YzVhMzUyNy04MzEwLTQ0NTktYWUzNS0yYTQ5YTQ3OGI1Y2IiLCJzaWQiOiIzZjU4NTQzMi03ZmM0LTQ3MTItOWU0MC1mYTEwZjQxNGVjYmYifQ.qJChqwF5KYf0XvB05DinLDwfF6ijEl7eBWARG1y90Zc",
  "access_expires_at": "2026-10-30T08:44:09.592366949Z",
  "refresh_token": "rlf7UwQ0jf9THA93ssU5Wxu48Tm9NLzGJ2tdvkg-05g",
  "refresh_expires_at": "2026-11-29T08:29:09.59192057Z",
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
  "command_id": "310aaf34-000e-43be-becc-46619e36f084",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:10Z",
    "sequence": 1793348950136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0c1753d3-631f-4b67-90c2-73b3cf7ac415",
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
  "last_heartbeat_at": "2026-10-30T08:29:10.15786Z",
  "last_location_at": "2026-10-30T08:29:10.15786Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "78a4b970-c845-40af-8f13-c980acbca7b2",
      "short_number": 24,
      "pickup_at": "2026-10-30T11:29:06Z",
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

`POST /api/driver/v1/preorders/78a4b970-c845-40af-8f13-c980acbca7b2/reserve` → **200**

```json
{
  "command_id": "2c60e400-ff39-4b0a-9491-ad9bff70a073"
}
```

```json
{
  "id": "d9a179d8-2015-46ef-a16c-2ebf58961bda",
  "state": "RESERVED",
  "order": {
    "order_id": "78a4b970-c845-40af-8f13-c980acbca7b2",
    "short_number": 24,
    "pickup_at": "2026-10-30T11:29:06Z",
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
  "reserved_at": "2026-10-30T08:29:10.721127Z",
  "confirm_from": "2026-10-30T10:59:06Z",
  "confirm_until": "2026-10-30T11:09:06Z",
  "drop_until": "2026-10-30T10:29:06Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d9a179d8-2015-46ef-a16c-2ebf58961bda",
      "state": "RESERVED",
      "order": {
        "order_id": "78a4b970-c845-40af-8f13-c980acbca7b2",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:29:06Z",
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
      "reserved_at": "2026-10-30T08:29:10.721127Z",
      "confirm_from": "2026-10-30T10:59:06Z",
      "confirm_until": "2026-10-30T11:09:06Z",
      "drop_until": "2026-10-30T10:29:06Z"
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
      "id": "d9a179d8-2015-46ef-a16c-2ebf58961bda",
      "state": "RESERVED",
      "order": {
        "order_id": "78a4b970-c845-40af-8f13-c980acbca7b2",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:29:06Z",
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
      "reserved_at": "2026-10-30T08:29:10.721127Z",
      "confirm_from": "2026-10-30T10:59:06Z",
      "confirm_until": "2026-10-30T11:09:06Z",
      "drop_until": "2026-10-30T10:29:06Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d9a179d8-2015-46ef-a16c-2ebf58961bda/confirm` → **409**

```json
{
  "command_id": "e4de84c3-b077-430f-81db-9ac018bbb2bd"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d9a179d8-2015-46ef-a16c-2ebf58961bda/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c0b4ef29-4b73-4f21-8fe2-f890a25e3099"
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
  "session_id": "7d12b73b-e6df-46ac-aecc-ac2cb2f5e366",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NTIsImlhdCI6MTc5MzM0ODk1MiwianRpIjoiOWZmMTVmZDMtMzBkNC00NjUyLThlMjMtODc5MThhMzhiMWFmIiwic2lkIjoiN2QxMmI3M2ItZTZkZi00NmFjLWFlY2MtYWMyY2IyZjVlMzY2In0.7B8S1dBvOznYu9BOEcGoiU8cBYHehGRYFU9kXbZJOuk",
  "access_expires_at": "2026-10-30T08:44:12.19003743Z",
  "refresh_token": "aLYNGgd5ZO43vEpxbQH4nBLILBavnrTDGJgUUMJPkio",
  "refresh_expires_at": "2026-10-30T20:29:12.189531502Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/78a4b970-c845-40af-8f13-c980acbca7b2` → **200**

```json
{
  "id": "78a4b970-c845-40af-8f13-c980acbca7b2",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5580e3c8-b2ba-482e-8783-85aba58503bd",
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
  "created_at": "2026-10-30T08:29:08.960192Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:29:06Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d9a179d8-2015-46ef-a16c-2ebf58961bda",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:29:10.721127Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/78a4b970-c845-40af-8f13-c980acbca7b2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:29:08.961273Z",
      "actor": {
        "type": "CLIENT",
        "id": "5580e3c8-b2ba-482e-8783-85aba58503bd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "78a4b970-c845-40af-8f13-c980acbca7b2",
        "preorder": true,
        "quote_id": "23e9442a-c4c3-4f1a-8f2d-88bd09a66273",
        "pickup_at": "2026-10-30T11:29:06Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ae96b253-18b8-448b-8492-ebd265e8a32c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:29:10.722181Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "78a4b970-c845-40af-8f13-c980acbca7b2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d9a179d8-2015-46ef-a16c-2ebf58961bda"
      },
      "correlation_id": "571a8c89-6cb1-4154-8d98-f6ca8c15c4b2"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 78a4b970-c845-40af-8f13-c980acbca7b2, reservation d9a179d8-2015-46ef-a16c-2ebf58961bda.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3687"
}
```

```json
{
  "challenge_id": "3910797b-d18a-4b6b-aad4-1a14f0696a0b",
  "expires_at": "2026-10-30T08:34:13.104204411Z",
  "resend_available_at": "2026-10-30T08:29:14.104204411Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "819485",
  "sent_at": "2026-10-30T08:29:13.107767828Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3910797b-d18a-4b6b-aad4-1a14f0696a0b",
  "code": "819485",
  "device_ref": "sandbox-3687"
}
```

```json
{
  "session_id": "93d921c3-2ad8-4cee-bbd6-8c0fc161f7d7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTg1MywiaWF0IjoxNzkzMzQ4OTUzLCJqdGkiOiJhMDNhZTM2ZC03MmNiLTRkZDItOTU0Yy05M2Q4MTQzYTAzOWIiLCJzaWQiOiI5M2Q5MjFjMy0yYWQ4LTRjZWUtYmJkNi04YzBmYzE2MWY3ZDcifQ.2Yev07Jvt7P33FAzlTP6UZ-99UvnyjdC_nVqKx1ezRM",
  "access_expires_at": "2026-10-30T08:44:13.433108372Z",
  "refresh_token": "DTZLJ7kStwySXOc6zgIA10qwuaLcLHpBz5G7fbrc7Mo",
  "refresh_expires_at": "2026-11-29T08:29:13.432618709Z",
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
  "command_id": "5e9ba271-6fb3-4bda-9481-912fbf5a77bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:13Z",
    "sequence": 1793348953952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:13.972503Z",
  "last_location_at": "2026-10-30T08:29:13.972503Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672478316",
  "device_ref": "sandbox-889"
}
```

```json
{
  "challenge_id": "a4120a3b-5549-4a86-9d3c-d4fa35ab41a9",
  "expires_at": "2026-10-30T08:34:14.23547312Z",
  "resend_available_at": "2026-10-30T08:29:15.23547312Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672478316` → **200**

```json
{
  "phone": "+380672478316",
  "audience": "CLIENT",
  "code": "890539",
  "sent_at": "2026-10-30T08:29:14.23863254Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4120a3b-5549-4a86-9d3c-d4fa35ab41a9",
  "code": "890539",
  "device_ref": "sandbox-889"
}
```

```json
{
  "session_id": "84758ace-3d51-45fa-a600-5396811b3f20",
  "subject": {
    "type": "CLIENT",
    "id": "f2a81bff-7114-4369-9489-3011536dd6ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMmE4MWJmZi03MTE0LTQzNjktOTQ4OS0zMDExNTM2ZGQ2ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODU0LCJpYXQiOjE3OTMzNDg5NTQsImp0aSI6IjkxMWNjMjU4LTM0MWItNDdkMy04MjE0LWY2ODU4ZDFjY2Q2OSIsInNpZCI6Ijg0NzU4YWNlLTNkNTEtNDVmYS1hNjAwLTUzOTY4MTFiM2YyMCJ9.TqGDk6ApvbqhSGfTaPb-Hjzno1Y29MiiuusAo0ePI7w",
  "access_expires_at": "2026-10-30T08:44:14.556120438Z",
  "refresh_token": "H9AnW2fo8TcsNdn_ALzoeJRs247IktZK0TaJnj2_p5M",
  "refresh_expires_at": "2026-11-29T08:29:14.555403699Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "485cc5ac-2cb5-4b6f-a174-bfd6344af682",
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
  "id": "1aea418d-a242-46e7-a851-1f2a21758a4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:34:14.829463Z",
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
  "command_id": "777c8937-1a27-42c7-87ae-1ab785fe8f21",
  "quote_id": "1aea418d-a242-46e7-a851-1f2a21758a4b",
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
  "id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f2a81bff-7114-4369-9489-3011536dd6ee",
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
  "created_at": "2026-10-30T08:29:15.133357Z",
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
    "id": "f3f1230d-8e77-4275-b876-5a2c0a7bcb68",
    "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
    "expires_at": "2026-10-30T08:29:30.13751Z",
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

`POST /api/driver/v1/offers/f3f1230d-8e77-4275-b876-5a2c0a7bcb68/accept` → **200**

```json
{
  "command_id": "869585d6-c09b-41c9-bad0-10db5edca151"
}
```

```json
{
  "id": "ce41db1b-a4fc-451b-a39f-51365251d376",
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb8b92e8-52ce-4457-8d55-7abd84a504fc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb8b92e8-52ce-4457-8d55-7abd84a504fc",
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "assignment_id": "ce41db1b-a4fc-451b-a39f-51365251d376",
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

`POST /api/driver/v1/work-sessions/f4e2aeff-1fea-4f69-a834-784c27b29754/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:16Z",
    "sequence": 1793348956245
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:16.264415Z",
  "last_location_at": "2026-10-30T08:29:16.264415Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb8b92e8-52ce-4457-8d55-7abd84a504fc",
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "assignment_id": "ce41db1b-a4fc-451b-a39f-51365251d376",
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

`POST /api/driver/v1/trips/fb8b92e8-52ce-4457-8d55-7abd84a504fc/arrive` → **200**

```json
{
  "command_id": "78bc3971-9749-495f-847f-b6697907f5a2",
  "expected_version": 0
}
```

```json
{
  "id": "fb8b92e8-52ce-4457-8d55-7abd84a504fc",
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "assignment_id": "ce41db1b-a4fc-451b-a39f-51365251d376",
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
  "arrived_at": "2026-10-30T08:29:16.808887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb8b92e8-52ce-4457-8d55-7abd84a504fc/start` → **200**

```json
{
  "command_id": "21ab8bc4-cdf5-4136-8a6a-b848723d32a5",
  "expected_version": 1
}
```

```json
{
  "id": "fb8b92e8-52ce-4457-8d55-7abd84a504fc",
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "assignment_id": "ce41db1b-a4fc-451b-a39f-51365251d376",
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
  "arrived_at": "2026-10-30T08:29:16.808887Z",
  "started_at": "2026-10-30T08:29:17.094027Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f4e2aeff-1fea-4f69-a834-784c27b29754/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:17Z",
    "sequence": 1793348957341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:17.361883Z",
  "last_location_at": "2026-10-30T08:29:17.361883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/fb8b92e8-52ce-4457-8d55-7abd84a504fc/complete` → **200**

```json
{
  "command_id": "1b207321-77a2-4e9b-bf33-c63116800bdf",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:29:17Z",
  "cash_received": true
}
```

```json
{
  "id": "fb8b92e8-52ce-4457-8d55-7abd84a504fc",
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "assignment_id": "ce41db1b-a4fc-451b-a39f-51365251d376",
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
  "arrived_at": "2026-10-30T08:29:16.808887Z",
  "started_at": "2026-10-30T08:29:17.094027Z",
  "completed_at": "2026-10-30T08:29:17.649901Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/666b43bd-6ac5-423e-b605-9a71efa0d0f5/rating` → **200**

```json
{
  "command_id": "552a9cdf-10d6-453d-b90a-778be51de57c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "score": 5,
  "created_at": "2026-10-30T08:29:17.9430163Z"
}
```

`POST /api/driver/v1/orders/666b43bd-6ac5-423e-b605-9a71efa0d0f5/rating` → **200**

```json
{
  "command_id": "d0518adf-fa39-42af-a81a-fde5acb76085",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
  "score": 4,
  "created_at": "2026-10-30T08:29:18.204707096Z"
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
  "session_id": "e20ecb4a-bf99-4a8a-b74e-5c4ecc10a909",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NTksImlhdCI6MTc5MzM0ODk1OSwianRpIjoiOTVlYjVmOTQtNjJmMC00ZWYyLTkyZWQtZDUzODlmOWU3N2I4Iiwic2lkIjoiZTIwZWNiNGEtYmY5OS00YThhLWI3NGUtNWM0ZWNjMTBhOTA5In0.4gL3VDhxdAGgpKuF-mJwypjMeGC5KrKYceibaUlx5pk",
  "access_expires_at": "2026-10-30T08:44:19.036808816Z",
  "refresh_token": "uQ9ifLRXNlHE3yQVgImfOqtz_aH44pnrgLbB85BdteI",
  "refresh_expires_at": "2026-10-30T20:29:19.036299674Z",
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
  "session_id": "0fac7b7d-5bda-4697-8449-83fbee6dcd30",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NTksImlhdCI6MTc5MzM0ODk1OSwianRpIjoiYmVjNTkxZTQtNDRlZS00Nzg0LWI5YjQtNTg2NDZkMTg0NGQyIiwic2lkIjoiMGZhYzdiN2QtNWJkYS00Njk3LTg0NDktODNmYmVlNmRjZDMwIn0.iLPFsWWs5P1EbGcO3sb2_UDS-oZPJ9CTqdpTqRrTRwg",
  "access_expires_at": "2026-10-30T08:44:19.601619834Z",
  "refresh_token": "1A-0S9kJF_sfoI_UTcaEfyxtDTHKs_ZL5aAk7qJJK0o",
  "refresh_expires_at": "2026-10-30T20:29:19.601076441Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/666b43bd-6ac5-423e-b605-9a71efa0d0f5/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
      "author_type": "RIDER",
      "author_id": "f2a81bff-7114-4369-9489-3011536dd6ee",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:29:17.943016Z"
    },
    {
      "order_id": "666b43bd-6ac5-423e-b605-9a71efa0d0f5",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "f2a81bff-7114-4369-9489-3011536dd6ee",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:29:18.204707Z"
    }
  ]
}
```

Done: ratings for order 666b43bd-6ac5-423e-b605-9a71efa0d0f5.

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
  "session_id": "8e181d0c-ec0e-4998-8eca-26fb4a3bfae5",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NjAsImlhdCI6MTc5MzM0ODk2MCwianRpIjoiZGQ4YzQ1YTAtNzZhMy00YmZhLWIzNzMtOWJiMWExMjNmZGQzIiwic2lkIjoiOGUxODFkMGMtZWMwZS00OTk4LThlY2EtMjZmYjRhM2JmYWU1In0.cGSk7qK1nzXRu33LK7d2RSXkEs8l5rydD51kVnRiZGk",
  "access_expires_at": "2026-10-30T08:44:20.441811109Z",
  "refresh_token": "N9TkyTd1doXsgMyU45IMDlcTkIGL0OaeuvLp9oGz7GQ",
  "refresh_expires_at": "2026-10-30T20:29:20.441371549Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "be52a362-40f4-4fc6-9829-db46f80bb6df",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:20.692623Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e` → **200**

```json
{
  "id": "2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:20.692623Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e` → **200**

```json
{
  "id": "2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:20.692623Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e` → **200**

```json
{
  "id": "2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:20.692623Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e` → **200**

```json
{
  "id": "2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:29:20.692623Z",
  "ready_at": "2026-10-30T08:29:24.703714Z",
  "expires_at": "2026-10-31T08:29:24.703714Z"
}
```

`GET /api/admin/v1/reports/exports/2c5e233c-d032-4ac2-8ab5-ceafb1d45a3e/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "75ee654f-cb51-4228-93d1-392d5e0da314",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "7c96e7f0-b2cc-42ad-bc34-344f1293f3cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:25.043035Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c96e7f0-b2cc-42ad-bc34-344f1293f3cf` → **200**

```json
{
  "id": "7c96e7f0-b2cc-42ad-bc34-344f1293f3cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:25.043035Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c96e7f0-b2cc-42ad-bc34-344f1293f3cf` → **200**

```json
{
  "id": "7c96e7f0-b2cc-42ad-bc34-344f1293f3cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:25.043035Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c96e7f0-b2cc-42ad-bc34-344f1293f3cf` → **200**

```json
{
  "id": "7c96e7f0-b2cc-42ad-bc34-344f1293f3cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:25.043035Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c96e7f0-b2cc-42ad-bc34-344f1293f3cf` → **200**

```json
{
  "id": "7c96e7f0-b2cc-42ad-bc34-344f1293f3cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:29:25.043035Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c96e7f0-b2cc-42ad-bc34-344f1293f3cf` → **200**

```json
{
  "id": "7c96e7f0-b2cc-42ad-bc34-344f1293f3cf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:29:25.043035Z",
  "ready_at": "2026-10-30T08:29:29.712412Z",
  "expires_at": "2026-10-31T08:29:29.712412Z"
}
```

`GET /api/admin/v1/reports/exports/7c96e7f0-b2cc-42ad-bc34-344f1293f3cf/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/93a5b58e-c00c-4cde-9f13-32a5b8bee448` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/93a5b58e-c00c-4cde-9f13-32a5b8bee448",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "732d8de2-d914-4d7d-8953-4e8efbe1c68c"
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
  "device_ref": "sandbox-25215"
}
```

```json
{
  "challenge_id": "9effa2e1-ce81-4864-959b-85dd5b2ca2b6",
  "expires_at": "2026-10-30T08:34:30.964510115Z",
  "resend_available_at": "2026-10-30T08:29:31.964510115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "322262",
  "sent_at": "2026-10-30T08:29:30.967427436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9effa2e1-ce81-4864-959b-85dd5b2ca2b6",
  "code": "322262",
  "device_ref": "sandbox-25215"
}
```

```json
{
  "session_id": "e99c84e4-c7e6-46b8-8aa7-66ae4bb96df6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTg3MSwiaWF0IjoxNzkzMzQ4OTcxLCJqdGkiOiIxZDcxYzZkNy1hNDAyLTQ1NTUtODYyMS01ZGYxODNiMDkzZWUiLCJzaWQiOiJlOTljODRlNC1jN2U2LTQ2YjgtOGFhNy02NmFlNGJiOTZkZjYifQ.bfcdzRWoJzbLUEC8aM4c5BWIeijiDo4NcibhL6ABns0",
  "access_expires_at": "2026-10-30T08:44:31.273776875Z",
  "refresh_token": "B3u0e9EcSa2HTzIfPt03tnaeMKaP5zNejhpxmu8Z4BE",
  "refresh_expires_at": "2026-11-29T08:29:31.273313039Z",
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
  "command_id": "27d8bf5e-8e3a-41c7-a6b1-0482602cbaee",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:32Z",
    "sequence": 1793348972725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "407684be-cd19-44e6-a918-77f8c562328e",
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
  "last_heartbeat_at": "2026-10-30T08:29:32.094122Z",
  "last_location_at": "2026-10-30T08:29:32.094122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "d865b910-f4f4-49fb-a6f6-f21271e1e6f1",
  "points": [
    {
      "sequence": 1793348974381,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:28:34Z"
    },
    {
      "sequence": 1793348974388,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:29:34Z"
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
  "session_id": "0c0fccdb-c1fc-487a-9652-e2f5366e8679",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NzUsImlhdCI6MTc5MzM0ODk3NSwianRpIjoiZTJmNDQ4MTAtYjdhMy00ZDhmLWJhNzctMWMyY2UyODY2MmY4Iiwic2lkIjoiMGMwZmNjZGItYzFmYy00ODdhLTk2NTItZTJmNTM2NmU4Njc5In0.YSTSuHfD-xpPC1gwvl0YNQ-xjBjCTKM2GCTZDlSeFls",
  "access_expires_at": "2026-10-30T08:44:35.027277592Z",
  "refresh_token": "D5Jw7Y-u0dTK4gGAyWgA-QXd1hqC3Atrgc6WEOp6GG0",
  "refresh_expires_at": "2026-10-30T20:29:35.026828849Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "026eedbd-6103-431e-88de-a3416a83fc43",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:29:34Z",
        "track_point_id": "c8f499a1-7a47-4bb0-bf1e-4c8b21dd8b20",
        "work_session_id": "407684be-cd19-44e6-a918-77f8c562328e"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:29:34Z",
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

`POST /api/admin/v1/driver-risk-flags/026eedbd-6103-431e-88de-a3416a83fc43/confirm` → **200**

```json
{
  "command_id": "34373228-4606-4121-86b4-843eb7a1c7de",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "026eedbd-6103-431e-88de-a3416a83fc43",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:29:34Z",
    "track_point_id": "c8f499a1-7a47-4bb0-bf1e-4c8b21dd8b20",
    "work_session_id": "407684be-cd19-44e6-a918-77f8c562328e"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:29:34Z",
  "reason": null,
  "reviewed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reviewed_at": "2026-10-30T08:29:35.859555Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/026eedbd-6103-431e-88de-a3416a83fc43/dismiss` → **409**

```json
{
  "command_id": "33793f01-9ffb-4ee1-b093-c7c2f4cd432d",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/026eedbd-6103-431e-88de-a3416a83fc43/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3e2c87e8-2d07-4c64-81d3-872e51a68a52"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e971de82-b656-4092-bfb6-61acf43ff2ab",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "54f649fd-47e0-4716-9dd3-3c1def2b14d0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "raised_at": "2026-10-30T08:29:36.44301Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/54f649fd-47e0-4716-9dd3-3c1def2b14d0/dismiss` → **200**

```json
{
  "command_id": "280cc1ae-83cc-4a29-b573-95fb85d805c0",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "54f649fd-47e0-4716-9dd3-3c1def2b14d0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "raised_at": "2026-10-30T08:29:36.44301Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reviewed_at": "2026-10-30T08:29:36.728304Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "903a94e0-de75-4a6d-95e8-60bb2c0a87e3",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "026eedbd-6103-431e-88de-a3416a83fc43"
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
      "actor_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:29:37.021328Z"
    }
  ]
}
```

Done: flag 026eedbd-6103-431e-88de-a3416a83fc43 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "854d999c-6900-4aed-b067-bbfb8d2ee3a7",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NzcsImlhdCI6MTc5MzM0ODk3NywianRpIjoiODhlMzY3YWYtNGNkMC00YzYyLWJiNTQtNzY0ZmUyMjBhZDg4Iiwic2lkIjoiODU0ZDk5OWMtNjkwMC00YWVkLWIwNjctYmJmYjhkMmVlM2E3In0.wrqQajzWmCKDvDI3GUxGIiKc_2EVBRPBuSgCU5lT-vQ",
  "access_expires_at": "2026-10-30T08:44:37.839226122Z",
  "refresh_token": "DHupsJiTYdKcfBn_3JMARYsuGveAOHC3HZaJY546rFI",
  "refresh_expires_at": "2026-10-30T20:29:37.838663851Z",
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
      "actor_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:29:37.021328Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "bf5ba45d-58d4-45e2-884a-82f2b2af7fae",
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
  "session_id": "407684be-cd19-44e6-a918-77f8c562328e",
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
  "last_heartbeat_at": "2026-10-30T08:29:32.094122Z",
  "last_location_at": "2026-10-30T08:29:32.094122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/407684be-cd19-44e6-a918-77f8c562328e/close` → **200**

```json
{
  "command_id": "9550248f-8c6d-4e7a-ac3e-c9699acfa6d2",
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
  "session_id": "4b172551-39b5-456b-b7c8-827ae674e230",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4NzksImlhdCI6MTc5MzM0ODk3OSwianRpIjoiYmE0MDJjYmUtOGYxMS00MWFlLWJhNDAtNDVmMmMwMzE5MzExIiwic2lkIjoiNGIxNzI1NTEtMzliNS00NTZiLWI3YzgtODI3YWU2NzRlMjMwIn0.QrvApyOem7a7W-ouiDSjFz6swW2Umlb3nLkrTPrfUWw",
  "access_expires_at": "2026-10-30T08:44:39.621745691Z",
  "refresh_token": "O14Fp5ZiO15eGll3rLfDe6_awYkdmkrHuSahJKO_OoU",
  "refresh_expires_at": "2026-10-30T20:29:39.621273874Z",
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
  "command_id": "472363ae-965d-4095-a73a-d9b9dfcbbb56",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:29:40.162403Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "472363ae-965d-4095-a73a-d9b9dfcbbb56",
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
  "changed_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:29:40.162403Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48726135098",
  "device_ref": "sandbox-10671"
}
```

```json
{
  "challenge_id": "c01e2756-a372-45e0-ac5c-283274baf113",
  "expires_at": "2026-10-30T08:34:40.731837118Z",
  "resend_available_at": "2026-10-30T08:29:41.731837118Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48726135098` → **200**

```json
{
  "phone": "+48726135098",
  "audience": "CLIENT",
  "code": "703237",
  "sent_at": "2026-10-30T08:29:40.73524632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c01e2756-a372-45e0-ac5c-283274baf113",
  "code": "703237",
  "device_ref": "sandbox-10671"
}
```

```json
{
  "session_id": "49d68f47-201b-417f-b056-766906788b45",
  "subject": {
    "type": "CLIENT",
    "id": "721f095e-3486-4651-b658-f76a48120286"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjFmMDk1ZS0zNDg2LTQ2NTEtYjY1OC1mNzZhNDgxMjAyODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODgxLCJpYXQiOjE3OTMzNDg5ODEsImp0aSI6IjBlYmI3ZmJmLTg0NTMtNGFlMy1hMzhlLWRkYzhkNzhmMTNmYSIsInNpZCI6IjQ5ZDY4ZjQ3LTIwMWItNDE3Zi1iMDU2LTc2NjkwNjc4OGI0NSJ9.najuDimfbMItFRjdISj_V1ecUlPaJfy0WHRBr550Nos",
  "access_expires_at": "2026-10-30T08:44:41.022338567Z",
  "refresh_token": "PlKd6UkmKpt9nlPiZu8zK7pCCywtvM9lYPunuOFPPCk",
  "refresh_expires_at": "2026-11-29T08:29:41.021937364Z",
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
  "correlation_id": "6b42334a-1fad-4782-84b9-e6b3a4f4b110"
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
  "device_ref": "sandbox-10606"
}
```

```json
{
  "challenge_id": "fb39c428-41f7-4504-af84-fba644e11430",
  "expires_at": "2026-10-30T08:34:41.81473947Z",
  "resend_available_at": "2026-10-30T08:29:42.81473947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "830065",
  "sent_at": "2026-10-30T08:29:41.817156735Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb39c428-41f7-4504-af84-fba644e11430",
  "code": "830065",
  "device_ref": "sandbox-10606"
}
```

```json
{
  "session_id": "52c167cc-df3e-48b7-b493-61c6f0865d6d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTg4MiwiaWF0IjoxNzkzMzQ4OTgyLCJqdGkiOiIzMTMzZTk4ZC1kYTI0LTQ4NzItYjY5OC0xNmQyZmVkZGQ4ZjUiLCJzaWQiOiI1MmMxNjdjYy1kZjNlLTQ4YjctYjQ5My02MWM2ZjA4NjVkNmQifQ.O5uq1qtrnPIgegSTYkuDrlO0bkmsEyml7BvwoWLt_VM",
  "access_expires_at": "2026-10-30T08:44:42.096299525Z",
  "refresh_token": "J28LhVO6mIA-ywIhMHsCc8FsMVO_Em1K0y3AiG-m0Og",
  "refresh_expires_at": "2026-11-29T08:29:42.09581627Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0c1753d3-631f-4b67-90c2-73b3cf7ac415",
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
  "last_heartbeat_at": "2026-10-30T08:29:10.15786Z",
  "last_location_at": "2026-10-30T08:29:10.15786Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0c1753d3-631f-4b67-90c2-73b3cf7ac415/handover` → **200**

```json
{
  "command_id": "2d642af5-2dad-464d-856a-76ca57eb6d9b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0c1753d3-631f-4b67-90c2-73b3cf7ac415",
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
  "last_heartbeat_at": "2026-10-30T08:29:10.15786Z",
  "last_location_at": "2026-10-30T08:29:10.15786Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0c1753d3-631f-4b67-90c2-73b3cf7ac415/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:42Z",
    "sequence": 1793348982874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0c1753d3-631f-4b67-90c2-73b3cf7ac415",
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
  "last_heartbeat_at": "2026-10-30T08:29:42.893658Z",
  "last_location_at": "2026-10-30T08:29:42.893658Z",
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
  "session_id": "0c1753d3-631f-4b67-90c2-73b3cf7ac415",
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
  "last_heartbeat_at": "2026-10-30T08:29:42.893658Z",
  "last_location_at": "2026-10-30T08:29:42.893658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c1753d3-631f-4b67-90c2-73b3cf7ac415/close` → **200**

```json
{
  "command_id": "671ae348-0704-4645-952e-f355735b8ff6",
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
  "correlation_id": "3facf05d-a0cf-4637-b157-8d497edb5edd"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678997672",
  "device_ref": "sandbox-18312"
}
```

```json
{
  "challenge_id": "21ca10c5-dc4a-42d7-b7cf-c16ebda0652d",
  "expires_at": "2026-10-30T08:34:44.223163506Z",
  "resend_available_at": "2026-10-30T08:29:45.223163506Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678997672` → **200**

```json
{
  "phone": "+380678997672",
  "audience": "CLIENT",
  "code": "176867",
  "sent_at": "2026-10-30T08:29:44.225884671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21ca10c5-dc4a-42d7-b7cf-c16ebda0652d",
  "code": "176867",
  "device_ref": "sandbox-18312"
}
```

```json
{
  "session_id": "34012242-ef3f-4054-a54b-979de0096a12",
  "subject": {
    "type": "CLIENT",
    "id": "39bf01d1-1a59-418e-9027-8aa8899c0064"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWJmMDFkMS0xYTU5LTQxOGUtOTAyNy04YWE4ODk5YzAwNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODg0LCJpYXQiOjE3OTMzNDg5ODQsImp0aSI6IjU1Nzg5NjFmLWE2OTEtNDQ0Yi05ZDVmLTQ5MzIwN2U5MGQ5OCIsInNpZCI6IjM0MDEyMjQyLWVmM2YtNDA1NC1hNTRiLTk3OWRlMDA5NmExMiJ9.SbT6xv-YDpZnWwHEtwCPRJQ0n4x_4THtsEhmfC9c2fo",
  "access_expires_at": "2026-10-30T08:44:44.506721872Z",
  "refresh_token": "n05wSLhlYAs5Wkdh92pfx0yFQbBYycCeKGAu8F8hYds",
  "refresh_expires_at": "2026-11-29T08:29:44.506252758Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "90e72f92-984e-4b30-a3f8-a5dae1f11ff7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1be6a4f8-1b90-4489-b96f-6d1505320e0f",
  "upload_path": "/api/rider/v1/uploads/1be6a4f8-1b90-4489-b96f-6d1505320e0f",
  "expires_at": "2026-10-30T08:44:44.768758698Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/1be6a4f8-1b90-4489-b96f-6d1505320e0f` → **200**

```json
{
  "file_id": "1be6a4f8-1b90-4489-b96f-6d1505320e0f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "5d92d586-37e8-497a-877a-e040d2826b28",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "1be6a4f8-1b90-4489-b96f-6d1505320e0f"
  ]
}
```

```json
{
  "id": "fcd71c68-7bb4-4812-a447-45c1ac39eec5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:29:45.112066Z",
  "updated_at": "2026-10-30T08:29:45.112066Z",
  "respond_by": "2026-10-30T12:29:45.112066Z",
  "messages": [
    {
      "id": "4386d542-ad53-4572-a588-da1b736949d8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:29:45.113064Z",
      "attachments": [
        {
          "file_id": "1be6a4f8-1b90-4489-b96f-6d1505320e0f",
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
  "session_id": "73b278e3-6822-40fd-9f54-218eed371482",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4ODUsImlhdCI6MTc5MzM0ODk4NSwianRpIjoiNjM2YzgyZjQtMTkyMi00NGUxLTkxNjUtOTMyNDg2ZTlhZjIyIiwic2lkIjoiNzNiMjc4ZTMtNjgyMi00MGZkLTlmNTQtMjE4ZWVkMzcxNDgyIn0.VRw8uiRCvEdlysMVxc7kkqrCiKgeAT3k8aGX_tXJOuM",
  "access_expires_at": "2026-10-30T08:44:45.682926033Z",
  "refresh_token": "kzNsxM5619bqwGGC4CtOcmjE7q2eoomFMaBoQd-8_V4",
  "refresh_expires_at": "2026-10-30T20:29:45.682446464Z",
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
  "session_id": "d6b3a9ab-25a7-45ef-8990-be937c3ddc68",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4ODYsImlhdCI6MTc5MzM0ODk4NiwianRpIjoiODcyYjdkNDktZjEzMi00ZGZiLWExMDUtYWMyMGY5ZjRmYTY1Iiwic2lkIjoiZDZiM2E5YWItMjVhNy00NWVmLTg5OTAtYmU5MzdjM2RkYzY4In0.fQtjPyLiSEdm7Gg18uZbSKzJbKLWFTzCjm4gAJL2bi0",
  "access_expires_at": "2026-10-30T08:44:46.24798828Z",
  "refresh_token": "e3bv_vlKjGypyel2F5eCWmLpzjjmJd3nYMTyRhNXhx0",
  "refresh_expires_at": "2026-10-30T20:29:46.247513879Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/fcd71c68-7bb4-4812-a447-45c1ac39eec5/attachments/1be6a4f8-1b90-4489-b96f-6d1505320e0f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "de8ec332-1283-44b1-b5fb-ab810495d701",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8c02c079-6eaa-4d84-a30d-9a5dec3d270c",
  "upload_path": "/api/operator/v1/uploads/8c02c079-6eaa-4d84-a30d-9a5dec3d270c",
  "expires_at": "2026-10-30T08:44:46.525237899Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/8c02c079-6eaa-4d84-a30d-9a5dec3d270c` → **200**

```json
{
  "file_id": "8c02c079-6eaa-4d84-a30d-9a5dec3d270c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/fcd71c68-7bb4-4812-a447-45c1ac39eec5` → **200**

```json
{
  "id": "fcd71c68-7bb4-4812-a447-45c1ac39eec5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:29:45.112066Z",
  "updated_at": "2026-10-30T08:29:45.112066Z",
  "respond_by": "2026-10-30T12:29:45.112066Z",
  "messages": [
    {
      "id": "4386d542-ad53-4572-a588-da1b736949d8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:29:45.113064Z",
      "attachments": [
        {
          "file_id": "1be6a4f8-1b90-4489-b96f-6d1505320e0f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/fcd71c68-7bb4-4812-a447-45c1ac39eec5/comments` → **200**

```json
{
  "command_id": "7bcdb06f-bfe7-4865-811a-bbcf07a41076",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "8c02c079-6eaa-4d84-a30d-9a5dec3d270c"
  ]
}
```

```json
{
  "id": "fcd71c68-7bb4-4812-a447-45c1ac39eec5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:29:45.112066Z",
  "updated_at": "2026-10-30T08:29:47.135177Z",
  "respond_by": "2026-10-30T12:29:45.112066Z",
  "messages": [
    {
      "id": "4386d542-ad53-4572-a588-da1b736949d8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:29:45.113064Z",
      "attachments": [
        {
          "file_id": "1be6a4f8-1b90-4489-b96f-6d1505320e0f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1ad307f7-c3c5-4c04-9fba-283a12fbacc9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:29:47.134603Z",
      "attachments": [
        {
          "file_id": "8c02c079-6eaa-4d84-a30d-9a5dec3d270c",
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

`GET /api/rider/v1/support/cases/fcd71c68-7bb4-4812-a447-45c1ac39eec5` → **200**

```json
{
  "id": "fcd71c68-7bb4-4812-a447-45c1ac39eec5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:29:45.112066Z",
  "updated_at": "2026-10-30T08:29:47.135177Z",
  "respond_by": "2026-10-30T12:29:45.112066Z",
  "messages": [
    {
      "id": "4386d542-ad53-4572-a588-da1b736949d8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "39bf01d1-1a59-418e-9027-8aa8899c0064",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:29:45.113064Z",
      "attachments": [
        {
          "file_id": "1be6a4f8-1b90-4489-b96f-6d1505320e0f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1ad307f7-c3c5-4c04-9fba-283a12fbacc9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:29:47.134603Z",
      "attachments": [
        {
          "file_id": "8c02c079-6eaa-4d84-a30d-9a5dec3d270c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/fcd71c68-7bb4-4812-a447-45c1ac39eec5/attachments/8c02c079-6eaa-4d84-a30d-9a5dec3d270c` → **200**

Done: support case fcd71c68-7bb4-4812-a447-45c1ac39eec5, rider attachment 1be6a4f8-1b90-4489-b96f-6d1505320e0f, operator attachment 8c02c079-6eaa-4d84-a30d-9a5dec3d270c.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731059977",
  "device_ref": "sandbox-1019"
}
```

```json
{
  "challenge_id": "81d1a26f-4bfd-4d7b-a4ac-3ee9383c6295",
  "expires_at": "2026-10-30T08:34:47.758990068Z",
  "resend_available_at": "2026-10-30T08:29:48.758990068Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731059977` → **200**

```json
{
  "phone": "+380731059977",
  "audience": "CLIENT",
  "code": "996102",
  "sent_at": "2026-10-30T08:29:47.761339139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81d1a26f-4bfd-4d7b-a4ac-3ee9383c6295",
  "code": "996102",
  "device_ref": "sandbox-1019"
}
```

```json
{
  "session_id": "58326a09-be12-40d3-9f11-7e0259e0c32a",
  "subject": {
    "type": "CLIENT",
    "id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NzEyOGViYy0yYmI0LTRmNWMtODk2OC05YzRmNzk5Y2IwMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5ODg4LCJpYXQiOjE3OTMzNDg5ODgsImp0aSI6IjJmNjcyYTA3LTcwZTItNDdkOC1hMTA1LWQ3ZjViYmE5OWJlMCIsInNpZCI6IjU4MzI2YTA5LWJlMTItNDBkMy05ZjExLTdlMDI1OWUwYzMyYSJ9.wcPn7pSCHDBNXd4wyuGof96LOTn0eIRMh9NQqDpr3Z4",
  "access_expires_at": "2026-10-30T08:44:48.049012014Z",
  "refresh_token": "BQGkD0Ma7uXaSBOYKKryxlTtYNzc9Ul4UIvc8v7S-UE",
  "refresh_expires_at": "2026-11-29T08:29:48.048418923Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bcdde0c4-3c58-41a8-9bb5-54b25fea3736",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1c9f204e-579c-4f9f-965b-b27adf19885b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1c9f204e-579c-4f9f-965b-b27adf19885b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "367ecd83cebe43cfd130117a69781af7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1c9f204e-579c-4f9f-965b-b27adf19885b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731059977"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1c9f204e-579c-4f9f-965b-b27adf19885b",
  "expires_at": "2026-10-30T08:59:48.333373Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/1c9f204e-579c-4f9f-965b-b27adf19885b` → **200**

```json
{
  "id": "1c9f204e-579c-4f9f-965b-b27adf19885b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:59:48.333373Z",
  "card": {
    "id": "a546ee22-8f02-489a-aa46-39b255fec332",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5781",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:29:48.620348Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "01a23e91-c9cb-48d4-9060-c534b4804daf",
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
  "id": "06fc00f2-05f8-4d44-974a-1d127e364406",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:34:48.906018Z",
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
  "command_id": "5183387c-a65c-4b8c-87f8-b5469830c70d",
  "quote_id": "06fc00f2-05f8-4d44-974a-1d127e364406",
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
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc` → **200**

```json
{
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc` → **200**

```json
{
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
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

`GET /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc` → **200**

```json
{
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc/switch-to-cash` → **200**

```json
{
  "command_id": "66826f1f-c0dd-4b78-8d17-e22fc46bd947",
  "expected_version": 3
}
```

```json
{
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc/switch-to-cash` → **409**

```json
{
  "command_id": "19399b60-3fc8-4d65-a237-1025ba4a66b0",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "da31e474-8082-4b5c-9aaa-1707915198d3"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc` → **200**

```json
{
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc/cancel` → **200**

```json
{
  "command_id": "2f23bae4-34d2-42e1-b587-5f41f3e93946",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7dc0a9c6-6ba3-40b5-9a99-20adeb4d0ecc",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "67128ebc-2bb4-4f5c-8968-9c4f799cb039",
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
  "created_at": "2026-10-30T08:29:49.196898Z",
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
  "session_id": "633306c1-2efd-4581-b617-4e328ead782c",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4OTIsImlhdCI6MTc5MzM0ODk5MiwianRpIjoiYmZjYjgwZTEtMDI3YS00YWY3LTkwOTAtNzVjMzFlOTJkZjM0Iiwic2lkIjoiNjMzMzA2YzEtMmVmZC00NTgxLWI2MTctNGUzMjhlYWQ3ODJjIn0.0e_7cAu-Rb9ftMcaV2qQCroZpzxPfQFUepTmtWM1sqw",
  "access_expires_at": "2026-10-30T08:44:52.837623622Z",
  "refresh_token": "ieIlxA-jZCZTu7XrinJwmwOVnzCvpSrVMpv4gS02KzQ",
  "refresh_expires_at": "2026-10-30T20:29:52.837130744Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30221"
}
```

```json
{
  "challenge_id": "a5e69903-f7d0-409b-be87-d8a100bd970f",
  "expires_at": "2026-10-30T08:34:53.102668764Z",
  "resend_available_at": "2026-10-30T08:29:54.102668764Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "851511",
  "sent_at": "2026-10-30T08:29:53.105165323Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5e69903-f7d0-409b-be87-d8a100bd970f",
  "code": "851511",
  "device_ref": "sandbox-30221"
}
```

```json
{
  "session_id": "59753232-523f-4339-9685-8649f91e36a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTg5MywiaWF0IjoxNzkzMzQ4OTkzLCJqdGkiOiI4ZTczMDJhYS1kNjkyLTRjZTQtOTE0My1iZjI3M2MxMTcxNWQiLCJzaWQiOiI1OTc1MzIzMi01MjNmLTQzMzktOTY4NS04NjQ5ZjkxZTM2YTgifQ.0929kxbirJgtg-KcGqO4eEl2LdrItNGAAmPNLKaZLwc",
  "access_expires_at": "2026-10-30T08:44:53.400407278Z",
  "refresh_token": "kqyd7UepTzHbIDWkQNvbSmkH5ajbNGc2kmQNNNCty7E",
  "refresh_expires_at": "2026-11-29T08:29:53.399878707Z",
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
      "actor_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:29:37.021328Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:29:38.409133Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "a049fe32-f671-484c-8057-a200ed9b7c6c",
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
  "device_ref": "sandbox-13675"
}
```

```json
{
  "challenge_id": "b078c55d-3eee-4771-aab9-90dc9c5f7894",
  "expires_at": "2026-10-30T08:34:54.543593964Z",
  "resend_available_at": "2026-10-30T08:29:55.543593964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "883430",
  "sent_at": "2026-10-30T08:29:54.546137553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b078c55d-3eee-4771-aab9-90dc9c5f7894",
  "code": "883430",
  "device_ref": "sandbox-13675"
}
```

```json
{
  "session_id": "49f7bfbc-af73-4cdc-a6e5-5677ef479e51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTg5NCwiaWF0IjoxNzkzMzQ4OTk0LCJqdGkiOiI1OGZjYjYyYy0zMDY3LTQ2YTUtYTRiNC1lMTI2N2JmYzEzOTkiLCJzaWQiOiI0OWY3YmZiYy1hZjczLTRjZGMtYTZlNS01Njc3ZWY0NzllNTEifQ.uwcI9RpZtZ2d5t3LsFXMzrS4zft_MpJmRNb8eb8F8pc",
  "access_expires_at": "2026-10-30T08:44:54.845085343Z",
  "refresh_token": "6H6mhfW0Ss3akIrDffqkjgt5fEB_ZHvJ1SyZAq72LrM",
  "refresh_expires_at": "2026-11-29T08:29:54.844599095Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:17.361883Z",
  "last_location_at": "2026-10-30T08:29:17.361883Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4e2aeff-1fea-4f69-a834-784c27b29754/handover` → **200**

```json
{
  "command_id": "0c6e44cf-97d9-404b-9fcf-d1f937304428",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:17.361883Z",
  "last_location_at": "2026-10-30T08:29:17.361883Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4e2aeff-1fea-4f69-a834-784c27b29754/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:55Z",
    "sequence": 1793348995676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:55.694893Z",
  "last_location_at": "2026-10-30T08:29:55.694893Z",
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
  "command_id": "fa6cad62-5079-4bdb-9b6e-9bf8b36977e1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:56Z",
    "sequence": 1793348996224
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f6d651f-faeb-41ea-81bf-89cb877ae5da",
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
  "last_heartbeat_at": "2026-10-30T08:29:56.244004Z",
  "last_location_at": "2026-10-30T08:29:56.244004Z",
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
  "session_id": "3daf503c-ee98-4ae9-b667-b0c73aa20127",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDk4OTYsImlhdCI6MTc5MzM0ODk5NiwianRpIjoiMDc4ZmU4MTQtNDc1Ni00YzQ0LWI4ZjItMWE1MjcxODRhMTA2Iiwic2lkIjoiM2RhZjUwM2MtZWU5OC00YWU5LWI2NjctYjBjNzNhYTIwMTI3In0.d-oI0JoTDmrVdWj1M-shpaPaKw-wLR7crAfhAmcG5ak",
  "access_expires_at": "2026-10-30T08:44:56.806731637Z",
  "refresh_token": "VfOTmgr-ApkSJ5f0u48zGK_vcgGGk7xKRLrrIKLIbi8",
  "refresh_expires_at": "2026-10-30T20:29:56.806183166Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7ba4c478-ecd9-4805-92bf-55db2c6304e7",
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
  "id": "1392d027-3302-4003-81bd-859e3ad7be0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:34:57.092682Z",
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
  "command_id": "a6ca90a2-4841-46c1-a2a9-2a1519623ea3",
  "quote_id": "1392d027-3302-4003-81bd-859e3ad7be0a",
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
  "id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
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
  "created_at": "2026-10-30T08:29:57.387657Z",
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
    "id": "80beda22-4c20-42ff-86a1-0d3b2373386b",
    "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
    "expires_at": "2026-10-30T08:30:12.391031Z",
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

`POST /api/driver/v1/offers/80beda22-4c20-42ff-86a1-0d3b2373386b/accept` → **200**

```json
{
  "command_id": "850a2aa9-7f2a-4c25-8ebe-8f0e13aab0c5"
}
```

```json
{
  "id": "032842ee-482e-47bf-996b-48c7d5296478",
  "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "98d9f455-f307-4b14-b0df-e99fe258f989",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98d9f455-f307-4b14-b0df-e99fe258f989",
  "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
  "assignment_id": "032842ee-482e-47bf-996b-48c7d5296478",
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

`POST /api/driver/v1/work-sessions/6f6d651f-faeb-41ea-81bf-89cb877ae5da/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:29:58Z",
    "sequence": 1793348998809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f6d651f-faeb-41ea-81bf-89cb877ae5da",
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
  "last_heartbeat_at": "2026-10-30T08:29:58.831205Z",
  "last_location_at": "2026-10-30T08:29:58.831205Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/98d9f455-f307-4b14-b0df-e99fe258f989/arrive` → **200**

```json
{
  "command_id": "b4fd5a88-e548-49bc-a259-afe1ccb12ffc",
  "expected_version": 0
}
```

```json
{
  "id": "98d9f455-f307-4b14-b0df-e99fe258f989",
  "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
  "assignment_id": "032842ee-482e-47bf-996b-48c7d5296478",
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
  "arrived_at": "2026-10-30T08:29:59.108759Z",
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

`POST /api/driver/v1/trips/98d9f455-f307-4b14-b0df-e99fe258f989/start` → **200**

```json
{
  "command_id": "c0a583ad-da9f-4361-86ee-228833a33440",
  "expected_version": 1
}
```

```json
{
  "id": "98d9f455-f307-4b14-b0df-e99fe258f989",
  "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
  "assignment_id": "032842ee-482e-47bf-996b-48c7d5296478",
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
  "arrived_at": "2026-10-30T08:29:59.108759Z",
  "started_at": "2026-10-30T08:29:59.407211Z",
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

`POST /api/driver/v1/trips/98d9f455-f307-4b14-b0df-e99fe258f989/complete` → **200**

```json
{
  "command_id": "f310b764-4e38-409c-9d8e-04b8c819cdb0",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:29:59Z",
  "cash_received": true
}
```

```json
{
  "id": "98d9f455-f307-4b14-b0df-e99fe258f989",
  "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
  "assignment_id": "032842ee-482e-47bf-996b-48c7d5296478",
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
  "arrived_at": "2026-10-30T08:29:59.108759Z",
  "started_at": "2026-10-30T08:29:59.407211Z",
  "completed_at": "2026-10-30T08:29:59.707569Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/a29be7a1-0a66-4f45-bff4-4fefe3aa24bd` → **200**

```json
{
  "id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
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
    "id": "032842ee-482e-47bf-996b-48c7d5296478",
    "order_id": "a29be7a1-0a66-4f45-bff4-4fefe3aa24bd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "98d9f455-f307-4b14-b0df-e99fe258f989",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:29:57.387657Z",
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
  "session_id": "f4e2aeff-1fea-4f69-a834-784c27b29754",
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
  "last_heartbeat_at": "2026-10-30T08:29:55.694893Z",
  "last_location_at": "2026-10-30T08:29:55.694893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f4e2aeff-1fea-4f69-a834-784c27b29754/close` → **200**

```json
{
  "command_id": "3159e69a-40fb-4611-b1b4-ce771958f833",
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
  "session_id": "6f6d651f-faeb-41ea-81bf-89cb877ae5da",
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
  "last_heartbeat_at": "2026-10-30T08:29:58.831205Z",
  "last_location_at": "2026-10-30T08:29:58.831205Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6f6d651f-faeb-41ea-81bf-89cb877ae5da/close` → **200**

```json
{
  "command_id": "1511e3c9-dcfa-489d-8681-abc32dd9db99",
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

Done: terminal order a29be7a1-0a66-4f45-bff4-4fefe3aa24bd by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27600"
}
```

```json
{
  "challenge_id": "913c1230-8254-46ad-823f-c39a8fe8f416",
  "expires_at": "2026-10-30T08:35:04.634657084Z",
  "resend_available_at": "2026-10-30T08:30:05.634657084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "229585",
  "sent_at": "2026-10-30T08:30:04.637905136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "913c1230-8254-46ad-823f-c39a8fe8f416",
  "code": "229585",
  "device_ref": "sandbox-27600"
}
```

```json
{
  "session_id": "2dfe75b5-9661-4353-92f1-f4fda01e800f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTkwNCwiaWF0IjoxNzkzMzQ5MDA0LCJqdGkiOiJiNzk5M2Y3Zi1hZDhmLTRhZDAtOGQwNy0zNTEwYzM0NzdmN2UiLCJzaWQiOiIyZGZlNzViNS05NjYxLTQzNTMtOTJmMS1mNGZkYTAxZTgwMGYifQ.LC1RLdTyN9MB6ME1L7d4WKN73rqEGov0alu49WDbxzQ",
  "access_expires_at": "2026-10-30T08:45:04.929576244Z",
  "refresh_token": "u_VRNAEBrpQGtgOR6VLQJ1Du5SNldpck7MKi2f0jkJM",
  "refresh_expires_at": "2026-11-29T08:30:04.929057907Z",
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
  "device_ref": "sandbox-26588"
}
```

```json
{
  "challenge_id": "dd638006-b17a-4bce-9fe5-6c875d0a6272",
  "expires_at": "2026-10-30T08:35:05.485396758Z",
  "resend_available_at": "2026-10-30T08:30:06.485396758Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "051579",
  "sent_at": "2026-10-30T08:30:05.488163047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd638006-b17a-4bce-9fe5-6c875d0a6272",
  "code": "051579",
  "device_ref": "sandbox-26588"
}
```

```json
{
  "session_id": "a428a23c-2e47-43bb-9f0f-4475889480a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTkwNSwiaWF0IjoxNzkzMzQ5MDA1LCJqdGkiOiI5MzkyNzM0OS1mNGM1LTRlZDQtYjUzZC04ODQwODQ4NDQyMTkiLCJzaWQiOiJhNDI4YTIzYy0yZTQ3LTQzYmItOWYwZi00NDc1ODg5NDgwYTMifQ.roeUmlns2v2S5aFQ8B23A-PPpeQGFA5_EMo_xgOXG7c",
  "access_expires_at": "2026-10-30T08:45:05.79572986Z",
  "refresh_token": "U0-j_aNWvLI-R8Y1qSU4JnMaGDKgU3HSRqQ30mWEdII",
  "refresh_expires_at": "2026-11-29T08:30:05.795270331Z",
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
  "device_ref": "sandbox-1084"
}
```

```json
{
  "challenge_id": "b0089778-f73a-453d-8126-17994d84e405",
  "expires_at": "2026-10-30T08:35:06.318626649Z",
  "resend_available_at": "2026-10-30T08:30:07.318626649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "857573",
  "sent_at": "2026-10-30T08:30:06.321092624Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0089778-f73a-453d-8126-17994d84e405",
  "code": "857573",
  "device_ref": "sandbox-1084"
}
```

```json
{
  "session_id": "76387c08-e727-4d0b-84be-d4f1dad9085e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0OTkwNiwiaWF0IjoxNzkzMzQ5MDA2LCJqdGkiOiJiMDRhNGUxNy0wNGJjLTQ3ZmYtYmU2Ny02ZGFhNzdmMjU1Y2YiLCJzaWQiOiI3NjM4N2MwOC1lNzI3LTRkMGItODRiZS1kNGYxZGFkOTA4NWUifQ.z8V4OPtB3CYWiYL_tGARD5BXcOI16cre403vjoUKb6M",
  "access_expires_at": "2026-10-30T08:45:06.60176333Z",
  "refresh_token": "GR554l05CRZwwyFvJj8lOa6FPJeAiPn1oPzF-WZhJ3o",
  "refresh_expires_at": "2026-11-29T08:30:06.601292994Z",
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
  "phone": "+380693560227",
  "device_ref": "sandbox-23823"
}
```

```json
{
  "challenge_id": "645040ec-5281-40ca-af94-e55b8c7f09c7",
  "expires_at": "2026-10-30T08:35:07.141294254Z",
  "resend_available_at": "2026-10-30T08:30:08.141294254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693560227` → **200**

```json
{
  "phone": "+380693560227",
  "audience": "CLIENT",
  "code": "713951",
  "sent_at": "2026-10-30T08:30:07.143909519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "645040ec-5281-40ca-af94-e55b8c7f09c7",
  "code": "713951",
  "device_ref": "sandbox-23823"
}
```

```json
{
  "session_id": "8bce1f15-2c34-4860-b537-ddd1942b2660",
  "subject": {
    "type": "CLIENT",
    "id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzBlMTAxYy0yNmY0LTQ1OTItOWIxYS0yY2FhMzg1NTRhYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ5OTA3LCJpYXQiOjE3OTMzNDkwMDcsImp0aSI6IjE2Yzc2MmQ5LTc0N2QtNDA4My1hOTIzLTI2NmMzNWE4NmZjMSIsInNpZCI6IjhiY2UxZjE1LTJjMzQtNDg2MC1iNTM3LWRkZDE5NDJiMjY2MCJ9.G2sFoNQ8RupLbTK1jXHFGD59d3TMYzY-0HoAT-U0NgQ",
  "access_expires_at": "2026-10-30T08:45:07.45070951Z",
  "refresh_token": "TJKpIjHsAlaczYroZEP_aJOgpgsTWErXN88jvCgoEmk",
  "refresh_expires_at": "2026-11-29T08:30:07.450284416Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9643cc7b-cca8-4820-be8b-a9c207de1f66",
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
  "id": "3fbc4268-f844-4ae7-849c-c8605346376f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:35:07.712806Z",
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
  "command_id": "b3f44273-b2ed-4d02-8bda-10daf7b7f5d6",
  "quote_id": "3fbc4268-f844-4ae7-849c-c8605346376f",
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
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:30:08.000752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:30:08.000752Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.895304824
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.232588865
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

`GET /api/rider/v1/orders/2e998601-338b-4c6a-89ce-ee371ddbcb0d` → **200**

```json
{
  "id": "2e998601-338b-4c6a-89ce-ee371ddbcb0d",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2c0e101c-26f4-4592-9b1a-2caa38554aa5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:30:08.000752Z",
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
  "session_id": "fd0da07d-fba5-481e-b5ae-c3e6616a5e74",
  "subject": {
    "type": "STAFF",
    "id": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDYyYzU1ZS0xODQ0LTRlNmMtYTlhMi1mNGRkMjYwYzExYTEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAwOTMsImlhdCI6MTc5MzM0OTE5MywianRpIjoiNTQyZDc1MGEtOGVmZS00ZjNhLWE1OTMtMDI4MTg0ZTMwZmI0Iiwic2lkIjoiZmQwZGEwN2QtZmJhNS00ODFlLWI1YWUtYzNlNjYxNmE1ZTc0In0.jlxvbz6s0Op7aFmluCUbad6yim48QDU6c2K2qBfaNdk",
  "access_expires_at": "2026-10-30T08:48:13.700050275Z",
  "refresh_token": "-TXJcvZEmSTONCHEpVk6vR2Oc0Vh74tIlbhaBKxO_60",
  "refresh_expires_at": "2026-10-30T20:33:13.699583044Z",
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
  "id": "b191f091-f927-4d4c-93e7-f7e6cabc5663",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:13.938039Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:13.938087Z",
  "updated_at": "2026-10-30T08:33:13.951805Z",
  "finished_at": "2026-10-30T08:33:13.951805Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b191f091-f927-4d4c-93e7-f7e6cabc5663` → **200**

```json
{
  "run": {
    "id": "b191f091-f927-4d4c-93e7-f7e6cabc5663",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:33:13.938039Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:33:13.938087Z",
    "updated_at": "2026-10-30T08:33:13.951805Z",
    "finished_at": "2026-10-30T08:33:13.951805Z",
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
  "id": "b191f091-f927-4d4c-93e7-f7e6cabc5663",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:13.938039Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:13.938087Z",
  "updated_at": "2026-10-30T08:33:13.951805Z",
  "finished_at": "2026-10-30T08:33:13.951805Z",
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
  "id": "b191f091-f927-4d4c-93e7-f7e6cabc5663",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:13.938039Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:13.938087Z",
  "updated_at": "2026-10-30T08:33:13.951805Z",
  "finished_at": "2026-10-30T08:33:13.951805Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/2435404e-5258-4853-a9cf-c6e4e3890c54` → **204**

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
  "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:14.307699Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:14.307745Z",
  "updated_at": "2026-10-30T08:33:14.314083Z",
  "finished_at": "2026-10-30T08:33:14.314083Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/af2f4044-a6ca-4b32-bff7-e0f77b2b6f52` → **200**

```json
{
  "run": {
    "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:33:14.307699Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:33:14.307745Z",
    "updated_at": "2026-10-30T08:33:14.314083Z",
    "finished_at": "2026-10-30T08:33:14.314083Z",
    "version": 1
  },
  "items": [
    {
      "id": "35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7",
      "run_id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "e77d44ccd6082bf5d1ef4f474e6ba2b7d0e14980832526a096e85db8e927c258",
      "reference_display": "sandbox-reconciliation-#####e-5258-4853-a9cf-c6e4e3890c54",
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
      "provider_at": "2026-10-30T08:33:14Z",
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
  "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:14.307699Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:14.307745Z",
  "updated_at": "2026-10-30T08:33:14.314083Z",
  "finished_at": "2026-10-30T08:33:14.314083Z",
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
  "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:14.307699Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:14.307745Z",
  "updated_at": "2026-10-30T08:33:14.314083Z",
  "finished_at": "2026-10-30T08:33:14.314083Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7/resolve` → **200**

```json
{
  "command_id": "bbe7b16d-8dec-47b0-b38d-10fcd096fc4d",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7",
  "run_id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "e77d44ccd6082bf5d1ef4f474e6ba2b7d0e14980832526a096e85db8e927c258",
  "reference_display": "sandbox-reconciliation-#####e-5258-4853-a9cf-c6e4e3890c54",
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
  "provider_at": "2026-10-30T08:33:14Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "resolved_at": "2026-10-30T08:33:14.667993Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7/resolve` → **200**

```json
{
  "command_id": "bbe7b16d-8dec-47b0-b38d-10fcd096fc4d",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7",
  "run_id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "e77d44ccd6082bf5d1ef4f474e6ba2b7d0e14980832526a096e85db8e927c258",
  "reference_display": "sandbox-reconciliation-#####e-5258-4853-a9cf-c6e4e3890c54",
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
  "provider_at": "2026-10-30T08:33:14Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
  "resolved_at": "2026-10-30T08:33:14.667993Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7/resolve` → **409**

```json
{
  "command_id": "d0c60aeb-f552-4651-a076-845bdfc3b357",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2737f8e8-c49e-4659-bd01-9b29b1a91d39"
}
```

`GET /api/admin/v1/payment-reconciliations/af2f4044-a6ca-4b32-bff7-e0f77b2b6f52` → **200**

```json
{
  "run": {
    "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:33:14.307699Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:33:14.307745Z",
    "updated_at": "2026-10-30T08:33:14.667993Z",
    "finished_at": "2026-10-30T08:33:14.314083Z",
    "version": 2
  },
  "items": [
    {
      "id": "35e9d1cc-0fb3-4b4c-88b1-d118e060f0f7",
      "run_id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "e77d44ccd6082bf5d1ef4f474e6ba2b7d0e14980832526a096e85db8e927c258",
      "reference_display": "sandbox-reconciliation-#####e-5258-4853-a9cf-c6e4e3890c54",
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
      "provider_at": "2026-10-30T08:33:14Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "e062c55e-1844-4e6c-a9a2-f4dd260c11a1",
      "resolved_at": "2026-10-30T08:33:14.667993Z",
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
      "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:33:14.307699Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:33:14.307745Z",
      "updated_at": "2026-10-30T08:33:14.667993Z",
      "finished_at": "2026-10-30T08:33:14.314083Z",
      "version": 2
    },
    {
      "id": "baf5c998-88c8-42cd-af3d-b1ded104e2b2",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:25:19.610217Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:25:19.610423Z",
      "updated_at": "2026-10-30T08:25:19.621701Z",
      "finished_at": "2026-10-30T08:25:19.621701Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/2435404e-5258-4853-a9cf-c6e4e3890c54` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "af2f4044-a6ca-4b32-bff7-e0f77b2b6f52",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:33:14.307699Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:33:14.307745Z",
  "updated_at": "2026-10-30T08:33:14.667993Z",
  "finished_at": "2026-10-30T08:33:14.314083Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793349319796E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793349320074E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793349320075E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793349319819E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793349320076E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
