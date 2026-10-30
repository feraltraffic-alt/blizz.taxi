# Sandbox transcript (2026-10-30T11:04:00Z, 31af71f)

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
  "correlation_id": "4be6a290-7327-41c2-b2c1-6795ef46e951"
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
  "session_id": "a5ba050c-bb24-4247-9e13-0c1da42c1105",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxNDcsImlhdCI6MTc5MzM1ODI0NywianRpIjoiMTJmM2I1MjUtZTNlYS00NzZkLTgxOTUtZGQ4NDBjNDcxODExIiwic2lkIjoiYTViYTA1MGMtYmIyNC00MjQ3LTllMTMtMGMxZGE0MmMxMTA1In0.tNhzLUjC5hAdhcKztc8t4ixSwHJVs4cUnWmV4s4X-J0",
  "access_expires_at": "2026-10-30T11:19:07.982936549Z",
  "refresh_token": "-yonKalCebJM2VhxCMxwHCQgS_qp9OxWRZ1lYaGIWwk",
  "refresh_expires_at": "2026-10-30T23:04:07.981326588Z",
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
  "session_id": "a39e8583-9607-43a1-af71-903485fdbd73",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxNDksImlhdCI6MTc5MzM1ODI0OSwianRpIjoiMTZiMWQwMGQtNWJjZS00NTFiLWJkZTQtOTUxNDVlZDU4NTIzIiwic2lkIjoiYTM5ZTg1ODMtOTYwNy00M2ExLWFmNzEtOTAzNDg1ZmRiZDczIn0.ptsxWuhcfgI2GhJKzg3fFsTldn2htTIut80hn2UdQ78",
  "access_expires_at": "2026-10-30T11:19:09.592236382Z",
  "refresh_token": "BKcycRiXLQGnH4EtH1-NgyS9rmfcsQp6G3xqCj66-o4",
  "refresh_expires_at": "2026-10-30T23:04:09.591512059Z",
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
  "device_ref": "sandbox-24845"
}
```

```json
{
  "challenge_id": "685eeb47-6a6b-48a3-bf54-94c3c0d6a79e",
  "expires_at": "2026-10-30T11:09:10.083857557Z",
  "resend_available_at": "2026-10-30T11:04:11.083857557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "557810",
  "sent_at": "2026-10-30T11:04:10.094055478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "685eeb47-6a6b-48a3-bf54-94c3c0d6a79e",
  "code": "557810",
  "device_ref": "sandbox-24845"
}
```

```json
{
  "session_id": "363b0550-63ea-4ff6-9052-f513bae7f82b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE1MCwiaWF0IjoxNzkzMzU4MjUwLCJqdGkiOiIwZmZiOWVlNS0xMDU1LTQ4NDItYmRjMC1kM2VlOWJiMDg4ZjIiLCJzaWQiOiIzNjNiMDU1MC02M2VhLTRmZjYtOTA1Mi1mNTEzYmFlN2Y4MmIifQ.GcC7yKv7BEr-ut2eaEjjfgbbF2QgJNnmhBWpHWCkVzM",
  "access_expires_at": "2026-10-30T11:19:10.367619732Z",
  "refresh_token": "-tpkZ4D1E4MPlH9tSET665eAGBSvg-ODaJ69VlMfxSI",
  "refresh_expires_at": "2026-11-29T11:04:10.366855962Z",
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
  "command_id": "5abc0e54-5b68-40ff-aebe-c47edc4ceb39",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:10Z",
    "sequence": 1793358250825
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61dd7c64-e945-4c3e-b993-b4975491737b",
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
  "last_heartbeat_at": "2026-10-30T11:04:10.90869Z",
  "last_location_at": "2026-10-30T11:04:10.90869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634718878",
  "device_ref": "sandbox-67"
}
```

```json
{
  "challenge_id": "56a5b709-692c-4f46-8211-d65507abfec8",
  "expires_at": "2026-10-30T11:09:11.137799328Z",
  "resend_available_at": "2026-10-30T11:04:12.137799328Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634718878` → **200**

```json
{
  "phone": "+380634718878",
  "audience": "CLIENT",
  "code": "440693",
  "sent_at": "2026-10-30T11:04:11.142010838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56a5b709-692c-4f46-8211-d65507abfec8",
  "code": "440693",
  "device_ref": "sandbox-67"
}
```

```json
{
  "session_id": "7d292004-4c61-4d33-9c3a-48c1dfd0765f",
  "subject": {
    "type": "CLIENT",
    "id": "4e8d63cd-90b1-49a9-8a88-fc91caad0a40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZThkNjNjZC05MGIxLTQ5YTktOGE4OC1mYzkxY2FhZDBhNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MTUxLCJpYXQiOjE3OTMzNTgyNTEsImp0aSI6IjRlZTIwM2JhLWE4N2ItNDEyNC04MzYwLTE5MjNiNTcxZGU0NiIsInNpZCI6IjdkMjkyMDA0LTRjNjEtNGQzMy05YzNhLTQ4YzFkZmQwNzY1ZiJ9.URkQWbQWKZcKJ-597h3ej2yLFL_jxLsxsMJwQl9jqIY",
  "access_expires_at": "2026-10-30T11:19:11.390080213Z",
  "refresh_token": "fZ_0XrZLc85RM62QoglJ1DEK_m748gdS_Ho23VHb_NM",
  "refresh_expires_at": "2026-11-29T11:04:11.389390091Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1af16945-e339-45db-965c-5519136e2326",
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
  "id": "f6688358-b025-4cf9-9e2e-0950f31899b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:09:11.658019Z",
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
  "command_id": "8c944023-8aa1-4f63-af12-1e3b5157c1d9",
  "quote_id": "f6688358-b025-4cf9-9e2e-0950f31899b2",
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
  "id": "c24baa53-eead-43fa-bdb5-813da8614e42",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4e8d63cd-90b1-49a9-8a88-fc91caad0a40",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:04:11.94973Z",
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
    "id": "eaad4aea-e4e1-4c59-8d40-9f1ad10e61ef",
    "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
    "expires_at": "2026-10-30T11:04:26.957232Z",
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

`POST /api/driver/v1/offers/eaad4aea-e4e1-4c59-8d40-9f1ad10e61ef/accept` → **200**

```json
{
  "command_id": "af8f441d-a545-483f-86f1-5fbaf2aea054"
}
```

```json
{
  "id": "32925943-d2e1-4d0f-9ca1-b138c25496e8",
  "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84176926-f506-435e-874c-29e3e5178501",
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
  "command_id": "121ff0d4-a180-4eb3-994b-7da17c7a4634",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T11:04:12.963696575Z"
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
  "id": "84176926-f506-435e-874c-29e3e5178501",
  "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
  "assignment_id": "32925943-d2e1-4d0f-9ca1-b138c25496e8",
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

`POST /api/driver/v1/work-sessions/61dd7c64-e945-4c3e-b993-b4975491737b/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:13Z",
    "sequence": 1793358253698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "61dd7c64-e945-4c3e-b993-b4975491737b",
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
  "last_heartbeat_at": "2026-10-30T11:04:13.720391Z",
  "last_location_at": "2026-10-30T11:04:13.720391Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/84176926-f506-435e-874c-29e3e5178501/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "647c6734-1226-4016-9508-f33484ba4180",
  "expected_version": 0
}
```

```json
{
  "id": "84176926-f506-435e-874c-29e3e5178501",
  "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
  "assignment_id": "32925943-d2e1-4d0f-9ca1-b138c25496e8",
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
  "arrived_at": "2026-10-30T11:04:13.962451Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/84176926-f506-435e-874c-29e3e5178501/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "aa31ee8f-bd03-4161-83b1-be35872ea130",
  "expected_version": 1
}
```

```json
{
  "id": "84176926-f506-435e-874c-29e3e5178501",
  "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
  "assignment_id": "32925943-d2e1-4d0f-9ca1-b138c25496e8",
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
  "arrived_at": "2026-10-30T11:04:13.962451Z",
  "started_at": "2026-10-30T11:04:14.227829Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/84176926-f506-435e-874c-29e3e5178501/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0ff0de8b-74a8-46ef-a0bb-06fe6072a861",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:04:14Z",
  "cash_received": true
}
```

```json
{
  "id": "84176926-f506-435e-874c-29e3e5178501",
  "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
  "assignment_id": "32925943-d2e1-4d0f-9ca1-b138c25496e8",
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
  "arrived_at": "2026-10-30T11:04:13.962451Z",
  "started_at": "2026-10-30T11:04:14.227829Z",
  "completed_at": "2026-10-30T11:04:14.478404Z",
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
  "session_id": "61dd7c64-e945-4c3e-b993-b4975491737b",
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
  "last_heartbeat_at": "2026-10-30T11:04:13.720391Z",
  "last_location_at": "2026-10-30T11:04:13.720391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/61dd7c64-e945-4c3e-b993-b4975491737b/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "78df858f-5830-4df3-b749-08a852c9c393",
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
  "command_id": "b9b0ccb9-d7a8-4fe8-900b-0362e4d5a2a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:15Z",
    "sequence": 1793358255248
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
  "correlation_id": "ba5b47f5-347a-415a-ab4b-d0ac31f19349",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8c995e28-ea95-4a16-8007-6ba6f3403048",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:15Z",
    "sequence": 1793358255497
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a84b5993-1d55-4072-a662-c22a128b1df2",
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
  "last_heartbeat_at": "2026-10-30T11:04:15.516505Z",
  "last_location_at": "2026-10-30T11:04:15.516505Z",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T11:04:12.963697Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "53098930-50e3-44ed-a049-765dcc542f99",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T11:04:15.99383255Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a84b5993-1d55-4072-a662-c22a128b1df2",
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
  "last_heartbeat_at": "2026-10-30T11:04:15.516505Z",
  "last_location_at": "2026-10-30T11:04:15.516505Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a84b5993-1d55-4072-a662-c22a128b1df2/close` → **200**

```json
{
  "command_id": "84a5ba71-605a-47c4-bbef-5125d7031932",
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
  "session_id": "ea0c08f2-73a9-4f15-a08c-ca210d502430",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxNTYsImlhdCI6MTc5MzM1ODI1NiwianRpIjoiZTcyZmU2ZTktYmMzOS00YzY3LWJhZjktZThmYWM2OThlZTg0Iiwic2lkIjoiZWEwYzA4ZjItNzNhOS00ZjE1LWEwOGMtY2EyMTBkNTAyNDMwIn0.WkQdiufSFylOK4oDIOOr9BQ0gmfaiKsJdXJStL03GSc",
  "access_expires_at": "2026-10-30T11:19:16.969621383Z",
  "refresh_token": "lT5NoQpog5UDUDlGJBEVJcQ51zw1wESGznwr3GDKjr4",
  "refresh_expires_at": "2026-10-30T23:04:16.969035985Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2a49aea2-b108-4e5f-ae07-3040301f1a6c",
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
  "id": "c13d0d53-360e-43a2-8109-9766d37542f6",
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
  "created_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "created_at": "2026-10-30T11:04:17.265941Z",
  "updated_at": "2026-10-30T11:04:17.265941Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635464358",
  "device_ref": "sandbox-1923"
}
```

```json
{
  "challenge_id": "0923a2fd-1ab1-442e-a7e5-4f222e23fb63",
  "expires_at": "2026-10-30T11:09:17.507642678Z",
  "resend_available_at": "2026-10-30T11:04:18.507642678Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635464358` → **200**

```json
{
  "phone": "+380635464358",
  "audience": "CLIENT",
  "code": "758434",
  "sent_at": "2026-10-30T11:04:17.511414771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0923a2fd-1ab1-442e-a7e5-4f222e23fb63",
  "code": "758434",
  "device_ref": "sandbox-1923"
}
```

```json
{
  "session_id": "7a1335fb-74b3-4006-a839-c7d7b05d3a18",
  "subject": {
    "type": "CLIENT",
    "id": "ef2df190-a9ec-49e4-9a77-269cf39f67d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjJkZjE5MC1hOWVjLTQ5ZTQtOWE3Ny0yNjljZjM5ZjY3ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MTU3LCJpYXQiOjE3OTMzNTgyNTcsImp0aSI6IjdjMzJjYzc0LWEzMmYtNDMxMy1iMDUwLTFkMDI1Mzc2ODA5MiIsInNpZCI6IjdhMTMzNWZiLTc0YjMtNDAwNi1hODM5LWM3ZDdiMDVkM2ExOCJ9.vPFEUcTzI0sFXQT3zGF0lRaI10JhQiHnFjDkMT7fH7o",
  "access_expires_at": "2026-10-30T11:19:17.776045476Z",
  "refresh_token": "kEW3rkl3Z-S_CX6HmRBgMCEGhwm0Ikl1CIss1rgQDds",
  "refresh_expires_at": "2026-11-29T11:04:17.775462801Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635464358` → **200**

```json
{
  "client_id": "ef2df190-a9ec-49e4-9a77-269cf39f67d4"
}
```

`POST /api/admin/v1/rider-wallets/ef2df190-a9ec-49e4-9a77-269cf39f67d4/top-ups` → **201**

```json
{
  "command_id": "cc487ee7-153a-4794-8886-cb064fb01d94",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "ef2df190-a9ec-49e4-9a77-269cf39f67d4",
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
      "id": "c95ed9a9-58a9-4f89-87ed-0017c72c9d56",
      "at": "2026-10-30T11:04:18.364966Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9946ec66-4057-4d30-b6f4-c4ca7dde75ec",
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
  "id": "eb21795e-6dbc-4c0b-b7d7-aab21a75fe3e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:09:18.604799Z",
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
      "id": "c13d0d53-360e-43a2-8109-9766d37542f6",
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
  "device_ref": "sandbox-20328"
}
```

```json
{
  "challenge_id": "8cdb951d-1549-4b44-bb22-d569d756740b",
  "expires_at": "2026-10-30T11:09:18.84902039Z",
  "resend_available_at": "2026-10-30T11:04:19.84902039Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "365683",
  "sent_at": "2026-10-30T11:04:18.853160345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cdb951d-1549-4b44-bb22-d569d756740b",
  "code": "365683",
  "device_ref": "sandbox-20328"
}
```

```json
{
  "session_id": "a17f9776-5f4d-4ee3-8e9a-707292056a2e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE1OSwiaWF0IjoxNzkzMzU4MjU5LCJqdGkiOiIxMThlOTk4NC02NzU2LTRmNDEtYjA3OS0yMWY1NTFlN2I5NzIiLCJzaWQiOiJhMTdmOTc3Ni01ZjRkLTRlZTMtOGU5YS03MDcyOTIwNTZhMmUifQ.V2GPh0nHn0vN60V2yDaEMRPnOP6_ofEYMvoF50Jrn6I",
  "access_expires_at": "2026-10-30T11:19:19.11022293Z",
  "refresh_token": "5G1UEBgrEkfDrtJZHushAgc5bRB0BBh_cVbzDnpIVS8",
  "refresh_expires_at": "2026-11-29T11:04:19.109664976Z",
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
  "command_id": "b87bd0aa-d601-44e9-ba10-189ad5a66820",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:19Z",
    "sequence": 1793358259548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65a80154-1eee-4dbc-8268-ad9e09b95563",
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
  "last_heartbeat_at": "2026-10-30T11:04:19.567219Z",
  "last_location_at": "2026-10-30T11:04:19.567219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "65f4ba6b-cd04-4a49-92e7-69d11c152515",
  "quote_id": "eb21795e-6dbc-4c0b-b7d7-aab21a75fe3e",
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
  "id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef2df190-a9ec-49e4-9a77-269cf39f67d4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:04:19.82391Z",
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
  "client_id": "ef2df190-a9ec-49e4-9a77-269cf39f67d4",
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
      "id": "c95ed9a9-58a9-4f89-87ed-0017c72c9d56",
      "at": "2026-10-30T11:04:18.364966Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
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
    "id": "c0c60936-54b9-4bb2-9b10-48c74e1ec31f",
    "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
    "expires_at": "2026-10-30T11:04:34.831042Z",
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

`POST /api/driver/v1/offers/c0c60936-54b9-4bb2-9b10-48c74e1ec31f/accept` → **200**

```json
{
  "command_id": "b61e8082-b249-412d-ab75-b494437d8a3b"
}
```

```json
{
  "id": "e6bfe0d8-08da-482b-ab74-6d0d8e1fe865",
  "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2ab1983-8a5b-4128-a96b-f7a9ba708cb1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2ab1983-8a5b-4128-a96b-f7a9ba708cb1",
  "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
  "assignment_id": "e6bfe0d8-08da-482b-ab74-6d0d8e1fe865",
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

`POST /api/driver/v1/work-sessions/65a80154-1eee-4dbc-8268-ad9e09b95563/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:21Z",
    "sequence": 1793358261567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65a80154-1eee-4dbc-8268-ad9e09b95563",
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
  "last_heartbeat_at": "2026-10-30T11:04:21.023982Z",
  "last_location_at": "2026-10-30T11:04:21.023982Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e2ab1983-8a5b-4128-a96b-f7a9ba708cb1/arrive` → **200**

```json
{
  "command_id": "c855c192-6e61-406d-8ca7-fe5046fa4f95",
  "expected_version": 0
}
```

```json
{
  "id": "e2ab1983-8a5b-4128-a96b-f7a9ba708cb1",
  "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
  "assignment_id": "e6bfe0d8-08da-482b-ab74-6d0d8e1fe865",
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
  "arrived_at": "2026-10-30T11:04:21.251511Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e2ab1983-8a5b-4128-a96b-f7a9ba708cb1/start` → **200**

```json
{
  "command_id": "79601177-7ded-4579-9bf5-7b0decd48b3a",
  "expected_version": 1
}
```

```json
{
  "id": "e2ab1983-8a5b-4128-a96b-f7a9ba708cb1",
  "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
  "assignment_id": "e6bfe0d8-08da-482b-ab74-6d0d8e1fe865",
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
  "arrived_at": "2026-10-30T11:04:21.251511Z",
  "started_at": "2026-10-30T11:04:21.490696Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/e2ab1983-8a5b-4128-a96b-f7a9ba708cb1/complete` → **200**

```json
{
  "command_id": "6b50f08e-5c39-4df5-97e8-06ef83824406",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:04:21Z",
  "cash_received": true
}
```

```json
{
  "id": "e2ab1983-8a5b-4128-a96b-f7a9ba708cb1",
  "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
  "assignment_id": "e6bfe0d8-08da-482b-ab74-6d0d8e1fe865",
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
  "arrived_at": "2026-10-30T11:04:21.251511Z",
  "started_at": "2026-10-30T11:04:21.490696Z",
  "completed_at": "2026-10-30T11:04:21.753855Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ef2df190-a9ec-49e4-9a77-269cf39f67d4",
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
      "id": "22e98ba6-6035-4809-b263-dd32e44a694e",
      "at": "2026-10-30T11:04:21.890038Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7"
    },
    {
      "id": "c95ed9a9-58a9-4f89-87ed-0017c72c9d56",
      "at": "2026-10-30T11:04:18.364966Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c13d0d53-360e-43a2-8109-9766d37542f6/archive` → **200**

```json
{
  "command_id": "1a308f36-be55-49d0-8fec-d3e82fb2d648",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c13d0d53-360e-43a2-8109-9766d37542f6",
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
  "created_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "created_at": "2026-10-30T11:04:17.265941Z",
  "updated_at": "2026-10-30T11:04:25.268892Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65a80154-1eee-4dbc-8268-ad9e09b95563",
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
  "last_heartbeat_at": "2026-10-30T11:04:21.023982Z",
  "last_location_at": "2026-10-30T11:04:21.023982Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65a80154-1eee-4dbc-8268-ad9e09b95563/close` → **200**

```json
{
  "command_id": "c533edb9-ee67-4994-920d-c0c5d971f803",
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

Done: order 6532ed6b-da54-44d9-995b-2a0d2faacfc7.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-25199"
}
```

```json
{
  "challenge_id": "a41d5462-7bb3-4efc-acc5-b3d964557fd7",
  "expires_at": "2026-10-30T11:09:26.119680656Z",
  "resend_available_at": "2026-10-30T11:04:27.119680656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "804753",
  "sent_at": "2026-10-30T11:04:26.123459466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a41d5462-7bb3-4efc-acc5-b3d964557fd7",
  "code": "804753",
  "device_ref": "sandbox-25199"
}
```

```json
{
  "session_id": "89955938-9368-4572-b721-c7be0c0d7050",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE2NiwiaWF0IjoxNzkzMzU4MjY2LCJqdGkiOiIzNmE1NmI4NC04ZWZkLTQwYTUtOWZkMy0xYmJkNjNhOTNmZmEiLCJzaWQiOiI4OTk1NTkzOC05MzY4LTQ1NzItYjcyMS1jN2JlMGMwZDcwNTAifQ.HUXuDY59M1BXaPlYH0-UNOkbw2aI9MqP6Ek45Qeo-zc",
  "access_expires_at": "2026-10-30T11:19:26.36702413Z",
  "refresh_token": "kx1rla_OwM-eRFlVoIxvxGh1MB9l646s5wTFcATn050",
  "refresh_expires_at": "2026-11-29T11:04:26.366377787Z",
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
  "device_ref": "sandbox-5034"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "d8d2ea5b-034a-4bc7-ac2c-fa164f285635",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-5034"
}
```

```json
{
  "challenge_id": "3de54f8e-6f21-4e3e-a8e4-34162252143a",
  "expires_at": "2026-10-30T11:09:28.043189655Z",
  "resend_available_at": "2026-10-30T11:04:29.043189655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "525250",
  "sent_at": "2026-10-30T11:04:28.046451267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3de54f8e-6f21-4e3e-a8e4-34162252143a",
  "code": "525250",
  "device_ref": "sandbox-5034"
}
```

```json
{
  "session_id": "fef39a33-284b-4288-aaa1-d51af710008d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE2OCwiaWF0IjoxNzkzMzU4MjY4LCJqdGkiOiJhNDlkYjU1Ni1hZGY5LTRlYWItYTNmNi01MjMwY2IzZjY2M2EiLCJzaWQiOiJmZWYzOWEzMy0yODRiLTQyODgtYWFhMS1kNTFhZjcxMDAwOGQifQ.vHJbX63vhIFbxyutjYCB_g8o2Ea3nI7wCOah0tMZiwo",
  "access_expires_at": "2026-10-30T11:19:28.294791162Z",
  "refresh_token": "LDV3RLIR0z5pfEvah9yGHxxWtZsaZXLbLzzNjTwgjkg",
  "refresh_expires_at": "2026-11-29T11:04:28.294179265Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-16814"
}
```

```json
{
  "challenge_id": "fb29f8f4-e132-4757-8601-d08d38a8a8c1",
  "expires_at": "2026-10-30T11:09:28.518448609Z",
  "resend_available_at": "2026-10-30T11:04:29.518448609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "402939",
  "sent_at": "2026-10-30T11:04:28.521843281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb29f8f4-e132-4757-8601-d08d38a8a8c1",
  "code": "402939",
  "device_ref": "sandbox-16814"
}
```

```json
{
  "session_id": "a44f4a43-8b8e-45b1-a7d9-9cb86d45dc1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE2OCwiaWF0IjoxNzkzMzU4MjY4LCJqdGkiOiJhMjIwNmRkMi1lN2Y0LTQ4OGYtOTllMC0xYTUzODY2MTkzMmIiLCJzaWQiOiJhNDRmNGE0My04YjhlLTQ1YjEtYTdkOS05Y2I4NmQ0NWRjMWEifQ.g1zBc_4fJ06USI4FW6MDHUPi-1pp9BcJwlph92oXg20",
  "access_expires_at": "2026-10-30T11:19:28.942246845Z",
  "refresh_token": "SD3_KdFwGEgHU6xbG_uNLQtD9bwyDQnCW4rc9yINqjg",
  "refresh_expires_at": "2026-11-29T11:04:28.941765028Z",
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
  "command_id": "ede10aad-c14b-463a-8052-dc49f794979b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:29Z",
    "sequence": 1793358269629
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "2c08a0da-b436-4c05-9421-4b302bf69e55",
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
  "last_heartbeat_at": "2026-10-30T11:04:29.666201Z",
  "last_location_at": "2026-10-30T11:04:29.666201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600094401",
  "device_ref": "sandbox-1239"
}
```

```json
{
  "challenge_id": "35e0846c-3cf6-40d7-aed0-b25dffb4c630",
  "expires_at": "2026-10-30T11:09:29.927901951Z",
  "resend_available_at": "2026-10-30T11:04:30.927901951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600094401` → **200**

```json
{
  "phone": "+48600094401",
  "audience": "CLIENT",
  "code": "292220",
  "sent_at": "2026-10-30T11:04:29.930931313Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35e0846c-3cf6-40d7-aed0-b25dffb4c630",
  "code": "292220",
  "device_ref": "sandbox-1239"
}
```

```json
{
  "session_id": "b44ff380-d2d4-4aeb-8077-def1d89f5400",
  "subject": {
    "type": "CLIENT",
    "id": "974fd9aa-0353-4797-abcc-44e10df4aa25"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzRmZDlhYS0wMzUzLTQ3OTctYWJjYy00NGUxMGRmNGFhMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MTcwLCJpYXQiOjE3OTMzNTgyNzAsImp0aSI6IjkxNDA3Y2M3LTRlODAtNDA1NC1hZDYxLTljNzllZjkxODkzMCIsInNpZCI6ImI0NGZmMzgwLWQyZDQtNGFlYi04MDc3LWRlZjFkODlmNTQwMCJ9.aD09OPs8TYvQ0_lwioXng6b8T8x21z2sVoYPswTSqvo",
  "access_expires_at": "2026-10-30T11:19:30.211978027Z",
  "refresh_token": "yZqGxdUhmDqWV0wqhLj_L_FI2gBWzRaYyBoKoylv68c",
  "refresh_expires_at": "2026-11-29T11:04:30.211408447Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb33ae95-5d1a-482e-8f3c-f699982266bd",
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
  "id": "a4dd7b3e-18e2-430d-952d-c0c90354ed82",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:09:30.454879Z",
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
  "command_id": "314ba835-e7b4-4d69-95d3-7c1a1385f57e",
  "quote_id": "a4dd7b3e-18e2-430d-952d-c0c90354ed82",
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
  "id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "974fd9aa-0353-4797-abcc-44e10df4aa25",
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
  "created_at": "2026-10-30T11:04:30.705377Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3` → **200**

```json
{
  "id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "974fd9aa-0353-4797-abcc-44e10df4aa25",
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
  "created_at": "2026-10-30T11:04:30.705377Z",
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

`POST /api/driver/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3/claim` → **422**

```json
{
  "command_id": "af83868e-ae9a-4267-a46e-fa515ad9112c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "b54a51db-bdcd-4a60-bf4a-064e9c45e827"
}
```

`GET /api/rider/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3` → **200**

```json
{
  "id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "974fd9aa-0353-4797-abcc-44e10df4aa25",
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
  "created_at": "2026-10-30T11:04:30.705377Z",
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

`POST /api/driver/v1/orders/fc8807a9-9acc-4b17-bdb1-099d8d8fb013/claim` → **404**

```json
{
  "command_id": "18d95324-c37a-40ff-b532-51c840deb6cf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fc8807a9-9acc-4b17-bdb1-099d8d8fb013/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ad917a4c-d6b9-4610-86ce-42c0daa4c9c1"
}
```

`POST /api/driver/v1/orders/0943e066-e413-4747-9f73-6aea9379cb9e/claim` → **404**

```json
{
  "command_id": "86b1e8f0-954d-44a4-b197-a65560dc78cc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0943e066-e413-4747-9f73-6aea9379cb9e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "583bac6f-055a-45bc-ad34-30c450ecb563"
}
```

`POST /api/driver/v1/orders/8e9f7e28-0919-4047-ac1e-ef9f8926e8fa/claim` → **404**

```json
{
  "command_id": "a72881de-23c8-4cbf-a94b-411cabd7fa35"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e9f7e28-0919-4047-ac1e-ef9f8926e8fa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "69f7ad92-992c-4360-afeb-666a45fb0a4d"
}
```

`POST /api/driver/v1/orders/9e39de35-3cb3-4f3f-82ba-fe4915fb716c/claim` → **404**

```json
{
  "command_id": "ac91de24-effe-4131-a323-beea9c0024de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9e39de35-3cb3-4f3f-82ba-fe4915fb716c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "53460288-afe8-4f48-92af-07de94514c92"
}
```

`POST /api/driver/v1/orders/0f679274-bcac-4fd6-a152-732634e64489/claim` → **404**

```json
{
  "command_id": "b921798c-5c30-435b-9790-0908b30916b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0f679274-bcac-4fd6-a152-732634e64489/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3be3d371-ab56-400c-9b60-8103addb08a0"
}
```

`POST /api/driver/v1/orders/a020360c-8d0b-4964-bf42-64a82551de02/claim` → **404**

```json
{
  "command_id": "eaedbb38-1b62-433d-86e1-6111492939d8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a020360c-8d0b-4964-bf42-64a82551de02/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6f483313-681b-48ab-8095-4dfd9e08ec94"
}
```

`POST /api/driver/v1/orders/7116e03c-efea-4b88-8cdb-d2fa3edbf8dc/claim` → **404**

```json
{
  "command_id": "148f73c6-2595-4a74-bb34-29a9ba762756"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7116e03c-efea-4b88-8cdb-d2fa3edbf8dc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7afa2c05-41a8-4fcc-9db5-a5869eaeda99"
}
```

`POST /api/driver/v1/orders/313c0d84-feb5-4672-a466-f790fb6c374e/claim` → **404**

```json
{
  "command_id": "a8ad35e1-ca59-451f-bf48-dc19adab2318"
}
```

```json
{
  "instance": "/api/driver/v1/orders/313c0d84-feb5-4672-a466-f790fb6c374e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cd0ed662-3e80-410c-80f2-ebee142a1a78"
}
```

`POST /api/driver/v1/orders/00dbee7d-9961-4de2-b504-e6da54c51117/claim` → **404**

```json
{
  "command_id": "18d563f4-c12d-4c0e-b22f-8ad492b0e4a5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/00dbee7d-9961-4de2-b504-e6da54c51117/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "51c0fed8-4d87-4821-b1c5-49c35e01a62f"
}
```

`POST /api/driver/v1/orders/e2a14888-d249-4861-9369-398efedd221a/claim` → **404**

```json
{
  "command_id": "88e82ae0-8ed6-4632-8200-a4824aa209d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e2a14888-d249-4861-9369-398efedd221a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dc8f3768-2466-4b93-b06c-6fae2175a966"
}
```

`POST /api/driver/v1/orders/8a73f087-e673-4cc7-9cb7-27962c90dbf2/claim` → **404**

```json
{
  "command_id": "8086e75f-26e8-4030-b8de-a94df121c649"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8a73f087-e673-4cc7-9cb7-27962c90dbf2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2d853f58-ee11-490c-8de5-9450024d7f83"
}
```

`POST /api/driver/v1/orders/ac5c2e87-58a7-43a5-baf4-e5334e34d405/claim` → **404**

```json
{
  "command_id": "e7e9e15e-7a23-4dfb-abbd-7fa1878d2868"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ac5c2e87-58a7-43a5-baf4-e5334e34d405/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "09789b4d-4126-4cba-90aa-c19a1a96eed3"
}
```

`POST /api/driver/v1/orders/78987032-6e17-4366-9be8-187a956da6c7/claim` → **404**

```json
{
  "command_id": "4b1c8cb0-da78-457d-bf65-4038100884b6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/78987032-6e17-4366-9be8-187a956da6c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "64dfc51a-7f71-4fff-a196-6a61260932a2"
}
```

`POST /api/driver/v1/orders/3620a7c7-e38d-4c7d-8d5b-6f9a812f5008/claim` → **404**

```json
{
  "command_id": "0912c39c-9ae9-4364-a4e3-eed0ec9ca5e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3620a7c7-e38d-4c7d-8d5b-6f9a812f5008/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ab20ed22-6d83-4be9-84a6-447b2ce4379b"
}
```

`POST /api/driver/v1/orders/84e0e5cf-cfcc-4529-a918-27292b8fb17f/claim` → **404**

```json
{
  "command_id": "162d71ed-0a91-48d6-8a88-0d9a2b09d7c0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/84e0e5cf-cfcc-4529-a918-27292b8fb17f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "afaee503-0051-4c3f-b209-0c1e335ceb7b"
}
```

`POST /api/driver/v1/orders/81e650a5-7087-4c36-9c0e-de68f006b2e2/claim` → **404**

```json
{
  "command_id": "7fd91bca-f974-4aab-97fd-f5e7062f179b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/81e650a5-7087-4c36-9c0e-de68f006b2e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "55f7c15f-bfb7-4117-8774-757a6b13cd15"
}
```

`POST /api/driver/v1/orders/fbe1f39c-f02d-448e-9aa6-eac45505d77a/claim` → **404**

```json
{
  "command_id": "bc192cfe-d875-457c-aa0c-a09db51b7653"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fbe1f39c-f02d-448e-9aa6-eac45505d77a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "634974eb-605c-498b-8fe6-d8c2a0d325d8"
}
```

`POST /api/driver/v1/orders/40413c01-dd78-424c-8051-6bc8ab031e84/claim` → **404**

```json
{
  "command_id": "c156319b-6c35-4aa7-9b0c-5c614f569919"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40413c01-dd78-424c-8051-6bc8ab031e84/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c4649875-8fe7-4595-bc73-8087fe9f5047"
}
```

`POST /api/driver/v1/orders/4bfe6e6f-f72c-457c-894e-2f85514e038e/claim` → **404**

```json
{
  "command_id": "0d6ff4ef-d074-40dd-ad77-b5b8d4fe6ab9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4bfe6e6f-f72c-457c-894e-2f85514e038e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2ad8810e-8502-4974-b0a7-3cb7f34130f1"
}
```

`POST /api/driver/v1/orders/c9b41f5a-571c-457d-84df-3dccf4724d71/claim` → **404**

```json
{
  "command_id": "d3ad40e9-e211-429e-812f-6c913d0f9e34"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c9b41f5a-571c-457d-84df-3dccf4724d71/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7999cdfb-ec66-430d-9c8a-6e95e655cdca"
}
```

`POST /api/driver/v1/orders/1ef00ee0-5333-4c53-a700-8e39a60b436d/claim` → **404**

```json
{
  "command_id": "fc6a0560-8720-410d-b2ca-1f9c114a709a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1ef00ee0-5333-4c53-a700-8e39a60b436d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f456bc4a-4207-43e1-ac8c-d3f850b843ec"
}
```

`POST /api/driver/v1/orders/dc423fe0-6b5a-4010-a3a9-899eb2508a61/claim` → **404**

```json
{
  "command_id": "961b3eed-b3ab-464f-b84e-ee62a67117db"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dc423fe0-6b5a-4010-a3a9-899eb2508a61/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7dfebe0a-6fea-4867-86aa-4e17a4b955c4"
}
```

`POST /api/driver/v1/orders/5c2cba15-7e38-481f-8f5d-8793f33643ba/claim` → **404**

```json
{
  "command_id": "2117bc45-ed92-4846-b4a2-fef71072fd29"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5c2cba15-7e38-481f-8f5d-8793f33643ba/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9e35f23f-f410-4b5c-8fff-1ae9f29f1df8"
}
```

`POST /api/driver/v1/orders/1bf2176f-3835-4b5c-9675-ff9d79f95c59/claim` → **404**

```json
{
  "command_id": "86cd185b-5767-47be-9e1a-fbda95800923"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1bf2176f-3835-4b5c-9675-ff9d79f95c59/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4aa7b1d5-4f00-4459-bfed-8e30291626b8"
}
```

`POST /api/driver/v1/orders/784d7f82-7421-4552-add8-5a375521ba59/claim` → **404**

```json
{
  "command_id": "13f18f71-2b50-4b58-90aa-d09f5c7c44bf"
}
```

```json
{
  "instance": "/api/driver/v1/orders/784d7f82-7421-4552-add8-5a375521ba59/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b7371561-9bcc-44ec-a882-e3723e0c51f2"
}
```

`POST /api/driver/v1/orders/12dbadf4-5fd1-4c93-973d-739f2d1898c8/claim` → **404**

```json
{
  "command_id": "2d36e283-c392-49f8-a89b-7f52e4c84a50"
}
```

```json
{
  "instance": "/api/driver/v1/orders/12dbadf4-5fd1-4c93-973d-739f2d1898c8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b3fe66a4-f2b8-4a15-813e-f0d419bd4c2f"
}
```

`POST /api/driver/v1/orders/5750bf8c-93ea-45ad-a01b-9e02d0e572c1/claim` → **404**

```json
{
  "command_id": "655c6b6d-d24e-4f8a-9c2c-5ef0e1bc3c0e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5750bf8c-93ea-45ad-a01b-9e02d0e572c1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f455ca45-66f5-401f-9cff-18c26563bc1a"
}
```

`POST /api/driver/v1/orders/aece2f01-52dd-4ccd-8d69-b1867446be05/claim` → **404**

```json
{
  "command_id": "9c1e0aa0-7969-4095-9af6-c6fe76926708"
}
```

```json
{
  "instance": "/api/driver/v1/orders/aece2f01-52dd-4ccd-8d69-b1867446be05/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2851f81d-51ab-4bdd-a730-33855298ddd9"
}
```

`POST /api/driver/v1/orders/8e268110-6c7b-4448-9653-3af765c2dd6e/claim` → **404**

```json
{
  "command_id": "c53644bd-ed77-455a-8666-397ef7ab7ea8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e268110-6c7b-4448-9653-3af765c2dd6e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e956a279-866d-4698-91fb-60b34297b938"
}
```

`POST /api/driver/v1/orders/de59223e-f691-40d0-84a7-f3fefbf0ec56/claim` → **429**

```json
{
  "command_id": "c3f9dec0-c01f-48aa-a71e-656cc7c0d917"
}
```

```json
{
  "instance": "/api/driver/v1/orders/de59223e-f691-40d0-84a7-f3fefbf0ec56/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "bf7c2737-2404-4903-ab51-e9b399e85937",
  "retryable": true,
  "retry_after_seconds": 593
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
  "command_id": "fe3a9c14-ebcc-434a-a121-90aca0339a86",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:39Z",
    "sequence": 1793358279404
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1435de0b-2a9c-43e7-8c81-cba5558fbdff",
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
  "last_heartbeat_at": "2026-10-30T11:04:39.422321Z",
  "last_location_at": "2026-10-30T11:04:39.422321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
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

`POST /api/driver/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3/claim` → **409**

```json
{
  "command_id": "da968d34-3e93-4d5e-82eb-46f1c70bc5b8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "09f21f44-d927-439e-b6cc-ddacf075deb5"
}
```

`POST /api/driver/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3/claim` → **200**

```json
{
  "command_id": "affc1880-88d5-4b83-8187-156159203fc9"
}
```

```json
{
  "id": "bfb282fe-5682-4020-87b3-0baa7469a8a4",
  "order_id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "97f57270-c828-47f2-907a-39d260308b5d",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "97f57270-c828-47f2-907a-39d260308b5d",
  "order_id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "assignment_id": "bfb282fe-5682-4020-87b3-0baa7469a8a4",
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

`POST /api/driver/v1/trips/97f57270-c828-47f2-907a-39d260308b5d/cancel` → **200**

```json
{
  "command_id": "54cdcd0e-e30a-4108-a7d8-3a6b51fb7226",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "97f57270-c828-47f2-907a-39d260308b5d",
  "order_id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "assignment_id": "bfb282fe-5682-4020-87b3-0baa7469a8a4",
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

`GET /api/rider/v1/orders/1517fb15-0eba-4cee-bde7-171bacc640d3` → **200**

```json
{
  "id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "974fd9aa-0353-4797-abcc-44e10df4aa25",
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
    "id": "bfb282fe-5682-4020-87b3-0baa7469a8a4",
    "order_id": "1517fb15-0eba-4cee-bde7-171bacc640d3",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "97f57270-c828-47f2-907a-39d260308b5d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T11:04:30.705377Z",
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
  "session_id": "2c08a0da-b436-4c05-9421-4b302bf69e55",
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
  "last_heartbeat_at": "2026-10-30T11:04:29.666201Z",
  "last_location_at": "2026-10-30T11:04:29.666201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c08a0da-b436-4c05-9421-4b302bf69e55/close` → **200**

```json
{
  "command_id": "459d00a7-4021-4c73-b199-9617e6a6cd23",
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
  "session_id": "1435de0b-2a9c-43e7-8c81-cba5558fbdff",
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
  "last_heartbeat_at": "2026-10-30T11:04:39.422321Z",
  "last_location_at": "2026-10-30T11:04:39.422321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1435de0b-2a9c-43e7-8c81-cba5558fbdff/close` → **200**

```json
{
  "command_id": "92f1662b-8e65-433a-83c1-36f053180d21",
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
  "session_id": "4f03f83f-5ee0-4a43-8567-98bfe40aad79",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxODIsImlhdCI6MTc5MzM1ODI4MiwianRpIjoiMjFlMzc0ZmYtM2M5YS00ZjEyLTgzZjAtYzc3YTNlZDZlNzVjIiwic2lkIjoiNGYwM2Y4M2YtNWVlMC00YTQzLTg1NjctOThiZmU0MGFhZDc5In0.WqIOTESKETpc0CWz4YUlaX4kEx9ExFgqkOlTFTGmvmU",
  "access_expires_at": "2026-10-30T11:19:42.260371644Z",
  "refresh_token": "wnjMsXUgMVsfWmHupTAVdimBmvs9EKQjKXha3H8qFHs",
  "refresh_expires_at": "2026-10-30T23:04:42.259917418Z",
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
  "command_id": "84a6489e-735e-4e02-9cf7-d852b0a31d8b",
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
  "session_id": "8871038d-604d-4516-bb85-e3a083ecaf02",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxODMsImlhdCI6MTc5MzM1ODI4MywianRpIjoiN2FiOGNhMTItZWFiNy00MTJlLTg1MGItNGRkYzk4YzA3ZGM3Iiwic2lkIjoiODg3MTAzOGQtNjA0ZC00NTE2LWJiODUtZTNhMDgzZWNhZjAyIn0.-70NxchK89HZ0Dpamobf5ND6GZxuRfCEpwfppkOVi_4",
  "access_expires_at": "2026-10-30T11:19:43.204424217Z",
  "refresh_token": "EqD4HBqQZBF2DLzuiSO-8SryBe2hFgaoDkkNl1avwv4",
  "refresh_expires_at": "2026-10-30T23:04:43.20392137Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.999510268",
    "linkedid": "1730052700.999510268",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677925661"
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
    "id": "1730052700.999510268",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "b590a70a-6580-4a5c-9123-ad3b526acc44",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.424937Z",
      "answered_at": null,
      "ended_at": "2026-10-30T11:04:43.44698Z",
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
    "id": "1730052600.1530729785",
    "linkedid": "1730052600.1530729785",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677925661"
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
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/32c124cf-f565-495a-9917-334686e420d0/answer` → **200**

```json
{
  "command_id": "e891fb47-568f-4b9b-89aa-a1a0d2fae3f1"
}
```

```json
{
  "id": "32c124cf-f565-495a-9917-334686e420d0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677925661",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "order_ids": [],
  "started_at": "2026-10-30T11:04:43.725261Z",
  "answered_at": "2026-10-30T11:04:43.991193Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1530729785",
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
    "id": "1730052600.1530729785",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": "2026-10-30T11:04:43.991193Z",
      "ended_at": "2026-10-30T11:04:44.242098Z",
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
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": "2026-10-30T11:04:43.991193Z",
      "ended_at": "2026-10-30T11:04:44.242098Z",
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
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": "2026-10-30T11:04:43.991193Z",
      "ended_at": "2026-10-30T11:04:44.242098Z",
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
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": "2026-10-30T11:04:43.991193Z",
      "ended_at": "2026-10-30T11:04:44.242098Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T11:04:49.547294Z"
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
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": "2026-10-30T11:04:43.991193Z",
      "ended_at": "2026-10-30T11:04:44.242098Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T11:04:49.547294Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/32c124cf-f565-495a-9917-334686e420d0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/32c124cf-f565-495a-9917-334686e420d0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=32c124cf-f565-495a-9917-334686e420d0` → **200**

```json
{
  "changes": [
    {
      "id": "e95ccc1e-3fe1-413c-911a-6c11b0219709",
      "occurred_at": "2026-10-30T11:04:51.454074Z",
      "actor_type": "STAFF",
      "actor_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "32c124cf-f565-495a-9917-334686e420d0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7a7e0c79-0877-4353-9acc-76b7164ea5ea\", \"order_ids\": []}",
      "correlation_id": "1f585afc-985e-444f-aa0e-c76323305aec"
    },
    {
      "id": "318f5688-e3a0-4173-9c43-9e69e443ea78",
      "occurred_at": "2026-10-30T11:04:51.42614Z",
      "actor_type": "STAFF",
      "actor_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "32c124cf-f565-495a-9917-334686e420d0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7a7e0c79-0877-4353-9acc-76b7164ea5ea\", \"order_ids\": []}",
      "correlation_id": "b42f5b06-e5f2-4d37-959e-b970e515394e"
    }
  ]
}
```

Done: call 32c124cf-f565-495a-9917-334686e420d0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25004"
}
```

```json
{
  "challenge_id": "9de8f151-55d1-4849-85bb-61b798c25004",
  "expires_at": "2026-10-30T11:09:51.725780771Z",
  "resend_available_at": "2026-10-30T11:04:52.725780771Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "289289",
  "sent_at": "2026-10-30T11:04:51.731871115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9de8f151-55d1-4849-85bb-61b798c25004",
  "code": "289289",
  "device_ref": "sandbox-25004"
}
```

```json
{
  "session_id": "f3417b19-98e4-4ef0-b265-906546947624",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE5MSwiaWF0IjoxNzkzMzU4MjkxLCJqdGkiOiI2ODExOTQ0MC01YzI2LTQ3MDQtYTYyNC02ZjJiYThmOTI4NDgiLCJzaWQiOiJmMzQxN2IxOS05OGU0LTRlZjAtYjI2NS05MDY1NDY5NDc2MjQifQ.BYWDvFJW7hv3Dy_RbaUdO_GR8Px_yXLU7mAAx_3j76g",
  "access_expires_at": "2026-10-30T11:19:51.983117085Z",
  "refresh_token": "uSLFv25O8AqhLnqtrpjJj2v4ghCbYta6eCEx3qZPzB0",
  "refresh_expires_at": "2026-11-29T11:04:51.982432811Z",
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
  "command_id": "ce11243e-d00c-4889-9562-cf2f4ee3e61e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:52Z",
    "sequence": 1793358292438
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0242779f-53c6-4823-a503-abac1d151e5a",
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
  "last_heartbeat_at": "2026-10-30T11:04:52.455937Z",
  "last_location_at": "2026-10-30T11:04:52.455937Z",
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
  "session_id": "06ca70c9-d3bc-4093-aa81-d7dfcdef5801",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxOTIsImlhdCI6MTc5MzM1ODI5MiwianRpIjoiMGE5YzBjYTctMTQwNS00NjEzLWE0NTAtNzcwNGJjYTRiNGMyIiwic2lkIjoiMDZjYTcwYzktZDNiYy00MDkzLWFhODEtZDdkZmNkZWY1ODAxIn0.ExTslXSvzNLgqLG8sIbEssPgjvCYLt67JqWMieaOusc",
  "access_expires_at": "2026-10-30T11:19:52.941697646Z",
  "refresh_token": "FwzW_3A-FYV0zmiK3UqRCGiymTPcaZOyqYlI18MWCxU",
  "refresh_expires_at": "2026-10-30T23:04:52.941182865Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a4f70610-9bbd-4fd7-9268-bf0425ff5a8b",
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
  "id": "61b4965f-df35-4b52-be95-b5477ae48e9d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:09:53.169484Z",
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
  "command_id": "ef1ec504-e4bd-4ca7-ba02-78633d556148",
  "quote_id": "61b4965f-df35-4b52-be95-b5477ae48e9d",
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
    "phone": "+380673595636"
  }
}
```

```json
{
  "id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
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
  "created_at": "2026-10-30T11:04:53.437591Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673595636"
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
    "id": "200505ef-69ba-4108-ae08-c622de33c15b",
    "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
    "expires_at": "2026-10-30T11:05:08.442854Z",
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

`POST /api/driver/v1/offers/200505ef-69ba-4108-ae08-c622de33c15b/accept` → **200**

```json
{
  "command_id": "e73a790f-2229-40e4-8f64-0603d1415497"
}
```

```json
{
  "id": "3f08c32c-7cd7-4ebe-8562-61a4d5cf25d2",
  "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51aa3632-720b-4b48-bf8c-e557b291ab61",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51aa3632-720b-4b48-bf8c-e557b291ab61",
  "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
  "assignment_id": "3f08c32c-7cd7-4ebe-8562-61a4d5cf25d2",
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
    "phone": "+380673595636"
  }
}
```

`POST /api/driver/v1/work-sessions/0242779f-53c6-4823-a503-abac1d151e5a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:04:55Z",
    "sequence": 1793358295539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0242779f-53c6-4823-a503-abac1d151e5a",
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
  "last_heartbeat_at": "2026-10-30T11:04:55.586592Z",
  "last_location_at": "2026-10-30T11:04:55.586592Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/51aa3632-720b-4b48-bf8c-e557b291ab61/arrive` → **200**

```json
{
  "command_id": "4eff2d0c-af01-4a3b-a57c-490abc9036a3",
  "expected_version": 0
}
```

```json
{
  "id": "51aa3632-720b-4b48-bf8c-e557b291ab61",
  "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
  "assignment_id": "3f08c32c-7cd7-4ebe-8562-61a4d5cf25d2",
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
  "arrived_at": "2026-10-30T11:04:55.828484Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673595636"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  },
  {
    "phone": "+380673595636",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:56.863867855Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  },
  {
    "phone": "+380673595636",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:56.863867855Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673595636` → **200**

```json
[
  {
    "phone": "+380673595636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:54.856822454Z"
  },
  {
    "phone": "+380673595636",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T11:04:56.863867855Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/51aa3632-720b-4b48-bf8c-e557b291ab61/start` → **200**

```json
{
  "command_id": "6ce35002-8e5f-4bf7-a0e6-e0d8161f1531",
  "expected_version": 1
}
```

```json
{
  "id": "51aa3632-720b-4b48-bf8c-e557b291ab61",
  "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
  "assignment_id": "3f08c32c-7cd7-4ebe-8562-61a4d5cf25d2",
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
  "arrived_at": "2026-10-30T11:04:55.828484Z",
  "started_at": "2026-10-30T11:04:57.164914Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673595636"
  }
}
```

`POST /api/driver/v1/trips/51aa3632-720b-4b48-bf8c-e557b291ab61/complete` → **200**

```json
{
  "command_id": "884ec263-a75d-4cb3-8a45-2804b88a9654",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:04:57Z",
  "cash_received": true
}
```

```json
{
  "id": "51aa3632-720b-4b48-bf8c-e557b291ab61",
  "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
  "assignment_id": "3f08c32c-7cd7-4ebe-8562-61a4d5cf25d2",
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
  "arrived_at": "2026-10-30T11:04:55.828484Z",
  "started_at": "2026-10-30T11:04:57.164914Z",
  "completed_at": "2026-10-30T11:04:57.41699Z",
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
  "session_id": "0242779f-53c6-4823-a503-abac1d151e5a",
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
  "last_heartbeat_at": "2026-10-30T11:04:55.586592Z",
  "last_location_at": "2026-10-30T11:04:55.586592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0242779f-53c6-4823-a503-abac1d151e5a/close` → **200**

```json
{
  "command_id": "b3ff3475-c1a5-47e8-86f4-537e41b7785c",
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
  "phone": "+380633240246",
  "device_ref": "sandbox-4292"
}
```

```json
{
  "challenge_id": "5fc38eee-3302-4e65-8b20-68bd64023ee3",
  "expires_at": "2026-10-30T11:09:58.168136398Z",
  "resend_available_at": "2026-10-30T11:04:59.168136398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633240246` → **200**

```json
{
  "phone": "+380633240246",
  "audience": "CLIENT",
  "code": "072838",
  "sent_at": "2026-10-30T11:04:58.171389251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fc38eee-3302-4e65-8b20-68bd64023ee3",
  "code": "072838",
  "device_ref": "sandbox-4292"
}
```

```json
{
  "session_id": "fdac044d-5027-4f19-a380-31d9cd400486",
  "subject": {
    "type": "CLIENT",
    "id": "db91fa46-9712-4464-9e6e-0eeb2f66b984"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjkxZmE0Ni05NzEyLTQ0NjQtOWU2ZS0wZWViMmY2NmI5ODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MTk4LCJpYXQiOjE3OTMzNTgyOTgsImp0aSI6ImI2Yjc4MzZhLTZiNzQtNDQ0Zi1hYjM1LWFkZWY2YjNiNTkyNyIsInNpZCI6ImZkYWMwNDRkLTUwMjctNGYxOS1hMzgwLTMxZDljZDQwMDQ4NiJ9.swrTJ9IKgnrnQvPJmraD0-KSpEIuvy0Lfd-lbMPk1DQ",
  "access_expires_at": "2026-10-30T11:19:58.45062022Z",
  "refresh_token": "S_p08fcoeWX3KSwfkVNC7fvq5p27dsDdVGeob0y6noA",
  "refresh_expires_at": "2026-11-29T11:04:58.450095119Z",
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
  "device_ref": "sandbox-5915"
}
```

```json
{
  "challenge_id": "1173dccb-df45-4e6c-8efd-d9d17c36d909",
  "expires_at": "2026-10-30T11:09:58.89754712Z",
  "resend_available_at": "2026-10-30T11:04:59.89754712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "662882",
  "sent_at": "2026-10-30T11:04:58.899834521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1173dccb-df45-4e6c-8efd-d9d17c36d909",
  "code": "662882",
  "device_ref": "sandbox-5915"
}
```

```json
{
  "session_id": "f0434747-aa28-4d2a-a56e-d135cb5d5398",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTE5OSwiaWF0IjoxNzkzMzU4Mjk5LCJqdGkiOiI3MDc4NjMzMy1lYjEyLTRjZDUtYWM0ZS1mZTgyOWM2YTBkODgiLCJzaWQiOiJmMDQzNDc0Ny1hYTI4LTRkMmEtYTU2ZS1kMTM1Y2I1ZDUzOTgifQ.damCB1XF7sdnR3pkLytlhvVGCotsA1tCf9HqjHCKr7s",
  "access_expires_at": "2026-10-30T11:19:59.143582623Z",
  "refresh_token": "QTMW3u9lvRFKPPDQkCjNPZTbwBGoXXGAaVZ1mIPO0IU",
  "refresh_expires_at": "2026-11-29T11:04:59.143132944Z",
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
  "session_id": "25c16492-d2bd-4487-b343-665abca045fa",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkxOTksImlhdCI6MTc5MzM1ODI5OSwianRpIjoiYmE0ZGM1NjQtNmYxMS00NTk1LTllODYtOWRiOTQ2YTNlMGQ3Iiwic2lkIjoiMjVjMTY0OTItZDJiZC00NDg3LWIzNDMtNjY1YWJjYTA0NWZhIn0.tUN1QPSR5QhgvKC5U69UBJ9rRka1JFr4Uxnu4UhlLU0",
  "access_expires_at": "2026-10-30T11:19:59.853348269Z",
  "refresh_token": "KxnJbpyrdFCkyzBGUOm3HXgbHujvNa7m87w9awQoKNA",
  "refresh_expires_at": "2026-10-30T23:04:59.852913591Z",
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
  "session_id": "51702303-5ba1-4a6e-aadb-a017afcdeb66",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyMDAsImlhdCI6MTc5MzM1ODMwMCwianRpIjoiMWU1ODU0OWQtOWY5ZC00NjlkLWJmYmQtNTExYjMzODY1Mjc0Iiwic2lkIjoiNTE3MDIzMDMtNWJhMS00YTZlLWFhZGItYTAxN2FmY2RlYjY2In0.GnM0QzW-h7LTzmcjT_ql1V3jbFhIYYkgzGkwMTXZuh8",
  "access_expires_at": "2026-10-30T11:20:00.34375937Z",
  "refresh_token": "yBvf5X6Hn7A_zu7d8opjaU0n_90EuIERbtXGPVavOFE",
  "refresh_expires_at": "2026-10-30T23:05:00.343298524Z",
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
  "command_id": "cf3e5dee-01fd-40f8-a3d9-2dc5b8258488",
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
  "id": "eebff80c-b0e2-41b7-9186-35e817f10cb7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:00.812055Z",
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
  "command_id": "fa031d3b-88b1-4616-93cb-acb45762dde5",
  "quote_id": "eebff80c-b0e2-41b7-9186-35e817f10cb7",
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
  "id": "49f9e9ca-6ad7-4823-92a3-edb117d30d39",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db91fa46-9712-4464-9e6e-0eeb2f66b984",
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
  "created_at": "2026-10-30T11:05:01.140405Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/49f9e9ca-6ad7-4823-92a3-edb117d30d39` → **200**

```json
{
  "id": "49f9e9ca-6ad7-4823-92a3-edb117d30d39",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db91fa46-9712-4464-9e6e-0eeb2f66b984",
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
  "created_at": "2026-10-30T11:05:01.140405Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/49f9e9ca-6ad7-4823-92a3-edb117d30d39/cancel` → **200**

```json
{
  "command_id": "bb279b7d-26d4-4bba-a180-e6857ff7ad98",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "49f9e9ca-6ad7-4823-92a3-edb117d30d39",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db91fa46-9712-4464-9e6e-0eeb2f66b984",
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
  "created_at": "2026-10-30T11:05:01.140405Z",
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
  "command_id": "c6c99c3d-3b05-4b6f-a150-d12ac5c10de4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:02Z",
    "sequence": 1793358302950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7067664d-38c2-457f-838b-532275c628ee",
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
  "last_heartbeat_at": "2026-10-30T11:05:02.111969Z",
  "last_location_at": "2026-10-30T11:05:02.111969Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-32042"
}
```

```json
{
  "challenge_id": "42fa70af-19c0-4974-af05-4439d055a332",
  "expires_at": "2026-10-30T11:10:02.343307367Z",
  "resend_available_at": "2026-10-30T11:05:03.343307367Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "871911",
  "sent_at": "2026-10-30T11:05:02.346673731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42fa70af-19c0-4974-af05-4439d055a332",
  "code": "871911",
  "device_ref": "sandbox-32042"
}
```

```json
{
  "session_id": "13a126eb-e8a8-431f-acf4-91ab5d790fd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTIwMiwiaWF0IjoxNzkzMzU4MzAyLCJqdGkiOiIxZjliNDY2MS1kMTZmLTQ0Y2ItOTIyMC02NTExMDYwOWNmMWUiLCJzaWQiOiIxM2ExMjZlYi1lOGE4LTQzMWYtYWNmNC05MWFiNWQ3OTBmZDMifQ.xVnPNtM4ahNdsH1XlnvYb4UBQE4I2t_cUe2-PmzWPwY",
  "access_expires_at": "2026-10-30T11:20:02.596729957Z",
  "refresh_token": "W9r3OeihYhDQyJcDDpk8xnKQfErrH9L7ftekhxxAaGM",
  "refresh_expires_at": "2026-11-29T11:05:02.596312725Z",
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
  "command_id": "f21ee277-cb77-4d95-9c7b-629c13485156",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:03Z",
    "sequence": 1793358303179
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:03.19713Z",
  "last_location_at": "2026-10-30T11:05:03.19713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76383f87-5b4a-49ec-9576-67ec5148467d",
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
  "id": "fcf96b77-4093-4192-8e6b-dddb9c826e6c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:03.439041Z",
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
  "command_id": "fab6a758-b611-4f9f-b318-c25187fba61c",
  "quote_id": "fcf96b77-4093-4192-8e6b-dddb9c826e6c",
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
  "id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db91fa46-9712-4464-9e6e-0eeb2f66b984",
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
  "created_at": "2026-10-30T11:05:03.675679Z",
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
    "id": "ade3d115-c1f1-4fc2-8515-cac51286b2ad",
    "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
    "expires_at": "2026-10-30T11:05:18.678811Z",
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

`POST /api/driver/v1/offers/ade3d115-c1f1-4fc2-8515-cac51286b2ad/accept` → **200**

```json
{
  "command_id": "1663a49a-ceb4-4b86-9887-bf4ad7812cb1"
}
```

```json
{
  "id": "a65820b9-8e2c-4484-8a2a-122aa9294a28",
  "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78717b72-a3f9-47db-a41d-95e210e9f3a3",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78717b72-a3f9-47db-a41d-95e210e9f3a3",
  "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "assignment_id": "a65820b9-8e2c-4484-8a2a-122aa9294a28",
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

`POST /api/driver/v1/trips/78717b72-a3f9-47db-a41d-95e210e9f3a3/cancel` → **200**

```json
{
  "command_id": "0187309d-c554-4548-9c71-b391a2b45af8",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "78717b72-a3f9-47db-a41d-95e210e9f3a3",
  "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "assignment_id": "a65820b9-8e2c-4484-8a2a-122aa9294a28",
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

`GET /api/rider/v1/orders/d8382788-82d3-41e7-8afc-c22dd873aeca` → **200**

```json
{
  "id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "db91fa46-9712-4464-9e6e-0eeb2f66b984",
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
    "id": "a65820b9-8e2c-4484-8a2a-122aa9294a28",
    "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "78717b72-a3f9-47db-a41d-95e210e9f3a3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T11:05:03.675679Z",
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
    "id": "5c7bc2c9-0fbe-4327-8c6d-cffcb6032c9b",
    "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
    "expires_at": "2026-10-30T11:05:19.666594Z",
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

`POST /api/driver/v1/offers/5c7bc2c9-0fbe-4327-8c6d-cffcb6032c9b/accept` → **200**

```json
{
  "command_id": "684a203e-dc11-4af0-a2a4-a12d8167423d"
}
```

```json
{
  "id": "2447190a-e1cb-470d-8380-1405ef7657cd",
  "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f5442eb-1284-413d-a003-4fbb81fb0c52",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0f5442eb-1284-413d-a003-4fbb81fb0c52",
  "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "assignment_id": "2447190a-e1cb-470d-8380-1405ef7657cd",
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

`POST /api/driver/v1/trips/0f5442eb-1284-413d-a003-4fbb81fb0c52/cancel` → **200**

```json
{
  "command_id": "5f385358-79ec-4d1d-89d3-fac04646dfa2",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0f5442eb-1284-413d-a003-4fbb81fb0c52",
  "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
  "assignment_id": "2447190a-e1cb-470d-8380-1405ef7657cd",
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
    "id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T11:05:03.675679Z",
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
    "id": "49f9e9ca-6ad7-4823-92a3-edb117d30d39",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T11:05:01.140405Z",
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

`GET /api/operator/v1/orders/d8382788-82d3-41e7-8afc-c22dd873aeca/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T11:05:03.6762Z",
      "actor": {
        "type": "CLIENT",
        "id": "db91fa46-9712-4464-9e6e-0eeb2f66b984",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
        "quote_id": "fcf96b77-4093-4192-8e6b-dddb9c826e6c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "942776a8-9c89-41d8-8d0d-638ca527a84e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T11:05:03.678097Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
        "attempt_id": "fd7118ed-ca7d-487c-8764-ef0e40b3d1c8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "942776a8-9c89-41d8-8d0d-638ca527a84e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T11:05:03.684334Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ade3d115-c1f1-4fc2-8515-cac51286b2ad",
        "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "942776a8-9c89-41d8-8d0d-638ca527a84e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T11:05:04.159417Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ade3d115-c1f1-4fc2-8515-cac51286b2ad",
        "order_id": "d8382788-82d3-41e7-8afc-c22dd873aeca",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "a65820b9-8e2c-4484-8a2a-122aa9294a28"
      },
      "correlation_id": "1f0af0bc-a04b-4c74-bb9a-7b9105801b40"
```

Done: orders 49f9e9ca-6ad7-4823-92a3-edb117d30d39, d8382788-82d3-41e7-8afc-c22dd873aeca.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730628977",
  "device_ref": "sandbox-4338"
}
```

```json
{
  "challenge_id": "0759f74e-6a5a-44dd-a875-4c1b7fb55e6c",
  "expires_at": "2026-10-30T11:10:06.557718304Z",
  "resend_available_at": "2026-10-30T11:05:07.557718304Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730628977` → **200**

```json
{
  "phone": "+380730628977",
  "audience": "CLIENT",
  "code": "935729",
  "sent_at": "2026-10-30T11:05:06.559994312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0759f74e-6a5a-44dd-a875-4c1b7fb55e6c",
  "code": "935729",
  "device_ref": "sandbox-4338"
}
```

```json
{
  "session_id": "0bfaaaa7-70f7-4837-91e6-033c01a92df0",
  "subject": {
    "type": "CLIENT",
    "id": "5de631bd-380a-4e55-aad2-def6ebf77829"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGU2MzFiZC0zODBhLTRlNTUtYWFkMi1kZWY2ZWJmNzc4MjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjA2LCJpYXQiOjE3OTMzNTgzMDYsImp0aSI6Ijc4MGU1MzMyLTM5NjMtNDJiYi1iOWMyLTM5NGM1ZmE4MGM5MyIsInNpZCI6IjBiZmFhYWE3LTcwZjctNDgzNy05MWU2LTAzM2MwMWE5MmRmMCJ9.Am3RruNQELELuA1e1edVISXgtoAKd5O__jXvHJDaaEk",
  "access_expires_at": "2026-10-30T11:20:06.806898637Z",
  "refresh_token": "mTl06zCruiMDVG-KrHeIbevswMvfudqtBnkAscmTAUI",
  "refresh_expires_at": "2026-11-29T11:05:06.806326598Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "433ed896-8af9-4e83-a594-9a18b74d041b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e4c8d28e-72bf-4744-b200-2c4c6c1ac2c8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e4c8d28e-72bf-4744-b200-2c4c6c1ac2c8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9fbec222c134da7f6d75460236da98ce",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e4c8d28e-72bf-4744-b200-2c4c6c1ac2c8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730628977"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e4c8d28e-72bf-4744-b200-2c4c6c1ac2c8",
  "expires_at": "2026-10-30T11:35:07.03297Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e4c8d28e-72bf-4744-b200-2c4c6c1ac2c8` → **200**

```json
{
  "id": "e4c8d28e-72bf-4744-b200-2c4c6c1ac2c8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T11:35:07.03297Z",
  "card": {
    "id": "98c9bebd-390a-4550-9a6d-8543f184a57a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4465",
    "card_type": "Visa",
    "created_at": "2026-10-30T11:05:07.272434Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "98c9bebd-390a-4550-9a6d-8543f184a57a",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4465",
      "card_type": "Visa",
      "created_at": "2026-10-30T11:05:07.272434Z"
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
  "device_ref": "sandbox-18162"
}
```

```json
{
  "challenge_id": "7387f9e1-c27c-46ca-a0a7-30bbb95cc88e",
  "expires_at": "2026-10-30T11:10:07.758128725Z",
  "resend_available_at": "2026-10-30T11:05:08.758128725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "112741",
  "sent_at": "2026-10-30T11:05:07.761818827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7387f9e1-c27c-46ca-a0a7-30bbb95cc88e",
  "code": "112741",
  "device_ref": "sandbox-18162"
}
```

```json
{
  "session_id": "66859614-d9e8-44da-a2d6-bf2373956ab3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTIwOCwiaWF0IjoxNzkzMzU4MzA4LCJqdGkiOiIyZDIxMDZhYi0yZTM2LTQ2MWUtODRmMi1kZjhjZTgwOGNhYmIiLCJzaWQiOiI2Njg1OTYxNC1kOWU4LTQ0ZGEtYTJkNi1iZjIzNzM5NTZhYjMifQ.t_gM_QCDpy5ADcK9OxroBfkXqJZZhRCSIDtH6nP6hwI",
  "access_expires_at": "2026-10-30T11:20:08.030497037Z",
  "refresh_token": "dWWdttm1AWrHRMnnfo05e1Jbs9tItgbagNlEccA8Znc",
  "refresh_expires_at": "2026-11-29T11:05:08.02992944Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:03.19713Z",
  "last_location_at": "2026-10-30T11:05:03.19713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/271cae5a-4d21-4686-8cc7-4fe3372f0173/handover` → **200**

```json
{
  "command_id": "63072775-af93-486e-9001-e2fea4a2804b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:03.19713Z",
  "last_location_at": "2026-10-30T11:05:03.19713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/271cae5a-4d21-4686-8cc7-4fe3372f0173/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:08Z",
    "sequence": 1793358308716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:08.734155Z",
  "last_location_at": "2026-10-30T11:05:08.734155Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b90063d-f6b7-4d6e-9299-7b611682b7d4",
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
  "id": "229b0b49-46e4-4a81-a9dd-b83b721e205d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:09.096844Z",
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
  "command_id": "827cf3bd-4c11-41e0-ab8a-fb5f69dd49da",
  "quote_id": "229b0b49-46e4-4a81-a9dd-b83b721e205d",
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
  "id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
  "created_at": "2026-10-30T11:05:09.348597Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d811e9ff-d9d8-4b26-bfab-e8d38c330f74` → **200**

```json
{
  "id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
  "created_at": "2026-10-30T11:05:09.348597Z",
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
    "id": "ebb306f9-8ddf-4349-9050-66a941c1c1d3",
    "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
    "expires_at": "2026-10-30T11:05:24.51923Z",
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

`POST /api/driver/v1/offers/ebb306f9-8ddf-4349-9050-66a941c1c1d3/accept` → **200**

```json
{
  "command_id": "5f7cf519-0084-478d-8b73-eac3dda451eb"
}
```

```json
{
  "id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1ca1b874-aee0-4263-979b-720ab5a177da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1ca1b874-aee0-4263-979b-720ab5a177da",
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "assignment_id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
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

`POST /api/driver/v1/work-sessions/271cae5a-4d21-4686-8cc7-4fe3372f0173/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:10Z",
    "sequence": 1793358310580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:10.596826Z",
  "last_location_at": "2026-10-30T11:05:10.596826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1ca1b874-aee0-4263-979b-720ab5a177da/arrive` → **200**

```json
{
  "command_id": "e852ec8f-7e8f-43e3-8f4e-6183188d07ec",
  "expected_version": 0
}
```

```json
{
  "id": "1ca1b874-aee0-4263-979b-720ab5a177da",
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "assignment_id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
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
  "arrived_at": "2026-10-30T11:05:10.830971Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1ca1b874-aee0-4263-979b-720ab5a177da/start` → **200**

```json
{
  "command_id": "69195af5-aede-4d96-bf9e-8ff6c3180fbe",
  "expected_version": 1
}
```

```json
{
  "id": "1ca1b874-aee0-4263-979b-720ab5a177da",
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "assignment_id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
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
  "arrived_at": "2026-10-30T11:05:10.830971Z",
  "started_at": "2026-10-30T11:05:11.07961Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1ca1b874-aee0-4263-979b-720ab5a177da/complete` → **200**

```json
{
  "command_id": "e4d8f134-2347-4dfc-aa69-67c3698f8c4f",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:05:11Z",
  "cash_received": true
}
```

```json
{
  "id": "1ca1b874-aee0-4263-979b-720ab5a177da",
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "assignment_id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
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
  "arrived_at": "2026-10-30T11:05:10.830971Z",
  "started_at": "2026-10-30T11:05:11.07961Z",
  "completed_at": "2026-10-30T11:05:11.321259Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d811e9ff-d9d8-4b26-bfab-e8d38c330f74` → **200**

```json
{
  "id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
    "id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
    "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1ca1b874-aee0-4263-979b-720ab5a177da",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:05:09.348597Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d811e9ff-d9d8-4b26-bfab-e8d38c330f74` → **200**

```json
{
  "id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
    "id": "fbfe164a-d585-441e-813c-8893bd1abb1b",
    "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1ca1b874-aee0-4263-979b-720ab5a177da",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:05:09.348597Z",
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

`GET /api/rider/v1/orders/d811e9ff-d9d8-4b26-bfab-e8d38c330f74/tip` → **200**

```json
{
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
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
  "available_until": "2026-10-31T11:05:11.321259Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d811e9ff-d9d8-4b26-bfab-e8d38c330f74/tip` → **201**

```json
{
  "command_id": "11e167da-ee01-4569-a901-3c5f9daa1773",
  "amount_minor": 2500
}
```

```json
{
  "id": "da207f6a-0e05-433f-90e1-b2eea283433b",
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T11:05:13.537783Z"
}
```

`GET /api/rider/v1/orders/d811e9ff-d9d8-4b26-bfab-e8d38c330f74/tip` → **200**

```json
{
  "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
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
  "available_until": "2026-10-31T11:05:11.321259Z",
  "open": false,
  "tip": {
    "id": "da207f6a-0e05-433f-90e1-b2eea283433b",
    "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T11:05:13.537783Z"
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
      "id": "9af8b014-cea4-4853-9fbf-1978e2890d1e",
      "at": "2026-10-30T11:05:11.5593Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
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
      "id": "9fa1b5d6-22a1-44b1-b2e3-c77600ea5bf3",
      "at": "2026-10-30T11:05:14.608757Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
      "counterpart_id": null
    },
    {
      "id": "9af8b014-cea4-4853-9fbf-1978e2890d1e",
      "at": "2026-10-30T11:05:11.5593Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "928305c2-ddd9-4140-ac42-2711b2229547",
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
  "id": "2645f6fd-72b9-4f48-b6e7-7735e09e2d4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:15.467236Z",
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
  "session_id": "c4fa0644-2e25-43a5-9039-00cbb92292e6",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyMTUsImlhdCI6MTc5MzM1ODMxNSwianRpIjoiM2Y4MGUwMjctMGE3My00ODg2LTg3NzQtMGVkZTc3NzdmYjk0Iiwic2lkIjoiYzRmYTA2NDQtMmUyNS00M2E1LTkwMzktMDBjYmI5MjI5MmU2In0.D2NI3cWpvHCxlrIcviFSCviMJ4m7pN2SiEljNXCrwTQ",
  "access_expires_at": "2026-10-30T11:20:15.998462209Z",
  "refresh_token": "uDAs037a5XhtS6km-MNLVwaVBpmwaVcS1hiZbLQSnR4",
  "refresh_expires_at": "2026-10-30T23:05:15.998021853Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380730628977` → **200**

```json
{
  "client_id": "5de631bd-380a-4e55-aad2-def6ebf77829"
}
```

`POST /api/admin/v1/rider-wallets/5de631bd-380a-4e55-aad2-def6ebf77829/top-ups` → **201**

```json
{
  "command_id": "d39ff6e7-7ac1-4f5c-9353-d9ceb4436272",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
      "id": "0b2df30e-f637-4b00-b650-3e480f72ddd4",
      "at": "2026-10-30T11:05:16.441906Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "346d75b5-6ce4-419e-8f90-4fc5d886f239",
  "quote_id": "2645f6fd-72b9-4f48-b6e7-7735e09e2d4f",
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
  "id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
  "created_at": "2026-10-30T11:05:16.68192Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/61739d8c-27c6-4841-8dce-aa9183694a41` → **200**

```json
{
  "id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
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
  "created_at": "2026-10-30T11:05:16.68192Z",
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
    "id": "322e589e-6e70-487b-b384-c780a0398667",
    "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
    "expires_at": "2026-10-30T11:05:31.685861Z",
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

`POST /api/driver/v1/offers/322e589e-6e70-487b-b384-c780a0398667/accept` → **200**

```json
{
  "command_id": "6f2a36e7-2671-462f-b898-f2fed9f483ef"
}
```

```json
{
  "id": "b43adc77-850d-4bde-bf39-80b5643c65fb",
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "80a12e9b-5b74-4c1b-b233-bf669985da24",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "80a12e9b-5b74-4c1b-b233-bf669985da24",
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "assignment_id": "b43adc77-850d-4bde-bf39-80b5643c65fb",
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

`POST /api/driver/v1/work-sessions/271cae5a-4d21-4686-8cc7-4fe3372f0173/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:17Z",
    "sequence": 1793358317830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:17.8474Z",
  "last_location_at": "2026-10-30T11:05:17.8474Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/80a12e9b-5b74-4c1b-b233-bf669985da24/arrive` → **200**

```json
{
  "command_id": "b0f6438e-505f-4803-8801-098ffd179bf5",
  "expected_version": 0
}
```

```json
{
  "id": "80a12e9b-5b74-4c1b-b233-bf669985da24",
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "assignment_id": "b43adc77-850d-4bde-bf39-80b5643c65fb",
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
  "arrived_at": "2026-10-30T11:05:18.08219Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/80a12e9b-5b74-4c1b-b233-bf669985da24/start` → **200**

```json
{
  "command_id": "a434d253-e167-4669-affa-83f2b445b10e",
  "expected_version": 1
}
```

```json
{
  "id": "80a12e9b-5b74-4c1b-b233-bf669985da24",
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "assignment_id": "b43adc77-850d-4bde-bf39-80b5643c65fb",
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
  "arrived_at": "2026-10-30T11:05:18.08219Z",
  "started_at": "2026-10-30T11:05:18.315914Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/80a12e9b-5b74-4c1b-b233-bf669985da24/complete` → **200**

```json
{
  "command_id": "61a145c1-051d-429f-a482-5f122674c699",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:05:18Z",
  "cash_received": true
}
```

```json
{
  "id": "80a12e9b-5b74-4c1b-b233-bf669985da24",
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "assignment_id": "b43adc77-850d-4bde-bf39-80b5643c65fb",
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
  "arrived_at": "2026-10-30T11:05:18.08219Z",
  "started_at": "2026-10-30T11:05:18.315914Z",
  "completed_at": "2026-10-30T11:05:18.556974Z",
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
  "client_id": "5de631bd-380a-4e55-aad2-def6ebf77829",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "b014aa47-a25e-4db4-a940-95181ce2dd35",
      "at": "2026-10-30T11:05:18.716186Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41"
    },
    {
      "id": "0b2df30e-f637-4b00-b650-3e480f72ddd4",
      "at": "2026-10-30T11:05:16.441906Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
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

`GET /api/rider/v1/orders/61739d8c-27c6-4841-8dce-aa9183694a41/tip` → **200**

```json
{
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
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
  "available_until": "2026-10-31T11:05:18.556974Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/61739d8c-27c6-4841-8dce-aa9183694a41/tip` → **201**

```json
{
  "command_id": "29f291fc-22cf-433b-8176-2734710c23f5",
  "amount_minor": 2500
}
```

```json
{
  "id": "eb2d296d-baf6-4904-a85b-fb00287d5137",
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T11:05:19.500612Z"
}
```

`GET /api/rider/v1/orders/61739d8c-27c6-4841-8dce-aa9183694a41/tip` → **200**

```json
{
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
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
  "available_until": "2026-10-31T11:05:18.556974Z",
  "open": false,
  "tip": {
    "id": "eb2d296d-baf6-4904-a85b-fb00287d5137",
    "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T11:05:19.500612Z"
  }
}
```

`GET /api/rider/v1/orders/61739d8c-27c6-4841-8dce-aa9183694a41/tip` → **200**

```json
{
  "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
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
  "available_until": "2026-10-31T11:05:18.556974Z",
  "open": false,
  "tip": {
    "id": "eb2d296d-baf6-4904-a85b-fb00287d5137",
    "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T11:05:19.500612Z"
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
      "id": "1e4e2a16-fb3b-45c8-925f-9ace37016dfa",
      "at": "2026-10-30T11:05:20.740753Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
      "counterpart_id": null
    },
    {
      "id": "54080446-e4f9-48e8-ba45-52cc6020d63d",
      "at": "2026-10-30T11:05:18.711244Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "61739d8c-27c6-4841-8dce-aa9183694a41",
      "counterpart_id": null
    },
    {
      "id": "9fa1b5d6-22a1-44b1-b2e3-c77600ea5bf3",
      "at": "2026-10-30T11:05:14.608757Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
      "counterpart_id": null
    },
    {
      "id": "9af8b014-cea4-4853-9fbf-1978e2890d1e",
      "at": "2026-10-30T11:05:11.5593Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d811e9ff-d9d8-4b26-bfab-e8d38c330f74",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "271cae5a-4d21-4686-8cc7-4fe3372f0173",
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
  "last_heartbeat_at": "2026-10-30T11:05:17.8474Z",
  "last_location_at": "2026-10-30T11:05:17.8474Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/271cae5a-4d21-4686-8cc7-4fe3372f0173/close` → **200**

```json
{
  "command_id": "bdea4f37-2826-4f5d-9ad8-b32e13fd6c21",
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

Done: card order 61739d8c-27c6-4841-8dce-aa9183694a41.

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
  "phone": "+380735601267",
  "device_ref": "sandbox-8035"
}
```

```json
{
  "challenge_id": "45f3f029-fd8a-460a-9e3a-98ca6a3dc452",
  "expires_at": "2026-10-30T11:10:22.111788477Z",
  "resend_available_at": "2026-10-30T11:05:23.111788477Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735601267` → **200**

```json
{
  "phone": "+380735601267",
  "audience": "CLIENT",
  "code": "370394",
  "sent_at": "2026-10-30T11:05:22.114202107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45f3f029-fd8a-460a-9e3a-98ca6a3dc452",
  "code": "370394",
  "device_ref": "sandbox-8035"
}
```

```json
{
  "session_id": "6da6442f-4d2d-43d6-9f7a-af10b35ff296",
  "subject": {
    "type": "CLIENT",
    "id": "b32ef78f-fbbe-405a-a819-f93abaab6b3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzJlZjc4Zi1mYmJlLTQwNWEtYTgxOS1mOTNhYmFhYjZiM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjIyLCJpYXQiOjE3OTMzNTgzMjIsImp0aSI6IjQ2ZGVmMzZjLTM4ZmEtNDJlNy1hMGJmLWVjMDA3YWIwNTFjYyIsInNpZCI6IjZkYTY0NDJmLTRkMmQtNDNkNi05ZjdhLWFmMTBiMzVmZjI5NiJ9.hCQ6SmlsXuEKuJfxjejXypXZTpmmWYA4i3RdZzwmoz4",
  "access_expires_at": "2026-10-30T11:20:22.360050002Z",
  "refresh_token": "Y8XGIIsg9IWmqAp6AH26lVC_AmuelGuKnp5Cmtytajs",
  "refresh_expires_at": "2026-11-29T11:05:22.359657567Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "19de3fcb-f1b9-4edb-a731-aa5a4ac66471",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "0055660c-c741-4859-9672-1ad2dfd82c07",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0055660c-c741-4859-9672-1ad2dfd82c07",
    "orderDate": "1793358322",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "7573803af6ece917ddaf9b5b286f2291",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0055660c-c741-4859-9672-1ad2dfd82c07",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735601267"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0055660c-c741-4859-9672-1ad2dfd82c07",
  "created_at": "2026-10-30T11:05:22.596431Z",
  "expires_at": "2026-10-30T11:35:22.596431Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/0055660c-c741-4859-9672-1ad2dfd82c07` → **200**

```json
{
  "id": "0055660c-c741-4859-9672-1ad2dfd82c07",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T11:05:22.596431Z",
  "expires_at": "2026-10-30T11:35:22.596431Z",
  "completed_at": "2026-10-30T11:05:22.950847Z",
  "masked_pan": "41****0875",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b32ef78f-fbbe-405a-a819-f93abaab6b3f",
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
      "id": "aa87521f-d771-4818-9b2a-18c46da8dd0e",
      "at": "2026-10-30T11:05:22.976932Z",
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
  "client_id": "b32ef78f-fbbe-405a-a819-f93abaab6b3f",
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
      "id": "aa87521f-d771-4818-9b2a-18c46da8dd0e",
      "at": "2026-10-30T11:05:22.976932Z",
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
  "device_ref": "sandbox-18586"
}
```

```json
{
  "challenge_id": "c07ed7e9-cc1d-4073-b706-798a801b2148",
  "expires_at": "2026-10-30T11:10:23.64657908Z",
  "resend_available_at": "2026-10-30T11:05:24.64657908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "807195",
  "sent_at": "2026-10-30T11:05:23.648800028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c07ed7e9-cc1d-4073-b706-798a801b2148",
  "code": "807195",
  "device_ref": "sandbox-18586"
}
```

```json
{
  "session_id": "9523c12e-ae14-4116-95c7-11f4b417df97",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTIyMywiaWF0IjoxNzkzMzU4MzIzLCJqdGkiOiI2MGU2ZGI3OC1jZTFjLTQwMjMtOGI3Ni01YmU2NmFjYzVjODciLCJzaWQiOiI5NTIzYzEyZS1hZTE0LTQxMTYtOTVjNy0xMWY0YjQxN2RmOTcifQ.UXMwg3U8_0OSpLYTr1H0TYvQU0hAmC7jy8JI5EoxVdE",
  "access_expires_at": "2026-10-30T11:20:23.898767154Z",
  "refresh_token": "vl3NmI34oJpIWA_esBzPGQINWab7W5IWFepQEDlFgq4",
  "refresh_expires_at": "2026-11-29T11:05:23.898335721Z",
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
  "command_id": "779cf68a-dad9-46c9-8e9f-f39c1b979eb9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2b03200a-cd2f-4e87-b06b-515664a0e415",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2b03200a-cd2f-4e87-b06b-515664a0e415",
    "orderDate": "1793358324",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6a9ef29f8bf8c1f9dc2857af7853654e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2b03200a-cd2f-4e87-b06b-515664a0e415",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2b03200a-cd2f-4e87-b06b-515664a0e415",
  "created_at": "2026-10-30T11:05:24.436583Z",
  "expires_at": "2026-10-30T11:35:24.436583Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2b03200a-cd2f-4e87-b06b-515664a0e415` → **200**

```json
{
  "id": "2b03200a-cd2f-4e87-b06b-515664a0e415",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T11:05:24.436583Z",
  "expires_at": "2026-10-30T11:35:24.436583Z",
  "completed_at": "2026-10-30T11:05:24.667193Z",
  "masked_pan": "41****0525",
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
      "id": "75683522-55d7-40aa-a283-d0e4c088134f",
      "at": "2026-10-30T11:05:25.16831Z",
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
  "command_id": "0587d95e-c646-4b66-868c-c2ab5807041c",
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
  "correlation_id": "ea3e4151-6248-4826-a24b-fa13994d0fc3"
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
  "device_ref": "sandbox-25908"
}
```

```json
{
  "challenge_id": "de924248-1125-45eb-92db-42bf057053f0",
  "expires_at": "2026-10-30T11:10:26.593035001Z",
  "resend_available_at": "2026-10-30T11:05:27.593035001Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "948266",
  "sent_at": "2026-10-30T11:05:26.595252569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de924248-1125-45eb-92db-42bf057053f0",
  "code": "948266",
  "device_ref": "sandbox-25908"
}
```

```json
{
  "session_id": "d15b8219-2d1a-4eb7-ba7f-16948725ad59",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTIyNiwiaWF0IjoxNzkzMzU4MzI2LCJqdGkiOiI3ODY3ODMwMC0xZjZiLTQ5YzUtYTcyNC0zMWZkOGZkZjFjNjYiLCJzaWQiOiJkMTViODIxOS0yZDFhLTRlYjctYmE3Zi0xNjk0ODcyNWFkNTkifQ.W_kgvNGOiuY5KoZUk87Grmzba3JwYBQYaMIcgGdLwn0",
  "access_expires_at": "2026-10-30T11:20:26.838543302Z",
  "refresh_token": "qylcU-U6RV5awp0Jp38Xzn_MdwxV5GQ0M53y24DMsQk",
  "refresh_expires_at": "2026-11-29T11:05:26.838022078Z",
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
  "command_id": "6c795b63-eaf8-49b2-849e-5bff61492ca5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:27Z",
    "sequence": 1793358327275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04d2e01c-c2c7-48ef-8c66-2ccc88b877aa",
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
  "last_heartbeat_at": "2026-10-30T11:05:27.292563Z",
  "last_location_at": "2026-10-30T11:05:27.292563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638600811",
  "device_ref": "sandbox-3839"
}
```

```json
{
  "challenge_id": "4e039c38-bff5-4336-802d-0b5d8dc333e1",
  "expires_at": "2026-10-30T11:10:27.52015855Z",
  "resend_available_at": "2026-10-30T11:05:28.52015855Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638600811` → **200**

```json
{
  "phone": "+380638600811",
  "audience": "CLIENT",
  "code": "849913",
  "sent_at": "2026-10-30T11:05:27.523261998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e039c38-bff5-4336-802d-0b5d8dc333e1",
  "code": "849913",
  "device_ref": "sandbox-3839"
}
```

```json
{
  "session_id": "aaeb3c1e-9d06-4fcf-80df-275d8706ed46",
  "subject": {
    "type": "CLIENT",
    "id": "e7197be7-9349-4c3a-bb0a-218df3f0b9ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzE5N2JlNy05MzQ5LTRjM2EtYmIwYS0yMThkZjNmMGI5ZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjI3LCJpYXQiOjE3OTMzNTgzMjcsImp0aSI6Ijc4MDI3MzQxLTAxOGItNDM2ZS1iMjZiLWUzZWU3YWIyYTEzZCIsInNpZCI6ImFhZWIzYzFlLTlkMDYtNGZjZi04MGRmLTI3NWQ4NzA2ZWQ0NiJ9.2oI9J3DIYtILCc5VVTUl-ZMhIg0E7VhadRnR40Du-YY",
  "access_expires_at": "2026-10-30T11:20:27.767248963Z",
  "refresh_token": "5X8CO1ZLsqM2yj9vhseo5wWzViGvyn37jenrMNFg24I",
  "refresh_expires_at": "2026-11-29T11:05:27.76686527Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73bce920-14d3-41a9-bcab-d10337c6d067",
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
  "id": "925ff228-1b83-4df8-94ca-350101b80ba9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:27.994829Z",
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
  "command_id": "ab28f9db-c228-494c-88c6-ed67f949b277",
  "quote_id": "925ff228-1b83-4df8-94ca-350101b80ba9",
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
  "id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7197be7-9349-4c3a-bb0a-218df3f0b9ec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:05:28.233761Z",
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
    "id": "7a214675-2c80-4020-bc82-609044837215",
    "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
    "expires_at": "2026-10-30T11:05:43.236515Z",
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

`POST /api/driver/v1/offers/7a214675-2c80-4020-bc82-609044837215/accept` → **200**

```json
{
  "command_id": "1d838954-5aef-4072-a127-b4a1c38ed953"
}
```

```json
{
  "id": "f58e4648-28ab-415e-837d-99424957cc8c",
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "813cbcdd-7162-4cf8-8c7c-7e18eba5171e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "813cbcdd-7162-4cf8-8c7c-7e18eba5171e",
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "assignment_id": "f58e4648-28ab-415e-837d-99424957cc8c",
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

`POST /api/driver/v1/work-sessions/04d2e01c-c2c7-48ef-8c66-2ccc88b877aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:29Z",
    "sequence": 1793358329152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04d2e01c-c2c7-48ef-8c66-2ccc88b877aa",
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
  "last_heartbeat_at": "2026-10-30T11:05:29.168996Z",
  "last_location_at": "2026-10-30T11:05:29.168996Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/813cbcdd-7162-4cf8-8c7c-7e18eba5171e/arrive` → **200**

```json
{
  "command_id": "5ae02933-86e7-4ab8-a5f9-bb7067acb971",
  "expected_version": 0
}
```

```json
{
  "id": "813cbcdd-7162-4cf8-8c7c-7e18eba5171e",
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "assignment_id": "f58e4648-28ab-415e-837d-99424957cc8c",
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
  "arrived_at": "2026-10-30T11:05:29.397161Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/813cbcdd-7162-4cf8-8c7c-7e18eba5171e/start` → **200**

```json
{
  "command_id": "107b8cf7-a42e-4c85-934e-aa3648669f93",
  "expected_version": 1
}
```

```json
{
  "id": "813cbcdd-7162-4cf8-8c7c-7e18eba5171e",
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "assignment_id": "f58e4648-28ab-415e-837d-99424957cc8c",
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
  "arrived_at": "2026-10-30T11:05:29.397161Z",
  "started_at": "2026-10-30T11:05:29.639141Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/813cbcdd-7162-4cf8-8c7c-7e18eba5171e/complete` → **200**

```json
{
  "command_id": "3a1ce9b8-8032-4940-8b28-4073966e75a3",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:05:29Z",
  "cash_received": false
}
```

```json
{
  "id": "813cbcdd-7162-4cf8-8c7c-7e18eba5171e",
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "assignment_id": "f58e4648-28ab-415e-837d-99424957cc8c",
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
  "arrived_at": "2026-10-30T11:05:29.397161Z",
  "started_at": "2026-10-30T11:05:29.639141Z",
  "completed_at": "2026-10-30T11:05:29.878053Z",
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
  "session_id": "256cbf4b-16d2-4c44-8977-2aa62dce36ca",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyMzAsImlhdCI6MTc5MzM1ODMzMCwianRpIjoiNjcyNDc4YzEtMDAzYy00ODk5LWI4ZjUtOWVkZjBiZTBkNDY4Iiwic2lkIjoiMjU2Y2JmNGItMTZkMi00YzQ0LTg5NzctMmFhNjJkY2UzNmNhIn0.Bl1ee2IdAPy5Nisz9G9voLTwlMTkWJ3eDrfJS5pOAoU",
  "access_expires_at": "2026-10-30T11:20:30.369103458Z",
  "refresh_token": "M6XgN0NdLHR3HzS5pgaJzHx__F7P3GVfRmN6EH6Av-g",
  "refresh_expires_at": "2026-10-30T23:05:30.368731433Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/c50ceb01-339e-4c10-af28-b7aa2b845f84/cash-dispute` → **200**

```json
{
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e7197be7-9349-4c3a-bb0a-218df3f0b9ec",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T11:05:30.253635Z",
  "decide_by": "2026-11-13T11:05:30.253635Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T11:05:30.253635Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "e7197be7-9349-4c3a-bb0a-218df3f0b9ec",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T11:05:30.253635Z",
      "decide_by": "2026-11-13T11:05:30.253635Z",
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

`POST /api/admin/v1/orders/c50ceb01-339e-4c10-af28-b7aa2b845f84/cash-dispute/decide` → **400**

```json
{
  "command_id": "e4a57b25-ec5b-49ad-be0d-d53c6ab5c41c",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/c50ceb01-339e-4c10-af28-b7aa2b845f84/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7479370a-0192-430a-9309-b7fa66f28c88",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/c50ceb01-339e-4c10-af28-b7aa2b845f84/cash-dispute/decide` → **200**

```json
{
  "command_id": "fae7d715-0d8b-411e-8f89-2402c2af2c53",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e7197be7-9349-4c3a-bb0a-218df3f0b9ec",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T11:05:30.253635Z",
  "decide_by": "2026-11-13T11:05:30.253635Z",
  "decision": "PAY_DRIVER",
  "decided_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T11:05:31.363927Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/c50ceb01-339e-4c10-af28-b7aa2b845f84/cash-dispute/decide` → **409**

```json
{
  "command_id": "20b19324-fa41-448d-add2-f67d34d945a6",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/c50ceb01-339e-4c10-af28-b7aa2b845f84/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dec9bf5c-0041-414e-a6a2-c7b00a30fde3"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04d2e01c-c2c7-48ef-8c66-2ccc88b877aa",
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
  "last_heartbeat_at": "2026-10-30T11:05:29.168996Z",
  "last_location_at": "2026-10-30T11:05:29.168996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04d2e01c-c2c7-48ef-8c66-2ccc88b877aa/close` → **200**

```json
{
  "command_id": "98fdcee1-346c-40e3-820a-e3a85b38b8d3",
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
  "phone": "+380737615145",
  "device_ref": "sandbox-12315"
}
```

```json
{
  "challenge_id": "13afa6fb-6743-4460-93da-f01e44545ad0",
  "expires_at": "2026-10-30T11:10:32.321076608Z",
  "resend_available_at": "2026-10-30T11:05:33.321076608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737615145` → **200**

```json
{
  "phone": "+380737615145",
  "audience": "CLIENT",
  "code": "491970",
  "sent_at": "2026-10-30T11:05:32.323325962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13afa6fb-6743-4460-93da-f01e44545ad0",
  "code": "491970",
  "device_ref": "sandbox-12315"
}
```

```json
{
  "session_id": "bce3efcc-6b71-4ffb-8ac9-e98440917366",
  "subject": {
    "type": "CLIENT",
    "id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTY0ZjZiZS02MGRjLTQ3ZTgtOGNmNi03Y2NkYjczOTVlNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjMyLCJpYXQiOjE3OTMzNTgzMzIsImp0aSI6ImNkMDQwZDZkLTRjMzUtNGY5ZS1hNGViLTkwY2ZjOGJlYjhiOSIsInNpZCI6ImJjZTNlZmNjLTZiNzEtNGZmYi04YWM5LWU5ODQ0MDkxNzM2NiJ9.eBdUJOw743NiWEOCudE_81wFGURhLij05wILi6B7e6w",
  "access_expires_at": "2026-10-30T11:20:32.564324521Z",
  "refresh_token": "Ks3sUDOWkgWYgE82qMiXru0EDR0pq74iUTlVJI-urKY",
  "refresh_expires_at": "2026-11-29T11:05:32.563929721Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d3e98513-9d77-4971-bab1-009418e54b48",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d654b16e-613e-44c8-a49f-4493df2e4366",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d654b16e-613e-44c8-a49f-4493df2e4366",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5d2cfb887fb32751a167ac3079490893",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d654b16e-613e-44c8-a49f-4493df2e4366",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737615145"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d654b16e-613e-44c8-a49f-4493df2e4366",
  "expires_at": "2026-10-30T11:35:32.794804Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d654b16e-613e-44c8-a49f-4493df2e4366` → **200**

```json
{
  "id": "d654b16e-613e-44c8-a49f-4493df2e4366",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T11:35:32.794804Z",
  "card": {
    "id": "60702474-d567-4506-bc27-14a8e3b07576",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3826",
    "card_type": "Visa",
    "created_at": "2026-10-30T11:05:33.028959Z"
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
  "device_ref": "sandbox-25161"
}
```

```json
{
  "challenge_id": "8844236a-be95-4d04-b133-d5e2e967f4c2",
  "expires_at": "2026-10-30T11:10:33.276616219Z",
  "resend_available_at": "2026-10-30T11:05:34.276616219Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "922628",
  "sent_at": "2026-10-30T11:05:33.278768486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8844236a-be95-4d04-b133-d5e2e967f4c2",
  "code": "922628",
  "device_ref": "sandbox-25161"
}
```

```json
{
  "session_id": "09c33712-1dd9-48ea-90bc-a1565094cc1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTIzMywiaWF0IjoxNzkzMzU4MzMzLCJqdGkiOiI4OTU5NmFiMi0wOWVhLTRkMDktYTE2NC1lMTExN2JlYmNlN2UiLCJzaWQiOiIwOWMzMzcxMi0xZGQ5LTQ4ZWEtOTBiYy1hMTU2NTA5NGNjMWMifQ.kT_-wqErzjiOGmoNs-iXEMj36PCxZfd-Z0-bjIY8O-g",
  "access_expires_at": "2026-10-30T11:20:33.522219988Z",
  "refresh_token": "ujwU0rkJVN-wtBXD44LLZED-rq_Yy5rVeTSbN6MJLIo",
  "refresh_expires_at": "2026-11-29T11:05:33.521807643Z",
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
  "command_id": "8bbc60cb-8afb-4fb3-a497-923cbe4f85ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:33Z",
    "sequence": 1793358333966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71d5275d-a1d8-476e-8e45-8a01a233ea3e",
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
  "last_heartbeat_at": "2026-10-30T11:05:33.983196Z",
  "last_location_at": "2026-10-30T11:05:33.983196Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a4059202-03cb-4e0a-a515-1854c96e64aa",
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
  "id": "3b1d0d1a-cb0e-4761-aa75-b04337095d88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:34.240117Z",
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
  "command_id": "905c473c-be50-4d37-a503-8ae3806bf1f9",
  "quote_id": "3b1d0d1a-cb0e-4761-aa75-b04337095d88",
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
  "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
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
  "created_at": "2026-10-30T11:05:34.473967Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264` → **200**

```json
{
  "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
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
  "created_at": "2026-10-30T11:05:34.473967Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264` → **200**

```json
{
  "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
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
  "created_at": "2026-10-30T11:05:34.473967Z",
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
    "id": "bb1a7b30-fd84-419b-adfd-3209c4bea2df",
    "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
    "expires_at": "2026-10-30T11:05:50.312091Z",
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

`POST /api/driver/v1/offers/bb1a7b30-fd84-419b-adfd-3209c4bea2df/accept` → **200**

```json
{
  "command_id": "07cf54bc-f871-4c01-9a80-f31388ecfb8c"
}
```

```json
{
  "id": "a4e19860-441e-481a-b536-c968b328a3b1",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c5072846-f48e-452a-8602-a18067cab8c8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c5072846-f48e-452a-8602-a18067cab8c8",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "assignment_id": "a4e19860-441e-481a-b536-c968b328a3b1",
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

`POST /api/rider/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/messages` → **201**

```json
{
  "command_id": "3d45fa74-5e40-40c1-966c-417eefee7d57",
  "body": "Я біля входу, мій номер +380737615145, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "f50f4a8c-0e95-45eb-aa33-5e865308c2f2",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737615145, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T11:05:37.028256214Z"
}
```

`POST /api/driver/v1/trips/c5072846-f48e-452a-8602-a18067cab8c8/messages` → **201**

```json
{
  "command_id": "3078b99a-82a2-4f88-badc-b23a6322f8b0",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "9e1e18c4-c0f7-4a44-a697-a621d1b3f3dd",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T11:05:37.263199846Z"
}
```

`POST /api/driver/v1/work-sessions/71d5275d-a1d8-476e-8e45-8a01a233ea3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:37Z",
    "sequence": 1793358337514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71d5275d-a1d8-476e-8e45-8a01a233ea3e",
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
  "last_heartbeat_at": "2026-10-30T11:05:37.531382Z",
  "last_location_at": "2026-10-30T11:05:37.531382Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c5072846-f48e-452a-8602-a18067cab8c8/arrive` → **200**

```json
{
  "command_id": "dcc26811-e27f-4c61-b3b1-f25a07626707",
  "expected_version": 0
}
```

```json
{
  "id": "c5072846-f48e-452a-8602-a18067cab8c8",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "assignment_id": "a4e19860-441e-481a-b536-c968b328a3b1",
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
  "arrived_at": "2026-10-30T11:05:37.83416Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c5072846-f48e-452a-8602-a18067cab8c8/start` → **200**

```json
{
  "command_id": "c1d51eb1-3155-4c2c-be40-c88140885bf4",
  "expected_version": 1
}
```

```json
{
  "id": "c5072846-f48e-452a-8602-a18067cab8c8",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "assignment_id": "a4e19860-441e-481a-b536-c968b328a3b1",
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
  "arrived_at": "2026-10-30T11:05:37.83416Z",
  "started_at": "2026-10-30T11:05:38.074636Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/71d5275d-a1d8-476e-8e45-8a01a233ea3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:05:38Z",
    "sequence": 1793358338305
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71d5275d-a1d8-476e-8e45-8a01a233ea3e",
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
  "last_heartbeat_at": "2026-10-30T11:05:38.321677Z",
  "last_location_at": "2026-10-30T11:05:38.321677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/c5072846-f48e-452a-8602-a18067cab8c8/complete` → **200**

```json
{
  "command_id": "90a2158a-b79a-42ad-ab9d-db9e52b7d0dc",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:05:38Z",
  "cash_received": false
}
```

```json
{
  "id": "c5072846-f48e-452a-8602-a18067cab8c8",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "assignment_id": "a4e19860-441e-481a-b536-c968b328a3b1",
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
  "arrived_at": "2026-10-30T11:05:37.83416Z",
  "started_at": "2026-10-30T11:05:38.074636Z",
  "completed_at": "2026-10-30T11:05:38.557723Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264` → **200**

```json
{
  "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
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
    "id": "a4e19860-441e-481a-b536-c968b328a3b1",
    "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c5072846-f48e-452a-8602-a18067cab8c8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:05:34.473967Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264` → **200**

```json
{
  "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
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
    "id": "a4e19860-441e-481a-b536-c968b328a3b1",
    "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c5072846-f48e-452a-8602-a18067cab8c8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:05:34.473967Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264` → **200**

```json
{
  "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
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
    "id": "a4e19860-441e-481a-b536-c968b328a3b1",
    "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c5072846-f48e-452a-8602-a18067cab8c8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:05:34.473967Z",
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
  "session_id": "71d5275d-a1d8-476e-8e45-8a01a233ea3e",
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
  "last_heartbeat_at": "2026-10-30T11:05:38.321677Z",
  "last_location_at": "2026-10-30T11:05:38.321677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71d5275d-a1d8-476e-8e45-8a01a233ea3e/close` → **200**

```json
{
  "command_id": "151e980a-8e7f-483f-b41d-2470cd7d26e4",
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
  "session_id": "93973558-6d7f-4358-9a51-16ac618fa0e5",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyNDIsImlhdCI6MTc5MzM1ODM0MiwianRpIjoiNzEwNjhiZDYtZWE5Ni00MmIyLTlhOTUtNDk0MDBiMTI0NzIxIiwic2lkIjoiOTM5NzM1NTgtNmQ3Zi00MzU4LTlhNTEtMTZhYzYxOGZhMGU1In0.z-WbNA76MovkO2RnnAxIeC9Ma2VJhWjy5hQVJKGwsLw",
  "access_expires_at": "2026-10-30T11:20:42.215047579Z",
  "refresh_token": "Lp9nSp4ynH6CD4K6kVnazNtnDeUtH6fOwbgoo9iZdb4",
  "refresh_expires_at": "2026-10-30T23:05:42.214617308Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "18996406-b144-4741-8edd-8edfbbd72271"
}
```

`GET /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T11:05:42.673758692Z",
  "order": {
    "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
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
    "created_at": "2026-10-30T11:05:34.473967Z",
    "assigned_at": "2026-10-30T11:05:36.526562Z",
    "arrived_at": "2026-10-30T11:05:37.83416Z",
    "started_at": "2026-10-30T11:05:38.074636Z",
    "completed_at": "2026-10-30T11:05:38.557723Z"
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
    "id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
    "registered_at": "2026-10-30T11:05:32.56241Z",
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
      "created_at": "2026-10-30T11:05:34.475798Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T11:05:39.42465Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks` → **422**

```json
{
  "command_id": "933968c8-139d-4eac-b69f-b274529a5272",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "4885b77f-ab04-4a69-9857-220afac285b9"
}
```

`POST /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks` → **201**

```json
{
  "command_id": "8d852330-69e0-43f3-b529-b8450a3352b3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "37b17553-a42d-41d0-affb-9c9dfcab6a4c",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T11:05:43.194957Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks` → **201**

```json
{
  "command_id": "8d852330-69e0-43f3-b529-b8450a3352b3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "37b17553-a42d-41d0-affb-9c9dfcab6a4c",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T11:05:43.194957Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/e564f6be-60dc-47e8-8cf6-7ccdb7395e4d` → **200**

```json
{
  "client": {
    "id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
    "phone": "+380737615145",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T11:05:32.56241Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T11:05:34.473967Z",
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

`POST /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks/37b17553-a42d-41d0-affb-9c9dfcab6a4c/resolve` → **200**

```json
{
  "command_id": "7d4fdc15-fe50-4639-9c46-cca2d1e80bda",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "37b17553-a42d-41d0-affb-9c9dfcab6a4c",
  "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T11:05:43.194957Z",
  "resolved_at": "2026-10-30T11:05:43.960118Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/e564f6be-60dc-47e8-8cf6-7ccdb7395e4d` → **200**

```json
{
  "client": {
    "id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
    "phone": "+380737615145",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T11:05:32.56241Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T11:05:34.473967Z",
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

`GET /api/admin/v1/clients/e564f6be-60dc-47e8-8cf6-7ccdb7395e4d` → **200**

```json
{
  "client": {
    "id": "e564f6be-60dc-47e8-8cf6-7ccdb7395e4d",
    "phone": "+380737615145",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T11:05:32.56241Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T11:05:34.473967Z",
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

`POST /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks/37b17553-a42d-41d0-affb-9c9dfcab6a4c/resolve` → **409**

```json
{
  "command_id": "305c3b8b-3ee0-4dd4-8df2-05adc2a28277",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks/37b17553-a42d-41d0-affb-9c9dfcab6a4c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "326f91d9-fc6a-4a68-911a-9d7f449dd4ec"
}
```

`GET /api/admin/v1/orders/0c3e6aa9-3ec1-404d-965a-a2506b378264/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "37b17553-a42d-41d0-affb-9c9dfcab6a4c",
      "order_id": "0c3e6aa9-3ec1-404d-965a-a2506b378264",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T11:05:43.194957Z",
      "resolved_at": "2026-10-30T11:05:43.960118Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 0c3e6aa9-3ec1-404d-965a-a2506b378264 without phone or card digits; chargeback 37b17553-a42d-41d0-affb-9c9dfcab6a4c recorded and won.

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
  "session_id": "caa8a8a6-f9e9-4ea9-8002-6f091e8796ab",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyNDYsImlhdCI6MTc5MzM1ODM0NiwianRpIjoiMGY4N2RjMTctOTExMC00MmVjLWFjZWEtY2FiZTFkOGIzMjU3Iiwic2lkIjoiY2FhOGE4YTYtZjllOS00ZWE5LTgwMDItNmYwOTFlODc5NmFiIn0.-W2TgI97AL6Q9ZEeTXQ8GwAtsOpHjiwDPfAOaA534Kc",
  "access_expires_at": "2026-10-30T11:20:46.66515611Z",
  "refresh_token": "bHMDhdeDetwTV2wCp37-3vzUUW2eApX_HVMWaH87pLA",
  "refresh_expires_at": "2026-10-30T23:05:46.664764626Z",
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
  "phone": "+48600460983",
  "device_ref": "sandbox-7216"
}
```

```json
{
  "challenge_id": "1a633c98-9b7a-4a74-8716-f1a4aadc75b6",
  "expires_at": "2026-10-30T11:10:47.347119169Z",
  "resend_available_at": "2026-10-30T11:05:48.347119169Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600460983` → **200**

```json
{
  "phone": "+48600460983",
  "audience": "CLIENT",
  "code": "743934",
  "sent_at": "2026-10-30T11:05:47.349233915Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a633c98-9b7a-4a74-8716-f1a4aadc75b6",
  "code": "743934",
  "device_ref": "sandbox-7216"
}
```

```json
{
  "session_id": "cbf43d51-5424-4f5f-bfa5-0c1aa4bd8de0",
  "subject": {
    "type": "CLIENT",
    "id": "134286bd-7622-44c5-a1aa-b3448b488443"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzQyODZiZC03NjIyLTQ0YzUtYTFhYS1iMzQ0OGI0ODg0NDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjQ3LCJpYXQiOjE3OTMzNTgzNDcsImp0aSI6ImE2ZWI0Yzk1LTRlOWEtNDYwZS05ZjQ4LWRlMzQ5NmJlMWUxMCIsInNpZCI6ImNiZjQzZDUxLTU0MjQtNGY1Zi1iZmE1LTBjMWFhNGJkOGRlMCJ9.0lb-mS8-EoNxLB6ggObipwGI8uNBQe1WmE1EwmoZBpk",
  "access_expires_at": "2026-10-30T11:20:47.5983067Z",
  "refresh_token": "DzZSIT7D7iT4c847gwxdW_7RdG15xY-wr7ti2sPe3PA",
  "refresh_expires_at": "2026-11-29T11:05:47.597927194Z",
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
  "command_id": "942e7d2e-bee0-478d-a7ec-76bf66ab11e5",
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
  "correlation_id": "bfd16177-ad9f-428b-9327-d72d4491c01b",
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
  "command_id": "feebc316-57c4-467d-86f8-9f24d0d0018f",
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
  "paused_at": "2026-10-30T11:05:48.609426157Z",
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
  "command_id": "242415a7-3cbf-4a1a-9730-65fd9e910ad8",
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
  "id": "d15c3d1c-9b5b-4e67-9210-43c4b7ea95da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:49.087513Z",
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
  "command_id": "1865a537-f1a7-4737-a264-07ad56cf0851",
  "quote_id": "d15c3d1c-9b5b-4e67-9210-43c4b7ea95da",
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
  "correlation_id": "daa3b91f-397e-4598-842f-782b2727e5ba"
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
  "paused_at": "2026-10-30T11:05:48.609426Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "15758d44-336d-4673-aa0c-a078c2264f53",
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
  "command_id": "6f81dbcc-f8a3-4eff-a573-98f0c290b88d",
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
  "command_id": "41e50de1-292c-45ea-bca6-a19d4c82d0e0",
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
  "id": "803091f3-478a-4873-b6b9-13bfcce158ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:50.513363Z",
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
  "command_id": "8418cc00-2ac1-467e-8100-e1759c9f345b",
  "quote_id": "803091f3-478a-4873-b6b9-13bfcce158ce",
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
  "correlation_id": "3d0e6136-b737-4c4d-adb6-af3a5ec741bf"
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
  "command_id": "85cf6a12-e51a-421a-8d06-90a6eb08d6be",
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
      "from": "14:00",
      "to": "15:00"
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
      "from": "14:00",
      "to": "15:00"
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
  "command_id": "a176e843-8b06-4232-95ae-08114a1e8705",
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
  "id": "4563b045-6129-47e7-a79c-b6fd71305884",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:51.495298Z",
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
  "command_id": "e516af56-7278-4d26-89ca-2985736293ca",
  "quote_id": "4563b045-6129-47e7-a79c-b6fd71305884",
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
  "correlation_id": "e7dfc9ef-be40-4139-a483-0c0f80f527a8"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "73739535-3bdf-4da9-8261-1c22bb95780a",
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
  "correlation_id": "7b05dda1-5a06-401f-9f61-cb81013742f8"
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
      "from": "14:00",
      "to": "15:00"
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
  "command_id": "46b3d69f-5bc0-49e3-ab60-c7c842eeee76",
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
  "phone": "+380671510112",
  "device_ref": "sandbox-18213"
}
```

```json
{
  "challenge_id": "ecf246f3-ee88-4d89-9c8b-617cb9bf2e3b",
  "expires_at": "2026-10-30T11:10:52.825897969Z",
  "resend_available_at": "2026-10-30T11:05:53.825897969Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671510112` → **200**

```json
{
  "phone": "+380671510112",
  "audience": "CLIENT",
  "code": "547817",
  "sent_at": "2026-10-30T11:05:52.827974059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecf246f3-ee88-4d89-9c8b-617cb9bf2e3b",
  "code": "547817",
  "device_ref": "sandbox-18213"
}
```

```json
{
  "session_id": "d7d923ed-8aea-478f-abe5-1f021186e98c",
  "subject": {
    "type": "CLIENT",
    "id": "4fce794d-6b53-450b-8883-b0af1257b1e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZmNlNzk0ZC02YjUzLTQ1MGItODg4My1iMGFmMTI1N2IxZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjUzLCJpYXQiOjE3OTMzNTgzNTMsImp0aSI6ImMwOGI0OWE4LTYxNGQtNDMzNy1hZDhhLWFhMTQ2MGQzY2VjYiIsInNpZCI6ImQ3ZDkyM2VkLThhZWEtNDc4Zi1hYmU1LTFmMDIxMTg2ZTk4YyJ9.bCUPdBy_SFV6MqVVGM8bYmYq-egHfIIVvPn3Jwfk828",
  "access_expires_at": "2026-10-30T11:20:53.08606232Z",
  "refresh_token": "PuhKqfgJxiY35g382OmXmjeCDy0ay07tVMCq6sxAKww",
  "refresh_expires_at": "2026-11-29T11:05:53.085592441Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4fce794d-6b53-450b-8883-b0af1257b1e6",
  "session_id": "d7d923ed-8aea-478f-abe5-1f021186e98c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ace327b-eb8f-4829-8f3f-fe489d5c8a0d",
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
  "id": "cada6649-0638-495e-b310-4abde8921141",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:10:53.539686Z",
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
  "challenge_id": "d3329b28-5710-4100-8f39-2d40e0e57683",
  "expires_at": "2026-10-30T11:10:55.772144509Z",
  "resend_available_at": "2026-10-30T11:05:56.772144509Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671510112` → **200**

```json
{
  "phone": "+380671510112",
  "audience": "CLIENT",
  "code": "599061",
  "sent_at": "2026-10-30T11:05:55.774073088Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "9f6e5e87-11ac-40c9-b794-94f26611296e",
  "challenge_id": "d3329b28-5710-4100-8f39-2d40e0e57683",
  "otp_code": "599061"
}
```

```json
{
  "client_id": "4fce794d-6b53-450b-8883-b0af1257b1e6",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T11:05:56.025428781Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "4955d00c-ab0e-400e-88aa-ce9a514ce092",
  "quote_id": "cada6649-0638-495e-b310-4abde8921141",
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
  "correlation_id": "c76a9567-4404-4a44-9ddc-726cf8e80831"
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
  "session_id": "3b32b22b-d5cd-46b1-86c5-68f97c5e6eee",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyNTYsImlhdCI6MTc5MzM1ODM1NiwianRpIjoiNTM5YzE4NDUtNzRjZi00Mjk5LTllYzMtODJmNjcyNTNhNGFmIiwic2lkIjoiM2IzMmIyMmItZDVjZC00NmIxLTg2YzUtNjhmOTdjNWU2ZWVlIn0.2a45ixOHAUvMPF9ShdvhRLSUXtJhx182i2gRakGBVHY",
  "access_expires_at": "2026-10-30T11:20:56.75357038Z",
  "refresh_token": "IrhGEB8pjx62dkVCaZzFHyR3I82-Gvh96juokyDBjnI",
  "refresh_expires_at": "2026-10-30T23:05:56.753089605Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4fce794d-6b53-450b-8883-b0af1257b1e6",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T11:05:56.025429Z",
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

`POST /api/admin/v1/client-deletions/4fce794d-6b53-450b-8883-b0af1257b1e6/complete` → **200**

```json
{
  "command_id": "899f0cd0-1381-45fe-b858-26454c358d1d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4fce794d-6b53-450b-8883-b0af1257b1e6",
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
  "correlation_id": "41c12955-a5ab-49b4-8822-ff4b9d381520"
}
```

Done: client 4fce794d-6b53-450b-8883-b0af1257b1e6 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662733439",
  "device_ref": "sandbox-18470"
}
```

```json
{
  "challenge_id": "8e1000b8-ef01-4796-b6f4-22ff7fae45a5",
  "expires_at": "2026-10-30T11:10:57.68047108Z",
  "resend_available_at": "2026-10-30T11:05:58.68047108Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662733439` → **200**

```json
{
  "phone": "+380662733439",
  "audience": "CLIENT",
  "code": "458606",
  "sent_at": "2026-10-30T11:05:57.682824113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e1000b8-ef01-4796-b6f4-22ff7fae45a5",
  "code": "458606",
  "device_ref": "sandbox-18470"
}
```

```json
{
  "session_id": "24c1871f-b604-4c2c-a8b7-7f20219d0c19",
  "subject": {
    "type": "CLIENT",
    "id": "c83b9afd-b003-43a7-bfdd-31022c6579de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODNiOWFmZC1iMDAzLTQzYTctYmZkZC0zMTAyMmM2NTc5ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjU3LCJpYXQiOjE3OTMzNTgzNTcsImp0aSI6ImYxN2E3MTI4LTA4NzUtNGZiMS05NDNmLWViMjU0OTgxYTc5NCIsInNpZCI6IjI0YzE4NzFmLWI2MDQtNGMyYy1hOGI3LTdmMjAyMTlkMGMxOSJ9.dIKmOZFD7BteB4UnfUELhkVEHGtRSQffntAIZox6qq8",
  "access_expires_at": "2026-10-30T11:20:57.943150337Z",
  "refresh_token": "BPIWTaH4yfhHhTCEMRrYMIySIYTI57USgoN8MSlV_P8",
  "refresh_expires_at": "2026-11-29T11:05:57.942694949Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
  "session_id": "24c1871f-b604-4c2c-a8b7-7f20219d0c19",
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
  "session_id": "99c1b3a1-878b-4cfd-af6f-0e5e863914c3",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyNTgsImlhdCI6MTc5MzM1ODM1OCwianRpIjoiYzNhYWU1N2MtNzU0Ni00MTgzLWFiNDMtYzIzNDc5NmFmNWJmIiwic2lkIjoiOTljMWIzYTEtODc4Yi00Y2ZkLWFmNmYtMGU1ZTg2MzkxNGMzIn0.te8v4qtElY43PgKziuK-Ym14aijxHv1RVt9ZhQqj4ys",
  "access_expires_at": "2026-10-30T11:20:58.654186724Z",
  "refresh_token": "sN8hww7lk8delZA8H16BPzKg4JSd9M0g3PL9_Wg5DI4",
  "refresh_expires_at": "2026-10-30T23:05:58.653671728Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2733439&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
      "phone": "+380662733439",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T11:05:57.940934Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c83b9afd-b003-43a7-bfdd-31022c6579de` → **200**

```json
{
  "client": {
    "id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
    "phone": "+380662733439",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T11:05:57.940934Z",
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

`POST /api/admin/v1/clients/c83b9afd-b003-43a7-bfdd-31022c6579de/block` → **400**

```json
{
  "command_id": "398129dc-75d6-40f8-95b0-7b594da1b0ee",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c83b9afd-b003-43a7-bfdd-31022c6579de/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5a3036a5-f8c1-41cd-83f7-f532dc14072a",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c83b9afd-b003-43a7-bfdd-31022c6579de/block` → **200**

```json
{
  "command_id": "2da6e56d-4666-4869-85ae-389428dd49e7",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
  "phone": "+380662733439",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T11:05:57.940934Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T11:05:59.820454Z",
    "by": "19abc539-69d2-4037-81d3-63395a19359c"
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
  "correlation_id": "9b5af5aa-d323-4e45-b630-c9690eaf1741"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662733439",
  "device_ref": "sandbox-18029"
}
```

```json
{
  "challenge_id": "1f20a4d7-beb4-4e02-9241-8e3d946fbfc9",
  "expires_at": "2026-10-30T11:11:02.302187761Z",
  "resend_available_at": "2026-10-30T11:06:03.302187761Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662733439` → **200**

```json
{
  "phone": "+380662733439",
  "audience": "CLIENT",
  "code": "126371",
  "sent_at": "2026-10-30T11:06:02.304395264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1f20a4d7-beb4-4e02-9241-8e3d946fbfc9",
  "code": "126371",
  "device_ref": "sandbox-18029"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "b2064d4e-212f-44a8-af92-7dd10baf047c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c83b9afd-b003-43a7-bfdd-31022c6579de` → **200**

```json
{
  "client": {
    "id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
    "phone": "+380662733439",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T11:05:57.940934Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T11:05:59.820454Z",
      "by": "19abc539-69d2-4037-81d3-63395a19359c"
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

`POST /api/admin/v1/clients/c83b9afd-b003-43a7-bfdd-31022c6579de/unblock` → **200**

```json
{
  "command_id": "69be61e0-be8e-4696-a3ea-2037542b3348",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
  "phone": "+380662733439",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T11:05:57.940934Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662733439",
  "device_ref": "sandbox-29314"
}
```

```json
{
  "challenge_id": "d83fc0b5-16e2-436a-acfa-a3de19c9c35f",
  "expires_at": "2026-10-30T11:11:05.291750629Z",
  "resend_available_at": "2026-10-30T11:06:06.291750629Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662733439` → **200**

```json
{
  "phone": "+380662733439",
  "audience": "CLIENT",
  "code": "582884",
  "sent_at": "2026-10-30T11:06:05.293881765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d83fc0b5-16e2-436a-acfa-a3de19c9c35f",
  "code": "582884",
  "device_ref": "sandbox-29314"
}
```

```json
{
  "session_id": "77d81099-a7f9-4f9b-a25e-d10a9408d2f6",
  "subject": {
    "type": "CLIENT",
    "id": "c83b9afd-b003-43a7-bfdd-31022c6579de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODNiOWFmZC1iMDAzLTQzYTctYmZkZC0zMTAyMmM2NTc5ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjY1LCJpYXQiOjE3OTMzNTgzNjUsImp0aSI6IjJlNzk5ZjljLWZiMzktNDRhNi1iOWExLTk3YzUwMWNiNjEwNCIsInNpZCI6Ijc3ZDgxMDk5LWE3ZjktNGY5Yi1hMjVlLWQxMGE5NDA4ZDJmNiJ9.H43XT3rSyS_RiTpmMMMn3qLz16-F9-bKwi8S2ORZPlQ",
  "access_expires_at": "2026-10-30T11:21:05.805962273Z",
  "refresh_token": "wmGeuZYxZHOc73WE4x6tmR90zDthhXRjrg1gklF9_xw",
  "refresh_expires_at": "2026-11-29T11:06:05.805581144Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c83b9afd-b003-43a7-bfdd-31022c6579de",
  "session_id": "77d81099-a7f9-4f9b-a25e-d10a9408d2f6",
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
  "phone": "+380664214081",
  "device_ref": "sandbox-5319"
}
```

```json
{
  "challenge_id": "b73db41e-74c3-4e52-a47c-716da80c1863",
  "expires_at": "2026-10-30T11:11:06.273832691Z",
  "resend_available_at": "2026-10-30T11:06:07.273832691Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664214081` → **200**

```json
{
  "phone": "+380664214081",
  "audience": "CLIENT",
  "code": "838218",
  "sent_at": "2026-10-30T11:06:06.27590131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b73db41e-74c3-4e52-a47c-716da80c1863",
  "code": "838218",
  "device_ref": "sandbox-5319"
}
```

```json
{
  "session_id": "f5d3aec3-e235-4561-96f5-f78aa8df9737",
  "subject": {
    "type": "CLIENT",
    "id": "a0f25366-0483-4f78-870b-39d2168596b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMGYyNTM2Ni0wNDgzLTRmNzgtODcwYi0zOWQyMTY4NTk2YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjY2LCJpYXQiOjE3OTMzNTgzNjYsImp0aSI6ImZlMTUzODFkLWRjOGUtNDkzNS1hOTI2LTE0ZjRjYjA2YTZkMyIsInNpZCI6ImY1ZDNhZWMzLWUyMzUtNDU2MS05NmY1LWY3OGFhOGRmOTczNyJ9.BMgmxgfM3ovQay0NOoWlv-RQC2aIg-wUZHuifL0Al4c",
  "access_expires_at": "2026-10-30T11:21:06.536674852Z",
  "refresh_token": "sV_e675zimzGqUo01XaXSG7u7vCvlVogjGspd3kdzgQ",
  "refresh_expires_at": "2026-11-29T11:06:06.536068002Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96bbd229-19a5-49c4-9157-91f5c69f90e3",
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
  "id": "c25a8359-69c1-4c8f-ad60-d6595de735d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:11:06.776308Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 962cea8f-3b02-4933-953a-c53e9c0f5d49) → **201**

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
  "session_id": "8a9e2b80-0aea-43ef-aa50-d90c91b3fa6e",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyNjcsImlhdCI6MTc5MzM1ODM2NywianRpIjoiMWViOTgyOTAtOTBmOS00NDFkLWFlMGItODUzOGUxODVhZGRkIiwic2lkIjoiOGE5ZTJiODAtMGFlYS00M2VmLWFhNTAtZDkwYzkxYjNmYTZlIn0.CUw0p_-ba8Fyu8B98JYqOd8EQIk3D9GzIm_YK1nBM_w",
  "access_expires_at": "2026-10-30T11:21:07.409471894Z",
  "refresh_token": "GY3UmOcnYd4miiTWopUPzAfFlmVsSdJ4Q5vRrvhGlAw",
  "refresh_expires_at": "2026-10-30T23:06:07.408827919Z",
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
  "session_id": "4cc4d8ec-bbb2-4b17-9f80-a159acb3607f",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyNjcsImlhdCI6MTc5MzM1ODM2NywianRpIjoiNDQ0MzM5NzEtNjNlYS00YWRiLWJjMTctYmQ5ZmJhZjQ3YjAxIiwic2lkIjoiNGNjNGQ4ZWMtYmJiMi00YjE3LTlmODAtYTE1OWFjYjM2MDdmIn0.F-TVWawwU4ke_wz2bXEx8ptOBkPdWj1zp1ipzGletdg",
  "access_expires_at": "2026-10-30T11:21:07.890880785Z",
  "refresh_token": "wn6oeNeTrPysNE5uAU9162lRrK5_Fmt5DxhkxE-NesE",
  "refresh_expires_at": "2026-10-30T23:06:07.890497954Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7d265ac4-caa0-4ce3-bed6-b70e13e030e2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T11:06:07.033889Z",
      "actor": {
        "type": "CLIENT",
        "id": "a0f25366-0483-4f78-870b-39d2168596b8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
        "quote_id": "c25a8359-69c1-4c8f-ad60-d6595de735d0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "962cea8f-3b02-4933-953a-c53e9c0f5d49"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T11:06:07.035371Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
        "attempt_id": "2d3c84ef-bf0d-4ede-b8a1-5e9a92b2ddea",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "962cea8f-3b02-4933-953a-c53e9c0f5d49"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T11:06:07.043586Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
        "attempt_id": "2d3c84ef-bf0d-4ede-b8a1-5e9a92b2ddea"
      },
      "correlation_id": "962cea8f-3b02-4933-953a-c53e9c0f5d49"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "2d3c84ef-bf0d-4ede-b8a1-5e9a92b2ddea",
        "generation": 1,
        "started_at": "2026-10-30T11:06:07.034606Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T11:06:07.043586Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T11:06:07.035974Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/962cea8f-3b02-4933-953a-c53e9c0f5d49` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2:0",
      "order_id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
      "at": "2026-10-30T11:06:07.033889Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2:1",
      "order_id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
      "at": "2026-10-30T11:06:07.035371Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2:2",
      "order_id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
      "at": "2026-10-30T11:06:07.043586Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9ee19e43-4064-400a-aa1c-3467fdadcb67` → **200**

```json
{
  "found": []
}
```

Done: request 962cea8f-3b02-4933-953a-c53e9c0f5d49 — order 7d265ac4-caa0-4ce3-bed6-b70e13e030e2 found by its id.

`GET /api/rider/v1/orders/7d265ac4-caa0-4ce3-bed6-b70e13e030e2` → **200**

```json
{
  "id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a0f25366-0483-4f78-870b-39d2168596b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:06:07.033491Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7d265ac4-caa0-4ce3-bed6-b70e13e030e2/cancel` → **200**

```json
{
  "command_id": "d43375be-cd87-4dd9-b998-09199d3d33e7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7d265ac4-caa0-4ce3-bed6-b70e13e030e2",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a0f25366-0483-4f78-870b-39d2168596b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:06:07.033491Z",
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
  "phone": "+380633821250",
  "device_ref": "sandbox-6808"
}
```

```json
{
  "challenge_id": "c9eac69d-b77d-48cc-8b7e-7cf21d657702",
  "expires_at": "2026-10-30T11:11:09.310114639Z",
  "resend_available_at": "2026-10-30T11:06:10.310114639Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633821250` → **200**

```json
{
  "phone": "+380633821250",
  "audience": "CLIENT",
  "code": "365671",
  "sent_at": "2026-10-30T11:06:09.313006516Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9eac69d-b77d-48cc-8b7e-7cf21d657702",
  "code": "365671",
  "device_ref": "sandbox-6808"
}
```

```json
{
  "session_id": "5cb0be6a-055c-4459-af36-978172fa29e7",
  "subject": {
    "type": "CLIENT",
    "id": "48360ad8-5420-445d-ba20-3c3087a98707"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODM2MGFkOC01NDIwLTQ0NWQtYmEyMC0zYzMwODdhOTg3MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjY5LCJpYXQiOjE3OTMzNTgzNjksImp0aSI6IjViMmZmNTc3LTExMDAtNDc5Zi05ZjkwLTQxYzZiOGNmMWM0NiIsInNpZCI6IjVjYjBiZTZhLTA1NWMtNDQ1OS1hZjM2LTk3ODE3MmZhMjllNyJ9.bYti5ThaXcHTW95nTu5u-4Q8K2Q6n25o698hJMQi1Io",
  "access_expires_at": "2026-10-30T11:21:09.562435837Z",
  "refresh_token": "_JYo-DzRhrnoQCLjIfAYYkxW0LvQXPP2FJYKwx9QfwI",
  "refresh_expires_at": "2026-11-29T11:06:09.562006257Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "50936d6a-b852-4a39-b504-e3a2995a790d",
  "expires_at": "2026-10-30T11:11:11.79180223Z",
  "resend_available_at": "2026-10-30T11:06:12.79180223Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633821250` → **200**

```json
{
  "phone": "+380633821250",
  "audience": "CLIENT",
  "code": "346728",
  "sent_at": "2026-10-30T11:06:11.793657417Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "87c4cf03-00e2-4c78-9a14-76042501cc4e",
  "challenge_id": "50936d6a-b852-4a39-b504-e3a2995a790d",
  "otp_code": "346728"
}
```

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "PENDING",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e` → **200**

```json
{
  "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
  "state": "READY",
  "created_at": "2026-10-30T11:06:12.059955Z",
  "ready_at": "2026-10-30T11:06:19.566298Z",
  "expires_at": "2026-11-06T11:06:19.566298Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634456783",
  "device_ref": "sandbox-23106"
}
```

```json
{
  "challenge_id": "303f4e0b-4a2e-4693-ad4f-70a86d2b7ea8",
  "expires_at": "2026-10-30T11:11:19.87760702Z",
  "resend_available_at": "2026-10-30T11:06:20.87760702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634456783` → **200**

```json
{
  "phone": "+380634456783",
  "audience": "CLIENT",
  "code": "344427",
  "sent_at": "2026-10-30T11:06:19.880567428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "303f4e0b-4a2e-4693-ad4f-70a86d2b7ea8",
  "code": "344427",
  "device_ref": "sandbox-23106"
}
```

```json
{
  "session_id": "90985183-ae96-4930-901d-682efab4f589",
  "subject": {
    "type": "CLIENT",
    "id": "72a0cefe-4661-44f9-9417-e1598a585a48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmEwY2VmZS00NjYxLTQ0ZjktOTQxNy1lMTU5OGE1ODVhNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjgwLCJpYXQiOjE3OTMzNTgzODAsImp0aSI6ImFkNjk0YTg2LWQyNDUtNDJiMy1iY2MwLTJmZWFhNTgyOGMxNSIsInNpZCI6IjkwOTg1MTgzLWFlOTYtNDkzMC05MDFkLTY4MmVmYWI0ZjU4OSJ9.uFIR3WqBOX_eYU3o9sP4hXeQY4S5B1x8Gu93mHXGYRQ",
  "access_expires_at": "2026-10-30T11:21:20.127067385Z",
  "refresh_token": "6N_POObFKw_pkGB9OPaPkY-4IeJl8tkMmD_5L_GD7AE",
  "refresh_expires_at": "2026-11-29T11:06:20.126667618Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/4cf13339-f312-41e4-8f5d-f4ef602dfb7e/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "66cc8a7b-f888-4714-80ed-9ae3c999afb6"
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
  "session_id": "63726016-85fb-492b-937e-dc4d85020962",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyODAsImlhdCI6MTc5MzM1ODM4MCwianRpIjoiZjY2MjdmZjEtNDQ1MC00YjRiLWI2NTgtNjhkNzAyYTQyNjQ2Iiwic2lkIjoiNjM3MjYwMTYtODVmYi00OTJiLTkzN2UtZGM0ZDg1MDIwOTYyIn0.BIncomFOXnW6Wfbn5UqxAcA0ZNC-Ylvkkh0Pzt3qgkI",
  "access_expires_at": "2026-10-30T11:21:20.962649221Z",
  "refresh_token": "2rc0BfU1lXmhxB4AATv7cYQuO_-bLZ6HLvQxUFWQ9w0",
  "refresh_expires_at": "2026-10-30T23:06:20.962225269Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "48360ad8-5420-445d-ba20-3c3087a98707",
  "session_id": "5cb0be6a-055c-4459-af36-978172fa29e7",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/48360ad8-5420-445d-ba20-3c3087a98707/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "4cf13339-f312-41e4-8f5d-f4ef602dfb7e",
      "state": "READY",
      "created_at": "2026-10-30T11:06:12.059955Z",
      "ready_at": "2026-10-30T11:06:19.566298Z",
      "expires_at": "2026-11-06T11:06:19.566298Z",
      "size_bytes": 1030
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
  "device_ref": "sandbox-14573"
}
```

```json
{
  "challenge_id": "32e23b97-bb45-4856-be2a-e14856d19b5e",
  "expires_at": "2026-10-30T11:11:21.655037671Z",
  "resend_available_at": "2026-10-30T11:06:22.655037671Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "700333",
  "sent_at": "2026-10-30T11:06:21.657250688Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32e23b97-bb45-4856-be2a-e14856d19b5e",
  "code": "700333",
  "device_ref": "sandbox-14573"
}
```

```json
{
  "session_id": "a6258c6e-78a6-4414-8c0d-348318ab5d58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTI4MSwiaWF0IjoxNzkzMzU4MzgxLCJqdGkiOiJkOWJlYjJhZi04ZGU3LTQzZTctYTY5ZC03ODBmZmQ3MWRkYTIiLCJzaWQiOiJhNjI1OGM2ZS03OGE2LTQ0MTQtOGMwZC0zNDgzMThhYjVkNTgifQ.aALJnKRGIF4kyHIE9VQ3kA3aaA-mpyHW5_i2ghhVfrA",
  "access_expires_at": "2026-10-30T11:21:21.910231161Z",
  "refresh_token": "b2NnSWecyo-WpSBMB54rIIZt27gKNNp1XiVIMTFp33s",
  "refresh_expires_at": "2026-11-29T11:06:21.909747381Z",
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
  "device_ref": "sandbox-12559"
}
```

```json
{
  "challenge_id": "b5f7d9b3-db55-4635-bea5-e7125ed58916",
  "expires_at": "2026-10-30T11:11:22.34527125Z",
  "resend_available_at": "2026-10-30T11:06:23.34527125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "969585",
  "sent_at": "2026-10-30T11:06:22.347625679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5f7d9b3-db55-4635-bea5-e7125ed58916",
  "code": "969585",
  "device_ref": "sandbox-12559"
}
```

```json
{
  "session_id": "86c68ba2-114f-4d9b-8230-2865cb28c054",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTI4MiwiaWF0IjoxNzkzMzU4MzgyLCJqdGkiOiI4OWE2OTE3ZS1hMmQ2LTRhNzAtYjIwNi1lZGZkOGQ5ZDhhM2QiLCJzaWQiOiI4NmM2OGJhMi0xMTRmLTRkOWItODIzMC0yODY1Y2IyOGMwNTQifQ.ououhLz1xhcOg6bN3vJvCXJ5NgPF-xghr_NuAP6NnZY",
  "access_expires_at": "2026-10-30T11:21:22.593077087Z",
  "refresh_token": "NPACIy5v9CcqP1idK_AANSwlv93z-ZV2V_7JdlpPQGY",
  "refresh_expires_at": "2026-11-29T11:06:22.592654988Z",
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
  "command_id": "c639a04c-9b1c-484b-b507-83fe9cb5a980",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:23Z",
    "sequence": 1793358383298
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e9d73bb-9eb5-492d-b4c2-be191a5dfb1c",
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
  "last_heartbeat_at": "2026-10-30T11:06:23.046822Z",
  "last_location_at": "2026-10-30T11:06:23.046822Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-31981"
}
```

```json
{
  "challenge_id": "0aac6bf1-2438-477b-a8b6-d421aa91c102",
  "expires_at": "2026-10-30T11:11:23.269138301Z",
  "resend_available_at": "2026-10-30T11:06:24.269138301Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "971949",
  "sent_at": "2026-10-30T11:06:23.271449647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0aac6bf1-2438-477b-a8b6-d421aa91c102",
  "code": "971949",
  "device_ref": "sandbox-31981"
}
```

```json
{
  "session_id": "e83672e8-1a4f-4ecb-b328-ffc3af54d9ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTI4MywiaWF0IjoxNzkzMzU4MzgzLCJqdGkiOiI1MzRlNTIxNS1hZDRiLTRmOTYtYTk1Yi04NjdmZTE5MjNiNTEiLCJzaWQiOiJlODM2NzJlOC0xYTRmLTRlY2ItYjMyOC1mZmMzYWY1NGQ5Y2EifQ.ISEUbN_ZsSSjB-dKWIJiWAikru6rTG3YAPGXKyirnAU",
  "access_expires_at": "2026-10-30T11:21:23.520854505Z",
  "refresh_token": "EZfOAqYLjr5ygS7oC9aQPVtk67NYnGMlTkzF4udzv98",
  "refresh_expires_at": "2026-11-29T11:06:23.520480296Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7067664d-38c2-457f-838b-532275c628ee",
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
  "last_heartbeat_at": "2026-10-30T11:05:02.111969Z",
  "last_location_at": "2026-10-30T11:05:02.111969Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7067664d-38c2-457f-838b-532275c628ee/handover` → **200**

```json
{
  "command_id": "59be404e-8201-427d-b6fb-98ad7bc149db",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7067664d-38c2-457f-838b-532275c628ee",
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
  "last_heartbeat_at": "2026-10-30T11:05:02.111969Z",
  "last_location_at": "2026-10-30T11:05:02.111969Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7067664d-38c2-457f-838b-532275c628ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:24Z",
    "sequence": 1793358384202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7067664d-38c2-457f-838b-532275c628ee",
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
  "last_heartbeat_at": "2026-10-30T11:06:24.219172Z",
  "last_location_at": "2026-10-30T11:06:24.219172Z",
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
  "session_id": "8bfa9377-1967-4d3e-b4bf-2f3247092346",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyODQsImlhdCI6MTc5MzM1ODM4NCwianRpIjoiMDQ1MGU1N2UtZDc3ZS00ODU5LTkxMzYtZWRiZmQ0MGYyZjYyIiwic2lkIjoiOGJmYTkzNzctMTk2Ny00ZDNlLWI0YmYtMmYzMjQ3MDkyMzQ2In0.e_mVq4wv1mmw_Qj_F90tH3gcW5lBqcYvneF22sSLSoA",
  "access_expires_at": "2026-10-30T11:21:24.707111627Z",
  "refresh_token": "eNmDqx5V2tns6DpYqzmgoCogka4o97WIJ8G6bwmkEzg",
  "refresh_expires_at": "2026-10-30T23:06:24.706719242Z",
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
  "session_id": "df67ab87-d93a-409b-88f5-ceb9512790d9",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyODUsImlhdCI6MTc5MzM1ODM4NSwianRpIjoiMGNmZTEzMDAtNDhmMS00NzAxLTg1N2QtNWIyNDE3MGY0ZjNjIiwic2lkIjoiZGY2N2FiODctZDkzYS00MDliLTg4ZjUtY2ViOTUxMjc5MGQ5In0.nfH-ZsEbYbL85AJ6xow_NqOiR1TL5FE-4LhGNEa0u9k",
  "access_expires_at": "2026-10-30T11:21:25.189253202Z",
  "refresh_token": "ge-NO_YSdveeVRxbG9tMTSROCyie66vaqXTu-wR-QrI",
  "refresh_expires_at": "2026-10-30T23:06:25.188834728Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687934065",
  "device_ref": "sandbox-3332"
}
```

```json
{
  "challenge_id": "00885d9a-8ec1-4ce0-9400-52060097cac0",
  "expires_at": "2026-10-30T11:11:25.40672098Z",
  "resend_available_at": "2026-10-30T11:06:26.40672098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687934065` → **200**

```json
{
  "phone": "+380687934065",
  "audience": "CLIENT",
  "code": "602665",
  "sent_at": "2026-10-30T11:06:25.408930942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00885d9a-8ec1-4ce0-9400-52060097cac0",
  "code": "602665",
  "device_ref": "sandbox-3332"
}
```

```json
{
  "session_id": "d68d6dd7-4c73-4145-98f3-a0a4dc3daa8e",
  "subject": {
    "type": "CLIENT",
    "id": "77e91a20-8608-454d-9802-32dc283489c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2U5MWEyMC04NjA4LTQ1NGQtOTgwMi0zMmRjMjgzNDg5YzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5Mjg1LCJpYXQiOjE3OTMzNTgzODUsImp0aSI6IjI3NzBkZGViLWRiYmQtNGRjNS04NzA1LTFhOTlmYTQzOTJiZCIsInNpZCI6ImQ2OGQ2ZGQ3LTRjNzMtNDE0NS05OGYzLWEwYTRkYzNkYWE4ZSJ9.1E7DXzW5S8Efmx_AH2Sceewkng8qUhKBAEjld9OYVTk",
  "access_expires_at": "2026-10-30T11:21:25.651060402Z",
  "refresh_token": "s4pnRBHN_2RCNX_8YtJyG6xymLFhjXUZeZYAtMeEqeg",
  "refresh_expires_at": "2026-11-29T11:06:25.650685572Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73f7e677-b637-4a30-b26a-e336a77b35ce",
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
  "id": "4bb9be63-4d78-4fee-9fcc-408b847bd029",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:11:25.913808Z",
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
  "command_id": "4c529034-f6d7-483e-b866-d1f7b3bc2498",
  "quote_id": "4bb9be63-4d78-4fee-9fcc-408b847bd029",
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
  "id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77e91a20-8608-454d-9802-32dc283489c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:06:26.152496Z",
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
    "id": "b5ee3195-4658-4663-ac69-da1127b81eaf",
    "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
    "expires_at": "2026-10-30T11:06:41.155136Z",
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

`POST /api/driver/v1/offers/b5ee3195-4658-4663-ac69-da1127b81eaf/reject` → **204**

```json
{
  "command_id": "e3364c75-1042-436f-9d1a-35f7db3c1f97"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "463f6087-81e8-4e07-8566-25b1c5717788",
    "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
    "expires_at": "2026-10-30T11:06:41.6273Z",
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

`POST /api/driver/v1/offers/463f6087-81e8-4e07-8566-25b1c5717788/accept` → **200**

```json
{
  "command_id": "c67482c3-e6bc-4835-a567-c0844314155b"
}
```

```json
{
  "id": "3450d3c4-7cf0-4f95-a05c-38aedd9c2d52",
  "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c2021a84-86fe-4773-9630-4129c5c76c7d",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/ab4fe54b-cf88-4a72-9f17-98b674091a72/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T11:06:26.152931Z",
      "actor": {
        "type": "CLIENT",
        "id": "77e91a20-8608-454d-9802-32dc283489c9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
        "quote_id": "4bb9be63-4d78-4fee-9fcc-408b847bd029",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "478fa50c-9cfc-4e25-b6d9-200d28ad584a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T11:06:26.154542Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
        "attempt_id": "a98b8e2e-27e3-4874-9be4-bf78b6c450f3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "478fa50c-9cfc-4e25-b6d9-200d28ad584a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T11:06:26.160198Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b5ee3195-4658-4663-ac69-da1127b81eaf",
        "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "478fa50c-9cfc-4e25-b6d9-200d28ad584a"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T11:06:26.626224Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b5ee3195-4658-4663-ac69-da1127b81eaf",
        "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72"
      },
      "correlation_id": "761e20c0-ae18-42ba-867e-bbf326ad829d"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order ab4fe54b-cf88-4a72-9f17-98b674091a72 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/ab4fe54b-cf88-4a72-9f17-98b674091a72` → **200**

```json
{
  "id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "77e91a20-8608-454d-9802-32dc283489c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3450d3c4-7cf0-4f95-a05c-38aedd9c2d52",
    "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c2021a84-86fe-4773-9630-4129c5c76c7d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T11:06:26.152496Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ab4fe54b-cf88-4a72-9f17-98b674091a72/cancel` → **200**

```json
{
  "command_id": "2aadfe8a-ccd4-4b68-861d-2452eb3277da",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "77e91a20-8608-454d-9802-32dc283489c9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3450d3c4-7cf0-4f95-a05c-38aedd9c2d52",
    "order_id": "ab4fe54b-cf88-4a72-9f17-98b674091a72",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c2021a84-86fe-4773-9630-4129c5c76c7d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T11:06:26.152496Z",
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
  "session_id": "8e9d73bb-9eb5-492d-b4c2-be191a5dfb1c",
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
  "last_heartbeat_at": "2026-10-30T11:06:23.046822Z",
  "last_location_at": "2026-10-30T11:06:23.046822Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e9d73bb-9eb5-492d-b4c2-be191a5dfb1c/close` → **200**

```json
{
  "command_id": "395d2360-19c4-42d4-b32e-4b09628ea2f6",
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
  "session_id": "7067664d-38c2-457f-838b-532275c628ee",
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
  "last_heartbeat_at": "2026-10-30T11:06:24.219172Z",
  "last_location_at": "2026-10-30T11:06:24.219172Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7067664d-38c2-457f-838b-532275c628ee/close` → **200**

```json
{
  "command_id": "3ae5c4e8-0b62-42d8-98dc-d215247bafb3",
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
  "session_id": "6ed19628-e750-4225-9fcc-5e6d9fd8ff83",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkyODksImlhdCI6MTc5MzM1ODM4OSwianRpIjoiZDNiZDdmMmEtNTMxNS00OWM5LThkMjAtMDYwYTFjMzU5NWFkIiwic2lkIjoiNmVkMTk2MjgtZTc1MC00MjI1LTlmY2MtNWU2ZDlmZDhmZjgzIn0.mppg-RpHAHMiMKu_tdMBuUP8h0sjZRiw93tvvZiuUBg",
  "access_expires_at": "2026-10-30T11:21:29.112388061Z",
  "refresh_token": "rFb1uJRTm45epUuqw7gp562Rh2Y8FkZHi5798R68dbo",
  "refresh_expires_at": "2026-10-30T23:06:29.111800249Z",
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
  "command_id": "06aaf1a6-c763-473f-99e9-a7ae34ea9a06",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T11:06:29.566535Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "05d2bfdb-303a-4cf4-ad23-148ef9a01b49",
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
  "correlation_id": "20e74e2a-081a-4c39-8664-ff08a7ff1720"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "3178d49a-7549-4d16-a201-b3326841f80e",
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
  "correlation_id": "f2bc39cf-153b-439b-8395-240c91a544c1"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632800163",
  "device_ref": "sandbox-1320"
}
```

```json
{
  "challenge_id": "f9d003e4-8091-4de5-b327-f1c2d82b24d4",
  "expires_at": "2026-10-30T11:11:30.274269582Z",
  "resend_available_at": "2026-10-30T11:06:31.274269582Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632800163` → **200**

```json
{
  "phone": "+380632800163",
  "audience": "CLIENT",
  "code": "895850",
  "sent_at": "2026-10-30T11:06:30.277088456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9d003e4-8091-4de5-b327-f1c2d82b24d4",
  "code": "895850",
  "device_ref": "sandbox-1320"
}
```

```json
{
  "session_id": "abdc20c5-8254-4d92-9826-d1c2dbc1f1ed",
  "subject": {
    "type": "CLIENT",
    "id": "af39ef5b-9fe9-46e0-b36c-fea10e0cbbbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjM5ZWY1Yi05ZmU5LTQ2ZTAtYjM2Yy1mZWExMGUwY2JiYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjkwLCJpYXQiOjE3OTMzNTgzOTAsImp0aSI6ImUyODYyMTljLTM4YjMtNDZkMC05NTQ2LWIwZDUzYTc5ZDBkOCIsInNpZCI6ImFiZGMyMGM1LTgyNTQtNGQ5Mi05ODI2LWQxYzJkYmMxZjFlZCJ9.zCAVtylOcmebz3cDZmhay_kfjRagHhzfhlcALLFYwq4",
  "access_expires_at": "2026-10-30T11:21:30.523766746Z",
  "refresh_token": "5MixPhnXEPj1se9VNVzNsSWlJlyQbEw53T-zHOXjbx4",
  "refresh_expires_at": "2026-11-29T11:06:30.523400108Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1234198-8660-4ba1-a35c-cfa00bf7d6c5",
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
  "id": "16e81d74-3b36-4f2e-a6c0-fab0dd5ddd53",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:11:30.745417Z",
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
  "command_id": "9be18eff-4f80-47cf-9632-c50c0af3bb3d",
  "quote_id": "16e81d74-3b36-4f2e-a6c0-fab0dd5ddd53",
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
  "correlation_id": "16f35b7a-df2a-4ba7-b9c6-f192d0997bac"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "36358423-b82f-436e-9746-2172fae1b44c",
  "quote_id": "16e81d74-3b36-4f2e-a6c0-fab0dd5ddd53",
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
  "id": "599c0e9e-72ae-46cb-970f-957432c62ad3",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af39ef5b-9fe9-46e0-b36c-fea10e0cbbbf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:06:31.212719Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/599c0e9e-72ae-46cb-970f-957432c62ad3/cancel` → **200**

```json
{
  "command_id": "aa53f148-a094-41fe-be53-7e757bd0d6a3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "599c0e9e-72ae-46cb-970f-957432c62ad3",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "af39ef5b-9fe9-46e0-b36c-fea10e0cbbbf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:06:31.212719Z",
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
  "command_id": "d75b831b-98b0-4354-991f-c61a898132f8",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T11:06:31.708833Z"
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
      "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T11:06:31.708833Z"
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
  "device_ref": "sandbox-12362"
}
```

```json
{
  "challenge_id": "203cb039-6140-47ca-b602-d0ac71eca61f",
  "expires_at": "2026-10-30T11:11:32.530075483Z",
  "resend_available_at": "2026-10-30T11:06:33.530075483Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "505243",
  "sent_at": "2026-10-30T11:06:32.532868348Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "203cb039-6140-47ca-b602-d0ac71eca61f",
  "code": "505243",
  "device_ref": "sandbox-12362"
}
```

```json
{
  "session_id": "0f747c8f-5de5-4a44-9f09-d394ca4fb6c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTI5MiwiaWF0IjoxNzkzMzU4MzkyLCJqdGkiOiJjNjk4OWQxYi1hYTc5LTQxY2MtOWU4Yy1kOGEyYWVhOWJlOWMiLCJzaWQiOiIwZjc0N2M4Zi01ZGU1LTRhNDQtOWYwOS1kMzk0Y2E0ZmI2YzYifQ.KUDjth2UeO0QQF_ll9wzPFpeof7w5hyoHS7aAcoAJgU",
  "access_expires_at": "2026-10-30T11:21:32.775485948Z",
  "refresh_token": "le3oLM6ANgJIBQ-dFpwOznMw96J3maBtmo1BESa2NC4",
  "refresh_expires_at": "2026-11-29T11:06:32.775031572Z",
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
  "command_id": "3e27ef5e-15b6-4090-ac55-bb425f8e124b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:33Z",
    "sequence": 1793358393212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:33.228542Z",
  "last_location_at": "2026-10-30T11:06:33.228542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676790731",
  "device_ref": "sandbox-18938"
}
```

```json
{
  "challenge_id": "524f0c8d-b5df-4378-92d3-342b447aab04",
  "expires_at": "2026-10-30T11:11:33.450432458Z",
  "resend_available_at": "2026-10-30T11:06:34.450432458Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676790731` → **200**

```json
{
  "phone": "+380676790731",
  "audience": "CLIENT",
  "code": "833806",
  "sent_at": "2026-10-30T11:06:33.453101543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "524f0c8d-b5df-4378-92d3-342b447aab04",
  "code": "833806",
  "device_ref": "sandbox-18938"
}
```

```json
{
  "session_id": "0c652729-8653-4d62-851a-e30d98f7ec0c",
  "subject": {
    "type": "CLIENT",
    "id": "c14b5695-edb4-4bfe-a33c-5195fcdb5d6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMTRiNTY5NS1lZGI0LTRiZmUtYTMzYy01MTk1ZmNkYjVkNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MjkzLCJpYXQiOjE3OTMzNTgzOTMsImp0aSI6ImRkMTNkYmUxLTBkM2YtNDkzYi1hMDg0LTEzNjU3ZWU1MjEzZCIsInNpZCI6IjBjNjUyNzI5LTg2NTMtNGQ2Mi04NTFhLWUzMGQ5OGY3ZWMwYyJ9.6ZDFTE6IBHYL-AKwDLA5icWyeHqRCXtqzegU25gp5oM",
  "access_expires_at": "2026-10-30T11:21:33.700925498Z",
  "refresh_token": "7_Bk9I9FBJa7hZbttx7K91QABfsDQq_l15AL8Xk8j_4",
  "refresh_expires_at": "2026-11-29T11:06:33.700382511Z",
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
  "command_id": "f4356429-633a-4b6d-93fa-f54349c5f0e8",
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
  "id": "f1a8fdf7-3dae-47fb-8653-ccdba63d3a3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:11:34.157600Z",
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
  "command_id": "f87cdac7-f62b-43e2-893f-171718fadd11",
  "platform": "ANDROID",
  "token": "sandbox-driver-7984bb8c-5661-4949-be23-0cb4922d7f0f"
}
```

```json
{
  "id": "b58584ce-9b3c-422e-a9ab-c46594eec0a8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T11:06:34.400581Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "0c7b1acd-a515-4a3a-b16e-ec385e118830",
  "platform": "ANDROID",
  "token": "sandbox-rider-4392b3f4-9db1-428d-8e3f-85db2bed5e11"
}
```

```json
{
  "id": "5277cbd2-437d-43af-9d8a-6ec6a3baa3c8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T11:06:34.634656Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5b4d19ad-196b-4f21-af10-1f57c154d147",
  "quote_id": "f1a8fdf7-3dae-47fb-8653-ccdba63d3a3c",
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
  "id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c14b5695-edb4-4bfe-a33c-5195fcdb5d6a",
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
  "created_at": "2026-10-30T11:06:34.942943Z",
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
    "id": "bfa8b34e-e26c-483c-b4da-eefa8045adde",
    "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
    "expires_at": "2026-10-30T11:06:49.945834Z",
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

`POST /api/driver/v1/offers/bfa8b34e-e26c-483c-b4da-eefa8045adde/accept` → **200**

```json
{
  "command_id": "83178fd0-2e62-4444-9d81-e14f2fe799a2"
}
```

```json
{
  "id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T11:06:34.857Z` → **200**

```json
[
  {
    "at": "2026-10-30T11:06:35.521143945Z",
    "token_suffix": "2d7f0f",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
      "order_version": "2",
      "event_id": "60560f97-f3a4-46dc-8b93-16c597b1c318",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676790731&after=2026-10-30T11:06:34.857Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676790731&after=2026-10-30T11:06:34.857Z` → **200**

```json
[
  {
    "at": "2026-10-30T11:06:36.526148016Z",
    "token_suffix": "ed5e11",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
      "order_version": "3",
      "event_id": "a8efc35a-aa9b-4ca3-a88b-80d684eee451",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/1b109070-0549-4b96-a3a6-cf1e5dd40e53/messages` → **201**

```json
{
  "command_id": "39c8109e-6486-4e0c-9f1d-07dc27cb57e6",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "35910e76-7c6f-49be-be82-db4670af1530",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T11:06:36.732607543Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "assignment_id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
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

`POST /api/driver/v1/trips/a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c/messages` → **201**

```json
{
  "command_id": "2e11366b-b926-41db-abd9-35ba5b9e91c2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "b30e1ac1-3d9f-4789-be9a-decd21a2c095",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T11:06:37.185339098Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/1b109070-0549-4b96-a3a6-cf1e5dd40e53/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676790731"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:37Z",
    "sequence": 1793358397863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:37.879645Z",
  "last_location_at": "2026-10-30T11:06:37.879645Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "assignment_id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
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

`POST /api/driver/v1/trips/a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c/arrive` → **200**

```json
{
  "command_id": "b3ef18df-6fea-4cc9-928c-c34d223ff25e",
  "expected_version": 0
}
```

```json
{
  "id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "assignment_id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
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
  "arrived_at": "2026-10-30T11:06:38.333445Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c/start` → **200**

```json
{
  "command_id": "44dcb540-ced1-4d44-ac57-e6d5694d8607",
  "expected_version": 1
}
```

```json
{
  "id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "assignment_id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
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
  "arrived_at": "2026-10-30T11:06:38.333445Z",
  "started_at": "2026-10-30T11:06:38.574044Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:38Z",
    "sequence": 1793358398796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:38.81304Z",
  "last_location_at": "2026-10-30T11:06:38.81304Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c/complete` → **200**

```json
{
  "command_id": "9298d5ea-b2fe-4a1e-925f-8e97c5f7d7a0",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:06:39Z",
  "cash_received": true
}
```

```json
{
  "id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "assignment_id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
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
  "arrived_at": "2026-10-30T11:06:38.333445Z",
  "started_at": "2026-10-30T11:06:38.574044Z",
  "completed_at": "2026-10-30T11:06:39.045854Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/1b109070-0549-4b96-a3a6-cf1e5dd40e53` → **200**

```json
{
  "id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c14b5695-edb4-4bfe-a33c-5195fcdb5d6a",
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
    "id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3",
    "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:06:34.942943Z",
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
    "id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T11:06:34.942943Z",
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
    "id": "a76d4b56-8fb7-4ab1-9a2d-c0bedf406e3c",
    "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
    "order_short_number": 14,
    "created_at": "2026-10-30T11:06:35.424332Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "813cbcdd-7162-4cf8-8c7c-7e18eba5171e",
    "order_id": "c50ceb01-339e-4c10-af28-b7aa2b845f84",
    "order_short_number": 9,
    "created_at": "2026-10-30T11:05:28.715755Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "51aa3632-720b-4b48-bf8c-e557b291ab61",
    "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
    "order_short_number": 4,
    "created_at": "2026-10-30T11:04:53.955709Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e2ab1983-8a5b-4128-a96b-f7a9ba708cb1",
    "order_id": "6532ed6b-da54-44d9-995b-2a0d2faacfc7",
    "order_short_number": 2,
    "created_at": "2026-10-30T11:04:20.558554Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "84176926-f506-435e-874c-29e3e5178501",
    "order_id": "c24baa53-eead-43fa-bdb5-813da8614e42",
    "order_short_number": 1,
    "created_at": "2026-10-30T11:04:12.444125Z",
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

`GET /api/rider/v1/orders/1b109070-0549-4b96-a3a6-cf1e5dd40e53/tip` → **200**

```json
{
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
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
  "available_until": "2026-10-31T11:06:39.045854Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1b109070-0549-4b96-a3a6-cf1e5dd40e53/tip` → **201**

```json
{
  "command_id": "b9c17a21-0fbe-4de4-96f0-7516d6dfed60",
  "amount_minor": 1100
}
```

```json
{
  "id": "8384e3ab-1a44-454f-8f15-669df6015942",
  "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T11:06:43.691263Z"
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
  "session_id": "b6605188-92ba-41c4-b8d1-428c43afa38b",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMDQsImlhdCI6MTc5MzM1ODQwNCwianRpIjoiMDdiMGE1ODAtNzg3Zi00ZjQ3LWEyMjctNGRkZDRhYzZiZjE4Iiwic2lkIjoiYjY2MDUxODgtOTJiYS00MWM0LWI4ZDEtNDI4YzQzYWZhMzhiIn0.6SyvJH55ofQUvPROTsjGocCW2ornb2IAVXF41BILP4A",
  "access_expires_at": "2026-10-30T11:21:44.181176344Z",
  "refresh_token": "RQGEuTlaA_v9zGW5uescScvvYtnMHPpZnB-5bX1Htjw",
  "refresh_expires_at": "2026-10-30T23:06:44.180761185Z",
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
  "generated_at": "2026-10-30T11:06:44.408637226Z"
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
  "generated_at": "2026-10-30T11:06:44.64612621Z"
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
  "session_id": "cdcee7d7-7a37-40da-a141-8b5ccb0a015d",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMDUsImlhdCI6MTc5MzM1ODQwNSwianRpIjoiYjVkNjgzZmMtOTZmNC00OGE5LTk3OWItZGE0MmI3MWMwNjY0Iiwic2lkIjoiY2RjZWU3ZDctN2EzNy00MGRhLWExNDEtOGI1Y2NiMGEwMTVkIn0.wbvmbUzTgEDWwCYxolVckQpPpKG1buNH9CwPzcn_ghs",
  "access_expires_at": "2026-10-30T11:21:45.134462735Z",
  "refresh_token": "__LYuYlNnKmAa3CcMWBmM4OZzUpjfXtV2Xg13SX7v_Y",
  "refresh_expires_at": "2026-10-30T23:06:45.133938987Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1b109070-0549-4b96-a3a6-cf1e5dd40e53/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T11:06:34.943353Z",
      "actor": {
        "type": "CLIENT",
        "id": "c14b5695-edb4-4bfe-a33c-5195fcdb5d6a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
        "quote_id": "f1a8fdf7-3dae-47fb-8653-ccdba63d3a3c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7c3b472f-80aa-442b-9060-7145716c8f99"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T11:06:34.945217Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
        "attempt_id": "763810af-c42d-43ae-b272-77cb84f4e2be",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7c3b472f-80aa-442b-9060-7145716c8f99"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T11:06:34.948092Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bfa8b34e-e26c-483c-b4da-eefa8045adde",
        "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "7c3b472f-80aa-442b-9060-7145716c8f99"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T11:06:35.425451Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bfa8b34e-e26c-483c-b4da-eefa8045adde",
        "order_id": "1b109070-0549-4b96-a3a6-cf1e5dd40e53",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1ded9285-3025-4ca1-94fe-5f2d2eab4ec3"
      },
      "correlation_id": "dc46010d-ba92-41a1-abf8-ec481f4b116a"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T11:06:45.599318503Z",
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
      "last_location_at": "2026-10-30T11:06:38.81304Z",
      "order_id": null
    }
  ]
}
```

Done: order 1b109070-0549-4b96-a3a6-cf1e5dd40e53.

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
  "session_id": "dfaf48e7-f04c-48a7-a00d-438952826ef9",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMDYsImlhdCI6MTc5MzM1ODQwNiwianRpIjoiY2FiZTMyODctNWE3MC00MTU3LTkxOTUtYmI1NjkwNGZlZDQxIiwic2lkIjoiZGZhZjQ4ZTctZjA0Yy00OGE3LWEwMGQtNDM4OTUyODI2ZWY5In0.tzKIqF-OlDCvwcVrsxMRPaqv2tYm__l5RgoKlIOEYkk",
  "access_expires_at": "2026-10-30T11:21:46.215581432Z",
  "refresh_token": "tPwtc2_j9SVS4br8qisR47QrUgz8ku7Q33t0fav9u1w",
  "refresh_expires_at": "2026-10-30T23:06:46.215060869Z",
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
  "command_id": "a1bba6d7-4898-4acd-af2a-58411f84fa23",
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
  "timestamp": "2026-10-30T11:06:46.000+0000",
  "channel": {
    "id": "1730052000.298247418",
    "linkedid": "1730052000.298247418",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671541111"
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
  "timestamp": "2026-10-30T11:06:46.000+0000",
  "channel": {
    "id": "1730052000.298247418",
    "linkedid": "1730052000.298247418",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671541111"
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
  "session_id": "d0bdecd9-6fde-43af-abe6-1f213bfa939c",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMDcsImlhdCI6MTc5MzM1ODQwNywianRpIjoiYjBhOTUxZGYtODYzYy00NDgxLWJkOGItYmE5YTFlMWJiY2E2Iiwic2lkIjoiZDBiZGVjZDktNmZkZS00M2FmLWFiZTYtMWYyMTNiZmE5MzljIn0.2GSLsPoTpGSJDH9LQwny1IRLz15CcAYcoGrDwhrO_kQ",
  "access_expires_at": "2026-10-30T11:21:47.211569539Z",
  "refresh_token": "Te_eZq5TcNNnfKYozKsQCmtntZc4cE-FRerzJ2lnAro",
  "refresh_expires_at": "2026-10-30T23:06:47.211082295Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "2ebd2a6f-efe6-4475-a7c8-c766f4a97978",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671541111",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T11:06:46Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/2ebd2a6f-efe6-4475-a7c8-c766f4a97978/answer` → **200**

```json
{
  "command_id": "4a686c41-52e5-43ba-baca-d2b6a3fcca0a"
}
```

```json
{
  "id": "2ebd2a6f-efe6-4475-a7c8-c766f4a97978",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671541111",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "order_ids": [],
  "started_at": "2026-10-30T11:06:46Z",
  "answered_at": "2026-10-30T11:06:47.693422Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.298247418",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "41e10a44-5aa8-482b-bdbd-730a41475cd5",
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
  "id": "87d020ce-f002-4679-904c-949ef673bc84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:11:47.954453Z",
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
  "command_id": "87135189-8e8e-4561-bc97-b55b130eb1e9",
  "quote_id": "87d020ce-f002-4679-904c-949ef673bc84",
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
    "phone": "+380671541111"
  },
  "call_id": "2ebd2a6f-efe6-4475-a7c8-c766f4a97978"
}
```

```json
{
  "id": "6bbe64a0-22a3-4ebd-b3a1-972226906211",
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
  "created_at": "2026-10-30T11:06:48.279355Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671541111"
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
    "id": "1730052000.298247418",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "2ebd2a6f-efe6-4475-a7c8-c766f4a97978",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671541111",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [
        "6bbe64a0-22a3-4ebd-b3a1-972226906211"
      ],
      "started_at": "2026-10-30T11:06:46Z",
      "answered_at": "2026-10-30T11:06:47.693422Z",
      "ended_at": "2026-10-30T11:06:48.533104Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "32c124cf-f565-495a-9917-334686e420d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677925661",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [],
      "started_at": "2026-10-30T11:04:43.725261Z",
      "answered_at": "2026-10-30T11:04:43.991193Z",
      "ended_at": "2026-10-30T11:04:44.242098Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T11:04:49.547294Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/6bbe64a0-22a3-4ebd-b3a1-972226906211` → **200**

```json
{
  "id": "6bbe64a0-22a3-4ebd-b3a1-972226906211",
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
  "created_at": "2026-10-30T11:06:48.279355Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671541111"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/6bbe64a0-22a3-4ebd-b3a1-972226906211` → **200**

```json
{
  "id": "6bbe64a0-22a3-4ebd-b3a1-972226906211",
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
  "created_at": "2026-10-30T11:06:48.279355Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671541111"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6bbe64a0-22a3-4ebd-b3a1-972226906211/cancel` → **200**

```json
{
  "command_id": "2783131a-9c26-4b06-8b45-0f0d7f38f2bb",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6bbe64a0-22a3-4ebd-b3a1-972226906211",
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
  "created_at": "2026-10-30T11:06:48.279355Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671541111"
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

Done: call 2ebd2a6f-efe6-4475-a7c8-c766f4a97978 with order 6bbe64a0-22a3-4ebd-b3a1-972226906211.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12434"
}
```

```json
{
  "challenge_id": "05ff94b8-db08-4f52-b246-f1a1e3b3a74d",
  "expires_at": "2026-10-30T11:11:49.71140939Z",
  "resend_available_at": "2026-10-30T11:06:50.71140939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "763743",
  "sent_at": "2026-10-30T11:06:49.713513036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05ff94b8-db08-4f52-b246-f1a1e3b3a74d",
  "code": "763743",
  "device_ref": "sandbox-12434"
}
```

```json
{
  "session_id": "e5419e11-5728-4f8b-a00c-541850b57fe2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTMwOSwiaWF0IjoxNzkzMzU4NDA5LCJqdGkiOiJiODMwNzViYy03OWVjLTRmOTMtYjMxMy1jMmNhZjUxMWM0YjUiLCJzaWQiOiJlNTQxOWUxMS01NzI4LTRmOGItYTAwYy01NDE4NTBiNTdmZTIifQ.gfnNkzZPLGFfCpXFpRl11GFoo9n0Mu7VIvkPSigus4E",
  "access_expires_at": "2026-10-30T11:21:49.964351744Z",
  "refresh_token": "98idxNsxLHo2QBFPEcSpdmllGmFFmb9UxBgicEV_fuM",
  "refresh_expires_at": "2026-11-29T11:06:49.96387898Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:38.81304Z",
  "last_location_at": "2026-10-30T11:06:38.81304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/handover` → **200**

```json
{
  "command_id": "50fb75cc-a95e-4aca-9de6-2d3589335700",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:38.81304Z",
  "last_location_at": "2026-10-30T11:06:38.81304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:50Z",
    "sequence": 1793358410651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:50.668192Z",
  "last_location_at": "2026-10-30T11:06:50.668192Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664975597",
  "device_ref": "sandbox-1084"
}
```

```json
{
  "challenge_id": "db5d7e6a-ca5e-4be6-ab1b-269ae4d8ccbc",
  "expires_at": "2026-10-30T11:11:50.896020332Z",
  "resend_available_at": "2026-10-30T11:06:51.896020332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664975597` → **200**

```json
{
  "phone": "+380664975597",
  "audience": "CLIENT",
  "code": "397086",
  "sent_at": "2026-10-30T11:06:51.091091035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db5d7e6a-ca5e-4be6-ab1b-269ae4d8ccbc",
  "code": "397086",
  "device_ref": "sandbox-1084"
}
```

```json
{
  "session_id": "44e2d784-368f-4e1e-ad5f-c8e664275a14",
  "subject": {
    "type": "CLIENT",
    "id": "dfbe07bd-9dfa-470f-b7e7-1fcd7b79938a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZmJlMDdiZC05ZGZhLTQ3MGYtYjdlNy0xZmNkN2I3OTkzOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzExLCJpYXQiOjE3OTMzNTg0MTEsImp0aSI6ImRkYTAwYThkLWJjYTYtNDY1NC04YmE5LWZlODE3NjE4NjM4MCIsInNpZCI6IjQ0ZTJkNzg0LTM2OGYtNGUxZS1hZDVmLWM4ZTY2NDI3NWExNCJ9.8cujcwUPClrUwD3aeENyHnshz0_OI_hcb8OMbzj739g",
  "access_expires_at": "2026-10-30T11:21:51.341891882Z",
  "refresh_token": "NMh47PX-ILp-fhI2GOL_X5VuMqE41f9Brd7gBQS3o9E",
  "refresh_expires_at": "2026-11-29T11:06:51.341459583Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8aed5ebf-0736-40f4-abc3-9b06bff04e4c",
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
  "id": "4d10f4b1-727b-498c-8316-6bdb31497982",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:11:51.566558Z",
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
  "command_id": "f02ac2c4-13f5-4238-873c-a38f1dbd5fff",
  "quote_id": "4d10f4b1-727b-498c-8316-6bdb31497982",
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
  "id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dfbe07bd-9dfa-470f-b7e7-1fcd7b79938a",
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
  "created_at": "2026-10-30T11:06:51.809049Z",
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
    "id": "36ea86e4-467f-4998-bfa0-01713295d403",
    "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
    "expires_at": "2026-10-30T11:07:06.81151Z",
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

`POST /api/driver/v1/offers/36ea86e4-467f-4998-bfa0-01713295d403/accept` → **200**

```json
{
  "command_id": "e0f4c7ad-6ef5-4ec0-b3e0-f3d6e57a2387"
}
```

```json
{
  "id": "009b4877-731e-4ab8-a9ff-50fa92244d23",
  "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "026a310e-9feb-4af7-af0b-3f045ce6634b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "026a310e-9feb-4af7-af0b-3f045ce6634b",
  "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
  "assignment_id": "009b4877-731e-4ab8-a9ff-50fa92244d23",
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

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:52Z",
    "sequence": 1793358412730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:52.746184Z",
  "last_location_at": "2026-10-30T11:06:52.746184Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/026a310e-9feb-4af7-af0b-3f045ce6634b/arrive` → **200**

```json
{
  "command_id": "489fcf63-da44-4d96-b0de-1d85f25b8c60",
  "expected_version": 0
}
```

```json
{
  "id": "026a310e-9feb-4af7-af0b-3f045ce6634b",
  "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
  "assignment_id": "009b4877-731e-4ab8-a9ff-50fa92244d23",
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
  "arrived_at": "2026-10-30T11:06:53.03522Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/026a310e-9feb-4af7-af0b-3f045ce6634b/start` → **200**

```json
{
  "command_id": "fef71300-d2d9-41e7-ba8e-16a9f27e14e3",
  "expected_version": 1
}
```

```json
{
  "id": "026a310e-9feb-4af7-af0b-3f045ce6634b",
  "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
  "assignment_id": "009b4877-731e-4ab8-a9ff-50fa92244d23",
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
  "arrived_at": "2026-10-30T11:06:53.03522Z",
  "started_at": "2026-10-30T11:06:53.270088Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:53Z",
    "sequence": 1793358413501
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:53.517683Z",
  "last_location_at": "2026-10-30T11:06:53.517683Z",
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
  "device_ref": "sandbox-18080"
}
```

```json
{
  "challenge_id": "516ec247-9c6d-43b7-9613-a8fc1b6ddb3f",
  "expires_at": "2026-10-30T11:11:53.743943421Z",
  "resend_available_at": "2026-10-30T11:06:54.743943421Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "169786",
  "sent_at": "2026-10-30T11:06:53.788927795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "516ec247-9c6d-43b7-9613-a8fc1b6ddb3f",
  "code": "169786",
  "device_ref": "sandbox-18080"
}
```

```json
{
  "session_id": "8962f929-aeca-4cf5-a655-631d5afa753d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTMxNCwiaWF0IjoxNzkzMzU4NDE0LCJqdGkiOiJiNjNiNmUwZi01MGI1LTQxMzMtYTc3YS0wNDY1MWE1NTBhMDUiLCJzaWQiOiI4OTYyZjkyOS1hZWNhLTRjZjUtYTY1NS02MzFkNWFmYTc1M2QifQ._6dlY2OqZxFU-N3DJWt7xnc52dJUtPE1u9Vgq3GzY-I",
  "access_expires_at": "2026-10-30T11:21:54.035104881Z",
  "refresh_token": "WDOUsv0_ybW_69BEiueQUkf19ZjUi5DjwEGUUonIWR0",
  "refresh_expires_at": "2026-11-29T11:06:54.034706727Z",
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
  "command_id": "bdbf1528-9e0f-44fe-9d09-83d3e10efbb2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:54Z",
    "sequence": 1793358414485
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "34cbb8d4-54f4-40ea-964d-69b4dfcb68f3",
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
  "last_heartbeat_at": "2026-10-30T11:06:54.501636Z",
  "last_location_at": "2026-10-30T11:06:54.501636Z",
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
  "session_id": "7edcb9f7-f954-4fbc-a2df-0ae07ff0bd3e",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMTUsImlhdCI6MTc5MzM1ODQxNSwianRpIjoiOWM4NjNhNWYtOWE0Yy00YzYwLTllMjItOTgzNWZkMjMxYjk4Iiwic2lkIjoiN2VkY2I5ZjctZjk1NC00ZmJjLWEyZGYtMGFlMDdmZjBiZDNlIn0.WIX69brAPOlx8TJVLp2vm--Cz1Spfbop5mDpOwn8ddY",
  "access_expires_at": "2026-10-30T11:21:55.007862483Z",
  "refresh_token": "EB0VGWEy-vtfc5Y9JKpeCT3gycnU0fM0Eyme92RO8UA",
  "refresh_expires_at": "2026-10-30T23:06:55.007360937Z",
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
  "session_id": "2ebb19a5-e106-41fe-9347-5ccba53ab3ea",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMTUsImlhdCI6MTc5MzM1ODQxNSwianRpIjoiZmYxMmFiY2MtODFlNS00OGRmLWJhMGYtN2RjOGUwMzY5NWFmIiwic2lkIjoiMmViYjE5YTUtZTEwNi00MWZlLTkzNDctNWNjYmE1M2FiM2VhIn0.brpAzOW2bb0h8AEy20AOV7T61-lR0JMnaWlfkZYULxw",
  "access_expires_at": "2026-10-30T11:21:55.496110972Z",
  "refresh_token": "wTYZB8ZEdScAHGFRAce35Ra-xNANnmAzEA8-iRGlw9o",
  "refresh_expires_at": "2026-10-30T23:06:55.495631489Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a60ad61b-1a1d-4c25-a10b-d06ba48bd695` → **200**

```json
{
  "id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "dfbe07bd-9dfa-470f-b7e7-1fcd7b79938a",
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
    "id": "009b4877-731e-4ab8-a9ff-50fa92244d23",
    "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "026a310e-9feb-4af7-af0b-3f045ce6634b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T11:06:51.809049Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a60ad61b-1a1d-4c25-a10b-d06ba48bd695/interrupt` → **200**

```json
{
  "command_id": "bd158e60-c904-48f6-9034-d11157c9d243",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "dfbe07bd-9dfa-470f-b7e7-1fcd7b79938a",
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
      "id": "009b4877-731e-4ab8-a9ff-50fa92244d23",
      "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "026a310e-9feb-4af7-af0b-3f045ce6634b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T11:06:51.809049Z",
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
    "id": "05067046-7484-494b-9337-4238b1dc57b5",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "dfbe07bd-9dfa-470f-b7e7-1fcd7b79938a",
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
    "id": "7eb49256-2f4d-44e1-883d-21cf14fae252",
    "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
    "expires_at": "2026-10-30T11:07:10.983221Z",
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

`POST /api/driver/v1/offers/7eb49256-2f4d-44e1-883d-21cf14fae252/accept` → **200**

```json
{
  "command_id": "6fefc83d-0afd-46aa-9abb-8e344346209f"
}
```

```json
{
  "id": "2292d6bd-6818-4115-8101-cabceeda8bb5",
  "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "80e83597-74b5-4d2d-96f0-f40d5562380e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "80e83597-74b5-4d2d-96f0-f40d5562380e",
  "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
  "assignment_id": "2292d6bd-6818-4115-8101-cabceeda8bb5",
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
  "session_id": "34cbb8d4-54f4-40ea-964d-69b4dfcb68f3",
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
  "last_heartbeat_at": "2026-10-30T11:06:54.501636Z",
  "last_location_at": "2026-10-30T11:06:54.501636Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/34cbb8d4-54f4-40ea-964d-69b4dfcb68f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:06:57Z",
    "sequence": 1793358417147
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "34cbb8d4-54f4-40ea-964d-69b4dfcb68f3",
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
  "last_heartbeat_at": "2026-10-30T11:06:57.165144Z",
  "last_location_at": "2026-10-30T11:06:57.165144Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/80e83597-74b5-4d2d-96f0-f40d5562380e/arrive` → **200**

```json
{
  "command_id": "58bf521a-537f-4c4b-962a-68c730b08745",
  "expected_version": 0
}
```

```json
{
  "id": "80e83597-74b5-4d2d-96f0-f40d5562380e",
  "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
  "assignment_id": "2292d6bd-6818-4115-8101-cabceeda8bb5",
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
  "arrived_at": "2026-10-30T11:06:57.401018Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/80e83597-74b5-4d2d-96f0-f40d5562380e/start` → **200**

```json
{
  "command_id": "c5d510cb-0a34-4fc0-9f39-74d5540bcce6",
  "expected_version": 1
}
```

```json
{
  "id": "80e83597-74b5-4d2d-96f0-f40d5562380e",
  "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
  "assignment_id": "2292d6bd-6818-4115-8101-cabceeda8bb5",
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
  "arrived_at": "2026-10-30T11:06:57.401018Z",
  "started_at": "2026-10-30T11:06:57.635941Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/80e83597-74b5-4d2d-96f0-f40d5562380e/complete` → **200**

```json
{
  "command_id": "732346a6-c927-4fef-a584-b185598abe5b",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:06:57Z"
}
```

```json
{
  "id": "80e83597-74b5-4d2d-96f0-f40d5562380e",
  "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
  "assignment_id": "2292d6bd-6818-4115-8101-cabceeda8bb5",
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
  "arrived_at": "2026-10-30T11:06:57.401018Z",
  "started_at": "2026-10-30T11:06:57.635941Z",
  "completed_at": "2026-10-30T11:06:57.871912Z",
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
    "id": "05067046-7484-494b-9337-4238b1dc57b5",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T11:06:55.975776Z",
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
    "id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T11:06:51.809049Z",
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

`GET /api/operator/v1/orders/a60ad61b-1a1d-4c25-a10b-d06ba48bd695/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T11:06:51.809508Z",
      "actor": {
        "type": "CLIENT",
        "id": "dfbe07bd-9dfa-470f-b7e7-1fcd7b79938a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
        "quote_id": "4d10f4b1-727b-498c-8316-6bdb31497982",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "827d8915-2acb-4ee1-bb4f-81e7fa5da451"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T11:06:51.810945Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
        "attempt_id": "b1dfc9ae-c619-4d40-8779-0aee5f9f7218",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "827d8915-2acb-4ee1-bb4f-81e7fa5da451"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T11:06:51.813615Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "36ea86e4-467f-4998-bfa0-01713295d403",
        "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "827d8915-2acb-4ee1-bb4f-81e7fa5da451"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T11:06:52.292438Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "36ea86e4-467f-4998-bfa0-01713295d403",
        "order_id": "a60ad61b-1a1d-4c25-a10b-d06ba48bd695",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "009b4877-731e-4ab8-a9ff-50fa92244d23"
      },
      "correlation_id": "62a05f1e-0e9d-4c04-b884-fc3e485fb522"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/05067046-7484-494b-9337-4238b1dc57b5/tip` → **200**

```json
{
  "order_id": "05067046-7484-494b-9337-4238b1dc57b5",
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
  "available_until": "2026-10-31T11:06:57.871912Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/05067046-7484-494b-9337-4238b1dc57b5/tip` → **409**

```json
{
  "command_id": "ffea42fa-2dda-41da-98bd-4ce463030599",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/05067046-7484-494b-9337-4238b1dc57b5/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "297f4f97-465e-41d3-aa7b-d2960958d06e"
}
```

Done: interrupted a60ad61b-1a1d-4c25-a10b-d06ba48bd695, follow-up 05067046-7484-494b-9337-4238b1dc57b5.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d396ad4-a060-4bf9-92b6-0f09ae82bb5c",
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
  "last_heartbeat_at": "2026-10-30T11:06:53.517683Z",
  "last_location_at": "2026-10-30T11:06:53.517683Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9d396ad4-a060-4bf9-92b6-0f09ae82bb5c/close` → **200**

```json
{
  "command_id": "8a9836b6-412f-424b-b6e8-ce7538946ac6",
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
  "session_id": "34cbb8d4-54f4-40ea-964d-69b4dfcb68f3",
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
  "last_heartbeat_at": "2026-10-30T11:06:57.165144Z",
  "last_location_at": "2026-10-30T11:06:57.165144Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34cbb8d4-54f4-40ea-964d-69b4dfcb68f3/close` → **200**

```json
{
  "command_id": "de11b092-fd8f-422d-9841-76368b2de269",
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
  "session_id": "b5d81967-da9d-4fb2-966a-0005b5383361",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMjMsImlhdCI6MTc5MzM1ODQyMywianRpIjoiNWRhY2NhMTMtY2RjZS00YjJlLThkOTUtMGI5NjYzOTAxZTExIiwic2lkIjoiYjVkODE5NjctZGE5ZC00ZmIyLTk2NmEtMDAwNWI1MzgzMzYxIn0.WgKyTlD1Kkryz3P9ftrsOdaHTqzjs_FkX4UfHbrXHAw",
  "access_expires_at": "2026-10-30T11:22:03.460240188Z",
  "refresh_token": "IEFftSU6fC9ZkEPFHjmwSDFaYl3ScB4BdOp1DoPkUqo",
  "refresh_expires_at": "2026-10-30T23:07:03.459813563Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0352c77d-906e-4d5b-947b-4a8c22c06b53",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T11:07:03Z"
}
```

```json
{
  "id": "f665bb26-27a6-41f7-a35b-75b420280971",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T11:07:03Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f665bb26-27a6-41f7-a35b-75b420280971/publish` → **200**

```json
{
  "command_id": "3dba810a-214c-4328-8381-8f6329a57ab1",
  "expected_version": 0
}
```

```json
{
  "id": "f665bb26-27a6-41f7-a35b-75b420280971",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T11:07:04.043113Z",
  "published_at": "2026-10-30T11:07:04.043113Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "f665bb26-27a6-41f7-a35b-75b420280971",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T11:07:04.043113Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630432134",
  "device_ref": "sandbox-26441"
}
```

```json
{
  "challenge_id": "d84bcc8d-9e4d-48e0-9b96-98556ccc85a6",
  "expires_at": "2026-10-30T11:12:04.53323625Z",
  "resend_available_at": "2026-10-30T11:07:05.53323625Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630432134` → **200**

```json
{
  "phone": "+380630432134",
  "audience": "CLIENT",
  "code": "352064",
  "sent_at": "2026-10-30T11:07:04.539711539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d84bcc8d-9e4d-48e0-9b96-98556ccc85a6",
  "code": "352064",
  "device_ref": "sandbox-26441"
}
```

```json
{
  "session_id": "a6cca3ea-ec7d-4c46-8583-5eb63b7d4ed3",
  "subject": {
    "type": "CLIENT",
    "id": "15d35dcb-bcd0-4a48-a52c-aac463c5e5d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWQzNWRjYi1iY2QwLTRhNDgtYTUyYy1hYWM0NjNjNWU1ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzI0LCJpYXQiOjE3OTMzNTg0MjQsImp0aSI6IjNmNWFmYzFhLTBiNWQtNDU2My1hMzg2LTljMTA0ZmNlOGE1NSIsInNpZCI6ImE2Y2NhM2VhLWVjN2QtNGM0Ni04NTgzLTVlYjYzYjdkNGVkMyJ9.0Zl3zOF3IeyDFqJWuoI3FxJ0w_vxQr7I9Jo6y2tXleA",
  "access_expires_at": "2026-10-30T11:22:04.822991847Z",
  "refresh_token": "1LKTh06Ga2rfXw2RrWvjKO8mgnSUtk35kSNPV0GTfz8",
  "refresh_expires_at": "2026-11-29T11:07:04.822545612Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "f665bb26-27a6-41f7-a35b-75b420280971",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T11:07:04.043113Z",
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
  "command_id": "ec6c52dd-8c19-4333-894a-8a1d5ae4b97e",
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
  "id": "11404d27-775e-4ac8-9f10-ee8ac5c814d5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:05.276645Z",
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
  "command_id": "357233c7-d4e6-4596-a873-19b8a071383d",
  "quote_id": "11404d27-775e-4ac8-9f10-ee8ac5c814d5",
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
  "correlation_id": "db799a3d-d377-4217-9549-e84b3d2a4a04"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ade32083-a7b5-4066-856f-dbf2cd03bd8b",
  "version_id": "f665bb26-27a6-41f7-a35b-75b420280971",
  "language": "uk"
}
```

```json
{
  "version_id": "f665bb26-27a6-41f7-a35b-75b420280971",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T11:07:05.757772Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed08ab2e-197f-410d-bf35-c6ccdf9cafaa",
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
  "id": "843fd149-4bde-413b-ae07-e7264a4bf26b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:05.997819Z",
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
  "command_id": "3a636e39-3e37-43b6-ab72-6daaf5041c70",
  "quote_id": "843fd149-4bde-413b-ae07-e7264a4bf26b",
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
  "id": "87fb089c-5689-4f62-90ae-9f032e2ad728",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15d35dcb-bcd0-4a48-a52c-aac463c5e5d4",
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
  "created_at": "2026-10-30T11:07:06.242765Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/87fb089c-5689-4f62-90ae-9f032e2ad728` → **200**

```json
{
  "id": "87fb089c-5689-4f62-90ae-9f032e2ad728",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15d35dcb-bcd0-4a48-a52c-aac463c5e5d4",
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
  "created_at": "2026-10-30T11:07:06.242765Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/87fb089c-5689-4f62-90ae-9f032e2ad728/cancel` → **200**

```json
{
  "command_id": "40254349-a2f1-4750-8e89-8cd2767db022",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "87fb089c-5689-4f62-90ae-9f032e2ad728",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "15d35dcb-bcd0-4a48-a52c-aac463c5e5d4",
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
  "created_at": "2026-10-30T11:07:06.242765Z",
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

`POST /api/admin/v1/legal-documents/f665bb26-27a6-41f7-a35b-75b420280971` → **409**

```json
{
  "command_id": "3f95111a-9c2b-43fa-b600-5b35a52eaa40",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T11:07:06Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/f665bb26-27a6-41f7-a35b-75b420280971",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a8ecca05-1076-4228-82ea-899512185066"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3a6e8bbc-ccda-4fbf-a7f7-79fa56af5bf6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T11:07:07Z"
}
```

```json
{
  "id": "82c43712-3813-4776-a083-c85f7d5aa103",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T11:07:07Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/82c43712-3813-4776-a083-c85f7d5aa103/publish` → **200**

```json
{
  "command_id": "fc12257f-de96-43ea-9bda-22acab2620cd",
  "expected_version": 0
}
```

```json
{
  "id": "82c43712-3813-4776-a083-c85f7d5aa103",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T11:07:07.449622Z",
  "published_at": "2026-10-30T11:07:07.449622Z",
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
  "device_ref": "sandbox-10480"
}
```

```json
{
  "challenge_id": "a90e3f9d-14bb-478b-b503-6558e4654d53",
  "expires_at": "2026-10-30T11:12:07.721723608Z",
  "resend_available_at": "2026-10-30T11:07:08.721723608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "368049",
  "sent_at": "2026-10-30T11:07:07.724228781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a90e3f9d-14bb-478b-b503-6558e4654d53",
  "code": "368049",
  "device_ref": "sandbox-10480"
}
```

```json
{
  "session_id": "4c815c25-669c-4ed3-b554-35f12836c580",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTMyNywiaWF0IjoxNzkzMzU4NDI3LCJqdGkiOiJhMmEwYmJmYy03YjY2LTQxYjYtYmQwOS1jY2RhNjIxNWU2ZWYiLCJzaWQiOiI0YzgxNWMyNS02NjljLTRlZDMtYjU1NC0zNWYxMjgzNmM1ODAifQ.Y2LCCq5f60SzdTpLVlx8iHe_7gjRyWCA5NBim0y_ltA",
  "access_expires_at": "2026-10-30T11:22:07.977754628Z",
  "refresh_token": "-2NIzQ1AJwWI9y1DWk9q-ENLRTCIdHU4f9xk3vCfHws",
  "refresh_expires_at": "2026-11-29T11:07:07.977346675Z",
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
  "command_id": "54127e7f-e88d-4669-9831-e26ad471465b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:07:08Z",
    "sequence": 1793358428430
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "40b876ab-6498-4526-81c9-840587359067",
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
  "last_heartbeat_at": "2026-10-30T11:07:08.446988Z",
  "last_location_at": "2026-10-30T11:07:08.446988Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673134492",
  "device_ref": "sandbox-27330"
}
```

```json
{
  "challenge_id": "968c65ab-11d5-4dbd-9029-c98caa5fa10e",
  "expires_at": "2026-10-30T11:12:08.675200645Z",
  "resend_available_at": "2026-10-30T11:07:09.675200645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673134492` → **200**

```json
{
  "phone": "+380673134492",
  "audience": "CLIENT",
  "code": "586828",
  "sent_at": "2026-10-30T11:07:08.67779249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "968c65ab-11d5-4dbd-9029-c98caa5fa10e",
  "code": "586828",
  "device_ref": "sandbox-27330"
}
```

```json
{
  "session_id": "eea9ed48-e1ea-43eb-92a7-b71cfdc02685",
  "subject": {
    "type": "CLIENT",
    "id": "14c49104-f178-41ab-a806-4996a3051c04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGM0OTEwNC1mMTc4LTQxYWItYTgwNi00OTk2YTMwNTFjMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzI4LCJpYXQiOjE3OTMzNTg0MjgsImp0aSI6ImMxMDViY2I5LTQ5YTItNDYzNC1iNGEwLWU4ZjQ3Njk1NjQzOSIsInNpZCI6ImVlYTllZDQ4LWUxZWEtNDNlYi05MmE3LWI3MWNmZGMwMjY4NSJ9.HA6P3fv2nPImY5alvuMgje_3QgP_f6ogv1IywWlg7zY",
  "access_expires_at": "2026-10-30T11:22:08.934353503Z",
  "refresh_token": "50V4z2V9xOl83gIlUnIj3UrUGWS6rpnCrIvfD_cDklw",
  "refresh_expires_at": "2026-11-29T11:07:08.933675238Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a85f0201-b4f5-4829-83ba-40989a603348",
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
  "id": "993c8ff7-bca1-451b-a368-415222a706aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:09.162008Z",
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
  "command_id": "fe9a76f3-7163-4d4c-bc0f-c71ff5c3b825",
  "quote_id": "993c8ff7-bca1-451b-a368-415222a706aa",
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
    "phone": "+380675268603"
  }
}
```

```json
{
  "id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:07:09.402953Z",
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
    "id": "8dac7a7c-2c6d-4c3a-81f4-2f494ccb88fe",
    "order_id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
    "expires_at": "2026-10-30T11:07:24.406514Z",
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

`POST /api/driver/v1/offers/8dac7a7c-2c6d-4c3a-81f4-2f494ccb88fe/accept` → **200**

```json
{
  "command_id": "acd6fa7f-5225-44e2-9bfe-350166415a6b"
}
```

```json
{
  "id": "039648dc-472c-4681-98d8-bfca2f2f66b0",
  "order_id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d95c4dfa-2ae4-4000-856b-f4daf4f89a38",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d95c4dfa-2ae4-4000-856b-f4daf4f89a38",
  "order_id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
  "assignment_id": "039648dc-472c-4681-98d8-bfca2f2f66b0",
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
    "phone": "+380675268603"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9113f1f1-1bd7-4871-97a0-6089df138469",
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
  "id": "95d04540-38db-4f7c-a247-21e21302f30a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:10.340401Z",
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
  "command_id": "a37b8188-079d-4390-bfdf-5dd86551c15f",
  "quote_id": "95d04540-38db-4f7c-a247-21e21302f30a",
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
  "id": "438b98da-c1af-40da-b2f4-80f1c50fa738",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:07:10.586778Z",
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
  "command_id": "23561438-73bf-470c-a304-773c833aa4a7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T14:07:10Z"
}
```

```json
{
  "id": "5e6d670e-dfc9-4f73-bc62-3a64e33755df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:10.847259Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T14:07:10Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "23f06637-14c0-482e-8e66-6c392f9d6582",
  "quote_id": "5e6d670e-dfc9-4f73-bc62-3a64e33755df",
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
  "pickup_at": "2026-10-30T14:07:10Z"
}
```

```json
{
  "id": "bc537d8c-85b7-46d5-ac6b-14b6072cc99b",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T11:07:11.094147Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T14:07:10Z",
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
  "command_id": "dc80336e-824e-4dad-9020-ef58b39c45b9",
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
  "id": "5f65e506-0f6d-4504-bc82-9c7e7c9612dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:11.388868Z",
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
  "command_id": "44697851-5e95-473f-9ea8-72b5dacae51d",
  "quote_id": "5f65e506-0f6d-4504-bc82-9c7e7c9612dc",
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
  "correlation_id": "f182a8f1-8142-4cfb-9ecb-b0a4355b579a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "bc537d8c-85b7-46d5-ac6b-14b6072cc99b",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T11:07:11.094147Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T14:07:10Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "438b98da-c1af-40da-b2f4-80f1c50fa738",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T11:07:10.586778Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "438b98da-c1af-40da-b2f4-80f1c50fa738",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:07:10.586778Z",
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

`GET /api/rider/v1/orders/b839e3c4-c932-439d-8d9f-8b0006bcf215` → **200**

```json
{
  "id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "039648dc-472c-4681-98d8-bfca2f2f66b0",
    "order_id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d95c4dfa-2ae4-4000-856b-f4daf4f89a38",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T11:07:09.402953Z",
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
    "location_at": "2026-10-30T11:07:08.446988Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/b839e3c4-c932-439d-8d9f-8b0006bcf215/cancel` → **200**

```json
{
  "command_id": "a92793a6-3de7-445f-815e-0576bd8770af",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "039648dc-472c-4681-98d8-bfca2f2f66b0",
    "order_id": "b839e3c4-c932-439d-8d9f-8b0006bcf215",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d95c4dfa-2ae4-4000-856b-f4daf4f89a38",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T11:07:09.402953Z",
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

`GET /api/rider/v1/orders/438b98da-c1af-40da-b2f4-80f1c50fa738` → **200**

```json
{
  "id": "438b98da-c1af-40da-b2f4-80f1c50fa738",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:07:10.586778Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/438b98da-c1af-40da-b2f4-80f1c50fa738/cancel` → **200**

```json
{
  "command_id": "251e254a-e606-4852-9021-609b94bbaa17",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "438b98da-c1af-40da-b2f4-80f1c50fa738",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:07:10.586778Z",
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

`GET /api/rider/v1/orders/bc537d8c-85b7-46d5-ac6b-14b6072cc99b` → **200**

```json
{
  "id": "bc537d8c-85b7-46d5-ac6b-14b6072cc99b",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T11:07:11.094147Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T14:07:10Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bc537d8c-85b7-46d5-ac6b-14b6072cc99b/cancel` → **200**

```json
{
  "command_id": "740fb808-66e3-44c9-81e5-fa4056a3c10c",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bc537d8c-85b7-46d5-ac6b-14b6072cc99b",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "14c49104-f178-41ab-a806-4996a3051c04",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T11:07:11.094147Z",
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
  "pickup_at": "2026-10-30T14:07:10Z",
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
  "session_id": "40b876ab-6498-4526-81c9-840587359067",
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
  "last_heartbeat_at": "2026-10-30T11:07:08.446988Z",
  "last_location_at": "2026-10-30T11:07:08.446988Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40b876ab-6498-4526-81c9-840587359067/close` → **200**

```json
{
  "command_id": "30b3bd0f-7c38-4d77-b3d7-ffbb5102c5b5",
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

Done: orders b839e3c4-c932-439d-8d9f-8b0006bcf215, 438b98da-c1af-40da-b2f4-80f1c50fa738, bc537d8c-85b7-46d5-ac6b-14b6072cc99b.

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
  "session_id": "b1e3cc01-fbb7-49d0-999d-1d107b6f7972",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMzQsImlhdCI6MTc5MzM1ODQzNCwianRpIjoiZDdiZDQ4NzQtMWYyNS00YzE2LWEyZTEtZGE0MWVmNDg0YmZmIiwic2lkIjoiYjFlM2NjMDEtZmJiNy00OWQwLTk5OWQtMWQxMDdiNmY3OTcyIn0.Ubo0UluZ-Q3J_3gso9eNCdZmpHZPuZQjm8csmQddDH4",
  "access_expires_at": "2026-10-30T11:22:14.84599865Z",
  "refresh_token": "EEZ9L-FAX3nAUWllmwS2o87ucBunTuU4sOZNC0xsDtQ",
  "refresh_expires_at": "2026-10-30T23:07:14.845308507Z",
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
  "session_id": "c6cbb921-d211-4198-a8e5-79a951939b8f",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzMzUsImlhdCI6MTc5MzM1ODQzNSwianRpIjoiOGY4NTU1MDAtMGI2OS00ZTgxLTg1MWItZjllYmQyOTkzNmUzIiwic2lkIjoiYzZjYmI5MjEtZDIxMS00MTk4LWE4ZTUtNzlhOTUxOTM5YjhmIn0.M8GwTj-pqdN9dxDUqzxB5-sSuerWAIGikL-3hV50kU4",
  "access_expires_at": "2026-10-30T11:22:15.334538693Z",
  "refresh_token": "aSf0pL2TXZrst6n4rEhvmaakKoV-Dv3xxMaazZKg-Os",
  "refresh_expires_at": "2026-10-30T23:07:15.333877963Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17614"
}
```

```json
{
  "challenge_id": "0938cfc0-839e-4f6d-b38a-4387f26b887d",
  "expires_at": "2026-10-30T11:12:15.713581419Z",
  "resend_available_at": "2026-10-30T11:07:16.713581419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "399905",
  "sent_at": "2026-10-30T11:07:15.715684694Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0938cfc0-839e-4f6d-b38a-4387f26b887d",
  "code": "399905",
  "device_ref": "sandbox-17614"
}
```

```json
{
  "session_id": "6015aa8c-8a17-4e8f-8c95-fe5fca628937",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTMzNSwiaWF0IjoxNzkzMzU4NDM1LCJqdGkiOiIyYjliZWU3Yi1mZjk3LTRiNDgtYmE0Ni1iZTYzMzkwM2JmM2MiLCJzaWQiOiI2MDE1YWE4Yy04YTE3LTRlOGYtOGM5NS1mZTVmY2E2Mjg5MzcifQ.ATP2MuMRm4RFv6wq09gQPW-U1jfb3x-k2QYstCABXJ4",
  "access_expires_at": "2026-10-30T11:22:15.969778047Z",
  "refresh_token": "VwIcTsrFTCM-bGL2T-MS82epohe_qaDhYmrg7XlxCYE",
  "refresh_expires_at": "2026-11-29T11:07:15.969318523Z",
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
  "command_id": "f225082f-c3d5-4b89-b9de-ed4301ed7f57",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:07:16Z",
    "sequence": 1793358436484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44237e50-7ed7-478d-8867-97f6284c36be",
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
  "last_heartbeat_at": "2026-10-30T11:07:16.501782Z",
  "last_location_at": "2026-10-30T11:07:16.501782Z",
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
  "command_id": "aff2921a-a499-4da3-a531-0c128f517c1b",
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
  "effective_at": "2026-10-30T11:07:16.986947Z",
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T11:04:57.422009Z",
  "last_entries": [
    {
      "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T11:04:57.422009Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ebbe40cf-adf4-4d74-9e40-2878a14fd7af",
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
  "id": "69e2260d-58d7-4747-b2fa-d0dbd9a9464d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:17.474419Z",
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
  "command_id": "9414c9e8-409b-4d80-86e7-7e044fde81c2",
  "quote_id": "69e2260d-58d7-4747-b2fa-d0dbd9a9464d",
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
    "phone": "+3806711130121"
  }
}
```

```json
{
  "id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
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
  "created_at": "2026-10-30T11:07:17.805587Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130121"
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
    "id": "1593f930-a9e3-471b-a274-f8c98ebb3fd2",
    "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
    "expires_at": "2026-10-30T11:07:32.80903Z",
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

`POST /api/driver/v1/offers/1593f930-a9e3-471b-a274-f8c98ebb3fd2/accept` → **200**

```json
{
  "command_id": "31bc438c-fba2-4579-9cb7-5fd2ffb93270"
}
```

```json
{
  "id": "d764b5d0-f9c2-4cd6-907f-2a2e3228a4cd",
  "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1d352e07-ab09-40bf-9bd1-09be9453859b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1d352e07-ab09-40bf-9bd1-09be9453859b",
  "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
  "assignment_id": "d764b5d0-f9c2-4cd6-907f-2a2e3228a4cd",
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
    "phone": "+3806711130121"
  }
}
```

`POST /api/driver/v1/work-sessions/44237e50-7ed7-478d-8867-97f6284c36be/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:07:18Z",
    "sequence": 1793358438811
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44237e50-7ed7-478d-8867-97f6284c36be",
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
  "last_heartbeat_at": "2026-10-30T11:07:18.8278Z",
  "last_location_at": "2026-10-30T11:07:18.8278Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1d352e07-ab09-40bf-9bd1-09be9453859b/arrive` → **200**

```json
{
  "command_id": "c943b380-35e4-403d-949c-d02337539405",
  "expected_version": 0
}
```

```json
{
  "id": "1d352e07-ab09-40bf-9bd1-09be9453859b",
  "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
  "assignment_id": "d764b5d0-f9c2-4cd6-907f-2a2e3228a4cd",
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
  "arrived_at": "2026-10-30T11:07:19.069163Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130121"
  }
}
```

`POST /api/driver/v1/trips/1d352e07-ab09-40bf-9bd1-09be9453859b/start` → **200**

```json
{
  "command_id": "4d9125a6-afde-4f7a-93ee-02fc1b063523",
  "expected_version": 1
}
```

```json
{
  "id": "1d352e07-ab09-40bf-9bd1-09be9453859b",
  "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
  "assignment_id": "d764b5d0-f9c2-4cd6-907f-2a2e3228a4cd",
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
  "arrived_at": "2026-10-30T11:07:19.069163Z",
  "started_at": "2026-10-30T11:07:19.316825Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130121"
  }
}
```

`POST /api/driver/v1/trips/1d352e07-ab09-40bf-9bd1-09be9453859b/complete` → **200**

```json
{
  "command_id": "3f20e8e3-86ed-453e-a290-66f27f9ad059",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:07:19Z",
  "cash_received": true
}
```

```json
{
  "id": "1d352e07-ab09-40bf-9bd1-09be9453859b",
  "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
  "assignment_id": "d764b5d0-f9c2-4cd6-907f-2a2e3228a4cd",
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
  "arrived_at": "2026-10-30T11:07:19.069163Z",
  "started_at": "2026-10-30T11:07:19.316825Z",
  "completed_at": "2026-10-30T11:07:19.568485Z",
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
  "command_id": "4705f60c-ea17-4881-8653-eb01bfb3ed27",
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
  "id": "fba861c3-b5f8-4d83-a259-0e3155f7e98b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:19.815845Z",
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
  "command_id": "d16eed5b-89ba-4105-bd39-bc35a34d54ce",
  "quote_id": "fba861c3-b5f8-4d83-a259-0e3155f7e98b",
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
    "phone": "+3806711112538"
  }
}
```

```json
{
  "id": "7ed92cf1-5228-4526-8e58-0772e61c6dcf",
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
  "created_at": "2026-10-30T11:07:20.062746Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112538"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7ed92cf1-5228-4526-8e58-0772e61c6dcf` → **200**

```json
{
  "id": "7ed92cf1-5228-4526-8e58-0772e61c6dcf",
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
  "created_at": "2026-10-30T11:07:20.062746Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112538"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7ed92cf1-5228-4526-8e58-0772e61c6dcf/cancel` → **200**

```json
{
  "command_id": "61820594-0709-45b6-b6c1-aecd808c69b3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "7ed92cf1-5228-4526-8e58-0772e61c6dcf",
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
  "created_at": "2026-10-30T11:07:20.062746Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112538"
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
  "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T11:04:57.422009Z",
  "last_entries": [
    {
      "order_id": "7ed92cf1-5228-4526-8e58-0772e61c6dcf",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T11:07:20.596241Z"
    },
    {
      "order_id": "8b2fa711-f00b-4a0f-ae31-a69235660321",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T11:07:19.572223Z"
    },
    {
      "order_id": "2a484d74-bb7e-483c-ab3a-1acb5d85dc05",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T11:04:57.422009Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "44237e50-7ed7-478d-8867-97f6284c36be",
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
  "last_heartbeat_at": "2026-10-30T11:07:18.8278Z",
  "last_location_at": "2026-10-30T11:07:18.8278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44237e50-7ed7-478d-8867-97f6284c36be/close` → **200**

```json
{
  "command_id": "c191a7e8-e164-432f-aacb-33fd0dfbb151",
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

Done: operator bonus for fulfilled 8b2fa711-f00b-4a0f-ae31-a69235660321 and operator-fault cancellation 7ed92cf1-5228-4526-8e58-0772e61c6dcf.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673889566",
  "device_ref": "sandbox-11686"
}
```

```json
{
  "challenge_id": "3d02fbbc-1f51-4d43-a9f7-ba17d46b0634",
  "expires_at": "2026-10-30T11:12:24.787111011Z",
  "resend_available_at": "2026-10-30T11:07:25.787111011Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673889566` → **200**

```json
{
  "phone": "+380673889566",
  "audience": "CLIENT",
  "code": "227013",
  "sent_at": "2026-10-30T11:07:24.789799305Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674339632",
  "device_ref": "sandbox-23109",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b3a763a4-12dc-4f20-8f5d-e10031f09847",
  "expires_at": "2026-10-30T11:12:26.240830639Z",
  "resend_available_at": "2026-10-30T11:07:27.240830639Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674339632` → **200**

```json
{
  "phone": "+380674339632",
  "audience": "CLIENT",
  "code": "366735",
  "sent_at": "2026-10-30T11:07:26.242696436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674339632",
  "device_ref": "sandbox-24891",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3228d5a5-6a22-4e3f-b8b5-1ee344c87aa4",
  "expires_at": "2026-10-30T11:12:27.695069847Z",
  "resend_available_at": "2026-10-30T11:07:28.695069847Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674339632` → **200**

```json
{
  "phone": "+380674339632",
  "audience": "CLIENT",
  "code": "264279",
  "sent_at": "2026-10-30T11:07:27.697493898Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674630000",
  "device_ref": "sandbox-11959"
}
```

```json
{
  "challenge_id": "f24ca69e-df26-4fe7-8901-73bc44ac561d",
  "expires_at": "2026-10-30T11:12:29.163831009Z",
  "resend_available_at": "2026-10-30T11:07:30.163831009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674630000",
  "device_ref": "sandbox-7059"
}
```

```json
{
  "challenge_id": "f1bcf909-e725-427a-8814-980638317119",
  "expires_at": "2026-10-30T11:12:30.615722561Z",
  "resend_available_at": "2026-10-30T11:07:31.615722561Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674630000` → **200**

```json
{
  "phone": "+380674630000",
  "audience": "CLIENT",
  "code": "426254",
  "sent_at": "2026-10-30T11:07:30.618108511Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674630000",
  "device_ref": "sandbox-5747",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e0a47871-9a24-4bd0-8482-056eb4383a81",
  "expires_at": "2026-10-30T11:12:32.083449256Z",
  "resend_available_at": "2026-10-30T11:07:33.083449256Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674630000` → **200**

```json
{
  "phone": "+380674630000",
  "audience": "CLIENT",
  "code": "319386",
  "sent_at": "2026-10-30T11:07:32.08586489Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380674630000",
  "device_ref": "sandbox-2295",
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
  "correlation_id": "95bab5ea-1d85-4c5d-9ee5-7ace7f4327bd",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000010877"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "20857b45-a454-4e53-8d11-690cee8c7fad"
}
```

`GET /sandbox/v1/otp?phone=%2B442000010877` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120006759"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "73595186-46b2-4117-bf18-2c8470f84638"
}
```

`GET /sandbox/v1/otp?phone=%2B37120006759` → **404**

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
  "session_id": "e5de2e73-d568-43f9-81cc-7ef1ace043b6",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzNTQsImlhdCI6MTc5MzM1ODQ1NCwianRpIjoiOGE4MTBlMmMtZWUyMi00NzFkLWJhMTQtZDYwMmU2NDUyYjdmIiwic2lkIjoiZTVkZTJlNzMtZDU2OC00M2Y5LTgxY2MtN2VmMWFjZTA0M2I2In0.jeUc0TB8x4QYuxJId6yiwXYVKMnCBVxq7SrAGGufbr4",
  "access_expires_at": "2026-10-30T11:22:34.614591926Z",
  "refresh_token": "8EEY5zC_2fNSGB6MXpslprfSB3ss0pPauYBkkH3ybHU",
  "refresh_expires_at": "2026-10-30T23:07:34.6140903Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674630000` → **200**

```json
{
  "deliveries": [
    {
      "id": "7b2f300f-4abd-4368-964d-b0d4d4ff30d3",
      "challenge_id": "e0a47871-9a24-4bd0-8482-056eb4383a81",
      "phone": "+380674630000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0ee93a0e-0b48-42e8-bc4e-8a3b996f841b",
      "error": null,
      "attempted_at": "2026-10-30T11:07:32.086351Z"
    },
    {
      "id": "42af2b6f-f211-4570-8355-540a36f11803",
      "challenge_id": "f1bcf909-e725-427a-8814-980638317119",
      "phone": "+380674630000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-44fa0a8d-3a2c-467a-be3e-512a80456264",
      "error": null,
      "attempted_at": "2026-10-30T11:07:30.618496Z"
    },
    {
      "id": "0ac0df97-a5a9-413f-b3e2-856ffd752ec0",
      "challenge_id": "f24ca69e-df26-4fe7-8901-73bc44ac561d",
      "phone": "+380674630000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T11:07:29.166196Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674630000` → **200**

```json
{
  "phone": "+380674630000",
  "audience": "CLIENT",
  "code": "319386",
  "sent_at": "2026-10-30T11:07:32.08586489Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674339632` → **200**

```json
{
  "deliveries": [
    {
      "id": "3f111f08-3f06-451d-8c07-44bcc9525778",
      "challenge_id": "3228d5a5-6a22-4e3f-b8b5-1ee344c87aa4",
      "phone": "+380674339632",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-fe9e8c78-68c9-4140-b406-1d293e75cac4",
      "error": null,
      "attempted_at": "2026-10-30T11:07:27.697959Z"
    },
    {
      "id": "3889d16b-d216-44cd-96d6-5e9538a5eb9b",
      "challenge_id": "b3a763a4-12dc-4f20-8f5d-e10031f09847",
      "phone": "+380674339632",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c1e8cd42-799e-49af-8820-b8b340634bd4",
      "error": null,
      "attempted_at": "2026-10-30T11:07:26.242953Z"
    }
  ]
}
```

Done: SMS to +380673889566; SMS then a call to +380674339632; a failed SMS, two calls and a refused third to +380674630000; +44 and +371 refused.

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
  "session_id": "0440132b-8073-4eef-bd9b-7777a1c6d2fc",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzNTUsImlhdCI6MTc5MzM1ODQ1NSwianRpIjoiNzIwZjc3YTctNWFmZC00NTlhLThmMzUtODVhZjIxMDljNzhhIiwic2lkIjoiMDQ0MDEzMmItODA3My00ZWVmLWJkOWItNzc3N2ExYzZkMmZjIn0.vg6Ynzf5Jj3907i58jB81ZfXarZbN5REo1wKh1Q0LEw",
  "access_expires_at": "2026-10-30T11:22:35.660412699Z",
  "refresh_token": "bkPNfW1MOPMHeoeP5SoVxHmYyBagQsb0b5bYVeEHw0o",
  "refresh_expires_at": "2026-10-30T23:07:35.659710018Z",
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
  "session_id": "96789895-e779-4e19-a24b-b9a2d38e9054",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzNTYsImlhdCI6MTc5MzM1ODQ1NiwianRpIjoiMGNlY2QxYWUtZjA5OC00ZmIwLTlhMGYtNzYxM2I1OTVhMjM5Iiwic2lkIjoiOTY3ODk4OTUtZTc3OS00ZTE5LWEyNGItYjlhMmQzOGU5MDU0In0.FQLO1VS8Dj7pFRxbtcet4BDBKTsPKDHfxNF8XtbhpMc",
  "access_expires_at": "2026-10-30T11:22:36.149666907Z",
  "refresh_token": "0qRKlchN7ukNm346ZQFBPrqX0uUalvcqtJDOmJWsTlA",
  "refresh_expires_at": "2026-10-30T23:07:36.149216637Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "19abc539-69d2-4037-81d3-63395a19359c",
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

`POST /api/admin/v1/staff-extensions/19abc539-69d2-4037-81d3-63395a19359c` → **200**

```json
{
  "command_id": "137b5960-331e-496a-b34c-9e7a0c1fe91b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "19abc539-69d2-4037-81d3-63395a19359c",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e0cd58b9-c0ab-471e-922d-e3a8df74babf",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T11:07:37.152268Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T11:07:37.152268Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "72ddc506-0062-4c10-bd56-94b188278611",
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
  "id": "77fbc3e2-782c-45c7-80a4-7b2097b2c7b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:37.605855Z",
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
  "command_id": "479652e1-f902-499f-aeb8-ac189f5ad19b",
  "quote_id": "77fbc3e2-782c-45c7-80a4-7b2097b2c7b2",
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
    "phone": "+380677197793"
  }
}
```

```json
{
  "id": "f9345faf-094d-42a2-99f5-131a402be681",
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
  "created_at": "2026-10-30T11:07:37.846307Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677197793"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/f9345faf-094d-42a2-99f5-131a402be681/calls` → **201**

```json
{
  "command_id": "492448a4-fba4-44f1-bb68-681a311797e1",
  "to": "CALLER"
}
```

```json
{
  "id": "5a68398f-5af9-4272-89ef-753c640bb552",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "order_ids": [
    "f9345faf-094d-42a2-99f5-131a402be681"
  ],
  "started_at": "2026-10-30T11:07:38.100822Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/f9345faf-094d-42a2-99f5-131a402be681/calls` → **201**

```json
{
  "command_id": "492448a4-fba4-44f1-bb68-681a311797e1",
  "to": "CALLER"
}
```

```json
{
  "id": "5a68398f-5af9-4272-89ef-753c640bb552",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "order_ids": [
    "f9345faf-094d-42a2-99f5-131a402be681"
  ],
  "started_at": "2026-10-30T11:07:38.100822Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "5a68398f-5af9-4272-89ef-753c640bb552",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677197793",
    "at": "2026-10-30T11:07:38.146753831Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "5a68398f-5af9-4272-89ef-753c640bb552",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25026",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "5a68398f-5af9-4272-89ef-753c640bb552"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "5a68398f-5af9-4272-89ef-753c640bb552",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=f9345faf-094d-42a2-99f5-131a402be681` → **200**

```json
{
  "calls": [
    {
      "id": "5a68398f-5af9-4272-89ef-753c640bb552",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [
        "f9345faf-094d-42a2-99f5-131a402be681"
      ],
      "started_at": "2026-10-30T11:07:38.100822Z",
      "answered_at": "2026-10-30T11:07:38.678436Z",
      "ended_at": "2026-10-30T11:07:38.697432Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=f9345faf-094d-42a2-99f5-131a402be681` → **200**

```json
{
  "calls": [
    {
      "id": "5a68398f-5af9-4272-89ef-753c640bb552",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "order_ids": [
        "f9345faf-094d-42a2-99f5-131a402be681"
      ],
      "started_at": "2026-10-30T11:07:38.100822Z",
      "answered_at": "2026-10-30T11:07:38.678436Z",
      "ended_at": "2026-10-30T11:07:38.697432Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T11:07:39.697588Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/f9345faf-094d-42a2-99f5-131a402be681` → **200**

```json
{
  "id": "f9345faf-094d-42a2-99f5-131a402be681",
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
  "created_at": "2026-10-30T11:07:37.846307Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677197793"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f9345faf-094d-42a2-99f5-131a402be681/cancel` → **200**

```json
{
  "command_id": "2953a1c4-857d-4ef0-b3e8-6c6e14d9437b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f9345faf-094d-42a2-99f5-131a402be681",
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
  "created_at": "2026-10-30T11:07:37.846307Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677197793"
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
  "command_id": "dc606ae6-7fe2-4fc0-a464-49070806b8cb",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T11:07:41.757216Z",
  "extension": "101"
}
```

Done: outgoing call 5a68398f-5af9-4272-89ef-753c640bb552 from order f9345faf-094d-42a2-99f5-131a402be681, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631501600",
  "device_ref": "sandbox-30258"
}
```

```json
{
  "challenge_id": "0b207d73-ef16-40bb-b214-155ddb76d2d2",
  "expires_at": "2026-10-30T11:12:42.000202299Z",
  "resend_available_at": "2026-10-30T11:07:43.000202299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631501600` → **200**

```json
{
  "phone": "+380631501600",
  "audience": "CLIENT",
  "code": "542866",
  "sent_at": "2026-10-30T11:07:42.002934001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b207d73-ef16-40bb-b214-155ddb76d2d2",
  "code": "542866",
  "device_ref": "sandbox-30258"
}
```

```json
{
  "session_id": "3842a1cb-9b1c-4c17-9204-ae41c59b591b",
  "subject": {
    "type": "CLIENT",
    "id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzNjMmE0NC04ZmM4LTQxMzgtOWU0ZC00NjQyY2I2OTEwYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzYyLCJpYXQiOjE3OTMzNTg0NjIsImp0aSI6IjRhOTViYjVmLThmOWMtNDQzOC05MzE2LTgyMjcwYjJjOGE0MyIsInNpZCI6IjM4NDJhMWNiLTliMWMtNGMxNy05MjA0LWFlNDFjNTliNTkxYiJ9.PP5KFCiMevvC_tES3OgGM5P4929LuiUIvpIiVGciNEo",
  "access_expires_at": "2026-10-30T11:22:42.247463129Z",
  "refresh_token": "UYEYljO2g4Ieep84sp6GyroZsVxAM0GCPDC3UbXnn40",
  "refresh_expires_at": "2026-11-29T11:07:42.246998668Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
  "session_id": "3842a1cb-9b1c-4c17-9204-ae41c59b591b",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631501600",
  "device_ref": "sandbox-20127"
}
```

```json
{
  "challenge_id": "c42fb9ed-5886-4da2-b98f-8307a6df6863",
  "expires_at": "2026-10-30T11:12:44.695067923Z",
  "resend_available_at": "2026-10-30T11:07:45.695067923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631501600` → **200**

```json
{
  "phone": "+380631501600",
  "audience": "CLIENT",
  "code": "151307",
  "sent_at": "2026-10-30T11:07:44.697170727Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c42fb9ed-5886-4da2-b98f-8307a6df6863",
  "code": "151307",
  "device_ref": "sandbox-20127"
}
```

```json
{
  "session_id": "6d869838-252c-434f-9bb0-45d7a0436059",
  "subject": {
    "type": "CLIENT",
    "id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzNjMmE0NC04ZmM4LTQxMzgtOWU0ZC00NjQyY2I2OTEwYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzY0LCJpYXQiOjE3OTMzNTg0NjQsImp0aSI6ImQxNDM1YTU1LTRiOTQtNDcyNC1iYTQ5LTJmN2E0NjRjMDIzOCIsInNpZCI6IjZkODY5ODM4LTI1MmMtNDM0Zi05YmIwLTQ1ZDdhMDQzNjA1OSJ9.JKINHRHBxl0Lxn4-DM3mlt-YGEiCOmB1eFx-o4MGdM8",
  "access_expires_at": "2026-10-30T11:22:44.939492587Z",
  "refresh_token": "Ijm-Stc8zvziJApJ4aKdpLns64-8POFYlKzJ6B2x7hE",
  "refresh_expires_at": "2026-11-29T11:07:44.938543495Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "21eb8633-1211-4c3b-855e-4e22a7b84f2b",
  "expires_at": "2026-10-30T11:12:47.186552486Z",
  "resend_available_at": "2026-10-30T11:07:48.186552486Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631501600` → **200**

```json
{
  "phone": "+380631501600",
  "audience": "CLIENT",
  "code": "986392",
  "sent_at": "2026-10-30T11:07:47.188376501Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637439423"
}
```

```json
{
  "challenge_id": "c984f10c-5216-485e-870b-725a43039819",
  "expires_at": "2026-10-30T11:12:47.427231502Z",
  "resend_available_at": "2026-10-30T11:07:48.427231502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637439423` → **200**

```json
{
  "phone": "+380637439423",
  "audience": "CLIENT",
  "code": "924022",
  "sent_at": "2026-10-30T11:07:47.428988409Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "387b993d-1040-446b-a780-0016e156bcb4",
  "current_challenge_id": "21eb8633-1211-4c3b-855e-4e22a7b84f2b",
  "current_code": "000000",
  "new_challenge_id": "c984f10c-5216-485e-870b-725a43039819",
  "new_code": "924022"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "caacf62e-255b-4268-9922-673eb5ec9d98"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "a2a08139-434c-4816-b72b-aea0363d4e23",
  "current_challenge_id": "21eb8633-1211-4c3b-855e-4e22a7b84f2b",
  "current_code": "986392",
  "new_challenge_id": "c984f10c-5216-485e-870b-725a43039819",
  "new_code": "924022"
}
```

```json
{
  "subject_id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
  "phone": "+380637439423",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
  "session_id": "3842a1cb-9b1c-4c17-9204-ae41c59b591b",
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
  "correlation_id": "c6fc1325-4336-4704-9638-19c44c6472e1"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637439423",
  "device_ref": "sandbox-3571"
}
```

```json
{
  "challenge_id": "45db0e40-da32-42d4-b931-a25c109b79a2",
  "expires_at": "2026-10-30T11:12:50.770731823Z",
  "resend_available_at": "2026-10-30T11:07:51.770731823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637439423` → **200**

```json
{
  "phone": "+380637439423",
  "audience": "CLIENT",
  "code": "415125",
  "sent_at": "2026-10-30T11:07:50.772814528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45db0e40-da32-42d4-b931-a25c109b79a2",
  "code": "415125",
  "device_ref": "sandbox-3571"
}
```

```json
{
  "session_id": "0e63792b-e031-47aa-b73a-394d7f67b6ce",
  "subject": {
    "type": "CLIENT",
    "id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzNjMmE0NC04ZmM4LTQxMzgtOWU0ZC00NjQyY2I2OTEwYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzcxLCJpYXQiOjE3OTMzNTg0NzEsImp0aSI6ImZjMjNiOWM2LTI1ODgtNDE0Yy05YmQ3LTcwZTdjNGYyMzcyNCIsInNpZCI6IjBlNjM3OTJiLWUwMzEtNDdhYS1iNzNhLTM5NGQ3ZjY3YjZjZSJ9.egZzBSjIS3t6i--ZWWbYVqyRUvQi7K9eXnkkJr44ROw",
  "access_expires_at": "2026-10-30T11:22:51.017373897Z",
  "refresh_token": "ieN4Nu9iFRfJAa8GnJXbFAxJdazWxQXNkiYM71nqE1o",
  "refresh_expires_at": "2026-11-29T11:07:51.016922054Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
  "session_id": "0e63792b-e031-47aa-b73a-394d7f67b6ce",
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
  "session_id": "1e166316-7c0f-4738-a7bb-98af3b0d215e",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzNzEsImlhdCI6MTc5MzM1ODQ3MSwianRpIjoiYjBhN2QyNmMtMmFmNS00MjFlLThkZTQtYzdkM2IwYmQyOWYxIiwic2lkIjoiMWUxNjYzMTYtN2MwZi00NzM4LWE3YmItOThhZjNiMGQyMTVlIn0.o5dyKTjDFjbblpafgiMXulobDyXXtusDrCMOyrSGNXg",
  "access_expires_at": "2026-10-30T11:22:51.711141529Z",
  "refresh_token": "lhrVRTBCpWYtfv3Xu977qD3_B48vas8-1zV2HTeZwLU",
  "refresh_expires_at": "2026-10-30T23:07:51.710589339Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2` → **200**

```json
{
  "client": {
    "id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
    "phone": "+380637439423",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T11:07:42.245695Z",
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

`POST /api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2/phone/new-code` → **201**

```json
{
  "phone": "+380633819145"
}
```

```json
{
  "challenge_id": "80ce013f-a8f8-4386-85b8-18a92b3b5efa",
  "expires_at": "2026-10-30T11:12:52.190854549Z",
  "resend_available_at": "2026-10-30T11:07:53.190854549Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633819145` → **200**

```json
{
  "phone": "+380633819145",
  "audience": "CLIENT",
  "code": "413549",
  "sent_at": "2026-10-30T11:07:52.192553731Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2/phone` → **422**

```json
{
  "command_id": "7df4f767-dbeb-4933-b92b-b96785799fc6",
  "expected_version": 3,
  "new_challenge_id": "80ce013f-a8f8-4386-85b8-18a92b3b5efa",
  "new_code": "413550",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d2349f56-c36e-42a7-9ee8-3263fca727c1"
}
```

`POST /api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2/phone` → **400**

```json
{
  "command_id": "7ce19cc0-0bdb-43a5-a480-4a9246d08e6d",
  "expected_version": 3,
  "new_challenge_id": "80ce013f-a8f8-4386-85b8-18a92b3b5efa",
  "new_code": "413549",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8f8f83d8-4203-4906-a54c-c1284cea320c",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/133c2a44-8fc8-4138-9e4d-4642cb6910c2/phone` → **200**

```json
{
  "command_id": "050515ab-cced-4766-83d9-4d19c1fd2a3c",
  "expected_version": 3,
  "new_challenge_id": "80ce013f-a8f8-4386-85b8-18a92b3b5efa",
  "new_code": "413549",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
  "phone": "+380633819145",
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
  "correlation_id": "adc4609a-6b37-465e-be37-311d8beaaf3e"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633819145",
  "device_ref": "sandbox-789"
}
```

```json
{
  "challenge_id": "140a1ddf-a85f-43a9-9d0d-ffd842d33d02",
  "expires_at": "2026-10-30T11:12:53.374358062Z",
  "resend_available_at": "2026-10-30T11:07:54.374358062Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633819145` → **200**

```json
{
  "phone": "+380633819145",
  "audience": "CLIENT",
  "code": "367913",
  "sent_at": "2026-10-30T11:07:53.376564939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "140a1ddf-a85f-43a9-9d0d-ffd842d33d02",
  "code": "367913",
  "device_ref": "sandbox-789"
}
```

```json
{
  "session_id": "714ae0ec-32a0-4aff-9c27-f28bff5450e5",
  "subject": {
    "type": "CLIENT",
    "id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzNjMmE0NC04ZmM4LTQxMzgtOWU0ZC00NjQyY2I2OTEwYzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzczLCJpYXQiOjE3OTMzNTg0NzMsImp0aSI6IjkyYmUzNDNmLTkzYTEtNGUyMi1iNzUzLTkyMzdhZTFlYzA0NiIsInNpZCI6IjcxNGFlMGVjLTMyYTAtNGFmZi05YzI3LWYyOGJmZjU0NTBlNSJ9.PYbFC3Eaea5YP_v3rEikn31SFnlc3WlYFhJwe36kokg",
  "access_expires_at": "2026-10-30T11:22:53.619450403Z",
  "refresh_token": "QQPGyuEE24xe78Ahp0qcgpvu1eubuhIjc2ly91zmK8o",
  "refresh_expires_at": "2026-11-29T11:07:53.619039039Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "133c2a44-8fc8-4138-9e4d-4642cb6910c2",
  "session_id": "714ae0ec-32a0-4aff-9c27-f28bff5450e5",
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
  "phone": "+380639618453",
  "device_ref": "sandbox-21063"
}
```

```json
{
  "challenge_id": "1cfd7dbc-4c03-4984-a9b2-e83f86bb5caf",
  "expires_at": "2026-10-30T11:12:54.077988732Z",
  "resend_available_at": "2026-10-30T11:07:55.077988732Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639618453` → **200**

```json
{
  "phone": "+380639618453",
  "audience": "CLIENT",
  "code": "746164",
  "sent_at": "2026-10-30T11:07:54.080384997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cfd7dbc-4c03-4984-a9b2-e83f86bb5caf",
  "code": "746164",
  "device_ref": "sandbox-21063"
}
```

```json
{
  "session_id": "429706cb-1840-46ad-a9a2-54e0991596e9",
  "subject": {
    "type": "CLIENT",
    "id": "851b29aa-58fa-4d15-97ea-0ae6464a028e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NTFiMjlhYS01OGZhLTRkMTUtOTdlYS0wYWU2NDY0YTAyOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5Mzc0LCJpYXQiOjE3OTMzNTg0NzQsImp0aSI6ImZiMzUxMWQzLTEyM2QtNGQ1Mi1hYzdkLTBiN2VhOGZkZjE0MiIsInNpZCI6IjQyOTcwNmNiLTE4NDAtNDZhZC1hOWEyLTU0ZTA5OTE1OTZlOSJ9.egn_6qaNL-5g8gKs7hswCIbcvpR_Q4WBB3wScogVLeo",
  "access_expires_at": "2026-10-30T11:22:54.32368666Z",
  "refresh_token": "bsb_dyA6ScKDFgHpH4uoQfR5p6SrERm08KSr-fsOF24",
  "refresh_expires_at": "2026-11-29T11:07:54.32331149Z",
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
  "session_id": "185592e8-36d1-4cec-976b-b1a4ae220a02",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzNzUsImlhdCI6MTc5MzM1ODQ3NSwianRpIjoiZGQxYzcwMTQtZGNiMy00YTJhLThhYjctODYzYTkyMGQxNzU4Iiwic2lkIjoiMTg1NTkyZTgtMzZkMS00Y2VjLTk3NmItYjFhNGFlMjIwYTAyIn0.60KLMrzxJC_VjWkANF2eMP2cV8mkIm4H-O516bj5sCw",
  "access_expires_at": "2026-10-30T11:22:55.260642686Z",
  "refresh_token": "AGs1u6Fwg2n_YDrGTPO9xWhBlUjDvdEjmqKJkNwFctM",
  "refresh_expires_at": "2026-10-30T23:07:55.260169222Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639618453` → **200**

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
  "correlation_id": "f449c5bf-7df7-4996-a7c2-be5e3907a00b"
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
  "session_id": "b8d1601f-454d-4176-9cf6-317e861c1986",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzNzYsImlhdCI6MTc5MzM1ODQ3NiwianRpIjoiN2E3ZWIyMjgtMzkyOS00NzhjLTk1ODctNTc4MjBkYTE5NzBiIiwic2lkIjoiYjhkMTYwMWYtNDU0ZC00MTc2LTljZjYtMzE3ZTg2MWMxOTg2In0.DGaRrRVE3fgP_vB0CVVCfc513qTrjIEVBHagwf2UFLw",
  "access_expires_at": "2026-10-30T11:22:56.203352254Z",
  "refresh_token": "OB2QgNlz6fU-NTiAhf4CCBEICOAYSdvIjtrIjr3bF7U",
  "refresh_expires_at": "2026-10-30T23:07:56.202949984Z",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T11:04:15.993833Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "13f788d3-96f8-475e-be1c-babd6100541a",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T11:07:56.660660512Z"
}
```

## The rider books the airport for 2026-10-30T14:07:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600289518",
  "device_ref": "sandbox-25276"
}
```

```json
{
  "challenge_id": "139e5a7c-9e50-4c9d-9f2f-1bd2fcecb1ec",
  "expires_at": "2026-10-30T11:12:56.893611203Z",
  "resend_available_at": "2026-10-30T11:07:57.893611203Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600289518` → **200**

```json
{
  "phone": "+48600289518",
  "audience": "CLIENT",
  "code": "358909",
  "sent_at": "2026-10-30T11:07:56.895729601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "139e5a7c-9e50-4c9d-9f2f-1bd2fcecb1ec",
  "code": "358909",
  "device_ref": "sandbox-25276"
}
```

```json
{
  "session_id": "597a83f2-385f-4c15-89eb-4ff07797b41d",
  "subject": {
    "type": "CLIENT",
    "id": "79373a5e-8893-4974-b660-7767d9cd554f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTM3M2E1ZS04ODkzLTQ5NzQtYjY2MC03NzY3ZDljZDU1NGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5Mzc3LCJpYXQiOjE3OTMzNTg0NzcsImp0aSI6IjYzMDViZWQzLThjMWYtNGNkZC05YjZjLThhOTgzNGYzOWVhNSIsInNpZCI6IjU5N2E4M2YyLTM4NWYtNGMxNS04OWViLTRmZjA3Nzk3YjQxZCJ9.Jc-qLbloLX13NEEtL2CJd_KZch69CWjoomuT9mZv3fc",
  "access_expires_at": "2026-10-30T11:22:57.14272769Z",
  "refresh_token": "mjyDJvNDIxwj1O-SDKqLxa6242_2XjFtmxnzMmD_tN0",
  "refresh_expires_at": "2026-11-29T11:07:57.142160589Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f9ac493-a13d-453d-90fb-eb81585f269b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T14:07:55Z"
}
```

```json
{
  "id": "1bf7d599-6b4c-4edb-ac7c-a3e2e952ed00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:12:57.402828Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T14:07:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "20b9af17-c998-452e-ab3b-a8dadda1073e",
  "quote_id": "1bf7d599-6b4c-4edb-ac7c-a3e2e952ed00",
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
  "pickup_at": "2026-10-30T14:07:55Z"
}
```

```json
{
  "id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "79373a5e-8893-4974-b660-7767d9cd554f",
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
  "created_at": "2026-10-30T11:07:57.638251Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T14:07:55Z",
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
  "device_ref": "sandbox-9530"
}
```

```json
{
  "challenge_id": "91feaafa-eee6-4e3e-ade1-86517e88d6ad",
  "expires_at": "2026-10-30T11:12:57.880196475Z",
  "resend_available_at": "2026-10-30T11:07:58.880196475Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "293954",
  "sent_at": "2026-10-30T11:07:57.882598279Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91feaafa-eee6-4e3e-ade1-86517e88d6ad",
  "code": "293954",
  "device_ref": "sandbox-9530"
}
```

```json
{
  "session_id": "3e613eff-38c0-4341-abe6-b1a531087d59",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTM3OCwiaWF0IjoxNzkzMzU4NDc4LCJqdGkiOiIyOTU5OGQ0Ni05ZWM1LTQ2NmQtOTZjZC1mZGRlNWMyMjUyY2IiLCJzaWQiOiIzZTYxM2VmZi0zOGMwLTQzNDEtYWJlNi1iMWE1MzEwODdkNTkifQ.DhYkYkcHfI8U-hJ5GZt1OEWgkokclLLn316i0RaPES8",
  "access_expires_at": "2026-10-30T11:22:58.127830748Z",
  "refresh_token": "VzsOqeChuhgHgb0Q_cIhLwhK1hJkkYuC-WDwoddd_8I",
  "refresh_expires_at": "2026-11-29T11:07:58.12745066Z",
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
  "command_id": "84d838df-ca7d-4800-88e7-d4c4bbaea670",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:07:58Z",
    "sequence": 1793358478566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8fe42346-1b41-41a6-95d0-4a76c91f7cda",
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
  "last_heartbeat_at": "2026-10-30T11:07:58.582708Z",
  "last_location_at": "2026-10-30T11:07:58.582708Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
      "short_number": 25,
      "pickup_at": "2026-10-30T14:07:55Z",
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

`POST /api/driver/v1/preorders/d4b2fade-4077-47e0-b6c3-3cb9436c814f/reserve` → **200**

```json
{
  "command_id": "c9da5bfb-fa0e-4381-aa2b-ac8590536b0f"
}
```

```json
{
  "id": "7b3c76bf-3807-4351-9fa5-e98e7e350d4f",
  "state": "RESERVED",
  "order": {
    "order_id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
    "short_number": 25,
    "pickup_at": "2026-10-30T14:07:55Z",
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
  "reserved_at": "2026-10-30T11:07:59.045662Z",
  "confirm_from": "2026-10-30T13:37:55Z",
  "confirm_until": "2026-10-30T13:47:55Z",
  "drop_until": "2026-10-30T13:07:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "7b3c76bf-3807-4351-9fa5-e98e7e350d4f",
      "state": "RESERVED",
      "order": {
        "order_id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
        "short_number": 25,
        "pickup_at": "2026-10-30T14:07:55Z",
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
      "reserved_at": "2026-10-30T11:07:59.045662Z",
      "confirm_from": "2026-10-30T13:37:55Z",
      "confirm_until": "2026-10-30T13:47:55Z",
      "drop_until": "2026-10-30T13:07:55Z"
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
      "id": "7b3c76bf-3807-4351-9fa5-e98e7e350d4f",
      "state": "RESERVED",
      "order": {
        "order_id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
        "short_number": 25,
        "pickup_at": "2026-10-30T14:07:55Z",
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
      "reserved_at": "2026-10-30T11:07:59.045662Z",
      "confirm_from": "2026-10-30T13:37:55Z",
      "confirm_until": "2026-10-30T13:47:55Z",
      "drop_until": "2026-10-30T13:07:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/7b3c76bf-3807-4351-9fa5-e98e7e350d4f/confirm` → **409**

```json
{
  "command_id": "e865ee95-9b40-4d88-b95d-f4fe854c641d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/7b3c76bf-3807-4351-9fa5-e98e7e350d4f/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c0d5108f-b70f-4487-a478-9ccd0c5e3493"
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
  "session_id": "c7b1d6d5-9f04-44b7-8862-33202519e589",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzODAsImlhdCI6MTc5MzM1ODQ4MCwianRpIjoiYzM2MTFjNDctZDA1OC00ZGYzLTkyMGUtMTJiYmZmMTNkMjY3Iiwic2lkIjoiYzdiMWQ2ZDUtOWYwNC00NGI3LTg4NjItMzMyMDI1MTllNTg5In0.eS7UF2LqNioOhVpdlE7AgnfsmBertF_JESbcfKVdPOg",
  "access_expires_at": "2026-10-30T11:23:00.350631202Z",
  "refresh_token": "nsQ19XfaD8pBnNVuLvujTaBACnG-ZddKY-ImCMoZrug",
  "refresh_expires_at": "2026-10-30T23:08:00.350218386Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d4b2fade-4077-47e0-b6c3-3cb9436c814f` → **200**

```json
{
  "id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "79373a5e-8893-4974-b660-7767d9cd554f",
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
  "created_at": "2026-10-30T11:07:57.638251Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T14:07:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "7b3c76bf-3807-4351-9fa5-e98e7e350d4f",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T11:07:59.045662Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d4b2fade-4077-47e0-b6c3-3cb9436c814f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T11:07:57.639156Z",
      "actor": {
        "type": "CLIENT",
        "id": "79373a5e-8893-4974-b660-7767d9cd554f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
        "preorder": true,
        "quote_id": "1bf7d599-6b4c-4edb-ac7c-a3e2e952ed00",
        "pickup_at": "2026-10-30T14:07:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "41fd538f-7342-4fff-8f1d-1e97d735372c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T11:07:59.046589Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d4b2fade-4077-47e0-b6c3-3cb9436c814f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "7b3c76bf-3807-4351-9fa5-e98e7e350d4f"
      },
      "correlation_id": "387b44b0-ecf4-4727-8973-e70ddb6cb87f"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order d4b2fade-4077-47e0-b6c3-3cb9436c814f, reservation 7b3c76bf-3807-4351-9fa5-e98e7e350d4f.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14671"
}
```

```json
{
  "challenge_id": "bf95ece2-1b75-4713-8802-af6a0d2bbc5d",
  "expires_at": "2026-10-30T11:13:01.095868693Z",
  "resend_available_at": "2026-10-30T11:08:02.095868693Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "115169",
  "sent_at": "2026-10-30T11:08:01.098163069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf95ece2-1b75-4713-8802-af6a0d2bbc5d",
  "code": "115169",
  "device_ref": "sandbox-14671"
}
```

```json
{
  "session_id": "91373d8c-8754-498a-8b20-60819ea7da63",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTM4MSwiaWF0IjoxNzkzMzU4NDgxLCJqdGkiOiI3ZmRjNjk1OS0yODg5LTQ4ODItYmM3MS1hM2RmYTExODUzOTIiLCJzaWQiOiI5MTM3M2Q4Yy04NzU0LTQ5OGEtOGIyMC02MDgxOWVhN2RhNjMifQ.CY46sqB0u7xxmbmd38H8oL7hn3QGkfgoJrHZCARhqV4",
  "access_expires_at": "2026-10-30T11:23:01.361127811Z",
  "refresh_token": "mgu9H6a-1CuT5M84sO58DaJTnB-0ct14dQ3VQy40SF0",
  "refresh_expires_at": "2026-11-29T11:08:01.360736356Z",
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
  "command_id": "4b668c40-cf5a-4aeb-8145-b1cc99432154",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:01Z",
    "sequence": 1793358481803
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:01.819089Z",
  "last_location_at": "2026-10-30T11:08:01.819089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675750982",
  "device_ref": "sandbox-14789"
}
```

```json
{
  "challenge_id": "27f6e749-905a-4920-a4d2-77435540d8b7",
  "expires_at": "2026-10-30T11:13:02.047411413Z",
  "resend_available_at": "2026-10-30T11:08:03.047411413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675750982` → **200**

```json
{
  "phone": "+380675750982",
  "audience": "CLIENT",
  "code": "766196",
  "sent_at": "2026-10-30T11:08:02.04955947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27f6e749-905a-4920-a4d2-77435540d8b7",
  "code": "766196",
  "device_ref": "sandbox-14789"
}
```

```json
{
  "session_id": "cd87de83-47f9-442c-b35e-05f4cfa34b19",
  "subject": {
    "type": "CLIENT",
    "id": "bf620ac1-a822-4385-a914-7a99d401447e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjYyMGFjMS1hODIyLTQzODUtYTkxNC03YTk5ZDQwMTQ0N2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5MzgyLCJpYXQiOjE3OTMzNTg0ODIsImp0aSI6IjFjOGExMDIwLTE3NjItNDI0YS1hMjY2LWQ5Y2NlMjFiMDhmYyIsInNpZCI6ImNkODdkZTgzLTQ3ZjktNDQyYy1iMzVlLTA1ZjRjZmEzNGIxOSJ9.ugub4iC8K69F90AgFZXNKYthMehJS0Hzda0rnVsNEXM",
  "access_expires_at": "2026-10-30T11:23:02.300722188Z",
  "refresh_token": "YBadbG8wZ4QAKUK_kdN0YLyFWmE12fH1VWX79qUR1NU",
  "refresh_expires_at": "2026-11-29T11:08:02.300356091Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3c3b7c8-112b-49f1-b0f6-3c7a483e15e9",
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
  "id": "54a8ecc2-1d78-4369-9656-3974d85eb6aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:13:02.537463Z",
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
  "command_id": "a096e84e-99c3-4d3e-acd2-b8ea4484c949",
  "quote_id": "54a8ecc2-1d78-4369-9656-3974d85eb6aa",
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
  "id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bf620ac1-a822-4385-a914-7a99d401447e",
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
  "created_at": "2026-10-30T11:08:02.787243Z",
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
    "id": "f2b02766-3526-42b2-a3be-e988b1497bdc",
    "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
    "expires_at": "2026-10-30T11:08:17.789658Z",
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

`POST /api/driver/v1/offers/f2b02766-3526-42b2-a3be-e988b1497bdc/accept` → **200**

```json
{
  "command_id": "be13921a-f30d-42d4-868a-b0421f9d3e4e"
}
```

```json
{
  "id": "c328cdee-2d0c-4e3b-b5bd-7e2130f6e725",
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "efd9b170-5299-4d21-acf3-549285c014c5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "efd9b170-5299-4d21-acf3-549285c014c5",
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "assignment_id": "c328cdee-2d0c-4e3b-b5bd-7e2130f6e725",
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

`POST /api/driver/v1/work-sessions/ee66cbf6-cf1a-4d91-8a63-ddedc830bd70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:03Z",
    "sequence": 1793358483739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:03.755909Z",
  "last_location_at": "2026-10-30T11:08:03.755909Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "efd9b170-5299-4d21-acf3-549285c014c5",
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "assignment_id": "c328cdee-2d0c-4e3b-b5bd-7e2130f6e725",
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

`POST /api/driver/v1/trips/efd9b170-5299-4d21-acf3-549285c014c5/arrive` → **200**

```json
{
  "command_id": "d48329d0-c8af-4b22-b3c4-76fe8af8ddf3",
  "expected_version": 0
}
```

```json
{
  "id": "efd9b170-5299-4d21-acf3-549285c014c5",
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "assignment_id": "c328cdee-2d0c-4e3b-b5bd-7e2130f6e725",
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
  "arrived_at": "2026-10-30T11:08:04.2264Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/efd9b170-5299-4d21-acf3-549285c014c5/start` → **200**

```json
{
  "command_id": "d18d1c73-cf17-44b4-b813-07e82fac9579",
  "expected_version": 1
}
```

```json
{
  "id": "efd9b170-5299-4d21-acf3-549285c014c5",
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "assignment_id": "c328cdee-2d0c-4e3b-b5bd-7e2130f6e725",
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
  "arrived_at": "2026-10-30T11:08:04.2264Z",
  "started_at": "2026-10-30T11:08:04.460979Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ee66cbf6-cf1a-4d91-8a63-ddedc830bd70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:04Z",
    "sequence": 1793358484686
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:04.701935Z",
  "last_location_at": "2026-10-30T11:08:04.701935Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/efd9b170-5299-4d21-acf3-549285c014c5/complete` → **200**

```json
{
  "command_id": "f7fb9e1a-ae0e-4d90-9ef8-6e33f49310ed",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:08:04Z",
  "cash_received": true
}
```

```json
{
  "id": "efd9b170-5299-4d21-acf3-549285c014c5",
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "assignment_id": "c328cdee-2d0c-4e3b-b5bd-7e2130f6e725",
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
  "arrived_at": "2026-10-30T11:08:04.2264Z",
  "started_at": "2026-10-30T11:08:04.460979Z",
  "completed_at": "2026-10-30T11:08:04.931261Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/9691ee3f-fba8-404c-b09b-dd87f07a0641/rating` → **200**

```json
{
  "command_id": "8e48bb7c-1708-4f81-bc88-834d3e7183f5",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "score": 5,
  "created_at": "2026-10-30T11:08:05.178640657Z"
}
```

`POST /api/driver/v1/orders/9691ee3f-fba8-404c-b09b-dd87f07a0641/rating` → **200**

```json
{
  "command_id": "462308fa-2be0-4407-9e12-dab4c01775d0",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
  "score": 4,
  "created_at": "2026-10-30T11:08:05.410956364Z"
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
  "session_id": "b1b2c731-765f-4f4a-889c-5fa82cc7b798",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzODYsImlhdCI6MTc5MzM1ODQ4NiwianRpIjoiNDc3YzE4MjgtZTIyOS00N2Q2LWI0NDQtODBlZWYzNDljNzJlIiwic2lkIjoiYjFiMmM3MzEtNzY1Zi00ZjRhLTg4OWMtNWZhODJjYzdiNzk4In0.RW4u6QVjCbiJu68SUcRJtsD_hcYb_xnkr4_qANCbRW0",
  "access_expires_at": "2026-10-30T11:23:06.142727335Z",
  "refresh_token": "K5raKR3kRjSfGYC5Dg0c6zSAMKHVYqoMwNfQj6e7OIQ",
  "refresh_expires_at": "2026-10-30T23:08:06.142310464Z",
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
  "session_id": "afcfe3b9-6614-40c5-82f5-9755701d3e29",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzODYsImlhdCI6MTc5MzM1ODQ4NiwianRpIjoiYjM1ZTY2ZmYtNDk0Yi00OTY5LWIxN2MtMmE3OGFmMDBmZjhjIiwic2lkIjoiYWZjZmUzYjktNjYxNC00MGM1LTgyZjUtOTc1NTcwMWQzZTI5In0.pxWyrI_Kl8XZywhoXwHekcZatVPjqFSbTmdwb20uChw",
  "access_expires_at": "2026-10-30T11:23:06.628388826Z",
  "refresh_token": "u9UGrvbExvCGFnHyAXYEF3H3-P87KSgGKt10vlyYV-g",
  "refresh_expires_at": "2026-10-30T23:08:06.627930204Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9691ee3f-fba8-404c-b09b-dd87f07a0641/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
      "author_type": "RIDER",
      "author_id": "bf620ac1-a822-4385-a914-7a99d401447e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T11:08:05.178641Z"
    },
    {
      "order_id": "9691ee3f-fba8-404c-b09b-dd87f07a0641",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "bf620ac1-a822-4385-a914-7a99d401447e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T11:08:05.410956Z"
    }
  ]
}
```

Done: ratings for order 9691ee3f-fba8-404c-b09b-dd87f07a0641.

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
  "session_id": "d045e07d-2b74-432f-8ff4-5acec796d8cd",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzODcsImlhdCI6MTc5MzM1ODQ4NywianRpIjoiOTNjNDRlYzYtMTVlNS00ZDM3LThmNzgtNzE2MzA1YTM0ZDJkIiwic2lkIjoiZDA0NWUwN2QtMmI3NC00MzJmLThmZjQtNWFjZWM3OTZkOGNkIn0.HbY90BekR5p8CCe4lLu5rou4yLml-57sYBHnPE9rWpk",
  "access_expires_at": "2026-10-30T11:23:07.357037447Z",
  "refresh_token": "7aPo3kvNfXOdAB1ZYKRwrKnFOqcos2pvHv4rNPFZPk8",
  "refresh_expires_at": "2026-10-30T23:08:07.356628527Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f898dbf0-ff7d-40b8-893d-e3b11d9bb0f2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "7a7b5beb-a324-43be-8295-49e0706ea2dd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:07.588216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a7b5beb-a324-43be-8295-49e0706ea2dd` → **200**

```json
{
  "id": "7a7b5beb-a324-43be-8295-49e0706ea2dd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:07.588216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a7b5beb-a324-43be-8295-49e0706ea2dd` → **200**

```json
{
  "id": "7a7b5beb-a324-43be-8295-49e0706ea2dd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:07.588216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a7b5beb-a324-43be-8295-49e0706ea2dd` → **200**

```json
{
  "id": "7a7b5beb-a324-43be-8295-49e0706ea2dd",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T11:08:07.588216Z",
  "ready_at": "2026-10-30T11:08:09.618849Z",
  "expires_at": "2026-10-31T11:08:09.618849Z"
}
```

`GET /api/admin/v1/reports/exports/7a7b5beb-a324-43be-8295-49e0706ea2dd/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a706c25f-6343-4265-a1ec-f872b505c03c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "4f98ea57-26ea-4a2a-a337-7bdb684edbea",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:10.544346Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4f98ea57-26ea-4a2a-a337-7bdb684edbea` → **200**

```json
{
  "id": "4f98ea57-26ea-4a2a-a337-7bdb684edbea",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:10.544346Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4f98ea57-26ea-4a2a-a337-7bdb684edbea` → **200**

```json
{
  "id": "4f98ea57-26ea-4a2a-a337-7bdb684edbea",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:10.544346Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4f98ea57-26ea-4a2a-a337-7bdb684edbea` → **200**

```json
{
  "id": "4f98ea57-26ea-4a2a-a337-7bdb684edbea",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:10.544346Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4f98ea57-26ea-4a2a-a337-7bdb684edbea` → **200**

```json
{
  "id": "4f98ea57-26ea-4a2a-a337-7bdb684edbea",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T11:08:10.544346Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4f98ea57-26ea-4a2a-a337-7bdb684edbea` → **200**

```json
{
  "id": "4f98ea57-26ea-4a2a-a337-7bdb684edbea",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T11:08:10.544346Z",
  "ready_at": "2026-10-30T11:08:14.627219Z",
  "expires_at": "2026-10-31T11:08:14.627219Z"
}
```

`GET /api/admin/v1/reports/exports/4f98ea57-26ea-4a2a-a337-7bdb684edbea/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/171c49b2-271f-4b10-88a1-f12c140b024e` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/171c49b2-271f-4b10-88a1-f12c140b024e",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ccaedffd-ad82-4dc7-a940-20e5990239b5"
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
  "device_ref": "sandbox-14763"
}
```

```json
{
  "challenge_id": "85a65da2-370d-4db5-9fc3-e746048bc7bb",
  "expires_at": "2026-10-30T11:13:16.194675222Z",
  "resend_available_at": "2026-10-30T11:08:17.194675222Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "154213",
  "sent_at": "2026-10-30T11:08:16.198477539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85a65da2-370d-4db5-9fc3-e746048bc7bb",
  "code": "154213",
  "device_ref": "sandbox-14763"
}
```

```json
{
  "session_id": "657777e1-8a8d-43fc-b237-2d271f1feeee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTM5NiwiaWF0IjoxNzkzMzU4NDk2LCJqdGkiOiI2YzhjOTQyYS1lMmY2LTRiOGItOGI0ZC1jODI4MzQ4MGEyNjkiLCJzaWQiOiI2NTc3NzdlMS04YThkLTQzZmMtYjIzNy0yZDI3MWYxZmVlZWUifQ.CulomQ_wfbpOizXu7s2EjAP4Wrm15EXDeb9aAL2olQ8",
  "access_expires_at": "2026-10-30T11:23:16.444675789Z",
  "refresh_token": "eZUJSWg_5k-eGAZLVuSG6K2BBxz_Y6_K7843yLYlPDc",
  "refresh_expires_at": "2026-11-29T11:08:16.444180929Z",
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
  "command_id": "d4cc2847-d259-468a-8849-59983dee09b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:17Z",
    "sequence": 1793358497126
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8f01201-01b5-4d79-919a-41161bfd2f7d",
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
  "last_heartbeat_at": "2026-10-30T11:08:17.142917Z",
  "last_location_at": "2026-10-30T11:08:17.142917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "5bec8a4f-949f-45de-ba4f-c46fc469fe5d",
  "points": [
    {
      "sequence": 1793358499381,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T11:07:19Z"
    },
    {
      "sequence": 1793358499387,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T11:08:19Z"
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
  "session_id": "40fe8cdd-09fe-4637-a970-141731c39caf",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTkzOTksImlhdCI6MTc5MzM1ODQ5OSwianRpIjoiOWY5YTRiMzctNTUwMy00NmNmLWJmOTgtMTZjNGJkODk0MTM3Iiwic2lkIjoiNDBmZThjZGQtMDlmZS00NjM3LWE5NzAtMTQxNzMxYzM5Y2FmIn0.fjN_KdRqWWEPo3_S8wOJ4BlSoWvqqSBJM5j7RLBpIio",
  "access_expires_at": "2026-10-30T11:23:19.912429297Z",
  "refresh_token": "F1uBTlxW757fOlQ32K-fc7qO6MQ50IPWg_F98u1sm38",
  "refresh_expires_at": "2026-10-30T23:08:19.912020317Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "bbd5ef9e-49ed-47ab-93ac-65c237760080",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T11:08:19Z",
        "track_point_id": "a87344ee-a029-427c-bfe3-50ed610319e6",
        "work_session_id": "e8f01201-01b5-4d79-919a-41161bfd2f7d"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T11:08:19Z",
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

`POST /api/admin/v1/driver-risk-flags/bbd5ef9e-49ed-47ab-93ac-65c237760080/confirm` → **200**

```json
{
  "command_id": "c93cbe75-fd26-486e-88a6-9b33136f838a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "bbd5ef9e-49ed-47ab-93ac-65c237760080",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T11:08:19Z",
    "track_point_id": "a87344ee-a029-427c-bfe3-50ed610319e6",
    "work_session_id": "e8f01201-01b5-4d79-919a-41161bfd2f7d"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T11:08:19Z",
  "reason": null,
  "reviewed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reviewed_at": "2026-10-30T11:08:20.660839Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/bbd5ef9e-49ed-47ab-93ac-65c237760080/dismiss` → **409**

```json
{
  "command_id": "3cc9c8d8-a6bb-43dc-ab07-18ffff9c4779",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/bbd5ef9e-49ed-47ab-93ac-65c237760080/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bf0ce856-6556-44b5-a916-a2836e733852"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "af991268-9cf9-443b-90c6-b7f6a0a4e9be",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "2b34f89a-615f-49de-9ee1-cabacf260b32",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "raised_at": "2026-10-30T11:08:21.139586Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/2b34f89a-615f-49de-9ee1-cabacf260b32/dismiss` → **200**

```json
{
  "command_id": "7b87f54d-e172-465e-98e8-8c76f058b91d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "2b34f89a-615f-49de-9ee1-cabacf260b32",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "raised_at": "2026-10-30T11:08:21.139586Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reviewed_at": "2026-10-30T11:08:21.377742Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "94d7a359-1d41-478d-91f3-a0e7e100365f",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "bbd5ef9e-49ed-47ab-93ac-65c237760080"
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
      "actor_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T11:08:21.616949Z"
    }
  ],
  "duplicates": []
}
```

Done: flag bbd5ef9e-49ed-47ab-93ac-65c237760080 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7da97be8-f7b1-49d5-96be-e115cf808aae",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk0MDIsImlhdCI6MTc5MzM1ODUwMiwianRpIjoiNDM1ZjQyYWYtMDU4OC00YzZkLThjNjQtMzE4OGU1MGRjMDgxIiwic2lkIjoiN2RhOTdiZTgtZjdiMS00OWQ1LTk2YmUtZTExNWNmODA4YWFlIn0.HXPM1krQHf-77n7C5--oryTdPURVoJynRpi6wudFrII",
  "access_expires_at": "2026-10-30T11:23:22.34437292Z",
  "refresh_token": "NQPK5KpMolusJaJ8wGuJFtSWhTncBbHtiPFKT_yKrDY",
  "refresh_expires_at": "2026-10-30T23:08:22.343926064Z",
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
      "actor_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T11:08:21.616949Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "35a1bb1a-e0c0-4178-836b-fa9ea83a3e9c",
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
  "session_id": "e8f01201-01b5-4d79-919a-41161bfd2f7d",
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
  "last_heartbeat_at": "2026-10-30T11:08:17.142917Z",
  "last_location_at": "2026-10-30T11:08:17.142917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8f01201-01b5-4d79-919a-41161bfd2f7d/close` → **200**

```json
{
  "command_id": "18f2bb78-6d44-46da-8721-16ce2d7fae83",
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
  "session_id": "20cffa7d-d7e3-4346-a0ca-f0dab871ecc2",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk0MDMsImlhdCI6MTc5MzM1ODUwMywianRpIjoiZmJkMGQ1MWYtY2IxOC00MzcwLWFiOTYtNjA4NGM1OWQ4NmYwIiwic2lkIjoiMjBjZmZhN2QtZDdlMy00MzQ2LWEwY2EtZjBkYWI4NzFlY2MyIn0.oXsbFv6uXzT8aY0Na2gguTKvj7tL9JEH81o1El2s_yk",
  "access_expires_at": "2026-10-30T11:23:23.776881546Z",
  "refresh_token": "Kx6bnH16Cemps6WegP8qgEM8znf__9RUzQu1_3K883I",
  "refresh_expires_at": "2026-10-30T23:08:23.776471334Z",
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
  "command_id": "9cb28be9-27e2-4629-a6cb-3ca578ae83c5",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T11:08:24.231912Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9cb28be9-27e2-4629-a6cb-3ca578ae83c5",
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
  "changed_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T11:08:24.231912Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48963580003",
  "device_ref": "sandbox-19282"
}
```

```json
{
  "challenge_id": "6e6db965-c843-4df6-8596-7f8ddc00345b",
  "expires_at": "2026-10-30T11:13:24.696450503Z",
  "resend_available_at": "2026-10-30T11:08:25.696450503Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48963580003` → **200**

```json
{
  "phone": "+48963580003",
  "audience": "CLIENT",
  "code": "517763",
  "sent_at": "2026-10-30T11:08:24.698560808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e6db965-c843-4df6-8596-7f8ddc00345b",
  "code": "517763",
  "device_ref": "sandbox-19282"
}
```

```json
{
  "session_id": "ba5bf70a-66c6-4fa0-88f6-0e00edab4ad4",
  "subject": {
    "type": "CLIENT",
    "id": "49ef4b68-3672-4614-b7fd-20b11f7d6c92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWVmNGI2OC0zNjcyLTQ2MTQtYjdmZC0yMGIxMWY3ZDZjOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5NDA0LCJpYXQiOjE3OTMzNTg1MDQsImp0aSI6ImM0ZDA4MWRmLWNhNWEtNDI3Zi04ZWY0LWMyNWM5Y2Y5NTUzZSIsInNpZCI6ImJhNWJmNzBhLTY2YzYtNGZhMC04OGY2LTBlMDBlZGFiNGFkNCJ9.k69SyIZcw6Qg3NN61TYkBvi9f1nFUMaI8xhZ9Qv6JOo",
  "access_expires_at": "2026-10-30T11:23:24.940737599Z",
  "refresh_token": "39FBndtFM7RDF7fOdMemqq2TZzXvda9vj2pGkDt8aks",
  "refresh_expires_at": "2026-11-29T11:08:24.94033202Z",
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
  "correlation_id": "1f3c3332-db2a-4348-ab8f-8fcfac53aa78"
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
  "device_ref": "sandbox-7343"
}
```

```json
{
  "challenge_id": "3487cee5-a558-467c-abed-b94539745919",
  "expires_at": "2026-10-30T11:13:25.605035868Z",
  "resend_available_at": "2026-10-30T11:08:26.605035868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "987884",
  "sent_at": "2026-10-30T11:08:25.607099876Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3487cee5-a558-467c-abed-b94539745919",
  "code": "987884",
  "device_ref": "sandbox-7343"
}
```

```json
{
  "session_id": "77f4251d-30ef-4cdc-97a4-b458c99d1fa7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTQwNSwiaWF0IjoxNzkzMzU4NTA1LCJqdGkiOiJkZjkyMzA0NC1iMzIyLTQwMDYtODNmMi1iZGM2OThlNmY5NDMiLCJzaWQiOiI3N2Y0MjUxZC0zMGVmLTRjZGMtOTdhNC1iNDU4Yzk5ZDFmYTcifQ.rYtnsflv1Z9HvqrFeUWqvTX1D_P5H6H4Zh9aswtUgTA",
  "access_expires_at": "2026-10-30T11:23:25.979317496Z",
  "refresh_token": "-iO9YBYRvKQ4K7FP_aXdljpUcvQ_21m2a-rHdyN7L7Q",
  "refresh_expires_at": "2026-11-29T11:08:25.978932001Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8fe42346-1b41-41a6-95d0-4a76c91f7cda",
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
  "last_heartbeat_at": "2026-10-30T11:07:58.582708Z",
  "last_location_at": "2026-10-30T11:07:58.582708Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8fe42346-1b41-41a6-95d0-4a76c91f7cda/handover` → **200**

```json
{
  "command_id": "1db46644-9923-4e8a-9c64-47680db3d391",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8fe42346-1b41-41a6-95d0-4a76c91f7cda",
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
  "last_heartbeat_at": "2026-10-30T11:07:58.582708Z",
  "last_location_at": "2026-10-30T11:07:58.582708Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8fe42346-1b41-41a6-95d0-4a76c91f7cda/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:26Z",
    "sequence": 1793358506648
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8fe42346-1b41-41a6-95d0-4a76c91f7cda",
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
  "last_heartbeat_at": "2026-10-30T11:08:26.663629Z",
  "last_location_at": "2026-10-30T11:08:26.663629Z",
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
  "session_id": "8fe42346-1b41-41a6-95d0-4a76c91f7cda",
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
  "last_heartbeat_at": "2026-10-30T11:08:26.663629Z",
  "last_location_at": "2026-10-30T11:08:26.663629Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fe42346-1b41-41a6-95d0-4a76c91f7cda/close` → **200**

```json
{
  "command_id": "a991c86c-2b18-4fb4-89ae-e335ad7a4483",
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
  "correlation_id": "4ee5bab5-d94f-426f-9443-0ce001fad5e0"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670282504",
  "device_ref": "sandbox-14578"
}
```

```json
{
  "challenge_id": "e3d55aa4-b7ac-4d99-a8fd-167a8b137f37",
  "expires_at": "2026-10-30T11:13:27.887885498Z",
  "resend_available_at": "2026-10-30T11:08:28.887885498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670282504` → **200**

```json
{
  "phone": "+380670282504",
  "audience": "CLIENT",
  "code": "610561",
  "sent_at": "2026-10-30T11:08:27.88985738Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3d55aa4-b7ac-4d99-a8fd-167a8b137f37",
  "code": "610561",
  "device_ref": "sandbox-14578"
}
```

```json
{
  "session_id": "64f8d2c7-b3e9-4be7-848b-e314b2e659a5",
  "subject": {
    "type": "CLIENT",
    "id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDI5ZDA1NS05ZmE3LTRmOGUtYmFkMi1hODc1OWQ5NWY2YTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5NDA4LCJpYXQiOjE3OTMzNTg1MDgsImp0aSI6Ijc1NDRjNTBhLWYyMzktNDNkYi1hZDYwLTdlNjczOWZkY2IzOSIsInNpZCI6IjY0ZjhkMmM3LWIzZTktNGJlNy04NDhiLWUzMTRiMmU2NTlhNSJ9.rV8V1ziUigIvZzrss0DyxX2MSdyxKbcVag0OWoYJ-Zs",
  "access_expires_at": "2026-10-30T11:23:28.17094002Z",
  "refresh_token": "eYHnTVM4x3wffkBvDFMMvnYb0TTeSHFrdyC6gNivCiU",
  "refresh_expires_at": "2026-11-29T11:08:28.170469986Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "9e9f039d-2982-4a78-a34c-257167969f81",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "90f6a3d4-0390-4e96-87f5-79a54bc84f27",
  "upload_path": "/api/rider/v1/uploads/90f6a3d4-0390-4e96-87f5-79a54bc84f27",
  "expires_at": "2026-10-30T11:23:28.435205198Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/90f6a3d4-0390-4e96-87f5-79a54bc84f27` → **200**

```json
{
  "file_id": "90f6a3d4-0390-4e96-87f5-79a54bc84f27",
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
  "command_id": "3911cb41-5ba8-42fe-b8df-23d83a300f57",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "2e061cc6-28e9-434b-9507-28c993431e64",
  "upload_path": "/api/rider/v1/uploads/2e061cc6-28e9-434b-9507-28c993431e64",
  "expires_at": "2026-10-30T11:23:28.698584662Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/2e061cc6-28e9-434b-9507-28c993431e64` → **200**

```json
{
  "file_id": "2e061cc6-28e9-434b-9507-28c993431e64",
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
  "command_id": "ad576454-a147-4783-9a41-b4cca3e85498",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
  "upload_path": "/api/rider/v1/uploads/4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
  "expires_at": "2026-10-30T11:23:28.944952382Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc` → **200**

```json
{
  "file_id": "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "48486db1-ab7b-44fe-b545-24bf08485169",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc"
  ]
}
```

```json
{
  "id": "4d6d47a5-aac8-4597-9459-5e2b1feca666",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T11:08:29.282887Z",
  "updated_at": "2026-10-30T11:08:29.282887Z",
  "respond_by": "2026-10-30T15:08:29.282887Z",
  "messages": [
    {
      "id": "213f2cb8-cc95-4e8a-903e-555d2d2c2eea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T11:08:29.283802Z",
      "attachments": [
        {
          "file_id": "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
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
  "session_id": "c9dbce3b-1344-4861-ae2c-14245f1af33d",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk0MDksImlhdCI6MTc5MzM1ODUwOSwianRpIjoiODhmNDE5YWEtNjdmOS00ZDA1LTgzNTEtNjZhZmNhZTRhOGI3Iiwic2lkIjoiYzlkYmNlM2ItMTM0NC00ODYxLWFlMmMtMTQyNDVmMWFmMzNkIn0.v2_q1B3dFBas3zx9OdSccxAcgv3tY2USfEmhEC_QdiU",
  "access_expires_at": "2026-10-30T11:23:29.792407326Z",
  "refresh_token": "27fOvt_vEhWJSKJKSqowFkH7-PV2XtiRenWQxX3p3WM",
  "refresh_expires_at": "2026-10-30T23:08:29.791998867Z",
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
  "session_id": "692a8ac1-249f-4cf8-a857-3ad395d56d39",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk0MTAsImlhdCI6MTc5MzM1ODUxMCwianRpIjoiMzRiOGUyNTktNTVjOC00MTJiLWEyMDUtN2E4YmQ1OGY5ZmQ0Iiwic2lkIjoiNjkyYThhYzEtMjQ5Zi00Y2Y4LWE4NTctM2FkMzk1ZDU2ZDM5In0.OSHo_kCgEE-aqQjCdDa2N3zex0pfqudgVEKApBFT7O8",
  "access_expires_at": "2026-10-30T11:23:30.29834404Z",
  "refresh_token": "Wsny-9s2TutBa-x-G0TH8h54FCGsbFcpP863ISL-hdc",
  "refresh_expires_at": "2026-10-30T23:08:30.297911536Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/4d6d47a5-aac8-4597-9459-5e2b1feca666/attachments/4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "2d4e69d7-b989-4849-ba69-fc3fc8666c59",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "72bc8ed7-18c9-4c6f-ad47-defed67e6dc2",
  "upload_path": "/api/operator/v1/uploads/72bc8ed7-18c9-4c6f-ad47-defed67e6dc2",
  "expires_at": "2026-10-30T11:23:30.540858448Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/72bc8ed7-18c9-4c6f-ad47-defed67e6dc2` → **200**

```json
{
  "file_id": "72bc8ed7-18c9-4c6f-ad47-defed67e6dc2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/4d6d47a5-aac8-4597-9459-5e2b1feca666` → **200**

```json
{
  "id": "4d6d47a5-aac8-4597-9459-5e2b1feca666",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T11:08:29.282887Z",
  "updated_at": "2026-10-30T11:08:29.282887Z",
  "respond_by": "2026-10-30T15:08:29.282887Z",
  "messages": [
    {
      "id": "213f2cb8-cc95-4e8a-903e-555d2d2c2eea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T11:08:29.283802Z",
      "attachments": [
        {
          "file_id": "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/4d6d47a5-aac8-4597-9459-5e2b1feca666/comments` → **200**

```json
{
  "command_id": "ab07c489-15d1-4a77-92a2-b04c653237c0",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "72bc8ed7-18c9-4c6f-ad47-defed67e6dc2"
  ]
}
```

```json
{
  "id": "4d6d47a5-aac8-4597-9459-5e2b1feca666",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T11:08:29.282887Z",
  "updated_at": "2026-10-30T11:08:31.083361Z",
  "respond_by": "2026-10-30T15:08:29.282887Z",
  "messages": [
    {
      "id": "213f2cb8-cc95-4e8a-903e-555d2d2c2eea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T11:08:29.283802Z",
      "attachments": [
        {
          "file_id": "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "dde430e8-90ba-4e93-86e5-03ab6e63ecac",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T11:08:31.082952Z",
      "attachments": [
        {
          "file_id": "72bc8ed7-18c9-4c6f-ad47-defed67e6dc2",
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

`GET /api/rider/v1/support/cases/4d6d47a5-aac8-4597-9459-5e2b1feca666` → **200**

```json
{
  "id": "4d6d47a5-aac8-4597-9459-5e2b1feca666",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T11:08:29.282887Z",
  "updated_at": "2026-10-30T11:08:31.083361Z",
  "respond_by": "2026-10-30T15:08:29.282887Z",
  "messages": [
    {
      "id": "213f2cb8-cc95-4e8a-903e-555d2d2c2eea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3429d055-9fa7-4f8e-bad2-a8759d95f6a4",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T11:08:29.283802Z",
      "attachments": [
        {
          "file_id": "4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "dde430e8-90ba-4e93-86e5-03ab6e63ecac",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T11:08:31.082952Z",
      "attachments": [
        {
          "file_id": "72bc8ed7-18c9-4c6f-ad47-defed67e6dc2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/4d6d47a5-aac8-4597-9459-5e2b1feca666/attachments/72bc8ed7-18c9-4c6f-ad47-defed67e6dc2` → **200**

Done: support case 4d6d47a5-aac8-4597-9459-5e2b1feca666, rider attachment 4c4d3886-b6ad-4ae1-a3a1-a68f63d397dc, operator attachment 72bc8ed7-18c9-4c6f-ad47-defed67e6dc2.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734201776",
  "device_ref": "sandbox-11102"
}
```

```json
{
  "challenge_id": "f3a37c33-3ec1-469a-96e5-9d660e3c2830",
  "expires_at": "2026-10-30T11:13:31.585300154Z",
  "resend_available_at": "2026-10-30T11:08:32.585300154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734201776` → **200**

```json
{
  "phone": "+380734201776",
  "audience": "CLIENT",
  "code": "535515",
  "sent_at": "2026-10-30T11:08:31.588357373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3a37c33-3ec1-469a-96e5-9d660e3c2830",
  "code": "535515",
  "device_ref": "sandbox-11102"
}
```

```json
{
  "session_id": "e3f5c7f6-01a3-468f-8169-1bc3c87dcec1",
  "subject": {
    "type": "CLIENT",
    "id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDQxNWE4YS00MTA1LTQyYjgtYjRhMS1mMTZhYzNhOWEwODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5NDExLCJpYXQiOjE3OTMzNTg1MTEsImp0aSI6IjJkMTc3MjMwLWRjMmQtNGVmMi04MGQ2LTYwYTE0ZGNjZTUwYSIsInNpZCI6ImUzZjVjN2Y2LTAxYTMtNDY4Zi04MTY5LTFiYzNjODdkY2VjMSJ9.CGFywB6SjeUHjqmWhKjrfMiHgI-8-56-ct-pASkXyzI",
  "access_expires_at": "2026-10-30T11:23:31.8392218Z",
  "refresh_token": "Hr-eGJu5LOUgPIPCuwjJwup8JwNVfDFa00w6qaObPko",
  "refresh_expires_at": "2026-11-29T11:08:31.838829905Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f034973a-1fe1-4be2-aeb9-11a89a519c4d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c426213d-cc50-44be-a5a6-8c62fcd4b5f8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c426213d-cc50-44be-a5a6-8c62fcd4b5f8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5c8b10e82581d8cb54761fc7da5bec85",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c426213d-cc50-44be-a5a6-8c62fcd4b5f8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734201776"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c426213d-cc50-44be-a5a6-8c62fcd4b5f8",
  "expires_at": "2026-10-30T11:38:32.068741Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c426213d-cc50-44be-a5a6-8c62fcd4b5f8` → **200**

```json
{
  "id": "c426213d-cc50-44be-a5a6-8c62fcd4b5f8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T11:38:32.068741Z",
  "card": {
    "id": "b2e9ee7f-7285-424b-9337-ce07e698ad7d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8682",
    "card_type": "Visa",
    "created_at": "2026-10-30T11:08:32.3004Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "06dffda7-0928-4bca-8e75-a8746031bea1",
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
  "id": "6ff6778d-f0eb-4f24-9b2e-95b1558fd501",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:13:32.542639Z",
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
  "command_id": "2d811576-e402-4865-97a2-5d5a42204d47",
  "quote_id": "6ff6778d-f0eb-4f24-9b2e-95b1558fd501",
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
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda` → **200**

```json
{
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda` → **200**

```json
{
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
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

`GET /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda` → **200**

```json
{
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda/switch-to-cash` → **200**

```json
{
  "command_id": "4263b885-05f4-4295-8b6f-71d0795ee174",
  "expected_version": 3
}
```

```json
{
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda/switch-to-cash` → **409**

```json
{
  "command_id": "aee96db6-d19c-4ef9-9e67-652bb5870274",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cbbde2ce-7989-4e98-a467-7fde8b7235ff"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda` → **200**

```json
{
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/db7a0fe6-4376-4b69-8014-8d15ce50eeda/cancel` → **200**

```json
{
  "command_id": "22af0165-960c-41cb-9a0c-af687ef3a151",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "db7a0fe6-4376-4b69-8014-8d15ce50eeda",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fd415a8a-4105-42b8-b4a1-f16ac3a9a084",
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
  "created_at": "2026-10-30T11:08:32.782245Z",
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
  "session_id": "00977406-522a-4f38-b77c-ce9a56871f6f",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk0MTYsImlhdCI6MTc5MzM1ODUxNiwianRpIjoiNTg3YjgxODQtODAwNy00NGEzLTg1MDctZmJjYThmMGNiYThlIiwic2lkIjoiMDA5Nzc0MDYtNTIyYS00ZjM4LWI3N2MtY2U5YTU2ODcxZjZmIn0.BQFm-Pm5Y3YXHJ3RNwomE905TqoODa0auzxFn70GcFQ",
  "access_expires_at": "2026-10-30T11:23:36.147028258Z",
  "refresh_token": "qDL5_wNWGSgYinpY_bx6nbwWN2KB5u_K-WMxSasP9es",
  "refresh_expires_at": "2026-10-30T23:08:36.1465115Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16343"
}
```

```json
{
  "challenge_id": "f3485b8a-c5ea-4726-b23b-133665527d65",
  "expires_at": "2026-10-30T11:13:36.378818325Z",
  "resend_available_at": "2026-10-30T11:08:37.378818325Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "233615",
  "sent_at": "2026-10-30T11:08:36.380787328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3485b8a-c5ea-4726-b23b-133665527d65",
  "code": "233615",
  "device_ref": "sandbox-16343"
}
```

```json
{
  "session_id": "00adba98-adf2-42af-aa56-25fac57da9a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTQxNiwiaWF0IjoxNzkzMzU4NTE2LCJqdGkiOiIwMjhiNmNmMS0wNjZkLTRiN2UtYjQzNC03YzVmNjkxNTcwZmMiLCJzaWQiOiIwMGFkYmE5OC1hZGYyLTQyYWYtYWE1Ni0yNWZhYzU3ZGE5YTIifQ._L2XcQwRmrKbqdqLjYeZQoM0YDEXx5_Tu7r4cnRtOgM",
  "access_expires_at": "2026-10-30T11:23:36.629442889Z",
  "refresh_token": "Cl3ctYDzxI9b0BgvAHLyqB4Gjt-SkcV-pTfvdV5W4bg",
  "refresh_expires_at": "2026-11-29T11:08:36.629002673Z",
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
      "actor_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T11:08:21.616949Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "19abc539-69d2-4037-81d3-63395a19359c",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T11:08:22.819137Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "673bd1e8-4365-446a-aa02-7027eaa5f369",
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
  "device_ref": "sandbox-22356"
}
```

```json
{
  "challenge_id": "0feff9fa-de00-4183-b680-ac72b1aae2bb",
  "expires_at": "2026-10-30T11:13:37.566820684Z",
  "resend_available_at": "2026-10-30T11:08:38.566820684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "406757",
  "sent_at": "2026-10-30T11:08:37.569017517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0feff9fa-de00-4183-b680-ac72b1aae2bb",
  "code": "406757",
  "device_ref": "sandbox-22356"
}
```

```json
{
  "session_id": "1cad0388-0443-42aa-b655-75f6ec2195a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTQxNywiaWF0IjoxNzkzMzU4NTE3LCJqdGkiOiIxNmYxYTg0ZS1lYTdlLTQ2MzQtODZhNS1lNDI5Yzk1YjUwMzgiLCJzaWQiOiIxY2FkMDM4OC0wNDQzLTQyYWEtYjY1NS03NWY2ZWMyMTk1YTYifQ.ZtV0XjOjJ2QfO1GvXkd7ULQ8eL00WpCUaNNK8mDaVto",
  "access_expires_at": "2026-10-30T11:23:37.823205323Z",
  "refresh_token": "xq3BpXNs16qIIcajQQ-EYB4CKdNQcWZ2Ml5FgJl4xRw",
  "refresh_expires_at": "2026-11-29T11:08:37.822789132Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:04.701935Z",
  "last_location_at": "2026-10-30T11:08:04.701935Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ee66cbf6-cf1a-4d91-8a63-ddedc830bd70/handover` → **200**

```json
{
  "command_id": "84acc1c2-99ad-4eb3-a037-e9a58c3ff37e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:04.701935Z",
  "last_location_at": "2026-10-30T11:08:04.701935Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ee66cbf6-cf1a-4d91-8a63-ddedc830bd70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:38Z",
    "sequence": 1793358518530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:38.546937Z",
  "last_location_at": "2026-10-30T11:08:38.546937Z",
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
  "command_id": "1771917d-c574-4cb2-befe-67a81e0d63e5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:39Z",
    "sequence": 1793358519922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cad16a14-fa3c-4092-bef8-84ffdf376ce8",
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
  "last_heartbeat_at": "2026-10-30T11:08:39.025331Z",
  "last_location_at": "2026-10-30T11:08:39.025331Z",
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
  "session_id": "a6888d0f-5b06-43cd-8ed3-7b84c226b8ef",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk0MTksImlhdCI6MTc5MzM1ODUxOSwianRpIjoiN2RiZDFmMGQtNmI4Yi00ZDgxLThjYWYtYWY5NGU1MGY3MjY0Iiwic2lkIjoiYTY4ODhkMGYtNWIwNi00M2NkLThlZDMtN2I4NGMyMjZiOGVmIn0.ZElsf3cgibbjQWDIH_yTGEnQuFIE0WtOZSAg5vkO0hE",
  "access_expires_at": "2026-10-30T11:23:39.520800926Z",
  "refresh_token": "SN6ALr0emaeqAnpO_YJdTxMhrYDHsf2rXWcoqkfPNFk",
  "refresh_expires_at": "2026-10-30T23:08:39.520326921Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2c123119-af91-4b18-b3d5-52df9864e648",
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
  "id": "86a6561d-d893-47c3-9d7e-03bd076c7fc9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:13:39.863001Z",
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
  "command_id": "419d8832-8d5f-47c2-92ef-62122958ed04",
  "quote_id": "86a6561d-d893-47c3-9d7e-03bd076c7fc9",
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
  "id": "9c475102-0795-4997-9d1a-626a2620c058",
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
  "created_at": "2026-10-30T11:08:40.149054Z",
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
    "id": "e9465a5c-3dea-4394-8255-fac8badf7fc4",
    "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
    "expires_at": "2026-10-30T11:08:55.152149Z",
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

`POST /api/driver/v1/offers/e9465a5c-3dea-4394-8255-fac8badf7fc4/accept` → **200**

```json
{
  "command_id": "d1064e7c-ee81-4ada-926a-b88d1b62eab4"
}
```

```json
{
  "id": "2ce48fd4-0fe6-446d-8807-336fb44156d9",
  "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "289d557c-3c13-49f7-ab68-e578552250e0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "289d557c-3c13-49f7-ab68-e578552250e0",
  "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
  "assignment_id": "2ce48fd4-0fe6-446d-8807-336fb44156d9",
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

`POST /api/driver/v1/work-sessions/cad16a14-fa3c-4092-bef8-84ffdf376ce8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T11:08:41Z",
    "sequence": 1793358521295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cad16a14-fa3c-4092-bef8-84ffdf376ce8",
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
  "last_heartbeat_at": "2026-10-30T11:08:41.310797Z",
  "last_location_at": "2026-10-30T11:08:41.310797Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/289d557c-3c13-49f7-ab68-e578552250e0/arrive` → **200**

```json
{
  "command_id": "b533c1bc-c3bf-4b92-af86-9e5de479fae1",
  "expected_version": 0
}
```

```json
{
  "id": "289d557c-3c13-49f7-ab68-e578552250e0",
  "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
  "assignment_id": "2ce48fd4-0fe6-446d-8807-336fb44156d9",
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
  "arrived_at": "2026-10-30T11:08:41.547209Z",
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

`POST /api/driver/v1/trips/289d557c-3c13-49f7-ab68-e578552250e0/start` → **200**

```json
{
  "command_id": "e5bdb8a0-1202-4a1e-a903-ee5c72f38088",
  "expected_version": 1
}
```

```json
{
  "id": "289d557c-3c13-49f7-ab68-e578552250e0",
  "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
  "assignment_id": "2ce48fd4-0fe6-446d-8807-336fb44156d9",
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
  "arrived_at": "2026-10-30T11:08:41.547209Z",
  "started_at": "2026-10-30T11:08:41.796234Z",
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

`POST /api/driver/v1/trips/289d557c-3c13-49f7-ab68-e578552250e0/complete` → **200**

```json
{
  "command_id": "c3970f42-10ba-4459-9e63-378a7b2fd752",
  "expected_version": 2,
  "reported_at": "2026-10-30T11:08:42Z",
  "cash_received": true
}
```

```json
{
  "id": "289d557c-3c13-49f7-ab68-e578552250e0",
  "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
  "assignment_id": "2ce48fd4-0fe6-446d-8807-336fb44156d9",
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
  "arrived_at": "2026-10-30T11:08:41.547209Z",
  "started_at": "2026-10-30T11:08:41.796234Z",
  "completed_at": "2026-10-30T11:08:42.043576Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/9c475102-0795-4997-9d1a-626a2620c058` → **200**

```json
{
  "id": "9c475102-0795-4997-9d1a-626a2620c058",
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
    "id": "2ce48fd4-0fe6-446d-8807-336fb44156d9",
    "order_id": "9c475102-0795-4997-9d1a-626a2620c058",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "289d557c-3c13-49f7-ab68-e578552250e0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T11:08:40.149054Z",
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
  "session_id": "ee66cbf6-cf1a-4d91-8a63-ddedc830bd70",
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
  "last_heartbeat_at": "2026-10-30T11:08:38.546937Z",
  "last_location_at": "2026-10-30T11:08:38.546937Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee66cbf6-cf1a-4d91-8a63-ddedc830bd70/close` → **200**

```json
{
  "command_id": "9be2e428-276f-487f-94a7-6de7656c1f4e",
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
  "session_id": "cad16a14-fa3c-4092-bef8-84ffdf376ce8",
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
  "last_heartbeat_at": "2026-10-30T11:08:41.310797Z",
  "last_location_at": "2026-10-30T11:08:41.310797Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cad16a14-fa3c-4092-bef8-84ffdf376ce8/close` → **200**

```json
{
  "command_id": "c3e600ab-74d7-4cf5-92f1-56a1dfd04fc3",
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

Done: terminal order 9c475102-0795-4997-9d1a-626a2620c058 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6860"
}
```

```json
{
  "challenge_id": "5f4cf277-3b19-4655-a7f6-da91326f17a0",
  "expires_at": "2026-10-30T11:13:47.121159666Z",
  "resend_available_at": "2026-10-30T11:08:48.121159666Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "727778",
  "sent_at": "2026-10-30T11:08:47.123308829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f4cf277-3b19-4655-a7f6-da91326f17a0",
  "code": "727778",
  "device_ref": "sandbox-6860"
}
```

```json
{
  "session_id": "8bf42051-ca94-45f7-b526-c6e3242f22a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTQyNywiaWF0IjoxNzkzMzU4NTI3LCJqdGkiOiI2NmRlYWE2OS1hMmQ3LTRhZmYtODQ3OC05ZjI3MzQwNDhmOTkiLCJzaWQiOiI4YmY0MjA1MS1jYTk0LTQ1ZjctYjUyNi1jNmUzMjQyZjIyYTQifQ.mFG4W8cyI0F8QV-0evBl7ECfsobnpLmMWySuirJnAI4",
  "access_expires_at": "2026-10-30T11:23:47.372262023Z",
  "refresh_token": "FEpxOSq-Ic6rA-ox9JGbhIRewjriqTy_93UTUQx7a04",
  "refresh_expires_at": "2026-11-29T11:08:47.371856988Z",
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
  "device_ref": "sandbox-3765"
}
```

```json
{
  "challenge_id": "49177b6b-5d95-4a0d-9708-0f3f351d9c00",
  "expires_at": "2026-10-30T11:13:47.926724729Z",
  "resend_available_at": "2026-10-30T11:08:48.926724729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "799242",
  "sent_at": "2026-10-30T11:08:47.928893059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49177b6b-5d95-4a0d-9708-0f3f351d9c00",
  "code": "799242",
  "device_ref": "sandbox-3765"
}
```

```json
{
  "session_id": "cb0bc491-c220-4431-a331-8c1bbb630723",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTQyOCwiaWF0IjoxNzkzMzU4NTI4LCJqdGkiOiJkYzNiNTRmYS1lOWZhLTRmMDQtYjlhYy1lYzI3NDc4NTU0YTkiLCJzaWQiOiJjYjBiYzQ5MS1jMjIwLTQ0MzEtYTMzMS04YzFiYmI2MzA3MjMifQ.SnaUR5N-CE8s3r7uhPCgkEilEHPmPtWs75Oqm98uMUA",
  "access_expires_at": "2026-10-30T11:23:48.179871103Z",
  "refresh_token": "7fYtRU0GozMElNj8j_BdYWS9h9-1qqDp84Uor00F4G0",
  "refresh_expires_at": "2026-11-29T11:08:48.179482853Z",
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
  "device_ref": "sandbox-32079"
}
```

```json
{
  "challenge_id": "d8774c0a-8408-4de3-b55f-33b6db2ccca3",
  "expires_at": "2026-10-30T11:13:48.638099649Z",
  "resend_available_at": "2026-10-30T11:08:49.638099649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "244866",
  "sent_at": "2026-10-30T11:08:48.640053235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8774c0a-8408-4de3-b55f-33b6db2ccca3",
  "code": "244866",
  "device_ref": "sandbox-32079"
}
```

```json
{
  "session_id": "65649304-3cbc-4a19-8a0e-c987b62eef42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1OTQyOCwiaWF0IjoxNzkzMzU4NTI4LCJqdGkiOiI0ZWJkYmZjZC1hYmUzLTQwYmEtODc0Ni1iNTgxNjg4MTU5ZDAiLCJzaWQiOiI2NTY0OTMwNC0zY2JjLTRhMTktOGEwZS1jOTg3YjYyZWVmNDIifQ.u_kanVojRG6FXC3VaGa2YYfXKrCEWFRBUDcUO_CSgvA",
  "access_expires_at": "2026-10-30T11:23:48.933752714Z",
  "refresh_token": "TVY1OomQlzsuwHim10rpZ7-t7Fc0Zey81WTneCtAbM4",
  "refresh_expires_at": "2026-11-29T11:08:48.933363443Z",
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
  "phone": "+380697789797",
  "device_ref": "sandbox-25124"
}
```

```json
{
  "challenge_id": "3d8c5ad1-e2c6-4894-94fe-83ad4771fc17",
  "expires_at": "2026-10-30T11:13:49.384609828Z",
  "resend_available_at": "2026-10-30T11:08:50.384609828Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380697789797` → **200**

```json
{
  "phone": "+380697789797",
  "audience": "CLIENT",
  "code": "710318",
  "sent_at": "2026-10-30T11:08:49.387214458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d8c5ad1-e2c6-4894-94fe-83ad4771fc17",
  "code": "710318",
  "device_ref": "sandbox-25124"
}
```

```json
{
  "session_id": "1495016b-d45c-4670-850f-b394bfc1926f",
  "subject": {
    "type": "CLIENT",
    "id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzRmZjc0My0yNDEwLTQyNGYtOGM4MS0wZDViMmNhMDUwZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU5NDI5LCJpYXQiOjE3OTMzNTg1MjksImp0aSI6Ijc1OGUwZDg4LWY1MzAtNDg4Yy1hMDU3LWJmZDMxY2MzODk5ZCIsInNpZCI6IjE0OTUwMTZiLWQ0NWMtNDY3MC04NTBmLWIzOTRiZmMxOTI2ZiJ9.0gNZleW8h5qBUQXqXcT5w5XgZ2aalNrm1MrQfW5kTjg",
  "access_expires_at": "2026-10-30T11:23:49.632236335Z",
  "refresh_token": "lNMgMugxhs08InKAew65NyaO3atKD-f-Zn1xxrkemks",
  "refresh_expires_at": "2026-11-29T11:08:49.631744033Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bbeec57d-c51f-4dba-9673-67a4d68bad9b",
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
  "id": "07852b6a-4917-4e08-a48f-261d45394023",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T11:13:49.866056Z",
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
  "command_id": "3126f4cf-4ea2-4ddf-b17a-af549bff189d",
  "quote_id": "07852b6a-4917-4e08-a48f-261d45394023",
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
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T11:08:50.103074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:08:50.103074Z",
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
  "blizz_sms_sent_total": 76
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 9.407544955
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.378495697
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.128320836
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

`GET /api/rider/v1/orders/71442fb8-3484-439d-90d3-ca295533c9cd` → **200**

```json
{
  "id": "71442fb8-3484-439d-90d3-ca295533c9cd",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0c4ff743-2410-424f-8c81-0d5b2ca050e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T11:08:50.103074Z",
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
  "session_id": "91e42a47-cb48-43e4-aa77-8a59f26b8dc2",
  "subject": {
    "type": "STAFF",
    "id": "19abc539-69d2-4037-81d3-63395a19359c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWFiYzUzOS02OWQyLTQwMzctODFkMy02MzM5NWExOTM1OWMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTk2MTQsImlhdCI6MTc5MzM1ODcxNCwianRpIjoiN2E3NTdhNzMtMzU4Mi00ZjlkLTk5ODctNmRhODczNGM2MWI3Iiwic2lkIjoiOTFlNDJhNDctY2I0OC00M2U0LWFhNzctOGE1OWYyNmI4ZGMyIn0.hUEMt4VOYD34KwOGDUP07pfw1wSMrrSvlVE4zd3qgY8",
  "access_expires_at": "2026-10-30T11:26:54.889896669Z",
  "refresh_token": "gDhnsZErMOqKxRNNAXPkGHLQ7wx5XOcTeXSF1P4SDZ0",
  "refresh_expires_at": "2026-10-30T23:11:54.88938633Z",
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
  "id": "bfd9e002-5c8e-4213-9f51-c23a164bd1b4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.136012Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.136057Z",
  "updated_at": "2026-10-30T11:11:55.150253Z",
  "finished_at": "2026-10-30T11:11:55.150253Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/bfd9e002-5c8e-4213-9f51-c23a164bd1b4` → **200**

```json
{
  "run": {
    "id": "bfd9e002-5c8e-4213-9f51-c23a164bd1b4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T11:11:55.136012Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T11:11:55.136057Z",
    "updated_at": "2026-10-30T11:11:55.150253Z",
    "finished_at": "2026-10-30T11:11:55.150253Z",
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
  "id": "bfd9e002-5c8e-4213-9f51-c23a164bd1b4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.136012Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.136057Z",
  "updated_at": "2026-10-30T11:11:55.150253Z",
  "finished_at": "2026-10-30T11:11:55.150253Z",
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
  "id": "bfd9e002-5c8e-4213-9f51-c23a164bd1b4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.136012Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.136057Z",
  "updated_at": "2026-10-30T11:11:55.150253Z",
  "finished_at": "2026-10-30T11:11:55.150253Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/49f74a61-1789-47ad-a984-c1197d6c4de1` → **204**

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
  "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.64567Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.645707Z",
  "updated_at": "2026-10-30T11:11:55.651626Z",
  "finished_at": "2026-10-30T11:11:55.651626Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/afaf238d-c9ee-42b9-b82b-a365cd01fb8a` → **200**

```json
{
  "run": {
    "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T11:11:55.64567Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T11:11:55.645707Z",
    "updated_at": "2026-10-30T11:11:55.651626Z",
    "finished_at": "2026-10-30T11:11:55.651626Z",
    "version": 1
  },
  "items": [
    {
      "id": "40844aae-bc35-49b8-a86f-72951f592800",
      "run_id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "d3694322e12c25a2e4b9f392f25cba21693aa74c875ce56d4f70ba83e19e3e43",
      "reference_display": "sandbox-reconciliation-49f74a61-1789-47ad-a984-c1197d6c4de1",
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
      "provider_at": "2026-10-30T11:11:55Z",
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
  "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.64567Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.645707Z",
  "updated_at": "2026-10-30T11:11:55.651626Z",
  "finished_at": "2026-10-30T11:11:55.651626Z",
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
  "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.64567Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.645707Z",
  "updated_at": "2026-10-30T11:11:55.651626Z",
  "finished_at": "2026-10-30T11:11:55.651626Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/40844aae-bc35-49b8-a86f-72951f592800/resolve` → **200**

```json
{
  "command_id": "8966d2a9-9298-4d8c-af81-c887331491d3",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "40844aae-bc35-49b8-a86f-72951f592800",
  "run_id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "d3694322e12c25a2e4b9f392f25cba21693aa74c875ce56d4f70ba83e19e3e43",
  "reference_display": "sandbox-reconciliation-49f74a61-1789-47ad-a984-c1197d6c4de1",
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
  "provider_at": "2026-10-30T11:11:55Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "resolved_at": "2026-10-30T11:11:56.002116Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/40844aae-bc35-49b8-a86f-72951f592800/resolve` → **200**

```json
{
  "command_id": "8966d2a9-9298-4d8c-af81-c887331491d3",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "40844aae-bc35-49b8-a86f-72951f592800",
  "run_id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "d3694322e12c25a2e4b9f392f25cba21693aa74c875ce56d4f70ba83e19e3e43",
  "reference_display": "sandbox-reconciliation-49f74a61-1789-47ad-a984-c1197d6c4de1",
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
  "provider_at": "2026-10-30T11:11:55Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "19abc539-69d2-4037-81d3-63395a19359c",
  "resolved_at": "2026-10-30T11:11:56.002116Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/40844aae-bc35-49b8-a86f-72951f592800/resolve` → **409**

```json
{
  "command_id": "d941f8b0-3143-4b4f-a8d1-ced9f767ebae",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/40844aae-bc35-49b8-a86f-72951f592800/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d8808952-33ea-4868-a37b-9a7b773a9c28"
}
```

`GET /api/admin/v1/payment-reconciliations/afaf238d-c9ee-42b9-b82b-a365cd01fb8a` → **200**

```json
{
  "run": {
    "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T11:11:55.64567Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T11:11:55.645707Z",
    "updated_at": "2026-10-30T11:11:56.002116Z",
    "finished_at": "2026-10-30T11:11:55.651626Z",
    "version": 2
  },
  "items": [
    {
      "id": "40844aae-bc35-49b8-a86f-72951f592800",
      "run_id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "d3694322e12c25a2e4b9f392f25cba21693aa74c875ce56d4f70ba83e19e3e43",
      "reference_display": "sandbox-reconciliation-49f74a61-1789-47ad-a984-c1197d6c4de1",
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
      "provider_at": "2026-10-30T11:11:55Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "19abc539-69d2-4037-81d3-63395a19359c",
      "resolved_at": "2026-10-30T11:11:56.002116Z",
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
      "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T11:11:55.64567Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T11:11:55.645707Z",
      "updated_at": "2026-10-30T11:11:56.002116Z",
      "finished_at": "2026-10-30T11:11:55.651626Z",
      "version": 2
    },
    {
      "id": "b1eb0db6-ad61-46d3-b118-528f13289597",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T11:04:29.588072Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T11:04:29.588185Z",
      "updated_at": "2026-10-30T11:04:29.596438Z",
      "finished_at": "2026-10-30T11:04:29.596438Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/49f74a61-1789-47ad-a984-c1197d6c4de1` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "afaf238d-c9ee-42b9-b82b-a365cd01fb8a",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T11:11:55.64567Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T11:11:55.645707Z",
  "updated_at": "2026-10-30T11:11:56.002116Z",
  "finished_at": "2026-10-30T11:11:55.651626Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793358839703E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79335883992E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79335883992E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793358839703E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793358839921E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
