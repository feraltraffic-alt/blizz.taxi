# Sandbox transcript (2026-10-30T13:16:08Z, 16bdf8a)

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
  "correlation_id": "dc173cfe-5694-4350-8e9d-1498caaaa3b8"
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
  "session_id": "77ad75d4-02e4-4601-aed6-e64558e6a2a4",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwNzcsImlhdCI6MTc5MzM2NjE3NywianRpIjoiMzQzNzRmOGItYjlhMi00NTczLTgwZWYtZmRlNDJhOTNlMTBiIiwic2lkIjoiNzdhZDc1ZDQtMDJlNC00NjAxLWFlZDYtZTY0NTU4ZTZhMmE0In0.uWtgaSgSqf2fPQ4WrQTAM2IhW0PKOPJId09FFYz6lCs",
  "access_expires_at": "2026-10-30T13:31:17.240526114Z",
  "refresh_token": "ev1bc7meGHd49GbZQgar8Ammg0s_HtAmFD0xZFrYcFM",
  "refresh_expires_at": "2026-10-31T01:16:17.238707856Z",
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
  "session_id": "7a4a13a3-4edd-4858-b008-a475a27188af",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwNzgsImlhdCI6MTc5MzM2NjE3OCwianRpIjoiY2I1MjMyNjEtMjA0Ny00YWUxLTk5ZjktY2Y3NDhiNWUxY2Y0Iiwic2lkIjoiN2E0YTEzYTMtNGVkZC00ODU4LWIwMDgtYTQ3NWEyNzE4OGFmIn0.CxbXHH_344PI47EYMBHJzHLTiIQb83R-fYf994C4nL8",
  "access_expires_at": "2026-10-30T13:31:18.507839886Z",
  "refresh_token": "V5A9NmVisji9GgdOmeSPAT1kpchjt1KX4yfrdmk4eIk",
  "refresh_expires_at": "2026-10-31T01:16:18.507285753Z",
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
  "device_ref": "sandbox-10527"
}
```

```json
{
  "challenge_id": "0d425814-0bef-49f8-8b9f-39527f91d740",
  "expires_at": "2026-10-30T13:21:18.920317623Z",
  "resend_available_at": "2026-10-30T13:16:19.920317623Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "994852",
  "sent_at": "2026-10-30T13:16:18.931019247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d425814-0bef-49f8-8b9f-39527f91d740",
  "code": "994852",
  "device_ref": "sandbox-10527"
}
```

```json
{
  "session_id": "99e3a916-33ab-44b5-8b87-28a9c58bad6b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA3OSwiaWF0IjoxNzkzMzY2MTc5LCJqdGkiOiI5Yzg3ZmRlMy0yZjBiLTQ4NTctYjgzYS0zODQxNWJlNDQ3NzYiLCJzaWQiOiI5OWUzYTkxNi0zM2FiLTQ0YjUtOGI4Ny0yOGE5YzU4YmFkNmIifQ.haPXikLWty0qL0_41BHGON4SVnWseSSd5REflKXyWy0",
  "access_expires_at": "2026-10-30T13:31:19.178647557Z",
  "refresh_token": "o3tMPO8RSCY0Oq2VZyWEOXic7Fm98LAEThe7k8gfLFI",
  "refresh_expires_at": "2026-11-29T13:16:19.177848559Z",
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
  "command_id": "853e2717-8580-44a7-ba30-5edc6f396271",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:19Z",
    "sequence": 1793366179571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e2f290-7522-4dae-a19c-32ba14a06e5e",
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
  "last_heartbeat_at": "2026-10-30T13:16:19.659774Z",
  "last_location_at": "2026-10-30T13:16:19.659774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639134608",
  "device_ref": "sandbox-10642"
}
```

```json
{
  "challenge_id": "49d40fce-44bc-4464-8a75-fad52d84dbf3",
  "expires_at": "2026-10-30T13:21:19.852067095Z",
  "resend_available_at": "2026-10-30T13:16:20.852067095Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639134608` → **200**

```json
{
  "phone": "+380639134608",
  "audience": "CLIENT",
  "code": "254736",
  "sent_at": "2026-10-30T13:16:19.855872138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49d40fce-44bc-4464-8a75-fad52d84dbf3",
  "code": "254736",
  "device_ref": "sandbox-10642"
}
```

```json
{
  "session_id": "e69500a4-3e9e-416a-ac97-2bcfa80335bc",
  "subject": {
    "type": "CLIENT",
    "id": "56a217c2-0c98-4675-a78d-ad468bf4bb1c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmEyMTdjMi0wYzk4LTQ2NzUtYTc4ZC1hZDQ2OGJmNGJiMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MDgwLCJpYXQiOjE3OTMzNjYxODAsImp0aSI6ImMzNjk2YmNlLWYzMGEtNGExZC05YWMwLWY3N2I4NWRjZTRlZSIsInNpZCI6ImU2OTUwMGE0LTNlOWUtNDE2YS1hYzk3LTJiY2ZhODAzMzViYyJ9.AVcCUNAgDivHMpKNy_MqTwDuQLcDKOwQW2Mw8--RK9I",
  "access_expires_at": "2026-10-30T13:31:20.074581203Z",
  "refresh_token": "gm01dKLuDJBhofQqCarpp4b0r_l_lrzZdSdLurNSIuM",
  "refresh_expires_at": "2026-11-29T13:16:20.073857053Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e3e58a5c-16d7-4b75-b4b9-f2d73fe09f62",
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
  "id": "9b67a12e-8466-4ff7-8a9f-33d83fd0c15f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:21:20.293858Z",
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
  "command_id": "a8233106-e1ad-4b2d-bf0b-ca44e1d736db",
  "quote_id": "9b67a12e-8466-4ff7-8a9f-33d83fd0c15f",
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
  "id": "1bebba95-92ed-46e6-a057-fec70060448a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56a217c2-0c98-4675-a78d-ad468bf4bb1c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:16:20.564856Z",
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
    "id": "f72be9f4-9230-40cd-a43b-00be4cdf078f",
    "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
    "expires_at": "2026-10-30T13:16:35.571355Z",
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

`POST /api/driver/v1/offers/f72be9f4-9230-40cd-a43b-00be4cdf078f/accept` → **200**

```json
{
  "command_id": "0cd0e108-b8da-426f-b360-c4797c71f6bd"
}
```

```json
{
  "id": "bc934805-638e-47ab-97de-e2e98a40e17e",
  "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5d352ab0-a9b1-4346-a8df-18420e589dd3",
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
  "command_id": "8bf5b126-bdbb-4b13-aff2-e765863bbd04",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:16:21.418378058Z"
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
  "id": "5d352ab0-a9b1-4346-a8df-18420e589dd3",
  "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
  "assignment_id": "bc934805-638e-47ab-97de-e2e98a40e17e",
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

`POST /api/driver/v1/work-sessions/f1e2f290-7522-4dae-a19c-32ba14a06e5e/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:22Z",
    "sequence": 1793366182398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1e2f290-7522-4dae-a19c-32ba14a06e5e",
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
  "last_heartbeat_at": "2026-10-30T13:16:22.063102Z",
  "last_location_at": "2026-10-30T13:16:22.063102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5d352ab0-a9b1-4346-a8df-18420e589dd3/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a06256e9-a51a-47bd-891f-bfef3986eb43",
  "expected_version": 0
}
```

```json
{
  "id": "5d352ab0-a9b1-4346-a8df-18420e589dd3",
  "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
  "assignment_id": "bc934805-638e-47ab-97de-e2e98a40e17e",
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
  "arrived_at": "2026-10-30T13:16:22.275005Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d352ab0-a9b1-4346-a8df-18420e589dd3/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "264eb36a-3dcc-424b-89fe-7f78321a478c",
  "expected_version": 1
}
```

```json
{
  "id": "5d352ab0-a9b1-4346-a8df-18420e589dd3",
  "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
  "assignment_id": "bc934805-638e-47ab-97de-e2e98a40e17e",
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
  "arrived_at": "2026-10-30T13:16:22.275005Z",
  "started_at": "2026-10-30T13:16:22.487435Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d352ab0-a9b1-4346-a8df-18420e589dd3/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "63016f95-30a6-449a-b3d1-bdd0d394d67c",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:16:22Z",
  "cash_received": true
}
```

```json
{
  "id": "5d352ab0-a9b1-4346-a8df-18420e589dd3",
  "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
  "assignment_id": "bc934805-638e-47ab-97de-e2e98a40e17e",
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
  "arrived_at": "2026-10-30T13:16:22.275005Z",
  "started_at": "2026-10-30T13:16:22.487435Z",
  "completed_at": "2026-10-30T13:16:22.702884Z",
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
  "session_id": "f1e2f290-7522-4dae-a19c-32ba14a06e5e",
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
  "last_heartbeat_at": "2026-10-30T13:16:22.063102Z",
  "last_location_at": "2026-10-30T13:16:22.063102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1e2f290-7522-4dae-a19c-32ba14a06e5e/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "277d11df-a3a1-412a-9eac-192e9685d2ac",
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
  "command_id": "b73802f6-35be-47f5-83b3-71ff8f9ed743",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:23Z",
    "sequence": 1793366183362
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
  "correlation_id": "1e4e561c-f301-43c8-8644-207224e0dabd",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8b4a7885-f8bc-4665-bb99-f280088b9286",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:23Z",
    "sequence": 1793366183576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edbc66d5-d751-48d6-9bf2-5744d4528efe",
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
  "last_heartbeat_at": "2026-10-30T13:16:23.596065Z",
  "last_location_at": "2026-10-30T13:16:23.596065Z",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:16:21.418378Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "477e4263-b20e-4412-823d-9b5f060d25e1",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:16:24.004001251Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edbc66d5-d751-48d6-9bf2-5744d4528efe",
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
  "last_heartbeat_at": "2026-10-30T13:16:23.596065Z",
  "last_location_at": "2026-10-30T13:16:23.596065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edbc66d5-d751-48d6-9bf2-5744d4528efe/close` → **200**

```json
{
  "command_id": "7dc52274-25d3-4116-aa6e-4e0bf96ffc41",
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
  "session_id": "dc2ccafd-f6c9-4dfd-8a56-c248895500fa",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwODQsImlhdCI6MTc5MzM2NjE4NCwianRpIjoiNmUyYjg0NDUtNDFjMi00OGU1LTgyYTYtNmQ0Mzk0ZDEyM2U5Iiwic2lkIjoiZGMyY2NhZmQtZjZjOS00ZGZkLThhNTYtYzI0ODg5NTUwMGZhIn0.JWKBm8rDHKsCx-wwXhEG9ejbyZsS0OMeoO7-GB-vi_U",
  "access_expires_at": "2026-10-30T13:31:24.794267529Z",
  "refresh_token": "q7_wg4wNFUvRHxQOqRazdeNNB1NeYV5_qaGWD-E8UY0",
  "refresh_expires_at": "2026-10-31T01:16:24.793669881Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2080a90d-88d6-43ac-9788-f9664ca02fc1",
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
  "id": "dfe2f536-99ba-4dd0-bcd2-01f11863b922",
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
  "created_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "created_at": "2026-10-30T13:16:24.992228Z",
  "updated_at": "2026-10-30T13:16:24.992228Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638450459",
  "device_ref": "sandbox-9867"
}
```

```json
{
  "challenge_id": "5c8d7620-dcfc-41b8-80aa-cf2eb2997d69",
  "expires_at": "2026-10-30T13:21:25.205112154Z",
  "resend_available_at": "2026-10-30T13:16:26.205112154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638450459` → **200**

```json
{
  "phone": "+380638450459",
  "audience": "CLIENT",
  "code": "097577",
  "sent_at": "2026-10-30T13:16:25.212705213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c8d7620-dcfc-41b8-80aa-cf2eb2997d69",
  "code": "097577",
  "device_ref": "sandbox-9867"
}
```

```json
{
  "session_id": "ac375bd8-171d-4935-a70f-d17fdd61b4ec",
  "subject": {
    "type": "CLIENT",
    "id": "49ce9a22-ce24-46d4-a140-74b9490d41f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWNlOWEyMi1jZTI0LTQ2ZDQtYTE0MC03NGI5NDkwZDQxZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MDg1LCJpYXQiOjE3OTMzNjYxODUsImp0aSI6IjAyNzBmNWY4LWRhZTUtNGNlZS05NDlmLTI3YjNiZmIyMjkxMyIsInNpZCI6ImFjMzc1YmQ4LTE3MWQtNDkzNS1hNzBmLWQxN2ZkZDYxYjRlYyJ9.WCxd2L0Mbvmk-ApTWo2HGUyAA1szSUBRuxitZSBzC7o",
  "access_expires_at": "2026-10-30T13:31:25.434586737Z",
  "refresh_token": "0JOGHCQTO58o2s8nmpZfedahnUs6zIB4WwfDzp0Rkmk",
  "refresh_expires_at": "2026-11-29T13:16:25.433922499Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638450459` → **200**

```json
{
  "client_id": "49ce9a22-ce24-46d4-a140-74b9490d41f4"
}
```

`POST /api/admin/v1/rider-wallets/49ce9a22-ce24-46d4-a140-74b9490d41f4/top-ups` → **201**

```json
{
  "command_id": "cc0d7302-6ec7-4159-98b6-dbbf650b834a",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "49ce9a22-ce24-46d4-a140-74b9490d41f4",
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
      "id": "adcb0a03-d1e4-4c0c-82fb-0ccf02d2d7f0",
      "at": "2026-10-30T13:16:25.83515Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c1c16e26-1b05-4cb6-a56f-5c237bca4edf",
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
  "id": "f3c2ca88-a79e-459a-b9cb-41c3925dba14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:21:26.056062Z",
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
      "id": "dfe2f536-99ba-4dd0-bcd2-01f11863b922",
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
  "device_ref": "sandbox-3461"
}
```

```json
{
  "challenge_id": "65bd9375-6184-40de-af3e-971b5f2a64cf",
  "expires_at": "2026-10-30T13:21:26.272227424Z",
  "resend_available_at": "2026-10-30T13:16:27.272227424Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "943128",
  "sent_at": "2026-10-30T13:16:26.275623249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65bd9375-6184-40de-af3e-971b5f2a64cf",
  "code": "943128",
  "device_ref": "sandbox-3461"
}
```

```json
{
  "session_id": "18aed42b-d3cb-410f-bb3d-d1f22626eb4c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA4NiwiaWF0IjoxNzkzMzY2MTg2LCJqdGkiOiI3ZDA4NDhhMS02YTRlLTQ2MTMtOTQ5YS0yYjRkMzQxNjFhOGUiLCJzaWQiOiIxOGFlZDQyYi1kM2NiLTQxMGYtYmIzZC1kMWYyMjYyNmViNGMifQ.6n0byW3qU-7-Ozmdb1cZnqI9G7sriKrnleiDpLO20xg",
  "access_expires_at": "2026-10-30T13:31:26.494070378Z",
  "refresh_token": "Um9-r-AP8Iq-PJDX8-hpmWg3Fe5iAQIYN2-OlIHOhEc",
  "refresh_expires_at": "2026-11-29T13:16:26.493460548Z",
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
  "command_id": "8c34c32a-bdd2-4001-8994-4f8943fc7431",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:26Z",
    "sequence": 1793366186873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17204575-4f86-4cd0-bc02-dc9e218607bd",
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
  "last_heartbeat_at": "2026-10-30T13:16:26.892197Z",
  "last_location_at": "2026-10-30T13:16:26.892197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "29de0d6c-9e93-47c2-ae42-0c794f403471",
  "quote_id": "f3c2ca88-a79e-459a-b9cb-41c3925dba14",
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
  "id": "163793bf-9915-4349-a30a-ded8d4afcce9",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "49ce9a22-ce24-46d4-a140-74b9490d41f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:16:27.103728Z",
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
  "client_id": "49ce9a22-ce24-46d4-a140-74b9490d41f4",
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
      "id": "adcb0a03-d1e4-4c0c-82fb-0ccf02d2d7f0",
      "at": "2026-10-30T13:16:25.83515Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
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
    "id": "1d696004-1f5f-4ca8-a6ee-dbc696fa7920",
    "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
    "expires_at": "2026-10-30T13:16:42.109672Z",
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

`POST /api/driver/v1/offers/1d696004-1f5f-4ca8-a6ee-dbc696fa7920/accept` → **200**

```json
{
  "command_id": "ad0f9c99-f439-4a4a-bbe1-504113f8dc77"
}
```

```json
{
  "id": "49fc6e03-8361-4811-bbfd-c49f35e2bb29",
  "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3f499cd-b9d2-49e4-aec4-fdface6e9eaa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3f499cd-b9d2-49e4-aec4-fdface6e9eaa",
  "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
  "assignment_id": "49fc6e03-8361-4811-bbfd-c49f35e2bb29",
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

`POST /api/driver/v1/work-sessions/17204575-4f86-4cd0-bc02-dc9e218607bd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:28Z",
    "sequence": 1793366188107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17204575-4f86-4cd0-bc02-dc9e218607bd",
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
  "last_heartbeat_at": "2026-10-30T13:16:28.125379Z",
  "last_location_at": "2026-10-30T13:16:28.125379Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a3f499cd-b9d2-49e4-aec4-fdface6e9eaa/arrive` → **200**

```json
{
  "command_id": "aa10c82f-a0bd-4514-8257-da5eff07edc6",
  "expected_version": 0
}
```

```json
{
  "id": "a3f499cd-b9d2-49e4-aec4-fdface6e9eaa",
  "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
  "assignment_id": "49fc6e03-8361-4811-bbfd-c49f35e2bb29",
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
  "arrived_at": "2026-10-30T13:16:28.340891Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a3f499cd-b9d2-49e4-aec4-fdface6e9eaa/start` → **200**

```json
{
  "command_id": "20535d83-5c7b-4438-9149-8a32a2704672",
  "expected_version": 1
}
```

```json
{
  "id": "a3f499cd-b9d2-49e4-aec4-fdface6e9eaa",
  "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
  "assignment_id": "49fc6e03-8361-4811-bbfd-c49f35e2bb29",
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
  "arrived_at": "2026-10-30T13:16:28.340891Z",
  "started_at": "2026-10-30T13:16:28.5441Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a3f499cd-b9d2-49e4-aec4-fdface6e9eaa/complete` → **200**

```json
{
  "command_id": "c2cb2583-ab10-4807-abe4-ed1d8d65a0b3",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:16:28Z",
  "cash_received": true
}
```

```json
{
  "id": "a3f499cd-b9d2-49e4-aec4-fdface6e9eaa",
  "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
  "assignment_id": "49fc6e03-8361-4811-bbfd-c49f35e2bb29",
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
  "arrived_at": "2026-10-30T13:16:28.340891Z",
  "started_at": "2026-10-30T13:16:28.5441Z",
  "completed_at": "2026-10-30T13:16:28.754788Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "49ce9a22-ce24-46d4-a140-74b9490d41f4",
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
      "id": "397892e1-65ce-44ca-ad54-0bc884700137",
      "at": "2026-10-30T13:16:29.168694Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9"
    },
    {
      "id": "adcb0a03-d1e4-4c0c-82fb-0ccf02d2d7f0",
      "at": "2026-10-30T13:16:25.83515Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/dfe2f536-99ba-4dd0-bcd2-01f11863b922/archive` → **200**

```json
{
  "command_id": "65ccdddb-1ee0-402b-b662-c1a5ed09cea9",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "dfe2f536-99ba-4dd0-bcd2-01f11863b922",
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
  "created_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "created_at": "2026-10-30T13:16:24.992228Z",
  "updated_at": "2026-10-30T13:16:32.181643Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17204575-4f86-4cd0-bc02-dc9e218607bd",
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
  "last_heartbeat_at": "2026-10-30T13:16:28.125379Z",
  "last_location_at": "2026-10-30T13:16:28.125379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17204575-4f86-4cd0-bc02-dc9e218607bd/close` → **200**

```json
{
  "command_id": "d88b0a37-ebfd-4f27-adc7-d1cbe544e2d5",
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

Done: order 163793bf-9915-4349-a30a-ded8d4afcce9.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-32301"
}
```

```json
{
  "challenge_id": "863d9dd6-0583-459d-b20f-b6e141205515",
  "expires_at": "2026-10-30T13:21:32.797931103Z",
  "resend_available_at": "2026-10-30T13:16:33.797931103Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "567985",
  "sent_at": "2026-10-30T13:16:32.801046948Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "863d9dd6-0583-459d-b20f-b6e141205515",
  "code": "567985",
  "device_ref": "sandbox-32301"
}
```

```json
{
  "session_id": "055b294b-3cc7-441e-83d1-bd56057d3a74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA5MywiaWF0IjoxNzkzMzY2MTkzLCJqdGkiOiI0ZGFkNTQ3ZS1hYjUzLTRlNDktYWJlYy0wOTVjNTIyODBiNjIiLCJzaWQiOiIwNTViMjk0Yi0zY2M3LTQ0MWUtODNkMS1iZDU2MDU3ZDNhNzQifQ.H9wXzIdgnGRUaqJ5neOhuJ-pzdAOYhZYl0X7UbM_ntg",
  "access_expires_at": "2026-10-30T13:31:33.027353341Z",
  "refresh_token": "2QKmgI61QNcsyDdVm0YuRGjSFq7_a5G6OrmTxIlM5Y8",
  "refresh_expires_at": "2026-11-29T13:16:33.026748291Z",
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
  "device_ref": "sandbox-19743"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "55ee7b36-13a7-4e8f-b89e-ed918cc26b22",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-19743"
}
```

```json
{
  "challenge_id": "a904c4b6-6b3f-4402-ba5d-6ca13ab2dd89",
  "expires_at": "2026-10-30T13:21:34.616092518Z",
  "resend_available_at": "2026-10-30T13:16:35.616092518Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "404077",
  "sent_at": "2026-10-30T13:16:34.618384184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a904c4b6-6b3f-4402-ba5d-6ca13ab2dd89",
  "code": "404077",
  "device_ref": "sandbox-19743"
}
```

```json
{
  "session_id": "2ed8ec51-ece0-41ee-8fd7-c4bcbdb44631",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA5NCwiaWF0IjoxNzkzMzY2MTk0LCJqdGkiOiIwODc2NGRiMS02ZGZhLTQzZTEtODgyZS00YmYzZjAwMDliZDgiLCJzaWQiOiIyZWQ4ZWM1MS1lY2UwLTQxZWUtOGZkNy1jNGJjYmRiNDQ2MzEifQ.gpenKW3vsSmJBYz_nlQLkOW1x6WCorw3ibPF1UXFYjI",
  "access_expires_at": "2026-10-30T13:31:34.826036818Z",
  "refresh_token": "LgaKCdRX2Nt-iMC25ep95De3XPdmdRIvWW4_U4_4T4k",
  "refresh_expires_at": "2026-11-29T13:16:34.825631288Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-22328"
}
```

```json
{
  "challenge_id": "7fdc8a8e-4a62-4c95-a797-9ed4554afdbe",
  "expires_at": "2026-10-30T13:21:35.021041899Z",
  "resend_available_at": "2026-10-30T13:16:36.021041899Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "683677",
  "sent_at": "2026-10-30T13:16:35.024544115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fdc8a8e-4a62-4c95-a797-9ed4554afdbe",
  "code": "683677",
  "device_ref": "sandbox-22328"
}
```

```json
{
  "session_id": "f9c143d4-845b-4259-af1b-fbfa645463eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA5NSwiaWF0IjoxNzkzMzY2MTk1LCJqdGkiOiI2M2UyNTg1My03MzE0LTQyNTktYWI2OS0zNzVjNzYyNTExZjciLCJzaWQiOiJmOWMxNDNkNC04NDViLTQyNTktYWYxYi1mYmZhNjQ1NDYzZWIifQ.kulC7biHw7l-bdsRzixeoNErFQSmFS43X2tC3SCOtno",
  "access_expires_at": "2026-10-30T13:31:35.457885706Z",
  "refresh_token": "4gwxLp_daeEPQKVdvavwJ8ME9mdgjnqgR2jPi5NCcr0",
  "refresh_expires_at": "2026-11-29T13:16:35.457160786Z",
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
  "command_id": "c09cdf8a-b93b-4b65-b087-42fb750244c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:36Z",
    "sequence": 1793366196483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "facdd135-5ed6-4b96-b5cb-7071e885cb95",
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
  "last_heartbeat_at": "2026-10-30T13:16:36.065684Z",
  "last_location_at": "2026-10-30T13:16:36.065684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600992141",
  "device_ref": "sandbox-30272"
}
```

```json
{
  "challenge_id": "eac072d0-da12-4bec-af1d-5a4ebcc3627b",
  "expires_at": "2026-10-30T13:21:36.261178199Z",
  "resend_available_at": "2026-10-30T13:16:37.261178199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600992141` → **200**

```json
{
  "phone": "+48600992141",
  "audience": "CLIENT",
  "code": "586562",
  "sent_at": "2026-10-30T13:16:36.263808229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eac072d0-da12-4bec-af1d-5a4ebcc3627b",
  "code": "586562",
  "device_ref": "sandbox-30272"
}
```

```json
{
  "session_id": "98647b1d-dae5-46af-9b31-259dd120ac6a",
  "subject": {
    "type": "CLIENT",
    "id": "a9053275-4ea0-4faa-9d73-b3896d6c5072"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOTA1MzI3NS00ZWEwLTRmYWEtOWQ3My1iMzg5NmQ2YzUwNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MDk2LCJpYXQiOjE3OTMzNjYxOTYsImp0aSI6ImY0OTNkYWIwLTkxYjUtNGJmOC04OGNhLWMxZDUxZTBiNzA0NSIsInNpZCI6Ijk4NjQ3YjFkLWRhZTUtNDZhZi05YjMxLTI1OWRkMTIwYWM2YSJ9.rXckiEodSGEz3bR3CWEz9KMWLHNnH2BktQFjbrh0dwE",
  "access_expires_at": "2026-10-30T13:31:36.486877013Z",
  "refresh_token": "SFVDk-xDKN8bNO7EsvOhCzP2atWcA06n5I6C89TGgnY",
  "refresh_expires_at": "2026-11-29T13:16:36.486406907Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "20b2e2f0-8751-408a-b386-ee5ba137f5d5",
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
  "id": "efc6b703-2658-4968-846c-417f0d26d352",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:21:36.697821Z",
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
  "command_id": "06b40a2a-9395-42e8-849e-2ab21aea5735",
  "quote_id": "efc6b703-2658-4968-846c-417f0d26d352",
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
  "id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9053275-4ea0-4faa-9d73-b3896d6c5072",
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
  "created_at": "2026-10-30T13:16:36.913257Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6` → **200**

```json
{
  "id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9053275-4ea0-4faa-9d73-b3896d6c5072",
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
  "created_at": "2026-10-30T13:16:36.913257Z",
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

`POST /api/driver/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6/claim` → **422**

```json
{
  "command_id": "165a0a2a-8bfa-4fc8-93e0-73fec6601b96"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "4b97a37f-a39e-4784-b9b9-6f571059a31a"
}
```

`GET /api/rider/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6` → **200**

```json
{
  "id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9053275-4ea0-4faa-9d73-b3896d6c5072",
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
  "created_at": "2026-10-30T13:16:36.913257Z",
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

`POST /api/driver/v1/orders/ab09c57a-dcc6-4e30-86c9-98c9b79a2e02/claim` → **404**

```json
{
  "command_id": "6dfff0e0-6b1a-4514-9066-979eac2f44cb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ab09c57a-dcc6-4e30-86c9-98c9b79a2e02/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3ba4353e-70e1-4ae6-b2d0-aad03feaae99"
}
```

`POST /api/driver/v1/orders/6710cfeb-954a-4a4a-9de2-657d8808ccaf/claim` → **404**

```json
{
  "command_id": "49656048-e29d-4e16-a674-d7b5da06bf14"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6710cfeb-954a-4a4a-9de2-657d8808ccaf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5cd9bea3-f85e-449f-b19f-f6458cc3acda"
}
```

`POST /api/driver/v1/orders/7603fe5c-df26-4e23-95cb-2b8e61824505/claim` → **404**

```json
{
  "command_id": "fafce81a-01f6-4066-bbb3-150981d81fed"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7603fe5c-df26-4e23-95cb-2b8e61824505/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5af2d24b-7c42-4a6a-b241-72215ee40300"
}
```

`POST /api/driver/v1/orders/c0ed6f70-d731-47bb-a345-d649d9b3776f/claim` → **404**

```json
{
  "command_id": "5a14276d-4872-44f7-bc13-f2e37bab1114"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c0ed6f70-d731-47bb-a345-d649d9b3776f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7a134a89-0c0a-4f7e-ba9a-56062220a7bd"
}
```

`POST /api/driver/v1/orders/e376387b-3d23-420e-8239-2590f145944f/claim` → **404**

```json
{
  "command_id": "4e182dfa-fd06-41d3-b96d-e1770a92f164"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e376387b-3d23-420e-8239-2590f145944f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "712066e5-8567-4f09-b8ba-2402db6120a4"
}
```

`POST /api/driver/v1/orders/e8b483f6-5114-4ced-ac80-962e99b1e90d/claim` → **404**

```json
{
  "command_id": "7081fd6e-3131-41b6-9d76-e491f8745f15"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8b483f6-5114-4ced-ac80-962e99b1e90d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5c6450bb-460b-43ed-9ac4-e38ba89d84ef"
}
```

`POST /api/driver/v1/orders/94578609-1173-46bc-a374-ee56b8541d32/claim` → **404**

```json
{
  "command_id": "dd07fdcd-dfbe-443a-936c-1b10d49e15ad"
}
```

```json
{
  "instance": "/api/driver/v1/orders/94578609-1173-46bc-a374-ee56b8541d32/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "362665ee-c73b-476e-8bce-dbc198c4a6d4"
}
```

`POST /api/driver/v1/orders/51319bee-ebad-4307-8ca4-606d4de9d4f3/claim` → **404**

```json
{
  "command_id": "d3b94a25-187f-4072-8cb4-311d8fd74439"
}
```

```json
{
  "instance": "/api/driver/v1/orders/51319bee-ebad-4307-8ca4-606d4de9d4f3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f44e808a-6fd5-40ef-b618-61e2aed304f4"
}
```

`POST /api/driver/v1/orders/6bd49ea2-86f7-41ba-9714-126f0f99fce6/claim` → **404**

```json
{
  "command_id": "92818d5f-a6a7-494d-88b9-daf91ecfa571"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6bd49ea2-86f7-41ba-9714-126f0f99fce6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "22ea19d5-c075-4462-a82e-2d66358efbbf"
}
```

`POST /api/driver/v1/orders/b38dff5a-9711-4f38-8891-fb7a944f717b/claim` → **404**

```json
{
  "command_id": "8d8155a7-d35d-4072-bc66-337e82d05219"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b38dff5a-9711-4f38-8891-fb7a944f717b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "88143525-a91c-4382-80ce-fac478e00a75"
}
```

`POST /api/driver/v1/orders/a4bf2968-2781-46fc-aea0-8441c12960e2/claim` → **404**

```json
{
  "command_id": "edae0023-87fa-4f91-8e41-185c337ed4a4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a4bf2968-2781-46fc-aea0-8441c12960e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c46a5604-98a5-4d7b-8e1f-5d8f9900e797"
}
```

`POST /api/driver/v1/orders/3900b8ea-4cdb-46e7-91ef-12725934a8b9/claim` → **404**

```json
{
  "command_id": "a99a640a-ff7f-4fec-9ab5-e8be0f14dd59"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3900b8ea-4cdb-46e7-91ef-12725934a8b9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b4886b48-ef41-49fa-9832-86774acb3d83"
}
```

`POST /api/driver/v1/orders/bd71bc3c-f947-41eb-b204-152e6412cd74/claim` → **404**

```json
{
  "command_id": "1fa55b03-8580-47f4-8c8f-76a919315a3c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bd71bc3c-f947-41eb-b204-152e6412cd74/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "56311d71-95c5-4f20-b50d-d25c049e7854"
}
```

`POST /api/driver/v1/orders/80fb5140-84b6-4fd5-9c4d-d2b6a8915bcc/claim` → **404**

```json
{
  "command_id": "c835e7ae-7ca6-4104-8daa-71517fda7ef6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/80fb5140-84b6-4fd5-9c4d-d2b6a8915bcc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "886d91af-7a18-47b6-9334-2ef4eac1f173"
}
```

`POST /api/driver/v1/orders/9869fda9-9737-47c6-9d94-abfc8ef36e91/claim` → **404**

```json
{
  "command_id": "8445ca01-776d-453e-a58d-c51734398a49"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9869fda9-9737-47c6-9d94-abfc8ef36e91/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ddc04d6f-e8c7-446c-ac35-4973c86c29b3"
}
```

`POST /api/driver/v1/orders/298a9f05-30b0-41db-9b50-f97826cdabb4/claim` → **404**

```json
{
  "command_id": "2e54c660-d582-409a-b0fc-1e79c01561b9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/298a9f05-30b0-41db-9b50-f97826cdabb4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c17b6269-2d86-4b71-8781-f4d095dac279"
}
```

`POST /api/driver/v1/orders/601b52af-7e7a-4a3b-8187-4e200495cf02/claim` → **404**

```json
{
  "command_id": "9a77a905-a045-4355-9e91-066d1492602f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/601b52af-7e7a-4a3b-8187-4e200495cf02/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4c2e20d8-7973-414b-acc0-536f65ce9887"
}
```

`POST /api/driver/v1/orders/44f47cf4-411e-4b1c-a8f4-7a1ef0cee4ec/claim` → **404**

```json
{
  "command_id": "d49bf282-73b2-4a73-a6e1-2aaac06a84c8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/44f47cf4-411e-4b1c-a8f4-7a1ef0cee4ec/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a92efd88-821f-4b81-b6ff-9c2b7425a729"
}
```

`POST /api/driver/v1/orders/73ac7d22-e09b-42b7-9006-fd37654153ea/claim` → **404**

```json
{
  "command_id": "4287d301-538d-41fc-8efe-f46ecca4227b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/73ac7d22-e09b-42b7-9006-fd37654153ea/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b82aa25b-78bf-4ea0-a151-0025fa4e39cf"
}
```

`POST /api/driver/v1/orders/9656af22-362a-4cd3-b7c4-062c18175bc3/claim` → **404**

```json
{
  "command_id": "4d77c8d6-b812-413d-851c-e8d3f10639e0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9656af22-362a-4cd3-b7c4-062c18175bc3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3d60761b-44fe-4193-b0ac-87a45c6620b7"
}
```

`POST /api/driver/v1/orders/6cdb2ed4-1aca-4413-a309-17a1ab82e96f/claim` → **404**

```json
{
  "command_id": "2f178b13-40fe-4660-95a7-26f910fea1e4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6cdb2ed4-1aca-4413-a309-17a1ab82e96f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "20c284bc-7ada-4048-97e1-ece0a7ba10a0"
}
```

`POST /api/driver/v1/orders/f4aeccc1-ace7-4be8-918a-2fc1ca90cca6/claim` → **404**

```json
{
  "command_id": "cd1d4343-1a9a-4989-b27a-9d51c16193fa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f4aeccc1-ace7-4be8-918a-2fc1ca90cca6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f809ddc3-6512-4de8-b052-43de0caffe92"
}
```

`POST /api/driver/v1/orders/b6b4e2c3-ac15-4d7f-8f9b-214a12f434b2/claim` → **404**

```json
{
  "command_id": "aa790d88-6deb-431d-84d1-b0f89853e715"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b6b4e2c3-ac15-4d7f-8f9b-214a12f434b2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c79021d9-3919-44e2-bedd-c29fbc3db97c"
}
```

`POST /api/driver/v1/orders/49a1f0c5-eb6b-492e-926d-e7ead6307df5/claim` → **404**

```json
{
  "command_id": "efd1af0e-ec2f-4cc6-b2a9-4a10361633c9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/49a1f0c5-eb6b-492e-926d-e7ead6307df5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d21527e4-14b7-4a6b-be95-f07ffe951f6f"
}
```

`POST /api/driver/v1/orders/ea0404af-200c-45aa-b03b-595a733a7e81/claim` → **404**

```json
{
  "command_id": "1a60ce47-ba74-460e-9c37-9fef30492746"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ea0404af-200c-45aa-b03b-595a733a7e81/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "69709ce3-f851-4149-8622-1cdff95ea3fe"
}
```

`POST /api/driver/v1/orders/35b44213-b027-4ffd-99c8-b0d459fb4c1c/claim` → **404**

```json
{
  "command_id": "5fc2d923-a46a-4677-84a0-bc6c1fc80bd3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/35b44213-b027-4ffd-99c8-b0d459fb4c1c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4017247c-8c31-4528-8e9e-baff0d8d4283"
}
```

`POST /api/driver/v1/orders/8dbb331a-44d2-43c7-8e02-566cd1d5be9f/claim` → **404**

```json
{
  "command_id": "200aef50-9afe-460c-827f-d3b3cc5c8655"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8dbb331a-44d2-43c7-8e02-566cd1d5be9f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "14c756f0-c675-4290-b1f1-e28962235443"
}
```

`POST /api/driver/v1/orders/e806b968-ef9a-475e-88ad-e06301f1c446/claim` → **404**

```json
{
  "command_id": "b5bd2280-2ac6-4104-aaa0-31bb62e27df5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e806b968-ef9a-475e-88ad-e06301f1c446/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "034d9ec3-2dd2-4bbb-9165-79bf6c015c2e"
}
```

`POST /api/driver/v1/orders/e72d1b49-2a7d-4921-b60b-b476a94c8a41/claim` → **404**

```json
{
  "command_id": "79710064-6d35-4825-9351-df5894f74d35"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e72d1b49-2a7d-4921-b60b-b476a94c8a41/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6260f55a-bf2e-4d8a-83b8-cc9561e4f535"
}
```

`POST /api/driver/v1/orders/f07061ee-8c88-41ab-bf38-253bdafea9ad/claim` → **429**

```json
{
  "command_id": "4a8fdce0-0749-4be2-bdf4-0cbc6c1426d9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f07061ee-8c88-41ab-bf38-253bdafea9ad/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "66fec5bd-cf86-4bef-bf1a-e68b2078596c",
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
  "command_id": "0d8b62cd-1ce3-4ba9-a3ca-081753e54075",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:16:44Z",
    "sequence": 1793366204227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1aca927-5e46-4728-b922-dd7fa1486e0b",
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
  "last_heartbeat_at": "2026-10-30T13:16:44.2451Z",
  "last_location_at": "2026-10-30T13:16:44.2451Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
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

`POST /api/driver/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6/claim` → **409**

```json
{
  "command_id": "a44b1e85-d9a7-42a5-a698-c99e3682f6de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e3aa290a-af02-4d23-bc34-f4ef05ad5605"
}
```

`POST /api/driver/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6/claim` → **200**

```json
{
  "command_id": "9376afa5-ddf2-42c6-a860-7964582be3ee"
}
```

```json
{
  "id": "bd2d355b-eaf9-4401-b91d-b4cf7ee03463",
  "order_id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "6155717d-5c5d-496a-a60f-5dcf8e8494c2",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6155717d-5c5d-496a-a60f-5dcf8e8494c2",
  "order_id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "assignment_id": "bd2d355b-eaf9-4401-b91d-b4cf7ee03463",
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

`POST /api/driver/v1/trips/6155717d-5c5d-496a-a60f-5dcf8e8494c2/cancel` → **200**

```json
{
  "command_id": "50c2f9b3-b22a-41e7-b36e-e8b31225896d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "6155717d-5c5d-496a-a60f-5dcf8e8494c2",
  "order_id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "assignment_id": "bd2d355b-eaf9-4401-b91d-b4cf7ee03463",
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

`GET /api/rider/v1/orders/f9cec130-222f-49f1-97d5-68467f17c4a6` → **200**

```json
{
  "id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a9053275-4ea0-4faa-9d73-b3896d6c5072",
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
    "id": "bd2d355b-eaf9-4401-b91d-b4cf7ee03463",
    "order_id": "f9cec130-222f-49f1-97d5-68467f17c4a6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "6155717d-5c5d-496a-a60f-5dcf8e8494c2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:16:36.913257Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "uk": "Пасажир попросив скасувати",
      "en": "Passenger asked to cancel",
      "ru": "Пассажир попросил отменить",
      "pl": "Pasażer poprosił o anulowanie"
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
  "session_id": "facdd135-5ed6-4b96-b5cb-7071e885cb95",
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
  "last_heartbeat_at": "2026-10-30T13:16:36.065684Z",
  "last_location_at": "2026-10-30T13:16:36.065684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/facdd135-5ed6-4b96-b5cb-7071e885cb95/close` → **200**

```json
{
  "command_id": "24b23150-7eca-4caa-9efc-2ecf1bf1f239",
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
  "session_id": "b1aca927-5e46-4728-b922-dd7fa1486e0b",
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
  "last_heartbeat_at": "2026-10-30T13:16:44.2451Z",
  "last_location_at": "2026-10-30T13:16:44.2451Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1aca927-5e46-4728-b922-dd7fa1486e0b/close` → **200**

```json
{
  "command_id": "1fd579f0-cdbf-4f89-a40f-bd2cc2c8e369",
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
  "session_id": "ac3b783f-acf0-4aa7-9fe6-5dcbcf3f747a",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxMDYsImlhdCI6MTc5MzM2NjIwNiwianRpIjoiMjUzOWE3MWYtYmE0ZC00OTA5LThjYWQtNzAwY2IzNGJlODU4Iiwic2lkIjoiYWMzYjc4M2YtYWNmMC00YWE3LTlmZTYtNWRjYmNmM2Y3NDdhIn0.UnMJy2dYN8C2qTv6mt32JnV5bCbv0iCWUh6lA2fRgDI",
  "access_expires_at": "2026-10-30T13:31:46.658716581Z",
  "refresh_token": "WQdZbWMVFQDJH4rBgx0DnYC3dFEl34aM-rdJRyFVang",
  "refresh_expires_at": "2026-10-31T01:16:46.658317Z",
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
  "command_id": "af0c3130-2c0d-4b39-96f0-27facbc29d9d",
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
  "session_id": "fdea26e0-2c44-4a8b-afbd-3ec0265cefc3",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxMDcsImlhdCI6MTc5MzM2NjIwNywianRpIjoiMzMwZDk2MWUtNDAzNi00ZDFiLTkzYTctZDU5YjdmNWE3MGVlIiwic2lkIjoiZmRlYTI2ZTAtMmM0NC00YThiLWFmYmQtM2VjMDI2NWNlZmMzIn0.qmJ7bOlyMK1xPV908MwFV7RcbKK8kt9oBSMcsdIz-aU",
  "access_expires_at": "2026-10-30T13:31:47.441117874Z",
  "refresh_token": "fTmvV9XqDQR7fM2heUlPj4SMW7d4IwAG-L1spLJLe50",
  "refresh_expires_at": "2026-10-31T01:16:47.44076276Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2581810042",
    "linkedid": "1730052700.2581810042",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677767963"
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
    "id": "1730052700.2581810042",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "99bef972-0bea-4c05-b391-2912102e3de6",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.626254Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:16:47.648697Z",
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
    "id": "1730052600.270110565",
    "linkedid": "1730052600.270110565",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677767963"
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/0a9079d8-b378-4843-8177-dceb57bcb560/answer` → **200**

```json
{
  "command_id": "b322617b-80d5-47f4-ba07-2a7739d77037"
}
```

```json
{
  "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677767963",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "order_ids": [],
  "started_at": "2026-10-30T13:16:47.878617Z",
  "answered_at": "2026-10-30T13:16:48.100858Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.270110565",
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
    "id": "1730052600.270110565",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:16:57.790316Z"
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
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:16:57.790316Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/0a9079d8-b378-4843-8177-dceb57bcb560/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/0a9079d8-b378-4843-8177-dceb57bcb560/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=0a9079d8-b378-4843-8177-dceb57bcb560` → **200**

```json
{
  "changes": [
    {
      "id": "7eb7b6d7-343d-4466-ad67-286b39b49df4",
      "occurred_at": "2026-10-30T13:16:59.745524Z",
      "actor_type": "STAFF",
      "actor_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"20dcbd6a-37c6-46f0-a524-c5d6d3a60b6f\", \"order_ids\": []}",
      "correlation_id": "d935278f-f0ad-42ba-89ec-f119ac21256a"
    },
    {
      "id": "c335d21a-76af-48a3-93f7-d530dbc11775",
      "occurred_at": "2026-10-30T13:16:59.716758Z",
      "actor_type": "STAFF",
      "actor_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"20dcbd6a-37c6-46f0-a524-c5d6d3a60b6f\", \"order_ids\": []}",
      "correlation_id": "2c32ff5a-4cea-4ccf-abbd-be5b0e0c6472"
    }
  ]
}
```

Done: call 0a9079d8-b378-4843-8177-dceb57bcb560 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16565"
}
```

```json
{
  "challenge_id": "e306fda4-795d-472f-a6cd-1604107bf025",
  "expires_at": "2026-10-30T13:21:59.969656927Z",
  "resend_available_at": "2026-10-30T13:17:00.969656927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "295148",
  "sent_at": "2026-10-30T13:16:59.972381224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e306fda4-795d-472f-a6cd-1604107bf025",
  "code": "295148",
  "device_ref": "sandbox-16565"
}
```

```json
{
  "session_id": "b4aede47-7264-4d6a-ad68-08674aedd754",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzEyMCwiaWF0IjoxNzkzMzY2MjIwLCJqdGkiOiI1N2YxOTI2Ny00MTg2LTRhYjMtODgyMC1mYTU0NDJmMWU0NTUiLCJzaWQiOiJiNGFlZGU0Ny03MjY0LTRkNmEtYWQ2OC0wODY3NGFlZGQ3NTQifQ.UDJf4bHHXiM9KDdnh1dRlLP1Y-mVWfBM_ovPYEmZLL8",
  "access_expires_at": "2026-10-30T13:32:00.186231363Z",
  "refresh_token": "yYNIAwQEOQ0PO3NZPpDC3vP_HhyVAesW53poXllNF34",
  "refresh_expires_at": "2026-11-29T13:17:00.185778322Z",
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
  "command_id": "25d92ecd-e13c-439c-abe1-5deb6ad8ad07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:00Z",
    "sequence": 1793366220556
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc33b6f6-314d-4ee3-9c4d-4fec127ef90d",
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
  "last_heartbeat_at": "2026-10-30T13:17:00.573626Z",
  "last_location_at": "2026-10-30T13:17:00.573626Z",
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
  "session_id": "94c26697-c1d6-4c00-8700-142281c46720",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxMjAsImlhdCI6MTc5MzM2NjIyMCwianRpIjoiNTczZmI5NmUtZThjNC00Mzg5LWE1MDItYmVjNTE1NTA2YjViIiwic2lkIjoiOTRjMjY2OTctYzFkNi00YzAwLTg3MDAtMTQyMjgxYzQ2NzIwIn0.mSzs1pWF4Of3hiTXf37lK4XYDbv7UwoHVNk3fZF9aJ8",
  "access_expires_at": "2026-10-30T13:32:00.969697439Z",
  "refresh_token": "X0YkUYN7zF86rx4TD2z4xHl5n4_fm68tRlwC2AlfsmY",
  "refresh_expires_at": "2026-10-31T01:17:00.969280402Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ca88b2cf-c9ef-4466-8348-78cd1ec09714",
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
  "id": "b993383d-1adf-496e-a83a-92f2a893a414",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:01.167444Z",
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
  "command_id": "cb2f256e-c394-4073-a4d5-0c2fdeb498a2",
  "quote_id": "b993383d-1adf-496e-a83a-92f2a893a414",
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
    "phone": "+380673174389"
  }
}
```

```json
{
  "id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
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
  "created_at": "2026-10-30T13:17:01.385673Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673174389"
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
    "id": "0894db52-431c-4c23-8e7c-ddf0e08286af",
    "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
    "expires_at": "2026-10-30T13:17:16.390231Z",
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

`POST /api/driver/v1/offers/0894db52-431c-4c23-8e7c-ddf0e08286af/accept` → **200**

```json
{
  "command_id": "90fbbed9-70cf-4c31-843b-355afb1e583a"
}
```

```json
{
  "id": "0bf7c189-cadb-49c4-9623-6eed12ed4c78",
  "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "61a53e83-82f9-4ae0-86fd-bc27934a2d1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "61a53e83-82f9-4ae0-86fd-bc27934a2d1f",
  "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
  "assignment_id": "0bf7c189-cadb-49c4-9623-6eed12ed4c78",
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
    "phone": "+380673174389"
  }
}
```

`POST /api/driver/v1/work-sessions/fc33b6f6-314d-4ee3-9c4d-4fec127ef90d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:04Z",
    "sequence": 1793366224296
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc33b6f6-314d-4ee3-9c4d-4fec127ef90d",
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
  "last_heartbeat_at": "2026-10-30T13:17:04.314535Z",
  "last_location_at": "2026-10-30T13:17:04.314535Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/61a53e83-82f9-4ae0-86fd-bc27934a2d1f/arrive` → **200**

```json
{
  "command_id": "b21f75f8-d1fe-4219-ba5e-3ea2815b7347",
  "expected_version": 0
}
```

```json
{
  "id": "61a53e83-82f9-4ae0-86fd-bc27934a2d1f",
  "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
  "assignment_id": "0bf7c189-cadb-49c4-9623-6eed12ed4c78",
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
  "arrived_at": "2026-10-30T13:17:04.51764Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673174389"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  },
  {
    "phone": "+380673174389",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:06.100817809Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  },
  {
    "phone": "+380673174389",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:06.100817809Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673174389` → **200**

```json
[
  {
    "phone": "+380673174389",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:03.092368381Z"
  },
  {
    "phone": "+380673174389",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:17:06.100817809Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/61a53e83-82f9-4ae0-86fd-bc27934a2d1f/start` → **200**

```json
{
  "command_id": "c0807fa2-d157-4ec9-a0dd-bb81914913e8",
  "expected_version": 1
}
```

```json
{
  "id": "61a53e83-82f9-4ae0-86fd-bc27934a2d1f",
  "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
  "assignment_id": "0bf7c189-cadb-49c4-9623-6eed12ed4c78",
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
  "arrived_at": "2026-10-30T13:17:04.51764Z",
  "started_at": "2026-10-30T13:17:06.840837Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673174389"
  }
}
```

`POST /api/driver/v1/trips/61a53e83-82f9-4ae0-86fd-bc27934a2d1f/complete` → **200**

```json
{
  "command_id": "5f23b6c2-9804-476f-9424-a8ca07140600",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:17:07Z",
  "cash_received": true
}
```

```json
{
  "id": "61a53e83-82f9-4ae0-86fd-bc27934a2d1f",
  "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
  "assignment_id": "0bf7c189-cadb-49c4-9623-6eed12ed4c78",
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
  "arrived_at": "2026-10-30T13:17:04.51764Z",
  "started_at": "2026-10-30T13:17:06.840837Z",
  "completed_at": "2026-10-30T13:17:07.066815Z",
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
  "session_id": "fc33b6f6-314d-4ee3-9c4d-4fec127ef90d",
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
  "last_heartbeat_at": "2026-10-30T13:17:04.314535Z",
  "last_location_at": "2026-10-30T13:17:04.314535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fc33b6f6-314d-4ee3-9c4d-4fec127ef90d/close` → **200**

```json
{
  "command_id": "606bcac6-b551-4c83-9524-4f3e91dc7821",
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
  "phone": "+380633583904",
  "device_ref": "sandbox-26442"
}
```

```json
{
  "challenge_id": "a0825c69-87bb-44f7-93b7-936a16fc5692",
  "expires_at": "2026-10-30T13:22:07.683905783Z",
  "resend_available_at": "2026-10-30T13:17:08.683905783Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633583904` → **200**

```json
{
  "phone": "+380633583904",
  "audience": "CLIENT",
  "code": "658162",
  "sent_at": "2026-10-30T13:17:07.68653917Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0825c69-87bb-44f7-93b7-936a16fc5692",
  "code": "658162",
  "device_ref": "sandbox-26442"
}
```

```json
{
  "session_id": "d4a4efe3-fc65-4cc7-b397-a479e59a6c3f",
  "subject": {
    "type": "CLIENT",
    "id": "b1759900-fd39-4206-b8ea-9a44a6a25210"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTc1OTkwMC1mZDM5LTQyMDYtYjhlYS05YTQ0YTZhMjUyMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTI3LCJpYXQiOjE3OTMzNjYyMjcsImp0aSI6ImU1OTAyOGQ5LTRhZTItNGVmNC04NTNmLTYzYTU3NThkYjkzYSIsInNpZCI6ImQ0YTRlZmUzLWZjNjUtNGNjNy1iMzk3LWE0NzllNTlhNmMzZiJ9.wmq2c7hPLLA93v4arOKt2QAHaaXr6jmK64JqBpGDCFU",
  "access_expires_at": "2026-10-30T13:32:07.901373839Z",
  "refresh_token": "8NBLLi4W2xR0KWYCxdtP1_qN3JtYq9T9PRcnW4mB_wk",
  "refresh_expires_at": "2026-11-29T13:17:07.90089375Z",
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
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport"
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
  "device_ref": "sandbox-13101"
}
```

```json
{
  "challenge_id": "9c4259c9-ff05-40ce-ac3e-2831eeb6f603",
  "expires_at": "2026-10-30T13:22:08.26589349Z",
  "resend_available_at": "2026-10-30T13:17:09.26589349Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "487186",
  "sent_at": "2026-10-30T13:17:08.268164928Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c4259c9-ff05-40ce-ac3e-2831eeb6f603",
  "code": "487186",
  "device_ref": "sandbox-13101"
}
```

```json
{
  "session_id": "37b9ed45-0e48-4a73-8b9e-df8034ea7d12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzEyOCwiaWF0IjoxNzkzMzY2MjI4LCJqdGkiOiI5ZjMxNTQzYy1iMzFiLTQ2NzgtODMyZS02MTI3ZGVkZmM2MTYiLCJzaWQiOiIzN2I5ZWQ0NS0wZTQ4LTRhNzMtOGI5ZS1kZjgwMzRlYTdkMTIifQ.p5_gIkieWd-mOXQbXQmZSYV7aKn5tfAlzLQlg1dqsx4",
  "access_expires_at": "2026-10-30T13:32:08.483273182Z",
  "refresh_token": "7isxEpabPWlullhcT1rnVafWWYlZhip25ZvUo5vPz2E",
  "refresh_expires_at": "2026-11-29T13:17:08.482837259Z",
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
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać"
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
  "session_id": "c1a8fa01-3883-4fa3-b276-04f5c27a311d",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxMjksImlhdCI6MTc5MzM2NjIyOSwianRpIjoiNzU0ODE5NWMtMWViZi00NmE4LWI1OTQtMDE2OTg0MjlhZThkIiwic2lkIjoiYzFhOGZhMDEtMzg4My00ZmEzLWIyNzYtMDRmNWMyN2EzMTFkIn0.8PJxOvHUAh4mIx8x2fcFGA1BWA67vOJ_x8gFk-7v6ns",
  "access_expires_at": "2026-10-30T13:32:09.049413774Z",
  "refresh_token": "vs85PqcyKJbGDNX_EDDPVp9Duc0kpuQJYjFbZ5senLs",
  "refresh_expires_at": "2026-10-31T01:17:09.049071682Z",
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
  "session_id": "a4c77df5-f03c-4c5e-9ad3-7e47fcb44f56",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxMjksImlhdCI6MTc5MzM2NjIyOSwianRpIjoiZGIxNzA0OWMtMmU5Ni00YTliLWJjNjktYWY0ZWEyZmU3MWNmIiwic2lkIjoiYTRjNzdkZjUtZjAzYy00YzVlLTlhZDMtN2U0N2ZjYjQ0ZjU2In0.BhnGLqMTr870tcjNwBlLeZhFvzDcjbetvbaiMhjEO7E",
  "access_expires_at": "2026-10-30T13:32:09.43824105Z",
  "refresh_token": "xpPwA5RdDR0qp8OtxuGlVFGdt4kpYR859nmIaps8-g8",
  "refresh_expires_at": "2026-10-31T01:17:09.437869294Z",
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
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek"
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
  "command_id": "058de2dc-2b2c-456a-9994-9f90fb925895",
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
  "id": "957dbe8c-4317-4839-b86d-4d03702d8772",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:09.822169Z",
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
  "command_id": "05c3ef02-2457-4ae1-b3e4-a9a5f0ed3435",
  "quote_id": "957dbe8c-4317-4839-b86d-4d03702d8772",
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
  "id": "2b125ea5-7680-4e8a-bf39-5bffb8c99837",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1759900-fd39-4206-b8ea-9a44a6a25210",
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
  "created_at": "2026-10-30T13:17:10.025848Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2b125ea5-7680-4e8a-bf39-5bffb8c99837` → **200**

```json
{
  "id": "2b125ea5-7680-4e8a-bf39-5bffb8c99837",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1759900-fd39-4206-b8ea-9a44a6a25210",
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
  "created_at": "2026-10-30T13:17:10.025848Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2b125ea5-7680-4e8a-bf39-5bffb8c99837/cancel` → **200**

```json
{
  "command_id": "f107bce4-1709-4765-9391-890df7523f4f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "2b125ea5-7680-4e8a-bf39-5bffb8c99837",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b1759900-fd39-4206-b8ea-9a44a6a25210",
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
  "created_at": "2026-10-30T13:17:10.025848Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie"
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
  "command_id": "c830fedf-47d2-41e6-94c5-a61da6b207c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:10Z",
    "sequence": 1793366230845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "959cb76c-dcf4-4632-b4f4-0bb585f15470",
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
  "last_heartbeat_at": "2026-10-30T13:17:10.861971Z",
  "last_location_at": "2026-10-30T13:17:10.861971Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8795"
}
```

```json
{
  "challenge_id": "d498f1f9-3969-4f39-93d5-24fd47b46332",
  "expires_at": "2026-10-30T13:22:11.050380163Z",
  "resend_available_at": "2026-10-30T13:17:12.050380163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "613263",
  "sent_at": "2026-10-30T13:17:11.052578867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d498f1f9-3969-4f39-93d5-24fd47b46332",
  "code": "613263",
  "device_ref": "sandbox-8795"
}
```

```json
{
  "session_id": "54af5ad5-70af-46e0-94c4-d3ee9b4a251a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzEzMSwiaWF0IjoxNzkzMzY2MjMxLCJqdGkiOiJlZmRkMWY2My04NmQxLTQwY2QtYTY1Ny1hYzM2ODllYWFjZTkiLCJzaWQiOiI1NGFmNWFkNS03MGFmLTQ2ZTAtOTRjNC1kM2VlOWI0YTI1MWEifQ.sE_FCkXMgH8CqTiQrM7z07kwloUqcIp6XkJM57egIg0",
  "access_expires_at": "2026-10-30T13:32:11.264469786Z",
  "refresh_token": "ixvAxjKI909g57uLNai6lzlmEYsxP-fMpgSo-snR-MA",
  "refresh_expires_at": "2026-11-29T13:17:11.264125278Z",
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
  "command_id": "e189cbfa-140e-4f0c-8c48-5cc35c994abc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:11Z",
    "sequence": 1793366231693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:11.710608Z",
  "last_location_at": "2026-10-30T13:17:11.710608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fa2f0750-74d5-4a3b-97d5-587ff3cb305f",
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
  "id": "c4d041cd-8129-4009-b20a-03650ee772a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:11.916145Z",
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
  "command_id": "396780e5-d6e5-4a35-83d0-d998cca5e5ae",
  "quote_id": "c4d041cd-8129-4009-b20a-03650ee772a8",
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
  "id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1759900-fd39-4206-b8ea-9a44a6a25210",
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
  "created_at": "2026-10-30T13:17:12.118251Z",
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
    "id": "6404d251-93f6-4fd3-8f47-f1be3bacfe5e",
    "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
    "expires_at": "2026-10-30T13:17:27.120644Z",
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

`POST /api/driver/v1/offers/6404d251-93f6-4fd3-8f47-f1be3bacfe5e/accept` → **200**

```json
{
  "command_id": "89063ae3-ed73-4fc7-80e3-6fb8cab2f36a"
}
```

```json
{
  "id": "0c851dc6-a954-4936-8149-8d2f6c3f3d2d",
  "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9583222f-2049-4fc5-b967-cdc6bea1a362",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9583222f-2049-4fc5-b967-cdc6bea1a362",
  "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "assignment_id": "0c851dc6-a954-4936-8149-8d2f6c3f3d2d",
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

`POST /api/driver/v1/trips/9583222f-2049-4fc5-b967-cdc6bea1a362/cancel` → **200**

```json
{
  "command_id": "8a988376-da28-4161-a0f3-8e4c49b74fa9",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "9583222f-2049-4fc5-b967-cdc6bea1a362",
  "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "assignment_id": "0c851dc6-a954-4936-8149-8d2f6c3f3d2d",
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

`GET /api/rider/v1/orders/bfcb76ac-390a-454b-9a94-a9bd410e6b95` → **200**

```json
{
  "id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b1759900-fd39-4206-b8ea-9a44a6a25210",
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
    "id": "0c851dc6-a954-4936-8149-8d2f6c3f3d2d",
    "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9583222f-2049-4fc5-b967-cdc6bea1a362",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:17:12.118251Z",
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
    "id": "dffb1742-6ab9-41db-8e6a-15125b25a82b",
    "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
    "expires_at": "2026-10-30T13:17:27.920938Z",
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

`POST /api/driver/v1/offers/dffb1742-6ab9-41db-8e6a-15125b25a82b/accept` → **200**

```json
{
  "command_id": "709552bb-b454-41c3-93d5-7d2cbac73413"
}
```

```json
{
  "id": "d0373906-2770-49f0-b917-b81ae858e256",
  "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ca7b78e7-6182-4b56-a967-9cda8c91cc21",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ca7b78e7-6182-4b56-a967-9cda8c91cc21",
  "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "assignment_id": "d0373906-2770-49f0-b917-b81ae858e256",
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

`POST /api/driver/v1/trips/ca7b78e7-6182-4b56-a967-9cda8c91cc21/cancel` → **200**

```json
{
  "command_id": "172b164a-66b8-4799-96d2-f917846c585d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "ca7b78e7-6182-4b56-a967-9cda8c91cc21",
  "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
  "assignment_id": "d0373906-2770-49f0-b917-b81ae858e256",
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
    "id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:17:12.118251Z",
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
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "2b125ea5-7680-4e8a-bf39-5bffb8c99837",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:17:10.025848Z",
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
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/bfcb76ac-390a-454b-9a94-a9bd410e6b95/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:17:12.118682Z",
      "actor": {
        "type": "CLIENT",
        "id": "b1759900-fd39-4206-b8ea-9a44a6a25210",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
        "quote_id": "c4d041cd-8129-4009-b20a-03650ee772a8",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "3e547861-709d-450f-8c28-e6838bec61e3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:17:12.120089Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
        "attempt_id": "6bfcc33c-72e6-4844-a6ef-1cf77ebaa846",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3e547861-709d-450f-8c28-e6838bec61e3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:17:12.124712Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6404d251-93f6-4fd3-8f47-f1be3bacfe5e",
        "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "3e547861-709d-450f-8c28-e6838bec61e3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:17:12.523389Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6404d251-93f6-4fd3-8f47-f1be3bacfe5e",
        "order_id": "bfcb76ac-390a-454b-9a94-a9bd410e6b95",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0c851dc6-a954-4936-8149-8d2f6c3f3d2d"
      },
      "correlation_id": "505bd219-a244-490e-85f9-26948b532f2c"
```

Done: orders 2b125ea5-7680-4e8a-bf39-5bffb8c99837, bfcb76ac-390a-454b-9a94-a9bd410e6b95.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731626865",
  "device_ref": "sandbox-13788"
}
```

```json
{
  "challenge_id": "b63448dd-253a-4012-8231-4029310ce559",
  "expires_at": "2026-10-30T13:22:14.509282835Z",
  "resend_available_at": "2026-10-30T13:17:15.509282835Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731626865` → **200**

```json
{
  "phone": "+380731626865",
  "audience": "CLIENT",
  "code": "390864",
  "sent_at": "2026-10-30T13:17:14.511704696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b63448dd-253a-4012-8231-4029310ce559",
  "code": "390864",
  "device_ref": "sandbox-13788"
}
```

```json
{
  "session_id": "b425e949-be6a-43af-9f5c-1df7266e7186",
  "subject": {
    "type": "CLIENT",
    "id": "b4357505-e4f0-4018-b81d-fef5c124eadf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNDM1NzUwNS1lNGYwLTQwMTgtYjgxZC1mZWY1YzEyNGVhZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTM0LCJpYXQiOjE3OTMzNjYyMzQsImp0aSI6IjMwZGRiNTMxLTYyYzUtNDI1ZS1iNGY4LThjNDU4ZDhlZWU5NCIsInNpZCI6ImI0MjVlOTQ5LWJlNmEtNDNhZi05ZjVjLTFkZjcyNjZlNzE4NiJ9.RIfC3v8u1eCkRzoPTNljjaW0hNmZuEu9TzEQpvyG5BI",
  "access_expires_at": "2026-10-30T13:32:14.717642449Z",
  "refresh_token": "2Mv3VDua0Mnde0HIVp7mW-4JPXV_cqEF6NR8-mxodwI",
  "refresh_expires_at": "2026-11-29T13:17:14.717315457Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6db899bb-25ae-4f46-95a0-2ab0e6f3a971",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "deeb0c54-f06c-4c1e-814a-de1d2f40ac55",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-deeb0c54-f06c-4c1e-814a-de1d2f40ac55",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "40c31c01f0b6e272b24bfc6566b1e71f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=deeb0c54-f06c-4c1e-814a-de1d2f40ac55",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731626865"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=deeb0c54-f06c-4c1e-814a-de1d2f40ac55",
  "expires_at": "2026-10-30T13:47:14.91622Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/deeb0c54-f06c-4c1e-814a-de1d2f40ac55` → **200**

```json
{
  "id": "deeb0c54-f06c-4c1e-814a-de1d2f40ac55",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:47:14.91622Z",
  "card": {
    "id": "a6fcea27-860e-4e83-b8fd-afc437b2b2eb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9849",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:17:15.120412Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a6fcea27-860e-4e83-b8fd-afc437b2b2eb",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9849",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:17:15.120412Z"
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
  "device_ref": "sandbox-30057"
}
```

```json
{
  "challenge_id": "74cf6d6b-9d4b-4d70-abfa-344aff67e62d",
  "expires_at": "2026-10-30T13:22:15.513470222Z",
  "resend_available_at": "2026-10-30T13:17:16.513470222Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "084082",
  "sent_at": "2026-10-30T13:17:15.515777353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74cf6d6b-9d4b-4d70-abfa-344aff67e62d",
  "code": "084082",
  "device_ref": "sandbox-30057"
}
```

```json
{
  "session_id": "8f83cab8-0da6-428d-98cf-9cc3552c4023",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzEzNSwiaWF0IjoxNzkzMzY2MjM1LCJqdGkiOiJiN2IyOThiMC0wZDRiLTRiYTctYTk1Mi0wZmFmYTI3YjRjYTMiLCJzaWQiOiI4ZjgzY2FiOC0wZGE2LTQyOGQtOThjZi05Y2MzNTUyYzQwMjMifQ.rP2L_X09icXSNNbM1IYgYpVnTH8JfQtLbBnAjkvEMcs",
  "access_expires_at": "2026-10-30T13:32:15.733317115Z",
  "refresh_token": "a_WIpOMU08y9GJwZAe0Az6VqYMOTyI3A9tEE_WaKG2E",
  "refresh_expires_at": "2026-11-29T13:17:15.732893798Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:11.710608Z",
  "last_location_at": "2026-10-30T13:17:11.710608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/816ab6ff-c9df-4a12-870f-822550922a87/handover` → **200**

```json
{
  "command_id": "9c95dab6-b80b-43e1-ba8e-ee36287b31d5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:11.710608Z",
  "last_location_at": "2026-10-30T13:17:11.710608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/816ab6ff-c9df-4a12-870f-822550922a87/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:16Z",
    "sequence": 1793366236310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:16.327254Z",
  "last_location_at": "2026-10-30T13:17:16.327254Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "909f3b58-4c72-428e-9d3b-23082a236b5e",
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
  "id": "05eb8f91-0752-42cd-888c-ac988069a68f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:16.531058Z",
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
  "command_id": "8a804b7c-7302-4f2f-acc9-767c8d888326",
  "quote_id": "05eb8f91-0752-42cd-888c-ac988069a68f",
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
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
  "created_at": "2026-10-30T13:17:16.725653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204` → **200**

```json
{
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
  "created_at": "2026-10-30T13:17:16.725653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204` → **200**

```json
{
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
  "created_at": "2026-10-30T13:17:16.725653Z",
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
    "id": "41836a09-42b3-475d-b340-a810b4f6193f",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "expires_at": "2026-10-30T13:17:32.459221Z",
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

`POST /api/driver/v1/offers/41836a09-42b3-475d-b340-a810b4f6193f/accept` → **200**

```json
{
  "command_id": "f2215bea-4c91-436e-88e4-5c97f746d460"
}
```

```json
{
  "id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "assignment_id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
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

`POST /api/driver/v1/work-sessions/816ab6ff-c9df-4a12-870f-822550922a87/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:18Z",
    "sequence": 1793366238889
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:18.905402Z",
  "last_location_at": "2026-10-30T13:17:18.905402Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b686d30b-0114-4e97-a5c7-b4c7e6767057/arrive` → **200**

```json
{
  "command_id": "c578c4fd-79f6-4119-8674-5c1ee8734e3d",
  "expected_version": 0
}
```

```json
{
  "id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "assignment_id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
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
  "arrived_at": "2026-10-30T13:17:19.097201Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b686d30b-0114-4e97-a5c7-b4c7e6767057/start` → **200**

```json
{
  "command_id": "4316e449-ff1a-41ef-9015-8a71e8ac79b3",
  "expected_version": 1
}
```

```json
{
  "id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "assignment_id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
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
  "arrived_at": "2026-10-30T13:17:19.097201Z",
  "started_at": "2026-10-30T13:17:19.302582Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b686d30b-0114-4e97-a5c7-b4c7e6767057/complete` → **200**

```json
{
  "command_id": "07e1cd7c-b0d9-4ed9-bd80-126e83688569",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:17:19Z",
  "cash_received": true
}
```

```json
{
  "id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "assignment_id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
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
  "arrived_at": "2026-10-30T13:17:19.097201Z",
  "started_at": "2026-10-30T13:17:19.302582Z",
  "completed_at": "2026-10-30T13:17:19.543379Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204` → **200**

```json
{
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
    "id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:16.725653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204` → **200**

```json
{
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
    "id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:16.725653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204` → **200**

```json
{
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
    "id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:16.725653Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204` → **200**

```json
{
  "id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
    "id": "a7a0d4e7-7839-460e-9e1c-9004b5ed39df",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b686d30b-0114-4e97-a5c7-b4c7e6767057",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:16.725653Z",
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

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204/tip` → **200**

```json
{
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
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
  "available_until": "2026-10-31T13:17:19.543379Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204/tip` → **201**

```json
{
  "command_id": "525a5756-cdca-43fe-9ae1-b6415ea4ec51",
  "amount_minor": 2500
}
```

```json
{
  "id": "a4d5cce5-58bd-4a60-a0a8-a45e302654a9",
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:17:23.985205Z"
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204/tip` → **200**

```json
{
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
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
  "available_until": "2026-10-31T13:17:19.543379Z",
  "open": false,
  "tip": {
    "id": "a4d5cce5-58bd-4a60-a0a8-a45e302654a9",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:17:23.985205Z"
  }
}
```

`GET /api/rider/v1/orders/7dbe309f-7d6e-40a7-9420-c47802e09204/tip` → **200**

```json
{
  "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
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
  "available_until": "2026-10-31T13:17:19.543379Z",
  "open": false,
  "tip": {
    "id": "a4d5cce5-58bd-4a60-a0a8-a45e302654a9",
    "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:17:23.985205Z"
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
      "id": "b4c28e7c-079d-40e4-9e84-ad951c2fdcec",
      "at": "2026-10-30T13:17:25.551758Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
      "counterpart_id": null
    },
    {
      "id": "d57c8aca-49b2-49d0-8f10-b0ce9c6b41b9",
      "at": "2026-10-30T13:17:20.506383Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6256044b-dbf2-409c-87ef-211bdfff801f",
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
  "id": "b3e24aba-c4a6-41b6-982d-2581cc5e6762",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:25.754617Z",
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
  "session_id": "ca3cffe4-ab4b-4a8a-9260-8b01f154be01",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxNDYsImlhdCI6MTc5MzM2NjI0NiwianRpIjoiZjFiN2I2ZWMtM2Q5OC00OWNiLWFlYjItYTU0N2FjMjkzNDdhIiwic2lkIjoiY2EzY2ZmZTQtYWI0Yi00YThhLTkyNjAtOGIwMWYxNTRiZTAxIn0.bt8Bsmqmr7odo_9uX0ZNmhL0gdP8uQZg5zH7jocbCxE",
  "access_expires_at": "2026-10-30T13:32:26.143991451Z",
  "refresh_token": "z8WZoR6YnQWLo8L1_jcX1slKC196SjUJWzGTPBVZI3M",
  "refresh_expires_at": "2026-10-31T01:17:26.143602857Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731626865` → **200**

```json
{
  "client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf"
}
```

`POST /api/admin/v1/rider-wallets/b4357505-e4f0-4018-b81d-fef5c124eadf/top-ups` → **201**

```json
{
  "command_id": "fb0869bb-e820-4430-85ec-f8653cffd3f9",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
      "id": "8894df7a-61b0-4ddd-8de8-f5b9128c6f95",
      "at": "2026-10-30T13:17:26.517344Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "45490291-a6db-424a-8e73-17b188a07956",
  "quote_id": "b3e24aba-c4a6-41b6-982d-2581cc5e6762",
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
  "id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
  "created_at": "2026-10-30T13:17:26.718056Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b1dcbd5b-a151-4937-844f-d098592ceecd` → **200**

```json
{
  "id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
  "created_at": "2026-10-30T13:17:26.718056Z",
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
    "id": "69cc83db-3f2c-4ee1-b6e8-b3599916b5ef",
    "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
    "expires_at": "2026-10-30T13:17:41.723239Z",
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

`POST /api/driver/v1/offers/69cc83db-3f2c-4ee1-b6e8-b3599916b5ef/accept` → **200**

```json
{
  "command_id": "2e131197-1f64-403a-9ddb-801fc9c210fe"
}
```

```json
{
  "id": "6a921c86-75c7-4383-8f3b-0ee7df69858a",
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0eb1d8f3-639b-44b3-b663-711dccd64efa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0eb1d8f3-639b-44b3-b663-711dccd64efa",
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "assignment_id": "6a921c86-75c7-4383-8f3b-0ee7df69858a",
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

`POST /api/driver/v1/work-sessions/816ab6ff-c9df-4a12-870f-822550922a87/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:27Z",
    "sequence": 1793366247696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:27.713943Z",
  "last_location_at": "2026-10-30T13:17:27.713943Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0eb1d8f3-639b-44b3-b663-711dccd64efa/arrive` → **200**

```json
{
  "command_id": "8b1e7c84-2ea5-47c2-b4a8-45ddbfb1650a",
  "expected_version": 0
}
```

```json
{
  "id": "0eb1d8f3-639b-44b3-b663-711dccd64efa",
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "assignment_id": "6a921c86-75c7-4383-8f3b-0ee7df69858a",
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
  "arrived_at": "2026-10-30T13:17:27.915712Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0eb1d8f3-639b-44b3-b663-711dccd64efa/start` → **200**

```json
{
  "command_id": "8623b7ad-35c1-40b4-b279-8928347e4019",
  "expected_version": 1
}
```

```json
{
  "id": "0eb1d8f3-639b-44b3-b663-711dccd64efa",
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "assignment_id": "6a921c86-75c7-4383-8f3b-0ee7df69858a",
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
  "arrived_at": "2026-10-30T13:17:27.915712Z",
  "started_at": "2026-10-30T13:17:28.115309Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0eb1d8f3-639b-44b3-b663-711dccd64efa/complete` → **200**

```json
{
  "command_id": "0abf605a-fb10-4062-989c-9e44c1cdc707",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:17:28Z",
  "cash_received": true
}
```

```json
{
  "id": "0eb1d8f3-639b-44b3-b663-711dccd64efa",
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "assignment_id": "6a921c86-75c7-4383-8f3b-0ee7df69858a",
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
  "arrived_at": "2026-10-30T13:17:27.915712Z",
  "started_at": "2026-10-30T13:17:28.115309Z",
  "completed_at": "2026-10-30T13:17:28.308895Z",
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
  "client_id": "b4357505-e4f0-4018-b81d-fef5c124eadf",
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
      "id": "8894df7a-61b0-4ddd-8de8-f5b9128c6f95",
      "at": "2026-10-30T13:17:26.517344Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
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

`GET /api/rider/v1/orders/b1dcbd5b-a151-4937-844f-d098592ceecd/tip` → **200**

```json
{
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
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
  "available_until": "2026-10-31T13:17:28.308895Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b1dcbd5b-a151-4937-844f-d098592ceecd/tip` → **201**

```json
{
  "command_id": "2821fb6c-85b6-465a-8a26-e1076167c807",
  "amount_minor": 2500
}
```

```json
{
  "id": "872cc665-8b23-42a0-a2c5-ffcd9985dbcb",
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:17:29.079573Z"
}
```

`GET /api/rider/v1/orders/b1dcbd5b-a151-4937-844f-d098592ceecd/tip` → **200**

```json
{
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
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
  "available_until": "2026-10-31T13:17:28.308895Z",
  "open": false,
  "tip": {
    "id": "872cc665-8b23-42a0-a2c5-ffcd9985dbcb",
    "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:17:29.079573Z"
  }
}
```

`GET /api/rider/v1/orders/b1dcbd5b-a151-4937-844f-d098592ceecd/tip` → **200**

```json
{
  "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
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
  "available_until": "2026-10-31T13:17:28.308895Z",
  "open": false,
  "tip": {
    "id": "872cc665-8b23-42a0-a2c5-ffcd9985dbcb",
    "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:17:29.079573Z"
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
      "id": "484f82fd-2a96-4f1b-9af0-d55e629daa32",
      "at": "2026-10-30T13:17:30.614556Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
      "counterpart_id": null
    },
    {
      "id": "0b8b7694-d69e-4519-8a09-d4c44b6fba8f",
      "at": "2026-10-30T13:17:28.585418Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b1dcbd5b-a151-4937-844f-d098592ceecd",
      "counterpart_id": null
    },
    {
      "id": "b4c28e7c-079d-40e4-9e84-ad951c2fdcec",
      "at": "2026-10-30T13:17:25.551758Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
      "counterpart_id": null
    },
    {
      "id": "d57c8aca-49b2-49d0-8f10-b0ce9c6b41b9",
      "at": "2026-10-30T13:17:20.506383Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7dbe309f-7d6e-40a7-9420-c47802e09204",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "816ab6ff-c9df-4a12-870f-822550922a87",
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
  "last_heartbeat_at": "2026-10-30T13:17:27.713943Z",
  "last_location_at": "2026-10-30T13:17:27.713943Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/816ab6ff-c9df-4a12-870f-822550922a87/close` → **200**

```json
{
  "command_id": "7a3e6ee0-020e-43f8-b741-902e6b0f7362",
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

Done: card order b1dcbd5b-a151-4937-844f-d098592ceecd.

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
  "phone": "+380739433430",
  "device_ref": "sandbox-11149"
}
```

```json
{
  "challenge_id": "de420e86-a808-4220-99db-4488e122755e",
  "expires_at": "2026-10-30T13:22:31.447896466Z",
  "resend_available_at": "2026-10-30T13:17:32.447896466Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739433430` → **200**

```json
{
  "phone": "+380739433430",
  "audience": "CLIENT",
  "code": "889655",
  "sent_at": "2026-10-30T13:17:31.449969938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de420e86-a808-4220-99db-4488e122755e",
  "code": "889655",
  "device_ref": "sandbox-11149"
}
```

```json
{
  "session_id": "2aac3d03-899b-4852-be0c-53178290cdda",
  "subject": {
    "type": "CLIENT",
    "id": "54c8f455-9c69-4019-ab06-edfb5975ff49"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGM4ZjQ1NS05YzY5LTQwMTktYWIwNi1lZGZiNTk3NWZmNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTUxLCJpYXQiOjE3OTMzNjYyNTEsImp0aSI6IjgwMWM3YTI0LWM2MjQtNDE4Yi04MjE0LWFhMGM5MWRiNjlkNiIsInNpZCI6IjJhYWMzZDAzLTg5OWItNDg1Mi1iZTBjLTUzMTc4MjkwY2RkYSJ9.WULY0OaJuh4TASFOsews-fCZSuJCjE_fpupZ-u_ddYg",
  "access_expires_at": "2026-10-30T13:32:31.660498883Z",
  "refresh_token": "iOGNyps7_T92FGQQaKV9B4aJgtzTGfKrCBX1djxa1tk",
  "refresh_expires_at": "2026-11-29T13:17:31.660187636Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e9fa06ca-ebae-498e-8c6e-b3ab1169c49d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "eb6573c5-690f-4275-91fd-3a97ef2b52f3",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-eb6573c5-690f-4275-91fd-3a97ef2b52f3",
    "orderDate": "1793366251",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "5268bac0c1cd5765fca151274101bc59",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=eb6573c5-690f-4275-91fd-3a97ef2b52f3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739433430"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=eb6573c5-690f-4275-91fd-3a97ef2b52f3",
  "created_at": "2026-10-30T13:17:31.855894Z",
  "expires_at": "2026-10-30T13:47:31.855894Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/eb6573c5-690f-4275-91fd-3a97ef2b52f3` → **200**

```json
{
  "id": "eb6573c5-690f-4275-91fd-3a97ef2b52f3",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:17:31.855894Z",
  "expires_at": "2026-10-30T13:47:31.855894Z",
  "completed_at": "2026-10-30T13:17:32.055238Z",
  "masked_pan": "41****2443",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "54c8f455-9c69-4019-ab06-edfb5975ff49",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "54c8f455-9c69-4019-ab06-edfb5975ff49",
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
      "id": "b09207b8-44ae-4446-8abb-ec0c10c35d1d",
      "at": "2026-10-30T13:17:32.627269Z",
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
  "client_id": "54c8f455-9c69-4019-ab06-edfb5975ff49",
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
      "id": "b09207b8-44ae-4446-8abb-ec0c10c35d1d",
      "at": "2026-10-30T13:17:32.627269Z",
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
  "device_ref": "sandbox-24401"
}
```

```json
{
  "challenge_id": "dbeecdfd-4932-4409-9f53-496ca5577b7b",
  "expires_at": "2026-10-30T13:22:33.880022258Z",
  "resend_available_at": "2026-10-30T13:17:34.880022258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "457911",
  "sent_at": "2026-10-30T13:17:33.882043287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbeecdfd-4932-4409-9f53-496ca5577b7b",
  "code": "457911",
  "device_ref": "sandbox-24401"
}
```

```json
{
  "session_id": "665f0faa-b733-40be-a8b3-447f39358245",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzE1NCwiaWF0IjoxNzkzMzY2MjU0LCJqdGkiOiJjMTU4YWM4OS1mM2FjLTRlYjUtYTIzZS1lMWM0MTcxNmNmZTEiLCJzaWQiOiI2NjVmMGZhYS1iNzMzLTQwYmUtYThiMy00NDdmMzkzNTgyNDUifQ.Lo20LM3IwM-WhkeBA9k7p7nZT-jbHJZY8oT3qqkhZJc",
  "access_expires_at": "2026-10-30T13:32:34.099326222Z",
  "refresh_token": "D9RCYOgG2Trqods1bnvF3lZN8MNL9I0r9wYRn_lB1gg",
  "refresh_expires_at": "2026-11-29T13:17:34.098697777Z",
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
  "command_id": "c4f3662d-1e7d-470e-9e95-33f05379fb45",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "0b927cb9-55e7-44fc-971b-21c36d9d73cd",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0b927cb9-55e7-44fc-971b-21c36d9d73cd",
    "orderDate": "1793366254",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "1057103cc9f2eeb055e41f3b4746e498",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0b927cb9-55e7-44fc-971b-21c36d9d73cd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0b927cb9-55e7-44fc-971b-21c36d9d73cd",
  "created_at": "2026-10-30T13:17:34.485028Z",
  "expires_at": "2026-10-30T13:47:34.485028Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/0b927cb9-55e7-44fc-971b-21c36d9d73cd` → **200**

```json
{
  "id": "0b927cb9-55e7-44fc-971b-21c36d9d73cd",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:17:34.485028Z",
  "expires_at": "2026-10-30T13:47:34.485028Z",
  "completed_at": "2026-10-30T13:17:34.686364Z",
  "masked_pan": "41****7356",
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
      "id": "7164ffd1-7fa4-4120-83cb-7fa20f6b4c13",
      "at": "2026-10-30T13:17:35.635407Z",
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
  "command_id": "b9c94a36-5fb3-47ce-8b41-1bebbe65db0a",
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
  "correlation_id": "57b79b95-50c4-4ee3-87b1-f7091cd2b597"
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
  "device_ref": "sandbox-27763"
}
```

```json
{
  "challenge_id": "0b7adba5-32d8-4bf9-ba81-1e189b885e67",
  "expires_at": "2026-10-30T13:22:36.546466661Z",
  "resend_available_at": "2026-10-30T13:17:37.546466661Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "717137",
  "sent_at": "2026-10-30T13:17:36.548688458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b7adba5-32d8-4bf9-ba81-1e189b885e67",
  "code": "717137",
  "device_ref": "sandbox-27763"
}
```

```json
{
  "session_id": "2b5c1dc7-afef-4957-908b-39d9c8f7f9a0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzE1NiwiaWF0IjoxNzkzMzY2MjU2LCJqdGkiOiIzOGY2NDZkNS1hZWQ0LTRlMjQtOGRiMy0yMzZmMzM4ZmMyN2QiLCJzaWQiOiIyYjVjMWRjNy1hZmVmLTQ5NTctOTA4Yi0zOWQ5YzhmN2Y5YTAifQ.jODWrg6y_UVtf2LAMFuSeHITSH47xVRd3KVHim_UqT4",
  "access_expires_at": "2026-10-30T13:32:36.759104013Z",
  "refresh_token": "oUXSdJikezIWzPt36AtUUvmUwC__E9DuFsHHps1y6GE",
  "refresh_expires_at": "2026-11-29T13:17:36.758586811Z",
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
  "command_id": "8d942a0a-4763-4f0b-8bae-f641c9fd5f8f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:37Z",
    "sequence": 1793366257120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "734183a7-48a1-414e-8cf2-8fdf20f4c012",
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
  "last_heartbeat_at": "2026-10-30T13:17:37.136637Z",
  "last_location_at": "2026-10-30T13:17:37.136637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632261858",
  "device_ref": "sandbox-7487"
}
```

```json
{
  "challenge_id": "ab06eeee-4b71-4c18-a97c-7eb3e050cbb9",
  "expires_at": "2026-10-30T13:22:37.331529209Z",
  "resend_available_at": "2026-10-30T13:17:38.331529209Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632261858` → **200**

```json
{
  "phone": "+380632261858",
  "audience": "CLIENT",
  "code": "057624",
  "sent_at": "2026-10-30T13:17:37.33350297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab06eeee-4b71-4c18-a97c-7eb3e050cbb9",
  "code": "057624",
  "device_ref": "sandbox-7487"
}
```

```json
{
  "session_id": "9ee06320-83ac-4300-80a3-da2a340d1568",
  "subject": {
    "type": "CLIENT",
    "id": "a5e26c04-da55-4011-a0ab-5513193a4272"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNWUyNmMwNC1kYTU1LTQwMTEtYTBhYi01NTEzMTkzYTQyNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTU3LCJpYXQiOjE3OTMzNjYyNTcsImp0aSI6ImEzMjU1MTMwLTk5ZGUtNGFkMy1iNWUxLTJhZDZkMDhmOThiYSIsInNpZCI6IjllZTA2MzIwLTgzYWMtNDMwMC04MGEzLWRhMmEzNDBkMTU2OCJ9._kCMmmPeREWsyWHR-HFXJGMj6zWL4S9x9nfkt_sX6Ag",
  "access_expires_at": "2026-10-30T13:32:37.557040225Z",
  "refresh_token": "GJqk2lJvc3KRuvz6IfTsl1CJRfXdxEnt-T5eqKy0NHc",
  "refresh_expires_at": "2026-11-29T13:17:37.556573829Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2eedc460-deaf-4418-934d-dc46dc242cf7",
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
  "id": "878711b3-af4b-43c9-8de2-2b0ef211b6b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:37.757082Z",
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
  "command_id": "b763eaa0-81aa-4d65-b6eb-af155fce7cf0",
  "quote_id": "878711b3-af4b-43c9-8de2-2b0ef211b6b3",
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
  "id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5e26c04-da55-4011-a0ab-5513193a4272",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:17:37.968097Z",
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
    "id": "5313574a-8757-4b14-a268-cdfa7bc844d1",
    "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
    "expires_at": "2026-10-30T13:17:52.970667Z",
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

`POST /api/driver/v1/offers/5313574a-8757-4b14-a268-cdfa7bc844d1/accept` → **200**

```json
{
  "command_id": "12a726b9-f301-4dc3-9370-cd583d9cf589"
}
```

```json
{
  "id": "d3315a01-6530-4459-b3b4-efff7b88ce94",
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f169a0c-d1c4-4268-9c7b-6b49258d74d5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f169a0c-d1c4-4268-9c7b-6b49258d74d5",
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "assignment_id": "d3315a01-6530-4459-b3b4-efff7b88ce94",
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

`POST /api/driver/v1/work-sessions/734183a7-48a1-414e-8cf2-8fdf20f4c012/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:38Z",
    "sequence": 1793366258759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "734183a7-48a1-414e-8cf2-8fdf20f4c012",
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
  "last_heartbeat_at": "2026-10-30T13:17:38.776438Z",
  "last_location_at": "2026-10-30T13:17:38.776438Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8f169a0c-d1c4-4268-9c7b-6b49258d74d5/arrive` → **200**

```json
{
  "command_id": "000d0c21-12f7-462e-a02a-b87832d3a52d",
  "expected_version": 0
}
```

```json
{
  "id": "8f169a0c-d1c4-4268-9c7b-6b49258d74d5",
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "assignment_id": "d3315a01-6530-4459-b3b4-efff7b88ce94",
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
  "arrived_at": "2026-10-30T13:17:38.983458Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f169a0c-d1c4-4268-9c7b-6b49258d74d5/start` → **200**

```json
{
  "command_id": "343ce67f-351c-46b1-9cc7-cf0df173ce3c",
  "expected_version": 1
}
```

```json
{
  "id": "8f169a0c-d1c4-4268-9c7b-6b49258d74d5",
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "assignment_id": "d3315a01-6530-4459-b3b4-efff7b88ce94",
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
  "arrived_at": "2026-10-30T13:17:38.983458Z",
  "started_at": "2026-10-30T13:17:39.198293Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f169a0c-d1c4-4268-9c7b-6b49258d74d5/complete` → **200**

```json
{
  "command_id": "1f800d5a-5304-45f9-8f9a-49579ab93e54",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:17:39Z",
  "cash_received": false
}
```

```json
{
  "id": "8f169a0c-d1c4-4268-9c7b-6b49258d74d5",
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "assignment_id": "d3315a01-6530-4459-b3b4-efff7b88ce94",
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
  "arrived_at": "2026-10-30T13:17:38.983458Z",
  "started_at": "2026-10-30T13:17:39.198293Z",
  "completed_at": "2026-10-30T13:17:39.404728Z",
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
  "session_id": "d9effff9-33b8-48c7-b946-545a82360d74",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxNTksImlhdCI6MTc5MzM2NjI1OSwianRpIjoiZGU0YWFkMGYtZmM2MS00NTY4LWEzMWYtOTM2ZDQyOWJhMDZmIiwic2lkIjoiZDllZmZmZjktMzNiOC00OGM3LWI5NDYtNTQ1YTgyMzYwZDc0In0.rvvHqnhphuJcgAZCC1oUJrQJKaNmkNCGi9XgHSmVh0M",
  "access_expires_at": "2026-10-30T13:32:39.821635314Z",
  "refresh_token": "GgzQ5sMdFMJ98vRihdaCzva7n80yYjAxAvWn6REekOE",
  "refresh_expires_at": "2026-10-31T01:17:39.820113939Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/1a5e5e8f-509a-4c87-a05b-d8dc8af9852e/cash-dispute` → **200**

```json
{
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a5e26c04-da55-4011-a0ab-5513193a4272",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:17:39.682246Z",
  "decide_by": "2026-11-13T13:17:39.682246Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:17:39.682246Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "a5e26c04-da55-4011-a0ab-5513193a4272",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:17:39.682246Z",
      "decide_by": "2026-11-13T13:17:39.682246Z",
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

`POST /api/admin/v1/orders/1a5e5e8f-509a-4c87-a05b-d8dc8af9852e/cash-dispute/decide` → **400**

```json
{
  "command_id": "18fd7949-d673-465a-af6d-be09782b0776",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/1a5e5e8f-509a-4c87-a05b-d8dc8af9852e/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a1e6c3a7-f234-41b4-b6a7-fac6ee8a7559",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/1a5e5e8f-509a-4c87-a05b-d8dc8af9852e/cash-dispute/decide` → **200**

```json
{
  "command_id": "6003f574-4668-406c-995f-b435ebd84b5b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "a5e26c04-da55-4011-a0ab-5513193a4272",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:17:39.682246Z",
  "decide_by": "2026-11-13T13:17:39.682246Z",
  "decision": "PAY_DRIVER",
  "decided_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:17:40.677322Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/1a5e5e8f-509a-4c87-a05b-d8dc8af9852e/cash-dispute/decide` → **409**

```json
{
  "command_id": "dd33070a-fe8a-4734-927f-df5477c68680",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/1a5e5e8f-509a-4c87-a05b-d8dc8af9852e/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "285a00b0-d9ab-42ca-853a-8552cec8dad0"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "734183a7-48a1-414e-8cf2-8fdf20f4c012",
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
  "last_heartbeat_at": "2026-10-30T13:17:38.776438Z",
  "last_location_at": "2026-10-30T13:17:38.776438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/734183a7-48a1-414e-8cf2-8fdf20f4c012/close` → **200**

```json
{
  "command_id": "2f438aae-d3b4-4178-a4c0-760e65daf22e",
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
  "phone": "+380736728288",
  "device_ref": "sandbox-15157"
}
```

```json
{
  "challenge_id": "03d4612d-3f31-4107-9567-9f468f6ea773",
  "expires_at": "2026-10-30T13:22:41.522772613Z",
  "resend_available_at": "2026-10-30T13:17:42.522772613Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736728288` → **200**

```json
{
  "phone": "+380736728288",
  "audience": "CLIENT",
  "code": "219219",
  "sent_at": "2026-10-30T13:17:41.525015616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03d4612d-3f31-4107-9567-9f468f6ea773",
  "code": "219219",
  "device_ref": "sandbox-15157"
}
```

```json
{
  "session_id": "bfd83c59-15a0-47e5-aaa3-e2bb2effb862",
  "subject": {
    "type": "CLIENT",
    "id": "61b95dcf-943f-4386-8343-2e556d771642"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWI5NWRjZi05NDNmLTQzODYtODM0My0yZTU1NmQ3NzE2NDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTYxLCJpYXQiOjE3OTMzNjYyNjEsImp0aSI6IjNhZGI1OGUzLTg0YzctNDRkZi1hNTQzLWRiZjNlOWViNzZiYyIsInNpZCI6ImJmZDgzYzU5LTE1YTAtNDdlNS1hYWEzLWUyYmIyZWZmYjg2MiJ9.cGr24-rinjJjewVULDfZp9-CMdf3iDRYc_BibPpA0w4",
  "access_expires_at": "2026-10-30T13:32:41.758178719Z",
  "refresh_token": "uTWMa848s4d_u386JxmLq30jfFa1IJrXdeAnvFMwLyU",
  "refresh_expires_at": "2026-11-29T13:17:41.757790311Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "21ef7867-23ea-43de-b58d-41159ebd5894",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8cffdefb-9678-4d06-a4a9-3a4bf08e8037",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8cffdefb-9678-4d06-a4a9-3a4bf08e8037",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1bd39086f1993d581f10075748eba564",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8cffdefb-9678-4d06-a4a9-3a4bf08e8037",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736728288"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8cffdefb-9678-4d06-a4a9-3a4bf08e8037",
  "expires_at": "2026-10-30T13:47:41.957367Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8cffdefb-9678-4d06-a4a9-3a4bf08e8037` → **200**

```json
{
  "id": "8cffdefb-9678-4d06-a4a9-3a4bf08e8037",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:47:41.957367Z",
  "card": {
    "id": "235ef047-4f42-4b1e-9dbf-423053ba7cc5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5985",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:17:42.161938Z"
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
  "device_ref": "sandbox-23630"
}
```

```json
{
  "challenge_id": "34460558-472f-477f-8b31-2a8a3991b285",
  "expires_at": "2026-10-30T13:22:42.376796167Z",
  "resend_available_at": "2026-10-30T13:17:43.376796167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "295593",
  "sent_at": "2026-10-30T13:17:42.378990253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34460558-472f-477f-8b31-2a8a3991b285",
  "code": "295593",
  "device_ref": "sandbox-23630"
}
```

```json
{
  "session_id": "243dc22a-456e-4f7e-96b4-254c7eae0549",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzE2MiwiaWF0IjoxNzkzMzY2MjYyLCJqdGkiOiJhMzU4NjYzMS04YTU2LTQ3MjYtYjZmYi1hM2E5YWY0MTM3ZDQiLCJzaWQiOiIyNDNkYzIyYS00NTZlLTRmN2UtOTZiNC0yNTRjN2VhZTA1NDkifQ.UUbKnTI4AJUe4Bh_PI15-6bK3Mt2DE1510Ttl7ASeGY",
  "access_expires_at": "2026-10-30T13:32:42.598451363Z",
  "refresh_token": "srYyXXMHkXKv5gkEsMrsBisUwJuOHhMx7tCT0ZpBLAs",
  "refresh_expires_at": "2026-11-29T13:17:42.598034567Z",
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
  "command_id": "edf7df11-1ede-4493-852c-e420468d2403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:42Z",
    "sequence": 1793366262995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "492996c4-15fa-4f0f-b469-08b5cb573d8e",
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
  "last_heartbeat_at": "2026-10-30T13:17:43.01224Z",
  "last_location_at": "2026-10-30T13:17:43.01224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "583a3c0a-b5a6-4238-946c-2a520596dade",
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
  "id": "1e13ca21-f12d-45db-bafe-c098b0891463",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:43.222345Z",
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
  "command_id": "7dbd5292-5686-4d16-b299-2c25c08267d5",
  "quote_id": "1e13ca21-f12d-45db-bafe-c098b0891463",
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
  "id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "61b95dcf-943f-4386-8343-2e556d771642",
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
  "created_at": "2026-10-30T13:17:43.435737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774` → **200**

```json
{
  "id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "61b95dcf-943f-4386-8343-2e556d771642",
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
  "created_at": "2026-10-30T13:17:43.435737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774` → **200**

```json
{
  "id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "61b95dcf-943f-4386-8343-2e556d771642",
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
  "created_at": "2026-10-30T13:17:43.435737Z",
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
    "id": "c33d0214-8a7c-470d-aa0e-1a86c5e74b2e",
    "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
    "expires_at": "2026-10-30T13:17:58.714567Z",
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

`POST /api/driver/v1/offers/c33d0214-8a7c-470d-aa0e-1a86c5e74b2e/accept` → **200**

```json
{
  "command_id": "1878bf7e-c2b3-43d5-948f-5c93bbc82389"
}
```

```json
{
  "id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85f65e10-0379-42e6-868c-4c8124d1715c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85f65e10-0379-42e6-868c-4c8124d1715c",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "assignment_id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
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

`POST /api/rider/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/messages` → **201**

```json
{
  "command_id": "8cf5be17-c8ef-488f-b205-9e4560742c10",
  "body": "Я біля входу, мій номер +380736728288, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "02b1b48e-3900-4a23-b467-e53b2caf91fc",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380736728288, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:17:45.678520687Z"
}
```

`POST /api/driver/v1/trips/85f65e10-0379-42e6-868c-4c8124d1715c/messages` → **201**

```json
{
  "command_id": "9af8a1b8-f353-4dcc-8e06-6f9c2fae52ca",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "36f43974-b5c4-4640-90c6-04232a887140",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:17:45.885767209Z"
}
```

`POST /api/driver/v1/work-sessions/492996c4-15fa-4f0f-b469-08b5cb573d8e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:46Z",
    "sequence": 1793366266821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "492996c4-15fa-4f0f-b469-08b5cb573d8e",
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
  "last_heartbeat_at": "2026-10-30T13:17:46.098693Z",
  "last_location_at": "2026-10-30T13:17:46.098693Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/85f65e10-0379-42e6-868c-4c8124d1715c/arrive` → **200**

```json
{
  "command_id": "2e829bd4-c643-4995-ac45-64055350495a",
  "expected_version": 0
}
```

```json
{
  "id": "85f65e10-0379-42e6-868c-4c8124d1715c",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "assignment_id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
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
  "arrived_at": "2026-10-30T13:17:46.30727Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/85f65e10-0379-42e6-868c-4c8124d1715c/start` → **200**

```json
{
  "command_id": "59ac4a69-07cc-4701-a7b2-e7dbbd129fbd",
  "expected_version": 1
}
```

```json
{
  "id": "85f65e10-0379-42e6-868c-4c8124d1715c",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "assignment_id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
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
  "arrived_at": "2026-10-30T13:17:46.30727Z",
  "started_at": "2026-10-30T13:17:46.505738Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/492996c4-15fa-4f0f-b469-08b5cb573d8e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:17:46Z",
    "sequence": 1793366266822
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "492996c4-15fa-4f0f-b469-08b5cb573d8e",
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
  "last_heartbeat_at": "2026-10-30T13:17:46.707105Z",
  "last_location_at": "2026-10-30T13:17:46.707105Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/85f65e10-0379-42e6-868c-4c8124d1715c/complete` → **200**

```json
{
  "command_id": "8ec06968-7e2f-47a4-9f34-9229093ffd3d",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:17:46Z",
  "cash_received": false
}
```

```json
{
  "id": "85f65e10-0379-42e6-868c-4c8124d1715c",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "assignment_id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
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
  "arrived_at": "2026-10-30T13:17:46.30727Z",
  "started_at": "2026-10-30T13:17:46.505738Z",
  "completed_at": "2026-10-30T13:17:46.922121Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774` → **200**

```json
{
  "id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "61b95dcf-943f-4386-8343-2e556d771642",
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
    "id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
    "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "85f65e10-0379-42e6-868c-4c8124d1715c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:43.435737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774` → **200**

```json
{
  "id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "61b95dcf-943f-4386-8343-2e556d771642",
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
    "id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
    "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "85f65e10-0379-42e6-868c-4c8124d1715c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:43.435737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774` → **200**

```json
{
  "id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "61b95dcf-943f-4386-8343-2e556d771642",
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
    "id": "47734ed5-f457-4dab-b54e-3eaeaa4f8842",
    "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "85f65e10-0379-42e6-868c-4c8124d1715c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:17:43.435737Z",
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
  "session_id": "492996c4-15fa-4f0f-b469-08b5cb573d8e",
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
  "last_heartbeat_at": "2026-10-30T13:17:46.707105Z",
  "last_location_at": "2026-10-30T13:17:46.707105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/492996c4-15fa-4f0f-b469-08b5cb573d8e/close` → **200**

```json
{
  "command_id": "effcd9db-3f5b-477b-b961-7faaccecf71d",
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
  "session_id": "0a605140-4151-4cbc-bf1e-34ee6e750016",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxNzAsImlhdCI6MTc5MzM2NjI3MCwianRpIjoiZmYzOWUwOTAtM2M5NS00ZDJhLWEyOWMtNWIyNmRmNTI4N2E1Iiwic2lkIjoiMGE2MDUxNDAtNDE1MS00Y2JjLWJmMWUtMzRlZTZlNzUwMDE2In0.ZPyaaDn2zGQNA7gZCkKOsiJuFZXKJBfOVhJtLdCvNO0",
  "access_expires_at": "2026-10-30T13:32:50.377904111Z",
  "refresh_token": "2CEW5h763ug7k91TRccJOXyedtK8JIAJjdQz8RqCJjA",
  "refresh_expires_at": "2026-10-31T01:17:50.377576789Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "afc41946-f4e9-4537-b41b-57ea887e72e4"
}
```

`GET /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T13:17:50.771145165Z",
  "order": {
    "id": "73d290e6-d5a2-4268-824d-b59407f29774",
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
    "created_at": "2026-10-30T13:17:43.435737Z",
    "assigned_at": "2026-10-30T13:17:45.271526Z",
    "arrived_at": "2026-10-30T13:17:46.30727Z",
    "started_at": "2026-10-30T13:17:46.505738Z",
    "completed_at": "2026-10-30T13:17:46.922121Z"
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
    "id": "61b95dcf-943f-4386-8343-2e556d771642",
    "registered_at": "2026-10-30T13:17:41.756199Z",
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
      "created_at": "2026-10-30T13:17:43.43752Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T13:17:47.763211Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks` → **422**

```json
{
  "command_id": "e276cd4d-96e3-475b-9f98-56fd5d017f3f",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "d29aafc5-b04d-40b5-99bd-b6530cce1fb7"
}
```

`POST /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks` → **201**

```json
{
  "command_id": "8b272cee-6d92-494c-80f7-05f9ce4dac73",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "4a57018e-3985-4948-a6a2-d7d92b5d5d50",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:17:51.231611Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks` → **201**

```json
{
  "command_id": "8b272cee-6d92-494c-80f7-05f9ce4dac73",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "4a57018e-3985-4948-a6a2-d7d92b5d5d50",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:17:51.231611Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/61b95dcf-943f-4386-8343-2e556d771642` → **200**

```json
{
  "client": {
    "id": "61b95dcf-943f-4386-8343-2e556d771642",
    "phone": "+380736728288",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:17:41.756199Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "73d290e6-d5a2-4268-824d-b59407f29774",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:17:43.435737Z",
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

`GET /api/admin/v1/clients/61b95dcf-943f-4386-8343-2e556d771642` → **200**

```json
{
  "client": {
    "id": "61b95dcf-943f-4386-8343-2e556d771642",
    "phone": "+380736728288",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:17:41.756199Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "73d290e6-d5a2-4268-824d-b59407f29774",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:17:43.435737Z",
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

`POST /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks/4a57018e-3985-4948-a6a2-d7d92b5d5d50/resolve` → **200**

```json
{
  "command_id": "e3bb1750-815d-4098-8922-1299d8061dd7",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "4a57018e-3985-4948-a6a2-d7d92b5d5d50",
  "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T13:17:51.231611Z",
  "resolved_at": "2026-10-30T13:17:53.09875Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/61b95dcf-943f-4386-8343-2e556d771642` → **200**

```json
{
  "client": {
    "id": "61b95dcf-943f-4386-8343-2e556d771642",
    "phone": "+380736728288",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:17:41.756199Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "73d290e6-d5a2-4268-824d-b59407f29774",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:17:43.435737Z",
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

`GET /api/admin/v1/clients/61b95dcf-943f-4386-8343-2e556d771642` → **200**

```json
{
  "client": {
    "id": "61b95dcf-943f-4386-8343-2e556d771642",
    "phone": "+380736728288",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:17:41.756199Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "73d290e6-d5a2-4268-824d-b59407f29774",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:17:43.435737Z",
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

`POST /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks/4a57018e-3985-4948-a6a2-d7d92b5d5d50/resolve` → **409**

```json
{
  "command_id": "e5366883-23e6-4d11-a136-79cdb31ba133",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks/4a57018e-3985-4948-a6a2-d7d92b5d5d50/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "50d00296-3b19-405e-adac-3e3a8fe9850c"
}
```

`GET /api/admin/v1/orders/73d290e6-d5a2-4268-824d-b59407f29774/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "4a57018e-3985-4948-a6a2-d7d92b5d5d50",
      "order_id": "73d290e6-d5a2-4268-824d-b59407f29774",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T13:17:51.231611Z",
      "resolved_at": "2026-10-30T13:17:53.09875Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 73d290e6-d5a2-4268-824d-b59407f29774 without phone or card digits; chargeback 4a57018e-3985-4948-a6a2-d7d92b5d5d50 recorded and won.

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
  "session_id": "8b3cc210-1966-4ef7-b355-7004adb9f403",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxNzUsImlhdCI6MTc5MzM2NjI3NSwianRpIjoiMzNmNWVjNmQtZmQ2ZS00NTgzLTliZjAtYjIzZjk3YjNiMDhmIiwic2lkIjoiOGIzY2MyMTAtMTk2Ni00ZWY3LWIzNTUtNzAwNGFkYjlmNDAzIn0.xKyxnaGtGYhOBjqVGa8yNjSZDEWcj2rMKHFjL_U8aBU",
  "access_expires_at": "2026-10-30T13:32:55.512062353Z",
  "refresh_token": "l8qelZR_jPjYi6g6-2Lees_m_g3hwMXImVFJkcRc_bw",
  "refresh_expires_at": "2026-10-31T01:17:55.51170096Z",
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
  "phone": "+48600580091",
  "device_ref": "sandbox-1374"
}
```

```json
{
  "challenge_id": "c6622734-ac96-42a4-8eb8-ed238d1e8115",
  "expires_at": "2026-10-30T13:22:56.103037076Z",
  "resend_available_at": "2026-10-30T13:17:57.103037076Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600580091` → **200**

```json
{
  "phone": "+48600580091",
  "audience": "CLIENT",
  "code": "071983",
  "sent_at": "2026-10-30T13:17:56.105888034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6622734-ac96-42a4-8eb8-ed238d1e8115",
  "code": "071983",
  "device_ref": "sandbox-1374"
}
```

```json
{
  "session_id": "fefc3483-75bb-4e93-831a-50b46c5be845",
  "subject": {
    "type": "CLIENT",
    "id": "6b079784-a374-4ff6-972a-b384aea91a08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjA3OTc4NC1hMzc0LTRmZjYtOTcyYS1iMzg0YWVhOTFhMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTc2LCJpYXQiOjE3OTMzNjYyNzYsImp0aSI6IjNiMjJmNDJiLTE4ZmUtNGY4MS04ZmYxLWVjMTdhY2ZjNTliNiIsInNpZCI6ImZlZmMzNDgzLTc1YmItNGU5My04MzFhLTUwYjQ2YzViZTg0NSJ9.dv1W3K-jG1aCsnaokQu6HhAyq5k3lrHLIwqmmkncyt8",
  "access_expires_at": "2026-10-30T13:32:56.323254546Z",
  "refresh_token": "z4yNqT7n2J6ogXQ65WkwUkiFK1R6BHtUWl-yc6sobqM",
  "refresh_expires_at": "2026-11-29T13:17:56.322883089Z",
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
  "command_id": "cdbcda67-75d8-420c-ac1b-3a5992750fd0",
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
  "correlation_id": "31008088-9659-4488-af17-67048ae23e94",
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
  "command_id": "9da057f8-5d70-4dea-97e1-ab6b2d4ede0f",
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
  "paused_at": "2026-10-30T13:17:57.101357214Z",
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
  "command_id": "92251fd2-bb49-4e1a-8d1e-fbda6bf4f357",
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
  "id": "404904f5-79e9-4994-8fe3-bb1824b7d3ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:57.516527Z",
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
  "command_id": "d43f1447-5f7a-4303-b499-31f9f414707c",
  "quote_id": "404904f5-79e9-4994-8fe3-bb1824b7d3ad",
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
  "correlation_id": "5a037cfa-7fec-4983-ae3d-ef44206f2440"
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
  "paused_at": "2026-10-30T13:17:57.101357Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "3a5561e4-73a5-4837-92e0-d0b97a514644",
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
  "command_id": "fdecb125-23f0-4038-aa9a-4e15004a790f",
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
  "command_id": "9c187a19-a660-4dcc-a041-b1d27d8d86ad",
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
  "id": "d4292731-765c-4e94-bda4-47211d1d521e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:58.729911Z",
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
  "command_id": "6f3e257b-407d-459c-80a8-879ffa3eddd0",
  "quote_id": "d4292731-765c-4e94-bda4-47211d1d521e",
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
  "correlation_id": "1edc1239-b065-432f-a644-deed1f802758"
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
  "command_id": "2fcd4804-0ef5-4d38-a3c8-11292b912d9a",
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
      "from": "16:00",
      "to": "17:00"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "2c974ad0-ba3f-43f1-bab7-e6854c0446f7",
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
  "id": "dbba4ac1-07af-41f8-bb00-8206cf84302c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:22:59.531659Z",
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
  "command_id": "f7e0cfe6-5d5b-4f89-8b03-d9b7c8c47a45",
  "quote_id": "dbba4ac1-07af-41f8-bb00-8206cf84302c",
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
  "correlation_id": "04fb924a-0245-4fb8-9b39-df3783d485c6"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "002b14d7-0264-4ab5-9a0e-3d94c8fc41bd",
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
  "correlation_id": "1de603a3-0ab5-4f6a-b94f-302c9c5aee9f"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "9d4d8096-4231-474c-87a4-43160e01c06e",
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
  "phone": "+380679557849",
  "device_ref": "sandbox-12015"
}
```

```json
{
  "challenge_id": "f614ccce-c95b-4094-8ac0-5c1b3a4c495c",
  "expires_at": "2026-10-30T13:23:00.561556577Z",
  "resend_available_at": "2026-10-30T13:18:01.561556577Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679557849` → **200**

```json
{
  "phone": "+380679557849",
  "audience": "CLIENT",
  "code": "789274",
  "sent_at": "2026-10-30T13:18:00.563725295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f614ccce-c95b-4094-8ac0-5c1b3a4c495c",
  "code": "789274",
  "device_ref": "sandbox-12015"
}
```

```json
{
  "session_id": "aaec7c43-04d4-4f54-aacb-77b9d115d9cd",
  "subject": {
    "type": "CLIENT",
    "id": "656d66ac-aaef-4b2b-a9ac-5f7d5e736589"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTZkNjZhYy1hYWVmLTRiMmItYTlhYy01ZjdkNWU3MzY1ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTgwLCJpYXQiOjE3OTMzNjYyODAsImp0aSI6IjFkMjZkZTU3LTQ0ZjktNDNlOC1hNjNkLTViODA5MjllYmJlYyIsInNpZCI6ImFhZWM3YzQzLTA0ZDQtNGY1NC1hYWNiLTc3YjlkMTE1ZDljZCJ9.Aqw2PuBQkCY3e5ooZ0YfnyvFpzxlrQUR0doIJbUbjX0",
  "access_expires_at": "2026-10-30T13:33:00.779162836Z",
  "refresh_token": "jjbTROrFWSJ2NMyegoyOJDeVob8OJI6TY_H1pUBvqYs",
  "refresh_expires_at": "2026-11-29T13:18:00.778734522Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "656d66ac-aaef-4b2b-a9ac-5f7d5e736589",
  "session_id": "aaec7c43-04d4-4f54-aacb-77b9d115d9cd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "336f4f37-c166-4c88-8a38-f27e52e9a90c",
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
  "id": "5e112f83-088f-4218-a479-a11ce7ba4eea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:01.168461Z",
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
  "challenge_id": "a1a3284d-9701-49e9-aa3e-8aa300387629",
  "expires_at": "2026-10-30T13:23:03.365798303Z",
  "resend_available_at": "2026-10-30T13:18:04.365798303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679557849` → **200**

```json
{
  "phone": "+380679557849",
  "audience": "CLIENT",
  "code": "802112",
  "sent_at": "2026-10-30T13:18:03.367418809Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "01977078-f106-4e00-87cc-955e3f3db4ab",
  "challenge_id": "a1a3284d-9701-49e9-aa3e-8aa300387629",
  "otp_code": "802112"
}
```

```json
{
  "client_id": "656d66ac-aaef-4b2b-a9ac-5f7d5e736589",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:18:03.587333904Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a9a412c0-3607-4ff4-bff3-8a7daecf4b8c",
  "quote_id": "5e112f83-088f-4218-a479-a11ce7ba4eea",
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
  "correlation_id": "7b15b4f8-8ae1-4d6a-8057-78afc9fed8bf"
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
  "session_id": "3d43ee22-a46a-432e-b2d8-19f21d67d588",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxODQsImlhdCI6MTc5MzM2NjI4NCwianRpIjoiY2JiMTk4ZDAtM2RmMy00NzM5LThhYTItODk1MzE1MGM4M2Y2Iiwic2lkIjoiM2Q0M2VlMjItYTQ2YS00MzJlLWIyZDgtMTlmMjFkNjdkNTg4In0.ukavMDQnWbQO2ghJ71SREdKVEo_9ooUSGzVD_am9wx8",
  "access_expires_at": "2026-10-30T13:33:04.199530167Z",
  "refresh_token": "4bnmLBgjYyMsK2JKLK81U6990Wqt2vHDpneBqYQajL4",
  "refresh_expires_at": "2026-10-31T01:18:04.199158017Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "656d66ac-aaef-4b2b-a9ac-5f7d5e736589",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:18:03.587334Z",
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

`POST /api/admin/v1/client-deletions/656d66ac-aaef-4b2b-a9ac-5f7d5e736589/complete` → **200**

```json
{
  "command_id": "879399ca-f093-471f-826a-9d11efd4ace3",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "656d66ac-aaef-4b2b-a9ac-5f7d5e736589",
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
  "correlation_id": "bdabdd30-300d-4bcf-9d0c-18f1ae407dd7"
}
```

Done: client 656d66ac-aaef-4b2b-a9ac-5f7d5e736589 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660636059",
  "device_ref": "sandbox-16531"
}
```

```json
{
  "challenge_id": "88601e75-888e-49fe-94a5-7cf9bc2f0b27",
  "expires_at": "2026-10-30T13:23:04.993163154Z",
  "resend_available_at": "2026-10-30T13:18:05.993163154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660636059` → **200**

```json
{
  "phone": "+380660636059",
  "audience": "CLIENT",
  "code": "173472",
  "sent_at": "2026-10-30T13:18:04.995364522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88601e75-888e-49fe-94a5-7cf9bc2f0b27",
  "code": "173472",
  "device_ref": "sandbox-16531"
}
```

```json
{
  "session_id": "c33db70a-18cb-440e-8824-f6904f28c1b3",
  "subject": {
    "type": "CLIENT",
    "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDdkYWFiYS1kOTQ2LTRjYTAtYWEzNS0xYmZlYmEwNDkxZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTg1LCJpYXQiOjE3OTMzNjYyODUsImp0aSI6IjNkN2JkNjVhLTEzOWYtNGZiNi1hZjVjLTBhOGRjMjY3MGU2ZSIsInNpZCI6ImMzM2RiNzBhLTE4Y2ItNDQwZS04ODI0LWY2OTA0ZjI4YzFiMyJ9.1GwZyalBuLPludGlxSny-oB8gmtRD9uzBEvn7G-M7iM",
  "access_expires_at": "2026-10-30T13:33:05.212451988Z",
  "refresh_token": "aOjyF7dwOBNaP3ELK953X79DidM28RD3LQ-2uVogn-U",
  "refresh_expires_at": "2026-11-29T13:18:05.212133038Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
  "session_id": "c33db70a-18cb-440e-8824-f6904f28c1b3",
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
  "session_id": "22b1404f-d70f-48ed-9303-52b38cd4c15d",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxODUsImlhdCI6MTc5MzM2NjI4NSwianRpIjoiMDNiMjkwMDktMWNmZC00MmQ0LWFlZTUtYzg4ZGMxMTU2M2VlIiwic2lkIjoiMjJiMTQwNGYtZDcwZi00OGVkLTkzMDMtNTJiMzhjZDRjMTVkIn0.n2dpDtgyvKZVmZa1qLw8qF9w5NDkiZoXnz-F0VW7A3E",
  "access_expires_at": "2026-10-30T13:33:05.779908569Z",
  "refresh_token": "kCHkPEhQIxF2Of-MmYV1s0ylP70BW-hnXCCEsLQMLe8",
  "refresh_expires_at": "2026-10-31T01:18:05.779518914Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0636059&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
      "phone": "+380660636059",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:18:05.210748Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/907daaba-d946-4ca0-aa35-1bfeba0491e8` → **200**

```json
{
  "client": {
    "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
    "phone": "+380660636059",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:18:05.210748Z",
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

`POST /api/admin/v1/clients/907daaba-d946-4ca0-aa35-1bfeba0491e8/block` → **400**

```json
{
  "command_id": "8eda6cc7-5d72-4a52-90fe-cec0197674ff",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/907daaba-d946-4ca0-aa35-1bfeba0491e8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d66d105f-415c-4000-91ad-1a8d754fe223",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/907daaba-d946-4ca0-aa35-1bfeba0491e8/block` → **200**

```json
{
  "command_id": "ce852d4d-b9ca-47db-969a-43a7162bd6d1",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
  "phone": "+380660636059",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:18:05.210748Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:18:06.605251Z",
    "by": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
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
  "correlation_id": "d2ec3637-7119-40c6-bb3d-6ffb050acd2b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660636059",
  "device_ref": "sandbox-17948"
}
```

```json
{
  "challenge_id": "ba3df653-1280-4944-9b92-de0493d92977",
  "expires_at": "2026-10-30T13:23:08.995514474Z",
  "resend_available_at": "2026-10-30T13:18:09.995514474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660636059` → **200**

```json
{
  "phone": "+380660636059",
  "audience": "CLIENT",
  "code": "497328",
  "sent_at": "2026-10-30T13:18:08.997988732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "ba3df653-1280-4944-9b92-de0493d92977",
  "code": "497328",
  "device_ref": "sandbox-17948"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "c871e288-63c5-4daa-a4fc-d95da1ee7f42"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/907daaba-d946-4ca0-aa35-1bfeba0491e8` → **200**

```json
{
  "client": {
    "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
    "phone": "+380660636059",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:18:05.210748Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:18:06.605251Z",
      "by": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
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

`POST /api/admin/v1/clients/907daaba-d946-4ca0-aa35-1bfeba0491e8/unblock` → **200**

```json
{
  "command_id": "01f23536-a06d-4d5d-97f3-f4a2223d7be3",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
  "phone": "+380660636059",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:18:05.210748Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660636059",
  "device_ref": "sandbox-24396"
}
```

```json
{
  "challenge_id": "8ecf20e0-8dca-4467-bb0b-9ebf9ce3c793",
  "expires_at": "2026-10-30T13:23:11.822775589Z",
  "resend_available_at": "2026-10-30T13:18:12.822775589Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660636059` → **200**

```json
{
  "phone": "+380660636059",
  "audience": "CLIENT",
  "code": "527868",
  "sent_at": "2026-10-30T13:18:11.825177438Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ecf20e0-8dca-4467-bb0b-9ebf9ce3c793",
  "code": "527868",
  "device_ref": "sandbox-24396"
}
```

```json
{
  "session_id": "181fb0cf-a44f-4a21-a003-c224816489bd",
  "subject": {
    "type": "CLIENT",
    "id": "907daaba-d946-4ca0-aa35-1bfeba0491e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDdkYWFiYS1kOTQ2LTRjYTAtYWEzNS0xYmZlYmEwNDkxZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTkyLCJpYXQiOjE3OTMzNjYyOTIsImp0aSI6IjZmYjgxY2FhLTQ5MGUtNGRjNy05NmU2LWU1NjU3YzQ2ZDU4OCIsInNpZCI6IjE4MWZiMGNmLWE0NGYtNGEyMS1hMDAzLWMyMjQ4MTY0ODliZCJ9.H04a59HW057GMYa0s2tR24nHfIGlmOApApxcNuSQXIc",
  "access_expires_at": "2026-10-30T13:33:12.039121991Z",
  "refresh_token": "mAjwTmIw46mHAkb7eJCwS0G3-0ftmGo9Vxy7vT7B-xc",
  "refresh_expires_at": "2026-11-29T13:18:12.038759717Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "907daaba-d946-4ca0-aa35-1bfeba0491e8",
  "session_id": "181fb0cf-a44f-4a21-a003-c224816489bd",
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
  "phone": "+380663310694",
  "device_ref": "sandbox-26617"
}
```

```json
{
  "challenge_id": "7e5099d7-d5e8-4e2c-bce5-7f6c25695f11",
  "expires_at": "2026-10-30T13:23:12.4212369Z",
  "resend_available_at": "2026-10-30T13:18:13.4212369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663310694` → **200**

```json
{
  "phone": "+380663310694",
  "audience": "CLIENT",
  "code": "185639",
  "sent_at": "2026-10-30T13:18:12.423415092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e5099d7-d5e8-4e2c-bce5-7f6c25695f11",
  "code": "185639",
  "device_ref": "sandbox-26617"
}
```

```json
{
  "session_id": "569362b1-9a31-4c96-9ecb-000ae2da0d8b",
  "subject": {
    "type": "CLIENT",
    "id": "fca647bf-4ae2-4d52-a3f9-af73923c19dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2E2NDdiZi00YWUyLTRkNTItYTNmOS1hZjczOTIzYzE5ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTkyLCJpYXQiOjE3OTMzNjYyOTIsImp0aSI6ImM4YWFiNmJmLTZhMmQtNGNiNS1hYzRhLTMzZjE2MWI3OTQwOCIsInNpZCI6IjU2OTM2MmIxLTlhMzEtNGM5Ni05ZWNiLTAwMGFlMmRhMGQ4YiJ9.rXEkScj9T4T73wNLI7sTNVfEf6HHeN13kqYPcF3TuQs",
  "access_expires_at": "2026-10-30T13:33:12.643883387Z",
  "refresh_token": "GVv447QD-3eAIhY4GZuviBR2YgcxbMLsZvfz0n39t90",
  "refresh_expires_at": "2026-11-29T13:18:12.643443516Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19224683-9a58-4598-b7f0-5bb43a5ab88d",
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
  "id": "31406e6d-91e3-4502-a751-07060e2c7b56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:12.835646Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: bd93257a-0d5c-4b6b-9c81-5cadfe8182ef) → **201**

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
  "session_id": "bbd10040-ee69-4072-b935-43a942c93cdc",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxOTMsImlhdCI6MTc5MzM2NjI5MywianRpIjoiYzgyN2FiN2QtZjk4NS00N2Q4LTkyYzYtZmYwMDZmMjllYjZjIiwic2lkIjoiYmJkMTAwNDAtZWU2OS00MDcyLWI5MzUtNDNhOTQyYzkzY2RjIn0.Xm4-z4bD404Mp4TMnN5rfwPuJfYUp58SNE-S2xB3iZE",
  "access_expires_at": "2026-10-30T13:33:13.272994475Z",
  "refresh_token": "9PmMnZ6tBeSuEtN0GWZJWB1_Jh8hmaEjNrlzNuWELfY",
  "refresh_expires_at": "2026-10-31T01:18:13.272637298Z",
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
  "session_id": "41f8b51f-34cd-4876-b65a-2b090560ff4c",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxOTMsImlhdCI6MTc5MzM2NjI5MywianRpIjoiNGYzNjVjODEtYTNhZS00N2NlLTliMDgtOWM4YTliNzY4NzIyIiwic2lkIjoiNDFmOGI1MWYtMzRjZC00ODc2LWI2NWEtMmIwOTA1NjBmZjRjIn0.7ti0hHc1CClYaVc2urcZpqqAEWg8m0etpbbXcuArh2Y",
  "access_expires_at": "2026-10-30T13:33:13.658610371Z",
  "refresh_token": "BT95EDS7dqKc-kGW0xNNRJT6G0K402z5c2Ji8cP5CGE",
  "refresh_expires_at": "2026-10-31T01:18:13.658087869Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fb09a489-e41e-43f1-8817-14d3fac871fa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:18:13.044452Z",
      "actor": {
        "type": "CLIENT",
        "id": "fca647bf-4ae2-4d52-a3f9-af73923c19dd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
        "quote_id": "31406e6d-91e3-4502-a751-07060e2c7b56",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "bd93257a-0d5c-4b6b-9c81-5cadfe8182ef"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:18:13.045693Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
        "attempt_id": "7f62c0aa-2e39-42dc-93d3-6c7a275677b6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bd93257a-0d5c-4b6b-9c81-5cadfe8182ef"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:18:13.052216Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
        "attempt_id": "7f62c0aa-2e39-42dc-93d3-6c7a275677b6"
      },
      "correlation_id": "bd93257a-0d5c-4b6b-9c81-5cadfe8182ef"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "7f62c0aa-2e39-42dc-93d3-6c7a275677b6",
        "generation": 1,
        "started_at": "2026-10-30T13:18:13.044994Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:18:13.052216Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:18:13.046232Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/bd93257a-0d5c-4b6b-9c81-5cadfe8182ef` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "fb09a489-e41e-43f1-8817-14d3fac871fa:0",
      "order_id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
      "at": "2026-10-30T13:18:13.044452Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "fb09a489-e41e-43f1-8817-14d3fac871fa:1",
      "order_id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
      "at": "2026-10-30T13:18:13.045693Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "fb09a489-e41e-43f1-8817-14d3fac871fa:2",
      "order_id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
      "at": "2026-10-30T13:18:13.052216Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/5f700e76-b9ec-4940-ba30-615e29d5110a` → **200**

```json
{
  "found": []
}
```

Done: request bd93257a-0d5c-4b6b-9c81-5cadfe8182ef — order fb09a489-e41e-43f1-8817-14d3fac871fa found by its id.

`GET /api/rider/v1/orders/fb09a489-e41e-43f1-8817-14d3fac871fa` → **200**

```json
{
  "id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fca647bf-4ae2-4d52-a3f9-af73923c19dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:18:13.044075Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fb09a489-e41e-43f1-8817-14d3fac871fa/cancel` → **200**

```json
{
  "command_id": "ffd7b1fd-0f12-4d5d-92f9-545fc89a6a62",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fb09a489-e41e-43f1-8817-14d3fac871fa",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fca647bf-4ae2-4d52-a3f9-af73923c19dd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:18:13.044075Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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
  "phone": "+380639407472",
  "device_ref": "sandbox-8867"
}
```

```json
{
  "challenge_id": "e3b2f719-b253-4ceb-ad4f-56d43408c4e0",
  "expires_at": "2026-10-30T13:23:14.918612532Z",
  "resend_available_at": "2026-10-30T13:18:15.918612532Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639407472` → **200**

```json
{
  "phone": "+380639407472",
  "audience": "CLIENT",
  "code": "437265",
  "sent_at": "2026-10-30T13:18:14.921203619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3b2f719-b253-4ceb-ad4f-56d43408c4e0",
  "code": "437265",
  "device_ref": "sandbox-8867"
}
```

```json
{
  "session_id": "be1baaf4-3e28-4d93-8c2f-2d616b86ed9b",
  "subject": {
    "type": "CLIENT",
    "id": "e084d593-0313-41f3-be7e-66959ad1e187"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDg0ZDU5My0wMzEzLTQxZjMtYmU3ZS02Njk1OWFkMWUxODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTk1LCJpYXQiOjE3OTMzNjYyOTUsImp0aSI6ImNkMzM0ZjFkLTdiNjQtNGY0Zi04OTkxLWM0NWI0MjY2OWFhOSIsInNpZCI6ImJlMWJhYWY0LTNlMjgtNGQ5My04YzJmLTJkNjE2Yjg2ZWQ5YiJ9.WFhOHV8xgPvncAmyos3bLMYKgmRDgdrDMQaqudezW2o",
  "access_expires_at": "2026-10-30T13:33:15.133303402Z",
  "refresh_token": "6QKLwmVMVIS5Q6FvXrc55OaMvxT4q9Xdi-D3c21CkcI",
  "refresh_expires_at": "2026-11-29T13:18:15.132899365Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "60812fa5-6044-41c8-8e39-c9970ca56a54",
  "expires_at": "2026-10-30T13:23:17.318135293Z",
  "resend_available_at": "2026-10-30T13:18:18.318135293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639407472` → **200**

```json
{
  "phone": "+380639407472",
  "audience": "CLIENT",
  "code": "875019",
  "sent_at": "2026-10-30T13:18:17.319720545Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a5d2c22b-321a-495d-8f03-4352cb6a2401",
  "challenge_id": "60812fa5-6044-41c8-8e39-c9970ca56a54",
  "otp_code": "875019"
}
```

```json
{
  "id": "27c7551a-d5b0-4c71-a9db-0302b3c1420c",
  "state": "PENDING",
  "created_at": "2026-10-30T13:18:17.57281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/27c7551a-d5b0-4c71-a9db-0302b3c1420c` → **200**

```json
{
  "id": "27c7551a-d5b0-4c71-a9db-0302b3c1420c",
  "state": "PENDING",
  "created_at": "2026-10-30T13:18:17.57281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/27c7551a-d5b0-4c71-a9db-0302b3c1420c` → **200**

```json
{
  "id": "27c7551a-d5b0-4c71-a9db-0302b3c1420c",
  "state": "READY",
  "created_at": "2026-10-30T13:18:17.57281Z",
  "ready_at": "2026-10-30T13:18:17.811283Z",
  "expires_at": "2026-11-06T13:18:17.811283Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/27c7551a-d5b0-4c71-a9db-0302b3c1420c/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633087791",
  "device_ref": "sandbox-8047"
}
```

```json
{
  "challenge_id": "06cc4c52-1c38-4853-bde2-091c245b2e36",
  "expires_at": "2026-10-30T13:23:19.173358345Z",
  "resend_available_at": "2026-10-30T13:18:20.173358345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633087791` → **200**

```json
{
  "phone": "+380633087791",
  "audience": "CLIENT",
  "code": "766730",
  "sent_at": "2026-10-30T13:18:19.175540356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06cc4c52-1c38-4853-bde2-091c245b2e36",
  "code": "766730",
  "device_ref": "sandbox-8047"
}
```

```json
{
  "session_id": "016f6889-5f24-4021-9a60-9d01f42a404c",
  "subject": {
    "type": "CLIENT",
    "id": "c12069d3-499f-42cf-9f41-d90f427b6541"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMTIwNjlkMy00OTlmLTQyY2YtOWY0MS1kOTBmNDI3YjY1NDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MTk5LCJpYXQiOjE3OTMzNjYyOTksImp0aSI6IjViZDdkZGFiLTYwNmMtNDVkNC1iYTQyLTc0NDQyMmExYWQ0YSIsInNpZCI6IjAxNmY2ODg5LTVmMjQtNDAyMS05YTYwLTlkMDFmNDJhNDA0YyJ9.bXsfQN3mKiK2H6ROWCu4DDS_kOYPY8gHJ9qSFrv_JSc",
  "access_expires_at": "2026-10-30T13:33:19.389094402Z",
  "refresh_token": "zC5dsHEEDWcCPdi5pj05ReOiQejDake4gefld2Wyg7k",
  "refresh_expires_at": "2026-11-29T13:18:19.388768011Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/27c7551a-d5b0-4c71-a9db-0302b3c1420c/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/27c7551a-d5b0-4c71-a9db-0302b3c1420c/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6bab1110-921f-4bff-ae85-e77ce94145d9"
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
  "session_id": "355690a4-5b1f-4172-afb0-b974d8fea50a",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcxOTksImlhdCI6MTc5MzM2NjI5OSwianRpIjoiZjZiNmQ5ZWQtOTYyNC00YzI4LWFlNmItNTJlMDhjYWJhZDUxIiwic2lkIjoiMzU1NjkwYTQtNWIxZi00MTcyLWFmYjAtYjk3NGQ4ZmVhNTBhIn0.uSMX_Q7PC3rdK58ehs7DHRMriCNCxyX_mjSexlimShk",
  "access_expires_at": "2026-10-30T13:33:19.959963377Z",
  "refresh_token": "EwYENoETjjJXfdnOY2swrz8Km0pzT4SG4fZR14nrJHs",
  "refresh_expires_at": "2026-10-31T01:18:19.959627052Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e084d593-0313-41f3-be7e-66959ad1e187",
  "session_id": "be1baaf4-3e28-4d93-8c2f-2d616b86ed9b",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e084d593-0313-41f3-be7e-66959ad1e187/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "27c7551a-d5b0-4c71-a9db-0302b3c1420c",
      "state": "READY",
      "created_at": "2026-10-30T13:18:17.57281Z",
      "ready_at": "2026-10-30T13:18:17.811283Z",
      "expires_at": "2026-11-06T13:18:17.811283Z",
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
  "device_ref": "sandbox-13844"
}
```

```json
{
  "challenge_id": "3646d90f-3146-459d-81e4-39d41f1ffb0b",
  "expires_at": "2026-10-30T13:23:20.507218407Z",
  "resend_available_at": "2026-10-30T13:18:21.507218407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "054947",
  "sent_at": "2026-10-30T13:18:20.509161194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3646d90f-3146-459d-81e4-39d41f1ffb0b",
  "code": "054947",
  "device_ref": "sandbox-13844"
}
```

```json
{
  "session_id": "84fac2b9-3e90-40d6-869a-b4f1524569d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIwMCwiaWF0IjoxNzkzMzY2MzAwLCJqdGkiOiIwNTI4YjliOS1iYjZjLTQ1NWQtYmQ4Yi00MGU4NWM0MWViNjkiLCJzaWQiOiI4NGZhYzJiOS0zZTkwLTQwZDYtODY5YS1iNGYxNTI0NTY5ZDgifQ.QYOnr5yQdXFVyl3u-Hq0yQtxlsykCeNq0X6cVxDayRc",
  "access_expires_at": "2026-10-30T13:33:20.722126627Z",
  "refresh_token": "izckZhcp45SWgo8TknCr-MxpKyELVKGulP5c7fdKuuA",
  "refresh_expires_at": "2026-11-29T13:18:20.721740948Z",
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
  "device_ref": "sandbox-8488"
}
```

```json
{
  "challenge_id": "cccfdaf1-b6b8-49c6-892f-49bc3b656bbf",
  "expires_at": "2026-10-30T13:23:21.092521576Z",
  "resend_available_at": "2026-10-30T13:18:22.092521576Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "163811",
  "sent_at": "2026-10-30T13:18:21.094528179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cccfdaf1-b6b8-49c6-892f-49bc3b656bbf",
  "code": "163811",
  "device_ref": "sandbox-8488"
}
```

```json
{
  "session_id": "7e913fbe-6b28-40f6-9c8d-d9cc63bbd709",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIwMSwiaWF0IjoxNzkzMzY2MzAxLCJqdGkiOiIwZDA1MmNiNC00MzBmLTRhNjEtOWI3Ni0zNzQ0YWNmMjI3MDIiLCJzaWQiOiI3ZTkxM2ZiZS02YjI4LTQwZjYtOWM4ZC1kOWNjNjNiYmQ3MDkifQ.0AhKo4D9__iZmXJFzwbw-iKBWtPnDLO9NYJYlvhWhok",
  "access_expires_at": "2026-10-30T13:33:21.302544065Z",
  "refresh_token": "eJHaOEN3hj01xV8G8gTU_AWmr_Narr65yQVMKpJZF-Y",
  "refresh_expires_at": "2026-11-29T13:18:21.302155827Z",
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
  "command_id": "1051fa42-62a1-462c-a23c-1f1741aaec7d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:21Z",
    "sequence": 1793366301660
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "384c8e4b-f713-4792-9196-53ad1bba1f14",
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
  "last_heartbeat_at": "2026-10-30T13:18:21.675908Z",
  "last_location_at": "2026-10-30T13:18:21.675908Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12365"
}
```

```json
{
  "challenge_id": "e9090ec0-9e6e-4ecb-a0ae-40d3c611307d",
  "expires_at": "2026-10-30T13:23:21.85774201Z",
  "resend_available_at": "2026-10-30T13:18:22.85774201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "802657",
  "sent_at": "2026-10-30T13:18:21.860147542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9090ec0-9e6e-4ecb-a0ae-40d3c611307d",
  "code": "802657",
  "device_ref": "sandbox-12365"
}
```

```json
{
  "session_id": "f161349d-e0ee-4f7c-97cb-e82c678119fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIwMiwiaWF0IjoxNzkzMzY2MzAyLCJqdGkiOiI1NjQ5YWVjYS1iZTg3LTRjZjItODYyMC1hMDAwMDhlMjg3MjQiLCJzaWQiOiJmMTYxMzQ5ZC1lMGVlLTRmN2MtOTdjYi1lODJjNjc4MTE5ZmEifQ.9hz1d_u6QlUAd1rov_BCarxDIpeTl3pIk-1ZbARy5Vc",
  "access_expires_at": "2026-10-30T13:33:22.068138991Z",
  "refresh_token": "fDXtsvN7FhPsTDOyR_JwvdxV4F_lsnQo9UJFt9veCYM",
  "refresh_expires_at": "2026-11-29T13:18:22.067694269Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "959cb76c-dcf4-4632-b4f4-0bb585f15470",
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
  "last_heartbeat_at": "2026-10-30T13:17:10.861971Z",
  "last_location_at": "2026-10-30T13:17:10.861971Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/959cb76c-dcf4-4632-b4f4-0bb585f15470/handover` → **200**

```json
{
  "command_id": "38377f21-07ab-4aea-8ee7-69cf1de4aa37",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "959cb76c-dcf4-4632-b4f4-0bb585f15470",
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
  "last_heartbeat_at": "2026-10-30T13:17:10.861971Z",
  "last_location_at": "2026-10-30T13:17:10.861971Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/959cb76c-dcf4-4632-b4f4-0bb585f15470/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:22Z",
    "sequence": 1793366302640
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "959cb76c-dcf4-4632-b4f4-0bb585f15470",
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
  "last_heartbeat_at": "2026-10-30T13:18:22.656528Z",
  "last_location_at": "2026-10-30T13:18:22.656528Z",
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
  "session_id": "e6df04f4-8de2-46ac-a541-3b34f90db472",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMDMsImlhdCI6MTc5MzM2NjMwMywianRpIjoiZmY2ZGVhYTAtZGZmMi00MjlmLThmOWYtZDNmMzQwN2E4ZmRiIiwic2lkIjoiZTZkZjA0ZjQtOGRlMi00NmFjLWE1NDEtM2IzNGY5MGRiNDcyIn0.6BTHD6zM12l5bUHj5Nihe1vSF4L4TskG39v-EqAd6cw",
  "access_expires_at": "2026-10-30T13:33:23.044930587Z",
  "refresh_token": "d7MNlye-jKukJ8p3vgpLQVgXbk0WBQaFeCRtq_rnIig",
  "refresh_expires_at": "2026-10-31T01:18:23.044581112Z",
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
  "session_id": "74372cee-608c-41ee-8ca6-6630f35c82e3",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMDMsImlhdCI6MTc5MzM2NjMwMywianRpIjoiNmE1YmI0NzItYmYwMC00MDBmLTliMjQtOGZhZTg1N2U4NzRkIiwic2lkIjoiNzQzNzJjZWUtNjA4Yy00MWVlLThjYTYtNjYzMGYzNWM4MmUzIn0.vXa4xnXMHmq4u0pc76pPP5ZfGugbkLeBBwQswBcHK3k",
  "access_expires_at": "2026-10-30T13:33:23.457274098Z",
  "refresh_token": "Mkj37ZWMYveHC7O5rgn7RXL9GgjaO8poByInAcu7QRo",
  "refresh_expires_at": "2026-10-31T01:18:23.456919736Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681031234",
  "device_ref": "sandbox-12880"
}
```

```json
{
  "challenge_id": "68e4c9e9-9f1e-4e26-a58e-aba22bd61939",
  "expires_at": "2026-10-30T13:23:23.638753385Z",
  "resend_available_at": "2026-10-30T13:18:24.638753385Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681031234` → **200**

```json
{
  "phone": "+380681031234",
  "audience": "CLIENT",
  "code": "757410",
  "sent_at": "2026-10-30T13:18:23.640828995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68e4c9e9-9f1e-4e26-a58e-aba22bd61939",
  "code": "757410",
  "device_ref": "sandbox-12880"
}
```

```json
{
  "session_id": "b8eacf27-917c-4aa6-a95a-3b2688d6823e",
  "subject": {
    "type": "CLIENT",
    "id": "a46fd3fc-b5a3-49d7-830c-b59f19949ad5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZmZDNmYy1iNWEzLTQ5ZDctODMwYy1iNTlmMTk5NDlhZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjAzLCJpYXQiOjE3OTMzNjYzMDMsImp0aSI6IjYxMWY3NjNkLTdjYTItNGJmYy1iMGQxLTYzNDZlNTdmNjZiYyIsInNpZCI6ImI4ZWFjZjI3LTkxN2MtNGFhNi1hOTVhLTNiMjY4OGQ2ODIzZSJ9.fRCKKrnluebzmNTJYIXEowP7q7736KKaFTnVseHaI3I",
  "access_expires_at": "2026-10-30T13:33:23.845141025Z",
  "refresh_token": "YblZNcHfbjWJTyNvvGfxrz3G4up4VwrVE6SSthJQ98Q",
  "refresh_expires_at": "2026-11-29T13:18:23.844786487Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6707700f-38f4-49f4-b71c-883c2326c371",
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
  "id": "22558e9a-06e7-4fa7-8de7-10083a626378",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:24.034247Z",
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
  "command_id": "d549bd44-a123-4c80-b1f6-f94c2a07d339",
  "quote_id": "22558e9a-06e7-4fa7-8de7-10083a626378",
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
  "id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a46fd3fc-b5a3-49d7-830c-b59f19949ad5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:18:24.238023Z",
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
    "id": "90231977-47b4-489f-b824-64e0d0427431",
    "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
    "expires_at": "2026-10-30T13:18:39.240124Z",
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

`POST /api/driver/v1/offers/90231977-47b4-489f-b824-64e0d0427431/reject` → **204**

```json
{
  "command_id": "3ad153b6-8fc3-4afc-8a9a-a36f34c83578"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b95107a7-a576-4309-9edb-3d72523662b2",
    "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
    "expires_at": "2026-10-30T13:18:39.639701Z",
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

`POST /api/driver/v1/offers/b95107a7-a576-4309-9edb-3d72523662b2/accept` → **200**

```json
{
  "command_id": "d66ccb03-785b-4c5b-8fb3-e8f6a56938f7"
}
```

```json
{
  "id": "aba3b58d-909c-478a-b3c2-12de1c74bf98",
  "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "48b905b3-3042-4258-83c9-a6c0a01c856f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c71706b8-d20d-48c2-bd01-de4a483ab9fe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:18:24.238361Z",
      "actor": {
        "type": "CLIENT",
        "id": "a46fd3fc-b5a3-49d7-830c-b59f19949ad5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
        "quote_id": "22558e9a-06e7-4fa7-8de7-10083a626378",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ddd7e2ca-fd0f-4dce-b1df-81650e8c6e04"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:18:24.239554Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
        "attempt_id": "c0993f0a-102d-4471-9398-360892ce5294",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ddd7e2ca-fd0f-4dce-b1df-81650e8c6e04"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:18:24.244044Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "90231977-47b4-489f-b824-64e0d0427431",
        "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "ddd7e2ca-fd0f-4dce-b1df-81650e8c6e04"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T13:18:24.638997Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "90231977-47b4-489f-b824-64e0d0427431",
        "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe"
      },
      "correlation_id": "858711d2-05b2-484f-a781-fbe99059ebeb"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c71706b8-d20d-48c2-bd01-de4a483ab9fe — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c71706b8-d20d-48c2-bd01-de4a483ab9fe` → **200**

```json
{
  "id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a46fd3fc-b5a3-49d7-830c-b59f19949ad5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "aba3b58d-909c-478a-b3c2-12de1c74bf98",
    "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "48b905b3-3042-4258-83c9-a6c0a01c856f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:18:24.238023Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c71706b8-d20d-48c2-bd01-de4a483ab9fe/cancel` → **200**

```json
{
  "command_id": "efc498ac-76f0-48c5-bcc5-a7a19e079394",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a46fd3fc-b5a3-49d7-830c-b59f19949ad5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "aba3b58d-909c-478a-b3c2-12de1c74bf98",
    "order_id": "c71706b8-d20d-48c2-bd01-de4a483ab9fe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "48b905b3-3042-4258-83c9-a6c0a01c856f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:18:24.238023Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
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
  "session_id": "384c8e4b-f713-4792-9196-53ad1bba1f14",
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
  "last_heartbeat_at": "2026-10-30T13:18:21.675908Z",
  "last_location_at": "2026-10-30T13:18:21.675908Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/384c8e4b-f713-4792-9196-53ad1bba1f14/close` → **200**

```json
{
  "command_id": "32954aae-fe7a-423f-9b5c-2a61c4c2ac3c",
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
  "session_id": "959cb76c-dcf4-4632-b4f4-0bb585f15470",
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
  "last_heartbeat_at": "2026-10-30T13:18:22.656528Z",
  "last_location_at": "2026-10-30T13:18:22.656528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/959cb76c-dcf4-4632-b4f4-0bb585f15470/close` → **200**

```json
{
  "command_id": "b3df70cb-9703-43b3-93f8-0cd5b1addaf2",
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
  "session_id": "6ff4f148-47f1-4945-8b93-8860cd188488",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMDYsImlhdCI6MTc5MzM2NjMwNiwianRpIjoiMzM2ZTJhN2QtM2QzNy00Y2Y4LTgxMDMtOTE2MjNkZGQxMjk1Iiwic2lkIjoiNmZmNGYxNDgtNDdmMS00OTQ1LThiOTMtODg2MGNkMTg4NDg4In0.BXhMINR8V6wbICOfrSKf39iDdag8tClevkePP4_0bZA",
  "access_expires_at": "2026-10-30T13:33:26.649082319Z",
  "refresh_token": "RCVlMKOEtwRNg10ph3VK8u8aahG9LVmlOlAx4zl9KlM",
  "refresh_expires_at": "2026-10-31T01:18:26.64846407Z",
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
  "command_id": "7c473688-6212-48ab-9b37-7bc0f06db7b5",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:18:27.076498Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3b121056-46e8-41dc-972a-bef101dd84ea",
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
  "correlation_id": "29d08a92-0c04-43b7-820e-01b30dfb5cb7"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "3d7bbc0f-ea50-49ee-b9ee-4eada8fdf0e5",
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
  "correlation_id": "51dd53be-1771-413b-a330-7ddd939af5cc"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639634804",
  "device_ref": "sandbox-16682"
}
```

```json
{
  "challenge_id": "bff2ad5c-a5ea-491b-b006-313798466ca5",
  "expires_at": "2026-10-30T13:23:27.647676681Z",
  "resend_available_at": "2026-10-30T13:18:28.647676681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639634804` → **200**

```json
{
  "phone": "+380639634804",
  "audience": "CLIENT",
  "code": "203931",
  "sent_at": "2026-10-30T13:18:27.650320023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bff2ad5c-a5ea-491b-b006-313798466ca5",
  "code": "203931",
  "device_ref": "sandbox-16682"
}
```

```json
{
  "session_id": "4da8b493-9b32-471c-bbe4-12df498b0a5a",
  "subject": {
    "type": "CLIENT",
    "id": "19aa3fc9-3831-473d-b70d-517ccbca8c01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFhM2ZjOS0zODMxLTQ3M2QtYjcwZC01MTdjY2JjYThjMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjA3LCJpYXQiOjE3OTMzNjYzMDcsImp0aSI6ImNmMzIxZjRiLTdjODQtNDcxOC1iOWYzLTY2MDMyMGM3MGI2MiIsInNpZCI6IjRkYThiNDkzLTliMzItNDcxYy1iYmU0LTEyZGY0OThiMGE1YSJ9.QB2zbgPwOq40MiD505Zu_hmNmClnol1J2Okvq6eUjfc",
  "access_expires_at": "2026-10-30T13:33:27.850981605Z",
  "refresh_token": "e8RKWsCvPrE92hMwVnjIFSgzec93xrM804tuER7aPRQ",
  "refresh_expires_at": "2026-11-29T13:18:27.850643266Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2ffeb80-bc56-4407-8cff-a90fd8c54000",
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
  "id": "e4417069-f141-4882-b6e9-b3e25ce188dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:28.036566Z",
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
  "command_id": "54b90b3a-a2ae-4773-abf5-57e7e8e7a46d",
  "quote_id": "e4417069-f141-4882-b6e9-b3e25ce188dd",
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
  "correlation_id": "9a70b0e5-84ae-4894-adc2-3ff67484d5e0"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2f244028-f8c6-410c-84b2-39c4913c24d3",
  "quote_id": "e4417069-f141-4882-b6e9-b3e25ce188dd",
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
  "id": "48c8e3b9-45ae-4cb6-998e-5ff3bb02e2cc",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "19aa3fc9-3831-473d-b70d-517ccbca8c01",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:18:28.419074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/48c8e3b9-45ae-4cb6-998e-5ff3bb02e2cc/cancel` → **200**

```json
{
  "command_id": "c1a74949-e34d-473c-88d2-be9d6ad1062e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "48c8e3b9-45ae-4cb6-998e-5ff3bb02e2cc",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "19aa3fc9-3831-473d-b70d-517ccbca8c01",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:18:28.419074Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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
  "command_id": "f8b29bd2-ca60-4ee4-8186-3c367bfdbeb7",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:18:28.820299Z"
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
      "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:18:28.820299Z"
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
  "device_ref": "sandbox-26700"
}
```

```json
{
  "challenge_id": "1e9e63f8-bbca-40f7-ae84-468902c8cdfa",
  "expires_at": "2026-10-30T13:23:29.4017346Z",
  "resend_available_at": "2026-10-30T13:18:30.4017346Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "171691",
  "sent_at": "2026-10-30T13:18:29.404618542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e9e63f8-bbca-40f7-ae84-468902c8cdfa",
  "code": "171691",
  "device_ref": "sandbox-26700"
}
```

```json
{
  "session_id": "94f40287-6173-47d4-9712-cc84fda0cb1e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIwOSwiaWF0IjoxNzkzMzY2MzA5LCJqdGkiOiIxYzA2YTY2ZC03MzAwLTQ3ODQtYjZhNS02ZjU1ODdjYWY2ODciLCJzaWQiOiI5NGY0MDI4Ny02MTczLTQ3ZDQtOTcxMi1jYzg0ZmRhMGNiMWUifQ.CB1o2MSvtDs_Wc_tNMsUe28y8L7gwnw-ywO_W-bGO8Q",
  "access_expires_at": "2026-10-30T13:33:29.615510003Z",
  "refresh_token": "X8ofkqhw6J7-mBNlzp7xspnT2x2PDqVzhrBRaEYQaIs",
  "refresh_expires_at": "2026-11-29T13:18:29.615095661Z",
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
  "command_id": "55056435-eb81-47e2-a6b9-1ff88b8d5394",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:29Z",
    "sequence": 1793366309977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:29.992553Z",
  "last_location_at": "2026-10-30T13:18:29.992553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676529893",
  "device_ref": "sandbox-30858"
}
```

```json
{
  "challenge_id": "cbd4e85b-e8cf-45cd-a55d-ff13677af0f2",
  "expires_at": "2026-10-30T13:23:30.178399776Z",
  "resend_available_at": "2026-10-30T13:18:31.178399776Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676529893` → **200**

```json
{
  "phone": "+380676529893",
  "audience": "CLIENT",
  "code": "905736",
  "sent_at": "2026-10-30T13:18:30.180401674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbd4e85b-e8cf-45cd-a55d-ff13677af0f2",
  "code": "905736",
  "device_ref": "sandbox-30858"
}
```

```json
{
  "session_id": "e909fbac-a2fb-44e4-9831-1bd891d06113",
  "subject": {
    "type": "CLIENT",
    "id": "1d255611-025e-4205-8b37-e4135253edc2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDI1NTYxMS0wMjVlLTQyMDUtOGIzNy1lNDEzNTI1M2VkYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjEwLCJpYXQiOjE3OTMzNjYzMTAsImp0aSI6IjNlOWFiNjNhLWE5YTUtNGU0Ni1iM2FjLTUxODhlNzUxOTI5OCIsInNpZCI6ImU5MDlmYmFjLWEyZmItNDRlNC05ODMxLTFiZDg5MWQwNjExMyJ9.Dr1IRJ69in4iFnRbIax0U2RxV1kASTon7zSfTnFOHgQ",
  "access_expires_at": "2026-10-30T13:33:30.389846072Z",
  "refresh_token": "MjnEea9MUc3j8t4JOABPtJRPm6zkFMelHcGH8swysLI",
  "refresh_expires_at": "2026-11-29T13:18:30.389363667Z",
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
  "command_id": "d20028f0-a565-441c-911b-f5c4d028b186",
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
  "id": "0c5d5a2f-3804-4342-9eaf-ec462fae5844",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:30.772692Z",
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
  "command_id": "18c3c122-45e1-4276-a78d-129b4d792ae1",
  "platform": "ANDROID",
  "token": "sandbox-driver-3b7b402e-9ac9-47ac-a60d-ccb629f9bb01"
}
```

```json
{
  "id": "a3303215-28ca-4460-99ec-5fbd4929b4de",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:18:30.977384Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "d65fe764-7346-4b13-bb3b-f16356b30a2e",
  "platform": "ANDROID",
  "token": "sandbox-rider-a443ea2e-738b-4332-97a9-94463ae21460"
}
```

```json
{
  "id": "8e979966-24a9-49cd-8d47-919abbaa1be9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:18:31.176703Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "93add8d1-1ecb-4aba-b20d-6f1fd0ead259",
  "quote_id": "0c5d5a2f-3804-4342-9eaf-ec462fae5844",
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
  "id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1d255611-025e-4205-8b37-e4135253edc2",
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
  "created_at": "2026-10-30T13:18:31.371645Z",
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
    "id": "67432357-84b0-4f32-a7c1-bd86e1644849",
    "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
    "expires_at": "2026-10-30T13:18:46.374084Z",
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

`POST /api/driver/v1/offers/67432357-84b0-4f32-a7c1-bd86e1644849/accept` → **200**

```json
{
  "command_id": "e278cfd0-052d-41c1-9ecc-d90100c5dc11"
}
```

```json
{
  "id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:18:31.352Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:18:31.352Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:18:32.303090311Z",
    "token_suffix": "f9bb01",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
      "order_version": "2",
      "event_id": "799870f5-4ec5-47b3-83d5-8fe7ab13487b"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676529893&after=2026-10-30T13:18:31.352Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:18:32.301062934Z",
    "token_suffix": "e21460",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
      "order_version": "3",
      "event_id": "709d0987-9979-4417-94cd-6b66996271b3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6cb5c431-2fe6-420a-8db8-3d307c52dd82/messages` → **201**

```json
{
  "command_id": "4e23aaf6-eba5-48e7-b8fd-22404ca3794a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "fa80c37c-b272-4c5d-807d-7e50def87ec4",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:18:33.054297752Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "assignment_id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
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

`POST /api/driver/v1/trips/6f020946-66ca-4df2-9e0f-5e0b1a5f307f/messages` → **201**

```json
{
  "command_id": "40846088-df13-4d12-a644-efc45c4f55a8",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "7926674b-1f73-4766-bb61-48e4304c4e37",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:18:33.426069407Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6cb5c431-2fe6-420a-8db8-3d307c52dd82/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6f020946-66ca-4df2-9e0f-5e0b1a5f307f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676529893"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:33Z",
    "sequence": 1793366313961
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:33.976988Z",
  "last_location_at": "2026-10-30T13:18:33.976988Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "assignment_id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
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

`POST /api/driver/v1/trips/6f020946-66ca-4df2-9e0f-5e0b1a5f307f/arrive` → **200**

```json
{
  "command_id": "24c2b042-daa3-4f1b-8cd1-fd398f24e962",
  "expected_version": 0
}
```

```json
{
  "id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "assignment_id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
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
  "arrived_at": "2026-10-30T13:18:34.348832Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f020946-66ca-4df2-9e0f-5e0b1a5f307f/start` → **200**

```json
{
  "command_id": "312e135e-8b00-4f58-a07f-4dfd603aef95",
  "expected_version": 1
}
```

```json
{
  "id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "assignment_id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
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
  "arrived_at": "2026-10-30T13:18:34.348832Z",
  "started_at": "2026-10-30T13:18:34.549234Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:34Z",
    "sequence": 1793366314730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:34.745897Z",
  "last_location_at": "2026-10-30T13:18:34.745897Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6f020946-66ca-4df2-9e0f-5e0b1a5f307f/complete` → **200**

```json
{
  "command_id": "9bfe9efd-ceda-4868-a1f8-0ae83bcd5fd6",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:18:34Z",
  "cash_received": true
}
```

```json
{
  "id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "assignment_id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
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
  "arrived_at": "2026-10-30T13:18:34.348832Z",
  "started_at": "2026-10-30T13:18:34.549234Z",
  "completed_at": "2026-10-30T13:18:34.940401Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6cb5c431-2fe6-420a-8db8-3d307c52dd82` → **200**

```json
{
  "id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1d255611-025e-4205-8b37-e4135253edc2",
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
    "id": "b3417438-ba1b-4df0-93c1-54b7d6a87253",
    "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:18:31.371645Z",
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
    "id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:18:31.371645Z",
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
    "id": "6f020946-66ca-4df2-9e0f-5e0b1a5f307f",
    "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
    "order_short_number": 14,
    "created_at": "2026-10-30T13:18:31.76125Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8f169a0c-d1c4-4268-9c7b-6b49258d74d5",
    "order_id": "1a5e5e8f-509a-4c87-a05b-d8dc8af9852e",
    "order_short_number": 9,
    "created_at": "2026-10-30T13:17:38.373402Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "61a53e83-82f9-4ae0-86fd-bc27934a2d1f",
    "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
    "order_short_number": 4,
    "created_at": "2026-10-30T13:17:01.797355Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a3f499cd-b9d2-49e4-aec4-fdface6e9eaa",
    "order_id": "163793bf-9915-4349-a30a-ded8d4afcce9",
    "order_short_number": 2,
    "created_at": "2026-10-30T13:16:27.705972Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5d352ab0-a9b1-4346-a8df-18420e589dd3",
    "order_id": "1bebba95-92ed-46e6-a057-fec70060448a",
    "order_short_number": 1,
    "created_at": "2026-10-30T13:16:21.011783Z",
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

`GET /api/rider/v1/orders/6cb5c431-2fe6-420a-8db8-3d307c52dd82/tip` → **200**

```json
{
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
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
  "available_until": "2026-10-31T13:18:34.940401Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6cb5c431-2fe6-420a-8db8-3d307c52dd82/tip` → **201**

```json
{
  "command_id": "21ec5cd6-9b0d-41af-a474-04dd05effd5c",
  "amount_minor": 1100
}
```

```json
{
  "id": "c4bdceb8-92f2-4a38-a983-25afed88b897",
  "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:18:39.292183Z"
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
  "session_id": "56f9ad95-2124-4cd2-8233-d873e586f94b",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMTksImlhdCI6MTc5MzM2NjMxOSwianRpIjoiYjQ3ODg3MGMtOGQ4OS00MWExLWEzNjQtOGFiN2NjZjAyMzRiIiwic2lkIjoiNTZmOWFkOTUtMjEyNC00Y2QyLTgyMzMtZDg3M2U1ODZmOTRiIn0.v1jPZE9Cpek399eWb3kgqwhumkP9gemMd5DbKHiQZvY",
  "access_expires_at": "2026-10-30T13:33:39.735611325Z",
  "refresh_token": "5A_GHAF-7gIUqXAluLpQDyEijKYyPGG3FNu1OgG6d7Q",
  "refresh_expires_at": "2026-10-31T01:18:39.735209791Z",
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
      "APP": 12,
      "PHONE": 1
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
  "generated_at": "2026-10-30T13:18:39.920823883Z"
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
  "generated_at": "2026-10-30T13:18:40.114561254Z"
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
  "session_id": "4ec53fdf-08a3-47a2-810a-9eee28d93880",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMjAsImlhdCI6MTc5MzM2NjMyMCwianRpIjoiYjQzNmE5ZDEtZTU0OC00NTY4LTg4YmQtODAzYjgyNWE5ZmVjIiwic2lkIjoiNGVjNTNmZGYtMDhhMy00N2EyLTgxMGEtOWVlZTI4ZDkzODgwIn0.TcDzf6q86MZKyQsm6ty3tBeE_wpJmYBfLuo4o8rMnKE",
  "access_expires_at": "2026-10-30T13:33:40.506087877Z",
  "refresh_token": "YMuKR9s2wufa8PTPSO0tdVu4UWfYkjrgiQTvCZMBCoI",
  "refresh_expires_at": "2026-10-31T01:18:40.505707866Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6cb5c431-2fe6-420a-8db8-3d307c52dd82/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:18:31.372009Z",
      "actor": {
        "type": "CLIENT",
        "id": "1d255611-025e-4205-8b37-e4135253edc2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
        "quote_id": "0c5d5a2f-3804-4342-9eaf-ec462fae5844",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cabbebc3-1a46-4f48-bbee-51af12e950cd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:18:31.373501Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
        "attempt_id": "b90ededa-4ed9-4248-be6c-da5d9cc7858d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cabbebc3-1a46-4f48-bbee-51af12e950cd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:18:31.377828Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "67432357-84b0-4f32-a7c1-bd86e1644849",
        "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "cabbebc3-1a46-4f48-bbee-51af12e950cd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:18:31.762453Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "67432357-84b0-4f32-a7c1-bd86e1644849",
        "order_id": "6cb5c431-2fe6-420a-8db8-3d307c52dd82",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b3417438-ba1b-4df0-93c1-54b7d6a87253"
      },
      "correlation_id": "33624988-0272-4094-a593-66f177c74e19"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:18:40.883991139Z",
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
      "last_location_at": "2026-10-30T13:18:34.745897Z",
      "order_id": null
    }
  ]
}
```

Done: order 6cb5c431-2fe6-420a-8db8-3d307c52dd82.

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
  "session_id": "a5d662ed-4f7d-4913-b20a-148102e350de",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMjEsImlhdCI6MTc5MzM2NjMyMSwianRpIjoiM2EyNmYyNTItMzlhZi00MTM0LWIxODktZmU4YjRiYmVkMjEzIiwic2lkIjoiYTVkNjYyZWQtNGY3ZC00OTEzLWIyMGEtMTQ4MTAyZTM1MGRlIn0.KyJryZvKrSPJpd6UkNKMcRmJVy_uml0dIrskRhZgciM",
  "access_expires_at": "2026-10-30T13:33:41.298935394Z",
  "refresh_token": "b8Rk47ItSa_mafio0y09OmSreKCkX0P9yFLx-V8oJHQ",
  "refresh_expires_at": "2026-10-31T01:18:41.298614843Z",
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
  "command_id": "e0cded46-cb80-40fe-a952-63f890f8bff5",
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
  "timestamp": "2026-10-30T13:18:41.000+0000",
  "channel": {
    "id": "1730052000.3045126724",
    "linkedid": "1730052000.3045126724",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679057104"
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
  "timestamp": "2026-10-30T13:18:41.000+0000",
  "channel": {
    "id": "1730052000.3045126724",
    "linkedid": "1730052000.3045126724",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679057104"
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
  "session_id": "4c03f2b9-5041-4c50-a948-fff751c22d9a",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMjIsImlhdCI6MTc5MzM2NjMyMiwianRpIjoiZTE3OTIxYTktMTcxMy00ZTFlLTkwNmUtMTgxZTg0YTM5YTQ4Iiwic2lkIjoiNGMwM2YyYjktNTA0MS00YzUwLWE5NDgtZmZmNzUxYzIyZDlhIn0.1JU99pSa9y7bwdbj8xAifwvavGcGkFyfIY2N7otbIbg",
  "access_expires_at": "2026-10-30T13:33:42.09722014Z",
  "refresh_token": "jdCLIyqK8LzRa7SeK71xZjW2NkQCxDmeWckCaCNWQRo",
  "refresh_expires_at": "2026-10-31T01:18:42.096831146Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "afe7d348-9f1b-4bcf-b909-cdb9369393ad",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679057104",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:18:41Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/afe7d348-9f1b-4bcf-b909-cdb9369393ad/answer` → **200**

```json
{
  "command_id": "98ebe179-88ce-4384-97ce-030693e603b8"
}
```

```json
{
  "id": "afe7d348-9f1b-4bcf-b909-cdb9369393ad",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679057104",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "order_ids": [],
  "started_at": "2026-10-30T13:18:41Z",
  "answered_at": "2026-10-30T13:18:42.486391Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3045126724",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c9846497-6e0e-44aa-9d6a-d34e26ec7dae",
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
  "id": "02d7ad7a-1c52-4c71-8b2e-6e04bbe59e3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:42.699197Z",
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
  "command_id": "ffffc75f-0712-4af3-af80-8ff1715d3094",
  "quote_id": "02d7ad7a-1c52-4c71-8b2e-6e04bbe59e3d",
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
    "phone": "+380679057104"
  },
  "call_id": "afe7d348-9f1b-4bcf-b909-cdb9369393ad"
}
```

```json
{
  "id": "01d0d2a9-3056-4e8d-aa47-ba83594d86bd",
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
  "created_at": "2026-10-30T13:18:42.906722Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679057104"
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
    "id": "1730052000.3045126724",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "afe7d348-9f1b-4bcf-b909-cdb9369393ad",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679057104",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [
        "01d0d2a9-3056-4e8d-aa47-ba83594d86bd"
      ],
      "started_at": "2026-10-30T13:18:41Z",
      "answered_at": "2026-10-30T13:18:42.486391Z",
      "ended_at": "2026-10-30T13:18:43.12494Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "0a9079d8-b378-4843-8177-dceb57bcb560",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677767963",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [],
      "started_at": "2026-10-30T13:16:47.878617Z",
      "answered_at": "2026-10-30T13:16:48.100858Z",
      "ended_at": "2026-10-30T13:16:48.316373Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:16:57.790316Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/01d0d2a9-3056-4e8d-aa47-ba83594d86bd` → **200**

```json
{
  "id": "01d0d2a9-3056-4e8d-aa47-ba83594d86bd",
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
  "created_at": "2026-10-30T13:18:42.906722Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679057104"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/01d0d2a9-3056-4e8d-aa47-ba83594d86bd` → **200**

```json
{
  "id": "01d0d2a9-3056-4e8d-aa47-ba83594d86bd",
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
  "created_at": "2026-10-30T13:18:42.906722Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679057104"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/01d0d2a9-3056-4e8d-aa47-ba83594d86bd/cancel` → **200**

```json
{
  "command_id": "6b40032f-9ff2-491c-ad9b-cc504e5a13da",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "01d0d2a9-3056-4e8d-aa47-ba83594d86bd",
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
  "created_at": "2026-10-30T13:18:42.906722Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679057104"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call afe7d348-9f1b-4bcf-b909-cdb9369393ad with order 01d0d2a9-3056-4e8d-aa47-ba83594d86bd.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10752"
}
```

```json
{
  "challenge_id": "dfe87758-3325-4654-bbfb-a54d86ca402c",
  "expires_at": "2026-10-30T13:23:44.040833923Z",
  "resend_available_at": "2026-10-30T13:18:45.040833923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "683587",
  "sent_at": "2026-10-30T13:18:44.042884164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfe87758-3325-4654-bbfb-a54d86ca402c",
  "code": "683587",
  "device_ref": "sandbox-10752"
}
```

```json
{
  "session_id": "18d221a4-fe38-4e84-9d64-7f6e0881d605",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIyNCwiaWF0IjoxNzkzMzY2MzI0LCJqdGkiOiIxM2ZhNTFjMC00ZWM3LTQ0ZTEtODMwNS03ZDY1NmJmNTEyZWEiLCJzaWQiOiIxOGQyMjFhNC1mZTM4LTRlODQtOWQ2NC03ZjZlMDg4MWQ2MDUifQ.bHmf3AvDU-Xl83MwGBQLgwnJfA608CFwS_Hske5X9bc",
  "access_expires_at": "2026-10-30T13:33:44.256860219Z",
  "refresh_token": "Z94ZCMPrj-mg7TLvwx1JlPEsrOnlNFetEWCOwrPuNFw",
  "refresh_expires_at": "2026-11-29T13:18:44.256453763Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:34.745897Z",
  "last_location_at": "2026-10-30T13:18:34.745897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/handover` → **200**

```json
{
  "command_id": "4e927778-04f2-4866-be97-f39673681a01",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:34.745897Z",
  "last_location_at": "2026-10-30T13:18:34.745897Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:44Z",
    "sequence": 1793366324813
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:44.828906Z",
  "last_location_at": "2026-10-30T13:18:44.828906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664888558",
  "device_ref": "sandbox-28449"
}
```

```json
{
  "challenge_id": "9e680524-a4ce-4665-b2bd-19f54c27b540",
  "expires_at": "2026-10-30T13:23:45.012833408Z",
  "resend_available_at": "2026-10-30T13:18:46.012833408Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664888558` → **200**

```json
{
  "phone": "+380664888558",
  "audience": "CLIENT",
  "code": "838681",
  "sent_at": "2026-10-30T13:18:45.014878553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e680524-a4ce-4665-b2bd-19f54c27b540",
  "code": "838681",
  "device_ref": "sandbox-28449"
}
```

```json
{
  "session_id": "da95d23c-5d68-4363-9a06-15b936442e71",
  "subject": {
    "type": "CLIENT",
    "id": "4f305354-75fc-492f-9a72-dd359d27c9f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjMwNTM1NC03NWZjLTQ5MmYtOWE3Mi1kZDM1OWQyN2M5ZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjI1LCJpYXQiOjE3OTMzNjYzMjUsImp0aSI6IjY1ODA5YTYyLTA5YjMtNGM0ZC1iZjkwLTQ5ZmMwODJlYWVhNiIsInNpZCI6ImRhOTVkMjNjLTVkNjgtNDM2My05YTA2LTE1YjkzNjQ0MmU3MSJ9.h5x1mNd06K6rJJ34f01lJ8meGqRwlBYaWVqhN1F3ZhA",
  "access_expires_at": "2026-10-30T13:33:45.225168094Z",
  "refresh_token": "qANXu-vdQ9nVaf4oeksyPe_yGD8XpN56GpTPOyx_z8Q",
  "refresh_expires_at": "2026-11-29T13:18:45.224757382Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ea9d1d0f-e1e6-4cd0-9021-2fda832f0d45",
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
  "id": "0985961c-ca0b-44cb-a874-107401c2db2f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:45.413246Z",
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
  "command_id": "106f45e3-e6ca-4f6f-9b9b-fe8a158187d5",
  "quote_id": "0985961c-ca0b-44cb-a874-107401c2db2f",
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
  "id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f305354-75fc-492f-9a72-dd359d27c9f1",
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
  "created_at": "2026-10-30T13:18:45.607283Z",
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
    "id": "f463c285-97cb-4f44-9a05-061946ec6db6",
    "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
    "expires_at": "2026-10-30T13:19:00.609571Z",
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

`POST /api/driver/v1/offers/f463c285-97cb-4f44-9a05-061946ec6db6/accept` → **200**

```json
{
  "command_id": "f7523aa2-7736-4102-a553-314cd5332e72"
}
```

```json
{
  "id": "703989dc-527a-4cf1-b6e0-d8f114846852",
  "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b444730a-6472-4e34-8cea-656a0a45e903",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b444730a-6472-4e34-8cea-656a0a45e903",
  "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
  "assignment_id": "703989dc-527a-4cf1-b6e0-d8f114846852",
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

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:46Z",
    "sequence": 1793366326369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:46.385093Z",
  "last_location_at": "2026-10-30T13:18:46.385093Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b444730a-6472-4e34-8cea-656a0a45e903/arrive` → **200**

```json
{
  "command_id": "77b9efa7-52fa-42f3-afdb-477fc4f6457f",
  "expected_version": 0
}
```

```json
{
  "id": "b444730a-6472-4e34-8cea-656a0a45e903",
  "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
  "assignment_id": "703989dc-527a-4cf1-b6e0-d8f114846852",
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
  "arrived_at": "2026-10-30T13:18:46.585301Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b444730a-6472-4e34-8cea-656a0a45e903/start` → **200**

```json
{
  "command_id": "8076c158-e435-418a-a330-b70615d58831",
  "expected_version": 1
}
```

```json
{
  "id": "b444730a-6472-4e34-8cea-656a0a45e903",
  "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
  "assignment_id": "703989dc-527a-4cf1-b6e0-d8f114846852",
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
  "arrived_at": "2026-10-30T13:18:46.585301Z",
  "started_at": "2026-10-30T13:18:46.790301Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:46Z",
    "sequence": 1793366326975
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:46.990784Z",
  "last_location_at": "2026-10-30T13:18:46.990784Z",
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
  "device_ref": "sandbox-7605"
}
```

```json
{
  "challenge_id": "4119f39f-eb16-4e16-a6d2-75bf627c0c89",
  "expires_at": "2026-10-30T13:23:47.192582465Z",
  "resend_available_at": "2026-10-30T13:18:48.192582465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "715849",
  "sent_at": "2026-10-30T13:18:47.194484926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4119f39f-eb16-4e16-a6d2-75bf627c0c89",
  "code": "715849",
  "device_ref": "sandbox-7605"
}
```

```json
{
  "session_id": "de9ed6bf-63e4-49f0-8bf4-8792c88b5bb9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIyNywiaWF0IjoxNzkzMzY2MzI3LCJqdGkiOiI5NzdjYThjZi00YTViLTRhM2EtOTc3ZS0wN2JiNzczNzM5YjMiLCJzaWQiOiJkZTllZDZiZi02M2U0LTQ5ZjAtOGJmNC04NzkyYzg4YjViYjkifQ.fsPCA2K3y1NqWVpSW0uwVWQL1KxKLvwLn5dMWOdW6_o",
  "access_expires_at": "2026-10-30T13:33:47.39951874Z",
  "refresh_token": "OV1wIjXe0cQwZKVl8oQuDDwznHzfZgOwTBjIGVzKvCM",
  "refresh_expires_at": "2026-11-29T13:18:47.399190887Z",
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
  "command_id": "86783dfe-dfbb-4806-8264-212ea6026984",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:47Z",
    "sequence": 1793366327768
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bd30ab60-3c2d-41f4-a013-eeb0d56cc119",
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
  "last_heartbeat_at": "2026-10-30T13:18:47.784252Z",
  "last_location_at": "2026-10-30T13:18:47.784252Z",
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
  "session_id": "5584e4ad-eee4-480f-93ef-c916c00720e5",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMjgsImlhdCI6MTc5MzM2NjMyOCwianRpIjoiMzM4YzY4OGUtYzA4MC00M2ZiLThhNzQtNGE0YmJkM2QxN2Y4Iiwic2lkIjoiNTU4NGU0YWQtZWVlNC00ODBmLTkzZWYtYzkxNmMwMDcyMGU1In0.kalw3pEvjyl-CIyp3lhRuaI48P2-2MObWpmvlcmPE78",
  "access_expires_at": "2026-10-30T13:33:48.172449089Z",
  "refresh_token": "099BYfQzBnwbbI4xO_WyMsqUgwo_-RdwrpnwXme7_vI",
  "refresh_expires_at": "2026-10-31T01:18:48.172090541Z",
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
  "session_id": "d67386a3-ad21-4ced-8198-cf27f38a1401",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMjgsImlhdCI6MTc5MzM2NjMyOCwianRpIjoiMjA1ZWFlNDMtYjg2Mi00ZWNlLWIwYTAtMDMzODIyNWZhN2FjIiwic2lkIjoiZDY3Mzg2YTMtYWQyMS00Y2VkLTgxOTgtY2YyN2YzOGExNDAxIn0._9yiRJzhp_14S9eWMGCm3vPgdP-_0GrB2JeXML1rzx0",
  "access_expires_at": "2026-10-30T13:33:48.549020031Z",
  "refresh_token": "bkWxefjOVpZZcGUDSGcnmmgGN9-ZUfJYw6YOXHSRF2U",
  "refresh_expires_at": "2026-10-31T01:18:48.548692318Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9cab63ce-a87c-4479-b2ab-fc358fee67c3` → **200**

```json
{
  "id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4f305354-75fc-492f-9a72-dd359d27c9f1",
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
    "id": "703989dc-527a-4cf1-b6e0-d8f114846852",
    "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b444730a-6472-4e34-8cea-656a0a45e903",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:18:45.607283Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9cab63ce-a87c-4479-b2ab-fc358fee67c3/interrupt` → **200**

```json
{
  "command_id": "3953dab3-505d-4de4-bf41-24d6c235e678",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4f305354-75fc-492f-9a72-dd359d27c9f1",
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
      "id": "703989dc-527a-4cf1-b6e0-d8f114846852",
      "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b444730a-6472-4e34-8cea-656a0a45e903",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:18:45.607283Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4f305354-75fc-492f-9a72-dd359d27c9f1",
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
    "id": "5063c652-0625-4e32-aaaf-593f371eb2e3",
    "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
    "expires_at": "2026-10-30T13:19:03.937022Z",
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

`POST /api/driver/v1/offers/5063c652-0625-4e32-aaaf-593f371eb2e3/accept` → **200**

```json
{
  "command_id": "ec4797da-f77d-4a83-8eca-0031467419a9"
}
```

```json
{
  "id": "de95ffc5-8dff-4f96-b456-1688bdea663e",
  "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bef767d6-5b77-4547-8692-4d25b409995f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bef767d6-5b77-4547-8692-4d25b409995f",
  "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
  "assignment_id": "de95ffc5-8dff-4f96-b456-1688bdea663e",
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
  "session_id": "bd30ab60-3c2d-41f4-a013-eeb0d56cc119",
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
  "last_heartbeat_at": "2026-10-30T13:18:47.784252Z",
  "last_location_at": "2026-10-30T13:18:47.784252Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/bd30ab60-3c2d-41f4-a013-eeb0d56cc119/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:49Z",
    "sequence": 1793366329933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bd30ab60-3c2d-41f4-a013-eeb0d56cc119",
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
  "last_heartbeat_at": "2026-10-30T13:18:49.948297Z",
  "last_location_at": "2026-10-30T13:18:49.948297Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bef767d6-5b77-4547-8692-4d25b409995f/arrive` → **200**

```json
{
  "command_id": "48f45bae-254f-426b-b6d1-bc31e9416d1a",
  "expected_version": 0
}
```

```json
{
  "id": "bef767d6-5b77-4547-8692-4d25b409995f",
  "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
  "assignment_id": "de95ffc5-8dff-4f96-b456-1688bdea663e",
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
  "arrived_at": "2026-10-30T13:18:50.140765Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bef767d6-5b77-4547-8692-4d25b409995f/start` → **200**

```json
{
  "command_id": "4ae365fc-637d-4611-9c25-782e05db40d7",
  "expected_version": 1
}
```

```json
{
  "id": "bef767d6-5b77-4547-8692-4d25b409995f",
  "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
  "assignment_id": "de95ffc5-8dff-4f96-b456-1688bdea663e",
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
  "arrived_at": "2026-10-30T13:18:50.140765Z",
  "started_at": "2026-10-30T13:18:50.341835Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bef767d6-5b77-4547-8692-4d25b409995f/complete` → **200**

```json
{
  "command_id": "e864783c-c1eb-4423-95be-517404c725dd",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:18:50Z"
}
```

```json
{
  "id": "bef767d6-5b77-4547-8692-4d25b409995f",
  "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
  "assignment_id": "de95ffc5-8dff-4f96-b456-1688bdea663e",
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
  "arrived_at": "2026-10-30T13:18:50.140765Z",
  "started_at": "2026-10-30T13:18:50.341835Z",
  "completed_at": "2026-10-30T13:18:50.540718Z",
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
    "id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:18:48.930449Z",
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
    "id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:18:45.607283Z",
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
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
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

`GET /api/operator/v1/orders/9cab63ce-a87c-4479-b2ab-fc358fee67c3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:18:45.607658Z",
      "actor": {
        "type": "CLIENT",
        "id": "4f305354-75fc-492f-9a72-dd359d27c9f1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
        "quote_id": "0985961c-ca0b-44cb-a874-107401c2db2f",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "d14180d0-1f2d-41f6-868d-9d8f9830fa70"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:18:45.60906Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
        "attempt_id": "1200b034-222f-4ce0-a02e-a57de5cb0308",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d14180d0-1f2d-41f6-868d-9d8f9830fa70"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:18:45.613041Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f463c285-97cb-4f44-9a05-061946ec6db6",
        "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "d14180d0-1f2d-41f6-868d-9d8f9830fa70"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:18:45.995874Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f463c285-97cb-4f44-9a05-061946ec6db6",
        "order_id": "9cab63ce-a87c-4479-b2ab-fc358fee67c3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "703989dc-527a-4cf1-b6e0-d8f114846852"
      },
      "correlation_id": "81d8ddc2-5591-4800-bbe0-cd112a805e10"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a/tip` → **200**

```json
{
  "order_id": "dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a",
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
  "available_until": "2026-10-31T13:18:50.540718Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a/tip` → **409**

```json
{
  "command_id": "cf87a026-91e1-4328-a100-ec06cf02de10",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ef7737b5-ea80-4c53-9a83-0c04c8fcb36f"
}
```

Done: interrupted 9cab63ce-a87c-4479-b2ab-fc358fee67c3, follow-up dba4ebe3-5c0a-45dc-8a1c-c5c52a974f8a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad753f17-5dd6-4837-85b1-54a60f6afbaf",
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
  "last_heartbeat_at": "2026-10-30T13:18:46.990784Z",
  "last_location_at": "2026-10-30T13:18:46.990784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad753f17-5dd6-4837-85b1-54a60f6afbaf/close` → **200**

```json
{
  "command_id": "bc4b000f-429c-46c9-816a-229f0b26e294",
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
  "session_id": "bd30ab60-3c2d-41f4-a013-eeb0d56cc119",
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
  "last_heartbeat_at": "2026-10-30T13:18:49.948297Z",
  "last_location_at": "2026-10-30T13:18:49.948297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bd30ab60-3c2d-41f4-a013-eeb0d56cc119/close` → **200**

```json
{
  "command_id": "eb73b6bd-704d-44f7-9276-39170204781f",
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
  "session_id": "1646520f-2ac5-4113-8484-deb9a2e0ba12",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyMzUsImlhdCI6MTc5MzM2NjMzNSwianRpIjoiMDcxMWJlYjEtMzlhYS00MGE1LWE2MWMtY2ZmNmZkOTM1YjQzIiwic2lkIjoiMTY0NjUyMGYtMmFjNS00MTEzLTg0ODQtZGViOWEyZTBiYTEyIn0.7r8IP6wtD_MBCvufTJGdFLnW-bYDIVEq5KHUNIK727c",
  "access_expires_at": "2026-10-30T13:33:55.665054225Z",
  "refresh_token": "R-wUEqv3iedmBrVwnK7P0BolFyKbYh3w4KaG3lI84aI",
  "refresh_expires_at": "2026-10-31T01:18:55.664653101Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6cb5c530-1334-48c0-b7d0-37455c65c326",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:18:55Z"
}
```

```json
{
  "id": "e703c99b-ff37-47b7-9955-b4f7ba39f017",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:18:55Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e703c99b-ff37-47b7-9955-b4f7ba39f017/publish` → **200**

```json
{
  "command_id": "a30aa4c0-f518-4dea-8f7c-e7acb0225e7d",
  "expected_version": 0
}
```

```json
{
  "id": "e703c99b-ff37-47b7-9955-b4f7ba39f017",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:18:56.063212Z",
  "published_at": "2026-10-30T13:18:56.063212Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "e703c99b-ff37-47b7-9955-b4f7ba39f017",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:18:56.063212Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638009637",
  "device_ref": "sandbox-18906"
}
```

```json
{
  "challenge_id": "d69ebe75-9052-469a-82d0-1b99b21ddd55",
  "expires_at": "2026-10-30T13:23:56.434035487Z",
  "resend_available_at": "2026-10-30T13:18:57.434035487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638009637` → **200**

```json
{
  "phone": "+380638009637",
  "audience": "CLIENT",
  "code": "063789",
  "sent_at": "2026-10-30T13:18:56.436057053Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d69ebe75-9052-469a-82d0-1b99b21ddd55",
  "code": "063789",
  "device_ref": "sandbox-18906"
}
```

```json
{
  "session_id": "e8d18a7b-82ab-485a-853e-9ee64a82b3db",
  "subject": {
    "type": "CLIENT",
    "id": "bd50366c-4b81-4ecf-b828-7ccaeb6348a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDUwMzY2Yy00YjgxLTRlY2YtYjgyOC03Y2NhZWI2MzQ4YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjM2LCJpYXQiOjE3OTMzNjYzMzYsImp0aSI6IjhhNmEyYmI3LTVkMGMtNDM0My04NTBjLTIxYmM2YTMzOWFmZiIsInNpZCI6ImU4ZDE4YTdiLTgyYWItNDg1YS04NTNlLTllZTY0YTgyYjNkYiJ9.HjIHd4bBHN8dtfiTJq4oIIUcwc1_MIirdBsq6JhinQ8",
  "access_expires_at": "2026-10-30T13:33:56.641221958Z",
  "refresh_token": "mEmHIXJnvSU8KX7NS2uJ1XaKXitGAYqmDrmStaJZgpI",
  "refresh_expires_at": "2026-11-29T13:18:56.640839524Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "e703c99b-ff37-47b7-9955-b4f7ba39f017",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:18:56.063212Z",
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
  "command_id": "158e5df0-2b61-4607-b333-b259494b4804",
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
  "id": "cc007dd4-0280-4fa0-946d-07d19f8866fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:57.014330Z",
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
  "command_id": "679568d3-55d2-45c8-a1b4-de64538d14b3",
  "quote_id": "cc007dd4-0280-4fa0-946d-07d19f8866fe",
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
  "correlation_id": "6b45b82f-d35b-449e-9afa-653e8b870d08"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "e396a354-a2ff-4985-a426-204a426ebaab",
  "version_id": "e703c99b-ff37-47b7-9955-b4f7ba39f017",
  "language": "uk"
}
```

```json
{
  "version_id": "e703c99b-ff37-47b7-9955-b4f7ba39f017",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:18:57.407159Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3720903e-242a-4c2c-b2ae-b11df006a5bd",
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
  "id": "74cb4f54-6f62-4454-a7b7-9fbfc3b24f0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:23:57.598749Z",
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
  "command_id": "5a89d521-7221-44a5-8385-78914a4fbf7c",
  "quote_id": "74cb4f54-6f62-4454-a7b7-9fbfc3b24f0d",
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
  "id": "e3dd98a0-80fa-467a-b831-8be973604de0",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd50366c-4b81-4ecf-b828-7ccaeb6348a7",
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
  "created_at": "2026-10-30T13:18:57.797289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e3dd98a0-80fa-467a-b831-8be973604de0` → **200**

```json
{
  "id": "e3dd98a0-80fa-467a-b831-8be973604de0",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd50366c-4b81-4ecf-b828-7ccaeb6348a7",
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
  "created_at": "2026-10-30T13:18:57.797289Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e3dd98a0-80fa-467a-b831-8be973604de0/cancel` → **200**

```json
{
  "command_id": "687b883b-cd08-478c-9d4e-8180280a7ee6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e3dd98a0-80fa-467a-b831-8be973604de0",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bd50366c-4b81-4ecf-b828-7ccaeb6348a7",
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
  "created_at": "2026-10-30T13:18:57.797289Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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

`POST /api/admin/v1/legal-documents/e703c99b-ff37-47b7-9955-b4f7ba39f017` → **409**

```json
{
  "command_id": "43e3f4e2-205a-44cb-9592-29d5b415ac33",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:18:58Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/e703c99b-ff37-47b7-9955-b4f7ba39f017",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ba15b3d8-8522-4d44-a257-53156ab05f9b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f2085e35-d827-47c4-92e6-3cd32dfb1719",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:18:58Z"
}
```

```json
{
  "id": "6fa3d43f-9f2f-4e91-823f-73cef65f5e5a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:18:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/6fa3d43f-9f2f-4e91-823f-73cef65f5e5a/publish` → **200**

```json
{
  "command_id": "16c6165f-4c6e-4f67-90a4-8dd95cef20d8",
  "expected_version": 0
}
```

```json
{
  "id": "6fa3d43f-9f2f-4e91-823f-73cef65f5e5a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:18:58.782925Z",
  "published_at": "2026-10-30T13:18:58.782925Z",
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
  "device_ref": "sandbox-8540"
}
```

```json
{
  "challenge_id": "31404744-350a-4ce0-bfce-4c3cd9fe467f",
  "expires_at": "2026-10-30T13:23:58.970660589Z",
  "resend_available_at": "2026-10-30T13:18:59.970660589Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "545182",
  "sent_at": "2026-10-30T13:18:58.972455669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31404744-350a-4ce0-bfce-4c3cd9fe467f",
  "code": "545182",
  "device_ref": "sandbox-8540"
}
```

```json
{
  "session_id": "f74ce437-a4b7-43b8-a5c4-82f576204fcc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzIzOSwiaWF0IjoxNzkzMzY2MzM5LCJqdGkiOiI0NjM5NGUxNy03MTYwLTQxOTktYjUyYi0yMjIzOGQ3ZTRkNWEiLCJzaWQiOiJmNzRjZTQzNy1hNGI3LTQzYjgtYTVjNC04MmY1NzYyMDRmY2MifQ.rlpJ1D4JKM-fqk1hG2pgDQcg5BWIps3jccQ7Yfq1V2o",
  "access_expires_at": "2026-10-30T13:33:59.174603258Z",
  "refresh_token": "aCbd7rq9BB_TTfIVEB-pOHdkPD7dm68Kt25NXkjfKso",
  "refresh_expires_at": "2026-11-29T13:18:59.174261254Z",
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
  "command_id": "b2a59776-8e84-4ef1-8b02-cb210036d21b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:18:59Z",
    "sequence": 1793366339539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7c3fb9dc-5057-44fe-b048-8e70d43e7df5",
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
  "last_heartbeat_at": "2026-10-30T13:18:59.554687Z",
  "last_location_at": "2026-10-30T13:18:59.554687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678474297",
  "device_ref": "sandbox-24801"
}
```

```json
{
  "challenge_id": "d378d9dc-b27c-46d7-b377-bf8e51b92855",
  "expires_at": "2026-10-30T13:23:59.748025387Z",
  "resend_available_at": "2026-10-30T13:19:00.748025387Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678474297` → **200**

```json
{
  "phone": "+380678474297",
  "audience": "CLIENT",
  "code": "153816",
  "sent_at": "2026-10-30T13:18:59.750165071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d378d9dc-b27c-46d7-b377-bf8e51b92855",
  "code": "153816",
  "device_ref": "sandbox-24801"
}
```

```json
{
  "session_id": "360c2b1f-741a-4693-9226-1b4cc5191a2f",
  "subject": {
    "type": "CLIENT",
    "id": "6f2bdf57-838d-44ef-8865-48a7c1655351"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjJiZGY1Ny04MzhkLTQ0ZWYtODg2NS00OGE3YzE2NTUzNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjM5LCJpYXQiOjE3OTMzNjYzMzksImp0aSI6IjM5ZTFkNDllLTU4YWYtNDgwMS05ZjU0LTdiNTUwYmQzNjUwMiIsInNpZCI6IjM2MGMyYjFmLTc0MWEtNDY5My05MjI2LTFiNGNjNTE5MWEyZiJ9.sHA01a-YvQZIccEIZhPqJmnDOfsailwFlYMcgm46k5E",
  "access_expires_at": "2026-10-30T13:33:59.957384234Z",
  "refresh_token": "GiOy-MHmTZuIiIJXM6SCwg99tiaytNjrlPgdPigctAE",
  "refresh_expires_at": "2026-11-29T13:18:59.957053016Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1228c0e7-bc23-4b62-93a7-121292b32cd3",
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
  "id": "6d73ee5a-4186-464c-977a-d333dd68ef0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:00.150444Z",
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
  "command_id": "b503e8ae-8063-4b16-98b1-696e928148d8",
  "quote_id": "6d73ee5a-4186-464c-977a-d333dd68ef0a",
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
    "phone": "+380674880002"
  }
}
```

```json
{
  "id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:19:00.346202Z",
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
    "id": "a7a03bef-a2e1-4cb7-9e0a-30a23ec932e0",
    "order_id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
    "expires_at": "2026-10-30T13:19:15.348591Z",
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

`POST /api/driver/v1/offers/a7a03bef-a2e1-4cb7-9e0a-30a23ec932e0/accept` → **200**

```json
{
  "command_id": "eb3ceeab-08fe-4405-b76f-bd27db7957b8"
}
```

```json
{
  "id": "9af75d25-fc0a-482c-a18d-940b73de503a",
  "order_id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "819eb5dd-638a-4699-9c0a-c370e322adfe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "819eb5dd-638a-4699-9c0a-c370e322adfe",
  "order_id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
  "assignment_id": "9af75d25-fc0a-482c-a18d-940b73de503a",
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
    "phone": "+380674880002"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0000d871-5be5-43d9-a7e3-92271593c966",
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
  "id": "2425fb51-2cc7-44aa-8c27-c7ae6cd7030a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:01.145773Z",
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
  "command_id": "d3a0125b-00ec-42bf-9427-67aeea76b04f",
  "quote_id": "2425fb51-2cc7-44aa-8c27-c7ae6cd7030a",
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
  "id": "4209e99e-a1a6-4fab-967d-adc5fefabb6f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:19:01.348169Z",
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
  "command_id": "11e6ec78-f90a-454b-b345-3f83d4841d64",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:19:01Z"
}
```

```json
{
  "id": "ebda71b5-80fc-44b5-a5e2-08777b4cad89",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:01.557133Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:19:01Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "651dde2f-6780-4bcb-a5a7-09d6d7d46923",
  "quote_id": "ebda71b5-80fc-44b5-a5e2-08777b4cad89",
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
  "pickup_at": "2026-10-30T16:19:01Z"
}
```

```json
{
  "id": "a245c645-191e-484d-906c-fa2f818bbc3a",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:19:01.755327Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:19:01Z",
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
  "command_id": "01745d6f-d337-4a20-a798-c28d5118478a",
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
  "id": "43366450-bcfa-4cea-b6d1-da18f88ee7b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:01.970080Z",
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
  "command_id": "77bf8fc4-5bfd-4a87-9104-40c1e0eb949f",
  "quote_id": "43366450-bcfa-4cea-b6d1-da18f88ee7b3",
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
  "correlation_id": "9ac1140e-1b4e-4f97-aca1-fa21c3195d64"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "a245c645-191e-484d-906c-fa2f818bbc3a",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:19:01.755327Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:19:01Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "4209e99e-a1a6-4fab-967d-adc5fefabb6f",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:19:01.348169Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4209e99e-a1a6-4fab-967d-adc5fefabb6f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:19:01.348169Z",
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

`GET /api/rider/v1/orders/6bd57dbf-2c9a-44f2-967a-42869b86043d` → **200**

```json
{
  "id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9af75d25-fc0a-482c-a18d-940b73de503a",
    "order_id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "819eb5dd-638a-4699-9c0a-c370e322adfe",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:19:00.346202Z",
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
    "location_at": "2026-10-30T13:18:59.554687Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/6bd57dbf-2c9a-44f2-967a-42869b86043d/cancel` → **200**

```json
{
  "command_id": "12af3c6b-d525-4507-85c9-3710142645cc",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9af75d25-fc0a-482c-a18d-940b73de503a",
    "order_id": "6bd57dbf-2c9a-44f2-967a-42869b86043d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "819eb5dd-638a-4699-9c0a-c370e322adfe",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:19:00.346202Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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

`GET /api/rider/v1/orders/4209e99e-a1a6-4fab-967d-adc5fefabb6f` → **200**

```json
{
  "id": "4209e99e-a1a6-4fab-967d-adc5fefabb6f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:19:01.348169Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4209e99e-a1a6-4fab-967d-adc5fefabb6f/cancel` → **200**

```json
{
  "command_id": "31ee9f17-9da6-41bf-bedd-3a790af297a2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4209e99e-a1a6-4fab-967d-adc5fefabb6f",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:19:01.348169Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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

`GET /api/rider/v1/orders/a245c645-191e-484d-906c-fa2f818bbc3a` → **200**

```json
{
  "id": "a245c645-191e-484d-906c-fa2f818bbc3a",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:19:01.755327Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:19:01Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a245c645-191e-484d-906c-fa2f818bbc3a/cancel` → **200**

```json
{
  "command_id": "b049c2ca-2d1b-4c79-823b-cc3baf17b7f1",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a245c645-191e-484d-906c-fa2f818bbc3a",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6f2bdf57-838d-44ef-8865-48a7c1655351",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:19:01.755327Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-30T16:19:01Z",
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
  "session_id": "7c3fb9dc-5057-44fe-b048-8e70d43e7df5",
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
  "last_heartbeat_at": "2026-10-30T13:18:59.554687Z",
  "last_location_at": "2026-10-30T13:18:59.554687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c3fb9dc-5057-44fe-b048-8e70d43e7df5/close` → **200**

```json
{
  "command_id": "f5ff546d-83cd-4c52-9161-71847485d622",
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

Done: orders 6bd57dbf-2c9a-44f2-967a-42869b86043d, 4209e99e-a1a6-4fab-967d-adc5fefabb6f, a245c645-191e-484d-906c-fa2f818bbc3a.

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
  "session_id": "96ab1e0e-c81b-4995-a298-c8ab4bce6d39",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNDQsImlhdCI6MTc5MzM2NjM0NCwianRpIjoiMjEzYzY4OWYtNzFhYi00ZjYzLWExMDAtODA4MjlmMTVlNWEwIiwic2lkIjoiOTZhYjFlMGUtYzgxYi00OTk1LWEyOTgtYzhhYjRiY2U2ZDM5In0.9u_0sZAoPNAGZ-IdlR-ZSxW8MSdYTOdn0MdMHOAwNwg",
  "access_expires_at": "2026-10-30T13:34:04.5076344Z",
  "refresh_token": "sS2wAVUX_1uCU6FHlGXNkA6s9xkyVzfDIZC5LEbanng",
  "refresh_expires_at": "2026-10-31T01:19:04.507102741Z",
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
  "session_id": "0068dc7b-de99-4c98-a18c-d033616bce31",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNDQsImlhdCI6MTc5MzM2NjM0NCwianRpIjoiYTMzOTllM2YtNTUyYS00OWQ4LTljMWItOGUzNDg2ZDYxMDA0Iiwic2lkIjoiMDA2OGRjN2ItZGU5OS00Yzk4LWExOGMtZDAzMzYxNmJjZTMxIn0.tnCxI1IJIJfJwWuaqqqlxXx3xBffXx6v6_sRbHdtfj0",
  "access_expires_at": "2026-10-30T13:34:04.897373246Z",
  "refresh_token": "gz4gFh7OyaSUH19rWQziK466VPZLEgyEZ12ZsTlz2r8",
  "refresh_expires_at": "2026-10-31T01:19:04.897018152Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31888"
}
```

```json
{
  "challenge_id": "19954033-63ea-4233-8dee-bbf04e37999c",
  "expires_at": "2026-10-30T13:24:05.087138464Z",
  "resend_available_at": "2026-10-30T13:19:06.087138464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "007974",
  "sent_at": "2026-10-30T13:19:05.088976806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19954033-63ea-4233-8dee-bbf04e37999c",
  "code": "007974",
  "device_ref": "sandbox-31888"
}
```

```json
{
  "session_id": "31fa6633-7c56-4ebf-89d2-207ea4a19a00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI0NSwiaWF0IjoxNzkzMzY2MzQ1LCJqdGkiOiI3MDUxNzQxNS0wODg0LTQ4NTQtYTY3Ni0yZDM3ODI0MGNhNmUiLCJzaWQiOiIzMWZhNjYzMy03YzU2LTRlYmYtODlkMi0yMDdlYTRhMTlhMDAifQ.2uuCLPXexnwSfIyiyZik5eGlDnBP5HQMxwe8rL8ELAc",
  "access_expires_at": "2026-10-30T13:34:05.296663278Z",
  "refresh_token": "wNzecZwTcn4za-WrjlctWChPxhKxdZWF1ZRq_xnEDQM",
  "refresh_expires_at": "2026-11-29T13:19:05.296319993Z",
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
  "command_id": "9a3f4840-86ae-47e9-82b3-bed1a5e088b2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:05Z",
    "sequence": 1793366345710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1de20867-8a7e-4042-b212-0daa9ceeb1de",
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
  "last_heartbeat_at": "2026-10-30T13:19:05.727554Z",
  "last_location_at": "2026-10-30T13:19:05.727554Z",
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
  "command_id": "978f8c57-2487-4eba-be21-d989994e7ea6",
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
  "effective_at": "2026-10-30T13:19:06.122361Z",
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:17:07.070824Z",
  "last_entries": [
    {
      "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:17:07.070824Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c1c936b8-81d6-4d3a-946b-64855c0642c1",
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
  "id": "a0656e91-4f77-48ce-aa6b-ccdc68f21e56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:06.500736Z",
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
  "command_id": "a10fcb85-4ac0-436c-bd10-85da17b91fe8",
  "quote_id": "a0656e91-4f77-48ce-aa6b-ccdc68f21e56",
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
    "phone": "+3806711125536"
  }
}
```

```json
{
  "id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
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
  "created_at": "2026-10-30T13:19:06.694932Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125536"
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
    "id": "28be24c0-bdb5-4d1a-82c3-c3a99b38ffb1",
    "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
    "expires_at": "2026-10-30T13:19:21.697395Z",
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

`POST /api/driver/v1/offers/28be24c0-bdb5-4d1a-82c3-c3a99b38ffb1/accept` → **200**

```json
{
  "command_id": "7398c6af-62ec-49f5-8480-942ef3c546e9"
}
```

```json
{
  "id": "635068f4-c790-4d21-be06-454077c2ee62",
  "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e01f8be-b4dd-47b3-ad11-34ee8e170ada",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e01f8be-b4dd-47b3-ad11-34ee8e170ada",
  "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
  "assignment_id": "635068f4-c790-4d21-be06-454077c2ee62",
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
    "phone": "+3806711125536"
  }
}
```

`POST /api/driver/v1/work-sessions/1de20867-8a7e-4042-b212-0daa9ceeb1de/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:07Z",
    "sequence": 1793366347455
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1de20867-8a7e-4042-b212-0daa9ceeb1de",
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
  "last_heartbeat_at": "2026-10-30T13:19:07.471071Z",
  "last_location_at": "2026-10-30T13:19:07.471071Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0e01f8be-b4dd-47b3-ad11-34ee8e170ada/arrive` → **200**

```json
{
  "command_id": "4a8a46d2-d360-42c3-ae7c-7709db64be28",
  "expected_version": 0
}
```

```json
{
  "id": "0e01f8be-b4dd-47b3-ad11-34ee8e170ada",
  "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
  "assignment_id": "635068f4-c790-4d21-be06-454077c2ee62",
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
  "arrived_at": "2026-10-30T13:19:07.663229Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125536"
  }
}
```

`POST /api/driver/v1/trips/0e01f8be-b4dd-47b3-ad11-34ee8e170ada/start` → **200**

```json
{
  "command_id": "8533e684-5e39-4a95-9178-e0bdc3644b5b",
  "expected_version": 1
}
```

```json
{
  "id": "0e01f8be-b4dd-47b3-ad11-34ee8e170ada",
  "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
  "assignment_id": "635068f4-c790-4d21-be06-454077c2ee62",
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
  "arrived_at": "2026-10-30T13:19:07.663229Z",
  "started_at": "2026-10-30T13:19:07.87056Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125536"
  }
}
```

`POST /api/driver/v1/trips/0e01f8be-b4dd-47b3-ad11-34ee8e170ada/complete` → **200**

```json
{
  "command_id": "41c8bede-eb51-4ed7-9def-09188340bee8",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:19:08Z",
  "cash_received": true
}
```

```json
{
  "id": "0e01f8be-b4dd-47b3-ad11-34ee8e170ada",
  "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
  "assignment_id": "635068f4-c790-4d21-be06-454077c2ee62",
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
  "arrived_at": "2026-10-30T13:19:07.663229Z",
  "started_at": "2026-10-30T13:19:07.87056Z",
  "completed_at": "2026-10-30T13:19:08.086713Z",
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
  "command_id": "7268a66a-095a-4bee-ad9c-35e016d1f5d3",
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
  "id": "f837c026-7b55-4ae9-ab33-0c770c50f15a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:08.311215Z",
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
  "command_id": "46b3ef5f-4a1b-4af3-9d9b-9726f2265ab8",
  "quote_id": "f837c026-7b55-4ae9-ab33-0c770c50f15a",
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
    "phone": "+3806711129012"
  }
}
```

```json
{
  "id": "16d8b0a7-d5bc-409d-a9d9-90c7350dd005",
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
  "created_at": "2026-10-30T13:19:08.504135Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129012"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/16d8b0a7-d5bc-409d-a9d9-90c7350dd005` → **200**

```json
{
  "id": "16d8b0a7-d5bc-409d-a9d9-90c7350dd005",
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
  "created_at": "2026-10-30T13:19:08.504135Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129012"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/16d8b0a7-d5bc-409d-a9d9-90c7350dd005/cancel` → **200**

```json
{
  "command_id": "5dd91515-2e8a-4ba6-837b-2974f5a2612f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "16d8b0a7-d5bc-409d-a9d9-90c7350dd005",
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
  "created_at": "2026-10-30T13:19:08.504135Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129012"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora"
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
  "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:17:07.070824Z",
  "last_entries": [
    {
      "order_id": "16d8b0a7-d5bc-409d-a9d9-90c7350dd005",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:19:08.904427Z"
    },
    {
      "order_id": "e19ed599-5c21-4b91-bca6-daac64f0ee74",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:19:08.090687Z"
    },
    {
      "order_id": "7bb5fbb6-9be0-44f5-a30f-25995309ae21",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:17:07.070824Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1de20867-8a7e-4042-b212-0daa9ceeb1de",
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
  "last_heartbeat_at": "2026-10-30T13:19:07.471071Z",
  "last_location_at": "2026-10-30T13:19:07.471071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1de20867-8a7e-4042-b212-0daa9ceeb1de/close` → **200**

```json
{
  "command_id": "5f6e9008-d937-4268-bc84-483e90bcb313",
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

Done: operator bonus for fulfilled e19ed599-5c21-4b91-bca6-daac64f0ee74 and operator-fault cancellation 16d8b0a7-d5bc-409d-a9d9-90c7350dd005.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674866819",
  "device_ref": "sandbox-1482"
}
```

```json
{
  "challenge_id": "322d47df-0460-4d25-9270-43d00f6f23db",
  "expires_at": "2026-10-30T13:24:12.923991086Z",
  "resend_available_at": "2026-10-30T13:19:13.923991086Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674866819` → **200**

```json
{
  "phone": "+380674866819",
  "audience": "CLIENT",
  "code": "275954",
  "sent_at": "2026-10-30T13:19:12.925793995Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677381721",
  "device_ref": "sandbox-5494",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "5e1f9fc1-8d39-4860-a4b6-44ffa93d0f91",
  "expires_at": "2026-10-30T13:24:14.348411478Z",
  "resend_available_at": "2026-10-30T13:19:15.348411478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677381721` → **200**

```json
{
  "phone": "+380677381721",
  "audience": "CLIENT",
  "code": "462060",
  "sent_at": "2026-10-30T13:19:14.350247717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677381721",
  "device_ref": "sandbox-10488",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "529b4d1b-65bd-4c20-8745-1d8cedfec531",
  "expires_at": "2026-10-30T13:24:15.753167021Z",
  "resend_available_at": "2026-10-30T13:19:16.753167021Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677381721` → **200**

```json
{
  "phone": "+380677381721",
  "audience": "CLIENT",
  "code": "186209",
  "sent_at": "2026-10-30T13:19:15.755114667Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672590000",
  "device_ref": "sandbox-26541"
}
```

```json
{
  "challenge_id": "1284e685-4949-4534-855b-d4ef491bef00",
  "expires_at": "2026-10-30T13:24:17.166508386Z",
  "resend_available_at": "2026-10-30T13:19:18.166508386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672590000",
  "device_ref": "sandbox-31676"
}
```

```json
{
  "challenge_id": "da594a67-cc78-4393-8e97-f2f61022e24e",
  "expires_at": "2026-10-30T13:24:18.561242212Z",
  "resend_available_at": "2026-10-30T13:19:19.561242212Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672590000` → **200**

```json
{
  "phone": "+380672590000",
  "audience": "CLIENT",
  "code": "639559",
  "sent_at": "2026-10-30T13:19:18.563398513Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672590000",
  "device_ref": "sandbox-20179",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8e81d46e-dfb6-43a8-b0ff-4bdb953519f8",
  "expires_at": "2026-10-30T13:24:19.979589407Z",
  "resend_available_at": "2026-10-30T13:19:20.979589407Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672590000` → **200**

```json
{
  "phone": "+380672590000",
  "audience": "CLIENT",
  "code": "901784",
  "sent_at": "2026-10-30T13:19:19.981680419Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380672590000",
  "device_ref": "sandbox-25725",
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
  "correlation_id": "6e434d9d-9dc0-49d4-a888-4725099f1bd8",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000012541"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "112d4aa0-e3ba-4490-b81b-c35a7ea01aab"
}
```

`GET /sandbox/v1/otp?phone=%2B442000012541` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120031552"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "65ad04d3-d443-463f-b5ac-96fb261d9295"
}
```

`GET /sandbox/v1/otp?phone=%2B37120031552` → **404**

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
  "session_id": "e4203610-ab15-4190-9d2e-cb039689cb58",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNjIsImlhdCI6MTc5MzM2NjM2MiwianRpIjoiYjhjYjA5ZTAtYzllMy00NTM3LWE4MGMtOThjZDczMDU1NGQzIiwic2lkIjoiZTQyMDM2MTAtYWIxNS00MTkwLTlkMmUtY2IwMzk2ODljYjU4In0.qaCXxo1cyazyf2lTlgf57VGUF_2VGnck_9FISDFq5Yc",
  "access_expires_at": "2026-10-30T13:34:22.204395946Z",
  "refresh_token": "0sf_D5nvMOXrNeaimviqkL0eHe72DLNtWCXn8-p4_Hs",
  "refresh_expires_at": "2026-10-31T01:19:22.204023506Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672590000` → **200**

```json
{
  "deliveries": [
    {
      "id": "3d18cd99-e76a-418d-95b1-d2904d8ee86c",
      "challenge_id": "8e81d46e-dfb6-43a8-b0ff-4bdb953519f8",
      "phone": "+380672590000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dab3ae5c-9364-43b8-b4f3-63d2229dc7c3",
      "error": null,
      "attempted_at": "2026-10-30T13:19:19.982213Z"
    },
    {
      "id": "4d0886d2-b4bb-407d-8a50-a8bf3a60ce87",
      "challenge_id": "da594a67-cc78-4393-8e97-f2f61022e24e",
      "phone": "+380672590000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f5d7a2e7-067e-4fe2-8142-30254f592fe4",
      "error": null,
      "attempted_at": "2026-10-30T13:19:18.563781Z"
    },
    {
      "id": "1d2459bd-ffba-43a9-9a2c-f3ab3e3836d9",
      "challenge_id": "1284e685-4949-4534-855b-d4ef491bef00",
      "phone": "+380672590000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:19:17.168571Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672590000` → **200**

```json
{
  "phone": "+380672590000",
  "audience": "CLIENT",
  "code": "901784",
  "sent_at": "2026-10-30T13:19:19.981680419Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677381721` → **200**

```json
{
  "deliveries": [
    {
      "id": "cddc35c5-df42-429a-b3fb-1a1786aa704a",
      "challenge_id": "529b4d1b-65bd-4c20-8745-1d8cedfec531",
      "phone": "+380677381721",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f3193150-f8d3-4a23-88d1-927a4027e003",
      "error": null,
      "attempted_at": "2026-10-30T13:19:15.755518Z"
    },
    {
      "id": "de1b3632-4202-473e-b222-cd03f56d435d",
      "challenge_id": "5e1f9fc1-8d39-4860-a4b6-44ffa93d0f91",
      "phone": "+380677381721",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-76f74763-6b3d-4815-b8a3-c1fe136dc744",
      "error": null,
      "attempted_at": "2026-10-30T13:19:14.350501Z"
    }
  ]
}
```

Done: SMS to +380674866819; SMS then a call to +380677381721; a failed SMS, two calls and a refused third to +380672590000; +44 and +371 refused.

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
  "session_id": "3fa87913-cb55-48a1-a955-d50a9dcfaa54",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNjMsImlhdCI6MTc5MzM2NjM2MywianRpIjoiN2EyOTEzY2QtNmE2Mi00YTYwLTg5NzUtMmY5MTY4MDA2MWUyIiwic2lkIjoiM2ZhODc5MTMtY2I1NS00OGExLWE5NTUtZDUwYTlkY2ZhYTU0In0.ZtDKij2m46IEoPFpvs6I--cusgWmfuuHGGQT4tBnN3s",
  "access_expires_at": "2026-10-30T13:34:23.003699727Z",
  "refresh_token": "d-QWFaayHapFDPWG59mdVYkJqoaeMlTYr2G1VNVLq7M",
  "refresh_expires_at": "2026-10-31T01:19:23.003338314Z",
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
  "session_id": "874e1a56-56b9-49a4-b6da-ff0f274ddb3c",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNjMsImlhdCI6MTc5MzM2NjM2MywianRpIjoiY2ZkZTFkMWEtZTU4Yy00MjQwLTkzNjItNTljYTk2NzQwZTY0Iiwic2lkIjoiODc0ZTFhNTYtNTZiOS00OWE0LWI2ZGEtZmYwZjI3NGRkYjNjIn0.oaKUB_mV7BLaJJTcR__y-yA1A3poPeUyxjKChN_vDy4",
  "access_expires_at": "2026-10-30T13:34:23.388047754Z",
  "refresh_token": "-WAnmfYuDJnHWEXwUZduSjHir6rX30_zuykMnEV3eqo",
  "refresh_expires_at": "2026-10-31T01:19:23.387687383Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
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

`POST /api/admin/v1/staff-extensions/f89f92c4-ec18-4004-804f-f3e2a0da9794` → **200**

```json
{
  "command_id": "d1ccc566-da2c-4026-a6de-941a98e8e470",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "8405d219-7da5-43a6-a4db-d6612f300911",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:19:24.162134Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:19:24.162134Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8765f230-857d-4508-a684-aae13c5238fd",
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
  "id": "acd57fff-8b52-48b9-9514-3908184b87ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:24.549916Z",
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
  "command_id": "678885a0-eb23-4381-aae8-c46f1b82f650",
  "quote_id": "acd57fff-8b52-48b9-9514-3908184b87ff",
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
    "phone": "+380674549050"
  }
}
```

```json
{
  "id": "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5",
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
  "created_at": "2026-10-30T13:19:24.758713Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674549050"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4d63d141-f0ce-4094-9ed8-ace76f2a4aa5/calls` → **201**

```json
{
  "command_id": "7633805d-5a92-4d67-a803-c31ef7fd4377",
  "to": "CALLER"
}
```

```json
{
  "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "order_ids": [
    "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5"
  ],
  "started_at": "2026-10-30T13:19:24.976211Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4d63d141-f0ce-4094-9ed8-ace76f2a4aa5/calls` → **201**

```json
{
  "command_id": "7633805d-5a92-4d67-a803-c31ef7fd4377",
  "to": "CALLER"
}
```

```json
{
  "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "order_ids": [
    "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5"
  ],
  "started_at": "2026-10-30T13:19:24.976211Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674549050",
    "at": "2026-10-30T13:19:24.979188655Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.9289",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4d63d141-f0ce-4094-9ed8-ace76f2a4aa5` → **200**

```json
{
  "calls": [
    {
      "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [
        "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5"
      ],
      "started_at": "2026-10-30T13:19:24.976211Z",
      "answered_at": "2026-10-30T13:19:25.453836Z",
      "ended_at": "2026-10-30T13:19:25.473196Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4d63d141-f0ce-4094-9ed8-ace76f2a4aa5` → **200**

```json
{
  "calls": [
    {
      "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [
        "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5"
      ],
      "started_at": "2026-10-30T13:19:24.976211Z",
      "answered_at": "2026-10-30T13:19:25.453836Z",
      "ended_at": "2026-10-30T13:19:25.473196Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4d63d141-f0ce-4094-9ed8-ace76f2a4aa5` → **200**

```json
{
  "calls": [
    {
      "id": "ace53abc-7f13-4b5e-8e0f-70c3d4317de9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "order_ids": [
        "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5"
      ],
      "started_at": "2026-10-30T13:19:24.976211Z",
      "answered_at": "2026-10-30T13:19:25.453836Z",
      "ended_at": "2026-10-30T13:19:25.473196Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:19:27.823857Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4d63d141-f0ce-4094-9ed8-ace76f2a4aa5` → **200**

```json
{
  "id": "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5",
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
  "created_at": "2026-10-30T13:19:24.758713Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674549050"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4d63d141-f0ce-4094-9ed8-ace76f2a4aa5/cancel` → **200**

```json
{
  "command_id": "8b3677d8-6f2f-4aa4-8e14-7dd1fe31b132",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4d63d141-f0ce-4094-9ed8-ace76f2a4aa5",
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
  "created_at": "2026-10-30T13:19:24.758713Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674549050"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
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
  "command_id": "112dbbb3-3b86-4260-9091-c8e17b68743e",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:19:30.53564Z",
  "extension": "101"
}
```

Done: outgoing call ace53abc-7f13-4b5e-8e0f-70c3d4317de9 from order 4d63d141-f0ce-4094-9ed8-ace76f2a4aa5, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638100795",
  "device_ref": "sandbox-11273"
}
```

```json
{
  "challenge_id": "50e5cf35-6dc0-4087-8413-f07ed6340225",
  "expires_at": "2026-10-30T13:24:30.743266627Z",
  "resend_available_at": "2026-10-30T13:19:31.743266627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638100795` → **200**

```json
{
  "phone": "+380638100795",
  "audience": "CLIENT",
  "code": "394183",
  "sent_at": "2026-10-30T13:19:30.745276301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50e5cf35-6dc0-4087-8413-f07ed6340225",
  "code": "394183",
  "device_ref": "sandbox-11273"
}
```

```json
{
  "session_id": "c3f09ed7-abb7-40c9-ae89-c0a4cc48e3e5",
  "subject": {
    "type": "CLIENT",
    "id": "0737298b-031d-4f38-9b02-0cd035fdbeb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzM3Mjk4Yi0wMzFkLTRmMzgtOWIwMi0wY2QwMzVmZGJlYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjcwLCJpYXQiOjE3OTMzNjYzNzAsImp0aSI6ImNmMTVhYzI2LTY2NDAtNGNhMy1iNGY2LWFhYmY4Yjk0NDY4ZSIsInNpZCI6ImMzZjA5ZWQ3LWFiYjctNDBjOS1hZTg5LWMwYTRjYzQ4ZTNlNSJ9.Pry63lh2vG_vi-0gqgIJaCSUzLxQwv2Kj28j5S59riQ",
  "access_expires_at": "2026-10-30T13:34:30.963097949Z",
  "refresh_token": "iZxLqaMSpSgnZU5WDB64ExM6Bj5pernJIzl7_lAJKSk",
  "refresh_expires_at": "2026-11-29T13:19:30.962598679Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
  "session_id": "c3f09ed7-abb7-40c9-ae89-c0a4cc48e3e5",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638100795",
  "device_ref": "sandbox-24701"
}
```

```json
{
  "challenge_id": "ce1d5f23-71bc-4341-96c7-61d59f3fb6c9",
  "expires_at": "2026-10-30T13:24:33.336555894Z",
  "resend_available_at": "2026-10-30T13:19:34.336555894Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638100795` → **200**

```json
{
  "phone": "+380638100795",
  "audience": "CLIENT",
  "code": "911723",
  "sent_at": "2026-10-30T13:19:33.339164984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce1d5f23-71bc-4341-96c7-61d59f3fb6c9",
  "code": "911723",
  "device_ref": "sandbox-24701"
}
```

```json
{
  "session_id": "e63edfbb-2348-4c3a-a6e9-4063bd3a5b3d",
  "subject": {
    "type": "CLIENT",
    "id": "0737298b-031d-4f38-9b02-0cd035fdbeb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzM3Mjk4Yi0wMzFkLTRmMzgtOWIwMi0wY2QwMzVmZGJlYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjczLCJpYXQiOjE3OTMzNjYzNzMsImp0aSI6Ijc1ODU3ODg5LTlhZTktNDc2Mi05ZWEyLThiOWRmNDk3YzNiZCIsInNpZCI6ImU2M2VkZmJiLTIzNDgtNGMzYS1hNmU5LTQwNjNiZDNhNWIzZCJ9.ResB1V3KAa70zn2G8AB_P6Fl16-fkFMuNMSQyVROkpE",
  "access_expires_at": "2026-10-30T13:34:33.54649341Z",
  "refresh_token": "HtIC_Zrsb21SxtanzafHVZtujwcpvht3dEfwmUBHU8k",
  "refresh_expires_at": "2026-11-29T13:19:33.546023789Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "b68d367b-e996-4d7e-9fa1-949956944dd4",
  "expires_at": "2026-10-30T13:24:35.733358399Z",
  "resend_available_at": "2026-10-30T13:19:36.733358399Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638100795` → **200**

```json
{
  "phone": "+380638100795",
  "audience": "CLIENT",
  "code": "698209",
  "sent_at": "2026-10-30T13:19:35.73492503Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631343381"
}
```

```json
{
  "challenge_id": "43b18857-e8e0-4449-bd37-800223c73239",
  "expires_at": "2026-10-30T13:24:35.932367701Z",
  "resend_available_at": "2026-10-30T13:19:36.932367701Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631343381` → **200**

```json
{
  "phone": "+380631343381",
  "audience": "CLIENT",
  "code": "529789",
  "sent_at": "2026-10-30T13:19:35.934014917Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d37fb114-0991-4e04-8535-d7b6cde4bf97",
  "current_challenge_id": "b68d367b-e996-4d7e-9fa1-949956944dd4",
  "current_code": "000000",
  "new_challenge_id": "43b18857-e8e0-4449-bd37-800223c73239",
  "new_code": "529789"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f509195c-e97c-48d6-86a6-5ada53af925f"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "42fa41dc-a540-4b10-a654-378da9eda060",
  "current_challenge_id": "b68d367b-e996-4d7e-9fa1-949956944dd4",
  "current_code": "698209",
  "new_challenge_id": "43b18857-e8e0-4449-bd37-800223c73239",
  "new_code": "529789"
}
```

```json
{
  "subject_id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
  "phone": "+380631343381",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
  "session_id": "c3f09ed7-abb7-40c9-ae89-c0a4cc48e3e5",
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
  "correlation_id": "bf72f32a-8129-48ac-a4a6-89a2af9eb760"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631343381",
  "device_ref": "sandbox-27614"
}
```

```json
{
  "challenge_id": "b8176d30-0450-4e23-8de3-5838e8fb542d",
  "expires_at": "2026-10-30T13:24:38.890891435Z",
  "resend_available_at": "2026-10-30T13:19:39.890891435Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631343381` → **200**

```json
{
  "phone": "+380631343381",
  "audience": "CLIENT",
  "code": "670812",
  "sent_at": "2026-10-30T13:19:38.892760282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8176d30-0450-4e23-8de3-5838e8fb542d",
  "code": "670812",
  "device_ref": "sandbox-27614"
}
```

```json
{
  "session_id": "dcbc9d86-0444-4e05-b7ad-2cae5219ce5e",
  "subject": {
    "type": "CLIENT",
    "id": "0737298b-031d-4f38-9b02-0cd035fdbeb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzM3Mjk4Yi0wMzFkLTRmMzgtOWIwMi0wY2QwMzVmZGJlYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Mjc5LCJpYXQiOjE3OTMzNjYzNzksImp0aSI6IjI3Y2M4N2NiLTIwMzktNDIyYy1hYTY0LTkzZTBiNTRiOTA2ZiIsInNpZCI6ImRjYmM5ZDg2LTA0NDQtNGUwNS1iN2FkLTJjYWU1MjE5Y2U1ZSJ9.pLW_1yynnrBOYfy7lm1Qkcrcovu4-TOLFWIVM9XXABw",
  "access_expires_at": "2026-10-30T13:34:39.108874171Z",
  "refresh_token": "_TFwIKOtJI1MHMFJqrUITNIa-q-11UH5iWE2XaXAYW4",
  "refresh_expires_at": "2026-11-29T13:19:39.108499448Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
  "session_id": "dcbc9d86-0444-4e05-b7ad-2cae5219ce5e",
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
  "session_id": "293c78f1-b1c6-4578-b765-f85f4e98f0c8",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNzksImlhdCI6MTc5MzM2NjM3OSwianRpIjoiOGY0YzAxYzItOWU1Mi00NmE2LWEzMmEtYjkyOGE3NTU5YzAwIiwic2lkIjoiMjkzYzc4ZjEtYjFjNi00NTc4LWI3NjUtZjg1ZjRlOThmMGM4In0.9Tx68r-CwN_bbG5yDWOXJfM4kqB6VvNCwjdpRZOUNWU",
  "access_expires_at": "2026-10-30T13:34:39.678304016Z",
  "refresh_token": "Dm6BP7sjwbqoJoWGQR5VY5tBORCHDQjduK7eEhJmTs4",
  "refresh_expires_at": "2026-10-31T01:19:39.677901502Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1` → **200**

```json
{
  "client": {
    "id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
    "phone": "+380631343381",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:19:30.961294Z",
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

`POST /api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1/phone/new-code` → **201**

```json
{
  "phone": "+380631245459"
}
```

```json
{
  "challenge_id": "3d99d899-9c82-49fe-bfce-27a8aeac523a",
  "expires_at": "2026-10-30T13:24:40.077700706Z",
  "resend_available_at": "2026-10-30T13:19:41.077700706Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631245459` → **200**

```json
{
  "phone": "+380631245459",
  "audience": "CLIENT",
  "code": "860911",
  "sent_at": "2026-10-30T13:19:40.079086588Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1/phone` → **422**

```json
{
  "command_id": "b4c7fe85-d875-4d6f-ab7e-104194a81e68",
  "expected_version": 3,
  "new_challenge_id": "3d99d899-9c82-49fe-bfce-27a8aeac523a",
  "new_code": "860912",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d49c2c8c-f438-4208-b420-6f677499b94e"
}
```

`POST /api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1/phone` → **400**

```json
{
  "command_id": "60f76fb4-7c14-4a49-b016-e5f28c3f21df",
  "expected_version": 3,
  "new_challenge_id": "3d99d899-9c82-49fe-bfce-27a8aeac523a",
  "new_code": "860911",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "601639c0-7fe4-4138-b33d-9019b274384f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/0737298b-031d-4f38-9b02-0cd035fdbeb1/phone` → **200**

```json
{
  "command_id": "7c3452b0-2c2d-484f-936b-46e6e9fd333d",
  "expected_version": 3,
  "new_challenge_id": "3d99d899-9c82-49fe-bfce-27a8aeac523a",
  "new_code": "860911",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
  "phone": "+380631245459",
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
  "correlation_id": "d515d58f-e08d-4753-9765-83769b6f135c"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380631245459",
  "device_ref": "sandbox-16097"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "89a598e0-11b2-4073-9f4d-ec58ca6539d9",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631245459",
  "device_ref": "sandbox-16097"
}
```

```json
{
  "challenge_id": "d58ee7b6-7926-409b-8754-5952548468a8",
  "expires_at": "2026-10-30T13:24:42.264526242Z",
  "resend_available_at": "2026-10-30T13:19:43.264526242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631245459` → **200**

```json
{
  "phone": "+380631245459",
  "audience": "CLIENT",
  "code": "326358",
  "sent_at": "2026-10-30T13:19:42.266587182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d58ee7b6-7926-409b-8754-5952548468a8",
  "code": "326358",
  "device_ref": "sandbox-16097"
}
```

```json
{
  "session_id": "36987cab-8e27-4890-93f9-6b2734e806e6",
  "subject": {
    "type": "CLIENT",
    "id": "0737298b-031d-4f38-9b02-0cd035fdbeb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzM3Mjk4Yi0wMzFkLTRmMzgtOWIwMi0wY2QwMzVmZGJlYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjgyLCJpYXQiOjE3OTMzNjYzODIsImp0aSI6ImI0OGM1NDRiLWY2MzUtNGM5YS04NThmLWE5NTRjYTI3NmRkYyIsInNpZCI6IjM2OTg3Y2FiLThlMjctNDg5MC05M2Y5LTZiMjczNGU4MDZlNiJ9.RQapxBjZUq2cOl17BTRMbGv54RLmbLOPOSc4izreDME",
  "access_expires_at": "2026-10-30T13:34:42.477598426Z",
  "refresh_token": "xqHAkALrmBi-dtzOAqlaWzHrdcPAoCqaYcC30pJDWaw",
  "refresh_expires_at": "2026-11-29T13:19:42.476998825Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0737298b-031d-4f38-9b02-0cd035fdbeb1",
  "session_id": "36987cab-8e27-4890-93f9-6b2734e806e6",
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
  "phone": "+380632799313",
  "device_ref": "sandbox-8094"
}
```

```json
{
  "challenge_id": "58092e4f-9a99-4fdb-900e-7926f673f620",
  "expires_at": "2026-10-30T13:24:42.85985413Z",
  "resend_available_at": "2026-10-30T13:19:43.85985413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632799313` → **200**

```json
{
  "phone": "+380632799313",
  "audience": "CLIENT",
  "code": "471960",
  "sent_at": "2026-10-30T13:19:42.861773374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58092e4f-9a99-4fdb-900e-7926f673f620",
  "code": "471960",
  "device_ref": "sandbox-8094"
}
```

```json
{
  "session_id": "074968f5-f20c-4e6a-98bf-cdd8025c43dc",
  "subject": {
    "type": "CLIENT",
    "id": "88896a32-53cf-4452-a4c5-1e7a1a6abac5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODg5NmEzMi01M2NmLTQ0NTItYTRjNS0xZTdhMWE2YWJhYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjgzLCJpYXQiOjE3OTMzNjYzODMsImp0aSI6ImNjMzdiNTEyLWZkM2YtNGQ0ZS1hOGZmLWM2YTgzMGUxMjI3ZCIsInNpZCI6IjA3NDk2OGY1LWYyMGMtNGU2YS05OGJmLWNkZDgwMjVjNDNkYyJ9.OBXmXUUTAxDguM5izH1_M6QdMHS1zOMDrHSi34nGFKg",
  "access_expires_at": "2026-10-30T13:34:43.08119915Z",
  "refresh_token": "a7z6OD0mzyahvHeuXLSAVBYq6hd27KiSBdjJayOM0rs",
  "refresh_expires_at": "2026-11-29T13:19:43.080858749Z",
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
  "session_id": "bb56cad6-1920-47cc-97b7-3784c4585984",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyODMsImlhdCI6MTc5MzM2NjM4MywianRpIjoiMGEyYzNjYjMtNmZmYy00ZTllLTg4MTMtZGMwYTBlZDM0NzBlIiwic2lkIjoiYmI1NmNhZDYtMTkyMC00N2NjLTk3YjctMzc4NGM0NTg1OTg0In0.OW19_zP2FqsK3PbUacsqFIyz6OGOznmyHZFYy88xFLo",
  "access_expires_at": "2026-10-30T13:34:43.858079028Z",
  "refresh_token": "wUmxKUVqgygoWilxayXYAT7cGn2hoVzP8miJPNLBtvc",
  "refresh_expires_at": "2026-10-31T01:19:43.857683373Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632799313` → **200**

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
  "correlation_id": "23d57fbd-6db1-47cf-b07b-a5ceb4410111"
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
  "session_id": "d99f9a7e-53c2-4d6c-b12f-77ffdf9c8839",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyODQsImlhdCI6MTc5MzM2NjM4NCwianRpIjoiMDJlOTJkY2ItYWZlYi00OTkyLTlhNjYtZjBlZGM5Yjg2YmM5Iiwic2lkIjoiZDk5ZjlhN2UtNTNjMi00ZDZjLWIxMmYtNzdmZmRmOWM4ODM5In0.7pRIO6_TRKbCekr74xpRxw55hvITqZO3QWZt1DL-LIM",
  "access_expires_at": "2026-10-30T13:34:44.637767772Z",
  "refresh_token": "rhKwz3YR5Sz2oR-rv6efLzOqd0pnqYCnXStV-4YT5Pc",
  "refresh_expires_at": "2026-10-31T01:19:44.637391888Z",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:16:24.004001Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "43aae0cd-3562-4ea1-b5ab-ec7c40e2dd28",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:19:45.026441967Z"
}
```

## The rider books the airport for 2026-10-30T16:19:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600517848",
  "device_ref": "sandbox-19174"
}
```

```json
{
  "challenge_id": "538be381-edc1-4b0d-9729-7351b346d05f",
  "expires_at": "2026-10-30T13:24:45.233188604Z",
  "resend_available_at": "2026-10-30T13:19:46.233188604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600517848` → **200**

```json
{
  "phone": "+48600517848",
  "audience": "CLIENT",
  "code": "499695",
  "sent_at": "2026-10-30T13:19:45.235137221Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "538be381-edc1-4b0d-9729-7351b346d05f",
  "code": "499695",
  "device_ref": "sandbox-19174"
}
```

```json
{
  "session_id": "0c5c7e20-9349-4816-83d8-64306055d8fe",
  "subject": {
    "type": "CLIENT",
    "id": "9319eb98-afba-4bc4-b5db-1e81bfabd03a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzE5ZWI5OC1hZmJhLTRiYzQtYjVkYi0xZTgxYmZhYmQwM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Mjg1LCJpYXQiOjE3OTMzNjYzODUsImp0aSI6ImU1YWQ5N2I0LWYwMzYtNGJmMi04ZDBiLTljYTA1N2E1YTM2ZCIsInNpZCI6IjBjNWM3ZTIwLTkzNDktNDgxNi04M2Q4LTY0MzA2MDU1ZDhmZSJ9.x9-wC1QrKgIuDZjRBMRIuWk6VSeiEIM7FDetvqqRtv4",
  "access_expires_at": "2026-10-30T13:34:45.449832469Z",
  "refresh_token": "bnNXRAD0ofGg_EizmYfjM45Ikw45uSmo-swsqM2flK8",
  "refresh_expires_at": "2026-11-29T13:19:45.449288121Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83177b9e-ec48-42bd-8be1-23c20a59f264",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:19:44Z"
}
```

```json
{
  "id": "aeb6c1fa-3ab2-4055-8367-380959bd2ae3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:45.641634Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:19:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7d562b31-b27f-49f2-850e-5974324b7d4a",
  "quote_id": "aeb6c1fa-3ab2-4055-8367-380959bd2ae3",
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
  "pickup_at": "2026-10-30T16:19:44Z"
}
```

```json
{
  "id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9319eb98-afba-4bc4-b5db-1e81bfabd03a",
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
  "created_at": "2026-10-30T13:19:45.846418Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:19:44Z",
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
  "device_ref": "sandbox-20729"
}
```

```json
{
  "challenge_id": "949ca38d-4f4b-43b5-800c-d6d4fd149c4f",
  "expires_at": "2026-10-30T13:24:46.051639438Z",
  "resend_available_at": "2026-10-30T13:19:47.051639438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "686951",
  "sent_at": "2026-10-30T13:19:46.053666874Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "949ca38d-4f4b-43b5-800c-d6d4fd149c4f",
  "code": "686951",
  "device_ref": "sandbox-20729"
}
```

```json
{
  "session_id": "afb599f5-9f46-4ace-872d-71174809a0ec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI4NiwiaWF0IjoxNzkzMzY2Mzg2LCJqdGkiOiI0MWQ5Y2FkMi1jOTRkLTRhZWMtOWM2My04MTQyOWUyZmFjM2UiLCJzaWQiOiJhZmI1OTlmNS05ZjQ2LTRhY2UtODcyZC03MTE3NDgwOWEwZWMifQ.tLN31KSErcB6ZefB2bVMH15ijt7eHp5SPtZXiQ2AGgY",
  "access_expires_at": "2026-10-30T13:34:46.265106063Z",
  "refresh_token": "_-S0W85yffn_SP4aPpMMi5xU4by_Uwzb2fXvmzT-HXw",
  "refresh_expires_at": "2026-11-29T13:19:46.26461157Z",
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
  "command_id": "ec8f35c5-18ec-40b6-9d84-147a262b771e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:46Z",
    "sequence": 1793366386643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f90de0b5-577c-4eb3-99b2-ee261b99dabb",
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
  "last_heartbeat_at": "2026-10-30T13:19:46.658857Z",
  "last_location_at": "2026-10-30T13:19:46.658857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
      "short_number": 25,
      "pickup_at": "2026-10-30T16:19:44Z",
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

`POST /api/driver/v1/preorders/8e1fe1b5-52d3-48d9-beb4-a9220655f08a/reserve` → **200**

```json
{
  "command_id": "af9dbd2d-e999-4ce5-8ea1-ddd4e6bf6303"
}
```

```json
{
  "id": "6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a",
  "state": "RESERVED",
  "order": {
    "order_id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
    "short_number": 25,
    "pickup_at": "2026-10-30T16:19:44Z",
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
  "reserved_at": "2026-10-30T13:19:47.03345Z",
  "confirm_from": "2026-10-30T15:49:44Z",
  "confirm_until": "2026-10-30T15:59:44Z",
  "drop_until": "2026-10-30T15:19:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a",
      "state": "RESERVED",
      "order": {
        "order_id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:19:44Z",
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
      "reserved_at": "2026-10-30T13:19:47.03345Z",
      "confirm_from": "2026-10-30T15:49:44Z",
      "confirm_until": "2026-10-30T15:59:44Z",
      "drop_until": "2026-10-30T15:19:44Z"
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
      "id": "6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a",
      "state": "RESERVED",
      "order": {
        "order_id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:19:44Z",
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
      "reserved_at": "2026-10-30T13:19:47.03345Z",
      "confirm_from": "2026-10-30T15:49:44Z",
      "confirm_until": "2026-10-30T15:59:44Z",
      "drop_until": "2026-10-30T15:19:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a/confirm` → **409**

```json
{
  "command_id": "bc6efe0c-d69b-458d-8eb3-4ee692c8de7a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f218b5b0-a611-46b2-9107-ae9a3bd8d11a"
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
  "session_id": "876bfec6-e963-46c0-a9a6-917586d2525c",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyODcsImlhdCI6MTc5MzM2NjM4NywianRpIjoiNmM4NjQzYWQtNjYzNS00MTk1LTliMDMtNGJiNGNlYmMyY2MyIiwic2lkIjoiODc2YmZlYzYtZTk2My00NmMwLWE5YTYtOTE3NTg2ZDI1MjVjIn0.T7jYZ58RXmbnrKbQTU_Pec4MGMmLrGIyf_w340J6V6M",
  "access_expires_at": "2026-10-30T13:34:47.980636322Z",
  "refresh_token": "7zX67ePTjWONaxSnRRT99USLgAx8akgxEvnS956wVYk",
  "refresh_expires_at": "2026-10-31T01:19:47.98020198Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8e1fe1b5-52d3-48d9-beb4-a9220655f08a` → **200**

```json
{
  "id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9319eb98-afba-4bc4-b5db-1e81bfabd03a",
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
  "created_at": "2026-10-30T13:19:45.846418Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:19:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:19:47.03345Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8e1fe1b5-52d3-48d9-beb4-a9220655f08a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:19:45.84719Z",
      "actor": {
        "type": "CLIENT",
        "id": "9319eb98-afba-4bc4-b5db-1e81bfabd03a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
        "preorder": true,
        "quote_id": "aeb6c1fa-3ab2-4055-8367-380959bd2ae3",
        "pickup_at": "2026-10-30T16:19:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "43aae962-b32c-4829-9e02-f2b9368a448d"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:19:47.034386Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8e1fe1b5-52d3-48d9-beb4-a9220655f08a",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a"
      },
      "correlation_id": "776f357b-41e8-44e0-b565-ce45fb800bd0"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 8e1fe1b5-52d3-48d9-beb4-a9220655f08a, reservation 6d075dcd-614a-4fe3-a0c0-bf28ef73bf8a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24389"
}
```

```json
{
  "challenge_id": "9942d3c5-6a57-4ed7-9f94-27a59b892875",
  "expires_at": "2026-10-30T13:24:48.567507431Z",
  "resend_available_at": "2026-10-30T13:19:49.567507431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "875181",
  "sent_at": "2026-10-30T13:19:48.570547041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9942d3c5-6a57-4ed7-9f94-27a59b892875",
  "code": "875181",
  "device_ref": "sandbox-24389"
}
```

```json
{
  "session_id": "ba273e00-14f8-4144-926c-ace2ba741c0c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI4OCwiaWF0IjoxNzkzMzY2Mzg4LCJqdGkiOiIxMjk2OTJiMy03ZTU0LTQxYTQtYmM4Zi04ZWVjYjMxM2UxZmYiLCJzaWQiOiJiYTI3M2UwMC0xNGY4LTQxNDQtOTI2Yy1hY2UyYmE3NDFjMGMifQ.P0G-Pz7Fb0H06lm_9-ZKQtCpWg35yPxqA98jMiPlX-Q",
  "access_expires_at": "2026-10-30T13:34:48.779952836Z",
  "refresh_token": "omGyQp0fVmUf381HTp7fSIzCuHVCgkkpmv0xM3GZLR4",
  "refresh_expires_at": "2026-11-29T13:19:48.77948439Z",
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
  "command_id": "ba5e1916-0723-4cde-bf1a-bded3ce98576",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:49Z",
    "sequence": 1793366389146
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:19:49.162806Z",
  "last_location_at": "2026-10-30T13:19:49.162806Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673158300",
  "device_ref": "sandbox-3698"
}
```

```json
{
  "challenge_id": "63c9e2dc-2f3e-4cb9-b580-5c8006a45ef0",
  "expires_at": "2026-10-30T13:24:49.349410236Z",
  "resend_available_at": "2026-10-30T13:19:50.349410236Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673158300` → **200**

```json
{
  "phone": "+380673158300",
  "audience": "CLIENT",
  "code": "526586",
  "sent_at": "2026-10-30T13:19:49.351979827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63c9e2dc-2f3e-4cb9-b580-5c8006a45ef0",
  "code": "526586",
  "device_ref": "sandbox-3698"
}
```

```json
{
  "session_id": "e7048d52-fba0-4795-90f9-bfba76dc1aab",
  "subject": {
    "type": "CLIENT",
    "id": "4e3a37bd-1040-489e-a6c2-eda83a422e16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTNhMzdiZC0xMDQwLTQ4OWUtYTZjMi1lZGE4M2E0MjJlMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Mjg5LCJpYXQiOjE3OTMzNjYzODksImp0aSI6ImE3NzdiNmQ5LWJjZTItNDgyYi04NGViLWViZjhmZTNmMjU1NCIsInNpZCI6ImU3MDQ4ZDUyLWZiYTAtNDc5NS05MGY5LWJmYmE3NmRjMWFhYiJ9.bqrv34a-PtWvk6VPp9yGJlZIu8PxSNGOOxLFdklG5IY",
  "access_expires_at": "2026-10-30T13:34:49.560830667Z",
  "refresh_token": "sjMEwOStnbbVs1NNJjSPlLkDfRdFt3cltKorVqiQikY",
  "refresh_expires_at": "2026-11-29T13:19:49.560365708Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "acfdf34e-5214-416d-b1d9-e71d4a1fc27a",
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
  "id": "9c683c36-feed-4558-99f1-0cb00ad17f35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:49.752129Z",
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
  "command_id": "15a30cdd-08cf-4706-a860-32e8557f6f35",
  "quote_id": "9c683c36-feed-4558-99f1-0cb00ad17f35",
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
  "id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4e3a37bd-1040-489e-a6c2-eda83a422e16",
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
  "created_at": "2026-10-30T13:19:49.946982Z",
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
    "id": "07e8b233-9418-4f72-bdf6-0664960d6606",
    "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
    "expires_at": "2026-10-30T13:20:04.949383Z",
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

`POST /api/driver/v1/offers/07e8b233-9418-4f72-bdf6-0664960d6606/accept` → **200**

```json
{
  "command_id": "32a01a49-0bdb-48a8-a08c-34926807884f"
}
```

```json
{
  "id": "edd91e0b-a259-4a59-96c2-355ae892cf58",
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "448fdbe7-2543-403f-82ce-5621b7d28807",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "448fdbe7-2543-403f-82ce-5621b7d28807",
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "assignment_id": "edd91e0b-a259-4a59-96c2-355ae892cf58",
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

`POST /api/driver/v1/work-sessions/c1a61dd0-1111-44c0-9fea-a2baf4b8688c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:50Z",
    "sequence": 1793366390734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:19:50.749836Z",
  "last_location_at": "2026-10-30T13:19:50.749836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "448fdbe7-2543-403f-82ce-5621b7d28807",
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "assignment_id": "edd91e0b-a259-4a59-96c2-355ae892cf58",
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

`POST /api/driver/v1/trips/448fdbe7-2543-403f-82ce-5621b7d28807/arrive` → **200**

```json
{
  "command_id": "8c0960b1-492b-4a0d-8ae5-3b704f707631",
  "expected_version": 0
}
```

```json
{
  "id": "448fdbe7-2543-403f-82ce-5621b7d28807",
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "assignment_id": "edd91e0b-a259-4a59-96c2-355ae892cf58",
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
  "arrived_at": "2026-10-30T13:19:51.116345Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/448fdbe7-2543-403f-82ce-5621b7d28807/start` → **200**

```json
{
  "command_id": "ab5e91c7-821e-4a6e-baa0-611d2fc7456a",
  "expected_version": 1
}
```

```json
{
  "id": "448fdbe7-2543-403f-82ce-5621b7d28807",
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "assignment_id": "edd91e0b-a259-4a59-96c2-355ae892cf58",
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
  "arrived_at": "2026-10-30T13:19:51.116345Z",
  "started_at": "2026-10-30T13:19:51.308266Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c1a61dd0-1111-44c0-9fea-a2baf4b8688c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:51Z",
    "sequence": 1793366391497
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:19:51.512595Z",
  "last_location_at": "2026-10-30T13:19:51.512595Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/448fdbe7-2543-403f-82ce-5621b7d28807/complete` → **200**

```json
{
  "command_id": "90ffba56-1388-4c61-a396-56d929e69e7d",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:19:51Z",
  "cash_received": true
}
```

```json
{
  "id": "448fdbe7-2543-403f-82ce-5621b7d28807",
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "assignment_id": "edd91e0b-a259-4a59-96c2-355ae892cf58",
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
  "arrived_at": "2026-10-30T13:19:51.116345Z",
  "started_at": "2026-10-30T13:19:51.308266Z",
  "completed_at": "2026-10-30T13:19:51.69736Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a/rating` → **200**

```json
{
  "command_id": "965aad99-1ea1-4025-bbc3-fa270a7ed345",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "score": 5,
  "created_at": "2026-10-30T13:19:51.906735568Z"
}
```

`POST /api/driver/v1/orders/eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a/rating` → **200**

```json
{
  "command_id": "429919fd-9080-463e-bd18-002f1be72e47",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
  "score": 4,
  "created_at": "2026-10-30T13:19:52.103610107Z"
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
  "session_id": "e7004ecb-b937-44f2-b810-f71d0ca9200f",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyOTIsImlhdCI6MTc5MzM2NjM5MiwianRpIjoiZTlkYzJjZjEtNTEyZS00ZDdkLTlkYWItODRjOGJjZTlmM2RlIiwic2lkIjoiZTcwMDRlY2ItYjkzNy00NGYyLWI4MTAtZjcxZDBjYTkyMDBmIn0.ZAH3YSZevATjNtPh46D5jzXgw36y8ONatwTL9sLgUoY",
  "access_expires_at": "2026-10-30T13:34:52.679370889Z",
  "refresh_token": "Jbh9cxeHjef6L7Bj1SANPd88maT_7FgodWrPmT4kZnY",
  "refresh_expires_at": "2026-10-31T01:19:52.679049957Z",
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
  "session_id": "4b9a8cd3-ec25-4093-a274-b0f391c6f723",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyOTMsImlhdCI6MTc5MzM2NjM5MywianRpIjoiMGZjNjVhOGEtM2E4Yi00MTVkLTk5YjAtOTcyOWRjNWIxZmUxIiwic2lkIjoiNGI5YThjZDMtZWMyNS00MDkzLWEyNzQtYjBmMzkxYzZmNzIzIn0.HVGTuis2KPloEyygu0eo0E-IYS6-ul_xJ83oPLFTZ1Q",
  "access_expires_at": "2026-10-30T13:34:53.062825287Z",
  "refresh_token": "cbipxnow7TaAasXICwOVe8O-nYrx8fUKDcbDpz-xCKY",
  "refresh_expires_at": "2026-10-31T01:19:53.06251474Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
      "author_type": "RIDER",
      "author_id": "4e3a37bd-1040-489e-a6c2-eda83a422e16",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:19:51.906736Z"
    },
    {
      "order_id": "eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "4e3a37bd-1040-489e-a6c2-eda83a422e16",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:19:52.10361Z"
    }
  ]
}
```

Done: ratings for order eec2e145-0bfe-4a88-b6a8-5e8c4cbe900a.

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
  "session_id": "64b2d08f-bdd7-4f1b-be4f-aa27def7a43b",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyOTMsImlhdCI6MTc5MzM2NjM5MywianRpIjoiMTFiNWViYzEtMzg2NS00OTkzLWIzNmUtN2FhYTA1Y2JmMjIzIiwic2lkIjoiNjRiMmQwOGYtYmRkNy00ZjFiLWJlNGYtYWEyN2RlZjdhNDNiIn0.AQk_0CtlprrPiDN3v9ZHzZRsJ7XcS7GvSHrnn6qfCs4",
  "access_expires_at": "2026-10-30T13:34:53.631970745Z",
  "refresh_token": "KVnI0-olsaUiqoKvQhS-NgOIuKYcTzQGYc_WIlM0Epw",
  "refresh_expires_at": "2026-10-31T01:19:53.631619197Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "9f5116ce-1cb0-4a57-9de4-a0cd283f1159",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "aeb718e4-10df-41f3-b039-cf396c1f164b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:53.824117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aeb718e4-10df-41f3-b039-cf396c1f164b` → **200**

```json
{
  "id": "aeb718e4-10df-41f3-b039-cf396c1f164b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:53.824117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aeb718e4-10df-41f3-b039-cf396c1f164b` → **200**

```json
{
  "id": "aeb718e4-10df-41f3-b039-cf396c1f164b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:53.824117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aeb718e4-10df-41f3-b039-cf396c1f164b` → **200**

```json
{
  "id": "aeb718e4-10df-41f3-b039-cf396c1f164b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:53.824117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aeb718e4-10df-41f3-b039-cf396c1f164b` → **200**

```json
{
  "id": "aeb718e4-10df-41f3-b039-cf396c1f164b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:53.824117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/aeb718e4-10df-41f3-b039-cf396c1f164b` → **200**

```json
{
  "id": "aeb718e4-10df-41f3-b039-cf396c1f164b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:19:53.824117Z",
  "ready_at": "2026-10-30T13:19:57.875563Z",
  "expires_at": "2026-10-31T13:19:57.875563Z"
}
```

`GET /api/admin/v1/reports/exports/aeb718e4-10df-41f3-b039-cf396c1f164b/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "59cf4727-74aa-4e17-8607-71f34ab41ca0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "176eb7ce-78bb-41c9-b439-3d3c90100813",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:58.93095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/176eb7ce-78bb-41c9-b439-3d3c90100813` → **200**

```json
{
  "id": "176eb7ce-78bb-41c9-b439-3d3c90100813",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:58.93095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/176eb7ce-78bb-41c9-b439-3d3c90100813` → **200**

```json
{
  "id": "176eb7ce-78bb-41c9-b439-3d3c90100813",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:58.93095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/176eb7ce-78bb-41c9-b439-3d3c90100813` → **200**

```json
{
  "id": "176eb7ce-78bb-41c9-b439-3d3c90100813",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:58.93095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/176eb7ce-78bb-41c9-b439-3d3c90100813` → **200**

```json
{
  "id": "176eb7ce-78bb-41c9-b439-3d3c90100813",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:19:58.93095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/176eb7ce-78bb-41c9-b439-3d3c90100813` → **200**

```json
{
  "id": "176eb7ce-78bb-41c9-b439-3d3c90100813",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:19:58.93095Z",
  "ready_at": "2026-10-30T13:20:02.88177Z",
  "expires_at": "2026-10-31T13:20:02.88177Z"
}
```

`GET /api/admin/v1/reports/exports/176eb7ce-78bb-41c9-b439-3d3c90100813/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9a3d1949-8ccf-4d68-a96c-9a762f8b1098` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9a3d1949-8ccf-4d68-a96c-9a762f8b1098",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cde58018-4a02-4df8-8ea6-e6a3929574ca"
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
  "device_ref": "sandbox-22465"
}
```

```json
{
  "challenge_id": "3c05d3dd-cc0c-4f6a-b347-2f249d18008e",
  "expires_at": "2026-10-30T13:25:04.303211663Z",
  "resend_available_at": "2026-10-30T13:20:05.303211663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "693396",
  "sent_at": "2026-10-30T13:20:04.305761777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c05d3dd-cc0c-4f6a-b347-2f249d18008e",
  "code": "693396",
  "device_ref": "sandbox-22465"
}
```

```json
{
  "session_id": "1e0e12cd-4c5c-4586-bc7e-44cc64eaa9b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMwNCwiaWF0IjoxNzkzMzY2NDA0LCJqdGkiOiI3OTU2NmUzMi0yZmU1LTQ5YTItODUwYy0wNDQyZDNjOGQ3ODQiLCJzaWQiOiIxZTBlMTJjZC00YzVjLTQ1ODYtYmM3ZS00NGNjNjRlYWE5YjcifQ.Gxrm-F_tuygAJXaB9ah8XGEF67-gvU0TFbBE3PuHZzk",
  "access_expires_at": "2026-10-30T13:35:04.551443812Z",
  "refresh_token": "M5MnLKcuBYExhjoiT-YKlrpCUCSxllNbUScFnBw1OcA",
  "refresh_expires_at": "2026-11-29T13:20:04.551115791Z",
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
  "command_id": "ade465c9-6c39-4690-8796-2bb96d821d5d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:05Z",
    "sequence": 1793366405834
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "535ba731-14c6-468a-8364-c4221e73a9fb",
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
  "last_heartbeat_at": "2026-10-30T13:20:05.098885Z",
  "last_location_at": "2026-10-30T13:20:05.098885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "128f634d-2d65-43d3-a11b-b4beda5876f2",
  "points": [
    {
      "sequence": 1793366407282,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:19:07Z"
    },
    {
      "sequence": 1793366407288,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:20:07Z"
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
  "session_id": "9bd8b467-844e-4dc1-b1ca-0919db4d5be4",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMDcsImlhdCI6MTc5MzM2NjQwNywianRpIjoiMTE2MWY4MDEtZjQ0OC00N2U1LTk3ZDMtMjQ1NGU3MzZmOTVmIiwic2lkIjoiOWJkOGI0NjctODQ0ZS00ZGMxLWIxY2EtMDkxOWRiNGQ1YmU0In0.7NwZ94j8C-j46JaT9XThpDmbdEna7RY6Btz2eFYL9Qs",
  "access_expires_at": "2026-10-30T13:35:07.702722726Z",
  "refresh_token": "hPoombc0vXaT056R0ziC4-n4ekHNZQ5lQT24ENg3pjw",
  "refresh_expires_at": "2026-10-31T01:20:07.702402645Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "9b5c91b6-1cf9-44c6-b203-0729f8a603d7",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T13:20:07Z",
        "track_point_id": "7dc7210f-a296-4dd3-8ff8-6db161832227",
        "work_session_id": "535ba731-14c6-468a-8364-c4221e73a9fb"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T13:20:07Z",
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

`POST /api/admin/v1/driver-risk-flags/9b5c91b6-1cf9-44c6-b203-0729f8a603d7/confirm` → **200**

```json
{
  "command_id": "cf7e7005-06bf-453c-8a0d-dabfbf62f871",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "9b5c91b6-1cf9-44c6-b203-0729f8a603d7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T13:20:07Z",
    "track_point_id": "7dc7210f-a296-4dd3-8ff8-6db161832227",
    "work_session_id": "535ba731-14c6-468a-8364-c4221e73a9fb"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T13:20:07Z",
  "reason": null,
  "reviewed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reviewed_at": "2026-10-30T13:20:08.281365Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/9b5c91b6-1cf9-44c6-b203-0729f8a603d7/dismiss` → **409**

```json
{
  "command_id": "7cea59ff-3d81-4220-8788-4bb97d6deb96",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/9b5c91b6-1cf9-44c6-b203-0729f8a603d7/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "13a5d74e-949d-4be1-8439-cf52fe3e4bbc"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "15f8b247-9afa-46a0-a669-5ad69a386762",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "e6384148-0237-46ad-9c5e-e934177f486b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "raised_at": "2026-10-30T13:20:08.662187Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/e6384148-0237-46ad-9c5e-e934177f486b/dismiss` → **200**

```json
{
  "command_id": "629ebb6f-8b7f-47bb-9f4a-2273716a207e",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "e6384148-0237-46ad-9c5e-e934177f486b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "raised_at": "2026-10-30T13:20:08.662187Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reviewed_at": "2026-10-30T13:20:08.862552Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "91dfce6b-1051-47b7-8023-923a1eb754b3",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "9b5c91b6-1cf9-44c6-b203-0729f8a603d7"
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
      "actor_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:20:09.060229Z"
    }
  ]
}
```

Done: flag 9b5c91b6-1cf9-44c6-b203-0729f8a603d7 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7c3eda06-a92c-498b-baae-29b5c61f0e56",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMDksImlhdCI6MTc5MzM2NjQwOSwianRpIjoiOGYwYmYwMTUtYTAwMi00NmFjLTgwOWYtYTVjNjI5ZmM5ZTllIiwic2lkIjoiN2MzZWRhMDYtYTkyYy00OThiLWJhYWUtMjliNWM2MWYwZTU2In0.PGHhW-vrvqP6_9OTugQDvZad9z4MUMoT9GSCsnNw3x0",
  "access_expires_at": "2026-10-30T13:35:09.619873403Z",
  "refresh_token": "EBw0IqkbWpYrqRK3Ckwv2666TZA6uj3Lso6L6K5tt2c",
  "refresh_expires_at": "2026-10-31T01:20:09.61949863Z",
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
      "actor_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:20:09.060229Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "536b7de4-9cc8-46b1-91a4-c6c3f210c76c",
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
  "session_id": "535ba731-14c6-468a-8364-c4221e73a9fb",
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
  "last_heartbeat_at": "2026-10-30T13:20:05.098885Z",
  "last_location_at": "2026-10-30T13:20:05.098885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/535ba731-14c6-468a-8364-c4221e73a9fb/close` → **200**

```json
{
  "command_id": "0fda18a4-26a5-46d0-a825-15f83f4d2ad0",
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
  "session_id": "92d22c43-e3f1-45a0-8a37-bc2ed8f50249",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMTAsImlhdCI6MTc5MzM2NjQxMCwianRpIjoiMWYxZTI2NTMtOWJjMy00ZWJjLTlhYTYtZTgxZTY4ZTlhODI1Iiwic2lkIjoiOTJkMjJjNDMtZTNmMS00NWEwLThhMzctYmMyZWQ4ZjUwMjQ5In0.JCpC86coipcA7_PSF_2jrDnCtqzbVVCqN348s6jSYRY",
  "access_expires_at": "2026-10-30T13:35:10.800813205Z",
  "refresh_token": "Avu4rR2t8XIgS7zHwkAV5J-ODadHyGhAEDLJifpGhQA",
  "refresh_expires_at": "2026-10-31T01:20:10.800395313Z",
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
  "command_id": "42bc4a9d-7e12-462b-9e0a-0bbf616ed374",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:20:11.188071Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "42bc4a9d-7e12-462b-9e0a-0bbf616ed374",
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
  "changed_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:20:11.188071Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48412607631",
  "device_ref": "sandbox-15419"
}
```

```json
{
  "challenge_id": "1f2b004c-9e5c-4c72-bbbc-85580ff5b7df",
  "expires_at": "2026-10-30T13:25:11.585181716Z",
  "resend_available_at": "2026-10-30T13:20:12.585181716Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48412607631` → **200**

```json
{
  "phone": "+48412607631",
  "audience": "CLIENT",
  "code": "990568",
  "sent_at": "2026-10-30T13:20:11.587644972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f2b004c-9e5c-4c72-bbbc-85580ff5b7df",
  "code": "990568",
  "device_ref": "sandbox-15419"
}
```

```json
{
  "session_id": "ed3344c9-86ba-43c9-a1be-241fb5da7d99",
  "subject": {
    "type": "CLIENT",
    "id": "976f9934-27fd-4c95-af00-1a3e61662be9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzZmOTkzNC0yN2ZkLTRjOTUtYWYwMC0xYTNlNjE2NjJiZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzExLCJpYXQiOjE3OTMzNjY0MTEsImp0aSI6IjRmYmQxOGNkLTcwZWQtNDgzZS1iNjYyLTlmNjc3NjE3ZDViMyIsInNpZCI6ImVkMzM0NGM5LTg2YmEtNDNjOS1hMWJlLTI0MWZiNWRhN2Q5OSJ9.HczdQGonopUZTdrJvdiAapXyajxd_z5B29XByGswLMo",
  "access_expires_at": "2026-10-30T13:35:11.862632321Z",
  "refresh_token": "RBYYAAa56niursRP9_Y3l-qnUAbQJ2NXVn5OGee9fCU",
  "refresh_expires_at": "2026-11-29T13:20:11.862291639Z",
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
  "correlation_id": "e6f93e60-5c45-4eab-bbba-cd1def027df1"
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
  "device_ref": "sandbox-19066"
}
```

```json
{
  "challenge_id": "51e1b7ca-51b0-4b2d-baa8-0de20c8fb1ab",
  "expires_at": "2026-10-30T13:25:12.415037996Z",
  "resend_available_at": "2026-10-30T13:20:13.415037996Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "880349",
  "sent_at": "2026-10-30T13:20:12.417028355Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51e1b7ca-51b0-4b2d-baa8-0de20c8fb1ab",
  "code": "880349",
  "device_ref": "sandbox-19066"
}
```

```json
{
  "session_id": "0262eb7b-4353-4da7-bc77-d718e194baf9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMxMiwiaWF0IjoxNzkzMzY2NDEyLCJqdGkiOiI2ZGI5Njk1ZS1iZTRhLTRjOGEtYjRhYi1lYWUyYjZhY2VlYjQiLCJzaWQiOiIwMjYyZWI3Yi00MzUzLTRkYTctYmM3Ny1kNzE4ZTE5NGJhZjkifQ.Tu0BAle2Jm8J2IClbueTUYrY4rhfoAfg1Auazf0iLZE",
  "access_expires_at": "2026-10-30T13:35:12.627452482Z",
  "refresh_token": "n5159TgBA6Tzro_8bY9oG5BeoRzq9bBqFHK2D6_TtFs",
  "refresh_expires_at": "2026-11-29T13:20:12.627109957Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f90de0b5-577c-4eb3-99b2-ee261b99dabb",
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
  "last_heartbeat_at": "2026-10-30T13:19:46.658857Z",
  "last_location_at": "2026-10-30T13:19:46.658857Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f90de0b5-577c-4eb3-99b2-ee261b99dabb/handover` → **200**

```json
{
  "command_id": "a0cdef75-b56d-4640-a8ee-09c9a8fdf5cf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f90de0b5-577c-4eb3-99b2-ee261b99dabb",
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
  "last_heartbeat_at": "2026-10-30T13:19:46.658857Z",
  "last_location_at": "2026-10-30T13:19:46.658857Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f90de0b5-577c-4eb3-99b2-ee261b99dabb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:13Z",
    "sequence": 1793366413189
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f90de0b5-577c-4eb3-99b2-ee261b99dabb",
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
  "last_heartbeat_at": "2026-10-30T13:20:13.20424Z",
  "last_location_at": "2026-10-30T13:20:13.20424Z",
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
  "session_id": "f90de0b5-577c-4eb3-99b2-ee261b99dabb",
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
  "last_heartbeat_at": "2026-10-30T13:20:13.20424Z",
  "last_location_at": "2026-10-30T13:20:13.20424Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f90de0b5-577c-4eb3-99b2-ee261b99dabb/close` → **200**

```json
{
  "command_id": "23be3b03-b70b-4166-82d4-83371c09e789",
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
  "correlation_id": "40e27ec8-2cbb-4574-a331-e16cad465239"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676025634",
  "device_ref": "sandbox-8043"
}
```

```json
{
  "challenge_id": "ee3ab77f-e7a9-4fe2-81a7-985a0ec45d30",
  "expires_at": "2026-10-30T13:25:14.144843823Z",
  "resend_available_at": "2026-10-30T13:20:15.144843823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676025634` → **200**

```json
{
  "phone": "+380676025634",
  "audience": "CLIENT",
  "code": "462565",
  "sent_at": "2026-10-30T13:20:14.146851691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee3ab77f-e7a9-4fe2-81a7-985a0ec45d30",
  "code": "462565",
  "device_ref": "sandbox-8043"
}
```

```json
{
  "session_id": "84ada819-49ae-46b2-a26e-39bb7f8986f8",
  "subject": {
    "type": "CLIENT",
    "id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2MyMzBiNy0zNTBhLTRjOTgtYWMwYS1lYzJjZGJkYzA3ZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzE0LCJpYXQiOjE3OTMzNjY0MTQsImp0aSI6Ijg2ZjY2NzEzLThjMDMtNGNmMi1hZTY1LWQ1NjBkMGYzODZjZiIsInNpZCI6Ijg0YWRhODE5LTQ5YWUtNDZiMi1hMjZlLTM5YmI3Zjg5ODZmOCJ9.YG57ltmXUBMgryU5GAXaRdELXyNdUt6N0S8i8QdQiC8",
  "access_expires_at": "2026-10-30T13:35:14.351573811Z",
  "refresh_token": "H79bjSD0RHI55BX-iLVU2KQCPP44p1F_5WFz6LxGgQ0",
  "refresh_expires_at": "2026-11-29T13:20:14.351274992Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "7e25e3e0-457e-40c7-9744-3a5ef0392235",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "59696d4a-5ef1-43bf-82b1-d43cef7d0676",
  "upload_path": "/api/rider/v1/uploads/59696d4a-5ef1-43bf-82b1-d43cef7d0676",
  "expires_at": "2026-10-30T13:35:14.548339502Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/59696d4a-5ef1-43bf-82b1-d43cef7d0676` → **200**

```json
{
  "file_id": "59696d4a-5ef1-43bf-82b1-d43cef7d0676",
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
  "command_id": "02ace533-89de-46a1-bf57-a785f1d493bf",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "caa1ab14-8e61-452f-a800-8f0b6925baa7",
  "upload_path": "/api/rider/v1/uploads/caa1ab14-8e61-452f-a800-8f0b6925baa7",
  "expires_at": "2026-10-30T13:35:14.763009866Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/caa1ab14-8e61-452f-a800-8f0b6925baa7` → **200**

```json
{
  "file_id": "caa1ab14-8e61-452f-a800-8f0b6925baa7",
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
  "command_id": "8b38ddaf-1799-4ffd-a956-9aa5d61e6690",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
  "upload_path": "/api/rider/v1/uploads/88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
  "expires_at": "2026-10-30T13:35:14.970380126Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/88838dcc-4afa-4a2c-8cd1-8d705f2847c6` → **200**

```json
{
  "file_id": "88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3768aca1-66c4-437b-8bc1-26bba0cd5990",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "88838dcc-4afa-4a2c-8cd1-8d705f2847c6"
  ]
}
```

```json
{
  "id": "e078b8aa-53ff-46b0-aa05-18bfdaa6e15a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:20:15.184505Z",
  "updated_at": "2026-10-30T13:20:15.184505Z",
  "respond_by": "2026-10-30T17:20:15.184505Z",
  "messages": [
    {
      "id": "f8a9b949-2baa-4034-80c9-d68985ab862a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:20:15.185301Z",
      "attachments": [
        {
          "file_id": "88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
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
  "session_id": "b10d03b2-dd67-4fa8-bd6f-36d17fcebe57",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMTUsImlhdCI6MTc5MzM2NjQxNSwianRpIjoiYWM1MmU0MjAtY2QwOS00MTA0LTg0ZTUtZTRjMWIwMTNjMGE5Iiwic2lkIjoiYjEwZDAzYjItZGQ2Ny00ZmE4LWJkNmYtMzZkMTdmY2ViZTU3In0.4Cgep2wdHUoDVAiM9o9Hplkb-Q0gQ89drfMV4b9ZXeQ",
  "access_expires_at": "2026-10-30T13:35:15.59612804Z",
  "refresh_token": "1KkQrh-J_sRa85jbUfSK_9_b8q_YFsHUKuvrrxKdyac",
  "refresh_expires_at": "2026-10-31T01:20:15.595779447Z",
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
  "session_id": "de850b22-0410-4898-bc04-025c5c13b41c",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMTUsImlhdCI6MTc5MzM2NjQxNSwianRpIjoiZTY2MTA2OGYtMGQxYi00ZTY1LTlhY2YtYjhmMmNmZGJiMDJjIiwic2lkIjoiZGU4NTBiMjItMDQxMC00ODk4LWJjMDQtMDI1YzVjMTNiNDFjIn0.bOAxtRiKxiPBvlGoS63s50t9ZK9o_mjxdjcnJIhbByc",
  "access_expires_at": "2026-10-30T13:35:15.980330792Z",
  "refresh_token": "qeuC9KwJTJmrANKFi8KlO4kFfc4Gs-dZ18ut9NoiVdY",
  "refresh_expires_at": "2026-10-31T01:20:15.979978533Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/e078b8aa-53ff-46b0-aa05-18bfdaa6e15a/attachments/88838dcc-4afa-4a2c-8cd1-8d705f2847c6` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "7db38f6a-ca24-40e8-88dd-325db9525aff",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b1fb3cfe-ae22-4248-a231-24722d7bbcfb",
  "upload_path": "/api/operator/v1/uploads/b1fb3cfe-ae22-4248-a231-24722d7bbcfb",
  "expires_at": "2026-10-30T13:35:16.187571962Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b1fb3cfe-ae22-4248-a231-24722d7bbcfb` → **200**

```json
{
  "file_id": "b1fb3cfe-ae22-4248-a231-24722d7bbcfb",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/e078b8aa-53ff-46b0-aa05-18bfdaa6e15a` → **200**

```json
{
  "id": "e078b8aa-53ff-46b0-aa05-18bfdaa6e15a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:20:15.184505Z",
  "updated_at": "2026-10-30T13:20:15.184505Z",
  "respond_by": "2026-10-30T17:20:15.184505Z",
  "messages": [
    {
      "id": "f8a9b949-2baa-4034-80c9-d68985ab862a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:20:15.185301Z",
      "attachments": [
        {
          "file_id": "88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/e078b8aa-53ff-46b0-aa05-18bfdaa6e15a/comments` → **200**

```json
{
  "command_id": "89e8e153-8c5f-4ad6-8719-b631204fc659",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b1fb3cfe-ae22-4248-a231-24722d7bbcfb"
  ]
}
```

```json
{
  "id": "e078b8aa-53ff-46b0-aa05-18bfdaa6e15a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:20:15.184505Z",
  "updated_at": "2026-10-30T13:20:16.605302Z",
  "respond_by": "2026-10-30T17:20:15.184505Z",
  "messages": [
    {
      "id": "f8a9b949-2baa-4034-80c9-d68985ab862a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:20:15.185301Z",
      "attachments": [
        {
          "file_id": "88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "507594fd-4913-400e-ba8d-2698edea2eab",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:20:16.604851Z",
      "attachments": [
        {
          "file_id": "b1fb3cfe-ae22-4248-a231-24722d7bbcfb",
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

`GET /api/rider/v1/support/cases/e078b8aa-53ff-46b0-aa05-18bfdaa6e15a` → **200**

```json
{
  "id": "e078b8aa-53ff-46b0-aa05-18bfdaa6e15a",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:20:15.184505Z",
  "updated_at": "2026-10-30T13:20:16.605302Z",
  "respond_by": "2026-10-30T17:20:15.184505Z",
  "messages": [
    {
      "id": "f8a9b949-2baa-4034-80c9-d68985ab862a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "73c230b7-350a-4c98-ac0a-ec2cdbdc07d0",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:20:15.185301Z",
      "attachments": [
        {
          "file_id": "88838dcc-4afa-4a2c-8cd1-8d705f2847c6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "507594fd-4913-400e-ba8d-2698edea2eab",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:20:16.604851Z",
      "attachments": [
        {
          "file_id": "b1fb3cfe-ae22-4248-a231-24722d7bbcfb",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/e078b8aa-53ff-46b0-aa05-18bfdaa6e15a/attachments/b1fb3cfe-ae22-4248-a231-24722d7bbcfb` → **200**

Done: support case e078b8aa-53ff-46b0-aa05-18bfdaa6e15a, rider attachment 88838dcc-4afa-4a2c-8cd1-8d705f2847c6, operator attachment b1fb3cfe-ae22-4248-a231-24722d7bbcfb.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739214405",
  "device_ref": "sandbox-6826"
}
```

```json
{
  "challenge_id": "695a0d7d-f3f6-43c7-a457-f01a56ec7b69",
  "expires_at": "2026-10-30T13:25:17.00430746Z",
  "resend_available_at": "2026-10-30T13:20:18.00430746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739214405` → **200**

```json
{
  "phone": "+380739214405",
  "audience": "CLIENT",
  "code": "781712",
  "sent_at": "2026-10-30T13:20:17.006302287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "695a0d7d-f3f6-43c7-a457-f01a56ec7b69",
  "code": "781712",
  "device_ref": "sandbox-6826"
}
```

```json
{
  "session_id": "5ba0f942-ee4c-406d-8b32-345511d1db82",
  "subject": {
    "type": "CLIENT",
    "id": "db3b9d00-5305-4da3-8231-63183ae91e53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjNiOWQwMC01MzA1LTRkYTMtODIzMS02MzE4M2FlOTFlNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzE3LCJpYXQiOjE3OTMzNjY0MTcsImp0aSI6IjBjMGRhMGFkLWQxOWYtNDBhYy1iMjIyLTFiMzk1ZjhjNWFiNSIsInNpZCI6IjViYTBmOTQyLWVlNGMtNDA2ZC04YjMyLTM0NTUxMWQxZGI4MiJ9.0cyN5fuOctf4K8gjUUsoBmql7WQyKK8ZeuDSrbgcaOg",
  "access_expires_at": "2026-10-30T13:35:17.214131496Z",
  "refresh_token": "wwdPpQo5p74memNbuXezJQAV2I4Z_oWERiQJYdWUKQY",
  "refresh_expires_at": "2026-11-29T13:20:17.213724184Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c2286283-cd95-4468-850d-198552bf1d46",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6c383af0-e57c-4287-a62e-1187a809d2cb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6c383af0-e57c-4287-a62e-1187a809d2cb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9522006165d919944619ba9dcbf7fa0f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6c383af0-e57c-4287-a62e-1187a809d2cb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739214405"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6c383af0-e57c-4287-a62e-1187a809d2cb",
  "expires_at": "2026-10-30T13:50:17.403473Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/6c383af0-e57c-4287-a62e-1187a809d2cb` → **200**

```json
{
  "id": "6c383af0-e57c-4287-a62e-1187a809d2cb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:50:17.403473Z",
  "card": {
    "id": "a0f2c6cf-e327-42cc-9ea0-77fb5de24a12",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4108",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:20:17.586268Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "413ee4d7-368e-4d6d-8e05-e235501b2a49",
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
  "id": "92267cdb-0c7a-4d66-8d57-0d2952444948",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:17.792339Z",
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
  "command_id": "67fba85a-8db7-477e-bc4d-c267d61d9cf8",
  "quote_id": "92267cdb-0c7a-4d66-8d57-0d2952444948",
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
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2` → **200**

```json
{
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2` → **200**

```json
{
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
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

`GET /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2` → **200**

```json
{
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2/switch-to-cash` → **200**

```json
{
  "command_id": "bb5c53b1-38ba-4384-ac11-e14028dbe776",
  "expected_version": 3
}
```

```json
{
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2/switch-to-cash` → **409**

```json
{
  "command_id": "671dc57f-bbaf-4cc9-9a66-65c5b16de0c6",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "590f8ec1-5e8a-4840-bd9d-b84ba12d5d92"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2` → **200**

```json
{
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7848562e-6a09-4c22-ba5d-a5626710d5d2/cancel` → **200**

```json
{
  "command_id": "d6dae0e6-02d5-4e3c-a1bf-25d10cb86adf",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7848562e-6a09-4c22-ba5d-a5626710d5d2",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "db3b9d00-5305-4da3-8231-63183ae91e53",
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
  "created_at": "2026-10-30T13:20:17.992843Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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
  "session_id": "b34eac60-37a7-45ee-b144-d80c59adf67c",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMjAsImlhdCI6MTc5MzM2NjQyMCwianRpIjoiM2VlMWFlMjUtNDk2ZC00OGFiLTliMDYtNGI2YjhhNDYzNzE4Iiwic2lkIjoiYjM0ZWFjNjAtMzdhNy00NWVlLWIxNDQtZDgwYzU5YWRmNjdjIn0.uF37PBkXRIw3Yvi8rYWRqysoxLr3KgE1u5Isd4lW5nc",
  "access_expires_at": "2026-10-30T13:35:20.752974061Z",
  "refresh_token": "rmtiDFgP5UuRL0cFuXTzHgsZUuIQrcmfkFjwUaPZVb8",
  "refresh_expires_at": "2026-10-31T01:20:20.752615392Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28719"
}
```

```json
{
  "challenge_id": "0cc12bbb-1226-4130-9f78-87cca58bd22b",
  "expires_at": "2026-10-30T13:25:20.941484534Z",
  "resend_available_at": "2026-10-30T13:20:21.941484534Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "475244",
  "sent_at": "2026-10-30T13:20:20.943440423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cc12bbb-1226-4130-9f78-87cca58bd22b",
  "code": "475244",
  "device_ref": "sandbox-28719"
}
```

```json
{
  "session_id": "55bfaa77-18b5-40c5-b8cb-33e90873f2a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMyMSwiaWF0IjoxNzkzMzY2NDIxLCJqdGkiOiIzYTc5MDcyYi01ZDUyLTQ4N2QtODA5OC1lNjM5MDVmMGU4MGMiLCJzaWQiOiI1NWJmYWE3Ny0xOGI1LTQwYzUtYjhjYi0zM2U5MDg3M2YyYTMifQ._bqtofBYtZCjdxH5cNqZPYtq4Rxm9BFtwHioRLRCAOI",
  "access_expires_at": "2026-10-30T13:35:21.148573317Z",
  "refresh_token": "HmP7q8NWeJsqtNg4ROYJ-VrR1dXP9MGddvsE-Ou2yu4",
  "refresh_expires_at": "2026-11-29T13:20:21.148204353Z",
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
      "actor_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:20:09.060229Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T13:20:09.997287Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "53d6e5f2-e47a-4e89-944a-0b2aa2eec345",
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
  "device_ref": "sandbox-23250"
}
```

```json
{
  "challenge_id": "641ffea8-0968-46c7-87df-f18565f9e967",
  "expires_at": "2026-10-30T13:25:21.907815157Z",
  "resend_available_at": "2026-10-30T13:20:22.907815157Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "061909",
  "sent_at": "2026-10-30T13:20:21.909801051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "641ffea8-0968-46c7-87df-f18565f9e967",
  "code": "061909",
  "device_ref": "sandbox-23250"
}
```

```json
{
  "session_id": "3662ce34-2e31-4346-8d9d-4847c869f378",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMyMiwiaWF0IjoxNzkzMzY2NDIyLCJqdGkiOiI0Nzc0ZjM3NC0zY2I3LTQ4ODktOWRkMC1kZGM3OGI5MTBlZjMiLCJzaWQiOiIzNjYyY2UzNC0yZTMxLTQzNDYtOGQ5ZC00ODQ3Yzg2OWYzNzgifQ.Qj05V0koaNRnYS7qfI53et4J-78NpsTKdOW8UeYGcmc",
  "access_expires_at": "2026-10-30T13:35:22.121664224Z",
  "refresh_token": "oPY1L5FBytcS5B12gLGhzew0bzIrKX8N2MaUQh8oYl0",
  "refresh_expires_at": "2026-11-29T13:20:22.121322831Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:19:51.512595Z",
  "last_location_at": "2026-10-30T13:19:51.512595Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c1a61dd0-1111-44c0-9fea-a2baf4b8688c/handover` → **200**

```json
{
  "command_id": "ab37227b-71ca-4f42-9b73-b9ad3f727dea",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:19:51.512595Z",
  "last_location_at": "2026-10-30T13:19:51.512595Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c1a61dd0-1111-44c0-9fea-a2baf4b8688c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:22Z",
    "sequence": 1793366422704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:20:22.719812Z",
  "last_location_at": "2026-10-30T13:20:22.719812Z",
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
  "command_id": "9a36a482-4a39-4bb4-800a-46ebf95496f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:23Z",
    "sequence": 1793366423922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "39972dfc-2a16-4413-9d7e-e6fbff4ad3a6",
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
  "last_heartbeat_at": "2026-10-30T13:20:23.110008Z",
  "last_location_at": "2026-10-30T13:20:23.110008Z",
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
  "session_id": "91bd8e8d-3eb8-4bfb-a12b-c66e41276e6a",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMjMsImlhdCI6MTc5MzM2NjQyMywianRpIjoiMTExMWVhOWMtOTkzOS00ZWI4LWJjNTktNjA1ZTQ4Mjc0NGE4Iiwic2lkIjoiOTFiZDhlOGQtM2ViOC00YmZiLWExMmItYzY2ZTQxMjc2ZTZhIn0.68MFI_ijTaVNvhJsb_GgYyath_vlWEGBxGFo917wRv0",
  "access_expires_at": "2026-10-30T13:35:23.50260273Z",
  "refresh_token": "HgnMtxqAxVyccLXkyep3QqJYNXT_TII95NFogtH14hw",
  "refresh_expires_at": "2026-10-31T01:20:23.502238332Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9ca053e3-b69f-4d27-975c-228b214f32c0",
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
  "id": "8e455e08-0e4e-489c-9dc7-20a0ef59e2cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:23.692063Z",
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
  "command_id": "cbb4aa08-f71c-4a6d-bf30-a997277b84f9",
  "quote_id": "8e455e08-0e4e-489c-9dc7-20a0ef59e2cc",
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
  "id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
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
  "created_at": "2026-10-30T13:20:23.889037Z",
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
    "id": "16245e04-e40d-4717-a276-caae160172ec",
    "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
    "expires_at": "2026-10-30T13:20:38.891999Z",
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

`POST /api/driver/v1/offers/16245e04-e40d-4717-a276-caae160172ec/accept` → **200**

```json
{
  "command_id": "4eb48da0-0e1b-43fb-929a-4fc49a585da5"
}
```

```json
{
  "id": "157fe7b9-3835-4e52-b55c-34273695bdd4",
  "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1549c777-182e-485a-927d-4d7a881f7a8e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1549c777-182e-485a-927d-4d7a881f7a8e",
  "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
  "assignment_id": "157fe7b9-3835-4e52-b55c-34273695bdd4",
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

`POST /api/driver/v1/work-sessions/39972dfc-2a16-4413-9d7e-e6fbff4ad3a6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:24Z",
    "sequence": 1793366424822
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "39972dfc-2a16-4413-9d7e-e6fbff4ad3a6",
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
  "last_heartbeat_at": "2026-10-30T13:20:24.836612Z",
  "last_location_at": "2026-10-30T13:20:24.836612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1549c777-182e-485a-927d-4d7a881f7a8e/arrive` → **200**

```json
{
  "command_id": "67005b69-425f-4c8a-ab88-3002e02dbd25",
  "expected_version": 0
}
```

```json
{
  "id": "1549c777-182e-485a-927d-4d7a881f7a8e",
  "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
  "assignment_id": "157fe7b9-3835-4e52-b55c-34273695bdd4",
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
  "arrived_at": "2026-10-30T13:20:25.033626Z",
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

`POST /api/driver/v1/trips/1549c777-182e-485a-927d-4d7a881f7a8e/start` → **200**

```json
{
  "command_id": "87418cf1-6557-4242-b11e-1cdcf7d40975",
  "expected_version": 1
}
```

```json
{
  "id": "1549c777-182e-485a-927d-4d7a881f7a8e",
  "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
  "assignment_id": "157fe7b9-3835-4e52-b55c-34273695bdd4",
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
  "arrived_at": "2026-10-30T13:20:25.033626Z",
  "started_at": "2026-10-30T13:20:25.23603Z",
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

`POST /api/driver/v1/trips/1549c777-182e-485a-927d-4d7a881f7a8e/complete` → **200**

```json
{
  "command_id": "0ee974d1-9ee3-4ab4-9329-a181ce9e4157",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:25Z",
  "cash_received": true
}
```

```json
{
  "id": "1549c777-182e-485a-927d-4d7a881f7a8e",
  "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
  "assignment_id": "157fe7b9-3835-4e52-b55c-34273695bdd4",
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
  "arrived_at": "2026-10-30T13:20:25.033626Z",
  "started_at": "2026-10-30T13:20:25.23603Z",
  "completed_at": "2026-10-30T13:20:25.44292Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/08bfb114-423f-46f3-81f2-2f0de9ce8d4f` → **200**

```json
{
  "id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
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
    "id": "157fe7b9-3835-4e52-b55c-34273695bdd4",
    "order_id": "08bfb114-423f-46f3-81f2-2f0de9ce8d4f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1549c777-182e-485a-927d-4d7a881f7a8e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:20:23.889037Z",
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
  "session_id": "c1a61dd0-1111-44c0-9fea-a2baf4b8688c",
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
  "last_heartbeat_at": "2026-10-30T13:20:22.719812Z",
  "last_location_at": "2026-10-30T13:20:22.719812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c1a61dd0-1111-44c0-9fea-a2baf4b8688c/close` → **200**

```json
{
  "command_id": "847e2b64-b5cf-44ad-8844-aeeee9ebcfd9",
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
  "session_id": "39972dfc-2a16-4413-9d7e-e6fbff4ad3a6",
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
  "last_heartbeat_at": "2026-10-30T13:20:24.836612Z",
  "last_location_at": "2026-10-30T13:20:24.836612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/39972dfc-2a16-4413-9d7e-e6fbff4ad3a6/close` → **200**

```json
{
  "command_id": "929ceecd-f0e1-467e-8f79-d72b7abf703a",
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

Done: terminal order 08bfb114-423f-46f3-81f2-2f0de9ce8d4f by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29682"
}
```

```json
{
  "challenge_id": "ea40269e-6cc8-465d-b643-b0fe5ef62681",
  "expires_at": "2026-10-30T13:25:29.81528728Z",
  "resend_available_at": "2026-10-30T13:20:30.81528728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "242394",
  "sent_at": "2026-10-30T13:20:29.817950961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea40269e-6cc8-465d-b643-b0fe5ef62681",
  "code": "242394",
  "device_ref": "sandbox-29682"
}
```

```json
{
  "session_id": "f39f7e77-83f3-45bf-8412-7aab3d860af1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMzMCwiaWF0IjoxNzkzMzY2NDMwLCJqdGkiOiIxMDk5Zjg4My1jNGUxLTRlYjQtODk3ZS02MWFiZGNlNDc1OWUiLCJzaWQiOiJmMzlmN2U3Ny04M2YzLTQ1YmYtODQxMi03YWFiM2Q4NjBhZjEifQ.ZnJSqYu-RIp8XvuGS7cGA7k47H6eLLWKKjRvF4Kgx4s",
  "access_expires_at": "2026-10-30T13:35:30.015658547Z",
  "refresh_token": "hfb7fYL5jqQBU1-gsP5tezYEk1FEBsdctCMdwTvYs78",
  "refresh_expires_at": "2026-11-29T13:20:30.015150748Z",
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
  "device_ref": "sandbox-21935"
}
```

```json
{
  "challenge_id": "bcd52fbf-4a71-4b4a-abd1-448f50644ce3",
  "expires_at": "2026-10-30T13:25:30.389796224Z",
  "resend_available_at": "2026-10-30T13:20:31.389796224Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "247507",
  "sent_at": "2026-10-30T13:20:30.391986905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcd52fbf-4a71-4b4a-abd1-448f50644ce3",
  "code": "247507",
  "device_ref": "sandbox-21935"
}
```

```json
{
  "session_id": "19e32038-322e-4b4c-8714-a9059af20720",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMzMCwiaWF0IjoxNzkzMzY2NDMwLCJqdGkiOiJmODg5NWZlZS1jOTA4LTQwZDctYTgwMS02YzAwNWQ5MzgyMGQiLCJzaWQiOiIxOWUzMjAzOC0zMjJlLTRiNGMtODcxNC1hOTA1OWFmMjA3MjAifQ.Ce5fMsM4xrcopfzOOlYzyXAEaR49YWf3E2pjvNuCrGE",
  "access_expires_at": "2026-10-30T13:35:30.604190492Z",
  "refresh_token": "LDZHUkeN_0zxPxKcPRt-XapmYWWf4tePgFque09NFSU",
  "refresh_expires_at": "2026-11-29T13:20:30.603725304Z",
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
  "device_ref": "sandbox-29742"
}
```

```json
{
  "challenge_id": "dd621d5b-0d70-4362-9ed5-86b7591c52d0",
  "expires_at": "2026-10-30T13:25:30.985603559Z",
  "resend_available_at": "2026-10-30T13:20:31.985603559Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "620984",
  "sent_at": "2026-10-30T13:20:30.988031845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd621d5b-0d70-4362-9ed5-86b7591c52d0",
  "code": "620984",
  "device_ref": "sandbox-29742"
}
```

```json
{
  "session_id": "0baf2e62-598f-4689-b054-c3bf678e6506",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMzMSwiaWF0IjoxNzkzMzY2NDMxLCJqdGkiOiJlOWM5ZDJlMC1hMjNjLTQ2YmYtYmQzMC0xMGU2MjlkOGM4YmIiLCJzaWQiOiIwYmFmMmU2Mi01OThmLTQ2ODktYjA1NC1jM2JmNjc4ZTY1MDYifQ.rKHtWTyjy9P9NQ6iEOKEPBnTbe_ADCCKed_ZhYWaAqQ",
  "access_expires_at": "2026-10-30T13:35:31.197097804Z",
  "refresh_token": "GanB31-P1mVlmQrP9QCOITWuR6dlyNy-WkaOhScF7WU",
  "refresh_expires_at": "2026-11-29T13:20:31.196517962Z",
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
  "phone": "+380691614494",
  "device_ref": "sandbox-2809"
}
```

```json
{
  "challenge_id": "510c8608-55d9-40cc-8759-a37262ba6075",
  "expires_at": "2026-10-30T13:25:31.601357518Z",
  "resend_available_at": "2026-10-30T13:20:32.601357518Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691614494` → **200**

```json
{
  "phone": "+380691614494",
  "audience": "CLIENT",
  "code": "041426",
  "sent_at": "2026-10-30T13:20:31.603489896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "510c8608-55d9-40cc-8759-a37262ba6075",
  "code": "041426",
  "device_ref": "sandbox-2809"
}
```

```json
{
  "session_id": "dd4f6214-4257-40ad-833b-d961aff09d07",
  "subject": {
    "type": "CLIENT",
    "id": "c350e7e0-1c53-415d-97de-02722e387509"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzUwZTdlMC0xYzUzLTQxNWQtOTdkZS0wMjcyMmUzODc1MDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzMxLCJpYXQiOjE3OTMzNjY0MzEsImp0aSI6ImQ2MzUyM2ZhLWEyZWItNDE0NC04MDY2LTg3MTc5MTFkODFmNiIsInNpZCI6ImRkNGY2MjE0LTQyNTctNDBhZC04MzNiLWQ5NjFhZmYwOWQwNyJ9.TQROcsZ521wS_daAGEr23XrobnTrMnYaA2BO04ly0_w",
  "access_expires_at": "2026-10-30T13:35:31.807989613Z",
  "refresh_token": "ecclOADUr2KSy4GzEMckEJbFgTq3z0rK7pkh3av12nA",
  "refresh_expires_at": "2026-11-29T13:20:31.807605006Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2a12086f-f3eb-4bbb-9a30-c369b72ec6d5",
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
  "id": "6cfd3142-d2c9-4ea2-a8ef-44bf5d3cc434",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:31.990947Z",
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
  "command_id": "25bd5102-9637-44da-bc2e-686a67899bf0",
  "quote_id": "6cfd3142-d2c9-4ea2-a8ef-44bf5d3cc434",
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
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:20:32.189666Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:20:32.189666Z",
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
  "blizz_dispatch_excluded_total": 11,
  "blizz_sms_sent_total": 76
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 7.956920762
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 10.493829639
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.112359311
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 69.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/291696d1-b944-4b2a-9ce8-d4e8b6d59c4c` → **200**

```json
{
  "id": "291696d1-b944-4b2a-9ce8-d4e8b6d59c4c",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c350e7e0-1c53-415d-97de-02722e387509",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:20:32.189666Z",
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
  "session_id": "3d2a103a-3e5c-4b3c-9a60-3b7a24ee96b1",
  "subject": {
    "type": "STAFF",
    "id": "f89f92c4-ec18-4004-804f-f3e2a0da9794"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODlmOTJjNC1lYzE4LTQwMDQtODA0Zi1mM2UyYTBkYTk3OTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MTUsImlhdCI6MTc5MzM2NjYxNSwianRpIjoiMTI5OWYwMTYtZjBmZC00YzU1LTk1ZTItNDNiNzc2Y2I0ODZlIiwic2lkIjoiM2QyYTEwM2EtM2U1Yy00YjNjLTlhNjAtM2I3YTI0ZWU5NmIxIn0.VPHoGK_5PqD_aImLThqXgQVJN69Yfly5N2SFhGEr1Wc",
  "access_expires_at": "2026-10-30T13:38:35.283359913Z",
  "refresh_token": "1BaJ9Kyf_vrfgfItbAYFJJW0NtxTrvVu52x8KzKIpjU",
  "refresh_expires_at": "2026-10-31T01:23:35.28293106Z",
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
  "id": "d46d2c9c-c59e-4e89-9781-813f42db8d3b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.49549Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.49553Z",
  "updated_at": "2026-10-30T13:23:35.508684Z",
  "finished_at": "2026-10-30T13:23:35.508684Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/d46d2c9c-c59e-4e89-9781-813f42db8d3b` → **200**

```json
{
  "run": {
    "id": "d46d2c9c-c59e-4e89-9781-813f42db8d3b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:23:35.49549Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:23:35.49553Z",
    "updated_at": "2026-10-30T13:23:35.508684Z",
    "finished_at": "2026-10-30T13:23:35.508684Z",
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
  "id": "d46d2c9c-c59e-4e89-9781-813f42db8d3b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.49549Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.49553Z",
  "updated_at": "2026-10-30T13:23:35.508684Z",
  "finished_at": "2026-10-30T13:23:35.508684Z",
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
  "id": "d46d2c9c-c59e-4e89-9781-813f42db8d3b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.49549Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.49553Z",
  "updated_at": "2026-10-30T13:23:35.508684Z",
  "finished_at": "2026-10-30T13:23:35.508684Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/57b15e8e-d917-4e87-8c99-7b28f5248022` → **204**

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
  "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.832598Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.832647Z",
  "updated_at": "2026-10-30T13:23:35.838384Z",
  "finished_at": "2026-10-30T13:23:35.838384Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/3f24b3e7-5c22-4a42-9d9e-97165d27dcbb` → **200**

```json
{
  "run": {
    "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:23:35.832598Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:23:35.832647Z",
    "updated_at": "2026-10-30T13:23:35.838384Z",
    "finished_at": "2026-10-30T13:23:35.838384Z",
    "version": 1
  },
  "items": [
    {
      "id": "3ab02c50-b79c-4376-a901-ef511cb660d9",
      "run_id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "2a969cf405c2fe6dd2add7c77da4e206b0cf6032eed74be718d50d362b37645f",
      "reference_display": "sandbox-reconciliation-57b15e8e-d917-4e87-8c99-7b28f#####",
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
      "provider_at": "2026-10-30T13:23:35Z",
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
  "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.832598Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.832647Z",
  "updated_at": "2026-10-30T13:23:35.838384Z",
  "finished_at": "2026-10-30T13:23:35.838384Z",
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
  "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.832598Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.832647Z",
  "updated_at": "2026-10-30T13:23:35.838384Z",
  "finished_at": "2026-10-30T13:23:35.838384Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/3ab02c50-b79c-4376-a901-ef511cb660d9/resolve` → **200**

```json
{
  "command_id": "d9302445-e073-4149-9d2d-808096726cdd",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "3ab02c50-b79c-4376-a901-ef511cb660d9",
  "run_id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "2a969cf405c2fe6dd2add7c77da4e206b0cf6032eed74be718d50d362b37645f",
  "reference_display": "sandbox-reconciliation-57b15e8e-d917-4e87-8c99-7b28f#####",
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
  "provider_at": "2026-10-30T13:23:35Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "resolved_at": "2026-10-30T13:23:36.151521Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/3ab02c50-b79c-4376-a901-ef511cb660d9/resolve` → **200**

```json
{
  "command_id": "d9302445-e073-4149-9d2d-808096726cdd",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "3ab02c50-b79c-4376-a901-ef511cb660d9",
  "run_id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "2a969cf405c2fe6dd2add7c77da4e206b0cf6032eed74be718d50d362b37645f",
  "reference_display": "sandbox-reconciliation-57b15e8e-d917-4e87-8c99-7b28f#####",
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
  "provider_at": "2026-10-30T13:23:35Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
  "resolved_at": "2026-10-30T13:23:36.151521Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/3ab02c50-b79c-4376-a901-ef511cb660d9/resolve` → **409**

```json
{
  "command_id": "2644382e-9d76-47c3-a4ef-f74fd5d43c54",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/3ab02c50-b79c-4376-a901-ef511cb660d9/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "78e200e3-99b9-4079-be96-32459821ee4d"
}
```

`GET /api/admin/v1/payment-reconciliations/3f24b3e7-5c22-4a42-9d9e-97165d27dcbb` → **200**

```json
{
  "run": {
    "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:23:35.832598Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:23:35.832647Z",
    "updated_at": "2026-10-30T13:23:36.151521Z",
    "finished_at": "2026-10-30T13:23:35.838384Z",
    "version": 2
  },
  "items": [
    {
      "id": "3ab02c50-b79c-4376-a901-ef511cb660d9",
      "run_id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "2a969cf405c2fe6dd2add7c77da4e206b0cf6032eed74be718d50d362b37645f",
      "reference_display": "sandbox-reconciliation-57b15e8e-d917-4e87-8c99-7b28f#####",
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
      "provider_at": "2026-10-30T13:23:35Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "f89f92c4-ec18-4004-804f-f3e2a0da9794",
      "resolved_at": "2026-10-30T13:23:36.151521Z",
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
      "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:23:35.832598Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:23:35.832647Z",
      "updated_at": "2026-10-30T13:23:36.151521Z",
      "finished_at": "2026-10-30T13:23:35.838384Z",
      "version": 2
    },
    {
      "id": "c1e3c63f-b3ea-43b8-ad0d-9527abfe41fb",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T13:16:37.790132Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:16:37.790217Z",
      "updated_at": "2026-10-30T13:16:37.794912Z",
      "finished_at": "2026-10-30T13:16:37.794912Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/57b15e8e-d917-4e87-8c99-7b28f5248022` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "3f24b3e7-5c22-4a42-9d9e-97165d27dcbb",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:23:35.832598Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:23:35.832647Z",
  "updated_at": "2026-10-30T13:23:36.151521Z",
  "finished_at": "2026-10-30T13:23:35.838384Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793366742937E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793366743127E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793366743127E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793366742956E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793366743127E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
