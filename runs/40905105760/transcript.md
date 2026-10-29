# Sandbox transcript (2026-10-29T15:48:14Z, 599232a)

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
  "correlation_id": "dc4626b7-409b-40ad-a500-eb35e3734009"
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
  "session_id": "737aaa8c-cc80-4450-ba71-8b75ffd4e03e",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MDEsImlhdCI6MTc5MzI4ODkwMSwianRpIjoiZjQ2OTU5ZGQtYzA5Yy00ZDFkLTg3YTItYzg0OWQ4OTA0ZWUyIiwic2lkIjoiNzM3YWFhOGMtY2M4MC00NDUwLWJhNzEtOGI3NWZmZDRlMDNlIn0.Y0ZItFXoBlACKmXBm5OQhpPUYxg66UXbmyQ10vy90bk",
  "access_expires_at": "2026-10-29T16:03:21.623585167Z",
  "refresh_token": "WNxkxEUjaGfTSZcqLcGTXwKwUICPt556lXKxZ02d4Nw",
  "refresh_expires_at": "2026-10-30T03:48:21.621564093Z",
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
  "session_id": "5c59263b-27fd-46a7-9370-f7abc2851640",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MDIsImlhdCI6MTc5MzI4ODkwMiwianRpIjoiZjBhYzM2MzYtYzUwMy00YmJiLWJmYjgtZWEzYTgxM2Y0YmMyIiwic2lkIjoiNWM1OTI2M2ItMjdmZC00NmE3LTkzNzAtZjdhYmMyODUxNjQwIn0.UYJMSBYNQMpJ8uc7ekvBLCfOrP12GXFcwlvNLT5Wj38",
  "access_expires_at": "2026-10-29T16:03:22.982031685Z",
  "refresh_token": "cmU0O6ngwxkYvHpTCB-7kHCCDZeSJQVYyIMsvQS7THI",
  "refresh_expires_at": "2026-10-30T03:48:22.981192605Z",
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
  "device_ref": "sandbox-23659"
}
```

```json
{
  "challenge_id": "f9480645-7ec1-4754-9b58-a5e98d1a1085",
  "expires_at": "2026-10-29T15:53:23.405785707Z",
  "resend_available_at": "2026-10-29T15:48:24.405785707Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "616312",
  "sent_at": "2026-10-29T15:48:23.414840355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9480645-7ec1-4754-9b58-a5e98d1a1085",
  "code": "616312",
  "device_ref": "sandbox-23659"
}
```

```json
{
  "session_id": "3ff91cb9-1697-4d9a-8681-ba8dda66ef15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgwMywiaWF0IjoxNzkzMjg4OTAzLCJqdGkiOiIwYjUyMjI1MS0xOWE4LTQyMDUtYWNlYy03NDM0NWNlZDRjYmYiLCJzaWQiOiIzZmY5MWNiOS0xNjk3LTRkOWEtODY4MS1iYThkZGE2NmVmMTUifQ.KjvQ7rsd25LfTpD3cAgf1eJpBk7boSnzEt_jB9sz38I",
  "access_expires_at": "2026-10-29T16:03:23.68628571Z",
  "refresh_token": "cUm58nRCtGCoQ3tAJTFoNm7RPSW6wsWnF24I01CKIrE",
  "refresh_expires_at": "2026-11-28T15:48:23.68525523Z",
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
  "command_id": "de7eefc0-4017-4e24-8e5b-005039ccd63e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:24Z",
    "sequence": 1793288904957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "feec3ed3-9fb0-40a6-a741-e92b23207488",
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
  "last_heartbeat_at": "2026-10-29T15:48:24.154105Z",
  "last_location_at": "2026-10-29T15:48:24.154105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634494872",
  "device_ref": "sandbox-7246"
}
```

```json
{
  "challenge_id": "75768ef4-8a21-44cf-affe-898b09a849e7",
  "expires_at": "2026-10-29T15:53:24.362815713Z",
  "resend_available_at": "2026-10-29T15:48:25.362815713Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634494872` → **200**

```json
{
  "phone": "+380634494872",
  "audience": "CLIENT",
  "code": "735447",
  "sent_at": "2026-10-29T15:48:24.366991585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75768ef4-8a21-44cf-affe-898b09a849e7",
  "code": "735447",
  "device_ref": "sandbox-7246"
}
```

```json
{
  "session_id": "70f6202b-0e02-47d2-8356-cdf7d3102df5",
  "subject": {
    "type": "CLIENT",
    "id": "c2198625-6b49-4a03-bc9f-7a80aee6a0ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE5ODYyNS02YjQ5LTRhMDMtYmM5Zi03YTgwYWVlNmEwZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODA0LCJpYXQiOjE3OTMyODg5MDQsImp0aSI6ImE3MjljOGNiLTcxYzUtNGE3ZS1iZDNmLWY1OTdjNzczZjFjYSIsInNpZCI6IjcwZjYyMDJiLTBlMDItNDdkMi04MzU2LWNkZjdkMzEwMmRmNSJ9.PsKXh3D_hV9DTf4zgK-FpxXwl2acbHnS7dW478xyAcU",
  "access_expires_at": "2026-10-29T16:03:24.595128184Z",
  "refresh_token": "02uTp0-fsnvGWjIFa7EfDYWqkksMGwkxZpKwoPgkiaA",
  "refresh_expires_at": "2026-11-28T15:48:24.594549233Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e748d207-8399-4835-ab72-f0a24a09444a",
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
  "id": "bf9636d0-0f60-4620-8a69-21e6c9b45c61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:24.827073Z",
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
  "command_id": "349b6524-8c7a-403b-9ab3-b4323f40125b",
  "quote_id": "bf9636d0-0f60-4620-8a69-21e6c9b45c61",
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
  "id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2198625-6b49-4a03-bc9f-7a80aee6a0ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:48:25.099377Z",
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
    "id": "b464090b-5170-4db7-8f03-1ec70cc575a2",
    "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
    "expires_at": "2026-10-29T15:48:40.107107Z",
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

`POST /api/driver/v1/offers/b464090b-5170-4db7-8f03-1ec70cc575a2/accept` → **200**

```json
{
  "command_id": "70ddaff6-693d-4a0f-8b34-5226ac7c44bd"
}
```

```json
{
  "id": "0f0766f4-cc8d-43e5-a0ef-d1e33575578d",
  "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f8de14b0-1861-4a5c-b6e9-6dba9eb81fad",
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
  "command_id": "b1d56f3a-9a91-4f0f-8f3d-1d71f61f401c",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:48:26.008573016Z"
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
  "id": "f8de14b0-1861-4a5c-b6e9-6dba9eb81fad",
  "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
  "assignment_id": "0f0766f4-cc8d-43e5-a0ef-d1e33575578d",
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

`POST /api/driver/v1/work-sessions/feec3ed3-9fb0-40a6-a741-e92b23207488/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:26Z",
    "sequence": 1793288906649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "feec3ed3-9fb0-40a6-a741-e92b23207488",
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
  "last_heartbeat_at": "2026-10-29T15:48:26.675899Z",
  "last_location_at": "2026-10-29T15:48:26.675899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f8de14b0-1861-4a5c-b6e9-6dba9eb81fad/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "38589fa1-7703-4831-9749-e50fdd04e573",
  "expected_version": 0
}
```

```json
{
  "id": "f8de14b0-1861-4a5c-b6e9-6dba9eb81fad",
  "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
  "assignment_id": "0f0766f4-cc8d-43e5-a0ef-d1e33575578d",
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
  "arrived_at": "2026-10-29T15:48:26.895733Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f8de14b0-1861-4a5c-b6e9-6dba9eb81fad/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0ca6309a-8ac7-4bbe-9586-eef8452d662b",
  "expected_version": 1
}
```

```json
{
  "id": "f8de14b0-1861-4a5c-b6e9-6dba9eb81fad",
  "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
  "assignment_id": "0f0766f4-cc8d-43e5-a0ef-d1e33575578d",
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
  "arrived_at": "2026-10-29T15:48:26.895733Z",
  "started_at": "2026-10-29T15:48:27.110715Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f8de14b0-1861-4a5c-b6e9-6dba9eb81fad/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "659631d9-a87a-4ff2-ae09-ef7c71df70ab",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:48:27Z",
  "cash_received": true
}
```

```json
{
  "id": "f8de14b0-1861-4a5c-b6e9-6dba9eb81fad",
  "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
  "assignment_id": "0f0766f4-cc8d-43e5-a0ef-d1e33575578d",
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
  "arrived_at": "2026-10-29T15:48:26.895733Z",
  "started_at": "2026-10-29T15:48:27.110715Z",
  "completed_at": "2026-10-29T15:48:27.329736Z",
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
  "session_id": "feec3ed3-9fb0-40a6-a741-e92b23207488",
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
  "last_heartbeat_at": "2026-10-29T15:48:26.675899Z",
  "last_location_at": "2026-10-29T15:48:26.675899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/feec3ed3-9fb0-40a6-a741-e92b23207488/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "493e3356-e533-4e39-ac10-3433edfa6996",
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
  "command_id": "acb1d3c9-6df7-4d3a-8959-7c655092b37a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:27Z",
    "sequence": 1793288907983
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
  "correlation_id": "fd736fa4-9f67-4f60-8d6a-d22a9283749d",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "89a47eb6-42b0-4150-b6d4-8789bff0986b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:28Z",
    "sequence": 1793288908202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba1a244c-7a1b-47fa-88dd-bd10c8af9847",
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
  "last_heartbeat_at": "2026-10-29T15:48:28.222105Z",
  "last_location_at": "2026-10-29T15:48:28.222105Z",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:48:26.008573Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3c2cc477-830a-4de1-bb24-8d301fe9425f",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:48:28.644976842Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba1a244c-7a1b-47fa-88dd-bd10c8af9847",
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
  "last_heartbeat_at": "2026-10-29T15:48:28.222105Z",
  "last_location_at": "2026-10-29T15:48:28.222105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba1a244c-7a1b-47fa-88dd-bd10c8af9847/close` → **200**

```json
{
  "command_id": "0c16248f-769a-41b3-9f37-2f098f35554a",
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
  "session_id": "8010fb9c-bd82-4575-9a70-d91abf97f54d",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MDksImlhdCI6MTc5MzI4ODkwOSwianRpIjoiNDMxZjBhODItNGY2Yy00NGY5LTgwNTUtMzIwYzhjZjdlNjUzIiwic2lkIjoiODAxMGZiOWMtYmQ4Mi00NTc1LTlhNzAtZDkxYWJmOTdmNTRkIn0.kfB7MhEPZBM1eOUBKeNCiEN9kM8G6ruGU5HpwpvGKu4",
  "access_expires_at": "2026-10-29T16:03:29.492103709Z",
  "refresh_token": "Sg_MM3vxTspQi1Bc2ewFUR1--D0zlm6pGOvKOMAJlqE",
  "refresh_expires_at": "2026-10-30T03:48:29.491433792Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c88591d1-a9af-4cf0-b7e5-c4b9cb1d3831",
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
  "id": "e6161482-c096-41aa-b4b8-56473b4b955a",
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
  "created_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "created_at": "2026-10-29T15:48:29.702639Z",
  "updated_at": "2026-10-29T15:48:29.702639Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631819124",
  "device_ref": "sandbox-28198"
}
```

```json
{
  "challenge_id": "d4c2d853-ec01-4e9d-9f8f-a2a297b9d456",
  "expires_at": "2026-10-29T15:53:29.913352585Z",
  "resend_available_at": "2026-10-29T15:48:30.913352585Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631819124` → **200**

```json
{
  "phone": "+380631819124",
  "audience": "CLIENT",
  "code": "571565",
  "sent_at": "2026-10-29T15:48:29.917176213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4c2d853-ec01-4e9d-9f8f-a2a297b9d456",
  "code": "571565",
  "device_ref": "sandbox-28198"
}
```

```json
{
  "session_id": "e8a91acc-d3ca-4247-89ee-f20e610b4a6b",
  "subject": {
    "type": "CLIENT",
    "id": "db1affad-0299-4f3a-9fa5-5ac537d97434"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjFhZmZhZC0wMjk5LTRmM2EtOWZhNS01YWM1MzdkOTc0MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODEwLCJpYXQiOjE3OTMyODg5MTAsImp0aSI6ImY0MzExZTBhLTFkYzYtNGIxMS1hNGQ4LTI3OGFkMDMxZWZlOSIsInNpZCI6ImU4YTkxYWNjLWQzY2EtNDI0Ny04OWVlLWYyMGU2MTBiNGE2YiJ9.OIOr3lceiQ5D2o9IDB7VB61TlLT7Tr-0cGTGxmplWX4",
  "access_expires_at": "2026-10-29T16:03:30.142452126Z",
  "refresh_token": "E8olhEaxLtoLKYmz9q29g3kCZUH4cZCLbiZLvjbQsjE",
  "refresh_expires_at": "2026-11-28T15:48:30.141866972Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631819124` → **200**

```json
{
  "client_id": "db1affad-0299-4f3a-9fa5-5ac537d97434"
}
```

`POST /api/admin/v1/rider-wallets/db1affad-0299-4f3a-9fa5-5ac537d97434/top-ups` → **201**

```json
{
  "command_id": "90721f3f-ceb6-4f41-a7df-004d6feaefec",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "db1affad-0299-4f3a-9fa5-5ac537d97434",
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
      "id": "bd1f6dff-89ff-4856-8b06-e91870337bb7",
      "at": "2026-10-29T15:48:30.554749Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "90743126-b55d-41c5-8986-abad23ff9889",
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
  "id": "cbf8e320-4be1-4cc0-92ab-09a5d6c19e8f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:30.792264Z",
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
      "id": "e6161482-c096-41aa-b4b8-56473b4b955a",
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
  "device_ref": "sandbox-14150"
}
```

```json
{
  "challenge_id": "e8b2b11e-bab1-4c37-ab05-de038590b712",
  "expires_at": "2026-10-29T15:53:31.003709455Z",
  "resend_available_at": "2026-10-29T15:48:32.003709455Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "890858",
  "sent_at": "2026-10-29T15:48:31.00674676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8b2b11e-bab1-4c37-ab05-de038590b712",
  "code": "890858",
  "device_ref": "sandbox-14150"
}
```

```json
{
  "session_id": "73e37490-485a-4744-a34e-a9a2814197ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgxMSwiaWF0IjoxNzkzMjg4OTExLCJqdGkiOiJlMGRjODE5MS1mN2M3LTQ4OTYtYTczNC02MjllZmVhZDFiZTUiLCJzaWQiOiI3M2UzNzQ5MC00ODVhLTQ3NDQtYTM0ZS1hOWEyODE0MTk3ZWUifQ.PpQsufMj3OEqbIc2zVSUa7ewJyRrxDATvaaCsylRPbk",
  "access_expires_at": "2026-10-29T16:03:31.237516408Z",
  "refresh_token": "p-ENcIhqrAovvMNg7RpYf3uINJl6nF8NOLQ9n9TxmxQ",
  "refresh_expires_at": "2026-11-28T15:48:31.2369625Z",
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
  "command_id": "83b0bdc8-1efd-4448-9d43-939036dabf95",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:31Z",
    "sequence": 1793288911657
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6580ac25-ba39-4b03-8849-06c0ba8e2af5",
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
  "last_heartbeat_at": "2026-10-29T15:48:31.677532Z",
  "last_location_at": "2026-10-29T15:48:31.677532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ed8108a4-65ee-4d8c-af74-cf956a3c7233",
  "quote_id": "cbf8e320-4be1-4cc0-92ab-09a5d6c19e8f",
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
  "id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db1affad-0299-4f3a-9fa5-5ac537d97434",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:48:31.892739Z",
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
  "client_id": "db1affad-0299-4f3a-9fa5-5ac537d97434",
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
      "id": "bd1f6dff-89ff-4856-8b06-e91870337bb7",
      "at": "2026-10-29T15:48:30.554749Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
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
    "id": "7a1523e4-3812-4551-a79a-82532425b7bb",
    "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
    "expires_at": "2026-10-29T15:48:46.899047Z",
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

`POST /api/driver/v1/offers/7a1523e4-3812-4551-a79a-82532425b7bb/accept` → **200**

```json
{
  "command_id": "2ab4f7e4-3322-49e7-bc9a-9c005a205133"
}
```

```json
{
  "id": "24c3d844-d512-4be5-8c19-277ee380a9f7",
  "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2575ebaa-e3fb-49e6-8cff-6c14d0362e0c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2575ebaa-e3fb-49e6-8cff-6c14d0362e0c",
  "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
  "assignment_id": "24c3d844-d512-4be5-8c19-277ee380a9f7",
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

`POST /api/driver/v1/work-sessions/6580ac25-ba39-4b03-8849-06c0ba8e2af5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:32Z",
    "sequence": 1793288912933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6580ac25-ba39-4b03-8849-06c0ba8e2af5",
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
  "last_heartbeat_at": "2026-10-29T15:48:32.951583Z",
  "last_location_at": "2026-10-29T15:48:32.951583Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2575ebaa-e3fb-49e6-8cff-6c14d0362e0c/arrive` → **200**

```json
{
  "command_id": "e6743f07-361c-4287-a52f-4f6c3c4e9848",
  "expected_version": 0
}
```

```json
{
  "id": "2575ebaa-e3fb-49e6-8cff-6c14d0362e0c",
  "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
  "assignment_id": "24c3d844-d512-4be5-8c19-277ee380a9f7",
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
  "arrived_at": "2026-10-29T15:48:33.15821Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2575ebaa-e3fb-49e6-8cff-6c14d0362e0c/start` → **200**

```json
{
  "command_id": "3f3bec8a-838e-418a-b273-475a153d4b0a",
  "expected_version": 1
}
```

```json
{
  "id": "2575ebaa-e3fb-49e6-8cff-6c14d0362e0c",
  "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
  "assignment_id": "24c3d844-d512-4be5-8c19-277ee380a9f7",
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
  "arrived_at": "2026-10-29T15:48:33.15821Z",
  "started_at": "2026-10-29T15:48:33.365682Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2575ebaa-e3fb-49e6-8cff-6c14d0362e0c/complete` → **200**

```json
{
  "command_id": "27e74d9c-7b04-4cba-a11f-b42bce2251c6",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:48:33Z",
  "cash_received": true
}
```

```json
{
  "id": "2575ebaa-e3fb-49e6-8cff-6c14d0362e0c",
  "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
  "assignment_id": "24c3d844-d512-4be5-8c19-277ee380a9f7",
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
  "arrived_at": "2026-10-29T15:48:33.15821Z",
  "started_at": "2026-10-29T15:48:33.365682Z",
  "completed_at": "2026-10-29T15:48:33.619085Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "db1affad-0299-4f3a-9fa5-5ac537d97434",
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
      "id": "8c7ccaea-7db4-4951-acad-eefd6e85ff81",
      "at": "2026-10-29T15:48:33.696053Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8"
    },
    {
      "id": "bd1f6dff-89ff-4856-8b06-e91870337bb7",
      "at": "2026-10-29T15:48:30.554749Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e6161482-c096-41aa-b4b8-56473b4b955a/archive` → **200**

```json
{
  "command_id": "93bc3c79-3bb0-45e1-8e85-4fec70008423",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e6161482-c096-41aa-b4b8-56473b4b955a",
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
  "created_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "created_at": "2026-10-29T15:48:29.702639Z",
  "updated_at": "2026-10-29T15:48:37.047591Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6580ac25-ba39-4b03-8849-06c0ba8e2af5",
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
  "last_heartbeat_at": "2026-10-29T15:48:32.951583Z",
  "last_location_at": "2026-10-29T15:48:32.951583Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6580ac25-ba39-4b03-8849-06c0ba8e2af5/close` → **200**

```json
{
  "command_id": "2dd6ff55-b802-4089-b229-17a101eda47e",
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

Done: order 439031d4-83a5-44b8-8cdb-0d7a5b6705d8.

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
  "session_id": "414e6647-f373-406f-aa8f-d57e7c50010b",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MTcsImlhdCI6MTc5MzI4ODkxNywianRpIjoiMTU5MmRjYjUtZTIyYS00NjZhLWJlMmQtOTk0YTE3MzhkMmRhIiwic2lkIjoiNDE0ZTY2NDctZjM3My00MDZmLWFhOGYtZDU3ZTdjNTAwMTBiIn0.9ppdYTzjI7Lt2RZ-3k8HSBsqOFrQKeFwGG82f-O37qE",
  "access_expires_at": "2026-10-29T16:03:37.871731174Z",
  "refresh_token": "jtp-Mpx3wntySAA3Sd9hT7NBUl3Auggh4wbgk9WB-B8",
  "refresh_expires_at": "2026-10-30T03:48:37.871222849Z",
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
  "command_id": "153ad340-1d04-4458-ad7b-2a4be71350ec",
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
  "session_id": "b2421a68-9724-4e77-a35f-3a2628027994",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MTgsImlhdCI6MTc5MzI4ODkxOCwianRpIjoiODRiNTkxNDMtMmEwYS00NjJlLTgxZWYtZWEwNjljZDQ2Y2FlIiwic2lkIjoiYjI0MjFhNjgtOTcyNC00ZTc3LWEzNWYtM2EyNjI4MDI3OTk0In0.v2WWkSPj6ppSxVlWiEuR9Cyg5rjDQmD55Qs6rhISEbk",
  "access_expires_at": "2026-10-29T16:03:38.684620328Z",
  "refresh_token": "pOa2AtYvs2jm-uY36YZR-0433dlT3x_ZKt6Q1O-NZA8",
  "refresh_expires_at": "2026-10-30T03:48:38.684099445Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.269852719",
    "linkedid": "1730052700.269852719",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675169994"
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
    "id": "1730052700.269852719",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "000d215b-3adc-4af2-9d6d-2c136c5610c1",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:48:38.881658Z",
      "answered_at": null,
      "ended_at": "2026-10-29T15:48:38.905608Z",
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
    "id": "1730052600.18830457",
    "linkedid": "1730052600.18830457",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675169994"
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
      "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:48:39.142088Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/8f909588-a55d-49f2-8d23-03609c55f98b/answer` → **200**

```json
{
  "command_id": "64e0cd4a-d1bf-4fed-88b8-16096b072f1e"
}
```

```json
{
  "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675169994",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "order_ids": [],
  "started_at": "2026-10-29T15:48:39.142088Z",
  "answered_at": "2026-10-29T15:48:39.382524Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.18830457",
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
    "id": "1730052600.18830457",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [],
      "started_at": "2026-10-29T15:48:39.142088Z",
      "answered_at": "2026-10-29T15:48:39.382524Z",
      "ended_at": "2026-10-29T15:48:39.601936Z",
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
      "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [],
      "started_at": "2026-10-29T15:48:39.142088Z",
      "answered_at": "2026-10-29T15:48:39.382524Z",
      "ended_at": "2026-10-29T15:48:39.601936Z",
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
      "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [],
      "started_at": "2026-10-29T15:48:39.142088Z",
      "answered_at": "2026-10-29T15:48:39.382524Z",
      "ended_at": "2026-10-29T15:48:39.601936Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:48:43.451579Z"
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
      "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [],
      "started_at": "2026-10-29T15:48:39.142088Z",
      "answered_at": "2026-10-29T15:48:39.382524Z",
      "ended_at": "2026-10-29T15:48:39.601936Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:48:43.451579Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/8f909588-a55d-49f2-8d23-03609c55f98b/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/8f909588-a55d-49f2-8d23-03609c55f98b/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=8f909588-a55d-49f2-8d23-03609c55f98b` → **200**

```json
{
  "changes": [
    {
      "id": "f279a30f-60f9-4716-a841-70b83bc7eaee",
      "occurred_at": "2026-10-29T15:48:44.468155Z",
      "actor_type": "STAFF",
      "actor_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"729ba6e6-357a-4926-adf6-9043324a01de\", \"order_ids\": []}",
      "correlation_id": "5ef45b9b-40d6-4dfd-befd-9374a935b1e0"
    },
    {
      "id": "141845e5-a4e9-4c32-975e-997982a1fcaf",
      "occurred_at": "2026-10-29T15:48:44.440009Z",
      "actor_type": "STAFF",
      "actor_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"729ba6e6-357a-4926-adf6-9043324a01de\", \"order_ids\": []}",
      "correlation_id": "5eee7ed7-a7b3-492b-8789-87f209f4a77d"
    }
  ]
}
```

Done: call 8f909588-a55d-49f2-8d23-03609c55f98b recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13830"
}
```

```json
{
  "challenge_id": "819c40b9-5977-4d9c-b0fa-0891e5ee9982",
  "expires_at": "2026-10-29T15:53:44.708658226Z",
  "resend_available_at": "2026-10-29T15:48:45.708658226Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "149392",
  "sent_at": "2026-10-29T15:48:44.712423921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "819c40b9-5977-4d9c-b0fa-0891e5ee9982",
  "code": "149392",
  "device_ref": "sandbox-13830"
}
```

```json
{
  "session_id": "bf317a71-aeb6-4357-bde2-9c88e8588411",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgyNCwiaWF0IjoxNzkzMjg4OTI0LCJqdGkiOiJjZmQ2ZjE0Yi0zYzYzLTRlMDktYjI0OS1hZmY3YzhlM2RjNDYiLCJzaWQiOiJiZjMxN2E3MS1hZWI2LTQzNTctYmRlMi05Yzg4ZTg1ODg0MTEifQ.wWliG4wDbV6TVK4CRzIaqCf9XTz6NVXMRj6aHyVD_4o",
  "access_expires_at": "2026-10-29T16:03:44.932198138Z",
  "refresh_token": "dzfle_LiAQH4UB8omvWStfabAfId5C8PApN06mviUjQ",
  "refresh_expires_at": "2026-11-28T15:48:44.931644782Z",
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
  "command_id": "ba8e69ff-54a5-4489-a364-dbfbd704f949",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:45Z",
    "sequence": 1793288925308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b88d11f-bcc0-4534-bda7-e779dd1ac954",
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
  "last_heartbeat_at": "2026-10-29T15:48:45.325165Z",
  "last_location_at": "2026-10-29T15:48:45.325165Z",
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
  "session_id": "3661e023-f799-4d69-a396-76a58cfbf6a5",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MjUsImlhdCI6MTc5MzI4ODkyNSwianRpIjoiMmYyMGY5YmQtMTc2MC00NzMzLWFlZmUtYjkwYWYwNmFlM2VlIiwic2lkIjoiMzY2MWUwMjMtZjc5OS00ZDY5LWEzOTYtNzZhNThjZmJmNmE1In0.a9tUW67MwwhjvJOTYuHKlwvA8Ego-P5qudestg-DHuU",
  "access_expires_at": "2026-10-29T16:03:45.733425939Z",
  "refresh_token": "HyG_id_zXQsr1qkOy9ETAYn59FKgxR3AQlYdyThHwt0",
  "refresh_expires_at": "2026-10-30T03:48:45.733026218Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aced14bc-765f-4318-b8dd-8e1fe2982a74",
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
  "id": "193ebe97-cb09-4bee-bf9e-3bc2caa039c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:45.928424Z",
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
  "command_id": "55acefee-ef3c-42e0-9763-9ed19a0e8610",
  "quote_id": "193ebe97-cb09-4bee-bf9e-3bc2caa039c2",
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
    "phone": "+380675558580"
  }
}
```

```json
{
  "id": "2e4aff28-5551-492c-8252-773192f4a3f2",
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
  "created_at": "2026-10-29T15:48:46.164576Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675558580"
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
    "id": "79cd8f00-6dd2-4987-969e-c33d4792241b",
    "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
    "expires_at": "2026-10-29T15:49:01.168939Z",
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

`POST /api/driver/v1/offers/79cd8f00-6dd2-4987-969e-c33d4792241b/accept` → **200**

```json
{
  "command_id": "9dc3c14d-815f-4edd-af63-579f0040f876"
}
```

```json
{
  "id": "42aec5ba-86a4-47a0-9d37-e7e17afb7a68",
  "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dddbc753-b95c-4162-b840-9caa84d20878",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dddbc753-b95c-4162-b840-9caa84d20878",
  "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
  "assignment_id": "42aec5ba-86a4-47a0-9d37-e7e17afb7a68",
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
    "phone": "+380675558580"
  }
}
```

`POST /api/driver/v1/work-sessions/6b88d11f-bcc0-4534-bda7-e779dd1ac954/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:48Z",
    "sequence": 1793288928240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b88d11f-bcc0-4534-bda7-e779dd1ac954",
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
  "last_heartbeat_at": "2026-10-29T15:48:48.040946Z",
  "last_location_at": "2026-10-29T15:48:48.040946Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dddbc753-b95c-4162-b840-9caa84d20878/arrive` → **200**

```json
{
  "command_id": "cb75e1de-1bc8-4e3b-8283-a6761e290d8a",
  "expected_version": 0
}
```

```json
{
  "id": "dddbc753-b95c-4162-b840-9caa84d20878",
  "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
  "assignment_id": "42aec5ba-86a4-47a0-9d37-e7e17afb7a68",
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
  "arrived_at": "2026-10-29T15:48:48.235649Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675558580"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  },
  {
    "phone": "+380675558580",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:49.627815731Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  },
  {
    "phone": "+380675558580",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:49.627815731Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675558580` → **200**

```json
[
  {
    "phone": "+380675558580",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:47.621329253Z"
  },
  {
    "phone": "+380675558580",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:48:49.627815731Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/dddbc753-b95c-4162-b840-9caa84d20878/start` → **200**

```json
{
  "command_id": "2b100fe5-7b4b-4164-800f-54810b24cc5b",
  "expected_version": 1
}
```

```json
{
  "id": "dddbc753-b95c-4162-b840-9caa84d20878",
  "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
  "assignment_id": "42aec5ba-86a4-47a0-9d37-e7e17afb7a68",
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
  "arrived_at": "2026-10-29T15:48:48.235649Z",
  "started_at": "2026-10-29T15:48:50.549042Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675558580"
  }
}
```

`POST /api/driver/v1/trips/dddbc753-b95c-4162-b840-9caa84d20878/complete` → **200**

```json
{
  "command_id": "52d580a0-8b04-4dc5-b447-0a318a26a5a5",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:48:50Z",
  "cash_received": true
}
```

```json
{
  "id": "dddbc753-b95c-4162-b840-9caa84d20878",
  "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
  "assignment_id": "42aec5ba-86a4-47a0-9d37-e7e17afb7a68",
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
  "arrived_at": "2026-10-29T15:48:48.235649Z",
  "started_at": "2026-10-29T15:48:50.549042Z",
  "completed_at": "2026-10-29T15:48:50.763467Z",
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
  "session_id": "6b88d11f-bcc0-4534-bda7-e779dd1ac954",
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
  "last_heartbeat_at": "2026-10-29T15:48:48.040946Z",
  "last_location_at": "2026-10-29T15:48:48.040946Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b88d11f-bcc0-4534-bda7-e779dd1ac954/close` → **200**

```json
{
  "command_id": "e3f90944-c60a-41c1-9bb1-58c25c5a2ffd",
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
  "phone": "+380634474373",
  "device_ref": "sandbox-25531"
}
```

```json
{
  "challenge_id": "9ec48163-541e-4f93-80b0-fb6c1b2beab0",
  "expires_at": "2026-10-29T15:53:51.38782342Z",
  "resend_available_at": "2026-10-29T15:48:52.38782342Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634474373` → **200**

```json
{
  "phone": "+380634474373",
  "audience": "CLIENT",
  "code": "594196",
  "sent_at": "2026-10-29T15:48:51.391480893Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ec48163-541e-4f93-80b0-fb6c1b2beab0",
  "code": "594196",
  "device_ref": "sandbox-25531"
}
```

```json
{
  "session_id": "649895a5-8570-47a2-946f-2760ff1bfa90",
  "subject": {
    "type": "CLIENT",
    "id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWRjNjQ3Ni1lZTYyLTRjODEtYThmMS1mOWIxYzVhZmEwZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODMxLCJpYXQiOjE3OTMyODg5MzEsImp0aSI6IjVkNWQxNTUzLTRhYzYtNGE3YS04NzU4LTcyYTk2Y2Q2MDBkYiIsInNpZCI6IjY0OTg5NWE1LTg1NzAtNDdhMi05NDZmLTI3NjBmZjFiZmE5MCJ9.Ionsa05AXASOHgsoUCzs5oOqcm8lUTiDb1FoQkCxPCQ",
  "access_expires_at": "2026-10-29T16:03:51.618967801Z",
  "refresh_token": "yqUAUhWS3MeQE5cXdXJvVZfc-pI8SH-xmQlMLCmaC4U",
  "refresh_expires_at": "2026-11-28T15:48:51.618542938Z",
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
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
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
  "device_ref": "sandbox-31341"
}
```

```json
{
  "challenge_id": "b529847e-2289-47df-9c42-9d6324dbf20f",
  "expires_at": "2026-10-29T15:53:52.027134567Z",
  "resend_available_at": "2026-10-29T15:48:53.027134567Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "212243",
  "sent_at": "2026-10-29T15:48:52.030299703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b529847e-2289-47df-9c42-9d6324dbf20f",
  "code": "212243",
  "device_ref": "sandbox-31341"
}
```

```json
{
  "session_id": "740997ba-8633-4db9-a609-0a855bda30e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgzMiwiaWF0IjoxNzkzMjg4OTMyLCJqdGkiOiIzNmU2ZWM3Zi01MjFiLTQ0NjAtODVjZC0wYmEzOTRhOTk1NGQiLCJzaWQiOiI3NDA5OTdiYS04NjMzLTRkYjktYTYwOS0wYTg1NWJkYTMwZTAifQ.CTlJvJGO48MLc4e7CyFDCfCD1Fjo9H8goTOWyg3Iguk",
  "access_expires_at": "2026-10-29T16:03:52.24625204Z",
  "refresh_token": "SidSSqpRHZT5ym3eSLk_WMoDHYwtLgNsj0Qy-kwTKSA",
  "refresh_expires_at": "2026-11-28T15:48:52.245757044Z",
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
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
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
  "session_id": "cfa523e2-c070-4eb1-a4d2-d7da863f18ac",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzIsImlhdCI6MTc5MzI4ODkzMiwianRpIjoiYTBiMDI3ZWYtN2NkNy00ZmNhLWJhMTctOGY0YzAyMWQwN2UwIiwic2lkIjoiY2ZhNTIzZTItYzA3MC00ZWIxLWE0ZDItZDdkYTg2M2YxOGFjIn0.CuaY_brMzD-L7ncwiI1eIFSZL4q_HbGlelB6-YyNIyU",
  "access_expires_at": "2026-10-29T16:03:52.82456649Z",
  "refresh_token": "eWf2nRGg5QYr-2btF-4VxJ1bHBa5Jt_5KURaRDU1zFw",
  "refresh_expires_at": "2026-10-30T03:48:52.824134421Z",
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
  "session_id": "2e9f5820-963c-4d68-9484-22aec3274196",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4MzMsImlhdCI6MTc5MzI4ODkzMywianRpIjoiY2YzMDgwZTktMDI5Ny00MjdmLTk5Y2QtZjg2NDdmNWMwOWI0Iiwic2lkIjoiMmU5ZjU4MjAtOTYzYy00ZDY4LTk0ODQtMjJhZWMzMjc0MTk2In0.imePYgkplAYFGB-cjNXqhKz_UxykRRqaBhtF22zoAPI",
  "access_expires_at": "2026-10-29T16:03:53.215960166Z",
  "refresh_token": "aueVBjmXOqowy-hhQWKwLy-dTqOCh54UNC0G1guwLGU",
  "refresh_expires_at": "2026-10-30T03:48:53.215574316Z",
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
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident",
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
  "command_id": "30d42e48-9daf-4dcb-890f-32603328e817",
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
  "id": "7fd04319-e387-4864-a4cf-6c7818276b69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:53.596429Z",
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
  "command_id": "db606b04-fc50-4e90-a599-1530c2958dd7",
  "quote_id": "7fd04319-e387-4864-a4cf-6c7818276b69",
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
  "id": "e1057c65-1baa-44fe-9780-67dfe134aa2e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd",
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
  "created_at": "2026-10-29T15:48:53.798318Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e1057c65-1baa-44fe-9780-67dfe134aa2e` → **200**

```json
{
  "id": "e1057c65-1baa-44fe-9780-67dfe134aa2e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd",
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
  "created_at": "2026-10-29T15:48:53.798318Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e1057c65-1baa-44fe-9780-67dfe134aa2e/cancel` → **200**

```json
{
  "command_id": "616eb969-200b-4192-b157-7cce26fbb3d7",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "e1057c65-1baa-44fe-9780-67dfe134aa2e",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd",
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
  "created_at": "2026-10-29T15:48:53.798318Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
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
  "command_id": "7b45ef00-547e-42e1-8215-d5af158ba062",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:54Z",
    "sequence": 1793288934613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4a1a604e-79ea-4f05-bb96-92e2aaf31eff",
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
  "last_heartbeat_at": "2026-10-29T15:48:54.630446Z",
  "last_location_at": "2026-10-29T15:48:54.630446Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18969"
}
```

```json
{
  "challenge_id": "c5f38843-1dbe-4e23-a88d-aed528b763f0",
  "expires_at": "2026-10-29T15:53:54.826758081Z",
  "resend_available_at": "2026-10-29T15:48:55.826758081Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "272018",
  "sent_at": "2026-10-29T15:48:54.829536225Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5f38843-1dbe-4e23-a88d-aed528b763f0",
  "code": "272018",
  "device_ref": "sandbox-18969"
}
```

```json
{
  "session_id": "71d3ebf2-f404-4771-99af-ec6879b62b11",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgzNSwiaWF0IjoxNzkzMjg4OTM1LCJqdGkiOiJhNGZjMDgwNS1jNmUzLTQzMGQtYmM4OC00YjQ3ZTE2MmY2NzciLCJzaWQiOiI3MWQzZWJmMi1mNDA0LTQ3NzEtOTlhZi1lYzY4NzliNjJiMTEifQ.Qbd8wHB-VNALUR7u-2Qvx2eLjsFXo9Aymfs7jhvgFrA",
  "access_expires_at": "2026-10-29T16:03:55.044775012Z",
  "refresh_token": "9CtKWDHfWQEhhddtmyVcdH5U8jgHUiIj8lc5DG3es6A",
  "refresh_expires_at": "2026-11-28T15:48:55.044339032Z",
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
  "command_id": "de6f07cf-08f5-47d8-83ca-3018629ad7a8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:48:55Z",
    "sequence": 1793288935423
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:48:55.440667Z",
  "last_location_at": "2026-10-29T15:48:55.440667Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1550c5bf-c576-44fd-b4db-a0b2181dcf1f",
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
  "id": "70a7ef3c-09e4-4fa3-8a94-e85692eeec2b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:53:55.646277Z",
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
  "command_id": "fc4071c8-732f-4ef7-8e9b-493a403e1988",
  "quote_id": "70a7ef3c-09e4-4fa3-8a94-e85692eeec2b",
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
  "id": "bffd435d-511f-4e79-b353-685d3c354244",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd",
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
  "created_at": "2026-10-29T15:48:55.849176Z",
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
    "id": "d9874bfa-82f5-4736-a0b0-e0b067894f0f",
    "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
    "expires_at": "2026-10-29T15:49:10.852174Z",
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

`POST /api/driver/v1/offers/d9874bfa-82f5-4736-a0b0-e0b067894f0f/accept` → **200**

```json
{
  "command_id": "ad589406-ac67-484c-9660-f0b6497e101e"
}
```

```json
{
  "id": "39d9c6ea-0f42-4bf8-8fcd-8153ba475ba5",
  "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "06567d72-6655-4e83-a851-794776be8534",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "06567d72-6655-4e83-a851-794776be8534",
  "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
  "assignment_id": "39d9c6ea-0f42-4bf8-8fcd-8153ba475ba5",
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

`POST /api/driver/v1/trips/06567d72-6655-4e83-a851-794776be8534/cancel` → **200**

```json
{
  "command_id": "89e347e4-fd06-4b2f-8d90-700270418cc2",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "06567d72-6655-4e83-a851-794776be8534",
  "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
  "assignment_id": "39d9c6ea-0f42-4bf8-8fcd-8153ba475ba5",
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

`GET /api/rider/v1/orders/bffd435d-511f-4e79-b353-685d3c354244` → **200**

```json
{
  "id": "bffd435d-511f-4e79-b353-685d3c354244",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd",
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
    "id": "39d9c6ea-0f42-4bf8-8fcd-8153ba475ba5",
    "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "06567d72-6655-4e83-a851-794776be8534",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:48:55.849176Z",
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
    "id": "d510c35d-7075-4f63-b54f-894bf79b1d9e",
    "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
    "expires_at": "2026-10-29T15:49:11.643677Z",
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

`POST /api/driver/v1/offers/d510c35d-7075-4f63-b54f-894bf79b1d9e/accept` → **200**

```json
{
  "command_id": "914b7925-141c-4abd-81f1-ca4a359bd0e3"
}
```

```json
{
  "id": "b07d28ba-eba0-42fd-b437-924235a24ee5",
  "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "77f9f1e7-46be-46bc-9e9c-9fb3b936cba8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "77f9f1e7-46be-46bc-9e9c-9fb3b936cba8",
  "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
  "assignment_id": "b07d28ba-eba0-42fd-b437-924235a24ee5",
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

`POST /api/driver/v1/trips/77f9f1e7-46be-46bc-9e9c-9fb3b936cba8/cancel` → **200**

```json
{
  "command_id": "b0c0a02b-edef-4fa0-9746-f73b983a4229",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "77f9f1e7-46be-46bc-9e9c-9fb3b936cba8",
  "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
  "assignment_id": "b07d28ba-eba0-42fd-b437-924235a24ee5",
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
    "id": "bffd435d-511f-4e79-b353-685d3c354244",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:48:55.849176Z",
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
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "e1057c65-1baa-44fe-9780-67dfe134aa2e",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:48:53.798318Z",
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
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/bffd435d-511f-4e79-b353-685d3c354244/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:48:55.849759Z",
      "actor": {
        "type": "CLIENT",
        "id": "19dc6476-ee62-4c81-a8f1-f9b1c5afa0dd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
        "quote_id": "70a7ef3c-09e4-4fa3-8a94-e85692eeec2b",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "56234354-55cf-4fa3-bc1e-a3082571fc82"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:48:55.851515Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
        "attempt_id": "29c0bc73-181a-4e26-93e7-147b7b0d6231",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "56234354-55cf-4fa3-bc1e-a3082571fc82"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:48:55.856464Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d9874bfa-82f5-4736-a0b0-e0b067894f0f",
        "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "56234354-55cf-4fa3-bc1e-a3082571fc82"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:48:56.24723Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d9874bfa-82f5-4736-a0b0-e0b067894f0f",
        "order_id": "bffd435d-511f-4e79-b353-685d3c354244",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "39d9c6ea-0f42-4bf8-8fcd-8153ba475ba5"
      },
      "correlation_id": "99e7b2b2-04f9-4dc2-85de-79130e38bf20"
```

Done: orders e1057c65-1baa-44fe-9780-67dfe134aa2e, bffd435d-511f-4e79-b353-685d3c354244.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735253206",
  "device_ref": "sandbox-6372"
}
```

```json
{
  "challenge_id": "e3bcae2c-c70d-4957-b0c4-97a70a9bb323",
  "expires_at": "2026-10-29T15:53:58.255085772Z",
  "resend_available_at": "2026-10-29T15:48:59.255085772Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735253206` → **200**

```json
{
  "phone": "+380735253206",
  "audience": "CLIENT",
  "code": "728420",
  "sent_at": "2026-10-29T15:48:58.257741489Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3bcae2c-c70d-4957-b0c4-97a70a9bb323",
  "code": "728420",
  "device_ref": "sandbox-6372"
}
```

```json
{
  "session_id": "06072419-1ccf-4818-af80-246ae655f381",
  "subject": {
    "type": "CLIENT",
    "id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzkzODM4Yy1jMWY4LTRiMTgtYjA1MS05YjNmYjljM2UyOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODM4LCJpYXQiOjE3OTMyODg5MzgsImp0aSI6ImQ4NDE4MGU3LWMwYzYtNGM0ZC1iYzU3LWU4MDc3NzU2NWMxMyIsInNpZCI6IjA2MDcyNDE5LTFjY2YtNDgxOC1hZjgwLTI0NmFlNjU1ZjM4MSJ9.-Fo6J2JtSDUaDal2cdy1rhXmwa6lU0RyVQU31QtAqLQ",
  "access_expires_at": "2026-10-29T16:03:58.463305555Z",
  "refresh_token": "VrfsWnvQfeuoYp0tTKF0sQm1Pn5dI3MhTjFWtfI3u8U",
  "refresh_expires_at": "2026-11-28T15:48:58.462300983Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6f5174be-42eb-415e-8f03-53fad07a8727",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9ae6c6d6-87f4-4042-bfe8-7f4657a2f156",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9ae6c6d6-87f4-4042-bfe8-7f4657a2f156",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7618d28b296d843a05bd432d4d9f8705",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9ae6c6d6-87f4-4042-bfe8-7f4657a2f156",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735253206"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9ae6c6d6-87f4-4042-bfe8-7f4657a2f156",
  "expires_at": "2026-10-29T16:18:58.670136Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9ae6c6d6-87f4-4042-bfe8-7f4657a2f156` → **200**

```json
{
  "id": "9ae6c6d6-87f4-4042-bfe8-7f4657a2f156",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:18:58.670136Z",
  "card": {
    "id": "2bb6d71e-beb8-4c37-abcf-2cb58f4918ba",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9185",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:48:58.869009Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "2bb6d71e-beb8-4c37-abcf-2cb58f4918ba",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9185",
      "card_type": "Visa",
      "created_at": "2026-10-29T15:48:58.869009Z"
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
  "device_ref": "sandbox-2675"
}
```

```json
{
  "challenge_id": "447c4721-8b0b-454d-a9b4-8fb7e8182539",
  "expires_at": "2026-10-29T15:53:59.265441881Z",
  "resend_available_at": "2026-10-29T15:49:00.265441881Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "238565",
  "sent_at": "2026-10-29T15:48:59.267973406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "447c4721-8b0b-454d-a9b4-8fb7e8182539",
  "code": "238565",
  "device_ref": "sandbox-2675"
}
```

```json
{
  "session_id": "668da451-360c-4860-a085-8c643bc5a5a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTgzOSwiaWF0IjoxNzkzMjg4OTM5LCJqdGkiOiJlYTZmZGJlYi01MmQ3LTQwZGItOWRkOC00M2M0Y2M4OTNiYzMiLCJzaWQiOiI2NjhkYTQ1MS0zNjBjLTQ4NjAtYTA4NS04YzY0M2JjNWE1YTgifQ.u9rASgTohY9lq5y_G6gd5OnZ4z1Hb1OJDvyXtQgVHCI",
  "access_expires_at": "2026-10-29T16:03:59.482508413Z",
  "refresh_token": "BMwpcp7bYP1DlqrFX-rt0fa3n1dQGbl7fYg7l_v2CGU",
  "refresh_expires_at": "2026-11-28T15:48:59.482060596Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:48:55.440667Z",
  "last_location_at": "2026-10-29T15:48:55.440667Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf/handover` → **200**

```json
{
  "command_id": "97e76aeb-5d23-48b6-80e1-8e4535614cbb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:48:55.440667Z",
  "last_location_at": "2026-10-29T15:48:55.440667Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:00Z",
    "sequence": 1793288940526
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:49:00.069314Z",
  "last_location_at": "2026-10-29T15:49:00.069314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1c0ee5a-47dc-4795-b500-ef71d92f6aa6",
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
  "id": "1b134cbc-90b3-4c2d-8476-da95dd544810",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:00.265555Z",
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
  "command_id": "8efe403d-979b-4cd8-9e59-0053b823fd49",
  "quote_id": "1b134cbc-90b3-4c2d-8476-da95dd544810",
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
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
  "created_at": "2026-10-29T15:49:00.476205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0` → **200**

```json
{
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
  "created_at": "2026-10-29T15:49:00.476205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0` → **200**

```json
{
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
  "created_at": "2026-10-29T15:49:00.476205Z",
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
    "id": "473cd588-3742-45a1-ac71-3fdf2a1cef5d",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "expires_at": "2026-10-29T15:49:15.913472Z",
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

`POST /api/driver/v1/offers/473cd588-3742-45a1-ac71-3fdf2a1cef5d/accept` → **200**

```json
{
  "command_id": "0e0bb98c-30ab-428c-9934-2ae0ce0a5329"
}
```

```json
{
  "id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "assignment_id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
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

`POST /api/driver/v1/work-sessions/d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:02Z",
    "sequence": 1793288942651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:49:02.668109Z",
  "last_location_at": "2026-10-29T15:49:02.668109Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c/arrive` → **200**

```json
{
  "command_id": "d21ed85f-5e67-40a6-9398-d52afeb0f2f1",
  "expected_version": 0
}
```

```json
{
  "id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "assignment_id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
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
  "arrived_at": "2026-10-29T15:49:02.895675Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c/start` → **200**

```json
{
  "command_id": "4a735667-885a-49bb-b115-929def3cb1fa",
  "expected_version": 1
}
```

```json
{
  "id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "assignment_id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
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
  "arrived_at": "2026-10-29T15:49:02.895675Z",
  "started_at": "2026-10-29T15:49:03.097194Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c/complete` → **200**

```json
{
  "command_id": "b5a3c8fa-6049-4cdb-ae6e-095b3e0d01c8",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:03Z",
  "cash_received": true
}
```

```json
{
  "id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "assignment_id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
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
  "arrived_at": "2026-10-29T15:49:02.895675Z",
  "started_at": "2026-10-29T15:49:03.097194Z",
  "completed_at": "2026-10-29T15:49:03.294116Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0` → **200**

```json
{
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
    "id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:00.476205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0` → **200**

```json
{
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
    "id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:00.476205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0` → **200**

```json
{
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
    "id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:00.476205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0` → **200**

```json
{
  "id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
    "id": "5c6cf422-cf1a-487c-a8de-552525d47bee",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "59a4a0f5-eb2b-4d91-b10b-a9b8debbd63c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:00.476205Z",
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

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0/tip` → **200**

```json
{
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
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
  "available_until": "2026-10-30T15:49:03.294116Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0/tip` → **201**

```json
{
  "command_id": "d6bb2a03-a908-48d7-ac16-9ca925de8509",
  "amount_minor": 2500
}
```

```json
{
  "id": "58bdc054-bc47-4ef5-92af-031f9e7eae72",
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:49:07.69113Z"
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0/tip` → **200**

```json
{
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
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
  "available_until": "2026-10-30T15:49:03.294116Z",
  "open": false,
  "tip": {
    "id": "58bdc054-bc47-4ef5-92af-031f9e7eae72",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:49:07.69113Z"
  }
}
```

`GET /api/rider/v1/orders/758d4c0e-52fd-4944-9329-c119500b85d0/tip` → **200**

```json
{
  "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
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
  "available_until": "2026-10-30T15:49:03.294116Z",
  "open": false,
  "tip": {
    "id": "58bdc054-bc47-4ef5-92af-031f9e7eae72",
    "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:49:07.69113Z"
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
      "id": "37c0fdb6-b5b8-4129-856c-d6c8c30c3096",
      "at": "2026-10-29T15:49:09.036157Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
      "counterpart_id": null
    },
    {
      "id": "3417651a-aa67-4821-9805-22a52cf69510",
      "at": "2026-10-29T15:49:03.983472Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a97ed59a-2cb2-4964-b869-23d6d1598c74",
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
  "id": "102e76ff-1315-44d9-b2a3-745be6811c72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:09.492261Z",
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
  "session_id": "349d9390-3a30-45fa-9a08-216a61fd204b",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NDksImlhdCI6MTc5MzI4ODk0OSwianRpIjoiMTAxOWUxYmEtYzY0OS00YjJlLWEwYjktNDhhZDUwZWQ1ZWMzIiwic2lkIjoiMzQ5ZDkzOTAtM2EzMC00NWZhLTlhMDgtMjE2YTYxZmQyMDRiIn0.7E29C1fufzvmBZClL9cP_sAIbxP7jes7NDIwAObhyUc",
  "access_expires_at": "2026-10-29T16:04:09.92515837Z",
  "refresh_token": "CWtg8UfMUOPMiT0VedFFYYyQUQXKlqR1KMFvmZI5Xw4",
  "refresh_expires_at": "2026-10-30T03:49:09.924622405Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735253206` → **200**

```json
{
  "client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297"
}
```

`POST /api/admin/v1/rider-wallets/9393838c-c1f8-4b18-b051-9b3fb9c3e297/top-ups` → **201**

```json
{
  "command_id": "1240bd78-9458-42a8-9ddc-2f96b40964b2",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
      "id": "ee41cf3b-6719-4a10-ae71-3619e698942c",
      "at": "2026-10-29T15:49:10.297535Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bce29f87-9f34-4e5e-a479-575b06bfe3c2",
  "quote_id": "102e76ff-1315-44d9-b2a3-745be6811c72",
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
  "id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
  "created_at": "2026-10-29T15:49:10.508942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7f491a40-9c73-4e02-8221-af31888719fa` → **200**

```json
{
  "id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
  "created_at": "2026-10-29T15:49:10.508942Z",
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
    "id": "7a847995-521d-4d40-bd58-59da9976fc35",
    "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
    "expires_at": "2026-10-29T15:49:25.513621Z",
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

`POST /api/driver/v1/offers/7a847995-521d-4d40-bd58-59da9976fc35/accept` → **200**

```json
{
  "command_id": "f296107f-d259-4d4b-8213-39ae35be4707"
}
```

```json
{
  "id": "d46668b2-a10c-4aa2-aee3-62d503b3201c",
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "710109f1-a288-4d50-a4b3-e428f66d89ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "710109f1-a288-4d50-a4b3-e428f66d89ac",
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "assignment_id": "d46668b2-a10c-4aa2-aee3-62d503b3201c",
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

`POST /api/driver/v1/work-sessions/d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:11Z",
    "sequence": 1793288951538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:49:11.556083Z",
  "last_location_at": "2026-10-29T15:49:11.556083Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/710109f1-a288-4d50-a4b3-e428f66d89ac/arrive` → **200**

```json
{
  "command_id": "ac01a6c5-02a0-4090-bc65-d2a6ac199bf6",
  "expected_version": 0
}
```

```json
{
  "id": "710109f1-a288-4d50-a4b3-e428f66d89ac",
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "assignment_id": "d46668b2-a10c-4aa2-aee3-62d503b3201c",
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
  "arrived_at": "2026-10-29T15:49:11.758399Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/710109f1-a288-4d50-a4b3-e428f66d89ac/start` → **200**

```json
{
  "command_id": "50cafda5-bb9e-4a51-b4d1-929f358eb2bc",
  "expected_version": 1
}
```

```json
{
  "id": "710109f1-a288-4d50-a4b3-e428f66d89ac",
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "assignment_id": "d46668b2-a10c-4aa2-aee3-62d503b3201c",
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
  "arrived_at": "2026-10-29T15:49:11.758399Z",
  "started_at": "2026-10-29T15:49:11.963819Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/710109f1-a288-4d50-a4b3-e428f66d89ac/complete` → **200**

```json
{
  "command_id": "75e5be7b-a8f8-4682-aa2b-863b597ffbfd",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:12Z",
  "cash_received": true
}
```

```json
{
  "id": "710109f1-a288-4d50-a4b3-e428f66d89ac",
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "assignment_id": "d46668b2-a10c-4aa2-aee3-62d503b3201c",
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
  "arrived_at": "2026-10-29T15:49:11.758399Z",
  "started_at": "2026-10-29T15:49:11.963819Z",
  "completed_at": "2026-10-29T15:49:12.174308Z",
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
  "client_id": "9393838c-c1f8-4b18-b051-9b3fb9c3e297",
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
      "id": "ee41cf3b-6719-4a10-ae71-3619e698942c",
      "at": "2026-10-29T15:49:10.297535Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
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

`GET /api/rider/v1/orders/7f491a40-9c73-4e02-8221-af31888719fa/tip` → **200**

```json
{
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
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
  "available_until": "2026-10-30T15:49:12.174308Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7f491a40-9c73-4e02-8221-af31888719fa/tip` → **201**

```json
{
  "command_id": "abd319d0-09c0-4d42-8e1c-6a3f2e54523f",
  "amount_minor": 2500
}
```

```json
{
  "id": "80f3f27d-f764-4932-8ba8-5a201cc328ae",
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:49:12.99125Z"
}
```

`GET /api/rider/v1/orders/7f491a40-9c73-4e02-8221-af31888719fa/tip` → **200**

```json
{
  "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
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
  "available_until": "2026-10-30T15:49:12.174308Z",
  "open": false,
  "tip": {
    "id": "80f3f27d-f764-4932-8ba8-5a201cc328ae",
    "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:49:12.99125Z"
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
      "id": "1e971127-ae7b-4552-9c62-8698c0f9038b",
      "at": "2026-10-29T15:49:13.091798Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
      "counterpart_id": null
    },
    {
      "id": "37c0fdb6-b5b8-4129-856c-d6c8c30c3096",
      "at": "2026-10-29T15:49:09.036157Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
      "counterpart_id": null
    },
    {
      "id": "3417651a-aa67-4821-9805-22a52cf69510",
      "at": "2026-10-29T15:49:03.983472Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
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
      "id": "238bb861-5f60-4b52-90e5-47fad81a6b9d",
      "at": "2026-10-29T15:49:14.113126Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
      "counterpart_id": null
    },
    {
      "id": "1e971127-ae7b-4552-9c62-8698c0f9038b",
      "at": "2026-10-29T15:49:13.091798Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7f491a40-9c73-4e02-8221-af31888719fa",
      "counterpart_id": null
    },
    {
      "id": "37c0fdb6-b5b8-4129-856c-d6c8c30c3096",
      "at": "2026-10-29T15:49:09.036157Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
      "counterpart_id": null
    },
    {
      "id": "3417651a-aa67-4821-9805-22a52cf69510",
      "at": "2026-10-29T15:49:03.983472Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "758d4c0e-52fd-4944-9329-c119500b85d0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf",
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
  "last_heartbeat_at": "2026-10-29T15:49:11.556083Z",
  "last_location_at": "2026-10-29T15:49:11.556083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7b40071-fd47-4c8f-91bc-a2f6ff8b5bbf/close` → **200**

```json
{
  "command_id": "5d0707b7-90cf-4db9-b5bb-742b7e764e2a",
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

Done: card order 7f491a40-9c73-4e02-8221-af31888719fa.

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
  "phone": "+380735592516",
  "device_ref": "sandbox-24088"
}
```

```json
{
  "challenge_id": "c3c0dc99-e9be-4459-b895-0cdf8ab54a62",
  "expires_at": "2026-10-29T15:54:15.344656991Z",
  "resend_available_at": "2026-10-29T15:49:16.344656991Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735592516` → **200**

```json
{
  "phone": "+380735592516",
  "audience": "CLIENT",
  "code": "459872",
  "sent_at": "2026-10-29T15:49:15.34701494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3c0dc99-e9be-4459-b895-0cdf8ab54a62",
  "code": "459872",
  "device_ref": "sandbox-24088"
}
```

```json
{
  "session_id": "b6cbe3f1-1652-4e42-be1c-1d580efc0d5c",
  "subject": {
    "type": "CLIENT",
    "id": "9ee0783b-e984-4662-8f42-508a532d4d90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWUwNzgzYi1lOTg0LTQ2NjItOGY0Mi01MDhhNTMyZDRkOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODU1LCJpYXQiOjE3OTMyODg5NTUsImp0aSI6IjBjYjhmYmU3LTlmNmYtNDg5ZC05YzNjLTYyZTc2Y2E2NjEwYSIsInNpZCI6ImI2Y2JlM2YxLTE2NTItNGU0Mi1iZTFjLTFkNTgwZWZjMGQ1YyJ9.XwZcH4LVU4Xhz8gVoqTAerAIHBVQUAJpVtUnrlhzhmw",
  "access_expires_at": "2026-10-29T16:04:15.566321885Z",
  "refresh_token": "7otBBAA2hbN_mAeFCSEQz5E3Ma0BfvPwndXGV2dgPdg",
  "refresh_expires_at": "2026-11-28T15:49:15.565905625Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e4f691b6-de08-4c51-ae7e-70ab0595fc78",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6974da49-01ce-494f-9d10-8a478d476dc0",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6974da49-01ce-494f-9d10-8a478d476dc0",
    "orderDate": "1793288955",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8286e01a3d7e0c088c67e644d016f485",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6974da49-01ce-494f-9d10-8a478d476dc0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735592516"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6974da49-01ce-494f-9d10-8a478d476dc0",
  "created_at": "2026-10-29T15:49:15.785715Z",
  "expires_at": "2026-10-29T16:19:15.785715Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6974da49-01ce-494f-9d10-8a478d476dc0` → **200**

```json
{
  "id": "6974da49-01ce-494f-9d10-8a478d476dc0",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:49:15.785715Z",
  "expires_at": "2026-10-29T16:19:15.785715Z",
  "completed_at": "2026-10-29T15:49:15.978434Z",
  "masked_pan": "41****2991",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9ee0783b-e984-4662-8f42-508a532d4d90",
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
      "id": "15d96131-621f-49dd-99a5-6a16a2693727",
      "at": "2026-10-29T15:49:16.124674Z",
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
  "client_id": "9ee0783b-e984-4662-8f42-508a532d4d90",
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
      "id": "15d96131-621f-49dd-99a5-6a16a2693727",
      "at": "2026-10-29T15:49:16.124674Z",
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
  "device_ref": "sandbox-25630"
}
```

```json
{
  "challenge_id": "bbf85b87-0788-4a76-a92a-5732b0bb018a",
  "expires_at": "2026-10-29T15:54:16.563390776Z",
  "resend_available_at": "2026-10-29T15:49:17.563390776Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "811426",
  "sent_at": "2026-10-29T15:49:16.565832691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbf85b87-0788-4a76-a92a-5732b0bb018a",
  "code": "811426",
  "device_ref": "sandbox-25630"
}
```

```json
{
  "session_id": "b17e4bc6-2397-42eb-a518-c672d7b948b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg1NiwiaWF0IjoxNzkzMjg4OTU2LCJqdGkiOiIzMjY3ZTY0Ny1jNTljLTQzYWYtODg4YS00MmUxY2VhZWE1NWUiLCJzaWQiOiJiMTdlNGJjNi0yMzk3LTQyZWItYTUxOC1jNjcyZDdiOTQ4YjQifQ.TYw-ZIxCjYT5uSv1qvX-AN2B-qNXxt7Y4ApxIDrjhk0",
  "access_expires_at": "2026-10-29T16:04:16.80892742Z",
  "refresh_token": "OCVZo1YlC-GdNKoOTiX6DBYrp45ysUglJtYw2eKEbxk",
  "refresh_expires_at": "2026-11-28T15:49:16.807792191Z",
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
  "command_id": "e71fe149-e1a2-4094-b52c-4437e600b7b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2fc6166e-555e-4283-b73c-b5e77a277462",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2fc6166e-555e-4283-b73c-b5e77a277462",
    "orderDate": "1793288957",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "3b9dc01b3ca7e476b9de5a930382dc5d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2fc6166e-555e-4283-b73c-b5e77a277462",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2fc6166e-555e-4283-b73c-b5e77a277462",
  "created_at": "2026-10-29T15:49:17.185874Z",
  "expires_at": "2026-10-29T16:19:17.185874Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2fc6166e-555e-4283-b73c-b5e77a277462` → **200**

```json
{
  "id": "2fc6166e-555e-4283-b73c-b5e77a277462",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:49:17.185874Z",
  "expires_at": "2026-10-29T16:19:17.185874Z",
  "completed_at": "2026-10-29T15:49:17.376816Z",
  "masked_pan": "41****0969",
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
      "id": "b3400a2d-1bd0-4bd3-99f1-eeba6674cc2c",
      "at": "2026-10-29T15:49:18.135708Z",
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
  "command_id": "9fb8e7fe-0da0-449c-afee-229f2c73c2ed",
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
  "correlation_id": "909e7c20-17d3-49c4-9a62-4fd3c4586071"
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
  "device_ref": "sandbox-3831"
}
```

```json
{
  "challenge_id": "3f8735e8-4515-4f0a-9de9-866a561ddefc",
  "expires_at": "2026-10-29T15:54:19.200227994Z",
  "resend_available_at": "2026-10-29T15:49:20.200227994Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "856652",
  "sent_at": "2026-10-29T15:49:19.202699425Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f8735e8-4515-4f0a-9de9-866a561ddefc",
  "code": "856652",
  "device_ref": "sandbox-3831"
}
```

```json
{
  "session_id": "1b209338-9e63-4d46-b170-df9d6755a638",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg1OSwiaWF0IjoxNzkzMjg4OTU5LCJqdGkiOiJmNjM5YWExNC02ZmIyLTQ4OTUtOGFkMC1kYzQyNDUxNTY4MGUiLCJzaWQiOiIxYjIwOTMzOC05ZTYzLTRkNDYtYjE3MC1kZjlkNjc1NWE2MzgifQ.y_Yj4JntKtkNZdgwhYCGUbtbPU1LoxcwttXQJm4RyNA",
  "access_expires_at": "2026-10-29T16:04:19.413600734Z",
  "refresh_token": "Btz0WolKf3bWvOu4H5b8ZHSImOx-evBmdvOHTbWTdu0",
  "refresh_expires_at": "2026-11-28T15:49:19.413109726Z",
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
  "command_id": "d7db2150-44aa-4b4c-983c-9454c43db574",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:19Z",
    "sequence": 1793288959790
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "557fea1a-4785-4e53-88a4-7eebc86bdb54",
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
  "last_heartbeat_at": "2026-10-29T15:49:19.807148Z",
  "last_location_at": "2026-10-29T15:49:19.807148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633792844",
  "device_ref": "sandbox-1483"
}
```

```json
{
  "challenge_id": "21bb55e7-7cda-4ed1-afeb-fc9dd891e91e",
  "expires_at": "2026-10-29T15:54:19.9974257Z",
  "resend_available_at": "2026-10-29T15:49:20.9974257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633792844` → **200**

```json
{
  "phone": "+380633792844",
  "audience": "CLIENT",
  "code": "128785",
  "sent_at": "2026-10-29T15:49:19.999601848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21bb55e7-7cda-4ed1-afeb-fc9dd891e91e",
  "code": "128785",
  "device_ref": "sandbox-1483"
}
```

```json
{
  "session_id": "7313ecb2-cb4e-435e-80a4-5d6060855345",
  "subject": {
    "type": "CLIENT",
    "id": "3e9245d2-3f3a-4830-8e13-ee10d04d3604"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTkyNDVkMi0zZjNhLTQ4MzAtOGUxMy1lZTEwZDA0ZDM2MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODYwLCJpYXQiOjE3OTMyODg5NjAsImp0aSI6IjNjYmRkODY4LWJiODctNGRlZC05NzZjLTkyOWFmNTUzMmM2ZiIsInNpZCI6IjczMTNlY2IyLWNiNGUtNDM1ZS04MGE0LTVkNjA2MDg1NTM0NSJ9.qI6kHveVQz6CU2oLM35qEONqs4I8per2Zn2mgXErad0",
  "access_expires_at": "2026-10-29T16:04:20.21110552Z",
  "refresh_token": "YdMbeGZX6Vs_o2ucKusvkoJVJixgLtvDd7ocNQ9uYhY",
  "refresh_expires_at": "2026-11-28T15:49:20.210746161Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b25fce12-c328-438e-bd30-c920836d10fe",
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
  "id": "96d23d08-d660-4796-a1ab-b1429fcf6ed0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:20.408056Z",
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
  "command_id": "7198cdde-6670-47b8-9972-421d34cb24fb",
  "quote_id": "96d23d08-d660-4796-a1ab-b1429fcf6ed0",
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
  "id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e9245d2-3f3a-4830-8e13-ee10d04d3604",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:49:20.609021Z",
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
    "id": "876177fb-7fe0-4bc5-aa91-588e1b941eca",
    "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
    "expires_at": "2026-10-29T15:49:35.611177Z",
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

`POST /api/driver/v1/offers/876177fb-7fe0-4bc5-aa91-588e1b941eca/accept` → **200**

```json
{
  "command_id": "bbb540ef-f426-43d8-a0a9-0f9d960492f4"
}
```

```json
{
  "id": "a547959e-0f41-4425-8f7a-36549200951f",
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f68afe88-1139-4002-b18b-9681c41fad7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f68afe88-1139-4002-b18b-9681c41fad7c",
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "assignment_id": "a547959e-0f41-4425-8f7a-36549200951f",
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

`POST /api/driver/v1/work-sessions/557fea1a-4785-4e53-88a4-7eebc86bdb54/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:21Z",
    "sequence": 1793288961437
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "557fea1a-4785-4e53-88a4-7eebc86bdb54",
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
  "last_heartbeat_at": "2026-10-29T15:49:21.453801Z",
  "last_location_at": "2026-10-29T15:49:21.453801Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f68afe88-1139-4002-b18b-9681c41fad7c/arrive` → **200**

```json
{
  "command_id": "e5c8ec8a-c71a-441f-aa44-7e1a9c522e55",
  "expected_version": 0
}
```

```json
{
  "id": "f68afe88-1139-4002-b18b-9681c41fad7c",
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "assignment_id": "a547959e-0f41-4425-8f7a-36549200951f",
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
  "arrived_at": "2026-10-29T15:49:21.652584Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f68afe88-1139-4002-b18b-9681c41fad7c/start` → **200**

```json
{
  "command_id": "2937ec81-496e-46f5-a116-667e166a7bec",
  "expected_version": 1
}
```

```json
{
  "id": "f68afe88-1139-4002-b18b-9681c41fad7c",
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "assignment_id": "a547959e-0f41-4425-8f7a-36549200951f",
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
  "arrived_at": "2026-10-29T15:49:21.652584Z",
  "started_at": "2026-10-29T15:49:21.872449Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f68afe88-1139-4002-b18b-9681c41fad7c/complete` → **200**

```json
{
  "command_id": "053bdcf5-a778-4638-8640-6ba1872f3ccb",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:22Z",
  "cash_received": false
}
```

```json
{
  "id": "f68afe88-1139-4002-b18b-9681c41fad7c",
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "assignment_id": "a547959e-0f41-4425-8f7a-36549200951f",
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
  "arrived_at": "2026-10-29T15:49:21.652584Z",
  "started_at": "2026-10-29T15:49:21.872449Z",
  "completed_at": "2026-10-29T15:49:22.074593Z",
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
  "session_id": "1d655b6a-0bf2-4c77-8474-987e452194d2",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NjIsImlhdCI6MTc5MzI4ODk2MiwianRpIjoiMTNkZjljN2QtNjVlYy00NDE0LTlhZWYtZDRmMzgyYWYxZmIzIiwic2lkIjoiMWQ2NTViNmEtMGJmMi00Yzc3LTg0NzQtOTg3ZTQ1MjE5NGQyIn0.SC4EUkc0fe7PWb5BRYHu92OQdSPyUCJba_Cs0MVrx-c",
  "access_expires_at": "2026-10-29T16:04:22.49221804Z",
  "refresh_token": "KihHnFDtJoWNqLW62zPT-pF_g1drGkxbit8konDeOCE",
  "refresh_expires_at": "2026-10-30T03:49:22.491816697Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8d563102-c0cf-4148-8f2e-e1ebcc167480/cash-dispute` → **200**

```json
{
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "3e9245d2-3f3a-4830-8e13-ee10d04d3604",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:49:22.183992Z",
  "decide_by": "2026-11-12T15:49:22.183992Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T15:49:22.183992Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "3e9245d2-3f3a-4830-8e13-ee10d04d3604",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T15:49:22.183992Z",
      "decide_by": "2026-11-12T15:49:22.183992Z",
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

`POST /api/admin/v1/orders/8d563102-c0cf-4148-8f2e-e1ebcc167480/cash-dispute/decide` → **400**

```json
{
  "command_id": "ecf15a13-8d7b-4838-91d0-4be6384c83c8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/8d563102-c0cf-4148-8f2e-e1ebcc167480/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ef044de8-b270-4972-81fd-8d98e149d75a",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/8d563102-c0cf-4148-8f2e-e1ebcc167480/cash-dispute/decide` → **200**

```json
{
  "command_id": "316a1348-c8f1-49f3-b24f-9452d9659878",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "3e9245d2-3f3a-4830-8e13-ee10d04d3604",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:49:22.183992Z",
  "decide_by": "2026-11-12T15:49:22.183992Z",
  "decision": "PAY_DRIVER",
  "decided_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T15:49:23.341999Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/8d563102-c0cf-4148-8f2e-e1ebcc167480/cash-dispute/decide` → **409**

```json
{
  "command_id": "4f819529-1af8-4056-9127-977cb921ecbb",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8d563102-c0cf-4148-8f2e-e1ebcc167480/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2e83e893-12a6-4555-870c-9d380bc069ea"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "557fea1a-4785-4e53-88a4-7eebc86bdb54",
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
  "last_heartbeat_at": "2026-10-29T15:49:21.453801Z",
  "last_location_at": "2026-10-29T15:49:21.453801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/557fea1a-4785-4e53-88a4-7eebc86bdb54/close` → **200**

```json
{
  "command_id": "3117913e-1559-4dce-bdb7-55d14afdfb1b",
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
  "phone": "+380738726332",
  "device_ref": "sandbox-10947"
}
```

```json
{
  "challenge_id": "6a541dca-f94d-43ef-af3c-aaa69b224946",
  "expires_at": "2026-10-29T15:54:24.161510332Z",
  "resend_available_at": "2026-10-29T15:49:25.161510332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738726332` → **200**

```json
{
  "phone": "+380738726332",
  "audience": "CLIENT",
  "code": "754614",
  "sent_at": "2026-10-29T15:49:24.163508657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a541dca-f94d-43ef-af3c-aaa69b224946",
  "code": "754614",
  "device_ref": "sandbox-10947"
}
```

```json
{
  "session_id": "9abf298c-58e3-40a2-8a8e-1a16e3bdcb03",
  "subject": {
    "type": "CLIENT",
    "id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDVhNmVmNC04ZTdjLTQ5NjQtYjYyZS1lOTUyODkyMmFlMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODY0LCJpYXQiOjE3OTMyODg5NjQsImp0aSI6IjdmYjM2YWFmLTk5MTItNDJiYi1hMmY4LWM0NjBjYWNkYjZjYiIsInNpZCI6IjlhYmYyOThjLTU4ZTMtNDBhMi04YThlLTFhMTZlM2JkY2IwMyJ9.PSvRXgD-fetM44ZX-G0DMVt4jw0cBmGwj-a2D4UDDmQ",
  "access_expires_at": "2026-10-29T16:04:24.3920792Z",
  "refresh_token": "eKPZo0J_1PnEU1G--uNlWiFMXekLvAmOQSdBjQ9DCOo",
  "refresh_expires_at": "2026-11-28T15:49:24.391140461Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2a6a9aac-ec0e-4fef-b42e-4734d91cba0a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0a7b5cba-b31d-49a0-b9d5-a81a39fd4966",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0a7b5cba-b31d-49a0-b9d5-a81a39fd4966",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b7491ab0006d9c2415353867006c3445",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0a7b5cba-b31d-49a0-b9d5-a81a39fd4966",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738726332"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0a7b5cba-b31d-49a0-b9d5-a81a39fd4966",
  "expires_at": "2026-10-29T16:19:24.614288Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0a7b5cba-b31d-49a0-b9d5-a81a39fd4966` → **200**

```json
{
  "id": "0a7b5cba-b31d-49a0-b9d5-a81a39fd4966",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:19:24.614288Z",
  "card": {
    "id": "03955f31-e3ee-45ed-903b-b5d3522e7c10",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0318",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:49:24.813773Z"
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
  "device_ref": "sandbox-22921"
}
```

```json
{
  "challenge_id": "8633eb03-c3ff-4aec-89bd-d2812c23d38e",
  "expires_at": "2026-10-29T15:54:25.026267528Z",
  "resend_available_at": "2026-10-29T15:49:26.026267528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "301116",
  "sent_at": "2026-10-29T15:49:25.028277034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8633eb03-c3ff-4aec-89bd-d2812c23d38e",
  "code": "301116",
  "device_ref": "sandbox-22921"
}
```

```json
{
  "session_id": "00cb6e96-058c-4c7c-acca-6743e73fe099",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTg2NSwiaWF0IjoxNzkzMjg4OTY1LCJqdGkiOiI5NDNmMDU5Yy0yMjRkLTQyN2UtODY1MS03MjRhODZhZTVlYTYiLCJzaWQiOiIwMGNiNmU5Ni0wNThjLTRjN2MtYWNjYS02NzQzZTczZmUwOTkifQ.OqE0AlWdkq7Rvnyisur0-2TEQhyPJWSPZWJccz96BS8",
  "access_expires_at": "2026-10-29T16:04:25.243510719Z",
  "refresh_token": "AhYuC5PdE8CdaBTD79HASbw5ftlACrp4jhB63IPPLiQ",
  "refresh_expires_at": "2026-11-28T15:49:25.243097594Z",
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
  "command_id": "ab952f11-9704-42f0-b5c7-d28cb8208338",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:25Z",
    "sequence": 1793288965614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a29fa3ce-fb7e-4e2a-9991-6709695499c5",
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
  "last_heartbeat_at": "2026-10-29T15:49:25.630801Z",
  "last_location_at": "2026-10-29T15:49:25.630801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9ed29821-4094-4537-9ef8-696feeb6ae72",
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
  "id": "6df13067-d04b-4ffb-983e-9dba95fe92df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:25.834625Z",
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
  "command_id": "ed6f492a-eaf4-4317-9d2a-9a95847948b2",
  "quote_id": "6df13067-d04b-4ffb-983e-9dba95fe92df",
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
  "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
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
  "created_at": "2026-10-29T15:49:26.033143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b` → **200**

```json
{
  "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
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
  "created_at": "2026-10-29T15:49:26.033143Z",
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
    "id": "a814c704-4a7c-4e44-9eca-642e6bfe98d9",
    "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
    "expires_at": "2026-10-29T15:49:41.230539Z",
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

`POST /api/driver/v1/offers/a814c704-4a7c-4e44-9eca-642e6bfe98d9/accept` → **200**

```json
{
  "command_id": "aad13543-7c14-46d8-8aed-0dd88f013800"
}
```

```json
{
  "id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "assignment_id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
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

`POST /api/rider/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/messages` → **201**

```json
{
  "command_id": "b8bd6927-bb30-4f2f-9c12-bd7a5dbf808b",
  "body": "Я біля входу, мій номер +380738726332, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "b28585de-15f9-47e7-90b8-ff903aa77353",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380738726332, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T15:49:26.999955597Z"
}
```

`POST /api/driver/v1/trips/f2bbea51-ee8f-4dbc-a6a5-c06985f93535/messages` → **201**

```json
{
  "command_id": "81bc1d66-c0a2-46d3-8d95-fa5d00eacadc",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "4239a7e5-a7d1-410c-8aac-71029bbb4ed1",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T15:49:27.193644378Z"
}
```

`POST /api/driver/v1/work-sessions/a29fa3ce-fb7e-4e2a-9991-6709695499c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:27Z",
    "sequence": 1793288967385
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a29fa3ce-fb7e-4e2a-9991-6709695499c5",
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
  "last_heartbeat_at": "2026-10-29T15:49:27.401861Z",
  "last_location_at": "2026-10-29T15:49:27.401861Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f2bbea51-ee8f-4dbc-a6a5-c06985f93535/arrive` → **200**

```json
{
  "command_id": "2fccafa6-bb53-419a-9bb4-b360fd3fa12e",
  "expected_version": 0
}
```

```json
{
  "id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "assignment_id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
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
  "arrived_at": "2026-10-29T15:49:27.598458Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f2bbea51-ee8f-4dbc-a6a5-c06985f93535/start` → **200**

```json
{
  "command_id": "a1085193-da39-4c80-b430-ca78cf1eb23c",
  "expected_version": 1
}
```

```json
{
  "id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "assignment_id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
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
  "arrived_at": "2026-10-29T15:49:27.598458Z",
  "started_at": "2026-10-29T15:49:27.796428Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a29fa3ce-fb7e-4e2a-9991-6709695499c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:49:27Z",
    "sequence": 1793288967983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a29fa3ce-fb7e-4e2a-9991-6709695499c5",
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
  "last_heartbeat_at": "2026-10-29T15:49:27.999342Z",
  "last_location_at": "2026-10-29T15:49:27.999342Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f2bbea51-ee8f-4dbc-a6a5-c06985f93535/complete` → **200**

```json
{
  "command_id": "c307ff49-ab3d-4605-95d0-f84a41ca88ac",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:49:28Z",
  "cash_received": false
}
```

```json
{
  "id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "assignment_id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
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
  "arrived_at": "2026-10-29T15:49:27.598458Z",
  "started_at": "2026-10-29T15:49:27.796428Z",
  "completed_at": "2026-10-29T15:49:28.198999Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b` → **200**

```json
{
  "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
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
    "id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
    "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:26.033143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b` → **200**

```json
{
  "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
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
    "id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
    "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:26.033143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b` → **200**

```json
{
  "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
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
    "id": "809ef1a6-1ed4-4575-b286-440b8843e78a",
    "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f2bbea51-ee8f-4dbc-a6a5-c06985f93535",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:49:26.033143Z",
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
  "session_id": "a29fa3ce-fb7e-4e2a-9991-6709695499c5",
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
  "last_heartbeat_at": "2026-10-29T15:49:27.999342Z",
  "last_location_at": "2026-10-29T15:49:27.999342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a29fa3ce-fb7e-4e2a-9991-6709695499c5/close` → **200**

```json
{
  "command_id": "0dc00555-83a2-49dc-999e-0df0d114b605",
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
  "session_id": "7dc224e2-7827-40d3-912c-6c0294c8f4ab",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NzEsImlhdCI6MTc5MzI4ODk3MSwianRpIjoiZDJiNzVmMzktYmI2NC00M2Y2LTgyZGUtNjE2YzE0OWRlMzY3Iiwic2lkIjoiN2RjMjI0ZTItNzgyNy00MGQzLTkxMmMtNmMwMjk0YzhmNGFiIn0.70PlbDzKHJC6KnjIgzaNzT4AwpFwO8ygmTOBSKTA6Mk",
  "access_expires_at": "2026-10-29T16:04:31.63213243Z",
  "refresh_token": "MsXr_a0hS4esWC6TWO6x-YS8Bs76808LcVUVvx-Yo2w",
  "refresh_expires_at": "2026-10-30T03:49:31.631773081Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0b67ea8a-9f92-4b07-9331-74d31bb82055"
}
```

`GET /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T15:49:32.020863638Z",
  "order": {
    "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
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
    "created_at": "2026-10-29T15:49:26.033143Z",
    "assigned_at": "2026-10-29T15:49:26.626407Z",
    "arrived_at": "2026-10-29T15:49:27.598458Z",
    "started_at": "2026-10-29T15:49:27.796428Z",
    "completed_at": "2026-10-29T15:49:28.198999Z"
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
    "id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
    "registered_at": "2026-10-29T15:49:24.386359Z",
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
      "created_at": "2026-10-29T15:49:26.035021Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T15:49:28.2884Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks` → **422**

```json
{
  "command_id": "2b65e6c9-de3d-4c76-b7ca-d1b6f1a4a8d3",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "185972b3-856a-4115-b44b-413084265591"
}
```

`POST /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks` → **201**

```json
{
  "command_id": "5302fabc-02b4-43fa-b726-da1c39d066e9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "3b110b93-614c-40a4-8658-c583d7d9abf5",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:49:32.475424Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks` → **201**

```json
{
  "command_id": "5302fabc-02b4-43fa-b726-da1c39d066e9",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "3b110b93-614c-40a4-8658-c583d7d9abf5",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:49:32.475424Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/d45a6ef4-8e7c-4964-b62e-e9528922ae0b` → **200**

```json
{
  "client": {
    "id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
    "phone": "+380738726332",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:49:24.386359Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:49:26.033143Z",
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

`GET /api/admin/v1/clients/d45a6ef4-8e7c-4964-b62e-e9528922ae0b` → **200**

```json
{
  "client": {
    "id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
    "phone": "+380738726332",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:49:24.386359Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:49:26.033143Z",
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

`POST /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks/3b110b93-614c-40a4-8658-c583d7d9abf5/resolve` → **200**

```json
{
  "command_id": "15647ad6-6ebb-44db-8aa4-3708c3253fa5",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "3b110b93-614c-40a4-8658-c583d7d9abf5",
  "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T15:49:32.475424Z",
  "resolved_at": "2026-10-29T15:49:34.330035Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/d45a6ef4-8e7c-4964-b62e-e9528922ae0b` → **200**

```json
{
  "client": {
    "id": "d45a6ef4-8e7c-4964-b62e-e9528922ae0b",
    "phone": "+380738726332",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:49:24.386359Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:49:26.033143Z",
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

`POST /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks/3b110b93-614c-40a4-8658-c583d7d9abf5/resolve` → **409**

```json
{
  "command_id": "46721b3a-ec13-4d4f-a386-9611712d946b",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks/3b110b93-614c-40a4-8658-c583d7d9abf5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "36566dd7-3251-48bd-be23-8c02f8565088"
}
```

`GET /api/admin/v1/orders/a0598f26-b1c3-4273-8d51-e66a0711ce7b/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "3b110b93-614c-40a4-8658-c583d7d9abf5",
      "order_id": "a0598f26-b1c3-4273-8d51-e66a0711ce7b",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T15:49:32.475424Z",
      "resolved_at": "2026-10-29T15:49:34.330035Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order a0598f26-b1c3-4273-8d51-e66a0711ce7b without phone or card digits; chargeback 3b110b93-614c-40a4-8658-c583d7d9abf5 recorded and won.

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
  "session_id": "a011ffd3-d4d9-4882-ac59-5bb860364194",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4NzUsImlhdCI6MTc5MzI4ODk3NSwianRpIjoiZmNkMmY4YjMtOGEyYi00NjA4LTk5YjMtODdlZDI4OWI0ZTNlIiwic2lkIjoiYTAxMWZmZDMtZDRkOS00ODgyLWFjNTktNWJiODYwMzY0MTk0In0.OWK4F45joR3OXSxhVY79rDRMVfHcmkRbJ4q8MuzWaZ0",
  "access_expires_at": "2026-10-29T16:04:35.549100456Z",
  "refresh_token": "9WD7xlVoRGZjr8c8pINTPGJM-PZgnRENfhScM3I4Wr8",
  "refresh_expires_at": "2026-10-30T03:49:35.548707165Z",
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
  "phone": "+48600868418",
  "device_ref": "sandbox-2703"
}
```

```json
{
  "challenge_id": "9d3c8976-4e8c-48f8-9cd3-9252aac5c577",
  "expires_at": "2026-10-29T15:54:36.133208881Z",
  "resend_available_at": "2026-10-29T15:49:37.133208881Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600868418` → **200**

```json
{
  "phone": "+48600868418",
  "audience": "CLIENT",
  "code": "666480",
  "sent_at": "2026-10-29T15:49:36.135180377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d3c8976-4e8c-48f8-9cd3-9252aac5c577",
  "code": "666480",
  "device_ref": "sandbox-2703"
}
```

```json
{
  "session_id": "63b2d169-eb19-449e-81ef-7b48fe0862c7",
  "subject": {
    "type": "CLIENT",
    "id": "69ec37a7-e30b-440b-aa95-23fe00f59779"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWVjMzdhNy1lMzBiLTQ0MGItYWE5NS0yM2ZlMDBmNTk3NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODc2LCJpYXQiOjE3OTMyODg5NzYsImp0aSI6ImE5Y2I1NTYyLTFiMzUtNDNiMS05YWQ4LTc1MjllZjgwZGJiNiIsInNpZCI6IjYzYjJkMTY5LWViMTktNDQ5ZS04MWVmLTdiNDhmZTA4NjJjNyJ9.JZr6alNQAPaXw3-TCRNRRrSyvErhyatgFa6B-9IuPdU",
  "access_expires_at": "2026-10-29T16:04:36.353441761Z",
  "refresh_token": "ZLhDjgOTz7D0rQP030MvqwhWEF0ul1VSEtop4njIJnQ",
  "refresh_expires_at": "2026-11-28T15:49:36.353071715Z",
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
  "command_id": "d94bc796-7f03-4e0f-9081-0ca9cea4ebfc",
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
  "correlation_id": "98785969-c7cf-4f2f-b876-1a38da7db5a1",
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
  "command_id": "c471616d-f0c5-49d4-a0bc-6cda8ff8a28c",
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
  "paused_at": "2026-10-29T15:49:37.159225237Z",
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
  "command_id": "eeb94087-17ec-42ae-b60b-a4aae299ff59",
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
  "id": "4a77e3de-8d95-49d2-8509-ff38eebb7b39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:37.548232Z",
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
  "command_id": "3333b77a-0685-484c-8d61-0c54397b9e99",
  "quote_id": "4a77e3de-8d95-49d2-8509-ff38eebb7b39",
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
  "correlation_id": "19e7b8e1-0ef3-429d-a411-7024276395c2"
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
  "paused_at": "2026-10-29T15:49:37.159225Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "f2aaf055-d310-40c1-94b7-36ba032e25f0",
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
  "command_id": "fcae0ba0-227d-45bb-94f8-be3ddfd6661c",
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
  "command_id": "3926cc8c-4c24-49dc-b620-6c6c7e4238a9",
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
  "id": "4482d6ca-bc58-4728-a64a-828a1f056800",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:38.752302Z",
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
  "command_id": "109abe82-20e4-4b57-9751-bd8c840bcca8",
  "quote_id": "4482d6ca-bc58-4728-a64a-828a1f056800",
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
  "correlation_id": "a85501ce-4316-49f3-bd33-dd5d9dd29b40"
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
  "command_id": "b9b503bb-2d23-4a19-815c-43d7c2d375b0",
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
  "command_id": "b4cff59e-53ea-4d4f-bcc0-808825d5f023",
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
  "id": "bac1ff1a-1a89-4370-923e-00d96bfc24f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:39.515233Z",
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
  "command_id": "a6afcd65-1e65-44dd-b51f-e4b9762da118",
  "quote_id": "bac1ff1a-1a89-4370-923e-00d96bfc24f3",
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
  "correlation_id": "45649ed2-8cdb-4c85-a79f-315a3a5274cb"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "cda5a73b-25cb-4268-bf87-7a03196e7f7a",
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
  "correlation_id": "533ea581-be76-490e-bb59-74d78672fcbb"
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
  "command_id": "a58dd3cc-6b56-4657-b604-ebda1363e20d",
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
  "phone": "+380673091990",
  "device_ref": "sandbox-23017"
}
```

```json
{
  "challenge_id": "38d6187d-afd3-4995-8187-4edad0de9df9",
  "expires_at": "2026-10-29T15:54:40.532554724Z",
  "resend_available_at": "2026-10-29T15:49:41.532554724Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673091990` → **200**

```json
{
  "phone": "+380673091990",
  "audience": "CLIENT",
  "code": "273603",
  "sent_at": "2026-10-29T15:49:40.534522733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38d6187d-afd3-4995-8187-4edad0de9df9",
  "code": "273603",
  "device_ref": "sandbox-23017"
}
```

```json
{
  "session_id": "daf9f6c3-6c64-43bb-bf12-c2d37cb35834",
  "subject": {
    "type": "CLIENT",
    "id": "aae6ded5-08b2-4e8e-8ab3-2cd41337ac42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWU2ZGVkNS0wOGIyLTRlOGUtOGFiMy0yY2Q0MTMzN2FjNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODgwLCJpYXQiOjE3OTMyODg5ODAsImp0aSI6Ijg3MzEyY2QwLWZlNjQtNGI4MC1hNWI5LWQ4Y2Y3NTVhMWU0NSIsInNpZCI6ImRhZjlmNmMzLTZjNjQtNDNiYi1iZjEyLWMyZDM3Y2IzNTgzNCJ9.WLeuCfP-qfJwjdCLL2nHsa1-3Tw1_dJ-LhiLBvZ_qaQ",
  "access_expires_at": "2026-10-29T16:04:40.734943951Z",
  "refresh_token": "VoSAdBXjKAOfBRX4ySZ9HXUCEAGnHa_zAS3OgHLcM68",
  "refresh_expires_at": "2026-11-28T15:49:40.734532419Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "aae6ded5-08b2-4e8e-8ab3-2cd41337ac42",
  "session_id": "daf9f6c3-6c64-43bb-bf12-c2d37cb35834",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "069c93ba-f843-4962-a872-42a09c8a6f45",
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
  "id": "59681c1a-874f-4c23-a773-5a4aceb5d935",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:41.095822Z",
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
  "challenge_id": "48ccde68-b3ce-4e3f-bfa1-92c96b135442",
  "expires_at": "2026-10-29T15:54:43.287706019Z",
  "resend_available_at": "2026-10-29T15:49:44.287706019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673091990` → **200**

```json
{
  "phone": "+380673091990",
  "audience": "CLIENT",
  "code": "372400",
  "sent_at": "2026-10-29T15:49:43.289334063Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8352cfbe-48ad-4204-943f-76bc79436d43",
  "challenge_id": "48ccde68-b3ce-4e3f-bfa1-92c96b135442",
  "otp_code": "372400"
}
```

```json
{
  "client_id": "aae6ded5-08b2-4e8e-8ab3-2cd41337ac42",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T15:49:43.505573199Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "69c62d25-6961-4fe3-81ba-a22c4a9121b5",
  "quote_id": "59681c1a-874f-4c23-a773-5a4aceb5d935",
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
  "correlation_id": "3142c968-09a9-4e19-9452-c08248e18f32"
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
  "session_id": "70a2e459-5c92-4319-bb8a-84359f8d0680",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4ODQsImlhdCI6MTc5MzI4ODk4NCwianRpIjoiOGFmZGEzYTgtY2M5My00YzYyLTkxOTUtNmRiNzFkZmRjYjU4Iiwic2lkIjoiNzBhMmU0NTktNWM5Mi00MzE5LWJiOGEtODQzNTlmOGQwNjgwIn0.ZY8aK56kvkWmE3v98aVOjXTB5XjfvfqPvyO0g-VEshI",
  "access_expires_at": "2026-10-29T16:04:44.088255488Z",
  "refresh_token": "5LjwG0IAW4HsSUM_Dgox6cIv7983mF87PPCaFZIS_50",
  "refresh_expires_at": "2026-10-30T03:49:44.087814506Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "aae6ded5-08b2-4e8e-8ab3-2cd41337ac42",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T15:49:43.505573Z",
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

`POST /api/admin/v1/client-deletions/aae6ded5-08b2-4e8e-8ab3-2cd41337ac42/complete` → **200**

```json
{
  "command_id": "dba91278-07a3-4dcf-be8d-1527934d460e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "aae6ded5-08b2-4e8e-8ab3-2cd41337ac42",
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
  "correlation_id": "421cd6b8-adc0-4e33-b092-7bee58bc56f2"
}
```

Done: client aae6ded5-08b2-4e8e-8ab3-2cd41337ac42 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666400372",
  "device_ref": "sandbox-20589"
}
```

```json
{
  "challenge_id": "937c5052-a231-4bad-a2a9-b19f229fe762",
  "expires_at": "2026-10-29T15:54:44.914435474Z",
  "resend_available_at": "2026-10-29T15:49:45.914435474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666400372` → **200**

```json
{
  "phone": "+380666400372",
  "audience": "CLIENT",
  "code": "886428",
  "sent_at": "2026-10-29T15:49:44.916412138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "937c5052-a231-4bad-a2a9-b19f229fe762",
  "code": "886428",
  "device_ref": "sandbox-20589"
}
```

```json
{
  "session_id": "498a410d-7553-4ced-872f-f316acf5fec1",
  "subject": {
    "type": "CLIENT",
    "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzI5MmMxZS1iZjhjLTQ5YTAtOTk1Yi1iMTA1M2E1MGE4ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODg1LCJpYXQiOjE3OTMyODg5ODUsImp0aSI6IjAwNzY0M2EzLTY5ZmItNDk2Mi05NzE2LWFiYjg3ZjkwNjM0ZiIsInNpZCI6IjQ5OGE0MTBkLTc1NTMtNGNlZC04NzJmLWYzMTZhY2Y1ZmVjMSJ9.UKBVvRd16WI6_Rt6iBjKJ2YfvjAPirKSQIH1gUp2NSE",
  "access_expires_at": "2026-10-29T16:04:45.126177182Z",
  "refresh_token": "7ll7bWqzlcDeIx8FYi6BFIylYsqIeWppeUG_WdfqlOc",
  "refresh_expires_at": "2026-11-28T15:49:45.125805358Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
  "session_id": "498a410d-7553-4ced-872f-f316acf5fec1",
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
  "session_id": "10dc8441-8bc8-43ec-80c1-f383e601f0a0",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4ODUsImlhdCI6MTc5MzI4ODk4NSwianRpIjoiZThkNWZmZmEtOTdhMy00YmUxLWIzYzctYTU3MTFmMzYzYmQwIiwic2lkIjoiMTBkYzg0NDEtOGJjOC00M2VjLTgwYzEtZjM4M2U2MDFmMGEwIn0.1ejiMBjUA3JSW3MFIgyP3gQriZACDzyPi85aI7m1wcQ",
  "access_expires_at": "2026-10-29T16:04:45.739075226Z",
  "refresh_token": "CHm6xVpxLpQC0XJ1iaBUTP4xC-OmiPWGGF7T9xmmc-E",
  "refresh_expires_at": "2026-10-30T03:49:45.738699937Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6400372&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
      "phone": "+380666400372",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T15:49:45.124245Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c3292c1e-bf8c-49a0-995b-b1053a50a8f9` → **200**

```json
{
  "client": {
    "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
    "phone": "+380666400372",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:49:45.124245Z",
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

`POST /api/admin/v1/clients/c3292c1e-bf8c-49a0-995b-b1053a50a8f9/block` → **400**

```json
{
  "command_id": "7622188a-0e76-451e-965e-9b8bee30e988",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c3292c1e-bf8c-49a0-995b-b1053a50a8f9/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "23f0af1c-ccdd-4119-9743-d547c91f41d8",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c3292c1e-bf8c-49a0-995b-b1053a50a8f9/block` → **200**

```json
{
  "command_id": "2705e89f-a3a2-45ff-8f14-e3c8a395efeb",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
  "phone": "+380666400372",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T15:49:45.124245Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T15:49:46.532516Z",
    "by": "44a8bdd3-4006-4464-8afd-15d552435eab"
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
  "correlation_id": "4528fdd2-4275-4271-a2d4-714f026115a5"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666400372",
  "device_ref": "sandbox-16636"
}
```

```json
{
  "challenge_id": "4c191274-c11a-40b4-bd1b-015231309a21",
  "expires_at": "2026-10-29T15:54:48.94879475Z",
  "resend_available_at": "2026-10-29T15:49:49.94879475Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666400372` → **200**

```json
{
  "phone": "+380666400372",
  "audience": "CLIENT",
  "code": "199450",
  "sent_at": "2026-10-29T15:49:48.950686434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "4c191274-c11a-40b4-bd1b-015231309a21",
  "code": "199450",
  "device_ref": "sandbox-16636"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "07f55857-13d2-479e-b07f-0c8a3e015b99"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c3292c1e-bf8c-49a0-995b-b1053a50a8f9` → **200**

```json
{
  "client": {
    "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
    "phone": "+380666400372",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T15:49:45.124245Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T15:49:46.532516Z",
      "by": "44a8bdd3-4006-4464-8afd-15d552435eab"
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

`POST /api/admin/v1/clients/c3292c1e-bf8c-49a0-995b-b1053a50a8f9/unblock` → **200**

```json
{
  "command_id": "c79e7c3f-2b97-41fa-984f-0ec60f52c359",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
  "phone": "+380666400372",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T15:49:45.124245Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666400372",
  "device_ref": "sandbox-21707"
}
```

```json
{
  "challenge_id": "89c82258-4272-4173-a4db-30826b124e5a",
  "expires_at": "2026-10-29T15:54:51.818217494Z",
  "resend_available_at": "2026-10-29T15:49:52.818217494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666400372` → **200**

```json
{
  "phone": "+380666400372",
  "audience": "CLIENT",
  "code": "086204",
  "sent_at": "2026-10-29T15:49:51.819949845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89c82258-4272-4173-a4db-30826b124e5a",
  "code": "086204",
  "device_ref": "sandbox-21707"
}
```

```json
{
  "session_id": "4b66849c-ca9b-4261-a476-493fee80dcbf",
  "subject": {
    "type": "CLIENT",
    "id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzI5MmMxZS1iZjhjLTQ5YTAtOTk1Yi1iMTA1M2E1MGE4ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODkyLCJpYXQiOjE3OTMyODg5OTIsImp0aSI6IjFiYTJmZWRiLTgzMDAtNDNmZC05NzA5LTM4NzY3YTdiODljMyIsInNpZCI6IjRiNjY4NDljLWNhOWItNDI2MS1hNDc2LTQ5M2ZlZTgwZGNiZiJ9.feoCEpYBbV4MglQ_Y4nZXwXmpAeVp2VV7mvvCIxVqPE",
  "access_expires_at": "2026-10-29T16:04:52.023746092Z",
  "refresh_token": "Ovqn6W9fH525hNdavOloiI3gxiBf8TIijaAlWjzya2Y",
  "refresh_expires_at": "2026-11-28T15:49:52.023413924Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c3292c1e-bf8c-49a0-995b-b1053a50a8f9",
  "session_id": "4b66849c-ca9b-4261-a476-493fee80dcbf",
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
  "phone": "+380665516172",
  "device_ref": "sandbox-27373"
}
```

```json
{
  "challenge_id": "0d51068e-c897-415d-8d58-b520db3a3c16",
  "expires_at": "2026-10-29T15:54:52.398467074Z",
  "resend_available_at": "2026-10-29T15:49:53.398467074Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665516172` → **200**

```json
{
  "phone": "+380665516172",
  "audience": "CLIENT",
  "code": "984916",
  "sent_at": "2026-10-29T15:49:52.400447066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d51068e-c897-415d-8d58-b520db3a3c16",
  "code": "984916",
  "device_ref": "sandbox-27373"
}
```

```json
{
  "session_id": "98d4c4b0-513e-4e5c-bd4a-2774c7f9da56",
  "subject": {
    "type": "CLIENT",
    "id": "9ddd6cdd-b09f-4659-b30a-82f0da71674a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGRkNmNkZC1iMDlmLTQ2NTktYjMwYS04MmYwZGE3MTY3NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODkyLCJpYXQiOjE3OTMyODg5OTIsImp0aSI6IjBjOTFkMzgzLWU2Y2EtNDZlYS1iYzdjLWM4MmRkOWY1NWYxMSIsInNpZCI6Ijk4ZDRjNGIwLTUxM2UtNGU1Yy1iZDRhLTI3NzRjN2Y5ZGE1NiJ9.6egIuVznCGDfLajTJn758gBQLkA0VJvzRuFM_9VEa-0",
  "access_expires_at": "2026-10-29T16:04:52.614191477Z",
  "refresh_token": "rUVwnNILWuhAF0-UGklUP9o5-kGi3lim0nvvtzLUw8s",
  "refresh_expires_at": "2026-11-28T15:49:52.613525612Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5fa9fdf4-4dea-4453-ab87-26add40fa878",
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
  "id": "8050dda3-b4f9-4410-b9b3-6541cb5ddd62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:54:52.802697Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: c40a5162-5e23-47b0-8212-bf839c0ea860) → **201**

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
  "session_id": "85e601b5-5f33-4aff-8720-f2d308c3bd3c",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4OTMsImlhdCI6MTc5MzI4ODk5MywianRpIjoiZGVkNDU5ZTItMDAyNy00N2E1LThjNGItZjZmMmEwNjkyNDc5Iiwic2lkIjoiODVlNjAxYjUtNWYzMy00YWZmLTg3MjAtZjJkMzA4YzNiZDNjIn0.Ynyan2EyqBewm2tm1iGrzgEz24rF20q2beHBtauTglA",
  "access_expires_at": "2026-10-29T16:04:53.229052844Z",
  "refresh_token": "gdR64slEi9J5VuRzZInvyFSG7kdktfyp3FBH0VZh9vc",
  "refresh_expires_at": "2026-10-30T03:49:53.22867624Z",
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
  "session_id": "5156c12c-6b84-4c5c-9d6d-a13153843e80",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk4OTMsImlhdCI6MTc5MzI4ODk5MywianRpIjoiYWEyYmE0YjEtM2RjNy00N2VhLWI0NzctYTNjOTMyMzY0NDY5Iiwic2lkIjoiNTE1NmMxMmMtNmI4NC00YzVjLTlkNmQtYTEzMTUzODQzZTgwIn0.sWaxCI4oHV-I6kwjVrkvbcPArYRHhsY-UmNxtWf-p9o",
  "access_expires_at": "2026-10-29T16:04:53.625406972Z",
  "refresh_token": "6UVIEvhdvtzA1L3Lb9eA1NIwJwLNWVNNzvN-VR3EMI0",
  "refresh_expires_at": "2026-10-30T03:49:53.624991976Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9be5cf76-04a7-46f6-a216-9d63bc56ba2b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:49:52.995703Z",
      "actor": {
        "type": "CLIENT",
        "id": "9ddd6cdd-b09f-4659-b30a-82f0da71674a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
        "quote_id": "8050dda3-b4f9-4410-b9b3-6541cb5ddd62",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c40a5162-5e23-47b0-8212-bf839c0ea860"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:49:52.997364Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
        "attempt_id": "b76501f3-6642-4570-b710-1780fb141b8c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c40a5162-5e23-47b0-8212-bf839c0ea860"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T15:49:53.002109Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
        "attempt_id": "b76501f3-6642-4570-b710-1780fb141b8c"
      },
      "correlation_id": "c40a5162-5e23-47b0-8212-bf839c0ea860"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "b76501f3-6642-4570-b710-1780fb141b8c",
        "generation": 1,
        "started_at": "2026-10-29T15:49:52.996673Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T15:49:53.002109Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T15:49:52.997841Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/c40a5162-5e23-47b0-8212-bf839c0ea860` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b:0",
      "order_id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
      "at": "2026-10-29T15:49:52.995703Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b:1",
      "order_id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
      "at": "2026-10-29T15:49:52.997364Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b:2",
      "order_id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
      "at": "2026-10-29T15:49:53.002109Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/f48fb036-3df3-491f-8909-f271cd1a6909` → **200**

```json
{
  "found": []
}
```

Done: request c40a5162-5e23-47b0-8212-bf839c0ea860 — order 9be5cf76-04a7-46f6-a216-9d63bc56ba2b found by its id.

`GET /api/rider/v1/orders/9be5cf76-04a7-46f6-a216-9d63bc56ba2b` → **200**

```json
{
  "id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ddd6cdd-b09f-4659-b30a-82f0da71674a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:49:52.995271Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9be5cf76-04a7-46f6-a216-9d63bc56ba2b/cancel` → **200**

```json
{
  "command_id": "8163e7c4-d300-4113-8ab5-a66d5d681918",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9be5cf76-04a7-46f6-a216-9d63bc56ba2b",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9ddd6cdd-b09f-4659-b30a-82f0da71674a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:49:52.995271Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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
  "phone": "+380638902514",
  "device_ref": "sandbox-14705"
}
```

```json
{
  "challenge_id": "e1cce061-1a13-41ca-89dc-f1a7e00b0327",
  "expires_at": "2026-10-29T15:54:54.77380959Z",
  "resend_available_at": "2026-10-29T15:49:55.77380959Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638902514` → **200**

```json
{
  "phone": "+380638902514",
  "audience": "CLIENT",
  "code": "491963",
  "sent_at": "2026-10-29T15:49:54.776559418Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1cce061-1a13-41ca-89dc-f1a7e00b0327",
  "code": "491963",
  "device_ref": "sandbox-14705"
}
```

```json
{
  "session_id": "8fe1b68f-e2aa-4dcb-a696-86d3b617400f",
  "subject": {
    "type": "CLIENT",
    "id": "10809e2d-c12d-41a2-9b03-0800d561f3bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDgwOWUyZC1jMTJkLTQxYTItOWIwMy0wODAwZDU2MWYzYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5ODk0LCJpYXQiOjE3OTMyODg5OTQsImp0aSI6ImQxZjNkNzU3LWFjMTAtNGFiNi04YmRhLTQ1MTE2NDA2MTI2ZCIsInNpZCI6IjhmZTFiNjhmLWUyYWEtNGRjYi1hNjk2LTg2ZDNiNjE3NDAwZiJ9.74uttUMai3N5yvnNqnsf9xX8XvTV2aeoIHKW67sKXG8",
  "access_expires_at": "2026-10-29T16:04:54.986318022Z",
  "refresh_token": "uDL4Vc_4HXcRC3ydiW5ZuQGyCYQ8z1MQUXruAFdUmHM",
  "refresh_expires_at": "2026-11-28T15:49:54.98600311Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "869d995f-0b9c-4ede-be84-384f02d253cd",
  "expires_at": "2026-10-29T15:54:57.171412485Z",
  "resend_available_at": "2026-10-29T15:49:58.171412485Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638902514` → **200**

```json
{
  "phone": "+380638902514",
  "audience": "CLIENT",
  "code": "288146",
  "sent_at": "2026-10-29T15:49:57.172944031Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "97f8d543-5003-4e6a-9e06-a0ced6916dc6",
  "challenge_id": "869d995f-0b9c-4ede-be84-384f02d253cd",
  "otp_code": "288146"
}
```

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "PENDING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "PENDING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "PENDING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "PENDING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "PENDING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "PENDING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "RUNNING",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07` → **200**

```json
{
  "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
  "state": "READY",
  "created_at": "2026-10-29T15:49:57.378087Z",
  "ready_at": "2026-10-29T15:50:03.479105Z",
  "expires_at": "2026-11-05T15:50:03.479105Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637601192",
  "device_ref": "sandbox-26617"
}
```

```json
{
  "challenge_id": "fa77019d-fe52-4c16-87f3-3983a568f61a",
  "expires_at": "2026-10-29T15:55:04.83253254Z",
  "resend_available_at": "2026-10-29T15:50:05.83253254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637601192` → **200**

```json
{
  "phone": "+380637601192",
  "audience": "CLIENT",
  "code": "912797",
  "sent_at": "2026-10-29T15:50:04.834462345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa77019d-fe52-4c16-87f3-3983a568f61a",
  "code": "912797",
  "device_ref": "sandbox-26617"
}
```

```json
{
  "session_id": "086a6fa9-f64e-436a-8d87-43c4020097a8",
  "subject": {
    "type": "CLIENT",
    "id": "409b2c0c-4101-4aad-b214-38553c00f50a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDliMmMwYy00MTAxLTRhYWQtYjIxNC0zODU1M2MwMGY1MGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTA1LCJpYXQiOjE3OTMyODkwMDUsImp0aSI6ImI2M2FlYTkyLWY5YTMtNDlhYy05MmI2LTRlYzM1YjA2Y2UwMiIsInNpZCI6IjA4NmE2ZmE5LWY2NGUtNDM2YS04ZDg3LTQzYzQwMjAwOTdhOCJ9.NbyBdtexl5JN6Mx6fEpiNR2LH5Uug0c9C2guEgWme2g",
  "access_expires_at": "2026-10-29T16:05:05.031438705Z",
  "refresh_token": "bacq7CwvwxsIuFZ-dhOHNutEScbMsXjv6uOUbvkEfT0",
  "refresh_expires_at": "2026-11-28T15:50:05.031064978Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a63b7185-c81e-419b-8ab8-48c7c6702d07/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bef2862c-19b7-4d7a-8099-0001ece8df81"
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
  "session_id": "6318c1bc-1efd-4133-b94d-aa0aabb97c43",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MDUsImlhdCI6MTc5MzI4OTAwNSwianRpIjoiZjU1YzE0MGYtNWNjMi00ZmNhLWI5NWEtZmI3Y2ViYjM3ZGYyIiwic2lkIjoiNjMxOGMxYmMtMWVmZC00MTMzLWI5NGQtYWEwYWFiYjk3YzQzIn0.sHbEo7tj-duaQEsw5MPKxMmaKljGqeH7o1tfPW01GpA",
  "access_expires_at": "2026-10-29T16:05:05.59774243Z",
  "refresh_token": "Sv0GbIQdfWFrCdrx3qUYvoXyPB_mXlz5oCx0iWWItPc",
  "refresh_expires_at": "2026-10-30T03:50:05.597418844Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "10809e2d-c12d-41a2-9b03-0800d561f3bc",
  "session_id": "8fe1b68f-e2aa-4dcb-a696-86d3b617400f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/10809e2d-c12d-41a2-9b03-0800d561f3bc/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a63b7185-c81e-419b-8ab8-48c7c6702d07",
      "state": "READY",
      "created_at": "2026-10-29T15:49:57.378087Z",
      "ready_at": "2026-10-29T15:50:03.479105Z",
      "expires_at": "2026-11-05T15:50:03.479105Z",
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
  "device_ref": "sandbox-11777"
}
```

```json
{
  "challenge_id": "fea50efe-aecf-4f99-8ea0-babd6bf4400c",
  "expires_at": "2026-10-29T15:55:06.15782822Z",
  "resend_available_at": "2026-10-29T15:50:07.15782822Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "292053",
  "sent_at": "2026-10-29T15:50:06.160032078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fea50efe-aecf-4f99-8ea0-babd6bf4400c",
  "code": "292053",
  "device_ref": "sandbox-11777"
}
```

```json
{
  "session_id": "3ce0eaa5-7a43-4eb1-98bf-2e310c5e10fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkwNiwiaWF0IjoxNzkzMjg5MDA2LCJqdGkiOiI2YjBlN2ZiYS0zNzQ1LTQyYzYtOGI4NC1kMWI0MjYwNTVhODEiLCJzaWQiOiIzY2UwZWFhNS03YTQzLTRlYjEtOThiZi0yZTMxMGM1ZTEwZmQifQ.6BEvuRhQDFQQgC8FIDF1eo0zoNh8JkGd7LTXW0tD-yU",
  "access_expires_at": "2026-10-29T16:05:06.394102521Z",
  "refresh_token": "afjhEpO_HmvWgCl-TTHA17rzVPYmSwTzIDwNg5vMp28",
  "refresh_expires_at": "2026-11-28T15:50:06.393745105Z",
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
  "device_ref": "sandbox-26475"
}
```

```json
{
  "challenge_id": "d8a8aaa8-0bc0-405f-a361-f9ddc4b2faf9",
  "expires_at": "2026-10-29T15:55:06.777836267Z",
  "resend_available_at": "2026-10-29T15:50:07.777836267Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "545303",
  "sent_at": "2026-10-29T15:50:06.779735738Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8a8aaa8-0bc0-405f-a361-f9ddc4b2faf9",
  "code": "545303",
  "device_ref": "sandbox-26475"
}
```

```json
{
  "session_id": "80b3be1c-04c1-48d9-9ebd-334c6046da33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkwNiwiaWF0IjoxNzkzMjg5MDA2LCJqdGkiOiJkOTBkOWFiMy02OTcwLTRhZTMtODQ1ZC03MzIxZDA4M2I0NTQiLCJzaWQiOiI4MGIzYmUxYy0wNGMxLTQ4ZDktOWViZC0zMzRjNjA0NmRhMzMifQ.-u6LPCnFo_AJ7KEfjvm0HZtBouVoZRxzuAW6bfmmg90",
  "access_expires_at": "2026-10-29T16:05:06.983006182Z",
  "refresh_token": "94N68P01C70VpNmJ2SB7JyAVcrY60PUPaU7OgFQqAK8",
  "refresh_expires_at": "2026-11-28T15:50:06.982558881Z",
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
  "command_id": "60eea34b-7421-426e-9022-1ea8ab360790",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:07Z",
    "sequence": 1793289007337
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f3e44fa-5caf-46b5-bce3-6d997d6bffe9",
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
  "last_heartbeat_at": "2026-10-29T15:50:07.353077Z",
  "last_location_at": "2026-10-29T15:50:07.353077Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9332"
}
```

```json
{
  "challenge_id": "40f330a7-b481-408c-a4d7-f66d06183ff5",
  "expires_at": "2026-10-29T15:55:07.537250901Z",
  "resend_available_at": "2026-10-29T15:50:08.537250901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "004299",
  "sent_at": "2026-10-29T15:50:07.539140818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40f330a7-b481-408c-a4d7-f66d06183ff5",
  "code": "004299",
  "device_ref": "sandbox-9332"
}
```

```json
{
  "session_id": "de6dbd7f-52d0-4321-bf56-93ab59d29b45",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkwNywiaWF0IjoxNzkzMjg5MDA3LCJqdGkiOiI4ZjU1NjA5Mi0wNjMwLTRmMmYtODM4Mi05M2I3ZTFiNjk4MjkiLCJzaWQiOiJkZTZkYmQ3Zi01MmQwLTQzMjEtYmY1Ni05M2FiNTlkMjliNDUifQ.TafDf7X5HEqnlQkMtx1MVNAAE98q_raTMDT3ZMOPP7E",
  "access_expires_at": "2026-10-29T16:05:07.741354265Z",
  "refresh_token": "cWYZ4LnAycU2PfOU0NH92Vgizs0urKukqriZ9CTuErU",
  "refresh_expires_at": "2026-11-28T15:50:07.740936248Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4a1a604e-79ea-4f05-bb96-92e2aaf31eff",
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
  "last_heartbeat_at": "2026-10-29T15:48:54.630446Z",
  "last_location_at": "2026-10-29T15:48:54.630446Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4a1a604e-79ea-4f05-bb96-92e2aaf31eff/handover` → **200**

```json
{
  "command_id": "99470100-7c3f-40b5-8ad3-0e5e6f1f20ae",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4a1a604e-79ea-4f05-bb96-92e2aaf31eff",
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
  "last_heartbeat_at": "2026-10-29T15:48:54.630446Z",
  "last_location_at": "2026-10-29T15:48:54.630446Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4a1a604e-79ea-4f05-bb96-92e2aaf31eff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:08Z",
    "sequence": 1793289008301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4a1a604e-79ea-4f05-bb96-92e2aaf31eff",
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
  "last_heartbeat_at": "2026-10-29T15:50:08.317511Z",
  "last_location_at": "2026-10-29T15:50:08.317511Z",
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
  "session_id": "bc245ff1-2226-40b9-95cf-4a5b68c7e871",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MDgsImlhdCI6MTc5MzI4OTAwOCwianRpIjoiNmE2NWMwM2YtMjY2ZC00MjlkLTg5NmUtNmU1YzlmMTNjYjNjIiwic2lkIjoiYmMyNDVmZjEtMjIyNi00MGI5LTk1Y2YtNGE1YjY4YzdlODcxIn0.AF5eL76_d6hoaXTbOKUeLpqWAeJzC_IizTVD7-UOToI",
  "access_expires_at": "2026-10-29T16:05:08.703431225Z",
  "refresh_token": "or8-W-CV4ORLeiFQyg00_HyD_JkXy-jrePCzYbVpFS8",
  "refresh_expires_at": "2026-10-30T03:50:08.703020274Z",
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
  "session_id": "0d40d7a5-cd80-4d70-8db6-d78f4336b44d",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MDksImlhdCI6MTc5MzI4OTAwOSwianRpIjoiMzNhZWU0OWUtN2E3YS00MmI1LWEzMGQtMDdlMDk3NDJjMzQ1Iiwic2lkIjoiMGQ0MGQ3YTUtY2Q4MC00ZDcwLThkYjYtZDc4ZjQzMzZiNDRkIn0.z67e-f8X6fhxcUNJC3sVYDrOoe4V-L1KreufzCCxNLs",
  "access_expires_at": "2026-10-29T16:05:09.094650427Z",
  "refresh_token": "fTBP693cQlkhZ_WsBbJ56gFKtZLh-kwCkxG7TOCdg-Y",
  "refresh_expires_at": "2026-10-30T03:50:09.094279992Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688526824",
  "device_ref": "sandbox-12375"
}
```

```json
{
  "challenge_id": "b5054102-c2e5-4b90-9629-5fcdb54223e7",
  "expires_at": "2026-10-29T15:55:09.282183497Z",
  "resend_available_at": "2026-10-29T15:50:10.282183497Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688526824` → **200**

```json
{
  "phone": "+380688526824",
  "audience": "CLIENT",
  "code": "393936",
  "sent_at": "2026-10-29T15:50:09.284233374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5054102-c2e5-4b90-9629-5fcdb54223e7",
  "code": "393936",
  "device_ref": "sandbox-12375"
}
```

```json
{
  "session_id": "950d5410-95ff-41cb-9243-2349aa29690b",
  "subject": {
    "type": "CLIENT",
    "id": "db0005f1-94d1-44f5-8fda-3df513c9fcf6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjAwMDVmMS05NGQxLTQ0ZjUtOGZkYS0zZGY1MTNjOWZjZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTA5LCJpYXQiOjE3OTMyODkwMDksImp0aSI6ImRkMjNmOWFiLWRhZjctNGJlMS1iY2YwLTRiOWU4YzJkNTBkMiIsInNpZCI6Ijk1MGQ1NDEwLTk1ZmYtNDFjYi05MjQzLTIzNDlhYTI5NjkwYiJ9.FnQBSDJa7U3NGNx4abe77P6SpyqWDDM96vGIkE46vjw",
  "access_expires_at": "2026-10-29T16:05:09.490484491Z",
  "refresh_token": "1xBiHnoayRle6-viAt0PglgZfR2tBDDUnVAxISVwg3s",
  "refresh_expires_at": "2026-11-28T15:50:09.490162889Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d654fae3-3d91-4606-bb45-24f62429ea73",
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
  "id": "712f2b22-6eb3-4d50-a150-f7fda57452db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:09.672172Z",
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
  "command_id": "e46ed77d-293d-44ba-9f41-784f164b7704",
  "quote_id": "712f2b22-6eb3-4d50-a150-f7fda57452db",
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
  "id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db0005f1-94d1-44f5-8fda-3df513c9fcf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:09.862244Z",
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
    "id": "57550f17-9063-4183-95ed-0dde940b05bb",
    "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
    "expires_at": "2026-10-29T15:50:24.864537Z",
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

`POST /api/driver/v1/offers/57550f17-9063-4183-95ed-0dde940b05bb/reject` → **204**

```json
{
  "command_id": "277349be-ca78-4c6a-9eb1-4c8d012088a4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9b7ab574-9521-402d-af7f-6c194be80be4",
    "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
    "expires_at": "2026-10-29T15:50:25.261541Z",
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

`POST /api/driver/v1/offers/9b7ab574-9521-402d-af7f-6c194be80be4/accept` → **200**

```json
{
  "command_id": "1158f740-5d23-4a1a-b67e-ca6ed5f09f9a"
}
```

```json
{
  "id": "3da2364a-dd1a-44fd-963c-8f67bc24088f",
  "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "43bb59e3-cd52-44fe-baf4-061f17448c3f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/115b501c-f551-4a89-865e-fd5ce363d3fe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:50:09.862612Z",
      "actor": {
        "type": "CLIENT",
        "id": "db0005f1-94d1-44f5-8fda-3df513c9fcf6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
        "quote_id": "712f2b22-6eb3-4d50-a150-f7fda57452db",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9fa24238-5215-42ee-ac37-a2e179fa5354"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:50:09.863993Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
        "attempt_id": "4dfe62c0-5c1b-47eb-a92a-2f5b58df04cf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9fa24238-5215-42ee-ac37-a2e179fa5354"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:50:09.866086Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "57550f17-9063-4183-95ed-0dde940b05bb",
        "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9fa24238-5215-42ee-ac37-a2e179fa5354"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T15:50:10.26091Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "57550f17-9063-4183-95ed-0dde940b05bb",
        "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe"
      },
      "correlation_id": "04bf700f-16c0-43f3-a36f-85c3391f6309"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 115b501c-f551-4a89-865e-fd5ce363d3fe — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/115b501c-f551-4a89-865e-fd5ce363d3fe` → **200**

```json
{
  "id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "db0005f1-94d1-44f5-8fda-3df513c9fcf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3da2364a-dd1a-44fd-963c-8f67bc24088f",
    "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "43bb59e3-cd52-44fe-baf4-061f17448c3f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:50:09.862244Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/115b501c-f551-4a89-865e-fd5ce363d3fe/cancel` → **200**

```json
{
  "command_id": "91702520-a745-4763-b32c-35bf0c03e492",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "db0005f1-94d1-44f5-8fda-3df513c9fcf6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3da2364a-dd1a-44fd-963c-8f67bc24088f",
    "order_id": "115b501c-f551-4a89-865e-fd5ce363d3fe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "43bb59e3-cd52-44fe-baf4-061f17448c3f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:50:09.862244Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
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
  "session_id": "1f3e44fa-5caf-46b5-bce3-6d997d6bffe9",
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
  "last_heartbeat_at": "2026-10-29T15:50:07.353077Z",
  "last_location_at": "2026-10-29T15:50:07.353077Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f3e44fa-5caf-46b5-bce3-6d997d6bffe9/close` → **200**

```json
{
  "command_id": "564cb9c0-4aa1-42b4-8295-46fd576b2542",
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
  "session_id": "4a1a604e-79ea-4f05-bb96-92e2aaf31eff",
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
  "last_heartbeat_at": "2026-10-29T15:50:08.317511Z",
  "last_location_at": "2026-10-29T15:50:08.317511Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a1a604e-79ea-4f05-bb96-92e2aaf31eff/close` → **200**

```json
{
  "command_id": "8be25a26-8cc7-499f-9afe-da5790c6764e",
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
  "session_id": "b3f58786-70b3-4876-aaf6-78f778528897",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MTIsImlhdCI6MTc5MzI4OTAxMiwianRpIjoiZTJjMjNlNzQtMjc4OC00MGJkLTlhN2MtOWE1YWYxYzA0NmJiIiwic2lkIjoiYjNmNTg3ODYtNzBiMy00ODc2LWFhZjYtNzhmNzc4NTI4ODk3In0.XRZ-wXzBUmdSj4OX47D_fQUW4zYGIb2nDo2naeZsg_0",
  "access_expires_at": "2026-10-29T16:05:12.25028724Z",
  "refresh_token": "vujo_d37T8p_6el3BH_akPAEnc4rV8jn8u7JS05LLIw",
  "refresh_expires_at": "2026-10-30T03:50:12.249946619Z",
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
  "command_id": "26468678-696d-4424-9f83-f95817194bab",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T15:50:12.632687Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "935e17da-d90e-4838-ad55-6df78b27054e",
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
  "correlation_id": "2abc386e-8c6c-40f5-bb22-87838bc93f5a"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "3f23de6e-7f4a-46b1-b59f-e3cc2bbd7f45",
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
  "correlation_id": "b7c6b28b-e3ab-4c49-aec5-834272d098dd"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639463899",
  "device_ref": "sandbox-22797"
}
```

```json
{
  "challenge_id": "56f463d1-8a33-488c-b800-753cbdee1d8e",
  "expires_at": "2026-10-29T15:55:13.195429866Z",
  "resend_available_at": "2026-10-29T15:50:14.195429866Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639463899` → **200**

```json
{
  "phone": "+380639463899",
  "audience": "CLIENT",
  "code": "024598",
  "sent_at": "2026-10-29T15:50:13.197363755Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56f463d1-8a33-488c-b800-753cbdee1d8e",
  "code": "024598",
  "device_ref": "sandbox-22797"
}
```

```json
{
  "session_id": "8502ad6f-0659-4ded-9eb3-3268dcfb1900",
  "subject": {
    "type": "CLIENT",
    "id": "b0d3b87d-af40-4ec9-a1dd-5477a224954d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGQzYjg3ZC1hZjQwLTRlYzktYTFkZC01NDc3YTIyNDk1NGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTEzLCJpYXQiOjE3OTMyODkwMTMsImp0aSI6IjBiNzUwMWQyLTQ0ZjQtNDAwNC04MzczLWJjNjM3YWJlNzJkOSIsInNpZCI6Ijg1MDJhZDZmLTA2NTktNGRlZC05ZWIzLTMyNjhkY2ZiMTkwMCJ9.ObQ7jZBG8Yv62gBv9IjqRs0WViERdDHBVFNbG4NZep4",
  "access_expires_at": "2026-10-29T16:05:13.405394794Z",
  "refresh_token": "rqU3J42V-8wqkd0g_NR1oTbCnjL6m2jjSUeTAhlP50M",
  "refresh_expires_at": "2026-11-28T15:50:13.405033812Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca7df363-6b77-435d-8ba2-f02f7b93cf27",
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
  "id": "15bb995b-35e2-48b1-a947-9fb5e9a70247",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:13.596400Z",
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
  "command_id": "ec4575d7-7979-495a-88e2-9a533e13d1e7",
  "quote_id": "15bb995b-35e2-48b1-a947-9fb5e9a70247",
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
  "correlation_id": "13cce106-9fa4-4f97-8c5f-206dc8b07227"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "484c9442-1d64-4441-9916-b1703be0e243",
  "quote_id": "15bb995b-35e2-48b1-a947-9fb5e9a70247",
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
  "id": "34f156ae-47d0-47b8-ab04-f076b4ccf436",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0d3b87d-af40-4ec9-a1dd-5477a224954d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:50:13.970704Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/34f156ae-47d0-47b8-ab04-f076b4ccf436/cancel` → **200**

```json
{
  "command_id": "2f7e44b5-f641-4437-a0c8-2e83e3e0d212",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "34f156ae-47d0-47b8-ab04-f076b4ccf436",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b0d3b87d-af40-4ec9-a1dd-5477a224954d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:13.970704Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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
  "command_id": "542cc39a-19ab-4051-8a01-ae758da5c233",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T15:50:14.36981Z"
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
      "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T15:50:14.36981Z"
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
  "device_ref": "sandbox-269"
}
```

```json
{
  "challenge_id": "e641d859-ac8f-4c83-b079-e0cdd46b0c89",
  "expires_at": "2026-10-29T15:55:14.933171908Z",
  "resend_available_at": "2026-10-29T15:50:15.933171908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "799435",
  "sent_at": "2026-10-29T15:50:14.935314874Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e641d859-ac8f-4c83-b079-e0cdd46b0c89",
  "code": "799435",
  "device_ref": "sandbox-269"
}
```

```json
{
  "session_id": "96630619-7557-43c7-bcc8-1802a3a51b60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkxNSwiaWF0IjoxNzkzMjg5MDE1LCJqdGkiOiJjNGYwM2YyZC02YTk2LTQ5N2YtYjlhYS1kNmFhMWVlZjE0NDkiLCJzaWQiOiI5NjYzMDYxOS03NTU3LTQzYzctYmNjOC0xODAyYTNhNTFiNjAifQ.uaQQWrLE8ZazytPC1bqXNQvmKV7HkPSpUr0JIlEim4s",
  "access_expires_at": "2026-10-29T16:05:15.153272014Z",
  "refresh_token": "5P7AArSmJMhf6qFil_8tPmVYuujpKvMu1_FNb_T4vBM",
  "refresh_expires_at": "2026-11-28T15:50:15.15282985Z",
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
  "command_id": "6edf191e-5ae7-41bd-8639-c5bc2e5d5987",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:15Z",
    "sequence": 1793289015546
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:15.562712Z",
  "last_location_at": "2026-10-29T15:50:15.562712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679403831",
  "device_ref": "sandbox-28388"
}
```

```json
{
  "challenge_id": "bbe2f84a-c530-468f-8f61-9a6d6fd43797",
  "expires_at": "2026-10-29T15:55:15.778328008Z",
  "resend_available_at": "2026-10-29T15:50:16.778328008Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679403831` → **200**

```json
{
  "phone": "+380679403831",
  "audience": "CLIENT",
  "code": "097499",
  "sent_at": "2026-10-29T15:50:15.780570534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbe2f84a-c530-468f-8f61-9a6d6fd43797",
  "code": "097499",
  "device_ref": "sandbox-28388"
}
```

```json
{
  "session_id": "df5693d2-4880-4f0c-a70f-511c7be96d0d",
  "subject": {
    "type": "CLIENT",
    "id": "40f8b1ca-f071-437b-bb0f-73dea6287139"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGY4YjFjYS1mMDcxLTQzN2ItYmIwZi03M2RlYTYyODcxMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTE1LCJpYXQiOjE3OTMyODkwMTUsImp0aSI6IjEwODc0YWQ2LWM1YTctNGQ5MS1iMGFkLTYxMjM5YmFmM2JlNiIsInNpZCI6ImRmNTY5M2QyLTQ4ODAtNGYwYy1hNzBmLTUxMWM3YmU5NmQwZCJ9.i1ig6jVGNvkT3-_GolYRNxr8ePOI4jpgInlDlviXQ7E",
  "access_expires_at": "2026-10-29T16:05:15.997504033Z",
  "refresh_token": "2Pddhh-Hv-NHsZ6tJcNYBaAp1F34_6S9kIh3UG5caqc",
  "refresh_expires_at": "2026-11-28T15:50:15.997117783Z",
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
  "command_id": "e3f4058a-dbb5-4e00-aed5-cc88039e9350",
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
  "id": "4633b2d9-05a2-42cc-bcac-0ba4009a3f29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:16.372604Z",
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
  "command_id": "8efaf947-c9f3-4086-a8cf-00435b349cd1",
  "platform": "ANDROID",
  "token": "sandbox-driver-0f216eff-b38f-4da0-9d17-ed9746a242cd"
}
```

```json
{
  "id": "1af870ee-49fe-4e57-9bfc-72660048e4b4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:50:16.59518Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b8fc7fb3-e822-4a8c-aa95-75c886b776b1",
  "platform": "ANDROID",
  "token": "sandbox-rider-0c42e239-ebdd-40df-8f6a-771f844b5c31"
}
```

```json
{
  "id": "b934738e-e3b3-4d21-8c5b-5ca92c482ef1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:50:16.7831Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "14aede94-6f14-4d77-a0bb-b5cbc48b3a85",
  "quote_id": "4633b2d9-05a2-42cc-bcac-0ba4009a3f29",
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
  "id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40f8b1ca-f071-437b-bb0f-73dea6287139",
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
  "created_at": "2026-10-29T15:50:16.979453Z",
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
    "id": "1fb5d7cc-62f4-4d42-9727-7971a11cb2fa",
    "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
    "expires_at": "2026-10-29T15:50:31.981432Z",
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

`POST /api/driver/v1/offers/1fb5d7cc-62f4-4d42-9727-7971a11cb2fa/accept` → **200**

```json
{
  "command_id": "e6978477-d45e-4989-bb8a-0c7bf42cbfae"
}
```

```json
{
  "id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e37d69b1-d4ea-4712-b444-a8e257598364",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:50:16.960Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:50:16.960Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:50:17.830023424Z",
    "token_suffix": "a242cd",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "b747c382-bfba-4b5b-a0b4-d46e09c42a8e",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679403831&after=2026-10-29T15:50:16.960Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:50:17.828093763Z",
    "token_suffix": "4b5c31",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "b73b3074-a47a-4c58-8182-74db73c9ed6d",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5657cd26-be0a-4993-9ea2-4ecc7362d480/messages` → **201**

```json
{
  "command_id": "804efc5a-a96f-4dd9-9ab8-cb384f8dcd93",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "15916644-d094-42a3-b423-5c0ffd0b1926",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T15:50:18.616386012Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e37d69b1-d4ea-4712-b444-a8e257598364",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "assignment_id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
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

`POST /api/driver/v1/trips/e37d69b1-d4ea-4712-b444-a8e257598364/messages` → **201**

```json
{
  "command_id": "11084918-2e3d-4e31-bd2d-76bbfb5fcbc7",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "584133b5-e7b3-470e-92f6-fc7361930148",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T15:50:18.981121196Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5657cd26-be0a-4993-9ea2-4ecc7362d480/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/e37d69b1-d4ea-4712-b444-a8e257598364/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679403831"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:19Z",
    "sequence": 1793289019570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:19.585729Z",
  "last_location_at": "2026-10-29T15:50:19.585729Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e37d69b1-d4ea-4712-b444-a8e257598364",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "assignment_id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
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

`POST /api/driver/v1/trips/e37d69b1-d4ea-4712-b444-a8e257598364/arrive` → **200**

```json
{
  "command_id": "8807522d-a9ee-42c9-a988-2b8aaac4a4a2",
  "expected_version": 0
}
```

```json
{
  "id": "e37d69b1-d4ea-4712-b444-a8e257598364",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "assignment_id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
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
  "arrived_at": "2026-10-29T15:50:19.948419Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e37d69b1-d4ea-4712-b444-a8e257598364/start` → **200**

```json
{
  "command_id": "3bd9df58-8747-4cc9-a621-9d6ef13d3801",
  "expected_version": 1
}
```

```json
{
  "id": "e37d69b1-d4ea-4712-b444-a8e257598364",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "assignment_id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
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
  "arrived_at": "2026-10-29T15:50:19.948419Z",
  "started_at": "2026-10-29T15:50:20.143676Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:20Z",
    "sequence": 1793289020331
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:20.347864Z",
  "last_location_at": "2026-10-29T15:50:20.347864Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/e37d69b1-d4ea-4712-b444-a8e257598364/complete` → **200**

```json
{
  "command_id": "b444cd7e-cda0-4556-aae3-7c3bac11aaa4",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:20Z",
  "cash_received": true
}
```

```json
{
  "id": "e37d69b1-d4ea-4712-b444-a8e257598364",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "assignment_id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
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
  "arrived_at": "2026-10-29T15:50:19.948419Z",
  "started_at": "2026-10-29T15:50:20.143676Z",
  "completed_at": "2026-10-29T15:50:20.541868Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5657cd26-be0a-4993-9ea2-4ecc7362d480` → **200**

```json
{
  "id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "40f8b1ca-f071-437b-bb0f-73dea6287139",
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
    "id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7",
    "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e37d69b1-d4ea-4712-b444-a8e257598364",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:50:16.979453Z",
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
    "id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:50:16.979453Z",
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
    "id": "e37d69b1-d4ea-4712-b444-a8e257598364",
    "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
    "order_short_number": 13,
    "created_at": "2026-10-29T15:50:17.359194Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f68afe88-1139-4002-b18b-9681c41fad7c",
    "order_id": "8d563102-c0cf-4148-8f2e-e1ebcc167480",
    "order_short_number": 8,
    "created_at": "2026-10-29T15:49:21.027335Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "dddbc753-b95c-4162-b840-9caa84d20878",
    "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
    "order_short_number": 3,
    "created_at": "2026-10-29T15:48:46.571373Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2575ebaa-e3fb-49e6-8cff-6c14d0362e0c",
    "order_id": "439031d4-83a5-44b8-8cdb-0d7a5b6705d8",
    "order_short_number": 2,
    "created_at": "2026-10-29T15:48:32.519356Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f8de14b0-1861-4a5c-b6e9-6dba9eb81fad",
    "order_id": "97bbd5d4-841a-4b55-9b3e-5e38357c3ff7",
    "order_short_number": 1,
    "created_at": "2026-10-29T15:48:25.582557Z",
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

`GET /api/rider/v1/orders/5657cd26-be0a-4993-9ea2-4ecc7362d480/tip` → **200**

```json
{
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
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
  "available_until": "2026-10-30T15:50:20.541868Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5657cd26-be0a-4993-9ea2-4ecc7362d480/tip` → **201**

```json
{
  "command_id": "5637c0ae-1478-4513-8b12-abd39131e25c",
  "amount_minor": 1100
}
```

```json
{
  "id": "cdb7671a-efb8-4824-83ca-17c815ef178e",
  "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T15:50:24.8667Z"
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
  "session_id": "474caf7d-d5b1-4bab-a9ac-69ec447e1f28",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MjUsImlhdCI6MTc5MzI4OTAyNSwianRpIjoiZjJmNWM5OWMtMWEyZC00Nzk1LTljYTctZWVjYTQ1ZDFkZmIwIiwic2lkIjoiNDc0Y2FmN2QtZDViMS00YmFiLWE5YWMtNjllYzQ0N2UxZjI4In0.OMvvKOAe6ZMDk6rg0ef8_q4a0dXLKqGBr04-1jWsfDI",
  "access_expires_at": "2026-10-29T16:05:25.255865829Z",
  "refresh_token": "UZO0WlPRBoNBugqaG6GFvpIwL2XM_n7gJVv_aiXAHtw",
  "refresh_expires_at": "2026-10-30T03:50:25.255527412Z",
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
          "PHONE": 1,
          "APP": 12
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 2
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 3
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
      "STAFF": 1,
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
  "generated_at": "2026-10-29T15:50:25.453822459Z"
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
  "generated_at": "2026-10-29T15:50:25.645052439Z"
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
  "session_id": "96384025-a9fe-48e2-9591-788866679ef9",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MjYsImlhdCI6MTc5MzI4OTAyNiwianRpIjoiNGIxODdlMjUtMGQ1Yi00NzZiLWJjNzItNWRlZDQ0NGFhNzRmIiwic2lkIjoiOTYzODQwMjUtYTlmZS00OGUyLTk1OTEtNzg4ODY2Njc5ZWY5In0.AwKdgOkJofJpRbFY7bFefqKw73hM_GQYHgdE9FuYPU4",
  "access_expires_at": "2026-10-29T16:05:26.034936163Z",
  "refresh_token": "NzYmzUbRxITUD12RlCU_qZW4pCDbt1EtAwFOU3MKgDU",
  "refresh_expires_at": "2026-10-30T03:50:26.034462292Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5657cd26-be0a-4993-9ea2-4ecc7362d480/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:50:16.97978Z",
      "actor": {
        "type": "CLIENT",
        "id": "40f8b1ca-f071-437b-bb0f-73dea6287139",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
        "quote_id": "4633b2d9-05a2-42cc-bcac-0ba4009a3f29",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "be0a88f9-68be-4907-9150-641a722003cc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:50:16.980958Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
        "attempt_id": "8b80227b-a254-4634-8d51-ca4476b0c04e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "be0a88f9-68be-4907-9150-641a722003cc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:50:16.98269Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1fb5d7cc-62f4-4d42-9727-7971a11cb2fa",
        "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "be0a88f9-68be-4907-9150-641a722003cc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:50:17.360132Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1fb5d7cc-62f4-4d42-9727-7971a11cb2fa",
        "order_id": "5657cd26-be0a-4993-9ea2-4ecc7362d480",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5c1794d8-4b6e-4f00-bd6b-dfbd103ae7f7"
      },
      "correlation_id": "a298684a-b4f3-43f2-a7b9-7ecc32978020"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T15:50:26.406707459Z",
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
      "last_location_at": "2026-10-29T15:50:20.347864Z",
      "order_id": null
    }
  ]
}
```

Done: order 5657cd26-be0a-4993-9ea2-4ecc7362d480.

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
  "session_id": "5653f2d5-3204-4790-adfb-46f6313beaff",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MjYsImlhdCI6MTc5MzI4OTAyNiwianRpIjoiNzQ1ZjFlZGQtZWQ5Yy00YWJiLTk4ZjctY2QzMzRlNjcxNGIwIiwic2lkIjoiNTY1M2YyZDUtMzIwNC00NzkwLWFkZmItNDZmNjMxM2JlYWZmIn0.NwWkzh5Dh6OQsIPhBPKKUHvKqkpi6DkphcKgTHmG5C0",
  "access_expires_at": "2026-10-29T16:05:26.811446002Z",
  "refresh_token": "j1dTSFMZNovOCnsnAlWF-Sl5YCrcpNSvGKfieLI1B0M",
  "refresh_expires_at": "2026-10-30T03:50:26.811103459Z",
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
  "command_id": "eeba363e-a95e-46e5-b7f0-d8f66e6f1ec2",
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
  "timestamp": "2026-10-29T15:50:27.000+0000",
  "channel": {
    "id": "1730052000.212210522",
    "linkedid": "1730052000.212210522",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676933017"
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
  "timestamp": "2026-10-29T15:50:27.000+0000",
  "channel": {
    "id": "1730052000.212210522",
    "linkedid": "1730052000.212210522",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676933017"
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
  "session_id": "bdfda04d-2c2c-40ea-a88d-5f85a34951cd",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MjcsImlhdCI6MTc5MzI4OTAyNywianRpIjoiNTAyYTEwYWQtOTNmZi00MWUyLWJkZDMtMjU0NDkxNTI1YTdkIiwic2lkIjoiYmRmZGEwNGQtMmMyYy00MGVhLWE4OGQtNWY4NWEzNDk1MWNkIn0.FAeSNzHs-GBvwzm583DH_AS-X9NHtJmU4lcMEX15Y0c",
  "access_expires_at": "2026-10-29T16:05:27.600416713Z",
  "refresh_token": "qXZ4joWKqzOIz0gP2DUPWBqLBDbQ6SqQZLLXs32V91k",
  "refresh_expires_at": "2026-10-30T03:50:27.600090854Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "c5ec8388-2102-45de-bef5-47a05020f32c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676933017",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:50:27Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/c5ec8388-2102-45de-bef5-47a05020f32c/answer` → **200**

```json
{
  "command_id": "1fba31e4-142e-4c6f-997c-981a6693834a"
}
```

```json
{
  "id": "c5ec8388-2102-45de-bef5-47a05020f32c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676933017",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "order_ids": [],
  "started_at": "2026-10-29T15:50:27Z",
  "answered_at": "2026-10-29T15:50:27.983424Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.212210522",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "59860eea-3d62-4ae8-8956-30009ce46410",
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
  "id": "a4e9a64b-08b1-41ae-9e12-b625f490260c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:28.206431Z",
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
  "command_id": "ff009a66-66e2-4ac7-b4e8-d68502276e7d",
  "quote_id": "a4e9a64b-08b1-41ae-9e12-b625f490260c",
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
    "phone": "+380676933017"
  },
  "call_id": "c5ec8388-2102-45de-bef5-47a05020f32c"
}
```

```json
{
  "id": "5ed7484a-10e1-45ec-88cc-a5c155db64e2",
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
  "created_at": "2026-10-29T15:50:28.411769Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676933017"
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
    "id": "1730052000.212210522",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c5ec8388-2102-45de-bef5-47a05020f32c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676933017",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [
        "5ed7484a-10e1-45ec-88cc-a5c155db64e2"
      ],
      "started_at": "2026-10-29T15:50:27Z",
      "answered_at": "2026-10-29T15:50:27.983424Z",
      "ended_at": "2026-10-29T15:50:28.635354Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "8f909588-a55d-49f2-8d23-03609c55f98b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675169994",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [],
      "started_at": "2026-10-29T15:48:39.142088Z",
      "answered_at": "2026-10-29T15:48:39.382524Z",
      "ended_at": "2026-10-29T15:48:39.601936Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:48:43.451579Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5ed7484a-10e1-45ec-88cc-a5c155db64e2` → **200**

```json
{
  "id": "5ed7484a-10e1-45ec-88cc-a5c155db64e2",
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
  "created_at": "2026-10-29T15:50:28.411769Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676933017"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5ed7484a-10e1-45ec-88cc-a5c155db64e2` → **200**

```json
{
  "id": "5ed7484a-10e1-45ec-88cc-a5c155db64e2",
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
  "created_at": "2026-10-29T15:50:28.411769Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676933017"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5ed7484a-10e1-45ec-88cc-a5c155db64e2/cancel` → **200**

```json
{
  "command_id": "8f826025-9d1b-4d21-b912-4bfeb56abc1d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5ed7484a-10e1-45ec-88cc-a5c155db64e2",
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
  "created_at": "2026-10-29T15:50:28.411769Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676933017"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call c5ec8388-2102-45de-bef5-47a05020f32c with order 5ed7484a-10e1-45ec-88cc-a5c155db64e2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1030"
}
```

```json
{
  "challenge_id": "af236e47-ae6b-44e5-9d2e-113744371bc8",
  "expires_at": "2026-10-29T15:55:29.446370488Z",
  "resend_available_at": "2026-10-29T15:50:30.446370488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "913456",
  "sent_at": "2026-10-29T15:50:29.448333752Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af236e47-ae6b-44e5-9d2e-113744371bc8",
  "code": "913456",
  "device_ref": "sandbox-1030"
}
```

```json
{
  "session_id": "a354cf35-6e80-4caf-a2ca-6736dc80410d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkyOSwiaWF0IjoxNzkzMjg5MDI5LCJqdGkiOiIwMTQ5NDZiZi1jZjY4LTRjY2EtOGFmYy02MzQ4ZDlmNDE2MDciLCJzaWQiOiJhMzU0Y2YzNS02ZTgwLTRjYWYtYTJjYS02NzM2ZGM4MDQxMGQifQ.y2QOj8NZn93R7Sag_1a_ED8qAs4HLtMV1O-RwR87mp8",
  "access_expires_at": "2026-10-29T16:05:29.659970919Z",
  "refresh_token": "PhAm-MrZoB3KLtQarNr_BOsN6kA97Q5gsHngwoBHqmI",
  "refresh_expires_at": "2026-11-28T15:50:29.659557328Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:20.347864Z",
  "last_location_at": "2026-10-29T15:50:20.347864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/handover` → **200**

```json
{
  "command_id": "ef18a35a-3a5b-4fe4-a5f8-f2fabfd345a0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:20.347864Z",
  "last_location_at": "2026-10-29T15:50:20.347864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:30Z",
    "sequence": 1793289030276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:30.294174Z",
  "last_location_at": "2026-10-29T15:50:30.294174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666439128",
  "device_ref": "sandbox-17787"
}
```

```json
{
  "challenge_id": "93e61591-5058-40ae-b236-0002b92f3196",
  "expires_at": "2026-10-29T15:55:30.478761912Z",
  "resend_available_at": "2026-10-29T15:50:31.478761912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666439128` → **200**

```json
{
  "phone": "+380666439128",
  "audience": "CLIENT",
  "code": "550940",
  "sent_at": "2026-10-29T15:50:30.480621912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93e61591-5058-40ae-b236-0002b92f3196",
  "code": "550940",
  "device_ref": "sandbox-17787"
}
```

```json
{
  "session_id": "9dfbf6b6-ebc6-41c6-b849-30935efa413c",
  "subject": {
    "type": "CLIENT",
    "id": "4030b795-1e67-463f-8507-2c86ae28617c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDMwYjc5NS0xZTY3LTQ2M2YtODUwNy0yYzg2YWUyODYxN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTMwLCJpYXQiOjE3OTMyODkwMzAsImp0aSI6IjQzYzUzODI5LTFkNjYtNGE5ZS05YTQxLTZjZTAzMmUwNmE3OSIsInNpZCI6IjlkZmJmNmI2LWViYzYtNDFjNi1iODQ5LTMwOTM1ZWZhNDEzYyJ9.ekHF-d3OmdIMggquwR_AH88-c5DgfwbHdToiDTq8HpA",
  "access_expires_at": "2026-10-29T16:05:30.694334312Z",
  "refresh_token": "4LAdsb42LT9wUWHWqEJ1BE8Zp2Uws6cJmH64c3H6DIU",
  "refresh_expires_at": "2026-11-28T15:50:30.693859606Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efcaf78b-de58-4880-b720-41ddf178068a",
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
  "id": "a5350f23-ab55-4603-98d0-65404c17ff3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:30.886Z",
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
  "command_id": "add4e75d-235b-4bc9-8a33-ad79d7efc45d",
  "quote_id": "a5350f23-ab55-4603-98d0-65404c17ff3a",
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
  "id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4030b795-1e67-463f-8507-2c86ae28617c",
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
  "created_at": "2026-10-29T15:50:31.08535Z",
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
    "id": "9d4ff606-0ad2-427b-ba7a-60f383a4c983",
    "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
    "expires_at": "2026-10-29T15:50:46.087559Z",
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

`POST /api/driver/v1/offers/9d4ff606-0ad2-427b-ba7a-60f383a4c983/accept` → **200**

```json
{
  "command_id": "c4b3013b-e856-4090-a44d-1e22126c7cd8"
}
```

```json
{
  "id": "1ed0207d-569c-4d58-a64b-112973649691",
  "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea32c491-3ab4-4fc9-8250-6bf1371b2b3f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea32c491-3ab4-4fc9-8250-6bf1371b2b3f",
  "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
  "assignment_id": "1ed0207d-569c-4d58-a64b-112973649691",
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

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:31Z",
    "sequence": 1793289031869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:31.885551Z",
  "last_location_at": "2026-10-29T15:50:31.885551Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea32c491-3ab4-4fc9-8250-6bf1371b2b3f/arrive` → **200**

```json
{
  "command_id": "aba83e6a-f4c2-4046-a841-e31dfb01816a",
  "expected_version": 0
}
```

```json
{
  "id": "ea32c491-3ab4-4fc9-8250-6bf1371b2b3f",
  "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
  "assignment_id": "1ed0207d-569c-4d58-a64b-112973649691",
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
  "arrived_at": "2026-10-29T15:50:32.078675Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ea32c491-3ab4-4fc9-8250-6bf1371b2b3f/start` → **200**

```json
{
  "command_id": "9fe9bbf1-0c91-48bf-8f96-acf602587ea1",
  "expected_version": 1
}
```

```json
{
  "id": "ea32c491-3ab4-4fc9-8250-6bf1371b2b3f",
  "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
  "assignment_id": "1ed0207d-569c-4d58-a64b-112973649691",
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
  "arrived_at": "2026-10-29T15:50:32.078675Z",
  "started_at": "2026-10-29T15:50:32.274379Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:32Z",
    "sequence": 1793289032466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:32.482069Z",
  "last_location_at": "2026-10-29T15:50:32.482069Z",
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
  "device_ref": "sandbox-22214"
}
```

```json
{
  "challenge_id": "a3452f49-cb88-47b7-accb-42b4582fc174",
  "expires_at": "2026-10-29T15:55:32.665152313Z",
  "resend_available_at": "2026-10-29T15:50:33.665152313Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "280296",
  "sent_at": "2026-10-29T15:50:32.667977546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3452f49-cb88-47b7-accb-42b4582fc174",
  "code": "280296",
  "device_ref": "sandbox-22214"
}
```

```json
{
  "session_id": "397c7d38-2b35-4e38-b30c-62a15008ad7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTkzMiwiaWF0IjoxNzkzMjg5MDMyLCJqdGkiOiIxODVhMTZlYS0wN2I0LTQ2YzAtOTZkNS05MmU4NTJiMTEyNTMiLCJzaWQiOiIzOTdjN2QzOC0yYjM1LTRlMzgtYjMwYy02MmExNTAwOGFkN2EifQ.iKHrWQvIOkFfKikAzeuIVLAZxw0MLyupEuFSC5oebvU",
  "access_expires_at": "2026-10-29T16:05:32.876067882Z",
  "refresh_token": "QsmgAwQrF0OUi3UzKjUbZe2DhYkqsXvUusvcPrT4PGI",
  "refresh_expires_at": "2026-11-28T15:50:32.87523683Z",
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
  "command_id": "6443d1c8-87e3-4436-a8c3-3ab97c85b598",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:33Z",
    "sequence": 1793289033235
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebc99934-5e68-4708-a3d8-5b1a5d09064e",
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
  "last_heartbeat_at": "2026-10-29T15:50:33.250989Z",
  "last_location_at": "2026-10-29T15:50:33.250989Z",
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
  "session_id": "4896522b-fb3a-451c-9523-9234f189c9ec",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MzMsImlhdCI6MTc5MzI4OTAzMywianRpIjoiYTIyNGU0NzctYTExMy00ZWQ4LTk0MGItNjI4YzJiMmNkYWQ0Iiwic2lkIjoiNDg5NjUyMmItZmIzYS00NTFjLTk1MjMtOTIzNGYxODljOWVjIn0.KWVBX3IuH9z0c2JmVwnaomjXP2phkV0xGHRm2d-fe9s",
  "access_expires_at": "2026-10-29T16:05:33.647624154Z",
  "refresh_token": "Kjz_9UHywJccXUHceG-LqtEtNw2bkdkoDZiWxsrrX1E",
  "refresh_expires_at": "2026-10-30T03:50:33.647164755Z",
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
  "session_id": "54b8f2a5-3cc3-4b51-94a8-10b6b9c7cb15",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5MzQsImlhdCI6MTc5MzI4OTAzNCwianRpIjoiOTMzOWE2YmEtZTU0MC00MzY3LWFhMjItNGEyM2Q0MGFjOTk3Iiwic2lkIjoiNTRiOGYyYTUtM2NjMy00YjUxLTk0YTgtMTBiNmI5YzdjYjE1In0.4mvDFf0aGMnHNArzDNCPBbw8UGwiGyTxZog937G8rhQ",
  "access_expires_at": "2026-10-29T16:05:34.025942684Z",
  "refresh_token": "MtBu9aserwhp9196MpOrCVHkK0Fp52Sod5pIvhrqYj4",
  "refresh_expires_at": "2026-10-30T03:50:34.025485158Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e8b3d02c-6034-4ca1-a364-bd73b2850c04` → **200**

```json
{
  "id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4030b795-1e67-463f-8507-2c86ae28617c",
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
    "id": "1ed0207d-569c-4d58-a64b-112973649691",
    "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ea32c491-3ab4-4fc9-8250-6bf1371b2b3f",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T15:50:31.08535Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e8b3d02c-6034-4ca1-a364-bd73b2850c04/interrupt` → **200**

```json
{
  "command_id": "4c691c8d-c459-42b1-aa6c-265d85c3b34c",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4030b795-1e67-463f-8507-2c86ae28617c",
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
      "id": "1ed0207d-569c-4d58-a64b-112973649691",
      "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "ea32c491-3ab4-4fc9-8250-6bf1371b2b3f",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T15:50:31.08535Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4030b795-1e67-463f-8507-2c86ae28617c",
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
    "id": "3ff9e432-42ed-420a-9c70-9ee6fef491f7",
    "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
    "expires_at": "2026-10-29T15:50:49.436615Z",
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

`POST /api/driver/v1/offers/3ff9e432-42ed-420a-9c70-9ee6fef491f7/accept` → **200**

```json
{
  "command_id": "3504b523-97c5-4267-8d8e-afd027362285"
}
```

```json
{
  "id": "739a7258-37fc-49e9-8408-1ff6bb770e2e",
  "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ecbe0c1c-6de7-48e6-9415-74f51f15b0f3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ecbe0c1c-6de7-48e6-9415-74f51f15b0f3",
  "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
  "assignment_id": "739a7258-37fc-49e9-8408-1ff6bb770e2e",
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
  "session_id": "ebc99934-5e68-4708-a3d8-5b1a5d09064e",
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
  "last_heartbeat_at": "2026-10-29T15:50:33.250989Z",
  "last_location_at": "2026-10-29T15:50:33.250989Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ebc99934-5e68-4708-a3d8-5b1a5d09064e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:35Z",
    "sequence": 1793289035451
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ebc99934-5e68-4708-a3d8-5b1a5d09064e",
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
  "last_heartbeat_at": "2026-10-29T15:50:35.46686Z",
  "last_location_at": "2026-10-29T15:50:35.46686Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ecbe0c1c-6de7-48e6-9415-74f51f15b0f3/arrive` → **200**

```json
{
  "command_id": "de111d1c-7614-4dff-9490-99318b46003b",
  "expected_version": 0
}
```

```json
{
  "id": "ecbe0c1c-6de7-48e6-9415-74f51f15b0f3",
  "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
  "assignment_id": "739a7258-37fc-49e9-8408-1ff6bb770e2e",
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
  "arrived_at": "2026-10-29T15:50:35.658746Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ecbe0c1c-6de7-48e6-9415-74f51f15b0f3/start` → **200**

```json
{
  "command_id": "8e12c021-be60-41b6-80da-3bbd09f63053",
  "expected_version": 1
}
```

```json
{
  "id": "ecbe0c1c-6de7-48e6-9415-74f51f15b0f3",
  "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
  "assignment_id": "739a7258-37fc-49e9-8408-1ff6bb770e2e",
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
  "arrived_at": "2026-10-29T15:50:35.658746Z",
  "started_at": "2026-10-29T15:50:35.876836Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ecbe0c1c-6de7-48e6-9415-74f51f15b0f3/complete` → **200**

```json
{
  "command_id": "22b71d4a-7dc8-4bb8-acaf-c0a07786166f",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:36Z"
}
```

```json
{
  "id": "ecbe0c1c-6de7-48e6-9415-74f51f15b0f3",
  "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
  "assignment_id": "739a7258-37fc-49e9-8408-1ff6bb770e2e",
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
  "arrived_at": "2026-10-29T15:50:35.658746Z",
  "started_at": "2026-10-29T15:50:35.876836Z",
  "completed_at": "2026-10-29T15:50:36.14497Z",
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
    "id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:50:34.427517Z",
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
    "id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:50:31.08535Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/e8b3d02c-6034-4ca1-a364-bd73b2850c04/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:50:31.085754Z",
      "actor": {
        "type": "CLIENT",
        "id": "4030b795-1e67-463f-8507-2c86ae28617c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
        "quote_id": "a5350f23-ab55-4603-98d0-65404c17ff3a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "76c6c187-79a8-4c17-9348-f41c6f72b7e7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:50:31.087082Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
        "attempt_id": "fd343170-8916-41c7-99a0-92dfe3bc4997",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "76c6c187-79a8-4c17-9348-f41c6f72b7e7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:50:31.088834Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9d4ff606-0ad2-427b-ba7a-60f383a4c983",
        "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "76c6c187-79a8-4c17-9348-f41c6f72b7e7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:50:31.496461Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9d4ff606-0ad2-427b-ba7a-60f383a4c983",
        "order_id": "e8b3d02c-6034-4ca1-a364-bd73b2850c04",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1ed0207d-569c-4d58-a64b-112973649691"
      },
      "correlation_id": "b86eeae0-be6f-4ad4-a6a9-813efa84a959"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef/tip` → **200**

```json
{
  "order_id": "11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef",
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
  "available_until": "2026-10-30T15:50:36.14497Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef/tip` → **409**

```json
{
  "command_id": "096f5db6-6559-4d03-9050-e2d8128cb791",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38f7e41b-ba1d-461a-b3c3-149f4814e07f"
}
```

Done: interrupted e8b3d02c-6034-4ca1-a364-bd73b2850c04, follow-up 11bb7fbc-9f2a-42b8-9f1e-b25fda6bb6ef.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "066c7dce-98a6-444c-aec5-589c4b28afba",
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
  "last_heartbeat_at": "2026-10-29T15:50:32.482069Z",
  "last_location_at": "2026-10-29T15:50:32.482069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/066c7dce-98a6-444c-aec5-589c4b28afba/close` → **200**

```json
{
  "command_id": "2c423d54-1dfc-4094-8679-983898aa1073",
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
  "session_id": "ebc99934-5e68-4708-a3d8-5b1a5d09064e",
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
  "last_heartbeat_at": "2026-10-29T15:50:35.46686Z",
  "last_location_at": "2026-10-29T15:50:35.46686Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ebc99934-5e68-4708-a3d8-5b1a5d09064e/close` → **200**

```json
{
  "command_id": "581690b8-219b-4372-af58-ab9c3c703b97",
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
  "session_id": "27f266bd-9eaa-45c7-958d-662077ad91c9",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NDEsImlhdCI6MTc5MzI4OTA0MSwianRpIjoiNjA3NzY0ZWYtMTkyYS00ZjJlLWE4ODAtNjY4ZTNmNWY0YzQzIiwic2lkIjoiMjdmMjY2YmQtOWVhYS00NWM3LTk1OGQtNjYyMDc3YWQ5MWM5In0.eisuO6BREwN4966G0adTBElXA6T5TQVqwvmvkV_aPVU",
  "access_expires_at": "2026-10-29T16:05:41.235425822Z",
  "refresh_token": "MtDTfPgNYOv6gmQRLI4n0HR9HvT8oFzssnRIm6L-yz4",
  "refresh_expires_at": "2026-10-30T03:50:41.234986162Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0abe0ff0-27b8-492a-87de-b015b68c0dd1",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:50:41Z"
}
```

```json
{
  "id": "8f628306-5439-4d25-b0bd-64215af4deb1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:50:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8f628306-5439-4d25-b0bd-64215af4deb1/publish` → **200**

```json
{
  "command_id": "87379190-3d7d-4bf5-94d4-36ba8003ec2c",
  "expected_version": 0
}
```

```json
{
  "id": "8f628306-5439-4d25-b0bd-64215af4deb1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:50:41.620988Z",
  "published_at": "2026-10-29T15:50:41.620988Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "8f628306-5439-4d25-b0bd-64215af4deb1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T15:50:41.620988Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638095433",
  "device_ref": "sandbox-22508"
}
```

```json
{
  "challenge_id": "76c26952-64c1-4c7b-bc43-0739282e99b6",
  "expires_at": "2026-10-29T15:55:41.987580436Z",
  "resend_available_at": "2026-10-29T15:50:42.987580436Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638095433` → **200**

```json
{
  "phone": "+380638095433",
  "audience": "CLIENT",
  "code": "013975",
  "sent_at": "2026-10-29T15:50:41.989875653Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76c26952-64c1-4c7b-bc43-0739282e99b6",
  "code": "013975",
  "device_ref": "sandbox-22508"
}
```

```json
{
  "session_id": "9c9524a8-6465-49ef-a689-b1955d29f8ab",
  "subject": {
    "type": "CLIENT",
    "id": "1105a152-8ae2-4d29-9d59-e54e659e976c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTA1YTE1Mi04YWUyLTRkMjktOWQ1OS1lNTRlNjU5ZTk3NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTQyLCJpYXQiOjE3OTMyODkwNDIsImp0aSI6ImU3ZDVjMGJmLTRmMGUtNGZiZi04NzUyLWFlOWVlM2Q4YmUwMCIsInNpZCI6IjljOTUyNGE4LTY0NjUtNDllZi1hNjg5LWIxOTU1ZDI5ZjhhYiJ9.SBtENojYTs6LRzZMIDjEXtp2zBpIyB05_he_ETU0Gww",
  "access_expires_at": "2026-10-29T16:05:42.194371546Z",
  "refresh_token": "_YkiEPCzBMayjiadNrIRQAOG-duuG04FyE884iI0n2w",
  "refresh_expires_at": "2026-11-28T15:50:42.19394783Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "8f628306-5439-4d25-b0bd-64215af4deb1",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T15:50:41.620988Z",
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
  "command_id": "4623193a-c0e6-4948-8591-f0f78b2fc6e9",
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
  "id": "4226b69a-edac-4a19-ba1f-4bdb6de7a84a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:42.561046Z",
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
  "command_id": "e6f0079b-6f9e-4eda-95d8-7ba47fd2ffb2",
  "quote_id": "4226b69a-edac-4a19-ba1f-4bdb6de7a84a",
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
  "correlation_id": "edc1fdc1-909e-423e-979e-b642fc7a3557"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "04044e5b-9d3c-4674-827f-8f4cd27027cd",
  "version_id": "8f628306-5439-4d25-b0bd-64215af4deb1",
  "language": "uk"
}
```

```json
{
  "version_id": "8f628306-5439-4d25-b0bd-64215af4deb1",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T15:50:42.945777Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3283d88-dccd-4b49-92a9-99951a9700f0",
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
  "id": "9548220a-6d24-4968-bc17-3d1f75e68f6d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:43.133199Z",
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
  "command_id": "c3a7121d-208f-4f32-a1aa-e0604ea484d1",
  "quote_id": "9548220a-6d24-4968-bc17-3d1f75e68f6d",
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
  "id": "edff1b09-a2ac-4444-b645-c308e8c03350",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1105a152-8ae2-4d29-9d59-e54e659e976c",
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
  "created_at": "2026-10-29T15:50:43.326609Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/edff1b09-a2ac-4444-b645-c308e8c03350` → **200**

```json
{
  "id": "edff1b09-a2ac-4444-b645-c308e8c03350",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1105a152-8ae2-4d29-9d59-e54e659e976c",
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
  "created_at": "2026-10-29T15:50:43.326609Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/edff1b09-a2ac-4444-b645-c308e8c03350/cancel` → **200**

```json
{
  "command_id": "1cae6625-8344-4a65-acee-6967658d9147",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "edff1b09-a2ac-4444-b645-c308e8c03350",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1105a152-8ae2-4d29-9d59-e54e659e976c",
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
  "created_at": "2026-10-29T15:50:43.326609Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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

`POST /api/admin/v1/legal-documents/8f628306-5439-4d25-b0bd-64215af4deb1` → **409**

```json
{
  "command_id": "4f95fd7f-bd32-4cf2-b0d7-75a6c2edad0b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:50:43Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/8f628306-5439-4d25-b0bd-64215af4deb1",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ab0a4a5b-7f30-4952-9b05-64538ef47e3c"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "21fbc0ad-d12f-46c8-8bd0-158ab3c1eec7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:50:44Z"
}
```

```json
{
  "id": "3f45c0f4-cb06-4b92-8879-251f38db6acb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:50:44Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3f45c0f4-cb06-4b92-8879-251f38db6acb/publish` → **200**

```json
{
  "command_id": "d2d72f90-6beb-4fe3-99ae-aeb0b01c41a7",
  "expected_version": 0
}
```

```json
{
  "id": "3f45c0f4-cb06-4b92-8879-251f38db6acb",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:50:44.331607Z",
  "published_at": "2026-10-29T15:50:44.331607Z",
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
  "device_ref": "sandbox-672"
}
```

```json
{
  "challenge_id": "e597f0bd-84ce-4ce8-9465-711818c0edf3",
  "expires_at": "2026-10-29T15:55:44.521515496Z",
  "resend_available_at": "2026-10-29T15:50:45.521515496Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "747968",
  "sent_at": "2026-10-29T15:50:44.523637788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e597f0bd-84ce-4ce8-9465-711818c0edf3",
  "code": "747968",
  "device_ref": "sandbox-672"
}
```

```json
{
  "session_id": "64c9afaa-ea5a-467f-883b-adf0fd493fc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk0NCwiaWF0IjoxNzkzMjg5MDQ0LCJqdGkiOiJlODJmNWY3ZS1kMmNkLTQ3MTctYTZhYi03NDYzY2YyMTEwYWEiLCJzaWQiOiI2NGM5YWZhYS1lYTVhLTQ2N2YtODgzYi1hZGYwZmQ0OTNmYzYifQ.o10BguUA8fimgQ9kt_b6L8kQF_zt2qMr0i3MnmJeMLg",
  "access_expires_at": "2026-10-29T16:05:44.729498042Z",
  "refresh_token": "bbw6oAzy4g864fX1hsyl_33qnUMGf0d2-9gWZGhJtxo",
  "refresh_expires_at": "2026-11-28T15:50:44.729045864Z",
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
  "command_id": "11afbf85-5cb7-4c59-a5de-1c14df025307",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:45Z",
    "sequence": 1793289045855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a6487cfd-8193-43f4-bbb6-a975d09e7bf6",
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
  "last_heartbeat_at": "2026-10-29T15:50:45.100989Z",
  "last_location_at": "2026-10-29T15:50:45.100989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670492996",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "challenge_id": "69d39b2f-d002-4ccd-ae05-091b00698da5",
  "expires_at": "2026-10-29T15:55:45.284432906Z",
  "resend_available_at": "2026-10-29T15:50:46.284432906Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670492996` → **200**

```json
{
  "phone": "+380670492996",
  "audience": "CLIENT",
  "code": "207788",
  "sent_at": "2026-10-29T15:50:45.286341193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69d39b2f-d002-4ccd-ae05-091b00698da5",
  "code": "207788",
  "device_ref": "sandbox-4906"
}
```

```json
{
  "session_id": "04422a2c-7267-426a-b15e-9cec12144e32",
  "subject": {
    "type": "CLIENT",
    "id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Yzg1MWFjYS01ZjliLTQyYWQtYTZlZi1lNjlhMzVhMjg1ZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTQ1LCJpYXQiOjE3OTMyODkwNDUsImp0aSI6IjQxY2ZhNzY5LTdmYTItNGI4Yy1iODMyLTdjOTY0NDhkZTliMiIsInNpZCI6IjA0NDIyYTJjLTcyNjctNDI2YS1iMTVlLTljZWMxMjE0NGUzMiJ9.B__BZRaSdWQPrp5x3jgBuWEM9_6r58phSJnbImGv_rk",
  "access_expires_at": "2026-10-29T16:05:45.494248606Z",
  "refresh_token": "5a2KQn_m0z0r4_8NZJbIDiBuQspLaR3Z-WiE_WDE2tI",
  "refresh_expires_at": "2026-11-28T15:50:45.49390747Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc90b046-7a3b-4f84-ae98-c661894de5cb",
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
  "id": "0b2df5a4-7218-4acc-aef8-6fc3a97bd225",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:45.683450Z",
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
  "command_id": "73ff305f-790c-40d4-bd08-a2c5139705e7",
  "quote_id": "0b2df5a4-7218-4acc-aef8-6fc3a97bd225",
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
    "phone": "+380678188404"
  }
}
```

```json
{
  "id": "611d6912-c87e-4d54-874d-47693a2b37f8",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:45.876347Z",
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
    "id": "36bf0253-c63e-47b0-8d0e-263f6aa0ea58",
    "order_id": "611d6912-c87e-4d54-874d-47693a2b37f8",
    "expires_at": "2026-10-29T15:51:00.878461Z",
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

`POST /api/driver/v1/offers/36bf0253-c63e-47b0-8d0e-263f6aa0ea58/accept` → **200**

```json
{
  "command_id": "5ce5ed34-f3f1-4db0-b43e-8cf0a540af74"
}
```

```json
{
  "id": "2f11b3a8-7c8a-428e-a653-686c1a045b49",
  "order_id": "611d6912-c87e-4d54-874d-47693a2b37f8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c9b5a5d-ede6-4eff-8bca-00ce9492d81b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c9b5a5d-ede6-4eff-8bca-00ce9492d81b",
  "order_id": "611d6912-c87e-4d54-874d-47693a2b37f8",
  "assignment_id": "2f11b3a8-7c8a-428e-a653-686c1a045b49",
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
    "phone": "+380678188404"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "89655570-0361-46c7-bcc4-0012b542b4f0",
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
  "id": "e4d24efa-91dd-4df9-bbc1-01e1c1f82419",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:46.643386Z",
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
  "command_id": "1d597748-de1d-463f-8465-d573727271a0",
  "quote_id": "e4d24efa-91dd-4df9-bbc1-01e1c1f82419",
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
  "id": "a89aecc4-1531-4427-adb4-4e446ca65b69",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:50:46.844702Z",
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
  "command_id": "9dbd0668-c29b-48f1-863c-dee3af06e83e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T18:50:47Z"
}
```

```json
{
  "id": "c2f6a438-f66b-4fb9-a3cc-6c602a9480ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:47.051731Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:50:47Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ecad32bf-2a13-4881-951e-9eec1f7dc185",
  "quote_id": "c2f6a438-f66b-4fb9-a3cc-6c602a9480ba",
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
  "pickup_at": "2026-10-29T18:50:47Z"
}
```

```json
{
  "id": "9e26a65b-1e21-4e94-bd79-435712e69f45",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:50:47.255997Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:50:47Z",
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
  "command_id": "65559e1b-8683-48f2-a9e9-c0f2838bfdae",
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
  "id": "4a70b336-aa7a-4a2f-be7d-6262a4d8d5e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:47.463383Z",
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
  "command_id": "4c6e2b50-0792-4ca0-8c0e-752200fd9580",
  "quote_id": "4a70b336-aa7a-4a2f-be7d-6262a4d8d5e0",
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
  "correlation_id": "f53209ff-dda9-4bf8-8575-69c24b3c7e0a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9e26a65b-1e21-4e94-bd79-435712e69f45",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T15:50:47.255997Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T18:50:47Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "a89aecc4-1531-4427-adb4-4e446ca65b69",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T15:50:46.844702Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "611d6912-c87e-4d54-874d-47693a2b37f8",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "a89aecc4-1531-4427-adb4-4e446ca65b69",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:50:46.844702Z",
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

`GET /api/rider/v1/orders/611d6912-c87e-4d54-874d-47693a2b37f8` → **200**

```json
{
  "id": "611d6912-c87e-4d54-874d-47693a2b37f8",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2f11b3a8-7c8a-428e-a653-686c1a045b49",
    "order_id": "611d6912-c87e-4d54-874d-47693a2b37f8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2c9b5a5d-ede6-4eff-8bca-00ce9492d81b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:50:45.876347Z",
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
    "location_at": "2026-10-29T15:50:45.100989Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/611d6912-c87e-4d54-874d-47693a2b37f8/cancel` → **200**

```json
{
  "command_id": "57099b5c-fb25-427f-9dc4-b4ff5e42db50",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "611d6912-c87e-4d54-874d-47693a2b37f8",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2f11b3a8-7c8a-428e-a653-686c1a045b49",
    "order_id": "611d6912-c87e-4d54-874d-47693a2b37f8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2c9b5a5d-ede6-4eff-8bca-00ce9492d81b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:50:45.876347Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/a89aecc4-1531-4427-adb4-4e446ca65b69` → **200**

```json
{
  "id": "a89aecc4-1531-4427-adb4-4e446ca65b69",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:50:46.844702Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a89aecc4-1531-4427-adb4-4e446ca65b69/cancel` → **200**

```json
{
  "command_id": "60d2a7a2-86ae-4622-808f-4596464aada0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a89aecc4-1531-4427-adb4-4e446ca65b69",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:50:46.844702Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/9e26a65b-1e21-4e94-bd79-435712e69f45` → **200**

```json
{
  "id": "9e26a65b-1e21-4e94-bd79-435712e69f45",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:50:47.255997Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:50:47Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9e26a65b-1e21-4e94-bd79-435712e69f45/cancel` → **200**

```json
{
  "command_id": "8f753411-c56f-4c09-a1f2-46a54086cd1d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9e26a65b-1e21-4e94-bd79-435712e69f45",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6c851aca-5f9b-42ad-a6ef-e69a35a285d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:50:47.255997Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-29T18:50:47Z",
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
  "session_id": "a6487cfd-8193-43f4-bbb6-a975d09e7bf6",
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
  "last_heartbeat_at": "2026-10-29T15:50:45.100989Z",
  "last_location_at": "2026-10-29T15:50:45.100989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a6487cfd-8193-43f4-bbb6-a975d09e7bf6/close` → **200**

```json
{
  "command_id": "5f90a4a4-cf97-480d-8d53-43afbf0abb86",
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

Done: orders 611d6912-c87e-4d54-874d-47693a2b37f8, a89aecc4-1531-4427-adb4-4e446ca65b69, 9e26a65b-1e21-4e94-bd79-435712e69f45.

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
  "session_id": "85a572d3-731c-44bc-9cb2-5f67a1b13727",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NTAsImlhdCI6MTc5MzI4OTA1MCwianRpIjoiMWNkMTg4ZjEtMGEwOC00OGI1LWEyMjMtODRhYzZjZTBiYTQ5Iiwic2lkIjoiODVhNTcyZDMtNzMxYy00NGJjLTljYjItNWY2N2ExYjEzNzI3In0.eSJ4hW3HSEd1bQHCE3NN3kNBao-Mmh76N46Bt8KJuw0",
  "access_expires_at": "2026-10-29T16:05:50.053586525Z",
  "refresh_token": "owGJMLYVAf6utw5426VF03FIfjsSfPEGloU12o-EfB4",
  "refresh_expires_at": "2026-10-30T03:50:50.053247857Z",
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
  "session_id": "f036d706-1cf0-4f35-bdd2-0c6a8617528d",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NTAsImlhdCI6MTc5MzI4OTA1MCwianRpIjoiYzlhMmNlMTgtZTY2Mi00NTMzLTkxMzUtYmI4YWM1ZWJmZTkzIiwic2lkIjoiZjAzNmQ3MDYtMWNmMC00ZjM1LWJkZDItMGM2YTg2MTc1MjhkIn0.0TvekWNw8eLOVEE4z-UVzPIZ9edxc-g-QwEw8V8eLa0",
  "access_expires_at": "2026-10-29T16:05:50.454409773Z",
  "refresh_token": "mfpKLujwwtoba_zNe3_HuIuHxdOpR39QYje9sBrxD8Q",
  "refresh_expires_at": "2026-10-30T03:50:50.454020219Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18061"
}
```

```json
{
  "challenge_id": "02fb2d14-1ee7-4f8a-a9a2-21e5bf352ae2",
  "expires_at": "2026-10-29T15:55:50.641469827Z",
  "resend_available_at": "2026-10-29T15:50:51.641469827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "036865",
  "sent_at": "2026-10-29T15:50:50.643535831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02fb2d14-1ee7-4f8a-a9a2-21e5bf352ae2",
  "code": "036865",
  "device_ref": "sandbox-18061"
}
```

```json
{
  "session_id": "d4389932-f2ed-4317-be3d-1138a052874c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk1MCwiaWF0IjoxNzkzMjg5MDUwLCJqdGkiOiIyZTAyODE1Ni1mNzZmLTQwM2ItYTBkNi1mMmQxZDgwMDI1NDgiLCJzaWQiOiJkNDM4OTkzMi1mMmVkLTQzMTctYmUzZC0xMTM4YTA1Mjg3NGMifQ.RUx_TWL1mHWV1Xp9hB6X_rA5RkLcYmh3MwsgiacyG1E",
  "access_expires_at": "2026-10-29T16:05:50.848132872Z",
  "refresh_token": "-rDyJbic99_vq_83WlGItEM2RGHP1VstzxxJDvo0V-I",
  "refresh_expires_at": "2026-11-28T15:50:50.847691891Z",
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
  "command_id": "3445075b-6a04-45be-abb3-ea8ca0678439",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:51Z",
    "sequence": 1793289051210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4019a27-fb62-485d-b58b-66a389c2e439",
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
  "last_heartbeat_at": "2026-10-29T15:50:51.225362Z",
  "last_location_at": "2026-10-29T15:50:51.225362Z",
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
  "command_id": "7cda2ddf-8f9b-4e64-b461-e83414fd5fe2",
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
  "effective_at": "2026-10-29T15:50:51.611687Z",
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T15:48:50.767611Z",
  "last_entries": [
    {
      "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:48:50.767611Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c3ada204-dd7e-4e80-9b9a-e99bde508841",
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
  "id": "50c7634e-d5b8-4a5a-84f0-bc99f2f1639a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:52.002245Z",
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
  "command_id": "d220d031-68fe-4a7c-816d-f0eca07b4347",
  "quote_id": "50c7634e-d5b8-4a5a-84f0-bc99f2f1639a",
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
    "phone": "+3806711121607"
  }
}
```

```json
{
  "id": "6962636c-916e-4dd5-84d8-e74653c954fd",
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
  "created_at": "2026-10-29T15:50:52.208687Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121607"
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
    "id": "449bae56-981d-4713-b49b-6819dbfd67b6",
    "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
    "expires_at": "2026-10-29T15:51:07.211087Z",
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

`POST /api/driver/v1/offers/449bae56-981d-4713-b49b-6819dbfd67b6/accept` → **200**

```json
{
  "command_id": "c52bb1f8-3ac6-4bee-ace9-a1060c515395"
}
```

```json
{
  "id": "61f4659c-84e3-4722-8ee7-bbfe0f1bc712",
  "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b8e57a60-370b-4bb7-9ba0-47ce7afba85b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8e57a60-370b-4bb7-9ba0-47ce7afba85b",
  "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
  "assignment_id": "61f4659c-84e3-4722-8ee7-bbfe0f1bc712",
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
    "phone": "+3806711121607"
  }
}
```

`POST /api/driver/v1/work-sessions/b4019a27-fb62-485d-b58b-66a389c2e439/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:50:52Z",
    "sequence": 1793289052958
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4019a27-fb62-485d-b58b-66a389c2e439",
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
  "last_heartbeat_at": "2026-10-29T15:50:52.97358Z",
  "last_location_at": "2026-10-29T15:50:52.97358Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b8e57a60-370b-4bb7-9ba0-47ce7afba85b/arrive` → **200**

```json
{
  "command_id": "fe615bb4-5377-436c-9b9d-0a8a658c8470",
  "expected_version": 0
}
```

```json
{
  "id": "b8e57a60-370b-4bb7-9ba0-47ce7afba85b",
  "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
  "assignment_id": "61f4659c-84e3-4722-8ee7-bbfe0f1bc712",
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
  "arrived_at": "2026-10-29T15:50:53.166749Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121607"
  }
}
```

`POST /api/driver/v1/trips/b8e57a60-370b-4bb7-9ba0-47ce7afba85b/start` → **200**

```json
{
  "command_id": "b2b33dbb-573b-4d6c-a13e-b15ab16e1c04",
  "expected_version": 1
}
```

```json
{
  "id": "b8e57a60-370b-4bb7-9ba0-47ce7afba85b",
  "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
  "assignment_id": "61f4659c-84e3-4722-8ee7-bbfe0f1bc712",
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
  "arrived_at": "2026-10-29T15:50:53.166749Z",
  "started_at": "2026-10-29T15:50:53.362732Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121607"
  }
}
```

`POST /api/driver/v1/trips/b8e57a60-370b-4bb7-9ba0-47ce7afba85b/complete` → **200**

```json
{
  "command_id": "cfb73475-1b05-4bc3-8c1f-ecbd41afd4ce",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:50:53Z",
  "cash_received": true
}
```

```json
{
  "id": "b8e57a60-370b-4bb7-9ba0-47ce7afba85b",
  "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
  "assignment_id": "61f4659c-84e3-4722-8ee7-bbfe0f1bc712",
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
  "arrived_at": "2026-10-29T15:50:53.166749Z",
  "started_at": "2026-10-29T15:50:53.362732Z",
  "completed_at": "2026-10-29T15:50:53.564537Z",
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
  "command_id": "0a833751-1fb0-4998-80fb-6ad4dd5915c0",
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
  "id": "73bd0423-ea22-430f-b2f7-07d57e4686c6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:55:53.775947Z",
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
  "command_id": "86703dba-2780-4ad4-9d83-d4fbd620a12b",
  "quote_id": "73bd0423-ea22-430f-b2f7-07d57e4686c6",
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
    "phone": "+3806711118151"
  }
}
```

```json
{
  "id": "01ecf3f2-ec32-4a79-a7cc-501b9eafb33b",
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
  "created_at": "2026-10-29T15:50:53.977267Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118151"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/01ecf3f2-ec32-4a79-a7cc-501b9eafb33b` → **200**

```json
{
  "id": "01ecf3f2-ec32-4a79-a7cc-501b9eafb33b",
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
  "created_at": "2026-10-29T15:50:53.977267Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118151"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/01ecf3f2-ec32-4a79-a7cc-501b9eafb33b/cancel` → **200**

```json
{
  "command_id": "1fe6074d-70cb-4a30-9bed-f214b131c646",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "01ecf3f2-ec32-4a79-a7cc-501b9eafb33b",
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
  "created_at": "2026-10-29T15:50:53.977267Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118151"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора"
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
  "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T15:48:50.767611Z",
  "last_entries": [
    {
      "order_id": "01ecf3f2-ec32-4a79-a7cc-501b9eafb33b",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T15:50:54.381441Z"
    },
    {
      "order_id": "6962636c-916e-4dd5-84d8-e74653c954fd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T15:50:53.567584Z"
    },
    {
      "order_id": "2e4aff28-5551-492c-8252-773192f4a3f2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:48:50.767611Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4019a27-fb62-485d-b58b-66a389c2e439",
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
  "last_heartbeat_at": "2026-10-29T15:50:52.97358Z",
  "last_location_at": "2026-10-29T15:50:52.97358Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4019a27-fb62-485d-b58b-66a389c2e439/close` → **200**

```json
{
  "command_id": "d764f1bc-17e8-41b1-9193-562bbd4ff958",
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

Done: operator bonus for fulfilled 6962636c-916e-4dd5-84d8-e74653c954fd and operator-fault cancellation 01ecf3f2-ec32-4a79-a7cc-501b9eafb33b.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672868619",
  "device_ref": "sandbox-24757"
}
```

```json
{
  "challenge_id": "50fbd705-bdb4-44c0-b5a5-a1e82ef1ddcb",
  "expires_at": "2026-10-29T15:55:58.364075352Z",
  "resend_available_at": "2026-10-29T15:50:59.364075352Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672868619` → **200**

```json
{
  "phone": "+380672868619",
  "audience": "CLIENT",
  "code": "066114",
  "sent_at": "2026-10-29T15:50:58.366216384Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671315368",
  "device_ref": "sandbox-22936",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3c01b446-313a-4a32-8ed1-6442d0311a8e",
  "expires_at": "2026-10-29T15:55:59.783625922Z",
  "resend_available_at": "2026-10-29T15:51:00.783625922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671315368` → **200**

```json
{
  "phone": "+380671315368",
  "audience": "CLIENT",
  "code": "573686",
  "sent_at": "2026-10-29T15:50:59.785446634Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671315368",
  "device_ref": "sandbox-15539",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a2eb420c-9544-4d51-8fea-8a58d35967d6",
  "expires_at": "2026-10-29T15:56:01.192162789Z",
  "resend_available_at": "2026-10-29T15:51:02.192162789Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671315368` → **200**

```json
{
  "phone": "+380671315368",
  "audience": "CLIENT",
  "code": "191269",
  "sent_at": "2026-10-29T15:51:01.194374146Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676950000",
  "device_ref": "sandbox-28275"
}
```

```json
{
  "challenge_id": "703b9ede-dd96-4eb2-bde1-4d7329a09cb3",
  "expires_at": "2026-10-29T15:56:02.619453032Z",
  "resend_available_at": "2026-10-29T15:51:03.619453032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676950000",
  "device_ref": "sandbox-10298"
}
```

```json
{
  "challenge_id": "a2ffa330-6120-4925-b15d-1725615e3501",
  "expires_at": "2026-10-29T15:56:04.008610403Z",
  "resend_available_at": "2026-10-29T15:51:05.008610403Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676950000` → **200**

```json
{
  "phone": "+380676950000",
  "audience": "CLIENT",
  "code": "421337",
  "sent_at": "2026-10-29T15:51:04.011214319Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676950000",
  "device_ref": "sandbox-17153",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e1786a84-29ae-4a55-90a3-966af5671d80",
  "expires_at": "2026-10-29T15:56:05.435120125Z",
  "resend_available_at": "2026-10-29T15:51:06.435120125Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676950000` → **200**

```json
{
  "phone": "+380676950000",
  "audience": "CLIENT",
  "code": "996389",
  "sent_at": "2026-10-29T15:51:05.437173577Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676950000",
  "device_ref": "sandbox-28243",
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
  "correlation_id": "f52351c5-b1ca-416b-9e3c-2521fb103086",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000019426"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "64e091e8-159b-4274-8031-0e96e4336496"
}
```

`GET /sandbox/v1/otp?phone=%2B442000019426` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120027690"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "dbcc786f-fc96-4888-bdb1-2cd0d41d2bc9"
}
```

`GET /sandbox/v1/otp?phone=%2B37120027690` → **404**

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
  "session_id": "07dc95db-7aaa-420a-b12d-afb42f9a716a",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NjcsImlhdCI6MTc5MzI4OTA2NywianRpIjoiNWU2MDg5MjYtMzMyNi00Nzg5LThmNTQtZDk5ZWYwNjFmN2EwIiwic2lkIjoiMDdkYzk1ZGItN2FhYS00MjBhLWIxMmQtYWZiNDJmOWE3MTZhIn0.W3Dw3tIODiNB0-lT42mcpncSADueDSE3aF-2x_TlVng",
  "access_expires_at": "2026-10-29T16:06:07.686465137Z",
  "refresh_token": "tugYdNyyP00dG35u1H_jUvsewo923Zg_CQPUmwBheto",
  "refresh_expires_at": "2026-10-30T03:51:07.68612747Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676950000` → **200**

```json
{
  "deliveries": [
    {
      "id": "088c9eca-5488-4570-abf5-07c319a3fb6c",
      "challenge_id": "e1786a84-29ae-4a55-90a3-966af5671d80",
      "phone": "+380676950000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-fb2ac2fd-e092-4b45-a6f0-7bb1e5a2a1e1",
      "error": null,
      "attempted_at": "2026-10-29T15:51:05.437575Z"
    },
    {
      "id": "d9ded038-dda6-40e4-9a04-c12f8a3402b5",
      "challenge_id": "a2ffa330-6120-4925-b15d-1725615e3501",
      "phone": "+380676950000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f4b8af9f-b866-488f-a19e-8a9e841b66b8",
      "error": null,
      "attempted_at": "2026-10-29T15:51:04.011482Z"
    },
    {
      "id": "fb043564-671a-49ac-ab62-1d2cef577877",
      "challenge_id": "703b9ede-dd96-4eb2-bde1-4d7329a09cb3",
      "phone": "+380676950000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T15:51:02.621329Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676950000` → **200**

```json
{
  "phone": "+380676950000",
  "audience": "CLIENT",
  "code": "996389",
  "sent_at": "2026-10-29T15:51:05.437173577Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671315368` → **200**

```json
{
  "deliveries": [
    {
      "id": "2be41420-f447-4876-ba50-8e7f160258a6",
      "challenge_id": "a2eb420c-9544-4d51-8fea-8a58d35967d6",
      "phone": "+380671315368",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-167f4a56-7b5e-4dfd-abda-d1cc313064c2",
      "error": null,
      "attempted_at": "2026-10-29T15:51:01.194672Z"
    },
    {
      "id": "8861ce02-d96d-4bef-adf7-fe3ac9061d0a",
      "challenge_id": "3c01b446-313a-4a32-8ed1-6442d0311a8e",
      "phone": "+380671315368",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d7ad674f-ce41-4b32-91bb-9e0a38d680cb",
      "error": null,
      "attempted_at": "2026-10-29T15:50:59.785705Z"
    }
  ]
}
```

Done: SMS to +380672868619; SMS then a call to +380671315368; a failed SMS, two calls and a refused third to +380676950000; +44 and +371 refused.

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
  "session_id": "4c23f2c8-c5d2-4042-9bef-dd6cc8cd6f36",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NjgsImlhdCI6MTc5MzI4OTA2OCwianRpIjoiM2I4ZmIxMTEtNDM5ZC00MjcyLTllOTEtZWQyNzQ2M2QwNzE2Iiwic2lkIjoiNGMyM2YyYzgtYzVkMi00MDQyLTliZWYtZGQ2Y2M4Y2Q2ZjM2In0.S6XLxj2-f71_u3AJKhMR2P0t3gLRp18gzC8DXv-00n0",
  "access_expires_at": "2026-10-29T16:06:08.519380036Z",
  "refresh_token": "6xJ1KIETWLfV5t5jBTowNYO6eB05sLfnbAHAbeUjIM4",
  "refresh_expires_at": "2026-10-30T03:51:08.518788588Z",
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
  "session_id": "8d84b0fc-57de-4262-a240-82f7de85f48d",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5NjgsImlhdCI6MTc5MzI4OTA2OCwianRpIjoiZWE1Yzk0ZjktZTY0Mi00M2Y5LWFhNmUtMDNhYjc3MTI0MzI3Iiwic2lkIjoiOGQ4NGIwZmMtNTdkZS00MjYyLWEyNDAtODJmN2RlODVmNDhkIn0.tD99GAwdub5_UQ4pf4cYAMAq_klYPZ_LN9TwHCFlIlE",
  "access_expires_at": "2026-10-29T16:06:08.917568378Z",
  "refresh_token": "GrCtFSkTRWzVytLzLxEl9zlIFbe4xllphk0s8xSPA3Y",
  "refresh_expires_at": "2026-10-30T03:51:08.917189349Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab",
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

`POST /api/admin/v1/staff-extensions/44a8bdd3-4006-4464-8afd-15d552435eab` → **200**

```json
{
  "command_id": "01ea8e8c-16f6-4b21-b79d-7ef2cc3f6ae0",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "b7d22d17-a243-4932-9d5e-3042a3766306",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:51:09.686731Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:51:09.686731Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "111a4c4c-da4c-4ba5-a700-d3283669320d",
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
  "id": "35b4b4b1-bb40-45ed-b97d-e99c1875d7ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:10.091640Z",
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
  "command_id": "8dcf5a78-ab8d-4337-b2a6-e228e203e49f",
  "quote_id": "35b4b4b1-bb40-45ed-b97d-e99c1875d7ce",
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
    "phone": "+380673554896"
  }
}
```

```json
{
  "id": "b38685fb-fefd-470c-a260-d13c0d30cc6d",
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
  "created_at": "2026-10-29T15:51:10.298257Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673554896"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/b38685fb-fefd-470c-a260-d13c0d30cc6d/calls` → **201**

```json
{
  "command_id": "0795c75c-9588-4861-bfd7-7ef981c9de77",
  "to": "CALLER"
}
```

```json
{
  "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "order_ids": [
    "b38685fb-fefd-470c-a260-d13c0d30cc6d"
  ],
  "started_at": "2026-10-29T15:51:10.526017Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/b38685fb-fefd-470c-a260-d13c0d30cc6d/calls` → **201**

```json
{
  "command_id": "0795c75c-9588-4861-bfd7-7ef981c9de77",
  "to": "CALLER"
}
```

```json
{
  "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "order_ids": [
    "b38685fb-fefd-470c-a260-d13c0d30cc6d"
  ],
  "started_at": "2026-10-29T15:51:10.526017Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673554896",
    "at": "2026-10-29T15:51:10.5279369Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.6968",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "70913dc1-fcce-479b-b51d-e6916e495cf8"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=b38685fb-fefd-470c-a260-d13c0d30cc6d` → **200**

```json
{
  "calls": [
    {
      "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [
        "b38685fb-fefd-470c-a260-d13c0d30cc6d"
      ],
      "started_at": "2026-10-29T15:51:10.526017Z",
      "answered_at": "2026-10-29T15:51:11.01701Z",
      "ended_at": "2026-10-29T15:51:11.036465Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=b38685fb-fefd-470c-a260-d13c0d30cc6d` → **200**

```json
{
  "calls": [
    {
      "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [
        "b38685fb-fefd-470c-a260-d13c0d30cc6d"
      ],
      "started_at": "2026-10-29T15:51:10.526017Z",
      "answered_at": "2026-10-29T15:51:11.01701Z",
      "ended_at": "2026-10-29T15:51:11.036465Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=b38685fb-fefd-470c-a260-d13c0d30cc6d` → **200**

```json
{
  "calls": [
    {
      "id": "70913dc1-fcce-479b-b51d-e6916e495cf8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "order_ids": [
        "b38685fb-fefd-470c-a260-d13c0d30cc6d"
      ],
      "started_at": "2026-10-29T15:51:10.526017Z",
      "answered_at": "2026-10-29T15:51:11.01701Z",
      "ended_at": "2026-10-29T15:51:11.036465Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:51:13.483568Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/b38685fb-fefd-470c-a260-d13c0d30cc6d` → **200**

```json
{
  "id": "b38685fb-fefd-470c-a260-d13c0d30cc6d",
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
  "created_at": "2026-10-29T15:51:10.298257Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673554896"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b38685fb-fefd-470c-a260-d13c0d30cc6d/cancel` → **200**

```json
{
  "command_id": "ae484aba-9b88-42c9-a85c-d6c7c9a9901d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b38685fb-fefd-470c-a260-d13c0d30cc6d",
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
  "created_at": "2026-10-29T15:51:10.298257Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673554896"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "command_id": "e46ed3f1-49dc-4da1-a545-d1a9502d87db",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T15:51:16.104098Z",
  "extension": "101"
}
```

Done: outgoing call 70913dc1-fcce-479b-b51d-e6916e495cf8 from order b38685fb-fefd-470c-a260-d13c0d30cc6d, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633048297",
  "device_ref": "sandbox-17522"
}
```

```json
{
  "challenge_id": "ecfb86a5-1358-47cb-be53-f8d69767f5d3",
  "expires_at": "2026-10-29T15:56:16.307495919Z",
  "resend_available_at": "2026-10-29T15:51:17.307495919Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633048297` → **200**

```json
{
  "phone": "+380633048297",
  "audience": "CLIENT",
  "code": "406991",
  "sent_at": "2026-10-29T15:51:16.310073082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecfb86a5-1358-47cb-be53-f8d69767f5d3",
  "code": "406991",
  "device_ref": "sandbox-17522"
}
```

```json
{
  "session_id": "f671337e-aad0-4bdf-a381-0e2f68c9e7eb",
  "subject": {
    "type": "CLIENT",
    "id": "00d00944-1388-4b85-bada-7f5ee322b730"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGQwMDk0NC0xMzg4LTRiODUtYmFkYS03ZjVlZTMyMmI3MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTc2LCJpYXQiOjE3OTMyODkwNzYsImp0aSI6ImY3NGRmMDI0LTI5MGItNGVmNS1hNTFlLTA3ZWIzMzk4MGQxNCIsInNpZCI6ImY2NzEzMzdlLWFhZDAtNGJkZi1hMzgxLTBlMmY2OGM5ZTdlYiJ9.aSEjd2NdOk8ljjkz0iWcVnIrKjKHoV5LJjQ-TSAlbmI",
  "access_expires_at": "2026-10-29T16:06:16.528817886Z",
  "refresh_token": "XNX2P5Nh9dQp4svTowfMZp_Mu1evQwepJdYtJJzv2e0",
  "refresh_expires_at": "2026-11-28T15:51:16.528346324Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "00d00944-1388-4b85-bada-7f5ee322b730",
  "session_id": "f671337e-aad0-4bdf-a381-0e2f68c9e7eb",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633048297",
  "device_ref": "sandbox-10247"
}
```

```json
{
  "challenge_id": "0d516591-3a46-4f94-a6cf-e54a35f7b734",
  "expires_at": "2026-10-29T15:56:18.906327383Z",
  "resend_available_at": "2026-10-29T15:51:19.906327383Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633048297` → **200**

```json
{
  "phone": "+380633048297",
  "audience": "CLIENT",
  "code": "176131",
  "sent_at": "2026-10-29T15:51:18.908199909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d516591-3a46-4f94-a6cf-e54a35f7b734",
  "code": "176131",
  "device_ref": "sandbox-10247"
}
```

```json
{
  "session_id": "938746f4-319e-42ee-acb0-eac9255a4364",
  "subject": {
    "type": "CLIENT",
    "id": "00d00944-1388-4b85-bada-7f5ee322b730"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGQwMDk0NC0xMzg4LTRiODUtYmFkYS03ZjVlZTMyMmI3MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTc5LCJpYXQiOjE3OTMyODkwNzksImp0aSI6IjZjNWMxNzEzLTZhMjAtNDJmYi1iZDUxLTQ2OGFkZmE1NTU0ZiIsInNpZCI6IjkzODc0NmY0LTMxOWUtNDJlZS1hY2IwLWVhYzkyNTVhNDM2NCJ9.RPpuI7VEQOm-s_O676G8mBqkKFET3KR2BmWu_PmxbFw",
  "access_expires_at": "2026-10-29T16:06:19.121311315Z",
  "refresh_token": "ddyNxJ6cBQXW2prI5EITb-6WF_Acof6lMTzHYA_M94Q",
  "refresh_expires_at": "2026-11-28T15:51:19.120882566Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "ceabdfd8-6382-41d2-9dd9-0fdb56e9fe0d",
  "expires_at": "2026-10-29T15:56:21.322651709Z",
  "resend_available_at": "2026-10-29T15:51:22.322651709Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633048297` → **200**

```json
{
  "phone": "+380633048297",
  "audience": "CLIENT",
  "code": "480079",
  "sent_at": "2026-10-29T15:51:21.324261362Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638188313"
}
```

```json
{
  "challenge_id": "82588da2-841e-4a91-8b5b-baed9b4850d7",
  "expires_at": "2026-10-29T15:56:21.520930449Z",
  "resend_available_at": "2026-10-29T15:51:22.520930449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638188313` → **200**

```json
{
  "phone": "+380638188313",
  "audience": "CLIENT",
  "code": "500251",
  "sent_at": "2026-10-29T15:51:21.522400221Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "b4d278e8-98c8-4a88-926b-c62eb67c9962",
  "current_challenge_id": "ceabdfd8-6382-41d2-9dd9-0fdb56e9fe0d",
  "current_code": "000000",
  "new_challenge_id": "82588da2-841e-4a91-8b5b-baed9b4850d7",
  "new_code": "500251"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b33867b1-da5a-4c61-aa27-0c773a426fb3"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "a07833ad-cbed-4d34-89b9-ed4fb68f7dc5",
  "current_challenge_id": "ceabdfd8-6382-41d2-9dd9-0fdb56e9fe0d",
  "current_code": "480079",
  "new_challenge_id": "82588da2-841e-4a91-8b5b-baed9b4850d7",
  "new_code": "500251"
}
```

```json
{
  "subject_id": "00d00944-1388-4b85-bada-7f5ee322b730",
  "phone": "+380638188313",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "00d00944-1388-4b85-bada-7f5ee322b730",
  "session_id": "f671337e-aad0-4bdf-a381-0e2f68c9e7eb",
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
  "correlation_id": "d05f9b35-7091-4f2f-b7ba-bbada2bb4dc6"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638188313",
  "device_ref": "sandbox-5792"
}
```

```json
{
  "challenge_id": "fe6a8a87-1505-485b-994c-0ba41eee7186",
  "expires_at": "2026-10-29T15:56:24.484595381Z",
  "resend_available_at": "2026-10-29T15:51:25.484595381Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638188313` → **200**

```json
{
  "phone": "+380638188313",
  "audience": "CLIENT",
  "code": "765095",
  "sent_at": "2026-10-29T15:51:24.487128732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe6a8a87-1505-485b-994c-0ba41eee7186",
  "code": "765095",
  "device_ref": "sandbox-5792"
}
```

```json
{
  "session_id": "f86d2e88-2e61-4a55-98a3-fedc64ab62b5",
  "subject": {
    "type": "CLIENT",
    "id": "00d00944-1388-4b85-bada-7f5ee322b730"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGQwMDk0NC0xMzg4LTRiODUtYmFkYS03ZjVlZTMyMmI3MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTg0LCJpYXQiOjE3OTMyODkwODQsImp0aSI6ImJjNTY1NThmLTk3MzktNGQ5Yi04ZTJjLTJmMmE0YzFlMDA0NyIsInNpZCI6ImY4NmQyZTg4LTJlNjEtNGE1NS05OGEzLWZlZGM2NGFiNjJiNSJ9.V3hu7CfLGq7qKqnV4lwt4Ma27Eq6oLHjHVb5K5YpD6g",
  "access_expires_at": "2026-10-29T16:06:24.723288978Z",
  "refresh_token": "TZrGA67NQbVyER25S-6PddEZHIkVvNxDnS6C8Arzegs",
  "refresh_expires_at": "2026-11-28T15:51:24.722885472Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "00d00944-1388-4b85-bada-7f5ee322b730",
  "session_id": "f86d2e88-2e61-4a55-98a3-fedc64ab62b5",
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
  "session_id": "3af5d66a-8681-43b2-a099-55dc545fec9f",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5ODUsImlhdCI6MTc5MzI4OTA4NSwianRpIjoiZTJhM2FiZDMtZTE2Ny00ZjkyLWJjY2UtNzZiNGZhOGQ1Y2Q1Iiwic2lkIjoiM2FmNWQ2NmEtODY4MS00M2IyLWEwOTktNTVkYzU0NWZlYzlmIn0.dapXRzPX4GgZpTsdbRDsVnCWdduF2z6BWG9OO3VhhOY",
  "access_expires_at": "2026-10-29T16:06:25.303167172Z",
  "refresh_token": "UYdb8Vrrsv4_GKfDZxQ5nRhCX_R2j4dn1Sz2sey_29Y",
  "refresh_expires_at": "2026-10-30T03:51:25.302782174Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730` → **200**

```json
{
  "client": {
    "id": "00d00944-1388-4b85-bada-7f5ee322b730",
    "phone": "+380638188313",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:51:16.526898Z",
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

`POST /api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730/phone/new-code` → **201**

```json
{
  "phone": "+380632256441"
}
```

```json
{
  "challenge_id": "7e5e9d0a-a561-4e17-a417-2ba5e0320677",
  "expires_at": "2026-10-29T15:56:25.699391464Z",
  "resend_available_at": "2026-10-29T15:51:26.699391464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632256441` → **200**

```json
{
  "phone": "+380632256441",
  "audience": "CLIENT",
  "code": "638396",
  "sent_at": "2026-10-29T15:51:25.700842571Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730/phone` → **422**

```json
{
  "command_id": "4d80e034-38c7-4b41-bd31-88f8110da02e",
  "expected_version": 3,
  "new_challenge_id": "7e5e9d0a-a561-4e17-a417-2ba5e0320677",
  "new_code": "638397",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "daf400c5-b4f0-4c14-b19b-a84eaa3dc15c"
}
```

`POST /api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730/phone` → **400**

```json
{
  "command_id": "b2a98a56-2fe2-4c30-a4e9-e876831888ed",
  "expected_version": 3,
  "new_challenge_id": "7e5e9d0a-a561-4e17-a417-2ba5e0320677",
  "new_code": "638396",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4d91cd03-152a-468c-9282-a4e4a7001994",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/00d00944-1388-4b85-bada-7f5ee322b730/phone` → **200**

```json
{
  "command_id": "2889b861-53c8-489b-b39d-5e9bd76fc59b",
  "expected_version": 3,
  "new_challenge_id": "7e5e9d0a-a561-4e17-a417-2ba5e0320677",
  "new_code": "638396",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "00d00944-1388-4b85-bada-7f5ee322b730",
  "phone": "+380632256441",
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
  "correlation_id": "a5b287fd-bdd8-4907-b1d8-82c260e32aa2"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632256441",
  "device_ref": "sandbox-25915"
}
```

```json
{
  "challenge_id": "e4bd57cb-6bfb-4f9d-bd98-b4e924478688",
  "expires_at": "2026-10-29T15:56:26.735318924Z",
  "resend_available_at": "2026-10-29T15:51:27.735318924Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632256441` → **200**

```json
{
  "phone": "+380632256441",
  "audience": "CLIENT",
  "code": "466958",
  "sent_at": "2026-10-29T15:51:26.737503532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4bd57cb-6bfb-4f9d-bd98-b4e924478688",
  "code": "466958",
  "device_ref": "sandbox-25915"
}
```

```json
{
  "session_id": "2bfd02d2-e215-46d5-8e6a-463190774d57",
  "subject": {
    "type": "CLIENT",
    "id": "00d00944-1388-4b85-bada-7f5ee322b730"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGQwMDk0NC0xMzg4LTRiODUtYmFkYS03ZjVlZTMyMmI3MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTg2LCJpYXQiOjE3OTMyODkwODYsImp0aSI6ImU4NjM0NTJiLTNhMzQtNGYwNi04ZDQzLWFjMzZkZmY2OWQ2YyIsInNpZCI6IjJiZmQwMmQyLWUyMTUtNDZkNS04ZTZhLTQ2MzE5MDc3NGQ1NyJ9.QTTNC3fbRJwjlpUXFJIZBSvD7wZDybkdrqmoOA2IZwQ",
  "access_expires_at": "2026-10-29T16:06:26.950166833Z",
  "refresh_token": "fewX2b2U086oU2cKHkeCsqnes9F9lJ2YnrgnLJJAF08",
  "refresh_expires_at": "2026-11-28T15:51:26.949809908Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "00d00944-1388-4b85-bada-7f5ee322b730",
  "session_id": "2bfd02d2-e215-46d5-8e6a-463190774d57",
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
  "phone": "+380639521296",
  "device_ref": "sandbox-10524"
}
```

```json
{
  "challenge_id": "6e73dda0-48ba-4246-b412-6ebe3ef9ec20",
  "expires_at": "2026-10-29T15:56:27.315879672Z",
  "resend_available_at": "2026-10-29T15:51:28.315879672Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639521296` → **200**

```json
{
  "phone": "+380639521296",
  "audience": "CLIENT",
  "code": "073279",
  "sent_at": "2026-10-29T15:51:27.318498476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e73dda0-48ba-4246-b412-6ebe3ef9ec20",
  "code": "073279",
  "device_ref": "sandbox-10524"
}
```

```json
{
  "session_id": "f7caee17-f18b-4eb2-a059-6dff1429c70b",
  "subject": {
    "type": "CLIENT",
    "id": "e6f67b49-14f2-4714-b043-cf9f8c870679"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmY2N2I0OS0xNGYyLTQ3MTQtYjA0My1jZjlmOGM4NzA2NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTg3LCJpYXQiOjE3OTMyODkwODcsImp0aSI6ImJhNThkNmEwLTg0ZDktNDBlMS04MWE5LWE3MWRiYTE0N2U4NiIsInNpZCI6ImY3Y2FlZTE3LWYxOGItNGViMi1hMDU5LTZkZmYxNDI5YzcwYiJ9.KTjbzzNVFaPn5jSrtMQfQznwI-Lr2uGqaMee3hOhmyA",
  "access_expires_at": "2026-10-29T16:06:27.524516272Z",
  "refresh_token": "YqpjVltccCoio1dzbAtK29ERTOfd7W9coN6HfxtMxOU",
  "refresh_expires_at": "2026-11-28T15:51:27.524163823Z",
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
  "session_id": "7947ecf8-0563-472c-8da2-e7f338278160",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5ODgsImlhdCI6MTc5MzI4OTA4OCwianRpIjoiMzAwZmI2OGMtYjE0OS00OWE0LWIxYWEtN2JlMjU4ZTQ4ZTkwIiwic2lkIjoiNzk0N2VjZjgtMDU2My00NzJjLThkYTItZTdmMzM4Mjc4MTYwIn0.tyKnCKn2B6DcDVkIJnfU-LyS6x41OxXZy750Qu58pB4",
  "access_expires_at": "2026-10-29T16:06:28.323322874Z",
  "refresh_token": "QOyHPVnHIyD0ZyVoAlXmp7VwG5wjTf-PaooGjpH-6mg",
  "refresh_expires_at": "2026-10-30T03:51:28.322736565Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639521296` → **200**

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
  "correlation_id": "746eb5b1-719d-411b-98ab-1e210f74d4f0"
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
  "session_id": "342f337e-d04b-46c9-a956-76ced4546c59",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5ODksImlhdCI6MTc5MzI4OTA4OSwianRpIjoiZTg4YjFiN2QtNGM3MC00ZWEwLTkwNDMtZWQzYjg1ZjhlYzhlIiwic2lkIjoiMzQyZjMzN2UtZDA0Yi00NmM5LWE5NTYtNzZjZWQ0NTQ2YzU5In0.kcRmIalMXn-WnaRVv_gG60wHh71QHOq27HPUUHKjeJc",
  "access_expires_at": "2026-10-29T16:06:29.106243553Z",
  "refresh_token": "xKhmSUZ98QSOlWS6BoBhsZL5iPyuo8GUwHKeV1FC-Wc",
  "refresh_expires_at": "2026-10-30T03:51:29.105927543Z",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:48:28.644977Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e60d7324-c54b-4681-a917-980c79f519c6",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T15:51:29.487991891Z"
}
```

## The rider books the airport for 2026-10-29T18:51:28Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600038851",
  "device_ref": "sandbox-19138"
}
```

```json
{
  "challenge_id": "615677f7-7baa-45c3-a9e2-df8f6cd5f0f7",
  "expires_at": "2026-10-29T15:56:29.680896573Z",
  "resend_available_at": "2026-10-29T15:51:30.680896573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600038851` → **200**

```json
{
  "phone": "+48600038851",
  "audience": "CLIENT",
  "code": "603405",
  "sent_at": "2026-10-29T15:51:29.682717858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "615677f7-7baa-45c3-a9e2-df8f6cd5f0f7",
  "code": "603405",
  "device_ref": "sandbox-19138"
}
```

```json
{
  "session_id": "d7c6fe43-a20c-4e61-b4e2-d712bed6cc78",
  "subject": {
    "type": "CLIENT",
    "id": "6f05e933-1a23-496e-8f8e-68bad36f8005"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjA1ZTkzMy0xYTIzLTQ5NmUtOGY4ZS02OGJhZDM2ZjgwMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTg5LCJpYXQiOjE3OTMyODkwODksImp0aSI6IjdlYTE0NDM5LTVlZTctNDkyZC05NDgzLTNiNTAyZWNiZTc2ZCIsInNpZCI6ImQ3YzZmZTQzLWEyMGMtNGU2MS1iNGUyLWQ3MTJiZWQ2Y2M3OCJ9.XNYLXG1E9v0bZN_GB5gwR556cL2bObDiVfmZl4WHrH4",
  "access_expires_at": "2026-10-29T16:06:29.893726873Z",
  "refresh_token": "SeRhRZ3n45sYjD34VR4onVWl6EKje7M818XM5JBF8dU",
  "refresh_expires_at": "2026-11-28T15:51:29.893372743Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "05c12315-d7be-4192-866a-470e8cd8cafe",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T18:51:28Z"
}
```

```json
{
  "id": "709f068d-a79b-433d-9ad7-d3b136f730d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:30.088030Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:51:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a2f30ea0-2568-4939-a19a-fe08bce4772b",
  "quote_id": "709f068d-a79b-433d-9ad7-d3b136f730d0",
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
  "pickup_at": "2026-10-29T18:51:28Z"
}
```

```json
{
  "id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f05e933-1a23-496e-8f8e-68bad36f8005",
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
  "created_at": "2026-10-29T15:51:30.294236Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:51:28Z",
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
  "device_ref": "sandbox-12043"
}
```

```json
{
  "challenge_id": "73de28a0-98ac-445e-82bc-c157ad8f3ecf",
  "expires_at": "2026-10-29T15:56:30.499729606Z",
  "resend_available_at": "2026-10-29T15:51:31.499729606Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "814782",
  "sent_at": "2026-10-29T15:51:30.501946044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73de28a0-98ac-445e-82bc-c157ad8f3ecf",
  "code": "814782",
  "device_ref": "sandbox-12043"
}
```

```json
{
  "session_id": "ef81a80f-d701-471d-bad7-d8243d01426f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk5MCwiaWF0IjoxNzkzMjg5MDkwLCJqdGkiOiJiNmZlZmNhNS1mYTZhLTQyZTYtYTU4Yy1hNTU5NTc5Mzc4YmEiLCJzaWQiOiJlZjgxYTgwZi1kNzAxLTQ3MWQtYmFkNy1kODI0M2QwMTQyNmYifQ.PixaGWSatclC-u0gQ0OTyfURlDZi7phD7Fm-b2R3liQ",
  "access_expires_at": "2026-10-29T16:06:30.715729975Z",
  "refresh_token": "DW0WnwLAqLjRKF7EOnDyHUcP0FdYyIPF-2d1o3gNTiQ",
  "refresh_expires_at": "2026-11-28T15:51:30.715236517Z",
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
  "command_id": "2a40bf8b-f841-4eef-8248-b0888a7660a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:31Z",
    "sequence": 1793289091108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5c6c15d3-250b-4f68-bef2-9f463d2a842f",
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
  "last_heartbeat_at": "2026-10-29T15:51:31.125618Z",
  "last_location_at": "2026-10-29T15:51:31.125618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
      "short_number": 24,
      "pickup_at": "2026-10-29T18:51:28Z",
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

`POST /api/driver/v1/preorders/5e958f0f-2072-4e56-9b61-71db08ad658a/reserve` → **200**

```json
{
  "command_id": "f79a1662-d260-4344-9e9c-d24229cdfa5c"
}
```

```json
{
  "id": "4c1ed28d-df91-47a8-a2da-51651e569b5b",
  "state": "RESERVED",
  "order": {
    "order_id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
    "short_number": 24,
    "pickup_at": "2026-10-29T18:51:28Z",
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
  "reserved_at": "2026-10-29T15:51:31.510833Z",
  "confirm_from": "2026-10-29T18:21:28Z",
  "confirm_until": "2026-10-29T18:31:28Z",
  "drop_until": "2026-10-29T17:51:28Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4c1ed28d-df91-47a8-a2da-51651e569b5b",
      "state": "RESERVED",
      "order": {
        "order_id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:51:28Z",
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
      "reserved_at": "2026-10-29T15:51:31.510833Z",
      "confirm_from": "2026-10-29T18:21:28Z",
      "confirm_until": "2026-10-29T18:31:28Z",
      "drop_until": "2026-10-29T17:51:28Z"
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
      "id": "4c1ed28d-df91-47a8-a2da-51651e569b5b",
      "state": "RESERVED",
      "order": {
        "order_id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:51:28Z",
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
      "reserved_at": "2026-10-29T15:51:31.510833Z",
      "confirm_from": "2026-10-29T18:21:28Z",
      "confirm_until": "2026-10-29T18:31:28Z",
      "drop_until": "2026-10-29T17:51:28Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4c1ed28d-df91-47a8-a2da-51651e569b5b/confirm` → **409**

```json
{
  "command_id": "5a723cb1-ec68-4862-901a-b5541551c30f"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4c1ed28d-df91-47a8-a2da-51651e569b5b/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1b4cb2cf-3421-40de-88ae-b4ec52dd8593"
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
  "session_id": "c3e11c11-cc48-40de-906d-373bf7ba126e",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTIsImlhdCI6MTc5MzI4OTA5MiwianRpIjoiYWVlMDNkNDktNzY5ZC00YTdiLTgxYTctOTJjMWMwOTFlZDZjIiwic2lkIjoiYzNlMTFjMTEtY2M0OC00MGRlLTkwNmQtMzczYmY3YmExMjZlIn0.0npwK_-KqmvAx-aRSgEccA5sD05b2XFr9C1gpf_vTTQ",
  "access_expires_at": "2026-10-29T16:06:32.466799971Z",
  "refresh_token": "B8QnxDkNK5Z9BtJ1twQbyvRaVu4tJO5aG-oPTPNdIq0",
  "refresh_expires_at": "2026-10-30T03:51:32.466479749Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5e958f0f-2072-4e56-9b61-71db08ad658a` → **200**

```json
{
  "id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6f05e933-1a23-496e-8f8e-68bad36f8005",
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
  "created_at": "2026-10-29T15:51:30.294236Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T18:51:28Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4c1ed28d-df91-47a8-a2da-51651e569b5b",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T15:51:31.510833Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5e958f0f-2072-4e56-9b61-71db08ad658a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T15:51:30.295205Z",
      "actor": {
        "type": "CLIENT",
        "id": "6f05e933-1a23-496e-8f8e-68bad36f8005",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
        "preorder": true,
        "quote_id": "709f068d-a79b-433d-9ad7-d3b136f730d0",
        "pickup_at": "2026-10-29T18:51:28Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "0d3ca3b2-4ee3-491e-9305-4e738212f39f"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T15:51:31.511648Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e958f0f-2072-4e56-9b61-71db08ad658a",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4c1ed28d-df91-47a8-a2da-51651e569b5b"
      },
      "correlation_id": "17cf0b8a-1e0e-4709-8b16-045f9a2ec0f8"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 5e958f0f-2072-4e56-9b61-71db08ad658a, reservation 4c1ed28d-df91-47a8-a2da-51651e569b5b.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21183"
}
```

```json
{
  "challenge_id": "ffdaa789-b0c2-4892-b86a-1d38f752f0a8",
  "expires_at": "2026-10-29T15:56:33.048906085Z",
  "resend_available_at": "2026-10-29T15:51:34.048906085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "598091",
  "sent_at": "2026-10-29T15:51:33.051111854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffdaa789-b0c2-4892-b86a-1d38f752f0a8",
  "code": "598091",
  "device_ref": "sandbox-21183"
}
```

```json
{
  "session_id": "3f35d491-39dd-4ef8-8dea-1ee4adcd068f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTk5MywiaWF0IjoxNzkzMjg5MDkzLCJqdGkiOiI0MTIzMzgzYy05MGQxLTQyNDgtOTI4OS0zNjJlZTlhYTE5NjEiLCJzaWQiOiIzZjM1ZDQ5MS0zOWRkLTRlZjgtOGRlYS0xZWU0YWRjZDA2OGYifQ.EIn69DUQAxfc9ByzOBLb02mlQwbsJ6MZ7ba9xVD-xX0",
  "access_expires_at": "2026-10-29T16:06:33.248952609Z",
  "refresh_token": "KLNJlAPv8Ra7DNSe-PQYtQ3T2vpjIfCJUBKmg24dAJ8",
  "refresh_expires_at": "2026-11-28T15:51:33.248610615Z",
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
  "command_id": "7cefb3e1-6bc7-4311-82ae-a657c668f012",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:33Z",
    "sequence": 1793289093638
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:51:33.652987Z",
  "last_location_at": "2026-10-29T15:51:33.652987Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671332858",
  "device_ref": "sandbox-19318"
}
```

```json
{
  "challenge_id": "ce9e2b97-4d0a-4969-8755-1ff14dbdc20f",
  "expires_at": "2026-10-29T15:56:33.835426331Z",
  "resend_available_at": "2026-10-29T15:51:34.835426331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671332858` → **200**

```json
{
  "phone": "+380671332858",
  "audience": "CLIENT",
  "code": "493507",
  "sent_at": "2026-10-29T15:51:33.837242083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce9e2b97-4d0a-4969-8755-1ff14dbdc20f",
  "code": "493507",
  "device_ref": "sandbox-19318"
}
```

```json
{
  "session_id": "f625d025-6444-4d4f-ac0e-3b6a8712b2d6",
  "subject": {
    "type": "CLIENT",
    "id": "632b274e-094b-466c-ab8e-39c1699733a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MzJiMjc0ZS0wOTRiLTQ2NmMtYWI4ZS0zOWMxNjk5NzMzYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5OTk0LCJpYXQiOjE3OTMyODkwOTQsImp0aSI6ImJmOWNiYWNmLTYwNWMtNDQ0Zi04MmE3LTAxZWI3MGNmYTBiOCIsInNpZCI6ImY2MjVkMDI1LTY0NDQtNGQ0Zi1hYzBlLTNiNmE4NzEyYjJkNiJ9.NgFAkfyHxhPTR7vPSi_WBXScN21OKn_GusY_MRK-bqo",
  "access_expires_at": "2026-10-29T16:06:34.045707545Z",
  "refresh_token": "8g5ETN2dxEtJW_WX12bC4ywRriAVswWPgaiiPpCiwz0",
  "refresh_expires_at": "2026-11-28T15:51:34.045145434Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "625b9f77-9f1b-46b8-ad3f-7ff687517d9f",
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
  "id": "ea005fed-7a71-491a-b67c-2decb3b91107",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:34.257446Z",
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
  "command_id": "540075f4-99f4-492b-ae3a-24b7b828bc3f",
  "quote_id": "ea005fed-7a71-491a-b67c-2decb3b91107",
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
  "id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "632b274e-094b-466c-ab8e-39c1699733a2",
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
  "created_at": "2026-10-29T15:51:34.457183Z",
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
    "id": "f8366135-57fd-4ff0-9541-940737d1b996",
    "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
    "expires_at": "2026-10-29T15:51:49.459675Z",
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

`POST /api/driver/v1/offers/f8366135-57fd-4ff0-9541-940737d1b996/accept` → **200**

```json
{
  "command_id": "56a5b318-e405-4987-b8bd-5ca395e8d495"
}
```

```json
{
  "id": "1bb38f23-41d1-4d6e-ab9d-5f86db9ee65e",
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c07520c-e758-46c9-b779-1b7a0b8283d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c07520c-e758-46c9-b779-1b7a0b8283d1",
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "assignment_id": "1bb38f23-41d1-4d6e-ab9d-5f86db9ee65e",
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

`POST /api/driver/v1/work-sessions/51447c54-e235-4a7c-822f-a3d9710b1ce0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:35Z",
    "sequence": 1793289095200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:51:35.215874Z",
  "last_location_at": "2026-10-29T15:51:35.215874Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c07520c-e758-46c9-b779-1b7a0b8283d1",
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "assignment_id": "1bb38f23-41d1-4d6e-ab9d-5f86db9ee65e",
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

`POST /api/driver/v1/trips/4c07520c-e758-46c9-b779-1b7a0b8283d1/arrive` → **200**

```json
{
  "command_id": "101fefb3-3d53-472a-8ca0-619f6851d61b",
  "expected_version": 0
}
```

```json
{
  "id": "4c07520c-e758-46c9-b779-1b7a0b8283d1",
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "assignment_id": "1bb38f23-41d1-4d6e-ab9d-5f86db9ee65e",
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
  "arrived_at": "2026-10-29T15:51:35.585685Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4c07520c-e758-46c9-b779-1b7a0b8283d1/start` → **200**

```json
{
  "command_id": "c5c6ace1-960e-4ba4-8d46-8bd87e29e27f",
  "expected_version": 1
}
```

```json
{
  "id": "4c07520c-e758-46c9-b779-1b7a0b8283d1",
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "assignment_id": "1bb38f23-41d1-4d6e-ab9d-5f86db9ee65e",
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
  "arrived_at": "2026-10-29T15:51:35.585685Z",
  "started_at": "2026-10-29T15:51:35.816939Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/51447c54-e235-4a7c-822f-a3d9710b1ce0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:36Z",
    "sequence": 1793289096994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:51:36.024905Z",
  "last_location_at": "2026-10-29T15:51:36.024905Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4c07520c-e758-46c9-b779-1b7a0b8283d1/complete` → **200**

```json
{
  "command_id": "7c32acbd-c248-4c2a-9d2a-9305b495137b",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:51:36Z",
  "cash_received": true
}
```

```json
{
  "id": "4c07520c-e758-46c9-b779-1b7a0b8283d1",
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "assignment_id": "1bb38f23-41d1-4d6e-ab9d-5f86db9ee65e",
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
  "arrived_at": "2026-10-29T15:51:35.585685Z",
  "started_at": "2026-10-29T15:51:35.816939Z",
  "completed_at": "2026-10-29T15:51:36.213087Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/2ea15d8a-afab-4740-b9fc-c54f1c1b594f/rating` → **200**

```json
{
  "command_id": "0ba471f5-d722-463e-8995-9654b86b914b",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "score": 5,
  "created_at": "2026-10-29T15:51:36.415783834Z"
}
```

`POST /api/driver/v1/orders/2ea15d8a-afab-4740-b9fc-c54f1c1b594f/rating` → **200**

```json
{
  "command_id": "b512cd5f-b936-40ae-85e8-36eda24fe5cf",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
  "score": 4,
  "created_at": "2026-10-29T15:51:36.599104591Z"
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
  "session_id": "74a08a03-e480-4aa5-a9ae-cc9a6248be6e",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTcsImlhdCI6MTc5MzI4OTA5NywianRpIjoiODg1MDk0ODUtY2U4My00NjhmLTg2NTEtZTc4OGUxNTMwNGE5Iiwic2lkIjoiNzRhMDhhMDMtZTQ4MC00YWE1LWE5YWUtY2M5YTYyNDhiZTZlIn0.gYBLya4bpmq0vPny_9wSe9ZbLVX-_46tUUBoSEjlRQ0",
  "access_expires_at": "2026-10-29T16:06:37.183683973Z",
  "refresh_token": "dmQDnmNCpOn5-PFn0bifVrklSlt2x4UVa5Kkvekf4nk",
  "refresh_expires_at": "2026-10-30T03:51:37.183329722Z",
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
  "session_id": "3224a08a-9399-4c30-a61f-8c38894f38d8",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTcsImlhdCI6MTc5MzI4OTA5NywianRpIjoiOTc1MDIyYjYtZTFmYS00MDI2LTkzYjItMGNlMjAwOWFjMDY5Iiwic2lkIjoiMzIyNGEwOGEtOTM5OS00YzMwLWE2MWYtOGMzODg5NGYzOGQ4In0.xYfHoqUYeQuy-SySzaPSxakT5SuQeUt9hmVa3NgsTwo",
  "access_expires_at": "2026-10-29T16:06:37.588835361Z",
  "refresh_token": "eSiO-oOx2T8JVwa9toYOFtXvxdUrQsYjLZ2rzqPsF60",
  "refresh_expires_at": "2026-10-30T03:51:37.58791367Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2ea15d8a-afab-4740-b9fc-c54f1c1b594f/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
      "author_type": "RIDER",
      "author_id": "632b274e-094b-466c-ab8e-39c1699733a2",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T15:51:36.415784Z"
    },
    {
      "order_id": "2ea15d8a-afab-4740-b9fc-c54f1c1b594f",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "632b274e-094b-466c-ab8e-39c1699733a2",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T15:51:36.599105Z"
    }
  ]
}
```

Done: ratings for order 2ea15d8a-afab-4740-b9fc-c54f1c1b594f.

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
  "session_id": "1c58ad4c-9fb9-47b5-8b6f-323475a7ab12",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk5OTgsImlhdCI6MTc5MzI4OTA5OCwianRpIjoiOTJiMzYyYmYtMDQ3NS00MzhkLTkzZDgtZWI0NTAxOTFmN2ZiIiwic2lkIjoiMWM1OGFkNGMtOWZiOS00N2I1LThiNmYtMzIzNDc1YTdhYjEyIn0.hTEXJXJVa-WD-eftEOgETvAtXCd5crPcePMGOd4iUNs",
  "access_expires_at": "2026-10-29T16:06:38.216506885Z",
  "refresh_token": "rZuseWHUgEqtJeuRcluDnBCmy-qchp_59dTnTIfx_RQ",
  "refresh_expires_at": "2026-10-30T03:51:38.216146254Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c47cc539-e487-42ba-9e5b-08d3fc014975",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "9abbf962-88d7-48e0-878c-5198e91df919",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:51:38.403399Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9abbf962-88d7-48e0-878c-5198e91df919` → **200**

```json
{
  "id": "9abbf962-88d7-48e0-878c-5198e91df919",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:51:38.403399Z",
  "ready_at": "2026-10-29T15:51:38.501884Z",
  "expires_at": "2026-10-30T15:51:38.501884Z"
}
```

`GET /api/admin/v1/reports/exports/9abbf962-88d7-48e0-878c-5198e91df919/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ce678118-0b51-44a8-b9cf-4ddb8bd3b71f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "2798d64f-f186-47ad-9efa-0c9f73a5ea3b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:51:38.810468Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2798d64f-f186-47ad-9efa-0c9f73a5ea3b` → **200**

```json
{
  "id": "2798d64f-f186-47ad-9efa-0c9f73a5ea3b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:51:38.810468Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2798d64f-f186-47ad-9efa-0c9f73a5ea3b` → **200**

```json
{
  "id": "2798d64f-f186-47ad-9efa-0c9f73a5ea3b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:51:38.810468Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2798d64f-f186-47ad-9efa-0c9f73a5ea3b` → **200**

```json
{
  "id": "2798d64f-f186-47ad-9efa-0c9f73a5ea3b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:51:38.810468Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2798d64f-f186-47ad-9efa-0c9f73a5ea3b` → **200**

```json
{
  "id": "2798d64f-f186-47ad-9efa-0c9f73a5ea3b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:51:38.810468Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2798d64f-f186-47ad-9efa-0c9f73a5ea3b` → **200**

```json
{
  "id": "2798d64f-f186-47ad-9efa-0c9f73a5ea3b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:51:38.810468Z",
  "ready_at": "2026-10-29T15:51:43.507201Z",
  "expires_at": "2026-10-30T15:51:43.507201Z"
}
```

`GET /api/admin/v1/reports/exports/2798d64f-f186-47ad-9efa-0c9f73a5ea3b/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c8b121d5-6183-47fe-a054-7762ccf89a8c` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c8b121d5-6183-47fe-a054-7762ccf89a8c",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d3620db9-d220-4795-a604-f42adcc6e0dd"
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
  "device_ref": "sandbox-12028"
}
```

```json
{
  "challenge_id": "0157eb4b-7486-4593-a9fd-03a8bc91d4e6",
  "expires_at": "2026-10-29T15:56:44.164152938Z",
  "resend_available_at": "2026-10-29T15:51:45.164152938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "738146",
  "sent_at": "2026-10-29T15:51:44.166562821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0157eb4b-7486-4593-a9fd-03a8bc91d4e6",
  "code": "738146",
  "device_ref": "sandbox-12028"
}
```

```json
{
  "session_id": "ce0458d0-2c0d-4ed6-a983-841c8bc1d123",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAwNCwiaWF0IjoxNzkzMjg5MTA0LCJqdGkiOiI2ZWIxMDRmZS1iOTEwLTRhNGItYjY4Zi0yMzNmZGVhOTFlMTkiLCJzaWQiOiJjZTA0NThkMC0yYzBkLTRlZDYtYTk4My04NDFjOGJjMWQxMjMifQ.XW0K3D3VYrCrdA11dPJUaAp1EbyfxHcBjkVLh_zaOck",
  "access_expires_at": "2026-10-29T16:06:44.422542643Z",
  "refresh_token": "vskwvdFR4wP-_GONg6j5muQdu6O8-Q_WT1IFSctbOpk",
  "refresh_expires_at": "2026-11-28T15:51:44.422188936Z",
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
  "command_id": "64d7a1f0-6938-40e6-a8e8-ce13c3cc423e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:44Z",
    "sequence": 1793289104990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "efdb64f7-a785-4895-bf93-cf537aee3948",
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
  "last_heartbeat_at": "2026-10-29T15:51:45.006643Z",
  "last_location_at": "2026-10-29T15:51:45.006643Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "dac0d806-ecc6-4044-998a-319f1bf105da",
  "points": [
    {
      "sequence": 1793289107195,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:50:47Z"
    },
    {
      "sequence": 1793289107201,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:51:47Z"
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
  "session_id": "13d6ac31-568f-4e96-9147-55876715b136",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMDcsImlhdCI6MTc5MzI4OTEwNywianRpIjoiMjZlNzU1YTItNGUyYS00MzA0LWFkOWEtMjllYTc1NTg1YzlkIiwic2lkIjoiMTNkNmFjMzEtNTY4Zi00ZTk2LTkxNDctNTU4NzY3MTViMTM2In0.kXUYW2QvIbnD14k2lLMdHQ-MphXZXryl2y5321JWLDs",
  "access_expires_at": "2026-10-29T16:06:47.637676263Z",
  "refresh_token": "3zpSub4Y9hbLsoui_ILMUUSs34SbN-apgs9fcOWMHZw",
  "refresh_expires_at": "2026-10-30T03:51:47.637341084Z",
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
      "id": "364bd2a7-6775-46d8-9463-3a0823e7e11f",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T15:51:47Z",
        "track_point_id": "4af3bfc8-9ec6-4668-b8d1-1818415715e3",
        "work_session_id": "efdb64f7-a785-4895-bf93-cf537aee3948"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T15:51:47Z",
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

`POST /api/admin/v1/driver-risk-flags/364bd2a7-6775-46d8-9463-3a0823e7e11f/confirm` → **200**

```json
{
  "command_id": "94d83fac-532b-43de-93af-59b51a469273",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "364bd2a7-6775-46d8-9463-3a0823e7e11f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T15:51:47Z",
    "track_point_id": "4af3bfc8-9ec6-4668-b8d1-1818415715e3",
    "work_session_id": "efdb64f7-a785-4895-bf93-cf537aee3948"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T15:51:47Z",
  "reason": null,
  "reviewed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reviewed_at": "2026-10-29T15:51:49.457914Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/364bd2a7-6775-46d8-9463-3a0823e7e11f/dismiss` → **409**

```json
{
  "command_id": "be89f896-fce2-4d85-b37c-7cb9a52e66ba",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/364bd2a7-6775-46d8-9463-3a0823e7e11f/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a6244458-7712-4adf-ae69-7589e90ba814"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "f23be3f5-72dc-4805-8f2b-e211b2be794a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "946224c0-bcb0-4f56-a60d-7884f7d9d6a4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "raised_at": "2026-10-29T15:51:49.870914Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/946224c0-bcb0-4f56-a60d-7884f7d9d6a4/dismiss` → **200**

```json
{
  "command_id": "cecaf632-cb0f-4236-80be-f6f3aef6c3ab",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "946224c0-bcb0-4f56-a60d-7884f7d9d6a4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "raised_at": "2026-10-29T15:51:49.870914Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reviewed_at": "2026-10-29T15:51:50.077152Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "18663fab-eb8e-4a4b-a251-24d6ca1be0b1",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "364bd2a7-6775-46d8-9463-3a0823e7e11f"
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
      "actor_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:51:50.326478Z"
    }
  ]
}
```

Done: flag 364bd2a7-6775-46d8-9463-3a0823e7e11f confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b768fa34-7e8d-4097-820e-c47668ed82c6",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTAsImlhdCI6MTc5MzI4OTExMCwianRpIjoiNDk3YzU1MzktODMzOC00NTZjLTgyYmQtODNjNzQ0YWIzMjFhIiwic2lkIjoiYjc2OGZhMzQtN2U4ZC00MDk3LTgyMGUtYzQ3NjY4ZWQ4MmM2In0.fazYvXHe5TJ4fdyYWXGJEuQnhUfhOwcHcFDyOgYwGSA",
  "access_expires_at": "2026-10-29T16:06:50.928227014Z",
  "refresh_token": "yxH1MM0k5usM-oxci3iwHBYDKqm5lLh9hLIWYD88ynM",
  "refresh_expires_at": "2026-10-30T03:51:50.927831803Z",
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
      "actor_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:51:50.326478Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "10abbc41-04c3-4b7b-a5a6-c8ee0182f2f4",
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
  "session_id": "efdb64f7-a785-4895-bf93-cf537aee3948",
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
  "last_heartbeat_at": "2026-10-29T15:51:45.006643Z",
  "last_location_at": "2026-10-29T15:51:45.006643Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/efdb64f7-a785-4895-bf93-cf537aee3948/close` → **200**

```json
{
  "command_id": "ffdcea24-a829-4425-90fe-6305a09816c1",
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
  "session_id": "cfcf4ec4-9593-4ced-a4ec-3439d425278a",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTIsImlhdCI6MTc5MzI4OTExMiwianRpIjoiNjI3ZThlNGItMDZjZi00Y2FlLWIxNWQtNDEwOTg0MzJkMTBiIiwic2lkIjoiY2ZjZjRlYzQtOTU5My00Y2VkLWE0ZWMtMzQzOWQ0MjUyNzhhIn0.UtJFRCUPO4vkx2kiNxzoiKErflJBmECD3-ct3OIMCXE",
  "access_expires_at": "2026-10-29T16:06:52.118158992Z",
  "refresh_token": "YU-1JrM3sAoi1vIaQTvysQMtarjBsDdEGEGr9W19POQ",
  "refresh_expires_at": "2026-10-30T03:51:52.117749952Z",
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
  "command_id": "5855444d-5989-4664-8ba3-2c5681581bac",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:51:52.502677Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "5855444d-5989-4664-8ba3-2c5681581bac",
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
  "changed_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:51:52.502677Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48446829874",
  "device_ref": "sandbox-12993"
}
```

```json
{
  "challenge_id": "4b6f254c-90a5-408e-8f35-ff24299c6a04",
  "expires_at": "2026-10-29T15:56:52.901409654Z",
  "resend_available_at": "2026-10-29T15:51:53.901409654Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48446829874` → **200**

```json
{
  "phone": "+48446829874",
  "audience": "CLIENT",
  "code": "736231",
  "sent_at": "2026-10-29T15:51:52.903362012Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b6f254c-90a5-408e-8f35-ff24299c6a04",
  "code": "736231",
  "device_ref": "sandbox-12993"
}
```

```json
{
  "session_id": "38f63de8-6b46-48da-818f-44e3dd1d56a5",
  "subject": {
    "type": "CLIENT",
    "id": "57ed9c6f-c6cb-4a32-a3a0-44593f0f7581"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1N2VkOWM2Zi1jNmNiLTRhMzItYTNhMC00NDU5M2YwZjc1ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDEzLCJpYXQiOjE3OTMyODkxMTMsImp0aSI6IjA3MjU4Zjk2LTRmY2MtNGI4ZC05YWRjLTc4YzcwMGNjYTA2ZiIsInNpZCI6IjM4ZjYzZGU4LTZiNDYtNDhkYS04MThmLTQ0ZTNkZDFkNTZhNSJ9.-jcqYdfWnaWwV_d1pHlNPween0bRq7jDSB89jsB55G8",
  "access_expires_at": "2026-10-29T16:06:53.12011605Z",
  "refresh_token": "zLUlcflakNZV7FpToy81t-f-W6bXF-4hxhwhmz3TJPY",
  "refresh_expires_at": "2026-11-28T15:51:53.11969493Z",
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
  "correlation_id": "8524657c-9cc3-42db-b3ff-e1a722194cae"
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
  "device_ref": "sandbox-3178"
}
```

```json
{
  "challenge_id": "9baff897-3fa0-4381-93b6-399471a49f2f",
  "expires_at": "2026-10-29T15:56:53.701209611Z",
  "resend_available_at": "2026-10-29T15:51:54.701209611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "577576",
  "sent_at": "2026-10-29T15:51:53.703087086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9baff897-3fa0-4381-93b6-399471a49f2f",
  "code": "577576",
  "device_ref": "sandbox-3178"
}
```

```json
{
  "session_id": "0cbadf21-d7c0-4a1f-bfa4-9d251272b38c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAxMywiaWF0IjoxNzkzMjg5MTEzLCJqdGkiOiI0NjZmZjUzYy1hMWI1LTQ2MjgtYTk2Ni01MzgwZTEyNDk4OWQiLCJzaWQiOiIwY2JhZGYyMS1kN2MwLTRhMWYtYmZhNC05ZDI1MTI3MmIzOGMifQ.NFnJIjgtJbN9RqiwPL9yJ7m3wsvk-lIcjVgesYx8pIA",
  "access_expires_at": "2026-10-29T16:06:53.930524077Z",
  "refresh_token": "lXu37hb_K0cCgl-_amfZ8ZlpSb-e-TFwlHHzHI28o5I",
  "refresh_expires_at": "2026-11-28T15:51:53.930009851Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5c6c15d3-250b-4f68-bef2-9f463d2a842f",
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
  "last_heartbeat_at": "2026-10-29T15:51:31.125618Z",
  "last_location_at": "2026-10-29T15:51:31.125618Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5c6c15d3-250b-4f68-bef2-9f463d2a842f/handover` → **200**

```json
{
  "command_id": "e025f269-91f9-4a6a-9db7-c5a61e9aa751",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5c6c15d3-250b-4f68-bef2-9f463d2a842f",
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
  "last_heartbeat_at": "2026-10-29T15:51:31.125618Z",
  "last_location_at": "2026-10-29T15:51:31.125618Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5c6c15d3-250b-4f68-bef2-9f463d2a842f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:51:54Z",
    "sequence": 1793289114522
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5c6c15d3-250b-4f68-bef2-9f463d2a842f",
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
  "last_heartbeat_at": "2026-10-29T15:51:54.538032Z",
  "last_location_at": "2026-10-29T15:51:54.538032Z",
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
  "session_id": "5c6c15d3-250b-4f68-bef2-9f463d2a842f",
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
  "last_heartbeat_at": "2026-10-29T15:51:54.538032Z",
  "last_location_at": "2026-10-29T15:51:54.538032Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5c6c15d3-250b-4f68-bef2-9f463d2a842f/close` → **200**

```json
{
  "command_id": "0eb440b4-3e04-415d-a3fa-ee740811b121",
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
  "correlation_id": "fd9c01de-029c-4505-87d6-630d7789aacb"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670491055",
  "device_ref": "sandbox-3298"
}
```

```json
{
  "challenge_id": "9b9893ae-220c-474d-89c7-f99abc93d118",
  "expires_at": "2026-10-29T15:56:55.535777622Z",
  "resend_available_at": "2026-10-29T15:51:56.535777622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670491055` → **200**

```json
{
  "phone": "+380670491055",
  "audience": "CLIENT",
  "code": "785557",
  "sent_at": "2026-10-29T15:51:55.537716257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b9893ae-220c-474d-89c7-f99abc93d118",
  "code": "785557",
  "device_ref": "sandbox-3298"
}
```

```json
{
  "session_id": "dac733c9-5f82-4887-b913-d120757ff1a1",
  "subject": {
    "type": "CLIENT",
    "id": "15db1df5-f1db-4d7d-838d-403afec2d1a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWRiMWRmNS1mMWRiLTRkN2QtODM4ZC00MDNhZmVjMmQxYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDE1LCJpYXQiOjE3OTMyODkxMTUsImp0aSI6ImI2ZmE5MGM2LTA1YTMtNDIyYi1iYTc3LTdmMDE0NThmZjFlMyIsInNpZCI6ImRhYzczM2M5LTVmODItNDg4Ny1iOTEzLWQxMjA3NTdmZjFhMSJ9.vAgG1CllpxKYX-3GbjemH1RlNUvWHaN6XjdhqpjcbGk",
  "access_expires_at": "2026-10-29T16:06:55.756579132Z",
  "refresh_token": "SHYQ0axqKI-t1gXSEPSNDjEKeC8bTP8mfnoNFepeqMk",
  "refresh_expires_at": "2026-11-28T15:51:55.756218314Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "a1af00d3-f6f9-4df5-b475-223b4c20a1a2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5ff6ed41-2f8d-4ba6-a947-709238d4638c",
  "upload_path": "/api/rider/v1/uploads/5ff6ed41-2f8d-4ba6-a947-709238d4638c",
  "expires_at": "2026-10-29T16:06:55.957923478Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/5ff6ed41-2f8d-4ba6-a947-709238d4638c` → **200**

```json
{
  "file_id": "5ff6ed41-2f8d-4ba6-a947-709238d4638c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "d7070352-6516-4c10-8b21-6504d733429a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "5ff6ed41-2f8d-4ba6-a947-709238d4638c"
  ]
}
```

```json
{
  "id": "4ad10bb7-365d-4a6d-92d9-f93908e602c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:51:56.192608Z",
  "updated_at": "2026-10-29T15:51:56.192608Z",
  "respond_by": "2026-10-29T19:51:56.192608Z",
  "messages": [
    {
      "id": "2070e492-ea16-4ee6-9619-ffb465346f94",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:51:56.193395Z",
      "attachments": [
        {
          "file_id": "5ff6ed41-2f8d-4ba6-a947-709238d4638c",
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
  "session_id": "2f95204d-4080-430f-b1e8-38f9ffc31cb9",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTYsImlhdCI6MTc5MzI4OTExNiwianRpIjoiNWU0ZWVkMmQtOTMxZC00OWVjLWE1N2UtZDg5YzJkN2RjYWFjIiwic2lkIjoiMmY5NTIwNGQtNDA4MC00MzBmLWIxZTgtMzhmOWZmYzMxY2I5In0.TQLgYa9LZdKuV8vdihe2HIXitB3ABqQg1X1qv9FXup8",
  "access_expires_at": "2026-10-29T16:06:56.610871919Z",
  "refresh_token": "351nq_Ej1T127F7wxR5JdFS05Qw8dXTJkOoE49vvNjI",
  "refresh_expires_at": "2026-10-30T03:51:56.610509429Z",
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
  "session_id": "7c5d139e-fa8f-4e4a-961e-9abe22b2ee13",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMTcsImlhdCI6MTc5MzI4OTExNywianRpIjoiZTc2OWZmOTMtYjA0NC00ZmJmLWJkMmItYmNjMWNhMjVjMTllIiwic2lkIjoiN2M1ZDEzOWUtZmE4Zi00ZTRhLTk2MWUtOWFiZTIyYjJlZTEzIn0.GgUzauLxn5sT6VN0Tr42ngfa56is65mInJgByAv33vI",
  "access_expires_at": "2026-10-29T16:06:57.02264057Z",
  "refresh_token": "cw3w-ACWxUSAoSPl5yL5KeyRFdUNO2xMXqzo6LVWP-4",
  "refresh_expires_at": "2026-10-30T03:51:57.022327975Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/4ad10bb7-365d-4a6d-92d9-f93908e602c8/attachments/5ff6ed41-2f8d-4ba6-a947-709238d4638c` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0cef95ae-917d-4171-b9ef-c089cc53fbe8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "cb4bd19e-5c6b-4553-81ed-eafa6e4278d2",
  "upload_path": "/api/operator/v1/uploads/cb4bd19e-5c6b-4553-81ed-eafa6e4278d2",
  "expires_at": "2026-10-29T16:06:57.223656977Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/cb4bd19e-5c6b-4553-81ed-eafa6e4278d2` → **200**

```json
{
  "file_id": "cb4bd19e-5c6b-4553-81ed-eafa6e4278d2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/4ad10bb7-365d-4a6d-92d9-f93908e602c8` → **200**

```json
{
  "id": "4ad10bb7-365d-4a6d-92d9-f93908e602c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:51:56.192608Z",
  "updated_at": "2026-10-29T15:51:56.192608Z",
  "respond_by": "2026-10-29T19:51:56.192608Z",
  "messages": [
    {
      "id": "2070e492-ea16-4ee6-9619-ffb465346f94",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:51:56.193395Z",
      "attachments": [
        {
          "file_id": "5ff6ed41-2f8d-4ba6-a947-709238d4638c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/4ad10bb7-365d-4a6d-92d9-f93908e602c8/comments` → **200**

```json
{
  "command_id": "4efb569b-82a6-456e-977e-f7a5c6e0250a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "cb4bd19e-5c6b-4553-81ed-eafa6e4278d2"
  ]
}
```

```json
{
  "id": "4ad10bb7-365d-4a6d-92d9-f93908e602c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:51:56.192608Z",
  "updated_at": "2026-10-29T15:51:57.627589Z",
  "respond_by": "2026-10-29T19:51:56.192608Z",
  "messages": [
    {
      "id": "2070e492-ea16-4ee6-9619-ffb465346f94",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:51:56.193395Z",
      "attachments": [
        {
          "file_id": "5ff6ed41-2f8d-4ba6-a947-709238d4638c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e7d2943f-2f56-4ffa-9ea8-cd7777bbe406",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:51:57.627281Z",
      "attachments": [
        {
          "file_id": "cb4bd19e-5c6b-4553-81ed-eafa6e4278d2",
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

`GET /api/rider/v1/support/cases/4ad10bb7-365d-4a6d-92d9-f93908e602c8` → **200**

```json
{
  "id": "4ad10bb7-365d-4a6d-92d9-f93908e602c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:51:56.192608Z",
  "updated_at": "2026-10-29T15:51:57.627589Z",
  "respond_by": "2026-10-29T19:51:56.192608Z",
  "messages": [
    {
      "id": "2070e492-ea16-4ee6-9619-ffb465346f94",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "15db1df5-f1db-4d7d-838d-403afec2d1a5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:51:56.193395Z",
      "attachments": [
        {
          "file_id": "5ff6ed41-2f8d-4ba6-a947-709238d4638c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e7d2943f-2f56-4ffa-9ea8-cd7777bbe406",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:51:57.627281Z",
      "attachments": [
        {
          "file_id": "cb4bd19e-5c6b-4553-81ed-eafa6e4278d2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/4ad10bb7-365d-4a6d-92d9-f93908e602c8/attachments/cb4bd19e-5c6b-4553-81ed-eafa6e4278d2` → **200**

Done: support case 4ad10bb7-365d-4a6d-92d9-f93908e602c8, rider attachment 5ff6ed41-2f8d-4ba6-a947-709238d4638c, operator attachment cb4bd19e-5c6b-4553-81ed-eafa6e4278d2.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738544696",
  "device_ref": "sandbox-10218"
}
```

```json
{
  "challenge_id": "ab7a55bf-fde4-4a9d-b2b4-ff5c303fc703",
  "expires_at": "2026-10-29T15:56:58.036952359Z",
  "resend_available_at": "2026-10-29T15:51:59.036952359Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738544696` → **200**

```json
{
  "phone": "+380738544696",
  "audience": "CLIENT",
  "code": "657741",
  "sent_at": "2026-10-29T15:51:58.038821713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab7a55bf-fde4-4a9d-b2b4-ff5c303fc703",
  "code": "657741",
  "device_ref": "sandbox-10218"
}
```

```json
{
  "session_id": "94a21727-ca28-4ff1-9d2b-5b9a892081ca",
  "subject": {
    "type": "CLIENT",
    "id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiY2JiNzJlOC04ZjJlLTQ4YjItYjdkNy04ODhhNTg1YmY5MzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDE4LCJpYXQiOjE3OTMyODkxMTgsImp0aSI6Ijc0ZDhhNWE5LWM0ZjgtNDI5ZC1hMGYzLTU2ZTk2ZTc1NjM3ZiIsInNpZCI6Ijk0YTIxNzI3LWNhMjgtNGZmMS05ZDJiLTViOWE4OTIwODFjYSJ9.QIJim1gJtMmQzfiWVaasIdsdA4l_UbZC71VGsC2Pxvg",
  "access_expires_at": "2026-10-29T16:06:58.245980965Z",
  "refresh_token": "jdTzXYPpNQLd7lQcGdUv62SAgIahRcc1Hns9HUHzW50",
  "refresh_expires_at": "2026-11-28T15:51:58.245653448Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e46bf8a6-92d4-43f7-9979-e7ec59614664",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "63096e92-005b-485c-a447-4a89a5fe8e33",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-63096e92-005b-485c-a447-4a89a5fe8e33",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c0ad0c7de3ab028b5471453e64486bb2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=63096e92-005b-485c-a447-4a89a5fe8e33",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738544696"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=63096e92-005b-485c-a447-4a89a5fe8e33",
  "expires_at": "2026-10-29T16:21:58.442676Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/63096e92-005b-485c-a447-4a89a5fe8e33` → **200**

```json
{
  "id": "63096e92-005b-485c-a447-4a89a5fe8e33",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:21:58.442676Z",
  "card": {
    "id": "04b0a2f6-43b0-45b0-b250-6242882ef79d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2072",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:51:58.631342Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a9cc947-e3df-40e6-9d6c-7a5208c7eb68",
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
  "id": "bc66da40-68dd-42ba-96c7-dad9995ea76f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:56:58.836772Z",
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
  "command_id": "becdbfe7-4059-403c-b5e4-247c2f03f67b",
  "quote_id": "bc66da40-68dd-42ba-96c7-dad9995ea76f",
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
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1` → **200**

```json
{
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1` → **200**

```json
{
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
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

`GET /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1` → **200**

```json
{
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1/switch-to-cash` → **200**

```json
{
  "command_id": "8241415c-2f9a-4166-98b8-8f1875a141c7",
  "expected_version": 3
}
```

```json
{
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1/switch-to-cash` → **409**

```json
{
  "command_id": "f7f61a37-fe81-4ec1-91aa-012b777ea8f9",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "917412d7-6cda-4a07-9c8d-935d2de7e641"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1` → **200**

```json
{
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/861692d0-8069-4ed1-956a-704645cd62b1/cancel` → **200**

```json
{
  "command_id": "7c0308e8-fa44-48e3-bf9a-a32b36c03540",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "861692d0-8069-4ed1-956a-704645cd62b1",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "bcbb72e8-8f2e-48b2-b7d7-888a585bf939",
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
  "created_at": "2026-10-29T15:51:59.031772Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
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
  "session_id": "77422e15-6e2c-49a7-9d43-7b796075177c",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMjEsImlhdCI6MTc5MzI4OTEyMSwianRpIjoiOGU4N2M0NWYtODI2Ny00YzgxLWIxMGYtYjVhYjA3NDE3ZDI4Iiwic2lkIjoiNzc0MjJlMTUtNmUyYy00OWE3LTlkNDMtN2I3OTYwNzUxNzdjIn0.H1UbRF2nYBbayNUVD3F3Q7Z06NfaTfu9A5BuOmfO3YE",
  "access_expires_at": "2026-10-29T16:07:01.862039412Z",
  "refresh_token": "JIfalz16sxIEKqrWhKyw433CUAgxP4dU8NpH9dmQ3oA",
  "refresh_expires_at": "2026-10-30T03:52:01.861691072Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22191"
}
```

```json
{
  "challenge_id": "c21d970f-626e-4b05-acfc-267bfd5c5963",
  "expires_at": "2026-10-29T15:57:02.047995054Z",
  "resend_available_at": "2026-10-29T15:52:03.047995054Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "656616",
  "sent_at": "2026-10-29T15:52:02.04982642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c21d970f-626e-4b05-acfc-267bfd5c5963",
  "code": "656616",
  "device_ref": "sandbox-22191"
}
```

```json
{
  "session_id": "8e1f223f-0c18-48c9-8765-9cad82aee780",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAyMiwiaWF0IjoxNzkzMjg5MTIyLCJqdGkiOiIwNzZiZTVmMy1jM2M5LTQ3ZjItYmNjMi0xMmVkNGE3MjhmZWEiLCJzaWQiOiI4ZTFmMjIzZi0wYzE4LTQ4YzktODc2NS05Y2FkODJhZWU3ODAifQ.-oE6i36Er_GHckEDjhFNR6VNjv5qD6ptwXlDN4M6w4w",
  "access_expires_at": "2026-10-29T16:07:02.259342823Z",
  "refresh_token": "4kGHfzRv_PEn-j86pw9taugoQ4s71B9EQ02DoBomV4U",
  "refresh_expires_at": "2026-11-28T15:52:02.258963841Z",
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
      "actor_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:51:50.326478Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T15:51:51.319546Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "9cba38e0-013a-4883-ae6a-43656cc0e40c",
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
  "device_ref": "sandbox-4057"
}
```

```json
{
  "challenge_id": "957e6147-94b6-4afc-a9af-220ca0c7ba6d",
  "expires_at": "2026-10-29T15:57:03.022340964Z",
  "resend_available_at": "2026-10-29T15:52:04.022340964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "885700",
  "sent_at": "2026-10-29T15:52:03.024830566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "957e6147-94b6-4afc-a9af-220ca0c7ba6d",
  "code": "885700",
  "device_ref": "sandbox-4057"
}
```

```json
{
  "session_id": "2d6a6ff6-debc-4fc0-81cc-91d3d1194b9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAyMywiaWF0IjoxNzkzMjg5MTIzLCJqdGkiOiI4NzY3N2Q0Yy02NjNmLTRkNGItODc4Zi0xMjk3M2M3ODdjMTAiLCJzaWQiOiIyZDZhNmZmNi1kZWJjLTRmYzAtODFjYy05MWQzZDExOTRiOWMifQ.2NaVf3i2kEtPv_sCIhM7cmWvnj63P2cG6Iblvqi6z8U",
  "access_expires_at": "2026-10-29T16:07:03.242058901Z",
  "refresh_token": "7IqI2twlr5Y5tznv4goVnXtZpyX-o6d8XY2AeF7EVYk",
  "refresh_expires_at": "2026-11-28T15:52:03.241697841Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:51:36.024905Z",
  "last_location_at": "2026-10-29T15:51:36.024905Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/51447c54-e235-4a7c-822f-a3d9710b1ce0/handover` → **200**

```json
{
  "command_id": "fd71a655-c77d-4bda-b249-e2bd488bf1be",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:51:36.024905Z",
  "last_location_at": "2026-10-29T15:51:36.024905Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/51447c54-e235-4a7c-822f-a3d9710b1ce0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:03Z",
    "sequence": 1793289123810
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:52:03.826117Z",
  "last_location_at": "2026-10-29T15:52:03.826117Z",
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
  "command_id": "1b5499fb-316e-42ab-989a-2e0ec9612b4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:04Z",
    "sequence": 1793289124252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3593fb62-45f0-43ef-a1f7-67f3cb9805c3",
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
  "last_heartbeat_at": "2026-10-29T15:52:04.268008Z",
  "last_location_at": "2026-10-29T15:52:04.268008Z",
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
  "session_id": "3af429d7-95d7-4186-8dc6-763d01149ca2",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAwMjQsImlhdCI6MTc5MzI4OTEyNCwianRpIjoiMTZkNDdmYzctNGFlYS00YWMxLWFjMjYtZDNhODNiNzNjZjcwIiwic2lkIjoiM2FmNDI5ZDctOTVkNy00MTg2LThkYzYtNzYzZDAxMTQ5Y2EyIn0.3_B9wyv2FBlvGBZUyB-OsqH2YnOYv0w1KkMmSVv-Fvo",
  "access_expires_at": "2026-10-29T16:07:04.667490721Z",
  "refresh_token": "14XyX7JQINo7gcVOSgkImLmtX5RWHJKuzN1ayrglgec",
  "refresh_expires_at": "2026-10-30T03:52:04.667147028Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0b713565-d560-44df-a31c-4ec2daaa840a",
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
  "id": "c04fea25-32a0-4e89-9631-0993ebebcf1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:04.858046Z",
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
  "command_id": "b578e4be-806b-4bd6-9f0a-3f9798256cce",
  "quote_id": "c04fea25-32a0-4e89-9631-0993ebebcf1c",
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
  "id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
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
  "created_at": "2026-10-29T15:52:05.058574Z",
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
    "id": "f15915ff-fc7f-4a64-b074-ffe6c826c230",
    "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
    "expires_at": "2026-10-29T15:52:20.061082Z",
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

`POST /api/driver/v1/offers/f15915ff-fc7f-4a64-b074-ffe6c826c230/accept` → **200**

```json
{
  "command_id": "dcced30c-6005-4ac7-a773-3015e7a33d3b"
}
```

```json
{
  "id": "32df2f97-3624-43a3-8bf5-5d26c17a5b66",
  "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8654ce4-2541-4a14-a555-94c6a927fd8d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8654ce4-2541-4a14-a555-94c6a927fd8d",
  "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
  "assignment_id": "32df2f97-3624-43a3-8bf5-5d26c17a5b66",
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

`POST /api/driver/v1/work-sessions/3593fb62-45f0-43ef-a1f7-67f3cb9805c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:52:06Z",
    "sequence": 1793289126183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3593fb62-45f0-43ef-a1f7-67f3cb9805c3",
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
  "last_heartbeat_at": "2026-10-29T15:52:06.034095Z",
  "last_location_at": "2026-10-29T15:52:06.034095Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c8654ce4-2541-4a14-a555-94c6a927fd8d/arrive` → **200**

```json
{
  "command_id": "18a1f59b-6545-4ee1-86e3-da453d4d58b7",
  "expected_version": 0
}
```

```json
{
  "id": "c8654ce4-2541-4a14-a555-94c6a927fd8d",
  "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
  "assignment_id": "32df2f97-3624-43a3-8bf5-5d26c17a5b66",
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
  "arrived_at": "2026-10-29T15:52:06.231999Z",
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

`POST /api/driver/v1/trips/c8654ce4-2541-4a14-a555-94c6a927fd8d/start` → **200**

```json
{
  "command_id": "5b500cdb-1d81-417e-9e8f-8c22d54d0066",
  "expected_version": 1
}
```

```json
{
  "id": "c8654ce4-2541-4a14-a555-94c6a927fd8d",
  "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
  "assignment_id": "32df2f97-3624-43a3-8bf5-5d26c17a5b66",
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
  "arrived_at": "2026-10-29T15:52:06.231999Z",
  "started_at": "2026-10-29T15:52:06.447303Z",
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

`POST /api/driver/v1/trips/c8654ce4-2541-4a14-a555-94c6a927fd8d/complete` → **200**

```json
{
  "command_id": "7ecf2bab-fa28-4c14-9360-a342055f5a52",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:52:06Z",
  "cash_received": true
}
```

```json
{
  "id": "c8654ce4-2541-4a14-a555-94c6a927fd8d",
  "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
  "assignment_id": "32df2f97-3624-43a3-8bf5-5d26c17a5b66",
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
  "arrived_at": "2026-10-29T15:52:06.231999Z",
  "started_at": "2026-10-29T15:52:06.447303Z",
  "completed_at": "2026-10-29T15:52:06.645861Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/6a211687-f3a4-4bec-99cf-6c12ec279522` → **200**

```json
{
  "id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
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
    "id": "32df2f97-3624-43a3-8bf5-5d26c17a5b66",
    "order_id": "6a211687-f3a4-4bec-99cf-6c12ec279522",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c8654ce4-2541-4a14-a555-94c6a927fd8d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:52:05.058574Z",
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
  "session_id": "51447c54-e235-4a7c-822f-a3d9710b1ce0",
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
  "last_heartbeat_at": "2026-10-29T15:52:03.826117Z",
  "last_location_at": "2026-10-29T15:52:03.826117Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51447c54-e235-4a7c-822f-a3d9710b1ce0/close` → **200**

```json
{
  "command_id": "c49a8d25-0160-493e-b0af-7d1082b11362",
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
  "session_id": "3593fb62-45f0-43ef-a1f7-67f3cb9805c3",
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
  "last_heartbeat_at": "2026-10-29T15:52:06.034095Z",
  "last_location_at": "2026-10-29T15:52:06.034095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3593fb62-45f0-43ef-a1f7-67f3cb9805c3/close` → **200**

```json
{
  "command_id": "b0d23b73-2480-4e5d-9108-b5071fe99cc5",
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

Done: terminal order 6a211687-f3a4-4bec-99cf-6c12ec279522 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1414"
}
```

```json
{
  "challenge_id": "55f50352-dc36-4d8f-8d04-b2255d6eddf4",
  "expires_at": "2026-10-29T15:57:11.017048067Z",
  "resend_available_at": "2026-10-29T15:52:12.017048067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "909540",
  "sent_at": "2026-10-29T15:52:11.018961161Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55f50352-dc36-4d8f-8d04-b2255d6eddf4",
  "code": "909540",
  "device_ref": "sandbox-1414"
}
```

```json
{
  "session_id": "e6a705a5-4af6-4e15-bfe2-e9a9f63b9c8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAzMSwiaWF0IjoxNzkzMjg5MTMxLCJqdGkiOiJkNDkwNTdhYi1iYzQ2LTRiNmMtODE4Ny1iNjg2OTFkNGQ5ZjQiLCJzaWQiOiJlNmE3MDVhNS00YWY2LTRlMTUtYmZlMi1lOWE5ZjYzYjljOGUifQ.WkGFTia-TLKZKZ9rGZXbqLTY-wI5ruUK4UJOebjVhck",
  "access_expires_at": "2026-10-29T16:07:11.22504627Z",
  "refresh_token": "DKXKgPEckDEuSoh58uOrSBO5XiQ4-KaK7sp-DFSrL8Q",
  "refresh_expires_at": "2026-11-28T15:52:11.224666412Z",
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
  "device_ref": "sandbox-19804"
}
```

```json
{
  "challenge_id": "c1a86a0c-8a7b-493e-a985-e0031c57c505",
  "expires_at": "2026-10-29T15:57:11.606116886Z",
  "resend_available_at": "2026-10-29T15:52:12.606116886Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "198749",
  "sent_at": "2026-10-29T15:52:11.608075319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1a86a0c-8a7b-493e-a985-e0031c57c505",
  "code": "198749",
  "device_ref": "sandbox-19804"
}
```

```json
{
  "session_id": "15bca678-965f-4cac-8895-221a4ddda831",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAzMSwiaWF0IjoxNzkzMjg5MTMxLCJqdGkiOiIwMmY4N2UyYy00OThlLTQwZTAtYWIwNy1iNzc3NmYwYmQxM2QiLCJzaWQiOiIxNWJjYTY3OC05NjVmLTRjYWMtODg5NS0yMjFhNGRkZGE4MzEifQ.-_PkflUqGsc2GkGkztKchsJN8IerRhJ41FSpcOmuNsI",
  "access_expires_at": "2026-10-29T16:07:11.818359137Z",
  "refresh_token": "rljf-8k55p1ZU17lkWVD_LuVt5AKpXHffkFoM966B_A",
  "refresh_expires_at": "2026-11-28T15:52:11.818024028Z",
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
  "device_ref": "sandbox-14313"
}
```

```json
{
  "challenge_id": "caa3064a-639f-4546-88a4-2e17195d47a9",
  "expires_at": "2026-10-29T15:57:12.18362584Z",
  "resend_available_at": "2026-10-29T15:52:13.18362584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "550685",
  "sent_at": "2026-10-29T15:52:12.185607344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "caa3064a-639f-4546-88a4-2e17195d47a9",
  "code": "550685",
  "device_ref": "sandbox-14313"
}
```

```json
{
  "session_id": "af1d3d66-10a0-4a4f-9f4b-0f1139e054ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDAzMiwiaWF0IjoxNzkzMjg5MTMyLCJqdGkiOiI5NWQyMzYxMi1kNzg2LTRlZjgtYWU5MC0xNmI2MGVlOWJjYTkiLCJzaWQiOiJhZjFkM2Q2Ni0xMGEwLTRhNGYtOWY0Yi0wZjExMzllMDU0ZmYifQ.MFqz7gvB97UVvXpEAHSWnncT_g6w6NxHgv-Q4zM34wQ",
  "access_expires_at": "2026-10-29T16:07:12.395194448Z",
  "refresh_token": "aToZkHzkhynF88dhl3tq_kdhhBJalYD5UR9dkuknVXo",
  "refresh_expires_at": "2026-11-28T15:52:12.394679497Z",
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
  "phone": "+380693045217",
  "device_ref": "sandbox-9968"
}
```

```json
{
  "challenge_id": "b9e0aa7e-0953-4f35-a01d-256d1ef4be0b",
  "expires_at": "2026-10-29T15:57:12.769916261Z",
  "resend_available_at": "2026-10-29T15:52:13.769916261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693045217` → **200**

```json
{
  "phone": "+380693045217",
  "audience": "CLIENT",
  "code": "031342",
  "sent_at": "2026-10-29T15:52:12.771780832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9e0aa7e-0953-4f35-a01d-256d1ef4be0b",
  "code": "031342",
  "device_ref": "sandbox-9968"
}
```

```json
{
  "session_id": "97a11106-387a-46b7-8b24-207bd71e7e85",
  "subject": {
    "type": "CLIENT",
    "id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwY2IyY2Y5NS1kM2I1LTRkNGItYjY3ZC1jZmQzY2FhNjU5ODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwMDMyLCJpYXQiOjE3OTMyODkxMzIsImp0aSI6IjRlNDk5ZGY2LTY0OTktNDIxMy04N2U3LWU5MjQ5YzhhMWYyYiIsInNpZCI6Ijk3YTExMTA2LTM4N2EtNDZiNy04YjI0LTIwN2JkNzFlN2U4NSJ9.m42PRT5e_Wd9NrMx_IpvxKZD0fdvOr_khCjSlWgxgy0",
  "access_expires_at": "2026-10-29T16:07:12.981763928Z",
  "refresh_token": "oqaoxZPfeAKMUgJIzx9DQpf_vyUdeLQOaKjAMAQRrjE",
  "refresh_expires_at": "2026-11-28T15:52:12.98139963Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "791ebd9e-974b-4b7c-a34d-a55ab61eee4f",
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
  "id": "a15f6bd0-0845-4cc3-929c-21b03f51095d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:57:13.173471Z",
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
  "command_id": "f4db7ff7-c8ed-4520-a506-5e0680ca2c49",
  "quote_id": "a15f6bd0-0845-4cc3-929c-21b03f51095d",
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
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T15:52:13.376117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:13.376117Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 9.737680041
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.106651163
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

`GET /api/rider/v1/orders/a6a13543-c0c6-4792-87ff-d225612041bb` → **200**

```json
{
  "id": "a6a13543-c0c6-4792-87ff-d225612041bb",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0cb2cf95-d3b5-4d4b-b67d-cfd3caa65982",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:52:13.376117Z",
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
  "session_id": "8ea08398-8553-446a-aa1b-0d432c1062b5",
  "subject": {
    "type": "STAFF",
    "id": "44a8bdd3-4006-4464-8afd-15d552435eab"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE4YmRkMy00MDA2LTQ0NjQtOGFmZC0xNWQ1NTI0MzVlYWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTAyMTYsImlhdCI6MTc5MzI4OTMxNiwianRpIjoiNjgzNzczNjAtYWVkYy00NjI4LWFhOWUtMmVlMjU3M2IwNGNiIiwic2lkIjoiOGVhMDgzOTgtODU1My00NDZhLWFhMWItMGQ0MzJjMTA2MmI1In0.Zrht42Zq69Zsv47CjjnElna6u36BwQZZifWSeXZRVFg",
  "access_expires_at": "2026-10-29T16:10:16.546654901Z",
  "refresh_token": "JmfZr1sHpzwmq0OHdMSgXThbEysh474Q9ggBhxn5V8I",
  "refresh_expires_at": "2026-10-30T03:55:16.546246004Z",
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
  "id": "60996750-943a-4827-b34f-c3d54c8d299c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:16.756004Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:16.756108Z",
  "updated_at": "2026-10-29T15:55:16.767023Z",
  "finished_at": "2026-10-29T15:55:16.767023Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/60996750-943a-4827-b34f-c3d54c8d299c` → **200**

```json
{
  "run": {
    "id": "60996750-943a-4827-b34f-c3d54c8d299c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:55:16.756004Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:55:16.756108Z",
    "updated_at": "2026-10-29T15:55:16.767023Z",
    "finished_at": "2026-10-29T15:55:16.767023Z",
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
  "id": "60996750-943a-4827-b34f-c3d54c8d299c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:16.756004Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:16.756108Z",
  "updated_at": "2026-10-29T15:55:16.767023Z",
  "finished_at": "2026-10-29T15:55:16.767023Z",
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
  "id": "60996750-943a-4827-b34f-c3d54c8d299c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:16.756004Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:16.756108Z",
  "updated_at": "2026-10-29T15:55:16.767023Z",
  "finished_at": "2026-10-29T15:55:16.767023Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/f75ce09d-ad6d-4355-bce0-f763a603dabe` → **204**

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
  "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:17.101349Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:17.101436Z",
  "updated_at": "2026-10-29T15:55:17.106803Z",
  "finished_at": "2026-10-29T15:55:17.106803Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/acc99bd2-e0a5-4028-828b-9847dd8ace2c` → **200**

```json
{
  "run": {
    "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:55:17.101349Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:55:17.101436Z",
    "updated_at": "2026-10-29T15:55:17.106803Z",
    "finished_at": "2026-10-29T15:55:17.106803Z",
    "version": 1
  },
  "items": [
    {
      "id": "7cce8a04-fa08-4b15-9e82-047cf09cf5f5",
      "run_id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6a8fca7a452ed33fbf27477b41fed564391105e1c29a0ac14e0db5d586523029",
      "reference_display": "sandbox-reconciliation-f75ce09d-ad6d-4355-bce0-f763a603dabe",
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
      "provider_at": "2026-10-29T15:55:17Z",
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
  "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:17.101349Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:17.101436Z",
  "updated_at": "2026-10-29T15:55:17.106803Z",
  "finished_at": "2026-10-29T15:55:17.106803Z",
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
  "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:17.101349Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:17.101436Z",
  "updated_at": "2026-10-29T15:55:17.106803Z",
  "finished_at": "2026-10-29T15:55:17.106803Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/7cce8a04-fa08-4b15-9e82-047cf09cf5f5/resolve` → **200**

```json
{
  "command_id": "3f97ce45-bf24-4861-b91e-ddbc5d10ba7c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7cce8a04-fa08-4b15-9e82-047cf09cf5f5",
  "run_id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6a8fca7a452ed33fbf27477b41fed564391105e1c29a0ac14e0db5d586523029",
  "reference_display": "sandbox-reconciliation-f75ce09d-ad6d-4355-bce0-f763a603dabe",
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
  "provider_at": "2026-10-29T15:55:17Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "resolved_at": "2026-10-29T15:55:17.425468Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7cce8a04-fa08-4b15-9e82-047cf09cf5f5/resolve` → **200**

```json
{
  "command_id": "3f97ce45-bf24-4861-b91e-ddbc5d10ba7c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7cce8a04-fa08-4b15-9e82-047cf09cf5f5",
  "run_id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6a8fca7a452ed33fbf27477b41fed564391105e1c29a0ac14e0db5d586523029",
  "reference_display": "sandbox-reconciliation-f75ce09d-ad6d-4355-bce0-f763a603dabe",
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
  "provider_at": "2026-10-29T15:55:17Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
  "resolved_at": "2026-10-29T15:55:17.425468Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7cce8a04-fa08-4b15-9e82-047cf09cf5f5/resolve` → **409**

```json
{
  "command_id": "9970b8e6-3c14-45d1-a009-f97e2bdc0fb2",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/7cce8a04-fa08-4b15-9e82-047cf09cf5f5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4e4b96c8-6d2e-409c-a98e-f1a995d86a43"
}
```

`GET /api/admin/v1/payment-reconciliations/acc99bd2-e0a5-4028-828b-9847dd8ace2c` → **200**

```json
{
  "run": {
    "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:55:17.101349Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:55:17.101436Z",
    "updated_at": "2026-10-29T15:55:17.425468Z",
    "finished_at": "2026-10-29T15:55:17.106803Z",
    "version": 2
  },
  "items": [
    {
      "id": "7cce8a04-fa08-4b15-9e82-047cf09cf5f5",
      "run_id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6a8fca7a452ed33fbf27477b41fed564391105e1c29a0ac14e0db5d586523029",
      "reference_display": "sandbox-reconciliation-f75ce09d-ad6d-4355-bce0-f763a603dabe",
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
      "provider_at": "2026-10-29T15:55:17Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "44a8bdd3-4006-4464-8afd-15d552435eab",
      "resolved_at": "2026-10-29T15:55:17.425468Z",
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
      "id": "0035b091-405f-49bc-8fc7-c0f9ed40cdcb",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T15:48:43.455294Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:48:43.455374Z",
      "updated_at": "2026-10-29T15:48:43.461873Z",
      "finished_at": "2026-10-29T15:48:43.461873Z",
      "version": 1
    },
    {
      "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:55:17.101349Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:55:17.101436Z",
      "updated_at": "2026-10-29T15:55:17.425468Z",
      "finished_at": "2026-10-29T15:55:17.106803Z",
      "version": 2
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/f75ce09d-ad6d-4355-bce0-f763a603dabe` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "acc99bd2-e0a5-4028-828b-9847dd8ace2c",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:55:17.101349Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:55:17.101436Z",
  "updated_at": "2026-10-29T15:55:17.425468Z",
  "finished_at": "2026-10-29T15:55:17.106803Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793289443578E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793289443763E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793289443763E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793289443578E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793289443764E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
