# Sandbox transcript (2026-10-30T08:05:39Z, 7779873)

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
  "correlation_id": "eaa3946b-3710-483e-8123-825e631b8fee"
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
  "session_id": "f4150f3a-4e84-49b1-ba8e-6eb04458754d",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0NDUsImlhdCI6MTc5MzM0NzU0NSwianRpIjoiNDIzNmMxNDktNDU3Yi00NWY3LWEzZmQtNGIwZGE4ZWRmMDJmIiwic2lkIjoiZjQxNTBmM2EtNGU4NC00OWIxLWJhOGUtNmViMDQ0NTg3NTRkIn0.0bNqWfXCBDK_DH6hJdPOhqrHWf620_d9NbPRip7yF9o",
  "access_expires_at": "2026-10-30T08:20:45.764944546Z",
  "refresh_token": "UYGBHMqgBgBSODTNRnJ8AprK5jWqEgwGairLCVIZZt8",
  "refresh_expires_at": "2026-10-30T20:05:45.762791745Z",
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
  "session_id": "1adaa883-994a-419f-9fb4-fa9091ccdca3",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0NDcsImlhdCI6MTc5MzM0NzU0NywianRpIjoiNWRmZTE1MjAtYjhhOC00YTQwLTgzOTItZTE3ZWFjYzBjNDdhIiwic2lkIjoiMWFkYWE4ODMtOTk0YS00MTlmLTlmYjQtZmE5MDkxY2NkY2EzIn0.ByLvN30htlslQOKFevuagt_U8usaxttd0DzI4HHo1xA",
  "access_expires_at": "2026-10-30T08:20:47.169133928Z",
  "refresh_token": "J_2uDtUHYKEADqfZP_tBje0TbbKkEGcsWgC2Q6gOKBQ",
  "refresh_expires_at": "2026-10-30T20:05:47.168371643Z",
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
  "device_ref": "sandbox-11569"
}
```

```json
{
  "challenge_id": "2c90e0a4-13a5-491b-aba8-e05fe0cbb811",
  "expires_at": "2026-10-30T08:10:47.603268038Z",
  "resend_available_at": "2026-10-30T08:05:48.603268038Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "977978",
  "sent_at": "2026-10-30T08:05:47.615540046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c90e0a4-13a5-491b-aba8-e05fe0cbb811",
  "code": "977978",
  "device_ref": "sandbox-11569"
}
```

```json
{
  "session_id": "e614830a-1551-40e7-9d26-5695fabde977",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ0NywiaWF0IjoxNzkzMzQ3NTQ3LCJqdGkiOiIzY2EzNDliZC00ZGU5LTQwYjktYjUyNy04YTliNmMxZDExMTYiLCJzaWQiOiJlNjE0ODMwYS0xNTUxLTQwZTctOWQyNi01Njk1ZmFiZGU5NzcifQ.AjnGjBvDAZsYKZiUhQyzAgkiWIRt0PGnooZaYrRu5mg",
  "access_expires_at": "2026-10-30T08:20:47.860871696Z",
  "refresh_token": "k5sQOfc4zPVTDll_rmTCnbJjCmVWrGO3R2cLNYs7xZg",
  "refresh_expires_at": "2026-11-29T08:05:47.859719755Z",
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
  "command_id": "4d6cb302-f5fb-4d9f-9f64-4ef5397b409d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:48Z",
    "sequence": 1793347548288
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec3faab0-783c-49d2-8c5a-daefc502d302",
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
  "last_heartbeat_at": "2026-10-30T08:05:48.55485Z",
  "last_location_at": "2026-10-30T08:05:48.55485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634221276",
  "device_ref": "sandbox-10798"
}
```

```json
{
  "challenge_id": "9cc9a08f-cbeb-4c4c-966a-8b2b6efd3617",
  "expires_at": "2026-10-30T08:10:48.757364541Z",
  "resend_available_at": "2026-10-30T08:05:49.757364541Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634221276` → **200**

```json
{
  "phone": "+380634221276",
  "audience": "CLIENT",
  "code": "430320",
  "sent_at": "2026-10-30T08:05:48.76263528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cc9a08f-cbeb-4c4c-966a-8b2b6efd3617",
  "code": "430320",
  "device_ref": "sandbox-10798"
}
```

```json
{
  "session_id": "ef942bda-fd2e-4fdd-ae2d-cfedd1ea3737",
  "subject": {
    "type": "CLIENT",
    "id": "fe9a9cd2-db56-4aaf-b023-235a5642d3a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTlhOWNkMi1kYjU2LTRhYWYtYjAyMy0yMzVhNTY0MmQzYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NDQ4LCJpYXQiOjE3OTMzNDc1NDgsImp0aSI6IjM5MTQxYzg2LTdkNjMtNDlmMi04Zjc4LWU5YThkOGNjOTNkMiIsInNpZCI6ImVmOTQyYmRhLWZkMmUtNGZkZC1hZTJkLWNmZWRkMWVhMzczNyJ9.EJQYg_EEsyJpOOPMoxmf2UGsimBApzBh7_gga5ClDe8",
  "access_expires_at": "2026-10-30T08:20:48.986687876Z",
  "refresh_token": "mpuYc5RqVmYZ8b8MpjKxvBJMIjCqyHYnQfIOJwJddng",
  "refresh_expires_at": "2026-11-29T08:05:48.985795933Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5779c74c-ff17-4a69-9ca3-1f7583765b15",
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
  "id": "249fcb3a-9148-4ede-ac5a-ef038b85e670",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:10:49.221600Z",
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
  "command_id": "92c6641a-4800-4c14-9353-4a6d965e89bc",
  "quote_id": "249fcb3a-9148-4ede-ac5a-ef038b85e670",
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
  "id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe9a9cd2-db56-4aaf-b023-235a5642d3a8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:05:49.494098Z",
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
    "id": "608d6e03-f1cf-4a2d-b965-5d8ca08d7609",
    "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
    "expires_at": "2026-10-30T08:06:04.502883Z",
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

`POST /api/driver/v1/offers/608d6e03-f1cf-4a2d-b965-5d8ca08d7609/accept` → **200**

```json
{
  "command_id": "de40a103-6667-4b09-8f9a-13feda3fbbfd"
}
```

```json
{
  "id": "3472f579-a2cb-428f-afc5-5cbf26a090b7",
  "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "088b57dd-4ba2-4bea-ab38-be5d6ee6019b",
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
  "command_id": "8985c0f7-f389-48d5-806e-bca79d96cad5",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:05:50.374639974Z"
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
  "id": "088b57dd-4ba2-4bea-ab38-be5d6ee6019b",
  "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
  "assignment_id": "3472f579-a2cb-428f-afc5-5cbf26a090b7",
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

`POST /api/driver/v1/work-sessions/ec3faab0-783c-49d2-8c5a-daefc502d302/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:51Z",
    "sequence": 1793347551684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec3faab0-783c-49d2-8c5a-daefc502d302",
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
  "last_heartbeat_at": "2026-10-30T08:05:51.090365Z",
  "last_location_at": "2026-10-30T08:05:51.090365Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/088b57dd-4ba2-4bea-ab38-be5d6ee6019b/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3c75a006-c01f-4688-b7af-ac44ee438fb7",
  "expected_version": 0
}
```

```json
{
  "id": "088b57dd-4ba2-4bea-ab38-be5d6ee6019b",
  "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
  "assignment_id": "3472f579-a2cb-428f-afc5-5cbf26a090b7",
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
  "arrived_at": "2026-10-30T08:05:51.306562Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/088b57dd-4ba2-4bea-ab38-be5d6ee6019b/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0f818623-a30f-4d19-adaa-176e96cfc798",
  "expected_version": 1
}
```

```json
{
  "id": "088b57dd-4ba2-4bea-ab38-be5d6ee6019b",
  "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
  "assignment_id": "3472f579-a2cb-428f-afc5-5cbf26a090b7",
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
  "arrived_at": "2026-10-30T08:05:51.306562Z",
  "started_at": "2026-10-30T08:05:51.539875Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/088b57dd-4ba2-4bea-ab38-be5d6ee6019b/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b48e2eab-409a-48ef-af90-3fbf65a44cc0",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:05:51Z",
  "cash_received": true
}
```

```json
{
  "id": "088b57dd-4ba2-4bea-ab38-be5d6ee6019b",
  "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
  "assignment_id": "3472f579-a2cb-428f-afc5-5cbf26a090b7",
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
  "arrived_at": "2026-10-30T08:05:51.306562Z",
  "started_at": "2026-10-30T08:05:51.539875Z",
  "completed_at": "2026-10-30T08:05:51.768646Z",
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
  "session_id": "ec3faab0-783c-49d2-8c5a-daefc502d302",
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
  "last_heartbeat_at": "2026-10-30T08:05:51.090365Z",
  "last_location_at": "2026-10-30T08:05:51.090365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec3faab0-783c-49d2-8c5a-daefc502d302/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "902b6416-19a1-4494-a359-73ad3c58fe25",
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
  "command_id": "3a382687-c16b-43fb-bea2-1fd2f71544e8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:52Z",
    "sequence": 1793347552466
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
  "correlation_id": "ed8e32f6-86b0-4076-8d1f-5cf5da789dd4",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "dbcbe540-c0db-408c-b7d2-c5c64a32c2ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:52Z",
    "sequence": 1793347552683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4566b769-9b87-4aed-bdc7-cf5f0ecdd9c3",
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
  "last_heartbeat_at": "2026-10-30T08:05:52.701586Z",
  "last_location_at": "2026-10-30T08:05:52.701586Z",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:05:50.37464Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "57babebc-87a9-4566-88e4-1ad1bfb75db4",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:05:53.110306926Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4566b769-9b87-4aed-bdc7-cf5f0ecdd9c3",
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
  "last_heartbeat_at": "2026-10-30T08:05:52.701586Z",
  "last_location_at": "2026-10-30T08:05:52.701586Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4566b769-9b87-4aed-bdc7-cf5f0ecdd9c3/close` → **200**

```json
{
  "command_id": "aa08670e-e853-4b31-a10d-76f3b404ef5e",
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
  "session_id": "e5352c0a-d6ba-42fd-9ba8-8bc84b0aaada",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0NTQsImlhdCI6MTc5MzM0NzU1NCwianRpIjoiYmYyZWE5NDQtYzZlYy00NGMwLTg1OWYtNGZjN2ExNGI4MjIzIiwic2lkIjoiZTUzNTJjMGEtZDZiYS00MmZkLTliYTgtOGJjODRiMGFhYWRhIn0.0gkE-mrqUCQTQK7rOgbqFOZvWF6HqaAmUE4VIshLa7M",
  "access_expires_at": "2026-10-30T08:20:54.026545296Z",
  "refresh_token": "TDzhyrdxjaSmiHpopnaw5djCFvzgJwK8WMsBmUAQcOs",
  "refresh_expires_at": "2026-10-30T20:05:54.025691214Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "653c4f31-945a-4004-b1b6-1609860bd4ae",
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
  "id": "68e41014-1b2e-4139-a7d7-2249dee48439",
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
  "created_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "created_at": "2026-10-30T08:05:54.249721Z",
  "updated_at": "2026-10-30T08:05:54.249721Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637660225",
  "device_ref": "sandbox-1020"
}
```

```json
{
  "challenge_id": "176f9bc1-f26a-4b2c-9814-a082ff2bcf73",
  "expires_at": "2026-10-30T08:10:54.462279971Z",
  "resend_available_at": "2026-10-30T08:05:55.462279971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637660225` → **200**

```json
{
  "phone": "+380637660225",
  "audience": "CLIENT",
  "code": "675332",
  "sent_at": "2026-10-30T08:05:54.46693994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "176f9bc1-f26a-4b2c-9814-a082ff2bcf73",
  "code": "675332",
  "device_ref": "sandbox-1020"
}
```

```json
{
  "session_id": "4f48c5a5-acbd-49ac-99f5-066e22817f78",
  "subject": {
    "type": "CLIENT",
    "id": "0fda8e73-3209-4035-b8c7-eb1ee9530002"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmRhOGU3My0zMjA5LTQwMzUtYjhjNy1lYjFlZTk1MzAwMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NDU0LCJpYXQiOjE3OTMzNDc1NTQsImp0aSI6IjJhYmY4ZGY3LTcxZmUtNDA5NS1iNzZjLTk4YzQ4ZTkzYjNlMiIsInNpZCI6IjRmNDhjNWE1LWFjYmQtNDlhYy05OWY1LTA2NmUyMjgxN2Y3OCJ9.UmmgzOV1CsPZ3jVyUsu4uO6Eau43FzkF8m8q1sq88qg",
  "access_expires_at": "2026-10-30T08:20:54.689573391Z",
  "refresh_token": "Lq6IlROC5EJZaIRXDGTi4956C3u0tAb1aRw3PYRgufc",
  "refresh_expires_at": "2026-11-29T08:05:54.688853642Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637660225` → **200**

```json
{
  "client_id": "0fda8e73-3209-4035-b8c7-eb1ee9530002"
}
```

`POST /api/admin/v1/rider-wallets/0fda8e73-3209-4035-b8c7-eb1ee9530002/top-ups` → **201**

```json
{
  "command_id": "1c9b7611-19d6-424c-957f-d330fc73c43c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "0fda8e73-3209-4035-b8c7-eb1ee9530002",
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
      "id": "39b0734a-486a-4493-9690-cca0949055ab",
      "at": "2026-10-30T08:05:55.092132Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1f78225-ebf4-4341-b082-3fc6faa2b329",
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
  "id": "696e8a45-f840-4663-88dc-86c493a0600e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:10:55.316627Z",
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
      "id": "68e41014-1b2e-4139-a7d7-2249dee48439",
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
  "device_ref": "sandbox-11180"
}
```

```json
{
  "challenge_id": "c3755250-cff5-4dcb-9f04-feb6b1dbd3d9",
  "expires_at": "2026-10-30T08:10:55.529920416Z",
  "resend_available_at": "2026-10-30T08:05:56.529920416Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "492150",
  "sent_at": "2026-10-30T08:05:55.533736622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3755250-cff5-4dcb-9f04-feb6b1dbd3d9",
  "code": "492150",
  "device_ref": "sandbox-11180"
}
```

```json
{
  "session_id": "df89c251-8b8e-4604-a627-e302a0ee0047",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ1NSwiaWF0IjoxNzkzMzQ3NTU1LCJqdGkiOiIzMWJlYWM4Yy0yMTIwLTRlZGMtOTcyYy04NzVkNmE1YTkwNjMiLCJzaWQiOiJkZjg5YzI1MS04YjhlLTQ2MDQtYTYyNy1lMzAyYTBlZTAwNDcifQ.oxUi0Y-mZi5MbtYne3PF0Dx2Ks641kZp8vv7CtXV3hg",
  "access_expires_at": "2026-10-30T08:20:55.755825959Z",
  "refresh_token": "u8SRN39GXo4RtT5OMlVpPxFfs8yvKY0NpwtSI21LhRY",
  "refresh_expires_at": "2026-11-29T08:05:55.754983957Z",
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
  "command_id": "6b2cadb6-adff-49c6-93fb-8d96b084db38",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:56Z",
    "sequence": 1793347556155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa09d1d2-1e89-43a8-a982-7d98f76beaac",
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
  "last_heartbeat_at": "2026-10-30T08:05:56.176622Z",
  "last_location_at": "2026-10-30T08:05:56.176622Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "77f843b9-b560-4824-bb36-f568fcca1949",
  "quote_id": "696e8a45-f840-4663-88dc-86c493a0600e",
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
  "id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0fda8e73-3209-4035-b8c7-eb1ee9530002",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:05:56.398077Z",
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
  "client_id": "0fda8e73-3209-4035-b8c7-eb1ee9530002",
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
      "id": "39b0734a-486a-4493-9690-cca0949055ab",
      "at": "2026-10-30T08:05:55.092132Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
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
    "id": "28e7995e-4663-497d-a1a6-e526f9a15a7c",
    "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
    "expires_at": "2026-10-30T08:06:11.406026Z",
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

`POST /api/driver/v1/offers/28e7995e-4663-497d-a1a6-e526f9a15a7c/accept` → **200**

```json
{
  "command_id": "5b332d93-7f7b-4bc3-8bd1-f530858ade12"
}
```

```json
{
  "id": "9b06056e-c516-40e6-b3f9-235dd1fc7132",
  "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c3396b7-39ba-41f1-9de8-c7dc327a09f4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c3396b7-39ba-41f1-9de8-c7dc327a09f4",
  "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
  "assignment_id": "9b06056e-c516-40e6-b3f9-235dd1fc7132",
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

`POST /api/driver/v1/work-sessions/aa09d1d2-1e89-43a8-a982-7d98f76beaac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:05:57Z",
    "sequence": 1793347557448
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa09d1d2-1e89-43a8-a982-7d98f76beaac",
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
  "last_heartbeat_at": "2026-10-30T08:05:57.465712Z",
  "last_location_at": "2026-10-30T08:05:57.465712Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7c3396b7-39ba-41f1-9de8-c7dc327a09f4/arrive` → **200**

```json
{
  "command_id": "bddb80fc-af2b-4f8d-819f-1dfd4b4ff2e5",
  "expected_version": 0
}
```

```json
{
  "id": "7c3396b7-39ba-41f1-9de8-c7dc327a09f4",
  "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
  "assignment_id": "9b06056e-c516-40e6-b3f9-235dd1fc7132",
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
  "arrived_at": "2026-10-30T08:05:57.673532Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7c3396b7-39ba-41f1-9de8-c7dc327a09f4/start` → **200**

```json
{
  "command_id": "326df78f-1ff0-4816-9591-ea0616663e20",
  "expected_version": 1
}
```

```json
{
  "id": "7c3396b7-39ba-41f1-9de8-c7dc327a09f4",
  "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
  "assignment_id": "9b06056e-c516-40e6-b3f9-235dd1fc7132",
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
  "arrived_at": "2026-10-30T08:05:57.673532Z",
  "started_at": "2026-10-30T08:05:57.890013Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/7c3396b7-39ba-41f1-9de8-c7dc327a09f4/complete` → **200**

```json
{
  "command_id": "39842752-75a5-406a-a44c-1830e9d1ca80",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:05:58Z",
  "cash_received": true
}
```

```json
{
  "id": "7c3396b7-39ba-41f1-9de8-c7dc327a09f4",
  "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
  "assignment_id": "9b06056e-c516-40e6-b3f9-235dd1fc7132",
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
  "arrived_at": "2026-10-30T08:05:57.673532Z",
  "started_at": "2026-10-30T08:05:57.890013Z",
  "completed_at": "2026-10-30T08:05:58.117499Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0fda8e73-3209-4035-b8c7-eb1ee9530002",
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
      "id": "50912e58-7b99-42db-bd86-ff339cf723ae",
      "at": "2026-10-30T08:05:58.530767Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435"
    },
    {
      "id": "39b0734a-486a-4493-9690-cca0949055ab",
      "at": "2026-10-30T08:05:55.092132Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/68e41014-1b2e-4139-a7d7-2249dee48439/archive` → **200**

```json
{
  "command_id": "02e630c4-c909-492b-8307-3965fa89f9d7",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "68e41014-1b2e-4139-a7d7-2249dee48439",
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
  "created_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "created_at": "2026-10-30T08:05:54.249721Z",
  "updated_at": "2026-10-30T08:06:01.548167Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa09d1d2-1e89-43a8-a982-7d98f76beaac",
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
  "last_heartbeat_at": "2026-10-30T08:05:57.465712Z",
  "last_location_at": "2026-10-30T08:05:57.465712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa09d1d2-1e89-43a8-a982-7d98f76beaac/close` → **200**

```json
{
  "command_id": "164907f2-67ea-47f3-95d1-c142d456eac6",
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

Done: order fdf8e837-dcb6-4327-9d4f-2f63506ab435.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-25639"
}
```

```json
{
  "challenge_id": "b422c073-47e8-4625-9467-e66d5568778f",
  "expires_at": "2026-10-30T08:11:02.173176734Z",
  "resend_available_at": "2026-10-30T08:06:03.173176734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "918161",
  "sent_at": "2026-10-30T08:06:02.177626095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b422c073-47e8-4625-9467-e66d5568778f",
  "code": "918161",
  "device_ref": "sandbox-25639"
}
```

```json
{
  "session_id": "f590191f-0271-4137-a1e2-9c4dbfae77ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ2MiwiaWF0IjoxNzkzMzQ3NTYyLCJqdGkiOiJjMTEyOGFjNi00ZjZmLTRlZmUtYTg0Ni0zNzFiYmFlNTcwZjQiLCJzaWQiOiJmNTkwMTkxZi0wMjcxLTQxMzctYTFlMi05YzRkYmZhZTc3ZWQifQ.CV8sQyv8vmfBO0lr-shJwgmxUx246oTMXNlObLAW-gE",
  "access_expires_at": "2026-10-30T08:21:02.39687106Z",
  "refresh_token": "5ZuKGD4CMHCX4X-_fxYF4cVlBsRBHAZrz8UlWRgu_h0",
  "refresh_expires_at": "2026-11-29T08:06:02.396166143Z",
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
  "device_ref": "sandbox-1002"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "8c1f5041-aa30-4ebb-b321-f7e2a9a75229",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-1002"
}
```

```json
{
  "challenge_id": "cb8aca54-be70-479b-aea7-6ace08fe9fc0",
  "expires_at": "2026-10-30T08:11:03.983319268Z",
  "resend_available_at": "2026-10-30T08:06:04.983319268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "063188",
  "sent_at": "2026-10-30T08:06:03.986575538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb8aca54-be70-479b-aea7-6ace08fe9fc0",
  "code": "063188",
  "device_ref": "sandbox-1002"
}
```

```json
{
  "session_id": "3b2904c9-d765-4fad-a3e5-b1bc88363fdd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ2NCwiaWF0IjoxNzkzMzQ3NTY0LCJqdGkiOiI4YTUwNTJkYy1kOGNhLTQ4ODQtOTUzZS1mOGE1M2RmY2UxNGQiLCJzaWQiOiIzYjI5MDRjOS1kNzY1LTRmYWQtYTNlNS1iMWJjODgzNjNmZGQifQ.wyQWNZm7zz_X-LZ2_Vd1UDnPfv2vmEIoVyNRDkjVkQI",
  "access_expires_at": "2026-10-30T08:21:04.200833366Z",
  "refresh_token": "onMOP1nICP5xdZgyhGhQsGMulIJboOyb7eck5mFcmu8",
  "refresh_expires_at": "2026-11-29T08:06:04.200330833Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-148"
}
```

```json
{
  "challenge_id": "6872d5f3-8dc3-4b67-ae15-d9de12681398",
  "expires_at": "2026-10-30T08:11:04.39057218Z",
  "resend_available_at": "2026-10-30T08:06:05.39057218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "905389",
  "sent_at": "2026-10-30T08:06:04.393077618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6872d5f3-8dc3-4b67-ae15-d9de12681398",
  "code": "905389",
  "device_ref": "sandbox-148"
}
```

```json
{
  "session_id": "83f1ba82-2334-4a4e-acfe-9c1bb2513515",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ2NCwiaWF0IjoxNzkzMzQ3NTY0LCJqdGkiOiI4YzI1MDU4Ni1kOTRmLTRiNjQtYTNmNS1mMTkwNDFlZWJlNTIiLCJzaWQiOiI4M2YxYmE4Mi0yMzM0LTRhNGUtYWNmZS05YzFiYjI1MTM1MTUifQ.4SXPJJLevxT9pfs3OJg5ri17TP6r4xB4a8XGQ6kx9s0",
  "access_expires_at": "2026-10-30T08:21:04.609307509Z",
  "refresh_token": "ctC4a3gXt-ziqWZ5_hT7SdI9VsaJbjIimg2uVMXQoNc",
  "refresh_expires_at": "2026-11-29T08:06:04.608610526Z",
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
  "command_id": "c80f25e2-1664-42ef-9ce6-68d7066ef247",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:05Z",
    "sequence": 1793347565187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "da752114-027b-4a57-929a-a076d80b91d5",
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
  "last_heartbeat_at": "2026-10-30T08:06:05.204542Z",
  "last_location_at": "2026-10-30T08:06:05.204542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600777654",
  "device_ref": "sandbox-5279"
}
```

```json
{
  "challenge_id": "64ad516a-3a58-4ef7-bbfd-e0191ad1114e",
  "expires_at": "2026-10-30T08:11:05.400024125Z",
  "resend_available_at": "2026-10-30T08:06:06.400024125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600777654` → **200**

```json
{
  "phone": "+48600777654",
  "audience": "CLIENT",
  "code": "177452",
  "sent_at": "2026-10-30T08:06:05.403559135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64ad516a-3a58-4ef7-bbfd-e0191ad1114e",
  "code": "177452",
  "device_ref": "sandbox-5279"
}
```

```json
{
  "session_id": "de80f9fb-f35c-41db-bb4e-eca9fd629afa",
  "subject": {
    "type": "CLIENT",
    "id": "9fcf4eaf-e394-423e-bd65-a5008da539d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmNmNGVhZi1lMzk0LTQyM2UtYmQ2NS1hNTAwOGRhNTM5ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NDY1LCJpYXQiOjE3OTMzNDc1NjUsImp0aSI6IjdiNTBhNjQ3LWQxNGYtNGVkNy1iMzhhLTI5ZWQzMDdiMTIzMCIsInNpZCI6ImRlODBmOWZiLWYzNWMtNDFkYi1iYjRlLWVjYTlmZDYyOWFmYSJ9.2ZZZjDkxrjJ3ebaM6h57rqto433yXRakNhnpMCP0jN4",
  "access_expires_at": "2026-10-30T08:21:05.617886803Z",
  "refresh_token": "qzjb7Jx580cv3iC8Wsbi88_6sKAC7BrdXGg3v5pFaUk",
  "refresh_expires_at": "2026-11-29T08:06:05.617134083Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "95517405-71aa-4ead-b816-710b19519cbb",
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
  "id": "4c9a8c5a-6d9e-454b-b512-cd4d557f1a9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:05.822125Z",
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
  "command_id": "6f9d9f70-81c9-4572-91f6-8ab46ec5debd",
  "quote_id": "4c9a8c5a-6d9e-454b-b512-cd4d557f1a9a",
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
  "id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fcf4eaf-e394-423e-bd65-a5008da539d8",
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
  "created_at": "2026-10-30T08:06:06.039228Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65` → **200**

```json
{
  "id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fcf4eaf-e394-423e-bd65-a5008da539d8",
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
  "created_at": "2026-10-30T08:06:06.039228Z",
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

`POST /api/driver/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65/claim` → **422**

```json
{
  "command_id": "bffd6eeb-34ad-4df2-b336-27a4218686f3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "f860b78e-105a-402c-8c0c-dc2c87b62f93"
}
```

`GET /api/rider/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65` → **200**

```json
{
  "id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fcf4eaf-e394-423e-bd65-a5008da539d8",
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
  "created_at": "2026-10-30T08:06:06.039228Z",
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

`POST /api/driver/v1/orders/a5226168-06ce-4250-be40-d7e930914129/claim` → **404**

```json
{
  "command_id": "124c15f0-049d-4e8b-bb88-e3e3347b524a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a5226168-06ce-4250-be40-d7e930914129/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7d31a13f-a37a-462e-ab2e-d189ceb408fe"
}
```

`POST /api/driver/v1/orders/c17b9612-c819-421c-84a6-2525140a0bda/claim` → **404**

```json
{
  "command_id": "cbf47909-ff04-46bf-b590-8cf5ae978c04"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c17b9612-c819-421c-84a6-2525140a0bda/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dc5148cc-6004-4b71-9a40-02a53b740fc4"
}
```

`POST /api/driver/v1/orders/3bf3bd46-266e-475d-bd18-0bb7e86390b9/claim` → **404**

```json
{
  "command_id": "e913ca75-345d-4849-935e-7a294522dce7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3bf3bd46-266e-475d-bd18-0bb7e86390b9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2e38a96e-25fa-4c79-a189-57b05e760e1c"
}
```

`POST /api/driver/v1/orders/955bc70a-0303-4165-be49-2d66a8be4178/claim` → **404**

```json
{
  "command_id": "6b4df78d-255e-41b3-9137-5b69fc209938"
}
```

```json
{
  "instance": "/api/driver/v1/orders/955bc70a-0303-4165-be49-2d66a8be4178/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e6ab76b8-72a5-4ee2-b0b2-f083ea1d8188"
}
```

`POST /api/driver/v1/orders/a298ead5-23c0-4196-af78-5347fe1accbb/claim` → **404**

```json
{
  "command_id": "d682588b-326b-4545-a9ff-fa3864bbea2c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a298ead5-23c0-4196-af78-5347fe1accbb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f5c2fc45-da19-409c-bba0-4c53cc45f42c"
}
```

`POST /api/driver/v1/orders/8d3acae5-0721-425e-b89a-4e7699cd72ac/claim` → **404**

```json
{
  "command_id": "ea868213-4952-4ef1-bcfa-4661e7797cdd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8d3acae5-0721-425e-b89a-4e7699cd72ac/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0b7d298d-2105-4385-85d7-b7391730eb2d"
}
```

`POST /api/driver/v1/orders/f3df3366-bad1-4913-91a8-57f5f9e00f36/claim` → **404**

```json
{
  "command_id": "4c3141b3-3c86-42cb-bf8d-3b01027a8c88"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f3df3366-bad1-4913-91a8-57f5f9e00f36/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "29bc5852-e49a-47ec-adb1-8b1eb7f5fbf3"
}
```

`POST /api/driver/v1/orders/9e71b764-00ac-4fd8-8941-1b13d9ae4d6b/claim` → **404**

```json
{
  "command_id": "b701b963-b6d9-4753-bc7e-9c4e4e3651ab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9e71b764-00ac-4fd8-8941-1b13d9ae4d6b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0b896e2b-5461-4ac8-b548-2987c4d08618"
}
```

`POST /api/driver/v1/orders/3886a6b6-2933-48b2-8a26-47168f7fd95c/claim` → **404**

```json
{
  "command_id": "3dcf6f47-565f-479f-99c7-e11c7d4853da"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3886a6b6-2933-48b2-8a26-47168f7fd95c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7aba2981-261f-4b92-afca-4d7b5a2c90dc"
}
```

`POST /api/driver/v1/orders/a5638d94-aa0f-49de-90a7-1ae5c3856ae7/claim` → **404**

```json
{
  "command_id": "d9ed424d-5648-406d-a20d-1862a5e14cb4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a5638d94-aa0f-49de-90a7-1ae5c3856ae7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c396311a-83b9-4a1b-b4ec-d62820baa6d9"
}
```

`POST /api/driver/v1/orders/87b9bdf6-f6ac-4aff-95e8-3c8c2de082ca/claim` → **404**

```json
{
  "command_id": "905d8fe7-3b58-447f-8c8f-241f0456cbd2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/87b9bdf6-f6ac-4aff-95e8-3c8c2de082ca/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "699b2a21-7d57-4956-82c4-02c75833e99e"
}
```

`POST /api/driver/v1/orders/1687d31e-3cb0-4ad4-adad-178b92b5fb9a/claim` → **404**

```json
{
  "command_id": "6b450918-36a8-4aeb-870b-ec16924680d9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1687d31e-3cb0-4ad4-adad-178b92b5fb9a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "345fd35c-2c5a-4e3d-b174-89c3dafbc46a"
}
```

`POST /api/driver/v1/orders/038f01ad-0b48-444e-82be-00fe0ae09399/claim` → **404**

```json
{
  "command_id": "0c54b379-f848-4f74-a9c9-29254336b2ca"
}
```

```json
{
  "instance": "/api/driver/v1/orders/038f01ad-0b48-444e-82be-00fe0ae09399/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cfaf06a9-4cf1-494d-904f-09ae1b4de7e0"
}
```

`POST /api/driver/v1/orders/4b23885d-eccc-4ce3-8166-3cd92af65475/claim` → **404**

```json
{
  "command_id": "79fb9fd8-caec-4c6f-be5f-e03afb57cb2b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4b23885d-eccc-4ce3-8166-3cd92af65475/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4e3d125d-71ee-42c0-872e-e703d58d602e"
}
```

`POST /api/driver/v1/orders/e85f4c5d-1ed7-422b-a9eb-30509fbb3c71/claim` → **404**

```json
{
  "command_id": "38a13aee-1bd2-45c4-b1d8-5f6acccc5aad"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e85f4c5d-1ed7-422b-a9eb-30509fbb3c71/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1882a56b-a374-4358-9e59-a319e009e801"
}
```

`POST /api/driver/v1/orders/45a529ad-8d7d-4d81-849b-d2fe170dfffe/claim` → **404**

```json
{
  "command_id": "8505da8b-2774-44fe-93e1-153748c6e601"
}
```

```json
{
  "instance": "/api/driver/v1/orders/45a529ad-8d7d-4d81-849b-d2fe170dfffe/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d458497d-9fb6-473d-aab2-c87e46cab948"
}
```

`POST /api/driver/v1/orders/17651b02-e44a-4583-8a13-bed11a9a880a/claim` → **404**

```json
{
  "command_id": "090f72a5-66a4-48f4-8e2b-24f3dca7962e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/17651b02-e44a-4583-8a13-bed11a9a880a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0e8bba1d-4449-498a-821c-53533d0b7c6a"
}
```

`POST /api/driver/v1/orders/40031f0a-83e1-4cdd-a52a-26fa51f28eeb/claim` → **404**

```json
{
  "command_id": "baddba9e-f54a-4633-b79a-0cdae0376773"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40031f0a-83e1-4cdd-a52a-26fa51f28eeb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "40925de4-f275-4156-ad15-e28cdb8d06eb"
}
```

`POST /api/driver/v1/orders/c8f9104f-6347-4a72-88e2-a3c481955fce/claim` → **404**

```json
{
  "command_id": "f2b4f83e-215d-4ae7-8def-32811b18d7f4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c8f9104f-6347-4a72-88e2-a3c481955fce/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8485e682-454a-4444-b517-530c37cb723a"
}
```

`POST /api/driver/v1/orders/c7515329-7796-4ffc-87c4-6e0b192194c7/claim` → **404**

```json
{
  "command_id": "ddf418c6-f466-44f2-8732-de14802cc570"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c7515329-7796-4ffc-87c4-6e0b192194c7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5eed7fa8-f563-4076-9e2f-0558c59a47ed"
}
```

`POST /api/driver/v1/orders/e17dcb57-a188-4dad-9285-55b7ab525e86/claim` → **404**

```json
{
  "command_id": "954019dc-dcef-4b99-bc39-178773d89554"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e17dcb57-a188-4dad-9285-55b7ab525e86/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0985f929-d492-490f-bcc3-e7f62a952138"
}
```

`POST /api/driver/v1/orders/06037db3-2cc0-49aa-a5d2-71e8caf47485/claim` → **404**

```json
{
  "command_id": "0c8034c0-40b6-4ed5-8e0f-4a9af2deb399"
}
```

```json
{
  "instance": "/api/driver/v1/orders/06037db3-2cc0-49aa-a5d2-71e8caf47485/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "60a63331-2f7d-47bc-a8d0-4718bf8f889b"
}
```

`POST /api/driver/v1/orders/9717ac85-1b84-4dc3-baf2-0f47f2172ac1/claim` → **404**

```json
{
  "command_id": "f1021a2d-7144-4afd-9ce7-5cd2b46c90d2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9717ac85-1b84-4dc3-baf2-0f47f2172ac1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "db6a9b2d-83e3-4820-93ca-59c7fff47d71"
}
```

`POST /api/driver/v1/orders/95526a7d-3443-4fe0-807d-ce8651d97554/claim` → **404**

```json
{
  "command_id": "caadd1c2-13b5-4a1c-ad45-6bf4034c976b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/95526a7d-3443-4fe0-807d-ce8651d97554/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "963a2620-08e2-4eaa-865b-9e5fdf69790e"
}
```

`POST /api/driver/v1/orders/8151f0a3-c315-4ee8-a3d1-3d91c0c6ac59/claim` → **404**

```json
{
  "command_id": "87d87820-de56-4ee2-a2c7-4d6a02cf9d3d"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8151f0a3-c315-4ee8-a3d1-3d91c0c6ac59/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "84b84dd1-e578-4e64-b4ac-a6c7e01bf092"
}
```

`POST /api/driver/v1/orders/72410166-bd01-44e3-a1e5-589c9d5fb236/claim` → **404**

```json
{
  "command_id": "edc5933a-a6e9-4c1e-8cda-da34dbdafe0a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/72410166-bd01-44e3-a1e5-589c9d5fb236/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7e6ecac2-c2ad-4d65-91af-5c02c9d3cd45"
}
```

`POST /api/driver/v1/orders/6bf4e1f6-1a7d-4ff7-8b3f-31af0c001993/claim` → **404**

```json
{
  "command_id": "f61c3b7c-1cb0-455c-85a2-997e34fa6060"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6bf4e1f6-1a7d-4ff7-8b3f-31af0c001993/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f458bd68-0817-47e2-9f83-f74a70cb0239"
}
```

`POST /api/driver/v1/orders/bc4e0078-9055-4c9f-89cb-249db393170f/claim` → **404**

```json
{
  "command_id": "505b9c9c-4848-4dba-ad59-6f51964daf22"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bc4e0078-9055-4c9f-89cb-249db393170f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6906863d-f244-4132-a62e-8e8a22112815"
}
```

`POST /api/driver/v1/orders/0576a448-c976-480b-ba9b-5eedcfb7c882/claim` → **404**

```json
{
  "command_id": "21fa8c59-5c41-4958-bc04-111d0e5c2347"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0576a448-c976-480b-ba9b-5eedcfb7c882/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "82dff637-638b-4de0-8658-e5f82357e2f0"
}
```

`POST /api/driver/v1/orders/1a30f8a7-b271-47af-8b7e-cbe4c5974a9a/claim` → **429**

```json
{
  "command_id": "7982cd75-63a0-4d73-9b85-6c4d2f143482"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1a30f8a7-b271-47af-8b7e-cbe4c5974a9a/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "2ed4f482-ca01-42ee-b33c-1ef91413dfcb",
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
  "command_id": "ad83d4c7-4138-4695-b2f2-e20531dda834",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:13Z",
    "sequence": 1793347573570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7b61f6bd-123f-42f5-9e4e-6d4eb9e63802",
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
  "last_heartbeat_at": "2026-10-30T08:06:13.587149Z",
  "last_location_at": "2026-10-30T08:06:13.587149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
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

`POST /api/driver/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65/claim` → **409**

```json
{
  "command_id": "99b347a1-ed8d-4bf9-ab1e-b108d6e0cb62"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "eaf341c8-77da-4997-8658-936dd77ecad2"
}
```

`POST /api/driver/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65/claim` → **200**

```json
{
  "command_id": "23432679-dbce-4b44-a314-28a4eeea92da"
}
```

```json
{
  "id": "d0caa311-0d56-4b99-a440-8ea3e1157f1a",
  "order_id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "d61caf89-9fe8-4bef-ac4a-201a186e8489",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d61caf89-9fe8-4bef-ac4a-201a186e8489",
  "order_id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "assignment_id": "d0caa311-0d56-4b99-a440-8ea3e1157f1a",
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

`POST /api/driver/v1/trips/d61caf89-9fe8-4bef-ac4a-201a186e8489/cancel` → **200**

```json
{
  "command_id": "6548f9ab-37f7-4a6b-b95f-8918c7154f8d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "d61caf89-9fe8-4bef-ac4a-201a186e8489",
  "order_id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "assignment_id": "d0caa311-0d56-4b99-a440-8ea3e1157f1a",
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

`GET /api/rider/v1/orders/d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65` → **200**

```json
{
  "id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9fcf4eaf-e394-423e-bd65-a5008da539d8",
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
    "id": "d0caa311-0d56-4b99-a440-8ea3e1157f1a",
    "order_id": "d4d4feaa-2f51-4a53-a6fd-ae6eb4d9cb65",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "d61caf89-9fe8-4bef-ac4a-201a186e8489",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:06:06.039228Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "pl": "Pasażer poprosił o anulowanie",
      "ru": "Пассажир попросил отменить",
      "en": "Passenger asked to cancel",
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
  "session_id": "da752114-027b-4a57-929a-a076d80b91d5",
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
  "last_heartbeat_at": "2026-10-30T08:06:05.204542Z",
  "last_location_at": "2026-10-30T08:06:05.204542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da752114-027b-4a57-929a-a076d80b91d5/close` → **200**

```json
{
  "command_id": "fd7064b8-ddaf-4f99-9e09-8bdd19007020",
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
  "session_id": "7b61f6bd-123f-42f5-9e4e-6d4eb9e63802",
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
  "last_heartbeat_at": "2026-10-30T08:06:13.587149Z",
  "last_location_at": "2026-10-30T08:06:13.587149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7b61f6bd-123f-42f5-9e4e-6d4eb9e63802/close` → **200**

```json
{
  "command_id": "bf89a7a4-108e-415c-a1bf-5b4a3a7cb5e2",
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
  "session_id": "f6c2e812-07cb-4c09-980e-a47868445ada",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0NzYsImlhdCI6MTc5MzM0NzU3NiwianRpIjoiYmVjYjc4ZjMtMjBlYy00MGFjLThjMGMtNmRiNTVmNjlkZDhlIiwic2lkIjoiZjZjMmU4MTItMDdjYi00YzA5LTk4MGUtYTQ3ODY4NDQ1YWRhIn0.JGlenbdBRpNnZwKXZkydbLxgvHBfINu1QgadkdJdhp4",
  "access_expires_at": "2026-10-30T08:21:16.032359492Z",
  "refresh_token": "rgL23rVbX16ZQ2wqIpkDvCT1IXoVNPwHrJjP9aT1eO8",
  "refresh_expires_at": "2026-10-30T20:06:16.031749609Z",
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
  "command_id": "03746290-ddd1-4145-bbda-17306068a1bf",
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
  "session_id": "3b33cd53-c637-48f2-b994-f15e549235f7",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0NzYsImlhdCI6MTc5MzM0NzU3NiwianRpIjoiMmE2YmI5MjgtYjlmOC00ZTgxLTkwMDMtN2QwZTIzMzI0MjVhIiwic2lkIjoiM2IzM2NkNTMtYzYzNy00OGYyLWI5OTQtZjE1ZTU0OTIzNWY3In0.Gv8DQf51Kisp9oXPAmWrv9Atu1zK8PWtpFrC5Fx-XQA",
  "access_expires_at": "2026-10-30T08:21:16.870108023Z",
  "refresh_token": "zndMlSHsHpZdhHai-3z7kY-Unze_qCdF_NkAEDxjYZg",
  "refresh_expires_at": "2026-10-30T20:06:16.869566174Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.802120887",
    "linkedid": "1730052700.802120887",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673814779"
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
    "id": "1730052700.802120887",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "89981587-017d-4059-a778-625004d4faa3",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673814779",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:06:17.06539Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:06:17.084992Z",
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
    "id": "1730052600.1685530364",
    "linkedid": "1730052600.1685530364",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673814779"
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
      "id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673814779",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:06:17.322037Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a021c5a3-33c6-460c-9821-1bb858537cdc/answer` → **200**

```json
{
  "command_id": "642a702c-9107-4145-a8cc-334134d9b8f7"
}
```

```json
{
  "id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673814779",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "order_ids": [],
  "started_at": "2026-10-30T08:06:17.322037Z",
  "answered_at": "2026-10-30T08:06:17.553258Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1685530364",
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
    "id": "1730052600.1685530364",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673814779",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [],
      "started_at": "2026-10-30T08:06:17.322037Z",
      "answered_at": "2026-10-30T08:06:17.553258Z",
      "ended_at": "2026-10-30T08:06:17.771751Z",
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
      "id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673814779",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [],
      "started_at": "2026-10-30T08:06:17.322037Z",
      "answered_at": "2026-10-30T08:06:17.553258Z",
      "ended_at": "2026-10-30T08:06:17.771751Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:06:18.22904Z"
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
      "id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673814779",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [],
      "started_at": "2026-10-30T08:06:17.322037Z",
      "answered_at": "2026-10-30T08:06:17.553258Z",
      "ended_at": "2026-10-30T08:06:17.771751Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:06:18.22904Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a021c5a3-33c6-460c-9821-1bb858537cdc/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a021c5a3-33c6-460c-9821-1bb858537cdc/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a021c5a3-33c6-460c-9821-1bb858537cdc` → **200**

```json
{
  "changes": [
    {
      "id": "68f1f734-d6b6-4e73-a95f-7d5f2ddeeea6",
      "occurred_at": "2026-10-30T08:06:20.425446Z",
      "actor_type": "STAFF",
      "actor_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c547c2f8-69ba-4023-989b-22ba03b545b3\", \"order_ids\": []}",
      "correlation_id": "053fff8e-c8ed-4496-83b9-6eb6a04a4eed"
    },
    {
      "id": "8e50f4a7-19bd-4b50-8341-73ff39c1e3d6",
      "occurred_at": "2026-10-30T08:06:20.400217Z",
      "actor_type": "STAFF",
      "actor_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c547c2f8-69ba-4023-989b-22ba03b545b3\", \"order_ids\": []}",
      "correlation_id": "e2d9e39a-9045-4318-99b2-cffb500d3bed"
    }
  ]
}
```

Done: call a021c5a3-33c6-460c-9821-1bb858537cdc recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4546"
}
```

```json
{
  "challenge_id": "166719db-e6a0-4712-987b-68166374086c",
  "expires_at": "2026-10-30T08:11:20.648878423Z",
  "resend_available_at": "2026-10-30T08:06:21.648878423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "135084",
  "sent_at": "2026-10-30T08:06:20.652517963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "166719db-e6a0-4712-987b-68166374086c",
  "code": "135084",
  "device_ref": "sandbox-4546"
}
```

```json
{
  "session_id": "17dda65b-be6e-4ae8-800f-d341a771659d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ4MCwiaWF0IjoxNzkzMzQ3NTgwLCJqdGkiOiIyYjFlNGM2MC1hMGY2LTRmMTUtOTFiMS1mNTY3ZDY0NmIyMjAiLCJzaWQiOiIxN2RkYTY1Yi1iZTZlLTRhZTgtODAwZi1kMzQxYTc3MTY1OWQifQ.gyLtpZXmcD4MCpBZswHTClkHkhK1WGRRr6ZV7pWNny0",
  "access_expires_at": "2026-10-30T08:21:20.865847912Z",
  "refresh_token": "KnwHQRyR9n1L7AI5DVlgNmkSsXZ6wCJX_W5MMrMkbM0",
  "refresh_expires_at": "2026-11-29T08:06:20.865425141Z",
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
  "command_id": "8e1c0e42-1249-40f6-b5f8-3b29f40c4b1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:21Z",
    "sequence": 1793347581252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "80ffa700-a61c-4fcc-b199-53cce1abc381",
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
  "last_heartbeat_at": "2026-10-30T08:06:21.268603Z",
  "last_location_at": "2026-10-30T08:06:21.268603Z",
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
  "session_id": "feb853f5-7dcc-4074-a668-55697f889b11",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0ODEsImlhdCI6MTc5MzM0NzU4MSwianRpIjoiYWNiMGJmZGYtYzQ4MS00YjFlLWFmMWYtYjAyMzIzZWFiMWZmIiwic2lkIjoiZmViODUzZjUtN2RjYy00MDc0LWE2NjgtNTU2OTdmODg5YjExIn0.34Fuh41Hm_LQFQ8_GLDaOuYzEhdcy-voW40JwaSoNjw",
  "access_expires_at": "2026-10-30T08:21:21.69638401Z",
  "refresh_token": "B8TD0u_hxKR8-w82EjWzpemZIJiGUa6u35H9WxjUuU8",
  "refresh_expires_at": "2026-10-30T20:06:21.695972258Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1fea4043-731e-4963-aad7-91ba78fb6f71",
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
  "id": "593c1b51-7283-4676-a8f4-8fa94605a623",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:21.899022Z",
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
  "command_id": "375aaf7a-2b10-4d85-93fd-77e2965d460b",
  "quote_id": "593c1b51-7283-4676-a8f4-8fa94605a623",
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
    "phone": "+380676590636"
  }
}
```

```json
{
  "id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
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
  "created_at": "2026-10-30T08:06:22.125896Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676590636"
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
    "id": "5d3fc6e9-cca0-4fc5-80c1-8e7409ca687c",
    "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
    "expires_at": "2026-10-30T08:06:37.130227Z",
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

`POST /api/driver/v1/offers/5d3fc6e9-cca0-4fc5-80c1-8e7409ca687c/accept` → **200**

```json
{
  "command_id": "942f7031-6d49-4319-8107-9786bfea8bc5"
}
```

```json
{
  "id": "cb971875-bd3d-41d8-9d98-6993f09ae836",
  "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a57bad8a-bc5e-4668-bf1d-07f53889ffbb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a57bad8a-bc5e-4668-bf1d-07f53889ffbb",
  "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
  "assignment_id": "cb971875-bd3d-41d8-9d98-6993f09ae836",
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
    "phone": "+380676590636"
  }
}
```

`POST /api/driver/v1/work-sessions/80ffa700-a61c-4fcc-b199-53cce1abc381/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:24Z",
    "sequence": 1793347584127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "80ffa700-a61c-4fcc-b199-53cce1abc381",
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
  "last_heartbeat_at": "2026-10-30T08:06:24.028826Z",
  "last_location_at": "2026-10-30T08:06:24.028826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a57bad8a-bc5e-4668-bf1d-07f53889ffbb/arrive` → **200**

```json
{
  "command_id": "74976ed1-26cc-47f0-a970-ca4a7f6f906e",
  "expected_version": 0
}
```

```json
{
  "id": "a57bad8a-bc5e-4668-bf1d-07f53889ffbb",
  "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
  "assignment_id": "cb971875-bd3d-41d8-9d98-6993f09ae836",
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
  "arrived_at": "2026-10-30T08:06:24.226417Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676590636"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  },
  {
    "phone": "+380676590636",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:25.629543758Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  },
  {
    "phone": "+380676590636",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:25.629543758Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676590636` → **200**

```json
[
  {
    "phone": "+380676590636",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:23.620934847Z"
  },
  {
    "phone": "+380676590636",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:06:25.629543758Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/a57bad8a-bc5e-4668-bf1d-07f53889ffbb/start` → **200**

```json
{
  "command_id": "b4593d6b-47b0-4bfa-990e-fa065ec65083",
  "expected_version": 1
}
```

```json
{
  "id": "a57bad8a-bc5e-4668-bf1d-07f53889ffbb",
  "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
  "assignment_id": "cb971875-bd3d-41d8-9d98-6993f09ae836",
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
  "arrived_at": "2026-10-30T08:06:24.226417Z",
  "started_at": "2026-10-30T08:06:26.52903Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676590636"
  }
}
```

`POST /api/driver/v1/trips/a57bad8a-bc5e-4668-bf1d-07f53889ffbb/complete` → **200**

```json
{
  "command_id": "ebb3b3c4-dd69-4362-b656-e8f47cb7ff43",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:06:26Z",
  "cash_received": true
}
```

```json
{
  "id": "a57bad8a-bc5e-4668-bf1d-07f53889ffbb",
  "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
  "assignment_id": "cb971875-bd3d-41d8-9d98-6993f09ae836",
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
  "arrived_at": "2026-10-30T08:06:24.226417Z",
  "started_at": "2026-10-30T08:06:26.52903Z",
  "completed_at": "2026-10-30T08:06:26.736461Z",
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
  "session_id": "80ffa700-a61c-4fcc-b199-53cce1abc381",
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
  "last_heartbeat_at": "2026-10-30T08:06:24.028826Z",
  "last_location_at": "2026-10-30T08:06:24.028826Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/80ffa700-a61c-4fcc-b199-53cce1abc381/close` → **200**

```json
{
  "command_id": "886692ca-b52b-4fbd-b85e-336abc0b2e11",
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
  "phone": "+380632748234",
  "device_ref": "sandbox-21819"
}
```

```json
{
  "challenge_id": "fea4994c-c385-455b-ba8d-6784d906efa4",
  "expires_at": "2026-10-30T08:11:27.346966892Z",
  "resend_available_at": "2026-10-30T08:06:28.346966892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632748234` → **200**

```json
{
  "phone": "+380632748234",
  "audience": "CLIENT",
  "code": "965524",
  "sent_at": "2026-10-30T08:06:27.350207821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fea4994c-c385-455b-ba8d-6784d906efa4",
  "code": "965524",
  "device_ref": "sandbox-21819"
}
```

```json
{
  "session_id": "ddad62ae-446f-42e4-b7e0-0cf931444c17",
  "subject": {
    "type": "CLIENT",
    "id": "61e7e374-a24b-4179-9509-e0b636b7e35a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWU3ZTM3NC1hMjRiLTQxNzktOTUwOS1lMGI2MzZiN2UzNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NDg3LCJpYXQiOjE3OTMzNDc1ODcsImp0aSI6IjEyMGUwNzZmLTc3ZWEtNDQ0Ny1hMGM0LTNkNmRlOWIzMjc2MSIsInNpZCI6ImRkYWQ2MmFlLTQ0NmYtNDJlNC1iN2UwLTBjZjkzMTQ0NGMxNyJ9.ZqII_pmkR3s3J_vbxdfyB3AcMYhv6rAkW8bxMa0vhic",
  "access_expires_at": "2026-10-30T08:21:27.562831433Z",
  "refresh_token": "oX0plXpI6sip7t9cux3Prmks5gZlk8UJOxHX3i_m1CY",
  "refresh_expires_at": "2026-11-29T08:06:27.562324017Z",
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
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
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
  "device_ref": "sandbox-18067"
}
```

```json
{
  "challenge_id": "c11f9469-20a1-495e-be34-59dcb93441ad",
  "expires_at": "2026-10-30T08:11:27.960083724Z",
  "resend_available_at": "2026-10-30T08:06:28.960083724Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "968095",
  "sent_at": "2026-10-30T08:06:27.962695462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c11f9469-20a1-495e-be34-59dcb93441ad",
  "code": "968095",
  "device_ref": "sandbox-18067"
}
```

```json
{
  "session_id": "f583273f-82cd-47fc-8b7e-f2ff0837367c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ4OCwiaWF0IjoxNzkzMzQ3NTg4LCJqdGkiOiI0ZWFkNzVjMS03NWZhLTRmOGItYmVjNC1iN2I5MjFhZmM5ZTEiLCJzaWQiOiJmNTgzMjczZi04MmNkLTQ3ZmMtOGI3ZS1mMmZmMDgzNzM2N2MifQ.ydm_rg6nwvp4lKOPwW7GKh0R8OlzKkNf6X7Oh3L17-k",
  "access_expires_at": "2026-10-30T08:21:28.181182218Z",
  "refresh_token": "Qdxaq6eHjQNdLmnOyc442PZs5x9jgqVrqmBpy6_eNW8",
  "refresh_expires_at": "2026-11-29T08:06:28.180663839Z",
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
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
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
  "session_id": "0a58faf9-5186-4579-b936-f64015b96076",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0ODgsImlhdCI6MTc5MzM0NzU4OCwianRpIjoiMmQyMGFhOGMtMDQxMC00MDJiLTkxOGEtY2U1NDA0YzBkYzM1Iiwic2lkIjoiMGE1OGZhZjktNTE4Ni00NTc5LWI5MzYtZjY0MDE1Yjk2MDc2In0.NcOPrHHDnNGoYa7BPb3WuGmRKsUSaTp34GAoY9sBdcc",
  "access_expires_at": "2026-10-30T08:21:28.919778059Z",
  "refresh_token": "K92USaD5nuZZfF6zll_eTArCP-Pw9rNTSmC5Qlv76H4",
  "refresh_expires_at": "2026-10-30T20:06:28.919298118Z",
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
  "session_id": "18d6a5a7-7c20-463e-8f9d-8618188b4e01",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg0ODksImlhdCI6MTc5MzM0NzU4OSwianRpIjoiMzRjYjU5MTEtZDk0Ny00MjlhLWFlYjItYWQzM2Y1YjA0Zjk4Iiwic2lkIjoiMThkNmE1YTctN2MyMC00NjNlLThmOWQtODYxODE4OGI0ZTAxIn0.PBRW119oQ7jaBqAPzAnttG8DntzjWkfpNdbGGWIRv60",
  "access_expires_at": "2026-10-30T08:21:29.355437455Z",
  "refresh_token": "ZuThaPq4G5J84cNIMedgitMx9S86SUVuVtP-uIQT5qk",
  "refresh_expires_at": "2026-10-30T20:06:29.354966586Z",
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
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
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
  "command_id": "6acae7b9-bb60-463a-b392-5d834f947fb3",
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
  "id": "d315f550-aab6-4a35-a9a0-e33814442a18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:29.763534Z",
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
  "command_id": "dbd5f21d-7203-4a20-867c-e77c8ccb1eec",
  "quote_id": "d315f550-aab6-4a35-a9a0-e33814442a18",
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
  "id": "9078299e-636e-4335-bd46-3e68d5652720",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61e7e374-a24b-4179-9509-e0b636b7e35a",
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
  "created_at": "2026-10-30T08:06:29.983245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9078299e-636e-4335-bd46-3e68d5652720` → **200**

```json
{
  "id": "9078299e-636e-4335-bd46-3e68d5652720",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61e7e374-a24b-4179-9509-e0b636b7e35a",
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
  "created_at": "2026-10-30T08:06:29.983245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9078299e-636e-4335-bd46-3e68d5652720/cancel` → **200**

```json
{
  "command_id": "39b3cd11-1eca-40f8-8381-90d7b5e37734",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9078299e-636e-4335-bd46-3e68d5652720",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "61e7e374-a24b-4179-9509-e0b636b7e35a",
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
  "created_at": "2026-10-30T08:06:29.983245Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
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
  "command_id": "9c7c1603-0c6a-4e64-91aa-3abf7c692fc9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:30Z",
    "sequence": 1793347590882
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c144d4b2-0a32-4659-bc81-737684214690",
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
  "last_heartbeat_at": "2026-10-30T08:06:30.899652Z",
  "last_location_at": "2026-10-30T08:06:30.899652Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28729"
}
```

```json
{
  "challenge_id": "a8338685-1200-4ab7-af36-90fc3183ce8d",
  "expires_at": "2026-10-30T08:11:31.105622569Z",
  "resend_available_at": "2026-10-30T08:06:32.105622569Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "171312",
  "sent_at": "2026-10-30T08:06:31.108207817Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8338685-1200-4ab7-af36-90fc3183ce8d",
  "code": "171312",
  "device_ref": "sandbox-28729"
}
```

```json
{
  "session_id": "6b03733f-1828-4540-a332-087959735e87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ5MSwiaWF0IjoxNzkzMzQ3NTkxLCJqdGkiOiJmNmM1MDg0Yi1kOWY0LTQxMzQtOTlhYi0yMmU3YzI5ZDNmOWQiLCJzaWQiOiI2YjAzNzMzZi0xODI4LTQ1NDAtYTMzMi0wODc5NTk3MzVlODcifQ.k4DF2jLnvJzY9Ne00WJFXdLihY_95685eDTfllPCUdA",
  "access_expires_at": "2026-10-30T08:21:31.333000818Z",
  "refresh_token": "OHhruwvscg_ZzDHuix9JeH-NNoFm-h8f-A0bd4jzenE",
  "refresh_expires_at": "2026-11-29T08:06:31.332598148Z",
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
  "command_id": "a11074f3-0964-4fbd-8d9f-a1094d1ba913",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:31Z",
    "sequence": 1793347591724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:31.741217Z",
  "last_location_at": "2026-10-30T08:06:31.741217Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2a556175-64cd-4a5d-b1d6-8a0f15621a65",
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
  "id": "ff33cd5f-597f-4693-9489-8254c2e189c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:31.943922Z",
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
  "command_id": "b0159ab0-3507-4a24-bf17-08d294c5374a",
  "quote_id": "ff33cd5f-597f-4693-9489-8254c2e189c9",
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
  "id": "55120e77-f029-48fd-993d-0948c46455b4",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61e7e374-a24b-4179-9509-e0b636b7e35a",
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
  "created_at": "2026-10-30T08:06:32.151741Z",
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
    "id": "af6bc4e3-5500-4516-989c-e061ea6e6a25",
    "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
    "expires_at": "2026-10-30T08:06:47.155185Z",
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

`POST /api/driver/v1/offers/af6bc4e3-5500-4516-989c-e061ea6e6a25/accept` → **200**

```json
{
  "command_id": "08e0c18e-c63a-4515-bc37-0ec15f9a67fd"
}
```

```json
{
  "id": "9665267f-ff29-4f7b-bf86-d33d1d57e415",
  "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "45086010-c65d-4f12-9842-33ac4d139dc0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "45086010-c65d-4f12-9842-33ac4d139dc0",
  "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
  "assignment_id": "9665267f-ff29-4f7b-bf86-d33d1d57e415",
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

`POST /api/driver/v1/trips/45086010-c65d-4f12-9842-33ac4d139dc0/cancel` → **200**

```json
{
  "command_id": "b307eecd-2103-4368-af21-14d1f1c04838",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "45086010-c65d-4f12-9842-33ac4d139dc0",
  "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
  "assignment_id": "9665267f-ff29-4f7b-bf86-d33d1d57e415",
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

`GET /api/rider/v1/orders/55120e77-f029-48fd-993d-0948c46455b4` → **200**

```json
{
  "id": "55120e77-f029-48fd-993d-0948c46455b4",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "61e7e374-a24b-4179-9509-e0b636b7e35a",
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
    "id": "9665267f-ff29-4f7b-bf86-d33d1d57e415",
    "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "45086010-c65d-4f12-9842-33ac4d139dc0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:06:32.151741Z",
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
    "id": "68ec13d9-c780-4ac4-ace4-087ffd5f574e",
    "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
    "expires_at": "2026-10-30T08:06:47.98921Z",
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

`POST /api/driver/v1/offers/68ec13d9-c780-4ac4-ace4-087ffd5f574e/accept` → **200**

```json
{
  "command_id": "7f7f952a-9728-4ea3-bac4-b06bc5028945"
}
```

```json
{
  "id": "7387ae90-3d41-4b6c-a858-135d7cb00968",
  "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0b14a359-7d35-4faa-9c30-f842aabc69e7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0b14a359-7d35-4faa-9c30-f842aabc69e7",
  "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
  "assignment_id": "7387ae90-3d41-4b6c-a858-135d7cb00968",
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

`POST /api/driver/v1/trips/0b14a359-7d35-4faa-9c30-f842aabc69e7/cancel` → **200**

```json
{
  "command_id": "75bf6816-fd10-401b-8ab9-d4913b1a9c41",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0b14a359-7d35-4faa-9c30-f842aabc69e7",
  "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
  "assignment_id": "7387ae90-3d41-4b6c-a858-135d7cb00968",
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
    "id": "55120e77-f029-48fd-993d-0948c46455b4",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:06:32.151741Z",
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
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "9078299e-636e-4335-bd46-3e68d5652720",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:06:29.983245Z",
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
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/55120e77-f029-48fd-993d-0948c46455b4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:06:32.15235Z",
      "actor": {
        "type": "CLIENT",
        "id": "61e7e374-a24b-4179-9509-e0b636b7e35a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
        "quote_id": "ff33cd5f-597f-4693-9489-8254c2e189c9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "969b6017-96c5-42a3-8e5a-7f2cccd1bb84"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:06:32.154379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
        "attempt_id": "115b6c1e-bcd0-4a21-bb29-4bae514418cb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "969b6017-96c5-42a3-8e5a-7f2cccd1bb84"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:06:32.160462Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "af6bc4e3-5500-4516-989c-e061ea6e6a25",
        "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "969b6017-96c5-42a3-8e5a-7f2cccd1bb84"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:06:32.579572Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "af6bc4e3-5500-4516-989c-e061ea6e6a25",
        "order_id": "55120e77-f029-48fd-993d-0948c46455b4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9665267f-ff29-4f7b-bf86-d33d1d57e415"
      },
      "correlation_id": "daa2b3e7-1364-4aaa-b56c-e6bfe47a59a8"
```

Done: orders 9078299e-636e-4335-bd46-3e68d5652720, 55120e77-f029-48fd-993d-0948c46455b4.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731629916",
  "device_ref": "sandbox-20521"
}
```

```json
{
  "challenge_id": "95032e0d-e0c7-45a7-af86-42a6604d1d80",
  "expires_at": "2026-10-30T08:11:34.663835866Z",
  "resend_available_at": "2026-10-30T08:06:35.663835866Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731629916` → **200**

```json
{
  "phone": "+380731629916",
  "audience": "CLIENT",
  "code": "520217",
  "sent_at": "2026-10-30T08:06:34.666372205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95032e0d-e0c7-45a7-af86-42a6604d1d80",
  "code": "520217",
  "device_ref": "sandbox-20521"
}
```

```json
{
  "session_id": "dc4a36f8-9cba-402a-96b3-408563ce8e3c",
  "subject": {
    "type": "CLIENT",
    "id": "4b805551-331e-4af1-b160-49a7a88843ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjgwNTU1MS0zMzFlLTRhZjEtYjE2MC00OWE3YTg4ODQzZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NDk0LCJpYXQiOjE3OTMzNDc1OTQsImp0aSI6ImZkNGFhYTFmLWYxODEtNDYxZi05YjgwLTM3ZWNkMDc0ZGM3MyIsInNpZCI6ImRjNGEzNmY4LTljYmEtNDAyYS05NmIzLTQwODU2M2NlOGUzYyJ9.08F_zzUiXeki89IjcP6uSt_FHdT8NvBKjTJ9jVIUfPM",
  "access_expires_at": "2026-10-30T08:21:34.88549367Z",
  "refresh_token": "rhj9J8nWy48JZheysXwi9w2jLP0MzHfkm_eE7ReyJeE",
  "refresh_expires_at": "2026-11-29T08:06:34.88498247Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b6bdbd5c-7247-4781-bf03-2c1180aaa3ec",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c8bb1fc4-2ec9-4f9d-a47b-623be212b419",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c8bb1fc4-2ec9-4f9d-a47b-623be212b419",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5e99be6229b4c1f77b9b518dafe607bb",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c8bb1fc4-2ec9-4f9d-a47b-623be212b419",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731629916"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c8bb1fc4-2ec9-4f9d-a47b-623be212b419",
  "expires_at": "2026-10-30T08:36:35.080049Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c8bb1fc4-2ec9-4f9d-a47b-623be212b419` → **200**

```json
{
  "id": "c8bb1fc4-2ec9-4f9d-a47b-623be212b419",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:36:35.080049Z",
  "card": {
    "id": "44c60f43-d753-4593-a81c-42054fd18ae4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2065",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:06:35.285385Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "44c60f43-d753-4593-a81c-42054fd18ae4",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2065",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:06:35.285385Z"
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
  "device_ref": "sandbox-23519"
}
```

```json
{
  "challenge_id": "c0d7a55b-789c-4f38-baf7-6aa289b0418b",
  "expires_at": "2026-10-30T08:11:35.689551279Z",
  "resend_available_at": "2026-10-30T08:06:36.689551279Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "966593",
  "sent_at": "2026-10-30T08:06:35.692248629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0d7a55b-789c-4f38-baf7-6aa289b0418b",
  "code": "966593",
  "device_ref": "sandbox-23519"
}
```

```json
{
  "session_id": "d034cc97-02c5-4191-93a8-8cbd308f74dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODQ5NSwiaWF0IjoxNzkzMzQ3NTk1LCJqdGkiOiI5NWIwZDdkNi04OTFmLTQ4YzktYjA1YS05ZTllY2E2YjdiZTQiLCJzaWQiOiJkMDM0Y2M5Ny0wMmM1LTQxOTEtOTNhOC04Y2JkMzA4Zjc0ZGQifQ.cBreQzKFTPMD4_zaMrS2mn_mUPiClZ2dGW9QG-0h6l0",
  "access_expires_at": "2026-10-30T08:21:35.905224885Z",
  "refresh_token": "6JymVQw27MaYPcTruJ5FVCDYZ67dE8RUtmSTqSHr7s0",
  "refresh_expires_at": "2026-11-29T08:06:35.904721095Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:31.741217Z",
  "last_location_at": "2026-10-30T08:06:31.741217Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49fe0e5-b487-4fb7-8194-8dde0a45f70d/handover` → **200**

```json
{
  "command_id": "8079e378-2350-4638-82f6-a36d769a18f6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:31.741217Z",
  "last_location_at": "2026-10-30T08:06:31.741217Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49fe0e5-b487-4fb7-8194-8dde0a45f70d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:36Z",
    "sequence": 1793347596477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:36.493174Z",
  "last_location_at": "2026-10-30T08:06:36.493174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc75a269-472b-49af-b414-fe2179d8079a",
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
  "id": "0c6eb3e8-88ae-4857-98a6-1044026ba206",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:36.692558Z",
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
  "command_id": "3ff80ed5-2c48-4e63-ba98-588c4fcff7c5",
  "quote_id": "0c6eb3e8-88ae-4857-98a6-1044026ba206",
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
  "id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
  "created_at": "2026-10-30T08:06:36.901564Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5` → **200**

```json
{
  "id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
  "created_at": "2026-10-30T08:06:36.901564Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5` → **200**

```json
{
  "id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
  "created_at": "2026-10-30T08:06:36.901564Z",
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
    "id": "9fa2aacb-4140-4fd1-89db-417aad2b9658",
    "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
    "expires_at": "2026-10-30T08:06:52.836619Z",
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

`POST /api/driver/v1/offers/9fa2aacb-4140-4fd1-89db-417aad2b9658/accept` → **200**

```json
{
  "command_id": "073db297-637f-4b5a-aaad-451687efc5d4"
}
```

```json
{
  "id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "assignment_id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
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

`POST /api/driver/v1/work-sessions/e49fe0e5-b487-4fb7-8194-8dde0a45f70d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:39Z",
    "sequence": 1793347599113
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:39.129813Z",
  "last_location_at": "2026-10-30T08:06:39.129813Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/92bb853b-4d4d-4b95-8ae5-3726d18e5d25/arrive` → **200**

```json
{
  "command_id": "34668e58-3c2e-4180-a17a-d9bf1b7b2349",
  "expected_version": 0
}
```

```json
{
  "id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "assignment_id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
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
  "arrived_at": "2026-10-30T08:06:39.328105Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92bb853b-4d4d-4b95-8ae5-3726d18e5d25/start` → **200**

```json
{
  "command_id": "c2fcbff2-d528-403c-ad98-a2577d64f092",
  "expected_version": 1
}
```

```json
{
  "id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "assignment_id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
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
  "arrived_at": "2026-10-30T08:06:39.328105Z",
  "started_at": "2026-10-30T08:06:39.529641Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92bb853b-4d4d-4b95-8ae5-3726d18e5d25/complete` → **200**

```json
{
  "command_id": "9d898b1d-2486-4087-b2b0-cc76806b1ad7",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:06:39Z",
  "cash_received": true
}
```

```json
{
  "id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "assignment_id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
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
  "arrived_at": "2026-10-30T08:06:39.328105Z",
  "started_at": "2026-10-30T08:06:39.529641Z",
  "completed_at": "2026-10-30T08:06:39.766042Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5` → **200**

```json
{
  "id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
    "id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
    "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:06:36.901564Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5` → **200**

```json
{
  "id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
    "id": "9ff02301-9d80-4bb9-a09b-63d8717291df",
    "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92bb853b-4d4d-4b95-8ae5-3726d18e5d25",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:06:36.901564Z",
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

`GET /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5/tip` → **200**

```json
{
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
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
  "available_until": "2026-10-31T08:06:39.766042Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5/tip` → **201**

```json
{
  "command_id": "742736fc-f3a8-445d-8b1d-eb7eb955d21e",
  "amount_minor": 2500
}
```

```json
{
  "id": "5958452e-d506-40c9-8d67-226ad1a00820",
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:06:41.794669Z"
}
```

`GET /api/rider/v1/orders/fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5/tip` → **200**

```json
{
  "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
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
  "available_until": "2026-10-31T08:06:39.766042Z",
  "open": false,
  "tip": {
    "id": "5958452e-d506-40c9-8d67-226ad1a00820",
    "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:06:41.794669Z"
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
      "id": "467192a5-7135-4a97-b334-34fbc71b2100",
      "at": "2026-10-30T08:06:39.906147Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
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
      "id": "c1e45318-883c-453c-8720-a42d5cf34011",
      "at": "2026-10-30T08:06:42.996042Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
      "counterpart_id": null
    },
    {
      "id": "467192a5-7135-4a97-b334-34fbc71b2100",
      "at": "2026-10-30T08:06:39.906147Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83bee885-8291-45e1-b4d5-dd83c51d4e38",
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
  "id": "4af5cb6d-55f7-42fd-8b13-6828222c9a3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:43.597523Z",
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
  "session_id": "6c033ec1-fe79-47de-b6ef-292bdbbbe655",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1MDQsImlhdCI6MTc5MzM0NzYwNCwianRpIjoiMDk5MDljNjEtMDI3NC00ZmVjLTkxNTgtNTYzZTQ2M2E2ZjU1Iiwic2lkIjoiNmMwMzNlYzEtZmU3OS00N2RlLWI2ZWYtMjkyYmRiYmJlNjU1In0.2eoATDbn7MRm-oCpW3wMv1BbcIGAGh54gMlGLUpGPFA",
  "access_expires_at": "2026-10-30T08:21:44.023804443Z",
  "refresh_token": "sMB3fuQIwruw_VwlN-3-Za_Wpa7L90CgkQKHslCv2NM",
  "refresh_expires_at": "2026-10-30T20:06:44.022820587Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731629916` → **200**

```json
{
  "client_id": "4b805551-331e-4af1-b160-49a7a88843ee"
}
```

`POST /api/admin/v1/rider-wallets/4b805551-331e-4af1-b160-49a7a88843ee/top-ups` → **201**

```json
{
  "command_id": "122e56fa-e7b4-45ba-b448-4dd837fde9e4",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
      "id": "702e1f9a-50f0-45bb-8893-b106adb54b9a",
      "at": "2026-10-30T08:06:44.404705Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dc039b36-573b-4db0-8d41-47ba51740ce5",
  "quote_id": "4af5cb6d-55f7-42fd-8b13-6828222c9a3d",
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
  "id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
  "created_at": "2026-10-30T08:06:44.612054Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2bb0b07f-91fb-46a1-ad40-e2d45cbda91b` → **200**

```json
{
  "id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
  "created_at": "2026-10-30T08:06:44.612054Z",
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
    "id": "5d3f21b0-e201-44b7-a891-2ecb8dd5347a",
    "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
    "expires_at": "2026-10-30T08:06:59.615888Z",
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

`POST /api/driver/v1/offers/5d3f21b0-e201-44b7-a891-2ecb8dd5347a/accept` → **200**

```json
{
  "command_id": "c84be938-5960-47de-90ac-253e8b92e190"
}
```

```json
{
  "id": "f6349cc0-0129-46db-ab53-2f1147b0756c",
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "19c2c7d8-5424-4274-bdff-5076c84c39b1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "19c2c7d8-5424-4274-bdff-5076c84c39b1",
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "assignment_id": "f6349cc0-0129-46db-ab53-2f1147b0756c",
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

`POST /api/driver/v1/work-sessions/e49fe0e5-b487-4fb7-8194-8dde0a45f70d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:45Z",
    "sequence": 1793347605597
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:45.613563Z",
  "last_location_at": "2026-10-30T08:06:45.613563Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/19c2c7d8-5424-4274-bdff-5076c84c39b1/arrive` → **200**

```json
{
  "command_id": "ea43b8d5-a900-433d-a653-47138e257607",
  "expected_version": 0
}
```

```json
{
  "id": "19c2c7d8-5424-4274-bdff-5076c84c39b1",
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "assignment_id": "f6349cc0-0129-46db-ab53-2f1147b0756c",
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
  "arrived_at": "2026-10-30T08:06:45.812455Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/19c2c7d8-5424-4274-bdff-5076c84c39b1/start` → **200**

```json
{
  "command_id": "27560bbd-8512-40f9-9cc3-5498d49b19ca",
  "expected_version": 1
}
```

```json
{
  "id": "19c2c7d8-5424-4274-bdff-5076c84c39b1",
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "assignment_id": "f6349cc0-0129-46db-ab53-2f1147b0756c",
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
  "arrived_at": "2026-10-30T08:06:45.812455Z",
  "started_at": "2026-10-30T08:06:46.015256Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/19c2c7d8-5424-4274-bdff-5076c84c39b1/complete` → **200**

```json
{
  "command_id": "30134737-ff73-438c-9cec-87de46f1873e",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:06:46Z",
  "cash_received": true
}
```

```json
{
  "id": "19c2c7d8-5424-4274-bdff-5076c84c39b1",
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "assignment_id": "f6349cc0-0129-46db-ab53-2f1147b0756c",
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
  "arrived_at": "2026-10-30T08:06:45.812455Z",
  "started_at": "2026-10-30T08:06:46.015256Z",
  "completed_at": "2026-10-30T08:06:46.225925Z",
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
  "client_id": "4b805551-331e-4af1-b160-49a7a88843ee",
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
      "id": "702e1f9a-50f0-45bb-8893-b106adb54b9a",
      "at": "2026-10-30T08:06:44.404705Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
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

`GET /api/rider/v1/orders/2bb0b07f-91fb-46a1-ad40-e2d45cbda91b/tip` → **200**

```json
{
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
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
  "available_until": "2026-10-31T08:06:46.225925Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2bb0b07f-91fb-46a1-ad40-e2d45cbda91b/tip` → **201**

```json
{
  "command_id": "7e20cda6-f9b2-49da-bdb2-a2831915aa2f",
  "amount_minor": 2500
}
```

```json
{
  "id": "c9b54658-504a-4d67-9d03-0a49d265dbf9",
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:06:47.01803Z"
}
```

`GET /api/rider/v1/orders/2bb0b07f-91fb-46a1-ad40-e2d45cbda91b/tip` → **200**

```json
{
  "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
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
  "available_until": "2026-10-31T08:06:46.225925Z",
  "open": false,
  "tip": {
    "id": "c9b54658-504a-4d67-9d03-0a49d265dbf9",
    "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:06:47.01803Z"
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
      "id": "62850868-ad26-4744-b1b3-d539da1cf93e",
      "at": "2026-10-30T08:06:47.05635Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
      "counterpart_id": null
    },
    {
      "id": "c1e45318-883c-453c-8720-a42d5cf34011",
      "at": "2026-10-30T08:06:42.996042Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
      "counterpart_id": null
    },
    {
      "id": "467192a5-7135-4a97-b334-34fbc71b2100",
      "at": "2026-10-30T08:06:39.906147Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
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
      "id": "303d81b5-ad7b-486c-bbcf-f22997dd8e79",
      "at": "2026-10-30T08:06:48.079916Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
      "counterpart_id": null
    },
    {
      "id": "62850868-ad26-4744-b1b3-d539da1cf93e",
      "at": "2026-10-30T08:06:47.05635Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bb0b07f-91fb-46a1-ad40-e2d45cbda91b",
      "counterpart_id": null
    },
    {
      "id": "c1e45318-883c-453c-8720-a42d5cf34011",
      "at": "2026-10-30T08:06:42.996042Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
      "counterpart_id": null
    },
    {
      "id": "467192a5-7135-4a97-b334-34fbc71b2100",
      "at": "2026-10-30T08:06:39.906147Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fc97bb7e-cbb8-4754-9f5e-fd9ae815d5a5",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e49fe0e5-b487-4fb7-8194-8dde0a45f70d",
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
  "last_heartbeat_at": "2026-10-30T08:06:45.613563Z",
  "last_location_at": "2026-10-30T08:06:45.613563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e49fe0e5-b487-4fb7-8194-8dde0a45f70d/close` → **200**

```json
{
  "command_id": "500767cb-0822-4a16-b863-31f3ca65cccc",
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

Done: card order 2bb0b07f-91fb-46a1-ad40-e2d45cbda91b.

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
  "phone": "+380733727975",
  "device_ref": "sandbox-3018"
}
```

```json
{
  "challenge_id": "2ec6a841-49d0-448b-8291-f949461946c4",
  "expires_at": "2026-10-30T08:11:49.405600299Z",
  "resend_available_at": "2026-10-30T08:06:50.405600299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733727975` → **200**

```json
{
  "phone": "+380733727975",
  "audience": "CLIENT",
  "code": "456687",
  "sent_at": "2026-10-30T08:06:49.408065663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ec6a841-49d0-448b-8291-f949461946c4",
  "code": "456687",
  "device_ref": "sandbox-3018"
}
```

```json
{
  "session_id": "a96cd4a4-a310-4953-8788-d65e8cb87256",
  "subject": {
    "type": "CLIENT",
    "id": "b55f1e27-b320-4101-ab2d-fd0e64262603"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTVmMWUyNy1iMzIwLTQxMDEtYWIyZC1mZDBlNjQyNjI2MDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTA5LCJpYXQiOjE3OTMzNDc2MDksImp0aSI6ImJiNTJjYmFmLTMxOTUtNGY4OS1iMjM3LWE2NGRlZWZlNDRhNiIsInNpZCI6ImE5NmNkNGE0LWEzMTAtNDk1My04Nzg4LWQ2NWU4Y2I4NzI1NiJ9.j2ei19LWTVdLq8Q3yiZGe4E_s2fgpLOQRuzMP8Hh5ck",
  "access_expires_at": "2026-10-30T08:21:49.622099804Z",
  "refresh_token": "iKQx83PxELcfzI-8qrSbcYROp1finRP0qZDfDn-Z94w",
  "refresh_expires_at": "2026-11-29T08:06:49.621735709Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e74a42bf-d767-4b48-9d1b-58effbd538fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "5f1c2557-4a6c-41e6-97eb-4443bd1e55e5",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5f1c2557-4a6c-41e6-97eb-4443bd1e55e5",
    "orderDate": "1793347609",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "7e17693d933ecb5be41aef99b3b1d4c1",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5f1c2557-4a6c-41e6-97eb-4443bd1e55e5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733727975"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5f1c2557-4a6c-41e6-97eb-4443bd1e55e5",
  "created_at": "2026-10-30T08:06:49.819473Z",
  "expires_at": "2026-10-30T08:36:49.819473Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/5f1c2557-4a6c-41e6-97eb-4443bd1e55e5` → **200**

```json
{
  "id": "5f1c2557-4a6c-41e6-97eb-4443bd1e55e5",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:06:49.819473Z",
  "expires_at": "2026-10-30T08:36:49.819473Z",
  "completed_at": "2026-10-30T08:06:50.021131Z",
  "masked_pan": "41****8803",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b55f1e27-b320-4101-ab2d-fd0e64262603",
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
      "id": "cd02e78f-43db-489d-97cb-545512704908",
      "at": "2026-10-30T08:06:50.096697Z",
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
  "client_id": "b55f1e27-b320-4101-ab2d-fd0e64262603",
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
      "id": "cd02e78f-43db-489d-97cb-545512704908",
      "at": "2026-10-30T08:06:50.096697Z",
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
  "device_ref": "sandbox-27925"
}
```

```json
{
  "challenge_id": "314b45b5-4dc4-4641-ac72-73d509b05433",
  "expires_at": "2026-10-30T08:11:50.627857125Z",
  "resend_available_at": "2026-10-30T08:06:51.627857125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "873432",
  "sent_at": "2026-10-30T08:06:50.63037039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "314b45b5-4dc4-4641-ac72-73d509b05433",
  "code": "873432",
  "device_ref": "sandbox-27925"
}
```

```json
{
  "session_id": "8628e37e-2e14-4e23-9bbc-163d3451e0a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODUxMCwiaWF0IjoxNzkzMzQ3NjEwLCJqdGkiOiI1MzhiNjJhZC02N2U0LTRjNzMtOGExOC02NTEyMjU4YWJhMWYiLCJzaWQiOiI4NjI4ZTM3ZS0yZTE0LTRlMjMtOWJiYy0xNjNkMzQ1MWUwYTUifQ.jwVFLscfN8wbJiG-BjBjmdM9h_o8uSExiG0CmVdmVYQ",
  "access_expires_at": "2026-10-30T08:21:50.846555652Z",
  "refresh_token": "d7zKi9nF5ucXxB7QqC-S46Gtl12s--I5wIwf8Gs6bj0",
  "refresh_expires_at": "2026-11-29T08:06:50.846146135Z",
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
  "command_id": "9e7fe1a6-d91a-41ec-b297-7d95cc8df842",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "6b5a5aa0-c084-4d31-83fb-ddd90d05d568",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6b5a5aa0-c084-4d31-83fb-ddd90d05d568",
    "orderDate": "1793347611",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "d710e3192baa2f393c7db531a62cbb42",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6b5a5aa0-c084-4d31-83fb-ddd90d05d568",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6b5a5aa0-c084-4d31-83fb-ddd90d05d568",
  "created_at": "2026-10-30T08:06:51.238176Z",
  "expires_at": "2026-10-30T08:36:51.238176Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/6b5a5aa0-c084-4d31-83fb-ddd90d05d568` → **200**

```json
{
  "id": "6b5a5aa0-c084-4d31-83fb-ddd90d05d568",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:06:51.238176Z",
  "expires_at": "2026-10-30T08:36:51.238176Z",
  "completed_at": "2026-10-30T08:06:51.4408Z",
  "masked_pan": "41****5567",
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
      "id": "17338e3c-9b94-4d26-98d7-c82da1933126",
      "at": "2026-10-30T08:06:52.105546Z",
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
  "command_id": "1ae0364f-9372-47f0-ab41-b840e0125f4f",
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
  "correlation_id": "91f91550-84e0-4b56-8c12-1ba00a38b0bb"
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
  "device_ref": "sandbox-12147"
}
```

```json
{
  "challenge_id": "2b4e1d73-7cc0-457c-8a30-d4e845b99327",
  "expires_at": "2026-10-30T08:11:53.250767135Z",
  "resend_available_at": "2026-10-30T08:06:54.250767135Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "109387",
  "sent_at": "2026-10-30T08:06:53.253356451Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b4e1d73-7cc0-457c-8a30-d4e845b99327",
  "code": "109387",
  "device_ref": "sandbox-12147"
}
```

```json
{
  "session_id": "cbb27e41-a7d0-44df-9221-13bb4514765e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODUxMywiaWF0IjoxNzkzMzQ3NjEzLCJqdGkiOiJiMjcyYjNjZC1iYTA4LTQyMzUtOGM1MC1lOTczZmM4MzdjNTgiLCJzaWQiOiJjYmIyN2U0MS1hN2QwLTQ0ZGYtOTIyMS0xM2JiNDUxNDc2NWUifQ.hwDrDhppSNzJlzLvtLoyav8Th1Vh61dTTgoJwsBgTw4",
  "access_expires_at": "2026-10-30T08:21:53.460804644Z",
  "refresh_token": "H0emN_iKdkwH3fPWpgVgT7c7ra0ub_1VD6Flwe3Xzo8",
  "refresh_expires_at": "2026-11-29T08:06:53.460186486Z",
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
  "command_id": "4aaf425e-a6f0-4e2b-ae62-b265c532ddd2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:53Z",
    "sequence": 1793347613853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba61fb38-25d1-4134-a853-718cd685ae29",
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
  "last_heartbeat_at": "2026-10-30T08:06:53.869283Z",
  "last_location_at": "2026-10-30T08:06:53.869283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639940313",
  "device_ref": "sandbox-7259"
}
```

```json
{
  "challenge_id": "2a99454a-7933-4b9d-8eb5-082f3b490811",
  "expires_at": "2026-10-30T08:11:54.067935096Z",
  "resend_available_at": "2026-10-30T08:06:55.067935096Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639940313` → **200**

```json
{
  "phone": "+380639940313",
  "audience": "CLIENT",
  "code": "716519",
  "sent_at": "2026-10-30T08:06:54.070080333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a99454a-7933-4b9d-8eb5-082f3b490811",
  "code": "716519",
  "device_ref": "sandbox-7259"
}
```

```json
{
  "session_id": "8a9f84bc-2c91-46bd-9958-b0401bdb924f",
  "subject": {
    "type": "CLIENT",
    "id": "91a044a0-2e7a-4690-8be1-4830ef4c175b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWEwNDRhMC0yZTdhLTQ2OTAtOGJlMS00ODMwZWY0YzE3NWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTE0LCJpYXQiOjE3OTMzNDc2MTQsImp0aSI6IjZjNTFiMGRhLTQzNzQtNDViNS05OGE3LTM1YTg4ZWMxYjIwOCIsInNpZCI6IjhhOWY4NGJjLTJjOTEtNDZiZC05OTU4LWIwNDAxYmRiOTI0ZiJ9.5KkuiGQCa5EhxVHh9XBSj1908es1Y8FEUuRtkwbXT5M",
  "access_expires_at": "2026-10-30T08:21:54.277099028Z",
  "refresh_token": "3C3uN4cmPqE2NrH5WE_dXZs9GSyuXUvY6zVX24zTmBM",
  "refresh_expires_at": "2026-11-29T08:06:54.276750114Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cfe54f2d-03f6-428a-ab61-0f6b96134ac9",
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
  "id": "10c3f7c1-f46b-47e1-b641-c306b08db222",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:54.469748Z",
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
  "command_id": "27f714fe-64b4-42bc-9449-7db1b63c36f9",
  "quote_id": "10c3f7c1-f46b-47e1-b641-c306b08db222",
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
  "id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91a044a0-2e7a-4690-8be1-4830ef4c175b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:06:54.681599Z",
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
    "id": "0cda8b20-034b-4884-8f4b-1aef2e4554bf",
    "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
    "expires_at": "2026-10-30T08:07:09.685301Z",
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

`POST /api/driver/v1/offers/0cda8b20-034b-4884-8f4b-1aef2e4554bf/accept` → **200**

```json
{
  "command_id": "fbd0f480-3f5e-4fcc-9203-57ed026bd837"
}
```

```json
{
  "id": "1867d722-f3a9-4285-a767-572df62fb86e",
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fcc0aa15-db68-4b70-9f85-09d333117b29",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fcc0aa15-db68-4b70-9f85-09d333117b29",
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "assignment_id": "1867d722-f3a9-4285-a767-572df62fb86e",
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

`POST /api/driver/v1/work-sessions/ba61fb38-25d1-4134-a853-718cd685ae29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:55Z",
    "sequence": 1793347615463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba61fb38-25d1-4134-a853-718cd685ae29",
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
  "last_heartbeat_at": "2026-10-30T08:06:55.478904Z",
  "last_location_at": "2026-10-30T08:06:55.478904Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fcc0aa15-db68-4b70-9f85-09d333117b29/arrive` → **200**

```json
{
  "command_id": "fbec6b2c-e7d2-4550-b495-37f47c72a470",
  "expected_version": 0
}
```

```json
{
  "id": "fcc0aa15-db68-4b70-9f85-09d333117b29",
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "assignment_id": "1867d722-f3a9-4285-a767-572df62fb86e",
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
  "arrived_at": "2026-10-30T08:06:55.672312Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fcc0aa15-db68-4b70-9f85-09d333117b29/start` → **200**

```json
{
  "command_id": "0711a6c0-cb49-4b26-b1da-182abb690104",
  "expected_version": 1
}
```

```json
{
  "id": "fcc0aa15-db68-4b70-9f85-09d333117b29",
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "assignment_id": "1867d722-f3a9-4285-a767-572df62fb86e",
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
  "arrived_at": "2026-10-30T08:06:55.672312Z",
  "started_at": "2026-10-30T08:06:55.87724Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fcc0aa15-db68-4b70-9f85-09d333117b29/complete` → **200**

```json
{
  "command_id": "fec659fd-f898-4a59-b198-06be19642d82",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:06:56Z",
  "cash_received": false
}
```

```json
{
  "id": "fcc0aa15-db68-4b70-9f85-09d333117b29",
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "assignment_id": "1867d722-f3a9-4285-a767-572df62fb86e",
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
  "arrived_at": "2026-10-30T08:06:55.672312Z",
  "started_at": "2026-10-30T08:06:55.87724Z",
  "completed_at": "2026-10-30T08:06:56.104821Z",
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
  "session_id": "34f9e980-4099-4858-8233-360b8912bfd8",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1MTYsImlhdCI6MTc5MzM0NzYxNiwianRpIjoiZGRjZDBjOWUtZDU2NS00ZjUyLWIyZTctZDdhOGI2MjcwNmEzIiwic2lkIjoiMzRmOWU5ODAtNDA5OS00ODU4LTgyMzMtMzYwYjg5MTJiZmQ4In0.N3755V_8QTDZ3vemY5NDLSyUhQTxwOfCXK0Dar7hVOc",
  "access_expires_at": "2026-10-30T08:21:56.580632243Z",
  "refresh_token": "6g5I5rOzwbNJpTfVqLK8Psxa7KrhjK_4RlnItlXbzrM",
  "refresh_expires_at": "2026-10-30T20:06:56.580259146Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/63cf8311-66e7-44a5-a6c7-bb8044c80803/cash-dispute` → **200**

```json
{
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "91a044a0-2e7a-4690-8be1-4830ef4c175b",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:06:56.170508Z",
  "decide_by": "2026-11-13T08:06:56.170508Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:06:56.170508Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "91a044a0-2e7a-4690-8be1-4830ef4c175b",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:06:56.170508Z",
      "decide_by": "2026-11-13T08:06:56.170508Z",
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

`POST /api/admin/v1/orders/63cf8311-66e7-44a5-a6c7-bb8044c80803/cash-dispute/decide` → **400**

```json
{
  "command_id": "ea13ab3b-71ba-47f4-aba2-68aeaa2eeafa",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/63cf8311-66e7-44a5-a6c7-bb8044c80803/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "390a3bef-a6e4-4be8-ac80-439a8b752669",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/63cf8311-66e7-44a5-a6c7-bb8044c80803/cash-dispute/decide` → **200**

```json
{
  "command_id": "22b1fd18-0151-4357-ae33-48d3b7142337",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "91a044a0-2e7a-4690-8be1-4830ef4c175b",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:06:56.170508Z",
  "decide_by": "2026-11-13T08:06:56.170508Z",
  "decision": "PAY_DRIVER",
  "decided_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:06:57.437329Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/63cf8311-66e7-44a5-a6c7-bb8044c80803/cash-dispute/decide` → **409**

```json
{
  "command_id": "39dd0d7f-8de6-4ef0-aa62-cd276aa4f7fa",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/63cf8311-66e7-44a5-a6c7-bb8044c80803/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b23b7f73-fe18-4b6f-b01c-b91068f66542"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba61fb38-25d1-4134-a853-718cd685ae29",
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
  "last_heartbeat_at": "2026-10-30T08:06:55.478904Z",
  "last_location_at": "2026-10-30T08:06:55.478904Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba61fb38-25d1-4134-a853-718cd685ae29/close` → **200**

```json
{
  "command_id": "588f9915-d634-46ba-b419-436bd98268c4",
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
  "phone": "+380739024260",
  "device_ref": "sandbox-19022"
}
```

```json
{
  "challenge_id": "64dae6e6-cae0-43a7-85df-6ea3afea6938",
  "expires_at": "2026-10-30T08:11:58.252340427Z",
  "resend_available_at": "2026-10-30T08:06:59.252340427Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739024260` → **200**

```json
{
  "phone": "+380739024260",
  "audience": "CLIENT",
  "code": "661564",
  "sent_at": "2026-10-30T08:06:58.254305099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64dae6e6-cae0-43a7-85df-6ea3afea6938",
  "code": "661564",
  "device_ref": "sandbox-19022"
}
```

```json
{
  "session_id": "1ef90f46-0581-407e-a87e-1afe1de33342",
  "subject": {
    "type": "CLIENT",
    "id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGNlNGVkMS0yOWFhLTRjN2MtOTYxMi1hZmQzYjE5ODhkYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTE4LCJpYXQiOjE3OTMzNDc2MTgsImp0aSI6IjU5YWU0ODYzLWMwOTYtNDY0Zi04MGRhLWM4MjcxZTJhNzI0MiIsInNpZCI6IjFlZjkwZjQ2LTA1ODEtNDA3ZS1hODdlLTFhZmUxZGUzMzM0MiJ9.kGwW_nIuOlLGwmgseGWsEHCn9tvzQC6tKzSw1clMtG0",
  "access_expires_at": "2026-10-30T08:21:58.470825543Z",
  "refresh_token": "lW11W82N9E9cYno4y2t0g0NF6aYb4nc_PeUfCfWZy8s",
  "refresh_expires_at": "2026-11-29T08:06:58.47047327Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "26a6b181-2af9-417a-afc5-63089032d4ce",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2d17fbe7-f7ec-430f-8fd6-5f931c08947e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2d17fbe7-f7ec-430f-8fd6-5f931c08947e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f6c0c312af2119b8693f0658061b260d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2d17fbe7-f7ec-430f-8fd6-5f931c08947e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739024260"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2d17fbe7-f7ec-430f-8fd6-5f931c08947e",
  "expires_at": "2026-10-30T08:36:58.66691Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2d17fbe7-f7ec-430f-8fd6-5f931c08947e` → **200**

```json
{
  "id": "2d17fbe7-f7ec-430f-8fd6-5f931c08947e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:36:58.66691Z",
  "card": {
    "id": "79f96c29-5606-4ff9-9d13-69f8a2e5643d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7495",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:06:58.869136Z"
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
  "device_ref": "sandbox-2231"
}
```

```json
{
  "challenge_id": "9c97f843-9ca9-4060-a579-18b66ae5a427",
  "expires_at": "2026-10-30T08:11:59.085110364Z",
  "resend_available_at": "2026-10-30T08:07:00.085110364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "537681",
  "sent_at": "2026-10-30T08:06:59.087259128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c97f843-9ca9-4060-a579-18b66ae5a427",
  "code": "537681",
  "device_ref": "sandbox-2231"
}
```

```json
{
  "session_id": "577de7bc-998f-44b4-86a8-ed3ef10d84c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODUxOSwiaWF0IjoxNzkzMzQ3NjE5LCJqdGkiOiI5NTRmMmFkOC1mNTk1LTRkZGEtYWZiZi00ZWVkYzFiZjNiNWYiLCJzaWQiOiI1NzdkZTdiYy05OThmLTQ0YjQtODZhOC1lZDNlZjEwZDg0YzYifQ.kAPahCrQG5wiAxMllXHTPPgBI0ht7Ue0HtgLaKeYJ8c",
  "access_expires_at": "2026-10-30T08:21:59.296527234Z",
  "refresh_token": "6-ctbN0U8GhbA1GQTYbQ9aaGZeTPW1ZzFR6ZJZJejYg",
  "refresh_expires_at": "2026-11-29T08:06:59.296079225Z",
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
  "command_id": "8bb4b600-159c-42ab-b462-2d680e04207d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:06:59Z",
    "sequence": 1793347619672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f6a17895-5965-4063-975f-27747e374cd3",
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
  "last_heartbeat_at": "2026-10-30T08:06:59.6876Z",
  "last_location_at": "2026-10-30T08:06:59.6876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c8daa352-2bce-482d-bcf9-71fa48887a08",
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
  "id": "b9907f4a-0352-42dc-aefb-644139457171",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:11:59.895275Z",
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
  "command_id": "5c37ef1e-2a98-4a27-b5e1-f208f36891cc",
  "quote_id": "b9907f4a-0352-42dc-aefb-644139457171",
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
  "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
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
  "created_at": "2026-10-30T08:07:00.109053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407` → **200**

```json
{
  "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
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
  "created_at": "2026-10-30T08:07:00.109053Z",
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
    "id": "1d5fef5a-ace1-4487-ae04-75f9b9577ca8",
    "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
    "expires_at": "2026-10-30T08:07:15.211549Z",
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

`POST /api/driver/v1/offers/1d5fef5a-ace1-4487-ae04-75f9b9577ca8/accept` → **200**

```json
{
  "command_id": "0443dadf-4525-43c1-9b28-c1eeb2cfa48d"
}
```

```json
{
  "id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "assignment_id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
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

`POST /api/rider/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/messages` → **201**

```json
{
  "command_id": "d53db5a1-7d63-452b-a704-ff6d3adc4896",
  "body": "Я біля входу, мій номер +380739024260, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "586edb7c-c207-43ee-bc51-8c942ecd4b5d",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739024260, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:07:01.103792599Z"
}
```

`POST /api/driver/v1/trips/ddc2a003-2f15-47e8-a697-59a8fa901a05/messages` → **201**

```json
{
  "command_id": "4aafd713-af19-4b1a-93fe-0dfb5475a2eb",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "4a27571b-339c-491b-b9e5-b82197ad499c",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:07:01.307346702Z"
}
```

`POST /api/driver/v1/work-sessions/f6a17895-5965-4063-975f-27747e374cd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:01Z",
    "sequence": 1793347621499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f6a17895-5965-4063-975f-27747e374cd3",
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
  "last_heartbeat_at": "2026-10-30T08:07:01.514287Z",
  "last_location_at": "2026-10-30T08:07:01.514287Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ddc2a003-2f15-47e8-a697-59a8fa901a05/arrive` → **200**

```json
{
  "command_id": "5cbe75a3-ff66-4628-a6c0-8ca3e875db75",
  "expected_version": 0
}
```

```json
{
  "id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "assignment_id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
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
  "arrived_at": "2026-10-30T08:07:01.712281Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ddc2a003-2f15-47e8-a697-59a8fa901a05/start` → **200**

```json
{
  "command_id": "e0cc4503-bba2-4369-9ccc-fd09defa2c1a",
  "expected_version": 1
}
```

```json
{
  "id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "assignment_id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
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
  "arrived_at": "2026-10-30T08:07:01.712281Z",
  "started_at": "2026-10-30T08:07:01.915697Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f6a17895-5965-4063-975f-27747e374cd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:02Z",
    "sequence": 1793347622104
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f6a17895-5965-4063-975f-27747e374cd3",
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
  "last_heartbeat_at": "2026-10-30T08:07:02.119043Z",
  "last_location_at": "2026-10-30T08:07:02.119043Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/ddc2a003-2f15-47e8-a697-59a8fa901a05/complete` → **200**

```json
{
  "command_id": "ffe9d194-ea06-44aa-8774-5f4e60fcfa34",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:07:02Z",
  "cash_received": false
}
```

```json
{
  "id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "assignment_id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
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
  "arrived_at": "2026-10-30T08:07:01.712281Z",
  "started_at": "2026-10-30T08:07:01.915697Z",
  "completed_at": "2026-10-30T08:07:02.322859Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407` → **200**

```json
{
  "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
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
    "id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
    "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:07:00.109053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407` → **200**

```json
{
  "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
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
    "id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
    "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:07:00.109053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407` → **200**

```json
{
  "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
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
    "id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
    "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:07:00.109053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407` → **200**

```json
{
  "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
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
    "id": "34b7716f-ad03-48c4-9487-091c7c0a41be",
    "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ddc2a003-2f15-47e8-a697-59a8fa901a05",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:07:00.109053Z",
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
  "session_id": "f6a17895-5965-4063-975f-27747e374cd3",
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
  "last_heartbeat_at": "2026-10-30T08:07:02.119043Z",
  "last_location_at": "2026-10-30T08:07:02.119043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6a17895-5965-4063-975f-27747e374cd3/close` → **200**

```json
{
  "command_id": "7e6f0b3f-3339-4670-b888-c2577ff95bed",
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
  "session_id": "10db6f68-50c3-4332-a4d3-2a2da352b130",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1MjYsImlhdCI6MTc5MzM0NzYyNiwianRpIjoiNTJhMTE1MDQtMTk5Zi00MTAwLWJlYzYtYzBlM2VlNjg4YjJiIiwic2lkIjoiMTBkYjZmNjgtNTBjMy00MzMyLWE0ZDMtMmEyZGEzNTJiMTMwIn0.IkJfFfWsma2Y-EQVYd399E9J1bJJ49muRicGHnZjqcQ",
  "access_expires_at": "2026-10-30T08:22:06.997250493Z",
  "refresh_token": "IXRUhrSDBznAr7U48CmJ38AQsJUDo1L6hOOaWmpR9Fg",
  "refresh_expires_at": "2026-10-30T20:07:06.996873176Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5cfb57fd-2bbb-4a57-bfbe-91e3d9fbf6fd"
}
```

`GET /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:07:07.416806028Z",
  "order": {
    "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
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
    "created_at": "2026-10-30T08:07:00.109053Z",
    "assigned_at": "2026-10-30T08:07:00.715527Z",
    "arrived_at": "2026-10-30T08:07:01.712281Z",
    "started_at": "2026-10-30T08:07:01.915697Z",
    "completed_at": "2026-10-30T08:07:02.322859Z"
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
    "id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
    "registered_at": "2026-10-30T08:06:58.469132Z",
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
      "created_at": "2026-10-30T08:07:00.110869Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:07:03.297246Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks` → **422**

```json
{
  "command_id": "70451e90-274f-49f1-bcb3-5615713d1027",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "991f1135-733c-4154-8813-d2c599f3956e"
}
```

`POST /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks` → **201**

```json
{
  "command_id": "79e02205-83a6-46c3-a006-52ce38888b64",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "bedc9b1d-4343-4be7-bb29-840f103c64d8",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:07:07.878911Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks` → **201**

```json
{
  "command_id": "79e02205-83a6-46c3-a006-52ce38888b64",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "bedc9b1d-4343-4be7-bb29-840f103c64d8",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:07:07.878911Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/ddce4ed1-29aa-4c7c-9612-afd3b1988db0` → **200**

```json
{
  "client": {
    "id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
    "phone": "+380739024260",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:06:58.469132Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:07:00.109053Z",
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

`GET /api/admin/v1/clients/ddce4ed1-29aa-4c7c-9612-afd3b1988db0` → **200**

```json
{
  "client": {
    "id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
    "phone": "+380739024260",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:06:58.469132Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:07:00.109053Z",
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

`POST /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks/bedc9b1d-4343-4be7-bb29-840f103c64d8/resolve` → **200**

```json
{
  "command_id": "94f46874-8d57-40f3-aa27-b652f1bb439b",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "bedc9b1d-4343-4be7-bb29-840f103c64d8",
  "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:07:07.878911Z",
  "resolved_at": "2026-10-30T08:07:09.77777Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/ddce4ed1-29aa-4c7c-9612-afd3b1988db0` → **200**

```json
{
  "client": {
    "id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
    "phone": "+380739024260",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:06:58.469132Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:07:00.109053Z",
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

`GET /api/admin/v1/clients/ddce4ed1-29aa-4c7c-9612-afd3b1988db0` → **200**

```json
{
  "client": {
    "id": "ddce4ed1-29aa-4c7c-9612-afd3b1988db0",
    "phone": "+380739024260",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:06:58.469132Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "850fece7-cf8b-45bb-8453-1deff9f07407",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:07:00.109053Z",
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

`POST /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks/bedc9b1d-4343-4be7-bb29-840f103c64d8/resolve` → **409**

```json
{
  "command_id": "63f4a495-05a0-4a79-87ac-bf28c358b690",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks/bedc9b1d-4343-4be7-bb29-840f103c64d8/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "006b3410-3f1e-4992-8c21-b5c2aee467c0"
}
```

`GET /api/admin/v1/orders/850fece7-cf8b-45bb-8453-1deff9f07407/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "bedc9b1d-4343-4be7-bb29-840f103c64d8",
      "order_id": "850fece7-cf8b-45bb-8453-1deff9f07407",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:07:07.878911Z",
      "resolved_at": "2026-10-30T08:07:09.77777Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 850fece7-cf8b-45bb-8453-1deff9f07407 without phone or card digits; chargeback bedc9b1d-4343-4be7-bb29-840f103c64d8 recorded and won.

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
  "session_id": "84d304b1-53ca-4f09-92b1-dcac535038b6",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1MzIsImlhdCI6MTc5MzM0NzYzMiwianRpIjoiZTQ2NzFiZTktN2FlZi00Y2MwLTlkYTMtMjA0ODFkZGE3MTc1Iiwic2lkIjoiODRkMzA0YjEtNTNjYS00ZjA5LTkyYjEtZGNhYzUzNTAzOGI2In0.D5Pil5-Zn0BIDKe75tMnrXEpd1LH5LxMzbyGwu1X3TU",
  "access_expires_at": "2026-10-30T08:22:12.247019107Z",
  "refresh_token": "dVpW7nwcgwn0Ztu6ibZMsAe-ZD1FrWNebikeZhK0uq0",
  "refresh_expires_at": "2026-10-30T20:07:12.246503227Z",
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
  "phone": "+48600860764",
  "device_ref": "sandbox-31479"
}
```

```json
{
  "challenge_id": "b4b4c6b6-3c01-44f3-8c99-c14b174cc374",
  "expires_at": "2026-10-30T08:12:12.852314923Z",
  "resend_available_at": "2026-10-30T08:07:13.852314923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600860764` → **200**

```json
{
  "phone": "+48600860764",
  "audience": "CLIENT",
  "code": "047312",
  "sent_at": "2026-10-30T08:07:12.854443428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4b4c6b6-3c01-44f3-8c99-c14b174cc374",
  "code": "047312",
  "device_ref": "sandbox-31479"
}
```

```json
{
  "session_id": "56cd86bc-b56e-4818-8a2d-9fbcdb606690",
  "subject": {
    "type": "CLIENT",
    "id": "c810862d-6947-41c9-96e9-d4626632754b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjODEwODYyZC02OTQ3LTQxYzktOTZlOS1kNDYyNjYzMjc1NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTMzLCJpYXQiOjE3OTMzNDc2MzMsImp0aSI6IjJmNWZkYmIzLWQwYTAtNDdjMi1iZGM5LWQyMDQ5ZDU4NWRmZiIsInNpZCI6IjU2Y2Q4NmJjLWI1NmUtNDgxOC04YTJkLTlmYmNkYjYwNjY5MCJ9.AkZpFNkpApqGqtQ6vIbyvf1r_dO-7RWLyrnoYeVfLf8",
  "access_expires_at": "2026-10-30T08:22:13.066807408Z",
  "refresh_token": "JdhkOFTWdb3Q6ZS1ihkA2imFp00mzDRCedNQIaETYVw",
  "refresh_expires_at": "2026-11-29T08:07:13.066437989Z",
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
  "command_id": "91de7fbc-0804-4eaa-aa6f-bd54b3c75d90",
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
  "correlation_id": "4b81527e-4612-4c54-8622-5d4261381996",
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
  "command_id": "eeacb475-4278-412d-a343-72bd694cb99b",
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
  "paused_at": "2026-10-30T08:07:13.872461828Z",
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
  "command_id": "2945c797-94dd-43b6-b2dd-9e3c93d264f1",
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
  "id": "4fd445b8-bc60-4e09-b3f8-96739015d9c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:14.316357Z",
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
  "command_id": "9ee62adf-742e-4f01-aab8-8f8790f1103d",
  "quote_id": "4fd445b8-bc60-4e09-b3f8-96739015d9c2",
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
  "correlation_id": "4b77001c-245b-40be-99fe-afacc63d4246"
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
  "paused_at": "2026-10-30T08:07:13.872462Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "fa342f89-dee5-42c4-9c08-89621dfd6d5f",
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
  "command_id": "1146990c-897d-490a-8417-a4c3ccf25590",
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
  "command_id": "e67729d7-66f6-41de-8a53-906b735722f0",
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
  "id": "2ffd6369-725b-4f82-abee-d66908f07344",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:15.528164Z",
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
  "command_id": "f4bcf7bf-164f-4a16-b915-73e1b4f1c059",
  "quote_id": "2ffd6369-725b-4f82-abee-d66908f07344",
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
  "correlation_id": "1c53d92b-a448-4747-89de-33908c439cdd"
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
  "command_id": "e5444f8a-6401-45ad-a479-d5f4dc00653e",
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
      "from": "11:00",
      "to": "12:00"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "833a8b58-c616-4e28-b5d3-1420cbe284a8",
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
  "id": "091c4993-df1c-4c9c-b489-21f2a8d43e05",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:16.347294Z",
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
  "command_id": "10c3657b-4d5c-4a62-a3c6-db9a326dc2fd",
  "quote_id": "091c4993-df1c-4c9c-b489-21f2a8d43e05",
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
  "correlation_id": "7603a0bb-f7e0-4c3b-ac48-32916b2d50ac"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "80f3c0db-7b95-49b1-a3e2-974a6a60d68a",
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
  "correlation_id": "1af1aaa6-168b-4dc1-be7c-81547f34f2ef"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "36782e00-aaac-48f2-a731-2aa517141bff",
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
  "phone": "+380676115596",
  "device_ref": "sandbox-9441"
}
```

```json
{
  "challenge_id": "efecdc19-6c38-439b-9440-d534aebdc348",
  "expires_at": "2026-10-30T08:12:17.3493595Z",
  "resend_available_at": "2026-10-30T08:07:18.3493595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676115596` → **200**

```json
{
  "phone": "+380676115596",
  "audience": "CLIENT",
  "code": "494328",
  "sent_at": "2026-10-30T08:07:17.351550134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efecdc19-6c38-439b-9440-d534aebdc348",
  "code": "494328",
  "device_ref": "sandbox-9441"
}
```

```json
{
  "session_id": "30466f4e-1de4-4789-8270-17e358ced2a4",
  "subject": {
    "type": "CLIENT",
    "id": "5d131a1b-7b31-497c-adf5-83528105aa70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDEzMWExYi03YjMxLTQ5N2MtYWRmNS04MzUyODEwNWFhNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTM3LCJpYXQiOjE3OTMzNDc2MzcsImp0aSI6ImY1OTRiMTRlLTUxOWUtNDVkMC1hZWJmLTkzN2ZhZDI2MGQ5NSIsInNpZCI6IjMwNDY2ZjRlLTFkZTQtNDc4OS04MjcwLTE3ZTM1OGNlZDJhNCJ9.d9XbrUe12WyHQ9XAux4UIp8r4YbrGqDYhN9zJLRGkBI",
  "access_expires_at": "2026-10-30T08:22:17.566482454Z",
  "refresh_token": "J7yoPQaUBajohVoxEi85QcS7Wdsd6kgEd8xJo7i_QDY",
  "refresh_expires_at": "2026-11-29T08:07:17.565833425Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5d131a1b-7b31-497c-adf5-83528105aa70",
  "session_id": "30466f4e-1de4-4789-8270-17e358ced2a4",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "43b08a51-c1cb-4296-b846-1752a89f0717",
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
  "id": "813020c4-b0fc-4c56-8bed-f85e80b9ca73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:17.961554Z",
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
  "challenge_id": "9b86f051-040d-4df2-970e-be022f912acd",
  "expires_at": "2026-10-30T08:12:20.16486052Z",
  "resend_available_at": "2026-10-30T08:07:21.16486052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676115596` → **200**

```json
{
  "phone": "+380676115596",
  "audience": "CLIENT",
  "code": "630173",
  "sent_at": "2026-10-30T08:07:20.166793034Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e11a5db5-9d05-4302-afa5-a781f6fa2bbf",
  "challenge_id": "9b86f051-040d-4df2-970e-be022f912acd",
  "otp_code": "630173"
}
```

```json
{
  "client_id": "5d131a1b-7b31-497c-adf5-83528105aa70",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:07:20.391821924Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "93817893-16b6-4e8b-b7e6-77c683e7764d",
  "quote_id": "813020c4-b0fc-4c56-8bed-f85e80b9ca73",
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
  "correlation_id": "4b2f49cb-2026-4714-bb9c-9b0fd1d1fdd3"
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
  "session_id": "b7c64d3e-85fb-4775-970e-9bc7d36a8da7",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NDEsImlhdCI6MTc5MzM0NzY0MSwianRpIjoiOGJjZWE3MWUtZThiZi00MWI1LWEzYzctMDg2NmViZjk1MzM4Iiwic2lkIjoiYjdjNjRkM2UtODVmYi00Nzc1LTk3MGUtOWJjN2QzNmE4ZGE3In0.ajeyi4NHRvvIT61oSrg__cBFs_njEcu7trd4tQLLtRg",
  "access_expires_at": "2026-10-30T08:22:21.017703169Z",
  "refresh_token": "jtwB8d3r9SUpWHch0qMpVx9qgvAtG9OfhJeT3vyQ55Q",
  "refresh_expires_at": "2026-10-30T20:07:21.017244431Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "5d131a1b-7b31-497c-adf5-83528105aa70",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:07:20.391822Z",
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

`POST /api/admin/v1/client-deletions/5d131a1b-7b31-497c-adf5-83528105aa70/complete` → **200**

```json
{
  "command_id": "b5330871-6ac3-465c-b49a-316761d49e02",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "5d131a1b-7b31-497c-adf5-83528105aa70",
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
  "correlation_id": "61a3545a-7aa9-4577-a3cd-f36aaea893c4"
}
```

Done: client 5d131a1b-7b31-497c-adf5-83528105aa70 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660899720",
  "device_ref": "sandbox-17104"
}
```

```json
{
  "challenge_id": "758f6cf9-198f-4768-a211-58594eedbc68",
  "expires_at": "2026-10-30T08:12:21.818684293Z",
  "resend_available_at": "2026-10-30T08:07:22.818684293Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660899720` → **200**

```json
{
  "phone": "+380660899720",
  "audience": "CLIENT",
  "code": "215090",
  "sent_at": "2026-10-30T08:07:21.820867047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "758f6cf9-198f-4768-a211-58594eedbc68",
  "code": "215090",
  "device_ref": "sandbox-17104"
}
```

```json
{
  "session_id": "7476f81b-fc64-49de-b490-d34968d6ae56",
  "subject": {
    "type": "CLIENT",
    "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWM1Mjc3NC01MGQ2LTQ1YzAtYWZkNi0zYmQxZWQ1YTQxODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTQyLCJpYXQiOjE3OTMzNDc2NDIsImp0aSI6IjRhN2U1ZDQ5LWVlMTItNGYxYi1hZTVhLWQ0YTRmZDIxNzkwOCIsInNpZCI6Ijc0NzZmODFiLWZjNjQtNDlkZS1iNDkwLWQzNDk2OGQ2YWU1NiJ9.CO_OJ9GKBHcSZV0co3iw-Npwf-L6Pg3XXLgBwivdd0g",
  "access_expires_at": "2026-10-30T08:22:22.032361544Z",
  "refresh_token": "PqqSg4F8y8RC0TfQ7s8zRHLGaQqFxGHpdMPdb5wkPvA",
  "refresh_expires_at": "2026-11-29T08:07:22.032024225Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
  "session_id": "7476f81b-fc64-49de-b490-d34968d6ae56",
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
  "session_id": "6c19fbfa-8b39-4f13-a035-9f7c4ba30e4f",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NDIsImlhdCI6MTc5MzM0NzY0MiwianRpIjoiOTQ5YjFmNTYtMjkxMS00MTkwLThmM2ItMzBiYjM2ZjY3ODhlIiwic2lkIjoiNmMxOWZiZmEtOGIzOS00ZjEzLWEwMzUtOWY3YzRiYTMwZTRmIn0.z-Kjj2W9XIqR0vNLxefQ9vuBAn5y769RzTHu5nfYRFc",
  "access_expires_at": "2026-10-30T08:22:22.648623267Z",
  "refresh_token": "G0NAAdrJ3pGIltWXJyKbKOwWkc5efSZ4QGZTKs4QadY",
  "refresh_expires_at": "2026-10-30T20:07:22.648112561Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0899720&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
      "phone": "+380660899720",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:07:22.030551Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/89c52774-50d6-45c0-afd6-3bd1ed5a4181` → **200**

```json
{
  "client": {
    "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
    "phone": "+380660899720",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:07:22.030551Z",
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

`POST /api/admin/v1/clients/89c52774-50d6-45c0-afd6-3bd1ed5a4181/block` → **400**

```json
{
  "command_id": "6796ac4d-19c7-4540-8d1d-815a778c4dea",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/89c52774-50d6-45c0-afd6-3bd1ed5a4181/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c4678cc4-3389-4e29-a5e6-c2147d826534",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/89c52774-50d6-45c0-afd6-3bd1ed5a4181/block` → **200**

```json
{
  "command_id": "8751ca2e-5baa-4344-928b-d0c073d17761",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
  "phone": "+380660899720",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:07:22.030551Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:07:23.567033Z",
    "by": "8376c519-cbee-4321-85f7-c1f8d0d41429"
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
  "correlation_id": "40f253f6-43f1-4a12-b457-dd7177e9389c"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660899720",
  "device_ref": "sandbox-9522"
}
```

```json
{
  "challenge_id": "7093b75e-0619-40d4-b574-ad955df1cc9e",
  "expires_at": "2026-10-30T08:12:25.996144487Z",
  "resend_available_at": "2026-10-30T08:07:26.996144487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660899720` → **200**

```json
{
  "phone": "+380660899720",
  "audience": "CLIENT",
  "code": "650301",
  "sent_at": "2026-10-30T08:07:25.998653214Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "7093b75e-0619-40d4-b574-ad955df1cc9e",
  "code": "650301",
  "device_ref": "sandbox-9522"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "eb4144b2-2d4a-468a-a089-745015c37958"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/89c52774-50d6-45c0-afd6-3bd1ed5a4181` → **200**

```json
{
  "client": {
    "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
    "phone": "+380660899720",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:07:22.030551Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:07:23.567033Z",
      "by": "8376c519-cbee-4321-85f7-c1f8d0d41429"
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

`POST /api/admin/v1/clients/89c52774-50d6-45c0-afd6-3bd1ed5a4181/unblock` → **200**

```json
{
  "command_id": "78d5b6bd-7fd3-4e91-8ddb-7d5cf7026b7e",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
  "phone": "+380660899720",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:07:22.030551Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660899720",
  "device_ref": "sandbox-15583"
}
```

```json
{
  "challenge_id": "2ed4b532-9c2c-4f20-8cd1-6745ead85184",
  "expires_at": "2026-10-30T08:12:28.933064449Z",
  "resend_available_at": "2026-10-30T08:07:29.933064449Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660899720` → **200**

```json
{
  "phone": "+380660899720",
  "audience": "CLIENT",
  "code": "441489",
  "sent_at": "2026-10-30T08:07:28.935167146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ed4b532-9c2c-4f20-8cd1-6745ead85184",
  "code": "441489",
  "device_ref": "sandbox-15583"
}
```

```json
{
  "session_id": "759563bd-850f-497d-a728-3487bb224140",
  "subject": {
    "type": "CLIENT",
    "id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWM1Mjc3NC01MGQ2LTQ1YzAtYWZkNi0zYmQxZWQ1YTQxODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTQ5LCJpYXQiOjE3OTMzNDc2NDksImp0aSI6IjNiMTg3ZjNkLTFjOTAtNDYxNS04YTYxLWVkYWViNmExZDdkZCIsInNpZCI6Ijc1OTU2M2JkLTg1MGYtNDk3ZC1hNzI4LTM0ODdiYjIyNDE0MCJ9.6xIkYHk1VGdDcFaG50Zqz4Uw0-PKFlxG_k-APJJ4WOs",
  "access_expires_at": "2026-10-30T08:22:29.153916955Z",
  "refresh_token": "upYkrKOLpppm5-zp1XhhL3leNkjFYGfxyt5kzihmlKs",
  "refresh_expires_at": "2026-11-29T08:07:29.153535451Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89c52774-50d6-45c0-afd6-3bd1ed5a4181",
  "session_id": "759563bd-850f-497d-a728-3487bb224140",
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
  "phone": "+380667672311",
  "device_ref": "sandbox-27064"
}
```

```json
{
  "challenge_id": "bf5e0f25-c14a-4acc-b15d-269b0b799bf0",
  "expires_at": "2026-10-30T08:12:29.55591987Z",
  "resend_available_at": "2026-10-30T08:07:30.55591987Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667672311` → **200**

```json
{
  "phone": "+380667672311",
  "audience": "CLIENT",
  "code": "163684",
  "sent_at": "2026-10-30T08:07:29.558106543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf5e0f25-c14a-4acc-b15d-269b0b799bf0",
  "code": "163684",
  "device_ref": "sandbox-27064"
}
```

```json
{
  "session_id": "1c56f7f0-40db-465f-a3c8-a863c6592f2d",
  "subject": {
    "type": "CLIENT",
    "id": "9cc7472f-0e8a-437d-8c34-5ee506827ef3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Y2M3NDcyZi0wZThhLTQzN2QtOGMzNC01ZWU1MDY4MjdlZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTQ5LCJpYXQiOjE3OTMzNDc2NDksImp0aSI6IjQ5MzczNGE5LTZlN2YtNGI2MC04NGNiLTI5YjEwMTNkNmQyZCIsInNpZCI6IjFjNTZmN2YwLTQwZGItNDY1Zi1hM2M4LWE4NjNjNjU5MmYyZCJ9.wacuo7VciO8iEbKgby2KJ09R0vpxnkkIPx3q1ZX9LKM",
  "access_expires_at": "2026-10-30T08:22:29.774655502Z",
  "refresh_token": "--ryoMFC8ZMtCyRPvlhCOzeN2mWRmr_kJ_JVevFNAc8",
  "refresh_expires_at": "2026-11-29T08:07:29.774178051Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53a7679f-e775-4059-a5b6-e624a6854afd",
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
  "id": "eeb58198-1ad4-4319-a1a6-6ce8762c44ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:29.980947Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 860b9f46-ab86-4520-9a4c-efbdfad6946f) → **201**

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
  "session_id": "b053e43b-9d2f-41df-b2c2-9d7c9539eca1",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NTAsImlhdCI6MTc5MzM0NzY1MCwianRpIjoiNDE0NjA2ZmEtOTRiMy00OWI1LTliNTctMjExYzM1NjhlMjZhIiwic2lkIjoiYjA1M2U0M2ItOWQyZi00MWRmLWIyYzItOWQ3Yzk1MzllY2ExIn0.Kg4zx0LTx6rR8hVfde9g3NE-wMkNtbqP87F8z-5K3No",
  "access_expires_at": "2026-10-30T08:22:30.462167326Z",
  "refresh_token": "g2lwXw-W4ZpgVwZHYUulvJlzfMvV9cJdo51lXJ_sXog",
  "refresh_expires_at": "2026-10-30T20:07:30.461738043Z",
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
  "session_id": "c3852fd0-9fa3-4b47-9772-3006e72dffa7",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NTAsImlhdCI6MTc5MzM0NzY1MCwianRpIjoiZmRiMDg2MTgtZDNlYy00YjMwLWIzZWMtODI0ZGZiODE4MDJhIiwic2lkIjoiYzM4NTJmZDAtOWZhMy00YjQ3LTk3NzItMzAwNmU3MmRmZmE3In0.UH9O4Ae5GDeYgG0Rpx4VjUU74oNgKY8zFDdbgYdGRJs",
  "access_expires_at": "2026-10-30T08:22:30.920734169Z",
  "refresh_token": "Lrjxn2tg_HRjTjjpG8gstUcga9InKDNKSCEt6-mkvzo",
  "refresh_expires_at": "2026-10-30T20:07:30.920267051Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dea53883-6086-47bd-a5ab-3323c9bd44ee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:07:30.199602Z",
      "actor": {
        "type": "CLIENT",
        "id": "9cc7472f-0e8a-437d-8c34-5ee506827ef3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
        "quote_id": "eeb58198-1ad4-4319-a1a6-6ce8762c44ac",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "860b9f46-ab86-4520-9a4c-efbdfad6946f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:07:30.201129Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
        "attempt_id": "e850a4be-2c3c-4111-a7e0-410149f58d4a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "860b9f46-ab86-4520-9a4c-efbdfad6946f"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:07:30.20446Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
        "attempt_id": "e850a4be-2c3c-4111-a7e0-410149f58d4a"
      },
      "correlation_id": "860b9f46-ab86-4520-9a4c-efbdfad6946f"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "e850a4be-2c3c-4111-a7e0-410149f58d4a",
        "generation": 1,
        "started_at": "2026-10-30T08:07:30.200342Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:07:30.20446Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:07:30.201668Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/860b9f46-ab86-4520-9a4c-efbdfad6946f` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "dea53883-6086-47bd-a5ab-3323c9bd44ee:0",
      "order_id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
      "at": "2026-10-30T08:07:30.199602Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "dea53883-6086-47bd-a5ab-3323c9bd44ee:1",
      "order_id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
      "at": "2026-10-30T08:07:30.201129Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "dea53883-6086-47bd-a5ab-3323c9bd44ee:2",
      "order_id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
      "at": "2026-10-30T08:07:30.20446Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/54d3a796-16e4-4829-8452-c3936c2ef84d` → **200**

```json
{
  "found": []
}
```

Done: request 860b9f46-ab86-4520-9a4c-efbdfad6946f — order dea53883-6086-47bd-a5ab-3323c9bd44ee found by its id.

`GET /api/rider/v1/orders/dea53883-6086-47bd-a5ab-3323c9bd44ee` → **200**

```json
{
  "id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9cc7472f-0e8a-437d-8c34-5ee506827ef3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:07:30.199121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dea53883-6086-47bd-a5ab-3323c9bd44ee/cancel` → **200**

```json
{
  "command_id": "10cac69a-3fca-458b-a47e-42d1f48120b5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dea53883-6086-47bd-a5ab-3323c9bd44ee",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9cc7472f-0e8a-437d-8c34-5ee506827ef3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:07:30.199121Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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
  "phone": "+380633912053",
  "device_ref": "sandbox-30697"
}
```

```json
{
  "challenge_id": "64810b1c-e08c-44ce-b25b-d54cf8c109d2",
  "expires_at": "2026-10-30T08:12:32.14695078Z",
  "resend_available_at": "2026-10-30T08:07:33.14695078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633912053` → **200**

```json
{
  "phone": "+380633912053",
  "audience": "CLIENT",
  "code": "954811",
  "sent_at": "2026-10-30T08:07:32.149669619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64810b1c-e08c-44ce-b25b-d54cf8c109d2",
  "code": "954811",
  "device_ref": "sandbox-30697"
}
```

```json
{
  "session_id": "ca85e810-86b3-497a-aef9-e168a4fab97c",
  "subject": {
    "type": "CLIENT",
    "id": "4acc2dcc-7fea-408a-8c35-e864ba175f31"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWNjMmRjYy03ZmVhLTQwOGEtOGMzNS1lODY0YmExNzVmMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTUyLCJpYXQiOjE3OTMzNDc2NTIsImp0aSI6IjFiN2U3MWRjLWEzNzMtNDFmNS04MmY5LTdhNDA4YjlhYmMzYyIsInNpZCI6ImNhODVlODEwLTg2YjMtNDk3YS1hZWY5LWUxNjhhNGZhYjk3YyJ9.XLfGO8IOHoXIxmX_T0Pyry52l5JM4nKFmqhhL8eVkXo",
  "access_expires_at": "2026-10-30T08:22:32.377507468Z",
  "refresh_token": "l332-s5onG7BRJJtqDt5N_n6ci-dP-Du-ed79hlSI1c",
  "refresh_expires_at": "2026-11-29T08:07:32.377072888Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d595ae80-304a-4e1f-929f-e8c73c5ae5e5",
  "expires_at": "2026-10-30T08:12:34.575535357Z",
  "resend_available_at": "2026-10-30T08:07:35.575535357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633912053` → **200**

```json
{
  "phone": "+380633912053",
  "audience": "CLIENT",
  "code": "064791",
  "sent_at": "2026-10-30T08:07:34.577495228Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "ccd6c49e-7e61-4f4e-8fd5-87b0b5618e69",
  "challenge_id": "d595ae80-304a-4e1f-929f-e8c73c5ae5e5",
  "otp_code": "064791"
}
```

```json
{
  "id": "c1338443-2251-4292-bb01-9881fdcb2c0e",
  "state": "PENDING",
  "created_at": "2026-10-30T08:07:34.797508Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e` → **200**

```json
{
  "id": "c1338443-2251-4292-bb01-9881fdcb2c0e",
  "state": "PENDING",
  "created_at": "2026-10-30T08:07:34.797508Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e` → **200**

```json
{
  "id": "c1338443-2251-4292-bb01-9881fdcb2c0e",
  "state": "PENDING",
  "created_at": "2026-10-30T08:07:34.797508Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e` → **200**

```json
{
  "id": "c1338443-2251-4292-bb01-9881fdcb2c0e",
  "state": "PENDING",
  "created_at": "2026-10-30T08:07:34.797508Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e` → **200**

```json
{
  "id": "c1338443-2251-4292-bb01-9881fdcb2c0e",
  "state": "READY",
  "created_at": "2026-10-30T08:07:34.797508Z",
  "ready_at": "2026-10-30T08:07:38.24927Z",
  "expires_at": "2026-11-06T08:07:38.24927Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639861913",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "challenge_id": "88b59cec-313d-43a9-a56f-57d3b96fe750",
  "expires_at": "2026-10-30T08:12:38.800100878Z",
  "resend_available_at": "2026-10-30T08:07:39.800100878Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639861913` → **200**

```json
{
  "phone": "+380639861913",
  "audience": "CLIENT",
  "code": "452209",
  "sent_at": "2026-10-30T08:07:38.802166597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88b59cec-313d-43a9-a56f-57d3b96fe750",
  "code": "452209",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "session_id": "9d3a88a4-6192-4367-a143-59e65920a811",
  "subject": {
    "type": "CLIENT",
    "id": "0a1b0bb9-5e14-4145-ac86-341d6dbdd1a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTFiMGJiOS01ZTE0LTQxNDUtYWM4Ni0zNDFkNmRiZGQxYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTU5LCJpYXQiOjE3OTMzNDc2NTksImp0aSI6ImJiNmE3NGFiLWFkNTYtNGVkNi04NjI2LTNhNjdiZmYxNzFiZiIsInNpZCI6IjlkM2E4OGE0LTYxOTItNDM2Ny1hMTQzLTU5ZTY1OTIwYTgxMSJ9.sVo-9NCd5uEMHXNdwBtRkaJmtRDfa8nM4Bt70a9QjkI",
  "access_expires_at": "2026-10-30T08:22:39.019831436Z",
  "refresh_token": "gpn9Eoh5-vgjHUN6DWcf0fbzj-pKsxQDavfX7KiQZEA",
  "refresh_expires_at": "2026-11-29T08:07:39.019473814Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c1338443-2251-4292-bb01-9881fdcb2c0e/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "220619c0-2896-4d43-8631-85c1b7fead02"
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
  "session_id": "eab19544-2107-4e76-8cca-7b53431d72c2",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NTksImlhdCI6MTc5MzM0NzY1OSwianRpIjoiZmFkYmM0MTQtZjhhOS00ZDBjLThmYzItMDgzYmY5ODUxOTE3Iiwic2lkIjoiZWFiMTk1NDQtMjEwNy00ZTc2LThjY2EtN2I1MzQzMWQ3MmMyIn0.LuHTYbJskSonRtr_sUN5AMISaxrJEWHI7v3zzNWBiqM",
  "access_expires_at": "2026-10-30T08:22:39.682884485Z",
  "refresh_token": "wQCvOJ3S-gNTfQbzmAsrE8NDxsWGkwsbhNO3XtkwFdA",
  "refresh_expires_at": "2026-10-30T20:07:39.682378246Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4acc2dcc-7fea-408a-8c35-e864ba175f31",
  "session_id": "ca85e810-86b3-497a-aef9-e168a4fab97c",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/4acc2dcc-7fea-408a-8c35-e864ba175f31/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c1338443-2251-4292-bb01-9881fdcb2c0e",
      "state": "READY",
      "created_at": "2026-10-30T08:07:34.797508Z",
      "ready_at": "2026-10-30T08:07:38.24927Z",
      "expires_at": "2026-11-06T08:07:38.24927Z",
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
  "device_ref": "sandbox-20435"
}
```

```json
{
  "challenge_id": "0caf7bc9-a458-4717-82dd-e381b9a03ee2",
  "expires_at": "2026-10-30T08:12:40.274554887Z",
  "resend_available_at": "2026-10-30T08:07:41.274554887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "296579",
  "sent_at": "2026-10-30T08:07:40.277058545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0caf7bc9-a458-4717-82dd-e381b9a03ee2",
  "code": "296579",
  "device_ref": "sandbox-20435"
}
```

```json
{
  "session_id": "967901e6-4ba6-458e-ae9f-b3f426c795a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODU2MCwiaWF0IjoxNzkzMzQ3NjYwLCJqdGkiOiIwODg0NjczOC00NjUxLTQzNGItOWIyZi1jOTkxMmU3MzAxYmMiLCJzaWQiOiI5Njc5MDFlNi00YmE2LTQ1OGUtYWU5Zi1iM2Y0MjZjNzk1YTkifQ.OPrmIYoE6dd8yg4pYTlYlmzv6OCj4kWzrHmhFcnBoDk",
  "access_expires_at": "2026-10-30T08:22:40.494225653Z",
  "refresh_token": "092zhPt9dMAW6qprcYITpzR9W5dpPwiFso1UOK3lyVU",
  "refresh_expires_at": "2026-11-29T08:07:40.493850143Z",
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
  "device_ref": "sandbox-11839"
}
```

```json
{
  "challenge_id": "2cddcf31-90b7-4e48-bf46-7f6806f38863",
  "expires_at": "2026-10-30T08:12:40.890923116Z",
  "resend_available_at": "2026-10-30T08:07:41.890923116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "291091",
  "sent_at": "2026-10-30T08:07:40.893604989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cddcf31-90b7-4e48-bf46-7f6806f38863",
  "code": "291091",
  "device_ref": "sandbox-11839"
}
```

```json
{
  "session_id": "776323d5-9bae-4bbd-9a0b-989977eaf525",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODU2MSwiaWF0IjoxNzkzMzQ3NjYxLCJqdGkiOiI5MjlmMmEwYi00NTFlLTQ2ZGYtYjlkZC02NjJmMjU5ZTczYzgiLCJzaWQiOiI3NzYzMjNkNS05YmFlLTRiYmQtOWEwYi05ODk5NzdlYWY1MjUifQ.9SjV1e8amGkv2f4nYVu9Rn53SWHx4JwyEDOGkSwnQ00",
  "access_expires_at": "2026-10-30T08:22:41.108025064Z",
  "refresh_token": "VdI93m1NFazXXhwSlxS9_uKNiSIqjRZOojV3zB73Q2I",
  "refresh_expires_at": "2026-11-29T08:07:41.107638894Z",
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
  "command_id": "6fe0bb1d-558f-44dc-b282-1db0f7d5812a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:41Z",
    "sequence": 1793347661498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "465867e6-911b-416c-a67b-836681c49527",
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
  "last_heartbeat_at": "2026-10-30T08:07:41.513691Z",
  "last_location_at": "2026-10-30T08:07:41.513691Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27472"
}
```

```json
{
  "challenge_id": "27de4d63-d84c-4982-925d-68bd51d06308",
  "expires_at": "2026-10-30T08:12:41.713447652Z",
  "resend_available_at": "2026-10-30T08:07:42.713447652Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "926701",
  "sent_at": "2026-10-30T08:07:41.71591873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27de4d63-d84c-4982-925d-68bd51d06308",
  "code": "926701",
  "device_ref": "sandbox-27472"
}
```

```json
{
  "session_id": "264f9948-8914-4dde-a2fe-93ed18309231",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODU2MSwiaWF0IjoxNzkzMzQ3NjYxLCJqdGkiOiI0ZmNmNWQ4My0zY2UxLTQ2ZjMtYjAzNy1jNmI1ZTdjNGM0MzMiLCJzaWQiOiIyNjRmOTk0OC04OTE0LTRkZGUtYTJmZS05M2VkMTgzMDkyMzEifQ.ehHayQ1QkBn1EkAmj0Wn2yTAK_Z-0OUOIOzVVDM6YVk",
  "access_expires_at": "2026-10-30T08:22:41.929421937Z",
  "refresh_token": "t34lQPQRAbolF12Nyjt1PJPvYZgP4NR1BPHehMd0bDA",
  "refresh_expires_at": "2026-11-29T08:07:41.92893398Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c144d4b2-0a32-4659-bc81-737684214690",
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
  "last_heartbeat_at": "2026-10-30T08:06:30.899652Z",
  "last_location_at": "2026-10-30T08:06:30.899652Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c144d4b2-0a32-4659-bc81-737684214690/handover` → **200**

```json
{
  "command_id": "df798ae3-c5a9-4941-9e9b-ad0c2eb7e41a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c144d4b2-0a32-4659-bc81-737684214690",
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
  "last_heartbeat_at": "2026-10-30T08:06:30.899652Z",
  "last_location_at": "2026-10-30T08:06:30.899652Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c144d4b2-0a32-4659-bc81-737684214690/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:42Z",
    "sequence": 1793347662519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c144d4b2-0a32-4659-bc81-737684214690",
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
  "last_heartbeat_at": "2026-10-30T08:07:42.534791Z",
  "last_location_at": "2026-10-30T08:07:42.534791Z",
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
  "session_id": "4c35e89c-3046-4126-ae6f-19c73e92cdd4",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NjIsImlhdCI6MTc5MzM0NzY2MiwianRpIjoiMDY0NDM3Y2MtMmIxZC00OTYxLWE4Y2MtYjk5OTFhNjU2Nzk2Iiwic2lkIjoiNGMzNWU4OWMtMzA0Ni00MTI2LWFlNmYtMTljNzNlOTJjZGQ0In0.4UA3WC_gic-V4TWUxJ8YFz3mOV1M2mfSHVTiMoc0aH4",
  "access_expires_at": "2026-10-30T08:22:42.95921598Z",
  "refresh_token": "uM433lBoh2-IGR0kR9TD_cSlxc3D82jqyeFlIPNXaP4",
  "refresh_expires_at": "2026-10-30T20:07:42.958781952Z",
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
  "session_id": "967f2f97-00ed-4b30-82f7-6949b583d3b4",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NjMsImlhdCI6MTc5MzM0NzY2MywianRpIjoiNTgyZGNiMTQtNWE4Ny00ZmEyLTg4YWItYzQ0MDFhZWY2YzJkIiwic2lkIjoiOTY3ZjJmOTctMDBlZC00YjMwLTgyZjctNjk0OWI1ODNkM2I0In0.dCB6ktE7oMSY5pDTK0IyP_6NoNv53J-Kt6FTpP2M4Rw",
  "access_expires_at": "2026-10-30T08:22:43.388899358Z",
  "refresh_token": "zVWfFygt6P0D2Nf6BApcksGwRLcQuMjy9RLKoJ-yJ-U",
  "refresh_expires_at": "2026-10-30T20:07:43.38849612Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687893260",
  "device_ref": "sandbox-7140"
}
```

```json
{
  "challenge_id": "a6707cf6-6517-42bd-bb16-26ff7d734c34",
  "expires_at": "2026-10-30T08:12:43.582346053Z",
  "resend_available_at": "2026-10-30T08:07:44.582346053Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687893260` → **200**

```json
{
  "phone": "+380687893260",
  "audience": "CLIENT",
  "code": "813215",
  "sent_at": "2026-10-30T08:07:43.584623902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6707cf6-6517-42bd-bb16-26ff7d734c34",
  "code": "813215",
  "device_ref": "sandbox-7140"
}
```

```json
{
  "session_id": "00d27715-34f8-43a7-af51-560af83f1a0f",
  "subject": {
    "type": "CLIENT",
    "id": "2f23f2a3-60a4-467e-951e-5ec9b71a0e6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjIzZjJhMy02MGE0LTQ2N2UtOTUxZS01ZWM5YjcxYTBlNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTYzLCJpYXQiOjE3OTMzNDc2NjMsImp0aSI6ImQ4MGUxNDkyLTQ0MzEtNGI1Ny1iMmFiLTIwZjBlZmFkNmZkMyIsInNpZCI6IjAwZDI3NzE1LTM0ZjgtNDNhNy1hZjUxLTU2MGFmODNmMWEwZiJ9.UlExbDmNYot7rTQZmY_76yPAUJNfYld1y52FFFdVLoo",
  "access_expires_at": "2026-10-30T08:22:43.795609562Z",
  "refresh_token": "4CFDYHEl5BC5-TGZ87SB0vTZ_YSK2d2gh4ZihqlvCJ8",
  "refresh_expires_at": "2026-11-29T08:07:43.795114224Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67d23130-2aa1-4487-8f22-81a51d96ba87",
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
  "id": "6cd765d4-318b-4fe1-b98c-d8aa2e3459f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:44.001573Z",
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
  "command_id": "c4d62857-57f2-4ac8-8d50-0f02548da79b",
  "quote_id": "6cd765d4-318b-4fe1-b98c-d8aa2e3459f4",
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
  "id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2f23f2a3-60a4-467e-951e-5ec9b71a0e6d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:07:44.212027Z",
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
    "id": "fcb78151-f990-4a8c-9f9d-0a67468ea9e4",
    "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
    "expires_at": "2026-10-30T08:07:59.21476Z",
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

`POST /api/driver/v1/offers/fcb78151-f990-4a8c-9f9d-0a67468ea9e4/reject` → **204**

```json
{
  "command_id": "22eadbae-4b2d-43a1-b301-edc257444972"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bdc2cc19-832f-444e-8871-d6345d7244ca",
    "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
    "expires_at": "2026-10-30T08:07:59.625826Z",
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

`POST /api/driver/v1/offers/bdc2cc19-832f-444e-8871-d6345d7244ca/accept` → **200**

```json
{
  "command_id": "59743a60-f37c-4cd9-a0c3-dd5bc29ffc61"
}
```

```json
{
  "id": "5ad10ccf-85e0-4a9f-90ab-0586c2af6644",
  "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c72f223-52f6-4f98-a1dc-eeece81a060a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/6094ca82-5ff6-4d65-b713-5bcc86ed7d16/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:07:44.212488Z",
      "actor": {
        "type": "CLIENT",
        "id": "2f23f2a3-60a4-467e-951e-5ec9b71a0e6d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
        "quote_id": "6cd765d4-318b-4fe1-b98c-d8aa2e3459f4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5e7e737c-f34a-419e-9b6f-4873ce830412"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:07:44.214126Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
        "attempt_id": "a49611c9-8629-4628-a0ea-0f2aa909e95d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5e7e737c-f34a-419e-9b6f-4873ce830412"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:07:44.216466Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fcb78151-f990-4a8c-9f9d-0a67468ea9e4",
        "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5e7e737c-f34a-419e-9b6f-4873ce830412"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:07:44.625093Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fcb78151-f990-4a8c-9f9d-0a67468ea9e4",
        "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16"
      },
      "correlation_id": "0f637522-a06f-47b2-93de-17f6c43aa504"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 6094ca82-5ff6-4d65-b713-5bcc86ed7d16 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/6094ca82-5ff6-4d65-b713-5bcc86ed7d16` → **200**

```json
{
  "id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2f23f2a3-60a4-467e-951e-5ec9b71a0e6d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5ad10ccf-85e0-4a9f-90ab-0586c2af6644",
    "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6c72f223-52f6-4f98-a1dc-eeece81a060a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:07:44.212027Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6094ca82-5ff6-4d65-b713-5bcc86ed7d16/cancel` → **200**

```json
{
  "command_id": "beb31da5-138c-4349-b5c1-ac4f37ea54f5",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2f23f2a3-60a4-467e-951e-5ec9b71a0e6d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5ad10ccf-85e0-4a9f-90ab-0586c2af6644",
    "order_id": "6094ca82-5ff6-4d65-b713-5bcc86ed7d16",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6c72f223-52f6-4f98-a1dc-eeece81a060a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:07:44.212027Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "session_id": "465867e6-911b-416c-a67b-836681c49527",
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
  "last_heartbeat_at": "2026-10-30T08:07:41.513691Z",
  "last_location_at": "2026-10-30T08:07:41.513691Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/465867e6-911b-416c-a67b-836681c49527/close` → **200**

```json
{
  "command_id": "22f47080-60a2-4d34-b8a9-cb7502a9ac2d",
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
  "session_id": "c144d4b2-0a32-4659-bc81-737684214690",
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
  "last_heartbeat_at": "2026-10-30T08:07:42.534791Z",
  "last_location_at": "2026-10-30T08:07:42.534791Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c144d4b2-0a32-4659-bc81-737684214690/close` → **200**

```json
{
  "command_id": "b71840da-e6a3-47b1-90d0-01da34321df9",
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
  "session_id": "d7dbd8c1-c1fb-4f47-a57b-08a76ccd7d64",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1NjYsImlhdCI6MTc5MzM0NzY2NiwianRpIjoiOGU0N2JjMTEtY2FiMS00N2YzLWJkOTMtMzU2ZDc4ODczZTNkIiwic2lkIjoiZDdkYmQ4YzEtYzFmYi00ZjQ3LWE1N2ItMDhhNzZjY2Q3ZDY0In0.kjgPWZY2sMtXNBrKV9ejiKTdIxxGTbCRpMz5iIerM7o",
  "access_expires_at": "2026-10-30T08:22:46.736598001Z",
  "refresh_token": "umqpjiWqSmJ7ZtbKHWVItcBmem_799zro6MLlFORrr0",
  "refresh_expires_at": "2026-10-30T20:07:46.736059295Z",
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
  "command_id": "610b8ac9-80ef-46a7-ac83-5a8b159c85c3",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:07:47.148978Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "93ac8d30-9d86-47d9-abce-0630c190d1cd",
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
  "correlation_id": "deb5bb18-455f-44bd-9af2-bb2ecd2281d6"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "11292a63-071b-45d3-a5b0-1a09d853bd2e",
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
  "correlation_id": "4c2f8c12-7bec-42b3-8558-6d84c99f427f"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636012103",
  "device_ref": "sandbox-19098"
}
```

```json
{
  "challenge_id": "483572b7-c473-48ee-9029-b2c7eeb2c89e",
  "expires_at": "2026-10-30T08:12:47.744963364Z",
  "resend_available_at": "2026-10-30T08:07:48.744963364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636012103` → **200**

```json
{
  "phone": "+380636012103",
  "audience": "CLIENT",
  "code": "314829",
  "sent_at": "2026-10-30T08:07:47.747526701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "483572b7-c473-48ee-9029-b2c7eeb2c89e",
  "code": "314829",
  "device_ref": "sandbox-19098"
}
```

```json
{
  "session_id": "60a3a637-fcaa-41f9-b2b0-79d15984abd0",
  "subject": {
    "type": "CLIENT",
    "id": "69a9c370-d235-444e-a026-63584d1c18f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWE5YzM3MC1kMjM1LTQ0NGUtYTAyNi02MzU4NGQxYzE4ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTY3LCJpYXQiOjE3OTMzNDc2NjcsImp0aSI6IjYwMTI2M2E0LTBhY2MtNGZjMS04YmYxLTdlYmRhZjkzNjFiMSIsInNpZCI6IjYwYTNhNjM3LWZjYWEtNDFmOS1iMmIwLTc5ZDE1OTg0YWJkMCJ9.Ctf-y1dP0pNe3_VCneCMA8gkBLPVK2kWm_lnGJLjesE",
  "access_expires_at": "2026-10-30T08:22:47.957818186Z",
  "refresh_token": "avzxgF2DFfGkQjktGqD1nzd87wQ0eXXqky3GbIsvAsQ",
  "refresh_expires_at": "2026-11-29T08:07:47.957327298Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a521277-3811-47cd-aff3-bbbf8147fbe0",
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
  "id": "9cbe5b23-9d4a-44bf-b8b7-543cc7a958e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:48.158065Z",
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
  "command_id": "8f2340e7-dc8c-4d35-a560-b61551b06be6",
  "quote_id": "9cbe5b23-9d4a-44bf-b8b7-543cc7a958e7",
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
  "correlation_id": "1cffc359-8385-415d-9430-f892d8135a8f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7283484b-ac9c-43f8-98da-051f95b3c9ac",
  "quote_id": "9cbe5b23-9d4a-44bf-b8b7-543cc7a958e7",
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
  "id": "cfa99094-dd3c-4a8c-a23d-0c64f9290052",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69a9c370-d235-444e-a026-63584d1c18f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:07:48.579202Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cfa99094-dd3c-4a8c-a23d-0c64f9290052/cancel` → **200**

```json
{
  "command_id": "76cbedb8-300a-4a00-9d80-d655f93426ef",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cfa99094-dd3c-4a8c-a23d-0c64f9290052",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69a9c370-d235-444e-a026-63584d1c18f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:07:48.579202Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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
  "command_id": "528f49ca-69b0-41ae-b4bb-3d2e41154dc0",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:07:49.009905Z"
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
      "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:07:49.009905Z"
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
  "device_ref": "sandbox-19780"
}
```

```json
{
  "challenge_id": "859314fd-2145-4e44-b79b-6cad03a27149",
  "expires_at": "2026-10-30T08:12:49.619497914Z",
  "resend_available_at": "2026-10-30T08:07:50.619497914Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "400090",
  "sent_at": "2026-10-30T08:07:49.622607162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "859314fd-2145-4e44-b79b-6cad03a27149",
  "code": "400090",
  "device_ref": "sandbox-19780"
}
```

```json
{
  "session_id": "7488f0e4-1341-4b3e-9a89-3396ad070ad3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODU2OSwiaWF0IjoxNzkzMzQ3NjY5LCJqdGkiOiJiZWNlNmUzNC1iOWQyLTQ5NzktYmU1Ni1hZTNkOWE4NDEyZjciLCJzaWQiOiI3NDg4ZjBlNC0xMzQxLTRiM2UtOWE4OS0zMzk2YWQwNzBhZDMifQ.2Tvorc1TaekRFBFfZN7HsSxL0o-xxeH5mpAuKRII_9Q",
  "access_expires_at": "2026-10-30T08:22:49.838443273Z",
  "refresh_token": "9ZfcIv_cNWzREr1gHKdItj98rHPzO4zXBzqhyzoBtbs",
  "refresh_expires_at": "2026-11-29T08:07:49.83765672Z",
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
  "command_id": "b71d0d95-703a-4575-82fa-d2d7149ccf49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:50Z",
    "sequence": 1793347670226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:07:50.241568Z",
  "last_location_at": "2026-10-30T08:07:50.241568Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677169313",
  "device_ref": "sandbox-4348"
}
```

```json
{
  "challenge_id": "1ca5ed52-810e-4c42-87f9-11c81b961039",
  "expires_at": "2026-10-30T08:12:50.446335653Z",
  "resend_available_at": "2026-10-30T08:07:51.446335653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677169313` → **200**

```json
{
  "phone": "+380677169313",
  "audience": "CLIENT",
  "code": "250119",
  "sent_at": "2026-10-30T08:07:50.448805948Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ca5ed52-810e-4c42-87f9-11c81b961039",
  "code": "250119",
  "device_ref": "sandbox-4348"
}
```

```json
{
  "session_id": "7234eb7a-130d-497e-b805-6c3289b3e265",
  "subject": {
    "type": "CLIENT",
    "id": "1ea63451-a6e8-40dc-8dff-61b7cd3e803a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWE2MzQ1MS1hNmU4LTQwZGMtOGRmZi02MWI3Y2QzZTgwM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTcwLCJpYXQiOjE3OTMzNDc2NzAsImp0aSI6IjcyZmRiNGE4LTE5ZWItNDcyZS1hMjg4LWQ1NGEzY2EwMjdhOCIsInNpZCI6IjcyMzRlYjdhLTEzMGQtNDk3ZS1iODA1LTZjMzI4OWIzZTI2NSJ9.xQEjlWsKfLCs55dZFKK06O3uopjKzqN1puqfYfal7t4",
  "access_expires_at": "2026-10-30T08:22:50.670342959Z",
  "refresh_token": "BCT0GmAlE39syVBrQ4cZsz8mgcrzzHowE7QwHEFwh1Y",
  "refresh_expires_at": "2026-11-29T08:07:50.669809102Z",
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
  "command_id": "cc585e2e-aa4b-4a30-9de9-38c5c337dc8e",
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
  "id": "5d29c76b-10d8-4af2-a0be-26fbb70516e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:12:51.074606Z",
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
  "command_id": "f6180542-798a-409a-b82a-72d36bbc5fd9",
  "platform": "ANDROID",
  "token": "sandbox-driver-770e9052-774e-4059-9f3c-033e7e5aebdd"
}
```

```json
{
  "id": "a506de56-a529-401b-89f9-936c33c491f7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:07:51.312845Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "fe1f822d-cda2-445b-9e50-bebbffc4d7a9",
  "platform": "ANDROID",
  "token": "sandbox-rider-d539b6fd-061e-4864-8b23-cb6461211b9b"
}
```

```json
{
  "id": "21199141-fc0d-422a-9a13-db625a5c79ea",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:07:51.530509Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "153ae7c1-7e2b-49fe-99f8-2ad126c608a1",
  "quote_id": "5d29c76b-10d8-4af2-a0be-26fbb70516e8",
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
  "id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ea63451-a6e8-40dc-8dff-61b7cd3e803a",
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
  "created_at": "2026-10-30T08:07:51.757535Z",
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
    "id": "d46834c3-65a6-4f8e-ad1d-f7fd0b2c7294",
    "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
    "expires_at": "2026-10-30T08:08:06.759974Z",
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

`POST /api/driver/v1/offers/d46834c3-65a6-4f8e-ad1d-f7fd0b2c7294/accept` → **200**

```json
{
  "command_id": "3714779d-ccce-4c4a-b38e-8c959567228f"
}
```

```json
{
  "id": "d04756b5-773b-4a02-83c1-aed5c6668497",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:07:51.736Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:07:51.736Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:07:52.871260304Z",
    "token_suffix": "5aebdd",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "94133097-f62e-4e17-95d0-b704041c1a44",
      "order_version": "2",
      "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677169313&after=2026-10-30T08:07:51.736Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:07:52.873926184Z",
    "token_suffix": "211b9b",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "6a735f46-0abc-4315-880b-0bbd37ae2766",
      "order_version": "3",
      "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/13e085c3-25af-4b51-a3e7-b72ab3ab82ee/messages` → **201**

```json
{
  "command_id": "4e2b07ff-049a-4993-bdba-e8aaea59f3af",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "99e196e4-f5a9-416f-8fa7-66275d8a4270",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:07:53.470894768Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "assignment_id": "d04756b5-773b-4a02-83c1-aed5c6668497",
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

`POST /api/driver/v1/trips/ffad3d58-6eb9-43af-ba91-56dc6862c98e/messages` → **201**

```json
{
  "command_id": "dec28574-fd0a-4fee-88ef-901e5b38b5c1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "3e129eb3-d673-4673-8b91-dd7fc9a83f81",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:07:53.892746089Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/13e085c3-25af-4b51-a3e7-b72ab3ab82ee/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/ffad3d58-6eb9-43af-ba91-56dc6862c98e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677169313"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:54Z",
    "sequence": 1793347674514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:07:54.52969Z",
  "last_location_at": "2026-10-30T08:07:54.52969Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "assignment_id": "d04756b5-773b-4a02-83c1-aed5c6668497",
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

`POST /api/driver/v1/trips/ffad3d58-6eb9-43af-ba91-56dc6862c98e/arrive` → **200**

```json
{
  "command_id": "8da7ad93-f0ff-46ad-bcad-e7c2d954b3dc",
  "expected_version": 0
}
```

```json
{
  "id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "assignment_id": "d04756b5-773b-4a02-83c1-aed5c6668497",
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
  "arrived_at": "2026-10-30T08:07:54.96066Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ffad3d58-6eb9-43af-ba91-56dc6862c98e/start` → **200**

```json
{
  "command_id": "63ab062a-b94d-4aba-aa54-83a5c6e2bdd0",
  "expected_version": 1
}
```

```json
{
  "id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "assignment_id": "d04756b5-773b-4a02-83c1-aed5c6668497",
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
  "arrived_at": "2026-10-30T08:07:54.96066Z",
  "started_at": "2026-10-30T08:07:55.17452Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:07:55Z",
    "sequence": 1793347675370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:07:55.386408Z",
  "last_location_at": "2026-10-30T08:07:55.386408Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/ffad3d58-6eb9-43af-ba91-56dc6862c98e/complete` → **200**

```json
{
  "command_id": "c71f0ac9-5df0-4a6c-8561-c8b94e4a0922",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:07:55Z",
  "cash_received": true
}
```

```json
{
  "id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "assignment_id": "d04756b5-773b-4a02-83c1-aed5c6668497",
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
  "arrived_at": "2026-10-30T08:07:54.96066Z",
  "started_at": "2026-10-30T08:07:55.17452Z",
  "completed_at": "2026-10-30T08:07:55.593814Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/13e085c3-25af-4b51-a3e7-b72ab3ab82ee` → **200**

```json
{
  "id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1ea63451-a6e8-40dc-8dff-61b7cd3e803a",
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
    "id": "d04756b5-773b-4a02-83c1-aed5c6668497",
    "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:07:51.757535Z",
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
    "id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:07:51.757535Z",
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
    "id": "ffad3d58-6eb9-43af-ba91-56dc6862c98e",
    "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
    "order_short_number": 14,
    "created_at": "2026-10-30T08:07:52.194543Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "fcc0aa15-db68-4b70-9f85-09d333117b29",
    "order_id": "63cf8311-66e7-44a5-a6c7-bb8044c80803",
    "order_short_number": 9,
    "created_at": "2026-10-30T08:06:55.087606Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a57bad8a-bc5e-4668-bf1d-07f53889ffbb",
    "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
    "order_short_number": 4,
    "created_at": "2026-10-30T08:06:22.553774Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7c3396b7-39ba-41f1-9de8-c7dc327a09f4",
    "order_id": "fdf8e837-dcb6-4327-9d4f-2f63506ab435",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:05:57.051903Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "088b57dd-4ba2-4bea-ab38-be5d6ee6019b",
    "order_id": "f938d494-a0ea-411e-a8e6-5db3ed4bbcfe",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:05:49.940811Z",
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

`GET /api/rider/v1/orders/13e085c3-25af-4b51-a3e7-b72ab3ab82ee/tip` → **200**

```json
{
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
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
  "available_until": "2026-10-31T08:07:55.593814Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/13e085c3-25af-4b51-a3e7-b72ab3ab82ee/tip` → **201**

```json
{
  "command_id": "4810b002-cc0a-4bae-9cce-fd7b91fe3e6e",
  "amount_minor": 1100
}
```

```json
{
  "id": "dd750a7e-0cc8-4904-8c1c-e20ccc028990",
  "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:08:00.020645Z"
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
  "session_id": "e60f9141-c638-4a6c-b22d-b8d2ad384643",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1ODAsImlhdCI6MTc5MzM0NzY4MCwianRpIjoiMWQzZjQ1NzQtZmRlYS00MWEzLTg5ZmEtYzBjYWU4NzJiNjFjIiwic2lkIjoiZTYwZjkxNDEtYzYzOC00YTZjLWIyMmQtYjhkMmFkMzg0NjQzIn0.4IwEE3EK5ubTA6O8FiH0pGGoXlrcn6Toza_Q2roAkN4",
  "access_expires_at": "2026-10-30T08:23:00.453694661Z",
  "refresh_token": "X9-1dheGkA9FZbrwwshKy1EP7DgahiuEabU4eVa9kNI",
  "refresh_expires_at": "2026-10-30T20:08:00.453090011Z",
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
          "RIDER": 3,
          "STAFF": 1,
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
      "RIDER": 3,
      "STAFF": 1,
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
  "generated_at": "2026-10-30T08:08:00.656983908Z"
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
  "generated_at": "2026-10-30T08:08:00.864819268Z"
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
  "session_id": "93db4c51-9e87-43b0-a066-2bb15edcca80",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1ODEsImlhdCI6MTc5MzM0NzY4MSwianRpIjoiMGQ0MDEzNDUtZjExNC00MTQyLWExNjItMzI5ZDI2OGEzYzVkIiwic2lkIjoiOTNkYjRjNTEtOWU4Ny00M2IwLWEwNjYtMmJiMTVlZGNjYTgwIn0.7qKaKo_gV1pt2GgOMZLzMe2IxeggS3vfIOMKxzOZtbA",
  "access_expires_at": "2026-10-30T08:23:01.315956266Z",
  "refresh_token": "3mBG_KxETW_zGGub0CFIipbX2WwHe8APbvqaVTH_10c",
  "refresh_expires_at": "2026-10-30T20:08:01.315373958Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/13e085c3-25af-4b51-a3e7-b72ab3ab82ee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:07:51.757963Z",
      "actor": {
        "type": "CLIENT",
        "id": "1ea63451-a6e8-40dc-8dff-61b7cd3e803a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
        "quote_id": "5d29c76b-10d8-4af2-a0be-26fbb70516e8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8406c571-8431-481d-86b2-5439b2c73c52"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:07:51.759428Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
        "attempt_id": "e426f962-f6f8-4be1-8541-8e0627a7cdea",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8406c571-8431-481d-86b2-5439b2c73c52"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:07:51.764916Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d46834c3-65a6-4f8e-ad1d-f7fd0b2c7294",
        "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "8406c571-8431-481d-86b2-5439b2c73c52"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:07:52.195869Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d46834c3-65a6-4f8e-ad1d-f7fd0b2c7294",
        "order_id": "13e085c3-25af-4b51-a3e7-b72ab3ab82ee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d04756b5-773b-4a02-83c1-aed5c6668497"
      },
      "correlation_id": "701956ca-afbe-4875-a81e-6bc27eade121"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:08:01.72430555Z",
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
      "last_location_at": "2026-10-30T08:07:55.386408Z",
      "order_id": null
    }
  ]
}
```

Done: order 13e085c3-25af-4b51-a3e7-b72ab3ab82ee.

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
  "session_id": "7889fe36-b92c-47ed-8912-4ccd162dd36b",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1ODIsImlhdCI6MTc5MzM0NzY4MiwianRpIjoiN2E0NTA2ZjctMDY0MC00YjE4LTlkNGYtZmQzNjM4ZGUyMDgxIiwic2lkIjoiNzg4OWZlMzYtYjkyYy00N2VkLTg5MTItNGNjZDE2MmRkMzZiIn0.AOAYdETJJoUuBjJRmyvqGdQSRLyemRgfzlynIS7ZBDM",
  "access_expires_at": "2026-10-30T08:23:02.181114011Z",
  "refresh_token": "DSu2I6T-Y3iFIHX6Q5FfF4kgws7mATz-V-4cKtP0gdk",
  "refresh_expires_at": "2026-10-30T20:08:02.180679793Z",
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
  "command_id": "ffa70903-cb94-41ec-841f-5e87a34fba82",
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
  "timestamp": "2026-10-30T08:08:02.000+0000",
  "channel": {
    "id": "1730052000.172311346",
    "linkedid": "1730052000.172311346",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677986093"
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
  "timestamp": "2026-10-30T08:08:02.000+0000",
  "channel": {
    "id": "1730052000.172311346",
    "linkedid": "1730052000.172311346",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677986093"
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
  "session_id": "bbd788c8-69a9-42b0-b71b-ef752a7bb68a",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1ODMsImlhdCI6MTc5MzM0NzY4MywianRpIjoiMGI2MjM1MmMtMWE5Yy00OTVmLTg5ZTEtYmUzYTkyZjhhMmQ2Iiwic2lkIjoiYmJkNzg4YzgtNjlhOS00MmIwLWI3MWItZWY3NTJhN2JiNjhhIn0.aRp5OB4KBMt1drudOCRciZ3iPtVqdT-9z7O9NuHXjeM",
  "access_expires_at": "2026-10-30T08:23:03.113286604Z",
  "refresh_token": "-n6rqk14u5-Z47ucaUfe9sqP7yEA6rp0FRLBRUiFmS8",
  "refresh_expires_at": "2026-10-30T20:08:03.112868772Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "480ed940-6959-48ff-ab18-275999bb9787",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677986093",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:08:02Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/480ed940-6959-48ff-ab18-275999bb9787/answer` → **200**

```json
{
  "command_id": "73ae9705-e3a6-4b1a-b113-6798899fb146"
}
```

```json
{
  "id": "480ed940-6959-48ff-ab18-275999bb9787",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677986093",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "order_ids": [],
  "started_at": "2026-10-30T08:08:02Z",
  "answered_at": "2026-10-30T08:08:03.552492Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.172311346",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cd09cea3-c56b-4c0e-bbc1-9091c747149a",
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
  "id": "3affc63e-25a4-4c3b-9756-a33f307cb36e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:03.797669Z",
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
  "command_id": "73036394-d97d-468d-9973-8738bd6251c8",
  "quote_id": "3affc63e-25a4-4c3b-9756-a33f307cb36e",
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
    "phone": "+380677986093"
  },
  "call_id": "480ed940-6959-48ff-ab18-275999bb9787"
}
```

```json
{
  "id": "e12b319d-da96-4a05-a5ec-97ba0324c313",
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
  "created_at": "2026-10-30T08:08:04.036188Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677986093"
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
    "id": "1730052000.172311346",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "480ed940-6959-48ff-ab18-275999bb9787",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677986093",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "e12b319d-da96-4a05-a5ec-97ba0324c313"
      ],
      "started_at": "2026-10-30T08:08:02Z",
      "answered_at": "2026-10-30T08:08:03.552492Z",
      "ended_at": "2026-10-30T08:08:04.265902Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a021c5a3-33c6-460c-9821-1bb858537cdc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673814779",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [],
      "started_at": "2026-10-30T08:06:17.322037Z",
      "answered_at": "2026-10-30T08:06:17.553258Z",
      "ended_at": "2026-10-30T08:06:17.771751Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:06:18.22904Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/e12b319d-da96-4a05-a5ec-97ba0324c313` → **200**

```json
{
  "id": "e12b319d-da96-4a05-a5ec-97ba0324c313",
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
  "created_at": "2026-10-30T08:08:04.036188Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677986093"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e12b319d-da96-4a05-a5ec-97ba0324c313` → **200**

```json
{
  "id": "e12b319d-da96-4a05-a5ec-97ba0324c313",
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
  "created_at": "2026-10-30T08:08:04.036188Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677986093"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e12b319d-da96-4a05-a5ec-97ba0324c313/cancel` → **200**

```json
{
  "command_id": "e8b444a5-5b37-45b5-9414-28ba095256f3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e12b319d-da96-4a05-a5ec-97ba0324c313",
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
  "created_at": "2026-10-30T08:08:04.036188Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677986093"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 480ed940-6959-48ff-ab18-275999bb9787 with order e12b319d-da96-4a05-a5ec-97ba0324c313.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26582"
}
```

```json
{
  "challenge_id": "3c84be62-ff1a-4d0f-90cb-158d5a533a4c",
  "expires_at": "2026-10-30T08:13:05.136291447Z",
  "resend_available_at": "2026-10-30T08:08:06.136291447Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "571388",
  "sent_at": "2026-10-30T08:08:05.138524411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c84be62-ff1a-4d0f-90cb-158d5a533a4c",
  "code": "571388",
  "device_ref": "sandbox-26582"
}
```

```json
{
  "session_id": "134ce8c8-e720-44a6-85f1-4b1a78173a74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODU4NSwiaWF0IjoxNzkzMzQ3Njg1LCJqdGkiOiIwN2JkNWM4OC02MTRhLTRmYjEtOWJhNy1mNmFiMGM0YTIyNWIiLCJzaWQiOiIxMzRjZThjOC1lNzIwLTQ0YTYtODVmMS00YjFhNzgxNzNhNzQifQ.m2HMOOUAXEwTack2GmkewLGHgQs-cTY5ke8zhgo4s4Y",
  "access_expires_at": "2026-10-30T08:23:05.351429738Z",
  "refresh_token": "DwSBsSyiMv3BJVy3sXb9XPnCpJN1aXO0zXAPvc3bktg",
  "refresh_expires_at": "2026-11-29T08:08:05.35088933Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:07:55.386408Z",
  "last_location_at": "2026-10-30T08:07:55.386408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/handover` → **200**

```json
{
  "command_id": "f19a2851-48d1-401e-9a6d-2753a3a4ac12",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:07:55.386408Z",
  "last_location_at": "2026-10-30T08:07:55.386408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:05Z",
    "sequence": 1793347685942
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:08:05.957525Z",
  "last_location_at": "2026-10-30T08:08:05.957525Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668292625",
  "device_ref": "sandbox-2045"
}
```

```json
{
  "challenge_id": "fedeb29b-35c3-463c-8e07-d227bdaea02e",
  "expires_at": "2026-10-30T08:13:06.147684931Z",
  "resend_available_at": "2026-10-30T08:08:07.147684931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668292625` → **200**

```json
{
  "phone": "+380668292625",
  "audience": "CLIENT",
  "code": "673902",
  "sent_at": "2026-10-30T08:08:06.150298098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fedeb29b-35c3-463c-8e07-d227bdaea02e",
  "code": "673902",
  "device_ref": "sandbox-2045"
}
```

```json
{
  "session_id": "280c00f2-125b-4b3d-a096-c1e242e0c568",
  "subject": {
    "type": "CLIENT",
    "id": "33dba2f7-1ef4-44ba-a470-10d5f1f0b787"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2RiYTJmNy0xZWY0LTQ0YmEtYTQ3MC0xMGQ1ZjFmMGI3ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTg2LCJpYXQiOjE3OTMzNDc2ODYsImp0aSI6ImFhODJkNGRjLWQ0ZjItNGZmOC04Yzc2LWEwMGI2MzJmMzA2NiIsInNpZCI6IjI4MGMwMGYyLTEyNWItNGIzZC1hMDk2LWMxZTI0MmUwYzU2OCJ9._YdR68_DbpOAyX1cpQOlOvaQ33tf-WTNTxFjZHIwsGc",
  "access_expires_at": "2026-10-30T08:23:06.375756953Z",
  "refresh_token": "Q3Ae-rvjqoahzXpBsFOc-CiJwv6dLpStRL_QRPgWWBY",
  "refresh_expires_at": "2026-11-29T08:08:06.375415769Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5ae42b11-ec96-4b2b-bf81-eefaeb9e4ce2",
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
  "id": "878b8fef-e049-4b5a-b8e0-79aa37677a41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:06.578636Z",
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
  "command_id": "c3aa51f9-edde-48a7-87cb-65b5abe1f602",
  "quote_id": "878b8fef-e049-4b5a-b8e0-79aa37677a41",
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
  "id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "33dba2f7-1ef4-44ba-a470-10d5f1f0b787",
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
  "created_at": "2026-10-30T08:08:06.785483Z",
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
    "id": "294f315d-2b4b-4e8c-b9c7-ab7166fadbfc",
    "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
    "expires_at": "2026-10-30T08:08:21.788364Z",
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

`POST /api/driver/v1/offers/294f315d-2b4b-4e8c-b9c7-ab7166fadbfc/accept` → **200**

```json
{
  "command_id": "9f479c5c-83fa-44ba-9b7d-7b8c190db2b5"
}
```

```json
{
  "id": "b30ac395-82f9-4d98-8704-681c821891f8",
  "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ed551a9b-fd6b-4aae-a17c-75bc94688f55",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ed551a9b-fd6b-4aae-a17c-75bc94688f55",
  "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
  "assignment_id": "b30ac395-82f9-4d98-8704-681c821891f8",
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

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:07Z",
    "sequence": 1793347687586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:08:07.602479Z",
  "last_location_at": "2026-10-30T08:08:07.602479Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ed551a9b-fd6b-4aae-a17c-75bc94688f55/arrive` → **200**

```json
{
  "command_id": "39858c90-e36c-4a32-8c3c-2bb6ce0a894e",
  "expected_version": 0
}
```

```json
{
  "id": "ed551a9b-fd6b-4aae-a17c-75bc94688f55",
  "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
  "assignment_id": "b30ac395-82f9-4d98-8704-681c821891f8",
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
  "arrived_at": "2026-10-30T08:08:07.855379Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed551a9b-fd6b-4aae-a17c-75bc94688f55/start` → **200**

```json
{
  "command_id": "fbf2aa59-0dce-453c-ad2b-2401a94ca218",
  "expected_version": 1
}
```

```json
{
  "id": "ed551a9b-fd6b-4aae-a17c-75bc94688f55",
  "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
  "assignment_id": "b30ac395-82f9-4d98-8704-681c821891f8",
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
  "arrived_at": "2026-10-30T08:08:07.855379Z",
  "started_at": "2026-10-30T08:08:08.064498Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:08Z",
    "sequence": 1793347688263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:08:08.279513Z",
  "last_location_at": "2026-10-30T08:08:08.279513Z",
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
  "device_ref": "sandbox-4311"
}
```

```json
{
  "challenge_id": "74bd142b-a17b-4066-9896-0f6705617a68",
  "expires_at": "2026-10-30T08:13:08.489558433Z",
  "resend_available_at": "2026-10-30T08:08:09.489558433Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "266719",
  "sent_at": "2026-10-30T08:08:08.492379297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74bd142b-a17b-4066-9896-0f6705617a68",
  "code": "266719",
  "device_ref": "sandbox-4311"
}
```

```json
{
  "session_id": "2ebd84f8-2c73-431b-a61d-3f5497b0a982",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODU4OCwiaWF0IjoxNzkzMzQ3Njg4LCJqdGkiOiI0MmI0MWNhNC05NDA5LTQ2YzgtYjc3ZS1hNjNjNTA0NGQ0ZTUiLCJzaWQiOiIyZWJkODRmOC0yYzczLTQzMWItYTYxZC0zZjU0OTdiMGE5ODIifQ.F-z1w4et1-VUswhrmRX0Xg8Te0M_9kW4HDcJ35Oz3TM",
  "access_expires_at": "2026-10-30T08:23:08.717327396Z",
  "refresh_token": "1o-kEG9NtDAMJIXiy5PAM0VaJZIurjiDyf1Qp6496Ds",
  "refresh_expires_at": "2026-11-29T08:08:08.716884379Z",
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
  "command_id": "adf8a626-ddf9-43f9-b1bb-1057d34a6243",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:09Z",
    "sequence": 1793347689100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "41b86d80-0a2f-4320-b887-9d976f4e8225",
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
  "last_heartbeat_at": "2026-10-30T08:08:09.115804Z",
  "last_location_at": "2026-10-30T08:08:09.115804Z",
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
  "session_id": "60abef74-b9a2-4bf8-bb1b-f29a710b6ce0",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1ODksImlhdCI6MTc5MzM0NzY4OSwianRpIjoiNzI5ODQyOWEtMGZmMS00YmNmLTg3M2EtMTE0YTI5NDg5OGMyIiwic2lkIjoiNjBhYmVmNzQtYjlhMi00YmY4LWJiMWItZjI5YTcxMGI2Y2UwIn0.bydgEYlyKuphZ0cn2SO3UQDYtJcCUkaNE6A54XkYiJU",
  "access_expires_at": "2026-10-30T08:23:09.550270723Z",
  "refresh_token": "alkFWzUHwwv8CDfUP8OYjHiwBG3rZeAnPjb4qq6NljE",
  "refresh_expires_at": "2026-10-30T20:08:09.549864276Z",
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
  "session_id": "b75050e0-9d65-4a02-bd42-afa3b77eaf18",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1ODksImlhdCI6MTc5MzM0NzY4OSwianRpIjoiNTBmOTcwNDktYmU3NS00YTU5LWJkNzktZjkwYzIxNWE0NWE5Iiwic2lkIjoiYjc1MDUwZTAtOWQ2NS00YTAyLWJkNDItYWZhM2I3N2VhZjE4In0.GHgfpRdLcIYUZ7LdrN0zlnHfuwV79UJibHg5SX3LY5s",
  "access_expires_at": "2026-10-30T08:23:09.969133865Z",
  "refresh_token": "19usAK8qmuHNkOs8-7YNURdU4JCX_4c6UsZyE7oXFGk",
  "refresh_expires_at": "2026-10-30T20:08:09.968792626Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/87d12554-dee4-4e2f-94c2-6257bd6a6ccd` → **200**

```json
{
  "id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "33dba2f7-1ef4-44ba-a470-10d5f1f0b787",
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
    "id": "b30ac395-82f9-4d98-8704-681c821891f8",
    "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ed551a9b-fd6b-4aae-a17c-75bc94688f55",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:08:06.785483Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/87d12554-dee4-4e2f-94c2-6257bd6a6ccd/interrupt` → **200**

```json
{
  "command_id": "1a5306af-2873-4a69-be64-8add9b723078",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "33dba2f7-1ef4-44ba-a470-10d5f1f0b787",
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
      "id": "b30ac395-82f9-4d98-8704-681c821891f8",
      "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "ed551a9b-fd6b-4aae-a17c-75bc94688f55",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:08:06.785483Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "19e9d685-d43e-4638-a100-0cb282214370",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "33dba2f7-1ef4-44ba-a470-10d5f1f0b787",
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
    "id": "77acc70a-1c57-4ebf-b50d-62f9ae443c18",
    "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
    "expires_at": "2026-10-30T08:08:25.444585Z",
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

`POST /api/driver/v1/offers/77acc70a-1c57-4ebf-b50d-62f9ae443c18/accept` → **200**

```json
{
  "command_id": "aadeeaa6-0686-4052-a3f2-c705865aba70"
}
```

```json
{
  "id": "d618fb2c-886b-463b-8097-dba064dcbbd7",
  "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47",
  "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
  "assignment_id": "d618fb2c-886b-463b-8097-dba064dcbbd7",
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
  "session_id": "41b86d80-0a2f-4320-b887-9d976f4e8225",
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
  "last_heartbeat_at": "2026-10-30T08:08:09.115804Z",
  "last_location_at": "2026-10-30T08:08:09.115804Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/41b86d80-0a2f-4320-b887-9d976f4e8225/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:11Z",
    "sequence": 1793347691446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "41b86d80-0a2f-4320-b887-9d976f4e8225",
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
  "last_heartbeat_at": "2026-10-30T08:08:11.461105Z",
  "last_location_at": "2026-10-30T08:08:11.461105Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47/arrive` → **200**

```json
{
  "command_id": "2d9d4fc3-a442-41ac-9b95-d90794b75421",
  "expected_version": 0
}
```

```json
{
  "id": "f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47",
  "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
  "assignment_id": "d618fb2c-886b-463b-8097-dba064dcbbd7",
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
  "arrived_at": "2026-10-30T08:08:11.659339Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47/start` → **200**

```json
{
  "command_id": "af8bbbb2-00c5-469b-998c-f3127277c600",
  "expected_version": 1
}
```

```json
{
  "id": "f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47",
  "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
  "assignment_id": "d618fb2c-886b-463b-8097-dba064dcbbd7",
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
  "arrived_at": "2026-10-30T08:08:11.659339Z",
  "started_at": "2026-10-30T08:08:11.865194Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47/complete` → **200**

```json
{
  "command_id": "99283196-e21c-4929-93e9-da28d0705371",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:08:12Z"
}
```

```json
{
  "id": "f4ba481e-68bf-4a4c-a2c8-0d8c3643ba47",
  "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
  "assignment_id": "d618fb2c-886b-463b-8097-dba064dcbbd7",
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
  "arrived_at": "2026-10-30T08:08:11.659339Z",
  "started_at": "2026-10-30T08:08:11.865194Z",
  "completed_at": "2026-10-30T08:08:12.075311Z",
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
    "id": "19e9d685-d43e-4638-a100-0cb282214370",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:08:10.435897Z",
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
    "id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:08:06.785483Z",
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
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/87d12554-dee4-4e2f-94c2-6257bd6a6ccd/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:08:06.785918Z",
      "actor": {
        "type": "CLIENT",
        "id": "33dba2f7-1ef4-44ba-a470-10d5f1f0b787",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
        "quote_id": "878b8fef-e049-4b5a-b8e0-79aa37677a41",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "808dfdd1-fbb3-4535-a447-760674ff9f96"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:08:06.787696Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
        "attempt_id": "06c6baab-dc3d-497d-a269-f54f60e9ed9b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "808dfdd1-fbb3-4535-a447-760674ff9f96"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:08:06.790129Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "294f315d-2b4b-4e8c-b9c7-ab7166fadbfc",
        "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "808dfdd1-fbb3-4535-a447-760674ff9f96"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:08:07.199085Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "294f315d-2b4b-4e8c-b9c7-ab7166fadbfc",
        "order_id": "87d12554-dee4-4e2f-94c2-6257bd6a6ccd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b30ac395-82f9-4d98-8704-681c821891f8"
      },
      "correlation_id": "43581e01-3c2c-4cb5-abcf-85e12d111c10"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/19e9d685-d43e-4638-a100-0cb282214370/tip` → **200**

```json
{
  "order_id": "19e9d685-d43e-4638-a100-0cb282214370",
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
  "available_until": "2026-10-31T08:08:12.075311Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/19e9d685-d43e-4638-a100-0cb282214370/tip` → **409**

```json
{
  "command_id": "e4cc8902-9d25-4305-96b6-35d4d2cf9e1b",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/19e9d685-d43e-4638-a100-0cb282214370/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "892cabd8-716b-42d7-b119-29f1802f7e0c"
}
```

Done: interrupted 87d12554-dee4-4e2f-94c2-6257bd6a6ccd, follow-up 19e9d685-d43e-4638-a100-0cb282214370.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4178f292-5c3c-463b-a874-89bfea88c1cd",
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
  "last_heartbeat_at": "2026-10-30T08:08:08.279513Z",
  "last_location_at": "2026-10-30T08:08:08.279513Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4178f292-5c3c-463b-a874-89bfea88c1cd/close` → **200**

```json
{
  "command_id": "3f915693-eb82-4c70-adb0-fb00b62584f0",
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
  "session_id": "41b86d80-0a2f-4320-b887-9d976f4e8225",
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
  "last_heartbeat_at": "2026-10-30T08:08:11.461105Z",
  "last_location_at": "2026-10-30T08:08:11.461105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41b86d80-0a2f-4320-b887-9d976f4e8225/close` → **200**

```json
{
  "command_id": "fa06552a-2e0d-4429-9d26-0f9a121db530",
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
  "session_id": "84c6df61-d4e5-4582-b8b5-e97eaf4f57e2",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg1OTcsImlhdCI6MTc5MzM0NzY5NywianRpIjoiZGNkODVjNzMtMTZkMi00ZmJmLWE5NzctOWUwOWViMDJiMDA5Iiwic2lkIjoiODRjNmRmNjEtZDRlNS00NTgyLWI4YjUtZTk3ZWFmNGY1N2UyIn0.3wEbeciSbV4kKtOgWeR54OoKJHnf7zNAcgimnMIF4AQ",
  "access_expires_at": "2026-10-30T08:23:17.314761171Z",
  "refresh_token": "UNguCHVB_Qf6pjZUB4xgOnA9P07rKuqAt3dYsKJvkFc",
  "refresh_expires_at": "2026-10-30T20:08:17.314310676Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d711b77f-8785-4399-9258-d96ae766ba19",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:08:17Z"
}
```

```json
{
  "id": "9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:08:17Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4/publish` → **200**

```json
{
  "command_id": "56b02904-7756-46d4-ae41-ebe5d6fd5b75",
  "expected_version": 0
}
```

```json
{
  "id": "9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:08:17.741939Z",
  "published_at": "2026-10-30T08:08:17.741939Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:08:17.741939Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638339483",
  "device_ref": "sandbox-11956"
}
```

```json
{
  "challenge_id": "79453f48-3019-40b1-a658-eb1c4d1476ef",
  "expires_at": "2026-10-30T08:13:18.144551352Z",
  "resend_available_at": "2026-10-30T08:08:19.144551352Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638339483` → **200**

```json
{
  "phone": "+380638339483",
  "audience": "CLIENT",
  "code": "124796",
  "sent_at": "2026-10-30T08:08:18.147156651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79453f48-3019-40b1-a658-eb1c4d1476ef",
  "code": "124796",
  "device_ref": "sandbox-11956"
}
```

```json
{
  "session_id": "e4b64d1a-e0e1-488b-81f2-63605156d756",
  "subject": {
    "type": "CLIENT",
    "id": "2bc93030-a166-4b32-b592-3f50984073ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYmM5MzAzMC1hMTY2LTRiMzItYjU5Mi0zZjUwOTg0MDczY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NTk4LCJpYXQiOjE3OTMzNDc2OTgsImp0aSI6ImRjY2I2ZmY1LWE1NjEtNGI0MC04N2ZiLTA2OTA0YzBjZWRlMSIsInNpZCI6ImU0YjY0ZDFhLWUwZTEtNDg4Yi04MWYyLTYzNjA1MTU2ZDc1NiJ9.UInyU4-MqEVZONcNFUG7Dv2IbRZ1CtC3ypHwr1W2yfs",
  "access_expires_at": "2026-10-30T08:23:18.363630749Z",
  "refresh_token": "J0SBXtnurDtJ9_Irwx-eBVyXiaBjFANpLu_4nuFfiCo",
  "refresh_expires_at": "2026-11-29T08:08:18.363195073Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:08:17.741939Z",
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
  "command_id": "13d58c96-556f-41ed-91ad-1bd866cd0f3d",
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
  "id": "43d9d8e4-aa58-46a4-91f9-a8635d047c14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:18.769570Z",
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
  "command_id": "3d258832-f0e7-49fb-8307-24116668a3c6",
  "quote_id": "43d9d8e4-aa58-46a4-91f9-a8635d047c14",
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
  "correlation_id": "43d4a656-bdb9-45bd-b2ff-a0ee9009dc42"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "626a8fc2-6c3e-456e-bede-e4b8b128ae75",
  "version_id": "9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
  "language": "uk"
}
```

```json
{
  "version_id": "9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:08:19.21556Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5cc7f849-c4ee-46f8-9fb3-36564c97b0ee",
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
  "id": "722e8c6f-78a9-4f3c-b721-f61f23e8e04d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:19.434637Z",
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
  "command_id": "0a582478-c17d-4e3a-8d46-dfbc6efd5447",
  "quote_id": "722e8c6f-78a9-4f3c-b721-f61f23e8e04d",
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
  "id": "83792b40-7197-415e-91d0-b9ecab9c8a4e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2bc93030-a166-4b32-b592-3f50984073ca",
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
  "created_at": "2026-10-30T08:08:19.647234Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/83792b40-7197-415e-91d0-b9ecab9c8a4e` → **200**

```json
{
  "id": "83792b40-7197-415e-91d0-b9ecab9c8a4e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2bc93030-a166-4b32-b592-3f50984073ca",
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
  "created_at": "2026-10-30T08:08:19.647234Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/83792b40-7197-415e-91d0-b9ecab9c8a4e/cancel` → **200**

```json
{
  "command_id": "8cf1dc66-08b6-4dd6-95bf-a0df1ef0b3dd",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "83792b40-7197-415e-91d0-b9ecab9c8a4e",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2bc93030-a166-4b32-b592-3f50984073ca",
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
  "created_at": "2026-10-30T08:08:19.647234Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`POST /api/admin/v1/legal-documents/9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4` → **409**

```json
{
  "command_id": "01943972-c79f-44fa-8a7c-db73ce32c6fd",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:08:20Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/9e6f2a45-9108-47e7-a6b5-e94ed2f9eaf4",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "108b55b7-1a90-48c9-9e12-de923dfa55a3"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2cde36da-b79b-41e9-9ac1-afbddcf248a0",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:08:20Z"
}
```

```json
{
  "id": "1a35ea7a-a4dc-4670-ad04-262fc6254320",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:08:20Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1a35ea7a-a4dc-4670-ad04-262fc6254320/publish` → **200**

```json
{
  "command_id": "28c51823-5b60-42ef-b16f-10ff3e7e76c7",
  "expected_version": 0
}
```

```json
{
  "id": "1a35ea7a-a4dc-4670-ad04-262fc6254320",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:08:20.760603Z",
  "published_at": "2026-10-30T08:08:20.760603Z",
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
  "device_ref": "sandbox-4582"
}
```

```json
{
  "challenge_id": "084534b3-ae60-477f-bdc7-1557f4cf5ee8",
  "expires_at": "2026-10-30T08:13:20.97533289Z",
  "resend_available_at": "2026-10-30T08:08:21.97533289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "779949",
  "sent_at": "2026-10-30T08:08:20.977596454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "084534b3-ae60-477f-bdc7-1557f4cf5ee8",
  "code": "779949",
  "device_ref": "sandbox-4582"
}
```

```json
{
  "session_id": "dc5c5c21-4584-4e77-8065-2109a269dc29",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODYwMSwiaWF0IjoxNzkzMzQ3NzAxLCJqdGkiOiI1OTM4OGM4ZC1kMmRjLTRmZGMtODA2Yi0yMTJmYWIzZjY5ZTMiLCJzaWQiOiJkYzVjNWMyMS00NTg0LTRlNzctODA2NS0yMTA5YTI2OWRjMjkifQ.bGQfIxvuKWykBypvETzGdaGdLm7hfnZpgFzDM2KF-GM",
  "access_expires_at": "2026-10-30T08:23:21.207028011Z",
  "refresh_token": "PrQob46D5SiKinio-CAhhAjKxzDHRVVAhutaRG9Gn0o",
  "refresh_expires_at": "2026-11-29T08:08:21.206526454Z",
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
  "command_id": "8a29bc49-0726-4a02-8cb9-38bcc6ea2dda",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:21Z",
    "sequence": 1793347701623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "08fc2ed9-ee13-4145-97c4-728f108ab65f",
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
  "last_heartbeat_at": "2026-10-30T08:08:21.639219Z",
  "last_location_at": "2026-10-30T08:08:21.639219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675734172",
  "device_ref": "sandbox-12716"
}
```

```json
{
  "challenge_id": "da2ea4a7-2c4a-40d3-95c2-9e3e7425e643",
  "expires_at": "2026-10-30T08:13:21.852348462Z",
  "resend_available_at": "2026-10-30T08:08:22.852348462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675734172` → **200**

```json
{
  "phone": "+380675734172",
  "audience": "CLIENT",
  "code": "381252",
  "sent_at": "2026-10-30T08:08:21.854956217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da2ea4a7-2c4a-40d3-95c2-9e3e7425e643",
  "code": "381252",
  "device_ref": "sandbox-12716"
}
```

```json
{
  "session_id": "da3d55f9-59c4-446f-832b-ba4790cf0596",
  "subject": {
    "type": "CLIENT",
    "id": "57b49bf6-f887-4243-a4f0-ca6231e8191d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1N2I0OWJmNi1mODg3LTQyNDMtYTRmMC1jYTYyMzFlODE5MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjAyLCJpYXQiOjE3OTMzNDc3MDIsImp0aSI6IjMyMjNhZjBiLTI0YmQtNDFiMC1hOGU1LWU5YTdlOWRkYjUzMCIsInNpZCI6ImRhM2Q1NWY5LTU5YzQtNDQ2Zi04MzJiLWJhNDc5MGNmMDU5NiJ9.OMYCUzShiiO3kPblvXsue0xEIXV1IZvjM1Tr6a8KwvY",
  "access_expires_at": "2026-10-30T08:23:22.08965013Z",
  "refresh_token": "ROOh6UTUQKmy8lYvp6-S-0Yo1KrAvHlIYQQVOxTwpe8",
  "refresh_expires_at": "2026-11-29T08:08:22.089155739Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df872465-a903-4733-bcc6-e1c5d9e5b0a3",
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
  "id": "565ee64e-805a-45ee-b15d-21fab81951c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:22.299638Z",
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
  "command_id": "78a1f640-5c21-4c2b-b0b6-14f2399d1d02",
  "quote_id": "565ee64e-805a-45ee-b15d-21fab81951c4",
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
    "phone": "+380674922358"
  }
}
```

```json
{
  "id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:08:22.523377Z",
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
    "id": "11fa90e4-bae4-416e-8826-707b0d41eb94",
    "order_id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
    "expires_at": "2026-10-30T08:08:37.526093Z",
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

`POST /api/driver/v1/offers/11fa90e4-bae4-416e-8826-707b0d41eb94/accept` → **200**

```json
{
  "command_id": "a1def4d3-03ba-442e-9d78-83d4d17b4ea2"
}
```

```json
{
  "id": "b027c3c8-d587-485a-996c-c8dd1e5ecd8f",
  "order_id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "003f422b-69a1-45ca-b82b-31bd33b51c27",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "003f422b-69a1-45ca-b82b-31bd33b51c27",
  "order_id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
  "assignment_id": "b027c3c8-d587-485a-996c-c8dd1e5ecd8f",
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
    "phone": "+380674922358"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5ab36281-f533-4150-b015-32a19bb294dd",
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
  "id": "a31ef145-1f44-4c1d-aadb-74aaa69148d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:23.349424Z",
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
  "command_id": "4c6d7ae9-161d-4b62-97e5-08fc20dc02dc",
  "quote_id": "a31ef145-1f44-4c1d-aadb-74aaa69148d9",
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
  "id": "daf1a967-8641-4e45-9038-50be4d00011c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:08:23.559774Z",
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
  "command_id": "16fc8962-b1eb-4286-9f04-b33685c34420",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:08:23Z"
}
```

```json
{
  "id": "6e36eff5-6b55-4ef5-b47a-ff3a0e4dfcfd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:23.780309Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:08:23Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "52c1c0fe-8747-4190-ba23-5b2cbc299eb5",
  "quote_id": "6e36eff5-6b55-4ef5-b47a-ff3a0e4dfcfd",
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
  "pickup_at": "2026-10-30T11:08:23Z"
}
```

```json
{
  "id": "85eec3eb-3c38-490d-9fcd-20cb5f22164e",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:08:23.986744Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:08:23Z",
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
  "command_id": "723752b9-3ca7-4aa7-96ed-d6b342e7959c",
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
  "id": "46cb8669-dfae-42c9-95c3-5331da62614f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:24.206462Z",
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
  "command_id": "220b9721-56a7-40bf-9180-ddb08f6cd746",
  "quote_id": "46cb8669-dfae-42c9-95c3-5331da62614f",
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
  "correlation_id": "ce947265-2119-4f28-9bed-2e2fc50b78f2"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "85eec3eb-3c38-490d-9fcd-20cb5f22164e",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:08:23.986744Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:08:23Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "daf1a967-8641-4e45-9038-50be4d00011c",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T08:08:23.559774Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "daf1a967-8641-4e45-9038-50be4d00011c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:08:23.559774Z",
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

`GET /api/rider/v1/orders/d4a01528-3ed3-4c43-be34-fae9d1421924` → **200**

```json
{
  "id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b027c3c8-d587-485a-996c-c8dd1e5ecd8f",
    "order_id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "003f422b-69a1-45ca-b82b-31bd33b51c27",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:08:22.523377Z",
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
    "location_at": "2026-10-30T08:08:21.639219Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/d4a01528-3ed3-4c43-be34-fae9d1421924/cancel` → **200**

```json
{
  "command_id": "f2146328-1e7b-4bca-bf5c-d26df5040bc5",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b027c3c8-d587-485a-996c-c8dd1e5ecd8f",
    "order_id": "d4a01528-3ed3-4c43-be34-fae9d1421924",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "003f422b-69a1-45ca-b82b-31bd33b51c27",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:08:22.523377Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/daf1a967-8641-4e45-9038-50be4d00011c` → **200**

```json
{
  "id": "daf1a967-8641-4e45-9038-50be4d00011c",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:08:23.559774Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/daf1a967-8641-4e45-9038-50be4d00011c/cancel` → **200**

```json
{
  "command_id": "1a45ad7b-544c-48fa-bcfe-784ff9b62e42",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "daf1a967-8641-4e45-9038-50be4d00011c",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:08:23.559774Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/85eec3eb-3c38-490d-9fcd-20cb5f22164e` → **200**

```json
{
  "id": "85eec3eb-3c38-490d-9fcd-20cb5f22164e",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:08:23.986744Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:08:23Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/85eec3eb-3c38-490d-9fcd-20cb5f22164e/cancel` → **200**

```json
{
  "command_id": "a63a4bab-9d21-4480-bbfb-e2c8dcc968a6",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "85eec3eb-3c38-490d-9fcd-20cb5f22164e",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "57b49bf6-f887-4243-a4f0-ca6231e8191d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:08:23.986744Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-30T11:08:23Z",
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
  "session_id": "08fc2ed9-ee13-4145-97c4-728f108ab65f",
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
  "last_heartbeat_at": "2026-10-30T08:08:21.639219Z",
  "last_location_at": "2026-10-30T08:08:21.639219Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08fc2ed9-ee13-4145-97c4-728f108ab65f/close` → **200**

```json
{
  "command_id": "e3f057a2-f558-4938-8a45-e7b9c125428e",
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

Done: orders d4a01528-3ed3-4c43-be34-fae9d1421924, daf1a967-8641-4e45-9038-50be4d00011c, 85eec3eb-3c38-490d-9fcd-20cb5f22164e.

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
  "session_id": "86dd8142-d1f0-4516-adaa-71f2e823dab4",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2MDYsImlhdCI6MTc5MzM0NzcwNiwianRpIjoiZGEyNWExZWQtOTliYi00NGQ4LWEyYmQtYzNiMmM2NWZiMDUyIiwic2lkIjoiODZkZDgxNDItZDFmMC00NTE2LWFkYWEtNzFmMmU4MjNkYWI0In0.iB6xUyEN5gmvkmbDl0c-iSZTmt5vM-TV8UA__tJZ_zo",
  "access_expires_at": "2026-10-30T08:23:26.908965434Z",
  "refresh_token": "WlH1fmxyjf2ey-OYSdCiPT12Bpw55hN3fHmUSm18lSU",
  "refresh_expires_at": "2026-10-30T20:08:26.908336123Z",
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
  "session_id": "cb1f24d9-55cd-4b53-bed0-41a2af8bb494",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2MDcsImlhdCI6MTc5MzM0NzcwNywianRpIjoiM2ZmMzg5MTgtZjcxMy00N2I0LTkxODEtMjdlYTgwMGY0Y2FhIiwic2lkIjoiY2IxZjI0ZDktNTVjZC00YjUzLWJlZDAtNDFhMmFmOGJiNDk0In0.wqU_MGm4N0LOc6MJ_T4JZIvevJEStYye7bR3B2VpIEg",
  "access_expires_at": "2026-10-30T08:23:27.333824304Z",
  "refresh_token": "rU9epHPdHD1Q00ej-VfMjCX3WqxAv_-kyYBBLs-SUDA",
  "refresh_expires_at": "2026-10-30T20:08:27.333323371Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16343"
}
```

```json
{
  "challenge_id": "18b8a2e4-db18-43ca-93bc-e46c8862b331",
  "expires_at": "2026-10-30T08:13:27.552658254Z",
  "resend_available_at": "2026-10-30T08:08:28.552658254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "339313",
  "sent_at": "2026-10-30T08:08:27.555668497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18b8a2e4-db18-43ca-93bc-e46c8862b331",
  "code": "339313",
  "device_ref": "sandbox-16343"
}
```

```json
{
  "session_id": "e606b5ac-b5ee-47a0-904b-3d2c1b59e6fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODYwNywiaWF0IjoxNzkzMzQ3NzA3LCJqdGkiOiIzOTdiNzcxMS01YmI0LTRmOTQtOTcyOC1hMmQ3NjU4ZGViZmQiLCJzaWQiOiJlNjA2YjVhYy1iNWVlLTQ3YTAtOTA0Yi0zZDJjMWI1OWU2ZmQifQ.OoEiX4JfGsB7hTH3BL4f-Dnl3iul5CCsEs8PwJ3on9I",
  "access_expires_at": "2026-10-30T08:23:27.795371236Z",
  "refresh_token": "C5Sv9Sg6WeOnPleF2lVD_1g3ENKKbSy4CvkmlT6NTxY",
  "refresh_expires_at": "2026-11-29T08:08:27.794765717Z",
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
  "command_id": "02acc5cb-c276-486a-82a0-9ab84b506d22",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:28Z",
    "sequence": 1793347708183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a66c5543-46f2-4f5c-9fdc-9b6a70d8b241",
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
  "last_heartbeat_at": "2026-10-30T08:08:28.198357Z",
  "last_location_at": "2026-10-30T08:08:28.198357Z",
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
  "command_id": "7408bbdd-d06c-47a5-80e5-8ba047343f61",
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
  "effective_at": "2026-10-30T08:08:28.620203Z",
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:06:26.740947Z",
  "last_entries": [
    {
      "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:06:26.740947Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a128c9eb-a1b2-4ef5-bd1e-8642a46aa006",
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
  "id": "07c36f4c-676e-4944-bd6e-3b70bc1311b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:29.027878Z",
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
  "command_id": "782feae5-8387-4eb9-bcc1-b44e6aee84f6",
  "quote_id": "07c36f4c-676e-4944-bd6e-3b70bc1311b2",
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
    "phone": "+3806711111193"
  }
}
```

```json
{
  "id": "77d34a4f-06f0-4893-b501-6075b7a40842",
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
  "created_at": "2026-10-30T08:08:29.241344Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111193"
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
    "id": "434eb548-d113-4b64-bb5d-72f83be49a38",
    "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
    "expires_at": "2026-10-30T08:08:44.244625Z",
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

`POST /api/driver/v1/offers/434eb548-d113-4b64-bb5d-72f83be49a38/accept` → **200**

```json
{
  "command_id": "ce7dc38f-2d37-4c30-9f8c-179ac71702bc"
}
```

```json
{
  "id": "8b6007c2-dd25-4ea2-a191-5839a0de5969",
  "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4533fdef-870d-442a-a827-9dcc8e9490c7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4533fdef-870d-442a-a827-9dcc8e9490c7",
  "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
  "assignment_id": "8b6007c2-dd25-4ea2-a191-5839a0de5969",
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
    "phone": "+3806711111193"
  }
}
```

`POST /api/driver/v1/work-sessions/a66c5543-46f2-4f5c-9fdc-9b6a70d8b241/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:08:30Z",
    "sequence": 1793347710511
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a66c5543-46f2-4f5c-9fdc-9b6a70d8b241",
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
  "last_heartbeat_at": "2026-10-30T08:08:30.066382Z",
  "last_location_at": "2026-10-30T08:08:30.066382Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4533fdef-870d-442a-a827-9dcc8e9490c7/arrive` → **200**

```json
{
  "command_id": "3282885c-ae93-499c-928f-b6f952b706a5",
  "expected_version": 0
}
```

```json
{
  "id": "4533fdef-870d-442a-a827-9dcc8e9490c7",
  "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
  "assignment_id": "8b6007c2-dd25-4ea2-a191-5839a0de5969",
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
  "arrived_at": "2026-10-30T08:08:30.273085Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111193"
  }
}
```

`POST /api/driver/v1/trips/4533fdef-870d-442a-a827-9dcc8e9490c7/start` → **200**

```json
{
  "command_id": "518bf9b3-1b49-4fc9-9eb1-bdd3468ae183",
  "expected_version": 1
}
```

```json
{
  "id": "4533fdef-870d-442a-a827-9dcc8e9490c7",
  "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
  "assignment_id": "8b6007c2-dd25-4ea2-a191-5839a0de5969",
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
  "arrived_at": "2026-10-30T08:08:30.273085Z",
  "started_at": "2026-10-30T08:08:30.479263Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711111193"
  }
}
```

`POST /api/driver/v1/trips/4533fdef-870d-442a-a827-9dcc8e9490c7/complete` → **200**

```json
{
  "command_id": "1d9deabf-b19e-4d47-bae3-095cbe59921f",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:08:30Z",
  "cash_received": true
}
```

```json
{
  "id": "4533fdef-870d-442a-a827-9dcc8e9490c7",
  "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
  "assignment_id": "8b6007c2-dd25-4ea2-a191-5839a0de5969",
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
  "arrived_at": "2026-10-30T08:08:30.273085Z",
  "started_at": "2026-10-30T08:08:30.479263Z",
  "completed_at": "2026-10-30T08:08:30.701049Z",
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
  "command_id": "887e9c51-0d4e-425d-ae75-e2489aa8d429",
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
  "id": "f6f0c0d5-20de-40eb-a775-3bc00a7b7f55",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:30.942043Z",
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
  "command_id": "889b4492-45e9-4dad-96a9-ac8affb5a168",
  "quote_id": "f6f0c0d5-20de-40eb-a775-3bc00a7b7f55",
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
    "phone": "+3806711131955"
  }
}
```

```json
{
  "id": "43a6371d-cc96-471d-8dea-075b0682807a",
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
  "created_at": "2026-10-30T08:08:31.163992Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131955"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/43a6371d-cc96-471d-8dea-075b0682807a` → **200**

```json
{
  "id": "43a6371d-cc96-471d-8dea-075b0682807a",
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
  "created_at": "2026-10-30T08:08:31.163992Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131955"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/43a6371d-cc96-471d-8dea-075b0682807a/cancel` → **200**

```json
{
  "command_id": "0c3aaba7-7c0f-4905-aa8d-2dfbf9b0be02",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "43a6371d-cc96-471d-8dea-075b0682807a",
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
  "created_at": "2026-10-30T08:08:31.163992Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131955"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
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
  "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:06:26.740947Z",
  "last_entries": [
    {
      "order_id": "43a6371d-cc96-471d-8dea-075b0682807a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:08:31.626231Z"
    },
    {
      "order_id": "77d34a4f-06f0-4893-b501-6075b7a40842",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:08:30.704612Z"
    },
    {
      "order_id": "38f68ddb-f4bc-442d-9b21-d31fa9d237c8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:06:26.740947Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a66c5543-46f2-4f5c-9fdc-9b6a70d8b241",
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
  "last_heartbeat_at": "2026-10-30T08:08:30.066382Z",
  "last_location_at": "2026-10-30T08:08:30.066382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a66c5543-46f2-4f5c-9fdc-9b6a70d8b241/close` → **200**

```json
{
  "command_id": "c24621f6-18b1-4d95-8c8d-d8d559a8526e",
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

Done: operator bonus for fulfilled 77d34a4f-06f0-4893-b501-6075b7a40842 and operator-fault cancellation 43a6371d-cc96-471d-8dea-075b0682807a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676160465",
  "device_ref": "sandbox-8730"
}
```

```json
{
  "challenge_id": "615da5f3-22b7-4551-b381-e8d757fd9ece",
  "expires_at": "2026-10-30T08:13:35.70352112Z",
  "resend_available_at": "2026-10-30T08:08:36.70352112Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676160465` → **200**

```json
{
  "phone": "+380676160465",
  "audience": "CLIENT",
  "code": "668911",
  "sent_at": "2026-10-30T08:08:35.705799588Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672083970",
  "device_ref": "sandbox-7163",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b6eae960-549e-4cec-a149-8fb2924e59a7",
  "expires_at": "2026-10-30T08:13:37.128090981Z",
  "resend_available_at": "2026-10-30T08:08:38.128090981Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672083970` → **200**

```json
{
  "phone": "+380672083970",
  "audience": "CLIENT",
  "code": "198626",
  "sent_at": "2026-10-30T08:08:37.129855522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672083970",
  "device_ref": "sandbox-26380",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8212aa9a-8c53-43c2-b28b-b7672f3a6249",
  "expires_at": "2026-10-30T08:13:38.546254949Z",
  "resend_available_at": "2026-10-30T08:08:39.546254949Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672083970` → **200**

```json
{
  "phone": "+380672083970",
  "audience": "CLIENT",
  "code": "812459",
  "sent_at": "2026-10-30T08:08:38.548930359Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672910000",
  "device_ref": "sandbox-12498"
}
```

```json
{
  "challenge_id": "ce2de138-5592-49f8-ab94-61176d28fa8e",
  "expires_at": "2026-10-30T08:13:39.988299363Z",
  "resend_available_at": "2026-10-30T08:08:40.988299363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672910000",
  "device_ref": "sandbox-419"
}
```

```json
{
  "challenge_id": "f1eb3605-7c63-498b-8094-5c977f0050f0",
  "expires_at": "2026-10-30T08:13:41.396246242Z",
  "resend_available_at": "2026-10-30T08:08:42.396246242Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672910000` → **200**

```json
{
  "phone": "+380672910000",
  "audience": "CLIENT",
  "code": "820632",
  "sent_at": "2026-10-30T08:08:41.398996438Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672910000",
  "device_ref": "sandbox-16602",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "93cb3647-724a-41bb-8541-7f6fd43361c3",
  "expires_at": "2026-10-30T08:13:42.824955055Z",
  "resend_available_at": "2026-10-30T08:08:43.824955055Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672910000` → **200**

```json
{
  "phone": "+380672910000",
  "audience": "CLIENT",
  "code": "209447",
  "sent_at": "2026-10-30T08:08:42.827254166Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380672910000",
  "device_ref": "sandbox-24163",
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
  "correlation_id": "363dd7ac-de15-47c8-92d3-39d9b4d4a286",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000011665"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "cf3dd90c-0567-424c-968b-41c9d3122020"
}
```

`GET /sandbox/v1/otp?phone=%2B442000011665` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120003447"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e7ac0cce-a213-4be2-b094-7524f5907b9e"
}
```

`GET /sandbox/v1/otp?phone=%2B37120003447` → **404**

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
  "session_id": "c1e4a31a-4dd5-4be6-9cb8-5968a2cf8cb2",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2MjUsImlhdCI6MTc5MzM0NzcyNSwianRpIjoiZTFjMTJhZGYtZmZhMS00YjgxLTlhYTQtYzRjN2JmMzI5OTUzIiwic2lkIjoiYzFlNGEzMWEtNGRkNS00YmU2LTljYjgtNTk2OGEyY2Y4Y2IyIn0.sma-QlTzVrpdoO5V4rz5k1jH8vaLTtSfNa1tir6PyKo",
  "access_expires_at": "2026-10-30T08:23:45.143323963Z",
  "refresh_token": "ouP1qMpVeuAV-V4RATJVYa45ortTBoMZc1Zx-kYiURk",
  "refresh_expires_at": "2026-10-30T20:08:45.142572034Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672910000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8334f23d-f1e4-4cb0-a415-3f520d5adb65",
      "challenge_id": "93cb3647-724a-41bb-8541-7f6fd43361c3",
      "phone": "+380672910000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4dae4fa9-54c1-44ac-aaa8-210547b17ca4",
      "error": null,
      "attempted_at": "2026-10-30T08:08:42.827616Z"
    },
    {
      "id": "c67b6bf7-b823-4b06-829a-a683a9a6515f",
      "challenge_id": "f1eb3605-7c63-498b-8094-5c977f0050f0",
      "phone": "+380672910000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-87c18bb3-449a-458e-b174-89d49adccbb6",
      "error": null,
      "attempted_at": "2026-10-30T08:08:41.399529Z"
    },
    {
      "id": "c0b7afd4-89a5-4f8d-aab0-fb0c097ae14d",
      "challenge_id": "ce2de138-5592-49f8-ab94-61176d28fa8e",
      "phone": "+380672910000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:08:39.992488Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672910000` → **200**

```json
{
  "phone": "+380672910000",
  "audience": "CLIENT",
  "code": "209447",
  "sent_at": "2026-10-30T08:08:42.827254166Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672083970` → **200**

```json
{
  "deliveries": [
    {
      "id": "12c037f7-7cb0-4310-adb8-57faed0568ff",
      "challenge_id": "8212aa9a-8c53-43c2-b28b-b7672f3a6249",
      "phone": "+380672083970",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3c47a18c-436a-46c9-aa63-b9e5da383178",
      "error": null,
      "attempted_at": "2026-10-30T08:08:38.549291Z"
    },
    {
      "id": "c4e37dac-cd1e-4d96-bfbc-25f5a859d908",
      "challenge_id": "b6eae960-549e-4cec-a149-8fb2924e59a7",
      "phone": "+380672083970",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5ed88edd-b3de-4baf-8543-898b653c5f15",
      "error": null,
      "attempted_at": "2026-10-30T08:08:37.130436Z"
    }
  ]
}
```

Done: SMS to +380676160465; SMS then a call to +380672083970; a failed SMS, two calls and a refused third to +380672910000; +44 and +371 refused.

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
  "session_id": "371088a5-e856-4d4c-9551-06272497e404",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2MjYsImlhdCI6MTc5MzM0NzcyNiwianRpIjoiZTFiMjk1OGUtMWMxOS00YjBhLWI1YjQtNmFiYTUxY2FhMjYyIiwic2lkIjoiMzcxMDg4YTUtZTg1Ni00ZDRjLTk1NTEtMDYyNzI0OTdlNDA0In0.hiS0IW9HeDk-SzzfEk-9RvksToJFtcLzbyTdtJ31nfc",
  "access_expires_at": "2026-10-30T08:23:46.077183675Z",
  "refresh_token": "S5_vp-F9WgqDT9qvRVt1-Mgmyclo92HHB-vywuKXRyc",
  "refresh_expires_at": "2026-10-30T20:08:46.076778814Z",
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
  "session_id": "944c7208-17bd-4c75-b566-71fbe85c1d5e",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2MjYsImlhdCI6MTc5MzM0NzcyNiwianRpIjoiOTdhMTBhODQtYzY4MC00ZGFjLWFhZjctY2M5NmNlOTNlMWVkIiwic2lkIjoiOTQ0YzcyMDgtMTdiZC00Yzc1LWI1NjYtNzFmYmU4NWMxZDVlIn0.hjb2HhB__xQ94DhfSYGOUakWrnbZ9UJ8otH1akmr1os",
  "access_expires_at": "2026-10-30T08:23:46.539251879Z",
  "refresh_token": "-HKRArNrllYoQYevyKsYIoVqkxdUZdU-GmtZ9-m8UWc",
  "refresh_expires_at": "2026-10-30T20:08:46.538672752Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
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

`POST /api/admin/v1/staff-extensions/8376c519-cbee-4321-85f7-c1f8d0d41429` → **200**

```json
{
  "command_id": "29eeda86-ad87-4447-a76d-ff52b71709df",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "820bb955-7b4b-4130-bc5a-7e47c04e9636",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:08:47.361116Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:08:47.361116Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8089d162-e6a0-4b65-8d38-5a87851888e8",
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
  "id": "dc6a8315-d3be-4b0d-8158-e8122bd17e52",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:13:47.772422Z",
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
  "command_id": "6abfa666-51c9-4d94-9112-f69a4c3aa5ec",
  "quote_id": "dc6a8315-d3be-4b0d-8158-e8122bd17e52",
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
    "phone": "+380673979404"
  }
}
```

```json
{
  "id": "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac",
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
  "created_at": "2026-10-30T08:08:47.991247Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673979404"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/40150493-6e9a-4e18-b5e2-5ddeaedbb5ac/calls` → **201**

```json
{
  "command_id": "df6ce601-e1fa-40b6-a464-87315aed8bfa",
  "to": "CALLER"
}
```

```json
{
  "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "order_ids": [
    "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
  ],
  "started_at": "2026-10-30T08:08:48.228656Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/40150493-6e9a-4e18-b5e2-5ddeaedbb5ac/calls` → **201**

```json
{
  "command_id": "df6ce601-e1fa-40b6-a464-87315aed8bfa",
  "to": "CALLER"
}
```

```json
{
  "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "order_ids": [
    "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
  ],
  "started_at": "2026-10-30T08:08:48.228656Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673979404",
    "at": "2026-10-30T08:08:48.230913861Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.30204",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "704ddaa2-02f2-404d-b761-064c46ce02b8"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "calls": [
    {
      "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
      ],
      "started_at": "2026-10-30T08:08:48.228656Z",
      "answered_at": "2026-10-30T08:08:48.711276Z",
      "ended_at": "2026-10-30T08:08:48.72752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "calls": [
    {
      "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
      ],
      "started_at": "2026-10-30T08:08:48.228656Z",
      "answered_at": "2026-10-30T08:08:48.711276Z",
      "ended_at": "2026-10-30T08:08:48.72752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "calls": [
    {
      "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
      ],
      "started_at": "2026-10-30T08:08:48.228656Z",
      "answered_at": "2026-10-30T08:08:48.711276Z",
      "ended_at": "2026-10-30T08:08:48.72752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "calls": [
    {
      "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
      ],
      "started_at": "2026-10-30T08:08:48.228656Z",
      "answered_at": "2026-10-30T08:08:48.711276Z",
      "ended_at": "2026-10-30T08:08:48.72752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "calls": [
    {
      "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
      ],
      "started_at": "2026-10-30T08:08:48.228656Z",
      "answered_at": "2026-10-30T08:08:48.711276Z",
      "ended_at": "2026-10-30T08:08:48.72752Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "calls": [
    {
      "id": "704ddaa2-02f2-404d-b761-064c46ce02b8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "order_ids": [
        "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac"
      ],
      "started_at": "2026-10-30T08:08:48.228656Z",
      "answered_at": "2026-10-30T08:08:48.711276Z",
      "ended_at": "2026-10-30T08:08:48.72752Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:08:58.263585Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/40150493-6e9a-4e18-b5e2-5ddeaedbb5ac` → **200**

```json
{
  "id": "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac",
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
  "created_at": "2026-10-30T08:08:47.991247Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673979404"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/40150493-6e9a-4e18-b5e2-5ddeaedbb5ac/cancel` → **200**

```json
{
  "command_id": "a1919262-b318-470c-ae3d-a5413a4c7465",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "40150493-6e9a-4e18-b5e2-5ddeaedbb5ac",
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
  "created_at": "2026-10-30T08:08:47.991247Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673979404"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "command_id": "4920a98f-aa62-49ae-b367-9f92edbb5455",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:09:00.520825Z",
  "extension": "101"
}
```

Done: outgoing call 704ddaa2-02f2-404d-b761-064c46ce02b8 from order 40150493-6e9a-4e18-b5e2-5ddeaedbb5ac, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637832703",
  "device_ref": "sandbox-1620"
}
```

```json
{
  "challenge_id": "d6743cfe-d396-46ea-b90e-797ce296cbdc",
  "expires_at": "2026-10-30T08:14:00.738650903Z",
  "resend_available_at": "2026-10-30T08:09:01.738650903Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637832703` → **200**

```json
{
  "phone": "+380637832703",
  "audience": "CLIENT",
  "code": "051366",
  "sent_at": "2026-10-30T08:09:00.740937233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6743cfe-d396-46ea-b90e-797ce296cbdc",
  "code": "051366",
  "device_ref": "sandbox-1620"
}
```

```json
{
  "session_id": "f53dd268-f9e9-4288-a6a6-9b370f8c9916",
  "subject": {
    "type": "CLIENT",
    "id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmVlNmVhOS1kOGViLTRkNTctYjE3Ni1iMDc1YzYxMzc3YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjQwLCJpYXQiOjE3OTMzNDc3NDAsImp0aSI6IjdiZjFjZjVkLTQ5M2ItNDZhNC1hMmYxLWRhZmY2MzI3ZDM0OCIsInNpZCI6ImY1M2RkMjY4LWY5ZTktNDI4OC1hNmE2LTliMzcwZjhjOTkxNiJ9.L-0BnvcqTzcDmzYFn07J0x0pdtYTV9BMWR6F6tiIVCo",
  "access_expires_at": "2026-10-30T08:24:00.966164596Z",
  "refresh_token": "S4SPb9Jb1Iia1B-qPLi1Fq3v3uTOpjd8Zi8gOVlqT6Q",
  "refresh_expires_at": "2026-11-29T08:09:00.965530836Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
  "session_id": "f53dd268-f9e9-4288-a6a6-9b370f8c9916",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637832703",
  "device_ref": "sandbox-29131"
}
```

```json
{
  "challenge_id": "1458517f-b335-4f9c-8c3e-a1cba2bf9a00",
  "expires_at": "2026-10-30T08:14:03.370568757Z",
  "resend_available_at": "2026-10-30T08:09:04.370568757Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637832703` → **200**

```json
{
  "phone": "+380637832703",
  "audience": "CLIENT",
  "code": "121971",
  "sent_at": "2026-10-30T08:09:03.372815466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1458517f-b335-4f9c-8c3e-a1cba2bf9a00",
  "code": "121971",
  "device_ref": "sandbox-29131"
}
```

```json
{
  "session_id": "19e90259-03dc-423d-a812-87017fc8c73c",
  "subject": {
    "type": "CLIENT",
    "id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmVlNmVhOS1kOGViLTRkNTctYjE3Ni1iMDc1YzYxMzc3YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjQzLCJpYXQiOjE3OTMzNDc3NDMsImp0aSI6ImE0ZWIyYmVlLTIxYWQtNDBiYS04OWRiLWQ1NWM5Zjk3YTc4NCIsInNpZCI6IjE5ZTkwMjU5LTAzZGMtNDIzZC1hODEyLTg3MDE3ZmM4YzczYyJ9.Osk871Jkoi1NCeCvdWTXRKhh10QqMlcF3eHgnvFAhoA",
  "access_expires_at": "2026-10-30T08:24:03.601126518Z",
  "refresh_token": "sGGBKGmYaN0j-R8OsMyrCJj0XZhrwv6bzJ3UvgUoF7Q",
  "refresh_expires_at": "2026-11-29T08:09:03.60059434Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "955c1a07-fb9c-4c47-acf4-bfad1b61648c",
  "expires_at": "2026-10-30T08:14:05.806699442Z",
  "resend_available_at": "2026-10-30T08:09:06.806699442Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637832703` → **200**

```json
{
  "phone": "+380637832703",
  "audience": "CLIENT",
  "code": "139071",
  "sent_at": "2026-10-30T08:09:05.809182117Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634440707"
}
```

```json
{
  "challenge_id": "76b7ee63-6454-49d8-8d36-bc921e156386",
  "expires_at": "2026-10-30T08:14:06.036623303Z",
  "resend_available_at": "2026-10-30T08:09:07.036623303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634440707` → **200**

```json
{
  "phone": "+380634440707",
  "audience": "CLIENT",
  "code": "360837",
  "sent_at": "2026-10-30T08:09:06.038802873Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "06f5d62e-a974-40dc-9cd6-ef085fe2f0b3",
  "current_challenge_id": "955c1a07-fb9c-4c47-acf4-bfad1b61648c",
  "current_code": "000000",
  "new_challenge_id": "76b7ee63-6454-49d8-8d36-bc921e156386",
  "new_code": "360837"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "fe713b95-27a0-4417-a45d-9f6a58e10fb7"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "8674e553-c4a0-4865-9a92-57df297be9e9",
  "current_challenge_id": "955c1a07-fb9c-4c47-acf4-bfad1b61648c",
  "current_code": "139071",
  "new_challenge_id": "76b7ee63-6454-49d8-8d36-bc921e156386",
  "new_code": "360837"
}
```

```json
{
  "subject_id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
  "phone": "+380634440707",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
  "session_id": "f53dd268-f9e9-4288-a6a6-9b370f8c9916",
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
  "correlation_id": "8b1c57a2-0da0-4c04-90bb-004e80867a13"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634440707",
  "device_ref": "sandbox-5629"
}
```

```json
{
  "challenge_id": "23b7f9f6-9f8e-4e1b-9f27-e9ab818da516",
  "expires_at": "2026-10-30T08:14:09.141094164Z",
  "resend_available_at": "2026-10-30T08:09:10.141094164Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634440707` → **200**

```json
{
  "phone": "+380634440707",
  "audience": "CLIENT",
  "code": "106245",
  "sent_at": "2026-10-30T08:09:09.143509819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23b7f9f6-9f8e-4e1b-9f27-e9ab818da516",
  "code": "106245",
  "device_ref": "sandbox-5629"
}
```

```json
{
  "session_id": "d81516d3-ec96-4e95-9f39-4a2997b0e078",
  "subject": {
    "type": "CLIENT",
    "id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmVlNmVhOS1kOGViLTRkNTctYjE3Ni1iMDc1YzYxMzc3YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjQ5LCJpYXQiOjE3OTMzNDc3NDksImp0aSI6Ijk2NGM4OWQyLTNiMWYtNDljNi05NDAxLWVjNDliOGY2MWZlYSIsInNpZCI6ImQ4MTUxNmQzLWVjOTYtNGU5NS05ZjM5LTRhMjk5N2IwZTA3OCJ9.TDdjM-1y9da4rfG5IdhUX9_8hCvW57GUhnyU-IFE6Fs",
  "access_expires_at": "2026-10-30T08:24:09.363996361Z",
  "refresh_token": "EvOFki3elYZl-HaGSA5Z0Pwdt6i67ldhSt21fD5Ol58",
  "refresh_expires_at": "2026-11-29T08:09:09.363365395Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
  "session_id": "d81516d3-ec96-4e95-9f39-4a2997b0e078",
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
  "session_id": "314c7877-8ab7-42e1-813c-46a88a242832",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NDksImlhdCI6MTc5MzM0Nzc0OSwianRpIjoiN2NlY2Y3ZTctZjdlYi00OTQ5LTg2ZGItNWMwM2U0YTU3NDFhIiwic2lkIjoiMzE0Yzc4NzctOGFiNy00MmUxLTgxM2MtNDZhODhhMjQyODMyIn0.pPHD8dOyKzpxqngxl_sU2Ij49eDjksWbT7T4nwsHu7o",
  "access_expires_at": "2026-10-30T08:24:09.989694914Z",
  "refresh_token": "hsB8oIk6UljJ8CTh6z3EMwWKsy-TWFFIrOKzTyIO1wY",
  "refresh_expires_at": "2026-10-30T20:09:09.989264663Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2` → **200**

```json
{
  "client": {
    "id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
    "phone": "+380634440707",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:09:00.963327Z",
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

`POST /api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2/phone/new-code` → **201**

```json
{
  "phone": "+380633846806"
}
```

```json
{
  "challenge_id": "efa9cf61-3209-4ebf-99bd-543f99f05432",
  "expires_at": "2026-10-30T08:14:10.417603944Z",
  "resend_available_at": "2026-10-30T08:09:11.417603944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633846806` → **200**

```json
{
  "phone": "+380633846806",
  "audience": "CLIENT",
  "code": "759334",
  "sent_at": "2026-10-30T08:09:10.419562896Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2/phone` → **422**

```json
{
  "command_id": "e7ac55e9-fe20-4f97-b55a-bbbc6f33d5a1",
  "expected_version": 3,
  "new_challenge_id": "efa9cf61-3209-4ebf-99bd-543f99f05432",
  "new_code": "759335",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b8084bd3-85dc-4d5a-bdf5-8149020470d5"
}
```

`POST /api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2/phone` → **400**

```json
{
  "command_id": "79cf9afb-e46f-49fc-af18-38233c60d434",
  "expected_version": 3,
  "new_challenge_id": "efa9cf61-3209-4ebf-99bd-543f99f05432",
  "new_code": "759334",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7e2b94ef-a4c9-459c-85ca-eab8c2349055",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/ebee6ea9-d8eb-4d57-b176-b075c61377b2/phone` → **200**

```json
{
  "command_id": "9456f867-e8ce-4664-958d-f6264503cdc4",
  "expected_version": 3,
  "new_challenge_id": "efa9cf61-3209-4ebf-99bd-543f99f05432",
  "new_code": "759334",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
  "phone": "+380633846806",
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
  "correlation_id": "2ef3dc7c-2336-46ea-9257-f4bcda62b9db"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633846806",
  "device_ref": "sandbox-1521"
}
```

```json
{
  "challenge_id": "ad89218f-87c1-40c0-9547-8f4f9ba12962",
  "expires_at": "2026-10-30T08:14:11.467994497Z",
  "resend_available_at": "2026-10-30T08:09:12.467994497Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633846806` → **200**

```json
{
  "phone": "+380633846806",
  "audience": "CLIENT",
  "code": "419747",
  "sent_at": "2026-10-30T08:09:11.470337094Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad89218f-87c1-40c0-9547-8f4f9ba12962",
  "code": "419747",
  "device_ref": "sandbox-1521"
}
```

```json
{
  "session_id": "87a43fb2-3074-4d7d-af8b-ece6735bef5d",
  "subject": {
    "type": "CLIENT",
    "id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmVlNmVhOS1kOGViLTRkNTctYjE3Ni1iMDc1YzYxMzc3YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjUxLCJpYXQiOjE3OTMzNDc3NTEsImp0aSI6ImYyYjY3YjM3LTZiYTItNDBlNi1iMWNhLWM3ODQ0NjVmYTYxMiIsInNpZCI6Ijg3YTQzZmIyLTMwNzQtNGQ3ZC1hZjhiLWVjZTY3MzViZWY1ZCJ9.G5OW04oiMebc9QQIdE7gmD9QKe1Pxq86eRVo5y5Xrl8",
  "access_expires_at": "2026-10-30T08:24:11.693481402Z",
  "refresh_token": "3M2iq2_FfBQD5veGY0kJJK1n2Ve9MRZs4uAdZp_abOg",
  "refresh_expires_at": "2026-11-29T08:09:11.692917516Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ebee6ea9-d8eb-4d57-b176-b075c61377b2",
  "session_id": "87a43fb2-3074-4d7d-af8b-ece6735bef5d",
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
  "phone": "+380635417469",
  "device_ref": "sandbox-8401"
}
```

```json
{
  "challenge_id": "3ede2e65-3a78-42d2-be28-3f0a58930687",
  "expires_at": "2026-10-30T08:14:12.09309932Z",
  "resend_available_at": "2026-10-30T08:09:13.09309932Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635417469` → **200**

```json
{
  "phone": "+380635417469",
  "audience": "CLIENT",
  "code": "735375",
  "sent_at": "2026-10-30T08:09:12.095249969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ede2e65-3a78-42d2-be28-3f0a58930687",
  "code": "735375",
  "device_ref": "sandbox-8401"
}
```

```json
{
  "session_id": "0f324449-89e1-48ec-a9d0-c4bb4150f3b2",
  "subject": {
    "type": "CLIENT",
    "id": "8ec839b4-b148-41b8-a53a-e07e822db5e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWM4MzliNC1iMTQ4LTQxYjgtYTUzYS1lMDdlODIyZGI1ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjUyLCJpYXQiOjE3OTMzNDc3NTIsImp0aSI6ImUxNmE1MjBjLTYyMzMtNGNiZi1iZjlmLWEzMzIyNGI3NWY5OCIsInNpZCI6IjBmMzI0NDQ5LTg5ZTEtNDhlYy1hOWQwLWM0YmI0MTUwZjNiMiJ9.8JJt224EPg9KPw6hyAOre71jg4sg40r5biM4_N4JGTA",
  "access_expires_at": "2026-10-30T08:24:12.31198821Z",
  "refresh_token": "gRbDXJJqa7il9eVZYTgEM-6CYm0iIIhv6b6erc5ujPM",
  "refresh_expires_at": "2026-11-29T08:09:12.311624671Z",
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
  "session_id": "0294465d-4954-4cf9-9abb-93ac92902825",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NTMsImlhdCI6MTc5MzM0Nzc1MywianRpIjoiYjEyZTYzMWMtZGJmNy00N2ZkLTg3OWItZjk4ZmYyNzM4OTEzIiwic2lkIjoiMDI5NDQ2NWQtNDk1NC00Y2Y5LTlhYmItOTNhYzkyOTAyODI1In0.5IaT2RMGLThArwgiLBKsBmUriS_7Uf4ndsUk_RE_X9E",
  "access_expires_at": "2026-10-30T08:24:13.184421209Z",
  "refresh_token": "dFTHolaTAmqvx0C7a9S-ZnRxYFQsT5qnjtSbfJApspQ",
  "refresh_expires_at": "2026-10-30T20:09:13.183888197Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635417469` → **200**

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
  "correlation_id": "782cf3aa-a474-4826-8b4e-467e1aad7b29"
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
  "session_id": "002e1da1-6d60-443d-9a25-6a00367d06f8",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NTQsImlhdCI6MTc5MzM0Nzc1NCwianRpIjoiMWViZmI1MzQtOGVjNS00ZWQ5LWE5NWEtMjJkZmE2ODE1YmJhIiwic2lkIjoiMDAyZTFkYTEtNmQ2MC00NDNkLTlhMjUtNmEwMDM2N2QwNmY4In0.6lFcPmImpl6a6inrRGMwMjDQSAjPmB3xrZMgPUEllv8",
  "access_expires_at": "2026-10-30T08:24:14.032945508Z",
  "refresh_token": "IHEpJaojObX6732TyTiR137IV1tkTT3wv8Ij68EtDuU",
  "refresh_expires_at": "2026-10-30T20:09:14.032538206Z",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:05:53.110307Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3d55251d-6b90-4700-b294-113124560eb6",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:09:14.459931396Z"
}
```

## The rider books the airport for 2026-10-30T11:09:13Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600561152",
  "device_ref": "sandbox-25036"
}
```

```json
{
  "challenge_id": "e956b9e6-25e5-48a3-9cca-8c292400cd62",
  "expires_at": "2026-10-30T08:14:14.679027361Z",
  "resend_available_at": "2026-10-30T08:09:15.679027361Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600561152` → **200**

```json
{
  "phone": "+48600561152",
  "audience": "CLIENT",
  "code": "540330",
  "sent_at": "2026-10-30T08:09:14.681532558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e956b9e6-25e5-48a3-9cca-8c292400cd62",
  "code": "540330",
  "device_ref": "sandbox-25036"
}
```

```json
{
  "session_id": "9f73bcc3-a15e-4a75-b1dd-9d725b6d4fb2",
  "subject": {
    "type": "CLIENT",
    "id": "6c6a5659-d00b-4a33-8516-88d5d0e0cf0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzZhNTY1OS1kMDBiLTRhMzMtODUxNi04OGQ1ZDBlMGNmMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjU0LCJpYXQiOjE3OTMzNDc3NTQsImp0aSI6ImJjNDAxMzkxLTZkYzMtNGIxNC05ZjE0LTQ5ZjlhM2MwOGViOSIsInNpZCI6IjlmNzNiY2MzLWExNWUtNGE3NS1iMWRkLTlkNzI1YjZkNGZiMiJ9.DDpKdDipZDfh7fMPgXiDs4V9PbaOmM6upb3eTO1RCsU",
  "access_expires_at": "2026-10-30T08:24:14.907054005Z",
  "refresh_token": "MVkg3kplXyS4E_948x1kzpy25xDfZnhfUmO4GAQaVrs",
  "refresh_expires_at": "2026-11-29T08:09:14.906362882Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fd354ca5-9e41-4a7e-a994-67fe4d9bf38c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:09:13Z"
}
```

```json
{
  "id": "73cb0705-071d-465e-8f04-563e758cec13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:14:15.117956Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:09:13Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e793c464-c58d-476c-9117-4b3345545ed8",
  "quote_id": "73cb0705-071d-465e-8f04-563e758cec13",
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
  "pickup_at": "2026-10-30T11:09:13Z"
}
```

```json
{
  "id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6c6a5659-d00b-4a33-8516-88d5d0e0cf0b",
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
  "created_at": "2026-10-30T08:09:15.335683Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:09:13Z",
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
  "device_ref": "sandbox-29842"
}
```

```json
{
  "challenge_id": "7778e0e3-eec6-4866-8b12-b6516453ddf9",
  "expires_at": "2026-10-30T08:14:15.551284993Z",
  "resend_available_at": "2026-10-30T08:09:16.551284993Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "023259",
  "sent_at": "2026-10-30T08:09:15.553541436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7778e0e3-eec6-4866-8b12-b6516453ddf9",
  "code": "023259",
  "device_ref": "sandbox-29842"
}
```

```json
{
  "session_id": "19ac3950-29f8-43c3-8e88-102ff9bed6fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODY1NSwiaWF0IjoxNzkzMzQ3NzU1LCJqdGkiOiI5ZmYyNTQ1My1jYzExLTQzOTMtOGU2OC00NjMxZTc1YTJhYTAiLCJzaWQiOiIxOWFjMzk1MC0yOWY4LTQzYzMtOGU4OC0xMDJmZjliZWQ2ZmUifQ.n6m_mICNvaHvBl0EbAbYF09BPdAhtfmFmQ7vX26EFoU",
  "access_expires_at": "2026-10-30T08:24:15.776234045Z",
  "refresh_token": "RQCsSNI6g6GgoFQ3LIKKZTaydHBUagY0OscYWOdzFhk",
  "refresh_expires_at": "2026-11-29T08:09:15.775879967Z",
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
  "command_id": "9f9a2c18-d548-4df7-93a1-1a514c352a19",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:16Z",
    "sequence": 1793347756169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "703b7b82-0bbf-42d9-8cdd-76c467320f33",
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
  "last_heartbeat_at": "2026-10-30T08:09:16.184757Z",
  "last_location_at": "2026-10-30T08:09:16.184757Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
      "short_number": 25,
      "pickup_at": "2026-10-30T11:09:13Z",
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

`POST /api/driver/v1/preorders/718fc445-cad5-47b9-97b5-86eaf9b4e9b8/reserve` → **200**

```json
{
  "command_id": "fa55fccb-98a0-4a61-a482-706f003440fc"
}
```

```json
{
  "id": "3cff1f2f-0650-422e-9023-4d38a21a5d58",
  "state": "RESERVED",
  "order": {
    "order_id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
    "short_number": 25,
    "pickup_at": "2026-10-30T11:09:13Z",
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
  "reserved_at": "2026-10-30T08:09:16.594297Z",
  "confirm_from": "2026-10-30T10:39:13Z",
  "confirm_until": "2026-10-30T10:49:13Z",
  "drop_until": "2026-10-30T10:09:13Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3cff1f2f-0650-422e-9023-4d38a21a5d58",
      "state": "RESERVED",
      "order": {
        "order_id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
        "short_number": 25,
        "pickup_at": "2026-10-30T11:09:13Z",
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
      "reserved_at": "2026-10-30T08:09:16.594297Z",
      "confirm_from": "2026-10-30T10:39:13Z",
      "confirm_until": "2026-10-30T10:49:13Z",
      "drop_until": "2026-10-30T10:09:13Z"
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
      "id": "3cff1f2f-0650-422e-9023-4d38a21a5d58",
      "state": "RESERVED",
      "order": {
        "order_id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
        "short_number": 25,
        "pickup_at": "2026-10-30T11:09:13Z",
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
      "reserved_at": "2026-10-30T08:09:16.594297Z",
      "confirm_from": "2026-10-30T10:39:13Z",
      "confirm_until": "2026-10-30T10:49:13Z",
      "drop_until": "2026-10-30T10:09:13Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3cff1f2f-0650-422e-9023-4d38a21a5d58/confirm` → **409**

```json
{
  "command_id": "302dbc1e-f192-49e5-bfa6-eee0a5b6db4e"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3cff1f2f-0650-422e-9023-4d38a21a5d58/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "74854af8-9ce9-4024-aaa5-b2fbf51c43dd"
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
  "session_id": "73ba5f27-a846-42e7-95da-0db710ca2532",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NTcsImlhdCI6MTc5MzM0Nzc1NywianRpIjoiNTNmMDA0YmEtNTkwNS00MWQ4LTgxM2YtZjNkMWEzNTU1NTBkIiwic2lkIjoiNzNiYTVmMjctYTg0Ni00MmU3LTk1ZGEtMGRiNzEwY2EyNTMyIn0.NcoBBLI17zzH7gDNAhc_72TpqIiCy310b1nmVwAb8b0",
  "access_expires_at": "2026-10-30T08:24:17.636172933Z",
  "refresh_token": "5G0zmlYsNJJRUE7BrqoZcQWeLojyFGN7XUcvcxmPZVU",
  "refresh_expires_at": "2026-10-30T20:09:17.635710588Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/718fc445-cad5-47b9-97b5-86eaf9b4e9b8` → **200**

```json
{
  "id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6c6a5659-d00b-4a33-8516-88d5d0e0cf0b",
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
  "created_at": "2026-10-30T08:09:15.335683Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:09:13Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3cff1f2f-0650-422e-9023-4d38a21a5d58",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:09:16.594297Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/718fc445-cad5-47b9-97b5-86eaf9b4e9b8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:09:15.336629Z",
      "actor": {
        "type": "CLIENT",
        "id": "6c6a5659-d00b-4a33-8516-88d5d0e0cf0b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
        "preorder": true,
        "quote_id": "73cb0705-071d-465e-8f04-563e758cec13",
        "pickup_at": "2026-10-30T11:09:13Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "07ce9727-d97c-441b-9d75-b4e8139e4efd"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:09:16.595494Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "718fc445-cad5-47b9-97b5-86eaf9b4e9b8",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3cff1f2f-0650-422e-9023-4d38a21a5d58"
      },
      "correlation_id": "a627a1f5-409b-436d-98bf-a7c797a7ca69"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 718fc445-cad5-47b9-97b5-86eaf9b4e9b8, reservation 3cff1f2f-0650-422e-9023-4d38a21a5d58.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13038"
}
```

```json
{
  "challenge_id": "7f0074a4-10b4-461f-8e74-fd16ca40c1a2",
  "expires_at": "2026-10-30T08:14:18.272262232Z",
  "resend_available_at": "2026-10-30T08:09:19.272262232Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "846142",
  "sent_at": "2026-10-30T08:09:18.274707599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f0074a4-10b4-461f-8e74-fd16ca40c1a2",
  "code": "846142",
  "device_ref": "sandbox-13038"
}
```

```json
{
  "session_id": "d103d417-f9be-4af6-9093-0b585d0e93a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODY1OCwiaWF0IjoxNzkzMzQ3NzU4LCJqdGkiOiJlMDJjMjgxYy0wNTgzLTQ4NWEtODM3YS02YWE5ZDdjZDRjYjAiLCJzaWQiOiJkMTAzZDQxNy1mOWJlLTRhZjYtOTA5My0wYjU4NWQwZTkzYTcifQ.tQTVt42JECLjut-e-ZV0LKX8vi2LWBj5CCTxDqLmYBU",
  "access_expires_at": "2026-10-30T08:24:18.494996165Z",
  "refresh_token": "GX70rvgf8bFxChTOP4_Y4PrkT_tzQp2qBefbtZMnjn8",
  "refresh_expires_at": "2026-11-29T08:09:18.494646968Z",
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
  "command_id": "31d1fcb5-b110-470c-9e8d-e2eea423827e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:18Z",
    "sequence": 1793347758931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:18.94811Z",
  "last_location_at": "2026-10-30T08:09:18.94811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678919420",
  "device_ref": "sandbox-32437"
}
```

```json
{
  "challenge_id": "6d8deee4-f128-497f-98e4-cbf7900451f1",
  "expires_at": "2026-10-30T08:14:19.174489006Z",
  "resend_available_at": "2026-10-30T08:09:20.174489006Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678919420` → **200**

```json
{
  "phone": "+380678919420",
  "audience": "CLIENT",
  "code": "705207",
  "sent_at": "2026-10-30T08:09:19.177374904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d8deee4-f128-497f-98e4-cbf7900451f1",
  "code": "705207",
  "device_ref": "sandbox-32437"
}
```

```json
{
  "session_id": "befa6239-bb9f-48fe-8c25-ea0c498bec63",
  "subject": {
    "type": "CLIENT",
    "id": "918ac818-17c4-450e-a5df-7bf3835a6e05"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MThhYzgxOC0xN2M0LTQ1MGUtYTVkZi03YmYzODM1YTZlMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjU5LCJpYXQiOjE3OTMzNDc3NTksImp0aSI6IjViMjdkN2Q0LTRjNWEtNGU3NC04MmUyLTE2YjlhZmIxMTUwZCIsInNpZCI6ImJlZmE2MjM5LWJiOWYtNDhmZS04YzI1LWVhMGM0OThiZWM2MyJ9.vBhoJuqn-V7NZLNNfaRPSrIGd-u7xT1YT0bDfHPLlvw",
  "access_expires_at": "2026-10-30T08:24:19.423392535Z",
  "refresh_token": "sF98r8gBLQDdqk-mcrzI4PRLMKFtWDE7lBthOvUzMWA",
  "refresh_expires_at": "2026-11-29T08:09:19.4229157Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76635c77-94ea-4a64-ae76-e11ed127a56d",
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
  "id": "bd176ffe-9131-4c33-adc4-ab899847062a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:14:19.653338Z",
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
  "command_id": "fec8ed35-1a50-4a3a-8769-5965761dd440",
  "quote_id": "bd176ffe-9131-4c33-adc4-ab899847062a",
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
  "id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "918ac818-17c4-450e-a5df-7bf3835a6e05",
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
  "created_at": "2026-10-30T08:09:19.88477Z",
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
    "id": "69a323bf-5b00-4afb-8416-17549b82c1b8",
    "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
    "expires_at": "2026-10-30T08:09:34.887549Z",
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

`POST /api/driver/v1/offers/69a323bf-5b00-4afb-8416-17549b82c1b8/accept` → **200**

```json
{
  "command_id": "4b2914e2-2e9d-4d71-b79f-bfb02078fd8a"
}
```

```json
{
  "id": "4f55fec0-716a-43ec-a8a4-8582b9d271cd",
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "644cd8ef-cd89-4bc3-afca-b07d0c404bb5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "644cd8ef-cd89-4bc3-afca-b07d0c404bb5",
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "assignment_id": "4f55fec0-716a-43ec-a8a4-8582b9d271cd",
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

`POST /api/driver/v1/work-sessions/75df82f6-2577-48bf-b3d7-e94bdda2e84a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:20Z",
    "sequence": 1793347760775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:20.79165Z",
  "last_location_at": "2026-10-30T08:09:20.79165Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "644cd8ef-cd89-4bc3-afca-b07d0c404bb5",
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "assignment_id": "4f55fec0-716a-43ec-a8a4-8582b9d271cd",
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

`POST /api/driver/v1/trips/644cd8ef-cd89-4bc3-afca-b07d0c404bb5/arrive` → **200**

```json
{
  "command_id": "5a4e3dc6-cb32-432e-a021-169b9607b48c",
  "expected_version": 0
}
```

```json
{
  "id": "644cd8ef-cd89-4bc3-afca-b07d0c404bb5",
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "assignment_id": "4f55fec0-716a-43ec-a8a4-8582b9d271cd",
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
  "arrived_at": "2026-10-30T08:09:21.227725Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/644cd8ef-cd89-4bc3-afca-b07d0c404bb5/start` → **200**

```json
{
  "command_id": "edc76081-b624-4baa-8d19-dec6b5adefe4",
  "expected_version": 1
}
```

```json
{
  "id": "644cd8ef-cd89-4bc3-afca-b07d0c404bb5",
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "assignment_id": "4f55fec0-716a-43ec-a8a4-8582b9d271cd",
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
  "arrived_at": "2026-10-30T08:09:21.227725Z",
  "started_at": "2026-10-30T08:09:21.45816Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/75df82f6-2577-48bf-b3d7-e94bdda2e84a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:21Z",
    "sequence": 1793347761678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:21.694196Z",
  "last_location_at": "2026-10-30T08:09:21.694196Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/644cd8ef-cd89-4bc3-afca-b07d0c404bb5/complete` → **200**

```json
{
  "command_id": "97210dc9-4e4b-4a8c-98aa-63de7f7d8bf7",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:09:21Z",
  "cash_received": true
}
```

```json
{
  "id": "644cd8ef-cd89-4bc3-afca-b07d0c404bb5",
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "assignment_id": "4f55fec0-716a-43ec-a8a4-8582b9d271cd",
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
  "arrived_at": "2026-10-30T08:09:21.227725Z",
  "started_at": "2026-10-30T08:09:21.45816Z",
  "completed_at": "2026-10-30T08:09:21.916593Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0b5e6ba3-2fbd-4396-b19b-1ec349f6b296/rating` → **200**

```json
{
  "command_id": "16dc77ca-f28e-4d19-8604-f0bed2a29aac",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "score": 5,
  "created_at": "2026-10-30T08:09:22.161857136Z"
}
```

`POST /api/driver/v1/orders/0b5e6ba3-2fbd-4396-b19b-1ec349f6b296/rating` → **200**

```json
{
  "command_id": "efb14dd4-09b6-4806-a61b-e1f210f85bd9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
  "score": 4,
  "created_at": "2026-10-30T08:09:22.38799474Z"
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
  "session_id": "9ec7b30c-1493-41de-860e-bbe16b941ee3",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NjMsImlhdCI6MTc5MzM0Nzc2MywianRpIjoiNzdkNjAwZTktMTc0OS00NWMyLThlNWUtZjRlNjJkMTViYjQyIiwic2lkIjoiOWVjN2IzMGMtMTQ5My00MWRlLTg2MGUtYmJlMTZiOTQxZWUzIn0.ZNRJftk0NaXU6cjAN5M7TprGcyXPad5uB90GQZ6WDAI",
  "access_expires_at": "2026-10-30T08:24:23.054783018Z",
  "refresh_token": "cxXAbSBwBmsiZKjOd1b2BTpgGus2KGsNsYW_lHrtX3k",
  "refresh_expires_at": "2026-10-30T20:09:23.054371838Z",
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
  "session_id": "af53fd65-ffbc-496e-894c-22f1b16e87dc",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NjMsImlhdCI6MTc5MzM0Nzc2MywianRpIjoiODlhNjE3Y2EtNDM5ZS00NmZmLTkyNzctNTJjY2FjODhkMGJhIiwic2lkIjoiYWY1M2ZkNjUtZmZiYy00OTZlLTg5NGMtMjJmMWIxNmU4N2RjIn0.yOS8nXJkpKItBb9V52vvqZe76AHUyxKdXFe88vQCyDQ",
  "access_expires_at": "2026-10-30T08:24:23.489670088Z",
  "refresh_token": "seuuD8hJltYGo10SHyecMHwPKzP3pTgZeOG0s1O9iJA",
  "refresh_expires_at": "2026-10-30T20:09:23.489225989Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0b5e6ba3-2fbd-4396-b19b-1ec349f6b296/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
      "author_type": "RIDER",
      "author_id": "918ac818-17c4-450e-a5df-7bf3835a6e05",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:09:22.161857Z"
    },
    {
      "order_id": "0b5e6ba3-2fbd-4396-b19b-1ec349f6b296",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "918ac818-17c4-450e-a5df-7bf3835a6e05",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:09:22.387995Z"
    }
  ]
}
```

Done: ratings for order 0b5e6ba3-2fbd-4396-b19b-1ec349f6b296.

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
  "session_id": "34edfcca-94fb-463a-9d59-0c21c83f2776",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NjQsImlhdCI6MTc5MzM0Nzc2NCwianRpIjoiOTU3ZDA4MWMtMGIxZi00NzA2LTk3OGYtYTk3MGNhOTE5Njc4Iiwic2lkIjoiMzRlZGZjY2EtOTRmYi00NjNhLTlkNTktMGMyMWM4M2YyNzc2In0.0SXZqAmczWrzCVK_L8mtkepKY1BAo5NVeZsGFKElGgk",
  "access_expires_at": "2026-10-30T08:24:24.185716672Z",
  "refresh_token": "lc4xOH9E7fcFTA3kj7DOD_oHWN04mbYcoYqUTf6WOJ0",
  "refresh_expires_at": "2026-10-30T20:09:24.185057739Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "34952b52-71e2-4174-b5ef-028dae0603b7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d02fcd75-60ff-46ff-9a50-c9962567986c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:24.418575Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d02fcd75-60ff-46ff-9a50-c9962567986c` → **200**

```json
{
  "id": "d02fcd75-60ff-46ff-9a50-c9962567986c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:24.418575Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d02fcd75-60ff-46ff-9a50-c9962567986c` → **200**

```json
{
  "id": "d02fcd75-60ff-46ff-9a50-c9962567986c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:24.418575Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d02fcd75-60ff-46ff-9a50-c9962567986c` → **200**

```json
{
  "id": "d02fcd75-60ff-46ff-9a50-c9962567986c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:24.418575Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d02fcd75-60ff-46ff-9a50-c9962567986c` → **200**

```json
{
  "id": "d02fcd75-60ff-46ff-9a50-c9962567986c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:24.418575Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d02fcd75-60ff-46ff-9a50-c9962567986c` → **200**

```json
{
  "id": "d02fcd75-60ff-46ff-9a50-c9962567986c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:09:24.418575Z",
  "ready_at": "2026-10-30T08:09:28.307365Z",
  "expires_at": "2026-10-31T08:09:28.307365Z"
}
```

`GET /api/admin/v1/reports/exports/d02fcd75-60ff-46ff-9a50-c9962567986c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a390ce60-2794-479c-8245-184a1460670a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "2084a1bf-e1eb-4b6d-8554-08cf8456a1b7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:29.742091Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2084a1bf-e1eb-4b6d-8554-08cf8456a1b7` → **200**

```json
{
  "id": "2084a1bf-e1eb-4b6d-8554-08cf8456a1b7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:29.742091Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2084a1bf-e1eb-4b6d-8554-08cf8456a1b7` → **200**

```json
{
  "id": "2084a1bf-e1eb-4b6d-8554-08cf8456a1b7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:29.742091Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2084a1bf-e1eb-4b6d-8554-08cf8456a1b7` → **200**

```json
{
  "id": "2084a1bf-e1eb-4b6d-8554-08cf8456a1b7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:09:29.742091Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2084a1bf-e1eb-4b6d-8554-08cf8456a1b7` → **200**

```json
{
  "id": "2084a1bf-e1eb-4b6d-8554-08cf8456a1b7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:09:29.742091Z",
  "ready_at": "2026-10-30T08:09:33.315063Z",
  "expires_at": "2026-10-31T08:09:33.315063Z"
}
```

`GET /api/admin/v1/reports/exports/2084a1bf-e1eb-4b6d-8554-08cf8456a1b7/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9dbe5577-c9f8-4d8b-94e1-f16d1bab111f` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9dbe5577-c9f8-4d8b-94e1-f16d1bab111f",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d68d807f-1089-4780-b93e-a760b0f9ac55"
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
  "device_ref": "sandbox-17654"
}
```

```json
{
  "challenge_id": "93ecdb22-015a-4bb9-9039-b22d5175a072",
  "expires_at": "2026-10-30T08:14:34.018539315Z",
  "resend_available_at": "2026-10-30T08:09:35.018539315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "603461",
  "sent_at": "2026-10-30T08:09:34.0211736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93ecdb22-015a-4bb9-9039-b22d5175a072",
  "code": "603461",
  "device_ref": "sandbox-17654"
}
```

```json
{
  "session_id": "18849579-0505-498f-afc8-741687179ff3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODY3NCwiaWF0IjoxNzkzMzQ3Nzc0LCJqdGkiOiI4YTY1YjVlYi1hODkyLTRhMDUtYmJjZi1mOWIxYjA2MzkwNTEiLCJzaWQiOiIxODg0OTU3OS0wNTA1LTQ5OGYtYWZjOC03NDE2ODcxNzlmZjMifQ.FtPIH47ccLdvRkAyVNx_bcyJ8Z_fNHosgnTohiCES8c",
  "access_expires_at": "2026-10-30T08:24:34.247602455Z",
  "refresh_token": "teHPlX-pSeWSOr7lF0fnAmABrbQL9rnN2x-SesVimWI",
  "refresh_expires_at": "2026-11-29T08:09:34.24686508Z",
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
  "command_id": "a3bbcb4e-e250-462a-bad1-eb63eeee028f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:34Z",
    "sequence": 1793347774856
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a4951b18-8e90-4d7b-b2cb-68c90bc7450a",
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
  "last_heartbeat_at": "2026-10-30T08:09:34.871755Z",
  "last_location_at": "2026-10-30T08:09:34.871755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "d4a84426-d039-4247-a93b-2a3d267e8f35",
  "points": [
    {
      "sequence": 1793347777796,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:08:37Z"
    },
    {
      "sequence": 1793347777854,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:09:37Z"
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
  "session_id": "ae424542-3d1a-4605-94a9-41617a810f4a",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2NzcsImlhdCI6MTc5MzM0Nzc3NywianRpIjoiYTZmNWZiYjItNjQ1My00MmEyLWFmYmQtNzc4NzAyOGU5M2NlIiwic2lkIjoiYWU0MjQ1NDItM2QxYS00NjA1LTk0YTktNDE2MTdhODEwZjRhIn0.UMM4fJR4nr_dVnR6G6NxHetNF8_7Oo03eEIFhXp_YR0",
  "access_expires_at": "2026-10-30T08:24:37.559165886Z",
  "refresh_token": "5bnnT2fWaQkRHRHdsuZp6ZtYO5n5YOZmMO_hf9PF1oM",
  "refresh_expires_at": "2026-10-30T20:09:37.558762698Z",
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
      "id": "a50cdec3-92f1-4750-a4c3-1a8659d3d7b8",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:09:37Z",
        "track_point_id": "9758a0d9-df11-4ff9-8c77-040df089976e",
        "work_session_id": "a4951b18-8e90-4d7b-b2cb-68c90bc7450a"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:09:37Z",
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

`POST /api/admin/v1/driver-risk-flags/a50cdec3-92f1-4750-a4c3-1a8659d3d7b8/confirm` → **200**

```json
{
  "command_id": "3e0f78fc-bf19-4c69-aa54-010949164324",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a50cdec3-92f1-4750-a4c3-1a8659d3d7b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:09:37Z",
    "track_point_id": "9758a0d9-df11-4ff9-8c77-040df089976e",
    "work_session_id": "a4951b18-8e90-4d7b-b2cb-68c90bc7450a"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:09:37Z",
  "reason": null,
  "reviewed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reviewed_at": "2026-10-30T08:09:39.419279Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a50cdec3-92f1-4750-a4c3-1a8659d3d7b8/dismiss` → **409**

```json
{
  "command_id": "bde7e5da-10fa-4390-acac-8057f56c8c89",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a50cdec3-92f1-4750-a4c3-1a8659d3d7b8/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "252508ea-9645-49d0-a3dd-981394b87f16"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "90491746-8957-4402-8bc3-1ce1625c416b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "6a22b1fc-8643-4621-b0f9-6f7ac61e5994",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "raised_at": "2026-10-30T08:09:39.848582Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/6a22b1fc-8643-4621-b0f9-6f7ac61e5994/dismiss` → **200**

```json
{
  "command_id": "e85a7a56-99b4-4d6c-8b0a-e67b4c8abc3b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "6a22b1fc-8643-4621-b0f9-6f7ac61e5994",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "raised_at": "2026-10-30T08:09:39.848582Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reviewed_at": "2026-10-30T08:09:40.060554Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e1cde0c8-79cb-4960-b604-ee1382ba423f",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a50cdec3-92f1-4750-a4c3-1a8659d3d7b8"
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
      "actor_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:09:40.275677Z"
    }
  ]
}
```

Done: flag a50cdec3-92f1-4750-a4c3-1a8659d3d7b8 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "2b4dd1c4-53a7-4e4a-b888-f84b97d83f0c",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2ODAsImlhdCI6MTc5MzM0Nzc4MCwianRpIjoiNTdlM2UwNmQtNzgzZS00NmE2LTlmODktYjRjZTA5MTBhMmRmIiwic2lkIjoiMmI0ZGQxYzQtNTNhNy00ZTRhLWI4ODgtZjg0Yjk3ZDgzZjBjIn0.1f3gJna0dNgZT6BSHabGKrntCU9KxtYDiRo5UqblMxI",
  "access_expires_at": "2026-10-30T08:24:40.909147023Z",
  "refresh_token": "SdvbICip-pjgGiAQtfTvqFyZOPy8rdTiuQC5_eMpaj8",
  "refresh_expires_at": "2026-10-30T20:09:40.90875192Z",
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
      "actor_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:09:40.275677Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "83638d39-ea65-459e-979b-1b0531c4e029",
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
  "session_id": "a4951b18-8e90-4d7b-b2cb-68c90bc7450a",
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
  "last_heartbeat_at": "2026-10-30T08:09:34.871755Z",
  "last_location_at": "2026-10-30T08:09:34.871755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4951b18-8e90-4d7b-b2cb-68c90bc7450a/close` → **200**

```json
{
  "command_id": "608bf72a-410e-4658-b220-2170d54a08d0",
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
  "session_id": "47bc6b3e-ba57-47be-b195-aca7b8c44eef",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2ODIsImlhdCI6MTc5MzM0Nzc4MiwianRpIjoiODEyYmMwZjAtYjdjNy00NWZmLTlmYjctZDFkZWU2NTAwY2NhIiwic2lkIjoiNDdiYzZiM2UtYmE1Ny00N2JlLWIxOTUtYWNhN2I4YzQ0ZWVmIn0.bdwfBkLPQS1tg5NQWd8S1xJy2LFfXfZDgy5TBSBi7gU",
  "access_expires_at": "2026-10-30T08:24:42.156038017Z",
  "refresh_token": "73Cxdjymi6dhHjQr5iD3cSvRo7gzL3hbB6fSF8lQX4o",
  "refresh_expires_at": "2026-10-30T20:09:42.155594584Z",
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
  "command_id": "d6c4ac41-c2b8-43a8-af73-4f5df239f8e3",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:09:42.650595Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "d6c4ac41-c2b8-43a8-af73-4f5df239f8e3",
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
  "changed_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:09:42.650595Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48766136362",
  "device_ref": "sandbox-10229"
}
```

```json
{
  "challenge_id": "eb90a154-d24c-4579-bc84-f8d88e9fe447",
  "expires_at": "2026-10-30T08:14:43.098330159Z",
  "resend_available_at": "2026-10-30T08:09:44.098330159Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48766136362` → **200**

```json
{
  "phone": "+48766136362",
  "audience": "CLIENT",
  "code": "056205",
  "sent_at": "2026-10-30T08:09:43.101071786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb90a154-d24c-4579-bc84-f8d88e9fe447",
  "code": "056205",
  "device_ref": "sandbox-10229"
}
```

```json
{
  "session_id": "e0a06dc1-d621-4b82-9ebc-78a4bf756e4e",
  "subject": {
    "type": "CLIENT",
    "id": "65ce62ba-d67e-4fef-80c2-630c4aa6cad5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWNlNjJiYS1kNjdlLTRmZWYtODBjMi02MzBjNGFhNmNhZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NjgzLCJpYXQiOjE3OTMzNDc3ODMsImp0aSI6ImU2NmI3MWM2LTk4ZWQtNDVkMC1hOWFkLTI3NjI2YzE2NWNjZiIsInNpZCI6ImUwYTA2ZGMxLWQ2MjEtNGI4Mi05ZWJjLTc4YTRiZjc1NmU0ZSJ9.0a3UWIG1mrdK2CvBf6XEzsgY_Xdtb_JEHOeI4FF0Mko",
  "access_expires_at": "2026-10-30T08:24:43.344311607Z",
  "refresh_token": "5OmiP03470GJ4gNVucS6krrr8tIikFaqabam3Wc4Pq4",
  "refresh_expires_at": "2026-11-29T08:09:43.343902678Z",
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
  "correlation_id": "c3452718-a6d4-47b8-971f-29b3efddb3c4"
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
  "device_ref": "sandbox-5244"
}
```

```json
{
  "challenge_id": "9b2327af-1a8d-4bd3-9baa-9a8a33350712",
  "expires_at": "2026-10-30T08:14:44.006885084Z",
  "resend_available_at": "2026-10-30T08:09:45.006885084Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "360638",
  "sent_at": "2026-10-30T08:09:44.009380056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b2327af-1a8d-4bd3-9baa-9a8a33350712",
  "code": "360638",
  "device_ref": "sandbox-5244"
}
```

```json
{
  "session_id": "b6deb9e7-ab9e-4f27-b97b-cc1298328aed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODY4NCwiaWF0IjoxNzkzMzQ3Nzg0LCJqdGkiOiJmNjE2MzkzYi05ZDljLTRlMWQtODEzOC00ZjcyNGUzYTY1NjYiLCJzaWQiOiJiNmRlYjllNy1hYjllLTRmMjctYjk3Yi1jYzEyOTgzMjhhZWQifQ.se5gcpYf7O_Tv6W14qq85c6tvVlBYewcq5cY2A1MoNM",
  "access_expires_at": "2026-10-30T08:24:44.243559523Z",
  "refresh_token": "-ZljKVEUlRSNzeuTCsPb6LqgTPqPcwK9NATYO1SMOpE",
  "refresh_expires_at": "2026-11-29T08:09:44.243169799Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "703b7b82-0bbf-42d9-8cdd-76c467320f33",
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
  "last_heartbeat_at": "2026-10-30T08:09:16.184757Z",
  "last_location_at": "2026-10-30T08:09:16.184757Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/703b7b82-0bbf-42d9-8cdd-76c467320f33/handover` → **200**

```json
{
  "command_id": "922c431c-d143-459c-aa42-f2f23a0ff7ee",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "703b7b82-0bbf-42d9-8cdd-76c467320f33",
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
  "last_heartbeat_at": "2026-10-30T08:09:16.184757Z",
  "last_location_at": "2026-10-30T08:09:16.184757Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/703b7b82-0bbf-42d9-8cdd-76c467320f33/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:44Z",
    "sequence": 1793347784906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "703b7b82-0bbf-42d9-8cdd-76c467320f33",
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
  "last_heartbeat_at": "2026-10-30T08:09:44.921223Z",
  "last_location_at": "2026-10-30T08:09:44.921223Z",
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
  "session_id": "703b7b82-0bbf-42d9-8cdd-76c467320f33",
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
  "last_heartbeat_at": "2026-10-30T08:09:44.921223Z",
  "last_location_at": "2026-10-30T08:09:44.921223Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/703b7b82-0bbf-42d9-8cdd-76c467320f33/close` → **200**

```json
{
  "command_id": "a676b74f-97ed-4c6d-b860-998c451220ce",
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
  "correlation_id": "37f10eae-27a3-41a9-a495-c43afcf68977"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679064569",
  "device_ref": "sandbox-29068"
}
```

```json
{
  "challenge_id": "ddf911aa-701d-432a-9e66-c8f3fc2d4fe4",
  "expires_at": "2026-10-30T08:14:46.019227677Z",
  "resend_available_at": "2026-10-30T08:09:47.019227677Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679064569` → **200**

```json
{
  "phone": "+380679064569",
  "audience": "CLIENT",
  "code": "022779",
  "sent_at": "2026-10-30T08:09:46.021313909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddf911aa-701d-432a-9e66-c8f3fc2d4fe4",
  "code": "022779",
  "device_ref": "sandbox-29068"
}
```

```json
{
  "session_id": "b517569a-fe7f-47b6-aa6c-12fdb2acf766",
  "subject": {
    "type": "CLIENT",
    "id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODAzMmY3Yi0xMzZmLTQ1YmEtYTNmZS1lYzI2ZmNhYjU0ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4Njg2LCJpYXQiOjE3OTMzNDc3ODYsImp0aSI6IjdlMTNlMGIxLTc5NTktNGUxNi1hNWE2LTFiMjlhMTM2OGU4MSIsInNpZCI6ImI1MTc1NjlhLWZlN2YtNDdiNi1hYTZjLTEyZmRiMmFjZjc2NiJ9.yk0MaBmwEZTGF3YSgJEIu3LJMlbn1jojNL1V-KJwn1Q",
  "access_expires_at": "2026-10-30T08:24:46.247073702Z",
  "refresh_token": "erMQWJauyuT7XmHrP6z_I4p20G1Pkalxy1B7iF-4hy8",
  "refresh_expires_at": "2026-11-29T08:09:46.246590844Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "824f0262-3628-4882-b051-c98b4907b844",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "52cab877-f49e-4dce-9e36-3f13ac8f5375",
  "upload_path": "/api/rider/v1/uploads/52cab877-f49e-4dce-9e36-3f13ac8f5375",
  "expires_at": "2026-10-30T08:24:46.467277482Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/52cab877-f49e-4dce-9e36-3f13ac8f5375` → **200**

```json
{
  "file_id": "52cab877-f49e-4dce-9e36-3f13ac8f5375",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "6b734359-b001-4ab1-b7d4-6ad6d88218ca",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "52cab877-f49e-4dce-9e36-3f13ac8f5375"
  ]
}
```

```json
{
  "id": "6611ecad-4eb9-4bdf-b638-fab7778d611c",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:09:46.733931Z",
  "updated_at": "2026-10-30T08:09:46.733931Z",
  "respond_by": "2026-10-30T12:09:46.733931Z",
  "messages": [
    {
      "id": "2899d1c5-5e7a-47c1-a263-6632198068a2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:09:46.735015Z",
      "attachments": [
        {
          "file_id": "52cab877-f49e-4dce-9e36-3f13ac8f5375",
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
  "session_id": "e5bb8e1d-fd39-4289-8774-e34594ae766d",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2ODcsImlhdCI6MTc5MzM0Nzc4NywianRpIjoiN2U4NjQxZjUtZTIyYy00OTAyLWIzMmYtOTE3MGY4MzRkNTVlIiwic2lkIjoiZTViYjhlMWQtZmQzOS00Mjg5LTg3NzQtZTM0NTk0YWU3NjZkIn0.yXK6l20ssU_gPEM1uzB9CPyexer6vOmXCMUNqhckS6Y",
  "access_expires_at": "2026-10-30T08:24:47.20483447Z",
  "refresh_token": "dcECea_gWk7OcGGqh-CZ8FhKLQD6LSqBUkTgHJ8Y1Ms",
  "refresh_expires_at": "2026-10-30T20:09:47.204410747Z",
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
  "session_id": "6e61e22c-bacb-495d-97b7-86ded3db541e",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2ODcsImlhdCI6MTc5MzM0Nzc4NywianRpIjoiMDY3NzU0N2YtNzgyYS00Y2JhLWExY2EtZWJmODkxOWNmYmVhIiwic2lkIjoiNmU2MWUyMmMtYmFjYi00OTVkLTk3YjctODZkZWQzZGI1NDFlIn0.VpcElqVuTNZ0SR8I67TI5nS3K7PI-x9Ni7Q_kPd1fnA",
  "access_expires_at": "2026-10-30T08:24:47.631258353Z",
  "refresh_token": "H_YeabfYF3OUrtsKhxirolua-BMaHYjGtMaaFpFPwwo",
  "refresh_expires_at": "2026-10-30T20:09:47.630776639Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/6611ecad-4eb9-4bdf-b638-fab7778d611c/attachments/52cab877-f49e-4dce-9e36-3f13ac8f5375` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "e0c6a959-1e0c-46ac-8225-04e41afcf701",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6d427558-0127-4b5d-8b6c-fee0b90115db",
  "upload_path": "/api/operator/v1/uploads/6d427558-0127-4b5d-8b6c-fee0b90115db",
  "expires_at": "2026-10-30T08:24:47.847449505Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6d427558-0127-4b5d-8b6c-fee0b90115db` → **200**

```json
{
  "file_id": "6d427558-0127-4b5d-8b6c-fee0b90115db",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/6611ecad-4eb9-4bdf-b638-fab7778d611c` → **200**

```json
{
  "id": "6611ecad-4eb9-4bdf-b638-fab7778d611c",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:09:46.733931Z",
  "updated_at": "2026-10-30T08:09:46.733931Z",
  "respond_by": "2026-10-30T12:09:46.733931Z",
  "messages": [
    {
      "id": "2899d1c5-5e7a-47c1-a263-6632198068a2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:09:46.735015Z",
      "attachments": [
        {
          "file_id": "52cab877-f49e-4dce-9e36-3f13ac8f5375",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/6611ecad-4eb9-4bdf-b638-fab7778d611c/comments` → **200**

```json
{
  "command_id": "67c474fa-4d35-4118-8490-3d16f09f4000",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6d427558-0127-4b5d-8b6c-fee0b90115db"
  ]
}
```

```json
{
  "id": "6611ecad-4eb9-4bdf-b638-fab7778d611c",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:09:46.733931Z",
  "updated_at": "2026-10-30T08:09:48.289427Z",
  "respond_by": "2026-10-30T12:09:46.733931Z",
  "messages": [
    {
      "id": "2899d1c5-5e7a-47c1-a263-6632198068a2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:09:46.735015Z",
      "attachments": [
        {
          "file_id": "52cab877-f49e-4dce-9e36-3f13ac8f5375",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "90c528c6-8b7f-4e26-bf2e-fcf6db5f6939",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:09:48.288994Z",
      "attachments": [
        {
          "file_id": "6d427558-0127-4b5d-8b6c-fee0b90115db",
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

`GET /api/rider/v1/support/cases/6611ecad-4eb9-4bdf-b638-fab7778d611c` → **200**

```json
{
  "id": "6611ecad-4eb9-4bdf-b638-fab7778d611c",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:09:46.733931Z",
  "updated_at": "2026-10-30T08:09:48.289427Z",
  "respond_by": "2026-10-30T12:09:46.733931Z",
  "messages": [
    {
      "id": "2899d1c5-5e7a-47c1-a263-6632198068a2",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "78032f7b-136f-45ba-a3fe-ec26fcab54fc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:09:46.735015Z",
      "attachments": [
        {
          "file_id": "52cab877-f49e-4dce-9e36-3f13ac8f5375",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "90c528c6-8b7f-4e26-bf2e-fcf6db5f6939",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:09:48.288994Z",
      "attachments": [
        {
          "file_id": "6d427558-0127-4b5d-8b6c-fee0b90115db",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/6611ecad-4eb9-4bdf-b638-fab7778d611c/attachments/6d427558-0127-4b5d-8b6c-fee0b90115db` → **200**

Done: support case 6611ecad-4eb9-4bdf-b638-fab7778d611c, rider attachment 52cab877-f49e-4dce-9e36-3f13ac8f5375, operator attachment 6d427558-0127-4b5d-8b6c-fee0b90115db.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737717432",
  "device_ref": "sandbox-10779"
}
```

```json
{
  "challenge_id": "548ad50d-c65b-49d1-85e9-18c0cc2324aa",
  "expires_at": "2026-10-30T08:14:48.733120826Z",
  "resend_available_at": "2026-10-30T08:09:49.733120826Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737717432` → **200**

```json
{
  "phone": "+380737717432",
  "audience": "CLIENT",
  "code": "527512",
  "sent_at": "2026-10-30T08:09:48.735523743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "548ad50d-c65b-49d1-85e9-18c0cc2324aa",
  "code": "527512",
  "device_ref": "sandbox-10779"
}
```

```json
{
  "session_id": "47e85780-e19a-47f7-9010-ddbff4876413",
  "subject": {
    "type": "CLIENT",
    "id": "82ecebe6-b284-4986-a38e-5c69e5aa085c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmVjZWJlNi1iMjg0LTQ5ODYtYTM4ZS01YzY5ZTVhYTA4NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4Njg4LCJpYXQiOjE3OTMzNDc3ODgsImp0aSI6IjUyZDE1MjczLTVhMjAtNGFhZi04MDZlLWUwNzc2OTBhZjgwNCIsInNpZCI6IjQ3ZTg1NzgwLWUxOWEtNDdmNy05MDEwLWRkYmZmNDg3NjQxMyJ9.D7OBzTsBUhyBPBGvdG-plh4oaIEVpVI_kzRvOl6DQ8Q",
  "access_expires_at": "2026-10-30T08:24:48.961546226Z",
  "refresh_token": "DXi7ijtwmU42M3705CCje6j6WMusVFd1BWw52E3rxTk",
  "refresh_expires_at": "2026-11-29T08:09:48.961082292Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "81c79c0a-9b17-484c-8e83-2ab1f4e415a0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "54ca0954-9cbc-4bdf-9625-9a031be16c28",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-54ca0954-9cbc-4bdf-9625-9a031be16c28",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5e3af92924f1dfadb0865267486c560d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=54ca0954-9cbc-4bdf-9625-9a031be16c28",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737717432"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=54ca0954-9cbc-4bdf-9625-9a031be16c28",
  "expires_at": "2026-10-30T08:39:49.16479Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/54ca0954-9cbc-4bdf-9625-9a031be16c28` → **200**

```json
{
  "id": "54ca0954-9cbc-4bdf-9625-9a031be16c28",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:39:49.16479Z",
  "card": {
    "id": "c57b4f34-0528-409c-8735-53c0dc44443d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6562",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:09:49.369617Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d221788-26de-4ef7-97d7-1f8980edd4ff",
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
  "id": "22696975-0d8e-40b3-8fa8-f133677ed60f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:14:49.598518Z",
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
  "command_id": "136ca124-978f-4631-abac-428df88fbe54",
  "quote_id": "22696975-0d8e-40b3-8fa8-f133677ed60f",
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
  "id": "16b16b54-3383-49da-9997-11a7bc625960",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "82ecebe6-b284-4986-a38e-5c69e5aa085c",
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
  "created_at": "2026-10-30T08:09:49.828434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960` → **200**

```json
{
  "id": "16b16b54-3383-49da-9997-11a7bc625960",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "82ecebe6-b284-4986-a38e-5c69e5aa085c",
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
  "created_at": "2026-10-30T08:09:49.828434Z",
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

`GET /api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960` → **200**

```json
{
  "id": "16b16b54-3383-49da-9997-11a7bc625960",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "82ecebe6-b284-4986-a38e-5c69e5aa085c",
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
  "created_at": "2026-10-30T08:09:49.828434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960/switch-to-cash` → **200**

```json
{
  "command_id": "31d5ea73-77d7-46bc-b135-34306bf0b429",
  "expected_version": 3
}
```

```json
{
  "id": "16b16b54-3383-49da-9997-11a7bc625960",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "82ecebe6-b284-4986-a38e-5c69e5aa085c",
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
  "created_at": "2026-10-30T08:09:49.828434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960/switch-to-cash` → **409**

```json
{
  "command_id": "001a2db4-66bc-4fd3-87bf-076f3986bbec",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "22be35f8-3dd1-4a85-9861-9779991a1b78"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960` → **200**

```json
{
  "id": "16b16b54-3383-49da-9997-11a7bc625960",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "82ecebe6-b284-4986-a38e-5c69e5aa085c",
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
  "created_at": "2026-10-30T08:09:49.828434Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/16b16b54-3383-49da-9997-11a7bc625960/cancel` → **200**

```json
{
  "command_id": "cd88744c-abcd-4ce5-b91d-ec13496f5bee",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "16b16b54-3383-49da-9997-11a7bc625960",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "82ecebe6-b284-4986-a38e-5c69e5aa085c",
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
  "created_at": "2026-10-30T08:09:49.828434Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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
  "session_id": "4ffb6d1b-55d4-4d57-a686-e74e3a1be859",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2OTEsImlhdCI6MTc5MzM0Nzc5MSwianRpIjoiNmRhN2IxZTgtMTAzOS00ZTllLWIxMDAtOGU3ODVkOTczNmVhIiwic2lkIjoiNGZmYjZkMWItNTVkNC00ZDU3LWE2ODYtZTc0ZTNhMWJlODU5In0.emXTpUh37bIrEjrtWEjH7PyuqbuEtebzmH_XOGRuRI0",
  "access_expires_at": "2026-10-30T08:24:51.590019551Z",
  "refresh_token": "kQbpHQODgoPXtxR-LUVBR0CjY11eekTZLaYOTdBJ3fA",
  "refresh_expires_at": "2026-10-30T20:09:51.589448948Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5780"
}
```

```json
{
  "challenge_id": "e8b95339-dc54-45ad-be9d-efc1909c2016",
  "expires_at": "2026-10-30T08:14:51.799923795Z",
  "resend_available_at": "2026-10-30T08:09:52.799923795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "503600",
  "sent_at": "2026-10-30T08:09:51.803140289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8b95339-dc54-45ad-be9d-efc1909c2016",
  "code": "503600",
  "device_ref": "sandbox-5780"
}
```

```json
{
  "session_id": "d8cc1611-f970-43d6-90b7-38cd56bad83b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODY5MiwiaWF0IjoxNzkzMzQ3NzkyLCJqdGkiOiJhMGNhNDU2NC1lMjYyLTRkZmMtYjkzMy1kYmM1NjYyY2ZlZTgiLCJzaWQiOiJkOGNjMTYxMS1mOTcwLTQzZDYtOTBiNy0zOGNkNTZiYWQ4M2IifQ.BhQ6A373QjjLO9pPh6cMyBdbFozFD_4upS7sX-KgmLI",
  "access_expires_at": "2026-10-30T08:24:52.033441214Z",
  "refresh_token": "I-X3RVoeaWXaqfXLahYwmvm0wKBI_vF1JkSXqZh_k_8",
  "refresh_expires_at": "2026-11-29T08:09:52.032919052Z",
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
      "actor_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:09:40.275677Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:09:41.321555Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "4fbe48f4-b090-4f56-8ec3-b51b491ec9ca",
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
  "device_ref": "sandbox-24675"
}
```

```json
{
  "challenge_id": "6492f59d-24c1-4164-8bb0-0ac2fa4bd817",
  "expires_at": "2026-10-30T08:14:52.910269668Z",
  "resend_available_at": "2026-10-30T08:09:53.910269668Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "427268",
  "sent_at": "2026-10-30T08:09:52.912903807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6492f59d-24c1-4164-8bb0-0ac2fa4bd817",
  "code": "427268",
  "device_ref": "sandbox-24675"
}
```

```json
{
  "session_id": "4a05f72f-58b2-42db-b681-8e392638d6b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODY5MywiaWF0IjoxNzkzMzQ3NzkzLCJqdGkiOiI1MGNlNzEzNy0yN2ViLTQ4ZWUtOTkzYi02ZWQ3ZjRmZDU0ZjEiLCJzaWQiOiI0YTA1ZjcyZi01OGIyLTQyZGItYjY4MS04ZTM5MjYzOGQ2YjkifQ.qFxAqa21octp7xC86ZoLwcGyL8TP5aNcSwQFDCw9m1s",
  "access_expires_at": "2026-10-30T08:24:53.13227227Z",
  "refresh_token": "Vb55vfHUxE7s-MRjPUUKn7IAXbvQKDejRiJFybn5cv4",
  "refresh_expires_at": "2026-11-29T08:09:53.131811793Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:21.694196Z",
  "last_location_at": "2026-10-30T08:09:21.694196Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/75df82f6-2577-48bf-b3d7-e94bdda2e84a/handover` → **200**

```json
{
  "command_id": "82b8d5e9-fa1f-426b-907f-796fedbd8811",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:21.694196Z",
  "last_location_at": "2026-10-30T08:09:21.694196Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/75df82f6-2577-48bf-b3d7-e94bdda2e84a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:53Z",
    "sequence": 1793347793735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:53.751106Z",
  "last_location_at": "2026-10-30T08:09:53.751106Z",
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
  "command_id": "aa927ce2-95db-40b3-80fe-29947fc26741",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:54Z",
    "sequence": 1793347794143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0e53e106-ba1c-43de-8d66-7c22c583c791",
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
  "last_heartbeat_at": "2026-10-30T08:09:54.158472Z",
  "last_location_at": "2026-10-30T08:09:54.158472Z",
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
  "session_id": "a22fe5e6-0e5f-456e-a16a-fb7c6cec2c2a",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg2OTQsImlhdCI6MTc5MzM0Nzc5NCwianRpIjoiZGVjZjRiMTctOTk3Zi00MzM2LTg1NzQtZDZhMTNjZGJhY2JhIiwic2lkIjoiYTIyZmU1ZTYtMGU1Zi00NTZlLWExNmEtZmI3YzZjZWMyYzJhIn0.yYdQQ1f1isOBMhn-0hLeyqaF8dayDojSoWGAvmwiN_s",
  "access_expires_at": "2026-10-30T08:24:54.587860597Z",
  "refresh_token": "-BXjVZpQCMgB52aTtnd8arxeqd--ba6H28LN0otpEX8",
  "refresh_expires_at": "2026-10-30T20:09:54.587282406Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "85de7ebe-302a-4ba0-b3da-c4514f548ef9",
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
  "id": "c436a8e8-5f23-4ccf-b72d-58f87a8ab6ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:14:54.794702Z",
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
  "command_id": "063b491d-029b-4dae-a43d-30aa13a8f305",
  "quote_id": "c436a8e8-5f23-4ccf-b72d-58f87a8ab6ab",
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
  "id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
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
  "created_at": "2026-10-30T08:09:54.999717Z",
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
    "id": "cd37054e-8b21-4a09-a984-13b391107184",
    "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
    "expires_at": "2026-10-30T08:10:10.003299Z",
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

`POST /api/driver/v1/offers/cd37054e-8b21-4a09-a984-13b391107184/accept` → **200**

```json
{
  "command_id": "8f03fa80-c2f6-4499-9b3f-a02a7753b356"
}
```

```json
{
  "id": "8eb6b182-84a2-452f-beca-eebe7daa035e",
  "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5554331a-ad61-4321-a117-2b050725d1c0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5554331a-ad61-4321-a117-2b050725d1c0",
  "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
  "assignment_id": "8eb6b182-84a2-452f-beca-eebe7daa035e",
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

`POST /api/driver/v1/work-sessions/0e53e106-ba1c-43de-8d66-7c22c583c791/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:09:56Z",
    "sequence": 1793347796553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0e53e106-ba1c-43de-8d66-7c22c583c791",
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
  "last_heartbeat_at": "2026-10-30T08:09:56.020186Z",
  "last_location_at": "2026-10-30T08:09:56.020186Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5554331a-ad61-4321-a117-2b050725d1c0/arrive` → **200**

```json
{
  "command_id": "fd4c75b3-f83f-46c1-b8fe-8e673c4ba389",
  "expected_version": 0
}
```

```json
{
  "id": "5554331a-ad61-4321-a117-2b050725d1c0",
  "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
  "assignment_id": "8eb6b182-84a2-452f-beca-eebe7daa035e",
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
  "arrived_at": "2026-10-30T08:09:56.224178Z",
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

`POST /api/driver/v1/trips/5554331a-ad61-4321-a117-2b050725d1c0/start` → **200**

```json
{
  "command_id": "93261865-b76d-427d-8960-5432bf706b43",
  "expected_version": 1
}
```

```json
{
  "id": "5554331a-ad61-4321-a117-2b050725d1c0",
  "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
  "assignment_id": "8eb6b182-84a2-452f-beca-eebe7daa035e",
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
  "arrived_at": "2026-10-30T08:09:56.224178Z",
  "started_at": "2026-10-30T08:09:56.440022Z",
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

`POST /api/driver/v1/trips/5554331a-ad61-4321-a117-2b050725d1c0/complete` → **200**

```json
{
  "command_id": "4fcf9461-ca3c-4875-ade9-d0ce6c4b6ff2",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:09:56Z",
  "cash_received": true
}
```

```json
{
  "id": "5554331a-ad61-4321-a117-2b050725d1c0",
  "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
  "assignment_id": "8eb6b182-84a2-452f-beca-eebe7daa035e",
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
  "arrived_at": "2026-10-30T08:09:56.224178Z",
  "started_at": "2026-10-30T08:09:56.440022Z",
  "completed_at": "2026-10-30T08:09:56.659312Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/46aa2c77-7875-478f-add4-eecf86a89f8f` → **200**

```json
{
  "id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
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
    "id": "8eb6b182-84a2-452f-beca-eebe7daa035e",
    "order_id": "46aa2c77-7875-478f-add4-eecf86a89f8f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5554331a-ad61-4321-a117-2b050725d1c0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:09:54.999717Z",
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
  "session_id": "75df82f6-2577-48bf-b3d7-e94bdda2e84a",
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
  "last_heartbeat_at": "2026-10-30T08:09:53.751106Z",
  "last_location_at": "2026-10-30T08:09:53.751106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/75df82f6-2577-48bf-b3d7-e94bdda2e84a/close` → **200**

```json
{
  "command_id": "19f01313-4782-4fee-92ab-36b4bff713f0",
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
  "session_id": "0e53e106-ba1c-43de-8d66-7c22c583c791",
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
  "last_heartbeat_at": "2026-10-30T08:09:56.020186Z",
  "last_location_at": "2026-10-30T08:09:56.020186Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0e53e106-ba1c-43de-8d66-7c22c583c791/close` → **200**

```json
{
  "command_id": "deff0767-0176-4272-ba50-e80bfed3a566",
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

Done: terminal order 46aa2c77-7875-478f-add4-eecf86a89f8f by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16544"
}
```

```json
{
  "challenge_id": "ddde8921-da7e-47ec-b22b-7bba96ed3829",
  "expires_at": "2026-10-30T08:15:01.107749131Z",
  "resend_available_at": "2026-10-30T08:10:02.107749131Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "490767",
  "sent_at": "2026-10-30T08:10:01.110116322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddde8921-da7e-47ec-b22b-7bba96ed3829",
  "code": "490767",
  "device_ref": "sandbox-16544"
}
```

```json
{
  "session_id": "11580a1c-721a-4006-931b-be0943064e7f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODcwMSwiaWF0IjoxNzkzMzQ3ODAxLCJqdGkiOiIxMzU0MWVhZi0yYjMzLTQwNjUtODNlZi02MjQ2YzExODZlODgiLCJzaWQiOiIxMTU4MGExYy03MjFhLTQwMDYtOTMxYi1iZTA5NDMwNjRlN2YifQ.Dx2ygMVino_k-501p7806_gkXnkjO3127lwEDWcKM7k",
  "access_expires_at": "2026-10-30T08:25:01.328541492Z",
  "refresh_token": "drFoPPPY-C2ICB0jBpk-SqzK1gu2NmChzuL4Ycx8laM",
  "refresh_expires_at": "2026-11-29T08:10:01.32805999Z",
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
  "device_ref": "sandbox-27889"
}
```

```json
{
  "challenge_id": "c81f586f-1e7f-41e9-bf3a-6642e3f6bfd7",
  "expires_at": "2026-10-30T08:15:01.717280871Z",
  "resend_available_at": "2026-10-30T08:10:02.717280871Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "987883",
  "sent_at": "2026-10-30T08:10:01.719894264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c81f586f-1e7f-41e9-bf3a-6642e3f6bfd7",
  "code": "987883",
  "device_ref": "sandbox-27889"
}
```

```json
{
  "session_id": "06394221-a5be-4b6e-a5bc-c6130cd2c65a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODcwMSwiaWF0IjoxNzkzMzQ3ODAxLCJqdGkiOiI2NWJmNDUwMy0zM2VmLTQxYzAtYmNhMC04YTA0Mzc5YzZkZDYiLCJzaWQiOiIwNjM5NDIyMS1hNWJlLTRiNmUtYTViYy1jNjEzMGNkMmM2NWEifQ.SsKPlBSiHYVXAJk8rmm_H46mricDs66LLdcvcuOFHaw",
  "access_expires_at": "2026-10-30T08:25:01.941583163Z",
  "refresh_token": "6b8K2pmmgaKDntTFygig-xkVg3I9DWWAb7eInHmcbkU",
  "refresh_expires_at": "2026-11-29T08:10:01.941044462Z",
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
  "device_ref": "sandbox-19272"
}
```

```json
{
  "challenge_id": "f55abe99-0416-467f-8c0e-c493abb1b82c",
  "expires_at": "2026-10-30T08:15:02.338641026Z",
  "resend_available_at": "2026-10-30T08:10:03.338641026Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "451467",
  "sent_at": "2026-10-30T08:10:02.341489362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f55abe99-0416-467f-8c0e-c493abb1b82c",
  "code": "451467",
  "device_ref": "sandbox-19272"
}
```

```json
{
  "session_id": "e6159faf-c474-422d-b6d9-ddd29fa244bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0ODcwMiwiaWF0IjoxNzkzMzQ3ODAyLCJqdGkiOiI3ZWQzYTUzYS0yOTM1LTRkY2QtYTgwYS0xYzZjNzUwNThhMDEiLCJzaWQiOiJlNjE1OWZhZi1jNDc0LTQyMmQtYjZkOS1kZGQyOWZhMjQ0YmIifQ.tuoCNwZrxhPQJyXvbxSciEUDWgJYDrPz9hi3qVB9msQ",
  "access_expires_at": "2026-10-30T08:25:02.558276977Z",
  "refresh_token": "TjgXblmpAxR4of1xQqWgVOstPJ8VklnEFQFfIEkgkow",
  "refresh_expires_at": "2026-11-29T08:10:02.557922861Z",
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
  "phone": "+380695394300",
  "device_ref": "sandbox-15881"
}
```

```json
{
  "challenge_id": "9d4720a2-d7d2-42b6-b600-cc1ed7cdb6c4",
  "expires_at": "2026-10-30T08:15:02.952488289Z",
  "resend_available_at": "2026-10-30T08:10:03.952488289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380695394300` → **200**

```json
{
  "phone": "+380695394300",
  "audience": "CLIENT",
  "code": "595874",
  "sent_at": "2026-10-30T08:10:02.954796509Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d4720a2-d7d2-42b6-b600-cc1ed7cdb6c4",
  "code": "595874",
  "device_ref": "sandbox-15881"
}
```

```json
{
  "session_id": "c0c138dc-ec15-43c5-98ce-282ce8140206",
  "subject": {
    "type": "CLIENT",
    "id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDcyNWJjNi0zNmNmLTRiMTUtOGFlZS02Y2JjMDJiODAwZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ4NzAzLCJpYXQiOjE3OTMzNDc4MDMsImp0aSI6IjQ3MDY2YjM4LWJiYTMtNGRkNi05ZmI1LWRmYzBlMjY5NWIwZSIsInNpZCI6ImMwYzEzOGRjLWVjMTUtNDNjNS05OGNlLTI4MmNlODE0MDIwNiJ9.5f5HfzEsuJfoFh2Cdbp9jyR-mXZpcAqV7iurHodmQv8",
  "access_expires_at": "2026-10-30T08:25:03.202416194Z",
  "refresh_token": "Qy5Ps72UrePjhdzOduU5yRsY2P3C5LZT2CWKjhQcnFU",
  "refresh_expires_at": "2026-11-29T08:10:03.201974474Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83e7acd3-fbba-4a02-9623-d5d33eea7ef0",
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
  "id": "aa97e06c-c7d4-48cd-a87d-b0459fc0326d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:15:03.423946Z",
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
  "command_id": "0b830911-52ce-4271-98e1-e91360f8a2f0",
  "quote_id": "aa97e06c-c7d4-48cd-a87d-b0459fc0326d",
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
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:10:03.646779Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:10:03.646779Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 8.142217112
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 9.667713291
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.158626611
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

`GET /api/rider/v1/orders/4bf6ee71-70bd-4dfd-83fe-43a778fbe58d` → **200**

```json
{
  "id": "4bf6ee71-70bd-4dfd-83fe-43a778fbe58d",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad725bc6-36cf-4b15-8aee-6cbc02b800ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:10:03.646779Z",
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
  "session_id": "1622fde7-1789-49c5-b572-7d7de86c73cc",
  "subject": {
    "type": "STAFF",
    "id": "8376c519-cbee-4321-85f7-c1f8d0d41429"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Mzc2YzUxOS1jYmVlLTQzMjEtODVmNy1jMWY4ZDBkNDE0MjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDg4ODcsImlhdCI6MTc5MzM0Nzk4NywianRpIjoiZWIwZmFhMzctNDkyZS00OTMxLTg0ZjMtZWEzYTM1YWYwNGIzIiwic2lkIjoiMTYyMmZkZTctMTc4OS00OWM1LWI1NzItN2Q3ZGU4NmM3M2NjIn0.FEOCS2GZYRbQWALPbQXcRFCO4hVlvZBFNATSdQuANRA",
  "access_expires_at": "2026-10-30T08:28:07.339846338Z",
  "refresh_token": "WjVqr7Uk6EEwAQzUMA4w08dKqlzDebpCIFdH2TbpxIo",
  "refresh_expires_at": "2026-10-30T20:13:07.339083433Z",
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
  "id": "e442e9e5-5e96-43a2-88b7-14ca4c67da38",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.553012Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.553068Z",
  "updated_at": "2026-10-30T08:13:07.567556Z",
  "finished_at": "2026-10-30T08:13:07.567556Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/e442e9e5-5e96-43a2-88b7-14ca4c67da38` → **200**

```json
{
  "run": {
    "id": "e442e9e5-5e96-43a2-88b7-14ca4c67da38",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:13:07.553012Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:13:07.553068Z",
    "updated_at": "2026-10-30T08:13:07.567556Z",
    "finished_at": "2026-10-30T08:13:07.567556Z",
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
  "id": "e442e9e5-5e96-43a2-88b7-14ca4c67da38",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.553012Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.553068Z",
  "updated_at": "2026-10-30T08:13:07.567556Z",
  "finished_at": "2026-10-30T08:13:07.567556Z",
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
  "id": "e442e9e5-5e96-43a2-88b7-14ca4c67da38",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.553012Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.553068Z",
  "updated_at": "2026-10-30T08:13:07.567556Z",
  "finished_at": "2026-10-30T08:13:07.567556Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/f94ff507-240a-46ec-99e4-55e1ef4debbe` → **204**

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
  "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.876281Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.876315Z",
  "updated_at": "2026-10-30T08:13:07.88311Z",
  "finished_at": "2026-10-30T08:13:07.88311Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/ac66e05d-9f04-4308-b6c4-be7e1bbab773` → **200**

```json
{
  "run": {
    "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:13:07.876281Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:13:07.876315Z",
    "updated_at": "2026-10-30T08:13:07.88311Z",
    "finished_at": "2026-10-30T08:13:07.88311Z",
    "version": 1
  },
  "items": [
    {
      "id": "15fd9696-a054-41c0-bd99-ea094d45aa2c",
      "run_id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5cf7c7b35087056c10cb91df5ab7c86b9dbcd8ee19f3664e55710f38beb6ecda",
      "reference_display": "sandbox-reconciliation-f94ff507-240a-46ec-99e4-55e1ef4debbe",
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
      "provider_at": "2026-10-30T08:13:07Z",
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
  "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.876281Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.876315Z",
  "updated_at": "2026-10-30T08:13:07.88311Z",
  "finished_at": "2026-10-30T08:13:07.88311Z",
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
  "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.876281Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.876315Z",
  "updated_at": "2026-10-30T08:13:07.88311Z",
  "finished_at": "2026-10-30T08:13:07.88311Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/15fd9696-a054-41c0-bd99-ea094d45aa2c/resolve` → **200**

```json
{
  "command_id": "cdcba743-6670-4ac9-a888-5075aff25315",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "15fd9696-a054-41c0-bd99-ea094d45aa2c",
  "run_id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5cf7c7b35087056c10cb91df5ab7c86b9dbcd8ee19f3664e55710f38beb6ecda",
  "reference_display": "sandbox-reconciliation-f94ff507-240a-46ec-99e4-55e1ef4debbe",
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
  "provider_at": "2026-10-30T08:13:07Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "resolved_at": "2026-10-30T08:13:08.192007Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/15fd9696-a054-41c0-bd99-ea094d45aa2c/resolve` → **200**

```json
{
  "command_id": "cdcba743-6670-4ac9-a888-5075aff25315",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "15fd9696-a054-41c0-bd99-ea094d45aa2c",
  "run_id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "5cf7c7b35087056c10cb91df5ab7c86b9dbcd8ee19f3664e55710f38beb6ecda",
  "reference_display": "sandbox-reconciliation-f94ff507-240a-46ec-99e4-55e1ef4debbe",
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
  "provider_at": "2026-10-30T08:13:07Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
  "resolved_at": "2026-10-30T08:13:08.192007Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/15fd9696-a054-41c0-bd99-ea094d45aa2c/resolve` → **409**

```json
{
  "command_id": "9d4ee854-1e26-4a6c-aff3-4ab1f3489814",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/15fd9696-a054-41c0-bd99-ea094d45aa2c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "60d1fca8-d3c9-4ca3-b091-138fcfc82a69"
}
```

`GET /api/admin/v1/payment-reconciliations/ac66e05d-9f04-4308-b6c4-be7e1bbab773` → **200**

```json
{
  "run": {
    "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:13:07.876281Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:13:07.876315Z",
    "updated_at": "2026-10-30T08:13:08.192007Z",
    "finished_at": "2026-10-30T08:13:07.88311Z",
    "version": 2
  },
  "items": [
    {
      "id": "15fd9696-a054-41c0-bd99-ea094d45aa2c",
      "run_id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "5cf7c7b35087056c10cb91df5ab7c86b9dbcd8ee19f3664e55710f38beb6ecda",
      "reference_display": "sandbox-reconciliation-f94ff507-240a-46ec-99e4-55e1ef4debbe",
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
      "provider_at": "2026-10-30T08:13:07Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "8376c519-cbee-4321-85f7-c1f8d0d41429",
      "resolved_at": "2026-10-30T08:13:08.192007Z",
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
      "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:13:07.876281Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:13:07.876315Z",
      "updated_at": "2026-10-30T08:13:08.192007Z",
      "finished_at": "2026-10-30T08:13:07.88311Z",
      "version": 2
    },
    {
      "id": "87019f4e-06da-4540-9c02-ae236de3a40b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:06:08.236013Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:06:08.236102Z",
      "updated_at": "2026-10-30T08:06:08.244263Z",
      "finished_at": "2026-10-30T08:06:08.244263Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/f94ff507-240a-46ec-99e4-55e1ef4debbe` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "ac66e05d-9f04-4308-b6c4-be7e1bbab773",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:13:07.876281Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:13:07.876315Z",
  "updated_at": "2026-10-30T08:13:08.192007Z",
  "finished_at": "2026-10-30T08:13:07.88311Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793348113406E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.7933481136E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793348113601E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793348113406E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793348113602E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
