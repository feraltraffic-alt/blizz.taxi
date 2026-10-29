# Sandbox transcript (2026-10-29T10:23:24Z, 43a99c2)

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
  "correlation_id": "c0e9d47d-cae7-4b77-ada3-82c3e3dfaf2d"
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
  "session_id": "f30e8cb7-e508-407b-9581-5c4ab26a4a46",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzMTEsImlhdCI6MTc5MzI2OTQxMSwianRpIjoiYjc4MzVlNGQtMDhkZS00Y2EyLWIyOTMtMjNlOTY4MGNmMzI3Iiwic2lkIjoiZjMwZThjYjctZTUwOC00MDdiLTk1ODEtNWM0YWIyNmE0YTQ2In0.0NjBKVg3N5UvR6OK3L1ysee3Wx1-SIOxikdlju7xB10",
  "access_expires_at": "2026-10-29T10:38:31.836617106Z",
  "refresh_token": "zNPvvkqLeCsyqZ2DnTn62FASt0ARFOWfsJW5Y38JCsU",
  "refresh_expires_at": "2026-10-29T22:23:31.834595998Z",
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
  "session_id": "1366fc50-eae7-410f-9f0c-541e62ae3907",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzMTMsImlhdCI6MTc5MzI2OTQxMywianRpIjoiMTA3MDM3M2UtODgyZS00MDkxLWFmZTYtZTdjOGNiMTc0ZGY2Iiwic2lkIjoiMTM2NmZjNTAtZWFlNy00MTBmLTlmMGMtNTQxZTYyYWUzOTA3In0.ygynmbJ_zI61phJ73qSND_6fME2SLAsKqnF7Ltzgdi8",
  "access_expires_at": "2026-10-29T10:38:33.39311337Z",
  "refresh_token": "nGn_86icujYNU2QB7eXO3WQam_UU0x4WAaj3Az6CSlU",
  "refresh_expires_at": "2026-10-29T22:23:33.392016895Z",
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
  "device_ref": "sandbox-18405"
}
```

```json
{
  "challenge_id": "43bc77bd-a70b-44bf-a067-e191bb34b6b4",
  "expires_at": "2026-10-29T10:28:33.986366858Z",
  "resend_available_at": "2026-10-29T10:23:34.986366858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "949969",
  "sent_at": "2026-10-29T10:23:33.995951618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43bc77bd-a70b-44bf-a067-e191bb34b6b4",
  "code": "949969",
  "device_ref": "sandbox-18405"
}
```

```json
{
  "session_id": "d85e47eb-1a2b-49ce-8fa3-f98aea669d9f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDMxNCwiaWF0IjoxNzkzMjY5NDE0LCJqdGkiOiI3N2ZiM2YzOS0yNzdmLTQ0ZGItOTRlOC0zOTM3YWUzNThiMzAiLCJzaWQiOiJkODVlNDdlYi0xYTJiLTQ5Y2UtOGZhMy1mOThhZWE2NjlkOWYifQ.1_s1grodLOQEEhmDSO63KqSz-NeA8Kk4nSTQGkKIS30",
  "access_expires_at": "2026-10-29T10:38:34.334677744Z",
  "refresh_token": "kIvVjSwCkAnhmQIWljgeZZqUNWPxN01sfoO2M6zUEtI",
  "refresh_expires_at": "2026-11-28T10:23:34.333538769Z",
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
  "command_id": "dca642e7-9383-4824-90ba-584a7fd401c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:23:34Z",
    "sequence": 1793269414917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06000b75-a0e8-4e94-9070-55b53a84fa70",
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
  "last_heartbeat_at": "2026-10-29T10:23:35.057264Z",
  "last_location_at": "2026-10-29T10:23:35.057264Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638570130",
  "device_ref": "sandbox-1380"
}
```

```json
{
  "challenge_id": "2b2b0ac1-e7da-43fc-93b5-554237e7f25e",
  "expires_at": "2026-10-29T10:28:35.330951026Z",
  "resend_available_at": "2026-10-29T10:23:36.330951026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638570130` → **200**

```json
{
  "phone": "+380638570130",
  "audience": "CLIENT",
  "code": "694698",
  "sent_at": "2026-10-29T10:23:35.335279445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b2b0ac1-e7da-43fc-93b5-554237e7f25e",
  "code": "694698",
  "device_ref": "sandbox-1380"
}
```

```json
{
  "session_id": "e938234c-6b01-41a2-8bf7-dd24fabd3a2d",
  "subject": {
    "type": "CLIENT",
    "id": "57d11265-5172-4855-aee9-314824f492d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1N2QxMTI2NS01MTcyLTQ4NTUtYWVlOS0zMTQ4MjRmNDkyZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzE1LCJpYXQiOjE3OTMyNjk0MTUsImp0aSI6ImEzMzU3NTg2LWEwMjctNDIzOC1iNDg3LTA1YzBkMzM4MDUwNiIsInNpZCI6ImU5MzgyMzRjLTZiMDEtNDFhMi04YmY3LWRkMjRmYWJkM2EyZCJ9.rqa64X4DF8V8lqU00VA8EmV0__a8R-jikc7qw0ktW80",
  "access_expires_at": "2026-10-29T10:38:35.627669998Z",
  "refresh_token": "bLI64-9W08Skwu57gspltRQNnWzc95Hfr8aZkeP5DlI",
  "refresh_expires_at": "2026-11-28T10:23:35.62680377Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3e8b5df-a93b-4aa7-846e-aee4b1becc52",
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
  "id": "50457c81-af88-4dae-935b-a4f6752e73ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:28:35.940684Z",
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
  "command_id": "a600aa8e-ce27-4a2b-9710-49fda1e1d4b2",
  "quote_id": "50457c81-af88-4dae-935b-a4f6752e73ed",
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
  "id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57d11265-5172-4855-aee9-314824f492d7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:23:36.296769Z",
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
    "id": "e402f124-cf6b-4904-814b-1ca5adc2c18c",
    "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
    "expires_at": "2026-10-29T10:23:51.307682Z",
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

`POST /api/driver/v1/offers/e402f124-cf6b-4904-814b-1ca5adc2c18c/accept` → **200**

```json
{
  "command_id": "06d54e85-64af-4f63-bdd1-43655097d9e6"
}
```

```json
{
  "id": "f6df9325-6692-40bd-b359-8568fe76e78c",
  "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bd4a422c-5c4b-4f02-a8d5-2d8b281d58df",
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
  "command_id": "08fe01e0-575c-442d-8b61-6e7d94ffff26",
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
  "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T10:23:37.501739108Z"
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
  "id": "bd4a422c-5c4b-4f02-a8d5-2d8b281d58df",
  "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
  "assignment_id": "f6df9325-6692-40bd-b359-8568fe76e78c",
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

`POST /api/driver/v1/work-sessions/06000b75-a0e8-4e94-9070-55b53a84fa70/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:23:38Z",
    "sequence": 1793269418378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06000b75-a0e8-4e94-9070-55b53a84fa70",
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
  "last_heartbeat_at": "2026-10-29T10:23:38.40693Z",
  "last_location_at": "2026-10-29T10:23:38.40693Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bd4a422c-5c4b-4f02-a8d5-2d8b281d58df/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c3246655-3e04-4862-9084-6685656f5889",
  "expected_version": 0
}
```

```json
{
  "id": "bd4a422c-5c4b-4f02-a8d5-2d8b281d58df",
  "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
  "assignment_id": "f6df9325-6692-40bd-b359-8568fe76e78c",
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
  "arrived_at": "2026-10-29T10:23:38.763972Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bd4a422c-5c4b-4f02-a8d5-2d8b281d58df/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8d0f1d59-105c-4c54-9ff5-680311c1ab44",
  "expected_version": 1
}
```

```json
{
  "id": "bd4a422c-5c4b-4f02-a8d5-2d8b281d58df",
  "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
  "assignment_id": "f6df9325-6692-40bd-b359-8568fe76e78c",
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
  "arrived_at": "2026-10-29T10:23:38.763972Z",
  "started_at": "2026-10-29T10:23:39.072236Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bd4a422c-5c4b-4f02-a8d5-2d8b281d58df/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9be78523-3a98-4081-8486-bd10ff944336",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:23:39Z",
  "cash_received": true
}
```

```json
{
  "id": "bd4a422c-5c4b-4f02-a8d5-2d8b281d58df",
  "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
  "assignment_id": "f6df9325-6692-40bd-b359-8568fe76e78c",
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
  "arrived_at": "2026-10-29T10:23:38.763972Z",
  "started_at": "2026-10-29T10:23:39.072236Z",
  "completed_at": "2026-10-29T10:23:39.384729Z",
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
  "session_id": "06000b75-a0e8-4e94-9070-55b53a84fa70",
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
  "last_heartbeat_at": "2026-10-29T10:23:38.40693Z",
  "last_location_at": "2026-10-29T10:23:38.40693Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06000b75-a0e8-4e94-9070-55b53a84fa70/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4558a9ff-fbb4-49dd-9bd2-3bffa950770b",
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
  "command_id": "d94742ab-a1b6-4c2d-be0b-3b8b15de96bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:23:40Z",
    "sequence": 1793269420253
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
  "correlation_id": "3635fd1f-8fbc-4f0b-a57f-62e6776a183a",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "c2d4d370-20c0-478a-bc52-bd49ef535119",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:23:40Z",
    "sequence": 1793269420550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6325cfd-8af7-43f6-bb6f-f32f65e126c6",
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
  "last_heartbeat_at": "2026-10-29T10:23:40.572547Z",
  "last_location_at": "2026-10-29T10:23:40.572547Z",
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
  "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T10:23:37.501739Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "8b865360-558b-4e13-96eb-989ac3242f92",
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
  "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T10:23:41.148056621Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6325cfd-8af7-43f6-bb6f-f32f65e126c6",
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
  "last_heartbeat_at": "2026-10-29T10:23:40.572547Z",
  "last_location_at": "2026-10-29T10:23:40.572547Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6325cfd-8af7-43f6-bb6f-f32f65e126c6/close` → **200**

```json
{
  "command_id": "dd5075f5-699d-48cd-8e2f-eb6964656616",
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
  "session_id": "00e2329d-5ee3-4cb9-a892-d28b44181264",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzMjIsImlhdCI6MTc5MzI2OTQyMiwianRpIjoiZWJiYTNhMzQtZjBlMC00MTRhLWFmNDItY2E3NzM0ODViZDJiIiwic2lkIjoiMDBlMjMyOWQtNWVlMy00Y2I5LWE4OTItZDI4YjQ0MTgxMjY0In0.9bWHhpBbUAbgpu3sgNwMhUw54BOpIYDPXWEhsonukFc",
  "access_expires_at": "2026-10-29T10:38:42.308557679Z",
  "refresh_token": "RmiUusrd9tXgohvPoAJxgnBDL2vIheRNkLqTGpzgqfk",
  "refresh_expires_at": "2026-10-29T22:23:42.307806121Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "63716dcb-a93a-486a-b03d-c813288b5cfd",
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
  "id": "4e7e9e30-beaa-4c73-b872-51a644584eaa",
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
  "created_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "created_at": "2026-10-29T10:23:42.594322Z",
  "updated_at": "2026-10-29T10:23:42.594322Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630707866",
  "device_ref": "sandbox-22536"
}
```

```json
{
  "challenge_id": "32e6c381-4d2d-4bb3-8ad6-36ce383147e8",
  "expires_at": "2026-10-29T10:28:42.881463864Z",
  "resend_available_at": "2026-10-29T10:23:43.881463864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630707866` → **200**

```json
{
  "phone": "+380630707866",
  "audience": "CLIENT",
  "code": "407569",
  "sent_at": "2026-10-29T10:23:42.886011989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32e6c381-4d2d-4bb3-8ad6-36ce383147e8",
  "code": "407569",
  "device_ref": "sandbox-22536"
}
```

```json
{
  "session_id": "9c62053f-b709-4650-80dc-1f8e0fb7f367",
  "subject": {
    "type": "CLIENT",
    "id": "afd82039-a914-44c1-af0b-b0e9388c5275"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmQ4MjAzOS1hOTE0LTQ0YzEtYWYwYi1iMGU5Mzg4YzUyNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzIzLCJpYXQiOjE3OTMyNjk0MjMsImp0aSI6Ijc0MjBiODE5LThiZjAtNDgyNy05M2EyLWQyMGZlYzU2ZDMyNiIsInNpZCI6IjljNjIwNTNmLWI3MDktNDY1MC04MGRjLTFmOGUwZmI3ZjM2NyJ9._8xFm-4sSwy1goyd8FiHegoKXoH7Oi-1vIcfcWNEms0",
  "access_expires_at": "2026-10-29T10:38:43.175636235Z",
  "refresh_token": "Xax-0RyrXea82oPKcaiw3CpbP8gJ9O27X99ZctCQeug",
  "refresh_expires_at": "2026-11-28T10:23:43.174869483Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630707866` → **200**

```json
{
  "client_id": "afd82039-a914-44c1-af0b-b0e9388c5275"
}
```

`POST /api/admin/v1/rider-wallets/afd82039-a914-44c1-af0b-b0e9388c5275/top-ups` → **201**

```json
{
  "command_id": "eb120c66-c4ea-49fd-abb1-30f10f6f4300",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "afd82039-a914-44c1-af0b-b0e9388c5275",
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
      "id": "a67d1f82-4409-4ac1-9503-3cca55dced2e",
      "at": "2026-10-29T10:23:43.725252Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "982b35a2-a01c-4ccd-b767-f5977d80451c",
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
  "id": "4299386d-03f5-4b2f-aaf6-2caac11907e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:28:44.032612Z",
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
      "id": "4e7e9e30-beaa-4c73-b872-51a644584eaa",
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
  "device_ref": "sandbox-24928"
}
```

```json
{
  "challenge_id": "fcc8534e-e4ac-446a-bd45-95e27e8c03f6",
  "expires_at": "2026-10-29T10:28:44.324575128Z",
  "resend_available_at": "2026-10-29T10:23:45.324575128Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007113",
  "sent_at": "2026-10-29T10:23:44.328217495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcc8534e-e4ac-446a-bd45-95e27e8c03f6",
  "code": "007113",
  "device_ref": "sandbox-24928"
}
```

```json
{
  "session_id": "91b17f3a-108d-4f8d-9e31-6f3a69d524b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDMyNCwiaWF0IjoxNzkzMjY5NDI0LCJqdGkiOiJjNzgyY2E0Yy01MTZjLTRkOTEtOGYzNi02ZDI4MWNkNTYwZDEiLCJzaWQiOiI5MWIxN2YzYS0xMDhkLTRmOGQtOWUzMS02ZjNhNjlkNTI0YjIifQ.s6UdzuRHB9iVjFpcKXZTPs1S_dW87CMFGSLSFX-8zV8",
  "access_expires_at": "2026-10-29T10:38:44.647948797Z",
  "refresh_token": "Dfy9uboKxT_xmwcL3hA_VUr5KX06XTUrztB6xWTaK4s",
  "refresh_expires_at": "2026-11-28T10:23:44.647293549Z",
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
  "command_id": "75cfd950-9380-4746-b8b3-073fd70105c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:23:45Z",
    "sequence": 1793269425170
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e973a0f5-93bf-4df6-ae45-833d11896199",
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
  "last_heartbeat_at": "2026-10-29T10:23:45.190583Z",
  "last_location_at": "2026-10-29T10:23:45.190583Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "76d0e7ac-5cc7-41be-97a0-b3cef4432daa",
  "quote_id": "4299386d-03f5-4b2f-aaf6-2caac11907e9",
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
  "id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "afd82039-a914-44c1-af0b-b0e9388c5275",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:23:45.495996Z",
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
  "client_id": "afd82039-a914-44c1-af0b-b0e9388c5275",
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
      "id": "a67d1f82-4409-4ac1-9503-3cca55dced2e",
      "at": "2026-10-29T10:23:43.725252Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
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
    "id": "ca033af5-d97d-4ea6-9b34-d0da6541d38d",
    "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
    "expires_at": "2026-10-29T10:24:00.504442Z",
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

`POST /api/driver/v1/offers/ca033af5-d97d-4ea6-9b34-d0da6541d38d/accept` → **200**

```json
{
  "command_id": "8f074697-db1b-4a96-8b16-7de4f5f7dd29"
}
```

```json
{
  "id": "6fe77041-a2fb-40a6-a12d-9895256e8280",
  "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0da09970-7dc0-4e14-a791-c05a7a673366",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0da09970-7dc0-4e14-a791-c05a7a673366",
  "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
  "assignment_id": "6fe77041-a2fb-40a6-a12d-9895256e8280",
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

`POST /api/driver/v1/work-sessions/e973a0f5-93bf-4df6-ae45-833d11896199/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:23:46Z",
    "sequence": 1793269426892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e973a0f5-93bf-4df6-ae45-833d11896199",
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
  "last_heartbeat_at": "2026-10-29T10:23:46.91384Z",
  "last_location_at": "2026-10-29T10:23:46.91384Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0da09970-7dc0-4e14-a791-c05a7a673366/arrive` → **200**

```json
{
  "command_id": "3b2f941e-92c5-4113-9628-2e67401e7889",
  "expected_version": 0
}
```

```json
{
  "id": "0da09970-7dc0-4e14-a791-c05a7a673366",
  "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
  "assignment_id": "6fe77041-a2fb-40a6-a12d-9895256e8280",
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
  "arrived_at": "2026-10-29T10:23:47.192287Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0da09970-7dc0-4e14-a791-c05a7a673366/start` → **200**

```json
{
  "command_id": "edbdfd7f-d4bc-4f0c-a499-a0947a093ce2",
  "expected_version": 1
}
```

```json
{
  "id": "0da09970-7dc0-4e14-a791-c05a7a673366",
  "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
  "assignment_id": "6fe77041-a2fb-40a6-a12d-9895256e8280",
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
  "arrived_at": "2026-10-29T10:23:47.192287Z",
  "started_at": "2026-10-29T10:23:47.472731Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/0da09970-7dc0-4e14-a791-c05a7a673366/complete` → **200**

```json
{
  "command_id": "ec280130-b014-44e6-ace1-d093f38e5241",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:23:47Z",
  "cash_received": true
}
```

```json
{
  "id": "0da09970-7dc0-4e14-a791-c05a7a673366",
  "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
  "assignment_id": "6fe77041-a2fb-40a6-a12d-9895256e8280",
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
  "arrived_at": "2026-10-29T10:23:47.192287Z",
  "started_at": "2026-10-29T10:23:47.472731Z",
  "completed_at": "2026-10-29T10:23:47.782278Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "afd82039-a914-44c1-af0b-b0e9388c5275",
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
      "id": "a3f16d5d-e501-4770-abb7-01314d765168",
      "at": "2026-10-29T10:23:48.767868Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5"
    },
    {
      "id": "a67d1f82-4409-4ac1-9503-3cca55dced2e",
      "at": "2026-10-29T10:23:43.725252Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/4e7e9e30-beaa-4c73-b872-51a644584eaa/archive` → **200**

```json
{
  "command_id": "7506413a-8328-4480-8087-9e95927838f8",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "4e7e9e30-beaa-4c73-b872-51a644584eaa",
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
  "created_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "created_at": "2026-10-29T10:23:42.594322Z",
  "updated_at": "2026-10-29T10:23:51.362509Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e973a0f5-93bf-4df6-ae45-833d11896199",
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
  "last_heartbeat_at": "2026-10-29T10:23:46.91384Z",
  "last_location_at": "2026-10-29T10:23:46.91384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e973a0f5-93bf-4df6-ae45-833d11896199/close` → **200**

```json
{
  "command_id": "005916a2-a5f5-4b91-a48c-0e09c5143ad5",
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

Done: order f25f055d-d7de-49c2-9aaf-4604a3fad1f5.

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
  "session_id": "a1b08bca-0c54-4981-9141-b29aff7b0a7f",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzMzIsImlhdCI6MTc5MzI2OTQzMiwianRpIjoiYWM3OTIxNDktYmI0MS00OTFjLTgyODktMmVmYzJlYTc4YzFiIiwic2lkIjoiYTFiMDhiY2EtMGM1NC00OTgxLTkxNDEtYjI5YWZmN2IwYTdmIn0.vOstNePExrtKp-Pn6mu4THzhlr141r_DVzk5BONvcVc",
  "access_expires_at": "2026-10-29T10:38:52.500218546Z",
  "refresh_token": "dm_p_R0dZSJcKDByqNzrQal0J-jnnHDiG357tXn6fvY",
  "refresh_expires_at": "2026-10-29T22:23:52.499478228Z",
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
  "command_id": "aebd698f-913d-4a9c-9f48-524714c5e1be",
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
  "session_id": "7a08a9a4-919b-4e4c-8c39-4fb06102a0d5",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzMzMsImlhdCI6MTc5MzI2OTQzMywianRpIjoiMjJkYjcxNDEtNjBhOC00Yjg5LWJiZDQtMmU2OTQ2ZjIyMDk5Iiwic2lkIjoiN2EwOGE5YTQtOTE5Yi00ZTRjLThjMzktNGZiMDYxMDJhMGQ1In0.dDBoSM19uF8EfTLAlUP2v2qDPzYmWfyex6ojvA2dWZ8",
  "access_expires_at": "2026-10-29T10:38:53.634345751Z",
  "refresh_token": "kfLbq8Rh6FYWKdwrNPOanHQpllbNwsc-Fb-5jIpvFAw",
  "refresh_expires_at": "2026-10-29T22:23:53.633579494Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.514825573",
    "linkedid": "1730052700.514825573",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679865770"
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
    "id": "1730052700.514825573",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "53089d9c-47a8-43d6-8cde-95eb03c46ec1",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T10:23:53.908177Z",
      "answered_at": null,
      "ended_at": "2026-10-29T10:23:53.934331Z",
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
    "id": "1730052600.2442529119",
    "linkedid": "1730052600.2442529119",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679865770"
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
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/82d4e4f6-e564-4046-9d75-75a13660ff7a/answer` → **200**

```json
{
  "command_id": "5678c529-82f1-4ce8-ae42-1abea4618fa1"
}
```

```json
{
  "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679865770",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "order_ids": [],
  "started_at": "2026-10-29T10:23:54.237742Z",
  "answered_at": "2026-10-29T10:23:54.546946Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2442529119",
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
    "id": "1730052600.2442529119",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
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
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
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
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
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
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
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
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:24:03.518368Z"
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
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:24:03.518368Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/82d4e4f6-e564-4046-9d75-75a13660ff7a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/82d4e4f6-e564-4046-9d75-75a13660ff7a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=82d4e4f6-e564-4046-9d75-75a13660ff7a` → **200**

```json
{
  "changes": [
    {
      "id": "8de260f9-68bc-490c-90f5-76fe2bc3c1a7",
      "occurred_at": "2026-10-29T10:24:04.567393Z",
      "actor_type": "STAFF",
      "actor_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"dfc57d4f-65f2-48f5-8cb0-be24d0759295\", \"order_ids\": []}",
      "correlation_id": "528f42a3-ca1d-4977-b258-eaf879e027a7"
    },
    {
      "id": "e73b020a-55cd-4446-bfe9-17878ef5df70",
      "occurred_at": "2026-10-29T10:24:04.535143Z",
      "actor_type": "STAFF",
      "actor_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"dfc57d4f-65f2-48f5-8cb0-be24d0759295\", \"order_ids\": []}",
      "correlation_id": "7512849f-cdb7-4218-9cc8-c519fd872b21"
    }
  ]
}
```

Done: call 82d4e4f6-e564-4046-9d75-75a13660ff7a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8040"
}
```

```json
{
  "challenge_id": "b6c0b17a-a043-46a8-ab08-4dbd89b639f8",
  "expires_at": "2026-10-29T10:29:04.903624254Z",
  "resend_available_at": "2026-10-29T10:24:05.903624254Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "796770",
  "sent_at": "2026-10-29T10:24:04.90719944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6c0b17a-a043-46a8-ab08-4dbd89b639f8",
  "code": "796770",
  "device_ref": "sandbox-8040"
}
```

```json
{
  "session_id": "21bd6eca-20bd-4ac1-ae35-7caa1311040e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDM0NSwiaWF0IjoxNzkzMjY5NDQ1LCJqdGkiOiJmOTExNGY3ZS1hMGZkLTQ2MmYtOTc0ZS04MDc0NDZjNGIyYjEiLCJzaWQiOiIyMWJkNmVjYS0yMGJkLTRhYzEtYWUzNS03Y2FhMTMxMTA0MGUifQ.iHjLH_NHS2-HFOR8Np-k0945s0RjeQ_wwu7KoV4T5_I",
  "access_expires_at": "2026-10-29T10:39:05.197805194Z",
  "refresh_token": "ZdNnfiC9EX6TccMX2HOhIxxB0ChJacMC1dva1bGcLXg",
  "refresh_expires_at": "2026-11-28T10:24:05.197169553Z",
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
  "command_id": "7014809b-44e0-4f21-9781-df9580a6d000",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:05Z",
    "sequence": 1793269445726
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a38db3e4-c705-48d1-87cb-d0acda257a2e",
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
  "last_heartbeat_at": "2026-10-29T10:24:05.747773Z",
  "last_location_at": "2026-10-29T10:24:05.747773Z",
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
  "session_id": "2d14e7af-4f1f-4032-8bad-9a7212839fb5",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzNDYsImlhdCI6MTc5MzI2OTQ0NiwianRpIjoiOTRlYmM4N2YtMzc5Yi00YTA3LWE1NGMtZGU5OTRiMDc4ODQ1Iiwic2lkIjoiMmQxNGU3YWYtNGYxZi00MDMyLThiYWQtOWE3MjEyODM5ZmI1In0.T5focStGFg4NmDE7QfEwgP3tEV5WxJejszgFlxWk2Ws",
  "access_expires_at": "2026-10-29T10:39:06.312360246Z",
  "refresh_token": "m6ft-VMxxiwR28zx_FyWinDyTqPAvIBOF4R3OCzjnZg",
  "refresh_expires_at": "2026-10-29T22:24:06.311752802Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6606e949-34eb-4ae3-94dc-c75ac6278ebe",
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
  "id": "db40ba77-8173-4c4f-ab0e-c3cd22d8e7cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:06.582251Z",
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
  "command_id": "3f9d6bf6-4384-4d22-9dc0-e705c7ae5653",
  "quote_id": "db40ba77-8173-4c4f-ab0e-c3cd22d8e7cb",
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
    "phone": "+380678539490"
  }
}
```

```json
{
  "id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
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
  "created_at": "2026-10-29T10:24:06.882554Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678539490"
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
    "id": "3876fba6-9337-40df-b27f-37e17e1aabb4",
    "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
    "expires_at": "2026-10-29T10:24:21.887612Z",
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

`POST /api/driver/v1/offers/3876fba6-9337-40df-b27f-37e17e1aabb4/accept` → **200**

```json
{
  "command_id": "efd01291-3c6b-40f8-8cc3-b2567add3811"
}
```

```json
{
  "id": "d2986298-d9d2-44f5-ba1d-af5585aef6cc",
  "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a0ee5d39-8ae6-429c-aefd-4fc3fc633c83",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a0ee5d39-8ae6-429c-aefd-4fc3fc633c83",
  "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
  "assignment_id": "d2986298-d9d2-44f5-ba1d-af5585aef6cc",
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
    "phone": "+380678539490"
  }
}
```

`POST /api/driver/v1/work-sessions/a38db3e4-c705-48d1-87cb-d0acda257a2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:09Z",
    "sequence": 1793269449104
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a38db3e4-c705-48d1-87cb-d0acda257a2e",
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
  "last_heartbeat_at": "2026-10-29T10:24:09.123482Z",
  "last_location_at": "2026-10-29T10:24:09.123482Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a0ee5d39-8ae6-429c-aefd-4fc3fc633c83/arrive` → **200**

```json
{
  "command_id": "5ad67862-a4cb-439b-bdff-c8aa7fb72dba",
  "expected_version": 0
}
```

```json
{
  "id": "a0ee5d39-8ae6-429c-aefd-4fc3fc633c83",
  "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
  "assignment_id": "d2986298-d9d2-44f5-ba1d-af5585aef6cc",
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
  "arrived_at": "2026-10-29T10:24:09.405758Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678539490"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  },
  {
    "phone": "+380678539490",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:10.6885345Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  },
  {
    "phone": "+380678539490",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:10.6885345Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678539490` → **200**

```json
[
  {
    "phone": "+380678539490",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:08.680102262Z"
  },
  {
    "phone": "+380678539490",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T10:24:10.6885345Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/a0ee5d39-8ae6-429c-aefd-4fc3fc633c83/start` → **200**

```json
{
  "command_id": "ac51a15b-1db5-4926-92f3-065f7a7bbf6d",
  "expected_version": 1
}
```

```json
{
  "id": "a0ee5d39-8ae6-429c-aefd-4fc3fc633c83",
  "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
  "assignment_id": "d2986298-d9d2-44f5-ba1d-af5585aef6cc",
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
  "arrived_at": "2026-10-29T10:24:09.405758Z",
  "started_at": "2026-10-29T10:24:10.798518Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678539490"
  }
}
```

`POST /api/driver/v1/trips/a0ee5d39-8ae6-429c-aefd-4fc3fc633c83/complete` → **200**

```json
{
  "command_id": "0019a3aa-2b43-44b1-adba-e3642a06d9b6",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:24:11Z",
  "cash_received": true
}
```

```json
{
  "id": "a0ee5d39-8ae6-429c-aefd-4fc3fc633c83",
  "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
  "assignment_id": "d2986298-d9d2-44f5-ba1d-af5585aef6cc",
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
  "arrived_at": "2026-10-29T10:24:09.405758Z",
  "started_at": "2026-10-29T10:24:10.798518Z",
  "completed_at": "2026-10-29T10:24:11.100308Z",
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
  "session_id": "a38db3e4-c705-48d1-87cb-d0acda257a2e",
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
  "last_heartbeat_at": "2026-10-29T10:24:09.123482Z",
  "last_location_at": "2026-10-29T10:24:09.123482Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a38db3e4-c705-48d1-87cb-d0acda257a2e/close` → **200**

```json
{
  "command_id": "b9946870-b90d-4e42-aa18-78ea09ce2b7b",
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
  "phone": "+380637909443",
  "device_ref": "sandbox-4919"
}
```

```json
{
  "challenge_id": "ca58a424-f9d9-4fd5-8b70-3f92476d6029",
  "expires_at": "2026-10-29T10:29:11.936892869Z",
  "resend_available_at": "2026-10-29T10:24:12.936892869Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637909443` → **200**

```json
{
  "phone": "+380637909443",
  "audience": "CLIENT",
  "code": "773641",
  "sent_at": "2026-10-29T10:24:11.940233747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca58a424-f9d9-4fd5-8b70-3f92476d6029",
  "code": "773641",
  "device_ref": "sandbox-4919"
}
```

```json
{
  "session_id": "864b9843-6627-44a7-b92d-2d6c25efb60b",
  "subject": {
    "type": "CLIENT",
    "id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjFmOTFlMy1mMDA4LTQxMmEtYWYzYy0xNmEyNmI2OGI2YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzUyLCJpYXQiOjE3OTMyNjk0NTIsImp0aSI6IjdkMzc2YTA3LWRkYmMtNDAzYS1iOTVhLWI2ODVkZDZmM2U5NiIsInNpZCI6Ijg2NGI5ODQzLTY2MjctNDRhNy1iOTJkLTJkNmMyNWVmYjYwYiJ9.1i4uBgNqr9ENuOayGXwaBfUS2aKdag5N21H6Qycjr6o",
  "access_expires_at": "2026-10-29T10:39:12.232446002Z",
  "refresh_token": "yEJaBJP3NqTgxi5yhQvxQLcBTdeU7WhXhkx6rkJC9L4",
  "refresh_expires_at": "2026-11-28T10:24:12.231856827Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-21719"
}
```

```json
{
  "challenge_id": "b60570a2-bad1-4430-a151-ebad03d7573d",
  "expires_at": "2026-10-29T10:29:12.764351478Z",
  "resend_available_at": "2026-10-29T10:24:13.764351478Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "798939",
  "sent_at": "2026-10-29T10:24:12.767135777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b60570a2-bad1-4430-a151-ebad03d7573d",
  "code": "798939",
  "device_ref": "sandbox-21719"
}
```

```json
{
  "session_id": "ea1dc791-2310-44e2-a4a7-055158154750",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDM1MywiaWF0IjoxNzkzMjY5NDUzLCJqdGkiOiI3YTM3MzRmNy1kMTQzLTQ1YjgtYmRiYS00NmNmMDZjOTVlM2EiLCJzaWQiOiJlYTFkYzc5MS0yMzEwLTQ0ZTItYTRhNy0wNTUxNTgxNTQ3NTAifQ.McPvUow_RuoZL-NY31E9WR0NyGWr8jR4Ga8eL0-Liro",
  "access_expires_at": "2026-10-29T10:39:13.069891915Z",
  "refresh_token": "rwm2ZkS50auGUIxKu9HG54u8FxTzjf6Cyy4sqg2YMps",
  "refresh_expires_at": "2026-11-28T10:24:13.069267168Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
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
  "session_id": "32765a0d-a5c3-4392-bd0f-57d9709ab557",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzNTMsImlhdCI6MTc5MzI2OTQ1MywianRpIjoiYmI0ZTcyNzMtNjE4ZC00ODBhLWI1ZTEtYWFmYTdlZmNlY2RlIiwic2lkIjoiMzI3NjVhMGQtYTVjMy00MzkyLWJkMGYtNTdkOTcwOWFiNTU3In0.gWrhThpi5b0PAOgfp8QWd-iTmb2rVgyE05edoUrSvN0",
  "access_expires_at": "2026-10-29T10:39:13.890297694Z",
  "refresh_token": "vCZwffuIqdI-HRYuHzSKxk_le9bf82yutjWiRFOdAso",
  "refresh_expires_at": "2026-10-29T22:24:13.889728236Z",
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
  "session_id": "cdb271fd-d56d-40fa-a8eb-7784927263d6",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzNTQsImlhdCI6MTc5MzI2OTQ1NCwianRpIjoiNTNhYjNhZmItODRkOS00ZTQ2LWE4NWQtYWY1MTEyYmJiZGFhIiwic2lkIjoiY2RiMjcxZmQtZDU2ZC00MGZhLWE4ZWItNzc4NDkyNzI2M2Q2In0.NU9L_qzsi9x5FL3evbcr6hSpKVQOSh_sL7lX64aI1mQ",
  "access_expires_at": "2026-10-29T10:39:14.449417244Z",
  "refresh_token": "PgcoZyBtviDOnyAOFkgmc-LUflHwi6JzwMjBSIMOZQU",
  "refresh_expires_at": "2026-10-29T22:24:14.448802091Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "55ece3d9-c9fe-4dbe-b1c5-360bed215d14",
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
  "id": "95bb8a51-7429-4abb-9899-8dd359a8411e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:15.001374Z",
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
  "command_id": "878fb969-aaac-4105-b0d4-d832cd7e67f4",
  "quote_id": "95bb8a51-7429-4abb-9899-8dd359a8411e",
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
  "id": "fbd821df-29d9-4956-8adf-e711f0d1bc1e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6",
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
  "created_at": "2026-10-29T10:24:15.283998Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fbd821df-29d9-4956-8adf-e711f0d1bc1e` → **200**

```json
{
  "id": "fbd821df-29d9-4956-8adf-e711f0d1bc1e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6",
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
  "created_at": "2026-10-29T10:24:15.283998Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fbd821df-29d9-4956-8adf-e711f0d1bc1e/cancel` → **200**

```json
{
  "command_id": "82b6e1c0-9a35-402a-ada5-5444031341d7",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "fbd821df-29d9-4956-8adf-e711f0d1bc1e",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6",
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
  "created_at": "2026-10-29T10:24:15.283998Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "fb979993-ff3f-4e6f-83e0-cba38307e815",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:16Z",
    "sequence": 1793269456443
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "969c91a9-8515-41b7-9a82-0786f57f3c95",
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
  "last_heartbeat_at": "2026-10-29T10:24:16.463212Z",
  "last_location_at": "2026-10-29T10:24:16.463212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23225"
}
```

```json
{
  "challenge_id": "a8a98f18-7f41-4d60-81be-e9cfa3eda194",
  "expires_at": "2026-10-29T10:29:16.729866725Z",
  "resend_available_at": "2026-10-29T10:24:17.729866725Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "533066",
  "sent_at": "2026-10-29T10:24:16.732524297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8a98f18-7f41-4d60-81be-e9cfa3eda194",
  "code": "533066",
  "device_ref": "sandbox-23225"
}
```

```json
{
  "session_id": "7d33bcfe-71e6-462e-9e07-86aaaa8de4ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDM1NywiaWF0IjoxNzkzMjY5NDU3LCJqdGkiOiIxOTk3ZmI0NC1lMDc1LTQ0ZjUtODQzMy1mMmUzNTE4M2RiMmYiLCJzaWQiOiI3ZDMzYmNmZS03MWU2LTQ2MmUtOWUwNy04NmFhYWE4ZGU0ZWUifQ.tYWGJL88Ze4yVnpaSa8yTJ_541BsU7GHBWYpd8OiJd8",
  "access_expires_at": "2026-10-29T10:39:17.028093658Z",
  "refresh_token": "rH3RwUoUZ8PfQVLl0WFuiP0HVvwt9x0i_Bt0Qsw7u9s",
  "refresh_expires_at": "2026-11-28T10:24:17.027380196Z",
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
  "command_id": "25c222af-2eb7-4b3f-8e8d-6483120477d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:17Z",
    "sequence": 1793269457553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:17.573279Z",
  "last_location_at": "2026-10-29T10:24:17.573279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed77075c-40d8-4ee4-9508-b223a2ee8488",
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
  "id": "a02fe222-98e4-4fc7-9017-d4b19702668b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:17.850717Z",
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
  "command_id": "c769e96b-c115-4ecd-b0cc-7617dc360d6b",
  "quote_id": "a02fe222-98e4-4fc7-9017-d4b19702668b",
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
  "id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6",
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
  "created_at": "2026-10-29T10:24:18.135021Z",
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
    "id": "0b6cc135-2118-4173-be90-eaf4f93aaf96",
    "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
    "expires_at": "2026-10-29T10:24:33.138918Z",
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

`POST /api/driver/v1/offers/0b6cc135-2118-4173-be90-eaf4f93aaf96/accept` → **200**

```json
{
  "command_id": "0dc29a51-3e34-4289-96d7-5433d0deb2d9"
}
```

```json
{
  "id": "0b3d0338-a070-4417-abab-bf7ffb66afb5",
  "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36ed4c06-ce44-4e5a-80a8-2e577ab52859",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "36ed4c06-ce44-4e5a-80a8-2e577ab52859",
  "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "assignment_id": "0b3d0338-a070-4417-abab-bf7ffb66afb5",
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

`POST /api/driver/v1/trips/36ed4c06-ce44-4e5a-80a8-2e577ab52859/cancel` → **200**

```json
{
  "command_id": "ec7adf9c-ca32-4180-b560-343bb842c267",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "36ed4c06-ce44-4e5a-80a8-2e577ab52859",
  "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "assignment_id": "0b3d0338-a070-4417-abab-bf7ffb66afb5",
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

`GET /api/rider/v1/orders/442ec988-291a-47f2-9c84-1bf14e642cea` → **200**

```json
{
  "id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6",
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
    "id": "0b3d0338-a070-4417-abab-bf7ffb66afb5",
    "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "36ed4c06-ce44-4e5a-80a8-2e577ab52859",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T10:24:18.135021Z",
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
    "id": "0e5c4ae6-2306-419a-a78a-5841c3de0566",
    "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
    "expires_at": "2026-10-29T10:24:34.267088Z",
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

`POST /api/driver/v1/offers/0e5c4ae6-2306-419a-a78a-5841c3de0566/accept` → **200**

```json
{
  "command_id": "87ac4199-66a1-4c44-b1cb-075764666b78"
}
```

```json
{
  "id": "b50f93e5-6bf7-433e-a066-64b127c54a3f",
  "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d9e1525d-0e13-46d1-9d95-e7b7a3afad50",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d9e1525d-0e13-46d1-9d95-e7b7a3afad50",
  "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "assignment_id": "b50f93e5-6bf7-433e-a066-64b127c54a3f",
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

`POST /api/driver/v1/trips/d9e1525d-0e13-46d1-9d95-e7b7a3afad50/cancel` → **200**

```json
{
  "command_id": "1f2662b9-174d-49bd-a9c8-aece0ffe683a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "d9e1525d-0e13-46d1-9d95-e7b7a3afad50",
  "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
  "assignment_id": "b50f93e5-6bf7-433e-a066-64b127c54a3f",
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
    "id": "442ec988-291a-47f2-9c84-1bf14e642cea",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T10:24:18.135021Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "fbd821df-29d9-4956-8adf-e711f0d1bc1e",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T10:24:15.283998Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/442ec988-291a-47f2-9c84-1bf14e642cea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:24:18.135657Z",
      "actor": {
        "type": "CLIENT",
        "id": "1f1f91e3-f008-412a-af3c-16a26b68b6b6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
        "quote_id": "a02fe222-98e4-4fc7-9017-d4b19702668b",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "025b766b-1c03-4ed0-93db-b4bfacb5b62c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:24:18.137961Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
        "attempt_id": "001e0d2c-420c-4b36-a746-d5ba25fe64d3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "025b766b-1c03-4ed0-93db-b4bfacb5b62c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:24:18.147193Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0b6cc135-2118-4173-be90-eaf4f93aaf96",
        "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "025b766b-1c03-4ed0-93db-b4bfacb5b62c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T10:24:18.708097Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0b6cc135-2118-4173-be90-eaf4f93aaf96",
        "order_id": "442ec988-291a-47f2-9c84-1bf14e642cea",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0b3d0338-a070-4417-abab-bf7ffb66afb5"
      },
      "correlation_id": "cac189b4-ff3c-4aa6-91dc-646d89bdbb3c"
```

Done: orders fbd821df-29d9-4956-8adf-e711f0d1bc1e, 442ec988-291a-47f2-9c84-1bf14e642cea.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737583119",
  "device_ref": "sandbox-15416"
}
```

```json
{
  "challenge_id": "b0df4b95-484f-475e-9777-9c1a99ac9afc",
  "expires_at": "2026-10-29T10:29:21.558884557Z",
  "resend_available_at": "2026-10-29T10:24:22.558884557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737583119` → **200**

```json
{
  "phone": "+380737583119",
  "audience": "CLIENT",
  "code": "038666",
  "sent_at": "2026-10-29T10:24:21.561682671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0df4b95-484f-475e-9777-9c1a99ac9afc",
  "code": "038666",
  "device_ref": "sandbox-15416"
}
```

```json
{
  "session_id": "87903131-b49f-49bb-a295-9a3ce3502e8c",
  "subject": {
    "type": "CLIENT",
    "id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNWZjMjZlZC01ZmRmLTQ1NTUtOGQ4OS1lOTFlOWY5N2NmN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzYxLCJpYXQiOjE3OTMyNjk0NjEsImp0aSI6IjVjNzYzZGNiLThlYmUtNDYyNC1hZDE5LWRkM2JlMGNlMjg3ZSIsInNpZCI6Ijg3OTAzMTMxLWI0OWYtNDliYi1hMjk1LTlhM2NlMzUwMmU4YyJ9.NUE3hb6HKjxAqo31NmsgQ7Kx8KFk7-ZkzqDS5q1rzl0",
  "access_expires_at": "2026-10-29T10:39:21.860147972Z",
  "refresh_token": "WAYAHBJaao-dK3_ouQaQBLCofU7z_sX9vzkHfnhy1vk",
  "refresh_expires_at": "2026-11-28T10:24:21.859611857Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "777aaa4b-2069-45f4-bdd8-897384908d0a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f62253d0-67a7-4d27-a521-db2c85042f14",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f62253d0-67a7-4d27-a521-db2c85042f14",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b8a81d78dee222665696030aea6c61c2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f62253d0-67a7-4d27-a521-db2c85042f14",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737583119"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f62253d0-67a7-4d27-a521-db2c85042f14",
  "expires_at": "2026-10-29T10:54:22.139777Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/f62253d0-67a7-4d27-a521-db2c85042f14` → **200**

```json
{
  "id": "f62253d0-67a7-4d27-a521-db2c85042f14",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:54:22.139777Z",
  "card": {
    "id": "75bf1706-8e47-4c82-afa3-61b78c841e04",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3513",
    "card_type": "Visa",
    "created_at": "2026-10-29T10:24:22.419009Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "75bf1706-8e47-4c82-afa3-61b78c841e04",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3513",
      "card_type": "Visa",
      "created_at": "2026-10-29T10:24:22.419009Z"
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
  "device_ref": "sandbox-30917"
}
```

```json
{
  "challenge_id": "ddecacc0-411e-4230-91b1-5e2ceb0e6da4",
  "expires_at": "2026-10-29T10:29:22.973925326Z",
  "resend_available_at": "2026-10-29T10:24:23.973925326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "892533",
  "sent_at": "2026-10-29T10:24:22.97705358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddecacc0-411e-4230-91b1-5e2ceb0e6da4",
  "code": "892533",
  "device_ref": "sandbox-30917"
}
```

```json
{
  "session_id": "fb6bb7d8-f6ed-469c-93d3-a2b4ea2e5932",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDM2MywiaWF0IjoxNzkzMjY5NDYzLCJqdGkiOiI5NWQ1MDUyNC0zYTYwLTRmZjItOTI0MS1hYTQ2OWQ3Y2M4YmYiLCJzaWQiOiJmYjZiYjdkOC1mNmVkLTQ2OWMtOTNkMy1hMmI0ZWEyZTU5MzIifQ.7FjGdGiKxMH-v46ZFTdboRaGmGuotMQ8Gmaq3uzkjhQ",
  "access_expires_at": "2026-10-29T10:39:23.279997495Z",
  "refresh_token": "NZc1yrqxLx8vWW6WTLhaQisf09Ri4-mr_GW3IiHnnJ8",
  "refresh_expires_at": "2026-11-28T10:24:23.279404854Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:17.573279Z",
  "last_location_at": "2026-10-29T10:24:17.573279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/997a3c79-c4a8-4e3b-8b27-a65870d8c88b/handover` → **200**

```json
{
  "command_id": "094ef821-7d6d-4277-bf4b-f4f3f22bf99d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:17.573279Z",
  "last_location_at": "2026-10-29T10:24:17.573279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/997a3c79-c4a8-4e3b-8b27-a65870d8c88b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:24Z",
    "sequence": 1793269464116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:24.135671Z",
  "last_location_at": "2026-10-29T10:24:24.135671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19915aa4-6cf2-4f58-8e8d-2e8e25daff07",
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
  "id": "f41a2181-9905-40cf-a11d-4ec2a9ac5fcf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:24.424292Z",
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
  "command_id": "818b5a92-881b-4564-adb9-5509e74a910d",
  "quote_id": "f41a2181-9905-40cf-a11d-4ec2a9ac5fcf",
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
  "id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
  "created_at": "2026-10-29T10:24:24.713324Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773` → **200**

```json
{
  "id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
  "created_at": "2026-10-29T10:24:24.713324Z",
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
    "id": "c2c3e133-6f76-470e-8699-642a28ed686f",
    "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
    "expires_at": "2026-10-29T10:24:39.987567Z",
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

`POST /api/driver/v1/offers/c2c3e133-6f76-470e-8699-642a28ed686f/accept` → **200**

```json
{
  "command_id": "6e729e51-7a6c-445b-85c1-1cd05d567c71"
}
```

```json
{
  "id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "assignment_id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
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

`POST /api/driver/v1/work-sessions/997a3c79-c4a8-4e3b-8b27-a65870d8c88b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:26Z",
    "sequence": 1793269466973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:26.116386Z",
  "last_location_at": "2026-10-29T10:24:26.116386Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/591e1c23-2afa-4b13-86c1-e3723c25fe68/arrive` → **200**

```json
{
  "command_id": "09fd81fd-2469-4835-a588-fac41d1dc331",
  "expected_version": 0
}
```

```json
{
  "id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "assignment_id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
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
  "arrived_at": "2026-10-29T10:24:26.402529Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/591e1c23-2afa-4b13-86c1-e3723c25fe68/start` → **200**

```json
{
  "command_id": "0699a22d-db29-4b4f-9db6-68f2fd261ae8",
  "expected_version": 1
}
```

```json
{
  "id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "assignment_id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
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
  "arrived_at": "2026-10-29T10:24:26.402529Z",
  "started_at": "2026-10-29T10:24:26.685085Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/591e1c23-2afa-4b13-86c1-e3723c25fe68/complete` → **200**

```json
{
  "command_id": "dd53293c-17a3-4b96-b1b2-48808172646f",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:24:26Z",
  "cash_received": true
}
```

```json
{
  "id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "assignment_id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
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
  "arrived_at": "2026-10-29T10:24:26.402529Z",
  "started_at": "2026-10-29T10:24:26.685085Z",
  "completed_at": "2026-10-29T10:24:26.976755Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773` → **200**

```json
{
  "id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
    "id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
    "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:24:24.713324Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773` → **200**

```json
{
  "id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
    "id": "02ae0f34-592c-48cb-b8fd-bef83394f6cc",
    "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "591e1c23-2afa-4b13-86c1-e3723c25fe68",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:24:24.713324Z",
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

`GET /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773/tip` → **200**

```json
{
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
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
  "available_until": "2026-10-30T10:24:26.976755Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773/tip` → **201**

```json
{
  "command_id": "26a151c0-aa34-44c3-91e5-d79a2aa3e86a",
  "amount_minor": 2500
}
```

```json
{
  "id": "bf1fefda-404a-4167-b24e-e0e2cc8ea7f3",
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T10:24:29.387353Z"
}
```

`GET /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773/tip` → **200**

```json
{
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
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
  "available_until": "2026-10-30T10:24:26.976755Z",
  "open": false,
  "tip": {
    "id": "bf1fefda-404a-4167-b24e-e0e2cc8ea7f3",
    "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T10:24:29.387353Z"
  }
}
```

`GET /api/rider/v1/orders/406572cd-dc4e-4777-b99a-fafe28544773/tip` → **200**

```json
{
  "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
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
  "available_until": "2026-10-30T10:24:26.976755Z",
  "open": false,
  "tip": {
    "id": "bf1fefda-404a-4167-b24e-e0e2cc8ea7f3",
    "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T10:24:29.387353Z"
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
      "id": "ea5fbb05-107f-4f26-a263-0aa9b2edb156",
      "at": "2026-10-29T10:24:31.104679Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
      "counterpart_id": null
    },
    {
      "id": "14aef45a-9e4a-4ce6-b2b6-68e3ee8b3df9",
      "at": "2026-10-29T10:24:27.049271Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3832099-9443-491e-881f-611a1a078ae7",
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
  "id": "302ecad2-3d5c-412b-a042-831ecaffba70",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:31.502191Z",
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
  "session_id": "04d8e22c-67e6-4b7d-9f76-fdfa0eff5310",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzNzIsImlhdCI6MTc5MzI2OTQ3MiwianRpIjoiZTI4ZTAzM2YtY2U3ZC00MDZmLWEzYWMtZThmNDUwMmZlMDJjIiwic2lkIjoiMDRkOGUyMmMtNjdlNi00YjdkLTlmNzYtZmRmYTBlZmY1MzEwIn0.XMdEraYnxktZVh1vGUYBfKhxkOJp-ARnUsbd8NsMDT4",
  "access_expires_at": "2026-10-29T10:39:32.084883722Z",
  "refresh_token": "D6xocKoVns6xsTrq0yQzT-jvQ6QFd2jYfRFt_5I5Bds",
  "refresh_expires_at": "2026-10-29T22:24:32.084339902Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737583119` → **200**

```json
{
  "client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c"
}
```

`POST /api/admin/v1/rider-wallets/05fc26ed-5fdf-4555-8d89-e91e9f97cf7c/top-ups` → **201**

```json
{
  "command_id": "1e2a5ad1-f04d-4a94-9ace-7fe88d9304b5",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
      "id": "6d8bb812-6ca0-4d2f-aa55-e907e37a2292",
      "at": "2026-10-29T10:24:32.621735Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "26673d09-84ba-440b-8dc1-055c427cae5b",
  "quote_id": "302ecad2-3d5c-412b-a042-831ecaffba70",
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
  "id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
  "created_at": "2026-10-29T10:24:32.904395Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e69afbc0-1891-4f6d-a18c-25f9d21507cd` → **200**

```json
{
  "id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
  "created_at": "2026-10-29T10:24:32.904395Z",
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
    "id": "a1c7933a-eb08-4d50-8c43-236777261681",
    "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
    "expires_at": "2026-10-29T10:24:47.909653Z",
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

`POST /api/driver/v1/offers/a1c7933a-eb08-4d50-8c43-236777261681/accept` → **200**

```json
{
  "command_id": "36d93e25-d459-43b5-bc0d-9fa0a74726a5"
}
```

```json
{
  "id": "ac5d31e9-bdac-4f35-8b30-b7995ae96189",
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ec6d327-c2b2-4ae2-8169-b50d016fa9d5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ec6d327-c2b2-4ae2-8169-b50d016fa9d5",
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "assignment_id": "ac5d31e9-bdac-4f35-8b30-b7995ae96189",
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

`POST /api/driver/v1/work-sessions/997a3c79-c4a8-4e3b-8b27-a65870d8c88b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:34Z",
    "sequence": 1793269474308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:34.328205Z",
  "last_location_at": "2026-10-29T10:24:34.328205Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3ec6d327-c2b2-4ae2-8169-b50d016fa9d5/arrive` → **200**

```json
{
  "command_id": "78dbe075-680b-4da0-8af1-1dc41e63a289",
  "expected_version": 0
}
```

```json
{
  "id": "3ec6d327-c2b2-4ae2-8169-b50d016fa9d5",
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "assignment_id": "ac5d31e9-bdac-4f35-8b30-b7995ae96189",
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
  "arrived_at": "2026-10-29T10:24:34.608887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3ec6d327-c2b2-4ae2-8169-b50d016fa9d5/start` → **200**

```json
{
  "command_id": "1c6badc5-e8db-43b0-b23b-d12b7bbcf7d8",
  "expected_version": 1
}
```

```json
{
  "id": "3ec6d327-c2b2-4ae2-8169-b50d016fa9d5",
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "assignment_id": "ac5d31e9-bdac-4f35-8b30-b7995ae96189",
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
  "arrived_at": "2026-10-29T10:24:34.608887Z",
  "started_at": "2026-10-29T10:24:34.893657Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3ec6d327-c2b2-4ae2-8169-b50d016fa9d5/complete` → **200**

```json
{
  "command_id": "f0351e86-e815-4bb6-a89e-1b5b7ed4fec9",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:24:35Z",
  "cash_received": true
}
```

```json
{
  "id": "3ec6d327-c2b2-4ae2-8169-b50d016fa9d5",
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "assignment_id": "ac5d31e9-bdac-4f35-8b30-b7995ae96189",
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
  "arrived_at": "2026-10-29T10:24:34.608887Z",
  "started_at": "2026-10-29T10:24:34.893657Z",
  "completed_at": "2026-10-29T10:24:35.191353Z",
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
  "client_id": "05fc26ed-5fdf-4555-8d89-e91e9f97cf7c",
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
      "id": "6d8bb812-6ca0-4d2f-aa55-e907e37a2292",
      "at": "2026-10-29T10:24:32.621735Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
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

`GET /api/rider/v1/orders/e69afbc0-1891-4f6d-a18c-25f9d21507cd/tip` → **200**

```json
{
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
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
  "available_until": "2026-10-30T10:24:35.191353Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e69afbc0-1891-4f6d-a18c-25f9d21507cd/tip` → **201**

```json
{
  "command_id": "f0e375e2-a9e3-45ed-9de7-4fb8b390c215",
  "amount_minor": 2500
}
```

```json
{
  "id": "be491860-d9ce-4f1a-b2f6-22f4215aa3a5",
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T10:24:36.300489Z"
}
```

`GET /api/rider/v1/orders/e69afbc0-1891-4f6d-a18c-25f9d21507cd/tip` → **200**

```json
{
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
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
  "available_until": "2026-10-30T10:24:35.191353Z",
  "open": false,
  "tip": {
    "id": "be491860-d9ce-4f1a-b2f6-22f4215aa3a5",
    "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T10:24:36.300489Z"
  }
}
```

`GET /api/rider/v1/orders/e69afbc0-1891-4f6d-a18c-25f9d21507cd/tip` → **200**

```json
{
  "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
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
  "available_until": "2026-10-30T10:24:35.191353Z",
  "open": false,
  "tip": {
    "id": "be491860-d9ce-4f1a-b2f6-22f4215aa3a5",
    "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T10:24:36.300489Z"
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
      "id": "5e6a9808-f19c-4ec9-9083-fac5867c5339",
      "at": "2026-10-29T10:24:36.147165Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
      "counterpart_id": null
    },
    {
      "id": "ea5fbb05-107f-4f26-a263-0aa9b2edb156",
      "at": "2026-10-29T10:24:31.104679Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
      "counterpart_id": null
    },
    {
      "id": "14aef45a-9e4a-4ce6-b2b6-68e3ee8b3df9",
      "at": "2026-10-29T10:24:27.049271Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
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
      "id": "60f5fdec-e576-4f9b-b3c7-302fe82f4492",
      "at": "2026-10-29T10:24:38.16992Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
      "counterpart_id": null
    },
    {
      "id": "5e6a9808-f19c-4ec9-9083-fac5867c5339",
      "at": "2026-10-29T10:24:36.147165Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e69afbc0-1891-4f6d-a18c-25f9d21507cd",
      "counterpart_id": null
    },
    {
      "id": "ea5fbb05-107f-4f26-a263-0aa9b2edb156",
      "at": "2026-10-29T10:24:31.104679Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
      "counterpart_id": null
    },
    {
      "id": "14aef45a-9e4a-4ce6-b2b6-68e3ee8b3df9",
      "at": "2026-10-29T10:24:27.049271Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "406572cd-dc4e-4777-b99a-fafe28544773",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "997a3c79-c4a8-4e3b-8b27-a65870d8c88b",
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
  "last_heartbeat_at": "2026-10-29T10:24:34.328205Z",
  "last_location_at": "2026-10-29T10:24:34.328205Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/997a3c79-c4a8-4e3b-8b27-a65870d8c88b/close` → **200**

```json
{
  "command_id": "8359fe17-f246-48de-9588-748726e8199f",
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

Done: card order e69afbc0-1891-4f6d-a18c-25f9d21507cd.

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
  "phone": "+380731001232",
  "device_ref": "sandbox-25698"
}
```

```json
{
  "challenge_id": "1e027211-c08c-4aaa-9cc4-989c7975b353",
  "expires_at": "2026-10-29T10:29:40.559475667Z",
  "resend_available_at": "2026-10-29T10:24:41.559475667Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731001232` → **200**

```json
{
  "phone": "+380731001232",
  "audience": "CLIENT",
  "code": "240413",
  "sent_at": "2026-10-29T10:24:40.561672065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e027211-c08c-4aaa-9cc4-989c7975b353",
  "code": "240413",
  "device_ref": "sandbox-25698"
}
```

```json
{
  "session_id": "1d63c2ef-40c2-4e45-ac79-ea6f4e47a7d0",
  "subject": {
    "type": "CLIENT",
    "id": "4efdb716-7d42-4835-a532-34b6615fd61e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWZkYjcxNi03ZDQyLTQ4MzUtYTUzMi0zNGI2NjE1ZmQ2MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzgwLCJpYXQiOjE3OTMyNjk0ODAsImp0aSI6IjkyMGUwOTU5LTIwYzktNDU3ZS05ZDgwLTU2OTM3YzU3ZmU4NyIsInNpZCI6IjFkNjNjMmVmLTQwYzItNGU0NS1hYzc5LWVhNmY0ZTQ3YTdkMCJ9.iVWu1mstmJlc6p1-n1lLHGml3LFAfqVoHiP1BfzpOn4",
  "access_expires_at": "2026-10-29T10:39:40.865992502Z",
  "refresh_token": "rhBT83x94jgWwLW6DpiR4cgVkYIWs_8gCD5cZ5EsYZs",
  "refresh_expires_at": "2026-11-28T10:24:40.865332124Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c6e51705-6064-40c9-a41b-bd6e04964dfc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "3dfa648c-ad5d-4f1b-b7ec-9f9513fc417b",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3dfa648c-ad5d-4f1b-b7ec-9f9513fc417b",
    "orderDate": "1793269481",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "68377aefa242510c9af8fc8a06c7d11b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3dfa648c-ad5d-4f1b-b7ec-9f9513fc417b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731001232"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3dfa648c-ad5d-4f1b-b7ec-9f9513fc417b",
  "created_at": "2026-10-29T10:24:41.145999Z",
  "expires_at": "2026-10-29T10:54:41.145999Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/3dfa648c-ad5d-4f1b-b7ec-9f9513fc417b` → **200**

```json
{
  "id": "3dfa648c-ad5d-4f1b-b7ec-9f9513fc417b",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T10:24:41.145999Z",
  "expires_at": "2026-10-29T10:54:41.145999Z",
  "completed_at": "2026-10-29T10:24:41.419906Z",
  "masked_pan": "41****4448",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4efdb716-7d42-4835-a532-34b6615fd61e",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4efdb716-7d42-4835-a532-34b6615fd61e",
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
      "id": "0488e766-42aa-47a6-a630-55ad8912e5b6",
      "at": "2026-10-29T10:24:42.188032Z",
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
  "client_id": "4efdb716-7d42-4835-a532-34b6615fd61e",
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
      "id": "0488e766-42aa-47a6-a630-55ad8912e5b6",
      "at": "2026-10-29T10:24:42.188032Z",
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
  "device_ref": "sandbox-3473"
}
```

```json
{
  "challenge_id": "7b74a43c-b0c2-46bc-bf62-47b145fe0bbd",
  "expires_at": "2026-10-29T10:29:43.532460874Z",
  "resend_available_at": "2026-10-29T10:24:44.532460874Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "214753",
  "sent_at": "2026-10-29T10:24:43.534779982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b74a43c-b0c2-46bc-bf62-47b145fe0bbd",
  "code": "214753",
  "device_ref": "sandbox-3473"
}
```

```json
{
  "session_id": "64b0e0f9-5fa1-4a88-afd9-ebc768214a14",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDM4MywiaWF0IjoxNzkzMjY5NDgzLCJqdGkiOiJmMmI3MTM0Zi01N2Q2LTRmNzctODY1OC04ZjI5NGZiYzYwZWIiLCJzaWQiOiI2NGIwZTBmOS01ZmExLTRhODgtYWZkOS1lYmM3NjgyMTRhMTQifQ.IsyGN55salmV4BVeukJdQ4p4dEb73mAfC4EpY_ujcg0",
  "access_expires_at": "2026-10-29T10:39:43.837633649Z",
  "refresh_token": "qU3c-aGG6NbBIlT4xY7OaUfLiOY0WilqCoIyN2KKHAQ",
  "refresh_expires_at": "2026-11-28T10:24:43.837064713Z",
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
  "command_id": "c1532362-3cc0-48b4-a661-a22f8c008432",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "daf5166d-788b-47d5-982f-9dc748ddb32e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-daf5166d-788b-47d5-982f-9dc748ddb32e",
    "orderDate": "1793269484",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "367b477703e97d3c86be1cd8c46cfaa7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=daf5166d-788b-47d5-982f-9dc748ddb32e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=daf5166d-788b-47d5-982f-9dc748ddb32e",
  "created_at": "2026-10-29T10:24:44.377138Z",
  "expires_at": "2026-10-29T10:54:44.377138Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/daf5166d-788b-47d5-982f-9dc748ddb32e` → **200**

```json
{
  "id": "daf5166d-788b-47d5-982f-9dc748ddb32e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T10:24:44.377138Z",
  "expires_at": "2026-10-29T10:54:44.377138Z",
  "completed_at": "2026-10-29T10:24:44.647034Z",
  "masked_pan": "41****5625",
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
      "id": "e16dd3b6-d704-4d5d-a9c0-5e40a2eeff6f",
      "at": "2026-10-29T10:24:45.195038Z",
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
  "command_id": "559a4a83-3055-422b-b3e1-42000f4396dd",
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
  "correlation_id": "7f006133-3e5a-4b5a-98ed-3807b1d0fcf4"
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
  "device_ref": "sandbox-31598"
}
```

```json
{
  "challenge_id": "adcb3a92-1bb0-47aa-a49d-0c4566a377d1",
  "expires_at": "2026-10-29T10:29:46.754682932Z",
  "resend_available_at": "2026-10-29T10:24:47.754682932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "617908",
  "sent_at": "2026-10-29T10:24:46.757282595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adcb3a92-1bb0-47aa-a49d-0c4566a377d1",
  "code": "617908",
  "device_ref": "sandbox-31598"
}
```

```json
{
  "session_id": "7b809041-ace1-45b0-b26b-6e1416d1356f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDM4NywiaWF0IjoxNzkzMjY5NDg3LCJqdGkiOiI5MmEwZWM1ZS0yNWQ2LTQ2OTgtYjQ2Zi04MTI1MjE4N2JiYzkiLCJzaWQiOiI3YjgwOTA0MS1hY2UxLTQ1YjAtYjI2Yi02ZTE0MTZkMTM1NmYifQ.8xwngA8uQhreHVV22ZFjzkZxb02Nl148FVYnQpOTWKA",
  "access_expires_at": "2026-10-29T10:39:47.049772911Z",
  "refresh_token": "IzJgYuFY7qSAwOd_UaEJaxX5uIrNi_znL73jX9otDOo",
  "refresh_expires_at": "2026-11-28T10:24:47.049173899Z",
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
  "command_id": "53563987-5911-43d5-a2b5-ca464c115f47",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:47Z",
    "sequence": 1793269487569
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "588c3f12-bc0f-42ae-8f9d-9a400a19bd3a",
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
  "last_heartbeat_at": "2026-10-29T10:24:47.588967Z",
  "last_location_at": "2026-10-29T10:24:47.588967Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631837559",
  "device_ref": "sandbox-13375"
}
```

```json
{
  "challenge_id": "e1ef4ec3-1849-423e-bcb6-3f1804fbba6c",
  "expires_at": "2026-10-29T10:29:47.868577141Z",
  "resend_available_at": "2026-10-29T10:24:48.868577141Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631837559` → **200**

```json
{
  "phone": "+380631837559",
  "audience": "CLIENT",
  "code": "463707",
  "sent_at": "2026-10-29T10:24:47.871038483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1ef4ec3-1849-423e-bcb6-3f1804fbba6c",
  "code": "463707",
  "device_ref": "sandbox-13375"
}
```

```json
{
  "session_id": "6c6bb2a0-3e7b-4ea4-a427-759100873edb",
  "subject": {
    "type": "CLIENT",
    "id": "0a93ebad-3ee9-4719-ad7e-a6d8da695f61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTkzZWJhZC0zZWU5LTQ3MTktYWQ3ZS1hNmQ4ZGE2OTVmNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzg4LCJpYXQiOjE3OTMyNjk0ODgsImp0aSI6IjM5YjE3YzFiLWY2ZjYtNGY4Ni05ODRhLTRlNDFjZmNmMDk3NSIsInNpZCI6IjZjNmJiMmEwLTNlN2ItNGVhNC1hNDI3LTc1OTEwMDg3M2VkYiJ9.FyoQhc0Jgmf1wWeqGqq4Nebqu3t47PC_FmiuL60KI34",
  "access_expires_at": "2026-10-29T10:39:48.169158348Z",
  "refresh_token": "JeluGxF69yV_1xZF98ixaF7qEU2xWEU6494A2gsJUKs",
  "refresh_expires_at": "2026-11-28T10:24:48.168624717Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e5099dfb-5ce1-46ad-a23f-100c4a9a9466",
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
  "id": "1b217c8f-f97b-4e5d-8476-d994990c7588",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:48.442345Z",
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
  "command_id": "c84c3adb-6439-4e3a-80f2-2cd06a59f92b",
  "quote_id": "1b217c8f-f97b-4e5d-8476-d994990c7588",
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
  "id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0a93ebad-3ee9-4719-ad7e-a6d8da695f61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:24:48.723783Z",
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
    "id": "1e10f290-c8cc-4ca3-b02b-fc135296f6a2",
    "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
    "expires_at": "2026-10-29T10:25:03.72692Z",
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

`POST /api/driver/v1/offers/1e10f290-c8cc-4ca3-b02b-fc135296f6a2/accept` → **200**

```json
{
  "command_id": "27e2f705-53e8-42b2-90c3-fe0f2fd1f60f"
}
```

```json
{
  "id": "59c5634c-cd8d-4026-a95d-dbc1306bc140",
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0dd1278e-a364-41ab-83c2-8877fac2ab10",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0dd1278e-a364-41ab-83c2-8877fac2ab10",
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "assignment_id": "59c5634c-cd8d-4026-a95d-dbc1306bc140",
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

`POST /api/driver/v1/work-sessions/588c3f12-bc0f-42ae-8f9d-9a400a19bd3a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:24:49Z",
    "sequence": 1793269489839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "588c3f12-bc0f-42ae-8f9d-9a400a19bd3a",
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
  "last_heartbeat_at": "2026-10-29T10:24:49.858307Z",
  "last_location_at": "2026-10-29T10:24:49.858307Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0dd1278e-a364-41ab-83c2-8877fac2ab10/arrive` → **200**

```json
{
  "command_id": "060564ad-b6a1-43c9-a57c-63c899be9980",
  "expected_version": 0
}
```

```json
{
  "id": "0dd1278e-a364-41ab-83c2-8877fac2ab10",
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "assignment_id": "59c5634c-cd8d-4026-a95d-dbc1306bc140",
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
  "arrived_at": "2026-10-29T10:24:50.138623Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0dd1278e-a364-41ab-83c2-8877fac2ab10/start` → **200**

```json
{
  "command_id": "63917fe5-2c30-4bcc-8e71-cabe3d784c5c",
  "expected_version": 1
}
```

```json
{
  "id": "0dd1278e-a364-41ab-83c2-8877fac2ab10",
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "assignment_id": "59c5634c-cd8d-4026-a95d-dbc1306bc140",
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
  "arrived_at": "2026-10-29T10:24:50.138623Z",
  "started_at": "2026-10-29T10:24:50.435119Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0dd1278e-a364-41ab-83c2-8877fac2ab10/complete` → **200**

```json
{
  "command_id": "a559ee98-af96-467a-afe9-ff5bf66b6f1a",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:24:50Z",
  "cash_received": false
}
```

```json
{
  "id": "0dd1278e-a364-41ab-83c2-8877fac2ab10",
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "assignment_id": "59c5634c-cd8d-4026-a95d-dbc1306bc140",
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
  "arrived_at": "2026-10-29T10:24:50.138623Z",
  "started_at": "2026-10-29T10:24:50.435119Z",
  "completed_at": "2026-10-29T10:24:50.719531Z",
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
  "session_id": "d94d32fb-859a-4d36-9dbd-f905df76c597",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzOTEsImlhdCI6MTc5MzI2OTQ5MSwianRpIjoiNTBjYjIzMDQtNWE4OS00NmM2LWEzZWItNDdiNmNlZjE1OTg0Iiwic2lkIjoiZDk0ZDMyZmItODU5YS00ZDM2LTlkYmQtZjkwNWRmNzZjNTk3In0.ZWKwRnTLiyjmafigGrxnB3P3KGeBtkcSGP7kqwnX-Pc",
  "access_expires_at": "2026-10-29T10:39:51.294672595Z",
  "refresh_token": "-81bJBMXqo34D42aXGKiPk2fRgPorvnile3n6D3jk30",
  "refresh_expires_at": "2026-10-29T22:24:51.294197654Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/15299fd2-75d5-4068-b66d-c2dfac064d6f/cash-dispute` → **200**

```json
{
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "0a93ebad-3ee9-4719-ad7e-a6d8da695f61",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T10:24:51.251766Z",
  "decide_by": "2026-11-12T10:24:51.251766Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T10:24:51.251766Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "0a93ebad-3ee9-4719-ad7e-a6d8da695f61",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T10:24:51.251766Z",
      "decide_by": "2026-11-12T10:24:51.251766Z",
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

`POST /api/admin/v1/orders/15299fd2-75d5-4068-b66d-c2dfac064d6f/cash-dispute/decide` → **400**

```json
{
  "command_id": "c7fb5609-08e9-4427-9019-c07cb5fc44f7",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/15299fd2-75d5-4068-b66d-c2dfac064d6f/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bb5a794f-5d95-453a-96b2-0f52e7c8f76b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/15299fd2-75d5-4068-b66d-c2dfac064d6f/cash-dispute/decide` → **200**

```json
{
  "command_id": "b562956f-ac0d-41fd-b3ba-6f17f75ec2bd",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "0a93ebad-3ee9-4719-ad7e-a6d8da695f61",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T10:24:51.251766Z",
  "decide_by": "2026-11-12T10:24:51.251766Z",
  "decision": "PAY_DRIVER",
  "decided_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T10:24:52.435969Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/15299fd2-75d5-4068-b66d-c2dfac064d6f/cash-dispute/decide` → **409**

```json
{
  "command_id": "afff386c-2687-4d7e-8075-1ce980ac40ae",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/15299fd2-75d5-4068-b66d-c2dfac064d6f/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a6b22968-66e6-410d-9f4b-2597e7194c87"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "588c3f12-bc0f-42ae-8f9d-9a400a19bd3a",
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
  "last_heartbeat_at": "2026-10-29T10:24:49.858307Z",
  "last_location_at": "2026-10-29T10:24:49.858307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/588c3f12-bc0f-42ae-8f9d-9a400a19bd3a/close` → **200**

```json
{
  "command_id": "471aaa16-196a-4192-a5b3-347dd04f3775",
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
  "session_id": "04cf414a-85d1-4e82-98fc-52c839c49502",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzAzOTMsImlhdCI6MTc5MzI2OTQ5MywianRpIjoiMDk5ZmU0NDctYjZmYi00MzYxLWI2YmYtNWUwMmM2YzQ2YTc0Iiwic2lkIjoiMDRjZjQxNGEtODVkMS00ZTgyLTk4ZmMtNTJjODM5YzQ5NTAyIn0.xIj-SfYnxCU7-R35buJ1pIbhkJYw_GPqih2MhUpGcJI",
  "access_expires_at": "2026-10-29T10:39:53.836424478Z",
  "refresh_token": "uaZpT3cCrgHd8ztX6Cu-KS_0XeTX2j3Q3OBz1INnT-A",
  "refresh_expires_at": "2026-10-29T22:24:53.835923239Z",
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
  "phone": "+48600475996",
  "device_ref": "sandbox-18752"
}
```

```json
{
  "challenge_id": "02ea5a50-06af-4291-87fb-5488d9ecdc8a",
  "expires_at": "2026-10-29T10:29:54.656730814Z",
  "resend_available_at": "2026-10-29T10:24:55.656730814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600475996` → **200**

```json
{
  "phone": "+48600475996",
  "audience": "CLIENT",
  "code": "897519",
  "sent_at": "2026-10-29T10:24:54.659545615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02ea5a50-06af-4291-87fb-5488d9ecdc8a",
  "code": "897519",
  "device_ref": "sandbox-18752"
}
```

```json
{
  "session_id": "6b2cd43f-18ca-4f76-9088-63cfad716929",
  "subject": {
    "type": "CLIENT",
    "id": "f5856491-171a-4c5f-8535-cd794f36e557"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTg1NjQ5MS0xNzFhLTRjNWYtODUzNS1jZDc5NGYzNmU1NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwMzk0LCJpYXQiOjE3OTMyNjk0OTQsImp0aSI6ImM1ODQ1NWRiLWM3OTUtNGY0MS05ZDNjLWI3OWQ2YmMyMjk4ZiIsInNpZCI6IjZiMmNkNDNmLTE4Y2EtNGY3Ni05MDg4LTYzY2ZhZDcxNjkyOSJ9.GnUJLlXm-cook5dOvR0z-yFjMPGnET5u8kb1soCDvNs",
  "access_expires_at": "2026-10-29T10:39:54.951852861Z",
  "refresh_token": "mCXA_WOyKTASgNhZO8FrSZX9zytuUGgrHUh6jEkwMPw",
  "refresh_expires_at": "2026-11-28T10:24:54.951173708Z",
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
  "command_id": "927606fa-4137-439a-8007-b7ffd91dcf91",
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
  "correlation_id": "80beba2e-75d7-40e8-be6c-f49c8a9dbb45",
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
  "command_id": "51e7bc13-823a-46c2-b52a-df2dbe9815d5",
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
  "paused_at": "2026-10-29T10:24:56.065908459Z",
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
  "command_id": "1b89d047-d788-44ae-a125-c37c75ec774a",
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
  "id": "7f2cf60c-4b40-4c5c-97c4-a15bf433c5d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:56.626082Z",
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
  "command_id": "9788f271-21f3-4697-80e7-45f888dbfd52",
  "quote_id": "7f2cf60c-4b40-4c5c-97c4-a15bf433c5d5",
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
  "correlation_id": "1f7ff2e9-c84b-4746-a55f-4dbed85bbf9d"
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
  "paused_at": "2026-10-29T10:24:56.065908Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "d9c7e1c9-a20a-4bde-8150-321ed2ee9590",
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
  "command_id": "74f1a72e-f76b-4c79-8532-e747d0cf4950",
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
  "command_id": "34efd63f-1b9d-48f0-8ca2-7b3d0a052276",
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
  "id": "e0cec1a8-24ea-467c-bc34-84eb0cb82665",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:58.280461Z",
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
  "command_id": "7dd86d0d-90ef-497a-bf8c-19291c4b91b8",
  "quote_id": "e0cec1a8-24ea-467c-bc34-84eb0cb82665",
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
  "correlation_id": "79340916-7843-4f67-a8eb-3f71d9da6540"
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
  "command_id": "72176066-a48c-42b6-8fd5-151bcfb947f1",
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
      "from": "13:00",
      "to": "14:00"
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
      "from": "13:00",
      "to": "14:00"
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
  "command_id": "261f132b-4793-4a0b-b575-c70b1d4893f2",
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
  "id": "0440ebc9-9a43-460a-af5b-953546ef0ce2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:29:59.414564Z",
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
  "command_id": "98aa2746-09a7-4a00-a7b8-31aa5c23b1fc",
  "quote_id": "0440ebc9-9a43-460a-af5b-953546ef0ce2",
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
  "correlation_id": "da1580d6-6e27-412e-9a8e-276b918afe3a"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "969b94f4-2322-46ed-9aae-de0686e66ec6",
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
  "correlation_id": "6a16fc56-12b0-4f7b-a325-5b66b9bb05e5"
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
      "from": "13:00",
      "to": "14:00"
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
  "command_id": "7b3c068d-3640-43fe-9e78-cc25a3f8e99b",
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
  "phone": "+380672152217",
  "device_ref": "sandbox-32721"
}
```

```json
{
  "challenge_id": "62273a94-d5e0-40a6-a20c-ba5c944a976a",
  "expires_at": "2026-10-29T10:30:00.834878876Z",
  "resend_available_at": "2026-10-29T10:25:01.834878876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672152217` → **200**

```json
{
  "phone": "+380672152217",
  "audience": "CLIENT",
  "code": "427264",
  "sent_at": "2026-10-29T10:25:00.836819574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62273a94-d5e0-40a6-a20c-ba5c944a976a",
  "code": "427264",
  "device_ref": "sandbox-32721"
}
```

```json
{
  "session_id": "b8fbfe4f-bba5-4c28-bf67-a7a7acb925f1",
  "subject": {
    "type": "CLIENT",
    "id": "30247e0c-506c-4823-b273-2541fbf50877"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDI0N2UwYy01MDZjLTQ4MjMtYjI3My0yNTQxZmJmNTA4NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDAxLCJpYXQiOjE3OTMyNjk1MDEsImp0aSI6ImExNjAyZWQ2LWNhYTItNGU2MS04MmYzLTI5MzdkZmYxMmUyMCIsInNpZCI6ImI4ZmJmZTRmLWJiYTUtNGMyOC1iZjY3LWE3YTdhY2I5MjVmMSJ9.Ia0YSo4vw4JVMwG2_JC5O1yVIFEJXlLheH2c90eddSs",
  "access_expires_at": "2026-10-29T10:40:01.140907231Z",
  "refresh_token": "sk8Gvmc-LQ68qV5ucRT-FPSpdjP20p8CvK4oawzrQqI",
  "refresh_expires_at": "2026-11-28T10:25:01.140391905Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "30247e0c-506c-4823-b273-2541fbf50877",
  "session_id": "b8fbfe4f-bba5-4c28-bf67-a7a7acb925f1",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3e7913e-8365-42be-baef-d21e219c40be",
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
  "id": "f46793cc-bc50-47c3-99df-b2b0995793d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:30:01.682035Z",
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
  "challenge_id": "6ae211e7-ed90-4f1b-9712-46de6a6af389",
  "expires_at": "2026-10-29T10:30:03.97217333Z",
  "resend_available_at": "2026-10-29T10:25:04.97217333Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672152217` → **200**

```json
{
  "phone": "+380672152217",
  "audience": "CLIENT",
  "code": "218180",
  "sent_at": "2026-10-29T10:25:03.974102833Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "9d2c175b-d15c-407d-8b63-97a3dffb5ce4",
  "challenge_id": "6ae211e7-ed90-4f1b-9712-46de6a6af389",
  "otp_code": "218180"
}
```

```json
{
  "client_id": "30247e0c-506c-4823-b273-2541fbf50877",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T10:25:04.276604448Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a318cc87-c423-4a5f-9e42-0b0178a55d97",
  "quote_id": "f46793cc-bc50-47c3-99df-b2b0995793d4",
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
  "correlation_id": "01db4c83-7ef3-404d-b59f-2b025ccea5a4"
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
  "session_id": "e5a89125-36f0-4a10-bc3b-6d2e6bb5c145",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MDUsImlhdCI6MTc5MzI2OTUwNSwianRpIjoiNTE0OTk0MDMtYjFlOC00ZDdiLTgyOGMtMjQ1NmVhMDAyMTRiIiwic2lkIjoiZTVhODkxMjUtMzZmMC00YTEwLWJjM2ItNmQyZTZiYjVjMTQ1In0.J5JngqrZ40KeIU6Ati0DrD-GZxCWd3VNuHvPjWN9zys",
  "access_expires_at": "2026-10-29T10:40:05.114288216Z",
  "refresh_token": "_zaw9weDT82miglcTE5VP5t6dN4bAwzDmlG-hvc77pU",
  "refresh_expires_at": "2026-10-29T22:25:05.113761299Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "30247e0c-506c-4823-b273-2541fbf50877",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T10:25:04.276604Z",
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

`POST /api/admin/v1/client-deletions/30247e0c-506c-4823-b273-2541fbf50877/complete` → **200**

```json
{
  "command_id": "86ee18cf-6e9f-4bad-9aba-e3223a153d8d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "30247e0c-506c-4823-b273-2541fbf50877",
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
  "correlation_id": "10e2fc7e-2b7d-41d7-80af-ed48c4f339e9"
}
```

Done: client 30247e0c-506c-4823-b273-2541fbf50877 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661903554",
  "device_ref": "sandbox-2789"
}
```

```json
{
  "challenge_id": "245d806b-3e92-4654-8706-36b65f2562b0",
  "expires_at": "2026-10-29T10:30:06.2408697Z",
  "resend_available_at": "2026-10-29T10:25:07.2408697Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661903554` → **200**

```json
{
  "phone": "+380661903554",
  "audience": "CLIENT",
  "code": "602705",
  "sent_at": "2026-10-29T10:25:06.243504132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "245d806b-3e92-4654-8706-36b65f2562b0",
  "code": "602705",
  "device_ref": "sandbox-2789"
}
```

```json
{
  "session_id": "6ee16bd2-95b5-4981-97d1-20c901066c2a",
  "subject": {
    "type": "CLIENT",
    "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjgzM2MxOC1mMjRhLTQ2ZDktOGE0OS0xZTVmMDg1MTNiMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDA2LCJpYXQiOjE3OTMyNjk1MDYsImp0aSI6ImMyOWVlMzM1LWJlMDktNDVkMS04OTE2LTQ3MWI3ZTY3ZjhjNyIsInNpZCI6IjZlZTE2YmQyLTk1YjUtNDk4MS05N2QxLTIwYzkwMTA2NmMyYSJ9.F_Z_kwxHv7JemcDKwJdXphLcQKNhOE7uj-SQ36IzavA",
  "access_expires_at": "2026-10-29T10:40:06.537530987Z",
  "refresh_token": "JVBg_jRAkd2wrsPX7uLnaEbi-2bKko0quq-n6_itet8",
  "refresh_expires_at": "2026-11-28T10:25:06.53702069Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
  "session_id": "6ee16bd2-95b5-4981-97d1-20c901066c2a",
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
  "session_id": "e59bcb82-0d6c-41f3-a32f-50a83db0c5e7",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MDcsImlhdCI6MTc5MzI2OTUwNywianRpIjoiNTViYjhhN2UtMmYyZS00Y2UyLWFlNGUtM2FkNDMyZjNjYmUwIiwic2lkIjoiZTU5YmNiODItMGQ2Yy00MWYzLWEzMmYtNTBhODNkYjBjNWU3In0.qvmJq01WY9viC4TTPsKxqujPRZcKo3aJtHBXxQxciE0",
  "access_expires_at": "2026-10-29T10:40:07.350901602Z",
  "refresh_token": "U5zTTtZXmMEK1tKlQHKfPV1AeDXIFvmGvQsjSRcO-xc",
  "refresh_expires_at": "2026-10-29T22:25:07.350387468Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1903554&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
      "phone": "+380661903554",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T10:25:06.535226Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9f833c18-f24a-46d9-8a49-1e5f08513b1c` → **200**

```json
{
  "client": {
    "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
    "phone": "+380661903554",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T10:25:06.535226Z",
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

`POST /api/admin/v1/clients/9f833c18-f24a-46d9-8a49-1e5f08513b1c/block` → **400**

```json
{
  "command_id": "a929a954-d1e3-4c11-b144-b2d6f8e2d6ef",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9f833c18-f24a-46d9-8a49-1e5f08513b1c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "685f40d1-6b64-441f-a1d5-932526de096e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9f833c18-f24a-46d9-8a49-1e5f08513b1c/block` → **200**

```json
{
  "command_id": "54717e85-69f1-4f73-bf97-e2bc68e356a3",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
  "phone": "+380661903554",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T10:25:06.535226Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T10:25:08.500648Z",
    "by": "2fe58b65-8b31-4a74-9377-49085caf9e73"
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
  "correlation_id": "b59366ed-c9fd-4d49-9157-7ece9466984a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661903554",
  "device_ref": "sandbox-30973"
}
```

```json
{
  "challenge_id": "0ac8b3be-6e5b-452d-9cff-08bbf18f96be",
  "expires_at": "2026-10-29T10:30:11.055161902Z",
  "resend_available_at": "2026-10-29T10:25:12.055161902Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661903554` → **200**

```json
{
  "phone": "+380661903554",
  "audience": "CLIENT",
  "code": "894995",
  "sent_at": "2026-10-29T10:25:11.057227891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0ac8b3be-6e5b-452d-9cff-08bbf18f96be",
  "code": "894995",
  "device_ref": "sandbox-30973"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "5e2139a3-4d79-4f1a-acd6-6ee642cfde5d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9f833c18-f24a-46d9-8a49-1e5f08513b1c` → **200**

```json
{
  "client": {
    "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
    "phone": "+380661903554",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T10:25:06.535226Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T10:25:08.500648Z",
      "by": "2fe58b65-8b31-4a74-9377-49085caf9e73"
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

`POST /api/admin/v1/clients/9f833c18-f24a-46d9-8a49-1e5f08513b1c/unblock` → **200**

```json
{
  "command_id": "54d15e34-c587-49a8-9b29-a581a7f8c648",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
  "phone": "+380661903554",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T10:25:06.535226Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661903554",
  "device_ref": "sandbox-7352"
}
```

```json
{
  "challenge_id": "fd1afc6c-4b32-46ae-b477-41b7f6c21ecc",
  "expires_at": "2026-10-29T10:30:14.214661517Z",
  "resend_available_at": "2026-10-29T10:25:15.214661517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661903554` → **200**

```json
{
  "phone": "+380661903554",
  "audience": "CLIENT",
  "code": "739073",
  "sent_at": "2026-10-29T10:25:14.217074175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd1afc6c-4b32-46ae-b477-41b7f6c21ecc",
  "code": "739073",
  "device_ref": "sandbox-7352"
}
```

```json
{
  "session_id": "2232b32b-4bd3-4b15-aada-4149cb5cd21c",
  "subject": {
    "type": "CLIENT",
    "id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjgzM2MxOC1mMjRhLTQ2ZDktOGE0OS0xZTVmMDg1MTNiMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDE0LCJpYXQiOjE3OTMyNjk1MTQsImp0aSI6IjQ5MTQxYmYyLWZlZWItNDhhMC05ZjhlLTYzOGE4OTlhNmY2YSIsInNpZCI6IjIyMzJiMzJiLTRiZDMtNGIxNS1hYWRhLTQxNDljYjVjZDIxYyJ9.gwnom1G7HDEsfHxyHuVI4t5EZkKXPnpEAp7Zqhtn4UE",
  "access_expires_at": "2026-10-29T10:40:14.510768403Z",
  "refresh_token": "wwBFwyLM4LgUip70xHB1RzyNW6TYeBM1dQLNbbY-k6c",
  "refresh_expires_at": "2026-11-28T10:25:14.510239782Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9f833c18-f24a-46d9-8a49-1e5f08513b1c",
  "session_id": "2232b32b-4bd3-4b15-aada-4149cb5cd21c",
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
  "phone": "+380665856709",
  "device_ref": "sandbox-29316"
}
```

```json
{
  "challenge_id": "7f9c9f99-884f-4d1c-a540-b2c4e460b210",
  "expires_at": "2026-10-29T10:30:15.05588235Z",
  "resend_available_at": "2026-10-29T10:25:16.05588235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665856709` → **200**

```json
{
  "phone": "+380665856709",
  "audience": "CLIENT",
  "code": "730771",
  "sent_at": "2026-10-29T10:25:15.058047644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f9c9f99-884f-4d1c-a540-b2c4e460b210",
  "code": "730771",
  "device_ref": "sandbox-29316"
}
```

```json
{
  "session_id": "51fb4e14-64d6-48ba-b4f0-ddb6fa5f421f",
  "subject": {
    "type": "CLIENT",
    "id": "38503532-d0a7-45d8-b919-d297cf1e6783"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODUwMzUzMi1kMGE3LTQ1ZDgtYjkxOS1kMjk3Y2YxZTY3ODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDE1LCJpYXQiOjE3OTMyNjk1MTUsImp0aSI6IjI5ZTEzNjQ4LThmN2YtNGMwZS04NzUyLWYxNWU0NmViM2ZiNCIsInNpZCI6IjUxZmI0ZTE0LTY0ZDYtNDhiYS1iNGYwLWRkYjZmYTVmNDIxZiJ9.uRjJht34udvrkOq4Z0aWlHIMIBzvalHVguYxtJjC7hw",
  "access_expires_at": "2026-10-29T10:40:15.35116029Z",
  "refresh_token": "JjQjI60xms7mYEEfVTiCrF9R12wYitHxBQffNgSavAM",
  "refresh_expires_at": "2026-11-28T10:25:15.350633052Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3881cef6-5226-4eed-bc00-1879d777a611",
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
  "id": "5de1797f-906f-4c44-a0e8-69ec676d118d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:30:15.626617Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: da51cd62-d7ec-44cc-9cc5-3eef21dec469) → **201**

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
  "session_id": "37cda218-61c8-4032-ada4-f2c5652ef563",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MTYsImlhdCI6MTc5MzI2OTUxNiwianRpIjoiNGY4ZmZkMWUtZmQ0Ni00MGRhLTk5ZjctYjQxMDE1NGU3MmVmIiwic2lkIjoiMzdjZGEyMTgtNjFjOC00MDMyLWFkYTQtZjJjNTY1MmVmNTYzIn0.tMtZ2mz3Xq8J0cVoalYxBFC-OzhIq2glQ7ZmQ74uDHw",
  "access_expires_at": "2026-10-29T10:40:16.245384919Z",
  "refresh_token": "gtIIX31oh5gf8PhmP_zvwZetcySCuZEygiJ-wJVFmQM",
  "refresh_expires_at": "2026-10-29T22:25:16.244907944Z",
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
  "session_id": "14eb36eb-bfac-4770-86db-e35db5f493d6",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MTYsImlhdCI6MTc5MzI2OTUxNiwianRpIjoiOTFmYjU4NjktZDc4My00OTljLWE4YzItNTJmNGZjOGZkNGIzIiwic2lkIjoiMTRlYjM2ZWItYmZhYy00NzcwLTg2ZGItZTM1ZGI1ZjQ5M2Q2In0.WO-PG4oeACAA27TMegjsJcTcl12c3tmt1ojNVFoGBAU",
  "access_expires_at": "2026-10-29T10:40:16.80539327Z",
  "refresh_token": "IJ738yyH7NbjdJbqpxDpZQ-aIyOsKd9hrZvitaOfbCA",
  "refresh_expires_at": "2026-10-29T22:25:16.804909934Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/65d43fc6-05ab-43ec-9687-16a2c96b9608/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:25:15.921126Z",
      "actor": {
        "type": "CLIENT",
        "id": "38503532-d0a7-45d8-b919-d297cf1e6783",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
        "quote_id": "5de1797f-906f-4c44-a0e8-69ec676d118d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "da51cd62-d7ec-44cc-9cc5-3eef21dec469"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:25:15.922978Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
        "attempt_id": "30bfaca9-e5f3-4fa6-a2fb-8f064df231a4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "da51cd62-d7ec-44cc-9cc5-3eef21dec469"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T10:25:15.929577Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
        "attempt_id": "30bfaca9-e5f3-4fa6-a2fb-8f064df231a4"
      },
      "correlation_id": "da51cd62-d7ec-44cc-9cc5-3eef21dec469"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "30bfaca9-e5f3-4fa6-a2fb-8f064df231a4",
        "generation": 1,
        "started_at": "2026-10-29T10:25:15.922061Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T10:25:15.929577Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T10:25:15.923719Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/da51cd62-d7ec-44cc-9cc5-3eef21dec469` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "65d43fc6-05ab-43ec-9687-16a2c96b9608:0",
      "order_id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
      "at": "2026-10-29T10:25:15.921126Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "65d43fc6-05ab-43ec-9687-16a2c96b9608:1",
      "order_id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
      "at": "2026-10-29T10:25:15.922978Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "65d43fc6-05ab-43ec-9687-16a2c96b9608:2",
      "order_id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
      "at": "2026-10-29T10:25:15.929577Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/330ebf6c-4f73-4b01-bbb1-8ce6412bc830` → **200**

```json
{
  "found": []
}
```

Done: request da51cd62-d7ec-44cc-9cc5-3eef21dec469 — order 65d43fc6-05ab-43ec-9687-16a2c96b9608 found by its id.

`GET /api/rider/v1/orders/65d43fc6-05ab-43ec-9687-16a2c96b9608` → **200**

```json
{
  "id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38503532-d0a7-45d8-b919-d297cf1e6783",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:25:15.920641Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/65d43fc6-05ab-43ec-9687-16a2c96b9608/cancel` → **200**

```json
{
  "command_id": "3fd9f538-a432-4086-b470-d02ea562fe2e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "65d43fc6-05ab-43ec-9687-16a2c96b9608",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "38503532-d0a7-45d8-b919-d297cf1e6783",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:25:15.920641Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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
  "phone": "+380634746847",
  "device_ref": "sandbox-19981"
}
```

```json
{
  "challenge_id": "11173342-b68a-47f8-a9dc-16fbecd59a77",
  "expires_at": "2026-10-29T10:30:18.482140825Z",
  "resend_available_at": "2026-10-29T10:25:19.482140825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634746847` → **200**

```json
{
  "phone": "+380634746847",
  "audience": "CLIENT",
  "code": "282976",
  "sent_at": "2026-10-29T10:25:18.484328521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11173342-b68a-47f8-a9dc-16fbecd59a77",
  "code": "282976",
  "device_ref": "sandbox-19981"
}
```

```json
{
  "session_id": "54877f76-1e7b-45f5-8de9-1e3b6e710ae3",
  "subject": {
    "type": "CLIENT",
    "id": "64792842-2fdc-41da-8f80-a5479d561f0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDc5Mjg0Mi0yZmRjLTQxZGEtOGY4MC1hNTQ3OWQ1NjFmMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDE4LCJpYXQiOjE3OTMyNjk1MTgsImp0aSI6ImFmNTgzZDUyLWJjZGItNDdhOC1hMDY4LWFiMjEyMDAyNTgyYyIsInNpZCI6IjU0ODc3Zjc2LTFlN2ItNDVmNS04ZGU5LTFlM2I2ZTcxMGFlMyJ9.86N5s0vSCyads4yFuk1B54Hbe5mproi_Q0k4XGJv4AY",
  "access_expires_at": "2026-10-29T10:40:18.776638538Z",
  "refresh_token": "GaBFXKMXkaCqT9Np2NhqPbvnCGVIBSX6qjnPD26UnAY",
  "refresh_expires_at": "2026-11-28T10:25:18.776142689Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "188a092b-1e4c-4590-8c3f-1ee9d5c653f1",
  "expires_at": "2026-10-29T10:30:21.044966793Z",
  "resend_available_at": "2026-10-29T10:25:22.044966793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634746847` → **200**

```json
{
  "phone": "+380634746847",
  "audience": "CLIENT",
  "code": "654220",
  "sent_at": "2026-10-29T10:25:21.047089376Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "c8ee1788-0f11-407f-acd9-4b4bce03d506",
  "challenge_id": "188a092b-1e4c-4590-8c3f-1ee9d5c653f1",
  "otp_code": "654220"
}
```

```json
{
  "id": "ff0211cb-ef42-4aad-aac0-f04dd4a657d5",
  "state": "PENDING",
  "created_at": "2026-10-29T10:25:21.341062Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/ff0211cb-ef42-4aad-aac0-f04dd4a657d5` → **200**

```json
{
  "id": "ff0211cb-ef42-4aad-aac0-f04dd4a657d5",
  "state": "PENDING",
  "created_at": "2026-10-29T10:25:21.341062Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ff0211cb-ef42-4aad-aac0-f04dd4a657d5` → **200**

```json
{
  "id": "ff0211cb-ef42-4aad-aac0-f04dd4a657d5",
  "state": "PENDING",
  "created_at": "2026-10-29T10:25:21.341062Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ff0211cb-ef42-4aad-aac0-f04dd4a657d5` → **200**

```json
{
  "id": "ff0211cb-ef42-4aad-aac0-f04dd4a657d5",
  "state": "READY",
  "created_at": "2026-10-29T10:25:21.341062Z",
  "ready_at": "2026-10-29T10:25:23.531429Z",
  "expires_at": "2026-11-05T10:25:23.531429Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/ff0211cb-ef42-4aad-aac0-f04dd4a657d5/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636331919",
  "device_ref": "sandbox-16208"
}
```

```json
{
  "challenge_id": "363ae5da-334e-463c-a35f-54b2bda8b68c",
  "expires_at": "2026-10-29T10:30:24.432190013Z",
  "resend_available_at": "2026-10-29T10:25:25.432190013Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636331919` → **200**

```json
{
  "phone": "+380636331919",
  "audience": "CLIENT",
  "code": "066238",
  "sent_at": "2026-10-29T10:25:24.434353789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "363ae5da-334e-463c-a35f-54b2bda8b68c",
  "code": "066238",
  "device_ref": "sandbox-16208"
}
```

```json
{
  "session_id": "30c0dcaa-070a-4db4-8259-549ce76cea0b",
  "subject": {
    "type": "CLIENT",
    "id": "1dc9680c-9de5-4ab0-bb08-57a5cb2b9022"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZGM5NjgwYy05ZGU1LTRhYjAtYmIwOC01N2E1Y2IyYjkwMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDI0LCJpYXQiOjE3OTMyNjk1MjQsImp0aSI6IjM3ZDdkNTE1LWNmN2QtNDQ1Ni1hMjU1LWViZjEzYmMxZjM2OSIsInNpZCI6IjMwYzBkY2FhLTA3MGEtNGRiNC04MjU5LTU0OWNlNzZjZWEwYiJ9.ffmgA0R0eF8UcQwfMFxVdYJeXqbQeBW-ERPtjQDO_9Y",
  "access_expires_at": "2026-10-29T10:40:24.724868202Z",
  "refresh_token": "6YTUMvGzovsZ-bwWPOJ2-n8AeL7Q2ur2wcJj7pALKwk",
  "refresh_expires_at": "2026-11-28T10:25:24.72429343Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/ff0211cb-ef42-4aad-aac0-f04dd4a657d5/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/ff0211cb-ef42-4aad-aac0-f04dd4a657d5/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "869dc7e6-e31c-4544-8963-eb420996b6fd"
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
  "session_id": "c7eabc57-d8b3-4cb4-adf7-bca8c2346ea8",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MjUsImlhdCI6MTc5MzI2OTUyNSwianRpIjoiY2QwNTZlYmMtY2NjNy00ZGFhLWI5ZDktYzg5MWViZWQ3MmM2Iiwic2lkIjoiYzdlYWJjNTctZDhiMy00Y2I0LWFkZjctYmNhOGMyMzQ2ZWE4In0.WGIJww9FIPLN67K7VGtm2jPOhe8wvZdODqjSOnoilSk",
  "access_expires_at": "2026-10-29T10:40:25.546792795Z",
  "refresh_token": "FKk4_HXO38GwvtNfSb8B3k2H-e3mTaxFJ6cIx3GhSXQ",
  "refresh_expires_at": "2026-10-29T22:25:25.546241341Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "64792842-2fdc-41da-8f80-a5479d561f0a",
  "session_id": "54877f76-1e7b-45f5-8de9-1e3b6e710ae3",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/64792842-2fdc-41da-8f80-a5479d561f0a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "ff0211cb-ef42-4aad-aac0-f04dd4a657d5",
      "state": "READY",
      "created_at": "2026-10-29T10:25:21.341062Z",
      "ready_at": "2026-10-29T10:25:23.531429Z",
      "expires_at": "2026-11-05T10:25:23.531429Z",
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
  "device_ref": "sandbox-6059"
}
```

```json
{
  "challenge_id": "56d1342d-5ba4-4027-91ad-5f9b1272a123",
  "expires_at": "2026-10-29T10:30:26.362766142Z",
  "resend_available_at": "2026-10-29T10:25:27.362766142Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "303485",
  "sent_at": "2026-10-29T10:25:26.365324988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56d1342d-5ba4-4027-91ad-5f9b1272a123",
  "code": "303485",
  "device_ref": "sandbox-6059"
}
```

```json
{
  "session_id": "b9961b98-df59-4027-ae05-d3a5b09a3c91",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQyNiwiaWF0IjoxNzkzMjY5NTI2LCJqdGkiOiJkZDMzNDRiMi05M2VmLTRlYjUtYTExOS1mOWQzNWQ0YWQ5MDYiLCJzaWQiOiJiOTk2MWI5OC1kZjU5LTQwMjctYWUwNS1kM2E1YjA5YTNjOTEifQ.uPb9CquHZ3gWvffQlbSX5gCr4DWb7i-VOf0PQTH4h8o",
  "access_expires_at": "2026-10-29T10:40:26.657020189Z",
  "refresh_token": "G7X1Yhk_ah9U_gVVcUUZJ1f5xcsOBC8nSb2I6dkYFMA",
  "refresh_expires_at": "2026-11-28T10:25:26.656489475Z",
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
  "device_ref": "sandbox-20691"
}
```

```json
{
  "challenge_id": "45eb49df-cdd2-440f-a722-c7e11233aad4",
  "expires_at": "2026-10-29T10:30:27.19836485Z",
  "resend_available_at": "2026-10-29T10:25:28.19836485Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "528657",
  "sent_at": "2026-10-29T10:25:27.200627061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45eb49df-cdd2-440f-a722-c7e11233aad4",
  "code": "528657",
  "device_ref": "sandbox-20691"
}
```

```json
{
  "session_id": "97ed63d1-e205-4e17-b882-f2092259aec4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQyNywiaWF0IjoxNzkzMjY5NTI3LCJqdGkiOiIwMDZiMDhjYS1mODY5LTQ1Y2EtOWFiNi01ZmE1Zjc2NzNkNzgiLCJzaWQiOiI5N2VkNjNkMS1lMjA1LTRlMTctYjg4Mi1mMjA5MjI1OWFlYzQifQ.-8PwMnwYCZt2W-B-iRzOmh58KFGcmvdJf3_qdZkb-tQ",
  "access_expires_at": "2026-10-29T10:40:27.491142009Z",
  "refresh_token": "EX0YB2uW9XKPQL0v9xDK5XbvoP-PVggVLdD3IngUhBg",
  "refresh_expires_at": "2026-11-28T10:25:27.490616334Z",
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
  "command_id": "c41871b8-8e97-4bee-a09c-ce297d9ac249",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:25:28Z",
    "sequence": 1793269528187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7aacbc53-476e-43f4-9ad4-5363f0bbf855",
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
  "last_heartbeat_at": "2026-10-29T10:25:28.037022Z",
  "last_location_at": "2026-10-29T10:25:28.037022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8560"
}
```

```json
{
  "challenge_id": "33a0ad0a-a028-4e69-8c8d-8f42559ee8c8",
  "expires_at": "2026-10-29T10:30:28.305788148Z",
  "resend_available_at": "2026-10-29T10:25:29.305788148Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "219481",
  "sent_at": "2026-10-29T10:25:28.307895333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33a0ad0a-a028-4e69-8c8d-8f42559ee8c8",
  "code": "219481",
  "device_ref": "sandbox-8560"
}
```

```json
{
  "session_id": "fa4aea0d-3f89-4d7e-8db0-64056b1c5327",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQyOCwiaWF0IjoxNzkzMjY5NTI4LCJqdGkiOiIzZDQ5NTUyZS0zYTQ3LTQzYzktODEwZS00MmIyZTgzNTQ4MjIiLCJzaWQiOiJmYTRhZWEwZC0zZjg5LTRkN2UtOGRiMC02NDA1NmIxYzUzMjcifQ.5JsxCP3i4qgjzhqK2XA6yMyzbNrrIVGpfwNJpt6RSnc",
  "access_expires_at": "2026-10-29T10:40:28.600324325Z",
  "refresh_token": "_BFe3UEcQz72qBEjNKIVNQ2W_eZHipZMF3nlTES0qiE",
  "refresh_expires_at": "2026-11-28T10:25:28.599802428Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "969c91a9-8515-41b7-9a82-0786f57f3c95",
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
  "last_heartbeat_at": "2026-10-29T10:24:16.463212Z",
  "last_location_at": "2026-10-29T10:24:16.463212Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/969c91a9-8515-41b7-9a82-0786f57f3c95/handover` → **200**

```json
{
  "command_id": "6850fb1c-1c2b-461a-849b-ca4ee95b6ce6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "969c91a9-8515-41b7-9a82-0786f57f3c95",
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
  "last_heartbeat_at": "2026-10-29T10:24:16.463212Z",
  "last_location_at": "2026-10-29T10:24:16.463212Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/969c91a9-8515-41b7-9a82-0786f57f3c95/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:25:29Z",
    "sequence": 1793269529433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "969c91a9-8515-41b7-9a82-0786f57f3c95",
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
  "last_heartbeat_at": "2026-10-29T10:25:29.451767Z",
  "last_location_at": "2026-10-29T10:25:29.451767Z",
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
  "session_id": "e498dc45-b3f5-4ffb-87cd-ea91c20cf5df",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MzAsImlhdCI6MTc5MzI2OTUzMCwianRpIjoiNzEyYThkNWQtOTQwZS00ZWFhLWFiYmEtY2Y5ODY2MDRhZWQwIiwic2lkIjoiZTQ5OGRjNDUtYjNmNS00ZmZiLTg3Y2QtZWE5MWMyMGNmNWRmIn0.AtR6v-mwibg3XMULAYB4-bNCooBNxWZdUXZFZhZXPyg",
  "access_expires_at": "2026-10-29T10:40:30.010048967Z",
  "refresh_token": "fGE4EopRBFPSSj_m7UYdocupitWLRW8DNId6pOcioJI",
  "refresh_expires_at": "2026-10-29T22:25:30.009467697Z",
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
  "session_id": "5ba47249-51ae-4aef-adc0-849e5fb943cd",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MzAsImlhdCI6MTc5MzI2OTUzMCwianRpIjoiZmFkMWRkM2EtODQ1Ni00NmQ2LWE0ZWMtOTMyY2YxZDQ1N2VhIiwic2lkIjoiNWJhNDcyNDktNTFhZS00YWVmLWFkYzAtODQ5ZTVmYjk0M2NkIn0.QRxHBIk32-wRPcoTa86HacFr6kBNaVQoZkQmVVdgY-s",
  "access_expires_at": "2026-10-29T10:40:30.566518849Z",
  "refresh_token": "CN67hteG8J1qPvmqh9pAJqyvJXNHixVYv96HgQroKlc",
  "refresh_expires_at": "2026-10-29T22:25:30.565932445Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688004711",
  "device_ref": "sandbox-11627"
}
```

```json
{
  "challenge_id": "72bf1605-e1dd-4c70-8507-ca9dcdf29ab5",
  "expires_at": "2026-10-29T10:30:30.833511016Z",
  "resend_available_at": "2026-10-29T10:25:31.833511016Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688004711` → **200**

```json
{
  "phone": "+380688004711",
  "audience": "CLIENT",
  "code": "569834",
  "sent_at": "2026-10-29T10:25:30.835785029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72bf1605-e1dd-4c70-8507-ca9dcdf29ab5",
  "code": "569834",
  "device_ref": "sandbox-11627"
}
```

```json
{
  "session_id": "da703434-1ce3-438a-8639-2949a10e8784",
  "subject": {
    "type": "CLIENT",
    "id": "d6321779-5548-4725-984f-4c778bbca2c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjMyMTc3OS01NTQ4LTQ3MjUtOTg0Zi00Yzc3OGJiY2EyYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDMxLCJpYXQiOjE3OTMyNjk1MzEsImp0aSI6Ijk1ZmQxNTYxLTBkNzItNDkwNS1hNmM3LTQwNjk1N2E1ZGZiMiIsInNpZCI6ImRhNzAzNDM0LTFjZTMtNDM4YS04NjM5LTI5NDlhMTBlODc4NCJ9.wkD2pUxWVhwDxFOEhnSdBhsGnRiAfPV1x9KUp3pBaoU",
  "access_expires_at": "2026-10-29T10:40:31.152999895Z",
  "refresh_token": "9y2YJqRYeCbEHUkaAdbr85CkkgYtQpWPxzyic9uqSGI",
  "refresh_expires_at": "2026-11-28T10:25:31.152483357Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38b976cb-04d0-440a-bd49-31564d46cfeb",
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
  "id": "399551db-461c-4012-8057-3140fbbcb15e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:30:31.431134Z",
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
  "command_id": "79a0e4fc-02cb-49f2-858d-1282ba43e6ee",
  "quote_id": "399551db-461c-4012-8057-3140fbbcb15e",
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
  "id": "d42476ae-47e2-4417-bef5-536935d928e5",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d6321779-5548-4725-984f-4c778bbca2c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:25:31.723625Z",
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
    "id": "f349532b-60ae-4fff-9640-27fd5c6942d1",
    "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
    "expires_at": "2026-10-29T10:25:46.727262Z",
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

`POST /api/driver/v1/offers/f349532b-60ae-4fff-9640-27fd5c6942d1/reject` → **204**

```json
{
  "command_id": "b9532ec4-5970-4c6c-b578-ff3433ebb100"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3a7676cd-b038-42c1-b28a-a18428b49a04",
    "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
    "expires_at": "2026-10-29T10:25:47.303246Z",
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

`POST /api/driver/v1/offers/3a7676cd-b038-42c1-b28a-a18428b49a04/accept` → **200**

```json
{
  "command_id": "d5c2e9f2-987a-41d0-82b6-19eead6d3c1c"
}
```

```json
{
  "id": "752dd2d3-ba5d-41ba-ad23-f00fb7240b9b",
  "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f9806d49-826d-46e3-aab9-dfe105dbe022",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/d42476ae-47e2-4417-bef5-536935d928e5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:25:31.72412Z",
      "actor": {
        "type": "CLIENT",
        "id": "d6321779-5548-4725-984f-4c778bbca2c4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
        "quote_id": "399551db-461c-4012-8057-3140fbbcb15e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0f034f00-14f6-45cc-a645-008b2b9650cc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:25:31.726421Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
        "attempt_id": "212d2902-edff-475d-8ace-b11a632a3f11",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0f034f00-14f6-45cc-a645-008b2b9650cc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:25:31.730216Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f349532b-60ae-4fff-9640-27fd5c6942d1",
        "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "0f034f00-14f6-45cc-a645-008b2b9650cc"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T10:25:32.30236Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f349532b-60ae-4fff-9640-27fd5c6942d1",
        "order_id": "d42476ae-47e2-4417-bef5-536935d928e5"
      },
      "correlation_id": "b82c9e30-7b97-49d0-bfb9-a11f1c7853ef"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order d42476ae-47e2-4417-bef5-536935d928e5 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/d42476ae-47e2-4417-bef5-536935d928e5` → **200**

```json
{
  "id": "d42476ae-47e2-4417-bef5-536935d928e5",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d6321779-5548-4725-984f-4c778bbca2c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "752dd2d3-ba5d-41ba-ad23-f00fb7240b9b",
    "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f9806d49-826d-46e3-aab9-dfe105dbe022",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T10:25:31.723625Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d42476ae-47e2-4417-bef5-536935d928e5/cancel` → **200**

```json
{
  "command_id": "07bfbb6b-f57a-4666-8117-f4a197f1f521",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d42476ae-47e2-4417-bef5-536935d928e5",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d6321779-5548-4725-984f-4c778bbca2c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "752dd2d3-ba5d-41ba-ad23-f00fb7240b9b",
    "order_id": "d42476ae-47e2-4417-bef5-536935d928e5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f9806d49-826d-46e3-aab9-dfe105dbe022",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T10:25:31.723625Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
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
  "session_id": "7aacbc53-476e-43f4-9ad4-5363f0bbf855",
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
  "last_heartbeat_at": "2026-10-29T10:25:28.037022Z",
  "last_location_at": "2026-10-29T10:25:28.037022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7aacbc53-476e-43f4-9ad4-5363f0bbf855/close` → **200**

```json
{
  "command_id": "aae0be09-71fc-4ef9-be62-8c31ffa91aca",
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
  "session_id": "969c91a9-8515-41b7-9a82-0786f57f3c95",
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
  "last_heartbeat_at": "2026-10-29T10:25:29.451767Z",
  "last_location_at": "2026-10-29T10:25:29.451767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/969c91a9-8515-41b7-9a82-0786f57f3c95/close` → **200**

```json
{
  "command_id": "5b08943d-3af0-41ec-85bb-7bf714f103a0",
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
  "session_id": "78cd3fc1-be3b-47fe-afeb-5557ffcd454f",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0MzUsImlhdCI6MTc5MzI2OTUzNSwianRpIjoiYWYxMWRkYjMtNDU5OC00YmY4LWFkZjEtOTBkM2RlN2U1ZTQwIiwic2lkIjoiNzhjZDNmYzEtYmUzYi00N2ZlLWFmZWItNTU1N2ZmY2Q0NTRmIn0.mECu5_dgXHstRAg8Xes8Z_8HWw_dXOd0hZ1FrsFsFbI",
  "access_expires_at": "2026-10-29T10:40:35.158624753Z",
  "refresh_token": "n7XD8qD3CeqNhRBkQMs5XH8AfPuzgR9QwTa5N8gJ8eM",
  "refresh_expires_at": "2026-10-29T22:25:35.158115498Z",
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
  "command_id": "f82b764f-0817-4d93-b3a2-d1316b97c604",
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
  "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T10:25:35.710517Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "445e7a1a-b639-4d7b-8dcb-6da368909861",
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
  "correlation_id": "ec4550ac-0505-42cf-97e7-ec84a9d2fe96"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "caba42f3-4405-4c03-80b7-182cc7340abb",
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
  "correlation_id": "6106288c-5c77-49b2-bad8-a72d91b406cb"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636586855",
  "device_ref": "sandbox-10725"
}
```

```json
{
  "challenge_id": "4a504ddc-a2fc-4798-801c-5b1785770013",
  "expires_at": "2026-10-29T10:30:36.555402339Z",
  "resend_available_at": "2026-10-29T10:25:37.555402339Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636586855` → **200**

```json
{
  "phone": "+380636586855",
  "audience": "CLIENT",
  "code": "135687",
  "sent_at": "2026-10-29T10:25:36.558194555Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a504ddc-a2fc-4798-801c-5b1785770013",
  "code": "135687",
  "device_ref": "sandbox-10725"
}
```

```json
{
  "session_id": "bbb70fe1-b32a-4c87-a1ec-bab92eb8c0b0",
  "subject": {
    "type": "CLIENT",
    "id": "8bd43493-62ee-4eff-9fbb-b846878aabc6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YmQ0MzQ5My02MmVlLTRlZmYtOWZiYi1iODQ2ODc4YWFiYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDM2LCJpYXQiOjE3OTMyNjk1MzYsImp0aSI6ImI3NWI4YjI2LTczZmUtNDFkMC1iMGZmLWUxOWMyYWU4M2MwNCIsInNpZCI6ImJiYjcwZmUxLWIzMmEtNGM4Ny1hMWVjLWJhYjkyZWI4YzBiMCJ9.QKyHcmDkdHnyFeXUjZuyVHteyg3S1wQ9_-oOT_nWK4k",
  "access_expires_at": "2026-10-29T10:40:36.841617662Z",
  "refresh_token": "G786mewZDHona1c46zqThENhnJ1VjIVrMdDU34ZVKoo",
  "refresh_expires_at": "2026-11-28T10:25:36.841154504Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00f70479-a1b0-4723-9aaa-b584a6d0885e",
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
  "id": "ec82fb4b-3f60-402d-a612-e716d9da28c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:30:37.121618Z",
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
  "command_id": "db230509-aab3-4c0b-b43d-5b0556ea7a2d",
  "quote_id": "ec82fb4b-3f60-402d-a612-e716d9da28c4",
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
  "correlation_id": "1871f1e1-bc92-4db1-a617-50d071b83c6a"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6f2b196c-15e7-4063-b10e-e591c93c27b7",
  "quote_id": "ec82fb4b-3f60-402d-a612-e716d9da28c4",
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
  "id": "ab1ec1dc-7ae6-431c-9624-b891fe138e28",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8bd43493-62ee-4eff-9fbb-b846878aabc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:25:37.67234Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ab1ec1dc-7ae6-431c-9624-b891fe138e28/cancel` → **200**

```json
{
  "command_id": "61354961-6dd7-488b-a5bf-e87d98106b10",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ab1ec1dc-7ae6-431c-9624-b891fe138e28",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8bd43493-62ee-4eff-9fbb-b846878aabc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:25:37.67234Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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
  "command_id": "a316bb3e-4086-4526-b83d-2c45a7db2ed2",
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
  "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T10:25:38.29623Z"
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
      "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T10:25:38.29623Z"
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
  "device_ref": "sandbox-26715"
}
```

```json
{
  "challenge_id": "d1f9e7b7-3c9f-4568-a6ce-9b0dccb741aa",
  "expires_at": "2026-10-29T10:30:39.21296524Z",
  "resend_available_at": "2026-10-29T10:25:40.21296524Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "071408",
  "sent_at": "2026-10-29T10:25:39.215044066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1f9e7b7-3c9f-4568-a6ce-9b0dccb741aa",
  "code": "071408",
  "device_ref": "sandbox-26715"
}
```

```json
{
  "session_id": "c580712c-1474-477a-8641-9dbb5ebf38d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQzOSwiaWF0IjoxNzkzMjY5NTM5LCJqdGkiOiIzMzA3YTRiMy1mZmQ4LTQ5NjgtYTM2NC1lNzhkNzc4Y2M2YTYiLCJzaWQiOiJjNTgwNzEyYy0xNDc0LTQ3N2EtODY0MS05ZGJiNWViZjM4ZDYifQ.ldjYQJCC7gBk8gxf1_XlqMxM4h9SKZWSLve-Pv_eGDU",
  "access_expires_at": "2026-10-29T10:40:39.502890066Z",
  "refresh_token": "dHSaeAjVRkIOv5uHasM26mCtp2IfOgKu-ybrzKXFVdk",
  "refresh_expires_at": "2026-11-28T10:25:39.502315239Z",
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
  "command_id": "430283fa-e987-4f53-8e41-0edc0d199ea9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:25:40Z",
    "sequence": 1793269540294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:25:40.048519Z",
  "last_location_at": "2026-10-29T10:25:40.048519Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674093506",
  "device_ref": "sandbox-13017"
}
```

```json
{
  "challenge_id": "9595a628-014c-4a81-8a09-9c66d6e6a22b",
  "expires_at": "2026-10-29T10:30:40.316168208Z",
  "resend_available_at": "2026-10-29T10:25:41.316168208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674093506` → **200**

```json
{
  "phone": "+380674093506",
  "audience": "CLIENT",
  "code": "069423",
  "sent_at": "2026-10-29T10:25:40.318492144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9595a628-014c-4a81-8a09-9c66d6e6a22b",
  "code": "069423",
  "device_ref": "sandbox-13017"
}
```

```json
{
  "session_id": "49c437a3-afa6-4df6-9e1e-80473312a4f7",
  "subject": {
    "type": "CLIENT",
    "id": "245441a0-6567-44d7-9f34-7280f245ae92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDU0NDFhMC02NTY3LTQ0ZDctOWYzNC03MjgwZjI0NWFlOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDQwLCJpYXQiOjE3OTMyNjk1NDAsImp0aSI6IjhiZjAwZGMyLWM2N2QtNDEzOS04NjhhLWY0OWM5ZTk3MmYyMiIsInNpZCI6IjQ5YzQzN2EzLWFmYTYtNGRmNi05ZTFlLTgwNDczMzEyYTRmNyJ9.ovkF6sntnAKWANKDTR34ij8OWn_f5t_E4ZHtBqH-ZnM",
  "access_expires_at": "2026-10-29T10:40:40.618520947Z",
  "refresh_token": "pVj9KGgL8LOByIKXU6bawnqq0qqJYw1Il-KHo0-4PiE",
  "refresh_expires_at": "2026-11-28T10:25:40.617969745Z",
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
  "command_id": "2ff99444-767b-42a1-8169-2715faefbbd5",
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
  "id": "c49836aa-8c3b-4679-9855-ca1584662261",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:30:41.189075Z",
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
  "command_id": "96cf1364-df58-4479-bb5d-bc4623f5add9",
  "platform": "ANDROID",
  "token": "sandbox-driver-99ca4043-dea3-4be2-a51d-d08e63795536"
}
```

```json
{
  "id": "e4b7f3b5-97b5-4539-95b1-40473b927156",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T10:25:41.473989Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "d7512784-2cdf-4833-800f-380069655473",
  "platform": "ANDROID",
  "token": "sandbox-rider-60ce75c3-18db-40a6-88ce-af1e1105e2e3"
}
```

```json
{
  "id": "a6a6d860-4a41-41c4-8c9e-4b66a435e188",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T10:25:41.753766Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0471e521-3f43-4e52-8b94-58400e2e8bbb",
  "quote_id": "c49836aa-8c3b-4679-9855-ca1584662261",
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
  "id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "245441a0-6567-44d7-9f34-7280f245ae92",
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
  "created_at": "2026-10-29T10:25:42.034665Z",
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
    "id": "5a46c643-947e-41c2-a4bf-4e2aabc7ea64",
    "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
    "expires_at": "2026-10-29T10:25:57.037476Z",
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

`POST /api/driver/v1/offers/5a46c643-947e-41c2-a4bf-4e2aabc7ea64/accept` → **200**

```json
{
  "command_id": "0eeea9de-d403-46e1-a3f7-87644ba347f6"
}
```

```json
{
  "id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "41916045-aff2-4271-87ef-2af0699e5cb6",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T10:25:42.109Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T10:25:42.109Z` → **200**

```json
[
  {
    "at": "2026-10-29T10:25:42.898038767Z",
    "token_suffix": "795536",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "926a6d2b-59e5-4aee-b6e4-1bcbf1551c30"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674093506&after=2026-10-29T10:25:42.109Z` → **200**

```json
[
  {
    "at": "2026-10-29T10:25:43.901793438Z",
    "token_suffix": "05e2e3",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "87f71cd0-0aac-407f-88ec-7e15f66f744b"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/351e43a4-17d5-4c6c-940f-70d91fc2f048/messages` → **201**

```json
{
  "command_id": "1c8b40b2-8efe-474f-b2bc-58756c8accdb",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "509e7da5-497f-4125-a283-6dd4e4eb173a",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T10:25:43.957658685Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "41916045-aff2-4271-87ef-2af0699e5cb6",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "assignment_id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
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

`POST /api/driver/v1/trips/41916045-aff2-4271-87ef-2af0699e5cb6/messages` → **201**

```json
{
  "command_id": "1c63c523-845a-4447-b807-1e58093c7465",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "9f7cd803-1568-4d1d-bafd-0cbe33461081",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T10:25:44.484884429Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/351e43a4-17d5-4c6c-940f-70d91fc2f048/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/41916045-aff2-4271-87ef-2af0699e5cb6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674093506"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:25:45Z",
    "sequence": 1793269545276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:25:45.29457Z",
  "last_location_at": "2026-10-29T10:25:45.29457Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "41916045-aff2-4271-87ef-2af0699e5cb6",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "assignment_id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
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

`POST /api/driver/v1/trips/41916045-aff2-4271-87ef-2af0699e5cb6/arrive` → **200**

```json
{
  "command_id": "c2a5c63f-4fb1-497c-8e5e-86bb51631c38",
  "expected_version": 0
}
```

```json
{
  "id": "41916045-aff2-4271-87ef-2af0699e5cb6",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "assignment_id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
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
  "arrived_at": "2026-10-29T10:25:45.841274Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/41916045-aff2-4271-87ef-2af0699e5cb6/start` → **200**

```json
{
  "command_id": "a24a09f2-523c-4e57-807b-4d32eefcb221",
  "expected_version": 1
}
```

```json
{
  "id": "41916045-aff2-4271-87ef-2af0699e5cb6",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "assignment_id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
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
  "arrived_at": "2026-10-29T10:25:45.841274Z",
  "started_at": "2026-10-29T10:25:46.121896Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:25:46Z",
    "sequence": 1793269546392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:25:46.410095Z",
  "last_location_at": "2026-10-29T10:25:46.410095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/41916045-aff2-4271-87ef-2af0699e5cb6/complete` → **200**

```json
{
  "command_id": "b895160f-ba76-4caf-9a31-8e93c9e83f52",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:25:46Z",
  "cash_received": true
}
```

```json
{
  "id": "41916045-aff2-4271-87ef-2af0699e5cb6",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "assignment_id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
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
  "arrived_at": "2026-10-29T10:25:45.841274Z",
  "started_at": "2026-10-29T10:25:46.121896Z",
  "completed_at": "2026-10-29T10:25:46.684882Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/351e43a4-17d5-4c6c-940f-70d91fc2f048` → **200**

```json
{
  "id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "245441a0-6567-44d7-9f34-7280f245ae92",
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
    "id": "143193d4-f9a1-4012-9fa9-8a7388b0542c",
    "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "41916045-aff2-4271-87ef-2af0699e5cb6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T10:25:42.034665Z",
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
    "id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T10:25:42.034665Z",
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
    "id": "41916045-aff2-4271-87ef-2af0699e5cb6",
    "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
    "order_short_number": 12,
    "created_at": "2026-10-29T10:25:42.603075Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0dd1278e-a364-41ab-83c2-8877fac2ab10",
    "order_id": "15299fd2-75d5-4068-b66d-c2dfac064d6f",
    "order_short_number": 8,
    "created_at": "2026-10-29T10:24:49.306536Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a0ee5d39-8ae6-429c-aefd-4fc3fc633c83",
    "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
    "order_short_number": 3,
    "created_at": "2026-10-29T10:24:07.464054Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0da09970-7dc0-4e14-a791-c05a7a673366",
    "order_id": "f25f055d-d7de-49c2-9aaf-4604a3fad1f5",
    "order_short_number": 2,
    "created_at": "2026-10-29T10:23:46.362053Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "bd4a422c-5c4b-4f02-a8d5-2d8b281d58df",
    "order_id": "ff611e5c-578c-4eed-8be1-faf56630fdae",
    "order_short_number": 1,
    "created_at": "2026-10-29T10:23:36.917353Z",
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

`GET /api/rider/v1/orders/351e43a4-17d5-4c6c-940f-70d91fc2f048/tip` → **200**

```json
{
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
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
  "available_until": "2026-10-30T10:25:46.684882Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/351e43a4-17d5-4c6c-940f-70d91fc2f048/tip` → **201**

```json
{
  "command_id": "98856812-5b39-4165-8dd0-772a6cce9ba3",
  "amount_minor": 1100
}
```

```json
{
  "id": "b893858c-aac5-4bdc-a240-b6c994626f6c",
  "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T10:25:51.661537Z"
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
  "session_id": "36bc165e-275f-402e-9a3b-00f8d9210f1a",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NTIsImlhdCI6MTc5MzI2OTU1MiwianRpIjoiMzhhNTY5M2EtODZkYi00ZjdkLTk2YWMtMmNiMGFhNTRiN2FjIiwic2lkIjoiMzZiYzE2NWUtMjc1Zi00MDJlLTlhM2ItMDBmOGQ5MjEwZjFhIn0.F9mD59x9UzvXdx89kFPpTODK-jKGX08rbY6wIiMQ1Eo",
  "access_expires_at": "2026-10-29T10:40:52.225728635Z",
  "refresh_token": "D58SAicdfMt-dQWRj9iWlnYDwwgEVv7L3n5lfTjTUlE",
  "refresh_expires_at": "2026-10-29T22:25:52.225196317Z",
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
        "created": 12,
        "fulfilled": 7,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 11
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 11
        },
        "cancelled_by": {
          "STAFF": 1,
          "DRIVER": 1,
          "RIDER": 3
        }
      }
    }
  ],
  "total": {
    "created": 12,
    "fulfilled": 7,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 11
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 11
    },
    "cancelled_by": {
      "STAFF": 1,
      "DRIVER": 1,
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
  "generated_at": "2026-10-29T10:25:52.492441922Z"
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
        "trips": 7,
        "fares_minor": 85179,
        "service_rides_minor": 0,
        "commission_minor": 12780,
        "driver_share_minor": 72399,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 7,
    "fares_minor": 85179,
    "service_rides_minor": 0,
    "commission_minor": 12780,
    "driver_share_minor": 72399,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-29T10:25:52.769463306Z"
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
  "session_id": "c32f891b-7d68-4a81-8af6-1f6f548ef8bd",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NTMsImlhdCI6MTc5MzI2OTU1MywianRpIjoiZGQ5ZjNmNjUtMzMzYi00NGRjLWE4OTMtODFkZDJkNGY2MzI5Iiwic2lkIjoiYzMyZjg5MWItN2Q2OC00YTgxLThhZjYtMWY2ZjU0OGVmOGJkIn0.F8xjpJlDRXA5DU2oxw3T5OoAVdHOQFyRlaZo4hvQvLI",
  "access_expires_at": "2026-10-29T10:40:53.36143533Z",
  "refresh_token": "hDc0pmBCTyVs2Y1D3oVr1VGrLhYgFV-UQK4Yj39mzRA",
  "refresh_expires_at": "2026-10-29T22:25:53.360803956Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/351e43a4-17d5-4c6c-940f-70d91fc2f048/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:25:42.035107Z",
      "actor": {
        "type": "CLIENT",
        "id": "245441a0-6567-44d7-9f34-7280f245ae92",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
        "quote_id": "c49836aa-8c3b-4679-9855-ca1584662261",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4aa59582-88e8-43e5-94b1-fc6852b79349"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:25:42.036813Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
        "attempt_id": "1cfb12bb-04db-48da-85c5-aada34ebf4e3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4aa59582-88e8-43e5-94b1-fc6852b79349"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:25:42.039609Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5a46c643-947e-41c2-a4bf-4e2aabc7ea64",
        "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "4aa59582-88e8-43e5-94b1-fc6852b79349"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T10:25:42.604522Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5a46c643-947e-41c2-a4bf-4e2aabc7ea64",
        "order_id": "351e43a4-17d5-4c6c-940f-70d91fc2f048",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "143193d4-f9a1-4012-9fa9-8a7388b0542c"
      },
      "correlation_id": "5e0965ec-2e26-47cf-a843-a6af813acf3a"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T10:25:53.911767493Z",
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
      "last_location_at": "2026-10-29T10:25:46.410095Z",
      "order_id": null
    }
  ]
}
```

Done: order 351e43a4-17d5-4c6c-940f-70d91fc2f048.

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
  "session_id": "9d360194-4f9a-4fba-b609-ae3de05fb779",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NTQsImlhdCI6MTc5MzI2OTU1NCwianRpIjoiZTcxY2M2MDEtMmM1Zi00M2Y3LTg0NjctM2E3MzlkOGY5OTQ5Iiwic2lkIjoiOWQzNjAxOTQtNGY5YS00ZmJhLWI2MDktYWUzZGUwNWZiNzc5In0.SXRF5ABeysmzbPCkI2VLh2WXSPJCJ-cAs3jkYVEYmr8",
  "access_expires_at": "2026-10-29T10:40:54.501239079Z",
  "refresh_token": "jRl21GWorEQegGXQi2gHAM17UHwJcXWXbjilQPYZsXA",
  "refresh_expires_at": "2026-10-29T22:25:54.500713284Z",
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
  "command_id": "74ca0236-6693-472a-8ec1-3d024f96a37b",
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
  "timestamp": "2026-10-29T10:25:55.000+0000",
  "channel": {
    "id": "1730052000.245672121",
    "linkedid": "1730052000.245672121",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674444551"
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
  "timestamp": "2026-10-29T10:25:55.000+0000",
  "channel": {
    "id": "1730052000.245672121",
    "linkedid": "1730052000.245672121",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674444551"
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
  "session_id": "b95954a5-baf0-4b36-bdff-4308ed529551",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NTUsImlhdCI6MTc5MzI2OTU1NSwianRpIjoiYjk0ZTQxMDItYzA2MC00OGM3LTg3YmQtMDEwN2ZiMmI4ODJmIiwic2lkIjoiYjk1OTU0YTUtYmFmMC00YjM2LWJkZmYtNDMwOGVkNTI5NTUxIn0.GYI2pxxvPxF63jT89dbdZ9eW1lsiZeXuyX7wndlzlYY",
  "access_expires_at": "2026-10-29T10:40:55.659479711Z",
  "refresh_token": "K88GbzpLJ0k4tt4YVm0_WY8pIU_ZmN813KI8Rdo0hJg",
  "refresh_expires_at": "2026-10-29T22:25:55.658870955Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "efbf7ba0-2e24-48ca-b119-bedbe54d1a21",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674444551",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T10:25:55Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/efbf7ba0-2e24-48ca-b119-bedbe54d1a21/answer` → **200**

```json
{
  "command_id": "418b1956-3843-46be-8147-50cdab444a41"
}
```

```json
{
  "id": "efbf7ba0-2e24-48ca-b119-bedbe54d1a21",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674444551",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "order_ids": [],
  "started_at": "2026-10-29T10:25:55Z",
  "answered_at": "2026-10-29T10:25:56.234526Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.245672121",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d614531f-8215-4a35-b651-335fb97b970b",
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
  "id": "76d66cdc-4a8f-4846-8941-7b94a5a3f369",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:30:56.564632Z",
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
  "command_id": "52494b9e-e301-43ae-b1d1-8c1832673ce5",
  "quote_id": "76d66cdc-4a8f-4846-8941-7b94a5a3f369",
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
    "phone": "+380674444551"
  },
  "call_id": "efbf7ba0-2e24-48ca-b119-bedbe54d1a21"
}
```

```json
{
  "id": "811f9a56-fc52-4e17-a8cb-43616c6790bd",
  "short_number": 13,
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
  "created_at": "2026-10-29T10:25:56.854424Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674444551"
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
    "id": "1730052000.245672121",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "efbf7ba0-2e24-48ca-b119-bedbe54d1a21",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674444551",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [
        "811f9a56-fc52-4e17-a8cb-43616c6790bd"
      ],
      "started_at": "2026-10-29T10:25:55Z",
      "answered_at": "2026-10-29T10:25:56.234526Z",
      "ended_at": "2026-10-29T10:25:57.159957Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "82d4e4f6-e564-4046-9d75-75a13660ff7a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679865770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
      "order_ids": [],
      "started_at": "2026-10-29T10:23:54.237742Z",
      "answered_at": "2026-10-29T10:23:54.546946Z",
      "ended_at": "2026-10-29T10:23:54.85211Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T10:24:03.518368Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/811f9a56-fc52-4e17-a8cb-43616c6790bd` → **200**

```json
{
  "id": "811f9a56-fc52-4e17-a8cb-43616c6790bd",
  "short_number": 13,
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
  "created_at": "2026-10-29T10:25:56.854424Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674444551"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/811f9a56-fc52-4e17-a8cb-43616c6790bd` → **200**

```json
{
  "id": "811f9a56-fc52-4e17-a8cb-43616c6790bd",
  "short_number": 13,
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
  "created_at": "2026-10-29T10:25:56.854424Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674444551"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/811f9a56-fc52-4e17-a8cb-43616c6790bd/cancel` → **200**

```json
{
  "command_id": "aa4275b3-ad24-47f1-8887-644eb797b1f0",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "811f9a56-fc52-4e17-a8cb-43616c6790bd",
  "short_number": 13,
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
  "created_at": "2026-10-29T10:25:56.854424Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674444551"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call efbf7ba0-2e24-48ca-b119-bedbe54d1a21 with order 811f9a56-fc52-4e17-a8cb-43616c6790bd.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30422"
}
```

```json
{
  "challenge_id": "a852a543-d7b1-4c4d-b6ec-46fa9754da45",
  "expires_at": "2026-10-29T10:30:58.337050321Z",
  "resend_available_at": "2026-10-29T10:25:59.337050321Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "629401",
  "sent_at": "2026-10-29T10:25:58.339515958Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a852a543-d7b1-4c4d-b6ec-46fa9754da45",
  "code": "629401",
  "device_ref": "sandbox-30422"
}
```

```json
{
  "session_id": "6f919517-1d42-435f-95e6-761911409442",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQ1OCwiaWF0IjoxNzkzMjY5NTU4LCJqdGkiOiJkZGQ1YjVkMi01NTc0LTRkMzAtOGRkZS0zOTk2ZTYwM2FiOGQiLCJzaWQiOiI2ZjkxOTUxNy0xZDQyLTQzNWYtOTVlNi03NjE5MTE0MDk0NDIifQ.nLsmvak2tu1XCFMPUg2mbC6Q3CxbY8QJj8hhTxS7S8E",
  "access_expires_at": "2026-10-29T10:40:58.642040835Z",
  "refresh_token": "TeNNUJDoUgT-LHP3Z2c5q4uZaIZ13KVRQhL4lhL0yeE",
  "refresh_expires_at": "2026-11-28T10:25:58.64153117Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:25:46.410095Z",
  "last_location_at": "2026-10-29T10:25:46.410095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/handover` → **200**

```json
{
  "command_id": "7027e65f-38e6-47dc-aafb-34900197598c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:25:46.410095Z",
  "last_location_at": "2026-10-29T10:25:46.410095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:25:59Z",
    "sequence": 1793269559455
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:25:59.47303Z",
  "last_location_at": "2026-10-29T10:25:59.47303Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665666031",
  "device_ref": "sandbox-31662"
}
```

```json
{
  "challenge_id": "d2609f59-7d1b-4925-a5ca-cb22c8f7ce66",
  "expires_at": "2026-10-29T10:30:59.746620387Z",
  "resend_available_at": "2026-10-29T10:26:00.746620387Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665666031` → **200**

```json
{
  "phone": "+380665666031",
  "audience": "CLIENT",
  "code": "103855",
  "sent_at": "2026-10-29T10:25:59.748756036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2609f59-7d1b-4925-a5ca-cb22c8f7ce66",
  "code": "103855",
  "device_ref": "sandbox-31662"
}
```

```json
{
  "session_id": "b8c8a86d-3aed-46ae-93db-cea93c4df5bc",
  "subject": {
    "type": "CLIENT",
    "id": "29d64725-cf2b-4940-8d4e-73cd3b8030f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWQ2NDcyNS1jZjJiLTQ5NDAtOGQ0ZS03M2NkM2I4MDMwZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDYwLCJpYXQiOjE3OTMyNjk1NjAsImp0aSI6IjQ5NzFhYmZhLTNiNzQtNDk5My1hYWUwLTFlM2MxZmQ0ZjFkMiIsInNpZCI6ImI4YzhhODZkLTNhZWQtNDZhZS05M2RiLWNlYTkzYzRkZjViYyJ9.oebdLLKEXM9ZpUBdER7_eMoXBcFqtXjbYQj96dyhN9c",
  "access_expires_at": "2026-10-29T10:41:00.038385424Z",
  "refresh_token": "z9aE3gvt4KzlS_ColJUPyQgYej1SWBaQuHTg7N-VT3A",
  "refresh_expires_at": "2026-11-28T10:26:00.037870314Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "388358f7-be4d-4ade-8375-e5083eb5d8c5",
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
  "id": "bfcb925a-f6ae-43e0-964a-a1b9afea8c1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:00.316330Z",
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
  "command_id": "b94060bd-c760-4dcd-9c22-a1024676d642",
  "quote_id": "bfcb925a-f6ae-43e0-964a-a1b9afea8c1f",
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
  "id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29d64725-cf2b-4940-8d4e-73cd3b8030f6",
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
  "created_at": "2026-10-29T10:26:00.605817Z",
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
    "id": "c6d3a0c9-dd32-484f-b788-e007e1988470",
    "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
    "expires_at": "2026-10-29T10:26:15.608709Z",
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

`POST /api/driver/v1/offers/c6d3a0c9-dd32-484f-b788-e007e1988470/accept` → **200**

```json
{
  "command_id": "f8ddbab7-0f20-48fe-b33c-1191386b913e"
}
```

```json
{
  "id": "3f391455-cdf9-4e70-9eee-5d91996b3d35",
  "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "09e8d6cf-9896-48e6-945f-584db9e28535",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "09e8d6cf-9896-48e6-945f-584db9e28535",
  "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
  "assignment_id": "3f391455-cdf9-4e70-9eee-5d91996b3d35",
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

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:01Z",
    "sequence": 1793269561708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:26:01.727618Z",
  "last_location_at": "2026-10-29T10:26:01.727618Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/09e8d6cf-9896-48e6-945f-584db9e28535/arrive` → **200**

```json
{
  "command_id": "3fb9f734-4641-40cb-a69a-4e3dc6c7f66e",
  "expected_version": 0
}
```

```json
{
  "id": "09e8d6cf-9896-48e6-945f-584db9e28535",
  "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
  "assignment_id": "3f391455-cdf9-4e70-9eee-5d91996b3d35",
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
  "arrived_at": "2026-10-29T10:26:02.004561Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/09e8d6cf-9896-48e6-945f-584db9e28535/start` → **200**

```json
{
  "command_id": "5b51e0a0-7aa0-409a-9352-f704cdb7b2f7",
  "expected_version": 1
}
```

```json
{
  "id": "09e8d6cf-9896-48e6-945f-584db9e28535",
  "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
  "assignment_id": "3f391455-cdf9-4e70-9eee-5d91996b3d35",
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
  "arrived_at": "2026-10-29T10:26:02.004561Z",
  "started_at": "2026-10-29T10:26:02.281816Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:02Z",
    "sequence": 1793269562553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:26:02.571809Z",
  "last_location_at": "2026-10-29T10:26:02.571809Z",
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
  "device_ref": "sandbox-2673"
}
```

```json
{
  "challenge_id": "cd09b2fb-d360-4173-91ee-e33e8008907a",
  "expires_at": "2026-10-29T10:31:02.834982274Z",
  "resend_available_at": "2026-10-29T10:26:03.834982274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "372347",
  "sent_at": "2026-10-29T10:26:02.837237697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd09b2fb-d360-4173-91ee-e33e8008907a",
  "code": "372347",
  "device_ref": "sandbox-2673"
}
```

```json
{
  "session_id": "2ce06706-28ce-4213-8777-5b034eff1d7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQ2MywiaWF0IjoxNzkzMjY5NTYzLCJqdGkiOiIzZDMxNjFhYi0yOWFmLTQ1NmQtYTgwNi1jNzhiMzY2YjQ2OGMiLCJzaWQiOiIyY2UwNjcwNi0yOGNlLTQyMTMtODc3Ny01YjAzNGVmZjFkN2EifQ.LKys1CakVvmX8O4u-ENIAAwDwO9F6e7it0kT4LnOh0s",
  "access_expires_at": "2026-10-29T10:41:03.133710964Z",
  "refresh_token": "YZAtNBnawJ5D_dVSw4WZYjXuIk_vtVNbcXZLMVIKbBk",
  "refresh_expires_at": "2026-11-28T10:26:03.133213031Z",
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
  "command_id": "fd56995a-3c15-4f6e-91c3-013ee4dabb48",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:03Z",
    "sequence": 1793269563672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "aae00934-52c4-4567-b229-016bfa4cf001",
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
  "last_heartbeat_at": "2026-10-29T10:26:03.691151Z",
  "last_location_at": "2026-10-29T10:26:03.691151Z",
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
  "session_id": "e1e3074a-880a-47e0-82e8-e20498d7f3c2",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NjQsImlhdCI6MTc5MzI2OTU2NCwianRpIjoiNDQ4YjA1ZjUtN2I3ZS00NWQ0LTg5M2UtNzM3NTRkMGIzOWVkIiwic2lkIjoiZTFlMzA3NGEtODgwYS00N2UwLTgyZTgtZTIwNDk4ZDdmM2MyIn0.sGviHdjDtI7OGMkirgRzHvVTd8iDpb62xuyc8w7iyHM",
  "access_expires_at": "2026-10-29T10:41:04.252347056Z",
  "refresh_token": "vS548GYutL3Hm3jvbHtsipKp9SsDYeT-9RJYQrXwj4c",
  "refresh_expires_at": "2026-10-29T22:26:04.251862478Z",
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
  "session_id": "8a8c4545-97b9-4def-95e4-e80d522e3e8d",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NjQsImlhdCI6MTc5MzI2OTU2NCwianRpIjoiNjhlMmYxMzAtMDE4Yi00ZmQ1LWI1MGQtNDlmMTY1Yjc5ZDZiIiwic2lkIjoiOGE4YzQ1NDUtOTdiOS00ZGVmLTk1ZTQtZTgwZDUyMmUzZThkIn0.Eihd0FvSQPp7_JDaqaLn97UEM3nRtpfJVHr0bx5rjMM",
  "access_expires_at": "2026-10-29T10:41:04.811116157Z",
  "refresh_token": "vpwd7kjg0MvatZnP-ATZ_K-ovvrqZ1Ef2Uf_yDc_uoM",
  "refresh_expires_at": "2026-10-29T22:26:04.810573079Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/62dfa8b9-66d1-4468-be11-dfa1122a8ff3` → **200**

```json
{
  "id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "29d64725-cf2b-4940-8d4e-73cd3b8030f6",
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
    "id": "3f391455-cdf9-4e70-9eee-5d91996b3d35",
    "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "09e8d6cf-9896-48e6-945f-584db9e28535",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T10:26:00.605817Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/62dfa8b9-66d1-4468-be11-dfa1122a8ff3/interrupt` → **200**

```json
{
  "command_id": "46fb1d15-aac8-45f5-8b7e-3000330255d0",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "29d64725-cf2b-4940-8d4e-73cd3b8030f6",
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
      "id": "3f391455-cdf9-4e70-9eee-5d91996b3d35",
      "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "09e8d6cf-9896-48e6-945f-584db9e28535",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T10:26:00.605817Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "29d64725-cf2b-4940-8d4e-73cd3b8030f6",
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
    "id": "e23815db-249c-4073-bb92-18906f06fd02",
    "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
    "expires_at": "2026-10-29T10:26:20.393859Z",
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

`POST /api/driver/v1/offers/e23815db-249c-4073-bb92-18906f06fd02/accept` → **200**

```json
{
  "command_id": "b2ec9de7-d18f-479a-9d24-b466f4fe8c2a"
}
```

```json
{
  "id": "1b66fe63-be1f-4258-9a0f-ae79c873fffb",
  "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e1deccb-9d73-453c-a33c-1163e38ae409",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4e1deccb-9d73-453c-a33c-1163e38ae409",
  "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
  "assignment_id": "1b66fe63-be1f-4258-9a0f-ae79c873fffb",
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
  "session_id": "aae00934-52c4-4567-b229-016bfa4cf001",
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
  "last_heartbeat_at": "2026-10-29T10:26:03.691151Z",
  "last_location_at": "2026-10-29T10:26:03.691151Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/aae00934-52c4-4567-b229-016bfa4cf001/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:06Z",
    "sequence": 1793269566779
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "aae00934-52c4-4567-b229-016bfa4cf001",
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
  "last_heartbeat_at": "2026-10-29T10:26:06.798267Z",
  "last_location_at": "2026-10-29T10:26:06.798267Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4e1deccb-9d73-453c-a33c-1163e38ae409/arrive` → **200**

```json
{
  "command_id": "8fa70f10-1121-4db7-9792-8a072c0bee28",
  "expected_version": 0
}
```

```json
{
  "id": "4e1deccb-9d73-453c-a33c-1163e38ae409",
  "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
  "assignment_id": "1b66fe63-be1f-4258-9a0f-ae79c873fffb",
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
  "arrived_at": "2026-10-29T10:26:07.078531Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e1deccb-9d73-453c-a33c-1163e38ae409/start` → **200**

```json
{
  "command_id": "2f33074f-5a01-4db7-9bbc-8724e85761b1",
  "expected_version": 1
}
```

```json
{
  "id": "4e1deccb-9d73-453c-a33c-1163e38ae409",
  "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
  "assignment_id": "1b66fe63-be1f-4258-9a0f-ae79c873fffb",
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
  "arrived_at": "2026-10-29T10:26:07.078531Z",
  "started_at": "2026-10-29T10:26:07.358514Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e1deccb-9d73-453c-a33c-1163e38ae409/complete` → **200**

```json
{
  "command_id": "20809231-6408-4437-b512-ecf655effdce",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:26:07Z"
}
```

```json
{
  "id": "4e1deccb-9d73-453c-a33c-1163e38ae409",
  "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
  "assignment_id": "1b66fe63-be1f-4258-9a0f-ae79c873fffb",
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
  "arrived_at": "2026-10-29T10:26:07.078531Z",
  "started_at": "2026-10-29T10:26:07.358514Z",
  "completed_at": "2026-10-29T10:26:07.657212Z",
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
    "id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T10:26:05.384242Z",
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
    "id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T10:26:00.605817Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
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

`GET /api/operator/v1/orders/62dfa8b9-66d1-4468-be11-dfa1122a8ff3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T10:26:00.606274Z",
      "actor": {
        "type": "CLIENT",
        "id": "29d64725-cf2b-4940-8d4e-73cd3b8030f6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
        "quote_id": "bfcb925a-f6ae-43e0-964a-a1b9afea8c1f",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "9a735981-a16e-4893-a555-392d3aca2599"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T10:26:00.608018Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
        "attempt_id": "26b4059c-8ae8-455b-8356-713e992f0363",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9a735981-a16e-4893-a555-392d3aca2599"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T10:26:00.611033Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6d3a0c9-dd32-484f-b788-e007e1988470",
        "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "9a735981-a16e-4893-a555-392d3aca2599"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T10:26:01.18042Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c6d3a0c9-dd32-484f-b788-e007e1988470",
        "order_id": "62dfa8b9-66d1-4468-be11-dfa1122a8ff3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3f391455-cdf9-4e70-9eee-5d91996b3d35"
      },
      "correlation_id": "7e0b08e2-5be4-4914-b430-fb66c9049f1f"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/0fe0ef87-ef02-4080-959c-e44fe4d93d53/tip` → **200**

```json
{
  "order_id": "0fe0ef87-ef02-4080-959c-e44fe4d93d53",
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
  "available_until": "2026-10-30T10:26:07.657212Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/0fe0ef87-ef02-4080-959c-e44fe4d93d53/tip` → **409**

```json
{
  "command_id": "832b81c9-ae1d-4a33-b400-919ab03e8bdf",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/0fe0ef87-ef02-4080-959c-e44fe4d93d53/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "19266c30-b781-4b40-ae1b-f20bedaacd49"
}
```

Done: interrupted 62dfa8b9-66d1-4468-be11-dfa1122a8ff3, follow-up 0fe0ef87-ef02-4080-959c-e44fe4d93d53.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eb89a7ae-9b97-4410-a5d1-8253caa65fcd",
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
  "last_heartbeat_at": "2026-10-29T10:26:02.571809Z",
  "last_location_at": "2026-10-29T10:26:02.571809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb89a7ae-9b97-4410-a5d1-8253caa65fcd/close` → **200**

```json
{
  "command_id": "4553fde9-6643-406a-a4c9-c95315f86356",
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
  "session_id": "aae00934-52c4-4567-b229-016bfa4cf001",
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
  "last_heartbeat_at": "2026-10-29T10:26:06.798267Z",
  "last_location_at": "2026-10-29T10:26:06.798267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aae00934-52c4-4567-b229-016bfa4cf001/close` → **200**

```json
{
  "command_id": "4e06bb9e-79fe-49ca-86bc-622e080a7ed2",
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
  "session_id": "19657e02-4470-43c6-aa94-4781f82c7c38",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0NzMsImlhdCI6MTc5MzI2OTU3MywianRpIjoiY2UxMWZiMDItZGZlNS00NjVhLTljZDMtMzI0MzE3YzUzZDUwIiwic2lkIjoiMTk2NTdlMDItNDQ3MC00M2M2LWFhOTQtNDc4MWY4MmM3YzM4In0.gaMCspIlUnIvPD4LELBEeSqF8vTwPIiX-Lw91GCkeqM",
  "access_expires_at": "2026-10-29T10:41:13.718461058Z",
  "refresh_token": "Z-jJY20En7SVmndsKjgI4ITZOcLISZ6ckxfbLHnx-AU",
  "refresh_expires_at": "2026-10-29T22:26:13.717920224Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9ff88c42-884d-4bc3-9ece-4d31c1efe5ee",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:26:13Z"
}
```

```json
{
  "id": "897ccad7-f928-49ba-849d-d7a12db6edf8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:26:13Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/897ccad7-f928-49ba-849d-d7a12db6edf8/publish` → **200**

```json
{
  "command_id": "daadf421-e733-4bef-9356-42db1b5318aa",
  "expected_version": 0
}
```

```json
{
  "id": "897ccad7-f928-49ba-849d-d7a12db6edf8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:26:14.289334Z",
  "published_at": "2026-10-29T10:26:14.289334Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "897ccad7-f928-49ba-849d-d7a12db6edf8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T10:26:14.289334Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634602034",
  "device_ref": "sandbox-2484"
}
```

```json
{
  "challenge_id": "e4ac260e-48fc-4968-8cdf-d0927b520842",
  "expires_at": "2026-10-29T10:31:14.832543942Z",
  "resend_available_at": "2026-10-29T10:26:15.832543942Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634602034` → **200**

```json
{
  "phone": "+380634602034",
  "audience": "CLIENT",
  "code": "316568",
  "sent_at": "2026-10-29T10:26:14.835241724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4ac260e-48fc-4968-8cdf-d0927b520842",
  "code": "316568",
  "device_ref": "sandbox-2484"
}
```

```json
{
  "session_id": "b786befe-db51-4ce9-becd-9b2378aa98ff",
  "subject": {
    "type": "CLIENT",
    "id": "a983ee8d-2bd9-44a7-acd2-1e4641d84252"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOTgzZWU4ZC0yYmQ5LTQ0YTctYWNkMi0xZTQ2NDFkODQyNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDc1LCJpYXQiOjE3OTMyNjk1NzUsImp0aSI6ImIzMTdlYjE3LTJkNWUtNGE3OC04MjI2LTVkNTYyZTNjZTdlYSIsInNpZCI6ImI3ODZiZWZlLWRiNTEtNGNlOS1iZWNkLTliMjM3OGFhOThmZiJ9._gKdPS1NLDI4h67iv_6UDOWttTu3gJlXqEMW3e1gY8U",
  "access_expires_at": "2026-10-29T10:41:15.129210671Z",
  "refresh_token": "OClpfZ66EvJUhbAyG0TjYEfhTbhhmCBrbaAWwVs-bQA",
  "refresh_expires_at": "2026-11-28T10:26:15.128677823Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "897ccad7-f928-49ba-849d-d7a12db6edf8",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T10:26:14.289334Z",
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
  "command_id": "85547c3f-fbd0-45d7-b713-1a2bb6c10274",
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
  "id": "e4134cfd-822c-4c74-ab64-808511c6d59b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:15.678819Z",
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
  "command_id": "12bce176-e31e-4a81-b270-0aba9c0f9680",
  "quote_id": "e4134cfd-822c-4c74-ab64-808511c6d59b",
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
  "correlation_id": "fc8b95a2-03d0-4309-9254-a95b6cd3d6c9"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "02e1ad36-eb5f-493a-ae63-2c952160b064",
  "version_id": "897ccad7-f928-49ba-849d-d7a12db6edf8",
  "language": "uk"
}
```

```json
{
  "version_id": "897ccad7-f928-49ba-849d-d7a12db6edf8",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T10:26:16.246507Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b457b6da-0980-4241-8a29-ea69a918b549",
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
  "id": "1efea96a-603e-4e49-9e63-0d24f2feac59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:16.515538Z",
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
  "command_id": "fa39fe42-beb6-4566-8e56-3c60e7dcb312",
  "quote_id": "1efea96a-603e-4e49-9e63-0d24f2feac59",
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
  "id": "d886f8cb-544f-4ed9-8adc-e9e26bbb19bd",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a983ee8d-2bd9-44a7-acd2-1e4641d84252",
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
  "created_at": "2026-10-29T10:26:16.812115Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d886f8cb-544f-4ed9-8adc-e9e26bbb19bd` → **200**

```json
{
  "id": "d886f8cb-544f-4ed9-8adc-e9e26bbb19bd",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a983ee8d-2bd9-44a7-acd2-1e4641d84252",
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
  "created_at": "2026-10-29T10:26:16.812115Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d886f8cb-544f-4ed9-8adc-e9e26bbb19bd/cancel` → **200**

```json
{
  "command_id": "22957db4-3b1d-4b18-a553-8508b35ba8b2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d886f8cb-544f-4ed9-8adc-e9e26bbb19bd",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a983ee8d-2bd9-44a7-acd2-1e4641d84252",
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
  "created_at": "2026-10-29T10:26:16.812115Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`POST /api/admin/v1/legal-documents/897ccad7-f928-49ba-849d-d7a12db6edf8` → **409**

```json
{
  "command_id": "e526fdec-0d8c-4724-afa4-750cc24db6d2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T10:26:17Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/897ccad7-f928-49ba-849d-d7a12db6edf8",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "eecfc470-963c-46c8-ab44-a622281bc5c9"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0679f89f-f224-4b8e-873c-32a76d745be2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T10:26:17Z"
}
```

```json
{
  "id": "c5a82c1f-68bb-4c9d-bcff-eea296482d8a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T10:26:17Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c5a82c1f-68bb-4c9d-bcff-eea296482d8a/publish` → **200**

```json
{
  "command_id": "d97dea8b-b5c7-46eb-86f7-3b2ae2dc2e28",
  "expected_version": 0
}
```

```json
{
  "id": "c5a82c1f-68bb-4c9d-bcff-eea296482d8a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T10:26:18.257517Z",
  "published_at": "2026-10-29T10:26:18.257517Z",
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
  "device_ref": "sandbox-10016"
}
```

```json
{
  "challenge_id": "4cd96dca-9598-44f9-90ea-8d5d53aa18bc",
  "expires_at": "2026-10-29T10:31:18.535308229Z",
  "resend_available_at": "2026-10-29T10:26:19.535308229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "388955",
  "sent_at": "2026-10-29T10:26:18.53730904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cd96dca-9598-44f9-90ea-8d5d53aa18bc",
  "code": "388955",
  "device_ref": "sandbox-10016"
}
```

```json
{
  "session_id": "0e75a146-741b-4f03-850c-d2acf2518468",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQ3OCwiaWF0IjoxNzkzMjY5NTc4LCJqdGkiOiJhNzgxYzk0MC1kMTFjLTRiMWQtOTM1NS01YzYzNTgwNWNjZDEiLCJzaWQiOiIwZTc1YTE0Ni03NDFiLTRmMDMtODUwYy1kMmFjZjI1MTg0NjgifQ.o0etz_qL1U672dO33EPwoQSYta2HtmnUPePxVgiSiEM",
  "access_expires_at": "2026-10-29T10:41:18.832760347Z",
  "refresh_token": "kg0_E-uKdqGwflgw3NB5MBsbjSvNrHaPsr9l8ms3dug",
  "refresh_expires_at": "2026-11-28T10:26:18.832161154Z",
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
  "command_id": "0eafa161-8d71-495d-a500-8b37ca741746",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:19Z",
    "sequence": 1793269579382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a52eb600-4693-418f-b15b-642e847eb663",
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
  "last_heartbeat_at": "2026-10-29T10:26:19.399967Z",
  "last_location_at": "2026-10-29T10:26:19.399967Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679114943",
  "device_ref": "sandbox-1491"
}
```

```json
{
  "challenge_id": "1c4babca-a966-4c9d-bb08-64835385122f",
  "expires_at": "2026-10-29T10:31:19.674973383Z",
  "resend_available_at": "2026-10-29T10:26:20.674973383Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679114943` → **200**

```json
{
  "phone": "+380679114943",
  "audience": "CLIENT",
  "code": "142451",
  "sent_at": "2026-10-29T10:26:19.676904619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c4babca-a966-4c9d-bb08-64835385122f",
  "code": "142451",
  "device_ref": "sandbox-1491"
}
```

```json
{
  "session_id": "41ce6540-8df9-4379-840b-61a99f361b91",
  "subject": {
    "type": "CLIENT",
    "id": "63ceba97-8b58-406f-a5ad-b577af378b1b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2NlYmE5Ny04YjU4LTQwNmYtYTVhZC1iNTc3YWYzNzhiMWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjcwNDc5LCJpYXQiOjE3OTMyNjk1NzksImp0aSI6IjE3YmMyMmFjLWI0NDQtNGMzNC1hNzBkLWNiYWI5ZTMwY2JjMyIsInNpZCI6IjQxY2U2NTQwLThkZjktNDM3OS04NDBiLTYxYTk5ZjM2MWI5MSJ9.ZtGykOR-y-nLnBkIpSnC0PbEY1K3jzKUFsop_DHLYJ0",
  "access_expires_at": "2026-10-29T10:41:19.979542165Z",
  "refresh_token": "TCzX0awZ8b64rY2LdkXTuq-5kfNCqmGqHgOzb6Y45E4",
  "refresh_expires_at": "2026-11-28T10:26:19.978958401Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a87d0ae0-cc14-4a33-a167-795d6d75d58a",
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
  "id": "c23c8ddc-4e3e-4cbf-a94b-dc628427fcd6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:20.253227Z",
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
  "command_id": "38e593b8-29a4-40d4-b2f9-9f8070e4bd7b",
  "quote_id": "c23c8ddc-4e3e-4cbf-a94b-dc628427fcd6",
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
    "phone": "+380673787172"
  }
}
```

```json
{
  "id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:26:20.539815Z",
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
    "id": "86fd1717-72c5-4aba-acc8-3492d8696774",
    "order_id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
    "expires_at": "2026-10-29T10:26:35.542869Z",
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

`POST /api/driver/v1/offers/86fd1717-72c5-4aba-acc8-3492d8696774/accept` → **200**

```json
{
  "command_id": "cdce4211-b0c3-4458-985f-826eaa1bd012"
}
```

```json
{
  "id": "12c42237-636e-4676-8e19-5a702c697c25",
  "order_id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c828a41c-2d6c-4282-bf1a-4158e8a097da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c828a41c-2d6c-4282-bf1a-4158e8a097da",
  "order_id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
  "assignment_id": "12c42237-636e-4676-8e19-5a702c697c25",
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
    "phone": "+380673787172"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a03a6eee-85fe-4382-9f99-82f82352672d",
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
  "id": "31bbd31e-ab55-495c-b3b2-09ae9f34baae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:21.665205Z",
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
  "command_id": "59d52224-611f-482a-a174-7841ce84413f",
  "quote_id": "31bbd31e-ab55-495c-b3b2-09ae9f34baae",
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
  "id": "3b032ee3-7525-4339-a062-63241a3fe36f",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:26:21.958043Z",
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
  "command_id": "d95c28aa-8f96-4c7c-88b5-87b3100da808",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T13:26:22Z"
}
```

```json
{
  "id": "eeb4dfbc-cc4a-4bdf-909d-9cb0e0b5044d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:22.257054Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T13:26:22Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2bb031aa-edd3-4a32-bc79-6b290d4c99d7",
  "quote_id": "eeb4dfbc-cc4a-4bdf-909d-9cb0e0b5044d",
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
  "pickup_at": "2026-10-29T13:26:22Z"
}
```

```json
{
  "id": "b9aae03e-0fae-43f0-90c0-666c7a5f06e1",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T10:26:22.537806Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T13:26:22Z",
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
  "command_id": "405a1066-a33e-47df-8de4-3dfe313479e5",
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
  "id": "5b058fe5-71a4-45bd-b30c-b54831981043",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:22.836492Z",
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
  "command_id": "353aa8c4-b3b8-4dcb-b083-442bc7732225",
  "quote_id": "5b058fe5-71a4-45bd-b30c-b54831981043",
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
  "correlation_id": "1481dac6-b3b0-4622-a120-c31bd3201732"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b9aae03e-0fae-43f0-90c0-666c7a5f06e1",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T10:26:22.537806Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T13:26:22Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "3b032ee3-7525-4339-a062-63241a3fe36f",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T10:26:21.958043Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3b032ee3-7525-4339-a062-63241a3fe36f",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:26:21.958043Z",
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

`GET /api/rider/v1/orders/1a9f8e50-9868-4b31-9e5d-11edd6e86309` → **200**

```json
{
  "id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "12c42237-636e-4676-8e19-5a702c697c25",
    "order_id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c828a41c-2d6c-4282-bf1a-4158e8a097da",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T10:26:20.539815Z",
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
    "location_at": "2026-10-29T10:26:19.399967Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/1a9f8e50-9868-4b31-9e5d-11edd6e86309/cancel` → **200**

```json
{
  "command_id": "bca8b48b-be21-4f27-a3fd-8fdf51547d08",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "12c42237-636e-4676-8e19-5a702c697c25",
    "order_id": "1a9f8e50-9868-4b31-9e5d-11edd6e86309",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c828a41c-2d6c-4282-bf1a-4158e8a097da",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T10:26:20.539815Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/3b032ee3-7525-4339-a062-63241a3fe36f` → **200**

```json
{
  "id": "3b032ee3-7525-4339-a062-63241a3fe36f",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T10:26:21.958043Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3b032ee3-7525-4339-a062-63241a3fe36f/cancel` → **200**

```json
{
  "command_id": "dc01cb64-275f-4837-84bb-b863540a5c8f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3b032ee3-7525-4339-a062-63241a3fe36f",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T10:26:21.958043Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/b9aae03e-0fae-43f0-90c0-666c7a5f06e1` → **200**

```json
{
  "id": "b9aae03e-0fae-43f0-90c0-666c7a5f06e1",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T10:26:22.537806Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T13:26:22Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b9aae03e-0fae-43f0-90c0-666c7a5f06e1/cancel` → **200**

```json
{
  "command_id": "13e627cc-6c10-435a-8673-499264bf712a",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b9aae03e-0fae-43f0-90c0-666c7a5f06e1",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "63ceba97-8b58-406f-a5ad-b577af378b1b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T10:26:22.537806Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-29T13:26:22Z",
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
  "session_id": "a52eb600-4693-418f-b15b-642e847eb663",
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
  "last_heartbeat_at": "2026-10-29T10:26:19.399967Z",
  "last_location_at": "2026-10-29T10:26:19.399967Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a52eb600-4693-418f-b15b-642e847eb663/close` → **200**

```json
{
  "command_id": "1a97bf29-6f6c-4d45-90fa-e710d1e6250b",
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

Done: orders 1a9f8e50-9868-4b31-9e5d-11edd6e86309, 3b032ee3-7525-4339-a062-63241a3fe36f, b9aae03e-0fae-43f0-90c0-666c7a5f06e1.

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
  "session_id": "3d4bcb96-2281-4a81-97f1-09a1515d6c1b",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0ODYsImlhdCI6MTc5MzI2OTU4NiwianRpIjoiM2FjNmIzMzUtODc2Ni00YjdkLWI2YTItNjY0MWI4ODFkNjA0Iiwic2lkIjoiM2Q0YmNiOTYtMjI4MS00YTgxLTk3ZjEtMDlhMTUxNWQ2YzFiIn0.WA_pzF0xBVETqOBQpaoQckkIf7BMHduaKN3XiZMiZis",
  "access_expires_at": "2026-10-29T10:41:26.485351796Z",
  "refresh_token": "ghjoHY6f09032u5XBEaVf3SYrOcZMF_HsqseOZQ3Am8",
  "refresh_expires_at": "2026-10-29T22:26:26.484851438Z",
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
  "session_id": "fb1a4839-17fb-40da-bf53-b6288678575c",
  "subject": {
    "type": "STAFF",
    "id": "2fe58b65-8b31-4a74-9377-49085caf9e73"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmU1OGI2NS04YjMxLTRhNzQtOTM3Ny00OTA4NWNhZjllNzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNzA0ODcsImlhdCI6MTc5MzI2OTU4NywianRpIjoiYmY2ZTlkMWYtNzUwNC00MDQ1LWE1NjUtMDI5MDAwMmVhYjZjIiwic2lkIjoiZmIxYTQ4MzktMTdmYi00MGRhLWJmNTMtYjYyODg2Nzg1NzVjIn0.Dl2yr9cmU5PYGH75WPtNj50-i9vdNM1b-d-DWEb0SQI",
  "access_expires_at": "2026-10-29T10:41:27.04068481Z",
  "refresh_token": "8vaPX68rBdZaiEbaW5mw_9Tzgnqzu9-kKrxar8DZGvw",
  "refresh_expires_at": "2026-10-29T22:26:27.040229136Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6036"
}
```

```json
{
  "challenge_id": "eb93d421-8dd2-4eb3-8f77-da6eea7deb74",
  "expires_at": "2026-10-29T10:31:27.303465828Z",
  "resend_available_at": "2026-10-29T10:26:28.303465828Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "421141",
  "sent_at": "2026-10-29T10:26:27.305678475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb93d421-8dd2-4eb3-8f77-da6eea7deb74",
  "code": "421141",
  "device_ref": "sandbox-6036"
}
```

```json
{
  "session_id": "dee3a702-9ed9-472f-9a4f-9b27cea78c3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI3MDQ4NywiaWF0IjoxNzkzMjY5NTg3LCJqdGkiOiIwMmVlY2IzZC0yODU4LTRjOTgtOGE3Ni03ODc5NjI1NmFkZDIiLCJzaWQiOiJkZWUzYTcwMi05ZWQ5LTQ3MmYtOWE0Zi05YjI3Y2VhNzhjM2UifQ.KZ-oLaXwRfiDZLzh6gWJKMoNxmPvLvybGF9Bd5-AHYU",
  "access_expires_at": "2026-10-29T10:41:27.592776324Z",
  "refresh_token": "mWypjFqKbxcXdHwAw0jfm0nRCrP94tZTqUwt-c8mb98",
  "refresh_expires_at": "2026-11-28T10:26:27.592252864Z",
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
  "command_id": "5748d9ce-6839-4c82-b40e-068491263513",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:28Z",
    "sequence": 1793269588117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b8ff3b7b-7c94-4f99-bd76-1c32969d93b5",
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
  "last_heartbeat_at": "2026-10-29T10:26:28.135503Z",
  "last_location_at": "2026-10-29T10:26:28.135503Z",
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
  "command_id": "a081117d-433c-41dd-9654-7cb817eb20d5",
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
  "effective_at": "2026-10-29T10:26:28.681673Z",
  "changed_by": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "2fe58b65-8b31-4a74-9377-49085caf9e73",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T10:24:11.106114Z",
  "last_entries": [
    {
      "order_id": "f12b9de0-d8fe-4d1b-9c00-c265260acf4f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T10:24:11.106114Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1d888bac-0db2-4313-8562-47eaa71ee3c6",
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
  "id": "06262acf-b12e-4dda-b007-26baa5ac2f07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:29.238570Z",
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
  "command_id": "4818da3b-ad3e-408b-a804-ce7d7e012087",
  "quote_id": "06262acf-b12e-4dda-b007-26baa5ac2f07",
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
    "phone": "+3806711110139"
  }
}
```

```json
{
  "id": "d01e9252-3cca-480a-92a9-3de812681982",
  "short_number": 20,
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
  "created_at": "2026-10-29T10:26:29.515276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711110139"
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
    "id": "a72db66b-1193-44c4-8fca-3cbbf3e517a3",
    "order_id": "d01e9252-3cca-480a-92a9-3de812681982",
    "expires_at": "2026-10-29T10:26:44.518824Z",
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

`POST /api/driver/v1/offers/a72db66b-1193-44c4-8fca-3cbbf3e517a3/accept` → **200**

```json
{
  "command_id": "4422a49f-9126-4fa4-9f75-0ed2c781169c"
}
```

```json
{
  "id": "237cdf4e-0ff0-40de-bace-f3cc222b23da",
  "order_id": "d01e9252-3cca-480a-92a9-3de812681982",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a407675-6867-4422-91f5-3b719b5576c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a407675-6867-4422-91f5-3b719b5576c6",
  "order_id": "d01e9252-3cca-480a-92a9-3de812681982",
  "assignment_id": "237cdf4e-0ff0-40de-bace-f3cc222b23da",
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
    "phone": "+3806711110139"
  }
}
```

`POST /api/driver/v1/work-sessions/b8ff3b7b-7c94-4f99-bd76-1c32969d93b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T10:26:30Z",
    "sequence": 1793269590619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b8ff3b7b-7c94-4f99-bd76-1c32969d93b5",
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
  "last_heartbeat_at": "2026-10-29T10:26:30.637813Z",
  "last_location_at": "2026-10-29T10:26:30.637813Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1a407675-6867-4422-91f5-3b719b5576c6/arrive` → **200**

```json
{
  "command_id": "53283c18-3083-47f1-b61f-f08ffe1b4219",
  "expected_version": 0
}
```

```json
{
  "id": "1a407675-6867-4422-91f5-3b719b5576c6",
  "order_id": "d01e9252-3cca-480a-92a9-3de812681982",
  "assignment_id": "237cdf4e-0ff0-40de-bace-f3cc222b23da",
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
  "arrived_at": "2026-10-29T10:26:30.922042Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711110139"
  }
}
```

`POST /api/driver/v1/trips/1a407675-6867-4422-91f5-3b719b5576c6/start` → **200**

```json
{
  "command_id": "f1a36529-afa7-4384-bf22-775950c21992",
  "expected_version": 1
}
```

```json
{
  "id": "1a407675-6867-4422-91f5-3b719b5576c6",
  "order_id": "d01e9252-3cca-480a-92a9-3de812681982",
  "assignment_id": "237cdf4e-0ff0-40de-bace-f3cc222b23da",
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
  "arrived_at": "2026-10-29T10:26:30.922042Z",
  "started_at": "2026-10-29T10:26:31.213948Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711110139"
  }
}
```

`POST /api/driver/v1/trips/1a407675-6867-4422-91f5-3b719b5576c6/complete` → **200**

```json
{
  "command_id": "2b158eca-7009-4dac-b384-5e5012a6a867",
  "expected_version": 2,
  "reported_at": "2026-10-29T10:26:31Z",
  "cash_received": true
}
```

```json
{
  "id": "1a407675-6867-4422-91f5-3b719b5576c6",
  "order_id": "d01e9252-3cca-480a-92a9-3de812681982",
  "assignment_id": "237cdf4e-0ff0-40de-bace-f3cc222b23da",
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
  "arrived_at": "2026-10-29T10:26:30.922042Z",
  "started_at": "2026-10-29T10:26:31.213948Z",
  "completed_at": "2026-10-29T10:26:31.497738Z",
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
  "command_id": "295edc5e-edb9-41bc-a1f3-05b8e6b5190a",
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
  "id": "1c822fb3-f551-4058-b71d-07d514cce358",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T10:31:31.799191Z",
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
  "command_id": "a0776b3a-73fd-421d-aae6-dc7c1518002e",
  "quote_id": "1c822fb3-f551-4058-b71d-07d514cce358",
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
    "phone": "+3806711130991"
  }
}
```

```json
{
  "id": "8790f827-570e-4eea-93cf-2eccf5899b3a",
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
  "created_at": "2026-10-29T10:26:32.114846Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130991"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```
