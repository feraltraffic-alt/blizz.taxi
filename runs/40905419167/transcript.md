# Sandbox transcript (2026-10-29T15:50:10Z, cb1418f)

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
  "correlation_id": "0d090eb2-8068-4fb4-9ace-b61af1b76fa5"
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
  "session_id": "40d77b29-1662-46a9-a60b-b26b40746a25",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MTYsImlhdCI6MTc5MzI4OTAxNiwianRpIjoiN2QyOWM3MTYtMmRkOC00OTIwLTgyNzYtZTQ2NzcwMjQ0ZDM2Iiwic2lkIjoiNDBkNzdiMjktMTY2Mi00NmE5LWE2MGItYjI2YjQwNzQ2YTI1In0.VPb0PrGMvPndDxUcz6z-UV5FjM540Ha0xrm6-Aw09WQ",
  "access_expires_at": "2026-10-29T16:05:16.542711823Z",
  "refresh_token": "VN5U4IJJaSwSq-PsrguX_cHOPdark5G0BVIIryNqAXg",
  "refresh_expires_at": "2026-10-30T03:50:16.540465322Z",
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
  "session_id": "18be8ed4-e12f-4d4c-b616-af1470c7cb41",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MTgsImlhdCI6MTc5MzI4OTAxOCwianRpIjoiYzM2MTQ3ZTMtOGRmNy00MGMyLTliZjEtN2ExZTJhY2NkMTNmIiwic2lkIjoiMThiZThlZDQtZTEyZi00ZDRjLWI2MTYtYWYxNDcwYzdjYjQxIn0.4mT9Z4xOhZ4-lwKCm304rsO4eHb27ZteEOtEz9QoBcc",
  "access_expires_at": "2026-10-29T16:05:18.158166124Z",
  "refresh_token": "JzpoMHoOqzSVfHfieVF9e6bfz0lbOcB1tZnjECS0tPM",
  "refresh_expires_at": "2026-10-30T03:50:18.15737731Z",
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
  "device_ref": "sandbox-12181"
}
```

```json
{
  "challenge_id": "af82b057-92cd-493d-b724-f0f8bbca22b9",
  "expires_at": "2026-10-29T15:55:18.648983357Z",
  "resend_available_at": "2026-10-29T15:50:19.648983357Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "368140",
  "sent_at": "2026-10-29T15:50:18.659560108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af82b057-92cd-493d-b724-f0f8bbca22b9",
  "code": "368140",
  "device_ref": "sandbox-12181"
}
```

```json
{
  "session_id": "bf887360-9048-4c63-95e2-5daf313adc15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkxOCwiaWF0IjoxNzkzMjg5MDE4LCJqdGkiOiIwOTc1NzI3Zi1hN2EzLTQwZGYtOTg1Yi01NzIxNThjZDYzMWUiLCJzaWQiOiJiZjg4NzM2MC05MDQ4LTRjNjMtOTVlMi01ZGFmMzEzYWRjMTUifQ.yHaaFvzdimabwvMJ2NdtJsv8tV2C61Z9nocHhUn037Y",
  "access_expires_at": "2026-10-29T16:05:18.947020832Z",
  "refresh_token": "mUntJPuCkyuRjbidtMIu8RN650-tfwR5pKqPJIAcfWk",
  "refresh_expires_at": "2026-11-28T15:50:18.946217135Z",
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
  "command_id": "3eed8b33-0173-4be2-93a0-7abfc62ad54c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:19Z",
    "sequence": 1793289019405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2705df38-c674-4b32-a55d-22096d4ab2cd",
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
  "last_heartbeat_at": "2026-10-29T15:50:19.533084Z",
  "last_location_at": "2026-10-29T15:50:19.533084Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631888525",
  "device_ref": "sandbox-17839"
}
```

```json
{
  "challenge_id": "196db875-f649-4c8d-8767-bb3f20143ba6",
  "expires_at": "2026-10-29T15:55:19.775087044Z",
  "resend_available_at": "2026-10-29T15:50:20.775087044Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631888525` → **200**

```json
{
  "phone": "+380631888525",
  "audience": "CLIENT",
  "code": "326175",
  "sent_at": "2026-10-29T15:50:19.778828701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "196db875-f649-4c8d-8767-bb3f20143ba6",
  "code": "326175",
  "device_ref": "sandbox-17839"
}
```

```json
{
  "session_id": "6471cf7a-826c-4e36-a6e7-992dc9145c84",
  "subject": {
    "type": "CLIENT",
    "id": "38a7ceb1-2143-4179-9057-270f40efb540"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGE3Y2ViMS0yMTQzLTQxNzktOTA1Ny0yNzBmNDBlZmI1NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTIwLCJpYXQiOjE3OTMyODkwMjAsImp0aSI6IjA3NzI0YTYwLTRhNWUtNDIwYS1iNDc5LTRlZjIwZDA2MzI0NCIsInNpZCI6IjY0NzFjZjdhLTgyNmMtNGUzNi1hNmU3LTk5MmRjOTE0NWM4NCJ9.XuHqTngZIBrZTuS3sS7pRAyZWSeJmois107GxNlvLB8",
  "access_expires_at": "2026-10-29T16:05:20.040056161Z",
  "refresh_token": "ZIjVKA5YyaYIbIqhFYitk4j1k7j0jENCum3ZeRNz5CU",
  "refresh_expires_at": "2026-11-28T15:50:20.039302344Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cdad3f9f-d7a7-4685-a9a0-f156dafd92a7",
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
  "id": "bfbfe12c-b5d4-4f64-9bfe-1d462d3d0606",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:20.297020Z",
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
  "command_id": "58d36094-8bbb-4b74-8383-348571a45c02",
  "quote_id": "bfbfe12c-b5d4-4f64-9bfe-1d462d3d0606",
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
  "id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38a7ceb1-2143-4179-9057-270f40efb540",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:20.596842Z",
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
    "id": "3813f7a6-e131-446f-bb84-368513bc4226",
    "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
    "expires_at": "2026-10-29T15:50:35.607553Z",
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

`POST /api/driver/v1/offers/3813f7a6-e131-446f-bb84-368513bc4226/accept` → **200**

```json
{
  "command_id": "3dc25995-4ee0-4341-9697-7b3d3240da08"
}
```

```json
{
  "id": "a6abb67a-c675-4366-bc6a-77273920b0a7",
  "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "79822913-c65d-4d64-b9a4-b54016f39336",
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
  "command_id": "6c08bb49-c592-4e9e-a59e-c916fa91aba8",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:50:21.622809064Z"
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
  "id": "79822913-c65d-4d64-b9a4-b54016f39336",
  "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
  "assignment_id": "a6abb67a-c675-4366-bc6a-77273920b0a7",
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

`POST /api/driver/v1/work-sessions/2705df38-c674-4b32-a55d-22096d4ab2cd/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:22Z",
    "sequence": 1793289022366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2705df38-c674-4b32-a55d-22096d4ab2cd",
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
  "last_heartbeat_at": "2026-10-29T15:50:22.388005Z",
  "last_location_at": "2026-10-29T15:50:22.388005Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/79822913-c65d-4d64-b9a4-b54016f39336/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7079274d-e7cd-4cf5-abe8-6e242e797a38",
  "expected_version": 0
}
```

```json
{
  "id": "79822913-c65d-4d64-b9a4-b54016f39336",
  "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
  "assignment_id": "a6abb67a-c675-4366-bc6a-77273920b0a7",
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
  "arrived_at": "2026-10-29T15:50:22.649834Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/79822913-c65d-4d64-b9a4-b54016f39336/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b802b941-c4d5-4659-82dd-58c5ffd5267c",
  "expected_version": 1
}
```

```json
{
  "id": "79822913-c65d-4d64-b9a4-b54016f39336",
  "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
  "assignment_id": "a6abb67a-c675-4366-bc6a-77273920b0a7",
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
  "arrived_at": "2026-10-29T15:50:22.649834Z",
  "started_at": "2026-10-29T15:50:22.894662Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/79822913-c65d-4d64-b9a4-b54016f39336/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d3086391-32e0-43ed-813f-0129701ab936",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:23Z",
  "cash_received": true
}
```

```json
{
  "id": "79822913-c65d-4d64-b9a4-b54016f39336",
  "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
  "assignment_id": "a6abb67a-c675-4366-bc6a-77273920b0a7",
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
  "arrived_at": "2026-10-29T15:50:22.649834Z",
  "started_at": "2026-10-29T15:50:22.894662Z",
  "completed_at": "2026-10-29T15:50:23.175846Z",
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
  "session_id": "2705df38-c674-4b32-a55d-22096d4ab2cd",
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
  "last_heartbeat_at": "2026-10-29T15:50:22.388005Z",
  "last_location_at": "2026-10-29T15:50:22.388005Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2705df38-c674-4b32-a55d-22096d4ab2cd/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "4c194cc8-00d7-45d0-bf30-a23354fbe4e6",
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
  "command_id": "48fc3a95-4b76-41d0-847a-8844714f6e3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:23Z",
    "sequence": 1793289023912
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
  "correlation_id": "31667044-d37f-46f9-a7ab-560deaf21347",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "f99b4ac8-3241-41ec-be09-364f4d70e727",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:24Z",
    "sequence": 1793289024164
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "063abc3e-fafe-4b79-b98c-b19ee5001ea1",
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
  "last_heartbeat_at": "2026-10-29T15:50:24.184505Z",
  "last_location_at": "2026-10-29T15:50:24.184505Z",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:50:21.622809Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b53d45cf-2de2-4821-8767-b00277b4d0df",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:50:24.654890649Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "063abc3e-fafe-4b79-b98c-b19ee5001ea1",
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
  "last_heartbeat_at": "2026-10-29T15:50:24.184505Z",
  "last_location_at": "2026-10-29T15:50:24.184505Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/063abc3e-fafe-4b79-b98c-b19ee5001ea1/close` → **200**

```json
{
  "command_id": "83ffb134-a497-4f4c-9fca-621db727a98d",
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
  "session_id": "23204c33-c67e-4f87-845f-79ae5f213191",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MjUsImlhdCI6MTc5MzI4OTAyNSwianRpIjoiZGIwZDk4MzYtZjU1OS00MzIxLTkzMzctMmYzZTE1ZmU3MjQwIiwic2lkIjoiMjMyMDRjMzMtYzY3ZS00Zjg3LTg0NWYtNzlhZTVmMjEzMTkxIn0.y5bsovzaGd5yw87eKTJza06QbUWJ4E9mkof4crCocbM",
  "access_expires_at": "2026-10-29T16:05:25.655564889Z",
  "refresh_token": "Pk2ktMpEV0_EVNZDGzaDKWeStCQVjCZDdOFqYpb8LR8",
  "refresh_expires_at": "2026-10-30T03:50:25.654868957Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "31f0f5a3-c933-473d-a33e-885c2b04fb93",
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
  "id": "cacfdaef-7c0d-440c-964f-73138a7b12ce",
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
  "created_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "created_at": "2026-10-29T15:50:25.898852Z",
  "updated_at": "2026-10-29T15:50:25.898852Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635524304",
  "device_ref": "sandbox-28218"
}
```

```json
{
  "challenge_id": "cbbed3ce-495f-4e71-93da-c4cb4f25c0b0",
  "expires_at": "2026-10-29T15:55:26.139368046Z",
  "resend_available_at": "2026-10-29T15:50:27.139368046Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635524304` → **200**

```json
{
  "phone": "+380635524304",
  "audience": "CLIENT",
  "code": "022515",
  "sent_at": "2026-10-29T15:50:26.14324329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbbed3ce-495f-4e71-93da-c4cb4f25c0b0",
  "code": "022515",
  "device_ref": "sandbox-28218"
}
```

```json
{
  "session_id": "16921635-ad62-484d-8469-ea140004ba5c",
  "subject": {
    "type": "CLIENT",
    "id": "1bf80940-dd87-4b4e-b4fa-15211ec8b45b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmY4MDk0MC1kZDg3LTRiNGUtYjRmYS0xNTIxMWVjOGI0NWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTI2LCJpYXQiOjE3OTMyODkwMjYsImp0aSI6IjY3ZDRmYjJhLWUwNmItNDlmOC1hNTk5LWUzNmExYWM0MTEwYSIsInNpZCI6IjE2OTIxNjM1LWFkNjItNDg0ZC04NDY5LWVhMTQwMDA0YmE1YyJ9.PRdqBaIs_28hyC8ya5zIfjZ1dg8ksapmlMdLmpHRH7s",
  "access_expires_at": "2026-10-29T16:05:26.397682604Z",
  "refresh_token": "QnYAK7c1wwLjv7bfYtFVCNUTGGiaI2dw-1xbA-D_9SY",
  "refresh_expires_at": "2026-11-28T15:50:26.397042401Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635524304` → **200**

```json
{
  "client_id": "1bf80940-dd87-4b4e-b4fa-15211ec8b45b"
}
```

`POST /api/admin/v1/rider-wallets/1bf80940-dd87-4b4e-b4fa-15211ec8b45b/top-ups` → **201**

```json
{
  "command_id": "36b7e3ca-2aa9-4b49-a042-46e4e07911bf",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1bf80940-dd87-4b4e-b4fa-15211ec8b45b",
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
      "id": "00439d75-e702-4715-b1ed-bb22799e4451",
      "at": "2026-10-29T15:50:26.854377Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "887ecaa0-f084-4f25-a7db-4ef2861ae25b",
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
  "id": "abbbbdd1-8475-4105-9803-8c85e130a36f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:27.114525Z",
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
      "id": "cacfdaef-7c0d-440c-964f-73138a7b12ce",
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
  "device_ref": "sandbox-19312"
}
```

```json
{
  "challenge_id": "32a3cb98-6d17-4dd6-8574-90ec1cb08940",
  "expires_at": "2026-10-29T15:55:27.351786674Z",
  "resend_available_at": "2026-10-29T15:50:28.351786674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "942862",
  "sent_at": "2026-10-29T15:50:27.37374041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32a3cb98-6d17-4dd6-8574-90ec1cb08940",
  "code": "942862",
  "device_ref": "sandbox-19312"
}
```

```json
{
  "session_id": "07187c39-434f-455c-b96c-be87239b1aea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkyNywiaWF0IjoxNzkzMjg5MDI3LCJqdGkiOiJkODMxYjc3YS03ZTk2LTQwYzAtYWVhNC04MGE3Yzk2NWIxNTkiLCJzaWQiOiIwNzE4N2MzOS00MzRmLTQ1NWMtYjk2Yy1iZTg3MjM5YjFhZWEifQ.LayJCxHxgs9PSBpdwWEt09kqSWyZXsIG5t_ZiDMI69U",
  "access_expires_at": "2026-10-29T16:05:27.630651278Z",
  "refresh_token": "akLnDkUfOeyBCCFlJR5SG0zPC8oXJ2vgkhI_j3nWmHU",
  "refresh_expires_at": "2026-11-28T15:50:27.629713187Z",
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
  "command_id": "6541ea01-fad7-4a2f-9ea1-6f2f377d863d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:28Z",
    "sequence": 1793289028928
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bae67a47-a057-43a8-aa5e-6f8cd1d8c72a",
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
  "last_heartbeat_at": "2026-10-29T15:50:28.111869Z",
  "last_location_at": "2026-10-29T15:50:28.111869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "58c77221-f89d-48f1-911a-4b34e408bf58",
  "quote_id": "abbbbdd1-8475-4105-9803-8c85e130a36f",
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
  "id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1bf80940-dd87-4b4e-b4fa-15211ec8b45b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:28.359444Z",
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
  "client_id": "1bf80940-dd87-4b4e-b4fa-15211ec8b45b",
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
      "id": "00439d75-e702-4715-b1ed-bb22799e4451",
      "at": "2026-10-29T15:50:26.854377Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
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
    "id": "a239b8e8-42a5-45b1-9cdf-096fceccd47b",
    "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
    "expires_at": "2026-10-29T15:50:43.366257Z",
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

`POST /api/driver/v1/offers/a239b8e8-42a5-45b1-9cdf-096fceccd47b/accept` → **200**

```json
{
  "command_id": "4526e824-874a-432c-86f3-15338a21c7de"
}
```

```json
{
  "id": "78a47e3b-168d-407f-acf4-1de1c651d3c6",
  "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "577768d2-1a9c-46ff-b62c-bd7a71ca7cd5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "577768d2-1a9c-46ff-b62c-bd7a71ca7cd5",
  "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
  "assignment_id": "78a47e3b-168d-407f-acf4-1de1c651d3c6",
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

`POST /api/driver/v1/work-sessions/bae67a47-a057-43a8-aa5e-6f8cd1d8c72a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:29Z",
    "sequence": 1793289029526
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bae67a47-a057-43a8-aa5e-6f8cd1d8c72a",
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
  "last_heartbeat_at": "2026-10-29T15:50:29.546189Z",
  "last_location_at": "2026-10-29T15:50:29.546189Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/577768d2-1a9c-46ff-b62c-bd7a71ca7cd5/arrive` → **200**

```json
{
  "command_id": "a9cc97b4-08da-4c5c-9bcc-38118b1bf4da",
  "expected_version": 0
}
```

```json
{
  "id": "577768d2-1a9c-46ff-b62c-bd7a71ca7cd5",
  "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
  "assignment_id": "78a47e3b-168d-407f-acf4-1de1c651d3c6",
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
  "arrived_at": "2026-10-29T15:50:29.78543Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/577768d2-1a9c-46ff-b62c-bd7a71ca7cd5/start` → **200**

```json
{
  "command_id": "bfb948f0-1055-4fcb-b096-6be983234d97",
  "expected_version": 1
}
```

```json
{
  "id": "577768d2-1a9c-46ff-b62c-bd7a71ca7cd5",
  "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
  "assignment_id": "78a47e3b-168d-407f-acf4-1de1c651d3c6",
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
  "arrived_at": "2026-10-29T15:50:29.78543Z",
  "started_at": "2026-10-29T15:50:30.041466Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/577768d2-1a9c-46ff-b62c-bd7a71ca7cd5/complete` → **200**

```json
{
  "command_id": "9e4b0d3b-23f9-4a97-9f21-f8fb8c9f3e71",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:30Z",
  "cash_received": true
}
```

```json
{
  "id": "577768d2-1a9c-46ff-b62c-bd7a71ca7cd5",
  "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
  "assignment_id": "78a47e3b-168d-407f-acf4-1de1c651d3c6",
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
  "arrived_at": "2026-10-29T15:50:29.78543Z",
  "started_at": "2026-10-29T15:50:30.041466Z",
  "completed_at": "2026-10-29T15:50:30.309973Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1bf80940-dd87-4b4e-b4fa-15211ec8b45b",
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
      "id": "295ed1d8-1927-4793-8774-427340acc1ed",
      "at": "2026-10-29T15:50:31.12198Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4"
    },
    {
      "id": "00439d75-e702-4715-b1ed-bb22799e4451",
      "at": "2026-10-29T15:50:26.854377Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cacfdaef-7c0d-440c-964f-73138a7b12ce/archive` → **200**

```json
{
  "command_id": "9d13b268-a382-49a5-83ec-8f5af8e60177",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cacfdaef-7c0d-440c-964f-73138a7b12ce",
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
  "created_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "created_at": "2026-10-29T15:50:25.898852Z",
  "updated_at": "2026-10-29T15:50:33.806402Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bae67a47-a057-43a8-aa5e-6f8cd1d8c72a",
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
  "last_heartbeat_at": "2026-10-29T15:50:29.546189Z",
  "last_location_at": "2026-10-29T15:50:29.546189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bae67a47-a057-43a8-aa5e-6f8cd1d8c72a/close` → **200**

```json
{
  "command_id": "5ce47899-ba32-4b66-b080-95237f09ad19",
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

Done: order d789b478-aeab-4f67-8f2d-6a1850a04bd4.

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
  "session_id": "2df5a046-b36a-45b5-a0f9-245cf3e5b6ba",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MzQsImlhdCI6MTc5MzI4OTAzNCwianRpIjoiODRlNTZkZDQtMWViOC00MGFjLWFhNjYtOWExZDQ2YmRiMzUwIiwic2lkIjoiMmRmNWEwNDYtYjM2YS00NWI1LWEwZjktMjQ1Y2YzZTViNmJhIn0.2rdeLOh-nn5pG6D1QFFbfTerSoweUMWbkK4VEhmnuO0",
  "access_expires_at": "2026-10-29T16:05:34.951863506Z",
  "refresh_token": "OL38qKAgyYg_G3jiqHuUSZJKwd2L0HVT6t_VkqkN_zo",
  "refresh_expires_at": "2026-10-30T03:50:34.950862592Z",
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
  "command_id": "55267d54-ed1a-4983-b205-ff3db60e9240",
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
  "session_id": "f1b2474f-b9c4-4dc3-bfca-1c65c8c5d581",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MzYsImlhdCI6MTc5MzI4OTAzNiwianRpIjoiNGU3ZmZiY2MtYTFhNy00ZjMyLWFmZDQtNjAyMzM3ZDcyYzVhIiwic2lkIjoiZjFiMjQ3NGYtYjljNC00ZGMzLWJmY2EtMWM2NWM4YzVkNTgxIn0.V019os44bIXUby5Grc9IiB1l3Z2j_fyghHNnHfjsz0I",
  "access_expires_at": "2026-10-29T16:05:36.016096723Z",
  "refresh_token": "VVDMcjpOcPXTvnAGXd3H2D-1-LMFMye5SKmiXpVu1fw",
  "refresh_expires_at": "2026-10-30T03:50:36.015470739Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.110005990",
    "linkedid": "1730052700.110005990",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674855533"
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
    "id": "1730052700.110005990",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d99d2f62-686c-42da-8ff4-cbcef25bcdbe",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.250988Z",
      "answered_at": null,
      "ended_at": "2026-10-29T15:50:36.275057Z",
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
    "id": "1730052600.194314800",
    "linkedid": "1730052600.194314800",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674855533"
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
      "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.538782Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/26d27ecb-e62b-44bd-91cf-07d04b33eca3/answer` → **200**

```json
{
  "command_id": "00d6114a-fb01-4f46-85de-65e7b3377a11"
}
```

```json
{
  "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674855533",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "order_ids": [],
  "started_at": "2026-10-29T15:50:36.538782Z",
  "answered_at": "2026-10-29T15:50:36.799959Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.194314800",
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
    "id": "1730052600.194314800",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.538782Z",
      "answered_at": "2026-10-29T15:50:36.799959Z",
      "ended_at": "2026-10-29T15:50:37.054486Z",
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
      "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.538782Z",
      "answered_at": "2026-10-29T15:50:36.799959Z",
      "ended_at": "2026-10-29T15:50:37.054486Z",
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
      "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.538782Z",
      "answered_at": "2026-10-29T15:50:36.799959Z",
      "ended_at": "2026-10-29T15:50:37.054486Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:50:39.781456Z"
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
      "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.538782Z",
      "answered_at": "2026-10-29T15:50:36.799959Z",
      "ended_at": "2026-10-29T15:50:37.054486Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:50:39.781456Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/26d27ecb-e62b-44bd-91cf-07d04b33eca3/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/26d27ecb-e62b-44bd-91cf-07d04b33eca3/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=26d27ecb-e62b-44bd-91cf-07d04b33eca3` → **200**

```json
{
  "changes": [
    {
      "id": "c3ab959c-d3a0-4a5c-9ad4-0b446eb3fa54",
      "occurred_at": "2026-10-29T15:50:42.048661Z",
      "actor_type": "STAFF",
      "actor_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"92782167-400d-42ab-bd69-55eed27bc701\", \"order_ids\": []}",
      "correlation_id": "98f0fa2a-9417-457f-a507-5f1e46d2655b"
    },
    {
      "id": "ffdbd29a-41ca-47d4-b5be-4ded1130f04b",
      "occurred_at": "2026-10-29T15:50:42.0182Z",
      "actor_type": "STAFF",
      "actor_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"92782167-400d-42ab-bd69-55eed27bc701\", \"order_ids\": []}",
      "correlation_id": "da52798e-a5be-4224-859a-e1b5d4a8d6b4"
    }
  ]
}
```

Done: call 26d27ecb-e62b-44bd-91cf-07d04b33eca3 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27815"
}
```

```json
{
  "challenge_id": "f0d4ad9a-b6dd-4a40-8034-9f50c177556d",
  "expires_at": "2026-10-29T15:55:42.323258273Z",
  "resend_available_at": "2026-10-29T15:50:43.323258273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "914967",
  "sent_at": "2026-10-29T15:50:42.327036829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0d4ad9a-b6dd-4a40-8034-9f50c177556d",
  "code": "914967",
  "device_ref": "sandbox-27815"
}
```

```json
{
  "session_id": "202d85e1-036c-4839-b337-753a4d104780",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk0MiwiaWF0IjoxNzkzMjg5MDQyLCJqdGkiOiI3NzlmOGI1MS1lZjM0LTQxNmItODAwOC1hNGMyNzFhZTlhMjQiLCJzaWQiOiIyMDJkODVlMS0wMzZjLTQ4MzktYjMzNy03NTNhNGQxMDQ3ODAifQ.Snl2do_wHtra1w8Ss557rQbnOGOfn7cBfncm-8F0JNw",
  "access_expires_at": "2026-10-29T16:05:42.580263209Z",
  "refresh_token": "X-kU2F0cs1T-xXM1C3X1FZML6eYAA_o67rEh4QtGtac",
  "refresh_expires_at": "2026-11-28T15:50:42.579627346Z",
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
  "command_id": "bc9f1623-dba3-462c-866c-85961b18ec13",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:43Z",
    "sequence": 1793289043344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d86c2b4-81a4-49aa-8b54-04aca24ea016",
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
  "last_heartbeat_at": "2026-10-29T15:50:43.052628Z",
  "last_location_at": "2026-10-29T15:50:43.052628Z",
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
  "session_id": "5f408ab2-03f9-4cf8-b2a0-3bd17371f33f",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NDMsImlhdCI6MTc5MzI4OTA0MywianRpIjoiZDU2MGNkNGQtOTczMS00MTBiLTk3YTQtNGM4ZTFjY2MyMjUyIiwic2lkIjoiNWY0MDhhYjItMDNmOS00Y2Y4LWIyYTAtM2JkMTczNzFmMzNmIn0.sGkaDYsfA3u29DzJc6NXjYbf-WhYGU9XgADOtI9c0LY",
  "access_expires_at": "2026-10-29T16:05:43.539031354Z",
  "refresh_token": "-aaqOAVaLubvmL03dDQwuTWI_Q--8C_hYWdtCwfUT3Y",
  "refresh_expires_at": "2026-10-30T03:50:43.538546575Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "feecd0ad-3d39-4627-8aa3-e899a1fb80e3",
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
  "id": "d1f0a5fb-011e-44c8-89c0-2ef6ea84c84a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:43.771988Z",
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
  "command_id": "d051b024-7deb-4144-a6eb-37061bd73f99",
  "quote_id": "d1f0a5fb-011e-44c8-89c0-2ef6ea84c84a",
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
    "phone": "+380671356894"
  }
}
```

```json
{
  "id": "e611e999-1070-413e-9509-44320bb98d18",
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
  "created_at": "2026-10-29T15:50:44.028295Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671356894"
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
    "id": "2c22653b-c3c1-4298-bc6c-ee60ee55cd21",
    "order_id": "e611e999-1070-413e-9509-44320bb98d18",
    "expires_at": "2026-10-29T15:50:59.03275Z",
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

`POST /api/driver/v1/offers/2c22653b-c3c1-4298-bc6c-ee60ee55cd21/accept` → **200**

```json
{
  "command_id": "80f7e69c-1293-40fa-8dc3-332a4e3279f0"
}
```

```json
{
  "id": "0cbc0069-c3c1-44da-94b7-1a32e74f3e88",
  "order_id": "e611e999-1070-413e-9509-44320bb98d18",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ac1386c-562b-4c0a-8156-b06122f6fbb5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ac1386c-562b-4c0a-8156-b06122f6fbb5",
  "order_id": "e611e999-1070-413e-9509-44320bb98d18",
  "assignment_id": "0cbc0069-c3c1-44da-94b7-1a32e74f3e88",
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
    "phone": "+380671356894"
  }
}
```

`POST /api/driver/v1/work-sessions/2d86c2b4-81a4-49aa-8b54-04aca24ea016/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:47Z",
    "sequence": 1793289047987
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d86c2b4-81a4-49aa-8b54-04aca24ea016",
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
  "last_heartbeat_at": "2026-10-29T15:50:47.117713Z",
  "last_location_at": "2026-10-29T15:50:47.117713Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ac1386c-562b-4c0a-8156-b06122f6fbb5/arrive` → **200**

```json
{
  "command_id": "a7b8281a-18e1-42c6-a790-e41eb5c13b7c",
  "expected_version": 0
}
```

```json
{
  "id": "4ac1386c-562b-4c0a-8156-b06122f6fbb5",
  "order_id": "e611e999-1070-413e-9509-44320bb98d18",
  "assignment_id": "0cbc0069-c3c1-44da-94b7-1a32e74f3e88",
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
  "arrived_at": "2026-10-29T15:50:47.353709Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671356894"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  },
  {
    "phone": "+380671356894",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:48.996010463Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  },
  {
    "phone": "+380671356894",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:48.996010463Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671356894` → **200**

```json
[
  {
    "phone": "+380671356894",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:45.984537263Z"
  },
  {
    "phone": "+380671356894",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:50:48.996010463Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/4ac1386c-562b-4c0a-8156-b06122f6fbb5/start` → **200**

```json
{
  "command_id": "c0bea6b0-9a28-4e31-b829-27db70076967",
  "expected_version": 1
}
```

```json
{
  "id": "4ac1386c-562b-4c0a-8156-b06122f6fbb5",
  "order_id": "e611e999-1070-413e-9509-44320bb98d18",
  "assignment_id": "0cbc0069-c3c1-44da-94b7-1a32e74f3e88",
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
  "arrived_at": "2026-10-29T15:50:47.353709Z",
  "started_at": "2026-10-29T15:50:49.714271Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671356894"
  }
}
```

`POST /api/driver/v1/trips/4ac1386c-562b-4c0a-8156-b06122f6fbb5/complete` → **200**

```json
{
  "command_id": "3da8ccc8-c255-4bba-94f1-67b18ed0f1a5",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:49Z",
  "cash_received": true
}
```

```json
{
  "id": "4ac1386c-562b-4c0a-8156-b06122f6fbb5",
  "order_id": "e611e999-1070-413e-9509-44320bb98d18",
  "assignment_id": "0cbc0069-c3c1-44da-94b7-1a32e74f3e88",
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
  "arrived_at": "2026-10-29T15:50:47.353709Z",
  "started_at": "2026-10-29T15:50:49.714271Z",
  "completed_at": "2026-10-29T15:50:49.959472Z",
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
  "session_id": "2d86c2b4-81a4-49aa-8b54-04aca24ea016",
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
  "last_heartbeat_at": "2026-10-29T15:50:47.117713Z",
  "last_location_at": "2026-10-29T15:50:47.117713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2d86c2b4-81a4-49aa-8b54-04aca24ea016/close` → **200**

```json
{
  "command_id": "e292a25b-cda7-4aaa-a29a-4130b67f2646",
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
  "phone": "+380632058262",
  "device_ref": "sandbox-18918"
}
```

```json
{
  "challenge_id": "20ee7f57-8076-4732-a2c6-e0805c173ab9",
  "expires_at": "2026-10-29T15:55:50.686267153Z",
  "resend_available_at": "2026-10-29T15:50:51.686267153Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632058262` → **200**

```json
{
  "phone": "+380632058262",
  "audience": "CLIENT",
  "code": "023800",
  "sent_at": "2026-10-29T15:50:50.689565142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20ee7f57-8076-4732-a2c6-e0805c173ab9",
  "code": "023800",
  "device_ref": "sandbox-18918"
}
```

```json
{
  "session_id": "9a8841f0-260a-4efa-be93-d0d07de5c835",
  "subject": {
    "type": "CLIENT",
    "id": "d24c1212-5f0c-4f41-b330-44ee21366bd5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjRjMTIxMi01ZjBjLTRmNDEtYjMzMC00NGVlMjEzNjZiZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTUwLCJpYXQiOjE3OTMyODkwNTAsImp0aSI6IjZhMGUyNjJkLWVkMGQtNDU3OC1iMTQ1LWU5ODM4OTYwZDNkYyIsInNpZCI6IjlhODg0MWYwLTI2MGEtNGVmYS1iZTkzLWQwZDA3ZGU1YzgzNSJ9.dqri0xuyf2hhryVR1oMakMn5BKw10Tp93g3pixjUbXg",
  "access_expires_at": "2026-10-29T16:05:50.948512413Z",
  "refresh_token": "Wi77PNcasE0hm2Et-IE297KhHhRcO4v0o6f7zNCmQx4",
  "refresh_expires_at": "2026-11-28T15:50:50.948061935Z",
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
  "device_ref": "sandbox-28724"
}
```

```json
{
  "challenge_id": "c9a20506-9757-4cb2-9e6b-d7740118d487",
  "expires_at": "2026-10-29T15:55:51.405527673Z",
  "resend_available_at": "2026-10-29T15:50:52.405527673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "547950",
  "sent_at": "2026-10-29T15:50:51.408542511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9a20506-9757-4cb2-9e6b-d7740118d487",
  "code": "547950",
  "device_ref": "sandbox-28724"
}
```

```json
{
  "session_id": "9e52fdc3-b2e3-4fe8-ab02-32b958c3880c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk1MSwiaWF0IjoxNzkzMjg5MDUxLCJqdGkiOiI1ZjU2YWNiMi0xYjhiLTRlYzAtYWZjZS02ZTQ0MmU4MTExN2QiLCJzaWQiOiI5ZTUyZmRjMy1iMmUzLTRmZTgtYWIwMi0zMmI5NThjMzg4MGMifQ.OzI_9Zx-VMEk1bpwosBxe4rIhgKjdtokeyjpbD954PM",
  "access_expires_at": "2026-10-29T16:05:51.663535237Z",
  "refresh_token": "4aHe6KCHeeHW_4tfA9fyAfAd_dvuwxJ6oIJJVHrD2Dc",
  "refresh_expires_at": "2026-11-28T15:50:51.662792276Z",
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
  "session_id": "b6b79efe-007d-420e-8f0d-93ecfc7b74cc",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NTIsImlhdCI6MTc5MzI4OTA1MiwianRpIjoiMGU3MGIwNjctODExYS00MTI3LTg4YjUtNzE1MDM3MDI4ZWU2Iiwic2lkIjoiYjZiNzllZmUtMDA3ZC00MjBlLThmMGQtOTNlY2ZjN2I3NGNjIn0.yJEwp8lHr74A6gAJijUBhEZpci7nXMg8jt7lMFEzDPE",
  "access_expires_at": "2026-10-29T16:05:52.371835611Z",
  "refresh_token": "QAlCIckIgW6JBvm4ovLElxMiwzqP6UTZwGFCTNGlCow",
  "refresh_expires_at": "2026-10-30T03:50:52.371401938Z",
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
  "session_id": "db0ff56e-b27a-4338-81bb-d5d16711aa54",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NTIsImlhdCI6MTc5MzI4OTA1MiwianRpIjoiZjFjMDNhNjctYzU4My00ODMyLWE4ZjItYzg2N2YzN2ZlMDFhIiwic2lkIjoiZGIwZmY1NmUtYjI3YS00MzM4LTgxYmItZDVkMTY3MTFhYTU0In0.-dBGl8xKWVQc8yBrsfsJHWYiEtS9jk27NjjdhN5ww1s",
  "access_expires_at": "2026-10-29T16:05:52.855258404Z",
  "refresh_token": "-RnFdpMfyLfThH3FLJN4yAxjuRVxnAZEDf3WGBas2Nk",
  "refresh_expires_at": "2026-10-30T03:50:52.854601156Z",
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
  "command_id": "e9c50491-dda3-4abc-b635-8b5f1735eab1",
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
  "id": "ac325cbc-071b-4f4e-b7de-7463f42adde4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:53.332797Z",
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
  "command_id": "a1d49e6a-c524-4890-86d4-f6666832e9f9",
  "quote_id": "ac325cbc-071b-4f4e-b7de-7463f42adde4",
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
  "id": "1491461c-9f7a-4306-9465-204402e96ed7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d24c1212-5f0c-4f41-b330-44ee21366bd5",
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
  "created_at": "2026-10-29T15:50:53.576996Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1491461c-9f7a-4306-9465-204402e96ed7` → **200**

```json
{
  "id": "1491461c-9f7a-4306-9465-204402e96ed7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d24c1212-5f0c-4f41-b330-44ee21366bd5",
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
  "created_at": "2026-10-29T15:50:53.576996Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1491461c-9f7a-4306-9465-204402e96ed7/cancel` → **200**

```json
{
  "command_id": "2eb4664e-0dd6-475f-8a14-af2cdc35f3d5",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "1491461c-9f7a-4306-9465-204402e96ed7",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d24c1212-5f0c-4f41-b330-44ee21366bd5",
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
  "created_at": "2026-10-29T15:50:53.576996Z",
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
  "command_id": "a82f851c-0df5-40a3-a768-2f946623e9f8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:54Z",
    "sequence": 1793289054547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c7f5fc89-f062-4a88-b0db-d6284557edc1",
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
  "last_heartbeat_at": "2026-10-29T15:50:54.566637Z",
  "last_location_at": "2026-10-29T15:50:54.566637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27054"
}
```

```json
{
  "challenge_id": "d63bfa02-da43-47af-bd47-d58d96548fa8",
  "expires_at": "2026-10-29T15:55:54.801366778Z",
  "resend_available_at": "2026-10-29T15:50:55.801366778Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "450345",
  "sent_at": "2026-10-29T15:50:54.804093836Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d63bfa02-da43-47af-bd47-d58d96548fa8",
  "code": "450345",
  "device_ref": "sandbox-27054"
}
```

```json
{
  "session_id": "712cd997-5ef2-4b4d-895f-76aeba632f84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk1NSwiaWF0IjoxNzkzMjg5MDU1LCJqdGkiOiI4ZWJmMDVmNi01N2ZjLTQzN2MtODgxOS01YWM4NGMwYWQxOTMiLCJzaWQiOiI3MTJjZDk5Ny01ZWYyLTRiNGQtODk1Zi03NmFlYmE2MzJmODQifQ.OJeza1TE8qGnTb32PiAVmR1LxcyTin0U-PrX-yYEGCg",
  "access_expires_at": "2026-10-29T16:05:55.055183195Z",
  "refresh_token": "EOXjmbVXvRQi1IpymNbBciVGrKhhTcplsAIoJzf1L3k",
  "refresh_expires_at": "2026-11-28T15:50:55.054651847Z",
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
  "command_id": "af75425f-eb1d-417e-9ce5-c4c40d00dd5b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:55Z",
    "sequence": 1793289055492
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:50:55.511223Z",
  "last_location_at": "2026-10-29T15:50:55.511223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1a8f0db0-4003-4f16-a76f-46da8a01c133",
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
  "id": "794929e4-ea08-4274-89ff-c9256a5c8d26",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:55.748257Z",
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
  "command_id": "6c7e7f05-79ed-4051-b161-9c7f3bebb375",
  "quote_id": "794929e4-ea08-4274-89ff-c9256a5c8d26",
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
  "id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d24c1212-5f0c-4f41-b330-44ee21366bd5",
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
  "created_at": "2026-10-29T15:50:55.99047Z",
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
    "id": "7df9e4bb-a223-4e3a-ae2c-d3e695a7b426",
    "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
    "expires_at": "2026-10-29T15:51:10.993837Z",
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

`POST /api/driver/v1/offers/7df9e4bb-a223-4e3a-ae2c-d3e695a7b426/accept` → **200**

```json
{
  "command_id": "8fd87b37-f832-44c0-8505-11c05b1d7e16"
}
```

```json
{
  "id": "5407a1c6-f18e-42ad-9266-e70bbc70653a",
  "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "816d670e-06f1-454b-a1db-f510ffb75755",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "816d670e-06f1-454b-a1db-f510ffb75755",
  "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "assignment_id": "5407a1c6-f18e-42ad-9266-e70bbc70653a",
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

`POST /api/driver/v1/trips/816d670e-06f1-454b-a1db-f510ffb75755/cancel` → **200**

```json
{
  "command_id": "e3322d75-b6e9-4e8c-a189-069af51e20b1",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "816d670e-06f1-454b-a1db-f510ffb75755",
  "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "assignment_id": "5407a1c6-f18e-42ad-9266-e70bbc70653a",
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

`GET /api/rider/v1/orders/5014853e-64d4-4413-9548-0cd87d40f3ee` → **200**

```json
{
  "id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d24c1212-5f0c-4f41-b330-44ee21366bd5",
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
    "id": "5407a1c6-f18e-42ad-9266-e70bbc70653a",
    "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "816d670e-06f1-454b-a1db-f510ffb75755",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:50:55.99047Z",
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
    "id": "c6b34681-3372-4ded-a3eb-4b71f3a8110a",
    "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
    "expires_at": "2026-10-29T15:51:11.937349Z",
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

`POST /api/driver/v1/offers/c6b34681-3372-4ded-a3eb-4b71f3a8110a/accept` → **200**

```json
{
  "command_id": "23619b08-3d3f-439d-b538-5123ddafc516"
}
```

```json
{
  "id": "01b88df6-ef90-4a88-816b-002c80086493",
  "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b8ae3f80-f347-4c59-abb2-ed8b88a52afc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8ae3f80-f347-4c59-abb2-ed8b88a52afc",
  "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "assignment_id": "01b88df6-ef90-4a88-816b-002c80086493",
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

`POST /api/driver/v1/trips/b8ae3f80-f347-4c59-abb2-ed8b88a52afc/cancel` → **200**

```json
{
  "command_id": "d4397518-d8e6-4491-ac9c-01b04e8b9996",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b8ae3f80-f347-4c59-abb2-ed8b88a52afc",
  "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
  "assignment_id": "01b88df6-ef90-4a88-816b-002c80086493",
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
    "id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:50:55.99047Z",
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
    "id": "1491461c-9f7a-4306-9465-204402e96ed7",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:50:53.576996Z",
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

`GET /api/operator/v1/orders/5014853e-64d4-4413-9548-0cd87d40f3ee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:50:55.991094Z",
      "actor": {
        "type": "CLIENT",
        "id": "d24c1212-5f0c-4f41-b330-44ee21366bd5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
        "quote_id": "794929e4-ea08-4274-89ff-c9256a5c8d26",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "c25f2910-0ef3-4350-aa15-d3b391838d9a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:50:55.993107Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
        "attempt_id": "e3ff855e-d424-4335-9ae4-4b654b2ca24c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c25f2910-0ef3-4350-aa15-d3b391838d9a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:50:55.998885Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7df9e4bb-a223-4e3a-ae2c-d3e695a7b426",
        "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "c25f2910-0ef3-4350-aa15-d3b391838d9a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:50:56.470681Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7df9e4bb-a223-4e3a-ae2c-d3e695a7b426",
        "order_id": "5014853e-64d4-4413-9548-0cd87d40f3ee",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "5407a1c6-f18e-42ad-9266-e70bbc70653a"
      },
      "correlation_id": "62974b5a-ca92-481b-a5c6-a211bd27c179"
```

Done: orders 1491461c-9f7a-4306-9465-204402e96ed7, 5014853e-64d4-4413-9548-0cd87d40f3ee.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735875718",
  "device_ref": "sandbox-27512"
}
```

```json
{
  "challenge_id": "2a4dd9b0-d4ba-4a79-a7df-2d633bf5d6c8",
  "expires_at": "2026-10-29T15:55:58.850679255Z",
  "resend_available_at": "2026-10-29T15:50:59.850679255Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735875718` → **200**

```json
{
  "phone": "+380735875718",
  "audience": "CLIENT",
  "code": "112053",
  "sent_at": "2026-10-29T15:50:58.853655888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a4dd9b0-d4ba-4a79-a7df-2d633bf5d6c8",
  "code": "112053",
  "device_ref": "sandbox-27512"
}
```

```json
{
  "session_id": "be76b5dd-a901-4ef1-b186-13b35415816e",
  "subject": {
    "type": "CLIENT",
    "id": "39de6679-fa46-477b-8a42-fc051417ae37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWRlNjY3OS1mYTQ2LTQ3N2ItOGE0Mi1mYzA1MTQxN2FlMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTU5LCJpYXQiOjE3OTMyODkwNTksImp0aSI6IjllNWIwOWEzLThhZmItNDcyOS05NmFjLWY4NWY4NDZlYzFiMSIsInNpZCI6ImJlNzZiNWRkLWE5MDEtNGVmMS1iMTg2LTEzYjM1NDE1ODE2ZSJ9._GVcFth_lMU6u_M6aiF3RLnLPETrTgvRdpkCZHc5maM",
  "access_expires_at": "2026-10-29T16:05:59.10388356Z",
  "refresh_token": "eFfU1ATHecwOTZjmMzn-QPb_kiJi3jhGKE_13CrZJNc",
  "refresh_expires_at": "2026-11-28T15:50:59.103474935Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6980dc12-eed0-4c05-b260-d900e789c9f3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1701ffba-d887-4a14-bda1-6439d02a00cb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1701ffba-d887-4a14-bda1-6439d02a00cb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2348dc2003b44fb4ceeed59d87bc4cb0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1701ffba-d887-4a14-bda1-6439d02a00cb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735875718"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1701ffba-d887-4a14-bda1-6439d02a00cb",
  "expires_at": "2026-10-29T16:20:59.34241Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1701ffba-d887-4a14-bda1-6439d02a00cb` → **200**

```json
{
  "id": "1701ffba-d887-4a14-bda1-6439d02a00cb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:20:59.34241Z",
  "card": {
    "id": "6e10d877-a02f-4afe-9a9f-c813d979ca34",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0572",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:50:59.576181Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6e10d877-a02f-4afe-9a9f-c813d979ca34",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0572",
      "card_type": "Visa",
      "created_at": "2026-10-29T15:50:59.576181Z"
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
  "device_ref": "sandbox-7762"
}
```

```json
{
  "challenge_id": "dcc33cac-9308-45ab-a5b4-0673dfd12607",
  "expires_at": "2026-10-29T15:56:00.055584106Z",
  "resend_available_at": "2026-10-29T15:51:01.055584106Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "119495",
  "sent_at": "2026-10-29T15:51:00.058497846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dcc33cac-9308-45ab-a5b4-0673dfd12607",
  "code": "119495",
  "device_ref": "sandbox-7762"
}
```

```json
{
  "session_id": "e7352d2f-119e-45a5-89c6-383184d915fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk2MCwiaWF0IjoxNzkzMjg5MDYwLCJqdGkiOiI4ZDg2ZGVmMi0yYzJhLTQ5NWItOTQ3ZC1jNmE2ZDczYmQwOTkiLCJzaWQiOiJlNzM1MmQyZi0xMTllLTQ1YTUtODljNi0zODMxODRkOTE1ZmUifQ.nXH373_09qCRs1_N-gEJjrZOfnVKrulj-3EkVjwkc30",
  "access_expires_at": "2026-10-29T16:06:00.300866894Z",
  "refresh_token": "ETrr_IMPeWI-KCZgpZqzTvAgdT1fiO7N5D636vJPpVM",
  "refresh_expires_at": "2026-11-28T15:51:00.300454923Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:50:55.511223Z",
  "last_location_at": "2026-10-29T15:50:55.511223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e07e84fc-38d8-467d-9982-fdd9b4d11ba9/handover` → **200**

```json
{
  "command_id": "c47df265-59db-4125-b733-419ef26ad7c0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:50:55.511223Z",
  "last_location_at": "2026-10-29T15:50:55.511223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e07e84fc-38d8-467d-9982-fdd9b4d11ba9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:00Z",
    "sequence": 1793289060967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:51:00.984811Z",
  "last_location_at": "2026-10-29T15:51:00.984811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ab59169-9e90-494e-ae14-07efca625ab3",
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
  "id": "4ef0c9d6-114e-4612-9947-ab0474bf3e7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:01.226135Z",
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
  "command_id": "018762fb-f161-4ebf-b9f9-4d412e3ce4e9",
  "quote_id": "4ef0c9d6-114e-4612-9947-ab0474bf3e7c",
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
  "id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
  "created_at": "2026-10-29T15:51:01.471457Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c` → **200**

```json
{
  "id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
  "created_at": "2026-10-29T15:51:01.471457Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c` → **200**

```json
{
  "id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
  "created_at": "2026-10-29T15:51:01.471457Z",
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
    "id": "e39c802a-39ba-4982-aa6d-6f375067cb34",
    "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
    "expires_at": "2026-10-29T15:51:17.351816Z",
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

`POST /api/driver/v1/offers/e39c802a-39ba-4982-aa6d-6f375067cb34/accept` → **200**

```json
{
  "command_id": "f094bfd0-fc42-4e37-a06d-2842e99a8c78"
}
```

```json
{
  "id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "assignment_id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
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

`POST /api/driver/v1/work-sessions/e07e84fc-38d8-467d-9982-fdd9b4d11ba9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:03Z",
    "sequence": 1793289063882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:51:03.899981Z",
  "last_location_at": "2026-10-29T15:51:03.899981Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6f3074a2-65c1-4cce-8f6b-3e2828a2454c/arrive` → **200**

```json
{
  "command_id": "0fa39e41-c127-4dbf-bb9c-af2dcea56063",
  "expected_version": 0
}
```

```json
{
  "id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "assignment_id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
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
  "arrived_at": "2026-10-29T15:51:04.138887Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f3074a2-65c1-4cce-8f6b-3e2828a2454c/start` → **200**

```json
{
  "command_id": "6edbb135-069f-492c-8a5c-458f78ebbcca",
  "expected_version": 1
}
```

```json
{
  "id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "assignment_id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
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
  "arrived_at": "2026-10-29T15:51:04.138887Z",
  "started_at": "2026-10-29T15:51:04.382697Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f3074a2-65c1-4cce-8f6b-3e2828a2454c/complete` → **200**

```json
{
  "command_id": "1b819bd3-5106-4ec5-967d-ecef50968aad",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:04Z",
  "cash_received": true
}
```

```json
{
  "id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "assignment_id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
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
  "arrived_at": "2026-10-29T15:51:04.138887Z",
  "started_at": "2026-10-29T15:51:04.382697Z",
  "completed_at": "2026-10-29T15:51:04.620161Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c` → **200**

```json
{
  "id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
    "id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
    "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:01.471457Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c` → **200**

```json
{
  "id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
    "id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
    "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:01.471457Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c` → **200**

```json
{
  "id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
    "id": "b68fa784-191c-4eed-9260-47fb7fcfc28a",
    "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6f3074a2-65c1-4cce-8f6b-3e2828a2454c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:01.471457Z",
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

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c/tip` → **200**

```json
{
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
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
  "available_until": "2026-10-30T15:51:04.620161Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c/tip` → **201**

```json
{
  "command_id": "e6a99962-3c9a-4f58-8829-4ad5be1568d5",
  "amount_minor": 2500
}
```

```json
{
  "id": "cf26a44d-13ac-4b1e-8d43-aff7820c1f69",
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:51:08.057083Z"
}
```

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c/tip` → **200**

```json
{
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
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
  "available_until": "2026-10-30T15:51:04.620161Z",
  "open": false,
  "tip": {
    "id": "cf26a44d-13ac-4b1e-8d43-aff7820c1f69",
    "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:51:08.057083Z"
  }
}
```

`GET /api/rider/v1/orders/762c4c6c-193d-4b45-86be-1ce0a4b3a80c/tip` → **200**

```json
{
  "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
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
  "available_until": "2026-10-30T15:51:04.620161Z",
  "open": false,
  "tip": {
    "id": "cf26a44d-13ac-4b1e-8d43-aff7820c1f69",
    "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:51:08.057083Z"
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
      "id": "e59628d1-391c-45d2-bb8a-b257a697c952",
      "at": "2026-10-29T15:51:09.47852Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
      "counterpart_id": null
    },
    {
      "id": "3fc95384-2e43-4b7a-b8d5-04783fbc2739",
      "at": "2026-10-29T15:51:05.42591Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8f72a60-85cb-4e43-ae31-fadf7c2cdd10",
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
  "id": "c0a5caf7-14e6-40d2-8a6d-37ba7286611c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:10.014991Z",
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
  "session_id": "8ed3b557-7ff2-4dad-87e6-d82a74db93c3",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NzAsImlhdCI6MTc5MzI4OTA3MCwianRpIjoiYmU3NTlkNTAtNjhmNi00ZDEyLWI2NjYtNWI3YTU0MTJhNTdjIiwic2lkIjoiOGVkM2I1NTctN2ZmMi00ZGFkLTg3ZTYtZDgyYTc0ZGI5M2MzIn0.-psx6TI3ZxgA1F9xnzTOoZf_JHo8vbzPGEu3F-Y2eVs",
  "access_expires_at": "2026-10-29T16:06:10.514771214Z",
  "refresh_token": "krbiDl2U28QcFvE5TPAbGVndbnA6x7PCqw10Ov1r7zg",
  "refresh_expires_at": "2026-10-30T03:51:10.514368698Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735875718` → **200**

```json
{
  "client_id": "39de6679-fa46-477b-8a42-fc051417ae37"
}
```

`POST /api/admin/v1/rider-wallets/39de6679-fa46-477b-8a42-fc051417ae37/top-ups` → **201**

```json
{
  "command_id": "ae7bb78c-a438-4c79-b53b-03454aea1cf5",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
      "id": "19645170-3447-4860-a03c-3c3f7bf58143",
      "at": "2026-10-29T15:51:10.975799Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c3c53f67-abb3-43e5-8c0f-5cec2c33f13d",
  "quote_id": "c0a5caf7-14e6-40d2-8a6d-37ba7286611c",
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
  "id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
  "created_at": "2026-10-29T15:51:11.215952Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5ace4724-e78a-42c6-bb15-767f47cce72c` → **200**

```json
{
  "id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
  "created_at": "2026-10-29T15:51:11.215952Z",
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
    "id": "aebeaec5-512a-4a8b-a209-d01349dd76be",
    "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
    "expires_at": "2026-10-29T15:51:26.220221Z",
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

`POST /api/driver/v1/offers/aebeaec5-512a-4a8b-a209-d01349dd76be/accept` → **200**

```json
{
  "command_id": "01b33245-ba1c-4686-ba8f-4faa62a1d9ab"
}
```

```json
{
  "id": "51aaeef5-6fa7-4e07-b9d7-35976531777f",
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a40cf216-47cd-490f-b938-46fc7ab83108",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a40cf216-47cd-490f-b938-46fc7ab83108",
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "assignment_id": "51aaeef5-6fa7-4e07-b9d7-35976531777f",
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

`POST /api/driver/v1/work-sessions/e07e84fc-38d8-467d-9982-fdd9b4d11ba9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:12Z",
    "sequence": 1793289072391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:51:12.40959Z",
  "last_location_at": "2026-10-29T15:51:12.40959Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a40cf216-47cd-490f-b938-46fc7ab83108/arrive` → **200**

```json
{
  "command_id": "2525a58a-9ff0-4a0a-9986-98d683abd896",
  "expected_version": 0
}
```

```json
{
  "id": "a40cf216-47cd-490f-b938-46fc7ab83108",
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "assignment_id": "51aaeef5-6fa7-4e07-b9d7-35976531777f",
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
  "arrived_at": "2026-10-29T15:51:12.647891Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a40cf216-47cd-490f-b938-46fc7ab83108/start` → **200**

```json
{
  "command_id": "0d4590a7-4c86-41d7-b258-897618a6eb50",
  "expected_version": 1
}
```

```json
{
  "id": "a40cf216-47cd-490f-b938-46fc7ab83108",
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "assignment_id": "51aaeef5-6fa7-4e07-b9d7-35976531777f",
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
  "arrived_at": "2026-10-29T15:51:12.647891Z",
  "started_at": "2026-10-29T15:51:12.886709Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a40cf216-47cd-490f-b938-46fc7ab83108/complete` → **200**

```json
{
  "command_id": "cb0d9807-0c63-4415-a0b3-fe5ccd5ba4f3",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:13Z",
  "cash_received": true
}
```

```json
{
  "id": "a40cf216-47cd-490f-b938-46fc7ab83108",
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "assignment_id": "51aaeef5-6fa7-4e07-b9d7-35976531777f",
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
  "arrived_at": "2026-10-29T15:51:12.647891Z",
  "started_at": "2026-10-29T15:51:12.886709Z",
  "completed_at": "2026-10-29T15:51:13.141092Z",
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
  "client_id": "39de6679-fa46-477b-8a42-fc051417ae37",
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
      "id": "19645170-3447-4860-a03c-3c3f7bf58143",
      "at": "2026-10-29T15:51:10.975799Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
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

`GET /api/rider/v1/orders/5ace4724-e78a-42c6-bb15-767f47cce72c/tip` → **200**

```json
{
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
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
  "available_until": "2026-10-30T15:51:13.141092Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5ace4724-e78a-42c6-bb15-767f47cce72c/tip` → **201**

```json
{
  "command_id": "1b421585-5b3b-451e-a569-66713b4bd527",
  "amount_minor": 2500
}
```

```json
{
  "id": "adf834d1-f98b-4e3c-a419-4b6d1c816183",
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:51:14.092307Z"
}
```

`GET /api/rider/v1/orders/5ace4724-e78a-42c6-bb15-767f47cce72c/tip` → **200**

```json
{
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
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
  "available_until": "2026-10-30T15:51:13.141092Z",
  "open": false,
  "tip": {
    "id": "adf834d1-f98b-4e3c-a419-4b6d1c816183",
    "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:51:14.092307Z"
  }
}
```

`GET /api/rider/v1/orders/5ace4724-e78a-42c6-bb15-767f47cce72c/tip` → **200**

```json
{
  "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
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
  "available_until": "2026-10-30T15:51:13.141092Z",
  "open": false,
  "tip": {
    "id": "adf834d1-f98b-4e3c-a419-4b6d1c816183",
    "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:51:14.092307Z"
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
      "id": "2690a836-db75-4803-bd21-b46f4702ca33",
      "at": "2026-10-29T15:51:15.541747Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
      "counterpart_id": null
    },
    {
      "id": "79001550-bc6b-4560-ba02-1c288880fd68",
      "at": "2026-10-29T15:51:13.5073Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5ace4724-e78a-42c6-bb15-767f47cce72c",
      "counterpart_id": null
    },
    {
      "id": "e59628d1-391c-45d2-bb8a-b257a697c952",
      "at": "2026-10-29T15:51:09.47852Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
      "counterpart_id": null
    },
    {
      "id": "3fc95384-2e43-4b7a-b8d5-04783fbc2739",
      "at": "2026-10-29T15:51:05.42591Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "762c4c6c-193d-4b45-86be-1ce0a4b3a80c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e07e84fc-38d8-467d-9982-fdd9b4d11ba9",
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
  "last_heartbeat_at": "2026-10-29T15:51:12.40959Z",
  "last_location_at": "2026-10-29T15:51:12.40959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e07e84fc-38d8-467d-9982-fdd9b4d11ba9/close` → **200**

```json
{
  "command_id": "b46a4463-8145-4844-a30b-4fb26ca8e4b8",
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

Done: card order 5ace4724-e78a-42c6-bb15-767f47cce72c.

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
  "phone": "+380732811231",
  "device_ref": "sandbox-2099"
}
```

```json
{
  "challenge_id": "9e8d74e9-7d42-4483-bd33-e4b60f5785eb",
  "expires_at": "2026-10-29T15:56:16.723529336Z",
  "resend_available_at": "2026-10-29T15:51:17.723529336Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732811231` → **200**

```json
{
  "phone": "+380732811231",
  "audience": "CLIENT",
  "code": "539792",
  "sent_at": "2026-10-29T15:51:16.727129503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e8d74e9-7d42-4483-bd33-e4b60f5785eb",
  "code": "539792",
  "device_ref": "sandbox-2099"
}
```

```json
{
  "session_id": "d75ce107-972d-42b8-9634-a661ef6c24b7",
  "subject": {
    "type": "CLIENT",
    "id": "5dd5c15e-5e7f-477a-8f30-a025aabcff0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGQ1YzE1ZS01ZTdmLTQ3N2EtOGYzMC1hMDI1YWFiY2ZmMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTc2LCJpYXQiOjE3OTMyODkwNzYsImp0aSI6ImM1YTYzMzFiLTYzMzgtNGIyYi1iM2VkLTFhNmMxOTlkNjc2MyIsInNpZCI6ImQ3NWNlMTA3LTk3MmQtNDJiOC05NjM0LWE2NjFlZjZjMjRiNyJ9.EvEspSrJDdWqNlrtEL2p1TTaBgnfERxZIqoD6PX45Mo",
  "access_expires_at": "2026-10-29T16:06:16.975070179Z",
  "refresh_token": "I5Q4K7ClJZYMtu51LBErsR7hZL1EYGw0A0Vqps7VZWM",
  "refresh_expires_at": "2026-11-28T15:51:16.974570749Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "2b10d8d9-8519-468b-b083-6f80da2b7021",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "4f9f61d0-ccd9-440a-a396-0c4df21f2dfa",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4f9f61d0-ccd9-440a-a396-0c4df21f2dfa",
    "orderDate": "1793289077",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "1614a7737940763dd404ce5a7d0d77fc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4f9f61d0-ccd9-440a-a396-0c4df21f2dfa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732811231"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4f9f61d0-ccd9-440a-a396-0c4df21f2dfa",
  "created_at": "2026-10-29T15:51:17.207694Z",
  "expires_at": "2026-10-29T16:21:17.207694Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/4f9f61d0-ccd9-440a-a396-0c4df21f2dfa` → **200**

```json
{
  "id": "4f9f61d0-ccd9-440a-a396-0c4df21f2dfa",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:51:17.207694Z",
  "expires_at": "2026-10-29T16:21:17.207694Z",
  "completed_at": "2026-10-29T15:51:17.438966Z",
  "masked_pan": "41****7889",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5dd5c15e-5e7f-477a-8f30-a025aabcff0b",
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
      "id": "9709aaa4-7692-46b5-a923-0cb226e4f165",
      "at": "2026-10-29T15:51:17.571243Z",
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
  "client_id": "5dd5c15e-5e7f-477a-8f30-a025aabcff0b",
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
      "id": "9709aaa4-7692-46b5-a923-0cb226e4f165",
      "at": "2026-10-29T15:51:17.571243Z",
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
  "device_ref": "sandbox-7215"
}
```

```json
{
  "challenge_id": "e0f524f7-c801-478e-9e5e-873d4153cbc8",
  "expires_at": "2026-10-29T15:56:18.131520353Z",
  "resend_available_at": "2026-10-29T15:51:19.131520353Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "025443",
  "sent_at": "2026-10-29T15:51:18.134106647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0f524f7-c801-478e-9e5e-873d4153cbc8",
  "code": "025443",
  "device_ref": "sandbox-7215"
}
```

```json
{
  "session_id": "2c19c272-4822-4d7b-afb8-da05add74743",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk3OCwiaWF0IjoxNzkzMjg5MDc4LCJqdGkiOiI5YTI0MTliNi01ZTRmLTQ1ZWUtOWRmYS1mNzEzMjM1NjNhNzYiLCJzaWQiOiIyYzE5YzI3Mi00ODIyLTRkN2ItYWZiOC1kYTA1YWRkNzQ3NDMifQ.SImp6M6fsjOGNwftT75_RPjXTBHy3iqSH-CeHY3W3so",
  "access_expires_at": "2026-10-29T16:06:18.392817227Z",
  "refresh_token": "EVTX4f-OIXH8DyB6zcmVrXMIaus9yYDfbU65BqE8MY8",
  "refresh_expires_at": "2026-11-28T15:51:18.392301993Z",
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
  "command_id": "48a0d8e6-6e57-4b35-89bd-57f5ad2e29cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b209805c-5f7e-4023-bbee-f348af217e45",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b209805c-5f7e-4023-bbee-f348af217e45",
    "orderDate": "1793289078",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "59c55be6c86e9d4f462797a677219b55",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b209805c-5f7e-4023-bbee-f348af217e45",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b209805c-5f7e-4023-bbee-f348af217e45",
  "created_at": "2026-10-29T15:51:18.846231Z",
  "expires_at": "2026-10-29T16:21:18.846231Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b209805c-5f7e-4023-bbee-f348af217e45` → **200**

```json
{
  "id": "b209805c-5f7e-4023-bbee-f348af217e45",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:51:18.846231Z",
  "expires_at": "2026-10-29T16:21:18.846231Z",
  "completed_at": "2026-10-29T15:51:19.068429Z",
  "masked_pan": "41****9294",
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
      "id": "b38a622e-2bbe-4fb8-afd2-b94c80d47c4a",
      "at": "2026-10-29T15:51:19.578666Z",
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
  "command_id": "f7b46f0f-5493-4f10-b62d-b2390d706d07",
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
  "correlation_id": "609a2ba7-d459-4d77-8728-6b1bdbdd5052"
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
  "device_ref": "sandbox-13653"
}
```

```json
{
  "challenge_id": "aa8280f2-88bd-4d97-b1e4-7efd2f29bd84",
  "expires_at": "2026-10-29T15:56:20.997524267Z",
  "resend_available_at": "2026-10-29T15:51:21.997524267Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "266650",
  "sent_at": "2026-10-29T15:51:20.999905968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa8280f2-88bd-4d97-b1e4-7efd2f29bd84",
  "code": "266650",
  "device_ref": "sandbox-13653"
}
```

```json
{
  "session_id": "ca8067f8-0690-462f-a905-e0ef923e3762",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk4MSwiaWF0IjoxNzkzMjg5MDgxLCJqdGkiOiJkNjdiNTMzNi03NTlmLTRhNjQtYTUyYS1iYzEzODlkNWM4NTkiLCJzaWQiOiJjYTgwNjdmOC0wNjkwLTQ2MmYtYTkwNS1lMGVmOTIzZTM3NjIifQ.-CLRoenR75FCF1y6LsSK1Hciu2142Lu95AGDnAMN_r4",
  "access_expires_at": "2026-10-29T16:06:21.248040538Z",
  "refresh_token": "SmMviiOIsVnxuL4ihE1lfHZTh7lHmoezOyHd4DERoD0",
  "refresh_expires_at": "2026-11-28T15:51:21.247411155Z",
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
  "command_id": "b3d44b7c-a4bd-4a80-bb62-eabff572af95",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:21Z",
    "sequence": 1793289081681
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f4ce08f-1b8d-4467-a86f-cca94e01a8e3",
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
  "last_heartbeat_at": "2026-10-29T15:51:21.698778Z",
  "last_location_at": "2026-10-29T15:51:21.698778Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632271288",
  "device_ref": "sandbox-7888"
}
```

```json
{
  "challenge_id": "9b605532-a4f3-42ce-b9b9-41cf5ce7775a",
  "expires_at": "2026-10-29T15:56:21.931301799Z",
  "resend_available_at": "2026-10-29T15:51:22.931301799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632271288` → **200**

```json
{
  "phone": "+380632271288",
  "audience": "CLIENT",
  "code": "074356",
  "sent_at": "2026-10-29T15:51:21.933707903Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b605532-a4f3-42ce-b9b9-41cf5ce7775a",
  "code": "074356",
  "device_ref": "sandbox-7888"
}
```

```json
{
  "session_id": "6144822b-0c89-4e78-828e-9e68b5174c6a",
  "subject": {
    "type": "CLIENT",
    "id": "2339c5da-dbb6-4193-b058-211af9d1b93c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMzM5YzVkYS1kYmI2LTQxOTMtYjA1OC0yMTFhZjlkMWI5M2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTgyLCJpYXQiOjE3OTMyODkwODIsImp0aSI6IjFjZTk0MGQyLTdiZTItNGIyNy1iODcxLWQyZmE4Nzg3ZDY4YSIsInNpZCI6IjYxNDQ4MjJiLTBjODktNGU3OC04MjhlLTllNjhiNTE3NGM2YSJ9.C9sK-d7SekxqNZ5-bE7suHtAwjlGzGV1uS5oqzdK2V0",
  "access_expires_at": "2026-10-29T16:06:22.189509735Z",
  "refresh_token": "kMk3HoOZlMqJxgly7QI6kLO4xeTmntjnVoUDOJMK-rk",
  "refresh_expires_at": "2026-11-28T15:51:22.189018787Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76c3f1f4-3548-4860-9d89-a548442a7664",
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
  "id": "11886b74-8f9a-43e8-ab1f-f68de49fdd43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:22.425939Z",
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
  "command_id": "c70c7c8a-979f-4156-9039-f5dfbbc8c43a",
  "quote_id": "11886b74-8f9a-43e8-ab1f-f68de49fdd43",
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
  "id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2339c5da-dbb6-4193-b058-211af9d1b93c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:51:22.660521Z",
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
    "id": "325154fa-9d4a-45bc-a289-d6f1fea33548",
    "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
    "expires_at": "2026-10-29T15:51:37.663548Z",
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

`POST /api/driver/v1/offers/325154fa-9d4a-45bc-a289-d6f1fea33548/accept` → **200**

```json
{
  "command_id": "9007917f-8afb-4ee7-b670-23358cc3c062"
}
```

```json
{
  "id": "896087f5-c506-492d-8e7f-22c0d7932182",
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ba6a67ff-3e6c-45c3-925d-e833c738cdb8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ba6a67ff-3e6c-45c3-925d-e833c738cdb8",
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "assignment_id": "896087f5-c506-492d-8e7f-22c0d7932182",
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

`POST /api/driver/v1/work-sessions/3f4ce08f-1b8d-4467-a86f-cca94e01a8e3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:23Z",
    "sequence": 1793289083590
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f4ce08f-1b8d-4467-a86f-cca94e01a8e3",
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
  "last_heartbeat_at": "2026-10-29T15:51:23.607654Z",
  "last_location_at": "2026-10-29T15:51:23.607654Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ba6a67ff-3e6c-45c3-925d-e833c738cdb8/arrive` → **200**

```json
{
  "command_id": "91a2b1c1-db8e-42eb-b06f-d46fb9affe99",
  "expected_version": 0
}
```

```json
{
  "id": "ba6a67ff-3e6c-45c3-925d-e833c738cdb8",
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "assignment_id": "896087f5-c506-492d-8e7f-22c0d7932182",
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
  "arrived_at": "2026-10-29T15:51:23.844572Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ba6a67ff-3e6c-45c3-925d-e833c738cdb8/start` → **200**

```json
{
  "command_id": "d962e894-dbd2-4caa-907a-8a80bacce3f1",
  "expected_version": 1
}
```

```json
{
  "id": "ba6a67ff-3e6c-45c3-925d-e833c738cdb8",
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "assignment_id": "896087f5-c506-492d-8e7f-22c0d7932182",
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
  "arrived_at": "2026-10-29T15:51:23.844572Z",
  "started_at": "2026-10-29T15:51:24.083783Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ba6a67ff-3e6c-45c3-925d-e833c738cdb8/complete` → **200**

```json
{
  "command_id": "a563243f-e3a7-4d7b-8f18-578c66bd1a25",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:24Z",
  "cash_received": false
}
```

```json
{
  "id": "ba6a67ff-3e6c-45c3-925d-e833c738cdb8",
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "assignment_id": "896087f5-c506-492d-8e7f-22c0d7932182",
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
  "arrived_at": "2026-10-29T15:51:23.844572Z",
  "started_at": "2026-10-29T15:51:24.083783Z",
  "completed_at": "2026-10-29T15:51:24.33259Z",
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
  "session_id": "f597b467-e4e1-4257-8bc7-2dd0833e9cae",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5ODQsImlhdCI6MTc5MzI4OTA4NCwianRpIjoiODExZTc5ZmEtZmZkNi00NDA5LTlhZGUtOTgwODFjMGUxZjljIiwic2lkIjoiZjU5N2I0NjctZTRlMS00MjU3LThiYzctMmRkMDgzM2U5Y2FlIn0.RMzegUO39GlLl5a6JgLrUyl3ZYS8IiR0wPhSIetSqnQ",
  "access_expires_at": "2026-10-29T16:06:24.829623493Z",
  "refresh_token": "zMYqceBUBeZwA0FV77fdP4QZpSDpUlFnSZgCwXK5SKM",
  "refresh_expires_at": "2026-10-30T03:51:24.829104714Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e0b33ae1-26bc-48b2-83b9-e70d34217f40/cash-dispute` → **200**

```json
{
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2339c5da-dbb6-4193-b058-211af9d1b93c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:51:24.63024Z",
  "decide_by": "2026-11-12T15:51:24.63024Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T15:51:24.63024Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2339c5da-dbb6-4193-b058-211af9d1b93c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T15:51:24.63024Z",
      "decide_by": "2026-11-12T15:51:24.63024Z",
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

`POST /api/admin/v1/orders/e0b33ae1-26bc-48b2-83b9-e70d34217f40/cash-dispute/decide` → **400**

```json
{
  "command_id": "f5023a01-d538-4702-bbb7-6a64f763b560",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/e0b33ae1-26bc-48b2-83b9-e70d34217f40/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2fe11f09-e13a-4c46-9340-0539e8cf6767",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/e0b33ae1-26bc-48b2-83b9-e70d34217f40/cash-dispute/decide` → **200**

```json
{
  "command_id": "ead5e4d2-0463-4959-95d5-20ad3bec8d20",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2339c5da-dbb6-4193-b058-211af9d1b93c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:51:24.63024Z",
  "decide_by": "2026-11-12T15:51:24.63024Z",
  "decision": "PAY_DRIVER",
  "decided_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T15:51:25.781351Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/e0b33ae1-26bc-48b2-83b9-e70d34217f40/cash-dispute/decide` → **409**

```json
{
  "command_id": "82887085-9ecc-49f0-bd41-1dffd5ba8b6a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e0b33ae1-26bc-48b2-83b9-e70d34217f40/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4f6c3ee1-e5f3-4503-94df-c9d5fc9a4102"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f4ce08f-1b8d-4467-a86f-cca94e01a8e3",
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
  "last_heartbeat_at": "2026-10-29T15:51:23.607654Z",
  "last_location_at": "2026-10-29T15:51:23.607654Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f4ce08f-1b8d-4467-a86f-cca94e01a8e3/close` → **200**

```json
{
  "command_id": "3ea475fe-4f3d-4438-be6e-7ecd3c8ff96b",
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
  "phone": "+380733368069",
  "device_ref": "sandbox-6015"
}
```

```json
{
  "challenge_id": "1fb7c2f6-4db3-4218-9c3c-8672789d98b4",
  "expires_at": "2026-10-29T15:56:26.730781656Z",
  "resend_available_at": "2026-10-29T15:51:27.730781656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733368069` → **200**

```json
{
  "phone": "+380733368069",
  "audience": "CLIENT",
  "code": "136670",
  "sent_at": "2026-10-29T15:51:26.733191719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fb7c2f6-4db3-4218-9c3c-8672789d98b4",
  "code": "136670",
  "device_ref": "sandbox-6015"
}
```

```json
{
  "session_id": "3a73b7c9-613f-4913-913e-e3d0e6151d57",
  "subject": {
    "type": "CLIENT",
    "id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWE5YjVlOS1lMWQxLTQyNWItODRlMy00OGExNDljNzQ0NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTg2LCJpYXQiOjE3OTMyODkwODYsImp0aSI6IjcwZThiYjY1LWQ5OGMtNDI4My1hN2E3LTliNDk4M2ExZDZiNiIsInNpZCI6IjNhNzNiN2M5LTYxM2YtNDkxMy05MTNlLWUzZDBlNjE1MWQ1NyJ9.9X4ewfhJkrutKNRJG0NcBnE3LSoASVeHRSovKkx-dEk",
  "access_expires_at": "2026-10-29T16:06:26.984584055Z",
  "refresh_token": "GcxMHHMyj4XSLtRTO7s3q-fjY-Tmg1BbCmTjm3zg9ts",
  "refresh_expires_at": "2026-11-28T15:51:26.984103803Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "722f141b-2404-44ff-a262-ccd932be2c74",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "283d4488-f7d3-4ce0-a1fb-22a4cc77729f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-283d4488-f7d3-4ce0-a1fb-22a4cc77729f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b1282550468cd2de1bc857df46c72825",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=283d4488-f7d3-4ce0-a1fb-22a4cc77729f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733368069"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=283d4488-f7d3-4ce0-a1fb-22a4cc77729f",
  "expires_at": "2026-10-29T16:21:27.221192Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/283d4488-f7d3-4ce0-a1fb-22a4cc77729f` → **200**

```json
{
  "id": "283d4488-f7d3-4ce0-a1fb-22a4cc77729f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:21:27.221192Z",
  "card": {
    "id": "f6647f90-8824-4b55-9bde-d9bd5b907e32",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8701",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:51:27.458041Z"
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
  "device_ref": "sandbox-16515"
}
```

```json
{
  "challenge_id": "e3711993-31f7-4cb1-8271-b0137de5645d",
  "expires_at": "2026-10-29T15:56:27.709494132Z",
  "resend_available_at": "2026-10-29T15:51:28.709494132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "228375",
  "sent_at": "2026-10-29T15:51:27.711910524Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3711993-31f7-4cb1-8271-b0137de5645d",
  "code": "228375",
  "device_ref": "sandbox-16515"
}
```

```json
{
  "session_id": "0ce110fd-74fd-44a3-a54c-6051d7fdda43",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk4NywiaWF0IjoxNzkzMjg5MDg3LCJqdGkiOiJkNDlhY2I0OC03ZjY3LTQzOGEtYWRlNi1hODAzMzMyODFlNzkiLCJzaWQiOiIwY2UxMTBmZC03NGZkLTQ0YTMtYTU0Yy02MDUxZDdmZGRhNDMifQ.ArZ7iCtHba9jSnT0xDB4TvnNOGX2h-n3qWpMFoGGqvw",
  "access_expires_at": "2026-10-29T16:06:27.965450553Z",
  "refresh_token": "lhaqE6dvtbmg11NC9bTY6DzLrws64s-opKbzdE8CIg0",
  "refresh_expires_at": "2026-11-28T15:51:27.96492937Z",
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
  "command_id": "1b76dda2-7960-4fc8-8335-4b1d20688c05",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:28Z",
    "sequence": 1793289088417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dcd314e1-0f20-4a4b-8cb8-ef49390c9cde",
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
  "last_heartbeat_at": "2026-10-29T15:51:28.436532Z",
  "last_location_at": "2026-10-29T15:51:28.436532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "269c9f7a-6be5-423d-88ec-55c1bc6a94c0",
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
  "id": "e6caf330-f081-4ffe-b741-67ca609d4908",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:28.679510Z",
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
  "command_id": "8098bfba-55aa-40e3-a7cb-dd284264d128",
  "quote_id": "e6caf330-f081-4ffe-b741-67ca609d4908",
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
  "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
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
  "created_at": "2026-10-29T15:51:28.921694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c` → **200**

```json
{
  "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
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
  "created_at": "2026-10-29T15:51:28.921694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c` → **200**

```json
{
  "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
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
  "created_at": "2026-10-29T15:51:28.921694Z",
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
    "id": "f8e9d51f-6dd0-4fdd-bf79-d43cef68452d",
    "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
    "expires_at": "2026-10-29T15:51:44.666665Z",
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

`POST /api/driver/v1/offers/f8e9d51f-6dd0-4fdd-bf79-d43cef68452d/accept` → **200**

```json
{
  "command_id": "45771e44-b290-4bc1-acfb-e127878676c3"
}
```

```json
{
  "id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "assignment_id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
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

`POST /api/rider/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/messages` → **201**

```json
{
  "command_id": "2753efd4-8020-41e4-8b44-a49d6462ea33",
  "body": "Я біля входу, мій номер +380733368069, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "981688c5-adc8-4b36-89e8-7ba82a572386",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380733368069, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T15:51:31.330852767Z"
}
```

`POST /api/driver/v1/trips/f4dc75a6-5a15-4c93-96b1-87d5b752d2ae/messages` → **201**

```json
{
  "command_id": "a9d79c9c-da25-46b5-9d64-08fec1f0897f",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "4a878712-ca71-4abe-a0ad-3774a7b8ba2e",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T15:51:31.568301476Z"
}
```

`POST /api/driver/v1/work-sessions/dcd314e1-0f20-4a4b-8cb8-ef49390c9cde/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:31Z",
    "sequence": 1793289091792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dcd314e1-0f20-4a4b-8cb8-ef49390c9cde",
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
  "last_heartbeat_at": "2026-10-29T15:51:31.809882Z",
  "last_location_at": "2026-10-29T15:51:31.809882Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f4dc75a6-5a15-4c93-96b1-87d5b752d2ae/arrive` → **200**

```json
{
  "command_id": "3535438d-291b-4020-b4e4-f34b22750a02",
  "expected_version": 0
}
```

```json
{
  "id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "assignment_id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
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
  "arrived_at": "2026-10-29T15:51:32.053565Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4dc75a6-5a15-4c93-96b1-87d5b752d2ae/start` → **200**

```json
{
  "command_id": "b795ffc9-59e0-4333-b5ad-7f4e976aac4e",
  "expected_version": 1
}
```

```json
{
  "id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "assignment_id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
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
  "arrived_at": "2026-10-29T15:51:32.053565Z",
  "started_at": "2026-10-29T15:51:32.288883Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/dcd314e1-0f20-4a4b-8cb8-ef49390c9cde/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:32Z",
    "sequence": 1793289092510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "dcd314e1-0f20-4a4b-8cb8-ef49390c9cde",
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
  "last_heartbeat_at": "2026-10-29T15:51:32.527428Z",
  "last_location_at": "2026-10-29T15:51:32.527428Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f4dc75a6-5a15-4c93-96b1-87d5b752d2ae/complete` → **200**

```json
{
  "command_id": "941877d3-3362-4346-995a-196adecf6485",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:32Z",
  "cash_received": false
}
```

```json
{
  "id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "assignment_id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
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
  "arrived_at": "2026-10-29T15:51:32.053565Z",
  "started_at": "2026-10-29T15:51:32.288883Z",
  "completed_at": "2026-10-29T15:51:32.767427Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c` → **200**

```json
{
  "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
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
    "id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
    "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:28.921694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c` → **200**

```json
{
  "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
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
    "id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
    "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:28.921694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c` → **200**

```json
{
  "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
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
    "id": "2bcb4a5e-5ba8-4131-9fd5-84a1b89262d9",
    "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f4dc75a6-5a15-4c93-96b1-87d5b752d2ae",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:51:28.921694Z",
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
  "session_id": "dcd314e1-0f20-4a4b-8cb8-ef49390c9cde",
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
  "last_heartbeat_at": "2026-10-29T15:51:32.527428Z",
  "last_location_at": "2026-10-29T15:51:32.527428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dcd314e1-0f20-4a4b-8cb8-ef49390c9cde/close` → **200**

```json
{
  "command_id": "015ac4e0-136f-45e4-b5f6-c566dc0784d5",
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
  "session_id": "e7a7d44b-4335-428f-a4de-cbc2a2741e11",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTYsImlhdCI6MTc5MzI4OTA5NiwianRpIjoiMGJlZTkxNmUtM2UyOC00M2YwLTk5MzUtZjk5YTU3N2U2ZGQyIiwic2lkIjoiZTdhN2Q0NGItNDMzNS00MjhmLWE0ZGUtY2JjMmEyNzQxZTExIn0.jE-kq8U9DcrTbBrnubL6QQCdzGuCc87bAKXL2SHqoEQ",
  "access_expires_at": "2026-10-29T16:06:36.426463503Z",
  "refresh_token": "qgS1nuzYh9BjaH6vpQNkDff88Yh1-uUiyf1rDx5KWjE",
  "refresh_expires_at": "2026-10-30T03:51:36.426043931Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "648649e1-541f-49be-84f3-047686c3bb15"
}
```

`GET /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T15:51:36.89515527Z",
  "order": {
    "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
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
    "created_at": "2026-10-29T15:51:28.921694Z",
    "assigned_at": "2026-10-29T15:51:30.879299Z",
    "arrived_at": "2026-10-29T15:51:32.053565Z",
    "started_at": "2026-10-29T15:51:32.288883Z",
    "completed_at": "2026-10-29T15:51:32.767427Z"
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
    "id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
    "registered_at": "2026-10-29T15:51:26.982238Z",
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
      "created_at": "2026-10-29T15:51:28.924073Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T15:51:33.72634Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks` → **422**

```json
{
  "command_id": "735c4bf6-94e2-4ecb-8c73-fa31a83e6915",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "071d6f84-06bf-4eff-9fca-91cf030feb0e"
}
```

`POST /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks` → **201**

```json
{
  "command_id": "5d6029bd-bb55-480e-b7cd-beeb4410a5d3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "69396c27-98fd-4ce0-80f0-8c0ff13fb1b4",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:51:37.422509Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks` → **201**

```json
{
  "command_id": "5d6029bd-bb55-480e-b7cd-beeb4410a5d3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "69396c27-98fd-4ce0-80f0-8c0ff13fb1b4",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:51:37.422509Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/4ea9b5e9-e1d1-425b-84e3-48a149c74466` → **200**

```json
{
  "client": {
    "id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
    "phone": "+380733368069",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:51:26.982238Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:51:28.921694Z",
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

`POST /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks/69396c27-98fd-4ce0-80f0-8c0ff13fb1b4/resolve` → **200**

```json
{
  "command_id": "aa35f47b-6fa1-484b-ad5e-58eadcf50fd7",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "69396c27-98fd-4ce0-80f0-8c0ff13fb1b4",
  "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T15:51:37.422509Z",
  "resolved_at": "2026-10-29T15:51:38.176137Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/4ea9b5e9-e1d1-425b-84e3-48a149c74466` → **200**

```json
{
  "client": {
    "id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
    "phone": "+380733368069",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:51:26.982238Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:51:28.921694Z",
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

`GET /api/admin/v1/clients/4ea9b5e9-e1d1-425b-84e3-48a149c74466` → **200**

```json
{
  "client": {
    "id": "4ea9b5e9-e1d1-425b-84e3-48a149c74466",
    "phone": "+380733368069",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:51:26.982238Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "fba52908-85cc-43cc-a046-12613f1cb24c",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:51:28.921694Z",
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

`POST /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks/69396c27-98fd-4ce0-80f0-8c0ff13fb1b4/resolve` → **409**

```json
{
  "command_id": "52f81d6c-6f47-47f3-a20f-881eac6dd099",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks/69396c27-98fd-4ce0-80f0-8c0ff13fb1b4/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7be6f98b-7fa3-49c6-9ffd-33bf6b15aa3f"
}
```

`GET /api/admin/v1/orders/fba52908-85cc-43cc-a046-12613f1cb24c/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "69396c27-98fd-4ce0-80f0-8c0ff13fb1b4",
      "order_id": "fba52908-85cc-43cc-a046-12613f1cb24c",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T15:51:37.422509Z",
      "resolved_at": "2026-10-29T15:51:38.176137Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order fba52908-85cc-43cc-a046-12613f1cb24c without phone or card digits; chargeback 69396c27-98fd-4ce0-80f0-8c0ff13fb1b4 recorded and won.

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
  "session_id": "e57ed207-a64d-4cfe-b635-71c6807636b1",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMDAsImlhdCI6MTc5MzI4OTEwMCwianRpIjoiMWUxNzcxMWYtZDVjZC00YjAyLWFjNjItZWM5NGNiZTM1ZmZiIiwic2lkIjoiZTU3ZWQyMDctYTY0ZC00Y2ZlLWI2MzUtNzFjNjgwNzYzNmIxIn0.O3LHtAtpaiBYe0cXLebhaAjZqmuY0Bc59czh10TsYGg",
  "access_expires_at": "2026-10-29T16:06:40.895775407Z",
  "refresh_token": "IOvJs5FVc6G7VXE7v9JSIyVClmErgzdMi78eFRhbC0w",
  "refresh_expires_at": "2026-10-30T03:51:40.89530566Z",
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
  "phone": "+48600165305",
  "device_ref": "sandbox-10808"
}
```

```json
{
  "challenge_id": "4e980cc4-dc9b-4077-8a54-41472fc133a1",
  "expires_at": "2026-10-29T15:56:41.598160394Z",
  "resend_available_at": "2026-10-29T15:51:42.598160394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600165305` → **200**

```json
{
  "phone": "+48600165305",
  "audience": "CLIENT",
  "code": "761186",
  "sent_at": "2026-10-29T15:51:41.600674111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e980cc4-dc9b-4077-8a54-41472fc133a1",
  "code": "761186",
  "device_ref": "sandbox-10808"
}
```

```json
{
  "session_id": "45370576-b9e4-4286-89c3-8271b03bf8b1",
  "subject": {
    "type": "CLIENT",
    "id": "8b532699-a804-4cd6-829d-03fb096d8c70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjUzMjY5OS1hODA0LTRjZDYtODI5ZC0wM2ZiMDk2ZDhjNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDAxLCJpYXQiOjE3OTMyODkxMDEsImp0aSI6IjlkYzk4ZTFhLTE4NDAtNDg4Yy05Mjg5LTRlZTU3NDkyODgyZCIsInNpZCI6IjQ1MzcwNTc2LWI5ZTQtNDI4Ni04OWMzLTgyNzFiMDNiZjhiMSJ9.qfAwAI5wRbOPSuFHI694-bfv8euoK9SirGHaV54hWqk",
  "access_expires_at": "2026-10-29T16:06:41.850381764Z",
  "refresh_token": "rDiT-KKh6wphrilujFgdHo3ctW2IgKAEy_qOV21s_zc",
  "refresh_expires_at": "2026-11-28T15:51:41.84982631Z",
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
  "command_id": "119be9e5-cf85-416d-8c64-7419de2b1f20",
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
  "correlation_id": "568d534f-09ac-49fb-a4d4-a8217d3ee3c1",
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
  "command_id": "2bd9a6ff-d8f7-4e24-b5d6-2b92b7a1a432",
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
  "paused_at": "2026-10-29T15:51:42.765171257Z",
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
  "command_id": "73e12710-89a9-4339-9acc-ef866cfaeb81",
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
  "id": "85fa46c2-2671-424e-8bc3-f0c5eb27cf22",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:43.244746Z",
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
  "command_id": "4b50df47-0bf4-4c9c-baa8-f1c71a72268f",
  "quote_id": "85fa46c2-2671-424e-8bc3-f0c5eb27cf22",
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
  "correlation_id": "562daf64-728b-4c97-864f-262b5dba0d6b"
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
  "paused_at": "2026-10-29T15:51:42.765171Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "5a6f2941-c1e6-4f0b-857d-21a9f57d145f",
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
  "command_id": "ea5d6f12-d232-4c16-8ce6-4d260f76c5f5",
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
  "command_id": "ceeb7d6f-3c24-4d9b-aa11-6735ff0f9383",
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
  "id": "ba176c98-cfb9-4d7c-83bc-0860a9d48e1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:44.692075Z",
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
  "command_id": "53eae6c9-8d76-457e-b657-2ea18d7c8068",
  "quote_id": "ba176c98-cfb9-4d7c-83bc-0860a9d48e1a",
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
  "correlation_id": "caff7dd8-6710-4d18-8a6f-223b34e019ae"
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
  "command_id": "ba559c8a-2a94-4629-9c3b-7b3ef7d39ba1",
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
  "command_id": "8297748f-d153-4d1d-8bba-5dea40bddb5c",
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
  "id": "c6503a3b-157c-499f-b314-6604b96b9243",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:45.646116Z",
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
  "command_id": "52589264-4b83-4368-9dd3-f1d47ec20d44",
  "quote_id": "c6503a3b-157c-499f-b314-6604b96b9243",
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
  "correlation_id": "f89bfbfc-4d91-4565-a03e-3cd7354f2d06"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "c47547e9-ea9a-4421-a751-1305c36883f2",
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
  "correlation_id": "5265aa82-ad05-45d7-b5b0-77b1b00348c0"
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
  "command_id": "fb9f2fa6-fc42-4976-a7e1-175ef2f47702",
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
  "phone": "+380678663990",
  "device_ref": "sandbox-31882"
}
```

```json
{
  "challenge_id": "bc07dae0-d3ff-4760-90dc-aa10627993fc",
  "expires_at": "2026-10-29T15:56:46.840852455Z",
  "resend_available_at": "2026-10-29T15:51:47.840852455Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678663990` → **200**

```json
{
  "phone": "+380678663990",
  "audience": "CLIENT",
  "code": "405912",
  "sent_at": "2026-10-29T15:51:46.843182592Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc07dae0-d3ff-4760-90dc-aa10627993fc",
  "code": "405912",
  "device_ref": "sandbox-31882"
}
```

```json
{
  "session_id": "ff1b24ae-99c9-41d2-b55f-3c3b3d02e285",
  "subject": {
    "type": "CLIENT",
    "id": "865f955e-1fc0-4c19-a71f-de2fb9c0569a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjVmOTU1ZS0xZmMwLTRjMTktYTcxZi1kZTJmYjljMDU2OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDA3LCJpYXQiOjE3OTMyODkxMDcsImp0aSI6ImVkZjhkMGI1LTI0NTktNDM0Zi1iODM3LWU5NDRmMTExN2MxYiIsInNpZCI6ImZmMWIyNGFlLTk5YzktNDFkMi1iNTVmLTNjM2IzZDAyZTI4NSJ9.mbyqxY1rlGb6TTqjILW4CPWARVQC3WyyIp33-bjSpho",
  "access_expires_at": "2026-10-29T16:06:47.101198854Z",
  "refresh_token": "2Pu_KeDsxJKx0eBUogj6qZ9Igv8O1XogfsGCWYBTukg",
  "refresh_expires_at": "2026-11-28T15:51:47.100768646Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "865f955e-1fc0-4c19-a71f-de2fb9c0569a",
  "session_id": "ff1b24ae-99c9-41d2-b55f-3c3b3d02e285",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04905e92-13a8-4d45-910a-f83ed6435033",
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
  "id": "e28c3292-b0f2-4c38-a292-9ca7cfe5216c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:47.563924Z",
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
  "challenge_id": "c2678ae4-e702-4566-8a48-4d6411249474",
  "expires_at": "2026-10-29T15:56:49.803831264Z",
  "resend_available_at": "2026-10-29T15:51:50.803831264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678663990` → **200**

```json
{
  "phone": "+380678663990",
  "audience": "CLIENT",
  "code": "912705",
  "sent_at": "2026-10-29T15:51:49.805733773Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ea6e2c7f-63cf-4d3a-9127-d22239b56663",
  "challenge_id": "c2678ae4-e702-4566-8a48-4d6411249474",
  "otp_code": "912705"
}
```

```json
{
  "client_id": "865f955e-1fc0-4c19-a71f-de2fb9c0569a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T15:51:50.060928848Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "76cdaa9a-a84d-4ba4-b1a4-825afc14935e",
  "quote_id": "e28c3292-b0f2-4c38-a292-9ca7cfe5216c",
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
  "correlation_id": "227a8daf-0949-41d2-a6f8-44b31444fb91"
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
  "session_id": "47942e7e-5cd9-4f42-bcd4-c32a505e652b",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTAsImlhdCI6MTc5MzI4OTExMCwianRpIjoiYWFkYTllYjAtMjg0Mi00NTIyLThkYTktN2Y3NTA5YTQ1OWExIiwic2lkIjoiNDc5NDJlN2UtNWNkOS00ZjQyLWJjZDQtYzMyYTUwNWU2NTJiIn0.K-rMLu9rU4bUHDFCPmZCkMZI97ImFs7TeDHva8yXDd4",
  "access_expires_at": "2026-10-29T16:06:50.787600127Z",
  "refresh_token": "m8nbQN_ZPq7dnoyOp_a6XqeghlB64er1darUwZuCZRA",
  "refresh_expires_at": "2026-10-30T03:51:50.787105879Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "865f955e-1fc0-4c19-a71f-de2fb9c0569a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T15:51:50.060929Z",
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

`POST /api/admin/v1/client-deletions/865f955e-1fc0-4c19-a71f-de2fb9c0569a/complete` → **200**

```json
{
  "command_id": "a69709ec-65af-4177-8f80-8db39e11bee4",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "865f955e-1fc0-4c19-a71f-de2fb9c0569a",
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
  "correlation_id": "d7c03e04-7f80-46be-bf1e-417617a2eaf6"
}
```

Done: client 865f955e-1fc0-4c19-a71f-de2fb9c0569a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660447009",
  "device_ref": "sandbox-23479"
}
```

```json
{
  "challenge_id": "57865102-a544-467a-b3c9-42a0486b0621",
  "expires_at": "2026-10-29T15:56:51.709113566Z",
  "resend_available_at": "2026-10-29T15:51:52.709113566Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660447009` → **200**

```json
{
  "phone": "+380660447009",
  "audience": "CLIENT",
  "code": "769338",
  "sent_at": "2026-10-29T15:51:51.711644313Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57865102-a544-467a-b3c9-42a0486b0621",
  "code": "769338",
  "device_ref": "sandbox-23479"
}
```

```json
{
  "session_id": "abf0cd86-14e5-4766-a61c-00b50cc34dbb",
  "subject": {
    "type": "CLIENT",
    "id": "9764ca82-cc98-435a-9736-3c5b140a866c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzY0Y2E4Mi1jYzk4LTQzNWEtOTczNi0zYzViMTQwYTg2NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDExLCJpYXQiOjE3OTMyODkxMTEsImp0aSI6IjZkOGE4ZTdmLWMxZjEtNGM2Yy05OWZjLThhMDczNmYxMmViYyIsInNpZCI6ImFiZjBjZDg2LTE0ZTUtNDc2Ni1hNjFjLTAwYjUwY2MzNGRiYiJ9.MJd0qcChiTeQaTMWzpjEcHrnYUNm-sV79-KYgzDbjLE",
  "access_expires_at": "2026-10-29T16:06:51.969185442Z",
  "refresh_token": "R7RxJy2PrO3XZ91XNb77fZERl5VdWfPcfqRcng-Yrn8",
  "refresh_expires_at": "2026-11-28T15:51:51.968737829Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9764ca82-cc98-435a-9736-3c5b140a866c",
  "session_id": "abf0cd86-14e5-4766-a61c-00b50cc34dbb",
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
  "session_id": "f977d91b-b552-4ed7-a86b-541e8690ea45",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTIsImlhdCI6MTc5MzI4OTExMiwianRpIjoiZWQyOGJkYzMtYWY5Ny00OWRkLTlhNDgtZjkxMDhhOTMyOTkxIiwic2lkIjoiZjk3N2Q5MWItYjU1Mi00ZWQ3LWE4NmItNTQxZTg2OTBlYTQ1In0.qaawg3iY1oiMS7QNWQ6CdYBXcowQhvu6u4YyBlSxOMY",
  "access_expires_at": "2026-10-29T16:06:52.677991879Z",
  "refresh_token": "3aDQzPtyiR5mHIeEIKzaaAXbJnsUBsjuNFeFw7PHCM8",
  "refresh_expires_at": "2026-10-30T03:51:52.677513209Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0447009&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9764ca82-cc98-435a-9736-3c5b140a866c",
      "phone": "+380660447009",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T15:51:51.967157Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9764ca82-cc98-435a-9736-3c5b140a866c` → **200**

```json
{
  "client": {
    "id": "9764ca82-cc98-435a-9736-3c5b140a866c",
    "phone": "+380660447009",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:51:51.967157Z",
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

`POST /api/admin/v1/clients/9764ca82-cc98-435a-9736-3c5b140a866c/block` → **400**

```json
{
  "command_id": "6bb209a5-1623-499c-b4c4-8d7453b62e3e",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9764ca82-cc98-435a-9736-3c5b140a866c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c4b82d93-4599-4aef-bdbf-397d9bacaadc",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9764ca82-cc98-435a-9736-3c5b140a866c/block` → **200**

```json
{
  "command_id": "ebba6d31-664c-40c5-b8c2-4c1ed7d7c9c5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9764ca82-cc98-435a-9736-3c5b140a866c",
  "phone": "+380660447009",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T15:51:51.967157Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T15:51:53.629359Z",
    "by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
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
  "correlation_id": "8f0cd3b4-26f5-496f-98f1-0cf76afca8c2"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660447009",
  "device_ref": "sandbox-28928"
}
```

```json
{
  "challenge_id": "da1b5d01-cd3d-4fab-9f52-4ec26fd6a9a4",
  "expires_at": "2026-10-29T15:56:56.102441989Z",
  "resend_available_at": "2026-10-29T15:51:57.102441989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660447009` → **200**

```json
{
  "phone": "+380660447009",
  "audience": "CLIENT",
  "code": "146022",
  "sent_at": "2026-10-29T15:51:56.104636453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "da1b5d01-cd3d-4fab-9f52-4ec26fd6a9a4",
  "code": "146022",
  "device_ref": "sandbox-28928"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "162b622d-faa4-41e9-8a2f-ff3a259a78cb"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9764ca82-cc98-435a-9736-3c5b140a866c` → **200**

```json
{
  "client": {
    "id": "9764ca82-cc98-435a-9736-3c5b140a866c",
    "phone": "+380660447009",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T15:51:51.967157Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T15:51:53.629359Z",
      "by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
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

`POST /api/admin/v1/clients/9764ca82-cc98-435a-9736-3c5b140a866c/unblock` → **200**

```json
{
  "command_id": "f6d5aaba-9a97-4135-b9b9-06b6f4ce11e6",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9764ca82-cc98-435a-9736-3c5b140a866c",
  "phone": "+380660447009",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T15:51:51.967157Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660447009",
  "device_ref": "sandbox-32702"
}
```

```json
{
  "challenge_id": "c861932f-4e5c-4d8a-a11d-037b12248df9",
  "expires_at": "2026-10-29T15:56:59.097136428Z",
  "resend_available_at": "2026-10-29T15:52:00.097136428Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660447009` → **200**

```json
{
  "phone": "+380660447009",
  "audience": "CLIENT",
  "code": "155466",
  "sent_at": "2026-10-29T15:51:59.099295118Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c861932f-4e5c-4d8a-a11d-037b12248df9",
  "code": "155466",
  "device_ref": "sandbox-32702"
}
```

```json
{
  "session_id": "fdb00b65-382c-4ca5-9535-11332fbc8daa",
  "subject": {
    "type": "CLIENT",
    "id": "9764ca82-cc98-435a-9736-3c5b140a866c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzY0Y2E4Mi1jYzk4LTQzNWEtOTczNi0zYzViMTQwYTg2NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDE5LCJpYXQiOjE3OTMyODkxMTksImp0aSI6ImM2ZDMxYTNmLTM4ZTYtNDAxYi1hMjQwLWM0MDgzYjAyMGYwZiIsInNpZCI6ImZkYjAwYjY1LTM4MmMtNGNhNS05NTM1LTExMzMyZmJjOGRhYSJ9.wLYMa_BJJKXgIHkeCZlUxH87HqXHLTCe_WCqk9TVWEs",
  "access_expires_at": "2026-10-29T16:06:59.3528372Z",
  "refresh_token": "LUXdywLJjXozXP1apLD82VrIadMz0-p2EiOcYX20yP8",
  "refresh_expires_at": "2026-11-28T15:51:59.352364209Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9764ca82-cc98-435a-9736-3c5b140a866c",
  "session_id": "fdb00b65-382c-4ca5-9535-11332fbc8daa",
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
  "phone": "+380661317967",
  "device_ref": "sandbox-16935"
}
```

```json
{
  "challenge_id": "2ff4c390-7453-4dc4-9310-e0e89b02f0ef",
  "expires_at": "2026-10-29T15:56:59.811616495Z",
  "resend_available_at": "2026-10-29T15:52:00.811616495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661317967` → **200**

```json
{
  "phone": "+380661317967",
  "audience": "CLIENT",
  "code": "571758",
  "sent_at": "2026-10-29T15:51:59.813585023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ff4c390-7453-4dc4-9310-e0e89b02f0ef",
  "code": "571758",
  "device_ref": "sandbox-16935"
}
```

```json
{
  "session_id": "c616ab73-cbe5-4145-b758-81c4486b668f",
  "subject": {
    "type": "CLIENT",
    "id": "fc4c7edf-35a8-49aa-b8ce-253b05ab3579"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzRjN2VkZi0zNWE4LTQ5YWEtYjhjZS0yNTNiMDVhYjM1NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDIwLCJpYXQiOjE3OTMyODkxMjAsImp0aSI6IjNmNjQxZGZmLWViNzQtNGE3ZC04MzRhLTVjMGQ2MWVkNDUxNyIsInNpZCI6ImM2MTZhYjczLWNiZTUtNDE0NS1iNzU4LTgxYzQ0ODZiNjY4ZiJ9.qZA7sM9TzTew1wLQn8u9GtZ1ckDkYyBbIZW01JbZU5c",
  "access_expires_at": "2026-10-29T16:07:00.069355819Z",
  "refresh_token": "SxQIn9asR-5zD-XAZOTmckRmnV9HhTRhEh34MZCBJ6M",
  "refresh_expires_at": "2026-11-28T15:52:00.068790274Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1d08e4f-b4c6-431a-8e64-68b7e35a29db",
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
  "id": "f2ccef36-35d9-45fa-ba0c-8f91d24047d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:00.319497Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: d18b3136-4754-47e6-9316-1b641ddd4254) → **201**

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
  "session_id": "41defa25-208b-4a46-b7e3-009606db0f50",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMjAsImlhdCI6MTc5MzI4OTEyMCwianRpIjoiYmQ1MzEyYmEtNmE5ZC00NTgzLWEwOGYtZWZjZTJjOGEwOTdhIiwic2lkIjoiNDFkZWZhMjUtMjA4Yi00YTQ2LWI3ZTMtMDA5NjA2ZGIwZjUwIn0.IwK8u2OlC-1Sppsccqrm6s1tTKWQjXKBlbSbIum-0mw",
  "access_expires_at": "2026-10-29T16:07:00.847004935Z",
  "refresh_token": "HUkIlzocEXBQDL2Ik7KeiBAo2vgr8PVEfyV05HBNjR0",
  "refresh_expires_at": "2026-10-30T03:52:00.846567216Z",
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
  "session_id": "ca34d2c9-3d11-4d14-aa85-8c13edbbd2ac",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMjEsImlhdCI6MTc5MzI4OTEyMSwianRpIjoiZDIwYWZkOTUtYTgyMi00ZjBiLThjNmYtMTk1YzUyMDA4YjZhIiwic2lkIjoiY2EzNGQyYzktM2QxMS00ZDE0LWFhODUtOGMxM2VkYmJkMmFjIn0.y3Zcm0DdDNDZOG-JZ-qMTGv1vq7lKhFce21w3-p2UG8",
  "access_expires_at": "2026-10-29T16:07:01.339103852Z",
  "refresh_token": "vmCFd682GwOxQcXrCT-J3TraoObEr18eUvwfQRUSUIs",
  "refresh_expires_at": "2026-10-30T03:52:01.338613756Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/49a31faf-4030-421f-bcfe-481c31663b8b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:52:00.560143Z",
      "actor": {
        "type": "CLIENT",
        "id": "fc4c7edf-35a8-49aa-b8ce-253b05ab3579",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "49a31faf-4030-421f-bcfe-481c31663b8b",
        "quote_id": "f2ccef36-35d9-45fa-ba0c-8f91d24047d2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d18b3136-4754-47e6-9316-1b641ddd4254"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:52:00.561669Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "49a31faf-4030-421f-bcfe-481c31663b8b",
        "attempt_id": "e2298466-69bd-414b-8e05-946e175f6059",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d18b3136-4754-47e6-9316-1b641ddd4254"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T15:52:00.56499Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "49a31faf-4030-421f-bcfe-481c31663b8b",
        "attempt_id": "e2298466-69bd-414b-8e05-946e175f6059"
      },
      "correlation_id": "d18b3136-4754-47e6-9316-1b641ddd4254"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e2298466-69bd-414b-8e05-946e175f6059",
        "generation": 1,
        "started_at": "2026-10-29T15:52:00.560867Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T15:52:00.56499Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T15:52:00.562295Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/d18b3136-4754-47e6-9316-1b641ddd4254` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "49a31faf-4030-421f-bcfe-481c31663b8b:0",
      "order_id": "49a31faf-4030-421f-bcfe-481c31663b8b",
      "at": "2026-10-29T15:52:00.560143Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "49a31faf-4030-421f-bcfe-481c31663b8b:1",
      "order_id": "49a31faf-4030-421f-bcfe-481c31663b8b",
      "at": "2026-10-29T15:52:00.561669Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "49a31faf-4030-421f-bcfe-481c31663b8b:2",
      "order_id": "49a31faf-4030-421f-bcfe-481c31663b8b",
      "at": "2026-10-29T15:52:00.56499Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/99184533-4ac1-4c42-93e4-97aef6369580` → **200**

```json
{
  "found": []
}
```

Done: request d18b3136-4754-47e6-9316-1b641ddd4254 — order 49a31faf-4030-421f-bcfe-481c31663b8b found by its id.

`GET /api/rider/v1/orders/49a31faf-4030-421f-bcfe-481c31663b8b` → **200**

```json
{
  "id": "49a31faf-4030-421f-bcfe-481c31663b8b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc4c7edf-35a8-49aa-b8ce-253b05ab3579",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:00.559726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/49a31faf-4030-421f-bcfe-481c31663b8b/cancel` → **200**

```json
{
  "command_id": "ed3a51a5-627d-4d89-b9af-90d2dad25e28",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "49a31faf-4030-421f-bcfe-481c31663b8b",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fc4c7edf-35a8-49aa-b8ce-253b05ab3579",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:00.559726Z",
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
  "phone": "+380631012570",
  "device_ref": "sandbox-10800"
}
```

```json
{
  "challenge_id": "f1ffd138-63e7-45fd-9cff-bdfff348bbb9",
  "expires_at": "2026-10-29T15:57:02.743754687Z",
  "resend_available_at": "2026-10-29T15:52:03.743754687Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631012570` → **200**

```json
{
  "phone": "+380631012570",
  "audience": "CLIENT",
  "code": "141324",
  "sent_at": "2026-10-29T15:52:02.746087845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1ffd138-63e7-45fd-9cff-bdfff348bbb9",
  "code": "141324",
  "device_ref": "sandbox-10800"
}
```

```json
{
  "session_id": "ae585aaa-f10e-4b08-8ab1-e766e30e7581",
  "subject": {
    "type": "CLIENT",
    "id": "ddbb575f-4a60-46db-a266-e2bea3220997"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGJiNTc1Zi00YTYwLTQ2ZGItYTI2Ni1lMmJlYTMyMjA5OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDIzLCJpYXQiOjE3OTMyODkxMjMsImp0aSI6IjYxMjc4MjRmLTVjMmUtNDQ2ZS1iYzE3LTVmNWNkM2I2YjQxYyIsInNpZCI6ImFlNTg1YWFhLWYxMGUtNGIwOC04YWIxLWU3NjZlMzBlNzU4MSJ9.Bi9yJbHXFHoKFhqwMHyE3sVxxjl9VWeukeinboRV2JQ",
  "access_expires_at": "2026-10-29T16:07:03.001478954Z",
  "refresh_token": "Vmv6CiiQqPTiDshqx54TuDUSRVRg9yRB16JPw2diOrk",
  "refresh_expires_at": "2026-11-28T15:52:03.001087363Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "84a09003-66bd-4790-90d3-985bbaa39b50",
  "expires_at": "2026-10-29T15:57:05.236877712Z",
  "resend_available_at": "2026-10-29T15:52:06.236877712Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631012570` → **200**

```json
{
  "phone": "+380631012570",
  "audience": "CLIENT",
  "code": "918080",
  "sent_at": "2026-10-29T15:52:05.239033298Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "27f1e9e0-615d-41be-b91f-831d4eb6eb22",
  "challenge_id": "84a09003-66bd-4790-90d3-985bbaa39b50",
  "otp_code": "918080"
}
```

```json
{
  "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
  "state": "PENDING",
  "created_at": "2026-10-29T15:52:05.487655Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531` → **200**

```json
{
  "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
  "state": "PENDING",
  "created_at": "2026-10-29T15:52:05.487655Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531` → **200**

```json
{
  "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
  "state": "PENDING",
  "created_at": "2026-10-29T15:52:05.487655Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531` → **200**

```json
{
  "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
  "state": "PENDING",
  "created_at": "2026-10-29T15:52:05.487655Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531` → **200**

```json
{
  "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
  "state": "PENDING",
  "created_at": "2026-10-29T15:52:05.487655Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531` → **200**

```json
{
  "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
  "state": "READY",
  "created_at": "2026-10-29T15:52:05.487655Z",
  "ready_at": "2026-10-29T15:52:09.798682Z",
  "expires_at": "2026-11-05T15:52:09.798682Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636365018",
  "device_ref": "sandbox-4912"
}
```

```json
{
  "challenge_id": "8fe5824e-2229-4f99-bef9-b77adb9ffa67",
  "expires_at": "2026-10-29T15:57:10.857066302Z",
  "resend_available_at": "2026-10-29T15:52:11.857066302Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636365018` → **200**

```json
{
  "phone": "+380636365018",
  "audience": "CLIENT",
  "code": "406068",
  "sent_at": "2026-10-29T15:52:10.859492469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fe5824e-2229-4f99-bef9-b77adb9ffa67",
  "code": "406068",
  "device_ref": "sandbox-4912"
}
```

```json
{
  "session_id": "81a27a05-1af6-487a-8617-9b6f651e32d4",
  "subject": {
    "type": "CLIENT",
    "id": "c6e8e283-bd80-48d3-aaaf-4387d3247984"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmU4ZTI4My1iZDgwLTQ4ZDMtYWFhZi00Mzg3ZDMyNDc5ODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDMxLCJpYXQiOjE3OTMyODkxMzEsImp0aSI6ImMwYmUxZTE4LTEyMDEtNDE1OC1iNjUxLTYxZWIyN2YwZjhiZCIsInNpZCI6IjgxYTI3YTA1LTFhZjYtNDg3YS04NjE3LTliNmY2NTFlMzJkNCJ9.uDJAFw7gEDwa_BzgBwSTgqWkUyJxZmJ_28CTBbpG01Y",
  "access_expires_at": "2026-10-29T16:07:11.116941417Z",
  "refresh_token": "1uwizy2S7QNEGPuFZtgY9yIrGI_7dRqYeJcVrZaUhZs",
  "refresh_expires_at": "2026-11-28T15:52:11.116516407Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/726b9510-a4f3-4c77-bb84-d88bc4edd531/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c47d7ec4-c577-4d7c-bb10-b26de06226bd"
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
  "session_id": "f74b99c9-8981-4a08-aaf6-506f576c0a0a",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMzEsImlhdCI6MTc5MzI4OTEzMSwianRpIjoiNjk0Yzk3MmQtMGZmZC00NzE2LWI3MDEtNDhiODJlZWQ3NDY0Iiwic2lkIjoiZjc0Yjk5YzktODk4MS00YTA4LWFhZjYtNTA2ZjU3NmMwYTBhIn0.yZFOEK22bKbmM8Q1kNxZbqbJqFZe-Z3ypwFgmPzFf80",
  "access_expires_at": "2026-10-29T16:07:11.851786341Z",
  "refresh_token": "i2G0RHpUVw5PBkmcV-kKYwJjGrm7me1UtOENM1ZL9jM",
  "refresh_expires_at": "2026-10-30T03:52:11.851357465Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ddbb575f-4a60-46db-a266-e2bea3220997",
  "session_id": "ae585aaa-f10e-4b08-8ab1-e766e30e7581",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/ddbb575f-4a60-46db-a266-e2bea3220997/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "726b9510-a4f3-4c77-bb84-d88bc4edd531",
      "state": "READY",
      "created_at": "2026-10-29T15:52:05.487655Z",
      "ready_at": "2026-10-29T15:52:09.798682Z",
      "expires_at": "2026-11-05T15:52:09.798682Z",
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
  "device_ref": "sandbox-4338"
}
```

```json
{
  "challenge_id": "8c327ab2-ba06-42d2-9216-d1ee967df7a0",
  "expires_at": "2026-10-29T15:57:12.540595076Z",
  "resend_available_at": "2026-10-29T15:52:13.540595076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "341278",
  "sent_at": "2026-10-29T15:52:12.542603233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c327ab2-ba06-42d2-9216-d1ee967df7a0",
  "code": "341278",
  "device_ref": "sandbox-4338"
}
```

```json
{
  "session_id": "37b05ccc-6e30-494c-9124-99866f0191ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAzMiwiaWF0IjoxNzkzMjg5MTMyLCJqdGkiOiI1M2U4MjVhZS00ZDQ3LTQwOTQtYjFiOC1hNzIyMDVhNDdmMTMiLCJzaWQiOiIzN2IwNWNjYy02ZTMwLTQ5NGMtOTEyNC05OTg2NmYwMTkxYWUifQ.lQJs3oq3Dqkt3PQjv2LGvF3HSDgsAe3P6U2V3YP68JU",
  "access_expires_at": "2026-10-29T16:07:12.7890482Z",
  "refresh_token": "y9FemwMjbOkVQrsxgNu5E154ItpBjrWRYaLOT06pBFk",
  "refresh_expires_at": "2026-11-28T15:52:12.788605974Z",
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
  "device_ref": "sandbox-30288"
}
```

```json
{
  "challenge_id": "79a6b8c2-1089-4ff5-9233-c8b77b6fbd85",
  "expires_at": "2026-10-29T15:57:13.232564077Z",
  "resend_available_at": "2026-10-29T15:52:14.232564077Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "884090",
  "sent_at": "2026-10-29T15:52:13.23491369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79a6b8c2-1089-4ff5-9233-c8b77b6fbd85",
  "code": "884090",
  "device_ref": "sandbox-30288"
}
```

```json
{
  "session_id": "d8d7cef9-5716-46f5-ba45-72b35e562f12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAzMywiaWF0IjoxNzkzMjg5MTMzLCJqdGkiOiIyMTY4NTZiYy05OTI0LTQ2ZDktYTI4ZS1kOTFmOWMxOWFlMTQiLCJzaWQiOiJkOGQ3Y2VmOS01NzE2LTQ2ZjUtYmE0NS03MmIzNWU1NjJmMTIifQ.B_xShXxHnaGWRIN8gKHZWHDNadGY1-GG1ez2ZQEsp4c",
  "access_expires_at": "2026-10-29T16:07:13.484997627Z",
  "refresh_token": "FySxFZ5NIRH9QDqYJSjUn0oM-1jtvViSCAip6j_DDTo",
  "refresh_expires_at": "2026-11-28T15:52:13.484407546Z",
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
  "command_id": "8de4f1e0-b723-4f1a-8117-7e848031618d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:13Z",
    "sequence": 1793289133939
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cec3e401-b546-4f3f-9a83-6c88d365b9fb",
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
  "last_heartbeat_at": "2026-10-29T15:52:13.958228Z",
  "last_location_at": "2026-10-29T15:52:13.958228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12397"
}
```

```json
{
  "challenge_id": "3fb8dce4-9a4f-43fb-b528-c7da545e849f",
  "expires_at": "2026-10-29T15:57:14.189826406Z",
  "resend_available_at": "2026-10-29T15:52:15.189826406Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "676742",
  "sent_at": "2026-10-29T15:52:14.19196376Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fb8dce4-9a4f-43fb-b528-c7da545e849f",
  "code": "676742",
  "device_ref": "sandbox-12397"
}
```

```json
{
  "session_id": "41587a14-bbdf-4124-bb08-545b83076fa2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAzNCwiaWF0IjoxNzkzMjg5MTM0LCJqdGkiOiIwYTg4OGQ4OC0wNzg1LTQ0NWEtYmQ1Ni02MjBmM2M4YjdhODciLCJzaWQiOiI0MTU4N2ExNC1iYmRmLTQxMjQtYmIwOC01NDViODMwNzZmYTIifQ.1auYTPX77YTeg6sFwfezpM0C5BLTdtfs3SD92L8DaUc",
  "access_expires_at": "2026-10-29T16:07:14.44172024Z",
  "refresh_token": "CphygFUCFUL-mhFn3DjRQvciWhCecQCN-ds3AK4Kmks",
  "refresh_expires_at": "2026-11-28T15:52:14.441343421Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c7f5fc89-f062-4a88-b0db-d6284557edc1",
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
  "last_heartbeat_at": "2026-10-29T15:50:54.566637Z",
  "last_location_at": "2026-10-29T15:50:54.566637Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c7f5fc89-f062-4a88-b0db-d6284557edc1/handover` → **200**

```json
{
  "command_id": "08b55668-2ddb-4667-bc2e-3339500d8a36",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c7f5fc89-f062-4a88-b0db-d6284557edc1",
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
  "last_heartbeat_at": "2026-10-29T15:50:54.566637Z",
  "last_location_at": "2026-10-29T15:50:54.566637Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c7f5fc89-f062-4a88-b0db-d6284557edc1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:15Z",
    "sequence": 1793289135119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c7f5fc89-f062-4a88-b0db-d6284557edc1",
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
  "last_heartbeat_at": "2026-10-29T15:52:15.136418Z",
  "last_location_at": "2026-10-29T15:52:15.136418Z",
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
  "session_id": "b5cb7ba6-578d-45d3-b83a-d96516a2a1f3",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMzUsImlhdCI6MTc5MzI4OTEzNSwianRpIjoiNjk0YzFhNzktNTYzMi00ODUzLWI5NzItNjYxYTc3MDU5N2I4Iiwic2lkIjoiYjVjYjdiYTYtNTc4ZC00NWQzLWI4M2EtZDk2NTE2YTJhMWYzIn0.kDHFUqWQyXQndNn9L8bKdVx0IlMkjeemu90KpRp7n48",
  "access_expires_at": "2026-10-29T16:07:15.613227059Z",
  "refresh_token": "cylV5fZ7m7BAZvYD0cogxt2W1Iqx2S7zLPIUFcoa7CQ",
  "refresh_expires_at": "2026-10-30T03:52:15.612676332Z",
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
  "session_id": "b208d82f-ace7-48fd-a163-9badafd80950",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMzYsImlhdCI6MTc5MzI4OTEzNiwianRpIjoiYjI4ZTE1NjItZjRjOS00ZTBiLTk5YjgtNTFlMzE1NGVlMTVjIiwic2lkIjoiYjIwOGQ4MmYtYWNlNy00OGZkLWExNjMtOWJhZGFmZDgwOTUwIn0.iUMqWXprpy6Kae8B2KroKil63wFGwPswTb-SJibBXqU",
  "access_expires_at": "2026-10-29T16:07:16.09752953Z",
  "refresh_token": "BI4Aq5g6ycCA502zgtcXl6RulLBJPXMMcif_3jHN1KA",
  "refresh_expires_at": "2026-10-30T03:52:16.097098588Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688862215",
  "device_ref": "sandbox-4674"
}
```

```json
{
  "challenge_id": "241e13a2-5ac5-454b-a115-3e49f17374ba",
  "expires_at": "2026-10-29T15:57:16.321970106Z",
  "resend_available_at": "2026-10-29T15:52:17.321970106Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688862215` → **200**

```json
{
  "phone": "+380688862215",
  "audience": "CLIENT",
  "code": "670680",
  "sent_at": "2026-10-29T15:52:16.324388557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "241e13a2-5ac5-454b-a115-3e49f17374ba",
  "code": "670680",
  "device_ref": "sandbox-4674"
}
```

```json
{
  "session_id": "79aa73fb-87e2-48df-aecc-61764829c569",
  "subject": {
    "type": "CLIENT",
    "id": "a3472a0b-542c-451d-b0ad-d279f3d24871"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzQ3MmEwYi01NDJjLTQ1MWQtYjBhZC1kMjc5ZjNkMjQ4NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDM2LCJpYXQiOjE3OTMyODkxMzYsImp0aSI6IjY5MGYxM2IwLTJlNzYtNGMzZS1iY2U1LThhZWI3NjUwYjY3MCIsInNpZCI6Ijc5YWE3M2ZiLTg3ZTItNDhkZi1hZWNjLTYxNzY0ODI5YzU2OSJ9.YX526RLkeRVRnpNalmdJlSvLH9O-WExtojT472pAamU",
  "access_expires_at": "2026-10-29T16:07:16.569313274Z",
  "refresh_token": "VUk2u_Sg_4U8QrMj_JsyYQ98BFeJhqWUKg7jv22bK2A",
  "refresh_expires_at": "2026-11-28T15:52:16.568820764Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eaa7c7a4-cbc2-45c5-9aab-d1b57fbefe47",
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
  "id": "4eb0a664-96f1-4f63-9b04-4e00c89328e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:16.794092Z",
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
  "command_id": "a660b5de-e2dc-4a22-863f-b9fcdd509195",
  "quote_id": "4eb0a664-96f1-4f63-9b04-4e00c89328e4",
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
  "id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3472a0b-542c-451d-b0ad-d279f3d24871",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:17.033251Z",
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
    "id": "43d388ef-83f0-4d48-96db-2c62974dc6ea",
    "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
    "expires_at": "2026-10-29T15:52:32.035514Z",
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

`POST /api/driver/v1/offers/43d388ef-83f0-4d48-96db-2c62974dc6ea/reject` → **204**

```json
{
  "command_id": "f0c5cc5a-bda7-4fbc-be52-91f2c7cb8699"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "535f9647-696b-4fde-9606-d03fa05a3905",
    "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
    "expires_at": "2026-10-29T15:52:32.509398Z",
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

`POST /api/driver/v1/offers/535f9647-696b-4fde-9606-d03fa05a3905/accept` → **200**

```json
{
  "command_id": "3add9813-2d1a-4db3-98f1-ef32b4b6680b"
}
```

```json
{
  "id": "7ab4258a-8cb3-489e-9614-e11cef56f5c5",
  "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4cb6eccc-4d69-458e-83c3-d55afa9897bc",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a963dafa-cc13-4f24-9288-22c0b07d9cca/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:52:17.033605Z",
      "actor": {
        "type": "CLIENT",
        "id": "a3472a0b-542c-451d-b0ad-d279f3d24871",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
        "quote_id": "4eb0a664-96f1-4f63-9b04-4e00c89328e4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2541f511-1d4e-4527-aeb0-efa8cdcfe375"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:52:17.035036Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
        "attempt_id": "08c700ed-f839-4b66-b6d7-bb2b3390036e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2541f511-1d4e-4527-aeb0-efa8cdcfe375"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:52:17.037286Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "43d388ef-83f0-4d48-96db-2c62974dc6ea",
        "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "2541f511-1d4e-4527-aeb0-efa8cdcfe375"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T15:52:17.508583Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "43d388ef-83f0-4d48-96db-2c62974dc6ea",
        "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca"
      },
      "correlation_id": "c29286c0-7019-4b54-bf68-ffb568d220ec"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a963dafa-cc13-4f24-9288-22c0b07d9cca — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a963dafa-cc13-4f24-9288-22c0b07d9cca` → **200**

```json
{
  "id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a3472a0b-542c-451d-b0ad-d279f3d24871",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7ab4258a-8cb3-489e-9614-e11cef56f5c5",
    "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4cb6eccc-4d69-458e-83c3-d55afa9897bc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:52:17.033251Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a963dafa-cc13-4f24-9288-22c0b07d9cca/cancel` → **200**

```json
{
  "command_id": "49ea6553-7459-47e5-9584-e2e83fd6fd15",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a3472a0b-542c-451d-b0ad-d279f3d24871",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7ab4258a-8cb3-489e-9614-e11cef56f5c5",
    "order_id": "a963dafa-cc13-4f24-9288-22c0b07d9cca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4cb6eccc-4d69-458e-83c3-d55afa9897bc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:52:17.033251Z",
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
  "session_id": "cec3e401-b546-4f3f-9a83-6c88d365b9fb",
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
  "last_heartbeat_at": "2026-10-29T15:52:13.958228Z",
  "last_location_at": "2026-10-29T15:52:13.958228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cec3e401-b546-4f3f-9a83-6c88d365b9fb/close` → **200**

```json
{
  "command_id": "2e51bfa4-5a9b-42d1-b1f5-da40b8a78221",
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
  "session_id": "c7f5fc89-f062-4a88-b0db-d6284557edc1",
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
  "last_heartbeat_at": "2026-10-29T15:52:15.136418Z",
  "last_location_at": "2026-10-29T15:52:15.136418Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7f5fc89-f062-4a88-b0db-d6284557edc1/close` → **200**

```json
{
  "command_id": "edcc6579-b984-4582-b491-c0983cb3e10b",
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
  "session_id": "87a1fa1d-d377-4f4d-be2c-03e6a019e1fa",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMzksImlhdCI6MTc5MzI4OTEzOSwianRpIjoiYTM3MjQyMGQtYTFlNy00OGQ2LWJhNjUtOWY5NDk5MmEyNDcxIiwic2lkIjoiODdhMWZhMWQtZDM3Ny00ZjRkLWJlMmMtMDNlNmEwMTllMWZhIn0._by79JGfAEHHsez5eK5gv9QO_M8c3nY5IfONQkIm0RM",
  "access_expires_at": "2026-10-29T16:07:19.96459702Z",
  "refresh_token": "7sKYfMUKZoZYDruKl0bwzNlRYje9-0E0D45J5cLFKUI",
  "refresh_expires_at": "2026-10-30T03:52:19.964195054Z",
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
  "command_id": "628ae72e-25c6-4f1e-8163-93d684782ab7",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T15:52:20.437133Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "2bff4fb1-d12b-4f11-9023-62ac3724798e",
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
  "correlation_id": "90fb4abb-0e45-43ee-9da0-8d171929ef11"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "2937a5f6-d778-4cae-bc81-75afccc90946",
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
  "correlation_id": "9056abf2-44d1-4208-b45d-328193820676"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639218501",
  "device_ref": "sandbox-2183"
}
```

```json
{
  "challenge_id": "902ea3eb-43a9-45b6-8840-99c4c70b1281",
  "expires_at": "2026-10-29T15:57:21.137491407Z",
  "resend_available_at": "2026-10-29T15:52:22.137491407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639218501` → **200**

```json
{
  "phone": "+380639218501",
  "audience": "CLIENT",
  "code": "695045",
  "sent_at": "2026-10-29T15:52:21.139554506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "902ea3eb-43a9-45b6-8840-99c4c70b1281",
  "code": "695045",
  "device_ref": "sandbox-2183"
}
```

```json
{
  "session_id": "fbadb8ee-ba10-4ef1-b31e-ef70cb0c6dc6",
  "subject": {
    "type": "CLIENT",
    "id": "ef5a6e7e-8138-4ee2-ae3d-2bcfd7970c97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjVhNmU3ZS04MTM4LTRlZTItYWUzZC0yYmNmZDc5NzBjOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDQxLCJpYXQiOjE3OTMyODkxNDEsImp0aSI6IjFkM2QyNmU3LWNhNzAtNDQ1ZC05NDEwLTllNzU2NThjNmNjOCIsInNpZCI6ImZiYWRiOGVlLWJhMTAtNGVmMS1iMzFlLWVmNzBjYjBjNmRjNiJ9.P2q_brUhYoDbxkOYxhIqF388_PeRnnXC7fDmdVu59ao",
  "access_expires_at": "2026-10-29T16:07:21.387586285Z",
  "refresh_token": "EYqeusvJAfpR3PUrCKvHe_zK8QscoGVx-csdyG_KnSU",
  "refresh_expires_at": "2026-11-28T15:52:21.387123369Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ef1c05b8-c4e6-4b8b-a8c6-5698e76f62a5",
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
  "id": "46159df1-afdb-4f0b-8803-23a35f62abb0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:21.619821Z",
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
  "command_id": "bfb6771b-db81-49c4-8945-668727544375",
  "quote_id": "46159df1-afdb-4f0b-8803-23a35f62abb0",
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
  "correlation_id": "664612de-5070-4628-95f2-29f8e1d66c87"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "96708921-5bcf-4251-824f-a062837fc681",
  "quote_id": "46159df1-afdb-4f0b-8803-23a35f62abb0",
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
  "id": "7c17922d-5f38-47f6-8b6f-102a3f0205cb",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef5a6e7e-8138-4ee2-ae3d-2bcfd7970c97",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:22.088479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7c17922d-5f38-47f6-8b6f-102a3f0205cb/cancel` → **200**

```json
{
  "command_id": "59de25e6-998a-4ac3-9ce0-b5a3a533a4b5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7c17922d-5f38-47f6-8b6f-102a3f0205cb",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ef5a6e7e-8138-4ee2-ae3d-2bcfd7970c97",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:22.088479Z",
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
  "command_id": "f0db279f-0823-4306-9619-e654ee1e6d77",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T15:52:22.605387Z"
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
      "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T15:52:22.605387Z"
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
  "device_ref": "sandbox-16828"
}
```

```json
{
  "challenge_id": "a9470e64-e20f-4a88-8e87-7a63d30b2c7e",
  "expires_at": "2026-10-29T15:57:23.329176636Z",
  "resend_available_at": "2026-10-29T15:52:24.329176636Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "298219",
  "sent_at": "2026-10-29T15:52:23.331483765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9470e64-e20f-4a88-8e87-7a63d30b2c7e",
  "code": "298219",
  "device_ref": "sandbox-16828"
}
```

```json
{
  "session_id": "c4cb314a-a10e-4bc2-8137-3d2120f68552",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA0MywiaWF0IjoxNzkzMjg5MTQzLCJqdGkiOiJmY2YzNjc1MC1lOWNmLTQwZDUtYTQ0Ni0xMzIwZjAwNWFkNTUiLCJzaWQiOiJjNGNiMzE0YS1hMTBlLTRiYzItODEzNy0zZDIxMjBmNjg1NTIifQ.r3k67Ksh9jePON7-nWN3PxQfxGZ0cFbBzlCQQ16GbPA",
  "access_expires_at": "2026-10-29T16:07:23.58360606Z",
  "refresh_token": "Y5m6xZOjwXSV_5lTCUIiY4etqfSivwRoVYVkw4lRDY0",
  "refresh_expires_at": "2026-11-28T15:52:23.58318781Z",
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
  "command_id": "291380dd-c99a-453b-8e1c-f30df63c0643",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:24Z",
    "sequence": 1793289144294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:24.045672Z",
  "last_location_at": "2026-10-29T15:52:24.045672Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674231399",
  "device_ref": "sandbox-21043"
}
```

```json
{
  "challenge_id": "97af64fe-9cab-4974-b772-d27eada81b73",
  "expires_at": "2026-10-29T15:57:24.282867485Z",
  "resend_available_at": "2026-10-29T15:52:25.282867485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674231399` → **200**

```json
{
  "phone": "+380674231399",
  "audience": "CLIENT",
  "code": "089651",
  "sent_at": "2026-10-29T15:52:24.285065844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97af64fe-9cab-4974-b772-d27eada81b73",
  "code": "089651",
  "device_ref": "sandbox-21043"
}
```

```json
{
  "session_id": "b9f32730-1c97-4def-8dfc-3167e41593bf",
  "subject": {
    "type": "CLIENT",
    "id": "7a4a43f6-72f4-4d0c-bf76-f047ef5cf28b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTRhNDNmNi03MmY0LTRkMGMtYmY3Ni1mMDQ3ZWY1Y2YyOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDQ0LCJpYXQiOjE3OTMyODkxNDQsImp0aSI6IjRlMDBmODdjLTcyNWYtNGEwMS1hNmE4LTI2YWM3MGI0YmQ5ZiIsInNpZCI6ImI5ZjMyNzMwLTFjOTctNGRlZi04ZGZjLTMxNjdlNDE1OTNiZiJ9.7UFa4zQZKEz_nctAoXQXv4H0Isw9BnK30yAkBc5ldtc",
  "access_expires_at": "2026-10-29T16:07:24.537018162Z",
  "refresh_token": "VCokZ3k3ApGa6q9J7aTWilYzUPYlkRrWey5eo2vfSRc",
  "refresh_expires_at": "2026-11-28T15:52:24.536554475Z",
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
  "command_id": "f0aa13fc-2a1a-440b-8eaf-eda034a126ce",
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
  "id": "499ae9d2-d330-48e5-a86e-b4f307310da6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:24.991220Z",
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
  "command_id": "9403254d-afc2-4774-a589-24873d29e73a",
  "platform": "ANDROID",
  "token": "sandbox-driver-346aea0b-b30e-412a-9a5f-98e1ff8b2478"
}
```

```json
{
  "id": "a61c89e4-ef74-4a84-a4cf-5de5ad9faf76",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:52:25.232724Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "cb012cf6-811c-49f3-9ea7-b6a144e9fcec",
  "platform": "ANDROID",
  "token": "sandbox-rider-700025b7-5d15-4943-b00f-f13704b86802"
}
```

```json
{
  "id": "08aa0b11-798f-4f52-8f32-183ad48e8457",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:52:25.465626Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5f2ac297-61bb-4c81-93ee-042784651ff1",
  "quote_id": "499ae9d2-d330-48e5-a86e-b4f307310da6",
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
  "id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a4a43f6-72f4-4d0c-bf76-f047ef5cf28b",
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
  "created_at": "2026-10-29T15:52:25.704641Z",
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
    "id": "8e4688d2-c523-4804-ab7c-b119bf258bbf",
    "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
    "expires_at": "2026-10-29T15:52:40.707082Z",
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

`POST /api/driver/v1/offers/8e4688d2-c523-4804-ab7c-b119bf258bbf/accept` → **200**

```json
{
  "command_id": "2736418c-c24e-40d6-98e8-7a07e49dcdab"
}
```

```json
{
  "id": "339525a6-6a17-44c8-871b-e83b49708826",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:52:25.683Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:52:26.266846947Z",
    "token_suffix": "8b2478",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
      "order_version": "2",
      "event_id": "0d2de768-103d-4699-ab0d-a11896d71657",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674231399&after=2026-10-29T15:52:25.683Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674231399&after=2026-10-29T15:52:25.683Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:52:27.27163071Z",
    "token_suffix": "b86802",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
      "order_version": "3",
      "event_id": "75f2444c-e9a4-4be1-af24-e62ebf16044f",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/d9dc598d-c468-4970-af3b-f6fe15ad5636/messages` → **201**

```json
{
  "command_id": "efb899b1-ac01-4e91-bae2-b24c752914f8",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "11dea66e-59a1-479e-b9c2-e80bb02bc7e9",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T15:52:27.478418739Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "assignment_id": "339525a6-6a17-44c8-871b-e83b49708826",
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

`POST /api/driver/v1/trips/7e5e9012-c413-4070-8b0c-7457d9edab87/messages` → **201**

```json
{
  "command_id": "b6e0f08d-d63c-4247-ba39-f4cab14e65e1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "19508379-2d03-4e14-a73c-687c0f7ca2b5",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T15:52:27.925319012Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/d9dc598d-c468-4970-af3b-f6fe15ad5636/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/7e5e9012-c413-4070-8b0c-7457d9edab87/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674231399"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:28Z",
    "sequence": 1793289148594
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:28.611074Z",
  "last_location_at": "2026-10-29T15:52:28.611074Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "assignment_id": "339525a6-6a17-44c8-871b-e83b49708826",
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

`POST /api/driver/v1/trips/7e5e9012-c413-4070-8b0c-7457d9edab87/arrive` → **200**

```json
{
  "command_id": "5382810b-1891-4333-9469-008d551384d8",
  "expected_version": 0
}
```

```json
{
  "id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "assignment_id": "339525a6-6a17-44c8-871b-e83b49708826",
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
  "arrived_at": "2026-10-29T15:52:29.061817Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7e5e9012-c413-4070-8b0c-7457d9edab87/start` → **200**

```json
{
  "command_id": "92e23587-e910-440e-b353-58d6fe4571d2",
  "expected_version": 1
}
```

```json
{
  "id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "assignment_id": "339525a6-6a17-44c8-871b-e83b49708826",
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
  "arrived_at": "2026-10-29T15:52:29.061817Z",
  "started_at": "2026-10-29T15:52:29.310904Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:29Z",
    "sequence": 1793289149545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:29.562036Z",
  "last_location_at": "2026-10-29T15:52:29.562036Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/7e5e9012-c413-4070-8b0c-7457d9edab87/complete` → **200**

```json
{
  "command_id": "ccbeccf2-5b03-4981-8535-94afe6ec113a",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:52:29Z",
  "cash_received": true
}
```

```json
{
  "id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "assignment_id": "339525a6-6a17-44c8-871b-e83b49708826",
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
  "arrived_at": "2026-10-29T15:52:29.061817Z",
  "started_at": "2026-10-29T15:52:29.310904Z",
  "completed_at": "2026-10-29T15:52:29.797202Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/d9dc598d-c468-4970-af3b-f6fe15ad5636` → **200**

```json
{
  "id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7a4a43f6-72f4-4d0c-bf76-f047ef5cf28b",
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
    "id": "339525a6-6a17-44c8-871b-e83b49708826",
    "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:52:25.704641Z",
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
    "id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:52:25.704641Z",
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
    "id": "7e5e9012-c413-4070-8b0c-7457d9edab87",
    "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
    "order_short_number": 13,
    "created_at": "2026-10-29T15:52:26.171248Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ba6a67ff-3e6c-45c3-925d-e833c738cdb8",
    "order_id": "e0b33ae1-26bc-48b2-83b9-e70d34217f40",
    "order_short_number": 8,
    "created_at": "2026-10-29T15:51:23.135464Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4ac1386c-562b-4c0a-8156-b06122f6fbb5",
    "order_id": "e611e999-1070-413e-9509-44320bb98d18",
    "order_short_number": 3,
    "created_at": "2026-10-29T15:50:44.517267Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "577768d2-1a9c-46ff-b62c-bd7a71ca7cd5",
    "order_id": "d789b478-aeab-4f67-8f2d-6a1850a04bd4",
    "order_short_number": 2,
    "created_at": "2026-10-29T15:50:29.075441Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "79822913-c65d-4d64-b9a4-b54016f39336",
    "order_id": "99e5c8c6-82ca-4020-af5f-07b7c537d6cd",
    "order_short_number": 1,
    "created_at": "2026-10-29T15:50:21.129389Z",
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

`GET /api/rider/v1/orders/d9dc598d-c468-4970-af3b-f6fe15ad5636/tip` → **200**

```json
{
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
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
  "available_until": "2026-10-30T15:52:29.797202Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d9dc598d-c468-4970-af3b-f6fe15ad5636/tip` → **201**

```json
{
  "command_id": "006ccd43-e861-4f4a-948d-2595ea1c85fa",
  "amount_minor": 1100
}
```

```json
{
  "id": "322bc4ea-7b32-48ed-b0ea-015a5206a42f",
  "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T15:52:34.474519Z"
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
  "session_id": "27c8627c-0301-4343-8b55-eed6d4f3ffff",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTQsImlhdCI6MTc5MzI4OTE1NCwianRpIjoiNjlkMDhhNjItY2YzZC00Y2ZjLTllYjYtNzUyYmIzOGJlMzIwIiwic2lkIjoiMjdjODYyN2MtMDMwMS00MzQzLThiNTUtZWVkNmQ0ZjNmZmZmIn0.1vP_-7BmSslfP2amO5smpvCI7jtIJZYRLuF7vBKgRIA",
  "access_expires_at": "2026-10-29T16:07:34.975035173Z",
  "refresh_token": "42uCKU12ABgzsGxg0h16jQNswz21E4i1wxN2qJBhP04",
  "refresh_expires_at": "2026-10-30T03:52:34.974418669Z",
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
  "generated_at": "2026-10-29T15:52:35.204301655Z"
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
  "generated_at": "2026-10-29T15:52:35.432679237Z"
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
  "session_id": "06f960c8-a054-4bae-92f4-0b8e74df87e4",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTUsImlhdCI6MTc5MzI4OTE1NSwianRpIjoiY2RhN2Q5ZTktZTc2NS00NzEwLWEzMWUtN2M1NGRkOGM1NzVlIiwic2lkIjoiMDZmOTYwYzgtYTA1NC00YmFlLTkyZjQtMGI4ZTc0ZGY4N2U0In0.mz5L2NXE-AX89fQtSQeHctrWcD7DSktpAbXS4q823oE",
  "access_expires_at": "2026-10-29T16:07:35.931022578Z",
  "refresh_token": "WrHYZPlimMcjbKCx-3rC-oaptNG5QBeEphA71hKHoUo",
  "refresh_expires_at": "2026-10-30T03:52:35.930493524Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d9dc598d-c468-4970-af3b-f6fe15ad5636/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:52:25.705048Z",
      "actor": {
        "type": "CLIENT",
        "id": "7a4a43f6-72f4-4d0c-bf76-f047ef5cf28b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
        "quote_id": "499ae9d2-d330-48e5-a86e-b4f307310da6",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "226222b3-5fb8-43ae-b87a-8eb5a2c1115f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:52:25.706579Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
        "attempt_id": "d7b78949-59c9-4339-b8ba-f56cac1ee323",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "226222b3-5fb8-43ae-b87a-8eb5a2c1115f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:52:25.708981Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8e4688d2-c523-4804-ab7c-b119bf258bbf",
        "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "226222b3-5fb8-43ae-b87a-8eb5a2c1115f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:52:26.172525Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8e4688d2-c523-4804-ab7c-b119bf258bbf",
        "order_id": "d9dc598d-c468-4970-af3b-f6fe15ad5636",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "339525a6-6a17-44c8-871b-e83b49708826"
      },
      "correlation_id": "a37ec27e-ff9c-4b30-a599-2b291bd0a5fb"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T15:52:36.401265968Z",
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
      "last_location_at": "2026-10-29T15:52:29.562036Z",
      "order_id": null
    }
  ]
}
```

Done: order d9dc598d-c468-4970-af3b-f6fe15ad5636.

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
  "session_id": "9d15daa3-6cf9-4e8a-a0e4-d39ab68a1955",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTYsImlhdCI6MTc5MzI4OTE1NiwianRpIjoiOWM2OGQ1ZmItMzlmNy00MWUyLThjYmQtMjA4MDQxOTVmZDVhIiwic2lkIjoiOWQxNWRhYTMtNmNmOS00ZThhLWEwZTQtZDM5YWI2OGExOTU1In0.-VIuH5gCOwRnXRENvuAu0gl1ELD3dqjTUnNgWkDrV2k",
  "access_expires_at": "2026-10-29T16:07:36.906884621Z",
  "refresh_token": "_Hw_gwO9RmjjD53u8l6uqnDDyWOVKpReDYx6xcvf3Rg",
  "refresh_expires_at": "2026-10-30T03:52:36.906444839Z",
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
  "command_id": "1b3a4d71-8a10-432e-9cb1-9a86549a8241",
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
  "timestamp": "2026-10-29T15:52:37.000+0000",
  "channel": {
    "id": "1730052000.802328075",
    "linkedid": "1730052000.802328075",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677486000"
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
  "timestamp": "2026-10-29T15:52:37.000+0000",
  "channel": {
    "id": "1730052000.802328075",
    "linkedid": "1730052000.802328075",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677486000"
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
  "session_id": "845edf41-05db-4c13-8794-8c32719f82b0",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNTcsImlhdCI6MTc5MzI4OTE1NywianRpIjoiN2FmMmI5OWEtMjQ4NS00ZmFjLWEyYTctNWViZjJkOGRlOGE1Iiwic2lkIjoiODQ1ZWRmNDEtMDVkYi00YzEzLTg3OTQtOGMzMjcxOWY4MmIwIn0.DLM3CrK_FhhsQrMP8fByiutWq0-g77T1mi7WcOwP_E8",
  "access_expires_at": "2026-10-29T16:07:37.891140293Z",
  "refresh_token": "C1gfz2tQLSTcS_Mn8vRj-65sz30g9GHlwHktEJp_Ack",
  "refresh_expires_at": "2026-10-30T03:52:37.890665499Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "0398131f-2781-43e2-b033-09f94bb15855",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677486000",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:52:37Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/0398131f-2781-43e2-b033-09f94bb15855/answer` → **200**

```json
{
  "command_id": "40a1ddd1-ba05-4f7d-b716-6fbc2ac65f22"
}
```

```json
{
  "id": "0398131f-2781-43e2-b033-09f94bb15855",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677486000",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "order_ids": [],
  "started_at": "2026-10-29T15:52:37Z",
  "answered_at": "2026-10-29T15:52:38.362923Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.802328075",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2e0d8100-10f6-4d97-8f3d-0c00d52f2aa5",
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
  "id": "24af48dd-89fd-407a-a52e-fb4a97f6059e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:38.623262Z",
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
  "command_id": "2a0bd475-4f98-45e2-a5fc-226806cda3f6",
  "quote_id": "24af48dd-89fd-407a-a52e-fb4a97f6059e",
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
    "phone": "+380677486000"
  },
  "call_id": "0398131f-2781-43e2-b033-09f94bb15855"
}
```

```json
{
  "id": "98fae14b-bcc5-4908-9c3f-f365a6f5358a",
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
  "created_at": "2026-10-29T15:52:38.86638Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677486000"
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
    "id": "1730052000.802328075",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0398131f-2781-43e2-b033-09f94bb15855",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677486000",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [
        "98fae14b-bcc5-4908-9c3f-f365a6f5358a"
      ],
      "started_at": "2026-10-29T15:52:37Z",
      "answered_at": "2026-10-29T15:52:38.362923Z",
      "ended_at": "2026-10-29T15:52:39.114415Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "26d27ecb-e62b-44bd-91cf-07d04b33eca3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674855533",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [],
      "started_at": "2026-10-29T15:50:36.538782Z",
      "answered_at": "2026-10-29T15:50:36.799959Z",
      "ended_at": "2026-10-29T15:50:37.054486Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:50:39.781456Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/98fae14b-bcc5-4908-9c3f-f365a6f5358a` → **200**

```json
{
  "id": "98fae14b-bcc5-4908-9c3f-f365a6f5358a",
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
  "created_at": "2026-10-29T15:52:38.86638Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677486000"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/98fae14b-bcc5-4908-9c3f-f365a6f5358a` → **200**

```json
{
  "id": "98fae14b-bcc5-4908-9c3f-f365a6f5358a",
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
  "created_at": "2026-10-29T15:52:38.86638Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677486000"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/98fae14b-bcc5-4908-9c3f-f365a6f5358a/cancel` → **200**

```json
{
  "command_id": "fe1126c5-db81-46f7-b201-92bd92302ee5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "98fae14b-bcc5-4908-9c3f-f365a6f5358a",
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
  "created_at": "2026-10-29T15:52:38.86638Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677486000"
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

Done: call 0398131f-2781-43e2-b033-09f94bb15855 with order 98fae14b-bcc5-4908-9c3f-f365a6f5358a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12499"
}
```

```json
{
  "challenge_id": "dc4e0762-9925-41f0-89de-8c3bc1192020",
  "expires_at": "2026-10-29T15:57:40.133923715Z",
  "resend_available_at": "2026-10-29T15:52:41.133923715Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "145198",
  "sent_at": "2026-10-29T15:52:40.137378728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc4e0762-9925-41f0-89de-8c3bc1192020",
  "code": "145198",
  "device_ref": "sandbox-12499"
}
```

```json
{
  "session_id": "2d9f20a6-ebfb-4529-9291-5c8345d9a014",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA2MCwiaWF0IjoxNzkzMjg5MTYwLCJqdGkiOiJmYmY3OTg1My1jZTlhLTQ2ZWMtODFhNS1kNTZlN2FmNmM4NTMiLCJzaWQiOiIyZDlmMjBhNi1lYmZiLTQ1MjktOTI5MS01YzgzNDVkOWEwMTQifQ.kFyOvVfw1-3mAzao1sg3Zk28hkD5Z8oAuzsUG5m5e9s",
  "access_expires_at": "2026-10-29T16:07:40.384656663Z",
  "refresh_token": "qm1oAKGhe16qjpngjr8iWaXvVqvRsz0poNwzq5szyLA",
  "refresh_expires_at": "2026-11-28T15:52:40.384199285Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:29.562036Z",
  "last_location_at": "2026-10-29T15:52:29.562036Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/handover` → **200**

```json
{
  "command_id": "7b9014dd-0da9-42d8-8375-a5b4908b929c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:29.562036Z",
  "last_location_at": "2026-10-29T15:52:29.562036Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:41Z",
    "sequence": 1793289161601
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:41.077497Z",
  "last_location_at": "2026-10-29T15:52:41.077497Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662545946",
  "device_ref": "sandbox-7358"
}
```

```json
{
  "challenge_id": "9cd3e4ab-f030-4ab3-9b72-5ac8879f5485",
  "expires_at": "2026-10-29T15:57:41.314488902Z",
  "resend_available_at": "2026-10-29T15:52:42.314488902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662545946` → **200**

```json
{
  "phone": "+380662545946",
  "audience": "CLIENT",
  "code": "824349",
  "sent_at": "2026-10-29T15:52:41.317084891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cd3e4ab-f030-4ab3-9b72-5ac8879f5485",
  "code": "824349",
  "device_ref": "sandbox-7358"
}
```

```json
{
  "session_id": "2c10f253-d758-4eed-853f-29b3786b750e",
  "subject": {
    "type": "CLIENT",
    "id": "9626a95d-44d1-4627-98d5-978098ae73a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjI2YTk1ZC00NGQxLTQ2MjctOThkNS05NzgwOThhZTczYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDYxLCJpYXQiOjE3OTMyODkxNjEsImp0aSI6IjIxNDBlNDZlLWI3YjQtNDQ3YS1iYTg2LTFlOWI3NzMxMGU0ZSIsInNpZCI6IjJjMTBmMjUzLWQ3NTgtNGVlZC04NTNmLTI5YjM3ODZiNzUwZSJ9.cVideUBe26CUw1y9CXkoV0F_hiqmVyqyTd1fwTTy3H8",
  "access_expires_at": "2026-10-29T16:07:41.568454621Z",
  "refresh_token": "Zqu0BFSt0KLCtP0WPibf4XklG3EiPIoaVpemYPehjBc",
  "refresh_expires_at": "2026-11-28T15:52:41.567843234Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "baf6af1d-126e-45d7-8446-42fca704a241",
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
  "id": "bed09115-3ac3-4c80-854c-95801765b797",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:41.801727Z",
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
  "command_id": "47e7c960-da98-413c-9ec8-89f40906468e",
  "quote_id": "bed09115-3ac3-4c80-854c-95801765b797",
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
  "id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9626a95d-44d1-4627-98d5-978098ae73a4",
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
  "created_at": "2026-10-29T15:52:42.040742Z",
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
    "id": "d0768857-323d-4a53-b9e5-5ef6d731806c",
    "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
    "expires_at": "2026-10-29T15:52:57.043429Z",
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

`POST /api/driver/v1/offers/d0768857-323d-4a53-b9e5-5ef6d731806c/accept` → **200**

```json
{
  "command_id": "bb2bbd83-9969-45cd-a2ff-4822194c0eed"
}
```

```json
{
  "id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4",
  "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82",
  "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
  "assignment_id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4",
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

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:42Z",
    "sequence": 1793289162952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:42.968151Z",
  "last_location_at": "2026-10-29T15:52:42.968151Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82/arrive` → **200**

```json
{
  "command_id": "42e7f058-d4f3-47d0-810a-0f8de87fc2ce",
  "expected_version": 0
}
```

```json
{
  "id": "5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82",
  "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
  "assignment_id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4",
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
  "arrived_at": "2026-10-29T15:52:43.205826Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82/start` → **200**

```json
{
  "command_id": "74601df1-1951-4a2c-83c2-c6edabb18fc8",
  "expected_version": 1
}
```

```json
{
  "id": "5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82",
  "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
  "assignment_id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4",
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
  "arrived_at": "2026-10-29T15:52:43.205826Z",
  "started_at": "2026-10-29T15:52:43.443016Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:43Z",
    "sequence": 1793289163673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:43.689742Z",
  "last_location_at": "2026-10-29T15:52:43.689742Z",
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
  "device_ref": "sandbox-26834"
}
```

```json
{
  "challenge_id": "dfcc7be0-16fc-4633-8917-0a66ff57293f",
  "expires_at": "2026-10-29T15:57:43.917428709Z",
  "resend_available_at": "2026-10-29T15:52:44.917428709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "200979",
  "sent_at": "2026-10-29T15:52:43.919759385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfcc7be0-16fc-4633-8917-0a66ff57293f",
  "code": "200979",
  "device_ref": "sandbox-26834"
}
```

```json
{
  "session_id": "c7eec343-aa61-4550-a167-ea52d4466dd5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA2NCwiaWF0IjoxNzkzMjg5MTY0LCJqdGkiOiI1NGVlZDJmNy1iMWIxLTRlZjMtOTU0YS1hYjhlYTVjMmY3MGMiLCJzaWQiOiJjN2VlYzM0My1hYTYxLTQ1NTAtYTE2Ny1lYTUyZDQ0NjZkZDUifQ.QlF6cjum8jkx9BbdYY1TOPeOW_VzjsJ0tl_VN4tNaUM",
  "access_expires_at": "2026-10-29T16:07:44.166448425Z",
  "refresh_token": "GNXrdxu4woxBA5qDnqkleSNprULBfB8PLei98_HTM-0",
  "refresh_expires_at": "2026-11-28T15:52:44.165930287Z",
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
  "command_id": "60530691-cd8d-41d0-9972-cee4e88bddd4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:44Z",
    "sequence": 1793289164623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1ef9f39-1fe6-45bf-85b1-617e53dc5665",
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
  "last_heartbeat_at": "2026-10-29T15:52:44.640261Z",
  "last_location_at": "2026-10-29T15:52:44.640261Z",
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
  "session_id": "5d5aaf58-f916-4da8-bfa3-7686d1a162d2",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNjUsImlhdCI6MTc5MzI4OTE2NSwianRpIjoiYjQ3MWZlMDgtYjRjMy00M2ZmLTk4ODctODRmOGM3Y2U1ZmJjIiwic2lkIjoiNWQ1YWFmNTgtZjkxNi00ZGE4LWJmYTMtNzY4NmQxYTE2MmQyIn0.pyNK4rlQ_lsAUdF6yebKN-rGglEAmtI1u71u69TrGPE",
  "access_expires_at": "2026-10-29T16:07:45.132520105Z",
  "refresh_token": "5pekdbvLxIRDRCD3xPWi0MuEspPEnSgVAWpqnrxKI1Q",
  "refresh_expires_at": "2026-10-30T03:52:45.131992303Z",
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
  "session_id": "ab0a6e8c-719f-452b-9746-068c618953a0",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNjUsImlhdCI6MTc5MzI4OTE2NSwianRpIjoiN2Q4NjVjMDUtZTQ3OC00MGE1LTliNjQtM2UyZGIyMWQ4NGQ3Iiwic2lkIjoiYWIwYTZlOGMtNzE5Zi00NTJiLTk3NDYtMDY4YzYxODk1M2EwIn0.R9z2xJ4vykeYSrKEQ24apE2KtK104oztJEaQjXkZUD4",
  "access_expires_at": "2026-10-29T16:07:45.620861267Z",
  "refresh_token": "0v-oMRn7WdPV4WSRlLZtxeMhvcM4t6Sri1vq6fw-gx0",
  "refresh_expires_at": "2026-10-30T03:52:45.62041141Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5d2253f0-d3d4-4caa-88dc-17114ee751d0` → **200**

```json
{
  "id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9626a95d-44d1-4627-98d5-978098ae73a4",
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
    "id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4",
    "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T15:52:42.040742Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5d2253f0-d3d4-4caa-88dc-17114ee751d0/interrupt` → **200**

```json
{
  "command_id": "fbdae1ef-8e09-4579-a7a0-db1b968f85c6",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "9626a95d-44d1-4627-98d5-978098ae73a4",
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
      "id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4",
      "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5e8b84c3-4c18-4dfa-b39c-ab7d9c652b82",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T15:52:42.040742Z",
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
    "id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "9626a95d-44d1-4627-98d5-978098ae73a4",
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
    "id": "b5295780-f9ce-47e0-a5d1-8cd313d13455",
    "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
    "expires_at": "2026-10-29T15:53:01.113337Z",
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

`POST /api/driver/v1/offers/b5295780-f9ce-47e0-a5d1-8cd313d13455/accept` → **200**

```json
{
  "command_id": "d326aaef-19da-4581-aa17-60d6d63b9cd4"
}
```

```json
{
  "id": "9d816450-fba6-4b92-a6d6-ab0aa07fb3d4",
  "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f7d51950-b860-4089-9351-bf3ed372592e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7d51950-b860-4089-9351-bf3ed372592e",
  "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
  "assignment_id": "9d816450-fba6-4b92-a6d6-ab0aa07fb3d4",
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
  "session_id": "a1ef9f39-1fe6-45bf-85b1-617e53dc5665",
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
  "last_heartbeat_at": "2026-10-29T15:52:44.640261Z",
  "last_location_at": "2026-10-29T15:52:44.640261Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a1ef9f39-1fe6-45bf-85b1-617e53dc5665/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:47Z",
    "sequence": 1793289167269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1ef9f39-1fe6-45bf-85b1-617e53dc5665",
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
  "last_heartbeat_at": "2026-10-29T15:52:47.285861Z",
  "last_location_at": "2026-10-29T15:52:47.285861Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f7d51950-b860-4089-9351-bf3ed372592e/arrive` → **200**

```json
{
  "command_id": "e893d35a-89d6-4757-8514-bc19b5bec701",
  "expected_version": 0
}
```

```json
{
  "id": "f7d51950-b860-4089-9351-bf3ed372592e",
  "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
  "assignment_id": "9d816450-fba6-4b92-a6d6-ab0aa07fb3d4",
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
  "arrived_at": "2026-10-29T15:52:47.517492Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7d51950-b860-4089-9351-bf3ed372592e/start` → **200**

```json
{
  "command_id": "85ea166e-2768-42bd-89ea-bd94ac6e83ad",
  "expected_version": 1
}
```

```json
{
  "id": "f7d51950-b860-4089-9351-bf3ed372592e",
  "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
  "assignment_id": "9d816450-fba6-4b92-a6d6-ab0aa07fb3d4",
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
  "arrived_at": "2026-10-29T15:52:47.517492Z",
  "started_at": "2026-10-29T15:52:47.76242Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7d51950-b860-4089-9351-bf3ed372592e/complete` → **200**

```json
{
  "command_id": "46d0c029-7cc8-450f-b1a8-0cd8c368916e",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:52:47Z"
}
```

```json
{
  "id": "f7d51950-b860-4089-9351-bf3ed372592e",
  "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
  "assignment_id": "9d816450-fba6-4b92-a6d6-ab0aa07fb3d4",
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
  "arrived_at": "2026-10-29T15:52:47.517492Z",
  "started_at": "2026-10-29T15:52:47.76242Z",
  "completed_at": "2026-10-29T15:52:48.00951Z",
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
    "id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:52:46.105519Z",
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
    "id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:52:42.040742Z",
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

`GET /api/operator/v1/orders/5d2253f0-d3d4-4caa-88dc-17114ee751d0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:52:42.041205Z",
      "actor": {
        "type": "CLIENT",
        "id": "9626a95d-44d1-4627-98d5-978098ae73a4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
        "quote_id": "bed09115-3ac3-4c80-854c-95801765b797",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "0136ddbf-8f26-49ef-98eb-632f8cd01154"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:52:42.042798Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
        "attempt_id": "b6ccf686-7bf3-4829-9a17-8733f19d51aa",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0136ddbf-8f26-49ef-98eb-632f8cd01154"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:52:42.045199Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d0768857-323d-4a53-b9e5-5ef6d731806c",
        "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "0136ddbf-8f26-49ef-98eb-632f8cd01154"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:52:42.514359Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d0768857-323d-4a53-b9e5-5ef6d731806c",
        "order_id": "5d2253f0-d3d4-4caa-88dc-17114ee751d0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8133a695-e0f9-4240-9f5e-37cccd00cfc4"
      },
      "correlation_id": "998a2e79-3a39-4fd9-8d66-af2cc6aa270f"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/e05394ab-bcad-440c-ae6f-3a87807129e0/tip` → **200**

```json
{
  "order_id": "e05394ab-bcad-440c-ae6f-3a87807129e0",
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
  "available_until": "2026-10-30T15:52:48.00951Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/e05394ab-bcad-440c-ae6f-3a87807129e0/tip` → **409**

```json
{
  "command_id": "c8000b4f-b7ce-4c62-ac1f-129f7c5dfe49",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/e05394ab-bcad-440c-ae6f-3a87807129e0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a7f6c568-871a-4036-8918-536207fc59ef"
}
```

Done: interrupted 5d2253f0-d3d4-4caa-88dc-17114ee751d0, follow-up e05394ab-bcad-440c-ae6f-3a87807129e0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff30bf4e-4cb2-4d19-bba8-1970b7c39805",
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
  "last_heartbeat_at": "2026-10-29T15:52:43.689742Z",
  "last_location_at": "2026-10-29T15:52:43.689742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff30bf4e-4cb2-4d19-bba8-1970b7c39805/close` → **200**

```json
{
  "command_id": "d7257ce4-75d8-4141-a35e-c18579440f2e",
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
  "session_id": "a1ef9f39-1fe6-45bf-85b1-617e53dc5665",
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
  "last_heartbeat_at": "2026-10-29T15:52:47.285861Z",
  "last_location_at": "2026-10-29T15:52:47.285861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1ef9f39-1fe6-45bf-85b1-617e53dc5665/close` → **200**

```json
{
  "command_id": "29582973-d9f0-4d5c-8128-017575a409fa",
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
  "session_id": "ec300d7d-1d2b-43be-a455-911f8e735550",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwNzMsImlhdCI6MTc5MzI4OTE3MywianRpIjoiOWE5MTYyNDEtMmZlOC00NDg5LWFkYzAtZjdhOTg4YjA0Yzk3Iiwic2lkIjoiZWMzMDBkN2QtMWQyYi00M2JlLWE0NTUtOTExZjhlNzM1NTUwIn0.O3FpzKiiMe53uBHXwZnvmrZrdUf_D3rUU6fttFRM110",
  "access_expires_at": "2026-10-29T16:07:53.623377136Z",
  "refresh_token": "G-SM_aLQobg_ko2CmVOKpVptXXaRho1lGqFmntD8iBw",
  "refresh_expires_at": "2026-10-30T03:52:53.622836344Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e3cdac9e-5511-4850-89fb-f64f67014623",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:52:53Z"
}
```

```json
{
  "id": "3a7af628-f674-4b57-a759-b0e085a68225",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:52:53Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3a7af628-f674-4b57-a759-b0e085a68225/publish` → **200**

```json
{
  "command_id": "b7f25c6f-d407-4fac-ad97-616a91f5e0f0",
  "expected_version": 0
}
```

```json
{
  "id": "3a7af628-f674-4b57-a759-b0e085a68225",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:52:54.104846Z",
  "published_at": "2026-10-29T15:52:54.104846Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "3a7af628-f674-4b57-a759-b0e085a68225",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T15:52:54.104846Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631485579",
  "device_ref": "sandbox-24219"
}
```

```json
{
  "challenge_id": "0ab66be4-4960-40e5-8af4-90e780cd8763",
  "expires_at": "2026-10-29T15:57:54.56493733Z",
  "resend_available_at": "2026-10-29T15:52:55.56493733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631485579` → **200**

```json
{
  "phone": "+380631485579",
  "audience": "CLIENT",
  "code": "365454",
  "sent_at": "2026-10-29T15:52:54.567221536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ab66be4-4960-40e5-8af4-90e780cd8763",
  "code": "365454",
  "device_ref": "sandbox-24219"
}
```

```json
{
  "session_id": "ebe30294-8254-40bf-87a1-530bb76ffa79",
  "subject": {
    "type": "CLIENT",
    "id": "a5dd756a-3331-4110-af88-fa5c32479d98"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNWRkNzU2YS0zMzMxLTQxMTAtYWY4OC1mYTVjMzI0NzlkOTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDc0LCJpYXQiOjE3OTMyODkxNzQsImp0aSI6ImYxN2UwMmMzLTRhN2EtNDllYS04MzMwLWM4NDhkYjU0M2MyNCIsInNpZCI6ImViZTMwMjk0LTgyNTQtNDBiZi04N2ExLTUzMGJiNzZmZmE3OSJ9.SVBSEjXtUeXakcCJ1t_zBjjOZT6_zR6LEQaSUIJuiPs",
  "access_expires_at": "2026-10-29T16:07:54.819018563Z",
  "refresh_token": "8YeagaGH54uJDv_tCSRFWa7rzfMsz95eBn8lJy9uN2I",
  "refresh_expires_at": "2026-11-28T15:52:54.818502938Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "3a7af628-f674-4b57-a759-b0e085a68225",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T15:52:54.104846Z",
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
  "command_id": "7423eb16-9bf5-4e18-a6e9-7ddf2a153e2d",
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
  "id": "f281c3fd-c113-4614-8b14-214909313f87",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:55.289386Z",
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
  "command_id": "94eae190-7dae-453f-bf83-67162cbf48c4",
  "quote_id": "f281c3fd-c113-4614-8b14-214909313f87",
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
  "correlation_id": "28cf9525-f4da-4d7e-94c1-0f67ac7fa195"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0be8deaa-8eb8-43cc-98e6-9ce280053925",
  "version_id": "3a7af628-f674-4b57-a759-b0e085a68225",
  "language": "uk"
}
```

```json
{
  "version_id": "3a7af628-f674-4b57-a759-b0e085a68225",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T15:52:55.762428Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "15cf4f35-3973-4950-b0a8-d46df5723e10",
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
  "id": "8e463ee7-52db-4510-a1bc-fa496ffd7525",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:55.995578Z",
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
  "command_id": "8b616ade-6044-4f0b-8a08-05a997785468",
  "quote_id": "8e463ee7-52db-4510-a1bc-fa496ffd7525",
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
  "id": "522fd52b-1df9-4207-b0e5-7a30563cbc62",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5dd756a-3331-4110-af88-fa5c32479d98",
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
  "created_at": "2026-10-29T15:52:56.229262Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/522fd52b-1df9-4207-b0e5-7a30563cbc62` → **200**

```json
{
  "id": "522fd52b-1df9-4207-b0e5-7a30563cbc62",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5dd756a-3331-4110-af88-fa5c32479d98",
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
  "created_at": "2026-10-29T15:52:56.229262Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/522fd52b-1df9-4207-b0e5-7a30563cbc62/cancel` → **200**

```json
{
  "command_id": "98430226-89b0-49d5-9d07-beb94a95f923",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "522fd52b-1df9-4207-b0e5-7a30563cbc62",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a5dd756a-3331-4110-af88-fa5c32479d98",
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
  "created_at": "2026-10-29T15:52:56.229262Z",
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

`POST /api/admin/v1/legal-documents/3a7af628-f674-4b57-a759-b0e085a68225` → **409**

```json
{
  "command_id": "16093f93-f3d4-42d6-afbc-1ad6cd05be2f",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:52:56Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/3a7af628-f674-4b57-a759-b0e085a68225",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ff772c1e-36dd-4599-8c22-e92d10172960"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b1e9e04c-f2f3-4a6d-b7de-8fc7ae06b8a1",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:52:57Z"
}
```

```json
{
  "id": "311ee798-8145-47b3-a836-5707e63132e2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:52:57Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/311ee798-8145-47b3-a836-5707e63132e2/publish` → **200**

```json
{
  "command_id": "372cab77-cfa7-4706-a4b0-e1d0595f6bcb",
  "expected_version": 0
}
```

```json
{
  "id": "311ee798-8145-47b3-a836-5707e63132e2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:52:57.446556Z",
  "published_at": "2026-10-29T15:52:57.446556Z",
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
  "device_ref": "sandbox-15242"
}
```

```json
{
  "challenge_id": "1a6d36d6-04e0-46a3-9fe5-d5acecab590e",
  "expires_at": "2026-10-29T15:57:57.685172178Z",
  "resend_available_at": "2026-10-29T15:52:58.685172178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "406224",
  "sent_at": "2026-10-29T15:52:57.687551765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a6d36d6-04e0-46a3-9fe5-d5acecab590e",
  "code": "406224",
  "device_ref": "sandbox-15242"
}
```

```json
{
  "session_id": "8d06dfaf-aec9-4565-b4f1-e148410b1526",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA3NywiaWF0IjoxNzkzMjg5MTc3LCJqdGkiOiIxZGU2MzU3My1iZWQ4LTQwNzctOTQ4NS1jZTA5Mjk1N2EwZTAiLCJzaWQiOiI4ZDA2ZGZhZi1hZWM5LTQ1NjUtYjRmMS1lMTQ4NDEwYjE1MjYifQ.RpIo81fmFV-WHCQJ4bqpoit0wz3q7ym7LOpyW4Zviw8",
  "access_expires_at": "2026-10-29T16:07:57.94000986Z",
  "refresh_token": "xMYTrlSt0lyh-n9gss8hluSHj9hmc8atrS77L9iN3zA",
  "refresh_expires_at": "2026-11-28T15:52:57.939569147Z",
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
  "command_id": "f0f5cec6-7286-4996-91dc-f45eb0a685a8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:58Z",
    "sequence": 1793289178393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d5c11476-2257-40e7-8c7f-d3de7d10856f",
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
  "last_heartbeat_at": "2026-10-29T15:52:58.410529Z",
  "last_location_at": "2026-10-29T15:52:58.410529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675778895",
  "device_ref": "sandbox-20159"
}
```

```json
{
  "challenge_id": "5b9928f1-9bf6-4dbc-8fe9-def6abd1a803",
  "expires_at": "2026-10-29T15:57:58.647566694Z",
  "resend_available_at": "2026-10-29T15:52:59.647566694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675778895` → **200**

```json
{
  "phone": "+380675778895",
  "audience": "CLIENT",
  "code": "181729",
  "sent_at": "2026-10-29T15:52:58.64962174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b9928f1-9bf6-4dbc-8fe9-def6abd1a803",
  "code": "181729",
  "device_ref": "sandbox-20159"
}
```

```json
{
  "session_id": "5a77abee-84a5-4052-a9e0-e156014f5e81",
  "subject": {
    "type": "CLIENT",
    "id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOGU0MzhiNS1lZmUzLTRiM2MtOTg5MC0zNDUyNmRlNmIzYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDc4LCJpYXQiOjE3OTMyODkxNzgsImp0aSI6IjQwNTBiNGMzLTE4OTUtNDg2My1iNzYxLTEzMTMzZThiNjZmOCIsInNpZCI6IjVhNzdhYmVlLTg0YTUtNDA1Mi1hOWUwLWUxNTYwMTRmNWU4MSJ9.RK_sO1UrfqQ1rFldhDwi5SMBQOMgpVDVxhncVy4-Fpk",
  "access_expires_at": "2026-10-29T16:07:58.90131745Z",
  "refresh_token": "puqmLBAXgkByoMsIZQw2_JcOay1g851ee-7nrbWI6nk",
  "refresh_expires_at": "2026-11-28T15:52:58.900855476Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4b3eb1b-cbd6-46c6-a054-491b161cd89f",
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
  "id": "e922a2a7-7405-44ae-8da1-fe46b744a907",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:59.133606Z",
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
  "command_id": "1e2e9e1a-b34a-4c3f-95bd-f753a40b1347",
  "quote_id": "e922a2a7-7405-44ae-8da1-fe46b744a907",
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
    "phone": "+380679194372"
  }
}
```

```json
{
  "id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:59.371363Z",
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
    "id": "2dec8492-11d3-4c65-9a88-c75ae9919443",
    "order_id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
    "expires_at": "2026-10-29T15:53:14.374091Z",
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

`POST /api/driver/v1/offers/2dec8492-11d3-4c65-9a88-c75ae9919443/accept` → **200**

```json
{
  "command_id": "b1fc7437-3cb6-407a-99ca-defd830e939d"
}
```

```json
{
  "id": "5f9827fa-8190-49ee-b8c0-fba74b24fece",
  "order_id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44d5635e-d6a8-443d-bab7-276372a68732",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44d5635e-d6a8-443d-bab7-276372a68732",
  "order_id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
  "assignment_id": "5f9827fa-8190-49ee-b8c0-fba74b24fece",
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
    "phone": "+380679194372"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d6c2d39-eb97-472f-bba1-5fe5c8b0b35a",
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
  "id": "379f72ad-943e-46aa-b177-4d1d6ef68b9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:00.347356Z",
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
  "command_id": "4702df58-81a6-4eff-8140-59128aefc8be",
  "quote_id": "379f72ad-943e-46aa-b177-4d1d6ef68b9c",
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
  "id": "c893ab31-741e-4d36-ba20-62d41a7d84bc",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:53:00.581863Z",
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
  "command_id": "97d9cb12-b7bc-4448-84c4-275937400c63",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T18:53:00Z"
}
```

```json
{
  "id": "4b83535d-19b7-4a0b-a814-d8664f61a2ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:00.840250Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:53:00Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "07339ea5-dd4a-4906-ae79-c3543557c8c1",
  "quote_id": "4b83535d-19b7-4a0b-a814-d8664f61a2ef",
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
  "pickup_at": "2026-10-29T18:53:00Z"
}
```

```json
{
  "id": "cabeb607-f6e9-4207-9c5a-4d2686178b88",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:53:01.079749Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:53:00Z",
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
  "command_id": "bbb304eb-0d1a-4c27-886a-b49e3b9f616c",
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
  "id": "883748e8-9e9b-42df-bb43-057286b0a83a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:01.325573Z",
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
  "command_id": "aabe674e-561e-41f0-991b-7652fcfd92fa",
  "quote_id": "883748e8-9e9b-42df-bb43-057286b0a83a",
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
  "correlation_id": "5899c5fe-2729-46ff-968d-19b6a43b3a31"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "cabeb607-f6e9-4207-9c5a-4d2686178b88",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T15:53:01.079749Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T18:53:00Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "c893ab31-741e-4d36-ba20-62d41a7d84bc",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T15:53:00.581863Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "c893ab31-741e-4d36-ba20-62d41a7d84bc",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:53:00.581863Z",
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

`GET /api/rider/v1/orders/75ac4056-36b9-4cc9-bba5-d48622ca8951` → **200**

```json
{
  "id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5f9827fa-8190-49ee-b8c0-fba74b24fece",
    "order_id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "44d5635e-d6a8-443d-bab7-276372a68732",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:52:59.371363Z",
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
    "location_at": "2026-10-29T15:52:58.410529Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/75ac4056-36b9-4cc9-bba5-d48622ca8951/cancel` → **200**

```json
{
  "command_id": "416cd164-6cda-4853-b1a1-88eeda23d656",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5f9827fa-8190-49ee-b8c0-fba74b24fece",
    "order_id": "75ac4056-36b9-4cc9-bba5-d48622ca8951",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "44d5635e-d6a8-443d-bab7-276372a68732",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:52:59.371363Z",
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

`GET /api/rider/v1/orders/c893ab31-741e-4d36-ba20-62d41a7d84bc` → **200**

```json
{
  "id": "c893ab31-741e-4d36-ba20-62d41a7d84bc",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:53:00.581863Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c893ab31-741e-4d36-ba20-62d41a7d84bc/cancel` → **200**

```json
{
  "command_id": "f8de7d9f-4f94-47fe-8416-d09b8d84ac71",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c893ab31-741e-4d36-ba20-62d41a7d84bc",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:53:00.581863Z",
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

`GET /api/rider/v1/orders/cabeb607-f6e9-4207-9c5a-4d2686178b88` → **200**

```json
{
  "id": "cabeb607-f6e9-4207-9c5a-4d2686178b88",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:53:01.079749Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:53:00Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cabeb607-f6e9-4207-9c5a-4d2686178b88/cancel` → **200**

```json
{
  "command_id": "dc869707-519a-4457-9cce-aeba292e0b79",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cabeb607-f6e9-4207-9c5a-4d2686178b88",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f8e438b5-efe3-4b3c-9890-34526de6b3bc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:53:01.079749Z",
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
  "pickup_at": "2026-10-29T18:53:00Z",
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
  "session_id": "d5c11476-2257-40e7-8c7f-d3de7d10856f",
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
  "last_heartbeat_at": "2026-10-29T15:52:58.410529Z",
  "last_location_at": "2026-10-29T15:52:58.410529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d5c11476-2257-40e7-8c7f-d3de7d10856f/close` → **200**

```json
{
  "command_id": "e68a10eb-2747-4b0b-aba9-a45841f3a0c8",
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

Done: orders 75ac4056-36b9-4cc9-bba5-d48622ca8951, c893ab31-741e-4d36-ba20-62d41a7d84bc, cabeb607-f6e9-4207-9c5a-4d2686178b88.

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
  "session_id": "6ec17964-709a-4d0d-8ac2-f91bd5864614",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwODQsImlhdCI6MTc5MzI4OTE4NCwianRpIjoiY2Q3ZDliMTEtOTZiZi00MTNlLWIyMDctOTViNjIyZjk5ODI4Iiwic2lkIjoiNmVjMTc5NjQtNzA5YS00ZDBkLThhYzItZjkxYmQ1ODY0NjE0In0.lHbnuVQWn_wrGr3Cv4X-fPzelhancQuOSFk3_AAHTpU",
  "access_expires_at": "2026-10-29T16:08:04.414236073Z",
  "refresh_token": "y3vczTIzLnWdKCaRU0scGoF9tMy_hjmhgGlfscLHnTQ",
  "refresh_expires_at": "2026-10-30T03:53:04.413772997Z",
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
  "session_id": "75cfd93c-72f7-4be5-b5d9-6ea154b9fe7c",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwODQsImlhdCI6MTc5MzI4OTE4NCwianRpIjoiZTU4ZTgyZTktMDNkNy00NGIzLTgyY2QtOWMxNjVlZWJlNjE3Iiwic2lkIjoiNzVjZmQ5M2MtNzJmNy00YmU1LWI1ZDktNmVhMTU0YjlmZTdjIn0.wFl8QqltMMjMLu5KILMuXPyifkH2KXZECUe1jfVU9qo",
  "access_expires_at": "2026-10-29T16:08:04.906400402Z",
  "refresh_token": "YjfSRUt7n6afRFOCvUpLaqKGKFRgF3ThqyryRv05Cpg",
  "refresh_expires_at": "2026-10-30T03:53:04.905896245Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4899"
}
```

```json
{
  "challenge_id": "94980dcf-0161-4d86-bf9c-c51e73a75597",
  "expires_at": "2026-10-29T15:58:05.1288648Z",
  "resend_available_at": "2026-10-29T15:53:06.1288648Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "607136",
  "sent_at": "2026-10-29T15:53:05.131197792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94980dcf-0161-4d86-bf9c-c51e73a75597",
  "code": "607136",
  "device_ref": "sandbox-4899"
}
```

```json
{
  "session_id": "3864f550-4a4f-4893-853a-d3dd82f99429",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDA4NSwiaWF0IjoxNzkzMjg5MTg1LCJqdGkiOiI1ZTczYjk3NS0xOGJkLTRiOWUtYTI5Mi1jMGY4NWY0Mzk4NmEiLCJzaWQiOiIzODY0ZjU1MC00YTRmLTQ4OTMtODUzYS1kM2RkODJmOTk0MjkifQ.xb4l5XVigK2JECa28DAB6cUc5sr5zJ-x96M7LFmKJys",
  "access_expires_at": "2026-10-29T16:08:05.381489805Z",
  "refresh_token": "_BgqkO8tpaXX8OrFiQYZf653YrJ1BSw2aDBaCiHIcw0",
  "refresh_expires_at": "2026-11-28T15:53:05.381093047Z",
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
  "command_id": "a1783cc1-ffba-4efc-ae06-1d7b75adb461",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:05Z",
    "sequence": 1793289185830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b34e6b85-baa9-4232-bc95-7f287eee30b9",
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
  "last_heartbeat_at": "2026-10-29T15:53:05.847012Z",
  "last_location_at": "2026-10-29T15:53:05.847012Z",
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
  "command_id": "a358b2da-6d76-4b12-aac1-6d92fe332cf1",
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
  "effective_at": "2026-10-29T15:53:06.313904Z",
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T15:50:49.964594Z",
  "last_entries": [
    {
      "order_id": "e611e999-1070-413e-9509-44320bb98d18",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:50:49.964594Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8c1fe731-b893-4bed-968e-7b0de853bcb0",
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
  "id": "43454055-7413-4839-af23-8e5eb8e49a4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:06.765773Z",
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
  "command_id": "5cdc96bf-c31a-4640-9c89-540a176b5391",
  "quote_id": "43454055-7413-4839-af23-8e5eb8e49a4d",
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
    "phone": "+3806711112840"
  }
}
```

```json
{
  "id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
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
  "created_at": "2026-10-29T15:53:07.012779Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112840"
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
    "id": "3fb4fd50-033c-4d24-85ad-cc1ba915f52d",
    "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
    "expires_at": "2026-10-29T15:53:22.015531Z",
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

`POST /api/driver/v1/offers/3fb4fd50-033c-4d24-85ad-cc1ba915f52d/accept` → **200**

```json
{
  "command_id": "60d3464d-fb1d-4c7b-83e6-989c0830a4d3"
}
```

```json
{
  "id": "b7ad7262-1c93-4848-afd8-efff80e37cc9",
  "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dacdea5b-d0c3-42da-876f-cf85ac6e0024",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dacdea5b-d0c3-42da-876f-cf85ac6e0024",
  "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
  "assignment_id": "b7ad7262-1c93-4848-afd8-efff80e37cc9",
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
    "phone": "+3806711112840"
  }
}
```

`POST /api/driver/v1/work-sessions/b34e6b85-baa9-4232-bc95-7f287eee30b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:07Z",
    "sequence": 1793289187930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b34e6b85-baa9-4232-bc95-7f287eee30b9",
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
  "last_heartbeat_at": "2026-10-29T15:53:07.946908Z",
  "last_location_at": "2026-10-29T15:53:07.946908Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dacdea5b-d0c3-42da-876f-cf85ac6e0024/arrive` → **200**

```json
{
  "command_id": "26a24ce4-b47b-4ae4-bede-377a22cf9412",
  "expected_version": 0
}
```

```json
{
  "id": "dacdea5b-d0c3-42da-876f-cf85ac6e0024",
  "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
  "assignment_id": "b7ad7262-1c93-4848-afd8-efff80e37cc9",
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
  "arrived_at": "2026-10-29T15:53:08.184292Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112840"
  }
}
```

`POST /api/driver/v1/trips/dacdea5b-d0c3-42da-876f-cf85ac6e0024/start` → **200**

```json
{
  "command_id": "8986d659-d7ff-4062-85b1-d558beecc843",
  "expected_version": 1
}
```

```json
{
  "id": "dacdea5b-d0c3-42da-876f-cf85ac6e0024",
  "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
  "assignment_id": "b7ad7262-1c93-4848-afd8-efff80e37cc9",
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
  "arrived_at": "2026-10-29T15:53:08.184292Z",
  "started_at": "2026-10-29T15:53:08.429706Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112840"
  }
}
```

`POST /api/driver/v1/trips/dacdea5b-d0c3-42da-876f-cf85ac6e0024/complete` → **200**

```json
{
  "command_id": "a6307622-37a6-415d-9a77-e25c48f6eded",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:53:08Z",
  "cash_received": true
}
```

```json
{
  "id": "dacdea5b-d0c3-42da-876f-cf85ac6e0024",
  "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
  "assignment_id": "b7ad7262-1c93-4848-afd8-efff80e37cc9",
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
  "arrived_at": "2026-10-29T15:53:08.184292Z",
  "started_at": "2026-10-29T15:53:08.429706Z",
  "completed_at": "2026-10-29T15:53:08.679521Z",
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
  "command_id": "6b33c36d-53a1-4c1d-8b82-0681707bf3ef",
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
  "id": "71c4604e-b2b8-4da2-98eb-ea824e62bca8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:08.923596Z",
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
  "command_id": "52269732-cb64-4f23-8ed3-a35075a390f8",
  "quote_id": "71c4604e-b2b8-4da2-98eb-ea824e62bca8",
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
    "phone": "+3806711116269"
  }
}
```

```json
{
  "id": "60085b75-574a-49ba-95b1-cc7d022e6ba7",
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
  "created_at": "2026-10-29T15:53:09.170273Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116269"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/60085b75-574a-49ba-95b1-cc7d022e6ba7` → **200**

```json
{
  "id": "60085b75-574a-49ba-95b1-cc7d022e6ba7",
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
  "created_at": "2026-10-29T15:53:09.170273Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116269"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/60085b75-574a-49ba-95b1-cc7d022e6ba7/cancel` → **200**

```json
{
  "command_id": "21b540b9-625a-4dfe-8498-9388cf12db30",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "60085b75-574a-49ba-95b1-cc7d022e6ba7",
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
  "created_at": "2026-10-29T15:53:09.170273Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711116269"
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
  "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T15:50:49.964594Z",
  "last_entries": [
    {
      "order_id": "60085b75-574a-49ba-95b1-cc7d022e6ba7",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T15:53:09.683138Z"
    },
    {
      "order_id": "9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T15:53:08.683711Z"
    },
    {
      "order_id": "e611e999-1070-413e-9509-44320bb98d18",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:50:49.964594Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b34e6b85-baa9-4232-bc95-7f287eee30b9",
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
  "last_heartbeat_at": "2026-10-29T15:53:07.946908Z",
  "last_location_at": "2026-10-29T15:53:07.946908Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b34e6b85-baa9-4232-bc95-7f287eee30b9/close` → **200**

```json
{
  "command_id": "4fe34e12-e89f-4d7e-ae9f-76f4a87f4911",
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

Done: operator bonus for fulfilled 9c13f8ab-7d3b-4ae3-8251-ea3af7dc7164 and operator-fault cancellation 60085b75-574a-49ba-95b1-cc7d022e6ba7.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670882207",
  "device_ref": "sandbox-30050"
}
```

```json
{
  "challenge_id": "c1ba9e25-3a7a-4cbb-ab19-3ee00ce7ec66",
  "expires_at": "2026-10-29T15:58:13.859779613Z",
  "resend_available_at": "2026-10-29T15:53:14.859779613Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670882207` → **200**

```json
{
  "phone": "+380670882207",
  "audience": "CLIENT",
  "code": "350241",
  "sent_at": "2026-10-29T15:53:13.862030099Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676758772",
  "device_ref": "sandbox-29312",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b9a9e75b-2abb-414e-9baf-e6518002404b",
  "expires_at": "2026-10-29T15:58:15.315044432Z",
  "resend_available_at": "2026-10-29T15:53:16.315044432Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676758772` → **200**

```json
{
  "phone": "+380676758772",
  "audience": "CLIENT",
  "code": "859034",
  "sent_at": "2026-10-29T15:53:15.317183464Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676758772",
  "device_ref": "sandbox-28926",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b41b2afd-89bc-431e-b552-f227d0bbbfe4",
  "expires_at": "2026-10-29T15:58:16.767290083Z",
  "resend_available_at": "2026-10-29T15:53:17.767290083Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676758772` → **200**

```json
{
  "phone": "+380676758772",
  "audience": "CLIENT",
  "code": "943654",
  "sent_at": "2026-10-29T15:53:16.769787465Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670830000",
  "device_ref": "sandbox-23230"
}
```

```json
{
  "challenge_id": "0411f643-8fb2-444b-8972-a265e44896aa",
  "expires_at": "2026-10-29T15:58:18.224031019Z",
  "resend_available_at": "2026-10-29T15:53:19.224031019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670830000",
  "device_ref": "sandbox-14528"
}
```

```json
{
  "challenge_id": "da45c530-d411-4c04-8a26-98f63f0827fc",
  "expires_at": "2026-10-29T15:58:19.659970364Z",
  "resend_available_at": "2026-10-29T15:53:20.659970364Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670830000` → **200**

```json
{
  "phone": "+380670830000",
  "audience": "CLIENT",
  "code": "789700",
  "sent_at": "2026-10-29T15:53:19.662237355Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670830000",
  "device_ref": "sandbox-1017",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7363b553-3b55-48c5-bbe6-ad629ce480b4",
  "expires_at": "2026-10-29T15:58:21.129595547Z",
  "resend_available_at": "2026-10-29T15:53:22.129595547Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670830000` → **200**

```json
{
  "phone": "+380670830000",
  "audience": "CLIENT",
  "code": "374217",
  "sent_at": "2026-10-29T15:53:21.131778063Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670830000",
  "device_ref": "sandbox-27469",
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
  "correlation_id": "5b6d8677-db49-4e39-9e75-ced44c2ee767",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000031646"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "378ae956-697a-416f-8f07-f30242901913"
}
```

`GET /sandbox/v1/otp?phone=%2B442000031646` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120024305"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "bbbd5eab-f391-4787-ad0f-3500b2239df9"
}
```

`GET /sandbox/v1/otp?phone=%2B37120024305` → **404**

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
  "session_id": "016b6413-43d2-4e18-97ea-84da73b9f9f5",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMDMsImlhdCI6MTc5MzI4OTIwMywianRpIjoiZDUyNjVkNzQtNjQ5NS00NWI3LTllYjQtMmU0NjU0OTA1ZTdiIiwic2lkIjoiMDE2YjY0MTMtNDNkMi00ZTE4LTk3ZWEtODRkYTczYjlmOWY1In0.MRsDYQi4MuaXUVf0zj1a5l2qTiwK8vSaDUQ2eaAZoG4",
  "access_expires_at": "2026-10-29T16:08:23.590576215Z",
  "refresh_token": "e6OqfxKzIrhKdBp0P4ZN-TyXDlo5p0nC8k5D19K39LQ",
  "refresh_expires_at": "2026-10-30T03:53:23.590157045Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670830000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8cd40756-45d0-4773-b573-e8f44b551aac",
      "challenge_id": "7363b553-3b55-48c5-bbe6-ad629ce480b4",
      "phone": "+380670830000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-42ec6180-efe1-4949-bbc3-8cb12ee2fe18",
      "error": null,
      "attempted_at": "2026-10-29T15:53:21.132192Z"
    },
    {
      "id": "0316fe28-908a-4d97-b14c-b211ea3119d4",
      "challenge_id": "da45c530-d411-4c04-8a26-98f63f0827fc",
      "phone": "+380670830000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-65f8b33a-cfc2-4afc-a0e0-c7517c2fb2c2",
      "error": null,
      "attempted_at": "2026-10-29T15:53:19.662654Z"
    },
    {
      "id": "1727655a-b1d3-46e1-8233-563bae2b4a6e",
      "challenge_id": "0411f643-8fb2-444b-8972-a265e44896aa",
      "phone": "+380670830000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T15:53:18.226281Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670830000` → **200**

```json
{
  "phone": "+380670830000",
  "audience": "CLIENT",
  "code": "374217",
  "sent_at": "2026-10-29T15:53:21.131778063Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676758772` → **200**

```json
{
  "deliveries": [
    {
      "id": "dd5d9f59-c15b-4583-aea2-b08ea435f9ab",
      "challenge_id": "b41b2afd-89bc-431e-b552-f227d0bbbfe4",
      "phone": "+380676758772",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b0b6218d-69ca-419d-a7d1-de7863fc03f0",
      "error": null,
      "attempted_at": "2026-10-29T15:53:16.770172Z"
    },
    {
      "id": "3c75c2be-7564-417d-9080-65c5fa251612",
      "challenge_id": "b9a9e75b-2abb-414e-9baf-e6518002404b",
      "phone": "+380676758772",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1c1d5b73-7004-4e13-889c-59476a514850",
      "error": null,
      "attempted_at": "2026-10-29T15:53:15.317484Z"
    }
  ]
}
```

Done: SMS to +380670882207; SMS then a call to +380676758772; a failed SMS, two calls and a refused third to +380670830000; +44 and +371 refused.

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
  "session_id": "d2278471-71c8-43ed-9211-68a6f734d4f4",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMDQsImlhdCI6MTc5MzI4OTIwNCwianRpIjoiZDQxYmJlMWItNWFlMy00NTFjLTgyNjItMWJlMjQ3MmRjZDBkIiwic2lkIjoiZDIyNzg0NzEtNzFjOC00M2VkLTkyMTEtNjhhNmY3MzRkNGY0In0.DZgHQXh6HtrCTZbYSSWi5jNwJHJ9YwTh0VdikfwTrzE",
  "access_expires_at": "2026-10-29T16:08:24.566782469Z",
  "refresh_token": "3TDu-UYTPdk2rQbq54rsB6Rzq6BmfuWryghNceJL_xQ",
  "refresh_expires_at": "2026-10-30T03:53:24.566127919Z",
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
  "session_id": "dbd244a2-ff09-433b-8b5e-b3efc582f4b0",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMDUsImlhdCI6MTc5MzI4OTIwNSwianRpIjoiM2VhMDU5N2QtN2Y5Ni00MDlmLTkyN2UtZDExNjk5NzE2ODNiIiwic2lkIjoiZGJkMjQ0YTItZmYwOS00MzNiLThiNWUtYjNlZmM1ODJmNGIwIn0.N-HYtzDabjXJ9hoHTs4_ZnzJ2aL93g1-apxS-AmCtnM",
  "access_expires_at": "2026-10-29T16:08:25.054550156Z",
  "refresh_token": "V6h1X2cncinRS344-0tneaPsO_56rd2cjw3aCiYpG1g",
  "refresh_expires_at": "2026-10-30T03:53:25.053977818Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
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

`POST /api/admin/v1/staff-extensions/fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8` → **200**

```json
{
  "command_id": "f1a138e9-8833-401b-838f-adef21a1853c",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ca2bb901-278b-40fc-aaf3-7f60bc06630c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:53:25.961468Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:53:25.961468Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c638da4b-4cab-43bd-9a1a-5d9b3f5482d6",
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
  "id": "23872b13-442b-491f-9d6e-1d51937d28e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:26.405057Z",
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
  "command_id": "3b5e7b27-e7e3-4db9-b351-9ab6fea51ac3",
  "quote_id": "23872b13-442b-491f-9d6e-1d51937d28e2",
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
    "phone": "+380678335124"
  }
}
```

```json
{
  "id": "5bfbc3db-4a86-4053-bc1a-374f353284c8",
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
  "created_at": "2026-10-29T15:53:26.64265Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678335124"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/5bfbc3db-4a86-4053-bc1a-374f353284c8/calls` → **201**

```json
{
  "command_id": "e2b9c25d-f2c8-48bd-85aa-00844d94a261",
  "to": "CALLER"
}
```

```json
{
  "id": "ac646824-1590-4f7b-a8da-c3721655eded",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "order_ids": [
    "5bfbc3db-4a86-4053-bc1a-374f353284c8"
  ],
  "started_at": "2026-10-29T15:53:26.898609Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/5bfbc3db-4a86-4053-bc1a-374f353284c8/calls` → **201**

```json
{
  "command_id": "e2b9c25d-f2c8-48bd-85aa-00844d94a261",
  "to": "CALLER"
}
```

```json
{
  "id": "ac646824-1590-4f7b-a8da-c3721655eded",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "order_ids": [
    "5bfbc3db-4a86-4053-bc1a-374f353284c8"
  ],
  "started_at": "2026-10-29T15:53:26.898609Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ac646824-1590-4f7b-a8da-c3721655eded",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678335124",
    "at": "2026-10-29T15:53:26.90056653Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ac646824-1590-4f7b-a8da-c3721655eded",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11937",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ac646824-1590-4f7b-a8da-c3721655eded"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ac646824-1590-4f7b-a8da-c3721655eded",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=5bfbc3db-4a86-4053-bc1a-374f353284c8` → **200**

```json
{
  "calls": [
    {
      "id": "ac646824-1590-4f7b-a8da-c3721655eded",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [
        "5bfbc3db-4a86-4053-bc1a-374f353284c8"
      ],
      "started_at": "2026-10-29T15:53:26.898609Z",
      "answered_at": "2026-10-29T15:53:27.435711Z",
      "ended_at": "2026-10-29T15:53:27.454372Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5bfbc3db-4a86-4053-bc1a-374f353284c8` → **200**

```json
{
  "calls": [
    {
      "id": "ac646824-1590-4f7b-a8da-c3721655eded",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [
        "5bfbc3db-4a86-4053-bc1a-374f353284c8"
      ],
      "started_at": "2026-10-29T15:53:26.898609Z",
      "answered_at": "2026-10-29T15:53:27.435711Z",
      "ended_at": "2026-10-29T15:53:27.454372Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5bfbc3db-4a86-4053-bc1a-374f353284c8` → **200**

```json
{
  "calls": [
    {
      "id": "ac646824-1590-4f7b-a8da-c3721655eded",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "order_ids": [
        "5bfbc3db-4a86-4053-bc1a-374f353284c8"
      ],
      "started_at": "2026-10-29T15:53:26.898609Z",
      "answered_at": "2026-10-29T15:53:27.435711Z",
      "ended_at": "2026-10-29T15:53:27.454372Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:53:29.821517Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/5bfbc3db-4a86-4053-bc1a-374f353284c8` → **200**

```json
{
  "id": "5bfbc3db-4a86-4053-bc1a-374f353284c8",
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
  "created_at": "2026-10-29T15:53:26.64265Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678335124"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5bfbc3db-4a86-4053-bc1a-374f353284c8/cancel` → **200**

```json
{
  "command_id": "8053ed78-6ef6-468e-bbbf-701891de6914",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5bfbc3db-4a86-4053-bc1a-374f353284c8",
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
  "created_at": "2026-10-29T15:53:26.64265Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678335124"
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
  "command_id": "edfed859-3b16-4838-9a19-4382d3e8c005",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T15:53:32.722989Z",
  "extension": "101"
}
```

Done: outgoing call ac646824-1590-4f7b-a8da-c3721655eded from order 5bfbc3db-4a86-4053-bc1a-374f353284c8, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638467527",
  "device_ref": "sandbox-9220"
}
```

```json
{
  "challenge_id": "01264f25-6ed3-46e9-97f5-d65f966059bc",
  "expires_at": "2026-10-29T15:58:32.967934496Z",
  "resend_available_at": "2026-10-29T15:53:33.967934496Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638467527` → **200**

```json
{
  "phone": "+380638467527",
  "audience": "CLIENT",
  "code": "422382",
  "sent_at": "2026-10-29T15:53:32.970095845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01264f25-6ed3-46e9-97f5-d65f966059bc",
  "code": "422382",
  "device_ref": "sandbox-9220"
}
```

```json
{
  "session_id": "b1e30f9b-7595-42b0-9530-526424e26e66",
  "subject": {
    "type": "CLIENT",
    "id": "f9dbf263-7bd5-4385-afce-aecae73eb123"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWRiZjI2My03YmQ1LTQzODUtYWZjZS1hZWNhZTczZWIxMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTEzLCJpYXQiOjE3OTMyODkyMTMsImp0aSI6IjM0NmVhMmExLWY5MTMtNDBjOS05ZDRmLTdkMjJhY2RhMjg0ZiIsInNpZCI6ImIxZTMwZjliLTc1OTUtNDJiMC05NTMwLTUyNjQyNGUyNmU2NiJ9.IeCIUbIH_LDulN5tLsRWacKc29_-Gp914g1-hMMV0VM",
  "access_expires_at": "2026-10-29T16:08:33.225480008Z",
  "refresh_token": "J5Jy2kX36GTZN0qeMo6FM9IX_BWDE6fLi2WWK3qZ1cE",
  "refresh_expires_at": "2026-11-28T15:53:33.225011384Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
  "session_id": "b1e30f9b-7595-42b0-9530-526424e26e66",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638467527",
  "device_ref": "sandbox-14386"
}
```

```json
{
  "challenge_id": "5660aa05-52be-4aef-b9fb-81f485f2e78d",
  "expires_at": "2026-10-29T15:58:35.686469292Z",
  "resend_available_at": "2026-10-29T15:53:36.686469292Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638467527` → **200**

```json
{
  "phone": "+380638467527",
  "audience": "CLIENT",
  "code": "208287",
  "sent_at": "2026-10-29T15:53:35.688433453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5660aa05-52be-4aef-b9fb-81f485f2e78d",
  "code": "208287",
  "device_ref": "sandbox-14386"
}
```

```json
{
  "session_id": "7c9a6b4e-9e24-460f-9014-3627392c7d46",
  "subject": {
    "type": "CLIENT",
    "id": "f9dbf263-7bd5-4385-afce-aecae73eb123"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWRiZjI2My03YmQ1LTQzODUtYWZjZS1hZWNhZTczZWIxMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTE1LCJpYXQiOjE3OTMyODkyMTUsImp0aSI6IjJlMWIxYjdhLTQzMTQtNDQ5OC05NThmLThhYzFlMDhhMTcyNSIsInNpZCI6IjdjOWE2YjRlLTllMjQtNDYwZi05MDE0LTM2MjczOTJjN2Q0NiJ9.H59q3fYkCum6_MU2s3K5ECDyLd8g-LSIkPrEwz8EII8",
  "access_expires_at": "2026-10-29T16:08:35.948366459Z",
  "refresh_token": "0rTCmfurdt1MzKWl2bIJHYVF6oe6Xo2HyYDBtDsUCQc",
  "refresh_expires_at": "2026-11-28T15:53:35.947880368Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "47e9427b-148b-442d-967a-c4eaef3b05ec",
  "expires_at": "2026-10-29T15:58:38.184239969Z",
  "resend_available_at": "2026-10-29T15:53:39.184239969Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638467527` → **200**

```json
{
  "phone": "+380638467527",
  "audience": "CLIENT",
  "code": "883185",
  "sent_at": "2026-10-29T15:53:38.186500991Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633336720"
}
```

```json
{
  "challenge_id": "b49f85c7-1172-4d44-98d8-5b26ae8d7e4e",
  "expires_at": "2026-10-29T15:58:38.426732544Z",
  "resend_available_at": "2026-10-29T15:53:39.426732544Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633336720` → **200**

```json
{
  "phone": "+380633336720",
  "audience": "CLIENT",
  "code": "991994",
  "sent_at": "2026-10-29T15:53:38.428439344Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d8d966cc-33e2-4168-b005-329a7afe82a2",
  "current_challenge_id": "47e9427b-148b-442d-967a-c4eaef3b05ec",
  "current_code": "000000",
  "new_challenge_id": "b49f85c7-1172-4d44-98d8-5b26ae8d7e4e",
  "new_code": "991994"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "35dd2760-4280-49e7-a78c-24d45bb7534e"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "c0030ed0-f70f-4509-afb0-678f41d040ec",
  "current_challenge_id": "47e9427b-148b-442d-967a-c4eaef3b05ec",
  "current_code": "883185",
  "new_challenge_id": "b49f85c7-1172-4d44-98d8-5b26ae8d7e4e",
  "new_code": "991994"
}
```

```json
{
  "subject_id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
  "phone": "+380633336720",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
  "session_id": "b1e30f9b-7595-42b0-9530-526424e26e66",
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
  "correlation_id": "02628cad-9750-4732-8c90-f006cf7ea29c"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633336720",
  "device_ref": "sandbox-7823"
}
```

```json
{
  "challenge_id": "88fadfdd-f4ff-4b45-aa1a-72246871e1e0",
  "expires_at": "2026-10-29T15:58:41.591495224Z",
  "resend_available_at": "2026-10-29T15:53:42.591495224Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633336720` → **200**

```json
{
  "phone": "+380633336720",
  "audience": "CLIENT",
  "code": "351174",
  "sent_at": "2026-10-29T15:53:41.593910394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88fadfdd-f4ff-4b45-aa1a-72246871e1e0",
  "code": "351174",
  "device_ref": "sandbox-7823"
}
```

```json
{
  "session_id": "b558399d-e38a-40e1-a1ec-a3d373be768d",
  "subject": {
    "type": "CLIENT",
    "id": "f9dbf263-7bd5-4385-afce-aecae73eb123"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWRiZjI2My03YmQ1LTQzODUtYWZjZS1hZWNhZTczZWIxMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTIxLCJpYXQiOjE3OTMyODkyMjEsImp0aSI6IjA3MTY3YTVjLTZmZmYtNGJiMC05NTM1LWMyZTkwMWM3MjgwZiIsInNpZCI6ImI1NTgzOTlkLWUzOGEtNDBlMS1hMWVjLWEzZDM3M2JlNzY4ZCJ9.UYGkhgpAiOsl7V9w14ldYXTCSSssjhBYpHlWvMPQXqc",
  "access_expires_at": "2026-10-29T16:08:41.842493767Z",
  "refresh_token": "0mYjE5WtlzKJWmHWDv03ysBvTQiZN8IObKJSXbbOZlA",
  "refresh_expires_at": "2026-11-28T15:53:41.842086543Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
  "session_id": "b558399d-e38a-40e1-a1ec-a3d373be768d",
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
  "session_id": "a3839407-65e3-431d-9e44-bd01510beec7",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMjIsImlhdCI6MTc5MzI4OTIyMiwianRpIjoiOGYwNzhiOTMtNjFiZS00YjA0LThlZWUtZTIzMzExNWUzNWFjIiwic2lkIjoiYTM4Mzk0MDctNjVlMy00MzFkLTllNDQtYmQwMTUxMGJlZWM3In0.aTz_NCXlL-VN3X9MgTI2Scw94VbcWf275sJ6QSSA4bQ",
  "access_expires_at": "2026-10-29T16:08:42.555082998Z",
  "refresh_token": "tA4RQl8gghqRXxx9brW9YwuP3o3HGLY5OQWMwq30Tc0",
  "refresh_expires_at": "2026-10-30T03:53:42.554620242Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123` → **200**

```json
{
  "client": {
    "id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
    "phone": "+380633336720",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:53:33.223499Z",
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

`POST /api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123/phone/new-code` → **201**

```json
{
  "phone": "+380631619582"
}
```

```json
{
  "challenge_id": "529f4e1e-452a-40af-bbe8-6a169a14da8a",
  "expires_at": "2026-10-29T15:58:43.03143Z",
  "resend_available_at": "2026-10-29T15:53:44.03143Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631619582` → **200**

```json
{
  "phone": "+380631619582",
  "audience": "CLIENT",
  "code": "725985",
  "sent_at": "2026-10-29T15:53:43.032963073Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123/phone` → **422**

```json
{
  "command_id": "976e1310-45f1-406f-b814-a2d29fa3b0ab",
  "expected_version": 3,
  "new_challenge_id": "529f4e1e-452a-40af-bbe8-6a169a14da8a",
  "new_code": "725986",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "21f89e7d-9537-4bd4-a3aa-77ecda784bc5"
}
```

`POST /api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123/phone` → **400**

```json
{
  "command_id": "65cfd5f3-768c-458c-b303-0d9baf673ffe",
  "expected_version": 3,
  "new_challenge_id": "529f4e1e-452a-40af-bbe8-6a169a14da8a",
  "new_code": "725985",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a32f6f4e-5755-4b53-858b-c8131d5f99ff",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/f9dbf263-7bd5-4385-afce-aecae73eb123/phone` → **200**

```json
{
  "command_id": "7d36927a-7df6-44b1-a0b7-9ed6ed94c7ee",
  "expected_version": 3,
  "new_challenge_id": "529f4e1e-452a-40af-bbe8-6a169a14da8a",
  "new_code": "725985",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
  "phone": "+380631619582",
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
  "correlation_id": "aa5b8b5b-74b7-4b64-bc56-619d5dd779ab"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631619582",
  "device_ref": "sandbox-22140"
}
```

```json
{
  "challenge_id": "19a93d89-c6af-433d-8b25-bf369164f12c",
  "expires_at": "2026-10-29T15:58:44.221534045Z",
  "resend_available_at": "2026-10-29T15:53:45.221534045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631619582` → **200**

```json
{
  "phone": "+380631619582",
  "audience": "CLIENT",
  "code": "038993",
  "sent_at": "2026-10-29T15:53:44.223647778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19a93d89-c6af-433d-8b25-bf369164f12c",
  "code": "038993",
  "device_ref": "sandbox-22140"
}
```

```json
{
  "session_id": "31890d5b-6e4b-44c9-9e8f-8209d7326127",
  "subject": {
    "type": "CLIENT",
    "id": "f9dbf263-7bd5-4385-afce-aecae73eb123"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWRiZjI2My03YmQ1LTQzODUtYWZjZS1hZWNhZTczZWIxMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTI0LCJpYXQiOjE3OTMyODkyMjQsImp0aSI6IjFmMTczMWVlLTI4OGItNGVkMi05MGZjLTAxMGQ1YzU3MDkyYSIsInNpZCI6IjMxODkwZDViLTZlNGItNDRjOS05ZThmLTgyMDlkNzMyNjEyNyJ9.Y3WrdwB8M38lTdYaIhrlkd9EGmOFbGYVRgcXCp2vycA",
  "access_expires_at": "2026-10-29T16:08:44.476903597Z",
  "refresh_token": "WgkYp6PHqO2HvRbRduIpmQ-xbm08ZaLNVi3U364YBLk",
  "refresh_expires_at": "2026-11-28T15:53:44.476188597Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f9dbf263-7bd5-4385-afce-aecae73eb123",
  "session_id": "31890d5b-6e4b-44c9-9e8f-8209d7326127",
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
  "phone": "+380638519569",
  "device_ref": "sandbox-8774"
}
```

```json
{
  "challenge_id": "008a45c6-1b18-4db5-83b5-e1615a9fd65f",
  "expires_at": "2026-10-29T15:58:44.943777803Z",
  "resend_available_at": "2026-10-29T15:53:45.943777803Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638519569` → **200**

```json
{
  "phone": "+380638519569",
  "audience": "CLIENT",
  "code": "298692",
  "sent_at": "2026-10-29T15:53:44.946088052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "008a45c6-1b18-4db5-83b5-e1615a9fd65f",
  "code": "298692",
  "device_ref": "sandbox-8774"
}
```

```json
{
  "session_id": "4685502c-4866-4eef-9525-e05092b536ca",
  "subject": {
    "type": "CLIENT",
    "id": "1954cd7b-8b3d-4e72-a702-0717ac5353d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOTU0Y2Q3Yi04YjNkLTRlNzItYTcwMi0wNzE3YWM1MzUzZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTI1LCJpYXQiOjE3OTMyODkyMjUsImp0aSI6IjI1Yzg4MDlhLTkyYTktNGM3YS1iZjVjLTFmZDMwMzJiM2UwNCIsInNpZCI6IjQ2ODU1MDJjLTQ4NjYtNGVlZi05NTI1LWUwNTA5MmI1MzZjYSJ9.U5gwDsLjqHsydbd06A4dTqC8BxjX2JkmOBILDHPR-1Y",
  "access_expires_at": "2026-10-29T16:08:45.20815288Z",
  "refresh_token": "ovZzGSzNKpthRoQgbqVGb9JDLaKWZAcqyxlP5EJgqxM",
  "refresh_expires_at": "2026-11-28T15:53:45.207686478Z",
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
  "session_id": "7df9efe5-0a69-4650-87ba-e217f0d74595",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMjYsImlhdCI6MTc5MzI4OTIyNiwianRpIjoiNWQyMDUxMzgtMzY2Yy00Y2UwLWFmYjctMjc4NGI3NWVhZmJmIiwic2lkIjoiN2RmOWVmZTUtMGE2OS00NjUwLTg3YmEtZTIxN2YwZDc0NTk1In0.iksIRUpX6i67BstjFurqic4URn0isKYtyVZ48HQdhYA",
  "access_expires_at": "2026-10-29T16:08:46.176408577Z",
  "refresh_token": "ZGfKmGtfxlWx7LXsv4b1cQJxXO2gT1vtQbBuheaZyY4",
  "refresh_expires_at": "2026-10-30T03:53:46.176002975Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638519569` → **200**

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
  "correlation_id": "fac593dc-1bf1-498e-92bf-33852a6741ac"
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
  "session_id": "2df3276e-01ba-4807-b0c5-670eb2cf247b",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMjcsImlhdCI6MTc5MzI4OTIyNywianRpIjoiZjY3Yzc2MjktNjZjMS00MjFkLTg4N2UtODk5N2IzNzZlOTBiIiwic2lkIjoiMmRmMzI3NmUtMDFiYS00ODA3LWIwYzUtNjcwZWIyY2YyNDdiIn0.xSzpa58KXmRYw_cxXgkCgyXyfUEgCl-417tc2yjIkM8",
  "access_expires_at": "2026-10-29T16:08:47.129673696Z",
  "refresh_token": "DXQpQ5LydxGmq1x0vo7Er7h5C5cWJWydWT0ZG2uXC1I",
  "refresh_expires_at": "2026-10-30T03:53:47.129206633Z",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:50:24.654891Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "99b59d0a-b995-415b-8446-699391d5cd51",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T15:53:47.590768705Z"
}
```

## The rider books the airport for 2026-10-29T18:53:46Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600795359",
  "device_ref": "sandbox-15223"
}
```

```json
{
  "challenge_id": "50e0a005-0118-49c0-9661-d3df8e3b1d67",
  "expires_at": "2026-10-29T15:58:47.83225923Z",
  "resend_available_at": "2026-10-29T15:53:48.83225923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600795359` → **200**

```json
{
  "phone": "+48600795359",
  "audience": "CLIENT",
  "code": "714734",
  "sent_at": "2026-10-29T15:53:47.834485157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50e0a005-0118-49c0-9661-d3df8e3b1d67",
  "code": "714734",
  "device_ref": "sandbox-15223"
}
```

```json
{
  "session_id": "4ef75e5a-c55e-435e-b527-5db5e69178ee",
  "subject": {
    "type": "CLIENT",
    "id": "afc427c0-8b4e-46eb-be59-d9137c033705"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmM0MjdjMC04YjRlLTQ2ZWItYmU1OS1kOTEzN2MwMzM3MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTI4LCJpYXQiOjE3OTMyODkyMjgsImp0aSI6ImZiZTg2ZTk0LTQwYjAtNDQ4Mi05ZjEyLTM1ODgwZWRiOTMzYSIsInNpZCI6IjRlZjc1ZTVhLWM1NWUtNDM1ZS1iNTI3LTVkYjVlNjkxNzhlZSJ9.c81-M2lBrcuCs15uvfRtB0qgpCmZJzCueUNn1c5-rAg",
  "access_expires_at": "2026-10-29T16:08:48.086342046Z",
  "refresh_token": "50ard_i7J2vj1Cbkko-wWf-4pzzENH-XZrfYPThtjHc",
  "refresh_expires_at": "2026-11-28T15:53:48.085887392Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2694868a-0509-42fc-bca0-594860b22fb1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T18:53:46Z"
}
```

```json
{
  "id": "d9ca1141-2f4d-4b32-8ce5-c6c3eaf838e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:48.320136Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:53:46Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1034d2a4-5a06-4609-b4a4-9e5574c7c5c7",
  "quote_id": "d9ca1141-2f4d-4b32-8ce5-c6c3eaf838e9",
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
  "pickup_at": "2026-10-29T18:53:46Z"
}
```

```json
{
  "id": "9c020847-1e67-441c-8df9-278247091fe1",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "afc427c0-8b4e-46eb-be59-d9137c033705",
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
  "created_at": "2026-10-29T15:53:48.563951Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:53:46Z",
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
  "device_ref": "sandbox-7043"
}
```

```json
{
  "challenge_id": "cc50d19a-44d0-4b77-a4dc-a376aafcc740",
  "expires_at": "2026-10-29T15:58:48.799673246Z",
  "resend_available_at": "2026-10-29T15:53:49.799673246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "902671",
  "sent_at": "2026-10-29T15:53:48.801932778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc50d19a-44d0-4b77-a4dc-a376aafcc740",
  "code": "902671",
  "device_ref": "sandbox-7043"
}
```

```json
{
  "session_id": "7c7d78c6-bb83-4a00-a413-2ec69132edc0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEyOSwiaWF0IjoxNzkzMjg5MjI5LCJqdGkiOiJmZGNhM2QyMy1iNzRjLTQxNTYtOGUyNi00NTNjMDMzMWQ1ZGEiLCJzaWQiOiI3YzdkNzhjNi1iYjgzLTRhMDAtYTQxMy0yZWM2OTEzMmVkYzAifQ.9CW378PY4fig6313uHUlHxWZMF2hSbSX2ZsU7RrJ0wU",
  "access_expires_at": "2026-10-29T16:08:49.050118121Z",
  "refresh_token": "bOTpE2C_rTe2fYgrvVHoSQIQaZVkEaQl_YFG9Me7Kig",
  "refresh_expires_at": "2026-11-28T15:53:49.049628074Z",
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
  "command_id": "8f7a5113-4ad6-49b4-96f3-9ee7db9fddd6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:49Z",
    "sequence": 1793289229503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a60dceab-5e17-4bcb-b108-ac7fdc808fd5",
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
  "last_heartbeat_at": "2026-10-29T15:53:49.520272Z",
  "last_location_at": "2026-10-29T15:53:49.520272Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9c020847-1e67-441c-8df9-278247091fe1",
      "short_number": 24,
      "pickup_at": "2026-10-29T18:53:46Z",
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

`POST /api/driver/v1/preorders/9c020847-1e67-441c-8df9-278247091fe1/reserve` → **200**

```json
{
  "command_id": "ec2c60ab-6528-48b3-b05b-5d58c08456df"
}
```

```json
{
  "id": "aaef1737-e6be-4ae8-9ae2-914694b8afd4",
  "state": "RESERVED",
  "order": {
    "order_id": "9c020847-1e67-441c-8df9-278247091fe1",
    "short_number": 24,
    "pickup_at": "2026-10-29T18:53:46Z",
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
  "reserved_at": "2026-10-29T15:53:49.990999Z",
  "confirm_from": "2026-10-29T18:23:46Z",
  "confirm_until": "2026-10-29T18:33:46Z",
  "drop_until": "2026-10-29T17:53:46Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "aaef1737-e6be-4ae8-9ae2-914694b8afd4",
      "state": "RESERVED",
      "order": {
        "order_id": "9c020847-1e67-441c-8df9-278247091fe1",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:53:46Z",
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
      "reserved_at": "2026-10-29T15:53:49.990999Z",
      "confirm_from": "2026-10-29T18:23:46Z",
      "confirm_until": "2026-10-29T18:33:46Z",
      "drop_until": "2026-10-29T17:53:46Z"
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
      "id": "aaef1737-e6be-4ae8-9ae2-914694b8afd4",
      "state": "RESERVED",
      "order": {
        "order_id": "9c020847-1e67-441c-8df9-278247091fe1",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:53:46Z",
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
      "reserved_at": "2026-10-29T15:53:49.990999Z",
      "confirm_from": "2026-10-29T18:23:46Z",
      "confirm_until": "2026-10-29T18:33:46Z",
      "drop_until": "2026-10-29T17:53:46Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/aaef1737-e6be-4ae8-9ae2-914694b8afd4/confirm` → **409**

```json
{
  "command_id": "553a97fd-48cf-4ae5-8247-38821c1b77e3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/aaef1737-e6be-4ae8-9ae2-914694b8afd4/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "85729180-ea36-4010-ae4f-98acc21ab192"
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
  "session_id": "b242dc50-b1b2-4989-a201-73ee6f00e66c",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMzEsImlhdCI6MTc5MzI4OTIzMSwianRpIjoiNmY4YWQyZDMtMjE0ZC00NTcxLTg5YTUtOWFjODU3ZTkyZDg2Iiwic2lkIjoiYjI0MmRjNTAtYjFiMi00OTg5LWEyMDEtNzNlZTZmMDBlNjZjIn0.TAU96UsolzIPNQSQSkyRIaM-BedwLrCgRUTngEU7pfg",
  "access_expires_at": "2026-10-29T16:08:51.213504082Z",
  "refresh_token": "yOxC08JOti-vyz1wbNf-tj4fR3WTEw_fXXXGkAcn_gQ",
  "refresh_expires_at": "2026-10-30T03:53:51.213055047Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9c020847-1e67-441c-8df9-278247091fe1` → **200**

```json
{
  "id": "9c020847-1e67-441c-8df9-278247091fe1",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "afc427c0-8b4e-46eb-be59-d9137c033705",
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
  "created_at": "2026-10-29T15:53:48.563951Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T18:53:46Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "aaef1737-e6be-4ae8-9ae2-914694b8afd4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T15:53:49.990999Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9c020847-1e67-441c-8df9-278247091fe1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T15:53:48.564767Z",
      "actor": {
        "type": "CLIENT",
        "id": "afc427c0-8b4e-46eb-be59-d9137c033705",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9c020847-1e67-441c-8df9-278247091fe1",
        "preorder": true,
        "quote_id": "d9ca1141-2f4d-4b32-8ce5-c6c3eaf838e9",
        "pickup_at": "2026-10-29T18:53:46Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "bec5dea2-8dd3-40aa-b42d-bc772653ac84"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T15:53:49.992031Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9c020847-1e67-441c-8df9-278247091fe1",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "aaef1737-e6be-4ae8-9ae2-914694b8afd4"
      },
      "correlation_id": "d5ad9c2d-d0ea-4969-bf1d-45a0789b7fc3"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9c020847-1e67-441c-8df9-278247091fe1, reservation aaef1737-e6be-4ae8-9ae2-914694b8afd4.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14282"
}
```

```json
{
  "challenge_id": "b859f044-9c8f-4ea6-9b57-83de06d65f58",
  "expires_at": "2026-10-29T15:58:51.931591829Z",
  "resend_available_at": "2026-10-29T15:53:52.931591829Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "995162",
  "sent_at": "2026-10-29T15:53:51.933702728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b859f044-9c8f-4ea6-9b57-83de06d65f58",
  "code": "995162",
  "device_ref": "sandbox-14282"
}
```

```json
{
  "session_id": "b0129a72-a46d-4960-bc43-c1438b7e060c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDEzMiwiaWF0IjoxNzkzMjg5MjMyLCJqdGkiOiJjYWE2NWQwMS1kYTIwLTQ4NDYtYTE1MC04Nzk5ODQ5OWJjZmMiLCJzaWQiOiJiMDEyOWE3Mi1hNDZkLTQ5NjAtYmM0My1jMTQzOGI3ZTA2MGMifQ.PV93tIVrzu16iI9I9zoTz8DGW_KP-2E3EY91AG_q4og",
  "access_expires_at": "2026-10-29T16:08:52.185055056Z",
  "refresh_token": "T1zvRLlIVOTxUNvRD8dS_0Lz7K8lQnvTSZpeTIJsJ2w",
  "refresh_expires_at": "2026-11-28T15:53:52.184565912Z",
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
  "command_id": "a90180fa-021e-4b05-b757-2d503f515123",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:52Z",
    "sequence": 1793289232624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:53:52.642157Z",
  "last_location_at": "2026-10-29T15:53:52.642157Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678697809",
  "device_ref": "sandbox-14573"
}
```

```json
{
  "challenge_id": "4ad5c7a8-376e-4753-afeb-95246e47f9f8",
  "expires_at": "2026-10-29T15:58:52.870770695Z",
  "resend_available_at": "2026-10-29T15:53:53.870770695Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678697809` → **200**

```json
{
  "phone": "+380678697809",
  "audience": "CLIENT",
  "code": "970359",
  "sent_at": "2026-10-29T15:53:52.872886602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ad5c7a8-376e-4753-afeb-95246e47f9f8",
  "code": "970359",
  "device_ref": "sandbox-14573"
}
```

```json
{
  "session_id": "27cf8847-f58f-4b42-b665-ad012909cdcc",
  "subject": {
    "type": "CLIENT",
    "id": "ae525e08-fb98-4c9f-b7cf-a0cbd1bf43a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTUyNWUwOC1mYjk4LTRjOWYtYjdjZi1hMGNiZDFiZjQzYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTMzLCJpYXQiOjE3OTMyODkyMzMsImp0aSI6IjhmMDE3OTgwLWI0OGMtNDFjNC04MmM3LTE3OTE1OWU5NDgwMCIsInNpZCI6IjI3Y2Y4ODQ3LWY1OGYtNGI0Mi1iNjY1LWFkMDEyOTA5Y2RjYyJ9.OcdJXrE7_TShjZG5DBoZmbHcH7ggQgKem4abO4Z4djk",
  "access_expires_at": "2026-10-29T16:08:53.119574285Z",
  "refresh_token": "-h-k2ZPhic6j3mHOLGv5tmLwoLnsZezFSnPkrKo849Y",
  "refresh_expires_at": "2026-11-28T15:53:53.119019793Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9009540d-ca20-443a-9e06-1ec628e2631b",
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
  "id": "0b049817-a79b-49ae-ad97-e6809597cbc1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:58:53.349439Z",
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
  "command_id": "3094393a-8c25-4473-a205-0c9edcb1c555",
  "quote_id": "0b049817-a79b-49ae-ad97-e6809597cbc1",
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
  "id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae525e08-fb98-4c9f-b7cf-a0cbd1bf43a9",
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
  "created_at": "2026-10-29T15:53:53.587783Z",
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
    "id": "b74a104e-c4a3-41ce-990c-c7a363c795ee",
    "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
    "expires_at": "2026-10-29T15:54:08.591261Z",
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

`POST /api/driver/v1/offers/b74a104e-c4a3-41ce-990c-c7a363c795ee/accept` → **200**

```json
{
  "command_id": "35b6a3ef-cccd-4f23-b4b8-b21e66a67bd8"
}
```

```json
{
  "id": "98315dbc-bb0e-4cd8-b58b-38c8c93099de",
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "18aec7d3-d657-496a-96f6-861562a59efc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "18aec7d3-d657-496a-96f6-861562a59efc",
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "assignment_id": "98315dbc-bb0e-4cd8-b58b-38c8c93099de",
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

`POST /api/driver/v1/work-sessions/17f421b1-a7aa-4030-adca-231487083e81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:54Z",
    "sequence": 1793289234504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:53:54.521657Z",
  "last_location_at": "2026-10-29T15:53:54.521657Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "18aec7d3-d657-496a-96f6-861562a59efc",
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "assignment_id": "98315dbc-bb0e-4cd8-b58b-38c8c93099de",
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

`POST /api/driver/v1/trips/18aec7d3-d657-496a-96f6-861562a59efc/arrive` → **200**

```json
{
  "command_id": "0a234010-347f-4c34-9b6d-2c6c95bb23de",
  "expected_version": 0
}
```

```json
{
  "id": "18aec7d3-d657-496a-96f6-861562a59efc",
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "assignment_id": "98315dbc-bb0e-4cd8-b58b-38c8c93099de",
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
  "arrived_at": "2026-10-29T15:53:54.977171Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/18aec7d3-d657-496a-96f6-861562a59efc/start` → **200**

```json
{
  "command_id": "9cfbfa4b-4732-49df-9129-7640ad2cb894",
  "expected_version": 1
}
```

```json
{
  "id": "18aec7d3-d657-496a-96f6-861562a59efc",
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "assignment_id": "98315dbc-bb0e-4cd8-b58b-38c8c93099de",
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
  "arrived_at": "2026-10-29T15:53:54.977171Z",
  "started_at": "2026-10-29T15:53:55.209188Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/17f421b1-a7aa-4030-adca-231487083e81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:53:55Z",
    "sequence": 1793289235442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:53:55.458836Z",
  "last_location_at": "2026-10-29T15:53:55.458836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/18aec7d3-d657-496a-96f6-861562a59efc/complete` → **200**

```json
{
  "command_id": "ef998acb-196a-4144-880c-9dadd20bd5c5",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:53:55Z",
  "cash_received": true
}
```

```json
{
  "id": "18aec7d3-d657-496a-96f6-861562a59efc",
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "assignment_id": "98315dbc-bb0e-4cd8-b58b-38c8c93099de",
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
  "arrived_at": "2026-10-29T15:53:54.977171Z",
  "started_at": "2026-10-29T15:53:55.209188Z",
  "completed_at": "2026-10-29T15:53:55.683412Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/eecca73e-088d-4a13-b67b-e1c07b1477c0/rating` → **200**

```json
{
  "command_id": "5b5da112-af0f-46fe-8470-fa038071b2c3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "score": 5,
  "created_at": "2026-10-29T15:53:55.931211608Z"
}
```

`POST /api/driver/v1/orders/eecca73e-088d-4a13-b67b-e1c07b1477c0/rating` → **200**

```json
{
  "command_id": "84df55d1-5043-4884-b056-80adbe5abde4",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
  "score": 4,
  "created_at": "2026-10-29T15:53:56.161713159Z"
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
  "session_id": "84f293bc-d60a-4a41-8a9b-242fc6c6ac13",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMzYsImlhdCI6MTc5MzI4OTIzNiwianRpIjoiNzBlY2ZlZDktZjVjOS00NjExLTlhNGEtZWQ1NTkyYjJmNTBhIiwic2lkIjoiODRmMjkzYmMtZDYwYS00YTQxLThhOWItMjQyZmM2YzZhYzEzIn0.UkkgGuw9UwhERINaITQKtIV1FVY7fVrZWzoCsiVECZ0",
  "access_expires_at": "2026-10-29T16:08:56.882518486Z",
  "refresh_token": "Rqw8gPqeVstqBVCujV2rReqrFIaGB6P0gjuZ9Ql0kFs",
  "refresh_expires_at": "2026-10-30T03:53:56.882072836Z",
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
  "session_id": "f61727ae-31fc-4b75-9b12-859568b9a589",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMzcsImlhdCI6MTc5MzI4OTIzNywianRpIjoiMjgxZWUwOGItMmFkNC00MzE4LTlkMGYtZjU0NmIyZDQ0OGIwIiwic2lkIjoiZjYxNzI3YWUtMzFmYy00Yjc1LTliMTItODU5NTY4YjlhNTg5In0.PPYcZEDX2fhfOSP1zmkNMnApAcv507a9xMMqerrgz1M",
  "access_expires_at": "2026-10-29T16:08:57.370633646Z",
  "refresh_token": "lfk7G-rL534WGmkn0Zoy8jqQpaaHEmOq11XZnvqZy68",
  "refresh_expires_at": "2026-10-30T03:53:57.370214064Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eecca73e-088d-4a13-b67b-e1c07b1477c0/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
      "author_type": "RIDER",
      "author_id": "ae525e08-fb98-4c9f-b7cf-a0cbd1bf43a9",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T15:53:55.931212Z"
    },
    {
      "order_id": "eecca73e-088d-4a13-b67b-e1c07b1477c0",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "ae525e08-fb98-4c9f-b7cf-a0cbd1bf43a9",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T15:53:56.161713Z"
    }
  ]
}
```

Done: ratings for order eecca73e-088d-4a13-b67b-e1c07b1477c0.

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
  "session_id": "8d81db09-aa49-4d93-8725-9d9ea50ede08",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxMzgsImlhdCI6MTc5MzI4OTIzOCwianRpIjoiNTFkNmNkZGQtMjgyOC00MDkxLWFhOTEtYmQ4MTk0ZWM0OTRlIiwic2lkIjoiOGQ4MWRiMDktYWE0OS00ZDkzLTg3MjUtOWQ5ZWE1MGVkZTA4In0.fFKv0TBtIgocrnPbZUIw6NzNvdticrGel6zXBz0vBFs",
  "access_expires_at": "2026-10-29T16:08:58.105307253Z",
  "refresh_token": "2zMwoRMl7Hr1lGkRi-ppzx2OeqBn0X8F7k61QR4nACg",
  "refresh_expires_at": "2026-10-30T03:53:58.104814352Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f6e3b905-c56d-46cf-bad5-8422df8efba6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "ab4859b5-e62a-451f-b2bf-9a9c161716c6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:58.340075Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab4859b5-e62a-451f-b2bf-9a9c161716c6` → **200**

```json
{
  "id": "ab4859b5-e62a-451f-b2bf-9a9c161716c6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:58.340075Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab4859b5-e62a-451f-b2bf-9a9c161716c6` → **200**

```json
{
  "id": "ab4859b5-e62a-451f-b2bf-9a9c161716c6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:53:58.340075Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab4859b5-e62a-451f-b2bf-9a9c161716c6` → **200**

```json
{
  "id": "ab4859b5-e62a-451f-b2bf-9a9c161716c6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:53:58.340075Z",
  "ready_at": "2026-10-29T15:53:59.851356Z",
  "expires_at": "2026-10-30T15:53:59.851356Z"
}
```

`GET /api/admin/v1/reports/exports/ab4859b5-e62a-451f-b2bf-9a9c161716c6/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "45f20c8c-b4ab-42e1-ac44-c8b12511733b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "501a1c71-b3a3-44b2-93cf-e478a4aedb0d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:54:01.285018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501a1c71-b3a3-44b2-93cf-e478a4aedb0d` → **200**

```json
{
  "id": "501a1c71-b3a3-44b2-93cf-e478a4aedb0d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:54:01.285018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501a1c71-b3a3-44b2-93cf-e478a4aedb0d` → **200**

```json
{
  "id": "501a1c71-b3a3-44b2-93cf-e478a4aedb0d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:54:01.285018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501a1c71-b3a3-44b2-93cf-e478a4aedb0d` → **200**

```json
{
  "id": "501a1c71-b3a3-44b2-93cf-e478a4aedb0d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:54:01.285018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/501a1c71-b3a3-44b2-93cf-e478a4aedb0d` → **200**

```json
{
  "id": "501a1c71-b3a3-44b2-93cf-e478a4aedb0d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:54:01.285018Z",
  "ready_at": "2026-10-29T15:54:04.8595Z",
  "expires_at": "2026-10-30T15:54:04.8595Z"
}
```

`GET /api/admin/v1/reports/exports/501a1c71-b3a3-44b2-93cf-e478a4aedb0d/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c86211cd-a4c2-4482-bde8-fa7c23cb9174` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c86211cd-a4c2-4482-bde8-fa7c23cb9174",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0551ce35-b0b3-4030-8752-4cf5a60e3bf6"
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
  "device_ref": "sandbox-14634"
}
```

```json
{
  "challenge_id": "1db5879b-54a5-4f61-903f-e82d825b6358",
  "expires_at": "2026-10-29T15:59:05.704040015Z",
  "resend_available_at": "2026-10-29T15:54:06.704040015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "235342",
  "sent_at": "2026-10-29T15:54:05.706146835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1db5879b-54a5-4f61-903f-e82d825b6358",
  "code": "235342",
  "device_ref": "sandbox-14634"
}
```

```json
{
  "session_id": "b8fe16d5-55fa-4b19-88d8-8eed9220c8d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE0NSwiaWF0IjoxNzkzMjg5MjQ1LCJqdGkiOiI3MDA4NjM2MS1mY2EwLTRjOWMtYTVkYi0xZjAyMTVmYmRlMzQiLCJzaWQiOiJiOGZlMTZkNS01NWZhLTRiMTktODhkOC04ZWVkOTIyMGM4ZDkifQ.IjipSdEDWEgR-sT2CXtFcwcMSj68aCQd2t2odjD9uS0",
  "access_expires_at": "2026-10-29T16:09:05.953258467Z",
  "refresh_token": "qzUmgEFIeVw-X7QUbBqT4bcPwhUxueQmiOwHTQj2cCw",
  "refresh_expires_at": "2026-11-28T15:54:05.952640645Z",
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
  "command_id": "77796ff4-9280-4d45-8c32-53e14c8fdfa6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:54:06Z",
    "sequence": 1793289246618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b90c9555-ee61-4057-a671-8cee2ec25b0e",
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
  "last_heartbeat_at": "2026-10-29T15:54:06.634389Z",
  "last_location_at": "2026-10-29T15:54:06.634389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "2e83c363-db3d-41b1-bb9d-ba16d1b762ef",
  "points": [
    {
      "sequence": 1793289248865,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:53:08Z"
    },
    {
      "sequence": 1793289248871,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:54:08Z"
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
  "session_id": "ad0a503a-1354-4c07-8cbd-aff6f432346f",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNDksImlhdCI6MTc5MzI4OTI0OSwianRpIjoiNTAzOTE0NjQtY2ViZS00ZGE2LTlhZDMtYzAzZTFkYTc0YmVmIiwic2lkIjoiYWQwYTUwM2EtMTM1NC00YzA3LThjYmQtYWZmNmY0MzIzNDZmIn0.K-Xn6K6HebztvTqFAHrDyC_PNixH29CpGqLwteT7fpg",
  "access_expires_at": "2026-10-29T16:09:09.404985001Z",
  "refresh_token": "ukYezyuOMzbqxb0hpPqLXcVaJ31tHvygemaDHPNZP_Y",
  "refresh_expires_at": "2026-10-30T03:54:09.404460944Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "34d3e0e0-d653-43f7-b0c6-bdf782a218c5",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T15:54:08Z",
        "track_point_id": "f6ccb5c2-f4dc-4e2d-92f2-507383b84f13",
        "work_session_id": "b90c9555-ee61-4057-a671-8cee2ec25b0e"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T15:54:08Z",
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

`POST /api/admin/v1/driver-risk-flags/34d3e0e0-d653-43f7-b0c6-bdf782a218c5/confirm` → **200**

```json
{
  "command_id": "23948def-39c4-4fde-aeab-71c6bd0944e2",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "34d3e0e0-d653-43f7-b0c6-bdf782a218c5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T15:54:08Z",
    "track_point_id": "f6ccb5c2-f4dc-4e2d-92f2-507383b84f13",
    "work_session_id": "b90c9555-ee61-4057-a671-8cee2ec25b0e"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T15:54:08Z",
  "reason": null,
  "reviewed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reviewed_at": "2026-10-29T15:54:10.128374Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/34d3e0e0-d653-43f7-b0c6-bdf782a218c5/dismiss` → **409**

```json
{
  "command_id": "33910dd2-ee6f-4755-85b1-aba9105f3360",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/34d3e0e0-d653-43f7-b0c6-bdf782a218c5/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "64589414-8e26-458c-99c0-501e3a9f0682"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e4ed0615-30b2-42f3-8104-38a764e143e5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "bd4fdc67-cfd7-45e0-92af-22e0b6924983",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "raised_at": "2026-10-29T15:54:10.613733Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/bd4fdc67-cfd7-45e0-92af-22e0b6924983/dismiss` → **200**

```json
{
  "command_id": "9b507f12-f9e7-48e1-9606-b324dc5a505b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "bd4fdc67-cfd7-45e0-92af-22e0b6924983",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "raised_at": "2026-10-29T15:54:10.613733Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reviewed_at": "2026-10-29T15:54:10.847021Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "8cc2efe2-58e6-46ac-bcbd-52b2b1ea183b",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "34d3e0e0-d653-43f7-b0c6-bdf782a218c5"
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
      "actor_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:54:11.082864Z"
    }
  ]
}
```

Done: flag 34d3e0e0-d653-43f7-b0c6-bdf782a218c5 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d8f6c4d7-dade-4f9b-85ad-5ca917f8c06f",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNTEsImlhdCI6MTc5MzI4OTI1MSwianRpIjoiZjhkZWI1NDctNThlNS00YWNmLWE1ZGEtMGEwMTZhYzUzZDgzIiwic2lkIjoiZDhmNmM0ZDctZGFkZS00ZjliLTg1YWQtNWNhOTE3ZjhjMDZmIn0.zZrvwFMr4ChuxKo_-iPCKv0MnoHq-BtqI6ffYED87c8",
  "access_expires_at": "2026-10-29T16:09:11.819207297Z",
  "refresh_token": "wLZ9WXVkhA2Z7mF5qyFDbkjV1PpgU1x2PnASQwG2toM",
  "refresh_expires_at": "2026-10-30T03:54:11.818740766Z",
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
      "actor_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:54:11.082864Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5ec2aeee-29ec-4e8e-a236-3b889e58ea4f",
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
  "session_id": "b90c9555-ee61-4057-a671-8cee2ec25b0e",
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
  "last_heartbeat_at": "2026-10-29T15:54:06.634389Z",
  "last_location_at": "2026-10-29T15:54:06.634389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b90c9555-ee61-4057-a671-8cee2ec25b0e/close` → **200**

```json
{
  "command_id": "e946a998-ec86-4007-8e07-1c10b5dbf856",
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
  "session_id": "f0ef763a-001b-4a31-9d55-132079e9b467",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNTMsImlhdCI6MTc5MzI4OTI1MywianRpIjoiYzVhYjY5YTgtNmEzMC00YWMzLWE4NzctMDM3NjlmMjM5YzdjIiwic2lkIjoiZjBlZjc2M2EtMDAxYi00YTMxLTlkNTUtMTMyMDc5ZTliNDY3In0.AZO-ag89NLAeG6-UZOSOl-WGCIr5xXW9FE-3GS_YYe4",
  "access_expires_at": "2026-10-29T16:09:13.243251127Z",
  "refresh_token": "QN4V9SKK0kZtwuGku6jyiZwM1TOvbimEWIC2jnJSt5o",
  "refresh_expires_at": "2026-10-30T03:54:13.242797745Z",
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
  "command_id": "daeb433e-3847-4ce2-833b-c52b6fb81e95",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:54:13.723594Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "daeb433e-3847-4ce2-833b-c52b6fb81e95",
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
  "changed_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:54:13.723594Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48845619334",
  "device_ref": "sandbox-4622"
}
```

```json
{
  "challenge_id": "4bd9991a-2cad-4dd1-bd98-efb76083bb34",
  "expires_at": "2026-10-29T15:59:14.198285714Z",
  "resend_available_at": "2026-10-29T15:54:15.198285714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48845619334` → **200**

```json
{
  "phone": "+48845619334",
  "audience": "CLIENT",
  "code": "126415",
  "sent_at": "2026-10-29T15:54:14.200151275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bd9991a-2cad-4dd1-bd98-efb76083bb34",
  "code": "126415",
  "device_ref": "sandbox-4622"
}
```

```json
{
  "session_id": "598c4924-711c-4665-9762-5d833d20f423",
  "subject": {
    "type": "CLIENT",
    "id": "04d810b8-c025-430b-b3fd-ab6c14922872"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGQ4MTBiOC1jMDI1LTQzMGItYjNmZC1hYjZjMTQ5MjI4NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTU0LCJpYXQiOjE3OTMyODkyNTQsImp0aSI6IjdiY2Q5NWIzLWVmMTEtNDY4Zi1iMmZmLWY5NmZlZDRlNThlNyIsInNpZCI6IjU5OGM0OTI0LTcxMWMtNDY2NS05NzYyLTVkODMzZDIwZjQyMyJ9.YWqovozQ4IxhSxaoBxTclUska_wKEyoSoIGdF0EMZvc",
  "access_expires_at": "2026-10-29T16:09:14.451525949Z",
  "refresh_token": "F3SdUWDVtwqafIRKZHgDfQ7O8oNvyw7pYudEq72s598",
  "refresh_expires_at": "2026-11-28T15:54:14.451117153Z",
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
  "correlation_id": "4bcde183-7eee-42b8-a4ea-64a2ac8ba416"
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
  "device_ref": "sandbox-26804"
}
```

```json
{
  "challenge_id": "90007c9f-fd3a-4cb3-a0c8-2760e90ed97a",
  "expires_at": "2026-10-29T15:59:15.143257582Z",
  "resend_available_at": "2026-10-29T15:54:16.143257582Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "683689",
  "sent_at": "2026-10-29T15:54:15.145407619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90007c9f-fd3a-4cb3-a0c8-2760e90ed97a",
  "code": "683689",
  "device_ref": "sandbox-26804"
}
```

```json
{
  "session_id": "c800eadf-3a09-4fcb-9b7b-0918a01c7ec1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE1NSwiaWF0IjoxNzkzMjg5MjU1LCJqdGkiOiJjZTEyNWJmMi0wNDdmLTRhYzItYWJkYS0zNWExYTFlNDhkNjYiLCJzaWQiOiJjODAwZWFkZi0zYTA5LTRmY2ItOWI3Yi0wOTE4YTAxYzdlYzEifQ.2_cr_7CEkpIy0x8InbDAXG_UibxnpqpmOtURLQ0rdMM",
  "access_expires_at": "2026-10-29T16:09:15.405972166Z",
  "refresh_token": "EhSyT0uuBlJamI-tfoUsBcqYGvT-p7a6D4yLtO17oUg",
  "refresh_expires_at": "2026-11-28T15:54:15.405498224Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a60dceab-5e17-4bcb-b108-ac7fdc808fd5",
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
  "last_heartbeat_at": "2026-10-29T15:53:49.520272Z",
  "last_location_at": "2026-10-29T15:53:49.520272Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a60dceab-5e17-4bcb-b108-ac7fdc808fd5/handover` → **200**

```json
{
  "command_id": "625ca975-6f6f-4e9e-acb2-ae8c726e43a7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a60dceab-5e17-4bcb-b108-ac7fdc808fd5",
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
  "last_heartbeat_at": "2026-10-29T15:53:49.520272Z",
  "last_location_at": "2026-10-29T15:53:49.520272Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a60dceab-5e17-4bcb-b108-ac7fdc808fd5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:54:16Z",
    "sequence": 1793289256108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "a60dceab-5e17-4bcb-b108-ac7fdc808fd5",
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
  "last_heartbeat_at": "2026-10-29T15:54:16.125357Z",
  "last_location_at": "2026-10-29T15:54:16.125357Z",
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
  "session_id": "a60dceab-5e17-4bcb-b108-ac7fdc808fd5",
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
  "last_heartbeat_at": "2026-10-29T15:54:16.125357Z",
  "last_location_at": "2026-10-29T15:54:16.125357Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a60dceab-5e17-4bcb-b108-ac7fdc808fd5/close` → **200**

```json
{
  "command_id": "c88c6ae2-f3a0-4243-90b0-adb284b27a9d",
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
  "correlation_id": "150293bc-7dbc-44a2-8126-a3683958f0ee"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674306219",
  "device_ref": "sandbox-22299"
}
```

```json
{
  "challenge_id": "1b8b0342-6b59-44db-901f-1b4683f7b9fc",
  "expires_at": "2026-10-29T15:59:17.303742808Z",
  "resend_available_at": "2026-10-29T15:54:18.303742808Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674306219` → **200**

```json
{
  "phone": "+380674306219",
  "audience": "CLIENT",
  "code": "237389",
  "sent_at": "2026-10-29T15:54:17.305805966Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b8b0342-6b59-44db-901f-1b4683f7b9fc",
  "code": "237389",
  "device_ref": "sandbox-22299"
}
```

```json
{
  "session_id": "bf7216b0-0312-4200-8be1-003debc5666f",
  "subject": {
    "type": "CLIENT",
    "id": "c002a13a-de5c-43c7-b0dc-97268f8d0438"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDAyYTEzYS1kZTVjLTQzYzctYjBkYy05NzI2OGY4ZDA0MzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTU3LCJpYXQiOjE3OTMyODkyNTcsImp0aSI6IjRjNjM2YTE2LWFmOTgtNDg1Yi04ZDc5LWQzNTQzYjI1ODkzNCIsInNpZCI6ImJmNzIxNmIwLTAzMTItNDIwMC04YmUxLTAwM2RlYmM1NjY2ZiJ9.o9-NG8T3K4NrhyK-ArD6XH7KjqFSaBHElNRt5YoEcfA",
  "access_expires_at": "2026-10-29T16:09:17.553490186Z",
  "refresh_token": "C3tF-I5wqQmKEmYp5pj32PQLtLP3r5Ups2NuJpac9cM",
  "refresh_expires_at": "2026-11-28T15:54:17.553077674Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "c744f3ae-81b3-44fb-9bb5-38be7c8a15c3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "31db5906-a806-420f-a961-c95596054473",
  "upload_path": "/api/rider/v1/uploads/31db5906-a806-420f-a961-c95596054473",
  "expires_at": "2026-10-29T16:09:17.786207826Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/31db5906-a806-420f-a961-c95596054473` → **200**

```json
{
  "file_id": "31db5906-a806-420f-a961-c95596054473",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "c47ed211-881f-4f45-934e-a8b0539e6e47",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "31db5906-a806-420f-a961-c95596054473"
  ]
}
```

```json
{
  "id": "daad46a4-f038-4062-8dd5-59022163153f",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:54:18.044192Z",
  "updated_at": "2026-10-29T15:54:18.044192Z",
  "respond_by": "2026-10-29T19:54:18.044192Z",
  "messages": [
    {
      "id": "60694c62-9356-40f4-9d39-78973559f26b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:54:18.044834Z",
      "attachments": [
        {
          "file_id": "31db5906-a806-420f-a961-c95596054473",
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
  "session_id": "2a58825d-6180-4cf5-85a3-18a7a179bee0",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNTgsImlhdCI6MTc5MzI4OTI1OCwianRpIjoiNTc4Mzc2OGUtNjAxOC00ODUyLTk5OGQtNTUwOWJmNTY4ZTgxIiwic2lkIjoiMmE1ODgyNWQtNjE4MC00Y2Y1LTg1YTMtMThhN2ExNzliZWUwIn0.Ii5HuFtpclTD0KmWU56Ud80xeE-MYHulig92JRpIX1w",
  "access_expires_at": "2026-10-29T16:09:18.548227284Z",
  "refresh_token": "nv6tqsBRMzxJdnlZx_r3fbuyeKU_3P1J9x9BoUT0obY",
  "refresh_expires_at": "2026-10-30T03:54:18.54781303Z",
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
  "session_id": "df0e7a0e-8adf-4224-b4db-8c302293c7cd",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNTksImlhdCI6MTc5MzI4OTI1OSwianRpIjoiYjE3NmQyNzctZTA2OC00NTVhLTk4N2MtZDUzMWU5YmI1MTg3Iiwic2lkIjoiZGYwZTdhMGUtOGFkZi00MjI0LWI0ZGItOGMzMDIyOTNjN2NkIn0.MUbj-YIUU1JtS0yaFtIFtsfsDSMD0mcnbOZacNMnMD0",
  "access_expires_at": "2026-10-29T16:09:19.038534538Z",
  "refresh_token": "eWCI9V1_BrR7YtvKzzNOk-bgYsiryor9FlBZsT_s-hQ",
  "refresh_expires_at": "2026-10-30T03:54:19.038105662Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/daad46a4-f038-4062-8dd5-59022163153f/attachments/31db5906-a806-420f-a961-c95596054473` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c21e85b9-9744-4517-a9b5-e4203bd64dc7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1d230120-bd85-4c69-8a2e-8826dee372e1",
  "upload_path": "/api/operator/v1/uploads/1d230120-bd85-4c69-8a2e-8826dee372e1",
  "expires_at": "2026-10-29T16:09:19.283886154Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/1d230120-bd85-4c69-8a2e-8826dee372e1` → **200**

```json
{
  "file_id": "1d230120-bd85-4c69-8a2e-8826dee372e1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/daad46a4-f038-4062-8dd5-59022163153f` → **200**

```json
{
  "id": "daad46a4-f038-4062-8dd5-59022163153f",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:54:18.044192Z",
  "updated_at": "2026-10-29T15:54:18.044192Z",
  "respond_by": "2026-10-29T19:54:18.044192Z",
  "messages": [
    {
      "id": "60694c62-9356-40f4-9d39-78973559f26b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:54:18.044834Z",
      "attachments": [
        {
          "file_id": "31db5906-a806-420f-a961-c95596054473",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/daad46a4-f038-4062-8dd5-59022163153f/comments` → **200**

```json
{
  "command_id": "5d7300bb-7201-4a15-8c2a-68ee7005b84b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "1d230120-bd85-4c69-8a2e-8826dee372e1"
  ]
}
```

```json
{
  "id": "daad46a4-f038-4062-8dd5-59022163153f",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:54:18.044192Z",
  "updated_at": "2026-10-29T15:54:19.787828Z",
  "respond_by": "2026-10-29T19:54:18.044192Z",
  "messages": [
    {
      "id": "60694c62-9356-40f4-9d39-78973559f26b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:54:18.044834Z",
      "attachments": [
        {
          "file_id": "31db5906-a806-420f-a961-c95596054473",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6ec250ea-18c4-4aec-9ab7-a73c9633cbbf",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:54:19.787467Z",
      "attachments": [
        {
          "file_id": "1d230120-bd85-4c69-8a2e-8826dee372e1",
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

`GET /api/rider/v1/support/cases/daad46a4-f038-4062-8dd5-59022163153f` → **200**

```json
{
  "id": "daad46a4-f038-4062-8dd5-59022163153f",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:54:18.044192Z",
  "updated_at": "2026-10-29T15:54:19.787828Z",
  "respond_by": "2026-10-29T19:54:18.044192Z",
  "messages": [
    {
      "id": "60694c62-9356-40f4-9d39-78973559f26b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c002a13a-de5c-43c7-b0dc-97268f8d0438",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:54:18.044834Z",
      "attachments": [
        {
          "file_id": "31db5906-a806-420f-a961-c95596054473",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6ec250ea-18c4-4aec-9ab7-a73c9633cbbf",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:54:19.787467Z",
      "attachments": [
        {
          "file_id": "1d230120-bd85-4c69-8a2e-8826dee372e1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/daad46a4-f038-4062-8dd5-59022163153f/attachments/1d230120-bd85-4c69-8a2e-8826dee372e1` → **200**

Done: support case daad46a4-f038-4062-8dd5-59022163153f, rider attachment 31db5906-a806-420f-a961-c95596054473, operator attachment 1d230120-bd85-4c69-8a2e-8826dee372e1.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738542523",
  "device_ref": "sandbox-14696"
}
```

```json
{
  "challenge_id": "20065879-6d4e-46df-9161-3abb788678a5",
  "expires_at": "2026-10-29T15:59:20.299807653Z",
  "resend_available_at": "2026-10-29T15:54:21.299807653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738542523` → **200**

```json
{
  "phone": "+380738542523",
  "audience": "CLIENT",
  "code": "434438",
  "sent_at": "2026-10-29T15:54:20.301874668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20065879-6d4e-46df-9161-3abb788678a5",
  "code": "434438",
  "device_ref": "sandbox-14696"
}
```

```json
{
  "session_id": "64dfa535-9b20-4299-a393-f7130adb200c",
  "subject": {
    "type": "CLIENT",
    "id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODAyOWU2NC0xZDhjLTRiMWUtYmFjYS0zZTRiYjFmMzFjN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTYwLCJpYXQiOjE3OTMyODkyNjAsImp0aSI6ImNlM2VkMTlmLTNjMjEtNDdmNS04MTk4LTg0ODJlMDZlZTFlMSIsInNpZCI6IjY0ZGZhNTM1LTliMjAtNDI5OS1hMzkzLWY3MTMwYWRiMjAwYyJ9.7HsTp2pN94matNlQ0FYLz0hYWwZfWRHzjM6siodXFy0",
  "access_expires_at": "2026-10-29T16:09:20.560186142Z",
  "refresh_token": "YX5FEcg56JiTIonW7w46c1kv6o2DERYLJP-ukaa2Wxo",
  "refresh_expires_at": "2026-11-28T15:54:20.559712439Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "11e92c7d-6c23-4c8f-b5e5-cc4c1312bec5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "76a36ba7-3b13-402c-ae73-ffcffde54e89",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-76a36ba7-3b13-402c-ae73-ffcffde54e89",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0ea933226227f2a5723b4d24412b55c0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=76a36ba7-3b13-402c-ae73-ffcffde54e89",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738542523"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=76a36ba7-3b13-402c-ae73-ffcffde54e89",
  "expires_at": "2026-10-29T16:24:20.798619Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/76a36ba7-3b13-402c-ae73-ffcffde54e89` → **200**

```json
{
  "id": "76a36ba7-3b13-402c-ae73-ffcffde54e89",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:24:20.798619Z",
  "card": {
    "id": "5dc39b7e-dc67-43bf-9042-f7c3ba79deee",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0127",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:54:21.029864Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cd1c273c-2f3d-4a48-ab0d-a439d0351115",
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
  "id": "170ac923-053f-420a-ba40-5dd65ef557dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:59:21.285636Z",
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
  "command_id": "f19bebb2-910a-4919-9529-47d4593a101f",
  "quote_id": "170ac923-053f-420a-ba40-5dd65ef557dc",
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
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4` → **200**

```json
{
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4` → **200**

```json
{
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
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

`GET /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4` → **200**

```json
{
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4/switch-to-cash` → **200**

```json
{
  "command_id": "d122b390-1fda-4eed-a478-38642d64552c",
  "expected_version": 3
}
```

```json
{
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4/switch-to-cash` → **409**

```json
{
  "command_id": "18030e53-7241-418a-a18e-0eefe7ff63a4",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0bd6258f-3cc8-4752-abf4-765b18a61759"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4` → **200**

```json
{
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/25c4797c-d3ee-456b-9a3f-1ab449f985b4/cancel` → **200**

```json
{
  "command_id": "dd5db313-f57f-435d-82cc-888b69e3d136",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "25c4797c-d3ee-456b-9a3f-1ab449f985b4",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "28029e64-1d8c-4b1e-baca-3e4bb1f31c7f",
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
  "created_at": "2026-10-29T15:54:21.529562Z",
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
  "session_id": "82513a81-ffb6-4241-b6d1-f9a620dd54da",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNjQsImlhdCI6MTc5MzI4OTI2NCwianRpIjoiODM5NzYyODgtYTIyMC00NzRiLTg2MTUtYmIzMzUzYmJhY2E4Iiwic2lkIjoiODI1MTNhODEtZmZiNi00MjQxLWI2ZDEtZjlhNjIwZGQ1NGRhIn0.q9oOSvnBRqTa8UOYF7aT-m_yk0kIgzpV_HJ3ZjhKX_Q",
  "access_expires_at": "2026-10-29T16:09:24.702618282Z",
  "refresh_token": "-WrAjFYZvaotr7CCjUYbHx1arL81dz592OI5kfMZcYQ",
  "refresh_expires_at": "2026-10-30T03:54:24.702215866Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31538"
}
```

```json
{
  "challenge_id": "9375a559-396f-4d87-a114-b10be977ef0b",
  "expires_at": "2026-10-29T15:59:24.924177657Z",
  "resend_available_at": "2026-10-29T15:54:25.924177657Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "313710",
  "sent_at": "2026-10-29T15:54:24.927522726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9375a559-396f-4d87-a114-b10be977ef0b",
  "code": "313710",
  "device_ref": "sandbox-31538"
}
```

```json
{
  "session_id": "54788f77-59be-467f-b5ee-09cf8ea5c6bf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE2NSwiaWF0IjoxNzkzMjg5MjY1LCJqdGkiOiIzNGRlMTVmZC0zNzEyLTRlZjYtYWVlNC00ZGQ0ZTVlZGY0NDciLCJzaWQiOiI1NDc4OGY3Ny01OWJlLTQ2N2YtYjVlZS0wOWNmOGVhNWM2YmYifQ.n2LDEizKKKAYVEnfD9VqPByBqKqDEhdDiEqd63KZUqA",
  "access_expires_at": "2026-10-29T16:09:25.175371754Z",
  "refresh_token": "O7woNbYI9Stv4oAZEdmEavY7kjyhqGvfF6wEuB4rG7c",
  "refresh_expires_at": "2026-11-28T15:54:25.17491081Z",
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
      "actor_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:54:11.082864Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T15:54:12.291993Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c309841c-677f-48ae-a5e9-eb217ccd6e92",
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
  "device_ref": "sandbox-12828"
}
```

```json
{
  "challenge_id": "53225cf6-cd5c-4192-a0a9-360ddca6c248",
  "expires_at": "2026-10-29T15:59:26.103115537Z",
  "resend_available_at": "2026-10-29T15:54:27.103115537Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "401596",
  "sent_at": "2026-10-29T15:54:26.105445492Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53225cf6-cd5c-4192-a0a9-360ddca6c248",
  "code": "401596",
  "device_ref": "sandbox-12828"
}
```

```json
{
  "session_id": "9b620f77-c9b3-4071-8429-858e7f89881e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE2NiwiaWF0IjoxNzkzMjg5MjY2LCJqdGkiOiJiNzk0YjQ4OC1hYjk5LTQxYzMtOTljZS1jM2U5YjRiNmYwNDYiLCJzaWQiOiI5YjYyMGY3Ny1jOWIzLTQwNzEtODQyOS04NThlN2Y4OTg4MWUifQ.1k_Wdg77ok47dhJAWEw3peaMkVPS5sagSYdA4PuRMu8",
  "access_expires_at": "2026-10-29T16:09:26.351082394Z",
  "refresh_token": "FJy1um9XZ6P7uIacyCMv7RR032XE2MfUffPmaHhNcHY",
  "refresh_expires_at": "2026-11-28T15:54:26.350646147Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:53:55.458836Z",
  "last_location_at": "2026-10-29T15:53:55.458836Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/17f421b1-a7aa-4030-adca-231487083e81/handover` → **200**

```json
{
  "command_id": "d5c90111-daff-401d-b805-170ee09e5d3f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:53:55.458836Z",
  "last_location_at": "2026-10-29T15:53:55.458836Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/17f421b1-a7aa-4030-adca-231487083e81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:54:27Z",
    "sequence": 1793289267265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:54:27.042281Z",
  "last_location_at": "2026-10-29T15:54:27.042281Z",
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
  "command_id": "91341b2c-d4eb-4624-91c0-9e2decce68ed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:54:27Z",
    "sequence": 1793289267484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "117db13a-87a4-4870-8ba6-98a21fc414cd",
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
  "last_heartbeat_at": "2026-10-29T15:54:27.500543Z",
  "last_location_at": "2026-10-29T15:54:27.500543Z",
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
  "session_id": "84ba82cf-5527-4038-9125-7188959d9f11",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAxNjcsImlhdCI6MTc5MzI4OTI2NywianRpIjoiYjUwNjA0YzYtYWViOC00MGJhLWE5Y2QtMWQ2YjQ5NTIxYTNkIiwic2lkIjoiODRiYTgyY2YtNTUyNy00MDM4LTkxMjUtNzE4ODk1OWQ5ZjExIn0.4s7_Bn9FS0C2omZ4P3R9SX33z-esI72Mqx1CGiEPtZ0",
  "access_expires_at": "2026-10-29T16:09:27.994001886Z",
  "refresh_token": "eAslA3TQszFvkuUrhOE-msoDKhcREtfp6sh_g2b5Dvk",
  "refresh_expires_at": "2026-10-30T03:54:27.993576245Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5b29e08a-42c3-46cc-a893-4dda3fd008db",
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
  "id": "a7c0f045-29b2-42a0-8b64-542ece76aad1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:59:28.228719Z",
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
  "command_id": "490dadef-39bb-4d35-a308-f4a33036c4f1",
  "quote_id": "a7c0f045-29b2-42a0-8b64-542ece76aad1",
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
  "id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
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
  "created_at": "2026-10-29T15:54:28.466876Z",
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
    "id": "ec859bab-3ea9-4a2a-a858-da12694049b4",
    "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
    "expires_at": "2026-10-29T15:54:43.469836Z",
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

`POST /api/driver/v1/offers/ec859bab-3ea9-4a2a-a858-da12694049b4/accept` → **200**

```json
{
  "command_id": "eca50dce-1eaa-4db9-982c-552146e19e64"
}
```

```json
{
  "id": "56157af3-10d5-497a-a32b-75cddedac4b3",
  "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4b368caa-6e28-462c-9f02-49ed6b9b5dfe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4b368caa-6e28-462c-9f02-49ed6b9b5dfe",
  "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
  "assignment_id": "56157af3-10d5-497a-a32b-75cddedac4b3",
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

`POST /api/driver/v1/work-sessions/117db13a-87a4-4870-8ba6-98a21fc414cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:54:29Z",
    "sequence": 1793289269617
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "117db13a-87a4-4870-8ba6-98a21fc414cd",
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
  "last_heartbeat_at": "2026-10-29T15:54:29.634825Z",
  "last_location_at": "2026-10-29T15:54:29.634825Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4b368caa-6e28-462c-9f02-49ed6b9b5dfe/arrive` → **200**

```json
{
  "command_id": "6f16cd81-8934-4a57-8485-c3b4712c7690",
  "expected_version": 0
}
```

```json
{
  "id": "4b368caa-6e28-462c-9f02-49ed6b9b5dfe",
  "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
  "assignment_id": "56157af3-10d5-497a-a32b-75cddedac4b3",
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
  "arrived_at": "2026-10-29T15:54:29.867349Z",
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

`POST /api/driver/v1/trips/4b368caa-6e28-462c-9f02-49ed6b9b5dfe/start` → **200**

```json
{
  "command_id": "c0166720-868d-4dbc-948b-c45f1e774b4f",
  "expected_version": 1
}
```

```json
{
  "id": "4b368caa-6e28-462c-9f02-49ed6b9b5dfe",
  "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
  "assignment_id": "56157af3-10d5-497a-a32b-75cddedac4b3",
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
  "arrived_at": "2026-10-29T15:54:29.867349Z",
  "started_at": "2026-10-29T15:54:30.113889Z",
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

`POST /api/driver/v1/trips/4b368caa-6e28-462c-9f02-49ed6b9b5dfe/complete` → **200**

```json
{
  "command_id": "2f1878d6-f286-4803-bccd-64f743a51602",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:54:30Z",
  "cash_received": true
}
```

```json
{
  "id": "4b368caa-6e28-462c-9f02-49ed6b9b5dfe",
  "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
  "assignment_id": "56157af3-10d5-497a-a32b-75cddedac4b3",
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
  "arrived_at": "2026-10-29T15:54:29.867349Z",
  "started_at": "2026-10-29T15:54:30.113889Z",
  "completed_at": "2026-10-29T15:54:30.358301Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/de998a26-e5b4-460a-be4f-2d3fc39795df` → **200**

```json
{
  "id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
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
    "id": "56157af3-10d5-497a-a32b-75cddedac4b3",
    "order_id": "de998a26-e5b4-460a-be4f-2d3fc39795df",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4b368caa-6e28-462c-9f02-49ed6b9b5dfe",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:54:28.466876Z",
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
  "session_id": "17f421b1-a7aa-4030-adca-231487083e81",
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
  "last_heartbeat_at": "2026-10-29T15:54:27.042281Z",
  "last_location_at": "2026-10-29T15:54:27.042281Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17f421b1-a7aa-4030-adca-231487083e81/close` → **200**

```json
{
  "command_id": "029cad9c-fa1a-43b9-ac4b-aaea7e10061a",
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
  "session_id": "117db13a-87a4-4870-8ba6-98a21fc414cd",
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
  "last_heartbeat_at": "2026-10-29T15:54:29.634825Z",
  "last_location_at": "2026-10-29T15:54:29.634825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/117db13a-87a4-4870-8ba6-98a21fc414cd/close` → **200**

```json
{
  "command_id": "9b6ef2a1-8cbf-4fcd-ad0c-af667a70818d",
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

Done: terminal order de998a26-e5b4-460a-be4f-2d3fc39795df by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24485"
}
```

```json
{
  "challenge_id": "e01fb0ef-2342-4f6a-b195-6f48cfc2231c",
  "expires_at": "2026-10-29T15:59:35.000813399Z",
  "resend_available_at": "2026-10-29T15:54:36.000813399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "733929",
  "sent_at": "2026-10-29T15:54:35.003401446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e01fb0ef-2342-4f6a-b195-6f48cfc2231c",
  "code": "733929",
  "device_ref": "sandbox-24485"
}
```

```json
{
  "session_id": "524bb885-6ac2-4bab-8465-60aa08cd2444",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE3NSwiaWF0IjoxNzkzMjg5Mjc1LCJqdGkiOiIyZWZjZWZiZS05N2Q2LTRhZDItYTU4My04ZGFhMzNiNDBkYTMiLCJzaWQiOiI1MjRiYjg4NS02YWMyLTRiYWItODQ2NS02MGFhMDhjZDI0NDQifQ.nmMHuxlq_4bV5eVT1piwdmEYdJiE4NTUe8iljZnofjE",
  "access_expires_at": "2026-10-29T16:09:35.247523528Z",
  "refresh_token": "Fa7jRMq-bvTRyM123RjOSuB6-PSqIZXrTRR_spKJp1g",
  "refresh_expires_at": "2026-11-28T15:54:35.24712066Z",
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
  "device_ref": "sandbox-17654"
}
```

```json
{
  "challenge_id": "1ed19d08-72a6-48c6-86b1-cff8a448e8a3",
  "expires_at": "2026-10-29T15:59:35.68925788Z",
  "resend_available_at": "2026-10-29T15:54:36.68925788Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "204592",
  "sent_at": "2026-10-29T15:54:35.691283954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ed19d08-72a6-48c6-86b1-cff8a448e8a3",
  "code": "204592",
  "device_ref": "sandbox-17654"
}
```

```json
{
  "session_id": "b92d55fe-0215-4c03-9aa6-b61e81b680f8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE3NSwiaWF0IjoxNzkzMjg5Mjc1LCJqdGkiOiI5M2YzNTgwMi0yNGViLTQxYWMtODIxZi03NDQ5NjU2Zjg1ZWUiLCJzaWQiOiJiOTJkNTVmZS0wMjE1LTRjMDMtOWFhNi1iNjFlODFiNjgwZjgifQ.MomVNbpDsF2YoCoyL5oMoVWSDW6eTTLH7jHwXvkS5Gs",
  "access_expires_at": "2026-10-29T16:09:35.945790225Z",
  "refresh_token": "NeiC7K7OesKKeKKhlNCt5m0RfiT0ctG2txnNhSsAuUU",
  "refresh_expires_at": "2026-11-28T15:54:35.945421859Z",
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
  "device_ref": "sandbox-29713"
}
```

```json
{
  "challenge_id": "4eb2e08a-a149-4d38-91dd-cb766e4a08f5",
  "expires_at": "2026-10-29T15:59:36.396285082Z",
  "resend_available_at": "2026-10-29T15:54:37.396285082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "467413",
  "sent_at": "2026-10-29T15:54:36.398495259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4eb2e08a-a149-4d38-91dd-cb766e4a08f5",
  "code": "467413",
  "device_ref": "sandbox-29713"
}
```

```json
{
  "session_id": "1bc4ee09-d20c-4b52-9538-4dbb0a2a8c9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDE3NiwiaWF0IjoxNzkzMjg5Mjc2LCJqdGkiOiJhYWNkMzhkZi1lMGViLTQyZGItYjI0My1jMWNlNTJiOTBiNGIiLCJzaWQiOiIxYmM0ZWUwOS1kMjBjLTRiNTItOTUzOC00ZGJiMGEyYThjOWEifQ.YRcFoc-uqANmNMOQt_ygnZL9cGFAhTFesMtwuiJ3KpU",
  "access_expires_at": "2026-10-29T16:09:36.64558847Z",
  "refresh_token": "4Ok1zkwGOhnrjkRQSmsFTG3S0Tzjqm3O1fplYTfcsp8",
  "refresh_expires_at": "2026-11-28T15:54:36.645164928Z",
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
  "phone": "+380698880819",
  "device_ref": "sandbox-21506"
}
```

```json
{
  "challenge_id": "4931277c-7707-4780-b380-0eeb78a4be28",
  "expires_at": "2026-10-29T15:59:37.095461634Z",
  "resend_available_at": "2026-10-29T15:54:38.095461634Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380698880819` → **200**

```json
{
  "phone": "+380698880819",
  "audience": "CLIENT",
  "code": "728463",
  "sent_at": "2026-10-29T15:54:37.097450163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4931277c-7707-4780-b380-0eeb78a4be28",
  "code": "728463",
  "device_ref": "sandbox-21506"
}
```

```json
{
  "session_id": "9d84947b-c282-4d47-87da-f7e6559d59aa",
  "subject": {
    "type": "CLIENT",
    "id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTYzYmFkYy0wYzNlLTRlNGItYjZjNi0yZjc1OTZmZjk5MGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMTc3LCJpYXQiOjE3OTMyODkyNzcsImp0aSI6ImE2NTE4NGE0LTJmYzYtNGNjOC05YmIxLTI0ZTFkZDQ5MWI1NCIsInNpZCI6IjlkODQ5NDdiLWMyODItNGQ0Ny04N2RhLWY3ZTY1NTlkNTlhYSJ9.sXliBGrR-q6DrLv6rwKEowrYyrm-YIUv_kU5JmjqAAg",
  "access_expires_at": "2026-10-29T16:09:37.346273229Z",
  "refresh_token": "eeccY6_IiRXvPtDXeCkNjk4XNukV8j346sTA83LoWc0",
  "refresh_expires_at": "2026-11-28T15:54:37.345809707Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c18734fc-1bf4-4ff2-8465-75759c7ee896",
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
  "id": "646b6114-b91c-486b-b29d-61ba8f22e4b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:59:37.577654Z",
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
  "command_id": "ad2ff1de-f823-49d4-9461-c40802fa3b11",
  "quote_id": "646b6114-b91c-486b-b29d-61ba8f22e4b7",
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
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:54:37.818619Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:54:37.818619Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.691093651
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.14005091
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

`GET /api/rider/v1/orders/55bbdcca-07b2-4a00-9b58-60d6a5166b59` → **200**

```json
{
  "id": "55bbdcca-07b2-4a00-9b58-60d6a5166b59",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ee63badc-0c3e-4e4b-b6c6-2f7596ff990a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:54:37.818619Z",
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
  "session_id": "70da1224-1793-453d-862a-2f05e289601c",
  "subject": {
    "type": "STAFF",
    "id": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzEwYjJjNS0yNzY2LTRhMTktYThjOS0zYjNmMGFkYTRhZTgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAzNjIsImlhdCI6MTc5MzI4OTQ2MiwianRpIjoiNGUzMTFmYmMtOTc0Yy00YTRkLTg2YWItNTkzZTJkNWIyMjUxIiwic2lkIjoiNzBkYTEyMjQtMTc5My00NTNkLTg2MmEtMmYwNWUyODk2MDFjIn0.EXaL9ud6N879dKDnpwfl7Zc-Eui71awIQma92ZrskjU",
  "access_expires_at": "2026-10-29T16:12:42.53805247Z",
  "refresh_token": "XZeL2tF3KkJgAZk-rbuWqDsr37Vr-IvPQcVnnRGvWko",
  "refresh_expires_at": "2026-10-30T03:57:42.537491077Z",
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
  "id": "9a244407-ec46-407e-99b4-d664c826bda9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:42.780115Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:42.78021Z",
  "updated_at": "2026-10-29T15:57:42.797044Z",
  "finished_at": "2026-10-29T15:57:42.797044Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/9a244407-ec46-407e-99b4-d664c826bda9` → **200**

```json
{
  "run": {
    "id": "9a244407-ec46-407e-99b4-d664c826bda9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:57:42.780115Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:57:42.78021Z",
    "updated_at": "2026-10-29T15:57:42.797044Z",
    "finished_at": "2026-10-29T15:57:42.797044Z",
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
  "id": "9a244407-ec46-407e-99b4-d664c826bda9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:42.780115Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:42.78021Z",
  "updated_at": "2026-10-29T15:57:42.797044Z",
  "finished_at": "2026-10-29T15:57:42.797044Z",
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
  "id": "9a244407-ec46-407e-99b4-d664c826bda9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:42.780115Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:42.78021Z",
  "updated_at": "2026-10-29T15:57:42.797044Z",
  "finished_at": "2026-10-29T15:57:42.797044Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ca02b9b0-a504-4c64-ac3d-a2ad544243c6` → **204**

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
  "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:43.168822Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:43.168897Z",
  "updated_at": "2026-10-29T15:57:43.176216Z",
  "finished_at": "2026-10-29T15:57:43.176216Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/fda228f0-c54b-4480-bbcc-258df0f329ed` → **200**

```json
{
  "run": {
    "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:57:43.168822Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:57:43.168897Z",
    "updated_at": "2026-10-29T15:57:43.176216Z",
    "finished_at": "2026-10-29T15:57:43.176216Z",
    "version": 1
  },
  "items": [
    {
      "id": "03fd49ef-d0c9-4efc-b13c-7cf6f22631b7",
      "run_id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "63ffeed915eab4f50bab30787095d16f39ecb7ef59b05245824a234acc46ccf1",
      "reference_display": "sandbox-reconciliation-ca02b9b0-a504-4c64-ac3d-a2ad#####c6",
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
      "provider_at": "2026-10-29T15:57:43Z",
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
  "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:43.168822Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:43.168897Z",
  "updated_at": "2026-10-29T15:57:43.176216Z",
  "finished_at": "2026-10-29T15:57:43.176216Z",
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
  "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:43.168822Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:43.168897Z",
  "updated_at": "2026-10-29T15:57:43.176216Z",
  "finished_at": "2026-10-29T15:57:43.176216Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/03fd49ef-d0c9-4efc-b13c-7cf6f22631b7/resolve` → **200**

```json
{
  "command_id": "394a54b0-7ab6-4974-8c7d-13c0ba2daaaf",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "03fd49ef-d0c9-4efc-b13c-7cf6f22631b7",
  "run_id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "63ffeed915eab4f50bab30787095d16f39ecb7ef59b05245824a234acc46ccf1",
  "reference_display": "sandbox-reconciliation-ca02b9b0-a504-4c64-ac3d-a2ad#####c6",
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
  "provider_at": "2026-10-29T15:57:43Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "resolved_at": "2026-10-29T15:57:43.538146Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/03fd49ef-d0c9-4efc-b13c-7cf6f22631b7/resolve` → **200**

```json
{
  "command_id": "394a54b0-7ab6-4974-8c7d-13c0ba2daaaf",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "03fd49ef-d0c9-4efc-b13c-7cf6f22631b7",
  "run_id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "63ffeed915eab4f50bab30787095d16f39ecb7ef59b05245824a234acc46ccf1",
  "reference_display": "sandbox-reconciliation-ca02b9b0-a504-4c64-ac3d-a2ad#####c6",
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
  "provider_at": "2026-10-29T15:57:43Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
  "resolved_at": "2026-10-29T15:57:43.538146Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/03fd49ef-d0c9-4efc-b13c-7cf6f22631b7/resolve` → **409**

```json
{
  "command_id": "6adf8574-fd22-4e51-878e-460385cc534a",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/03fd49ef-d0c9-4efc-b13c-7cf6f22631b7/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5d7adf8a-ab4d-44ec-8cf6-33ce8b6b19e7"
}
```

`GET /api/admin/v1/payment-reconciliations/fda228f0-c54b-4480-bbcc-258df0f329ed` → **200**

```json
{
  "run": {
    "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:57:43.168822Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:57:43.168897Z",
    "updated_at": "2026-10-29T15:57:43.538146Z",
    "finished_at": "2026-10-29T15:57:43.176216Z",
    "version": 2
  },
  "items": [
    {
      "id": "03fd49ef-d0c9-4efc-b13c-7cf6f22631b7",
      "run_id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "63ffeed915eab4f50bab30787095d16f39ecb7ef59b05245824a234acc46ccf1",
      "reference_display": "sandbox-reconciliation-ca02b9b0-a504-4c64-ac3d-a2ad#####c6",
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
      "provider_at": "2026-10-29T15:57:43Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "fc10b2c5-2766-4a19-a8c9-3b3f0ada4ae8",
      "resolved_at": "2026-10-29T15:57:43.538146Z",
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
      "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:57:43.168822Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:57:43.168897Z",
      "updated_at": "2026-10-29T15:57:43.538146Z",
      "finished_at": "2026-10-29T15:57:43.176216Z",
      "version": 2
    },
    {
      "id": "0a72c53a-6983-48a1-86a7-25eb3262bb5c",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T15:50:39.788407Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:50:39.788492Z",
      "updated_at": "2026-10-29T15:50:39.79335Z",
      "finished_at": "2026-10-29T15:50:39.79335Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ca02b9b0-a504-4c64-ac3d-a2ad544243c6` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "fda228f0-c54b-4480-bbcc-258df0f329ed",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:57:43.168822Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:57:43.168897Z",
  "updated_at": "2026-10-29T15:57:43.538146Z",
  "finished_at": "2026-10-29T15:57:43.176216Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793289589934E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793289590129E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79328959013E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793289589941E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793289590131E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
