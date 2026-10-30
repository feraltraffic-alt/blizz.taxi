# Sandbox transcript (2026-10-30T09:56:33Z, e7b0aa0)

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
  "correlation_id": "f9804be7-4d4e-40e0-9777-1589f2d4ba88"
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
  "session_id": "9d71f5a2-26f6-45db-8270-4321a0fa1dbc",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMDAsImlhdCI6MTc5MzM1NDIwMCwianRpIjoiMjNmNzczZWUtZjZlYi00OWI2LWIxNzgtMzk2NWNhMDcyNDEwIiwic2lkIjoiOWQ3MWY1YTItMjZmNi00NWRiLTgyNzAtNDMyMWEwZmExZGJjIn0.HqYL1UkoJPUXGZ9yLfzLilwWd671UG6IDv_1DQSPfOY",
  "access_expires_at": "2026-10-30T10:11:40.885865086Z",
  "refresh_token": "Pks8R75vLhr6rvz1jkeW9kiR0sq1lI2JMEAoVZYbiX0",
  "refresh_expires_at": "2026-10-30T21:56:40.88336775Z",
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
  "session_id": "a08cdac6-a965-4831-9a5b-ce456682b3a5",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMDIsImlhdCI6MTc5MzM1NDIwMiwianRpIjoiOGRlZjU2NGItZGU1YS00ZjY4LTkzZGItYzQ2N2YxNzcyMzhiIiwic2lkIjoiYTA4Y2RhYzYtYTk2NS00ODMxLTlhNWItY2U0NTY2ODJiM2E1In0.7wNdGfz-LAfQsBpLLds0mQh2x9lUtRp7aLyS7F5pdTQ",
  "access_expires_at": "2026-10-30T10:11:42.935922681Z",
  "refresh_token": "iXIDsbbz3VTqWmywZkGQQHim1GbLZMH7vsJN2pn5eXc",
  "refresh_expires_at": "2026-10-30T21:56:42.934754709Z",
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
  "device_ref": "sandbox-11634"
}
```

```json
{
  "challenge_id": "a11a56eb-d513-4ad2-9c26-6b12654aafad",
  "expires_at": "2026-10-30T10:01:43.599035229Z",
  "resend_available_at": "2026-10-30T09:56:44.599035229Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "752720",
  "sent_at": "2026-10-30T09:56:43.612061468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a11a56eb-d513-4ad2-9c26-6b12654aafad",
  "code": "752720",
  "device_ref": "sandbox-11634"
}
```

```json
{
  "session_id": "16c1f1a8-8c92-4d98-a40f-80405b895775",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTEwMywiaWF0IjoxNzkzMzU0MjAzLCJqdGkiOiJhOTI0YTlkNC1iMGM1LTRjM2YtOWRlNC0wZDlkYTNkZmJkNjUiLCJzaWQiOiIxNmMxZjFhOC04YzkyLTRkOTgtYTQwZi04MDQwNWI4OTU3NzUifQ.Tym9O8KPuQVKyBUl-k2L5GcplH_K89H_0Dh2vBebhLo",
  "access_expires_at": "2026-10-30T10:11:43.954099881Z",
  "refresh_token": "o_SPsHdKfXISs5QXsxXwRyOxYzkHOf5iOJ7S63xWXzQ",
  "refresh_expires_at": "2026-11-29T09:56:43.952523711Z",
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
  "command_id": "630bf031-106d-43bf-bc69-e1056741b432",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:56:44Z",
    "sequence": 1793354204530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f75407e8-5ad1-4678-a4a1-58f37e929965",
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
  "last_heartbeat_at": "2026-10-30T09:56:44.592999Z",
  "last_location_at": "2026-10-30T09:56:44.592999Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638890869",
  "device_ref": "sandbox-20419"
}
```

```json
{
  "challenge_id": "d9261bf1-1fe7-455e-95a9-aa12dffce426",
  "expires_at": "2026-10-30T10:01:44.890308262Z",
  "resend_available_at": "2026-10-30T09:56:45.890308262Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638890869` → **200**

```json
{
  "phone": "+380638890869",
  "audience": "CLIENT",
  "code": "713399",
  "sent_at": "2026-10-30T09:56:44.895190445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9261bf1-1fe7-455e-95a9-aa12dffce426",
  "code": "713399",
  "device_ref": "sandbox-20419"
}
```

```json
{
  "session_id": "89f0b1a0-ba72-45ff-a4e5-e445d27492b3",
  "subject": {
    "type": "CLIENT",
    "id": "df64a568-0293-40dd-81fa-c4420a2e2107"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjY0YTU2OC0wMjkzLTQwZGQtODFmYS1jNDQyMGEyZTIxMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTA1LCJpYXQiOjE3OTMzNTQyMDUsImp0aSI6IjI2NzA4MDA1LTY5NWEtNDg2MS04NDY5LTFiYzc2OWJmYTAyZSIsInNpZCI6Ijg5ZjBiMWEwLWJhNzItNDVmZi1hNGU1LWU0NDVkMjc0OTJiMyJ9.d76VS_MaJxv5SsvmKZYA1NJN6xs40sCKxBqAR21Xfew",
  "access_expires_at": "2026-10-30T10:11:45.215451757Z",
  "refresh_token": "GUqYhxFWDsN45rUM_ZWuHAVkfKbZ4TEk6Z5nSpMLGiM",
  "refresh_expires_at": "2026-11-29T09:56:45.21461347Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "528b9c30-3e59-450f-bc7b-ce37fc42f771",
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
  "id": "f18f1fda-0509-4e92-9183-51e0329b9cfe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:01:45.540038Z",
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
  "command_id": "e9d00579-2d4b-4f11-b1cc-4c8f9a813959",
  "quote_id": "f18f1fda-0509-4e92-9183-51e0329b9cfe",
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
  "id": "d047ced2-b616-408c-ae23-30e062e0e264",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df64a568-0293-40dd-81fa-c4420a2e2107",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:56:45.9126Z",
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
    "id": "ed82cec4-fe6f-4b62-b71f-0f6dec30622b",
    "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
    "expires_at": "2026-10-30T09:57:00.923581Z",
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

`POST /api/driver/v1/offers/ed82cec4-fe6f-4b62-b71f-0f6dec30622b/accept` → **200**

```json
{
  "command_id": "34ee4871-1dc8-4e8b-b17e-0448000d7244"
}
```

```json
{
  "id": "63bc79a1-c0df-4c37-8dbf-6afcc7adb8dc",
  "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d63aae53-9ed0-4f49-abd8-9d796f326128",
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
  "command_id": "0593d905-b30a-4d9f-ac2f-366350348f29",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:56:47.225192356Z"
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
  "id": "d63aae53-9ed0-4f49-abd8-9d796f326128",
  "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
  "assignment_id": "63bc79a1-c0df-4c37-8dbf-6afcc7adb8dc",
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

`POST /api/driver/v1/work-sessions/f75407e8-5ad1-4678-a4a1-58f37e929965/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:56:48Z",
    "sequence": 1793354208119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f75407e8-5ad1-4678-a4a1-58f37e929965",
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
  "last_heartbeat_at": "2026-10-30T09:56:48.145979Z",
  "last_location_at": "2026-10-30T09:56:48.145979Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d63aae53-9ed0-4f49-abd8-9d796f326128/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3e67d592-fbfd-494d-886a-dfc5951757c8",
  "expected_version": 0
}
```

```json
{
  "id": "d63aae53-9ed0-4f49-abd8-9d796f326128",
  "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
  "assignment_id": "63bc79a1-c0df-4c37-8dbf-6afcc7adb8dc",
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
  "arrived_at": "2026-10-30T09:56:48.445371Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d63aae53-9ed0-4f49-abd8-9d796f326128/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5543c967-f386-4437-8492-195e81f42fb7",
  "expected_version": 1
}
```

```json
{
  "id": "d63aae53-9ed0-4f49-abd8-9d796f326128",
  "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
  "assignment_id": "63bc79a1-c0df-4c37-8dbf-6afcc7adb8dc",
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
  "arrived_at": "2026-10-30T09:56:48.445371Z",
  "started_at": "2026-10-30T09:56:48.754145Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d63aae53-9ed0-4f49-abd8-9d796f326128/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "918e28dd-94bf-4524-bf91-6ebcdadb6ff7",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:56:49Z",
  "cash_received": true
}
```

```json
{
  "id": "d63aae53-9ed0-4f49-abd8-9d796f326128",
  "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
  "assignment_id": "63bc79a1-c0df-4c37-8dbf-6afcc7adb8dc",
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
  "arrived_at": "2026-10-30T09:56:48.445371Z",
  "started_at": "2026-10-30T09:56:48.754145Z",
  "completed_at": "2026-10-30T09:56:49.068382Z",
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
  "session_id": "f75407e8-5ad1-4678-a4a1-58f37e929965",
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
  "last_heartbeat_at": "2026-10-30T09:56:48.145979Z",
  "last_location_at": "2026-10-30T09:56:48.145979Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f75407e8-5ad1-4678-a4a1-58f37e929965/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3d738bff-5fc6-44b5-ac46-852c1098678c",
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
  "command_id": "1a900c38-a960-4ad5-9a45-34d615193556",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:56:49Z",
    "sequence": 1793354209945
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
  "correlation_id": "130448fc-44be-4125-b252-37b0a267ad13",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "8dc62877-2c94-4e54-bfc3-850e8fdb9739",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:56:50Z",
    "sequence": 1793354210292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "40fc2b05-bcc2-4b66-bf09-524a3cc91a1a",
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
  "last_heartbeat_at": "2026-10-30T09:56:50.318287Z",
  "last_location_at": "2026-10-30T09:56:50.318287Z",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:56:47.225192Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "71726fff-0536-4250-b8df-12fb3d6968c7",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:56:50.914745378Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "40fc2b05-bcc2-4b66-bf09-524a3cc91a1a",
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
  "last_heartbeat_at": "2026-10-30T09:56:50.318287Z",
  "last_location_at": "2026-10-30T09:56:50.318287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40fc2b05-bcc2-4b66-bf09-524a3cc91a1a/close` → **200**

```json
{
  "command_id": "993fec8a-3ac3-4a9e-bb5d-319d8863fe8d",
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
  "session_id": "2d217993-632f-4116-86fa-ff044030c93d",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMTIsImlhdCI6MTc5MzM1NDIxMiwianRpIjoiMGIyNzcwZTUtZTA0YS00YzMwLWE4OTctMTg4ZDhlMmU2OTk3Iiwic2lkIjoiMmQyMTc5OTMtNjMyZi00MTE2LTg2ZmEtZmYwNDQwMzBjOTNkIn0.zor_-pPaDyh_qRTPtNkxa-6q4nbIeBFbKZPZzTZYeZY",
  "access_expires_at": "2026-10-30T10:11:52.177837631Z",
  "refresh_token": "E1BDtOnfkemV5LdSA5O2YNn94MnkGt0jhwJS5RVMK-I",
  "refresh_expires_at": "2026-10-30T21:56:52.176932764Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "9e621b9b-bf9a-475e-9cd5-a3025371aa9a",
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
  "id": "fed8a4d3-0799-48bf-bea5-f9446460b216",
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
  "created_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "created_at": "2026-10-30T09:56:52.486673Z",
  "updated_at": "2026-10-30T09:56:52.486673Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639965504",
  "device_ref": "sandbox-29030"
}
```

```json
{
  "challenge_id": "1f477101-368f-4243-bf6e-9b7c8b4f7d52",
  "expires_at": "2026-10-30T10:01:52.779928504Z",
  "resend_available_at": "2026-10-30T09:56:53.779928504Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639965504` → **200**

```json
{
  "phone": "+380639965504",
  "audience": "CLIENT",
  "code": "073184",
  "sent_at": "2026-10-30T09:56:52.784106111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f477101-368f-4243-bf6e-9b7c8b4f7d52",
  "code": "073184",
  "device_ref": "sandbox-29030"
}
```

```json
{
  "session_id": "6130e314-0579-4fa4-af5b-8e4155f643b7",
  "subject": {
    "type": "CLIENT",
    "id": "66fbaf30-2526-4f93-809e-fdaa22461a22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NmZiYWYzMC0yNTI2LTRmOTMtODA5ZS1mZGFhMjI0NjFhMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTEzLCJpYXQiOjE3OTMzNTQyMTMsImp0aSI6Ijk5N2JmMzJhLWFlMTktNDc3Yi05ZTM0LWRhZWU0YzMyN2YyNiIsInNpZCI6IjYxMzBlMzE0LTA1NzktNGZhNC1hZjViLThlNDE1NWY2NDNiNyJ9.zlrQXlCzH_gfmL_8ab7qutdbKtvYzXN3SUG9dnVyFlo",
  "access_expires_at": "2026-10-30T10:11:53.098013678Z",
  "refresh_token": "neC0upYSZq2TqUQ4yIAxcM6s8P6VXb_zOA2dQuA366M",
  "refresh_expires_at": "2026-11-29T09:56:53.09714141Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639965504` → **200**

```json
{
  "client_id": "66fbaf30-2526-4f93-809e-fdaa22461a22"
}
```

`POST /api/admin/v1/rider-wallets/66fbaf30-2526-4f93-809e-fdaa22461a22/top-ups` → **201**

```json
{
  "command_id": "fb6b755d-09fc-468f-b1b2-2d335636532f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "66fbaf30-2526-4f93-809e-fdaa22461a22",
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
      "id": "93d3bfb6-2042-4c04-8a5f-a3db7794a353",
      "at": "2026-10-30T09:56:53.68577Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3bb25919-301e-4da1-a38a-61474803b267",
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
  "id": "7efc24a9-0456-4fce-9540-f73bdf7a2d8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:01:54.000021Z",
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
      "id": "fed8a4d3-0799-48bf-bea5-f9446460b216",
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
  "device_ref": "sandbox-25994"
}
```

```json
{
  "challenge_id": "e3cb2f9e-736b-4d8f-aa4a-4922d96ce5d5",
  "expires_at": "2026-10-30T10:01:54.297373555Z",
  "resend_available_at": "2026-10-30T09:56:55.297373555Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "472919",
  "sent_at": "2026-10-30T09:56:54.301635969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3cb2f9e-736b-4d8f-aa4a-4922d96ce5d5",
  "code": "472919",
  "device_ref": "sandbox-25994"
}
```

```json
{
  "session_id": "858ecde4-3767-4e3d-8614-4199c478abab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTExNCwiaWF0IjoxNzkzMzU0MjE0LCJqdGkiOiJiZDMyZDZjYy0xMDkzLTQ5NzYtOGQ4MS01N2ZjNGFlZTQ5MWIiLCJzaWQiOiI4NThlY2RlNC0zNzY3LTRlM2QtODYxNC00MTk5YzQ3OGFiYWIifQ.com7ONg36aJPxUW2SnWybeMLW4i-YVtrTW5ZoO3C6JI",
  "access_expires_at": "2026-10-30T10:11:54.613615805Z",
  "refresh_token": "JxES2ISdk2_qMCnb0QNykAUFE9UmiLOifgPnqiL6bPs",
  "refresh_expires_at": "2026-11-29T09:56:54.612739941Z",
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
  "command_id": "90beab4c-0a30-4f82-bea9-426e7109c9ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:56:55Z",
    "sequence": 1793354215185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4d22084b-c08c-4c93-941f-e63b9543c6bd",
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
  "last_heartbeat_at": "2026-10-30T09:56:55.20709Z",
  "last_location_at": "2026-10-30T09:56:55.20709Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "85d90e86-4ed3-470e-954f-33159f90c73d",
  "quote_id": "7efc24a9-0456-4fce-9540-f73bdf7a2d8c",
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
  "id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66fbaf30-2526-4f93-809e-fdaa22461a22",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:56:55.501441Z",
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
  "client_id": "66fbaf30-2526-4f93-809e-fdaa22461a22",
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
      "id": "93d3bfb6-2042-4c04-8a5f-a3db7794a353",
      "at": "2026-10-30T09:56:53.68577Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
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
    "id": "1a9df3cc-c176-4211-96d9-b134d5d776d4",
    "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
    "expires_at": "2026-10-30T09:57:10.509911Z",
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

`POST /api/driver/v1/offers/1a9df3cc-c176-4211-96d9-b134d5d776d4/accept` → **200**

```json
{
  "command_id": "e89758d2-4282-4f5b-a0a1-d2d1cab852ba"
}
```

```json
{
  "id": "ba5b9b4d-83d7-4d93-831b-fef20cb94a47",
  "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ff04452-cd93-4600-9e1c-4d07693b99aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ff04452-cd93-4600-9e1c-4d07693b99aa",
  "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
  "assignment_id": "ba5b9b4d-83d7-4d93-831b-fef20cb94a47",
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

`POST /api/driver/v1/work-sessions/4d22084b-c08c-4c93-941f-e63b9543c6bd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:56:56Z",
    "sequence": 1793354216959
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4d22084b-c08c-4c93-941f-e63b9543c6bd",
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
  "last_heartbeat_at": "2026-10-30T09:56:56.981856Z",
  "last_location_at": "2026-10-30T09:56:56.981856Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8ff04452-cd93-4600-9e1c-4d07693b99aa/arrive` → **200**

```json
{
  "command_id": "4c232b4d-9451-4319-b3a2-06f425426bb5",
  "expected_version": 0
}
```

```json
{
  "id": "8ff04452-cd93-4600-9e1c-4d07693b99aa",
  "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
  "assignment_id": "ba5b9b4d-83d7-4d93-831b-fef20cb94a47",
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
  "arrived_at": "2026-10-30T09:56:57.27077Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8ff04452-cd93-4600-9e1c-4d07693b99aa/start` → **200**

```json
{
  "command_id": "03e8a883-a343-4e34-8c1a-1106d6af8745",
  "expected_version": 1
}
```

```json
{
  "id": "8ff04452-cd93-4600-9e1c-4d07693b99aa",
  "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
  "assignment_id": "ba5b9b4d-83d7-4d93-831b-fef20cb94a47",
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
  "arrived_at": "2026-10-30T09:56:57.27077Z",
  "started_at": "2026-10-30T09:56:57.571635Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/8ff04452-cd93-4600-9e1c-4d07693b99aa/complete` → **200**

```json
{
  "command_id": "720825ac-e268-4dbd-a0f9-ce2f98db11a0",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:56:57Z",
  "cash_received": true
}
```

```json
{
  "id": "8ff04452-cd93-4600-9e1c-4d07693b99aa",
  "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
  "assignment_id": "ba5b9b4d-83d7-4d93-831b-fef20cb94a47",
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
  "arrived_at": "2026-10-30T09:56:57.27077Z",
  "started_at": "2026-10-30T09:56:57.571635Z",
  "completed_at": "2026-10-30T09:56:57.890785Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "66fbaf30-2526-4f93-809e-fdaa22461a22",
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
      "id": "4298de62-b200-4cd5-aa54-ed4e3e7fd24f",
      "at": "2026-10-30T09:56:58.221976Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852"
    },
    {
      "id": "93d3bfb6-2042-4c04-8a5f-a3db7794a353",
      "at": "2026-10-30T09:56:53.68577Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/fed8a4d3-0799-48bf-bea5-f9446460b216/archive` → **200**

```json
{
  "command_id": "42c035f2-0cfc-4700-a98d-d085294ec2ba",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "fed8a4d3-0799-48bf-bea5-f9446460b216",
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
  "created_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "created_at": "2026-10-30T09:56:52.486673Z",
  "updated_at": "2026-10-30T09:57:01.504994Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4d22084b-c08c-4c93-941f-e63b9543c6bd",
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
  "last_heartbeat_at": "2026-10-30T09:56:56.981856Z",
  "last_location_at": "2026-10-30T09:56:56.981856Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4d22084b-c08c-4c93-941f-e63b9543c6bd/close` → **200**

```json
{
  "command_id": "51974285-32bf-4091-94a1-fa1cfc5d05ed",
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

Done: order 93ea2ec6-c38c-4ff3-88c6-8f82e0abf852.

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
  "session_id": "fe82537d-dc20-496b-893f-cf45a3b392c0",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMjIsImlhdCI6MTc5MzM1NDIyMiwianRpIjoiZWFjYWZjYmUtODcwZC00ZWZkLWEzOTAtMjBhN2I2MjBjNTMxIiwic2lkIjoiZmU4MjUzN2QtZGMyMC00OTZiLTg5M2YtY2Y0NWEzYjM5MmMwIn0.D1y0sPZqUMh0GwXlUnY4y0J0ZLq5wotYQxk3LQFcxS0",
  "access_expires_at": "2026-10-30T10:12:02.74316073Z",
  "refresh_token": "x5nHdn-x26TwzfMTaiga1KvKsHx6RYPtVfoIx3ch8Pk",
  "refresh_expires_at": "2026-10-30T21:57:02.742465226Z",
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
  "command_id": "0e3cfff2-5c1d-4d58-b8cf-aaa0be3c7eff",
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
  "session_id": "ce567e29-69d3-4ac6-881d-e55a8ab6ea89",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMjMsImlhdCI6MTc5MzM1NDIyMywianRpIjoiNGFlN2ZiNmQtMjRhOS00ZTdlLWI2YjAtZTQzMDZhMjMxOTRkIiwic2lkIjoiY2U1NjdlMjktNjlkMy00YWM2LTg4MWQtZTU1YThhYjZlYTg5In0.iS46e7YxMwJd6LMoQYEzfF0GUjmd9PPWX_HKgKLtMTU",
  "access_expires_at": "2026-10-30T10:12:03.931541988Z",
  "refresh_token": "mfoPyB3Oy3WZaMhFpQaagw8EP_xqcOrzG4DBCF6zi1k",
  "refresh_expires_at": "2026-10-30T21:57:03.930853936Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.652523523",
    "linkedid": "1730052700.652523523",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676668676"
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
    "id": "1730052700.652523523",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "399ac9c2-0dbc-4152-84ce-f80c8556f78d",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.217511Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:57:04.245431Z",
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
    "id": "1730052600.544812043",
    "linkedid": "1730052600.544812043",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676668676"
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
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/4fe1433c-c7a2-4fc8-8257-51b6f5facaca/answer` → **200**

```json
{
  "command_id": "245bc26c-d4f9-4db9-981b-6a09c0c3a691"
}
```

```json
{
  "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676668676",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "order_ids": [],
  "started_at": "2026-10-30T09:57:04.587502Z",
  "answered_at": "2026-10-30T09:57:04.905152Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.544812043",
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
    "id": "1730052600.544812043",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": "2026-10-30T09:57:04.905152Z",
      "ended_at": "2026-10-30T09:57:05.224235Z",
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
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": "2026-10-30T09:57:04.905152Z",
      "ended_at": "2026-10-30T09:57:05.224235Z",
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
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": "2026-10-30T09:57:04.905152Z",
      "ended_at": "2026-10-30T09:57:05.224235Z",
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
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": "2026-10-30T09:57:04.905152Z",
      "ended_at": "2026-10-30T09:57:05.224235Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:57:11.848529Z"
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
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": "2026-10-30T09:57:04.905152Z",
      "ended_at": "2026-10-30T09:57:05.224235Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:57:11.848529Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/4fe1433c-c7a2-4fc8-8257-51b6f5facaca/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/4fe1433c-c7a2-4fc8-8257-51b6f5facaca/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=4fe1433c-c7a2-4fc8-8257-51b6f5facaca` → **200**

```json
{
  "changes": [
    {
      "id": "c2238e95-077a-4d97-9d96-c3dc7d70688a",
      "occurred_at": "2026-10-30T09:57:12.775454Z",
      "actor_type": "STAFF",
      "actor_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4a040e60-c92d-4c78-a6ff-164509c58697\", \"order_ids\": []}",
      "correlation_id": "2f5086fe-9527-47d8-a5a8-69093bd555cd"
    },
    {
      "id": "bf44c44f-7324-4c24-9352-3928486b038d",
      "occurred_at": "2026-10-30T09:57:12.736894Z",
      "actor_type": "STAFF",
      "actor_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4a040e60-c92d-4c78-a6ff-164509c58697\", \"order_ids\": []}",
      "correlation_id": "a286dc51-eb99-49aa-a75d-86a9a2fd3876"
    }
  ]
}
```

Done: call 4fe1433c-c7a2-4fc8-8257-51b6f5facaca recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3305"
}
```

```json
{
  "challenge_id": "b8040c6b-e88f-4e45-af42-7353d0b49112",
  "expires_at": "2026-10-30T10:02:13.109139967Z",
  "resend_available_at": "2026-10-30T09:57:14.109139967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "025184",
  "sent_at": "2026-10-30T09:57:13.113545266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8040c6b-e88f-4e45-af42-7353d0b49112",
  "code": "025184",
  "device_ref": "sandbox-3305"
}
```

```json
{
  "session_id": "87253aef-7b0d-43d3-b0aa-28078264e418",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTEzMywiaWF0IjoxNzkzMzU0MjMzLCJqdGkiOiI2NjE3ZjhiOS02MGU5LTQ1ZDMtOGJhOC05NTdkOWVkOTBmZTQiLCJzaWQiOiI4NzI1M2FlZi03YjBkLTQzZDMtYjBhYS0yODA3ODI2NGU0MTgifQ.BnRZiAdHXUXUpaIOUZSbFE20jeaA9nCWhQk1oscIYYc",
  "access_expires_at": "2026-10-30T10:12:13.437255431Z",
  "refresh_token": "wZhmkWFZoFJHx8e3vjs1IysMbxlniims_nbC7XP1ebc",
  "refresh_expires_at": "2026-11-29T09:57:13.436467439Z",
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
  "command_id": "3afdcce0-cbc7-4339-b01b-433cdd7f1038",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:14Z",
    "sequence": 1793354234118
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "32cfc53e-707d-4998-8528-05f36237d528",
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
  "last_heartbeat_at": "2026-10-30T09:57:14.034234Z",
  "last_location_at": "2026-10-30T09:57:14.034234Z",
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
  "session_id": "1c264001-586a-4ad6-bf8d-8d8a68c39949",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxMzQsImlhdCI6MTc5MzM1NDIzNCwianRpIjoiMmQyNTE0NjgtYzdkYi00YzYwLTk1MjctYmNkMGNmOGI5YzQwIiwic2lkIjoiMWMyNjQwMDEtNTg2YS00YWQ2LWJmOGQtOGQ4YTY4YzM5OTQ5In0.rCUviA_Zqh-BjSCeN95c8XvDHAb5pOO9rcnXgLPdPq0",
  "access_expires_at": "2026-10-30T10:12:14.654908251Z",
  "refresh_token": "W1XQbrEmHfOypDBR0AZPIyTBQ5eA9YRmvc7c4gx5NTc",
  "refresh_expires_at": "2026-10-30T21:57:14.654277284Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "749adedf-8846-4a0a-9f50-ba8dfb52301a",
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
  "id": "8d6934df-63a5-4217-b410-868bf13b114b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:14.945292Z",
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
  "command_id": "01a923f4-306f-4de3-8bdd-a9d28e2aef54",
  "quote_id": "8d6934df-63a5-4217-b410-868bf13b114b",
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
    "phone": "+380674386681"
  }
}
```

```json
{
  "id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
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
  "created_at": "2026-10-30T09:57:15.266961Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674386681"
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
    "id": "19fa4c03-2f84-41ef-ad4f-2c27d4acdcd1",
    "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
    "expires_at": "2026-10-30T09:57:30.272285Z",
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

`POST /api/driver/v1/offers/19fa4c03-2f84-41ef-ad4f-2c27d4acdcd1/accept` → **200**

```json
{
  "command_id": "d3804ed2-79d0-4fee-87c8-9caf08832ae7"
}
```

```json
{
  "id": "a48a3fff-1c12-42cf-b5c7-001682b44126",
  "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70974f26-95d6-4b08-ae01-55308e881eb7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70974f26-95d6-4b08-ae01-55308e881eb7",
  "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
  "assignment_id": "a48a3fff-1c12-42cf-b5c7-001682b44126",
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
    "phone": "+380674386681"
  }
}
```

`POST /api/driver/v1/work-sessions/32cfc53e-707d-4998-8528-05f36237d528/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:17Z",
    "sequence": 1793354237561
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "32cfc53e-707d-4998-8528-05f36237d528",
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
  "last_heartbeat_at": "2026-10-30T09:57:17.581542Z",
  "last_location_at": "2026-10-30T09:57:17.581542Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/70974f26-95d6-4b08-ae01-55308e881eb7/arrive` → **200**

```json
{
  "command_id": "8ff4fb82-1074-4e3a-845b-a28a438adac1",
  "expected_version": 0
}
```

```json
{
  "id": "70974f26-95d6-4b08-ae01-55308e881eb7",
  "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
  "assignment_id": "a48a3fff-1c12-42cf-b5c7-001682b44126",
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
  "arrived_at": "2026-10-30T09:57:17.864896Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674386681"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  },
  {
    "phone": "+380674386681",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:19.10540393Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  },
  {
    "phone": "+380674386681",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:19.10540393Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674386681` → **200**

```json
[
  {
    "phone": "+380674386681",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:17.096000277Z"
  },
  {
    "phone": "+380674386681",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:57:19.10540393Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/70974f26-95d6-4b08-ae01-55308e881eb7/start` → **200**

```json
{
  "command_id": "0100be8c-abc5-4ab8-85e9-4a1341dbfe8c",
  "expected_version": 1
}
```

```json
{
  "id": "70974f26-95d6-4b08-ae01-55308e881eb7",
  "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
  "assignment_id": "a48a3fff-1c12-42cf-b5c7-001682b44126",
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
  "arrived_at": "2026-10-30T09:57:17.864896Z",
  "started_at": "2026-10-30T09:57:19.2844Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674386681"
  }
}
```

`POST /api/driver/v1/trips/70974f26-95d6-4b08-ae01-55308e881eb7/complete` → **200**

```json
{
  "command_id": "372fdbd5-ca7f-4f0d-b683-dd3c78c100f3",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:57:19Z",
  "cash_received": true
}
```

```json
{
  "id": "70974f26-95d6-4b08-ae01-55308e881eb7",
  "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
  "assignment_id": "a48a3fff-1c12-42cf-b5c7-001682b44126",
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
  "arrived_at": "2026-10-30T09:57:17.864896Z",
  "started_at": "2026-10-30T09:57:19.2844Z",
  "completed_at": "2026-10-30T09:57:19.597106Z",
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
  "session_id": "32cfc53e-707d-4998-8528-05f36237d528",
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
  "last_heartbeat_at": "2026-10-30T09:57:17.581542Z",
  "last_location_at": "2026-10-30T09:57:17.581542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/32cfc53e-707d-4998-8528-05f36237d528/close` → **200**

```json
{
  "command_id": "8eee70be-e760-400a-b770-74977a0e81d6",
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
  "phone": "+380638735973",
  "device_ref": "sandbox-27916"
}
```

```json
{
  "challenge_id": "ff436a7e-b4e5-41d3-8d72-e366473b99a3",
  "expires_at": "2026-10-30T10:02:20.520228232Z",
  "resend_available_at": "2026-10-30T09:57:21.520228232Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638735973` → **200**

```json
{
  "phone": "+380638735973",
  "audience": "CLIENT",
  "code": "499278",
  "sent_at": "2026-10-30T09:57:20.524645921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff436a7e-b4e5-41d3-8d72-e366473b99a3",
  "code": "499278",
  "device_ref": "sandbox-27916"
}
```

```json
{
  "session_id": "f8c2a1ea-0d28-4d93-acaa-9053ad9a9cfa",
  "subject": {
    "type": "CLIENT",
    "id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzUwMGEyMS1kMGI2LTRhYjAtODJmMi00NjYwYzBjOTIxNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTQwLCJpYXQiOjE3OTMzNTQyNDAsImp0aSI6ImVkNzNjOGE2LWQ2OTktNDQ4Yi1iMzRiLTJhMGYyNmY4YWJjYiIsInNpZCI6ImY4YzJhMWVhLTBkMjgtNGQ5My1hY2FhLTkwNTNhZDlhOWNmYSJ9.Gx0vJBQGyshE3LUDCK8h8WdWJFhOoCz4T3SAXA2I6k8",
  "access_expires_at": "2026-10-30T10:12:20.852935379Z",
  "refresh_token": "U1NDJLbb6saLZ-tpOQRsnwBk3JoTXqqjhhv0lgYjwog",
  "refresh_expires_at": "2026-11-29T09:57:20.852300501Z",
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
  "device_ref": "sandbox-23630"
}
```

```json
{
  "challenge_id": "53f8032d-73a3-4407-9f0a-b824f4c1ff65",
  "expires_at": "2026-10-30T10:02:21.423353316Z",
  "resend_available_at": "2026-10-30T09:57:22.423353316Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "677613",
  "sent_at": "2026-10-30T09:57:21.426896532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53f8032d-73a3-4407-9f0a-b824f4c1ff65",
  "code": "677613",
  "device_ref": "sandbox-23630"
}
```

```json
{
  "session_id": "d2ecbdcb-6799-4b49-8387-1d0992e696c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE0MSwiaWF0IjoxNzkzMzU0MjQxLCJqdGkiOiIzZjNlZjI3Mi0wOWUyLTQ0NDgtYTM2ZC03M2Q2MDk0NGRmMTciLCJzaWQiOiJkMmVjYmRjYi02Nzk5LTRiNDktODM4Ny0xZDA5OTJlNjk2YzIifQ.XWlVSW18Db6egcu7akA1SeraG3LdGwtc7BnDKRIpKpE",
  "access_expires_at": "2026-10-30T10:12:21.759635216Z",
  "refresh_token": "Co0g1i1JmhTNAZcxr6rfPc8-PZdgRdbuyqqJzM1h_zU",
  "refresh_expires_at": "2026-11-29T09:57:21.759007805Z",
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
  "session_id": "50237aad-229d-4558-9970-9b58f9c249b7",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNDIsImlhdCI6MTc5MzM1NDI0MiwianRpIjoiNTgxOTgyNDAtMzgxYy00NTIxLThhOGItNTVjZjE4ZTdkMjVlIiwic2lkIjoiNTAyMzdhYWQtMjI5ZC00NTU4LTk5NzAtOWI1OGY5YzI0OWI3In0.IcDzoSDP-zfpvN1wQJfQhuON6fsDzg1AJivcv33wr8o",
  "access_expires_at": "2026-10-30T10:12:22.656110227Z",
  "refresh_token": "sN0AUAZBe9rt4Dl3JrqRyoNOm0EFUyFLUIr-YsPLvZ4",
  "refresh_expires_at": "2026-10-30T21:57:22.65550548Z",
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
  "session_id": "52487f57-17ae-4f0f-be7a-d5cfe12ff718",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNDMsImlhdCI6MTc5MzM1NDI0MywianRpIjoiODhkZmY0ZjgtODhjMS00OTUzLTkyOGUtZGM1YzdkMGJjZmQwIiwic2lkIjoiNTI0ODdmNTctMTdhZS00ZjBmLWJlN2EtZDVjZmUxMmZmNzE4In0.IkYVVKEUScTQ3R4WJvJljLkfeEwSRbMcmscsKSLLBpU",
  "access_expires_at": "2026-10-30T10:12:23.268804202Z",
  "refresh_token": "P0zZ_46AIoBef-u0B_8FA1LX5DMMZub5gbHMmOCLKLM",
  "refresh_expires_at": "2026-10-30T21:57:23.268208739Z",
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
  "command_id": "3a9b4898-ba68-4f72-96f3-fc72b6955802",
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
  "id": "cc631c2d-9d55-45c7-bc10-cbdd2d74904d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:23.842453Z",
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
  "command_id": "874df747-364d-41db-8855-4ac0667b5104",
  "quote_id": "cc631c2d-9d55-45c7-bc10-cbdd2d74904d",
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
  "id": "936f47ef-3380-462a-9238-2733503a1894",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179",
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
  "created_at": "2026-10-30T09:57:24.14463Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/936f47ef-3380-462a-9238-2733503a1894` → **200**

```json
{
  "id": "936f47ef-3380-462a-9238-2733503a1894",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179",
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
  "created_at": "2026-10-30T09:57:24.14463Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/936f47ef-3380-462a-9238-2733503a1894/cancel` → **200**

```json
{
  "command_id": "d22f5648-909b-4a85-91c7-36af01ac6220",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "936f47ef-3380-462a-9238-2733503a1894",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179",
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
  "created_at": "2026-10-30T09:57:24.14463Z",
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
  "command_id": "f042bf68-a5c1-43fd-a5be-7331a7a69448",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:25Z",
    "sequence": 1793354245380
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "17a9ab40-0289-46af-99cf-5873a04e8346",
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
  "last_heartbeat_at": "2026-10-30T09:57:25.403279Z",
  "last_location_at": "2026-10-30T09:57:25.403279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7072"
}
```

```json
{
  "challenge_id": "08847c9b-c2d3-45fe-b031-3033125b8cdb",
  "expires_at": "2026-10-30T10:02:25.701139381Z",
  "resend_available_at": "2026-10-30T09:57:26.701139381Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "656442",
  "sent_at": "2026-10-30T09:57:25.704709472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08847c9b-c2d3-45fe-b031-3033125b8cdb",
  "code": "656442",
  "device_ref": "sandbox-7072"
}
```

```json
{
  "session_id": "472226ea-98cd-4825-a7a9-9bed5bc97af2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE0NiwiaWF0IjoxNzkzMzU0MjQ2LCJqdGkiOiJiOGU1ZjI1ZC1jYmEyLTRmOWItODBjMS1lMjJhMjI1ZTU5YTkiLCJzaWQiOiI0NzIyMjZlYS05OGNkLTQ4MjUtYTdhOS05YmVkNWJjOTdhZjIifQ.AMu9W8xabPDrbH8pW3dyNSqm45dcfY0p0qUu6x_rC_k",
  "access_expires_at": "2026-10-30T10:12:26.046336736Z",
  "refresh_token": "r4keJnAiq4dP1pl37XX9m0Gko4q-FobISGSTR3MhgFc",
  "refresh_expires_at": "2026-11-29T09:57:26.045706165Z",
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
  "command_id": "a2be7f4c-958e-4706-b0e6-9ab092ef4f65",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:26Z",
    "sequence": 1793354246612
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:26.634812Z",
  "last_location_at": "2026-10-30T09:57:26.634812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0d16c8e-e79f-4822-92dd-29dcc830ae94",
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
  "id": "cf2d518f-0389-48ed-a841-88e30f7aa90d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:26.980476Z",
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
  "command_id": "cc23922e-07fe-4731-b18c-f8bdef51d92c",
  "quote_id": "cf2d518f-0389-48ed-a841-88e30f7aa90d",
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
  "id": "58c3f62f-b221-4df8-8798-824327addff9",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179",
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
  "created_at": "2026-10-30T09:57:27.289146Z",
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
    "id": "991e1838-6fbe-463c-a5d3-6c626c6f71bd",
    "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
    "expires_at": "2026-10-30T09:57:42.293656Z",
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

`POST /api/driver/v1/offers/991e1838-6fbe-463c-a5d3-6c626c6f71bd/accept` → **200**

```json
{
  "command_id": "de5b6fba-7f9f-4ac9-b3a0-bd91a82d038e"
}
```

```json
{
  "id": "e508e667-c3c1-4880-a1fc-6f6d82004d7c",
  "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5166a66b-492b-4146-8191-30c693968698",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5166a66b-492b-4146-8191-30c693968698",
  "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
  "assignment_id": "e508e667-c3c1-4880-a1fc-6f6d82004d7c",
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

`POST /api/driver/v1/trips/5166a66b-492b-4146-8191-30c693968698/cancel` → **200**

```json
{
  "command_id": "3f3de721-c4ad-456a-bb41-7d0d9825a8cd",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "5166a66b-492b-4146-8191-30c693968698",
  "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
  "assignment_id": "e508e667-c3c1-4880-a1fc-6f6d82004d7c",
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

`GET /api/rider/v1/orders/58c3f62f-b221-4df8-8798-824327addff9` → **200**

```json
{
  "id": "58c3f62f-b221-4df8-8798-824327addff9",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179",
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
    "id": "e508e667-c3c1-4880-a1fc-6f6d82004d7c",
    "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5166a66b-492b-4146-8191-30c693968698",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:57:27.289146Z",
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
    "id": "057855bb-c033-4bc8-b69c-3769b68515da",
    "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
    "expires_at": "2026-10-30T09:57:43.478707Z",
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

`POST /api/driver/v1/offers/057855bb-c033-4bc8-b69c-3769b68515da/accept` → **200**

```json
{
  "command_id": "91c5f115-21ea-4e0c-a8e4-b6842012cf83"
}
```

```json
{
  "id": "9d4638ef-25d4-4e94-b532-41a6fc521e24",
  "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b28d1bf-8450-4ac2-babd-a23bd32fe156",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b28d1bf-8450-4ac2-babd-a23bd32fe156",
  "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
  "assignment_id": "9d4638ef-25d4-4e94-b532-41a6fc521e24",
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

`POST /api/driver/v1/trips/3b28d1bf-8450-4ac2-babd-a23bd32fe156/cancel` → **200**

```json
{
  "command_id": "1d20c8ee-1096-4e0e-a66f-9d827a12c971",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3b28d1bf-8450-4ac2-babd-a23bd32fe156",
  "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
  "assignment_id": "9d4638ef-25d4-4e94-b532-41a6fc521e24",
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
    "id": "58c3f62f-b221-4df8-8798-824327addff9",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:57:27.289146Z",
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
    "id": "936f47ef-3380-462a-9238-2733503a1894",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:57:24.14463Z",
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

`GET /api/operator/v1/orders/58c3f62f-b221-4df8-8798-824327addff9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:57:27.289942Z",
      "actor": {
        "type": "CLIENT",
        "id": "9c500a21-d0b6-4ab0-82f2-4660c0c92179",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
        "quote_id": "cf2d518f-0389-48ed-a841-88e30f7aa90d",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "b81294a2-17ce-4010-bfbc-81cf9e942ddd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:57:27.292538Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
        "attempt_id": "8a64201b-e4e3-4f01-9b17-8def3d553482",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b81294a2-17ce-4010-bfbc-81cf9e942ddd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:57:27.300376Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "991e1838-6fbe-463c-a5d3-6c626c6f71bd",
        "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "b81294a2-17ce-4010-bfbc-81cf9e942ddd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:57:27.887596Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "991e1838-6fbe-463c-a5d3-6c626c6f71bd",
        "order_id": "58c3f62f-b221-4df8-8798-824327addff9",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e508e667-c3c1-4880-a1fc-6f6d82004d7c"
      },
      "correlation_id": "80f54368-1083-47ae-bd5b-9aab08799285"
```

Done: orders 936f47ef-3380-462a-9238-2733503a1894, 58c3f62f-b221-4df8-8798-824327addff9.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731713794",
  "device_ref": "sandbox-10682"
}
```

```json
{
  "challenge_id": "47ffda9a-9331-4d27-989d-e9526b975461",
  "expires_at": "2026-10-30T10:02:30.881259501Z",
  "resend_available_at": "2026-10-30T09:57:31.881259501Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731713794` → **200**

```json
{
  "phone": "+380731713794",
  "audience": "CLIENT",
  "code": "318509",
  "sent_at": "2026-10-30T09:57:30.884519311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47ffda9a-9331-4d27-989d-e9526b975461",
  "code": "318509",
  "device_ref": "sandbox-10682"
}
```

```json
{
  "session_id": "7fe63e4d-7971-4a88-b90a-60c6392530cc",
  "subject": {
    "type": "CLIENT",
    "id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmM2ZjNlOS02NTVkLTRkOGYtOGQ0My01YjJiODdkN2ZmYzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTUxLCJpYXQiOjE3OTMzNTQyNTEsImp0aSI6IjA4ZGM4MThkLWIzMjQtNDAxOS05MTc5LWNkMGY2MDkwNWQ3YiIsInNpZCI6IjdmZTYzZTRkLTc5NzEtNGE4OC1iOTBhLTYwYzYzOTI1MzBjYyJ9.WeP6ceZR3lIWsKO1iUdXgwdpXUr7NYtMlttJy8oVMUw",
  "access_expires_at": "2026-10-30T10:12:31.196008848Z",
  "refresh_token": "VW9pdXaVXBKuXd4yOhEw_EuJGtTz7X4A4An2FF2Q6Rk",
  "refresh_expires_at": "2026-11-29T09:57:31.195447927Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "df65558a-ce4e-46c8-a07e-1e5e9c3a29e3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a5295b49-ccd4-42f5-92ef-d7b0a6aa5764",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a5295b49-ccd4-42f5-92ef-d7b0a6aa5764",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "377752fb82e1b20ec4206c41deaed6af",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a5295b49-ccd4-42f5-92ef-d7b0a6aa5764",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731713794"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a5295b49-ccd4-42f5-92ef-d7b0a6aa5764",
  "expires_at": "2026-10-30T10:27:31.487796Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/a5295b49-ccd4-42f5-92ef-d7b0a6aa5764` → **200**

```json
{
  "id": "a5295b49-ccd4-42f5-92ef-d7b0a6aa5764",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:27:31.487796Z",
  "card": {
    "id": "20fa3819-8086-4428-806b-8ed990dd0906",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6195",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:57:31.799972Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "20fa3819-8086-4428-806b-8ed990dd0906",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6195",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:57:31.799972Z"
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
  "device_ref": "sandbox-30465"
}
```

```json
{
  "challenge_id": "d652408e-3910-478d-8e9e-da9a756d5e0f",
  "expires_at": "2026-10-30T10:02:32.41600642Z",
  "resend_available_at": "2026-10-30T09:57:33.41600642Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "593817",
  "sent_at": "2026-10-30T09:57:32.41927261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d652408e-3910-478d-8e9e-da9a756d5e0f",
  "code": "593817",
  "device_ref": "sandbox-30465"
}
```

```json
{
  "session_id": "4df73475-422d-4cab-b153-4524ca3615e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE1MiwiaWF0IjoxNzkzMzU0MjUyLCJqdGkiOiI0ZmJlNTljZC0wMDUyLTQwODktOWM0ZS00OGQ2MjRjZjU2NjIiLCJzaWQiOiI0ZGY3MzQ3NS00MjJkLTRjYWItYjE1My00NTI0Y2EzNjE1ZTIifQ.Vrnj8Cya2MmuZeiF8V1i9C6jgu3lR20UCW1WSMbHpJw",
  "access_expires_at": "2026-10-30T10:12:32.734313541Z",
  "refresh_token": "skj4N09UBMgL-0dLMtHUgdX7MUf0VPcVkN7-gPZ1m5w",
  "refresh_expires_at": "2026-11-29T09:57:32.733707667Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:26.634812Z",
  "last_location_at": "2026-10-30T09:57:26.634812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/290c3d7d-a9b1-47e1-adf5-500034bdb323/handover` → **200**

```json
{
  "command_id": "09534316-0f80-40c2-a44f-33e41f3aa977",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:26.634812Z",
  "last_location_at": "2026-10-30T09:57:26.634812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/290c3d7d-a9b1-47e1-adf5-500034bdb323/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:33Z",
    "sequence": 1793354253588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:33.609297Z",
  "last_location_at": "2026-10-30T09:57:33.609297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3b6a852-75ce-47d4-a892-32801a0a9a01",
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
  "id": "d7e33c0d-213f-40bf-8ba5-237f2d23cd18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:33.902495Z",
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
  "command_id": "92ff08dd-a7f6-4f57-a2c2-9da03771b170",
  "quote_id": "d7e33c0d-213f-40bf-8ba5-237f2d23cd18",
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
  "id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
  "created_at": "2026-10-30T09:57:34.207469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d` → **200**

```json
{
  "id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
  "created_at": "2026-10-30T09:57:34.207469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d` → **200**

```json
{
  "id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
  "created_at": "2026-10-30T09:57:34.207469Z",
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
    "id": "ebf162ef-9bc4-4b84-b0a2-6895e3b1fabc",
    "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
    "expires_at": "2026-10-30T09:57:49.49192Z",
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

`POST /api/driver/v1/offers/ebf162ef-9bc4-4b84-b0a2-6895e3b1fabc/accept` → **200**

```json
{
  "command_id": "7ce45ca4-12f6-4829-9515-a41fcdb6518e"
}
```

```json
{
  "id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "assignment_id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
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

`POST /api/driver/v1/work-sessions/290c3d7d-a9b1-47e1-adf5-500034bdb323/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:37Z",
    "sequence": 1793354257421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:37.062949Z",
  "last_location_at": "2026-10-30T09:57:37.062949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/54d7ac8e-1e03-4737-b7d2-242987f48a64/arrive` → **200**

```json
{
  "command_id": "a2753554-f7b5-4621-a7a5-47b3664f7cf5",
  "expected_version": 0
}
```

```json
{
  "id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "assignment_id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
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
  "arrived_at": "2026-10-30T09:57:37.355334Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54d7ac8e-1e03-4737-b7d2-242987f48a64/start` → **200**

```json
{
  "command_id": "16681643-60da-45e1-8e2c-4059b1a5e472",
  "expected_version": 1
}
```

```json
{
  "id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "assignment_id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
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
  "arrived_at": "2026-10-30T09:57:37.355334Z",
  "started_at": "2026-10-30T09:57:37.655835Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54d7ac8e-1e03-4737-b7d2-242987f48a64/complete` → **200**

```json
{
  "command_id": "653a9c50-235b-4125-8731-c457118e37f3",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:57:37Z",
  "cash_received": true
}
```

```json
{
  "id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "assignment_id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
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
  "arrived_at": "2026-10-30T09:57:37.355334Z",
  "started_at": "2026-10-30T09:57:37.655835Z",
  "completed_at": "2026-10-30T09:57:37.959135Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d` → **200**

```json
{
  "id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
    "id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
    "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:57:34.207469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d` → **200**

```json
{
  "id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
    "id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
    "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:57:34.207469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d` → **200**

```json
{
  "id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
    "id": "19c1d8e9-9f58-46a1-a77a-07bf02727c3e",
    "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "54d7ac8e-1e03-4737-b7d2-242987f48a64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:57:34.207469Z",
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

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d/tip` → **200**

```json
{
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
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
  "available_until": "2026-10-31T09:57:37.959135Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d/tip` → **201**

```json
{
  "command_id": "a9be5a18-bd59-4033-b474-d5a05676e1a9",
  "amount_minor": 2500
}
```

```json
{
  "id": "e66cd482-2bf2-47fd-987e-ad55bc6157fc",
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:57:41.715006Z"
}
```

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d/tip` → **200**

```json
{
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
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
  "available_until": "2026-10-31T09:57:37.959135Z",
  "open": false,
  "tip": {
    "id": "e66cd482-2bf2-47fd-987e-ad55bc6157fc",
    "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:57:41.715006Z"
  }
}
```

`GET /api/rider/v1/orders/7defc5e3-8423-4249-80db-7d094eaeb96d/tip` → **200**

```json
{
  "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
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
  "available_until": "2026-10-31T09:57:37.959135Z",
  "open": false,
  "tip": {
    "id": "e66cd482-2bf2-47fd-987e-ad55bc6157fc",
    "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:57:41.715006Z"
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
      "id": "eca71485-5a0e-45e6-b47b-219241a83293",
      "at": "2026-10-30T09:57:43.635344Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
      "counterpart_id": null
    },
    {
      "id": "5efcaedd-fe56-4ddd-9baa-2b268b1750f0",
      "at": "2026-10-30T09:57:38.576976Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d305c9e-81c9-4507-8568-d860518ac176",
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
  "id": "bd8eb6c8-327f-4330-a0cf-ab6d02aad5b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:02:43.958307Z",
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
  "session_id": "283c5d6f-b811-4e79-b78c-6fad523c19c9",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxNjQsImlhdCI6MTc5MzM1NDI2NCwianRpIjoiNWEyOTM0YTMtZDhmMC00MjNjLWI5MDktMmMzYThkMDhlMzRiIiwic2lkIjoiMjgzYzVkNmYtYjgxMS00ZTc5LWI3OGMtNmZhZDUyM2MxOWM5In0.t7B9zYSocuLgZD2CT0yzOYM6cIZb1G7sx9u2kKJwheE",
  "access_expires_at": "2026-10-30T10:12:44.606883858Z",
  "refresh_token": "luE4WxPzJRSoKZt-AqzjDuA5SvvAUdHqhtU5ZAe4KQQ",
  "refresh_expires_at": "2026-10-30T21:57:44.606312701Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731713794` → **200**

```json
{
  "client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0"
}
```

`POST /api/admin/v1/rider-wallets/5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0/top-ups` → **201**

```json
{
  "command_id": "ed451dcb-1ad6-4f22-bd6f-20590eca66d7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
      "id": "6ad711f0-8c85-4d8d-b7ef-e0ca39a9aacb",
      "at": "2026-10-30T09:57:45.180915Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d585178c-7911-4421-ab4a-98fb453ab1a0",
  "quote_id": "bd8eb6c8-327f-4330-a0cf-ab6d02aad5b3",
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
  "id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
  "created_at": "2026-10-30T09:57:45.489194Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/66045b33-c61d-4a2c-8de2-f77ff1a71771` → **200**

```json
{
  "id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
  "created_at": "2026-10-30T09:57:45.489194Z",
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
    "id": "c9ad7b6d-8dca-4064-b8d7-6a434a00037d",
    "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
    "expires_at": "2026-10-30T09:58:00.495134Z",
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

`POST /api/driver/v1/offers/c9ad7b6d-8dca-4064-b8d7-6a434a00037d/accept` → **200**

```json
{
  "command_id": "43a3a4f9-c719-4bb2-a98f-89e23a4fba50"
}
```

```json
{
  "id": "a2ea9208-f207-495e-a348-9f7adff07c1d",
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fada179b-853b-4b5e-be3d-1ad35a5b8bf3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fada179b-853b-4b5e-be3d-1ad35a5b8bf3",
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "assignment_id": "a2ea9208-f207-495e-a348-9f7adff07c1d",
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

`POST /api/driver/v1/work-sessions/290c3d7d-a9b1-47e1-adf5-500034bdb323/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:46Z",
    "sequence": 1793354266963
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:46.984561Z",
  "last_location_at": "2026-10-30T09:57:46.984561Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fada179b-853b-4b5e-be3d-1ad35a5b8bf3/arrive` → **200**

```json
{
  "command_id": "8669abb1-0844-49e2-9d5c-9a582980dcfe",
  "expected_version": 0
}
```

```json
{
  "id": "fada179b-853b-4b5e-be3d-1ad35a5b8bf3",
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "assignment_id": "a2ea9208-f207-495e-a348-9f7adff07c1d",
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
  "arrived_at": "2026-10-30T09:57:47.299428Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fada179b-853b-4b5e-be3d-1ad35a5b8bf3/start` → **200**

```json
{
  "command_id": "5750660c-28d4-4d72-95d0-f85cb245df11",
  "expected_version": 1
}
```

```json
{
  "id": "fada179b-853b-4b5e-be3d-1ad35a5b8bf3",
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "assignment_id": "a2ea9208-f207-495e-a348-9f7adff07c1d",
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
  "arrived_at": "2026-10-30T09:57:47.299428Z",
  "started_at": "2026-10-30T09:57:47.597227Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fada179b-853b-4b5e-be3d-1ad35a5b8bf3/complete` → **200**

```json
{
  "command_id": "5d132245-7ae4-47ef-8f2c-65e104fa1bc4",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:57:47Z",
  "cash_received": true
}
```

```json
{
  "id": "fada179b-853b-4b5e-be3d-1ad35a5b8bf3",
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "assignment_id": "a2ea9208-f207-495e-a348-9f7adff07c1d",
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
  "arrived_at": "2026-10-30T09:57:47.299428Z",
  "started_at": "2026-10-30T09:57:47.597227Z",
  "completed_at": "2026-10-30T09:57:47.912351Z",
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
  "client_id": "5bc6f3e9-655d-4d8f-8d43-5b2b87d7ffc0",
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
      "id": "6ad711f0-8c85-4d8d-b7ef-e0ca39a9aacb",
      "at": "2026-10-30T09:57:45.180915Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
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

`GET /api/rider/v1/orders/66045b33-c61d-4a2c-8de2-f77ff1a71771/tip` → **200**

```json
{
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
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
  "available_until": "2026-10-31T09:57:47.912351Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/66045b33-c61d-4a2c-8de2-f77ff1a71771/tip` → **201**

```json
{
  "command_id": "84a24ed6-1ad2-4519-9a6d-954e3db273c4",
  "amount_minor": 2500
}
```

```json
{
  "id": "cd259346-02f9-45c4-86dc-25082fd1b5a6",
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:57:49.072875Z"
}
```

`GET /api/rider/v1/orders/66045b33-c61d-4a2c-8de2-f77ff1a71771/tip` → **200**

```json
{
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
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
  "available_until": "2026-10-31T09:57:47.912351Z",
  "open": false,
  "tip": {
    "id": "cd259346-02f9-45c4-86dc-25082fd1b5a6",
    "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:57:49.072875Z"
  }
}
```

`GET /api/rider/v1/orders/66045b33-c61d-4a2c-8de2-f77ff1a71771/tip` → **200**

```json
{
  "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
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
  "available_until": "2026-10-31T09:57:47.912351Z",
  "open": false,
  "tip": {
    "id": "cd259346-02f9-45c4-86dc-25082fd1b5a6",
    "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:57:49.072875Z"
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
      "id": "9cd512ee-5bb9-4b68-a160-c9df2ec70808",
      "at": "2026-10-30T09:57:50.722492Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
      "counterpart_id": null
    },
    {
      "id": "bd777c28-a16f-4551-9a3f-e01575f558a1",
      "at": "2026-10-30T09:57:48.695813Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "66045b33-c61d-4a2c-8de2-f77ff1a71771",
      "counterpart_id": null
    },
    {
      "id": "eca71485-5a0e-45e6-b47b-219241a83293",
      "at": "2026-10-30T09:57:43.635344Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
      "counterpart_id": null
    },
    {
      "id": "5efcaedd-fe56-4ddd-9baa-2b268b1750f0",
      "at": "2026-10-30T09:57:38.576976Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7defc5e3-8423-4249-80db-7d094eaeb96d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "290c3d7d-a9b1-47e1-adf5-500034bdb323",
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
  "last_heartbeat_at": "2026-10-30T09:57:46.984561Z",
  "last_location_at": "2026-10-30T09:57:46.984561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/290c3d7d-a9b1-47e1-adf5-500034bdb323/close` → **200**

```json
{
  "command_id": "aca4bae6-32ba-4850-a995-9aa48c4ebb12",
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

Done: card order 66045b33-c61d-4a2c-8de2-f77ff1a71771.

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
  "phone": "+380738910372",
  "device_ref": "sandbox-29489"
}
```

```json
{
  "challenge_id": "255d50fa-6f19-4e68-8638-e96ffa2cfc09",
  "expires_at": "2026-10-30T10:02:52.094999746Z",
  "resend_available_at": "2026-10-30T09:57:53.094999746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738910372` → **200**

```json
{
  "phone": "+380738910372",
  "audience": "CLIENT",
  "code": "054700",
  "sent_at": "2026-10-30T09:57:52.099295066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "255d50fa-6f19-4e68-8638-e96ffa2cfc09",
  "code": "054700",
  "device_ref": "sandbox-29489"
}
```

```json
{
  "session_id": "4d06aa2d-e95d-46de-a536-7c191804f0de",
  "subject": {
    "type": "CLIENT",
    "id": "9021ef1e-38eb-4b8f-83d3-713cbc02c3ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDIxZWYxZS0zOGViLTRiOGYtODNkMy03MTNjYmMwMmMzYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTcyLCJpYXQiOjE3OTMzNTQyNzIsImp0aSI6ImQxOTA5Mjc1LTFmZDYtNDkzNi1iODFjLTgzYTllZjJiNjRlNyIsInNpZCI6IjRkMDZhYTJkLWU5NWQtNDZkZS1hNTM2LTdjMTkxODA0ZjBkZSJ9.2xUWR1m9MzvyO7on7IPhNla6ZpJ0cXtWSZAiypDkdJU",
  "access_expires_at": "2026-10-30T10:12:52.422887977Z",
  "refresh_token": "QVZFV6eW6EGxUarzo2DonLOCA8lGQ2eaRjelZfdAIiM",
  "refresh_expires_at": "2026-11-29T09:57:52.422062629Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "80f0601c-81ea-4e06-9255-b2841dd23f07",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "73a998a1-b57d-4139-b5a9-9c00c08a98aa",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-73a998a1-b57d-4139-b5a9-9c00c08a98aa",
    "orderDate": "1793354272",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "93ab940cea61832abb505d4ce41b7367",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=73a998a1-b57d-4139-b5a9-9c00c08a98aa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738910372"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=73a998a1-b57d-4139-b5a9-9c00c08a98aa",
  "created_at": "2026-10-30T09:57:52.710704Z",
  "expires_at": "2026-10-30T10:27:52.710704Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/73a998a1-b57d-4139-b5a9-9c00c08a98aa` → **200**

```json
{
  "id": "73a998a1-b57d-4139-b5a9-9c00c08a98aa",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:57:52.710704Z",
  "expires_at": "2026-10-30T10:27:52.710704Z",
  "completed_at": "2026-10-30T09:57:53.002959Z",
  "masked_pan": "41****5655",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9021ef1e-38eb-4b8f-83d3-713cbc02c3ac",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9021ef1e-38eb-4b8f-83d3-713cbc02c3ac",
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
      "id": "b3622b72-ef07-4f16-93ea-2aea70e04ce8",
      "at": "2026-10-30T09:57:53.737524Z",
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
  "client_id": "9021ef1e-38eb-4b8f-83d3-713cbc02c3ac",
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
      "id": "b3622b72-ef07-4f16-93ea-2aea70e04ce8",
      "at": "2026-10-30T09:57:53.737524Z",
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
  "device_ref": "sandbox-8956"
}
```

```json
{
  "challenge_id": "9736238d-1020-4b13-a2c1-284d79afd3e2",
  "expires_at": "2026-10-30T10:02:55.164767534Z",
  "resend_available_at": "2026-10-30T09:57:56.164767534Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "719821",
  "sent_at": "2026-10-30T09:57:55.167283669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9736238d-1020-4b13-a2c1-284d79afd3e2",
  "code": "719821",
  "device_ref": "sandbox-8956"
}
```

```json
{
  "session_id": "5bd52bb6-35b7-4468-ad4e-ed38d45cf95a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE3NSwiaWF0IjoxNzkzMzU0Mjc1LCJqdGkiOiIxNWRiY2JmNS03ZGNkLTQwNWYtYjY1NS0zOWYwOGI1M2JiYWQiLCJzaWQiOiI1YmQ1MmJiNi0zNWI3LTQ0NjgtYWQ0ZS1lZDM4ZDQ1Y2Y5NWEifQ.dYe9eYtNePNot12aMx-XnH6dHmBI_TSPMRTcG2Bax_M",
  "access_expires_at": "2026-10-30T10:12:55.487435582Z",
  "refresh_token": "FNpsFJfGTacoJIZ8VRBu4u2qLeqh5LpPGyaPFUBqQNY",
  "refresh_expires_at": "2026-11-29T09:57:55.486750679Z",
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
  "command_id": "efb4ec7a-a9de-430b-9fd0-41a7b0c4d7ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "0af6450b-0b9f-4c10-8306-d636426370fe",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0af6450b-0b9f-4c10-8306-d636426370fe",
    "orderDate": "1793354276",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "d03e5afd5fafb9f8a7602286fe679467",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0af6450b-0b9f-4c10-8306-d636426370fe",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0af6450b-0b9f-4c10-8306-d636426370fe",
  "created_at": "2026-10-30T09:57:56.052038Z",
  "expires_at": "2026-10-30T10:27:56.052038Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/0af6450b-0b9f-4c10-8306-d636426370fe` → **200**

```json
{
  "id": "0af6450b-0b9f-4c10-8306-d636426370fe",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:57:56.052038Z",
  "expires_at": "2026-10-30T10:27:56.052038Z",
  "completed_at": "2026-10-30T09:57:56.347051Z",
  "masked_pan": "41****1031",
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
      "id": "e7bdef95-cac1-4bd9-a22e-de69dc2cbb9e",
      "at": "2026-10-30T09:57:56.747897Z",
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
  "command_id": "05656803-6894-469a-9430-bf43dbf10606",
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
  "correlation_id": "99843179-ad8f-49cf-bef7-24769e6cc066"
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
  "device_ref": "sandbox-17625"
}
```

```json
{
  "challenge_id": "cf98e025-9b4c-4069-95bf-15eda96a7e71",
  "expires_at": "2026-10-30T10:02:58.519218922Z",
  "resend_available_at": "2026-10-30T09:57:59.519218922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "142399",
  "sent_at": "2026-10-30T09:57:58.521712985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf98e025-9b4c-4069-95bf-15eda96a7e71",
  "code": "142399",
  "device_ref": "sandbox-17625"
}
```

```json
{
  "session_id": "9e2c2cc5-0ead-42ec-afe4-1a8742fe2b58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE3OCwiaWF0IjoxNzkzMzU0Mjc4LCJqdGkiOiIwMjUxZTA4YS1kYjQxLTQ0YzEtODRkOC1mNTkzZGViMzRkMGUiLCJzaWQiOiI5ZTJjMmNjNS0wZWFkLTQyZWMtYWZlNC0xYTg3NDJmZTJiNTgifQ.RmaMVVE8tTNStsIAvlYxtUMn44SeasEC7jy7ZrTaujk",
  "access_expires_at": "2026-10-30T10:12:58.839181591Z",
  "refresh_token": "3lM93q-mHJ7p6zxo-AQ4MHzbQRQeKBXXuE0Jbcu0pec",
  "refresh_expires_at": "2026-11-29T09:57:58.838612877Z",
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
  "command_id": "a0c554d6-bb5d-45ff-a26e-a11d984f1183",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:57:59Z",
    "sequence": 1793354279398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a2d8a3ee-bdcc-4c53-a84a-21bedda1a194",
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
  "last_heartbeat_at": "2026-10-30T09:57:59.418686Z",
  "last_location_at": "2026-10-30T09:57:59.418686Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639538444",
  "device_ref": "sandbox-9815"
}
```

```json
{
  "challenge_id": "d4c43eff-9086-4c1b-823c-6a350677f2c5",
  "expires_at": "2026-10-30T10:02:59.718477853Z",
  "resend_available_at": "2026-10-30T09:58:00.718477853Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639538444` → **200**

```json
{
  "phone": "+380639538444",
  "audience": "CLIENT",
  "code": "055289",
  "sent_at": "2026-10-30T09:57:59.721163298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4c43eff-9086-4c1b-823c-6a350677f2c5",
  "code": "055289",
  "device_ref": "sandbox-9815"
}
```

```json
{
  "session_id": "6f24664a-6f8b-4a98-ace3-b53beb2cb95c",
  "subject": {
    "type": "CLIENT",
    "id": "5e08b6d9-9436-4092-9afe-8ab1b28235ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTA4YjZkOS05NDM2LTQwOTItOWFmZS04YWIxYjI4MjM1ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTgwLCJpYXQiOjE3OTMzNTQyODAsImp0aSI6ImYwZDdiNzUyLTc1YTgtNDVjYi04NzliLTIzMGFiODA1N2UzZCIsInNpZCI6IjZmMjQ2NjRhLTZmOGItNGE5OC1hY2UzLWI1M2JlYjJjYjk1YyJ9.io4HWPBbaE_8ixTWxrm1JKZJp_4JhByTYegnpyvxqfo",
  "access_expires_at": "2026-10-30T10:13:00.0400702Z",
  "refresh_token": "ATdeYkOCzZ7u7eWYn5PmcYf7zv3tttdgA0ay7HxGvaY",
  "refresh_expires_at": "2026-11-29T09:58:00.039373677Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b51acfbd-68d4-4b46-9e33-ef606fd14149",
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
  "id": "ed308bcc-8c08-4c91-9f16-61afa2e86947",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:00.340612Z",
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
  "command_id": "a7780969-af93-4a6f-a73d-39b0317c1fc4",
  "quote_id": "ed308bcc-8c08-4c91-9f16-61afa2e86947",
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
  "id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5e08b6d9-9436-4092-9afe-8ab1b28235ed",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:58:00.641223Z",
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
    "id": "edeee907-cded-47db-b1c2-c057816a5cf9",
    "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
    "expires_at": "2026-10-30T09:58:15.644589Z",
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

`POST /api/driver/v1/offers/edeee907-cded-47db-b1c2-c057816a5cf9/accept` → **200**

```json
{
  "command_id": "1134df08-dac9-4e32-aab3-ff7c474b1131"
}
```

```json
{
  "id": "19e35329-2fca-4124-a9c7-50a4495b73ef",
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1d3b8b11-f62b-49ed-ad21-4387d3303ba9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1d3b8b11-f62b-49ed-ad21-4387d3303ba9",
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "assignment_id": "19e35329-2fca-4124-a9c7-50a4495b73ef",
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

`POST /api/driver/v1/work-sessions/a2d8a3ee-bdcc-4c53-a84a-21bedda1a194/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:01Z",
    "sequence": 1793354281825
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a2d8a3ee-bdcc-4c53-a84a-21bedda1a194",
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
  "last_heartbeat_at": "2026-10-30T09:58:01.847538Z",
  "last_location_at": "2026-10-30T09:58:01.847538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1d3b8b11-f62b-49ed-ad21-4387d3303ba9/arrive` → **200**

```json
{
  "command_id": "2e0f5043-9c57-46cb-84c2-5acd35ea948d",
  "expected_version": 0
}
```

```json
{
  "id": "1d3b8b11-f62b-49ed-ad21-4387d3303ba9",
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "assignment_id": "19e35329-2fca-4124-a9c7-50a4495b73ef",
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
  "arrived_at": "2026-10-30T09:58:02.141965Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1d3b8b11-f62b-49ed-ad21-4387d3303ba9/start` → **200**

```json
{
  "command_id": "9d473d5e-25ab-49b6-a64e-69cc4b34ec31",
  "expected_version": 1
}
```

```json
{
  "id": "1d3b8b11-f62b-49ed-ad21-4387d3303ba9",
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "assignment_id": "19e35329-2fca-4124-a9c7-50a4495b73ef",
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
  "arrived_at": "2026-10-30T09:58:02.141965Z",
  "started_at": "2026-10-30T09:58:02.447189Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1d3b8b11-f62b-49ed-ad21-4387d3303ba9/complete` → **200**

```json
{
  "command_id": "fa4a935c-8c70-4bc7-b7ad-2ad01687f41d",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:58:02Z",
  "cash_received": false
}
```

```json
{
  "id": "1d3b8b11-f62b-49ed-ad21-4387d3303ba9",
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "assignment_id": "19e35329-2fca-4124-a9c7-50a4495b73ef",
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
  "arrived_at": "2026-10-30T09:58:02.141965Z",
  "started_at": "2026-10-30T09:58:02.447189Z",
  "completed_at": "2026-10-30T09:58:02.754145Z",
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
  "session_id": "d7f05d3f-da7c-4feb-ba87-df79c1d6bbc6",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxODMsImlhdCI6MTc5MzM1NDI4MywianRpIjoiMjhlMTQwYzAtZDg3MS00ZDQwLTk2YzQtM2Y4NTM5MmRiMWFkIiwic2lkIjoiZDdmMDVkM2YtZGE3Yy00ZmViLWJhODctZGY3OWMxZDZiYmM2In0.KwfVJcdPaGMBc5NZr-3GUwz50KGUcxFJcCnMUrKO9w8",
  "access_expires_at": "2026-10-30T10:13:03.418182522Z",
  "refresh_token": "JE-9PubPp-efOM45MPD2wlWXKJNdUle6py1quU4pl1k",
  "refresh_expires_at": "2026-10-30T21:58:03.417646978Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/67fedfaa-b74f-40e2-98fb-6b458ed61f38/cash-dispute` → **200**

```json
{
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5e08b6d9-9436-4092-9afe-8ab1b28235ed",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:58:02.816874Z",
  "decide_by": "2026-11-13T09:58:02.816874Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:58:02.816874Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "5e08b6d9-9436-4092-9afe-8ab1b28235ed",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:58:02.816874Z",
      "decide_by": "2026-11-13T09:58:02.816874Z",
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

`POST /api/admin/v1/orders/67fedfaa-b74f-40e2-98fb-6b458ed61f38/cash-dispute/decide` → **400**

```json
{
  "command_id": "80c1b2ee-463d-4727-b218-65e312b52cec",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/67fedfaa-b74f-40e2-98fb-6b458ed61f38/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3723385f-faf0-43ba-a655-771047e96f3f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/67fedfaa-b74f-40e2-98fb-6b458ed61f38/cash-dispute/decide` → **200**

```json
{
  "command_id": "8e46f699-d1b3-480f-9cf9-322480f70b32",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5e08b6d9-9436-4092-9afe-8ab1b28235ed",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:58:02.816874Z",
  "decide_by": "2026-11-13T09:58:02.816874Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:58:04.610017Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/67fedfaa-b74f-40e2-98fb-6b458ed61f38/cash-dispute/decide` → **409**

```json
{
  "command_id": "d35c707b-cfe7-40bd-92e8-39a793e8cec3",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/67fedfaa-b74f-40e2-98fb-6b458ed61f38/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "69907c94-4aa5-4bf4-bbbc-fc1a38f1834f"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a2d8a3ee-bdcc-4c53-a84a-21bedda1a194",
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
  "last_heartbeat_at": "2026-10-30T09:58:01.847538Z",
  "last_location_at": "2026-10-30T09:58:01.847538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a2d8a3ee-bdcc-4c53-a84a-21bedda1a194/close` → **200**

```json
{
  "command_id": "2d0356b4-a922-4ebe-827e-f75043978c32",
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
  "phone": "+380736317784",
  "device_ref": "sandbox-32312"
}
```

```json
{
  "challenge_id": "82a1acd3-297d-4fa4-977d-7d5616199649",
  "expires_at": "2026-10-30T10:03:05.779732273Z",
  "resend_available_at": "2026-10-30T09:58:06.779732273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736317784` → **200**

```json
{
  "phone": "+380736317784",
  "audience": "CLIENT",
  "code": "478245",
  "sent_at": "2026-10-30T09:58:05.782265246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82a1acd3-297d-4fa4-977d-7d5616199649",
  "code": "478245",
  "device_ref": "sandbox-32312"
}
```

```json
{
  "session_id": "f582119e-e2b3-4858-b8d9-1c999191bed2",
  "subject": {
    "type": "CLIENT",
    "id": "423e15a6-ee90-4cc3-8784-619cc9315c95"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjNlMTVhNi1lZTkwLTRjYzMtODc4NC02MTljYzkzMTVjOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MTg2LCJpYXQiOjE3OTMzNTQyODYsImp0aSI6IjFiNGZjMDIxLWZhYWItNGQ1NC1iMzhlLTgxODU3YTA1N2QyYyIsInNpZCI6ImY1ODIxMTllLWUyYjMtNDg1OC1iOGQ5LTFjOTk5MTkxYmVkMiJ9.A6ER_urxvYoY-lGS9hkU36zKpDyGmr5-rnDZWcxOLCk",
  "access_expires_at": "2026-10-30T10:13:06.094718752Z",
  "refresh_token": "iKGEQ7hHbxjQvDsR462gIiv1CswPimn-PomeFOcJGsI",
  "refresh_expires_at": "2026-11-29T09:58:06.094135211Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "736c8196-3726-409c-935e-2c5b6cbfc49d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7795d508-b172-43a2-81ab-52550d2526d3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7795d508-b172-43a2-81ab-52550d2526d3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f9ed6d12d07e5505164cd4eb674a8ad3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7795d508-b172-43a2-81ab-52550d2526d3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736317784"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7795d508-b172-43a2-81ab-52550d2526d3",
  "expires_at": "2026-10-30T10:28:06.384921Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/7795d508-b172-43a2-81ab-52550d2526d3` → **200**

```json
{
  "id": "7795d508-b172-43a2-81ab-52550d2526d3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:28:06.384921Z",
  "card": {
    "id": "35892492-5ad4-471a-adf3-ba4f5b4c1fc6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9029",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:58:06.678243Z"
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
  "device_ref": "sandbox-29273"
}
```

```json
{
  "challenge_id": "0de5c263-3adf-4b58-9cfa-c4770964c7f3",
  "expires_at": "2026-10-30T10:03:06.987229581Z",
  "resend_available_at": "2026-10-30T09:58:07.987229581Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "573124",
  "sent_at": "2026-10-30T09:58:06.989958217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0de5c263-3adf-4b58-9cfa-c4770964c7f3",
  "code": "573124",
  "device_ref": "sandbox-29273"
}
```

```json
{
  "session_id": "69219b35-354b-4938-86a3-ee23676e7f9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTE4NywiaWF0IjoxNzkzMzU0Mjg3LCJqdGkiOiI1MTgwMTEyYy04MzFhLTQzNTQtYTZhOS00ZmFhZmRlNGI2Y2IiLCJzaWQiOiI2OTIxOWIzNS0zNTRiLTQ5MzgtODZhMy1lZTIzNjc2ZTdmOWMifQ.-x1PBOOS0OemJjFZpg5AUMSAIdYb2KBVW85ZF_IIrxo",
  "access_expires_at": "2026-10-30T10:13:07.308492607Z",
  "refresh_token": "USYlxN3bBk271OdVaON7cUAC7FTSqCDAS4OyKDMY8PM",
  "refresh_expires_at": "2026-11-29T09:58:07.307763323Z",
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
  "command_id": "96a5991d-a6d7-4b24-88a8-ccc8b1093958",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:07Z",
    "sequence": 1793354287892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "322d27ae-e2be-4c0b-86bf-7ef6c9a3191a",
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
  "last_heartbeat_at": "2026-10-30T09:58:07.912752Z",
  "last_location_at": "2026-10-30T09:58:07.912752Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4125576-674f-4deb-af3a-52219c7536d4",
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
  "id": "ec49316b-e015-42cd-aec7-e156639558fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:08.210522Z",
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
  "command_id": "a0a14787-d3db-4b6a-a9e4-4001ecf03208",
  "quote_id": "ec49316b-e015-42cd-aec7-e156639558fa",
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
  "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
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
  "created_at": "2026-10-30T09:58:08.509882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666` → **200**

```json
{
  "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
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
  "created_at": "2026-10-30T09:58:08.509882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666` → **200**

```json
{
  "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
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
  "created_at": "2026-10-30T09:58:08.509882Z",
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
    "id": "621ec81c-ab60-4801-bf9f-f93800232cf9",
    "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
    "expires_at": "2026-10-30T09:58:23.867228Z",
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

`POST /api/driver/v1/offers/621ec81c-ab60-4801-bf9f-f93800232cf9/accept` → **200**

```json
{
  "command_id": "e28756fd-9edc-41a7-a767-0a5509893b9d"
}
```

```json
{
  "id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "assignment_id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
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

`POST /api/rider/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/messages` → **201**

```json
{
  "command_id": "362f53cc-fe4a-4839-8bb1-148daccf45b6",
  "body": "Я біля входу, мій номер +380736317784, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "6558a77c-92a2-4a6f-aca8-a87dc3bdf811",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380736317784, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:58:11.287880954Z"
}
```

`POST /api/driver/v1/trips/fafc1f63-84c8-4ce1-bdf1-b00e66701fe3/messages` → **201**

```json
{
  "command_id": "b2e969e3-84d1-4594-b9fd-54a1a8e69975",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "63264616-2b75-4ac1-9c6c-cef239940e94",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:58:11.578275017Z"
}
```

`POST /api/driver/v1/work-sessions/322d27ae-e2be-4c0b-86bf-7ef6c9a3191a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:11Z",
    "sequence": 1793354291850
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "322d27ae-e2be-4c0b-86bf-7ef6c9a3191a",
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
  "last_heartbeat_at": "2026-10-30T09:58:11.869588Z",
  "last_location_at": "2026-10-30T09:58:11.869588Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fafc1f63-84c8-4ce1-bdf1-b00e66701fe3/arrive` → **200**

```json
{
  "command_id": "5877b23b-bbca-40cc-b4c1-6979757a215b",
  "expected_version": 0
}
```

```json
{
  "id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "assignment_id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
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
  "arrived_at": "2026-10-30T09:58:12.164229Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fafc1f63-84c8-4ce1-bdf1-b00e66701fe3/start` → **200**

```json
{
  "command_id": "abe36bc3-3a0f-44c6-aad9-13beb0999b76",
  "expected_version": 1
}
```

```json
{
  "id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "assignment_id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
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
  "arrived_at": "2026-10-30T09:58:12.164229Z",
  "started_at": "2026-10-30T09:58:12.471543Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/322d27ae-e2be-4c0b-86bf-7ef6c9a3191a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:12Z",
    "sequence": 1793354292758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "322d27ae-e2be-4c0b-86bf-7ef6c9a3191a",
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
  "last_heartbeat_at": "2026-10-30T09:58:12.778959Z",
  "last_location_at": "2026-10-30T09:58:12.778959Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/fafc1f63-84c8-4ce1-bdf1-b00e66701fe3/complete` → **200**

```json
{
  "command_id": "5f61304e-6914-4459-8598-52350768fa5b",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:58:13Z",
  "cash_received": false
}
```

```json
{
  "id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "assignment_id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
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
  "arrived_at": "2026-10-30T09:58:12.164229Z",
  "started_at": "2026-10-30T09:58:12.471543Z",
  "completed_at": "2026-10-30T09:58:13.081682Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666` → **200**

```json
{
  "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
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
    "id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
    "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:58:08.509882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666` → **200**

```json
{
  "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
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
    "id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
    "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:58:08.509882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666` → **200**

```json
{
  "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
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
    "id": "4a264c8a-5885-4feb-ac91-f99e81d8ebef",
    "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fafc1f63-84c8-4ce1-bdf1-b00e66701fe3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:58:08.509882Z",
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
  "session_id": "322d27ae-e2be-4c0b-86bf-7ef6c9a3191a",
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
  "last_heartbeat_at": "2026-10-30T09:58:12.778959Z",
  "last_location_at": "2026-10-30T09:58:12.778959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/322d27ae-e2be-4c0b-86bf-7ef6c9a3191a/close` → **200**

```json
{
  "command_id": "af084582-8fec-4a04-8682-f192631b58fe",
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
  "session_id": "d698af27-dd63-4a85-b826-005093e71b16",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUxOTcsImlhdCI6MTc5MzM1NDI5NywianRpIjoiYzFjNjVkNTMtNzZiOS00NmFlLTk5YjAtNGUwODg0MGY1MGU1Iiwic2lkIjoiZDY5OGFmMjctZGQ2My00YTg1LWI4MjYtMDA1MDkzZTcxYjE2In0.ssLjG5GOfWYuAZcf8yWTFZ9935KsB9aZom9hh7vNm_A",
  "access_expires_at": "2026-10-30T10:13:17.183966369Z",
  "refresh_token": "3JE-BAr3HL7lJS0dlM0xUciMXTGOhHZvZkxIs6W0eHo",
  "refresh_expires_at": "2026-10-30T21:58:17.183402919Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "00a50116-f961-4aa4-a7dd-e14fcc6c6612"
}
```

`GET /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:58:17.762584502Z",
  "order": {
    "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
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
    "created_at": "2026-10-30T09:58:08.509882Z",
    "assigned_at": "2026-10-30T09:58:10.70826Z",
    "arrived_at": "2026-10-30T09:58:12.164229Z",
    "started_at": "2026-10-30T09:58:12.471543Z",
    "completed_at": "2026-10-30T09:58:13.081682Z"
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
    "id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
    "registered_at": "2026-10-30T09:58:06.092272Z",
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
      "created_at": "2026-10-30T09:58:08.512599Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:58:13.95062Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks` → **422**

```json
{
  "command_id": "0f904604-4999-4ec0-a131-0172e62dd829",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "42ec7c66-db9f-49fc-b412-1b3e6c2c6517"
}
```

`POST /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks` → **201**

```json
{
  "command_id": "9f66bdde-96f5-4321-8946-8d68e0803091",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "420d4244-c205-446c-a796-0a243f9bb709",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:58:18.425709Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks` → **201**

```json
{
  "command_id": "9f66bdde-96f5-4321-8946-8d68e0803091",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "420d4244-c205-446c-a796-0a243f9bb709",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:58:18.425709Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/423e15a6-ee90-4cc3-8784-619cc9315c95` → **200**

```json
{
  "client": {
    "id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
    "phone": "+380736317784",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:58:06.092272Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:58:08.509882Z",
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

`POST /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks/420d4244-c205-446c-a796-0a243f9bb709/resolve` → **200**

```json
{
  "command_id": "325b292a-df9f-4bf7-ab70-5518306c4e6f",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "420d4244-c205-446c-a796-0a243f9bb709",
  "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T09:58:18.425709Z",
  "resolved_at": "2026-10-30T09:58:19.375978Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/423e15a6-ee90-4cc3-8784-619cc9315c95` → **200**

```json
{
  "client": {
    "id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
    "phone": "+380736317784",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:58:06.092272Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:58:08.509882Z",
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

`GET /api/admin/v1/clients/423e15a6-ee90-4cc3-8784-619cc9315c95` → **200**

```json
{
  "client": {
    "id": "423e15a6-ee90-4cc3-8784-619cc9315c95",
    "phone": "+380736317784",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:58:06.092272Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:58:08.509882Z",
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

`POST /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks/420d4244-c205-446c-a796-0a243f9bb709/resolve` → **409**

```json
{
  "command_id": "a58d3b3b-5975-42e3-8126-55f5bd9bf807",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks/420d4244-c205-446c-a796-0a243f9bb709/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6ec93cc7-3390-4090-9fef-3152742dc5f5"
}
```

`GET /api/admin/v1/orders/7508539a-efd8-452f-a888-fb0e8e3d6666/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "420d4244-c205-446c-a796-0a243f9bb709",
      "order_id": "7508539a-efd8-452f-a888-fb0e8e3d6666",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T09:58:18.425709Z",
      "resolved_at": "2026-10-30T09:58:19.375978Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 7508539a-efd8-452f-a888-fb0e8e3d6666 without phone or card digits; chargeback 420d4244-c205-446c-a796-0a243f9bb709 recorded and won.

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
  "session_id": "22b3e404-93ed-4a49-a8df-0eaaf97c958a",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMDIsImlhdCI6MTc5MzM1NDMwMiwianRpIjoiMGU2OTJjMzUtYzFjMy00MTBiLTlkYzktMTQ4NWFkMTI4MTI4Iiwic2lkIjoiMjJiM2U0MDQtOTNlZC00YTQ5LWE4ZGYtMGVhYWY5N2M5NThhIn0.uQbtEEUPTyP0llSJwpXG6Pt6eroSlVFuzdsHzl9MUqQ",
  "access_expires_at": "2026-10-30T10:13:22.517034538Z",
  "refresh_token": "WbgejFhQr73QOzCiAAZZW5sKcLihju-v9iIYF1Q6zmw",
  "refresh_expires_at": "2026-10-30T21:58:22.516494962Z",
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
  "phone": "+48600272281",
  "device_ref": "sandbox-16551"
}
```

```json
{
  "challenge_id": "7b9a3923-dc07-46c3-84f8-b4db7492b4df",
  "expires_at": "2026-10-30T10:03:23.387527103Z",
  "resend_available_at": "2026-10-30T09:58:24.387527103Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600272281` → **200**

```json
{
  "phone": "+48600272281",
  "audience": "CLIENT",
  "code": "153887",
  "sent_at": "2026-10-30T09:58:23.389949465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b9a3923-dc07-46c3-84f8-b4db7492b4df",
  "code": "153887",
  "device_ref": "sandbox-16551"
}
```

```json
{
  "session_id": "35c54b64-96ef-44a1-b0b8-a6a450cbadce",
  "subject": {
    "type": "CLIENT",
    "id": "138dc306-9a46-46b5-b352-c0c0d946c7db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzhkYzMwNi05YTQ2LTQ2YjUtYjM1Mi1jMGMwZDk0NmM3ZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjAzLCJpYXQiOjE3OTMzNTQzMDMsImp0aSI6IjcxZDk5ZTAzLWNiNzQtNGJjYy04ZTA2LWViZWRiMDI3MWNiZCIsInNpZCI6IjM1YzU0YjY0LTk2ZWYtNDRhMS1iMGI4LWE2YTQ1MGNiYWRjZSJ9.eYWDA5Q0vnHixEeoyQI3xxDJblBF99Zi6HEsu_4kiNM",
  "access_expires_at": "2026-10-30T10:13:23.698954276Z",
  "refresh_token": "JohL0uSzZYCFc2d0WGos-V_1rgbhMImD-b3YFqJ-B84",
  "refresh_expires_at": "2026-11-29T09:58:23.69843076Z",
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
  "command_id": "60c83db4-0a24-4d79-bb5e-e9ed8b396984",
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
  "correlation_id": "45282184-5f93-4b1d-87bf-ae24f0eee813",
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
  "command_id": "8c8c26c4-23bc-465f-9b89-a9b1b5551760",
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
  "paused_at": "2026-10-30T09:58:24.887750129Z",
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
  "command_id": "2055be06-a4a5-4552-9af3-7e8eecf0cc8a",
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
  "id": "e5e49ed1-e6de-4e6a-ab18-71cce8dc5f5e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:25.488031Z",
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
  "command_id": "00c0a829-d440-4f2d-ae18-f44115704cb2",
  "quote_id": "e5e49ed1-e6de-4e6a-ab18-71cce8dc5f5e",
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
  "correlation_id": "ab947841-4e7d-468e-a297-5faca22a53db"
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
  "paused_at": "2026-10-30T09:58:24.88775Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "a0044040-91db-40c0-b0dd-948841901f17",
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
  "command_id": "d9c0b343-42a5-4de2-970a-ed7a58ba77e3",
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
  "command_id": "69a03714-7cb7-4e86-9d35-3d325a629964",
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
  "id": "1d6fd1a8-cd5d-4902-bbb7-a62fecfcde7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:27.243647Z",
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
  "command_id": "76822523-ed14-433a-aa23-4ba0ac22cce7",
  "quote_id": "1d6fd1a8-cd5d-4902-bbb7-a62fecfcde7c",
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
  "correlation_id": "ebeddb95-d217-46d6-9c55-4ce94e7b1993"
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
  "command_id": "25e2c3db-e813-4484-9d2a-b4d9731c753c",
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
  "command_id": "a0cc6244-e4a4-4e7c-b73d-86f3056643d1",
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
  "id": "2d9a5aeb-43cd-4d76-bcd6-225e657a09c6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:28.432568Z",
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
  "command_id": "86d16c03-77e6-45a2-9dd0-85a88d1735a2",
  "quote_id": "2d9a5aeb-43cd-4d76-bcd6-225e657a09c6",
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
  "correlation_id": "79242842-2378-47d2-8c19-b8b27f16c71d"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "b8c739c7-c2f8-41d1-ba27-ccf675c9828a",
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
  "correlation_id": "00f8c6f8-c4ca-4e25-bd1d-5c8d014d1df6"
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
  "command_id": "0e7997a6-0a71-459b-ac21-17d55dce31b3",
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
  "phone": "+380673232180",
  "device_ref": "sandbox-20794"
}
```

```json
{
  "challenge_id": "d99742bb-872c-4d79-86b1-35eea45cd445",
  "expires_at": "2026-10-30T10:03:29.924269982Z",
  "resend_available_at": "2026-10-30T09:58:30.924269982Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673232180` → **200**

```json
{
  "phone": "+380673232180",
  "audience": "CLIENT",
  "code": "324548",
  "sent_at": "2026-10-30T09:58:29.92820504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d99742bb-872c-4d79-86b1-35eea45cd445",
  "code": "324548",
  "device_ref": "sandbox-20794"
}
```

```json
{
  "session_id": "13d2fe18-d977-4ff3-b861-3712beb87b6a",
  "subject": {
    "type": "CLIENT",
    "id": "ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTZjZTBlYS04YzkwLTQ4ZDYtYTUzZS0yZjM4M2QyZmRjZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjEwLCJpYXQiOjE3OTMzNTQzMTAsImp0aSI6ImVmMGRmMjhiLWY0MTgtNGIwNC05MDQxLTA3MjMwYWI1YmEwMyIsInNpZCI6IjEzZDJmZTE4LWQ5NzctNGZmMy1iODYxLTM3MTJiZWI4N2I2YSJ9.VY_nHeYf5GO6Lb6Q0EA0F3gBJ9FH4Amta-5NRL5Im8w",
  "access_expires_at": "2026-10-30T10:13:30.245782949Z",
  "refresh_token": "W1QNDWf-l7TkFuWvBSlcj5t-I1YTCdNricWZL8Ek5kM",
  "refresh_expires_at": "2026-11-29T09:58:30.245190499Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee",
  "session_id": "13d2fe18-d977-4ff3-b861-3712beb87b6a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "694ebe65-8dc5-4717-8f64-a6e1fbf586d6",
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
  "id": "afa309d2-35bf-4656-b6a0-1b5231c31318",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:30.814152Z",
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
  "challenge_id": "d369cf0d-e8b1-4e50-a8db-cf5fbc8b3979",
  "expires_at": "2026-10-30T10:03:33.11317893Z",
  "resend_available_at": "2026-10-30T09:58:34.11317893Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673232180` → **200**

```json
{
  "phone": "+380673232180",
  "audience": "CLIENT",
  "code": "646805",
  "sent_at": "2026-10-30T09:58:33.115958147Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "3749b872-de1a-46a9-8fd7-2683fab552cc",
  "challenge_id": "d369cf0d-e8b1-4e50-a8db-cf5fbc8b3979",
  "otp_code": "646805"
}
```

```json
{
  "client_id": "ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:58:33.438830411Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "7ad23039-b636-4c9c-962b-2280f2559a51",
  "quote_id": "afa309d2-35bf-4656-b6a0-1b5231c31318",
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
  "correlation_id": "988e76ba-7227-4dbe-9b9d-6ec11bc2ee24"
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
  "session_id": "2fa16ee9-6488-47d1-bbf1-ddb5916fd6a4",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMTQsImlhdCI6MTc5MzM1NDMxNCwianRpIjoiYjBkZjljMDItNzZmOC00YzExLThiZTMtZTdmZmU4ZmUxNWJhIiwic2lkIjoiMmZhMTZlZTktNjQ4OC00N2QxLWJiZjEtZGRiNTkxNmZkNmE0In0.XSNqttgez5OMtEd9V07seF77GfzRAKK16SW5TAluJZQ",
  "access_expires_at": "2026-10-30T10:13:34.354208886Z",
  "refresh_token": "mteGRdcSoa9-XCPFgcelshR3k9gVz3knFZ7IDYxqqRQ",
  "refresh_expires_at": "2026-10-30T21:58:34.353671059Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:58:33.43883Z",
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

`POST /api/admin/v1/client-deletions/ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee/complete` → **200**

```json
{
  "command_id": "588eeec0-c463-4e07-abc1-7b43da54631e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee",
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
  "correlation_id": "5d9761f6-8bf6-4e36-bcce-ff36b4aca243"
}
```

Done: client ba6ce0ea-8c90-48d6-a53e-2f383d2fdcee anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669826329",
  "device_ref": "sandbox-3580"
}
```

```json
{
  "challenge_id": "4b107261-5b3b-45ad-ac94-5abf02eda96b",
  "expires_at": "2026-10-30T10:03:35.521606239Z",
  "resend_available_at": "2026-10-30T09:58:36.521606239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669826329` → **200**

```json
{
  "phone": "+380669826329",
  "audience": "CLIENT",
  "code": "088606",
  "sent_at": "2026-10-30T09:58:35.524366778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b107261-5b3b-45ad-ac94-5abf02eda96b",
  "code": "088606",
  "device_ref": "sandbox-3580"
}
```

```json
{
  "session_id": "452ee0c2-e391-4875-a40e-9faa692f002c",
  "subject": {
    "type": "CLIENT",
    "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjViYjMxYy01NmMyLTQ2YjgtYTk0My1lNjViYWU4YTQ3Y2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjE1LCJpYXQiOjE3OTMzNTQzMTUsImp0aSI6ImRjYzZlNmVlLTgwOGUtNDI0NS04ZDFmLWVmMWU3NGZiZjM4OCIsInNpZCI6IjQ1MmVlMGMyLWUzOTEtNDg3NS1hNDBlLTlmYWE2OTJmMDAyYyJ9.GL_L74WmhlVrCzdi1XWHlBFNoAKtCManChF9Df9Ixmc",
  "access_expires_at": "2026-10-30T10:13:35.829699005Z",
  "refresh_token": "OrgJ_ZihCkqfkKAs9aqWdC15_8vZqzbrLWg_p-o8IRw",
  "refresh_expires_at": "2026-11-29T09:58:35.828620175Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
  "session_id": "452ee0c2-e391-4875-a40e-9faa692f002c",
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
  "session_id": "48b6fd04-8e95-4fce-b80c-d64c95ef6492",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMTYsImlhdCI6MTc5MzM1NDMxNiwianRpIjoiZDAzOGFmYjMtNDVhZS00N2VkLTgyZGYtYTUxMWFmN2E0ZDdlIiwic2lkIjoiNDhiNmZkMDQtOGU5NS00ZmNlLWI4MGMtZDY0Yzk1ZWY2NDkyIn0.jchHPFeiizdKViY0ann0d3gBvgheLOc0kAhcigwK66k",
  "access_expires_at": "2026-10-30T10:13:36.730526468Z",
  "refresh_token": "w3S4Q9lLWK5RFWjL2KawcAQnpo_ukxqyFn03t99yAg0",
  "refresh_expires_at": "2026-10-30T21:58:36.729820106Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9826329&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
      "phone": "+380669826329",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:58:35.826554Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/965bb31c-56c2-46b8-a943-e65bae8a47cc` → **200**

```json
{
  "client": {
    "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
    "phone": "+380669826329",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:58:35.826554Z",
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

`POST /api/admin/v1/clients/965bb31c-56c2-46b8-a943-e65bae8a47cc/block` → **400**

```json
{
  "command_id": "2e7ef548-614c-4382-b36f-05faafe5a242",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/965bb31c-56c2-46b8-a943-e65bae8a47cc/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "85ed8e12-ca77-4670-bb0f-72757f34a2fc",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/965bb31c-56c2-46b8-a943-e65bae8a47cc/block` → **200**

```json
{
  "command_id": "90cf39f6-ba85-4240-9f71-252a1c49842b",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
  "phone": "+380669826329",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:58:35.826554Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:58:37.962112Z",
    "by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
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
  "correlation_id": "9dd3945b-fb0d-47ab-8688-1fde65d53aeb"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669826329",
  "device_ref": "sandbox-3134"
}
```

```json
{
  "challenge_id": "c9e3be20-04b5-434a-be8d-da0f8bc7ddc0",
  "expires_at": "2026-10-30T10:03:40.543636515Z",
  "resend_available_at": "2026-10-30T09:58:41.543636515Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669826329` → **200**

```json
{
  "phone": "+380669826329",
  "audience": "CLIENT",
  "code": "012268",
  "sent_at": "2026-10-30T09:58:40.546323562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c9e3be20-04b5-434a-be8d-da0f8bc7ddc0",
  "code": "012268",
  "device_ref": "sandbox-3134"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "10e2fb24-e018-4d1d-acad-fe81bc778c98"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/965bb31c-56c2-46b8-a943-e65bae8a47cc` → **200**

```json
{
  "client": {
    "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
    "phone": "+380669826329",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:58:35.826554Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:58:37.962112Z",
      "by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
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

`POST /api/admin/v1/clients/965bb31c-56c2-46b8-a943-e65bae8a47cc/unblock` → **200**

```json
{
  "command_id": "61c1d3b2-d824-4ade-8551-4fb9e16ed3d0",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
  "phone": "+380669826329",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:58:35.826554Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669826329",
  "device_ref": "sandbox-11019"
}
```

```json
{
  "challenge_id": "238f4796-278a-401a-9e0c-14ac8fd26882",
  "expires_at": "2026-10-30T10:03:43.787191975Z",
  "resend_available_at": "2026-10-30T09:58:44.787191975Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669826329` → **200**

```json
{
  "phone": "+380669826329",
  "audience": "CLIENT",
  "code": "830046",
  "sent_at": "2026-10-30T09:58:43.789584067Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "238f4796-278a-401a-9e0c-14ac8fd26882",
  "code": "830046",
  "device_ref": "sandbox-11019"
}
```

```json
{
  "session_id": "578fab68-298e-4d39-bc6f-11358362287f",
  "subject": {
    "type": "CLIENT",
    "id": "965bb31c-56c2-46b8-a943-e65bae8a47cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjViYjMxYy01NmMyLTQ2YjgtYTk0My1lNjViYWU4YTQ3Y2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjI0LCJpYXQiOjE3OTMzNTQzMjQsImp0aSI6ImRhMWYxZmRmLTUzNTYtNDM2NC1hMzkzLTM4YTY1NjYyOGM1ZSIsInNpZCI6IjU3OGZhYjY4LTI5OGUtNGQzOS1iYzZmLTExMzU4MzYyMjg3ZiJ9.Aqs91DP-7FIBg9pE7otqLdfv3Ml0-0krl8bIQEwXjOM",
  "access_expires_at": "2026-10-30T10:13:44.102647367Z",
  "refresh_token": "s0TC53ilUTzYIpnq9WeK5wm5ZgUGkszHuLH70WM0J5s",
  "refresh_expires_at": "2026-11-29T09:58:44.102118147Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "965bb31c-56c2-46b8-a943-e65bae8a47cc",
  "session_id": "578fab68-298e-4d39-bc6f-11358362287f",
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
  "phone": "+380662320695",
  "device_ref": "sandbox-7742"
}
```

```json
{
  "challenge_id": "b17c654f-25ad-45b2-9c17-1bfb6fc3bb81",
  "expires_at": "2026-10-30T10:03:44.679138806Z",
  "resend_available_at": "2026-10-30T09:58:45.679138806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662320695` → **200**

```json
{
  "phone": "+380662320695",
  "audience": "CLIENT",
  "code": "025059",
  "sent_at": "2026-10-30T09:58:44.681728006Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b17c654f-25ad-45b2-9c17-1bfb6fc3bb81",
  "code": "025059",
  "device_ref": "sandbox-7742"
}
```

```json
{
  "session_id": "045a13c4-582d-41a1-910b-a3f2b1f185aa",
  "subject": {
    "type": "CLIENT",
    "id": "9410fdd1-4dd3-404d-ba57-109bd7f9b188"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDEwZmRkMS00ZGQzLTQwNGQtYmE1Ny0xMDliZDdmOWIxODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjI0LCJpYXQiOjE3OTMzNTQzMjQsImp0aSI6IjBkMDZlODgzLTZhNmQtNDRkMy05ZmY2LTAwYzZiYzhjZDg4NCIsInNpZCI6IjA0NWExM2M0LTU4MmQtNDFhMS05MTBiLWEzZjJiMWYxODVhYSJ9.Rsf3dED25hgR4Cajk6leubXK0-yQlPW1xGKANcQXqQk",
  "access_expires_at": "2026-10-30T10:13:44.994567813Z",
  "refresh_token": "JU83pNcOrdUK5lTZTjRsuvkPciE0DYmEkVdwcJLsAQU",
  "refresh_expires_at": "2026-11-29T09:58:44.993937811Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c49809fe-ea4a-404d-b190-66dc1869da9f",
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
  "id": "0aa85242-6f96-4108-8979-eeba51e7121b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:03:45.290341Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: af7aa75a-b976-43d7-a477-1c4d968154e3) → **201**

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
  "session_id": "f0ec5e60-5e9e-4a1e-9b6b-d34d6325b8f9",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMjUsImlhdCI6MTc5MzM1NDMyNSwianRpIjoiYzEyZDIzNzMtNjdjYi00YTQ0LWFiOWEtYzFmYWUyZjA3MWM4Iiwic2lkIjoiZjBlYzVlNjAtNWU5ZS00YTFlLTliNmItZDM0ZDYzMjViOGY5In0.i5WVew_cAU4xDBOcY-PuHrVKenAx5hiQJ4uVZy3vBnc",
  "access_expires_at": "2026-10-30T10:13:45.963620379Z",
  "refresh_token": "7F5T1FYRipFSGLtnuamtEe6h0sZVRQcFHvdUjxtmfc0",
  "refresh_expires_at": "2026-10-30T21:58:45.963061355Z",
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
  "session_id": "89d824bb-f7ee-426c-b0fb-89d58a0c2e0b",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMjYsImlhdCI6MTc5MzM1NDMyNiwianRpIjoiNjFmOTljYTUtNDFlOC00MTY5LTk4YzYtYmFmOGIwNzk4N2UyIiwic2lkIjoiODlkODI0YmItZjdlZS00MjZjLWIwZmItODlkNThhMGMyZTBiIn0.VoDvGvne50FDVMn__vkcEnbrpJ3OXjEs_Cs7cmkCwFo",
  "access_expires_at": "2026-10-30T10:13:46.583777324Z",
  "refresh_token": "EZKQfNN7P4FyIgHicLOwlhoPFQOYLryqPjRNRenZBoE",
  "refresh_expires_at": "2026-10-30T21:58:46.583210889Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:58:45.594001Z",
      "actor": {
        "type": "CLIENT",
        "id": "9410fdd1-4dd3-404d-ba57-109bd7f9b188",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
        "quote_id": "0aa85242-6f96-4108-8979-eeba51e7121b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "af7aa75a-b976-43d7-a477-1c4d968154e3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:58:45.596199Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
        "attempt_id": "49f8b824-b4a2-43b0-a3bd-d1646ee5ee97",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "af7aa75a-b976-43d7-a477-1c4d968154e3"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:58:45.602692Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
        "attempt_id": "49f8b824-b4a2-43b0-a3bd-d1646ee5ee97"
      },
      "correlation_id": "af7aa75a-b976-43d7-a477-1c4d968154e3"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "49f8b824-b4a2-43b0-a3bd-d1646ee5ee97",
        "generation": 1,
        "started_at": "2026-10-30T09:58:45.59525Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:58:45.602692Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:58:45.596944Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/af7aa75a-b976-43d7-a477-1c4d968154e3` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab:0",
      "order_id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
      "at": "2026-10-30T09:58:45.594001Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab:1",
      "order_id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
      "at": "2026-10-30T09:58:45.596199Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab:2",
      "order_id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
      "at": "2026-10-30T09:58:45.602692Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/b00a7a12-ac1a-47ac-8862-f6470d4fce38` → **200**

```json
{
  "found": []
}
```

Done: request af7aa75a-b976-43d7-a477-1c4d968154e3 — order 797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab found by its id.

`GET /api/rider/v1/orders/797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab` → **200**

```json
{
  "id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9410fdd1-4dd3-404d-ba57-109bd7f9b188",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:58:45.593458Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab/cancel` → **200**

```json
{
  "command_id": "f1b0330d-943f-4f68-b26f-3206315c3a0d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "797c17a3-a3f8-4c74-a6f5-96e3a17cf8ab",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9410fdd1-4dd3-404d-ba57-109bd7f9b188",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:58:45.593458Z",
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
  "phone": "+380638656458",
  "device_ref": "sandbox-894"
}
```

```json
{
  "challenge_id": "a7ee6529-9e01-4712-a50e-d80d030b6885",
  "expires_at": "2026-10-30T10:03:48.376150757Z",
  "resend_available_at": "2026-10-30T09:58:49.376150757Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638656458` → **200**

```json
{
  "phone": "+380638656458",
  "audience": "CLIENT",
  "code": "119290",
  "sent_at": "2026-10-30T09:58:48.378671006Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7ee6529-9e01-4712-a50e-d80d030b6885",
  "code": "119290",
  "device_ref": "sandbox-894"
}
```

```json
{
  "session_id": "27040475-76ab-446c-9d62-b3b7e201fec3",
  "subject": {
    "type": "CLIENT",
    "id": "07763e32-671d-4164-b8c8-f2785480b994"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzc2M2UzMi02NzFkLTQxNjQtYjhjOC1mMjc4NTQ4MGI5OTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjI4LCJpYXQiOjE3OTMzNTQzMjgsImp0aSI6Ijg1MDg4NGUxLTEyZjItNDQ0NC04ZjM5LTBjNjI0NjgyOTEyZCIsInNpZCI6IjI3MDQwNDc1LTc2YWItNDQ2Yy05ZDYyLWIzYjdlMjAxZmVjMyJ9.bbRCQiUf3yL5wE0jD4w1BHzuervvp912YyeV1uyz69U",
  "access_expires_at": "2026-10-30T10:13:48.683489392Z",
  "refresh_token": "UO4VdJmSnTnIeTcMEX6Vs3EU9Qkz0C55qvc1pIi1uoo",
  "refresh_expires_at": "2026-11-29T09:58:48.682915086Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ecbc418f-a6bc-4dea-a5af-f4bca109a6ec",
  "expires_at": "2026-10-30T10:03:50.963148493Z",
  "resend_available_at": "2026-10-30T09:58:51.963148493Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638656458` → **200**

```json
{
  "phone": "+380638656458",
  "audience": "CLIENT",
  "code": "151495",
  "sent_at": "2026-10-30T09:58:50.965340766Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "7b69f565-757b-4010-9216-c9e7b7c9b477",
  "challenge_id": "ecbc418f-a6bc-4dea-a5af-f4bca109a6ec",
  "otp_code": "151495"
}
```

```json
{
  "id": "82926630-5d42-4113-962e-17ca984f18d3",
  "state": "PENDING",
  "created_at": "2026-10-30T09:58:51.284686Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/82926630-5d42-4113-962e-17ca984f18d3` → **200**

```json
{
  "id": "82926630-5d42-4113-962e-17ca984f18d3",
  "state": "PENDING",
  "created_at": "2026-10-30T09:58:51.284686Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/82926630-5d42-4113-962e-17ca984f18d3` → **200**

```json
{
  "id": "82926630-5d42-4113-962e-17ca984f18d3",
  "state": "READY",
  "created_at": "2026-10-30T09:58:51.284686Z",
  "ready_at": "2026-10-30T09:58:51.866636Z",
  "expires_at": "2026-11-06T09:58:51.866636Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/82926630-5d42-4113-962e-17ca984f18d3/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638504817",
  "device_ref": "sandbox-29523"
}
```

```json
{
  "challenge_id": "35d69161-adcb-40ec-b2fb-61f3b42790e0",
  "expires_at": "2026-10-30T10:03:53.172036712Z",
  "resend_available_at": "2026-10-30T09:58:54.172036712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638504817` → **200**

```json
{
  "phone": "+380638504817",
  "audience": "CLIENT",
  "code": "348792",
  "sent_at": "2026-10-30T09:58:53.174655414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35d69161-adcb-40ec-b2fb-61f3b42790e0",
  "code": "348792",
  "device_ref": "sandbox-29523"
}
```

```json
{
  "session_id": "36ae3d26-ef5e-4346-841e-e5fce8740365",
  "subject": {
    "type": "CLIENT",
    "id": "363cb661-86e6-4c5c-8e58-511e2e4c7ca6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNjNjYjY2MS04NmU2LTRjNWMtOGU1OC01MTFlMmU0YzdjYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjMzLCJpYXQiOjE3OTMzNTQzMzMsImp0aSI6ImI2ZjllMGM5LWZlZDYtNGU3OS1iOTY0LWY3MWQ1ZjBkMGFmMiIsInNpZCI6IjM2YWUzZDI2LWVmNWUtNDM0Ni04NDFlLWU1ZmNlODc0MDM2NSJ9.qQ4ZfKCprAs5uCQIWA0OlW4tvinTPHk8BkpRBC0NvBI",
  "access_expires_at": "2026-10-30T10:13:53.484159258Z",
  "refresh_token": "n3rbTBXV-lnWAHQrAgV4oakM7ofrbKPe7Jf1DM21QKU",
  "refresh_expires_at": "2026-11-29T09:58:53.483601581Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/82926630-5d42-4113-962e-17ca984f18d3/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/82926630-5d42-4113-962e-17ca984f18d3/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "712de000-3298-4816-aaf6-d3eaa029b5d3"
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
  "session_id": "85a6b823-fc7f-43f4-a684-d086f19781c9",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMzQsImlhdCI6MTc5MzM1NDMzNCwianRpIjoiZDE5NzQ0NDctZmMzZS00MzJjLWFiODktM2JkZWYxMzE2OTNiIiwic2lkIjoiODVhNmI4MjMtZmM3Zi00M2Y0LWE2ODQtZDA4NmYxOTc4MWM5In0.ejDtHkBJL4rzLz-7YR1k31pcAh0G15uZVmgJ3xehckc",
  "access_expires_at": "2026-10-30T10:13:54.389462253Z",
  "refresh_token": "lDoXO_EG1WwwJvqISPfpMCltWMDXkYZh81qUIjU-yNQ",
  "refresh_expires_at": "2026-10-30T21:58:54.388887726Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "07763e32-671d-4164-b8c8-f2785480b994",
  "session_id": "27040475-76ab-446c-9d62-b3b7e201fec3",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/07763e32-671d-4164-b8c8-f2785480b994/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "82926630-5d42-4113-962e-17ca984f18d3",
      "state": "READY",
      "created_at": "2026-10-30T09:58:51.284686Z",
      "ready_at": "2026-10-30T09:58:51.866636Z",
      "expires_at": "2026-11-06T09:58:51.866636Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-3172"
}
```

```json
{
  "challenge_id": "49e26bd5-dcb9-450a-a25c-1ace7293ffc1",
  "expires_at": "2026-10-30T10:03:55.257139645Z",
  "resend_available_at": "2026-10-30T09:58:56.257139645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "773638",
  "sent_at": "2026-10-30T09:58:55.259815739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49e26bd5-dcb9-450a-a25c-1ace7293ffc1",
  "code": "773638",
  "device_ref": "sandbox-3172"
}
```

```json
{
  "session_id": "d03a42b7-33fd-4750-8bf4-8752b36d8add",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTIzNSwiaWF0IjoxNzkzMzU0MzM1LCJqdGkiOiIwZTNjZDdkMi03OTk1LTQzOWYtODE1MS03ZjE5OTJhYWRiYzMiLCJzaWQiOiJkMDNhNDJiNy0zM2ZkLTQ3NTAtOGJmNC04NzUyYjM2ZDhhZGQifQ.KgrMvCdudOuCi1bcDHYz2Ne0rjhByZYb4q1SrDZ3EFc",
  "access_expires_at": "2026-10-30T10:13:55.572275544Z",
  "refresh_token": "rLI2lQKEaVfJgNS_pF7TD0PM35uPJN5Mu6-Gb2_J81g",
  "refresh_expires_at": "2026-11-29T09:58:55.571738233Z",
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
  "device_ref": "sandbox-4712"
}
```

```json
{
  "challenge_id": "abccc9f4-c60e-47ca-ad5f-d9179f39022d",
  "expires_at": "2026-10-30T10:03:56.138914892Z",
  "resend_available_at": "2026-10-30T09:58:57.138914892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "168834",
  "sent_at": "2026-10-30T09:58:56.141458969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abccc9f4-c60e-47ca-ad5f-d9179f39022d",
  "code": "168834",
  "device_ref": "sandbox-4712"
}
```

```json
{
  "session_id": "94836258-e73c-4f0f-81ca-9d5641c27101",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTIzNiwiaWF0IjoxNzkzMzU0MzM2LCJqdGkiOiJhYTczYTYxYi00YmFlLTRhN2QtYTE4ZC1hNzk5NGI1MGNjYzMiLCJzaWQiOiI5NDgzNjI1OC1lNzNjLTRmMGYtODFjYS05ZDU2NDFjMjcxMDEifQ.Mlvv6py_RWlNTT5ZCThhlLVfAFQTVlTL7uJWzEfvr30",
  "access_expires_at": "2026-10-30T10:13:56.454765281Z",
  "refresh_token": "Pqf5ZDcGAqn5xBFDbnFjnN_ZtFd_wojQeuLkdI_gStk",
  "refresh_expires_at": "2026-11-29T09:58:56.454009441Z",
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
  "command_id": "4c10440a-5edd-46b7-9cd7-305e9e714453",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:57Z",
    "sequence": 1793354337184
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c05434b0-f025-4c94-868f-c61fd68adb9d",
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
  "last_heartbeat_at": "2026-10-30T09:58:57.038903Z",
  "last_location_at": "2026-10-30T09:58:57.038903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26511"
}
```

```json
{
  "challenge_id": "d278242c-8a0d-4d69-8587-66432c67a7b5",
  "expires_at": "2026-10-30T10:03:57.327451212Z",
  "resend_available_at": "2026-10-30T09:58:58.327451212Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "574594",
  "sent_at": "2026-10-30T09:58:57.32983708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d278242c-8a0d-4d69-8587-66432c67a7b5",
  "code": "574594",
  "device_ref": "sandbox-26511"
}
```

```json
{
  "session_id": "aa815999-ec80-4dc0-b81f-80f345442ea0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTIzNywiaWF0IjoxNzkzMzU0MzM3LCJqdGkiOiIxNTU5MjdhNi1jN2JkLTRjYTUtOTdhMi00MjE2MjZlMTdhMDgiLCJzaWQiOiJhYTgxNTk5OS1lYzgwLTRkYzAtYjgxZi04MGYzNDU0NDJlYTAifQ.BZAX0hDSVN5Chc-HZtYaBxgF9NmMNmGrDDfHoeG-W5c",
  "access_expires_at": "2026-10-30T10:13:57.640948251Z",
  "refresh_token": "I5LnbQC5UlvdMrJDbzwq33wvX_dFJuw6rHI0hlCafls",
  "refresh_expires_at": "2026-11-29T09:58:57.640152481Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "17a9ab40-0289-46af-99cf-5873a04e8346",
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
  "last_heartbeat_at": "2026-10-30T09:57:25.403279Z",
  "last_location_at": "2026-10-30T09:57:25.403279Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/17a9ab40-0289-46af-99cf-5873a04e8346/handover` → **200**

```json
{
  "command_id": "0e8f0421-1d52-460c-902c-9e879ae7b22d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "17a9ab40-0289-46af-99cf-5873a04e8346",
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
  "last_heartbeat_at": "2026-10-30T09:57:25.403279Z",
  "last_location_at": "2026-10-30T09:57:25.403279Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/17a9ab40-0289-46af-99cf-5873a04e8346/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:58:58Z",
    "sequence": 1793354338502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "17a9ab40-0289-46af-99cf-5873a04e8346",
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
  "last_heartbeat_at": "2026-10-30T09:58:58.521665Z",
  "last_location_at": "2026-10-30T09:58:58.521665Z",
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
  "session_id": "bf8814ce-dd0d-4b9b-9aa5-efd71cec1efa",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMzksImlhdCI6MTc5MzM1NDMzOSwianRpIjoiMjljOTU3ZjctMmU1My00ZTA5LWIxZDAtOTU2ZDhlZDdiNmI3Iiwic2lkIjoiYmY4ODE0Y2UtZGQwZC00YjliLTlhYTUtZWZkNzFjZWMxZWZhIn0.FY3fKRpefVRurep15y3YXbWi2arFrpSLg14amTa4eKs",
  "access_expires_at": "2026-10-30T10:13:59.141794365Z",
  "refresh_token": "d41S7_8rpo6hsEge9uPD0ggkT-j1VErSf2qAN65o9MY",
  "refresh_expires_at": "2026-10-30T21:58:59.141228642Z",
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
  "session_id": "6e6a7bf2-df89-4fb5-a9c0-60a9e0314a67",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyMzksImlhdCI6MTc5MzM1NDMzOSwianRpIjoiNjk2YTZiNTEtNTgxNC00N2ZjLWI3OGYtNmMyN2E2NGZhYWY3Iiwic2lkIjoiNmU2YTdiZjItZGY4OS00ZmI1LWE5YzAtNjBhOWUwMzE0YTY3In0.LhAwf_iZ6rNWlqmWDZ3iplDT-1wEukiPhGu93n0fWgM",
  "access_expires_at": "2026-10-30T10:13:59.764199498Z",
  "refresh_token": "BPeKoQTkvDgU0c87RtNKhBxyXGCdeV3olCrMEdYFpkE",
  "refresh_expires_at": "2026-10-30T21:58:59.763448866Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683398182",
  "device_ref": "sandbox-12861"
}
```

```json
{
  "challenge_id": "d7b560b1-296c-41b7-81fc-8d1ed63f88f9",
  "expires_at": "2026-10-30T10:04:00.048345243Z",
  "resend_available_at": "2026-10-30T09:59:01.048345243Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683398182` → **200**

```json
{
  "phone": "+380683398182",
  "audience": "CLIENT",
  "code": "984967",
  "sent_at": "2026-10-30T09:59:00.050900897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7b560b1-296c-41b7-81fc-8d1ed63f88f9",
  "code": "984967",
  "device_ref": "sandbox-12861"
}
```

```json
{
  "session_id": "eb4a4b41-a581-45de-9101-1ae491b8c1c8",
  "subject": {
    "type": "CLIENT",
    "id": "3273f687-859d-4e08-ae02-3bacf7658f60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjczZjY4Ny04NTlkLTRlMDgtYWUwMi0zYmFjZjc2NThmNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjQwLCJpYXQiOjE3OTMzNTQzNDAsImp0aSI6ImI3OTIyYTBjLTJmMjAtNDZlMy04YjdlLWFjMWY4ZDg3YWZhNCIsInNpZCI6ImViNGE0YjQxLWE1ODEtNDVkZS05MTAxLTFhZTQ5MWI4YzFjOCJ9.H7gHtNri4z6-mXSmrmEsHpuf5SHb7wDm1W0yzV4W4xg",
  "access_expires_at": "2026-10-30T10:14:00.375156597Z",
  "refresh_token": "VHzG01MQeFHYuArIoL5GpXbNF-d2kHuJO4IFW8UsXXY",
  "refresh_expires_at": "2026-11-29T09:59:00.374603843Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d75ad61-eea8-45c0-a4bd-29d8d9ac77f4",
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
  "id": "07a5348c-dd6d-4c13-bdbe-ed2d1812bf75",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:00.674823Z",
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
  "command_id": "828ba8b3-0586-49b5-b649-f12ea103712f",
  "quote_id": "07a5348c-dd6d-4c13-bdbe-ed2d1812bf75",
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
  "id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3273f687-859d-4e08-ae02-3bacf7658f60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:59:00.979592Z",
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
    "id": "6516afff-6a7f-4b26-aa0b-17bc20481508",
    "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
    "expires_at": "2026-10-30T09:59:15.983885Z",
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

`POST /api/driver/v1/offers/6516afff-6a7f-4b26-aa0b-17bc20481508/reject` → **204**

```json
{
  "command_id": "f34590fd-b4d7-4fc4-92b5-d0b5be271c81"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5ec72d57-5078-4a1c-9cef-9576758995b8",
    "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
    "expires_at": "2026-10-30T09:59:16.596055Z",
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

`POST /api/driver/v1/offers/5ec72d57-5078-4a1c-9cef-9576758995b8/accept` → **200**

```json
{
  "command_id": "1bf4cbb1-6092-40d3-9cbb-44e08a487d4a"
}
```

```json
{
  "id": "6c3fad8f-d253-4078-8aeb-0a2ecf8daa33",
  "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6a7173e9-5fed-40c9-904e-31aad1cff6db",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/57c0004d-8cb8-446e-9cab-49bc7d93a904/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:59:00.980429Z",
      "actor": {
        "type": "CLIENT",
        "id": "3273f687-859d-4e08-ae02-3bacf7658f60",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
        "quote_id": "07a5348c-dd6d-4c13-bdbe-ed2d1812bf75",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c532a269-7723-4c51-ad21-e3da2242b185"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:59:00.98293Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
        "attempt_id": "580abcca-2b1d-4a53-9f81-819f9ee1b0bc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c532a269-7723-4c51-ad21-e3da2242b185"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:59:00.990371Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6516afff-6a7f-4b26-aa0b-17bc20481508",
        "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c532a269-7723-4c51-ad21-e3da2242b185"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:59:01.594849Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6516afff-6a7f-4b26-aa0b-17bc20481508",
        "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904"
      },
      "correlation_id": "a291c584-67d6-495a-bf08-b651954095f6"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 57c0004d-8cb8-446e-9cab-49bc7d93a904 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/57c0004d-8cb8-446e-9cab-49bc7d93a904` → **200**

```json
{
  "id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3273f687-859d-4e08-ae02-3bacf7658f60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6c3fad8f-d253-4078-8aeb-0a2ecf8daa33",
    "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6a7173e9-5fed-40c9-904e-31aad1cff6db",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:59:00.979592Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/57c0004d-8cb8-446e-9cab-49bc7d93a904/cancel` → **200**

```json
{
  "command_id": "d6471977-fede-406c-a457-fbcfc80f208c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3273f687-859d-4e08-ae02-3bacf7658f60",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6c3fad8f-d253-4078-8aeb-0a2ecf8daa33",
    "order_id": "57c0004d-8cb8-446e-9cab-49bc7d93a904",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6a7173e9-5fed-40c9-904e-31aad1cff6db",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:59:00.979592Z",
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
  "session_id": "c05434b0-f025-4c94-868f-c61fd68adb9d",
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
  "last_heartbeat_at": "2026-10-30T09:58:57.038903Z",
  "last_location_at": "2026-10-30T09:58:57.038903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c05434b0-f025-4c94-868f-c61fd68adb9d/close` → **200**

```json
{
  "command_id": "adaa5a27-d9bb-45d0-a3cc-34300cecb673",
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
  "session_id": "17a9ab40-0289-46af-99cf-5873a04e8346",
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
  "last_heartbeat_at": "2026-10-30T09:58:58.521665Z",
  "last_location_at": "2026-10-30T09:58:58.521665Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17a9ab40-0289-46af-99cf-5873a04e8346/close` → **200**

```json
{
  "command_id": "dcbc33e5-ca75-4aa8-bdad-0d1f3d626641",
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
  "session_id": "f3f54f3e-8ee7-4216-a956-45b2d2128070",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNDQsImlhdCI6MTc5MzM1NDM0NCwianRpIjoiODMzMGUzMGItZjE1OS00OTI5LWI1YmItMzhlZGZlNDRmZTA4Iiwic2lkIjoiZjNmNTRmM2UtOGVlNy00MjE2LWE5NTYtNDViMmQyMTI4MDcwIn0.izyprkPgky_TDz620jmTkTgmr5cmLh3xN8jsplrdeQo",
  "access_expires_at": "2026-10-30T10:14:04.727254408Z",
  "refresh_token": "3SylfRpZzbhsJqOouAZi7w0JNA3eqdpIIHrxW4KjrE8",
  "refresh_expires_at": "2026-10-30T21:59:04.726731088Z",
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
  "command_id": "d856e012-61fc-4305-85db-19dfd8d726a8",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:59:05.305076Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "2c80e07c-444f-4e3d-88f0-9d6a18a637de",
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
  "correlation_id": "1dfbed05-5112-4da1-ad89-f5378a7fd6ba"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "7d85a648-4111-4c8c-8daf-9d153d74b962",
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
  "correlation_id": "483e727c-42ae-4c5a-855a-67dc98841d6b"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634137926",
  "device_ref": "sandbox-23596"
}
```

```json
{
  "challenge_id": "803ee53b-c5c1-4463-abf4-314b8e58a70d",
  "expires_at": "2026-10-30T10:04:06.176986999Z",
  "resend_available_at": "2026-10-30T09:59:07.176986999Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634137926` → **200**

```json
{
  "phone": "+380634137926",
  "audience": "CLIENT",
  "code": "647150",
  "sent_at": "2026-10-30T09:59:06.179472025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "803ee53b-c5c1-4463-abf4-314b8e58a70d",
  "code": "647150",
  "device_ref": "sandbox-23596"
}
```

```json
{
  "session_id": "dc1e4ce2-2a42-4724-8a60-8582ddc6976e",
  "subject": {
    "type": "CLIENT",
    "id": "5b695a9c-19d3-4c7f-beb9-1c6c9d493416"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YjY5NWE5Yy0xOWQzLTRjN2YtYmViOS0xYzZjOWQ0OTM0MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjQ2LCJpYXQiOjE3OTMzNTQzNDYsImp0aSI6IjBmNGU4NzRiLTM2YzAtNDhiMi05YzVkLWMxYzg5NWUwN2ZiZCIsInNpZCI6ImRjMWU0Y2UyLTJhNDItNDcyNC04YTYwLTg1ODJkZGM2OTc2ZSJ9.DPb0Cry27ynmLm-pkt64-fSmHHzlvvi8eWaB2ka9zKc",
  "access_expires_at": "2026-10-30T10:14:06.488999473Z",
  "refresh_token": "r4aF9mihpy_q6qPEMaLK1qVA--_cGWKk84k4B6gwvHc",
  "refresh_expires_at": "2026-11-29T09:59:06.488479869Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47b2dbd7-1e2f-4029-8bb4-dec4d9cd79d4",
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
  "id": "ca26d1f2-870c-4b61-8354-eba4167c3db7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:06.781942Z",
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
  "command_id": "6e0ddd5f-3936-431e-bd70-ad8505257061",
  "quote_id": "ca26d1f2-870c-4b61-8354-eba4167c3db7",
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
  "correlation_id": "7795e84c-c1fb-4fee-8f7e-501c009132f5"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "deb4e763-7d72-4db3-b82d-ed3c3977222f",
  "quote_id": "ca26d1f2-870c-4b61-8354-eba4167c3db7",
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
  "id": "37239ae5-24f1-4839-a8d1-36a65d450574",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5b695a9c-19d3-4c7f-beb9-1c6c9d493416",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:59:07.358591Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/37239ae5-24f1-4839-a8d1-36a65d450574/cancel` → **200**

```json
{
  "command_id": "68961fcb-24dd-4ae6-8874-ef59efa5c1bb",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "37239ae5-24f1-4839-a8d1-36a65d450574",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5b695a9c-19d3-4c7f-beb9-1c6c9d493416",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:59:07.358591Z",
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
  "command_id": "194b620d-7af6-423b-8746-f4c545ae6f9e",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:59:07.965996Z"
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
      "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:59:07.965996Z"
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
  "device_ref": "sandbox-26750"
}
```

```json
{
  "challenge_id": "b8b64dfe-80c0-4eae-b199-c8d5ce750084",
  "expires_at": "2026-10-30T10:04:08.864204562Z",
  "resend_available_at": "2026-10-30T09:59:09.864204562Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "666662",
  "sent_at": "2026-10-30T09:59:08.866688391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8b64dfe-80c0-4eae-b199-c8d5ce750084",
  "code": "666662",
  "device_ref": "sandbox-26750"
}
```

```json
{
  "session_id": "9dec1355-b072-452c-ac05-67fd34137157",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI0OSwiaWF0IjoxNzkzMzU0MzQ5LCJqdGkiOiI5MzRhOWM2NC0yNjcwLTQwOTItODQ2Ny0yN2YzZDcxNmFmMWQiLCJzaWQiOiI5ZGVjMTM1NS1iMDcyLTQ1MmMtYWMwNS02N2ZkMzQxMzcxNTcifQ.hgWcudQDubd_v5goBVUvRWSBTuAERgCvQBJVEaGbTdA",
  "access_expires_at": "2026-10-30T10:14:09.186315223Z",
  "refresh_token": "jghXXxOTzBKXRdXcc1T58JcjZISdp_NiklrRyzf_Bo4",
  "refresh_expires_at": "2026-11-29T09:59:09.185714036Z",
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
  "command_id": "bdef0728-912e-4dec-be03-dd96667ecad5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:09Z",
    "sequence": 1793354349747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:09.767017Z",
  "last_location_at": "2026-10-30T09:59:09.767017Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672070575",
  "device_ref": "sandbox-23700"
}
```

```json
{
  "challenge_id": "e22312ec-9c93-4a75-be83-ce8fdc0ba6d8",
  "expires_at": "2026-10-30T10:04:10.049012796Z",
  "resend_available_at": "2026-10-30T09:59:11.049012796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672070575` → **200**

```json
{
  "phone": "+380672070575",
  "audience": "CLIENT",
  "code": "921230",
  "sent_at": "2026-10-30T09:59:10.052049861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e22312ec-9c93-4a75-be83-ce8fdc0ba6d8",
  "code": "921230",
  "device_ref": "sandbox-23700"
}
```

```json
{
  "session_id": "43a087d9-aecb-4ff4-b289-84070fcd36c8",
  "subject": {
    "type": "CLIENT",
    "id": "1b8b1bbc-1db0-46f4-b6ad-69f3c8c767aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjhiMWJiYy0xZGIwLTQ2ZjQtYjZhZC02OWYzYzhjNzY3YWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjUwLCJpYXQiOjE3OTMzNTQzNTAsImp0aSI6IjRjNDZiYmIzLTI3ZWMtNGE3MC04MzAyLTQ0OGU3OWNlY2M4YyIsInNpZCI6IjQzYTA4N2Q5LWFlY2ItNGZmNC1iMjg5LTg0MDcwZmNkMzZjOCJ9.3ooUmB0sQD7lfwHdDi23sm0o8-aSpCzLSdANNzaXyjU",
  "access_expires_at": "2026-10-30T10:14:10.357934921Z",
  "refresh_token": "yIQzDsJjjPLdJFG1vUjS_GT3pelnNJmSnyMs0cS6kvg",
  "refresh_expires_at": "2026-11-29T09:59:10.357400123Z",
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
  "command_id": "a3af3037-ca7b-4ce8-87a9-c25411bfcc3e",
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
  "id": "cdb75ee7-767c-42bc-acaa-bee308e57a71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:10.913892Z",
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
  "command_id": "a4459649-74bd-451c-9040-2561425ed6d7",
  "platform": "ANDROID",
  "token": "sandbox-driver-b8e4eae2-6a02-42e0-85c9-1397fe5fc8e5"
}
```

```json
{
  "id": "402111dd-6ed2-43bb-9905-f1ed0e9f410c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:59:11.20947Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1be5e251-5f26-4d13-9f9e-933924bc4e80",
  "platform": "ANDROID",
  "token": "sandbox-rider-77aa31ca-0e96-4478-82d3-559a245935d6"
}
```

```json
{
  "id": "5e29a670-dc4d-41a7-8310-d10351cdfb24",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:59:11.531964Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "671bec77-a5de-4d3d-bdf8-ea782003caa3",
  "quote_id": "cdb75ee7-767c-42bc-acaa-bee308e57a71",
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
  "id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b8b1bbc-1db0-46f4-b6ad-69f3c8c767aa",
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
  "created_at": "2026-10-30T09:59:11.828695Z",
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
    "id": "a9a0679e-c962-4411-a111-d02d6197fb3a",
    "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
    "expires_at": "2026-10-30T09:59:26.832007Z",
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

`POST /api/driver/v1/offers/a9a0679e-c962-4411-a111-d02d6197fb3a/accept` → **200**

```json
{
  "command_id": "0b3f9ae8-679a-4979-b737-46bdc2ab3fdd"
}
```

```json
{
  "id": "d9b09dec-1b96-4979-87ba-736656e8c562",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:59:11.803Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:59:12.427608844Z",
    "token_suffix": "5fc8e5",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
      "order_version": "2",
      "event_id": "11ce92db-e3a8-4a8a-996e-c03e2f9e82d3"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672070575&after=2026-10-30T09:59:11.803Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672070575&after=2026-10-30T09:59:11.803Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:59:13.432875536Z",
    "token_suffix": "5935d6",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
      "order_version": "3",
      "event_id": "35daaf95-7f97-4747-adf6-60889e40f5ed"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/187b4583-5cbc-4b7d-8072-b300235b2be0/messages` → **201**

```json
{
  "command_id": "abe641d9-7ed5-4c3f-98b7-8dae1e5866c1",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c36c30c0-144d-4fef-97a6-556cf1228551",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:59:13.799390802Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "assignment_id": "d9b09dec-1b96-4979-87ba-736656e8c562",
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

`POST /api/driver/v1/trips/494d4d8f-f503-4ef1-a81f-56a7a974eea6/messages` → **201**

```json
{
  "command_id": "de20652d-4fea-41c4-9d25-f28fc41ba6ad",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "9f52d71a-fe06-403a-879d-3a8e2d98a30f",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:59:14.349834145Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/187b4583-5cbc-4b7d-8072-b300235b2be0/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/494d4d8f-f503-4ef1-a81f-56a7a974eea6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672070575"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:15Z",
    "sequence": 1793354355183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:15.204168Z",
  "last_location_at": "2026-10-30T09:59:15.204168Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "assignment_id": "d9b09dec-1b96-4979-87ba-736656e8c562",
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

`POST /api/driver/v1/trips/494d4d8f-f503-4ef1-a81f-56a7a974eea6/arrive` → **200**

```json
{
  "command_id": "a0c4c998-39ad-4650-acf8-83cd45d5592b",
  "expected_version": 0
}
```

```json
{
  "id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "assignment_id": "d9b09dec-1b96-4979-87ba-736656e8c562",
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
  "arrived_at": "2026-10-30T09:59:15.762657Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/494d4d8f-f503-4ef1-a81f-56a7a974eea6/start` → **200**

```json
{
  "command_id": "7cccd5f3-392e-4777-8bee-898c85fdd879",
  "expected_version": 1
}
```

```json
{
  "id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "assignment_id": "d9b09dec-1b96-4979-87ba-736656e8c562",
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
  "arrived_at": "2026-10-30T09:59:15.762657Z",
  "started_at": "2026-10-30T09:59:16.068049Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:16Z",
    "sequence": 1793354356349
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:16.369471Z",
  "last_location_at": "2026-10-30T09:59:16.369471Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/494d4d8f-f503-4ef1-a81f-56a7a974eea6/complete` → **200**

```json
{
  "command_id": "0a0e226e-d32e-482e-aefe-fa3de94140ae",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:59:16Z",
  "cash_received": true
}
```

```json
{
  "id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "assignment_id": "d9b09dec-1b96-4979-87ba-736656e8c562",
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
  "arrived_at": "2026-10-30T09:59:15.762657Z",
  "started_at": "2026-10-30T09:59:16.068049Z",
  "completed_at": "2026-10-30T09:59:16.656634Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/187b4583-5cbc-4b7d-8072-b300235b2be0` → **200**

```json
{
  "id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1b8b1bbc-1db0-46f4-b6ad-69f3c8c767aa",
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
    "id": "d9b09dec-1b96-4979-87ba-736656e8c562",
    "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:59:11.828695Z",
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
    "id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:59:11.828695Z",
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
    "id": "494d4d8f-f503-4ef1-a81f-56a7a974eea6",
    "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
    "order_short_number": 13,
    "created_at": "2026-10-30T09:59:12.418257Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1d3b8b11-f62b-49ed-ad21-4387d3303ba9",
    "order_id": "67fedfaa-b74f-40e2-98fb-6b458ed61f38",
    "order_short_number": 8,
    "created_at": "2026-10-30T09:58:01.261521Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "70974f26-95d6-4b08-ae01-55308e881eb7",
    "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
    "order_short_number": 3,
    "created_at": "2026-10-30T09:57:15.887264Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8ff04452-cd93-4600-9e1c-4d07693b99aa",
    "order_id": "93ea2ec6-c38c-4ff3-88c6-8f82e0abf852",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:56:56.408133Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d63aae53-9ed0-4f49-abd8-9d796f326128",
    "order_id": "d047ced2-b616-408c-ae23-30e062e0e264",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:56:46.569937Z",
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

`GET /api/rider/v1/orders/187b4583-5cbc-4b7d-8072-b300235b2be0/tip` → **200**

```json
{
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
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
  "available_until": "2026-10-31T09:59:16.656634Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/187b4583-5cbc-4b7d-8072-b300235b2be0/tip` → **201**

```json
{
  "command_id": "64459f38-7ff2-4d08-97e3-bb7c407d7152",
  "amount_minor": 1100
}
```

```json
{
  "id": "85194659-4dec-41f9-bb89-7ef300b5eb79",
  "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:59:21.713873Z"
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
  "session_id": "e2891489-1404-43ec-8a4a-576569ae8699",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNjIsImlhdCI6MTc5MzM1NDM2MiwianRpIjoiMWFlOWZkNzUtMWRlNS00NjM3LTkyZDktMTM0ZTBmMjczMDRhIiwic2lkIjoiZTI4OTE0ODktMTQwNC00M2VjLThhNGEtNTc2NTY5YWU4Njk5In0.GHqiyXV0ccCOaRmKWJYNykXRGPSdpda-paMVc_SnkB4",
  "access_expires_at": "2026-10-30T10:14:22.331070455Z",
  "refresh_token": "uEh_z1QdVUS19Yu_-znR1cYS_C60VPtENkEBvgTqT6k",
  "refresh_expires_at": "2026-10-30T21:59:22.330538773Z",
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
  "generated_at": "2026-10-30T09:59:22.618182535Z"
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
  "generated_at": "2026-10-30T09:59:22.904216692Z"
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
  "session_id": "de4d5763-8930-4b52-95cf-9f4e93f2e605",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNjMsImlhdCI6MTc5MzM1NDM2MywianRpIjoiNDZkY2U0OWItMTRmNi00MmE3LWFkMTMtZjc2MzNjOTIxMjA1Iiwic2lkIjoiZGU0ZDU3NjMtODkzMC00YjUyLTk1Y2YtOWY0ZTkzZjJlNjA1In0.nivEzZxpti6M6yXp0k1jKpWhlXJgZOQMGaisejjV5S8",
  "access_expires_at": "2026-10-30T10:14:23.52957926Z",
  "refresh_token": "aT1Latdcon1cTUVbaoenOt2b2OpxW6oBUs4hWMKvHUY",
  "refresh_expires_at": "2026-10-30T21:59:23.52902906Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/187b4583-5cbc-4b7d-8072-b300235b2be0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:59:11.829213Z",
      "actor": {
        "type": "CLIENT",
        "id": "1b8b1bbc-1db0-46f4-b6ad-69f3c8c767aa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
        "quote_id": "cdb75ee7-767c-42bc-acaa-bee308e57a71",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "904fa3c8-2386-4085-99a5-ab06e1839aab"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:59:11.831235Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
        "attempt_id": "bf29bdb4-a78d-42af-9850-c5b984722c9b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "904fa3c8-2386-4085-99a5-ab06e1839aab"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:59:11.834197Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a9a0679e-c962-4411-a111-d02d6197fb3a",
        "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "904fa3c8-2386-4085-99a5-ab06e1839aab"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:59:12.419712Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a9a0679e-c962-4411-a111-d02d6197fb3a",
        "order_id": "187b4583-5cbc-4b7d-8072-b300235b2be0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d9b09dec-1b96-4979-87ba-736656e8c562"
      },
      "correlation_id": "d1ab5b8b-e98d-465b-8838-185f47a5cbc3"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:59:24.10119799Z",
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
      "last_location_at": "2026-10-30T09:59:16.369471Z",
      "order_id": null
    }
  ]
}
```

Done: order 187b4583-5cbc-4b7d-8072-b300235b2be0.

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
  "session_id": "f88d1ed8-f0ba-42a6-a5b3-5fb878f00c32",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNjQsImlhdCI6MTc5MzM1NDM2NCwianRpIjoiZTQ5ZmFiYjgtZTgwOS00MzkxLWJlMmMtZDVhMjc0ZWQzNjZjIiwic2lkIjoiZjg4ZDFlZDgtZjBiYS00MmE2LWE1YjMtNWZiODc4ZjAwYzMyIn0.QOH5BjRl5hNZrivKalsk1qH1yk6knmp6wLYDQ6UOekk",
  "access_expires_at": "2026-10-30T10:14:24.737276946Z",
  "refresh_token": "_5MhlW2D_lngJkL8Ei8oY6DDVXgrAGucTwk91fPO0XM",
  "refresh_expires_at": "2026-10-30T21:59:24.736598878Z",
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
  "command_id": "23b502aa-1dc7-4d0c-a5cd-8fea6445b563",
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
  "timestamp": "2026-10-30T09:59:25.000+0000",
  "channel": {
    "id": "1730052000.92488177",
    "linkedid": "1730052000.92488177",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672328572"
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
  "timestamp": "2026-10-30T09:59:25.000+0000",
  "channel": {
    "id": "1730052000.92488177",
    "linkedid": "1730052000.92488177",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672328572"
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
  "session_id": "29e21930-30b7-4fe5-b64d-3ac29b411631",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNjUsImlhdCI6MTc5MzM1NDM2NSwianRpIjoiMjJiNjgyZTYtNzUyMC00NDY0LWIwOGUtOTdmMzM3ZTdhOGQ1Iiwic2lkIjoiMjllMjE5MzAtMzBiNy00ZmU1LWI2NGQtM2FjMjliNDExNjMxIn0.IwgdgmtUbkiCYnDVDhaqbgVjinDL_wCxmm4Ulx_djt4",
  "access_expires_at": "2026-10-30T10:14:25.983685241Z",
  "refresh_token": "cMwd3mzqG1DV7sgN9zv0IDmgjDIbmfbd5KXvCHrBSG0",
  "refresh_expires_at": "2026-10-30T21:59:25.983079877Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "605e3a48-7753-4e7a-8721-ec8473f43bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672328572",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:59:25Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/605e3a48-7753-4e7a-8721-ec8473f43bf1/answer` → **200**

```json
{
  "command_id": "8bb60146-32e9-4b83-acd7-f7be3f4b0880"
}
```

```json
{
  "id": "605e3a48-7753-4e7a-8721-ec8473f43bf1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672328572",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "order_ids": [],
  "started_at": "2026-10-30T09:59:25Z",
  "answered_at": "2026-10-30T09:59:26.558194Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.92488177",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "146aa943-2e68-44cf-be0f-6e66565da038",
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
  "id": "9d500f24-2ba9-4ec1-8285-f0cacb573444",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:26.879610Z",
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
  "command_id": "244a63b5-8240-48c8-9c47-9f881a315086",
  "quote_id": "9d500f24-2ba9-4ec1-8285-f0cacb573444",
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
    "phone": "+380672328572"
  },
  "call_id": "605e3a48-7753-4e7a-8721-ec8473f43bf1"
}
```

```json
{
  "id": "3e5b4ec5-e18e-435b-a849-e51148622ed3",
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
  "created_at": "2026-10-30T09:59:27.180136Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672328572"
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
    "id": "1730052000.92488177",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "605e3a48-7753-4e7a-8721-ec8473f43bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672328572",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [
        "3e5b4ec5-e18e-435b-a849-e51148622ed3"
      ],
      "started_at": "2026-10-30T09:59:25Z",
      "answered_at": "2026-10-30T09:59:26.558194Z",
      "ended_at": "2026-10-30T09:59:27.512236Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "4fe1433c-c7a2-4fc8-8257-51b6f5facaca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676668676",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [],
      "started_at": "2026-10-30T09:57:04.587502Z",
      "answered_at": "2026-10-30T09:57:04.905152Z",
      "ended_at": "2026-10-30T09:57:05.224235Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:57:11.848529Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/3e5b4ec5-e18e-435b-a849-e51148622ed3` → **200**

```json
{
  "id": "3e5b4ec5-e18e-435b-a849-e51148622ed3",
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
  "created_at": "2026-10-30T09:59:27.180136Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672328572"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/3e5b4ec5-e18e-435b-a849-e51148622ed3` → **200**

```json
{
  "id": "3e5b4ec5-e18e-435b-a849-e51148622ed3",
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
  "created_at": "2026-10-30T09:59:27.180136Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672328572"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3e5b4ec5-e18e-435b-a849-e51148622ed3/cancel` → **200**

```json
{
  "command_id": "f3b8de00-b59f-4e8a-8f5f-23246bcb17c3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3e5b4ec5-e18e-435b-a849-e51148622ed3",
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
  "created_at": "2026-10-30T09:59:27.180136Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672328572"
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

Done: call 605e3a48-7753-4e7a-8721-ec8473f43bf1 with order 3e5b4ec5-e18e-435b-a849-e51148622ed3.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22293"
}
```

```json
{
  "challenge_id": "ef3c3d2f-c2f7-4cd9-a69f-d65b444e6b6b",
  "expires_at": "2026-10-30T10:04:28.777955882Z",
  "resend_available_at": "2026-10-30T09:59:29.777955882Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "146094",
  "sent_at": "2026-10-30T09:59:28.781279411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef3c3d2f-c2f7-4cd9-a69f-d65b444e6b6b",
  "code": "146094",
  "device_ref": "sandbox-22293"
}
```

```json
{
  "session_id": "6e9074e1-87ca-412e-a8e0-4c446de345c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI2OSwiaWF0IjoxNzkzMzU0MzY5LCJqdGkiOiI3OTUyMGU3Ni1iZjJiLTQwYzktODE2YS0yOWViMDVlMTJiZDQiLCJzaWQiOiI2ZTkwNzRlMS04N2NhLTQxMmUtYThlMC00YzQ0NmRlMzQ1YzQifQ.EZExhHRdk4NjqpxZoELUbb0rzEvUDR2zXvHxDHS-2as",
  "access_expires_at": "2026-10-30T10:14:29.09492632Z",
  "refresh_token": "HM3nYa4P8iv-M-kDcPGu5VyEHM67BRvx7PXXxnWGIcE",
  "refresh_expires_at": "2026-11-29T09:59:29.094356762Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:16.369471Z",
  "last_location_at": "2026-10-30T09:59:16.369471Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/handover` → **200**

```json
{
  "command_id": "7f80b476-fb5d-49ac-823e-82d448fb33e8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:16.369471Z",
  "last_location_at": "2026-10-30T09:59:16.369471Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:29Z",
    "sequence": 1793354369988
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:30.008532Z",
  "last_location_at": "2026-10-30T09:59:30.008532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662189059",
  "device_ref": "sandbox-10326"
}
```

```json
{
  "challenge_id": "3351a03c-cada-4e88-9e28-95ab7cb6ff0f",
  "expires_at": "2026-10-30T10:04:30.297038271Z",
  "resend_available_at": "2026-10-30T09:59:31.297038271Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662189059` → **200**

```json
{
  "phone": "+380662189059",
  "audience": "CLIENT",
  "code": "840744",
  "sent_at": "2026-10-30T09:59:30.299387652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3351a03c-cada-4e88-9e28-95ab7cb6ff0f",
  "code": "840744",
  "device_ref": "sandbox-10326"
}
```

```json
{
  "session_id": "999441fb-2a7a-4579-ab63-d91bbfe63595",
  "subject": {
    "type": "CLIENT",
    "id": "a4df2922-a6ad-4ab9-9dad-ce570fd3857e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGRmMjkyMi1hNmFkLTRhYjktOWRhZC1jZTU3MGZkMzg1N2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjcwLCJpYXQiOjE3OTMzNTQzNzAsImp0aSI6IjYzMGFmY2NkLTMyOTUtNDQyOS05NWVlLTkyZTdmYTkwZWU1NiIsInNpZCI6Ijk5OTQ0MWZiLTJhN2EtNDU3OS1hYjYzLWQ5MWJiZmU2MzU5NSJ9.Hk5iKHoy_HB7GJZbXIxNmlskCNu4f8BF0_HtZPCKfow",
  "access_expires_at": "2026-10-30T10:14:30.612906202Z",
  "refresh_token": "bG5IQefubsZdAUy7d2pxgZV2V10GnKK5zJghWtAgK7g",
  "refresh_expires_at": "2026-11-29T09:59:30.612309679Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c119000-7d81-4e57-b916-dfe45401a36e",
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
  "id": "eef5a879-7b5d-4305-b680-ef4438ead3ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:30.893122Z",
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
  "command_id": "d74ec1c4-6c89-4d6d-82a3-f03da13e03e5",
  "quote_id": "eef5a879-7b5d-4305-b680-ef4438ead3ac",
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
  "id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4df2922-a6ad-4ab9-9dad-ce570fd3857e",
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
  "created_at": "2026-10-30T09:59:31.184169Z",
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
    "id": "6b56370f-7714-4b85-a854-b739809d0323",
    "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
    "expires_at": "2026-10-30T09:59:46.187531Z",
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

`POST /api/driver/v1/offers/6b56370f-7714-4b85-a854-b739809d0323/accept` → **200**

```json
{
  "command_id": "524a23a5-6bb8-4883-97e6-ade8f8ac1777"
}
```

```json
{
  "id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83",
  "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "76c00a1c-3d75-4438-b3f3-6a52b347f008",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "76c00a1c-3d75-4438-b3f3-6a52b347f008",
  "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
  "assignment_id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83",
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

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:32Z",
    "sequence": 1793354372336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:32.355919Z",
  "last_location_at": "2026-10-30T09:59:32.355919Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/76c00a1c-3d75-4438-b3f3-6a52b347f008/arrive` → **200**

```json
{
  "command_id": "07ed23d3-4f00-48dd-b44b-ae859590d215",
  "expected_version": 0
}
```

```json
{
  "id": "76c00a1c-3d75-4438-b3f3-6a52b347f008",
  "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
  "assignment_id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83",
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
  "arrived_at": "2026-10-30T09:59:32.646626Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/76c00a1c-3d75-4438-b3f3-6a52b347f008/start` → **200**

```json
{
  "command_id": "3320b1b2-6208-4e76-9423-6e938dfa66f0",
  "expected_version": 1
}
```

```json
{
  "id": "76c00a1c-3d75-4438-b3f3-6a52b347f008",
  "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
  "assignment_id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83",
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
  "arrived_at": "2026-10-30T09:59:32.646626Z",
  "started_at": "2026-10-30T09:59:32.948707Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:33Z",
    "sequence": 1793354373227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:33.247241Z",
  "last_location_at": "2026-10-30T09:59:33.247241Z",
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
  "device_ref": "sandbox-17579"
}
```

```json
{
  "challenge_id": "99c89c54-e521-4b6c-a314-e8f44f60e6f7",
  "expires_at": "2026-10-30T10:04:33.524498857Z",
  "resend_available_at": "2026-10-30T09:59:34.524498857Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "274107",
  "sent_at": "2026-10-30T09:59:33.526964128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99c89c54-e521-4b6c-a314-e8f44f60e6f7",
  "code": "274107",
  "device_ref": "sandbox-17579"
}
```

```json
{
  "session_id": "7217c3fa-419f-4d98-8cc2-0e5152d52357",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI3MywiaWF0IjoxNzkzMzU0MzczLCJqdGkiOiI0MDJkNjg0My1lMThhLTQ1MGEtYjM5ZC0xNDA3YTU5MGIwOTEiLCJzaWQiOiI3MjE3YzNmYS00MTlmLTRkOTgtOGNjMi0wZTUxNTJkNTIzNTcifQ.KONavWsTriAwkOqG-_kvVKpdNyZVb5qCgX6THq_4y-s",
  "access_expires_at": "2026-10-30T10:14:33.847614877Z",
  "refresh_token": "pN9Rx1RgS96Ls6-2u81pgFYaNJGOUNhEVcLLqzbg148",
  "refresh_expires_at": "2026-11-29T09:59:33.846870244Z",
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
  "command_id": "966ecf9b-b61e-4a8f-bcdf-7529941f682e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:34Z",
    "sequence": 1793354374409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b3952bba-7e4c-48ed-ae20-84801dc40c05",
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
  "last_heartbeat_at": "2026-10-30T09:59:34.428829Z",
  "last_location_at": "2026-10-30T09:59:34.428829Z",
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
  "session_id": "09cd64fd-d264-4e4d-9352-53a39ee291a0",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNzUsImlhdCI6MTc5MzM1NDM3NSwianRpIjoiMjNlY2QzNjYtYWY4ZC00NWJjLThjYTktODU0NDhjMzNmYWU3Iiwic2lkIjoiMDljZDY0ZmQtZDI2NC00ZTRkLTkzNTItNTNhMzllZTI5MWEwIn0.gbQnwwZhWmG74hXbPgqAhw1_8qhqze6dlV4Xu3IcBMU",
  "access_expires_at": "2026-10-30T10:14:35.06431067Z",
  "refresh_token": "Vyj25sLggSUWyr6oTGoNqLeZUbH-_dVktGxuxAKVY5Q",
  "refresh_expires_at": "2026-10-30T21:59:35.063745137Z",
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
  "session_id": "0cfc5235-e0e9-46e9-b95f-df5b53eaa798",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyNzUsImlhdCI6MTc5MzM1NDM3NSwianRpIjoiNjRiZjU1NmYtNDNmMy00ZjA4LTg1MTAtYjU4ZDE5NTFmMDQ2Iiwic2lkIjoiMGNmYzUyMzUtZTBlOS00NmU5LWI5NWYtZGY1YjUzZWFhNzk4In0.P13AuWccC-g7I1FFmzSCItA2yIlwydr3MNp3w273MC0",
  "access_expires_at": "2026-10-30T10:14:35.674208598Z",
  "refresh_token": "HFESSaf9aH8GnNQe7481xLJoMJykUxPPpjbX3Ait_ek",
  "refresh_expires_at": "2026-10-30T21:59:35.673612834Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4eaa66e7-b9df-4ca3-8516-af37e6f777cf` → **200**

```json
{
  "id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a4df2922-a6ad-4ab9-9dad-ce570fd3857e",
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
    "id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83",
    "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "76c00a1c-3d75-4438-b3f3-6a52b347f008",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:59:31.184169Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4eaa66e7-b9df-4ca3-8516-af37e6f777cf/interrupt` → **200**

```json
{
  "command_id": "94b52e3f-54c2-4cfa-924b-7828613adeda",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "a4df2922-a6ad-4ab9-9dad-ce570fd3857e",
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
      "id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83",
      "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "76c00a1c-3d75-4438-b3f3-6a52b347f008",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:59:31.184169Z",
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
    "id": "ef300744-234c-4b36-84e8-f67009946b0a",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "a4df2922-a6ad-4ab9-9dad-ce570fd3857e",
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
    "id": "c449509e-e04e-45a0-a50d-90676a80c323",
    "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
    "expires_at": "2026-10-30T09:59:51.289612Z",
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

`POST /api/driver/v1/offers/c449509e-e04e-45a0-a50d-90676a80c323/accept` → **200**

```json
{
  "command_id": "cb2414a7-a69b-4c2c-bbfa-50f996c77951"
}
```

```json
{
  "id": "02cbf7d1-e696-4a7c-841c-bc56b7bda329",
  "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "54d57e71-05c0-4a29-8ec1-49d8030f425d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "54d57e71-05c0-4a29-8ec1-49d8030f425d",
  "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
  "assignment_id": "02cbf7d1-e696-4a7c-841c-bc56b7bda329",
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
  "session_id": "b3952bba-7e4c-48ed-ae20-84801dc40c05",
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
  "last_heartbeat_at": "2026-10-30T09:59:34.428829Z",
  "last_location_at": "2026-10-30T09:59:34.428829Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b3952bba-7e4c-48ed-ae20-84801dc40c05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:37Z",
    "sequence": 1793354377773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b3952bba-7e4c-48ed-ae20-84801dc40c05",
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
  "last_heartbeat_at": "2026-10-30T09:59:37.793919Z",
  "last_location_at": "2026-10-30T09:59:37.793919Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/54d57e71-05c0-4a29-8ec1-49d8030f425d/arrive` → **200**

```json
{
  "command_id": "345940df-9600-4ea5-97f9-8b712514f2b3",
  "expected_version": 0
}
```

```json
{
  "id": "54d57e71-05c0-4a29-8ec1-49d8030f425d",
  "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
  "assignment_id": "02cbf7d1-e696-4a7c-841c-bc56b7bda329",
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
  "arrived_at": "2026-10-30T09:59:38.095996Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54d57e71-05c0-4a29-8ec1-49d8030f425d/start` → **200**

```json
{
  "command_id": "bbea2c51-fee9-49a3-8849-790f5cc67d6a",
  "expected_version": 1
}
```

```json
{
  "id": "54d57e71-05c0-4a29-8ec1-49d8030f425d",
  "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
  "assignment_id": "02cbf7d1-e696-4a7c-841c-bc56b7bda329",
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
  "arrived_at": "2026-10-30T09:59:38.095996Z",
  "started_at": "2026-10-30T09:59:38.408716Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54d57e71-05c0-4a29-8ec1-49d8030f425d/complete` → **200**

```json
{
  "command_id": "f48ccf9e-e707-43ba-afc7-cf615a6dfb13",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:59:38Z"
}
```

```json
{
  "id": "54d57e71-05c0-4a29-8ec1-49d8030f425d",
  "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
  "assignment_id": "02cbf7d1-e696-4a7c-841c-bc56b7bda329",
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
  "arrived_at": "2026-10-30T09:59:38.095996Z",
  "started_at": "2026-10-30T09:59:38.408716Z",
  "completed_at": "2026-10-30T09:59:38.712978Z",
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
    "id": "ef300744-234c-4b36-84e8-f67009946b0a",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:59:36.279323Z",
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
    "id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:59:31.184169Z",
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

`GET /api/operator/v1/orders/4eaa66e7-b9df-4ca3-8516-af37e6f777cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:59:31.184725Z",
      "actor": {
        "type": "CLIENT",
        "id": "a4df2922-a6ad-4ab9-9dad-ce570fd3857e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
        "quote_id": "eef5a879-7b5d-4305-b680-ef4438ead3ac",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "eb1a8eaa-9d94-4577-8a0a-cbad99680984"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:59:31.186778Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
        "attempt_id": "c1423604-9375-4902-afa3-1a5518a0ac6e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "eb1a8eaa-9d94-4577-8a0a-cbad99680984"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:59:31.193657Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6b56370f-7714-4b85-a854-b739809d0323",
        "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "eb1a8eaa-9d94-4577-8a0a-cbad99680984"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:59:31.773228Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6b56370f-7714-4b85-a854-b739809d0323",
        "order_id": "4eaa66e7-b9df-4ca3-8516-af37e6f777cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6f8fb87f-21a7-477b-92de-4d8e07af2f83"
      },
      "correlation_id": "8cd26304-5f9b-43d4-b82a-f9c6f4c6e5e0"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/ef300744-234c-4b36-84e8-f67009946b0a/tip` → **200**

```json
{
  "order_id": "ef300744-234c-4b36-84e8-f67009946b0a",
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
  "available_until": "2026-10-31T09:59:38.712978Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/ef300744-234c-4b36-84e8-f67009946b0a/tip` → **409**

```json
{
  "command_id": "526c837d-521c-497d-9f52-70ad92b9e2c7",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/ef300744-234c-4b36-84e8-f67009946b0a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e43371f9-a98d-468d-b035-2fda65fbfc36"
}
```

Done: interrupted 4eaa66e7-b9df-4ca3-8516-af37e6f777cf, follow-up ef300744-234c-4b36-84e8-f67009946b0a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314",
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
  "last_heartbeat_at": "2026-10-30T09:59:33.247241Z",
  "last_location_at": "2026-10-30T09:59:33.247241Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/474a52c9-3b8b-4d6c-bd7b-e58f1a1b0314/close` → **200**

```json
{
  "command_id": "9efa3138-fbd4-4f1a-b6fc-53750f1d9512",
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
  "session_id": "b3952bba-7e4c-48ed-ae20-84801dc40c05",
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
  "last_heartbeat_at": "2026-10-30T09:59:37.793919Z",
  "last_location_at": "2026-10-30T09:59:37.793919Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b3952bba-7e4c-48ed-ae20-84801dc40c05/close` → **200**

```json
{
  "command_id": "dc727636-5a2b-43bd-8da5-82752a96f351",
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
  "session_id": "2eb60ca2-70e3-407d-bc9f-9d30c5ae26e9",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyODQsImlhdCI6MTc5MzM1NDM4NCwianRpIjoiZGJiN2U3ZWQtOTkyZS00ZjZmLTk1ZmItNjY3NDM0YTgzMDM4Iiwic2lkIjoiMmViNjBjYTItNzBlMy00MDdkLWJjOWYtOWQzMGM1YWUyNmU5In0.rXcLtUDYvFQ1Gy52VpK2TA62aYx-wMJQ1FpK77g2igs",
  "access_expires_at": "2026-10-30T10:14:44.957548946Z",
  "refresh_token": "JTKY625mm3gMua6KrAkepuas8n1PoQeZhfKxuPMfAes",
  "refresh_expires_at": "2026-10-30T21:59:44.95656965Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "49ee6d2a-002c-4466-8cfe-4b8cd52a98e6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:59:45Z"
}
```

```json
{
  "id": "8b852a43-9b70-44d1-bd70-74b97855af5f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:59:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8b852a43-9b70-44d1-bd70-74b97855af5f/publish` → **200**

```json
{
  "command_id": "5f4e3c9b-c333-436c-9783-a6ec83d322ed",
  "expected_version": 0
}
```

```json
{
  "id": "8b852a43-9b70-44d1-bd70-74b97855af5f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:59:45.577136Z",
  "published_at": "2026-10-30T09:59:45.577136Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "8b852a43-9b70-44d1-bd70-74b97855af5f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:59:45.577136Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633148519",
  "device_ref": "sandbox-604"
}
```

```json
{
  "challenge_id": "83472319-0b79-488d-97ce-88ab474f76c9",
  "expires_at": "2026-10-30T10:04:46.159787846Z",
  "resend_available_at": "2026-10-30T09:59:47.159787846Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633148519` → **200**

```json
{
  "phone": "+380633148519",
  "audience": "CLIENT",
  "code": "138132",
  "sent_at": "2026-10-30T09:59:46.163279982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83472319-0b79-488d-97ce-88ab474f76c9",
  "code": "138132",
  "device_ref": "sandbox-604"
}
```

```json
{
  "session_id": "c9ac8045-e481-4fd6-ad9c-684993a6de37",
  "subject": {
    "type": "CLIENT",
    "id": "1050ef7d-b0d3-4b3e-8e77-754ba873bd90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDUwZWY3ZC1iMGQzLTRiM2UtOGU3Ny03NTRiYTg3M2JkOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Mjg2LCJpYXQiOjE3OTMzNTQzODYsImp0aSI6IjEzMTQ2Yjk4LTY4NDYtNDA0OS04NTFiLTcxODY0MWI5M2NkMiIsInNpZCI6ImM5YWM4MDQ1LWU0ODEtNGZkNi1hZDljLTY4NDk5M2E2ZGUzNyJ9.TtJnNmct-jmqMCARS-U1H61Cl0yfnc0vldytdIISfSg",
  "access_expires_at": "2026-10-30T10:14:46.472887402Z",
  "refresh_token": "l6vbr8Ar3WTkvKEojAv4Zl8wcOgqs4DUMG9qALwmP_4",
  "refresh_expires_at": "2026-11-29T09:59:46.472073867Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "8b852a43-9b70-44d1-bd70-74b97855af5f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:59:45.577136Z",
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
  "command_id": "5e5c9ffc-241b-420f-a954-bfd8d3a9e703",
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
  "id": "20bf5f99-8f0d-4ab3-8a89-ffae4e8cc7c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:47.060996Z",
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
  "command_id": "c604f9c7-e367-45fb-9098-d7a22f84c546",
  "quote_id": "20bf5f99-8f0d-4ab3-8a89-ffae4e8cc7c1",
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
  "correlation_id": "bfbdf5f0-1aaa-46f3-ab99-5a93a0d26143"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "096db48d-e8a7-4b69-9350-559cf0ccfdac",
  "version_id": "8b852a43-9b70-44d1-bd70-74b97855af5f",
  "language": "uk"
}
```

```json
{
  "version_id": "8b852a43-9b70-44d1-bd70-74b97855af5f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:59:47.662386Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc874e87-5e57-47fe-bbe0-a3df86a4e451",
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
  "id": "7d4b4b2f-ffe2-49e4-b66c-2dd7e57d1e97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:47.950870Z",
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
  "command_id": "0c07ea0e-4971-47d4-af3d-db2cf10f041f",
  "quote_id": "7d4b4b2f-ffe2-49e4-b66c-2dd7e57d1e97",
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
  "id": "2d80e2da-dedc-42c0-b6a3-a040e77cd6d3",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1050ef7d-b0d3-4b3e-8e77-754ba873bd90",
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
  "created_at": "2026-10-30T09:59:48.240014Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d80e2da-dedc-42c0-b6a3-a040e77cd6d3` → **200**

```json
{
  "id": "2d80e2da-dedc-42c0-b6a3-a040e77cd6d3",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1050ef7d-b0d3-4b3e-8e77-754ba873bd90",
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
  "created_at": "2026-10-30T09:59:48.240014Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2d80e2da-dedc-42c0-b6a3-a040e77cd6d3/cancel` → **200**

```json
{
  "command_id": "c2f43adc-ef2d-4513-b19f-2d224db6fd76",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2d80e2da-dedc-42c0-b6a3-a040e77cd6d3",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1050ef7d-b0d3-4b3e-8e77-754ba873bd90",
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
  "created_at": "2026-10-30T09:59:48.240014Z",
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

`POST /api/admin/v1/legal-documents/8b852a43-9b70-44d1-bd70-74b97855af5f` → **409**

```json
{
  "command_id": "8cc1c51f-5d29-49da-bbb9-d545e39fd5e6",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:59:49Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/8b852a43-9b70-44d1-bd70-74b97855af5f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3996b743-11b9-450d-b7a8-3221a85f7459"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2911a5f9-a7bb-4410-acf2-24d3f5b75b2f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:59:49Z"
}
```

```json
{
  "id": "dd194b76-5d5d-4150-9aec-aa39d8959044",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:59:49Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/dd194b76-5d5d-4150-9aec-aa39d8959044/publish` → **200**

```json
{
  "command_id": "0d3644fc-6984-49ab-bf77-a08ae4e5b94d",
  "expected_version": 0
}
```

```json
{
  "id": "dd194b76-5d5d-4150-9aec-aa39d8959044",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:59:49.791462Z",
  "published_at": "2026-10-30T09:59:49.791462Z",
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
  "device_ref": "sandbox-27832"
}
```

```json
{
  "challenge_id": "6bfb72ef-8f82-442a-a9fd-6e36e5a09d9b",
  "expires_at": "2026-10-30T10:04:50.085847586Z",
  "resend_available_at": "2026-10-30T09:59:51.085847586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "301752",
  "sent_at": "2026-10-30T09:59:50.088737736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bfb72ef-8f82-442a-a9fd-6e36e5a09d9b",
  "code": "301752",
  "device_ref": "sandbox-27832"
}
```

```json
{
  "session_id": "fa02394e-ac41-48b3-be4b-b4cd666ec5e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI5MCwiaWF0IjoxNzkzMzU0MzkwLCJqdGkiOiJkODE0NzQ0ZC1iMTNjLTQ0OGYtOThiYy03YzAyNmE1MGQyNTEiLCJzaWQiOiJmYTAyMzk0ZS1hYzQxLTQ4YjMtYmU0Yi1iNGNkNjY2ZWM1ZTcifQ.4_hodAI_rUcVjO9fOtsuoGUxB05-gUwDfkCe32Tldm8",
  "access_expires_at": "2026-10-30T10:14:50.396069231Z",
  "refresh_token": "s21R6RhBV1wpV2Oyizu5Nau8ckZOBCQj77xH5ZhM79w",
  "refresh_expires_at": "2026-11-29T09:59:50.395512501Z",
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
  "command_id": "d1b75945-0423-4631-99be-fd8c3b618329",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:59:50Z",
    "sequence": 1793354390954
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7a39bca8-1649-48cf-afa4-1c34a4caf960",
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
  "last_heartbeat_at": "2026-10-30T09:59:50.97474Z",
  "last_location_at": "2026-10-30T09:59:50.97474Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676778723",
  "device_ref": "sandbox-11060"
}
```

```json
{
  "challenge_id": "20c4960c-63ed-44e1-a449-d8b8fd3434e4",
  "expires_at": "2026-10-30T10:04:51.258506976Z",
  "resend_available_at": "2026-10-30T09:59:52.258506976Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676778723` → **200**

```json
{
  "phone": "+380676778723",
  "audience": "CLIENT",
  "code": "943628",
  "sent_at": "2026-10-30T09:59:51.261026361Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20c4960c-63ed-44e1-a449-d8b8fd3434e4",
  "code": "943628",
  "device_ref": "sandbox-11060"
}
```

```json
{
  "session_id": "828c5def-cdff-4caf-9714-0c929e7e1673",
  "subject": {
    "type": "CLIENT",
    "id": "52dad92d-e164-4422-ab26-52b129d665cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmRhZDkyZC1lMTY0LTQ0MjItYWIyNi01MmIxMjlkNjY1Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MjkxLCJpYXQiOjE3OTMzNTQzOTEsImp0aSI6IjE1NTAxY2I1LTIzMWUtNGUzMi1iZGYxLTUwNWQ0YWUxMGUwMCIsInNpZCI6IjgyOGM1ZGVmLWNkZmYtNGNhZi05NzE0LTBjOTI5ZTdlMTY3MyJ9.9QEpwz8Vl1I-7Z3rXcbC9I4nnyfS4-VGk7vS_ITzqd0",
  "access_expires_at": "2026-10-30T10:14:51.565475934Z",
  "refresh_token": "XDF15zx8j8lBb9fsmrd_z9E3E6LafioPcIqbgBLv3WU",
  "refresh_expires_at": "2026-11-29T09:59:51.564835168Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cbd14127-267a-41aa-94c2-1a2d050b56a7",
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
  "id": "e7b1eab5-3d27-4cbf-85ee-7e8a962cba5c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:51.855009Z",
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
  "command_id": "7a65f8cb-9d70-4dbf-b804-85a5e221f43c",
  "quote_id": "e7b1eab5-3d27-4cbf-85ee-7e8a962cba5c",
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
    "phone": "+380675684558"
  }
}
```

```json
{
  "id": "d23621ad-3883-4df7-9e0c-52120657a68a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:59:52.159617Z",
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
    "id": "82d5cafe-9250-43aa-858e-be09aaf31c2e",
    "order_id": "d23621ad-3883-4df7-9e0c-52120657a68a",
    "expires_at": "2026-10-30T10:00:07.163293Z",
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

`POST /api/driver/v1/offers/82d5cafe-9250-43aa-858e-be09aaf31c2e/accept` → **200**

```json
{
  "command_id": "f3887bd2-bf57-4bd4-91db-8d1419768ff0"
}
```

```json
{
  "id": "493a850d-873b-42c8-8e6c-4abe49f14052",
  "order_id": "d23621ad-3883-4df7-9e0c-52120657a68a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "259bac22-f1df-4c58-8dbd-50e2f7673ad9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "259bac22-f1df-4c58-8dbd-50e2f7673ad9",
  "order_id": "d23621ad-3883-4df7-9e0c-52120657a68a",
  "assignment_id": "493a850d-873b-42c8-8e6c-4abe49f14052",
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
    "phone": "+380675684558"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6482a30-ca43-45ee-80f1-047628004dad",
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
  "id": "1521962f-df73-435d-9efe-5867181aaf15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:53.353876Z",
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
  "command_id": "7254dd4b-3767-4dbe-b386-433a8e6d4fdd",
  "quote_id": "1521962f-df73-435d-9efe-5867181aaf15",
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
  "id": "bae6ad90-3204-4bb7-980c-21bc428c6290",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:59:53.648219Z",
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
  "command_id": "d06f1a3b-96be-47bc-b9be-62244b0de9d6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:59:53Z"
}
```

```json
{
  "id": "66e1e49b-dd16-498b-a5ad-58621cbffafa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:53.971542Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:59:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "db27ade4-eebf-4b9c-8bd2-5231b94d299f",
  "quote_id": "66e1e49b-dd16-498b-a5ad-58621cbffafa",
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
  "pickup_at": "2026-10-30T12:59:53Z"
}
```

```json
{
  "id": "1282a663-9ce0-415f-acb3-946807b0f30b",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:59:54.279559Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:59:53Z",
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
  "command_id": "9c10f84f-59d2-4ab6-9369-7aafe58920c2",
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
  "id": "9aa1f6ec-9d29-4c43-be24-811e42a8957b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:04:54.598440Z",
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
  "command_id": "89799ad6-77d7-4506-8758-a7b86e2f0ba3",
  "quote_id": "9aa1f6ec-9d29-4c43-be24-811e42a8957b",
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
  "correlation_id": "73e328a4-5cf4-492b-9b15-17164bfb4a5e"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "1282a663-9ce0-415f-acb3-946807b0f30b",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:59:54.279559Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:59:53Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bae6ad90-3204-4bb7-980c-21bc428c6290",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:59:53.648219Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d23621ad-3883-4df7-9e0c-52120657a68a",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "bae6ad90-3204-4bb7-980c-21bc428c6290",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:59:53.648219Z",
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

`GET /api/rider/v1/orders/d23621ad-3883-4df7-9e0c-52120657a68a` → **200**

```json
{
  "id": "d23621ad-3883-4df7-9e0c-52120657a68a",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "493a850d-873b-42c8-8e6c-4abe49f14052",
    "order_id": "d23621ad-3883-4df7-9e0c-52120657a68a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "259bac22-f1df-4c58-8dbd-50e2f7673ad9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:59:52.159617Z",
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
    "location_at": "2026-10-30T09:59:50.97474Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/d23621ad-3883-4df7-9e0c-52120657a68a/cancel` → **200**

```json
{
  "command_id": "90b98032-7e4a-4a03-8d91-6eb708f9a848",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d23621ad-3883-4df7-9e0c-52120657a68a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "493a850d-873b-42c8-8e6c-4abe49f14052",
    "order_id": "d23621ad-3883-4df7-9e0c-52120657a68a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "259bac22-f1df-4c58-8dbd-50e2f7673ad9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:59:52.159617Z",
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

`GET /api/rider/v1/orders/bae6ad90-3204-4bb7-980c-21bc428c6290` → **200**

```json
{
  "id": "bae6ad90-3204-4bb7-980c-21bc428c6290",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:59:53.648219Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bae6ad90-3204-4bb7-980c-21bc428c6290/cancel` → **200**

```json
{
  "command_id": "965826a2-cf6d-475c-b2c4-dc06826fe9bc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bae6ad90-3204-4bb7-980c-21bc428c6290",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:59:53.648219Z",
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

`GET /api/rider/v1/orders/1282a663-9ce0-415f-acb3-946807b0f30b` → **200**

```json
{
  "id": "1282a663-9ce0-415f-acb3-946807b0f30b",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:59:54.279559Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:59:53Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1282a663-9ce0-415f-acb3-946807b0f30b/cancel` → **200**

```json
{
  "command_id": "3378fd92-ea54-402c-aa39-0e7e9ee186ca",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1282a663-9ce0-415f-acb3-946807b0f30b",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "52dad92d-e164-4422-ab26-52b129d665cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:59:54.279559Z",
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
  "pickup_at": "2026-10-30T12:59:53Z",
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
  "session_id": "7a39bca8-1649-48cf-afa4-1c34a4caf960",
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
  "last_heartbeat_at": "2026-10-30T09:59:50.97474Z",
  "last_location_at": "2026-10-30T09:59:50.97474Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a39bca8-1649-48cf-afa4-1c34a4caf960/close` → **200**

```json
{
  "command_id": "fc52aa6e-60a2-4fa7-b4a1-e439aed2b4df",
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

Done: orders d23621ad-3883-4df7-9e0c-52120657a68a, bae6ad90-3204-4bb7-980c-21bc428c6290, 1282a663-9ce0-415f-acb3-946807b0f30b.

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
  "session_id": "26b29a0a-22e3-4e6f-99f6-3e0b1300fa7d",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyOTgsImlhdCI6MTc5MzM1NDM5OCwianRpIjoiMzI3MmExYTctNzIxOC00ZDI3LTk3MjktYTAwMzYxOWViMzBlIiwic2lkIjoiMjZiMjlhMGEtMjJlMy00ZTZmLTk5ZjYtM2UwYjEzMDBmYTdkIn0.MtE7bPHNARa629LR8KdGilt0V_gWrJkxGqdOZlTluyM",
  "access_expires_at": "2026-10-30T10:14:58.505004519Z",
  "refresh_token": "FXAHjTvVXAqbwpPjlman0vrFDNs1TgVNUVN4HYJmVuI",
  "refresh_expires_at": "2026-10-30T21:59:58.504382932Z",
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
  "session_id": "fdb0e28d-4e05-48e4-98ad-2e6d0e8448db",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUyOTksImlhdCI6MTc5MzM1NDM5OSwianRpIjoiMjNmZTRjYmUtYmZlYS00ZGViLWI5MzctZWQ5M2U5NWI1NzhmIiwic2lkIjoiZmRiMGUyOGQtNGUwNS00OGU0LTk4YWQtMmU2ZDBlODQ0OGRiIn0.uf9N-RlyuH9vHO8JjT6DpqAH5o05yin8GMdzdsNcq9M",
  "access_expires_at": "2026-10-30T10:14:59.119698364Z",
  "refresh_token": "Ku_qfR_O2HbrJQgzzPNKCx4UE_dmoKK9IaLJhQXNnhQ",
  "refresh_expires_at": "2026-10-30T21:59:59.119064658Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10138"
}
```

```json
{
  "challenge_id": "71cc72eb-98a4-4e14-b7eb-1047fa9b285c",
  "expires_at": "2026-10-30T10:04:59.391163836Z",
  "resend_available_at": "2026-10-30T10:00:00.391163836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711823",
  "sent_at": "2026-10-30T09:59:59.393759881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71cc72eb-98a4-4e14-b7eb-1047fa9b285c",
  "code": "711823",
  "device_ref": "sandbox-10138"
}
```

```json
{
  "session_id": "e2f762ac-d438-41f3-9eed-9c0b7982e526",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTI5OSwiaWF0IjoxNzkzMzU0Mzk5LCJqdGkiOiI2ZGJhZGRlZC1kODFlLTRmOTYtOTE5Ni1iZGNjODRhYzMxOTAiLCJzaWQiOiJlMmY3NjJhYy1kNDM4LTQxZjMtOWVlZC05YzBiNzk4MmU1MjYifQ.WtFe8KW6h6ChD8-js2E3qNWZXuWjZZJ1DFZaT-0s0sg",
  "access_expires_at": "2026-10-30T10:14:59.702937391Z",
  "refresh_token": "FminZ9xiJwAFnIDdOdr7NtemQJ5OxxPKNRjEB6SO3Tg",
  "refresh_expires_at": "2026-11-29T09:59:59.702122612Z",
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
  "command_id": "8c95639b-3b5b-456f-9265-346de6a3cf61",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:00:00Z",
    "sequence": 1793354400255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4666596-f3e9-4e1b-a3a8-ec9cdbef71ac",
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
  "last_heartbeat_at": "2026-10-30T10:00:00.274371Z",
  "last_location_at": "2026-10-30T10:00:00.274371Z",
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
  "command_id": "383c3c32-aa85-4417-ac58-a98e8f40b4a2",
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
  "effective_at": "2026-10-30T10:00:00.840745Z",
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:57:19.603201Z",
  "last_entries": [
    {
      "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:57:19.603201Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "526e9ce3-2e7d-4712-8236-15abd0be331b",
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
  "id": "7ecadfe5-6510-4564-8adf-ffea74eec543",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:05:01.405931Z",
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
  "command_id": "55a788d3-9fed-4f0e-aea4-8bf85e3417ca",
  "quote_id": "7ecadfe5-6510-4564-8adf-ffea74eec543",
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
    "phone": "+380671114198"
  }
}
```

```json
{
  "id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
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
  "created_at": "2026-10-30T10:00:01.704022Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114198"
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
    "id": "6952e0df-2c2e-4bdf-9b00-9d4cd1a7b365",
    "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
    "expires_at": "2026-10-30T10:00:16.707812Z",
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

`POST /api/driver/v1/offers/6952e0df-2c2e-4bdf-9b00-9d4cd1a7b365/accept` → **200**

```json
{
  "command_id": "cb9f478d-fb4b-4d7e-8203-a99faef16c1d"
}
```

```json
{
  "id": "0c9c618f-f71c-4c6b-a0fe-6414639ae958",
  "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5696841-77df-49fa-877b-0a764e272292",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5696841-77df-49fa-877b-0a764e272292",
  "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
  "assignment_id": "0c9c618f-f71c-4c6b-a0fe-6414639ae958",
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
    "phone": "+380671114198"
  }
}
```

`POST /api/driver/v1/work-sessions/a4666596-f3e9-4e1b-a3a8-ec9cdbef71ac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:00:02Z",
    "sequence": 1793354402843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4666596-f3e9-4e1b-a3a8-ec9cdbef71ac",
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
  "last_heartbeat_at": "2026-10-30T10:00:02.863072Z",
  "last_location_at": "2026-10-30T10:00:02.863072Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d5696841-77df-49fa-877b-0a764e272292/arrive` → **200**

```json
{
  "command_id": "76f0d5db-e634-4640-ad6d-8a6885f8e340",
  "expected_version": 0
}
```

```json
{
  "id": "d5696841-77df-49fa-877b-0a764e272292",
  "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
  "assignment_id": "0c9c618f-f71c-4c6b-a0fe-6414639ae958",
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
  "arrived_at": "2026-10-30T10:00:03.154892Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114198"
  }
}
```

`POST /api/driver/v1/trips/d5696841-77df-49fa-877b-0a764e272292/start` → **200**

```json
{
  "command_id": "f1c1bc2b-1ada-44ef-a433-6f6420d7d293",
  "expected_version": 1
}
```

```json
{
  "id": "d5696841-77df-49fa-877b-0a764e272292",
  "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
  "assignment_id": "0c9c618f-f71c-4c6b-a0fe-6414639ae958",
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
  "arrived_at": "2026-10-30T10:00:03.154892Z",
  "started_at": "2026-10-30T10:00:03.450697Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114198"
  }
}
```

`POST /api/driver/v1/trips/d5696841-77df-49fa-877b-0a764e272292/complete` → **200**

```json
{
  "command_id": "b039ca49-3d6e-4d31-99d6-604e0a7c4705",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:00:03Z",
  "cash_received": true
}
```

```json
{
  "id": "d5696841-77df-49fa-877b-0a764e272292",
  "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
  "assignment_id": "0c9c618f-f71c-4c6b-a0fe-6414639ae958",
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
  "arrived_at": "2026-10-30T10:00:03.154892Z",
  "started_at": "2026-10-30T10:00:03.450697Z",
  "completed_at": "2026-10-30T10:00:03.750578Z",
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
  "command_id": "2127623c-fce0-422e-aa77-bebf3230fcc3",
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
  "id": "c5d17249-1b45-4ccb-bcce-ee41039bc78d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:05:04.056300Z",
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
  "command_id": "398f3ebe-b479-43b5-89ba-078719c4aad8",
  "quote_id": "c5d17249-1b45-4ccb-bcce-ee41039bc78d",
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
    "phone": "+3806711126606"
  }
}
```

```json
{
  "id": "6eea0e37-6f1d-4695-b431-3abe2053826d",
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
  "created_at": "2026-10-30T10:00:04.358765Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6eea0e37-6f1d-4695-b431-3abe2053826d` → **200**

```json
{
  "id": "6eea0e37-6f1d-4695-b431-3abe2053826d",
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
  "created_at": "2026-10-30T10:00:04.358765Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6eea0e37-6f1d-4695-b431-3abe2053826d/cancel` → **200**

```json
{
  "command_id": "6ebf1008-b7fe-4eb2-a649-a8baf2343698",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "6eea0e37-6f1d-4695-b431-3abe2053826d",
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
  "created_at": "2026-10-30T10:00:04.358765Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126606"
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
  "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:57:19.603201Z",
  "last_entries": [
    {
      "order_id": "6eea0e37-6f1d-4695-b431-3abe2053826d",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T10:00:04.99366Z"
    },
    {
      "order_id": "8952997a-3e03-4f7e-b8a4-01550393c65a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T10:00:03.755488Z"
    },
    {
      "order_id": "ecc73638-bf42-4e7e-92ec-a00c1bfadbcd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:57:19.603201Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4666596-f3e9-4e1b-a3a8-ec9cdbef71ac",
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
  "last_heartbeat_at": "2026-10-30T10:00:02.863072Z",
  "last_location_at": "2026-10-30T10:00:02.863072Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4666596-f3e9-4e1b-a3a8-ec9cdbef71ac/close` → **200**

```json
{
  "command_id": "ce27d6be-9e5b-4756-ad5a-aab2f0d75f87",
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

Done: operator bonus for fulfilled 8952997a-3e03-4f7e-b8a4-01550393c65a and operator-fault cancellation 6eea0e37-6f1d-4695-b431-3abe2053826d.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673974345",
  "device_ref": "sandbox-32720"
}
```

```json
{
  "challenge_id": "c88f268c-263e-40ec-83fa-9eed6491b44c",
  "expires_at": "2026-10-30T10:05:09.415712282Z",
  "resend_available_at": "2026-10-30T10:00:10.415712282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673974345` → **200**

```json
{
  "phone": "+380673974345",
  "audience": "CLIENT",
  "code": "813497",
  "sent_at": "2026-10-30T10:00:09.418160702Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673797663",
  "device_ref": "sandbox-19759",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e1d55663-7378-4cd8-84f4-b5206a34771c",
  "expires_at": "2026-10-30T10:05:10.930360791Z",
  "resend_available_at": "2026-10-30T10:00:11.930360791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673797663` → **200**

```json
{
  "phone": "+380673797663",
  "audience": "CLIENT",
  "code": "234182",
  "sent_at": "2026-10-30T10:00:10.932502664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673797663",
  "device_ref": "sandbox-2480",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "5b7cdc95-e1ed-4213-b3df-cfcaf6dd6bd1",
  "expires_at": "2026-10-30T10:05:12.439205988Z",
  "resend_available_at": "2026-10-30T10:00:13.439205988Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673797663` → **200**

```json
{
  "phone": "+380673797663",
  "audience": "CLIENT",
  "code": "145750",
  "sent_at": "2026-10-30T10:00:12.442579963Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673170000",
  "device_ref": "sandbox-20706"
}
```

```json
{
  "challenge_id": "5c1ce343-bb38-4575-8e60-33da96e96476",
  "expires_at": "2026-10-30T10:05:13.958740491Z",
  "resend_available_at": "2026-10-30T10:00:14.958740491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673170000",
  "device_ref": "sandbox-5020"
}
```

```json
{
  "challenge_id": "faec1bea-6f58-4f5d-ad08-784e431f368e",
  "expires_at": "2026-10-30T10:05:15.45753232Z",
  "resend_available_at": "2026-10-30T10:00:16.45753232Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673170000` → **200**

```json
{
  "phone": "+380673170000",
  "audience": "CLIENT",
  "code": "258571",
  "sent_at": "2026-10-30T10:00:15.460290507Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673170000",
  "device_ref": "sandbox-30463",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "90fc1909-7767-4c6f-99a6-6df1822aa796",
  "expires_at": "2026-10-30T10:05:16.979072685Z",
  "resend_available_at": "2026-10-30T10:00:17.979072685Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673170000` → **200**

```json
{
  "phone": "+380673170000",
  "audience": "CLIENT",
  "code": "250376",
  "sent_at": "2026-10-30T10:00:16.982005783Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380673170000",
  "device_ref": "sandbox-21200",
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
  "correlation_id": "0ac59ad2-4a81-4ab0-a3cc-36502a97eadb",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000015419"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "89bb30c5-4a21-452b-9262-8cb7c888108d"
}
```

`GET /sandbox/v1/otp?phone=%2B442000015419` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120019570"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "f6456757-b527-4dfb-bf54-44d47d2b86e2"
}
```

`GET /sandbox/v1/otp?phone=%2B37120019570` → **404**

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
  "session_id": "23388e0b-5ea9-4cb9-9600-d000aa4a2c00",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzMTksImlhdCI6MTc5MzM1NDQxOSwianRpIjoiODEzMWI4NzUtN2JiMC00NjQ0LWIzNTMtN2QyZjI0NWU5YTA2Iiwic2lkIjoiMjMzODhlMGItNWVhOS00Y2I5LTk2MDAtZDAwMGFhNGEyYzAwIn0.oFXbqm_zxqMFp0BcxlHJUpGk_PKbrZzLuxkE9dGkudY",
  "access_expires_at": "2026-10-30T10:15:19.770667177Z",
  "refresh_token": "v9-n5cALTa7gSlYjxLEueRCJCTOl2KxsBukK0blsPr4",
  "refresh_expires_at": "2026-10-30T22:00:19.770053563Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673170000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c9a4f7fb-0d7b-47dc-be75-55986e09e8ea",
      "challenge_id": "90fc1909-7767-4c6f-99a6-6df1822aa796",
      "phone": "+380673170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-45126724-1139-4501-8667-62e60906d53a",
      "error": null,
      "attempted_at": "2026-10-30T10:00:16.982298Z"
    },
    {
      "id": "2b596e21-2972-4c94-8a29-2a171c9949c0",
      "challenge_id": "faec1bea-6f58-4f5d-ad08-784e431f368e",
      "phone": "+380673170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e7dc6c3d-77a0-4753-a690-6fabaeb50bdb",
      "error": null,
      "attempted_at": "2026-10-30T10:00:15.460773Z"
    },
    {
      "id": "e7681663-5280-43ca-b6a6-c624b97073cc",
      "challenge_id": "5c1ce343-bb38-4575-8e60-33da96e96476",
      "phone": "+380673170000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T10:00:13.961209Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673170000` → **200**

```json
{
  "phone": "+380673170000",
  "audience": "CLIENT",
  "code": "250376",
  "sent_at": "2026-10-30T10:00:16.982005783Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673797663` → **200**

```json
{
  "deliveries": [
    {
      "id": "d636db5d-c6e4-4fc6-9e63-ab019cf88b31",
      "challenge_id": "5b7cdc95-e1ed-4213-b3df-cfcaf6dd6bd1",
      "phone": "+380673797663",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9b0d5947-5883-4f94-8225-b9cbc19b4edb",
      "error": null,
      "attempted_at": "2026-10-30T10:00:12.442896Z"
    },
    {
      "id": "aa9c6e17-39ad-4ed9-9697-d1d20d7788d0",
      "challenge_id": "e1d55663-7378-4cd8-84f4-b5206a34771c",
      "phone": "+380673797663",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4804e071-c513-443e-8945-25b8a908deb4",
      "error": null,
      "attempted_at": "2026-10-30T10:00:10.932831Z"
    }
  ]
}
```

Done: SMS to +380673974345; SMS then a call to +380673797663; a failed SMS, two calls and a refused third to +380673170000; +44 and +371 refused.

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
  "session_id": "0935e678-08e2-49ab-8d55-1cc185f6c150",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzMjEsImlhdCI6MTc5MzM1NDQyMSwianRpIjoiZWM2OTVlYjgtNThmNS00YmQ4LTlmZGUtZWZkMzdjYTMyMDQ3Iiwic2lkIjoiMDkzNWU2NzgtMDhlMi00OWFiLThkNTUtMWNjMTg1ZjZjMTUwIn0.PvE_OU43Hd0ImT7JBfaSbbS6hLvejdxJm_T3ZKCndlk",
  "access_expires_at": "2026-10-30T10:15:21.017539394Z",
  "refresh_token": "6Qyw7l7sW7CFO1BCxXQEdm2wnEh30cqXr0z1pcmSidc",
  "refresh_expires_at": "2026-10-30T22:00:21.016752659Z",
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
  "session_id": "772c8a5b-0828-43e1-91ad-c502e6790e74",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzMjEsImlhdCI6MTc5MzM1NDQyMSwianRpIjoiZDcyYjkwMzItZjYxMy00NjdlLTk1NzYtM2QyMDNlMDk2ZWFhIiwic2lkIjoiNzcyYzhhNWItMDgyOC00M2UxLTkxYWQtYzUwMmU2NzkwZTc0In0.C6qslDFEM3uF44cwp050wzXmAEq5pnU36qd4hkTju_Q",
  "access_expires_at": "2026-10-30T10:15:21.628247294Z",
  "refresh_token": "gzjMyypdP0orUcwK-VApkO8Wld2ZNl3zhNhZo9JovsI",
  "refresh_expires_at": "2026-10-30T22:00:21.627728653Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
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
    "retention.manage",
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

`POST /api/admin/v1/staff-extensions/e6c93802-cbf7-4ba9-94ff-94a899790ee0` → **200**

```json
{
  "command_id": "e1f6ac82-1c01-4484-8af7-4793dc2f6956",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "025f6bbd-2a61-44e4-b65a-64716e0e9e42",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:00:22.783299Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:00:22.783299Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b6c7c03e-6c6d-47b3-80cb-901260078ec5",
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
  "id": "8f4d4b8f-a2bf-47b9-afb9-2f4873f81a8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:05:23.349100Z",
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
  "command_id": "1865f981-1ade-4231-94ac-22f5abf62f66",
  "quote_id": "8f4d4b8f-a2bf-47b9-afb9-2f4873f81a8b",
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
    "phone": "+380672449230"
  }
}
```

```json
{
  "id": "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4",
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
  "created_at": "2026-10-30T10:00:23.656228Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672449230"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/9b5b4ccb-643c-4bc4-9883-4aa6efe604d4/calls` → **201**

```json
{
  "command_id": "b9f072b5-7bdd-49ce-af5c-55c2b3dd437a",
  "to": "CALLER"
}
```

```json
{
  "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "order_ids": [
    "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
  ],
  "started_at": "2026-10-30T10:00:23.997663Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/9b5b4ccb-643c-4bc4-9883-4aa6efe604d4/calls` → **201**

```json
{
  "command_id": "b9f072b5-7bdd-49ce-af5c-55c2b3dd437a",
  "to": "CALLER"
}
```

```json
{
  "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "order_ids": [
    "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
  ],
  "started_at": "2026-10-30T10:00:23.997663Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672449230",
    "at": "2026-10-30T10:00:24.000037352Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16909",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=9b5b4ccb-643c-4bc4-9883-4aa6efe604d4` → **200**

```json
{
  "calls": [
    {
      "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [
        "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
      ],
      "started_at": "2026-10-30T10:00:23.997663Z",
      "answered_at": "2026-10-30T10:00:24.673642Z",
      "ended_at": "2026-10-30T10:00:24.697289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9b5b4ccb-643c-4bc4-9883-4aa6efe604d4` → **200**

```json
{
  "calls": [
    {
      "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [
        "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
      ],
      "started_at": "2026-10-30T10:00:23.997663Z",
      "answered_at": "2026-10-30T10:00:24.673642Z",
      "ended_at": "2026-10-30T10:00:24.697289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9b5b4ccb-643c-4bc4-9883-4aa6efe604d4` → **200**

```json
{
  "calls": [
    {
      "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [
        "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
      ],
      "started_at": "2026-10-30T10:00:23.997663Z",
      "answered_at": "2026-10-30T10:00:24.673642Z",
      "ended_at": "2026-10-30T10:00:24.697289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9b5b4ccb-643c-4bc4-9883-4aa6efe604d4` → **200**

```json
{
  "calls": [
    {
      "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [
        "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
      ],
      "started_at": "2026-10-30T10:00:23.997663Z",
      "answered_at": "2026-10-30T10:00:24.673642Z",
      "ended_at": "2026-10-30T10:00:24.697289Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9b5b4ccb-643c-4bc4-9883-4aa6efe604d4` → **200**

```json
{
  "calls": [
    {
      "id": "d5fa655f-04eb-4024-b6e7-d7f353cf4dc4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "order_ids": [
        "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4"
      ],
      "started_at": "2026-10-30T10:00:23.997663Z",
      "answered_at": "2026-10-30T10:00:24.673642Z",
      "ended_at": "2026-10-30T10:00:24.697289Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:00:31.902765Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/9b5b4ccb-643c-4bc4-9883-4aa6efe604d4` → **200**

```json
{
  "id": "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4",
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
  "created_at": "2026-10-30T10:00:23.656228Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672449230"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9b5b4ccb-643c-4bc4-9883-4aa6efe604d4/cancel` → **200**

```json
{
  "command_id": "86e0646a-78eb-41cf-8f44-aeec6e413cf5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9b5b4ccb-643c-4bc4-9883-4aa6efe604d4",
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
  "created_at": "2026-10-30T10:00:23.656228Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672449230"
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
  "command_id": "5fb665ab-7253-4ad3-8534-544938879ae6",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T10:00:34.870104Z",
  "extension": "101"
}
```

Done: outgoing call d5fa655f-04eb-4024-b6e7-d7f353cf4dc4 from order 9b5b4ccb-643c-4bc4-9883-4aa6efe604d4, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637646147",
  "device_ref": "sandbox-30203"
}
```

```json
{
  "challenge_id": "36118887-bad2-46fd-8eaa-5bd59c324264",
  "expires_at": "2026-10-30T10:05:35.182679571Z",
  "resend_available_at": "2026-10-30T10:00:36.182679571Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637646147` → **200**

```json
{
  "phone": "+380637646147",
  "audience": "CLIENT",
  "code": "234105",
  "sent_at": "2026-10-30T10:00:35.185066597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36118887-bad2-46fd-8eaa-5bd59c324264",
  "code": "234105",
  "device_ref": "sandbox-30203"
}
```

```json
{
  "session_id": "a796aa06-1d4f-467b-bc47-972551988692",
  "subject": {
    "type": "CLIENT",
    "id": "6b0ce706-f0c3-49c0-813e-6800d2778725"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjBjZTcwNi1mMGMzLTQ5YzAtODEzZS02ODAwZDI3Nzg3MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzM1LCJpYXQiOjE3OTMzNTQ0MzUsImp0aSI6IjAwN2Y3ZWE4LWUyZjItNGNhZi04YjhiLTUwNWVhZTBmMTU4MSIsInNpZCI6ImE3OTZhYTA2LTFkNGYtNDY3Yi1iYzQ3LTk3MjU1MTk4ODY5MiJ9.d_MaKbp5QlwE0_X2K_9CQPFK-rBcgnMlcz4SYtrIJAE",
  "access_expires_at": "2026-10-30T10:15:35.499058079Z",
  "refresh_token": "jOxd3pOtcn6eBGmjLBhb2uGcpYZL3-Li3xgrUXFE7Jo",
  "refresh_expires_at": "2026-11-29T10:00:35.498518208Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
  "session_id": "a796aa06-1d4f-467b-bc47-972551988692",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637646147",
  "device_ref": "sandbox-21907"
}
```

```json
{
  "challenge_id": "b78fb2b1-ff6a-4395-b09c-5da3e684caac",
  "expires_at": "2026-10-30T10:05:38.083611434Z",
  "resend_available_at": "2026-10-30T10:00:39.083611434Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637646147` → **200**

```json
{
  "phone": "+380637646147",
  "audience": "CLIENT",
  "code": "192528",
  "sent_at": "2026-10-30T10:00:38.085822832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b78fb2b1-ff6a-4395-b09c-5da3e684caac",
  "code": "192528",
  "device_ref": "sandbox-21907"
}
```

```json
{
  "session_id": "5d234c47-23d1-4421-9d97-dc370259541a",
  "subject": {
    "type": "CLIENT",
    "id": "6b0ce706-f0c3-49c0-813e-6800d2778725"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjBjZTcwNi1mMGMzLTQ5YzAtODEzZS02ODAwZDI3Nzg3MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzM4LCJpYXQiOjE3OTMzNTQ0MzgsImp0aSI6ImQ0MGFmN2FjLWNjMDctNDkxYi04NjJlLTU5ZWJmMmI0Mzk3OSIsInNpZCI6IjVkMjM0YzQ3LTIzZDEtNDQyMS05ZDk3LWRjMzcwMjU5NTQxYSJ9.gqrBXeb9PC0u7akvOJxNIKEdgXwMlgoVLgoY4cVGi8w",
  "access_expires_at": "2026-10-30T10:15:38.397848538Z",
  "refresh_token": "NK3iM-UIFenM-KfCJ2CzAqiYa4WE4vn09AGOU9umzW4",
  "refresh_expires_at": "2026-11-29T10:00:38.397258699Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "6463f551-fda9-4c4a-999c-e2f6db4088af",
  "expires_at": "2026-10-30T10:05:40.687498439Z",
  "resend_available_at": "2026-10-30T10:00:41.687498439Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637646147` → **200**

```json
{
  "phone": "+380637646147",
  "audience": "CLIENT",
  "code": "376323",
  "sent_at": "2026-10-30T10:00:40.689906158Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637745200"
}
```

```json
{
  "challenge_id": "75a20541-8bc2-40f5-9fe5-6083ac616d3c",
  "expires_at": "2026-10-30T10:05:40.99805522Z",
  "resend_available_at": "2026-10-30T10:00:41.99805522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637745200` → **200**

```json
{
  "phone": "+380637745200",
  "audience": "CLIENT",
  "code": "543716",
  "sent_at": "2026-10-30T10:00:41.000090202Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "9996876b-354a-4334-9b33-649302e8b7a1",
  "current_challenge_id": "6463f551-fda9-4c4a-999c-e2f6db4088af",
  "current_code": "000000",
  "new_challenge_id": "75a20541-8bc2-40f5-9fe5-6083ac616d3c",
  "new_code": "543716"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9a4f9c35-fa10-49d3-909a-8b6ea1a47f20"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "008f221a-32c6-4f07-b8f5-21aec1e4d93d",
  "current_challenge_id": "6463f551-fda9-4c4a-999c-e2f6db4088af",
  "current_code": "376323",
  "new_challenge_id": "75a20541-8bc2-40f5-9fe5-6083ac616d3c",
  "new_code": "543716"
}
```

```json
{
  "subject_id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
  "phone": "+380637745200",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
  "session_id": "a796aa06-1d4f-467b-bc47-972551988692",
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
  "correlation_id": "4ae6dad4-9f16-4e3a-bade-1b915c11917d"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637745200",
  "device_ref": "sandbox-3275"
}
```

```json
{
  "challenge_id": "e9086564-5138-489a-9826-6ff6bd6a544d",
  "expires_at": "2026-10-30T10:05:44.49448564Z",
  "resend_available_at": "2026-10-30T10:00:45.49448564Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637745200` → **200**

```json
{
  "phone": "+380637745200",
  "audience": "CLIENT",
  "code": "080228",
  "sent_at": "2026-10-30T10:00:44.496682487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9086564-5138-489a-9826-6ff6bd6a544d",
  "code": "080228",
  "device_ref": "sandbox-3275"
}
```

```json
{
  "session_id": "5ccc2200-1c4d-4486-9aae-0d30aa2ec01a",
  "subject": {
    "type": "CLIENT",
    "id": "6b0ce706-f0c3-49c0-813e-6800d2778725"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjBjZTcwNi1mMGMzLTQ5YzAtODEzZS02ODAwZDI3Nzg3MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzQ0LCJpYXQiOjE3OTMzNTQ0NDQsImp0aSI6IjhmYjkzM2YwLTE1YzAtNDVlNy04N2VhLThlNWJlMWJmMmRmYyIsInNpZCI6IjVjY2MyMjAwLTFjNGQtNDQ4Ni05YWFlLTBkMzBhYTJlYzAxYSJ9.a-j7IWaPxmmI5vgPQI00rOPls-kKY7n20GQeEI7wz6g",
  "access_expires_at": "2026-10-30T10:15:44.831219122Z",
  "refresh_token": "fZnOtI7XnkL6X548GL74rQlgOU1tAkWYNS-prFoT5hk",
  "refresh_expires_at": "2026-11-29T10:00:44.830536945Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
  "session_id": "5ccc2200-1c4d-4486-9aae-0d30aa2ec01a",
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
  "session_id": "1aa69215-3f0f-4faa-8e35-472442c5d39b",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNDUsImlhdCI6MTc5MzM1NDQ0NSwianRpIjoiMDFlNjM2MjYtM2UzNC00MTI2LWFjOTYtNTI0YjAwYTBlNmE4Iiwic2lkIjoiMWFhNjkyMTUtM2YwZi00ZmFhLThlMzUtNDcyNDQyYzVkMzliIn0.qizxZUwQGWkujHiQZJhS9_UqJS_BWJg-BWC9R39FwVs",
  "access_expires_at": "2026-10-30T10:15:45.733826689Z",
  "refresh_token": "dPCRTQCUcXXFByJqK5ZL1BugwOZHuCPCcufTkjeOfWk",
  "refresh_expires_at": "2026-10-30T22:00:45.733289861Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725` → **200**

```json
{
  "client": {
    "id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
    "phone": "+380637745200",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:00:35.496949Z",
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

`POST /api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725/phone/new-code` → **201**

```json
{
  "phone": "+380632338008"
}
```

```json
{
  "challenge_id": "864a931b-d7e9-4080-87c8-0ed6fe11ce7a",
  "expires_at": "2026-10-30T10:05:46.338976322Z",
  "resend_available_at": "2026-10-30T10:00:47.338976322Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632338008` → **200**

```json
{
  "phone": "+380632338008",
  "audience": "CLIENT",
  "code": "520502",
  "sent_at": "2026-10-30T10:00:46.341400441Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725/phone` → **422**

```json
{
  "command_id": "3dd4975e-e767-4eb5-b33b-9e286dc1dc00",
  "expected_version": 3,
  "new_challenge_id": "864a931b-d7e9-4080-87c8-0ed6fe11ce7a",
  "new_code": "520503",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1561c3ce-4e82-4a72-858d-67f4e7a0f0e9"
}
```

`POST /api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725/phone` → **400**

```json
{
  "command_id": "c803bbbf-46a0-4b61-9c69-372837a3268c",
  "expected_version": 3,
  "new_challenge_id": "864a931b-d7e9-4080-87c8-0ed6fe11ce7a",
  "new_code": "520502",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1b7f2374-da6d-48a5-a9aa-8c12f637edab",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/6b0ce706-f0c3-49c0-813e-6800d2778725/phone` → **200**

```json
{
  "command_id": "c83c2a3d-0cc0-4207-90de-d607908dc81c",
  "expected_version": 3,
  "new_challenge_id": "864a931b-d7e9-4080-87c8-0ed6fe11ce7a",
  "new_code": "520502",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
  "phone": "+380632338008",
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
  "correlation_id": "a1d05978-559f-4976-8f0f-bf00660dbd42"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632338008",
  "device_ref": "sandbox-22887"
}
```

```json
{
  "challenge_id": "56580462-90fb-419f-9884-dd3332bbb0e2",
  "expires_at": "2026-10-30T10:05:47.817135192Z",
  "resend_available_at": "2026-10-30T10:00:48.817135192Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632338008` → **200**

```json
{
  "phone": "+380632338008",
  "audience": "CLIENT",
  "code": "024292",
  "sent_at": "2026-10-30T10:00:47.819352083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56580462-90fb-419f-9884-dd3332bbb0e2",
  "code": "024292",
  "device_ref": "sandbox-22887"
}
```

```json
{
  "session_id": "98632d68-6f47-453b-954c-98f987ed9df7",
  "subject": {
    "type": "CLIENT",
    "id": "6b0ce706-f0c3-49c0-813e-6800d2778725"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjBjZTcwNi1mMGMzLTQ5YzAtODEzZS02ODAwZDI3Nzg3MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzQ4LCJpYXQiOjE3OTMzNTQ0NDgsImp0aSI6ImViZWZhMDQzLWQxNTktNDA2Ni1iMDgwLWU1MmRhZWJkNjIyYiIsInNpZCI6Ijk4NjMyZDY4LTZmNDctNDUzYi05NTRjLTk4Zjk4N2VkOWRmNyJ9.eUl9wGVj-4rDFGKezbY_UTHj9LbdTARCTqT0vk16OUk",
  "access_expires_at": "2026-10-30T10:15:48.132640697Z",
  "refresh_token": "AWwiacDWAV3Gyi05ePvegu-xr4462ib2wmovWWfzI0k",
  "refresh_expires_at": "2026-11-29T10:00:48.131908654Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b0ce706-f0c3-49c0-813e-6800d2778725",
  "session_id": "98632d68-6f47-453b-954c-98f987ed9df7",
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
  "phone": "+380639375367",
  "device_ref": "sandbox-23462"
}
```

```json
{
  "challenge_id": "a57f4dd3-2353-4e86-a2aa-52ba848c85bf",
  "expires_at": "2026-10-30T10:05:48.700311193Z",
  "resend_available_at": "2026-10-30T10:00:49.700311193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639375367` → **200**

```json
{
  "phone": "+380639375367",
  "audience": "CLIENT",
  "code": "895770",
  "sent_at": "2026-10-30T10:00:48.703695131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a57f4dd3-2353-4e86-a2aa-52ba848c85bf",
  "code": "895770",
  "device_ref": "sandbox-23462"
}
```

```json
{
  "session_id": "4ca6ed1f-37db-44f2-96a8-cf85e20b42c4",
  "subject": {
    "type": "CLIENT",
    "id": "759885e4-e997-4254-84f9-df7c3e56174a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NTk4ODVlNC1lOTk3LTQyNTQtODRmOS1kZjdjM2U1NjE3NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzQ5LCJpYXQiOjE3OTMzNTQ0NDksImp0aSI6IjJhZjdjOTA0LWFmNWMtNGI3MS05MTFlLTY4ZjQyMTg2YzYzMCIsInNpZCI6IjRjYTZlZDFmLTM3ZGItNDRmMi05NmE4LWNmODVlMjBiNDJjNCJ9.pmy99n_HQqmBGPJxZPSGxnhuKN8oyiwlKFfaJsvVWfw",
  "access_expires_at": "2026-10-30T10:15:49.014290308Z",
  "refresh_token": "_gHTbueM2mZxDComXShSH33CqGQgjhBJVjOkDjBeF8s",
  "refresh_expires_at": "2026-11-29T10:00:49.013688628Z",
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
  "session_id": "69190eef-0b06-42bb-b1f8-09022e148b6f",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNTAsImlhdCI6MTc5MzM1NDQ1MCwianRpIjoiOGZhMmIzOWYtYjI2My00ZGRhLThlZDMtNDc0YmM2NzgzYmQ4Iiwic2lkIjoiNjkxOTBlZWYtMGIwNi00MmJiLWIxZjgtMDkwMjJlMTQ4YjZmIn0.PBu0JluHk_cE6R2wnvxBfk2LT4p_0cbXCXE6WCPCGQo",
  "access_expires_at": "2026-10-30T10:15:50.243189286Z",
  "refresh_token": "OlqlUEx1P-mGlslSLBoVwFggF8H_k-HnZqzSytxuWaA",
  "refresh_expires_at": "2026-10-30T22:00:50.242451485Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639375367` → **200**

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
  "correlation_id": "4ee0d6d0-6f11-4c41-89f5-f1da78f2020e"
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
  "session_id": "8eda9da2-a52a-4679-bd93-545ab5393e55",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNTEsImlhdCI6MTc5MzM1NDQ1MSwianRpIjoiOTBkZTYwZDItN2U1MS00MzRmLTlkOTUtY2Q3NDViYzExNDU5Iiwic2lkIjoiOGVkYTlkYTItYTUyYS00Njc5LWJkOTMtNTQ1YWI1MzkzZTU1In0.WYMG3Rlmv6h1QsE6PIeK_GK_RrQ44jPnZRIMXon8q5Q",
  "access_expires_at": "2026-10-30T10:15:51.458922035Z",
  "refresh_token": "825V42bCrQZW5OqJHZqUtCxTGS-RYPmpY-C1LTAH9u4",
  "refresh_expires_at": "2026-10-30T22:00:51.458285136Z",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:56:50.914745Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3267cad2-f9f3-4dc8-96ed-70a3e894387c",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T10:00:52.050679418Z"
}
```

## The rider books the airport for 2026-10-30T13:00:51Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600932621",
  "device_ref": "sandbox-5516"
}
```

```json
{
  "challenge_id": "f32ea1d5-29e2-4e4a-96b6-b51ade141a95",
  "expires_at": "2026-10-30T10:05:52.36093205Z",
  "resend_available_at": "2026-10-30T10:00:53.36093205Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600932621` → **200**

```json
{
  "phone": "+48600932621",
  "audience": "CLIENT",
  "code": "002837",
  "sent_at": "2026-10-30T10:00:52.363343549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f32ea1d5-29e2-4e4a-96b6-b51ade141a95",
  "code": "002837",
  "device_ref": "sandbox-5516"
}
```

```json
{
  "session_id": "427494bd-3c5d-4917-a9d8-ec7c3f106ecd",
  "subject": {
    "type": "CLIENT",
    "id": "be00259d-59a5-4c23-b4a0-77006f7d08f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTAwMjU5ZC01OWE1LTRjMjMtYjRhMC03NzAwNmY3ZDA4ZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzUyLCJpYXQiOjE3OTMzNTQ0NTIsImp0aSI6IjIyM2Q3ZDgwLTRmNTQtNDdjOC1hYWYyLTllZTk2Y2MyOGNlMCIsInNpZCI6IjQyNzQ5NGJkLTNjNWQtNDkxNy1hOWQ4LWVjN2MzZjEwNmVjZCJ9.103C8HJBVEBvIlK0wRK6jNPPap3tLgBuLif_SuTBbiA",
  "access_expires_at": "2026-10-30T10:15:52.67522042Z",
  "refresh_token": "w0Fdu7XR9liENhwk4zKUZUDGWXOy9QYe5yCs1ftijRs",
  "refresh_expires_at": "2026-11-29T10:00:52.674716682Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c0cf48a6-03e5-4d78-a3e3-2c4580805e1a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T13:00:51Z"
}
```

```json
{
  "id": "53659be1-f3d0-4fb9-bd50-4b02a4b5e768",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:05:52.972462Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:00:51Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2b9f47f0-dbda-49a8-9986-a74b0964a323",
  "quote_id": "53659be1-f3d0-4fb9-bd50-4b02a4b5e768",
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
  "pickup_at": "2026-10-30T13:00:51Z"
}
```

```json
{
  "id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "be00259d-59a5-4c23-b4a0-77006f7d08f4",
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
  "created_at": "2026-10-30T10:00:53.282913Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:00:51Z",
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
  "device_ref": "sandbox-6394"
}
```

```json
{
  "challenge_id": "ce0be1bc-6df1-48b3-b237-f41234242520",
  "expires_at": "2026-10-30T10:05:53.58740399Z",
  "resend_available_at": "2026-10-30T10:00:54.58740399Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "938371",
  "sent_at": "2026-10-30T10:00:53.589584277Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce0be1bc-6df1-48b3-b237-f41234242520",
  "code": "938371",
  "device_ref": "sandbox-6394"
}
```

```json
{
  "session_id": "7b8e1772-e59e-4a00-b759-16762b38a7e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTM1MywiaWF0IjoxNzkzMzU0NDUzLCJqdGkiOiI5NzkwOWI1Ni03M2E2LTRjMjEtYTY1NC0zYzgzZGFiMmE0ZmIiLCJzaWQiOiI3YjhlMTc3Mi1lNTllLTRhMDAtYjc1OS0xNjc2MmIzOGE3ZTUifQ.OjOcE3mUOX7bG2uaKm8tupA4jFIP8w-ToKVr99fzarM",
  "access_expires_at": "2026-10-30T10:15:53.901670292Z",
  "refresh_token": "t9qIdDSP4zfPf8VrQLjkx8tP0AblVa7AYNVzsTfbj_Q",
  "refresh_expires_at": "2026-11-29T10:00:53.901057776Z",
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
  "command_id": "551f572f-0df6-451f-ab95-fc17cd422203",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:00:54Z",
    "sequence": 1793354454461
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1ae4ddd6-dab7-4225-991d-9108fdd4ee45",
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
  "last_heartbeat_at": "2026-10-30T10:00:54.482178Z",
  "last_location_at": "2026-10-30T10:00:54.482178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
      "short_number": 24,
      "pickup_at": "2026-10-30T13:00:51Z",
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

`POST /api/driver/v1/preorders/5e0635a4-e716-40c5-8c8d-103b232ddb4c/reserve` → **200**

```json
{
  "command_id": "e74c6bae-8136-417d-bf34-3ab765d756c3"
}
```

```json
{
  "id": "ee554fea-3c23-4172-8335-6bdcd24b1170",
  "state": "RESERVED",
  "order": {
    "order_id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
    "short_number": 24,
    "pickup_at": "2026-10-30T13:00:51Z",
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
  "reserved_at": "2026-10-30T10:00:55.061085Z",
  "confirm_from": "2026-10-30T12:30:51Z",
  "confirm_until": "2026-10-30T12:40:51Z",
  "drop_until": "2026-10-30T12:00:51Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ee554fea-3c23-4172-8335-6bdcd24b1170",
      "state": "RESERVED",
      "order": {
        "order_id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
        "short_number": 24,
        "pickup_at": "2026-10-30T13:00:51Z",
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
      "reserved_at": "2026-10-30T10:00:55.061085Z",
      "confirm_from": "2026-10-30T12:30:51Z",
      "confirm_until": "2026-10-30T12:40:51Z",
      "drop_until": "2026-10-30T12:00:51Z"
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
      "id": "ee554fea-3c23-4172-8335-6bdcd24b1170",
      "state": "RESERVED",
      "order": {
        "order_id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
        "short_number": 24,
        "pickup_at": "2026-10-30T13:00:51Z",
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
      "reserved_at": "2026-10-30T10:00:55.061085Z",
      "confirm_from": "2026-10-30T12:30:51Z",
      "confirm_until": "2026-10-30T12:40:51Z",
      "drop_until": "2026-10-30T12:00:51Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ee554fea-3c23-4172-8335-6bdcd24b1170/confirm` → **409**

```json
{
  "command_id": "1f1a30e3-9cd0-4e76-9e58-c3a92e9ac436"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ee554fea-3c23-4172-8335-6bdcd24b1170/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a13b653d-6c5e-4740-9ed5-057b538b3dde"
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
  "session_id": "c3acb1f8-5a59-4314-9ff4-7d6cfcbf1ece",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNTYsImlhdCI6MTc5MzM1NDQ1NiwianRpIjoiZDc5N2FmYjItZmE2Yi00MDRhLTkyNzYtODM4OTkzNWQxYzM2Iiwic2lkIjoiYzNhY2IxZjgtNWE1OS00MzE0LTlmZjQtN2Q2Y2ZjYmYxZWNlIn0.v_DhcDqwgfz0N6vF4d-S6d7HKgLfTllG1aMNLDXU84M",
  "access_expires_at": "2026-10-30T10:15:56.540269388Z",
  "refresh_token": "_PWG4odLp__jmZAfajcrEQ4q7_e3SNPZQUedu1pckEY",
  "refresh_expires_at": "2026-10-30T22:00:56.539726421Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5e0635a4-e716-40c5-8c8d-103b232ddb4c` → **200**

```json
{
  "id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "be00259d-59a5-4c23-b4a0-77006f7d08f4",
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
  "created_at": "2026-10-30T10:00:53.282913Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T13:00:51Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ee554fea-3c23-4172-8335-6bdcd24b1170",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T10:00:55.061085Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5e0635a4-e716-40c5-8c8d-103b232ddb4c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T10:00:53.284087Z",
      "actor": {
        "type": "CLIENT",
        "id": "be00259d-59a5-4c23-b4a0-77006f7d08f4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
        "preorder": true,
        "quote_id": "53659be1-f3d0-4fb9-bd50-4b02a4b5e768",
        "pickup_at": "2026-10-30T13:00:51Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4f71e2a2-4e74-4b9d-b6d2-307a60df016c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T10:00:55.062273Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e0635a4-e716-40c5-8c8d-103b232ddb4c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ee554fea-3c23-4172-8335-6bdcd24b1170"
      },
      "correlation_id": "4a039205-57f6-49ca-8d26-d997e4e4f67d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 5e0635a4-e716-40c5-8c8d-103b232ddb4c, reservation ee554fea-3c23-4172-8335-6bdcd24b1170.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1177"
}
```

```json
{
  "challenge_id": "f2259f6c-7362-42d9-a094-25bfcd3766a5",
  "expires_at": "2026-10-30T10:05:57.445388045Z",
  "resend_available_at": "2026-10-30T10:00:58.445388045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "130125",
  "sent_at": "2026-10-30T10:00:57.448109403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2259f6c-7362-42d9-a094-25bfcd3766a5",
  "code": "130125",
  "device_ref": "sandbox-1177"
}
```

```json
{
  "session_id": "a58fe44c-8d61-4046-97b9-3d963482ef18",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTM1NywiaWF0IjoxNzkzMzU0NDU3LCJqdGkiOiI2MjViMWMzNS1lNDViLTQwNTYtYjg1NC1kYTM0NTBkNzMzMDQiLCJzaWQiOiJhNThmZTQ0Yy04ZDYxLTQwNDYtOTdiOS0zZDk2MzQ4MmVmMTgifQ.WcNSdfhvFRw22ns8C3MYRiaNmt1l3qUGNnPl8bkZEOQ",
  "access_expires_at": "2026-10-30T10:15:57.75689749Z",
  "refresh_token": "4pnyXpr5vF-FPdWhX3ep9Ghg1OF0FR6m3gBKiE2OQNk",
  "refresh_expires_at": "2026-11-29T10:00:57.756340921Z",
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
  "command_id": "f880b470-b8a1-4fab-824c-b851545e9ac8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:00:58Z",
    "sequence": 1793354458319
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:00:58.339154Z",
  "last_location_at": "2026-10-30T10:00:58.339154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674173561",
  "device_ref": "sandbox-20968"
}
```

```json
{
  "challenge_id": "d3ada5b3-ee29-47d8-a4bc-1e43835c4261",
  "expires_at": "2026-10-30T10:05:58.631893162Z",
  "resend_available_at": "2026-10-30T10:00:59.631893162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674173561` → **200**

```json
{
  "phone": "+380674173561",
  "audience": "CLIENT",
  "code": "726275",
  "sent_at": "2026-10-30T10:00:58.634377093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3ada5b3-ee29-47d8-a4bc-1e43835c4261",
  "code": "726275",
  "device_ref": "sandbox-20968"
}
```

```json
{
  "session_id": "a7084699-53ef-4f81-93e7-5cf60e884254",
  "subject": {
    "type": "CLIENT",
    "id": "827e0865-08db-44e0-a2a3-e80c8b3da349"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjdlMDg2NS0wOGRiLTQ0ZTAtYTJhMy1lODBjOGIzZGEzNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzU4LCJpYXQiOjE3OTMzNTQ0NTgsImp0aSI6IjVmNzdhYjY3LWUzNmQtNGFjMS1hZTliLTJkZmM4ZDM2YmIwNiIsInNpZCI6ImE3MDg0Njk5LTUzZWYtNGY4MS05M2U3LTVjZjYwZTg4NDI1NCJ9.EieWuEQg6dTvXANsKjKbWwaMV3Po1XEMQJg6na3ules",
  "access_expires_at": "2026-10-30T10:15:58.955745435Z",
  "refresh_token": "ORbzjuDAvNHj1STtwcTZB2IJ9QFC7lacdSBaacdxyFQ",
  "refresh_expires_at": "2026-11-29T10:00:58.955211511Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1ef01097-5ea9-4583-90c1-a73f33d93808",
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
  "id": "66410f43-7da1-455f-97b2-06a3e76e160f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:05:59.265981Z",
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
  "command_id": "c1aee6ee-4c5e-465a-89f3-fc7f4914873c",
  "quote_id": "66410f43-7da1-455f-97b2-06a3e76e160f",
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
  "id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "827e0865-08db-44e0-a2a3-e80c8b3da349",
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
  "created_at": "2026-10-30T10:00:59.56836Z",
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
    "id": "679dcb2c-58a3-4b13-9e92-c2cbdf9717d5",
    "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
    "expires_at": "2026-10-30T10:01:14.571289Z",
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

`POST /api/driver/v1/offers/679dcb2c-58a3-4b13-9e92-c2cbdf9717d5/accept` → **200**

```json
{
  "command_id": "ecd81714-65f2-4db8-bc7c-8aefbf26efac"
}
```

```json
{
  "id": "bae941ac-0241-42af-ba69-9f9af6db8c6b",
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1",
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "assignment_id": "bae941ac-0241-42af-ba69-9f9af6db8c6b",
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

`POST /api/driver/v1/work-sessions/7b59429c-4c67-46d5-aca7-6a046e556748/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:00Z",
    "sequence": 1793354460750
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:01:00.769994Z",
  "last_location_at": "2026-10-30T10:01:00.769994Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1",
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "assignment_id": "bae941ac-0241-42af-ba69-9f9af6db8c6b",
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

`POST /api/driver/v1/trips/6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1/arrive` → **200**

```json
{
  "command_id": "0bfc4e29-e8d0-4b4e-bd6e-57a83dbce89d",
  "expected_version": 0
}
```

```json
{
  "id": "6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1",
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "assignment_id": "bae941ac-0241-42af-ba69-9f9af6db8c6b",
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
  "arrived_at": "2026-10-30T10:01:01.340369Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1/start` → **200**

```json
{
  "command_id": "88f94792-2cab-42ad-a3b7-b6c499d8647b",
  "expected_version": 1
}
```

```json
{
  "id": "6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1",
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "assignment_id": "bae941ac-0241-42af-ba69-9f9af6db8c6b",
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
  "arrived_at": "2026-10-30T10:01:01.340369Z",
  "started_at": "2026-10-30T10:01:01.634729Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7b59429c-4c67-46d5-aca7-6a046e556748/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:01Z",
    "sequence": 1793354461919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:01:01.940689Z",
  "last_location_at": "2026-10-30T10:01:01.940689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1/complete` → **200**

```json
{
  "command_id": "5e520eb8-64fd-46f3-8328-13561eb36127",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:01:02Z",
  "cash_received": true
}
```

```json
{
  "id": "6d3ab63a-61c3-43b4-bd92-2e6a8b8184d1",
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "assignment_id": "bae941ac-0241-42af-ba69-9f9af6db8c6b",
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
  "arrived_at": "2026-10-30T10:01:01.340369Z",
  "started_at": "2026-10-30T10:01:01.634729Z",
  "completed_at": "2026-10-30T10:01:02.236865Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/16c511b6-5cde-4ec0-9f83-8bd02f47b2f3/rating` → **200**

```json
{
  "command_id": "51c7b581-585a-4a8a-9ea5-ad014d0fe280",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "score": 5,
  "created_at": "2026-10-30T10:01:02.556656782Z"
}
```

`POST /api/driver/v1/orders/16c511b6-5cde-4ec0-9f83-8bd02f47b2f3/rating` → **200**

```json
{
  "command_id": "bd8ac55c-e128-42a7-b191-e4dd8df4f26f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
  "score": 4,
  "created_at": "2026-10-30T10:01:02.859927444Z"
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
  "session_id": "7a84387c-975c-44b3-a049-097d1e1d3a90",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNjMsImlhdCI6MTc5MzM1NDQ2MywianRpIjoiY2U3ZTlkM2UtYTY0YS00Yzc2LTgwYWMtZTU1NDk5MzNhOWEyIiwic2lkIjoiN2E4NDM4N2MtOTc1Yy00NGIzLWEwNDktMDk3ZDFlMWQzYTkwIn0.5TdO2F4xD7HrZiaSlwVnZlA-Oig8jDH6d0qL11EtEBg",
  "access_expires_at": "2026-10-30T10:16:03.762132453Z",
  "refresh_token": "mhKSLzCbNh1fdD0KCJ6fasMeIHiWr4rKgvE7wGHEJek",
  "refresh_expires_at": "2026-10-30T22:01:03.76159926Z",
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
  "session_id": "6dfcf792-e66b-48dd-bc81-d9cc8b8a1740",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNjQsImlhdCI6MTc5MzM1NDQ2NCwianRpIjoiYjA0YTUzOWMtNTM4ZS00YzRhLWE1ZjMtNmI1NTI5Mzk5NTYxIiwic2lkIjoiNmRmY2Y3OTItZTY2Yi00OGRkLWJjODEtZDljYzhiOGExNzQwIn0.-2ndnJd6S05OYUjKDJm5jRi3EME6VBqxBokz-A6vxvk",
  "access_expires_at": "2026-10-30T10:16:04.375886842Z",
  "refresh_token": "NYkSeLral4bltgws4SkKIa09QroSK7AOn03S6vbA1Vw",
  "refresh_expires_at": "2026-10-30T22:01:04.375319888Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/16c511b6-5cde-4ec0-9f83-8bd02f47b2f3/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
      "author_type": "RIDER",
      "author_id": "827e0865-08db-44e0-a2a3-e80c8b3da349",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T10:01:02.556657Z"
    },
    {
      "order_id": "16c511b6-5cde-4ec0-9f83-8bd02f47b2f3",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "827e0865-08db-44e0-a2a3-e80c8b3da349",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T10:01:02.859927Z"
    }
  ]
}
```

Done: ratings for order 16c511b6-5cde-4ec0-9f83-8bd02f47b2f3.

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
  "session_id": "3d81fa99-3a98-4579-ab6e-b1e052f34c34",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNjUsImlhdCI6MTc5MzM1NDQ2NSwianRpIjoiZGExY2IxNGQtMzYwMS00MGY4LTljMGQtZjAwZGU2ZWNhNWIzIiwic2lkIjoiM2Q4MWZhOTktM2E5OC00NTc5LWFiNmUtYjFlMDUyZjM0YzM0In0.oHg9FL-ApFi1hxyNHIwbB7y91NyqAO74eot7LH0AjOA",
  "access_expires_at": "2026-10-30T10:16:05.327113757Z",
  "refresh_token": "1esvt-QnrB9xzgLf0ffSGaBUerSBS0iJgd9OJOk7EuI",
  "refresh_expires_at": "2026-10-30T22:01:05.326524425Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "02474a71-aba0-48c1-847e-83be67dbbaf8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "a2dfd538-bef9-4961-898d-8035a5958926",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:05.62464Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2dfd538-bef9-4961-898d-8035a5958926` → **200**

```json
{
  "id": "a2dfd538-bef9-4961-898d-8035a5958926",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:05.62464Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2dfd538-bef9-4961-898d-8035a5958926` → **200**

```json
{
  "id": "a2dfd538-bef9-4961-898d-8035a5958926",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:01:05.62464Z",
  "ready_at": "2026-10-30T10:01:06.971147Z",
  "expires_at": "2026-10-31T10:01:06.971147Z"
}
```

`GET /api/admin/v1/reports/exports/a2dfd538-bef9-4961-898d-8035a5958926/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "55d5890e-9219-430e-adb4-479d797e8e7c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "7a9d45af-0a1e-4334-8fd2-c1cb356162c2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:07.539439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a9d45af-0a1e-4334-8fd2-c1cb356162c2` → **200**

```json
{
  "id": "7a9d45af-0a1e-4334-8fd2-c1cb356162c2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:07.539439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a9d45af-0a1e-4334-8fd2-c1cb356162c2` → **200**

```json
{
  "id": "7a9d45af-0a1e-4334-8fd2-c1cb356162c2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:07.539439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a9d45af-0a1e-4334-8fd2-c1cb356162c2` → **200**

```json
{
  "id": "7a9d45af-0a1e-4334-8fd2-c1cb356162c2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:07.539439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a9d45af-0a1e-4334-8fd2-c1cb356162c2` → **200**

```json
{
  "id": "7a9d45af-0a1e-4334-8fd2-c1cb356162c2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:01:07.539439Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7a9d45af-0a1e-4334-8fd2-c1cb356162c2` → **200**

```json
{
  "id": "7a9d45af-0a1e-4334-8fd2-c1cb356162c2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:01:07.539439Z",
  "ready_at": "2026-10-30T10:01:11.981103Z",
  "expires_at": "2026-10-31T10:01:11.981103Z"
}
```

`GET /api/admin/v1/reports/exports/7a9d45af-0a1e-4334-8fd2-c1cb356162c2/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/6e71e98e-f336-4e49-9fbe-cc625bd96de9` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/6e71e98e-f336-4e49-9fbe-cc625bd96de9",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7d20ad68-8332-4055-bf16-7d4cdc6ffc8f"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: retention

## Technical data retention

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "e36d6a83-db32-4b57-832b-e8811cad6a61",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNzMsImlhdCI6MTc5MzM1NDQ3MywianRpIjoiNmIwNjY2MmEtOGQxZC00NzZjLThkOTQtOGQ3Y2NhYjQ1ZDgwIiwic2lkIjoiZTM2ZDZhODMtZGIzMi00YjU3LTgzMmItZTg4MTFjYWQ2YTYxIn0.nYd9rx16-RGYXM7wO2EyXYrdswcib47p_Lck75L8fZU",
  "access_expires_at": "2026-10-30T10:16:13.949093094Z",
  "refresh_token": "HR1Q_JqrwMXJejfHukVeN88UeYrEy8OrkQ_gtHzG9DA",
  "refresh_expires_at": "2026-10-30T22:01:13.94856572Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "f789a3c7-5625-4954-82df-9ce30c4268f8",
  "expected_version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Sandbox retention boundary"
}
```

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T10:01:14.540828968Z"
}
```

`POST /sandbox/v1/retention/fixtures/c872f399-538b-4c10-954c-53b1ac593b37` → **200**

```json
{
  "old_done": 1,
  "recent_done": 1,
  "failed": 1
}
```

`POST /sandbox/v1/retention/run` → **200**

```json
{
  "sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "sign_in_codes": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "code_deliveries": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "delivered_events": {
    "deleted": 1,
    "failures": 0,
    "examined": 1
  },
  "consumer_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "command_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "upload_sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "quarantined_files": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "call_recordings": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  }
}
```

`GET /sandbox/v1/retention/fixtures/c872f399-538b-4c10-954c-53b1ac593b37` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/c872f399-538b-4c10-954c-53b1ac593b37` → **204**

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T10:01:14.540829Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "19d8654b-5ae2-4409-8ad7-dec0a7a2d787",
  "expected_version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Restore policy after retention sandbox"
}
```

```json
{
  "version": 2,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T10:01:15.284802914Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31124"
}
```

```json
{
  "challenge_id": "a6c5063c-e7fa-4bcd-b313-2985b46cf049",
  "expires_at": "2026-10-30T10:06:15.580230563Z",
  "resend_available_at": "2026-10-30T10:01:16.580230563Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "091149",
  "sent_at": "2026-10-30T10:01:15.583442463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6c5063c-e7fa-4bcd-b313-2985b46cf049",
  "code": "091149",
  "device_ref": "sandbox-31124"
}
```

```json
{
  "session_id": "fe624edc-f384-43ce-9749-22b683dcb9f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTM3NSwiaWF0IjoxNzkzMzU0NDc1LCJqdGkiOiIxOTU4OGVkNS0wNzI0LTQ1MjYtOWExNS05NGVjZGJhYjkwYzEiLCJzaWQiOiJmZTYyNGVkYy1mMzg0LTQzY2UtOTc0OS0yMmI2ODNkY2I5ZjUifQ.CMXNakHREbgsWqGRZlMc3KTAyd-vCA8JYBG1-Z5FB0A",
  "access_expires_at": "2026-10-30T10:16:15.900902002Z",
  "refresh_token": "k3XfE7FUaXW-5wt2sqQoCsIQfdY5C078k_A9EqhTQtw",
  "refresh_expires_at": "2026-11-29T10:01:15.900326361Z",
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
  "command_id": "0dfd652b-d5c1-4d14-a3ce-33b7e2161012",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:16Z",
    "sequence": 1793354476762
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e09e184-9c73-445c-89ed-878fead57640",
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
  "last_heartbeat_at": "2026-10-30T10:01:16.782934Z",
  "last_location_at": "2026-10-30T10:01:16.782934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c9deed73-9c15-48ea-aa2c-05e940e25867",
  "points": [
    {
      "sequence": 1793354479832,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:00:19Z"
    },
    {
      "sequence": 1793354479915,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:01:19Z"
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
  "session_id": "f8a12ee1-13c9-4944-b21d-a59ee25b3acd",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzNzksImlhdCI6MTc5MzM1NDQ3OSwianRpIjoiOTFkM2RkZGMtOGE3YS00YjdhLTk2OTQtZTJmY2JmN2NjMDk1Iiwic2lkIjoiZjhhMTJlZTEtMTNjOS00OTQ0LWIyMWQtYTU5ZWUyNWIzYWNkIn0.27fVlub_v5g2L0z99MbRM86wla1l0dNJBXk4ZZRDps8",
  "access_expires_at": "2026-10-30T10:16:19.759689671Z",
  "refresh_token": "9xTbAji27wAN5jqhOdBg41qZWXLQ_1SNXRuHwofFd2w",
  "refresh_expires_at": "2026-10-30T22:01:19.759108607Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "ba01c767-4e1d-429b-9360-adc26a5c3f86",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T10:01:19Z",
        "track_point_id": "3cb205b3-79fd-4403-961d-7d93a79fd10c",
        "work_session_id": "7e09e184-9c73-445c-89ed-878fead57640"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T10:01:19Z",
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

`POST /api/admin/v1/driver-risk-flags/ba01c767-4e1d-429b-9360-adc26a5c3f86/confirm` → **200**

```json
{
  "command_id": "5a2c7084-7d82-46a8-9fe1-644d9de27ed2",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ba01c767-4e1d-429b-9360-adc26a5c3f86",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T10:01:19Z",
    "track_point_id": "3cb205b3-79fd-4403-961d-7d93a79fd10c",
    "work_session_id": "7e09e184-9c73-445c-89ed-878fead57640"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T10:01:19Z",
  "reason": null,
  "reviewed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reviewed_at": "2026-10-30T10:01:20.69683Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ba01c767-4e1d-429b-9360-adc26a5c3f86/dismiss` → **409**

```json
{
  "command_id": "0782770c-3c26-4d40-a7db-1fe7fd3e28c4",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ba01c767-4e1d-429b-9360-adc26a5c3f86/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fbfe3896-61be-4b28-a4f0-0c90f4903ab9"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "52cc44dc-5938-4b47-8b4c-ee8f6bd343ad",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "36e1c199-0e31-4db0-86b3-dd809a1025f7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "raised_at": "2026-10-30T10:01:21.318713Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/36e1c199-0e31-4db0-86b3-dd809a1025f7/dismiss` → **200**

```json
{
  "command_id": "38f80515-1731-488c-97f6-957afb828882",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "36e1c199-0e31-4db0-86b3-dd809a1025f7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "raised_at": "2026-10-30T10:01:21.318713Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reviewed_at": "2026-10-30T10:01:21.621532Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2b696477-e5d1-452b-bf70-a03804b4591d",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ba01c767-4e1d-429b-9360-adc26a5c3f86"
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
      "actor_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:01:21.922201Z"
    }
  ]
}
```

Done: flag ba01c767-4e1d-429b-9360-adc26a5c3f86 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "26d20637-e073-4d70-bd1b-112625f8101d",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzODIsImlhdCI6MTc5MzM1NDQ4MiwianRpIjoiNTZhMjIzNTgtYzBjZC00NjJlLTg0ZWUtMjJlYzE3N2I2Y2Q0Iiwic2lkIjoiMjZkMjA2MzctZTA3My00ZDcwLWJkMWItMTEyNjI1ZjgxMDFkIn0.R3imht38q0IKtULb937NvXwdgCpqJSCOrFm-JVG1j00",
  "access_expires_at": "2026-10-30T10:16:22.853166894Z",
  "refresh_token": "NCLwFP1f6YBwz7spmtQFZ2unprGAvaHGdReA2_1orJw",
  "refresh_expires_at": "2026-10-30T22:01:22.852572069Z",
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
      "actor_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:01:21.922201Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e5f3eb93-0e3a-4c92-be60-77df6f40e808",
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
  "session_id": "7e09e184-9c73-445c-89ed-878fead57640",
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
  "last_heartbeat_at": "2026-10-30T10:01:16.782934Z",
  "last_location_at": "2026-10-30T10:01:16.782934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e09e184-9c73-445c-89ed-878fead57640/close` → **200**

```json
{
  "command_id": "f31632da-a01a-459b-aab7-71a42fe25586",
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
  "session_id": "2da0df38-3fd0-447e-9a15-781e2af00942",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzODQsImlhdCI6MTc5MzM1NDQ4NCwianRpIjoiYmNmZjcxZDAtNGMyZC00YWU5LTkxNGUtOWRjMDdkMDlmMmYwIiwic2lkIjoiMmRhMGRmMzgtM2ZkMC00NDdlLTlhMTUtNzgxZTJhZjAwOTQyIn0.0D6N1MErBPLcY1khWmersd5RUJ2BLFeByxT7vWEvyjg",
  "access_expires_at": "2026-10-30T10:16:24.684446502Z",
  "refresh_token": "ql8_2Iw2rcR-gj3Bww3YG5rYrwVem9J7-Ic84vTfzck",
  "refresh_expires_at": "2026-10-30T22:01:24.683781561Z",
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
  "command_id": "561c64cd-4ccb-4b88-bf04-1e5140d8cb4a",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:01:25.296676Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "561c64cd-4ccb-4b88-bf04-1e5140d8cb4a",
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
  "changed_by": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:01:25.296676Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48782228321",
  "device_ref": "sandbox-24085"
}
```

```json
{
  "challenge_id": "ea1fe951-f389-4597-b91c-9322f9bd15c6",
  "expires_at": "2026-10-30T10:06:25.928754619Z",
  "resend_available_at": "2026-10-30T10:01:26.928754619Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48782228321` → **200**

```json
{
  "phone": "+48782228321",
  "audience": "CLIENT",
  "code": "444596",
  "sent_at": "2026-10-30T10:01:25.93237947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea1fe951-f389-4597-b91c-9322f9bd15c6",
  "code": "444596",
  "device_ref": "sandbox-24085"
}
```

```json
{
  "session_id": "2edc0d4a-b014-4ec5-a46b-47c5c5dc3317",
  "subject": {
    "type": "CLIENT",
    "id": "7ff90249-df7d-4efa-b05f-fc5a807b1d41"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZmY5MDI0OS1kZjdkLTRlZmEtYjA1Zi1mYzVhODA3YjFkNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Mzg2LCJpYXQiOjE3OTMzNTQ0ODYsImp0aSI6IjJiNWIxYzZhLTQ0MDAtNGQ2Yi04NWQ4LTkyN2EwZWQ4ZWE4YyIsInNpZCI6IjJlZGMwZDRhLWIwMTQtNGVjNS1hNDZiLTQ3YzVjNWRjMzMxNyJ9.QFq0ycM5lbUatiqI_T7xoUN_yCIORVbW8lX085h0-0M",
  "access_expires_at": "2026-10-30T10:16:26.24737154Z",
  "refresh_token": "-O1ElHi4PGH6hHdJePeuuacklqb7sOUzHLvFykQ-uts",
  "refresh_expires_at": "2026-11-29T10:01:26.246854211Z",
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
  "correlation_id": "7201fb09-61da-48ed-ac05-244e8e8c083c"
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
  "device_ref": "sandbox-32026"
}
```

```json
{
  "challenge_id": "e4cc4954-db5a-4d8f-bb36-fcc7a03bbcea",
  "expires_at": "2026-10-30T10:06:27.130032Z",
  "resend_available_at": "2026-10-30T10:01:28.130032Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "379355",
  "sent_at": "2026-10-30T10:01:27.132379084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4cc4954-db5a-4d8f-bb36-fcc7a03bbcea",
  "code": "379355",
  "device_ref": "sandbox-32026"
}
```

```json
{
  "session_id": "009dd0a6-e96a-49d9-b21f-8293554ba121",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTM4NywiaWF0IjoxNzkzMzU0NDg3LCJqdGkiOiI4MWViZmI0Ni1mOWI0LTQ2OWItYjQzZC0yZjY2ZDhiZTYzYTIiLCJzaWQiOiIwMDlkZDBhNi1lOTZhLTQ5ZDktYjIxZi04MjkzNTU0YmExMjEifQ.nZTadfcI7rqU1tk1VKsc3luT1jDfdcvQT86WwBi-kAA",
  "access_expires_at": "2026-10-30T10:16:27.450938423Z",
  "refresh_token": "nA4p7aebwFXA1eS20O-e3gO1c4hnFXoukDdqlzqDnVQ",
  "refresh_expires_at": "2026-11-29T10:01:27.450401094Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1ae4ddd6-dab7-4225-991d-9108fdd4ee45",
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
  "last_heartbeat_at": "2026-10-30T10:00:54.482178Z",
  "last_location_at": "2026-10-30T10:00:54.482178Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1ae4ddd6-dab7-4225-991d-9108fdd4ee45/handover` → **200**

```json
{
  "command_id": "a562f8d6-4645-4aad-a173-1b1faf29c26f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1ae4ddd6-dab7-4225-991d-9108fdd4ee45",
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
  "last_heartbeat_at": "2026-10-30T10:00:54.482178Z",
  "last_location_at": "2026-10-30T10:00:54.482178Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1ae4ddd6-dab7-4225-991d-9108fdd4ee45/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:28Z",
    "sequence": 1793354488322
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1ae4ddd6-dab7-4225-991d-9108fdd4ee45",
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
  "last_heartbeat_at": "2026-10-30T10:01:28.342738Z",
  "last_location_at": "2026-10-30T10:01:28.342738Z",
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
  "session_id": "1ae4ddd6-dab7-4225-991d-9108fdd4ee45",
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
  "last_heartbeat_at": "2026-10-30T10:01:28.342738Z",
  "last_location_at": "2026-10-30T10:01:28.342738Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ae4ddd6-dab7-4225-991d-9108fdd4ee45/close` → **200**

```json
{
  "command_id": "421a16b9-507f-4726-8af9-c73c98fc4c4f",
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
  "correlation_id": "687872ea-753e-4c9f-a584-aa6135732b55"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671298223",
  "device_ref": "sandbox-25366"
}
```

```json
{
  "challenge_id": "be0a1ca8-1221-4857-ac2b-7a60b32d3684",
  "expires_at": "2026-10-30T10:06:29.808897891Z",
  "resend_available_at": "2026-10-30T10:01:30.808897891Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671298223` → **200**

```json
{
  "phone": "+380671298223",
  "audience": "CLIENT",
  "code": "402164",
  "sent_at": "2026-10-30T10:01:29.811902326Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be0a1ca8-1221-4857-ac2b-7a60b32d3684",
  "code": "402164",
  "device_ref": "sandbox-25366"
}
```

```json
{
  "session_id": "3078966e-967e-4c94-9a44-ed700b65d5e4",
  "subject": {
    "type": "CLIENT",
    "id": "9e9924c4-d331-41bf-8350-468732d6f0a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTk5MjRjNC1kMzMxLTQxYmYtODM1MC00Njg3MzJkNmYwYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzkwLCJpYXQiOjE3OTMzNTQ0OTAsImp0aSI6IjdhNjljNDg4LWMzMDEtNDcyZi04YjBmLTllNjNlZWM5ODJhNiIsInNpZCI6IjMwNzg5NjZlLTk2N2UtNGM5NC05YTQ0LWVkNzAwYjY1ZDVlNCJ9.ruAlJntrhI3JxLYPqGS_qF0ylpHQZUS9DtfW7X_3tVE",
  "access_expires_at": "2026-10-30T10:16:30.132465252Z",
  "refresh_token": "xc53HVyOmBEqsjjllZQTY0MUoIGFJD4K0NHKsUWwEAU",
  "refresh_expires_at": "2026-11-29T10:01:30.131906733Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "c0755c88-0f6d-4914-8bb4-48e8c9750c63",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "62f54071-7624-4df3-b21a-4b20d683cc82",
  "upload_path": "/api/rider/v1/uploads/62f54071-7624-4df3-b21a-4b20d683cc82",
  "expires_at": "2026-10-30T10:16:30.463440692Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/62f54071-7624-4df3-b21a-4b20d683cc82` → **200**

```json
{
  "file_id": "62f54071-7624-4df3-b21a-4b20d683cc82",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "60f8c6f4-aa2d-4d0f-818b-67c5c5a256d8",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "62f54071-7624-4df3-b21a-4b20d683cc82"
  ]
}
```

```json
{
  "id": "bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:01:30.800875Z",
  "updated_at": "2026-10-30T10:01:30.800875Z",
  "respond_by": "2026-10-30T14:01:30.800875Z",
  "messages": [
    {
      "id": "f3deb3cf-34a1-4747-a255-fdb067a2f8ea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:01:30.801701Z",
      "attachments": [
        {
          "file_id": "62f54071-7624-4df3-b21a-4b20d683cc82",
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
  "session_id": "d08743ab-69de-426b-99df-56e065e5dd06",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzOTEsImlhdCI6MTc5MzM1NDQ5MSwianRpIjoiMjUzODc1YzktYzlkMy00OGIxLWE2YWQtMzBmNWE4ZWQ0OGQxIiwic2lkIjoiZDA4NzQzYWItNjlkZS00MjZiLTk5ZGYtNTZlMDY1ZTVkZDA2In0.Jeiy491n-c65PfGPpysUEgw8-mHeCEByMNg77eKXTnQ",
  "access_expires_at": "2026-10-30T10:16:31.447326241Z",
  "refresh_token": "_dWi21e1GAkyCwh6LIEeNQsC9AwaCiUPErKgTg9jdjQ",
  "refresh_expires_at": "2026-10-30T22:01:31.446771166Z",
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
  "session_id": "311bf1de-4238-4bfe-9188-323db6af758d",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzOTIsImlhdCI6MTc5MzM1NDQ5MiwianRpIjoiM2Y5MTZiOGItODcxYi00NGNiLWE5ZGItM2FlMzExYmM0MDU2Iiwic2lkIjoiMzExYmYxZGUtNDIzOC00YmZlLTkxODgtMzIzZGI2YWY3NThkIn0.dg3LPJXXFPaKf9n6ADxSuRaFn0nfVkjj7w4crQhmv4w",
  "access_expires_at": "2026-10-30T10:16:32.066252685Z",
  "refresh_token": "czRXYIMoqfPEweTi5Asgll9XQKwVAGw-nDBYKLg8YlA",
  "refresh_expires_at": "2026-10-30T22:01:32.06562991Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4/attachments/62f54071-7624-4df3-b21a-4b20d683cc82` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ec497ee5-b76b-4da1-93ff-b7ebf55a4c72",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ebec160b-1dee-43b4-8c18-3d7240adad05",
  "upload_path": "/api/operator/v1/uploads/ebec160b-1dee-43b4-8c18-3d7240adad05",
  "expires_at": "2026-10-30T10:16:32.394633987Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ebec160b-1dee-43b4-8c18-3d7240adad05` → **200**

```json
{
  "file_id": "ebec160b-1dee-43b4-8c18-3d7240adad05",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4` → **200**

```json
{
  "id": "bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:01:30.800875Z",
  "updated_at": "2026-10-30T10:01:30.800875Z",
  "respond_by": "2026-10-30T14:01:30.800875Z",
  "messages": [
    {
      "id": "f3deb3cf-34a1-4747-a255-fdb067a2f8ea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:01:30.801701Z",
      "attachments": [
        {
          "file_id": "62f54071-7624-4df3-b21a-4b20d683cc82",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4/comments` → **200**

```json
{
  "command_id": "39647a1b-7379-47f6-b3ce-20dc74eb30cc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ebec160b-1dee-43b4-8c18-3d7240adad05"
  ]
}
```

```json
{
  "id": "bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:01:30.800875Z",
  "updated_at": "2026-10-30T10:01:33.043867Z",
  "respond_by": "2026-10-30T14:01:30.800875Z",
  "messages": [
    {
      "id": "f3deb3cf-34a1-4747-a255-fdb067a2f8ea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:01:30.801701Z",
      "attachments": [
        {
          "file_id": "62f54071-7624-4df3-b21a-4b20d683cc82",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "0fad13c8-e086-461f-9974-a6dca222011c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:01:33.043287Z",
      "attachments": [
        {
          "file_id": "ebec160b-1dee-43b4-8c18-3d7240adad05",
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

`GET /api/rider/v1/support/cases/bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4` → **200**

```json
{
  "id": "bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:01:30.800875Z",
  "updated_at": "2026-10-30T10:01:33.043867Z",
  "respond_by": "2026-10-30T14:01:30.800875Z",
  "messages": [
    {
      "id": "f3deb3cf-34a1-4747-a255-fdb067a2f8ea",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9e9924c4-d331-41bf-8350-468732d6f0a6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:01:30.801701Z",
      "attachments": [
        {
          "file_id": "62f54071-7624-4df3-b21a-4b20d683cc82",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "0fad13c8-e086-461f-9974-a6dca222011c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:01:33.043287Z",
      "attachments": [
        {
          "file_id": "ebec160b-1dee-43b4-8c18-3d7240adad05",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4/attachments/ebec160b-1dee-43b4-8c18-3d7240adad05` → **200**

Done: support case bb9d6ec9-194a-4794-b5ea-7a2ed8a298b4, rider attachment 62f54071-7624-4df3-b21a-4b20d683cc82, operator attachment ebec160b-1dee-43b4-8c18-3d7240adad05.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735163257",
  "device_ref": "sandbox-4998"
}
```

```json
{
  "challenge_id": "7e348bc6-b2f9-40fc-a791-5bfecabfa30c",
  "expires_at": "2026-10-30T10:06:33.656492871Z",
  "resend_available_at": "2026-10-30T10:01:34.656492871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735163257` → **200**

```json
{
  "phone": "+380735163257",
  "audience": "CLIENT",
  "code": "658957",
  "sent_at": "2026-10-30T10:01:33.658936854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e348bc6-b2f9-40fc-a791-5bfecabfa30c",
  "code": "658957",
  "device_ref": "sandbox-4998"
}
```

```json
{
  "session_id": "e5de7825-c57e-4d16-a0ef-93333670f2ab",
  "subject": {
    "type": "CLIENT",
    "id": "80738a2a-779d-4bd1-aa56-19970cfeb594"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MDczOGEyYS03NzlkLTRiZDEtYWE1Ni0xOTk3MGNmZWI1OTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1MzkzLCJpYXQiOjE3OTMzNTQ0OTMsImp0aSI6Ijk5MGVkZjU2LTc1NTAtNDQ2NS04YzI0LTFiY2UxYmZhMWM5NSIsInNpZCI6ImU1ZGU3ODI1LWM1N2UtNGQxNi1hMGVmLTkzMzMzNjcwZjJhYiJ9.j1NBfCjMbzdjEuNGxjndIuv-eF6xeln8eYHlPBeY2dM",
  "access_expires_at": "2026-10-30T10:16:33.978461009Z",
  "refresh_token": "Yt_8S-hnUI1Rv1JLnnM19IDjKcWNt7S4B_8XBhaqFKs",
  "refresh_expires_at": "2026-11-29T10:01:33.977931853Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "57abcd5b-76ff-47e7-bddb-52b3568f602d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b812868e-e18a-4d70-8afe-30566e435625",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b812868e-e18a-4d70-8afe-30566e435625",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "13fa06d525b17404c04607f941222e55",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b812868e-e18a-4d70-8afe-30566e435625",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735163257"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b812868e-e18a-4d70-8afe-30566e435625",
  "expires_at": "2026-10-30T10:31:34.265833Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/b812868e-e18a-4d70-8afe-30566e435625` → **200**

```json
{
  "id": "b812868e-e18a-4d70-8afe-30566e435625",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:31:34.265833Z",
  "card": {
    "id": "4e3511bf-585d-4b2f-b5e6-3bc7bbe76674",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4827",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:01:34.557917Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04a62580-928c-4b64-bc20-cafab2c46f3f",
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
  "id": "b09f3bef-3fad-4c68-a5f4-37c8afd0c9d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:06:34.882340Z",
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
  "command_id": "babba079-dc67-4a3b-815f-bc37e54983e7",
  "quote_id": "b09f3bef-3fad-4c68-a5f4-37c8afd0c9d2",
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
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9` → **200**

```json
{
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9` → **200**

```json
{
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
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

`GET /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9` → **200**

```json
{
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9/switch-to-cash` → **200**

```json
{
  "command_id": "5584d0e4-1842-434a-9422-b3680253c450",
  "expected_version": 3
}
```

```json
{
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9/switch-to-cash` → **409**

```json
{
  "command_id": "7a53c9a3-c39d-4712-b0ef-577b9bfc8b23",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "06e688a8-9ad1-43a0-826b-0fe3cc1888b0"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9` → **200**

```json
{
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9/cancel` → **200**

```json
{
  "command_id": "e15425fc-1dee-4ef8-abcc-ccd8085a7155",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5ba4e2d5-f0ab-4012-9a0c-c9665cd223e9",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "80738a2a-779d-4bd1-aa56-19970cfeb594",
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
  "created_at": "2026-10-30T10:01:35.182179Z",
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
  "session_id": "f18ebefe-9726-424c-86dc-0638a06d1e00",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTUzOTgsImlhdCI6MTc5MzM1NDQ5OCwianRpIjoiMjI5Nzc3NWYtMjQ2ZS00MTkwLTlkMWMtN2Y3OTRlNTc3Yjg2Iiwic2lkIjoiZjE4ZWJlZmUtOTcyNi00MjRjLTg2ZGMtMDYzOGEwNmQxZTAwIn0._hxXHxP3NWBV7bESs2ODGhLisDi_Vr7vw_VQ7RTQ-z8",
  "access_expires_at": "2026-10-30T10:16:38.982992263Z",
  "refresh_token": "Fh0de-CarWrZzBbqxrug_VH2r7ZTL6fxXu4oM1FrTw4",
  "refresh_expires_at": "2026-10-30T22:01:38.98245872Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25109"
}
```

```json
{
  "challenge_id": "33f2f42a-c8da-4cc9-b4e4-787bd01249c7",
  "expires_at": "2026-10-30T10:06:39.280030001Z",
  "resend_available_at": "2026-10-30T10:01:40.280030001Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "908586",
  "sent_at": "2026-10-30T10:01:39.282666802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33f2f42a-c8da-4cc9-b4e4-787bd01249c7",
  "code": "908586",
  "device_ref": "sandbox-25109"
}
```

```json
{
  "session_id": "6cd312c0-1aff-49df-9251-2140ba2d0319",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTM5OSwiaWF0IjoxNzkzMzU0NDk5LCJqdGkiOiJkZTE3MDZlMC1jMzM5LTQ4YWUtOWU3MS0yZjRmMjBhZDkxMDIiLCJzaWQiOiI2Y2QzMTJjMC0xYWZmLTQ5ZGYtOTI1MS0yMTQwYmEyZDAzMTkifQ.J3kW8aYPZwQPLPNDS-1HJHMxGaj_pVdlx5mvlRguIYA",
  "access_expires_at": "2026-10-30T10:16:39.601927038Z",
  "refresh_token": "tikwmbtfES4XwmtEuYBOwVpJnJbuM_BClsvTt2NpaY0",
  "refresh_expires_at": "2026-11-29T10:01:39.60135022Z",
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
      "actor_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:01:21.922201Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T10:01:23.450665Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "f3de9a18-07e1-432b-81b6-b7f928896f55",
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
  "device_ref": "sandbox-20998"
}
```

```json
{
  "challenge_id": "f18c4d3d-e5f3-4c59-84a8-74117e5a6fc0",
  "expires_at": "2026-10-30T10:06:40.824560644Z",
  "resend_available_at": "2026-10-30T10:01:41.824560644Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "078502",
  "sent_at": "2026-10-30T10:01:40.827396264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f18c4d3d-e5f3-4c59-84a8-74117e5a6fc0",
  "code": "078502",
  "device_ref": "sandbox-20998"
}
```

```json
{
  "session_id": "4db29877-fc2e-4b35-8690-efcc556126f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQwMSwiaWF0IjoxNzkzMzU0NTAxLCJqdGkiOiIyM2I2ZjYwNS1lMmRiLTRiNTgtYjM2ZC0zZGU4NzZhMzVlZDUiLCJzaWQiOiI0ZGIyOTg3Ny1mYzJlLTRiMzUtODY5MC1lZmNjNTU2MTI2ZjQifQ.ofj31iPnogR8fHUASI9gVYPy8RkozitJPyM0et4vAgc",
  "access_expires_at": "2026-10-30T10:16:41.152788015Z",
  "refresh_token": "a76rmrAaNHMpo6ymxd31gBaHHUkczMuXv-px84fxPfE",
  "refresh_expires_at": "2026-11-29T10:01:41.15221393Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:01:01.940689Z",
  "last_location_at": "2026-10-30T10:01:01.940689Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7b59429c-4c67-46d5-aca7-6a046e556748/handover` → **200**

```json
{
  "command_id": "3f1a2892-d1d9-4fdc-a50b-62a8b6fe0f7f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:01:01.940689Z",
  "last_location_at": "2026-10-30T10:01:01.940689Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7b59429c-4c67-46d5-aca7-6a046e556748/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:42Z",
    "sequence": 1793354502243
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:01:42.043926Z",
  "last_location_at": "2026-10-30T10:01:42.043926Z",
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
  "command_id": "c5b79b53-8674-4e50-8c82-3e2938079388",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:42Z",
    "sequence": 1793354502618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7835cdf5-c660-4745-9883-06c8a94df26a",
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
  "last_heartbeat_at": "2026-10-30T10:01:42.637554Z",
  "last_location_at": "2026-10-30T10:01:42.637554Z",
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
  "session_id": "f947783d-35af-4dca-9582-882bc04651cf",
  "subject": {
    "type": "STAFF",
    "id": "e6c93802-cbf7-4ba9-94ff-94a899790ee0"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmM5MzgwMi1jYmY3LTRiYTktOTRmZi05NGE4OTk3OTBlZTAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU0MDMsImlhdCI6MTc5MzM1NDUwMywianRpIjoiNjEwODc2NTAtNGZkOC00NDFmLWIyOGUtM2M0YmY2MTdkMTc3Iiwic2lkIjoiZjk0Nzc4M2QtMzVhZi00ZGNhLTk1ODItODgyYmMwNDY1MWNmIn0.S8ppXiSyohU0nsz8FarkpAb5FycOFw_TzaFWyAtmOnQ",
  "access_expires_at": "2026-10-30T10:16:43.261014478Z",
  "refresh_token": "EciOnQgZbUoA3IOXPBHqGoe5emIMOJz_sGBA1IV3jUM",
  "refresh_expires_at": "2026-10-30T22:01:43.260462868Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "30a7d1a5-bc18-42a3-abf2-389b13577b7a",
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
  "id": "1d1468b3-7a45-4b83-9c1d-5994d75a8671",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:06:43.551909Z",
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
  "command_id": "500d7ba4-f284-401a-b4c3-4fecae84a148",
  "quote_id": "1d1468b3-7a45-4b83-9c1d-5994d75a8671",
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
  "id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
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
  "created_at": "2026-10-30T10:01:43.944522Z",
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
    "id": "bada9814-4660-4391-8504-e26d41fad046",
    "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
    "expires_at": "2026-10-30T10:01:58.949968Z",
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

`POST /api/driver/v1/offers/bada9814-4660-4391-8504-e26d41fad046/accept` → **200**

```json
{
  "command_id": "dc0c1406-b645-4ebe-a421-cd42fec29d1e"
}
```

```json
{
  "id": "7c0532ab-21e2-487f-907c-f9a915c6f628",
  "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d7ac19e5-f845-45b0-b04a-78b39c9c0873",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d7ac19e5-f845-45b0-b04a-78b39c9c0873",
  "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
  "assignment_id": "7c0532ab-21e2-487f-907c-f9a915c6f628",
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

`POST /api/driver/v1/work-sessions/7835cdf5-c660-4745-9883-06c8a94df26a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:01:45Z",
    "sequence": 1793354505513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7835cdf5-c660-4745-9883-06c8a94df26a",
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
  "last_heartbeat_at": "2026-10-30T10:01:45.534702Z",
  "last_location_at": "2026-10-30T10:01:45.534702Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d7ac19e5-f845-45b0-b04a-78b39c9c0873/arrive` → **200**

```json
{
  "command_id": "2a91272c-a621-4bdf-aadd-a2a30449a45c",
  "expected_version": 0
}
```

```json
{
  "id": "d7ac19e5-f845-45b0-b04a-78b39c9c0873",
  "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
  "assignment_id": "7c0532ab-21e2-487f-907c-f9a915c6f628",
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
  "arrived_at": "2026-10-30T10:01:45.866398Z",
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

`POST /api/driver/v1/trips/d7ac19e5-f845-45b0-b04a-78b39c9c0873/start` → **200**

```json
{
  "command_id": "9508c733-9dc2-4ba0-bc77-7d1b5b0b048f",
  "expected_version": 1
}
```

```json
{
  "id": "d7ac19e5-f845-45b0-b04a-78b39c9c0873",
  "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
  "assignment_id": "7c0532ab-21e2-487f-907c-f9a915c6f628",
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
  "arrived_at": "2026-10-30T10:01:45.866398Z",
  "started_at": "2026-10-30T10:01:46.182588Z",
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

`POST /api/driver/v1/trips/d7ac19e5-f845-45b0-b04a-78b39c9c0873/complete` → **200**

```json
{
  "command_id": "381bcf92-fd90-4680-aded-7dbd084ed088",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:01:46Z",
  "cash_received": true
}
```

```json
{
  "id": "d7ac19e5-f845-45b0-b04a-78b39c9c0873",
  "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
  "assignment_id": "7c0532ab-21e2-487f-907c-f9a915c6f628",
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
  "arrived_at": "2026-10-30T10:01:45.866398Z",
  "started_at": "2026-10-30T10:01:46.182588Z",
  "completed_at": "2026-10-30T10:01:46.508896Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/b9366bd5-2063-4ead-917a-ea1e936e10aa` → **200**

```json
{
  "id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
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
    "id": "7c0532ab-21e2-487f-907c-f9a915c6f628",
    "order_id": "b9366bd5-2063-4ead-917a-ea1e936e10aa",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d7ac19e5-f845-45b0-b04a-78b39c9c0873",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:01:43.944522Z",
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
  "session_id": "7b59429c-4c67-46d5-aca7-6a046e556748",
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
  "last_heartbeat_at": "2026-10-30T10:01:42.043926Z",
  "last_location_at": "2026-10-30T10:01:42.043926Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b59429c-4c67-46d5-aca7-6a046e556748/close` → **200**

```json
{
  "command_id": "66cfb048-651f-4cf2-90ff-9e6cb8edd655",
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
  "session_id": "7835cdf5-c660-4745-9883-06c8a94df26a",
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
  "last_heartbeat_at": "2026-10-30T10:01:45.534702Z",
  "last_location_at": "2026-10-30T10:01:45.534702Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7835cdf5-c660-4745-9883-06c8a94df26a/close` → **200**

```json
{
  "command_id": "f6bc2ee8-7733-47a9-93db-b03273509f44",
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

Done: terminal order b9366bd5-2063-4ead-917a-ea1e936e10aa by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6702"
}
```

```json
{
  "challenge_id": "392e8fdd-8a37-4ea6-aa93-1088bdea64ed",
  "expires_at": "2026-10-30T10:06:51.612860567Z",
  "resend_available_at": "2026-10-30T10:01:52.612860567Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "805959",
  "sent_at": "2026-10-30T10:01:51.616534947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "392e8fdd-8a37-4ea6-aa93-1088bdea64ed",
  "code": "805959",
  "device_ref": "sandbox-6702"
}
```

```json
{
  "session_id": "15ededf9-47cf-46e3-8d52-6e12878531f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQxMSwiaWF0IjoxNzkzMzU0NTExLCJqdGkiOiI5YzFkMDBkMS02OTFiLTQ4MDctYmJmMi0wOThlZTUyM2UyZDMiLCJzaWQiOiIxNWVkZWRmOS00N2NmLTQ2ZTMtOGQ1Mi02ZTEyODc4NTMxZjQifQ.zy0FAnQ_70KPwCc2ZGQybFJ-iFTOqVgecXgHDWK-Qv4",
  "access_expires_at": "2026-10-30T10:16:51.934929696Z",
  "refresh_token": "lcTN1WjS01ZIoqjckH_wXWcn4o2cS6nEmQY95BWEYEg",
  "refresh_expires_at": "2026-11-29T10:01:51.93436054Z",
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
  "device_ref": "sandbox-18433"
}
```

```json
{
  "challenge_id": "829e7668-2f77-423e-947e-8e06a1126f02",
  "expires_at": "2026-10-30T10:06:52.516153504Z",
  "resend_available_at": "2026-10-30T10:01:53.516153504Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "865079",
  "sent_at": "2026-10-30T10:01:52.518616078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "829e7668-2f77-423e-947e-8e06a1126f02",
  "code": "865079",
  "device_ref": "sandbox-18433"
}
```

```json
{
  "session_id": "09c54934-f581-4c3b-a5f9-5f3f9d654d9f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQxMiwiaWF0IjoxNzkzMzU0NTEyLCJqdGkiOiI4MjEyZjI2NC03N2Q2LTQwYjQtOThhOC05MzNmMDM1ODg5MjciLCJzaWQiOiIwOWM1NDkzNC1mNTgxLTRjM2ItYTVmOS01ZjNmOWQ2NTRkOWYifQ.uZsGlmaWwSJmIhlo1if6PXb35TvVQRYFr8nLzaF9es8",
  "access_expires_at": "2026-10-30T10:16:52.835563144Z",
  "refresh_token": "1P4VU8LiU5AbwkT6lJ-Av58PRPW2a6ecOJK72ilVrwE",
  "refresh_expires_at": "2026-11-29T10:01:52.834930647Z",
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
  "device_ref": "sandbox-30252"
}
```

```json
{
  "challenge_id": "11e542c7-2d29-43dd-baf9-618eab1c922a",
  "expires_at": "2026-10-30T10:06:53.398819166Z",
  "resend_available_at": "2026-10-30T10:01:54.398819166Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "384557",
  "sent_at": "2026-10-30T10:01:53.401280337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11e542c7-2d29-43dd-baf9-618eab1c922a",
  "code": "384557",
  "device_ref": "sandbox-30252"
}
```

```json
{
  "session_id": "8692804a-b164-4a1b-9c16-58009e4e6449",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTQxMywiaWF0IjoxNzkzMzU0NTEzLCJqdGkiOiI3ZGM3ZGYzMi00MzcxLTRlNTktYjk4MC1kNjY4MDkzYWQ2NTUiLCJzaWQiOiI4NjkyODA0YS1iMTY0LTRhMWItOWMxNi01ODAwOWU0ZTY0NDkifQ.ngHjyWXe0EYAhHfAMzbkASLxfXBa33bYNu7P1RbsLwc",
  "access_expires_at": "2026-10-30T10:16:53.721293791Z",
  "refresh_token": "9_jRzmey97NyUwiVyGZrl-f5AzP2sks1b5JbQv_73T0",
  "refresh_expires_at": "2026-11-29T10:01:53.720746497Z",
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
  "phone": "+380690254884",
  "device_ref": "sandbox-8958"
}
```

```json
{
  "challenge_id": "9d84c428-ac64-4aae-869b-9ec5f5bd1167",
  "expires_at": "2026-10-30T10:06:54.280302347Z",
  "resend_available_at": "2026-10-30T10:01:55.280302347Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380690254884` → **200**

```json
{
  "phone": "+380690254884",
  "audience": "CLIENT",
  "code": "435594",
  "sent_at": "2026-10-30T10:01:54.282646989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d84c428-ac64-4aae-869b-9ec5f5bd1167",
  "code": "435594",
  "device_ref": "sandbox-8958"
}
```

```json
{
  "session_id": "90807d87-b6e3-4e43-a4bd-78ba06b4d3c9",
  "subject": {
    "type": "CLIENT",
    "id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYmI1YjJiYi03MTM5LTQyN2YtOTVhMy04MGI3MThjYjJmMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NDE0LCJpYXQiOjE3OTMzNTQ1MTQsImp0aSI6ImQ1MzliOWZkLTZkYzYtNDg3OS1hYjg2LWRmYTE5ZThhMWMxYSIsInNpZCI6IjkwODA3ZDg3LWI2ZTMtNGU0My1hNGJkLTc4YmEwNmI0ZDNjOSJ9.kwPOgiRNcXmDgcJzW83xisfuNUKxm37DJiHvTvY1VyE",
  "access_expires_at": "2026-10-30T10:16:54.59797846Z",
  "refresh_token": "A9tQwMO-2GgjnWalIQI9VmLU07T9A2lGU5pT7iiKXGc",
  "refresh_expires_at": "2026-11-29T10:01:54.597461976Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4a3cfbb-b9dc-4baf-99bc-77a0e84f63b5",
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
  "id": "e46cf86d-c25c-4a03-aa4f-8c8ea45be073",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:06:54.886939Z",
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
  "command_id": "b80b1337-ae2a-44d6-be85-1cad9934aff0",
  "quote_id": "e46cf86d-c25c-4a03-aa4f-8c8ea45be073",
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
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8bdec225-9a3a-4776-94cc-b85f070af9ee` → **200**

```json
{
  "id": "8bdec225-9a3a-4776-94cc-b85f070af9ee",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bb5b2bb-7139-427f-95a3-80b718cb2f0a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:01:55.1844Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
