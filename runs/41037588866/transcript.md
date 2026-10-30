# Sandbox transcript (2026-10-30T10:01:51Z, 74f4e2e)

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
  "correlation_id": "ff7781be-79bd-4310-b18b-0b0474d20d57"
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
  "session_id": "6abe6b84-05f7-484e-81cf-db522be73da3",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0MjEsImlhdCI6MTc5MzM1NDUyMSwianRpIjoiMWNjMDQ0OWUtZGZhMC00NDIyLTg4ZjItYzhiOGZhYzBlZTQzIiwic2lkIjoiNmFiZTZiODQtMDVmNy00ODRlLTgxY2YtZGI1MjJiZTczZGEzIn0.9HI4p81vG6cg8mB37YZyUaR-HYnSz40s-4_5CgsdfC8",
  "access_expires_at": "2026-10-30T10:17:01.799159499Z",
  "refresh_token": "jSiBP5oKuYowp0SJu-o9ZUOe3XjPrKBMf7KDgj8ImhE",
  "refresh_expires_at": "2026-10-30T22:02:01.796968659Z",
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
  "session_id": "0bded93a-0d71-453a-991c-a50fea477655",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0MjMsImlhdCI6MTc5MzM1NDUyMywianRpIjoiZjMyMGI0NmMtZDQzNS00ZjdjLWFmMmUtMjUxMmYxZDhkYWIzIiwic2lkIjoiMGJkZWQ5M2EtMGQ3MS00NTNhLTk5MWMtYTUwZmVhNDc3NjU1In0.34muixc61ae7Gk-3oLNYhuoCVK_1m6SnP86fMS4HTtY",
  "access_expires_at": "2026-10-30T10:17:03.651718233Z",
  "refresh_token": "EgAtb2DvfFratHjh4owt9VUxYJVRQe7LwrZcz6neTFw",
  "refresh_expires_at": "2026-10-30T22:02:03.650892725Z",
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
  "device_ref": "sandbox-27777"
}
```

```json
{
  "challenge_id": "d89590b1-c711-4d7e-8080-e62e24e0cc74",
  "expires_at": "2026-10-30T10:07:04.2913443Z",
  "resend_available_at": "2026-10-30T10:02:05.2913443Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "845029",
  "sent_at": "2026-10-30T10:02:04.305139314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d89590b1-c711-4d7e-8080-e62e24e0cc74",
  "code": "845029",
  "device_ref": "sandbox-27777"
}
```

```json
{
  "session_id": "9835213a-001a-4503-8a53-77576cddcd78",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQyNCwiaWF0IjoxNzkzMzU0NTI0LCJqdGkiOiIyZmQ2ODVhOS1hNDBhLTQzMTItYjQyMi04MjMzMTRhNTAxYzYiLCJzaWQiOiI5ODM1MjEzYS0wMDFhLTQ1MDMtOGE1My03NzU3NmNkZGNkNzgifQ.VU8dcnqsehY24-0HH5PTN_-XSzDvjyuFiZIyYKqkZoI",
  "access_expires_at": "2026-10-30T10:17:04.641049972Z",
  "refresh_token": "zERkZ2Xlaas6DYjwOecGbjScT62X55D7Wys-YRAyefI",
  "refresh_expires_at": "2026-11-29T10:02:04.639808704Z",
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
  "command_id": "dd77d89f-f23c-40fd-b164-a805c7c851ae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:05Z",
    "sequence": 1793354525256
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ddb3ad8c-9358-4ab4-9010-87c01224c61e",
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
  "last_heartbeat_at": "2026-10-30T10:02:05.353086Z",
  "last_location_at": "2026-10-30T10:02:05.353086Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636099777",
  "device_ref": "sandbox-4944"
}
```

```json
{
  "challenge_id": "b5f68acb-223a-4552-8a6b-a9bac792d224",
  "expires_at": "2026-10-30T10:07:05.657674Z",
  "resend_available_at": "2026-10-30T10:02:06.657674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636099777` → **200**

```json
{
  "phone": "+380636099777",
  "audience": "CLIENT",
  "code": "888021",
  "sent_at": "2026-10-30T10:02:05.662575182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5f68acb-223a-4552-8a6b-a9bac792d224",
  "code": "888021",
  "device_ref": "sandbox-4944"
}
```

```json
{
  "session_id": "cdb76f11-96eb-4e07-829f-6ee006930863",
  "subject": {
    "type": "CLIENT",
    "id": "18c0f1a1-ea47-446f-a048-a3a2ee6616b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGMwZjFhMS1lYTQ3LTQ0NmYtYTA0OC1hM2EyZWU2NjE2YjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDI1LCJpYXQiOjE3OTMzNTQ1MjUsImp0aSI6IjVlNDQ0M2FlLTgyN2QtNDcxMC1hNjllLTYxYzc1ZDQwNzc0NCIsInNpZCI6ImNkYjc2ZjExLTk2ZWItNGUwNy04MjlmLTZlZTAwNjkzMDg2MyJ9.rOf26WI9G5_9PdVPq7W_ZA3kkNIqpImQGa0xK6hMzfw",
  "access_expires_at": "2026-10-30T10:17:05.971875149Z",
  "refresh_token": "IVj92IZcnnpPEZEfWJ-6IAPTXXYAXwwoy-kpXeyGf_w",
  "refresh_expires_at": "2026-11-29T10:02:05.970865025Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad743044-c463-4a21-84e7-33e0ba01be2e",
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
  "id": "b5278c5d-31ae-49a8-8c25-3ab855856c02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:07:06.296221Z",
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
  "command_id": "78dcf4b9-4370-4e69-b5df-03a3caeb3adc",
  "quote_id": "b5278c5d-31ae-49a8-8c25-3ab855856c02",
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
  "id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "18c0f1a1-ea47-446f-a048-a3a2ee6616b7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:02:06.693181Z",
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
    "id": "ebd916fd-9eea-417f-ad6d-7a10b52efd50",
    "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
    "expires_at": "2026-10-30T10:02:21.704231Z",
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

`POST /api/driver/v1/offers/ebd916fd-9eea-417f-ad6d-7a10b52efd50/accept` → **200**

```json
{
  "command_id": "82e6cb57-9b8d-4676-a56c-1f02fce6b470"
}
```

```json
{
  "id": "86024a1a-8d31-4e6c-a403-169d857388c4",
  "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7d642b67-2206-452a-ad57-085cfba36b4f",
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
  "command_id": "a8d9c9ee-3bbc-47b2-acbc-98da1f1c1ac7",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T10:02:07.980671728Z"
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
  "id": "7d642b67-2206-452a-ad57-085cfba36b4f",
  "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
  "assignment_id": "86024a1a-8d31-4e6c-a403-169d857388c4",
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

`POST /api/driver/v1/work-sessions/ddb3ad8c-9358-4ab4-9010-87c01224c61e/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:08Z",
    "sequence": 1793354528880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ddb3ad8c-9358-4ab4-9010-87c01224c61e",
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
  "last_heartbeat_at": "2026-10-30T10:02:08.907397Z",
  "last_location_at": "2026-10-30T10:02:08.907397Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7d642b67-2206-452a-ad57-085cfba36b4f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "91456363-dc7b-413d-9b8d-379ca1bed620",
  "expected_version": 0
}
```

```json
{
  "id": "7d642b67-2206-452a-ad57-085cfba36b4f",
  "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
  "assignment_id": "86024a1a-8d31-4e6c-a403-169d857388c4",
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
  "arrived_at": "2026-10-30T10:02:09.212427Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7d642b67-2206-452a-ad57-085cfba36b4f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a48e5d7f-639c-4cbe-a463-6d1f8e35783a",
  "expected_version": 1
}
```

```json
{
  "id": "7d642b67-2206-452a-ad57-085cfba36b4f",
  "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
  "assignment_id": "86024a1a-8d31-4e6c-a403-169d857388c4",
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
  "arrived_at": "2026-10-30T10:02:09.212427Z",
  "started_at": "2026-10-30T10:02:09.521794Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7d642b67-2206-452a-ad57-085cfba36b4f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "47956eac-c618-426d-bd5f-3a0bdfd1fd36",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:02:09Z",
  "cash_received": true
}
```

```json
{
  "id": "7d642b67-2206-452a-ad57-085cfba36b4f",
  "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
  "assignment_id": "86024a1a-8d31-4e6c-a403-169d857388c4",
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
  "arrived_at": "2026-10-30T10:02:09.212427Z",
  "started_at": "2026-10-30T10:02:09.521794Z",
  "completed_at": "2026-10-30T10:02:09.839675Z",
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
  "session_id": "ddb3ad8c-9358-4ab4-9010-87c01224c61e",
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
  "last_heartbeat_at": "2026-10-30T10:02:08.907397Z",
  "last_location_at": "2026-10-30T10:02:08.907397Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ddb3ad8c-9358-4ab4-9010-87c01224c61e/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "564375d7-78ec-4cfd-991c-648f33996129",
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
  "command_id": "1c846810-b181-468f-bc9e-118f83e77706",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:10Z",
    "sequence": 1793354530763
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
  "correlation_id": "9086f65f-7776-4778-ab92-b39ba8e4308f",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "c5b7d729-64b5-4fce-ab3c-e93a3ef4029f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:11Z",
    "sequence": 1793354531766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc939449-a551-44e8-ad7d-a7240c0c6ea3",
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
  "last_heartbeat_at": "2026-10-30T10:02:11.100234Z",
  "last_location_at": "2026-10-30T10:02:11.100234Z",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T10:02:07.980672Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "ed99140e-70b2-4dc2-94f8-cb9d99da8d83",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T10:02:11.757711166Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc939449-a551-44e8-ad7d-a7240c0c6ea3",
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
  "last_heartbeat_at": "2026-10-30T10:02:11.100234Z",
  "last_location_at": "2026-10-30T10:02:11.100234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cc939449-a551-44e8-ad7d-a7240c0c6ea3/close` → **200**

```json
{
  "command_id": "83fb5b96-172e-424c-8015-89f78b55a0e6",
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
  "session_id": "0dc54026-c4ab-49f5-b81b-f25b027bc76a",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0MzMsImlhdCI6MTc5MzM1NDUzMywianRpIjoiOTM1NzZkM2YtYmE3OC00ZWE2LTg4MGUtMjAzZjllMmU4Zjk5Iiwic2lkIjoiMGRjNTQwMjYtYzRhYi00OWY1LWI4MWItZjI1YjAyN2JjNzZhIn0.gf-wpEZ97wpTz3owCrNlypaEUno-LOCFZpUEHE0YPyI",
  "access_expires_at": "2026-10-30T10:17:13.024287814Z",
  "refresh_token": "OZZ1Cpfte07SuYe9PZ5GD4cmtJu6Y5Qf_Cal31LmI-o",
  "refresh_expires_at": "2026-10-30T22:02:13.023101724Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2d444d9d-2c55-4d21-a2db-bdf7b5281787",
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
  "id": "c4030060-4db1-413e-a3cf-1d1a5c0c3cfe",
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
  "created_by": "b477a07b-147c-491d-98d2-42d588071767",
  "created_at": "2026-10-30T10:02:13.341525Z",
  "updated_at": "2026-10-30T10:02:13.341525Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639344298",
  "device_ref": "sandbox-26895"
}
```

```json
{
  "challenge_id": "62e5bd15-ed59-401d-9c10-fb57bf13faf6",
  "expires_at": "2026-10-30T10:07:13.649716964Z",
  "resend_available_at": "2026-10-30T10:02:14.649716964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639344298` → **200**

```json
{
  "phone": "+380639344298",
  "audience": "CLIENT",
  "code": "298345",
  "sent_at": "2026-10-30T10:02:13.656249823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62e5bd15-ed59-401d-9c10-fb57bf13faf6",
  "code": "298345",
  "device_ref": "sandbox-26895"
}
```

```json
{
  "session_id": "3e4f15cc-e8c3-4e85-a211-8aa20e967b11",
  "subject": {
    "type": "CLIENT",
    "id": "b7df21df-1e09-410b-b083-c84722bde749"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiN2RmMjFkZi0xZTA5LTQxMGItYjA4My1jODQ3MjJiZGU3NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDMzLCJpYXQiOjE3OTMzNTQ1MzMsImp0aSI6ImNiZmM4MjAxLTI4YTYtNDM4NS05OGMzLWY1ZDFlMDJkZDM3MiIsInNpZCI6IjNlNGYxNWNjLWU4YzMtNGU4NS1hMjExLThhYTIwZTk2N2IxMSJ9.4VnfT3ujl-9sXw_eZqnRiWwMzE8QmzaTMOM2ZB-JSSM",
  "access_expires_at": "2026-10-30T10:17:13.967763265Z",
  "refresh_token": "Nd9nsEOewBDSlru_AXy6wHvjWwByiL9HcGqTmV6Vtg0",
  "refresh_expires_at": "2026-11-29T10:02:13.966943078Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639344298` → **200**

```json
{
  "client_id": "b7df21df-1e09-410b-b083-c84722bde749"
}
```

`POST /api/admin/v1/rider-wallets/b7df21df-1e09-410b-b083-c84722bde749/top-ups` → **201**

```json
{
  "command_id": "adf6796c-ef49-40ec-b8b2-5f18d8748c41",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b7df21df-1e09-410b-b083-c84722bde749",
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
      "id": "65485656-f179-49c6-9810-3efe1e721e09",
      "at": "2026-10-30T10:02:14.5401Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7029dd91-157b-4c68-8327-ac23fa3f107e",
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
  "id": "628e9a01-ef13-477c-bc8d-4931d913d1be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:07:14.868434Z",
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
      "id": "c4030060-4db1-413e-a3cf-1d1a5c0c3cfe",
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
  "device_ref": "sandbox-9836"
}
```

```json
{
  "challenge_id": "9c7f6d92-203f-4f87-8de7-63e35f02604d",
  "expires_at": "2026-10-30T10:07:15.177417052Z",
  "resend_available_at": "2026-10-30T10:02:16.177417052Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "432033",
  "sent_at": "2026-10-30T10:02:15.181813338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c7f6d92-203f-4f87-8de7-63e35f02604d",
  "code": "432033",
  "device_ref": "sandbox-9836"
}
```

```json
{
  "session_id": "53e3498e-9102-482c-a352-079c726fad9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQzNSwiaWF0IjoxNzkzMzU0NTM1LCJqdGkiOiJiOTM0YzIxYy0yNGJlLTRlYWMtYjM5Ni00MzkxMDhmOTRjMjMiLCJzaWQiOiI1M2UzNDk4ZS05MTAyLTQ4MmMtYTM1Mi0wNzljNzI2ZmFkOWMifQ.oYBFOz4hruuMEIntlUrJ9zJR36c-XUyV7R6u1AMumM8",
  "access_expires_at": "2026-10-30T10:17:15.503690177Z",
  "refresh_token": "qHQ-cj3mEy3kKV3pd6VUK_3tfIZk8EBFqmeeED4JrjU",
  "refresh_expires_at": "2026-11-29T10:02:15.502692067Z",
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
  "command_id": "232caead-1165-4a7e-a2b7-9675a1de203e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:16Z",
    "sequence": 1793354536710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39b9b40f-c760-47ba-a2c6-7b40de4aa866",
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
  "last_heartbeat_at": "2026-10-30T10:02:16.095189Z",
  "last_location_at": "2026-10-30T10:02:16.095189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8b7d5258-ba61-4dd7-8635-0d6af4ae1e46",
  "quote_id": "628e9a01-ef13-477c-bc8d-4931d913d1be",
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
  "id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7df21df-1e09-410b-b083-c84722bde749",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:02:16.400937Z",
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
  "client_id": "b7df21df-1e09-410b-b083-c84722bde749",
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
      "id": "65485656-f179-49c6-9810-3efe1e721e09",
      "at": "2026-10-30T10:02:14.5401Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
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
    "id": "92354c3c-d3fc-4433-a46a-5861565772a1",
    "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
    "expires_at": "2026-10-30T10:02:31.410871Z",
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

`POST /api/driver/v1/offers/92354c3c-d3fc-4433-a46a-5861565772a1/accept` → **200**

```json
{
  "command_id": "17d818ff-8667-43f7-931f-915afe798f06"
}
```

```json
{
  "id": "9da09385-8587-4f85-a52d-dba893e403b0",
  "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "661ea128-f563-42dd-bcf1-a4963cfd8a03",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "661ea128-f563-42dd-bcf1-a4963cfd8a03",
  "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
  "assignment_id": "9da09385-8587-4f85-a52d-dba893e403b0",
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

`POST /api/driver/v1/work-sessions/39b9b40f-c760-47ba-a2c6-7b40de4aa866/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:17Z",
    "sequence": 1793354537888
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39b9b40f-c760-47ba-a2c6-7b40de4aa866",
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
  "last_heartbeat_at": "2026-10-30T10:02:17.910334Z",
  "last_location_at": "2026-10-30T10:02:17.910334Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/661ea128-f563-42dd-bcf1-a4963cfd8a03/arrive` → **200**

```json
{
  "command_id": "ecdd75c2-b43b-4171-a544-ba08b4f0c818",
  "expected_version": 0
}
```

```json
{
  "id": "661ea128-f563-42dd-bcf1-a4963cfd8a03",
  "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
  "assignment_id": "9da09385-8587-4f85-a52d-dba893e403b0",
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
  "arrived_at": "2026-10-30T10:02:18.21075Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/661ea128-f563-42dd-bcf1-a4963cfd8a03/start` → **200**

```json
{
  "command_id": "e3074826-55ef-4d5b-846e-207f8101b50a",
  "expected_version": 1
}
```

```json
{
  "id": "661ea128-f563-42dd-bcf1-a4963cfd8a03",
  "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
  "assignment_id": "9da09385-8587-4f85-a52d-dba893e403b0",
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
  "arrived_at": "2026-10-30T10:02:18.21075Z",
  "started_at": "2026-10-30T10:02:18.516878Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/661ea128-f563-42dd-bcf1-a4963cfd8a03/complete` → **200**

```json
{
  "command_id": "f5fa0b01-4701-4a87-982f-fbb021c4ce28",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:02:18Z",
  "cash_received": true
}
```

```json
{
  "id": "661ea128-f563-42dd-bcf1-a4963cfd8a03",
  "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
  "assignment_id": "9da09385-8587-4f85-a52d-dba893e403b0",
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
  "arrived_at": "2026-10-30T10:02:18.21075Z",
  "started_at": "2026-10-30T10:02:18.516878Z",
  "completed_at": "2026-10-30T10:02:18.831767Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b7df21df-1e09-410b-b083-c84722bde749",
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
      "id": "492f85cc-8793-4746-8b6c-ef253d701b51",
      "at": "2026-10-30T10:02:19.279723Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249"
    },
    {
      "id": "65485656-f179-49c6-9810-3efe1e721e09",
      "at": "2026-10-30T10:02:14.5401Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c4030060-4db1-413e-a3cf-1d1a5c0c3cfe/archive` → **200**

```json
{
  "command_id": "f4aacd29-2da0-4f62-9d55-946debced4c2",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c4030060-4db1-413e-a3cf-1d1a5c0c3cfe",
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
  "created_by": "b477a07b-147c-491d-98d2-42d588071767",
  "created_at": "2026-10-30T10:02:13.341525Z",
  "updated_at": "2026-10-30T10:02:22.440004Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39b9b40f-c760-47ba-a2c6-7b40de4aa866",
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
  "last_heartbeat_at": "2026-10-30T10:02:17.910334Z",
  "last_location_at": "2026-10-30T10:02:17.910334Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/39b9b40f-c760-47ba-a2c6-7b40de4aa866/close` → **200**

```json
{
  "command_id": "3f1cd979-73f6-461a-aa0a-7f74a983cf77",
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

Done: order 982e1d14-bfd2-4aed-ac7f-11a207300249.

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
  "session_id": "5f2520d3-2a7a-4f31-b8f9-d30c2ded445f",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0NDMsImlhdCI6MTc5MzM1NDU0MywianRpIjoiNTY2ODJkZDItOTA0MC00YzFlLTljODctZjQxNTkyMWY4ZTQ3Iiwic2lkIjoiNWYyNTIwZDMtMmE3YS00ZjMxLWI4ZjktZDMwYzJkZWQ0NDVmIn0.yM6Qu8JhudgCHSxIizH-bNdOwRY7vYM4RLmqt2RKp0k",
  "access_expires_at": "2026-10-30T10:17:23.658143229Z",
  "refresh_token": "BMI_16fQmHzH3Abvn2ufqYHMU9KL0j9jUksw8QI1J_A",
  "refresh_expires_at": "2026-10-30T22:02:23.657343139Z",
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
  "command_id": "b5a9cecb-0070-49dc-8e09-1c4411b67ec8",
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
  "session_id": "bdb479a8-53a1-4d34-b10e-57a0c35f61c6",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0NDQsImlhdCI6MTc5MzM1NDU0NCwianRpIjoiNTkyM2Q3OTYtMzE1Mi00YmQ1LThmYTEtNmFkNDE3MjRhNzQxIiwic2lkIjoiYmRiNDc5YTgtNTNhMS00ZDM0LWIxMGUtNTdhMGMzNWY2MWM2In0.aXq57pS4dvj7655YnWMQawFHvpr7RZEFdFfD97AK0gQ",
  "access_expires_at": "2026-10-30T10:17:24.853207583Z",
  "refresh_token": "850QqOudGR6o9x8LfjyjSj91J9ELRoiG0uaXkT-1MNE",
  "refresh_expires_at": "2026-10-30T22:02:24.852456255Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.55268195",
    "linkedid": "1730052700.55268195",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679039219"
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
    "id": "1730052700.55268195",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "48241822-c44b-4f8f-b9e5-a3c377806f2f",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.160924Z",
      "answered_at": null,
      "ended_at": "2026-10-30T10:02:25.190048Z",
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
    "id": "1730052600.1380517034",
    "linkedid": "1730052600.1380517034",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679039219"
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
      "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.537573Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b8b0d087-2135-45fa-9398-6a7ca1dd704c/answer` → **200**

```json
{
  "command_id": "2ab72d14-4559-4884-9229-3082a74bf21f"
}
```

```json
{
  "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679039219",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
  "order_ids": [],
  "started_at": "2026-10-30T10:02:25.537573Z",
  "answered_at": "2026-10-30T10:02:25.868285Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1380517034",
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
    "id": "1730052600.1380517034",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.537573Z",
      "answered_at": "2026-10-30T10:02:25.868285Z",
      "ended_at": "2026-10-30T10:02:26.185333Z",
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
      "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.537573Z",
      "answered_at": "2026-10-30T10:02:25.868285Z",
      "ended_at": "2026-10-30T10:02:26.185333Z",
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
      "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.537573Z",
      "answered_at": "2026-10-30T10:02:25.868285Z",
      "ended_at": "2026-10-30T10:02:26.185333Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:02:29.968007Z"
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
      "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.537573Z",
      "answered_at": "2026-10-30T10:02:25.868285Z",
      "ended_at": "2026-10-30T10:02:26.185333Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:02:29.968007Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b8b0d087-2135-45fa-9398-6a7ca1dd704c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b8b0d087-2135-45fa-9398-6a7ca1dd704c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b8b0d087-2135-45fa-9398-6a7ca1dd704c` → **200**

```json
{
  "changes": [
    {
      "id": "877fffdb-91a1-4447-9788-97be1696da8e",
      "occurred_at": "2026-10-30T10:02:31.462853Z",
      "actor_type": "STAFF",
      "actor_id": "b477a07b-147c-491d-98d2-42d588071767",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7a626304-adaf-4fcd-8fd7-0ba928d16b53\", \"order_ids\": []}",
      "correlation_id": "28cf7489-1027-4618-8b23-1c4d4b2e4220"
    },
    {
      "id": "79272de5-0db2-4e1b-ad95-7602c4f8ba40",
      "occurred_at": "2026-10-30T10:02:31.427114Z",
      "actor_type": "STAFF",
      "actor_id": "b477a07b-147c-491d-98d2-42d588071767",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7a626304-adaf-4fcd-8fd7-0ba928d16b53\", \"order_ids\": []}",
      "correlation_id": "8b6d1fc9-e38d-4ea9-979c-b39cd6987c3f"
    }
  ]
}
```

Done: call b8b0d087-2135-45fa-9398-6a7ca1dd704c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4975"
}
```

```json
{
  "challenge_id": "ace03984-23c1-4375-ae69-8cddcce0b1a1",
  "expires_at": "2026-10-30T10:07:31.838733266Z",
  "resend_available_at": "2026-10-30T10:02:32.838733266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "534920",
  "sent_at": "2026-10-30T10:02:31.843463816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ace03984-23c1-4375-ae69-8cddcce0b1a1",
  "code": "534920",
  "device_ref": "sandbox-4975"
}
```

```json
{
  "session_id": "e2504df9-4116-4878-a042-51970ceb8582",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQ1MiwiaWF0IjoxNzkzMzU0NTUyLCJqdGkiOiI4ZmM1NjFmMC1jOWQzLTQ2M2EtODgzMC05MjdhYjQ5NzM2ZjMiLCJzaWQiOiJlMjUwNGRmOS00MTE2LTQ4NzgtYTA0Mi01MTk3MGNlYjg1ODIifQ._VDT_rEkzYIPlgbvpmuFGYT9rWFoPIOuBcIm6uKGm2o",
  "access_expires_at": "2026-10-30T10:17:32.179925262Z",
  "refresh_token": "B7fsPR8As2AV6I672i-w0jjPZ0_vXkFabSr0aXIN0ew",
  "refresh_expires_at": "2026-11-29T10:02:32.179257159Z",
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
  "command_id": "5c03bf75-26b0-4712-8e03-91c81cd4f5c7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:32Z",
    "sequence": 1793354552738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1b49dfe5-01ab-43a4-b878-09966f847168",
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
  "last_heartbeat_at": "2026-10-30T10:02:32.759607Z",
  "last_location_at": "2026-10-30T10:02:32.759607Z",
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
  "session_id": "d3364091-e512-47d3-a99e-902f5a163b9a",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0NTMsImlhdCI6MTc5MzM1NDU1MywianRpIjoiZGE4NDMzMmQtZTlmMC00NDg3LTk4MDMtNTg3M2VkMzkxZmIyIiwic2lkIjoiZDMzNjQwOTEtZTUxMi00N2QzLWE5OWUtOTAyZjVhMTYzYjlhIn0.CZ4AV6chu2Ik7H7d_Wp6aJbx-qchIqDTnNUPEDSIeUA",
  "access_expires_at": "2026-10-30T10:17:33.359597692Z",
  "refresh_token": "-WzdisCijbSMEk2am2OWO-MC-IBMPb0znLiKsohhZAI",
  "refresh_expires_at": "2026-10-30T22:02:33.358889835Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "09050010-767a-4fb3-afe8-9aa2483f9bbf",
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
  "id": "c3b24293-fbfb-4155-9e21-cb3f2094c8c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:07:33.658548Z",
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
  "command_id": "eb528739-ccdb-4128-bd7d-d02efb270859",
  "quote_id": "c3b24293-fbfb-4155-9e21-cb3f2094c8c4",
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
    "phone": "+380674974211"
  }
}
```

```json
{
  "id": "928e9947-f59f-406e-8b69-a60db10d497e",
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
  "created_at": "2026-10-30T10:02:33.978884Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674974211"
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
    "id": "5cfc5811-55f2-42dc-8407-a5fdb802b9da",
    "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
    "expires_at": "2026-10-30T10:02:48.984523Z",
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

`POST /api/driver/v1/offers/5cfc5811-55f2-42dc-8407-a5fdb802b9da/accept` → **200**

```json
{
  "command_id": "5415b0df-69ba-479b-bab3-1aea69024146"
}
```

```json
{
  "id": "44e2fa18-ded3-4f7e-b3f4-da63bf3b0e2f",
  "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "625925fb-5dbb-4d8f-b315-b3a702a3c5ca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "625925fb-5dbb-4d8f-b315-b3a702a3c5ca",
  "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
  "assignment_id": "44e2fa18-ded3-4f7e-b3f4-da63bf3b0e2f",
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
    "phone": "+380674974211"
  }
}
```

`POST /api/driver/v1/work-sessions/1b49dfe5-01ab-43a4-b878-09966f847168/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:37Z",
    "sequence": 1793354557298
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1b49dfe5-01ab-43a4-b878-09966f847168",
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
  "last_heartbeat_at": "2026-10-30T10:02:37.320371Z",
  "last_location_at": "2026-10-30T10:02:37.320371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/625925fb-5dbb-4d8f-b315-b3a702a3c5ca/arrive` → **200**

```json
{
  "command_id": "0175c591-af5d-4408-885d-5d0222891f0a",
  "expected_version": 0
}
```

```json
{
  "id": "625925fb-5dbb-4d8f-b315-b3a702a3c5ca",
  "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
  "assignment_id": "44e2fa18-ded3-4f7e-b3f4-da63bf3b0e2f",
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
  "arrived_at": "2026-10-30T10:02:37.618208Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674974211"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  },
  {
    "phone": "+380674974211",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:39.195207342Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  },
  {
    "phone": "+380674974211",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:39.195207342Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674974211` → **200**

```json
[
  {
    "phone": "+380674974211",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:36.1833784Z"
  },
  {
    "phone": "+380674974211",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:02:39.195207342Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/625925fb-5dbb-4d8f-b315-b3a702a3c5ca/start` → **200**

```json
{
  "command_id": "c48bb3e9-ef72-4e19-8365-34e5aac78bf9",
  "expected_version": 1
}
```

```json
{
  "id": "625925fb-5dbb-4d8f-b315-b3a702a3c5ca",
  "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
  "assignment_id": "44e2fa18-ded3-4f7e-b3f4-da63bf3b0e2f",
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
  "arrived_at": "2026-10-30T10:02:37.618208Z",
  "started_at": "2026-10-30T10:02:40.064042Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674974211"
  }
}
```

`POST /api/driver/v1/trips/625925fb-5dbb-4d8f-b315-b3a702a3c5ca/complete` → **200**

```json
{
  "command_id": "70141a4e-c0cb-4a59-ae2b-ca0f12094759",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:02:40Z",
  "cash_received": true
}
```

```json
{
  "id": "625925fb-5dbb-4d8f-b315-b3a702a3c5ca",
  "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
  "assignment_id": "44e2fa18-ded3-4f7e-b3f4-da63bf3b0e2f",
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
  "arrived_at": "2026-10-30T10:02:37.618208Z",
  "started_at": "2026-10-30T10:02:40.064042Z",
  "completed_at": "2026-10-30T10:02:40.389228Z",
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
  "session_id": "1b49dfe5-01ab-43a4-b878-09966f847168",
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
  "last_heartbeat_at": "2026-10-30T10:02:37.320371Z",
  "last_location_at": "2026-10-30T10:02:37.320371Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1b49dfe5-01ab-43a4-b878-09966f847168/close` → **200**

```json
{
  "command_id": "b5ee134f-a18e-475c-b89e-b040563835ee",
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
  "phone": "+380635368082",
  "device_ref": "sandbox-12733"
}
```

```json
{
  "challenge_id": "01b7f637-4038-4002-aacd-2b434c589e5b",
  "expires_at": "2026-10-30T10:07:41.283133173Z",
  "resend_available_at": "2026-10-30T10:02:42.283133173Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635368082` → **200**

```json
{
  "phone": "+380635368082",
  "audience": "CLIENT",
  "code": "895194",
  "sent_at": "2026-10-30T10:02:41.287668354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01b7f637-4038-4002-aacd-2b434c589e5b",
  "code": "895194",
  "device_ref": "sandbox-12733"
}
```

```json
{
  "session_id": "0c2158a3-4962-4dbd-adab-30158e5d1f7f",
  "subject": {
    "type": "CLIENT",
    "id": "e9320557-b86b-4164-b4c4-29d1010be6ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTMyMDU1Ny1iODZiLTQxNjQtYjRjNC0yOWQxMDEwYmU2ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDYxLCJpYXQiOjE3OTMzNTQ1NjEsImp0aSI6IjdiMmYzODI3LWM4NWQtNGE1My04NjJjLWY4MzhlMTdmMzBiMiIsInNpZCI6IjBjMjE1OGEzLTQ5NjItNGRiZC1hZGFiLTMwMTU4ZTVkMWY3ZiJ9.uhcTImAuNasewI5MaASHdFuq0PZOrnKhA6bH6NrbWMA",
  "access_expires_at": "2026-10-30T10:17:41.613764386Z",
  "refresh_token": "2vXSAvCSMopDol-_RXkNUpQvShCc-wPxZWiAbbD6maU",
  "refresh_expires_at": "2026-11-29T10:02:41.613139824Z",
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
  "device_ref": "sandbox-27561"
}
```

```json
{
  "challenge_id": "8322526b-96a6-4b9a-bc2d-e3a36c46e9f0",
  "expires_at": "2026-10-30T10:07:42.190986364Z",
  "resend_available_at": "2026-10-30T10:02:43.190986364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "715883",
  "sent_at": "2026-10-30T10:02:42.19489301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8322526b-96a6-4b9a-bc2d-e3a36c46e9f0",
  "code": "715883",
  "device_ref": "sandbox-27561"
}
```

```json
{
  "session_id": "695b8213-41b3-4ebf-a642-15b5d963cf95",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQ2MiwiaWF0IjoxNzkzMzU0NTYyLCJqdGkiOiJkNjQ3Mjk3OC0zYzdkLTQyYTAtOWI2Yi1mM2M3NzlmNjc5YTUiLCJzaWQiOiI2OTViODIxMy00MWIzLTRlYmYtYTY0Mi0xNWI1ZDk2M2NmOTUifQ.F3fyAE-NsHq23rzC08bKudvSBC8DIk3ii9_cttX85Rk",
  "access_expires_at": "2026-10-30T10:17:42.50352857Z",
  "refresh_token": "_Ydex7xrB2nyUyQ4NAaVxAqfurVlPYMc9GpcwBRpwUg",
  "refresh_expires_at": "2026-11-29T10:02:42.502786579Z",
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
  "session_id": "8be72698-a4b1-4b3e-9568-9761419df0d9",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0NjMsImlhdCI6MTc5MzM1NDU2MywianRpIjoiNTJmZGM0ZjctMTE5OC00ZWE1LThiNmUtNmRhMDhjOTQ5YTRjIiwic2lkIjoiOGJlNzI2OTgtYTRiMS00YjNlLTk1NjgtOTc2MTQxOWRmMGQ5In0.lIFotxeo4w8fUsVJLYBc9QyRv_-bke2itOHiZfaju4k",
  "access_expires_at": "2026-10-30T10:17:43.369264284Z",
  "refresh_token": "XkcRAGWhFqNrxAv56x9yzia4vsWKGiBAwcAHfN3DI8s",
  "refresh_expires_at": "2026-10-30T22:02:43.368681261Z",
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
  "session_id": "9ad75747-4ee6-47e1-b81b-11b8c5308201",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0NjMsImlhdCI6MTc5MzM1NDU2MywianRpIjoiMjc5M2FjMTAtNzg5MC00ZDI4LThmOGUtMjkzNDk0YWI1YjkzIiwic2lkIjoiOWFkNzU3NDctNGVlNi00N2UxLWI4MWItMTFiOGM1MzA4MjAxIn0.vVAeHH9Any_QFDlwLfUKc9rQnMwfXA-KUhDmIyN30Gs",
  "access_expires_at": "2026-10-30T10:17:43.946354153Z",
  "refresh_token": "KRpK0kobeI73kDq9F2ynMXgRa-YCDI-Vm8Yg4-13RP0",
  "refresh_expires_at": "2026-10-30T22:02:43.945597474Z",
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
  "command_id": "8cae6ec3-a747-4e5b-864c-d3cbddde6408",
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
  "id": "616ec43d-b1e9-4761-9c75-0eec30981a34",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:07:44.532422Z",
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
  "command_id": "96c3513a-59fb-4f52-a46f-88646c683b3d",
  "quote_id": "616ec43d-b1e9-4761-9c75-0eec30981a34",
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
  "id": "afd9bc11-b17f-4897-9f5d-7c73974cda02",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9320557-b86b-4164-b4c4-29d1010be6ea",
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
  "created_at": "2026-10-30T10:02:44.829206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/afd9bc11-b17f-4897-9f5d-7c73974cda02` → **200**

```json
{
  "id": "afd9bc11-b17f-4897-9f5d-7c73974cda02",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9320557-b86b-4164-b4c4-29d1010be6ea",
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
  "created_at": "2026-10-30T10:02:44.829206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/afd9bc11-b17f-4897-9f5d-7c73974cda02/cancel` → **200**

```json
{
  "command_id": "77f5f99c-05b9-495f-8f61-9f06da367510",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "afd9bc11-b17f-4897-9f5d-7c73974cda02",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9320557-b86b-4164-b4c4-29d1010be6ea",
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
  "created_at": "2026-10-30T10:02:44.829206Z",
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
  "command_id": "6988792b-0fe7-455b-b3c6-b1b5bb552ee8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:46Z",
    "sequence": 1793354566696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "369c0457-4c4f-4ba6-bfb1-e16b299dccf1",
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
  "last_heartbeat_at": "2026-10-30T10:02:46.090504Z",
  "last_location_at": "2026-10-30T10:02:46.090504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13139"
}
```

```json
{
  "challenge_id": "a3a8e0ec-f181-49c6-af21-c71e084ddfab",
  "expires_at": "2026-10-30T10:07:46.380051505Z",
  "resend_available_at": "2026-10-30T10:02:47.380051505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "516724",
  "sent_at": "2026-10-30T10:02:46.383699361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3a8e0ec-f181-49c6-af21-c71e084ddfab",
  "code": "516724",
  "device_ref": "sandbox-13139"
}
```

```json
{
  "session_id": "87d06f0e-ac49-4e92-b000-3f5c38455553",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQ2NiwiaWF0IjoxNzkzMzU0NTY2LCJqdGkiOiI2ZmI3ZjMwOC04ZmVjLTQ0NzktYTA4Zi1mMTA0MzU4OGU3MzgiLCJzaWQiOiI4N2QwNmYwZS1hYzQ5LTRlOTItYjAwMC0zZjVjMzg0NTU1NTMifQ.6-lYqAhjL9lHVif7fh8wGewuHgZ1vbmE_Q38cpUMK2M",
  "access_expires_at": "2026-10-30T10:17:46.702778608Z",
  "refresh_token": "ZwDss5j9yd6EXpddkJtCu7jwN1RKOsFrXZeQy5JmQLs",
  "refresh_expires_at": "2026-11-29T10:02:46.7020916Z",
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
  "command_id": "26f965af-8f02-40b7-9853-8c1effb88659",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:47Z",
    "sequence": 1793354567286
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:02:47.307214Z",
  "last_location_at": "2026-10-30T10:02:47.307214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e3c4edc-2759-413f-97ad-2c12951b7c46",
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
  "id": "251f96e3-312f-419d-9da3-8a11914946c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:07:47.601981Z",
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
  "command_id": "dd1230df-8be3-404a-96ee-ad35a87bdf43",
  "quote_id": "251f96e3-312f-419d-9da3-8a11914946c5",
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
  "id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9320557-b86b-4164-b4c4-29d1010be6ea",
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
  "created_at": "2026-10-30T10:02:47.898968Z",
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
    "id": "d23f3d1e-4390-4b72-9c29-716955a8a301",
    "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
    "expires_at": "2026-10-30T10:03:02.902774Z",
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

`POST /api/driver/v1/offers/d23f3d1e-4390-4b72-9c29-716955a8a301/accept` → **200**

```json
{
  "command_id": "69bd00bc-a694-44a2-9201-9815522577fb"
}
```

```json
{
  "id": "36efadf5-7468-4086-994d-1a68aeaf828c",
  "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc3cd374-97ca-4b6f-98bf-7b1e67e27384",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc3cd374-97ca-4b6f-98bf-7b1e67e27384",
  "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "assignment_id": "36efadf5-7468-4086-994d-1a68aeaf828c",
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

`POST /api/driver/v1/trips/dc3cd374-97ca-4b6f-98bf-7b1e67e27384/cancel` → **200**

```json
{
  "command_id": "e9d5c63e-4349-4c9d-b70e-88ec409a0752",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "dc3cd374-97ca-4b6f-98bf-7b1e67e27384",
  "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "assignment_id": "36efadf5-7468-4086-994d-1a68aeaf828c",
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

`GET /api/rider/v1/orders/31b96868-85a0-4750-b439-f536380cd7c8` → **200**

```json
{
  "id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e9320557-b86b-4164-b4c4-29d1010be6ea",
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
    "id": "36efadf5-7468-4086-994d-1a68aeaf828c",
    "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dc3cd374-97ca-4b6f-98bf-7b1e67e27384",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:02:47.898968Z",
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
    "id": "5d5f22c5-dd2c-4d9c-8af7-36b8ca2abe40",
    "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
    "expires_at": "2026-10-30T10:03:04.071989Z",
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

`POST /api/driver/v1/offers/5d5f22c5-dd2c-4d9c-8af7-36b8ca2abe40/accept` → **200**

```json
{
  "command_id": "bb631e37-82c7-4f3b-8577-21c2da70bb17"
}
```

```json
{
  "id": "4519fe39-348c-42d4-89f2-6eaacfd4df79",
  "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a7798cf0-d53f-417f-8eb3-bd79d56f7447",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a7798cf0-d53f-417f-8eb3-bd79d56f7447",
  "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "assignment_id": "4519fe39-348c-42d4-89f2-6eaacfd4df79",
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

`POST /api/driver/v1/trips/a7798cf0-d53f-417f-8eb3-bd79d56f7447/cancel` → **200**

```json
{
  "command_id": "68da3148-1736-4de0-be54-906c183d6e44",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a7798cf0-d53f-417f-8eb3-bd79d56f7447",
  "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
  "assignment_id": "4519fe39-348c-42d4-89f2-6eaacfd4df79",
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
    "id": "31b96868-85a0-4750-b439-f536380cd7c8",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:02:47.898968Z",
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
    "id": "afd9bc11-b17f-4897-9f5d-7c73974cda02",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:02:44.829206Z",
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

`GET /api/operator/v1/orders/31b96868-85a0-4750-b439-f536380cd7c8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:02:47.899618Z",
      "actor": {
        "type": "CLIENT",
        "id": "e9320557-b86b-4164-b4c4-29d1010be6ea",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
        "quote_id": "251f96e3-312f-419d-9da3-8a11914946c5",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "2a1853c6-9cd8-446b-8f70-055f810a6d8d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:02:47.901853Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
        "attempt_id": "a794a342-4762-4e11-bed7-47da39768348",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2a1853c6-9cd8-446b-8f70-055f810a6d8d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:02:47.909688Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d23f3d1e-4390-4b72-9c29-716955a8a301",
        "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "2a1853c6-9cd8-446b-8f70-055f810a6d8d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:02:48.495038Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d23f3d1e-4390-4b72-9c29-716955a8a301",
        "order_id": "31b96868-85a0-4750-b439-f536380cd7c8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "36efadf5-7468-4086-994d-1a68aeaf828c"
      },
      "correlation_id": "2c3bbb9c-a4f8-4fd3-b1c2-f085ba2513b5"
```

Done: orders afd9bc11-b17f-4897-9f5d-7c73974cda02, 31b96868-85a0-4750-b439-f536380cd7c8.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733811475",
  "device_ref": "sandbox-12229"
}
```

```json
{
  "challenge_id": "46088da4-127f-45e6-88f5-f085b1287f22",
  "expires_at": "2026-10-30T10:07:51.481911281Z",
  "resend_available_at": "2026-10-30T10:02:52.481911281Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733811475` → **200**

```json
{
  "phone": "+380733811475",
  "audience": "CLIENT",
  "code": "029677",
  "sent_at": "2026-10-30T10:02:51.485474619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46088da4-127f-45e6-88f5-f085b1287f22",
  "code": "029677",
  "device_ref": "sandbox-12229"
}
```

```json
{
  "session_id": "d6f577fe-231d-41fc-a266-d9e9e99551c7",
  "subject": {
    "type": "CLIENT",
    "id": "fc5a16db-9a29-4ee0-8473-3978fe893569"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzVhMTZkYi05YTI5LTRlZTAtODQ3My0zOTc4ZmU4OTM1NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDcxLCJpYXQiOjE3OTMzNTQ1NzEsImp0aSI6ImJmNjlmMzUzLTg1NDktNDc3ZS05OWFmLTEzYzMzZGUwOWQ5OCIsInNpZCI6ImQ2ZjU3N2ZlLTIzMWQtNDFmYy1hMjY2LWQ5ZTllOTk1NTFjNyJ9.o1e6gxerIs2mOa-HS8CZpDvm3Ob7E5LW7F_LYmvfoH8",
  "access_expires_at": "2026-10-30T10:17:51.789041383Z",
  "refresh_token": "K23In3YmcMjn0VwwNaW_Pjc3X02bFWjzzGXiIe1gnK4",
  "refresh_expires_at": "2026-11-29T10:02:51.788487765Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bd13eed5-d149-4008-a1b7-27cafabeb696",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cd3fb436-492c-4d73-bf09-0980bb8fa7d6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cd3fb436-492c-4d73-bf09-0980bb8fa7d6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4af47d80e5f6e7fc8f6aae16f1a76ff0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cd3fb436-492c-4d73-bf09-0980bb8fa7d6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733811475"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cd3fb436-492c-4d73-bf09-0980bb8fa7d6",
  "expires_at": "2026-10-30T10:32:52.070938Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cd3fb436-492c-4d73-bf09-0980bb8fa7d6` → **200**

```json
{
  "id": "cd3fb436-492c-4d73-bf09-0980bb8fa7d6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:32:52.070938Z",
  "card": {
    "id": "4ec12137-0264-46d4-9218-43728587d78f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1462",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:02:52.384515Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4ec12137-0264-46d4-9218-43728587d78f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1462",
      "card_type": "Visa",
      "created_at": "2026-10-30T10:02:52.384515Z"
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
  "device_ref": "sandbox-19054"
}
```

```json
{
  "challenge_id": "179c088a-685d-42b4-b4e8-0287f413e30a",
  "expires_at": "2026-10-30T10:07:52.978044614Z",
  "resend_available_at": "2026-10-30T10:02:53.978044614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "885481",
  "sent_at": "2026-10-30T10:02:52.981652843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "179c088a-685d-42b4-b4e8-0287f413e30a",
  "code": "885481",
  "device_ref": "sandbox-19054"
}
```

```json
{
  "session_id": "a0953543-3a51-4959-ae42-515233dde614",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQ3MywiaWF0IjoxNzkzMzU0NTczLCJqdGkiOiIyNDk2ZjZiMS1mNWVmLTRkZmItYWM1ZC1hM2VhZWZkZTQxZWEiLCJzaWQiOiJhMDk1MzU0My0zYTUxLTQ5NTktYWU0Mi01MTUyMzNkZGU2MTQifQ.sIrCpW2pt49-K_W_pWD9hV0ZMuT5W-1ZrURJN2ZwZE8",
  "access_expires_at": "2026-10-30T10:17:53.293921098Z",
  "refresh_token": "MRlwIH6G58eE6S5dsru-WejsKoFZnPP8BG2B8JNhP2o",
  "refresh_expires_at": "2026-11-29T10:02:53.293261933Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:02:47.307214Z",
  "last_location_at": "2026-10-30T10:02:47.307214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86e4f689-f39d-4253-900c-35b34cc92786/handover` → **200**

```json
{
  "command_id": "580a9812-a1f0-4913-9dee-28b4ee8a6d76",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:02:47.307214Z",
  "last_location_at": "2026-10-30T10:02:47.307214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86e4f689-f39d-4253-900c-35b34cc92786/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:54Z",
    "sequence": 1793354574145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:02:54.166535Z",
  "last_location_at": "2026-10-30T10:02:54.166535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f94212d-a308-410d-87cb-e179b1f10115",
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
  "id": "abe57825-58f7-481b-b38a-bcde0ac4044c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:07:54.468011Z",
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
  "command_id": "87fcbab9-441e-4c9c-a669-7b90c6551852",
  "quote_id": "abe57825-58f7-481b-b38a-bcde0ac4044c",
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
  "id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
  "created_at": "2026-10-30T10:02:54.779788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f` → **200**

```json
{
  "id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
  "created_at": "2026-10-30T10:02:54.779788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f` → **200**

```json
{
  "id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
  "created_at": "2026-10-30T10:02:54.779788Z",
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
    "id": "7f7bf766-a8bf-4e41-9583-f40dc5671100",
    "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
    "expires_at": "2026-10-30T10:03:10.552459Z",
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

`POST /api/driver/v1/offers/7f7bf766-a8bf-4e41-9583-f40dc5671100/accept` → **200**

```json
{
  "command_id": "385eb0f6-c910-44d3-9726-087d220d29b8"
}
```

```json
{
  "id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "assignment_id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
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

`POST /api/driver/v1/work-sessions/86e4f689-f39d-4253-900c-35b34cc92786/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:02:57Z",
    "sequence": 1793354577586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:02:57.608933Z",
  "last_location_at": "2026-10-30T10:02:57.608933Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf/arrive` → **200**

```json
{
  "command_id": "c3bbbb94-33ec-4e6f-a7ac-038c000e3673",
  "expected_version": 0
}
```

```json
{
  "id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "assignment_id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
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
  "arrived_at": "2026-10-30T10:02:57.912527Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf/start` → **200**

```json
{
  "command_id": "87fdd850-da5b-4911-9e8c-241e706c334c",
  "expected_version": 1
}
```

```json
{
  "id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "assignment_id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
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
  "arrived_at": "2026-10-30T10:02:57.912527Z",
  "started_at": "2026-10-30T10:02:58.21464Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf/complete` → **200**

```json
{
  "command_id": "bc646025-a2ec-4c02-a630-045c2aa3415e",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:02:58Z",
  "cash_received": true
}
```

```json
{
  "id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "assignment_id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
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
  "arrived_at": "2026-10-30T10:02:57.912527Z",
  "started_at": "2026-10-30T10:02:58.21464Z",
  "completed_at": "2026-10-30T10:02:58.517729Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f` → **200**

```json
{
  "id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
    "id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
    "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:02:54.779788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f` → **200**

```json
{
  "id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
    "id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
    "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:02:54.779788Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f` → **200**

```json
{
  "id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
    "id": "fd226f0d-a58a-4293-a3e6-90dee661a109",
    "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "af1e7eb8-6f8a-4d87-8c63-03f012bc2bbf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:02:54.779788Z",
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

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f/tip` → **200**

```json
{
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
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
  "available_until": "2026-10-31T10:02:58.517729Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f/tip` → **201**

```json
{
  "command_id": "529d03be-d199-4060-ad72-3243f0d4cb07",
  "amount_minor": 2500
}
```

```json
{
  "id": "bfd41ff4-29fe-4988-9e6d-0e8d9dcb1f72",
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T10:03:02.332063Z"
}
```

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f/tip` → **200**

```json
{
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
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
  "available_until": "2026-10-31T10:02:58.517729Z",
  "open": false,
  "tip": {
    "id": "bfd41ff4-29fe-4988-9e6d-0e8d9dcb1f72",
    "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T10:03:02.332063Z"
  }
}
```

`GET /api/rider/v1/orders/9acfb3c8-86c1-457e-a189-86656cf18f5f/tip` → **200**

```json
{
  "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
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
  "available_until": "2026-10-31T10:02:58.517729Z",
  "open": false,
  "tip": {
    "id": "bfd41ff4-29fe-4988-9e6d-0e8d9dcb1f72",
    "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T10:03:02.332063Z"
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
      "id": "e0243da1-54ea-43ac-bf64-317f53998da3",
      "at": "2026-10-30T10:03:03.672214Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
      "counterpart_id": null
    },
    {
      "id": "c95f22c6-a96d-4b8f-b060-c0bd4582d64d",
      "at": "2026-10-30T10:02:58.611009Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "783f0fb8-42ff-4249-9468-42de600b5e8a",
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
  "id": "db8914cd-6be8-49c8-bf76-576b733d4423",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:04.519563Z",
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
  "session_id": "ce9ebcda-a6cd-44f7-8ba5-dfe29b724d6b",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0ODUsImlhdCI6MTc5MzM1NDU4NSwianRpIjoiZjY3MDMzNjktODMyYy00YzExLWI2M2EtNTdjMjNlNjcwNTE0Iiwic2lkIjoiY2U5ZWJjZGEtYTZjZC00NGY3LThiYTUtZGZlMjliNzI0ZDZiIn0.ZOgv1rfnZAKRhJBA3LSNnKPt7WlYSXPK1TSF940oUVk",
  "access_expires_at": "2026-10-30T10:18:05.116335522Z",
  "refresh_token": "XS8ldFMbbSV7SS4OVE-Qkcf-LV46domMa5fBjNiXsNQ",
  "refresh_expires_at": "2026-10-30T22:03:05.115652652Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733811475` → **200**

```json
{
  "client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569"
}
```

`POST /api/admin/v1/rider-wallets/fc5a16db-9a29-4ee0-8473-3978fe893569/top-ups` → **201**

```json
{
  "command_id": "44fc8188-a470-43c1-8c56-133adfe4619b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
      "id": "4f74dd60-2976-462c-85b0-a15e46af1322",
      "at": "2026-10-30T10:03:05.676864Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "008c165c-33e5-4536-8c38-4e61debb7d99",
  "quote_id": "db8914cd-6be8-49c8-bf76-576b733d4423",
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
  "id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
  "created_at": "2026-10-30T10:03:05.987769Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/77e7cd5b-6a3b-477c-b034-166fe95a4e8f` → **200**

```json
{
  "id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
  "created_at": "2026-10-30T10:03:05.987769Z",
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
    "id": "78e36f13-167b-45d4-9a76-399b00c11414",
    "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
    "expires_at": "2026-10-30T10:03:20.992723Z",
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

`POST /api/driver/v1/offers/78e36f13-167b-45d4-9a76-399b00c11414/accept` → **200**

```json
{
  "command_id": "562cb21d-575b-403e-a8cd-488929dd455b"
}
```

```json
{
  "id": "4026d271-ff10-4955-abd8-189adb951a43",
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0cc7e311-7f97-4b56-a0f2-b8eba3535355",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0cc7e311-7f97-4b56-a0f2-b8eba3535355",
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "assignment_id": "4026d271-ff10-4955-abd8-189adb951a43",
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

`POST /api/driver/v1/work-sessions/86e4f689-f39d-4253-900c-35b34cc92786/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:03:07Z",
    "sequence": 1793354587444
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:03:07.464843Z",
  "last_location_at": "2026-10-30T10:03:07.464843Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0cc7e311-7f97-4b56-a0f2-b8eba3535355/arrive` → **200**

```json
{
  "command_id": "cac548c7-0d77-455e-b049-0a5b643c4126",
  "expected_version": 0
}
```

```json
{
  "id": "0cc7e311-7f97-4b56-a0f2-b8eba3535355",
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "assignment_id": "4026d271-ff10-4955-abd8-189adb951a43",
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
  "arrived_at": "2026-10-30T10:03:07.776464Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0cc7e311-7f97-4b56-a0f2-b8eba3535355/start` → **200**

```json
{
  "command_id": "3efa6fc6-4267-4930-b907-9e8554d60dab",
  "expected_version": 1
}
```

```json
{
  "id": "0cc7e311-7f97-4b56-a0f2-b8eba3535355",
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "assignment_id": "4026d271-ff10-4955-abd8-189adb951a43",
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
  "arrived_at": "2026-10-30T10:03:07.776464Z",
  "started_at": "2026-10-30T10:03:08.079225Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0cc7e311-7f97-4b56-a0f2-b8eba3535355/complete` → **200**

```json
{
  "command_id": "4c9d2f5a-e898-45ca-8f55-fa7db218c0bf",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:03:08Z",
  "cash_received": true
}
```

```json
{
  "id": "0cc7e311-7f97-4b56-a0f2-b8eba3535355",
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "assignment_id": "4026d271-ff10-4955-abd8-189adb951a43",
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
  "arrived_at": "2026-10-30T10:03:07.776464Z",
  "started_at": "2026-10-30T10:03:08.079225Z",
  "completed_at": "2026-10-30T10:03:08.381747Z",
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
  "client_id": "fc5a16db-9a29-4ee0-8473-3978fe893569",
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
      "id": "4f74dd60-2976-462c-85b0-a15e46af1322",
      "at": "2026-10-30T10:03:05.676864Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
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

`GET /api/rider/v1/orders/77e7cd5b-6a3b-477c-b034-166fe95a4e8f/tip` → **200**

```json
{
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
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
  "available_until": "2026-10-31T10:03:08.381747Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/77e7cd5b-6a3b-477c-b034-166fe95a4e8f/tip` → **201**

```json
{
  "command_id": "19db8f8c-ed2f-426e-a4a9-91b802b1db9d",
  "amount_minor": 2500
}
```

```json
{
  "id": "603f321a-975e-4a63-9c4b-ec06dc8d31b1",
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T10:03:09.547569Z"
}
```

`GET /api/rider/v1/orders/77e7cd5b-6a3b-477c-b034-166fe95a4e8f/tip` → **200**

```json
{
  "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
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
  "available_until": "2026-10-31T10:03:08.381747Z",
  "open": false,
  "tip": {
    "id": "603f321a-975e-4a63-9c4b-ec06dc8d31b1",
    "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T10:03:09.547569Z"
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
      "id": "ae9280be-53e4-48ee-8ef4-b09ee16d2307",
      "at": "2026-10-30T10:03:08.73828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
      "counterpart_id": null
    },
    {
      "id": "e0243da1-54ea-43ac-bf64-317f53998da3",
      "at": "2026-10-30T10:03:03.672214Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
      "counterpart_id": null
    },
    {
      "id": "c95f22c6-a96d-4b8f-b060-c0bd4582d64d",
      "at": "2026-10-30T10:02:58.611009Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
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
      "id": "8c4c992f-85c8-4c41-9c90-c4d4b2526116",
      "at": "2026-10-30T10:03:10.774537Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
      "counterpart_id": null
    },
    {
      "id": "ae9280be-53e4-48ee-8ef4-b09ee16d2307",
      "at": "2026-10-30T10:03:08.73828Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "77e7cd5b-6a3b-477c-b034-166fe95a4e8f",
      "counterpart_id": null
    },
    {
      "id": "e0243da1-54ea-43ac-bf64-317f53998da3",
      "at": "2026-10-30T10:03:03.672214Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
      "counterpart_id": null
    },
    {
      "id": "c95f22c6-a96d-4b8f-b060-c0bd4582d64d",
      "at": "2026-10-30T10:02:58.611009Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9acfb3c8-86c1-457e-a189-86656cf18f5f",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "86e4f689-f39d-4253-900c-35b34cc92786",
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
  "last_heartbeat_at": "2026-10-30T10:03:07.464843Z",
  "last_location_at": "2026-10-30T10:03:07.464843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/86e4f689-f39d-4253-900c-35b34cc92786/close` → **200**

```json
{
  "command_id": "7d8005c2-377b-494c-b17a-864bc6a505fc",
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

Done: card order 77e7cd5b-6a3b-477c-b034-166fe95a4e8f.

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
  "phone": "+380739370633",
  "device_ref": "sandbox-30332"
}
```

```json
{
  "challenge_id": "a22326fd-9a5c-40ff-8713-b201018a2576",
  "expires_at": "2026-10-30T10:08:12.686080274Z",
  "resend_available_at": "2026-10-30T10:03:13.686080274Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739370633` → **200**

```json
{
  "phone": "+380739370633",
  "audience": "CLIENT",
  "code": "712027",
  "sent_at": "2026-10-30T10:03:12.690500448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a22326fd-9a5c-40ff-8713-b201018a2576",
  "code": "712027",
  "device_ref": "sandbox-30332"
}
```

```json
{
  "session_id": "0bf04d55-4281-42a3-8dc7-5c4aae7f2cb3",
  "subject": {
    "type": "CLIENT",
    "id": "21ef446f-3288-4a01-89b3-08da542c66ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMWVmNDQ2Zi0zMjg4LTRhMDEtODliMy0wOGRhNTQyYzY2ZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDkzLCJpYXQiOjE3OTMzNTQ1OTMsImp0aSI6ImJkMzRjMDE5LTNmZmUtNGUwZC05M2M5LWFlNWFjNjBmZDNlNiIsInNpZCI6IjBiZjA0ZDU1LTQyODEtNDJhMy04ZGM3LTVjNGFhZTdmMmNiMyJ9.bz6YlL_Jc6SRiD4O21J2o2hlFhWE9XZxwVmAEfpaXno",
  "access_expires_at": "2026-10-30T10:18:13.017052628Z",
  "refresh_token": "yfhy9uBDD2uZnKA9NGGnV3SIgfrGn2J39o8zazunnvc",
  "refresh_expires_at": "2026-11-29T10:03:13.016291241Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "0316b0a9-a985-48ad-aa1e-f1cba03c001c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "0bb259d2-b5f9-4ddd-9c18-36738ba4447d",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0bb259d2-b5f9-4ddd-9c18-36738ba4447d",
    "orderDate": "1793354593",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "3e2ed01c8783cdceb8bbd54ba85f7ecc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0bb259d2-b5f9-4ddd-9c18-36738ba4447d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739370633"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0bb259d2-b5f9-4ddd-9c18-36738ba4447d",
  "created_at": "2026-10-30T10:03:13.338255Z",
  "expires_at": "2026-10-30T10:33:13.338255Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/0bb259d2-b5f9-4ddd-9c18-36738ba4447d` → **200**

```json
{
  "id": "0bb259d2-b5f9-4ddd-9c18-36738ba4447d",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T10:03:13.338255Z",
  "expires_at": "2026-10-30T10:33:13.338255Z",
  "completed_at": "2026-10-30T10:03:13.631396Z",
  "masked_pan": "41****6179",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "21ef446f-3288-4a01-89b3-08da542c66ff",
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
      "id": "688b5ec6-00a9-4c46-ad54-3113fd6993d9",
      "at": "2026-10-30T10:03:13.795914Z",
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
  "client_id": "21ef446f-3288-4a01-89b3-08da542c66ff",
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
      "id": "688b5ec6-00a9-4c46-ad54-3113fd6993d9",
      "at": "2026-10-30T10:03:13.795914Z",
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
  "device_ref": "sandbox-6481"
}
```

```json
{
  "challenge_id": "67c32766-52c5-443a-a622-dfcd650108bc",
  "expires_at": "2026-10-30T10:08:14.540797227Z",
  "resend_available_at": "2026-10-30T10:03:15.540797227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "318373",
  "sent_at": "2026-10-30T10:03:14.54458219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67c32766-52c5-443a-a622-dfcd650108bc",
  "code": "318373",
  "device_ref": "sandbox-6481"
}
```

```json
{
  "session_id": "509935d2-c7d8-482d-bfee-59af0c21d0da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQ5NCwiaWF0IjoxNzkzMzU0NTk0LCJqdGkiOiI3YzBlNzhjZi04OWI2LTQwZmQtOWJkOC00NTdhNTgwMWI1YzkiLCJzaWQiOiI1MDk5MzVkMi1jN2Q4LTQ4MmQtYmZlZS01OWFmMGMyMWQwZGEifQ.l5Gl_h1rqtu-tb39iFrwr7olpk1-2CAjf6E1o5GQSgE",
  "access_expires_at": "2026-10-30T10:18:14.853347958Z",
  "refresh_token": "O9h_mbdkAd2Ug66OMdwPjj8zcXOeyHhjm62EDeHfePk",
  "refresh_expires_at": "2026-11-29T10:03:14.852717927Z",
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
  "command_id": "7fde31fb-5e59-4bf6-b18f-174f2c6c2859",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ce1a82e8-c8e6-4706-8e02-cc0056aed94d",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ce1a82e8-c8e6-4706-8e02-cc0056aed94d",
    "orderDate": "1793354595",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a876653daada71f89f7d51eca973c275",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ce1a82e8-c8e6-4706-8e02-cc0056aed94d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ce1a82e8-c8e6-4706-8e02-cc0056aed94d",
  "created_at": "2026-10-30T10:03:15.443547Z",
  "expires_at": "2026-10-30T10:33:15.443547Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ce1a82e8-c8e6-4706-8e02-cc0056aed94d` → **200**

```json
{
  "id": "ce1a82e8-c8e6-4706-8e02-cc0056aed94d",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T10:03:15.443547Z",
  "expires_at": "2026-10-30T10:33:15.443547Z",
  "completed_at": "2026-10-30T10:03:15.735853Z",
  "masked_pan": "41****4410",
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
      "id": "646614a4-66f3-49b1-97aa-7abd8045689e",
      "at": "2026-10-30T10:03:15.804538Z",
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
  "command_id": "cba84124-a79d-420e-9159-4d2c8e31f90e",
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
  "correlation_id": "48f4b141-d2d8-49cc-8975-951bbf4aaf00"
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
  "device_ref": "sandbox-10054"
}
```

```json
{
  "challenge_id": "2e84c902-9fc5-4fcb-954d-702dea5adb43",
  "expires_at": "2026-10-30T10:08:16.616402974Z",
  "resend_available_at": "2026-10-30T10:03:17.616402974Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "321942",
  "sent_at": "2026-10-30T10:03:16.619740206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e84c902-9fc5-4fcb-954d-702dea5adb43",
  "code": "321942",
  "device_ref": "sandbox-10054"
}
```

```json
{
  "session_id": "7641a125-e55d-4913-9324-5725cc2c2c38",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQ5NiwiaWF0IjoxNzkzMzU0NTk2LCJqdGkiOiJlYjcyMzZlYS04ZjFjLTQ5YzctOTdiNS00ZjI3ZDAyMWM1NjciLCJzaWQiOiI3NjQxYTEyNS1lNTVkLTQ5MTMtOTMyNC01NzI1Y2MyYzJjMzgifQ.V6Ge2DqXXB-ueVKdq87_vFbp8NEVmFIybB-hRZ-hk7Q",
  "access_expires_at": "2026-10-30T10:18:16.931458557Z",
  "refresh_token": "e7G61doWvUPIrkFQ_x8Yzt_9KCqqLuJEFo5XGFVw2qw",
  "refresh_expires_at": "2026-11-29T10:03:16.930783914Z",
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
  "command_id": "82aec4a0-52aa-4c57-a9bc-2439518a29e3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:03:17Z",
    "sequence": 1793354597504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f2bedb6-ab98-49db-b31a-2a33c457eda7",
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
  "last_heartbeat_at": "2026-10-30T10:03:17.524087Z",
  "last_location_at": "2026-10-30T10:03:17.524087Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631420291",
  "device_ref": "sandbox-5817"
}
```

```json
{
  "challenge_id": "be6de74e-d4b0-43b9-aa9c-3d42d4df27cc",
  "expires_at": "2026-10-30T10:08:17.835562284Z",
  "resend_available_at": "2026-10-30T10:03:18.835562284Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631420291` → **200**

```json
{
  "phone": "+380631420291",
  "audience": "CLIENT",
  "code": "218056",
  "sent_at": "2026-10-30T10:03:17.83997695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be6de74e-d4b0-43b9-aa9c-3d42d4df27cc",
  "code": "218056",
  "device_ref": "sandbox-5817"
}
```

```json
{
  "session_id": "f89a859a-a995-4bdc-b7ee-cc7ab64a15fa",
  "subject": {
    "type": "CLIENT",
    "id": "f57c84f9-07f1-493f-81eb-7a6ff93e2433"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTdjODRmOS0wN2YxLTQ5M2YtODFlYi03YTZmZjkzZTI0MzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDk4LCJpYXQiOjE3OTMzNTQ1OTgsImp0aSI6ImFlNGZlYTZkLTA2OGEtNGExZC04MWQ1LWQxY2E3MWU5MWM1YyIsInNpZCI6ImY4OWE4NTlhLWE5OTUtNGJkYy1iN2VlLWNjN2FiNjRhMTVmYSJ9.NxpE3yT9jhFDGFdWMGC3kVJfCInpl-SE62P08yOWcak",
  "access_expires_at": "2026-10-30T10:18:18.154481137Z",
  "refresh_token": "osqSnTx8UBQvoZzhn4wvbAqdQ9rd7kmAeFrqvj4AKq0",
  "refresh_expires_at": "2026-11-29T10:03:18.15393799Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e6472a5c-fad7-4b69-a9a4-4064a8249637",
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
  "id": "a315b15a-3e64-4ed2-b234-70d599cdfc79",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:18.444014Z",
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
  "command_id": "19f47ca2-ddb6-4bb1-8886-09efd5ff73d1",
  "quote_id": "a315b15a-3e64-4ed2-b234-70d599cdfc79",
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
  "id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f57c84f9-07f1-493f-81eb-7a6ff93e2433",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:03:18.745424Z",
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
    "id": "e8590ae9-df84-4c2e-a8ab-4b8c08748f4f",
    "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
    "expires_at": "2026-10-30T10:03:33.748872Z",
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

`POST /api/driver/v1/offers/e8590ae9-df84-4c2e-a8ab-4b8c08748f4f/accept` → **200**

```json
{
  "command_id": "c6003ee7-e157-4273-948f-0fbedb47dcd0"
}
```

```json
{
  "id": "15b8cd52-6c0a-47c3-8833-cda343c8a096",
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d32ffc79-9869-4019-ae21-6282c7dc695d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d32ffc79-9869-4019-ae21-6282c7dc695d",
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "assignment_id": "15b8cd52-6c0a-47c3-8833-cda343c8a096",
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

`POST /api/driver/v1/work-sessions/3f2bedb6-ab98-49db-b31a-2a33c457eda7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:03:19Z",
    "sequence": 1793354599929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f2bedb6-ab98-49db-b31a-2a33c457eda7",
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
  "last_heartbeat_at": "2026-10-30T10:03:19.952387Z",
  "last_location_at": "2026-10-30T10:03:19.952387Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d32ffc79-9869-4019-ae21-6282c7dc695d/arrive` → **200**

```json
{
  "command_id": "7ac127a5-e1a5-4ef6-a3aa-fd43989fadb1",
  "expected_version": 0
}
```

```json
{
  "id": "d32ffc79-9869-4019-ae21-6282c7dc695d",
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "assignment_id": "15b8cd52-6c0a-47c3-8833-cda343c8a096",
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
  "arrived_at": "2026-10-30T10:03:20.261638Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d32ffc79-9869-4019-ae21-6282c7dc695d/start` → **200**

```json
{
  "command_id": "94f6727e-b74f-41ec-bb30-31fb4289471e",
  "expected_version": 1
}
```

```json
{
  "id": "d32ffc79-9869-4019-ae21-6282c7dc695d",
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "assignment_id": "15b8cd52-6c0a-47c3-8833-cda343c8a096",
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
  "arrived_at": "2026-10-30T10:03:20.261638Z",
  "started_at": "2026-10-30T10:03:20.571157Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d32ffc79-9869-4019-ae21-6282c7dc695d/complete` → **200**

```json
{
  "command_id": "81ac2d50-fec8-49d4-947c-a6d2d68ccd50",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:03:20Z",
  "cash_received": false
}
```

```json
{
  "id": "d32ffc79-9869-4019-ae21-6282c7dc695d",
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "assignment_id": "15b8cd52-6c0a-47c3-8833-cda343c8a096",
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
  "arrived_at": "2026-10-30T10:03:20.261638Z",
  "started_at": "2026-10-30T10:03:20.571157Z",
  "completed_at": "2026-10-30T10:03:20.87898Z",
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
  "session_id": "56bd6bf6-4978-47b0-b860-02e065707581",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1MDEsImlhdCI6MTc5MzM1NDYwMSwianRpIjoiZjY2NjNlZTItNzc3OS00ODA5LTllMmEtMjdjMWJhZTE5NzA1Iiwic2lkIjoiNTZiZDZiZjYtNDk3OC00N2IwLWI4NjAtMDJlMDY1NzA3NTgxIn0._o7tBfrgrAmj9vmRRwEv8KojGjWGP-QCVzL8_82Z5Q8",
  "access_expires_at": "2026-10-30T10:18:21.469624631Z",
  "refresh_token": "TiStqMqzfOY6HYNdkFDtl_-NdxiDC9QFiCb24YSQYM8",
  "refresh_expires_at": "2026-10-30T22:03:21.469119746Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a20e96cf-f568-4426-9883-09a6d0b12266"
}
```

`GET /api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute` → **200**

```json
{
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "f57c84f9-07f1-493f-81eb-7a6ff93e2433",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T10:03:21.873135Z",
  "decide_by": "2026-11-13T10:03:21.873135Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T10:03:21.873135Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "f57c84f9-07f1-493f-81eb-7a6ff93e2433",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T10:03:21.873135Z",
      "decide_by": "2026-11-13T10:03:21.873135Z",
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

`POST /api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute/decide` → **400**

```json
{
  "command_id": "694746a9-8e98-485b-a84c-df40d307899c",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "cb80f33f-b171-49aa-8892-776fdf456f99",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute/decide` → **200**

```json
{
  "command_id": "c6856848-bb29-459e-a995-a9d0f2cebc6b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "f57c84f9-07f1-493f-81eb-7a6ff93e2433",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T10:03:21.873135Z",
  "decide_by": "2026-11-13T10:03:21.873135Z",
  "decision": "PAY_DRIVER",
  "decided_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T10:03:23.966205Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute/decide` → **409**

```json
{
  "command_id": "6db5cb72-275d-46e9-980d-7913301c592b",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/41f04f7f-6bcd-40b7-9c12-d6b0d230e226/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "13138c68-3701-45a1-8ffc-00ca192cd776"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f2bedb6-ab98-49db-b31a-2a33c457eda7",
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
  "last_heartbeat_at": "2026-10-30T10:03:19.952387Z",
  "last_location_at": "2026-10-30T10:03:19.952387Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f2bedb6-ab98-49db-b31a-2a33c457eda7/close` → **200**

```json
{
  "command_id": "3060aa65-e133-4651-add0-0dd6bc52692a",
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
  "phone": "+380735404732",
  "device_ref": "sandbox-28204"
}
```

```json
{
  "challenge_id": "d67ec81d-8273-4745-91de-86ddb42027d8",
  "expires_at": "2026-10-30T10:08:25.139786665Z",
  "resend_available_at": "2026-10-30T10:03:26.139786665Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735404732` → **200**

```json
{
  "phone": "+380735404732",
  "audience": "CLIENT",
  "code": "249151",
  "sent_at": "2026-10-30T10:03:25.1432844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d67ec81d-8273-4745-91de-86ddb42027d8",
  "code": "249151",
  "device_ref": "sandbox-28204"
}
```

```json
{
  "session_id": "f97eb038-2526-4125-b98c-8dbce5b96105",
  "subject": {
    "type": "CLIENT",
    "id": "f15963fe-2796-4c90-a10a-73e0314cac95"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMTU5NjNmZS0yNzk2LTRjOTAtYTEwYS03M2UwMzE0Y2FjOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTA1LCJpYXQiOjE3OTMzNTQ2MDUsImp0aSI6ImYyZTZmYWRhLTA0ZGYtNDA3Mi1hNzVhLThmMDg2YmZhMjk5MCIsInNpZCI6ImY5N2ViMDM4LTI1MjYtNDEyNS1iOThjLThkYmNlNWI5NjEwNSJ9.IwP1sdMPaPrQiFWtg20zAkm3w7CvvKuiyz3fkrUoHkw",
  "access_expires_at": "2026-10-30T10:18:25.452722258Z",
  "refresh_token": "bFftks105KR4rahrVW0HVgVI2XdcKwoQFJx_Js-Sh1E",
  "refresh_expires_at": "2026-11-29T10:03:25.452081856Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4e706530-54be-40dc-a460-1efce6d2d5fd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b35603ad-36ef-4970-abb8-eb8ee3a6cfe9",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b35603ad-36ef-4970-abb8-eb8ee3a6cfe9",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7ff9c69232df31c3835feb67464d89d6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b35603ad-36ef-4970-abb8-eb8ee3a6cfe9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735404732"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b35603ad-36ef-4970-abb8-eb8ee3a6cfe9",
  "expires_at": "2026-10-30T10:33:25.734232Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b35603ad-36ef-4970-abb8-eb8ee3a6cfe9` → **200**

```json
{
  "id": "b35603ad-36ef-4970-abb8-eb8ee3a6cfe9",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:33:25.734232Z",
  "card": {
    "id": "5faf5f38-5cff-4c04-8a53-e337cbf93fcf",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7452",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:03:26.045944Z"
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
  "device_ref": "sandbox-23939"
}
```

```json
{
  "challenge_id": "4af09b27-54bc-48a9-888b-0a2980d99bca",
  "expires_at": "2026-10-30T10:08:26.385977464Z",
  "resend_available_at": "2026-10-30T10:03:27.385977464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "256454",
  "sent_at": "2026-10-30T10:03:26.389056295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4af09b27-54bc-48a9-888b-0a2980d99bca",
  "code": "256454",
  "device_ref": "sandbox-23939"
}
```

```json
{
  "session_id": "7adc0627-11ff-4cfc-87eb-7e76cd21f5a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTUwNiwiaWF0IjoxNzkzMzU0NjA2LCJqdGkiOiIzODA4MjJmMS0wZGVhLTQ0OWYtYjNjNi05MjhjODQ5ODA0NzUiLCJzaWQiOiI3YWRjMDYyNy0xMWZmLTRjZmMtODdlYi03ZTc2Y2QyMWY1YTEifQ.EmgXT9Ve7PzmEOz8b9D_WoNkQ5OXDczi1zqm42LnfiQ",
  "access_expires_at": "2026-10-30T10:18:26.693233421Z",
  "refresh_token": "MnSgAjOe3kJKYm9yvrZdvoUnnn4CBxuvHRCGLROvRRQ",
  "refresh_expires_at": "2026-11-29T10:03:26.692669705Z",
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
  "command_id": "4da5c49d-f453-415b-9754-db284695ce6a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:03:27Z",
    "sequence": 1793354607252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63519501-2240-4247-bc8d-a2d1589715d8",
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
  "last_heartbeat_at": "2026-10-30T10:03:27.271715Z",
  "last_location_at": "2026-10-30T10:03:27.271715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "591919c9-f628-45ff-9628-608fe57f9ee4",
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
  "id": "49ab46e9-3013-4033-84b3-0e36f95ee368",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:27.565340Z",
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
  "command_id": "2a29f8af-f176-4f16-80ce-0de1ba3cbe87",
  "quote_id": "49ab46e9-3013-4033-84b3-0e36f95ee368",
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
  "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f15963fe-2796-4c90-a10a-73e0314cac95",
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
  "created_at": "2026-10-30T10:03:27.867237Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a` → **200**

```json
{
  "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f15963fe-2796-4c90-a10a-73e0314cac95",
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
  "created_at": "2026-10-30T10:03:27.867237Z",
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
    "id": "994fd929-1513-404e-8d2f-28a19bbb71d9",
    "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
    "expires_at": "2026-10-30T10:03:42.918124Z",
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

`POST /api/driver/v1/offers/994fd929-1513-404e-8d2f-28a19bbb71d9/accept` → **200**

```json
{
  "command_id": "ae76638d-c7e7-41d6-9c28-c30547716e11"
}
```

```json
{
  "id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d557695-c0da-461a-b922-4db742cda6ec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2d557695-c0da-461a-b922-4db742cda6ec",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "assignment_id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
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

`POST /api/rider/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/messages` → **201**

```json
{
  "command_id": "bbbed215-ce94-42f4-bc59-7af9f5715b48",
  "body": "Я біля входу, мій номер +380735404732, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7c96ba88-cf69-40ac-aea3-f416f13d355c",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735404732, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T10:03:29.327100057Z"
}
```

`POST /api/driver/v1/trips/2d557695-c0da-461a-b922-4db742cda6ec/messages` → **201**

```json
{
  "command_id": "a89945e0-05cd-4d6c-a387-b87698371edc",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "93d1b5d8-449f-4d6a-a76b-c8c73b4329da",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T10:03:29.610574833Z"
}
```

`POST /api/driver/v1/work-sessions/63519501-2240-4247-bc8d-a2d1589715d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:03:29Z",
    "sequence": 1793354609893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63519501-2240-4247-bc8d-a2d1589715d8",
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
  "last_heartbeat_at": "2026-10-30T10:03:29.912257Z",
  "last_location_at": "2026-10-30T10:03:29.912257Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2d557695-c0da-461a-b922-4db742cda6ec/arrive` → **200**

```json
{
  "command_id": "205b6a34-0e19-4064-9dd6-f80360b4cae7",
  "expected_version": 0
}
```

```json
{
  "id": "2d557695-c0da-461a-b922-4db742cda6ec",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "assignment_id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
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
  "arrived_at": "2026-10-30T10:03:30.217451Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2d557695-c0da-461a-b922-4db742cda6ec/start` → **200**

```json
{
  "command_id": "e3b28b9b-7ab9-4a7c-a0f5-0f43dbcc3e00",
  "expected_version": 1
}
```

```json
{
  "id": "2d557695-c0da-461a-b922-4db742cda6ec",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "assignment_id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
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
  "arrived_at": "2026-10-30T10:03:30.217451Z",
  "started_at": "2026-10-30T10:03:30.522415Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/63519501-2240-4247-bc8d-a2d1589715d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:03:30Z",
    "sequence": 1793354610794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63519501-2240-4247-bc8d-a2d1589715d8",
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
  "last_heartbeat_at": "2026-10-30T10:03:30.81385Z",
  "last_location_at": "2026-10-30T10:03:30.81385Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/2d557695-c0da-461a-b922-4db742cda6ec/complete` → **200**

```json
{
  "command_id": "23c9a0ae-a0fd-43ae-8444-fbbfc21e3c6c",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:03:31Z",
  "cash_received": false
}
```

```json
{
  "id": "2d557695-c0da-461a-b922-4db742cda6ec",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "assignment_id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
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
  "arrived_at": "2026-10-30T10:03:30.217451Z",
  "started_at": "2026-10-30T10:03:30.522415Z",
  "completed_at": "2026-10-30T10:03:31.116095Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a` → **200**

```json
{
  "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f15963fe-2796-4c90-a10a-73e0314cac95",
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
    "id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
    "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2d557695-c0da-461a-b922-4db742cda6ec",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:03:27.867237Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a` → **200**

```json
{
  "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f15963fe-2796-4c90-a10a-73e0314cac95",
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
    "id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
    "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2d557695-c0da-461a-b922-4db742cda6ec",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:03:27.867237Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a` → **200**

```json
{
  "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f15963fe-2796-4c90-a10a-73e0314cac95",
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
    "id": "d02794e8-fce6-4c1b-990b-7ef21615a037",
    "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2d557695-c0da-461a-b922-4db742cda6ec",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:03:27.867237Z",
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
  "session_id": "63519501-2240-4247-bc8d-a2d1589715d8",
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
  "last_heartbeat_at": "2026-10-30T10:03:30.81385Z",
  "last_location_at": "2026-10-30T10:03:30.81385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63519501-2240-4247-bc8d-a2d1589715d8/close` → **200**

```json
{
  "command_id": "4d816327-2533-4efc-803b-6073e026a24d",
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
  "session_id": "008a4bff-ba37-4830-b35a-5afbcd80c76e",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1MTUsImlhdCI6MTc5MzM1NDYxNSwianRpIjoiMzNhYTZiODAtMjNkZi00Y2Y5LWFmYWYtMDE0N2Y2YmFlOTUyIiwic2lkIjoiMDA4YTRiZmYtYmEzNy00ODMwLWIzNWEtNWFmYmNkODBjNzZlIn0._4ESA_7LXZBoqngy8wvpfGgqo3lgkbstv1yUKQhHa_I",
  "access_expires_at": "2026-10-30T10:18:35.175197905Z",
  "refresh_token": "M2E7I4zLAvDW72tXnjTuOAFKz2ndTSYXH6A6UesxkbM",
  "refresh_expires_at": "2026-10-30T22:03:35.174525729Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c874fb0b-917c-4b55-981b-47f9b925e93d"
}
```

`GET /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T10:03:35.731179163Z",
  "order": {
    "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
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
    "created_at": "2026-10-30T10:03:27.867237Z",
    "assigned_at": "2026-10-30T10:03:28.755444Z",
    "arrived_at": "2026-10-30T10:03:30.217451Z",
    "started_at": "2026-10-30T10:03:30.522415Z",
    "completed_at": "2026-10-30T10:03:31.116095Z"
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
    "id": "f15963fe-2796-4c90-a10a-73e0314cac95",
    "registered_at": "2026-10-30T10:03:25.449681Z",
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
      "created_at": "2026-10-30T10:03:27.870402Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T10:03:32.014141Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks` → **422**

```json
{
  "command_id": "d5ada0c0-f515-48a3-b455-a6f49a915de3",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "e755cfe2-7b1e-4078-a293-5bd65306fb47"
}
```

`POST /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks` → **201**

```json
{
  "command_id": "b185784b-9d31-4818-9e3e-a4865ac41afb",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "c5e23d76-8f1f-472c-9725-538b6a584b9e",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:03:36.379294Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks` → **201**

```json
{
  "command_id": "b185784b-9d31-4818-9e3e-a4865ac41afb",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "c5e23d76-8f1f-472c-9725-538b6a584b9e",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:03:36.379294Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/f15963fe-2796-4c90-a10a-73e0314cac95` → **200**

```json
{
  "client": {
    "id": "f15963fe-2796-4c90-a10a-73e0314cac95",
    "phone": "+380735404732",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:03:25.449681Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:03:27.867237Z",
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

`GET /api/admin/v1/clients/f15963fe-2796-4c90-a10a-73e0314cac95` → **200**

```json
{
  "client": {
    "id": "f15963fe-2796-4c90-a10a-73e0314cac95",
    "phone": "+380735404732",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:03:25.449681Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:03:27.867237Z",
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

`POST /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks/c5e23d76-8f1f-472c-9725-538b6a584b9e/resolve` → **200**

```json
{
  "command_id": "50c41e0e-5950-4b24-99bb-21ebaabd7316",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "c5e23d76-8f1f-472c-9725-538b6a584b9e",
  "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T10:03:36.379294Z",
  "resolved_at": "2026-10-30T10:03:38.62861Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/f15963fe-2796-4c90-a10a-73e0314cac95` → **200**

```json
{
  "client": {
    "id": "f15963fe-2796-4c90-a10a-73e0314cac95",
    "phone": "+380735404732",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:03:25.449681Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:03:27.867237Z",
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

`GET /api/admin/v1/clients/f15963fe-2796-4c90-a10a-73e0314cac95` → **200**

```json
{
  "client": {
    "id": "f15963fe-2796-4c90-a10a-73e0314cac95",
    "phone": "+380735404732",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:03:25.449681Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:03:27.867237Z",
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

`POST /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks/c5e23d76-8f1f-472c-9725-538b6a584b9e/resolve` → **409**

```json
{
  "command_id": "c7c19e65-66b0-488b-9fd0-0f055ca825ba",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks/c5e23d76-8f1f-472c-9725-538b6a584b9e/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9959236e-c08b-47c8-8505-6d1da711d0b2"
}
```

`GET /api/admin/v1/orders/458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "c5e23d76-8f1f-472c-9725-538b6a584b9e",
      "order_id": "458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T10:03:36.379294Z",
      "resolved_at": "2026-10-30T10:03:38.62861Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 458b8e2c-bbae-4b7a-8b53-9fa3fa1a582a without phone or card digits; chargeback c5e23d76-8f1f-472c-9725-538b6a584b9e recorded and won.

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
  "session_id": "dae399a0-a027-420d-bb82-70063624c892",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1MjEsImlhdCI6MTc5MzM1NDYyMSwianRpIjoiMjMxOWE0MTgtY2M0Ni00ZmIwLWEwZjMtNTc1ZDEzNTMxNmEwIiwic2lkIjoiZGFlMzk5YTAtYTAyNy00MjBkLWJiODItNzAwNjM2MjRjODkyIn0.eJ1zhoowDPXYkB_04l2du1WqbkWdin7PGShiabg9tM8",
  "access_expires_at": "2026-10-30T10:18:41.722419674Z",
  "refresh_token": "S0WlKg4n-DEFzEoxtruzbuukuONK7lHjRGIzc6oX-Q4",
  "refresh_expires_at": "2026-10-30T22:03:41.721842444Z",
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
  "phone": "+48600916618",
  "device_ref": "sandbox-452"
}
```

```json
{
  "challenge_id": "31fe5b2a-c047-40d8-81dc-5e1074fc53ce",
  "expires_at": "2026-10-30T10:08:42.576972585Z",
  "resend_available_at": "2026-10-30T10:03:43.576972585Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600916618` → **200**

```json
{
  "phone": "+48600916618",
  "audience": "CLIENT",
  "code": "683668",
  "sent_at": "2026-10-30T10:03:42.58058035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31fe5b2a-c047-40d8-81dc-5e1074fc53ce",
  "code": "683668",
  "device_ref": "sandbox-452"
}
```

```json
{
  "session_id": "f02725fb-06b2-4c15-bb31-dfac871f3dec",
  "subject": {
    "type": "CLIENT",
    "id": "a86d371f-8e65-4cf2-a5d6-e54c9d4d6ad4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODZkMzcxZi04ZTY1LTRjZjItYTVkNi1lNTRjOWQ0ZDZhZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTIyLCJpYXQiOjE3OTMzNTQ2MjIsImp0aSI6ImQxYmY3ZTdmLWExNmYtNGE4OS1hNGYxLTc4YTc4ZWQ1ODFlZiIsInNpZCI6ImYwMjcyNWZiLTA2YjItNGMxNS1iYjMxLWRmYWM4NzFmM2RlYyJ9.aAtz_SXBpD8L0N_IGsjxz__MTukqdHl8qWhbMPXO77A",
  "access_expires_at": "2026-10-30T10:18:42.895971909Z",
  "refresh_token": "4h3CagIf8CCXO42TtFXRBFL7GXDqINNvSF-JWDXf5d4",
  "refresh_expires_at": "2026-11-29T10:03:42.895395249Z",
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
  "command_id": "0aa066fc-3277-4076-bcfd-67e40bcfbdd5",
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
  "correlation_id": "25fb97ed-17d7-4a28-bc0b-7c20160aa0ea",
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
  "command_id": "a6219f3f-29b6-460f-8e79-e35821bacc8f",
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
  "paused_at": "2026-10-30T10:03:44.064449824Z",
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
  "command_id": "4232ab02-cff2-4d99-a6a8-03160513cb9a",
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
  "id": "29d59de3-fc45-4ae2-a685-fd06988b4e3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:44.701543Z",
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
  "command_id": "4f59020a-5287-4cb7-b832-1402d4f726f6",
  "quote_id": "29d59de3-fc45-4ae2-a685-fd06988b4e3b",
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
  "correlation_id": "520c19db-fe30-4002-a7c1-471642c38a5c"
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
  "paused_at": "2026-10-30T10:03:44.06445Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "2caa3587-182b-4763-9ff4-8b0a328b6aff",
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
  "command_id": "81c79a5a-3c47-4750-8add-12c0b116a4ef",
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
  "command_id": "e1aa29bc-7713-4210-9c89-fa152e7790be",
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
  "id": "f2c40bd1-bb6c-4781-beac-72928f7db1c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:46.443321Z",
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
  "command_id": "7ac6418a-2066-43a4-b3f2-8763bacea7bd",
  "quote_id": "f2c40bd1-bb6c-4781-beac-72928f7db1c9",
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
  "correlation_id": "441f92ad-379e-485c-bada-600eb1caa24e"
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
  "command_id": "ec501310-69e0-444d-aa87-7d9d334ee08b",
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
  "command_id": "68c9a565-6256-422c-8449-873ce9a3bb19",
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
  "id": "75977627-396a-4759-8585-b912204ea14d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:47.632063Z",
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
  "command_id": "b73d5a1f-c5e0-4b83-b19d-2d8840e1dea0",
  "quote_id": "75977627-396a-4759-8585-b912204ea14d",
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
  "correlation_id": "16989b09-bede-439a-ace7-4d9d4e19ebfa"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "51869da9-0684-403b-a416-af2e8bb5a727",
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
  "correlation_id": "dc754602-264d-4269-b748-a9be3fd4f144"
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
  "command_id": "4f24ec29-3cbf-43fe-98bd-8bccb29ba26c",
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
  "phone": "+380674609826",
  "device_ref": "sandbox-5306"
}
```

```json
{
  "challenge_id": "92dde930-a327-49a2-984a-8c377bfcc1da",
  "expires_at": "2026-10-30T10:08:49.139049565Z",
  "resend_available_at": "2026-10-30T10:03:50.139049565Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674609826` → **200**

```json
{
  "phone": "+380674609826",
  "audience": "CLIENT",
  "code": "544118",
  "sent_at": "2026-10-30T10:03:49.141668301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92dde930-a327-49a2-984a-8c377bfcc1da",
  "code": "544118",
  "device_ref": "sandbox-5306"
}
```

```json
{
  "session_id": "2e042725-eab2-48c7-a4db-7c3cba473b1f",
  "subject": {
    "type": "CLIENT",
    "id": "c0690994-324a-413b-a801-a67e9371489e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDY5MDk5NC0zMjRhLTQxM2ItYTgwMS1hNjdlOTM3MTQ4OWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTI5LCJpYXQiOjE3OTMzNTQ2MjksImp0aSI6IjkzMjliY2RiLWFkMTMtNDhkMy1hNWVmLTE0ZTkwYzg3ODIzOSIsInNpZCI6IjJlMDQyNzI1LWVhYjItNDhjNy1hNGRiLTdjM2NiYTQ3M2IxZiJ9.cMi4R_gXm3ObMpS4ukiAw8hxQUc_xCLZIuKdiHVyhyI",
  "access_expires_at": "2026-10-30T10:18:49.449273497Z",
  "refresh_token": "-4NYyGe2yHhVyhDdS-3KIC9p2FX-7qGNKAdb1Zt-s2E",
  "refresh_expires_at": "2026-11-29T10:03:49.448704704Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c0690994-324a-413b-a801-a67e9371489e",
  "session_id": "2e042725-eab2-48c7-a4db-7c3cba473b1f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bdf0b29c-8f5a-421c-905a-e7bf0d9e13aa",
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
  "id": "78495758-205e-4591-bde6-dbebc359d6c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:08:50.032718Z",
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
  "challenge_id": "5b39204d-0dbd-41a0-9097-c87c63136044",
  "expires_at": "2026-10-30T10:08:52.348324474Z",
  "resend_available_at": "2026-10-30T10:03:53.348324474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674609826` → **200**

```json
{
  "phone": "+380674609826",
  "audience": "CLIENT",
  "code": "624004",
  "sent_at": "2026-10-30T10:03:52.351068013Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "622cdb35-557e-4982-bada-1b6dc4ff7613",
  "challenge_id": "5b39204d-0dbd-41a0-9097-c87c63136044",
  "otp_code": "624004"
}
```

```json
{
  "client_id": "c0690994-324a-413b-a801-a67e9371489e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T10:03:52.674408302Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0d12b7bf-30d9-43f7-bbf6-fa763cf91137",
  "quote_id": "78495758-205e-4591-bde6-dbebc359d6c7",
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
  "correlation_id": "96604d9b-5c4a-4f49-837e-8faaf3c65242"
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
  "session_id": "14fdd576-da4f-4b3f-b349-9eb7be9a7abc",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1MzMsImlhdCI6MTc5MzM1NDYzMywianRpIjoiZDk4YjQ4YTEtNTE0NS00ZTI1LTkxYzktNDUwM2FjMzE2ZTQ5Iiwic2lkIjoiMTRmZGQ1NzYtZGE0Zi00YjNmLWIzNDktOWViN2JlOWE3YWJjIn0.t_I97hrumbe5wUc9Ks9ufxOncKeTjJiWOpUkueANnpA",
  "access_expires_at": "2026-10-30T10:18:53.57569376Z",
  "refresh_token": "IY9sKVPo-WuIeC_a7ozvFldNkB1S9r6wz3Wwk7vsEH0",
  "refresh_expires_at": "2026-10-30T22:03:53.575088504Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "c0690994-324a-413b-a801-a67e9371489e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T10:03:52.674408Z",
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

`POST /api/admin/v1/client-deletions/c0690994-324a-413b-a801-a67e9371489e/complete` → **200**

```json
{
  "command_id": "340f1978-72bd-4385-be6a-9ee06fcf74e8",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "c0690994-324a-413b-a801-a67e9371489e",
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
  "correlation_id": "fb90b8b4-5739-4673-97f4-8eef9edec0df"
}
```

Done: client c0690994-324a-413b-a801-a67e9371489e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663460886",
  "device_ref": "sandbox-21747"
}
```

```json
{
  "challenge_id": "70179f5e-c3b1-4053-bfc2-b1ef341125ae",
  "expires_at": "2026-10-30T10:08:54.743901016Z",
  "resend_available_at": "2026-10-30T10:03:55.743901016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663460886` → **200**

```json
{
  "phone": "+380663460886",
  "audience": "CLIENT",
  "code": "869731",
  "sent_at": "2026-10-30T10:03:54.747673864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70179f5e-c3b1-4053-bfc2-b1ef341125ae",
  "code": "869731",
  "device_ref": "sandbox-21747"
}
```

```json
{
  "session_id": "1d18dc0b-2493-4d0c-9740-3815044fc596",
  "subject": {
    "type": "CLIENT",
    "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjU4OWM2YS1hMGU1LTQzNWYtOTFiNy1hY2VhYTNmMTk2OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTM1LCJpYXQiOjE3OTMzNTQ2MzUsImp0aSI6IjQ3M2FlNmFlLTljNGYtNGVmMS1iODg0LWU0OTNiMzFiNzg4ZSIsInNpZCI6IjFkMThkYzBiLTI0OTMtNGQwYy05NzQwLTM4MTUwNDRmYzU5NiJ9.lQ3-NcOG6kfPxgpp_iZPds10bwhmFZ8JGAXQjQDVkIU",
  "access_expires_at": "2026-10-30T10:18:55.071766857Z",
  "refresh_token": "0v85OdxPh6kQIIry1MvgS44atrTd-LKITMEHprNwEF4",
  "refresh_expires_at": "2026-11-29T10:03:55.071262682Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
  "session_id": "1d18dc0b-2493-4d0c-9740-3815044fc596",
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
  "session_id": "74b52813-e69d-4233-bad7-ea289e35611e",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1MzUsImlhdCI6MTc5MzM1NDYzNSwianRpIjoiZGE2MGYxZjMtM2ZkZi00MDhmLWE4NzYtZTkxZWEyZTZiMWE4Iiwic2lkIjoiNzRiNTI4MTMtZTY5ZC00MjMzLWJhZDctZWEyODllMzU2MTFlIn0.aCqipxDbbxPyhuHPS4gMeYkDIAB2x3fGx7uS_f9E8L4",
  "access_expires_at": "2026-10-30T10:18:55.927571058Z",
  "refresh_token": "swJftPyTbS7vGZXO-WN8H0CWV72TfjyCbMy6N3KnFJ0",
  "refresh_expires_at": "2026-10-30T22:03:55.927012692Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3460886&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
      "phone": "+380663460886",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T10:03:55.069426Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c6589c6a-a0e5-435f-91b7-aceaa3f19697` → **200**

```json
{
  "client": {
    "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
    "phone": "+380663460886",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:03:55.069426Z",
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

`POST /api/admin/v1/clients/c6589c6a-a0e5-435f-91b7-aceaa3f19697/block` → **400**

```json
{
  "command_id": "05eb605f-ed26-49d3-8844-24c9923117af",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c6589c6a-a0e5-435f-91b7-aceaa3f19697/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "daa7ee2a-3fbe-453e-82d7-62d702291e91",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c6589c6a-a0e5-435f-91b7-aceaa3f19697/block` → **200**

```json
{
  "command_id": "9f37b613-9afb-4e08-93b6-5cea7040217b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
  "phone": "+380663460886",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T10:03:55.069426Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T10:03:57.121923Z",
    "by": "b477a07b-147c-491d-98d2-42d588071767"
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
  "correlation_id": "70d1c2c9-dcc4-4a58-ad1f-553f9a2cce5d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663460886",
  "device_ref": "sandbox-20095"
}
```

```json
{
  "challenge_id": "c8c170c9-469f-4579-b523-6989360bdf35",
  "expires_at": "2026-10-30T10:08:59.705205161Z",
  "resend_available_at": "2026-10-30T10:04:00.705205161Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663460886` → **200**

```json
{
  "phone": "+380663460886",
  "audience": "CLIENT",
  "code": "139906",
  "sent_at": "2026-10-30T10:03:59.707705905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c8c170c9-469f-4579-b523-6989360bdf35",
  "code": "139906",
  "device_ref": "sandbox-20095"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "acce5245-91d0-41d3-866a-2f5e5a753e9d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c6589c6a-a0e5-435f-91b7-aceaa3f19697` → **200**

```json
{
  "client": {
    "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
    "phone": "+380663460886",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T10:03:55.069426Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T10:03:57.121923Z",
      "by": "b477a07b-147c-491d-98d2-42d588071767"
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

`POST /api/admin/v1/clients/c6589c6a-a0e5-435f-91b7-aceaa3f19697/unblock` → **200**

```json
{
  "command_id": "d0b98b0f-9bb2-47da-a965-4ed9bf0fdeb3",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
  "phone": "+380663460886",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T10:03:55.069426Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663460886",
  "device_ref": "sandbox-24182"
}
```

```json
{
  "challenge_id": "cd9b6715-d809-4d49-bafe-7b19fda0907f",
  "expires_at": "2026-10-30T10:09:02.913486793Z",
  "resend_available_at": "2026-10-30T10:04:03.913486793Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663460886` → **200**

```json
{
  "phone": "+380663460886",
  "audience": "CLIENT",
  "code": "593980",
  "sent_at": "2026-10-30T10:04:02.916164007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd9b6715-d809-4d49-bafe-7b19fda0907f",
  "code": "593980",
  "device_ref": "sandbox-24182"
}
```

```json
{
  "session_id": "5936ccc3-43af-48aa-9459-8c84db21b970",
  "subject": {
    "type": "CLIENT",
    "id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjU4OWM2YS1hMGU1LTQzNWYtOTFiNy1hY2VhYTNmMTk2OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTQzLCJpYXQiOjE3OTMzNTQ2NDMsImp0aSI6ImI1YTRkMWYzLWI1NzAtNDdhZi1hMWQzLTZjYTI5N2M2OGI0NCIsInNpZCI6IjU5MzZjY2MzLTQzYWYtNDhhYS05NDU5LThjODRkYjIxYjk3MCJ9.Y7-7QnsVSY24HHdMno8YM0G9ffUcuuClYGTQauZ0GNE",
  "access_expires_at": "2026-10-30T10:19:03.230010955Z",
  "refresh_token": "nsU6UVp4VlZ9mPboRRQxf3wSO76ylmHLUwm87FBiiy8",
  "refresh_expires_at": "2026-11-29T10:04:03.229484449Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c6589c6a-a0e5-435f-91b7-aceaa3f19697",
  "session_id": "5936ccc3-43af-48aa-9459-8c84db21b970",
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
  "phone": "+380664838450",
  "device_ref": "sandbox-25044"
}
```

```json
{
  "challenge_id": "08cbd926-9587-4ffc-85a2-0400ef68c915",
  "expires_at": "2026-10-30T10:09:03.820899123Z",
  "resend_available_at": "2026-10-30T10:04:04.820899123Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664838450` → **200**

```json
{
  "phone": "+380664838450",
  "audience": "CLIENT",
  "code": "333166",
  "sent_at": "2026-10-30T10:04:03.823628084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08cbd926-9587-4ffc-85a2-0400ef68c915",
  "code": "333166",
  "device_ref": "sandbox-25044"
}
```

```json
{
  "session_id": "d4e9bacd-60e6-4046-ab5e-034d95d27a1c",
  "subject": {
    "type": "CLIENT",
    "id": "a06f0ab0-babf-4956-8804-0089d42fb2ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDZmMGFiMC1iYWJmLTQ5NTYtODgwNC0wMDg5ZDQyZmIyYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTQ0LCJpYXQiOjE3OTMzNTQ2NDQsImp0aSI6IjkyODc2ZmY5LWE2YzktNDBmYy04YTZkLTkwY2I0ODA0ZDI0OCIsInNpZCI6ImQ0ZTliYWNkLTYwZTYtNDA0Ni1hYjVlLTAzNGQ5NWQyN2ExYyJ9.f5hpeCk_Nr5A1sTZEwuFxD-6ksOpYxJFGgLXbAT8vN0",
  "access_expires_at": "2026-10-30T10:19:04.130250303Z",
  "refresh_token": "Ev4FhCfyDbpMdoKwSaZyaC81Oc1eeKyTWOeAB9kN05c",
  "refresh_expires_at": "2026-11-29T10:04:04.129720841Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6bb38aa8-35fa-4126-a769-f3547a468206",
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
  "id": "ff8aeb54-d9a6-49a2-90e2-7d8845c1eb35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:09:04.427793Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 5b84a940-9de5-4a51-a763-1a62185eff15) → **201**

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
  "session_id": "4b91990e-4726-4410-a750-7ca9ecf8b84b",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1NDUsImlhdCI6MTc5MzM1NDY0NSwianRpIjoiYjMzNjk5MTMtNDBiOS00MGViLWFlZTYtMWQ2YTY2ZWRjZDYzIiwic2lkIjoiNGI5MTk5MGUtNDcyNi00NDEwLWE3NTAtN2NhOWVjZjhiODRiIn0.rJ7fWZIvIgdsdIt3LPluIEPQe1uegUEEmDLlWAlWxHM",
  "access_expires_at": "2026-10-30T10:19:05.045647868Z",
  "refresh_token": "_om3A2DZNVnbEhyPPbJqpXY4JJmzW-eEbBbaGRhmttk",
  "refresh_expires_at": "2026-10-30T22:04:05.045134197Z",
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
  "session_id": "2adc11d9-361c-4475-897b-2639aa9e67f4",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1NDUsImlhdCI6MTc5MzM1NDY0NSwianRpIjoiNTE4ZDBmMWMtNTZjZi00NTkyLWFiMjktMWNjODc0YjFkYTU3Iiwic2lkIjoiMmFkYzExZDktMzYxYy00NDc1LTg5N2ItMjYzOWFhOWU2N2Y0In0.GuyH6KKBH8RdWj6Kx559oQYL-ngiapB0JS6a2NWkXg8",
  "access_expires_at": "2026-10-30T10:19:05.626676224Z",
  "refresh_token": "QommZ7kun4015nQpUFJeb0n8dZ7INWvPkTEQOVhWq_I",
  "refresh_expires_at": "2026-10-30T22:04:05.626157864Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dcf57580-94a6-46d8-9e21-f7b4236f6d53/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:04:04.715181Z",
      "actor": {
        "type": "CLIENT",
        "id": "a06f0ab0-babf-4956-8804-0089d42fb2ae",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
        "quote_id": "ff8aeb54-d9a6-49a2-90e2-7d8845c1eb35",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5b84a940-9de5-4a51-a763-1a62185eff15"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:04:04.717571Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
        "attempt_id": "dd9e664e-784a-4d90-b94d-ac861ee6cfc8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5b84a940-9de5-4a51-a763-1a62185eff15"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T10:04:04.725141Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
        "attempt_id": "dd9e664e-784a-4d90-b94d-ac861ee6cfc8"
      },
      "correlation_id": "5b84a940-9de5-4a51-a763-1a62185eff15"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "dd9e664e-784a-4d90-b94d-ac861ee6cfc8",
        "generation": 1,
        "started_at": "2026-10-30T10:04:04.716524Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T10:04:04.725141Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T10:04:04.71837Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/5b84a940-9de5-4a51-a763-1a62185eff15` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53:0",
      "order_id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
      "at": "2026-10-30T10:04:04.715181Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53:1",
      "order_id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
      "at": "2026-10-30T10:04:04.717571Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53:2",
      "order_id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
      "at": "2026-10-30T10:04:04.725141Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d34c6f61-0eae-41b6-9548-136d3776a010` → **200**

```json
{
  "found": []
}
```

Done: request 5b84a940-9de5-4a51-a763-1a62185eff15 — order dcf57580-94a6-46d8-9e21-f7b4236f6d53 found by its id.

`GET /api/rider/v1/orders/dcf57580-94a6-46d8-9e21-f7b4236f6d53` → **200**

```json
{
  "id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a06f0ab0-babf-4956-8804-0089d42fb2ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:04:04.714609Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dcf57580-94a6-46d8-9e21-f7b4236f6d53/cancel` → **200**

```json
{
  "command_id": "c980ad57-d0f6-4baa-a956-b41c67356447",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dcf57580-94a6-46d8-9e21-f7b4236f6d53",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a06f0ab0-babf-4956-8804-0089d42fb2ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:04:04.714609Z",
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
  "phone": "+380633904213",
  "device_ref": "sandbox-16263"
}
```

```json
{
  "challenge_id": "4cffcf34-aa2a-4c83-8ca8-6bba4fc11f8f",
  "expires_at": "2026-10-30T10:09:07.424085498Z",
  "resend_available_at": "2026-10-30T10:04:08.424085498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633904213` → **200**

```json
{
  "phone": "+380633904213",
  "audience": "CLIENT",
  "code": "273725",
  "sent_at": "2026-10-30T10:04:07.426793428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cffcf34-aa2a-4c83-8ca8-6bba4fc11f8f",
  "code": "273725",
  "device_ref": "sandbox-16263"
}
```

```json
{
  "session_id": "45a55255-791a-4223-9b8f-5935dc7f0a7e",
  "subject": {
    "type": "CLIENT",
    "id": "4398e24e-5f87-46b3-a463-a133c3fbaf16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Mzk4ZTI0ZS01Zjg3LTQ2YjMtYTQ2My1hMTMzYzNmYmFmMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTQ3LCJpYXQiOjE3OTMzNTQ2NDcsImp0aSI6IjU4NTE1ODU0LTU1N2MtNGYwMC05YTRmLThkMTU1Yjc2MThiOSIsInNpZCI6IjQ1YTU1MjU1LTc5MWEtNDIyMy05YjhmLTU5MzVkYzdmMGE3ZSJ9.DT2rXU4VFivf5eJsmRr9fdIYdJkLZLKsCqkDtCkQP7Y",
  "access_expires_at": "2026-10-30T10:19:07.727593652Z",
  "refresh_token": "MgKJhu3nvLRETiBtFYiu5cCCwzfdhpS6NfFr6WZeJE4",
  "refresh_expires_at": "2026-11-29T10:04:07.727035988Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "bcc19185-32b3-4938-852c-0e2cd4b1f2bd",
  "expires_at": "2026-10-30T10:09:10.012452012Z",
  "resend_available_at": "2026-10-30T10:04:11.012452012Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633904213` → **200**

```json
{
  "phone": "+380633904213",
  "audience": "CLIENT",
  "code": "247713",
  "sent_at": "2026-10-30T10:04:10.015039597Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "fb40b235-8da3-49ec-b0ba-2ae82ffdccc0",
  "challenge_id": "bcc19185-32b3-4938-852c-0e2cd4b1f2bd",
  "otp_code": "247713"
}
```

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "PENDING",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4` → **200**

```json
{
  "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
  "state": "READY",
  "created_at": "2026-10-30T10:04:10.342983Z",
  "ready_at": "2026-10-30T10:04:19.996631Z",
  "expires_at": "2026-11-06T10:04:19.996631Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633822504",
  "device_ref": "sandbox-14929"
}
```

```json
{
  "challenge_id": "31e845cd-c848-4b7e-815e-e6bf3f34eee3",
  "expires_at": "2026-10-30T10:09:21.246721509Z",
  "resend_available_at": "2026-10-30T10:04:22.246721509Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633822504` → **200**

```json
{
  "phone": "+380633822504",
  "audience": "CLIENT",
  "code": "333860",
  "sent_at": "2026-10-30T10:04:21.24960819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31e845cd-c848-4b7e-815e-e6bf3f34eee3",
  "code": "333860",
  "device_ref": "sandbox-14929"
}
```

```json
{
  "session_id": "668991c4-6b5e-4a6b-bb1f-0b4b15b8fae1",
  "subject": {
    "type": "CLIENT",
    "id": "46f475b7-c46e-473a-91ad-8a8337ed8038"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NmY0NzViNy1jNDZlLTQ3M2EtOTFhZC04YTgzMzdlZDgwMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTYxLCJpYXQiOjE3OTMzNTQ2NjEsImp0aSI6Ijg5N2MwNzRjLWY3NDktNDE4MC05NTBiLTE0NDUwYzAyZmNmMCIsInNpZCI6IjY2ODk5MWM0LTZiNWUtNGE2Yi1iYjFmLTBiNGIxNWI4ZmFlMSJ9.rO6tThBU1C2OOZbqo1P_oH8DSatFy4kogRLayr8y6Qw",
  "access_expires_at": "2026-10-30T10:19:21.582980673Z",
  "refresh_token": "8n2kjow03PZMKmhNzGCwvCB_W7V5X-oetObDw5mC3CM",
  "refresh_expires_at": "2026-11-29T10:04:21.582412891Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/79b7ef04-0e25-4eb0-9d0c-5025899a6bf4/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eec3e902-0b2c-4346-b148-7bd550c5857c"
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
  "session_id": "fcf70501-6798-4f95-95ad-dd905453f129",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1NjIsImlhdCI6MTc5MzM1NDY2MiwianRpIjoiYTZmMjlkZDItYzk0MS00ODgxLTgzODctYTk1YTJiYjY5ODQwIiwic2lkIjoiZmNmNzA1MDEtNjc5OC00Zjk1LTk1YWQtZGQ5MDU0NTNmMTI5In0.k5FUFWqmyqUBwLxvRIXxyxpUebvJokp-FS20g1Xc5mg",
  "access_expires_at": "2026-10-30T10:19:22.453115394Z",
  "refresh_token": "2cH3P9v9Jxh1sPA4Xhe9g7xLYZhBaTBhJQXXrCmDr6o",
  "refresh_expires_at": "2026-10-30T22:04:22.452494432Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4398e24e-5f87-46b3-a463-a133c3fbaf16",
  "session_id": "45a55255-791a-4223-9b8f-5935dc7f0a7e",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/4398e24e-5f87-46b3-a463-a133c3fbaf16/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "79b7ef04-0e25-4eb0-9d0c-5025899a6bf4",
      "state": "READY",
      "created_at": "2026-10-30T10:04:10.342983Z",
      "ready_at": "2026-10-30T10:04:19.996631Z",
      "expires_at": "2026-11-06T10:04:19.996631Z",
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
  "device_ref": "sandbox-12152"
}
```

```json
{
  "challenge_id": "140549c9-5f66-4888-90b2-26d8f2323170",
  "expires_at": "2026-10-30T10:09:23.32552595Z",
  "resend_available_at": "2026-10-30T10:04:24.32552595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "007890",
  "sent_at": "2026-10-30T10:04:23.328325743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "140549c9-5f66-4888-90b2-26d8f2323170",
  "code": "007890",
  "device_ref": "sandbox-12152"
}
```

```json
{
  "session_id": "01d718d3-c334-4c6b-9718-40fe14ff5d1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTU2MywiaWF0IjoxNzkzMzU0NjYzLCJqdGkiOiJiYjhlYmNmNy01N2E5LTRkNzgtYTQ2NC0zZDkxYTk0YWNjNmYiLCJzaWQiOiIwMWQ3MThkMy1jMzM0LTRjNmItOTcxOC00MGZlMTRmZjVkMWMifQ.blP2TtiOGGhb-1cUrHkiUOwYHjtx9Lh2DMDQ2eMDEjc",
  "access_expires_at": "2026-10-30T10:19:23.648125073Z",
  "refresh_token": "YblLlGOC-uEINGyZXON4NulBwxz4uLNARP8Ndu6SFD8",
  "refresh_expires_at": "2026-11-29T10:04:23.64742396Z",
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
  "device_ref": "sandbox-23497"
}
```

```json
{
  "challenge_id": "d7c1fcb0-8a51-48d9-a09c-bf6204bf44f9",
  "expires_at": "2026-10-30T10:09:24.212963093Z",
  "resend_available_at": "2026-10-30T10:04:25.212963093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "653192",
  "sent_at": "2026-10-30T10:04:24.216264715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7c1fcb0-8a51-48d9-a09c-bf6204bf44f9",
  "code": "653192",
  "device_ref": "sandbox-23497"
}
```

```json
{
  "session_id": "ff178670-cc9c-4d08-9c1e-b5136d3c50ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTU2NCwiaWF0IjoxNzkzMzU0NjY0LCJqdGkiOiI3MjMwMmIxYy04YzQwLTRhNDktYjQ5Yy0wZDU5ZGYxODk3N2EiLCJzaWQiOiJmZjE3ODY3MC1jYzljLTRkMDgtOWMxZS1iNTEzNmQzYzUwYmEifQ.myeyzIEP0HvMhCGItJwCm3cCDtJXkc4Tbh-p__ZNI1o",
  "access_expires_at": "2026-10-30T10:19:24.535677429Z",
  "refresh_token": "gJjI0rFGvVbnKxNcn0sqyWlgwiGq17ryel8vEaEsqkU",
  "refresh_expires_at": "2026-11-29T10:04:24.535134913Z",
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
  "command_id": "b01aea76-cc0c-4a94-a37e-f41e83ab0108",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:04:25Z",
    "sequence": 1793354665120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3c5319d5-cf52-451c-849f-2bd321ebd002",
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
  "last_heartbeat_at": "2026-10-30T10:04:25.1396Z",
  "last_location_at": "2026-10-30T10:04:25.1396Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32161"
}
```

```json
{
  "challenge_id": "a1452230-b9d9-4ce4-8760-3eb90154117d",
  "expires_at": "2026-10-30T10:09:25.437188643Z",
  "resend_available_at": "2026-10-30T10:04:26.437188643Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "080575",
  "sent_at": "2026-10-30T10:04:25.440402568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1452230-b9d9-4ce4-8760-3eb90154117d",
  "code": "080575",
  "device_ref": "sandbox-32161"
}
```

```json
{
  "session_id": "eb5aa600-ffd8-4ae0-8c3b-dc7824abaac8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTU2NSwiaWF0IjoxNzkzMzU0NjY1LCJqdGkiOiI2YjVmZmZhYS05ZDk4LTQ0NzQtODIzOS00NTViYmViNTNlNTAiLCJzaWQiOiJlYjVhYTYwMC1mZmQ4LTRhZTAtOGMzYi1kYzc4MjRhYmFhYzgifQ.g3nwQqZ9G5-HFBIdJTKMgI0oIg-1Hi1mUYBmq64NXhk",
  "access_expires_at": "2026-10-30T10:19:25.755853469Z",
  "refresh_token": "hBYkqczn-2Sw-xe97xitc8aIcN-7GYSvSwVGI7tmKA8",
  "refresh_expires_at": "2026-11-29T10:04:25.755237677Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "369c0457-4c4f-4ba6-bfb1-e16b299dccf1",
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
  "last_heartbeat_at": "2026-10-30T10:02:46.090504Z",
  "last_location_at": "2026-10-30T10:02:46.090504Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/369c0457-4c4f-4ba6-bfb1-e16b299dccf1/handover` → **200**

```json
{
  "command_id": "d620e289-4203-47eb-bd9d-718016e3ce57",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "369c0457-4c4f-4ba6-bfb1-e16b299dccf1",
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
  "last_heartbeat_at": "2026-10-30T10:02:46.090504Z",
  "last_location_at": "2026-10-30T10:02:46.090504Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/369c0457-4c4f-4ba6-bfb1-e16b299dccf1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:04:26Z",
    "sequence": 1793354666651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "369c0457-4c4f-4ba6-bfb1-e16b299dccf1",
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
  "last_heartbeat_at": "2026-10-30T10:04:26.671573Z",
  "last_location_at": "2026-10-30T10:04:26.671573Z",
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
  "session_id": "e5083287-cdd6-42b4-a8c7-3d9ce5fc7091",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1NjcsImlhdCI6MTc5MzM1NDY2NywianRpIjoiNTM3YTcwNzYtOTk5OC00NDE0LWFjN2ItNmU1MjQ3M2NlNzRiIiwic2lkIjoiZTUwODMyODctY2RkNi00MmI0LWE4YzctM2Q5Y2U1ZmM3MDkxIn0.8LlcjdDwDosmdloQRMJqcYYurDc_hph4jQtc2nCmYv0",
  "access_expires_at": "2026-10-30T10:19:27.247394166Z",
  "refresh_token": "DQs088ah6NnERLO0GkUQtls-sQNghukoy8sGrdV_Rrc",
  "refresh_expires_at": "2026-10-30T22:04:27.246846621Z",
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
  "session_id": "3582328e-7916-40c8-92cf-62b7d68ca199",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1NjcsImlhdCI6MTc5MzM1NDY2NywianRpIjoiNjA3NTkyMWYtMTM3OC00ODRmLTg0OWEtMzhmNzdjZmI3OGU1Iiwic2lkIjoiMzU4MjMyOGUtNzkxNi00MGM4LTkyY2YtNjJiN2Q2OGNhMTk5In0.1Bw7i7pgjocdhF0TX6to62OEnaJ3MzyREKRiXO2Kwa0",
  "access_expires_at": "2026-10-30T10:19:27.822564059Z",
  "refresh_token": "hX5f0RuzscgbgYGRnH2oHI4QYj1grk7InoIF1-mNtEI",
  "refresh_expires_at": "2026-10-30T22:04:27.822015312Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689753576",
  "device_ref": "sandbox-25937"
}
```

```json
{
  "challenge_id": "f1530829-e696-42fb-9608-84a92ebb7146",
  "expires_at": "2026-10-30T10:09:28.099331385Z",
  "resend_available_at": "2026-10-30T10:04:29.099331385Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689753576` → **200**

```json
{
  "phone": "+380689753576",
  "audience": "CLIENT",
  "code": "411084",
  "sent_at": "2026-10-30T10:04:28.10265495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1530829-e696-42fb-9608-84a92ebb7146",
  "code": "411084",
  "device_ref": "sandbox-25937"
}
```

```json
{
  "session_id": "cf4c8c09-4373-4903-981e-1b20ee777a45",
  "subject": {
    "type": "CLIENT",
    "id": "2bf38fd7-2c73-4d1b-a77f-41e9e6573c2f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYmYzOGZkNy0yYzczLTRkMWItYTc3Zi00MWU5ZTY1NzNjMmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTY4LCJpYXQiOjE3OTMzNTQ2NjgsImp0aSI6ImIwMDQzYjY5LTQxZTItNGJhMy04OGM5LTE4YmY0YTZkMGU0OCIsInNpZCI6ImNmNGM4YzA5LTQzNzMtNDkwMy05ODFlLTFiMjBlZTc3N2E0NSJ9.7DPgz7rSL8kUDEG7-OZwiveZ8UhR_STUtugX3P1eyLg",
  "access_expires_at": "2026-10-30T10:19:28.423817258Z",
  "refresh_token": "t_ZPPdOT7tz7v7uMoRRKdlVo46Zxr5Qd56-molegUMw",
  "refresh_expires_at": "2026-11-29T10:04:28.423202197Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d45425dc-8442-4fce-8993-70da1583e717",
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
  "id": "4d36e16d-459e-4bdb-82da-7553a46e7fd1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:09:28.710852Z",
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
  "command_id": "274bdff2-888f-4eb2-803e-59ff023dd260",
  "quote_id": "4d36e16d-459e-4bdb-82da-7553a46e7fd1",
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
  "id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2bf38fd7-2c73-4d1b-a77f-41e9e6573c2f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:04:29.024942Z",
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
    "id": "f68ff72b-aec7-4771-95ef-74b5108a0d8d",
    "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
    "expires_at": "2026-10-30T10:04:44.02816Z",
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

`POST /api/driver/v1/offers/f68ff72b-aec7-4771-95ef-74b5108a0d8d/reject` → **204**

```json
{
  "command_id": "fa67cfd1-d2b1-4cb4-88c6-6197914282fb"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "afbd34ef-4c58-49fe-852b-32913d409402",
    "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
    "expires_at": "2026-10-30T10:04:44.609142Z",
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

`POST /api/driver/v1/offers/afbd34ef-4c58-49fe-852b-32913d409402/accept` → **200**

```json
{
  "command_id": "5d7f5883-3217-448c-8c20-9db146377670"
}
```

```json
{
  "id": "a87994b0-33ad-4633-a688-d5f636eaf8a1",
  "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d6e8764-620d-42d1-b5eb-cd4511855315",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c23b87b8-10f1-4a2f-ae84-b249f58ccab4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:04:29.0254Z",
      "actor": {
        "type": "CLIENT",
        "id": "2bf38fd7-2c73-4d1b-a77f-41e9e6573c2f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
        "quote_id": "4d36e16d-459e-4bdb-82da-7553a46e7fd1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "129ea616-8952-4151-be32-412e86d6b034"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:04:29.027374Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
        "attempt_id": "44c87cbb-f755-4439-9563-d8d3deddf247",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "129ea616-8952-4151-be32-412e86d6b034"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:04:29.030967Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f68ff72b-aec7-4771-95ef-74b5108a0d8d",
        "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "129ea616-8952-4151-be32-412e86d6b034"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T10:04:29.608016Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f68ff72b-aec7-4771-95ef-74b5108a0d8d",
        "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4"
      },
      "correlation_id": "29f64c16-6dde-4d21-8a1d-7f7cb8f3100e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c23b87b8-10f1-4a2f-ae84-b249f58ccab4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c23b87b8-10f1-4a2f-ae84-b249f58ccab4` → **200**

```json
{
  "id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2bf38fd7-2c73-4d1b-a77f-41e9e6573c2f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a87994b0-33ad-4633-a688-d5f636eaf8a1",
    "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4d6e8764-620d-42d1-b5eb-cd4511855315",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T10:04:29.024942Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c23b87b8-10f1-4a2f-ae84-b249f58ccab4/cancel` → **200**

```json
{
  "command_id": "12ec5c06-4909-4076-8f39-ceb18121cb02",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2bf38fd7-2c73-4d1b-a77f-41e9e6573c2f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a87994b0-33ad-4633-a688-d5f636eaf8a1",
    "order_id": "c23b87b8-10f1-4a2f-ae84-b249f58ccab4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4d6e8764-620d-42d1-b5eb-cd4511855315",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:04:29.024942Z",
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
  "session_id": "3c5319d5-cf52-451c-849f-2bd321ebd002",
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
  "last_heartbeat_at": "2026-10-30T10:04:25.1396Z",
  "last_location_at": "2026-10-30T10:04:25.1396Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3c5319d5-cf52-451c-849f-2bd321ebd002/close` → **200**

```json
{
  "command_id": "1ae3939f-e1f3-40c3-8ed1-2c83b87b1238",
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
  "session_id": "369c0457-4c4f-4ba6-bfb1-e16b299dccf1",
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
  "last_heartbeat_at": "2026-10-30T10:04:26.671573Z",
  "last_location_at": "2026-10-30T10:04:26.671573Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/369c0457-4c4f-4ba6-bfb1-e16b299dccf1/close` → **200**

```json
{
  "command_id": "c1479e4c-447f-4747-a30a-00273c3c8e75",
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
  "session_id": "3bb619a0-d49d-4912-bc77-2d7caef8b31b",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1NzIsImlhdCI6MTc5MzM1NDY3MiwianRpIjoiNjVkZDM5OWItMDg5MC00MWEyLTkzMzYtZDczMjQ3ODUxMTEwIiwic2lkIjoiM2JiNjE5YTAtZDQ5ZC00OTEyLWJjNzctMmQ3Y2FlZjhiMzFiIn0.ixnAYZDNcjHgUB9SJOCOfbgEUcKJAiYxScTYX7JscUQ",
  "access_expires_at": "2026-10-30T10:19:32.593675545Z",
  "refresh_token": "FWHOvxzw3JiTys93mzChIRzAPO6CnIGKMmyBq8SD-Ek",
  "refresh_expires_at": "2026-10-30T22:04:32.593159438Z",
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
  "command_id": "ade5abf8-d649-4ddb-8471-4ce8177366f7",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T10:04:33.161374Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "8673dd6d-0afb-4bbb-aca9-845b3fbedef8",
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
  "correlation_id": "194b2803-13bf-4536-8ba0-fe18b37554e6"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "0350d1b3-45fd-431c-8b08-cd1ff490e7bf",
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
  "correlation_id": "cc764299-0481-4855-9754-7e7d1b5f5b6e"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636790393",
  "device_ref": "sandbox-2235"
}
```

```json
{
  "challenge_id": "2517f1e0-65ab-4a6b-b6ba-12d9b41ee9a0",
  "expires_at": "2026-10-30T10:09:34.039326857Z",
  "resend_available_at": "2026-10-30T10:04:35.039326857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636790393` → **200**

```json
{
  "phone": "+380636790393",
  "audience": "CLIENT",
  "code": "699152",
  "sent_at": "2026-10-30T10:04:34.042043975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2517f1e0-65ab-4a6b-b6ba-12d9b41ee9a0",
  "code": "699152",
  "device_ref": "sandbox-2235"
}
```

```json
{
  "session_id": "81a5822d-1cc6-4420-bf1f-8614f4328b25",
  "subject": {
    "type": "CLIENT",
    "id": "ff0af574-20ca-4290-b3be-90e20eca2e36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjBhZjU3NC0yMGNhLTQyOTAtYjNiZS05MGUyMGVjYTJlMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTc0LCJpYXQiOjE3OTMzNTQ2NzQsImp0aSI6ImJjYjljOWUwLWY5MTYtNGM4OS1iNjY4LTM0YzBhMjZiMjYwYyIsInNpZCI6IjgxYTU4MjJkLTFjYzYtNDQyMC1iZjFmLTg2MTRmNDMyOGIyNSJ9.2iORm199bpA9_zxM0Cgr131HDuvc4i9TrQIW1M0x2-4",
  "access_expires_at": "2026-10-30T10:19:34.354565292Z",
  "refresh_token": "Y9K9Sb_UaXTSDL-31BvG4CCMXxd7gn4tRIDXL_4ImnQ",
  "refresh_expires_at": "2026-11-29T10:04:34.353995835Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96178012-96d2-41d3-9944-ecca57ddb2e7",
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
  "id": "fba0576d-e5e5-4184-b494-af46dfca1370",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:09:34.641242Z",
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
  "command_id": "30728dc2-c4eb-4919-8a81-883d02d4464e",
  "quote_id": "fba0576d-e5e5-4184-b494-af46dfca1370",
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
  "correlation_id": "b29263e5-9831-4e5b-acb9-feb57064cd06"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f2d26d26-3d9d-4d2a-bf4b-cc7542f0795f",
  "quote_id": "fba0576d-e5e5-4184-b494-af46dfca1370",
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
  "id": "aafdc4f0-e768-4ac7-b438-ef9aaddcdba7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff0af574-20ca-4290-b3be-90e20eca2e36",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:04:35.231601Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/aafdc4f0-e768-4ac7-b438-ef9aaddcdba7/cancel` → **200**

```json
{
  "command_id": "332c1952-8385-4003-8895-9e1874828028",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "aafdc4f0-e768-4ac7-b438-ef9aaddcdba7",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ff0af574-20ca-4290-b3be-90e20eca2e36",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:04:35.231601Z",
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
  "command_id": "7d7d8208-57f6-47e8-b6da-6bd524c3edf7",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T10:04:35.859985Z"
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
      "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T10:04:35.859985Z"
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
  "device_ref": "sandbox-28164"
}
```

```json
{
  "challenge_id": "2c4b4168-0d09-49ec-a3fa-1d3e94e07971",
  "expires_at": "2026-10-30T10:09:36.744521099Z",
  "resend_available_at": "2026-10-30T10:04:37.744521099Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "185049",
  "sent_at": "2026-10-30T10:04:36.747228501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c4b4168-0d09-49ec-a3fa-1d3e94e07971",
  "code": "185049",
  "device_ref": "sandbox-28164"
}
```

```json
{
  "session_id": "d536c777-ea71-4dea-ade1-06ff97f6b796",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTU3NywiaWF0IjoxNzkzMzU0Njc3LCJqdGkiOiI0MTVlZTg4MS02ZTI3LTRhNTEtOWZmNy01M2I4NGVhZGRjMDMiLCJzaWQiOiJkNTM2Yzc3Ny1lYTcxLTRkZWEtYWRlMS0wNmZmOTdmNmI3OTYifQ.T3Z3Nxxs8ZifF1R88KZI-KiN2a7nj-GX65lDk9CwrKo",
  "access_expires_at": "2026-10-30T10:19:37.052968984Z",
  "refresh_token": "WGh7JpDxBXFxDvwWdEB7oqy68gMvIvXl_0UVDE2lSB4",
  "refresh_expires_at": "2026-11-29T10:04:37.052387195Z",
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
  "command_id": "c62eff6d-16c1-4604-b3c7-a808d3b73710",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:04:37Z",
    "sequence": 1793354677606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:04:37.624487Z",
  "last_location_at": "2026-10-30T10:04:37.624487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676461495",
  "device_ref": "sandbox-6650"
}
```

```json
{
  "challenge_id": "e958e6c8-ea17-42bc-8ff1-0edfca6d0bc6",
  "expires_at": "2026-10-30T10:09:37.905007084Z",
  "resend_available_at": "2026-10-30T10:04:38.905007084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676461495` → **200**

```json
{
  "phone": "+380676461495",
  "audience": "CLIENT",
  "code": "152345",
  "sent_at": "2026-10-30T10:04:37.912549766Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e958e6c8-ea17-42bc-8ff1-0edfca6d0bc6",
  "code": "152345",
  "device_ref": "sandbox-6650"
}
```

```json
{
  "session_id": "cb37e4de-2a8d-4f4c-9ada-5e3156d40920",
  "subject": {
    "type": "CLIENT",
    "id": "890d5ca3-fa42-43e0-b76b-d5237b31fe13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTBkNWNhMy1mYTQyLTQzZTAtYjc2Yi1kNTIzN2IzMWZlMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTc4LCJpYXQiOjE3OTMzNTQ2NzgsImp0aSI6IjNkZDBkYzZjLTMzZTQtNGExNC1hMGQ2LTEwZjdkZDEwY2NmNCIsInNpZCI6ImNiMzdlNGRlLTJhOGQtNGY0Yy05YWRhLTVlMzE1NmQ0MDkyMCJ9.XL8dV6xfgXE3uGZ9DxTyHiGOVjmpt5Ja1hHsnZFUeOw",
  "access_expires_at": "2026-10-30T10:19:38.221785351Z",
  "refresh_token": "jNgjB2Xuu-TaaKW9gSGJowgneqbGDt4naHNWHhccwyY",
  "refresh_expires_at": "2026-11-29T10:04:38.221200957Z",
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
  "command_id": "d647e663-f0aa-4bde-ba4f-4945f3a670d1",
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
  "id": "b9bf5e20-6c6f-40ef-8461-62d3a99b2264",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:09:38.769447Z",
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
  "command_id": "bd01e7b2-986b-49d6-aa7a-2ec1dc36d882",
  "platform": "ANDROID",
  "token": "sandbox-driver-84abc52b-3d72-4735-b563-4c87986513a8"
}
```

```json
{
  "id": "cde3a4eb-c2e3-4353-bfe4-b97379d8a115",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T10:04:39.083774Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "be620f44-fe87-49a1-8b6b-25834d17a5e0",
  "platform": "ANDROID",
  "token": "sandbox-rider-c1622b9c-d289-4290-9666-3702b7dbba98"
}
```

```json
{
  "id": "8534104a-5e2a-43cb-92b9-d75cd5ddcd02",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T10:04:39.373682Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "25b4a0e4-a10e-42ff-baf9-3bfaaae883bb",
  "quote_id": "b9bf5e20-6c6f-40ef-8461-62d3a99b2264",
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
  "id": "99997f4b-6190-4827-9d65-5f932f016409",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "890d5ca3-fa42-43e0-b76b-d5237b31fe13",
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
  "created_at": "2026-10-30T10:04:39.671795Z",
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
    "id": "d6667637-f9c2-4db7-8c1c-8b3d59153bda",
    "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
    "expires_at": "2026-10-30T10:04:54.674808Z",
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

`POST /api/driver/v1/offers/d6667637-f9c2-4db7-8c1c-8b3d59153bda/accept` → **200**

```json
{
  "command_id": "08211b4e-6e04-431f-9d96-78083bae0d54"
}
```

```json
{
  "id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T10:04:39.646Z` → **200**

```json
[
  {
    "at": "2026-10-30T10:04:40.534002284Z",
    "token_suffix": "6513a8",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
      "order_version": "2",
      "event_id": "2e310d6d-1a08-4737-a9af-bf65e456b1b1",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676461495&after=2026-10-30T10:04:39.646Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676461495&after=2026-10-30T10:04:39.646Z` → **200**

```json
[
  {
    "at": "2026-10-30T10:04:41.540247571Z",
    "token_suffix": "dbba98",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
      "order_version": "3",
      "event_id": "9f72ffdc-9e4e-4f73-a58f-6c2315e5b507",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/99997f4b-6190-4827-9d65-5f932f016409/messages` → **201**

```json
{
  "command_id": "fb866600-70a7-4cdd-8521-e75dbcf03ce5",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "80218b6a-8c3c-467d-9f0f-2f9b1dc2c80c",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T10:04:41.639839315Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "assignment_id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
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

`POST /api/driver/v1/trips/6c5cb73f-dee6-49b5-98a5-72b0149a1d64/messages` → **201**

```json
{
  "command_id": "85e0c903-13a5-44be-ae0f-6f7f7f9228d1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d89660bf-f5f5-4c6b-87f3-b2bd2f74e7b8",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T10:04:42.19235561Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/99997f4b-6190-4827-9d65-5f932f016409/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6c5cb73f-dee6-49b5-98a5-72b0149a1d64/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676461495"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:04:43Z",
    "sequence": 1793354683409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:04:43.059688Z",
  "last_location_at": "2026-10-30T10:04:43.059688Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "assignment_id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
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

`POST /api/driver/v1/trips/6c5cb73f-dee6-49b5-98a5-72b0149a1d64/arrive` → **200**

```json
{
  "command_id": "d7da5bd4-2b37-4b34-a78c-2ca12e1fc0bf",
  "expected_version": 0
}
```

```json
{
  "id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "assignment_id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
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
  "arrived_at": "2026-10-30T10:04:43.616887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c5cb73f-dee6-49b5-98a5-72b0149a1d64/start` → **200**

```json
{
  "command_id": "6eee2310-bb57-4982-ad73-ad50ac074465",
  "expected_version": 1
}
```

```json
{
  "id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "assignment_id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
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
  "arrived_at": "2026-10-30T10:04:43.616887Z",
  "started_at": "2026-10-30T10:04:43.903886Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:04:44Z",
    "sequence": 1793354684209
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:04:44.229594Z",
  "last_location_at": "2026-10-30T10:04:44.229594Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6c5cb73f-dee6-49b5-98a5-72b0149a1d64/complete` → **200**

```json
{
  "command_id": "9683f55f-f23a-40d1-9ed8-35a7f9ac33be",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:04:44Z",
  "cash_received": true
}
```

```json
{
  "id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "assignment_id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
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
  "arrived_at": "2026-10-30T10:04:43.616887Z",
  "started_at": "2026-10-30T10:04:43.903886Z",
  "completed_at": "2026-10-30T10:04:44.521425Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/99997f4b-6190-4827-9d65-5f932f016409` → **200**

```json
{
  "id": "99997f4b-6190-4827-9d65-5f932f016409",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "890d5ca3-fa42-43e0-b76b-d5237b31fe13",
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
    "id": "5f7b6511-be74-42a2-95dd-e4886ccd513e",
    "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:04:39.671795Z",
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
    "id": "99997f4b-6190-4827-9d65-5f932f016409",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T10:04:39.671795Z",
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
    "id": "6c5cb73f-dee6-49b5-98a5-72b0149a1d64",
    "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
    "order_short_number": 13,
    "created_at": "2026-10-30T10:04:40.261023Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d32ffc79-9869-4019-ae21-6282c7dc695d",
    "order_id": "41f04f7f-6bcd-40b7-9c12-d6b0d230e226",
    "order_short_number": 8,
    "created_at": "2026-10-30T10:03:19.360797Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "625925fb-5dbb-4d8f-b315-b3a702a3c5ca",
    "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
    "order_short_number": 3,
    "created_at": "2026-10-30T10:02:34.58378Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "661ea128-f563-42dd-bcf1-a4963cfd8a03",
    "order_id": "982e1d14-bfd2-4aed-ac7f-11a207300249",
    "order_short_number": 2,
    "created_at": "2026-10-30T10:02:17.330528Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7d642b67-2206-452a-ad57-085cfba36b4f",
    "order_id": "be26fe6e-d078-43ff-a5d3-4a95eb7872cd",
    "order_short_number": 1,
    "created_at": "2026-10-30T10:02:07.352787Z",
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

`GET /api/rider/v1/orders/99997f4b-6190-4827-9d65-5f932f016409/tip` → **200**

```json
{
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
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
  "available_until": "2026-10-31T10:04:44.521425Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/99997f4b-6190-4827-9d65-5f932f016409/tip` → **201**

```json
{
  "command_id": "3d96b8b1-9c0e-4007-b5ca-d9ba2d0ee672",
  "amount_minor": 1100
}
```

```json
{
  "id": "5102e3b9-9850-4282-b1f6-ed522edc93e6",
  "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T10:04:49.5556Z"
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
  "session_id": "c45774ce-66ae-445f-a75d-5557d8e7035a",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1OTAsImlhdCI6MTc5MzM1NDY5MCwianRpIjoiMWRjODkzMWUtNzQ3Ni00ODcxLTkyODktN2UwNjgxYjBmNzM3Iiwic2lkIjoiYzQ1Nzc0Y2UtNjZhZS00NDVmLWE3NWQtNTU1N2Q4ZTcwMzVhIn0.ysGUTDRbpqxOVfDhd1R7RJrZq0u_AaPLOehIAgRqFfo",
  "access_expires_at": "2026-10-30T10:19:50.135736869Z",
  "refresh_token": "v67q49DO6IbLoE8kRqWFc3e2OqtsVrjceQhkr7PKVXo",
  "refresh_expires_at": "2026-10-30T22:04:50.135200975Z",
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
  "generated_at": "2026-10-30T10:04:50.426974881Z"
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
  "generated_at": "2026-10-30T10:04:50.718393158Z"
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
  "session_id": "a4aa8c2d-1d6b-4d9e-9158-09cead3514c3",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1OTEsImlhdCI6MTc5MzM1NDY5MSwianRpIjoiODVlMDk5ZTAtZDYyNS00ZTg5LWI3YjctMGY0YmYwYmM4MTc3Iiwic2lkIjoiYTRhYThjMmQtMWQ2Yi00ZDllLTkxNTgtMDljZWFkMzUxNGMzIn0.xMKJyIlwxQ-GSSGTkVyWf4ufeui5EQTrnBmV75NU4-E",
  "access_expires_at": "2026-10-30T10:19:51.301716682Z",
  "refresh_token": "tiZ4LA3Sji_NE98jg79avZL2RvE_WETDpckdmIC0yXI",
  "refresh_expires_at": "2026-10-30T22:04:51.301015416Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/99997f4b-6190-4827-9d65-5f932f016409/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:04:39.672291Z",
      "actor": {
        "type": "CLIENT",
        "id": "890d5ca3-fa42-43e0-b76b-d5237b31fe13",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
        "quote_id": "b9bf5e20-6c6f-40ef-8461-62d3a99b2264",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f13579b6-aaf3-4861-835a-8737ae73f763"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:04:39.674113Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
        "attempt_id": "e6689fca-4173-418b-8c29-827a2f4cf594",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f13579b6-aaf3-4861-835a-8737ae73f763"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:04:39.677409Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d6667637-f9c2-4db7-8c1c-8b3d59153bda",
        "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f13579b6-aaf3-4861-835a-8737ae73f763"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:04:40.26315Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d6667637-f9c2-4db7-8c1c-8b3d59153bda",
        "order_id": "99997f4b-6190-4827-9d65-5f932f016409",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5f7b6511-be74-42a2-95dd-e4886ccd513e"
      },
      "correlation_id": "6f2811c4-efe8-41e4-ac4f-3d2ecacfc829"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T10:04:51.889764189Z",
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
      "last_location_at": "2026-10-30T10:04:44.229594Z",
      "order_id": null
    }
  ]
}
```

Done: order 99997f4b-6190-4827-9d65-5f932f016409.

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
  "session_id": "e4241260-84b2-4fff-a3c5-f631844acfad",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1OTIsImlhdCI6MTc5MzM1NDY5MiwianRpIjoiZDIzNmQzNzctMjA1OC00OWM1LWFmY2YtYWQxYTY0ZTkyM2YxIiwic2lkIjoiZTQyNDEyNjAtODRiMi00ZmZmLWEzYzUtZjYzMTg0NGFjZmFkIn0.hD0-YcNPE2lsjG6htDeHqZSJW5ToftWEkOL3mq_XFys",
  "access_expires_at": "2026-10-30T10:19:52.493745491Z",
  "refresh_token": "XHVhnDmtx0DtvuqrAGOAgFWIuxSyN6ZnS3oDB7wUWzA",
  "refresh_expires_at": "2026-10-30T22:04:52.493192475Z",
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
  "command_id": "04c631ba-238b-4cc7-ba59-c401e55af04b",
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
  "timestamp": "2026-10-30T10:04:53.000+0000",
  "channel": {
    "id": "1730052000.324367655",
    "linkedid": "1730052000.324367655",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679491462"
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
  "timestamp": "2026-10-30T10:04:53.000+0000",
  "channel": {
    "id": "1730052000.324367655",
    "linkedid": "1730052000.324367655",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679491462"
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
  "session_id": "140dca36-bac9-476b-a0b8-d0e8c7696d05",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU1OTMsImlhdCI6MTc5MzM1NDY5MywianRpIjoiZjVlZTRjOGQtZThlNy00MjJiLTg1ZDEtZDlhNjFmMWFiMzMxIiwic2lkIjoiMTQwZGNhMzYtYmFjOS00NzZiLWEwYjgtZDBlOGM3Njk2ZDA1In0.gixRbtuGSuQ5aEnUYwdKSOrLDHInczEGPkMDhulcNAU",
  "access_expires_at": "2026-10-30T10:19:53.711448671Z",
  "refresh_token": "ow4RmacYF-s3xy5rLSgY3OXGs5nm2iz9vmux4LYrviE",
  "refresh_expires_at": "2026-10-30T22:04:53.710551653Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "3a38058e-a5b1-47b9-9c1f-dc72602344f2",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679491462",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:04:53Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/3a38058e-a5b1-47b9-9c1f-dc72602344f2/answer` → **200**

```json
{
  "command_id": "eda26438-1c4a-4941-b076-7e41c9576290"
}
```

```json
{
  "id": "3a38058e-a5b1-47b9-9c1f-dc72602344f2",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679491462",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
  "order_ids": [],
  "started_at": "2026-10-30T10:04:53Z",
  "answered_at": "2026-10-30T10:04:54.314897Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.324367655",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2f9c20ea-2369-4324-b883-f704d1128bae",
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
  "id": "95a3b669-f7a3-4ae0-8a9b-51b2d37e29c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:09:54.652985Z",
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
  "command_id": "59766b4c-0e46-4cb5-bb80-fca5b72bbaaf",
  "quote_id": "95a3b669-f7a3-4ae0-8a9b-51b2d37e29c8",
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
    "phone": "+380679491462"
  },
  "call_id": "3a38058e-a5b1-47b9-9c1f-dc72602344f2"
}
```

```json
{
  "id": "3e3f7a4a-3104-4f05-9061-764f4717d7f5",
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
  "created_at": "2026-10-30T10:04:54.970648Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679491462"
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
    "id": "1730052000.324367655",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3a38058e-a5b1-47b9-9c1f-dc72602344f2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679491462",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [
        "3e3f7a4a-3104-4f05-9061-764f4717d7f5"
      ],
      "started_at": "2026-10-30T10:04:53Z",
      "answered_at": "2026-10-30T10:04:54.314897Z",
      "ended_at": "2026-10-30T10:04:55.294543Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b8b0d087-2135-45fa-9398-6a7ca1dd704c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679039219",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [],
      "started_at": "2026-10-30T10:02:25.537573Z",
      "answered_at": "2026-10-30T10:02:25.868285Z",
      "ended_at": "2026-10-30T10:02:26.185333Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:02:29.968007Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/3e3f7a4a-3104-4f05-9061-764f4717d7f5` → **200**

```json
{
  "id": "3e3f7a4a-3104-4f05-9061-764f4717d7f5",
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
  "created_at": "2026-10-30T10:04:54.970648Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679491462"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/3e3f7a4a-3104-4f05-9061-764f4717d7f5` → **200**

```json
{
  "id": "3e3f7a4a-3104-4f05-9061-764f4717d7f5",
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
  "created_at": "2026-10-30T10:04:54.970648Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679491462"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3e3f7a4a-3104-4f05-9061-764f4717d7f5/cancel` → **200**

```json
{
  "command_id": "1218a4e7-2982-46a5-b7c8-e151c8ee7354",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3e3f7a4a-3104-4f05-9061-764f4717d7f5",
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
  "created_at": "2026-10-30T10:04:54.970648Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679491462"
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

Done: call 3a38058e-a5b1-47b9-9c1f-dc72602344f2 with order 3e3f7a4a-3104-4f05-9061-764f4717d7f5.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20462"
}
```

```json
{
  "challenge_id": "84472460-0ddb-4cbb-8ef6-bf10b46730d9",
  "expires_at": "2026-10-30T10:09:56.571273459Z",
  "resend_available_at": "2026-10-30T10:04:57.571273459Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "740552",
  "sent_at": "2026-10-30T10:04:56.574788668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84472460-0ddb-4cbb-8ef6-bf10b46730d9",
  "code": "740552",
  "device_ref": "sandbox-20462"
}
```

```json
{
  "session_id": "1c9f8ccf-5ffb-4fd1-9178-4ac3ce4b1c6f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTU5NiwiaWF0IjoxNzkzMzU0Njk2LCJqdGkiOiJmY2EzMTQ1MC04Njk5LTQ2MjEtYWExMi01OTFmNjM0OGZiYzgiLCJzaWQiOiIxYzlmOGNjZi01ZmZiLTRmZDEtOTE3OC00YWMzY2U0YjFjNmYifQ.UXI1dCORaaHDA06tAvzEa46GHMM9QLxJfybjShvoxdE",
  "access_expires_at": "2026-10-30T10:19:56.890982546Z",
  "refresh_token": "Nx5wCpqjcRP1xCB4HuyIP_FKRoHOk68K7qT5Vjv67ks",
  "refresh_expires_at": "2026-11-29T10:04:56.890345674Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:04:44.229594Z",
  "last_location_at": "2026-10-30T10:04:44.229594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/handover` → **200**

```json
{
  "command_id": "348c043c-18f4-44c3-bfed-63834b393ab1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:04:44.229594Z",
  "last_location_at": "2026-10-30T10:04:44.229594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:04:57Z",
    "sequence": 1793354697756
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:04:57.776527Z",
  "last_location_at": "2026-10-30T10:04:57.776527Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663895348",
  "device_ref": "sandbox-12823"
}
```

```json
{
  "challenge_id": "4f03acdf-d879-4f12-bc22-43788727269d",
  "expires_at": "2026-10-30T10:09:58.076132798Z",
  "resend_available_at": "2026-10-30T10:04:59.076132798Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663895348` → **200**

```json
{
  "phone": "+380663895348",
  "audience": "CLIENT",
  "code": "265047",
  "sent_at": "2026-10-30T10:04:58.079756061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f03acdf-d879-4f12-bc22-43788727269d",
  "code": "265047",
  "device_ref": "sandbox-12823"
}
```

```json
{
  "session_id": "7d4b63de-26df-478a-9976-ae1cbaaa4d0e",
  "subject": {
    "type": "CLIENT",
    "id": "c05b4ef0-2a86-43e8-b033-f901cfaeaa84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDViNGVmMC0yYTg2LTQzZTgtYjAzMy1mOTAxY2ZhZWFhODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NTk4LCJpYXQiOjE3OTMzNTQ2OTgsImp0aSI6ImRhMjVjMGFkLWQ1ZjQtNGFhZC04YTI5LWM2ZjAxNzhlZjgwZSIsInNpZCI6IjdkNGI2M2RlLTI2ZGYtNDc4YS05OTc2LWFlMWNiYWFhNGQwZSJ9.BP6unm4oQ0hMIZmJvon74gx0n7ENcXRa3vdBnPjGvus",
  "access_expires_at": "2026-10-30T10:19:58.401357752Z",
  "refresh_token": "py_VCyxV04YXjOUZViQHT9n370ORMI4J-BvYRrn8HGs",
  "refresh_expires_at": "2026-11-29T10:04:58.400516555Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ac902846-671d-49eb-a701-d5522e2dcf3e",
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
  "id": "d5e1dd42-2eea-42d9-9fca-02cb8593cec4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:09:58.697202Z",
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
  "command_id": "27192859-c832-4072-9f9f-d055e81c2623",
  "quote_id": "d5e1dd42-2eea-42d9-9fca-02cb8593cec4",
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
  "id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c05b4ef0-2a86-43e8-b033-f901cfaeaa84",
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
  "created_at": "2026-10-30T10:04:59.01171Z",
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
    "id": "affcd72a-975e-42e3-81ff-c3db114a9d4a",
    "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
    "expires_at": "2026-10-30T10:05:14.015219Z",
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

`POST /api/driver/v1/offers/affcd72a-975e-42e3-81ff-c3db114a9d4a/accept` → **200**

```json
{
  "command_id": "d9597b59-1090-458f-89da-19849b0d2560"
}
```

```json
{
  "id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e",
  "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9",
  "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
  "assignment_id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e",
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

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:00Z",
    "sequence": 1793354700185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:05:00.20435Z",
  "last_location_at": "2026-10-30T10:05:00.20435Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9/arrive` → **200**

```json
{
  "command_id": "78f4c263-cf78-4cb4-8f13-eb084b658157",
  "expected_version": 0
}
```

```json
{
  "id": "9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9",
  "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
  "assignment_id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e",
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
  "arrived_at": "2026-10-30T10:05:00.509658Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9/start` → **200**

```json
{
  "command_id": "97a7623b-4a71-495f-814b-24d587484836",
  "expected_version": 1
}
```

```json
{
  "id": "9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9",
  "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
  "assignment_id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e",
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
  "arrived_at": "2026-10-30T10:05:00.509658Z",
  "started_at": "2026-10-30T10:05:00.815491Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:01Z",
    "sequence": 1793354701101
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:05:01.11963Z",
  "last_location_at": "2026-10-30T10:05:01.11963Z",
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
  "device_ref": "sandbox-2906"
}
```

```json
{
  "challenge_id": "9e382a1f-d584-4fab-a0b1-f584217ac78f",
  "expires_at": "2026-10-30T10:10:01.408219591Z",
  "resend_available_at": "2026-10-30T10:05:02.408219591Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "801270",
  "sent_at": "2026-10-30T10:05:01.411583888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e382a1f-d584-4fab-a0b1-f584217ac78f",
  "code": "801270",
  "device_ref": "sandbox-2906"
}
```

```json
{
  "session_id": "50df105a-56af-4fb6-ba2d-20c4ce5ec5c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTYwMSwiaWF0IjoxNzkzMzU0NzAxLCJqdGkiOiIyMWIyYWQzZC1hMzRlLTRlMjctYjUwZS02YmY0NDM2YjcyZDAiLCJzaWQiOiI1MGRmMTA1YS01NmFmLTRmYjYtYmEyZC0yMGM0Y2U1ZWM1YzQifQ.k9ezEA8ipIkJM57adibQSgR9__TSsbmKHMjMiLtU8Jo",
  "access_expires_at": "2026-10-30T10:20:01.740451426Z",
  "refresh_token": "HqnqMA-z1-S_Dik62YLrL1WqHCgUjKfq98xT9q4dV1g",
  "refresh_expires_at": "2026-11-29T10:05:01.739903791Z",
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
  "command_id": "93582bbe-9a16-4ad6-9717-ef81e4708fda",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:02Z",
    "sequence": 1793354702293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3d374e6d-072c-46f7-82bd-f8cb44a7671d",
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
  "last_heartbeat_at": "2026-10-30T10:05:02.312128Z",
  "last_location_at": "2026-10-30T10:05:02.312128Z",
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
  "session_id": "285a27b2-6532-4718-bee5-f78c1df80f83",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2MDIsImlhdCI6MTc5MzM1NDcwMiwianRpIjoiZmI2ZDUxZWMtMmUwYS00MTdjLTgyZDUtMzdkZTI2YzZhZjIzIiwic2lkIjoiMjg1YTI3YjItNjUzMi00NzE4LWJlZTUtZjc4YzFkZjgwZjgzIn0.UQ3LYI2WuO5AUmu_zzw_U2BlC3PpZzZ7XxqKTMZYcSE",
  "access_expires_at": "2026-10-30T10:20:02.906378341Z",
  "refresh_token": "CDnrfUnPJNhP1NEJz5Lh9gsNdcniWnKeMPj0eoZqdvY",
  "refresh_expires_at": "2026-10-30T22:05:02.90576326Z",
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
  "session_id": "dcaa14fe-e853-4463-ac45-d1a97e04e996",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2MDMsImlhdCI6MTc5MzM1NDcwMywianRpIjoiMWRhMTMzYzgtMzcxZC00YTY5LWJlM2MtZTM1ZjYxMDMxNmE4Iiwic2lkIjoiZGNhYTE0ZmUtZTg1My00NDYzLWFjNDUtZDFhOTdlMDRlOTk2In0.O6DbyJxHdYY8Gembwf9BxbvSAH-AGcCfTRwn0C63YZA",
  "access_expires_at": "2026-10-30T10:20:03.488215058Z",
  "refresh_token": "p2JuDQM5E62Ujym1HjvnV0s4fC7l8sYQUkU83qgJJ2c",
  "refresh_expires_at": "2026-10-30T22:05:03.487587544Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/60b0ec73-c2b3-4e7c-a024-bd383a6f7102` → **200**

```json
{
  "id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c05b4ef0-2a86-43e8-b033-f901cfaeaa84",
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
    "id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e",
    "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T10:04:59.01171Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/60b0ec73-c2b3-4e7c-a024-bd383a6f7102/interrupt` → **200**

```json
{
  "command_id": "36047824-c3be-49e4-b744-9eef8ec1de06",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "c05b4ef0-2a86-43e8-b033-f901cfaeaa84",
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
      "id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e",
      "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9fcfa28b-0b03-4402-a6b7-f3fe2f6096d9",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T10:04:59.01171Z",
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
    "id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "c05b4ef0-2a86-43e8-b033-f901cfaeaa84",
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
    "id": "b935aa2d-3890-49b3-9ca4-b71ad610459d",
    "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
    "expires_at": "2026-10-30T10:05:19.085072Z",
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

`POST /api/driver/v1/offers/b935aa2d-3890-49b3-9ca4-b71ad610459d/accept` → **200**

```json
{
  "command_id": "9e1672d9-3e11-4dcd-b956-19e54bda701c"
}
```

```json
{
  "id": "0c4d33c9-ed9e-4f17-a0bd-69191840aefc",
  "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c1705496-d38c-4cf2-a859-64ce58158256",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c1705496-d38c-4cf2-a859-64ce58158256",
  "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
  "assignment_id": "0c4d33c9-ed9e-4f17-a0bd-69191840aefc",
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
  "session_id": "3d374e6d-072c-46f7-82bd-f8cb44a7671d",
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
  "last_heartbeat_at": "2026-10-30T10:05:02.312128Z",
  "last_location_at": "2026-10-30T10:05:02.312128Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3d374e6d-072c-46f7-82bd-f8cb44a7671d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:05Z",
    "sequence": 1793354705573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3d374e6d-072c-46f7-82bd-f8cb44a7671d",
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
  "last_heartbeat_at": "2026-10-30T10:05:05.591989Z",
  "last_location_at": "2026-10-30T10:05:05.591989Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c1705496-d38c-4cf2-a859-64ce58158256/arrive` → **200**

```json
{
  "command_id": "2e25ee0e-ba2e-4d24-aea5-c4c1b0eb92e5",
  "expected_version": 0
}
```

```json
{
  "id": "c1705496-d38c-4cf2-a859-64ce58158256",
  "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
  "assignment_id": "0c4d33c9-ed9e-4f17-a0bd-69191840aefc",
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
  "arrived_at": "2026-10-30T10:05:05.886871Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c1705496-d38c-4cf2-a859-64ce58158256/start` → **200**

```json
{
  "command_id": "8ff4789c-a5f5-4813-bf0c-6ed2ef13da26",
  "expected_version": 1
}
```

```json
{
  "id": "c1705496-d38c-4cf2-a859-64ce58158256",
  "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
  "assignment_id": "0c4d33c9-ed9e-4f17-a0bd-69191840aefc",
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
  "arrived_at": "2026-10-30T10:05:05.886871Z",
  "started_at": "2026-10-30T10:05:06.185352Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c1705496-d38c-4cf2-a859-64ce58158256/complete` → **200**

```json
{
  "command_id": "f11a9a40-1a6b-4ea9-80e5-533a70e7a4f1",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:05:06Z"
}
```

```json
{
  "id": "c1705496-d38c-4cf2-a859-64ce58158256",
  "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
  "assignment_id": "0c4d33c9-ed9e-4f17-a0bd-69191840aefc",
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
  "arrived_at": "2026-10-30T10:05:05.886871Z",
  "started_at": "2026-10-30T10:05:06.185352Z",
  "completed_at": "2026-10-30T10:05:06.484769Z",
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
    "id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T10:05:04.07464Z",
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
    "id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:04:59.01171Z",
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

`GET /api/operator/v1/orders/60b0ec73-c2b3-4e7c-a024-bd383a6f7102/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:04:59.012277Z",
      "actor": {
        "type": "CLIENT",
        "id": "c05b4ef0-2a86-43e8-b033-f901cfaeaa84",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
        "quote_id": "d5e1dd42-2eea-42d9-9fca-02cb8593cec4",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "ff1aa458-17f8-4485-abb8-fd80d5870896"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:04:59.014378Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
        "attempt_id": "bae18922-e1ed-4536-abc9-c69ff6609a21",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ff1aa458-17f8-4485-abb8-fd80d5870896"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:04:59.01761Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "affcd72a-975e-42e3-81ff-c3db114a9d4a",
        "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "ff1aa458-17f8-4485-abb8-fd80d5870896"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:04:59.625988Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "affcd72a-975e-42e3-81ff-c3db114a9d4a",
        "order_id": "60b0ec73-c2b3-4e7c-a024-bd383a6f7102",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f695b8cd-36eb-4c8f-92b5-dd34933e040e"
      },
      "correlation_id": "338c9fe0-4a17-4463-a202-4b443ddd537c"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/76b589e3-6f5e-4acf-9a31-a875b039f00b/tip` → **200**

```json
{
  "order_id": "76b589e3-6f5e-4acf-9a31-a875b039f00b",
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
  "available_until": "2026-10-31T10:05:06.484769Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/76b589e3-6f5e-4acf-9a31-a875b039f00b/tip` → **409**

```json
{
  "command_id": "88fe17ea-5ebe-4b1b-974a-a587638508f2",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/76b589e3-6f5e-4acf-9a31-a875b039f00b/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a2324797-5b85-4ad7-baca-3a8eaeb8232d"
}
```

Done: interrupted 60b0ec73-c2b3-4e7c-a024-bd383a6f7102, follow-up 76b589e3-6f5e-4acf-9a31-a875b039f00b.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2dd5675-4041-4654-9e00-35099676b153",
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
  "last_heartbeat_at": "2026-10-30T10:05:01.11963Z",
  "last_location_at": "2026-10-30T10:05:01.11963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2dd5675-4041-4654-9e00-35099676b153/close` → **200**

```json
{
  "command_id": "6d635147-d95c-447a-9173-b2c228327d9f",
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
  "session_id": "3d374e6d-072c-46f7-82bd-f8cb44a7671d",
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
  "last_heartbeat_at": "2026-10-30T10:05:05.591989Z",
  "last_location_at": "2026-10-30T10:05:05.591989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d374e6d-072c-46f7-82bd-f8cb44a7671d/close` → **200**

```json
{
  "command_id": "7ee10ab2-abc0-46b9-bcbf-6da89c01c9f7",
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
  "session_id": "6f2fe34e-bcf3-40e5-8463-e8870b4075bf",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2MTIsImlhdCI6MTc5MzM1NDcxMiwianRpIjoiOWJhYjNiMjktMjMwNC00ZThiLTkxMTgtYmJiNTJjNDUxODNjIiwic2lkIjoiNmYyZmUzNGUtYmNmMy00MGU1LTg0NjMtZTg4NzBiNDA3NWJmIn0.tR-XpLnI5EvZnkfZExeQojwX1Fyl_lhIc_TOAKfYcfU",
  "access_expires_at": "2026-10-30T10:20:12.743597729Z",
  "refresh_token": "pzidLJYr3G5gSmoLAQcZPnBdOZQ94zn-siZguxxUXvg",
  "refresh_expires_at": "2026-10-30T22:05:12.742011432Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c8e1ad33-c207-4d1e-953a-97d5c9b4457d",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:05:13Z"
}
```

```json
{
  "id": "49e749cc-2e03-4080-82f8-dceb1c5ed235",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:05:13Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/49e749cc-2e03-4080-82f8-dceb1c5ed235/publish` → **200**

```json
{
  "command_id": "4424c52b-39ac-4d5c-baa2-a8ce85abdc70",
  "expected_version": 0
}
```

```json
{
  "id": "49e749cc-2e03-4080-82f8-dceb1c5ed235",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:05:13.429992Z",
  "published_at": "2026-10-30T10:05:13.429992Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "49e749cc-2e03-4080-82f8-dceb1c5ed235",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T10:05:13.429992Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636467536",
  "device_ref": "sandbox-19697"
}
```

```json
{
  "challenge_id": "2369f6ee-1e5c-40b2-ac58-1895d3f98c87",
  "expires_at": "2026-10-30T10:10:14.03531939Z",
  "resend_available_at": "2026-10-30T10:05:15.03531939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636467536` → **200**

```json
{
  "phone": "+380636467536",
  "audience": "CLIENT",
  "code": "686629",
  "sent_at": "2026-10-30T10:05:14.038025697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2369f6ee-1e5c-40b2-ac58-1895d3f98c87",
  "code": "686629",
  "device_ref": "sandbox-19697"
}
```

```json
{
  "session_id": "ba7f3028-ff43-462e-8c29-febe73f962ff",
  "subject": {
    "type": "CLIENT",
    "id": "181d86e0-baa9-4184-8039-b48a78213445"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODFkODZlMC1iYWE5LTQxODQtODAzOS1iNDhhNzgyMTM0NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjE0LCJpYXQiOjE3OTMzNTQ3MTQsImp0aSI6ImQ3ZDIwZTQ0LTBiNTAtNGY5YS1iOTMzLTdjYjNkNTBmYTlhZCIsInNpZCI6ImJhN2YzMDI4LWZmNDMtNDYyZS04YzI5LWZlYmU3M2Y5NjJmZiJ9.XAw7K0hHaoBNs9tSqOmMOFmdnY6fIJwdEK0G-tHaHAQ",
  "access_expires_at": "2026-10-30T10:20:14.345165593Z",
  "refresh_token": "2xmdjeNMOHZ-M_wPmC8MtbQZDAlweOmJIZatGGbJ1jo",
  "refresh_expires_at": "2026-11-29T10:05:14.344419486Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "49e749cc-2e03-4080-82f8-dceb1c5ed235",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T10:05:13.429992Z",
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
  "command_id": "3f7c8896-400b-4ae3-a316-6184093b669c",
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
  "id": "f93439a4-53ea-477c-ab7b-8cc1060876d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:14.923375Z",
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
  "command_id": "004e79b1-7e96-4bb7-afd8-c988526e4513",
  "quote_id": "f93439a4-53ea-477c-ab7b-8cc1060876d2",
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
  "correlation_id": "5d6175ca-3b81-4339-a1bd-1a4232038c31"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "45639192-a27b-49f9-b965-55ba8f743992",
  "version_id": "49e749cc-2e03-4080-82f8-dceb1c5ed235",
  "language": "uk"
}
```

```json
{
  "version_id": "49e749cc-2e03-4080-82f8-dceb1c5ed235",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T10:05:15.505678Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38fcd214-4bbe-42be-9271-dac0135ea871",
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
  "id": "5743deca-2681-40c1-8aa2-9571a70d34c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:15.789802Z",
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
  "command_id": "b1b9c368-e3cc-47d8-8f2e-afa6ffb98a29",
  "quote_id": "5743deca-2681-40c1-8aa2-9571a70d34c9",
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
  "id": "0d785f66-c534-42fc-a871-42e26d13f6d2",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "181d86e0-baa9-4184-8039-b48a78213445",
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
  "created_at": "2026-10-30T10:05:16.078191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0d785f66-c534-42fc-a871-42e26d13f6d2` → **200**

```json
{
  "id": "0d785f66-c534-42fc-a871-42e26d13f6d2",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "181d86e0-baa9-4184-8039-b48a78213445",
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
  "created_at": "2026-10-30T10:05:16.078191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0d785f66-c534-42fc-a871-42e26d13f6d2/cancel` → **200**

```json
{
  "command_id": "919f0c9b-f917-456f-ba5c-a6a4e9c6d501",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0d785f66-c534-42fc-a871-42e26d13f6d2",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "181d86e0-baa9-4184-8039-b48a78213445",
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
  "created_at": "2026-10-30T10:05:16.078191Z",
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

`POST /api/admin/v1/legal-documents/49e749cc-2e03-4080-82f8-dceb1c5ed235` → **409**

```json
{
  "command_id": "25a86a5f-9405-4867-987b-39033f85d7f9",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:05:16Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/49e749cc-2e03-4080-82f8-dceb1c5ed235",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0b3db963-f5ad-4dfb-9bde-3f027b190c23"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dfdae36c-e168-41ae-82dc-7ce0f83c599e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:05:17Z"
}
```

```json
{
  "id": "2815aeae-d244-47a2-b991-f08f8820149e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:05:17Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2815aeae-d244-47a2-b991-f08f8820149e/publish` → **200**

```json
{
  "command_id": "a67c102e-1a94-4112-8ae7-cffe7a63bb61",
  "expected_version": 0
}
```

```json
{
  "id": "2815aeae-d244-47a2-b991-f08f8820149e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:05:17.624932Z",
  "published_at": "2026-10-30T10:05:17.624932Z",
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
  "device_ref": "sandbox-7099"
}
```

```json
{
  "challenge_id": "6189f4a0-a906-4032-b754-7e686e6600d1",
  "expires_at": "2026-10-30T10:10:17.91872905Z",
  "resend_available_at": "2026-10-30T10:05:18.91872905Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "834356",
  "sent_at": "2026-10-30T10:05:17.921635651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6189f4a0-a906-4032-b754-7e686e6600d1",
  "code": "834356",
  "device_ref": "sandbox-7099"
}
```

```json
{
  "session_id": "8c368cfc-7eb9-479d-ab1e-c0f0c1284058",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTYxOCwiaWF0IjoxNzkzMzU0NzE4LCJqdGkiOiIyZTg3ZTJlYS00ZTZlLTRkN2YtYTJlNC0wZDAyOWYwZDU5ZTciLCJzaWQiOiI4YzM2OGNmYy03ZWI5LTQ3OWQtYWIxZS1jMGYwYzEyODQwNTgifQ.mh6JRJeXG-LApc3uemvuIrDjyezSVki9jhBMeLal0Ak",
  "access_expires_at": "2026-10-30T10:20:18.239193303Z",
  "refresh_token": "iVKD4-WCb8BUKrS12abprGFl-cAd4TlbJlyKcmCikb8",
  "refresh_expires_at": "2026-11-29T10:05:18.23861884Z",
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
  "command_id": "73a68a2c-d9cf-4ab0-906a-7623d34f6144",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:18Z",
    "sequence": 1793354718797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "35eb34db-e899-49c2-a574-496132ff3e32",
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
  "last_heartbeat_at": "2026-10-30T10:05:18.816351Z",
  "last_location_at": "2026-10-30T10:05:18.816351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675168690",
  "device_ref": "sandbox-7058"
}
```

```json
{
  "challenge_id": "27b64c25-2e89-4956-b315-08cef9a42a53",
  "expires_at": "2026-10-30T10:10:19.105947377Z",
  "resend_available_at": "2026-10-30T10:05:20.105947377Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675168690` → **200**

```json
{
  "phone": "+380675168690",
  "audience": "CLIENT",
  "code": "143347",
  "sent_at": "2026-10-30T10:05:19.108751338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27b64c25-2e89-4956-b315-08cef9a42a53",
  "code": "143347",
  "device_ref": "sandbox-7058"
}
```

```json
{
  "session_id": "4cb053fe-34c2-48b8-ab0e-133d158403d3",
  "subject": {
    "type": "CLIENT",
    "id": "5036a8b8-3eca-412a-aafa-da73763f22ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDM2YThiOC0zZWNhLTQxMmEtYWFmYS1kYTczNzYzZjIyZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjE5LCJpYXQiOjE3OTMzNTQ3MTksImp0aSI6IjQ3OTcyMDFlLTcxNjMtNGMwMC05NTU0LWEzNDAzZjliM2M5YSIsInNpZCI6IjRjYjA1M2ZlLTM0YzItNDhiOC1hYjBlLTEzM2QxNTg0MDNkMyJ9.KTfAMazx4fkiBtwEbJ1kiw8JdccStcOuUDgFpa7keYQ",
  "access_expires_at": "2026-10-30T10:20:19.424982719Z",
  "refresh_token": "ilw63e9pHJ3yFH6VUwoYh6mU7-UfdOY-ofhgKE6JTwA",
  "refresh_expires_at": "2026-11-29T10:05:19.424432681Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bf55861b-028e-429d-a823-2aefb4d09cba",
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
  "id": "e968a120-535f-4383-a9aa-c1721805ef6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:19.732707Z",
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
  "command_id": "588178f8-d70a-42a8-ac9d-55693ddfa8dd",
  "quote_id": "e968a120-535f-4383-a9aa-c1721805ef6a",
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
    "phone": "+380677975389"
  }
}
```

```json
{
  "id": "fde636df-307e-4951-8e62-1ac57c1e4472",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:05:20.046946Z",
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
    "id": "7bec691b-0aa6-4b3a-9578-04546b49254b",
    "order_id": "fde636df-307e-4951-8e62-1ac57c1e4472",
    "expires_at": "2026-10-30T10:05:35.050748Z",
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

`POST /api/driver/v1/offers/7bec691b-0aa6-4b3a-9578-04546b49254b/accept` → **200**

```json
{
  "command_id": "673455e3-3d55-4ff4-b0f6-1ed55912e7c1"
}
```

```json
{
  "id": "b6b38812-2297-4ecf-99e2-5641feb1ac61",
  "order_id": "fde636df-307e-4951-8e62-1ac57c1e4472",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94eecd7c-f744-4738-9d92-9ecc096cbdc8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94eecd7c-f744-4738-9d92-9ecc096cbdc8",
  "order_id": "fde636df-307e-4951-8e62-1ac57c1e4472",
  "assignment_id": "b6b38812-2297-4ecf-99e2-5641feb1ac61",
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
    "phone": "+380677975389"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "adb56e97-e474-4944-8bf5-ce773c6c5825",
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
  "id": "c518478f-784d-44bf-943c-5187147a0b34",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:21.238975Z",
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
  "command_id": "9c899f7c-6985-40f8-bf90-e109d1f9cecc",
  "quote_id": "c518478f-784d-44bf-943c-5187147a0b34",
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
  "id": "a32f8cf5-3e1c-4315-adc6-cb4000f97330",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:05:21.536976Z",
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
  "command_id": "cb19607f-25b8-4aa8-9a9b-511f6db7b460",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T13:05:21Z"
}
```

```json
{
  "id": "c48909ff-0fa4-42a1-9987-ec352b53669b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:21.867422Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:05:21Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ad848192-4e90-487e-a800-f25af614042a",
  "quote_id": "c48909ff-0fa4-42a1-9987-ec352b53669b",
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
  "pickup_at": "2026-10-30T13:05:21Z"
}
```

```json
{
  "id": "9e547652-6e8f-4a57-9c2b-596ca6c0b41a",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:05:22.174553Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:05:21Z",
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
  "command_id": "2b48e3f9-c52e-4a22-9d72-a30ada24d2b9",
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
  "id": "94d2ed90-1527-4cef-b9b1-9bf7869412d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:22.487138Z",
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
  "command_id": "d53c8524-b04f-48a7-b17f-44f628a1eddf",
  "quote_id": "94d2ed90-1527-4cef-b9b1-9bf7869412d4",
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
  "correlation_id": "cd687b1c-6f6f-4f69-8ee4-c291d40a0ba0"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9e547652-6e8f-4a57-9c2b-596ca6c0b41a",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T10:05:22.174553Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T13:05:21Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "a32f8cf5-3e1c-4315-adc6-cb4000f97330",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T10:05:21.536976Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "fde636df-307e-4951-8e62-1ac57c1e4472",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "a32f8cf5-3e1c-4315-adc6-cb4000f97330",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:05:21.536976Z",
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

`GET /api/rider/v1/orders/fde636df-307e-4951-8e62-1ac57c1e4472` → **200**

```json
{
  "id": "fde636df-307e-4951-8e62-1ac57c1e4472",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b6b38812-2297-4ecf-99e2-5641feb1ac61",
    "order_id": "fde636df-307e-4951-8e62-1ac57c1e4472",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "94eecd7c-f744-4738-9d92-9ecc096cbdc8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T10:05:20.046946Z",
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
    "location_at": "2026-10-30T10:05:18.816351Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/fde636df-307e-4951-8e62-1ac57c1e4472/cancel` → **200**

```json
{
  "command_id": "e5bde68d-895c-404f-b5c6-41985f18cc83",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fde636df-307e-4951-8e62-1ac57c1e4472",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b6b38812-2297-4ecf-99e2-5641feb1ac61",
    "order_id": "fde636df-307e-4951-8e62-1ac57c1e4472",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "94eecd7c-f744-4738-9d92-9ecc096cbdc8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:05:20.046946Z",
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

`GET /api/rider/v1/orders/a32f8cf5-3e1c-4315-adc6-cb4000f97330` → **200**

```json
{
  "id": "a32f8cf5-3e1c-4315-adc6-cb4000f97330",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:05:21.536976Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a32f8cf5-3e1c-4315-adc6-cb4000f97330/cancel` → **200**

```json
{
  "command_id": "a72cf86a-eb12-4e06-8a40-5ba529edb71c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a32f8cf5-3e1c-4315-adc6-cb4000f97330",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:05:21.536976Z",
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

`GET /api/rider/v1/orders/9e547652-6e8f-4a57-9c2b-596ca6c0b41a` → **200**

```json
{
  "id": "9e547652-6e8f-4a57-9c2b-596ca6c0b41a",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:05:22.174553Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:05:21Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9e547652-6e8f-4a57-9c2b-596ca6c0b41a/cancel` → **200**

```json
{
  "command_id": "8437c4f6-a033-4358-8823-944a93c9d447",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9e547652-6e8f-4a57-9c2b-596ca6c0b41a",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5036a8b8-3eca-412a-aafa-da73763f22ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:05:22.174553Z",
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
  "pickup_at": "2026-10-30T13:05:21Z",
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
  "session_id": "35eb34db-e899-49c2-a574-496132ff3e32",
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
  "last_heartbeat_at": "2026-10-30T10:05:18.816351Z",
  "last_location_at": "2026-10-30T10:05:18.816351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/35eb34db-e899-49c2-a574-496132ff3e32/close` → **200**

```json
{
  "command_id": "7707066d-0b86-4abb-8035-8d704503ae36",
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

Done: orders fde636df-307e-4951-8e62-1ac57c1e4472, a32f8cf5-3e1c-4315-adc6-cb4000f97330, 9e547652-6e8f-4a57-9c2b-596ca6c0b41a.

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
  "session_id": "adf912f6-b06b-4790-837a-e0b90381986c",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2MjYsImlhdCI6MTc5MzM1NDcyNiwianRpIjoiMGZhZjJlNzEtODA0My00MTFlLTkzZTAtZmYxNmEyMDI2OTYyIiwic2lkIjoiYWRmOTEyZjYtYjA2Yi00NzkwLTgzN2EtZTBiOTAzODE5ODZjIn0.Vqm3DMpVUQNsQgngAsQY_Amdg2C8i1RwHPKMQVfgJb8",
  "access_expires_at": "2026-10-30T10:20:26.407382474Z",
  "refresh_token": "NL3M54mlV8-Ngs-vJ_mSTHfxKhqdskZaN17soT8VTqA",
  "refresh_expires_at": "2026-10-30T22:05:26.406777392Z",
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
  "session_id": "c49d5341-ec65-4db5-99df-04d52ef15f2b",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2MjYsImlhdCI6MTc5MzM1NDcyNiwianRpIjoiNWM5NGRiZDItMjhhZi00NDY3LWIyMzctOWYwNTFmNDdiZDBiIiwic2lkIjoiYzQ5ZDUzNDEtZWM2NS00ZGI1LTk5ZGYtMDRkNTJlZjE1ZjJiIn0.BOPrnO5-Pu8VMIhM8OdjEaaA2JV7x3NDSHDRPFRc53Y",
  "access_expires_at": "2026-10-30T10:20:26.989783818Z",
  "refresh_token": "xAXUlqKaBqPG5668GbIPbK_LXFDR_jQ0Y2Eel_lxafM",
  "refresh_expires_at": "2026-10-30T22:05:26.989188686Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28547"
}
```

```json
{
  "challenge_id": "f655d557-be5d-4ecf-8076-afe761a0ed2c",
  "expires_at": "2026-10-30T10:10:27.269419953Z",
  "resend_available_at": "2026-10-30T10:05:28.269419953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "957904",
  "sent_at": "2026-10-30T10:05:27.272213443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f655d557-be5d-4ecf-8076-afe761a0ed2c",
  "code": "957904",
  "device_ref": "sandbox-28547"
}
```

```json
{
  "session_id": "c64dd763-c1e8-4fc8-b281-74b4fd8bd9a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTYyNywiaWF0IjoxNzkzMzU0NzI3LCJqdGkiOiIyY2I4Y2Y4Zi0zM2E2LTRhZGEtYjNkZS00MjFmMjUxODE3YzkiLCJzaWQiOiJjNjRkZDc2My1jMWU4LTRmYzgtYjI4MS03NGI0ZmQ4YmQ5YTMifQ.2XTcRHfdWSDR2Og8K31XIHDNnxnEQQybH6S0PjJ8RXA",
  "access_expires_at": "2026-10-30T10:20:27.592676654Z",
  "refresh_token": "wrO2mdKjxONWacHJxocTYlz7EF5gcsY9TkA3d_6Ir5g",
  "refresh_expires_at": "2026-11-29T10:05:27.592080508Z",
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
  "command_id": "dfe38978-21aa-4633-ab8a-c670439c20ae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:28Z",
    "sequence": 1793354728163
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "417acccd-42f9-41ac-89f4-c73ffc291b8c",
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
  "last_heartbeat_at": "2026-10-30T10:05:28.182595Z",
  "last_location_at": "2026-10-30T10:05:28.182595Z",
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
  "command_id": "d3ff2c5d-ff54-4a23-84f8-fc2ed892b70d",
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
  "effective_at": "2026-10-30T10:05:28.7711Z",
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T10:02:40.395725Z",
  "last_entries": [
    {
      "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T10:02:40.395725Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d26c8f7d-e777-4e53-b99c-91f7972a8d9a",
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
  "id": "a2e8aa04-89be-4582-9272-e52c314deaa1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:29.337250Z",
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
  "command_id": "0bb43c97-f331-49c8-9ee6-f60539fa343b",
  "quote_id": "a2e8aa04-89be-4582-9272-e52c314deaa1",
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
    "phone": "+3806711115422"
  }
}
```

```json
{
  "id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
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
  "created_at": "2026-10-30T10:05:29.634627Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115422"
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
    "id": "10eb6a76-ed2c-4b37-b948-977a2d0ce3e7",
    "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
    "expires_at": "2026-10-30T10:05:44.639338Z",
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

`POST /api/driver/v1/offers/10eb6a76-ed2c-4b37-b948-977a2d0ce3e7/accept` → **200**

```json
{
  "command_id": "1c282a1c-f001-4254-b1dd-cb7f297b4cab"
}
```

```json
{
  "id": "ffb1ac97-7b3d-40b9-b0df-ecad49828c54",
  "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "91f9d23c-a099-4de2-b5fa-5ded1920d3e5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "91f9d23c-a099-4de2-b5fa-5ded1920d3e5",
  "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
  "assignment_id": "ffb1ac97-7b3d-40b9-b0df-ecad49828c54",
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
    "phone": "+3806711115422"
  }
}
```

`POST /api/driver/v1/work-sessions/417acccd-42f9-41ac-89f4-c73ffc291b8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:05:30Z",
    "sequence": 1793354730805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "417acccd-42f9-41ac-89f4-c73ffc291b8c",
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
  "last_heartbeat_at": "2026-10-30T10:05:30.824964Z",
  "last_location_at": "2026-10-30T10:05:30.824964Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/91f9d23c-a099-4de2-b5fa-5ded1920d3e5/arrive` → **200**

```json
{
  "command_id": "0badd9df-8a26-4520-9740-e75773a0131b",
  "expected_version": 0
}
```

```json
{
  "id": "91f9d23c-a099-4de2-b5fa-5ded1920d3e5",
  "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
  "assignment_id": "ffb1ac97-7b3d-40b9-b0df-ecad49828c54",
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
  "arrived_at": "2026-10-30T10:05:31.113882Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115422"
  }
}
```

`POST /api/driver/v1/trips/91f9d23c-a099-4de2-b5fa-5ded1920d3e5/start` → **200**

```json
{
  "command_id": "7b87a07e-8097-443c-9a04-bd67e75332b6",
  "expected_version": 1
}
```

```json
{
  "id": "91f9d23c-a099-4de2-b5fa-5ded1920d3e5",
  "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
  "assignment_id": "ffb1ac97-7b3d-40b9-b0df-ecad49828c54",
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
  "arrived_at": "2026-10-30T10:05:31.113882Z",
  "started_at": "2026-10-30T10:05:31.423298Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115422"
  }
}
```

`POST /api/driver/v1/trips/91f9d23c-a099-4de2-b5fa-5ded1920d3e5/complete` → **200**

```json
{
  "command_id": "b9ec1ffc-a144-420d-997a-60a6a758dce2",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:05:31Z",
  "cash_received": true
}
```

```json
{
  "id": "91f9d23c-a099-4de2-b5fa-5ded1920d3e5",
  "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
  "assignment_id": "ffb1ac97-7b3d-40b9-b0df-ecad49828c54",
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
  "arrived_at": "2026-10-30T10:05:31.113882Z",
  "started_at": "2026-10-30T10:05:31.423298Z",
  "completed_at": "2026-10-30T10:05:31.732906Z",
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
  "command_id": "24b1c130-ced0-46a9-8500-d58844f26b78",
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
  "id": "784ae50f-e3b5-4a02-8c21-a7eb73c4707d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:32.037207Z",
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
  "command_id": "77829d06-b04f-44ab-b308-f9ffda0219a1",
  "quote_id": "784ae50f-e3b5-4a02-8c21-a7eb73c4707d",
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
    "phone": "+3806711115357"
  }
}
```

```json
{
  "id": "7a0a317f-f0da-4b56-b8a8-24cf6fbbee74",
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
  "created_at": "2026-10-30T10:05:32.33327Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115357"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7a0a317f-f0da-4b56-b8a8-24cf6fbbee74` → **200**

```json
{
  "id": "7a0a317f-f0da-4b56-b8a8-24cf6fbbee74",
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
  "created_at": "2026-10-30T10:05:32.33327Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115357"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7a0a317f-f0da-4b56-b8a8-24cf6fbbee74/cancel` → **200**

```json
{
  "command_id": "cc3f6f43-172d-4f2b-a4e0-e1445cedc169",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "7a0a317f-f0da-4b56-b8a8-24cf6fbbee74",
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
  "created_at": "2026-10-30T10:05:32.33327Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115357"
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
  "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T10:02:40.395725Z",
  "last_entries": [
    {
      "order_id": "7a0a317f-f0da-4b56-b8a8-24cf6fbbee74",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T10:05:32.969047Z"
    },
    {
      "order_id": "0d14de54-2b8f-416a-bf55-f3f5f728506a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T10:05:31.737728Z"
    },
    {
      "order_id": "928e9947-f59f-406e-8b69-a60db10d497e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T10:02:40.395725Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "417acccd-42f9-41ac-89f4-c73ffc291b8c",
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
  "last_heartbeat_at": "2026-10-30T10:05:30.824964Z",
  "last_location_at": "2026-10-30T10:05:30.824964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/417acccd-42f9-41ac-89f4-c73ffc291b8c/close` → **200**

```json
{
  "command_id": "327794f8-d878-45b0-9ac2-1450c092b087",
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

Done: operator bonus for fulfilled 0d14de54-2b8f-416a-bf55-f3f5f728506a and operator-fault cancellation 7a0a317f-f0da-4b56-b8a8-24cf6fbbee74.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672880349",
  "device_ref": "sandbox-25670"
}
```

```json
{
  "challenge_id": "e03dc585-d54e-4a1f-9dcf-976e196a020d",
  "expires_at": "2026-10-30T10:10:37.385805462Z",
  "resend_available_at": "2026-10-30T10:05:38.385805462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672880349` → **200**

```json
{
  "phone": "+380672880349",
  "audience": "CLIENT",
  "code": "904370",
  "sent_at": "2026-10-30T10:05:37.388631017Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677401107",
  "device_ref": "sandbox-22007",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b1ab34ba-76e3-4492-af73-262585858a08",
  "expires_at": "2026-10-30T10:10:38.916207789Z",
  "resend_available_at": "2026-10-30T10:05:39.916207789Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677401107` → **200**

```json
{
  "phone": "+380677401107",
  "audience": "CLIENT",
  "code": "791700",
  "sent_at": "2026-10-30T10:05:38.918728666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677401107",
  "device_ref": "sandbox-27893",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "053404e5-0822-4546-9882-218cbb850a86",
  "expires_at": "2026-10-30T10:10:40.427004896Z",
  "resend_available_at": "2026-10-30T10:05:41.427004896Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677401107` → **200**

```json
{
  "phone": "+380677401107",
  "audience": "CLIENT",
  "code": "817541",
  "sent_at": "2026-10-30T10:05:40.430101548Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677570000",
  "device_ref": "sandbox-29974"
}
```

```json
{
  "challenge_id": "17cacc4a-a823-4755-8648-8971680d517f",
  "expires_at": "2026-10-30T10:10:41.936622946Z",
  "resend_available_at": "2026-10-30T10:05:42.936622946Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677570000",
  "device_ref": "sandbox-2173"
}
```

```json
{
  "challenge_id": "5e74ca73-cfa9-46ad-8600-dff04bbde91d",
  "expires_at": "2026-10-30T10:10:43.421922495Z",
  "resend_available_at": "2026-10-30T10:05:44.421922495Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677570000` → **200**

```json
{
  "phone": "+380677570000",
  "audience": "CLIENT",
  "code": "064217",
  "sent_at": "2026-10-30T10:05:43.425123313Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677570000",
  "device_ref": "sandbox-29298",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e4380bbf-2708-46f7-bb8b-45391a0f0ffc",
  "expires_at": "2026-10-30T10:10:44.935707987Z",
  "resend_available_at": "2026-10-30T10:05:45.935707987Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677570000` → **200**

```json
{
  "phone": "+380677570000",
  "audience": "CLIENT",
  "code": "202944",
  "sent_at": "2026-10-30T10:05:44.938391314Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677570000",
  "device_ref": "sandbox-27698",
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
  "correlation_id": "05515375-7705-4cb5-ab1e-1e08dee906d3",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000007665"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "ac281d7f-1bbb-4895-87f4-6db7c788c492"
}
```

`GET /sandbox/v1/otp?phone=%2B442000007665` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120015060"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "2983f1b7-22f9-4317-b5f0-9e501f84f8e2"
}
```

`GET /sandbox/v1/otp?phone=%2B37120015060` → **404**

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
  "session_id": "333af6c3-1d64-4de0-a458-724ad01b9d33",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NDcsImlhdCI6MTc5MzM1NDc0NywianRpIjoiMmJlZTdlMDgtNGQzYy00ZTQ5LWE4ZjUtYTE5NWYwN2JlZmMzIiwic2lkIjoiMzMzYWY2YzMtMWQ2NC00ZGUwLWE0NTgtNzI0YWQwMWI5ZDMzIn0.MGOokeH3a-CTODWLCdCfx_ZJB1rSt-YUPnqFsAidYq4",
  "access_expires_at": "2026-10-30T10:20:47.662888829Z",
  "refresh_token": "9oGiYTlCJGPnMuDOjKlxd0ueCP0QiuIQg1cVxImysUI",
  "refresh_expires_at": "2026-10-30T22:05:47.66231214Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677570000` → **200**

```json
{
  "deliveries": [
    {
      "id": "dd41c1ef-4c82-473e-914e-a129101d4870",
      "challenge_id": "e4380bbf-2708-46f7-bb8b-45391a0f0ffc",
      "phone": "+380677570000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-aa81d668-ba07-4a95-9fe5-d8bb25b3766d",
      "error": null,
      "attempted_at": "2026-10-30T10:05:44.938888Z"
    },
    {
      "id": "f4821f23-9ab6-4c01-a646-8b3ce5ce36d8",
      "challenge_id": "5e74ca73-cfa9-46ad-8600-dff04bbde91d",
      "phone": "+380677570000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b1bea4dd-6ea8-4455-b627-8633ec06e995",
      "error": null,
      "attempted_at": "2026-10-30T10:05:43.425598Z"
    },
    {
      "id": "b3682fba-09ab-4d05-b5a7-4246783b8310",
      "challenge_id": "17cacc4a-a823-4755-8648-8971680d517f",
      "phone": "+380677570000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T10:05:41.939703Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677570000` → **200**

```json
{
  "phone": "+380677570000",
  "audience": "CLIENT",
  "code": "202944",
  "sent_at": "2026-10-30T10:05:44.938391314Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677401107` → **200**

```json
{
  "deliveries": [
    {
      "id": "2728fb1c-c372-491e-90f6-23d00bcd7143",
      "challenge_id": "053404e5-0822-4546-9882-218cbb850a86",
      "phone": "+380677401107",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-55d19839-6b2f-4737-ab84-5ec2db6a4c11",
      "error": null,
      "attempted_at": "2026-10-30T10:05:40.430359Z"
    },
    {
      "id": "446ab21a-d27e-4c74-ace8-8e27013f2223",
      "challenge_id": "b1ab34ba-76e3-4492-af73-262585858a08",
      "phone": "+380677401107",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-654d45fe-71e4-4b55-acf4-52a02046bd04",
      "error": null,
      "attempted_at": "2026-10-30T10:05:38.919029Z"
    }
  ]
}
```

Done: SMS to +380672880349; SMS then a call to +380677401107; a failed SMS, two calls and a refused third to +380677570000; +44 and +371 refused.

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
  "session_id": "7f443f42-ba28-4f54-b1d4-ffd543669bc5",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NDgsImlhdCI6MTc5MzM1NDc0OCwianRpIjoiMzZlYWZmNjctODNlZS00YTUzLThhYjAtNjk0YjMzMzBlOTFhIiwic2lkIjoiN2Y0NDNmNDItYmEyOC00ZjU0LWIxZDQtZmZkNTQzNjY5YmM1In0.jqUZzA4Do6h9m5hvStiPWYjh5vsI-E6PAfgX4iwvITA",
  "access_expires_at": "2026-10-30T10:20:48.882844282Z",
  "refresh_token": "IsFFa_r9haW1zR4rvfmuEKYiMDROZOf93Dcweu2wJA0",
  "refresh_expires_at": "2026-10-30T22:05:48.882099618Z",
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
  "session_id": "df1ea083-2192-4c26-831f-af00cb40b0d4",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NDksImlhdCI6MTc5MzM1NDc0OSwianRpIjoiMzcyZDFlMjMtNzAyZS00YTc3LWFjNGMtYTI4ZmQxNDA1MjgzIiwic2lkIjoiZGYxZWEwODMtMjE5Mi00YzI2LTgzMWYtYWYwMGNiNDBiMGQ0In0.pfCuionY0q1BUo16NfP1SzqJerpwotOHKLQLEngRFWU",
  "access_expires_at": "2026-10-30T10:20:49.460013345Z",
  "refresh_token": "ll94JlKWZBMn1rkkXfOZrhq7I9r6gZRqHNAjzmNQlNo",
  "refresh_expires_at": "2026-10-30T22:05:49.459318975Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b477a07b-147c-491d-98d2-42d588071767",
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

`POST /api/admin/v1/staff-extensions/b477a07b-147c-491d-98d2-42d588071767` → **200**

```json
{
  "command_id": "01c97aec-ff07-40c3-9e96-e219b2347cdb",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b477a07b-147c-491d-98d2-42d588071767",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "5a2ed4e0-6618-493b-a427-b463770bf411",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:05:50.639102Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:05:50.639102Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8d0404ef-2b4d-4b0c-bd11-5afa0f5bafa3",
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
  "id": "9e2d1a6c-1b00-4df8-8f83-1cb978fff65e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:10:51.203675Z",
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
  "command_id": "f83a777b-f495-4fd4-b91c-47b129a39c7a",
  "quote_id": "9e2d1a6c-1b00-4df8-8f83-1cb978fff65e",
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
    "phone": "+380679876722"
  }
}
```

```json
{
  "id": "525a7c5f-a3de-4232-b879-931e875255e7",
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
  "created_at": "2026-10-30T10:05:51.515204Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679876722"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/525a7c5f-a3de-4232-b879-931e875255e7/calls` → **201**

```json
{
  "command_id": "42f7e516-a467-483c-a7dc-5365dfa6e391",
  "to": "CALLER"
}
```

```json
{
  "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
  "order_ids": [
    "525a7c5f-a3de-4232-b879-931e875255e7"
  ],
  "started_at": "2026-10-30T10:05:51.844996Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/525a7c5f-a3de-4232-b879-931e875255e7/calls` → **201**

```json
{
  "command_id": "42f7e516-a467-483c-a7dc-5365dfa6e391",
  "to": "CALLER"
}
```

```json
{
  "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
  "order_ids": [
    "525a7c5f-a3de-4232-b879-931e875255e7"
  ],
  "started_at": "2026-10-30T10:05:51.844996Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679876722",
    "at": "2026-10-30T10:05:51.847639928Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.32717",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "aac986b5-693a-45ea-aafc-75d1ffa44c16"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=525a7c5f-a3de-4232-b879-931e875255e7` → **200**

```json
{
  "calls": [
    {
      "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [
        "525a7c5f-a3de-4232-b879-931e875255e7"
      ],
      "started_at": "2026-10-30T10:05:51.844996Z",
      "answered_at": "2026-10-30T10:05:52.522323Z",
      "ended_at": "2026-10-30T10:05:52.544157Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=525a7c5f-a3de-4232-b879-931e875255e7` → **200**

```json
{
  "calls": [
    {
      "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [
        "525a7c5f-a3de-4232-b879-931e875255e7"
      ],
      "started_at": "2026-10-30T10:05:51.844996Z",
      "answered_at": "2026-10-30T10:05:52.522323Z",
      "ended_at": "2026-10-30T10:05:52.544157Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=525a7c5f-a3de-4232-b879-931e875255e7` → **200**

```json
{
  "calls": [
    {
      "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [
        "525a7c5f-a3de-4232-b879-931e875255e7"
      ],
      "started_at": "2026-10-30T10:05:51.844996Z",
      "answered_at": "2026-10-30T10:05:52.522323Z",
      "ended_at": "2026-10-30T10:05:52.544157Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=525a7c5f-a3de-4232-b879-931e875255e7` → **200**

```json
{
  "calls": [
    {
      "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [
        "525a7c5f-a3de-4232-b879-931e875255e7"
      ],
      "started_at": "2026-10-30T10:05:51.844996Z",
      "answered_at": "2026-10-30T10:05:52.522323Z",
      "ended_at": "2026-10-30T10:05:52.544157Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=525a7c5f-a3de-4232-b879-931e875255e7` → **200**

```json
{
  "calls": [
    {
      "id": "aac986b5-693a-45ea-aafc-75d1ffa44c16",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b477a07b-147c-491d-98d2-42d588071767",
      "order_ids": [
        "525a7c5f-a3de-4232-b879-931e875255e7"
      ],
      "started_at": "2026-10-30T10:05:51.844996Z",
      "answered_at": "2026-10-30T10:05:52.522323Z",
      "ended_at": "2026-10-30T10:05:52.544157Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:06:00.019545Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/525a7c5f-a3de-4232-b879-931e875255e7` → **200**

```json
{
  "id": "525a7c5f-a3de-4232-b879-931e875255e7",
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
  "created_at": "2026-10-30T10:05:51.515204Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679876722"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/525a7c5f-a3de-4232-b879-931e875255e7/cancel` → **200**

```json
{
  "command_id": "6d7341c1-e258-4da5-a121-30a89d843a76",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "525a7c5f-a3de-4232-b879-931e875255e7",
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
  "created_at": "2026-10-30T10:05:51.515204Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679876722"
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
  "command_id": "7c9e65b6-4db5-4321-9d6f-66c9eac0bb95",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T10:06:02.737205Z",
  "extension": "101"
}
```

Done: outgoing call aac986b5-693a-45ea-aafc-75d1ffa44c16 from order 525a7c5f-a3de-4232-b879-931e875255e7, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638946059",
  "device_ref": "sandbox-23462"
}
```

```json
{
  "challenge_id": "e3f95c3a-5386-4c76-ab1a-eadb45f980f9",
  "expires_at": "2026-10-30T10:11:03.028792327Z",
  "resend_available_at": "2026-10-30T10:06:04.028792327Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638946059` → **200**

```json
{
  "phone": "+380638946059",
  "audience": "CLIENT",
  "code": "621548",
  "sent_at": "2026-10-30T10:06:03.031860506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3f95c3a-5386-4c76-ab1a-eadb45f980f9",
  "code": "621548",
  "device_ref": "sandbox-23462"
}
```

```json
{
  "session_id": "00606e4a-1239-4643-ac63-3237e15ee22e",
  "subject": {
    "type": "CLIENT",
    "id": "ab0698af-8a74-455e-a4b8-e0e217606138"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjA2OThhZi04YTc0LTQ1NWUtYTRiOC1lMGUyMTc2MDYxMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjYzLCJpYXQiOjE3OTMzNTQ3NjMsImp0aSI6IjJjZTJjOGY3LWE2NGItNGMwOC05ZjZhLWNjMzcyZWFkMzEyMCIsInNpZCI6IjAwNjA2ZTRhLTEyMzktNDY0My1hYzYzLTMyMzdlMTVlZTIyZSJ9.-_nj3tsEMSgVT3cbvmO6n15jp5sh3wgiGddMIrx-yW0",
  "access_expires_at": "2026-10-30T10:21:03.33805645Z",
  "refresh_token": "dwCEOCRItbmxnCOqs8KCGvRLdeVF4KSfHZaypCYlMic",
  "refresh_expires_at": "2026-11-29T10:06:03.337501141Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ab0698af-8a74-455e-a4b8-e0e217606138",
  "session_id": "00606e4a-1239-4643-ac63-3237e15ee22e",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638946059",
  "device_ref": "sandbox-24403"
}
```

```json
{
  "challenge_id": "de741136-43b4-4c84-9ab8-db6b1fe9e992",
  "expires_at": "2026-10-30T10:11:05.903086069Z",
  "resend_available_at": "2026-10-30T10:06:06.903086069Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638946059` → **200**

```json
{
  "phone": "+380638946059",
  "audience": "CLIENT",
  "code": "549850",
  "sent_at": "2026-10-30T10:06:05.905723407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de741136-43b4-4c84-9ab8-db6b1fe9e992",
  "code": "549850",
  "device_ref": "sandbox-24403"
}
```

```json
{
  "session_id": "4bff0fb7-4c4a-45a7-85b8-3e3495b095dd",
  "subject": {
    "type": "CLIENT",
    "id": "ab0698af-8a74-455e-a4b8-e0e217606138"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjA2OThhZi04YTc0LTQ1NWUtYTRiOC1lMGUyMTc2MDYxMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjY2LCJpYXQiOjE3OTMzNTQ3NjYsImp0aSI6ImFjY2RmMzFjLWMxYWEtNDA0MC05ODA1LTlmMzE2ZDZjNGU3MiIsInNpZCI6IjRiZmYwZmI3LTRjNGEtNDVhNy04NWI4LTNlMzQ5NWIwOTVkZCJ9.SOdIW-4nMETdl3hYapN6mRawx0fwfBwJmg0_y3TNENY",
  "access_expires_at": "2026-10-30T10:21:06.213339327Z",
  "refresh_token": "AOwdnWt8YvgMuodKO13pezWKTBzs7BAIyi_5lUR6ugU",
  "refresh_expires_at": "2026-11-29T10:06:06.212638676Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "6e5807df-8353-406b-b1c5-7c53cccb5a44",
  "expires_at": "2026-10-30T10:11:08.507073181Z",
  "resend_available_at": "2026-10-30T10:06:09.507073181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638946059` → **200**

```json
{
  "phone": "+380638946059",
  "audience": "CLIENT",
  "code": "158598",
  "sent_at": "2026-10-30T10:06:08.510008406Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633475499"
}
```

```json
{
  "challenge_id": "05e5fbe1-31ca-4fae-acf8-6617463985db",
  "expires_at": "2026-10-30T10:11:08.815664014Z",
  "resend_available_at": "2026-10-30T10:06:09.815664014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633475499` → **200**

```json
{
  "phone": "+380633475499",
  "audience": "CLIENT",
  "code": "800013",
  "sent_at": "2026-10-30T10:06:08.818061201Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "66a8518a-089f-41ac-8fb7-ab13bd7a6fab",
  "current_challenge_id": "6e5807df-8353-406b-b1c5-7c53cccb5a44",
  "current_code": "000000",
  "new_challenge_id": "05e5fbe1-31ca-4fae-acf8-6617463985db",
  "new_code": "800013"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "cfa1729f-3dd6-43a4-bf8f-ed5d950aceb2"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "a548f1c1-e46b-4e47-b942-26776e882056",
  "current_challenge_id": "6e5807df-8353-406b-b1c5-7c53cccb5a44",
  "current_code": "158598",
  "new_challenge_id": "05e5fbe1-31ca-4fae-acf8-6617463985db",
  "new_code": "800013"
}
```

```json
{
  "subject_id": "ab0698af-8a74-455e-a4b8-e0e217606138",
  "phone": "+380633475499",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ab0698af-8a74-455e-a4b8-e0e217606138",
  "session_id": "00606e4a-1239-4643-ac63-3237e15ee22e",
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
  "correlation_id": "ff4f2e8c-0840-49a8-bf60-5a6ed6a2c473"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633475499",
  "device_ref": "sandbox-7201"
}
```

```json
{
  "challenge_id": "fd708962-b99b-43ae-9a70-5a1fcc8b4b79",
  "expires_at": "2026-10-30T10:11:12.323608043Z",
  "resend_available_at": "2026-10-30T10:06:13.323608043Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633475499` → **200**

```json
{
  "phone": "+380633475499",
  "audience": "CLIENT",
  "code": "075636",
  "sent_at": "2026-10-30T10:06:12.326756434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd708962-b99b-43ae-9a70-5a1fcc8b4b79",
  "code": "075636",
  "device_ref": "sandbox-7201"
}
```

```json
{
  "session_id": "78031104-ddab-4933-953f-cd058541267c",
  "subject": {
    "type": "CLIENT",
    "id": "ab0698af-8a74-455e-a4b8-e0e217606138"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjA2OThhZi04YTc0LTQ1NWUtYTRiOC1lMGUyMTc2MDYxMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjcyLCJpYXQiOjE3OTMzNTQ3NzIsImp0aSI6ImEzYjEyMTRhLWE0NTEtNGViYS05OTA5LWU1ZWExODA4NTU2MyIsInNpZCI6Ijc4MDMxMTA0LWRkYWItNDkzMy05NTNmLWNkMDU4NTQxMjY3YyJ9.1eustVLQkvmFLqGs_QyTgk71EkR67b_xGzeMcjJNVuc",
  "access_expires_at": "2026-10-30T10:21:12.675163282Z",
  "refresh_token": "L5JnCMVI62B7NKCdyqoRRFszQt_qww-DsdbAY5t0ihE",
  "refresh_expires_at": "2026-11-29T10:06:12.67455445Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ab0698af-8a74-455e-a4b8-e0e217606138",
  "session_id": "78031104-ddab-4933-953f-cd058541267c",
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
  "session_id": "9ad6dd54-4408-484b-b51a-0f56d2c2dbda",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NzMsImlhdCI6MTc5MzM1NDc3MywianRpIjoiOGM0NDdlYzgtY2FmYy00YmY1LWI2YmUtZWQzOTQ5Y2Q0MTYxIiwic2lkIjoiOWFkNmRkNTQtNDQwOC00ODRiLWI1MWEtMGY1NmQyYzJkYmRhIn0.K9c3e73904LzdfJ-vFNv4sg5fCRfX0VeSTDt9Fa95-s",
  "access_expires_at": "2026-10-30T10:21:13.576158742Z",
  "refresh_token": "GUxkhNzB8ZVNn6_zHkDW9cwZZIfCvRXetdrJB6ebbUA",
  "refresh_expires_at": "2026-10-30T22:06:13.575604445Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138` → **200**

```json
{
  "client": {
    "id": "ab0698af-8a74-455e-a4b8-e0e217606138",
    "phone": "+380633475499",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:06:03.335968Z",
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

`POST /api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138/phone/new-code` → **201**

```json
{
  "phone": "+380639876736"
}
```

```json
{
  "challenge_id": "01650b8f-35ac-4deb-bd79-9d7562c0f74a",
  "expires_at": "2026-10-30T10:11:14.186612469Z",
  "resend_available_at": "2026-10-30T10:06:15.186612469Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639876736` → **200**

```json
{
  "phone": "+380639876736",
  "audience": "CLIENT",
  "code": "108803",
  "sent_at": "2026-10-30T10:06:14.189054677Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138/phone` → **422**

```json
{
  "command_id": "93354b4a-8e0c-4500-a28b-69dea18efb5c",
  "expected_version": 3,
  "new_challenge_id": "01650b8f-35ac-4deb-bd79-9d7562c0f74a",
  "new_code": "108804",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6086f2e7-0ecd-477d-ab8a-48382067881b"
}
```

`POST /api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138/phone` → **400**

```json
{
  "command_id": "a357dd28-c801-48b4-b0c7-306df924e42c",
  "expected_version": 3,
  "new_challenge_id": "01650b8f-35ac-4deb-bd79-9d7562c0f74a",
  "new_code": "108803",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "dc78245d-7c86-4db9-9632-0dd557ff9c86",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/ab0698af-8a74-455e-a4b8-e0e217606138/phone` → **200**

```json
{
  "command_id": "598fc72c-4f6e-4b05-b48f-fff9512e0019",
  "expected_version": 3,
  "new_challenge_id": "01650b8f-35ac-4deb-bd79-9d7562c0f74a",
  "new_code": "108803",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "ab0698af-8a74-455e-a4b8-e0e217606138",
  "phone": "+380639876736",
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
  "correlation_id": "213ef16e-01f7-42a3-a359-64b4202d65b3"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639876736",
  "device_ref": "sandbox-11212"
}
```

```json
{
  "challenge_id": "a72dd148-44f0-40ac-a2aa-1380bb057647",
  "expires_at": "2026-10-30T10:11:15.707777729Z",
  "resend_available_at": "2026-10-30T10:06:16.707777729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639876736` → **200**

```json
{
  "phone": "+380639876736",
  "audience": "CLIENT",
  "code": "613510",
  "sent_at": "2026-10-30T10:06:15.710697312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a72dd148-44f0-40ac-a2aa-1380bb057647",
  "code": "613510",
  "device_ref": "sandbox-11212"
}
```

```json
{
  "session_id": "6aa213fc-9c55-472d-a11a-4bdc1bebcca0",
  "subject": {
    "type": "CLIENT",
    "id": "ab0698af-8a74-455e-a4b8-e0e217606138"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjA2OThhZi04YTc0LTQ1NWUtYTRiOC1lMGUyMTc2MDYxMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Njc2LCJpYXQiOjE3OTMzNTQ3NzYsImp0aSI6IjYxZDU4YjM3LTY2ODYtNDM0Mi05NTk1LTg2ZmExZTc2ODkzNiIsInNpZCI6IjZhYTIxM2ZjLTljNTUtNDcyZC1hMTFhLTRiZGMxYmViY2NhMCJ9.L8X9DMRe80d-2wjDK8Y0vbqU5NDmVKLVRI2O9dHzXS0",
  "access_expires_at": "2026-10-30T10:21:16.014696842Z",
  "refresh_token": "zyO1gg7th0HNQG_1Vm4hsDUp3xoYeoKReM3nrZSQjqQ",
  "refresh_expires_at": "2026-11-29T10:06:16.014150239Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ab0698af-8a74-455e-a4b8-e0e217606138",
  "session_id": "6aa213fc-9c55-472d-a11a-4bdc1bebcca0",
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
  "phone": "+380639073653",
  "device_ref": "sandbox-14353"
}
```

```json
{
  "challenge_id": "3e04dffb-e47a-42b8-9c49-ff152d3d3318",
  "expires_at": "2026-10-30T10:11:16.585420871Z",
  "resend_available_at": "2026-10-30T10:06:17.585420871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639073653` → **200**

```json
{
  "phone": "+380639073653",
  "audience": "CLIENT",
  "code": "024561",
  "sent_at": "2026-10-30T10:06:16.588160264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e04dffb-e47a-42b8-9c49-ff152d3d3318",
  "code": "024561",
  "device_ref": "sandbox-14353"
}
```

```json
{
  "session_id": "f0448252-3ca4-4f4c-b843-2219ac3a6f43",
  "subject": {
    "type": "CLIENT",
    "id": "48f3c64e-95fb-4eac-9efc-123962fd4970"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OGYzYzY0ZS05NWZiLTRlYWMtOWVmYy0xMjM5NjJmZDQ5NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Njc2LCJpYXQiOjE3OTMzNTQ3NzYsImp0aSI6IjRjY2RhZmU1LWUyZjAtNDE2ZC04NDk5LTZiNDQ1MTQyZDNmYSIsInNpZCI6ImYwNDQ4MjUyLTNjYTQtNGY0Yy1iODQzLTIyMTlhYzNhNmY0MyJ9.ra7puok-M_NrSh-OY2LuQCJJjX4IipH-ctJOkHihPe8",
  "access_expires_at": "2026-10-30T10:21:16.898156121Z",
  "refresh_token": "paQyFeIS2meSmHvivMkwO4RMwXXhC2vXvYU5urpqPoA",
  "refresh_expires_at": "2026-11-29T10:06:16.897619808Z",
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
  "session_id": "2b5f21a1-ed57-462f-96f7-11f3be154eda",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NzgsImlhdCI6MTc5MzM1NDc3OCwianRpIjoiYjViOGM5OTMtOWUzOS00ODU4LTkzOGQtY2E1ODE0YTNkYTE5Iiwic2lkIjoiMmI1ZjIxYTEtZWQ1Ny00NjJmLTk2ZjctMTFmM2JlMTU0ZWRhIn0.Ue3p3dJVql8qH0YAkk8Ksp0Q8kbayNe_y-sQ8MaQZ20",
  "access_expires_at": "2026-10-30T10:21:18.080549143Z",
  "refresh_token": "BtYgoCw9lHNvMXepltLhLHIZOl2YdY927kJFkHeopy8",
  "refresh_expires_at": "2026-10-30T22:06:18.080010947Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639073653` → **200**

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
  "correlation_id": "9b77411f-ef40-4376-96be-016909a55757"
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
  "session_id": "f3038997-2d67-4a4d-88d7-852272a7bfbe",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NzksImlhdCI6MTc5MzM1NDc3OSwianRpIjoiY2U0MjhmYWMtY2IwOC00Y2VhLTg5NzctM2NkYTVlNjE3MTcxIiwic2lkIjoiZjMwMzg5OTctMmQ2Ny00YTRkLTg4ZDctODUyMjcyYTdiZmJlIn0.iXodwE--fqnDACA7QOmqYPLvktNLea1o1X3M5cR9ooE",
  "access_expires_at": "2026-10-30T10:21:19.251188236Z",
  "refresh_token": "E-GiQ7k1n8XGbwu5L4FhY-rIlbe2mRgSgHKjHoILU20",
  "refresh_expires_at": "2026-10-30T22:06:19.25064507Z",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T10:02:11.757711Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "91d9bae4-ebe1-4edd-b9f4-96b7b817b2f9",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T10:06:19.828870708Z"
}
```

## The rider books the airport for 2026-10-30T13:06:18Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600511755",
  "device_ref": "sandbox-15744"
}
```

```json
{
  "challenge_id": "e5a8da37-b617-468f-a7ed-1082effbf50b",
  "expires_at": "2026-10-30T10:11:20.134119696Z",
  "resend_available_at": "2026-10-30T10:06:21.134119696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600511755` → **200**

```json
{
  "phone": "+48600511755",
  "audience": "CLIENT",
  "code": "484530",
  "sent_at": "2026-10-30T10:06:20.136881181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5a8da37-b617-468f-a7ed-1082effbf50b",
  "code": "484530",
  "device_ref": "sandbox-15744"
}
```

```json
{
  "session_id": "ae17295d-3778-49c2-b11f-8ed13199209a",
  "subject": {
    "type": "CLIENT",
    "id": "c8198958-3404-4084-af6c-cd263b5c85dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODE5ODk1OC0zNDA0LTQwODQtYWY2Yy1jZDI2M2I1Yzg1ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjgwLCJpYXQiOjE3OTMzNTQ3ODAsImp0aSI6IjYwYWI0MTQzLTUzMGMtNDRiNC05MDkzLTFhYWNhOGU2NTgxOCIsInNpZCI6ImFlMTcyOTVkLTM3NzgtNDljMi1iMTFmLThlZDEzMTk5MjA5YSJ9.uTjGncJVwGo-s2V91-jWiESYNpPFwEfjMUDccjvlauM",
  "access_expires_at": "2026-10-30T10:21:20.465175159Z",
  "refresh_token": "26dGh5paKeG62IKg7JZ6FHUn237d0DNsbHiXBbRxxNI",
  "refresh_expires_at": "2026-11-29T10:06:20.464580938Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "06e535fd-8ac2-4ca8-b2e8-c826cbd828ae",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T13:06:18Z"
}
```

```json
{
  "id": "6e6ac490-8fe9-41ae-ade5-09d763eec8a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:20.759497Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:06:18Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9dfe4241-7358-4006-8bd3-a31ae710d917",
  "quote_id": "6e6ac490-8fe9-41ae-ade5-09d763eec8a0",
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
  "pickup_at": "2026-10-30T13:06:18Z"
}
```

```json
{
  "id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c8198958-3404-4084-af6c-cd263b5c85dc",
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
  "created_at": "2026-10-30T10:06:21.064345Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:06:18Z",
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
  "device_ref": "sandbox-3573"
}
```

```json
{
  "challenge_id": "10e71fb0-5aa5-4ba9-9f03-ce65e8f26786",
  "expires_at": "2026-10-30T10:11:21.368474501Z",
  "resend_available_at": "2026-10-30T10:06:22.368474501Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "310907",
  "sent_at": "2026-10-30T10:06:21.37111979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10e71fb0-5aa5-4ba9-9f03-ce65e8f26786",
  "code": "310907",
  "device_ref": "sandbox-3573"
}
```

```json
{
  "session_id": "4efb1b37-375f-4b5f-85c1-4a696badb302",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTY4MSwiaWF0IjoxNzkzMzU0NzgxLCJqdGkiOiI5ZjBjMDQ2ZC0zYjkyLTQyNmMtYjY3My1kMzk1ZjcwODVjZGUiLCJzaWQiOiI0ZWZiMWIzNy0zNzVmLTRiNWYtODVjMS00YTY5NmJhZGIzMDIifQ.mUPOkHL_WROcQYAaLYRGgIRgPAqw9p0o7XW3HF7_Grs",
  "access_expires_at": "2026-10-30T10:21:21.679382868Z",
  "refresh_token": "yCNKUSrI0td26IwaLbtfuBBtdGQnB2e_OhknzSEVCBM",
  "refresh_expires_at": "2026-11-29T10:06:21.678746359Z",
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
  "command_id": "91124496-1c6a-413b-b431-4ca6e49ca461",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:22Z",
    "sequence": 1793354782240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5bd22b5b-a92e-4253-afac-014d11522c9c",
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
  "last_heartbeat_at": "2026-10-30T10:06:22.259388Z",
  "last_location_at": "2026-10-30T10:06:22.259388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
      "short_number": 24,
      "pickup_at": "2026-10-30T13:06:18Z",
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

`POST /api/driver/v1/preorders/a23bfe90-9f20-4684-83ab-daa9f905f60e/reserve` → **200**

```json
{
  "command_id": "f4279651-6541-49bd-ac64-017b45a6df67"
}
```

```json
{
  "id": "6a18b9d4-d04e-414f-937d-486ea93ec34d",
  "state": "RESERVED",
  "order": {
    "order_id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
    "short_number": 24,
    "pickup_at": "2026-10-30T13:06:18Z",
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
  "reserved_at": "2026-10-30T10:06:22.852105Z",
  "confirm_from": "2026-10-30T12:36:18Z",
  "confirm_until": "2026-10-30T12:46:18Z",
  "drop_until": "2026-10-30T12:06:18Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6a18b9d4-d04e-414f-937d-486ea93ec34d",
      "state": "RESERVED",
      "order": {
        "order_id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
        "short_number": 24,
        "pickup_at": "2026-10-30T13:06:18Z",
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
      "reserved_at": "2026-10-30T10:06:22.852105Z",
      "confirm_from": "2026-10-30T12:36:18Z",
      "confirm_until": "2026-10-30T12:46:18Z",
      "drop_until": "2026-10-30T12:06:18Z"
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
      "id": "6a18b9d4-d04e-414f-937d-486ea93ec34d",
      "state": "RESERVED",
      "order": {
        "order_id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
        "short_number": 24,
        "pickup_at": "2026-10-30T13:06:18Z",
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
      "reserved_at": "2026-10-30T10:06:22.852105Z",
      "confirm_from": "2026-10-30T12:36:18Z",
      "confirm_until": "2026-10-30T12:46:18Z",
      "drop_until": "2026-10-30T12:06:18Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6a18b9d4-d04e-414f-937d-486ea93ec34d/confirm` → **409**

```json
{
  "command_id": "eb9cecd1-0138-4e05-b54b-4483305dba8d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6a18b9d4-d04e-414f-937d-486ea93ec34d/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0127c12d-26d1-4c50-a5e8-d5671ddf81ce"
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
  "session_id": "20eb3431-37e4-4169-93fc-ba0d2d62194a",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2ODQsImlhdCI6MTc5MzM1NDc4NCwianRpIjoiYWJkNTA1OTgtZDQ0NC00YzdhLTg0ZmMtZTFmMTdjY2I3NWZlIiwic2lkIjoiMjBlYjM0MzEtMzdlNC00MTY5LTkzZmMtYmEwZDJkNjIxOTRhIn0.I6uAe69rHCtkdgMFtpW7qUSAS1mHamPrIqTpgO6WlEk",
  "access_expires_at": "2026-10-30T10:21:24.292129748Z",
  "refresh_token": "1wzhRt5xEj-HGR3-zh92_QTqJizK9FhTErUeZyP5bhU",
  "refresh_expires_at": "2026-10-30T22:06:24.291591331Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a23bfe90-9f20-4684-83ab-daa9f905f60e` → **200**

```json
{
  "id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c8198958-3404-4084-af6c-cd263b5c85dc",
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
  "created_at": "2026-10-30T10:06:21.064345Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T13:06:18Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6a18b9d4-d04e-414f-937d-486ea93ec34d",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T10:06:22.852105Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a23bfe90-9f20-4684-83ab-daa9f905f60e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T10:06:21.065458Z",
      "actor": {
        "type": "CLIENT",
        "id": "c8198958-3404-4084-af6c-cd263b5c85dc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
        "preorder": true,
        "quote_id": "6e6ac490-8fe9-41ae-ade5-09d763eec8a0",
        "pickup_at": "2026-10-30T13:06:18Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "d456818a-fadc-4ab2-a15a-8a078f585aa2"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T10:06:22.853318Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a23bfe90-9f20-4684-83ab-daa9f905f60e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6a18b9d4-d04e-414f-937d-486ea93ec34d"
      },
      "correlation_id": "095592b9-bce2-4502-86ca-7052257bcd2f"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order a23bfe90-9f20-4684-83ab-daa9f905f60e, reservation 6a18b9d4-d04e-414f-937d-486ea93ec34d.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2836"
}
```

```json
{
  "challenge_id": "d224e317-89c8-4a9c-be0e-a063c8d785e3",
  "expires_at": "2026-10-30T10:11:25.177477887Z",
  "resend_available_at": "2026-10-30T10:06:26.177477887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "692144",
  "sent_at": "2026-10-30T10:06:25.180289097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d224e317-89c8-4a9c-be0e-a063c8d785e3",
  "code": "692144",
  "device_ref": "sandbox-2836"
}
```

```json
{
  "session_id": "0a8b3aed-1c1e-435b-a722-a749b03c1495",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTY4NSwiaWF0IjoxNzkzMzU0Nzg1LCJqdGkiOiIzNTY5M2M0OC1jNjVhLTRkMjUtOWIxMS03NjJmZDg3NWVmODUiLCJzaWQiOiIwYThiM2FlZC0xYzFlLTQzNWItYTcyMi1hNzQ5YjAzYzE0OTUifQ.Sj0c7LBg2GWkTKcYXdMZ3WwUcVjpcuCwfLvFmCLIbaE",
  "access_expires_at": "2026-10-30T10:21:25.495049513Z",
  "refresh_token": "K_ZyV0LusAdNqkbArmRtzsHLtaIn6_ZtQioM7v39CwM",
  "refresh_expires_at": "2026-11-29T10:06:25.494299452Z",
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
  "command_id": "7676d769-749d-4a53-8854-a907fbfdab6b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:26Z",
    "sequence": 1793354786565
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:06:26.075674Z",
  "last_location_at": "2026-10-30T10:06:26.075674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670825011",
  "device_ref": "sandbox-10442"
}
```

```json
{
  "challenge_id": "28b5c085-9b9f-41d7-8754-cbd4af4de2d3",
  "expires_at": "2026-10-30T10:11:26.351788296Z",
  "resend_available_at": "2026-10-30T10:06:27.351788296Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670825011` → **200**

```json
{
  "phone": "+380670825011",
  "audience": "CLIENT",
  "code": "406384",
  "sent_at": "2026-10-30T10:06:26.354353989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28b5c085-9b9f-41d7-8754-cbd4af4de2d3",
  "code": "406384",
  "device_ref": "sandbox-10442"
}
```

```json
{
  "session_id": "e262a94e-6b8c-48ff-977d-958ba74bc96c",
  "subject": {
    "type": "CLIENT",
    "id": "c50aae01-137d-4291-820c-3c548f1b9dcc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTBhYWUwMS0xMzdkLTQyOTEtODIwYy0zYzU0OGYxYjlkY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Njg2LCJpYXQiOjE3OTMzNTQ3ODYsImp0aSI6IjYzMzMzNWEyLTJjYmMtNGZlMS1hNzBlLWI2ZDc2MmJjMDlkYyIsInNpZCI6ImUyNjJhOTRlLTZiOGMtNDhmZi05NzdkLTk1OGJhNzRiYzk2YyJ9.YUEYeQKR8CqTtsRsfDpRDNA7St7JXAufVbvg3D5hIn8",
  "access_expires_at": "2026-10-30T10:21:26.658606363Z",
  "refresh_token": "hCgD7rqLYxL74C3FFWYgWOzoVvrcFfnMzVLnGshYzWI",
  "refresh_expires_at": "2026-11-29T10:06:26.657941819Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "302f47e1-79c5-4dae-a857-6a8ee186c76a",
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
  "id": "027b80e7-4ce8-48d9-9ff7-f109175d84f6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:26.948212Z",
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
  "command_id": "9665338b-94e2-41db-96d2-aec4c9efdf19",
  "quote_id": "027b80e7-4ce8-48d9-9ff7-f109175d84f6",
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
  "id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c50aae01-137d-4291-820c-3c548f1b9dcc",
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
  "created_at": "2026-10-30T10:06:27.239837Z",
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
    "id": "d75c3db7-e73b-463b-86cd-7a9cdf501fa6",
    "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
    "expires_at": "2026-10-30T10:06:42.243373Z",
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

`POST /api/driver/v1/offers/d75c3db7-e73b-463b-86cd-7a9cdf501fa6/accept` → **200**

```json
{
  "command_id": "f89913c9-2ff0-4b76-a49b-084aa7809e19"
}
```

```json
{
  "id": "32226fbd-b44b-4a89-b3d2-5fe9d973f476",
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6d734d09-8713-4c0e-aa2e-d56a169676a8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d734d09-8713-4c0e-aa2e-d56a169676a8",
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "assignment_id": "32226fbd-b44b-4a89-b3d2-5fe9d973f476",
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

`POST /api/driver/v1/work-sessions/be0d97c5-8755-45c5-90f9-ee6ee20d2092/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:28Z",
    "sequence": 1793354788395
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:06:28.414376Z",
  "last_location_at": "2026-10-30T10:06:28.414376Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d734d09-8713-4c0e-aa2e-d56a169676a8",
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "assignment_id": "32226fbd-b44b-4a89-b3d2-5fe9d973f476",
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

`POST /api/driver/v1/trips/6d734d09-8713-4c0e-aa2e-d56a169676a8/arrive` → **200**

```json
{
  "command_id": "d0e8f1c0-2814-4e19-9d59-e59e21ec39b1",
  "expected_version": 0
}
```

```json
{
  "id": "6d734d09-8713-4c0e-aa2e-d56a169676a8",
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "assignment_id": "32226fbd-b44b-4a89-b3d2-5fe9d973f476",
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
  "arrived_at": "2026-10-30T10:06:29.00045Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6d734d09-8713-4c0e-aa2e-d56a169676a8/start` → **200**

```json
{
  "command_id": "3d39292a-817e-43e7-9497-b6609b57dd53",
  "expected_version": 1
}
```

```json
{
  "id": "6d734d09-8713-4c0e-aa2e-d56a169676a8",
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "assignment_id": "32226fbd-b44b-4a89-b3d2-5fe9d973f476",
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
  "arrived_at": "2026-10-30T10:06:29.00045Z",
  "started_at": "2026-10-30T10:06:29.290416Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/be0d97c5-8755-45c5-90f9-ee6ee20d2092/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:29Z",
    "sequence": 1793354789573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:06:29.591376Z",
  "last_location_at": "2026-10-30T10:06:29.591376Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/6d734d09-8713-4c0e-aa2e-d56a169676a8/complete` → **200**

```json
{
  "command_id": "8e5cb7f4-c0b3-4ca9-aeba-e4e5c53c6851",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:29Z",
  "cash_received": true
}
```

```json
{
  "id": "6d734d09-8713-4c0e-aa2e-d56a169676a8",
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "assignment_id": "32226fbd-b44b-4a89-b3d2-5fe9d973f476",
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
  "arrived_at": "2026-10-30T10:06:29.00045Z",
  "started_at": "2026-10-30T10:06:29.290416Z",
  "completed_at": "2026-10-30T10:06:29.88301Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/aa87b9bf-b4a8-4064-a519-ad1ed52f8f18/rating` → **200**

```json
{
  "command_id": "4e898446-d0f1-4c33-9f6f-1b26e9fb4476",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "score": 5,
  "created_at": "2026-10-30T10:06:30.186277531Z"
}
```

`POST /api/driver/v1/orders/aa87b9bf-b4a8-4064-a519-ad1ed52f8f18/rating` → **200**

```json
{
  "command_id": "96da8caf-b122-4d4e-91df-3df9f86c9dd9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
  "score": 4,
  "created_at": "2026-10-30T10:06:30.473880076Z"
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
  "session_id": "54187233-a6e5-455e-90a4-b657fd0a4806",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2OTEsImlhdCI6MTc5MzM1NDc5MSwianRpIjoiMTRjNjI5ZDMtMjRjOS00ODZmLWFiYTgtYWE5YTY1ZDQ2MjY1Iiwic2lkIjoiNTQxODcyMzMtYTZlNS00NTVlLTkwYTQtYjY1N2ZkMGE0ODA2In0.E0wvHl6PqHC0cwVEwGnXpqymrmwGGJxnScp2wJeb5kY",
  "access_expires_at": "2026-10-30T10:21:31.355553936Z",
  "refresh_token": "Ps8DD9ovqP2NCQuecnMtlToIN0HYny9a8LYlLPahfik",
  "refresh_expires_at": "2026-10-30T22:06:31.355055063Z",
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
  "session_id": "ddcf9c9e-68a5-49d6-87e9-d2f9945495d3",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2OTEsImlhdCI6MTc5MzM1NDc5MSwianRpIjoiYzQwYjEzZTQtMDkwYi00ODE4LWJlMjAtMzg0YTU1NmU0ZWVkIiwic2lkIjoiZGRjZjljOWUtNjhhNS00OWQ2LTg3ZTktZDJmOTk0NTQ5NWQzIn0.Z7ZBnxbKNNTGs2sLAg0eU8N8AJr9zbzJZo_-k7IEjpc",
  "access_expires_at": "2026-10-30T10:21:31.926469238Z",
  "refresh_token": "Hn8lVxaE_mYLCJmKG_UoeoqO51tNApyeJN5e4SBYMMI",
  "refresh_expires_at": "2026-10-30T22:06:31.925867351Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aa87b9bf-b4a8-4064-a519-ad1ed52f8f18/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
      "author_type": "RIDER",
      "author_id": "c50aae01-137d-4291-820c-3c548f1b9dcc",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T10:06:30.186278Z"
    },
    {
      "order_id": "aa87b9bf-b4a8-4064-a519-ad1ed52f8f18",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "c50aae01-137d-4291-820c-3c548f1b9dcc",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T10:06:30.47388Z"
    }
  ]
}
```

Done: ratings for order aa87b9bf-b4a8-4064-a519-ad1ed52f8f18.

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
  "session_id": "d95e094c-9d94-4a9b-a906-0e27485be72b",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2OTIsImlhdCI6MTc5MzM1NDc5MiwianRpIjoiZWYwMTM1ODAtZDRlNi00NDRjLWIwYjktMGJkMjRiNDA0YTY3Iiwic2lkIjoiZDk1ZTA5NGMtOWQ5NC00YTliLWE5MDYtMGUyNzQ4NWJlNzJiIn0.YxoUX8B6kqD6xO-WHDpvbDvv5hlg-I4Ex1BpUS4Ln-U",
  "access_expires_at": "2026-10-30T10:21:32.795801957Z",
  "refresh_token": "P7VJHF2oO4uH_Y7cRL1At3PG3abqGVvxdpY5FsJyrDk",
  "refresh_expires_at": "2026-10-30T22:06:32.795250625Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d9d34fe4-a8f3-4d57-8ef8-2d172cda6d81",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "79118845-64da-4e52-902f-cacd884e79fa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:33.081414Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/79118845-64da-4e52-902f-cacd884e79fa` → **200**

```json
{
  "id": "79118845-64da-4e52-902f-cacd884e79fa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:33.081414Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/79118845-64da-4e52-902f-cacd884e79fa` → **200**

```json
{
  "id": "79118845-64da-4e52-902f-cacd884e79fa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:33.081414Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/79118845-64da-4e52-902f-cacd884e79fa` → **200**

```json
{
  "id": "79118845-64da-4e52-902f-cacd884e79fa",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:06:33.081414Z",
  "ready_at": "2026-10-30T10:06:35.075562Z",
  "expires_at": "2026-10-31T10:06:35.075562Z"
}
```

`GET /api/admin/v1/reports/exports/79118845-64da-4e52-902f-cacd884e79fa/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "782c9bf3-3ce8-4a97-9dd2-63b9753a56ce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:36.247445Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb` → **200**

```json
{
  "id": "00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:36.247445Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb` → **200**

```json
{
  "id": "00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:36.247445Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb` → **200**

```json
{
  "id": "00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:06:36.247445Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb` → **200**

```json
{
  "id": "00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:06:36.247445Z",
  "ready_at": "2026-10-30T10:06:40.085722Z",
  "expires_at": "2026-10-31T10:06:40.085722Z"
}
```

`GET /api/admin/v1/reports/exports/00cd8a0f-0ffa-4b87-b1f5-5f55e8f6fcfb/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/bddddeb5-38f6-4fb5-a557-64a3c1a88601` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/bddddeb5-38f6-4fb5-a557-64a3c1a88601",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "551ea5ae-47cc-4355-96b6-72dfaf0b2ca1"
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
  "device_ref": "sandbox-7076"
}
```

```json
{
  "challenge_id": "9662fc7b-60ee-4def-9a25-891d63734970",
  "expires_at": "2026-10-30T10:11:41.025846644Z",
  "resend_available_at": "2026-10-30T10:06:42.025846644Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "754782",
  "sent_at": "2026-10-30T10:06:41.028622875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9662fc7b-60ee-4def-9a25-891d63734970",
  "code": "754782",
  "device_ref": "sandbox-7076"
}
```

```json
{
  "session_id": "f941dcfa-6b5d-4ef4-be86-3a0067c87f70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcwMSwiaWF0IjoxNzkzMzU0ODAxLCJqdGkiOiI4ZmFhYzExZi03Y2NlLTQzZjUtOWVmYS00YjFiNDIwZWNjMGEiLCJzaWQiOiJmOTQxZGNmYS02YjVkLTRlZjQtYmU4Ni0zYTAwNjdjODdmNzAifQ.i3bQD6o-jw0nVOyN7QlroXHNZ5fF1mqmfR6OJADpx4s",
  "access_expires_at": "2026-10-30T10:21:41.332592143Z",
  "refresh_token": "N7ny_ZJIgjUXj-RqVlo53HEyz1VE5nV2OM-cB6Ew28Q",
  "refresh_expires_at": "2026-11-29T10:06:41.332019011Z",
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
  "command_id": "2b28823e-3d69-4a36-976f-678e4c6396dc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:42Z",
    "sequence": 1793354802181
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91cd7456-800f-4719-a969-a6b61f79b51c",
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
  "last_heartbeat_at": "2026-10-30T10:06:42.199587Z",
  "last_location_at": "2026-10-30T10:06:42.199587Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "442342dc-4d06-4503-9718-b0b79da8cdd5",
  "points": [
    {
      "sequence": 1793354804491,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:05:44Z"
    },
    {
      "sequence": 1793354804499,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:06:44Z"
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
  "session_id": "ef901591-be11-4d9c-a020-38563c570a82",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MDUsImlhdCI6MTc5MzM1NDgwNSwianRpIjoiMWVkZDk2YTYtOTU5ZC00NWQwLWE5OWMtNTY2ZDMwODM1NDcyIiwic2lkIjoiZWY5MDE1OTEtYmUxMS00ZDljLWEwMjAtMzg1NjNjNTcwYTgyIn0.6lUZaCVYjZYHvn4_SH_So3QVJYM1BTSxug6zbc7HYA4",
  "access_expires_at": "2026-10-30T10:21:45.123409064Z",
  "refresh_token": "-rgKu1FSI6bK1WZRS5s5pEqBfbuz75gpvfwHOn2tyNI",
  "refresh_expires_at": "2026-10-30T22:06:45.122855959Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "084bd569-0d12-469e-a4a8-41195c5f2aeb",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T10:06:44Z",
        "track_point_id": "1f602aa8-9e39-4a86-a73c-f09e1ea12bba",
        "work_session_id": "91cd7456-800f-4719-a969-a6b61f79b51c"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T10:06:44Z",
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

`POST /api/admin/v1/driver-risk-flags/084bd569-0d12-469e-a4a8-41195c5f2aeb/confirm` → **200**

```json
{
  "command_id": "16f76a15-dbe5-4bab-bcf9-3893edceae45",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "084bd569-0d12-469e-a4a8-41195c5f2aeb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T10:06:44Z",
    "track_point_id": "1f602aa8-9e39-4a86-a73c-f09e1ea12bba",
    "work_session_id": "91cd7456-800f-4719-a969-a6b61f79b51c"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T10:06:44Z",
  "reason": null,
  "reviewed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reviewed_at": "2026-10-30T10:06:46.035951Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/084bd569-0d12-469e-a4a8-41195c5f2aeb/dismiss` → **409**

```json
{
  "command_id": "d4383178-277f-45bc-8651-cf8abcf74d50",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/084bd569-0d12-469e-a4a8-41195c5f2aeb/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "737734ea-c113-4208-8953-9a2783b3480b"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a3f52f01-df6f-4609-8fc6-5f300f2fe322",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "87b2e5eb-cfe5-4a06-9e5e-dda7817e71fa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "b477a07b-147c-491d-98d2-42d588071767",
  "raised_at": "2026-10-30T10:06:46.650139Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/87b2e5eb-cfe5-4a06-9e5e-dda7817e71fa/dismiss` → **200**

```json
{
  "command_id": "e70377b0-d53c-4bd0-b47d-f90eea0c087f",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "87b2e5eb-cfe5-4a06-9e5e-dda7817e71fa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "b477a07b-147c-491d-98d2-42d588071767",
  "raised_at": "2026-10-30T10:06:46.650139Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reviewed_at": "2026-10-30T10:06:46.951935Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1545d1cf-f7e1-437b-8e64-a606027579d0",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "084bd569-0d12-469e-a4a8-41195c5f2aeb"
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
      "actor_id": "b477a07b-147c-491d-98d2-42d588071767",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:06:47.262379Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 084bd569-0d12-469e-a4a8-41195c5f2aeb confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "babf843c-6a0b-49e2-9b29-ca23a4207e02",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MDgsImlhdCI6MTc5MzM1NDgwOCwianRpIjoiNzg1NjAzNWMtZWQ3Yi00NTM4LThiMDUtMWJjOWFjZTVhYWE4Iiwic2lkIjoiYmFiZjg0M2MtNmEwYi00OWUyLTliMjktY2EyM2E0MjA3ZTAyIn0.r9qgZHdlL8vNNSdvGFLHdrTwwDhy8pnnypsoyepYBlo",
  "access_expires_at": "2026-10-30T10:21:48.151947717Z",
  "refresh_token": "6XOYOfgBuA7sGIeTd64E1zwBTjpLTEVxFNIRVgpPIcA",
  "refresh_expires_at": "2026-10-30T22:06:48.151323437Z",
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
      "actor_id": "b477a07b-147c-491d-98d2-42d588071767",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:06:47.262379Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "8cdd14c1-599e-42d9-9100-a9feb0b419eb",
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
  "session_id": "91cd7456-800f-4719-a969-a6b61f79b51c",
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
  "last_heartbeat_at": "2026-10-30T10:06:42.199587Z",
  "last_location_at": "2026-10-30T10:06:42.199587Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91cd7456-800f-4719-a969-a6b61f79b51c/close` → **200**

```json
{
  "command_id": "ec19acfe-aa18-4ae2-8978-4ca64454e2db",
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
  "session_id": "33b7bceb-6ed3-491e-9f31-44b2cdadbfa4",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MDksImlhdCI6MTc5MzM1NDgwOSwianRpIjoiYTllODNjNGQtZWFhYy00MzBmLWE5YjktNzI1NzA5NjAyZjUyIiwic2lkIjoiMzNiN2JjZWItNmVkMy00OTFlLTlmMzEtNDRiMmNkYWRiZmE0In0.NLxlQ2hmyA9AvdhOKObVJrLq2KmUf2rXjJzJfD4l6b4",
  "access_expires_at": "2026-10-30T10:21:49.911880947Z",
  "refresh_token": "HwHg1D-rIz5dSngYeWBLOePbfCBCG7-bHyoA1L3gX7A",
  "refresh_expires_at": "2026-10-30T22:06:49.911315941Z",
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
  "command_id": "6fc6387e-9f2c-4ff1-93b4-451f3fb4b9ad",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:06:50.504131Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6fc6387e-9f2c-4ff1-93b4-451f3fb4b9ad",
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
  "changed_by": "b477a07b-147c-491d-98d2-42d588071767",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:06:50.504131Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48630873918",
  "device_ref": "sandbox-16153"
}
```

```json
{
  "challenge_id": "90680ea0-ec93-4895-a183-98607cd03eca",
  "expires_at": "2026-10-30T10:11:51.102563626Z",
  "resend_available_at": "2026-10-30T10:06:52.102563626Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48630873918` → **200**

```json
{
  "phone": "+48630873918",
  "audience": "CLIENT",
  "code": "884943",
  "sent_at": "2026-10-30T10:06:51.105260508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90680ea0-ec93-4895-a183-98607cd03eca",
  "code": "884943",
  "device_ref": "sandbox-16153"
}
```

```json
{
  "session_id": "cd41082a-e5e6-4a6e-b530-458676928dcd",
  "subject": {
    "type": "CLIENT",
    "id": "11a9d447-8f13-4d6d-b549-df6bf36eda4a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWE5ZDQ0Ny04ZjEzLTRkNmQtYjU0OS1kZjZiZjM2ZWRhNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzExLCJpYXQiOjE3OTMzNTQ4MTEsImp0aSI6IjRiMjE4ZmExLWY4OTAtNDJjNS04NDI4LWVlZWQ5NmQxMmY5ZSIsInNpZCI6ImNkNDEwODJhLWU1ZTYtNGE2ZS1iNTMwLTQ1ODY3NjkyOGRjZCJ9.z9ce305mmg6gi0Fo4iCCivJACUAU0wmFv6CadmSyMNU",
  "access_expires_at": "2026-10-30T10:21:51.42073771Z",
  "refresh_token": "kjnH58_1W0ID8_MPmk6TlyCDZKHKO8xE4rSlIDJ7srw",
  "refresh_expires_at": "2026-11-29T10:06:51.420095518Z",
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
  "correlation_id": "dcf80a86-4329-4844-9070-b09bb133c46e"
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
  "device_ref": "sandbox-6158"
}
```

```json
{
  "challenge_id": "b9a4e26b-cc8e-4af6-9007-9afcf9abe32d",
  "expires_at": "2026-10-30T10:11:52.290136839Z",
  "resend_available_at": "2026-10-30T10:06:53.290136839Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "720306",
  "sent_at": "2026-10-30T10:06:52.292658636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9a4e26b-cc8e-4af6-9007-9afcf9abe32d",
  "code": "720306",
  "device_ref": "sandbox-6158"
}
```

```json
{
  "session_id": "691ba6ab-a59f-44cd-82a8-1eb90f296b91",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcxMiwiaWF0IjoxNzkzMzU0ODEyLCJqdGkiOiJjZWM2MzI2Ni1iODNiLTQ0NGQtOTFkNC05ZmM0N2JmMjE4NjEiLCJzaWQiOiI2OTFiYTZhYi1hNTlmLTQ0Y2QtODJhOC0xZWI5MGYyOTZiOTEifQ.GewD4QR0sFfC5sUHdDmjTRtug2V9ux8NErcLUKpwR6s",
  "access_expires_at": "2026-10-30T10:21:52.6027713Z",
  "refresh_token": "jHqhJdX5ZQcTHuhqKqbls4oQr2VVE0ZMXe6dpFXgiQE",
  "refresh_expires_at": "2026-11-29T10:06:52.602159516Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5bd22b5b-a92e-4253-afac-014d11522c9c",
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
  "last_heartbeat_at": "2026-10-30T10:06:22.259388Z",
  "last_location_at": "2026-10-30T10:06:22.259388Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5bd22b5b-a92e-4253-afac-014d11522c9c/handover` → **200**

```json
{
  "command_id": "e910ae4a-f55a-45fb-9512-6c6cfef7cd32",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5bd22b5b-a92e-4253-afac-014d11522c9c",
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
  "last_heartbeat_at": "2026-10-30T10:06:22.259388Z",
  "last_location_at": "2026-10-30T10:06:22.259388Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5bd22b5b-a92e-4253-afac-014d11522c9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:53Z",
    "sequence": 1793354813460
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5bd22b5b-a92e-4253-afac-014d11522c9c",
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
  "last_heartbeat_at": "2026-10-30T10:06:53.478924Z",
  "last_location_at": "2026-10-30T10:06:53.478924Z",
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
  "session_id": "5bd22b5b-a92e-4253-afac-014d11522c9c",
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
  "last_heartbeat_at": "2026-10-30T10:06:53.478924Z",
  "last_location_at": "2026-10-30T10:06:53.478924Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5bd22b5b-a92e-4253-afac-014d11522c9c/close` → **200**

```json
{
  "command_id": "cacb3b79-7ba1-41bc-b128-08e4f0541c60",
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
  "correlation_id": "c03e132c-0bfb-4845-a9c9-c3d8d5a66e76"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671909525",
  "device_ref": "sandbox-10138"
}
```

```json
{
  "challenge_id": "5d6a2c74-c598-4c99-adcf-7049c066e619",
  "expires_at": "2026-10-30T10:11:54.906802787Z",
  "resend_available_at": "2026-10-30T10:06:55.906802787Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671909525` → **200**

```json
{
  "phone": "+380671909525",
  "audience": "CLIENT",
  "code": "348167",
  "sent_at": "2026-10-30T10:06:54.909649475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d6a2c74-c598-4c99-adcf-7049c066e619",
  "code": "348167",
  "device_ref": "sandbox-10138"
}
```

```json
{
  "session_id": "d3c3e697-54bd-4480-86dc-2c2ae6a87bb0",
  "subject": {
    "type": "CLIENT",
    "id": "9580474a-59bf-4041-ab3e-116185893d4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTgwNDc0YS01OWJmLTQwNDEtYWIzZS0xMTYxODU4OTNkNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzE1LCJpYXQiOjE3OTMzNTQ4MTUsImp0aSI6ImE0YzBkNjQzLWQ4NWYtNGQzNC04YTRhLTI2YWRkMjI3YzJiYSIsInNpZCI6ImQzYzNlNjk3LTU0YmQtNDQ4MC04NmRjLTJjMmFlNmE4N2JiMCJ9.VIqwrPsuVUFDgjy7QuktARKwz3yTIxTfKtYkZWc3ktY",
  "access_expires_at": "2026-10-30T10:21:55.229822036Z",
  "refresh_token": "SJPwslHy_yAxv_xUv5L-WR2uGcZApYv2nQHv1gmDTGk",
  "refresh_expires_at": "2026-11-29T10:06:55.229307834Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "2405c896-fbd7-4b86-a147-2ea7f3ddc9e8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "37033724-a8e9-4c50-b844-ad78537faf95",
  "upload_path": "/api/rider/v1/uploads/37033724-a8e9-4c50-b844-ad78537faf95",
  "expires_at": "2026-10-30T10:21:55.525952633Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/37033724-a8e9-4c50-b844-ad78537faf95` → **200**

```json
{
  "file_id": "37033724-a8e9-4c50-b844-ad78537faf95",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "e109af20-0a56-4df2-8666-960813a2bb6a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "37033724-a8e9-4c50-b844-ad78537faf95"
  ]
}
```

```json
{
  "id": "0ba9a185-5254-4627-a110-eb7c30cbed8b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9580474a-59bf-4041-ab3e-116185893d4f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:06:55.844971Z",
  "updated_at": "2026-10-30T10:06:55.844971Z",
  "respond_by": "2026-10-30T14:06:55.844971Z",
  "messages": [
    {
      "id": "9d6fc86a-ca7a-46df-b6b5-b54fff7b8b47",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9580474a-59bf-4041-ab3e-116185893d4f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:06:55.846138Z",
      "attachments": [
        {
          "file_id": "37033724-a8e9-4c50-b844-ad78537faf95",
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
  "session_id": "bfe13474-1a9f-4a49-bcd5-aafd963483c8",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MTYsImlhdCI6MTc5MzM1NDgxNiwianRpIjoiMGZlMTMwZDktMTVlNy00MDRkLTllYTktN2M0NDU2ZjU0ZWViIiwic2lkIjoiYmZlMTM0NzQtMWE5Zi00YTQ5LWJjZDUtYWFmZDk2MzQ4M2M4In0.oR6gmdVY5RuGp4d_jS8FrFCPg7HPbWSOwNegHYWlaYc",
  "access_expires_at": "2026-10-30T10:21:56.463523099Z",
  "refresh_token": "asrdGssBqQo9XwO7daRgyzc8mFDzRggX456aoY6O-xE",
  "refresh_expires_at": "2026-10-30T22:06:56.462805386Z",
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
  "session_id": "92f4e4c1-0002-43cb-9d66-4ed187fd7ad9",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MTcsImlhdCI6MTc5MzM1NDgxNywianRpIjoiNWU2OTE0YTQtMzI1ZC00ZjI4LTgzYjEtODMyNWI2NmI0YTFiIiwic2lkIjoiOTJmNGU0YzEtMDAwMi00M2NiLTlkNjYtNGVkMTg3ZmQ3YWQ5In0.CNt_kPJBlgsNeeQY-ZqgyL5BlJEjq2gJ9Myb7NMKGv0",
  "access_expires_at": "2026-10-30T10:21:57.032674202Z",
  "refresh_token": "mjs4lQjA8wxs1PxtLpEi9ommjlbZxGlA4tjmA3KRd6w",
  "refresh_expires_at": "2026-10-30T22:06:57.032130235Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0ba9a185-5254-4627-a110-eb7c30cbed8b/attachments/37033724-a8e9-4c50-b844-ad78537faf95` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "68af2994-2079-45db-820e-a9e6daab06e3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "26fefd6e-c6b5-4ff7-8a92-1679a6b52092",
  "upload_path": "/api/operator/v1/uploads/26fefd6e-c6b5-4ff7-8a92-1679a6b52092",
  "expires_at": "2026-10-30T10:21:57.3331032Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/26fefd6e-c6b5-4ff7-8a92-1679a6b52092` → **200**

```json
{
  "file_id": "26fefd6e-c6b5-4ff7-8a92-1679a6b52092",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0ba9a185-5254-4627-a110-eb7c30cbed8b` → **200**

```json
{
  "id": "0ba9a185-5254-4627-a110-eb7c30cbed8b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9580474a-59bf-4041-ab3e-116185893d4f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:06:55.844971Z",
  "updated_at": "2026-10-30T10:06:55.844971Z",
  "respond_by": "2026-10-30T14:06:55.844971Z",
  "messages": [
    {
      "id": "9d6fc86a-ca7a-46df-b6b5-b54fff7b8b47",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9580474a-59bf-4041-ab3e-116185893d4f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:06:55.846138Z",
      "attachments": [
        {
          "file_id": "37033724-a8e9-4c50-b844-ad78537faf95",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0ba9a185-5254-4627-a110-eb7c30cbed8b/comments` → **200**

```json
{
  "command_id": "6d9d76f4-b303-46ff-b96c-02b4962e8f4f",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "26fefd6e-c6b5-4ff7-8a92-1679a6b52092"
  ]
}
```

```json
{
  "id": "0ba9a185-5254-4627-a110-eb7c30cbed8b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9580474a-59bf-4041-ab3e-116185893d4f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:06:55.844971Z",
  "updated_at": "2026-10-30T10:06:57.947462Z",
  "respond_by": "2026-10-30T14:06:55.844971Z",
  "messages": [
    {
      "id": "9d6fc86a-ca7a-46df-b6b5-b54fff7b8b47",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9580474a-59bf-4041-ab3e-116185893d4f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:06:55.846138Z",
      "attachments": [
        {
          "file_id": "37033724-a8e9-4c50-b844-ad78537faf95",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d8b39621-6fb7-45a3-a952-903bd5aec8b5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b477a07b-147c-491d-98d2-42d588071767",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:06:57.947023Z",
      "attachments": [
        {
          "file_id": "26fefd6e-c6b5-4ff7-8a92-1679a6b52092",
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

`GET /api/rider/v1/support/cases/0ba9a185-5254-4627-a110-eb7c30cbed8b` → **200**

```json
{
  "id": "0ba9a185-5254-4627-a110-eb7c30cbed8b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9580474a-59bf-4041-ab3e-116185893d4f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:06:55.844971Z",
  "updated_at": "2026-10-30T10:06:57.947462Z",
  "respond_by": "2026-10-30T14:06:55.844971Z",
  "messages": [
    {
      "id": "9d6fc86a-ca7a-46df-b6b5-b54fff7b8b47",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9580474a-59bf-4041-ab3e-116185893d4f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:06:55.846138Z",
      "attachments": [
        {
          "file_id": "37033724-a8e9-4c50-b844-ad78537faf95",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d8b39621-6fb7-45a3-a952-903bd5aec8b5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:06:57.947023Z",
      "attachments": [
        {
          "file_id": "26fefd6e-c6b5-4ff7-8a92-1679a6b52092",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0ba9a185-5254-4627-a110-eb7c30cbed8b/attachments/26fefd6e-c6b5-4ff7-8a92-1679a6b52092` → **200**

Done: support case 0ba9a185-5254-4627-a110-eb7c30cbed8b, rider attachment 37033724-a8e9-4c50-b844-ad78537faf95, operator attachment 26fefd6e-c6b5-4ff7-8a92-1679a6b52092.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732888759",
  "device_ref": "sandbox-31285"
}
```

```json
{
  "challenge_id": "e1b0bf40-b367-4124-ac88-2d785d51b0ad",
  "expires_at": "2026-10-30T10:11:58.582957259Z",
  "resend_available_at": "2026-10-30T10:06:59.582957259Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732888759` → **200**

```json
{
  "phone": "+380732888759",
  "audience": "CLIENT",
  "code": "972393",
  "sent_at": "2026-10-30T10:06:58.58577445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1b0bf40-b367-4124-ac88-2d785d51b0ad",
  "code": "972393",
  "device_ref": "sandbox-31285"
}
```

```json
{
  "session_id": "6a78e510-8d1b-4b04-b775-2bcf76bd0036",
  "subject": {
    "type": "CLIENT",
    "id": "8f84e69e-124c-47ad-8c76-067c04e144e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Zjg0ZTY5ZS0xMjRjLTQ3YWQtOGM3Ni0wNjdjMDRlMTQ0ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzE4LCJpYXQiOjE3OTMzNTQ4MTgsImp0aSI6ImJhMDdiYTk0LWJmZGEtNDMxYi05OTVhLTg0ZTNlN2E1ZjAzZCIsInNpZCI6IjZhNzhlNTEwLThkMWItNGIwNC1iNzc1LTJiY2Y3NmJkMDAzNiJ9.z1GnmbIrRrTdgtBgcG1SGKASS5kQU5PavhodBn-Bf4Y",
  "access_expires_at": "2026-10-30T10:21:58.900004647Z",
  "refresh_token": "kVmxFFpnnb-HITMiRCQ2-IrC_qQY5WNfwhsgmv5BFE8",
  "refresh_expires_at": "2026-11-29T10:06:58.899456682Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e99d5f6b-65c1-4526-892a-1c7d932b1516",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f69a579b-7367-4930-9cef-c20f42096fcf",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f69a579b-7367-4930-9cef-c20f42096fcf",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e975400394b3ccb4b54b9e6e540d9938",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f69a579b-7367-4930-9cef-c20f42096fcf",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732888759"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f69a579b-7367-4930-9cef-c20f42096fcf",
  "expires_at": "2026-10-30T10:36:59.196074Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/f69a579b-7367-4930-9cef-c20f42096fcf` → **200**

```json
{
  "id": "f69a579b-7367-4930-9cef-c20f42096fcf",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:36:59.196074Z",
  "card": {
    "id": "6d1e3d0d-d3d0-435c-acb8-77e156bfa03a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9721",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:06:59.491685Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc5eeede-e6ec-4e70-a555-0c49092cb284",
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
  "id": "aa040e73-a6dc-4512-8c5f-9917b38c7c30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:59.809691Z",
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
  "command_id": "8e7c2d67-4e1b-4c28-a45c-e70d741f7b18",
  "quote_id": "aa040e73-a6dc-4512-8c5f-9917b38c7c30",
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
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975` → **200**

```json
{
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975` → **200**

```json
{
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
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

`GET /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975` → **200**

```json
{
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975/switch-to-cash` → **200**

```json
{
  "command_id": "4bcbca53-9d02-4a57-a0d6-5ffa18222f50",
  "expected_version": 3
}
```

```json
{
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975/switch-to-cash` → **409**

```json
{
  "command_id": "9a586241-0534-4177-b6f9-edfc3bdd4cd2",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4bf1ad7b-3d7a-4dd7-94de-ec7086f9edca"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975` → **200**

```json
{
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ed53c0ca-050e-4ef6-be40-9fffc6389975/cancel` → **200**

```json
{
  "command_id": "0163d4c9-d34b-465b-a2b5-d868efab4e56",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ed53c0ca-050e-4ef6-be40-9fffc6389975",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8f84e69e-124c-47ad-8c76-067c04e144e6",
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
  "created_at": "2026-10-30T10:07:00.110205Z",
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
  "session_id": "695eab15-118a-4552-bdea-fbcb89a1ef15",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MjMsImlhdCI6MTc5MzM1NDgyMywianRpIjoiOWY1ZjM1NmEtYmI5NC00NTYzLTg3ODQtODM4NDBhMTcyMmE1Iiwic2lkIjoiNjk1ZWFiMTUtMTE4YS00NTUyLWJkZWEtZmJjYjg5YTFlZjE1In0.GXQ7O9bn5u4IyAQn10j6wLoug88s3rQwRTcoWwsTMts",
  "access_expires_at": "2026-10-30T10:22:03.827219022Z",
  "refresh_token": "Tr30SodTMEz44esvbwSzTZQaQAM4D9_K1ar4jvKtrMc",
  "refresh_expires_at": "2026-10-30T22:07:03.826708948Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18965"
}
```

```json
{
  "challenge_id": "de9e56e3-204f-4b76-bd82-23438ace9bac",
  "expires_at": "2026-10-30T10:12:04.10626784Z",
  "resend_available_at": "2026-10-30T10:07:05.10626784Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "233590",
  "sent_at": "2026-10-30T10:07:04.109339914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de9e56e3-204f-4b76-bd82-23438ace9bac",
  "code": "233590",
  "device_ref": "sandbox-18965"
}
```

```json
{
  "session_id": "08915a9d-9583-432b-a972-4e035be76770",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcyNCwiaWF0IjoxNzkzMzU0ODI0LCJqdGkiOiJjMjQxOTQ4ZS1lODI4LTRhMmYtODhkMy02ODNlNTkwY2ZmMzgiLCJzaWQiOiIwODkxNWE5ZC05NTgzLTQzMmItYTk3Mi00ZTAzNWJlNzY3NzAifQ.9iqy35H_PxHS6uHCUxMiULk6tk_cmIqDvQHu87-p33c",
  "access_expires_at": "2026-10-30T10:22:04.421194951Z",
  "refresh_token": "7qpsIVOmXjGgg4R4Gf8vZex5jApOOtydCCu8VvMzZo4",
  "refresh_expires_at": "2026-11-29T10:07:04.420633951Z",
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
      "actor_id": "b477a07b-147c-491d-98d2-42d588071767",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:06:47.262379Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "b477a07b-147c-491d-98d2-42d588071767",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T10:06:48.727417Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "ac51d66b-50cd-459c-8f8a-4c27b03d201b",
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
  "device_ref": "sandbox-25588"
}
```

```json
{
  "challenge_id": "53c4c27a-e743-492f-9e6e-d50917fb9687",
  "expires_at": "2026-10-30T10:12:05.572903133Z",
  "resend_available_at": "2026-10-30T10:07:06.572903133Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "602399",
  "sent_at": "2026-10-30T10:07:05.575614144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53c4c27a-e743-492f-9e6e-d50917fb9687",
  "code": "602399",
  "device_ref": "sandbox-25588"
}
```

```json
{
  "session_id": "5213fb40-5ded-46ef-a44b-1b029e2ce5be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcyNSwiaWF0IjoxNzkzMzU0ODI1LCJqdGkiOiJmNWFiNGQxNy04OWUyLTRiYzUtYmY1OS1lZDE4ZjkyMjVmYTgiLCJzaWQiOiI1MjEzZmI0MC01ZGVkLTQ2ZWYtYTQ0Yi0xYjAyOWUyY2U1YmUifQ.o1a9bVLXraJ5LLoR2i3oGEPGzcDhRzQz6UV3yp5EI5c",
  "access_expires_at": "2026-10-30T10:22:05.872937472Z",
  "refresh_token": "8x18-W3OcJ-fDXo-FR2BnwNDl9RG-qAJ8HCDgQWhJjI",
  "refresh_expires_at": "2026-11-29T10:07:05.872383847Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:06:29.591376Z",
  "last_location_at": "2026-10-30T10:06:29.591376Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/be0d97c5-8755-45c5-90f9-ee6ee20d2092/handover` → **200**

```json
{
  "command_id": "4b6f90b2-58e0-4497-8f55-87745d1ac437",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:06:29.591376Z",
  "last_location_at": "2026-10-30T10:06:29.591376Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/be0d97c5-8755-45c5-90f9-ee6ee20d2092/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:06Z",
    "sequence": 1793354826739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:07:06.757137Z",
  "last_location_at": "2026-10-30T10:07:06.757137Z",
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
  "command_id": "c6b3605f-4b79-4218-9bac-bd6f8e83f80c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:07Z",
    "sequence": 1793354827302
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1c4cbcf8-5e97-4218-9096-7f412ca08688",
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
  "last_heartbeat_at": "2026-10-30T10:07:07.320096Z",
  "last_location_at": "2026-10-30T10:07:07.320096Z",
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
  "session_id": "dff9c7e8-d8cc-411b-835d-6fa1e62bfdf1",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MjcsImlhdCI6MTc5MzM1NDgyNywianRpIjoiZmZhMzJkMDMtOTM3MS00MWRlLWJkYWMtMDEyMzQ4YWMwMDIzIiwic2lkIjoiZGZmOWM3ZTgtZDhjYy00MTFiLTgzNWQtNmZhMWU2MmJmZGYxIn0.xbjcb50E2Oa9C8D5obJlEMtr2HW1PeVr1Z7EgwMB6T0",
  "access_expires_at": "2026-10-30T10:22:07.902989525Z",
  "refresh_token": "MU7R6bMyRSY11L1WbYaHx2Kl8wU89cM0tDcR8ubIZ9g",
  "refresh_expires_at": "2026-10-30T22:07:07.902450016Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "27ac4d44-f004-43f7-ab44-de1c41b1c6aa",
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
  "id": "f3298f00-fe24-4886-9953-0173d2b8be00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:08.188721Z",
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
  "command_id": "c445d513-69d3-4e22-8819-a92d3e3ac21f",
  "quote_id": "f3298f00-fe24-4886-9953-0173d2b8be00",
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
  "id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
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
  "created_at": "2026-10-30T10:07:08.482767Z",
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
    "id": "b0480423-8b92-4de0-b977-fdca6bb1fe61",
    "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
    "expires_at": "2026-10-30T10:07:23.48649Z",
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

`POST /api/driver/v1/offers/b0480423-8b92-4de0-b977-fdca6bb1fe61/accept` → **200**

```json
{
  "command_id": "9f2f9628-3e4f-4725-9250-0b4a20a8d01f"
}
```

```json
{
  "id": "027eb643-df13-4db2-bc8c-7348646fed58",
  "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "769e3cf9-ea8d-4b30-8619-d92f2ededfe6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "769e3cf9-ea8d-4b30-8619-d92f2ededfe6",
  "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
  "assignment_id": "027eb643-df13-4db2-bc8c-7348646fed58",
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

`POST /api/driver/v1/work-sessions/1c4cbcf8-5e97-4218-9096-7f412ca08688/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:09Z",
    "sequence": 1793354829922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1c4cbcf8-5e97-4218-9096-7f412ca08688",
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
  "last_heartbeat_at": "2026-10-30T10:07:09.940766Z",
  "last_location_at": "2026-10-30T10:07:09.940766Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/769e3cf9-ea8d-4b30-8619-d92f2ededfe6/arrive` → **200**

```json
{
  "command_id": "5f754168-3f23-45ad-8118-84e5b9d75d57",
  "expected_version": 0
}
```

```json
{
  "id": "769e3cf9-ea8d-4b30-8619-d92f2ededfe6",
  "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
  "assignment_id": "027eb643-df13-4db2-bc8c-7348646fed58",
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
  "arrived_at": "2026-10-30T10:07:10.233236Z",
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

`POST /api/driver/v1/trips/769e3cf9-ea8d-4b30-8619-d92f2ededfe6/start` → **200**

```json
{
  "command_id": "40a12196-d141-4e27-be1d-fd3557c3d8ad",
  "expected_version": 1
}
```

```json
{
  "id": "769e3cf9-ea8d-4b30-8619-d92f2ededfe6",
  "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
  "assignment_id": "027eb643-df13-4db2-bc8c-7348646fed58",
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
  "arrived_at": "2026-10-30T10:07:10.233236Z",
  "started_at": "2026-10-30T10:07:10.537515Z",
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

`POST /api/driver/v1/trips/769e3cf9-ea8d-4b30-8619-d92f2ededfe6/complete` → **200**

```json
{
  "command_id": "dbddb2f3-228a-458d-9169-7b8e4e786511",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:07:10Z",
  "cash_received": true
}
```

```json
{
  "id": "769e3cf9-ea8d-4b30-8619-d92f2ededfe6",
  "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
  "assignment_id": "027eb643-df13-4db2-bc8c-7348646fed58",
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
  "arrived_at": "2026-10-30T10:07:10.233236Z",
  "started_at": "2026-10-30T10:07:10.537515Z",
  "completed_at": "2026-10-30T10:07:10.866096Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/51d7c54c-e56b-42a4-b3dd-bd8f533f262b` → **200**

```json
{
  "id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
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
    "id": "027eb643-df13-4db2-bc8c-7348646fed58",
    "order_id": "51d7c54c-e56b-42a4-b3dd-bd8f533f262b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "769e3cf9-ea8d-4b30-8619-d92f2ededfe6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:07:08.482767Z",
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
  "session_id": "be0d97c5-8755-45c5-90f9-ee6ee20d2092",
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
  "last_heartbeat_at": "2026-10-30T10:07:06.757137Z",
  "last_location_at": "2026-10-30T10:07:06.757137Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/be0d97c5-8755-45c5-90f9-ee6ee20d2092/close` → **200**

```json
{
  "command_id": "7c378dbd-d6d9-4292-8149-652d8ef13ab9",
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
  "session_id": "1c4cbcf8-5e97-4218-9096-7f412ca08688",
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
  "last_heartbeat_at": "2026-10-30T10:07:09.940766Z",
  "last_location_at": "2026-10-30T10:07:09.940766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1c4cbcf8-5e97-4218-9096-7f412ca08688/close` → **200**

```json
{
  "command_id": "432d71c9-50e7-4ec2-b8c0-1e896144717c",
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

Done: terminal order 51d7c54c-e56b-42a4-b3dd-bd8f533f262b by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1665"
}
```

```json
{
  "challenge_id": "1bda4fd8-cef5-4575-ba9b-3e122ad32b65",
  "expires_at": "2026-10-30T10:12:15.990484624Z",
  "resend_available_at": "2026-10-30T10:07:16.990484624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "774839",
  "sent_at": "2026-10-30T10:07:15.993187952Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bda4fd8-cef5-4575-ba9b-3e122ad32b65",
  "code": "774839",
  "device_ref": "sandbox-1665"
}
```

```json
{
  "session_id": "6ee1e7c2-beaa-4ba4-8ef8-a301df7fcaf0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczNiwiaWF0IjoxNzkzMzU0ODM2LCJqdGkiOiJiZDk3MmU5NS02ZWUwLTQxNDQtYmJhZi05OTc1YWYwNmQ2OGIiLCJzaWQiOiI2ZWUxZTdjMi1iZWFhLTRiYTQtOGVmOC1hMzAxZGY3ZmNhZjAifQ.YYGeiIbm2BSMPNFQP7tyrXcHFmkxyL9wdw6Iu4Liwfc",
  "access_expires_at": "2026-10-30T10:22:16.313785418Z",
  "refresh_token": "ZZvZT1mHAVBt4bwxstkWlt4Ie1TMeWZqRSLgCxkbmiU",
  "refresh_expires_at": "2026-11-29T10:07:16.313229638Z",
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
  "device_ref": "sandbox-10790"
}
```

```json
{
  "challenge_id": "6987802c-6e3a-456b-97f6-6c52e9a640a5",
  "expires_at": "2026-10-30T10:12:16.876161965Z",
  "resend_available_at": "2026-10-30T10:07:17.876161965Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "127057",
  "sent_at": "2026-10-30T10:07:16.878943969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6987802c-6e3a-456b-97f6-6c52e9a640a5",
  "code": "127057",
  "device_ref": "sandbox-10790"
}
```

```json
{
  "session_id": "b4784794-80d5-405a-a06f-b7fcf82f0f60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczNywiaWF0IjoxNzkzMzU0ODM3LCJqdGkiOiIxNTU5NTZmMC1hMmQzLTQ4YjgtOGI5OC1kNDQ2YjAxZjMzMDAiLCJzaWQiOiJiNDc4NDc5NC04MGQ1LTQwNWEtYTA2Zi1iN2ZjZjgyZjBmNjAifQ.-i7MmvyNU_eWsqPZ51r2COF7mIKWwXSFFHEZ4tq6IlU",
  "access_expires_at": "2026-10-30T10:22:17.188423539Z",
  "refresh_token": "WJD_ED-qneHvzaPgE8JHS23_JvTLDhaqhzv-fDD_JvU",
  "refresh_expires_at": "2026-11-29T10:07:17.187919347Z",
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
  "device_ref": "sandbox-20228"
}
```

```json
{
  "challenge_id": "f1e38b24-a5f0-4971-875e-9e29db973954",
  "expires_at": "2026-10-30T10:12:17.753052801Z",
  "resend_available_at": "2026-10-30T10:07:18.753052801Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "325088",
  "sent_at": "2026-10-30T10:07:17.755631352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1e38b24-a5f0-4971-875e-9e29db973954",
  "code": "325088",
  "device_ref": "sandbox-20228"
}
```

```json
{
  "session_id": "68506884-196b-45a5-ac80-847136a6c4df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczOCwiaWF0IjoxNzkzMzU0ODM4LCJqdGkiOiJkNDZjOWJkOS0xZDI1LTQxY2EtYTAwYy0wMmEwOTc3YTgzNmMiLCJzaWQiOiI2ODUwNjg4NC0xOTZiLTQ1YTUtYWM4MC04NDcxMzZhNmM0ZGYifQ.NjL2hpDQKt47xaE99G6ZSnfl_nIUP4OkD89NYiOeCA4",
  "access_expires_at": "2026-10-30T10:22:18.07636086Z",
  "refresh_token": "JfCq6m8tmendTFqsSbxV2buQS1iMgrXP_B9L2Ig28d0",
  "refresh_expires_at": "2026-11-29T10:07:18.075850877Z",
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
  "phone": "+380698638846",
  "device_ref": "sandbox-2765"
}
```

```json
{
  "challenge_id": "860e1a19-e2f7-4af2-ac65-884b680ca3f9",
  "expires_at": "2026-10-30T10:12:18.647967765Z",
  "resend_available_at": "2026-10-30T10:07:19.647967765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380698638846` → **200**

```json
{
  "phone": "+380698638846",
  "audience": "CLIENT",
  "code": "375795",
  "sent_at": "2026-10-30T10:07:18.650652617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "860e1a19-e2f7-4af2-ac65-884b680ca3f9",
  "code": "375795",
  "device_ref": "sandbox-2765"
}
```

```json
{
  "session_id": "96cfbb64-d6c5-426a-84ae-6952f1bfb4dc",
  "subject": {
    "type": "CLIENT",
    "id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmRlZGNiNS05ZDNmLTRhMDgtODVkNS0zYTMzMDY0ZGQ4YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzM4LCJpYXQiOjE3OTMzNTQ4MzgsImp0aSI6IjMxZDNmN2Y0LTMyMDctNDIxMS05YjMyLTA0NzdmOTZjOWY0MCIsInNpZCI6Ijk2Y2ZiYjY0LWQ2YzUtNDI2YS04NGFlLTY5NTJmMWJmYjRkYyJ9.2uC3ryYJU3WceK0eL8Ul5JucZbrLPvVy6g2RJCjjWAY",
  "access_expires_at": "2026-10-30T10:22:18.964009027Z",
  "refresh_token": "xVjIm05yalO8ZM9TRf2OCYHB_9ANLUwOQmNtt1Yqhpk",
  "refresh_expires_at": "2026-11-29T10:07:18.963402996Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6f192d99-e16a-4867-8eec-6b86282661f2",
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
  "id": "8084dda9-2643-48e2-b46c-9c08832fb676",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:19.264251Z",
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
  "command_id": "823e9923-7d2d-4d9d-826c-f61eaa7a536e",
  "quote_id": "8084dda9-2643-48e2-b46c-9c08832fb676",
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
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:19.56637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:07:19.56637Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.171994556
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.208886779
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

`GET /api/rider/v1/orders/f6972851-cadf-4e38-95ec-fce1dbe9ee01` → **200**

```json
{
  "id": "f6972851-cadf-4e38-95ec-fce1dbe9ee01",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "26dedcb5-9d3f-4a08-85d5-3a33064dd8c8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:07:19.56637Z",
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
  "session_id": "bd2c9d5f-dcde-487e-858d-78b459d81d91",
  "subject": {
    "type": "STAFF",
    "id": "b477a07b-147c-491d-98d2-42d588071767"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDc3YTA3Yi0xNDdjLTQ5MWQtOThkMi00MmQ1ODgwNzE3NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MjEsImlhdCI6MTc5MzM1NTAyMSwianRpIjoiNzNjZGFiMzItMTQ2MS00YjY5LWI2NzgtNDM4MDViMzYxOGQwIiwic2lkIjoiYmQyYzlkNWYtZGNkZS00ODdlLTg1OGQtNzhiNDU5ZDgxZDkxIn0.NWXXbWSs2yPydAg-culZZyP6hFG8KHcSZPfhl6L1OO8",
  "access_expires_at": "2026-10-30T10:25:21.390098076Z",
  "refresh_token": "QOGrMRNaDGorqthD9pWogUn5Fp5y7064pK_KiDZwh-c",
  "refresh_expires_at": "2026-10-30T22:10:21.389506942Z",
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
  "id": "7abd5372-2f5d-4e84-9687-8025f8b1a543",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:21.697603Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:21.697651Z",
  "updated_at": "2026-10-30T10:10:21.714839Z",
  "finished_at": "2026-10-30T10:10:21.714839Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/7abd5372-2f5d-4e84-9687-8025f8b1a543` → **200**

```json
{
  "run": {
    "id": "7abd5372-2f5d-4e84-9687-8025f8b1a543",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:10:21.697603Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:10:21.697651Z",
    "updated_at": "2026-10-30T10:10:21.714839Z",
    "finished_at": "2026-10-30T10:10:21.714839Z",
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
  "id": "7abd5372-2f5d-4e84-9687-8025f8b1a543",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:21.697603Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:21.697651Z",
  "updated_at": "2026-10-30T10:10:21.714839Z",
  "finished_at": "2026-10-30T10:10:21.714839Z",
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
  "id": "7abd5372-2f5d-4e84-9687-8025f8b1a543",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:21.697603Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:21.697651Z",
  "updated_at": "2026-10-30T10:10:21.714839Z",
  "finished_at": "2026-10-30T10:10:21.714839Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/800dcf9b-28c7-4f02-8d79-88519ccd0f22` → **204**

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
  "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:22.16506Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:22.165096Z",
  "updated_at": "2026-10-30T10:10:22.174585Z",
  "finished_at": "2026-10-30T10:10:22.174585Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/7b0c27db-239c-4eea-8ba1-819308b74d94` → **200**

```json
{
  "run": {
    "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:10:22.16506Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:10:22.165096Z",
    "updated_at": "2026-10-30T10:10:22.174585Z",
    "finished_at": "2026-10-30T10:10:22.174585Z",
    "version": 1
  },
  "items": [
    {
      "id": "0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2",
      "run_id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "c51dc274e73f609c1eff79ea19282508fb4a949cc147002ac5737fa6d7225437",
      "reference_display": "sandbox-reconciliation-800dcf9b-28c7-4f02-8d79-#####ccd0f22",
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
      "provider_at": "2026-10-30T10:10:22Z",
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
  "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:22.16506Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:22.165096Z",
  "updated_at": "2026-10-30T10:10:22.174585Z",
  "finished_at": "2026-10-30T10:10:22.174585Z",
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
  "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:22.16506Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:22.165096Z",
  "updated_at": "2026-10-30T10:10:22.174585Z",
  "finished_at": "2026-10-30T10:10:22.174585Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2/resolve` → **200**

```json
{
  "command_id": "0e79b536-6668-4dc5-8aa1-12b51803c103",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2",
  "run_id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "c51dc274e73f609c1eff79ea19282508fb4a949cc147002ac5737fa6d7225437",
  "reference_display": "sandbox-reconciliation-800dcf9b-28c7-4f02-8d79-#####ccd0f22",
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
  "provider_at": "2026-10-30T10:10:22Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b477a07b-147c-491d-98d2-42d588071767",
  "resolved_at": "2026-10-30T10:10:22.655738Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2/resolve` → **200**

```json
{
  "command_id": "0e79b536-6668-4dc5-8aa1-12b51803c103",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2",
  "run_id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "c51dc274e73f609c1eff79ea19282508fb4a949cc147002ac5737fa6d7225437",
  "reference_display": "sandbox-reconciliation-800dcf9b-28c7-4f02-8d79-#####ccd0f22",
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
  "provider_at": "2026-10-30T10:10:22Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b477a07b-147c-491d-98d2-42d588071767",
  "resolved_at": "2026-10-30T10:10:22.655738Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2/resolve` → **409**

```json
{
  "command_id": "4ce500e5-1eca-466d-9a15-59b17c9c327a",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4ece7ee2-0845-4d75-a2e8-79d6e24cd94e"
}
```

`GET /api/admin/v1/payment-reconciliations/7b0c27db-239c-4eea-8ba1-819308b74d94` → **200**

```json
{
  "run": {
    "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:10:22.16506Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:10:22.165096Z",
    "updated_at": "2026-10-30T10:10:22.655738Z",
    "finished_at": "2026-10-30T10:10:22.174585Z",
    "version": 2
  },
  "items": [
    {
      "id": "0b135dcc-bf0b-46f5-b4d2-5f5e27139ea2",
      "run_id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "c51dc274e73f609c1eff79ea19282508fb4a949cc147002ac5737fa6d7225437",
      "reference_display": "sandbox-reconciliation-800dcf9b-28c7-4f02-8d79-#####ccd0f22",
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
      "provider_at": "2026-10-30T10:10:22Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "b477a07b-147c-491d-98d2-42d588071767",
      "resolved_at": "2026-10-30T10:10:22.655738Z",
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
      "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T10:10:22.16506Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:10:22.165096Z",
      "updated_at": "2026-10-30T10:10:22.655738Z",
      "finished_at": "2026-10-30T10:10:22.174585Z",
      "version": 2
    },
    {
      "id": "a07cf1f0-ad68-4b05-ab89-ecb8971c926a",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T10:02:19.96356Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:02:19.963665Z",
      "updated_at": "2026-10-30T10:02:19.970152Z",
      "finished_at": "2026-10-30T10:02:19.970152Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/800dcf9b-28c7-4f02-8d79-88519ccd0f22` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "7b0c27db-239c-4eea-8ba1-819308b74d94",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:10:22.16506Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:10:22.165096Z",
  "updated_at": "2026-10-30T10:10:22.655738Z",
  "finished_at": "2026-10-30T10:10:22.174585Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793355145169E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793355145466E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793355145466E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.7933551452E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793355145467E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
