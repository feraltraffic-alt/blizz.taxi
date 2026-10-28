# Sandbox transcript (2026-10-28T19:53:28Z, eafbd6d)

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
  "correlation_id": "7919a517-0234-46f1-90da-68ce912fda54"
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
  "session_id": "046ccb1d-93d2-4ee3-b58d-894f812fc3e7",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxMTYsImlhdCI6MTc5MzIxNzIxNiwianRpIjoiNDRkYmY3YWQtM2M0Mi00ZTEwLWE3NTYtYzI1YmNjODQxYjgwIiwic2lkIjoiMDQ2Y2NiMWQtOTNkMi00ZWUzLWI1OGQtODk0ZjgxMmZjM2U3In0.kn3mFSk0uFukg8CUo2oU2kNHHHWp8oSZ1E7uH_PATA0",
  "access_expires_at": "2026-10-28T20:08:36.266034046Z",
  "refresh_token": "KK3l3t5-xG7_bA_w99VB3ICCN9QILyba3bXpSve7cUM",
  "refresh_expires_at": "2026-10-29T07:53:36.263617044Z",
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
  "session_id": "3a6b50ee-eec3-4d14-8c9a-de9636b1fc26",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxMTcsImlhdCI6MTc5MzIxNzIxNywianRpIjoiMDljODkyYzktYzdhMC00ZGI3LTk5MjAtZTY0NzE0NjRlYzBjIiwic2lkIjoiM2E2YjUwZWUtZWVjMy00ZDE0LThjOWEtZGU5NjM2YjFmYzI2In0.iQOdgtcizxW_m6XFtyLuz0R-9VP83uwwBC4bsad32zA",
  "access_expires_at": "2026-10-28T20:08:37.829619303Z",
  "refresh_token": "kWK_SunEYV4bGWuuqgP3KI7U05KwmvK-CUB5kwq1hPo",
  "refresh_expires_at": "2026-10-29T07:53:37.828293625Z",
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
  "device_ref": "sandbox-13276"
}
```

```json
{
  "challenge_id": "af5992a1-0ffb-444c-967e-14c9a939f54b",
  "expires_at": "2026-10-28T19:58:38.455672364Z",
  "resend_available_at": "2026-10-28T19:53:39.455672364Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "251715",
  "sent_at": "2026-10-28T19:53:38.465669569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af5992a1-0ffb-444c-967e-14c9a939f54b",
  "code": "251715",
  "device_ref": "sandbox-13276"
}
```

```json
{
  "session_id": "ce56a86f-3b7f-431a-bbcf-e02bc31cfc19",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODExOCwiaWF0IjoxNzkzMjE3MjE4LCJqdGkiOiI4MTIzNzBjOC0wZmVjLTRlMjAtOTkyOS04MDdkMTU5YmM1MDMiLCJzaWQiOiJjZTU2YTg2Zi0zYjdmLTQzMWEtYmJjZi1lMDJiYzMxY2ZjMTkifQ.A_7AsGxG2UDPdnLflzBxeKTK0A41pNJqYeu_wGw0zPM",
  "access_expires_at": "2026-10-28T20:08:38.805258984Z",
  "refresh_token": "WG7U5qi69Es9eF9t7-NLq3njN0n2jPS6b0YQIQBVIM4",
  "refresh_expires_at": "2026-11-27T19:53:38.804174456Z",
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
  "command_id": "919ba650-c04e-4c5b-a55d-126efca49a5b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:53:39Z",
    "sequence": 1793217219390
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "50c5230c-3f5a-46d1-9db2-97547e9e5dbe",
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
  "last_heartbeat_at": "2026-10-28T19:53:39.581978Z",
  "last_location_at": "2026-10-28T19:53:39.581978Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631127748",
  "device_ref": "sandbox-12195"
}
```

```json
{
  "challenge_id": "e1c08902-d37a-4c47-81cb-f7af71da627d",
  "expires_at": "2026-10-28T19:58:39.863970842Z",
  "resend_available_at": "2026-10-28T19:53:40.863970842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631127748` → **200**

```json
{
  "phone": "+380631127748",
  "audience": "CLIENT",
  "code": "892651",
  "sent_at": "2026-10-28T19:53:39.867977957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1c08902-d37a-4c47-81cb-f7af71da627d",
  "code": "892651",
  "device_ref": "sandbox-12195"
}
```

```json
{
  "session_id": "8dc43fec-72cb-4f98-8024-8e4a267816c2",
  "subject": {
    "type": "CLIENT",
    "id": "1fcd618e-0032-4cf1-b372-f72cec63508c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmNkNjE4ZS0wMDMyLTRjZjEtYjM3Mi1mNzJjZWM2MzUwOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MTIwLCJpYXQiOjE3OTMyMTcyMjAsImp0aSI6IjgyZjBjZWRlLWY3MDktNGJjZC1hZDBlLWRhZWYxNzQ5ZTI5NSIsInNpZCI6IjhkYzQzZmVjLTcyY2ItNGY5OC04MDI0LThlNGEyNjc4MTZjMiJ9.cVO123aLRoD6mINxC-cqcb27nSkBUBZ4iT8PTZxXmWg",
  "access_expires_at": "2026-10-28T20:08:40.177382326Z",
  "refresh_token": "f-uUZRsopdiD5Z7dv2ALj9tQ7atKp6HBo90mklfy3Kw",
  "refresh_expires_at": "2026-11-27T19:53:40.176436755Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ec69432a-fab4-402e-a9da-4d4df75515a8",
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
  "id": "5ceb131a-0ec1-4d5b-84e8-39bf1f99c981",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:58:40.499874Z",
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
  "command_id": "249cab2e-0dd8-45d8-938d-7fe599830b72",
  "quote_id": "5ceb131a-0ec1-4d5b-84e8-39bf1f99c981",
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
  "id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1fcd618e-0032-4cf1-b372-f72cec63508c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:53:40.887981Z",
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
    "id": "4f975539-81a3-4a74-8bc0-8a9496b4b059",
    "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
    "expires_at": "2026-10-28T19:53:55.899744Z",
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

`POST /api/driver/v1/offers/4f975539-81a3-4a74-8bc0-8a9496b4b059/accept` → **200**

```json
{
  "command_id": "4c95b900-654c-4d2c-a2e6-b4b6bcf91b2d"
}
```

```json
{
  "id": "b01a8dd0-1dcc-4add-ba3c-998ea68169a4",
  "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0d054d13-5b60-4f1d-9bb9-a6e2df2f785f",
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
  "command_id": "cc987ded-1291-4807-a51f-8aae1b88aedf",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-28T19:53:42.146720733Z"
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
  "id": "0d054d13-5b60-4f1d-9bb9-a6e2df2f785f",
  "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
  "assignment_id": "b01a8dd0-1dcc-4add-ba3c-998ea68169a4",
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

`POST /api/driver/v1/work-sessions/50c5230c-3f5a-46d1-9db2-97547e9e5dbe/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:53:43Z",
    "sequence": 1793217223297
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "50c5230c-3f5a-46d1-9db2-97547e9e5dbe",
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
  "last_heartbeat_at": "2026-10-28T19:53:43.056837Z",
  "last_location_at": "2026-10-28T19:53:43.056837Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0d054d13-5b60-4f1d-9bb9-a6e2df2f785f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "31d1c04c-61da-495e-97d4-44211f4597f4",
  "expected_version": 0
}
```

```json
{
  "id": "0d054d13-5b60-4f1d-9bb9-a6e2df2f785f",
  "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
  "assignment_id": "b01a8dd0-1dcc-4add-ba3c-998ea68169a4",
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
  "arrived_at": "2026-10-28T19:53:43.368184Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d054d13-5b60-4f1d-9bb9-a6e2df2f785f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3a09269c-0c55-4f14-9ae3-c60f9c085ff6",
  "expected_version": 1
}
```

```json
{
  "id": "0d054d13-5b60-4f1d-9bb9-a6e2df2f785f",
  "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
  "assignment_id": "b01a8dd0-1dcc-4add-ba3c-998ea68169a4",
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
  "arrived_at": "2026-10-28T19:53:43.368184Z",
  "started_at": "2026-10-28T19:53:43.678147Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d054d13-5b60-4f1d-9bb9-a6e2df2f785f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b3d11150-fa0c-4412-9b33-3785fb29e6d2",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:53:43Z",
  "cash_received": true
}
```

```json
{
  "id": "0d054d13-5b60-4f1d-9bb9-a6e2df2f785f",
  "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
  "assignment_id": "b01a8dd0-1dcc-4add-ba3c-998ea68169a4",
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
  "arrived_at": "2026-10-28T19:53:43.368184Z",
  "started_at": "2026-10-28T19:53:43.678147Z",
  "completed_at": "2026-10-28T19:53:43.987854Z",
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
  "session_id": "50c5230c-3f5a-46d1-9db2-97547e9e5dbe",
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
  "last_heartbeat_at": "2026-10-28T19:53:43.056837Z",
  "last_location_at": "2026-10-28T19:53:43.056837Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/50c5230c-3f5a-46d1-9db2-97547e9e5dbe/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "df161714-d61e-4ddd-8546-f7b10131fda7",
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
  "command_id": "0e3a4db6-c950-4bc0-bddb-4556c033f866",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:53:44Z",
    "sequence": 1793217224903
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
  "correlation_id": "4c9301e8-11f6-4d7d-a898-5d578ded44bd",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "5f3b8ca2-e7be-435b-8beb-a81eebe1024c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:53:45Z",
    "sequence": 1793217225223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a13c249-e1ff-415c-b221-6ad78e0b054e",
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
  "last_heartbeat_at": "2026-10-28T19:53:45.246959Z",
  "last_location_at": "2026-10-28T19:53:45.246959Z",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-28T19:53:42.146721Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "117b0b0e-e49b-4015-ae3f-087bd8018cc6",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-28T19:53:45.84027809Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4a13c249-e1ff-415c-b221-6ad78e0b054e",
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
  "last_heartbeat_at": "2026-10-28T19:53:45.246959Z",
  "last_location_at": "2026-10-28T19:53:45.246959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a13c249-e1ff-415c-b221-6ad78e0b054e/close` → **200**

```json
{
  "command_id": "7f3fefaa-0565-42f5-a3b1-2e684a58b43c",
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
  "session_id": "d19fd6b0-0602-40af-9223-bfbd803d2cdc",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxMjcsImlhdCI6MTc5MzIxNzIyNywianRpIjoiMTlhMzAzOTktMDM0Mi00Zjg5LWE2OWQtZTM1NWNkODUzMmI2Iiwic2lkIjoiZDE5ZmQ2YjAtMDYwMi00MGFmLTkyMjMtYmZiZDgwM2QyY2RjIn0.yIWwPsf1tjrZlEB84i94lUFKAQS7Qj5AV3_FxOmh1RE",
  "access_expires_at": "2026-10-28T20:08:47.02422675Z",
  "refresh_token": "Ue4Hxy94SOG0Z7EQCBsgrCEeHHj3-eqxDwRbPd15vjM",
  "refresh_expires_at": "2026-10-29T07:53:47.023335922Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f4a5bc2c-1cc0-40e1-bc60-274c00829d5e",
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
  "id": "92440377-4daa-448a-b3e7-7e2c3361db23",
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
  "created_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "created_at": "2026-10-28T19:53:47.326269Z",
  "updated_at": "2026-10-28T19:53:47.326269Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639993119",
  "device_ref": "sandbox-26559"
}
```

```json
{
  "challenge_id": "15350022-15a7-49be-a79e-0b23269f8daf",
  "expires_at": "2026-10-28T19:58:47.635647866Z",
  "resend_available_at": "2026-10-28T19:53:48.635647866Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639993119` → **200**

```json
{
  "phone": "+380639993119",
  "audience": "CLIENT",
  "code": "841101",
  "sent_at": "2026-10-28T19:53:47.639647394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15350022-15a7-49be-a79e-0b23269f8daf",
  "code": "841101",
  "device_ref": "sandbox-26559"
}
```

```json
{
  "session_id": "8f2f8e8e-e0db-44b5-b1f6-a7a7a5c3514a",
  "subject": {
    "type": "CLIENT",
    "id": "0eb3aa23-c46f-4e00-a449-9807bfbc7f93"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZWIzYWEyMy1jNDZmLTRlMDAtYTQ0OS05ODA3YmZiYzdmOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MTI3LCJpYXQiOjE3OTMyMTcyMjcsImp0aSI6IjI1M2U2YjhkLWFiOWMtNGIxYy1iYzg0LWQyYWRmMzBiYjVmMiIsInNpZCI6IjhmMmY4ZThlLWUwZGItNDRiNS1iMWY2LWE3YTdhNWMzNTE0YSJ9.lv86rALI0E3AVvTA-pzSSZSg-cDicx3vjSfRj4MQUb4",
  "access_expires_at": "2026-10-28T20:08:47.95353748Z",
  "refresh_token": "TqA8FMrInoJwHkAZFwSX22gI-76W80NIZV8Sgsv_YZA",
  "refresh_expires_at": "2026-11-27T19:53:47.952756887Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639993119` → **200**

```json
{
  "client_id": "0eb3aa23-c46f-4e00-a449-9807bfbc7f93"
}
```

`POST /api/admin/v1/rider-wallets/0eb3aa23-c46f-4e00-a449-9807bfbc7f93/top-ups` → **201**

```json
{
  "command_id": "481ac704-b14b-497b-87bb-7e493d8f14dd",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "0eb3aa23-c46f-4e00-a449-9807bfbc7f93",
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
      "id": "1b8964e8-0dc1-4d9d-aad4-dabd88561990",
      "at": "2026-10-28T19:53:48.519157Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9f5b3d8-e193-4f6b-95b1-702f778cb8fd",
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
  "id": "e958f4d2-e07d-429d-8931-5704e8614ca0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:58:48.822077Z",
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
      "id": "92440377-4daa-448a-b3e7-7e2c3361db23",
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
  "device_ref": "sandbox-4539"
}
```

```json
{
  "challenge_id": "7092a495-5ff9-4cf1-9607-bf1b34284968",
  "expires_at": "2026-10-28T19:58:49.118333745Z",
  "resend_available_at": "2026-10-28T19:53:50.118333745Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "946753",
  "sent_at": "2026-10-28T19:53:49.122994253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7092a495-5ff9-4cf1-9607-bf1b34284968",
  "code": "946753",
  "device_ref": "sandbox-4539"
}
```

```json
{
  "session_id": "aa1586be-a342-490b-aaa3-2689178eef94",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODEyOSwiaWF0IjoxNzkzMjE3MjI5LCJqdGkiOiI2Zjg5YjhmZC05NTI4LTQ1Y2QtYjVjMS03ZjQ5MmUyM2EwMWQiLCJzaWQiOiJhYTE1ODZiZS1hMzQyLTQ5MGItYWFhMy0yNjg5MTc4ZWVmOTQifQ.Bm1krZzUuWxLfpTlMS3ijZOC-k2VyIJxMz0w5X_Fxjs",
  "access_expires_at": "2026-10-28T20:08:49.44208733Z",
  "refresh_token": "hobEWHiiMRoAod0ihtyi2rIwnlFY_MX1_Xu0dV8z2wo",
  "refresh_expires_at": "2026-11-27T19:53:49.441385633Z",
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
  "command_id": "f7dbcb18-f572-4615-9b6c-ed1fba996c3d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:53:49Z",
    "sequence": 1793217229993
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b37e06e5-5683-4cc4-a5d9-05b3742b8c87",
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
  "last_heartbeat_at": "2026-10-28T19:53:50.015347Z",
  "last_location_at": "2026-10-28T19:53:50.015347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a6aaa406-2b4e-40dc-a2d3-1668e65e8ef1",
  "quote_id": "e958f4d2-e07d-429d-8931-5704e8614ca0",
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
  "id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0eb3aa23-c46f-4e00-a449-9807bfbc7f93",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:53:50.318413Z",
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
  "client_id": "0eb3aa23-c46f-4e00-a449-9807bfbc7f93",
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
      "id": "1b8964e8-0dc1-4d9d-aad4-dabd88561990",
      "at": "2026-10-28T19:53:48.519157Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
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
    "id": "b87c03b9-0727-4183-afe9-70c85bae9e36",
    "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
    "expires_at": "2026-10-28T19:54:05.327208Z",
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

`POST /api/driver/v1/offers/b87c03b9-0727-4183-afe9-70c85bae9e36/accept` → **200**

```json
{
  "command_id": "e4ba45c0-bf16-455d-8a74-478eba4c1a71"
}
```

```json
{
  "id": "c4b7248e-f6b6-4300-9abf-d27b2dc9bfbe",
  "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "041a289c-d4a6-44d0-a19a-f954f49981aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "041a289c-d4a6-44d0-a19a-f954f49981aa",
  "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
  "assignment_id": "c4b7248e-f6b6-4300-9abf-d27b2dc9bfbe",
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

`POST /api/driver/v1/work-sessions/b37e06e5-5683-4cc4-a5d9-05b3742b8c87/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:53:51Z",
    "sequence": 1793217231748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b37e06e5-5683-4cc4-a5d9-05b3742b8c87",
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
  "last_heartbeat_at": "2026-10-28T19:53:51.771531Z",
  "last_location_at": "2026-10-28T19:53:51.771531Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/041a289c-d4a6-44d0-a19a-f954f49981aa/arrive` → **200**

```json
{
  "command_id": "2e75f1e8-29d7-4812-b891-f42e141bb30d",
  "expected_version": 0
}
```

```json
{
  "id": "041a289c-d4a6-44d0-a19a-f954f49981aa",
  "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
  "assignment_id": "c4b7248e-f6b6-4300-9abf-d27b2dc9bfbe",
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
  "arrived_at": "2026-10-28T19:53:52.064625Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/041a289c-d4a6-44d0-a19a-f954f49981aa/start` → **200**

```json
{
  "command_id": "b2ec5716-03d0-4668-a799-924a1101a53c",
  "expected_version": 1
}
```

```json
{
  "id": "041a289c-d4a6-44d0-a19a-f954f49981aa",
  "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
  "assignment_id": "c4b7248e-f6b6-4300-9abf-d27b2dc9bfbe",
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
  "arrived_at": "2026-10-28T19:53:52.064625Z",
  "started_at": "2026-10-28T19:53:52.360402Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/041a289c-d4a6-44d0-a19a-f954f49981aa/complete` → **200**

```json
{
  "command_id": "507abd9c-c3d3-448c-a744-6fd79268f7f3",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:53:52Z",
  "cash_received": true
}
```

```json
{
  "id": "041a289c-d4a6-44d0-a19a-f954f49981aa",
  "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
  "assignment_id": "c4b7248e-f6b6-4300-9abf-d27b2dc9bfbe",
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
  "arrived_at": "2026-10-28T19:53:52.064625Z",
  "started_at": "2026-10-28T19:53:52.360402Z",
  "completed_at": "2026-10-28T19:53:52.670791Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0eb3aa23-c46f-4e00-a449-9807bfbc7f93",
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
      "id": "14a5a08c-0325-4109-a3f8-3f5e907a0ac2",
      "at": "2026-10-28T19:53:53.644079Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4"
    },
    {
      "id": "1b8964e8-0dc1-4d9d-aad4-dabd88561990",
      "at": "2026-10-28T19:53:48.519157Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/92440377-4daa-448a-b3e7-7e2c3361db23/archive` → **200**

```json
{
  "command_id": "3157692e-ed97-459b-9c9a-b3b36cb5c386",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "92440377-4daa-448a-b3e7-7e2c3361db23",
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
  "created_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "created_at": "2026-10-28T19:53:47.326269Z",
  "updated_at": "2026-10-28T19:53:56.250675Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b37e06e5-5683-4cc4-a5d9-05b3742b8c87",
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
  "last_heartbeat_at": "2026-10-28T19:53:51.771531Z",
  "last_location_at": "2026-10-28T19:53:51.771531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b37e06e5-5683-4cc4-a5d9-05b3742b8c87/close` → **200**

```json
{
  "command_id": "5d02b7fa-ea97-4dae-bda3-99aaadad021f",
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

Done: order e4e6c7ad-2498-4962-93fb-74f759f06bc4.

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
  "session_id": "a5c63303-c300-4123-ace8-7c93a97ea90c",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxMzcsImlhdCI6MTc5MzIxNzIzNywianRpIjoiODJlMjliODItZTM4MS00ZmM1LWIwM2QtZTE3NThiZGUwN2ViIiwic2lkIjoiYTVjNjMzMDMtYzMwMC00MTIzLWFjZTgtN2M5M2E5N2VhOTBjIn0.kv__jmDME7kdCjE68z0QiX-Y8UiGmCGLyT9DBJr-ZnY",
  "access_expires_at": "2026-10-28T20:08:57.419196933Z",
  "refresh_token": "mL9qvGx_GASxuXWa6RSNOHDym0wnqaYqgbbBS8mvk3M",
  "refresh_expires_at": "2026-10-29T07:53:57.418444038Z",
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
  "command_id": "2beae6e0-86e7-4fe3-af66-e0c270b6ba96",
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
  "session_id": "ba72f4e9-7b80-4cca-a29b-f8dd8497b1ff",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxMzgsImlhdCI6MTc5MzIxNzIzOCwianRpIjoiYWZhZmI1YWUtMDY4Zi00NmVjLWFhYzAtMzg4NGVlNTBjYzJmIiwic2lkIjoiYmE3MmY0ZTktN2I4MC00Y2NhLWEyOWItZjhkZDg0OTdiMWZmIn0.LwwRsNorkq0ol25ZNhEjocHSf5fItbqfMuZXLnhOKVI",
  "access_expires_at": "2026-10-28T20:08:58.584180569Z",
  "refresh_token": "MaAfVr2DuLPOFT1pcguR1juMxLq1DzsKdPDTlF4p4-o",
  "refresh_expires_at": "2026-10-29T07:53:58.583342789Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1466018557",
    "linkedid": "1730052700.1466018557",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674876140"
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
    "id": "1730052700.1466018557",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "18e3b8c4-2891-4d7f-b3ab-e3077e296246",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:53:58.854023Z",
      "answered_at": null,
      "ended_at": "2026-10-28T19:53:58.880765Z",
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
    "id": "1730052600.69661706",
    "linkedid": "1730052600.69661706",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674876140"
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
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/94022cfc-992c-4dd9-a496-cf203fa5dcd6/answer` → **200**

```json
{
  "command_id": "c564a7f0-5065-4b16-b900-d26e1bd84bf6"
}
```

```json
{
  "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674876140",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "order_ids": [],
  "started_at": "2026-10-28T19:53:59.199492Z",
  "answered_at": "2026-10-28T19:53:59.533793Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.69661706",
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
    "id": "1730052600.69661706",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
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
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
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
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
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
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
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
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:54:07.305646Z"
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
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:54:07.305646Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/94022cfc-992c-4dd9-a496-cf203fa5dcd6/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/94022cfc-992c-4dd9-a496-cf203fa5dcd6/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=94022cfc-992c-4dd9-a496-cf203fa5dcd6` → **200**

```json
{
  "changes": [
    {
      "id": "be53286c-5362-42f7-992a-88bd41e24786",
      "occurred_at": "2026-10-28T19:54:09.642107Z",
      "actor_type": "STAFF",
      "actor_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f849a5dd-fe3c-427b-a327-aea379f07514\", \"order_ids\": []}",
      "correlation_id": "340101fe-ed66-4982-aadb-cb7055d8cf36"
    },
    {
      "id": "594a3fc1-f523-4950-98b0-b31e78bf61fb",
      "occurred_at": "2026-10-28T19:54:09.608363Z",
      "actor_type": "STAFF",
      "actor_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f849a5dd-fe3c-427b-a327-aea379f07514\", \"order_ids\": []}",
      "correlation_id": "7f8a780b-ad29-4875-b527-aa2b2f1bf2dc"
    }
  ]
}
```

Done: call 94022cfc-992c-4dd9-a496-cf203fa5dcd6 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12998"
}
```

```json
{
  "challenge_id": "3c4985a2-8c15-433f-b516-a44d230aac58",
  "expires_at": "2026-10-28T19:59:09.96736939Z",
  "resend_available_at": "2026-10-28T19:54:10.96736939Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "573844",
  "sent_at": "2026-10-28T19:54:09.970937223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c4985a2-8c15-433f-b516-a44d230aac58",
  "code": "573844",
  "device_ref": "sandbox-12998"
}
```

```json
{
  "session_id": "db0c6bb2-17f2-4f88-879f-67e54849f621",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODE1MCwiaWF0IjoxNzkzMjE3MjUwLCJqdGkiOiJiODU1YzlhMC0zYmQyLTQxYzEtOWRkMi02OTJjNDY4OWIwZmEiLCJzaWQiOiJkYjBjNmJiMi0xN2YyLTRmODgtODc5Zi02N2U1NDg0OWY2MjEifQ.gHaHoFEcX7FTQ0it-7Kb8rIClAmlcRcIh2k8yOJ_otI",
  "access_expires_at": "2026-10-28T20:09:10.265295246Z",
  "refresh_token": "JCAedPiSbRusmdwYXqaXr8oh7KbLy9aOy-2t5h4EUdI",
  "refresh_expires_at": "2026-11-27T19:54:10.264637983Z",
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
  "command_id": "0e9c4ff7-8eaa-4c0a-8461-0cf149d03d79",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:10Z",
    "sequence": 1793217250819
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87bb33e8-d864-4e5d-b7b0-532bd91fcc09",
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
  "last_heartbeat_at": "2026-10-28T19:54:10.841141Z",
  "last_location_at": "2026-10-28T19:54:10.841141Z",
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
  "session_id": "d9ee98c3-3fec-4a7a-8ce7-0c5e166703cf",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxNTEsImlhdCI6MTc5MzIxNzI1MSwianRpIjoiMzQyMDQ4ZjktYTA3OS00MjQ0LWJmZWYtM2FjMDU0NWRiZDUyIiwic2lkIjoiZDllZTk4YzMtM2ZlYy00YTdhLThjZTctMGM1ZTE2NjcwM2NmIn0.ctT8rlyJpLN-efvVFDQxBgVACbZkILVdok4P6wnWuVQ",
  "access_expires_at": "2026-10-28T20:09:11.420593516Z",
  "refresh_token": "zftoV_J7ZFrslmk-Dz0hPjAA_jOuF0qCkKxusFh3RM8",
  "refresh_expires_at": "2026-10-29T07:54:11.419968853Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3b307be2-86e4-43dd-b9b0-e9dff32c3d76",
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
  "id": "5d15a813-1de7-4a0b-88de-9e9c25eb50d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:59:11.699505Z",
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
  "command_id": "2104162c-f7ca-4d81-8785-449dc14a1f37",
  "quote_id": "5d15a813-1de7-4a0b-88de-9e9c25eb50d6",
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
    "phone": "+380679674422"
  }
}
```

```json
{
  "id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
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
  "created_at": "2026-10-28T19:54:12.003762Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679674422"
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
    "id": "8b730cd1-f590-49ef-91bb-5951f3e71f45",
    "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
    "expires_at": "2026-10-28T19:54:27.012831Z",
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

`POST /api/driver/v1/offers/8b730cd1-f590-49ef-91bb-5951f3e71f45/accept` → **200**

```json
{
  "command_id": "02158637-be66-4e35-bc3d-9d2fb0caa549"
}
```

```json
{
  "id": "5d50564c-49ff-47ab-aea5-396385b5ace1",
  "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8be88cc-2d93-446e-929e-e5deb04adcc3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8be88cc-2d93-446e-929e-e5deb04adcc3",
  "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
  "assignment_id": "5d50564c-49ff-47ab-aea5-396385b5ace1",
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
    "phone": "+380679674422"
  }
}
```

`POST /api/driver/v1/work-sessions/87bb33e8-d864-4e5d-b7b0-532bd91fcc09/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:14Z",
    "sequence": 1793217254264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87bb33e8-d864-4e5d-b7b0-532bd91fcc09",
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
  "last_heartbeat_at": "2026-10-28T19:54:14.285044Z",
  "last_location_at": "2026-10-28T19:54:14.285044Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c8be88cc-2d93-446e-929e-e5deb04adcc3/arrive` → **200**

```json
{
  "command_id": "c5a6f5b0-ee21-4a05-97d8-0950fefb64f4",
  "expected_version": 0
}
```

```json
{
  "id": "c8be88cc-2d93-446e-929e-e5deb04adcc3",
  "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
  "assignment_id": "5d50564c-49ff-47ab-aea5-396385b5ace1",
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
  "arrived_at": "2026-10-28T19:54:14.590027Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679674422"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  },
  {
    "phone": "+380679674422",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:15.522741352Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  },
  {
    "phone": "+380679674422",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:15.522741352Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679674422` → **200**

```json
[
  {
    "phone": "+380679674422",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:13.514122501Z"
  },
  {
    "phone": "+380679674422",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:54:15.522741352Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/c8be88cc-2d93-446e-929e-e5deb04adcc3/start` → **200**

```json
{
  "command_id": "f26fdcee-652e-4411-967f-ee305ff65a4d",
  "expected_version": 1
}
```

```json
{
  "id": "c8be88cc-2d93-446e-929e-e5deb04adcc3",
  "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
  "assignment_id": "5d50564c-49ff-47ab-aea5-396385b5ace1",
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
  "arrived_at": "2026-10-28T19:54:14.590027Z",
  "started_at": "2026-10-28T19:54:16.01041Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679674422"
  }
}
```

`POST /api/driver/v1/trips/c8be88cc-2d93-446e-929e-e5deb04adcc3/complete` → **200**

```json
{
  "command_id": "41d5541b-c0d5-4e0a-a658-c15a7bf92aaf",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:54:16Z",
  "cash_received": true
}
```

```json
{
  "id": "c8be88cc-2d93-446e-929e-e5deb04adcc3",
  "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
  "assignment_id": "5d50564c-49ff-47ab-aea5-396385b5ace1",
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
  "arrived_at": "2026-10-28T19:54:14.590027Z",
  "started_at": "2026-10-28T19:54:16.01041Z",
  "completed_at": "2026-10-28T19:54:16.305246Z",
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
  "session_id": "87bb33e8-d864-4e5d-b7b0-532bd91fcc09",
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
  "last_heartbeat_at": "2026-10-28T19:54:14.285044Z",
  "last_location_at": "2026-10-28T19:54:14.285044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/87bb33e8-d864-4e5d-b7b0-532bd91fcc09/close` → **200**

```json
{
  "command_id": "6de3f85e-ce73-483e-ac22-aeb15b528dfa",
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
  "phone": "+380634340054",
  "device_ref": "sandbox-19731"
}
```

```json
{
  "challenge_id": "ccffdf19-8539-48a9-95ea-8f819cafe6aa",
  "expires_at": "2026-10-28T19:59:17.176035043Z",
  "resend_available_at": "2026-10-28T19:54:18.176035043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634340054` → **200**

```json
{
  "phone": "+380634340054",
  "audience": "CLIENT",
  "code": "702194",
  "sent_at": "2026-10-28T19:54:17.179497843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccffdf19-8539-48a9-95ea-8f819cafe6aa",
  "code": "702194",
  "device_ref": "sandbox-19731"
}
```

```json
{
  "session_id": "92099645-b8b6-474e-af31-36763bcf07e1",
  "subject": {
    "type": "CLIENT",
    "id": "66c7cb0b-3890-4243-beea-302736377b38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NmM3Y2IwYi0zODkwLTQyNDMtYmVlYS0zMDI3MzYzNzdiMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MTU3LCJpYXQiOjE3OTMyMTcyNTcsImp0aSI6Ijg2OGNhMWZkLWE0NzktNDY3YS05NzRlLTlmM2U2YjQ1YTI1YyIsInNpZCI6IjkyMDk5NjQ1LWI4YjYtNDc0ZS1hZjMxLTM2NzYzYmNmMDdlMSJ9.9rchKAu1DX5mCTQXWG_uDDMPTlaK9oat1pYQ6u9rVo4",
  "access_expires_at": "2026-10-28T20:09:17.489507981Z",
  "refresh_token": "qXUoRFUyTMoWeBdsR9uiI9nJj79UvohDsd2bHDQC3RM",
  "refresh_expires_at": "2026-11-27T19:54:17.488857609Z",
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
  "device_ref": "sandbox-10790"
}
```

```json
{
  "challenge_id": "500a2fc7-18e5-4987-82ff-973c75f6fc60",
  "expires_at": "2026-10-28T19:59:18.036977988Z",
  "resend_available_at": "2026-10-28T19:54:19.036977988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "178040",
  "sent_at": "2026-10-28T19:54:18.040977396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "500a2fc7-18e5-4987-82ff-973c75f6fc60",
  "code": "178040",
  "device_ref": "sandbox-10790"
}
```

```json
{
  "session_id": "9ab9b667-8f5d-45cd-a646-d2c9d17b3444",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODE1OCwiaWF0IjoxNzkzMjE3MjU4LCJqdGkiOiJiMGIzMWJlZC03YTg0LTQzYjItYWZmNi0zOWM5MmJiM2YxMjMiLCJzaWQiOiI5YWI5YjY2Ny04ZjVkLTQ1Y2QtYTY0Ni1kMmM5ZDE3YjM0NDQifQ.SX4KdZ_EinCx4C9kd72zH0yYKZClD0iXERpULXOfFgg",
  "access_expires_at": "2026-10-28T20:09:18.344858769Z",
  "refresh_token": "B-OtK4fFS4vFApwRj_Z_tVLL7-S3VtFN1Ni6fV15Cvc",
  "refresh_expires_at": "2026-11-27T19:54:18.344226622Z",
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
  "session_id": "6d92a12d-4896-40e4-a01e-578ba710dff4",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxNTksImlhdCI6MTc5MzIxNzI1OSwianRpIjoiZDIzNzg0YzctYWRiYS00NmI1LTljZDctOTA2OTZlYWY1MjBiIiwic2lkIjoiNmQ5MmExMmQtNDg5Ni00MGU0LWEwMWUtNTc4YmE3MTBkZmY0In0.EYtaQZ-MtF_DBpb5MqSd0qzaU8AMwYCY3yLxPCeBocE",
  "access_expires_at": "2026-10-28T20:09:19.173939307Z",
  "refresh_token": "HYqLdpu1SF6SgwYyYviShkvFbsd8tzIDCLw60XBBZNw",
  "refresh_expires_at": "2026-10-29T07:54:19.173320284Z",
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
  "session_id": "aa76e747-737d-4c82-ad6a-8f18aef3dc88",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxNTksImlhdCI6MTc5MzIxNzI1OSwianRpIjoiNmU0NjZlNGYtMDE3Mi00Y2E2LTg3YWQtZTllYzEyMTc1NWNlIiwic2lkIjoiYWE3NmU3NDctNzM3ZC00YzgyLWFkNmEtOGYxOGFlZjNkYzg4In0.rKojfkCWiZuHDhzkUlGxTWD0Y_WLOCVBy-aUD6TTrqE",
  "access_expires_at": "2026-10-28T20:09:19.745259143Z",
  "refresh_token": "ABCOtgjiiStUCc48iC2BiePP8cbl3PfpimQ0xzlHeYI",
  "refresh_expires_at": "2026-10-29T07:54:19.744579277Z",
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
  "command_id": "b49c85a2-b063-4c5b-b5a7-488ec64c0d45",
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
  "id": "27f9f3a9-0b28-455c-a99a-dce43a614698",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:59:20.304676Z",
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
  "command_id": "e7351bb7-0d92-45c6-9acb-96a580b637b8",
  "quote_id": "27f9f3a9-0b28-455c-a99a-dce43a614698",
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
  "id": "fd1db5c3-c49a-4ce2-99cd-1521f7e2149c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66c7cb0b-3890-4243-beea-302736377b38",
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
  "created_at": "2026-10-28T19:54:20.606724Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fd1db5c3-c49a-4ce2-99cd-1521f7e2149c` → **200**

```json
{
  "id": "fd1db5c3-c49a-4ce2-99cd-1521f7e2149c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66c7cb0b-3890-4243-beea-302736377b38",
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
  "created_at": "2026-10-28T19:54:20.606724Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fd1db5c3-c49a-4ce2-99cd-1521f7e2149c/cancel` → **200**

```json
{
  "command_id": "fb1c4d30-b232-4149-b891-ff484fa3df98",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "fd1db5c3-c49a-4ce2-99cd-1521f7e2149c",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "66c7cb0b-3890-4243-beea-302736377b38",
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
  "created_at": "2026-10-28T19:54:20.606724Z",
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
  "command_id": "415aa1a1-702e-4822-8eda-8fe022be4336",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:21Z",
    "sequence": 1793217261780
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b4544ebd-9c30-436f-9ebd-d1cd68660007",
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
  "last_heartbeat_at": "2026-10-28T19:54:21.801435Z",
  "last_location_at": "2026-10-28T19:54:21.801435Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13830"
}
```

```json
{
  "challenge_id": "307de30b-6297-4aa7-8360-c8879f287cfc",
  "expires_at": "2026-10-28T19:59:22.074966786Z",
  "resend_available_at": "2026-10-28T19:54:23.074966786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "367019",
  "sent_at": "2026-10-28T19:54:22.077936046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "307de30b-6297-4aa7-8360-c8879f287cfc",
  "code": "367019",
  "device_ref": "sandbox-13830"
}
```

```json
{
  "session_id": "4714591d-6577-4e18-9004-4940284e568a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODE2MiwiaWF0IjoxNzkzMjE3MjYyLCJqdGkiOiIzMTBhOTk3OC03NWEyLTQ5YzQtYjFhYy04ODIzYzU0MzI2ZTQiLCJzaWQiOiI0NzE0NTkxZC02NTc3LTRlMTgtOTAwNC00OTQwMjg0ZTU2OGEifQ.NbZXgRRtezaJ8S_TARlsEihxRqfEC01tBCJec0ld5_s",
  "access_expires_at": "2026-10-28T20:09:22.388686945Z",
  "refresh_token": "eBR_KtQ_FohI-UtOqDs5FO7t8drmaHcBJQOXl5WvP5Q",
  "refresh_expires_at": "2026-11-27T19:54:22.387937972Z",
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
  "command_id": "31af2ea1-d85f-4a14-96be-3c338b81cf45",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:22Z",
    "sequence": 1793217262927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:22.947347Z",
  "last_location_at": "2026-10-28T19:54:22.947347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c84a5496-4be3-4edf-ba78-dccc527c68b3",
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
  "id": "a6d9208e-8bb0-42ea-afcd-54b9d6020809",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:59:23.238564Z",
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
  "command_id": "2257521b-58f7-4cbf-8211-ff2c7c9a4a56",
  "quote_id": "a6d9208e-8bb0-42ea-afcd-54b9d6020809",
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
  "id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66c7cb0b-3890-4243-beea-302736377b38",
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
  "created_at": "2026-10-28T19:54:23.530938Z",
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
    "id": "d8d15d9d-f8d6-4f91-98fb-757ce3351a5c",
    "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
    "expires_at": "2026-10-28T19:54:38.534907Z",
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

`POST /api/driver/v1/offers/d8d15d9d-f8d6-4f91-98fb-757ce3351a5c/accept` → **200**

```json
{
  "command_id": "2a0da24f-7b01-4b81-b5b7-a39129bf9e81"
}
```

```json
{
  "id": "7665f0d7-3082-4fc8-9474-2f26f9e1e4e9",
  "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "63f8bcb4-2742-4f52-9135-9f8d671f060f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "63f8bcb4-2742-4f52-9135-9f8d671f060f",
  "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "assignment_id": "7665f0d7-3082-4fc8-9474-2f26f9e1e4e9",
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

`POST /api/driver/v1/trips/63f8bcb4-2742-4f52-9135-9f8d671f060f/cancel` → **200**

```json
{
  "command_id": "186dc54f-66a2-4d62-8600-64afaf0550e1",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "63f8bcb4-2742-4f52-9135-9f8d671f060f",
  "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "assignment_id": "7665f0d7-3082-4fc8-9474-2f26f9e1e4e9",
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

`GET /api/rider/v1/orders/2462ce46-8509-42a3-a547-090d575cee5a` → **200**

```json
{
  "id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "66c7cb0b-3890-4243-beea-302736377b38",
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
    "id": "7665f0d7-3082-4fc8-9474-2f26f9e1e4e9",
    "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "63f8bcb4-2742-4f52-9135-9f8d671f060f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:54:23.530938Z",
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
    "id": "ce1b4d5d-9b4f-42c1-967b-52e15a2b7a1c",
    "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
    "expires_at": "2026-10-28T19:54:39.694926Z",
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

`POST /api/driver/v1/offers/ce1b4d5d-9b4f-42c1-967b-52e15a2b7a1c/accept` → **200**

```json
{
  "command_id": "ae46794a-9e20-4bdc-83d9-cf3e7069c1c0"
}
```

```json
{
  "id": "90188b4c-8901-46c9-98ed-fe61f40e1257",
  "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "796753ac-64e9-4966-98df-a0dc552e8f37",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "796753ac-64e9-4966-98df-a0dc552e8f37",
  "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "assignment_id": "90188b4c-8901-46c9-98ed-fe61f40e1257",
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

`POST /api/driver/v1/trips/796753ac-64e9-4966-98df-a0dc552e8f37/cancel` → **200**

```json
{
  "command_id": "d69487ba-c6e6-4a9e-8c6a-7977d4fee046",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "796753ac-64e9-4966-98df-a0dc552e8f37",
  "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
  "assignment_id": "90188b4c-8901-46c9-98ed-fe61f40e1257",
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
    "id": "2462ce46-8509-42a3-a547-090d575cee5a",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:54:23.530938Z",
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
    "id": "fd1db5c3-c49a-4ce2-99cd-1521f7e2149c",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:54:20.606724Z",
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

`GET /api/operator/v1/orders/2462ce46-8509-42a3-a547-090d575cee5a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:54:23.531651Z",
      "actor": {
        "type": "CLIENT",
        "id": "66c7cb0b-3890-4243-beea-302736377b38",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
        "quote_id": "a6d9208e-8bb0-42ea-afcd-54b9d6020809",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "85c4ca8e-b301-4392-835e-f43d54a8157d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:54:23.533924Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
        "attempt_id": "ff83c71f-4220-4264-845b-7dd353d89516",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "85c4ca8e-b301-4392-835e-f43d54a8157d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:54:23.541597Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d8d15d9d-f8d6-4f91-98fb-757ce3351a5c",
        "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "85c4ca8e-b301-4392-835e-f43d54a8157d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:54:24.107963Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d8d15d9d-f8d6-4f91-98fb-757ce3351a5c",
        "order_id": "2462ce46-8509-42a3-a547-090d575cee5a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "7665f0d7-3082-4fc8-9474-2f26f9e1e4e9"
      },
      "correlation_id": "fccba23a-12d0-4832-b926-bf0d7b71efe9"
```

Done: orders fd1db5c3-c49a-4ce2-99cd-1521f7e2149c, 2462ce46-8509-42a3-a547-090d575cee5a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733713443",
  "device_ref": "sandbox-15148"
}
```

```json
{
  "challenge_id": "aaed3a2f-6ae9-4b5e-b2ca-9a69879f2cd2",
  "expires_at": "2026-10-28T19:59:27.001711094Z",
  "resend_available_at": "2026-10-28T19:54:28.001711094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733713443` → **200**

```json
{
  "phone": "+380733713443",
  "audience": "CLIENT",
  "code": "019786",
  "sent_at": "2026-10-28T19:54:27.004544291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aaed3a2f-6ae9-4b5e-b2ca-9a69879f2cd2",
  "code": "019786",
  "device_ref": "sandbox-15148"
}
```

```json
{
  "session_id": "589ad789-04c1-4ce0-9cc9-fc9b6f83f095",
  "subject": {
    "type": "CLIENT",
    "id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjFhYWQwMS01Zjc1LTRhZDMtYjE5Yy03ZjJkMmE3MjBiYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MTY3LCJpYXQiOjE3OTMyMTcyNjcsImp0aSI6IjU2NTA4OThmLTA5MjEtNDQwOS1hNzFmLWZkZTcyZjY1ZmViMSIsInNpZCI6IjU4OWFkNzg5LTA0YzEtNGNlMC05Y2M5LWZjOWI2ZjgzZjA5NSJ9.6_oyZPlWaQrjwtQ1yEmjK549FSpUkELDKgwQsD9Erkc",
  "access_expires_at": "2026-10-28T20:09:27.31330946Z",
  "refresh_token": "Cf-t0IBAwk9t-utYqsyJTsIF7EUDkFei-MNq2PYFbNo",
  "refresh_expires_at": "2026-11-27T19:54:27.312759296Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e13d149f-b769-41c8-bf2c-fbd47eb8696e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "157aa533-fa88-4bb1-bfd9-ec0e663bb111",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-157aa533-fa88-4bb1-bfd9-ec0e663bb111",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b0fd7d01e15df0e801b0c798063e8f12",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=157aa533-fa88-4bb1-bfd9-ec0e663bb111",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733713443"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=157aa533-fa88-4bb1-bfd9-ec0e663bb111",
  "expires_at": "2026-10-28T20:24:27.606139Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/157aa533-fa88-4bb1-bfd9-ec0e663bb111` → **200**

```json
{
  "id": "157aa533-fa88-4bb1-bfd9-ec0e663bb111",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T20:24:27.606139Z",
  "card": {
    "id": "a337a7d5-0b6a-447a-bbf1-7da68cc0902c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0441",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:54:27.925101Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a337a7d5-0b6a-447a-bbf1-7da68cc0902c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0441",
      "card_type": "Visa",
      "created_at": "2026-10-28T19:54:27.925101Z"
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
  "device_ref": "sandbox-7334"
}
```

```json
{
  "challenge_id": "34d5478e-8717-480a-afb8-0b23aba7b522",
  "expires_at": "2026-10-28T19:59:28.495862621Z",
  "resend_available_at": "2026-10-28T19:54:29.495862621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "171714",
  "sent_at": "2026-10-28T19:54:28.499376424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34d5478e-8717-480a-afb8-0b23aba7b522",
  "code": "171714",
  "device_ref": "sandbox-7334"
}
```

```json
{
  "session_id": "1f479ed0-b339-4581-9d5e-0654dae2138d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODE2OCwiaWF0IjoxNzkzMjE3MjY4LCJqdGkiOiJkNmY0ZGFjZi0zYTRjLTQxZWQtODNhMi02YmZmYjg3M2U4MGEiLCJzaWQiOiIxZjQ3OWVkMC1iMzM5LTQ1ODEtOWQ1ZS0wNjU0ZGFlMjEzOGQifQ.eVcLPv3uimF6Qe04dQOKK7SaqonIV-r9qI202wFzOZw",
  "access_expires_at": "2026-10-28T20:09:28.796226765Z",
  "refresh_token": "2E1ogteHKYYLtsp_ihiSrZekhM6ev7ymh1iFcULe8s8",
  "refresh_expires_at": "2026-11-27T19:54:28.795516711Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:22.947347Z",
  "last_location_at": "2026-10-28T19:54:22.947347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30baddd8-b4d5-408a-b54e-32d6623b8f91/handover` → **200**

```json
{
  "command_id": "71831a1a-fce8-46d0-a5bc-3c2ff8b07b3d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:22.947347Z",
  "last_location_at": "2026-10-28T19:54:22.947347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30baddd8-b4d5-408a-b54e-32d6623b8f91/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:29Z",
    "sequence": 1793217269638
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:29.658194Z",
  "last_location_at": "2026-10-28T19:54:29.658194Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d541d73a-b6b2-4146-a97f-ebf9a5885033",
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
  "id": "903e201b-dfcf-46bb-bd5a-dd622d5afa9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:59:29.949233Z",
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
  "command_id": "61015c97-4b80-4e40-9c52-1b49fade391a",
  "quote_id": "903e201b-dfcf-46bb-bd5a-dd622d5afa9e",
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
  "id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
  "created_at": "2026-10-28T19:54:30.247533Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f` → **200**

```json
{
  "id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
  "created_at": "2026-10-28T19:54:30.247533Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f` → **200**

```json
{
  "id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
  "created_at": "2026-10-28T19:54:30.247533Z",
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
    "id": "ffc74678-a829-4b4f-8fac-fc8e45f2f33b",
    "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
    "expires_at": "2026-10-28T19:54:45.865291Z",
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

`POST /api/driver/v1/offers/ffc74678-a829-4b4f-8fac-fc8e45f2f33b/accept` → **200**

```json
{
  "command_id": "3397294f-95c4-4a4b-a862-8620a741a9bb"
}
```

```json
{
  "id": "99e43427-66db-46cb-83c7-f3f46b753e75",
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6d5c7d4-3971-4983-a721-e76889e53751",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d6d5c7d4-3971-4983-a721-e76889e53751",
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "assignment_id": "99e43427-66db-46cb-83c7-f3f46b753e75",
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

`POST /api/driver/v1/work-sessions/30baddd8-b4d5-408a-b54e-32d6623b8f91/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:32Z",
    "sequence": 1793217272966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:32.986137Z",
  "last_location_at": "2026-10-28T19:54:32.986137Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d6d5c7d4-3971-4983-a721-e76889e53751/arrive` → **200**

```json
{
  "command_id": "6ea3bee4-090d-4142-93d8-749f7844ad85",
  "expected_version": 0
}
```

```json
{
  "id": "d6d5c7d4-3971-4983-a721-e76889e53751",
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "assignment_id": "99e43427-66db-46cb-83c7-f3f46b753e75",
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
  "arrived_at": "2026-10-28T19:54:33.279186Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d6d5c7d4-3971-4983-a721-e76889e53751/start` → **200**

```json
{
  "command_id": "171624e0-b0c0-4f4c-ab40-100ac75c73f1",
  "expected_version": 1
}
```

```json
{
  "id": "d6d5c7d4-3971-4983-a721-e76889e53751",
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "assignment_id": "99e43427-66db-46cb-83c7-f3f46b753e75",
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
  "arrived_at": "2026-10-28T19:54:33.279186Z",
  "started_at": "2026-10-28T19:54:33.569854Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d6d5c7d4-3971-4983-a721-e76889e53751/complete` → **200**

```json
{
  "command_id": "8ea060de-b4dc-48a6-b748-dd6af12b0892",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:54:33Z",
  "cash_received": true
}
```

```json
{
  "id": "d6d5c7d4-3971-4983-a721-e76889e53751",
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "assignment_id": "99e43427-66db-46cb-83c7-f3f46b753e75",
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
  "arrived_at": "2026-10-28T19:54:33.279186Z",
  "started_at": "2026-10-28T19:54:33.569854Z",
  "completed_at": "2026-10-28T19:54:33.865336Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f` → **200**

```json
{
  "id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
    "id": "99e43427-66db-46cb-83c7-f3f46b753e75",
    "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d6d5c7d4-3971-4983-a721-e76889e53751",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:54:30.247533Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f` → **200**

```json
{
  "id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
    "id": "99e43427-66db-46cb-83c7-f3f46b753e75",
    "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d6d5c7d4-3971-4983-a721-e76889e53751",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:54:30.247533Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f` → **200**

```json
{
  "id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
    "id": "99e43427-66db-46cb-83c7-f3f46b753e75",
    "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d6d5c7d4-3971-4983-a721-e76889e53751",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:54:30.247533Z",
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

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f/tip` → **200**

```json
{
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
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
  "available_until": "2026-10-29T19:54:33.865336Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f/tip` → **201**

```json
{
  "command_id": "a48ab5e6-4aba-4656-9018-5ff1d15431d2",
  "amount_minor": 2500
}
```

```json
{
  "id": "94dd547c-8148-436f-b2e8-1aae99d9097b",
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:54:37.694537Z"
}
```

`GET /api/rider/v1/orders/07468c20-0664-4ef7-96ec-162a9e0d699f/tip` → **200**

```json
{
  "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
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
  "available_until": "2026-10-29T19:54:33.865336Z",
  "open": false,
  "tip": {
    "id": "94dd547c-8148-436f-b2e8-1aae99d9097b",
    "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:54:37.694537Z"
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
      "id": "47243461-9f29-4c48-b048-a8b6a0e63561",
      "at": "2026-10-28T19:54:33.92811Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
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
      "id": "8505acc9-ee6b-401d-b17e-68e75738bbb7",
      "at": "2026-10-28T19:54:38.989076Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
      "counterpart_id": null
    },
    {
      "id": "47243461-9f29-4c48-b048-a8b6a0e63561",
      "at": "2026-10-28T19:54:33.92811Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa907441-3c8d-4a0b-9f15-fc4c9ff8eaa7",
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
  "id": "ed103193-f869-4e03-8a2d-76819861df76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:59:39.880121Z",
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
  "session_id": "9ea321e2-42f8-4ae6-acb0-fa14e7510e70",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxODAsImlhdCI6MTc5MzIxNzI4MCwianRpIjoiMzE0MjMwOWQtZTZhNS00NDQ1LWFkNDUtMWE5ZjM1YWVhNWRiIiwic2lkIjoiOWVhMzIxZTItNDJmOC00YWU2LWFjYjAtZmExNGU3NTEwZTcwIn0.4mn8WkltRR7HLTcdeeBDxjtoPMa-3vmPfb5J-lP6T1g",
  "access_expires_at": "2026-10-28T20:09:40.467438456Z",
  "refresh_token": "Bh9XQdSvwo3u1rsS2OfDfFRm0UuiE__w3tSGHkUcHls",
  "refresh_expires_at": "2026-10-29T07:54:40.46677468Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733713443` → **200**

```json
{
  "client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6"
}
```

`POST /api/admin/v1/rider-wallets/bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6/top-ups` → **201**

```json
{
  "command_id": "0e320999-da00-4d81-8538-f18e369c3ce7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
      "id": "c7335c8d-9432-46c6-8da6-7caefbf2891d",
      "at": "2026-10-28T19:54:41.011103Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2375b113-9e79-4be8-a8b6-7e22f970fd2f",
  "quote_id": "ed103193-f869-4e03-8a2d-76819861df76",
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
  "id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
  "created_at": "2026-10-28T19:54:41.305151Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/48496999-421e-41c4-9ce4-ba8aad0dec52` → **200**

```json
{
  "id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
  "created_at": "2026-10-28T19:54:41.305151Z",
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
    "id": "b27aea25-129d-4bd2-b72d-6c8d6919396a",
    "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
    "expires_at": "2026-10-28T19:54:56.310797Z",
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

`POST /api/driver/v1/offers/b27aea25-129d-4bd2-b72d-6c8d6919396a/accept` → **200**

```json
{
  "command_id": "f64ed88f-b746-40b8-95d6-6919e93aff9e"
}
```

```json
{
  "id": "44bc6f44-10e7-4d88-91b9-7bf22cd1cd4b",
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0d103210-1f9a-40f1-8327-a6ae35c0a3e6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0d103210-1f9a-40f1-8327-a6ae35c0a3e6",
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "assignment_id": "44bc6f44-10e7-4d88-91b9-7bf22cd1cd4b",
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

`POST /api/driver/v1/work-sessions/30baddd8-b4d5-408a-b54e-32d6623b8f91/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:42Z",
    "sequence": 1793217282721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:42.741624Z",
  "last_location_at": "2026-10-28T19:54:42.741624Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0d103210-1f9a-40f1-8327-a6ae35c0a3e6/arrive` → **200**

```json
{
  "command_id": "1cc869cb-a270-452a-8a2d-bb92e6ded089",
  "expected_version": 0
}
```

```json
{
  "id": "0d103210-1f9a-40f1-8327-a6ae35c0a3e6",
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "assignment_id": "44bc6f44-10e7-4d88-91b9-7bf22cd1cd4b",
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
  "arrived_at": "2026-10-28T19:54:43.02623Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d103210-1f9a-40f1-8327-a6ae35c0a3e6/start` → **200**

```json
{
  "command_id": "e4210ead-fb5e-4e5b-8463-e396a4c15fae",
  "expected_version": 1
}
```

```json
{
  "id": "0d103210-1f9a-40f1-8327-a6ae35c0a3e6",
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "assignment_id": "44bc6f44-10e7-4d88-91b9-7bf22cd1cd4b",
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
  "arrived_at": "2026-10-28T19:54:43.02623Z",
  "started_at": "2026-10-28T19:54:43.309205Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d103210-1f9a-40f1-8327-a6ae35c0a3e6/complete` → **200**

```json
{
  "command_id": "9df94e64-fa79-4959-bfb3-e93c75e1e647",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:54:43Z",
  "cash_received": true
}
```

```json
{
  "id": "0d103210-1f9a-40f1-8327-a6ae35c0a3e6",
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "assignment_id": "44bc6f44-10e7-4d88-91b9-7bf22cd1cd4b",
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
  "arrived_at": "2026-10-28T19:54:43.02623Z",
  "started_at": "2026-10-28T19:54:43.309205Z",
  "completed_at": "2026-10-28T19:54:43.617711Z",
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
  "client_id": "bb1aad01-5f75-4ad3-b19c-7f2d2a720ba6",
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
      "id": "c7335c8d-9432-46c6-8da6-7caefbf2891d",
      "at": "2026-10-28T19:54:41.011103Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
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

`GET /api/rider/v1/orders/48496999-421e-41c4-9ce4-ba8aad0dec52/tip` → **200**

```json
{
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
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
  "available_until": "2026-10-29T19:54:43.617711Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/48496999-421e-41c4-9ce4-ba8aad0dec52/tip` → **201**

```json
{
  "command_id": "db185078-090c-43f4-9edf-54a155e17b00",
  "amount_minor": 2500
}
```

```json
{
  "id": "818811a2-6b31-41e9-bb97-f95ccd3e093a",
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:54:44.790862Z"
}
```

`GET /api/rider/v1/orders/48496999-421e-41c4-9ce4-ba8aad0dec52/tip` → **200**

```json
{
  "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
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
  "available_until": "2026-10-29T19:54:43.617711Z",
  "open": false,
  "tip": {
    "id": "818811a2-6b31-41e9-bb97-f95ccd3e093a",
    "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:54:44.790862Z"
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
      "id": "ea0ecf72-a6dc-45b5-ab5e-fe96f9d35e59",
      "at": "2026-10-28T19:54:44.035272Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
      "counterpart_id": null
    },
    {
      "id": "8505acc9-ee6b-401d-b17e-68e75738bbb7",
      "at": "2026-10-28T19:54:38.989076Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
      "counterpart_id": null
    },
    {
      "id": "47243461-9f29-4c48-b048-a8b6a0e63561",
      "at": "2026-10-28T19:54:33.92811Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
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
      "id": "3c29485f-b5aa-4132-8500-d06153977785",
      "at": "2026-10-28T19:54:46.068763Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
      "counterpart_id": null
    },
    {
      "id": "ea0ecf72-a6dc-45b5-ab5e-fe96f9d35e59",
      "at": "2026-10-28T19:54:44.035272Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "48496999-421e-41c4-9ce4-ba8aad0dec52",
      "counterpart_id": null
    },
    {
      "id": "8505acc9-ee6b-401d-b17e-68e75738bbb7",
      "at": "2026-10-28T19:54:38.989076Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
      "counterpart_id": null
    },
    {
      "id": "47243461-9f29-4c48-b048-a8b6a0e63561",
      "at": "2026-10-28T19:54:33.92811Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "07468c20-0664-4ef7-96ec-162a9e0d699f",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "30baddd8-b4d5-408a-b54e-32d6623b8f91",
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
  "last_heartbeat_at": "2026-10-28T19:54:42.741624Z",
  "last_location_at": "2026-10-28T19:54:42.741624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30baddd8-b4d5-408a-b54e-32d6623b8f91/close` → **200**

```json
{
  "command_id": "3f873328-f9be-41a4-80b7-0e70bd00aeaf",
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

Done: card order 48496999-421e-41c4-9ce4-ba8aad0dec52.

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
  "phone": "+380732329712",
  "device_ref": "sandbox-29253"
}
```

```json
{
  "challenge_id": "6fce7e72-475d-4de3-a792-41e7fed18a7e",
  "expires_at": "2026-10-28T19:59:47.838300043Z",
  "resend_available_at": "2026-10-28T19:54:48.838300043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732329712` → **200**

```json
{
  "phone": "+380732329712",
  "audience": "CLIENT",
  "code": "057608",
  "sent_at": "2026-10-28T19:54:47.841415995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fce7e72-475d-4de3-a792-41e7fed18a7e",
  "code": "057608",
  "device_ref": "sandbox-29253"
}
```

```json
{
  "session_id": "2c4ff791-16cf-4e09-b6a9-859005a9c116",
  "subject": {
    "type": "CLIENT",
    "id": "c7ffcb6c-1afe-4f0a-b156-52f774f004ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2ZmY2I2Yy0xYWZlLTRmMGEtYjE1Ni01MmY3NzRmMDA0ZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MTg4LCJpYXQiOjE3OTMyMTcyODgsImp0aSI6ImY3NjlmNmZjLWYzYTMtNDNiYS04NDcxLWQ5Mzc3NTE5YjNkNCIsInNpZCI6IjJjNGZmNzkxLTE2Y2YtNGUwOS1iNmE5LTg1OTAwNWE5YzExNiJ9.k-Kw9STkGWaHtoZLjAhdgybSZ57m0Dbn-h56EC1aN3E",
  "access_expires_at": "2026-10-28T20:09:48.150946127Z",
  "refresh_token": "qC5waNr905V8RQjeIVKuCS8ODuwBlb1Mpa0UVZr86f4",
  "refresh_expires_at": "2026-11-27T19:54:48.150305004Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b87703d6-b0a5-4819-8fc5-0e3767a55bbb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b61b98c3-5a1e-4253-892c-fe7d2e9b29aa",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b61b98c3-5a1e-4253-892c-fe7d2e9b29aa",
    "orderDate": "1793217288",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8320b32d44dce803c042fa49d0c29152",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b61b98c3-5a1e-4253-892c-fe7d2e9b29aa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732329712"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b61b98c3-5a1e-4253-892c-fe7d2e9b29aa",
  "created_at": "2026-10-28T19:54:48.428591Z",
  "expires_at": "2026-10-28T20:24:48.428591Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b61b98c3-5a1e-4253-892c-fe7d2e9b29aa` → **200**

```json
{
  "id": "b61b98c3-5a1e-4253-892c-fe7d2e9b29aa",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:54:48.428591Z",
  "expires_at": "2026-10-28T20:24:48.428591Z",
  "completed_at": "2026-10-28T19:54:48.714402Z",
  "masked_pan": "41****9850",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c7ffcb6c-1afe-4f0a-b156-52f774f004ff",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c7ffcb6c-1afe-4f0a-b156-52f774f004ff",
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
      "id": "95d3f517-92fe-4e77-bc18-12d38138d8ef",
      "at": "2026-10-28T19:54:49.086188Z",
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
  "client_id": "c7ffcb6c-1afe-4f0a-b156-52f774f004ff",
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
      "id": "95d3f517-92fe-4e77-bc18-12d38138d8ef",
      "at": "2026-10-28T19:54:49.086188Z",
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
  "device_ref": "sandbox-31583"
}
```

```json
{
  "challenge_id": "c9f1de15-ce6f-4fda-bdb6-82975cf44307",
  "expires_at": "2026-10-28T19:59:50.832746723Z",
  "resend_available_at": "2026-10-28T19:54:51.832746723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "634789",
  "sent_at": "2026-10-28T19:54:50.835305198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9f1de15-ce6f-4fda-bdb6-82975cf44307",
  "code": "634789",
  "device_ref": "sandbox-31583"
}
```

```json
{
  "session_id": "51bb99c0-b2fa-4eb8-979a-2f23c547a91c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODE5MSwiaWF0IjoxNzkzMjE3MjkxLCJqdGkiOiI5YTk5YzNhNy0yMzEzLTQyNDctYjMwOC1lYjBkYTI4YzM2NDIiLCJzaWQiOiI1MWJiOTljMC1iMmZhLTRlYjgtOTc5YS0yZjIzYzU0N2E5MWMifQ.Ys6di3B63U4J9PX5UClj9uE69NpahNyyccAA2Y1xcOo",
  "access_expires_at": "2026-10-28T20:09:51.134804691Z",
  "refresh_token": "cbWFXUqLIkkHYilM7RvEzDFGiis6l2SiJb-qcvKg2OU",
  "refresh_expires_at": "2026-11-27T19:54:51.134178385Z",
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
  "command_id": "872f5d8b-55d0-4e58-98af-b667121c86e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "6e30a3e1-5312-413c-a54c-e543a1eba173",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6e30a3e1-5312-413c-a54c-e543a1eba173",
    "orderDate": "1793217291",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0a699b6241d1d475b23a289c031f3251",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6e30a3e1-5312-413c-a54c-e543a1eba173",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6e30a3e1-5312-413c-a54c-e543a1eba173",
  "created_at": "2026-10-28T19:54:51.680444Z",
  "expires_at": "2026-10-28T20:24:51.680444Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/6e30a3e1-5312-413c-a54c-e543a1eba173` → **200**

```json
{
  "id": "6e30a3e1-5312-413c-a54c-e543a1eba173",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:54:51.680444Z",
  "expires_at": "2026-10-28T20:24:51.680444Z",
  "completed_at": "2026-10-28T19:54:51.954128Z",
  "masked_pan": "41****7658",
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
      "id": "cb174713-b0b2-4cc9-906e-6590c7bba913",
      "at": "2026-10-28T19:54:52.094555Z",
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
  "command_id": "947f9954-1bca-4d31-bfd3-521d828c166e",
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
  "correlation_id": "8fd0ec41-22af-42df-b60f-204f03c9a566"
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
  "device_ref": "sandbox-20041"
}
```

```json
{
  "challenge_id": "3044b56b-e852-4c5c-872c-228dcd97f605",
  "expires_at": "2026-10-28T19:59:52.81312057Z",
  "resend_available_at": "2026-10-28T19:54:53.81312057Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "534114",
  "sent_at": "2026-10-28T19:54:52.81549881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3044b56b-e852-4c5c-872c-228dcd97f605",
  "code": "534114",
  "device_ref": "sandbox-20041"
}
```

```json
{
  "session_id": "aa140de1-b271-45f9-9367-508d1436ea6b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODE5MywiaWF0IjoxNzkzMjE3MjkzLCJqdGkiOiIyNjI1YTE0YS03MDM2LTQ4M2YtODZlNC1kZmNlOWY3NWU4ODUiLCJzaWQiOiJhYTE0MGRlMS1iMjcxLTQ1ZjktOTM2Ny01MDhkMTQzNmVhNmIifQ.xXuWhdeFJ7ngR9435O_w9EwcGco_Q4Pvqy-jAE367P4",
  "access_expires_at": "2026-10-28T20:09:53.108520141Z",
  "refresh_token": "TvqsPnSVKgaIiMHV10EjKeq2PCz9uXVJ4G35Vv0XdqM",
  "refresh_expires_at": "2026-11-27T19:54:53.107926525Z",
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
  "command_id": "38e1916f-750a-4c73-9597-503bbceeffc5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:53Z",
    "sequence": 1793217293654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee4b5887-efdd-4a38-a618-fa046a618696",
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
  "last_heartbeat_at": "2026-10-28T19:54:53.6744Z",
  "last_location_at": "2026-10-28T19:54:53.6744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636203897",
  "device_ref": "sandbox-6549"
}
```

```json
{
  "challenge_id": "bf57302b-8384-45c0-84eb-67a5877fb9f4",
  "expires_at": "2026-10-28T19:59:53.961987236Z",
  "resend_available_at": "2026-10-28T19:54:54.961987236Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636203897` → **200**

```json
{
  "phone": "+380636203897",
  "audience": "CLIENT",
  "code": "594826",
  "sent_at": "2026-10-28T19:54:53.965124386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf57302b-8384-45c0-84eb-67a5877fb9f4",
  "code": "594826",
  "device_ref": "sandbox-6549"
}
```

```json
{
  "session_id": "51c13c2b-415f-4171-ad88-80754241982c",
  "subject": {
    "type": "CLIENT",
    "id": "c4042401-f0b3-473b-b218-c88d5269bee0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDA0MjQwMS1mMGIzLTQ3M2ItYjIxOC1jODhkNTI2OWJlZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MTk0LCJpYXQiOjE3OTMyMTcyOTQsImp0aSI6ImQ4YTU4MGQzLTkxOWYtNDE4YS1hOTlkLThmODQ0NzBmMzFkNiIsInNpZCI6IjUxYzEzYzJiLTQxNWYtNDE3MS1hZDg4LTgwNzU0MjQxOTgyYyJ9.mVUZf4Z7QjV-z-uTj9MbundcvxN4s7vGvn88-MwDXMg",
  "access_expires_at": "2026-10-28T20:09:54.285136217Z",
  "refresh_token": "_SWHQ_j81BzdJ7CqhKRcXxzVwBPPlR0Sbspd9P73tTM",
  "refresh_expires_at": "2026-11-27T19:54:54.284592417Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76ef0d5d-fc43-4b53-8075-a2bab65ae1fb",
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
  "id": "bb7d421c-21c1-4a3e-baa7-29b957a4ec6f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:59:54.566184Z",
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
  "command_id": "7f56780e-ea76-4978-b00c-0bd0cddf469a",
  "quote_id": "bb7d421c-21c1-4a3e-baa7-29b957a4ec6f",
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
  "id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4042401-f0b3-473b-b218-c88d5269bee0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:54:54.868104Z",
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
    "id": "4f88a257-b02f-458a-871b-22a512dcd1ff",
    "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
    "expires_at": "2026-10-28T19:55:09.871789Z",
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

`POST /api/driver/v1/offers/4f88a257-b02f-458a-871b-22a512dcd1ff/accept` → **200**

```json
{
  "command_id": "d020ed28-6308-4326-a0bf-37214a6d4217"
}
```

```json
{
  "id": "d7ce1b72-41b7-4211-a047-34c18236820c",
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0",
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "assignment_id": "d7ce1b72-41b7-4211-a047-34c18236820c",
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

`POST /api/driver/v1/work-sessions/ee4b5887-efdd-4a38-a618-fa046a618696/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:54:56Z",
    "sequence": 1793217296176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee4b5887-efdd-4a38-a618-fa046a618696",
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
  "last_heartbeat_at": "2026-10-28T19:54:56.036969Z",
  "last_location_at": "2026-10-28T19:54:56.036969Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0/arrive` → **200**

```json
{
  "command_id": "910fe59d-9b36-4f76-b2bc-b0a9ffb0c685",
  "expected_version": 0
}
```

```json
{
  "id": "1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0",
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "assignment_id": "d7ce1b72-41b7-4211-a047-34c18236820c",
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
  "arrived_at": "2026-10-28T19:54:56.321003Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0/start` → **200**

```json
{
  "command_id": "52c59c1c-5c52-4396-939f-a36b0c0360a4",
  "expected_version": 1
}
```

```json
{
  "id": "1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0",
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "assignment_id": "d7ce1b72-41b7-4211-a047-34c18236820c",
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
  "arrived_at": "2026-10-28T19:54:56.321003Z",
  "started_at": "2026-10-28T19:54:56.618699Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0/complete` → **200**

```json
{
  "command_id": "b3743f62-5754-4da1-988b-b07a494de425",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:54:56Z",
  "cash_received": false
}
```

```json
{
  "id": "1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0",
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "assignment_id": "d7ce1b72-41b7-4211-a047-34c18236820c",
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
  "arrived_at": "2026-10-28T19:54:56.321003Z",
  "started_at": "2026-10-28T19:54:56.618699Z",
  "completed_at": "2026-10-28T19:54:56.916659Z",
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
  "session_id": "901abea1-06a8-4d29-9326-6de8bfa55f2b",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgxOTcsImlhdCI6MTc5MzIxNzI5NywianRpIjoiYzUxNmM2ZjktNmViOS00NTNjLThmYjUtMWRhOTkwZmRjMDA0Iiwic2lkIjoiOTAxYWJlYTEtMDZhOC00ZDI5LTkzMjYtNmRlOGJmYTU1ZjJiIn0.dmFWJFO7uCgdC4vhv1DA_9MkPo2dOZNhpZbtSjZH1gQ",
  "access_expires_at": "2026-10-28T20:09:57.509108696Z",
  "refresh_token": "GDJyFho3K7WDt3VqrXdK2HR0Q6mch2ziFcXhfkh9iqk",
  "refresh_expires_at": "2026-10-29T07:54:57.508514429Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/80bfeb0d-e90b-473e-bca8-5003b22aa3c8/cash-dispute` → **200**

```json
{
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "c4042401-f0b3-473b-b218-c88d5269bee0",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:54:57.152244Z",
  "decide_by": "2026-11-11T19:54:57.152244Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-11T19:54:57.152244Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "c4042401-f0b3-473b-b218-c88d5269bee0",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-28T19:54:57.152244Z",
      "decide_by": "2026-11-11T19:54:57.152244Z",
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

`POST /api/admin/v1/orders/80bfeb0d-e90b-473e-bca8-5003b22aa3c8/cash-dispute/decide` → **400**

```json
{
  "command_id": "42eae3ea-a2dc-4692-8db2-275468f9500b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/80bfeb0d-e90b-473e-bca8-5003b22aa3c8/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b031bd3c-2235-4389-a410-cd08197222cc",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/80bfeb0d-e90b-473e-bca8-5003b22aa3c8/cash-dispute/decide` → **200**

```json
{
  "command_id": "56d93b98-c708-4457-a4dd-1dcfe34425f6",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "c4042401-f0b3-473b-b218-c88d5269bee0",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:54:57.152244Z",
  "decide_by": "2026-11-11T19:54:57.152244Z",
  "decision": "PAY_DRIVER",
  "decided_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-28T19:54:58.673388Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/80bfeb0d-e90b-473e-bca8-5003b22aa3c8/cash-dispute/decide` → **409**

```json
{
  "command_id": "f8796565-b3fd-4b9e-9256-92da96d457ef",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/80bfeb0d-e90b-473e-bca8-5003b22aa3c8/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bd99358b-e2fe-4787-855c-e136edb12a61"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee4b5887-efdd-4a38-a618-fa046a618696",
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
  "last_heartbeat_at": "2026-10-28T19:54:56.036969Z",
  "last_location_at": "2026-10-28T19:54:56.036969Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee4b5887-efdd-4a38-a618-fa046a618696/close` → **200**

```json
{
  "command_id": "297379b3-0582-41e2-82a3-3889a52713a3",
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
  "session_id": "d6168b3d-40fc-45f0-b413-eb54e730d2e3",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyMDAsImlhdCI6MTc5MzIxNzMwMCwianRpIjoiMGE1YTM2NzctYTAxOC00YmYzLWJlNjYtNWFmYTc5MDgwNzIzIiwic2lkIjoiZDYxNjhiM2QtNDBmYy00NWYwLWI0MTMtZWI1NGU3MzBkMmUzIn0.o-3RwdJQM4W43bgAimp7AXuHNQJQXqadwqSWCWFz1vk",
  "access_expires_at": "2026-10-28T20:10:00.116211091Z",
  "refresh_token": "-nqS2H6-FBNgf-e_94-EMrXF1kjsa85tUdMAp0M48VI",
  "refresh_expires_at": "2026-10-29T07:55:00.115620742Z",
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
  "phone": "+48600497628",
  "device_ref": "sandbox-7883"
}
```

```json
{
  "challenge_id": "4f336409-c171-4375-b085-94a7450e7c51",
  "expires_at": "2026-10-28T20:00:00.954782137Z",
  "resend_available_at": "2026-10-28T19:55:01.954782137Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600497628` → **200**

```json
{
  "phone": "+48600497628",
  "audience": "CLIENT",
  "code": "602849",
  "sent_at": "2026-10-28T19:55:00.957294666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f336409-c171-4375-b085-94a7450e7c51",
  "code": "602849",
  "device_ref": "sandbox-7883"
}
```

```json
{
  "session_id": "8fe2d3b5-c540-4b3e-805e-b7ad0335cf8a",
  "subject": {
    "type": "CLIENT",
    "id": "6eed9a93-1360-44cd-abd9-3c02e677e56d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWVkOWE5My0xMzYwLTQ0Y2QtYWJkOS0zYzAyZTY3N2U1NmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjAxLCJpYXQiOjE3OTMyMTczMDEsImp0aSI6IjliNWI1YmZlLTFlNmItNGZiNi1iZjgxLTE4YjE5MWI1MzlhZiIsInNpZCI6IjhmZTJkM2I1LWM1NDAtNGIzZS04MDVlLWI3YWQwMzM1Y2Y4YSJ9.mDwJDwfv6F3O0IWXMyrA9OR8C7vbjF6-CFWEaU6juCo",
  "access_expires_at": "2026-10-28T20:10:01.271555891Z",
  "refresh_token": "L7UfQHwm545U0K8ZvKo-F2IuicwgjaNYy9anq8TYHVY",
  "refresh_expires_at": "2026-11-27T19:55:01.271015445Z",
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
  "command_id": "f4720b6d-86ec-4bbf-94fb-de35ba3f4266",
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
  "correlation_id": "c710aa83-8cb7-40ca-9d16-c1ada2d00aa2",
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
  "command_id": "6ac1b838-ffa3-46ac-b4a9-c703b95a4535",
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
  "paused_at": "2026-10-28T19:55:02.386653259Z",
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
  "command_id": "7720937c-525d-48b0-a203-0e98ef2c5d4f",
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
  "id": "e08a19a9-a495-4e6e-a753-b3ae8e621f9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:02.967587Z",
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
  "command_id": "4f4f1dcb-324e-426b-b51f-eeee822f2492",
  "quote_id": "e08a19a9-a495-4e6e-a753-b3ae8e621f9e",
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
  "correlation_id": "4ae56d3c-50fc-4f0f-a065-5db7c3bc8e2f"
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
  "paused_at": "2026-10-28T19:55:02.386653Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "b5110a6e-605f-46cc-ae80-5404c097dcff",
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
  "command_id": "8f4827c3-9e55-4c39-ade5-6e45736eb454",
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
  "command_id": "242b9e05-e41b-4ccc-bcb6-116d96c3fac4",
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
  "id": "b2c34a5b-0a9c-4e29-9420-1c6b613f589e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:04.652719Z",
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
  "command_id": "96c63e44-6a09-4029-9f5e-bfe36dc95210",
  "quote_id": "b2c34a5b-0a9c-4e29-9420-1c6b613f589e",
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
  "correlation_id": "3d171d69-4924-4e35-beab-a0724f8da23e"
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
  "command_id": "4dad0832-581f-4a5f-8d2d-757e942eb8fb",
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
      "from": "22:00",
      "to": "23:00"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "ffbaa7d9-78e3-4b44-903a-453136d046f9",
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
  "id": "fe16c775-c614-4f64-a61e-34088ddaecfa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:05.801842Z",
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
  "command_id": "e013d9f1-a6e5-431f-a00a-764b3a9d7633",
  "quote_id": "fe16c775-c614-4f64-a61e-34088ddaecfa",
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
  "correlation_id": "b02f0448-3955-4699-adfe-8769b92335b6"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "3892927e-1351-41ea-9094-684c0694896a",
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
  "correlation_id": "c5aeef20-d3a2-4e76-b8e3-a6effe46ed89"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "46c67ec4-d308-4b95-b0fb-df63b1f4e5f1",
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
  "phone": "+380677850779",
  "device_ref": "sandbox-32213"
}
```

```json
{
  "challenge_id": "a772cdb5-00ef-4204-ab8e-5799e190820e",
  "expires_at": "2026-10-28T20:00:07.264945136Z",
  "resend_available_at": "2026-10-28T19:55:08.264945136Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677850779` → **200**

```json
{
  "phone": "+380677850779",
  "audience": "CLIENT",
  "code": "724162",
  "sent_at": "2026-10-28T19:55:07.267606091Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a772cdb5-00ef-4204-ab8e-5799e190820e",
  "code": "724162",
  "device_ref": "sandbox-32213"
}
```

```json
{
  "session_id": "923f9f0e-1368-4477-a141-a22fd9e7586a",
  "subject": {
    "type": "CLIENT",
    "id": "4744a896-fd98-4a5a-a571-f3489edcec7e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzQ0YTg5Ni1mZDk4LTRhNWEtYTU3MS1mMzQ4OWVkY2VjN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjA3LCJpYXQiOjE3OTMyMTczMDcsImp0aSI6ImM2Yjk5MjU1LTI4OTMtNDVjOC1iOTMzLWFlNGI5OTIxZWQ0OSIsInNpZCI6IjkyM2Y5ZjBlLTEzNjgtNDQ3Ny1hMTQxLWEyMmZkOWU3NTg2YSJ9.nAINKlutGmdhMQwWREpDmdAfZ6J0HVvFV0btaxtVXz8",
  "access_expires_at": "2026-10-28T20:10:07.575370387Z",
  "refresh_token": "gMbQgpvWrPTOnZZcPMIYJORP_9KCR9ac0RsRwhJlnz8",
  "refresh_expires_at": "2026-11-27T19:55:07.574531946Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4744a896-fd98-4a5a-a571-f3489edcec7e",
  "session_id": "923f9f0e-1368-4477-a141-a22fd9e7586a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "015f746f-742c-4cbe-9353-c6174886846d",
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
  "id": "f697781d-ee16-4976-8103-4d17da0e191a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:08.128999Z",
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
  "challenge_id": "e8bd9064-7605-46ac-ba5f-a55c9339f683",
  "expires_at": "2026-10-28T20:00:10.408137889Z",
  "resend_available_at": "2026-10-28T19:55:11.408137889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677850779` → **200**

```json
{
  "phone": "+380677850779",
  "audience": "CLIENT",
  "code": "180813",
  "sent_at": "2026-10-28T19:55:10.410241913Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "9059eaeb-5681-490d-93a9-826ba50ea2f5",
  "challenge_id": "e8bd9064-7605-46ac-ba5f-a55c9339f683",
  "otp_code": "180813"
}
```

```json
{
  "client_id": "4744a896-fd98-4a5a-a571-f3489edcec7e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T19:55:10.709950436Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0e556faa-e297-434e-8025-d49615b579fa",
  "quote_id": "f697781d-ee16-4976-8103-4d17da0e191a",
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
  "correlation_id": "0df1fb3e-9f1f-44d5-819e-3dc1351b2096"
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
  "session_id": "29bc7c11-3451-4b03-b7b5-7b4b825e655d",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyMTEsImlhdCI6MTc5MzIxNzMxMSwianRpIjoiNmM2ZmU0M2MtMGJhYy00OThjLThlY2UtY2M3NThhYTBhYmMwIiwic2lkIjoiMjliYzdjMTEtMzQ1MS00YjAzLWI3YjUtN2I0YjgyNWU2NTVkIn0.WFIg9Yo1V4kBd9OtBIPV5iMrUiA_KpglENSNnMYv_Aw",
  "access_expires_at": "2026-10-28T20:10:11.568407139Z",
  "refresh_token": "oD4dYg5H2A4R_4-jXV79Y_44rt1fE06JFQMgyH01tgA",
  "refresh_expires_at": "2026-10-29T07:55:11.56787582Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4744a896-fd98-4a5a-a571-f3489edcec7e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T19:55:10.70995Z",
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

`POST /api/admin/v1/client-deletions/4744a896-fd98-4a5a-a571-f3489edcec7e/complete` → **200**

```json
{
  "command_id": "1ef78f86-8ead-4883-a0db-fe8e9a496e58",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4744a896-fd98-4a5a-a571-f3489edcec7e",
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
  "correlation_id": "1bc7148a-7e3c-4c0e-8f32-771484ef79b0"
}
```

Done: client 4744a896-fd98-4a5a-a571-f3489edcec7e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669158112",
  "device_ref": "sandbox-1221"
}
```

```json
{
  "challenge_id": "6aee4122-a204-4c57-8306-945c23fff283",
  "expires_at": "2026-10-28T20:00:12.707148848Z",
  "resend_available_at": "2026-10-28T19:55:13.707148848Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669158112` → **200**

```json
{
  "phone": "+380669158112",
  "audience": "CLIENT",
  "code": "261687",
  "sent_at": "2026-10-28T19:55:12.709855703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6aee4122-a204-4c57-8306-945c23fff283",
  "code": "261687",
  "device_ref": "sandbox-1221"
}
```

```json
{
  "session_id": "efac1666-9b8f-4840-bf35-924224b62665",
  "subject": {
    "type": "CLIENT",
    "id": "88b27864-2064-4edd-9714-d597b0816d4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGIyNzg2NC0yMDY0LTRlZGQtOTcxNC1kNTk3YjA4MTZkNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjEzLCJpYXQiOjE3OTMyMTczMTMsImp0aSI6IjYwZDUzZjg1LTJmZjEtNGQ4YS1iYzI5LWY5OTYwMDY0NzBjNyIsInNpZCI6ImVmYWMxNjY2LTliOGYtNDg0MC1iZjM1LTkyNDIyNGI2MjY2NSJ9.zJCpC0TfjDeLQf9jUAK2t6gKJs7qp-yOV2ZUlO-0Wr8",
  "access_expires_at": "2026-10-28T20:10:13.00597057Z",
  "refresh_token": "Yxj6Irrp9duqgllAt_U23ky6dqh8_HTKvIKk26FPYqY",
  "refresh_expires_at": "2026-11-27T19:55:13.00543299Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "88b27864-2064-4edd-9714-d597b0816d4f",
  "session_id": "efac1666-9b8f-4840-bf35-924224b62665",
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
  "session_id": "dbe15060-347f-4fa5-b33c-0b1b7b37d402",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyMTMsImlhdCI6MTc5MzIxNzMxMywianRpIjoiOWY3OTcyYjUtOTViZi00YzlkLWFhZjQtYzQ4OWU5MjY4MWY2Iiwic2lkIjoiZGJlMTUwNjAtMzQ3Zi00ZmE1LWIzM2MtMGIxYjdiMzdkNDAyIn0.jP8sk6OgTgNPN0w7X34GlP2zRqyTqIzwco_ew3byLQI",
  "access_expires_at": "2026-10-28T20:10:13.835781488Z",
  "refresh_token": "Yfm1DzwNYMgE4Pek5m9jm3yMauqkKUppv-l1T19z5UE",
  "refresh_expires_at": "2026-10-29T07:55:13.835237917Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9158112&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "88b27864-2064-4edd-9714-d597b0816d4f",
      "phone": "+380669158112",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T19:55:13.003675Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/88b27864-2064-4edd-9714-d597b0816d4f` → **200**

```json
{
  "client": {
    "id": "88b27864-2064-4edd-9714-d597b0816d4f",
    "phone": "+380669158112",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:55:13.003675Z",
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

`POST /api/admin/v1/clients/88b27864-2064-4edd-9714-d597b0816d4f/block` → **400**

```json
{
  "command_id": "be1edcec-362e-43fc-986b-ee9260316f40",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/88b27864-2064-4edd-9714-d597b0816d4f/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6fe179df-6feb-48e5-8edf-39877d53b0da",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/88b27864-2064-4edd-9714-d597b0816d4f/block` → **200**

```json
{
  "command_id": "cebb7809-aa4b-41cd-896e-3ef657ae1e78",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "88b27864-2064-4edd-9714-d597b0816d4f",
  "phone": "+380669158112",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T19:55:13.003675Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T19:55:15.016118Z",
    "by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
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
  "correlation_id": "a91c69fb-f61a-4c9d-bf15-396a41877290"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669158112",
  "device_ref": "sandbox-21126"
}
```

```json
{
  "challenge_id": "18ba89cd-6dbd-46d0-80cf-99a809806b8f",
  "expires_at": "2026-10-28T20:00:17.589843422Z",
  "resend_available_at": "2026-10-28T19:55:18.589843422Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669158112` → **200**

```json
{
  "phone": "+380669158112",
  "audience": "CLIENT",
  "code": "646547",
  "sent_at": "2026-10-28T19:55:17.595088829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "18ba89cd-6dbd-46d0-80cf-99a809806b8f",
  "code": "646547",
  "device_ref": "sandbox-21126"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "5015fb04-1fe7-4372-b905-07ff77d4b00a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/88b27864-2064-4edd-9714-d597b0816d4f` → **200**

```json
{
  "client": {
    "id": "88b27864-2064-4edd-9714-d597b0816d4f",
    "phone": "+380669158112",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T19:55:13.003675Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T19:55:15.016118Z",
      "by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
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

`POST /api/admin/v1/clients/88b27864-2064-4edd-9714-d597b0816d4f/unblock` → **200**

```json
{
  "command_id": "e2cf6fbe-1350-444c-b5ab-eb4651ca7efa",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "88b27864-2064-4edd-9714-d597b0816d4f",
  "phone": "+380669158112",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T19:55:13.003675Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669158112",
  "device_ref": "sandbox-5828"
}
```

```json
{
  "challenge_id": "327846ed-7dec-4f93-84f0-6fc29177374c",
  "expires_at": "2026-10-28T20:00:20.800488845Z",
  "resend_available_at": "2026-10-28T19:55:21.800488845Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669158112` → **200**

```json
{
  "phone": "+380669158112",
  "audience": "CLIENT",
  "code": "285516",
  "sent_at": "2026-10-28T19:55:20.802942221Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "327846ed-7dec-4f93-84f0-6fc29177374c",
  "code": "285516",
  "device_ref": "sandbox-5828"
}
```

```json
{
  "session_id": "19e6bda4-347c-4e0d-9752-ef87c55e4cc5",
  "subject": {
    "type": "CLIENT",
    "id": "88b27864-2064-4edd-9714-d597b0816d4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGIyNzg2NC0yMDY0LTRlZGQtOTcxNC1kNTk3YjA4MTZkNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjIxLCJpYXQiOjE3OTMyMTczMjEsImp0aSI6IjMzYTdmYjY0LTdhZWYtNDkwYS05ZTBkLThkMGZhN2MyYThlZSIsInNpZCI6IjE5ZTZiZGE0LTM0N2MtNGUwZC05NzUyLWVmODdjNTVlNGNjNSJ9.MM1ETQ1dXypDRj94djefB2Uu5d4BIV2H1RFPS9CPLz0",
  "access_expires_at": "2026-10-28T20:10:21.101468892Z",
  "refresh_token": "U67oO-I6IXdTYdKkMUJYqIEEAc_cKGP722AIHGVjOCM",
  "refresh_expires_at": "2026-11-27T19:55:21.100841303Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "88b27864-2064-4edd-9714-d597b0816d4f",
  "session_id": "19e6bda4-347c-4e0d-9752-ef87c55e4cc5",
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
  "phone": "+380667889084",
  "device_ref": "sandbox-11621"
}
```

```json
{
  "challenge_id": "ddd37da7-706a-4859-8aa7-4032b0a6fa9b",
  "expires_at": "2026-10-28T20:00:21.664406512Z",
  "resend_available_at": "2026-10-28T19:55:22.664406512Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667889084` → **200**

```json
{
  "phone": "+380667889084",
  "audience": "CLIENT",
  "code": "043664",
  "sent_at": "2026-10-28T19:55:21.666941127Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddd37da7-706a-4859-8aa7-4032b0a6fa9b",
  "code": "043664",
  "device_ref": "sandbox-11621"
}
```

```json
{
  "session_id": "5498c89d-2e98-4400-94e0-a9c341405700",
  "subject": {
    "type": "CLIENT",
    "id": "ad9cdc80-32e1-4174-846f-8b2b70a19f6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDljZGM4MC0zMmUxLTQxNzQtODQ2Zi04YjJiNzBhMTlmNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjIxLCJpYXQiOjE3OTMyMTczMjEsImp0aSI6ImI0OWZhNzRhLWU1NmMtNDIzNy1hYTg2LTRkZDQxZTBjNGFhNiIsInNpZCI6IjU0OThjODlkLTJlOTgtNDQwMC05NGUwLWE5YzM0MTQwNTcwMCJ9._4npy1-L71mScUbqQnUKz7VIS5OuOkDiP3iWLXC1Gq0",
  "access_expires_at": "2026-10-28T20:10:21.965386197Z",
  "refresh_token": "Oi9Vi4WVUCV7sSN5hTT_PcHmlMnC-pWehy45VO0ZiyQ",
  "refresh_expires_at": "2026-11-27T19:55:21.964839099Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1a8f1dcc-5e01-4c8f-8335-2df11c2b96d9",
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
  "id": "431fcf8f-2839-4f16-9fe6-cfc4eeb47e5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:22.259704Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 6a8910f2-616b-4c2c-b497-345727f93bac) → **201**

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
  "session_id": "acc8e297-29a9-45b3-84c0-a8155ba37895",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyMjIsImlhdCI6MTc5MzIxNzMyMiwianRpIjoiMTM3MzgyYTAtYjI3Ni00Y2U5LWFlZGMtZDZlZjUwYmQxODY4Iiwic2lkIjoiYWNjOGUyOTctMjlhOS00NWIzLTg0YzAtYTgxNTViYTM3ODk1In0.a1E8difGLvFbM8OezNO95tLfLbxEtnzBKzPyKhTAUAw",
  "access_expires_at": "2026-10-28T20:10:22.88045402Z",
  "refresh_token": "lZr2YI94VtggzOZZxQPQGj6lgxr182Q-iYwzajfoSlk",
  "refresh_expires_at": "2026-10-29T07:55:22.879958468Z",
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
  "session_id": "bf67a1ce-6164-4263-b37a-46236b5eb352",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyMjMsImlhdCI6MTc5MzIxNzMyMywianRpIjoiZmI5ZTFhYTctOTE3NC00OWFjLWFiYzItNGIyMzcyODQzZTM4Iiwic2lkIjoiYmY2N2ExY2UtNjE2NC00MjYzLWIzN2EtNDYyMzZiNWViMzUyIn0.KdHVZVLIVRYzDeEvb29dP70r5kXBDgEA6nTQPdQLyTo",
  "access_expires_at": "2026-10-28T20:10:23.452498688Z",
  "refresh_token": "26aRo4d994Cf23ntZ8ajkcg-avGhnpY6TMcK9DxzGHQ",
  "refresh_expires_at": "2026-10-29T07:55:23.451976095Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a2167ebe-a96d-493b-a9e9-b753897c6cc7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:55:22.549205Z",
      "actor": {
        "type": "CLIENT",
        "id": "ad9cdc80-32e1-4174-846f-8b2b70a19f6a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
        "quote_id": "431fcf8f-2839-4f16-9fe6-cfc4eeb47e5d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6a8910f2-616b-4c2c-b497-345727f93bac"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:55:22.550956Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
        "attempt_id": "7a5cc94d-0407-43f1-9736-1fd6da7a2387",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6a8910f2-616b-4c2c-b497-345727f93bac"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T19:55:22.558902Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
        "attempt_id": "7a5cc94d-0407-43f1-9736-1fd6da7a2387"
      },
      "correlation_id": "6a8910f2-616b-4c2c-b497-345727f93bac"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "7a5cc94d-0407-43f1-9736-1fd6da7a2387",
        "generation": 1,
        "started_at": "2026-10-28T19:55:22.55011Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T19:55:22.558902Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T19:55:22.553103Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/6a8910f2-616b-4c2c-b497-345727f93bac` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7:0",
      "order_id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
      "at": "2026-10-28T19:55:22.549205Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7:1",
      "order_id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
      "at": "2026-10-28T19:55:22.550956Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7:2",
      "order_id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
      "at": "2026-10-28T19:55:22.558902Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/14d27310-91d5-47b2-aea8-85f4a788b502` → **200**

```json
{
  "found": []
}
```

Done: request 6a8910f2-616b-4c2c-b497-345727f93bac — order a2167ebe-a96d-493b-a9e9-b753897c6cc7 found by its id.

`GET /api/rider/v1/orders/a2167ebe-a96d-493b-a9e9-b753897c6cc7` → **200**

```json
{
  "id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad9cdc80-32e1-4174-846f-8b2b70a19f6a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:55:22.548743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a2167ebe-a96d-493b-a9e9-b753897c6cc7/cancel` → **200**

```json
{
  "command_id": "ef0d5e52-5cdc-46d5-a785-6350a983f4c4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a2167ebe-a96d-493b-a9e9-b753897c6cc7",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad9cdc80-32e1-4174-846f-8b2b70a19f6a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:55:22.548743Z",
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
  "phone": "+380631827545",
  "device_ref": "sandbox-26199"
}
```

```json
{
  "challenge_id": "e8568f52-6ac2-4e14-9718-c474f4e36e43",
  "expires_at": "2026-10-28T20:00:25.17802083Z",
  "resend_available_at": "2026-10-28T19:55:26.17802083Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631827545` → **200**

```json
{
  "phone": "+380631827545",
  "audience": "CLIENT",
  "code": "182258",
  "sent_at": "2026-10-28T19:55:25.180286128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8568f52-6ac2-4e14-9718-c474f4e36e43",
  "code": "182258",
  "device_ref": "sandbox-26199"
}
```

```json
{
  "session_id": "cacbd45c-30d0-47cd-8eec-493ade2f45c8",
  "subject": {
    "type": "CLIENT",
    "id": "e90b91e5-3660-46e6-aa37-97bb58de1f5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTBiOTFlNS0zNjYwLTQ2ZTYtYWEzNy05N2JiNThkZTFmNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjI1LCJpYXQiOjE3OTMyMTczMjUsImp0aSI6ImMyNDNjNDYyLTQ0ZTQtNGUzYi1iYmQ5LTYwNzdmYWQ0ODZhYSIsInNpZCI6ImNhY2JkNDVjLTMwZDAtNDdjZC04ZWVjLTQ5M2FkZTJmNDVjOCJ9.cu9mlW-0BjmcnzNsEhIquiESaXpCuvxuVSpyMbyeuAU",
  "access_expires_at": "2026-10-28T20:10:25.482622612Z",
  "refresh_token": "30oGBpzysOiSmFL8-eds2iys2ayu4fSgCXq3JNRA_Ns",
  "refresh_expires_at": "2026-11-27T19:55:25.482085753Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a0c3c310-4819-421b-bae8-112f7ac20220",
  "expires_at": "2026-10-28T20:00:27.793278048Z",
  "resend_available_at": "2026-10-28T19:55:28.793278048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631827545` → **200**

```json
{
  "phone": "+380631827545",
  "audience": "CLIENT",
  "code": "803027",
  "sent_at": "2026-10-28T19:55:27.795440731Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "4ebcead8-efed-4129-a0a9-e7b7ea8a0946",
  "challenge_id": "a0c3c310-4819-421b-bae8-112f7ac20220",
  "otp_code": "803027"
}
```

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "PENDING",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432` → **200**

```json
{
  "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
  "state": "READY",
  "created_at": "2026-10-28T19:55:28.110687Z",
  "ready_at": "2026-10-28T19:55:37.325121Z",
  "expires_at": "2026-11-04T19:55:37.325121Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639653301",
  "device_ref": "sandbox-7617"
}
```

```json
{
  "challenge_id": "7e9d9008-f212-4670-9853-10ec7ce24147",
  "expires_at": "2026-10-28T20:00:38.888978959Z",
  "resend_available_at": "2026-10-28T19:55:39.888978959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639653301` → **200**

```json
{
  "phone": "+380639653301",
  "audience": "CLIENT",
  "code": "768249",
  "sent_at": "2026-10-28T19:55:38.891663688Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e9d9008-f212-4670-9853-10ec7ce24147",
  "code": "768249",
  "device_ref": "sandbox-7617"
}
```

```json
{
  "session_id": "c67ef2ee-f9e9-4a42-a6ff-01fa9d4cbcc1",
  "subject": {
    "type": "CLIENT",
    "id": "d772d4c4-70ee-48ad-8822-b3cdb2d26dfd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzcyZDRjNC03MGVlLTQ4YWQtODgyMi1iM2NkYjJkMjZkZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjM5LCJpYXQiOjE3OTMyMTczMzksImp0aSI6IjIxYWJlODQ1LWU2YWUtNGE5My1iYmJmLTI4MThhOTk3ZDlhNSIsInNpZCI6ImM2N2VmMmVlLWY5ZTktNGE0Mi1hNmZmLTAxZmE5ZDRjYmNjMSJ9.F0oe3UY_9B-eW5TWvw00ZIeGx-xnsrQFA0jgFR7gjq4",
  "access_expires_at": "2026-10-28T20:10:39.191322958Z",
  "refresh_token": "kM_8aVmlT7vVytruKJylc5xW87-aszj9Mz7cytZORhE",
  "refresh_expires_at": "2026-11-27T19:55:39.190765239Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/13fe00f7-2cf0-4014-9fb1-7522c5107432/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "86d70f9f-682e-463f-b954-daebb29ec250"
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
  "session_id": "239de9da-cd1f-409d-ab9c-d46a183c72e6",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNDAsImlhdCI6MTc5MzIxNzM0MCwianRpIjoiNzJmMDk2MjktY2FhMS00YjllLTllY2YtYjFiMzllMjkyYjhjIiwic2lkIjoiMjM5ZGU5ZGEtY2QxZi00MDlkLWFiOWMtZDQ2YTE4M2M3MmU2In0.14yil2m4luI56VjoWxl0RKqZ3_9c-0RndP99KZ3i-EI",
  "access_expires_at": "2026-10-28T20:10:40.030688866Z",
  "refresh_token": "pXZE95zvsmykhxhNJG7cragdqWs9vbcR9LUvvrUTDiM",
  "refresh_expires_at": "2026-10-29T07:55:40.030097135Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e90b91e5-3660-46e6-aa37-97bb58de1f5e",
  "session_id": "cacbd45c-30d0-47cd-8eec-493ade2f45c8",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e90b91e5-3660-46e6-aa37-97bb58de1f5e/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "13fe00f7-2cf0-4014-9fb1-7522c5107432",
      "state": "READY",
      "created_at": "2026-10-28T19:55:28.110687Z",
      "ready_at": "2026-10-28T19:55:37.325121Z",
      "expires_at": "2026-11-04T19:55:37.325121Z",
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
  "device_ref": "sandbox-3209"
}
```

```json
{
  "challenge_id": "f6ba5b68-5cab-4fe4-9c42-f18e3c345cf4",
  "expires_at": "2026-10-28T20:00:40.867505379Z",
  "resend_available_at": "2026-10-28T19:55:41.867505379Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "026116",
  "sent_at": "2026-10-28T19:55:40.86996083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6ba5b68-5cab-4fe4-9c42-f18e3c345cf4",
  "code": "026116",
  "device_ref": "sandbox-3209"
}
```

```json
{
  "session_id": "9d18aa0c-002c-4e45-9130-dac189910c87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI0MSwiaWF0IjoxNzkzMjE3MzQxLCJqdGkiOiIyMjlmN2ZkMy1lZWI4LTRlNDYtOTJmZS1lZjZhN2ZhMjEyMjMiLCJzaWQiOiI5ZDE4YWEwYy0wMDJjLTRlNDUtOTEzMC1kYWMxODk5MTBjODcifQ.GBTtJ-k0pAVxD011dpuzVjjnmNSNp0U6FBMwgJo_qKQ",
  "access_expires_at": "2026-10-28T20:10:41.180174746Z",
  "refresh_token": "cP7LzHI0Y0BulJcfYNpPVi062QeK-827eYqJFPZckWY",
  "refresh_expires_at": "2026-11-27T19:55:41.179613572Z",
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
  "device_ref": "sandbox-11319"
}
```

```json
{
  "challenge_id": "e0b82e21-5977-42f6-b3ad-be18f9bd5a68",
  "expires_at": "2026-10-28T20:00:41.723035286Z",
  "resend_available_at": "2026-10-28T19:55:42.723035286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "661622",
  "sent_at": "2026-10-28T19:55:41.726220003Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0b82e21-5977-42f6-b3ad-be18f9bd5a68",
  "code": "661622",
  "device_ref": "sandbox-11319"
}
```

```json
{
  "session_id": "a5dddd33-143d-47bd-a7cd-2d2c8a27c2a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI0MiwiaWF0IjoxNzkzMjE3MzQyLCJqdGkiOiI2ZTIxMDI5My1hMTcxLTQ3YzctOGIwNS0yN2E2ZGZjMWQ5YTUiLCJzaWQiOiJhNWRkZGQzMy0xNDNkLTQ3YmQtYTdjZC0yZDJjOGEyN2MyYTkifQ.-WEkqtQFnHkOeCUsit3Zl40hlGPaiwVomONFV_R4Rks",
  "access_expires_at": "2026-10-28T20:10:42.026554591Z",
  "refresh_token": "owchxr7UzDMkJ9bMDum_5ux-kZRjLC4Ur8xeZgeWdj8",
  "refresh_expires_at": "2026-11-27T19:55:42.026020686Z",
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
  "command_id": "8a149c4c-c69c-4b63-9aa7-ec9dfcedc24b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:55:42Z",
    "sequence": 1793217342572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08f1d4db-7e0d-4976-9f2e-4673e8a91619",
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
  "last_heartbeat_at": "2026-10-28T19:55:42.591535Z",
  "last_location_at": "2026-10-28T19:55:42.591535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9288"
}
```

```json
{
  "challenge_id": "6ee8ec10-f9c4-4cb8-a813-fa1e6b5e29ba",
  "expires_at": "2026-10-28T20:00:42.869763124Z",
  "resend_available_at": "2026-10-28T19:55:43.869763124Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "414491",
  "sent_at": "2026-10-28T19:55:42.872089005Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ee8ec10-f9c4-4cb8-a813-fa1e6b5e29ba",
  "code": "414491",
  "device_ref": "sandbox-9288"
}
```

```json
{
  "session_id": "97cd8084-4c98-45cb-94fe-722b57e51193",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI0MywiaWF0IjoxNzkzMjE3MzQzLCJqdGkiOiJkNjQwOTFjZi02OGM0LTQzYzAtYmQzOC0wYzI4YTUwMDJkNGQiLCJzaWQiOiI5N2NkODA4NC00Yzk4LTQ1Y2ItOTRmZS03MjJiNTdlNTExOTMifQ.0tWibKGq7PgidCx3Hzuelc5rMZ9VoSi8ynuBc9mtIDk",
  "access_expires_at": "2026-10-28T20:10:43.172683878Z",
  "refresh_token": "JtnLZUtg5m-7qJYtTv6f2AWAVJ1VofJwSmymjDaJaSs",
  "refresh_expires_at": "2026-11-27T19:55:43.172117103Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b4544ebd-9c30-436f-9ebd-d1cd68660007",
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
  "last_heartbeat_at": "2026-10-28T19:54:21.801435Z",
  "last_location_at": "2026-10-28T19:54:21.801435Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b4544ebd-9c30-436f-9ebd-d1cd68660007/handover` → **200**

```json
{
  "command_id": "077c9be5-ca5a-44e4-987d-8392fc805a8c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b4544ebd-9c30-436f-9ebd-d1cd68660007",
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
  "last_heartbeat_at": "2026-10-28T19:54:21.801435Z",
  "last_location_at": "2026-10-28T19:54:21.801435Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b4544ebd-9c30-436f-9ebd-d1cd68660007/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:55:44Z",
    "sequence": 1793217344981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b4544ebd-9c30-436f-9ebd-d1cd68660007",
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
  "last_heartbeat_at": "2026-10-28T19:55:44.029411Z",
  "last_location_at": "2026-10-28T19:55:44.029411Z",
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
  "session_id": "8f6e29b7-0457-4143-b407-841bc7f45aef",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNDQsImlhdCI6MTc5MzIxNzM0NCwianRpIjoiYjM1MTE0MjItN2ZkNS00ZmU2LWI0NzUtODVhZWY1NjU1MGJmIiwic2lkIjoiOGY2ZTI5YjctMDQ1Ny00MTQzLWI0MDctODQxYmM3ZjQ1YWVmIn0.w_qe7Sr_CLPOX-DNm-QfIK7fzjLQn66MRK4AG_xpDzw",
  "access_expires_at": "2026-10-28T20:10:44.590175248Z",
  "refresh_token": "wafVtwbDkYnxvSslZTrB-0LcvICKQyK5MclTIvkh-A4",
  "refresh_expires_at": "2026-10-29T07:55:44.58963358Z",
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
  "session_id": "ec9a3eab-c605-4899-b023-5aefcfa9bbb5",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNDUsImlhdCI6MTc5MzIxNzM0NSwianRpIjoiMjVhODFlZDYtMDI4MS00ODYyLWE2ODUtMDBmYTgxZWUyOTUyIiwic2lkIjoiZWM5YTNlYWItYzYwNS00ODk5LWIwMjMtNWFlZmNmYTliYmI1In0.ZTBYHKsygf8O84oYWG4vNgNsE_4oQL2A8UYCR3fpL5U",
  "access_expires_at": "2026-10-28T20:10:45.151037875Z",
  "refresh_token": "fFWRB6hx7HJYE8tudOn5ofCjFepkgscf6UCKZl72sis",
  "refresh_expires_at": "2026-10-29T07:55:45.150424012Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680645411",
  "device_ref": "sandbox-24349"
}
```

```json
{
  "challenge_id": "34d0a828-3304-4c75-b652-837a333d2758",
  "expires_at": "2026-10-28T20:00:45.429898721Z",
  "resend_available_at": "2026-10-28T19:55:46.429898721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680645411` → **200**

```json
{
  "phone": "+380680645411",
  "audience": "CLIENT",
  "code": "286965",
  "sent_at": "2026-10-28T19:55:45.432324076Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34d0a828-3304-4c75-b652-837a333d2758",
  "code": "286965",
  "device_ref": "sandbox-24349"
}
```

```json
{
  "session_id": "c0385ade-4157-45a8-9ce9-3d2bc6e5a225",
  "subject": {
    "type": "CLIENT",
    "id": "656ad301-f8c0-49a1-b247-529001525bc6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTZhZDMwMS1mOGMwLTQ5YTEtYjI0Ny01MjkwMDE1MjViYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjQ1LCJpYXQiOjE3OTMyMTczNDUsImp0aSI6Ijg1ZTM5NGQ4LTkyMzEtNDFkYS1hZDAyLTllZGJhNDUzNWI4NCIsInNpZCI6ImMwMzg1YWRlLTQxNTctNDVhOC05Y2U5LTNkMmJjNmU1YTIyNSJ9.xkl0vbFPI-zxW1yQaaY3UDzWBTLbD8LUhywDjDH7fJo",
  "access_expires_at": "2026-10-28T20:10:45.731741326Z",
  "refresh_token": "OtxMKsLhR3ZxFg02WnTKsMW0OktxeJ6Fnp7wrP6IIJ4",
  "refresh_expires_at": "2026-11-27T19:55:45.731027007Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ed6f59b-9172-4f54-a23e-aa0be1dcea96",
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
  "id": "65ce006a-6e7f-4c83-9d6f-fa7d7de50263",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:46.020125Z",
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
  "command_id": "61a79e61-2405-48cd-878b-b732e900f626",
  "quote_id": "65ce006a-6e7f-4c83-9d6f-fa7d7de50263",
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
  "id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "656ad301-f8c0-49a1-b247-529001525bc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:55:46.312677Z",
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
    "id": "dda1c92c-f158-4438-88f8-8d07a5072782",
    "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
    "expires_at": "2026-10-28T19:56:01.316505Z",
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

`POST /api/driver/v1/offers/dda1c92c-f158-4438-88f8-8d07a5072782/reject` → **204**

```json
{
  "command_id": "10ae2f0b-5345-49f4-8a74-0a883d3de65d"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "332dd18f-1e29-46c9-b135-f9904d32628d",
    "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
    "expires_at": "2026-10-28T19:56:01.90244Z",
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

`POST /api/driver/v1/offers/332dd18f-1e29-46c9-b135-f9904d32628d/accept` → **200**

```json
{
  "command_id": "d67ac05b-942c-4dc3-8563-57ce3fde4353"
}
```

```json
{
  "id": "a9e55b9e-998e-4f97-999b-33b4bed847db",
  "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eb1658a1-9b5f-4174-a984-41d238dbfdb4",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c082631e-fcf3-447b-ad08-1f77c2dda886/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:55:46.313197Z",
      "actor": {
        "type": "CLIENT",
        "id": "656ad301-f8c0-49a1-b247-529001525bc6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
        "quote_id": "65ce006a-6e7f-4c83-9d6f-fa7d7de50263",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "28e644bd-3ac9-4945-ac40-6463c4b7c772"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:55:46.315652Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
        "attempt_id": "7a14a7db-62ee-4919-bcd8-acf5b4351980",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "28e644bd-3ac9-4945-ac40-6463c4b7c772"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:55:46.322422Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dda1c92c-f158-4438-88f8-8d07a5072782",
        "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "28e644bd-3ac9-4945-ac40-6463c4b7c772"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T19:55:46.901417Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dda1c92c-f158-4438-88f8-8d07a5072782",
        "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886"
      },
      "correlation_id": "537cd2ab-66cf-49f9-8d06-1231ae287285"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c082631e-fcf3-447b-ad08-1f77c2dda886 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c082631e-fcf3-447b-ad08-1f77c2dda886` → **200**

```json
{
  "id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "656ad301-f8c0-49a1-b247-529001525bc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a9e55b9e-998e-4f97-999b-33b4bed847db",
    "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "eb1658a1-9b5f-4174-a984-41d238dbfdb4",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:55:46.312677Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c082631e-fcf3-447b-ad08-1f77c2dda886/cancel` → **200**

```json
{
  "command_id": "4aa85858-b76a-4baa-aa69-02a06ee42024",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "656ad301-f8c0-49a1-b247-529001525bc6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "a9e55b9e-998e-4f97-999b-33b4bed847db",
    "order_id": "c082631e-fcf3-447b-ad08-1f77c2dda886",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "eb1658a1-9b5f-4174-a984-41d238dbfdb4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:55:46.312677Z",
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
  "session_id": "08f1d4db-7e0d-4976-9f2e-4673e8a91619",
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
  "last_heartbeat_at": "2026-10-28T19:55:42.591535Z",
  "last_location_at": "2026-10-28T19:55:42.591535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08f1d4db-7e0d-4976-9f2e-4673e8a91619/close` → **200**

```json
{
  "command_id": "1d5121cc-3932-4181-a300-d167fe1b6550",
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
  "session_id": "b4544ebd-9c30-436f-9ebd-d1cd68660007",
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
  "last_heartbeat_at": "2026-10-28T19:55:44.029411Z",
  "last_location_at": "2026-10-28T19:55:44.029411Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4544ebd-9c30-436f-9ebd-d1cd68660007/close` → **200**

```json
{
  "command_id": "bec5a8df-82d7-4571-b116-abe92966cce9",
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
  "session_id": "d1f8590a-4bb3-4ae6-9b22-fbf619147cbf",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNDksImlhdCI6MTc5MzIxNzM0OSwianRpIjoiMjRkZjI3MTYtMDBkNi00ZDUzLThjOTgtNzE1NzI4ZmQ3YzcxIiwic2lkIjoiZDFmODU5MGEtNGJiMy00YWU2LTliMjItZmJmNjE5MTQ3Y2JmIn0.XKClZtcxxb1AAgSbFqsphUONhjF11xFsfvn1FUk3lwQ",
  "access_expires_at": "2026-10-28T20:10:49.866743273Z",
  "refresh_token": "aveUjoTJ-ByRU8v-kurvhPdkld8CJqmqTGUZHUawRqY",
  "refresh_expires_at": "2026-10-29T07:55:49.86612413Z",
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
  "command_id": "96ba66ef-d28c-40b6-ae1f-929e2c4e6108",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T19:55:50.441157Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "b8c61fdb-b785-496f-a08c-2325375c4430",
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
  "correlation_id": "ea4de76f-9a02-44c6-a482-8dfa66e79ff6"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "369357f9-5235-43a6-a44d-5ba2bf617332",
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
  "correlation_id": "6b7ea1fc-6c6b-4791-a52d-fd60fa01f9f3"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630439055",
  "device_ref": "sandbox-13068"
}
```

```json
{
  "challenge_id": "677d16bd-4e18-4516-84cd-68e8238f19a4",
  "expires_at": "2026-10-28T20:00:51.353894628Z",
  "resend_available_at": "2026-10-28T19:55:52.353894628Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630439055` → **200**

```json
{
  "phone": "+380630439055",
  "audience": "CLIENT",
  "code": "024727",
  "sent_at": "2026-10-28T19:55:51.358156705Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "677d16bd-4e18-4516-84cd-68e8238f19a4",
  "code": "024727",
  "device_ref": "sandbox-13068"
}
```

```json
{
  "session_id": "072b7d10-8bfa-47a7-a159-9fadca201d4f",
  "subject": {
    "type": "CLIENT",
    "id": "1219553b-f17f-469c-a885-83a07db5f5ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjE5NTUzYi1mMTdmLTQ2OWMtYTg4NS04M2EwN2RiNWY1YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjUxLCJpYXQiOjE3OTMyMTczNTEsImp0aSI6ImUxYzk3NGVhLWE3ZGYtNGRiMi05MTBjLTNhMmE4YWI5YTQ0MSIsInNpZCI6IjA3MmI3ZDEwLThiZmEtNDdhNy1hMTU5LTlmYWRjYTIwMWQ0ZiJ9.LjyCZzrdM9oMLRRgofGbP3WaHpL3SGbT4UB375uBfS0",
  "access_expires_at": "2026-10-28T20:10:51.655412837Z",
  "refresh_token": "eSgPuP4Lpc28uaFmes0LSlOmFB84fHEMUXlmlvmKPPw",
  "refresh_expires_at": "2026-11-27T19:55:51.654926523Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "184139f8-aa47-4fd8-b90d-facbe09c8f7f",
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
  "id": "02fd26f4-d753-400e-aaea-88eb9eee0871",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:51.931973Z",
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
  "command_id": "f7e81467-b611-4d91-ad21-291a6f304ed9",
  "quote_id": "02fd26f4-d753-400e-aaea-88eb9eee0871",
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
  "correlation_id": "5a0191fa-b27a-47ca-bd2b-9daadb7cae45"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "55ffdd07-1bdb-4a43-abf6-f6e0ca9f40be",
  "quote_id": "02fd26f4-d753-400e-aaea-88eb9eee0871",
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
  "id": "610f3e5f-2394-4d1f-a9fa-f6f3dde5d462",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1219553b-f17f-469c-a885-83a07db5f5ac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:55:52.507865Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/610f3e5f-2394-4d1f-a9fa-f6f3dde5d462/cancel` → **200**

```json
{
  "command_id": "aaced6d3-7c48-44f2-bb32-e0e4691341e4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "610f3e5f-2394-4d1f-a9fa-f6f3dde5d462",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1219553b-f17f-469c-a885-83a07db5f5ac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:55:52.507865Z",
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
  "command_id": "f95914ec-869b-40b5-b96f-6303daf2fa2e",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T19:55:53.108114Z"
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
      "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T19:55:53.108114Z"
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
  "device_ref": "sandbox-30697"
}
```

```json
{
  "challenge_id": "d600a0a3-1695-4969-a2ab-570e53f70bf7",
  "expires_at": "2026-10-28T20:00:53.957303828Z",
  "resend_available_at": "2026-10-28T19:55:54.957303828Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "799940",
  "sent_at": "2026-10-28T19:55:53.959518347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d600a0a3-1695-4969-a2ab-570e53f70bf7",
  "code": "799940",
  "device_ref": "sandbox-30697"
}
```

```json
{
  "session_id": "ec8e0d1b-83e6-4652-ad54-10d23a6e7455",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI1NCwiaWF0IjoxNzkzMjE3MzU0LCJqdGkiOiIzOWVkZTc3OC01ZjgwLTQ1MDEtYWMxZS0wZWVjNzhlMGFjZjYiLCJzaWQiOiJlYzhlMGQxYi04M2U2LTQ2NTItYWQ1NC0xMGQyM2E2ZTc0NTUifQ.qlGgZGNQAQ9zPk2Hvy65uP26OjVHVSgwVPJepfIFunE",
  "access_expires_at": "2026-10-28T20:10:54.267073254Z",
  "refresh_token": "4qntGtPjnhEHJeCIFuILIL3qwiG5drHnHi2HPVmr7Co",
  "refresh_expires_at": "2026-11-27T19:55:54.266407676Z",
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
  "command_id": "0bcc06d5-4a07-4ad9-b8c5-0380d4b564d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:55:54Z",
    "sequence": 1793217354812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:55:54.831624Z",
  "last_location_at": "2026-10-28T19:55:54.831624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677271412",
  "device_ref": "sandbox-15220"
}
```

```json
{
  "challenge_id": "f6bf7b4d-043f-4375-8141-238627485fc2",
  "expires_at": "2026-10-28T20:00:55.11119901Z",
  "resend_available_at": "2026-10-28T19:55:56.11119901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677271412` → **200**

```json
{
  "phone": "+380677271412",
  "audience": "CLIENT",
  "code": "691325",
  "sent_at": "2026-10-28T19:55:55.113505369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6bf7b4d-043f-4375-8141-238627485fc2",
  "code": "691325",
  "device_ref": "sandbox-15220"
}
```

```json
{
  "session_id": "58c198e5-af09-4953-ada5-010a1566077c",
  "subject": {
    "type": "CLIENT",
    "id": "a7124533-b9d3-4d82-8334-8fc3db4916e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzEyNDUzMy1iOWQzLTRkODItODMzNC04ZmMzZGI0OTE2ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjU1LCJpYXQiOjE3OTMyMTczNTUsImp0aSI6IjViNDFlYjUyLTQwNDctNDQ2NS04YTM4LTdkM2Y3ZGZkNzQ4OCIsInNpZCI6IjU4YzE5OGU1LWFmMDktNDk1My1hZGE1LTAxMGExNTY2MDc3YyJ9.U-DD2xjFuBp4uyPEXVZp6zzWUjVS_ECdNC_vIgiEtcc",
  "access_expires_at": "2026-10-28T20:10:55.414873228Z",
  "refresh_token": "lTwDevpV_ELJgvBp_5UI3aLsKek9CJHEMuKVxpcr-7Q",
  "refresh_expires_at": "2026-11-27T19:55:55.414360184Z",
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
  "command_id": "fbe01ff4-ae56-4261-8bb5-8acc51d0dda3",
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
  "id": "5938ae66-60e6-4ca0-a706-560db7730525",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:00:55.971595Z",
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
  "command_id": "804023cd-d5d5-4b6d-a7a7-f0b47b039db9",
  "platform": "ANDROID",
  "token": "sandbox-driver-a00cba7b-1692-44c4-a788-87cb20d505fa"
}
```

```json
{
  "id": "349c32df-c49d-495e-ac72-07e6b0fddf45",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:55:56.279444Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "2dae7737-e41c-4e93-a155-ce480cc5a1d8",
  "platform": "ANDROID",
  "token": "sandbox-rider-5b56ce1b-f28a-4b84-8d17-67834264e0de"
}
```

```json
{
  "id": "c9bede59-7e4f-4482-b7f6-7a14f29cc6d7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:55:56.555791Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "672acfba-083e-4171-93e4-63a397bc822a",
  "quote_id": "5938ae66-60e6-4ca0-a706-560db7730525",
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
  "id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a7124533-b9d3-4d82-8334-8fc3db4916e2",
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
  "created_at": "2026-10-28T19:55:56.845453Z",
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
    "id": "9bcd0b06-6b23-4b65-9647-8db7820643b9",
    "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
    "expires_at": "2026-10-28T19:56:11.849052Z",
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

`POST /api/driver/v1/offers/9bcd0b06-6b23-4b65-9647-8db7820643b9/accept` → **200**

```json
{
  "command_id": "dc5e28b3-146d-4d33-aeac-cad032a25076"
}
```

```json
{
  "id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T19:55:56.820Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T19:55:56.820Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:55:57.757333437Z",
    "token_suffix": "d505fa",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
      "order_version": "2",
      "event_id": "fec7bf18-d957-4b82-9b1f-cfe148f60f06",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677271412&after=2026-10-28T19:55:56.820Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:55:58.762656306Z",
    "token_suffix": "64e0de",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
      "order_version": "3",
      "event_id": "1d89ecb7-1a69-4e46-8476-024e89fa7fdd",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b2904ae8-2972-4a2a-920c-0e8310e3cb77/messages` → **201**

```json
{
  "command_id": "332a569c-ec64-4d72-a691-cea363fb6009",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "e6d9ee0c-e364-4ef1-b60c-28c3d1dc824f",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T19:55:58.818817048Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "assignment_id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
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

`POST /api/driver/v1/trips/cde17bdb-5506-4367-893e-9b62838ba6a9/messages` → **201**

```json
{
  "command_id": "4902379f-bc89-45e3-9a37-c0ffe20e23d2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a67af386-7082-4d60-abcc-5c1fa19530ab",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T19:55:59.378077153Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b2904ae8-2972-4a2a-920c-0e8310e3cb77/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/cde17bdb-5506-4367-893e-9b62838ba6a9/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677271412"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:00Z",
    "sequence": 1793217360202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:00.221611Z",
  "last_location_at": "2026-10-28T19:56:00.221611Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "assignment_id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
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

`POST /api/driver/v1/trips/cde17bdb-5506-4367-893e-9b62838ba6a9/arrive` → **200**

```json
{
  "command_id": "0bfaa24e-e017-4dcd-ab1e-88bc3d04311f",
  "expected_version": 0
}
```

```json
{
  "id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "assignment_id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
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
  "arrived_at": "2026-10-28T19:56:00.781407Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cde17bdb-5506-4367-893e-9b62838ba6a9/start` → **200**

```json
{
  "command_id": "8bcc3f9d-0819-45b7-8398-85d35c94bf05",
  "expected_version": 1
}
```

```json
{
  "id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "assignment_id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
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
  "arrived_at": "2026-10-28T19:56:00.781407Z",
  "started_at": "2026-10-28T19:56:01.094382Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:01Z",
    "sequence": 1793217361373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:01.392314Z",
  "last_location_at": "2026-10-28T19:56:01.392314Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/cde17bdb-5506-4367-893e-9b62838ba6a9/complete` → **200**

```json
{
  "command_id": "a492e9ef-2dcf-4bc6-8f29-02ea321837d0",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:56:01Z",
  "cash_received": true
}
```

```json
{
  "id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "assignment_id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
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
  "arrived_at": "2026-10-28T19:56:00.781407Z",
  "started_at": "2026-10-28T19:56:01.094382Z",
  "completed_at": "2026-10-28T19:56:01.66422Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b2904ae8-2972-4a2a-920c-0e8310e3cb77` → **200**

```json
{
  "id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a7124533-b9d3-4d82-8334-8fc3db4916e2",
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
    "id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a",
    "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:55:56.845453Z",
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
    "id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:55:56.845453Z",
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
    "id": "cde17bdb-5506-4367-893e-9b62838ba6a9",
    "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
    "order_short_number": 12,
    "created_at": "2026-10-28T19:55:57.435303Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1f54f0f7-dfb1-4e5a-917e-d6a51c1dd8f0",
    "order_id": "80bfeb0d-e90b-473e-bca8-5003b22aa3c8",
    "order_short_number": 8,
    "created_at": "2026-10-28T19:54:55.473093Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c8be88cc-2d93-446e-929e-e5deb04adcc3",
    "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
    "order_short_number": 3,
    "created_at": "2026-10-28T19:54:12.599096Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "041a289c-d4a6-44d0-a19a-f954f49981aa",
    "order_id": "e4e6c7ad-2498-4962-93fb-74f759f06bc4",
    "order_short_number": 2,
    "created_at": "2026-10-28T19:53:51.193373Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0d054d13-5b60-4f1d-9bb9-a6e2df2f785f",
    "order_id": "a93e1eaa-6b5a-4319-bfb9-797a3d77430d",
    "order_short_number": 1,
    "created_at": "2026-10-28T19:53:41.517653Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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

`GET /api/rider/v1/orders/b2904ae8-2972-4a2a-920c-0e8310e3cb77/tip` → **200**

```json
{
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
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
  "available_until": "2026-10-29T19:56:01.66422Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b2904ae8-2972-4a2a-920c-0e8310e3cb77/tip` → **201**

```json
{
  "command_id": "a2f6af85-5894-4dd1-bfaf-26b1f817aeb6",
  "amount_minor": 1100
}
```

```json
{
  "id": "e8e2b78a-26ef-408b-8b67-0f5a023901be",
  "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T19:56:06.66862Z"
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
  "session_id": "1d7aee25-48a6-481d-ad4d-5ffada284428",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNjcsImlhdCI6MTc5MzIxNzM2NywianRpIjoiMzljOWM0MTktODkzOS00YTdhLTg5MmUtZGY2MDY1YWNkOTRiIiwic2lkIjoiMWQ3YWVlMjUtNDhhNi00ODFkLWFkNGQtNWZmYWRhMjg0NDI4In0.z66BnCwgIxdecSaxDvb1TMa05qq6WNtQxPptCX3j5f0",
  "access_expires_at": "2026-10-28T20:11:07.244031959Z",
  "refresh_token": "dUfA8kaNry_kcvpJqQWDfJNclPllPBellGyQtMW9bc0",
  "refresh_expires_at": "2026-10-29T07:56:07.24349014Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "counts": {
        "created": 12,
        "fulfilled": 7,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 11,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 1,
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
    "created": 12,
    "fulfilled": 7,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 11,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 1,
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
  "generated_at": "2026-10-28T19:56:07.521358537Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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
  "generated_at": "2026-10-28T19:56:07.804278269Z"
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
  "session_id": "eb8bb5c5-3799-48b7-bbf8-a8751bee90a4",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNjgsImlhdCI6MTc5MzIxNzM2OCwianRpIjoiODc3Y2FkNGUtMWFkYy00MzQ4LWFkODgtZjY5ZWNjODE1MWE0Iiwic2lkIjoiZWI4YmI1YzUtMzc5OS00OGI3LWJiZjgtYTg3NTFiZWU5MGE0In0.LlSnhtNFzh0nRZZDEcVihiQAh7Tz3oqtSm5mckngK0U",
  "access_expires_at": "2026-10-28T20:11:08.386007374Z",
  "refresh_token": "B0vKkSDU9YF5Myr4vaaZoayks5NTJDbABTiL4dUWZ4M",
  "refresh_expires_at": "2026-10-29T07:56:08.385421724Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b2904ae8-2972-4a2a-920c-0e8310e3cb77/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:55:56.846036Z",
      "actor": {
        "type": "CLIENT",
        "id": "a7124533-b9d3-4d82-8334-8fc3db4916e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
        "quote_id": "5938ae66-60e6-4ca0-a706-560db7730525",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "70daee5c-e8c1-431a-8e96-8b0042ab1779"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:55:56.848274Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
        "attempt_id": "7680417e-4a27-42e3-a6dd-d7fd1cbdd442",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "70daee5c-e8c1-431a-8e96-8b0042ab1779"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:55:56.85116Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9bcd0b06-6b23-4b65-9647-8db7820643b9",
        "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "70daee5c-e8c1-431a-8e96-8b0042ab1779"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:55:57.437004Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9bcd0b06-6b23-4b65-9647-8db7820643b9",
        "order_id": "b2904ae8-2972-4a2a-920c-0e8310e3cb77",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1eb2cf99-b1f8-4361-a74e-2a1ee5de552a"
      },
      "correlation_id": "087b46ad-d581-41ed-91f2-dda3d376b409"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T19:56:08.959716154Z",
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
      "last_location_at": "2026-10-28T19:56:01.392314Z",
      "order_id": null
    }
  ]
}
```

Done: order b2904ae8-2972-4a2a-920c-0e8310e3cb77.

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
  "session_id": "374848f6-78e5-452a-a8b1-97107d1d0065",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNjksImlhdCI6MTc5MzIxNzM2OSwianRpIjoiMTI5MDkwY2ItNzc0ZC00MWZkLWFhYWEtMzAzMDE3OGRjZDhiIiwic2lkIjoiMzc0ODQ4ZjYtNzhlNS00NTJhLWE4YjEtOTcxMDdkMWQwMDY1In0.OgXDB4LsqbiDYE6w8SuK32nc8aOmmfKp9W3y1HmV5xg",
  "access_expires_at": "2026-10-28T20:11:09.553736457Z",
  "refresh_token": "aJNscnPDms2vzhfy6a8LBs4Z3VDK_Rx34v-2b8IBe1I",
  "refresh_expires_at": "2026-10-29T07:56:09.553144926Z",
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
  "command_id": "466ddcf2-8b9f-4833-8f37-7e92f71fe578",
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
  "timestamp": "2026-10-28T19:56:10.000+0000",
  "channel": {
    "id": "1730052000.1863816472",
    "linkedid": "1730052000.1863816472",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678373535"
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
  "timestamp": "2026-10-28T19:56:10.000+0000",
  "channel": {
    "id": "1730052000.1863816472",
    "linkedid": "1730052000.1863816472",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678373535"
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
  "session_id": "afdb173a-1934-4373-b20d-5ffcc9ef5c68",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNzAsImlhdCI6MTc5MzIxNzM3MCwianRpIjoiNTU1YzkxNTMtNTE3NS00NzYwLThlOTktNzhkNjQ0MmM0Nzc4Iiwic2lkIjoiYWZkYjE3M2EtMTkzNC00MzczLWIyMGQtNWZmY2M5ZWY1YzY4In0.RZPGlyO7Nh05IgK_KW35P1ZL90Qnas31yAnR_u9dYYg",
  "access_expires_at": "2026-10-28T20:11:10.728471599Z",
  "refresh_token": "-6VEIxrWBAkwkj77OWEKe_wKXUjrX5VjsC3FKl-3yH8",
  "refresh_expires_at": "2026-10-29T07:56:10.727716133Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "1f7afb44-aab8-47be-9e54-878ea7a309fc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678373535",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:56:10Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/1f7afb44-aab8-47be-9e54-878ea7a309fc/answer` → **200**

```json
{
  "command_id": "ef5dc92a-0d17-402e-9989-da5b283c925b"
}
```

```json
{
  "id": "1f7afb44-aab8-47be-9e54-878ea7a309fc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678373535",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "order_ids": [],
  "started_at": "2026-10-28T19:56:10Z",
  "answered_at": "2026-10-28T19:56:11.31964Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1863816472",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "baa6ca94-225c-4cb2-ab90-ea28c67ebcc0",
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
  "id": "43179eac-9b2c-42a5-a93f-c10b822e4fb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:11.638532Z",
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
  "command_id": "8dfc7347-01d7-4969-9f57-83f70eb46e40",
  "quote_id": "43179eac-9b2c-42a5-a93f-c10b822e4fb4",
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
    "phone": "+380678373535"
  },
  "call_id": "1f7afb44-aab8-47be-9e54-878ea7a309fc"
}
```

```json
{
  "id": "d98b03d7-3a94-4971-a856-c62061213a2b",
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
  "created_at": "2026-10-28T19:56:11.928231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678373535"
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
    "id": "1730052000.1863816472",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1f7afb44-aab8-47be-9e54-878ea7a309fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678373535",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d98b03d7-3a94-4971-a856-c62061213a2b"
      ],
      "started_at": "2026-10-28T19:56:10Z",
      "answered_at": "2026-10-28T19:56:11.31964Z",
      "ended_at": "2026-10-28T19:56:12.237721Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "94022cfc-992c-4dd9-a496-cf203fa5dcd6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674876140",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [],
      "started_at": "2026-10-28T19:53:59.199492Z",
      "answered_at": "2026-10-28T19:53:59.533793Z",
      "ended_at": "2026-10-28T19:53:59.84177Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:54:07.305646Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d98b03d7-3a94-4971-a856-c62061213a2b` → **200**

```json
{
  "id": "d98b03d7-3a94-4971-a856-c62061213a2b",
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
  "created_at": "2026-10-28T19:56:11.928231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678373535"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d98b03d7-3a94-4971-a856-c62061213a2b` → **200**

```json
{
  "id": "d98b03d7-3a94-4971-a856-c62061213a2b",
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
  "created_at": "2026-10-28T19:56:11.928231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678373535"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d98b03d7-3a94-4971-a856-c62061213a2b/cancel` → **200**

```json
{
  "command_id": "00c47948-cc2b-44a1-a205-2b10aba529f1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d98b03d7-3a94-4971-a856-c62061213a2b",
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
  "created_at": "2026-10-28T19:56:11.928231Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678373535"
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

Done: call 1f7afb44-aab8-47be-9e54-878ea7a309fc with order d98b03d7-3a94-4971-a856-c62061213a2b.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16930"
}
```

```json
{
  "challenge_id": "e36b9ed8-67f4-4e8a-9d52-9857a4437638",
  "expires_at": "2026-10-28T20:01:13.462739708Z",
  "resend_available_at": "2026-10-28T19:56:14.462739708Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "152397",
  "sent_at": "2026-10-28T19:56:13.464893448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e36b9ed8-67f4-4e8a-9d52-9857a4437638",
  "code": "152397",
  "device_ref": "sandbox-16930"
}
```

```json
{
  "session_id": "bee8d76b-a9a8-4e12-bf1a-89bf12b115fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI3MywiaWF0IjoxNzkzMjE3MzczLCJqdGkiOiI5YzQzNjFmZi1kNzkzLTQwMjQtYjVhOC0zZjc5NTU3YWQ4YmQiLCJzaWQiOiJiZWU4ZDc2Yi1hOWE4LTRlMTItYmYxYS04OWJmMTJiMTE1ZmUifQ.5r03_To_U3Va3RWMZakhJS45fhzivQ6529yoC-4XeHU",
  "access_expires_at": "2026-10-28T20:11:13.756377961Z",
  "refresh_token": "-se89n7d_hal1kDVeuIJ4_-pWw9YPyPwJPbFFRVLqog",
  "refresh_expires_at": "2026-11-27T19:56:13.755825142Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:01.392314Z",
  "last_location_at": "2026-10-28T19:56:01.392314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/handover` → **200**

```json
{
  "command_id": "d703e874-0f38-4835-a975-6ab23dab8759",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:01.392314Z",
  "last_location_at": "2026-10-28T19:56:01.392314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:14Z",
    "sequence": 1793217374578
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:14.597108Z",
  "last_location_at": "2026-10-28T19:56:14.597108Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660870293",
  "device_ref": "sandbox-11055"
}
```

```json
{
  "challenge_id": "62d51400-659a-4875-9506-55197379ee2c",
  "expires_at": "2026-10-28T20:01:14.867648047Z",
  "resend_available_at": "2026-10-28T19:56:15.867648047Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660870293` → **200**

```json
{
  "phone": "+380660870293",
  "audience": "CLIENT",
  "code": "453385",
  "sent_at": "2026-10-28T19:56:14.870140656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62d51400-659a-4875-9506-55197379ee2c",
  "code": "453385",
  "device_ref": "sandbox-11055"
}
```

```json
{
  "session_id": "59ab74b3-d79a-4de0-8175-c851cfb57ad6",
  "subject": {
    "type": "CLIENT",
    "id": "17b1e772-c971-4fda-926e-4e8df5a0f067"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2IxZTc3Mi1jOTcxLTRmZGEtOTI2ZS00ZThkZjVhMGYwNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Mjc1LCJpYXQiOjE3OTMyMTczNzUsImp0aSI6IjZmYjVlNmFjLTMyZGItNDk1Ni1iODVkLWU1Yzk5Njg0MGRiNiIsInNpZCI6IjU5YWI3NGIzLWQ3OWEtNGRlMC04MTc1LWM4NTFjZmI1N2FkNiJ9.YPvICXsq2FTsg3_YRlWwoL_faZ7beCqtuuJQsppKeYk",
  "access_expires_at": "2026-10-28T20:11:15.168159816Z",
  "refresh_token": "Aw0RaQRVvBB9gidTwb6iZKbz19Edey1ee4ggysDim7s",
  "refresh_expires_at": "2026-11-27T19:56:15.167642143Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e728300-d274-4825-9bda-a48eec0ca63c",
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
  "id": "e46affdb-8411-4e94-9995-b4ee78c77418",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:15.443944Z",
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
  "command_id": "2e778b0e-3ebb-4be3-9fda-2b693bd7401d",
  "quote_id": "e46affdb-8411-4e94-9995-b4ee78c77418",
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
  "id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17b1e772-c971-4fda-926e-4e8df5a0f067",
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
  "created_at": "2026-10-28T19:56:15.740749Z",
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
    "id": "ce68d486-d5af-454e-be9b-5beb83f6dee7",
    "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
    "expires_at": "2026-10-28T19:56:30.744009Z",
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

`POST /api/driver/v1/offers/ce68d486-d5af-454e-be9b-5beb83f6dee7/accept` → **200**

```json
{
  "command_id": "a084ce65-0bc8-4162-898f-0d6aa104b084"
}
```

```json
{
  "id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c",
  "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f49b264d-459a-4737-943f-e1d4fa4b0581",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f49b264d-459a-4737-943f-e1d4fa4b0581",
  "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
  "assignment_id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c",
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

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:16Z",
    "sequence": 1793217376878
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:16.896906Z",
  "last_location_at": "2026-10-28T19:56:16.896906Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f49b264d-459a-4737-943f-e1d4fa4b0581/arrive` → **200**

```json
{
  "command_id": "344f5030-0a3c-4128-b955-a05276a9647f",
  "expected_version": 0
}
```

```json
{
  "id": "f49b264d-459a-4737-943f-e1d4fa4b0581",
  "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
  "assignment_id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c",
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
  "arrived_at": "2026-10-28T19:56:17.189444Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f49b264d-459a-4737-943f-e1d4fa4b0581/start` → **200**

```json
{
  "command_id": "f7afcb75-d924-4d3e-a12c-ab8871d3d3a9",
  "expected_version": 1
}
```

```json
{
  "id": "f49b264d-459a-4737-943f-e1d4fa4b0581",
  "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
  "assignment_id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c",
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
  "arrived_at": "2026-10-28T19:56:17.189444Z",
  "started_at": "2026-10-28T19:56:17.489716Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:17Z",
    "sequence": 1793217377772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:17.790298Z",
  "last_location_at": "2026-10-28T19:56:17.790298Z",
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
  "device_ref": "sandbox-27920"
}
```

```json
{
  "challenge_id": "d8c91d63-8a7d-4cea-a8f5-1f85bfc4adcf",
  "expires_at": "2026-10-28T20:01:18.071800846Z",
  "resend_available_at": "2026-10-28T19:56:19.071800846Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "964993",
  "sent_at": "2026-10-28T19:56:18.074344701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8c91d63-8a7d-4cea-a8f5-1f85bfc4adcf",
  "code": "964993",
  "device_ref": "sandbox-27920"
}
```

```json
{
  "session_id": "44a1d4d6-0fb1-4a6c-96e0-1267c3d74a0e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI3OCwiaWF0IjoxNzkzMjE3Mzc4LCJqdGkiOiI5OWM1NmY0Ni03OGMwLTQ3MjItOGUyMC1jNzRjMTk3ZTMyODIiLCJzaWQiOiI0NGExZDRkNi0wZmIxLTRhNmMtOTZlMC0xMjY3YzNkNzRhMGUifQ.PpOySV6sdUjU60oaum9oIkyu2yg1U-ipSCIWpl4p4Pk",
  "access_expires_at": "2026-10-28T20:11:18.383478629Z",
  "refresh_token": "ALXwFulIK3RMtAbTuVSYNrEFjtFE6ipRlUmiPmA381c",
  "refresh_expires_at": "2026-11-27T19:56:18.382871688Z",
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
  "command_id": "1caf9a68-6d2d-48c8-b1fd-4889c8db14bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:18Z",
    "sequence": 1793217378927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed518719-59cd-44ce-9462-b061e3ce044c",
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
  "last_heartbeat_at": "2026-10-28T19:56:18.945847Z",
  "last_location_at": "2026-10-28T19:56:18.945847Z",
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
  "session_id": "e4ac98f4-6e92-4ccb-868b-d7c4dc8f3138",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyNzksImlhdCI6MTc5MzIxNzM3OSwianRpIjoiZjIxMmUwODQtZTY1Ny00MjAyLTg5OWQtYTgwZWUzMzdjZDhjIiwic2lkIjoiZTRhYzk4ZjQtNmU5Mi00Y2NiLTg2OGItZDdjNGRjOGYzMTM4In0.nl6IjnPcdtcIMiOEJg3GNhVTVTDYbcPVDIZbUspAMK4",
  "access_expires_at": "2026-10-28T20:11:19.525140112Z",
  "refresh_token": "-03mPx11WvVXixcS-NP4i8f3Rp6A7NUye3eyTcbgboc",
  "refresh_expires_at": "2026-10-29T07:56:19.524606058Z",
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
  "session_id": "ea367ab7-8c4a-4e60-b79f-62cb32a6d710",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyODAsImlhdCI6MTc5MzIxNzM4MCwianRpIjoiMzU4NzhhMWItZDk5YS00MWRjLWJhYWUtZTZhYWFiM2U4YWEwIiwic2lkIjoiZWEzNjdhYjctOGM0YS00ZTYwLWI3OWYtNjJjYjMyYTZkNzEwIn0.BQ0OqFQP9puApSVbHHWhgKcc8uoixlmLNWUKckKuriU",
  "access_expires_at": "2026-10-28T20:11:20.086318538Z",
  "refresh_token": "0f3jgz6_yAWHjhxZ0ISgoLuDiwsCEE2muK-8RfSwOdQ",
  "refresh_expires_at": "2026-10-29T07:56:20.085811064Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1b741078-3fe7-42a1-8e85-de6eda28e013` → **200**

```json
{
  "id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "17b1e772-c971-4fda-926e-4e8df5a0f067",
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
    "id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c",
    "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f49b264d-459a-4737-943f-e1d4fa4b0581",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T19:56:15.740749Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1b741078-3fe7-42a1-8e85-de6eda28e013/interrupt` → **200**

```json
{
  "command_id": "90afa245-04f5-4dd2-8a9b-c1c54a39ecb9",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "17b1e772-c971-4fda-926e-4e8df5a0f067",
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
      "id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c",
      "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "f49b264d-459a-4737-943f-e1d4fa4b0581",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T19:56:15.740749Z",
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
    "id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "17b1e772-c971-4fda-926e-4e8df5a0f067",
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
    "id": "efe7ce7b-453f-4012-9a16-d4d73659c7f8",
    "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
    "expires_at": "2026-10-28T19:56:35.669339Z",
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

`POST /api/driver/v1/offers/efe7ce7b-453f-4012-9a16-d4d73659c7f8/accept` → **200**

```json
{
  "command_id": "e718e200-ab4e-4e81-a077-f5b5b91fbd3f"
}
```

```json
{
  "id": "f0ca90dd-50a0-49cd-8604-20b2bd9a3ec5",
  "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2569c6e1-e091-4604-a128-4085238ce492",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2569c6e1-e091-4604-a128-4085238ce492",
  "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
  "assignment_id": "f0ca90dd-50a0-49cd-8604-20b2bd9a3ec5",
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
  "session_id": "ed518719-59cd-44ce-9462-b061e3ce044c",
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
  "last_heartbeat_at": "2026-10-28T19:56:18.945847Z",
  "last_location_at": "2026-10-28T19:56:18.945847Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ed518719-59cd-44ce-9462-b061e3ce044c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:22Z",
    "sequence": 1793217382102
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed518719-59cd-44ce-9462-b061e3ce044c",
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
  "last_heartbeat_at": "2026-10-28T19:56:22.121015Z",
  "last_location_at": "2026-10-28T19:56:22.121015Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2569c6e1-e091-4604-a128-4085238ce492/arrive` → **200**

```json
{
  "command_id": "a0929603-eb20-4a77-93ac-92314a26a484",
  "expected_version": 0
}
```

```json
{
  "id": "2569c6e1-e091-4604-a128-4085238ce492",
  "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
  "assignment_id": "f0ca90dd-50a0-49cd-8604-20b2bd9a3ec5",
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
  "arrived_at": "2026-10-28T19:56:22.396379Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2569c6e1-e091-4604-a128-4085238ce492/start` → **200**

```json
{
  "command_id": "22b811ee-65bd-4312-8dda-4f40cee6ae36",
  "expected_version": 1
}
```

```json
{
  "id": "2569c6e1-e091-4604-a128-4085238ce492",
  "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
  "assignment_id": "f0ca90dd-50a0-49cd-8604-20b2bd9a3ec5",
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
  "arrived_at": "2026-10-28T19:56:22.396379Z",
  "started_at": "2026-10-28T19:56:22.691152Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2569c6e1-e091-4604-a128-4085238ce492/complete` → **200**

```json
{
  "command_id": "fc96c5f0-0db7-4a5c-8d5d-e0dc54f4bcf2",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:56:22Z"
}
```

```json
{
  "id": "2569c6e1-e091-4604-a128-4085238ce492",
  "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
  "assignment_id": "f0ca90dd-50a0-49cd-8604-20b2bd9a3ec5",
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
  "arrived_at": "2026-10-28T19:56:22.396379Z",
  "started_at": "2026-10-28T19:56:22.691152Z",
  "completed_at": "2026-10-28T19:56:22.97633Z",
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
    "id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:56:20.658694Z",
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
    "id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:56:15.740749Z",
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

`GET /api/operator/v1/orders/1b741078-3fe7-42a1-8e85-de6eda28e013/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:56:15.741376Z",
      "actor": {
        "type": "CLIENT",
        "id": "17b1e772-c971-4fda-926e-4e8df5a0f067",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
        "quote_id": "e46affdb-8411-4e94-9995-b4ee78c77418",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "fd101bc6-7814-4c08-ab93-26c4f21b1dd1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:56:15.743282Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
        "attempt_id": "3f7188b0-6565-466b-a203-bec808ee5b7f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fd101bc6-7814-4c08-ab93-26c4f21b1dd1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:56:15.745926Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ce68d486-d5af-454e-be9b-5beb83f6dee7",
        "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "fd101bc6-7814-4c08-ab93-26c4f21b1dd1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:56:16.321671Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ce68d486-d5af-454e-be9b-5beb83f6dee7",
        "order_id": "1b741078-3fe7-42a1-8e85-de6eda28e013",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "349d9cec-1dba-47c0-bc98-15e35d84ae7c"
      },
      "correlation_id": "ccb6de30-95ff-4471-9e3b-4c197ccbf756"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/5047c3cd-8779-40d2-95bb-b7ebfa08e019/tip` → **200**

```json
{
  "order_id": "5047c3cd-8779-40d2-95bb-b7ebfa08e019",
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
  "available_until": "2026-10-29T19:56:22.97633Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/5047c3cd-8779-40d2-95bb-b7ebfa08e019/tip` → **409**

```json
{
  "command_id": "83fd8e96-eecd-4b42-a040-160a01fca205",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/5047c3cd-8779-40d2-95bb-b7ebfa08e019/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "409108f3-0c4e-440a-8b72-398a5b471816"
}
```

Done: interrupted 1b741078-3fe7-42a1-8e85-de6eda28e013, follow-up 5047c3cd-8779-40d2-95bb-b7ebfa08e019.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cd1c570f-55a6-453f-8217-044c238982cc",
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
  "last_heartbeat_at": "2026-10-28T19:56:17.790298Z",
  "last_location_at": "2026-10-28T19:56:17.790298Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd1c570f-55a6-453f-8217-044c238982cc/close` → **200**

```json
{
  "command_id": "c285dfb5-f932-4aee-90da-5a302de7c4aa",
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
  "session_id": "ed518719-59cd-44ce-9462-b061e3ce044c",
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
  "last_heartbeat_at": "2026-10-28T19:56:22.121015Z",
  "last_location_at": "2026-10-28T19:56:22.121015Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed518719-59cd-44ce-9462-b061e3ce044c/close` → **200**

```json
{
  "command_id": "5e3874a4-46cf-46e1-a75b-f391b392e516",
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
  "session_id": "95e8b4b5-e6ca-434c-8016-5cff0fc7d572",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgyODksImlhdCI6MTc5MzIxNzM4OSwianRpIjoiY2VhNjk1NDYtMWFjNy00YzM0LThlYjItNzdkYTgzOTdiYWVmIiwic2lkIjoiOTVlOGI0YjUtZTZjYS00MzRjLTgwMTYtNWNmZjBmYzdkNTcyIn0.VqHdDgg_FutiY7N6NtUVbkbSG7XVYYA0tOfOnh0QSZo",
  "access_expires_at": "2026-10-28T20:11:29.095518498Z",
  "refresh_token": "tuczC6GPnEoMNxGrVYRw0ws85vdTLStZe8ZwF6IXOEs",
  "refresh_expires_at": "2026-10-29T07:56:29.094755748Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "29c2cc52-8908-4dbb-b707-cba1784dd0b9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:56:29Z"
}
```

```json
{
  "id": "b4b52698-381a-4cb8-9439-76ab35b98905",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:56:29Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b4b52698-381a-4cb8-9439-76ab35b98905/publish` → **200**

```json
{
  "command_id": "dd74fd7c-9c2c-434c-80ff-d746699a0ffc",
  "expected_version": 0
}
```

```json
{
  "id": "b4b52698-381a-4cb8-9439-76ab35b98905",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:56:29.673712Z",
  "published_at": "2026-10-28T19:56:29.673712Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b4b52698-381a-4cb8-9439-76ab35b98905",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T19:56:29.673712Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634281743",
  "device_ref": "sandbox-3156"
}
```

```json
{
  "challenge_id": "7fb1091f-6aff-48ac-a67a-118362dfd7ea",
  "expires_at": "2026-10-28T20:01:30.238875013Z",
  "resend_available_at": "2026-10-28T19:56:31.238875013Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634281743` → **200**

```json
{
  "phone": "+380634281743",
  "audience": "CLIENT",
  "code": "346719",
  "sent_at": "2026-10-28T19:56:30.242516452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fb1091f-6aff-48ac-a67a-118362dfd7ea",
  "code": "346719",
  "device_ref": "sandbox-3156"
}
```

```json
{
  "session_id": "1621f88f-62e3-4954-97bd-46f4018d4c6d",
  "subject": {
    "type": "CLIENT",
    "id": "61f53228-829c-4b60-a5e3-3562e0b4456e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWY1MzIyOC04MjljLTRiNjAtYTVlMy0zNTYyZTBiNDQ1NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MjkwLCJpYXQiOjE3OTMyMTczOTAsImp0aSI6IjdmMThhZGE3LWY5ZTItNGE0Ny04NWE4LWNkOWU5M2JkY2M3ZiIsInNpZCI6IjE2MjFmODhmLTYyZTMtNDk1NC05N2JkLTQ2ZjQwMThkNGM2ZCJ9.ZU2j_9fmR_On7hO0i_SYEbBksEETueG8cvr5bkEjyc0",
  "access_expires_at": "2026-10-28T20:11:30.547965787Z",
  "refresh_token": "y6T_35F0kIqaBK1o8FhQ4No-S6c_v_O4jh7tjgHRQvY",
  "refresh_expires_at": "2026-11-27T19:56:30.547287814Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b4b52698-381a-4cb8-9439-76ab35b98905",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T19:56:29.673712Z",
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
  "command_id": "dae0397a-751e-44ba-b895-12a196e3499d",
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
  "id": "19759d33-4389-4abc-aef4-23cfc4a0bc21",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:31.102555Z",
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
  "command_id": "c028f5d9-6f06-4ea7-ae7f-bddeb2f6d64e",
  "quote_id": "19759d33-4389-4abc-aef4-23cfc4a0bc21",
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
  "correlation_id": "cb35f6e0-8afd-4b8c-9294-7ea04c352a2e"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9ba4de44-6b56-4cd7-ab35-b601f3a489a6",
  "version_id": "b4b52698-381a-4cb8-9439-76ab35b98905",
  "language": "uk"
}
```

```json
{
  "version_id": "b4b52698-381a-4cb8-9439-76ab35b98905",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T19:56:31.693328Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "586fb456-9a99-4b15-9459-76361a4a6480",
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
  "id": "1245a0c0-5f90-4f25-bd06-f1d401eab666",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:31.970278Z",
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
  "command_id": "54098fdc-6b67-4628-88fd-f57cdae423f8",
  "quote_id": "1245a0c0-5f90-4f25-bd06-f1d401eab666",
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
  "id": "ec0c137a-7e01-40bf-8af4-dc74d23975ff",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61f53228-829c-4b60-a5e3-3562e0b4456e",
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
  "created_at": "2026-10-28T19:56:32.258845Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ec0c137a-7e01-40bf-8af4-dc74d23975ff` → **200**

```json
{
  "id": "ec0c137a-7e01-40bf-8af4-dc74d23975ff",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61f53228-829c-4b60-a5e3-3562e0b4456e",
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
  "created_at": "2026-10-28T19:56:32.258845Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ec0c137a-7e01-40bf-8af4-dc74d23975ff/cancel` → **200**

```json
{
  "command_id": "d3898848-0138-4ad0-88c4-63c4c0550329",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ec0c137a-7e01-40bf-8af4-dc74d23975ff",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "61f53228-829c-4b60-a5e3-3562e0b4456e",
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
  "created_at": "2026-10-28T19:56:32.258845Z",
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

`POST /api/admin/v1/legal-documents/b4b52698-381a-4cb8-9439-76ab35b98905` → **409**

```json
{
  "command_id": "ccd6d7d4-c0a5-4448-9651-530806db9753",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:56:33Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b4b52698-381a-4cb8-9439-76ab35b98905",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2abe3c68-916b-486a-a602-c816253e11b1"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6a58482d-0faf-4d69-965d-44957c9d00c1",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:56:33Z"
}
```

```json
{
  "id": "379bd0b1-b9b3-4d83-9449-64c4657c4bd7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:56:33Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/379bd0b1-b9b3-4d83-9449-64c4657c4bd7/publish` → **200**

```json
{
  "command_id": "39e2a7b9-ca12-4a6e-9c94-9c57555020be",
  "expected_version": 0
}
```

```json
{
  "id": "379bd0b1-b9b3-4d83-9449-64c4657c4bd7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:56:33.7108Z",
  "published_at": "2026-10-28T19:56:33.7108Z",
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
  "device_ref": "sandbox-15055"
}
```

```json
{
  "challenge_id": "7de0b46f-ccdd-40fc-adf3-78ed9215e77e",
  "expires_at": "2026-10-28T20:01:33.988492774Z",
  "resend_available_at": "2026-10-28T19:56:34.988492774Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "216024",
  "sent_at": "2026-10-28T19:56:33.990727781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7de0b46f-ccdd-40fc-adf3-78ed9215e77e",
  "code": "216024",
  "device_ref": "sandbox-15055"
}
```

```json
{
  "session_id": "05bea598-90f4-405c-b7fb-a82b5ccd65db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODI5NCwiaWF0IjoxNzkzMjE3Mzk0LCJqdGkiOiIyNzJiYjFmZS0yNmNmLTQ4MTYtOTYxYy0xNGFhYzg1NGFlNjMiLCJzaWQiOiIwNWJlYTU5OC05MGY0LTQwNWMtYjdmYi1hODJiNWNjZDY1ZGIifQ.2jasGj_hEzOeiHocAj6x3rLN0Kc0qKMbKjGgw2OpKV4",
  "access_expires_at": "2026-10-28T20:11:34.290590414Z",
  "refresh_token": "TqyaQxBXmQdot6lwAngNC98MhwiniP0KQlkQ3JCO8I0",
  "refresh_expires_at": "2026-11-27T19:56:34.289963669Z",
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
  "command_id": "b21104bd-9273-41e1-8b79-c827ae379f49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:34Z",
    "sequence": 1793217394828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "60693d99-1352-413f-9712-83a9b3c3bbaa",
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
  "last_heartbeat_at": "2026-10-28T19:56:34.847209Z",
  "last_location_at": "2026-10-28T19:56:34.847209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678012026",
  "device_ref": "sandbox-15401"
}
```

```json
{
  "challenge_id": "e3edd6e8-5eb2-42b6-acd8-c9ceae7bba31",
  "expires_at": "2026-10-28T20:01:35.122209235Z",
  "resend_available_at": "2026-10-28T19:56:36.122209235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678012026` → **200**

```json
{
  "phone": "+380678012026",
  "audience": "CLIENT",
  "code": "028682",
  "sent_at": "2026-10-28T19:56:35.124409811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3edd6e8-5eb2-42b6-acd8-c9ceae7bba31",
  "code": "028682",
  "device_ref": "sandbox-15401"
}
```

```json
{
  "session_id": "f492a98a-9cdd-4bd0-b70f-0f146eee5740",
  "subject": {
    "type": "CLIENT",
    "id": "570a0cee-f117-4a89-9435-43bc1476cda4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzBhMGNlZS1mMTE3LTRhODktOTQzNS00M2JjMTQ3NmNkYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Mjk1LCJpYXQiOjE3OTMyMTczOTUsImp0aSI6ImI1ZTFkOTkxLTA4Y2ItNDQyMC05NWExLWRlZjYyZjg3ZWE0NyIsInNpZCI6ImY0OTJhOThhLTljZGQtNGJkMC1iNzBmLTBmMTQ2ZWVlNTc0MCJ9.A0N4hJZqVCKTc9PLRBXGJuTLCP4YFtHEy6eGRCuqrh4",
  "access_expires_at": "2026-10-28T20:11:35.430987337Z",
  "refresh_token": "UsR9m5NrUZsvJhXcBSyqtk_craYrOJT7dPhL5KIsU9Q",
  "refresh_expires_at": "2026-11-27T19:56:35.430280864Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b54146a-bc06-4f24-9492-4e9fcab5cda3",
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
  "id": "03d96c9f-75f6-471f-8404-0e28c6659b38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:35.712835Z",
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
  "command_id": "222e9db4-bc68-4a2a-9ae4-0ea7f8df45b3",
  "quote_id": "03d96c9f-75f6-471f-8404-0e28c6659b38",
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
    "phone": "+380673303723"
  }
}
```

```json
{
  "id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:56:35.999093Z",
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
    "id": "c1992030-5935-44bf-adf5-f3d3a62e33f6",
    "order_id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
    "expires_at": "2026-10-28T19:56:51.002318Z",
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

`POST /api/driver/v1/offers/c1992030-5935-44bf-adf5-f3d3a62e33f6/accept` → **200**

```json
{
  "command_id": "c83960fb-5861-40af-936a-7cfb1674827b"
}
```

```json
{
  "id": "240854ed-2f8f-4f74-aa55-f77cf229e996",
  "order_id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "858b4a61-a052-4009-a183-68f167923356",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "858b4a61-a052-4009-a183-68f167923356",
  "order_id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
  "assignment_id": "240854ed-2f8f-4f74-aa55-f77cf229e996",
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
    "phone": "+380673303723"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76d265d9-b88f-45d5-adde-f21de50f2f02",
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
  "id": "69d2e4b3-c22a-4854-9994-95fe53922ca4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:37.203855Z",
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
  "command_id": "87e881c1-d8a3-41a4-bca8-bdf708778147",
  "quote_id": "69d2e4b3-c22a-4854-9994-95fe53922ca4",
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
  "id": "0d51f877-51c4-4ff4-bac5-d78367cae234",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:56:37.529959Z",
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
  "command_id": "439f1989-e345-4091-9eef-3ab831512df6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T22:56:37Z"
}
```

```json
{
  "id": "4b733022-829c-49f9-b1c8-a73e149b18a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:37.894159Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:56:37Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0b3dafa0-c46d-4d53-9625-7e654050261d",
  "quote_id": "4b733022-829c-49f9-b1c8-a73e149b18a2",
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
  "pickup_at": "2026-10-28T22:56:37Z"
}
```

```json
{
  "id": "4d588919-5e54-4158-a39f-53ac2a303277",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T19:56:38.216499Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:56:37Z",
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
  "command_id": "6debbc4b-0744-495f-950c-5750edc66d1e",
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
  "id": "c2f91c4c-d8ea-4daa-812f-d04d4c604db5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:38.519263Z",
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
  "command_id": "b9cd605a-4d01-4fc9-a6b0-4a906952f4a9",
  "quote_id": "c2f91c4c-d8ea-4daa-812f-d04d4c604db5",
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
  "correlation_id": "0658bc29-b7f0-46e7-bb1d-eb0968b9ca28"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "4d588919-5e54-4158-a39f-53ac2a303277",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T19:56:38.216499Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T22:56:37Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0d51f877-51c4-4ff4-bac5-d78367cae234",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T19:56:37.529959Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0d51f877-51c4-4ff4-bac5-d78367cae234",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:56:37.529959Z",
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

`GET /api/rider/v1/orders/0d129e7d-1567-42a5-b8c8-09fbd485a52a` → **200**

```json
{
  "id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "240854ed-2f8f-4f74-aa55-f77cf229e996",
    "order_id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "858b4a61-a052-4009-a183-68f167923356",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:56:35.999093Z",
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
    "location_at": "2026-10-28T19:56:34.847209Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/0d129e7d-1567-42a5-b8c8-09fbd485a52a/cancel` → **200**

```json
{
  "command_id": "36729110-dad6-4ae8-ab78-0e52fc00a864",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "240854ed-2f8f-4f74-aa55-f77cf229e996",
    "order_id": "0d129e7d-1567-42a5-b8c8-09fbd485a52a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "858b4a61-a052-4009-a183-68f167923356",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:56:35.999093Z",
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

`GET /api/rider/v1/orders/0d51f877-51c4-4ff4-bac5-d78367cae234` → **200**

```json
{
  "id": "0d51f877-51c4-4ff4-bac5-d78367cae234",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:56:37.529959Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0d51f877-51c4-4ff4-bac5-d78367cae234/cancel` → **200**

```json
{
  "command_id": "66339d5c-151b-4410-8297-0838151ccf5a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0d51f877-51c4-4ff4-bac5-d78367cae234",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:56:37.529959Z",
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

`GET /api/rider/v1/orders/4d588919-5e54-4158-a39f-53ac2a303277` → **200**

```json
{
  "id": "4d588919-5e54-4158-a39f-53ac2a303277",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T19:56:38.216499Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:56:37Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4d588919-5e54-4158-a39f-53ac2a303277/cancel` → **200**

```json
{
  "command_id": "7608b3c8-b480-4f09-8c12-8f7d4ff26177",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4d588919-5e54-4158-a39f-53ac2a303277",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "570a0cee-f117-4a89-9435-43bc1476cda4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T19:56:38.216499Z",
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
  "pickup_at": "2026-10-28T22:56:37Z",
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
  "session_id": "60693d99-1352-413f-9712-83a9b3c3bbaa",
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
  "last_heartbeat_at": "2026-10-28T19:56:34.847209Z",
  "last_location_at": "2026-10-28T19:56:34.847209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/60693d99-1352-413f-9712-83a9b3c3bbaa/close` → **200**

```json
{
  "command_id": "7aab5f89-05af-4110-be54-05a05f6d1891",
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

Done: orders 0d129e7d-1567-42a5-b8c8-09fbd485a52a, 0d51f877-51c4-4ff4-bac5-d78367cae234, 4d588919-5e54-4158-a39f-53ac2a303277.

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
  "session_id": "be797aa8-095a-4448-9fee-6a4be4f383d2",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzMDIsImlhdCI6MTc5MzIxNzQwMiwianRpIjoiZTg3ZjgxN2YtOTc1MS00Y2Q3LWIzNjYtNDRjMGYwNzBjMTFmIiwic2lkIjoiYmU3OTdhYTgtMDk1YS00NDQ4LTlmZWUtNmE0YmU0ZjM4M2QyIn0.pA1PEyw7dYSS0yESegv-UNNWx1WBm_9lDTPvcO-gdiI",
  "access_expires_at": "2026-10-28T20:11:42.285434317Z",
  "refresh_token": "Y1UcioxRj9AcdC3kLmm-Er5tbOsVr1-Co73N5Yz0CNM",
  "refresh_expires_at": "2026-10-29T07:56:42.284848136Z",
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
  "session_id": "71a0b969-7384-4296-b093-96878916004f",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzMDIsImlhdCI6MTc5MzIxNzQwMiwianRpIjoiOGQ0YTdhMzgtZGRlMi00ZWE2LWExMjctMDgwZTI4MTEyNThkIiwic2lkIjoiNzFhMGI5NjktNzM4NC00Mjk2LWIwOTMtOTY4Nzg5MTYwMDRmIn0.-m6uTKlSTCgA8f2SaIhZwXKTeupOJOdJ6paLoMkW4PE",
  "access_expires_at": "2026-10-28T20:11:42.854376023Z",
  "refresh_token": "KfyiJ8tYyADaMrfIXJA5Fb6YX6MUj6v8RCBI0B8yJHs",
  "refresh_expires_at": "2026-10-29T07:56:42.853817674Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1679"
}
```

```json
{
  "challenge_id": "7bc0de72-ec7c-4cb8-996f-9ddff36eacff",
  "expires_at": "2026-10-28T20:01:43.141621458Z",
  "resend_available_at": "2026-10-28T19:56:44.141621458Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "897731",
  "sent_at": "2026-10-28T19:56:43.144072519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bc0de72-ec7c-4cb8-996f-9ddff36eacff",
  "code": "897731",
  "device_ref": "sandbox-1679"
}
```

```json
{
  "session_id": "79000d9d-bcef-4340-9054-baeb77f267e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODMwMywiaWF0IjoxNzkzMjE3NDAzLCJqdGkiOiI0Y2ZlMjY5ZC0zZTRkLTRmODYtYjkxNS0wZDQ2ODNhMDU1MGUiLCJzaWQiOiI3OTAwMGQ5ZC1iY2VmLTQzNDAtOTA1NC1iYWViNzdmMjY3ZTIifQ.NfH8ndb1j-c7iDh7UDnuVtxzWFvG72KVf7Rxgkp8qII",
  "access_expires_at": "2026-10-28T20:11:43.448354927Z",
  "refresh_token": "BTyTfueMnZqDG31DGmahsI-D_YIWRNfH2lQkJnQmsco",
  "refresh_expires_at": "2026-11-27T19:56:43.44776606Z",
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
  "command_id": "9b2e6630-2adb-4a68-9c56-dc605f08c61e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:43Z",
    "sequence": 1793217403981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eea76cd9-fac3-4da8-863d-b26a6daaf60b",
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
  "last_heartbeat_at": "2026-10-28T19:56:44.000097Z",
  "last_location_at": "2026-10-28T19:56:44.000097Z",
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
  "command_id": "a65d60f5-33e2-40a8-9ca0-29cc4e198029",
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
  "effective_at": "2026-10-28T19:56:44.550477Z",
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T19:54:16.31163Z",
  "last_entries": [
    {
      "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:54:16.31163Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c9de87d3-0590-4e19-805f-f97f0ff47242",
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
  "id": "78eb8c36-045d-43a8-a787-72d2920f168a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:45.107205Z",
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
  "command_id": "01263bf8-ce7c-42ec-93b9-2ded7b0f98cb",
  "quote_id": "78eb8c36-045d-43a8-a787-72d2920f168a",
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
    "phone": "+3806711124043"
  }
}
```

```json
{
  "id": "f825b879-220c-4056-9fd5-d321bafb18b0",
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
  "created_at": "2026-10-28T19:56:45.397082Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124043"
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
    "id": "13c33296-d23c-49d3-9d31-f9c5086608e5",
    "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
    "expires_at": "2026-10-28T19:57:00.401063Z",
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

`POST /api/driver/v1/offers/13c33296-d23c-49d3-9d31-f9c5086608e5/accept` → **200**

```json
{
  "command_id": "da7e234f-9ea1-4995-aea2-c6459834f14a"
}
```

```json
{
  "id": "c95ddd35-4f86-4d33-97bd-49ab8927ebef",
  "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "068dccd6-d809-4245-954d-cb5de199e064",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "068dccd6-d809-4245-954d-cb5de199e064",
  "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
  "assignment_id": "c95ddd35-4f86-4d33-97bd-49ab8927ebef",
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
    "phone": "+3806711124043"
  }
}
```

`POST /api/driver/v1/work-sessions/eea76cd9-fac3-4da8-863d-b26a6daaf60b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:56:46Z",
    "sequence": 1793217406520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eea76cd9-fac3-4da8-863d-b26a6daaf60b",
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
  "last_heartbeat_at": "2026-10-28T19:56:46.539228Z",
  "last_location_at": "2026-10-28T19:56:46.539228Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/068dccd6-d809-4245-954d-cb5de199e064/arrive` → **200**

```json
{
  "command_id": "d049ff8c-741c-4bfa-8aa5-2a84a336269e",
  "expected_version": 0
}
```

```json
{
  "id": "068dccd6-d809-4245-954d-cb5de199e064",
  "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
  "assignment_id": "c95ddd35-4f86-4d33-97bd-49ab8927ebef",
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
  "arrived_at": "2026-10-28T19:56:46.827608Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124043"
  }
}
```

`POST /api/driver/v1/trips/068dccd6-d809-4245-954d-cb5de199e064/start` → **200**

```json
{
  "command_id": "be963012-be30-44d1-8b87-1a1c9d8f0a29",
  "expected_version": 1
}
```

```json
{
  "id": "068dccd6-d809-4245-954d-cb5de199e064",
  "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
  "assignment_id": "c95ddd35-4f86-4d33-97bd-49ab8927ebef",
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
  "arrived_at": "2026-10-28T19:56:46.827608Z",
  "started_at": "2026-10-28T19:56:47.111944Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124043"
  }
}
```

`POST /api/driver/v1/trips/068dccd6-d809-4245-954d-cb5de199e064/complete` → **200**

```json
{
  "command_id": "1bd41b3e-0eeb-4e61-a5ef-aee31aecb8d2",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:56:47Z",
  "cash_received": true
}
```

```json
{
  "id": "068dccd6-d809-4245-954d-cb5de199e064",
  "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
  "assignment_id": "c95ddd35-4f86-4d33-97bd-49ab8927ebef",
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
  "arrived_at": "2026-10-28T19:56:46.827608Z",
  "started_at": "2026-10-28T19:56:47.111944Z",
  "completed_at": "2026-10-28T19:56:47.398684Z",
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
  "command_id": "d5bf02c3-1ae7-46fa-9b78-81a42f727ecf",
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
  "id": "91a0b17b-20f3-4339-9c86-f4b3a066756e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:47.711686Z",
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
  "command_id": "7e742fe6-56d6-4162-b198-3eec54526d59",
  "quote_id": "91a0b17b-20f3-4339-9c86-f4b3a066756e",
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
    "phone": "+3806711128476"
  }
}
```

```json
{
  "id": "3999a838-4343-444b-9cd9-01d2f1085844",
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
  "created_at": "2026-10-28T19:56:48.001495Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128476"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3999a838-4343-444b-9cd9-01d2f1085844` → **200**

```json
{
  "id": "3999a838-4343-444b-9cd9-01d2f1085844",
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
  "created_at": "2026-10-28T19:56:48.001495Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128476"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3999a838-4343-444b-9cd9-01d2f1085844/cancel` → **200**

```json
{
  "command_id": "bbe5dca0-f02c-40a3-bda2-a1327fea8aac",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "3999a838-4343-444b-9cd9-01d2f1085844",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:56:48.001495Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128476"
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
  "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T19:54:16.31163Z",
  "last_entries": [
    {
      "order_id": "3999a838-4343-444b-9cd9-01d2f1085844",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T19:56:48.606758Z"
    },
    {
      "order_id": "f825b879-220c-4056-9fd5-d321bafb18b0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T19:56:47.403514Z"
    },
    {
      "order_id": "47e5ca83-51fc-4d91-9dd4-edc046d70abb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:54:16.31163Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eea76cd9-fac3-4da8-863d-b26a6daaf60b",
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
  "last_heartbeat_at": "2026-10-28T19:56:46.539228Z",
  "last_location_at": "2026-10-28T19:56:46.539228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eea76cd9-fac3-4da8-863d-b26a6daaf60b/close` → **200**

```json
{
  "command_id": "a883b62e-c78b-4623-9a89-a472ca0db266",
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

Done: operator bonus for fulfilled f825b879-220c-4056-9fd5-d321bafb18b0 and operator-fault cancellation 3999a838-4343-444b-9cd9-01d2f1085844.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670132010",
  "device_ref": "sandbox-9499"
}
```

```json
{
  "challenge_id": "fee5074a-f7ac-49cd-a732-7f13e8b1ab7f",
  "expires_at": "2026-10-28T20:01:51.788460771Z",
  "resend_available_at": "2026-10-28T19:56:52.788460771Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670132010` → **200**

```json
{
  "phone": "+380670132010",
  "audience": "CLIENT",
  "code": "026387",
  "sent_at": "2026-10-28T19:56:51.790920368Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674234118",
  "device_ref": "sandbox-15221",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d2ea3fe5-0b73-458b-a358-13942dfdc315",
  "expires_at": "2026-10-28T20:01:52.114529503Z",
  "resend_available_at": "2026-10-28T19:56:53.114529503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674234118` → **200**

```json
{
  "phone": "+380674234118",
  "audience": "CLIENT",
  "code": "087731",
  "sent_at": "2026-10-28T19:56:52.116717165Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674620000",
  "device_ref": "sandbox-23298"
}
```

```json
{
  "challenge_id": "9c65268c-46ee-44a1-9cfe-c6b850cc4e64",
  "expires_at": "2026-10-28T20:01:52.417214175Z",
  "resend_available_at": "2026-10-28T19:56:53.417214175Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674620000` → **200**

```json
{
  "phone": "+380674620000",
  "audience": "CLIENT",
  "code": "837770",
  "sent_at": "2026-10-28T19:56:52.422087003Z",
  "channel": "VOICE"
}
```

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
  "session_id": "252feda9-13b2-4387-b1be-1713eb9d33cc",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzMTMsImlhdCI6MTc5MzIxNzQxMywianRpIjoiNGE1YzRiZDctZWM5Yi00MDU0LWI1OTUtODA1NzlhODMzYmE0Iiwic2lkIjoiMjUyZmVkYTktMTNiMi00Mzg3LWIxYmUtMTcxM2ViOWQzM2NjIn0.FVJb3bIDRTPElMPGQUIy5Ayz1VzLExo9chEOzIWGXjQ",
  "access_expires_at": "2026-10-28T20:11:53.013132116Z",
  "refresh_token": "LYOodadbxE_mFLosJdQfHJEsvwN-smXniqIEEfAN4ME",
  "refresh_expires_at": "2026-10-29T07:56:53.012613661Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674620000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c3127a3f-f8c2-4702-89c2-249ca60150fe",
      "challenge_id": "9c65268c-46ee-44a1-9cfe-c6b850cc4e64",
      "phone": "+380674620000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f2db2318-7acf-487b-83e5-8cb9a37a60eb",
      "error": null,
      "attempted_at": "2026-10-28T19:56:52.422373Z"
    },
    {
      "id": "31d9eb36-5605-4ee9-8ff9-8c1b9d486f57",
      "challenge_id": "9c65268c-46ee-44a1-9cfe-c6b850cc4e64",
      "phone": "+380674620000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T19:56:52.421041Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674620000` → **200**

```json
{
  "phone": "+380674620000",
  "audience": "CLIENT",
  "code": "837770",
  "sent_at": "2026-10-28T19:56:52.422087003Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674234118` → **200**

```json
{
  "deliveries": [
    {
      "id": "31dbaf28-7eab-4f2c-a07c-922583200164",
      "challenge_id": "d2ea3fe5-0b73-458b-a358-13942dfdc315",
      "phone": "+380674234118",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e47a3273-2a58-4a2d-8da1-dc6e58b33315",
      "error": null,
      "attempted_at": "2026-10-28T19:56:52.117006Z"
    }
  ]
}
```

Done: SMS to +380670132010, a call to +380674234118, SMS then a call to +380674620000.

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
  "session_id": "f02e763e-301a-4bd0-9b6c-0348a5caab49",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzMTQsImlhdCI6MTc5MzIxNzQxNCwianRpIjoiZWJkNTY1MzUtNDViYi00M2VmLWFiNjktOWVkY2ViYjYwMzgwIiwic2lkIjoiZjAyZTc2M2UtMzAxYS00YmQwLTliNmMtMDM0OGE1Y2FhYjQ5In0.o4n1nLiCkbLJqKWW-2NH9zSWrgkZ4xQOcnfLJ6-Brhw",
  "access_expires_at": "2026-10-28T20:11:54.188336949Z",
  "refresh_token": "RHI-lmqMOb_dh05mkfohdiEiKAvKWkBT4nBCF4Nlzu4",
  "refresh_expires_at": "2026-10-29T07:56:54.1877733Z",
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
  "session_id": "e7bcd7d6-6afb-4c7f-a58b-7170a46755b1",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzMTQsImlhdCI6MTc5MzIxNzQxNCwianRpIjoiMWRmZmM1NmItYTk2Mi00MTdhLWE3ZjktMTM5NTRmODJkOTAyIiwic2lkIjoiZTdiY2Q3ZDYtNmFmYi00YzdmLWE1OGItNzE3MGE0Njc1NWIxIn0.tt2rHKppYKnICLjsRw2WF2lU5IqYplLrkaWRETKQn0Y",
  "access_expires_at": "2026-10-28T20:11:54.759128411Z",
  "refresh_token": "1aaJZDeGv6zd8F595cV22Qr0Q1sK0cvm_aXHw2KO1_M",
  "refresh_expires_at": "2026-10-29T07:56:54.758604276Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
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

`POST /api/admin/v1/staff-extensions/4a91f207-4303-42d2-aaf4-fad1e3bc6668` → **200**

```json
{
  "command_id": "35bbf1e8-65d6-4ee0-929c-5f381213c56a",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "c68a34b0-5221-47d6-a884-a7ab71d5b0d8",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:56:55.886101Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:56:55.886101Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bb8f8133-5075-49c5-8741-5b7bb52096a6",
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
  "id": "886720a4-ffe8-4a1d-888c-9615e00f40c6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:01:56.428029Z",
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
  "command_id": "b447341f-b27f-473a-b213-b92adfb3c314",
  "quote_id": "886720a4-ffe8-4a1d-888c-9615e00f40c6",
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
    "phone": "+380671102899"
  }
}
```

```json
{
  "id": "d9be1031-8fb8-49fd-91da-0bb6a3e2e421",
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
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:56:56.730413Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671102899"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d9be1031-8fb8-49fd-91da-0bb6a3e2e421/calls` → **201**

```json
{
  "command_id": "853133a9-7d89-4453-a99c-c9b3867c772d",
  "to": "CALLER"
}
```

```json
{
  "id": "59093809-1c53-475e-be0f-0da32cbc024e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "order_ids": [
    "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
  ],
  "started_at": "2026-10-28T19:56:57.060951Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d9be1031-8fb8-49fd-91da-0bb6a3e2e421/calls` → **201**

```json
{
  "command_id": "853133a9-7d89-4453-a99c-c9b3867c772d",
  "to": "CALLER"
}
```

```json
{
  "id": "59093809-1c53-475e-be0f-0da32cbc024e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "order_ids": [
    "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
  ],
  "started_at": "2026-10-28T19:56:57.060951Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "59093809-1c53-475e-be0f-0da32cbc024e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671102899",
    "at": "2026-10-28T19:56:57.063747928Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "59093809-1c53-475e-be0f-0da32cbc024e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11425",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "59093809-1c53-475e-be0f-0da32cbc024e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "59093809-1c53-475e-be0f-0da32cbc024e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "calls": [
    {
      "id": "59093809-1c53-475e-be0f-0da32cbc024e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
      ],
      "started_at": "2026-10-28T19:56:57.060951Z",
      "answered_at": "2026-10-28T19:56:57.712926Z",
      "ended_at": "2026-10-28T19:56:57.735007Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "calls": [
    {
      "id": "59093809-1c53-475e-be0f-0da32cbc024e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
      ],
      "started_at": "2026-10-28T19:56:57.060951Z",
      "answered_at": "2026-10-28T19:56:57.712926Z",
      "ended_at": "2026-10-28T19:56:57.735007Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "calls": [
    {
      "id": "59093809-1c53-475e-be0f-0da32cbc024e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
      ],
      "started_at": "2026-10-28T19:56:57.060951Z",
      "answered_at": "2026-10-28T19:56:57.712926Z",
      "ended_at": "2026-10-28T19:56:57.735007Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "calls": [
    {
      "id": "59093809-1c53-475e-be0f-0da32cbc024e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
      ],
      "started_at": "2026-10-28T19:56:57.060951Z",
      "answered_at": "2026-10-28T19:56:57.712926Z",
      "ended_at": "2026-10-28T19:56:57.735007Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "calls": [
    {
      "id": "59093809-1c53-475e-be0f-0da32cbc024e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
      ],
      "started_at": "2026-10-28T19:56:57.060951Z",
      "answered_at": "2026-10-28T19:56:57.712926Z",
      "ended_at": "2026-10-28T19:56:57.735007Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "calls": [
    {
      "id": "59093809-1c53-475e-be0f-0da32cbc024e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "order_ids": [
        "d9be1031-8fb8-49fd-91da-0bb6a3e2e421"
      ],
      "started_at": "2026-10-28T19:56:57.060951Z",
      "answered_at": "2026-10-28T19:56:57.712926Z",
      "ended_at": "2026-10-28T19:56:57.735007Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:57:07.353643Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d9be1031-8fb8-49fd-91da-0bb6a3e2e421` → **200**

```json
{
  "id": "d9be1031-8fb8-49fd-91da-0bb6a3e2e421",
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
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:56:56.730413Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671102899"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d9be1031-8fb8-49fd-91da-0bb6a3e2e421/cancel` → **200**

```json
{
  "command_id": "4d23511d-9922-4bd5-9ca0-00c3c30141a2",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d9be1031-8fb8-49fd-91da-0bb6a3e2e421",
  "short_number": 22,
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
  "created_at": "2026-10-28T19:56:56.730413Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671102899"
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
  "command_id": "080cc234-7466-4ebe-adf6-e54852c12280",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T19:57:10.150727Z",
  "extension": "101"
}
```

Done: outgoing call 59093809-1c53-475e-be0f-0da32cbc024e from order d9be1031-8fb8-49fd-91da-0bb6a3e2e421, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639965534",
  "device_ref": "sandbox-17671"
}
```

```json
{
  "challenge_id": "b2edd33f-eaba-4899-b2df-f1f6bde950d8",
  "expires_at": "2026-10-28T20:02:10.434742606Z",
  "resend_available_at": "2026-10-28T19:57:11.434742606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639965534` → **200**

```json
{
  "phone": "+380639965534",
  "audience": "CLIENT",
  "code": "150974",
  "sent_at": "2026-10-28T19:57:10.437399298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2edd33f-eaba-4899-b2df-f1f6bde950d8",
  "code": "150974",
  "device_ref": "sandbox-17671"
}
```

```json
{
  "session_id": "acb8548a-3e4d-4728-b09b-8ee759a56bfa",
  "subject": {
    "type": "CLIENT",
    "id": "fa21d2e0-2f88-4880-af8c-520424dc7a74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTIxZDJlMC0yZjg4LTQ4ODAtYWY4Yy01MjA0MjRkYzdhNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzMwLCJpYXQiOjE3OTMyMTc0MzAsImp0aSI6IjRlZTljMTBmLWRhOWEtNDZhOC04N2M1LTg5ZjJiOTRhMmI1NiIsInNpZCI6ImFjYjg1NDhhLTNlNGQtNDcyOC1iMDliLThlZTc1OWE1NmJmYSJ9.5WWZ7LXmNqo3_UvB8kjJZy0KpDdn7UbtYLVcsdXXCZg",
  "access_expires_at": "2026-10-28T20:12:10.748759088Z",
  "refresh_token": "_CI4pSJ6ipjeEfa0Q1hlcDk4IiPhVBj5aWjYlZwYt78",
  "refresh_expires_at": "2026-11-27T19:57:10.748129609Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
  "session_id": "acb8548a-3e4d-4728-b09b-8ee759a56bfa",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639965534",
  "device_ref": "sandbox-10881"
}
```

```json
{
  "challenge_id": "0f9cfb5d-bb83-4240-a470-c6e7e6e291fa",
  "expires_at": "2026-10-28T20:02:13.285686179Z",
  "resend_available_at": "2026-10-28T19:57:14.285686179Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639965534` → **200**

```json
{
  "phone": "+380639965534",
  "audience": "CLIENT",
  "code": "369429",
  "sent_at": "2026-10-28T19:57:13.287960473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f9cfb5d-bb83-4240-a470-c6e7e6e291fa",
  "code": "369429",
  "device_ref": "sandbox-10881"
}
```

```json
{
  "session_id": "dbcd40d4-24d5-48a2-9ff4-41448702b111",
  "subject": {
    "type": "CLIENT",
    "id": "fa21d2e0-2f88-4880-af8c-520424dc7a74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTIxZDJlMC0yZjg4LTQ4ODAtYWY4Yy01MjA0MjRkYzdhNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzMzLCJpYXQiOjE3OTMyMTc0MzMsImp0aSI6IjAyYzAxMDJhLWUzM2ItNGU3My1hNWM0LWE2YzAwNDAwZWMyOCIsInNpZCI6ImRiY2Q0MGQ0LTI0ZDUtNDhhMi05ZmY0LTQxNDQ4NzAyYjExMSJ9.f_ZtVoH-UaN-QwIY5NqAiMtA54vDpt8Er22YF6ILBQQ",
  "access_expires_at": "2026-10-28T20:12:13.590889934Z",
  "refresh_token": "XI2OS2WZr-shd3dQEb4dVcm3aUq9xydmwoYKoi50g3c",
  "refresh_expires_at": "2026-11-27T19:57:13.590138258Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "60d2f9a1-e777-41cf-8317-9491c4d63b9b",
  "expires_at": "2026-10-28T20:02:15.864032993Z",
  "resend_available_at": "2026-10-28T19:57:16.864032993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639965534` → **200**

```json
{
  "phone": "+380639965534",
  "audience": "CLIENT",
  "code": "318737",
  "sent_at": "2026-10-28T19:57:15.866447327Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637885189"
}
```

```json
{
  "challenge_id": "54363d05-10a2-4bf3-ac0e-6deb683fc584",
  "expires_at": "2026-10-28T20:02:16.153826249Z",
  "resend_available_at": "2026-10-28T19:57:17.153826249Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637885189` → **200**

```json
{
  "phone": "+380637885189",
  "audience": "CLIENT",
  "code": "809386",
  "sent_at": "2026-10-28T19:57:16.155905429Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "4e239ebc-8d17-47d4-a46e-046de6ebadd8",
  "current_challenge_id": "60d2f9a1-e777-41cf-8317-9491c4d63b9b",
  "current_code": "000000",
  "new_challenge_id": "54363d05-10a2-4bf3-ac0e-6deb683fc584",
  "new_code": "809386"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "584e350a-96d1-44c1-8257-27aed90aff6b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "e67dfe14-d8d5-4e0e-84cd-c742794ae378",
  "current_challenge_id": "60d2f9a1-e777-41cf-8317-9491c4d63b9b",
  "current_code": "318737",
  "new_challenge_id": "54363d05-10a2-4bf3-ac0e-6deb683fc584",
  "new_code": "809386"
}
```

```json
{
  "subject_id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
  "phone": "+380637885189",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
  "session_id": "acb8548a-3e4d-4728-b09b-8ee759a56bfa",
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
  "correlation_id": "e29fda62-42d4-4256-a02f-3057e9e0061f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637885189",
  "device_ref": "sandbox-23686"
}
```

```json
{
  "challenge_id": "35d0d949-629c-4308-a99b-773fa31cc430",
  "expires_at": "2026-10-28T20:02:19.571143894Z",
  "resend_available_at": "2026-10-28T19:57:20.571143894Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637885189` → **200**

```json
{
  "phone": "+380637885189",
  "audience": "CLIENT",
  "code": "380751",
  "sent_at": "2026-10-28T19:57:19.573338292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35d0d949-629c-4308-a99b-773fa31cc430",
  "code": "380751",
  "device_ref": "sandbox-23686"
}
```

```json
{
  "session_id": "932d98ac-acbf-4deb-b645-ab0241c1c1f5",
  "subject": {
    "type": "CLIENT",
    "id": "fa21d2e0-2f88-4880-af8c-520424dc7a74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTIxZDJlMC0yZjg4LTQ4ODAtYWY4Yy01MjA0MjRkYzdhNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzM5LCJpYXQiOjE3OTMyMTc0MzksImp0aSI6IjQ3MGZiYjA3LWE3MWEtNDY3ZC1iN2RjLWJhYmVmMjM3YzY5YiIsInNpZCI6IjkzMmQ5OGFjLWFjYmYtNGRlYi1iNjQ1LWFiMDI0MWMxYzFmNSJ9.mgzw83ppM0iGFTitgHKry3d8a77crAabPvr9SclwVy8",
  "access_expires_at": "2026-10-28T20:12:19.876128426Z",
  "refresh_token": "c-4bPNIzvS0zhlq1HeCekaK8YZMaQw1GIkrlRGzW3YE",
  "refresh_expires_at": "2026-11-27T19:57:19.875610454Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
  "session_id": "932d98ac-acbf-4deb-b645-ab0241c1c1f5",
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
  "session_id": "49a8a308-7e10-4275-9e23-e1c34c385312",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNDAsImlhdCI6MTc5MzIxNzQ0MCwianRpIjoiN2Q1NDg0ZWUtNTA0ZC00NGM5LThkOTEtMDUzMjZkMDVjMjc0Iiwic2lkIjoiNDlhOGEzMDgtN2UxMC00Mjc1LTllMjMtZTFjMzRjMzg1MzEyIn0.VPmNBLhBkzpJjAv-ohBOxAI-ogLpOkb_T28S_j8o6TA",
  "access_expires_at": "2026-10-28T20:12:20.713758825Z",
  "refresh_token": "SSRHej7FK6JehjTZ-WIS6Kd0S5IbKRsKKm_KpnN2CKk",
  "refresh_expires_at": "2026-10-29T07:57:20.71319145Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74` → **200**

```json
{
  "client": {
    "id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
    "phone": "+380637885189",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:57:10.735754Z",
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

`POST /api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74/phone/new-code` → **201**

```json
{
  "phone": "+380634733332"
}
```

```json
{
  "challenge_id": "fd5ad2e6-24d6-4580-a19e-89bd3b6155e6",
  "expires_at": "2026-10-28T20:02:21.308368171Z",
  "resend_available_at": "2026-10-28T19:57:22.308368171Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634733332` → **200**

```json
{
  "phone": "+380634733332",
  "audience": "CLIENT",
  "code": "769897",
  "sent_at": "2026-10-28T19:57:21.310382677Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74/phone` → **422**

```json
{
  "command_id": "a67a3adc-a64f-4442-a7a7-0e618614bcf7",
  "expected_version": 3,
  "new_challenge_id": "fd5ad2e6-24d6-4580-a19e-89bd3b6155e6",
  "new_code": "769898",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "124c14c1-5ee8-455d-9c7b-b1d34a26d077"
}
```

`POST /api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74/phone` → **400**

```json
{
  "command_id": "9b25253d-fbc0-4da9-9019-0dcb8be3e469",
  "expected_version": 3,
  "new_challenge_id": "fd5ad2e6-24d6-4580-a19e-89bd3b6155e6",
  "new_code": "769897",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1543aa28-ea89-45bf-91c0-c27826ca2f2e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/fa21d2e0-2f88-4880-af8c-520424dc7a74/phone` → **200**

```json
{
  "command_id": "5363c6a7-184b-4d7d-a488-fb9031c38274",
  "expected_version": 3,
  "new_challenge_id": "fd5ad2e6-24d6-4580-a19e-89bd3b6155e6",
  "new_code": "769897",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
  "phone": "+380634733332",
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
  "correlation_id": "3c892a70-e4b7-4de6-a042-782d823c0c01"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634733332",
  "device_ref": "sandbox-8696"
}
```

```json
{
  "challenge_id": "3970d27c-fc4d-4003-8f50-4df7c51515e9",
  "expires_at": "2026-10-28T20:02:22.764867475Z",
  "resend_available_at": "2026-10-28T19:57:23.764867475Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634733332` → **200**

```json
{
  "phone": "+380634733332",
  "audience": "CLIENT",
  "code": "393523",
  "sent_at": "2026-10-28T19:57:22.766980896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3970d27c-fc4d-4003-8f50-4df7c51515e9",
  "code": "393523",
  "device_ref": "sandbox-8696"
}
```

```json
{
  "session_id": "c3234aaa-3b97-44b4-8cb2-17c01ec1dd7d",
  "subject": {
    "type": "CLIENT",
    "id": "fa21d2e0-2f88-4880-af8c-520424dc7a74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTIxZDJlMC0yZjg4LTQ4ODAtYWY4Yy01MjA0MjRkYzdhNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzQzLCJpYXQiOjE3OTMyMTc0NDMsImp0aSI6ImQ5OTcyYTY1LTI0ZGUtNDMwNS1hYTdmLWRlYjgzNzMyNWQzMyIsInNpZCI6ImMzMjM0YWFhLTNiOTctNDRiNC04Y2IyLTE3YzAxZWMxZGQ3ZCJ9.W8r-sZsQR_BYqTDg8r-HBWWHMPB_aO1T3iiAvwxYEzA",
  "access_expires_at": "2026-10-28T20:12:23.07104726Z",
  "refresh_token": "wUuMYfc-dpfoXCKVNOBPHdNCJ-WIzQ_yQyZeuJcUaZg",
  "refresh_expires_at": "2026-11-27T19:57:23.070470297Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fa21d2e0-2f88-4880-af8c-520424dc7a74",
  "session_id": "c3234aaa-3b97-44b4-8cb2-17c01ec1dd7d",
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
  "phone": "+380637666659",
  "device_ref": "sandbox-1286"
}
```

```json
{
  "challenge_id": "eb20193f-c121-4953-84da-310ec39e4a8d",
  "expires_at": "2026-10-28T20:02:23.618498187Z",
  "resend_available_at": "2026-10-28T19:57:24.618498187Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637666659` → **200**

```json
{
  "phone": "+380637666659",
  "audience": "CLIENT",
  "code": "191459",
  "sent_at": "2026-10-28T19:57:23.62077272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb20193f-c121-4953-84da-310ec39e4a8d",
  "code": "191459",
  "device_ref": "sandbox-1286"
}
```

```json
{
  "session_id": "39373c1f-d9d1-4d70-a312-47a93afd41a3",
  "subject": {
    "type": "CLIENT",
    "id": "4262e1cb-44a5-463c-a846-cbea14763f8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjYyZTFjYi00NGE1LTQ2M2MtYTg0Ni1jYmVhMTQ3NjNmOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzQzLCJpYXQiOjE3OTMyMTc0NDMsImp0aSI6IjE5NDUwODFkLTUyNTAtNDUzMS04ZGU5LWIwNzBhMTE1NzU2MiIsInNpZCI6IjM5MzczYzFmLWQ5ZDEtNGQ3MC1hMzEyLTQ3YTkzYWZkNDFhMyJ9.JQ-16UNS98eczpbUKLQP1l-Yw9sWbRrkO7Q2QLdk_ko",
  "access_expires_at": "2026-10-28T20:12:23.923407316Z",
  "refresh_token": "DJBQRsIVdOzD48t9j9NL8wM0TyY1eRyR0IXmZLHe6yQ",
  "refresh_expires_at": "2026-11-27T19:57:23.92281922Z",
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
  "session_id": "96eb788a-de15-4893-ad11-a13a3b48cdad",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNDUsImlhdCI6MTc5MzIxNzQ0NSwianRpIjoiOGRhNjA0ZDUtY2YwZi00NmJkLTgwZjgtNzU2ZGUxZGVhYzg2Iiwic2lkIjoiOTZlYjc4OGEtZGUxNS00ODkzLWFkMTEtYTEzYTNiNDhjZGFkIn0.B3_Ih6TkpkexUk7rgH3wgz8UqEM856k1rLKMwHy4ms8",
  "access_expires_at": "2026-10-28T20:12:25.066131611Z",
  "refresh_token": "_NAoMiuNnXjES3ahGDReG5b3ktEiNGJeew2su0T_Dvg",
  "refresh_expires_at": "2026-10-29T07:57:25.065543145Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637666659` → **200**

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
  "correlation_id": "2ef7068f-8808-426e-b373-e9c7e31624da"
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
  "session_id": "582bcb8c-2fde-4692-aa2f-6693cbf37185",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNDYsImlhdCI6MTc5MzIxNzQ0NiwianRpIjoiNTEwMDU4M2UtNDkzNS00MzJlLTkzNjgtNDI3ZDBkOTYwZDlhIiwic2lkIjoiNTgyYmNiOGMtMmZkZS00NjkyLWFhMmYtNjY5M2NiZjM3MTg1In0.B1CHxC-trmwO-b5YdpNp4Pzr5x-Gs7zg4UJ4KFxvKKg",
  "access_expires_at": "2026-10-28T20:12:26.216950069Z",
  "refresh_token": "CBNLF3Gn2EOytjEAYsGHhKZWOWhvVbWVEjoAd5YGoks",
  "refresh_expires_at": "2026-10-29T07:57:26.216351706Z",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-28T19:53:45.840278Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "667386b4-7751-4350-939a-e987d5e7ea00",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T19:57:26.795313043Z"
}
```

## The rider books the airport for 2026-10-28T22:57:25Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600186668",
  "device_ref": "sandbox-25944"
}
```

```json
{
  "challenge_id": "54ae5c48-a5a7-452f-98ca-8ad4cda515c2",
  "expires_at": "2026-10-28T20:02:27.094400037Z",
  "resend_available_at": "2026-10-28T19:57:28.094400037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600186668` → **200**

```json
{
  "phone": "+48600186668",
  "audience": "CLIENT",
  "code": "438659",
  "sent_at": "2026-10-28T19:57:27.096824838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54ae5c48-a5a7-452f-98ca-8ad4cda515c2",
  "code": "438659",
  "device_ref": "sandbox-25944"
}
```

```json
{
  "session_id": "0ae28eb5-920c-4ca8-b519-ddcfc9b8f9a2",
  "subject": {
    "type": "CLIENT",
    "id": "8d62c82b-1e6f-497e-b394-d826525845ba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDYyYzgyYi0xZTZmLTQ5N2UtYjM5NC1kODI2NTI1ODQ1YmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzQ3LCJpYXQiOjE3OTMyMTc0NDcsImp0aSI6IjdlZTAyOTQxLTA2NjEtNGViNy05MDExLWMyOWUxMGJlYjBlZSIsInNpZCI6IjBhZTI4ZWI1LTkyMGMtNGNhOC1iNTE5LWRkY2ZjOWI4ZjlhMiJ9.Rzf9VYEIKjfy17Msy7hGsFyWDIbzE5KmljFunL9M60I",
  "access_expires_at": "2026-10-28T20:12:27.411881332Z",
  "refresh_token": "5h4mMXnwMK8goZNzn6RHe5r-7OTZogowduPfgY0vGYM",
  "refresh_expires_at": "2026-11-27T19:57:27.411220452Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d62d14d-eb30-4998-ad40-5a2f988a62a5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T22:57:25Z"
}
```

```json
{
  "id": "e642feb6-e010-49be-8518-7f062e33a1d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:02:27.703726Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:57:25Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "af21834e-18fc-4714-80d6-a22a56b2503a",
  "quote_id": "e642feb6-e010-49be-8518-7f062e33a1d5",
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
  "pickup_at": "2026-10-28T22:57:25Z"
}
```

```json
{
  "id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8d62c82b-1e6f-497e-b394-d826525845ba",
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
  "created_at": "2026-10-28T19:57:28.007167Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:57:25Z",
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
  "device_ref": "sandbox-156"
}
```

```json
{
  "challenge_id": "00032bd4-9187-43cf-ad42-8c98d148bfc4",
  "expires_at": "2026-10-28T20:02:28.30350411Z",
  "resend_available_at": "2026-10-28T19:57:29.30350411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "389174",
  "sent_at": "2026-10-28T19:57:28.305781735Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00032bd4-9187-43cf-ad42-8c98d148bfc4",
  "code": "389174",
  "device_ref": "sandbox-156"
}
```

```json
{
  "session_id": "128865bb-3370-428c-a9b6-4bb1b57d747c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODM0OCwiaWF0IjoxNzkzMjE3NDQ4LCJqdGkiOiIyNmZhM2NhZS1iYzJjLTRlMDctYTQyZC1jMjBjMzNkMTI4OGIiLCJzaWQiOiIxMjg4NjViYi0zMzcwLTQyOGMtYTliNi00YmIxYjU3ZDc0N2MifQ.2GS0Ook95iHrBZOVNTJKN3AWBno9D8uXpQqceATRHqk",
  "access_expires_at": "2026-10-28T20:12:28.611106943Z",
  "refresh_token": "rEE-wSo8dRGo4AT3bLT6wubTBoaHRv6KmuQXuV5g9j4",
  "refresh_expires_at": "2026-11-27T19:57:28.610607524Z",
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
  "command_id": "824b39d9-9cc6-4d5c-b154-4875b1dbaecb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:57:29Z",
    "sequence": 1793217449160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "eba4b8f6-f450-41ee-824d-d6171778caef",
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
  "last_heartbeat_at": "2026-10-28T19:57:29.179187Z",
  "last_location_at": "2026-10-28T19:57:29.179187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
      "short_number": 23,
      "pickup_at": "2026-10-28T22:57:25Z",
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

`POST /api/driver/v1/preorders/c4e84fc9-95b6-4363-8865-1ab26d80eefc/reserve` → **200**

```json
{
  "command_id": "af8c7702-ffdb-4fa8-a492-9fe501ff68f3"
}
```

```json
{
  "id": "e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a",
  "state": "RESERVED",
  "order": {
    "order_id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
    "short_number": 23,
    "pickup_at": "2026-10-28T22:57:25Z",
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
  "reserved_at": "2026-10-28T19:57:29.737121Z",
  "confirm_from": "2026-10-28T22:27:25Z",
  "confirm_until": "2026-10-28T22:37:25Z",
  "drop_until": "2026-10-28T21:57:25Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a",
      "state": "RESERVED",
      "order": {
        "order_id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
        "short_number": 23,
        "pickup_at": "2026-10-28T22:57:25Z",
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
      "reserved_at": "2026-10-28T19:57:29.737121Z",
      "confirm_from": "2026-10-28T22:27:25Z",
      "confirm_until": "2026-10-28T22:37:25Z",
      "drop_until": "2026-10-28T21:57:25Z"
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
      "id": "e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a",
      "state": "RESERVED",
      "order": {
        "order_id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
        "short_number": 23,
        "pickup_at": "2026-10-28T22:57:25Z",
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
      "reserved_at": "2026-10-28T19:57:29.737121Z",
      "confirm_from": "2026-10-28T22:27:25Z",
      "confirm_until": "2026-10-28T22:37:25Z",
      "drop_until": "2026-10-28T21:57:25Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a/confirm` → **409**

```json
{
  "command_id": "fdca9fd7-f0ff-4309-a538-70459fe89e9c"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c999ff9a-297f-4693-ab0f-faf6781b1576"
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
  "session_id": "4e5ec838-0e4c-4bea-b5de-42a6519c350f",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNTEsImlhdCI6MTc5MzIxNzQ1MSwianRpIjoiMzQ2YjNkNWMtN2MyNC00MTdkLWEzZWUtMWE2YTk3MGM4NzNmIiwic2lkIjoiNGU1ZWM4MzgtMGU0Yy00YmVhLWI1ZGUtNDJhNjUxOWMzNTBmIn0.mQsC1T-2kVsT-vP4cb8iTlLPDdXjatwLZW9G-4rrLJM",
  "access_expires_at": "2026-10-28T20:12:31.141387834Z",
  "refresh_token": "RQWN41uYdiOJamINCSefPFAhKLJNOzpQ3Hy3la4jytc",
  "refresh_expires_at": "2026-10-29T07:57:31.140869981Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c4e84fc9-95b6-4363-8865-1ab26d80eefc` → **200**

```json
{
  "id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8d62c82b-1e6f-497e-b394-d826525845ba",
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
  "created_at": "2026-10-28T19:57:28.007167Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T22:57:25Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T19:57:29.737121Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c4e84fc9-95b6-4363-8865-1ab26d80eefc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T19:57:28.008299Z",
      "actor": {
        "type": "CLIENT",
        "id": "8d62c82b-1e6f-497e-b394-d826525845ba",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
        "preorder": true,
        "quote_id": "e642feb6-e010-49be-8518-7f062e33a1d5",
        "pickup_at": "2026-10-28T22:57:25Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "64e21cda-bee4-4d98-b7ac-a7d8348f606c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T19:57:29.738891Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c4e84fc9-95b6-4363-8865-1ab26d80eefc",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a"
      },
      "correlation_id": "397ef623-66b1-4088-bc84-54dcc179279a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c4e84fc9-95b6-4363-8865-1ab26d80eefc, reservation e5a872ad-08ba-4060-bb1e-00f1d1b3cf5a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5664"
}
```

```json
{
  "challenge_id": "533d741b-690c-459d-8de4-49c9e241492b",
  "expires_at": "2026-10-28T20:02:32.007299021Z",
  "resend_available_at": "2026-10-28T19:57:33.007299021Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "086102",
  "sent_at": "2026-10-28T19:57:32.009430167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "533d741b-690c-459d-8de4-49c9e241492b",
  "code": "086102",
  "device_ref": "sandbox-5664"
}
```

```json
{
  "session_id": "c055b946-fa72-4b3b-8e53-b3bd4654891b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODM1MiwiaWF0IjoxNzkzMjE3NDUyLCJqdGkiOiJhYTJiMDY5OS1kZjdkLTRiODYtOWU5ZS1hZDI2ZWQ4YmQzY2QiLCJzaWQiOiJjMDU1Yjk0Ni1mYTcyLTRiM2ItOGU1My1iM2JkNDY1NDg5MWIifQ.brEqlXxI6g6KTCrfVIwwZKQTpkPnyYguqI8kM8vtu14",
  "access_expires_at": "2026-10-28T20:12:32.315379042Z",
  "refresh_token": "5dj3s3dQGcw1YtTL4rQSnHCBHmORqPGWm93CEocdWNo",
  "refresh_expires_at": "2026-11-27T19:57:32.314806206Z",
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
  "command_id": "3f0ca869-6138-4de5-9d82-2e73a96d05d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:57:32Z",
    "sequence": 1793217452874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:57:32.893125Z",
  "last_location_at": "2026-10-28T19:57:32.893125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675833770",
  "device_ref": "sandbox-3571"
}
```

```json
{
  "challenge_id": "eda762f9-9a5d-4ae5-90f3-355b1efaf33c",
  "expires_at": "2026-10-28T20:02:33.164968582Z",
  "resend_available_at": "2026-10-28T19:57:34.164968582Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675833770` → **200**

```json
{
  "phone": "+380675833770",
  "audience": "CLIENT",
  "code": "460621",
  "sent_at": "2026-10-28T19:57:33.16799312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eda762f9-9a5d-4ae5-90f3-355b1efaf33c",
  "code": "460621",
  "device_ref": "sandbox-3571"
}
```

```json
{
  "session_id": "83dcf52a-2927-4fa1-8f8e-13397c323e49",
  "subject": {
    "type": "CLIENT",
    "id": "07e46bd4-1598-4447-ba3b-e17e520fbc5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwN2U0NmJkNC0xNTk4LTQ0NDctYmEzYi1lMTdlNTIwZmJjNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzUzLCJpYXQiOjE3OTMyMTc0NTMsImp0aSI6IjM4YjAxZTY3LTZlMGUtNGIyMi05ZDkyLWRlNzk4YWJhNzNmYiIsInNpZCI6IjgzZGNmNTJhLTI5MjctNGZhMS04ZjhlLTEzMzk3YzMyM2U0OSJ9.PiQ6jXk92sQg_oO2pmZNl4Zw512mn8PYxoOGtxi_EpU",
  "access_expires_at": "2026-10-28T20:12:33.483266966Z",
  "refresh_token": "trai3WwCbAwhZQ6edH8L4CzZFjFo8UEyLT__ZMVRWc0",
  "refresh_expires_at": "2026-11-27T19:57:33.482780091Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8a71017c-a066-49a2-b89e-ff7abdb6735a",
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
  "id": "10ad8659-ee33-4a0b-b692-5e54d12638a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:02:33.771930Z",
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
  "command_id": "500a7c5e-0eef-4354-89b1-6800e8a7a0a1",
  "quote_id": "10ad8659-ee33-4a0b-b692-5e54d12638a8",
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
  "id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "07e46bd4-1598-4447-ba3b-e17e520fbc5e",
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
  "created_at": "2026-10-28T19:57:34.067775Z",
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
    "id": "7827f228-5087-44ad-9e57-72f8fc7b20b5",
    "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
    "expires_at": "2026-10-28T19:57:49.071127Z",
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

`POST /api/driver/v1/offers/7827f228-5087-44ad-9e57-72f8fc7b20b5/accept` → **200**

```json
{
  "command_id": "94579fb4-ac87-438e-a12f-573b1f5015bd"
}
```

```json
{
  "id": "608ac235-23e1-47bf-a5f1-8362a50f39e2",
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af948dfd-aa29-49b7-936b-45b73513e0e4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af948dfd-aa29-49b7-936b-45b73513e0e4",
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "assignment_id": "608ac235-23e1-47bf-a5f1-8362a50f39e2",
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

`POST /api/driver/v1/work-sessions/7e68d458-438f-466e-800a-13b102804ba9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:57:35Z",
    "sequence": 1793217455196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:57:35.214719Z",
  "last_location_at": "2026-10-28T19:57:35.214719Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af948dfd-aa29-49b7-936b-45b73513e0e4",
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "assignment_id": "608ac235-23e1-47bf-a5f1-8362a50f39e2",
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

`POST /api/driver/v1/trips/af948dfd-aa29-49b7-936b-45b73513e0e4/arrive` → **200**

```json
{
  "command_id": "dd0252a8-2f82-4ad5-995b-ca94e1934d9f",
  "expected_version": 0
}
```

```json
{
  "id": "af948dfd-aa29-49b7-936b-45b73513e0e4",
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "assignment_id": "608ac235-23e1-47bf-a5f1-8362a50f39e2",
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
  "arrived_at": "2026-10-28T19:57:35.790482Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af948dfd-aa29-49b7-936b-45b73513e0e4/start` → **200**

```json
{
  "command_id": "c77bc280-d786-455c-83e0-73bcd4b82943",
  "expected_version": 1
}
```

```json
{
  "id": "af948dfd-aa29-49b7-936b-45b73513e0e4",
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "assignment_id": "608ac235-23e1-47bf-a5f1-8362a50f39e2",
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
  "arrived_at": "2026-10-28T19:57:35.790482Z",
  "started_at": "2026-10-28T19:57:36.083146Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7e68d458-438f-466e-800a-13b102804ba9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:57:36Z",
    "sequence": 1793217456359
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:57:36.378115Z",
  "last_location_at": "2026-10-28T19:57:36.378115Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/af948dfd-aa29-49b7-936b-45b73513e0e4/complete` → **200**

```json
{
  "command_id": "e6bc8e98-4ef9-47bd-a191-e21702e4c417",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:57:36Z",
  "cash_received": true
}
```

```json
{
  "id": "af948dfd-aa29-49b7-936b-45b73513e0e4",
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "assignment_id": "608ac235-23e1-47bf-a5f1-8362a50f39e2",
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
  "arrived_at": "2026-10-28T19:57:35.790482Z",
  "started_at": "2026-10-28T19:57:36.083146Z",
  "completed_at": "2026-10-28T19:57:36.650547Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/be09b863-1c33-4a06-a1f5-e10c7bfc8bb4/rating` → **200**

```json
{
  "command_id": "9ca3b52b-a2f1-49d1-9573-8b209567d26d",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "score": 5,
  "created_at": "2026-10-28T19:57:36.976134786Z"
}
```

`POST /api/driver/v1/orders/be09b863-1c33-4a06-a1f5-e10c7bfc8bb4/rating` → **200**

```json
{
  "command_id": "e7f5e8e0-5ea8-46cc-ae38-7b50ad2173fc",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
  "score": 4,
  "created_at": "2026-10-28T19:57:37.335349619Z"
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
  "session_id": "3c357900-0c46-4674-8f80-112831fdc1a6",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNTgsImlhdCI6MTc5MzIxNzQ1OCwianRpIjoiNjJjNmFkODMtZjI0YS00ZmI4LTgwZTgtOTkwYjhhOTU2NjFmIiwic2lkIjoiM2MzNTc5MDAtMGM0Ni00Njc0LThmODAtMTEyODMxZmRjMWE2In0.n03mJygPvbPQ2Cq55HYwxq8-5y5q2xHdGUSiSc49PAA",
  "access_expires_at": "2026-10-28T20:12:38.290271833Z",
  "refresh_token": "HfJTeq_TdkBETLy0SptmgUnj05h2-v76riYOOXgTvmU",
  "refresh_expires_at": "2026-10-29T07:57:38.289742117Z",
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
  "session_id": "f9c7326e-013e-485d-9057-a4547f6542a7",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNTgsImlhdCI6MTc5MzIxNzQ1OCwianRpIjoiMzUwYTZjY2ItMzcxYy00YzA2LWFiYTMtNGM1ZmU3ZjBlMjMxIiwic2lkIjoiZjljNzMyNmUtMDEzZS00ODVkLTkwNTctYTQ1NDdmNjU0MmE3In0.WZJ3ar5CZT6bKq6541OSRehA8zNW79q-UsWsQYpc54w",
  "access_expires_at": "2026-10-28T20:12:38.8598279Z",
  "refresh_token": "-z-WX70KQwTN0RPXDUB_jx1eEJBXbxc3z1IoGO--Ugk",
  "refresh_expires_at": "2026-10-29T07:57:38.859247751Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/be09b863-1c33-4a06-a1f5-e10c7bfc8bb4/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
      "author_type": "RIDER",
      "author_id": "07e46bd4-1598-4447-ba3b-e17e520fbc5e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T19:57:36.976135Z"
    },
    {
      "order_id": "be09b863-1c33-4a06-a1f5-e10c7bfc8bb4",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "07e46bd4-1598-4447-ba3b-e17e520fbc5e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T19:57:37.33535Z"
    }
  ]
}
```

Done: ratings for order be09b863-1c33-4a06-a1f5-e10c7bfc8bb4.

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
  "session_id": "42cc0a98-4adc-43ab-90ea-64ab4fe25c8b",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNTksImlhdCI6MTc5MzIxNzQ1OSwianRpIjoiODRlM2Y0ZTEtN2Y5Mi00NmExLWFiYTAtYzI5MzUxMTQ1MmVkIiwic2lkIjoiNDJjYzBhOTgtNGFkYy00M2FiLTkwZWEtNjRhYjRmZTI1YzhiIn0.mAaTg9uoY4XIZTHdR1QJ3J0GUqAue7XtXZg2OXTJY_g",
  "access_expires_at": "2026-10-28T20:12:39.728035865Z",
  "refresh_token": "Q3uuOGLDvTM_zTdK9EQ55vsuxt3UGR7AHwositPmIlw",
  "refresh_expires_at": "2026-10-29T07:57:39.727232289Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b2ad1898-7a06-4151-aa40-caa3081a1b86",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "07a45029-351e-43da-a1ff-ee1dec3e1b1e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:40.009353Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/07a45029-351e-43da-a1ff-ee1dec3e1b1e` → **200**

```json
{
  "id": "07a45029-351e-43da-a1ff-ee1dec3e1b1e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:40.009353Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/07a45029-351e-43da-a1ff-ee1dec3e1b1e` → **200**

```json
{
  "id": "07a45029-351e-43da-a1ff-ee1dec3e1b1e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:40.009353Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/07a45029-351e-43da-a1ff-ee1dec3e1b1e` → **200**

```json
{
  "id": "07a45029-351e-43da-a1ff-ee1dec3e1b1e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:57:40.009353Z",
  "ready_at": "2026-10-28T19:57:42.39861Z",
  "expires_at": "2026-10-29T19:57:42.39861Z"
}
```

`GET /api/admin/v1/reports/exports/07a45029-351e-43da-a1ff-ee1dec3e1b1e/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7bb15f68-4df7-44c4-92f3-bd42b55af3ce",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f69cfba8-45e5-4b96-ba19-b76f99b1c08b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:43.170399Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69cfba8-45e5-4b96-ba19-b76f99b1c08b` → **200**

```json
{
  "id": "f69cfba8-45e5-4b96-ba19-b76f99b1c08b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:43.170399Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69cfba8-45e5-4b96-ba19-b76f99b1c08b` → **200**

```json
{
  "id": "f69cfba8-45e5-4b96-ba19-b76f99b1c08b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:43.170399Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69cfba8-45e5-4b96-ba19-b76f99b1c08b` → **200**

```json
{
  "id": "f69cfba8-45e5-4b96-ba19-b76f99b1c08b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:43.170399Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69cfba8-45e5-4b96-ba19-b76f99b1c08b` → **200**

```json
{
  "id": "f69cfba8-45e5-4b96-ba19-b76f99b1c08b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:57:43.170399Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f69cfba8-45e5-4b96-ba19-b76f99b1c08b` → **200**

```json
{
  "id": "f69cfba8-45e5-4b96-ba19-b76f99b1c08b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:57:43.170399Z",
  "ready_at": "2026-10-28T19:57:47.410107Z",
  "expires_at": "2026-10-29T19:57:47.410107Z"
}
```

`GET /api/admin/v1/reports/exports/f69cfba8-45e5-4b96-ba19-b76f99b1c08b/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/34d0eed1-023e-4ad0-9b07-15f38e794c62` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/34d0eed1-023e-4ad0-9b07-15f38e794c62",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "706bf63a-3981-4947-9777-35da58ec36c7"
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
  "device_ref": "sandbox-21571"
}
```

```json
{
  "challenge_id": "bccadd48-d008-41f9-9947-b1482ef028da",
  "expires_at": "2026-10-28T20:02:49.143545503Z",
  "resend_available_at": "2026-10-28T19:57:50.143545503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "827049",
  "sent_at": "2026-10-28T19:57:49.146001642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bccadd48-d008-41f9-9947-b1482ef028da",
  "code": "827049",
  "device_ref": "sandbox-21571"
}
```

```json
{
  "session_id": "3bd22d4a-85ac-4cf4-ad3f-5a0ee2df7911",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODM2OSwiaWF0IjoxNzkzMjE3NDY5LCJqdGkiOiI0MmI4NmY3MC1lNjNlLTRlZTUtOWIzMS1iNTM0ZGUyMzM3ZmYiLCJzaWQiOiIzYmQyMmQ0YS04NWFjLTRjZjQtYWQzZi01YTBlZTJkZjc5MTEifQ.70r9me7wMq8d9VniIEbRxo8LCAmE6ZO92cJlQgpeV4E",
  "access_expires_at": "2026-10-28T20:12:49.447550796Z",
  "refresh_token": "n9QW7h5I67RXBljy0zXx7oCiV3HAIUdQnM5jXYW7v3Y",
  "refresh_expires_at": "2026-11-27T19:57:49.446836537Z",
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
  "command_id": "f4359b46-2f9c-4b8b-bd92-ca907775116c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:57:50Z",
    "sequence": 1793217470249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "058eba9c-c18e-4241-b547-f406d4e7c05b",
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
  "last_heartbeat_at": "2026-10-28T19:57:50.268491Z",
  "last_location_at": "2026-10-28T19:57:50.268491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "4eee6912-cbd4-49b1-a264-838de48d3b00",
  "points": [
    {
      "sequence": 1793217472559,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:56:52Z"
    },
    {
      "sequence": 1793217472567,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:57:52Z"
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
  "session_id": "e945dcf3-06c6-422c-9aea-49d53faee4ab",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNzMsImlhdCI6MTc5MzIxNzQ3MywianRpIjoiMDk4ZGU0MjktYWYxOC00YTVjLTg4MzgtYjVkN2JkMmI4ZGI1Iiwic2lkIjoiZTk0NWRjZjMtMDZjNi00MjJjLTlhZWEtNDlkNTNmYWVlNGFiIn0._--QxagOpjqWXb0bHEPkvMVoo3FgE_hjymVjKynZ7Js",
  "access_expires_at": "2026-10-28T20:12:53.205952258Z",
  "refresh_token": "2GAX5QOQWM7YExhU6iSg6197ZUAnDkNfMrH_FlIz5k0",
  "refresh_expires_at": "2026-10-29T07:57:53.205260151Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "bf4f35d9-98ab-475d-a248-ac9aa9039592",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T19:57:52Z",
        "track_point_id": "0d2e1768-54cf-4b77-9d18-070d6bcf8952",
        "work_session_id": "058eba9c-c18e-4241-b547-f406d4e7c05b"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T19:57:52Z",
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
    "version": 4,
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

`POST /api/admin/v1/driver-risk-flags/bf4f35d9-98ab-475d-a248-ac9aa9039592/confirm` → **200**

```json
{
  "command_id": "316c0371-5e82-44da-9522-9773a4375077",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "bf4f35d9-98ab-475d-a248-ac9aa9039592",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T19:57:52Z",
    "track_point_id": "0d2e1768-54cf-4b77-9d18-070d6bcf8952",
    "work_session_id": "058eba9c-c18e-4241-b547-f406d4e7c05b"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T19:57:52Z",
  "reason": null,
  "reviewed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reviewed_at": "2026-10-28T19:57:54.071726Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/bf4f35d9-98ab-475d-a248-ac9aa9039592/dismiss` → **409**

```json
{
  "command_id": "d617d7e2-8cd8-42a1-979f-f072ee2121d6",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/bf4f35d9-98ab-475d-a248-ac9aa9039592/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ea3707f8-48da-4c0e-9fca-e2677380d59b"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "21a6f06d-abc9-4f16-8fa7-653cf059c415",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c150cff0-6210-4b27-8ca0-4fd8cd9dc24c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "raised_at": "2026-10-28T19:57:54.648522Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c150cff0-6210-4b27-8ca0-4fd8cd9dc24c/dismiss` → **200**

```json
{
  "command_id": "13aabdeb-469c-4667-804f-ef5e4e911417",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c150cff0-6210-4b27-8ca0-4fd8cd9dc24c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "raised_at": "2026-10-28T19:57:54.648522Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reviewed_at": "2026-10-28T19:57:54.925877Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "85055efc-9bc3-490d-a56e-3d53631fec29",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "bf4f35d9-98ab-475d-a248-ac9aa9039592"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:57:55.220027Z"
    }
  ]
}
```

Done: flag bf4f35d9-98ab-475d-a248-ac9aa9039592 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "123b1e34-ac8f-407c-a19d-98d9cf5441f3",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNzYsImlhdCI6MTc5MzIxNzQ3NiwianRpIjoiZTZkMDI2NzctZDEyZC00ZWI1LTliMWEtNzU3YzEzNmVkMTgxIiwic2lkIjoiMTIzYjFlMzQtYWM4Zi00MDdjLWExOWQtOThkOWNmNTQ0MWYzIn0.vd3Fgm3p27oVmlKDoGx7LPGushFWVq_ayH0W8xfTOGI",
  "access_expires_at": "2026-10-28T20:12:56.061210443Z",
  "refresh_token": "x-qKU1BvMBOSycEFtC6L2om0GgiPfYawwyJmCQhiaMo",
  "refresh_expires_at": "2026-10-29T07:57:56.060681058Z",
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:57:55.220027Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "19332691-0ef1-4961-926c-a29fa6b31d09",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
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
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "058eba9c-c18e-4241-b547-f406d4e7c05b",
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
  "last_heartbeat_at": "2026-10-28T19:57:50.268491Z",
  "last_location_at": "2026-10-28T19:57:50.268491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/058eba9c-c18e-4241-b547-f406d4e7c05b/close` → **200**

```json
{
  "command_id": "19ca8e19-09df-4823-b77b-9dffdda2f019",
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
  "session_id": "d6bc681b-c58f-424d-ad3e-85164389826c",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzNzcsImlhdCI6MTc5MzIxNzQ3NywianRpIjoiZjgzYmJkZjAtOGZmMi00NjBkLThhOGYtM2IwMmZhMWEyNTIxIiwic2lkIjoiZDZiYzY4MWItYzU4Zi00MjRkLWFkM2UtODUxNjQzODk4MjZjIn0.Q9JdW_hL308T5XIyQljbE93gzPJ6Iu4AR-5jbNeQ9ro",
  "access_expires_at": "2026-10-28T20:12:57.746176086Z",
  "refresh_token": "f1wkD3oOOJtjbe-hd5VmzeOFNuiXTjhZq19WQOnc5Uw",
  "refresh_expires_at": "2026-10-29T07:57:57.745552966Z",
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
  "command_id": "6ffba41f-52f8-49fb-8970-a4c01badfad4",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:57:58.339019Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6ffba41f-52f8-49fb-8970-a4c01badfad4",
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
  "changed_by": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:57:58.339019Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48543419404",
  "device_ref": "sandbox-5678"
}
```

```json
{
  "challenge_id": "6c378002-01bd-4e9f-9445-e4e0f16e4400",
  "expires_at": "2026-10-28T20:02:58.894694121Z",
  "resend_available_at": "2026-10-28T19:57:59.894694121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48543419404` → **200**

```json
{
  "phone": "+48543419404",
  "audience": "CLIENT",
  "code": "014234",
  "sent_at": "2026-10-28T19:57:58.897235488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c378002-01bd-4e9f-9445-e4e0f16e4400",
  "code": "014234",
  "device_ref": "sandbox-5678"
}
```

```json
{
  "session_id": "7f7110f6-6e69-434f-873b-7b9fb45a9154",
  "subject": {
    "type": "CLIENT",
    "id": "a6359711-e079-4e58-b01a-0fc1e180e0fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjM1OTcxMS1lMDc5LTRlNTgtYjAxYS0wZmMxZTE4MGUwZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Mzc5LCJpYXQiOjE3OTMyMTc0NzksImp0aSI6IjAwNWRlNjBhLTg2NjgtNGVkOC04MjRjLWI3ZTViNTEzOWY4NiIsInNpZCI6IjdmNzExMGY2LTZlNjktNDM0Zi04NzNiLTdiOWZiNDVhOTE1NCJ9.umFdmRzRjZw2IGubIlitk6T4sLF88jr8kTVgTd9XG_Y",
  "access_expires_at": "2026-10-28T20:12:59.202998637Z",
  "refresh_token": "ZylBG5HZ8ijWs0GLTrt4xBXv5rbZGC06GXxp5J0Ck2M",
  "refresh_expires_at": "2026-11-27T19:57:59.202401626Z",
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
  "correlation_id": "bcf74b31-2215-468a-aff3-8a22d2f4a0e2"
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
  "device_ref": "sandbox-10061"
}
```

```json
{
  "challenge_id": "dfb79db1-c645-41b5-a2d2-e84e333e00cd",
  "expires_at": "2026-10-28T20:03:00.012049424Z",
  "resend_available_at": "2026-10-28T19:58:01.012049424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "438471",
  "sent_at": "2026-10-28T19:58:00.014209885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfb79db1-c645-41b5-a2d2-e84e333e00cd",
  "code": "438471",
  "device_ref": "sandbox-10061"
}
```

```json
{
  "session_id": "94e12230-11d3-4b62-a150-64f72dc408ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODM4MCwiaWF0IjoxNzkzMjE3NDgwLCJqdGkiOiIwZjY4ODBlYS1iZDNkLTRlNzQtYjU5Mi0zNDJlNjI4N2IxMTgiLCJzaWQiOiI5NGUxMjIzMC0xMWQzLTRiNjItYTE1MC02NGY3MmRjNDA4ZWUifQ.hcY-vVaJzTp7EqDod4i89JRsbdCVFDb1-ziGiDFrRVM",
  "access_expires_at": "2026-10-28T20:13:00.326043996Z",
  "refresh_token": "3XuNjIqxQRroxPRH_cvwUpm4VCAK3DZfqyiQMxHQ8N8",
  "refresh_expires_at": "2026-11-27T19:58:00.325439121Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "eba4b8f6-f450-41ee-824d-d6171778caef",
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
  "last_heartbeat_at": "2026-10-28T19:57:29.179187Z",
  "last_location_at": "2026-10-28T19:57:29.179187Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/eba4b8f6-f450-41ee-824d-d6171778caef/handover` → **200**

```json
{
  "command_id": "e7842768-fb3d-4ff2-886e-cccef50d10be",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "eba4b8f6-f450-41ee-824d-d6171778caef",
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
  "last_heartbeat_at": "2026-10-28T19:57:29.179187Z",
  "last_location_at": "2026-10-28T19:57:29.179187Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/eba4b8f6-f450-41ee-824d-d6171778caef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:58:01Z",
    "sequence": 1793217481161
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "eba4b8f6-f450-41ee-824d-d6171778caef",
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
  "last_heartbeat_at": "2026-10-28T19:58:01.17976Z",
  "last_location_at": "2026-10-28T19:58:01.17976Z",
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
  "session_id": "eba4b8f6-f450-41ee-824d-d6171778caef",
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
  "last_heartbeat_at": "2026-10-28T19:58:01.17976Z",
  "last_location_at": "2026-10-28T19:58:01.17976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eba4b8f6-f450-41ee-824d-d6171778caef/close` → **200**

```json
{
  "command_id": "f4b09c3f-f1e2-4c49-a874-09d1a4bab536",
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
  "correlation_id": "2e198375-559d-4afc-8742-8a0b03e28a32"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673548943",
  "device_ref": "sandbox-17671"
}
```

```json
{
  "challenge_id": "fdce0fcb-b9f2-411a-8af1-3bfa39b8486c",
  "expires_at": "2026-10-28T20:03:02.574376453Z",
  "resend_available_at": "2026-10-28T19:58:03.574376453Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673548943` → **200**

```json
{
  "phone": "+380673548943",
  "audience": "CLIENT",
  "code": "920154",
  "sent_at": "2026-10-28T19:58:02.576535179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdce0fcb-b9f2-411a-8af1-3bfa39b8486c",
  "code": "920154",
  "device_ref": "sandbox-17671"
}
```

```json
{
  "session_id": "1e4cf35f-dbba-4809-b89c-36aef357c8c3",
  "subject": {
    "type": "CLIENT",
    "id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjllMzBjYS0wMDAyLTRlYTUtYTRmMS1iMWRhNTIyOGVlZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4MzgyLCJpYXQiOjE3OTMyMTc0ODIsImp0aSI6ImNjODFhYTZkLTdlMDgtNDJjMi04MThiLWVhNzg2ZTdkYjk3NCIsInNpZCI6IjFlNGNmMzVmLWRiYmEtNDgwOS1iODljLTM2YWVmMzU3YzhjMyJ9.H8VzwmConY2N3BetEiws_99eW2y5K7UKu51ytARot4E",
  "access_expires_at": "2026-10-28T20:13:02.868818381Z",
  "refresh_token": "MOR7GZ_AMg5428fFqOyGYukqKx4u7ub0vqDVCXPqz_k",
  "refresh_expires_at": "2026-11-27T19:58:02.868289577Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "d98a5ac8-a015-4b15-96d6-f7407200c74c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
  "upload_path": "/api/rider/v1/uploads/0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
  "expires_at": "2026-10-28T20:13:03.157494331Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0cd56403-f1d6-4ea9-8325-2c0ae6f638fd` → **200**

```json
{
  "file_id": "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "64a3c867-8c55-4666-afe5-88dfb927a3cc",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd"
  ]
}
```

```json
{
  "id": "e9077330-01d1-43d6-9cfc-94bf959a351e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:58:03.468414Z",
  "updated_at": "2026-10-28T19:58:03.468414Z",
  "respond_by": "2026-10-28T23:58:03.468414Z",
  "messages": [
    {
      "id": "79bba8a8-af35-4db4-966b-f2aeeed18b1a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:58:03.469372Z",
      "attachments": [
        {
          "file_id": "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
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
  "session_id": "36637aab-c933-4672-8858-309eead028da",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzODQsImlhdCI6MTc5MzIxNzQ4NCwianRpIjoiYTUyNmVhOTItMDVjYy00NDU2LTlhNWQtODZhOTMyMDk2MWI2Iiwic2lkIjoiMzY2MzdhYWItYzkzMy00NjcyLTg4NTgtMzA5ZWVhZDAyOGRhIn0.TaZIkfhTKiOdKcdci9YctOde1C1nAstuO99gnL9WMcY",
  "access_expires_at": "2026-10-28T20:13:04.057058945Z",
  "refresh_token": "zAhkI85GwbkUMSpBM90wvd9dChoPvhDa0OiWrEJtQAk",
  "refresh_expires_at": "2026-10-29T07:58:04.056479688Z",
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
  "session_id": "e06bee62-7b7c-4636-bdd3-fc4668e6205d",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzODQsImlhdCI6MTc5MzIxNzQ4NCwianRpIjoiMGZjZTM1YWUtMTdjMy00ZGE5LWI2ZDItNDY3YTlkNjEzNzAzIiwic2lkIjoiZTA2YmVlNjItN2I3Yy00NjM2LWJkZDMtZmM0NjY4ZTYyMDVkIn0.-jVtacB9S3rmwy9PEMHFqiqZ_XSUSia6v9ir78cn0w4",
  "access_expires_at": "2026-10-28T20:13:04.619646746Z",
  "refresh_token": "MBFC2IOU0ag8i2V6VpykNedRNtYnDeyOlqtSGqk1eTk",
  "refresh_expires_at": "2026-10-29T07:58:04.619094448Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/e9077330-01d1-43d6-9cfc-94bf959a351e/attachments/0cd56403-f1d6-4ea9-8325-2c0ae6f638fd` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "782a995f-a841-4ee3-babd-d6c609bddf6e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6a6715ec-781e-406d-b090-c60a1cf5fe6a",
  "upload_path": "/api/operator/v1/uploads/6a6715ec-781e-406d-b090-c60a1cf5fe6a",
  "expires_at": "2026-10-28T20:13:04.907744049Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6a6715ec-781e-406d-b090-c60a1cf5fe6a` → **200**

```json
{
  "file_id": "6a6715ec-781e-406d-b090-c60a1cf5fe6a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/e9077330-01d1-43d6-9cfc-94bf959a351e` → **200**

```json
{
  "id": "e9077330-01d1-43d6-9cfc-94bf959a351e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:58:03.468414Z",
  "updated_at": "2026-10-28T19:58:03.468414Z",
  "respond_by": "2026-10-28T23:58:03.468414Z",
  "messages": [
    {
      "id": "79bba8a8-af35-4db4-966b-f2aeeed18b1a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:58:03.469372Z",
      "attachments": [
        {
          "file_id": "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/e9077330-01d1-43d6-9cfc-94bf959a351e/comments` → **200**

```json
{
  "command_id": "65b7b354-fe70-442f-9d22-4421b5311bf3",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6a6715ec-781e-406d-b090-c60a1cf5fe6a"
  ]
}
```

```json
{
  "id": "e9077330-01d1-43d6-9cfc-94bf959a351e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:58:03.468414Z",
  "updated_at": "2026-10-28T19:58:05.486418Z",
  "respond_by": "2026-10-28T23:58:03.468414Z",
  "messages": [
    {
      "id": "79bba8a8-af35-4db4-966b-f2aeeed18b1a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:58:03.469372Z",
      "attachments": [
        {
          "file_id": "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "aa492c4a-ba24-4179-ae96-bd17e8d8f79f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:58:05.485967Z",
      "attachments": [
        {
          "file_id": "6a6715ec-781e-406d-b090-c60a1cf5fe6a",
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

`GET /api/rider/v1/support/cases/e9077330-01d1-43d6-9cfc-94bf959a351e` → **200**

```json
{
  "id": "e9077330-01d1-43d6-9cfc-94bf959a351e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:58:03.468414Z",
  "updated_at": "2026-10-28T19:58:05.486418Z",
  "respond_by": "2026-10-28T23:58:03.468414Z",
  "messages": [
    {
      "id": "79bba8a8-af35-4db4-966b-f2aeeed18b1a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b9e30ca-0002-4ea5-a4f1-b1da5228eedd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:58:03.469372Z",
      "attachments": [
        {
          "file_id": "0cd56403-f1d6-4ea9-8325-2c0ae6f638fd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "aa492c4a-ba24-4179-ae96-bd17e8d8f79f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:58:05.485967Z",
      "attachments": [
        {
          "file_id": "6a6715ec-781e-406d-b090-c60a1cf5fe6a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/e9077330-01d1-43d6-9cfc-94bf959a351e/attachments/6a6715ec-781e-406d-b090-c60a1cf5fe6a` → **200**

Done: support case e9077330-01d1-43d6-9cfc-94bf959a351e, rider attachment 0cd56403-f1d6-4ea9-8325-2c0ae6f638fd, operator attachment 6a6715ec-781e-406d-b090-c60a1cf5fe6a.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739076443",
  "device_ref": "sandbox-261"
}
```

```json
{
  "challenge_id": "5430b29a-c8ff-4fc3-9609-91c878571bef",
  "expires_at": "2026-10-28T20:03:06.07730753Z",
  "resend_available_at": "2026-10-28T19:58:07.07730753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739076443` → **200**

```json
{
  "phone": "+380739076443",
  "audience": "CLIENT",
  "code": "361529",
  "sent_at": "2026-10-28T19:58:06.079950198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5430b29a-c8ff-4fc3-9609-91c878571bef",
  "code": "361529",
  "device_ref": "sandbox-261"
}
```

```json
{
  "session_id": "2e546d08-0883-4e8f-843b-d36b1895172f",
  "subject": {
    "type": "CLIENT",
    "id": "a12fd249-a554-48aa-a4da-34fad6a7118b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTJmZDI0OS1hNTU0LTQ4YWEtYTRkYS0zNGZhZDZhNzExOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Mzg2LCJpYXQiOjE3OTMyMTc0ODYsImp0aSI6IjQ3MzY3Y2Q1LWRkOWMtNDQ5Ni1hN2RkLTVlM2EyMWM5MDkwOCIsInNpZCI6IjJlNTQ2ZDA4LTA4ODMtNGU4Zi04NDNiLWQzNmIxODk1MTcyZiJ9.eLi7e8D5an_okzqNPMPBvPcUDKFhqu216-egfmV-a_Y",
  "access_expires_at": "2026-10-28T20:13:06.374750322Z",
  "refresh_token": "MJi976Z3LVZPXXrqv6Lz47wakuZ2Qm7GU1F9eL8lw34",
  "refresh_expires_at": "2026-11-27T19:58:06.374042937Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "77cf4315-74ca-4832-877b-eafa81d78df6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "629e83c2-55e1-4d0a-b6b0-29f41a8c8e9e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-629e83c2-55e1-4d0a-b6b0-29f41a8c8e9e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "78c4529478c6e4222ec32853f57cbbf6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=629e83c2-55e1-4d0a-b6b0-29f41a8c8e9e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739076443"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=629e83c2-55e1-4d0a-b6b0-29f41a8c8e9e",
  "expires_at": "2026-10-28T20:28:06.640094Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/629e83c2-55e1-4d0a-b6b0-29f41a8c8e9e` → **200**

```json
{
  "id": "629e83c2-55e1-4d0a-b6b0-29f41a8c8e9e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T20:28:06.640094Z",
  "card": {
    "id": "cf418cd7-a987-47af-a927-1a0140c65cc3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0059",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:58:06.91399Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fcb70b8c-6198-489e-aef6-00f40334a774",
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
  "id": "cc7e7322-2c8b-4a88-af98-f1d43d4d201e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:03:07.207366Z",
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
  "command_id": "e9323ea4-4cdb-470f-939e-8f28473a0498",
  "quote_id": "cc7e7322-2c8b-4a88-af98-f1d43d4d201e",
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
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800` → **200**

```json
{
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800` → **200**

```json
{
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
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

`GET /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800` → **200**

```json
{
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800/switch-to-cash` → **200**

```json
{
  "command_id": "6d54424b-e6b9-4ef6-b9e4-ccb8cf889e06",
  "expected_version": 3
}
```

```json
{
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800/switch-to-cash` → **409**

```json
{
  "command_id": "17597f5b-d0a9-4b14-a9ed-e16fd00377c2",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4b17a961-b02c-4f66-afda-48b1bc3202a6"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800` → **200**

```json
{
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a7cbbae8-ea41-48b1-a608-60f8bb359800/cancel` → **200**

```json
{
  "command_id": "88c6a755-f4c0-4bf5-afb9-bd3338078962",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a7cbbae8-ea41-48b1-a608-60f8bb359800",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a12fd249-a554-48aa-a4da-34fad6a7118b",
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
  "created_at": "2026-10-28T19:58:07.494058Z",
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
  "session_id": "7919270c-551f-4fc7-8c43-e0c45d2e29d9",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzOTEsImlhdCI6MTc5MzIxNzQ5MSwianRpIjoiMzcwZGQ1YTEtMWU3Ni00NzVhLTk0OWYtYjM5NDBiZmY3OGU3Iiwic2lkIjoiNzkxOTI3MGMtNTUxZi00ZmM3LThjNDMtZTBjNDVkMmUyOWQ5In0.BMrlbGmL3hpU80uc5YHJWg8cALejoRLS22Tcf5vECtQ",
  "access_expires_at": "2026-10-28T20:13:11.151332101Z",
  "refresh_token": "tkyc8wIvPXH1x_QSc93jUh_aBUdpAFtY0ARkjqY06g4",
  "refresh_expires_at": "2026-10-29T07:58:11.150785305Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9941"
}
```

```json
{
  "challenge_id": "ffcdfda6-37f3-4ef4-a8cc-0156cbabe44f",
  "expires_at": "2026-10-28T20:03:11.420139213Z",
  "resend_available_at": "2026-10-28T19:58:12.420139213Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "874157",
  "sent_at": "2026-10-28T19:58:11.42277271Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffcdfda6-37f3-4ef4-a8cc-0156cbabe44f",
  "code": "874157",
  "device_ref": "sandbox-9941"
}
```

```json
{
  "session_id": "99290519-4412-44ac-9bb3-1956f3232dd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODM5MSwiaWF0IjoxNzkzMjE3NDkxLCJqdGkiOiI3MjhlYzRkMi1mYzJlLTQzMzYtOTQ2NS0yMWE4MjdkNmM3ZDQiLCJzaWQiOiI5OTI5MDUxOS00NDEyLTQ0YWMtOWJiMy0xOTU2ZjMyMzJkZDMifQ.zlefmsWaLibOUw3tLlnwoeQtCEqPUAajPwWlzqWAZAo",
  "access_expires_at": "2026-10-28T20:13:11.715165214Z",
  "refresh_token": "3_nnp5MeVEaTmJ0tjJH3rwQUWTbxBG0MJcKvK9Wg2B4",
  "refresh_expires_at": "2026-11-27T19:58:11.714657009Z",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:57:55.220027Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T19:57:56.610976Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b513cadc-4719-4923-a168-6ce5a1158498",
  "expected_version": 7,
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
  "version": 8,
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
  "device_ref": "sandbox-123"
}
```

```json
{
  "challenge_id": "e39c52c4-2f4a-4e9c-a921-45e993849dbc",
  "expires_at": "2026-10-28T20:03:12.828645047Z",
  "resend_available_at": "2026-10-28T19:58:13.828645047Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "943971",
  "sent_at": "2026-10-28T19:58:12.83130847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e39c52c4-2f4a-4e9c-a921-45e993849dbc",
  "code": "943971",
  "device_ref": "sandbox-123"
}
```

```json
{
  "session_id": "71ebb232-7877-4486-8f9e-8a1ce4a396b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODM5MywiaWF0IjoxNzkzMjE3NDkzLCJqdGkiOiIzODA3ZGU0MS05MTFhLTQxM2QtYTBhOC1iMGRkNzhjN2ZkYWEiLCJzaWQiOiI3MWViYjIzMi03ODc3LTQ0ODYtOGY5ZS04YTFjZTRhMzk2YjMifQ.VNqJHSiMvS9QBGYA61yX05yKbEd75eOsDJ_zm8i57mU",
  "access_expires_at": "2026-10-28T20:13:13.143524911Z",
  "refresh_token": "B-dY64_gfxhzeeBNkEzasKaw_C_-fXR-O5_bWIUSy_4",
  "refresh_expires_at": "2026-11-27T19:58:13.142976051Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:57:36.378115Z",
  "last_location_at": "2026-10-28T19:57:36.378115Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7e68d458-438f-466e-800a-13b102804ba9/handover` → **200**

```json
{
  "command_id": "7ee10e9b-652b-4f09-8298-c6bc3ea02808",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:57:36.378115Z",
  "last_location_at": "2026-10-28T19:57:36.378115Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7e68d458-438f-466e-800a-13b102804ba9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:58:13Z",
    "sequence": 1793217493968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:58:13.987131Z",
  "last_location_at": "2026-10-28T19:58:13.987131Z",
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
  "command_id": "43753ac9-0dbc-4f29-b9b0-9da88f8d7b1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:58:14Z",
    "sequence": 1793217494527
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa888c0c-94e3-4cca-82e8-d2d8b73f3aa4",
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
  "last_heartbeat_at": "2026-10-28T19:58:14.545137Z",
  "last_location_at": "2026-10-28T19:58:14.545137Z",
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
  "session_id": "bc40a6ae-4b6c-4b70-92bb-7c8fc9963732",
  "subject": {
    "type": "STAFF",
    "id": "4a91f207-4303-42d2-aaf4-fad1e3bc6668"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTkxZjIwNy00MzAzLTQyZDItYWFmNC1mYWQxZTNiYzY2NjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTgzOTUsImlhdCI6MTc5MzIxNzQ5NSwianRpIjoiOWZkYWNmODAtOTU4ZC00Yzk0LTk3NWItMGQ3YWM3MDRmZDhhIiwic2lkIjoiYmM0MGE2YWUtNGI2Yy00YjcwLTkyYmItN2M4ZmM5OTYzNzMyIn0.Yh4VgWr3CYo06hUzwF5MGCkoJZGEfw2vXrfqmsJnWnQ",
  "access_expires_at": "2026-10-28T20:13:15.108387896Z",
  "refresh_token": "R8bf3CqHUuaVXiE2B_EgsNXTv_1ObiXanoDDLiLgYMU",
  "refresh_expires_at": "2026-10-29T07:58:15.107821442Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c7519841-bf8c-4b2d-8ac4-4707ff2a3cc4",
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
  "id": "af853e63-6c44-4cd3-b7ff-da70a9121a03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:03:15.377238Z",
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
  "command_id": "58839fe0-e075-4d51-989f-ccc1b28a62d5",
  "quote_id": "af853e63-6c44-4cd3-b7ff-da70a9121a03",
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
  "id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "short_number": 26,
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
  "created_at": "2026-10-28T19:58:15.662935Z",
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
    "id": "d1b8b988-158e-4109-8f6a-0cf1f8813d71",
    "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
    "expires_at": "2026-10-28T19:58:30.666604Z",
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

`POST /api/driver/v1/offers/d1b8b988-158e-4109-8f6a-0cf1f8813d71/accept` → **200**

```json
{
  "command_id": "f6fb5b27-0ab1-4427-91e2-6727ddf6da8a"
}
```

```json
{
  "id": "8f2438a9-ef29-4f24-a5d6-a348784b8dc8",
  "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b0cb220b-f502-4173-a644-9eb45753a544",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b0cb220b-f502-4173-a644-9eb45753a544",
  "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "assignment_id": "8f2438a9-ef29-4f24-a5d6-a348784b8dc8",
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

`POST /api/driver/v1/work-sessions/aa888c0c-94e3-4cca-82e8-d2d8b73f3aa4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:58:17Z",
    "sequence": 1793217497288
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa888c0c-94e3-4cca-82e8-d2d8b73f3aa4",
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
  "last_heartbeat_at": "2026-10-28T19:58:17.046314Z",
  "last_location_at": "2026-10-28T19:58:17.046314Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b0cb220b-f502-4173-a644-9eb45753a544/arrive` → **200**

```json
{
  "command_id": "8e133232-8a24-4f19-ad18-9b6cb9e24618",
  "expected_version": 0
}
```

```json
{
  "id": "b0cb220b-f502-4173-a644-9eb45753a544",
  "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "assignment_id": "8f2438a9-ef29-4f24-a5d6-a348784b8dc8",
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
  "arrived_at": "2026-10-28T19:58:17.321634Z",
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

`POST /api/driver/v1/trips/b0cb220b-f502-4173-a644-9eb45753a544/start` → **200**

```json
{
  "command_id": "7d3cda31-b0c6-4210-9f58-e61febeb4594",
  "expected_version": 1
}
```

```json
{
  "id": "b0cb220b-f502-4173-a644-9eb45753a544",
  "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "assignment_id": "8f2438a9-ef29-4f24-a5d6-a348784b8dc8",
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
  "arrived_at": "2026-10-28T19:58:17.321634Z",
  "started_at": "2026-10-28T19:58:17.613697Z",
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

`POST /api/driver/v1/trips/b0cb220b-f502-4173-a644-9eb45753a544/complete` → **200**

```json
{
  "command_id": "f86e1303-334d-41c2-9d24-633228d0a69f",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:58:17Z",
  "cash_received": true
}
```

```json
{
  "id": "b0cb220b-f502-4173-a644-9eb45753a544",
  "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "assignment_id": "8f2438a9-ef29-4f24-a5d6-a348784b8dc8",
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
  "arrived_at": "2026-10-28T19:58:17.321634Z",
  "started_at": "2026-10-28T19:58:17.613697Z",
  "completed_at": "2026-10-28T19:58:17.897162Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/6d5867c0-f78a-482b-818a-4088229219bf` → **200**

```json
{
  "id": "6d5867c0-f78a-482b-818a-4088229219bf",
  "short_number": 26,
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
    "id": "8f2438a9-ef29-4f24-a5d6-a348784b8dc8",
    "order_id": "6d5867c0-f78a-482b-818a-4088229219bf",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b0cb220b-f502-4173-a644-9eb45753a544",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:58:15.662935Z",
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
      "balance_minor": 28209,
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
  "session_id": "7e68d458-438f-466e-800a-13b102804ba9",
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
  "last_heartbeat_at": "2026-10-28T19:58:13.987131Z",
  "last_location_at": "2026-10-28T19:58:13.987131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e68d458-438f-466e-800a-13b102804ba9/close` → **200**

```json
{
  "command_id": "718878b6-eea2-43ea-b521-7e94fac39e36",
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
  "session_id": "aa888c0c-94e3-4cca-82e8-d2d8b73f3aa4",
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
  "last_heartbeat_at": "2026-10-28T19:58:17.046314Z",
  "last_location_at": "2026-10-28T19:58:17.046314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa888c0c-94e3-4cca-82e8-d2d8b73f3aa4/close` → **200**

```json
{
  "command_id": "ae341189-8b7a-45c6-b54f-dbb48aa5aa4e",
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

Done: terminal order 6d5867c0-f78a-482b-818a-4088229219bf by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26309"
}
```

```json
{
  "challenge_id": "7f81740b-c97e-46d1-832e-2497df2a7e8e",
  "expires_at": "2026-10-28T20:03:22.864229852Z",
  "resend_available_at": "2026-10-28T19:58:23.864229852Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "436099",
  "sent_at": "2026-10-28T19:58:22.866805625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f81740b-c97e-46d1-832e-2497df2a7e8e",
  "code": "436099",
  "device_ref": "sandbox-26309"
}
```

```json
{
  "session_id": "effcdf95-6e0c-4e7c-b0cf-b2c3193a357e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODQwMywiaWF0IjoxNzkzMjE3NTAzLCJqdGkiOiIwMzE5YzM2YS0wZjNmLTRmNjEtODcwNi1iNTY4ZTQ4NDNiMDUiLCJzaWQiOiJlZmZjZGY5NS02ZTBjLTRlN2MtYjBjZi1iMmMzMTkzYTM1N2UifQ.rMsGUb-DK-k3In_jkoBj0Aep0F_D7cOSNJw3hsI4Vnc",
  "access_expires_at": "2026-10-28T20:13:23.178703487Z",
  "refresh_token": "Pe4FUYdzBtE-F0IK6x0CiBQF8yM_VgHIVVfa-lY3kZo",
  "refresh_expires_at": "2026-11-27T19:58:23.178114781Z",
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
  "device_ref": "sandbox-13511"
}
```

```json
{
  "challenge_id": "c90a0ef7-88b5-44a2-b3e9-f31dd36902df",
  "expires_at": "2026-10-28T20:03:23.730390618Z",
  "resend_available_at": "2026-10-28T19:58:24.730390618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "110383",
  "sent_at": "2026-10-28T19:58:23.732541159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c90a0ef7-88b5-44a2-b3e9-f31dd36902df",
  "code": "110383",
  "device_ref": "sandbox-13511"
}
```

```json
{
  "session_id": "3cb0c8f7-f511-4b80-aaf2-34233cfec968",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODQwNCwiaWF0IjoxNzkzMjE3NTA0LCJqdGkiOiI2NDRmODllZC04OWM4LTRlNDMtYjMyYi1lM2FkOTIxNjZiYjQiLCJzaWQiOiIzY2IwYzhmNy1mNTExLTRiODAtYWFmMi0zNDIzM2NmZWM5NjgifQ.ITdHkpiFPzZYtG-4g5sc8i8jfGmxgqLZG0a4glh4bTU",
  "access_expires_at": "2026-10-28T20:13:24.037328109Z",
  "refresh_token": "ZxxVNXhqf6HP1xAbNaYMQ_b0jBqdDK_QCuklCYjpj10",
  "refresh_expires_at": "2026-11-27T19:58:24.036760905Z",
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
  "device_ref": "sandbox-2008"
}
```

```json
{
  "challenge_id": "e3b94ef0-f655-4b74-bb62-f5770c46bad3",
  "expires_at": "2026-10-28T20:03:24.570022907Z",
  "resend_available_at": "2026-10-28T19:58:25.570022907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "318444",
  "sent_at": "2026-10-28T19:58:24.57760872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3b94ef0-f655-4b74-bb62-f5770c46bad3",
  "code": "318444",
  "device_ref": "sandbox-2008"
}
```

```json
{
  "session_id": "bf8a016b-ab73-4485-8b0f-a66ed6d00567",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODQwNCwiaWF0IjoxNzkzMjE3NTA0LCJqdGkiOiI2ZjBjYjQ5NS0yNWE5LTQ0YzktOGNhYy04MzZjYjM2MzAyNzgiLCJzaWQiOiJiZjhhMDE2Yi1hYjczLTQ0ODUtOGIwZi1hNjZlZDZkMDA1NjcifQ.Lx385cWeZoGwi6ZSi4MYS4DMK-4GxPmFTAtAUc3Kop8",
  "access_expires_at": "2026-10-28T20:13:24.883367461Z",
  "refresh_token": "bQCBhgMzfW9W3RxXTyxAgvh98cdpB3U2_2ojr5aFVcc",
  "refresh_expires_at": "2026-11-27T19:58:24.882812167Z",
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
  "phone": "+380697528738",
  "device_ref": "sandbox-8717"
}
```

```json
{
  "challenge_id": "ddb992b4-8c9a-481d-9244-6256b62949d9",
  "expires_at": "2026-10-28T20:03:25.430459754Z",
  "resend_available_at": "2026-10-28T19:58:26.430459754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380697528738` → **200**

```json
{
  "phone": "+380697528738",
  "audience": "CLIENT",
  "code": "966310",
  "sent_at": "2026-10-28T19:58:25.432679724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddb992b4-8c9a-481d-9244-6256b62949d9",
  "code": "966310",
  "device_ref": "sandbox-8717"
}
```

```json
{
  "session_id": "ab26d938-3d69-4267-9e4c-db03c357fabb",
  "subject": {
    "type": "CLIENT",
    "id": "85415011-f46c-47db-985f-21013b8ad7c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTQxNTAxMS1mNDZjLTQ3ZGItOTg1Zi0yMTAxM2I4YWQ3YzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NDA1LCJpYXQiOjE3OTMyMTc1MDUsImp0aSI6ImE5ZmVjYmMwLTRmNzYtNGYwNC1hOTAxLWU3MWZmYzE5NDllYiIsInNpZCI6ImFiMjZkOTM4LTNkNjktNDI2Ny05ZTRjLWRiMDNjMzU3ZmFiYiJ9.vBYr2pd_crtw-ZLhizT9HBj5y6kdBad5HTeCrkZ8Qsw",
  "access_expires_at": "2026-10-28T20:13:25.734307849Z",
  "refresh_token": "evhmpGQ-dtFPLFIjqyGpQcV9xKKzEwAcqBNDmBn4AxU",
  "refresh_expires_at": "2026-11-27T19:58:25.733825291Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "239672de-6399-45fe-8246-6c9534e9c339",
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
  "id": "ea847ba9-0324-491f-8187-be2d37142191",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:03:26.012813Z",
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
  "command_id": "09ec25b4-8a19-4978-9753-822454384e21",
  "quote_id": "ea847ba9-0324-491f-8187-be2d37142191",
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
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:58:26.306964Z",
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
  "blizz_orders_total": 27,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 17,
  "blizz_dispatch_assigned_seconds_count": 16,
  "blizz_offers_total": 19,
  "blizz_dispatch_excluded_total": 9,
  "blizz_sms_sent_total": 69
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 16
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.005667434
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.145800801
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 16.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 19.0
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 62.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/07aa9477-4533-48ab-8deb-3633ae327535` → **200**

```json
{
  "id": "07aa9477-4533-48ab-8deb-3633ae327535",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85415011-f46c-47db-985f-21013b8ad7c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T19:58:26.306964Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
