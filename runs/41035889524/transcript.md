# Sandbox transcript (2026-10-30T09:47:40Z, 99bc2a7)

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
  "correlation_id": "b9f03013-45e3-4cf0-8e77-23b29bc7a2c5"
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
  "session_id": "b787e1a1-81e0-4f29-b8e3-5f21b370c095",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NjgsImlhdCI6MTc5MzM1MzY2OCwianRpIjoiNDEzM2Y5YmUtMzE0My00Y2RmLWE1ZTQtYzRjY2U1MjU3MDY2Iiwic2lkIjoiYjc4N2UxYTEtODFlMC00ZjI5LWI4ZTMtNWYyMWIzNzBjMDk1In0.ahJ_a2xGc7HPG6IdFnGnK_sgIuJ9c-Wv46vEzSiEEVI",
  "access_expires_at": "2026-10-30T10:02:48.344995731Z",
  "refresh_token": "O2W-pEzEB5VJuk6pWgQMfI88J2Fs4_mfX8jFXaYnxL0",
  "refresh_expires_at": "2026-10-30T21:47:48.342942609Z",
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
  "session_id": "b07c1a34-5d64-48c1-b01c-5f52e89b3b3a",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzAsImlhdCI6MTc5MzM1MzY3MCwianRpIjoiMzE5ODQ0MzktYWY4MS00NDQzLTliNDUtYWI1N2MzOThhOGY4Iiwic2lkIjoiYjA3YzFhMzQtNWQ2NC00OGMxLWIwMWMtNWY1MmU4OWIzYjNhIn0.UwifzerhygDQcMGNQsi0LH6wfhxdE77AeSqwfmkjlpQ",
  "access_expires_at": "2026-10-30T10:02:50.204591021Z",
  "refresh_token": "DgprGTuwCWnpmk-a8JAA6efLsIMb_0lqGj2jMSUh40o",
  "refresh_expires_at": "2026-10-30T21:47:50.20360887Z",
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
  "device_ref": "sandbox-19208"
}
```

```json
{
  "challenge_id": "a9f43e61-e1fd-4959-ac8b-f5306906228c",
  "expires_at": "2026-10-30T09:52:50.813825871Z",
  "resend_available_at": "2026-10-30T09:47:51.813825871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "826184",
  "sent_at": "2026-10-30T09:47:50.828014552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9f43e61-e1fd-4959-ac8b-f5306906228c",
  "code": "826184",
  "device_ref": "sandbox-19208"
}
```

```json
{
  "session_id": "e804a1d4-9453-4aa0-afee-25582454a245",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU3MSwiaWF0IjoxNzkzMzUzNjcxLCJqdGkiOiI3ZWYyZjYxZi05NDEwLTQxYzEtOTdiMC01ODQ5YzBjMTQxNTEiLCJzaWQiOiJlODA0YTFkNC05NDUzLTRhYTAtYWZlZS0yNTU4MjQ1NGEyNDUifQ.2UwW6aSWbjXAhB1pDYTRDqYYEArywV2n7dNv7-U1ysk",
  "access_expires_at": "2026-10-30T10:02:51.161193776Z",
  "refresh_token": "I9GYgniZENVeEb91Lr9z7UIDzKexYZnQ5CirmqYIUdc",
  "refresh_expires_at": "2026-11-29T09:47:51.160309627Z",
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
  "command_id": "81ad26c2-b778-40c3-b0e6-9cd96102e77e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:51Z",
    "sequence": 1793353671734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4e859a8b-bb07-46c0-a51c-ed2147679da1",
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
  "last_heartbeat_at": "2026-10-30T09:47:51.852229Z",
  "last_location_at": "2026-10-30T09:47:51.852229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637642381",
  "device_ref": "sandbox-28299"
}
```

```json
{
  "challenge_id": "d13f8883-81cb-4205-ae8e-9aae0dd4bbb9",
  "expires_at": "2026-10-30T09:52:52.202035409Z",
  "resend_available_at": "2026-10-30T09:47:53.202035409Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637642381` → **200**

```json
{
  "phone": "+380637642381",
  "audience": "CLIENT",
  "code": "797575",
  "sent_at": "2026-10-30T09:47:52.206545615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d13f8883-81cb-4205-ae8e-9aae0dd4bbb9",
  "code": "797575",
  "device_ref": "sandbox-28299"
}
```

```json
{
  "session_id": "d2ff5644-cba1-4394-b48c-915018a47a86",
  "subject": {
    "type": "CLIENT",
    "id": "160b1471-2eec-45c2-b644-7e0ff41db2a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjBiMTQ3MS0yZWVjLTQ1YzItYjY0NC03ZTBmZjQxZGIyYTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTcyLCJpYXQiOjE3OTMzNTM2NzIsImp0aSI6ImFiZTEyODY5LWVmOTktNGMwZi1hMDAzLTRlYzMzNTRlODY0ZiIsInNpZCI6ImQyZmY1NjQ0LWNiYTEtNDM5NC1iNDhjLTkxNTAxOGE0N2E4NiJ9.zddw6eG0eoAhMayJZs7Qao2xxp13dUheq22JAw4c1uc",
  "access_expires_at": "2026-10-30T10:02:52.512241968Z",
  "refresh_token": "ljUKFR_SI4pk716Y8vbJ3mHlWMGdUmqjRUfhKmaPwkQ",
  "refresh_expires_at": "2026-11-29T09:47:52.511150805Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66f7795d-a0e5-4cb0-b7d2-eb3441eb5b54",
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
  "id": "21cd1fd8-97b4-4833-9f75-d166f6c90e1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:52:52.838301Z",
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
  "command_id": "0d84c46c-5944-4658-a336-9694ad7c2667",
  "quote_id": "21cd1fd8-97b4-4833-9f75-d166f6c90e1f",
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
  "id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "160b1471-2eec-45c2-b644-7e0ff41db2a7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:47:53.213078Z",
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
    "id": "44617e41-c930-4810-9864-20fa652b4cc3",
    "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
    "expires_at": "2026-10-30T09:48:08.222713Z",
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

`POST /api/driver/v1/offers/44617e41-c930-4810-9864-20fa652b4cc3/accept` → **200**

```json
{
  "command_id": "9c6762e7-0712-4c6e-8440-4d7a17feb396"
}
```

```json
{
  "id": "73abed64-1e2e-44e5-a2f6-fe74ebf3e508",
  "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84105435-9a6d-4e26-a7e8-f8f28269acf0",
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
  "command_id": "7c421b11-6158-4799-b8d4-a9eb04b91089",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:47:54.477694541Z"
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
  "id": "84105435-9a6d-4e26-a7e8-f8f28269acf0",
  "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
  "assignment_id": "73abed64-1e2e-44e5-a2f6-fe74ebf3e508",
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

`POST /api/driver/v1/work-sessions/4e859a8b-bb07-46c0-a51c-ed2147679da1/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:55Z",
    "sequence": 1793353675378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4e859a8b-bb07-46c0-a51c-ed2147679da1",
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
  "last_heartbeat_at": "2026-10-30T09:47:55.404348Z",
  "last_location_at": "2026-10-30T09:47:55.404348Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/84105435-9a6d-4e26-a7e8-f8f28269acf0/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f307e148-bdb7-4f6d-81da-05227173beae",
  "expected_version": 0
}
```

```json
{
  "id": "84105435-9a6d-4e26-a7e8-f8f28269acf0",
  "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
  "assignment_id": "73abed64-1e2e-44e5-a2f6-fe74ebf3e508",
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
  "arrived_at": "2026-10-30T09:47:55.701109Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/84105435-9a6d-4e26-a7e8-f8f28269acf0/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5fd2b96f-07e4-47e9-8fa5-de782408be96",
  "expected_version": 1
}
```

```json
{
  "id": "84105435-9a6d-4e26-a7e8-f8f28269acf0",
  "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
  "assignment_id": "73abed64-1e2e-44e5-a2f6-fe74ebf3e508",
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
  "arrived_at": "2026-10-30T09:47:55.701109Z",
  "started_at": "2026-10-30T09:47:55.991067Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/84105435-9a6d-4e26-a7e8-f8f28269acf0/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f339591f-fc4c-4147-95de-28ab25738b83",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:47:56Z",
  "cash_received": true
}
```

```json
{
  "id": "84105435-9a6d-4e26-a7e8-f8f28269acf0",
  "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
  "assignment_id": "73abed64-1e2e-44e5-a2f6-fe74ebf3e508",
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
  "arrived_at": "2026-10-30T09:47:55.701109Z",
  "started_at": "2026-10-30T09:47:55.991067Z",
  "completed_at": "2026-10-30T09:47:56.292828Z",
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
  "session_id": "4e859a8b-bb07-46c0-a51c-ed2147679da1",
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
  "last_heartbeat_at": "2026-10-30T09:47:55.404348Z",
  "last_location_at": "2026-10-30T09:47:55.404348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4e859a8b-bb07-46c0-a51c-ed2147679da1/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f3eaac51-db0d-4970-8bd7-8312c639aaff",
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
  "command_id": "e96dffed-2864-47e2-af74-afb40c013c67",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:57Z",
    "sequence": 1793353677181
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
  "correlation_id": "11e81d68-7f09-4cec-9690-854848992acb",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "5b1f0f32-3fb2-4929-8db4-acec927bfd05",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:47:57Z",
    "sequence": 1793353677483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27a092c7-ac8d-4170-8aff-903c4c53c1be",
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
  "last_heartbeat_at": "2026-10-30T09:47:57.504768Z",
  "last_location_at": "2026-10-30T09:47:57.504768Z",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:47:54.477695Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "ff257431-7f0e-4010-9a19-690f94b1465c",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:47:58.083616025Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27a092c7-ac8d-4170-8aff-903c4c53c1be",
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
  "last_heartbeat_at": "2026-10-30T09:47:57.504768Z",
  "last_location_at": "2026-10-30T09:47:57.504768Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27a092c7-ac8d-4170-8aff-903c4c53c1be/close` → **200**

```json
{
  "command_id": "0b3c343c-d4c6-43ac-bf0e-7ae2d4e51918",
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
  "session_id": "72663d47-ee7f-497b-8514-3607790fc788",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1NzksImlhdCI6MTc5MzM1MzY3OSwianRpIjoiMTA1MDQxNjItOGM1NS00OGRiLWFkNWItOTliM2VjMGI3OTM1Iiwic2lkIjoiNzI2NjNkNDctZWU3Zi00OTdiLTg1MTQtMzYwNzc5MGZjNzg4In0.4ll8ERj9PiI5wNzuRBcqY2xJUO8XMzR6n7rxCpRS3jE",
  "access_expires_at": "2026-10-30T10:02:59.237905756Z",
  "refresh_token": "aiT-h1hN7QiUoiG4a7hhzICrJhkmm0ALqA-ycjMRHqw",
  "refresh_expires_at": "2026-10-30T21:47:59.237160001Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "69d1601b-95bd-4d4a-a4ff-2ac76ff9bfdd",
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
  "id": "3d8088d8-84c9-4f64-a509-bf57c18aaf4b",
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
  "created_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "created_at": "2026-10-30T09:47:59.531575Z",
  "updated_at": "2026-10-30T09:47:59.531575Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636657557",
  "device_ref": "sandbox-15314"
}
```

```json
{
  "challenge_id": "4ef615d1-ddc6-4dbf-be6a-7ec6324c959d",
  "expires_at": "2026-10-30T09:52:59.825217888Z",
  "resend_available_at": "2026-10-30T09:48:00.825217888Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636657557` → **200**

```json
{
  "phone": "+380636657557",
  "audience": "CLIENT",
  "code": "449560",
  "sent_at": "2026-10-30T09:47:59.829362417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ef615d1-ddc6-4dbf-be6a-7ec6324c959d",
  "code": "449560",
  "device_ref": "sandbox-15314"
}
```

```json
{
  "session_id": "b2f09d18-afb7-49bc-8977-c4a6f3ed944c",
  "subject": {
    "type": "CLIENT",
    "id": "bf9b6375-69c3-4a97-99d7-df8fbbd1e416"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjliNjM3NS02OWMzLTRhOTctOTlkNy1kZjhmYmJkMWU0MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NTgwLCJpYXQiOjE3OTMzNTM2ODAsImp0aSI6IjBhZGVkYjRjLTQ3ZGMtNGY3My1iMzZmLTg1ZDI5Yjc0Y2I1MCIsInNpZCI6ImIyZjA5ZDE4LWFmYjctNDliYy04OTc3LWM0YTZmM2VkOTQ0YyJ9.sfP2ga_HnQG30A6l3IA8s7iKgXZ47WcX_T8PBIM4n98",
  "access_expires_at": "2026-10-30T10:03:00.128351245Z",
  "refresh_token": "LCOebggsaRROtQ8nikTLJbEKaTTrZ8j4930YXfA8ndw",
  "refresh_expires_at": "2026-11-29T09:48:00.127280848Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636657557` → **200**

```json
{
  "client_id": "bf9b6375-69c3-4a97-99d7-df8fbbd1e416"
}
```

`POST /api/admin/v1/rider-wallets/bf9b6375-69c3-4a97-99d7-df8fbbd1e416/top-ups` → **201**

```json
{
  "command_id": "b68caa7e-1d91-47e0-8df9-b662ed52aa3b",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "bf9b6375-69c3-4a97-99d7-df8fbbd1e416",
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
      "id": "c0d8a984-09fc-46c4-af31-af2482a621ff",
      "at": "2026-10-30T09:48:00.695392Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1cafd63b-bf78-492c-8670-9769ab87d46c",
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
  "id": "cc39282c-2f3a-4e09-a3ee-ab8aca30e15d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:01.000194Z",
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
      "id": "3d8088d8-84c9-4f64-a509-bf57c18aaf4b",
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
  "device_ref": "sandbox-4852"
}
```

```json
{
  "challenge_id": "5b82be63-1d9e-4036-adb1-4aa806479950",
  "expires_at": "2026-10-30T09:53:01.298317679Z",
  "resend_available_at": "2026-10-30T09:48:02.298317679Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "833191",
  "sent_at": "2026-10-30T09:48:01.30276621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b82be63-1d9e-4036-adb1-4aa806479950",
  "code": "833191",
  "device_ref": "sandbox-4852"
}
```

```json
{
  "session_id": "99667275-1e6e-4812-8e3c-4c1bd7ef0875",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDU4MSwiaWF0IjoxNzkzMzUzNjgxLCJqdGkiOiI1NTA3ODQyOC1mYzBiLTQxMjQtYjY0MC0xNDgwY2M2YzE1ZjAiLCJzaWQiOiI5OTY2NzI3NS0xZTZlLTQ4MTItOGUzYy00YzFiZDdlZjA4NzUifQ.iSQuXHX-IewxBqcj8xXsPnisLp7F5fmkeERGBvT2rJM",
  "access_expires_at": "2026-10-30T10:03:01.5960842Z",
  "refresh_token": "4mVc1y1Gn8OEHZQY-zZFQP793FA7on3yIa9nNNvfkLM",
  "refresh_expires_at": "2026-11-29T09:48:01.595374272Z",
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
  "command_id": "33efb55a-5f87-44e3-94d5-0059d90430b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:02Z",
    "sequence": 1793353682147
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a3dc65-0871-4071-8c6c-d1f6f93183e1",
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
  "last_heartbeat_at": "2026-10-30T09:48:02.16827Z",
  "last_location_at": "2026-10-30T09:48:02.16827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "82464a99-0e28-4555-9f5b-0fd7895b2fd9",
  "quote_id": "cc39282c-2f3a-4e09-a3ee-ab8aca30e15d",
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
  "id": "b3e93827-2fca-4707-a825-c115bd12c26e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bf9b6375-69c3-4a97-99d7-df8fbbd1e416",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:48:02.482268Z",
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
  "client_id": "bf9b6375-69c3-4a97-99d7-df8fbbd1e416",
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
      "id": "c0d8a984-09fc-46c4-af31-af2482a621ff",
      "at": "2026-10-30T09:48:00.695392Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
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
    "id": "1fb80b1c-a77c-4a25-911a-67198f2dae66",
    "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
    "expires_at": "2026-10-30T09:48:17.490453Z",
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

`POST /api/driver/v1/offers/1fb80b1c-a77c-4a25-911a-67198f2dae66/accept` → **200**

```json
{
  "command_id": "67d54519-800a-4bdd-9c2e-a573d43a99a8"
}
```

```json
{
  "id": "6d56bb63-2bec-49a5-ac97-4caf24a2d3b2",
  "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b430fad-1e72-467d-b59e-9b33073f1ecf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b430fad-1e72-467d-b59e-9b33073f1ecf",
  "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
  "assignment_id": "6d56bb63-2bec-49a5-ac97-4caf24a2d3b2",
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

`POST /api/driver/v1/work-sessions/e1a3dc65-0871-4071-8c6c-d1f6f93183e1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:03Z",
    "sequence": 1793353683919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a3dc65-0871-4071-8c6c-d1f6f93183e1",
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
  "last_heartbeat_at": "2026-10-30T09:48:03.939102Z",
  "last_location_at": "2026-10-30T09:48:03.939102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1b430fad-1e72-467d-b59e-9b33073f1ecf/arrive` → **200**

```json
{
  "command_id": "da679809-815c-408a-9b07-e9844063ec6d",
  "expected_version": 0
}
```

```json
{
  "id": "1b430fad-1e72-467d-b59e-9b33073f1ecf",
  "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
  "assignment_id": "6d56bb63-2bec-49a5-ac97-4caf24a2d3b2",
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
  "arrived_at": "2026-10-30T09:48:04.24779Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1b430fad-1e72-467d-b59e-9b33073f1ecf/start` → **200**

```json
{
  "command_id": "2895279c-4b94-49fe-b539-73238a47334a",
  "expected_version": 1
}
```

```json
{
  "id": "1b430fad-1e72-467d-b59e-9b33073f1ecf",
  "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
  "assignment_id": "6d56bb63-2bec-49a5-ac97-4caf24a2d3b2",
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
  "arrived_at": "2026-10-30T09:48:04.24779Z",
  "started_at": "2026-10-30T09:48:04.551259Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1b430fad-1e72-467d-b59e-9b33073f1ecf/complete` → **200**

```json
{
  "command_id": "f148423b-675f-4bf9-8317-9b0483a15a55",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:04Z",
  "cash_received": true
}
```

```json
{
  "id": "1b430fad-1e72-467d-b59e-9b33073f1ecf",
  "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
  "assignment_id": "6d56bb63-2bec-49a5-ac97-4caf24a2d3b2",
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
  "arrived_at": "2026-10-30T09:48:04.24779Z",
  "started_at": "2026-10-30T09:48:04.551259Z",
  "completed_at": "2026-10-30T09:48:04.874654Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "bf9b6375-69c3-4a97-99d7-df8fbbd1e416",
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
      "id": "220afdb3-b832-479b-a0c9-0743428ce6cb",
      "at": "2026-10-30T09:48:05.882951Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e"
    },
    {
      "id": "c0d8a984-09fc-46c4-af31-af2482a621ff",
      "at": "2026-10-30T09:48:00.695392Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/3d8088d8-84c9-4f64-a509-bf57c18aaf4b/archive` → **200**

```json
{
  "command_id": "e4cbc9f3-e064-4bd3-96eb-e054ed77be93",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "3d8088d8-84c9-4f64-a509-bf57c18aaf4b",
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
  "created_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "created_at": "2026-10-30T09:47:59.531575Z",
  "updated_at": "2026-10-30T09:48:08.471296Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a3dc65-0871-4071-8c6c-d1f6f93183e1",
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
  "last_heartbeat_at": "2026-10-30T09:48:03.939102Z",
  "last_location_at": "2026-10-30T09:48:03.939102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1a3dc65-0871-4071-8c6c-d1f6f93183e1/close` → **200**

```json
{
  "command_id": "458b5254-154b-4194-96d9-173cb6f4ab7e",
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

Done: order b3e93827-2fca-4707-a825-c115bd12c26e.

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
  "session_id": "c666e140-f398-4a83-b48a-00807453f500",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1ODksImlhdCI6MTc5MzM1MzY4OSwianRpIjoiNzU3YjE5MjMtNTVmMS00NGQ5LWJlNGMtOTYyZDQ4MzFlMWU5Iiwic2lkIjoiYzY2NmUxNDAtZjM5OC00YTgzLWI0OGEtMDA4MDc0NTNmNTAwIn0.uW5pOVsui0_ioW_GX5fhz7fO3EnKn32KEZ9nScIC3dA",
  "access_expires_at": "2026-10-30T10:03:09.656617472Z",
  "refresh_token": "FZMAsh4JvbuMnMe110Tn6o9t7SBU3CYkCeVWVjwi6aI",
  "refresh_expires_at": "2026-10-30T21:48:09.655973537Z",
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
  "command_id": "56c95f66-9a68-4234-84d5-d8473996cede",
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
  "session_id": "cb3d59e3-25af-4544-b262-b15a0ed4aacc",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ1OTAsImlhdCI6MTc5MzM1MzY5MCwianRpIjoiZDY5MmQ1NjEtYjgyNy00Njg2LWI5MzQtNTljMzY0NDc1ZGJiIiwic2lkIjoiY2IzZDU5ZTMtMjVhZi00NTQ0LWIyNjItYjE1YTBlZDRhYWNjIn0.OzLMDhdZv29MvPTVM0A-njxTq_MrnlSHLK9YnhEDzAE",
  "access_expires_at": "2026-10-30T10:03:10.814243312Z",
  "refresh_token": "ij5MTCSur2NXKW5z50yV56ku_q4XtlM2gKlM3VA3uio",
  "refresh_expires_at": "2026-10-30T21:48:10.813495624Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.207925699",
    "linkedid": "1730052700.207925699",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677941310"
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
    "id": "1730052700.207925699",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "86697df0-b050-4100-878b-a975e18e56db",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.095734Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:48:11.121424Z",
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
    "id": "1730052600.1827527085",
    "linkedid": "1730052600.1827527085",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677941310"
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
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/4f93226e-f091-4a5b-8305-7ee3419031f5/answer` → **200**

```json
{
  "command_id": "539b7042-8213-4945-bf81-b7d9a7d5a1f0"
}
```

```json
{
  "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677941310",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "order_ids": [],
  "started_at": "2026-10-30T09:48:11.457874Z",
  "answered_at": "2026-10-30T09:48:11.778931Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1827527085",
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
    "id": "1730052600.1827527085",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
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
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
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
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
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
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
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
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:48:19.523431Z"
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
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:48:19.523431Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/4f93226e-f091-4a5b-8305-7ee3419031f5/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/4f93226e-f091-4a5b-8305-7ee3419031f5/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=4f93226e-f091-4a5b-8305-7ee3419031f5` → **200**

```json
{
  "changes": [
    {
      "id": "fa80d289-d49f-4a56-83c0-0768f9af9db1",
      "occurred_at": "2026-10-30T09:48:21.853282Z",
      "actor_type": "STAFF",
      "actor_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8694ab91-d53f-4c9c-8a93-f2b65737d853\", \"order_ids\": []}",
      "correlation_id": "4acb2f9f-523e-4075-a0b9-7bbbab59656e"
    },
    {
      "id": "4396a193-28ca-4f15-bd30-6d460879ee0a",
      "occurred_at": "2026-10-30T09:48:21.820179Z",
      "actor_type": "STAFF",
      "actor_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8694ab91-d53f-4c9c-8a93-f2b65737d853\", \"order_ids\": []}",
      "correlation_id": "435a30be-f39c-4a16-a815-296d49a40d4a"
    }
  ]
}
```

Done: call 4f93226e-f091-4a5b-8305-7ee3419031f5 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20868"
}
```

```json
{
  "challenge_id": "a18027d6-3067-4465-bfe0-d872f997b536",
  "expires_at": "2026-10-30T09:53:22.170945321Z",
  "resend_available_at": "2026-10-30T09:48:23.170945321Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "684316",
  "sent_at": "2026-10-30T09:48:22.175153063Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a18027d6-3067-4465-bfe0-d872f997b536",
  "code": "684316",
  "device_ref": "sandbox-20868"
}
```

```json
{
  "session_id": "dddab920-e759-4117-93ab-23eaea18672f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDYwMiwiaWF0IjoxNzkzMzUzNzAyLCJqdGkiOiI1NDRlM2ZkNi01Y2VjLTQ3NTItYWUwOC0wZjFjMzkyNWMyYzQiLCJzaWQiOiJkZGRhYjkyMC1lNzU5LTQxMTctOTNhYi0yM2VhZWExODY3MmYifQ.LxemWV49cwMBceb8D4MjqEsA4kUsdrVMXvGtQ1ygTpA",
  "access_expires_at": "2026-10-30T10:03:22.465119141Z",
  "refresh_token": "3wvDpPhKHOKPXC3SRGdVtLU6qy41wmxvlOywKwRv_z8",
  "refresh_expires_at": "2026-11-29T09:48:22.464485037Z",
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
  "command_id": "29e57608-8ce5-4c87-b52a-17a6bf334c71",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:23Z",
    "sequence": 1793353703444
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d73af70c-b411-45dd-b7d3-20ee9d8c1232",
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
  "last_heartbeat_at": "2026-10-30T09:48:23.02519Z",
  "last_location_at": "2026-10-30T09:48:23.02519Z",
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
  "session_id": "7ffadb6f-383d-4963-98f6-e9b0fa2a192b",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MDMsImlhdCI6MTc5MzM1MzcwMywianRpIjoiZWE1ODE0N2EtNGIzMC00NGQ3LWFkMTQtYzBkMDk1MjQyZTM3Iiwic2lkIjoiN2ZmYWRiNmYtMzgzZC00OTYzLTk4ZjYtZTliMGZhMmExOTJiIn0.K8iMOSlnuQ9xuYrUQaTg1AcgngleS7VV5nNWx4icnqs",
  "access_expires_at": "2026-10-30T10:03:23.600578971Z",
  "refresh_token": "86LuOpGPKH7gn0yL76nNdlk_F8Ui5O0gTYmoaNvVFz0",
  "refresh_expires_at": "2026-10-30T21:48:23.59999623Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "dd443528-33c3-4954-884e-ac595fab65c5",
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
  "id": "afb1ec25-fb66-4b7b-9cf1-f2fd80668fe7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:23.880261Z",
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
  "command_id": "2507d142-699d-4b2a-8e1f-f3ffc5957ca1",
  "quote_id": "afb1ec25-fb66-4b7b-9cf1-f2fd80668fe7",
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
    "phone": "+380673521063"
  }
}
```

```json
{
  "id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
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
  "created_at": "2026-10-30T09:48:24.18238Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673521063"
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
    "id": "0ae21d04-43d7-4612-b03d-7920d510f87b",
    "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
    "expires_at": "2026-10-30T09:48:39.187496Z",
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

`POST /api/driver/v1/offers/0ae21d04-43d7-4612-b03d-7920d510f87b/accept` → **200**

```json
{
  "command_id": "56ffe2b1-64d7-411f-9b83-80b06122a0ac"
}
```

```json
{
  "id": "e3451290-29d0-409d-9e00-b16721e41588",
  "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a87267f6-c90a-40b6-a303-a9c692085830",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a87267f6-c90a-40b6-a303-a9c692085830",
  "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
  "assignment_id": "e3451290-29d0-409d-9e00-b16721e41588",
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
    "phone": "+380673521063"
  }
}
```

`POST /api/driver/v1/work-sessions/d73af70c-b411-45dd-b7d3-20ee9d8c1232/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:26Z",
    "sequence": 1793353706471
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d73af70c-b411-45dd-b7d3-20ee9d8c1232",
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
  "last_heartbeat_at": "2026-10-30T09:48:26.490577Z",
  "last_location_at": "2026-10-30T09:48:26.490577Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a87267f6-c90a-40b6-a303-a9c692085830/arrive` → **200**

```json
{
  "command_id": "d0e5399c-1ef8-46b7-86e5-51ab5bf73ebe",
  "expected_version": 0
}
```

```json
{
  "id": "a87267f6-c90a-40b6-a303-a9c692085830",
  "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
  "assignment_id": "e3451290-29d0-409d-9e00-b16721e41588",
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
  "arrived_at": "2026-10-30T09:48:26.773429Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673521063"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  },
  {
    "phone": "+380673521063",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:27.786538699Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  },
  {
    "phone": "+380673521063",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:27.786538699Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673521063` → **200**

```json
[
  {
    "phone": "+380673521063",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:25.77757465Z"
  },
  {
    "phone": "+380673521063",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:48:27.786538699Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/a87267f6-c90a-40b6-a303-a9c692085830/start` → **200**

```json
{
  "command_id": "ae8ca665-12d6-414d-ab28-2cbcd4c604c6",
  "expected_version": 1
}
```

```json
{
  "id": "a87267f6-c90a-40b6-a303-a9c692085830",
  "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
  "assignment_id": "e3451290-29d0-409d-9e00-b16721e41588",
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
  "arrived_at": "2026-10-30T09:48:26.773429Z",
  "started_at": "2026-10-30T09:48:28.167812Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673521063"
  }
}
```

`POST /api/driver/v1/trips/a87267f6-c90a-40b6-a303-a9c692085830/complete` → **200**

```json
{
  "command_id": "f527a25c-3f94-4023-b70f-0890f0dd80b7",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:28Z",
  "cash_received": true
}
```

```json
{
  "id": "a87267f6-c90a-40b6-a303-a9c692085830",
  "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
  "assignment_id": "e3451290-29d0-409d-9e00-b16721e41588",
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
  "arrived_at": "2026-10-30T09:48:26.773429Z",
  "started_at": "2026-10-30T09:48:28.167812Z",
  "completed_at": "2026-10-30T09:48:28.457129Z",
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
  "session_id": "d73af70c-b411-45dd-b7d3-20ee9d8c1232",
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
  "last_heartbeat_at": "2026-10-30T09:48:26.490577Z",
  "last_location_at": "2026-10-30T09:48:26.490577Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d73af70c-b411-45dd-b7d3-20ee9d8c1232/close` → **200**

```json
{
  "command_id": "c6953816-b468-4558-8692-3aca14edc8e2",
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
  "phone": "+380635305495",
  "device_ref": "sandbox-6714"
}
```

```json
{
  "challenge_id": "c78cb569-11c4-4478-88dc-b6390ce70341",
  "expires_at": "2026-10-30T09:53:29.347892859Z",
  "resend_available_at": "2026-10-30T09:48:30.347892859Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635305495` → **200**

```json
{
  "phone": "+380635305495",
  "audience": "CLIENT",
  "code": "367920",
  "sent_at": "2026-10-30T09:48:29.351542186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c78cb569-11c4-4478-88dc-b6390ce70341",
  "code": "367920",
  "device_ref": "sandbox-6714"
}
```

```json
{
  "session_id": "8bce1ccc-32bb-4fa2-8b73-5eb3c38c7919",
  "subject": {
    "type": "CLIENT",
    "id": "29479ee8-2183-400d-b56d-767a94aec066"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTQ3OWVlOC0yMTgzLTQwMGQtYjU2ZC03NjdhOTRhZWMwNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjA5LCJpYXQiOjE3OTMzNTM3MDksImp0aSI6IjhmNzRmZWNiLTM4MmItNGFmYS04N2RmLWMwNzUwNDVkM2IzMSIsInNpZCI6IjhiY2UxY2NjLTMyYmItNGZhMi04YjczLTVlYjNjMzhjNzkxOSJ9.hpoyWmZfA4_s17wHN2Tt_TWbgqmhJzkyclrGra0MkVA",
  "access_expires_at": "2026-10-30T10:03:29.665919752Z",
  "refresh_token": "DZLwMlZRLSh6a_FypdeuvlvFLKEVLjE_cE45xuzRIkw",
  "refresh_expires_at": "2026-11-29T09:48:29.665290845Z",
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
  "device_ref": "sandbox-23230"
}
```

```json
{
  "challenge_id": "9201e4dd-c71e-4d8d-985e-94f2dd782534",
  "expires_at": "2026-10-30T09:53:30.211999345Z",
  "resend_available_at": "2026-10-30T09:48:31.211999345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "420035",
  "sent_at": "2026-10-30T09:48:30.216376339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9201e4dd-c71e-4d8d-985e-94f2dd782534",
  "code": "420035",
  "device_ref": "sandbox-23230"
}
```

```json
{
  "session_id": "b4b29c35-c956-4740-9f84-e54f88a52504",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDYxMCwiaWF0IjoxNzkzMzUzNzEwLCJqdGkiOiIyOWFiYzExNi00OWRhLTRjNjctYWY3Yi03YzRjYzgxZTQ3YTEiLCJzaWQiOiJiNGIyOWMzNS1jOTU2LTQ3NDAtOWY4NC1lNTRmODhhNTI1MDQifQ.FKwaejowmNt-wmqejC11G2H9YAFfAhA-5ZJpZalLVkQ",
  "access_expires_at": "2026-10-30T10:03:30.520706463Z",
  "refresh_token": "008Gnj0PsFcS80kkCzGWZO0RYFq0g-wQdOsrVedVRxk",
  "refresh_expires_at": "2026-11-29T09:48:30.520077085Z",
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
  "session_id": "653a9910-e728-4e43-9057-0402c159f053",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MTEsImlhdCI6MTc5MzM1MzcxMSwianRpIjoiMWYyY2E5NzUtOGRlNy00ODJhLWE4NWQtOGJlZjYwNmYyNzY2Iiwic2lkIjoiNjUzYTk5MTAtZTcyOC00ZTQzLTkwNTctMDQwMmMxNTlmMDUzIn0.F5IKtryRKDOpoxUOwGgx2RxoWM2t6QVvLP08nxPM8To",
  "access_expires_at": "2026-10-30T10:03:31.352866062Z",
  "refresh_token": "q8Bq1Yz0RAF2SkNZQbUGYFaCFRBEeJvxL1ENH0O5aFY",
  "refresh_expires_at": "2026-10-30T21:48:31.352289671Z",
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
  "session_id": "b6116d7d-0580-4376-b1b8-d5c1f5d5cf3c",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MTEsImlhdCI6MTc5MzM1MzcxMSwianRpIjoiYWU4NWFiMWItMWM5Yi00M2YzLWFhNGUtYzg5NTFiNTliNWMwIiwic2lkIjoiYjYxMTZkN2QtMDU4MC00Mzc2LWIxYjgtZDVjMWY1ZDVjZjNjIn0.Xk8dd38G65GjJ9BeRyJJTj_ew4rj4I_T5RJVUbTSeiQ",
  "access_expires_at": "2026-10-30T10:03:31.911152756Z",
  "refresh_token": "WkC_vdr_sNJOOIPr5tVtILTJo1lCO8I3BsvHahWrbUE",
  "refresh_expires_at": "2026-10-30T21:48:31.910469525Z",
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
  "command_id": "a1fbcafc-ead6-42a1-aa09-436896ae46ed",
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
  "id": "6c1278ad-6ccf-47fb-96e6-e8c4f0206dbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:32.468681Z",
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
  "command_id": "c3f306c6-3caa-4913-bdb3-270c6fd17322",
  "quote_id": "6c1278ad-6ccf-47fb-96e6-e8c4f0206dbc",
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
  "id": "99c3b918-562d-4ec0-b1f2-57ec9656a56e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29479ee8-2183-400d-b56d-767a94aec066",
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
  "created_at": "2026-10-30T09:48:32.761929Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/99c3b918-562d-4ec0-b1f2-57ec9656a56e` → **200**

```json
{
  "id": "99c3b918-562d-4ec0-b1f2-57ec9656a56e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29479ee8-2183-400d-b56d-767a94aec066",
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
  "created_at": "2026-10-30T09:48:32.761929Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/99c3b918-562d-4ec0-b1f2-57ec9656a56e/cancel` → **200**

```json
{
  "command_id": "c277cc6c-fe03-4db0-94d3-ab923b09e34b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "99c3b918-562d-4ec0-b1f2-57ec9656a56e",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29479ee8-2183-400d-b56d-767a94aec066",
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
  "created_at": "2026-10-30T09:48:32.761929Z",
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
  "command_id": "9661c807-18d2-497a-a694-422c2602a3b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:33Z",
    "sequence": 1793353713952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f9056641-d7a6-4619-aa5a-edb22e3dc1f0",
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
  "last_heartbeat_at": "2026-10-30T09:48:33.971726Z",
  "last_location_at": "2026-10-30T09:48:33.971726Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5753"
}
```

```json
{
  "challenge_id": "f0b7a4c4-cd6e-41e9-ad42-9da3dbe48955",
  "expires_at": "2026-10-30T09:53:34.243719587Z",
  "resend_available_at": "2026-10-30T09:48:35.243719587Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "489102",
  "sent_at": "2026-10-30T09:48:34.247155788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0b7a4c4-cd6e-41e9-ad42-9da3dbe48955",
  "code": "489102",
  "device_ref": "sandbox-5753"
}
```

```json
{
  "session_id": "b2dd97d9-3b7e-4e8e-ac2e-cffec065e4ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDYxNCwiaWF0IjoxNzkzMzUzNzE0LCJqdGkiOiJlZjA3NmYxOC0zZGExLTRjZjctODdkYy05YTBhMTgxZjlhYzQiLCJzaWQiOiJiMmRkOTdkOS0zYjdlLTRlOGUtYWMyZS1jZmZlYzA2NWU0ZWQifQ.JG44Ez5VSaXwd_bXF0DQkQrtlvUMf13x8uIzdaVCdLY",
  "access_expires_at": "2026-10-30T10:03:34.554147305Z",
  "refresh_token": "0GfxifEMOIFsa352ICmMvy7ZHkye3Lam5hrULzkA_oM",
  "refresh_expires_at": "2026-11-29T09:48:34.553345926Z",
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
  "command_id": "c0f01703-f85b-4f7c-a2fb-e5a99b7e19a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:35Z",
    "sequence": 1793353715107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:35.126494Z",
  "last_location_at": "2026-10-30T09:48:35.126494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dda93cb8-c268-4a4e-86fa-b556615246fa",
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
  "id": "8d9281d8-e5d3-4758-afb9-d50d6bb337e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:35.416847Z",
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
  "command_id": "3cf481b0-17b5-43b0-a6dc-c646dc79286b",
  "quote_id": "8d9281d8-e5d3-4758-afb9-d50d6bb337e7",
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
  "id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29479ee8-2183-400d-b56d-767a94aec066",
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
  "created_at": "2026-10-30T09:48:35.718537Z",
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
    "id": "cd2f7bb6-e8b4-4772-ac68-bb3c71adf989",
    "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
    "expires_at": "2026-10-30T09:48:50.722217Z",
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

`POST /api/driver/v1/offers/cd2f7bb6-e8b4-4772-ac68-bb3c71adf989/accept` → **200**

```json
{
  "command_id": "51118e3c-2d63-40a1-abcd-ca8c5f728a01"
}
```

```json
{
  "id": "0ea7c324-847c-46fa-a44f-d017e8e245f0",
  "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "02a7f757-dd8d-458a-93b5-4a81cceae246",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "02a7f757-dd8d-458a-93b5-4a81cceae246",
  "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "assignment_id": "0ea7c324-847c-46fa-a44f-d017e8e245f0",
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

`POST /api/driver/v1/trips/02a7f757-dd8d-458a-93b5-4a81cceae246/cancel` → **200**

```json
{
  "command_id": "8a3b84b5-9777-401f-893a-8ef02f09f1a6",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "02a7f757-dd8d-458a-93b5-4a81cceae246",
  "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "assignment_id": "0ea7c324-847c-46fa-a44f-d017e8e245f0",
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

`GET /api/rider/v1/orders/44772d34-2783-43eb-85ba-a324bdc88d54` → **200**

```json
{
  "id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "29479ee8-2183-400d-b56d-767a94aec066",
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
    "id": "0ea7c324-847c-46fa-a44f-d017e8e245f0",
    "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "02a7f757-dd8d-458a-93b5-4a81cceae246",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:48:35.718537Z",
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
    "id": "f74593d6-c1b2-4de1-a692-00848ef9b21c",
    "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
    "expires_at": "2026-10-30T09:48:51.876869Z",
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

`POST /api/driver/v1/offers/f74593d6-c1b2-4de1-a692-00848ef9b21c/accept` → **200**

```json
{
  "command_id": "62af5b77-4ba1-415a-9f3d-c4ebca3f6df8"
}
```

```json
{
  "id": "508c4b43-971a-4785-963c-5f09fed0e65a",
  "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c838de8-b7e1-4514-9b7f-371323ebc8a9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c838de8-b7e1-4514-9b7f-371323ebc8a9",
  "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "assignment_id": "508c4b43-971a-4785-963c-5f09fed0e65a",
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

`POST /api/driver/v1/trips/0c838de8-b7e1-4514-9b7f-371323ebc8a9/cancel` → **200**

```json
{
  "command_id": "e5d23173-c3e6-4295-a04c-22952a419b69",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0c838de8-b7e1-4514-9b7f-371323ebc8a9",
  "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
  "assignment_id": "508c4b43-971a-4785-963c-5f09fed0e65a",
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
    "id": "44772d34-2783-43eb-85ba-a324bdc88d54",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:48:35.718537Z",
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
    "id": "99c3b918-562d-4ec0-b1f2-57ec9656a56e",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:48:32.761929Z",
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

`GET /api/operator/v1/orders/44772d34-2783-43eb-85ba-a324bdc88d54/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:48:35.719204Z",
      "actor": {
        "type": "CLIENT",
        "id": "29479ee8-2183-400d-b56d-767a94aec066",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
        "quote_id": "8d9281d8-e5d3-4758-afb9-d50d6bb337e7",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "17192d2c-a605-4c75-8189-e0ad9077a559"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:48:35.72132Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
        "attempt_id": "50692e7f-b9e8-4719-8f6d-f27203269a3e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "17192d2c-a605-4c75-8189-e0ad9077a559"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:48:35.728816Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cd2f7bb6-e8b4-4772-ac68-bb3c71adf989",
        "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "17192d2c-a605-4c75-8189-e0ad9077a559"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:48:36.299715Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cd2f7bb6-e8b4-4772-ac68-bb3c71adf989",
        "order_id": "44772d34-2783-43eb-85ba-a324bdc88d54",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0ea7c324-847c-46fa-a44f-d017e8e245f0"
      },
      "correlation_id": "0f76ea48-515e-4739-ad70-8d2787809648"
```

Done: orders 99c3b918-562d-4ec0-b1f2-57ec9656a56e, 44772d34-2783-43eb-85ba-a324bdc88d54.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737586679",
  "device_ref": "sandbox-1184"
}
```

```json
{
  "challenge_id": "cac74a6b-daf0-4e58-9946-81a38ad42205",
  "expires_at": "2026-10-30T09:53:39.202229766Z",
  "resend_available_at": "2026-10-30T09:48:40.202229766Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737586679` → **200**

```json
{
  "phone": "+380737586679",
  "audience": "CLIENT",
  "code": "672932",
  "sent_at": "2026-10-30T09:48:39.205320739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cac74a6b-daf0-4e58-9946-81a38ad42205",
  "code": "672932",
  "device_ref": "sandbox-1184"
}
```

```json
{
  "session_id": "752fc798-69cd-4f84-83f2-38b3895ccd28",
  "subject": {
    "type": "CLIENT",
    "id": "cfb229e2-092b-4bc8-a47a-472738eda81c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZmIyMjllMi0wOTJiLTRiYzgtYTQ3YS00NzI3MzhlZGE4MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjE5LCJpYXQiOjE3OTMzNTM3MTksImp0aSI6IjI4ZjU1YTJhLWQ5M2YtNDFhNi05YjhkLWE5YzdlOGI2YjZmYyIsInNpZCI6Ijc1MmZjNzk4LTY5Y2QtNGY4NC04M2YyLTM4YjM4OTVjY2QyOCJ9.4p3eh2s-JY2r1_ME78_6w6YIfvYtv9U46FA4BCcrdHU",
  "access_expires_at": "2026-10-30T10:03:39.508885145Z",
  "refresh_token": "p5ZKU6OGnCJWuGz0x0Q_sDDgW004FzvR9fZ-szDfyWw",
  "refresh_expires_at": "2026-11-29T09:48:39.508129822Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "90e5795d-cb2f-4daa-965e-718403c200a0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e49f28d7-6cad-4115-92d7-f65abf673e89",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e49f28d7-6cad-4115-92d7-f65abf673e89",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "caad4dbd23a362258999de6fa49bf7f7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e49f28d7-6cad-4115-92d7-f65abf673e89",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737586679"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e49f28d7-6cad-4115-92d7-f65abf673e89",
  "expires_at": "2026-10-30T10:18:39.803041Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e49f28d7-6cad-4115-92d7-f65abf673e89` → **200**

```json
{
  "id": "e49f28d7-6cad-4115-92d7-f65abf673e89",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:18:39.803041Z",
  "card": {
    "id": "9151c1c8-a062-4bdf-b9da-6a5a7f532d57",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0923",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:48:40.08933Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9151c1c8-a062-4bdf-b9da-6a5a7f532d57",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0923",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:48:40.08933Z"
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
  "device_ref": "sandbox-18046"
}
```

```json
{
  "challenge_id": "d827970c-82cd-473b-94d0-c57ad390f078",
  "expires_at": "2026-10-30T09:53:40.670244507Z",
  "resend_available_at": "2026-10-30T09:48:41.670244507Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "649243",
  "sent_at": "2026-10-30T09:48:40.67381875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d827970c-82cd-473b-94d0-c57ad390f078",
  "code": "649243",
  "device_ref": "sandbox-18046"
}
```

```json
{
  "session_id": "9c0f735c-61b1-4925-93ef-3a797c8133cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDYyMCwiaWF0IjoxNzkzMzUzNzIwLCJqdGkiOiJkMzJmNDFlNy0wNjkwLTRmZjEtOTYyMy05MTc1ZmVmNjkwYjgiLCJzaWQiOiI5YzBmNzM1Yy02MWIxLTQ5MjUtOTNlZi0zYTc5N2M4MTMzY2QifQ.4nUFpQadWKWHs273nlEEQEMO8Iq_ICQ4E_w00jGpq6o",
  "access_expires_at": "2026-10-30T10:03:40.993919572Z",
  "refresh_token": "wpiinqqwi5nuBQTo6YLUJwLKMPj1YSvuvsHvwNB3QkE",
  "refresh_expires_at": "2026-11-29T09:48:40.992907851Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:35.126494Z",
  "last_location_at": "2026-10-30T09:48:35.126494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb/handover` → **200**

```json
{
  "command_id": "87f8abc9-e34f-405b-95c3-4884f74e28a4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:35.126494Z",
  "last_location_at": "2026-10-30T09:48:35.126494Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:41Z",
    "sequence": 1793353721935
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:41.95624Z",
  "last_location_at": "2026-10-30T09:48:41.95624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fbdbbad8-43ab-46fe-a9f2-4d9ce01d1dd6",
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
  "id": "f64d7de1-95fe-424b-96af-618d1188cdde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:42.239647Z",
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
  "command_id": "833f1be3-a32a-4291-8ac5-5d4ddb43f0ec",
  "quote_id": "f64d7de1-95fe-424b-96af-618d1188cdde",
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
  "id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
  "created_at": "2026-10-30T09:48:42.534265Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf` → **200**

```json
{
  "id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
  "created_at": "2026-10-30T09:48:42.534265Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf` → **200**

```json
{
  "id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
  "created_at": "2026-10-30T09:48:42.534265Z",
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
    "id": "de26656d-8e87-4c56-b759-6cf6a7497ab5",
    "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
    "expires_at": "2026-10-30T09:48:58.132665Z",
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

`POST /api/driver/v1/offers/de26656d-8e87-4c56-b759-6cf6a7497ab5/accept` → **200**

```json
{
  "command_id": "d53d5ec4-98cc-445b-a264-e95a0db8a792"
}
```

```json
{
  "id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "assignment_id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
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

`POST /api/driver/v1/work-sessions/5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:45Z",
    "sequence": 1793353725258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:45.277775Z",
  "last_location_at": "2026-10-30T09:48:45.277775Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb/arrive` → **200**

```json
{
  "command_id": "907388b5-e6f3-4aea-a4f3-ab074cff0dc6",
  "expected_version": 0
}
```

```json
{
  "id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "assignment_id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
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
  "arrived_at": "2026-10-30T09:48:45.573479Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb/start` → **200**

```json
{
  "command_id": "00c737ab-3e7a-4a2f-a28a-ad82dcb256c1",
  "expected_version": 1
}
```

```json
{
  "id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "assignment_id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
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
  "arrived_at": "2026-10-30T09:48:45.573479Z",
  "started_at": "2026-10-30T09:48:45.868408Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb/complete` → **200**

```json
{
  "command_id": "fe855ec3-45f3-4ce4-9baa-f901fb9b0c6d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:46Z",
  "cash_received": true
}
```

```json
{
  "id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "assignment_id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
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
  "arrived_at": "2026-10-30T09:48:45.573479Z",
  "started_at": "2026-10-30T09:48:45.868408Z",
  "completed_at": "2026-10-30T09:48:46.168249Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf` → **200**

```json
{
  "id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
    "id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
    "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:48:42.534265Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf` → **200**

```json
{
  "id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
    "id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
    "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:48:42.534265Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf` → **200**

```json
{
  "id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
    "id": "d872dc65-490a-4abc-a6cd-82449efa9d30",
    "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cc3d5af9-10c9-4a23-89e1-41cbdd6aefcb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:48:42.534265Z",
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

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf/tip` → **200**

```json
{
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
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
  "available_until": "2026-10-31T09:48:46.168249Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf/tip` → **201**

```json
{
  "command_id": "f81c347a-6892-4d37-8388-b56ddf6cfe4c",
  "amount_minor": 2500
}
```

```json
{
  "id": "3f58df77-592f-4e37-b5ef-9c6c9284ed1f",
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:48:49.907948Z"
}
```

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf/tip` → **200**

```json
{
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
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
  "available_until": "2026-10-31T09:48:46.168249Z",
  "open": false,
  "tip": {
    "id": "3f58df77-592f-4e37-b5ef-9c6c9284ed1f",
    "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:48:49.907948Z"
  }
}
```

`GET /api/rider/v1/orders/fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf/tip` → **200**

```json
{
  "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
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
  "available_until": "2026-10-31T09:48:46.168249Z",
  "open": false,
  "tip": {
    "id": "3f58df77-592f-4e37-b5ef-9c6c9284ed1f",
    "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:48:49.907948Z"
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
      "id": "59b5d87f-1529-496c-ba47-f3fb2b0ab8df",
      "at": "2026-10-30T09:48:51.285379Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
      "counterpart_id": null
    },
    {
      "id": "28879ad2-66ac-47de-b114-4eb76f0d90e8",
      "at": "2026-10-30T09:48:46.220288Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d8522ca-5f6a-491a-956f-89eedf667644",
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
  "id": "e09ddee4-dd75-4517-8dcd-a3a8b494b783",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:53:52.030970Z",
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
  "session_id": "f140f1af-4965-442d-91ab-e0147a23c021",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2MzIsImlhdCI6MTc5MzM1MzczMiwianRpIjoiODk2ZDQ0NjYtMmQyNi00ZTg4LWE5NWQtN2ZlNDNkNTBkYTY3Iiwic2lkIjoiZjE0MGYxYWYtNDk2NS00NDJkLTkxYWItZTAxNDdhMjNjMDIxIn0.tEotFrkDNWhUC0BD8DNtLMdjbc7Pa-y-4ANd_OGGmVY",
  "access_expires_at": "2026-10-30T10:03:52.615212268Z",
  "refresh_token": "-POImPiz8mVHcv6KIZPPaCywslVkaJshUVQAuxhRtR4",
  "refresh_expires_at": "2026-10-30T21:48:52.614644745Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737586679` → **200**

```json
{
  "client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c"
}
```

`POST /api/admin/v1/rider-wallets/cfb229e2-092b-4bc8-a47a-472738eda81c/top-ups` → **201**

```json
{
  "command_id": "03953399-a43f-44ca-968a-2d9267f410e0",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
      "id": "4f2901ef-bc7c-45ef-b890-345bbf04373a",
      "at": "2026-10-30T09:48:53.160245Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "96582e15-10ca-4626-95c4-5ae942218544",
  "quote_id": "e09ddee4-dd75-4517-8dcd-a3a8b494b783",
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
  "id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
  "created_at": "2026-10-30T09:48:53.473493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e8381031-b79d-4855-ab35-e7b94d471d53` → **200**

```json
{
  "id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
  "created_at": "2026-10-30T09:48:53.473493Z",
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
    "id": "921a86a2-42ea-4b7b-becf-04a641f4188c",
    "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
    "expires_at": "2026-10-30T09:49:08.479201Z",
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

`POST /api/driver/v1/offers/921a86a2-42ea-4b7b-becf-04a641f4188c/accept` → **200**

```json
{
  "command_id": "42923969-7e1e-4f79-9da4-dfad6fa729a0"
}
```

```json
{
  "id": "56431739-fce2-414c-8458-1e2f5d22f3df",
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "96bced9b-5fa7-47a5-b736-8954a355dd78",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "96bced9b-5fa7-47a5-b736-8954a355dd78",
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "assignment_id": "56431739-fce2-414c-8458-1e2f5d22f3df",
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

`POST /api/driver/v1/work-sessions/5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:48:54Z",
    "sequence": 1793353734915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:54.935143Z",
  "last_location_at": "2026-10-30T09:48:54.935143Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/96bced9b-5fa7-47a5-b736-8954a355dd78/arrive` → **200**

```json
{
  "command_id": "bc52576c-3231-43d2-91eb-2f70ea18b859",
  "expected_version": 0
}
```

```json
{
  "id": "96bced9b-5fa7-47a5-b736-8954a355dd78",
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "assignment_id": "56431739-fce2-414c-8458-1e2f5d22f3df",
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
  "arrived_at": "2026-10-30T09:48:55.215214Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/96bced9b-5fa7-47a5-b736-8954a355dd78/start` → **200**

```json
{
  "command_id": "88aa6641-f44d-4828-9598-28cccd880096",
  "expected_version": 1
}
```

```json
{
  "id": "96bced9b-5fa7-47a5-b736-8954a355dd78",
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "assignment_id": "56431739-fce2-414c-8458-1e2f5d22f3df",
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
  "arrived_at": "2026-10-30T09:48:55.215214Z",
  "started_at": "2026-10-30T09:48:55.514481Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/96bced9b-5fa7-47a5-b736-8954a355dd78/complete` → **200**

```json
{
  "command_id": "3322bfc7-4953-4a60-a2b8-229b38f790df",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:48:55Z",
  "cash_received": true
}
```

```json
{
  "id": "96bced9b-5fa7-47a5-b736-8954a355dd78",
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "assignment_id": "56431739-fce2-414c-8458-1e2f5d22f3df",
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
  "arrived_at": "2026-10-30T09:48:55.215214Z",
  "started_at": "2026-10-30T09:48:55.514481Z",
  "completed_at": "2026-10-30T09:48:55.802218Z",
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
  "client_id": "cfb229e2-092b-4bc8-a47a-472738eda81c",
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
      "id": "4f2901ef-bc7c-45ef-b890-345bbf04373a",
      "at": "2026-10-30T09:48:53.160245Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
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

`GET /api/rider/v1/orders/e8381031-b79d-4855-ab35-e7b94d471d53/tip` → **200**

```json
{
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
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
  "available_until": "2026-10-31T09:48:55.802218Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e8381031-b79d-4855-ab35-e7b94d471d53/tip` → **201**

```json
{
  "command_id": "aced5aca-d764-49f7-b92e-0d88355370ce",
  "amount_minor": 2500
}
```

```json
{
  "id": "25bd7df2-b4d2-44cf-9f59-1c9e638296bb",
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:48:56.925763Z"
}
```

`GET /api/rider/v1/orders/e8381031-b79d-4855-ab35-e7b94d471d53/tip` → **200**

```json
{
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
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
  "available_until": "2026-10-31T09:48:55.802218Z",
  "open": false,
  "tip": {
    "id": "25bd7df2-b4d2-44cf-9f59-1c9e638296bb",
    "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:48:56.925763Z"
  }
}
```

`GET /api/rider/v1/orders/e8381031-b79d-4855-ab35-e7b94d471d53/tip` → **200**

```json
{
  "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
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
  "available_until": "2026-10-31T09:48:55.802218Z",
  "open": false,
  "tip": {
    "id": "25bd7df2-b4d2-44cf-9f59-1c9e638296bb",
    "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:48:56.925763Z"
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
      "id": "7009923d-04e5-411e-a20e-c2463488b82f",
      "at": "2026-10-30T09:48:58.359112Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
      "counterpart_id": null
    },
    {
      "id": "a94ac7c4-de72-4ec6-9597-64af8a6efc39",
      "at": "2026-10-30T09:48:56.323757Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e8381031-b79d-4855-ab35-e7b94d471d53",
      "counterpart_id": null
    },
    {
      "id": "59b5d87f-1529-496c-ba47-f3fb2b0ab8df",
      "at": "2026-10-30T09:48:51.285379Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
      "counterpart_id": null
    },
    {
      "id": "28879ad2-66ac-47de-b114-4eb76f0d90e8",
      "at": "2026-10-30T09:48:46.220288Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fc52fc4f-13e2-4bc4-80ec-b4ad038ecdbf",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb",
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
  "last_heartbeat_at": "2026-10-30T09:48:54.935143Z",
  "last_location_at": "2026-10-30T09:48:54.935143Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5fbd0a0e-1818-4b87-a91a-fdd1dddd71eb/close` → **200**

```json
{
  "command_id": "fc2f4535-02e4-4540-9e34-42f6946fe4c7",
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

Done: card order e8381031-b79d-4855-ab35-e7b94d471d53.

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
  "phone": "+380732567377",
  "device_ref": "sandbox-20091"
}
```

```json
{
  "challenge_id": "9c3ea1fc-9acf-4779-8a38-63671379c362",
  "expires_at": "2026-10-30T09:53:59.918180419Z",
  "resend_available_at": "2026-10-30T09:49:00.918180419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732567377` → **200**

```json
{
  "phone": "+380732567377",
  "audience": "CLIENT",
  "code": "164652",
  "sent_at": "2026-10-30T09:48:59.922162236Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c3ea1fc-9acf-4779-8a38-63671379c362",
  "code": "164652",
  "device_ref": "sandbox-20091"
}
```

```json
{
  "session_id": "6d670c1f-ca53-48ab-adf3-3cd8616bff02",
  "subject": {
    "type": "CLIENT",
    "id": "ece9b8b2-c7e9-449e-957f-b3fe9942fd58"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlY2U5YjhiMi1jN2U5LTQ0OWUtOTU3Zi1iM2ZlOTk0MmZkNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjQwLCJpYXQiOjE3OTMzNTM3NDAsImp0aSI6IjMwNzkyOGQ1LTQ0ZGYtNDBkMy1iMGI2LWE1NTRhZGRkZWEyZSIsInNpZCI6IjZkNjcwYzFmLWNhNTMtNDhhYi1hZGYzLTNjZDg2MTZiZmYwMiJ9.OGaV4hqX4Bu_vvnD2aBgqpVJmKn1qwMDfi6G9QCSfKI",
  "access_expires_at": "2026-10-30T10:04:00.238050066Z",
  "refresh_token": "jNmaZ7H61GvzgBTz8-O8ol8yWN_k2au_qlW6xsu5J_4",
  "refresh_expires_at": "2026-11-29T09:49:00.237403726Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "0da65c98-4143-4370-bb49-16f4a5ea08c6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "058eb663-92eb-49f4-9c15-1aaf5a728293",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-058eb663-92eb-49f4-9c15-1aaf5a728293",
    "orderDate": "1793353740",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3c45449334f94cd9dd6f41175fb70603",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=058eb663-92eb-49f4-9c15-1aaf5a728293",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732567377"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=058eb663-92eb-49f4-9c15-1aaf5a728293",
  "created_at": "2026-10-30T09:49:00.518493Z",
  "expires_at": "2026-10-30T10:19:00.518493Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/058eb663-92eb-49f4-9c15-1aaf5a728293` → **200**

```json
{
  "id": "058eb663-92eb-49f4-9c15-1aaf5a728293",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:49:00.518493Z",
  "expires_at": "2026-10-30T10:19:00.518493Z",
  "completed_at": "2026-10-30T09:49:00.801672Z",
  "masked_pan": "41****0111",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ece9b8b2-c7e9-449e-957f-b3fe9942fd58",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ece9b8b2-c7e9-449e-957f-b3fe9942fd58",
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
      "id": "5070f58d-7a27-4e0c-8537-641c792605b0",
      "at": "2026-10-30T09:49:01.37447Z",
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
  "client_id": "ece9b8b2-c7e9-449e-957f-b3fe9942fd58",
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
      "id": "5070f58d-7a27-4e0c-8537-641c792605b0",
      "at": "2026-10-30T09:49:01.37447Z",
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
  "device_ref": "sandbox-766"
}
```

```json
{
  "challenge_id": "07104430-4492-4a5f-87bc-2383e114cefe",
  "expires_at": "2026-10-30T09:54:02.944320966Z",
  "resend_available_at": "2026-10-30T09:49:03.944320966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "399637",
  "sent_at": "2026-10-30T09:49:02.947422884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07104430-4492-4a5f-87bc-2383e114cefe",
  "code": "399637",
  "device_ref": "sandbox-766"
}
```

```json
{
  "session_id": "4ce9091d-508a-4eba-9088-10f0d5ff8f7b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY0MywiaWF0IjoxNzkzMzUzNzQzLCJqdGkiOiJhYWFiYTdkZC00ODdlLTRmZDMtOTFlOC0wZjQwMWI1MGUyODQiLCJzaWQiOiI0Y2U5MDkxZC01MDhhLTRlYmEtOTA4OC0xMGYwZDVmZjhmN2IifQ.QTyleelF_-HJE_Ms1AWT2Tt57E4PUkSpXBjEDovMHvM",
  "access_expires_at": "2026-10-30T10:04:03.251786231Z",
  "refresh_token": "feMkOhxH4c4EgBj-WY4xa4hvZgU-hdkd_txGomIaLL8",
  "refresh_expires_at": "2026-11-29T09:49:03.251091351Z",
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
  "command_id": "925a424f-42fa-43f4-be10-359a954594fd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "a37b4b19-944a-4043-b587-affe712d3fba",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a37b4b19-944a-4043-b587-affe712d3fba",
    "orderDate": "1793353743",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "45a72b23d138a1b1b28b9af590df3c3d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a37b4b19-944a-4043-b587-affe712d3fba",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a37b4b19-944a-4043-b587-affe712d3fba",
  "created_at": "2026-10-30T09:49:03.809501Z",
  "expires_at": "2026-10-30T10:19:03.809501Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/a37b4b19-944a-4043-b587-affe712d3fba` → **200**

```json
{
  "id": "a37b4b19-944a-4043-b587-affe712d3fba",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:49:03.809501Z",
  "expires_at": "2026-10-30T10:19:03.809501Z",
  "completed_at": "2026-10-30T09:49:04.09339Z",
  "masked_pan": "41****2483",
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
      "id": "f80d6c40-9fa3-4921-8481-08a6093abf85",
      "at": "2026-10-30T09:49:04.384225Z",
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
  "command_id": "3f2923f2-70c3-41c1-8a20-503f963ee035",
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
  "correlation_id": "4d161498-5a7b-482e-8b78-55eb90c97a0e"
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
  "device_ref": "sandbox-10904"
}
```

```json
{
  "challenge_id": "f2f7910f-b717-4edc-893f-2d6a1673b51d",
  "expires_at": "2026-10-30T09:54:04.96565382Z",
  "resend_available_at": "2026-10-30T09:49:05.96565382Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "855414",
  "sent_at": "2026-10-30T09:49:04.970755741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2f7910f-b717-4edc-893f-2d6a1673b51d",
  "code": "855414",
  "device_ref": "sandbox-10904"
}
```

```json
{
  "session_id": "b8f6759c-97d8-41ae-aec9-3ad8df0fa590",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY0NSwiaWF0IjoxNzkzMzUzNzQ1LCJqdGkiOiJjZjllMWViMy0zYmY4LTQ2MWItYjgyMC05OWI0NzI4OWExODAiLCJzaWQiOiJiOGY2NzU5Yy05N2Q4LTQxYWUtYWVjOS0zYWQ4ZGYwZmE1OTAifQ.cs62CeVeupm-5dGBRk3gLnv5tMKyse9ngAlJVeV6s7w",
  "access_expires_at": "2026-10-30T10:04:05.275011155Z",
  "refresh_token": "Or9Z65jA6o_ZJ2LYYnDSrH-dQ2PxhXh-avCUHUpBjj0",
  "refresh_expires_at": "2026-11-29T09:49:05.274485025Z",
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
  "command_id": "9516d469-ba08-4478-9005-a35cdcf6e6c2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:05Z",
    "sequence": 1793353745824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3439a731-08f8-4d7d-b621-98a75de9d3e9",
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
  "last_heartbeat_at": "2026-10-30T09:49:05.843669Z",
  "last_location_at": "2026-10-30T09:49:05.843669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630055350",
  "device_ref": "sandbox-7372"
}
```

```json
{
  "challenge_id": "c9f1103a-558e-4fc5-8e1d-cdc1d60fee87",
  "expires_at": "2026-10-30T09:54:06.123119932Z",
  "resend_available_at": "2026-10-30T09:49:07.123119932Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630055350` → **200**

```json
{
  "phone": "+380630055350",
  "audience": "CLIENT",
  "code": "275882",
  "sent_at": "2026-10-30T09:49:06.126384234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9f1103a-558e-4fc5-8e1d-cdc1d60fee87",
  "code": "275882",
  "device_ref": "sandbox-7372"
}
```

```json
{
  "session_id": "28eed8ac-408d-45b0-aacd-398516db42d9",
  "subject": {
    "type": "CLIENT",
    "id": "4e4a8102-095a-405e-aab4-d7ccbc15973a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTRhODEwMi0wOTVhLTQwNWUtYWFiNC1kN2NjYmMxNTk3M2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjQ2LCJpYXQiOjE3OTMzNTM3NDYsImp0aSI6Ijg3NmQ3MTUwLTRkMWItNGQ5Ni05MDVlLTAzNzI1ZDlkY2ZhYSIsInNpZCI6IjI4ZWVkOGFjLTQwOGQtNDViMC1hYWNkLTM5ODUxNmRiNDJkOSJ9.66sJlVh5fBgnITk6NUH_70IQMuLXuS0choY94ryN0zk",
  "access_expires_at": "2026-10-30T10:04:06.427048834Z",
  "refresh_token": "9jYV-4WqdNz9FRXUJGG4QdI9woMc-xtLN_Jnbju9ir4",
  "refresh_expires_at": "2026-11-29T09:49:06.426563581Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e9a2eb5-dd81-4817-ab63-7a304944affc",
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
  "id": "14601a8f-349a-4f99-845f-f486966bfb83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:06.714165Z",
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
  "command_id": "367aee06-98ad-4193-a591-caed1cf0e633",
  "quote_id": "14601a8f-349a-4f99-845f-f486966bfb83",
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
  "id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4e4a8102-095a-405e-aab4-d7ccbc15973a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:49:06.999458Z",
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
    "id": "2aab17ac-4468-47c0-87a0-fc444619cd9e",
    "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
    "expires_at": "2026-10-30T09:49:22.003077Z",
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

`POST /api/driver/v1/offers/2aab17ac-4468-47c0-87a0-fc444619cd9e/accept` → **200**

```json
{
  "command_id": "3a90ca9c-76de-4a8a-b635-541a6408d769"
}
```

```json
{
  "id": "dd42e74a-36e4-4f7b-845e-9eb1808b1dc6",
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7efb6e87-d4f5-495e-b27c-d812c7e0f3d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7efb6e87-d4f5-495e-b27c-d812c7e0f3d3",
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "assignment_id": "dd42e74a-36e4-4f7b-845e-9eb1808b1dc6",
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

`POST /api/driver/v1/work-sessions/3439a731-08f8-4d7d-b621-98a75de9d3e9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:08Z",
    "sequence": 1793353748133
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3439a731-08f8-4d7d-b621-98a75de9d3e9",
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
  "last_heartbeat_at": "2026-10-30T09:49:08.151922Z",
  "last_location_at": "2026-10-30T09:49:08.151922Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7efb6e87-d4f5-495e-b27c-d812c7e0f3d3/arrive` → **200**

```json
{
  "command_id": "b8e43134-d5b2-44cc-ba22-ee05c652db45",
  "expected_version": 0
}
```

```json
{
  "id": "7efb6e87-d4f5-495e-b27c-d812c7e0f3d3",
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "assignment_id": "dd42e74a-36e4-4f7b-845e-9eb1808b1dc6",
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
  "arrived_at": "2026-10-30T09:49:08.450155Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7efb6e87-d4f5-495e-b27c-d812c7e0f3d3/start` → **200**

```json
{
  "command_id": "ad962e4f-4a95-4d9b-8610-c15930153110",
  "expected_version": 1
}
```

```json
{
  "id": "7efb6e87-d4f5-495e-b27c-d812c7e0f3d3",
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "assignment_id": "dd42e74a-36e4-4f7b-845e-9eb1808b1dc6",
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
  "arrived_at": "2026-10-30T09:49:08.450155Z",
  "started_at": "2026-10-30T09:49:08.739467Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7efb6e87-d4f5-495e-b27c-d812c7e0f3d3/complete` → **200**

```json
{
  "command_id": "ea5fbbb8-7b0b-46ad-87c9-bdd02fb936a5",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:49:09Z",
  "cash_received": false
}
```

```json
{
  "id": "7efb6e87-d4f5-495e-b27c-d812c7e0f3d3",
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "assignment_id": "dd42e74a-36e4-4f7b-845e-9eb1808b1dc6",
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
  "arrived_at": "2026-10-30T09:49:08.450155Z",
  "started_at": "2026-10-30T09:49:08.739467Z",
  "completed_at": "2026-10-30T09:49:09.0319Z",
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
  "session_id": "bb7b4699-286a-47ff-a5f6-25f24d284010",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NDksImlhdCI6MTc5MzM1Mzc0OSwianRpIjoiNTA3NDE5OTctM2NiYy00YTM4LThhZmItYmZjOTM3NmQxYzExIiwic2lkIjoiYmI3YjQ2OTktMjg2YS00N2ZmLWE1ZjYtMjVmMjRkMjg0MDEwIn0.vErZGHyBv6FpBPa_kSURQ-ixFAV36F-pjQrdFhtHeeo",
  "access_expires_at": "2026-10-30T10:04:09.610954687Z",
  "refresh_token": "E_TBr7pYc7VukVAwD4OaJf4TGYwtlglEQbIdyP7v8Rs",
  "refresh_expires_at": "2026-10-30T21:49:09.610413508Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/56abc621-611c-4971-83d1-a2dba2bdf31c/cash-dispute` → **200**

```json
{
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4e4a8102-095a-405e-aab4-d7ccbc15973a",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:49:09.435825Z",
  "decide_by": "2026-11-13T09:49:09.435825Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:49:09.435825Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "4e4a8102-095a-405e-aab4-d7ccbc15973a",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:49:09.435825Z",
      "decide_by": "2026-11-13T09:49:09.435825Z",
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

`POST /api/admin/v1/orders/56abc621-611c-4971-83d1-a2dba2bdf31c/cash-dispute/decide` → **400**

```json
{
  "command_id": "4f4846b4-249e-46d2-aeef-c710e71326fb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/56abc621-611c-4971-83d1-a2dba2bdf31c/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2866437c-50a9-4a74-9bd5-a8e2930136ac",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/56abc621-611c-4971-83d1-a2dba2bdf31c/cash-dispute/decide` → **200**

```json
{
  "command_id": "4c9fbb17-c167-44f6-bbf6-4b1b35492176",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4e4a8102-095a-405e-aab4-d7ccbc15973a",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:49:09.435825Z",
  "decide_by": "2026-11-13T09:49:09.435825Z",
  "decision": "PAY_DRIVER",
  "decided_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:49:10.801674Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/56abc621-611c-4971-83d1-a2dba2bdf31c/cash-dispute/decide` → **409**

```json
{
  "command_id": "b9597b8a-9ceb-4bd1-87ad-23b042e90c38",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/56abc621-611c-4971-83d1-a2dba2bdf31c/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f4964f86-1fe2-4c38-9d55-a31f30bad4cd"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3439a731-08f8-4d7d-b621-98a75de9d3e9",
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
  "last_heartbeat_at": "2026-10-30T09:49:08.151922Z",
  "last_location_at": "2026-10-30T09:49:08.151922Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3439a731-08f8-4d7d-b621-98a75de9d3e9/close` → **200**

```json
{
  "command_id": "873234fa-2046-466a-aea6-2c06d86746de",
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
  "phone": "+380731286088",
  "device_ref": "sandbox-15495"
}
```

```json
{
  "challenge_id": "cf819b79-3f2e-443d-9379-0cc30b9eed61",
  "expires_at": "2026-10-30T09:54:11.946418116Z",
  "resend_available_at": "2026-10-30T09:49:12.946418116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731286088` → **200**

```json
{
  "phone": "+380731286088",
  "audience": "CLIENT",
  "code": "978811",
  "sent_at": "2026-10-30T09:49:11.949171068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf819b79-3f2e-443d-9379-0cc30b9eed61",
  "code": "978811",
  "device_ref": "sandbox-15495"
}
```

```json
{
  "session_id": "3d969a77-d14a-4a68-8e61-025ca6ae37f3",
  "subject": {
    "type": "CLIENT",
    "id": "350b2712-1ab6-44b8-844f-8916395472f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTBiMjcxMi0xYWI2LTQ0YjgtODQ0Zi04OTE2Mzk1NDcyZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjUyLCJpYXQiOjE3OTMzNTM3NTIsImp0aSI6IjQwMmQ1ZjJkLWMzZTYtNDA2MS04MDgyLTJjODA3NjExMjI3NyIsInNpZCI6IjNkOTY5YTc3LWQxNGEtNGE2OC04ZTYxLTAyNWNhNmFlMzdmMyJ9.aRpm_U0qDFIZBZLS7JzulngEOUTDK_PjI3jscl4qh7c",
  "access_expires_at": "2026-10-30T10:04:12.258859931Z",
  "refresh_token": "tNYInUg0dTqmiJcNHn5zZqrdkz9U8wKnCx1g4fPZPa4",
  "refresh_expires_at": "2026-11-29T09:49:12.258290347Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f5ae12fd-f6d1-4cbf-a128-6c126040e2f1",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ef941ecd-42f5-43dd-ac6c-e28fd94edfbd",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ef941ecd-42f5-43dd-ac6c-e28fd94edfbd",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "513a2366257585958fdc3c86306ec337",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ef941ecd-42f5-43dd-ac6c-e28fd94edfbd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731286088"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ef941ecd-42f5-43dd-ac6c-e28fd94edfbd",
  "expires_at": "2026-10-30T10:19:12.546982Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ef941ecd-42f5-43dd-ac6c-e28fd94edfbd` → **200**

```json
{
  "id": "ef941ecd-42f5-43dd-ac6c-e28fd94edfbd",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:19:12.546982Z",
  "card": {
    "id": "b1d428c0-ed2c-4e74-8598-f38be1c85320",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0982",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:49:12.837474Z"
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
  "device_ref": "sandbox-19118"
}
```

```json
{
  "challenge_id": "2934ae5e-8803-41e1-afb8-9402181a00aa",
  "expires_at": "2026-10-30T09:54:13.131605076Z",
  "resend_available_at": "2026-10-30T09:49:14.131605076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "483827",
  "sent_at": "2026-10-30T09:49:13.134136996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2934ae5e-8803-41e1-afb8-9402181a00aa",
  "code": "483827",
  "device_ref": "sandbox-19118"
}
```

```json
{
  "session_id": "676b9f95-2add-4c6f-b502-f54e65e3807a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDY1MywiaWF0IjoxNzkzMzUzNzUzLCJqdGkiOiJjZDUxM2Q5Mi0yZjE1LTQ1MTgtYTZkYi1iOTUwMTJiYzk1YmYiLCJzaWQiOiI2NzZiOWY5NS0yYWRkLTRjNmYtYjUwMi1mNTRlNjVlMzgwN2EifQ.m9mw6TSoaeM6IkRan8YzZGJeurwRK-k_X8qP1KQZivs",
  "access_expires_at": "2026-10-30T10:04:13.433350817Z",
  "refresh_token": "slfNeS-CNrLL3mUcHszVaFOaqfMvaOFzG-zTnP6bjmw",
  "refresh_expires_at": "2026-11-29T09:49:13.432784879Z",
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
  "command_id": "86ae3f83-62e4-4daf-9681-376f62ffa964",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:13Z",
    "sequence": 1793353753978
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f39d962-b789-4de2-a956-e2dff027851e",
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
  "last_heartbeat_at": "2026-10-30T09:49:13.9979Z",
  "last_location_at": "2026-10-30T09:49:13.9979Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "158ae0d4-c442-4249-8d2a-1ef7359b888a",
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
  "id": "30ad8821-bab7-4bde-aa02-19fde366b9c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:14.296082Z",
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
  "command_id": "f83b6f5e-4950-4dd2-9b8c-c5b4d05a65dd",
  "quote_id": "30ad8821-bab7-4bde-aa02-19fde366b9c7",
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
  "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "350b2712-1ab6-44b8-844f-8916395472f6",
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
  "created_at": "2026-10-30T09:49:14.592963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee` → **200**

```json
{
  "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "350b2712-1ab6-44b8-844f-8916395472f6",
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
  "created_at": "2026-10-30T09:49:14.592963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee` → **200**

```json
{
  "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "350b2712-1ab6-44b8-844f-8916395472f6",
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
  "created_at": "2026-10-30T09:49:14.592963Z",
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
    "id": "ce5ee9e4-92f4-48e0-9ade-289131f3b1be",
    "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
    "expires_at": "2026-10-30T09:49:30.47591Z",
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

`POST /api/driver/v1/offers/ce5ee9e4-92f4-48e0-9ade-289131f3b1be/accept` → **200**

```json
{
  "command_id": "4b734ee6-3f00-47b6-b765-7bd4163f35d2"
}
```

```json
{
  "id": "b071a71d-e45d-43ea-8de4-be52799029a0",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bea043dd-0277-447d-be61-e092246b9aff",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bea043dd-0277-447d-be61-e092246b9aff",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "assignment_id": "b071a71d-e45d-43ea-8de4-be52799029a0",
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

`POST /api/rider/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/messages` → **201**

```json
{
  "command_id": "47ead644-d0e9-4d88-bcce-eac57966a9f7",
  "body": "Я біля входу, мій номер +380731286088, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "daddf604-7e05-4255-b7a0-ea779149f61c",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731286088, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:49:17.313767337Z"
}
```

`POST /api/driver/v1/trips/bea043dd-0277-447d-be61-e092246b9aff/messages` → **201**

```json
{
  "command_id": "412c2910-a12e-4414-bceb-684e0ac7aa49",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "c4ad1805-b09f-4dc6-9b93-23c9a805679c",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:49:17.599280466Z"
}
```

`POST /api/driver/v1/work-sessions/6f39d962-b789-4de2-a956-e2dff027851e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:17Z",
    "sequence": 1793353757868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f39d962-b789-4de2-a956-e2dff027851e",
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
  "last_heartbeat_at": "2026-10-30T09:49:17.887708Z",
  "last_location_at": "2026-10-30T09:49:17.887708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bea043dd-0277-447d-be61-e092246b9aff/arrive` → **200**

```json
{
  "command_id": "8e524617-f1b3-416e-8f53-c42724b1793c",
  "expected_version": 0
}
```

```json
{
  "id": "bea043dd-0277-447d-be61-e092246b9aff",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "assignment_id": "b071a71d-e45d-43ea-8de4-be52799029a0",
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
  "arrived_at": "2026-10-30T09:49:18.166553Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bea043dd-0277-447d-be61-e092246b9aff/start` → **200**

```json
{
  "command_id": "2d3f0fed-a248-4de4-8d2d-8f1f62d3505e",
  "expected_version": 1
}
```

```json
{
  "id": "bea043dd-0277-447d-be61-e092246b9aff",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "assignment_id": "b071a71d-e45d-43ea-8de4-be52799029a0",
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
  "arrived_at": "2026-10-30T09:49:18.166553Z",
  "started_at": "2026-10-30T09:49:18.472572Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6f39d962-b789-4de2-a956-e2dff027851e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:49:18Z",
    "sequence": 1793353758751
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f39d962-b789-4de2-a956-e2dff027851e",
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
  "last_heartbeat_at": "2026-10-30T09:49:18.770099Z",
  "last_location_at": "2026-10-30T09:49:18.770099Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bea043dd-0277-447d-be61-e092246b9aff/complete` → **200**

```json
{
  "command_id": "86bbd521-fc2f-4563-80bf-88117e1ee9da",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:49:19Z",
  "cash_received": false
}
```

```json
{
  "id": "bea043dd-0277-447d-be61-e092246b9aff",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "assignment_id": "b071a71d-e45d-43ea-8de4-be52799029a0",
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
  "arrived_at": "2026-10-30T09:49:18.166553Z",
  "started_at": "2026-10-30T09:49:18.472572Z",
  "completed_at": "2026-10-30T09:49:19.054222Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee` → **200**

```json
{
  "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "350b2712-1ab6-44b8-844f-8916395472f6",
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
    "id": "b071a71d-e45d-43ea-8de4-be52799029a0",
    "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bea043dd-0277-447d-be61-e092246b9aff",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:14.592963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee` → **200**

```json
{
  "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "350b2712-1ab6-44b8-844f-8916395472f6",
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
    "id": "b071a71d-e45d-43ea-8de4-be52799029a0",
    "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bea043dd-0277-447d-be61-e092246b9aff",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:49:14.592963Z",
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
  "session_id": "6f39d962-b789-4de2-a956-e2dff027851e",
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
  "last_heartbeat_at": "2026-10-30T09:49:18.770099Z",
  "last_location_at": "2026-10-30T09:49:18.770099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6f39d962-b789-4de2-a956-e2dff027851e/close` → **200**

```json
{
  "command_id": "3d2047eb-505a-4891-b697-26fdd9003f83",
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
  "session_id": "c22c05dc-c557-4c43-95b3-7c15d43bccc5",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NjEsImlhdCI6MTc5MzM1Mzc2MSwianRpIjoiNjU4NGQwN2YtNTRiMy00M2YwLThkMTQtNGFmMmUzMDg2YTUxIiwic2lkIjoiYzIyYzA1ZGMtYzU1Ny00YzQzLTk1YjMtN2MxNWQ0M2JjY2M1In0.NTXA9OAPf8l4kJXXQW-lx4cBwO4kmEEOFeZ3E8rP5v8",
  "access_expires_at": "2026-10-30T10:04:21.777121693Z",
  "refresh_token": "A8bQQS3HuLK5UnscKiPj1nc-x68ooljGB8-2F8kOM5k",
  "refresh_expires_at": "2026-10-30T21:49:21.776597898Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3330e20e-3582-4be6-aecd-c6a00abc05e1"
}
```

`GET /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:49:22.317972351Z",
  "order": {
    "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
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
    "created_at": "2026-10-30T09:49:14.592963Z",
    "assigned_at": "2026-10-30T09:49:16.738476Z",
    "arrived_at": "2026-10-30T09:49:18.166553Z",
    "started_at": "2026-10-30T09:49:18.472572Z",
    "completed_at": "2026-10-30T09:49:19.054222Z"
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
    "id": "350b2712-1ab6-44b8-844f-8916395472f6",
    "registered_at": "2026-10-30T09:49:12.25623Z",
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
      "created_at": "2026-10-30T09:49:14.59536Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:49:19.560321Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks` → **422**

```json
{
  "command_id": "ff5a1e39-83f4-403e-a145-c610673ec52b",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "7fe19a64-4f07-4ff4-8d12-a79deb84e03d"
}
```

`POST /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks` → **201**

```json
{
  "command_id": "3efa6bd6-22c0-4fd9-9604-a5689b5ee9f9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "6597e55c-8a55-4df6-b2b5-45a5e0cc45d2",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:49:22.95809Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks` → **201**

```json
{
  "command_id": "3efa6bd6-22c0-4fd9-9604-a5689b5ee9f9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "6597e55c-8a55-4df6-b2b5-45a5e0cc45d2",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:49:22.95809Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/350b2712-1ab6-44b8-844f-8916395472f6` → **200**

```json
{
  "client": {
    "id": "350b2712-1ab6-44b8-844f-8916395472f6",
    "phone": "+380731286088",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:49:12.25623Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:49:14.592963Z",
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

`GET /api/admin/v1/clients/350b2712-1ab6-44b8-844f-8916395472f6` → **200**

```json
{
  "client": {
    "id": "350b2712-1ab6-44b8-844f-8916395472f6",
    "phone": "+380731286088",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:49:12.25623Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:49:14.592963Z",
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

`POST /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks/6597e55c-8a55-4df6-b2b5-45a5e0cc45d2/resolve` → **200**

```json
{
  "command_id": "a56be486-0b79-44ed-8600-dd26b9222979",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "6597e55c-8a55-4df6-b2b5-45a5e0cc45d2",
  "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T09:49:22.95809Z",
  "resolved_at": "2026-10-30T09:49:25.169349Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/350b2712-1ab6-44b8-844f-8916395472f6` → **200**

```json
{
  "client": {
    "id": "350b2712-1ab6-44b8-844f-8916395472f6",
    "phone": "+380731286088",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:49:12.25623Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:49:14.592963Z",
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

`GET /api/admin/v1/clients/350b2712-1ab6-44b8-844f-8916395472f6` → **200**

```json
{
  "client": {
    "id": "350b2712-1ab6-44b8-844f-8916395472f6",
    "phone": "+380731286088",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:49:12.25623Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:49:14.592963Z",
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

`POST /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks/6597e55c-8a55-4df6-b2b5-45a5e0cc45d2/resolve` → **409**

```json
{
  "command_id": "23516c5d-a50f-4c01-b20c-5e2144df9540",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks/6597e55c-8a55-4df6-b2b5-45a5e0cc45d2/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "590edeb2-96cc-4731-a1bf-ed9e760c91d0"
}
```

`GET /api/admin/v1/orders/0773dad6-ee57-4838-92f2-bafa50ecb6ee/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "6597e55c-8a55-4df6-b2b5-45a5e0cc45d2",
      "order_id": "0773dad6-ee57-4838-92f2-bafa50ecb6ee",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T09:49:22.95809Z",
      "resolved_at": "2026-10-30T09:49:25.169349Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 0773dad6-ee57-4838-92f2-bafa50ecb6ee without phone or card digits; chargeback 6597e55c-8a55-4df6-b2b5-45a5e0cc45d2 recorded and won.

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
  "session_id": "78e76c94-5372-4f43-b927-e23bd85b2b57",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NjgsImlhdCI6MTc5MzM1Mzc2OCwianRpIjoiN2Q4NGYyMjUtNTAyYi00NThmLTk1ZTMtMTQzYTc5YjkzY2I2Iiwic2lkIjoiNzhlNzZjOTQtNTM3Mi00ZjQzLWI5MjctZTIzYmQ4NWIyYjU3In0.PW3CR_nMlcaz15Rkr5QD2OdHLgCqi2rYrFJlvTdujg8",
  "access_expires_at": "2026-10-30T10:04:28.217554196Z",
  "refresh_token": "fn74FPoEzWqzrrCf-9opAZqMxSh7Eo2Ehc8DKjsKYfM",
  "refresh_expires_at": "2026-10-30T21:49:28.217020563Z",
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
  "phone": "+48600669451",
  "device_ref": "sandbox-3457"
}
```

```json
{
  "challenge_id": "ddd40dfe-4bc5-4b99-9f78-91759422c557",
  "expires_at": "2026-10-30T09:54:29.043410885Z",
  "resend_available_at": "2026-10-30T09:49:30.043410885Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600669451` → **200**

```json
{
  "phone": "+48600669451",
  "audience": "CLIENT",
  "code": "158623",
  "sent_at": "2026-10-30T09:49:29.047593642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddd40dfe-4bc5-4b99-9f78-91759422c557",
  "code": "158623",
  "device_ref": "sandbox-3457"
}
```

```json
{
  "session_id": "c01c730e-bae3-47df-96bf-c930d1b8dd5e",
  "subject": {
    "type": "CLIENT",
    "id": "b2eacdd2-9c87-4144-bdc6-d284cd870d39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMmVhY2RkMi05Yzg3LTQxNDQtYmRjNi1kMjg0Y2Q4NzBkMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjY5LCJpYXQiOjE3OTMzNTM3NjksImp0aSI6ImYxNTNhMDc2LTM0MTMtNDQwZi1iYTU2LTFjZWRjNjdlY2MwNSIsInNpZCI6ImMwMWM3MzBlLWJhZTMtNDdkZi05NmJmLWM5MzBkMWI4ZGQ1ZSJ9.sIZxoP79A-_4Q4YDd0GDsARaTMD4-RHAvX4vvmlWFBg",
  "access_expires_at": "2026-10-30T10:04:29.347560545Z",
  "refresh_token": "J_3QcNiTHSwp7GfmH63wQXHFEgidur5kKIB7NuTiixQ",
  "refresh_expires_at": "2026-11-29T09:49:29.347060159Z",
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
  "command_id": "576d414a-ad36-4c6c-8f38-0399a4aeab82",
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
  "correlation_id": "2eb315d5-029f-41d9-b106-33167b67c347",
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
  "command_id": "af4c3dfc-e909-403c-b07f-4432b413fed8",
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
  "paused_at": "2026-10-30T09:49:30.500073605Z",
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
  "command_id": "a94704cd-290c-42a4-9d79-ed5fe92944ab",
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
  "id": "cafbb038-0bbc-4d17-bfd6-52f2ed4a525c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:31.079784Z",
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
  "command_id": "6dbefc51-7d72-4b72-8fe0-31949c856527",
  "quote_id": "cafbb038-0bbc-4d17-bfd6-52f2ed4a525c",
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
  "correlation_id": "5c10fa89-5937-487e-82ab-af527194a37f"
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
  "paused_at": "2026-10-30T09:49:30.500074Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "4f7a9be2-0302-4317-a4da-5e3c623f1ad1",
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
  "command_id": "65f168d0-6e14-4d50-be9a-78bd618c1d3e",
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
  "command_id": "4ccd864c-8e3e-4c42-ab19-8d402688bed5",
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
  "id": "02de6f29-eefe-4a1c-a153-512372026e75",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:32.789126Z",
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
  "command_id": "50585447-bd48-4c77-a63a-0c89691af5be",
  "quote_id": "02de6f29-eefe-4a1c-a153-512372026e75",
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
  "correlation_id": "b8495350-ab34-4864-a9ea-83200c5b9208"
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
  "command_id": "cb22a6fc-d00c-4a94-9847-b33ea5f30b0d",
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
  "command_id": "5d22d52c-a924-47e2-b909-20961c7ada37",
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
  "id": "ef24c057-3941-48f2-a4ad-99c02fc889a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:33.927921Z",
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
  "command_id": "2036eee8-e6d7-4eb4-ba8e-d97680257b07",
  "quote_id": "ef24c057-3941-48f2-a4ad-99c02fc889a9",
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
  "correlation_id": "e119771a-c200-485e-93cb-9c9e9aa9c3c6"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "1459d7b7-0278-4db9-9b33-5ab2a3412ce5",
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
  "correlation_id": "86261abb-328e-4a81-8187-6dca862647e7"
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
  "command_id": "25e2e893-f89a-41d6-a39b-dacc9b0cf13a",
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
  "phone": "+380675127840",
  "device_ref": "sandbox-29354"
}
```

```json
{
  "challenge_id": "34a18589-0571-441f-80e1-295d06cdbae7",
  "expires_at": "2026-10-30T09:54:35.368282778Z",
  "resend_available_at": "2026-10-30T09:49:36.368282778Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675127840` → **200**

```json
{
  "phone": "+380675127840",
  "audience": "CLIENT",
  "code": "359829",
  "sent_at": "2026-10-30T09:49:35.370745377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34a18589-0571-441f-80e1-295d06cdbae7",
  "code": "359829",
  "device_ref": "sandbox-29354"
}
```

```json
{
  "session_id": "a048e717-8b80-42d6-8411-ddfff92e22d0",
  "subject": {
    "type": "CLIENT",
    "id": "30f62f97-a9f8-466f-81cb-c5bd77aab68a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGY2MmY5Ny1hOWY4LTQ2NmYtODFjYi1jNWJkNzdhYWI2OGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Njc1LCJpYXQiOjE3OTMzNTM3NzUsImp0aSI6IjkyYmE0YzFlLThhYmMtNDQxMy05ZWI5LWIwMTJhNTliMTViNyIsInNpZCI6ImEwNDhlNzE3LThiODAtNDJkNi04NDExLWRkZmZmOTJlMjJkMCJ9.Gwr_EC6a1NBslHXDBtoVQOQSUMGaJ9Qt1J5o9BmaK7A",
  "access_expires_at": "2026-10-30T10:04:35.680769651Z",
  "refresh_token": "z3yN9nbx5S0D-l0nLMZfWWjVVGVlQCPHuUeKUuEdxxQ",
  "refresh_expires_at": "2026-11-29T09:49:35.680234552Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "30f62f97-a9f8-466f-81cb-c5bd77aab68a",
  "session_id": "a048e717-8b80-42d6-8411-ddfff92e22d0",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1977b6b-28ae-4028-b7fd-974e0af9e783",
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
  "id": "8cb43c73-8cbf-4377-b537-08a4c0241c29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:36.222298Z",
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
  "challenge_id": "ff07bc16-599f-4e09-ad18-2f97ecba63cf",
  "expires_at": "2026-10-30T09:54:38.507845502Z",
  "resend_available_at": "2026-10-30T09:49:39.507845502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675127840` → **200**

```json
{
  "phone": "+380675127840",
  "audience": "CLIENT",
  "code": "801981",
  "sent_at": "2026-10-30T09:49:38.510233253Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "169faf8f-2f84-418f-8ebb-449dbc25d2fe",
  "challenge_id": "ff07bc16-599f-4e09-ad18-2f97ecba63cf",
  "otp_code": "801981"
}
```

```json
{
  "client_id": "30f62f97-a9f8-466f-81cb-c5bd77aab68a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:49:38.814038858Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "90ed8a54-1f48-44c8-ad3c-330291cda0f3",
  "quote_id": "8cb43c73-8cbf-4377-b537-08a4c0241c29",
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
  "correlation_id": "d0d5e1a0-5378-49ab-b977-1d73afebe0f8"
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
  "session_id": "7cef18e0-4e87-4f72-a951-e47fbc624dad",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2NzksImlhdCI6MTc5MzM1Mzc3OSwianRpIjoiZjJjMTZjYTMtNmJmYy00YWU2LTllNzMtNTkxNGZmZGI1MjU3Iiwic2lkIjoiN2NlZjE4ZTAtNGU4Ny00ZjcyLWE5NTEtZTQ3ZmJjNjI0ZGFkIn0.NHD5o8EUtwK8YqpEur50QWN_qUcVJn5kqt4y8f0t-Bo",
  "access_expires_at": "2026-10-30T10:04:39.689696897Z",
  "refresh_token": "RpWO9ApSRPeur4_uP-5bwxBTXcCPmSteHGiWNefqk0o",
  "refresh_expires_at": "2026-10-30T21:49:39.689165628Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "30f62f97-a9f8-466f-81cb-c5bd77aab68a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:49:38.814039Z",
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

`POST /api/admin/v1/client-deletions/30f62f97-a9f8-466f-81cb-c5bd77aab68a/complete` → **200**

```json
{
  "command_id": "efc7586a-9258-4c57-8865-cbf8e745c8c4",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "30f62f97-a9f8-466f-81cb-c5bd77aab68a",
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
  "correlation_id": "ac8b9ee8-6ad2-43c8-b9a3-d3a89fa68114"
}
```

Done: client 30f62f97-a9f8-466f-81cb-c5bd77aab68a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667208406",
  "device_ref": "sandbox-25878"
}
```

```json
{
  "challenge_id": "52f8a16f-4a32-493b-9a54-0b0d00ca36fb",
  "expires_at": "2026-10-30T09:54:40.858911371Z",
  "resend_available_at": "2026-10-30T09:49:41.858911371Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667208406` → **200**

```json
{
  "phone": "+380667208406",
  "audience": "CLIENT",
  "code": "265302",
  "sent_at": "2026-10-30T09:49:40.861856721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52f8a16f-4a32-493b-9a54-0b0d00ca36fb",
  "code": "265302",
  "device_ref": "sandbox-25878"
}
```

```json
{
  "session_id": "44331732-e837-4d59-bb28-90e582405516",
  "subject": {
    "type": "CLIENT",
    "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDA1YTA0OC00YmZmLTQ4NjgtYjVlZC04ZGMzOWQ3ZTkwZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjgxLCJpYXQiOjE3OTMzNTM3ODEsImp0aSI6ImRlZjE3NmM1LTVmYWQtNGRiMC1iOWFmLWY2YTZkYjFhNjQ2MCIsInNpZCI6IjQ0MzMxNzMyLWU4MzctNGQ1OS1iYjI4LTkwZTU4MjQwNTUxNiJ9.30eu0NdCeBnJJLVN3Pgff5PY6tafAHs3IhuYMvrauuk",
  "access_expires_at": "2026-10-30T10:04:41.189285793Z",
  "refresh_token": "STJABrP5Lo-D1h33SzFs4Grua6Iv6G7UojBUPVclgA0",
  "refresh_expires_at": "2026-11-29T09:49:41.188685765Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
  "session_id": "44331732-e837-4d59-bb28-90e582405516",
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
  "session_id": "dee8f40c-ae71-4266-adee-755afc9b1333",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2ODIsImlhdCI6MTc5MzM1Mzc4MiwianRpIjoiYTE0MWE0NmQtZDFjNC00MjgxLWJiZWUtYmMwYzUwNDcyYTA1Iiwic2lkIjoiZGVlOGY0MGMtYWU3MS00MjY2LWFkZWUtNzU1YWZjOWIxMzMzIn0._4gsyO3E53DRTe90DCAP5Pt4IErd9VUEzCDB2j1isYo",
  "access_expires_at": "2026-10-30T10:04:42.073364373Z",
  "refresh_token": "XGmrDRMGtqmaurxp_qZRg1mbpqww0PCnaVMNXpCzUh0",
  "refresh_expires_at": "2026-10-30T21:49:42.072743658Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7208406&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
      "phone": "+380667208406",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:49:41.186898Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/bd05a048-4bff-4868-b5ed-8dc39d7e90e7` → **200**

```json
{
  "client": {
    "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
    "phone": "+380667208406",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:49:41.186898Z",
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

`POST /api/admin/v1/clients/bd05a048-4bff-4868-b5ed-8dc39d7e90e7/block` → **400**

```json
{
  "command_id": "b05c40e2-ffae-457a-b9cf-b4e915e3469c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bd05a048-4bff-4868-b5ed-8dc39d7e90e7/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e7874fa8-7a4e-44c7-9256-429766642929",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/bd05a048-4bff-4868-b5ed-8dc39d7e90e7/block` → **200**

```json
{
  "command_id": "74f202d7-1f6f-4e9f-854b-8c693a761bae",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
  "phone": "+380667208406",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:49:41.186898Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:49:43.257747Z",
    "by": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
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
  "correlation_id": "37f1b9e4-2368-4961-abb0-484549e350a3"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667208406",
  "device_ref": "sandbox-29282"
}
```

```json
{
  "challenge_id": "f74d0b7b-1906-4572-9161-51726e93b207",
  "expires_at": "2026-10-30T09:54:45.820641142Z",
  "resend_available_at": "2026-10-30T09:49:46.820641142Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667208406` → **200**

```json
{
  "phone": "+380667208406",
  "audience": "CLIENT",
  "code": "285450",
  "sent_at": "2026-10-30T09:49:45.823704098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "f74d0b7b-1906-4572-9161-51726e93b207",
  "code": "285450",
  "device_ref": "sandbox-29282"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "82201ffa-c928-4fc3-8d8b-d0d22fd0668f"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/bd05a048-4bff-4868-b5ed-8dc39d7e90e7` → **200**

```json
{
  "client": {
    "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
    "phone": "+380667208406",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:49:41.186898Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:49:43.257747Z",
      "by": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
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

`POST /api/admin/v1/clients/bd05a048-4bff-4868-b5ed-8dc39d7e90e7/unblock` → **200**

```json
{
  "command_id": "9ee708f2-c739-4224-90b3-8a63fd1cc1e9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
  "phone": "+380667208406",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:49:41.186898Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667208406",
  "device_ref": "sandbox-1036"
}
```

```json
{
  "challenge_id": "9aa6e0b2-821a-4c86-b2d9-e830f5638856",
  "expires_at": "2026-10-30T09:54:49.007313503Z",
  "resend_available_at": "2026-10-30T09:49:50.007313503Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667208406` → **200**

```json
{
  "phone": "+380667208406",
  "audience": "CLIENT",
  "code": "226044",
  "sent_at": "2026-10-30T09:49:49.011065426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9aa6e0b2-821a-4c86-b2d9-e830f5638856",
  "code": "226044",
  "device_ref": "sandbox-1036"
}
```

```json
{
  "session_id": "0884f06f-ab38-4c72-927e-2f1ad93b89df",
  "subject": {
    "type": "CLIENT",
    "id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDA1YTA0OC00YmZmLTQ4NjgtYjVlZC04ZGMzOWQ3ZTkwZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Njg5LCJpYXQiOjE3OTMzNTM3ODksImp0aSI6ImE4NDcwMzIzLWU5YWYtNDZmZi1iOWFiLWZhYjE5MTYyOTBiMyIsInNpZCI6IjA4ODRmMDZmLWFiMzgtNGM3Mi05MjdlLTJmMWFkOTNiODlkZiJ9.Mrmpr_5EOnSX8As59o4tchChTnvozQrfikWt2cM_yV0",
  "access_expires_at": "2026-10-30T10:04:49.30618211Z",
  "refresh_token": "cCYMWN-eNW3-ukoMxPXJm12aKum7QHXZk1ga_SA9Ww4",
  "refresh_expires_at": "2026-11-29T09:49:49.305548202Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bd05a048-4bff-4868-b5ed-8dc39d7e90e7",
  "session_id": "0884f06f-ab38-4c72-927e-2f1ad93b89df",
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
  "phone": "+380661591973",
  "device_ref": "sandbox-813"
}
```

```json
{
  "challenge_id": "1f7ae2f7-f983-44dd-ac88-9a44a0ca74a9",
  "expires_at": "2026-10-30T09:54:49.865856941Z",
  "resend_available_at": "2026-10-30T09:49:50.865856941Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661591973` → **200**

```json
{
  "phone": "+380661591973",
  "audience": "CLIENT",
  "code": "948636",
  "sent_at": "2026-10-30T09:49:49.868317266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f7ae2f7-f983-44dd-ac88-9a44a0ca74a9",
  "code": "948636",
  "device_ref": "sandbox-813"
}
```

```json
{
  "session_id": "c3f2603e-10e3-48b6-879d-6d454efb4964",
  "subject": {
    "type": "CLIENT",
    "id": "4f98706d-f016-45f9-a275-0d849bc2120a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Zjk4NzA2ZC1mMDE2LTQ1ZjktYTI3NS0wZDg0OWJjMjEyMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjkwLCJpYXQiOjE3OTMzNTM3OTAsImp0aSI6IjZmOTgwOGQzLWZmODgtNGE3OC1hMzdjLTQxMzFmNjM3OTdlOSIsInNpZCI6ImMzZjI2MDNlLTEwZTMtNDhiNi04NzlkLTZkNDU0ZWZiNDk2NCJ9.TBR9DYZ3bRXrgXtfVfLBRO8f-YoJF4fx-NJ-pRozJXU",
  "access_expires_at": "2026-10-30T10:04:50.170582605Z",
  "refresh_token": "X0_CdAVHb9ZTicmSD0dNWTDkgJuV69k0VubEqv_gNZY",
  "refresh_expires_at": "2026-11-29T09:49:50.170094657Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0fe40833-a8cb-42e6-ad4e-a41824680f1a",
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
  "id": "960fdc4b-841e-4d29-bdd0-a0bb9663b269",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:54:50.446361Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: f45afd8b-2f2a-47a2-a330-701fdbc4ae7b) → **201**

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
  "session_id": "66036b7d-4017-4c1a-996a-e10ea96fd419",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2OTEsImlhdCI6MTc5MzM1Mzc5MSwianRpIjoiNTk2ZjUxZDYtMjZkMy00MzE5LTljZjgtYWQ4ZWI1MWYwMjk1Iiwic2lkIjoiNjYwMzZiN2QtNDAxNy00YzFhLTk5NmEtZTEwZWE5NmZkNDE5In0.fFhZNteS7h_ItYcdYroHmrG81xWrdotzKaIaovR32Gw",
  "access_expires_at": "2026-10-30T10:04:51.076218886Z",
  "refresh_token": "FHZU9KrohgyGDrS3PowqD7BGRLd2S43EB0hpgX7aYto",
  "refresh_expires_at": "2026-10-30T21:49:51.075708876Z",
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
  "session_id": "f1b4bd27-0277-4a41-a3c4-13632db83e6a",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ2OTEsImlhdCI6MTc5MzM1Mzc5MSwianRpIjoiNzc3MDhiNDAtMWQxZi00OTlhLTg4NGMtYmY4OTRkNGI5NjNmIiwic2lkIjoiZjFiNGJkMjctMDI3Ny00YTQxLWEzYzQtMTM2MzJkYjgzZTZhIn0.QpdKUUcRj33Dq8PZDsUwJopZR5EK7U9lZ6R0CgtD4Wc",
  "access_expires_at": "2026-10-30T10:04:51.640213978Z",
  "refresh_token": "PtA7T3JRuiYfWVDQoMy_Nc-Etpklzc0dN35SS29lziM",
  "refresh_expires_at": "2026-10-30T21:49:51.639670706Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/62d25b02-ebf4-4445-858a-6096381f492b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:49:50.744727Z",
      "actor": {
        "type": "CLIENT",
        "id": "4f98706d-f016-45f9-a275-0d849bc2120a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "62d25b02-ebf4-4445-858a-6096381f492b",
        "quote_id": "960fdc4b-841e-4d29-bdd0-a0bb9663b269",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f45afd8b-2f2a-47a2-a330-701fdbc4ae7b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:49:50.747148Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "62d25b02-ebf4-4445-858a-6096381f492b",
        "attempt_id": "dadb9799-eac2-4b35-a4e8-2ec7b90b9dc5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f45afd8b-2f2a-47a2-a330-701fdbc4ae7b"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:49:50.757946Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "62d25b02-ebf4-4445-858a-6096381f492b",
        "attempt_id": "dadb9799-eac2-4b35-a4e8-2ec7b90b9dc5"
      },
      "correlation_id": "f45afd8b-2f2a-47a2-a330-701fdbc4ae7b"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "dadb9799-eac2-4b35-a4e8-2ec7b90b9dc5",
        "generation": 1,
        "started_at": "2026-10-30T09:49:50.746001Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:49:50.757946Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:49:50.748043Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/f45afd8b-2f2a-47a2-a330-701fdbc4ae7b` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "62d25b02-ebf4-4445-858a-6096381f492b:0",
      "order_id": "62d25b02-ebf4-4445-858a-6096381f492b",
      "at": "2026-10-30T09:49:50.744727Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "62d25b02-ebf4-4445-858a-6096381f492b:1",
      "order_id": "62d25b02-ebf4-4445-858a-6096381f492b",
      "at": "2026-10-30T09:49:50.747148Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "62d25b02-ebf4-4445-858a-6096381f492b:2",
      "order_id": "62d25b02-ebf4-4445-858a-6096381f492b",
      "at": "2026-10-30T09:49:50.757946Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/28b742d7-1f0b-4829-8080-074ab80400e4` → **200**

```json
{
  "found": []
}
```

Done: request f45afd8b-2f2a-47a2-a330-701fdbc4ae7b — order 62d25b02-ebf4-4445-858a-6096381f492b found by its id.

`GET /api/rider/v1/orders/62d25b02-ebf4-4445-858a-6096381f492b` → **200**

```json
{
  "id": "62d25b02-ebf4-4445-858a-6096381f492b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f98706d-f016-45f9-a275-0d849bc2120a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:49:50.744127Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/62d25b02-ebf4-4445-858a-6096381f492b/cancel` → **200**

```json
{
  "command_id": "d405e8a4-6c79-418c-8495-162fe4551014",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "62d25b02-ebf4-4445-858a-6096381f492b",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4f98706d-f016-45f9-a275-0d849bc2120a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:49:50.744127Z",
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
  "phone": "+380636948665",
  "device_ref": "sandbox-7899"
}
```

```json
{
  "challenge_id": "9f81b5f1-6633-47dc-8c09-e7dcc27f9d20",
  "expires_at": "2026-10-30T09:54:53.33008179Z",
  "resend_available_at": "2026-10-30T09:49:54.33008179Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636948665` → **200**

```json
{
  "phone": "+380636948665",
  "audience": "CLIENT",
  "code": "326649",
  "sent_at": "2026-10-30T09:49:53.332459474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f81b5f1-6633-47dc-8c09-e7dcc27f9d20",
  "code": "326649",
  "device_ref": "sandbox-7899"
}
```

```json
{
  "session_id": "f9dad8a4-f5a0-4666-8bf5-1ff6ebf95136",
  "subject": {
    "type": "CLIENT",
    "id": "935b2883-b08f-4d47-9228-94ae7aabc016"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzViMjg4My1iMDhmLTRkNDctOTIyOC05NGFlN2FhYmMwMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NjkzLCJpYXQiOjE3OTMzNTM3OTMsImp0aSI6IjJjN2U2NTMwLTJjMjktNDFhMC1iODc4LTQwMGNhYmI3MTY4MyIsInNpZCI6ImY5ZGFkOGE0LWY1YTAtNDY2Ni04YmY1LTFmZjZlYmY5NTEzNiJ9.H0pa3pdPj6Dy1fHIeNF0D5yhzo2qAn3VVARkaPO31LI",
  "access_expires_at": "2026-10-30T10:04:53.622045806Z",
  "refresh_token": "WxY2dXzhIt8EwwfNVbbs4kEJW1ANbGriD4gCcps8tWw",
  "refresh_expires_at": "2026-11-29T09:49:53.621494501Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "bd97b904-f2c0-4d0f-af48-00e65c3d9c4b",
  "expires_at": "2026-10-30T09:54:55.897691652Z",
  "resend_available_at": "2026-10-30T09:49:56.897691652Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636948665` → **200**

```json
{
  "phone": "+380636948665",
  "audience": "CLIENT",
  "code": "327005",
  "sent_at": "2026-10-30T09:49:55.913426011Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "8ce1a090-5a25-4af7-a319-c080f687d058",
  "challenge_id": "bd97b904-f2c0-4d0f-af48-00e65c3d9c4b",
  "otp_code": "327005"
}
```

```json
{
  "id": "968d2212-26dc-40c4-909a-454fd4ad5b84",
  "state": "PENDING",
  "created_at": "2026-10-30T09:49:56.214184Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84` → **200**

```json
{
  "id": "968d2212-26dc-40c4-909a-454fd4ad5b84",
  "state": "PENDING",
  "created_at": "2026-10-30T09:49:56.214184Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84` → **200**

```json
{
  "id": "968d2212-26dc-40c4-909a-454fd4ad5b84",
  "state": "PENDING",
  "created_at": "2026-10-30T09:49:56.214184Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84` → **200**

```json
{
  "id": "968d2212-26dc-40c4-909a-454fd4ad5b84",
  "state": "PENDING",
  "created_at": "2026-10-30T09:49:56.214184Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84` → **200**

```json
{
  "id": "968d2212-26dc-40c4-909a-454fd4ad5b84",
  "state": "READY",
  "created_at": "2026-10-30T09:49:56.214184Z",
  "ready_at": "2026-10-30T09:49:59.544193Z",
  "expires_at": "2026-11-06T09:49:59.544193Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635635964",
  "device_ref": "sandbox-26052"
}
```

```json
{
  "challenge_id": "10aae349-acba-4207-85d4-ee21892758a2",
  "expires_at": "2026-10-30T09:55:00.621293996Z",
  "resend_available_at": "2026-10-30T09:50:01.621293996Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635635964` → **200**

```json
{
  "phone": "+380635635964",
  "audience": "CLIENT",
  "code": "586037",
  "sent_at": "2026-10-30T09:50:00.623757339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10aae349-acba-4207-85d4-ee21892758a2",
  "code": "586037",
  "device_ref": "sandbox-26052"
}
```

```json
{
  "session_id": "764aaa8a-3617-4238-8b3b-50f29b0e6aa8",
  "subject": {
    "type": "CLIENT",
    "id": "7cbc980a-d40d-4e08-a9f7-42de92edcffc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2JjOTgwYS1kNDBkLTRlMDgtYTlmNy00MmRlOTJlZGNmZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzAwLCJpYXQiOjE3OTMzNTM4MDAsImp0aSI6Ijk5NjU5YWU4LTk1M2ItNDRjNC1hNTcwLTk0ODNkMGYzNWEwZiIsInNpZCI6Ijc2NGFhYThhLTM2MTctNDIzOC04YjNiLTUwZjI5YjBlNmFhOCJ9.oZylAbBu53QXelusO2CMPBfxa35Y2tFIsoQE9E5EHdA",
  "access_expires_at": "2026-10-30T10:05:00.938462261Z",
  "refresh_token": "sHRw9WpevACe8qQzB8oHp5afRpna9IHmQWbTD7u0WWY",
  "refresh_expires_at": "2026-11-29T09:50:00.937964152Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/968d2212-26dc-40c4-909a-454fd4ad5b84/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7c105bc0-4d90-43ef-ad6b-e8dacd3ac00b"
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
  "session_id": "2c0a0e5b-736e-440b-8e45-f199f96f2e5e",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MDEsImlhdCI6MTc5MzM1MzgwMSwianRpIjoiZWE2NGMwZjAtMTAwZC00MThkLWI4ZjktOGQ4MDU4NzhjMmM0Iiwic2lkIjoiMmMwYTBlNWItNzM2ZS00NDBiLThlNDUtZjE5OWY5NmYyZTVlIn0.SaDJAUeuvuwBaWV3QW396qzQlvu_nU9lfFI7EgRhprA",
  "access_expires_at": "2026-10-30T10:05:01.780089236Z",
  "refresh_token": "ozNuCcNTjFsKMrkRk2QwoIUdbQ9cWMmNAcrREQzFG_Q",
  "refresh_expires_at": "2026-10-30T21:50:01.77956677Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "935b2883-b08f-4d47-9228-94ae7aabc016",
  "session_id": "f9dad8a4-f5a0-4666-8bf5-1ff6ebf95136",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/935b2883-b08f-4d47-9228-94ae7aabc016/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "968d2212-26dc-40c4-909a-454fd4ad5b84",
      "state": "READY",
      "created_at": "2026-10-30T09:49:56.214184Z",
      "ready_at": "2026-10-30T09:49:59.544193Z",
      "expires_at": "2026-11-06T09:49:59.544193Z",
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
  "device_ref": "sandbox-1834"
}
```

```json
{
  "challenge_id": "5efcfb40-3abe-41d3-a303-f867b10211cc",
  "expires_at": "2026-10-30T09:55:02.615410276Z",
  "resend_available_at": "2026-10-30T09:50:03.615410276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "417359",
  "sent_at": "2026-10-30T09:50:02.618050152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5efcfb40-3abe-41d3-a303-f867b10211cc",
  "code": "417359",
  "device_ref": "sandbox-1834"
}
```

```json
{
  "session_id": "9a39a5dc-11eb-4667-a591-9dec4468b47b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcwMiwiaWF0IjoxNzkzMzUzODAyLCJqdGkiOiIwYzMzMTY0MS1kYzkxLTQ1ZTQtOTMwYy1iNzczMWQyMDMzZDMiLCJzaWQiOiI5YTM5YTVkYy0xMWViLTQ2NjctYTU5MS05ZGVjNDQ2OGI0N2IifQ.Bw57LY16zietEJSvwy-LoWXXk1NlvTxOAx6Ex-ku_dU",
  "access_expires_at": "2026-10-30T10:05:02.923122146Z",
  "refresh_token": "p8u0QeLdTYWRdzVzL5TNH9GYQIfdvM9U2-T4wLjv2rw",
  "refresh_expires_at": "2026-11-29T09:50:02.922611173Z",
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
  "device_ref": "sandbox-5437"
}
```

```json
{
  "challenge_id": "498cf329-6223-49ae-a043-8608e70005cd",
  "expires_at": "2026-10-30T09:55:03.458953181Z",
  "resend_available_at": "2026-10-30T09:50:04.458953181Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "283307",
  "sent_at": "2026-10-30T09:50:03.461574085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "498cf329-6223-49ae-a043-8608e70005cd",
  "code": "283307",
  "device_ref": "sandbox-5437"
}
```

```json
{
  "session_id": "5f957368-20b2-4cf5-9f21-4317807ee6a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcwMywiaWF0IjoxNzkzMzUzODAzLCJqdGkiOiIzNGNhNDBlYy03MmVmLTQ3OTMtYmNiZS0wNzJjMmI1NjljZDMiLCJzaWQiOiI1Zjk1NzM2OC0yMGIyLTRjZjUtOWYyMS00MzE3ODA3ZWU2YTcifQ.Q6KPP2q88Pg6CJdm2Wh3xGhRrMhORUmQ8foSVWv_0TU",
  "access_expires_at": "2026-10-30T10:05:03.767641126Z",
  "refresh_token": "22ggtebLSBt6CGWjz3sId5TbW4Iry6ETjocfq6Yx1oQ",
  "refresh_expires_at": "2026-11-29T09:50:03.767000364Z",
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
  "command_id": "d6600fd0-d349-45d5-a824-8e82e3931130",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:04Z",
    "sequence": 1793353804322
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f8bd514-77bd-44d8-8e25-1929c6d7cf41",
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
  "last_heartbeat_at": "2026-10-30T09:50:04.340774Z",
  "last_location_at": "2026-10-30T09:50:04.340774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-25595"
}
```

```json
{
  "challenge_id": "12a5f575-ee3f-401f-81c4-3e0eb1665bcd",
  "expires_at": "2026-10-30T09:55:04.62477761Z",
  "resend_available_at": "2026-10-30T09:50:05.62477761Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "648668",
  "sent_at": "2026-10-30T09:50:04.627438283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12a5f575-ee3f-401f-81c4-3e0eb1665bcd",
  "code": "648668",
  "device_ref": "sandbox-25595"
}
```

```json
{
  "session_id": "cf6708f0-92d6-4418-9fc7-5641f19b3015",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcwNCwiaWF0IjoxNzkzMzUzODA0LCJqdGkiOiI1MTk2M2EwMi1kNTIxLTRhMjQtOWRkNS03ZjQ0MjQ3Njk3YWMiLCJzaWQiOiJjZjY3MDhmMC05MmQ2LTQ0MTgtOWZjNy01NjQxZjE5YjMwMTUifQ._RsKVndBiZm0UmDwzlI0yw2JjZl4OVoQkXpWyEG9wN4",
  "access_expires_at": "2026-10-30T10:05:04.924466952Z",
  "refresh_token": "G53Krj-Sy66axDEdWm3jBj4o1Tim1YU5CL-RcT9pJmA",
  "refresh_expires_at": "2026-11-29T09:50:04.923868182Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f9056641-d7a6-4619-aa5a-edb22e3dc1f0",
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
  "last_heartbeat_at": "2026-10-30T09:48:33.971726Z",
  "last_location_at": "2026-10-30T09:48:33.971726Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f9056641-d7a6-4619-aa5a-edb22e3dc1f0/handover` → **200**

```json
{
  "command_id": "bbc6cd9d-8e92-4d2c-b674-a27d2ba17c60",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f9056641-d7a6-4619-aa5a-edb22e3dc1f0",
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
  "last_heartbeat_at": "2026-10-30T09:48:33.971726Z",
  "last_location_at": "2026-10-30T09:48:33.971726Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f9056641-d7a6-4619-aa5a-edb22e3dc1f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:05Z",
    "sequence": 1793353805748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f9056641-d7a6-4619-aa5a-edb22e3dc1f0",
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
  "last_heartbeat_at": "2026-10-30T09:50:05.766124Z",
  "last_location_at": "2026-10-30T09:50:05.766124Z",
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
  "session_id": "4a5d685c-4a15-4ea9-8170-9c60fe3d9436",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MDYsImlhdCI6MTc5MzM1MzgwNiwianRpIjoiNTcyMjA0ZmMtZjk4Ni00OTI2LWIxYzAtZWY3Y2EyM2NmOGU4Iiwic2lkIjoiNGE1ZDY4NWMtNGExNS00ZWE5LTgxNzAtOWM2MGZlM2Q5NDM2In0.0NXYWNeBnHERjBVJELjsq2q7o3S-e_15IpbpCQtEecQ",
  "access_expires_at": "2026-10-30T10:05:06.351059398Z",
  "refresh_token": "J7tMSRkNfgvyGLiMaqq1UNqO2RZoG44mED5HRIAPSUE",
  "refresh_expires_at": "2026-10-30T21:50:06.350560118Z",
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
  "session_id": "3dc96f08-5c4e-43cf-bd2a-491ee8e5afba",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MDYsImlhdCI6MTc5MzM1MzgwNiwianRpIjoiNDdiZjA1ZjItMGZlYS00MDg2LWE2OTUtOGNmMDcyNWUyMDE4Iiwic2lkIjoiM2RjOTZmMDgtNWM0ZS00M2NmLWJkMmEtNDkxZWU4ZTVhZmJhIn0.HVK_6M2GBYug7aUCzLAMlr9yL4cJfsqkmwozGNizuis",
  "access_expires_at": "2026-10-30T10:05:06.919559576Z",
  "refresh_token": "qiDIWyb7EwnXcTVl-kTpyDaNvbZ87rqhKEpsuhppB7E",
  "refresh_expires_at": "2026-10-30T21:50:06.919027745Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687952820",
  "device_ref": "sandbox-97"
}
```

```json
{
  "challenge_id": "30a3c33b-0f5e-45f1-ac29-ea9046a0b7db",
  "expires_at": "2026-10-30T09:55:07.198648063Z",
  "resend_available_at": "2026-10-30T09:50:08.198648063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687952820` → **200**

```json
{
  "phone": "+380687952820",
  "audience": "CLIENT",
  "code": "596471",
  "sent_at": "2026-10-30T09:50:07.201231196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30a3c33b-0f5e-45f1-ac29-ea9046a0b7db",
  "code": "596471",
  "device_ref": "sandbox-97"
}
```

```json
{
  "session_id": "be82747c-178c-421c-9798-9f14d7aee7e9",
  "subject": {
    "type": "CLIENT",
    "id": "97d7a38e-1e41-45f1-aa63-34aeb965ca0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5N2Q3YTM4ZS0xZTQxLTQ1ZjEtYWE2My0zNGFlYjk2NWNhMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzA3LCJpYXQiOjE3OTMzNTM4MDcsImp0aSI6IjUyNTk0MzAwLTBkNDEtNDFkOC1hMjg1LTlkYjQ3Njg4MWY5YiIsInNpZCI6ImJlODI3NDdjLTE3OGMtNDIxYy05Nzk4LTlmMTRkN2FlZTdlOSJ9.je4nQSPTsePJFwQAKhMFF0ATj12mqtvTahnJjgKpi10",
  "access_expires_at": "2026-10-30T10:05:07.501188139Z",
  "refresh_token": "RzozH-PuInthYBZa7rLQfG0vMcSlqW_HaUxxaqvLQ34",
  "refresh_expires_at": "2026-11-29T09:50:07.500718796Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "29c69f3d-36e0-4d44-87b0-44da26bb0632",
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
  "id": "a8533679-3341-4527-93ec-523f1b9cc304",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:07.777480Z",
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
  "command_id": "269cc80e-f797-4507-8273-a0c9dba89116",
  "quote_id": "a8533679-3341-4527-93ec-523f1b9cc304",
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
  "id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "97d7a38e-1e41-45f1-aa63-34aeb965ca0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:50:08.063472Z",
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
    "id": "ea6d6242-7532-4a96-b6e0-a222428aacae",
    "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
    "expires_at": "2026-10-30T09:50:23.066708Z",
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

`POST /api/driver/v1/offers/ea6d6242-7532-4a96-b6e0-a222428aacae/reject` → **204**

```json
{
  "command_id": "3ace895b-25b0-4221-b481-b4dae95254ed"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "41cce03d-fc9c-4ae2-af8f-8beca218bfe0",
    "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
    "expires_at": "2026-10-30T09:50:23.645316Z",
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

`POST /api/driver/v1/offers/41cce03d-fc9c-4ae2-af8f-8beca218bfe0/accept` → **200**

```json
{
  "command_id": "48f43220-de9b-4200-8229-0eba7bda524e"
}
```

```json
{
  "id": "abf8f4ed-68d9-4b4a-91a1-351325b8b82e",
  "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "18a2da19-856b-47b8-93b2-543b13505811",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/54bfa655-f0a1-41c0-978a-896ec7fe30cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:50:08.063992Z",
      "actor": {
        "type": "CLIENT",
        "id": "97d7a38e-1e41-45f1-aa63-34aeb965ca0a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
        "quote_id": "a8533679-3341-4527-93ec-523f1b9cc304",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ed73f6e2-7413-42d8-b9b5-df66eaf27d5f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:50:08.06599Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
        "attempt_id": "286ae1c5-0ea2-440f-b69c-e0f8c5e4ec76",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ed73f6e2-7413-42d8-b9b5-df66eaf27d5f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:50:08.07316Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ea6d6242-7532-4a96-b6e0-a222428aacae",
        "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "ed73f6e2-7413-42d8-b9b5-df66eaf27d5f"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:50:08.6441Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ea6d6242-7532-4a96-b6e0-a222428aacae",
        "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf"
      },
      "correlation_id": "e46911f3-b2e3-4b7a-b735-779562177c3e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 54bfa655-f0a1-41c0-978a-896ec7fe30cf — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/54bfa655-f0a1-41c0-978a-896ec7fe30cf` → **200**

```json
{
  "id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "97d7a38e-1e41-45f1-aa63-34aeb965ca0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "abf8f4ed-68d9-4b4a-91a1-351325b8b82e",
    "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "18a2da19-856b-47b8-93b2-543b13505811",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:50:08.063472Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/54bfa655-f0a1-41c0-978a-896ec7fe30cf/cancel` → **200**

```json
{
  "command_id": "460bffc9-a0b7-4d75-8636-2be14d4d7b00",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "97d7a38e-1e41-45f1-aa63-34aeb965ca0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "abf8f4ed-68d9-4b4a-91a1-351325b8b82e",
    "order_id": "54bfa655-f0a1-41c0-978a-896ec7fe30cf",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "18a2da19-856b-47b8-93b2-543b13505811",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:50:08.063472Z",
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
  "session_id": "2f8bd514-77bd-44d8-8e25-1929c6d7cf41",
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
  "last_heartbeat_at": "2026-10-30T09:50:04.340774Z",
  "last_location_at": "2026-10-30T09:50:04.340774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2f8bd514-77bd-44d8-8e25-1929c6d7cf41/close` → **200**

```json
{
  "command_id": "7f7feb51-151f-41d5-9043-58e17161474b",
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
  "session_id": "f9056641-d7a6-4619-aa5a-edb22e3dc1f0",
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
  "last_heartbeat_at": "2026-10-30T09:50:05.766124Z",
  "last_location_at": "2026-10-30T09:50:05.766124Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f9056641-d7a6-4619-aa5a-edb22e3dc1f0/close` → **200**

```json
{
  "command_id": "84d0d0d7-bac4-4dea-93fd-1abdf260546b",
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
  "session_id": "4a157d8d-1cfa-48ef-935c-3453ffce9066",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MTEsImlhdCI6MTc5MzM1MzgxMSwianRpIjoiZTNiY2FkNzYtNzNhMy00Mzg2LWIyMzQtOWE2MDQyYjE3YjRiIiwic2lkIjoiNGExNTdkOGQtMWNmYS00OGVmLTkzNWMtMzQ1M2ZmY2U5MDY2In0.QuZpEQpgURs6HfqU8CxemmMS7Bbl5ZmpXGxDQfa1uvA",
  "access_expires_at": "2026-10-30T10:05:11.591686127Z",
  "refresh_token": "8q1JBPQcIsHY35Nx3q4Jo0UWdH_H8lsZaw3REtfozOo",
  "refresh_expires_at": "2026-10-30T21:50:11.59104736Z",
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
  "command_id": "64ecbd6f-571b-4030-9247-8d3c4134bba7",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:50:12.224877Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "6d16e799-ee5a-4ebe-aea0-f7ca75fc54f7",
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
  "correlation_id": "222a82e3-b608-483e-a202-498c7fd4feea"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "31bd9204-0510-4671-aad3-54dc702f6a76",
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
  "correlation_id": "de113451-19e5-4673-b6ae-a2105a7e0950"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635323743",
  "device_ref": "sandbox-32242"
}
```

```json
{
  "challenge_id": "1cc2bd95-6fc0-4674-b5bd-9bd01b2e721e",
  "expires_at": "2026-10-30T09:55:13.069110519Z",
  "resend_available_at": "2026-10-30T09:50:14.069110519Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635323743` → **200**

```json
{
  "phone": "+380635323743",
  "audience": "CLIENT",
  "code": "371116",
  "sent_at": "2026-10-30T09:50:13.071878718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cc2bd95-6fc0-4674-b5bd-9bd01b2e721e",
  "code": "371116",
  "device_ref": "sandbox-32242"
}
```

```json
{
  "session_id": "3cdd2de9-7e00-4807-97ef-d6b95e01761b",
  "subject": {
    "type": "CLIENT",
    "id": "a5404928-583f-4159-b2f2-b83a00fb2a61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTQwNDkyOC01ODNmLTQxNTktYjJmMi1iODNhMDBmYjJhNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzEzLCJpYXQiOjE3OTMzNTM4MTMsImp0aSI6Ijg5MDdkYTU5LWQ4YTEtNDk0YS1hYmZjLWI0N2Q3NTgzOTI0MSIsInNpZCI6IjNjZGQyZGU5LTdlMDAtNDgwNy05N2VmLWQ2Yjk1ZTAxNzYxYiJ9.ma_xmR7Sh9Xy10OcVecGmV14VZrQxaPsyZj3CZo2Ld4",
  "access_expires_at": "2026-10-30T10:05:13.373448264Z",
  "refresh_token": "cyjZbt9jU59D69BDeNxSOlggy29xuO8w0bBMaThdn0o",
  "refresh_expires_at": "2026-11-29T09:50:13.372844371Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c523872-1623-4494-bd2c-58dcf8ddf7ad",
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
  "id": "adc5e081-d5d1-477d-918c-7459a89c685f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:13.656314Z",
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
  "command_id": "818ad198-d594-444e-83e6-f7f41f1c518b",
  "quote_id": "adc5e081-d5d1-477d-918c-7459a89c685f",
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
  "correlation_id": "cb6b7855-e1ba-4b12-a17a-2ea331b06f09"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "57cd6c0e-5f1c-4e90-bbf4-0db9572f0581",
  "quote_id": "adc5e081-d5d1-477d-918c-7459a89c685f",
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
  "id": "7cc82bc0-1204-4af5-a68d-58970022c44a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5404928-583f-4159-b2f2-b83a00fb2a61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:14.220206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7cc82bc0-1204-4af5-a68d-58970022c44a/cancel` → **200**

```json
{
  "command_id": "47c7af57-a572-4ad5-b691-75ac6da98d90",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7cc82bc0-1204-4af5-a68d-58970022c44a",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a5404928-583f-4159-b2f2-b83a00fb2a61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:50:14.220206Z",
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
  "command_id": "e9727a81-2c31-4692-89d6-2d428fc9743e",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:50:14.832072Z"
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
      "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:50:14.832072Z"
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
  "device_ref": "sandbox-13110"
}
```

```json
{
  "challenge_id": "d99cf6c3-39b2-4116-b2d1-c869ddd542d7",
  "expires_at": "2026-10-30T09:55:15.676505189Z",
  "resend_available_at": "2026-10-30T09:50:16.676505189Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "025148",
  "sent_at": "2026-10-30T09:50:15.679275915Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d99cf6c3-39b2-4116-b2d1-c869ddd542d7",
  "code": "025148",
  "device_ref": "sandbox-13110"
}
```

```json
{
  "session_id": "47407133-270f-4ce3-83da-6162aeb97668",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDcxNSwiaWF0IjoxNzkzMzUzODE1LCJqdGkiOiI5NzBkN2NiMy0xOWUwLTQ5MmMtYTgwYS05MzcxZmU1NjkyYWUiLCJzaWQiOiI0NzQwNzEzMy0yNzBmLTRjZTMtODNkYS02MTYyYWViOTc2NjgifQ.TugvVUn9M5qkgaGdDDgEkbKCbwZL8L6DwAR49ELzsUY",
  "access_expires_at": "2026-10-30T10:05:15.996845364Z",
  "refresh_token": "2UHsh5i-VsmwGshT16FcFv3kNb1xV3bEFg31tKlLvm0",
  "refresh_expires_at": "2026-11-29T09:50:15.996235561Z",
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
  "command_id": "e02a1488-8de0-43d1-8ace-abd03cff4785",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:16Z",
    "sequence": 1793353816552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:16.570393Z",
  "last_location_at": "2026-10-30T09:50:16.570393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674659259",
  "device_ref": "sandbox-7914"
}
```

```json
{
  "challenge_id": "78d2858c-e55d-4ef8-a5da-9e4ec49bc1f1",
  "expires_at": "2026-10-30T09:55:16.848154314Z",
  "resend_available_at": "2026-10-30T09:50:17.848154314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674659259` → **200**

```json
{
  "phone": "+380674659259",
  "audience": "CLIENT",
  "code": "629988",
  "sent_at": "2026-10-30T09:50:16.850705381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78d2858c-e55d-4ef8-a5da-9e4ec49bc1f1",
  "code": "629988",
  "device_ref": "sandbox-7914"
}
```

```json
{
  "session_id": "0a5fef2b-8fcb-4bd3-83d6-8bdf9d3155a4",
  "subject": {
    "type": "CLIENT",
    "id": "8de53906-d4f8-4f02-9d65-4e4bd29ce869"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGU1MzkwNi1kNGY4LTRmMDItOWQ2NS00ZTRiZDI5Y2U4NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzE3LCJpYXQiOjE3OTMzNTM4MTcsImp0aSI6IjFlNzIzZjQ2LTU2ZjgtNGIyZC05Nzc2LWVlZGQxMmVlMmIzNSIsInNpZCI6IjBhNWZlZjJiLThmY2ItNGJkMy04M2Q2LThiZGY5ZDMxNTVhNCJ9.KIk4ps5Bi35HhuxcJ5-XM2r5ZeeMhOd1FB7A5KkHrps",
  "access_expires_at": "2026-10-30T10:05:17.156067898Z",
  "refresh_token": "JBlAYFLN3pzm1-aiO4BxsJxYH46V0xIJtlVRxrQVjpA",
  "refresh_expires_at": "2026-11-29T09:50:17.155576864Z",
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
  "command_id": "b9c8aff9-0750-41d8-bd13-27f4eacca097",
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
  "id": "a7e08870-3543-411e-8c8d-68a6c8b69b79",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:17.707807Z",
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
  "command_id": "89016c1b-cbdd-4e12-b6c0-addb8f4fd3d7",
  "platform": "ANDROID",
  "token": "sandbox-driver-aa23733f-c852-4303-8621-770f2c099157"
}
```

```json
{
  "id": "99201cc6-47ca-4a0b-9f7e-213be8ed736c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:50:18.002713Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "e6c2a8f0-09c3-4218-be3e-117301191b7e",
  "platform": "ANDROID",
  "token": "sandbox-rider-d575fb36-9459-4908-a48e-8be53b7ef351"
}
```

```json
{
  "id": "a165e6de-34f4-461a-bd7e-465e80f6c801",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:50:18.288211Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "581b16e9-17a4-4a28-a797-63d58a98dea5",
  "quote_id": "a7e08870-3543-411e-8c8d-68a6c8b69b79",
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
  "id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8de53906-d4f8-4f02-9d65-4e4bd29ce869",
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
  "created_at": "2026-10-30T09:50:18.562257Z",
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
    "id": "a3c84f89-309c-4449-a400-9952872e4517",
    "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
    "expires_at": "2026-10-30T09:50:33.5653Z",
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

`POST /api/driver/v1/offers/a3c84f89-309c-4449-a400-9952872e4517/accept` → **200**

```json
{
  "command_id": "d385d232-1081-4c33-978a-b82cc03989c0"
}
```

```json
{
  "id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:50:18.538Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:50:19.087292206Z",
    "token_suffix": "099157",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
      "order_version": "2",
      "event_id": "d3660200-d616-45b4-b398-e77d62ad287c",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674659259&after=2026-10-30T09:50:18.538Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674659259&after=2026-10-30T09:50:18.538Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:50:20.092749242Z",
    "token_suffix": "7ef351",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
      "order_version": "3",
      "event_id": "364abf45-d7fc-4111-b56b-1ec95ddb79be",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/d3a21ada-34ae-4c2d-988a-5263cfc34017/messages` → **201**

```json
{
  "command_id": "54304669-bc1d-4751-80b8-037cbe398b1d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "748650a8-2b52-4992-9a8a-80eea1743284",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:50:20.516246362Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "assignment_id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
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

`POST /api/driver/v1/trips/98550275-9431-4e23-a861-8cac8dfc8fbb/messages` → **201**

```json
{
  "command_id": "5bb00c76-ed86-47e4-b40d-c1e664af4bff",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "f0ea7664-e861-40c7-8675-319ed08ed136",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:50:21.064983309Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/d3a21ada-34ae-4c2d-988a-5263cfc34017/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/98550275-9431-4e23-a861-8cac8dfc8fbb/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674659259"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:21Z",
    "sequence": 1793353821870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:21.888749Z",
  "last_location_at": "2026-10-30T09:50:21.888749Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "assignment_id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
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

`POST /api/driver/v1/trips/98550275-9431-4e23-a861-8cac8dfc8fbb/arrive` → **200**

```json
{
  "command_id": "f929fbe0-9791-4395-9bf0-015644b1eab2",
  "expected_version": 0
}
```

```json
{
  "id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "assignment_id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
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
  "arrived_at": "2026-10-30T09:50:22.435121Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/98550275-9431-4e23-a861-8cac8dfc8fbb/start` → **200**

```json
{
  "command_id": "bbc93c97-6259-4d82-9fcb-6f96ab04b12a",
  "expected_version": 1
}
```

```json
{
  "id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "assignment_id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
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
  "arrived_at": "2026-10-30T09:50:22.435121Z",
  "started_at": "2026-10-30T09:50:22.722948Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:23Z",
    "sequence": 1793353823611
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:23.024471Z",
  "last_location_at": "2026-10-30T09:50:23.024471Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/98550275-9431-4e23-a861-8cac8dfc8fbb/complete` → **200**

```json
{
  "command_id": "430451d7-794b-48a5-aedf-c6eb5cee7c8d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:50:23Z",
  "cash_received": true
}
```

```json
{
  "id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "assignment_id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
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
  "arrived_at": "2026-10-30T09:50:22.435121Z",
  "started_at": "2026-10-30T09:50:22.722948Z",
  "completed_at": "2026-10-30T09:50:23.300227Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/d3a21ada-34ae-4c2d-988a-5263cfc34017` → **200**

```json
{
  "id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8de53906-d4f8-4f02-9d65-4e4bd29ce869",
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
    "id": "2203cca5-3710-4916-8781-21adc2e6a9f2",
    "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:50:18.562257Z",
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
    "id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:50:18.562257Z",
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
    "id": "98550275-9431-4e23-a861-8cac8dfc8fbb",
    "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
    "order_short_number": 13,
    "created_at": "2026-10-30T09:50:19.144355Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7efb6e87-d4f5-495e-b27c-d812c7e0f3d3",
    "order_id": "56abc621-611c-4971-83d1-a2dba2bdf31c",
    "order_short_number": 8,
    "created_at": "2026-10-30T09:49:07.582381Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a87267f6-c90a-40b6-a303-a9c692085830",
    "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
    "order_short_number": 3,
    "created_at": "2026-10-30T09:48:24.806457Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1b430fad-1e72-467d-b59e-9b33073f1ecf",
    "order_id": "b3e93827-2fca-4707-a825-c115bd12c26e",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:48:03.361332Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "84105435-9a6d-4e26-a7e8-f8f28269acf0",
    "order_id": "205c45e4-d7cb-4b39-86bd-1efe9918cfd7",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:47:53.864287Z",
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

`GET /api/rider/v1/orders/d3a21ada-34ae-4c2d-988a-5263cfc34017/tip` → **200**

```json
{
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
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
  "available_until": "2026-10-31T09:50:23.300227Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d3a21ada-34ae-4c2d-988a-5263cfc34017/tip` → **201**

```json
{
  "command_id": "eebaa963-f458-4d3b-8af9-05b12377d390",
  "amount_minor": 1100
}
```

```json
{
  "id": "0ceabd54-d384-4e5d-8fc0-66677c9f611d",
  "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:50:28.265808Z"
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
  "session_id": "ceb0a137-696f-4ee5-bc91-a67a9f2670a3",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MjgsImlhdCI6MTc5MzM1MzgyOCwianRpIjoiNmNlNTIwZGItMTg3YS00NDUwLWE0YzktMmVlOGQxYmY5NDhlIiwic2lkIjoiY2ViMGExMzctNjk2Zi00ZWU1LWJjOTEtYTY3YTlmMjY3MGEzIn0._ZiWGjC-9grhB26ijF-NgzkGh5e44ELZzavG1VVVB3M",
  "access_expires_at": "2026-10-30T10:05:28.833739917Z",
  "refresh_token": "J2So019cBBN6PI1UGI-rlI5-vaIOpdnTZDJMoYn5rsU",
  "refresh_expires_at": "2026-10-30T21:50:28.833060363Z",
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
  "generated_at": "2026-10-30T09:50:29.103157038Z"
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
  "generated_at": "2026-10-30T09:50:29.399257918Z"
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
  "session_id": "d1186468-879f-4bd9-94bc-797131de356b",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MjksImlhdCI6MTc5MzM1MzgyOSwianRpIjoiZDM3MWI2M2ItNGIzOC00YjNlLTg5MWEtODk3Y2VlYjJjMjQ5Iiwic2lkIjoiZDExODY0NjgtODc5Zi00YmQ5LTk0YmMtNzk3MTMxZGUzNTZiIn0.d8gmr2RxyVKuUKOpBNUFcAzExMIfKOv2YrF4lWq_GJQ",
  "access_expires_at": "2026-10-30T10:05:29.978051442Z",
  "refresh_token": "YdrqFdK4gRk0Tp5t6YCK-C9RlgoUJ0csWwEVxJZOnd4",
  "refresh_expires_at": "2026-10-30T21:50:29.977506757Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d3a21ada-34ae-4c2d-988a-5263cfc34017/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:50:18.562756Z",
      "actor": {
        "type": "CLIENT",
        "id": "8de53906-d4f8-4f02-9d65-4e4bd29ce869",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
        "quote_id": "a7e08870-3543-411e-8c8d-68a6c8b69b79",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5b5cd67d-8623-4b25-868a-0f70d7287e4e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:50:18.564639Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
        "attempt_id": "6b83f30d-dce0-40d1-9594-afbd4068df4e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5b5cd67d-8623-4b25-868a-0f70d7287e4e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:50:18.567126Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a3c84f89-309c-4449-a400-9952872e4517",
        "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "5b5cd67d-8623-4b25-868a-0f70d7287e4e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:50:19.145869Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a3c84f89-309c-4449-a400-9952872e4517",
        "order_id": "d3a21ada-34ae-4c2d-988a-5263cfc34017",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2203cca5-3710-4916-8781-21adc2e6a9f2"
      },
      "correlation_id": "ff4e0b97-aefa-40df-ab48-eb8b16b0034f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:50:30.534999296Z",
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
      "last_location_at": "2026-10-30T09:50:23.024471Z",
      "order_id": null
    }
  ]
}
```

Done: order d3a21ada-34ae-4c2d-988a-5263cfc34017.

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
  "session_id": "54cfece6-8c9d-4b42-bbfb-cf1f288156f8",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MzEsImlhdCI6MTc5MzM1MzgzMSwianRpIjoiMzI1NWYwM2QtMTAwMi00NjMzLTkxZGUtN2YwMjM4YzNiNTkyIiwic2lkIjoiNTRjZmVjZTYtOGM5ZC00YjQyLWJiZmItY2YxZjI4ODE1NmY4In0.NilMHeWl7w4CMF-lWdVfRq7yhtHRlzBAf66T4m6B8qk",
  "access_expires_at": "2026-10-30T10:05:31.13197267Z",
  "refresh_token": "LLyOX9OJyYBszR53wOjZk86W_LaEer6S2FxlRl6OSpE",
  "refresh_expires_at": "2026-10-30T21:50:31.131468652Z",
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
  "command_id": "4d702663-3f91-4634-ae48-e2f765b1ecd8",
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
  "timestamp": "2026-10-30T09:50:31.000+0000",
  "channel": {
    "id": "1730052000.146817147",
    "linkedid": "1730052000.146817147",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670604832"
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
  "timestamp": "2026-10-30T09:50:31.000+0000",
  "channel": {
    "id": "1730052000.146817147",
    "linkedid": "1730052000.146817147",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670604832"
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
  "session_id": "115b5e86-3031-47fd-93e7-4fbeb352f303",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3MzIsImlhdCI6MTc5MzM1MzgzMiwianRpIjoiYjFjZjFmNGItYzJlYy00M2JiLWE3NDAtMTVjNzNmMzVjMzU3Iiwic2lkIjoiMTE1YjVlODYtMzAzMS00N2ZkLTkzZTctNGZiZWIzNTJmMzAzIn0.qJYQ-cyiyLeikaQqkYRcwrZgTpOlYkMRnt0Sg9LNESo",
  "access_expires_at": "2026-10-30T10:05:32.321408425Z",
  "refresh_token": "avGUzbDMMdsiPoiXU_uhopgPfDVFBHIZJLDBPTj-wDQ",
  "refresh_expires_at": "2026-10-30T21:50:32.320762437Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "81a1d7cf-d071-4352-b002-f703355163f3",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670604832",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:50:31Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/81a1d7cf-d071-4352-b002-f703355163f3/answer` → **200**

```json
{
  "command_id": "9250f4ab-3541-49f8-afab-f554e31bf505"
}
```

```json
{
  "id": "81a1d7cf-d071-4352-b002-f703355163f3",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670604832",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "order_ids": [],
  "started_at": "2026-10-30T09:50:31Z",
  "answered_at": "2026-10-30T09:50:32.889961Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.146817147",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "030b709d-8f2c-4e96-9338-8dc8baaa4710",
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
  "id": "ac08fab9-2ad1-438e-b96c-385753a0887c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:33.201542Z",
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
  "command_id": "cbf87b66-9d84-4fa7-abf2-c3fcf680b22d",
  "quote_id": "ac08fab9-2ad1-438e-b96c-385753a0887c",
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
    "phone": "+380670604832"
  },
  "call_id": "81a1d7cf-d071-4352-b002-f703355163f3"
}
```

```json
{
  "id": "ac8b804d-ecc5-4697-b29b-00d3176cdb94",
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
  "created_at": "2026-10-30T09:50:33.495411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670604832"
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
    "id": "1730052000.146817147",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "81a1d7cf-d071-4352-b002-f703355163f3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670604832",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [
        "ac8b804d-ecc5-4697-b29b-00d3176cdb94"
      ],
      "started_at": "2026-10-30T09:50:31Z",
      "answered_at": "2026-10-30T09:50:32.889961Z",
      "ended_at": "2026-10-30T09:50:33.809107Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "4f93226e-f091-4a5b-8305-7ee3419031f5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677941310",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [],
      "started_at": "2026-10-30T09:48:11.457874Z",
      "answered_at": "2026-10-30T09:48:11.778931Z",
      "ended_at": "2026-10-30T09:48:12.095438Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:48:19.523431Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ac8b804d-ecc5-4697-b29b-00d3176cdb94` → **200**

```json
{
  "id": "ac8b804d-ecc5-4697-b29b-00d3176cdb94",
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
  "created_at": "2026-10-30T09:50:33.495411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670604832"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ac8b804d-ecc5-4697-b29b-00d3176cdb94` → **200**

```json
{
  "id": "ac8b804d-ecc5-4697-b29b-00d3176cdb94",
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
  "created_at": "2026-10-30T09:50:33.495411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670604832"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ac8b804d-ecc5-4697-b29b-00d3176cdb94/cancel` → **200**

```json
{
  "command_id": "233dd12f-0eaa-42c4-a2d2-1be11d55ec66",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ac8b804d-ecc5-4697-b29b-00d3176cdb94",
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
  "created_at": "2026-10-30T09:50:33.495411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670604832"
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

Done: call 81a1d7cf-d071-4352-b002-f703355163f3 with order ac8b804d-ecc5-4697-b29b-00d3176cdb94.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28564"
}
```

```json
{
  "challenge_id": "22129e6d-e668-4036-8e42-8a046d46936a",
  "expires_at": "2026-10-30T09:55:35.007006518Z",
  "resend_available_at": "2026-10-30T09:50:36.007006518Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "170023",
  "sent_at": "2026-10-30T09:50:35.00953877Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22129e6d-e668-4036-8e42-8a046d46936a",
  "code": "170023",
  "device_ref": "sandbox-28564"
}
```

```json
{
  "session_id": "919b3727-4ec6-4101-9d23-86b1c260b3b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDczNSwiaWF0IjoxNzkzMzUzODM1LCJqdGkiOiI1ZjI3YTczYi1iZDNmLTRhOWMtOWJkNS1iYjg3MDI5YjdmMDMiLCJzaWQiOiI5MTliMzcyNy00ZWM2LTQxMDEtOWQyMy04NmIxYzI2MGIzYjgifQ.jLyS5VwoGbsfaXSUnJsX3ijn8InTnDR8T-uAMVUlp3U",
  "access_expires_at": "2026-10-30T10:05:35.318944143Z",
  "refresh_token": "bJInMVM5h409Pjz0fFlsvNfO8_6pj-MD1V-uV0iEVuc",
  "refresh_expires_at": "2026-11-29T09:50:35.318398367Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:23.024471Z",
  "last_location_at": "2026-10-30T09:50:23.024471Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/handover` → **200**

```json
{
  "command_id": "1d453506-a95c-433d-9227-0d006684c14a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:23.024471Z",
  "last_location_at": "2026-10-30T09:50:23.024471Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:36Z",
    "sequence": 1793353836152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:36.171219Z",
  "last_location_at": "2026-10-30T09:50:36.171219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660704732",
  "device_ref": "sandbox-29339"
}
```

```json
{
  "challenge_id": "e2269ee0-0c08-43ea-9816-29f8f3cad017",
  "expires_at": "2026-10-30T09:55:36.450707258Z",
  "resend_available_at": "2026-10-30T09:50:37.450707258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660704732` → **200**

```json
{
  "phone": "+380660704732",
  "audience": "CLIENT",
  "code": "513719",
  "sent_at": "2026-10-30T09:50:36.453254723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2269ee0-0c08-43ea-9816-29f8f3cad017",
  "code": "513719",
  "device_ref": "sandbox-29339"
}
```

```json
{
  "session_id": "4bf736a6-d404-425e-8443-59dfa45e2ade",
  "subject": {
    "type": "CLIENT",
    "id": "1ba72c64-1683-45ea-8c86-e8b454e5f6cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmE3MmM2NC0xNjgzLTQ1ZWEtOGM4Ni1lOGI0NTRlNWY2Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzM2LCJpYXQiOjE3OTMzNTM4MzYsImp0aSI6IjRjMTRiZDM1LTMyOGEtNDE5NC05Mjc0LWYyNjRjZTVhYWMzNyIsInNpZCI6IjRiZjczNmE2LWQ0MDQtNDI1ZS04NDQzLTU5ZGZhNDVlMmFkZSJ9.PCWNmANYSMycD66yOl8PmJYj_bXXjQwQpvYhR4SGfXU",
  "access_expires_at": "2026-10-30T10:05:36.7623036Z",
  "refresh_token": "oPB0SPvg3X03sbyCQRJhZ_5krvdbNiHx3Dv0GkGUvIs",
  "refresh_expires_at": "2026-11-29T09:50:36.761824157Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7cb6c090-5f5c-408f-b32b-7d120c007f1e",
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
  "id": "6809a7a1-bea4-4e8c-b998-861b4494107d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:37.039491Z",
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
  "command_id": "f82e7336-3030-4aea-9ded-e1218783e33c",
  "quote_id": "6809a7a1-bea4-4e8c-b998-861b4494107d",
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
  "id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ba72c64-1683-45ea-8c86-e8b454e5f6cb",
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
  "created_at": "2026-10-30T09:50:37.337488Z",
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
    "id": "bf2dabc6-c50c-4f40-a384-bc99a695d349",
    "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
    "expires_at": "2026-10-30T09:50:52.340356Z",
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

`POST /api/driver/v1/offers/bf2dabc6-c50c-4f40-a384-bc99a695d349/accept` → **200**

```json
{
  "command_id": "97dd91a1-7711-48db-b625-11816103c8ee"
}
```

```json
{
  "id": "d8b52d2d-c2a3-4caa-809e-443306851a0d",
  "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b0a61984-0e4b-49f2-b0ea-46f2885b532e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b0a61984-0e4b-49f2-b0ea-46f2885b532e",
  "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
  "assignment_id": "d8b52d2d-c2a3-4caa-809e-443306851a0d",
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

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:38Z",
    "sequence": 1793353838451
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:38.468776Z",
  "last_location_at": "2026-10-30T09:50:38.468776Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b0a61984-0e4b-49f2-b0ea-46f2885b532e/arrive` → **200**

```json
{
  "command_id": "a30c23c6-af26-4aa7-b465-b1d517741469",
  "expected_version": 0
}
```

```json
{
  "id": "b0a61984-0e4b-49f2-b0ea-46f2885b532e",
  "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
  "assignment_id": "d8b52d2d-c2a3-4caa-809e-443306851a0d",
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
  "arrived_at": "2026-10-30T09:50:38.749629Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b0a61984-0e4b-49f2-b0ea-46f2885b532e/start` → **200**

```json
{
  "command_id": "4182cced-7f53-4d58-89a8-46c0a9e067c5",
  "expected_version": 1
}
```

```json
{
  "id": "b0a61984-0e4b-49f2-b0ea-46f2885b532e",
  "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
  "assignment_id": "d8b52d2d-c2a3-4caa-809e-443306851a0d",
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
  "arrived_at": "2026-10-30T09:50:38.749629Z",
  "started_at": "2026-10-30T09:50:39.055771Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:39Z",
    "sequence": 1793353839332
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:39.350349Z",
  "last_location_at": "2026-10-30T09:50:39.350349Z",
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
  "device_ref": "sandbox-9737"
}
```

```json
{
  "challenge_id": "cae37182-6479-4062-b725-28da8090f5a4",
  "expires_at": "2026-10-30T09:55:39.630074468Z",
  "resend_available_at": "2026-10-30T09:50:40.630074468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "462887",
  "sent_at": "2026-10-30T09:50:39.632675672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cae37182-6479-4062-b725-28da8090f5a4",
  "code": "462887",
  "device_ref": "sandbox-9737"
}
```

```json
{
  "session_id": "6e72afb8-5a35-45d9-85ad-d7aa6d510194",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDczOSwiaWF0IjoxNzkzMzUzODM5LCJqdGkiOiJjMDBiZGFlYi1jODM2LTRkNzQtOTEyMi0yNzU5YTcxYjg4NjMiLCJzaWQiOiI2ZTcyYWZiOC01YTM1LTQ1ZDktODVhZC1kN2FhNmQ1MTAxOTQifQ.RtQ_XoW7-4LxkYiRJLjA2xPnaoOykHB8bzkqlk-rmuw",
  "access_expires_at": "2026-10-30T10:05:39.930683393Z",
  "refresh_token": "Ss74U3hDYa3Z87ju7EMWsraIrYZjQlQw-E1MWK8lF3k",
  "refresh_expires_at": "2026-11-29T09:50:39.930175648Z",
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
  "command_id": "9883ae0d-fba1-4ed1-bfd1-c2f55b98992f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:40Z",
    "sequence": 1793353840468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "36157c0a-3308-4250-9341-94d18cdcbbc7",
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
  "last_heartbeat_at": "2026-10-30T09:50:40.486221Z",
  "last_location_at": "2026-10-30T09:50:40.486221Z",
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
  "session_id": "4790a6f1-f4fb-4e01-a291-da4b1685ad81",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3NDEsImlhdCI6MTc5MzM1Mzg0MSwianRpIjoiNjZkMzA1ZWItYjRlZi00MjdhLThlNGEtMDBjMmE2YWIxOTQzIiwic2lkIjoiNDc5MGE2ZjEtZjRmYi00ZTAxLWEyOTEtZGE0YjE2ODVhZDgxIn0.ORp0yPREOo2ksf_NaPIVNKqoGZaCP5WAwNZ2-SSvsyI",
  "access_expires_at": "2026-10-30T10:05:41.066894841Z",
  "refresh_token": "vqk0EuVdeu1XWjoKfd6mhuHpaMLcZY5peBR_wnS2lWU",
  "refresh_expires_at": "2026-10-30T21:50:41.065922167Z",
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
  "session_id": "22e06563-9afb-44bc-a363-12e29012ab72",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3NDEsImlhdCI6MTc5MzM1Mzg0MSwianRpIjoiNzdkZWE4MmYtZWY4Mi00ZjMyLTkzMTEtYjlhNGJjOWE2OTJiIiwic2lkIjoiMjJlMDY1NjMtOWFmYi00NGJjLWEzNjMtMTJlMjkwMTJhYjcyIn0.FD9YzClHDdfZh_zgiYbstmGT07Ss5NvoAJbM4T61q_M",
  "access_expires_at": "2026-10-30T10:05:41.675997851Z",
  "refresh_token": "YGoj1_Khta8vxlifFqssAdztOoQX2N1r0XIkqmnfB5Q",
  "refresh_expires_at": "2026-10-30T21:50:41.675297178Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/03e31c66-0556-4e1f-abe5-fe9fbaae4252` → **200**

```json
{
  "id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1ba72c64-1683-45ea-8c86-e8b454e5f6cb",
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
    "id": "d8b52d2d-c2a3-4caa-809e-443306851a0d",
    "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b0a61984-0e4b-49f2-b0ea-46f2885b532e",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:50:37.337488Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/03e31c66-0556-4e1f-abe5-fe9fbaae4252/interrupt` → **200**

```json
{
  "command_id": "e63f621e-7024-408d-92db-c022a03aedc8",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1ba72c64-1683-45ea-8c86-e8b454e5f6cb",
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
      "id": "d8b52d2d-c2a3-4caa-809e-443306851a0d",
      "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b0a61984-0e4b-49f2-b0ea-46f2885b532e",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:50:37.337488Z",
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
    "id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1ba72c64-1683-45ea-8c86-e8b454e5f6cb",
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
    "id": "e7b46a6a-dfd7-4438-8eaa-fa63a5de0fb5",
    "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
    "expires_at": "2026-10-30T09:50:57.290193Z",
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

`POST /api/driver/v1/offers/e7b46a6a-dfd7-4438-8eaa-fa63a5de0fb5/accept` → **200**

```json
{
  "command_id": "8a95e32e-efe2-4918-bc84-b28a3483ca87"
}
```

```json
{
  "id": "f4d559fd-1fe2-42ed-8016-68f161918bed",
  "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe2cf941-e5f6-4022-9704-b8e2a00e8ac7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe2cf941-e5f6-4022-9704-b8e2a00e8ac7",
  "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
  "assignment_id": "f4d559fd-1fe2-42ed-8016-68f161918bed",
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
  "session_id": "36157c0a-3308-4250-9341-94d18cdcbbc7",
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
  "last_heartbeat_at": "2026-10-30T09:50:40.486221Z",
  "last_location_at": "2026-10-30T09:50:40.486221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/36157c0a-3308-4250-9341-94d18cdcbbc7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:43Z",
    "sequence": 1793353843721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "36157c0a-3308-4250-9341-94d18cdcbbc7",
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
  "last_heartbeat_at": "2026-10-30T09:50:43.740066Z",
  "last_location_at": "2026-10-30T09:50:43.740066Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fe2cf941-e5f6-4022-9704-b8e2a00e8ac7/arrive` → **200**

```json
{
  "command_id": "41c423a8-f398-4936-93d0-2bf10fc35a37",
  "expected_version": 0
}
```

```json
{
  "id": "fe2cf941-e5f6-4022-9704-b8e2a00e8ac7",
  "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
  "assignment_id": "f4d559fd-1fe2-42ed-8016-68f161918bed",
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
  "arrived_at": "2026-10-30T09:50:44.036097Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe2cf941-e5f6-4022-9704-b8e2a00e8ac7/start` → **200**

```json
{
  "command_id": "0c83856a-1624-4097-9efd-f5d6130263db",
  "expected_version": 1
}
```

```json
{
  "id": "fe2cf941-e5f6-4022-9704-b8e2a00e8ac7",
  "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
  "assignment_id": "f4d559fd-1fe2-42ed-8016-68f161918bed",
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
  "arrived_at": "2026-10-30T09:50:44.036097Z",
  "started_at": "2026-10-30T09:50:44.328212Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe2cf941-e5f6-4022-9704-b8e2a00e8ac7/complete` → **200**

```json
{
  "command_id": "9902e89f-5bd0-4fd5-8de8-74af038f6ef0",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:50:44Z"
}
```

```json
{
  "id": "fe2cf941-e5f6-4022-9704-b8e2a00e8ac7",
  "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
  "assignment_id": "f4d559fd-1fe2-42ed-8016-68f161918bed",
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
  "arrived_at": "2026-10-30T09:50:44.036097Z",
  "started_at": "2026-10-30T09:50:44.328212Z",
  "completed_at": "2026-10-30T09:50:44.61594Z",
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
    "id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:50:42.280381Z",
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
    "id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:50:37.337488Z",
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

`GET /api/operator/v1/orders/03e31c66-0556-4e1f-abe5-fe9fbaae4252/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:50:37.337961Z",
      "actor": {
        "type": "CLIENT",
        "id": "1ba72c64-1683-45ea-8c86-e8b454e5f6cb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
        "quote_id": "6809a7a1-bea4-4e8c-b998-861b4494107d",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "e5a3c77f-f9a9-4c16-b6cf-b147525517a6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:50:37.339713Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
        "attempt_id": "f49b08ac-7a3b-4e1b-9877-40f5cd8c449f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e5a3c77f-f9a9-4c16-b6cf-b147525517a6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:50:37.34225Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bf2dabc6-c50c-4f40-a384-bc99a695d349",
        "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "e5a3c77f-f9a9-4c16-b6cf-b147525517a6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:50:37.920568Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bf2dabc6-c50c-4f40-a384-bc99a695d349",
        "order_id": "03e31c66-0556-4e1f-abe5-fe9fbaae4252",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d8b52d2d-c2a3-4caa-809e-443306851a0d"
      },
      "correlation_id": "9eb166fe-ca4b-40ae-8c16-e646e0e406b1"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/cae731f1-a7c2-485e-b8b0-9cc7a706257e/tip` → **200**

```json
{
  "order_id": "cae731f1-a7c2-485e-b8b0-9cc7a706257e",
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
  "available_until": "2026-10-31T09:50:44.61594Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/cae731f1-a7c2-485e-b8b0-9cc7a706257e/tip` → **409**

```json
{
  "command_id": "f5d0a264-4a10-4bec-bd3b-110142ebcbf7",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/cae731f1-a7c2-485e-b8b0-9cc7a706257e/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d86e95b8-2287-45c3-b7d7-755fdaceefc6"
}
```

Done: interrupted 03e31c66-0556-4e1f-abe5-fe9fbaae4252, follow-up cae731f1-a7c2-485e-b8b0-9cc7a706257e.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fadb92d6-a89c-4f48-bcb0-e4376b67035f",
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
  "last_heartbeat_at": "2026-10-30T09:50:39.350349Z",
  "last_location_at": "2026-10-30T09:50:39.350349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fadb92d6-a89c-4f48-bcb0-e4376b67035f/close` → **200**

```json
{
  "command_id": "20b331d5-471a-4c6a-bef1-1087b6264095",
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
  "session_id": "36157c0a-3308-4250-9341-94d18cdcbbc7",
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
  "last_heartbeat_at": "2026-10-30T09:50:43.740066Z",
  "last_location_at": "2026-10-30T09:50:43.740066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36157c0a-3308-4250-9341-94d18cdcbbc7/close` → **200**

```json
{
  "command_id": "6058d748-b83d-49a8-b73b-3155108f8556",
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
  "session_id": "907706cd-6cb9-48af-a33b-fa55d141e1d3",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3NTAsImlhdCI6MTc5MzM1Mzg1MCwianRpIjoiMmVmOGVlMzMtMTIyYi00NDViLWFkOWEtMDM2NWQ3ODQ3NzZhIiwic2lkIjoiOTA3NzA2Y2QtNmNiOS00OGFmLWEzM2ItZmE1NWQxNDFlMWQzIn0.f1JgNBmi8RIG1Gxo35HUf9UaFcmsf9WkkCBKtVNgzw8",
  "access_expires_at": "2026-10-30T10:05:50.760441717Z",
  "refresh_token": "_k0yHQM-5Nk2ZJIZ4Hj7qMz-RltzPptXIRyGexhvoLE",
  "refresh_expires_at": "2026-10-30T21:50:50.759824617Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b736fe4f-d075-4ffb-9042-5ed5898f685c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:50:51Z"
}
```

```json
{
  "id": "0b64af78-45d3-462f-9d5b-2f865f25bf48",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:50:51Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0b64af78-45d3-462f-9d5b-2f865f25bf48/publish` → **200**

```json
{
  "command_id": "99acdf2b-5266-42ad-aeb2-8182d2b76e18",
  "expected_version": 0
}
```

```json
{
  "id": "0b64af78-45d3-462f-9d5b-2f865f25bf48",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:50:51.342665Z",
  "published_at": "2026-10-30T09:50:51.342665Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "0b64af78-45d3-462f-9d5b-2f865f25bf48",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:50:51.342665Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637775189",
  "device_ref": "sandbox-14999"
}
```

```json
{
  "challenge_id": "75dd2317-cfa5-4327-8ac2-c70b13edb170",
  "expires_at": "2026-10-30T09:55:51.916450694Z",
  "resend_available_at": "2026-10-30T09:50:52.916450694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637775189` → **200**

```json
{
  "phone": "+380637775189",
  "audience": "CLIENT",
  "code": "559855",
  "sent_at": "2026-10-30T09:50:51.919730633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75dd2317-cfa5-4327-8ac2-c70b13edb170",
  "code": "559855",
  "device_ref": "sandbox-14999"
}
```

```json
{
  "session_id": "d60eed30-8fee-4413-aa2e-9a7ddb21f187",
  "subject": {
    "type": "CLIENT",
    "id": "cee54468-db78-4bb3-8b79-837fedc60156"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWU1NDQ2OC1kYjc4LTRiYjMtOGI3OS04MzdmZWRjNjAxNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzUyLCJpYXQiOjE3OTMzNTM4NTIsImp0aSI6IjlhNjFkN2U2LWFkZWQtNDQyNi1hMGNmLTU1MzRhZTE1NTc1NiIsInNpZCI6ImQ2MGVlZDMwLThmZWUtNDQxMy1hYTJlLTlhN2RkYjIxZjE4NyJ9.6M_K1pkGU820RfDdCv2umvjhW9SNwtWQnam0kbfVvzg",
  "access_expires_at": "2026-10-30T10:05:52.213164984Z",
  "refresh_token": "nMq8X3Hv4ONJwJ3I5J2s0-qE1vhFJjyjTP-43WxsXow",
  "refresh_expires_at": "2026-11-29T09:50:52.212637905Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "0b64af78-45d3-462f-9d5b-2f865f25bf48",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:50:51.342665Z",
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
  "command_id": "7023c04d-13fe-4eaa-8fed-f82fd50b2bf0",
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
  "id": "d7a9f286-d212-42b3-8086-e2a8262b72c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:52.770483Z",
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
  "command_id": "378e3792-c74a-4b70-b81e-f0685a46c19f",
  "quote_id": "d7a9f286-d212-42b3-8086-e2a8262b72c4",
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
  "correlation_id": "daa76e9c-ad1f-4ff2-bdc4-18486b5be62c"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "87f4fbb4-c131-43f8-afa5-ea7d9b3fd6f6",
  "version_id": "0b64af78-45d3-462f-9d5b-2f865f25bf48",
  "language": "uk"
}
```

```json
{
  "version_id": "0b64af78-45d3-462f-9d5b-2f865f25bf48",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:50:53.34141Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e6a0d7f8-4010-4acf-be40-104d9956342a",
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
  "id": "21e3f6ee-b7f9-4868-875d-49efa41cb90d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:53.627230Z",
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
  "command_id": "8a4a2482-da53-4394-ba3f-9951c51e6d9b",
  "quote_id": "21e3f6ee-b7f9-4868-875d-49efa41cb90d",
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
  "id": "c33c9c00-5b9d-4497-8dec-b2e6e31cb47d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cee54468-db78-4bb3-8b79-837fedc60156",
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
  "created_at": "2026-10-30T09:50:53.905385Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c33c9c00-5b9d-4497-8dec-b2e6e31cb47d` → **200**

```json
{
  "id": "c33c9c00-5b9d-4497-8dec-b2e6e31cb47d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cee54468-db78-4bb3-8b79-837fedc60156",
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
  "created_at": "2026-10-30T09:50:53.905385Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c33c9c00-5b9d-4497-8dec-b2e6e31cb47d/cancel` → **200**

```json
{
  "command_id": "3f22b7d3-a74b-43b5-a566-5a6880323fb4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c33c9c00-5b9d-4497-8dec-b2e6e31cb47d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cee54468-db78-4bb3-8b79-837fedc60156",
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
  "created_at": "2026-10-30T09:50:53.905385Z",
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

`POST /api/admin/v1/legal-documents/0b64af78-45d3-462f-9d5b-2f865f25bf48` → **409**

```json
{
  "command_id": "b57ffee9-16f7-4e85-bdb6-9a33d7b2ba3b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:50:54Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/0b64af78-45d3-462f-9d5b-2f865f25bf48",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f0ed4417-7369-4289-803c-14cafd10632f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f41e4b6a-868f-4a74-9a8d-24b492b32751",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:50:55Z"
}
```

```json
{
  "id": "df8bc0db-3b0a-4fe5-9b9b-918abf0d177f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:50:55Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/df8bc0db-3b0a-4fe5-9b9b-918abf0d177f/publish` → **200**

```json
{
  "command_id": "f7819410-010d-4cec-b046-c449f497b1d8",
  "expected_version": 0
}
```

```json
{
  "id": "df8bc0db-3b0a-4fe5-9b9b-918abf0d177f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:50:55.388491Z",
  "published_at": "2026-10-30T09:50:55.388491Z",
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
  "device_ref": "sandbox-18519"
}
```

```json
{
  "challenge_id": "84e312c1-81ed-4af3-983a-1fb401d8ed77",
  "expires_at": "2026-10-30T09:55:55.676047867Z",
  "resend_available_at": "2026-10-30T09:50:56.676047867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "152669",
  "sent_at": "2026-10-30T09:50:55.67872018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84e312c1-81ed-4af3-983a-1fb401d8ed77",
  "code": "152669",
  "device_ref": "sandbox-18519"
}
```

```json
{
  "session_id": "9d2510dc-a303-4350-99ca-35d19f2dfed9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDc1NSwiaWF0IjoxNzkzMzUzODU1LCJqdGkiOiI3YWU0MTc5NC0xNjVkLTRmNjYtYjFlNi1lNjkxOWVhNTZkY2UiLCJzaWQiOiI5ZDI1MTBkYy1hMzAzLTQzNTAtOTljYS0zNWQxOWYyZGZlZDkifQ.c99_UubGw0DcFQMn-Af7C40rJ09weeeNMZkhYYLGzHI",
  "access_expires_at": "2026-10-30T10:05:55.9771386Z",
  "refresh_token": "YmGdrA1PnVa09oizKR5teGA-YX30YgEaTt5rT3AEyvE",
  "refresh_expires_at": "2026-11-29T09:50:55.976555818Z",
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
  "command_id": "88d16372-8453-46c3-90c9-fc2c0bb9d1f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:50:56Z",
    "sequence": 1793353856514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27eab6a4-7f9a-47b1-b1e9-8c88b8f489f9",
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
  "last_heartbeat_at": "2026-10-30T09:50:56.532083Z",
  "last_location_at": "2026-10-30T09:50:56.532083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675510688",
  "device_ref": "sandbox-12907"
}
```

```json
{
  "challenge_id": "6c3ad44d-3866-43fc-9f58-edd8e557d23d",
  "expires_at": "2026-10-30T09:55:56.826689228Z",
  "resend_available_at": "2026-10-30T09:50:57.826689228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675510688` → **200**

```json
{
  "phone": "+380675510688",
  "audience": "CLIENT",
  "code": "711743",
  "sent_at": "2026-10-30T09:50:56.829264576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c3ad44d-3866-43fc-9f58-edd8e557d23d",
  "code": "711743",
  "device_ref": "sandbox-12907"
}
```

```json
{
  "session_id": "34f92c06-7f88-4311-8010-9922b5a7e8d8",
  "subject": {
    "type": "CLIENT",
    "id": "d82c037f-4b92-4b09-bb24-31e350d9aee2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODJjMDM3Zi00YjkyLTRiMDktYmIyNC0zMWUzNTBkOWFlZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzU3LCJpYXQiOjE3OTMzNTM4NTcsImp0aSI6IjA3MmY3NmQxLTQzNDktNDM2ZC05MjY5LTg4ZTY4ZjYxZDhlZiIsInNpZCI6IjM0ZjkyYzA2LTdmODgtNDMxMS04MDEwLTk5MjJiNWE3ZThkOCJ9.-5QjGwCmz3zg9NrTV_lJsDg1vmHAxuU-VGdNmfzg9CA",
  "access_expires_at": "2026-10-30T10:05:57.119395282Z",
  "refresh_token": "5feTyLruz-NrnX9cBwL7GlyvJGJtrO4KzgUqqwFz61w",
  "refresh_expires_at": "2026-11-29T09:50:57.118837454Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8db15334-b8c9-46ad-9c59-151c3a3d829e",
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
  "id": "304504fe-0e5c-4b73-b5c3-ae8e1afa7a5c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:57.393915Z",
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
  "command_id": "877d5cb5-a9a7-45ef-88f0-59fe9b63e1e5",
  "quote_id": "304504fe-0e5c-4b73-b5c3-ae8e1afa7a5c",
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
    "phone": "+380678869179"
  }
}
```

```json
{
  "id": "42c76cce-7944-4087-8609-d2069e9cc99e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:50:57.685739Z",
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
    "id": "3b649ae6-4a63-411e-9ffd-d3c995f613e2",
    "order_id": "42c76cce-7944-4087-8609-d2069e9cc99e",
    "expires_at": "2026-10-30T09:51:12.689218Z",
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

`POST /api/driver/v1/offers/3b649ae6-4a63-411e-9ffd-d3c995f613e2/accept` → **200**

```json
{
  "command_id": "fcca91ca-1486-46e1-b8b3-92cb71eb4c18"
}
```

```json
{
  "id": "7de42f5d-54dd-4ef9-bd29-938a4c205e09",
  "order_id": "42c76cce-7944-4087-8609-d2069e9cc99e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "21668882-214d-4ba4-8a68-1fbec9c1a7ab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "21668882-214d-4ba4-8a68-1fbec9c1a7ab",
  "order_id": "42c76cce-7944-4087-8609-d2069e9cc99e",
  "assignment_id": "7de42f5d-54dd-4ef9-bd29-938a4c205e09",
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
    "phone": "+380678869179"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d6cc461-bb2d-430b-ac2e-9f19f709aa3e",
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
  "id": "19717348-ce1f-4b33-bbcb-52b88cf0afe7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:58.842894Z",
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
  "command_id": "2b18ee04-5791-4e25-a6c8-96db9a63701f",
  "quote_id": "19717348-ce1f-4b33-bbcb-52b88cf0afe7",
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
  "id": "db394063-60ba-47c8-8140-d89847158a11",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:59.128994Z",
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
  "command_id": "4f04d4c6-822c-4d7d-8f5b-98ba61dc2fc4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:50:59Z"
}
```

```json
{
  "id": "734dc416-03c9-41fa-ba7b-110f8f7de632",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:55:59.433756Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:50:59Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "04d90df6-7892-4e70-aed4-bbc81cd1f75f",
  "quote_id": "734dc416-03c9-41fa-ba7b-110f8f7de632",
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
  "pickup_at": "2026-10-30T12:50:59Z"
}
```

```json
{
  "id": "138f2bad-d4f2-44b5-ab20-e38c78d07123",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:50:59.731536Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:50:59Z",
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
  "command_id": "a9399161-c601-4315-9292-54496e831930",
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
  "id": "7d4f2e2a-9b4e-4421-b7ae-e0f7965d41d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:00.043601Z",
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
  "command_id": "2a281472-95b9-4a0b-8ff8-98b2b31216d2",
  "quote_id": "7d4f2e2a-9b4e-4421-b7ae-e0f7965d41d2",
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
  "correlation_id": "5c032839-7e45-4805-a57f-d7b0a2580015"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "138f2bad-d4f2-44b5-ab20-e38c78d07123",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:50:59.731536Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:50:59Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "db394063-60ba-47c8-8140-d89847158a11",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:50:59.128994Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "42c76cce-7944-4087-8609-d2069e9cc99e",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "db394063-60ba-47c8-8140-d89847158a11",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:59.128994Z",
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

`GET /api/rider/v1/orders/42c76cce-7944-4087-8609-d2069e9cc99e` → **200**

```json
{
  "id": "42c76cce-7944-4087-8609-d2069e9cc99e",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7de42f5d-54dd-4ef9-bd29-938a4c205e09",
    "order_id": "42c76cce-7944-4087-8609-d2069e9cc99e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "21668882-214d-4ba4-8a68-1fbec9c1a7ab",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:50:57.685739Z",
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
    "location_at": "2026-10-30T09:50:56.532083Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/42c76cce-7944-4087-8609-d2069e9cc99e/cancel` → **200**

```json
{
  "command_id": "e323f369-df52-42c2-bf50-0b032cbd1819",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "42c76cce-7944-4087-8609-d2069e9cc99e",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7de42f5d-54dd-4ef9-bd29-938a4c205e09",
    "order_id": "42c76cce-7944-4087-8609-d2069e9cc99e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "21668882-214d-4ba4-8a68-1fbec9c1a7ab",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:50:57.685739Z",
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

`GET /api/rider/v1/orders/db394063-60ba-47c8-8140-d89847158a11` → **200**

```json
{
  "id": "db394063-60ba-47c8-8140-d89847158a11",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:50:59.128994Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db394063-60ba-47c8-8140-d89847158a11/cancel` → **200**

```json
{
  "command_id": "185aa1b5-3f44-41e1-a3cf-cf4a3b2a4641",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "db394063-60ba-47c8-8140-d89847158a11",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:50:59.128994Z",
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

`GET /api/rider/v1/orders/138f2bad-d4f2-44b5-ab20-e38c78d07123` → **200**

```json
{
  "id": "138f2bad-d4f2-44b5-ab20-e38c78d07123",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:50:59.731536Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:50:59Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/138f2bad-d4f2-44b5-ab20-e38c78d07123/cancel` → **200**

```json
{
  "command_id": "f02e022a-787f-457f-bfd3-46859919a9c1",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "138f2bad-d4f2-44b5-ab20-e38c78d07123",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d82c037f-4b92-4b09-bb24-31e350d9aee2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:50:59.731536Z",
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
  "pickup_at": "2026-10-30T12:50:59Z",
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
  "session_id": "27eab6a4-7f9a-47b1-b1e9-8c88b8f489f9",
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
  "last_heartbeat_at": "2026-10-30T09:50:56.532083Z",
  "last_location_at": "2026-10-30T09:50:56.532083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27eab6a4-7f9a-47b1-b1e9-8c88b8f489f9/close` → **200**

```json
{
  "command_id": "c69a753d-49e6-4ac1-bdd8-be4dc6d863ce",
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

Done: orders 42c76cce-7944-4087-8609-d2069e9cc99e, db394063-60ba-47c8-8140-d89847158a11, 138f2bad-d4f2-44b5-ab20-e38c78d07123.

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
  "session_id": "dfe8ac26-f49e-4a31-b1cc-d5d7470f6d3b",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3NjMsImlhdCI6MTc5MzM1Mzg2MywianRpIjoiN2I3MDVmYTItZDRhZS00MjIyLWI2ODktNmMxNWE5ZGViMzNhIiwic2lkIjoiZGZlOGFjMjYtZjQ5ZS00YTMxLWIxY2MtZDVkNzQ3MGY2ZDNiIn0.8-V1UDgnDweW5l2IDy-X27Lw5MRQwZNWUWeGaD2GRJU",
  "access_expires_at": "2026-10-30T10:06:03.821297067Z",
  "refresh_token": "2veHKfdU3RAGX05BA5jcI6-78PHoplAfO6RLy5xBVlk",
  "refresh_expires_at": "2026-10-30T21:51:03.820765384Z",
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
  "session_id": "c752278b-bd09-41f3-8761-086c425730bd",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3NjQsImlhdCI6MTc5MzM1Mzg2NCwianRpIjoiMDgxNzhkOGEtNmUyYi00MmMyLWFjNDItZDc3NGFlMjJjM2Y5Iiwic2lkIjoiYzc1MjI3OGItYmQwOS00MWYzLTg3NjEtMDg2YzQyNTczMGJkIn0.fA7yyu9gv4It4h6DpxB0iW8gD2USF8ZhfwIKn7RcTJc",
  "access_expires_at": "2026-10-30T10:06:04.390238698Z",
  "refresh_token": "3_Kl1Kk12enQIV9N878RdGOsHhxqTFgS2PjT7Ju4euo",
  "refresh_expires_at": "2026-10-30T21:51:04.389734481Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3171"
}
```

```json
{
  "challenge_id": "b796c251-2f23-409b-9eb7-ae0def270ebb",
  "expires_at": "2026-10-30T09:56:04.652899656Z",
  "resend_available_at": "2026-10-30T09:51:05.652899656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "225073",
  "sent_at": "2026-10-30T09:51:04.655432307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b796c251-2f23-409b-9eb7-ae0def270ebb",
  "code": "225073",
  "device_ref": "sandbox-3171"
}
```

```json
{
  "session_id": "79eb3bf9-cb05-45f5-ade6-a4a1c2bb61a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDc2NCwiaWF0IjoxNzkzMzUzODY0LCJqdGkiOiI5YjMxNGY5OS1mZjAyLTQyMjYtYjhjMC1kYzQxYzAyNjQ2ZWUiLCJzaWQiOiI3OWViM2JmOS1jYjA1LTQ1ZjUtYWRlNi1hNGExYzJiYjYxYTIifQ.G2I-HJWI4ZFG4Ejv8E9ZfVoe4ZpNUnCsktz1-0DZLiM",
  "access_expires_at": "2026-10-30T10:06:04.954259521Z",
  "refresh_token": "SalsUne3iO2GXnoj3ejDQJN7L61db3zbYkyde4v7llQ",
  "refresh_expires_at": "2026-11-29T09:51:04.9537642Z",
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
  "command_id": "c9887b47-0dbc-4fa6-a545-93d7ef5115ff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:05Z",
    "sequence": 1793353865495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc2e240f-244c-4936-980f-f85a6d81989d",
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
  "last_heartbeat_at": "2026-10-30T09:51:05.512928Z",
  "last_location_at": "2026-10-30T09:51:05.512928Z",
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
  "command_id": "3f29f78e-c38a-4e1a-b66b-0cacb375c151",
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
  "effective_at": "2026-10-30T09:51:06.080101Z",
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:48:28.463132Z",
  "last_entries": [
    {
      "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:48:28.463132Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "278359b5-5e0d-4b45-9213-f5924baf4f17",
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
  "id": "b95aec62-11fb-457f-87ad-63043d022da9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:06.650169Z",
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
  "command_id": "61f9381a-823a-4c3a-9f4b-5615c9ecc896",
  "quote_id": "b95aec62-11fb-457f-87ad-63043d022da9",
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
    "phone": "+3806711124574"
  }
}
```

```json
{
  "id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
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
  "created_at": "2026-10-30T09:51:06.981591Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124574"
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
    "id": "9552b0c3-304f-44c0-99e3-ef40a4c95a50",
    "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
    "expires_at": "2026-10-30T09:51:21.985155Z",
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

`POST /api/driver/v1/offers/9552b0c3-304f-44c0-99e3-ef40a4c95a50/accept` → **200**

```json
{
  "command_id": "f0d4ea39-74a6-4506-be80-7fc825a0e612"
}
```

```json
{
  "id": "0b2bfd5d-9ec7-4744-bad9-89fed02cee04",
  "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dcd60577-bd5c-41a3-b80a-bde3403e46e2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dcd60577-bd5c-41a3-b80a-bde3403e46e2",
  "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
  "assignment_id": "0b2bfd5d-9ec7-4744-bad9-89fed02cee04",
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
    "phone": "+3806711124574"
  }
}
```

`POST /api/driver/v1/work-sessions/fc2e240f-244c-4936-980f-f85a6d81989d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:08Z",
    "sequence": 1793353868807
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc2e240f-244c-4936-980f-f85a6d81989d",
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
  "last_heartbeat_at": "2026-10-30T09:51:08.098806Z",
  "last_location_at": "2026-10-30T09:51:08.098806Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dcd60577-bd5c-41a3-b80a-bde3403e46e2/arrive` → **200**

```json
{
  "command_id": "ef341f4a-d1bb-4a97-adf3-4f0f27e0c732",
  "expected_version": 0
}
```

```json
{
  "id": "dcd60577-bd5c-41a3-b80a-bde3403e46e2",
  "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
  "assignment_id": "0b2bfd5d-9ec7-4744-bad9-89fed02cee04",
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
  "arrived_at": "2026-10-30T09:51:08.382935Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124574"
  }
}
```

`POST /api/driver/v1/trips/dcd60577-bd5c-41a3-b80a-bde3403e46e2/start` → **200**

```json
{
  "command_id": "45fe323a-03cf-47a7-b6c6-7ff408ee9915",
  "expected_version": 1
}
```

```json
{
  "id": "dcd60577-bd5c-41a3-b80a-bde3403e46e2",
  "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
  "assignment_id": "0b2bfd5d-9ec7-4744-bad9-89fed02cee04",
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
  "arrived_at": "2026-10-30T09:51:08.382935Z",
  "started_at": "2026-10-30T09:51:08.666399Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124574"
  }
}
```

`POST /api/driver/v1/trips/dcd60577-bd5c-41a3-b80a-bde3403e46e2/complete` → **200**

```json
{
  "command_id": "566ff967-e80d-4c36-acab-b73d76130cee",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:51:08Z",
  "cash_received": true
}
```

```json
{
  "id": "dcd60577-bd5c-41a3-b80a-bde3403e46e2",
  "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
  "assignment_id": "0b2bfd5d-9ec7-4744-bad9-89fed02cee04",
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
  "arrived_at": "2026-10-30T09:51:08.382935Z",
  "started_at": "2026-10-30T09:51:08.666399Z",
  "completed_at": "2026-10-30T09:51:08.964695Z",
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
  "command_id": "6f3cdd58-ab48-407b-b94c-7a763b9b78b5",
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
  "id": "8b7e8ce5-59d3-4731-90b6-406bbeaf140e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:09.265172Z",
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
  "command_id": "109101cb-1ce8-48c1-b894-1c6b7ead6f22",
  "quote_id": "8b7e8ce5-59d3-4731-90b6-406bbeaf140e",
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
    "phone": "+380671115555"
  }
}
```

```json
{
  "id": "cabe3e1f-3530-4ce4-8026-5997e418a6c5",
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
  "created_at": "2026-10-30T09:51:09.562727Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115555"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/cabe3e1f-3530-4ce4-8026-5997e418a6c5` → **200**

```json
{
  "id": "cabe3e1f-3530-4ce4-8026-5997e418a6c5",
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
  "created_at": "2026-10-30T09:51:09.562727Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115555"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cabe3e1f-3530-4ce4-8026-5997e418a6c5/cancel` → **200**

```json
{
  "command_id": "6adaab32-54ac-4d07-8e6c-94784be8978e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "cabe3e1f-3530-4ce4-8026-5997e418a6c5",
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
  "created_at": "2026-10-30T09:51:09.562727Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115555"
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
  "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:48:28.463132Z",
  "last_entries": [
    {
      "order_id": "cabe3e1f-3530-4ce4-8026-5997e418a6c5",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T09:51:10.167767Z"
    },
    {
      "order_id": "d75b8703-7240-4b91-96c0-f382c8bc42e9",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T09:51:08.969373Z"
    },
    {
      "order_id": "3b51484c-d289-4c8a-bf1e-effc5c0d4c5f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:48:28.463132Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc2e240f-244c-4936-980f-f85a6d81989d",
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
  "last_heartbeat_at": "2026-10-30T09:51:08.098806Z",
  "last_location_at": "2026-10-30T09:51:08.098806Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fc2e240f-244c-4936-980f-f85a6d81989d/close` → **200**

```json
{
  "command_id": "5717dac1-a36e-4eef-b559-12fca9388f87",
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

Done: operator bonus for fulfilled d75b8703-7240-4b91-96c0-f382c8bc42e9 and operator-fault cancellation cabe3e1f-3530-4ce4-8026-5997e418a6c5.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671911082",
  "device_ref": "sandbox-25680"
}
```

```json
{
  "challenge_id": "3672d352-929a-4ef1-aaef-019749cc40be",
  "expires_at": "2026-10-30T09:56:14.535635115Z",
  "resend_available_at": "2026-10-30T09:51:15.535635115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671911082` → **200**

```json
{
  "phone": "+380671911082",
  "audience": "CLIENT",
  "code": "039970",
  "sent_at": "2026-10-30T09:51:14.538458718Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674208775",
  "device_ref": "sandbox-26286",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b24e2260-6aec-437b-b103-a03b2fbaa5ac",
  "expires_at": "2026-10-30T09:56:16.038107701Z",
  "resend_available_at": "2026-10-30T09:51:17.038107701Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674208775` → **200**

```json
{
  "phone": "+380674208775",
  "audience": "CLIENT",
  "code": "345270",
  "sent_at": "2026-10-30T09:51:16.040772027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674208775",
  "device_ref": "sandbox-7092",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1b00455e-33e8-44f1-ab36-6bff072c25c7",
  "expires_at": "2026-10-30T09:56:17.544450754Z",
  "resend_available_at": "2026-10-30T09:51:18.544450754Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674208775` → **200**

```json
{
  "phone": "+380674208775",
  "audience": "CLIENT",
  "code": "960343",
  "sent_at": "2026-10-30T09:51:17.54713142Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670330000",
  "device_ref": "sandbox-27989"
}
```

```json
{
  "challenge_id": "d9eb5dda-33ab-47ba-9390-5f37a881ad48",
  "expires_at": "2026-10-30T09:56:19.04690116Z",
  "resend_available_at": "2026-10-30T09:51:20.04690116Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670330000",
  "device_ref": "sandbox-12862"
}
```

```json
{
  "challenge_id": "80a3e982-d6be-48f6-a95b-45cc4847c8d9",
  "expires_at": "2026-10-30T09:56:20.521022486Z",
  "resend_available_at": "2026-10-30T09:51:21.521022486Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670330000` → **200**

```json
{
  "phone": "+380670330000",
  "audience": "CLIENT",
  "code": "581080",
  "sent_at": "2026-10-30T09:51:20.523816267Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670330000",
  "device_ref": "sandbox-16543",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7c99c39a-4fdf-4f40-9255-c000e411c646",
  "expires_at": "2026-10-30T09:56:22.024749316Z",
  "resend_available_at": "2026-10-30T09:51:23.024749316Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670330000` → **200**

```json
{
  "phone": "+380670330000",
  "audience": "CLIENT",
  "code": "042819",
  "sent_at": "2026-10-30T09:51:22.027106565Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670330000",
  "device_ref": "sandbox-5572",
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
  "correlation_id": "c9fcba49-2af0-45ca-a91e-01971e91c9fd",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000028910"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "abe5eb0e-cefa-49a5-abd1-b5764ba587dd"
}
```

`GET /sandbox/v1/otp?phone=%2B442000028910` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120008966"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "762e2571-07f2-457f-92d2-f814bfb5ed32"
}
```

`GET /sandbox/v1/otp?phone=%2B37120008966` → **404**

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
  "session_id": "ae93d66a-652c-4afc-aa0c-a7fa8d3f174b",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3ODQsImlhdCI6MTc5MzM1Mzg4NCwianRpIjoiMGE2ZGJlNGYtY2IzMC00ZjE4LTg1NTktMzA4ZmQzZGY0NzQyIiwic2lkIjoiYWU5M2Q2NmEtNjUyYy00YWZjLWFhMGMtYTdmYThkM2YxNzRiIn0.ZJiDKw5M1FXQkuJAGAwn8-WlVU5KyaXAUxOQ1dfuEyw",
  "access_expires_at": "2026-10-30T10:06:24.696294653Z",
  "refresh_token": "_sVXEafivEzMK3zycsw20SVBzSNGj6Gh2bwhWYJV_fw",
  "refresh_expires_at": "2026-10-30T21:51:24.695751134Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670330000` → **200**

```json
{
  "deliveries": [
    {
      "id": "2145a92b-513a-4a8f-a8ff-2f4c81ad8a32",
      "challenge_id": "7c99c39a-4fdf-4f40-9255-c000e411c646",
      "phone": "+380670330000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9f98e921-9b91-416e-99d6-f980e324d3b7",
      "error": null,
      "attempted_at": "2026-10-30T09:51:22.027638Z"
    },
    {
      "id": "ea3d3325-eed8-41cf-aa0a-c906578b974e",
      "challenge_id": "80a3e982-d6be-48f6-a95b-45cc4847c8d9",
      "phone": "+380670330000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1118fdfa-3b93-4ee6-b7e3-41cee56f0a2a",
      "error": null,
      "attempted_at": "2026-10-30T09:51:20.524113Z"
    },
    {
      "id": "f829631e-9e26-4142-b813-d39438b5daa3",
      "challenge_id": "d9eb5dda-33ab-47ba-9390-5f37a881ad48",
      "phone": "+380670330000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T09:51:19.049408Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670330000` → **200**

```json
{
  "phone": "+380670330000",
  "audience": "CLIENT",
  "code": "042819",
  "sent_at": "2026-10-30T09:51:22.027106565Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674208775` → **200**

```json
{
  "deliveries": [
    {
      "id": "2a4d6c7a-1c85-4d31-937c-d06c0c60c549",
      "challenge_id": "1b00455e-33e8-44f1-ab36-6bff072c25c7",
      "phone": "+380674208775",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c4a5dcfc-6114-4872-aad9-37133bd0c074",
      "error": null,
      "attempted_at": "2026-10-30T09:51:17.547627Z"
    },
    {
      "id": "0144c551-dfd0-404b-bbcf-b83f874b09d9",
      "challenge_id": "b24e2260-6aec-437b-b103-a03b2fbaa5ac",
      "phone": "+380674208775",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6fee88e7-e5a8-4c22-b857-2da640ce1463",
      "error": null,
      "attempted_at": "2026-10-30T09:51:16.041052Z"
    }
  ]
}
```

Done: SMS to +380671911082; SMS then a call to +380674208775; a failed SMS, two calls and a refused third to +380670330000; +44 and +371 refused.

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
  "session_id": "298ab491-872a-4fa6-aa55-1f90d5f5cc2a",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3ODUsImlhdCI6MTc5MzM1Mzg4NSwianRpIjoiYmQxZTQwMGYtNWMxNi00MTA0LWIyZmQtODFmMWNlZTMwNGI5Iiwic2lkIjoiMjk4YWI0OTEtODcyYS00ZmE2LWFhNTUtMWY5MGQ1ZjVjYzJhIn0.OGZvicBPXOWQjn_xTzvDL88ANtUk6q4_IicYZhFpMoc",
  "access_expires_at": "2026-10-30T10:06:25.871678495Z",
  "refresh_token": "j9SYfR3rHLsbv71u3P7Ibp5reHI7gH8OhOHdpDG9ocw",
  "refresh_expires_at": "2026-10-30T21:51:25.870947363Z",
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
  "session_id": "f01ca903-a5cb-4896-bb49-7959853ebc66",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ3ODYsImlhdCI6MTc5MzM1Mzg4NiwianRpIjoiZDVhMTAwNTQtYzFjMy00MTEyLWI2ZDctMDIwOTI3ODljMDQ1Iiwic2lkIjoiZjAxY2E5MDMtYTVjYi00ODk2LWJiNDktNzk1OTg1M2ViYzY2In0.zGaA1562fsHuK53FaEDe_oT53GV8iO6SpHHNVRXXxp0",
  "access_expires_at": "2026-10-30T10:06:26.436450935Z",
  "refresh_token": "bwG3Oa_pWepXW1b7h4cIjmqWooT2gLqjSw3L9qp3dss",
  "refresh_expires_at": "2026-10-30T21:51:26.435966454Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
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

`POST /api/admin/v1/staff-extensions/6bb82689-e6c5-4817-b540-1b53400d7fbc` → **200**

```json
{
  "command_id": "232673c1-cd65-4f77-8178-1e4dba352e70",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "65d12750-cbf6-43c4-9594-3d7bc61cd84a",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:51:27.535925Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:51:27.535925Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "96c69803-0168-495c-99ba-c999faa7d243",
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
  "id": "29cc0e71-d80a-4ba8-8975-2f41fd638d50",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:28.089087Z",
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
  "command_id": "e64c8d89-7001-4602-b787-38eac1a250e4",
  "quote_id": "29cc0e71-d80a-4ba8-8975-2f41fd638d50",
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
    "phone": "+380677678541"
  }
}
```

```json
{
  "id": "4a175d5d-1eff-4ddf-8e15-2f024a534e8a",
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
  "created_at": "2026-10-30T09:51:28.393614Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677678541"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4a175d5d-1eff-4ddf-8e15-2f024a534e8a/calls` → **201**

```json
{
  "command_id": "fc21c035-aaf1-4fa9-bb72-b2d73106e552",
  "to": "CALLER"
}
```

```json
{
  "id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "order_ids": [
    "4a175d5d-1eff-4ddf-8e15-2f024a534e8a"
  ],
  "started_at": "2026-10-30T09:51:28.720727Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4a175d5d-1eff-4ddf-8e15-2f024a534e8a/calls` → **201**

```json
{
  "command_id": "fc21c035-aaf1-4fa9-bb72-b2d73106e552",
  "to": "CALLER"
}
```

```json
{
  "id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "order_ids": [
    "4a175d5d-1eff-4ddf-8e15-2f024a534e8a"
  ],
  "started_at": "2026-10-30T09:51:28.720727Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677678541",
    "at": "2026-10-30T09:51:28.723116744Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.23196",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "1ecaaf73-50f7-4250-a46c-fe0c2769d010"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4a175d5d-1eff-4ddf-8e15-2f024a534e8a` → **200**

```json
{
  "calls": [
    {
      "id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [
        "4a175d5d-1eff-4ddf-8e15-2f024a534e8a"
      ],
      "started_at": "2026-10-30T09:51:28.720727Z",
      "answered_at": "2026-10-30T09:51:29.37793Z",
      "ended_at": "2026-10-30T09:51:29.399349Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4a175d5d-1eff-4ddf-8e15-2f024a534e8a` → **200**

```json
{
  "calls": [
    {
      "id": "1ecaaf73-50f7-4250-a46c-fe0c2769d010",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "order_ids": [
        "4a175d5d-1eff-4ddf-8e15-2f024a534e8a"
      ],
      "started_at": "2026-10-30T09:51:28.720727Z",
      "answered_at": "2026-10-30T09:51:29.37793Z",
      "ended_at": "2026-10-30T09:51:29.399349Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:51:29.567937Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4a175d5d-1eff-4ddf-8e15-2f024a534e8a` → **200**

```json
{
  "id": "4a175d5d-1eff-4ddf-8e15-2f024a534e8a",
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
  "created_at": "2026-10-30T09:51:28.393614Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677678541"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4a175d5d-1eff-4ddf-8e15-2f024a534e8a/cancel` → **200**

```json
{
  "command_id": "0db550d3-4fa3-4ba2-babf-d3ace1dfb12f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4a175d5d-1eff-4ddf-8e15-2f024a534e8a",
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
  "created_at": "2026-10-30T09:51:28.393614Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677678541"
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
  "command_id": "fcf72882-f3f3-46ae-842a-ba0f4512a965",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T09:51:32.603352Z",
  "extension": "101"
}
```

Done: outgoing call 1ecaaf73-50f7-4250-a46c-fe0c2769d010 from order 4a175d5d-1eff-4ddf-8e15-2f024a534e8a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630039280",
  "device_ref": "sandbox-22498"
}
```

```json
{
  "challenge_id": "f5707afe-1b25-453e-80cb-1b30ad518e7e",
  "expires_at": "2026-10-30T09:56:32.899773393Z",
  "resend_available_at": "2026-10-30T09:51:33.899773393Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630039280` → **200**

```json
{
  "phone": "+380630039280",
  "audience": "CLIENT",
  "code": "777590",
  "sent_at": "2026-10-30T09:51:32.90214971Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5707afe-1b25-453e-80cb-1b30ad518e7e",
  "code": "777590",
  "device_ref": "sandbox-22498"
}
```

```json
{
  "session_id": "60cc0dbd-74c5-46a6-9ce0-cb5f4e4dec15",
  "subject": {
    "type": "CLIENT",
    "id": "02fc86d9-224d-4969-8740-54801003437f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmZjODZkOS0yMjRkLTQ5NjktODc0MC01NDgwMTAwMzQzN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0NzkzLCJpYXQiOjE3OTMzNTM4OTMsImp0aSI6ImJjMmMzZWI3LWIyM2QtNDk5ZC05NzFkLTc4ZjI3ZThkM2ZmNyIsInNpZCI6IjYwY2MwZGJkLTc0YzUtNDZhNi05Y2UwLWNiNWY0ZTRkZWMxNSJ9.DHIDadKSOzW2YcQq0muhlFfbNaBZkORqHo3jTZJm9CY",
  "access_expires_at": "2026-10-30T10:06:33.20393167Z",
  "refresh_token": "gUYYdAOGOUEB8jgG5xBmwdhXKR80avoGcfV0k27UdEc",
  "refresh_expires_at": "2026-11-29T09:51:33.203403414Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "02fc86d9-224d-4969-8740-54801003437f",
  "session_id": "60cc0dbd-74c5-46a6-9ce0-cb5f4e4dec15",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630039280",
  "device_ref": "sandbox-24146"
}
```

```json
{
  "challenge_id": "66ce73ac-dc9a-4e8a-b44e-006643ac29a7",
  "expires_at": "2026-10-30T09:56:35.746862283Z",
  "resend_available_at": "2026-10-30T09:51:36.746862283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630039280` → **200**

```json
{
  "phone": "+380630039280",
  "audience": "CLIENT",
  "code": "144668",
  "sent_at": "2026-10-30T09:51:35.749582914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66ce73ac-dc9a-4e8a-b44e-006643ac29a7",
  "code": "144668",
  "device_ref": "sandbox-24146"
}
```

```json
{
  "session_id": "fdd3c7ab-86ea-45f7-8efc-9a8a10fc37ed",
  "subject": {
    "type": "CLIENT",
    "id": "02fc86d9-224d-4969-8740-54801003437f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmZjODZkOS0yMjRkLTQ5NjktODc0MC01NDgwMTAwMzQzN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0Nzk2LCJpYXQiOjE3OTMzNTM4OTYsImp0aSI6ImQ4N2NkMDc2LTNhYjQtNDI2My05MTZmLTNkZmM3NWY0MDRiOSIsInNpZCI6ImZkZDNjN2FiLTg2ZWEtNDVmNy04ZWZjLTlhOGExMGZjMzdlZCJ9.f6lo_JBSL0gtuwLYpd4HutLtQDotcumqPJOhRFf6TJs",
  "access_expires_at": "2026-10-30T10:06:36.050796616Z",
  "refresh_token": "i5cQFPWbrTpWCCCAUvDAVNoOOfhmNJw6MTySmWGRrV8",
  "refresh_expires_at": "2026-11-29T09:51:36.050257263Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "55e17f65-98c8-45e3-a148-fb6596ca3743",
  "expires_at": "2026-10-30T09:56:38.339576889Z",
  "resend_available_at": "2026-10-30T09:51:39.339576889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630039280` → **200**

```json
{
  "phone": "+380630039280",
  "audience": "CLIENT",
  "code": "851257",
  "sent_at": "2026-10-30T09:51:38.341883247Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634982226"
}
```

```json
{
  "challenge_id": "190144d1-c98c-48a0-9cb3-2d4dabd8deb7",
  "expires_at": "2026-10-30T09:56:38.634932291Z",
  "resend_available_at": "2026-10-30T09:51:39.634932291Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634982226` → **200**

```json
{
  "phone": "+380634982226",
  "audience": "CLIENT",
  "code": "706014",
  "sent_at": "2026-10-30T09:51:38.637013351Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "20cb1fad-eb0a-4447-966a-379d59b2309b",
  "current_challenge_id": "55e17f65-98c8-45e3-a148-fb6596ca3743",
  "current_code": "000000",
  "new_challenge_id": "190144d1-c98c-48a0-9cb3-2d4dabd8deb7",
  "new_code": "706014"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1ddcffc1-803d-4ea9-929b-8f8364a20757"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "8393496c-f2e2-46f3-8f69-aad744ec0174",
  "current_challenge_id": "55e17f65-98c8-45e3-a148-fb6596ca3743",
  "current_code": "851257",
  "new_challenge_id": "190144d1-c98c-48a0-9cb3-2d4dabd8deb7",
  "new_code": "706014"
}
```

```json
{
  "subject_id": "02fc86d9-224d-4969-8740-54801003437f",
  "phone": "+380634982226",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "02fc86d9-224d-4969-8740-54801003437f",
  "session_id": "60cc0dbd-74c5-46a6-9ce0-cb5f4e4dec15",
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
  "correlation_id": "8ad5da78-8f9f-4f0a-b743-63611160d94d"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634982226",
  "device_ref": "sandbox-31852"
}
```

```json
{
  "challenge_id": "a6b23ff9-4839-4cfb-b8d9-6a8229a47367",
  "expires_at": "2026-10-30T09:56:42.073370213Z",
  "resend_available_at": "2026-10-30T09:51:43.073370213Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634982226` → **200**

```json
{
  "phone": "+380634982226",
  "audience": "CLIENT",
  "code": "980069",
  "sent_at": "2026-10-30T09:51:42.076125995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6b23ff9-4839-4cfb-b8d9-6a8229a47367",
  "code": "980069",
  "device_ref": "sandbox-31852"
}
```

```json
{
  "session_id": "14722ce5-4506-4d57-be6a-4e4ca6265f81",
  "subject": {
    "type": "CLIENT",
    "id": "02fc86d9-224d-4969-8740-54801003437f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmZjODZkOS0yMjRkLTQ5NjktODc0MC01NDgwMTAwMzQzN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODAyLCJpYXQiOjE3OTMzNTM5MDIsImp0aSI6IjZiOWYwM2I4LWRmM2UtNDQ4ZC05ZjYwLTE2NDhhNDNjMzFlNCIsInNpZCI6IjE0NzIyY2U1LTQ1MDYtNGQ1Ny1iZTZhLTRlNGNhNjI2NWY4MSJ9.-TCX9dkkDyOzry5BkP7xHUzd4z0FnFpF9TuKQTcnAtU",
  "access_expires_at": "2026-10-30T10:06:42.396916606Z",
  "refresh_token": "8kLnP2kxBDiyId9UqbIsVnVxEOiBvwHNBRNtD9O3wck",
  "refresh_expires_at": "2026-11-29T09:51:42.396418186Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "02fc86d9-224d-4969-8740-54801003437f",
  "session_id": "14722ce5-4506-4d57-be6a-4e4ca6265f81",
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
  "session_id": "2448a01f-49ac-4fc7-ad10-f94e69d5b9f3",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MDMsImlhdCI6MTc5MzM1MzkwMywianRpIjoiMThlZjZjNTAtNDY4Yi00Yjk3LThmY2QtNGNmZDM2ZjgyN2YxIiwic2lkIjoiMjQ0OGEwMWYtNDlhYy00ZmM3LWFkMTAtZjk0ZTY5ZDViOWYzIn0.VaWWTQWbxCF9WvqGIyMYXBSyghbBb9lVhBnzdoG-3DE",
  "access_expires_at": "2026-10-30T10:06:43.236697723Z",
  "refresh_token": "Oh04dTRFSYywJJ8z8GX7cdw-FxpfbBAZZT7GG0TicJU",
  "refresh_expires_at": "2026-10-30T21:51:43.23618146Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f` → **200**

```json
{
  "client": {
    "id": "02fc86d9-224d-4969-8740-54801003437f",
    "phone": "+380634982226",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:51:33.202005Z",
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

`POST /api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f/phone/new-code` → **201**

```json
{
  "phone": "+380633865134"
}
```

```json
{
  "challenge_id": "60ca5ee8-0a1f-4d0d-a88f-82a7959859e4",
  "expires_at": "2026-10-30T09:56:43.819784315Z",
  "resend_available_at": "2026-10-30T09:51:44.819784315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633865134` → **200**

```json
{
  "phone": "+380633865134",
  "audience": "CLIENT",
  "code": "639793",
  "sent_at": "2026-10-30T09:51:43.821774728Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f/phone` → **422**

```json
{
  "command_id": "e33b845b-f6bb-4100-b619-d1047b458672",
  "expected_version": 3,
  "new_challenge_id": "60ca5ee8-0a1f-4d0d-a88f-82a7959859e4",
  "new_code": "639794",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "7040be3f-3244-47ef-9424-5e158ab68090"
}
```

`POST /api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f/phone` → **400**

```json
{
  "command_id": "e21b66dc-4820-4629-a620-3ea7d4743d9c",
  "expected_version": 3,
  "new_challenge_id": "60ca5ee8-0a1f-4d0d-a88f-82a7959859e4",
  "new_code": "639793",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ea245ff3-1a0c-4cfd-ae08-a9ba987c6738",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/02fc86d9-224d-4969-8740-54801003437f/phone` → **200**

```json
{
  "command_id": "4f53a1c9-e274-4b19-9297-cf873c6acb45",
  "expected_version": 3,
  "new_challenge_id": "60ca5ee8-0a1f-4d0d-a88f-82a7959859e4",
  "new_code": "639793",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "02fc86d9-224d-4969-8740-54801003437f",
  "phone": "+380633865134",
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
  "correlation_id": "3e07710e-22d1-4edf-9a85-c235259086db"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633865134",
  "device_ref": "sandbox-31036"
}
```

```json
{
  "challenge_id": "39bf471a-9614-4cdd-b3c8-5108d54098ea",
  "expires_at": "2026-10-30T09:56:45.240352227Z",
  "resend_available_at": "2026-10-30T09:51:46.240352227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633865134` → **200**

```json
{
  "phone": "+380633865134",
  "audience": "CLIENT",
  "code": "364403",
  "sent_at": "2026-10-30T09:51:45.243671569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39bf471a-9614-4cdd-b3c8-5108d54098ea",
  "code": "364403",
  "device_ref": "sandbox-31036"
}
```

```json
{
  "session_id": "339598e9-f37d-4a3e-8902-dffd07c9a8cc",
  "subject": {
    "type": "CLIENT",
    "id": "02fc86d9-224d-4969-8740-54801003437f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmZjODZkOS0yMjRkLTQ5NjktODc0MC01NDgwMTAwMzQzN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODA1LCJpYXQiOjE3OTMzNTM5MDUsImp0aSI6ImNhZmNlODM3LTA2N2UtNGM0ZS04NGI2LTExNzA1NDUwNmE3ZSIsInNpZCI6IjMzOTU5OGU5LWYzN2QtNGEzZS04OTAyLWRmZmQwN2M5YThjYyJ9.sXEDDFBlF1qW-MKmJbq5S1IpbuKFMfD3c85eO_h8jSw",
  "access_expires_at": "2026-10-30T10:06:45.540434115Z",
  "refresh_token": "5Zxf0ItFztJOnuyLkmQp0mrAJVgMAxIenp4Q3dHm4PQ",
  "refresh_expires_at": "2026-11-29T09:51:45.539625154Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "02fc86d9-224d-4969-8740-54801003437f",
  "session_id": "339598e9-f37d-4a3e-8902-dffd07c9a8cc",
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
  "phone": "+380633168919",
  "device_ref": "sandbox-6884"
}
```

```json
{
  "challenge_id": "19bcc173-3c37-45ac-bb73-d07b93cc41ac",
  "expires_at": "2026-10-30T09:56:46.077579279Z",
  "resend_available_at": "2026-10-30T09:51:47.077579279Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633168919` → **200**

```json
{
  "phone": "+380633168919",
  "audience": "CLIENT",
  "code": "877883",
  "sent_at": "2026-10-30T09:51:46.079944625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19bcc173-3c37-45ac-bb73-d07b93cc41ac",
  "code": "877883",
  "device_ref": "sandbox-6884"
}
```

```json
{
  "session_id": "d69e973c-7107-4dd1-81cf-8b103a7ed200",
  "subject": {
    "type": "CLIENT",
    "id": "22c7c3c3-02ad-425e-8b16-dcd325e9cac7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmM3YzNjMy0wMmFkLTQyNWUtOGIxNi1kY2QzMjVlOWNhYzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODA2LCJpYXQiOjE3OTMzNTM5MDYsImp0aSI6IjExMTE3MGIzLTVmMTQtNDg1OC1iOWZmLTkxMGE4NWE3ODEyZiIsInNpZCI6ImQ2OWU5NzNjLTcxMDctNGRkMS04MWNmLThiMTAzYTdlZDIwMCJ9.uWPfydqLMTihz1t0Ad8Pp4AfogkucgcrlzO-CswxN24",
  "access_expires_at": "2026-10-30T10:06:46.379135478Z",
  "refresh_token": "Psecr_2PjxZKiGYRcy3WyAAjVvgFXF2Q5GNqeHidD_E",
  "refresh_expires_at": "2026-11-29T09:51:46.378685802Z",
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
  "session_id": "46540139-868b-4f98-b05b-21f19507d6bf",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MDcsImlhdCI6MTc5MzM1MzkwNywianRpIjoiMTc0OWYxNDItNGMwNC00ZWJmLTk4YjAtZDAzODFiZTMxM2FlIiwic2lkIjoiNDY1NDAxMzktODY4Yi00Zjk4LWIwNWItMjFmMTk1MDdkNmJmIn0.KjSZoujt7yXCVPDoN0QVBC7nQqxpz0EkuM0B60Edphc",
  "access_expires_at": "2026-10-30T10:06:47.513906923Z",
  "refresh_token": "6YS1rJKGv3cdJ9STXHCF21zmAAF-qHwpmTuZhiLHnVg",
  "refresh_expires_at": "2026-10-30T21:51:47.513367649Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633168919` → **200**

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
  "correlation_id": "dbd81a3f-abd9-471d-bd8a-2312e92719e6"
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
  "session_id": "fa067420-95b7-4af6-929e-534e6944837e",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MDgsImlhdCI6MTc5MzM1MzkwOCwianRpIjoiNzM5NmRlOTktNzkxZS00ZGRjLTlhZjAtYjFmMDZlMTNiMWUyIiwic2lkIjoiZmEwNjc0MjAtOTViNy00YWY2LTkyOWUtNTM0ZTY5NDQ4MzdlIn0.UJcgLx4MCe6WEbk03yjla4OZDGlfl62RcqcnDu0TwpY",
  "access_expires_at": "2026-10-30T10:06:48.662272176Z",
  "refresh_token": "YcJK0kLJUuuFFeUnPjV0Si0pSsYbgdD6dOr5rGl7SxE",
  "refresh_expires_at": "2026-10-30T21:51:48.661727021Z",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:47:58.083616Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "240ce765-b597-43b7-9071-0ec3a2723945",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T09:51:49.225382799Z"
}
```

## The rider books the airport for 2026-10-30T12:51:48Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600168792",
  "device_ref": "sandbox-10130"
}
```

```json
{
  "challenge_id": "786e402f-57dd-4e3f-8b3b-efc9be2b3b92",
  "expires_at": "2026-10-30T09:56:49.519594902Z",
  "resend_available_at": "2026-10-30T09:51:50.519594902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600168792` → **200**

```json
{
  "phone": "+48600168792",
  "audience": "CLIENT",
  "code": "159228",
  "sent_at": "2026-10-30T09:51:49.522647858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "786e402f-57dd-4e3f-8b3b-efc9be2b3b92",
  "code": "159228",
  "device_ref": "sandbox-10130"
}
```

```json
{
  "session_id": "1515d29a-f376-46b6-9edb-7c2e3b3cfbeb",
  "subject": {
    "type": "CLIENT",
    "id": "c734093a-9611-49d3-a4a1-cbe45bdd0713"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzM0MDkzYS05NjExLTQ5ZDMtYTRhMS1jYmU0NWJkZDA3MTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODA5LCJpYXQiOjE3OTMzNTM5MDksImp0aSI6IjhiOWVkZGNmLWY0NDItNDcyMS04ZDRjLTNhM2RjY2JjMWY5NyIsInNpZCI6IjE1MTVkMjlhLWYzNzYtNDZiNi05ZWRiLTdjMmUzYjNjZmJlYiJ9.lt8IFXWrkWM80SgWBNv768Z82je_guJQII0rsAJzuHI",
  "access_expires_at": "2026-10-30T10:06:49.821327265Z",
  "refresh_token": "BGej86XI_J9zVkwyv1hmNhSt5I8GaZw_5kV5OzwogFg",
  "refresh_expires_at": "2026-11-29T09:51:49.820717759Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5ae22271-8e66-402b-98ba-059124496786",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T12:51:48Z"
}
```

```json
{
  "id": "e565446f-7a23-4fdb-9fc1-37a221e51111",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:50.095527Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:51:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8dae5cdd-d6fc-4ee8-8666-f25bf40e8b51",
  "quote_id": "e565446f-7a23-4fdb-9fc1-37a221e51111",
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
  "pickup_at": "2026-10-30T12:51:48Z"
}
```

```json
{
  "id": "798796ee-2074-4985-8d33-2d56fb6436ed",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c734093a-9611-49d3-a4a1-cbe45bdd0713",
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
  "created_at": "2026-10-30T09:51:50.393086Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:51:48Z",
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
  "device_ref": "sandbox-1953"
}
```

```json
{
  "challenge_id": "2bd0f7c9-31ef-4245-bc9b-1428417d948b",
  "expires_at": "2026-10-30T09:56:50.695123417Z",
  "resend_available_at": "2026-10-30T09:51:51.695123417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "213507",
  "sent_at": "2026-10-30T09:51:50.697919701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2bd0f7c9-31ef-4245-bc9b-1428417d948b",
  "code": "213507",
  "device_ref": "sandbox-1953"
}
```

```json
{
  "session_id": "32e39740-7ca7-4206-a32e-a8c6f4abead9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgxMCwiaWF0IjoxNzkzMzUzOTEwLCJqdGkiOiI5MGM5MTI2MS1mMzdlLTRmZDMtYWZlMi0yZjc1ODJhMjE4NGIiLCJzaWQiOiIzMmUzOTc0MC03Y2E3LTQyMDYtYTMyZS1hOGM2ZjRhYmVhZDkifQ.Vg17bxFS6bK_Gal_e1FzvNCiW7384VkVn0Hw1efVdDU",
  "access_expires_at": "2026-10-30T10:06:50.995964056Z",
  "refresh_token": "d4XVQc1GrQq4dJ_y0zMvEQaCl7SLKY4M3F0hiSSAbNs",
  "refresh_expires_at": "2026-11-29T09:51:50.995326902Z",
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
  "command_id": "7fea478a-5764-4687-b2bb-448941efdc26",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:51Z",
    "sequence": 1793353911528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d43ed95a-936b-4156-82cb-27e50ea3b7c8",
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
  "last_heartbeat_at": "2026-10-30T09:51:51.546274Z",
  "last_location_at": "2026-10-30T09:51:51.546274Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "798796ee-2074-4985-8d33-2d56fb6436ed",
      "short_number": 24,
      "pickup_at": "2026-10-30T12:51:48Z",
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

`POST /api/driver/v1/preorders/798796ee-2074-4985-8d33-2d56fb6436ed/reserve` → **200**

```json
{
  "command_id": "f8542e3b-33c8-4af6-9f8c-5ccc542ef142"
}
```

```json
{
  "id": "696df328-225b-4b83-981b-3010a1476828",
  "state": "RESERVED",
  "order": {
    "order_id": "798796ee-2074-4985-8d33-2d56fb6436ed",
    "short_number": 24,
    "pickup_at": "2026-10-30T12:51:48Z",
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
  "reserved_at": "2026-10-30T09:51:52.116056Z",
  "confirm_from": "2026-10-30T12:21:48Z",
  "confirm_until": "2026-10-30T12:31:48Z",
  "drop_until": "2026-10-30T11:51:48Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "696df328-225b-4b83-981b-3010a1476828",
      "state": "RESERVED",
      "order": {
        "order_id": "798796ee-2074-4985-8d33-2d56fb6436ed",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:51:48Z",
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
      "reserved_at": "2026-10-30T09:51:52.116056Z",
      "confirm_from": "2026-10-30T12:21:48Z",
      "confirm_until": "2026-10-30T12:31:48Z",
      "drop_until": "2026-10-30T11:51:48Z"
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
      "id": "696df328-225b-4b83-981b-3010a1476828",
      "state": "RESERVED",
      "order": {
        "order_id": "798796ee-2074-4985-8d33-2d56fb6436ed",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:51:48Z",
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
      "reserved_at": "2026-10-30T09:51:52.116056Z",
      "confirm_from": "2026-10-30T12:21:48Z",
      "confirm_until": "2026-10-30T12:31:48Z",
      "drop_until": "2026-10-30T11:51:48Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/696df328-225b-4b83-981b-3010a1476828/confirm` → **409**

```json
{
  "command_id": "1458d5e9-6553-434c-8955-17e79ff0daa8"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/696df328-225b-4b83-981b-3010a1476828/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e2a06058-1ad8-4fa5-aff5-253db232d684"
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
  "session_id": "b27a11e4-3c1f-4106-8baa-7feff57d37bf",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MTMsImlhdCI6MTc5MzM1MzkxMywianRpIjoiZDMzZDA2MDQtZjZiOS00NTE0LWI3MTctM2Y0ZWNjOGVjMmMyIiwic2lkIjoiYjI3YTExZTQtM2MxZi00MTA2LThiYWEtN2ZlZmY1N2QzN2JmIn0.y4eY-u_hBo5FpA3mIGPgZbXW8xwgKZATOa7P57KRmjo",
  "access_expires_at": "2026-10-30T10:06:53.535862569Z",
  "refresh_token": "6pRdKIIhPanzQ9E3iVx3aAzXBvS7MO4ycok5KE_OxH0",
  "refresh_expires_at": "2026-10-30T21:51:53.535293119Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/798796ee-2074-4985-8d33-2d56fb6436ed` → **200**

```json
{
  "id": "798796ee-2074-4985-8d33-2d56fb6436ed",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c734093a-9611-49d3-a4a1-cbe45bdd0713",
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
  "created_at": "2026-10-30T09:51:50.393086Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T12:51:48Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "696df328-225b-4b83-981b-3010a1476828",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T09:51:52.116056Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/798796ee-2074-4985-8d33-2d56fb6436ed/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T09:51:50.394213Z",
      "actor": {
        "type": "CLIENT",
        "id": "c734093a-9611-49d3-a4a1-cbe45bdd0713",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "798796ee-2074-4985-8d33-2d56fb6436ed",
        "preorder": true,
        "quote_id": "e565446f-7a23-4fdb-9fc1-37a221e51111",
        "pickup_at": "2026-10-30T12:51:48Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "7aea5452-e7c0-4abe-af11-bb7b4fce54ef"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T09:51:52.117176Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "798796ee-2074-4985-8d33-2d56fb6436ed",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "696df328-225b-4b83-981b-3010a1476828"
      },
      "correlation_id": "b4b99bdc-e5bf-44d6-8f13-41c259137fe7"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 798796ee-2074-4985-8d33-2d56fb6436ed, reservation 696df328-225b-4b83-981b-3010a1476828.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24675"
}
```

```json
{
  "challenge_id": "bc8fdfe9-b340-475d-b1cd-1224fed92a26",
  "expires_at": "2026-10-30T09:56:54.3914165Z",
  "resend_available_at": "2026-10-30T09:51:55.3914165Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "028557",
  "sent_at": "2026-10-30T09:51:54.393916246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc8fdfe9-b340-475d-b1cd-1224fed92a26",
  "code": "028557",
  "device_ref": "sandbox-24675"
}
```

```json
{
  "session_id": "dd3f7216-c7ee-4f1c-b159-b1db2cd49e30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgxNCwiaWF0IjoxNzkzMzUzOTE0LCJqdGkiOiIxZDQ4NTcyMC0yMjQzLTRiNTUtYWQ1MS02ZDU5ZTBjMzZiZGIiLCJzaWQiOiJkZDNmNzIxNi1jN2VlLTRmMWMtYjE1OS1iMWRiMmNkNDllMzAifQ.MwhbFYVY3G4e_f5yeZoauovJjBZgdtm1bOxK1UxWaWs",
  "access_expires_at": "2026-10-30T10:06:54.698885141Z",
  "refresh_token": "7OiieQb1_rqIPn45eK2vf9xN3LxoaFpfaA97WVNSTFU",
  "refresh_expires_at": "2026-11-29T09:51:54.698331853Z",
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
  "command_id": "1142180a-68c2-4611-8500-8edbd72022fa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:55Z",
    "sequence": 1793353915247
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:51:55.265407Z",
  "last_location_at": "2026-10-30T09:51:55.265407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676582932",
  "device_ref": "sandbox-11599"
}
```

```json
{
  "challenge_id": "ed16cd1a-783d-47f8-8bc8-b5a17a30c02c",
  "expires_at": "2026-10-30T09:56:55.537082885Z",
  "resend_available_at": "2026-10-30T09:51:56.537082885Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676582932` → **200**

```json
{
  "phone": "+380676582932",
  "audience": "CLIENT",
  "code": "577452",
  "sent_at": "2026-10-30T09:51:55.539327061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed16cd1a-783d-47f8-8bc8-b5a17a30c02c",
  "code": "577452",
  "device_ref": "sandbox-11599"
}
```

```json
{
  "session_id": "63bd9394-db17-4818-965a-0036d831ab35",
  "subject": {
    "type": "CLIENT",
    "id": "38efee2d-3f9f-4eb8-b683-3bf1e16d1d04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGVmZWUyZC0zZjlmLTRlYjgtYjY4My0zYmYxZTE2ZDFkMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODE1LCJpYXQiOjE3OTMzNTM5MTUsImp0aSI6IjA4NTY4MDAzLTBkMGYtNDA1Mi1iMmE3LWM0MzI1YjY5OTU4YSIsInNpZCI6IjYzYmQ5Mzk0LWRiMTctNDgxOC05NjVhLTAwMzZkODMxYWIzNSJ9.7gh15-hJLfTQjpBbNYG5yY8lmN7e2rUzHw2z7IZbSuE",
  "access_expires_at": "2026-10-30T10:06:55.827252588Z",
  "refresh_token": "w1DIaRFqY8-ePhjlh_UdEcw8Q1oJjMUnKWIMJ-b18_8",
  "refresh_expires_at": "2026-11-29T09:51:55.826404174Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "87475cc2-c94a-487f-945c-cc57139210b2",
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
  "id": "a7b074da-af85-4d2a-9704-30b8d80ac6fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:56:56.114706Z",
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
  "command_id": "48f26761-dea6-4a65-b4d2-dc0bad2b120c",
  "quote_id": "a7b074da-af85-4d2a-9704-30b8d80ac6fe",
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
  "id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38efee2d-3f9f-4eb8-b683-3bf1e16d1d04",
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
  "created_at": "2026-10-30T09:51:56.402588Z",
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
    "id": "f37d8367-8fcc-4ef9-a9bc-18f5029affed",
    "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
    "expires_at": "2026-10-30T09:52:11.406176Z",
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

`POST /api/driver/v1/offers/f37d8367-8fcc-4ef9-a9bc-18f5029affed/accept` → **200**

```json
{
  "command_id": "2559004a-d920-42c9-945a-2c2d251dbc70"
}
```

```json
{
  "id": "03b5a5ba-580c-40af-950f-38ea76ded3bc",
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f95fe2c-920e-45fa-bb4c-aa183f423297",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f95fe2c-920e-45fa-bb4c-aa183f423297",
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "assignment_id": "03b5a5ba-580c-40af-950f-38ea76ded3bc",
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

`POST /api/driver/v1/work-sessions/9109cd5e-c1fe-4234-a874-ea3409a405d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:57Z",
    "sequence": 1793353917545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:51:57.564021Z",
  "last_location_at": "2026-10-30T09:51:57.564021Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f95fe2c-920e-45fa-bb4c-aa183f423297",
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "assignment_id": "03b5a5ba-580c-40af-950f-38ea76ded3bc",
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

`POST /api/driver/v1/trips/8f95fe2c-920e-45fa-bb4c-aa183f423297/arrive` → **200**

```json
{
  "command_id": "c1c9c1ee-1ba6-4b9c-ba5c-2442e4900b14",
  "expected_version": 0
}
```

```json
{
  "id": "8f95fe2c-920e-45fa-bb4c-aa183f423297",
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "assignment_id": "03b5a5ba-580c-40af-950f-38ea76ded3bc",
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
  "arrived_at": "2026-10-30T09:51:58.121169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f95fe2c-920e-45fa-bb4c-aa183f423297/start` → **200**

```json
{
  "command_id": "2276494a-9677-42f9-98d5-5d33e18538b1",
  "expected_version": 1
}
```

```json
{
  "id": "8f95fe2c-920e-45fa-bb4c-aa183f423297",
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "assignment_id": "03b5a5ba-580c-40af-950f-38ea76ded3bc",
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
  "arrived_at": "2026-10-30T09:51:58.121169Z",
  "started_at": "2026-10-30T09:51:58.406424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9109cd5e-c1fe-4234-a874-ea3409a405d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:51:58Z",
    "sequence": 1793353918682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:51:58.700655Z",
  "last_location_at": "2026-10-30T09:51:58.700655Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/8f95fe2c-920e-45fa-bb4c-aa183f423297/complete` → **200**

```json
{
  "command_id": "c6b3ed06-bde0-4127-a544-267dbd34527e",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:51:58Z",
  "cash_received": true
}
```

```json
{
  "id": "8f95fe2c-920e-45fa-bb4c-aa183f423297",
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "assignment_id": "03b5a5ba-580c-40af-950f-38ea76ded3bc",
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
  "arrived_at": "2026-10-30T09:51:58.121169Z",
  "started_at": "2026-10-30T09:51:58.406424Z",
  "completed_at": "2026-10-30T09:51:58.989113Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/6f6e5313-6a66-4635-b735-c6c13c09dd25/rating` → **200**

```json
{
  "command_id": "10fea480-4519-4ead-a2fd-5e9cd5d164f6",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "score": 5,
  "created_at": "2026-10-30T09:51:59.288982675Z"
}
```

`POST /api/driver/v1/orders/6f6e5313-6a66-4635-b735-c6c13c09dd25/rating` → **200**

```json
{
  "command_id": "28f40a2b-86f0-4a16-981c-77baff688302",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
  "score": 4,
  "created_at": "2026-10-30T09:51:59.579729534Z"
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
  "session_id": "5f1027c3-5975-43d1-ba95-e501cc42bf81",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MjAsImlhdCI6MTc5MzM1MzkyMCwianRpIjoiNDg2NDk1ZWItNzI1MC00MTZiLTg1ZmUtYmQ3N2UzNzQzOTQ3Iiwic2lkIjoiNWYxMDI3YzMtNTk3NS00M2QxLWJhOTUtZTUwMWNjNDJiZjgxIn0.di9Bwz1VqtGC34fkjD-wrOcejWCW-4j7CLlRNSLWGcA",
  "access_expires_at": "2026-10-30T10:07:00.427156248Z",
  "refresh_token": "95MKhAkPn1BZbBxFr3Y_TiqnU-zfEObnz3YS_7u0imY",
  "refresh_expires_at": "2026-10-30T21:52:00.42665284Z",
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
  "session_id": "9bf4dc79-c48b-40ad-9ca3-ad82567c6c90",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MjAsImlhdCI6MTc5MzM1MzkyMCwianRpIjoiNjg2ZmI3NzQtNjkxYi00NjBkLTlkM2QtMTM4NGEzMzZkZmE3Iiwic2lkIjoiOWJmNGRjNzktYzQ4Yi00MGFkLTljYTMtYWQ4MjU2N2M2YzkwIn0.BrcgSQYkNEImCX7sQWFumX_Y8iJxKwgbhV3Ezok41ds",
  "access_expires_at": "2026-10-30T10:07:00.9874559Z",
  "refresh_token": "EXqFje5ReZpiIJelY-ntjc53rdmCrGtQjm4Y8S8svxo",
  "refresh_expires_at": "2026-10-30T21:52:00.986882913Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6f6e5313-6a66-4635-b735-c6c13c09dd25/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
      "author_type": "RIDER",
      "author_id": "38efee2d-3f9f-4eb8-b683-3bf1e16d1d04",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T09:51:59.288983Z"
    },
    {
      "order_id": "6f6e5313-6a66-4635-b735-c6c13c09dd25",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "38efee2d-3f9f-4eb8-b683-3bf1e16d1d04",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T09:51:59.57973Z"
    }
  ]
}
```

Done: ratings for order 6f6e5313-6a66-4635-b735-c6c13c09dd25.

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
  "session_id": "23d7d4ef-f7d7-4605-bd7b-341d2a149f8a",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MjEsImlhdCI6MTc5MzM1MzkyMSwianRpIjoiZWYyMDQ4ZDctMGU2OC00OTUwLTgxMmItMTFmZDUxYWFlYjNjIiwic2lkIjoiMjNkN2Q0ZWYtZjdkNy00NjA1LWJkN2ItMzQxZDJhMTQ5ZjhhIn0.0KkhT-Cil__lTwCuRdGMMPCOv0BVjSVscySY2xl7uc0",
  "access_expires_at": "2026-10-30T10:07:01.835066365Z",
  "refresh_token": "vBs6Oi7U9sy2Kia3X2b0ZslRAy7BsayLdzEpzVQ03Pc",
  "refresh_expires_at": "2026-10-30T21:52:01.834545155Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d7a79dff-a357-4cce-baab-d8f83b5305f9",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "03a8a529-6626-4d16-b2e7-a5c2dc7e4a34",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:02.12545Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03a8a529-6626-4d16-b2e7-a5c2dc7e4a34` → **200**

```json
{
  "id": "03a8a529-6626-4d16-b2e7-a5c2dc7e4a34",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:02.12545Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03a8a529-6626-4d16-b2e7-a5c2dc7e4a34` → **200**

```json
{
  "id": "03a8a529-6626-4d16-b2e7-a5c2dc7e4a34",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:02.12545Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03a8a529-6626-4d16-b2e7-a5c2dc7e4a34` → **200**

```json
{
  "id": "03a8a529-6626-4d16-b2e7-a5c2dc7e4a34",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:52:02.12545Z",
  "ready_at": "2026-10-30T09:52:04.608581Z",
  "expires_at": "2026-10-31T09:52:04.608581Z"
}
```

`GET /api/admin/v1/reports/exports/03a8a529-6626-4d16-b2e7-a5c2dc7e4a34/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6f70c112-c80d-4bd1-8236-226b0408d680",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "0fc1e84a-df41-4472-8422-0bd3d963c65a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:05.269227Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fc1e84a-df41-4472-8422-0bd3d963c65a` → **200**

```json
{
  "id": "0fc1e84a-df41-4472-8422-0bd3d963c65a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:05.269227Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fc1e84a-df41-4472-8422-0bd3d963c65a` → **200**

```json
{
  "id": "0fc1e84a-df41-4472-8422-0bd3d963c65a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:05.269227Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fc1e84a-df41-4472-8422-0bd3d963c65a` → **200**

```json
{
  "id": "0fc1e84a-df41-4472-8422-0bd3d963c65a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:05.269227Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fc1e84a-df41-4472-8422-0bd3d963c65a` → **200**

```json
{
  "id": "0fc1e84a-df41-4472-8422-0bd3d963c65a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:52:05.269227Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0fc1e84a-df41-4472-8422-0bd3d963c65a` → **200**

```json
{
  "id": "0fc1e84a-df41-4472-8422-0bd3d963c65a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:52:05.269227Z",
  "ready_at": "2026-10-30T09:52:09.618652Z",
  "expires_at": "2026-10-31T09:52:09.618652Z"
}
```

`GET /api/admin/v1/reports/exports/0fc1e84a-df41-4472-8422-0bd3d963c65a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/910b0203-efa6-4fc4-8c76-af079137c16a` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/910b0203-efa6-4fc4-8c76-af079137c16a",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "01c82406-995e-44e9-9c72-efecedc5febc"
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
  "device_ref": "sandbox-20535"
}
```

```json
{
  "challenge_id": "fe58d563-b2ea-41d7-b8a2-7801f92754cf",
  "expires_at": "2026-10-30T09:57:11.259635799Z",
  "resend_available_at": "2026-10-30T09:52:12.259635799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "471601",
  "sent_at": "2026-10-30T09:52:11.262647826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe58d563-b2ea-41d7-b8a2-7801f92754cf",
  "code": "471601",
  "device_ref": "sandbox-20535"
}
```

```json
{
  "session_id": "1bf58b59-5e26-4b63-ab80-1680f1efb50a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDgzMSwiaWF0IjoxNzkzMzUzOTMxLCJqdGkiOiI5Yzc2NDk4MC0xYTcxLTQ5YTEtYTM1NC0wYjcxOWU3MjE0MDgiLCJzaWQiOiIxYmY1OGI1OS01ZTI2LTRiNjMtYWI4MC0xNjgwZjFlZmI1MGEifQ.oBRXwvomGCwtD4XYcjzH3fqW5yIa9OOTQ1ypz7GOA9M",
  "access_expires_at": "2026-10-30T10:07:11.566168989Z",
  "refresh_token": "q4iKLVmD-3Ysi3xNIwFT5lDjgUxeBYm-LXcvCTQFzjs",
  "refresh_expires_at": "2026-11-29T09:52:11.56566924Z",
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
  "command_id": "2bb7d5f8-36d8-4fb1-94af-ce5e3d961c59",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:12Z",
    "sequence": 1793353932385
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f6e4b5ae-bb2f-492a-aff8-efa89d5ce85b",
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
  "last_heartbeat_at": "2026-10-30T09:52:12.402467Z",
  "last_location_at": "2026-10-30T09:52:12.402467Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "5fa1f576-a15c-4ffd-aca5-e08b6e8310fa",
  "points": [
    {
      "sequence": 1793353934690,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:51:14Z"
    },
    {
      "sequence": 1793353934697,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:52:14Z"
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
  "session_id": "40be0ed5-109d-49b4-a93f-35b6a0f3ae4d",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MzUsImlhdCI6MTc5MzM1MzkzNSwianRpIjoiMjA3Yjk5OTctMDQ5Mi00ODgxLTgxNWItNmFjNDc5MWE3MTcxIiwic2lkIjoiNDBiZTBlZDUtMTA5ZC00OWI0LWE5M2YtMzViNmEwZjNhZTRkIn0.BgNoH23zT0NaIv1SUlbRLguEZiRb10xfuaylHjWfrUQ",
  "access_expires_at": "2026-10-30T10:07:15.321984278Z",
  "refresh_token": "yMboHOFCj_i0QNtLrLHvA99_r4hl3ClUM1rnxwaZXDE",
  "refresh_expires_at": "2026-10-30T21:52:15.321459878Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "e2748371-71c0-42dd-96fa-dc9360b1d8fc",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T09:52:14Z",
        "track_point_id": "e4320a4a-9b7e-4d1b-832b-2317be30d97d",
        "work_session_id": "f6e4b5ae-bb2f-492a-aff8-efa89d5ce85b"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T09:52:14Z",
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

`POST /api/admin/v1/driver-risk-flags/e2748371-71c0-42dd-96fa-dc9360b1d8fc/confirm` → **200**

```json
{
  "command_id": "a7649f2f-dff2-4ce0-8fcd-0328549e776b",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "e2748371-71c0-42dd-96fa-dc9360b1d8fc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T09:52:14Z",
    "track_point_id": "e4320a4a-9b7e-4d1b-832b-2317be30d97d",
    "work_session_id": "f6e4b5ae-bb2f-492a-aff8-efa89d5ce85b"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T09:52:14Z",
  "reason": null,
  "reviewed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reviewed_at": "2026-10-30T09:52:16.199431Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/e2748371-71c0-42dd-96fa-dc9360b1d8fc/dismiss` → **409**

```json
{
  "command_id": "2641f5ac-e18b-4290-a2f4-9dc0889a005a",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/e2748371-71c0-42dd-96fa-dc9360b1d8fc/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "11d3511e-15ce-47a5-95cf-241e66071bc7"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1b307aa6-855b-48e1-b402-884d3cafa62a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "eae85113-90cf-4329-ae25-5bbed7a277c6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "raised_at": "2026-10-30T09:52:16.769502Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/eae85113-90cf-4329-ae25-5bbed7a277c6/dismiss` → **200**

```json
{
  "command_id": "29fc5919-c71f-4868-a86f-481ab0011bdd",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "eae85113-90cf-4329-ae25-5bbed7a277c6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "raised_at": "2026-10-30T09:52:16.769502Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reviewed_at": "2026-10-30T09:52:17.060305Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c03be1ab-e086-4e41-a757-4da573e78b7a",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "e2748371-71c0-42dd-96fa-dc9360b1d8fc"
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
      "actor_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:52:17.353207Z"
    }
  ]
}
```

Done: flag e2748371-71c0-42dd-96fa-dc9360b1d8fc confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b0b73efc-e3bb-475e-9e68-7442c25550d5",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MzgsImlhdCI6MTc5MzM1MzkzOCwianRpIjoiNDQwZWUzYjMtNmZlYi00ZmYwLThkZWMtNjYyNWY2YmU5YTY1Iiwic2lkIjoiYjBiNzNlZmMtZTNiYi00NzVlLTllNjgtNzQ0MmMyNTU1MGQ1In0.3p_O2ZYtNYpMxwXH0x9KVNvo40c1alLHqETS-iEUAu4",
  "access_expires_at": "2026-10-30T10:07:18.216821588Z",
  "refresh_token": "aaiS3EALgeOQ2BTWOYFG1I-8_qTMD0ibmkjV5bocak0",
  "refresh_expires_at": "2026-10-30T21:52:18.216271004Z",
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
      "actor_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:52:17.353207Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f48abfd3-6828-4bb5-8b7e-b547220804db",
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
  "session_id": "f6e4b5ae-bb2f-492a-aff8-efa89d5ce85b",
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
  "last_heartbeat_at": "2026-10-30T09:52:12.402467Z",
  "last_location_at": "2026-10-30T09:52:12.402467Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6e4b5ae-bb2f-492a-aff8-efa89d5ce85b/close` → **200**

```json
{
  "command_id": "cbc0f944-600f-4b16-8616-79d9ff414616",
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
  "session_id": "c36bc418-7a33-40bf-8029-76c6fabbcd37",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4MzksImlhdCI6MTc5MzM1MzkzOSwianRpIjoiYTJiOGE0MmItYWJlYy00MmJiLWJjY2EtNzI5MzhhNzY5NWRlIiwic2lkIjoiYzM2YmM0MTgtN2EzMy00MGJmLTgwMjktNzZjNmZhYmJjZDM3In0.Hj853nVbBcb1gIoqKGQwFKpnTfRDcGyrwVZHqNse9fc",
  "access_expires_at": "2026-10-30T10:07:19.912653741Z",
  "refresh_token": "_4LTmgxYaNB51Fh05n-LTi0eQV0pYfjuCeCA03e2kF0",
  "refresh_expires_at": "2026-10-30T21:52:19.912116101Z",
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
  "command_id": "f78ef88b-0784-4194-b69f-37d6df25e692",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:52:20.474797Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "f78ef88b-0784-4194-b69f-37d6df25e692",
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
  "changed_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:52:20.474797Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48319467794",
  "device_ref": "sandbox-8282"
}
```

```json
{
  "challenge_id": "e19f0818-f590-493d-8ca4-ab261f0879f8",
  "expires_at": "2026-10-30T09:57:21.0655295Z",
  "resend_available_at": "2026-10-30T09:52:22.0655295Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48319467794` → **200**

```json
{
  "phone": "+48319467794",
  "audience": "CLIENT",
  "code": "094131",
  "sent_at": "2026-10-30T09:52:21.067873526Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e19f0818-f590-493d-8ca4-ab261f0879f8",
  "code": "094131",
  "device_ref": "sandbox-8282"
}
```

```json
{
  "session_id": "32d32d93-6563-44bc-b1d8-626ba1f3bdd7",
  "subject": {
    "type": "CLIENT",
    "id": "842519cd-f091-4463-995e-db2633a83721"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDI1MTljZC1mMDkxLTQ0NjMtOTk1ZS1kYjI2MzNhODM3MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODQxLCJpYXQiOjE3OTMzNTM5NDEsImp0aSI6Ijc2MThjMjUwLTI1OTMtNDNmNi1hZTcwLWVmZmY1OGY0YzFlZSIsInNpZCI6IjMyZDMyZDkzLTY1NjMtNDRiYy1iMWQ4LTYyNmJhMWYzYmRkNyJ9.Qkn0-OVmjRdGKOHW4Fx1Yg4EO1F73VLxuyng0ZgjoZ8",
  "access_expires_at": "2026-10-30T10:07:21.377466312Z",
  "refresh_token": "LZL4jm_XCPNCbKrab5wuE1gUNk-nWPvezi_Q9LpwIL4",
  "refresh_expires_at": "2026-11-29T09:52:21.376965205Z",
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
  "correlation_id": "1d3906e2-7a29-4483-9704-c96a5b037ea3"
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
  "device_ref": "sandbox-32291"
}
```

```json
{
  "challenge_id": "30b811b8-bcd4-4e34-be79-b83b9daafcfb",
  "expires_at": "2026-10-30T09:57:22.217955566Z",
  "resend_available_at": "2026-10-30T09:52:23.217955566Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "243463",
  "sent_at": "2026-10-30T09:52:22.220440849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30b811b8-bcd4-4e34-be79-b83b9daafcfb",
  "code": "243463",
  "device_ref": "sandbox-32291"
}
```

```json
{
  "session_id": "42be91aa-8039-4451-a29f-2cd8dd82e34e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg0MiwiaWF0IjoxNzkzMzUzOTQyLCJqdGkiOiI4NTRjZDJhMS05MGRkLTQ1ZWYtOTE5OC03Y2NiMzk5MDcxYzUiLCJzaWQiOiI0MmJlOTFhYS04MDM5LTQ0NTEtYTI5Zi0yY2Q4ZGQ4MmUzNGUifQ.cRLBjq53lbyMF2rzbqgHK_NRcmzGCePAecrq2CLGb2Y",
  "access_expires_at": "2026-10-30T10:07:22.52323576Z",
  "refresh_token": "u5YbDzvBY-xmu5wm2DvSfWbFTrlhP6L1DEk-Ql3_NFo",
  "refresh_expires_at": "2026-11-29T09:52:22.52276204Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d43ed95a-936b-4156-82cb-27e50ea3b7c8",
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
  "last_heartbeat_at": "2026-10-30T09:51:51.546274Z",
  "last_location_at": "2026-10-30T09:51:51.546274Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d43ed95a-936b-4156-82cb-27e50ea3b7c8/handover` → **200**

```json
{
  "command_id": "2134a3ac-30e1-4d61-b878-c519781f2add",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d43ed95a-936b-4156-82cb-27e50ea3b7c8",
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
  "last_heartbeat_at": "2026-10-30T09:51:51.546274Z",
  "last_location_at": "2026-10-30T09:51:51.546274Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d43ed95a-936b-4156-82cb-27e50ea3b7c8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:23Z",
    "sequence": 1793353943372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d43ed95a-936b-4156-82cb-27e50ea3b7c8",
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
  "last_heartbeat_at": "2026-10-30T09:52:23.390468Z",
  "last_location_at": "2026-10-30T09:52:23.390468Z",
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
  "session_id": "d43ed95a-936b-4156-82cb-27e50ea3b7c8",
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
  "last_heartbeat_at": "2026-10-30T09:52:23.390468Z",
  "last_location_at": "2026-10-30T09:52:23.390468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d43ed95a-936b-4156-82cb-27e50ea3b7c8/close` → **200**

```json
{
  "command_id": "22bde11b-921f-4da3-90f9-46106915e413",
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
  "correlation_id": "80bc9ca5-af6f-48cb-b840-88aa6c468f69"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676853941",
  "device_ref": "sandbox-11521"
}
```

```json
{
  "challenge_id": "963bbd0c-766e-445f-9104-a13930e89c08",
  "expires_at": "2026-10-30T09:57:24.77123409Z",
  "resend_available_at": "2026-10-30T09:52:25.77123409Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676853941` → **200**

```json
{
  "phone": "+380676853941",
  "audience": "CLIENT",
  "code": "461283",
  "sent_at": "2026-10-30T09:52:24.773483608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "963bbd0c-766e-445f-9104-a13930e89c08",
  "code": "461283",
  "device_ref": "sandbox-11521"
}
```

```json
{
  "session_id": "7a7a8e06-12b9-4ed5-a0ea-f5efe06c13bb",
  "subject": {
    "type": "CLIENT",
    "id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDU5NGYxNS1kYWQ0LTRkZTctOGY0OS1jZmFiZDVhMjJlZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODQ1LCJpYXQiOjE3OTMzNTM5NDUsImp0aSI6ImZmY2ExY2NmLWZjNDMtNDlmYy04YjRmLTI2NTI5N2U3MTZkNiIsInNpZCI6IjdhN2E4ZTA2LTEyYjktNGVkNS1hMGVhLWY1ZWZlMDZjMTNiYiJ9.QHQtbC5aDYl_qMdTQVisK7uufSbAh--jIqWLG9t-Ato",
  "access_expires_at": "2026-10-30T10:07:25.077834242Z",
  "refresh_token": "iOHvG2IrE6IUHSfOydXki-i_v8RLWwFJWGVMSK0hxaQ",
  "refresh_expires_at": "2026-11-29T09:52:25.077345336Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "3216f73c-9d96-42e7-b80b-ea7080f3572a",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "31107d4c-6008-4878-ba4b-31e5250cdf22",
  "upload_path": "/api/rider/v1/uploads/31107d4c-6008-4878-ba4b-31e5250cdf22",
  "expires_at": "2026-10-30T10:07:25.371155704Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/31107d4c-6008-4878-ba4b-31e5250cdf22` → **200**

```json
{
  "file_id": "31107d4c-6008-4878-ba4b-31e5250cdf22",
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
  "command_id": "e867cefa-cb93-466d-a874-67ab7fb57377",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "f7c1a38c-5650-4792-b8ad-d5555e870b41",
  "upload_path": "/api/rider/v1/uploads/f7c1a38c-5650-4792-b8ad-d5555e870b41",
  "expires_at": "2026-10-30T10:07:25.691323443Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/f7c1a38c-5650-4792-b8ad-d5555e870b41` → **200**

```json
{
  "file_id": "f7c1a38c-5650-4792-b8ad-d5555e870b41",
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
  "command_id": "26d07137-0d06-438f-923b-b1c07e93fd5b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ede7adaf-8075-4909-8dc7-c55017430ece",
  "upload_path": "/api/rider/v1/uploads/ede7adaf-8075-4909-8dc7-c55017430ece",
  "expires_at": "2026-10-30T10:07:25.989221113Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/ede7adaf-8075-4909-8dc7-c55017430ece` → **200**

```json
{
  "file_id": "ede7adaf-8075-4909-8dc7-c55017430ece",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "804f9ece-8407-42a5-ab30-3c38f0fb4914",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "ede7adaf-8075-4909-8dc7-c55017430ece"
  ]
}
```

```json
{
  "id": "f8473b85-201c-4e68-86d1-74dd26d2b4de",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:52:26.309587Z",
  "updated_at": "2026-10-30T09:52:26.309587Z",
  "respond_by": "2026-10-30T13:52:26.309587Z",
  "messages": [
    {
      "id": "d8095543-b5f9-41a4-9875-0a52276393ed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:52:26.311019Z",
      "attachments": [
        {
          "file_id": "ede7adaf-8075-4909-8dc7-c55017430ece",
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
  "session_id": "70ada7bf-f1f2-4993-86e4-c10f902f61ee",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4NDYsImlhdCI6MTc5MzM1Mzk0NiwianRpIjoiMjM4OTI0NzQtN2Y2MS00MDA1LWEzNDEtYWE3OWViNjA2OGI4Iiwic2lkIjoiNzBhZGE3YmYtZjFmMi00OTkzLTg2ZTQtYzEwZjkwMmY2MWVlIn0.2gcAL48jvx4vD6Qb2NLYEvQLqgPTS8A9f-v9P5RuDWc",
  "access_expires_at": "2026-10-30T10:07:26.947483333Z",
  "refresh_token": "bZpJQIOF4EP9JE-EDJ0czBTWMge0NEbyjdL8bhQh4IY",
  "refresh_expires_at": "2026-10-30T21:52:26.946887032Z",
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
  "session_id": "597fcf7a-9bb2-470c-95d0-ddd9dfbab65f",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4NDcsImlhdCI6MTc5MzM1Mzk0NywianRpIjoiN2NkYzY2ZjktOGVhNS00ZjkyLWI5MDYtNDc3ODAxY2U5ZDFkIiwic2lkIjoiNTk3ZmNmN2EtOWJiMi00NzBjLTk1ZDAtZGRkOWRmYmFiNjVmIn0.mhBvpXtRWuB3ug-e8vt4bcWE-rghy5jCZg7mlIq41Qo",
  "access_expires_at": "2026-10-30T10:07:27.531075576Z",
  "refresh_token": "lkVcHRP_48tXQRKuTLR7D9gGm_dOGaU6QQ7zbq95hig",
  "refresh_expires_at": "2026-10-30T21:52:27.530547534Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f8473b85-201c-4e68-86d1-74dd26d2b4de/attachments/ede7adaf-8075-4909-8dc7-c55017430ece` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "5d22fbd6-0464-45ef-a91c-a16ec38d15b8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7d66e80e-022f-4820-9108-9974cdee2a61",
  "upload_path": "/api/operator/v1/uploads/7d66e80e-022f-4820-9108-9974cdee2a61",
  "expires_at": "2026-10-30T10:07:27.821316138Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7d66e80e-022f-4820-9108-9974cdee2a61` → **200**

```json
{
  "file_id": "7d66e80e-022f-4820-9108-9974cdee2a61",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f8473b85-201c-4e68-86d1-74dd26d2b4de` → **200**

```json
{
  "id": "f8473b85-201c-4e68-86d1-74dd26d2b4de",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:52:26.309587Z",
  "updated_at": "2026-10-30T09:52:26.309587Z",
  "respond_by": "2026-10-30T13:52:26.309587Z",
  "messages": [
    {
      "id": "d8095543-b5f9-41a4-9875-0a52276393ed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:52:26.311019Z",
      "attachments": [
        {
          "file_id": "ede7adaf-8075-4909-8dc7-c55017430ece",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f8473b85-201c-4e68-86d1-74dd26d2b4de/comments` → **200**

```json
{
  "command_id": "1776fda2-b944-415f-8a13-031cc5dab223",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7d66e80e-022f-4820-9108-9974cdee2a61"
  ]
}
```

```json
{
  "id": "f8473b85-201c-4e68-86d1-74dd26d2b4de",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:52:26.309587Z",
  "updated_at": "2026-10-30T09:52:28.435112Z",
  "respond_by": "2026-10-30T13:52:26.309587Z",
  "messages": [
    {
      "id": "d8095543-b5f9-41a4-9875-0a52276393ed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:52:26.311019Z",
      "attachments": [
        {
          "file_id": "ede7adaf-8075-4909-8dc7-c55017430ece",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cc9a7752-86cb-487d-9507-144e90a54bbb",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:52:28.434635Z",
      "attachments": [
        {
          "file_id": "7d66e80e-022f-4820-9108-9974cdee2a61",
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

`GET /api/rider/v1/support/cases/f8473b85-201c-4e68-86d1-74dd26d2b4de` → **200**

```json
{
  "id": "f8473b85-201c-4e68-86d1-74dd26d2b4de",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:52:26.309587Z",
  "updated_at": "2026-10-30T09:52:28.435112Z",
  "respond_by": "2026-10-30T13:52:26.309587Z",
  "messages": [
    {
      "id": "d8095543-b5f9-41a4-9875-0a52276393ed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0594f15-dad4-4de7-8f49-cfabd5a22ee4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:52:26.311019Z",
      "attachments": [
        {
          "file_id": "ede7adaf-8075-4909-8dc7-c55017430ece",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cc9a7752-86cb-487d-9507-144e90a54bbb",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:52:28.434635Z",
      "attachments": [
        {
          "file_id": "7d66e80e-022f-4820-9108-9974cdee2a61",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f8473b85-201c-4e68-86d1-74dd26d2b4de/attachments/7d66e80e-022f-4820-9108-9974cdee2a61` → **200**

Done: support case f8473b85-201c-4e68-86d1-74dd26d2b4de, rider attachment ede7adaf-8075-4909-8dc7-c55017430ece, operator attachment 7d66e80e-022f-4820-9108-9974cdee2a61.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735990974",
  "device_ref": "sandbox-1517"
}
```

```json
{
  "challenge_id": "405e4329-c3d1-4464-99ec-724db5016e3a",
  "expires_at": "2026-10-30T09:57:29.048695912Z",
  "resend_available_at": "2026-10-30T09:52:30.048695912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735990974` → **200**

```json
{
  "phone": "+380735990974",
  "audience": "CLIENT",
  "code": "592400",
  "sent_at": "2026-10-30T09:52:29.051370789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "405e4329-c3d1-4464-99ec-724db5016e3a",
  "code": "592400",
  "device_ref": "sandbox-1517"
}
```

```json
{
  "session_id": "5b027829-872e-43ec-a1c6-c7dcdcf2f82b",
  "subject": {
    "type": "CLIENT",
    "id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmQ4ZDdmZC03ZjhhLTRlMTQtYjczNS1mZTZkMzk3YmJmZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODQ5LCJpYXQiOjE3OTMzNTM5NDksImp0aSI6ImE4YWYxZmU1LTA5YjAtNGI2YS1hYWE2LTFmZjAxZWRlNzljMyIsInNpZCI6IjViMDI3ODI5LTg3MmUtNDNlYy1hMWM2LWM3ZGNkY2YyZjgyYiJ9.3AAurWLI1yAFd4W4wjFofA8h5VGm9SLw4-Va_bimsCA",
  "access_expires_at": "2026-10-30T10:07:29.351097679Z",
  "refresh_token": "aQSuLm0ZkYSsdJZYk-5tpmiuj24UgDDQihxUo_740uQ",
  "refresh_expires_at": "2026-11-29T09:52:29.350561534Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3cc2474c-f9b0-4ae3-92d3-eb8e3d7fb670",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a8c407f8-30fe-414d-a486-31a47dbcc02a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a8c407f8-30fe-414d-a486-31a47dbcc02a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6fee59f238c75cfcc915ac60cf4a0b38",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a8c407f8-30fe-414d-a486-31a47dbcc02a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735990974"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a8c407f8-30fe-414d-a486-31a47dbcc02a",
  "expires_at": "2026-10-30T10:22:29.623876Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/a8c407f8-30fe-414d-a486-31a47dbcc02a` → **200**

```json
{
  "id": "a8c407f8-30fe-414d-a486-31a47dbcc02a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:22:29.623876Z",
  "card": {
    "id": "85cc9daf-4aee-4c64-a3a0-34ec092fc131",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1273",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:52:29.910135Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6fdcb79-e79f-4bbf-bf31-f47dc02f24f3",
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
  "id": "2c0d70bc-86fb-4546-907f-9e874d8a09b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:57:30.207679Z",
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
  "command_id": "cac550b9-0f66-4797-9c34-a8a83659b1a3",
  "quote_id": "2c0d70bc-86fb-4546-907f-9e874d8a09b9",
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
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529` → **200**

```json
{
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529` → **200**

```json
{
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
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

`GET /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529` → **200**

```json
{
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529/switch-to-cash` → **200**

```json
{
  "command_id": "f6d1d6dc-13e3-4006-abf1-5e8e99de45a5",
  "expected_version": 3
}
```

```json
{
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529/switch-to-cash` → **409**

```json
{
  "command_id": "5376064e-1edb-4c1a-85f4-9815ff4688e5",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "08a3e30c-dcd9-428b-b8fc-306d704b7e82"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529` → **200**

```json
{
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b969b7af-489c-4bf7-8bc1-9c825ff6b529/cancel` → **200**

```json
{
  "command_id": "07ee8a85-38e2-406c-8738-10c03d171164",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b969b7af-489c-4bf7-8bc1-9c825ff6b529",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e6d8d7fd-7f8a-4e14-b735-fe6d397bbfe3",
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
  "created_at": "2026-10-30T09:52:30.494367Z",
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
  "session_id": "34df14cc-52ba-4fee-a786-d181b89c9282",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4NTQsImlhdCI6MTc5MzM1Mzk1NCwianRpIjoiODE4YWU0MjgtNTY2NC00NWY1LWFhYjUtYzY5OWExMTU0YjZmIiwic2lkIjoiMzRkZjE0Y2MtNTJiYS00ZmVlLWE3ODYtZDE4MWI4OWM5MjgyIn0.BaAnNHJVu4hDHDRfA4ftYDcLmp741fCcWRC-M-O1_Vw",
  "access_expires_at": "2026-10-30T10:07:34.158431833Z",
  "refresh_token": "WqyDPfqnNzIQF2GJ63WHNc5CiXOhalo3lp6q6j3vTJQ",
  "refresh_expires_at": "2026-10-30T21:52:34.157944608Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12566"
}
```

```json
{
  "challenge_id": "213ff4c9-6e32-48bc-9427-b9da78ee1de8",
  "expires_at": "2026-10-30T09:57:34.427658104Z",
  "resend_available_at": "2026-10-30T09:52:35.427658104Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "576138",
  "sent_at": "2026-10-30T09:52:34.430218135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "213ff4c9-6e32-48bc-9427-b9da78ee1de8",
  "code": "576138",
  "device_ref": "sandbox-12566"
}
```

```json
{
  "session_id": "a19e47fa-117b-4bba-95bc-881d2807f3e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg1NCwiaWF0IjoxNzkzMzUzOTU0LCJqdGkiOiJjZjVlNjIyNi1hMjJlLTRhMTQtYjhmZS02MDZjNTgyYWYzOGUiLCJzaWQiOiJhMTllNDdmYS0xMTdiLTRiYmEtOTViYy04ODFkMjgwN2YzZTEifQ.9Jm0vKNpmzhjDN30xom72zMWpeAsP5XXzDxr6-OTmfc",
  "access_expires_at": "2026-10-30T10:07:34.722201452Z",
  "refresh_token": "GFkuEhQcvGhxwkJgSXTTl4Iq_qe8s14f97ThAqY4Od0",
  "refresh_expires_at": "2026-11-29T09:52:34.721698948Z",
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
      "actor_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:52:17.353207Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T09:52:18.784736Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "53b4dd15-6d50-408e-8a14-b8f4a6f000ea",
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
  "device_ref": "sandbox-18865"
}
```

```json
{
  "challenge_id": "e66ba637-4d68-4477-921d-1e2426827739",
  "expires_at": "2026-10-30T09:57:35.851929154Z",
  "resend_available_at": "2026-10-30T09:52:36.851929154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "628070",
  "sent_at": "2026-10-30T09:52:35.854608503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e66ba637-4d68-4477-921d-1e2426827739",
  "code": "628070",
  "device_ref": "sandbox-18865"
}
```

```json
{
  "session_id": "365c9c1d-94b8-4f43-a773-12a9532d28bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg1NiwiaWF0IjoxNzkzMzUzOTU2LCJqdGkiOiIyNTQ2NWNlOS05N2IwLTQ3MDItOWVkNy1kOGQ3OThlNmQ1NzMiLCJzaWQiOiIzNjVjOWMxZC05NGI4LTRmNDMtYTc3My0xMmE5NTMyZDI4YmQifQ.7Lom1BsW8wE0YUAVmfrIxhg9btssDy0Tvj2U_SSlkXw",
  "access_expires_at": "2026-10-30T10:07:36.152142371Z",
  "refresh_token": "0BLoXm4FPrQhA1JeDltDYS_HS-XJxl1ROVZDDoPjHVA",
  "refresh_expires_at": "2026-11-29T09:52:36.151682317Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:51:58.700655Z",
  "last_location_at": "2026-10-30T09:51:58.700655Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9109cd5e-c1fe-4234-a874-ea3409a405d6/handover` → **200**

```json
{
  "command_id": "5d54124d-eff8-400c-894c-c0b70ed9e82a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:51:58.700655Z",
  "last_location_at": "2026-10-30T09:51:58.700655Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9109cd5e-c1fe-4234-a874-ea3409a405d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:36Z",
    "sequence": 1793353956981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:52:36.999127Z",
  "last_location_at": "2026-10-30T09:52:36.999127Z",
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
  "command_id": "022c915a-fce7-40d4-b9ad-0ef6f30aec7d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:37Z",
    "sequence": 1793353957546
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9ab4c222-bb81-464c-91f1-d8f4f64ed0be",
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
  "last_heartbeat_at": "2026-10-30T09:52:37.563628Z",
  "last_location_at": "2026-10-30T09:52:37.563628Z",
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
  "session_id": "ece7f1af-f839-4511-ade8-4ce5d2d5aaab",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTQ4NTgsImlhdCI6MTc5MzM1Mzk1OCwianRpIjoiNzdiMTU1ZWYtMjhlOS00ZTY5LTlkYzEtYmFiYjdhNGY1ZDUyIiwic2lkIjoiZWNlN2YxYWYtZjgzOS00NTExLWFkZTgtNGNlNWQyZDVhYWFiIn0.kkBAxAUPQRIZOOr00bZ3eh3pnOMsZN4izkHdjkhj5TQ",
  "access_expires_at": "2026-10-30T10:07:38.13810235Z",
  "refresh_token": "N6k9PQSPaUPtzAGJF8JLGd-sqh_-8ECNwtUTGBzw7Kg",
  "refresh_expires_at": "2026-10-30T21:52:38.13755996Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6ea509c2-4b87-486c-b942-5b741cbe6711",
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
  "id": "48ecd46f-9319-494a-bda8-b144931f4f3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:57:38.418787Z",
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
  "command_id": "e8f8bbc1-200d-4422-a434-54843abe475a",
  "quote_id": "48ecd46f-9319-494a-bda8-b144931f4f3b",
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
  "id": "942c80bd-c477-4356-9af4-d4252b928779",
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
  "created_at": "2026-10-30T09:52:38.713744Z",
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
    "id": "216a814c-6dd3-4afe-82f1-74fb792b08c4",
    "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
    "expires_at": "2026-10-30T09:52:53.717648Z",
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

`POST /api/driver/v1/offers/216a814c-6dd3-4afe-82f1-74fb792b08c4/accept` → **200**

```json
{
  "command_id": "b78054da-359f-4564-a5a9-739fae5c8598"
}
```

```json
{
  "id": "bd19b035-4638-4d00-8a89-e5f31a7c008c",
  "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36aec0c1-ff00-4de5-a37c-21d6e87a7271",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36aec0c1-ff00-4de5-a37c-21d6e87a7271",
  "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
  "assignment_id": "bd19b035-4638-4d00-8a89-e5f31a7c008c",
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

`POST /api/driver/v1/work-sessions/9ab4c222-bb81-464c-91f1-d8f4f64ed0be/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:52:40Z",
    "sequence": 1793353960120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9ab4c222-bb81-464c-91f1-d8f4f64ed0be",
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
  "last_heartbeat_at": "2026-10-30T09:52:40.137545Z",
  "last_location_at": "2026-10-30T09:52:40.137545Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/36aec0c1-ff00-4de5-a37c-21d6e87a7271/arrive` → **200**

```json
{
  "command_id": "321d18ff-c621-4cf6-998e-65eee447a171",
  "expected_version": 0
}
```

```json
{
  "id": "36aec0c1-ff00-4de5-a37c-21d6e87a7271",
  "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
  "assignment_id": "bd19b035-4638-4d00-8a89-e5f31a7c008c",
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
  "arrived_at": "2026-10-30T09:52:40.421853Z",
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

`POST /api/driver/v1/trips/36aec0c1-ff00-4de5-a37c-21d6e87a7271/start` → **200**

```json
{
  "command_id": "c05f5b07-2e7a-42eb-94f7-7be7a0fc68d0",
  "expected_version": 1
}
```

```json
{
  "id": "36aec0c1-ff00-4de5-a37c-21d6e87a7271",
  "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
  "assignment_id": "bd19b035-4638-4d00-8a89-e5f31a7c008c",
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
  "arrived_at": "2026-10-30T09:52:40.421853Z",
  "started_at": "2026-10-30T09:52:40.717467Z",
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

`POST /api/driver/v1/trips/36aec0c1-ff00-4de5-a37c-21d6e87a7271/complete` → **200**

```json
{
  "command_id": "1975f5c4-3c34-492e-b7b2-e1f387fee326",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:52:41Z",
  "cash_received": true
}
```

```json
{
  "id": "36aec0c1-ff00-4de5-a37c-21d6e87a7271",
  "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
  "assignment_id": "bd19b035-4638-4d00-8a89-e5f31a7c008c",
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
  "arrived_at": "2026-10-30T09:52:40.421853Z",
  "started_at": "2026-10-30T09:52:40.717467Z",
  "completed_at": "2026-10-30T09:52:41.013041Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/942c80bd-c477-4356-9af4-d4252b928779` → **200**

```json
{
  "id": "942c80bd-c477-4356-9af4-d4252b928779",
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
    "id": "bd19b035-4638-4d00-8a89-e5f31a7c008c",
    "order_id": "942c80bd-c477-4356-9af4-d4252b928779",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "36aec0c1-ff00-4de5-a37c-21d6e87a7271",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:52:38.713744Z",
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
  "session_id": "9109cd5e-c1fe-4234-a874-ea3409a405d6",
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
  "last_heartbeat_at": "2026-10-30T09:52:36.999127Z",
  "last_location_at": "2026-10-30T09:52:36.999127Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9109cd5e-c1fe-4234-a874-ea3409a405d6/close` → **200**

```json
{
  "command_id": "788fff72-8c9b-4663-8613-f1212043d755",
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
  "session_id": "9ab4c222-bb81-464c-91f1-d8f4f64ed0be",
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
  "last_heartbeat_at": "2026-10-30T09:52:40.137545Z",
  "last_location_at": "2026-10-30T09:52:40.137545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9ab4c222-bb81-464c-91f1-d8f4f64ed0be/close` → **200**

```json
{
  "command_id": "9c30e75f-2c85-4783-a9cc-d4d6d06796e8",
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

Done: terminal order 942c80bd-c477-4356-9af4-d4252b928779 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19149"
}
```

```json
{
  "challenge_id": "e83b5546-83b3-4fa2-ab1b-c2827b9886cd",
  "expires_at": "2026-10-30T09:57:46.060248288Z",
  "resend_available_at": "2026-10-30T09:52:47.060248288Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "932127",
  "sent_at": "2026-10-30T09:52:46.063733468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e83b5546-83b3-4fa2-ab1b-c2827b9886cd",
  "code": "932127",
  "device_ref": "sandbox-19149"
}
```

```json
{
  "session_id": "781e4ad5-65f8-41bc-bed8-439f2b4d0930",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg2NiwiaWF0IjoxNzkzMzUzOTY2LCJqdGkiOiIyZGFlZTE5Yi04NzQ0LTQ2NDYtYjVkZi1iMjVjMWVlZGFhZWUiLCJzaWQiOiI3ODFlNGFkNS02NWY4LTQxYmMtYmVkOC00MzlmMmI0ZDA5MzAifQ.vwScK33kGK-XT2j8t2XzviRu0yLdTj_DBdCOn_rI10k",
  "access_expires_at": "2026-10-30T10:07:46.357145137Z",
  "refresh_token": "7kF3IkUipEhR61_CjN4oivXvnLyzOS2-nXl8EY9qj3U",
  "refresh_expires_at": "2026-11-29T09:52:46.356644887Z",
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
  "device_ref": "sandbox-32608"
}
```

```json
{
  "challenge_id": "384823de-019c-4af0-aa04-738937d95cfa",
  "expires_at": "2026-10-30T09:57:46.901325399Z",
  "resend_available_at": "2026-10-30T09:52:47.901325399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "752004",
  "sent_at": "2026-10-30T09:52:46.90387357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "384823de-019c-4af0-aa04-738937d95cfa",
  "code": "752004",
  "device_ref": "sandbox-32608"
}
```

```json
{
  "session_id": "3a6fef0b-3325-4fbe-88e0-95cdeed02fd7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg2NywiaWF0IjoxNzkzMzUzOTY3LCJqdGkiOiIyM2Q3Y2IyZi1jYTkzLTRiNDMtODBhMy1jMTU0MDM1ZjVjYmYiLCJzaWQiOiIzYTZmZWYwYi0zMzI1LTRmYmUtODhlMC05NWNkZWVkMDJmZDcifQ.ow-Whf9yupfokMCO61WM3uHVjWPqcmCUuULgyAMRY8I",
  "access_expires_at": "2026-10-30T10:07:47.197351323Z",
  "refresh_token": "_8iTNdvvJ9bR9DM8Hqi9WPHNn4Y00WRsriqYh4oWAk4",
  "refresh_expires_at": "2026-11-29T09:52:47.19684939Z",
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
  "device_ref": "sandbox-30539"
}
```

```json
{
  "challenge_id": "a1ae14cc-35d8-4a19-bf62-6f07147bd2ca",
  "expires_at": "2026-10-30T09:57:47.737342437Z",
  "resend_available_at": "2026-10-30T09:52:48.737342437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "911539",
  "sent_at": "2026-10-30T09:52:47.739849881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1ae14cc-35d8-4a19-bf62-6f07147bd2ca",
  "code": "911539",
  "device_ref": "sandbox-30539"
}
```

```json
{
  "session_id": "029a0ddb-2bc7-4f43-9014-d28fe1a0ca85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NDg2OCwiaWF0IjoxNzkzMzUzOTY4LCJqdGkiOiJiNGQzZWEwNy01YWYyLTRlMGYtODc2Ni0wYjI0ZTVhMjAwZGQiLCJzaWQiOiIwMjlhMGRkYi0yYmM3LTRmNDMtOTAxNC1kMjhmZTFhMGNhODUifQ.MY3ApaqzNmtPoW83DlO8S11qrsgSeA0l2HWAfT37_ZI",
  "access_expires_at": "2026-10-30T10:07:48.037499619Z",
  "refresh_token": "vQuejj6CYdsE0vA1zFWcGss7_jQeObUM4olQyEHXyfg",
  "refresh_expires_at": "2026-11-29T09:52:48.036982441Z",
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
  "phone": "+380694497394",
  "device_ref": "sandbox-6319"
}
```

```json
{
  "challenge_id": "b9c1dbf8-f3bd-4ef8-bb0c-b98029e01a48",
  "expires_at": "2026-10-30T09:57:48.598963473Z",
  "resend_available_at": "2026-10-30T09:52:49.598963473Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694497394` → **200**

```json
{
  "phone": "+380694497394",
  "audience": "CLIENT",
  "code": "617999",
  "sent_at": "2026-10-30T09:52:48.601905468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9c1dbf8-f3bd-4ef8-bb0c-b98029e01a48",
  "code": "617999",
  "device_ref": "sandbox-6319"
}
```

```json
{
  "session_id": "7967ad6e-1d20-4cde-ac39-12a6e5cead50",
  "subject": {
    "type": "CLIENT",
    "id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjVkNDUxNy03NzkzLTRkMWMtOGQ4Yy1jZjExMTdkZGUxZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU0ODY4LCJpYXQiOjE3OTMzNTM5NjgsImp0aSI6ImRiNDk3NDdmLWQxMjItNGRlZC1iYTJlLWU2Mjk5MDRmMmMyZSIsInNpZCI6Ijc5NjdhZDZlLTFkMjAtNGNkZS1hYzM5LTEyYTZlNWNlYWQ1MCJ9.Btq7erVousecth9rT1SWALBkTGJ4ITPpiimOMfkFNMk",
  "access_expires_at": "2026-10-30T10:07:48.897670502Z",
  "refresh_token": "QF_BOWN9G8y8UDY_SsN7W_PduGhmtZxxyJcfVgAHOnw",
  "refresh_expires_at": "2026-11-29T09:52:48.897074357Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ca31141-d1f6-4230-8fc1-000e866ef0b8",
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
  "id": "e5d81408-1e92-4167-93ef-13d9eab8616b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:57:49.179313Z",
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
  "command_id": "fa5df2aa-9b57-46cb-8533-c7be2c449a26",
  "quote_id": "e5d81408-1e92-4167-93ef-13d9eab8616b",
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
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:52:49.468403Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:52:49.468403Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.329490074
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.192644421
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

`GET /api/rider/v1/orders/76b047a8-8363-4363-ab5b-dd133bc21079` → **200**

```json
{
  "id": "76b047a8-8363-4363-ab5b-dd133bc21079",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0f5d4517-7793-4d1c-8d8c-cf1117dde1f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:52:49.468403Z",
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
  "session_id": "4258ba9f-ae6e-45e1-a80c-e2b6529baef4",
  "subject": {
    "type": "STAFF",
    "id": "6bb82689-e6c5-4817-b540-1b53400d7fbc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmI4MjY4OS1lNmM1LTQ4MTctYjU0MC0xYjUzNDAwZDdmYmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUwNTYsImlhdCI6MTc5MzM1NDE1NiwianRpIjoiZTI2YjI4ODgtNjM2My00OWVjLTlkOGMtMmU5MWY3MzA2ZGMxIiwic2lkIjoiNDI1OGJhOWYtYWU2ZS00NWUxLWE4MGMtZTJiNjUyOWJhZWY0In0.zZHB7pX-so_SydsAjNLkFNms7XMD6S96TotznrbNH_Y",
  "access_expires_at": "2026-10-30T10:10:56.170171125Z",
  "refresh_token": "AECZ06Kj5qdChd-a9TN-LDxIpfgDkDbfAqopdSsLyCw",
  "refresh_expires_at": "2026-10-30T21:55:56.169686251Z",
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
  "id": "908fcffb-07ca-45b2-ab17-f6996a5eb5c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.458331Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.458364Z",
  "updated_at": "2026-10-30T09:55:56.474127Z",
  "finished_at": "2026-10-30T09:55:56.474127Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/908fcffb-07ca-45b2-ab17-f6996a5eb5c4` → **200**

```json
{
  "run": {
    "id": "908fcffb-07ca-45b2-ab17-f6996a5eb5c4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:55:56.458331Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:55:56.458364Z",
    "updated_at": "2026-10-30T09:55:56.474127Z",
    "finished_at": "2026-10-30T09:55:56.474127Z",
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
  "id": "908fcffb-07ca-45b2-ab17-f6996a5eb5c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.458331Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.458364Z",
  "updated_at": "2026-10-30T09:55:56.474127Z",
  "finished_at": "2026-10-30T09:55:56.474127Z",
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
  "id": "908fcffb-07ca-45b2-ab17-f6996a5eb5c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.458331Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.458364Z",
  "updated_at": "2026-10-30T09:55:56.474127Z",
  "finished_at": "2026-10-30T09:55:56.474127Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/c69737bb-03bc-46a9-a0aa-3d73ae4187b4` → **204**

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
  "id": "915330c0-64b3-4bbd-998a-2b07472539de",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.90244Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.902473Z",
  "updated_at": "2026-10-30T09:55:56.910113Z",
  "finished_at": "2026-10-30T09:55:56.910113Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/915330c0-64b3-4bbd-998a-2b07472539de` → **200**

```json
{
  "run": {
    "id": "915330c0-64b3-4bbd-998a-2b07472539de",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:55:56.90244Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:55:56.902473Z",
    "updated_at": "2026-10-30T09:55:56.910113Z",
    "finished_at": "2026-10-30T09:55:56.910113Z",
    "version": 1
  },
  "items": [
    {
      "id": "16f7493b-2a71-4b64-9697-4ece023a5d09",
      "run_id": "915330c0-64b3-4bbd-998a-2b07472539de",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "1304655b430d3374f762fc8a0aa49238bbd3c6233babf9f6148883fde92581d3",
      "reference_display": "sandbox-reconciliation-c#####bb-03bc-46a9-a0aa-3d73ae4187b4",
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
      "provider_at": "2026-10-30T09:55:56Z",
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
  "id": "915330c0-64b3-4bbd-998a-2b07472539de",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.90244Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.902473Z",
  "updated_at": "2026-10-30T09:55:56.910113Z",
  "finished_at": "2026-10-30T09:55:56.910113Z",
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
  "id": "915330c0-64b3-4bbd-998a-2b07472539de",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.90244Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.902473Z",
  "updated_at": "2026-10-30T09:55:56.910113Z",
  "finished_at": "2026-10-30T09:55:56.910113Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/16f7493b-2a71-4b64-9697-4ece023a5d09/resolve` → **200**

```json
{
  "command_id": "e1090f27-28d6-48b6-a4c9-755839deff00",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "16f7493b-2a71-4b64-9697-4ece023a5d09",
  "run_id": "915330c0-64b3-4bbd-998a-2b07472539de",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "1304655b430d3374f762fc8a0aa49238bbd3c6233babf9f6148883fde92581d3",
  "reference_display": "sandbox-reconciliation-c#####bb-03bc-46a9-a0aa-3d73ae4187b4",
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
  "provider_at": "2026-10-30T09:55:56Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "resolved_at": "2026-10-30T09:55:57.312588Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/16f7493b-2a71-4b64-9697-4ece023a5d09/resolve` → **200**

```json
{
  "command_id": "e1090f27-28d6-48b6-a4c9-755839deff00",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "16f7493b-2a71-4b64-9697-4ece023a5d09",
  "run_id": "915330c0-64b3-4bbd-998a-2b07472539de",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "1304655b430d3374f762fc8a0aa49238bbd3c6233babf9f6148883fde92581d3",
  "reference_display": "sandbox-reconciliation-c#####bb-03bc-46a9-a0aa-3d73ae4187b4",
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
  "provider_at": "2026-10-30T09:55:56Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
  "resolved_at": "2026-10-30T09:55:57.312588Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/16f7493b-2a71-4b64-9697-4ece023a5d09/resolve` → **409**

```json
{
  "command_id": "b8d78d9d-59ad-4a3f-b5c6-c7becb26d8c3",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/16f7493b-2a71-4b64-9697-4ece023a5d09/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2e4490d7-f5c3-4782-94e4-dc55cb409b1c"
}
```

`GET /api/admin/v1/payment-reconciliations/915330c0-64b3-4bbd-998a-2b07472539de` → **200**

```json
{
  "run": {
    "id": "915330c0-64b3-4bbd-998a-2b07472539de",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:55:56.90244Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:55:56.902473Z",
    "updated_at": "2026-10-30T09:55:57.312588Z",
    "finished_at": "2026-10-30T09:55:56.910113Z",
    "version": 2
  },
  "items": [
    {
      "id": "16f7493b-2a71-4b64-9697-4ece023a5d09",
      "run_id": "915330c0-64b3-4bbd-998a-2b07472539de",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "1304655b430d3374f762fc8a0aa49238bbd3c6233babf9f6148883fde92581d3",
      "reference_display": "sandbox-reconciliation-c#####bb-03bc-46a9-a0aa-3d73ae4187b4",
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
      "provider_at": "2026-10-30T09:55:56Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "6bb82689-e6c5-4817-b540-1b53400d7fbc",
      "resolved_at": "2026-10-30T09:55:57.312588Z",
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
      "id": "915330c0-64b3-4bbd-998a-2b07472539de",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T09:55:56.90244Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:55:56.902473Z",
      "updated_at": "2026-10-30T09:55:57.312588Z",
      "finished_at": "2026-10-30T09:55:56.910113Z",
      "version": 2
    },
    {
      "id": "3ed832ff-c896-424f-9154-6c70eb5149a0",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T09:48:09.527009Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:48:09.52709Z",
      "updated_at": "2026-10-30T09:48:09.532276Z",
      "finished_at": "2026-10-30T09:48:09.532276Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/c69737bb-03bc-46a9-a0aa-3d73ae4187b4` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "915330c0-64b3-4bbd-998a-2b07472539de",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:55:56.90244Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:55:56.902473Z",
  "updated_at": "2026-10-30T09:55:57.312588Z",
  "finished_at": "2026-10-30T09:55:56.910113Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793354279697E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79335427998E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793354279986E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79335427972E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793354279987E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
