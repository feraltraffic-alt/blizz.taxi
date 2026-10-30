# Sandbox transcript (2026-10-30T09:22:18Z, 56e1e10)

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
  "correlation_id": "96e68566-aefd-4691-a423-1c1073019d45"
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
  "session_id": "75d96de4-87fc-4237-ab1c-de37a90540a0",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwNDgsImlhdCI6MTc5MzM1MjE0OCwianRpIjoiYjU3ZDM3ZGUtMjhjYS00MGRmLWE2Y2YtMDc1MWZkYzVkNmZhIiwic2lkIjoiNzVkOTZkZTQtODdmYy00MjM3LWFiMWMtZGUzN2E5MDU0MGEwIn0.99_kgsX10VzF9XuGwxLE6brYskNXLMu4HaFiHWdjcf4",
  "access_expires_at": "2026-10-30T09:37:28.210369999Z",
  "refresh_token": "iPQvPuhhwxG627pQbtaHHq5Ib2JnOLLGZnnC1KWGrgc",
  "refresh_expires_at": "2026-10-30T21:22:28.208429576Z",
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
  "session_id": "3f5cde9a-4d86-45a1-95b7-9c4ebc8bc966",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwNTAsImlhdCI6MTc5MzM1MjE1MCwianRpIjoiYjc1OTY2ZGQtZWEyNC00Y2ZlLThhMzEtMDg3Y2M5MjJjZGNhIiwic2lkIjoiM2Y1Y2RlOWEtNGQ4Ni00NWExLTk1YjctOWM0ZWJjOGJjOTY2In0.9QEFWn3Imky4IRoxaXMykZTzzwIX3nZTYr7_xLeiQXc",
  "access_expires_at": "2026-10-30T09:37:30.109661035Z",
  "refresh_token": "sNkbRNo0IO6giPweQT6VYwzTedsDjYx8kP8aDXn18cA",
  "refresh_expires_at": "2026-10-30T21:22:30.108413573Z",
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
  "device_ref": "sandbox-28215"
}
```

```json
{
  "challenge_id": "c2b9b5b9-86c9-458b-8137-d895447a2283",
  "expires_at": "2026-10-30T09:27:30.729940823Z",
  "resend_available_at": "2026-10-30T09:22:31.729940823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "537700",
  "sent_at": "2026-10-30T09:22:30.742986816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2b9b5b9-86c9-458b-8137-d895447a2283",
  "code": "537700",
  "device_ref": "sandbox-28215"
}
```

```json
{
  "session_id": "99728501-8ff7-499e-9a65-efe678ed5f20",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzA1MSwiaWF0IjoxNzkzMzUyMTUxLCJqdGkiOiJhNjJhYTdkZi1kOWVkLTRlMTEtYTU1OS1lOGRlMzVlMWY2MDMiLCJzaWQiOiI5OTcyODUwMS04ZmY3LTQ5OWUtOWE2NS1lZmU2NzhlZDVmMjAifQ.NmENoCCrwkX5GYzXhKKOtmAO-JjMvA96Tr30G-X6V3Q",
  "access_expires_at": "2026-10-30T09:37:31.08475495Z",
  "refresh_token": "nTfSzdAokKIQkBRT6y3C1thkCtUyvp-DwZyDqZ5eScQ",
  "refresh_expires_at": "2026-11-29T09:22:31.083721031Z",
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
  "command_id": "fd1d44d1-b9b1-4f13-adbb-2cc7d606617e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:22:31Z",
    "sequence": 1793352151669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4020fd86-fcd2-441f-b32a-b3e8260f2c17",
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
  "last_heartbeat_at": "2026-10-30T09:22:31.776021Z",
  "last_location_at": "2026-10-30T09:22:31.776021Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632176360",
  "device_ref": "sandbox-3131"
}
```

```json
{
  "challenge_id": "0436c4f2-5d43-4184-98d8-fa4f9a1ed18a",
  "expires_at": "2026-10-30T09:27:32.067495247Z",
  "resend_available_at": "2026-10-30T09:22:33.067495247Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632176360` → **200**

```json
{
  "phone": "+380632176360",
  "audience": "CLIENT",
  "code": "889782",
  "sent_at": "2026-10-30T09:22:32.072277284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0436c4f2-5d43-4184-98d8-fa4f9a1ed18a",
  "code": "889782",
  "device_ref": "sandbox-3131"
}
```

```json
{
  "session_id": "d555abc9-76a7-4a14-8657-9cb6cb0cbcba",
  "subject": {
    "type": "CLIENT",
    "id": "ccb74f24-3a34-40c3-bf96-f5d8967bbdd7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjY2I3NGYyNC0zYTM0LTQwYzMtYmY5Ni1mNWQ4OTY3YmJkZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMDUyLCJpYXQiOjE3OTMzNTIxNTIsImp0aSI6ImM2MDFkN2IwLTRkOTMtNDBlOS05MTI5LWM4ZGY0YmZhZDkxMiIsInNpZCI6ImQ1NTVhYmM5LTc2YTctNGExNC04NjU3LTljYjZjYjBjYmNiYSJ9.aMJOcAXxURjehWNiKB0g-LPb2HrtAe3F8dNzubBbQVc",
  "access_expires_at": "2026-10-30T09:37:32.400818958Z",
  "refresh_token": "G-Kulqs2jHiXAS72GgsTZBMkuEwDD5tPwLkuqVWgHiE",
  "refresh_expires_at": "2026-11-29T09:22:32.39991446Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c07c13e0-fef9-482c-8d24-369d86f7e24c",
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
  "id": "5dcf515c-c03d-4448-8098-c4a6e062f4c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:27:32.752896Z",
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
  "command_id": "1040ce28-2752-4435-b61d-94bbdb8264d3",
  "quote_id": "5dcf515c-c03d-4448-8098-c4a6e062f4c5",
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
  "id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ccb74f24-3a34-40c3-bf96-f5d8967bbdd7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:22:33.185701Z",
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
    "id": "27a4caed-38b5-49c3-b6a5-012b5bb69959",
    "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
    "expires_at": "2026-10-30T09:22:48.196746Z",
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

`POST /api/driver/v1/offers/27a4caed-38b5-49c3-b6a5-012b5bb69959/accept` → **200**

```json
{
  "command_id": "ab4078e8-9538-4d84-9a84-cfb7a77f47e1"
}
```

```json
{
  "id": "c5322c07-ae7a-4975-8242-ce1783b70f04",
  "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c84ced7-e93c-4521-bbc1-0a2c33b6e931",
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
  "command_id": "4dff4e18-fbce-4d9e-8377-9807fb97d08b",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:22:34.492615666Z"
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
  "id": "1c84ced7-e93c-4521-bbc1-0a2c33b6e931",
  "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
  "assignment_id": "c5322c07-ae7a-4975-8242-ce1783b70f04",
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

`POST /api/driver/v1/work-sessions/4020fd86-fcd2-441f-b32a-b3e8260f2c17/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:22:35Z",
    "sequence": 1793352155397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4020fd86-fcd2-441f-b32a-b3e8260f2c17",
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
  "last_heartbeat_at": "2026-10-30T09:22:35.422588Z",
  "last_location_at": "2026-10-30T09:22:35.422588Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1c84ced7-e93c-4521-bbc1-0a2c33b6e931/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f3c5c6c5-fdc7-4033-b674-4052d2756c29",
  "expected_version": 0
}
```

```json
{
  "id": "1c84ced7-e93c-4521-bbc1-0a2c33b6e931",
  "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
  "assignment_id": "c5322c07-ae7a-4975-8242-ce1783b70f04",
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
  "arrived_at": "2026-10-30T09:22:35.727822Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1c84ced7-e93c-4521-bbc1-0a2c33b6e931/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "cc3fedef-0ff1-4b6d-ba88-8cbb54dc7bd2",
  "expected_version": 1
}
```

```json
{
  "id": "1c84ced7-e93c-4521-bbc1-0a2c33b6e931",
  "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
  "assignment_id": "c5322c07-ae7a-4975-8242-ce1783b70f04",
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
  "arrived_at": "2026-10-30T09:22:35.727822Z",
  "started_at": "2026-10-30T09:22:36.051086Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1c84ced7-e93c-4521-bbc1-0a2c33b6e931/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "53b5a68c-b4b7-4efb-946a-f5409499fc57",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:22:36Z",
  "cash_received": true
}
```

```json
{
  "id": "1c84ced7-e93c-4521-bbc1-0a2c33b6e931",
  "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
  "assignment_id": "c5322c07-ae7a-4975-8242-ce1783b70f04",
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
  "arrived_at": "2026-10-30T09:22:35.727822Z",
  "started_at": "2026-10-30T09:22:36.051086Z",
  "completed_at": "2026-10-30T09:22:36.372167Z",
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
  "session_id": "4020fd86-fcd2-441f-b32a-b3e8260f2c17",
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
  "last_heartbeat_at": "2026-10-30T09:22:35.422588Z",
  "last_location_at": "2026-10-30T09:22:35.422588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4020fd86-fcd2-441f-b32a-b3e8260f2c17/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2971dfa3-f94d-48e1-9039-7a27583185eb",
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
  "command_id": "70d5ce8e-477e-4349-9b90-e9dc435ea9e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:22:37Z",
    "sequence": 1793352157304
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
  "correlation_id": "bdb6f486-6988-48d7-9e4b-3b7c549b2d50",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "078f3e02-4270-4f61-a43e-700d7ecde402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:22:37Z",
    "sequence": 1793352157619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fb536c47-97a2-41ba-8391-f4b3283323e9",
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
  "last_heartbeat_at": "2026-10-30T09:22:37.645121Z",
  "last_location_at": "2026-10-30T09:22:37.645121Z",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:22:34.492616Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "392da112-b253-49f6-8718-6c0f07f5bd77",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:22:38.287080244Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fb536c47-97a2-41ba-8391-f4b3283323e9",
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
  "last_heartbeat_at": "2026-10-30T09:22:37.645121Z",
  "last_location_at": "2026-10-30T09:22:37.645121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fb536c47-97a2-41ba-8391-f4b3283323e9/close` → **200**

```json
{
  "command_id": "205fca83-ece8-4364-8342-9a525bc22da3",
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
  "session_id": "812e6d79-5677-4c8b-a13e-458e0d0e33d8",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwNTksImlhdCI6MTc5MzM1MjE1OSwianRpIjoiN2I4NzIxOTEtZDBmYS00NmM0LTg5ZmMtMTQ0NmI4M2IzNjlmIiwic2lkIjoiODEyZTZkNzktNTY3Ny00YzhiLWExM2UtNDU4ZTBkMGUzM2Q4In0.CbE_539x66GCGBFbai0-zR8tP-K0rHYhtXb2Vf7AWTg",
  "access_expires_at": "2026-10-30T09:37:39.494569592Z",
  "refresh_token": "GpvI-ccfOt41TqNGoKgFsM9w8tG9yopLW24kFW_rLnk",
  "refresh_expires_at": "2026-10-30T21:22:39.49375201Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "90e91aa3-f8ac-47e2-b560-77c9d5cba1b1",
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
  "id": "21f53089-c3fe-4a1b-aaa4-ce77958286c2",
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
  "created_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "created_at": "2026-10-30T09:22:39.79561Z",
  "updated_at": "2026-10-30T09:22:39.79561Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630434774",
  "device_ref": "sandbox-5868"
}
```

```json
{
  "challenge_id": "111cede3-1ffe-4e86-9fae-86dae1ec4ced",
  "expires_at": "2026-10-30T09:27:40.117229811Z",
  "resend_available_at": "2026-10-30T09:22:41.117229811Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630434774` → **200**

```json
{
  "phone": "+380630434774",
  "audience": "CLIENT",
  "code": "083633",
  "sent_at": "2026-10-30T09:22:40.122590743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "111cede3-1ffe-4e86-9fae-86dae1ec4ced",
  "code": "083633",
  "device_ref": "sandbox-5868"
}
```

```json
{
  "session_id": "7a842ad0-a613-4466-b886-8fabbfbdc1b5",
  "subject": {
    "type": "CLIENT",
    "id": "c618fc6f-edee-4784-ad3d-a11a07d199c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjE4ZmM2Zi1lZGVlLTQ3ODQtYWQzZC1hMTFhMDdkMTk5YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMDYwLCJpYXQiOjE3OTMzNTIxNjAsImp0aSI6IjM4ZDY5ODMwLTdmZTMtNDdiNi04Njg1LTliMmY5ODQzZmY5ZCIsInNpZCI6IjdhODQyYWQwLWE2MTMtNDQ2Ni1iODg2LThmYWJiZmJkYzFiNSJ9.QhXQdgYxU2ulBsJfglPDKhZPx57S_E5-HK0-nndmrNc",
  "access_expires_at": "2026-10-30T09:37:40.449026068Z",
  "refresh_token": "iHO17fPQQBOql7QDvNDlgqzj8ZTmRRkDkRNWpLP0dPU",
  "refresh_expires_at": "2026-11-29T09:22:40.448220333Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630434774` → **200**

```json
{
  "client_id": "c618fc6f-edee-4784-ad3d-a11a07d199c0"
}
```

`POST /api/admin/v1/rider-wallets/c618fc6f-edee-4784-ad3d-a11a07d199c0/top-ups` → **201**

```json
{
  "command_id": "9585068d-5deb-40b4-b889-0a211e2023c5",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "c618fc6f-edee-4784-ad3d-a11a07d199c0",
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
      "id": "c8a80053-ca79-4e84-8d4f-ddd420fca455",
      "at": "2026-10-30T09:22:41.038993Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ce24dfc-1c0d-4c5f-8b1f-7ed2c4c28a00",
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
  "id": "dcc312b1-fad6-4b4a-911e-141f36be34ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:27:41.362987Z",
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
      "id": "21f53089-c3fe-4a1b-aaa4-ce77958286c2",
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
  "device_ref": "sandbox-12625"
}
```

```json
{
  "challenge_id": "9da049a2-6ea1-409d-ac84-48df6920dd9d",
  "expires_at": "2026-10-30T09:27:41.659083853Z",
  "resend_available_at": "2026-10-30T09:22:42.659083853Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "674089",
  "sent_at": "2026-10-30T09:22:41.663883059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9da049a2-6ea1-409d-ac84-48df6920dd9d",
  "code": "674089",
  "device_ref": "sandbox-12625"
}
```

```json
{
  "session_id": "69e696f5-2d05-4ccf-9e91-7d4f83710ec1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzA2MSwiaWF0IjoxNzkzMzUyMTYxLCJqdGkiOiI1M2Y0YWI5My1mNjMyLTQyNTEtOTU5YS1iMTc1ZjQ0MWQ1NmEiLCJzaWQiOiI2OWU2OTZmNS0yZDA1LTRjY2YtOWU5MS03ZDRmODM3MTBlYzEifQ.-rHiEVFUMO0kFVc1Cfd7jcX6s8PXAyABJ65JiK7VILo",
  "access_expires_at": "2026-10-30T09:37:41.995247157Z",
  "refresh_token": "d6-RE68XJ6rfX7WehddXeIp8cIiHVCsMlrTKzzBi9N4",
  "refresh_expires_at": "2026-11-29T09:22:41.994248381Z",
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
  "command_id": "46180905-b7dc-41c0-a6e5-fdb3b3498e3f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:22:42Z",
    "sequence": 1793352162569
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6d111b01-33da-426d-a70e-6718e2b0b8b7",
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
  "last_heartbeat_at": "2026-10-30T09:22:42.590745Z",
  "last_location_at": "2026-10-30T09:22:42.590745Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4a0fac33-6775-4e15-8edc-cb15625c5a41",
  "quote_id": "dcc312b1-fad6-4b4a-911e-141f36be34ae",
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
  "id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c618fc6f-edee-4784-ad3d-a11a07d199c0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:22:42.933116Z",
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
  "client_id": "c618fc6f-edee-4784-ad3d-a11a07d199c0",
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
      "id": "c8a80053-ca79-4e84-8d4f-ddd420fca455",
      "at": "2026-10-30T09:22:41.038993Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
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
    "id": "135f3dda-2a84-44fe-aeba-2330db388767",
    "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
    "expires_at": "2026-10-30T09:22:57.942836Z",
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

`POST /api/driver/v1/offers/135f3dda-2a84-44fe-aeba-2330db388767/accept` → **200**

```json
{
  "command_id": "8da2e092-6a6a-4179-a66d-79b97d53a91f"
}
```

```json
{
  "id": "ea7c0f03-d83a-4d6d-b03c-7ab2a677289a",
  "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49aae060-8ab5-49bf-bfb0-55b798161755",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "49aae060-8ab5-49bf-bfb0-55b798161755",
  "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
  "assignment_id": "ea7c0f03-d83a-4d6d-b03c-7ab2a677289a",
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

`POST /api/driver/v1/work-sessions/6d111b01-33da-426d-a70e-6718e2b0b8b7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:22:44Z",
    "sequence": 1793352164421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6d111b01-33da-426d-a70e-6718e2b0b8b7",
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
  "last_heartbeat_at": "2026-10-30T09:22:44.443239Z",
  "last_location_at": "2026-10-30T09:22:44.443239Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/49aae060-8ab5-49bf-bfb0-55b798161755/arrive` → **200**

```json
{
  "command_id": "3bc68550-4f8c-4615-8e8a-c0a2c6a11873",
  "expected_version": 0
}
```

```json
{
  "id": "49aae060-8ab5-49bf-bfb0-55b798161755",
  "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
  "assignment_id": "ea7c0f03-d83a-4d6d-b03c-7ab2a677289a",
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
  "arrived_at": "2026-10-30T09:22:44.740673Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/49aae060-8ab5-49bf-bfb0-55b798161755/start` → **200**

```json
{
  "command_id": "398b6cd4-5cd7-4f25-87dc-e4e3e7021c3b",
  "expected_version": 1
}
```

```json
{
  "id": "49aae060-8ab5-49bf-bfb0-55b798161755",
  "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
  "assignment_id": "ea7c0f03-d83a-4d6d-b03c-7ab2a677289a",
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
  "arrived_at": "2026-10-30T09:22:44.740673Z",
  "started_at": "2026-10-30T09:22:45.057725Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/49aae060-8ab5-49bf-bfb0-55b798161755/complete` → **200**

```json
{
  "command_id": "420d774d-d705-484b-9887-eb1e27757ed4",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:22:45Z",
  "cash_received": true
}
```

```json
{
  "id": "49aae060-8ab5-49bf-bfb0-55b798161755",
  "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
  "assignment_id": "ea7c0f03-d83a-4d6d-b03c-7ab2a677289a",
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
  "arrived_at": "2026-10-30T09:22:44.740673Z",
  "started_at": "2026-10-30T09:22:45.057725Z",
  "completed_at": "2026-10-30T09:22:45.399806Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c618fc6f-edee-4784-ad3d-a11a07d199c0",
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
      "id": "6c3a7006-3867-4479-9c55-e5eb21126a72",
      "at": "2026-10-30T09:22:46.35528Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c"
    },
    {
      "id": "c8a80053-ca79-4e84-8d4f-ddd420fca455",
      "at": "2026-10-30T09:22:41.038993Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/21f53089-c3fe-4a1b-aaa4-ce77958286c2/archive` → **200**

```json
{
  "command_id": "bdc7725e-d85e-4275-bf76-830309032a28",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "21f53089-c3fe-4a1b-aaa4-ce77958286c2",
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
  "created_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "created_at": "2026-10-30T09:22:39.79561Z",
  "updated_at": "2026-10-30T09:22:49.010702Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6d111b01-33da-426d-a70e-6718e2b0b8b7",
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
  "last_heartbeat_at": "2026-10-30T09:22:44.443239Z",
  "last_location_at": "2026-10-30T09:22:44.443239Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6d111b01-33da-426d-a70e-6718e2b0b8b7/close` → **200**

```json
{
  "command_id": "5525bd19-a5a0-43e8-8d84-7d08aab9ffe8",
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

Done: order e9a6bbdb-db52-490f-bdcb-c7f959a4711c.

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
  "session_id": "6ddea943-e1bc-417f-843e-86e53e576fa2",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwNzAsImlhdCI6MTc5MzM1MjE3MCwianRpIjoiYzVjZmZlM2QtYmIyYS00ODIxLTk0YzktZjc2M2VjMjM5NmNlIiwic2lkIjoiNmRkZWE5NDMtZTFiYy00MTdmLTg0M2UtODZlNTNlNTc2ZmEyIn0.SrqPdC0WrILQhX9KOyacx2dC_6hFxZYBPMV1FndfKxY",
  "access_expires_at": "2026-10-30T09:37:50.230353509Z",
  "refresh_token": "kVnGsHXpCXc5CcfMudNDKMv-WUE5Ty6imMImV1iN9S0",
  "refresh_expires_at": "2026-10-30T21:22:50.229650894Z",
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
  "command_id": "83fa4256-ce8c-4729-a730-ab7a33e98a68",
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
  "session_id": "bfe8c7e2-8ea6-49b4-b617-7e1a6247546f",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwNzEsImlhdCI6MTc5MzM1MjE3MSwianRpIjoiN2FkNzRmYjYtZmUwMS00MmVmLTljYzYtZDQ3MjRjYzc4YmE1Iiwic2lkIjoiYmZlOGM3ZTItOGVhNi00OWI0LWI2MTctN2UxYTYyNDc1NDZmIn0.yq_iAo6PTvwhouicaNL75U1mO9oJtEXYggg1WVKjmoM",
  "access_expires_at": "2026-10-30T09:37:51.410579338Z",
  "refresh_token": "njfMqiXwUE_-EHMK8q9rBmAw2QFX7JAZgCCKm5Oh4h4",
  "refresh_expires_at": "2026-10-30T21:22:51.409872929Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.300615932",
    "linkedid": "1730052700.300615932",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670044770"
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
    "id": "1730052700.300615932",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "5875a467-c448-4f33-9c22-a23f96c311b9",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:22:51.692284Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:22:51.718616Z",
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
    "id": "1730052600.54626620",
    "linkedid": "1730052600.54626620",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670044770"
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
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/de9c360b-8eb1-4062-9671-25f0f04e5112/answer` → **200**

```json
{
  "command_id": "1a476c2d-3a3a-4182-8d76-04e88e75667f"
}
```

```json
{
  "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670044770",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "order_ids": [],
  "started_at": "2026-10-30T09:22:52.051524Z",
  "answered_at": "2026-10-30T09:22:52.400284Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.54626620",
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
    "id": "1730052600.54626620",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": "2026-10-30T09:22:52.400284Z",
      "ended_at": "2026-10-30T09:22:52.72223Z",
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
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": "2026-10-30T09:22:52.400284Z",
      "ended_at": "2026-10-30T09:22:52.72223Z",
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
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": "2026-10-30T09:22:52.400284Z",
      "ended_at": "2026-10-30T09:22:52.72223Z",
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
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": "2026-10-30T09:22:52.400284Z",
      "ended_at": "2026-10-30T09:22:52.72223Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:22:57.976185Z"
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
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": "2026-10-30T09:22:52.400284Z",
      "ended_at": "2026-10-30T09:22:52.72223Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:22:57.976185Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/de9c360b-8eb1-4062-9671-25f0f04e5112/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/de9c360b-8eb1-4062-9671-25f0f04e5112/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=de9c360b-8eb1-4062-9671-25f0f04e5112` → **200**

```json
{
  "changes": [
    {
      "id": "0ec0dd9d-034b-4ec1-b24d-5832de0d1de0",
      "occurred_at": "2026-10-30T09:23:00.350761Z",
      "actor_type": "STAFF",
      "actor_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"3d94702e-9f45-4852-91b0-47e24f3d0441\", \"order_ids\": []}",
      "correlation_id": "efb8c8af-4e6a-4c75-9943-3934d9a1eee2"
    },
    {
      "id": "a90a67c9-4e64-444b-a4a4-1507305edf2e",
      "occurred_at": "2026-10-30T09:23:00.316354Z",
      "actor_type": "STAFF",
      "actor_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"3d94702e-9f45-4852-91b0-47e24f3d0441\", \"order_ids\": []}",
      "correlation_id": "39a8e3ff-63ae-407f-a328-94daf9f336a5"
    }
  ]
}
```

Done: call de9c360b-8eb1-4062-9671-25f0f04e5112 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12104"
}
```

```json
{
  "challenge_id": "13780b67-f02c-41f9-bf2e-e519cff1292d",
  "expires_at": "2026-10-30T09:28:00.705929447Z",
  "resend_available_at": "2026-10-30T09:23:01.705929447Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "749015",
  "sent_at": "2026-10-30T09:23:00.711030114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13780b67-f02c-41f9-bf2e-e519cff1292d",
  "code": "749015",
  "device_ref": "sandbox-12104"
}
```

```json
{
  "session_id": "00cf26b0-d465-4584-8d58-b5021cd76e30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzA4MSwiaWF0IjoxNzkzMzUyMTgxLCJqdGkiOiI5ZGJlODYzZS03NmYzLTQxODEtYmE2MS1lZTE2YzcyNjg4MWYiLCJzaWQiOiIwMGNmMjZiMC1kNDY1LTQ1ODQtOGQ1OC1iNTAyMWNkNzZlMzAifQ.czVoWvOCTzojTaLUCEXz_RhNwDp9HCqQ8bSIggmKwMU",
  "access_expires_at": "2026-10-30T09:38:01.032301022Z",
  "refresh_token": "qyotiwON79jEl2Ic7yWDbCuLDJ0YBJVezVZk_DeGB8M",
  "refresh_expires_at": "2026-11-29T09:23:01.031679914Z",
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
  "command_id": "a584684e-0bb7-4f59-8e97-3ccc6151dfbc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:01Z",
    "sequence": 1793352181621
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "98511c6d-671b-4ce6-8b90-e09e7d084b2e",
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
  "last_heartbeat_at": "2026-10-30T09:23:01.643957Z",
  "last_location_at": "2026-10-30T09:23:01.643957Z",
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
  "session_id": "9417d0ee-e61a-490b-a360-fa12eaeec3b7",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwODIsImlhdCI6MTc5MzM1MjE4MiwianRpIjoiMWJkN2I0OTYtYzQ0MS00ZGNlLWEzZTMtZGY3MWE5NTY1NDFlIiwic2lkIjoiOTQxN2QwZWUtZTYxYS00OTBiLWEzNjAtZmExMmVhZWVjM2I3In0.66L07lNWGD84vSqujZL920D2-DDIxSxif8PeNgmkVoQ",
  "access_expires_at": "2026-10-30T09:38:02.24163579Z",
  "refresh_token": "B2WCgFPU93eF_x-d57u8V_S63EtwcNbAoo-dpl0qCe8",
  "refresh_expires_at": "2026-10-30T21:23:02.240983692Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "163bba4d-1f2a-4d13-afb2-f0234a7d01fb",
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
  "id": "9a2fbd33-be04-41d8-bd8f-c319ad91f03a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:02.556492Z",
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
  "command_id": "f47a95f6-98f7-42f5-99fb-2e2d7d367127",
  "quote_id": "9a2fbd33-be04-41d8-bd8f-c319ad91f03a",
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
    "phone": "+380672771229"
  }
}
```

```json
{
  "id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
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
  "created_at": "2026-10-30T09:23:02.886893Z",
  "caller": {
    "name": "Олена",
    "phone": "+380672771229"
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
    "id": "3eb4a146-63b1-4cfc-b691-9ee7ceb3ddfe",
    "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
    "expires_at": "2026-10-30T09:23:17.892602Z",
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

`POST /api/driver/v1/offers/3eb4a146-63b1-4cfc-b691-9ee7ceb3ddfe/accept` → **200**

```json
{
  "command_id": "329fb9b6-2cbc-4a1b-95b3-8513a61c9d31"
}
```

```json
{
  "id": "ec820e7e-0277-4fcb-bf2a-a3fd7d673175",
  "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "760c406f-f471-4815-bde4-15a284f8cd31",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "760c406f-f471-4815-bde4-15a284f8cd31",
  "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
  "assignment_id": "ec820e7e-0277-4fcb-bf2a-a3fd7d673175",
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
    "phone": "+380672771229"
  }
}
```

`POST /api/driver/v1/work-sessions/98511c6d-671b-4ce6-8b90-e09e7d084b2e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:06Z",
    "sequence": 1793352186269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "98511c6d-671b-4ce6-8b90-e09e7d084b2e",
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
  "last_heartbeat_at": "2026-10-30T09:23:06.291397Z",
  "last_location_at": "2026-10-30T09:23:06.291397Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/760c406f-f471-4815-bde4-15a284f8cd31/arrive` → **200**

```json
{
  "command_id": "7742296a-1b3f-4360-9b08-8331b47dbcfd",
  "expected_version": 0
}
```

```json
{
  "id": "760c406f-f471-4815-bde4-15a284f8cd31",
  "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
  "assignment_id": "ec820e7e-0277-4fcb-bf2a-a3fd7d673175",
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
  "arrived_at": "2026-10-30T09:23:06.599736Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672771229"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  },
  {
    "phone": "+380672771229",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:08.235805648Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  },
  {
    "phone": "+380672771229",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:08.235805648Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380672771229` → **200**

```json
[
  {
    "phone": "+380672771229",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:05.222008912Z"
  },
  {
    "phone": "+380672771229",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:23:08.235805648Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/760c406f-f471-4815-bde4-15a284f8cd31/start` → **200**

```json
{
  "command_id": "5fbdcc83-f917-429d-b22c-f246e2cf235f",
  "expected_version": 1
}
```

```json
{
  "id": "760c406f-f471-4815-bde4-15a284f8cd31",
  "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
  "assignment_id": "ec820e7e-0277-4fcb-bf2a-a3fd7d673175",
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
  "arrived_at": "2026-10-30T09:23:06.599736Z",
  "started_at": "2026-10-30T09:23:09.066259Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380672771229"
  }
}
```

`POST /api/driver/v1/trips/760c406f-f471-4815-bde4-15a284f8cd31/complete` → **200**

```json
{
  "command_id": "b4d012d3-3785-4d96-b77b-4e946a73c6f2",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:23:09Z",
  "cash_received": true
}
```

```json
{
  "id": "760c406f-f471-4815-bde4-15a284f8cd31",
  "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
  "assignment_id": "ec820e7e-0277-4fcb-bf2a-a3fd7d673175",
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
  "arrived_at": "2026-10-30T09:23:06.599736Z",
  "started_at": "2026-10-30T09:23:09.066259Z",
  "completed_at": "2026-10-30T09:23:09.412038Z",
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
  "session_id": "98511c6d-671b-4ce6-8b90-e09e7d084b2e",
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
  "last_heartbeat_at": "2026-10-30T09:23:06.291397Z",
  "last_location_at": "2026-10-30T09:23:06.291397Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98511c6d-671b-4ce6-8b90-e09e7d084b2e/close` → **200**

```json
{
  "command_id": "a5a4a7f3-a8d7-4a02-adf4-0a116905647a",
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
  "phone": "+380638888708",
  "device_ref": "sandbox-24745"
}
```

```json
{
  "challenge_id": "c89bb2cd-87e5-4039-93fe-c65784f9637e",
  "expires_at": "2026-10-30T09:28:10.414981645Z",
  "resend_available_at": "2026-10-30T09:23:11.414981645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638888708` → **200**

```json
{
  "phone": "+380638888708",
  "audience": "CLIENT",
  "code": "937449",
  "sent_at": "2026-10-30T09:23:10.41963699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c89bb2cd-87e5-4039-93fe-c65784f9637e",
  "code": "937449",
  "device_ref": "sandbox-24745"
}
```

```json
{
  "session_id": "6f29bc78-666e-4677-b92a-8c703eff5fa0",
  "subject": {
    "type": "CLIENT",
    "id": "17d082cd-50a4-4aa7-a518-ba8b8e452245"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2QwODJjZC01MGE0LTRhYTctYTUxOC1iYThiOGU0NTIyNDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMDkwLCJpYXQiOjE3OTMzNTIxOTAsImp0aSI6IjcxYzdhNTBhLWFlNGMtNGI4ZC05ZWExLWRiNTE5NjY0YmRjYiIsInNpZCI6IjZmMjliYzc4LTY2NmUtNDY3Ny1iOTJhLThjNzAzZWZmNWZhMCJ9.bH59sWJpAQYjOcQx--nDH2lCfJyHqr-eGVaplNf0bMw",
  "access_expires_at": "2026-10-30T09:38:10.739601436Z",
  "refresh_token": "94q2MK_Dpoq9rywLpdb8UMp1Tmx-QjjSihBAWajq3q8",
  "refresh_expires_at": "2026-11-29T09:23:10.738948837Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-3888"
}
```

```json
{
  "challenge_id": "cf450e85-5d98-42e2-940f-5f41fe3f8a1f",
  "expires_at": "2026-10-30T09:28:11.327304533Z",
  "resend_available_at": "2026-10-30T09:23:12.327304533Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "367120",
  "sent_at": "2026-10-30T09:23:11.331592529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf450e85-5d98-42e2-940f-5f41fe3f8a1f",
  "code": "367120",
  "device_ref": "sandbox-3888"
}
```

```json
{
  "session_id": "1739e876-1416-4474-813c-78387a2fc337",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzA5MSwiaWF0IjoxNzkzMzUyMTkxLCJqdGkiOiIzNjE3NjIzYS1kOTAxLTQ1NWQtYmZiZi1hYTdlZjIzZDhjZmMiLCJzaWQiOiIxNzM5ZTg3Ni0xNDE2LTQ0NzQtODEzYy03ODM4N2EyZmMzMzcifQ.asI4V3YFyQeOkcaTskE2sOByU4FnD0FMRJpkaQpebEM",
  "access_expires_at": "2026-10-30T09:38:11.647596586Z",
  "refresh_token": "vHu674U0WxYAfrEAGS7YWCMdCP3QYQOF-Y7vH6cxehw",
  "refresh_expires_at": "2026-11-29T09:23:11.646994542Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "e96dfaf4-7a7a-463a-aaa6-987cb8791652",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwOTIsImlhdCI6MTc5MzM1MjE5MiwianRpIjoiODNiNjQ4N2EtN2JmZS00Nzc5LWI4M2ItMjYwOGQ4NjU4MWQ5Iiwic2lkIjoiZTk2ZGZhZjQtN2E3YS00NjNhLWFhYTYtOTg3Y2I4NzkxNjUyIn0.fMYYGh2FjPRqPm5yXxsRbj2o4CwTHUPB2AI5l9mwXeE",
  "access_expires_at": "2026-10-30T09:38:12.516213055Z",
  "refresh_token": "sPdFclEgyi4_g93tDfmApMRG7tTubn9I8IJiBAVIObQ",
  "refresh_expires_at": "2026-10-30T21:23:12.515585623Z",
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
  "session_id": "51611cef-126c-4e39-8a08-a5f9eb928930",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMwOTMsImlhdCI6MTc5MzM1MjE5MywianRpIjoiMjM2ZTUyNzYtNmJmNi00ZmM0LWI2OWMtODA3OWY0N2QyZjk0Iiwic2lkIjoiNTE2MTFjZWYtMTI2Yy00ZTM5LThhMDgtYTVmOWViOTI4OTMwIn0.9dBiUWwSjoy6m12HA7bHFYOer2_GxfOYr-pTc2n09IA",
  "access_expires_at": "2026-10-30T09:38:13.098137862Z",
  "refresh_token": "21IU19Qu358t_PhkBuWjGPgIeVrkTMKwzhJyIwbNVqU",
  "refresh_expires_at": "2026-10-30T21:23:13.097477889Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "8988894d-da32-4250-a914-8f0baf820ff4",
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
  "id": "f20bdea1-0853-4e8f-850f-0f7c2231618c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:13.678281Z",
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
  "command_id": "1bc4fbc2-57dd-4916-9932-7d2ed03fac72",
  "quote_id": "f20bdea1-0853-4e8f-850f-0f7c2231618c",
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
  "id": "a331dc70-cb0a-419d-bc12-d9df0db0cfb5",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17d082cd-50a4-4aa7-a518-ba8b8e452245",
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
  "created_at": "2026-10-30T09:23:13.982523Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a331dc70-cb0a-419d-bc12-d9df0db0cfb5` → **200**

```json
{
  "id": "a331dc70-cb0a-419d-bc12-d9df0db0cfb5",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17d082cd-50a4-4aa7-a518-ba8b8e452245",
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
  "created_at": "2026-10-30T09:23:13.982523Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a331dc70-cb0a-419d-bc12-d9df0db0cfb5/cancel` → **200**

```json
{
  "command_id": "278f5c1d-b223-477b-8589-d0d7f09faba7",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "a331dc70-cb0a-419d-bc12-d9df0db0cfb5",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "17d082cd-50a4-4aa7-a518-ba8b8e452245",
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
  "created_at": "2026-10-30T09:23:13.982523Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
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
  "command_id": "018152a6-a3b0-4183-bdd2-5b36f5b23d8d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:15Z",
    "sequence": 1793352195214
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "de838004-b962-4290-9b4e-f20545af6882",
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
  "last_heartbeat_at": "2026-10-30T09:23:15.235153Z",
  "last_location_at": "2026-10-30T09:23:15.235153Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15031"
}
```

```json
{
  "challenge_id": "1bcce6f6-37af-448e-8659-241b2e9e9205",
  "expires_at": "2026-10-30T09:28:15.526723836Z",
  "resend_available_at": "2026-10-30T09:23:16.526723836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "924937",
  "sent_at": "2026-10-30T09:23:15.531411777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bcce6f6-37af-448e-8659-241b2e9e9205",
  "code": "924937",
  "device_ref": "sandbox-15031"
}
```

```json
{
  "session_id": "f43ff851-3d2b-4643-90d7-1e2bd14813b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzA5NSwiaWF0IjoxNzkzMzUyMTk1LCJqdGkiOiIwYzM5NDgxOS1jODk0LTQxODctODBjOC1jY2JjMzY4MTdmNzYiLCJzaWQiOiJmNDNmZjg1MS0zZDJiLTQ2NDMtOTBkNy0xZTJiZDE0ODEzYjgifQ.YcQZfBxY7FYago3hnXBkR732gpYHtB8oFZSOmChKOY4",
  "access_expires_at": "2026-10-30T09:38:15.856949307Z",
  "refresh_token": "KA3yF-E_mz4SlpX3ogFEt4IAI9COxUsgmIPwRg4Qii8",
  "refresh_expires_at": "2026-11-29T09:23:15.856338105Z",
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
  "command_id": "5a987254-03f3-4f1a-8ec5-d51371887ff1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:16Z",
    "sequence": 1793352196427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:16.44996Z",
  "last_location_at": "2026-10-30T09:23:16.44996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5c6b962-e4f7-4737-b725-498d7f526ebc",
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
  "id": "ec69e722-3406-44b0-a1e5-452dc8b05ded",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:16.747503Z",
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
  "command_id": "ead52453-6ead-4ce0-a566-bbd2fd11d63f",
  "quote_id": "ec69e722-3406-44b0-a1e5-452dc8b05ded",
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
  "id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17d082cd-50a4-4aa7-a518-ba8b8e452245",
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
  "created_at": "2026-10-30T09:23:17.058262Z",
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
    "id": "321ad067-4da8-43d0-8e56-fa54b1fbbcff",
    "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
    "expires_at": "2026-10-30T09:23:32.06253Z",
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

`POST /api/driver/v1/offers/321ad067-4da8-43d0-8e56-fa54b1fbbcff/accept` → **200**

```json
{
  "command_id": "c8b8779c-b99b-44ff-b80d-0d76f09528a0"
}
```

```json
{
  "id": "782726e4-7730-4ea2-b306-e6033142bfa1",
  "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2138e461-0902-4612-a9ab-1385eebcb89a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2138e461-0902-4612-a9ab-1385eebcb89a",
  "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "assignment_id": "782726e4-7730-4ea2-b306-e6033142bfa1",
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

`POST /api/driver/v1/trips/2138e461-0902-4612-a9ab-1385eebcb89a/cancel` → **200**

```json
{
  "command_id": "36a19922-4be7-4826-a062-3862a19b5c45",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "2138e461-0902-4612-a9ab-1385eebcb89a",
  "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "assignment_id": "782726e4-7730-4ea2-b306-e6033142bfa1",
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

`GET /api/rider/v1/orders/6d661c89-230f-4437-9dbd-db5734b6e9b6` → **200**

```json
{
  "id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "17d082cd-50a4-4aa7-a518-ba8b8e452245",
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
    "id": "782726e4-7730-4ea2-b306-e6033142bfa1",
    "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2138e461-0902-4612-a9ab-1385eebcb89a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:23:17.058262Z",
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
    "id": "e8e7ce25-63ed-42fb-a816-13b1dda04b1f",
    "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
    "expires_at": "2026-10-30T09:23:33.302053Z",
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

`POST /api/driver/v1/offers/e8e7ce25-63ed-42fb-a816-13b1dda04b1f/accept` → **200**

```json
{
  "command_id": "d5b0793f-3f07-447a-a526-495bf7db9479"
}
```

```json
{
  "id": "da0b35e9-cf75-45c3-9b38-3e3c24808784",
  "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bfa75c40-dfd4-4d7d-b48f-f57c8c9b9791",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bfa75c40-dfd4-4d7d-b48f-f57c8c9b9791",
  "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "assignment_id": "da0b35e9-cf75-45c3-9b38-3e3c24808784",
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

`POST /api/driver/v1/trips/bfa75c40-dfd4-4d7d-b48f-f57c8c9b9791/cancel` → **200**

```json
{
  "command_id": "1be28b8a-9dc4-4050-a6d8-2e5a15c81a29",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "bfa75c40-dfd4-4d7d-b48f-f57c8c9b9791",
  "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
  "assignment_id": "da0b35e9-cf75-45c3-9b38-3e3c24808784",
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
    "id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:23:17.058262Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "a331dc70-cb0a-419d-bc12-d9df0db0cfb5",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:23:13.982523Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/6d661c89-230f-4437-9dbd-db5734b6e9b6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:23:17.058977Z",
      "actor": {
        "type": "CLIENT",
        "id": "17d082cd-50a4-4aa7-a518-ba8b8e452245",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
        "quote_id": "ec69e722-3406-44b0-a1e5-452dc8b05ded",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "15eea070-a081-46f3-9aa7-f92fa7247119"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:23:17.061456Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
        "attempt_id": "507ea10e-e6c9-42b3-93fb-e375ebe8036d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "15eea070-a081-46f3-9aa7-f92fa7247119"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:23:17.069775Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "321ad067-4da8-43d0-8e56-fa54b1fbbcff",
        "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "15eea070-a081-46f3-9aa7-f92fa7247119"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:23:17.680771Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "321ad067-4da8-43d0-8e56-fa54b1fbbcff",
        "order_id": "6d661c89-230f-4437-9dbd-db5734b6e9b6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "782726e4-7730-4ea2-b306-e6033142bfa1"
      },
      "correlation_id": "2b8488e5-eb51-4706-89eb-995bd212cbfb"
```

Done: orders a331dc70-cb0a-419d-bc12-d9df0db0cfb5, 6d661c89-230f-4437-9dbd-db5734b6e9b6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737764473",
  "device_ref": "sandbox-27820"
}
```

```json
{
  "challenge_id": "5affaa09-f139-4a4c-b807-867eb4b8e546",
  "expires_at": "2026-10-30T09:28:20.771741081Z",
  "resend_available_at": "2026-10-30T09:23:21.771741081Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737764473` → **200**

```json
{
  "phone": "+380737764473",
  "audience": "CLIENT",
  "code": "013239",
  "sent_at": "2026-10-30T09:23:20.775460149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5affaa09-f139-4a4c-b807-867eb4b8e546",
  "code": "013239",
  "device_ref": "sandbox-27820"
}
```

```json
{
  "session_id": "0e8e48cb-c66f-41fe-8157-8161f753bcfe",
  "subject": {
    "type": "CLIENT",
    "id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTUwNWE0ZS0xZDJlLTRhYTUtOGQzNy1lM2ZkYzlmNGQ1MDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTAxLCJpYXQiOjE3OTMzNTIyMDEsImp0aSI6ImI3ZTc2NjFhLTU0MjgtNDA2ZC1iZjg2LTJkZDgzMDVmMjJkZiIsInNpZCI6IjBlOGU0OGNiLWM2NmYtNDFmZS04MTU3LTgxNjFmNzUzYmNmZSJ9.io-IRoXscmoPBljgI7P4OdqhZprcmQBOFEIPTTMWfYA",
  "access_expires_at": "2026-10-30T09:38:21.097578643Z",
  "refresh_token": "EoBnMsoZ87mujQBSHxl7dPfrzBByW2N3_XJGqd9mYr4",
  "refresh_expires_at": "2026-11-29T09:23:21.09700433Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "33f384ad-bf37-4dcf-81c1-4799d229b291",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0ba9582e-1a3c-4dfb-92ae-49d2697ebbf5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0ba9582e-1a3c-4dfb-92ae-49d2697ebbf5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7b7c21e3d6f41f08cc5c246d7170d907",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0ba9582e-1a3c-4dfb-92ae-49d2697ebbf5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737764473"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0ba9582e-1a3c-4dfb-92ae-49d2697ebbf5",
  "expires_at": "2026-10-30T09:53:21.391615Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0ba9582e-1a3c-4dfb-92ae-49d2697ebbf5` → **200**

```json
{
  "id": "0ba9582e-1a3c-4dfb-92ae-49d2697ebbf5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:53:21.391615Z",
  "card": {
    "id": "39d9ca55-47ac-47f4-a3e5-9915581679ff",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2975",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:23:21.699868Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "39d9ca55-47ac-47f4-a3e5-9915581679ff",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2975",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:23:21.699868Z"
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
  "device_ref": "sandbox-22660"
}
```

```json
{
  "challenge_id": "7a62999d-185c-4044-9d60-ca1e038c094e",
  "expires_at": "2026-10-30T09:28:22.307931229Z",
  "resend_available_at": "2026-10-30T09:23:23.307931229Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "540581",
  "sent_at": "2026-10-30T09:23:22.311670533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a62999d-185c-4044-9d60-ca1e038c094e",
  "code": "540581",
  "device_ref": "sandbox-22660"
}
```

```json
{
  "session_id": "14e86ed9-7474-4f26-b60a-06aeda0e4c93",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzEwMiwiaWF0IjoxNzkzMzUyMjAyLCJqdGkiOiIxMTc4NzkyNi04ZjQzLTRmMGQtYTdhNi1mNzY3NzdiZTI5M2IiLCJzaWQiOiIxNGU4NmVkOS03NDc0LTRmMjYtYjYwYS0wNmFlZGEwZTRjOTMifQ.0tPQbS1g5mSo0Ff5mnBkMemeYvnb9hLzJTKARhr754s",
  "access_expires_at": "2026-10-30T09:38:22.63752004Z",
  "refresh_token": "c-UOO3zrcTcJpu7prCGkgoCrAqATb-cJHcWCSM9Q2AA",
  "refresh_expires_at": "2026-11-29T09:23:22.636913117Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:16.44996Z",
  "last_location_at": "2026-10-30T09:23:16.44996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e556b6e-7410-4b72-8816-34d6a8351f71/handover` → **200**

```json
{
  "command_id": "70a49a6a-a189-41b9-a2f9-6359d7d23369",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:16.44996Z",
  "last_location_at": "2026-10-30T09:23:16.44996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e556b6e-7410-4b72-8816-34d6a8351f71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:23Z",
    "sequence": 1793352203564
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:23.585346Z",
  "last_location_at": "2026-10-30T09:23:23.585346Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9ace8406-264f-408e-a1dd-c766f5bcc037",
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
  "id": "6434be1d-3511-4071-bb26-77ade0bc23f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:23.884423Z",
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
  "command_id": "6b379b00-458b-4172-8bc3-578f058659e8",
  "quote_id": "6434be1d-3511-4071-bb26-77ade0bc23f4",
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
  "id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
  "created_at": "2026-10-30T09:23:24.206684Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca` → **200**

```json
{
  "id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
  "created_at": "2026-10-30T09:23:24.206684Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca` → **200**

```json
{
  "id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
  "created_at": "2026-10-30T09:23:24.206684Z",
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
    "id": "c61c449e-e6a1-4cfe-ab2c-d266d140bfea",
    "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
    "expires_at": "2026-10-30T09:23:39.633471Z",
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

`POST /api/driver/v1/offers/c61c449e-e6a1-4cfe-ab2c-d266d140bfea/accept` → **200**

```json
{
  "command_id": "788232e7-778d-43ca-a26e-1b81a5f93d87"
}
```

```json
{
  "id": "b3d8a795-c135-4b36-baed-d29c132245e0",
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "assignment_id": "b3d8a795-c135-4b36-baed-d29c132245e0",
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

`POST /api/driver/v1/work-sessions/8e556b6e-7410-4b72-8816-34d6a8351f71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:27Z",
    "sequence": 1793352207141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:27.033793Z",
  "last_location_at": "2026-10-30T09:23:27.033793Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e08dd8bc-0409-4cf8-aae6-9bfc84115a78/arrive` → **200**

```json
{
  "command_id": "c259ac56-4514-4eb5-890e-3927736a1044",
  "expected_version": 0
}
```

```json
{
  "id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "assignment_id": "b3d8a795-c135-4b36-baed-d29c132245e0",
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
  "arrived_at": "2026-10-30T09:23:27.327793Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e08dd8bc-0409-4cf8-aae6-9bfc84115a78/start` → **200**

```json
{
  "command_id": "07f1da87-cd6a-4e2f-9c98-763d80f7f12c",
  "expected_version": 1
}
```

```json
{
  "id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "assignment_id": "b3d8a795-c135-4b36-baed-d29c132245e0",
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
  "arrived_at": "2026-10-30T09:23:27.327793Z",
  "started_at": "2026-10-30T09:23:27.646085Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e08dd8bc-0409-4cf8-aae6-9bfc84115a78/complete` → **200**

```json
{
  "command_id": "fb4ad476-d6f2-4f40-bd34-8b42f578926d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:23:27Z",
  "cash_received": true
}
```

```json
{
  "id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "assignment_id": "b3d8a795-c135-4b36-baed-d29c132245e0",
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
  "arrived_at": "2026-10-30T09:23:27.327793Z",
  "started_at": "2026-10-30T09:23:27.646085Z",
  "completed_at": "2026-10-30T09:23:27.976382Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca` → **200**

```json
{
  "id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
    "id": "b3d8a795-c135-4b36-baed-d29c132245e0",
    "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:23:24.206684Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca` → **200**

```json
{
  "id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
    "id": "b3d8a795-c135-4b36-baed-d29c132245e0",
    "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:23:24.206684Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca` → **200**

```json
{
  "id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
    "id": "b3d8a795-c135-4b36-baed-d29c132245e0",
    "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e08dd8bc-0409-4cf8-aae6-9bfc84115a78",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:23:24.206684Z",
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

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca/tip` → **200**

```json
{
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
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
  "available_until": "2026-10-31T09:23:27.976382Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca/tip` → **201**

```json
{
  "command_id": "11efae1c-4441-4de1-800e-9606489ae5db",
  "amount_minor": 2500
}
```

```json
{
  "id": "d6437e7f-1825-4bcb-b0af-d4b89b387adb",
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:23:31.834803Z"
}
```

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca/tip` → **200**

```json
{
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
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
  "available_until": "2026-10-31T09:23:27.976382Z",
  "open": false,
  "tip": {
    "id": "d6437e7f-1825-4bcb-b0af-d4b89b387adb",
    "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:23:31.834803Z"
  }
}
```

`GET /api/rider/v1/orders/af10a9d1-3f0d-49e6-ac51-7d052eb286ca/tip` → **200**

```json
{
  "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
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
  "available_until": "2026-10-31T09:23:27.976382Z",
  "open": false,
  "tip": {
    "id": "d6437e7f-1825-4bcb-b0af-d4b89b387adb",
    "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:23:31.834803Z"
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
      "id": "9705944d-4e55-4001-9939-01b99d522f3d",
      "at": "2026-10-30T09:23:28.712225Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
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
      "id": "c6c4d06f-32c2-4306-9036-a8d2a2041169",
      "at": "2026-10-30T09:23:33.783825Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
      "counterpart_id": null
    },
    {
      "id": "9705944d-4e55-4001-9939-01b99d522f3d",
      "at": "2026-10-30T09:23:28.712225Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c11ddddf-1ab9-4304-a466-e9508f54a6c6",
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
  "id": "0f9391c8-5ba8-4f2b-838d-9843394678ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:35.364763Z",
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
  "session_id": "d5f1e9c5-8976-44dc-b011-07805a0d9bc2",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxMTUsImlhdCI6MTc5MzM1MjIxNSwianRpIjoiYWFiYTFiMzMtNGRhOS00MzdjLWI0NTMtMDE1ZjRjNzRmNDZkIiwic2lkIjoiZDVmMWU5YzUtODk3Ni00NGRjLWIwMTEtMDc4MDVhMGQ5YmMyIn0.bp37jPB7jH9OWumGZ6125UqFbwqBt06n5cFGVqQ-0ds",
  "access_expires_at": "2026-10-30T09:38:35.967423938Z",
  "refresh_token": "yGUcW4BvaidZnaFJksqi1ZuHPlaa-MYW3sFusa4ePkI",
  "refresh_expires_at": "2026-10-30T21:23:35.966829858Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737764473` → **200**

```json
{
  "client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506"
}
```

`POST /api/admin/v1/rider-wallets/69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506/top-ups` → **201**

```json
{
  "command_id": "8f1dd4c0-9129-4d4d-beba-0e059cd9a2b0",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
      "id": "d2f4fdc0-a023-48e1-aabd-18b390f54b75",
      "at": "2026-10-30T09:23:36.578253Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "18bede6b-f5bc-4229-86ee-d5a37929e8d1",
  "quote_id": "0f9391c8-5ba8-4f2b-838d-9843394678ca",
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
  "id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
  "created_at": "2026-10-30T09:23:36.891246Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5d6377cd-01a8-444a-bb8d-957da167ac23` → **200**

```json
{
  "id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
  "created_at": "2026-10-30T09:23:36.891246Z",
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
    "id": "1c906041-abb2-4b5a-929a-38850ce1e595",
    "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
    "expires_at": "2026-10-30T09:23:51.896684Z",
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

`POST /api/driver/v1/offers/1c906041-abb2-4b5a-929a-38850ce1e595/accept` → **200**

```json
{
  "command_id": "c326e766-8ae0-4a00-85d5-9827f66a8632"
}
```

```json
{
  "id": "36dd3326-9988-4f9b-99c5-e792884dcdee",
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "04041511-1ddc-4c47-a2f6-aaca585da857",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "04041511-1ddc-4c47-a2f6-aaca585da857",
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "assignment_id": "36dd3326-9988-4f9b-99c5-e792884dcdee",
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

`POST /api/driver/v1/work-sessions/8e556b6e-7410-4b72-8816-34d6a8351f71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:38Z",
    "sequence": 1793352218407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:38.427342Z",
  "last_location_at": "2026-10-30T09:23:38.427342Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/04041511-1ddc-4c47-a2f6-aaca585da857/arrive` → **200**

```json
{
  "command_id": "5df13b32-ed51-4ec0-8945-01571caa85f3",
  "expected_version": 0
}
```

```json
{
  "id": "04041511-1ddc-4c47-a2f6-aaca585da857",
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "assignment_id": "36dd3326-9988-4f9b-99c5-e792884dcdee",
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
  "arrived_at": "2026-10-30T09:23:38.752711Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/04041511-1ddc-4c47-a2f6-aaca585da857/start` → **200**

```json
{
  "command_id": "b821044f-5e16-4f88-aeb6-4f3273407f19",
  "expected_version": 1
}
```

```json
{
  "id": "04041511-1ddc-4c47-a2f6-aaca585da857",
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "assignment_id": "36dd3326-9988-4f9b-99c5-e792884dcdee",
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
  "arrived_at": "2026-10-30T09:23:38.752711Z",
  "started_at": "2026-10-30T09:23:39.060454Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/04041511-1ddc-4c47-a2f6-aaca585da857/complete` → **200**

```json
{
  "command_id": "fe9802f9-6949-4d2c-ac9f-9aabe8ff8002",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:23:39Z",
  "cash_received": true
}
```

```json
{
  "id": "04041511-1ddc-4c47-a2f6-aaca585da857",
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "assignment_id": "36dd3326-9988-4f9b-99c5-e792884dcdee",
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
  "arrived_at": "2026-10-30T09:23:38.752711Z",
  "started_at": "2026-10-30T09:23:39.060454Z",
  "completed_at": "2026-10-30T09:23:39.373738Z",
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
  "client_id": "69505a4e-1d2e-4aa5-8d37-e3fdc9f4d506",
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
      "id": "d2f4fdc0-a023-48e1-aabd-18b390f54b75",
      "at": "2026-10-30T09:23:36.578253Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
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

`GET /api/rider/v1/orders/5d6377cd-01a8-444a-bb8d-957da167ac23/tip` → **200**

```json
{
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
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
  "available_until": "2026-10-31T09:23:39.373738Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5d6377cd-01a8-444a-bb8d-957da167ac23/tip` → **201**

```json
{
  "command_id": "986e9b76-9a04-4e22-96f3-66decfb3e719",
  "amount_minor": 2500
}
```

```json
{
  "id": "1f8b06be-9e08-4b8f-93cb-c3c9a683af95",
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:23:40.57873Z"
}
```

`GET /api/rider/v1/orders/5d6377cd-01a8-444a-bb8d-957da167ac23/tip` → **200**

```json
{
  "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
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
  "available_until": "2026-10-31T09:23:39.373738Z",
  "open": false,
  "tip": {
    "id": "1f8b06be-9e08-4b8f-93cb-c3c9a683af95",
    "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:23:40.57873Z"
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
      "id": "a98219c1-b601-4132-a2f8-58854ddeb236",
      "at": "2026-10-30T09:23:39.854991Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
      "counterpart_id": null
    },
    {
      "id": "c6c4d06f-32c2-4306-9036-a8d2a2041169",
      "at": "2026-10-30T09:23:33.783825Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
      "counterpart_id": null
    },
    {
      "id": "9705944d-4e55-4001-9939-01b99d522f3d",
      "at": "2026-10-30T09:23:28.712225Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
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
      "id": "48a41168-650a-4409-b457-6f5fbc3ff948",
      "at": "2026-10-30T09:23:41.900068Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
      "counterpart_id": null
    },
    {
      "id": "a98219c1-b601-4132-a2f8-58854ddeb236",
      "at": "2026-10-30T09:23:39.854991Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5d6377cd-01a8-444a-bb8d-957da167ac23",
      "counterpart_id": null
    },
    {
      "id": "c6c4d06f-32c2-4306-9036-a8d2a2041169",
      "at": "2026-10-30T09:23:33.783825Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
      "counterpart_id": null
    },
    {
      "id": "9705944d-4e55-4001-9939-01b99d522f3d",
      "at": "2026-10-30T09:23:28.712225Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "af10a9d1-3f0d-49e6-ac51-7d052eb286ca",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8e556b6e-7410-4b72-8816-34d6a8351f71",
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
  "last_heartbeat_at": "2026-10-30T09:23:38.427342Z",
  "last_location_at": "2026-10-30T09:23:38.427342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e556b6e-7410-4b72-8816-34d6a8351f71/close` → **200**

```json
{
  "command_id": "b6ff5de1-b0fc-439e-9a95-6a5c9f5d8cdc",
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

Done: card order 5d6377cd-01a8-444a-bb8d-957da167ac23.

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
  "phone": "+380736039450",
  "device_ref": "sandbox-31923"
}
```

```json
{
  "challenge_id": "53c3b997-727b-4cd6-a3bf-ccead21aa6c1",
  "expires_at": "2026-10-30T09:28:43.685953033Z",
  "resend_available_at": "2026-10-30T09:23:44.685953033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736039450` → **200**

```json
{
  "phone": "+380736039450",
  "audience": "CLIENT",
  "code": "022585",
  "sent_at": "2026-10-30T09:23:43.690513766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53c3b997-727b-4cd6-a3bf-ccead21aa6c1",
  "code": "022585",
  "device_ref": "sandbox-31923"
}
```

```json
{
  "session_id": "49a2c2ae-aab4-413c-942d-79e759f24d02",
  "subject": {
    "type": "CLIENT",
    "id": "6a6fd480-be82-4240-bc01-ce6913fb30a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTZmZDQ4MC1iZTgyLTQyNDAtYmMwMS1jZTY5MTNmYjMwYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTI0LCJpYXQiOjE3OTMzNTIyMjQsImp0aSI6IjM2ZjFkZjM4LWViZTItNGQ5ZC1iYzRjLWNkNDNiMGI0MzdmNSIsInNpZCI6IjQ5YTJjMmFlLWFhYjQtNDEzYy05NDJkLTc5ZTc1OWYyNGQwMiJ9.LoHmTES8kvhsnF0Z916z60OgsDLqAgryEcWLPmn6VQY",
  "access_expires_at": "2026-10-30T09:38:44.035283923Z",
  "refresh_token": "UPY0Qzio9sw_rfeQC2fUQzwctZrn6iR4_7s86JPsQSY",
  "refresh_expires_at": "2026-11-29T09:23:44.034714359Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "1b3c3eda-28be-4679-889c-20feb24f377c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "afccd13a-fb1f-4400-8a73-12174b24d998",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-afccd13a-fb1f-4400-8a73-12174b24d998",
    "orderDate": "1793352224",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3034f95f28fd67ba2692c63847e9e275",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=afccd13a-fb1f-4400-8a73-12174b24d998",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736039450"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=afccd13a-fb1f-4400-8a73-12174b24d998",
  "created_at": "2026-10-30T09:23:44.333833Z",
  "expires_at": "2026-10-30T09:53:44.333833Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/afccd13a-fb1f-4400-8a73-12174b24d998` → **200**

```json
{
  "id": "afccd13a-fb1f-4400-8a73-12174b24d998",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:23:44.333833Z",
  "expires_at": "2026-10-30T09:53:44.333833Z",
  "completed_at": "2026-10-30T09:23:44.639999Z",
  "masked_pan": "41****0258",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6a6fd480-be82-4240-bc01-ce6913fb30a5",
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
      "id": "002edbe6-1c6d-46cd-8c20-c722bf5a97a5",
      "at": "2026-10-30T09:23:44.918857Z",
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
  "client_id": "6a6fd480-be82-4240-bc01-ce6913fb30a5",
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
      "id": "002edbe6-1c6d-46cd-8c20-c722bf5a97a5",
      "at": "2026-10-30T09:23:44.918857Z",
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
  "device_ref": "sandbox-6555"
}
```

```json
{
  "challenge_id": "9c6410f0-7153-48f5-ae1d-1f65cebdca44",
  "expires_at": "2026-10-30T09:28:45.565955186Z",
  "resend_available_at": "2026-10-30T09:23:46.565955186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "013867",
  "sent_at": "2026-10-30T09:23:45.569027457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c6410f0-7153-48f5-ae1d-1f65cebdca44",
  "code": "013867",
  "device_ref": "sandbox-6555"
}
```

```json
{
  "session_id": "6b6f4a5b-bfdc-425b-a159-a1a345b22ea0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzEyNSwiaWF0IjoxNzkzMzUyMjI1LCJqdGkiOiI4OTFkNTUzZi00MGY1LTQ1YjktOGVkYS0zNTYyYjAxZTE5YzAiLCJzaWQiOiI2YjZmNGE1Yi1iZmRjLTQyNWItYTE1OS1hMWEzNDViMjJlYTAifQ.aYjAhDF8LlXKyaF4UfiAEK1brc5eZ6n4ASoAwfU5X9g",
  "access_expires_at": "2026-10-30T09:38:45.891452578Z",
  "refresh_token": "vPsgxB6yhzspgqRznz572bq82EKWzNMkPaFwY_h0WlU",
  "refresh_expires_at": "2026-11-29T09:23:45.89090759Z",
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
  "command_id": "a6b371f2-3f35-4f77-985f-cabc02258eb4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b95061ff-55b4-44d3-976e-b1dcd0bc0750",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b95061ff-55b4-44d3-976e-b1dcd0bc0750",
    "orderDate": "1793352226",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "4bad5851017d559f2a5a715232a5a243",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b95061ff-55b4-44d3-976e-b1dcd0bc0750",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b95061ff-55b4-44d3-976e-b1dcd0bc0750",
  "created_at": "2026-10-30T09:23:46.474804Z",
  "expires_at": "2026-10-30T09:53:46.474804Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b95061ff-55b4-44d3-976e-b1dcd0bc0750` → **200**

```json
{
  "id": "b95061ff-55b4-44d3-976e-b1dcd0bc0750",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:23:46.474804Z",
  "expires_at": "2026-10-30T09:53:46.474804Z",
  "completed_at": "2026-10-30T09:23:46.768214Z",
  "masked_pan": "41****1495",
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
      "id": "23ee0248-c179-437e-b483-52ac7d6d6d1f",
      "at": "2026-10-30T09:23:46.926508Z",
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
  "command_id": "df284019-99c0-444a-b37e-36bf329bc754",
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
  "correlation_id": "88acce8b-db7b-4ede-bccd-f8f0003e27f3"
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
  "device_ref": "sandbox-30273"
}
```

```json
{
  "challenge_id": "dc3130d1-15a9-4e39-bd17-684748c3b6eb",
  "expires_at": "2026-10-30T09:28:47.701695509Z",
  "resend_available_at": "2026-10-30T09:23:48.701695509Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "517113",
  "sent_at": "2026-10-30T09:23:47.704495256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc3130d1-15a9-4e39-bd17-684748c3b6eb",
  "code": "517113",
  "device_ref": "sandbox-30273"
}
```

```json
{
  "session_id": "8af63046-525e-480b-8d91-4fb1b325f791",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzEyOCwiaWF0IjoxNzkzMzUyMjI4LCJqdGkiOiJlNGQwMmRlMS0xMDBiLTRjNjAtYjA2ZC00ODZhYjUxNWNiNDMiLCJzaWQiOiI4YWY2MzA0Ni01MjVlLTQ4MGItOGQ5MS00ZmIxYjMyNWY3OTEifQ.zuHlzXbJdYZQWnWuxrCMlZ950E5g9LjQ8Cd7Xen5a3Q",
  "access_expires_at": "2026-10-30T09:38:48.027804134Z",
  "refresh_token": "MUhM-a1pTjiiQCD5j1zwVxi2bRNXe7ROjOmJOUKrp6E",
  "refresh_expires_at": "2026-11-29T09:23:48.02724483Z",
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
  "command_id": "8ae9d54e-a86f-416b-bbd0-b4a22479caf8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:48Z",
    "sequence": 1793352228610
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d0e73370-cf4a-4045-9147-a65197968e9d",
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
  "last_heartbeat_at": "2026-10-30T09:23:48.630625Z",
  "last_location_at": "2026-10-30T09:23:48.630625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630797560",
  "device_ref": "sandbox-8889"
}
```

```json
{
  "challenge_id": "0616d99e-560c-4de8-bac7-c62feb671785",
  "expires_at": "2026-10-30T09:28:48.929923155Z",
  "resend_available_at": "2026-10-30T09:23:49.929923155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630797560` → **200**

```json
{
  "phone": "+380630797560",
  "audience": "CLIENT",
  "code": "358183",
  "sent_at": "2026-10-30T09:23:48.933062656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0616d99e-560c-4de8-bac7-c62feb671785",
  "code": "358183",
  "device_ref": "sandbox-8889"
}
```

```json
{
  "session_id": "5f18f0df-ff93-4847-82ab-07110064640e",
  "subject": {
    "type": "CLIENT",
    "id": "8c93d9cf-5f18-42cb-8073-a3ba3faa42ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzkzZDljZi01ZjE4LTQyY2ItODA3My1hM2JhM2ZhYTQyYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTI5LCJpYXQiOjE3OTMzNTIyMjksImp0aSI6IjI0YzQ0ZDNiLTE0YTgtNDk1NS05YTczLTgyYmJlM2I1NTdhMCIsInNpZCI6IjVmMThmMGRmLWZmOTMtNDg0Ny04MmFiLTA3MTEwMDY0NjQwZSJ9.fOxBG9ZxvXhmVIZd2chggvvXrBcQJMFgcaHCOVlEbl0",
  "access_expires_at": "2026-10-30T09:38:49.250312654Z",
  "refresh_token": "PeTcuQR4ctvnyRb0_x8Dbq9UYQQ8ECbb0-nSrdgMZT8",
  "refresh_expires_at": "2026-11-29T09:23:49.249797662Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0a2ee992-d0e4-4435-b1ce-2606aaae2949",
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
  "id": "acfc5d2e-e9dd-4134-9cdc-96e0011f7f8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:49.546664Z",
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
  "command_id": "9102f0e3-e091-40e4-bdd1-57f308a25029",
  "quote_id": "acfc5d2e-e9dd-4134-9cdc-96e0011f7f8d",
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
  "id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c93d9cf-5f18-42cb-8073-a3ba3faa42ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:23:49.839639Z",
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
    "id": "07fa8524-7185-4458-9aee-eabf83eeed99",
    "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
    "expires_at": "2026-10-30T09:24:04.842719Z",
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

`POST /api/driver/v1/offers/07fa8524-7185-4458-9aee-eabf83eeed99/accept` → **200**

```json
{
  "command_id": "1805c618-f6d5-4ac2-a654-1b93b538d0f0"
}
```

```json
{
  "id": "f02fc2b7-cfdf-406e-91a7-d6a8f6556c83",
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a0866222-ec60-42cf-83d1-89095e9c7c9b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a0866222-ec60-42cf-83d1-89095e9c7c9b",
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "assignment_id": "f02fc2b7-cfdf-406e-91a7-d6a8f6556c83",
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

`POST /api/driver/v1/work-sessions/d0e73370-cf4a-4045-9147-a65197968e9d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:51Z",
    "sequence": 1793352231543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d0e73370-cf4a-4045-9147-a65197968e9d",
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
  "last_heartbeat_at": "2026-10-30T09:23:51.075202Z",
  "last_location_at": "2026-10-30T09:23:51.075202Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a0866222-ec60-42cf-83d1-89095e9c7c9b/arrive` → **200**

```json
{
  "command_id": "4efa4497-d20a-4fc6-8d90-462746ac806d",
  "expected_version": 0
}
```

```json
{
  "id": "a0866222-ec60-42cf-83d1-89095e9c7c9b",
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "assignment_id": "f02fc2b7-cfdf-406e-91a7-d6a8f6556c83",
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
  "arrived_at": "2026-10-30T09:23:51.385113Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a0866222-ec60-42cf-83d1-89095e9c7c9b/start` → **200**

```json
{
  "command_id": "0d9d87f1-f568-4fd1-b981-ce7740ac3ba5",
  "expected_version": 1
}
```

```json
{
  "id": "a0866222-ec60-42cf-83d1-89095e9c7c9b",
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "assignment_id": "f02fc2b7-cfdf-406e-91a7-d6a8f6556c83",
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
  "arrived_at": "2026-10-30T09:23:51.385113Z",
  "started_at": "2026-10-30T09:23:51.685539Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a0866222-ec60-42cf-83d1-89095e9c7c9b/complete` → **200**

```json
{
  "command_id": "13536220-03f8-4ec7-9108-53253d6af931",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:23:51Z",
  "cash_received": false
}
```

```json
{
  "id": "a0866222-ec60-42cf-83d1-89095e9c7c9b",
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "assignment_id": "f02fc2b7-cfdf-406e-91a7-d6a8f6556c83",
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
  "arrived_at": "2026-10-30T09:23:51.385113Z",
  "started_at": "2026-10-30T09:23:51.685539Z",
  "completed_at": "2026-10-30T09:23:52.008003Z",
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
  "session_id": "bec6d920-28de-4702-8d19-8bee3e82529c",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxMzIsImlhdCI6MTc5MzM1MjIzMiwianRpIjoiMDM5Y2MzOTctNmQ4Zi00ZmE2LTg5NTktYTk0MzdhMzZlMjdlIiwic2lkIjoiYmVjNmQ5MjAtMjhkZS00NzAyLThkMTktOGJlZTNlODI1MjljIn0.SLLZJW-C7OGho4mKwcArJb8i3vs9oMMmqn7YeGbsUPA",
  "access_expires_at": "2026-10-30T09:38:52.615411313Z",
  "refresh_token": "f0y3i3UWTvPutk0JgNes0-Y0FMEl5b2SuI5cZutjxbc",
  "refresh_expires_at": "2026-10-30T21:23:52.614870212Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b096a6e6-fbba-4a6e-b311-63865ccdb838"
}
```

`GET /api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute` → **200**

```json
{
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8c93d9cf-5f18-42cb-8073-a3ba3faa42ae",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:23:53.016723Z",
  "decide_by": "2026-11-13T09:23:53.016723Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:23:53.016723Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "8c93d9cf-5f18-42cb-8073-a3ba3faa42ae",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:23:53.016723Z",
      "decide_by": "2026-11-13T09:23:53.016723Z",
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

`POST /api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute/decide` → **400**

```json
{
  "command_id": "a6a72e64-968c-4350-85dd-4a3fb76b487e",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "14b038fd-def1-4464-ad72-78d4b4711d2b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute/decide` → **200**

```json
{
  "command_id": "70375899-6f2e-4395-aff2-de41c643b0c4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8c93d9cf-5f18-42cb-8073-a3ba3faa42ae",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:23:53.016723Z",
  "decide_by": "2026-11-13T09:23:53.016723Z",
  "decision": "PAY_DRIVER",
  "decided_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:23:55.159456Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute/decide` → **409**

```json
{
  "command_id": "3bd21e86-e8d0-4713-8902-a3c2a3a8d938",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/304ee0b8-46ea-4309-83a3-4373e5daf51e/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dd006c07-1527-48cf-b42b-c024084abfa7"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d0e73370-cf4a-4045-9147-a65197968e9d",
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
  "last_heartbeat_at": "2026-10-30T09:23:51.075202Z",
  "last_location_at": "2026-10-30T09:23:51.075202Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d0e73370-cf4a-4045-9147-a65197968e9d/close` → **200**

```json
{
  "command_id": "d1b748c0-6fa8-4622-9a0d-99088caf31b5",
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
  "phone": "+380730701374",
  "device_ref": "sandbox-14167"
}
```

```json
{
  "challenge_id": "63dffcf2-49ac-4f40-8c0c-156db36520f4",
  "expires_at": "2026-10-30T09:28:56.367683971Z",
  "resend_available_at": "2026-10-30T09:23:57.367683971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730701374` → **200**

```json
{
  "phone": "+380730701374",
  "audience": "CLIENT",
  "code": "986787",
  "sent_at": "2026-10-30T09:23:56.370979586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63dffcf2-49ac-4f40-8c0c-156db36520f4",
  "code": "986787",
  "device_ref": "sandbox-14167"
}
```

```json
{
  "session_id": "aabd1790-96a5-46a9-ab6b-fc572f6efe16",
  "subject": {
    "type": "CLIENT",
    "id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWY4MGM0Mi04Y2E1LTRlNzUtYjZlNC1jNjU2ZDJiOTY5YmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTM2LCJpYXQiOjE3OTMzNTIyMzYsImp0aSI6IjI3ZWRlYjVhLTAwOTEtNGQ5ZS05YTJjLWQ3MDJmNjU1M2JkNiIsInNpZCI6ImFhYmQxNzkwLTk2YTUtNDZhOS1hYjZiLWZjNTcyZjZlZmUxNiJ9.NnnJZUVf4OWWqaixm0-UDGG62j0uy9K-nwXgTkL-04E",
  "access_expires_at": "2026-10-30T09:38:56.706709527Z",
  "refresh_token": "rf_jy5ESNL9a4oq2GubsaEoE550FKDEhj7k9A_hcWao",
  "refresh_expires_at": "2026-11-29T09:23:56.706076492Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b382ae9f-3a2c-48d7-b461-311ac9f3d606",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8696b6d6-a60c-4d27-83fe-50edb31a8fd7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8696b6d6-a60c-4d27-83fe-50edb31a8fd7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4c4257166b71e27aa020b9ff7cbae693",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8696b6d6-a60c-4d27-83fe-50edb31a8fd7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730701374"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8696b6d6-a60c-4d27-83fe-50edb31a8fd7",
  "expires_at": "2026-10-30T09:53:57.002624Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8696b6d6-a60c-4d27-83fe-50edb31a8fd7` → **200**

```json
{
  "id": "8696b6d6-a60c-4d27-83fe-50edb31a8fd7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:53:57.002624Z",
  "card": {
    "id": "7efad3db-4f06-41f8-bd9b-e77a40c820d5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1629",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:23:57.320235Z"
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
  "device_ref": "sandbox-13920"
}
```

```json
{
  "challenge_id": "ad0a6030-e684-47b9-ad8f-69eebfb3e0ab",
  "expires_at": "2026-10-30T09:28:57.631358517Z",
  "resend_available_at": "2026-10-30T09:23:58.631358517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "168446",
  "sent_at": "2026-10-30T09:23:57.634691014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad0a6030-e684-47b9-ad8f-69eebfb3e0ab",
  "code": "168446",
  "device_ref": "sandbox-13920"
}
```

```json
{
  "session_id": "54edde03-8659-4267-8b24-f501e6d904eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzEzNywiaWF0IjoxNzkzMzUyMjM3LCJqdGkiOiI1ZDZiYWRiZC0yMjRkLTQ0YjEtYWUzNS0xY2ZjZTE5MDNmYmMiLCJzaWQiOiI1NGVkZGUwMy04NjU5LTQyNjctOGIyNC1mNTAxZTZkOTA0ZWIifQ.2IuxyqhX_ioBqmkY1JP_vNDHyszTeP6LPbRfFgWzzS0",
  "access_expires_at": "2026-10-30T09:38:57.962794985Z",
  "refresh_token": "Xocc_AQqVjnKFuKHCG7MsddCnFFqjSUNCzulSlk5kNg",
  "refresh_expires_at": "2026-11-29T09:23:57.962220081Z",
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
  "command_id": "85e55d49-9f88-4588-ba7b-391196890e4f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:23:58Z",
    "sequence": 1793352238551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dfb673aa-ee2b-4e0a-9c4c-837df4a20857",
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
  "last_heartbeat_at": "2026-10-30T09:23:58.571577Z",
  "last_location_at": "2026-10-30T09:23:58.571577Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "39965fca-7d63-4da2-9d04-b3b409196518",
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
  "id": "94ddad80-9a9b-444c-9fa7-4db695f7cbd3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:28:58.875419Z",
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
  "command_id": "65610acd-b4e6-49eb-a9f2-dd4d305276ca",
  "quote_id": "94ddad80-9a9b-444c-9fa7-4db695f7cbd3",
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
  "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
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
  "created_at": "2026-10-30T09:23:59.190106Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1` → **200**

```json
{
  "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
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
  "created_at": "2026-10-30T09:23:59.190106Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1` → **200**

```json
{
  "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
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
  "created_at": "2026-10-30T09:23:59.190106Z",
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
    "id": "147f9e44-9840-47f6-9252-1c0eabf76693",
    "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
    "expires_at": "2026-10-30T09:24:15.063275Z",
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

`POST /api/driver/v1/offers/147f9e44-9840-47f6-9252-1c0eabf76693/accept` → **200**

```json
{
  "command_id": "737842c4-e721-4839-86cf-fd3b3dc3e4ab"
}
```

```json
{
  "id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "assignment_id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
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

`POST /api/rider/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/messages` → **201**

```json
{
  "command_id": "3cb5e848-89ca-4c1e-bafe-6e615924dc70",
  "body": "Я біля входу, мій номер +380730701374, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "a7d77f4e-ba88-430f-a2c5-8a7efd37674a",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380730701374, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:24:02.01032035Z"
}
```

`POST /api/driver/v1/trips/f6b3ec3b-675c-445e-acda-8d126e0a1d72/messages` → **201**

```json
{
  "command_id": "905d7896-0b85-4482-9666-bedf68090ea9",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "9e28a370-b6dc-40b5-b59d-83605a1d722e",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:24:02.324218937Z"
}
```

`POST /api/driver/v1/work-sessions/dfb673aa-ee2b-4e0a-9c4c-837df4a20857/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:24:02Z",
    "sequence": 1793352242619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dfb673aa-ee2b-4e0a-9c4c-837df4a20857",
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
  "last_heartbeat_at": "2026-10-30T09:24:02.639868Z",
  "last_location_at": "2026-10-30T09:24:02.639868Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f6b3ec3b-675c-445e-acda-8d126e0a1d72/arrive` → **200**

```json
{
  "command_id": "7a5a9481-1800-4936-9d26-62a29d1f1f7a",
  "expected_version": 0
}
```

```json
{
  "id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "assignment_id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
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
  "arrived_at": "2026-10-30T09:24:02.945639Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f6b3ec3b-675c-445e-acda-8d126e0a1d72/start` → **200**

```json
{
  "command_id": "20e635fa-833f-49f8-a1c9-461ea5cff86c",
  "expected_version": 1
}
```

```json
{
  "id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "assignment_id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
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
  "arrived_at": "2026-10-30T09:24:02.945639Z",
  "started_at": "2026-10-30T09:24:03.263958Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/dfb673aa-ee2b-4e0a-9c4c-837df4a20857/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:24:03Z",
    "sequence": 1793352243555
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dfb673aa-ee2b-4e0a-9c4c-837df4a20857",
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
  "last_heartbeat_at": "2026-10-30T09:24:03.57601Z",
  "last_location_at": "2026-10-30T09:24:03.57601Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f6b3ec3b-675c-445e-acda-8d126e0a1d72/complete` → **200**

```json
{
  "command_id": "6ba2a635-69c2-4be3-9d3f-2970aa7e2aa3",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:24:03Z",
  "cash_received": false
}
```

```json
{
  "id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "assignment_id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
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
  "arrived_at": "2026-10-30T09:24:02.945639Z",
  "started_at": "2026-10-30T09:24:03.263958Z",
  "completed_at": "2026-10-30T09:24:03.882711Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1` → **200**

```json
{
  "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
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
    "id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
    "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:23:59.190106Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1` → **200**

```json
{
  "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
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
    "id": "86a37def-a58e-4bc3-844e-9e88a123c77d",
    "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f6b3ec3b-675c-445e-acda-8d126e0a1d72",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:23:59.190106Z",
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
  "session_id": "dfb673aa-ee2b-4e0a-9c4c-837df4a20857",
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
  "last_heartbeat_at": "2026-10-30T09:24:03.57601Z",
  "last_location_at": "2026-10-30T09:24:03.57601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dfb673aa-ee2b-4e0a-9c4c-837df4a20857/close` → **200**

```json
{
  "command_id": "a266385b-e77e-4ace-9bcb-3e3b3b6a38c0",
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
  "session_id": "a01aeadf-e222-4727-b594-abdd335281ab",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxNDYsImlhdCI6MTc5MzM1MjI0NiwianRpIjoiNThjZmQxNjQtNzIzYi00Y2Q2LWI1ZmMtNGY1MWE1NDFhOGIwIiwic2lkIjoiYTAxYWVhZGYtZTIyMi00NzI3LWI1OTQtYWJkZDMzNTI4MWFiIn0.tmh_jkpjKvS15koGWCtc9ep3nETQX3lagrSU-tY6ZgY",
  "access_expires_at": "2026-10-30T09:39:06.733864947Z",
  "refresh_token": "ICaVt9fbEH01ln8JE6xsRfyBWqSpjH0qPDMDQzQXAG4",
  "refresh_expires_at": "2026-10-30T21:24:06.733212178Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2d8523d2-7e98-47a8-accc-aa540b6cf746"
}
```

`GET /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:24:07.314993254Z",
  "order": {
    "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
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
    "created_at": "2026-10-30T09:23:59.190106Z",
    "assigned_at": "2026-10-30T09:24:01.410281Z",
    "arrived_at": "2026-10-30T09:24:02.945639Z",
    "started_at": "2026-10-30T09:24:03.263958Z",
    "completed_at": "2026-10-30T09:24:03.882711Z"
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
    "id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
    "registered_at": "2026-10-30T09:23:56.703593Z",
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
      "created_at": "2026-10-30T09:23:59.192894Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:24:04.138642Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks` → **422**

```json
{
  "command_id": "465b1c26-35c7-414b-a450-9c2d7067de4b",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "f835478c-c471-4736-a6ee-809a2659d5e8"
}
```

`POST /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks` → **201**

```json
{
  "command_id": "75738160-05af-48cc-8cf8-880401d8fa06",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "2827326c-2ea6-4df2-a38e-ed826bf64491",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:24:08.008234Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks` → **201**

```json
{
  "command_id": "75738160-05af-48cc-8cf8-880401d8fa06",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "2827326c-2ea6-4df2-a38e-ed826bf64491",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:24:08.008234Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/69f80c42-8ca5-4e75-b6e4-c656d2b969bf` → **200**

```json
{
  "client": {
    "id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
    "phone": "+380730701374",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:23:56.703593Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:23:59.190106Z",
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

`POST /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks/2827326c-2ea6-4df2-a38e-ed826bf64491/resolve` → **200**

```json
{
  "command_id": "84c7b176-736d-49f9-8c05-f012964d830f",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "2827326c-2ea6-4df2-a38e-ed826bf64491",
  "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T09:24:08.008234Z",
  "resolved_at": "2026-10-30T09:24:09.096552Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/69f80c42-8ca5-4e75-b6e4-c656d2b969bf` → **200**

```json
{
  "client": {
    "id": "69f80c42-8ca5-4e75-b6e4-c656d2b969bf",
    "phone": "+380730701374",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:23:56.703593Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:23:59.190106Z",
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

`POST /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks/2827326c-2ea6-4df2-a38e-ed826bf64491/resolve` → **409**

```json
{
  "command_id": "8fcf7cad-30b2-4891-9e2d-81d739d9cf7d",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks/2827326c-2ea6-4df2-a38e-ed826bf64491/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "34d175bd-b03b-4608-9914-126ec5653137"
}
```

`GET /api/admin/v1/orders/cdafa91e-f199-4042-b296-f4d17b41e2b1/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "2827326c-2ea6-4df2-a38e-ed826bf64491",
      "order_id": "cdafa91e-f199-4042-b296-f4d17b41e2b1",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T09:24:08.008234Z",
      "resolved_at": "2026-10-30T09:24:09.096552Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order cdafa91e-f199-4042-b296-f4d17b41e2b1 without phone or card digits; chargeback 2827326c-2ea6-4df2-a38e-ed826bf64491 recorded and won.

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
  "session_id": "f581a772-d8c4-4458-8043-0ecd586332e7",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxNTAsImlhdCI6MTc5MzM1MjI1MCwianRpIjoiMDU3ZWQ4YjktMDFkZi00ZjAzLTk2ZWItOGNhZTk4MjE4NGRhIiwic2lkIjoiZjU4MWE3NzItZDhjNC00NDU4LTgwNDMtMGVjZDU4NjMzMmU3In0.NUukY7fsKSGhxIbwyzp866VaRAEYkyr7JQArxQNACCc",
  "access_expires_at": "2026-10-30T09:39:10.931407328Z",
  "refresh_token": "-Ln6gobI-cHUXKYE48sSK9XVPTL9t-9n8fdqOGJFE0M",
  "refresh_expires_at": "2026-10-30T21:24:10.930694667Z",
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
  "phone": "+48600585140",
  "device_ref": "sandbox-31300"
}
```

```json
{
  "challenge_id": "ab3dba89-4a06-408e-92b9-04d99c799e3b",
  "expires_at": "2026-10-30T09:29:11.843536168Z",
  "resend_available_at": "2026-10-30T09:24:12.843536168Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600585140` → **200**

```json
{
  "phone": "+48600585140",
  "audience": "CLIENT",
  "code": "053040",
  "sent_at": "2026-10-30T09:24:11.84642721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab3dba89-4a06-408e-92b9-04d99c799e3b",
  "code": "053040",
  "device_ref": "sandbox-31300"
}
```

```json
{
  "session_id": "4cbca62e-82ef-4bce-be04-11bc5bd1ef75",
  "subject": {
    "type": "CLIENT",
    "id": "2b6ad2aa-6b5c-4188-a5ac-eba9e3f97d15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYjZhZDJhYS02YjVjLTQxODgtYTVhYy1lYmE5ZTNmOTdkMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTUyLCJpYXQiOjE3OTMzNTIyNTIsImp0aSI6IjNiYmM4NzZjLTAzNDgtNDI4NC05ZDhjLWQxZDhjYmZlZmJiNSIsInNpZCI6IjRjYmNhNjJlLTgyZWYtNGJjZS1iZTA0LTExYmM1YmQxZWY3NSJ9.-0NQL1oA_LiCjZfQdiTslTCeCr7QuzDW1dMZoKdr5wI",
  "access_expires_at": "2026-10-30T09:39:12.164044255Z",
  "refresh_token": "mZs0bqj_9omEkoGqSUxAucPwvX9I35T1ZKvlTu4TbYU",
  "refresh_expires_at": "2026-11-29T09:24:12.163530736Z",
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
  "command_id": "f40dd8f6-6a21-49b8-bfb1-ac5c755ec3d9",
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
  "correlation_id": "e4c03daa-541e-41a2-ae9a-51a8565b9fa1",
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
  "command_id": "37ecf5ca-8ca0-4283-93ca-f94d043b9f22",
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
  "paused_at": "2026-10-30T09:24:13.341295907Z",
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
  "command_id": "65f1de42-bd18-497b-8378-98ef0ebe0247",
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
  "id": "23458587-1c22-4b8c-a420-6700731ebab2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:29:13.965418Z",
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
  "command_id": "fe4b907c-0075-42fa-9b31-94b07e92e95b",
  "quote_id": "23458587-1c22-4b8c-a420-6700731ebab2",
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
  "correlation_id": "8a7b80cb-ace7-4d9d-82da-027980ee9938"
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
  "paused_at": "2026-10-30T09:24:13.341296Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "7d710431-af28-4363-a0bf-d97f2ef38207",
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
  "command_id": "3cdf3d3f-3352-4d69-8499-920704a22f2b",
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
  "command_id": "c7a4944c-7ac1-476f-8551-fc2ac15d85de",
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
  "id": "1f9b09e0-1897-4509-8f07-be2526f12adb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:29:15.809886Z",
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
  "command_id": "a7572e40-8774-4a08-bfe8-f2009856288a",
  "quote_id": "1f9b09e0-1897-4509-8f07-be2526f12adb",
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
  "correlation_id": "468d8c00-7688-46b8-97cc-c7003012435b"
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
  "command_id": "ae9bd7b8-ca2b-4812-bcb5-777faead2035",
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
  "command_id": "363fc97f-ee60-4690-8bdd-ecb96a253eb8",
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
  "id": "814759a1-21fc-4840-9a3b-667a21856213",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:29:17.036829Z",
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
  "command_id": "32eb0a66-2d50-4431-8b1d-cf688cce7fda",
  "quote_id": "814759a1-21fc-4840-9a3b-667a21856213",
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
  "correlation_id": "be3c8890-e1e6-4fba-a178-73dc18096280"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "c1bc5f6f-3c3c-4422-9bbe-5df5da1017a1",
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
  "correlation_id": "eb3c441d-00e8-4703-bf94-36f9a9376d62"
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
  "command_id": "3fba09a0-2b98-487c-b8ed-0dbc70b7aaaa",
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
  "phone": "+380677302838",
  "device_ref": "sandbox-19973"
}
```

```json
{
  "challenge_id": "73db0e0f-9eba-4b45-85bc-d915976c1318",
  "expires_at": "2026-10-30T09:29:18.585187207Z",
  "resend_available_at": "2026-10-30T09:24:19.585187207Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677302838` → **200**

```json
{
  "phone": "+380677302838",
  "audience": "CLIENT",
  "code": "446568",
  "sent_at": "2026-10-30T09:24:18.588163956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73db0e0f-9eba-4b45-85bc-d915976c1318",
  "code": "446568",
  "device_ref": "sandbox-19973"
}
```

```json
{
  "session_id": "629a1d59-c114-4671-81d5-237064147e09",
  "subject": {
    "type": "CLIENT",
    "id": "4c88d862-86be-4c11-abbb-80bc3c54a92e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Yzg4ZDg2Mi04NmJlLTRjMTEtYWJiYi04MGJjM2M1NGE5MmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTU4LCJpYXQiOjE3OTMzNTIyNTgsImp0aSI6IjIyZTk4M2M0LTM1ZmEtNDQzMy1iYzVjLTRjZWY5MTc1ZmYyNiIsInNpZCI6IjYyOWExZDU5LWMxMTQtNDY3MS04MWQ1LTIzNzA2NDE0N2UwOSJ9.6QQMLNvsP8u0kLaGXzrC6ITWmFwLKUI6DbiWd5PBpHw",
  "access_expires_at": "2026-10-30T09:39:18.907533351Z",
  "refresh_token": "N0qkJNLELWfZ478PphMGp8ThVrAm7zOVS1Oy8y9RnYc",
  "refresh_expires_at": "2026-11-29T09:24:18.906906874Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4c88d862-86be-4c11-abbb-80bc3c54a92e",
  "session_id": "629a1d59-c114-4671-81d5-237064147e09",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "255c2579-537f-44b9-801a-4b6eb8cef66d",
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
  "id": "53799b6c-c7a7-48ca-843b-be4708ee45ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:29:19.515065Z",
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
  "challenge_id": "97cbdab6-2a53-4a2d-b9f4-34d3ac14a335",
  "expires_at": "2026-10-30T09:29:21.816759534Z",
  "resend_available_at": "2026-10-30T09:24:22.816759534Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677302838` → **200**

```json
{
  "phone": "+380677302838",
  "audience": "CLIENT",
  "code": "054533",
  "sent_at": "2026-10-30T09:24:21.819904646Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ca675ccb-ba20-4b10-964d-01bfd02d342d",
  "challenge_id": "97cbdab6-2a53-4a2d-b9f4-34d3ac14a335",
  "otp_code": "054533"
}
```

```json
{
  "client_id": "4c88d862-86be-4c11-abbb-80bc3c54a92e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:24:22.148870799Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e373e4df-01ca-4d63-85be-8e5450096f74",
  "quote_id": "53799b6c-c7a7-48ca-843b-be4708ee45ac",
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
  "correlation_id": "5ee87854-18e5-41eb-aa91-f9b1b672e244"
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
  "session_id": "a13455fa-75ba-4085-a888-40f292ef6df3",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxNjMsImlhdCI6MTc5MzM1MjI2MywianRpIjoiNDExZmNhMWMtZDUyMy00ZWFjLWE3M2EtY2M4Njg4MGEwNDIwIiwic2lkIjoiYTEzNDU1ZmEtNzViYS00MDg1LWE4ODgtNDBmMjkyZWY2ZGYzIn0.5DhUC1U6bmSa5aqH6g5JFIERIUv-wsUdfUV_5Dm5waU",
  "access_expires_at": "2026-10-30T09:39:23.057547545Z",
  "refresh_token": "pKIQ36BEmUycAeQA3ta8BLEVddAManfsI__7OaSiJgQ",
  "refresh_expires_at": "2026-10-30T21:24:23.056776876Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4c88d862-86be-4c11-abbb-80bc3c54a92e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:24:22.148871Z",
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

`POST /api/admin/v1/client-deletions/4c88d862-86be-4c11-abbb-80bc3c54a92e/complete` → **200**

```json
{
  "command_id": "1c6ddcae-78dd-4d39-bc76-a0aa487dc86d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4c88d862-86be-4c11-abbb-80bc3c54a92e",
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
  "correlation_id": "3c4e2156-a03c-437a-b070-190eff8fc319"
}
```

Done: client 4c88d862-86be-4c11-abbb-80bc3c54a92e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664912775",
  "device_ref": "sandbox-21947"
}
```

```json
{
  "challenge_id": "328bdf0a-9ad7-4595-9235-9240e3405434",
  "expires_at": "2026-10-30T09:29:24.279181685Z",
  "resend_available_at": "2026-10-30T09:24:25.279181685Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664912775` → **200**

```json
{
  "phone": "+380664912775",
  "audience": "CLIENT",
  "code": "634185",
  "sent_at": "2026-10-30T09:24:24.282230157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "328bdf0a-9ad7-4595-9235-9240e3405434",
  "code": "634185",
  "device_ref": "sandbox-21947"
}
```

```json
{
  "session_id": "fe1ba171-622d-43b3-86c0-76698c2f3f07",
  "subject": {
    "type": "CLIENT",
    "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDlmYmFiZS0yMmJhLTQ3NTYtYmMyNS1iNzgwMWI3MzBiZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTY0LCJpYXQiOjE3OTMzNTIyNjQsImp0aSI6ImFiNDM1NDcxLTc2NjAtNDk3Ni05M2FiLWNiNjY3YWIyZTBhOCIsInNpZCI6ImZlMWJhMTcxLTYyMmQtNDNiMy04NmMwLTc2Njk4YzJmM2YwNyJ9.KSYEuSBE2cSc3vJiA_kVXLw_dI8uEkgX8NWMJQCvGNs",
  "access_expires_at": "2026-10-30T09:39:24.608864721Z",
  "refresh_token": "XlOQRAfmMJq-uuaBXP_JyT2_QXjqBfCN-b0HikJh8cM",
  "refresh_expires_at": "2026-11-29T09:24:24.608349418Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
  "session_id": "fe1ba171-622d-43b3-86c0-76698c2f3f07",
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
  "session_id": "d331b4be-deeb-41fd-baeb-523321381ffe",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxNjUsImlhdCI6MTc5MzM1MjI2NSwianRpIjoiODNmMjU1ODMtMzRhYi00MWEyLWE5NTEtNDk2NjI2NDM2NTAyIiwic2lkIjoiZDMzMWI0YmUtZGVlYi00MWZkLWJhZWItNTIzMzIxMzgxZmZlIn0.j3VCXyBKcl5ve48WF55imNDy1sfZbGrlVWM5hr3HqmY",
  "access_expires_at": "2026-10-30T09:39:25.485983485Z",
  "refresh_token": "MwHPHEeHTFvT0-vNxaxSy97RM107CG__EyaN_G_BxSg",
  "refresh_expires_at": "2026-10-30T21:24:25.485343069Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4912775&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
      "phone": "+380664912775",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:24:24.60656Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/cd9fbabe-22ba-4756-bc25-b7801b730bfc` → **200**

```json
{
  "client": {
    "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
    "phone": "+380664912775",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:24:24.60656Z",
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

`POST /api/admin/v1/clients/cd9fbabe-22ba-4756-bc25-b7801b730bfc/block` → **400**

```json
{
  "command_id": "200b1c20-1e4c-4f3f-9864-0289d1155108",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/cd9fbabe-22ba-4756-bc25-b7801b730bfc/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b93195eb-3cac-4b7a-8d2e-cd2059256bb9",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/cd9fbabe-22ba-4756-bc25-b7801b730bfc/block` → **200**

```json
{
  "command_id": "873197d0-2ba8-422a-82d2-3f2d42d27134",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
  "phone": "+380664912775",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:24:24.60656Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:24:26.739175Z",
    "by": "42bf38ce-c790-4895-aa62-2de6f12aba20"
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
  "correlation_id": "7d21bae9-a8b4-4d3e-86f9-064569736fc9"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664912775",
  "device_ref": "sandbox-542"
}
```

```json
{
  "challenge_id": "fa0a1d86-4754-4785-b106-809d47fec97d",
  "expires_at": "2026-10-30T09:29:29.345123593Z",
  "resend_available_at": "2026-10-30T09:24:30.345123593Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664912775` → **200**

```json
{
  "phone": "+380664912775",
  "audience": "CLIENT",
  "code": "357025",
  "sent_at": "2026-10-30T09:24:29.348365899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "fa0a1d86-4754-4785-b106-809d47fec97d",
  "code": "357025",
  "device_ref": "sandbox-542"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7fa04f5b-e66e-4b01-b215-da6276b57740"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/cd9fbabe-22ba-4756-bc25-b7801b730bfc` → **200**

```json
{
  "client": {
    "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
    "phone": "+380664912775",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:24:24.60656Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:24:26.739175Z",
      "by": "42bf38ce-c790-4895-aa62-2de6f12aba20"
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

`POST /api/admin/v1/clients/cd9fbabe-22ba-4756-bc25-b7801b730bfc/unblock` → **200**

```json
{
  "command_id": "c52fa8ec-9d87-447e-a69e-c2af35ec78cb",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
  "phone": "+380664912775",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:24:24.60656Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664912775",
  "device_ref": "sandbox-11441"
}
```

```json
{
  "challenge_id": "b8e72ef2-1799-43b3-bd0c-d7cad7a5cc00",
  "expires_at": "2026-10-30T09:29:32.630464119Z",
  "resend_available_at": "2026-10-30T09:24:33.630464119Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664912775` → **200**

```json
{
  "phone": "+380664912775",
  "audience": "CLIENT",
  "code": "645146",
  "sent_at": "2026-10-30T09:24:32.633347599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8e72ef2-1799-43b3-bd0c-d7cad7a5cc00",
  "code": "645146",
  "device_ref": "sandbox-11441"
}
```

```json
{
  "session_id": "46be0964-a492-42aa-a76e-6e373c109cea",
  "subject": {
    "type": "CLIENT",
    "id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDlmYmFiZS0yMmJhLTQ3NTYtYmMyNS1iNzgwMWI3MzBiZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTcyLCJpYXQiOjE3OTMzNTIyNzIsImp0aSI6IjIwMDYyM2Y3LTQ0ZTUtNGRmZC05MTZlLWVkOWExYjYxMjc3NiIsInNpZCI6IjQ2YmUwOTY0LWE0OTItNDJhYS1hNzZlLTZlMzczYzEwOWNlYSJ9.RUYKIn1iF16B-cV_MBDpmAWbSuAiUQ0zXMzit0axCT4",
  "access_expires_at": "2026-10-30T09:39:32.956951423Z",
  "refresh_token": "TNHekjsyolmcWdLXaM5eqOM387CZPokAwbwjimTkOPQ",
  "refresh_expires_at": "2026-11-29T09:24:32.956312831Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cd9fbabe-22ba-4756-bc25-b7801b730bfc",
  "session_id": "46be0964-a492-42aa-a76e-6e373c109cea",
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
  "phone": "+380662375247",
  "device_ref": "sandbox-17730"
}
```

```json
{
  "challenge_id": "0a63c8a4-a3c1-4a2b-a9ab-cd7e06d01040",
  "expires_at": "2026-10-30T09:29:33.561526519Z",
  "resend_available_at": "2026-10-30T09:24:34.561526519Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662375247` → **200**

```json
{
  "phone": "+380662375247",
  "audience": "CLIENT",
  "code": "055248",
  "sent_at": "2026-10-30T09:24:33.564848435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a63c8a4-a3c1-4a2b-a9ab-cd7e06d01040",
  "code": "055248",
  "device_ref": "sandbox-17730"
}
```

```json
{
  "session_id": "8a4a59fa-ace3-4398-890a-01c7cc301ddd",
  "subject": {
    "type": "CLIENT",
    "id": "07175a30-ac1e-4117-b3f2-28c4df5cf99b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzE3NWEzMC1hYzFlLTQxMTctYjNmMi0yOGM0ZGY1Y2Y5OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTczLCJpYXQiOjE3OTMzNTIyNzMsImp0aSI6IjA4Yzc5N2YzLWNiOTctNDczMi1iYWQyLWRjZDJjZGYzYjQ2ZSIsInNpZCI6IjhhNGE1OWZhLWFjZTMtNDM5OC04OTBhLTAxYzdjYzMwMWRkZCJ9.s6LQDxazqH4S6e6qNf9TGc0aJnmM5DJLEiuZDco1r00",
  "access_expires_at": "2026-10-30T09:39:33.883889841Z",
  "refresh_token": "aDEun-px3YxfqjHyXp3XQ2NBwdP0dRLkSm_uf0KYKSU",
  "refresh_expires_at": "2026-11-29T09:24:33.883297621Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa6193c5-f398-45d7-90d5-292f4464e84a",
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
  "id": "90a32da1-b416-4101-a1aa-6b8185c51757",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:29:34.181588Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 5bd86e20-27b9-4cbe-b661-f64cc96e02a9) → **201**

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
  "session_id": "4dcc0c34-4317-4e9e-b450-263c6a5e17f3",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxNzQsImlhdCI6MTc5MzM1MjI3NCwianRpIjoiM2MxNzZmZDgtYjllOS00YmIyLTg0ZDctNDRmMjYzY2RkMDgwIiwic2lkIjoiNGRjYzBjMzQtNDMxNy00ZTllLWI0NTAtMjYzYzZhNWUxN2YzIn0.ZVi-k1RF4F3XlhGWcrvYn5gj2tOwyrBfQSk02zyPxlE",
  "access_expires_at": "2026-10-30T09:39:34.84377413Z",
  "refresh_token": "2JrZzxtxlcwelypBQL9OBAvQ7LxHjyKy2ZgU9lOiaXo",
  "refresh_expires_at": "2026-10-30T21:24:34.843208444Z",
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
  "session_id": "a35b6c7e-c30f-4d12-bfc4-2d0790395e02",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxNzUsImlhdCI6MTc5MzM1MjI3NSwianRpIjoiMjA5ZGZmNDYtODQ1Ny00MjFmLWJhOTgtYTM0OTA4MzkzMmNmIiwic2lkIjoiYTM1YjZjN2UtYzMwZi00ZDEyLWJmYzQtMmQwNzkwMzk1ZTAyIn0.o9DLbdyuoS4OyRMWRaI98NiRRkTjGsrNal4TgdLdmZA",
  "access_expires_at": "2026-10-30T09:39:35.443855413Z",
  "refresh_token": "MTEtsvx9lfpW4FmpHNS6UBfxCLrHFiWqxm8EaMg0It8",
  "refresh_expires_at": "2026-10-30T21:24:35.443218816Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e47fad75-32fd-46dd-9b2a-fa83cdc6802a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:24:34.510425Z",
      "actor": {
        "type": "CLIENT",
        "id": "07175a30-ac1e-4117-b3f2-28c4df5cf99b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
        "quote_id": "90a32da1-b416-4101-a1aa-6b8185c51757",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5bd86e20-27b9-4cbe-b661-f64cc96e02a9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:24:34.512818Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
        "attempt_id": "742cc836-dd40-443f-9ed6-d188b1c98896",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5bd86e20-27b9-4cbe-b661-f64cc96e02a9"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:24:34.521031Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
        "attempt_id": "742cc836-dd40-443f-9ed6-d188b1c98896"
      },
      "correlation_id": "5bd86e20-27b9-4cbe-b661-f64cc96e02a9"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "742cc836-dd40-443f-9ed6-d188b1c98896",
        "generation": 1,
        "started_at": "2026-10-30T09:24:34.511811Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:24:34.521031Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:24:34.513639Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/5bd86e20-27b9-4cbe-b661-f64cc96e02a9` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a:0",
      "order_id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
      "at": "2026-10-30T09:24:34.510425Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a:1",
      "order_id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
      "at": "2026-10-30T09:24:34.512818Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a:2",
      "order_id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
      "at": "2026-10-30T09:24:34.521031Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/97df1b17-31c2-4cd0-abf1-563fc461045e` → **200**

```json
{
  "found": []
}
```

Done: request 5bd86e20-27b9-4cbe-b661-f64cc96e02a9 — order e47fad75-32fd-46dd-9b2a-fa83cdc6802a found by its id.

`GET /api/rider/v1/orders/e47fad75-32fd-46dd-9b2a-fa83cdc6802a` → **200**

```json
{
  "id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "07175a30-ac1e-4117-b3f2-28c4df5cf99b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:24:34.509851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e47fad75-32fd-46dd-9b2a-fa83cdc6802a/cancel` → **200**

```json
{
  "command_id": "197450c8-7418-4906-b5fd-b608b92bf870",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e47fad75-32fd-46dd-9b2a-fa83cdc6802a",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "07175a30-ac1e-4117-b3f2-28c4df5cf99b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:24:34.509851Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "phone": "+380636966355",
  "device_ref": "sandbox-4349"
}
```

```json
{
  "challenge_id": "a91a8f80-d6ee-4591-aee5-6dcb72089de8",
  "expires_at": "2026-10-30T09:29:37.308888681Z",
  "resend_available_at": "2026-10-30T09:24:38.308888681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636966355` → **200**

```json
{
  "phone": "+380636966355",
  "audience": "CLIENT",
  "code": "468188",
  "sent_at": "2026-10-30T09:24:37.312243883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a91a8f80-d6ee-4591-aee5-6dcb72089de8",
  "code": "468188",
  "device_ref": "sandbox-4349"
}
```

```json
{
  "session_id": "552b783e-eb99-40c7-acf6-bde031f31151",
  "subject": {
    "type": "CLIENT",
    "id": "8d1fdedf-b4d0-487c-83f4-79263def901a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDFmZGVkZi1iNGQwLTQ4N2MtODNmNC03OTI2M2RlZjkwMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTc3LCJpYXQiOjE3OTMzNTIyNzcsImp0aSI6ImYyNGJiNjUyLWI0ZjYtNDBmMi04OTgyLWJkYjZkZWQ3NmZkMiIsInNpZCI6IjU1MmI3ODNlLWViOTktNDBjNy1hY2Y2LWJkZTAzMWYzMTE1MSJ9.RTNJqL4HHuA4F58o0QrqHIFmfenAP_yeT89gybWfTMM",
  "access_expires_at": "2026-10-30T09:39:37.626698687Z",
  "refresh_token": "fMhSGcKueiaZIt3IK5m7VSnoZM3UKcl3kQpPmuhcUVQ",
  "refresh_expires_at": "2026-11-29T09:24:37.626135171Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "58d522d2-880d-49ec-85ec-eb81bb88d187",
  "expires_at": "2026-10-30T09:29:39.921424988Z",
  "resend_available_at": "2026-10-30T09:24:40.921424988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636966355` → **200**

```json
{
  "phone": "+380636966355",
  "audience": "CLIENT",
  "code": "342224",
  "sent_at": "2026-10-30T09:24:39.924205849Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "d1ded5cd-5795-4a2c-b0dc-e44c66edd76c",
  "challenge_id": "58d522d2-880d-49ec-85ec-eb81bb88d187",
  "otp_code": "342224"
}
```

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "PENDING",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c` → **200**

```json
{
  "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
  "state": "READY",
  "created_at": "2026-10-30T09:24:40.251163Z",
  "ready_at": "2026-10-30T09:24:48.005698Z",
  "expires_at": "2026-11-06T09:24:48.005698Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630900882",
  "device_ref": "sandbox-28969"
}
```

```json
{
  "challenge_id": "542a77c3-c4ba-4b8d-941e-3f78082bd452",
  "expires_at": "2026-10-30T09:29:48.66110277Z",
  "resend_available_at": "2026-10-30T09:24:49.66110277Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630900882` → **200**

```json
{
  "phone": "+380630900882",
  "audience": "CLIENT",
  "code": "570115",
  "sent_at": "2026-10-30T09:24:48.667949562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "542a77c3-c4ba-4b8d-941e-3f78082bd452",
  "code": "570115",
  "device_ref": "sandbox-28969"
}
```

```json
{
  "session_id": "342abcc2-097c-4aee-8397-29b9e937da07",
  "subject": {
    "type": "CLIENT",
    "id": "14730583-c065-492b-bfc3-aabe6f3d94a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDczMDU4My1jMDY1LTQ5MmItYmZjMy1hYWJlNmYzZDk0YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTg4LCJpYXQiOjE3OTMzNTIyODgsImp0aSI6ImYyM2JlNWJlLWIxZDItNGE0Yy05M2JiLTRlNGFhNGIxZWM1YiIsInNpZCI6IjM0MmFiY2MyLTA5N2MtNGFlZS04Mzk3LTI5YjllOTM3ZGEwNyJ9.z-QdAjbaR2xiP74b9VZo2ML3Xq-tmGElHkqbzK8nALg",
  "access_expires_at": "2026-10-30T09:39:48.994867386Z",
  "refresh_token": "DARfnEmi9zdVvnSukDapbZKP2d9f23y8KuU-4jKP7fA",
  "refresh_expires_at": "2026-11-29T09:24:48.994294897Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/41bf75c2-5f9c-478a-a50d-e2e50fd5954c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "84ede4c4-6db2-4fbd-905e-212ca58de2f7"
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
  "session_id": "f7f185aa-12b1-4875-8071-d3d8bc351b62",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxODksImlhdCI6MTc5MzM1MjI4OSwianRpIjoiZTkxYWIwNDUtMDU5ZS00ZDBlLTliZDMtZjg2NTczODU3NjJiIiwic2lkIjoiZjdmMTg1YWEtMTJiMS00ODc1LTgwNzEtZDNkOGJjMzUxYjYyIn0.p5I8p14pPidly6vMgpzEOB0wuMvuTcsQyn6azOigMPg",
  "access_expires_at": "2026-10-30T09:39:49.885338998Z",
  "refresh_token": "st7Iqw5bWC7W6QHzfvBnv-TwD_Ca6W3NzmEJ20x-Dk4",
  "refresh_expires_at": "2026-10-30T21:24:49.884763864Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8d1fdedf-b4d0-487c-83f4-79263def901a",
  "session_id": "552b783e-eb99-40c7-acf6-bde031f31151",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8d1fdedf-b4d0-487c-83f4-79263def901a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "41bf75c2-5f9c-478a-a50d-e2e50fd5954c",
      "state": "READY",
      "created_at": "2026-10-30T09:24:40.251163Z",
      "ready_at": "2026-10-30T09:24:48.005698Z",
      "expires_at": "2026-11-06T09:24:48.005698Z",
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
  "device_ref": "sandbox-2066"
}
```

```json
{
  "challenge_id": "a3700bcd-3cd8-4a3a-aa20-3d3fd06336a1",
  "expires_at": "2026-10-30T09:29:50.769000728Z",
  "resend_available_at": "2026-10-30T09:24:51.769000728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "385082",
  "sent_at": "2026-10-30T09:24:50.771762095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3700bcd-3cd8-4a3a-aa20-3d3fd06336a1",
  "code": "385082",
  "device_ref": "sandbox-2066"
}
```

```json
{
  "session_id": "82d57996-da64-4595-8da6-76d58fd525c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzE5MSwiaWF0IjoxNzkzMzUyMjkxLCJqdGkiOiI3NTg3YTIwMy1kYzEwLTRhYjEtYTI2Zi04NjExNzViNTRmM2EiLCJzaWQiOiI4MmQ1Nzk5Ni1kYTY0LTQ1OTUtOGRhNi03NmQ1OGZkNTI1YzUifQ.iW7Kbbz95j0q-HTs6NBiJfbmUKeYupebqF6lJbUYPyk",
  "access_expires_at": "2026-10-30T09:39:51.100761814Z",
  "refresh_token": "VO63H-DzKoM-2FTDA2gFz4OAlYYNPfaAQb4dN5CHARQ",
  "refresh_expires_at": "2026-11-29T09:24:51.100191178Z",
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
  "device_ref": "sandbox-24664"
}
```

```json
{
  "challenge_id": "cd7ce9a4-4a57-41f1-bf86-9601963a6389",
  "expires_at": "2026-10-30T09:29:51.680749205Z",
  "resend_available_at": "2026-10-30T09:24:52.680749205Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "181095",
  "sent_at": "2026-10-30T09:24:51.683610905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd7ce9a4-4a57-41f1-bf86-9601963a6389",
  "code": "181095",
  "device_ref": "sandbox-24664"
}
```

```json
{
  "session_id": "55af9d6b-5464-42c3-8109-0428f19b17a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzE5MiwiaWF0IjoxNzkzMzUyMjkyLCJqdGkiOiIyMTA0NjVlMC1hZjczLTQ3ODEtODEzYi1lNmNmOWJmN2JlNzIiLCJzaWQiOiI1NWFmOWQ2Yi01NDY0LTQyYzMtODEwOS0wNDI4ZjE5YjE3YTMifQ.KD7RSqWx8uR38SFI_BFjS28a-5E0VPnjCmU6n4ybttQ",
  "access_expires_at": "2026-10-30T09:39:52.010570456Z",
  "refresh_token": "VUNtlS-i1vugGP4wYY1v9C0cdp-2HvULIoi02F4Y244",
  "refresh_expires_at": "2026-11-29T09:24:52.009944788Z",
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
  "command_id": "7de8a001-7bf2-4f7c-b94f-5cca33badf48",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:24:52Z",
    "sequence": 1793352292599
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "92208b2a-930b-4201-9fda-7ceb4adefe34",
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
  "last_heartbeat_at": "2026-10-30T09:24:52.619807Z",
  "last_location_at": "2026-10-30T09:24:52.619807Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-18256"
}
```

```json
{
  "challenge_id": "2646c005-be0b-4099-a7ae-c4496ccf34b8",
  "expires_at": "2026-10-30T09:29:52.915226495Z",
  "resend_available_at": "2026-10-30T09:24:53.915226495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "069965",
  "sent_at": "2026-10-30T09:24:52.918372533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2646c005-be0b-4099-a7ae-c4496ccf34b8",
  "code": "069965",
  "device_ref": "sandbox-18256"
}
```

```json
{
  "session_id": "1f47265d-8327-4a7c-8aed-afee7b8ab4d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzE5MywiaWF0IjoxNzkzMzUyMjkzLCJqdGkiOiIxMTBmOTliOC1iMGUzLTRhMWUtOWMzYS1mMTg0MDJlNDNjMGYiLCJzaWQiOiIxZjQ3MjY1ZC04MzI3LTRhN2MtOGFlZC1hZmVlN2I4YWI0ZDUifQ.kY3zf2kKWz1oz-xzv3p8aWODCDxwlt1ScSrIgtb8NGM",
  "access_expires_at": "2026-10-30T09:39:53.244911737Z",
  "refresh_token": "Ynz35iuBE5QPr6cip0aTFVMewnXhPUJ_vJDmVzYc30s",
  "refresh_expires_at": "2026-11-29T09:24:53.244312633Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "de838004-b962-4290-9b4e-f20545af6882",
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
  "last_heartbeat_at": "2026-10-30T09:23:15.235153Z",
  "last_location_at": "2026-10-30T09:23:15.235153Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/de838004-b962-4290-9b4e-f20545af6882/handover` → **200**

```json
{
  "command_id": "c7d9fb22-f803-4abc-bc9b-b36e4410f87c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "de838004-b962-4290-9b4e-f20545af6882",
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
  "last_heartbeat_at": "2026-10-30T09:23:15.235153Z",
  "last_location_at": "2026-10-30T09:23:15.235153Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/de838004-b962-4290-9b4e-f20545af6882/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:24:54Z",
    "sequence": 1793352294124
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "de838004-b962-4290-9b4e-f20545af6882",
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
  "last_heartbeat_at": "2026-10-30T09:24:54.152789Z",
  "last_location_at": "2026-10-30T09:24:54.152789Z",
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
  "session_id": "66d343b1-497b-49e9-9579-dc1a3d9adeac",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxOTQsImlhdCI6MTc5MzM1MjI5NCwianRpIjoiOTkzMTExNmItZmQzZC00OGVjLWE4ODEtYWZmZjRmYTU4OTMyIiwic2lkIjoiNjZkMzQzYjEtNDk3Yi00OWU5LTk1NzktZGMxYTNkOWFkZWFjIn0.XByeu3aKd3OzljrBdDM62liJW1FiAJ2BmIyey_uQW8o",
  "access_expires_at": "2026-10-30T09:39:54.753518732Z",
  "refresh_token": "g9Wq8lrKnMVjP6icImpx9RNVze2CEFTXbPids-xRrHw",
  "refresh_expires_at": "2026-10-30T21:24:54.752889988Z",
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
  "session_id": "a3a143f3-4403-42f0-a252-9b1edfd8fbf2",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMxOTUsImlhdCI6MTc5MzM1MjI5NSwianRpIjoiN2U1YTlkOGMtZjVkZi00YjliLWFhZmMtMTQzYjI0ZDBlMmIyIiwic2lkIjoiYTNhMTQzZjMtNDQwMy00MmYwLWEyNTItOWIxZWRmZDhmYmYyIn0.LpsvTvqLJJGuga7uhVmrWFshYpMOc3RbayfsJycku0A",
  "access_expires_at": "2026-10-30T09:39:55.345518291Z",
  "refresh_token": "t-iNll9LiMB9IvilvUsBqw5wnRpqn33K6VDJIp8Uuw0",
  "refresh_expires_at": "2026-10-30T21:24:55.344941373Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686463609",
  "device_ref": "sandbox-11308"
}
```

```json
{
  "challenge_id": "aa81817a-056c-4231-b760-34ba97a43aca",
  "expires_at": "2026-10-30T09:29:55.637103315Z",
  "resend_available_at": "2026-10-30T09:24:56.637103315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686463609` → **200**

```json
{
  "phone": "+380686463609",
  "audience": "CLIENT",
  "code": "246619",
  "sent_at": "2026-10-30T09:24:55.64017427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa81817a-056c-4231-b760-34ba97a43aca",
  "code": "246619",
  "device_ref": "sandbox-11308"
}
```

```json
{
  "session_id": "56a16b3b-390b-4b15-815d-42a2b527cec3",
  "subject": {
    "type": "CLIENT",
    "id": "8b755fd9-948f-4348-904e-ae3793a6c544"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjc1NWZkOS05NDhmLTQzNDgtOTA0ZS1hZTM3OTNhNmM1NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMTk1LCJpYXQiOjE3OTMzNTIyOTUsImp0aSI6IjFmN2VjMDkzLTk3NDMtNGZkNS04ZTYxLTE2MjZkMzI3MTUwNSIsInNpZCI6IjU2YTE2YjNiLTM5MGItNGIxNS04MTVkLTQyYTJiNTI3Y2VjMyJ9.nPCegantvh9qxIsncsBSj_7n4jMD7HYWuYywv1Yk3s4",
  "access_expires_at": "2026-10-30T09:39:55.959618216Z",
  "refresh_token": "8CbsgSIAGOM7EN_oJXQELLgFya-94PGaN0MWkfdLYqc",
  "refresh_expires_at": "2026-11-29T09:24:55.959099047Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3e9b0eb-40fd-45f4-a1ed-b06c0a15c19a",
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
  "id": "535eb545-7b60-4907-890b-146a89d0732c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:29:56.251769Z",
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
  "command_id": "66d66ce5-d34c-4d8d-8551-d2572722a3ba",
  "quote_id": "535eb545-7b60-4907-890b-146a89d0732c",
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
  "id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b755fd9-948f-4348-904e-ae3793a6c544",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:24:56.550265Z",
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
    "id": "63fcc806-9dfa-4997-b15b-c0aaa43ccf8f",
    "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
    "expires_at": "2026-10-30T09:25:11.553592Z",
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

`POST /api/driver/v1/offers/63fcc806-9dfa-4997-b15b-c0aaa43ccf8f/reject` → **204**

```json
{
  "command_id": "69410ff0-849a-42e3-b14d-e67f16cdc6e6"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d73302af-ff57-4c77-b8e1-abfbf7433fcb",
    "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
    "expires_at": "2026-10-30T09:25:12.162968Z",
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

`POST /api/driver/v1/offers/d73302af-ff57-4c77-b8e1-abfbf7433fcb/accept` → **200**

```json
{
  "command_id": "0e57b40b-c492-42e9-941b-8a3e5a2c7173"
}
```

```json
{
  "id": "a1ca0c71-0487-44b7-bd01-aeaef0205ba3",
  "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b62d89c1-6d8e-4a40-91ed-ce320ee2c1c7",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:24:56.55074Z",
      "actor": {
        "type": "CLIENT",
        "id": "8b755fd9-948f-4348-904e-ae3793a6c544",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
        "quote_id": "535eb545-7b60-4907-890b-146a89d0732c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "465ee15f-c4ed-46d2-81a0-a310e8359de8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:24:56.55276Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
        "attempt_id": "b3579fbf-28d7-4156-a663-277aa178ad2e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "465ee15f-c4ed-46d2-81a0-a310e8359de8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:24:56.556595Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "63fcc806-9dfa-4997-b15b-c0aaa43ccf8f",
        "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "465ee15f-c4ed-46d2-81a0-a310e8359de8"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:24:57.161862Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "63fcc806-9dfa-4997-b15b-c0aaa43ccf8f",
        "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3"
      },
      "correlation_id": "6ad0bd0c-f503-44d7-8d08-d55d5afe0195"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3` → **200**

```json
{
  "id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8b755fd9-948f-4348-904e-ae3793a6c544",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a1ca0c71-0487-44b7-bd01-aeaef0205ba3",
    "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b62d89c1-6d8e-4a40-91ed-ce320ee2c1c7",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:24:56.550265Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3/cancel` → **200**

```json
{
  "command_id": "47bcd72e-7566-42cb-9b3b-b1f06b05daf2",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8b755fd9-948f-4348-904e-ae3793a6c544",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a1ca0c71-0487-44b7-bd01-aeaef0205ba3",
    "order_id": "cc7ab491-9401-4bd7-83b3-d83ed7ac0ad3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b62d89c1-6d8e-4a40-91ed-ce320ee2c1c7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:24:56.550265Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "92208b2a-930b-4201-9fda-7ceb4adefe34",
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
  "last_heartbeat_at": "2026-10-30T09:24:52.619807Z",
  "last_location_at": "2026-10-30T09:24:52.619807Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/92208b2a-930b-4201-9fda-7ceb4adefe34/close` → **200**

```json
{
  "command_id": "132634ad-6920-4cfd-bdf8-3f3e2d58c0d4",
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
  "session_id": "de838004-b962-4290-9b4e-f20545af6882",
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
  "last_heartbeat_at": "2026-10-30T09:24:54.152789Z",
  "last_location_at": "2026-10-30T09:24:54.152789Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/de838004-b962-4290-9b4e-f20545af6882/close` → **200**

```json
{
  "command_id": "c7171351-8a17-45bf-9217-78cc9e56c1c9",
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
  "session_id": "4321f867-fafb-4a19-8669-4e4bd6330e6d",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMDAsImlhdCI6MTc5MzM1MjMwMCwianRpIjoiMTVhYWIxYzMtMzFhZi00N2NmLTkwNjMtNmM1ZDk4YmEyYWZmIiwic2lkIjoiNDMyMWY4NjctZmFmYi00YTE5LTg2NjktNGU0YmQ2MzMwZTZkIn0.X2bj7gG3ymrUTlx_Qrz87SvXKHulinStBU4Nfkz4Fd4",
  "access_expires_at": "2026-10-30T09:40:00.269858883Z",
  "refresh_token": "aj1rHZqi0401Qw57TZmrURh5h1P3StH1S9sn3lJo-p0",
  "refresh_expires_at": "2026-10-30T21:25:00.269262699Z",
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
  "command_id": "fa0de14f-8efe-42c0-b64d-e18789e8ee84",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:25:00.897882Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "0644d66d-70b3-4db5-a386-05c48e2aa400",
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
  "correlation_id": "1096e5de-ed26-49d5-96b7-5ae07a0383c3"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "4c47722c-262b-4b05-a8c2-2597bcb87075",
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
  "correlation_id": "9a247f24-3f41-4c41-9e18-5babd121dac1"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637521700",
  "device_ref": "sandbox-15412"
}
```

```json
{
  "challenge_id": "1348208b-f753-40de-9034-75bc52da1808",
  "expires_at": "2026-10-30T09:30:01.805544172Z",
  "resend_available_at": "2026-10-30T09:25:02.805544172Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637521700` → **200**

```json
{
  "phone": "+380637521700",
  "audience": "CLIENT",
  "code": "177373",
  "sent_at": "2026-10-30T09:25:01.808413859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1348208b-f753-40de-9034-75bc52da1808",
  "code": "177373",
  "device_ref": "sandbox-15412"
}
```

```json
{
  "session_id": "0d2a980c-d0a0-4c48-8592-ad9d11bb4da6",
  "subject": {
    "type": "CLIENT",
    "id": "5fd0a411-9310-4fae-b5be-3ef81c3c8292"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZmQwYTQxMS05MzEwLTRmYWUtYjViZS0zZWY4MWMzYzgyOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjAyLCJpYXQiOjE3OTMzNTIzMDIsImp0aSI6ImNhNGQ4ZDNhLWU5MTQtNGI2Zi1hNmIwLTZjNWYxMjNjYTQ4YyIsInNpZCI6IjBkMmE5ODBjLWQwYTAtNGM0OC04NTkyLWFkOWQxMWJiNGRhNiJ9.8mJLCSDchsH9yB86SWPvEEeGPf3-6Up6aCGcLPJ9ZxA",
  "access_expires_at": "2026-10-30T09:40:02.138398249Z",
  "refresh_token": "M2DvfVi2mHShu5jFQXHz8sraIthhdUFJRXWAzsKAbV8",
  "refresh_expires_at": "2026-11-29T09:25:02.13790336Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "22cd47dd-347b-4918-95d3-f5d991ce5e4f",
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
  "id": "3ca4933e-266e-454a-b2e3-90baba818e53",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:02.433996Z",
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
  "command_id": "80ad1244-b6ac-48c5-b9fc-005a679d36cc",
  "quote_id": "3ca4933e-266e-454a-b2e3-90baba818e53",
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
  "correlation_id": "4a7d238d-0396-48be-b393-9df10a9872ec"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "84f52d1d-a1f7-49de-ae89-351747c182b6",
  "quote_id": "3ca4933e-266e-454a-b2e3-90baba818e53",
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
  "id": "4043a120-ff68-4a2b-8db4-f7f26dcdd191",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5fd0a411-9310-4fae-b5be-3ef81c3c8292",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:25:03.058725Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4043a120-ff68-4a2b-8db4-f7f26dcdd191/cancel` → **200**

```json
{
  "command_id": "eefa8f76-1e96-43fe-9b88-0e15e8886d83",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4043a120-ff68-4a2b-8db4-f7f26dcdd191",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5fd0a411-9310-4fae-b5be-3ef81c3c8292",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:25:03.058725Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "command_id": "ed0eae29-ad16-4108-bc76-ec2366a7aed5",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:25:03.70307Z"
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
      "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:25:03.70307Z"
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
  "device_ref": "sandbox-21603"
}
```

```json
{
  "challenge_id": "24455ee0-23c0-4c48-8eee-7e87bd310896",
  "expires_at": "2026-10-30T09:30:04.595464316Z",
  "resend_available_at": "2026-10-30T09:25:05.595464316Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "921289",
  "sent_at": "2026-10-30T09:25:04.598106365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24455ee0-23c0-4c48-8eee-7e87bd310896",
  "code": "921289",
  "device_ref": "sandbox-21603"
}
```

```json
{
  "session_id": "52d44b0b-0bd7-494e-9576-be25e8155d96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzIwNCwiaWF0IjoxNzkzMzUyMzA0LCJqdGkiOiJkY2EwM2I0Ny0zNGM5LTQwMzctYjMxNC04MzQzMzY5ZTkyNDIiLCJzaWQiOiI1MmQ0NGIwYi0wYmQ3LTQ5NGUtOTU3Ni1iZTI1ZTgxNTVkOTYifQ.u3TxVxNsBFzH-bGkX5dQx5RU5poA-LlMceD4-SqKF98",
  "access_expires_at": "2026-10-30T09:40:04.908302862Z",
  "refresh_token": "eoFUSv5HBUWV0rHIVURdqzGTNMhFL51w6mSlqUb22TE",
  "refresh_expires_at": "2026-11-29T09:25:04.907674268Z",
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
  "command_id": "aef74c37-3913-4ece-9f49-ea8f435229ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:05Z",
    "sequence": 1793352305486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:05.505487Z",
  "last_location_at": "2026-10-30T09:25:05.505487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676401633",
  "device_ref": "sandbox-7449"
}
```

```json
{
  "challenge_id": "e725d162-9a68-4a08-9084-014bd0f155e1",
  "expires_at": "2026-10-30T09:30:05.800169901Z",
  "resend_available_at": "2026-10-30T09:25:06.800169901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676401633` → **200**

```json
{
  "phone": "+380676401633",
  "audience": "CLIENT",
  "code": "660889",
  "sent_at": "2026-10-30T09:25:05.80303953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e725d162-9a68-4a08-9084-014bd0f155e1",
  "code": "660889",
  "device_ref": "sandbox-7449"
}
```

```json
{
  "session_id": "bd53456c-28cf-4cca-882d-3a33b7ba63bf",
  "subject": {
    "type": "CLIENT",
    "id": "ba8ed5b6-cefb-43c4-8728-1d2a7aa9cd19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYThlZDViNi1jZWZiLTQzYzQtODcyOC0xZDJhN2FhOWNkMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjA2LCJpYXQiOjE3OTMzNTIzMDYsImp0aSI6ImFkMGFiMzE3LWYzMWMtNGQ2OS05ZmIxLWE0YWJmNDhmYzUwNCIsInNpZCI6ImJkNTM0NTZjLTI4Y2YtNGNjYS04ODJkLTNhMzNiN2JhNjNiZiJ9.EXEdxA4aqbgnxg1LLSbUDIK7Uh2YTXMiK2LF3H7Nq1M",
  "access_expires_at": "2026-10-30T09:40:06.127121427Z",
  "refresh_token": "9kF4PK77gEo21mypB7Gc0kI_vmnVV7BIi8z7my3nUu0",
  "refresh_expires_at": "2026-11-29T09:25:06.126558636Z",
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
  "command_id": "c7e58b22-a327-4380-816a-4d45dba5996a",
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
  "id": "41211d45-2131-4cde-a81f-3d145a77137d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:06.715259Z",
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
  "command_id": "fa68f283-8fcc-429d-b8e7-e35d66aa27ab",
  "platform": "ANDROID",
  "token": "sandbox-driver-826d3a8b-f877-44c3-984d-c9d80259430d"
}
```

```json
{
  "id": "5efb9509-3f2e-42c8-8005-7798c8dfd7ec",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:25:07.032479Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "6f3d42e0-5686-4f0a-a677-035677941c4f",
  "platform": "ANDROID",
  "token": "sandbox-rider-b7749e68-abef-4812-9cef-c8c3751d2c88"
}
```

```json
{
  "id": "2676694e-1d5d-4e8a-8a98-98b53611f4e5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:25:07.342603Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bcfe9b5f-d43a-44d2-ad29-d4fcfd70856b",
  "quote_id": "41211d45-2131-4cde-a81f-3d145a77137d",
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
  "id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba8ed5b6-cefb-43c4-8728-1d2a7aa9cd19",
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
  "created_at": "2026-10-30T09:25:07.651766Z",
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
    "id": "fe1eab32-4589-43e8-8776-2f3733aa550e",
    "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
    "expires_at": "2026-10-30T09:25:22.655057Z",
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

`POST /api/driver/v1/offers/fe1eab32-4589-43e8-8776-2f3733aa550e/accept` → **200**

```json
{
  "command_id": "4d5c2926-9213-41c1-876a-05abc50949f5"
}
```

```json
{
  "id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:25:07.625Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:25:08.558921075Z",
    "token_suffix": "59430d",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "8b4958a3-642f-4cf4-8151-87a8c1e09333",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676401633&after=2026-10-30T09:25:07.625Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:25:08.555338241Z",
    "token_suffix": "1d2c88",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "396b7a7c-612d-48a6-a5c2-b4297f90d98e",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b24f0489-eda3-4d58-80df-94b4234f304c/messages` → **201**

```json
{
  "command_id": "25aad39c-37ab-4bc6-a76c-7a14a30bd7db",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "fbd6d44b-0aa1-41af-8bb6-15a6448b1987",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:25:08.645743741Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "assignment_id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
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

`POST /api/driver/v1/trips/e31d85b5-a2f7-440b-b244-5b9cde33c5d0/messages` → **201**

```json
{
  "command_id": "0213449d-928b-45a8-b83e-ac24a7911a46",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8c028530-e600-46f6-9063-81a0fff35c37",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:25:09.228563294Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b24f0489-eda3-4d58-80df-94b4234f304c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/e31d85b5-a2f7-440b-b244-5b9cde33c5d0/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676401633"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:10Z",
    "sequence": 1793352310239
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:10.259611Z",
  "last_location_at": "2026-10-30T09:25:10.259611Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "assignment_id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
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

`POST /api/driver/v1/trips/e31d85b5-a2f7-440b-b244-5b9cde33c5d0/arrive` → **200**

```json
{
  "command_id": "e73d5df0-0799-4d1f-a106-d0f34350f527",
  "expected_version": 0
}
```

```json
{
  "id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "assignment_id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
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
  "arrived_at": "2026-10-30T09:25:10.844335Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e31d85b5-a2f7-440b-b244-5b9cde33c5d0/start` → **200**

```json
{
  "command_id": "950700a5-115d-4884-baf2-98a0fa2283f2",
  "expected_version": 1
}
```

```json
{
  "id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "assignment_id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
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
  "arrived_at": "2026-10-30T09:25:10.844335Z",
  "started_at": "2026-10-30T09:25:11.155074Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:11Z",
    "sequence": 1793352311458
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:11.478991Z",
  "last_location_at": "2026-10-30T09:25:11.478991Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/e31d85b5-a2f7-440b-b244-5b9cde33c5d0/complete` → **200**

```json
{
  "command_id": "5dc227f0-560e-489f-af63-4918ef502d68",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:25:11Z",
  "cash_received": true
}
```

```json
{
  "id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "assignment_id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
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
  "arrived_at": "2026-10-30T09:25:10.844335Z",
  "started_at": "2026-10-30T09:25:11.155074Z",
  "completed_at": "2026-10-30T09:25:11.780027Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b24f0489-eda3-4d58-80df-94b4234f304c` → **200**

```json
{
  "id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ba8ed5b6-cefb-43c4-8728-1d2a7aa9cd19",
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
    "id": "67d5f095-dafb-49cf-8e9e-769af4e2d696",
    "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:25:07.651766Z",
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
    "id": "b24f0489-eda3-4d58-80df-94b4234f304c",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:25:07.651766Z",
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
    "id": "e31d85b5-a2f7-440b-b244-5b9cde33c5d0",
    "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
    "order_short_number": 13,
    "created_at": "2026-10-30T09:25:08.26658Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a0866222-ec60-42cf-83d1-89095e9c7c9b",
    "order_id": "304ee0b8-46ea-4309-83a3-4373e5daf51e",
    "order_short_number": 8,
    "created_at": "2026-10-30T09:23:50.463586Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "760c406f-f471-4815-bde4-15a284f8cd31",
    "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
    "order_short_number": 3,
    "created_at": "2026-10-30T09:23:03.541021Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "49aae060-8ab5-49bf-bfb0-55b798161755",
    "order_id": "e9a6bbdb-db52-490f-bdcb-c7f959a4711c",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:22:43.849548Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1c84ced7-e93c-4521-bbc1-0a2c33b6e931",
    "order_id": "ea4656f9-2fe3-43f4-acf9-bf3c1ae87441",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:22:33.826302Z",
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

`GET /api/rider/v1/orders/b24f0489-eda3-4d58-80df-94b4234f304c/tip` → **200**

```json
{
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
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
  "available_until": "2026-10-31T09:25:11.780027Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b24f0489-eda3-4d58-80df-94b4234f304c/tip` → **201**

```json
{
  "command_id": "f0b3bedf-0bdd-4011-85f0-4a89812b24ba",
  "amount_minor": 1100
}
```

```json
{
  "id": "867cb0d5-a720-425e-a124-1ec90cd3e5c2",
  "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:25:16.8836Z"
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
  "session_id": "ddf8290d-541e-4e8b-b6c0-59e2cfd9d346",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMTcsImlhdCI6MTc5MzM1MjMxNywianRpIjoiM2Y0ZWI4N2EtMTMwYS00YTljLWI1MmEtNjdjNTc0Y2NiYTEzIiwic2lkIjoiZGRmODI5MGQtNTQxZS00ZThiLWI2YzAtNTllMmNmZDlkMzQ2In0.FjE4mpQ4pfJGYd3PYPVa2x0SncBMa_mz8rfTCsNyDjQ",
  "access_expires_at": "2026-10-30T09:40:17.472775674Z",
  "refresh_token": "vyJcDVGhkrrYCUw1vEOWBwnPpbpx1AC3qF3nrsO1bRI",
  "refresh_expires_at": "2026-10-30T21:25:17.47221105Z",
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
  "generated_at": "2026-10-30T09:25:17.770352348Z"
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
  "generated_at": "2026-10-30T09:25:18.068389496Z"
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
  "session_id": "d715d6cb-24bf-476a-896f-5e457b96bbad",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMTgsImlhdCI6MTc5MzM1MjMxOCwianRpIjoiYWI3ODA1MjItYTA3Ni00YzkyLWI2ZjktNmEyZGZmN2UzM2RiIiwic2lkIjoiZDcxNWQ2Y2ItMjRiZi00NzZhLTg5NmYtNWU0NTdiOTZiYmFkIn0.i_AnvErIN-gvw9xisg_cv-ZA6BG6IxbOw41uhu2PhLc",
  "access_expires_at": "2026-10-30T09:40:18.661510408Z",
  "refresh_token": "jDXKdVMskygd0mDYUd3JR36ht1ds98AIWp_MQyRzZdM",
  "refresh_expires_at": "2026-10-30T21:25:18.660824735Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b24f0489-eda3-4d58-80df-94b4234f304c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:25:07.65228Z",
      "actor": {
        "type": "CLIENT",
        "id": "ba8ed5b6-cefb-43c4-8728-1d2a7aa9cd19",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
        "quote_id": "41211d45-2131-4cde-a81f-3d145a77137d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "53d38014-5d88-4f65-be1a-deb6af234e68"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:25:07.654283Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
        "attempt_id": "eabc8e77-b985-4b82-b5a4-5a620181200d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "53d38014-5d88-4f65-be1a-deb6af234e68"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:25:07.657284Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fe1eab32-4589-43e8-8776-2f3733aa550e",
        "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "53d38014-5d88-4f65-be1a-deb6af234e68"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:25:08.268309Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fe1eab32-4589-43e8-8776-2f3733aa550e",
        "order_id": "b24f0489-eda3-4d58-80df-94b4234f304c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "67d5f095-dafb-49cf-8e9e-769af4e2d696"
      },
      "correlation_id": "805e5581-5e95-4430-b9ec-77e215800928"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:25:19.268386621Z",
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
      "last_location_at": "2026-10-30T09:25:11.478991Z",
      "order_id": null
    }
  ]
}
```

Done: order b24f0489-eda3-4d58-80df-94b4234f304c.

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
  "session_id": "7f24a81d-19d5-4908-8261-b7a1f5817a5d",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMTksImlhdCI6MTc5MzM1MjMxOSwianRpIjoiMjhiNmE0NzAtZTEzMy00ZWI2LTk5MWMtNjNhNTE3MThkZmY3Iiwic2lkIjoiN2YyNGE4MWQtMTlkNS00OTA4LTgyNjEtYjdhMWY1ODE3YTVkIn0.MZkFNCE03lfLxkU_vdnainBWdGQD2sQebmpj9IK6TXc",
  "access_expires_at": "2026-10-30T09:40:19.884889265Z",
  "refresh_token": "Aik5v1Vuqnh77Kx5RKME5IRtNpqlKMni1b8CKuT_Omc",
  "refresh_expires_at": "2026-10-30T21:25:19.883998011Z",
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
  "command_id": "b45b3728-d854-4eeb-8655-d6881151335b",
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
  "timestamp": "2026-10-30T09:25:20.000+0000",
  "channel": {
    "id": "1730052000.3202028716",
    "linkedid": "1730052000.3202028716",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673059695"
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
  "timestamp": "2026-10-30T09:25:20.000+0000",
  "channel": {
    "id": "1730052000.3202028716",
    "linkedid": "1730052000.3202028716",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673059695"
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
  "session_id": "593b6438-b15b-4c66-93b1-b1c6410475e5",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMjEsImlhdCI6MTc5MzM1MjMyMSwianRpIjoiZDBlNzQ4NGEtNDNjZi00MWQ5LTg5YmItMDUyMTJmMTk0M2Y5Iiwic2lkIjoiNTkzYjY0MzgtYjE1Yi00YzY2LTkzYjEtYjFjNjQxMDQ3NWU1In0.bV7tHTVCV0T_sDx6DMfAJKJaI0SfhTrgkQAK0VUFj0c",
  "access_expires_at": "2026-10-30T09:40:21.131775669Z",
  "refresh_token": "j-gsi7oYywMbxiivtR_Ja2axO6tW_K6ZEhtozNSFZgU",
  "refresh_expires_at": "2026-10-30T21:25:21.130935155Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "b6494ebe-41d0-4299-92a4-b01f8ee3fa1c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673059695",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:25:20Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/b6494ebe-41d0-4299-92a4-b01f8ee3fa1c/answer` → **200**

```json
{
  "command_id": "6a131ff4-9264-4a26-af08-d877deba006f"
}
```

```json
{
  "id": "b6494ebe-41d0-4299-92a4-b01f8ee3fa1c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673059695",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "order_ids": [],
  "started_at": "2026-10-30T09:25:20Z",
  "answered_at": "2026-10-30T09:25:21.744799Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3202028716",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "79b8df27-c43f-44f4-9ddf-2894f92839a1",
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
  "id": "3839dbc8-ea0d-46e2-95bb-a6afe3d4eea0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:22.085915Z",
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
  "command_id": "52eaf545-9893-4f09-85d4-4cf2f41b9179",
  "quote_id": "3839dbc8-ea0d-46e2-95bb-a6afe3d4eea0",
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
    "phone": "+380673059695"
  },
  "call_id": "b6494ebe-41d0-4299-92a4-b01f8ee3fa1c"
}
```

```json
{
  "id": "4fc2ac66-258c-4cc9-bf25-ed947205f0a0",
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
  "created_at": "2026-10-30T09:25:22.407372Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673059695"
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
    "id": "1730052000.3202028716",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b6494ebe-41d0-4299-92a4-b01f8ee3fa1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673059695",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [
        "4fc2ac66-258c-4cc9-bf25-ed947205f0a0"
      ],
      "started_at": "2026-10-30T09:25:20Z",
      "answered_at": "2026-10-30T09:25:21.744799Z",
      "ended_at": "2026-10-30T09:25:22.749904Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "de9c360b-8eb1-4062-9671-25f0f04e5112",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670044770",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [],
      "started_at": "2026-10-30T09:22:52.051524Z",
      "answered_at": "2026-10-30T09:22:52.400284Z",
      "ended_at": "2026-10-30T09:22:52.72223Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:22:57.976185Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/4fc2ac66-258c-4cc9-bf25-ed947205f0a0` → **200**

```json
{
  "id": "4fc2ac66-258c-4cc9-bf25-ed947205f0a0",
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
  "created_at": "2026-10-30T09:25:22.407372Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673059695"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/4fc2ac66-258c-4cc9-bf25-ed947205f0a0` → **200**

```json
{
  "id": "4fc2ac66-258c-4cc9-bf25-ed947205f0a0",
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
  "created_at": "2026-10-30T09:25:22.407372Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673059695"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4fc2ac66-258c-4cc9-bf25-ed947205f0a0/cancel` → **200**

```json
{
  "command_id": "b93e4dcc-515a-4daf-a819-c3dbe869ce2f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4fc2ac66-258c-4cc9-bf25-ed947205f0a0",
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
  "created_at": "2026-10-30T09:25:22.407372Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673059695"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call b6494ebe-41d0-4299-92a4-b01f8ee3fa1c with order 4fc2ac66-258c-4cc9-bf25-ed947205f0a0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28218"
}
```

```json
{
  "challenge_id": "c83c4a88-16fd-42ae-9618-608c6734fca5",
  "expires_at": "2026-10-30T09:30:24.034581536Z",
  "resend_available_at": "2026-10-30T09:25:25.034581536Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "967511",
  "sent_at": "2026-10-30T09:25:24.038267249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c83c4a88-16fd-42ae-9618-608c6734fca5",
  "code": "967511",
  "device_ref": "sandbox-28218"
}
```

```json
{
  "session_id": "6f08efd4-c320-409f-b233-31c8e2ac6f77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzIyNCwiaWF0IjoxNzkzMzUyMzI0LCJqdGkiOiIxZTFmZmY0NC03OTI1LTQwZTgtODMwNi1kODdiOTk0YzQwZDQiLCJzaWQiOiI2ZjA4ZWZkNC1jMzIwLTQwOWYtYjIzMy0zMWM4ZTJhYzZmNzcifQ.oGdKN4ikQW_imxlwg0xP4HSSiJ5bsqPHPsvqmKJfbk8",
  "access_expires_at": "2026-10-30T09:40:24.368036274Z",
  "refresh_token": "Ly8olPWrQKUvoO2X4c_5rawYF4rilQNlycJpbpP2WQQ",
  "refresh_expires_at": "2026-11-29T09:25:24.367374013Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:11.478991Z",
  "last_location_at": "2026-10-30T09:25:11.478991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/handover` → **200**

```json
{
  "command_id": "af0d3cdd-a8f6-48ed-966a-fda9ad5995fc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:11.478991Z",
  "last_location_at": "2026-10-30T09:25:11.478991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:25Z",
    "sequence": 1793352325280
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:25.300089Z",
  "last_location_at": "2026-10-30T09:25:25.300089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667269669",
  "device_ref": "sandbox-2148"
}
```

```json
{
  "challenge_id": "7e9350c9-fe72-4148-8c47-8c3041ed6c1a",
  "expires_at": "2026-10-30T09:30:25.59518901Z",
  "resend_available_at": "2026-10-30T09:25:26.59518901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667269669` → **200**

```json
{
  "phone": "+380667269669",
  "audience": "CLIENT",
  "code": "320734",
  "sent_at": "2026-10-30T09:25:25.597942501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e9350c9-fe72-4148-8c47-8c3041ed6c1a",
  "code": "320734",
  "device_ref": "sandbox-2148"
}
```

```json
{
  "session_id": "c4a26411-9cc6-49b7-9344-6b30b1ad99f3",
  "subject": {
    "type": "CLIENT",
    "id": "48497cb6-6079-40b3-b5d2-50a2112b80d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODQ5N2NiNi02MDc5LTQwYjMtYjVkMi01MGEyMTEyYjgwZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjI1LCJpYXQiOjE3OTMzNTIzMjUsImp0aSI6IjA3ZGNiNTQ5LWNhOTItNGQyNy1hZWI5LTg4ODkyYjk2ZTY4MSIsInNpZCI6ImM0YTI2NDExLTljYzYtNDliNy05MzQ0LTZiMzBiMWFkOTlmMyJ9.nBDolSniLKvFIMdfYyC3sHtXDEj5ZS6OBXtKTExX8eY",
  "access_expires_at": "2026-10-30T09:40:25.919040056Z",
  "refresh_token": "BYcwOoSju_jhSa3Im2IrJ4ViX1AdTmdBY7zz3_1aSEM",
  "refresh_expires_at": "2026-11-29T09:25:25.918340999Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3127db0-8012-42c4-b2ff-12d6856c5770",
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
  "id": "15f900af-32da-4a87-b9b5-449e52fa95ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:26.224381Z",
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
  "command_id": "8a7b80f8-1fd7-4817-9c3f-8fb145410b5d",
  "quote_id": "15f900af-32da-4a87-b9b5-449e52fa95ca",
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
  "id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "48497cb6-6079-40b3-b5d2-50a2112b80d9",
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
  "created_at": "2026-10-30T09:25:26.542636Z",
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
    "id": "0f147865-8be3-4bc1-a20f-adda81a20605",
    "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
    "expires_at": "2026-10-30T09:25:41.545883Z",
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

`POST /api/driver/v1/offers/0f147865-8be3-4bc1-a20f-adda81a20605/accept` → **200**

```json
{
  "command_id": "e63ed912-11d4-4f7a-b757-9a8f487933e8"
}
```

```json
{
  "id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb",
  "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "01cee233-5037-4ade-96ae-9adbc595caa8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "01cee233-5037-4ade-96ae-9adbc595caa8",
  "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
  "assignment_id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb",
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

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:27Z",
    "sequence": 1793352327751
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:27.770595Z",
  "last_location_at": "2026-10-30T09:25:27.770595Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/01cee233-5037-4ade-96ae-9adbc595caa8/arrive` → **200**

```json
{
  "command_id": "0dd09e8f-a8f6-4ea9-9a64-bd622247a4a3",
  "expected_version": 0
}
```

```json
{
  "id": "01cee233-5037-4ade-96ae-9adbc595caa8",
  "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
  "assignment_id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb",
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
  "arrived_at": "2026-10-30T09:25:28.088519Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/01cee233-5037-4ade-96ae-9adbc595caa8/start` → **200**

```json
{
  "command_id": "d111287b-be4f-4e75-9df0-193360f0e5d7",
  "expected_version": 1
}
```

```json
{
  "id": "01cee233-5037-4ade-96ae-9adbc595caa8",
  "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
  "assignment_id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb",
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
  "arrived_at": "2026-10-30T09:25:28.088519Z",
  "started_at": "2026-10-30T09:25:28.40437Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:28Z",
    "sequence": 1793352328701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:28.720422Z",
  "last_location_at": "2026-10-30T09:25:28.720422Z",
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
  "device_ref": "sandbox-29208"
}
```

```json
{
  "challenge_id": "03d07adc-a994-4961-ae07-36f659ad180e",
  "expires_at": "2026-10-30T09:30:29.008075186Z",
  "resend_available_at": "2026-10-30T09:25:30.008075186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "407684",
  "sent_at": "2026-10-30T09:25:29.011064987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03d07adc-a994-4961-ae07-36f659ad180e",
  "code": "407684",
  "device_ref": "sandbox-29208"
}
```

```json
{
  "session_id": "19b0ab24-317f-4c6c-8dc0-85aa8aa3d253",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzIyOSwiaWF0IjoxNzkzMzUyMzI5LCJqdGkiOiIzZWVjNTE1My1lMjg4LTQyMGYtOWFhYi01NWUyODZkM2ZkM2YiLCJzaWQiOiIxOWIwYWIyNC0zMTdmLTRjNmMtOGRjMC04NWFhOGFhM2QyNTMifQ.HVBAeKBEkBUnJXLHDYM-hc83S3ka61nkj3t2aP4LRUs",
  "access_expires_at": "2026-10-30T09:40:29.325370754Z",
  "refresh_token": "6ARnBfHMIcEKbw6GsA_fi8tnRaWWPK3TpEcxNbFRbEk",
  "refresh_expires_at": "2026-11-29T09:25:29.324617443Z",
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
  "command_id": "452e39b0-55af-437d-bb0d-8c92ea1e77f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:29Z",
    "sequence": 1793352329891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6c4f962-19b5-4d73-b6c4-efa2af6d8d19",
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
  "last_heartbeat_at": "2026-10-30T09:25:29.917193Z",
  "last_location_at": "2026-10-30T09:25:29.917193Z",
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
  "session_id": "fb4f4ad3-fd4e-457d-bd5a-201787703982",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMzAsImlhdCI6MTc5MzM1MjMzMCwianRpIjoiMTVkMzUwMTctM2ZkMy00YWY5LWJhMDAtNmE0NmY1N2M2MDg5Iiwic2lkIjoiZmI0ZjRhZDMtZmQ0ZS00NTdkLWJkNWEtMjAxNzg3NzAzOTgyIn0.P52yLqbr2vkskRH-ncnpiqRP3njr6sTsMyIN0wbplc4",
  "access_expires_at": "2026-10-30T09:40:30.513524927Z",
  "refresh_token": "049eAPHK0uUmHucWshJ2DXWLcBqxu4vv_zMKUuWH_bI",
  "refresh_expires_at": "2026-10-30T21:25:30.512605804Z",
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
  "session_id": "bf5ed04e-2137-4a32-a7fe-53b92beb19c6",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyMzEsImlhdCI6MTc5MzM1MjMzMSwianRpIjoiZjYxMzU3NTgtN2Y3Mi00YTIxLWE5YmMtZDA3OGI3MjViMzIzIiwic2lkIjoiYmY1ZWQwNGUtMjEzNy00YTMyLWE3ZmUtNTNiOTJiZWIxOWM2In0.9dis6iWmWYOXpQqBTcqMhkBPTh2Vt_g-9BUHORzECqg",
  "access_expires_at": "2026-10-30T09:40:31.114508564Z",
  "refresh_token": "yDitWWfA9w9k16KDm4GU5d9rWtlDvEKB_vCaDNP7QGM",
  "refresh_expires_at": "2026-10-30T21:25:31.113935064Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d1cbbbd7-4594-458d-a950-61750d8999cf` → **200**

```json
{
  "id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "48497cb6-6079-40b3-b5d2-50a2112b80d9",
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
    "id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb",
    "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "01cee233-5037-4ade-96ae-9adbc595caa8",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:25:26.542636Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d1cbbbd7-4594-458d-a950-61750d8999cf/interrupt` → **200**

```json
{
  "command_id": "337182d7-d309-40ce-89c6-493cf545e5d5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "48497cb6-6079-40b3-b5d2-50a2112b80d9",
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
      "id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb",
      "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "01cee233-5037-4ade-96ae-9adbc595caa8",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:25:26.542636Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "48497cb6-6079-40b3-b5d2-50a2112b80d9",
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
    "id": "15c6ecc7-1716-4d7c-9379-3685218070a5",
    "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
    "expires_at": "2026-10-30T09:25:46.732689Z",
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

`POST /api/driver/v1/offers/15c6ecc7-1716-4d7c-9379-3685218070a5/accept` → **200**

```json
{
  "command_id": "30285783-5d38-46ec-b4a9-97d435242757"
}
```

```json
{
  "id": "ba35f9bb-35ba-4612-8896-99f2540d2d68",
  "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c636cde7-a361-4ed6-a8f4-15864edcd3c1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c636cde7-a361-4ed6-a8f4-15864edcd3c1",
  "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
  "assignment_id": "ba35f9bb-35ba-4612-8896-99f2540d2d68",
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
  "session_id": "e6c4f962-19b5-4d73-b6c4-efa2af6d8d19",
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
  "last_heartbeat_at": "2026-10-30T09:25:29.917193Z",
  "last_location_at": "2026-10-30T09:25:29.917193Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6c4f962-19b5-4d73-b6c4-efa2af6d8d19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:33Z",
    "sequence": 1793352333226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6c4f962-19b5-4d73-b6c4-efa2af6d8d19",
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
  "last_heartbeat_at": "2026-10-30T09:25:33.246164Z",
  "last_location_at": "2026-10-30T09:25:33.246164Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c636cde7-a361-4ed6-a8f4-15864edcd3c1/arrive` → **200**

```json
{
  "command_id": "b69eb025-b019-4bbc-a718-2fe099dceb22",
  "expected_version": 0
}
```

```json
{
  "id": "c636cde7-a361-4ed6-a8f4-15864edcd3c1",
  "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
  "assignment_id": "ba35f9bb-35ba-4612-8896-99f2540d2d68",
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
  "arrived_at": "2026-10-30T09:25:33.565521Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c636cde7-a361-4ed6-a8f4-15864edcd3c1/start` → **200**

```json
{
  "command_id": "8bcbafad-b323-4ccf-b1ec-b74b3e2bfc6c",
  "expected_version": 1
}
```

```json
{
  "id": "c636cde7-a361-4ed6-a8f4-15864edcd3c1",
  "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
  "assignment_id": "ba35f9bb-35ba-4612-8896-99f2540d2d68",
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
  "arrived_at": "2026-10-30T09:25:33.565521Z",
  "started_at": "2026-10-30T09:25:33.880125Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c636cde7-a361-4ed6-a8f4-15864edcd3c1/complete` → **200**

```json
{
  "command_id": "b4d48100-4585-4847-bd80-c15495db74ea",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:25:34Z"
}
```

```json
{
  "id": "c636cde7-a361-4ed6-a8f4-15864edcd3c1",
  "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
  "assignment_id": "ba35f9bb-35ba-4612-8896-99f2540d2d68",
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
  "arrived_at": "2026-10-30T09:25:33.565521Z",
  "started_at": "2026-10-30T09:25:33.880125Z",
  "completed_at": "2026-10-30T09:25:34.19781Z",
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
    "id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:25:31.719341Z",
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
    "id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:25:26.542636Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/d1cbbbd7-4594-458d-a950-61750d8999cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:25:26.543147Z",
      "actor": {
        "type": "CLIENT",
        "id": "48497cb6-6079-40b3-b5d2-50a2112b80d9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
        "quote_id": "15f900af-32da-4a87-b9b5-449e52fa95ca",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c664f6b8-e813-495c-98ad-7f9c562f0af1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:25:26.545124Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
        "attempt_id": "c5bc93ad-3706-4ef7-bd9b-4d63281f6623",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c664f6b8-e813-495c-98ad-7f9c562f0af1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:25:26.547978Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0f147865-8be3-4bc1-a20f-adda81a20605",
        "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c664f6b8-e813-495c-98ad-7f9c562f0af1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:25:27.166834Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0f147865-8be3-4bc1-a20f-adda81a20605",
        "order_id": "d1cbbbd7-4594-458d-a950-61750d8999cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c5021174-99a1-47c2-a49a-b8a4858d8ddb"
      },
      "correlation_id": "e43a8787-862b-49cd-9c1c-f76759996d53"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/14524cff-f92c-4e85-bae8-fc47c42256c6/tip` → **200**

```json
{
  "order_id": "14524cff-f92c-4e85-bae8-fc47c42256c6",
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
  "available_until": "2026-10-31T09:25:34.19781Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/14524cff-f92c-4e85-bae8-fc47c42256c6/tip` → **409**

```json
{
  "command_id": "c226220e-221a-4c6e-8e2e-770e7f532b81",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/14524cff-f92c-4e85-bae8-fc47c42256c6/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e16e27fa-08f4-4836-8b55-6e770c8457c3"
}
```

Done: interrupted d1cbbbd7-4594-458d-a950-61750d8999cf, follow-up 14524cff-f92c-4e85-bae8-fc47c42256c6.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ef2822-6837-4e30-8f49-1c894fa2c67b",
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
  "last_heartbeat_at": "2026-10-30T09:25:28.720422Z",
  "last_location_at": "2026-10-30T09:25:28.720422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65ef2822-6837-4e30-8f49-1c894fa2c67b/close` → **200**

```json
{
  "command_id": "670ceddb-0813-4da0-853e-0551c1ca57c9",
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
  "session_id": "e6c4f962-19b5-4d73-b6c4-efa2af6d8d19",
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
  "last_heartbeat_at": "2026-10-30T09:25:33.246164Z",
  "last_location_at": "2026-10-30T09:25:33.246164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6c4f962-19b5-4d73-b6c4-efa2af6d8d19/close` → **200**

```json
{
  "command_id": "fc765b40-a23f-4153-acbd-d52fec077300",
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
  "session_id": "c8114ecf-6828-4881-a202-cca7d3b23029",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyNDAsImlhdCI6MTc5MzM1MjM0MCwianRpIjoiZjYwZDVjMzEtNzUxYi00M2U3LTlhNzQtNjNhZDRlNGM2YTY5Iiwic2lkIjoiYzgxMTRlY2YtNjgyOC00ODgxLWEyMDItY2NhN2QzYjIzMDI5In0.gVh7pQV3VkB25ssdRgk6X4ON8F2awaAcQB0h7LdeLpA",
  "access_expires_at": "2026-10-30T09:40:40.471436384Z",
  "refresh_token": "EH6N_pXbsB0yCPau50uuu8g2vz03eA153TgRdJ_uc6Y",
  "refresh_expires_at": "2026-10-30T21:25:40.470675493Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3821a3c6-0c21-4462-985d-c59970cf0185",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:25:40Z"
}
```

```json
{
  "id": "9a8a25e8-bb55-45a0-a835-7527cdea2b27",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:25:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9a8a25e8-bb55-45a0-a835-7527cdea2b27/publish` → **200**

```json
{
  "command_id": "3a2373e0-0fa8-44b7-9d7b-1be705ba18c8",
  "expected_version": 0
}
```

```json
{
  "id": "9a8a25e8-bb55-45a0-a835-7527cdea2b27",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:25:41.098958Z",
  "published_at": "2026-10-30T09:25:41.098958Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "9a8a25e8-bb55-45a0-a835-7527cdea2b27",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:25:41.098958Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633655883",
  "device_ref": "sandbox-6599"
}
```

```json
{
  "challenge_id": "63cb8072-cd13-40ec-93f2-fd6efc6e68f4",
  "expires_at": "2026-10-30T09:30:41.694569281Z",
  "resend_available_at": "2026-10-30T09:25:42.694569281Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633655883` → **200**

```json
{
  "phone": "+380633655883",
  "audience": "CLIENT",
  "code": "419325",
  "sent_at": "2026-10-30T09:25:41.697402898Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63cb8072-cd13-40ec-93f2-fd6efc6e68f4",
  "code": "419325",
  "device_ref": "sandbox-6599"
}
```

```json
{
  "session_id": "7ca18e01-a3a7-4082-aca4-dfb7d5b01783",
  "subject": {
    "type": "CLIENT",
    "id": "798c701c-6a49-4458-bca7-ba8cbcefab01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OThjNzAxYy02YTQ5LTQ0NTgtYmNhNy1iYThjYmNlZmFiMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjQyLCJpYXQiOjE3OTMzNTIzNDIsImp0aSI6Ijg0OWFhNzk3LWNlMzEtNGI4MC1hZTM0LWE2YTJmZTQ2M2Y2MyIsInNpZCI6IjdjYTE4ZTAxLWEzYTctNDA4Mi1hY2E0LWRmYjdkNWIwMTc4MyJ9.i7wGwgIma7n0Lw9zglNeXqOU1yPmf0SOJJ2x2btPP94",
  "access_expires_at": "2026-10-30T09:40:42.02129206Z",
  "refresh_token": "rvGO-6UcRsdUSZpz6INXoixbWy66uehUzDJCJMe3FWE",
  "refresh_expires_at": "2026-11-29T09:25:42.020743984Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "9a8a25e8-bb55-45a0-a835-7527cdea2b27",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:25:41.098958Z",
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
  "command_id": "2ede9cfc-bdfa-4488-9b42-1a7fd16be5ec",
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
  "id": "85cf0aaa-3b46-4a3f-a696-ed621b6400d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:42.597441Z",
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
  "command_id": "c01493ad-8ba3-473a-96fe-9205dc3245a0",
  "quote_id": "85cf0aaa-3b46-4a3f-a696-ed621b6400d1",
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
  "correlation_id": "3649f386-8508-4fd6-ab56-57db7e518592"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "1c6dfb8f-e4c5-4ef7-8fde-2e1e28b04639",
  "version_id": "9a8a25e8-bb55-45a0-a835-7527cdea2b27",
  "language": "uk"
}
```

```json
{
  "version_id": "9a8a25e8-bb55-45a0-a835-7527cdea2b27",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:25:43.197619Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d1851a3-ce82-405f-afb9-6e0a1c1d15f4",
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
  "id": "94ddb451-ec2d-4eff-9b76-3ae8eebad5c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:43.500679Z",
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
  "command_id": "1e855c46-d1cf-42aa-b545-05986fd2d839",
  "quote_id": "94ddb451-ec2d-4eff-9b76-3ae8eebad5c7",
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
  "id": "96ac328b-c2a5-4b81-9677-0d4588c341ce",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "798c701c-6a49-4458-bca7-ba8cbcefab01",
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
  "created_at": "2026-10-30T09:25:43.80167Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/96ac328b-c2a5-4b81-9677-0d4588c341ce` → **200**

```json
{
  "id": "96ac328b-c2a5-4b81-9677-0d4588c341ce",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "798c701c-6a49-4458-bca7-ba8cbcefab01",
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
  "created_at": "2026-10-30T09:25:43.80167Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/96ac328b-c2a5-4b81-9677-0d4588c341ce/cancel` → **200**

```json
{
  "command_id": "9a07235d-508f-414d-a39c-fe8e7dedb389",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "96ac328b-c2a5-4b81-9677-0d4588c341ce",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "798c701c-6a49-4458-bca7-ba8cbcefab01",
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
  "created_at": "2026-10-30T09:25:43.80167Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`POST /api/admin/v1/legal-documents/9a8a25e8-bb55-45a0-a835-7527cdea2b27` → **409**

```json
{
  "command_id": "ac9d77f5-ef94-4bbd-b594-1f04ff37cbab",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:25:44Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/9a8a25e8-bb55-45a0-a835-7527cdea2b27",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0e9ce5e5-f955-49c6-a304-c7e64a7f2815"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b77528ff-52c6-4a07-bab6-e8fab8735567",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:25:45Z"
}
```

```json
{
  "id": "8edde0ea-d95b-4cdc-a53c-94222081b8ee",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:25:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8edde0ea-d95b-4cdc-a53c-94222081b8ee/publish` → **200**

```json
{
  "command_id": "fa19ccc1-ac36-49b7-9de6-cc3d82c59aef",
  "expected_version": 0
}
```

```json
{
  "id": "8edde0ea-d95b-4cdc-a53c-94222081b8ee",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:25:45.362577Z",
  "published_at": "2026-10-30T09:25:45.362577Z",
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
  "device_ref": "sandbox-26386"
}
```

```json
{
  "challenge_id": "d8c7e419-d7f1-4beb-86a7-5e348b0ad23f",
  "expires_at": "2026-10-30T09:30:45.682955289Z",
  "resend_available_at": "2026-10-30T09:25:46.682955289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "256229",
  "sent_at": "2026-10-30T09:25:45.687506133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8c7e419-d7f1-4beb-86a7-5e348b0ad23f",
  "code": "256229",
  "device_ref": "sandbox-26386"
}
```

```json
{
  "session_id": "351ef8e6-e53c-4ccf-9eff-819df2c393d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzI0NiwiaWF0IjoxNzkzMzUyMzQ2LCJqdGkiOiI2OTA1YzBiNi05Yzg4LTQyOTUtYWU5NS1jNWY4NjcwMGU0YWIiLCJzaWQiOiIzNTFlZjhlNi1lNTNjLTRjY2YtOWVmZi04MTlkZjJjMzkzZDYifQ.8SpOo-c67XQcaa-_TKY0jsss1Y7bprxmZCCQZeUuDBI",
  "access_expires_at": "2026-10-30T09:40:46.00559346Z",
  "refresh_token": "DzNRBMOi5KfONuEZ5kFbAm0u3UePodcLyrHo9VdYbNk",
  "refresh_expires_at": "2026-11-29T09:25:46.005002722Z",
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
  "command_id": "90106aef-6a01-46de-b9c3-587c60c04b8b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:46Z",
    "sequence": 1793352346583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c4f58347-7352-45f1-be2e-d8caee79df3d",
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
  "last_heartbeat_at": "2026-10-30T09:25:46.602197Z",
  "last_location_at": "2026-10-30T09:25:46.602197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670611892",
  "device_ref": "sandbox-16359"
}
```

```json
{
  "challenge_id": "02c6d54b-b87d-4d61-8267-2101454ae179",
  "expires_at": "2026-10-30T09:30:46.894518962Z",
  "resend_available_at": "2026-10-30T09:25:47.894518962Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670611892` → **200**

```json
{
  "phone": "+380670611892",
  "audience": "CLIENT",
  "code": "625812",
  "sent_at": "2026-10-30T09:25:46.897668122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02c6d54b-b87d-4d61-8267-2101454ae179",
  "code": "625812",
  "device_ref": "sandbox-16359"
}
```

```json
{
  "session_id": "bd9e372c-d3f9-499c-b39e-283219f08701",
  "subject": {
    "type": "CLIENT",
    "id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODI2YmE1ZC05MDVhLTRjYzktYjRlZC1hY2IxYjU0Zjk5Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjQ3LCJpYXQiOjE3OTMzNTIzNDcsImp0aSI6IjA5ZTBjMzU0LWY4MDMtNDk2YS05Mjc2LTdkYjM4ZmZmMzY1NyIsInNpZCI6ImJkOWUzNzJjLWQzZjktNDk5Yy1iMzllLTI4MzIxOWYwODcwMSJ9.TZl3y9oygfOki394SgJ6-AaUDKYD3wnm5ELV0GZtPGU",
  "access_expires_at": "2026-10-30T09:40:47.224459363Z",
  "refresh_token": "GKXXZ9gjdPSbPksjMK6O54cYzErcZqCNz-d0Il4-CPc",
  "refresh_expires_at": "2026-11-29T09:25:47.223910268Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6dda1f2f-3c51-4ee5-b24b-31157187399b",
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
  "id": "ac7f292b-d279-4863-be03-56f0f6ddb564",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:47.531452Z",
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
  "command_id": "6da00f26-3106-41cf-ad04-65677d1f4cc6",
  "quote_id": "ac7f292b-d279-4863-be03-56f0f6ddb564",
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
    "phone": "+380677381515"
  }
}
```

```json
{
  "id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:25:47.859336Z",
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
    "id": "0e52e1c8-96ba-4d11-899b-2e0dc49d005e",
    "order_id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
    "expires_at": "2026-10-30T09:26:02.862814Z",
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

`POST /api/driver/v1/offers/0e52e1c8-96ba-4d11-899b-2e0dc49d005e/accept` → **200**

```json
{
  "command_id": "96bdf372-4b6b-4e8b-a16b-08501c68e464"
}
```

```json
{
  "id": "73f45591-6a07-4379-86dd-757001233803",
  "order_id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b032845d-6d90-4d22-8021-5d305c717bd2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b032845d-6d90-4d22-8021-5d305c717bd2",
  "order_id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
  "assignment_id": "73f45591-6a07-4379-86dd-757001233803",
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
    "phone": "+380677381515"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8e18e2a-05d0-4bf1-9c88-3a0dc0464705",
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
  "id": "b8dcb573-1fed-4adb-b23b-9f971354767f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:49.091291Z",
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
  "command_id": "999e6401-f7c4-4499-88f1-a9f7612c08b7",
  "quote_id": "b8dcb573-1fed-4adb-b23b-9f971354767f",
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
  "id": "f7570ae4-981c-4a80-8b16-15d68a071111",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:25:49.392817Z",
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
  "command_id": "53898605-baac-490c-8a5b-27b808404922",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:25:49Z"
}
```

```json
{
  "id": "751ee088-7c26-40de-a5e6-97207ca9dcca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:49.733200Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:25:49Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7a51151c-6dd3-4a02-a371-28159609bbd0",
  "quote_id": "751ee088-7c26-40de-a5e6-97207ca9dcca",
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
  "pickup_at": "2026-10-30T12:25:49Z"
}
```

```json
{
  "id": "97fe68f0-3e74-4514-8208-9259102ba1da",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:25:50.042918Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:25:49Z",
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
  "command_id": "b478f7be-22c2-44fb-95c8-c15795adf90c",
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
  "id": "8c200172-6da8-4255-ab2c-c0c90244376e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:50.364464Z",
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
  "command_id": "c2ad365b-e39d-41e8-92c9-0e2def24931c",
  "quote_id": "8c200172-6da8-4255-ab2c-c0c90244376e",
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
  "correlation_id": "103bc715-588e-44d0-a6e4-d9cc47365fa2"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "97fe68f0-3e74-4514-8208-9259102ba1da",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:25:50.042918Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:25:49Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f7570ae4-981c-4a80-8b16-15d68a071111",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:25:49.392817Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f7570ae4-981c-4a80-8b16-15d68a071111",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:25:49.392817Z",
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

`GET /api/rider/v1/orders/c34750da-a680-4f9d-8f53-cf45af0d8b63` → **200**

```json
{
  "id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "73f45591-6a07-4379-86dd-757001233803",
    "order_id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b032845d-6d90-4d22-8021-5d305c717bd2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:25:47.859336Z",
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
    "location_at": "2026-10-30T09:25:46.602197Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/c34750da-a680-4f9d-8f53-cf45af0d8b63/cancel` → **200**

```json
{
  "command_id": "d0586016-0849-4a29-bd35-5f7f11f72b6b",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "73f45591-6a07-4379-86dd-757001233803",
    "order_id": "c34750da-a680-4f9d-8f53-cf45af0d8b63",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b032845d-6d90-4d22-8021-5d305c717bd2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:25:47.859336Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/f7570ae4-981c-4a80-8b16-15d68a071111` → **200**

```json
{
  "id": "f7570ae4-981c-4a80-8b16-15d68a071111",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:25:49.392817Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f7570ae4-981c-4a80-8b16-15d68a071111/cancel` → **200**

```json
{
  "command_id": "b8c932b6-31e2-467a-9121-584b054d62f4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f7570ae4-981c-4a80-8b16-15d68a071111",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:25:49.392817Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/97fe68f0-3e74-4514-8208-9259102ba1da` → **200**

```json
{
  "id": "97fe68f0-3e74-4514-8208-9259102ba1da",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:25:50.042918Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:25:49Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/97fe68f0-3e74-4514-8208-9259102ba1da/cancel` → **200**

```json
{
  "command_id": "a6a7cb11-e444-41ad-9ede-1a7db796d598",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "97fe68f0-3e74-4514-8208-9259102ba1da",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a826ba5d-905a-4cc9-b4ed-acb1b54f99cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:25:50.042918Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-30T12:25:49Z",
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
  "session_id": "c4f58347-7352-45f1-be2e-d8caee79df3d",
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
  "last_heartbeat_at": "2026-10-30T09:25:46.602197Z",
  "last_location_at": "2026-10-30T09:25:46.602197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c4f58347-7352-45f1-be2e-d8caee79df3d/close` → **200**

```json
{
  "command_id": "3dcfd188-76f4-4e65-8bcf-5465d1d77fa5",
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

Done: orders c34750da-a680-4f9d-8f53-cf45af0d8b63, f7570ae4-981c-4a80-8b16-15d68a071111, 97fe68f0-3e74-4514-8208-9259102ba1da.

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
  "session_id": "09fe6257-bb31-4685-bdea-5d348c407c7d",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyNTQsImlhdCI6MTc5MzM1MjM1NCwianRpIjoiMjBlMDNhNWUtM2I4MS00NGE4LTk3MjUtOTZjNzRmOWFhZmY2Iiwic2lkIjoiMDlmZTYyNTctYmIzMS00Njg1LWJkZWEtNWQzNDhjNDA3YzdkIn0.uXYhK0PJ1aLwentfGH0gtbEDHugpkWWozh1K67NCa84",
  "access_expires_at": "2026-10-30T09:40:54.378446237Z",
  "refresh_token": "HwTa-4k_OAPHwxIQ_J6pl1qNMMdp5cAex6DDbdAbZcw",
  "refresh_expires_at": "2026-10-30T21:25:54.37779421Z",
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
  "session_id": "b009aace-dfda-4e65-a506-a1460440eae4",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyNTQsImlhdCI6MTc5MzM1MjM1NCwianRpIjoiMmQ4NTljYWEtY2JiMC00MjM0LWE3ZTUtZDEyY2UyY2ZhMTczIiwic2lkIjoiYjAwOWFhY2UtZGZkYS00ZTY1LWE1MDYtYTE0NjA0NDBlYWU0In0.AeigdC_R5BHnhS0QZ6Fr0_hWjgde25FoUYK0D6gbOKQ",
  "access_expires_at": "2026-10-30T09:40:54.968206874Z",
  "refresh_token": "x3phy3LW4y1UdxZ8lH9RiNc5EymfDI6U7B9n0h84Qi8",
  "refresh_expires_at": "2026-10-30T21:25:54.96733109Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29019"
}
```

```json
{
  "challenge_id": "4f4fe73c-e118-44b1-9d30-2696f0cdb7c6",
  "expires_at": "2026-10-30T09:30:55.254281119Z",
  "resend_available_at": "2026-10-30T09:25:56.254281119Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "169871",
  "sent_at": "2026-10-30T09:25:55.257303776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f4fe73c-e118-44b1-9d30-2696f0cdb7c6",
  "code": "169871",
  "device_ref": "sandbox-29019"
}
```

```json
{
  "session_id": "bf2265b3-99f5-4637-82f4-9df8647abc00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzI1NSwiaWF0IjoxNzkzMzUyMzU1LCJqdGkiOiJjNzExOGExOS00N2ZhLTRlNmItYWI5Yy04ZTM2MWNkOTM3MTciLCJzaWQiOiJiZjIyNjViMy05OWY1LTQ2MzctODJmNC05ZGY4NjQ3YWJjMDAifQ.6b_gEQ0SZu_IZg1a5gWBBqH7xiLf1q_hgXJhYXH2feo",
  "access_expires_at": "2026-10-30T09:40:55.584879019Z",
  "refresh_token": "M-f5-S2LQxnhHt0FSQHQeDdR_bbhiaT33AruZP3Sf-g",
  "refresh_expires_at": "2026-11-29T09:25:55.5843487Z",
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
  "command_id": "52306047-37cc-46cc-aeef-5f03f647f6e4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:56Z",
    "sequence": 1793352356164
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04ce825e-ab6a-40e2-af75-e9f659010b22",
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
  "last_heartbeat_at": "2026-10-30T09:25:56.183589Z",
  "last_location_at": "2026-10-30T09:25:56.183589Z",
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
  "command_id": "0e74f5e7-e644-49a2-b3f0-009ab2a183ec",
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
  "effective_at": "2026-10-30T09:25:56.796091Z",
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:23:09.41858Z",
  "last_entries": [
    {
      "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:23:09.41858Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4f9e2bee-59e2-4803-9e27-e46a805a4d7a",
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
  "id": "916cc0ef-324c-4175-9ca5-1b7e5e795c9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:30:57.392854Z",
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
  "command_id": "d4200213-6ac3-4af4-8fb4-4e88464bac77",
  "quote_id": "916cc0ef-324c-4175-9ca5-1b7e5e795c9b",
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
    "phone": "+3806711131926"
  }
}
```

```json
{
  "id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
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
  "created_at": "2026-10-30T09:25:57.707574Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131926"
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
    "id": "d339670d-c6ed-4b3a-9a1c-919436d6eabe",
    "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
    "expires_at": "2026-10-30T09:26:12.712459Z",
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

`POST /api/driver/v1/offers/d339670d-c6ed-4b3a-9a1c-919436d6eabe/accept` → **200**

```json
{
  "command_id": "3d319f92-424e-4f38-a5a4-382171d65c67"
}
```

```json
{
  "id": "7c1203f2-7f0e-4db8-854d-e2467fa81f65",
  "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7b366e7e-896d-44d7-91ee-b2213f378f90",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7b366e7e-896d-44d7-91ee-b2213f378f90",
  "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
  "assignment_id": "7c1203f2-7f0e-4db8-854d-e2467fa81f65",
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
    "phone": "+3806711131926"
  }
}
```

`POST /api/driver/v1/work-sessions/04ce825e-ab6a-40e2-af75-e9f659010b22/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:25:58Z",
    "sequence": 1793352358919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04ce825e-ab6a-40e2-af75-e9f659010b22",
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
  "last_heartbeat_at": "2026-10-30T09:25:58.939153Z",
  "last_location_at": "2026-10-30T09:25:58.939153Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7b366e7e-896d-44d7-91ee-b2213f378f90/arrive` → **200**

```json
{
  "command_id": "6e2c90b4-c12e-413a-a0ab-3fe797f8898a",
  "expected_version": 0
}
```

```json
{
  "id": "7b366e7e-896d-44d7-91ee-b2213f378f90",
  "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
  "assignment_id": "7c1203f2-7f0e-4db8-854d-e2467fa81f65",
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
  "arrived_at": "2026-10-30T09:25:59.246959Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131926"
  }
}
```

`POST /api/driver/v1/trips/7b366e7e-896d-44d7-91ee-b2213f378f90/start` → **200**

```json
{
  "command_id": "a381e1be-6789-4f67-9ee5-baa1d4bd0288",
  "expected_version": 1
}
```

```json
{
  "id": "7b366e7e-896d-44d7-91ee-b2213f378f90",
  "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
  "assignment_id": "7c1203f2-7f0e-4db8-854d-e2467fa81f65",
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
  "arrived_at": "2026-10-30T09:25:59.246959Z",
  "started_at": "2026-10-30T09:25:59.555943Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131926"
  }
}
```

`POST /api/driver/v1/trips/7b366e7e-896d-44d7-91ee-b2213f378f90/complete` → **200**

```json
{
  "command_id": "c7a70a52-8d92-4301-ac5a-1aeab7c664de",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:25:59Z",
  "cash_received": true
}
```

```json
{
  "id": "7b366e7e-896d-44d7-91ee-b2213f378f90",
  "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
  "assignment_id": "7c1203f2-7f0e-4db8-854d-e2467fa81f65",
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
  "arrived_at": "2026-10-30T09:25:59.246959Z",
  "started_at": "2026-10-30T09:25:59.555943Z",
  "completed_at": "2026-10-30T09:25:59.870955Z",
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
  "command_id": "32c86851-719c-4858-a149-76fddb3b15fc",
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
  "id": "679d4539-9546-43b6-919d-e8f95e1dd8f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:31:00.191320Z",
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
  "command_id": "b8f8c7a2-41a7-4e58-a62c-11cc3bb1c1ce",
  "quote_id": "679d4539-9546-43b6-919d-e8f95e1dd8f0",
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
    "phone": "+3806711114703"
  }
}
```

```json
{
  "id": "cea08934-420b-4bf2-9861-8b697b4e4407",
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
  "created_at": "2026-10-30T09:26:00.508851Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114703"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/cea08934-420b-4bf2-9861-8b697b4e4407` → **200**

```json
{
  "id": "cea08934-420b-4bf2-9861-8b697b4e4407",
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
  "created_at": "2026-10-30T09:26:00.508851Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114703"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cea08934-420b-4bf2-9861-8b697b4e4407/cancel` → **200**

```json
{
  "command_id": "270cc134-5c1e-45fa-b8cc-88f145874287",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "cea08934-420b-4bf2-9861-8b697b4e4407",
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
  "created_at": "2026-10-30T09:26:00.508851Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114703"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
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
  "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:23:09.41858Z",
  "last_entries": [
    {
      "order_id": "cea08934-420b-4bf2-9861-8b697b4e4407",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T09:26:01.19112Z"
    },
    {
      "order_id": "db386a94-32c1-4de8-b7d1-f5af530d3533",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T09:25:59.876297Z"
    },
    {
      "order_id": "597b3f00-2a8a-4c48-a845-4c3b0ddce719",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:23:09.41858Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04ce825e-ab6a-40e2-af75-e9f659010b22",
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
  "last_heartbeat_at": "2026-10-30T09:25:58.939153Z",
  "last_location_at": "2026-10-30T09:25:58.939153Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04ce825e-ab6a-40e2-af75-e9f659010b22/close` → **200**

```json
{
  "command_id": "978a96d9-2622-49f3-9b84-376342985139",
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

Done: operator bonus for fulfilled db386a94-32c1-4de8-b7d1-f5af530d3533 and operator-fault cancellation cea08934-420b-4bf2-9861-8b697b4e4407.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674196343",
  "device_ref": "sandbox-8459"
}
```

```json
{
  "challenge_id": "52d8d5da-dc05-4404-8c29-8baa7fb5b7f0",
  "expires_at": "2026-10-30T09:31:05.640471015Z",
  "resend_available_at": "2026-10-30T09:26:06.640471015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674196343` → **200**

```json
{
  "phone": "+380674196343",
  "audience": "CLIENT",
  "code": "763461",
  "sent_at": "2026-10-30T09:26:05.644828061Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672643290",
  "device_ref": "sandbox-17941",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b9b6792f-1b16-482e-873a-31e5128b88a5",
  "expires_at": "2026-10-30T09:31:07.176754646Z",
  "resend_available_at": "2026-10-30T09:26:08.176754646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672643290` → **200**

```json
{
  "phone": "+380672643290",
  "audience": "CLIENT",
  "code": "978101",
  "sent_at": "2026-10-30T09:26:07.179532111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672643290",
  "device_ref": "sandbox-5157",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ac35ef4a-22cf-47b2-bc5a-05b725fa3601",
  "expires_at": "2026-10-30T09:31:08.707822325Z",
  "resend_available_at": "2026-10-30T09:26:09.707822325Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672643290` → **200**

```json
{
  "phone": "+380672643290",
  "audience": "CLIENT",
  "code": "546746",
  "sent_at": "2026-10-30T09:26:08.711182379Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674830000",
  "device_ref": "sandbox-14539"
}
```

```json
{
  "challenge_id": "68888cdf-76a7-4465-b8a1-4c2a8fa8c100",
  "expires_at": "2026-10-30T09:31:10.24687664Z",
  "resend_available_at": "2026-10-30T09:26:11.24687664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674830000",
  "device_ref": "sandbox-25074"
}
```

```json
{
  "challenge_id": "8b07f582-b797-4111-8c2a-2bf6b8a07d2e",
  "expires_at": "2026-10-30T09:31:11.740563303Z",
  "resend_available_at": "2026-10-30T09:26:12.740563303Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674830000` → **200**

```json
{
  "phone": "+380674830000",
  "audience": "CLIENT",
  "code": "897651",
  "sent_at": "2026-10-30T09:26:11.744512653Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674830000",
  "device_ref": "sandbox-29220",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1abefbcb-e5c3-432b-aebc-718ae490feb1",
  "expires_at": "2026-10-30T09:31:13.272852191Z",
  "resend_available_at": "2026-10-30T09:26:14.272852191Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674830000` → **200**

```json
{
  "phone": "+380674830000",
  "audience": "CLIENT",
  "code": "769029",
  "sent_at": "2026-10-30T09:26:13.275756292Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380674830000",
  "device_ref": "sandbox-18420",
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
  "correlation_id": "a2616c21-73b5-47bd-848b-b373761534ba",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000019784"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "3c2d9e1b-dd22-46d3-9ac5-51a248d6f709"
}
```

`GET /sandbox/v1/otp?phone=%2B442000019784` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120013173"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "c12fbda4-73bc-413d-83b0-7195c94c4c36"
}
```

`GET /sandbox/v1/otp?phone=%2B37120013173` → **404**

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
  "session_id": "026d7875-7499-4801-8a9f-47da05d66883",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyNzYsImlhdCI6MTc5MzM1MjM3NiwianRpIjoiMDhkNjdjMWEtN2U1Ni00NTc0LWFhNTYtODI2ZTMyYjhiMTIzIiwic2lkIjoiMDI2ZDc4NzUtNzQ5OS00ODAxLThhOWYtNDdkYTA1ZDY2ODgzIn0.TNwSlLyKE1P0IcOXM1c7ZqX_CW_xVG2-1XPznFxuef4",
  "access_expires_at": "2026-10-30T09:41:16.055885018Z",
  "refresh_token": "tBCrGVUwC54g2LaHXMAiSBOuDBn9o9nE5Cxqi0GOqn4",
  "refresh_expires_at": "2026-10-30T21:26:16.054986471Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674830000` → **200**

```json
{
  "deliveries": [
    {
      "id": "2dce30ed-c9ef-46b6-83e3-eb4c0ab031a4",
      "challenge_id": "1abefbcb-e5c3-432b-aebc-718ae490feb1",
      "phone": "+380674830000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8e2107f6-660a-41b4-9a41-db185446327d",
      "error": null,
      "attempted_at": "2026-10-30T09:26:13.276015Z"
    },
    {
      "id": "ac7ef842-3c9c-48c6-8a53-51afd0bb0a14",
      "challenge_id": "8b07f582-b797-4111-8c2a-2bf6b8a07d2e",
      "phone": "+380674830000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4b9d8ca3-19d2-41e4-b810-883a04197728",
      "error": null,
      "attempted_at": "2026-10-30T09:26:11.744796Z"
    },
    {
      "id": "7b438f42-cb3a-4786-a6b5-1893dcac4397",
      "challenge_id": "68888cdf-76a7-4465-b8a1-4c2a8fa8c100",
      "phone": "+380674830000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T09:26:10.249911Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674830000` → **200**

```json
{
  "phone": "+380674830000",
  "audience": "CLIENT",
  "code": "769029",
  "sent_at": "2026-10-30T09:26:13.275756292Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672643290` → **200**

```json
{
  "deliveries": [
    {
      "id": "79a83c0f-6a87-4641-93d1-ff2d46941fed",
      "challenge_id": "ac35ef4a-22cf-47b2-bc5a-05b725fa3601",
      "phone": "+380672643290",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ca180a44-47c3-4f41-8fee-de3dbf06fcd8",
      "error": null,
      "attempted_at": "2026-10-30T09:26:08.711507Z"
    },
    {
      "id": "fd761d26-e969-4d5c-a6d1-71210148904a",
      "challenge_id": "b9b6792f-1b16-482e-873a-31e5128b88a5",
      "phone": "+380672643290",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-577e5fa6-aa85-4517-b93c-90b8bfc65608",
      "error": null,
      "attempted_at": "2026-10-30T09:26:07.180037Z"
    }
  ]
}
```

Done: SMS to +380674196343; SMS then a call to +380672643290; a failed SMS, two calls and a refused third to +380674830000; +44 and +371 refused.

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
  "session_id": "5d13b277-84fd-4dec-b7a5-65ebc9fcc108",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyNzcsImlhdCI6MTc5MzM1MjM3NywianRpIjoiZWQ3MTA2NGItNmE3NS00YWQxLTg0OTctNjNiYzliZmYxYTViIiwic2lkIjoiNWQxM2IyNzctODRmZC00ZGVjLWI3YTUtNjVlYmM5ZmNjMTA4In0.avSW0UtuXESRsJIN0O5qLU83rFY1j6JcFWOoJUng97Q",
  "access_expires_at": "2026-10-30T09:41:17.275227108Z",
  "refresh_token": "G5wOnwMYr0txd3ooZcP_Gm5vf5edAL_RnIzHKGnLjYI",
  "refresh_expires_at": "2026-10-30T21:26:17.274300049Z",
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
  "session_id": "f7e227d9-bec7-4c91-8fa0-27ca2b467ac7",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMyNzcsImlhdCI6MTc5MzM1MjM3NywianRpIjoiNzcyMTg2ZDEtNjIyNC00YmE1LTkwMDctNjkyN2FmNGE0Y2JmIiwic2lkIjoiZjdlMjI3ZDktYmVjNy00YzkxLThmYTAtMjdjYTJiNDY3YWM3In0.KGnPDBsJlkUMm6BJ7drE9lR-s3tdUw0ZGjqIkhwmeQ4",
  "access_expires_at": "2026-10-30T09:41:17.859547688Z",
  "refresh_token": "KZRi5AtVP7h87X7--IrzyUnakHnZohYZ9xWQ63NB1nQ",
  "refresh_expires_at": "2026-10-30T21:26:17.858863553Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
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

`POST /api/admin/v1/staff-extensions/42bf38ce-c790-4895-aa62-2de6f12aba20` → **200**

```json
{
  "command_id": "7f5f40ef-0b87-4925-8447-7669dc20c287",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "14c66c35-6f4f-46b0-837f-a4946b383e44",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:26:19.03895Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:26:19.03895Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "30e1cdc0-dace-4aff-8dd9-36b47d8fc8d0",
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
  "id": "ab8c6303-f9b2-443f-9e79-8cbb3044271e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:31:19.610128Z",
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
  "command_id": "4d8d92e5-7562-4b80-9491-97d4fbf689ef",
  "quote_id": "ab8c6303-f9b2-443f-9e79-8cbb3044271e",
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
    "phone": "+380673757246"
  }
}
```

```json
{
  "id": "ebafec19-5332-41e2-a7da-7ac9127d99ec",
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
  "created_at": "2026-10-30T09:26:19.912175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673757246"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/ebafec19-5332-41e2-a7da-7ac9127d99ec/calls` → **201**

```json
{
  "command_id": "0e318cd6-a392-4fa7-b004-a1ef847d59f3",
  "to": "CALLER"
}
```

```json
{
  "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "order_ids": [
    "ebafec19-5332-41e2-a7da-7ac9127d99ec"
  ],
  "started_at": "2026-10-30T09:26:20.247421Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/ebafec19-5332-41e2-a7da-7ac9127d99ec/calls` → **201**

```json
{
  "command_id": "0e318cd6-a392-4fa7-b004-a1ef847d59f3",
  "to": "CALLER"
}
```

```json
{
  "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "order_ids": [
    "ebafec19-5332-41e2-a7da-7ac9127d99ec"
  ],
  "started_at": "2026-10-30T09:26:20.247421Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "81807652-a1c2-4c1d-8522-7b69377db47b",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673757246",
    "at": "2026-10-30T09:26:20.249933328Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25823",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "81807652-a1c2-4c1d-8522-7b69377db47b"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=ebafec19-5332-41e2-a7da-7ac9127d99ec` → **200**

```json
{
  "calls": [
    {
      "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [
        "ebafec19-5332-41e2-a7da-7ac9127d99ec"
      ],
      "started_at": "2026-10-30T09:26:20.247421Z",
      "answered_at": "2026-10-30T09:26:20.963502Z",
      "ended_at": "2026-10-30T09:26:20.987879Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ebafec19-5332-41e2-a7da-7ac9127d99ec` → **200**

```json
{
  "calls": [
    {
      "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [
        "ebafec19-5332-41e2-a7da-7ac9127d99ec"
      ],
      "started_at": "2026-10-30T09:26:20.247421Z",
      "answered_at": "2026-10-30T09:26:20.963502Z",
      "ended_at": "2026-10-30T09:26:20.987879Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ebafec19-5332-41e2-a7da-7ac9127d99ec` → **200**

```json
{
  "calls": [
    {
      "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [
        "ebafec19-5332-41e2-a7da-7ac9127d99ec"
      ],
      "started_at": "2026-10-30T09:26:20.247421Z",
      "answered_at": "2026-10-30T09:26:20.963502Z",
      "ended_at": "2026-10-30T09:26:20.987879Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ebafec19-5332-41e2-a7da-7ac9127d99ec` → **200**

```json
{
  "calls": [
    {
      "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [
        "ebafec19-5332-41e2-a7da-7ac9127d99ec"
      ],
      "started_at": "2026-10-30T09:26:20.247421Z",
      "answered_at": "2026-10-30T09:26:20.963502Z",
      "ended_at": "2026-10-30T09:26:20.987879Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ebafec19-5332-41e2-a7da-7ac9127d99ec` → **200**

```json
{
  "calls": [
    {
      "id": "81807652-a1c2-4c1d-8522-7b69377db47b",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "order_ids": [
        "ebafec19-5332-41e2-a7da-7ac9127d99ec"
      ],
      "started_at": "2026-10-30T09:26:20.247421Z",
      "answered_at": "2026-10-30T09:26:20.963502Z",
      "ended_at": "2026-10-30T09:26:20.987879Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:26:28.028742Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/ebafec19-5332-41e2-a7da-7ac9127d99ec` → **200**

```json
{
  "id": "ebafec19-5332-41e2-a7da-7ac9127d99ec",
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
  "created_at": "2026-10-30T09:26:19.912175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673757246"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ebafec19-5332-41e2-a7da-7ac9127d99ec/cancel` → **200**

```json
{
  "command_id": "a2af97b4-1be5-4fed-8dbd-a728aacd833a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ebafec19-5332-41e2-a7da-7ac9127d99ec",
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
  "created_at": "2026-10-30T09:26:19.912175Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673757246"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "command_id": "9ab44fcb-9680-471d-b7fc-0879ffd006c9",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T09:26:31.221958Z",
  "extension": "101"
}
```

Done: outgoing call 81807652-a1c2-4c1d-8522-7b69377db47b from order ebafec19-5332-41e2-a7da-7ac9127d99ec, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632782760",
  "device_ref": "sandbox-30647"
}
```

```json
{
  "challenge_id": "ebccfee1-4f6f-475c-ae1e-05d0e4c1ea04",
  "expires_at": "2026-10-30T09:31:31.526543895Z",
  "resend_available_at": "2026-10-30T09:26:32.526543895Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632782760` → **200**

```json
{
  "phone": "+380632782760",
  "audience": "CLIENT",
  "code": "043853",
  "sent_at": "2026-10-30T09:26:31.529807218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebccfee1-4f6f-475c-ae1e-05d0e4c1ea04",
  "code": "043853",
  "device_ref": "sandbox-30647"
}
```

```json
{
  "session_id": "ef8f07ae-99d7-4005-b513-0cc8a7f0d6ff",
  "subject": {
    "type": "CLIENT",
    "id": "77c3f389-2e8a-4ef8-a073-6464401c904a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2MzZjM4OS0yZThhLTRlZjgtYTA3My02NDY0NDAxYzkwNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjkxLCJpYXQiOjE3OTMzNTIzOTEsImp0aSI6ImM4YjE3OTk0LWY0NTYtNGJmYS04ZDRmLWZlY2Q4MWQ3OTdkMyIsInNpZCI6ImVmOGYwN2FlLTk5ZDctNDAwNS1iNTEzLTBjYzhhN2YwZDZmZiJ9.Xu2kTnwrNtCWz_oB7xJvSq0xbGCV_DCSO27Eteg5kR4",
  "access_expires_at": "2026-10-30T09:41:31.851717817Z",
  "refresh_token": "LLbpWlcA_9F8yGzqdAUkLrDX2EVtIffwJsv8HDjJmuE",
  "refresh_expires_at": "2026-11-29T09:26:31.851057685Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
  "session_id": "ef8f07ae-99d7-4005-b513-0cc8a7f0d6ff",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632782760",
  "device_ref": "sandbox-8104"
}
```

```json
{
  "challenge_id": "4fb179e2-3d88-4307-b4a8-6780a7d71599",
  "expires_at": "2026-10-30T09:31:34.428264175Z",
  "resend_available_at": "2026-10-30T09:26:35.428264175Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632782760` → **200**

```json
{
  "phone": "+380632782760",
  "audience": "CLIENT",
  "code": "341363",
  "sent_at": "2026-10-30T09:26:34.43133497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fb179e2-3d88-4307-b4a8-6780a7d71599",
  "code": "341363",
  "device_ref": "sandbox-8104"
}
```

```json
{
  "session_id": "a565dae2-9154-4b4e-a70d-f1334e08f02a",
  "subject": {
    "type": "CLIENT",
    "id": "77c3f389-2e8a-4ef8-a073-6464401c904a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2MzZjM4OS0yZThhLTRlZjgtYTA3My02NDY0NDAxYzkwNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMjk0LCJpYXQiOjE3OTMzNTIzOTQsImp0aSI6IjM1YWMzNjRiLTE3MGYtNGZkNS1iN2IwLTlhNDM4MWM3NTIzNyIsInNpZCI6ImE1NjVkYWUyLTkxNTQtNGI0ZS1hNzBkLWYxMzM0ZTA4ZjAyYSJ9.DGC1P9-3G7lj62DKNODHy8asFGbRCMgp2XpMZr-yj04",
  "access_expires_at": "2026-10-30T09:41:34.755551233Z",
  "refresh_token": "sTiCMS88iI-iK2tHFsvte62z7IXVafCz7h0i7-QnyXM",
  "refresh_expires_at": "2026-11-29T09:26:34.75495493Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "aa7d554b-c6e7-43d2-bc19-3a22f3278e23",
  "expires_at": "2026-10-30T09:31:37.053687292Z",
  "resend_available_at": "2026-10-30T09:26:38.053687292Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632782760` → **200**

```json
{
  "phone": "+380632782760",
  "audience": "CLIENT",
  "code": "967688",
  "sent_at": "2026-10-30T09:26:37.057219203Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637374710"
}
```

```json
{
  "challenge_id": "d263ba7e-5b75-4888-bde0-c039cf2ee415",
  "expires_at": "2026-10-30T09:31:37.362769522Z",
  "resend_available_at": "2026-10-30T09:26:38.362769522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637374710` → **200**

```json
{
  "phone": "+380637374710",
  "audience": "CLIENT",
  "code": "602957",
  "sent_at": "2026-10-30T09:26:37.365149419Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "33544040-42c0-4f07-acdd-cbf7770bf6e2",
  "current_challenge_id": "aa7d554b-c6e7-43d2-bc19-3a22f3278e23",
  "current_code": "000000",
  "new_challenge_id": "d263ba7e-5b75-4888-bde0-c039cf2ee415",
  "new_code": "602957"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6296dcb4-eb1c-4f15-94e7-fd0bfb587b4f"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "9d15d28c-c603-4c46-8632-351215ca96f3",
  "current_challenge_id": "aa7d554b-c6e7-43d2-bc19-3a22f3278e23",
  "current_code": "967688",
  "new_challenge_id": "d263ba7e-5b75-4888-bde0-c039cf2ee415",
  "new_code": "602957"
}
```

```json
{
  "subject_id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
  "phone": "+380637374710",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
  "session_id": "ef8f07ae-99d7-4005-b513-0cc8a7f0d6ff",
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
  "correlation_id": "0bc4b202-7b46-470f-aa9d-e58fcbf8b698"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637374710",
  "device_ref": "sandbox-11237"
}
```

```json
{
  "challenge_id": "d28d4a53-d384-455b-9798-de06261f81e7",
  "expires_at": "2026-10-30T09:31:40.860731506Z",
  "resend_available_at": "2026-10-30T09:26:41.860731506Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637374710` → **200**

```json
{
  "phone": "+380637374710",
  "audience": "CLIENT",
  "code": "418174",
  "sent_at": "2026-10-30T09:26:40.864034372Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d28d4a53-d384-455b-9798-de06261f81e7",
  "code": "418174",
  "device_ref": "sandbox-11237"
}
```

```json
{
  "session_id": "c087305f-78af-48f7-8c46-841d6c365774",
  "subject": {
    "type": "CLIENT",
    "id": "77c3f389-2e8a-4ef8-a073-6464401c904a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2MzZjM4OS0yZThhLTRlZjgtYTA3My02NDY0NDAxYzkwNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzAxLCJpYXQiOjE3OTMzNTI0MDEsImp0aSI6ImFiNjljNmQxLTQyOGEtNGMzYy1hMGE0LWM3NzU1NzE1ZjJhMCIsInNpZCI6ImMwODczMDVmLTc4YWYtNDhmNy04YzQ2LTg0MWQ2YzM2NTc3NCJ9.WwIs0wt0n5mmzwgEDUsZYGgE5D69MgzI1B0zC5QSeSw",
  "access_expires_at": "2026-10-30T09:41:41.182292911Z",
  "refresh_token": "JmKfB9ZW0ekQc12T_ETmkxcbW-M6NMl2AQxJYhBzIHY",
  "refresh_expires_at": "2026-11-29T09:26:41.181645893Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
  "session_id": "c087305f-78af-48f7-8c46-841d6c365774",
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
  "session_id": "839166a2-875f-4caa-8d79-0e672b8001aa",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMDIsImlhdCI6MTc5MzM1MjQwMiwianRpIjoiOTdhY2I2ODItMjYyYi00MDJhLWE3MzMtODg3ODY4MGEzNDQzIiwic2lkIjoiODM5MTY2YTItODc1Zi00Y2FhLThkNzktMGU2NzJiODAwMWFhIn0.mmM0X8a7nKcmSuJ2NLNRhIAL7R201TSPkNVnRhRe-zY",
  "access_expires_at": "2026-10-30T09:41:42.059659265Z",
  "refresh_token": "WSHX3YiOts3Aj4BhfDKsAkgZBE0dKb9UEOQ47isY7ek",
  "refresh_expires_at": "2026-10-30T21:26:42.058995335Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a` → **200**

```json
{
  "client": {
    "id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
    "phone": "+380637374710",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:26:31.848851Z",
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

`POST /api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a/phone/new-code` → **201**

```json
{
  "phone": "+380633383854"
}
```

```json
{
  "challenge_id": "537cede1-4010-49ee-a3ae-99617794853e",
  "expires_at": "2026-10-30T09:31:42.692132103Z",
  "resend_available_at": "2026-10-30T09:26:43.692132103Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633383854` → **200**

```json
{
  "phone": "+380633383854",
  "audience": "CLIENT",
  "code": "649915",
  "sent_at": "2026-10-30T09:26:42.694648311Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a/phone` → **422**

```json
{
  "command_id": "4c4a2946-1068-4c38-b082-b3ee29d60cec",
  "expected_version": 3,
  "new_challenge_id": "537cede1-4010-49ee-a3ae-99617794853e",
  "new_code": "649916",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e9eb938f-f72b-4176-a390-c26dfb58b3aa"
}
```

`POST /api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a/phone` → **400**

```json
{
  "command_id": "55bb5f9f-818f-40bc-b981-cb9ff7ab97db",
  "expected_version": 3,
  "new_challenge_id": "537cede1-4010-49ee-a3ae-99617794853e",
  "new_code": "649915",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "60a62228-99c4-4e64-95a4-4dcbc9b35cd0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/77c3f389-2e8a-4ef8-a073-6464401c904a/phone` → **200**

```json
{
  "command_id": "3680ce11-e100-4a9a-b1a8-6ab0cb36a90b",
  "expected_version": 3,
  "new_challenge_id": "537cede1-4010-49ee-a3ae-99617794853e",
  "new_code": "649915",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
  "phone": "+380633383854",
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
  "correlation_id": "bf10fda3-bc22-4e15-95bc-c78efb67ec63"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633383854",
  "device_ref": "sandbox-8641"
}
```

```json
{
  "challenge_id": "8951082f-5ef4-46cb-840d-d9fd1dba782a",
  "expires_at": "2026-10-30T09:31:44.228040408Z",
  "resend_available_at": "2026-10-30T09:26:45.228040408Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633383854` → **200**

```json
{
  "phone": "+380633383854",
  "audience": "CLIENT",
  "code": "045194",
  "sent_at": "2026-10-30T09:26:44.23095689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8951082f-5ef4-46cb-840d-d9fd1dba782a",
  "code": "045194",
  "device_ref": "sandbox-8641"
}
```

```json
{
  "session_id": "06bcf27f-d570-4a9d-8e02-73478841dda3",
  "subject": {
    "type": "CLIENT",
    "id": "77c3f389-2e8a-4ef8-a073-6464401c904a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2MzZjM4OS0yZThhLTRlZjgtYTA3My02NDY0NDAxYzkwNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzA0LCJpYXQiOjE3OTMzNTI0MDQsImp0aSI6Ijc5MGY5YTM4LTc3OWItNGE0ZC05MDI1LTEyNmMyZTgwNDAyNyIsInNpZCI6IjA2YmNmMjdmLWQ1NzAtNGE5ZC04ZTAyLTczNDc4ODQxZGRhMyJ9.rjXziwAeDw7ytvI7_ss69CMh3n9-9NUTXfwwE5DdAi0",
  "access_expires_at": "2026-10-30T09:41:44.556541745Z",
  "refresh_token": "eXqpO30fMqrQPX2Ui_rCjBAgGVb9EUg5hBQ9ZOPWFiM",
  "refresh_expires_at": "2026-11-29T09:26:44.556020402Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77c3f389-2e8a-4ef8-a073-6464401c904a",
  "session_id": "06bcf27f-d570-4a9d-8e02-73478841dda3",
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
  "phone": "+380633939022",
  "device_ref": "sandbox-5013"
}
```

```json
{
  "challenge_id": "7fe25d72-0dce-470e-b6d6-305154e4aa2a",
  "expires_at": "2026-10-30T09:31:45.133021397Z",
  "resend_available_at": "2026-10-30T09:26:46.133021397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633939022` → **200**

```json
{
  "phone": "+380633939022",
  "audience": "CLIENT",
  "code": "005682",
  "sent_at": "2026-10-30T09:26:45.13591606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fe25d72-0dce-470e-b6d6-305154e4aa2a",
  "code": "005682",
  "device_ref": "sandbox-5013"
}
```

```json
{
  "session_id": "723f5a0b-2c6f-45d2-8044-b36ae3ae0f64",
  "subject": {
    "type": "CLIENT",
    "id": "9c88072a-6b29-4b53-90d1-63226859faf0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Yzg4MDcyYS02YjI5LTRiNTMtOTBkMS02MzIyNjg1OWZhZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzA1LCJpYXQiOjE3OTMzNTI0MDUsImp0aSI6IjAyNjI0MDM3LTJkMjAtNGRiMy1iMDEyLTIwYjY5Y2JhZTk0OSIsInNpZCI6IjcyM2Y1YTBiLTJjNmYtNDVkMi04MDQ0LWIzNmFlM2FlMGY2NCJ9.o-riZQA91wq1E0xFJIj_7rf8eNc11tXbzgOO_RhrM0Y",
  "access_expires_at": "2026-10-30T09:41:45.45182987Z",
  "refresh_token": "HBcKj-u5VrxLUHlPDU3zkOBm4VemNoXARvKCWMlCc74",
  "refresh_expires_at": "2026-11-29T09:26:45.451308146Z",
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
  "session_id": "19078676-bb3c-4a84-915e-5725ca52c46a",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMDYsImlhdCI6MTc5MzM1MjQwNiwianRpIjoiNGM4ZDU5Y2MtOTc1Mi00MTFhLWI5MTItNjU5MzdhM2JmMzg1Iiwic2lkIjoiMTkwNzg2NzYtYmIzYy00YTg0LTkxNWUtNTcyNWNhNTJjNDZhIn0.EeCl1H8n8HuGD3VmCtlUZyjUcU7WYI5pNq1NcixYfPg",
  "access_expires_at": "2026-10-30T09:41:46.638217988Z",
  "refresh_token": "FouFWCbdJ0v27XPFog4dd7VSyUtrreQewvOmYCxp14U",
  "refresh_expires_at": "2026-10-30T21:26:46.637519254Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633939022` → **200**

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
  "correlation_id": "3c3fb4ea-d79c-4ca0-b035-08b9a005479f"
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
  "session_id": "c3a8803e-49ed-41f6-a25c-eecd99d456e7",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMDcsImlhdCI6MTc5MzM1MjQwNywianRpIjoiZDYxMDYyMzMtZGQyOC00YzM4LThjOTktY2Y4MTE4NWIxNzIyIiwic2lkIjoiYzNhODgwM2UtNDllZC00MWY2LWEyNWMtZWVjZDk5ZDQ1NmU3In0.FrUxhcimSIWj33oDYQxFrM2jze0DPwBvpVZw8_sWiAg",
  "access_expires_at": "2026-10-30T09:41:47.820903253Z",
  "refresh_token": "uv8IvUiiUsYGM0m2lS7rnWFpTaMU7GwohrLyoTXbAE8",
  "refresh_expires_at": "2026-10-30T21:26:47.820359555Z",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:22:38.28708Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "95875d8d-e35c-4813-b46e-0d877cf8688b",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T09:26:48.416502824Z"
}
```

## The rider books the airport for 2026-10-30T12:26:47Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600953399",
  "device_ref": "sandbox-22525"
}
```

```json
{
  "challenge_id": "5ffee23c-9c89-4c67-b32e-d3b792cf5855",
  "expires_at": "2026-10-30T09:31:48.725352799Z",
  "resend_available_at": "2026-10-30T09:26:49.725352799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600953399` → **200**

```json
{
  "phone": "+48600953399",
  "audience": "CLIENT",
  "code": "385225",
  "sent_at": "2026-10-30T09:26:48.728279621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ffee23c-9c89-4c67-b32e-d3b792cf5855",
  "code": "385225",
  "device_ref": "sandbox-22525"
}
```

```json
{
  "session_id": "bfc7e056-549f-4848-9779-7446a0addad2",
  "subject": {
    "type": "CLIENT",
    "id": "773f711a-ad57-44e6-9b46-dfd1b760224f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzNmNzExYS1hZDU3LTQ0ZTYtOWI0Ni1kZmQxYjc2MDIyNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzA5LCJpYXQiOjE3OTMzNTI0MDksImp0aSI6ImNiZjUyZDc0LWE4MWQtNGU5Ny1hMTI4LTkwN2U1OTYzYTM0NyIsInNpZCI6ImJmYzdlMDU2LTU0OWYtNDg0OC05Nzc5LTc0NDZhMGFkZGFkMiJ9.NrRa2DdBQLz0fo4z_3fbuJa9RzKRb6mp_KYFiB37wWk",
  "access_expires_at": "2026-10-30T09:41:49.03591376Z",
  "refresh_token": "e1iOS6cVlvIefXGoscX0bdnN_2YJ6kdlt4QyX12qAgA",
  "refresh_expires_at": "2026-11-29T09:26:49.035411461Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f494cbec-375c-423b-be38-5bebe68df6e3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T12:26:47Z"
}
```

```json
{
  "id": "944cbff8-6038-491a-ac0e-65c7d3d636c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:31:49.327725Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:26:47Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "27e38c85-c1b2-45f6-b00e-4c7e410c66d0",
  "quote_id": "944cbff8-6038-491a-ac0e-65c7d3d636c7",
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
  "pickup_at": "2026-10-30T12:26:47Z"
}
```

```json
{
  "id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "773f711a-ad57-44e6-9b46-dfd1b760224f",
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
  "created_at": "2026-10-30T09:26:49.630266Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:26:47Z",
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
  "device_ref": "sandbox-14355"
}
```

```json
{
  "challenge_id": "f0075164-57ec-45f8-b627-ff40ea19681a",
  "expires_at": "2026-10-30T09:31:49.936590625Z",
  "resend_available_at": "2026-10-30T09:26:50.936590625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "515518",
  "sent_at": "2026-10-30T09:26:49.939562256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0075164-57ec-45f8-b627-ff40ea19681a",
  "code": "515518",
  "device_ref": "sandbox-14355"
}
```

```json
{
  "session_id": "2b138477-c96b-495e-975e-59ce94d1e584",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzMxMCwiaWF0IjoxNzkzMzUyNDEwLCJqdGkiOiIyMjMxMWU4Ni03ZGU4LTQ0MzMtYTk2ZC1kN2U2ZjFiNjJjODIiLCJzaWQiOiIyYjEzODQ3Ny1jOTZiLTQ5NWUtOTc1ZS01OWNlOTRkMWU1ODQifQ.tjPugR-NKfeyErXyML0mkIFwzhVfJGzDoWqPWHSTK1o",
  "access_expires_at": "2026-10-30T09:41:50.253097526Z",
  "refresh_token": "LSROf1IxNGCqRYf_PBUMmNWCnb34wR8srWIAcV-nAkM",
  "refresh_expires_at": "2026-11-29T09:26:50.25252605Z",
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
  "command_id": "1bb3b287-6c19-4b59-b43c-ea6ed9a1a14d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:26:50Z",
    "sequence": 1793352410827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e4b5ded0-ecfa-4b86-8603-92d8ee9a6387",
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
  "last_heartbeat_at": "2026-10-30T09:26:50.847359Z",
  "last_location_at": "2026-10-30T09:26:50.847359Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
      "short_number": 24,
      "pickup_at": "2026-10-30T12:26:47Z",
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

`POST /api/driver/v1/preorders/f96dacea-9034-4d89-88e8-13ce6ddcf2c6/reserve` → **200**

```json
{
  "command_id": "2b554482-ea61-4b36-9a6f-96fe1550d493"
}
```

```json
{
  "id": "0349241c-2c5c-4929-b2eb-22d22bf98c09",
  "state": "RESERVED",
  "order": {
    "order_id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
    "short_number": 24,
    "pickup_at": "2026-10-30T12:26:47Z",
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
  "reserved_at": "2026-10-30T09:26:51.460119Z",
  "confirm_from": "2026-10-30T11:56:47Z",
  "confirm_until": "2026-10-30T12:06:47Z",
  "drop_until": "2026-10-30T11:26:47Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0349241c-2c5c-4929-b2eb-22d22bf98c09",
      "state": "RESERVED",
      "order": {
        "order_id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:26:47Z",
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
      "reserved_at": "2026-10-30T09:26:51.460119Z",
      "confirm_from": "2026-10-30T11:56:47Z",
      "confirm_until": "2026-10-30T12:06:47Z",
      "drop_until": "2026-10-30T11:26:47Z"
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
      "id": "0349241c-2c5c-4929-b2eb-22d22bf98c09",
      "state": "RESERVED",
      "order": {
        "order_id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:26:47Z",
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
      "reserved_at": "2026-10-30T09:26:51.460119Z",
      "confirm_from": "2026-10-30T11:56:47Z",
      "confirm_until": "2026-10-30T12:06:47Z",
      "drop_until": "2026-10-30T11:26:47Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/0349241c-2c5c-4929-b2eb-22d22bf98c09/confirm` → **409**

```json
{
  "command_id": "dd8aab8b-45ec-477c-8139-00d0e9f3779e"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/0349241c-2c5c-4929-b2eb-22d22bf98c09/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "93388062-5b61-4afd-9073-442196581914"
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
  "session_id": "f364415a-abec-4339-82b9-70d04cfeac9b",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMTIsImlhdCI6MTc5MzM1MjQxMiwianRpIjoiODk2MWJhMDAtYWQ4ZS00NzM1LTk1MDAtNDAxZTdiOGUzOTAxIiwic2lkIjoiZjM2NDQxNWEtYWJlYy00MzM5LTgyYjktNzBkMDRjZmVhYzliIn0.TMkveB_5HOEeSYXPMLHXJJLjD28emAHexo0daGH1WqM",
  "access_expires_at": "2026-10-30T09:41:52.96317833Z",
  "refresh_token": "sNQxtO7Wtb7QWFYFo0ihNPiHEBg61WvRBCvzg2enL9E",
  "refresh_expires_at": "2026-10-30T21:26:52.962523959Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f96dacea-9034-4d89-88e8-13ce6ddcf2c6` → **200**

```json
{
  "id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "773f711a-ad57-44e6-9b46-dfd1b760224f",
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
  "created_at": "2026-10-30T09:26:49.630266Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T12:26:47Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "0349241c-2c5c-4929-b2eb-22d22bf98c09",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T09:26:51.460119Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f96dacea-9034-4d89-88e8-13ce6ddcf2c6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T09:26:49.631404Z",
      "actor": {
        "type": "CLIENT",
        "id": "773f711a-ad57-44e6-9b46-dfd1b760224f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
        "preorder": true,
        "quote_id": "944cbff8-6038-491a-ac0e-65c7d3d636c7",
        "pickup_at": "2026-10-30T12:26:47Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "38e923be-3402-4c6b-93fd-ea240c720348"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T09:26:51.461353Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f96dacea-9034-4d89-88e8-13ce6ddcf2c6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "0349241c-2c5c-4929-b2eb-22d22bf98c09"
      },
      "correlation_id": "1312474d-985d-4e19-baba-63839fa5bfe8"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order f96dacea-9034-4d89-88e8-13ce6ddcf2c6, reservation 0349241c-2c5c-4929-b2eb-22d22bf98c09.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16675"
}
```

```json
{
  "challenge_id": "04109fc7-e626-44ae-b220-cda72de2f450",
  "expires_at": "2026-10-30T09:31:53.878566396Z",
  "resend_available_at": "2026-10-30T09:26:54.878566396Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "057415",
  "sent_at": "2026-10-30T09:26:53.881469804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04109fc7-e626-44ae-b220-cda72de2f450",
  "code": "057415",
  "device_ref": "sandbox-16675"
}
```

```json
{
  "session_id": "70778d72-4a4e-4e2d-91f9-a3c5245f681a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzMxNCwiaWF0IjoxNzkzMzUyNDE0LCJqdGkiOiI2OTcyZjg0Ni1hN2NhLTQyMTctOGI1Mi0wYzRmMzA0Zjk1NGEiLCJzaWQiOiI3MDc3OGQ3Mi00YTRlLTRlMmQtOTFmOS1hM2M1MjQ1ZjY4MWEifQ.Wv0NslRLg4K5hsMmKuwqajZNoUugjxAKtV-FhbxZb20",
  "access_expires_at": "2026-10-30T09:41:54.200077176Z",
  "refresh_token": "ZuV6t4DFMqF6YYlj7iZlAtEQcku6acboKUn8eMZxQ28",
  "refresh_expires_at": "2026-11-29T09:26:54.199578181Z",
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
  "command_id": "74ed9073-6cfa-4827-b98c-4d053d441abf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:26:54Z",
    "sequence": 1793352414790
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:26:54.80983Z",
  "last_location_at": "2026-10-30T09:26:54.80983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673854090",
  "device_ref": "sandbox-4140"
}
```

```json
{
  "challenge_id": "4acab5cb-792d-4b2d-81d1-d2cc62290eb6",
  "expires_at": "2026-10-30T09:31:55.10840964Z",
  "resend_available_at": "2026-10-30T09:26:56.10840964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673854090` → **200**

```json
{
  "phone": "+380673854090",
  "audience": "CLIENT",
  "code": "450886",
  "sent_at": "2026-10-30T09:26:55.111205105Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4acab5cb-792d-4b2d-81d1-d2cc62290eb6",
  "code": "450886",
  "device_ref": "sandbox-4140"
}
```

```json
{
  "session_id": "cc2d091e-407a-4966-a8fb-e0e6b9ccff7b",
  "subject": {
    "type": "CLIENT",
    "id": "299257df-fdee-4481-aa5a-6bd72fe6e636"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTkyNTdkZi1mZGVlLTQ0ODEtYWE1YS02YmQ3MmZlNmU2MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzE1LCJpYXQiOjE3OTMzNTI0MTUsImp0aSI6ImEyYWQ4Nzk5LTA1OGUtNDBmNC04MjJkLWNjMzU0MjE2ZWJlMCIsInNpZCI6ImNjMmQwOTFlLTQwN2EtNDk2Ni1hOGZiLWUwZTZiOWNjZmY3YiJ9.IvVExta-irD8Fq2XhIDcNEKU-WSIzu2enP9BOVgdX38",
  "access_expires_at": "2026-10-30T09:41:55.436237235Z",
  "refresh_token": "AuIwhHouTtDP83oelktFDFo7IuSUVVNHr0RefA6D7rA",
  "refresh_expires_at": "2026-11-29T09:26:55.435544527Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e9383e42-0c01-468d-8b33-dd9192b5dd62",
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
  "id": "2f4a1857-7791-4607-98ad-180c278c9667",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:31:55.752003Z",
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
  "command_id": "13e9146b-7e6f-4fa4-b02a-4ca812a0932f",
  "quote_id": "2f4a1857-7791-4607-98ad-180c278c9667",
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
  "id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "299257df-fdee-4481-aa5a-6bd72fe6e636",
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
  "created_at": "2026-10-30T09:26:56.066691Z",
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
    "id": "a3054b2b-a2f1-46df-936b-3b529286fa52",
    "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
    "expires_at": "2026-10-30T09:27:11.069815Z",
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

`POST /api/driver/v1/offers/a3054b2b-a2f1-46df-936b-3b529286fa52/accept` → **200**

```json
{
  "command_id": "a6d9d3aa-49d0-4ab9-b873-68258567a74f"
}
```

```json
{
  "id": "89427dfb-46e1-4914-bcbe-d1afc29d752d",
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "002a802e-0f37-4016-80d0-154426adc17d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "002a802e-0f37-4016-80d0-154426adc17d",
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "assignment_id": "89427dfb-46e1-4914-bcbe-d1afc29d752d",
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

`POST /api/driver/v1/work-sessions/cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:26:57Z",
    "sequence": 1793352417292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:26:57.312264Z",
  "last_location_at": "2026-10-30T09:26:57.312264Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "002a802e-0f37-4016-80d0-154426adc17d",
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "assignment_id": "89427dfb-46e1-4914-bcbe-d1afc29d752d",
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

`POST /api/driver/v1/trips/002a802e-0f37-4016-80d0-154426adc17d/arrive` → **200**

```json
{
  "command_id": "00057387-0101-4119-a7fd-2d9675e3d21a",
  "expected_version": 0
}
```

```json
{
  "id": "002a802e-0f37-4016-80d0-154426adc17d",
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "assignment_id": "89427dfb-46e1-4914-bcbe-d1afc29d752d",
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
  "arrived_at": "2026-10-30T09:26:57.891781Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/002a802e-0f37-4016-80d0-154426adc17d/start` → **200**

```json
{
  "command_id": "f6c53545-6bc0-456b-a2a0-891f8408dd50",
  "expected_version": 1
}
```

```json
{
  "id": "002a802e-0f37-4016-80d0-154426adc17d",
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "assignment_id": "89427dfb-46e1-4914-bcbe-d1afc29d752d",
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
  "arrived_at": "2026-10-30T09:26:57.891781Z",
  "started_at": "2026-10-30T09:26:58.197388Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:26:58Z",
    "sequence": 1793352418491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:26:58.512039Z",
  "last_location_at": "2026-10-30T09:26:58.512039Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/002a802e-0f37-4016-80d0-154426adc17d/complete` → **200**

```json
{
  "command_id": "3f55b1af-b25a-4666-92da-15adc0b2ce3d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:26:58Z",
  "cash_received": true
}
```

```json
{
  "id": "002a802e-0f37-4016-80d0-154426adc17d",
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "assignment_id": "89427dfb-46e1-4914-bcbe-d1afc29d752d",
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
  "arrived_at": "2026-10-30T09:26:57.891781Z",
  "started_at": "2026-10-30T09:26:58.197388Z",
  "completed_at": "2026-10-30T09:26:58.807808Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/2913d662-a6bf-4b3c-ae04-3c028d1a2ec3/rating` → **200**

```json
{
  "command_id": "eb0a525e-3806-429d-946f-d3c902d73401",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "score": 5,
  "created_at": "2026-10-30T09:26:59.129017645Z"
}
```

`POST /api/driver/v1/orders/2913d662-a6bf-4b3c-ae04-3c028d1a2ec3/rating` → **200**

```json
{
  "command_id": "011c4370-e969-42c3-9b89-67c79360162c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
  "score": 4,
  "created_at": "2026-10-30T09:26:59.424148531Z"
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
  "session_id": "b2624fac-b858-4232-aa90-609b372dfa8c",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMjAsImlhdCI6MTc5MzM1MjQyMCwianRpIjoiNTkxN2FlNDktZjUxMi00MjBhLTljODktZjMxNjcyYTYxZDUzIiwic2lkIjoiYjI2MjRmYWMtYjg1OC00MjMyLWFhOTAtNjA5YjM3MmRmYThjIn0.zuK1vyS1cV9g4SrQQF2cbq-Z8Ujm6VnLdlMlcMMZOOE",
  "access_expires_at": "2026-10-30T09:42:00.304374409Z",
  "refresh_token": "RJO8pmzIoKJpZ1jAsoYEv-sPUcLnd1DOVaLy8AmK0Nc",
  "refresh_expires_at": "2026-10-30T21:27:00.30384145Z",
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
  "session_id": "2e0473a9-70f5-4f8f-8cc9-9b91f63688c1",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMjAsImlhdCI6MTc5MzM1MjQyMCwianRpIjoiMDE4NzNmYjAtOGZhOC00MWZiLWI4YzItMzUyNjk5YjQxMDc5Iiwic2lkIjoiMmUwNDczYTktNzBmNS00ZjhmLThjYzktOWI5MWY2MzY4OGMxIn0.S37njYzPIBBSiPT451iz49e9NbVOyP3vx7oHcoaoFQA",
  "access_expires_at": "2026-10-30T09:42:00.885808343Z",
  "refresh_token": "5LYKLc3dI8aJnfM-yQR5-BNiAJJZSWnSCTF-7D2U_9Q",
  "refresh_expires_at": "2026-10-30T21:27:00.885248824Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2913d662-a6bf-4b3c-ae04-3c028d1a2ec3/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
      "author_type": "RIDER",
      "author_id": "299257df-fdee-4481-aa5a-6bd72fe6e636",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T09:26:59.129018Z"
    },
    {
      "order_id": "2913d662-a6bf-4b3c-ae04-3c028d1a2ec3",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "299257df-fdee-4481-aa5a-6bd72fe6e636",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T09:26:59.424149Z"
    }
  ]
}
```

Done: ratings for order 2913d662-a6bf-4b3c-ae04-3c028d1a2ec3.

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
  "session_id": "f312b8c2-0def-42cc-b39d-a7dccba88ab0",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMjEsImlhdCI6MTc5MzM1MjQyMSwianRpIjoiNmRjZTBmMDEtYjY3ZS00ZmNmLWE2NDktZDE1NTgxMzRhMDgwIiwic2lkIjoiZjMxMmI4YzItMGRlZi00MmNjLWIzOWQtYTdkY2NiYTg4YWIwIn0.0ZYRdjX0AtVM_egGRKtYwzuS64CQ6ILo-OSs8MnG6aM",
  "access_expires_at": "2026-10-30T09:42:01.795931568Z",
  "refresh_token": "8eCr6hH_Ii6DB5n12xoaZVYwRE3_dN0EFaLrdx4tmD0",
  "refresh_expires_at": "2026-10-30T21:27:01.795354046Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5d081566-beb9-4c87-a006-c0a8204ad019",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "3dca04d5-7341-4eb7-b6ee-1b8e1cac4dfa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:27:02.10451Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3dca04d5-7341-4eb7-b6ee-1b8e1cac4dfa` → **200**

```json
{
  "id": "3dca04d5-7341-4eb7-b6ee-1b8e1cac4dfa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:27:02.10451Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3dca04d5-7341-4eb7-b6ee-1b8e1cac4dfa` → **200**

```json
{
  "id": "3dca04d5-7341-4eb7-b6ee-1b8e1cac4dfa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:27:02.10451Z",
  "ready_at": "2026-10-30T09:27:03.090718Z",
  "expires_at": "2026-10-31T09:27:03.090718Z"
}
```

`GET /api/admin/v1/reports/exports/3dca04d5-7341-4eb7-b6ee-1b8e1cac4dfa/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2b741ef1-05d0-4d2b-b0d8-9ace33250ee4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "a8e783b2-c8bf-4d91-a06c-c38306fca110",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:27:04.042457Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8e783b2-c8bf-4d91-a06c-c38306fca110` → **200**

```json
{
  "id": "a8e783b2-c8bf-4d91-a06c-c38306fca110",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:27:04.042457Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8e783b2-c8bf-4d91-a06c-c38306fca110` → **200**

```json
{
  "id": "a8e783b2-c8bf-4d91-a06c-c38306fca110",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:27:04.042457Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8e783b2-c8bf-4d91-a06c-c38306fca110` → **200**

```json
{
  "id": "a8e783b2-c8bf-4d91-a06c-c38306fca110",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:27:04.042457Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a8e783b2-c8bf-4d91-a06c-c38306fca110` → **200**

```json
{
  "id": "a8e783b2-c8bf-4d91-a06c-c38306fca110",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:27:04.042457Z",
  "ready_at": "2026-10-30T09:27:08.100178Z",
  "expires_at": "2026-10-31T09:27:08.100178Z"
}
```

`GET /api/admin/v1/reports/exports/a8e783b2-c8bf-4d91-a06c-c38306fca110/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/8d166974-589f-42da-b3f3-b863254361d1` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/8d166974-589f-42da-b3f3-b863254361d1",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9320436b-ba68-4964-ab32-a18c9d588dbf"
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
  "device_ref": "sandbox-32109"
}
```

```json
{
  "challenge_id": "98d57ef4-534f-4894-a508-f4c21b04ad5b",
  "expires_at": "2026-10-30T09:32:08.877395438Z",
  "resend_available_at": "2026-10-30T09:27:09.877395438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "709246",
  "sent_at": "2026-10-30T09:27:08.880206341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98d57ef4-534f-4894-a508-f4c21b04ad5b",
  "code": "709246",
  "device_ref": "sandbox-32109"
}
```

```json
{
  "session_id": "2c50387d-4590-4fb7-98de-3e60fdb48868",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzMyOSwiaWF0IjoxNzkzMzUyNDI5LCJqdGkiOiJiMDM3MWFiMS1hNTg3LTRmZjYtYTY4Yy1lNjg2OGIwNzU0ZTAiLCJzaWQiOiIyYzUwMzg3ZC00NTkwLTRmYjctOThkZS0zZTYwZmRiNDg4NjgifQ.PmBvmIpvIsrkTu2SftstFARFo-LCSQaWbsJS8v-aeIQ",
  "access_expires_at": "2026-10-30T09:42:09.208986482Z",
  "refresh_token": "rsp5xezJZZAkVx6UvQVu8Z3mDIlojYBLH0PoAGMyuT8",
  "refresh_expires_at": "2026-11-29T09:27:09.208472228Z",
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
  "command_id": "812a4821-b586-4d9b-9210-45edf6474dae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:27:10Z",
    "sequence": 1793352430100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "02aaecab-eca3-416d-ba58-487fb258cce9",
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
  "last_heartbeat_at": "2026-10-30T09:27:10.119979Z",
  "last_location_at": "2026-10-30T09:27:10.119979Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "416a91ce-66c4-4083-9d85-3202445e1393",
  "points": [
    {
      "sequence": 1793352432438,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:26:12Z"
    },
    {
      "sequence": 1793352432446,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:27:12Z"
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
  "session_id": "f55cb3ef-405d-46aa-b166-2f31bae19604",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMzMsImlhdCI6MTc5MzM1MjQzMywianRpIjoiOWYzNzYzZDItM2FlNC00NjViLWE4ZmUtNjNjNzliZWFkMTUwIiwic2lkIjoiZjU1Y2IzZWYtNDA1ZC00NmFhLWIxNjYtMmYzMWJhZTE5NjA0In0.E3SmU80NLrlVIyj_FGxG5RRDKHm-DCrLrvvm7Ifrk0M",
  "access_expires_at": "2026-10-30T09:42:13.087121791Z",
  "refresh_token": "jxin8ulymquEOaVgCg4hLFrFoNyK9v32ERivg923QN0",
  "refresh_expires_at": "2026-10-30T21:27:13.086543269Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "e4faacf4-a462-4852-aa96-6e6f167917e5",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T09:27:12Z",
        "track_point_id": "e2f56265-d17d-42a1-acaf-4af4b7ca287d",
        "work_session_id": "02aaecab-eca3-416d-ba58-487fb258cce9"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T09:27:12Z",
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

`POST /api/admin/v1/driver-risk-flags/e4faacf4-a462-4852-aa96-6e6f167917e5/confirm` → **200**

```json
{
  "command_id": "b9e691fd-782b-4eff-8d19-909295f5354d",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "e4faacf4-a462-4852-aa96-6e6f167917e5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T09:27:12Z",
    "track_point_id": "e2f56265-d17d-42a1-acaf-4af4b7ca287d",
    "work_session_id": "02aaecab-eca3-416d-ba58-487fb258cce9"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T09:27:12Z",
  "reason": null,
  "reviewed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reviewed_at": "2026-10-30T09:27:14.039175Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/e4faacf4-a462-4852-aa96-6e6f167917e5/dismiss` → **409**

```json
{
  "command_id": "866b23b9-4406-45c3-a6a5-7d06a7a70170",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/e4faacf4-a462-4852-aa96-6e6f167917e5/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1e97970f-7574-4e01-bb03-a9fc168f8a0a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "56cdc8df-4f68-43c5-a9f1-67e863e8de03",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "74acf2f6-ad42-42b2-8319-80c7b81802ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "raised_at": "2026-10-30T09:27:14.639478Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/74acf2f6-ad42-42b2-8319-80c7b81802ee/dismiss` → **200**

```json
{
  "command_id": "1d9d78e0-3d7f-4c88-ac13-8d942832a780",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "74acf2f6-ad42-42b2-8319-80c7b81802ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "raised_at": "2026-10-30T09:27:14.639478Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reviewed_at": "2026-10-30T09:27:14.94204Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "bc0686d5-94a4-4eeb-b8b7-76201409dbac",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "e4faacf4-a462-4852-aa96-6e6f167917e5"
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
      "actor_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:27:15.25846Z"
    }
  ],
  "duplicates": []
}
```

Done: flag e4faacf4-a462-4852-aa96-6e6f167917e5 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b8a224d8-8468-40dc-9a9f-5f73a8973fab",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMzYsImlhdCI6MTc5MzM1MjQzNiwianRpIjoiZjNmOTQ1MzAtMjkxOC00OWFhLTk5NTAtZTVjOTQ1NTVkNTFhIiwic2lkIjoiYjhhMjI0ZDgtODQ2OC00MGRjLTlhOWYtNWY3M2E4OTczZmFiIn0.dK7zNsBtObwYMjwsAUQgRix5qhhRX9Iflcd9AYpke-w",
  "access_expires_at": "2026-10-30T09:42:16.145588122Z",
  "refresh_token": "BoTaX_l92KSmWYZ1tlz2hTq5eM8bp9Q_ZQSaBtIKOXg",
  "refresh_expires_at": "2026-10-30T21:27:16.144993552Z",
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
      "actor_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:27:15.25846Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "2f47892b-8976-4b00-b017-4c7c4b218e77",
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
  "session_id": "02aaecab-eca3-416d-ba58-487fb258cce9",
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
  "last_heartbeat_at": "2026-10-30T09:27:10.119979Z",
  "last_location_at": "2026-10-30T09:27:10.119979Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02aaecab-eca3-416d-ba58-487fb258cce9/close` → **200**

```json
{
  "command_id": "cf538e8d-2e8c-4905-a403-ae0432f9c05d",
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
  "session_id": "fe08be6a-0563-4ba1-9c97-dbf4a9df0855",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzMzcsImlhdCI6MTc5MzM1MjQzNywianRpIjoiZjg2NjVkYmMtODNlOC00OTNiLTliM2EtNTkxNzhlNGJmMzg1Iiwic2lkIjoiZmUwOGJlNmEtMDU2My00YmExLTljOTctZGJmNGE5ZGYwODU1In0.tIPMV0kFBqqXh63OAUYHYIICq3g2YCfJxIWHPVuV4F4",
  "access_expires_at": "2026-10-30T09:42:17.978791001Z",
  "refresh_token": "kOJAlSMQbDQlQt7__KN-tnt4a1iOPgR3KwPJOFdKJF0",
  "refresh_expires_at": "2026-10-30T21:27:17.978251794Z",
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
  "command_id": "13c75f5d-29ce-4814-b6e0-92786e36bade",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:27:18.584575Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "13c75f5d-29ce-4814-b6e0-92786e36bade",
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
  "changed_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:27:18.584575Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48139036919",
  "device_ref": "sandbox-16444"
}
```

```json
{
  "challenge_id": "7c36dbb6-2e47-498b-a704-fc74080cb4fe",
  "expires_at": "2026-10-30T09:32:19.189259193Z",
  "resend_available_at": "2026-10-30T09:27:20.189259193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48139036919` → **200**

```json
{
  "phone": "+48139036919",
  "audience": "CLIENT",
  "code": "585681",
  "sent_at": "2026-10-30T09:27:19.192721637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c36dbb6-2e47-498b-a704-fc74080cb4fe",
  "code": "585681",
  "device_ref": "sandbox-16444"
}
```

```json
{
  "session_id": "40b27adf-831c-4515-b57f-b09a7633f115",
  "subject": {
    "type": "CLIENT",
    "id": "ad58a9d3-e52e-4cba-87a3-4503824282a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDU4YTlkMy1lNTJlLTRjYmEtODdhMy00NTAzODI0MjgyYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzM5LCJpYXQiOjE3OTMzNTI0MzksImp0aSI6IjFhNWFiZTAzLWQ2YzctNGU4Yi1iZjE2LTk5MTZhMzIyZjBiYyIsInNpZCI6IjQwYjI3YWRmLTgzMWMtNDUxNS1iNTdmLWIwOWE3NjMzZjExNSJ9.82XYi0xFIApxZe_jg7GBH3uOvzLXefc2R0UAOQBaHQI",
  "access_expires_at": "2026-10-30T09:42:19.51620194Z",
  "refresh_token": "Q0r-P4VYLj_Pz7kjy-q5K7EJI_8w0DPKX_ZaRQkY6_I",
  "refresh_expires_at": "2026-11-29T09:27:19.515673917Z",
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
  "correlation_id": "0fc6ff45-00d5-4616-87f0-5b81f327c003"
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
  "device_ref": "sandbox-27568"
}
```

```json
{
  "challenge_id": "c199d1b1-8d70-47b3-9920-b807659f3923",
  "expires_at": "2026-10-30T09:32:20.401720308Z",
  "resend_available_at": "2026-10-30T09:27:21.401720308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "693618",
  "sent_at": "2026-10-30T09:27:20.404499465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c199d1b1-8d70-47b3-9920-b807659f3923",
  "code": "693618",
  "device_ref": "sandbox-27568"
}
```

```json
{
  "session_id": "2b5598e2-19ea-4da1-972a-02df06121671",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzM0MCwiaWF0IjoxNzkzMzUyNDQwLCJqdGkiOiIzMmIyZmM5NC0xOTljLTQyYzMtOWY0Yy0xNDhmMzdiNzEyNGQiLCJzaWQiOiIyYjU1OThlMi0xOWVhLTRkYTEtOTcyYS0wMmRmMDYxMjE2NzEifQ.NnnXFZ_m7fKj1BXUpcJBM7Fi-HATQBihrV0goOBO94g",
  "access_expires_at": "2026-10-30T09:42:20.740355292Z",
  "refresh_token": "jXo3REcYbWgtuI3iqKub9uz-Z8I0_8NjbiqaZPtLBF8",
  "refresh_expires_at": "2026-11-29T09:27:20.739485194Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e4b5ded0-ecfa-4b86-8603-92d8ee9a6387",
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
  "last_heartbeat_at": "2026-10-30T09:26:50.847359Z",
  "last_location_at": "2026-10-30T09:26:50.847359Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e4b5ded0-ecfa-4b86-8603-92d8ee9a6387/handover` → **200**

```json
{
  "command_id": "76881383-1fda-4d0e-8849-a5eef48eadb0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e4b5ded0-ecfa-4b86-8603-92d8ee9a6387",
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
  "last_heartbeat_at": "2026-10-30T09:26:50.847359Z",
  "last_location_at": "2026-10-30T09:26:50.847359Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e4b5ded0-ecfa-4b86-8603-92d8ee9a6387/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:27:21Z",
    "sequence": 1793352441646
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e4b5ded0-ecfa-4b86-8603-92d8ee9a6387",
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
  "last_heartbeat_at": "2026-10-30T09:27:21.665774Z",
  "last_location_at": "2026-10-30T09:27:21.665774Z",
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
  "session_id": "e4b5ded0-ecfa-4b86-8603-92d8ee9a6387",
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
  "last_heartbeat_at": "2026-10-30T09:27:21.665774Z",
  "last_location_at": "2026-10-30T09:27:21.665774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e4b5ded0-ecfa-4b86-8603-92d8ee9a6387/close` → **200**

```json
{
  "command_id": "d6553a76-d857-49f2-8265-819e91daafac",
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
  "correlation_id": "643bfc99-21e5-4079-80f5-69b3016b81b2"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674649900",
  "device_ref": "sandbox-19759"
}
```

```json
{
  "challenge_id": "87855303-d6c5-4f4e-9015-f2f1eb5364da",
  "expires_at": "2026-10-30T09:32:23.209712342Z",
  "resend_available_at": "2026-10-30T09:27:24.209712342Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674649900` → **200**

```json
{
  "phone": "+380674649900",
  "audience": "CLIENT",
  "code": "424475",
  "sent_at": "2026-10-30T09:27:23.212295097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87855303-d6c5-4f4e-9015-f2f1eb5364da",
  "code": "424475",
  "device_ref": "sandbox-19759"
}
```

```json
{
  "session_id": "e8a10bf3-f76c-498b-a611-de4a5fdf3876",
  "subject": {
    "type": "CLIENT",
    "id": "e64c4102-ee38-4084-a048-4b6174b56bcd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjRjNDEwMi1lZTM4LTQwODQtYTA0OC00YjYxNzRiNTZiY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzQzLCJpYXQiOjE3OTMzNTI0NDMsImp0aSI6Ijg4N2YyN2ZmLTgwY2UtNGVhZi04OWZhLWFkMTcyMzVhOTAwMiIsInNpZCI6ImU4YTEwYmYzLWY3NmMtNDk4Yi1hNjExLWRlNGE1ZmRmMzg3NiJ9.GmlSmr-0u-WndeV6P6trOA6tE6iAi_JgGEVL0hQtO40",
  "access_expires_at": "2026-10-30T09:42:23.533292004Z",
  "refresh_token": "N0ndVOzbKbn6uqm21zMf54k3ULaEAPGlMS-y44u0Lbc",
  "refresh_expires_at": "2026-11-29T09:27:23.532705818Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "fb97966d-90b0-40bd-97d6-0ac3abe13068",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "deeb6a66-a619-4f1f-8c03-1afb5c553024",
  "upload_path": "/api/rider/v1/uploads/deeb6a66-a619-4f1f-8c03-1afb5c553024",
  "expires_at": "2026-10-30T09:42:23.835718579Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/deeb6a66-a619-4f1f-8c03-1afb5c553024` → **200**

```json
{
  "file_id": "deeb6a66-a619-4f1f-8c03-1afb5c553024",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "e3f54afa-64bf-4e00-9479-2b81d78a5514",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "deeb6a66-a619-4f1f-8c03-1afb5c553024"
  ]
}
```

```json
{
  "id": "98aee99c-e4a0-49ed-91a6-beed1cc90a45",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:27:24.176864Z",
  "updated_at": "2026-10-30T09:27:24.176864Z",
  "respond_by": "2026-10-30T13:27:24.176864Z",
  "messages": [
    {
      "id": "b7420e7b-e4ce-4d9d-a8c8-d86ba554c829",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:27:24.178091Z",
      "attachments": [
        {
          "file_id": "deeb6a66-a619-4f1f-8c03-1afb5c553024",
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
  "session_id": "4dcfb855-1ed0-4355-b717-a01dce6a75c4",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzNDQsImlhdCI6MTc5MzM1MjQ0NCwianRpIjoiODBhMTM3ZTYtNmFmNS00MzhlLTg3YWQtYWQ3NjY2N2I3NGJhIiwic2lkIjoiNGRjZmI4NTUtMWVkMC00MzU1LWI3MTctYTAxZGNlNmE3NWM0In0.U5w9OBmlboakWf7LjM1wUQnNDNiFTjlkARu0GbXOPeU",
  "access_expires_at": "2026-10-30T09:42:24.794397844Z",
  "refresh_token": "wbF87TDrE6p2Wvn4mVuaqozrinw1cqSxvxKFACwmiZo",
  "refresh_expires_at": "2026-10-30T21:27:24.793767215Z",
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
  "session_id": "0049e654-251f-4ccb-bed4-b10ca27d83be",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzNDUsImlhdCI6MTc5MzM1MjQ0NSwianRpIjoiZjlhYjNmNzktMDRiMC00NTIzLTg4YmUtNzRiM2JjYzc0MTNmIiwic2lkIjoiMDA0OWU2NTQtMjUxZi00Y2NiLWJlZDQtYjEwY2EyN2Q4M2JlIn0.F36kkoZ7WGw6iUzX4081Qrk2ZsC3MGjJXSFpb1AtIOk",
  "access_expires_at": "2026-10-30T09:42:25.373553581Z",
  "refresh_token": "-me0DzmNVfVJNxp7l2XbkJUFurLHyrGCOxqWPOJuKsg",
  "refresh_expires_at": "2026-10-30T21:27:25.372918373Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/98aee99c-e4a0-49ed-91a6-beed1cc90a45/attachments/deeb6a66-a619-4f1f-8c03-1afb5c553024` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "41ca53c0-3f7d-41b3-9d73-71a3f5b59997",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5c1b7399-18e3-44f6-b0be-b093562e9a63",
  "upload_path": "/api/operator/v1/uploads/5c1b7399-18e3-44f6-b0be-b093562e9a63",
  "expires_at": "2026-10-30T09:42:25.693378444Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5c1b7399-18e3-44f6-b0be-b093562e9a63` → **200**

```json
{
  "file_id": "5c1b7399-18e3-44f6-b0be-b093562e9a63",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/98aee99c-e4a0-49ed-91a6-beed1cc90a45` → **200**

```json
{
  "id": "98aee99c-e4a0-49ed-91a6-beed1cc90a45",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:27:24.176864Z",
  "updated_at": "2026-10-30T09:27:24.176864Z",
  "respond_by": "2026-10-30T13:27:24.176864Z",
  "messages": [
    {
      "id": "b7420e7b-e4ce-4d9d-a8c8-d86ba554c829",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:27:24.178091Z",
      "attachments": [
        {
          "file_id": "deeb6a66-a619-4f1f-8c03-1afb5c553024",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/98aee99c-e4a0-49ed-91a6-beed1cc90a45/comments` → **200**

```json
{
  "command_id": "c94acc47-da53-482b-bb5f-6bd1044e0817",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5c1b7399-18e3-44f6-b0be-b093562e9a63"
  ]
}
```

```json
{
  "id": "98aee99c-e4a0-49ed-91a6-beed1cc90a45",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:27:24.176864Z",
  "updated_at": "2026-10-30T09:27:26.332495Z",
  "respond_by": "2026-10-30T13:27:24.176864Z",
  "messages": [
    {
      "id": "b7420e7b-e4ce-4d9d-a8c8-d86ba554c829",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:27:24.178091Z",
      "attachments": [
        {
          "file_id": "deeb6a66-a619-4f1f-8c03-1afb5c553024",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6421a2cb-e61d-49cb-91eb-7666fd52ee46",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:27:26.332014Z",
      "attachments": [
        {
          "file_id": "5c1b7399-18e3-44f6-b0be-b093562e9a63",
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

`GET /api/rider/v1/support/cases/98aee99c-e4a0-49ed-91a6-beed1cc90a45` → **200**

```json
{
  "id": "98aee99c-e4a0-49ed-91a6-beed1cc90a45",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:27:24.176864Z",
  "updated_at": "2026-10-30T09:27:26.332495Z",
  "respond_by": "2026-10-30T13:27:24.176864Z",
  "messages": [
    {
      "id": "b7420e7b-e4ce-4d9d-a8c8-d86ba554c829",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e64c4102-ee38-4084-a048-4b6174b56bcd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:27:24.178091Z",
      "attachments": [
        {
          "file_id": "deeb6a66-a619-4f1f-8c03-1afb5c553024",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6421a2cb-e61d-49cb-91eb-7666fd52ee46",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:27:26.332014Z",
      "attachments": [
        {
          "file_id": "5c1b7399-18e3-44f6-b0be-b093562e9a63",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/98aee99c-e4a0-49ed-91a6-beed1cc90a45/attachments/5c1b7399-18e3-44f6-b0be-b093562e9a63` → **200**

Done: support case 98aee99c-e4a0-49ed-91a6-beed1cc90a45, rider attachment deeb6a66-a619-4f1f-8c03-1afb5c553024, operator attachment 5c1b7399-18e3-44f6-b0be-b093562e9a63.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737932662",
  "device_ref": "sandbox-2033"
}
```

```json
{
  "challenge_id": "caa2dc4d-0291-4bfd-a293-7f0b4d0300ff",
  "expires_at": "2026-10-30T09:32:26.965835586Z",
  "resend_available_at": "2026-10-30T09:27:27.965835586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737932662` → **200**

```json
{
  "phone": "+380737932662",
  "audience": "CLIENT",
  "code": "797460",
  "sent_at": "2026-10-30T09:27:26.970005719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "caa2dc4d-0291-4bfd-a293-7f0b4d0300ff",
  "code": "797460",
  "device_ref": "sandbox-2033"
}
```

```json
{
  "session_id": "0b6d0745-50cf-4a2f-a2f7-83a18455f82f",
  "subject": {
    "type": "CLIENT",
    "id": "46a734e2-4758-4715-8399-68aaa12b3286"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NmE3MzRlMi00NzU4LTQ3MTUtODM5OS02OGFhYTEyYjMyODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzQ3LCJpYXQiOjE3OTMzNTI0NDcsImp0aSI6ImNhZjU1NTcwLTYyYTAtNGI5Zi1hNTcyLTg3YzNjZWQ2MjQxOSIsInNpZCI6IjBiNmQwNzQ1LTUwY2YtNGEyZi1hMmY3LTgzYTE4NDU1ZjgyZiJ9.E8cGjxePI0VyKT_yaxXX3ERAiik9ojisAoy7tLPaaHI",
  "access_expires_at": "2026-10-30T09:42:27.299738967Z",
  "refresh_token": "5AAD2tNGwg9x5LzTCzCxad5VB_6GOtjb0baHOrt9vHo",
  "refresh_expires_at": "2026-11-29T09:27:27.299217725Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e1386048-f6f5-4f14-8a8f-376cdc484fae",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "40f18c35-b4ed-4c39-abc8-5294723ab273",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-40f18c35-b4ed-4c39-abc8-5294723ab273",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e175186e2ab1530ac71eb373ea22fda3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=40f18c35-b4ed-4c39-abc8-5294723ab273",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737932662"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=40f18c35-b4ed-4c39-abc8-5294723ab273",
  "expires_at": "2026-10-30T09:57:27.584357Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/40f18c35-b4ed-4c39-abc8-5294723ab273` → **200**

```json
{
  "id": "40f18c35-b4ed-4c39-abc8-5294723ab273",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:57:27.584357Z",
  "card": {
    "id": "2ecf6345-5308-4403-a910-862c88c6bf12",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6508",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:27:27.876664Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db292dc9-dc51-48ca-a6cd-bc7af11f2f85",
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
  "id": "206ef5ac-5932-424f-bb5e-436543ba722c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:32:28.195307Z",
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
  "command_id": "71a60516-d705-4eb2-874f-eb7a1b7b2861",
  "quote_id": "206ef5ac-5932-424f-bb5e-436543ba722c",
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
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c` → **200**

```json
{
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c` → **200**

```json
{
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
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

`GET /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c` → **200**

```json
{
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c/switch-to-cash` → **200**

```json
{
  "command_id": "66d69ed0-609b-4d60-9976-ed3cf58dbb71",
  "expected_version": 3
}
```

```json
{
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c/switch-to-cash` → **409**

```json
{
  "command_id": "41fc93f5-870b-4d84-a3c4-b71b2dc0a44b",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "95acaa9e-dc88-4cc3-b822-343fc88d6100"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c` → **200**

```json
{
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36ec1f3d-c754-46cf-a261-89d0e07fd48c/cancel` → **200**

```json
{
  "command_id": "097d728e-79c7-48d1-91ff-d210898789dc",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "36ec1f3d-c754-46cf-a261-89d0e07fd48c",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "46a734e2-4758-4715-8399-68aaa12b3286",
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
  "created_at": "2026-10-30T09:27:28.508072Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "session_id": "ef2924dd-d542-44ff-8557-64931a47546e",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzNTIsImlhdCI6MTc5MzM1MjQ1MiwianRpIjoiOWMzOWYwM2QtYWYxMi00ZDQ2LTgyMmQtYzRmNzRlNGEwMGJiIiwic2lkIjoiZWYyOTI0ZGQtZDU0Mi00NGZmLTg1NTctNjQ5MzFhNDc1NDZlIn0.a0Kr4OR6iE3tYySGtB94QpbMQSC1E1LW-j-Tt1DQoQc",
  "access_expires_at": "2026-10-30T09:42:32.299877841Z",
  "refresh_token": "5OkM63IjG_roDONc83wW2GvghXkhc5smAmsebeagYKA",
  "refresh_expires_at": "2026-10-30T21:27:32.299307444Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22905"
}
```

```json
{
  "challenge_id": "e46e9ebf-51f2-4697-b416-245b444d16a1",
  "expires_at": "2026-10-30T09:32:32.581640635Z",
  "resend_available_at": "2026-10-30T09:27:33.581640635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "973381",
  "sent_at": "2026-10-30T09:27:32.586051787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e46e9ebf-51f2-4697-b416-245b444d16a1",
  "code": "973381",
  "device_ref": "sandbox-22905"
}
```

```json
{
  "session_id": "61350edc-3d40-4e70-b70d-860e1c8c63b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzM1MiwiaWF0IjoxNzkzMzUyNDUyLCJqdGkiOiI2ZmIzZGFlZC1mZGVjLTRlNjUtYTQ3Ni0wZWY2MTdlMWEyZTEiLCJzaWQiOiI2MTM1MGVkYy0zZDQwLTRlNzAtYjcwZC04NjBlMWM4YzYzYjMifQ.V-uFIp4ZgJY9L4Xs_As8XTLja_-QMQsSmL-lgQifmUY",
  "access_expires_at": "2026-10-30T09:42:32.907591458Z",
  "refresh_token": "xpMhNvgwk5QGFJI2-fG3OipdMuxH3P3VpIy9uUsT-eE",
  "refresh_expires_at": "2026-11-29T09:27:32.907025451Z",
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
      "actor_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:27:15.25846Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T09:27:16.74377Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "65e4865a-914e-488a-a41c-01ba421924c0",
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
  "device_ref": "sandbox-15359"
}
```

```json
{
  "challenge_id": "c961c236-8075-4076-9926-dcb09b3bc09b",
  "expires_at": "2026-10-30T09:32:34.079929089Z",
  "resend_available_at": "2026-10-30T09:27:35.079929089Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "083231",
  "sent_at": "2026-10-30T09:27:34.082661042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c961c236-8075-4076-9926-dcb09b3bc09b",
  "code": "083231",
  "device_ref": "sandbox-15359"
}
```

```json
{
  "session_id": "7f2c7c7d-5a9b-41f7-bdfb-b1ceba5f8df0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzM1NCwiaWF0IjoxNzkzMzUyNDU0LCJqdGkiOiI1M2EyYzRjMi1iODAyLTRjMmMtODMwNi0xNGY3MGQ1NDFmNGMiLCJzaWQiOiI3ZjJjN2M3ZC01YTliLTQxZjctYmRmYi1iMWNlYmE1ZjhkZjAifQ.nADe08ZpDioglLrvMarkNjFydtKulQarOlh7qLnjeKQ",
  "access_expires_at": "2026-10-30T09:42:34.404137893Z",
  "refresh_token": "1579U5xBvozNkw_s4pJjvv9uyCnrTUtlVerZtGeewoU",
  "refresh_expires_at": "2026-11-29T09:27:34.403608816Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:26:58.512039Z",
  "last_location_at": "2026-10-30T09:26:58.512039Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8/handover` → **200**

```json
{
  "command_id": "597ad616-937a-4a92-a2d3-dc04249b0030",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:26:58.512039Z",
  "last_location_at": "2026-10-30T09:26:58.512039Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:27:35Z",
    "sequence": 1793352455274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:27:35.292337Z",
  "last_location_at": "2026-10-30T09:27:35.292337Z",
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
  "command_id": "694432ce-9022-45ca-b450-af13b695f013",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:27:35Z",
    "sequence": 1793352455872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc35b022-34e9-4d77-9d31-401143f06960",
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
  "last_heartbeat_at": "2026-10-30T09:27:35.891198Z",
  "last_location_at": "2026-10-30T09:27:35.891198Z",
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
  "session_id": "d04ff65b-d307-4c65-b9ff-b4c535b2bb4a",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTMzNTYsImlhdCI6MTc5MzM1MjQ1NiwianRpIjoiZDIzOWM3NjYtZWFhMy00MGEyLWI0ZTktNjk0YzRjMTZkNmFlIiwic2lkIjoiZDA0ZmY2NWItZDMwNy00YzY1LWI5ZmYtYjRjNTM1YjJiYjRhIn0.Y1balP5J9xmedvxepWhoZLO520peIPeo-VScN07bFpU",
  "access_expires_at": "2026-10-30T09:42:36.484337645Z",
  "refresh_token": "cWW2ix392iZZNowCFPQ8PWSb7JRdm_SJbsCI3v8YD_Q",
  "refresh_expires_at": "2026-10-30T21:27:36.483775116Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ed697534-c263-4c0b-8385-5bef83ca3d27",
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
  "id": "9f4e8be8-9d02-43ad-9709-90e9a1a06ccc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:32:36.776823Z",
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
  "command_id": "a4d7108a-38bc-4dd1-bab3-c6fdcd2a51d8",
  "quote_id": "9f4e8be8-9d02-43ad-9709-90e9a1a06ccc",
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
  "id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
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
  "created_at": "2026-10-30T09:27:37.079413Z",
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
    "id": "1e46b33b-f124-429d-953f-4a8f03ad713c",
    "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
    "expires_at": "2026-10-30T09:27:52.083308Z",
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

`POST /api/driver/v1/offers/1e46b33b-f124-429d-953f-4a8f03ad713c/accept` → **200**

```json
{
  "command_id": "6021c7f9-c795-4428-8a5d-d6c98b1436d2"
}
```

```json
{
  "id": "4198fc24-4a91-4d6e-a296-12188ee499c3",
  "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4249aca7-506c-4f8e-aef4-f76bb3fd78b7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4249aca7-506c-4f8e-aef4-f76bb3fd78b7",
  "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
  "assignment_id": "4198fc24-4a91-4d6e-a296-12188ee499c3",
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

`POST /api/driver/v1/work-sessions/bc35b022-34e9-4d77-9d31-401143f06960/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:27:38Z",
    "sequence": 1793352458572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc35b022-34e9-4d77-9d31-401143f06960",
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
  "last_heartbeat_at": "2026-10-30T09:27:38.593078Z",
  "last_location_at": "2026-10-30T09:27:38.593078Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4249aca7-506c-4f8e-aef4-f76bb3fd78b7/arrive` → **200**

```json
{
  "command_id": "b51ce715-28d9-49c4-a724-8ba06df81ece",
  "expected_version": 0
}
```

```json
{
  "id": "4249aca7-506c-4f8e-aef4-f76bb3fd78b7",
  "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
  "assignment_id": "4198fc24-4a91-4d6e-a296-12188ee499c3",
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
  "arrived_at": "2026-10-30T09:27:38.910277Z",
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

`POST /api/driver/v1/trips/4249aca7-506c-4f8e-aef4-f76bb3fd78b7/start` → **200**

```json
{
  "command_id": "99ce769a-81ab-42c5-9c19-3f70ad0da0a8",
  "expected_version": 1
}
```

```json
{
  "id": "4249aca7-506c-4f8e-aef4-f76bb3fd78b7",
  "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
  "assignment_id": "4198fc24-4a91-4d6e-a296-12188ee499c3",
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
  "arrived_at": "2026-10-30T09:27:38.910277Z",
  "started_at": "2026-10-30T09:27:39.216796Z",
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

`POST /api/driver/v1/trips/4249aca7-506c-4f8e-aef4-f76bb3fd78b7/complete` → **200**

```json
{
  "command_id": "2b92dc64-d21e-4d08-a261-c78c9c259b0d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:27:39Z",
  "cash_received": true
}
```

```json
{
  "id": "4249aca7-506c-4f8e-aef4-f76bb3fd78b7",
  "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
  "assignment_id": "4198fc24-4a91-4d6e-a296-12188ee499c3",
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
  "arrived_at": "2026-10-30T09:27:38.910277Z",
  "started_at": "2026-10-30T09:27:39.216796Z",
  "completed_at": "2026-10-30T09:27:39.519635Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/82cbef4a-453d-43f2-9fab-1a1b35d65790` → **200**

```json
{
  "id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
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
    "id": "4198fc24-4a91-4d6e-a296-12188ee499c3",
    "order_id": "82cbef4a-453d-43f2-9fab-1a1b35d65790",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4249aca7-506c-4f8e-aef4-f76bb3fd78b7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:27:37.079413Z",
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
  "session_id": "cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8",
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
  "last_heartbeat_at": "2026-10-30T09:27:35.292337Z",
  "last_location_at": "2026-10-30T09:27:35.292337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cffc8f4b-91b1-4d2f-b967-8a5ae5062ec8/close` → **200**

```json
{
  "command_id": "1823ece5-302e-4d28-8034-680cd1d14fa4",
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
  "session_id": "bc35b022-34e9-4d77-9d31-401143f06960",
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
  "last_heartbeat_at": "2026-10-30T09:27:38.593078Z",
  "last_location_at": "2026-10-30T09:27:38.593078Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc35b022-34e9-4d77-9d31-401143f06960/close` → **200**

```json
{
  "command_id": "3e361240-2659-4777-8b26-c290c3f5b618",
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

Done: terminal order 82cbef4a-453d-43f2-9fab-1a1b35d65790 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-719"
}
```

```json
{
  "challenge_id": "062ca8f7-266a-4989-b9e1-815c61f575dd",
  "expires_at": "2026-10-30T09:32:44.627063414Z",
  "resend_available_at": "2026-10-30T09:27:45.627063414Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "279708",
  "sent_at": "2026-10-30T09:27:44.629911963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "062ca8f7-266a-4989-b9e1-815c61f575dd",
  "code": "279708",
  "device_ref": "sandbox-719"
}
```

```json
{
  "session_id": "e4bf34db-d5b0-49c3-9bea-4d0905b92650",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzM2NCwiaWF0IjoxNzkzMzUyNDY0LCJqdGkiOiI5YjdjOWM5Yi1iNTVlLTRjZjEtYmRkYi0yNDk5ZmE3NzI3NDQiLCJzaWQiOiJlNGJmMzRkYi1kNWIwLTQ5YzMtOWJlYS00ZDA5MDViOTI2NTAifQ.YOEGuO74OYJHpmV91JUIzDytWgiye5xC8hoXrn0OYto",
  "access_expires_at": "2026-10-30T09:42:44.95009946Z",
  "refresh_token": "GJUs5aZuM5Y9VKQSWn_F8MVXcv4YDEagpHDbmn0TqO8",
  "refresh_expires_at": "2026-11-29T09:27:44.949588183Z",
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
  "device_ref": "sandbox-10986"
}
```

```json
{
  "challenge_id": "5230c2eb-6b07-42a8-a937-47d2bc2bbc35",
  "expires_at": "2026-10-30T09:32:45.522409381Z",
  "resend_available_at": "2026-10-30T09:27:46.522409381Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "445496",
  "sent_at": "2026-10-30T09:27:45.525287976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5230c2eb-6b07-42a8-a937-47d2bc2bbc35",
  "code": "445496",
  "device_ref": "sandbox-10986"
}
```

```json
{
  "session_id": "729db9ff-b488-4c82-a373-abd2b225af27",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzM2NSwiaWF0IjoxNzkzMzUyNDY1LCJqdGkiOiJhMzk5NTViOC1lM2Y1LTQxMGQtOTNjOC1kMzcxYTNhYWUxYjkiLCJzaWQiOiI3MjlkYjlmZi1iNDg4LTRjODItYTM3My1hYmQyYjIyNWFmMjcifQ.ENz3AYfjOk9IQX00euGC8vvSTPegWCf4eLvbrXSj_to",
  "access_expires_at": "2026-10-30T09:42:45.84455852Z",
  "refresh_token": "pTeRNGZFg7Os9Uy42mcRvqgGC2YRN9PtKC8c0ML2cfA",
  "refresh_expires_at": "2026-11-29T09:27:45.843983501Z",
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
  "device_ref": "sandbox-26843"
}
```

```json
{
  "challenge_id": "da235c5b-0939-4df4-ab70-ff905d4129a7",
  "expires_at": "2026-10-30T09:32:46.408105343Z",
  "resend_available_at": "2026-10-30T09:27:47.408105343Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "012484",
  "sent_at": "2026-10-30T09:27:46.411933231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da235c5b-0939-4df4-ab70-ff905d4129a7",
  "code": "012484",
  "device_ref": "sandbox-26843"
}
```

```json
{
  "session_id": "f7e5d2e1-196a-43ea-95f4-3bc57f53eac3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MzM2NiwiaWF0IjoxNzkzMzUyNDY2LCJqdGkiOiJhZTEyMWFjOS04ODI4LTRiNGMtOTk2Ny1hMGMwYzMyMDg3MmUiLCJzaWQiOiJmN2U1ZDJlMS0xOTZhLTQzZWEtOTVmNC0zYmM1N2Y1M2VhYzMifQ.F5wmiWNW66QKCBcJkceG3xDvUGasK-I8H3XgL14oSOE",
  "access_expires_at": "2026-10-30T09:42:46.728289244Z",
  "refresh_token": "etMH3llZZTt0SDu9EPBxS8PpH-jl0FldGZLkXIAXp9E",
  "refresh_expires_at": "2026-11-29T09:27:46.72778507Z",
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
  "phone": "+380698508972",
  "device_ref": "sandbox-15903"
}
```

```json
{
  "challenge_id": "e755e70e-0ee9-405a-bffc-8264ad24cb59",
  "expires_at": "2026-10-30T09:32:47.303913108Z",
  "resend_available_at": "2026-10-30T09:27:48.303913108Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380698508972` → **200**

```json
{
  "phone": "+380698508972",
  "audience": "CLIENT",
  "code": "864732",
  "sent_at": "2026-10-30T09:27:47.306907344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e755e70e-0ee9-405a-bffc-8264ad24cb59",
  "code": "864732",
  "device_ref": "sandbox-15903"
}
```

```json
{
  "session_id": "269bf2ea-7af4-4e66-9a99-08b2a0346285",
  "subject": {
    "type": "CLIENT",
    "id": "71db76da-9d74-462d-9f0a-2a8ef364de91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWRiNzZkYS05ZDc0LTQ2MmQtOWYwYS0yYThlZjM2NGRlOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUzMzY3LCJpYXQiOjE3OTMzNTI0NjcsImp0aSI6IjFmZmViZDNmLWQ1M2ItNDhkYy1iMTc5LWIzZjhiNDg5MTFjZiIsInNpZCI6IjI2OWJmMmVhLTdhZjQtNGU2Ni05YTk5LTA4YjJhMDM0NjI4NSJ9.DTqu3fuS3pRAIkljj9eVjWAs2oesdwuAUGeLgy8eaVI",
  "access_expires_at": "2026-10-30T09:42:47.637001803Z",
  "refresh_token": "ldSz8z4QiBHJJKtQTn07RStDABRjZ4o1vnGRe9fUe58",
  "refresh_expires_at": "2026-11-29T09:27:47.636464518Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9971afbb-4e62-4dd9-a373-13aa19a134cd",
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
  "id": "8aa71d9d-b5ac-4b4d-a322-31db6767636b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:32:47.937005Z",
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
  "command_id": "4ced3c18-0f4c-432a-a76c-7d6ba6abdbf9",
  "quote_id": "8aa71d9d-b5ac-4b4d-a322-31db6767636b",
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
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:27:48.25759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:27:48.25759Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.37110874
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.178987566
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

`GET /api/rider/v1/orders/c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e` → **200**

```json
{
  "id": "c49a5f0c-97c5-4657-8533-0c2fe4c8ba4e",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "71db76da-9d74-462d-9f0a-2a8ef364de91",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:27:48.25759Z",
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
  "session_id": "422c4fcb-5c90-4e17-9043-feaa2ea02229",
  "subject": {
    "type": "STAFF",
    "id": "42bf38ce-c790-4895-aa62-2de6f12aba20"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmJmMzhjZS1jNzkwLTQ4OTUtYWE2Mi0yZGU2ZjEyYWJhMjAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTM1NTAsImlhdCI6MTc5MzM1MjY1MCwianRpIjoiYzk1ZDFhM2EtMzZiMy00MjhkLThiNDgtZjI5Yzk1Nzc2NzI4Iiwic2lkIjoiNDIyYzRmY2ItNWM5MC00ZTE3LTkwNDMtZmVhYTJlYTAyMjI5In0.DtG9bsY9dzF0WrDa5bwt7SYvn8uo2VT5_WGJCk1DUsM",
  "access_expires_at": "2026-10-30T09:45:50.493308104Z",
  "refresh_token": "C9pwV9RtkRdZXLn8FWUC38lC5IFOaK3j1QZq0T4roJc",
  "refresh_expires_at": "2026-10-30T21:30:50.492754338Z",
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
  "id": "4fc1c3d8-b31d-45c0-9a1b-c709bdaaf763",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:50.808482Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:50.808537Z",
  "updated_at": "2026-10-30T09:30:50.825984Z",
  "finished_at": "2026-10-30T09:30:50.825984Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/4fc1c3d8-b31d-45c0-9a1b-c709bdaaf763` → **200**

```json
{
  "run": {
    "id": "4fc1c3d8-b31d-45c0-9a1b-c709bdaaf763",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:30:50.808482Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:30:50.808537Z",
    "updated_at": "2026-10-30T09:30:50.825984Z",
    "finished_at": "2026-10-30T09:30:50.825984Z",
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
  "id": "4fc1c3d8-b31d-45c0-9a1b-c709bdaaf763",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:50.808482Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:50.808537Z",
  "updated_at": "2026-10-30T09:30:50.825984Z",
  "finished_at": "2026-10-30T09:30:50.825984Z",
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
  "id": "4fc1c3d8-b31d-45c0-9a1b-c709bdaaf763",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:50.808482Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:50.808537Z",
  "updated_at": "2026-10-30T09:30:50.825984Z",
  "finished_at": "2026-10-30T09:30:50.825984Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5ad301c9-e98d-4aac-9821-a93e303355ed` → **204**

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
  "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:51.30296Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:51.302993Z",
  "updated_at": "2026-10-30T09:30:51.310936Z",
  "finished_at": "2026-10-30T09:30:51.310936Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/884f0f7e-c54d-4c78-8e02-4becbfcaab9f` → **200**

```json
{
  "run": {
    "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:30:51.30296Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:30:51.302993Z",
    "updated_at": "2026-10-30T09:30:51.310936Z",
    "finished_at": "2026-10-30T09:30:51.310936Z",
    "version": 1
  },
  "items": [
    {
      "id": "5b825669-668f-4304-8e41-133d38f43cc5",
      "run_id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6851ac219ba5d592d2ca61ea60e9b880060c21ffd97668643259ad8c6be00945",
      "reference_display": "sandbox-reconciliation-5ad301c9-e98d-4aac-9821-a93e#####ed",
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
      "provider_at": "2026-10-30T09:30:51Z",
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
  "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:51.30296Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:51.302993Z",
  "updated_at": "2026-10-30T09:30:51.310936Z",
  "finished_at": "2026-10-30T09:30:51.310936Z",
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
  "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:51.30296Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:51.302993Z",
  "updated_at": "2026-10-30T09:30:51.310936Z",
  "finished_at": "2026-10-30T09:30:51.310936Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/5b825669-668f-4304-8e41-133d38f43cc5/resolve` → **200**

```json
{
  "command_id": "1195bf80-badb-477d-9634-e0a55d475d7c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "5b825669-668f-4304-8e41-133d38f43cc5",
  "run_id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6851ac219ba5d592d2ca61ea60e9b880060c21ffd97668643259ad8c6be00945",
  "reference_display": "sandbox-reconciliation-5ad301c9-e98d-4aac-9821-a93e#####ed",
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
  "provider_at": "2026-10-30T09:30:51Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "resolved_at": "2026-10-30T09:30:51.758195Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/5b825669-668f-4304-8e41-133d38f43cc5/resolve` → **200**

```json
{
  "command_id": "1195bf80-badb-477d-9634-e0a55d475d7c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "5b825669-668f-4304-8e41-133d38f43cc5",
  "run_id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6851ac219ba5d592d2ca61ea60e9b880060c21ffd97668643259ad8c6be00945",
  "reference_display": "sandbox-reconciliation-5ad301c9-e98d-4aac-9821-a93e#####ed",
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
  "provider_at": "2026-10-30T09:30:51Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
  "resolved_at": "2026-10-30T09:30:51.758195Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/5b825669-668f-4304-8e41-133d38f43cc5/resolve` → **409**

```json
{
  "command_id": "4482bd67-f167-4186-ac83-4ec8e6b097fe",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/5b825669-668f-4304-8e41-133d38f43cc5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "07218b2a-4a5d-4038-92e7-dccbf0c0e013"
}
```

`GET /api/admin/v1/payment-reconciliations/884f0f7e-c54d-4c78-8e02-4becbfcaab9f` → **200**

```json
{
  "run": {
    "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:30:51.30296Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:30:51.302993Z",
    "updated_at": "2026-10-30T09:30:51.758195Z",
    "finished_at": "2026-10-30T09:30:51.310936Z",
    "version": 2
  },
  "items": [
    {
      "id": "5b825669-668f-4304-8e41-133d38f43cc5",
      "run_id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6851ac219ba5d592d2ca61ea60e9b880060c21ffd97668643259ad8c6be00945",
      "reference_display": "sandbox-reconciliation-5ad301c9-e98d-4aac-9821-a93e#####ed",
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
      "provider_at": "2026-10-30T09:30:51Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "42bf38ce-c790-4895-aa62-2de6f12aba20",
      "resolved_at": "2026-10-30T09:30:51.758195Z",
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
      "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T09:30:51.30296Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:30:51.302993Z",
      "updated_at": "2026-10-30T09:30:51.758195Z",
      "finished_at": "2026-10-30T09:30:51.310936Z",
      "version": 2
    },
    {
      "id": "10df8c9a-dfa2-4868-ad19-3aa6600ba1ed",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T09:22:47.969759Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:22:47.969893Z",
      "updated_at": "2026-10-30T09:22:47.976398Z",
      "finished_at": "2026-10-30T09:22:47.976398Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/5ad301c9-e98d-4aac-9821-a93e303355ed` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "884f0f7e-c54d-4c78-8e02-4becbfcaab9f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:30:51.30296Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:30:51.302993Z",
  "updated_at": "2026-10-30T09:30:51.758195Z",
  "finished_at": "2026-10-30T09:30:51.310936Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793352778169E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793352778468E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793352778469E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793352778211E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793352778469E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
