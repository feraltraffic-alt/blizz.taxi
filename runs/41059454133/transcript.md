# Sandbox transcript (2026-10-30T12:59:47Z, ce2ce74)

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
  "correlation_id": "67c6466e-b5d4-4d24-a0af-ed7a5299a3ed"
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
  "session_id": "8e555427-f1d2-4462-b0af-a4913485f74c",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYwOTcsImlhdCI6MTc5MzM2NTE5NywianRpIjoiODcwNjk1NzItNTQ2MC00OTIxLTllMzktZTVmMjdiNjQwMWEwIiwic2lkIjoiOGU1NTU0MjctZjFkMi00NDYyLWIwYWYtYTQ5MTM0ODVmNzRjIn0._YM6C4YF1CzeQbPMNb5i6hUsms2Qaw-JiWb07KMZJgI",
  "access_expires_at": "2026-10-30T13:14:57.273052306Z",
  "refresh_token": "NzvR2_cMHCVxyo3DbnylgGoaOryYio0Ue9vU35CX954",
  "refresh_expires_at": "2026-10-31T00:59:57.271000586Z",
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
  "session_id": "9f17ddb7-fffd-447c-9717-583ee739728e",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYwOTksImlhdCI6MTc5MzM2NTE5OSwianRpIjoiMGNlMjQ3MDUtNmI2ZC00YjFiLWE4OTYtOWNjZmQ5ZGY4ZDIzIiwic2lkIjoiOWYxN2RkYjctZmZmZC00NDdjLTk3MTctNTgzZWU3Mzk3MjhlIn0.Rj3CaKtl31MxYeXRBg2CwEU8A154F3l9minr0VOsQ4I",
  "access_expires_at": "2026-10-30T13:14:59.158296151Z",
  "refresh_token": "MnrYc-talf7STgiYNHA9PynMWSqJxc7hjMQgBVDjc98",
  "refresh_expires_at": "2026-10-31T00:59:59.157324072Z",
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
  "device_ref": "sandbox-26192"
}
```

```json
{
  "challenge_id": "955ddb5d-0ccc-487d-a1d2-730c47324741",
  "expires_at": "2026-10-30T13:04:59.820256354Z",
  "resend_available_at": "2026-10-30T13:00:00.820256354Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "683453",
  "sent_at": "2026-10-30T12:59:59.833195345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "955ddb5d-0ccc-487d-a1d2-730c47324741",
  "code": "683453",
  "device_ref": "sandbox-26192"
}
```

```json
{
  "session_id": "21e83257-25b2-4b9c-b879-5fa06f97a3ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjEwMCwiaWF0IjoxNzkzMzY1MjAwLCJqdGkiOiI4MGZkZThjZC1jMDg4LTRiMzUtOTM4ZS01YWVkZDU0ODE5ODIiLCJzaWQiOiIyMWU4MzI1Ny0yNWIyLTRiOWMtYjg3OS01ZmEwNmY5N2EzZWYifQ.2ru8EisuAWDvsGUh7QWg5lz_afXv5bSr97t8oXab-k4",
  "access_expires_at": "2026-10-30T13:15:00.180389582Z",
  "refresh_token": "pcPJsUc9SRMMQQt61oaupFG34tP_k2kgBGFkvDlxmWs",
  "refresh_expires_at": "2026-11-29T13:00:00.179167816Z",
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
  "command_id": "35f83da5-82a7-44e2-b33e-4ff7d8d4d62a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:00Z",
    "sequence": 1793365200789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca43c2e3-bb5c-410b-b15e-7ed491139b0a",
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
  "last_heartbeat_at": "2026-10-30T13:00:00.937216Z",
  "last_location_at": "2026-10-30T13:00:00.937216Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632510967",
  "device_ref": "sandbox-17680"
}
```

```json
{
  "challenge_id": "a9f0642a-d84b-4418-95c1-2f2304e10276",
  "expires_at": "2026-10-30T13:05:01.227274162Z",
  "resend_available_at": "2026-10-30T13:00:02.227274162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632510967` → **200**

```json
{
  "phone": "+380632510967",
  "audience": "CLIENT",
  "code": "572193",
  "sent_at": "2026-10-30T13:00:01.232132983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9f0642a-d84b-4418-95c1-2f2304e10276",
  "code": "572193",
  "device_ref": "sandbox-17680"
}
```

```json
{
  "session_id": "30e65abd-309b-4502-8f84-905ddd505da1",
  "subject": {
    "type": "CLIENT",
    "id": "a8698295-4c7e-424f-9512-e2a3d1e6309d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODY5ODI5NS00YzdlLTQyNGYtOTUxMi1lMmEzZDFlNjMwOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTAxLCJpYXQiOjE3OTMzNjUyMDEsImp0aSI6IjYwZjUwNjMwLWQ3YWYtNGIxNi1iYjYwLTA1NDE2OWFhNGE2MiIsInNpZCI6IjMwZTY1YWJkLTMwOWItNDUwMi04Zjg0LTkwNWRkZDUwNWRhMSJ9.pV_rMfbL3t4xiOs955lN9Je6MQvgY_jQpu7Pu-t7X4I",
  "access_expires_at": "2026-10-30T13:15:01.566689816Z",
  "refresh_token": "qYc1o_2ZGVd9I7qBacyFFnaS66xi73Ih7RszFFpEdMo",
  "refresh_expires_at": "2026-11-29T13:00:01.565702784Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4b890963-8c0b-4a0d-b1de-fa7e20b147de",
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
  "id": "bb625164-e121-44ad-8c10-bd1828fd8702",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:05:01.908264Z",
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
  "command_id": "15d8ea63-a903-48ae-aff0-9dec374fac7f",
  "quote_id": "bb625164-e121-44ad-8c10-bd1828fd8702",
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
  "id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a8698295-4c7e-424f-9512-e2a3d1e6309d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:00:02.322003Z",
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
    "id": "5f1f157d-99f5-4361-b5cd-3c4c1bad7947",
    "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
    "expires_at": "2026-10-30T13:00:17.335905Z",
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

`POST /api/driver/v1/offers/5f1f157d-99f5-4361-b5cd-3c4c1bad7947/accept` → **200**

```json
{
  "command_id": "4b7d5da9-bc05-4cf9-b8d5-9aa07a1adb5e"
}
```

```json
{
  "id": "29d67651-64a8-478c-b0e6-f7c30b61b0aa",
  "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4e90aa80-77e3-4215-a0e0-ada60f960ff5",
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
  "command_id": "9c6a4177-31ce-4278-baff-972927a688b9",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:00:03.662710759Z"
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
  "id": "4e90aa80-77e3-4215-a0e0-ada60f960ff5",
  "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
  "assignment_id": "29d67651-64a8-478c-b0e6-f7c30b61b0aa",
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

`POST /api/driver/v1/work-sessions/ca43c2e3-bb5c-410b-b15e-7ed491139b0a/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:04Z",
    "sequence": 1793365204584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca43c2e3-bb5c-410b-b15e-7ed491139b0a",
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
  "last_heartbeat_at": "2026-10-30T13:00:04.611341Z",
  "last_location_at": "2026-10-30T13:00:04.611341Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4e90aa80-77e3-4215-a0e0-ada60f960ff5/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e88942be-2642-49e0-bf8f-950aff64beb3",
  "expected_version": 0
}
```

```json
{
  "id": "4e90aa80-77e3-4215-a0e0-ada60f960ff5",
  "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
  "assignment_id": "29d67651-64a8-478c-b0e6-f7c30b61b0aa",
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
  "arrived_at": "2026-10-30T13:00:04.925182Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e90aa80-77e3-4215-a0e0-ada60f960ff5/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8679f33d-3350-406b-a9a6-1fd5315a9ee9",
  "expected_version": 1
}
```

```json
{
  "id": "4e90aa80-77e3-4215-a0e0-ada60f960ff5",
  "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
  "assignment_id": "29d67651-64a8-478c-b0e6-f7c30b61b0aa",
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
  "arrived_at": "2026-10-30T13:00:04.925182Z",
  "started_at": "2026-10-30T13:00:05.245454Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4e90aa80-77e3-4215-a0e0-ada60f960ff5/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ec54d700-68d9-4ad1-877d-5f400bbe865f",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:00:05Z",
  "cash_received": true
}
```

```json
{
  "id": "4e90aa80-77e3-4215-a0e0-ada60f960ff5",
  "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
  "assignment_id": "29d67651-64a8-478c-b0e6-f7c30b61b0aa",
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
  "arrived_at": "2026-10-30T13:00:04.925182Z",
  "started_at": "2026-10-30T13:00:05.245454Z",
  "completed_at": "2026-10-30T13:00:05.582665Z",
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
  "session_id": "ca43c2e3-bb5c-410b-b15e-7ed491139b0a",
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
  "last_heartbeat_at": "2026-10-30T13:00:04.611341Z",
  "last_location_at": "2026-10-30T13:00:04.611341Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ca43c2e3-bb5c-410b-b15e-7ed491139b0a/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e10dd791-1610-44be-b887-2372f0bbd56f",
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
  "command_id": "9f5efc88-9c7c-41da-a8d8-75d9bb587d62",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:06Z",
    "sequence": 1793365206525
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
  "correlation_id": "1e9eecc7-c2b9-4537-9a88-83f4a0071d13",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "71a826a5-511b-458d-911e-a286cd786064",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:06Z",
    "sequence": 1793365206851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06240edd-d150-4ff6-bc9e-8241a68d1305",
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
  "last_heartbeat_at": "2026-10-30T13:00:06.87493Z",
  "last_location_at": "2026-10-30T13:00:06.87493Z",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:00:03.662711Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6016c247-ebe9-447e-9512-aa0e77447f66",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:00:07.488812828Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06240edd-d150-4ff6-bc9e-8241a68d1305",
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
  "last_heartbeat_at": "2026-10-30T13:00:06.87493Z",
  "last_location_at": "2026-10-30T13:00:06.87493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06240edd-d150-4ff6-bc9e-8241a68d1305/close` → **200**

```json
{
  "command_id": "2b8d4730-a75a-470e-8a8b-b07f5a88432e",
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
  "session_id": "3956e4e0-33bb-43e4-a37c-9e11fa530324",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxMDgsImlhdCI6MTc5MzM2NTIwOCwianRpIjoiNTBmNmM4MWMtODY2MS00Y2NiLTg5NGItNTQ5NzcyMTBkZGJiIiwic2lkIjoiMzk1NmU0ZTAtMzNiYi00M2U0LWEzN2MtOWUxMWZhNTMwMzI0In0.y4k9MuE5qC15dZ_-elYWIy8XRWpPOBhL1TyH87-v76o",
  "access_expires_at": "2026-10-30T13:15:08.698437846Z",
  "refresh_token": "Dff5vcmAtwDQO5L4iSxSMpx5-v9tq0a8ULks_5f41gI",
  "refresh_expires_at": "2026-10-31T01:00:08.697486533Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "85ed54e9-2092-4168-ac80-df08b0028f0b",
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
  "id": "8df75559-9d37-459b-92bc-6e268b38daf7",
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
  "created_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "created_at": "2026-10-30T13:00:09.017182Z",
  "updated_at": "2026-10-30T13:00:09.017182Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635663481",
  "device_ref": "sandbox-4830"
}
```

```json
{
  "challenge_id": "9d350ea9-6fa5-4d2f-8093-756fe36878df",
  "expires_at": "2026-10-30T13:05:09.335180849Z",
  "resend_available_at": "2026-10-30T13:00:10.335180849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635663481` → **200**

```json
{
  "phone": "+380635663481",
  "audience": "CLIENT",
  "code": "748220",
  "sent_at": "2026-10-30T13:00:09.340179741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d350ea9-6fa5-4d2f-8093-756fe36878df",
  "code": "748220",
  "device_ref": "sandbox-4830"
}
```

```json
{
  "session_id": "7ba71c45-cbf1-443f-8260-849204b9bfad",
  "subject": {
    "type": "CLIENT",
    "id": "b50acd31-ad22-42de-9e8b-a39110f24eca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTBhY2QzMS1hZDIyLTQyZGUtOWU4Yi1hMzkxMTBmMjRlY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTA5LCJpYXQiOjE3OTMzNjUyMDksImp0aSI6IjE3MDI1M2UxLTM3ZGMtNDEyYS1iNTcwLWRiNGViNGU1MmFkZCIsInNpZCI6IjdiYTcxYzQ1LWNiZjEtNDQzZi04MjYwLTg0OTIwNGI5YmZhZCJ9.zQWAvJz1WYuJvy6NLnfbWobF29QgaJfPyLZPa9YuVng",
  "access_expires_at": "2026-10-30T13:15:09.65880948Z",
  "refresh_token": "dEsc-z47fDOG8Oes2bwaooiiUf9chubvGRYtPq4bhtA",
  "refresh_expires_at": "2026-11-29T13:00:09.658048182Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635663481` → **200**

```json
{
  "client_id": "b50acd31-ad22-42de-9e8b-a39110f24eca"
}
```

`POST /api/admin/v1/rider-wallets/b50acd31-ad22-42de-9e8b-a39110f24eca/top-ups` → **201**

```json
{
  "command_id": "bcf757ad-1a43-406d-87ca-1f330d18ef90",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b50acd31-ad22-42de-9e8b-a39110f24eca",
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
      "id": "7f2f4cdc-39be-479f-83bf-b0f442e0276b",
      "at": "2026-10-30T13:00:10.255809Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a372944-d74c-49c4-ad32-bd235b2763ce",
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
  "id": "c437fe55-6219-41e1-9559-4bb753931274",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:05:10.569209Z",
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
      "id": "8df75559-9d37-459b-92bc-6e268b38daf7",
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
  "device_ref": "sandbox-19288"
}
```

```json
{
  "challenge_id": "966e2320-4b15-48db-a08d-2baebefa8505",
  "expires_at": "2026-10-30T13:05:10.875760301Z",
  "resend_available_at": "2026-10-30T13:00:11.875760301Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "367923",
  "sent_at": "2026-10-30T13:00:10.880028188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "966e2320-4b15-48db-a08d-2baebefa8505",
  "code": "367923",
  "device_ref": "sandbox-19288"
}
```

```json
{
  "session_id": "384d62b2-7c02-482a-889e-38781bf2f3a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjExMSwiaWF0IjoxNzkzMzY1MjExLCJqdGkiOiIyZWM2OTk5ZS1lYTVjLTRlZDUtODcwMi05MmNhNjUzODYxMGQiLCJzaWQiOiIzODRkNjJiMi03YzAyLTQ4MmEtODg5ZS0zODc4MWJmMmYzYTUifQ.DwSWr_8feaFZppveTdbUIYSr5YJnpC5Tl7YdyPu147s",
  "access_expires_at": "2026-10-30T13:15:11.19554926Z",
  "refresh_token": "A0pMgjH9lMOFJCY2l_F9xEgyOEqvF2678FPcvhm-klk",
  "refresh_expires_at": "2026-11-29T13:00:11.194912436Z",
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
  "command_id": "b281f26a-dce5-4b28-bd73-0bb3ff220a27",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:11Z",
    "sequence": 1793365211772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72486ef4-edd4-4083-8cc1-e3b7aab236af",
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
  "last_heartbeat_at": "2026-10-30T13:00:11.793958Z",
  "last_location_at": "2026-10-30T13:00:11.793958Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1b81cc7c-9900-4d17-80af-9fc4742624cb",
  "quote_id": "c437fe55-6219-41e1-9559-4bb753931274",
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
  "id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b50acd31-ad22-42de-9e8b-a39110f24eca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:00:12.112459Z",
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
  "client_id": "b50acd31-ad22-42de-9e8b-a39110f24eca",
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
      "id": "7f2f4cdc-39be-479f-83bf-b0f442e0276b",
      "at": "2026-10-30T13:00:10.255809Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
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
    "id": "d0bd0cf2-5c02-41c2-bc27-659cd5209827",
    "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
    "expires_at": "2026-10-30T13:00:27.120988Z",
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

`POST /api/driver/v1/offers/d0bd0cf2-5c02-41c2-bc27-659cd5209827/accept` → **200**

```json
{
  "command_id": "50a4852f-c873-4f99-a96e-2417cda2132b"
}
```

```json
{
  "id": "f5d7cad0-19db-4a34-96e3-ed2479ebaf30",
  "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6ee9fd61-5836-4d1b-88ae-df40b36518aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6ee9fd61-5836-4d1b-88ae-df40b36518aa",
  "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
  "assignment_id": "f5d7cad0-19db-4a34-96e3-ed2479ebaf30",
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

`POST /api/driver/v1/work-sessions/72486ef4-edd4-4083-8cc1-e3b7aab236af/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:13Z",
    "sequence": 1793365213605
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72486ef4-edd4-4083-8cc1-e3b7aab236af",
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
  "last_heartbeat_at": "2026-10-30T13:00:13.626624Z",
  "last_location_at": "2026-10-30T13:00:13.626624Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6ee9fd61-5836-4d1b-88ae-df40b36518aa/arrive` → **200**

```json
{
  "command_id": "78cedd26-8a20-4b32-ad2f-8445a1f46d35",
  "expected_version": 0
}
```

```json
{
  "id": "6ee9fd61-5836-4d1b-88ae-df40b36518aa",
  "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
  "assignment_id": "f5d7cad0-19db-4a34-96e3-ed2479ebaf30",
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
  "arrived_at": "2026-10-30T13:00:13.931345Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6ee9fd61-5836-4d1b-88ae-df40b36518aa/start` → **200**

```json
{
  "command_id": "eda35fea-a514-4a3a-9957-a9dcdab05805",
  "expected_version": 1
}
```

```json
{
  "id": "6ee9fd61-5836-4d1b-88ae-df40b36518aa",
  "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
  "assignment_id": "f5d7cad0-19db-4a34-96e3-ed2479ebaf30",
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
  "arrived_at": "2026-10-30T13:00:13.931345Z",
  "started_at": "2026-10-30T13:00:14.247762Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6ee9fd61-5836-4d1b-88ae-df40b36518aa/complete` → **200**

```json
{
  "command_id": "d53ab57c-56d0-475c-9fb5-f912b58319ef",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:00:14Z",
  "cash_received": true
}
```

```json
{
  "id": "6ee9fd61-5836-4d1b-88ae-df40b36518aa",
  "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
  "assignment_id": "f5d7cad0-19db-4a34-96e3-ed2479ebaf30",
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
  "arrived_at": "2026-10-30T13:00:13.931345Z",
  "started_at": "2026-10-30T13:00:14.247762Z",
  "completed_at": "2026-10-30T13:00:14.576438Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b50acd31-ad22-42de-9e8b-a39110f24eca",
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
      "id": "46ff1260-0d61-4039-be2d-8dce2a230333",
      "at": "2026-10-30T13:00:14.99481Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0"
    },
    {
      "id": "7f2f4cdc-39be-479f-83bf-b0f442e0276b",
      "at": "2026-10-30T13:00:10.255809Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/8df75559-9d37-459b-92bc-6e268b38daf7/archive` → **200**

```json
{
  "command_id": "5a01ba54-ce0b-4645-9817-5dd4b1a31eec",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "8df75559-9d37-459b-92bc-6e268b38daf7",
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
  "created_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "created_at": "2026-10-30T13:00:09.017182Z",
  "updated_at": "2026-10-30T13:00:18.219684Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "72486ef4-edd4-4083-8cc1-e3b7aab236af",
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
  "last_heartbeat_at": "2026-10-30T13:00:13.626624Z",
  "last_location_at": "2026-10-30T13:00:13.626624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/72486ef4-edd4-4083-8cc1-e3b7aab236af/close` → **200**

```json
{
  "command_id": "d5358fe1-016c-4421-aa5a-28cc076d77de",
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

Done: order b8000e06-1b68-41d0-ac4c-c9cba19b72c0.

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-11201"
}
```

```json
{
  "challenge_id": "1424d351-3a4b-45e6-bac5-a01bb11bb975",
  "expires_at": "2026-10-30T13:05:19.116157397Z",
  "resend_available_at": "2026-10-30T13:00:20.116157397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "107809",
  "sent_at": "2026-10-30T13:00:19.120674463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1424d351-3a4b-45e6-bac5-a01bb11bb975",
  "code": "107809",
  "device_ref": "sandbox-11201"
}
```

```json
{
  "session_id": "5d4bc454-4b87-4522-a546-18a12fcd1b2c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjExOSwiaWF0IjoxNzkzMzY1MjE5LCJqdGkiOiIzYjIyYzgzOC1mZjVhLTQyYWItYmIxYS00Mjk2NGViOWY1MzciLCJzaWQiOiI1ZDRiYzQ1NC00Yjg3LTQ1MjItYTU0Ni0xOGExMmZjZDFiMmMifQ.KS6y_6XBMvcXJi7B-7kxv6Hp2VFVTgCKikP1F6zAOrI",
  "access_expires_at": "2026-10-30T13:15:19.436597099Z",
  "refresh_token": "s7oiKETiXBKMOafkgB-HcJt0fRp58dUKvhfbtzbtoz8",
  "refresh_expires_at": "2026-11-29T13:00:19.435862023Z",
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
  "device_ref": "sandbox-7393"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "57fe28ad-caed-4fa5-bced-4d5895237630",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-7393"
}
```

```json
{
  "challenge_id": "3c9b19fb-a049-484d-b2e2-fd579eac8c27",
  "expires_at": "2026-10-30T13:05:21.306894533Z",
  "resend_available_at": "2026-10-30T13:00:22.306894533Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "708621",
  "sent_at": "2026-10-30T13:00:21.311029061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c9b19fb-a049-484d-b2e2-fd579eac8c27",
  "code": "708621",
  "device_ref": "sandbox-7393"
}
```

```json
{
  "session_id": "de5eeee8-bfa7-40ac-adad-67c4575e5e5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjEyMSwiaWF0IjoxNzkzMzY1MjIxLCJqdGkiOiIxMTI1MTIwYy01MzYyLTQ2YTgtOWFlMC03ZTE2ODg1MjZlMjUiLCJzaWQiOiJkZTVlZWVlOC1iZmE3LTQwYWMtYWRhZC02N2M0NTc1ZTVlNWQifQ.xVFl10uO_4FOUTMLSY2E-BmQPEGPMNgbU5JoA5v0358",
  "access_expires_at": "2026-10-30T13:15:21.627187112Z",
  "refresh_token": "6L2zLYv1cBptUmJhaHGnwvMjOJOmCbwruFKTx_JXoBA",
  "refresh_expires_at": "2026-11-29T13:00:21.626511608Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-29776"
}
```

```json
{
  "challenge_id": "87f1f3f7-938b-40b0-a940-795b15f46ec1",
  "expires_at": "2026-10-30T13:05:21.928516795Z",
  "resend_available_at": "2026-10-30T13:00:22.928516795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "551014",
  "sent_at": "2026-10-30T13:00:21.932448302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87f1f3f7-938b-40b0-a940-795b15f46ec1",
  "code": "551014",
  "device_ref": "sandbox-29776"
}
```

```json
{
  "session_id": "12be37d8-7873-471d-b86c-f594e3a8b418",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjEyMiwiaWF0IjoxNzkzMzY1MjIyLCJqdGkiOiJhYzc5MGQ4NS1mY2QyLTRmNGEtOGQxZi0xYzUwNzMzZTY0ZGIiLCJzaWQiOiIxMmJlMzdkOC03ODczLTQ3MWQtYjg2Yy1mNTk0ZTNhOGI0MTgifQ.AIxeNXxlYZq-kyITXtHrc_qbyEV64_87ng1XgajgmHM",
  "access_expires_at": "2026-10-30T13:15:22.248632752Z",
  "refresh_token": "VTo9X-F_6C3LCKd35ka3NVHdgxlINK2i4-9Ycgq3bk4",
  "refresh_expires_at": "2026-11-29T13:00:22.247973088Z",
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
  "command_id": "adc52024-d51e-4627-800d-bb134d9f60c2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:23Z",
    "sequence": 1793365223108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "08338f2e-9d09-4ee7-866d-9705d7822704",
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
  "last_heartbeat_at": "2026-10-30T13:00:23.129234Z",
  "last_location_at": "2026-10-30T13:00:23.129234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600350669",
  "device_ref": "sandbox-1637"
}
```

```json
{
  "challenge_id": "eec808c4-585d-465d-abb2-f08c54d0ce75",
  "expires_at": "2026-10-30T13:05:23.439423992Z",
  "resend_available_at": "2026-10-30T13:00:24.439423992Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600350669` → **200**

```json
{
  "phone": "+48600350669",
  "audience": "CLIENT",
  "code": "582853",
  "sent_at": "2026-10-30T13:00:23.443551864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eec808c4-585d-465d-abb2-f08c54d0ce75",
  "code": "582853",
  "device_ref": "sandbox-1637"
}
```

```json
{
  "session_id": "7bf9ca71-d27f-4c78-87b0-422b5678f4a7",
  "subject": {
    "type": "CLIENT",
    "id": "680d758c-65b1-43c9-b56e-31bedbeb613c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODBkNzU4Yy02NWIxLTQzYzktYjU2ZS0zMWJlZGJlYjYxM2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTIzLCJpYXQiOjE3OTMzNjUyMjMsImp0aSI6Ijc4MjNkMWM1LWE2YmMtNDRmNy05N2IyLWUxOTBhNjRiNjk4MSIsInNpZCI6IjdiZjljYTcxLWQyN2YtNGM3OC04N2IwLTQyMmI1Njc4ZjRhNyJ9.9YiwlUSdxiNbL1QJt9Ir3iE1-7pqd6F1XzkyKJLdGuE",
  "access_expires_at": "2026-10-30T13:15:23.765254008Z",
  "refresh_token": "BIUlxdkrDUqncBb_Cy4gnCec-jDEdF-TGQfJN2AbtzA",
  "refresh_expires_at": "2026-11-29T13:00:23.764497213Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9c2ea7f-a7f6-4f70-b7b5-13b79a840b37",
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
  "id": "a6e6d92e-d993-47fa-b5cb-f3bfdc2367bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:05:24.076179Z",
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
  "command_id": "655d717f-05f1-464b-90dc-106d89c9f2fd",
  "quote_id": "a6e6d92e-d993-47fa-b5cb-f3bfdc2367bf",
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
  "id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "680d758c-65b1-43c9-b56e-31bedbeb613c",
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
  "created_at": "2026-10-30T13:00:24.412136Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af` → **200**

```json
{
  "id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "680d758c-65b1-43c9-b56e-31bedbeb613c",
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
  "created_at": "2026-10-30T13:00:24.412136Z",
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

`POST /api/driver/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af/claim` → **422**

```json
{
  "command_id": "bc3bd540-c9d9-43df-80aa-565bfeeb1390"
}
```

```json
{
  "instance": "/api/driver/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "806cfa15-4736-4737-a983-67fbce62472d"
}
```

`GET /api/rider/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af` → **200**

```json
{
  "id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "680d758c-65b1-43c9-b56e-31bedbeb613c",
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
  "created_at": "2026-10-30T13:00:24.412136Z",
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

`POST /api/driver/v1/orders/dcfff374-e473-43b1-b964-69d7ffc8b14b/claim` → **404**

```json
{
  "command_id": "97892ec6-39ff-4180-b821-3972e23a2e9c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dcfff374-e473-43b1-b964-69d7ffc8b14b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e5d5d8a1-d5bd-426b-bba9-ce32c7b5b938"
}
```

`POST /api/driver/v1/orders/630195f0-7b37-4d44-8bcc-d76a724f4bd2/claim` → **404**

```json
{
  "command_id": "b2a00d00-52fb-4336-bfb8-09a6ff3807ed"
}
```

```json
{
  "instance": "/api/driver/v1/orders/630195f0-7b37-4d44-8bcc-d76a724f4bd2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "89290e43-bb5e-4584-99d2-2538edca7043"
}
```

`POST /api/driver/v1/orders/36f80c76-5c4d-40d5-9946-140e396b9a3c/claim` → **404**

```json
{
  "command_id": "e3093d8f-8044-4e8c-bd45-31e95b4d06de"
}
```

```json
{
  "instance": "/api/driver/v1/orders/36f80c76-5c4d-40d5-9946-140e396b9a3c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e0c7a776-1641-4142-b708-22ac41f1483b"
}
```

`POST /api/driver/v1/orders/7ad931d8-a7b8-466c-9aac-76b15fac7f08/claim` → **404**

```json
{
  "command_id": "02a3df6d-abcf-428b-ad98-289dd90424c9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7ad931d8-a7b8-466c-9aac-76b15fac7f08/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4172ebd8-63e7-49ec-a50f-047715223590"
}
```

`POST /api/driver/v1/orders/bf0d8a1a-ea0f-4982-8582-871c254f4651/claim` → **404**

```json
{
  "command_id": "7ef7bd68-5e04-42f1-a49f-05131f90823c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bf0d8a1a-ea0f-4982-8582-871c254f4651/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d6c3d87b-e6cf-4ac8-ae15-f6aa8360629b"
}
```

`POST /api/driver/v1/orders/b278fb91-7976-4d43-87f4-d4b2fe488d56/claim` → **404**

```json
{
  "command_id": "bb2a1ae1-b3ab-4c19-b8f8-e0068cdfd03a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b278fb91-7976-4d43-87f4-d4b2fe488d56/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "11b96454-37f4-4a84-9c3a-bd9b99e47e38"
}
```

`POST /api/driver/v1/orders/df30f290-f91b-4ab0-9778-364abc6ccd2b/claim` → **404**

```json
{
  "command_id": "8ff06879-6cc2-4dd3-a4b6-b4871aca0e8e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/df30f290-f91b-4ab0-9778-364abc6ccd2b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1c6f75e5-d9f7-48ea-821b-a8429edebd99"
}
```

`POST /api/driver/v1/orders/544b4809-bcda-4c14-8445-dd4d2690df7e/claim` → **404**

```json
{
  "command_id": "ec696c4e-4039-4a01-a54c-dbcf1c09a71a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/544b4809-bcda-4c14-8445-dd4d2690df7e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cc5df527-d87f-49ab-9b2b-f29be7e99dff"
}
```

`POST /api/driver/v1/orders/b7485496-d225-4667-b298-5d12d9125f14/claim` → **404**

```json
{
  "command_id": "54aa73d3-f2b5-4796-871a-bf78ddf05811"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b7485496-d225-4667-b298-5d12d9125f14/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c031a262-1170-4ec8-94f3-fba488d8b37b"
}
```

`POST /api/driver/v1/orders/41fb2792-49b5-47fe-a980-fc31bf6b90a5/claim` → **404**

```json
{
  "command_id": "197db55d-835e-4366-8ae7-7264844e85cb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/41fb2792-49b5-47fe-a980-fc31bf6b90a5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "71c46c8f-8aa3-4a77-8348-c40d9c05ded5"
}
```

`POST /api/driver/v1/orders/55462c35-515a-44b0-bfad-3052167bfd07/claim` → **404**

```json
{
  "command_id": "83788ddf-7c29-47a1-b8f0-0dc9dbf5f235"
}
```

```json
{
  "instance": "/api/driver/v1/orders/55462c35-515a-44b0-bfad-3052167bfd07/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "84e659a8-f024-4905-a214-9b0ac29f9f25"
}
```

`POST /api/driver/v1/orders/3f1fee31-5ca3-41bb-a8d4-973fc28cbb9f/claim` → **404**

```json
{
  "command_id": "3ad7da22-0b3c-460c-a26d-fccef14b5535"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3f1fee31-5ca3-41bb-a8d4-973fc28cbb9f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1ebbd772-e8d0-4ff0-8a25-4aaaa0233738"
}
```

`POST /api/driver/v1/orders/3f8f8bad-bd0a-467d-9e73-c7d1ffeff6b4/claim` → **404**

```json
{
  "command_id": "2b88d59a-2072-45e5-b8de-7fec463a47ef"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3f8f8bad-bd0a-467d-9e73-c7d1ffeff6b4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "977a9753-b2cb-4168-afa6-bd665bdfeec0"
}
```

`POST /api/driver/v1/orders/8182a2fe-10e2-4168-9102-a1964ba3a5a3/claim` → **404**

```json
{
  "command_id": "62707b57-bd59-471d-8a92-460c1996267b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8182a2fe-10e2-4168-9102-a1964ba3a5a3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "100feaab-15ff-49da-b575-e2c7376806ec"
}
```

`POST /api/driver/v1/orders/d70e81be-3186-4882-a209-7d7d0a8a8656/claim` → **404**

```json
{
  "command_id": "27c335f0-c1da-4ed8-b007-41bd8112702b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d70e81be-3186-4882-a209-7d7d0a8a8656/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6aee4774-56ea-4f13-90c3-fb6add08ba7f"
}
```

`POST /api/driver/v1/orders/b29041e6-6ae9-435f-b4fd-c01f8a38718a/claim` → **404**

```json
{
  "command_id": "647ad6e3-0518-4a3a-9701-e5a53e18320b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b29041e6-6ae9-435f-b4fd-c01f8a38718a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "50794dec-666c-45b5-86a6-4ad57323ef2e"
}
```

`POST /api/driver/v1/orders/816a37dd-3ad8-4e52-9bc2-46c8197cf8d9/claim` → **404**

```json
{
  "command_id": "f3f30939-d89f-4e87-a453-8c746a1e3364"
}
```

```json
{
  "instance": "/api/driver/v1/orders/816a37dd-3ad8-4e52-9bc2-46c8197cf8d9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "91e2070f-9b92-4f64-b799-d44062886936"
}
```

`POST /api/driver/v1/orders/6e0fc57c-bcdf-41b9-a581-c6243652698b/claim` → **404**

```json
{
  "command_id": "c46abc36-0aaa-4d8b-a982-c5dce5de4802"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6e0fc57c-bcdf-41b9-a581-c6243652698b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0d460334-3ae0-465e-8c0d-8cba69ad6b95"
}
```

`POST /api/driver/v1/orders/b10b9649-4b37-448d-9501-e50d7cf259f8/claim` → **404**

```json
{
  "command_id": "03fb3b80-d134-4657-b6df-015a023dcc01"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b10b9649-4b37-448d-9501-e50d7cf259f8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6181a336-67e4-49c4-84d2-d0c6fa3fd75d"
}
```

`POST /api/driver/v1/orders/b084be01-e9a3-4a55-ac9f-e5e6cb7f76e9/claim` → **404**

```json
{
  "command_id": "51e3f0f6-ec4e-486e-84b7-dd2489cbe9ca"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b084be01-e9a3-4a55-ac9f-e5e6cb7f76e9/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9d16b2b8-cf93-43c4-b2ae-97c6e2a174f0"
}
```

`POST /api/driver/v1/orders/172cdec7-6910-422c-96c8-08ab2e8aca22/claim` → **404**

```json
{
  "command_id": "1a4c63db-a1f2-4233-b353-d44a7f58aca4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/172cdec7-6910-422c-96c8-08ab2e8aca22/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "616722e0-60c4-45f9-bc01-ec8309df525c"
}
```

`POST /api/driver/v1/orders/56662bc8-7c07-427c-bb7d-4bd16c0d55c3/claim` → **404**

```json
{
  "command_id": "fdf55d5e-28ba-4194-b81b-d6186241d1c6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/56662bc8-7c07-427c-bb7d-4bd16c0d55c3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d0d47624-8220-4a11-9e31-c9b992c2307d"
}
```

`POST /api/driver/v1/orders/685b5f5f-5bac-4b97-b445-a84baa8c8c83/claim` → **404**

```json
{
  "command_id": "0356974e-f930-4cd0-b4b9-339b358fb9f6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/685b5f5f-5bac-4b97-b445-a84baa8c8c83/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2539abc8-6fd0-4a25-a0be-384f08727de6"
}
```

`POST /api/driver/v1/orders/b196d667-6b4f-4d8e-b49a-3d429e050934/claim` → **404**

```json
{
  "command_id": "0905013e-10b3-4d53-9785-57ef22f351b9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b196d667-6b4f-4d8e-b49a-3d429e050934/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dfd58cc3-60b8-4e2d-9cbc-d820795df4f3"
}
```

`POST /api/driver/v1/orders/59395831-2c47-42db-b956-c9549d7208dc/claim` → **404**

```json
{
  "command_id": "99dc59a0-a53c-4a05-8ab0-6c64e0168cac"
}
```

```json
{
  "instance": "/api/driver/v1/orders/59395831-2c47-42db-b956-c9549d7208dc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "81ae627a-e39f-4c72-8e06-bd0d195fd849"
}
```

`POST /api/driver/v1/orders/07fc2324-fda0-489e-99ce-57f1736d2ac4/claim` → **404**

```json
{
  "command_id": "54c166c6-092e-4e9f-adde-71289044d153"
}
```

```json
{
  "instance": "/api/driver/v1/orders/07fc2324-fda0-489e-99ce-57f1736d2ac4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a32e11d5-b583-4243-bc9e-a9168f7668ee"
}
```

`POST /api/driver/v1/orders/97e2968c-9ac8-4254-b38d-8c9a8a3b95e2/claim` → **404**

```json
{
  "command_id": "5fe78383-11a4-4eb7-8f13-1fd33883a03b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/97e2968c-9ac8-4254-b38d-8c9a8a3b95e2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "401a5aab-4668-4c1a-8951-c17056e84775"
}
```

`POST /api/driver/v1/orders/725739aa-d918-4f63-abaa-b41b86ff5586/claim` → **404**

```json
{
  "command_id": "99eafed6-9558-4c4f-9843-e9813f0dbf9b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/725739aa-d918-4f63-abaa-b41b86ff5586/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4de3d2d8-f621-402e-8364-4491c4e1f199"
}
```

`POST /api/driver/v1/orders/99512fb5-e3f6-44d8-9892-c8e7ba7911e6/claim` → **404**

```json
{
  "command_id": "6b0410d8-891c-4c08-bf13-ecbd794c40f0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/99512fb5-e3f6-44d8-9892-c8e7ba7911e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6381443d-8a64-484f-a6d7-a72093e11afe"
}
```

`POST /api/driver/v1/orders/eead05f6-0e3c-4c68-83d4-8b6b22445307/claim` → **429**

```json
{
  "command_id": "a8518a79-770b-434f-974f-0aa613a09b2c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/eead05f6-0e3c-4c68-83d4-8b6b22445307/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "4458e168-ec0c-4a70-a4ea-bfe739375d9e",
  "retryable": true,
  "retry_after_seconds": 591
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
  "command_id": "434e1788-9255-44d6-9240-f683df716e42",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:35Z",
    "sequence": 1793365235301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6bb3f0ca-95d0-4039-a2f1-eb532ad508fd",
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
  "last_heartbeat_at": "2026-10-30T13:00:35.322098Z",
  "last_location_at": "2026-10-30T13:00:35.322098Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
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

`POST /api/driver/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af/claim` → **409**

```json
{
  "command_id": "2e78000c-b553-4cd7-93c7-307aa412ae5f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a4a7e12d-ce51-4f2d-a6f2-264caab8f453"
}
```

`POST /api/driver/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af/claim` → **200**

```json
{
  "command_id": "a6756061-984c-4148-b8c6-bc3f98fc557e"
}
```

```json
{
  "id": "de12bb5d-34dc-47fc-b441-3e54feb94b30",
  "order_id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "df51afe7-d31c-4493-bfd1-e20c5069154f",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "df51afe7-d31c-4493-bfd1-e20c5069154f",
  "order_id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "assignment_id": "de12bb5d-34dc-47fc-b441-3e54feb94b30",
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

`POST /api/driver/v1/trips/df51afe7-d31c-4493-bfd1-e20c5069154f/cancel` → **200**

```json
{
  "command_id": "562db2df-2e66-46e1-9202-7309a4962dfc",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "df51afe7-d31c-4493-bfd1-e20c5069154f",
  "order_id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "assignment_id": "de12bb5d-34dc-47fc-b441-3e54feb94b30",
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

`GET /api/rider/v1/orders/47d47a8f-efb8-4bf3-b890-51ef5d3be0af` → **200**

```json
{
  "id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "680d758c-65b1-43c9-b56e-31bedbeb613c",
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
    "id": "de12bb5d-34dc-47fc-b441-3e54feb94b30",
    "order_id": "47d47a8f-efb8-4bf3-b890-51ef5d3be0af",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "df51afe7-d31c-4493-bfd1-e20c5069154f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:00:24.412136Z",
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
  "session_id": "08338f2e-9d09-4ee7-866d-9705d7822704",
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
  "last_heartbeat_at": "2026-10-30T13:00:23.129234Z",
  "last_location_at": "2026-10-30T13:00:23.129234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08338f2e-9d09-4ee7-866d-9705d7822704/close` → **200**

```json
{
  "command_id": "2a871c5a-84b8-48aa-8bb4-bf2af7115b21",
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
  "session_id": "6bb3f0ca-95d0-4039-a2f1-eb532ad508fd",
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
  "last_heartbeat_at": "2026-10-30T13:00:35.322098Z",
  "last_location_at": "2026-10-30T13:00:35.322098Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6bb3f0ca-95d0-4039-a2f1-eb532ad508fd/close` → **200**

```json
{
  "command_id": "ece5eeac-552e-48e8-989d-0eb5e68c306a",
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
  "session_id": "128c7173-6fb2-4429-87ed-b7f83f136492",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxMzksImlhdCI6MTc5MzM2NTIzOSwianRpIjoiM2M0MTdjOGUtODdmNy00YmY1LWFjMGEtZDg4NDllYWQ3ZGNjIiwic2lkIjoiMTI4YzcxNzMtNmZiMi00NDI5LTg3ZWQtYjdmODNmMTM2NDkyIn0.hweZ6ETX4e4bDEQ9GZFyVgXouK0q7XT94avSch918Tg",
  "access_expires_at": "2026-10-30T13:15:39.09730873Z",
  "refresh_token": "rabW5PzvjOM41PzXQcQ0cEgjBaQzzDoNtirRH15aei4",
  "refresh_expires_at": "2026-10-31T01:00:39.096510105Z",
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
  "command_id": "469e6701-7391-420d-90a6-467a0d73b216",
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
  "session_id": "83315577-bb0c-40ff-916e-a467b3ed74e0",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNDAsImlhdCI6MTc5MzM2NTI0MCwianRpIjoiMDMzNTBkMzMtMjhkNS00ZjE2LTlmMjQtNjEzZTgwZTcyMjZlIiwic2lkIjoiODMzMTU1NzctYmIwYy00MGZmLTkxNmUtYTQ2N2IzZWQ3NGUwIn0.yicjPI0EClL54-i1Cxvoec2NPU2LtIO_uO16SULymOY",
  "access_expires_at": "2026-10-30T13:15:40.286435875Z",
  "refresh_token": "4CzJ3agBVUj2LPvvStmXmuI6c7-fnagHQ35XDxFhwoI",
  "refresh_expires_at": "2026-10-31T01:00:40.285822418Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.242357795",
    "linkedid": "1730052700.242357795",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670804714"
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
    "id": "1730052700.242357795",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "06a53ec2-9df8-46d2-8f10-ac97078d3b1e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.570508Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:00:40.596837Z",
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
    "id": "1730052600.3042912347",
    "linkedid": "1730052600.3042912347",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670804714"
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
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/3de52940-7150-4d6c-8b7e-a36f17781588/answer` → **200**

```json
{
  "command_id": "79775247-8fb0-4707-87b0-40173266b572"
}
```

```json
{
  "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670804714",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "order_ids": [],
  "started_at": "2026-10-30T13:00:40.939295Z",
  "answered_at": "2026-10-30T13:00:41.286053Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3042912347",
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
    "id": "1730052600.3042912347",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": "2026-10-30T13:00:41.286053Z",
      "ended_at": "2026-10-30T13:00:41.604284Z",
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
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": "2026-10-30T13:00:41.286053Z",
      "ended_at": "2026-10-30T13:00:41.604284Z",
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
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": "2026-10-30T13:00:41.286053Z",
      "ended_at": "2026-10-30T13:00:41.604284Z",
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
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": "2026-10-30T13:00:41.286053Z",
      "ended_at": "2026-10-30T13:00:41.604284Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:00:46.597769Z"
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
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": "2026-10-30T13:00:41.286053Z",
      "ended_at": "2026-10-30T13:00:41.604284Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:00:46.597769Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/3de52940-7150-4d6c-8b7e-a36f17781588/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/3de52940-7150-4d6c-8b7e-a36f17781588/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=3de52940-7150-4d6c-8b7e-a36f17781588` → **200**

```json
{
  "changes": [
    {
      "id": "f8cc70bc-59c4-4b1e-8cdc-72d3a9863930",
      "occurred_at": "2026-10-30T13:00:49.164305Z",
      "actor_type": "STAFF",
      "actor_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"96b0cc7a-b2f2-4b43-bbae-ca3c82daf756\", \"order_ids\": []}",
      "correlation_id": "dc2f91bc-2173-4b59-92e7-874a8d30114a"
    },
    {
      "id": "ef7ffa9a-0b8b-49b1-b7f1-3dc8886a6b73",
      "occurred_at": "2026-10-30T13:00:49.126622Z",
      "actor_type": "STAFF",
      "actor_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"96b0cc7a-b2f2-4b43-bbae-ca3c82daf756\", \"order_ids\": []}",
      "correlation_id": "f574f484-ab8d-428b-9048-b3cbb4f56e08"
    }
  ]
}
```

Done: call 3de52940-7150-4d6c-8b7e-a36f17781588 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29464"
}
```

```json
{
  "challenge_id": "87438651-c43e-4c38-8583-ac66bab61a6d",
  "expires_at": "2026-10-30T13:05:49.501293102Z",
  "resend_available_at": "2026-10-30T13:00:50.501293102Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "376742",
  "sent_at": "2026-10-30T13:00:49.505136762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87438651-c43e-4c38-8583-ac66bab61a6d",
  "code": "376742",
  "device_ref": "sandbox-29464"
}
```

```json
{
  "session_id": "754d6fc6-816e-4352-a9e1-9ad39cce4f71",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE0OSwiaWF0IjoxNzkzMzY1MjQ5LCJqdGkiOiJiZTNlNTQ4Ny04OTNkLTQyMmQtYjE3Zi01NjEzNWRhODZiZGIiLCJzaWQiOiI3NTRkNmZjNi04MTZlLTQzNTItYTllMS05YWQzOWNjZTRmNzEifQ.MtRMzbX1AtoxRhgjUrx5iQq7EFENCZQ51b7bu-uzGYA",
  "access_expires_at": "2026-10-30T13:15:49.831157939Z",
  "refresh_token": "9Kk0EMr2d1sLOXLYUPxjX0NX7ktQ2fFILGfGzuFFMoA",
  "refresh_expires_at": "2026-11-29T13:00:49.830530287Z",
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
  "command_id": "900e4270-249a-411a-b306-bd804646e9e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:50Z",
    "sequence": 1793365250418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff2ae4ca-0fad-4a74-ba60-8a1b6eb413d4",
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
  "last_heartbeat_at": "2026-10-30T13:00:50.438735Z",
  "last_location_at": "2026-10-30T13:00:50.438735Z",
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
  "session_id": "e31f0ab8-84b7-4248-9c0d-e8adc71277cb",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNTEsImlhdCI6MTc5MzM2NTI1MSwianRpIjoiMTQ0OGRlM2YtMGViZS00Mzg3LWFlYTItMzZjZjk0MzQ2MzZlIiwic2lkIjoiZTMxZjBhYjgtODRiNy00MjQ4LTljMGQtZThhZGM3MTI3N2NiIn0._qC7E9zBWZzobB8q102tNHZNAoSbQRxgixY3qPNvvPI",
  "access_expires_at": "2026-10-30T13:15:51.025967335Z",
  "refresh_token": "uVgsLv2SLPc6jXyaypljgq1qnCq9JT35LSMULdSNJvA",
  "refresh_expires_at": "2026-10-31T01:00:51.025334664Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c5f694c6-224d-4025-81f3-42bb243f6b3f",
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
  "id": "b382d7f8-299a-4c30-90c7-1f222c83ea8f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:05:51.327027Z",
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
  "command_id": "18cc9dcf-56ce-4229-bc2e-fb4b73b5c1c5",
  "quote_id": "b382d7f8-299a-4c30-90c7-1f222c83ea8f",
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
    "phone": "+380677056915"
  }
}
```

```json
{
  "id": "de205c55-6309-4f57-9c96-e0e60375b684",
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
  "created_at": "2026-10-30T13:00:51.652823Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677056915"
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
    "id": "2e5232aa-3cf3-4814-a858-b7c8080b7f31",
    "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
    "expires_at": "2026-10-30T13:01:06.658441Z",
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

`POST /api/driver/v1/offers/2e5232aa-3cf3-4814-a858-b7c8080b7f31/accept` → **200**

```json
{
  "command_id": "f2e53547-df70-4cd6-8ecb-3090cc2b0e71"
}
```

```json
{
  "id": "8e1ed7cb-35b9-471f-98ae-af28523c13c7",
  "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4796a2d1-e952-4ebc-bc31-8244c03a3603",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4796a2d1-e952-4ebc-bc31-8244c03a3603",
  "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
  "assignment_id": "8e1ed7cb-35b9-471f-98ae-af28523c13c7",
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
    "phone": "+380677056915"
  }
}
```

`POST /api/driver/v1/work-sessions/ff2ae4ca-0fad-4a74-ba60-8a1b6eb413d4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:00:54Z",
    "sequence": 1793365254999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ff2ae4ca-0fad-4a74-ba60-8a1b6eb413d4",
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
  "last_heartbeat_at": "2026-10-30T13:00:55.020262Z",
  "last_location_at": "2026-10-30T13:00:55.020262Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4796a2d1-e952-4ebc-bc31-8244c03a3603/arrive` → **200**

```json
{
  "command_id": "94658b84-ce8b-486e-bf7b-dd2b131e3f88",
  "expected_version": 0
}
```

```json
{
  "id": "4796a2d1-e952-4ebc-bc31-8244c03a3603",
  "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
  "assignment_id": "8e1ed7cb-35b9-471f-98ae-af28523c13c7",
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
  "arrived_at": "2026-10-30T13:00:55.321714Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677056915"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  },
  {
    "phone": "+380677056915",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:56.964764187Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  },
  {
    "phone": "+380677056915",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:56.964764187Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677056915` → **200**

```json
[
  {
    "phone": "+380677056915",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:53.953671782Z"
  },
  {
    "phone": "+380677056915",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:00:56.964764187Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/4796a2d1-e952-4ebc-bc31-8244c03a3603/start` → **200**

```json
{
  "command_id": "53f594d9-98c9-4cf6-a9ae-56084aad2e7b",
  "expected_version": 1
}
```

```json
{
  "id": "4796a2d1-e952-4ebc-bc31-8244c03a3603",
  "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
  "assignment_id": "8e1ed7cb-35b9-471f-98ae-af28523c13c7",
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
  "arrived_at": "2026-10-30T13:00:55.321714Z",
  "started_at": "2026-10-30T13:00:57.764129Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677056915"
  }
}
```

`POST /api/driver/v1/trips/4796a2d1-e952-4ebc-bc31-8244c03a3603/complete` → **200**

```json
{
  "command_id": "a240bd5b-4536-4578-95e6-356c4db969e2",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:00:58Z",
  "cash_received": true
}
```

```json
{
  "id": "4796a2d1-e952-4ebc-bc31-8244c03a3603",
  "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
  "assignment_id": "8e1ed7cb-35b9-471f-98ae-af28523c13c7",
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
  "arrived_at": "2026-10-30T13:00:55.321714Z",
  "started_at": "2026-10-30T13:00:57.764129Z",
  "completed_at": "2026-10-30T13:00:58.07627Z",
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
  "session_id": "ff2ae4ca-0fad-4a74-ba60-8a1b6eb413d4",
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
  "last_heartbeat_at": "2026-10-30T13:00:55.020262Z",
  "last_location_at": "2026-10-30T13:00:55.020262Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ff2ae4ca-0fad-4a74-ba60-8a1b6eb413d4/close` → **200**

```json
{
  "command_id": "483c1398-52ce-433f-a553-b8ddbbb5b127",
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
  "phone": "+380632447722",
  "device_ref": "sandbox-17891"
}
```

```json
{
  "challenge_id": "86e9f55d-9b55-4c23-950e-f7c69276c33c",
  "expires_at": "2026-10-30T13:05:58.98501695Z",
  "resend_available_at": "2026-10-30T13:00:59.98501695Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632447722` → **200**

```json
{
  "phone": "+380632447722",
  "audience": "CLIENT",
  "code": "738771",
  "sent_at": "2026-10-30T13:00:58.988787995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86e9f55d-9b55-4c23-950e-f7c69276c33c",
  "code": "738771",
  "device_ref": "sandbox-17891"
}
```

```json
{
  "session_id": "f180230f-9ff0-4031-b2c5-ea2603f978f4",
  "subject": {
    "type": "CLIENT",
    "id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiM2UwZWU5Yy1jODdkLTQxZjgtOWRhMS1jODdjNzRjOTg5MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTU5LCJpYXQiOjE3OTMzNjUyNTksImp0aSI6IjQ2ZDc3ODRlLWFjNDQtNDkwYi05YjVjLTQ4NTIyYmEyOWQ1MyIsInNpZCI6ImYxODAyMzBmLTlmZjAtNDAzMS1iMmM1LWVhMjYwM2Y5NzhmNCJ9.A7XeIP2h2jewSnh3ObH1hzoTHq_1qccnDpfsVVNQPZo",
  "access_expires_at": "2026-10-30T13:15:59.311157131Z",
  "refresh_token": "ZhV-1cy85t3Z3jWdQABLIVm2-itcc2JlJbq4eb4x3oM",
  "refresh_expires_at": "2026-11-29T13:00:59.310630297Z",
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
  "device_ref": "sandbox-26251"
}
```

```json
{
  "challenge_id": "731576af-bba0-47da-8095-3587c5f32a09",
  "expires_at": "2026-10-30T13:05:59.876357331Z",
  "resend_available_at": "2026-10-30T13:01:00.876357331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "813531",
  "sent_at": "2026-10-30T13:00:59.879326938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "731576af-bba0-47da-8095-3587c5f32a09",
  "code": "813531",
  "device_ref": "sandbox-26251"
}
```

```json
{
  "session_id": "32f9b4c2-3698-4f3e-9b98-d81bbaa0bbb2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE2MCwiaWF0IjoxNzkzMzY1MjYwLCJqdGkiOiI2ZmMzYzc4NS04MzlkLTQzODQtYjI0Zi05MjJlOTRmNjIyZDEiLCJzaWQiOiIzMmY5YjRjMi0zNjk4LTRmM2UtOWI5OC1kODFiYmFhMGJiYjIifQ.8o0FxPhyBvI4yJ0LBlUtGCdQFR0gc2opQusQVfy4hIk",
  "access_expires_at": "2026-10-30T13:16:00.19907131Z",
  "refresh_token": "XLz219kXHxy0r2dXgeS442zMDLhFWzo_xllvpfv5DQg",
  "refresh_expires_at": "2026-11-29T13:01:00.198458407Z",
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
  "session_id": "94f85c84-9485-4c5e-8f43-f7e19508b978",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNjEsImlhdCI6MTc5MzM2NTI2MSwianRpIjoiZGU1MmE2NjgtMGY1Mi00NWM4LWIwYzQtMmY3ZGZkOGNlMDUxIiwic2lkIjoiOTRmODVjODQtOTQ4NS00YzVlLThmNDMtZjdlMTk1MDhiOTc4In0.tClM-OXiy3Thu4usD-9BbgTvBWFJC1TKxg-6zCCYaYc",
  "access_expires_at": "2026-10-30T13:16:01.071433943Z",
  "refresh_token": "6m6G2amZ6gHH6lkYN4QkqqdBqXCVpUeMFhs2EMj5OCo",
  "refresh_expires_at": "2026-10-31T01:01:01.070755314Z",
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
  "session_id": "d38ce174-7cc3-4723-8969-bb9db2325721",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxNjEsImlhdCI6MTc5MzM2NTI2MSwianRpIjoiNDk2MTRjODgtMWNkMC00ODc4LWFmY2ItNTZhMmE2ZDMxYTIwIiwic2lkIjoiZDM4Y2UxNzQtN2NjMy00NzIzLTg5NjktYmI5ZGIyMzI1NzIxIn0.VF4YbRtoNV9xLFyZx2xXnYCQ7n37zHfw3QSYK7Zci18",
  "access_expires_at": "2026-10-30T13:16:01.656381639Z",
  "refresh_token": "ddsqwiXYScZf8P68hFnySG4r5EluA82uG_brvLrKGA4",
  "refresh_expires_at": "2026-10-31T01:01:01.655801454Z",
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
  "command_id": "04a7a3ca-1722-4fb3-b2be-f22860b17b26",
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
  "id": "a1c401dc-0019-4eb4-8b4f-fb7f8f2412dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:02.247849Z",
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
  "command_id": "803df27b-a006-4503-914c-96df75c18581",
  "quote_id": "a1c401dc-0019-4eb4-8b4f-fb7f8f2412dc",
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
  "id": "c8097161-9589-451a-ace7-41fac0cee41c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936",
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
  "created_at": "2026-10-30T13:01:02.563347Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c8097161-9589-451a-ace7-41fac0cee41c` → **200**

```json
{
  "id": "c8097161-9589-451a-ace7-41fac0cee41c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936",
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
  "created_at": "2026-10-30T13:01:02.563347Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c8097161-9589-451a-ace7-41fac0cee41c/cancel` → **200**

```json
{
  "command_id": "239676bd-d906-4173-9697-e1e6844b3ec3",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c8097161-9589-451a-ace7-41fac0cee41c",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936",
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
  "created_at": "2026-10-30T13:01:02.563347Z",
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
  "command_id": "24d852e6-a4f7-44d5-8ccd-784a56457f52",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:03Z",
    "sequence": 1793365263828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "318079f7-de72-4bd4-9b24-bd5f304e0b8a",
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
  "last_heartbeat_at": "2026-10-30T13:01:03.849147Z",
  "last_location_at": "2026-10-30T13:01:03.849147Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19068"
}
```

```json
{
  "challenge_id": "901c977e-3983-4715-b6fe-1d012a3effdf",
  "expires_at": "2026-10-30T13:06:04.155051892Z",
  "resend_available_at": "2026-10-30T13:01:05.155051892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "964554",
  "sent_at": "2026-10-30T13:01:04.15837204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "901c977e-3983-4715-b6fe-1d012a3effdf",
  "code": "964554",
  "device_ref": "sandbox-19068"
}
```

```json
{
  "session_id": "087d0f21-101b-488e-a0f1-978ef9d3ab1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE2NCwiaWF0IjoxNzkzMzY1MjY0LCJqdGkiOiIzYjBjMjEwZC1mYWQ1LTQ4N2ItODljNS0xNzBlOGI2N2IwNDEiLCJzaWQiOiIwODdkMGYyMS0xMDFiLTQ4OGUtYTBmMS05NzhlZjlkM2FiMWMifQ.zSyeaXriM-wbH-QsfU9cRcLDs4G6dg9T1PKS14UH5f8",
  "access_expires_at": "2026-10-30T13:16:04.4851757Z",
  "refresh_token": "o7DrnnJ7ejqfhtHxZSNwsDzSrJzQ53vdNyLbL6RZ3wo",
  "refresh_expires_at": "2026-11-29T13:01:04.484592382Z",
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
  "command_id": "3ac07eba-eb6a-454b-b701-1b7ed793e89b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:05Z",
    "sequence": 1793365265693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:05.089449Z",
  "last_location_at": "2026-10-30T13:01:05.089449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "64ed74cd-7962-462c-b72f-57d4d275607f",
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
  "id": "110bc446-a2b4-44a6-a50d-cab57c5f7d24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:05.401054Z",
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
  "command_id": "37be2f6f-54a5-4058-acf4-99d833c033bd",
  "quote_id": "110bc446-a2b4-44a6-a50d-cab57c5f7d24",
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
  "id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936",
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
  "created_at": "2026-10-30T13:01:05.709893Z",
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
    "id": "cabb13d8-3005-42b9-8ef8-ce60811a35b4",
    "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
    "expires_at": "2026-10-30T13:01:20.71391Z",
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

`POST /api/driver/v1/offers/cabb13d8-3005-42b9-8ef8-ce60811a35b4/accept` → **200**

```json
{
  "command_id": "b426ed5f-336f-4ddb-af73-4e009c3e4665"
}
```

```json
{
  "id": "ccec5ee5-3f37-4a05-8e23-4fa026df0a48",
  "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a33e49c-bc20-47da-9f7d-5671437b8caf",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a33e49c-bc20-47da-9f7d-5671437b8caf",
  "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "assignment_id": "ccec5ee5-3f37-4a05-8e23-4fa026df0a48",
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

`POST /api/driver/v1/trips/9a33e49c-bc20-47da-9f7d-5671437b8caf/cancel` → **200**

```json
{
  "command_id": "4bc251b2-32dc-4d14-88b1-73de46473250",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "9a33e49c-bc20-47da-9f7d-5671437b8caf",
  "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "assignment_id": "ccec5ee5-3f37-4a05-8e23-4fa026df0a48",
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

`GET /api/rider/v1/orders/ae1abd76-1bb8-4cdc-bad8-c27f4926a073` → **200**

```json
{
  "id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936",
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
    "id": "ccec5ee5-3f37-4a05-8e23-4fa026df0a48",
    "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9a33e49c-bc20-47da-9f7d-5671437b8caf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:01:05.709893Z",
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
    "id": "101e7f6c-9bc3-4db0-9b5c-9b34f60f06bf",
    "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
    "expires_at": "2026-10-30T13:01:21.93169Z",
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

`POST /api/driver/v1/offers/101e7f6c-9bc3-4db0-9b5c-9b34f60f06bf/accept` → **200**

```json
{
  "command_id": "5c2072ee-2711-4af5-a9b7-48a6a9f6ee36"
}
```

```json
{
  "id": "189a70f3-8636-4a48-8cb5-abeb0e9ab02a",
  "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a2b478e-513b-4063-8b93-7db84dd48b5c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a2b478e-513b-4063-8b93-7db84dd48b5c",
  "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "assignment_id": "189a70f3-8636-4a48-8cb5-abeb0e9ab02a",
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

`POST /api/driver/v1/trips/8a2b478e-513b-4063-8b93-7db84dd48b5c/cancel` → **200**

```json
{
  "command_id": "ebbf213c-8cff-49d5-92ac-1d2bee347139",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8a2b478e-513b-4063-8b93-7db84dd48b5c",
  "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
  "assignment_id": "189a70f3-8636-4a48-8cb5-abeb0e9ab02a",
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
    "id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:01:05.709893Z",
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
    "id": "c8097161-9589-451a-ace7-41fac0cee41c",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:01:02.563347Z",
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

`GET /api/operator/v1/orders/ae1abd76-1bb8-4cdc-bad8-c27f4926a073/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:01:05.710506Z",
      "actor": {
        "type": "CLIENT",
        "id": "b3e0ee9c-c87d-41f8-9da1-c87c74c98936",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
        "quote_id": "110bc446-a2b4-44a6-a50d-cab57c5f7d24",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "171c2108-d95d-474c-b695-9fb84f3391a3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:01:05.712965Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
        "attempt_id": "3d6fc34f-ac07-4965-8ed3-c9a11a4bfe65",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "171c2108-d95d-474c-b695-9fb84f3391a3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:01:05.720511Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cabb13d8-3005-42b9-8ef8-ce60811a35b4",
        "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "171c2108-d95d-474c-b695-9fb84f3391a3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:01:06.322046Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cabb13d8-3005-42b9-8ef8-ce60811a35b4",
        "order_id": "ae1abd76-1bb8-4cdc-bad8-c27f4926a073",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "ccec5ee5-3f37-4a05-8e23-4fa026df0a48"
      },
      "correlation_id": "84e86a3a-555f-42e8-90a4-3ab03a94a522"
```

Done: orders c8097161-9589-451a-ace7-41fac0cee41c, ae1abd76-1bb8-4cdc-bad8-c27f4926a073.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732329874",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "challenge_id": "1215eedd-ea2b-4857-98e6-c2fb36f84f7a",
  "expires_at": "2026-10-30T13:06:09.358483297Z",
  "resend_available_at": "2026-10-30T13:01:10.358483297Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732329874` → **200**

```json
{
  "phone": "+380732329874",
  "audience": "CLIENT",
  "code": "688431",
  "sent_at": "2026-10-30T13:01:09.36214297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1215eedd-ea2b-4857-98e6-c2fb36f84f7a",
  "code": "688431",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "session_id": "b3cd0ceb-bcf8-41cf-b0f4-68203eb735dc",
  "subject": {
    "type": "CLIENT",
    "id": "47d0faee-d93c-4c8d-9fc2-45c049673074"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0N2QwZmFlZS1kOTNjLTRjOGQtOWZjMi00NWMwNDk2NzMwNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTY5LCJpYXQiOjE3OTMzNjUyNjksImp0aSI6IjUxZjExZjU0LWE4NDYtNDNmNy1hYTkxLWM0YjEzOGJlMzFhZCIsInNpZCI6ImIzY2QwY2ViLWJjZjgtNDFjZi1iMGY0LTY4MjAzZWI3MzVkYyJ9.M82s3KNGYxsj_loFRUkrF_5_3ad7O4arfvWRKX7zym4",
  "access_expires_at": "2026-10-30T13:16:09.690818092Z",
  "refresh_token": "lqpPFY4e_9j_knxpMmFZK6CRqqrdxqw8eSwlGIvucqY",
  "refresh_expires_at": "2026-11-29T13:01:09.690240886Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "082ed800-d9a0-4d18-a345-b14e7b7863e2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e29bcdc1-78fd-42bb-a242-372b0a190f5b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e29bcdc1-78fd-42bb-a242-372b0a190f5b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d19a170f0cecde92307b743197ba2988",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e29bcdc1-78fd-42bb-a242-372b0a190f5b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732329874"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e29bcdc1-78fd-42bb-a242-372b0a190f5b",
  "expires_at": "2026-10-30T13:31:09.994061Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e29bcdc1-78fd-42bb-a242-372b0a190f5b` → **200**

```json
{
  "id": "e29bcdc1-78fd-42bb-a242-372b0a190f5b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:31:09.994061Z",
  "card": {
    "id": "c7b473b2-4554-450f-bf27-5f38f530bab7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5058",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:01:10.303703Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c7b473b2-4554-450f-bf27-5f38f530bab7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5058",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:01:10.303703Z"
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
  "device_ref": "sandbox-25945"
}
```

```json
{
  "challenge_id": "9c8bc07f-50a2-476e-a9f6-786e38c9170c",
  "expires_at": "2026-10-30T13:06:10.896071799Z",
  "resend_available_at": "2026-10-30T13:01:11.896071799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "173350",
  "sent_at": "2026-10-30T13:01:10.899071726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c8bc07f-50a2-476e-a9f6-786e38c9170c",
  "code": "173350",
  "device_ref": "sandbox-25945"
}
```

```json
{
  "session_id": "787b3b8f-1328-4688-bc5d-40779768d643",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE3MSwiaWF0IjoxNzkzMzY1MjcxLCJqdGkiOiI4OWM4Y2ZkNi0yYzRkLTQyOWMtOWVlMC0wZmFmNmNlODdlMzkiLCJzaWQiOiI3ODdiM2I4Zi0xMzI4LTQ2ODgtYmM1ZC00MDc3OTc2OGQ2NDMifQ.8v6HXCnTWxEJh1V4BylwXIEILkR3BuKGJmB_gMiDZ5Q",
  "access_expires_at": "2026-10-30T13:16:11.216999011Z",
  "refresh_token": "rWhnCawUreQGMd-EKFPxwTt8DaOj_NhKQGW4rUv881I",
  "refresh_expires_at": "2026-11-29T13:01:11.216336324Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:05.089449Z",
  "last_location_at": "2026-10-30T13:01:05.089449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/601cad39-e8d6-476d-8887-9f96c60b7db5/handover` → **200**

```json
{
  "command_id": "7bc370ef-6307-4ee9-b7d1-f9d20a68b523",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:05.089449Z",
  "last_location_at": "2026-10-30T13:01:05.089449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/601cad39-e8d6-476d-8887-9f96c60b7db5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:12Z",
    "sequence": 1793365272111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:12.13195Z",
  "last_location_at": "2026-10-30T13:01:12.13195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71a9c6cb-6a11-4737-913d-f618754f0869",
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
  "id": "ce03bb39-4246-47a3-ba0d-8a329d729982",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:12.432480Z",
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
  "command_id": "8535f5e1-e73d-48c5-ab26-8cc51f2dfd5b",
  "quote_id": "ce03bb39-4246-47a3-ba0d-8a329d729982",
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
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
  "created_at": "2026-10-30T13:01:12.73985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759` → **200**

```json
{
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
  "created_at": "2026-10-30T13:01:12.73985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759` → **200**

```json
{
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
  "created_at": "2026-10-30T13:01:12.73985Z",
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
    "id": "fcd58b76-482d-4e9f-9a75-1bc9da1bdac6",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "expires_at": "2026-10-30T13:01:28.382742Z",
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

`POST /api/driver/v1/offers/fcd58b76-482d-4e9f-9a75-1bc9da1bdac6/accept` → **200**

```json
{
  "command_id": "13425615-ec8e-44a4-9487-524c63de8b99"
}
```

```json
{
  "id": "d71831cd-f326-4b7b-a683-bdd68859df05",
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "assignment_id": "d71831cd-f326-4b7b-a683-bdd68859df05",
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

`POST /api/driver/v1/work-sessions/601cad39-e8d6-476d-8887-9f96c60b7db5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:15Z",
    "sequence": 1793365275529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:15.549152Z",
  "last_location_at": "2026-10-30T13:01:15.549152Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/29be4f2f-252c-450c-8160-0663ec2d5ccb/arrive` → **200**

```json
{
  "command_id": "bb6b20a1-e571-47e0-b7f0-fe5daf4a120e",
  "expected_version": 0
}
```

```json
{
  "id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "assignment_id": "d71831cd-f326-4b7b-a683-bdd68859df05",
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
  "arrived_at": "2026-10-30T13:01:15.856779Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29be4f2f-252c-450c-8160-0663ec2d5ccb/start` → **200**

```json
{
  "command_id": "5caf00f0-1c4d-4b9d-860c-5107c8aa16ac",
  "expected_version": 1
}
```

```json
{
  "id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "assignment_id": "d71831cd-f326-4b7b-a683-bdd68859df05",
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
  "arrived_at": "2026-10-30T13:01:15.856779Z",
  "started_at": "2026-10-30T13:01:16.173457Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29be4f2f-252c-450c-8160-0663ec2d5ccb/complete` → **200**

```json
{
  "command_id": "2e333d32-f3c7-43e0-be61-de5396757fd0",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:01:16Z",
  "cash_received": true
}
```

```json
{
  "id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "assignment_id": "d71831cd-f326-4b7b-a683-bdd68859df05",
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
  "arrived_at": "2026-10-30T13:01:15.856779Z",
  "started_at": "2026-10-30T13:01:16.173457Z",
  "completed_at": "2026-10-30T13:01:16.486885Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759` → **200**

```json
{
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
    "id": "d71831cd-f326-4b7b-a683-bdd68859df05",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:01:12.73985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759` → **200**

```json
{
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
    "id": "d71831cd-f326-4b7b-a683-bdd68859df05",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:01:12.73985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759` → **200**

```json
{
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
    "id": "d71831cd-f326-4b7b-a683-bdd68859df05",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:01:12.73985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759` → **200**

```json
{
  "id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
    "id": "d71831cd-f326-4b7b-a683-bdd68859df05",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "29be4f2f-252c-450c-8160-0663ec2d5ccb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:01:12.73985Z",
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

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759/tip` → **200**

```json
{
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
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
  "available_until": "2026-10-31T13:01:16.486885Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759/tip` → **201**

```json
{
  "command_id": "a553f13d-ad48-4acd-8054-a239b15a4970",
  "amount_minor": 2500
}
```

```json
{
  "id": "f52460bf-be11-43fd-9ea3-517c04d77638",
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:01:21.665823Z"
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759/tip` → **200**

```json
{
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
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
  "available_until": "2026-10-31T13:01:16.486885Z",
  "open": false,
  "tip": {
    "id": "f52460bf-be11-43fd-9ea3-517c04d77638",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:01:21.665823Z"
  }
}
```

`GET /api/rider/v1/orders/545d7d26-7c31-456d-a87d-8e561eaa1759/tip` → **200**

```json
{
  "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
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
  "available_until": "2026-10-31T13:01:16.486885Z",
  "open": false,
  "tip": {
    "id": "f52460bf-be11-43fd-9ea3-517c04d77638",
    "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:01:21.665823Z"
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
      "id": "f74cddfd-982a-40ba-b6ff-d1d30b5a2288",
      "at": "2026-10-30T13:01:23.529122Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
      "counterpart_id": null
    },
    {
      "id": "32ee38c2-d3c3-41ea-bfa6-60213392a7fa",
      "at": "2026-10-30T13:01:17.466937Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3f7e51f3-9603-423a-ab7d-fa9855010293",
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
  "id": "3729fddc-d5eb-4d6a-a4ce-6aacea143427",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:23.869007Z",
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
  "session_id": "8fedfe04-294a-4008-abda-5ef0eb43c6ba",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYxODQsImlhdCI6MTc5MzM2NTI4NCwianRpIjoiMDRjNGZkZWItOGI2ZC00ZTg0LWJhYjMtNzIyZjk4ZmI2ODU0Iiwic2lkIjoiOGZlZGZlMDQtMjk0YS00MDA4LWFiZGEtNWVmMGViNDNjNmJhIn0.Jncz63gjc3U3zMSBN3Qyd7oglXF-vANfYtZpAHO_e3c",
  "access_expires_at": "2026-10-30T13:16:24.467078596Z",
  "refresh_token": "EAbU3eTNRMbOMbUvL66hpXTkYScLvDfrGLXFczlvlpc",
  "refresh_expires_at": "2026-10-31T01:01:24.466513702Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732329874` → **200**

```json
{
  "client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074"
}
```

`POST /api/admin/v1/rider-wallets/47d0faee-d93c-4c8d-9fc2-45c049673074/top-ups` → **201**

```json
{
  "command_id": "d45012fd-c5a5-498d-abfb-12d524b86e65",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
      "id": "b58f0bdb-2b2f-4200-9665-5ca855eb213d",
      "at": "2026-10-30T13:01:25.047226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "12fe72d7-b6ab-4dcb-9c5f-1856cc9b8741",
  "quote_id": "3729fddc-d5eb-4d6a-a4ce-6aacea143427",
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
  "id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
  "created_at": "2026-10-30T13:01:25.363109Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0f9d426f-fb51-4894-ab22-a5630ce6f74f` → **200**

```json
{
  "id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
  "created_at": "2026-10-30T13:01:25.363109Z",
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
    "id": "32ba47d1-0397-4412-945c-4c54f1bc6899",
    "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
    "expires_at": "2026-10-30T13:01:40.369203Z",
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

`POST /api/driver/v1/offers/32ba47d1-0397-4412-945c-4c54f1bc6899/accept` → **200**

```json
{
  "command_id": "baec1299-d344-48cb-8801-6f46e16d6de6"
}
```

```json
{
  "id": "3b9f0117-4e91-4d4c-870f-ef58d3a1f3b7",
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "548ede35-ac1e-4391-998f-1d07f5524d88",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "548ede35-ac1e-4391-998f-1d07f5524d88",
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "assignment_id": "3b9f0117-4e91-4d4c-870f-ef58d3a1f3b7",
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

`POST /api/driver/v1/work-sessions/601cad39-e8d6-476d-8887-9f96c60b7db5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:26Z",
    "sequence": 1793365286872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:26.892861Z",
  "last_location_at": "2026-10-30T13:01:26.892861Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/548ede35-ac1e-4391-998f-1d07f5524d88/arrive` → **200**

```json
{
  "command_id": "50a4d43f-9a4a-43b7-8415-8b9f4ac2c1cd",
  "expected_version": 0
}
```

```json
{
  "id": "548ede35-ac1e-4391-998f-1d07f5524d88",
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "assignment_id": "3b9f0117-4e91-4d4c-870f-ef58d3a1f3b7",
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
  "arrived_at": "2026-10-30T13:01:27.196953Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/548ede35-ac1e-4391-998f-1d07f5524d88/start` → **200**

```json
{
  "command_id": "4480281d-0879-4f0f-a506-d2c80bfd91d6",
  "expected_version": 1
}
```

```json
{
  "id": "548ede35-ac1e-4391-998f-1d07f5524d88",
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "assignment_id": "3b9f0117-4e91-4d4c-870f-ef58d3a1f3b7",
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
  "arrived_at": "2026-10-30T13:01:27.196953Z",
  "started_at": "2026-10-30T13:01:27.499785Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/548ede35-ac1e-4391-998f-1d07f5524d88/complete` → **200**

```json
{
  "command_id": "5e74eb26-3bf8-4725-b519-a33cdea7d52f",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:01:27Z",
  "cash_received": true
}
```

```json
{
  "id": "548ede35-ac1e-4391-998f-1d07f5524d88",
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "assignment_id": "3b9f0117-4e91-4d4c-870f-ef58d3a1f3b7",
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
  "arrived_at": "2026-10-30T13:01:27.196953Z",
  "started_at": "2026-10-30T13:01:27.499785Z",
  "completed_at": "2026-10-30T13:01:27.811275Z",
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
  "client_id": "47d0faee-d93c-4c8d-9fc2-45c049673074",
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
      "id": "b58f0bdb-2b2f-4200-9665-5ca855eb213d",
      "at": "2026-10-30T13:01:25.047226Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
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

`GET /api/rider/v1/orders/0f9d426f-fb51-4894-ab22-a5630ce6f74f/tip` → **200**

```json
{
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
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
  "available_until": "2026-10-31T13:01:27.811275Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0f9d426f-fb51-4894-ab22-a5630ce6f74f/tip` → **201**

```json
{
  "command_id": "971451af-572a-415b-be5d-f21d77633f59",
  "amount_minor": 2500
}
```

```json
{
  "id": "9a2a15f9-cc44-43bf-ae48-990686aa1105",
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:01:28.994142Z"
}
```

`GET /api/rider/v1/orders/0f9d426f-fb51-4894-ab22-a5630ce6f74f/tip` → **200**

```json
{
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
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
  "available_until": "2026-10-31T13:01:27.811275Z",
  "open": false,
  "tip": {
    "id": "9a2a15f9-cc44-43bf-ae48-990686aa1105",
    "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:01:28.994142Z"
  }
}
```

`GET /api/rider/v1/orders/0f9d426f-fb51-4894-ab22-a5630ce6f74f/tip` → **200**

```json
{
  "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
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
  "available_until": "2026-10-31T13:01:27.811275Z",
  "open": false,
  "tip": {
    "id": "9a2a15f9-cc44-43bf-ae48-990686aa1105",
    "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:01:28.994142Z"
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
      "id": "83866ff3-9252-42e8-8531-e0be3fd58b1f",
      "at": "2026-10-30T13:01:30.608008Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
      "counterpart_id": null
    },
    {
      "id": "06d9f3d8-7b25-4acd-b700-7453c267940b",
      "at": "2026-10-30T13:01:28.575042Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0f9d426f-fb51-4894-ab22-a5630ce6f74f",
      "counterpart_id": null
    },
    {
      "id": "f74cddfd-982a-40ba-b6ff-d1d30b5a2288",
      "at": "2026-10-30T13:01:23.529122Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
      "counterpart_id": null
    },
    {
      "id": "32ee38c2-d3c3-41ea-bfa6-60213392a7fa",
      "at": "2026-10-30T13:01:17.466937Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "545d7d26-7c31-456d-a87d-8e561eaa1759",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "601cad39-e8d6-476d-8887-9f96c60b7db5",
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
  "last_heartbeat_at": "2026-10-30T13:01:26.892861Z",
  "last_location_at": "2026-10-30T13:01:26.892861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/601cad39-e8d6-476d-8887-9f96c60b7db5/close` → **200**

```json
{
  "command_id": "70cea3c1-c05d-40bb-b4b7-cfd7481dc168",
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

Done: card order 0f9d426f-fb51-4894-ab22-a5630ce6f74f.

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
  "phone": "+380738126831",
  "device_ref": "sandbox-19460"
}
```

```json
{
  "challenge_id": "9163bbd4-ac86-40b8-9798-17317af020ba",
  "expires_at": "2026-10-30T13:06:32.074917793Z",
  "resend_available_at": "2026-10-30T13:01:33.074917793Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738126831` → **200**

```json
{
  "phone": "+380738126831",
  "audience": "CLIENT",
  "code": "346811",
  "sent_at": "2026-10-30T13:01:32.077922829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9163bbd4-ac86-40b8-9798-17317af020ba",
  "code": "346811",
  "device_ref": "sandbox-19460"
}
```

```json
{
  "session_id": "de12a169-a026-4ba5-b3c7-7d2b867d8dd7",
  "subject": {
    "type": "CLIENT",
    "id": "aaec792c-1261-495f-8668-d292b1c49642"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVjNzkyYy0xMjYxLTQ5NWYtODY2OC1kMjkyYjFjNDk2NDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTkyLCJpYXQiOjE3OTMzNjUyOTIsImp0aSI6IjhjODMyZmZkLTliMzMtNDMzOS05OGE3LThkMDkzNTQyZDE5MSIsInNpZCI6ImRlMTJhMTY5LWEwMjYtNGJhNS1iM2M3LTdkMmI4NjdkOGRkNyJ9.aLUwCeqg9ny3y0tMS-pI6JShbfMWCKMwvKkru6Kj-fE",
  "access_expires_at": "2026-10-30T13:16:32.394046591Z",
  "refresh_token": "nnOcSO57i3WzkEqoRNreJ4dRVK5fCZjXrWbq0W98hQM",
  "refresh_expires_at": "2026-11-29T13:01:32.393489721Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "bab20c9a-218c-4a2a-b45d-84bc94b1569b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "281718e8-0bc5-4015-a28e-35a3b3359d8b",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-281718e8-0bc5-4015-a28e-35a3b3359d8b",
    "orderDate": "1793365292",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "65c38bbb5084d5eeb97357dc9eb7b012",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=281718e8-0bc5-4015-a28e-35a3b3359d8b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738126831"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=281718e8-0bc5-4015-a28e-35a3b3359d8b",
  "created_at": "2026-10-30T13:01:32.686726Z",
  "expires_at": "2026-10-30T13:31:32.686726Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/281718e8-0bc5-4015-a28e-35a3b3359d8b` → **200**

```json
{
  "id": "281718e8-0bc5-4015-a28e-35a3b3359d8b",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:01:32.686726Z",
  "expires_at": "2026-10-30T13:31:32.686726Z",
  "completed_at": "2026-10-30T13:01:32.980653Z",
  "masked_pan": "41****8781",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "aaec792c-1261-495f-8668-d292b1c49642",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "aaec792c-1261-495f-8668-d292b1c49642",
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
      "id": "a540cdd1-7266-46e9-bc37-eaf2547771cd",
      "at": "2026-10-30T13:01:33.624182Z",
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
  "client_id": "aaec792c-1261-495f-8668-d292b1c49642",
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
      "id": "a540cdd1-7266-46e9-bc37-eaf2547771cd",
      "at": "2026-10-30T13:01:33.624182Z",
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
  "device_ref": "sandbox-30274"
}
```

```json
{
  "challenge_id": "cd314ca0-f09a-4ff1-b765-0c8a13754eae",
  "expires_at": "2026-10-30T13:06:35.157395221Z",
  "resend_available_at": "2026-10-30T13:01:36.157395221Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "409080",
  "sent_at": "2026-10-30T13:01:35.160634393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd314ca0-f09a-4ff1-b765-0c8a13754eae",
  "code": "409080",
  "device_ref": "sandbox-30274"
}
```

```json
{
  "session_id": "6fb01649-3959-4d8c-95b6-0baa953afb99",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE5NSwiaWF0IjoxNzkzMzY1Mjk1LCJqdGkiOiIxNTAyMWJmYS05YTk1LTRmODgtOTUzZi0zODkyMTcwNTFkNDMiLCJzaWQiOiI2ZmIwMTY0OS0zOTU5LTRkOGMtOTViNi0wYmFhOTUzYWZiOTkifQ.3_X_Tq6qHXRruYF1BIHueWJodBeZN22x3O_RQVX7pII",
  "access_expires_at": "2026-10-30T13:16:35.485747952Z",
  "refresh_token": "_-BCTHidsGMBE9wUk2xKScmm594fHtpacjfJbHVWKrs",
  "refresh_expires_at": "2026-11-29T13:01:35.485193154Z",
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
  "command_id": "96ad6de2-3950-4b40-a6fa-78cd84f452b2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "339baf0a-91bb-455a-98ae-d3951d9004e4",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-339baf0a-91bb-455a-98ae-d3951d9004e4",
    "orderDate": "1793365296",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "921f63796a34d278c51135ed4b3cae1c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=339baf0a-91bb-455a-98ae-d3951d9004e4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=339baf0a-91bb-455a-98ae-d3951d9004e4",
  "created_at": "2026-10-30T13:01:36.053668Z",
  "expires_at": "2026-10-30T13:31:36.053668Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/339baf0a-91bb-455a-98ae-d3951d9004e4` → **200**

```json
{
  "id": "339baf0a-91bb-455a-98ae-d3951d9004e4",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:01:36.053668Z",
  "expires_at": "2026-10-30T13:31:36.053668Z",
  "completed_at": "2026-10-30T13:01:36.397242Z",
  "masked_pan": "41****6390",
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
      "id": "e8b49272-7de1-45cc-93ca-3c9b8d8a2c1e",
      "at": "2026-10-30T13:01:36.634924Z",
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
  "command_id": "f86ced2b-340c-42fc-aabf-4aac3fb8b9d4",
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
  "correlation_id": "1dd6586d-34e2-40a0-872c-b89b29613ccc"
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
  "device_ref": "sandbox-27419"
}
```

```json
{
  "challenge_id": "1458d74d-4caa-4f9f-a3e9-9bb4ec29430b",
  "expires_at": "2026-10-30T13:06:37.404965023Z",
  "resend_available_at": "2026-10-30T13:01:38.404965023Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "140559",
  "sent_at": "2026-10-30T13:01:37.407797155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1458d74d-4caa-4f9f-a3e9-9bb4ec29430b",
  "code": "140559",
  "device_ref": "sandbox-27419"
}
```

```json
{
  "session_id": "772eb032-3255-4d93-b6b0-237f8f07cbd8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjE5NywiaWF0IjoxNzkzMzY1Mjk3LCJqdGkiOiJlYjg2YmNhMC02ZjkxLTQxZWItOTI3Mi0wYWE5MzFmZTgzZGEiLCJzaWQiOiI3NzJlYjAzMi0zMjU1LTRkOTMtYjZiMC0yMzdmOGYwN2NiZDgifQ.09s3XTO6_THdOESou8dkvgUorOekPjWGgyZs3g8S_k4",
  "access_expires_at": "2026-10-30T13:16:37.724534901Z",
  "refresh_token": "8kdudAGn47rTWgC0U-524j7Gc6mRwLhIP0Z4owgqM2U",
  "refresh_expires_at": "2026-11-29T13:01:37.723990014Z",
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
  "command_id": "17fa4567-4121-4b1f-bc7a-cca675a87f45",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:38Z",
    "sequence": 1793365298292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f61486c1-3b00-4251-9c3f-33fc493d0aa3",
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
  "last_heartbeat_at": "2026-10-30T13:01:38.312315Z",
  "last_location_at": "2026-10-30T13:01:38.312315Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632214256",
  "device_ref": "sandbox-24107"
}
```

```json
{
  "challenge_id": "bdfd06a8-0de0-46de-bf0d-758d29fbd168",
  "expires_at": "2026-10-30T13:06:38.60582654Z",
  "resend_available_at": "2026-10-30T13:01:39.60582654Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632214256` → **200**

```json
{
  "phone": "+380632214256",
  "audience": "CLIENT",
  "code": "212830",
  "sent_at": "2026-10-30T13:01:38.608856384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdfd06a8-0de0-46de-bf0d-758d29fbd168",
  "code": "212830",
  "device_ref": "sandbox-24107"
}
```

```json
{
  "session_id": "c1e33ef0-6c72-4d13-884c-33ddf5f16fca",
  "subject": {
    "type": "CLIENT",
    "id": "6da00501-e5fc-4210-9f44-1f796c20c26a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZGEwMDUwMS1lNWZjLTQyMTAtOWY0NC0xZjc5NmMyMGMyNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MTk4LCJpYXQiOjE3OTMzNjUyOTgsImp0aSI6IjNiZDY2NTdjLWQzNjUtNGZlMS1hNjE3LTdjZTEwZWMwM2Q0ZiIsInNpZCI6ImMxZTMzZWYwLTZjNzItNGQxMy04ODRjLTMzZGRmNWYxNmZjYSJ9.tZ83DwjuzAkt9900czx_tZgFysQ1Vt-iF-dsdhq88GM",
  "access_expires_at": "2026-10-30T13:16:38.9326966Z",
  "refresh_token": "dJ9paDRzFgIqBtFTcJXGVURFiHba0DFjPmWIY7FHWBk",
  "refresh_expires_at": "2026-11-29T13:01:38.932142705Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f342be4a-0fc9-41e7-bbbd-01fe80346334",
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
  "id": "127b1d13-15ff-495d-9676-f1d7a874a192",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:39.232147Z",
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
  "command_id": "681911ef-8212-4c10-b7f6-977ece203000",
  "quote_id": "127b1d13-15ff-495d-9676-f1d7a874a192",
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
  "id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6da00501-e5fc-4210-9f44-1f796c20c26a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:01:39.547556Z",
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
    "id": "59e89894-1abb-4f05-91a4-cc9e25049f0e",
    "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
    "expires_at": "2026-10-30T13:01:54.551005Z",
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

`POST /api/driver/v1/offers/59e89894-1abb-4f05-91a4-cc9e25049f0e/accept` → **200**

```json
{
  "command_id": "e82d5357-f97b-4e29-8d24-278a77767131"
}
```

```json
{
  "id": "d668e855-1389-4350-a4da-9cb14b12b056",
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ca71f314-87c7-4632-8286-58d52edf7c82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ca71f314-87c7-4632-8286-58d52edf7c82",
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "assignment_id": "d668e855-1389-4350-a4da-9cb14b12b056",
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

`POST /api/driver/v1/work-sessions/f61486c1-3b00-4251-9c3f-33fc493d0aa3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:40Z",
    "sequence": 1793365300736
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f61486c1-3b00-4251-9c3f-33fc493d0aa3",
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
  "last_heartbeat_at": "2026-10-30T13:01:40.755806Z",
  "last_location_at": "2026-10-30T13:01:40.755806Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ca71f314-87c7-4632-8286-58d52edf7c82/arrive` → **200**

```json
{
  "command_id": "1f33119e-eca4-47e5-946d-1898e8f29f9d",
  "expected_version": 0
}
```

```json
{
  "id": "ca71f314-87c7-4632-8286-58d52edf7c82",
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "assignment_id": "d668e855-1389-4350-a4da-9cb14b12b056",
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
  "arrived_at": "2026-10-30T13:01:41.058131Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ca71f314-87c7-4632-8286-58d52edf7c82/start` → **200**

```json
{
  "command_id": "a25a13ad-36ba-4def-aa56-0f8ea709b34f",
  "expected_version": 1
}
```

```json
{
  "id": "ca71f314-87c7-4632-8286-58d52edf7c82",
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "assignment_id": "d668e855-1389-4350-a4da-9cb14b12b056",
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
  "arrived_at": "2026-10-30T13:01:41.058131Z",
  "started_at": "2026-10-30T13:01:41.365964Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ca71f314-87c7-4632-8286-58d52edf7c82/complete` → **200**

```json
{
  "command_id": "24181cf7-1b4f-4258-bf55-49c7168f0e3f",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:01:41Z",
  "cash_received": false
}
```

```json
{
  "id": "ca71f314-87c7-4632-8286-58d52edf7c82",
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "assignment_id": "d668e855-1389-4350-a4da-9cb14b12b056",
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
  "arrived_at": "2026-10-30T13:01:41.058131Z",
  "started_at": "2026-10-30T13:01:41.365964Z",
  "completed_at": "2026-10-30T13:01:41.671778Z",
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
  "session_id": "09c4ef30-d713-4a7a-a18c-e5c3d0f7ee8c",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyMDIsImlhdCI6MTc5MzM2NTMwMiwianRpIjoiNDM2YzkwOGYtZDM0Mi00M2M4LTg4NDctYTU2MjQ4ZTY0YzdmIiwic2lkIjoiMDljNGVmMzAtZDcxMy00YTdhLWExOGMtZTVjM2QwZjdlZThjIn0.7VbhuNutWJuk9dpI0HLeEMMRrE1wMFmXO-dsShX-b0o",
  "access_expires_at": "2026-10-30T13:16:42.277996991Z",
  "refresh_token": "-sADux1W-voq-cS3RVrZyjeb610ylR4aaT2na6-2OP8",
  "refresh_expires_at": "2026-10-31T01:01:42.277415564Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/851c721d-73cf-41c5-8929-761c0f1a0fb3/cash-dispute` → **200**

```json
{
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "6da00501-e5fc-4210-9f44-1f796c20c26a",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:01:41.713468Z",
  "decide_by": "2026-11-13T13:01:41.713468Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:01:41.713468Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "6da00501-e5fc-4210-9f44-1f796c20c26a",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:01:41.713468Z",
      "decide_by": "2026-11-13T13:01:41.713468Z",
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

`POST /api/admin/v1/orders/851c721d-73cf-41c5-8929-761c0f1a0fb3/cash-dispute/decide` → **400**

```json
{
  "command_id": "58ca5830-1f54-4883-b1c2-553ac19aded8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/851c721d-73cf-41c5-8929-761c0f1a0fb3/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "277530cb-9ba4-4134-bd6f-81d2bc4630e4",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/851c721d-73cf-41c5-8929-761c0f1a0fb3/cash-dispute/decide` → **200**

```json
{
  "command_id": "c64fdfa9-2473-47f7-b863-6ea6b230457f",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "6da00501-e5fc-4210-9f44-1f796c20c26a",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:01:41.713468Z",
  "decide_by": "2026-11-13T13:01:41.713468Z",
  "decision": "PAY_DRIVER",
  "decided_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:01:43.4934Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/851c721d-73cf-41c5-8929-761c0f1a0fb3/cash-dispute/decide` → **409**

```json
{
  "command_id": "4615dbe0-2e1b-4781-8695-7fa7a82ade01",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/851c721d-73cf-41c5-8929-761c0f1a0fb3/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d295478d-0f8e-41e6-896e-359dba7dec99"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f61486c1-3b00-4251-9c3f-33fc493d0aa3",
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
  "last_heartbeat_at": "2026-10-30T13:01:40.755806Z",
  "last_location_at": "2026-10-30T13:01:40.755806Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f61486c1-3b00-4251-9c3f-33fc493d0aa3/close` → **200**

```json
{
  "command_id": "54f0aba7-f78a-4ce2-9254-6b88c6f9710a",
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
  "phone": "+380737254013",
  "device_ref": "sandbox-12000"
}
```

```json
{
  "challenge_id": "9c6ac756-dca4-4bb4-8277-a03e98b112ad",
  "expires_at": "2026-10-30T13:06:44.692018856Z",
  "resend_available_at": "2026-10-30T13:01:45.692018856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737254013` → **200**

```json
{
  "phone": "+380737254013",
  "audience": "CLIENT",
  "code": "884657",
  "sent_at": "2026-10-30T13:01:44.695478838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c6ac756-dca4-4bb4-8277-a03e98b112ad",
  "code": "884657",
  "device_ref": "sandbox-12000"
}
```

```json
{
  "session_id": "1fea20e5-3ac5-4557-9ae3-0e66766b739b",
  "subject": {
    "type": "CLIENT",
    "id": "a4aff2a3-587d-4424-aa3e-da6236e390f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGFmZjJhMy01ODdkLTQ0MjQtYWEzZS1kYTYyMzZlMzkwZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjA1LCJpYXQiOjE3OTMzNjUzMDUsImp0aSI6ImJjYThiMmFlLWRiYmUtNDk4OC04MWMzLThjMDA2Y2JkOWQ2MCIsInNpZCI6IjFmZWEyMGU1LTNhYzUtNDU1Ny05YWUzLTBlNjY3NjZiNzM5YiJ9.r1mCWtMfKXxYSD2WdcXEVYNkSWJp6F1PgFtotUU_65I",
  "access_expires_at": "2026-10-30T13:16:45.026326192Z",
  "refresh_token": "-eFXGSc88SDfvBpNPmOFe22wXWcx5wLjxQLaoai0dTs",
  "refresh_expires_at": "2026-11-29T13:01:45.025818133Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e1fe732c-b6af-4cf9-a5da-449e55a914d7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3f7b8239-c447-4c9a-9f3b-e6bf1f281530",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3f7b8239-c447-4c9a-9f3b-e6bf1f281530",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "cc9b2db375d89089327bd1be4a8a4ebc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3f7b8239-c447-4c9a-9f3b-e6bf1f281530",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737254013"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3f7b8239-c447-4c9a-9f3b-e6bf1f281530",
  "expires_at": "2026-10-30T13:31:45.318743Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3f7b8239-c447-4c9a-9f3b-e6bf1f281530` → **200**

```json
{
  "id": "3f7b8239-c447-4c9a-9f3b-e6bf1f281530",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:31:45.318743Z",
  "card": {
    "id": "d7d467b2-87d0-4a16-b749-28a30b9e0c17",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2243",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:01:45.608882Z"
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
  "device_ref": "sandbox-30460"
}
```

```json
{
  "challenge_id": "108751e5-cf6f-4e68-a4af-5d6fbb78ca3e",
  "expires_at": "2026-10-30T13:06:45.918891481Z",
  "resend_available_at": "2026-10-30T13:01:46.918891481Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "180756",
  "sent_at": "2026-10-30T13:01:45.922613138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "108751e5-cf6f-4e68-a4af-5d6fbb78ca3e",
  "code": "180756",
  "device_ref": "sandbox-30460"
}
```

```json
{
  "session_id": "ad1563bd-b87a-4d58-8220-fb2b4336e91e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjIwNiwiaWF0IjoxNzkzMzY1MzA2LCJqdGkiOiIwOThkODMxMC04YzdlLTQxNjUtYTZkYy1kZjM1MTJkYjBlMzUiLCJzaWQiOiJhZDE1NjNiZC1iODdhLTRkNTgtODIyMC1mYjJiNDMzNmU5MWUifQ.pi5olf_uafMc7-4iK-Mm11hOJJNROsXTd1Kei5gSYuM",
  "access_expires_at": "2026-10-30T13:16:46.244903314Z",
  "refresh_token": "fCoMLbMAew_2Kl1i6bzZ_HYOn0DymYaqlntp9hyjc_U",
  "refresh_expires_at": "2026-11-29T13:01:46.244321665Z",
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
  "command_id": "3bed6e28-d2b5-4301-8e83-09650d3a3a98",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:46Z",
    "sequence": 1793365306826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c7b8da59-48ad-472e-ae88-4a031a2ed13a",
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
  "last_heartbeat_at": "2026-10-30T13:01:46.8456Z",
  "last_location_at": "2026-10-30T13:01:46.8456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "22bb77ba-a074-4a03-8973-2b0c87adf053",
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
  "id": "8fbb3ddf-47c6-4940-96cd-de05db667311",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:06:47.166508Z",
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
  "command_id": "70af197a-c1bf-4b59-ae56-eb3964d94ce7",
  "quote_id": "8fbb3ddf-47c6-4940-96cd-de05db667311",
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
  "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
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
  "created_at": "2026-10-30T13:01:47.476798Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58` → **200**

```json
{
  "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
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
  "created_at": "2026-10-30T13:01:47.476798Z",
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
    "id": "cf6e4689-033c-476d-8369-98c071530ffe",
    "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
    "expires_at": "2026-10-30T13:02:02.765273Z",
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

`POST /api/driver/v1/offers/cf6e4689-033c-476d-8369-98c071530ffe/accept` → **200**

```json
{
  "command_id": "e07db128-c24b-4351-bd20-397b934ceba8"
}
```

```json
{
  "id": "e0e620fb-ab51-4780-a04f-4665c919583b",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0957765b-47eb-41df-8ebe-969ad4361c61",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0957765b-47eb-41df-8ebe-969ad4361c61",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "assignment_id": "e0e620fb-ab51-4780-a04f-4665c919583b",
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

`POST /api/rider/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/messages` → **201**

```json
{
  "command_id": "7140914c-a233-45ed-8e74-8eef5f047c99",
  "body": "Я біля входу, мій номер +380737254013, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "d5961961-36a4-48b7-9c57-af9efa0c56ac",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737254013, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:01:48.982093843Z"
}
```

`POST /api/driver/v1/trips/0957765b-47eb-41df-8ebe-969ad4361c61/messages` → **201**

```json
{
  "command_id": "21eace29-5b91-40aa-a955-108b8ad7fff0",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "7da0cc6e-38c2-4997-a8d1-e2dfdf628ad0",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:01:49.273988609Z"
}
```

`POST /api/driver/v1/work-sessions/c7b8da59-48ad-472e-ae88-4a031a2ed13a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:49Z",
    "sequence": 1793365309556
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c7b8da59-48ad-472e-ae88-4a031a2ed13a",
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
  "last_heartbeat_at": "2026-10-30T13:01:49.575306Z",
  "last_location_at": "2026-10-30T13:01:49.575306Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0957765b-47eb-41df-8ebe-969ad4361c61/arrive` → **200**

```json
{
  "command_id": "890b3c6f-911c-4c7e-b7cb-d3bf2f32254e",
  "expected_version": 0
}
```

```json
{
  "id": "0957765b-47eb-41df-8ebe-969ad4361c61",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "assignment_id": "e0e620fb-ab51-4780-a04f-4665c919583b",
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
  "arrived_at": "2026-10-30T13:01:49.875951Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0957765b-47eb-41df-8ebe-969ad4361c61/start` → **200**

```json
{
  "command_id": "4fccf1b8-95ea-4435-af2b-e6d910a0e7b9",
  "expected_version": 1
}
```

```json
{
  "id": "0957765b-47eb-41df-8ebe-969ad4361c61",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "assignment_id": "e0e620fb-ab51-4780-a04f-4665c919583b",
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
  "arrived_at": "2026-10-30T13:01:49.875951Z",
  "started_at": "2026-10-30T13:01:50.189403Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c7b8da59-48ad-472e-ae88-4a031a2ed13a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:01:50Z",
    "sequence": 1793365310470
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c7b8da59-48ad-472e-ae88-4a031a2ed13a",
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
  "last_heartbeat_at": "2026-10-30T13:01:50.489655Z",
  "last_location_at": "2026-10-30T13:01:50.489655Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/0957765b-47eb-41df-8ebe-969ad4361c61/complete` → **200**

```json
{
  "command_id": "ff1942e2-cd20-44e5-befd-f4320551fa84",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:01:50Z",
  "cash_received": false
}
```

```json
{
  "id": "0957765b-47eb-41df-8ebe-969ad4361c61",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "assignment_id": "e0e620fb-ab51-4780-a04f-4665c919583b",
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
  "arrived_at": "2026-10-30T13:01:49.875951Z",
  "started_at": "2026-10-30T13:01:50.189403Z",
  "completed_at": "2026-10-30T13:01:50.789319Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58` → **200**

```json
{
  "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
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
    "id": "e0e620fb-ab51-4780-a04f-4665c919583b",
    "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0957765b-47eb-41df-8ebe-969ad4361c61",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:01:47.476798Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58` → **200**

```json
{
  "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
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
    "id": "e0e620fb-ab51-4780-a04f-4665c919583b",
    "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0957765b-47eb-41df-8ebe-969ad4361c61",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:01:47.476798Z",
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
  "session_id": "c7b8da59-48ad-472e-ae88-4a031a2ed13a",
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
  "last_heartbeat_at": "2026-10-30T13:01:50.489655Z",
  "last_location_at": "2026-10-30T13:01:50.489655Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7b8da59-48ad-472e-ae88-4a031a2ed13a/close` → **200**

```json
{
  "command_id": "1e80dbe8-2496-4b38-9c78-e423a2f25ef5",
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
  "session_id": "4fdf2834-2e56-4021-949d-16636f4896c3",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyMTMsImlhdCI6MTc5MzM2NTMxMywianRpIjoiM2ZhMjM5MGItYTRhOC00OTg2LTk3M2UtZTMyOWEzMGJmNTQwIiwic2lkIjoiNGZkZjI4MzQtMmU1Ni00MDIxLTk0OWQtMTY2MzZmNDg5NmMzIn0.gBlsPUCdQNmOA8TTKL4eFoVEqmsW5R9aw2NrATnP1ig",
  "access_expires_at": "2026-10-30T13:16:53.587346378Z",
  "refresh_token": "uQKdHj0KVl8SrHexDRrFYL8EGbL9deC3qiP8HQL9l74",
  "refresh_expires_at": "2026-10-31T01:01:53.586772153Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7d91009d-6448-40fb-93d9-f81cf6c2d334"
}
```

`GET /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T13:01:54.179356007Z",
  "order": {
    "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
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
    "created_at": "2026-10-30T13:01:47.476798Z",
    "assigned_at": "2026-10-30T13:01:48.382745Z",
    "arrived_at": "2026-10-30T13:01:49.875951Z",
    "started_at": "2026-10-30T13:01:50.189403Z",
    "completed_at": "2026-10-30T13:01:50.789319Z"
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
    "id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
    "registered_at": "2026-10-30T13:01:45.024121Z",
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
      "created_at": "2026-10-30T13:01:47.480338Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T13:01:50.827952Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks` → **422**

```json
{
  "command_id": "31b83eef-5ea2-475b-97ea-c5983d907649",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "962ccabf-8696-49ae-b15c-ad55c82e9148"
}
```

`POST /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks` → **201**

```json
{
  "command_id": "ffd01d4c-33ac-4123-b811-6f510efaceda",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "fb1e1073-828f-4b04-8eec-8bd712109e1a",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:01:54.842907Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks` → **201**

```json
{
  "command_id": "ffd01d4c-33ac-4123-b811-6f510efaceda",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "fb1e1073-828f-4b04-8eec-8bd712109e1a",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:01:54.842907Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/a4aff2a3-587d-4424-aa3e-da6236e390f1` → **200**

```json
{
  "client": {
    "id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
    "phone": "+380737254013",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:01:45.024121Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:01:47.476798Z",
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

`POST /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks/fb1e1073-828f-4b04-8eec-8bd712109e1a/resolve` → **200**

```json
{
  "command_id": "d188d05a-4b98-4772-ab7f-d3041b3b6461",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "fb1e1073-828f-4b04-8eec-8bd712109e1a",
  "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T13:01:54.842907Z",
  "resolved_at": "2026-10-30T13:01:55.79884Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/a4aff2a3-587d-4424-aa3e-da6236e390f1` → **200**

```json
{
  "client": {
    "id": "a4aff2a3-587d-4424-aa3e-da6236e390f1",
    "phone": "+380737254013",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:01:45.024121Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:01:47.476798Z",
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

`POST /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks/fb1e1073-828f-4b04-8eec-8bd712109e1a/resolve` → **409**

```json
{
  "command_id": "f51bf3d7-e41b-461f-8a93-c68a3cb109c6",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks/fb1e1073-828f-4b04-8eec-8bd712109e1a/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1817a49a-40e6-4c90-979d-614117f87b7d"
}
```

`GET /api/admin/v1/orders/e233b1a3-251e-4ecf-8d34-7baad149ba58/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "fb1e1073-828f-4b04-8eec-8bd712109e1a",
      "order_id": "e233b1a3-251e-4ecf-8d34-7baad149ba58",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T13:01:54.842907Z",
      "resolved_at": "2026-10-30T13:01:55.79884Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order e233b1a3-251e-4ecf-8d34-7baad149ba58 without phone or card digits; chargeback fb1e1073-828f-4b04-8eec-8bd712109e1a recorded and won.

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
  "session_id": "bbab0c49-7b7d-42c5-87fa-b15878782761",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyMTcsImlhdCI6MTc5MzM2NTMxNywianRpIjoiYTdiMjcwZGUtZjk3NS00Y2RmLTg0OGUtYWFjYThhY2YzN2ViIiwic2lkIjoiYmJhYjBjNDktN2I3ZC00MmM1LTg3ZmEtYjE1ODc4NzgyNzYxIn0.yYk38Ktuw3TTclTW-23qTN3XQ6h426G4aDO-LeYKG9s",
  "access_expires_at": "2026-10-30T13:16:57.647593549Z",
  "refresh_token": "ifEa_N5pSr7-QTQA3l0AlVleCzUF3aH5PXBm5bEjYCg",
  "refresh_expires_at": "2026-10-31T01:01:57.647085729Z",
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
  "phone": "+48600698269",
  "device_ref": "sandbox-28688"
}
```

```json
{
  "challenge_id": "7a42c6bd-c9be-4c32-9f69-eb8f8d7b0d46",
  "expires_at": "2026-10-30T13:06:58.546608315Z",
  "resend_available_at": "2026-10-30T13:01:59.546608315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600698269` → **200**

```json
{
  "phone": "+48600698269",
  "audience": "CLIENT",
  "code": "457352",
  "sent_at": "2026-10-30T13:01:58.549237642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a42c6bd-c9be-4c32-9f69-eb8f8d7b0d46",
  "code": "457352",
  "device_ref": "sandbox-28688"
}
```

```json
{
  "session_id": "7c67033e-5df7-4093-a513-8dc5ad049044",
  "subject": {
    "type": "CLIENT",
    "id": "9591c808-18e1-40d9-94ca-a1a554073e60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTkxYzgwOC0xOGUxLTQwZDktOTRjYS1hMWE1NTQwNzNlNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjE4LCJpYXQiOjE3OTMzNjUzMTgsImp0aSI6IjA5Y2IwZWU2LTMwYzktNDVlYS1hN2JjLTVkZDFkYWEyYmE2ZiIsInNpZCI6IjdjNjcwMzNlLTVkZjctNDA5My1hNTEzLThkYzVhZDA0OTA0NCJ9.5_D3NCyn_WziNhXn48Vm9T4udMLOQoA5xhMXT35tRR8",
  "access_expires_at": "2026-10-30T13:16:58.864329037Z",
  "refresh_token": "8RRm2n-n20kL393F2Pcb1g3IT2g92iTR8-oPmbNqGr0",
  "refresh_expires_at": "2026-11-29T13:01:58.863850752Z",
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
  "command_id": "a2029864-8a27-4d6a-8e1a-f90a3eaaba1d",
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
  "correlation_id": "894b6404-b3eb-4ad3-865b-87151d2e5c5a",
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
  "command_id": "2adddea8-3d1a-4a0f-8e36-413a8b98220a",
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
  "paused_at": "2026-10-30T13:02:00.037830319Z",
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
  "command_id": "f492d345-11cc-4753-abf1-d36ac39ab078",
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
  "id": "a3f2b122-89e0-4eb7-a1fc-7393f167e15b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:00.650753Z",
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
  "command_id": "1bac5a57-5ebd-4883-ac77-ff1f2af64bb9",
  "quote_id": "a3f2b122-89e0-4eb7-a1fc-7393f167e15b",
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
  "correlation_id": "bd9a8780-c27d-43bf-9b1e-eda6cc1f9741"
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
  "paused_at": "2026-10-30T13:02:00.03783Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "3d6bc10e-d4e5-4bf6-a8ee-b56a955b10a5",
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
  "command_id": "da4b9f3c-39b0-4dc2-9766-1d8e0353a27b",
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
  "command_id": "d7447435-229d-4f7d-a4c3-b775e3579716",
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
  "id": "b06651f7-0fe1-46ea-b2fa-7a330febceb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:02.446032Z",
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
  "command_id": "d54fb1f6-b27a-48f8-8a61-e7d37d6c8538",
  "quote_id": "b06651f7-0fe1-46ea-b2fa-7a330febceb9",
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
  "correlation_id": "ca64895d-111a-4593-b22f-695f476e6c9e"
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
  "command_id": "62c5e618-d840-4f59-8da9-26885e9551a8",
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
  "command_id": "2f9dbfb7-8dc5-4bd1-8d54-5b9f79867e3b",
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
  "id": "11dba5f4-68c3-4182-af44-01a5167c5c25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:03.638668Z",
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
  "command_id": "71d84ed3-7012-4019-a2d4-e072f18b5891",
  "quote_id": "11dba5f4-68c3-4182-af44-01a5167c5c25",
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
  "correlation_id": "59e2efbf-a8db-472a-943b-0d2517428cca"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "bf00da5f-4545-48cf-a33e-839d69741bd3",
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
  "correlation_id": "2256dd8d-3127-4c39-a2bc-88bd7fadc94d"
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
  "command_id": "281c819b-1c33-4e65-8ebc-e6dc37b242bd",
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
  "phone": "+380673122348",
  "device_ref": "sandbox-10968"
}
```

```json
{
  "challenge_id": "668b815e-e863-4e16-98c7-69682e39f6a7",
  "expires_at": "2026-10-30T13:07:05.147529421Z",
  "resend_available_at": "2026-10-30T13:02:06.147529421Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673122348` → **200**

```json
{
  "phone": "+380673122348",
  "audience": "CLIENT",
  "code": "396267",
  "sent_at": "2026-10-30T13:02:05.150217288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "668b815e-e863-4e16-98c7-69682e39f6a7",
  "code": "396267",
  "device_ref": "sandbox-10968"
}
```

```json
{
  "session_id": "736524f7-0935-4f51-afc2-507a5a19c7b5",
  "subject": {
    "type": "CLIENT",
    "id": "72deb66f-5c5c-4aa3-8dde-0db806d8c616"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmRlYjY2Zi01YzVjLTRhYTMtOGRkZS0wZGI4MDZkOGM2MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjI1LCJpYXQiOjE3OTMzNjUzMjUsImp0aSI6ImE0MmNmNzkzLTZjNzYtNGY4YS04NGJiLTk2ZTVhNDYxNmYzNiIsInNpZCI6IjczNjUyNGY3LTA5MzUtNGY1MS1hZmMyLTUwN2E1YTE5YzdiNSJ9.gf1IU-8FwcOUVRWdxCEkeAXKBMT9_TVWlwVwINShdoM",
  "access_expires_at": "2026-10-30T13:17:05.468981006Z",
  "refresh_token": "RFo665WBEngC9ZaF7zdtn7-KKQ9QXUJTtpC4gjKWl4A",
  "refresh_expires_at": "2026-11-29T13:02:05.468466684Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "72deb66f-5c5c-4aa3-8dde-0db806d8c616",
  "session_id": "736524f7-0935-4f51-afc2-507a5a19c7b5",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a944291b-da66-4fd9-aa4e-8c2721983707",
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
  "id": "b1ebcbe8-5316-44a9-b3ab-484519571504",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:06.046234Z",
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
  "challenge_id": "f4634fea-a5c1-4eb7-b98b-421047f1a8c3",
  "expires_at": "2026-10-30T13:07:08.346861947Z",
  "resend_available_at": "2026-10-30T13:02:09.346861947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673122348` → **200**

```json
{
  "phone": "+380673122348",
  "audience": "CLIENT",
  "code": "366324",
  "sent_at": "2026-10-30T13:02:08.349304948Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "120427c5-753c-4229-a19d-79045f08ec28",
  "challenge_id": "f4634fea-a5c1-4eb7-b98b-421047f1a8c3",
  "otp_code": "366324"
}
```

```json
{
  "client_id": "72deb66f-5c5c-4aa3-8dde-0db806d8c616",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:02:08.677412911Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "7572d519-653e-4bb0-9ac1-e9bea600911a",
  "quote_id": "b1ebcbe8-5316-44a9-b3ab-484519571504",
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
  "correlation_id": "9a059589-f91e-4c8d-a495-b789c6b50057"
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
  "session_id": "1e6d7493-b717-4001-82cd-7afe749f8874",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyMjksImlhdCI6MTc5MzM2NTMyOSwianRpIjoiNzZhOWU5NmUtMjcyMC00NTYyLTkyMjMtYWM3MDhmZjRhMDRkIiwic2lkIjoiMWU2ZDc0OTMtYjcxNy00MDAxLTgyY2QtN2FmZTc0OWY4ODc0In0.z5k9Z3qWhmQPt16A9HaxQ-L8NXeVUfRgtXna55UTGhY",
  "access_expires_at": "2026-10-30T13:17:09.562338419Z",
  "refresh_token": "ry-hc5CGocsBNLCi-aj2vh3ucTmEdDtu5vzmlwp7DR0",
  "refresh_expires_at": "2026-10-31T01:02:09.561821673Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "72deb66f-5c5c-4aa3-8dde-0db806d8c616",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:02:08.677413Z",
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

`POST /api/admin/v1/client-deletions/72deb66f-5c5c-4aa3-8dde-0db806d8c616/complete` → **200**

```json
{
  "command_id": "e12e4241-a397-4ae2-aea9-bd2d641b759f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "72deb66f-5c5c-4aa3-8dde-0db806d8c616",
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
  "correlation_id": "40d77307-50a6-45b5-bf23-37825a4b6b67"
}
```

Done: client 72deb66f-5c5c-4aa3-8dde-0db806d8c616 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669928459",
  "device_ref": "sandbox-29891"
}
```

```json
{
  "challenge_id": "c5ffc9fc-d40c-47e4-9c77-95ee018c8073",
  "expires_at": "2026-10-30T13:07:10.749732645Z",
  "resend_available_at": "2026-10-30T13:02:11.749732645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669928459` → **200**

```json
{
  "phone": "+380669928459",
  "audience": "CLIENT",
  "code": "063715",
  "sent_at": "2026-10-30T13:02:10.753193667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5ffc9fc-d40c-47e4-9c77-95ee018c8073",
  "code": "063715",
  "device_ref": "sandbox-29891"
}
```

```json
{
  "session_id": "561be4dd-b739-419f-98c4-ab6cb663bc4e",
  "subject": {
    "type": "CLIENT",
    "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGI4NjgzNy00YmZjLTQzYzItOWQ4MS0xNWRiOTZhMjNhMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjMxLCJpYXQiOjE3OTMzNjUzMzEsImp0aSI6IjFkNWIyMWJiLTFiNWItNGQ3Yy1iNjM0LTViY2M5N2FlNzYyMiIsInNpZCI6IjU2MWJlNGRkLWI3MzktNDE5Zi05OGM0LWFiNmNiNjYzYmM0ZSJ9.TtbEw9ICNz34SEJ86xii0_-Gop2kze3l8mlY3EbGi9s",
  "access_expires_at": "2026-10-30T13:17:11.066974255Z",
  "refresh_token": "eeqNnAOItOOoPgraQ62INEEaKQUB4iNxYmYktB7kdNE",
  "refresh_expires_at": "2026-11-29T13:02:11.066438543Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
  "session_id": "561be4dd-b739-419f-98c4-ab6cb663bc4e",
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
  "session_id": "265e0693-181e-4142-9f1f-055d952b266c",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyMzEsImlhdCI6MTc5MzM2NTMzMSwianRpIjoiN2E5MjgyNTItOGMzOC00NTU4LTg0OWQtYmIwY2ExYmJiM2QxIiwic2lkIjoiMjY1ZTA2OTMtMTgxZS00MTQyLTlmMWYtMDU1ZDk1MmIyNjZjIn0.IpPtpq8os-kA8Lo6PWBgJuy1Z7B3nSceLxkPYKmLIb0",
  "access_expires_at": "2026-10-30T13:17:11.930700203Z",
  "refresh_token": "pKoP0l9JgeyTcLtm-GQ57aXH2S992Bbpm9SlRdzxCqw",
  "refresh_expires_at": "2026-10-31T01:02:11.930135885Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9928459&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
      "phone": "+380669928459",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:02:11.064848Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/18b86837-4bfc-43c2-9d81-15db96a23a2c` → **200**

```json
{
  "client": {
    "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
    "phone": "+380669928459",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:02:11.064848Z",
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

`POST /api/admin/v1/clients/18b86837-4bfc-43c2-9d81-15db96a23a2c/block` → **400**

```json
{
  "command_id": "b77c68e6-0544-41ab-af7e-338373575d8c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/18b86837-4bfc-43c2-9d81-15db96a23a2c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8045807d-abc5-4906-af02-bbee1c2043c3",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/18b86837-4bfc-43c2-9d81-15db96a23a2c/block` → **200**

```json
{
  "command_id": "88a49d70-22a9-4c0b-8706-684f0a52ef82",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
  "phone": "+380669928459",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:02:11.064848Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:02:13.17473Z",
    "by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
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
  "correlation_id": "d23cfbe8-ffda-41dd-9f20-bd24c3019a41"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669928459",
  "device_ref": "sandbox-32165"
}
```

```json
{
  "challenge_id": "1023ff55-59c0-45ba-b7e3-e2e1d3db31af",
  "expires_at": "2026-10-30T13:07:15.77002522Z",
  "resend_available_at": "2026-10-30T13:02:16.77002522Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669928459` → **200**

```json
{
  "phone": "+380669928459",
  "audience": "CLIENT",
  "code": "607569",
  "sent_at": "2026-10-30T13:02:15.772810779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1023ff55-59c0-45ba-b7e3-e2e1d3db31af",
  "code": "607569",
  "device_ref": "sandbox-32165"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "15fc7afd-83e2-46d7-91c5-29687e92d6ef"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/18b86837-4bfc-43c2-9d81-15db96a23a2c` → **200**

```json
{
  "client": {
    "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
    "phone": "+380669928459",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:02:11.064848Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:02:13.17473Z",
      "by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
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

`POST /api/admin/v1/clients/18b86837-4bfc-43c2-9d81-15db96a23a2c/unblock` → **200**

```json
{
  "command_id": "e581acd9-7812-410f-969e-21cc171c5ce5",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
  "phone": "+380669928459",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:02:11.064848Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669928459",
  "device_ref": "sandbox-1289"
}
```

```json
{
  "challenge_id": "9044965f-7ad2-4d82-a7b8-b0cfa0b3a05b",
  "expires_at": "2026-10-30T13:07:19.012836487Z",
  "resend_available_at": "2026-10-30T13:02:20.012836487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669928459` → **200**

```json
{
  "phone": "+380669928459",
  "audience": "CLIENT",
  "code": "254044",
  "sent_at": "2026-10-30T13:02:19.015615112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9044965f-7ad2-4d82-a7b8-b0cfa0b3a05b",
  "code": "254044",
  "device_ref": "sandbox-1289"
}
```

```json
{
  "session_id": "d120d7dd-0910-4162-b7b4-7318468c55e4",
  "subject": {
    "type": "CLIENT",
    "id": "18b86837-4bfc-43c2-9d81-15db96a23a2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGI4NjgzNy00YmZjLTQzYzItOWQ4MS0xNWRiOTZhMjNhMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjM5LCJpYXQiOjE3OTMzNjUzMzksImp0aSI6IjgyMTU4YzUxLTQ2ZTMtNDI4YS05ZTcwLTA4ZTU1MTM1ZjQxMCIsInNpZCI6ImQxMjBkN2RkLTA5MTAtNDE2Mi1iN2I0LTczMTg0NjhjNTVlNCJ9.GpbgJ0g5QBOGO8i4TRTqW7u_QlWBxIWUuNywaqs5v-s",
  "access_expires_at": "2026-10-30T13:17:19.331300062Z",
  "refresh_token": "e3eqoaCs1PIWNhN4_spb2N1lju_-5DIKX_kRrs9u1XY",
  "refresh_expires_at": "2026-11-29T13:02:19.330787058Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "18b86837-4bfc-43c2-9d81-15db96a23a2c",
  "session_id": "d120d7dd-0910-4162-b7b4-7318468c55e4",
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
  "phone": "+380660044452",
  "device_ref": "sandbox-25698"
}
```

```json
{
  "challenge_id": "16a1e1f2-c848-4992-a71c-e66fc4d6ae94",
  "expires_at": "2026-10-30T13:07:19.916822489Z",
  "resend_available_at": "2026-10-30T13:02:20.916822489Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660044452` → **200**

```json
{
  "phone": "+380660044452",
  "audience": "CLIENT",
  "code": "221819",
  "sent_at": "2026-10-30T13:02:19.919456507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16a1e1f2-c848-4992-a71c-e66fc4d6ae94",
  "code": "221819",
  "device_ref": "sandbox-25698"
}
```

```json
{
  "session_id": "e4bb834e-bc85-4523-a26b-3f31f305d935",
  "subject": {
    "type": "CLIENT",
    "id": "f0614791-fa50-4952-a2a7-94cb8af74567"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDYxNDc5MS1mYTUwLTQ5NTItYTJhNy05NGNiOGFmNzQ1NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjQwLCJpYXQiOjE3OTMzNjUzNDAsImp0aSI6ImMyMDljMTkwLTQ2NzUtNGNiYi1iMzFhLTAzZDI5MGJhZDIwMCIsInNpZCI6ImU0YmI4MzRlLWJjODUtNDUyMy1hMjZiLTNmMzFmMzA1ZDkzNSJ9.AMzZIOcmab08GkO0bAV88HCxn2rC_T7rBB97ESLWDyM",
  "access_expires_at": "2026-10-30T13:17:20.228926191Z",
  "refresh_token": "y_bIeW9izQFA1pcttCLSt_auKKaRa2cXddaZYk6Acno",
  "refresh_expires_at": "2026-11-29T13:02:20.228345362Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1960e744-002f-4978-8357-295c76a741ae",
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
  "id": "6618d043-e0df-4aba-ab6f-a0ab7985b854",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:20.520485Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 04832d2a-f342-47f1-a12d-e13bd04fe0db) → **201**

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
  "session_id": "d86c3e53-26f3-4132-81b0-0c5fb8a28956",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNDEsImlhdCI6MTc5MzM2NTM0MSwianRpIjoiOTczZDM3ZjYtY2ZmNC00Y2E3LWI3MmEtMzhlZDY3Y2M5NjFlIiwic2lkIjoiZDg2YzNlNTMtMjZmMy00MTMyLTgxYjAtMGM1ZmI4YTI4OTU2In0.zKZcbUzutcN41FJ8r7wdcSFLGvPKOwmqz8vQqMF0EnM",
  "access_expires_at": "2026-10-30T13:17:21.13978669Z",
  "refresh_token": "250ECH_8mFdHgzZfIP_xV1A1kOoUoau4buevQJiFVAw",
  "refresh_expires_at": "2026-10-31T01:02:21.13920888Z",
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
  "session_id": "9c97e09c-639e-4001-b138-7fb65527fed7",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNDEsImlhdCI6MTc5MzM2NTM0MSwianRpIjoiMzc4MzFjY2QtYzFmOS00OTFjLWFmMGMtOWU2ZDEzZDdkMTY0Iiwic2lkIjoiOWM5N2UwOWMtNjM5ZS00MDAxLWIxMzgtN2ZiNjU1MjdmZWQ3In0.2BATkZ7FG47SA_jN6sK61PIeIhUIzkmjNdC3oNsIII8",
  "access_expires_at": "2026-10-30T13:17:21.717796684Z",
  "refresh_token": "jCvWMcMXE-FWMVHeB9ymV-f1LQMfB2lBTvCcxlFqgkU",
  "refresh_expires_at": "2026-10-31T01:02:21.717254239Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4711a6d4-c10d-474f-8f97-9951719d4261/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:02:20.817013Z",
      "actor": {
        "type": "CLIENT",
        "id": "f0614791-fa50-4952-a2a7-94cb8af74567",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4711a6d4-c10d-474f-8f97-9951719d4261",
        "quote_id": "6618d043-e0df-4aba-ab6f-a0ab7985b854",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "04832d2a-f342-47f1-a12d-e13bd04fe0db"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:02:20.818585Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4711a6d4-c10d-474f-8f97-9951719d4261",
        "attempt_id": "eee49864-3690-4ab7-9321-6a5940f6a9b1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "04832d2a-f342-47f1-a12d-e13bd04fe0db"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:02:20.82136Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4711a6d4-c10d-474f-8f97-9951719d4261",
        "attempt_id": "eee49864-3690-4ab7-9321-6a5940f6a9b1"
      },
      "correlation_id": "04832d2a-f342-47f1-a12d-e13bd04fe0db"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "eee49864-3690-4ab7-9321-6a5940f6a9b1",
        "generation": 1,
        "started_at": "2026-10-30T13:02:20.817826Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:02:20.82136Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:02:20.819167Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/04832d2a-f342-47f1-a12d-e13bd04fe0db` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4711a6d4-c10d-474f-8f97-9951719d4261:0",
      "order_id": "4711a6d4-c10d-474f-8f97-9951719d4261",
      "at": "2026-10-30T13:02:20.817013Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4711a6d4-c10d-474f-8f97-9951719d4261:1",
      "order_id": "4711a6d4-c10d-474f-8f97-9951719d4261",
      "at": "2026-10-30T13:02:20.818585Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4711a6d4-c10d-474f-8f97-9951719d4261:2",
      "order_id": "4711a6d4-c10d-474f-8f97-9951719d4261",
      "at": "2026-10-30T13:02:20.82136Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c264e858-f7f2-4e4d-96ae-01385c4c5d16` → **200**

```json
{
  "found": []
}
```

Done: request 04832d2a-f342-47f1-a12d-e13bd04fe0db — order 4711a6d4-c10d-474f-8f97-9951719d4261 found by its id.

`GET /api/rider/v1/orders/4711a6d4-c10d-474f-8f97-9951719d4261` → **200**

```json
{
  "id": "4711a6d4-c10d-474f-8f97-9951719d4261",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f0614791-fa50-4952-a2a7-94cb8af74567",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:02:20.816529Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4711a6d4-c10d-474f-8f97-9951719d4261/cancel` → **200**

```json
{
  "command_id": "53a9e369-5a78-41c9-925a-3c9876d8d134",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4711a6d4-c10d-474f-8f97-9951719d4261",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f0614791-fa50-4952-a2a7-94cb8af74567",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:02:20.816529Z",
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
  "phone": "+380630071343",
  "device_ref": "sandbox-24643"
}
```

```json
{
  "challenge_id": "57d860c9-bfda-4f46-9f82-e40ddd7952ec",
  "expires_at": "2026-10-30T13:07:23.551493837Z",
  "resend_available_at": "2026-10-30T13:02:24.551493837Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630071343` → **200**

```json
{
  "phone": "+380630071343",
  "audience": "CLIENT",
  "code": "731345",
  "sent_at": "2026-10-30T13:02:23.55435988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57d860c9-bfda-4f46-9f82-e40ddd7952ec",
  "code": "731345",
  "device_ref": "sandbox-24643"
}
```

```json
{
  "session_id": "5874cea7-76f5-430c-8aa8-1bdc63159682",
  "subject": {
    "type": "CLIENT",
    "id": "0f010eb5-9004-4b4e-a2ad-c7cad0f636b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjAxMGViNS05MDA0LTRiNGUtYTJhZC1jN2NhZDBmNjM2YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjQzLCJpYXQiOjE3OTMzNjUzNDMsImp0aSI6IjExNjk3YzY5LTE2OWYtNDdmNS05NmM2LTcyM2E3ODZlYWJhZSIsInNpZCI6IjU4NzRjZWE3LTc2ZjUtNDMwYy04YWE4LTFiZGM2MzE1OTY4MiJ9.mTvOluspnfVgjgInsJK4gt_uy-u70sWDO2R026qV4X8",
  "access_expires_at": "2026-10-30T13:17:23.867920638Z",
  "refresh_token": "rpzQ-5AUS7boVXkYlp9ocYFDE5A0Xi6X5XubsqBnFbY",
  "refresh_expires_at": "2026-11-29T13:02:23.867205189Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "1c2e0783-694b-43ee-af15-b09ce2b32dd7",
  "expires_at": "2026-10-30T13:07:26.165436063Z",
  "resend_available_at": "2026-10-30T13:02:27.165436063Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630071343` → **200**

```json
{
  "phone": "+380630071343",
  "audience": "CLIENT",
  "code": "524189",
  "sent_at": "2026-10-30T13:02:26.167847105Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "75938a6c-b029-42fb-80da-4d45c8acdcd9",
  "challenge_id": "1c2e0783-694b-43ee-af15-b09ce2b32dd7",
  "otp_code": "524189"
}
```

```json
{
  "id": "c3a262bf-83e7-4960-8466-03fc1e8e8edf",
  "state": "PENDING",
  "created_at": "2026-10-30T13:02:26.487282Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c3a262bf-83e7-4960-8466-03fc1e8e8edf` → **200**

```json
{
  "id": "c3a262bf-83e7-4960-8466-03fc1e8e8edf",
  "state": "READY",
  "created_at": "2026-10-30T13:02:26.487282Z",
  "ready_at": "2026-10-30T13:02:26.637227Z",
  "expires_at": "2026-11-06T13:02:26.637227Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c3a262bf-83e7-4960-8466-03fc1e8e8edf/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638162573",
  "device_ref": "sandbox-22497"
}
```

```json
{
  "challenge_id": "482048c4-e945-482c-8756-5eb40788ae72",
  "expires_at": "2026-10-30T13:07:27.105987971Z",
  "resend_available_at": "2026-10-30T13:02:28.105987971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638162573` → **200**

```json
{
  "phone": "+380638162573",
  "audience": "CLIENT",
  "code": "885848",
  "sent_at": "2026-10-30T13:02:27.108754304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "482048c4-e945-482c-8756-5eb40788ae72",
  "code": "885848",
  "device_ref": "sandbox-22497"
}
```

```json
{
  "session_id": "0a1dc56b-4f28-4370-ae9f-3a8a9fbc742b",
  "subject": {
    "type": "CLIENT",
    "id": "24fd2638-8421-41a5-bb26-622b481279e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNGZkMjYzOC04NDIxLTQxYTUtYmIyNi02MjJiNDgxMjc5ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjQ3LCJpYXQiOjE3OTMzNjUzNDcsImp0aSI6ImU3OTc3YzQyLTBjNzMtNDlmNS1iNDg0LTcyNzAwMmY1ZDliZCIsInNpZCI6IjBhMWRjNTZiLTRmMjgtNDM3MC1hZTlmLTNhOGE5ZmJjNzQyYiJ9.HBAdBh2-lCN6-Asw-_NKpbHsbXJvt2bE4y7quggvqb8",
  "access_expires_at": "2026-10-30T13:17:27.423878934Z",
  "refresh_token": "aBnj84oX1iJA_JmHbvLV4o8TlmY64jRdKWxL5aq1mSI",
  "refresh_expires_at": "2026-11-29T13:02:27.423364592Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c3a262bf-83e7-4960-8466-03fc1e8e8edf/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c3a262bf-83e7-4960-8466-03fc1e8e8edf/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1f38512d-cdca-4003-8831-9e1bca458481"
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
  "session_id": "0b3bd7f8-bc72-4b17-a143-5083e2000aad",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNDgsImlhdCI6MTc5MzM2NTM0OCwianRpIjoiMTA5Y2MxZjktNjJmMi00NDMxLWFjNzUtYjdiNzRjMWVmYWZmIiwic2lkIjoiMGIzYmQ3ZjgtYmM3Mi00YjE3LWExNDMtNTA4M2UyMDAwYWFkIn0.XXBhDFFs39yVhweRdD9YNl_zO7zCYeraHONTShtMCw4",
  "access_expires_at": "2026-10-30T13:17:28.307286956Z",
  "refresh_token": "bGF8GMF_grYPOE1j_un59SMH5A-iWL35JyKUiDKCWaI",
  "refresh_expires_at": "2026-10-31T01:02:28.306612014Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0f010eb5-9004-4b4e-a2ad-c7cad0f636b9",
  "session_id": "5874cea7-76f5-430c-8aa8-1bdc63159682",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/0f010eb5-9004-4b4e-a2ad-c7cad0f636b9/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c3a262bf-83e7-4960-8466-03fc1e8e8edf",
      "state": "READY",
      "created_at": "2026-10-30T13:02:26.487282Z",
      "ready_at": "2026-10-30T13:02:26.637227Z",
      "expires_at": "2026-11-06T13:02:26.637227Z",
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
  "device_ref": "sandbox-17552"
}
```

```json
{
  "challenge_id": "0e8ad2f5-67a3-4062-97b6-e51b7042044d",
  "expires_at": "2026-10-30T13:07:29.169841893Z",
  "resend_available_at": "2026-10-30T13:02:30.169841893Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "044359",
  "sent_at": "2026-10-30T13:02:29.172643623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e8ad2f5-67a3-4062-97b6-e51b7042044d",
  "code": "044359",
  "device_ref": "sandbox-17552"
}
```

```json
{
  "session_id": "76539895-5d13-4ba7-9e6f-3e1b881956ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI0OSwiaWF0IjoxNzkzMzY1MzQ5LCJqdGkiOiIzYmEzMjUyMi1mNTdjLTQ1MDEtOTAxNC0zYzRjNjY3ZWM1MDAiLCJzaWQiOiI3NjUzOTg5NS01ZDEzLTRiYTctOWU2Zi0zZTFiODgxOTU2Y2UifQ.n2Pr0DXRpN_RAhmaEbv7GhX9sPc0V0Fkfpa2FMrsf2U",
  "access_expires_at": "2026-10-30T13:17:29.487913045Z",
  "refresh_token": "jn7FCzogPMjaBFSVHjPndOSj_gQBZF8mgvvmCu9e-tk",
  "refresh_expires_at": "2026-11-29T13:02:29.487339445Z",
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
  "device_ref": "sandbox-29240"
}
```

```json
{
  "challenge_id": "39a4512e-e2c2-46b5-9651-0904dc146dd1",
  "expires_at": "2026-10-30T13:07:30.053831604Z",
  "resend_available_at": "2026-10-30T13:02:31.053831604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "913690",
  "sent_at": "2026-10-30T13:02:30.056490579Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39a4512e-e2c2-46b5-9651-0904dc146dd1",
  "code": "913690",
  "device_ref": "sandbox-29240"
}
```

```json
{
  "session_id": "b2f2f5a6-587e-43b6-bc46-b67ff65caf8e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI1MCwiaWF0IjoxNzkzMzY1MzUwLCJqdGkiOiJhZjhlMWU0Ny1hZTYwLTQ2YmYtODU5MC0xMWM1YjEyNmFkNDIiLCJzaWQiOiJiMmYyZjVhNi01ODdlLTQzYjYtYmM0Ni1iNjdmZjY1Y2FmOGUifQ.uG6ZVWAfOHwe2GN8qNN4e-oLAsghuBmIMg7i_ZvgZcQ",
  "access_expires_at": "2026-10-30T13:17:30.378177581Z",
  "refresh_token": "lFF_LecKWi3eGIdZF3pRRlBnAu_Q7KVM0IgD_PowKBM",
  "refresh_expires_at": "2026-11-29T13:02:30.377671885Z",
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
  "command_id": "94adf74f-806d-48ea-96ba-7826f0fac0a8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:30Z",
    "sequence": 1793365350952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "50f09be1-a326-40f2-8de4-aec2bf4135d6",
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
  "last_heartbeat_at": "2026-10-30T13:02:30.971075Z",
  "last_location_at": "2026-10-30T13:02:30.971075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4284"
}
```

```json
{
  "challenge_id": "ee7bc9ad-a0ce-41b4-81d8-05816419c571",
  "expires_at": "2026-10-30T13:07:31.265694266Z",
  "resend_available_at": "2026-10-30T13:02:32.265694266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "599119",
  "sent_at": "2026-10-30T13:02:31.26834969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee7bc9ad-a0ce-41b4-81d8-05816419c571",
  "code": "599119",
  "device_ref": "sandbox-4284"
}
```

```json
{
  "session_id": "9b478a5f-9955-4117-ba48-168a739862ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI1MSwiaWF0IjoxNzkzMzY1MzUxLCJqdGkiOiJhOTgxNDk1NC1lMDhlLTRiMDItODNjNC1jNjBjZTI1ZmFkYWEiLCJzaWQiOiI5YjQ3OGE1Zi05OTU1LTQxMTctYmE0OC0xNjhhNzM5ODYyYWUifQ.tHvptc7w09w2dbEINbwSwrSJqVt0sf0sZyqb06YwsLo",
  "access_expires_at": "2026-10-30T13:17:31.589580865Z",
  "refresh_token": "M1CdzVyHZhDl7hQw8iyvPcvDu3VAi-ePyGCq0nfTbms",
  "refresh_expires_at": "2026-11-29T13:02:31.589077413Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "318079f7-de72-4bd4-9b24-bd5f304e0b8a",
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
  "last_heartbeat_at": "2026-10-30T13:01:03.849147Z",
  "last_location_at": "2026-10-30T13:01:03.849147Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/318079f7-de72-4bd4-9b24-bd5f304e0b8a/handover` → **200**

```json
{
  "command_id": "f285be51-ce8e-45b0-802a-f827f0ccd5dc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "318079f7-de72-4bd4-9b24-bd5f304e0b8a",
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
  "last_heartbeat_at": "2026-10-30T13:01:03.849147Z",
  "last_location_at": "2026-10-30T13:01:03.849147Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/318079f7-de72-4bd4-9b24-bd5f304e0b8a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:32Z",
    "sequence": 1793365352473
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "318079f7-de72-4bd4-9b24-bd5f304e0b8a",
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
  "last_heartbeat_at": "2026-10-30T13:02:32.492039Z",
  "last_location_at": "2026-10-30T13:02:32.492039Z",
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
  "session_id": "936704c9-3716-47c6-bc8d-1c7eb5b9872e",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNTMsImlhdCI6MTc5MzM2NTM1MywianRpIjoiOTk2NWViMGQtMWFlNi00YzU0LTk4MDMtMjI2OWNlMmVjMDkyIiwic2lkIjoiOTM2NzA0YzktMzcxNi00N2M2LWJjOGQtMWM3ZWI1Yjk4NzJlIn0.dqkvUFRL99bZmhzv1L7Wb6ktO12QDIky7bY7ev2TDQw",
  "access_expires_at": "2026-10-30T13:17:33.075539626Z",
  "refresh_token": "UAAyIyonhY8a5mKDcAabtWphKDedcrnJYSxeZIo4HX0",
  "refresh_expires_at": "2026-10-31T01:02:33.074976414Z",
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
  "session_id": "abf12fe9-f075-4ac0-8ec2-549047f58d9d",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNTMsImlhdCI6MTc5MzM2NTM1MywianRpIjoiMDE4OGZkNzMtNjJmMS00YWQ0LWEyNzQtOGJiZjE2YTZiM2Q3Iiwic2lkIjoiYWJmMTJmZTktZjA3NS00YWMwLThlYzItNTQ5MDQ3ZjU4ZDlkIn0.VUS3kDW2FmsxFcgI_bDOrTIrJ9mNKDifOej78X3mXrw",
  "access_expires_at": "2026-10-30T13:17:33.671948416Z",
  "refresh_token": "rPL9-_LDMr_usmh8gcY1LTC72POXEsHtarc31_PxewI",
  "refresh_expires_at": "2026-10-31T01:02:33.671353836Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681101730",
  "device_ref": "sandbox-10176"
}
```

```json
{
  "challenge_id": "e1d05715-d65e-4b1d-bea1-094907d53628",
  "expires_at": "2026-10-30T13:07:33.954961552Z",
  "resend_available_at": "2026-10-30T13:02:34.954961552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681101730` → **200**

```json
{
  "phone": "+380681101730",
  "audience": "CLIENT",
  "code": "844119",
  "sent_at": "2026-10-30T13:02:33.958044465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1d05715-d65e-4b1d-bea1-094907d53628",
  "code": "844119",
  "device_ref": "sandbox-10176"
}
```

```json
{
  "session_id": "b587e8a4-587a-41ec-9fc1-fbbbb884ded4",
  "subject": {
    "type": "CLIENT",
    "id": "67a4e58b-3eb9-4f62-aac2-fde9cd0cc67b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2N2E0ZTU4Yi0zZWI5LTRmNjItYWFjMi1mZGU5Y2QwY2M2N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjU0LCJpYXQiOjE3OTMzNjUzNTQsImp0aSI6IjEzMDAzMDA0LWViZGEtNDExYS1hMGViLTcwOTc5OTdlZTdiOSIsInNpZCI6ImI1ODdlOGE0LTU4N2EtNDFlYy05ZmMxLWZiYmJiODg0ZGVkNCJ9.RcvW492jNFGULOQXa6I4uXqXgMyyNgd2Yphxnrx8RAs",
  "access_expires_at": "2026-10-30T13:17:34.280604155Z",
  "refresh_token": "uBW1qqrpjzCIhaZZxjemD_wMSAMMu2aYAAOwte0FwN0",
  "refresh_expires_at": "2026-11-29T13:02:34.280097779Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e55c6469-eebb-4053-bbf9-e64d5718e99c",
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
  "id": "718f35fc-ab20-41fc-9528-a4fc74f91c1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:34.575330Z",
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
  "command_id": "a26b64f0-1bae-455e-84fc-4b8b4b0a851e",
  "quote_id": "718f35fc-ab20-41fc-9528-a4fc74f91c1a",
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
  "id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "67a4e58b-3eb9-4f62-aac2-fde9cd0cc67b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:02:34.881089Z",
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
    "id": "10c4a0b8-b3ee-4371-8d22-6f0625feadf8",
    "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
    "expires_at": "2026-10-30T13:02:49.884318Z",
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

`POST /api/driver/v1/offers/10c4a0b8-b3ee-4371-8d22-6f0625feadf8/reject` → **204**

```json
{
  "command_id": "2b8ccda4-adc8-44cf-996f-14a0d30073ff"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ccb1fc13-e1f3-43ae-a9a0-b7c49e98b61e",
    "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
    "expires_at": "2026-10-30T13:02:50.491419Z",
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

`POST /api/driver/v1/offers/ccb1fc13-e1f3-43ae-a9a0-b7c49e98b61e/accept` → **200**

```json
{
  "command_id": "f51c3241-3e60-4d1e-b700-297496289374"
}
```

```json
{
  "id": "1e15e9b3-7271-44ed-a722-44cb84344026",
  "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b31bfbef-a353-4f01-bb62-5b9b5a638f13",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/14c2d1eb-91ae-4d20-8e60-3cc568c66596/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:02:34.881561Z",
      "actor": {
        "type": "CLIENT",
        "id": "67a4e58b-3eb9-4f62-aac2-fde9cd0cc67b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
        "quote_id": "718f35fc-ab20-41fc-9528-a4fc74f91c1a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cd886152-f9c7-475d-8f26-fb3cdd3bf636"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:02:34.883663Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
        "attempt_id": "92bc8d40-a5f0-4170-8b8f-e980aaddcd25",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cd886152-f9c7-475d-8f26-fb3cdd3bf636"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:02:34.886292Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10c4a0b8-b3ee-4371-8d22-6f0625feadf8",
        "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "cd886152-f9c7-475d-8f26-fb3cdd3bf636"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T13:02:35.490448Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10c4a0b8-b3ee-4371-8d22-6f0625feadf8",
        "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596"
      },
      "correlation_id": "90b822a0-260c-4874-b2e7-a15e1155abd0"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 14c2d1eb-91ae-4d20-8e60-3cc568c66596 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/14c2d1eb-91ae-4d20-8e60-3cc568c66596` → **200**

```json
{
  "id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "67a4e58b-3eb9-4f62-aac2-fde9cd0cc67b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1e15e9b3-7271-44ed-a722-44cb84344026",
    "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b31bfbef-a353-4f01-bb62-5b9b5a638f13",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:02:34.881089Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/14c2d1eb-91ae-4d20-8e60-3cc568c66596/cancel` → **200**

```json
{
  "command_id": "47547289-be7c-4048-b6a0-edba4fd94a33",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "67a4e58b-3eb9-4f62-aac2-fde9cd0cc67b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1e15e9b3-7271-44ed-a722-44cb84344026",
    "order_id": "14c2d1eb-91ae-4d20-8e60-3cc568c66596",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b31bfbef-a353-4f01-bb62-5b9b5a638f13",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:02:34.881089Z",
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
  "session_id": "50f09be1-a326-40f2-8de4-aec2bf4135d6",
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
  "last_heartbeat_at": "2026-10-30T13:02:30.971075Z",
  "last_location_at": "2026-10-30T13:02:30.971075Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/50f09be1-a326-40f2-8de4-aec2bf4135d6/close` → **200**

```json
{
  "command_id": "dfe81caf-95dc-4dac-bbfc-c39682719bfe",
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
  "session_id": "318079f7-de72-4bd4-9b24-bd5f304e0b8a",
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
  "last_heartbeat_at": "2026-10-30T13:02:32.492039Z",
  "last_location_at": "2026-10-30T13:02:32.492039Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/318079f7-de72-4bd4-9b24-bd5f304e0b8a/close` → **200**

```json
{
  "command_id": "099b8c11-fdbb-4f6e-9502-ec1e9acecb12",
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
  "session_id": "9e8650e2-0e26-4929-a2cc-21bd33348adf",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNTgsImlhdCI6MTc5MzM2NTM1OCwianRpIjoiY2VhMDNhNGUtMThjZi00M2U3LWJkMDctZWY5OGE4MTY0MTdjIiwic2lkIjoiOWU4NjUwZTItMGUyNi00OTI5LWEyY2MtMjFiZDMzMzQ4YWRmIn0.vsCAB3Ao7Ab75dUgEnyLQtYZ_pR26tVJdG8zf3YcZlU",
  "access_expires_at": "2026-10-30T13:17:38.72834549Z",
  "refresh_token": "2w0u8akkK70bG_xFnofkmBPpIfgy5PDq9FGechuMQ5k",
  "refresh_expires_at": "2026-10-31T01:02:38.727797277Z",
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
  "command_id": "c38d661f-8add-4a9d-b2cb-465e4390ffd2",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:02:39.321897Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "c83982b0-a4a0-40b2-94c7-aba166d77617",
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
  "correlation_id": "5cdd3fc8-7b2f-4cc7-a599-7ea731126ec0"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "adc47f8b-3c82-46ac-a86a-69732c618d7e",
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
  "correlation_id": "50d8d5c9-c272-4ac0-8c8e-008f974688d8"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637748551",
  "device_ref": "sandbox-18758"
}
```

```json
{
  "challenge_id": "fe4c362c-e164-4c7b-a58c-d7c4610ebf5d",
  "expires_at": "2026-10-30T13:07:40.210917908Z",
  "resend_available_at": "2026-10-30T13:02:41.210917908Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637748551` → **200**

```json
{
  "phone": "+380637748551",
  "audience": "CLIENT",
  "code": "729424",
  "sent_at": "2026-10-30T13:02:40.213673049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe4c362c-e164-4c7b-a58c-d7c4610ebf5d",
  "code": "729424",
  "device_ref": "sandbox-18758"
}
```

```json
{
  "session_id": "7feeb1ef-9773-4dbf-b345-a834f5667429",
  "subject": {
    "type": "CLIENT",
    "id": "eda86940-abd6-4008-97d4-e98b1da9fd5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZGE4Njk0MC1hYmQ2LTQwMDgtOTdkNC1lOThiMWRhOWZkNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjYwLCJpYXQiOjE3OTMzNjUzNjAsImp0aSI6IjI1ZjMxNjc4LTI3MjEtNDM0NC1hNmExLTE3OGUxYTUzMGU1ZCIsInNpZCI6IjdmZWViMWVmLTk3NzMtNGRiZi1iMzQ1LWE4MzRmNTY2NzQyOSJ9.xmI05ntAzxYV5xVRZ9nnmU1mEn-NAOp2ojRmk93yi6o",
  "access_expires_at": "2026-10-30T13:17:40.523975796Z",
  "refresh_token": "0v11dDpjYUnUMlVmXqZaNUG3XhtV4jZpbyeeeZkmG1g",
  "refresh_expires_at": "2026-11-29T13:02:40.523412123Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fbfbe5d8-24ff-42af-a5f8-cdac9f034961",
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
  "id": "757131a4-a41d-4a08-8cb3-26a4e3399a45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:40.824539Z",
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
  "command_id": "b53a2a85-165e-430f-9b56-ea29d5d4cd15",
  "quote_id": "757131a4-a41d-4a08-8cb3-26a4e3399a45",
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
  "correlation_id": "29b92d53-331b-497a-94c5-80266ed91791"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "243e1341-a847-43f6-9250-85c2c38ba8b3",
  "quote_id": "757131a4-a41d-4a08-8cb3-26a4e3399a45",
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
  "id": "6df99e8a-c733-43ec-a7b6-95ba1e9394ee",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eda86940-abd6-4008-97d4-e98b1da9fd5e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:02:41.429637Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6df99e8a-c733-43ec-a7b6-95ba1e9394ee/cancel` → **200**

```json
{
  "command_id": "5da46c61-62d8-4c30-8100-dcd744dc7ce5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6df99e8a-c733-43ec-a7b6-95ba1e9394ee",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "eda86940-abd6-4008-97d4-e98b1da9fd5e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:02:41.429637Z",
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
  "command_id": "d3af3110-9619-49dc-bca7-7c44bb81a0f6",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:02:42.07967Z"
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
      "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:02:42.07967Z"
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
  "device_ref": "sandbox-943"
}
```

```json
{
  "challenge_id": "a49c21e2-c8f2-43bb-82a9-9ea145c46563",
  "expires_at": "2026-10-30T13:07:42.985279406Z",
  "resend_available_at": "2026-10-30T13:02:43.985279406Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "539982",
  "sent_at": "2026-10-30T13:02:42.988561779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a49c21e2-c8f2-43bb-82a9-9ea145c46563",
  "code": "539982",
  "device_ref": "sandbox-943"
}
```

```json
{
  "session_id": "da0d5549-c1f0-4c76-841c-399a7601dee6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI2MywiaWF0IjoxNzkzMzY1MzYzLCJqdGkiOiJlODI1Yzg2Yi04OWMwLTQzNWQtYjNhZC00ZjFjZjEwM2MzODYiLCJzaWQiOiJkYTBkNTU0OS1jMWYwLTRjNzYtODQxYy0zOTlhNzYwMWRlZTYifQ.G4of6bEVQHv_b27YW2StFQsZHK3nje90cuFb8qI5F0M",
  "access_expires_at": "2026-10-30T13:17:43.308008915Z",
  "refresh_token": "uVVKJ5XM90o7Lz8vJxfssrGbKqZCY0Uh6fWR8YarA1o",
  "refresh_expires_at": "2026-11-29T13:02:43.30747658Z",
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
  "command_id": "d1596f69-c577-4ca5-80db-e176e3933a1d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:43Z",
    "sequence": 1793365363878
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:02:43.897009Z",
  "last_location_at": "2026-10-30T13:02:43.897009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672062300",
  "device_ref": "sandbox-4327"
}
```

```json
{
  "challenge_id": "b5de27ed-4e92-4f63-bac2-599d834dc6b2",
  "expires_at": "2026-10-30T13:07:44.192349836Z",
  "resend_available_at": "2026-10-30T13:02:45.192349836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672062300` → **200**

```json
{
  "phone": "+380672062300",
  "audience": "CLIENT",
  "code": "428050",
  "sent_at": "2026-10-30T13:02:44.195085909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5de27ed-4e92-4f63-bac2-599d834dc6b2",
  "code": "428050",
  "device_ref": "sandbox-4327"
}
```

```json
{
  "session_id": "4a1105cd-0d47-4b56-a1b4-5c5647da4412",
  "subject": {
    "type": "CLIENT",
    "id": "de87b115-fc04-49a7-a4f9-782559d1d760"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTg3YjExNS1mYzA0LTQ5YTctYTRmOS03ODI1NTlkMWQ3NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MjY0LCJpYXQiOjE3OTMzNjUzNjQsImp0aSI6ImQxYzM2NTcyLWM4OTAtNDkzMC1hYmQzLTdjY2RmZTRlOWRlZCIsInNpZCI6IjRhMTEwNWNkLTBkNDctNGI1Ni1hMWI0LTVjNTY0N2RhNDQxMiJ9.HpNwh6KlQpEDbqTuh1K05oMkcPgJAfydAnh8IlU8Zcs",
  "access_expires_at": "2026-10-30T13:17:44.511369551Z",
  "refresh_token": "LChAWZmLtSdFDfgWhLBoJhYyJIDeW3kCKM9RCOyIeiw",
  "refresh_expires_at": "2026-11-29T13:02:44.510789948Z",
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
  "command_id": "0197e109-b7a6-4443-9fbd-b9d37ff8c999",
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
  "id": "4cb40425-ec0c-413f-84f3-fcbe63e6ce56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:07:45.095137Z",
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
  "command_id": "2b468f3e-1bab-4bd1-b2fe-76aeb6c6548f",
  "platform": "ANDROID",
  "token": "sandbox-driver-49748412-e7c7-479c-bbac-241b89068506"
}
```

```json
{
  "id": "464cf8ab-1879-4096-b145-f43d16f90166",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:02:45.402671Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "48ec6f8b-e47c-42b4-b35d-fec07424decf",
  "platform": "ANDROID",
  "token": "sandbox-rider-6b402525-d1ae-4a9d-99b6-9fedae41dfdd"
}
```

```json
{
  "id": "4afe42c5-f3fd-4bda-89f5-44714065f362",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:02:45.700022Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b83c2e05-bc4a-491a-8e86-5b5beb0b3d81",
  "quote_id": "4cb40425-ec0c-413f-84f3-fcbe63e6ce56",
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
  "id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "de87b115-fc04-49a7-a4f9-782559d1d760",
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
  "created_at": "2026-10-30T13:02:45.999683Z",
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
    "id": "5b6d9ce1-1f0f-46eb-8300-b8d070d6bf74",
    "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
    "expires_at": "2026-10-30T13:03:01.002658Z",
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

`POST /api/driver/v1/offers/5b6d9ce1-1f0f-46eb-8300-b8d070d6bf74/accept` → **200**

```json
{
  "command_id": "c810652f-dbb6-4f18-ab76-672101781a0b"
}
```

```json
{
  "id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:02:45.975Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:02:46.304688367Z",
    "token_suffix": "068506",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "840c070a-2d8d-460e-9877-38ba8cd560ac",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672062300&after=2026-10-30T13:02:45.975Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672062300&after=2026-10-30T13:02:45.975Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:02:47.312590251Z",
    "token_suffix": "41dfdd",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "d8f48fb9-256d-4837-a130-44f1640825a1",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/0ccb8ab8-23b0-4672-8f33-aa925500c9f6/messages` → **201**

```json
{
  "command_id": "fbcf6b90-3fc8-4c29-ae0b-7032cb5b9019",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8f54dc95-4ffd-4161-8fe7-a542c54bc092",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:02:48.006892823Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "assignment_id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
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

`POST /api/driver/v1/trips/5fe6dced-0f14-4212-9c95-94c06c9c6792/messages` → **201**

```json
{
  "command_id": "d6ed8443-d6f0-4067-acd3-8934e63177bc",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "c1971caf-28fa-4c01-bc3f-cb8ffee094a2",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:02:48.611147694Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/0ccb8ab8-23b0-4672-8f33-aa925500c9f6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/5fe6dced-0f14-4212-9c95-94c06c9c6792/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672062300"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:49Z",
    "sequence": 1793365369477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:02:49.496841Z",
  "last_location_at": "2026-10-30T13:02:49.496841Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "assignment_id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
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

`POST /api/driver/v1/trips/5fe6dced-0f14-4212-9c95-94c06c9c6792/arrive` → **200**

```json
{
  "command_id": "2d4e8cd9-b75e-464f-8313-99cc909b9589",
  "expected_version": 0
}
```

```json
{
  "id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "assignment_id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
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
  "arrived_at": "2026-10-30T13:02:50.082117Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5fe6dced-0f14-4212-9c95-94c06c9c6792/start` → **200**

```json
{
  "command_id": "30ab25bb-0fe0-4ab2-a183-de0a8206df29",
  "expected_version": 1
}
```

```json
{
  "id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "assignment_id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
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
  "arrived_at": "2026-10-30T13:02:50.082117Z",
  "started_at": "2026-10-30T13:02:50.388066Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:02:50Z",
    "sequence": 1793365370680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:02:50.699274Z",
  "last_location_at": "2026-10-30T13:02:50.699274Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/5fe6dced-0f14-4212-9c95-94c06c9c6792/complete` → **200**

```json
{
  "command_id": "eb84ebd6-d984-4ba0-89aa-af87656683c8",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:02:50Z",
  "cash_received": true
}
```

```json
{
  "id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "assignment_id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
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
  "arrived_at": "2026-10-30T13:02:50.082117Z",
  "started_at": "2026-10-30T13:02:50.388066Z",
  "completed_at": "2026-10-30T13:02:51.001224Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/0ccb8ab8-23b0-4672-8f33-aa925500c9f6` → **200**

```json
{
  "id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "de87b115-fc04-49a7-a4f9-782559d1d760",
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
    "id": "26371a95-54bf-432b-a6e4-ff330c91f35e",
    "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:02:45.999683Z",
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
    "id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:02:45.999683Z",
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
    "id": "5fe6dced-0f14-4212-9c95-94c06c9c6792",
    "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
    "order_short_number": 14,
    "created_at": "2026-10-30T13:02:46.612891Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ca71f314-87c7-4632-8286-58d52edf7c82",
    "order_id": "851c721d-73cf-41c5-8929-761c0f1a0fb3",
    "order_short_number": 9,
    "created_at": "2026-10-30T13:01:40.170041Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4796a2d1-e952-4ebc-bc31-8244c03a3603",
    "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
    "order_short_number": 4,
    "created_at": "2026-10-30T13:00:52.285658Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6ee9fd61-5836-4d1b-88ae-df40b36518aa",
    "order_id": "b8000e06-1b68-41d0-ac4c-c9cba19b72c0",
    "order_short_number": 2,
    "created_at": "2026-10-30T13:00:13.029924Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4e90aa80-77e3-4215-a0e0-ada60f960ff5",
    "order_id": "63be04ac-ed20-4113-a291-ced21fcd53e3",
    "order_short_number": 1,
    "created_at": "2026-10-30T13:00:03.001989Z",
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

`GET /api/rider/v1/orders/0ccb8ab8-23b0-4672-8f33-aa925500c9f6/tip` → **200**

```json
{
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
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
  "available_until": "2026-10-31T13:02:51.001224Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0ccb8ab8-23b0-4672-8f33-aa925500c9f6/tip` → **201**

```json
{
  "command_id": "11239cae-1cda-4e54-9af1-8c9f5de3d5cd",
  "amount_minor": 1100
}
```

```json
{
  "id": "366ced2f-fe62-4cd4-a39b-1c7f5e9d7b0e",
  "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:02:56.098432Z"
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
  "session_id": "0dc3f3fc-2875-4cab-aab9-3fbdf6c2f8a0",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNzYsImlhdCI6MTc5MzM2NTM3NiwianRpIjoiMTdjZjRjZmUtMmJkNi00NzI1LTkwN2ItNjNhNzkyZjZhMmY3Iiwic2lkIjoiMGRjM2YzZmMtMjg3NS00Y2FiLWFhYjktM2ZiZGY2YzJmOGEwIn0.aibz6nj1Y6tpf-7cWvbgLlJXqW7ozxerjyrkIgbGnDQ",
  "access_expires_at": "2026-10-30T13:17:56.687890857Z",
  "refresh_token": "zvMWY2fXOwSMt8J7aU9Bb-5UZCQyOcFzSkjXSvSOmOY",
  "refresh_expires_at": "2026-10-31T01:02:56.687110979Z",
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
  "generated_at": "2026-10-30T13:02:56.996945031Z"
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
  "generated_at": "2026-10-30T13:02:57.29855595Z"
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
  "session_id": "07b1544a-1f7b-4b12-be1b-47497575341d",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNzcsImlhdCI6MTc5MzM2NTM3NywianRpIjoiN2ViOGZlMDItMjA1Ny00N2QzLTlkY2EtOTFmMDliYTY3ZDE2Iiwic2lkIjoiMDdiMTU0NGEtMWY3Yi00YjEyLWJlMWItNDc0OTc1NzUzNDFkIn0.QSxIMZIHJDBrbO_9SF_t64f2ANNA6xiPXIjyPiheP0U",
  "access_expires_at": "2026-10-30T13:17:57.898614966Z",
  "refresh_token": "mNpmzaW6Lgb_PWnClr_t5znZeGt_XcBWjfWSPeZeHX0",
  "refresh_expires_at": "2026-10-31T01:02:57.897894065Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0ccb8ab8-23b0-4672-8f33-aa925500c9f6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:02:46.000138Z",
      "actor": {
        "type": "CLIENT",
        "id": "de87b115-fc04-49a7-a4f9-782559d1d760",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
        "quote_id": "4cb40425-ec0c-413f-84f3-fcbe63e6ce56",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "da03146f-4462-4b21-8f92-be6a1f9feca6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:02:46.001975Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
        "attempt_id": "04912722-e07b-4bc1-bf62-e9ba12b9e3e0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "da03146f-4462-4b21-8f92-be6a1f9feca6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:02:46.004592Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5b6d9ce1-1f0f-46eb-8300-b8d070d6bf74",
        "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "da03146f-4462-4b21-8f92-be6a1f9feca6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:02:46.614562Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5b6d9ce1-1f0f-46eb-8300-b8d070d6bf74",
        "order_id": "0ccb8ab8-23b0-4672-8f33-aa925500c9f6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "26371a95-54bf-432b-a6e4-ff330c91f35e"
      },
      "correlation_id": "d4ec139a-67a6-4287-b52a-3ba365d4493a"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:02:58.526823814Z",
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
      "last_location_at": "2026-10-30T13:02:50.699274Z",
      "order_id": null
    }
  ]
}
```

Done: order 0ccb8ab8-23b0-4672-8f33-aa925500c9f6.

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
  "session_id": "2a23da05-2bd9-46f6-a813-588924883b2b",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyNzksImlhdCI6MTc5MzM2NTM3OSwianRpIjoiZWNiOGRkZjgtMmY3MS00MjkxLTk5NGItM2M1YTQ1NjE5NTJhIiwic2lkIjoiMmEyM2RhMDUtMmJkOS00NmY2LWE4MTMtNTg4OTI0ODgzYjJiIn0.pyLJFH6GqmZkSbtDyX1rQ8xO047MnQYGRLGUIZ4ZtKM",
  "access_expires_at": "2026-10-30T13:17:59.133814287Z",
  "refresh_token": "yB9LRUvz4YWrt8S_BPo_hQkk8nUjoRZjp1hAfBqpF44",
  "refresh_expires_at": "2026-10-31T01:02:59.133130539Z",
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
  "command_id": "3088f531-4420-4479-8959-f53d6c3a6f9b",
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
  "timestamp": "2026-10-30T13:03:00.000+0000",
  "channel": {
    "id": "1730052000.80904007",
    "linkedid": "1730052000.80904007",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675134106"
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
  "timestamp": "2026-10-30T13:03:00.000+0000",
  "channel": {
    "id": "1730052000.80904007",
    "linkedid": "1730052000.80904007",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675134106"
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
  "session_id": "d7033757-e3a4-426a-b208-5ee5cca4a854",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyODAsImlhdCI6MTc5MzM2NTM4MCwianRpIjoiNDAxOWZiOGYtNjNlYy00YTM2LTgyNGEtYmNhMjlkZjk1ZDk4Iiwic2lkIjoiZDcwMzM3NTctZTNhNC00MjZhLWIyMDgtNWVlNWNjYTRhODU0In0.0PsRCjtEzPRf_m389-QqCk3CwBLTTOvDaELRAoJm2Rc",
  "access_expires_at": "2026-10-30T13:18:00.362391954Z",
  "refresh_token": "RXxFpFmancDTEWkODhHaBxzJhQs0zsI2DLnFI4ReoCQ",
  "refresh_expires_at": "2026-10-31T01:03:00.361709758Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "c79ea672-8d9c-40a5-b1d9-1042dbc37799",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675134106",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:03:00Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/c79ea672-8d9c-40a5-b1d9-1042dbc37799/answer` → **200**

```json
{
  "command_id": "70eb3883-4e24-4faa-880e-1eda7eef1ea2"
}
```

```json
{
  "id": "c79ea672-8d9c-40a5-b1d9-1042dbc37799",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675134106",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "order_ids": [],
  "started_at": "2026-10-30T13:03:00Z",
  "answered_at": "2026-10-30T13:03:00.959155Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.80904007",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5f65c0ae-0501-4d00-b1ff-a781e675baf3",
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
  "id": "c1af9151-fa8a-4210-9450-e3ad8bb26b62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:01.294187Z",
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
  "command_id": "7f0a05bc-efca-43ff-b679-432872025854",
  "quote_id": "c1af9151-fa8a-4210-9450-e3ad8bb26b62",
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
    "phone": "+380675134106"
  },
  "call_id": "c79ea672-8d9c-40a5-b1d9-1042dbc37799"
}
```

```json
{
  "id": "16a99126-453c-4b02-9a6b-3b1f8e47b6dc",
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
  "created_at": "2026-10-30T13:03:01.609808Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675134106"
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
    "id": "1730052000.80904007",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c79ea672-8d9c-40a5-b1d9-1042dbc37799",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675134106",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [
        "16a99126-453c-4b02-9a6b-3b1f8e47b6dc"
      ],
      "started_at": "2026-10-30T13:03:00Z",
      "answered_at": "2026-10-30T13:03:00.959155Z",
      "ended_at": "2026-10-30T13:03:01.942965Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "3de52940-7150-4d6c-8b7e-a36f17781588",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670804714",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [],
      "started_at": "2026-10-30T13:00:40.939295Z",
      "answered_at": "2026-10-30T13:00:41.286053Z",
      "ended_at": "2026-10-30T13:00:41.604284Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:00:46.597769Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/16a99126-453c-4b02-9a6b-3b1f8e47b6dc` → **200**

```json
{
  "id": "16a99126-453c-4b02-9a6b-3b1f8e47b6dc",
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
  "created_at": "2026-10-30T13:03:01.609808Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675134106"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/16a99126-453c-4b02-9a6b-3b1f8e47b6dc` → **200**

```json
{
  "id": "16a99126-453c-4b02-9a6b-3b1f8e47b6dc",
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
  "created_at": "2026-10-30T13:03:01.609808Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675134106"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/16a99126-453c-4b02-9a6b-3b1f8e47b6dc/cancel` → **200**

```json
{
  "command_id": "def77090-18b3-4cc9-934d-657677d6d4be",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "16a99126-453c-4b02-9a6b-3b1f8e47b6dc",
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
  "created_at": "2026-10-30T13:03:01.609808Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675134106"
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

Done: call c79ea672-8d9c-40a5-b1d9-1042dbc37799 with order 16a99126-453c-4b02-9a6b-3b1f8e47b6dc.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20192"
}
```

```json
{
  "challenge_id": "ee570389-334f-4067-8667-a934d1860a38",
  "expires_at": "2026-10-30T13:08:03.23364099Z",
  "resend_available_at": "2026-10-30T13:03:04.23364099Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "051126",
  "sent_at": "2026-10-30T13:03:03.237836293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee570389-334f-4067-8667-a934d1860a38",
  "code": "051126",
  "device_ref": "sandbox-20192"
}
```

```json
{
  "session_id": "c06f4b83-d833-49cf-ab9f-df84246e9c75",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI4MywiaWF0IjoxNzkzMzY1MzgzLCJqdGkiOiI1NjNlNDEzZi04MTQ5LTQyYTAtYTQ5Mi03OTNhZTIwZmMxMWUiLCJzaWQiOiJjMDZmNGI4My1kODMzLTQ5Y2YtYWI5Zi1kZjg0MjQ2ZTljNzUifQ.Q2ws7pTK9yTsx5QSc3r_Fh7PhDcqJ6IwfpujtmwDiy4",
  "access_expires_at": "2026-10-30T13:18:03.554993321Z",
  "refresh_token": "Z4P4zI61cUWjJD60ev_nvEhutmyQcOcjfF0rwcFt7hQ",
  "refresh_expires_at": "2026-11-29T13:03:03.554371628Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:02:50.699274Z",
  "last_location_at": "2026-10-30T13:02:50.699274Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/handover` → **200**

```json
{
  "command_id": "25340321-3189-433c-a92a-7a800d1e735b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:02:50.699274Z",
  "last_location_at": "2026-10-30T13:02:50.699274Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:04Z",
    "sequence": 1793365384434
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:03:04.453983Z",
  "last_location_at": "2026-10-30T13:03:04.453983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665266829",
  "device_ref": "sandbox-6702"
}
```

```json
{
  "challenge_id": "b9f59850-adde-4b10-b600-a85e7011db0e",
  "expires_at": "2026-10-30T13:08:04.749326844Z",
  "resend_available_at": "2026-10-30T13:03:05.749326844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665266829` → **200**

```json
{
  "phone": "+380665266829",
  "audience": "CLIENT",
  "code": "189737",
  "sent_at": "2026-10-30T13:03:04.755095712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9f59850-adde-4b10-b600-a85e7011db0e",
  "code": "189737",
  "device_ref": "sandbox-6702"
}
```

```json
{
  "session_id": "f2f63ba9-241c-4675-8fb7-81710c1501a3",
  "subject": {
    "type": "CLIENT",
    "id": "7e610aa0-1961-4867-a182-32be9174f878"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTYxMGFhMC0xOTYxLTQ4NjctYTE4Mi0zMmJlOTE3NGY4NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mjg1LCJpYXQiOjE3OTMzNjUzODUsImp0aSI6ImVjNmVhNjY3LWMxZjMtNDg5Ny1iNzE1LWIwMjRmMDRlN2Q0MSIsInNpZCI6ImYyZjYzYmE5LTI0MWMtNDY3NS04ZmI3LTgxNzEwYzE1MDFhMyJ9.R3x0fsziNJFOBFJliu18e0XJlOvt1Rba0jv-KMmd7XA",
  "access_expires_at": "2026-10-30T13:18:05.080768657Z",
  "refresh_token": "mahQNEpTWA-TiY5MrzAvGG3jX1yFU7LP23wdKI-qVog",
  "refresh_expires_at": "2026-11-29T13:03:05.080074774Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "673d0038-e242-4053-893c-d798c4260519",
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
  "id": "98dc1b4a-4359-4bfb-b68e-532858cfb013",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:05.377071Z",
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
  "command_id": "8f5f5f72-3b15-4e7f-8cd6-997bc6fb4d80",
  "quote_id": "98dc1b4a-4359-4bfb-b68e-532858cfb013",
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
  "id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e610aa0-1961-4867-a182-32be9174f878",
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
  "created_at": "2026-10-30T13:03:05.679113Z",
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
    "id": "9a25ba72-2721-44a9-a671-c8e431524783",
    "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
    "expires_at": "2026-10-30T13:03:20.682336Z",
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

`POST /api/driver/v1/offers/9a25ba72-2721-44a9-a671-c8e431524783/accept` → **200**

```json
{
  "command_id": "a0882a6d-e3b9-4918-a037-56a6fac2b970"
}
```

```json
{
  "id": "380813fd-97dc-4dad-a128-3b467e2db369",
  "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c16ba8a4-1476-4025-b6e1-9814bd20d3dd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c16ba8a4-1476-4025-b6e1-9814bd20d3dd",
  "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
  "assignment_id": "380813fd-97dc-4dad-a128-3b467e2db369",
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

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:06Z",
    "sequence": 1793365386888
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:03:06.907965Z",
  "last_location_at": "2026-10-30T13:03:06.907965Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c16ba8a4-1476-4025-b6e1-9814bd20d3dd/arrive` → **200**

```json
{
  "command_id": "6b92f2a6-b1d1-429e-9834-915303495a4f",
  "expected_version": 0
}
```

```json
{
  "id": "c16ba8a4-1476-4025-b6e1-9814bd20d3dd",
  "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
  "assignment_id": "380813fd-97dc-4dad-a128-3b467e2db369",
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
  "arrived_at": "2026-10-30T13:03:07.217116Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c16ba8a4-1476-4025-b6e1-9814bd20d3dd/start` → **200**

```json
{
  "command_id": "4c407b0f-cb9d-4f60-b8ec-440e417a1ee6",
  "expected_version": 1
}
```

```json
{
  "id": "c16ba8a4-1476-4025-b6e1-9814bd20d3dd",
  "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
  "assignment_id": "380813fd-97dc-4dad-a128-3b467e2db369",
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
  "arrived_at": "2026-10-30T13:03:07.217116Z",
  "started_at": "2026-10-30T13:03:07.52797Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:07Z",
    "sequence": 1793365387818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:03:07.837365Z",
  "last_location_at": "2026-10-30T13:03:07.837365Z",
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
  "device_ref": "sandbox-7039"
}
```

```json
{
  "challenge_id": "c591722b-dc2e-49ba-a8ef-1b2ac449c926",
  "expires_at": "2026-10-30T13:08:08.131856398Z",
  "resend_available_at": "2026-10-30T13:03:09.131856398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "582140",
  "sent_at": "2026-10-30T13:03:08.135029029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c591722b-dc2e-49ba-a8ef-1b2ac449c926",
  "code": "582140",
  "device_ref": "sandbox-7039"
}
```

```json
{
  "session_id": "9916454b-8a23-41c6-b22d-3e5d78dcbee4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjI4OCwiaWF0IjoxNzkzMzY1Mzg4LCJqdGkiOiIxN2IwOTk5OS02NTAyLTQ3MDctYTU3Mi05NTQyN2E3NWRhZTkiLCJzaWQiOiI5OTE2NDU0Yi04YTIzLTQxYzYtYjIyZC0zZTVkNzhkY2JlZTQifQ.Pm5Btes44gTQrG01gRln0XOEwbeZiqzdpjK-VhJC3MM",
  "access_expires_at": "2026-10-30T13:18:08.478413347Z",
  "refresh_token": "ZxvnalBlHTm9JVYuVDo1NGjAw94x7kdH0t7zHPWQq7k",
  "refresh_expires_at": "2026-11-29T13:03:08.477891742Z",
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
  "command_id": "bc1c6200-c5c6-4ab0-bf42-4432350ec295",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:09Z",
    "sequence": 1793365389683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fab36491-c6a3-4b28-8547-eaf9aa21f552",
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
  "last_heartbeat_at": "2026-10-30T13:03:09.087717Z",
  "last_location_at": "2026-10-30T13:03:09.087717Z",
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
  "session_id": "6be1055a-21c7-4469-a486-183e8400a86f",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyODksImlhdCI6MTc5MzM2NTM4OSwianRpIjoiY2MyMGY3ZWItMzYwMy00YmQ3LWEwODYtMjQ4YzcwYzY4OTFlIiwic2lkIjoiNmJlMTA1NWEtMjFjNy00NDY5LWE0ODYtMTgzZTg0MDBhODZmIn0.lT4PwuHbhm08uILakDBwwoGEVd2taWUt3RCAiGpzEgM",
  "access_expires_at": "2026-10-30T13:18:09.668113507Z",
  "refresh_token": "EfL_Qo96Flo_6nUUZX8Mqs-0pl_3G4O9075V6jSZH20",
  "refresh_expires_at": "2026-10-31T01:03:09.66752559Z",
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
  "session_id": "dfa40759-f680-42b0-b107-f02b29c94bdf",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyOTAsImlhdCI6MTc5MzM2NTM5MCwianRpIjoiNzIwMWRjNzAtZjE5MC00YjBiLTk2ZWYtYjAwZTc0MjY3MWE0Iiwic2lkIjoiZGZhNDA3NTktZjY4MC00MmIwLWIxMDctZjAyYjI5Yzk0YmRmIn0.RNnr1GP6MDzTCSDtq_3JJrQB0sRtlWAmCxG3e3NQ0Bg",
  "access_expires_at": "2026-10-30T13:18:10.266368053Z",
  "refresh_token": "7VO99P9v9CxDRaGlVvIc9sxqUXyk-WGYd_lvz7vx_mU",
  "refresh_expires_at": "2026-10-31T01:03:10.265733887Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/572fb03f-54d0-40fe-af87-e6b40d66b1e0` → **200**

```json
{
  "id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7e610aa0-1961-4867-a182-32be9174f878",
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
    "id": "380813fd-97dc-4dad-a128-3b467e2db369",
    "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c16ba8a4-1476-4025-b6e1-9814bd20d3dd",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:03:05.679113Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/572fb03f-54d0-40fe-af87-e6b40d66b1e0/interrupt` → **200**

```json
{
  "command_id": "8ebc1f7b-c8c3-400e-9ce6-9096b3c8d2b2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "7e610aa0-1961-4867-a182-32be9174f878",
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
      "id": "380813fd-97dc-4dad-a128-3b467e2db369",
      "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c16ba8a4-1476-4025-b6e1-9814bd20d3dd",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:03:05.679113Z",
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
    "id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "7e610aa0-1961-4867-a182-32be9174f878",
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
    "id": "78ff437b-897e-44a3-9008-6940f740a96d",
    "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
    "expires_at": "2026-10-30T13:03:25.90548Z",
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

`POST /api/driver/v1/offers/78ff437b-897e-44a3-9008-6940f740a96d/accept` → **200**

```json
{
  "command_id": "1c43e6c6-e5ae-4a0c-8b41-0dc93d60b64f"
}
```

```json
{
  "id": "81240549-6ada-4f76-873f-a87c2feea7ba",
  "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "72df1c65-408e-4df1-8eaf-a232b27012b7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "72df1c65-408e-4df1-8eaf-a232b27012b7",
  "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
  "assignment_id": "81240549-6ada-4f76-873f-a87c2feea7ba",
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
  "session_id": "fab36491-c6a3-4b28-8547-eaf9aa21f552",
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
  "last_heartbeat_at": "2026-10-30T13:03:09.087717Z",
  "last_location_at": "2026-10-30T13:03:09.087717Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/fab36491-c6a3-4b28-8547-eaf9aa21f552/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:12Z",
    "sequence": 1793365392397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fab36491-c6a3-4b28-8547-eaf9aa21f552",
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
  "last_heartbeat_at": "2026-10-30T13:03:12.415952Z",
  "last_location_at": "2026-10-30T13:03:12.415952Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/72df1c65-408e-4df1-8eaf-a232b27012b7/arrive` → **200**

```json
{
  "command_id": "1d19989e-26f2-4922-b89c-8bbfc79367ae",
  "expected_version": 0
}
```

```json
{
  "id": "72df1c65-408e-4df1-8eaf-a232b27012b7",
  "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
  "assignment_id": "81240549-6ada-4f76-873f-a87c2feea7ba",
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
  "arrived_at": "2026-10-30T13:03:12.712221Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/72df1c65-408e-4df1-8eaf-a232b27012b7/start` → **200**

```json
{
  "command_id": "fcaa9ef3-f801-4859-986f-512421f3f008",
  "expected_version": 1
}
```

```json
{
  "id": "72df1c65-408e-4df1-8eaf-a232b27012b7",
  "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
  "assignment_id": "81240549-6ada-4f76-873f-a87c2feea7ba",
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
  "arrived_at": "2026-10-30T13:03:12.712221Z",
  "started_at": "2026-10-30T13:03:13.021465Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/72df1c65-408e-4df1-8eaf-a232b27012b7/complete` → **200**

```json
{
  "command_id": "1103fb74-a46f-4dfa-b433-127e1ba11eee",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:03:13Z"
}
```

```json
{
  "id": "72df1c65-408e-4df1-8eaf-a232b27012b7",
  "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
  "assignment_id": "81240549-6ada-4f76-873f-a87c2feea7ba",
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
  "arrived_at": "2026-10-30T13:03:12.712221Z",
  "started_at": "2026-10-30T13:03:13.021465Z",
  "completed_at": "2026-10-30T13:03:13.321897Z",
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
    "id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:03:10.895297Z",
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
    "id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:03:05.679113Z",
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

`GET /api/operator/v1/orders/572fb03f-54d0-40fe-af87-e6b40d66b1e0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:03:05.679692Z",
      "actor": {
        "type": "CLIENT",
        "id": "7e610aa0-1961-4867-a182-32be9174f878",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
        "quote_id": "98dc1b4a-4359-4bfb-b68e-532858cfb013",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "fc44c559-139c-432d-bcdd-ba2c3a45e40c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:03:05.68163Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
        "attempt_id": "a1257149-0159-4ab6-93f0-74b7d8815017",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fc44c559-139c-432d-bcdd-ba2c3a45e40c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:03:05.684388Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9a25ba72-2721-44a9-a671-c8e431524783",
        "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "fc44c559-139c-432d-bcdd-ba2c3a45e40c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:03:06.295438Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9a25ba72-2721-44a9-a671-c8e431524783",
        "order_id": "572fb03f-54d0-40fe-af87-e6b40d66b1e0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "380813fd-97dc-4dad-a128-3b467e2db369"
      },
      "correlation_id": "50184d52-c3d6-465b-a360-67897dafcd2c"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/bf835661-a7a1-41b9-8929-07393a48d3c0/tip` → **200**

```json
{
  "order_id": "bf835661-a7a1-41b9-8929-07393a48d3c0",
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
  "available_until": "2026-10-31T13:03:13.321897Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/bf835661-a7a1-41b9-8929-07393a48d3c0/tip` → **409**

```json
{
  "command_id": "78110fe5-6588-4ff1-a46f-80f5d17ea443",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/bf835661-a7a1-41b9-8929-07393a48d3c0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d30e5186-2738-4bca-b086-593d5acbfd9b"
}
```

Done: interrupted 572fb03f-54d0-40fe-af87-e6b40d66b1e0, follow-up bf835661-a7a1-41b9-8929-07393a48d3c0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9769c101-d538-4cb5-a4c2-02645a71af60",
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
  "last_heartbeat_at": "2026-10-30T13:03:07.837365Z",
  "last_location_at": "2026-10-30T13:03:07.837365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9769c101-d538-4cb5-a4c2-02645a71af60/close` → **200**

```json
{
  "command_id": "06396cbe-aedc-4f4f-94fa-6d2a46341e3a",
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
  "session_id": "fab36491-c6a3-4b28-8547-eaf9aa21f552",
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
  "last_heartbeat_at": "2026-10-30T13:03:12.415952Z",
  "last_location_at": "2026-10-30T13:03:12.415952Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fab36491-c6a3-4b28-8547-eaf9aa21f552/close` → **200**

```json
{
  "command_id": "bc1443e1-bd9a-4e01-8abd-84e551ac76e9",
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
  "session_id": "d4e61513-3fc7-4755-83d8-7d35f0ce140a",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYyOTksImlhdCI6MTc5MzM2NTM5OSwianRpIjoiM2Y3ODA0ZDQtMTkzOC00NDRjLTk5YmUtMWI2Yjc3ZWI4MDU1Iiwic2lkIjoiZDRlNjE1MTMtM2ZjNy00NzU1LTgzZDgtN2QzNWYwY2UxNDBhIn0.XzEQcXfuoy481SWdA4qIIEK3mmjPdRCUAzHihT5LDCY",
  "access_expires_at": "2026-10-30T13:18:19.593364532Z",
  "refresh_token": "2W6A7Grol5o7ceIEEs0Qs9D-JVwjl5yTWI22PLlQJ0c",
  "refresh_expires_at": "2026-10-31T01:03:19.59282861Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5a60790b-8c5b-4292-b76d-523704903bcb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:03:19Z"
}
```

```json
{
  "id": "f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:03:19Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f74b5d0f-5126-4ac7-a1a4-0569d3e04157/publish` → **200**

```json
{
  "command_id": "42c58cb6-1d53-4487-af4c-5ee8f68d4208",
  "expected_version": 0
}
```

```json
{
  "id": "f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:03:20.183959Z",
  "published_at": "2026-10-30T13:03:20.183959Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:03:20.183959Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634771124",
  "device_ref": "sandbox-28214"
}
```

```json
{
  "challenge_id": "5e7c7e35-6ec1-4c42-a57f-0de9f46b7851",
  "expires_at": "2026-10-30T13:08:20.758562111Z",
  "resend_available_at": "2026-10-30T13:03:21.758562111Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634771124` → **200**

```json
{
  "phone": "+380634771124",
  "audience": "CLIENT",
  "code": "891352",
  "sent_at": "2026-10-30T13:03:20.761736837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e7c7e35-6ec1-4c42-a57f-0de9f46b7851",
  "code": "891352",
  "device_ref": "sandbox-28214"
}
```

```json
{
  "session_id": "666a8c9f-ddf5-4406-b8d1-ffa216061f94",
  "subject": {
    "type": "CLIENT",
    "id": "5a31f459-23d0-4edd-8065-05544658eef5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTMxZjQ1OS0yM2QwLTRlZGQtODA2NS0wNTU0NDY1OGVlZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzAxLCJpYXQiOjE3OTMzNjU0MDEsImp0aSI6IjJlZTZjYjQ4LWZkZTUtNDgwMS1hYWJmLTllZjgwNDAyYjBlZSIsInNpZCI6IjY2NmE4YzlmLWRkZjUtNDQwNi1iOGQxLWZmYTIxNjA2MWY5NCJ9.5QUzHnzabxdcifKiPVv8IJgblkreZRfVhFMP1preodc",
  "access_expires_at": "2026-10-30T13:18:21.077058797Z",
  "refresh_token": "NafveGnC55WyYnsYy0KUw2ZdZahR_4YDeZXPAJ4A5_M",
  "refresh_expires_at": "2026-11-29T13:03:21.076516215Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:03:20.183959Z",
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
  "command_id": "58c3c0ac-1825-4f76-9ea5-5d1178aafb57",
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
  "id": "ce724a0c-e01f-4315-bfae-83fb57470a96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:21.652186Z",
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
  "command_id": "f7a7c506-e974-4cde-8da6-e1f5e8a6929d",
  "quote_id": "ce724a0c-e01f-4315-bfae-83fb57470a96",
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
  "correlation_id": "301358e4-7eaa-4cb2-8967-3d788483e329"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "508e4648-a34e-4d17-9e63-f74fc9bfd5ae",
  "version_id": "f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
  "language": "uk"
}
```

```json
{
  "version_id": "f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:03:22.267783Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bf819dd1-ded6-40a8-921f-f510a4b09a29",
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
  "id": "d3792c48-987a-4ab4-9e11-0001f60e2c40",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:22.566193Z",
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
  "command_id": "3270ae7f-ad4e-4d4e-a2e3-7692985ec34c",
  "quote_id": "d3792c48-987a-4ab4-9e11-0001f60e2c40",
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
  "id": "43003730-9a34-4c2f-be3e-0074f8fe6b50",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a31f459-23d0-4edd-8065-05544658eef5",
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
  "created_at": "2026-10-30T13:03:22.870187Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43003730-9a34-4c2f-be3e-0074f8fe6b50` → **200**

```json
{
  "id": "43003730-9a34-4c2f-be3e-0074f8fe6b50",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a31f459-23d0-4edd-8065-05544658eef5",
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
  "created_at": "2026-10-30T13:03:22.870187Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/43003730-9a34-4c2f-be3e-0074f8fe6b50/cancel` → **200**

```json
{
  "command_id": "5a560810-cbc4-44fd-b7c7-13e55836fd1b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "43003730-9a34-4c2f-be3e-0074f8fe6b50",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5a31f459-23d0-4edd-8065-05544658eef5",
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
  "created_at": "2026-10-30T13:03:22.870187Z",
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

`POST /api/admin/v1/legal-documents/f74b5d0f-5126-4ac7-a1a4-0569d3e04157` → **409**

```json
{
  "command_id": "c42eafd0-67f1-4244-874a-8ecd7eb7c0ea",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:03:23Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/f74b5d0f-5126-4ac7-a1a4-0569d3e04157",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "faf96c8b-e875-4d44-9ddd-7646d5db7e9a"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2e46ce9f-3553-4062-8b18-d14f7972b6c9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:03:24Z"
}
```

```json
{
  "id": "acaa3a06-fe16-4b4b-874d-7ba5c8e4c803",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:03:24Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/acaa3a06-fe16-4b4b-874d-7ba5c8e4c803/publish` → **200**

```json
{
  "command_id": "59a8c29a-52d5-4b76-9d72-faa3124664c6",
  "expected_version": 0
}
```

```json
{
  "id": "acaa3a06-fe16-4b4b-874d-7ba5c8e4c803",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:03:24.437302Z",
  "published_at": "2026-10-30T13:03:24.437302Z",
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
  "device_ref": "sandbox-8986"
}
```

```json
{
  "challenge_id": "1fb13dc7-7182-4bd7-bfaf-a226a384d479",
  "expires_at": "2026-10-30T13:08:24.737338446Z",
  "resend_available_at": "2026-10-30T13:03:25.737338446Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "446888",
  "sent_at": "2026-10-30T13:03:24.739998139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fb13dc7-7182-4bd7-bfaf-a226a384d479",
  "code": "446888",
  "device_ref": "sandbox-8986"
}
```

```json
{
  "session_id": "4a90ed6f-3554-48e1-8942-e95ffa2e12e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjMwNSwiaWF0IjoxNzkzMzY1NDA1LCJqdGkiOiJjNzQ1YjNjNS1iMjlkLTQ5M2EtOTk1NS1jNmQwMWYzOWE3ZjEiLCJzaWQiOiI0YTkwZWQ2Zi0zNTU0LTQ4ZTEtODk0Mi1lOTVmZmEyZTEyZTkifQ._Dk6v6UJLxvXg9pA4lQDbaJYLVhfo7fbfuSfh7pJ4lM",
  "access_expires_at": "2026-10-30T13:18:25.069476246Z",
  "refresh_token": "oGZWbFMJFzDaToc1Pxuob5DrrYjFApmfIfrJoOfqA1U",
  "refresh_expires_at": "2026-11-29T13:03:25.068966723Z",
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
  "command_id": "e087fb48-37af-4e7f-ac46-b173d55a0f58",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:25Z",
    "sequence": 1793365405656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "70a73698-73c7-4fdc-a57f-483f75c9327b",
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
  "last_heartbeat_at": "2026-10-30T13:03:25.674508Z",
  "last_location_at": "2026-10-30T13:03:25.674508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673311721",
  "device_ref": "sandbox-28927"
}
```

```json
{
  "challenge_id": "9eb57011-23d1-464e-b43b-1b3411d675a4",
  "expires_at": "2026-10-30T13:08:25.962478562Z",
  "resend_available_at": "2026-10-30T13:03:26.962478562Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673311721` → **200**

```json
{
  "phone": "+380673311721",
  "audience": "CLIENT",
  "code": "921988",
  "sent_at": "2026-10-30T13:03:25.965219039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9eb57011-23d1-464e-b43b-1b3411d675a4",
  "code": "921988",
  "device_ref": "sandbox-28927"
}
```

```json
{
  "session_id": "cd67ac37-51bd-448b-8de9-e157bb9dbec9",
  "subject": {
    "type": "CLIENT",
    "id": "70f22673-a248-48dd-af5a-7dffa1af0c87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGYyMjY3My1hMjQ4LTQ4ZGQtYWY1YS03ZGZmYTFhZjBjODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzA2LCJpYXQiOjE3OTMzNjU0MDYsImp0aSI6IjgxYWFlYzRlLTNkYjEtNDI0Ni1hNzVlLWYzYzUwMmI3NDcxMCIsInNpZCI6ImNkNjdhYzM3LTUxYmQtNDQ4Yi04ZGU5LWUxNTdiYjlkYmVjOSJ9.o6JNm2RnQEP1g5mlme0QHuZC8rZF3TsthV2JyzbDKHs",
  "access_expires_at": "2026-10-30T13:18:26.285171114Z",
  "refresh_token": "D8pYw46J-29JK1Fs5itpw8-aJRRAhKV6dEO44aMmwfI",
  "refresh_expires_at": "2026-11-29T13:03:26.284636374Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "416b07d5-751e-4578-9394-c7c04f975593",
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
  "id": "c61480b0-fad3-44ef-b01e-51622227503f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:26.592220Z",
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
  "command_id": "c88d4157-145d-457c-84e2-ac49eb73182a",
  "quote_id": "c61480b0-fad3-44ef-b01e-51622227503f",
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
    "phone": "+380671781222"
  }
}
```

```json
{
  "id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:03:26.906181Z",
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
    "id": "30229f99-59aa-46fd-ae7d-5c1678faf516",
    "order_id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
    "expires_at": "2026-10-30T13:03:41.91022Z",
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

`POST /api/driver/v1/offers/30229f99-59aa-46fd-ae7d-5c1678faf516/accept` → **200**

```json
{
  "command_id": "f81d0e13-4bf9-458a-864f-08a578d90544"
}
```

```json
{
  "id": "67d2472b-d99d-4aab-9bc9-2d96547f3016",
  "order_id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc6d6463-e92b-4e89-8bac-58eecc188928",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc6d6463-e92b-4e89-8bac-58eecc188928",
  "order_id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
  "assignment_id": "67d2472b-d99d-4aab-9bc9-2d96547f3016",
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
    "phone": "+380671781222"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7bcc6b72-a2cd-467e-9998-972b9c5faa67",
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
  "id": "8598fe0e-4f85-4435-8d51-bbc08b7679b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:28.107458Z",
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
  "command_id": "670cdfde-56c4-41d0-8cc3-1a9f68bce9e1",
  "quote_id": "8598fe0e-4f85-4435-8d51-bbc08b7679b2",
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
  "id": "833ecc8f-e0cd-47be-b405-f619a6c1ba34",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:03:28.422827Z",
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
  "command_id": "4e993cea-1782-4c03-8330-aea1ab8bfe6e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:03:28Z"
}
```

```json
{
  "id": "189c1035-98ac-45b9-b87d-5295a4c9f9b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:28.768653Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:03:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2ceb3d0c-3f08-4898-afa1-aeec0f30ff24",
  "quote_id": "189c1035-98ac-45b9-b87d-5295a4c9f9b9",
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
  "pickup_at": "2026-10-30T16:03:28Z"
}
```

```json
{
  "id": "249544e3-2146-46fd-beb5-1cce8eea7f03",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:03:29.073847Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:03:28Z",
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
  "command_id": "6858e962-2b9e-4a12-9123-fa526f46f449",
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
  "id": "fec9ca00-119e-4f82-a552-26be2ef32297",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:29.394064Z",
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
  "command_id": "a7f99201-353c-4b7a-be83-78e3e5711115",
  "quote_id": "fec9ca00-119e-4f82-a552-26be2ef32297",
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
  "correlation_id": "b26232d0-6ffe-44bf-8b2f-bb5a0eafa8f6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "249544e3-2146-46fd-beb5-1cce8eea7f03",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:03:29.073847Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:03:28Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "833ecc8f-e0cd-47be-b405-f619a6c1ba34",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:03:28.422827Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "833ecc8f-e0cd-47be-b405-f619a6c1ba34",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:03:28.422827Z",
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

`GET /api/rider/v1/orders/cc834e34-1cb3-4b5c-8a29-f7aed4b72aed` → **200**

```json
{
  "id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "67d2472b-d99d-4aab-9bc9-2d96547f3016",
    "order_id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dc6d6463-e92b-4e89-8bac-58eecc188928",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:03:26.906181Z",
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
    "location_at": "2026-10-30T13:03:25.674508Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/cc834e34-1cb3-4b5c-8a29-f7aed4b72aed/cancel` → **200**

```json
{
  "command_id": "99358d8f-8b22-4d9e-9974-f2fe9fbfcc8b",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "67d2472b-d99d-4aab-9bc9-2d96547f3016",
    "order_id": "cc834e34-1cb3-4b5c-8a29-f7aed4b72aed",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dc6d6463-e92b-4e89-8bac-58eecc188928",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:03:26.906181Z",
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

`GET /api/rider/v1/orders/833ecc8f-e0cd-47be-b405-f619a6c1ba34` → **200**

```json
{
  "id": "833ecc8f-e0cd-47be-b405-f619a6c1ba34",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:03:28.422827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/833ecc8f-e0cd-47be-b405-f619a6c1ba34/cancel` → **200**

```json
{
  "command_id": "58dfcfc2-edd9-4aed-a7f7-3e8eb9ad69ac",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "833ecc8f-e0cd-47be-b405-f619a6c1ba34",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:03:28.422827Z",
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

`GET /api/rider/v1/orders/249544e3-2146-46fd-beb5-1cce8eea7f03` → **200**

```json
{
  "id": "249544e3-2146-46fd-beb5-1cce8eea7f03",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:03:29.073847Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:03:28Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/249544e3-2146-46fd-beb5-1cce8eea7f03/cancel` → **200**

```json
{
  "command_id": "24882e96-3ec6-4af2-83fb-abf3063ab837",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "249544e3-2146-46fd-beb5-1cce8eea7f03",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "70f22673-a248-48dd-af5a-7dffa1af0c87",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:03:29.073847Z",
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
  "pickup_at": "2026-10-30T16:03:28Z",
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
  "session_id": "70a73698-73c7-4fdc-a57f-483f75c9327b",
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
  "last_heartbeat_at": "2026-10-30T13:03:25.674508Z",
  "last_location_at": "2026-10-30T13:03:25.674508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/70a73698-73c7-4fdc-a57f-483f75c9327b/close` → **200**

```json
{
  "command_id": "163a3896-c285-4475-8043-478ac80eeba0",
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

Done: orders cc834e34-1cb3-4b5c-8a29-f7aed4b72aed, 833ecc8f-e0cd-47be-b405-f619a6c1ba34, 249544e3-2146-46fd-beb5-1cce8eea7f03.

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
  "session_id": "62819818-c71b-493e-aeaa-5737f8b2bf0a",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzMTMsImlhdCI6MTc5MzM2NTQxMywianRpIjoiMTY4N2RjM2QtYzkyYi00ZTA3LWI5NzAtNGNhZGY2MDIyN2UzIiwic2lkIjoiNjI4MTk4MTgtYzcxYi00OTNlLWFlYWEtNTczN2Y4YjJiZjBhIn0.Xi-6G6t-_x8oi36ibOxzxCal6SG4_4xVRHJqFHNZZ_k",
  "access_expires_at": "2026-10-30T13:18:33.326064706Z",
  "refresh_token": "Uska6waKZ4vgnibxc1BZ8n5xlzdz9wXyQaDihQZRBlA",
  "refresh_expires_at": "2026-10-31T01:03:33.325245093Z",
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
  "session_id": "2c21d15b-2664-4f83-9469-563e2c36453d",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzMTMsImlhdCI6MTc5MzM2NTQxMywianRpIjoiYzI1MDgxZjUtM2Y0NC00ZTA0LWFlMTQtNTRiNjhjMGU0ZjVjIiwic2lkIjoiMmMyMWQxNWItMjY2NC00ZjgzLTk0NjktNTYzZTJjMzY0NTNkIn0.WTuE21w1M18vpbj5quj9kHPkNYdE1bVGy4UsAem-Rf8",
  "access_expires_at": "2026-10-30T13:18:33.913586227Z",
  "refresh_token": "Ntw60elLepIfX0Dinqia1HUyJv97067YxnkPePkI2sg",
  "refresh_expires_at": "2026-10-31T01:03:33.912998079Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24093"
}
```

```json
{
  "challenge_id": "170d1d9c-d641-42e8-a4ce-b10aa05188e5",
  "expires_at": "2026-10-30T13:08:34.194889637Z",
  "resend_available_at": "2026-10-30T13:03:35.194889637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "935537",
  "sent_at": "2026-10-30T13:03:34.197676386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "170d1d9c-d641-42e8-a4ce-b10aa05188e5",
  "code": "935537",
  "device_ref": "sandbox-24093"
}
```

```json
{
  "session_id": "5b3b7f5a-98aa-45a9-a602-d95c52cafc30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjMxNCwiaWF0IjoxNzkzMzY1NDE0LCJqdGkiOiI5NjZhYmRiMC05OGNhLTRlYjEtODVmYS1lYTFlZGViN2UzMDUiLCJzaWQiOiI1YjNiN2Y1YS05OGFhLTQ1YTktYTYwMi1kOTVjNTJjYWZjMzAifQ.nxRVveOJzC70xLb3Ch7U7kEDIaW4l3YRPxxlxhWa5Oo",
  "access_expires_at": "2026-10-30T13:18:34.512782521Z",
  "refresh_token": "7tvrzaGjUxZri1Ln-l7bk6kvb9uflwaggY-kffhIQKw",
  "refresh_expires_at": "2026-11-29T13:03:34.512253743Z",
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
  "command_id": "3a2227e5-851a-4104-a3dd-d6739db2c3f0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:35Z",
    "sequence": 1793365415669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02fb8ca9-a79c-4611-b926-76764c8a8bc9",
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
  "last_heartbeat_at": "2026-10-30T13:03:35.085459Z",
  "last_location_at": "2026-10-30T13:03:35.085459Z",
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
  "command_id": "4795fc16-d5c1-4c80-bca6-f615982f88c3",
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
  "effective_at": "2026-10-30T13:03:35.687658Z",
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:00:58.081913Z",
  "last_entries": [
    {
      "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:00:58.081913Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "63ada608-b338-47d6-9d05-da76532dc7c1",
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
  "id": "3de7ff78-6934-4112-aca2-42368a9dc00f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:36.288535Z",
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
  "command_id": "f9b8bde2-e91e-4ff5-b3ba-9de39034adff",
  "quote_id": "3de7ff78-6934-4112-aca2-42368a9dc00f",
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
    "phone": "+3806711131750"
  }
}
```

```json
{
  "id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
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
  "created_at": "2026-10-30T13:03:36.621515Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131750"
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
    "id": "3e5c416b-4616-40ad-a47d-e51feb352e96",
    "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
    "expires_at": "2026-10-30T13:03:51.625616Z",
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

`POST /api/driver/v1/offers/3e5c416b-4616-40ad-a47d-e51feb352e96/accept` → **200**

```json
{
  "command_id": "593d9f32-7884-4c5d-84bc-c9f72eaa931e"
}
```

```json
{
  "id": "0a44ab73-5134-4439-a965-efce5e54003a",
  "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c03713aa-7ba3-41fe-bf18-fce7a55291d1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c03713aa-7ba3-41fe-bf18-fce7a55291d1",
  "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
  "assignment_id": "0a44ab73-5134-4439-a965-efce5e54003a",
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
    "phone": "+3806711131750"
  }
}
```

`POST /api/driver/v1/work-sessions/02fb8ca9-a79c-4611-b926-76764c8a8bc9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:03:37Z",
    "sequence": 1793365417872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02fb8ca9-a79c-4611-b926-76764c8a8bc9",
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
  "last_heartbeat_at": "2026-10-30T13:03:37.891551Z",
  "last_location_at": "2026-10-30T13:03:37.891551Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c03713aa-7ba3-41fe-bf18-fce7a55291d1/arrive` → **200**

```json
{
  "command_id": "f2c4af40-0834-4a64-a725-7156d7e5e62c",
  "expected_version": 0
}
```

```json
{
  "id": "c03713aa-7ba3-41fe-bf18-fce7a55291d1",
  "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
  "assignment_id": "0a44ab73-5134-4439-a965-efce5e54003a",
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
  "arrived_at": "2026-10-30T13:03:38.198722Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131750"
  }
}
```

`POST /api/driver/v1/trips/c03713aa-7ba3-41fe-bf18-fce7a55291d1/start` → **200**

```json
{
  "command_id": "57e95470-4674-431c-b959-731aeb532bbc",
  "expected_version": 1
}
```

```json
{
  "id": "c03713aa-7ba3-41fe-bf18-fce7a55291d1",
  "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
  "assignment_id": "0a44ab73-5134-4439-a965-efce5e54003a",
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
  "arrived_at": "2026-10-30T13:03:38.198722Z",
  "started_at": "2026-10-30T13:03:38.516454Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131750"
  }
}
```

`POST /api/driver/v1/trips/c03713aa-7ba3-41fe-bf18-fce7a55291d1/complete` → **200**

```json
{
  "command_id": "77c21d4a-bff1-4dfe-a986-c1e65cd4d05e",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:03:38Z",
  "cash_received": true
}
```

```json
{
  "id": "c03713aa-7ba3-41fe-bf18-fce7a55291d1",
  "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
  "assignment_id": "0a44ab73-5134-4439-a965-efce5e54003a",
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
  "arrived_at": "2026-10-30T13:03:38.198722Z",
  "started_at": "2026-10-30T13:03:38.516454Z",
  "completed_at": "2026-10-30T13:03:38.835603Z",
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
  "command_id": "87decaa5-00d1-40f9-8b85-0c72b44d4b7c",
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
  "id": "eca238f0-a6b7-4916-884d-96cba3225b12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:39.151804Z",
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
  "command_id": "3db17254-fde2-4f1f-af9c-7e3a53527c72",
  "quote_id": "eca238f0-a6b7-4916-884d-96cba3225b12",
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
    "phone": "+3806711112524"
  }
}
```

```json
{
  "id": "c722aa2f-b0da-410f-959a-0fbc95517542",
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
  "created_at": "2026-10-30T13:03:39.464172Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112524"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c722aa2f-b0da-410f-959a-0fbc95517542` → **200**

```json
{
  "id": "c722aa2f-b0da-410f-959a-0fbc95517542",
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
  "created_at": "2026-10-30T13:03:39.464172Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112524"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c722aa2f-b0da-410f-959a-0fbc95517542/cancel` → **200**

```json
{
  "command_id": "ee1e52d1-80e1-4559-906e-308a68b6880f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "c722aa2f-b0da-410f-959a-0fbc95517542",
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
  "created_at": "2026-10-30T13:03:39.464172Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112524"
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
  "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:00:58.081913Z",
  "last_entries": [
    {
      "order_id": "c722aa2f-b0da-410f-959a-0fbc95517542",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:03:40.10927Z"
    },
    {
      "order_id": "2bb6a10d-88d0-48a1-bf42-1093df4644b2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:03:38.841885Z"
    },
    {
      "order_id": "de205c55-6309-4f57-9c96-e0e60375b684",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:00:58.081913Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02fb8ca9-a79c-4611-b926-76764c8a8bc9",
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
  "last_heartbeat_at": "2026-10-30T13:03:37.891551Z",
  "last_location_at": "2026-10-30T13:03:37.891551Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02fb8ca9-a79c-4611-b926-76764c8a8bc9/close` → **200**

```json
{
  "command_id": "cd62df90-32dd-4bd5-860d-eb331d2ff346",
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

Done: operator bonus for fulfilled 2bb6a10d-88d0-48a1-bf42-1093df4644b2 and operator-fault cancellation c722aa2f-b0da-410f-959a-0fbc95517542.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677318135",
  "device_ref": "sandbox-27529"
}
```

```json
{
  "challenge_id": "164180f5-fba2-4b26-9051-c4b60ece2e3a",
  "expires_at": "2026-10-30T13:08:44.512738717Z",
  "resend_available_at": "2026-10-30T13:03:45.512738717Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677318135` → **200**

```json
{
  "phone": "+380677318135",
  "audience": "CLIENT",
  "code": "495628",
  "sent_at": "2026-10-30T13:03:44.515546548Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674728770",
  "device_ref": "sandbox-17493",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "bce70b9a-ccdd-4c00-b20f-88a5a7350682",
  "expires_at": "2026-10-30T13:08:46.038179293Z",
  "resend_available_at": "2026-10-30T13:03:47.038179293Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674728770` → **200**

```json
{
  "phone": "+380674728770",
  "audience": "CLIENT",
  "code": "270402",
  "sent_at": "2026-10-30T13:03:46.041292497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674728770",
  "device_ref": "sandbox-5298",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e12a21e4-ee31-495e-a5e7-ca5158b9b037",
  "expires_at": "2026-10-30T13:08:47.558877135Z",
  "resend_available_at": "2026-10-30T13:03:48.558877135Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674728770` → **200**

```json
{
  "phone": "+380674728770",
  "audience": "CLIENT",
  "code": "339063",
  "sent_at": "2026-10-30T13:03:47.561729508Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675990000",
  "device_ref": "sandbox-19187"
}
```

```json
{
  "challenge_id": "d35e9b61-7d12-4219-bc5d-cdfb2af33ec9",
  "expires_at": "2026-10-30T13:08:49.078182219Z",
  "resend_available_at": "2026-10-30T13:03:50.078182219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675990000",
  "device_ref": "sandbox-26942"
}
```

```json
{
  "challenge_id": "146c029b-12a5-45d0-a20d-b0cd47a7cbfb",
  "expires_at": "2026-10-30T13:08:50.568547648Z",
  "resend_available_at": "2026-10-30T13:03:51.568547648Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675990000` → **200**

```json
{
  "phone": "+380675990000",
  "audience": "CLIENT",
  "code": "649862",
  "sent_at": "2026-10-30T13:03:50.571545042Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675990000",
  "device_ref": "sandbox-30281",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6557ec0c-205a-4b0c-9186-3d8c72aebccf",
  "expires_at": "2026-10-30T13:08:52.090205449Z",
  "resend_available_at": "2026-10-30T13:03:53.090205449Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675990000` → **200**

```json
{
  "phone": "+380675990000",
  "audience": "CLIENT",
  "code": "537321",
  "sent_at": "2026-10-30T13:03:52.093008828Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675990000",
  "device_ref": "sandbox-27270",
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
  "correlation_id": "e3b45ee9-5d91-4660-8b9c-e2a99ffa4ae1",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000011125"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "4c521643-d656-4fc1-96db-911e3bdbd6ff"
}
```

`GET /sandbox/v1/otp?phone=%2B442000011125` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120017318"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "ae569b1f-7857-4b88-9f5d-9256b8cabca0"
}
```

`GET /sandbox/v1/otp?phone=%2B37120017318` → **404**

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
  "session_id": "50a057ad-8df1-42cb-838a-05e02f6516d2",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzMzQsImlhdCI6MTc5MzM2NTQzNCwianRpIjoiZmNkYzczZDQtN2Y1My00NjQ0LWIxY2YtMGFiNzliYTJjMTVjIiwic2lkIjoiNTBhMDU3YWQtOGRmMS00MmNiLTgzOGEtMDVlMDJmNjUxNmQyIn0.VFAizPzc5vf4B-KCp5I2Q49uoBQGBZLCRUQKbPv3eGA",
  "access_expires_at": "2026-10-30T13:18:54.825262752Z",
  "refresh_token": "AN_6vel0uzbiCGtllzUjcaE7nuwS1fXlByc49NSD3RM",
  "refresh_expires_at": "2026-10-31T01:03:54.824721117Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675990000` → **200**

```json
{
  "deliveries": [
    {
      "id": "06a643e3-ee9e-4149-9859-265e391dfe65",
      "challenge_id": "6557ec0c-205a-4b0c-9186-3d8c72aebccf",
      "phone": "+380675990000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3740fe46-1153-495a-b417-1434a249947b",
      "error": null,
      "attempted_at": "2026-10-30T13:03:52.093412Z"
    },
    {
      "id": "180a41ef-0d01-4add-8088-cdab2ca45cf9",
      "challenge_id": "146c029b-12a5-45d0-a20d-b0cd47a7cbfb",
      "phone": "+380675990000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0367f66e-4d05-4881-9879-76667d947b84",
      "error": null,
      "attempted_at": "2026-10-30T13:03:50.571924Z"
    },
    {
      "id": "b7bc7122-ba38-47e4-bd3a-ae279ef9e0cc",
      "challenge_id": "d35e9b61-7d12-4219-bc5d-cdfb2af33ec9",
      "phone": "+380675990000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:03:49.081101Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675990000` → **200**

```json
{
  "phone": "+380675990000",
  "audience": "CLIENT",
  "code": "537321",
  "sent_at": "2026-10-30T13:03:52.093008828Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674728770` → **200**

```json
{
  "deliveries": [
    {
      "id": "7a798505-3211-4cef-ba52-ca179ec7b489",
      "challenge_id": "e12a21e4-ee31-495e-a5e7-ca5158b9b037",
      "phone": "+380674728770",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f0551ce2-7e99-4a72-93ab-021660f8b617",
      "error": null,
      "attempted_at": "2026-10-30T13:03:47.562032Z"
    },
    {
      "id": "df56ac7f-0d92-4255-a083-5a4ee6eda47d",
      "challenge_id": "bce70b9a-ccdd-4c00-b20f-88a5a7350682",
      "phone": "+380674728770",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-fa9465db-76e8-4fc0-8104-0340462e82ec",
      "error": null,
      "attempted_at": "2026-10-30T13:03:46.041833Z"
    }
  ]
}
```

Done: SMS to +380677318135; SMS then a call to +380674728770; a failed SMS, two calls and a refused third to +380675990000; +44 and +371 refused.

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
  "session_id": "589697d1-d177-4fe9-9c7d-41d0962360e9",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzMzYsImlhdCI6MTc5MzM2NTQzNiwianRpIjoiMDVjNTIwYjQtMDM1MC00OTdlLTk4ODktMDU4YTQ3ZGVjODc4Iiwic2lkIjoiNTg5Njk3ZDEtZDE3Ny00ZmU5LTljN2QtNDFkMDk2MjM2MGU5In0.qHXO8e__V7CrI529VQrRPrxKIxp6n9V5LeRNjl5riK0",
  "access_expires_at": "2026-10-30T13:18:56.00868829Z",
  "refresh_token": "NEYnEB9nvPIw_Bb-cpi9vV5UP1qZOorME42yb8392jY",
  "refresh_expires_at": "2026-10-31T01:03:56.008093568Z",
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
  "session_id": "af922bf6-fd5b-461d-8e22-16cda4dccdc4",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzMzYsImlhdCI6MTc5MzM2NTQzNiwianRpIjoiYzU0YjRkODctMmRjNS00NmFiLWJlZjMtOGVkNmVkNjg5NzliIiwic2lkIjoiYWY5MjJiZjYtZmQ1Yi00NjFkLThlMjItMTZjZGE0ZGNjZGM0In0.ETM8ZwWqC2Pgt8KrC0S42y58g4Mqg6VYpVZ59oax6Dc",
  "access_expires_at": "2026-10-30T13:18:56.583027574Z",
  "refresh_token": "qyrjmz5hOMkZsf_6h7qx3dfEBNWs1Tw2nw184z__x78",
  "refresh_expires_at": "2026-10-31T01:03:56.582476213Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
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

`POST /api/admin/v1/staff-extensions/b0ab69ef-2903-4892-9e16-543e0e7d9cc9` → **200**

```json
{
  "command_id": "86c18449-edae-4a11-b390-65f9a15294bb",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ab9f6ce7-a724-4bdc-9d67-5e90eb9f558a",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:03:57.747735Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:03:57.747735Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f6d514e4-b14a-4680-8d20-9e83a43b0254",
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
  "id": "dd56e104-ad32-4cda-a4be-471fa28bee6d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:08:58.326118Z",
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
  "command_id": "abdb20bb-9453-4152-bb14-d0471a8fd013",
  "quote_id": "dd56e104-ad32-4cda-a4be-471fa28bee6d",
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
    "phone": "+380676722741"
  }
}
```

```json
{
  "id": "10e2fe64-8cfa-4428-a3ee-97d3669536c6",
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
  "created_at": "2026-10-30T13:03:58.63644Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676722741"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/10e2fe64-8cfa-4428-a3ee-97d3669536c6/calls` → **201**

```json
{
  "command_id": "3e1e0e97-3ea2-44cd-929d-b99a4e298896",
  "to": "CALLER"
}
```

```json
{
  "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "order_ids": [
    "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
  ],
  "started_at": "2026-10-30T13:03:58.977644Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/10e2fe64-8cfa-4428-a3ee-97d3669536c6/calls` → **201**

```json
{
  "command_id": "3e1e0e97-3ea2-44cd-929d-b99a4e298896",
  "to": "CALLER"
}
```

```json
{
  "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "order_ids": [
    "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
  ],
  "started_at": "2026-10-30T13:03:58.977644Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676722741",
    "at": "2026-10-30T13:03:58.980003011Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.24646",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=10e2fe64-8cfa-4428-a3ee-97d3669536c6` → **200**

```json
{
  "calls": [
    {
      "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [
        "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
      ],
      "started_at": "2026-10-30T13:03:58.977644Z",
      "answered_at": "2026-10-30T13:03:59.66965Z",
      "ended_at": "2026-10-30T13:03:59.691693Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=10e2fe64-8cfa-4428-a3ee-97d3669536c6` → **200**

```json
{
  "calls": [
    {
      "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [
        "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
      ],
      "started_at": "2026-10-30T13:03:58.977644Z",
      "answered_at": "2026-10-30T13:03:59.66965Z",
      "ended_at": "2026-10-30T13:03:59.691693Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=10e2fe64-8cfa-4428-a3ee-97d3669536c6` → **200**

```json
{
  "calls": [
    {
      "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [
        "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
      ],
      "started_at": "2026-10-30T13:03:58.977644Z",
      "answered_at": "2026-10-30T13:03:59.66965Z",
      "ended_at": "2026-10-30T13:03:59.691693Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=10e2fe64-8cfa-4428-a3ee-97d3669536c6` → **200**

```json
{
  "calls": [
    {
      "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [
        "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
      ],
      "started_at": "2026-10-30T13:03:58.977644Z",
      "answered_at": "2026-10-30T13:03:59.66965Z",
      "ended_at": "2026-10-30T13:03:59.691693Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=10e2fe64-8cfa-4428-a3ee-97d3669536c6` → **200**

```json
{
  "calls": [
    {
      "id": "a7297596-648b-4d0e-b1d4-a13b0d5fbdfc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "order_ids": [
        "10e2fe64-8cfa-4428-a3ee-97d3669536c6"
      ],
      "started_at": "2026-10-30T13:03:58.977644Z",
      "answered_at": "2026-10-30T13:03:59.66965Z",
      "ended_at": "2026-10-30T13:03:59.691693Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:04:06.648291Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/10e2fe64-8cfa-4428-a3ee-97d3669536c6` → **200**

```json
{
  "id": "10e2fe64-8cfa-4428-a3ee-97d3669536c6",
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
  "created_at": "2026-10-30T13:03:58.63644Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676722741"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/10e2fe64-8cfa-4428-a3ee-97d3669536c6/cancel` → **200**

```json
{
  "command_id": "b124b554-a38e-41a4-8055-6e4c47929b7e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "10e2fe64-8cfa-4428-a3ee-97d3669536c6",
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
  "created_at": "2026-10-30T13:03:58.63644Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676722741"
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
  "command_id": "247dca05-fb85-4999-ac18-0983bb59f359",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:04:09.859768Z",
  "extension": "101"
}
```

Done: outgoing call a7297596-648b-4d0e-b1d4-a13b0d5fbdfc from order 10e2fe64-8cfa-4428-a3ee-97d3669536c6, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633439445",
  "device_ref": "sandbox-24931"
}
```

```json
{
  "challenge_id": "e8d386f2-0618-46a3-8b69-b6208193f1b0",
  "expires_at": "2026-10-30T13:09:10.168773627Z",
  "resend_available_at": "2026-10-30T13:04:11.168773627Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633439445` → **200**

```json
{
  "phone": "+380633439445",
  "audience": "CLIENT",
  "code": "885222",
  "sent_at": "2026-10-30T13:04:10.171547113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8d386f2-0618-46a3-8b69-b6208193f1b0",
  "code": "885222",
  "device_ref": "sandbox-24931"
}
```

```json
{
  "session_id": "24bacf14-5f09-47c0-9151-5008b0c09eb5",
  "subject": {
    "type": "CLIENT",
    "id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWMwYzk4ZS05M2QwLTQxMTktYWNkNC04YmIxOGZiNmE4NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzUwLCJpYXQiOjE3OTMzNjU0NTAsImp0aSI6ImEyNmYwOGZjLTRkNDYtNDk3MC04MWZiLTQxNDg1ZmIyYjFiYSIsInNpZCI6IjI0YmFjZjE0LTVmMDktNDdjMC05MTUxLTUwMDhiMGMwOWViNSJ9.o0l7jHnlCmqunXNddK-5jM_EC3ujFfwhfPaoad0SDKU",
  "access_expires_at": "2026-10-30T13:19:10.480162661Z",
  "refresh_token": "2nC3HESfzi9tbAKugD2Nibph7NUYRWVv6WaHSiRuDzA",
  "refresh_expires_at": "2026-11-29T13:04:10.479665292Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
  "session_id": "24bacf14-5f09-47c0-9151-5008b0c09eb5",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633439445",
  "device_ref": "sandbox-24467"
}
```

```json
{
  "challenge_id": "aefa9c1e-fc75-40d8-954e-99dfde5a67ed",
  "expires_at": "2026-10-30T13:09:13.057514804Z",
  "resend_available_at": "2026-10-30T13:04:14.057514804Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633439445` → **200**

```json
{
  "phone": "+380633439445",
  "audience": "CLIENT",
  "code": "409479",
  "sent_at": "2026-10-30T13:04:13.060242456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aefa9c1e-fc75-40d8-954e-99dfde5a67ed",
  "code": "409479",
  "device_ref": "sandbox-24467"
}
```

```json
{
  "session_id": "9857ca25-5399-4cbc-bcd0-53fcf0550503",
  "subject": {
    "type": "CLIENT",
    "id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWMwYzk4ZS05M2QwLTQxMTktYWNkNC04YmIxOGZiNmE4NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzUzLCJpYXQiOjE3OTMzNjU0NTMsImp0aSI6IjY0YmI3ZWNlLTVlZTYtNDYzYS05MGY2LTgwZDQ1ZGY0NmI4NSIsInNpZCI6Ijk4NTdjYTI1LTUzOTktNGNiYy1iY2QwLTUzZmNmMDU1MDUwMyJ9.8BdkMsW9x0ID0x7z-Z0RuPwVW4uAQSsr2917cUdJbcQ",
  "access_expires_at": "2026-10-30T13:19:13.3789857Z",
  "refresh_token": "jh92hKag-nm6NaVi4WSJFDicu__vaLYFTd7woQEAe6c",
  "refresh_expires_at": "2026-11-29T13:04:13.37847745Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "3024e68c-fc5e-4f60-8f86-4b6ad4822779",
  "expires_at": "2026-10-30T13:09:15.67738275Z",
  "resend_available_at": "2026-10-30T13:04:16.67738275Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633439445` → **200**

```json
{
  "phone": "+380633439445",
  "audience": "CLIENT",
  "code": "045763",
  "sent_at": "2026-10-30T13:04:15.680606076Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635846909"
}
```

```json
{
  "challenge_id": "5002e6be-323d-4105-ac8e-5ee3cf621823",
  "expires_at": "2026-10-30T13:09:15.999893249Z",
  "resend_available_at": "2026-10-30T13:04:16.999893249Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635846909` → **200**

```json
{
  "phone": "+380635846909",
  "audience": "CLIENT",
  "code": "875982",
  "sent_at": "2026-10-30T13:04:16.002181091Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "fffc2559-48b1-47ef-a4e0-d60bcd9e63cd",
  "current_challenge_id": "3024e68c-fc5e-4f60-8f86-4b6ad4822779",
  "current_code": "000000",
  "new_challenge_id": "5002e6be-323d-4105-ac8e-5ee3cf621823",
  "new_code": "875982"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "efaedc04-55de-47d3-9368-f9f01f480b48"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "606e84fb-d660-46b8-a730-1c53093086f5",
  "current_challenge_id": "3024e68c-fc5e-4f60-8f86-4b6ad4822779",
  "current_code": "045763",
  "new_challenge_id": "5002e6be-323d-4105-ac8e-5ee3cf621823",
  "new_code": "875982"
}
```

```json
{
  "subject_id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
  "phone": "+380635846909",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
  "session_id": "24bacf14-5f09-47c0-9151-5008b0c09eb5",
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
  "correlation_id": "14089923-71e7-477c-9409-ac0c71ea38dc"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635846909",
  "device_ref": "sandbox-20816"
}
```

```json
{
  "challenge_id": "dda29b5f-9b8e-46a2-86a4-deb2e6ae620d",
  "expires_at": "2026-10-30T13:09:19.51594877Z",
  "resend_available_at": "2026-10-30T13:04:20.51594877Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635846909` → **200**

```json
{
  "phone": "+380635846909",
  "audience": "CLIENT",
  "code": "273627",
  "sent_at": "2026-10-30T13:04:19.518474244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dda29b5f-9b8e-46a2-86a4-deb2e6ae620d",
  "code": "273627",
  "device_ref": "sandbox-20816"
}
```

```json
{
  "session_id": "b5e41071-f776-44b1-84fe-502aa71eea52",
  "subject": {
    "type": "CLIENT",
    "id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWMwYzk4ZS05M2QwLTQxMTktYWNkNC04YmIxOGZiNmE4NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzU5LCJpYXQiOjE3OTMzNjU0NTksImp0aSI6ImZlMTg5MTdkLWJiMTQtNDkwZi04MjY5LTY5OGQ0ODRlODNmZSIsInNpZCI6ImI1ZTQxMDcxLWY3NzYtNDRiMS04NGZlLTUwMmFhNzFlZWE1MiJ9.kTHZjddp-dMOd2-_SbexmBvgngCLgK8r9w-zUDiXwB4",
  "access_expires_at": "2026-10-30T13:19:19.827066805Z",
  "refresh_token": "xR9K3Z39f0A5XPHvpVYdpywgMiTCo2eoglfr8iWqXGc",
  "refresh_expires_at": "2026-11-29T13:04:19.826486207Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
  "session_id": "b5e41071-f776-44b1-84fe-502aa71eea52",
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
  "session_id": "eef09932-2654-4397-982b-fac262bb3d42",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNjAsImlhdCI6MTc5MzM2NTQ2MCwianRpIjoiMTk3YjZlYjUtNzRjZS00NjQwLTlmZGQtZGY1OWNlYjQxZDQxIiwic2lkIjoiZWVmMDk5MzItMjY1NC00Mzk3LTk4MmItZmFjMjYyYmIzZDQyIn0.VHbtQrmaHUAV1CAs0ERVNuQC3kSoc30BbZDt94TGCyo",
  "access_expires_at": "2026-10-30T13:19:20.669443302Z",
  "refresh_token": "YvHVhEbwoLqofliOoqzDj9EVMjM0n67lAhEIUe6bZc4",
  "refresh_expires_at": "2026-10-31T01:04:20.668956532Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b` → **200**

```json
{
  "client": {
    "id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
    "phone": "+380635846909",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:04:10.478012Z",
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

`POST /api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b/phone/new-code` → **201**

```json
{
  "phone": "+380632283579"
}
```

```json
{
  "challenge_id": "0036125a-4950-43cc-922b-237e29b2afc3",
  "expires_at": "2026-10-30T13:09:21.264878679Z",
  "resend_available_at": "2026-10-30T13:04:22.264878679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632283579` → **200**

```json
{
  "phone": "+380632283579",
  "audience": "CLIENT",
  "code": "182098",
  "sent_at": "2026-10-30T13:04:21.267366301Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b/phone` → **422**

```json
{
  "command_id": "7966a166-22f2-48fd-906d-1899fe5ee811",
  "expected_version": 3,
  "new_challenge_id": "0036125a-4950-43cc-922b-237e29b2afc3",
  "new_code": "182099",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "3e2b05ed-5ef5-41a2-be02-7513a1742f9c"
}
```

`POST /api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b/phone` → **400**

```json
{
  "command_id": "50547058-4dcd-4042-b0b7-70920ca56358",
  "expected_version": 3,
  "new_challenge_id": "0036125a-4950-43cc-922b-237e29b2afc3",
  "new_code": "182098",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8b05adde-3efc-4a1e-9315-add0ee57843e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/99c0c98e-93d0-4119-acd4-8bb18fb6a86b/phone` → **200**

```json
{
  "command_id": "e5875181-e7da-4651-99d6-18d6f512a4da",
  "expected_version": 3,
  "new_challenge_id": "0036125a-4950-43cc-922b-237e29b2afc3",
  "new_code": "182098",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
  "phone": "+380632283579",
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
  "correlation_id": "95e67c67-f9de-4096-b809-9b640fbdef4c"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632283579",
  "device_ref": "sandbox-15522"
}
```

```json
{
  "challenge_id": "ef90c4bf-e6aa-4d8b-94d9-ed31c2f384c5",
  "expires_at": "2026-10-30T13:09:22.773991543Z",
  "resend_available_at": "2026-10-30T13:04:23.773991543Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632283579` → **200**

```json
{
  "phone": "+380632283579",
  "audience": "CLIENT",
  "code": "813883",
  "sent_at": "2026-10-30T13:04:22.776685817Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef90c4bf-e6aa-4d8b-94d9-ed31c2f384c5",
  "code": "813883",
  "device_ref": "sandbox-15522"
}
```

```json
{
  "session_id": "4105421f-0225-4803-9705-1ed07370271f",
  "subject": {
    "type": "CLIENT",
    "id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWMwYzk4ZS05M2QwLTQxMTktYWNkNC04YmIxOGZiNmE4NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzYzLCJpYXQiOjE3OTMzNjU0NjMsImp0aSI6ImYxOGNhY2ZmLTM1YmQtNGU1Ny05YzkwLTZmOTk3NDAwMjcwOSIsInNpZCI6IjQxMDU0MjFmLTAyMjUtNDgwMy05NzA1LTFlZDA3MzcwMjcxZiJ9.ouANj7fGiDElTjAQx_ZlJk6wglu11Sse88m2YMCAu2Y",
  "access_expires_at": "2026-10-30T13:19:23.085532623Z",
  "refresh_token": "iFmBlKdeJUMqe5I91a0BHdnFHcmfHH9VtdtuWOFlgi0",
  "refresh_expires_at": "2026-11-29T13:04:23.084997147Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "99c0c98e-93d0-4119-acd4-8bb18fb6a86b",
  "session_id": "4105421f-0225-4803-9705-1ed07370271f",
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
  "phone": "+380631723220",
  "device_ref": "sandbox-30923"
}
```

```json
{
  "challenge_id": "9384b50e-153f-4078-9471-0edcf6613e62",
  "expires_at": "2026-10-30T13:09:23.672968739Z",
  "resend_available_at": "2026-10-30T13:04:24.672968739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631723220` → **200**

```json
{
  "phone": "+380631723220",
  "audience": "CLIENT",
  "code": "269989",
  "sent_at": "2026-10-30T13:04:23.675778802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9384b50e-153f-4078-9471-0edcf6613e62",
  "code": "269989",
  "device_ref": "sandbox-30923"
}
```

```json
{
  "session_id": "ff48f2b2-d36e-4a63-a908-d9d151098d74",
  "subject": {
    "type": "CLIENT",
    "id": "0042690a-2255-48f1-8bf3-62801f2d0574"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDQyNjkwYS0yMjU1LTQ4ZjEtOGJmMy02MjgwMWYyZDA1NzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzYzLCJpYXQiOjE3OTMzNjU0NjMsImp0aSI6IjFjMjhmOTRjLTllMTQtNGE5Yi04YjM5LTBmMjVkZTMxMTE0ZSIsInNpZCI6ImZmNDhmMmIyLWQzNmUtNGE2My1hOTA4LWQ5ZDE1MTA5OGQ3NCJ9._00EujnlaPQnv4fi5jTeuahMQnEYjwjhMrmaMlWzjDs",
  "access_expires_at": "2026-10-30T13:19:23.990782752Z",
  "refresh_token": "6zKlKUBp9SspHej0pskJwg2lGWP0wIE-rD_sGYo_WVw",
  "refresh_expires_at": "2026-11-29T13:04:23.990159795Z",
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
  "session_id": "20a9f3a0-3133-4aba-ae35-0fb942001258",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNjUsImlhdCI6MTc5MzM2NTQ2NSwianRpIjoiZjNlMDdiMzQtZTEwZi00MDMxLTliNDAtZjI1Yzk0ZWYxOTE1Iiwic2lkIjoiMjBhOWYzYTAtMzEzMy00YWJhLWFlMzUtMGZiOTQyMDAxMjU4In0.qUv3aR_SouqYTcRb8e91VafQkBrbZLdBm7BJ66TXLNc",
  "access_expires_at": "2026-10-30T13:19:25.20967939Z",
  "refresh_token": "izVo7mSw7Dbed6HSkqq12aTD4m4-gpvjNuBF3LtHwZA",
  "refresh_expires_at": "2026-10-31T01:04:25.209010027Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631723220` → **200**

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
  "correlation_id": "1c91f515-6de8-4fa6-9e0b-13810b428376"
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
  "session_id": "ffab6b19-494e-4bf5-b07c-13c174ddae85",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNjYsImlhdCI6MTc5MzM2NTQ2NiwianRpIjoiZGZmM2QxMTMtOTM4Yi00NTE4LTkyNWYtOThiYWFmNzlmNDM1Iiwic2lkIjoiZmZhYjZiMTktNDk0ZS00YmY1LWIwN2MtMTNjMTc0ZGRhZTg1In0.B9x-oNq7S0I-XtfP4OAUVSIGLLOLALIy52hoWwAwBj4",
  "access_expires_at": "2026-10-30T13:19:26.400630964Z",
  "refresh_token": "qzrv5LOyJ8-RqYCqtU6F3M84wtD5d5mcjRqWI7-vXX0",
  "refresh_expires_at": "2026-10-31T01:04:26.400083669Z",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:00:07.488813Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "54da8ded-e178-4a5f-93cd-a4f3798ef31b",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:04:27.007959761Z"
}
```

## The rider books the airport for 2026-10-30T16:04:26Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600059562",
  "device_ref": "sandbox-456"
}
```

```json
{
  "challenge_id": "9d019a18-c670-4d90-847b-0004a4aa9ebc",
  "expires_at": "2026-10-30T13:09:27.324292288Z",
  "resend_available_at": "2026-10-30T13:04:28.324292288Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600059562` → **200**

```json
{
  "phone": "+48600059562",
  "audience": "CLIENT",
  "code": "354067",
  "sent_at": "2026-10-30T13:04:27.327549799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d019a18-c670-4d90-847b-0004a4aa9ebc",
  "code": "354067",
  "device_ref": "sandbox-456"
}
```

```json
{
  "session_id": "8e0fd15b-ea7a-4d0a-8d4a-d83bb7cf4b1b",
  "subject": {
    "type": "CLIENT",
    "id": "bd85df78-1353-456b-bc77-27d64fa30f6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDg1ZGY3OC0xMzUzLTQ1NmItYmM3Ny0yN2Q2NGZhMzBmNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzY3LCJpYXQiOjE3OTMzNjU0NjcsImp0aSI6Ijg5ZTIwNGZhLTJlZDQtNDZjZS1hOGJkLTBiYjgzZjEzNjBjNSIsInNpZCI6IjhlMGZkMTViLWVhN2EtNGQwYS04ZDRhLWQ4M2JiN2NmNGIxYiJ9.hFfGBOG4jWt1sVKQ894z3aGM228WJqdMDsmlPQ1U7vo",
  "access_expires_at": "2026-10-30T13:19:27.643599567Z",
  "refresh_token": "AJRu3zVSgbTGko0DgAdMY2Mt0gG7iAjh1u2urWtKiAk",
  "refresh_expires_at": "2026-11-29T13:04:27.642911103Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b056b3e7-ed82-475e-ac68-b23a97e39d6d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:04:26Z"
}
```

```json
{
  "id": "5f6d6a52-1103-43f8-829b-62b7f8c0c292",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:09:27.950218Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:04:26Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "74818c6f-90d3-4c3f-af47-3fb312f6580e",
  "quote_id": "5f6d6a52-1103-43f8-829b-62b7f8c0c292",
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
  "pickup_at": "2026-10-30T16:04:26Z"
}
```

```json
{
  "id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bd85df78-1353-456b-bc77-27d64fa30f6e",
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
  "created_at": "2026-10-30T13:04:28.248297Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:04:26Z",
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
  "device_ref": "sandbox-28787"
}
```

```json
{
  "challenge_id": "ffef0dc0-2e49-4b61-86ab-dd3b68e37a10",
  "expires_at": "2026-10-30T13:09:28.554556444Z",
  "resend_available_at": "2026-10-30T13:04:29.554556444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "505574",
  "sent_at": "2026-10-30T13:04:28.557183462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffef0dc0-2e49-4b61-86ab-dd3b68e37a10",
  "code": "505574",
  "device_ref": "sandbox-28787"
}
```

```json
{
  "session_id": "b249e42c-529b-406f-ab41-30354085b3f0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjM2OCwiaWF0IjoxNzkzMzY1NDY4LCJqdGkiOiI3NWI1YjM0MC04NTc0LTQwZTUtODZlMS1jZTk2OWU2NTJmNmEiLCJzaWQiOiJiMjQ5ZTQyYy01MjliLTQwNmYtYWI0MS0zMDM1NDA4NWIzZjAifQ.fgjjsxeM9pXHAiyzkrHY0yBLNbouoaciqhTb7x_V-7Y",
  "access_expires_at": "2026-10-30T13:19:28.865072619Z",
  "refresh_token": "LYrL2PDGsLdLJaH2cVs4FKvDkH5x1reQbs6Gpde5va0",
  "refresh_expires_at": "2026-11-29T13:04:28.864543088Z",
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
  "command_id": "317d3760-b7e9-417f-91ee-15e40f2dea01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:29Z",
    "sequence": 1793365469434
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "69866828-87cf-4e91-8d3e-9bf7bfe3da6c",
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
  "last_heartbeat_at": "2026-10-30T13:04:29.453933Z",
  "last_location_at": "2026-10-30T13:04:29.453933Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
      "short_number": 25,
      "pickup_at": "2026-10-30T16:04:26Z",
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

`POST /api/driver/v1/preorders/75c9b23a-dbfb-4cfd-923a-4167b9f5f026/reserve` → **200**

```json
{
  "command_id": "59f4b201-7929-429f-92e9-b8d479164761"
}
```

```json
{
  "id": "5135c735-8ff3-4b4f-a583-06f254fa99a4",
  "state": "RESERVED",
  "order": {
    "order_id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
    "short_number": 25,
    "pickup_at": "2026-10-30T16:04:26Z",
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
  "reserved_at": "2026-10-30T13:04:30.056355Z",
  "confirm_from": "2026-10-30T15:34:26Z",
  "confirm_until": "2026-10-30T15:44:26Z",
  "drop_until": "2026-10-30T15:04:26Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "5135c735-8ff3-4b4f-a583-06f254fa99a4",
      "state": "RESERVED",
      "order": {
        "order_id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:04:26Z",
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
      "reserved_at": "2026-10-30T13:04:30.056355Z",
      "confirm_from": "2026-10-30T15:34:26Z",
      "confirm_until": "2026-10-30T15:44:26Z",
      "drop_until": "2026-10-30T15:04:26Z"
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
      "id": "5135c735-8ff3-4b4f-a583-06f254fa99a4",
      "state": "RESERVED",
      "order": {
        "order_id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:04:26Z",
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
      "reserved_at": "2026-10-30T13:04:30.056355Z",
      "confirm_from": "2026-10-30T15:34:26Z",
      "confirm_until": "2026-10-30T15:44:26Z",
      "drop_until": "2026-10-30T15:04:26Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/5135c735-8ff3-4b4f-a583-06f254fa99a4/confirm` → **409**

```json
{
  "command_id": "77ca0b5c-b674-4f49-badf-58e020608358"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/5135c735-8ff3-4b4f-a583-06f254fa99a4/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0f31acad-54d7-4e51-b9a4-77e853d6a9d5"
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
  "session_id": "07b22991-97f2-40a6-895f-bcb9fc199a4e",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNzEsImlhdCI6MTc5MzM2NTQ3MSwianRpIjoiMmU3MWYxZTctOTQ5MS00M2YxLWE3ZmYtNTFlNDNjZTcyNmRjIiwic2lkIjoiMDdiMjI5OTEtOTdmMi00MGE2LTg5NWYtYmNiOWZjMTk5YTRlIn0.poDuHi9sg_yhpNpjPOmNbOJBD-QslPy9-jVB7w0k2mg",
  "access_expires_at": "2026-10-30T13:19:31.52036791Z",
  "refresh_token": "eMYNFmUCJcc3GDLvyrXyXOo5lpaWBWK4tSTQn8cBAq4",
  "refresh_expires_at": "2026-10-31T01:04:31.519826077Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/75c9b23a-dbfb-4cfd-923a-4167b9f5f026` → **200**

```json
{
  "id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "bd85df78-1353-456b-bc77-27d64fa30f6e",
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
  "created_at": "2026-10-30T13:04:28.248297Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:04:26Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "5135c735-8ff3-4b4f-a583-06f254fa99a4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:04:30.056355Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/75c9b23a-dbfb-4cfd-923a-4167b9f5f026/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:04:28.249312Z",
      "actor": {
        "type": "CLIENT",
        "id": "bd85df78-1353-456b-bc77-27d64fa30f6e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
        "preorder": true,
        "quote_id": "5f6d6a52-1103-43f8-829b-62b7f8c0c292",
        "pickup_at": "2026-10-30T16:04:26Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "a4258a9b-05eb-42ec-8381-6148a470ab9c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:04:30.057468Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "75c9b23a-dbfb-4cfd-923a-4167b9f5f026",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "5135c735-8ff3-4b4f-a583-06f254fa99a4"
      },
      "correlation_id": "c83c0fd3-4808-4736-b472-54b138325118"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 75c9b23a-dbfb-4cfd-923a-4167b9f5f026, reservation 5135c735-8ff3-4b4f-a583-06f254fa99a4.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16769"
}
```

```json
{
  "challenge_id": "afb9d44a-fba2-4137-8e8e-bfc1ae530ce0",
  "expires_at": "2026-10-30T13:09:32.431975434Z",
  "resend_available_at": "2026-10-30T13:04:33.431975434Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "601927",
  "sent_at": "2026-10-30T13:04:32.435123747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afb9d44a-fba2-4137-8e8e-bfc1ae530ce0",
  "code": "601927",
  "device_ref": "sandbox-16769"
}
```

```json
{
  "session_id": "e97d9aeb-3670-4ddf-83d5-41df14ab70ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjM3MiwiaWF0IjoxNzkzMzY1NDcyLCJqdGkiOiIzZGU1NjE5NS02NDlhLTQzZGEtYWQ3Zi04ZTZkODYzZWI5MTgiLCJzaWQiOiJlOTdkOWFlYi0zNjcwLTRkZGYtODNkNS00MWRmMTRhYjcwYWIifQ.Zx2yaZ4hTPe2LFa1Z5TKCfpvBgjSFP0-yByF74H_fVc",
  "access_expires_at": "2026-10-30T13:19:32.75558929Z",
  "refresh_token": "wssYbOjSfyh8LzoV-y7mZrxT16aPcMJ3oc0_b6i4wlw",
  "refresh_expires_at": "2026-11-29T13:04:32.755072544Z",
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
  "command_id": "8a88ac36-2470-4e88-bcf4-f5afe5344366",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:33Z",
    "sequence": 1793365473356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:04:33.374325Z",
  "last_location_at": "2026-10-30T13:04:33.374325Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677290799",
  "device_ref": "sandbox-32186"
}
```

```json
{
  "challenge_id": "fe9e1d3d-705d-4df3-9aef-c1504a0099f6",
  "expires_at": "2026-10-30T13:09:33.66969461Z",
  "resend_available_at": "2026-10-30T13:04:34.66969461Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677290799` → **200**

```json
{
  "phone": "+380677290799",
  "audience": "CLIENT",
  "code": "659221",
  "sent_at": "2026-10-30T13:04:33.672239255Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe9e1d3d-705d-4df3-9aef-c1504a0099f6",
  "code": "659221",
  "device_ref": "sandbox-32186"
}
```

```json
{
  "session_id": "1f28ec5f-e659-4df6-90a0-98b348b68561",
  "subject": {
    "type": "CLIENT",
    "id": "82811b28-bcb1-42f6-b529-2049aad1bfd1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjgxMWIyOC1iY2IxLTQyZjYtYjUyOS0yMDQ5YWFkMWJmZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2MzczLCJpYXQiOjE3OTMzNjU0NzMsImp0aSI6ImQ3NmM2NWU4LWYzMWUtNDgzYi1hYzIxLTI5ZDU5OTY0NWI2MCIsInNpZCI6IjFmMjhlYzVmLWU2NTktNGRmNi05MGEwLTk4YjM0OGI2ODU2MSJ9.UAen6iJS8QuPL_tptx3S1L7pNe15W30PBRGoaYeqgIE",
  "access_expires_at": "2026-10-30T13:19:33.983930459Z",
  "refresh_token": "MZ4zRYD2-TXsGOEDlPyDR1_hch8LUAcGYFAxVAJTe-w",
  "refresh_expires_at": "2026-11-29T13:04:33.9833891Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44c3ad2d-590f-4fcd-a7d7-025393acb92b",
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
  "id": "6261d3aa-195e-427e-bf87-4b715bb056ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:09:34.288779Z",
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
  "command_id": "f5c577d9-79ce-4c9a-8a4e-d54d0bddb173",
  "quote_id": "6261d3aa-195e-427e-bf87-4b715bb056ef",
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
  "id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "82811b28-bcb1-42f6-b529-2049aad1bfd1",
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
  "created_at": "2026-10-30T13:04:34.603223Z",
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
    "id": "1c6d8671-3ce3-42eb-8cf4-50c04af39e31",
    "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
    "expires_at": "2026-10-30T13:04:49.606551Z",
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

`POST /api/driver/v1/offers/1c6d8671-3ce3-42eb-8cf4-50c04af39e31/accept` → **200**

```json
{
  "command_id": "0b79d6a6-e97d-4bab-b8ca-5f45972d7bfb"
}
```

```json
{
  "id": "7b136d5e-b934-4826-b17a-bb7d345e109f",
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "470c4b19-9f71-4586-bd8c-3f7e3572a16c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "470c4b19-9f71-4586-bd8c-3f7e3572a16c",
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "assignment_id": "7b136d5e-b934-4826-b17a-bb7d345e109f",
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

`POST /api/driver/v1/work-sessions/aa7f8784-8424-483c-bf70-9d58f64b4a2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:35Z",
    "sequence": 1793365475792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:04:35.811325Z",
  "last_location_at": "2026-10-30T13:04:35.811325Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "470c4b19-9f71-4586-bd8c-3f7e3572a16c",
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "assignment_id": "7b136d5e-b934-4826-b17a-bb7d345e109f",
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

`POST /api/driver/v1/trips/470c4b19-9f71-4586-bd8c-3f7e3572a16c/arrive` → **200**

```json
{
  "command_id": "f34a0c0c-e642-4c55-a54c-1dd98894929d",
  "expected_version": 0
}
```

```json
{
  "id": "470c4b19-9f71-4586-bd8c-3f7e3572a16c",
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "assignment_id": "7b136d5e-b934-4826-b17a-bb7d345e109f",
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
  "arrived_at": "2026-10-30T13:04:36.398721Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/470c4b19-9f71-4586-bd8c-3f7e3572a16c/start` → **200**

```json
{
  "command_id": "30a00c8a-ee1e-44fc-bba6-df2ec9f0c10d",
  "expected_version": 1
}
```

```json
{
  "id": "470c4b19-9f71-4586-bd8c-3f7e3572a16c",
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "assignment_id": "7b136d5e-b934-4826-b17a-bb7d345e109f",
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
  "arrived_at": "2026-10-30T13:04:36.398721Z",
  "started_at": "2026-10-30T13:04:36.729043Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/aa7f8784-8424-483c-bf70-9d58f64b4a2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:37Z",
    "sequence": 1793365477607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:04:37.080483Z",
  "last_location_at": "2026-10-30T13:04:37.080483Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/470c4b19-9f71-4586-bd8c-3f7e3572a16c/complete` → **200**

```json
{
  "command_id": "e4c5453c-47c3-42fc-a1d7-a9663ed133ac",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:04:37Z",
  "cash_received": true
}
```

```json
{
  "id": "470c4b19-9f71-4586-bd8c-3f7e3572a16c",
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "assignment_id": "7b136d5e-b934-4826-b17a-bb7d345e109f",
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
  "arrived_at": "2026-10-30T13:04:36.398721Z",
  "started_at": "2026-10-30T13:04:36.729043Z",
  "completed_at": "2026-10-30T13:04:37.392646Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/0d6999dd-3e59-46fb-8c51-963e9bcfbcaf/rating` → **200**

```json
{
  "command_id": "1a0222bc-94f5-431c-811e-d1ff90e9695e",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "score": 5,
  "created_at": "2026-10-30T13:04:37.71593124Z"
}
```

`POST /api/driver/v1/orders/0d6999dd-3e59-46fb-8c51-963e9bcfbcaf/rating` → **200**

```json
{
  "command_id": "861de59b-2036-40cc-862c-590d077ee50a",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
  "score": 4,
  "created_at": "2026-10-30T13:04:38.005275052Z"
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
  "session_id": "53142fa2-bd6c-41c1-8cd2-63031d416a77",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNzgsImlhdCI6MTc5MzM2NTQ3OCwianRpIjoiOWNkZTU5N2QtYTI0Ny00NmM5LWI3ZDQtMzkzOWI5ZjU3OTAxIiwic2lkIjoiNTMxNDJmYTItYmQ2Yy00MWMxLThjZDItNjMwMzFkNDE2YTc3In0.H7teUmixkPF2yJLuoj_d8WsVwUbg8orvvSXdM8Fx-Hc",
  "access_expires_at": "2026-10-30T13:19:38.880110889Z",
  "refresh_token": "UwpQbHqCraePbVvbvBIDPsvS14oV36RCz9lVVWINqnY",
  "refresh_expires_at": "2026-10-31T01:04:38.879616866Z",
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
  "session_id": "d6d51721-65ec-43cf-8b8a-3c6a4e3e9df2",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzNzksImlhdCI6MTc5MzM2NTQ3OSwianRpIjoiMzMzNDBhYmMtZjk5ZC00NTlmLTkzZmYtZTQzNjA0YmQxN2UwIiwic2lkIjoiZDZkNTE3MjEtNjVlYy00M2NmLThiOGEtM2M2YTRlM2U5ZGYyIn0.mdz6kYWCL9bQvBVGo1PJ1KQvbYqgouZSlXuyiQbtbrg",
  "access_expires_at": "2026-10-30T13:19:39.464735389Z",
  "refresh_token": "1BFluwNqp2sg2Y81_rEifNk1xhTB8_h0et1VtTJ-tWI",
  "refresh_expires_at": "2026-10-31T01:04:39.464189912Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0d6999dd-3e59-46fb-8c51-963e9bcfbcaf/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
      "author_type": "RIDER",
      "author_id": "82811b28-bcb1-42f6-b529-2049aad1bfd1",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:04:37.715931Z"
    },
    {
      "order_id": "0d6999dd-3e59-46fb-8c51-963e9bcfbcaf",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "82811b28-bcb1-42f6-b529-2049aad1bfd1",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:04:38.005275Z"
    }
  ]
}
```

Done: ratings for order 0d6999dd-3e59-46fb-8c51-963e9bcfbcaf.

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
  "session_id": "f38f5b0c-e6f6-4bc8-bf4e-112b0289fb8c",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzODAsImlhdCI6MTc5MzM2NTQ4MCwianRpIjoiM2IwNzk5N2ItNDY1ZS00Mjg2LTk3NjktNmU0M2VlZmVmZTVhIiwic2lkIjoiZjM4ZjViMGMtZTZmNi00YmM4LWJmNGUtMTEyYjAyODlmYjhjIn0.XcykYP5ZK48buT04UUg5m6BH6eNfIwMmXOoR2QIGbcw",
  "access_expires_at": "2026-10-30T13:19:40.376294562Z",
  "refresh_token": "bcxB89VSc_mQc_D-Q2hnJonw8ImzVB8AsimG8icIurA",
  "refresh_expires_at": "2026-10-31T01:04:40.375762137Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b86d6888-8ce3-400b-ad54-a95acb2055a3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "47eff021-52f9-44c8-8efb-c9c7d2736733",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:04:40.672339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/47eff021-52f9-44c8-8efb-c9c7d2736733` → **200**

```json
{
  "id": "47eff021-52f9-44c8-8efb-c9c7d2736733",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:04:40.672339Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/47eff021-52f9-44c8-8efb-c9c7d2736733` → **200**

```json
{
  "id": "47eff021-52f9-44c8-8efb-c9c7d2736733",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:04:40.672339Z",
  "ready_at": "2026-10-30T13:04:41.712026Z",
  "expires_at": "2026-10-31T13:04:41.712026Z"
}
```

`GET /api/admin/v1/reports/exports/47eff021-52f9-44c8-8efb-c9c7d2736733/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2f39a499-8ff5-4674-a9a6-3d314e9c3073",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "575b8d04-6849-4eb1-9a7a-ad39ed35c1ac",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:04:42.580172Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/575b8d04-6849-4eb1-9a7a-ad39ed35c1ac` → **200**

```json
{
  "id": "575b8d04-6849-4eb1-9a7a-ad39ed35c1ac",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:04:42.580172Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/575b8d04-6849-4eb1-9a7a-ad39ed35c1ac` → **200**

```json
{
  "id": "575b8d04-6849-4eb1-9a7a-ad39ed35c1ac",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:04:42.580172Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/575b8d04-6849-4eb1-9a7a-ad39ed35c1ac` → **200**

```json
{
  "id": "575b8d04-6849-4eb1-9a7a-ad39ed35c1ac",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:04:42.580172Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/575b8d04-6849-4eb1-9a7a-ad39ed35c1ac` → **200**

```json
{
  "id": "575b8d04-6849-4eb1-9a7a-ad39ed35c1ac",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:04:42.580172Z",
  "ready_at": "2026-10-30T13:04:46.720222Z",
  "expires_at": "2026-10-31T13:04:46.720222Z"
}
```

`GET /api/admin/v1/reports/exports/575b8d04-6849-4eb1-9a7a-ad39ed35c1ac/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/f60bcb0e-1ba7-4b4e-824c-695a9d0e0657` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/f60bcb0e-1ba7-4b4e-824c-695a9d0e0657",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7855ffeb-9579-41dd-8527-abdbba6b1b01"
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
  "device_ref": "sandbox-29812"
}
```

```json
{
  "challenge_id": "77bdebd9-9d36-4aa4-a07e-6f560ea84d79",
  "expires_at": "2026-10-30T13:09:47.360537567Z",
  "resend_available_at": "2026-10-30T13:04:48.360537567Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "575082",
  "sent_at": "2026-10-30T13:04:47.363872261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77bdebd9-9d36-4aa4-a07e-6f560ea84d79",
  "code": "575082",
  "device_ref": "sandbox-29812"
}
```

```json
{
  "session_id": "f15b1359-40f8-45c5-bb18-f57a4fe05b67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjM4NywiaWF0IjoxNzkzMzY1NDg3LCJqdGkiOiIxYzk0YmY4NS0yNjE5LTQzYmUtODQzZS1lODMyNzU5MGVlMzkiLCJzaWQiOiJmMTViMTM1OS00MGY4LTQ1YzUtYmIxOC1mNTdhNGZlMDViNjcifQ.c2ydynGiJUpan88vKOJeUYwqDJ4iwspBbuzHvs5VpSw",
  "access_expires_at": "2026-10-30T13:19:47.672536622Z",
  "refresh_token": "kIJzQOjqpAAI-_V-SAM1LR0bG8zKquWRHoYtGmX4sKI",
  "refresh_expires_at": "2026-11-29T13:04:47.671996485Z",
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
  "command_id": "11b8efc5-479f-491f-810b-f0ac6ff89efa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:48Z",
    "sequence": 1793365488536
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bec6783a-42d6-483f-96e5-76714349c171",
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
  "last_heartbeat_at": "2026-10-30T13:04:48.555263Z",
  "last_location_at": "2026-10-30T13:04:48.555263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "2c178689-c137-4e49-a60f-8dcbc361bfd8",
  "points": [
    {
      "sequence": 1793365490852,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:03:50Z"
    },
    {
      "sequence": 1793365490860,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:04:50Z"
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
  "session_id": "944cfc1c-1375-4aee-b0c0-825dd0f980e7",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzOTEsImlhdCI6MTc5MzM2NTQ5MSwianRpIjoiYmIzYjE2YWMtNDcwMi00YzZmLThkZWUtMmM3OWFlNDY3YmZmIiwic2lkIjoiOTQ0Y2ZjMWMtMTM3NS00YWVlLWIwYzAtODI1ZGQwZjk4MGU3In0.EgF-7adZ14FJMa_1ACrG7mfvkcOrOx4m8QjLJDfW_Oo",
  "access_expires_at": "2026-10-30T13:19:51.500257651Z",
  "refresh_token": "Gl8hEpLnJIMrbNbJdxCmRycbPs0UZsgpUuCL-zCIEDY",
  "refresh_expires_at": "2026-10-31T01:04:51.499694949Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "0c61a2fa-3f61-4279-95ec-f98e772984cf",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T13:04:50Z",
        "track_point_id": "90b5ac83-9761-4bc0-ace9-c1e7ac424a4d",
        "work_session_id": "bec6783a-42d6-483f-96e5-76714349c171"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T13:04:50Z",
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

`POST /api/admin/v1/driver-risk-flags/0c61a2fa-3f61-4279-95ec-f98e772984cf/confirm` → **200**

```json
{
  "command_id": "4b194de1-e44e-4e6a-bd01-cc2277a8129f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "0c61a2fa-3f61-4279-95ec-f98e772984cf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T13:04:50Z",
    "track_point_id": "90b5ac83-9761-4bc0-ace9-c1e7ac424a4d",
    "work_session_id": "bec6783a-42d6-483f-96e5-76714349c171"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T13:04:50Z",
  "reason": null,
  "reviewed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reviewed_at": "2026-10-30T13:04:52.411934Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/0c61a2fa-3f61-4279-95ec-f98e772984cf/dismiss` → **409**

```json
{
  "command_id": "f40acf86-667a-4765-bb2e-367d42e4aa51",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/0c61a2fa-3f61-4279-95ec-f98e772984cf/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "09d1f581-7b5a-4528-a6ba-8151ef7d6eaf"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "6d9606ac-03e5-4bc8-8b8c-520e8495b5a8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "290909c0-b3c2-496e-b770-c097ee8185d7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "raised_at": "2026-10-30T13:04:53.025186Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/290909c0-b3c2-496e-b770-c097ee8185d7/dismiss` → **200**

```json
{
  "command_id": "8791ec26-50f6-4311-8750-2583c99654e1",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "290909c0-b3c2-496e-b770-c097ee8185d7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "raised_at": "2026-10-30T13:04:53.025186Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reviewed_at": "2026-10-30T13:04:53.326331Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "f30df797-6c80-4fda-8bf5-47c72364cebd",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "0c61a2fa-3f61-4279-95ec-f98e772984cf"
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
      "actor_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:04:53.633649Z"
    }
  ]
}
```

Done: flag 0c61a2fa-3f61-4279-95ec-f98e772984cf confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6b9adc0d-f672-4395-a3d5-23642162451e",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzOTQsImlhdCI6MTc5MzM2NTQ5NCwianRpIjoiNjljNjMyMTQtNGRkMy00OWJlLWI4NDktOGY4NTc5NjVkYzdmIiwic2lkIjoiNmI5YWRjMGQtZjY3Mi00Mzk1LWEzZDUtMjM2NDIxNjI0NTFlIn0.m6otIRX4y0SulKO1ThL3S2uC1gPXGBYMfpaKr908Xu4",
  "access_expires_at": "2026-10-30T13:19:54.525885936Z",
  "refresh_token": "AM9RBzfBPI0I_VCPxsFkBS-lGXMegx5NeVLPh8flsqc",
  "refresh_expires_at": "2026-10-31T01:04:54.525300554Z",
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
      "actor_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:04:53.633649Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "0ea729ff-b94e-45d9-bef3-a3d29c380d79",
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
  "session_id": "bec6783a-42d6-483f-96e5-76714349c171",
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
  "last_heartbeat_at": "2026-10-30T13:04:48.555263Z",
  "last_location_at": "2026-10-30T13:04:48.555263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bec6783a-42d6-483f-96e5-76714349c171/close` → **200**

```json
{
  "command_id": "c1b3d1d1-0dc5-40d1-be0b-593adf6a7de2",
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
  "session_id": "dd37724b-b3e2-4227-b567-00ddc1d8e528",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjYzOTYsImlhdCI6MTc5MzM2NTQ5NiwianRpIjoiNWI0MTFlNWItMDZhNC00MTZiLWFiZmUtODdiNjE4MmQ5NDBlIiwic2lkIjoiZGQzNzcyNGItYjNlMi00MjI3LWI1NjctMDBkZGMxZDhlNTI4In0.rwPekFZjBcunTvducnRjqRwkWpu3gc6JfBhwG0v9LKw",
  "access_expires_at": "2026-10-30T13:19:56.341643157Z",
  "refresh_token": "_xQl-wZ8cP2NU52d8BPw_fK0vUgktjnZFWviZI4WoFE",
  "refresh_expires_at": "2026-10-31T01:04:56.341058616Z",
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
  "command_id": "070aeb3c-0f6d-432d-8cdb-1a92726d305d",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:04:56.947525Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "070aeb3c-0f6d-432d-8cdb-1a92726d305d",
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
  "changed_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:04:56.947525Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48294820673",
  "device_ref": "sandbox-12467"
}
```

```json
{
  "challenge_id": "3542cab8-de4a-401c-89bb-392469cb60db",
  "expires_at": "2026-10-30T13:09:57.555932237Z",
  "resend_available_at": "2026-10-30T13:04:58.555932237Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48294820673` → **200**

```json
{
  "phone": "+48294820673",
  "audience": "CLIENT",
  "code": "967898",
  "sent_at": "2026-10-30T13:04:57.558535262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3542cab8-de4a-401c-89bb-392469cb60db",
  "code": "967898",
  "device_ref": "sandbox-12467"
}
```

```json
{
  "session_id": "d3815fee-4cde-4d95-aac2-f86a375f98f6",
  "subject": {
    "type": "CLIENT",
    "id": "681a5b7d-a6ad-4601-b19a-5388a3a35476"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODFhNWI3ZC1hNmFkLTQ2MDEtYjE5YS01Mzg4YTNhMzU0NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2Mzk3LCJpYXQiOjE3OTMzNjU0OTcsImp0aSI6ImFlZmVmZjI2LWZjNDQtNDlkNC1hNWY3LWFmYWQzOTc4NGQyZSIsInNpZCI6ImQzODE1ZmVlLTRjZGUtNGQ5NS1hYWMyLWY4NmEzNzVmOThmNiJ9.hKFfL-7Kd1GzU2UNPf3O4VqaGTVa6GyWsqx46x2ic9A",
  "access_expires_at": "2026-10-30T13:19:57.874964624Z",
  "refresh_token": "bXl96M_CiR-UEZHoyosMjb-S1u-Fxzxj2Hg63KpHrUc",
  "refresh_expires_at": "2026-11-29T13:04:57.874444001Z",
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
  "correlation_id": "aea72a56-ed13-41a4-bd06-2059dec507f6"
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
  "device_ref": "sandbox-17858"
}
```

```json
{
  "challenge_id": "935983ba-af71-43f3-b340-8175b056b920",
  "expires_at": "2026-10-30T13:09:58.744627566Z",
  "resend_available_at": "2026-10-30T13:04:59.744627566Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "807916",
  "sent_at": "2026-10-30T13:04:58.747208881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "935983ba-af71-43f3-b340-8175b056b920",
  "code": "807916",
  "device_ref": "sandbox-17858"
}
```

```json
{
  "session_id": "e74f425e-d639-4098-8a76-97a9edaef65b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjM5OSwiaWF0IjoxNzkzMzY1NDk5LCJqdGkiOiI5MjNiYmVjYi02MDNiLTQ1ZGQtOTI1YS05OWMzYWNjODdjOGEiLCJzaWQiOiJlNzRmNDI1ZS1kNjM5LTQwOTgtOGE3Ni05N2E5ZWRhZWY2NWIifQ.uySmmTRzdlLgIwxX2BcCd5PU6krzOe2dher_1NWLAl4",
  "access_expires_at": "2026-10-30T13:19:59.076849637Z",
  "refresh_token": "f4Sc5WqlfUOMmYC2nG4I4cCl50zfKC3AFxz_0eNvuRA",
  "refresh_expires_at": "2026-11-29T13:04:59.076314897Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "69866828-87cf-4e91-8d3e-9bf7bfe3da6c",
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
  "last_heartbeat_at": "2026-10-30T13:04:29.453933Z",
  "last_location_at": "2026-10-30T13:04:29.453933Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/69866828-87cf-4e91-8d3e-9bf7bfe3da6c/handover` → **200**

```json
{
  "command_id": "1fdfccfb-66ba-433d-9401-3e16519ea2ef",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "69866828-87cf-4e91-8d3e-9bf7bfe3da6c",
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
  "last_heartbeat_at": "2026-10-30T13:04:29.453933Z",
  "last_location_at": "2026-10-30T13:04:29.453933Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/69866828-87cf-4e91-8d3e-9bf7bfe3da6c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:04:59Z",
    "sequence": 1793365499954
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "69866828-87cf-4e91-8d3e-9bf7bfe3da6c",
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
  "last_heartbeat_at": "2026-10-30T13:04:59.975308Z",
  "last_location_at": "2026-10-30T13:04:59.975308Z",
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
  "session_id": "69866828-87cf-4e91-8d3e-9bf7bfe3da6c",
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
  "last_heartbeat_at": "2026-10-30T13:04:59.975308Z",
  "last_location_at": "2026-10-30T13:04:59.975308Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/69866828-87cf-4e91-8d3e-9bf7bfe3da6c/close` → **200**

```json
{
  "command_id": "aa8c2b27-4751-4d6e-ba6f-8728e44a56cb",
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
  "correlation_id": "e0329402-03aa-47ba-8938-4726f3095bdf"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679244900",
  "device_ref": "sandbox-24112"
}
```

```json
{
  "challenge_id": "2939a7d0-f932-44e1-ae4f-ccb8fbcdca6c",
  "expires_at": "2026-10-30T13:10:01.459623957Z",
  "resend_available_at": "2026-10-30T13:05:02.459623957Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679244900` → **200**

```json
{
  "phone": "+380679244900",
  "audience": "CLIENT",
  "code": "593169",
  "sent_at": "2026-10-30T13:05:01.46227261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2939a7d0-f932-44e1-ae4f-ccb8fbcdca6c",
  "code": "593169",
  "device_ref": "sandbox-24112"
}
```

```json
{
  "session_id": "a5915589-d940-4bcc-89c5-057eec40ba6e",
  "subject": {
    "type": "CLIENT",
    "id": "ce80f772-927f-4312-91b4-19901d0b7c29"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTgwZjc3Mi05MjdmLTQzMTItOTFiNC0xOTkwMWQwYjdjMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDAxLCJpYXQiOjE3OTMzNjU1MDEsImp0aSI6ImFjY2ZhZWVkLWU3MmYtNDMwOS04MmUyLTNlNGZiMWVmZWVjYiIsInNpZCI6ImE1OTE1NTg5LWQ5NDAtNGJjYy04OWM1LTA1N2VlYzQwYmE2ZSJ9.ixnbKsN6jwVkGAOPuDnjcu1HJLrGHdAQwBXURF7naAA",
  "access_expires_at": "2026-10-30T13:20:01.776420287Z",
  "refresh_token": "L5jCZXsiAjYnt_NZlu6eZ4aHznm9OnWoo2vVIT04G5o",
  "refresh_expires_at": "2026-11-29T13:05:01.775815524Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "ac7b8155-45a7-434f-a3bb-12d6ab3e92ba",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "4ec480a7-445c-4fb3-901e-4fb95b30c04a",
  "upload_path": "/api/rider/v1/uploads/4ec480a7-445c-4fb3-901e-4fb95b30c04a",
  "expires_at": "2026-10-30T13:20:02.08328624Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/4ec480a7-445c-4fb3-901e-4fb95b30c04a` → **200**

```json
{
  "file_id": "4ec480a7-445c-4fb3-901e-4fb95b30c04a",
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
  "command_id": "82dc5102-05d1-46ec-80bb-38289932543e",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "1370d1ce-2e52-4594-943f-8e0a970fd4e8",
  "upload_path": "/api/rider/v1/uploads/1370d1ce-2e52-4594-943f-8e0a970fd4e8",
  "expires_at": "2026-10-30T13:20:02.411545862Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/1370d1ce-2e52-4594-943f-8e0a970fd4e8` → **200**

```json
{
  "file_id": "1370d1ce-2e52-4594-943f-8e0a970fd4e8",
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
  "command_id": "968fc03b-0a5c-4a86-a0d6-ae32461a3a87",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "10a43e3b-f09d-4781-a2b8-cf6dc7315827",
  "upload_path": "/api/rider/v1/uploads/10a43e3b-f09d-4781-a2b8-cf6dc7315827",
  "expires_at": "2026-10-30T13:20:02.726335401Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/10a43e3b-f09d-4781-a2b8-cf6dc7315827` → **200**

```json
{
  "file_id": "10a43e3b-f09d-4781-a2b8-cf6dc7315827",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "821cd18b-2b50-4964-a311-0de6f2eb242a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "10a43e3b-f09d-4781-a2b8-cf6dc7315827"
  ]
}
```

```json
{
  "id": "71a9632f-6d8c-49cf-ab92-e05715e35f31",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:05:03.041971Z",
  "updated_at": "2026-10-30T13:05:03.041971Z",
  "respond_by": "2026-10-30T17:05:03.041971Z",
  "messages": [
    {
      "id": "5d17bbb8-0737-4f61-873c-5ccfbb64024f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:05:03.04308Z",
      "attachments": [
        {
          "file_id": "10a43e3b-f09d-4781-a2b8-cf6dc7315827",
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
  "session_id": "7e13961f-8be7-402f-ac73-c64fecdd814b",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MDMsImlhdCI6MTc5MzM2NTUwMywianRpIjoiNzQ1ZTMzNWUtOGZkMi00ODA1LTgzOWUtNGNhMjFkYzcwMGY4Iiwic2lkIjoiN2UxMzk2MWYtOGJlNy00MDJmLWFjNzMtYzY0ZmVjZGQ4MTRiIn0.yVGN8pQq9azdO1ID4i_uwN6lTWhlMF6ScD-KjvCbzQs",
  "access_expires_at": "2026-10-30T13:20:03.647369374Z",
  "refresh_token": "AN4Vs4LVJZZ1VvuqjCDcBWhHwGzd73zHOhFNXPRHupo",
  "refresh_expires_at": "2026-10-31T01:05:03.646613303Z",
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
  "session_id": "21fe4b1c-984b-458b-92f6-a67d4b05df7d",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MDQsImlhdCI6MTc5MzM2NTUwNCwianRpIjoiOGMzN2U0MmItZWFiNy00ZDQwLWE1ZWQtMWRjYjYwMDFhMjgzIiwic2lkIjoiMjFmZTRiMWMtOTg0Yi00NThiLTkyZjYtYTY3ZDRiMDVkZjdkIn0.CwmeMnct0iCze_e8HFXAC6WYtOGNMPTkaaTOuiuO2pU",
  "access_expires_at": "2026-10-30T13:20:04.22515115Z",
  "refresh_token": "FxgzOW47qJZxQvi6tXYJ5Q9ofToyFe9ag4K-6xcplk8",
  "refresh_expires_at": "2026-10-31T01:05:04.224482853Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/71a9632f-6d8c-49cf-ab92-e05715e35f31/attachments/10a43e3b-f09d-4781-a2b8-cf6dc7315827` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "5806a447-45a4-4251-b83a-72b001d2524c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "11c68bbf-176a-486a-bcdf-3c7096e78294",
  "upload_path": "/api/operator/v1/uploads/11c68bbf-176a-486a-bcdf-3c7096e78294",
  "expires_at": "2026-10-30T13:20:04.538135181Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/11c68bbf-176a-486a-bcdf-3c7096e78294` → **200**

```json
{
  "file_id": "11c68bbf-176a-486a-bcdf-3c7096e78294",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/71a9632f-6d8c-49cf-ab92-e05715e35f31` → **200**

```json
{
  "id": "71a9632f-6d8c-49cf-ab92-e05715e35f31",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:05:03.041971Z",
  "updated_at": "2026-10-30T13:05:03.041971Z",
  "respond_by": "2026-10-30T17:05:03.041971Z",
  "messages": [
    {
      "id": "5d17bbb8-0737-4f61-873c-5ccfbb64024f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:05:03.04308Z",
      "attachments": [
        {
          "file_id": "10a43e3b-f09d-4781-a2b8-cf6dc7315827",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/71a9632f-6d8c-49cf-ab92-e05715e35f31/comments` → **200**

```json
{
  "command_id": "2f6939e8-65f9-4bf4-b859-77d3cf84d643",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "11c68bbf-176a-486a-bcdf-3c7096e78294"
  ]
}
```

```json
{
  "id": "71a9632f-6d8c-49cf-ab92-e05715e35f31",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:05:03.041971Z",
  "updated_at": "2026-10-30T13:05:05.170376Z",
  "respond_by": "2026-10-30T17:05:03.041971Z",
  "messages": [
    {
      "id": "5d17bbb8-0737-4f61-873c-5ccfbb64024f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:05:03.04308Z",
      "attachments": [
        {
          "file_id": "10a43e3b-f09d-4781-a2b8-cf6dc7315827",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6cacf882-3025-4405-9486-2e2021359348",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:05:05.169934Z",
      "attachments": [
        {
          "file_id": "11c68bbf-176a-486a-bcdf-3c7096e78294",
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

`GET /api/rider/v1/support/cases/71a9632f-6d8c-49cf-ab92-e05715e35f31` → **200**

```json
{
  "id": "71a9632f-6d8c-49cf-ab92-e05715e35f31",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:05:03.041971Z",
  "updated_at": "2026-10-30T13:05:05.170376Z",
  "respond_by": "2026-10-30T17:05:03.041971Z",
  "messages": [
    {
      "id": "5d17bbb8-0737-4f61-873c-5ccfbb64024f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ce80f772-927f-4312-91b4-19901d0b7c29",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:05:03.04308Z",
      "attachments": [
        {
          "file_id": "10a43e3b-f09d-4781-a2b8-cf6dc7315827",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6cacf882-3025-4405-9486-2e2021359348",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:05:05.169934Z",
      "attachments": [
        {
          "file_id": "11c68bbf-176a-486a-bcdf-3c7096e78294",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/71a9632f-6d8c-49cf-ab92-e05715e35f31/attachments/11c68bbf-176a-486a-bcdf-3c7096e78294` → **200**

Done: support case 71a9632f-6d8c-49cf-ab92-e05715e35f31, rider attachment 10a43e3b-f09d-4781-a2b8-cf6dc7315827, operator attachment 11c68bbf-176a-486a-bcdf-3c7096e78294.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738449312",
  "device_ref": "sandbox-24211"
}
```

```json
{
  "challenge_id": "02c68648-8c86-41f4-9265-e55721147329",
  "expires_at": "2026-10-30T13:10:05.80085426Z",
  "resend_available_at": "2026-10-30T13:05:06.80085426Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738449312` → **200**

```json
{
  "phone": "+380738449312",
  "audience": "CLIENT",
  "code": "366098",
  "sent_at": "2026-10-30T13:05:05.803645821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02c68648-8c86-41f4-9265-e55721147329",
  "code": "366098",
  "device_ref": "sandbox-24211"
}
```

```json
{
  "session_id": "2bdf6709-5db3-466d-9b76-c365e0ab22d8",
  "subject": {
    "type": "CLIENT",
    "id": "c231ad52-f43a-4325-80c5-18ede354d418"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjMxYWQ1Mi1mNDNhLTQzMjUtODBjNS0xOGVkZTM1NGQ0MTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDA2LCJpYXQiOjE3OTMzNjU1MDYsImp0aSI6IjBmOWMwZjcxLWQ3MzgtNDNiZC1iMzdkLTMzMTU3MTlkMTQ0OCIsInNpZCI6IjJiZGY2NzA5LTVkYjMtNDY2ZC05Yjc2LWMzNjVlMGFiMjJkOCJ9.q-mHow-ZFTRq-3WoEp2pFMrR65_s4rlcyOEUBtbDPbg",
  "access_expires_at": "2026-10-30T13:20:06.121693892Z",
  "refresh_token": "I8uqxTzF3PVF087kyB7UmhwoWOjo12ha7283pYR52wQ",
  "refresh_expires_at": "2026-11-29T13:05:06.121172607Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e59ae1ee-2b94-42ae-8dbb-745223e072eb",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "463d6231-e585-4dac-acd6-25b8be745341",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-463d6231-e585-4dac-acd6-25b8be745341",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a4f8a12308ff1ab2fab54d6efe3a3240",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=463d6231-e585-4dac-acd6-25b8be745341",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738449312"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=463d6231-e585-4dac-acd6-25b8be745341",
  "expires_at": "2026-10-30T13:35:06.413105Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/463d6231-e585-4dac-acd6-25b8be745341` → **200**

```json
{
  "id": "463d6231-e585-4dac-acd6-25b8be745341",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:35:06.413105Z",
  "card": {
    "id": "bac81648-e0f9-41a9-95bf-cdfe37be23f0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6447",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:05:06.712524Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c4ef8cfd-90ef-4234-ba82-a7cc3a7fdd9d",
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
  "id": "eea7d2b4-6fcd-4cac-a9c4-a33450f91820",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:07.028723Z",
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
  "command_id": "21e61a4c-0213-4bef-9ea1-0b14ded7e89a",
  "quote_id": "eea7d2b4-6fcd-4cac-a9c4-a33450f91820",
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
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385` → **200**

```json
{
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385` → **200**

```json
{
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
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

`GET /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385` → **200**

```json
{
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385/switch-to-cash` → **200**

```json
{
  "command_id": "db6a500e-6f2a-4d28-85ee-a81760d4b8ad",
  "expected_version": 3
}
```

```json
{
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385/switch-to-cash` → **409**

```json
{
  "command_id": "1ef4ac58-82ab-4933-8592-d491ea59eb32",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "357447f9-32e9-49ca-ac59-d49cc647618b"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385` → **200**

```json
{
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0c527d29-0573-4f7d-8acc-015b0e3e5385/cancel` → **200**

```json
{
  "command_id": "de692327-b5b3-4036-949a-65bbc3b2ab34",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0c527d29-0573-4f7d-8acc-015b0e3e5385",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c231ad52-f43a-4325-80c5-18ede354d418",
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
  "created_at": "2026-10-30T13:05:07.334191Z",
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
  "session_id": "cb822c32-806a-4f6f-8446-c1e699beabd7",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MTEsImlhdCI6MTc5MzM2NTUxMSwianRpIjoiNjQxODc5M2EtYzc1Ni00YzRjLWFiOGYtZDI2ZDliMTRiZWYwIiwic2lkIjoiY2I4MjJjMzItODA2YS00ZjZmLTg0NDYtYzFlNjk5YmVhYmQ3In0.SHV5qpB9eU-4rRNyRokV4GfPlMW4Tls5v4ZZZhiMvo0",
  "access_expires_at": "2026-10-30T13:20:11.095546899Z",
  "refresh_token": "URCjASXGxJMcAwEq1fSMbJzGpiL60_nauqzLLMAe3Xc",
  "refresh_expires_at": "2026-10-31T01:05:11.095025915Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28610"
}
```

```json
{
  "challenge_id": "ab61f7a0-c708-4493-9c91-702e7a12e8a4",
  "expires_at": "2026-10-30T13:10:11.384308078Z",
  "resend_available_at": "2026-10-30T13:05:12.384308078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "779538",
  "sent_at": "2026-10-30T13:05:11.386952852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab61f7a0-c708-4493-9c91-702e7a12e8a4",
  "code": "779538",
  "device_ref": "sandbox-28610"
}
```

```json
{
  "session_id": "85987808-1a85-464e-934b-f7401863db2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQxMSwiaWF0IjoxNzkzMzY1NTExLCJqdGkiOiI3YWQwMDg2MC1hNjE3LTQ3MjEtOTAwMi00OTgwZTVjZGNhYTAiLCJzaWQiOiI4NTk4NzgwOC0xYTg1LTQ2NGUtOTM0Yi1mNzQwMTg2M2RiMmEifQ.20itkRYlo_dwcLaGF0aEaPifwMAyK1lmY-Mpc3afiRQ",
  "access_expires_at": "2026-10-30T13:20:11.692668956Z",
  "refresh_token": "8hpSW8B0LVab8o-iKCp0EoKl97a6AZBdiKhIg_GDbWY",
  "refresh_expires_at": "2026-11-29T13:05:11.692131059Z",
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
      "actor_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:04:53.633649Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T13:04:55.128506Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "0cdd2e46-1445-4fa5-b4ec-cfb709a317eb",
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
  "device_ref": "sandbox-24124"
}
```

```json
{
  "challenge_id": "1528004c-6cb8-4c76-a511-8ae7205aec7c",
  "expires_at": "2026-10-30T13:10:12.888337206Z",
  "resend_available_at": "2026-10-30T13:05:13.888337206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "160454",
  "sent_at": "2026-10-30T13:05:12.891012657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1528004c-6cb8-4c76-a511-8ae7205aec7c",
  "code": "160454",
  "device_ref": "sandbox-24124"
}
```

```json
{
  "session_id": "09685f7d-34c2-47b7-ad4f-4829f937fa2c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQxMywiaWF0IjoxNzkzMzY1NTEzLCJqdGkiOiI0YjE0MWEzMS02M2IxLTQ5MmMtYjEyYy0wZmVkY2I1MDVkYzAiLCJzaWQiOiIwOTY4NWY3ZC0zNGMyLTQ3YjctYWQ0Zi00ODI5ZjkzN2ZhMmMifQ.P180-svxvGSNvSkgVwmaToe6eKi7OpQRZRJEIinFhMg",
  "access_expires_at": "2026-10-30T13:20:13.202414879Z",
  "refresh_token": "nCBkUtYg8pBTR6iEIM1MPKF9QedE4pINNDzL98E-DmM",
  "refresh_expires_at": "2026-11-29T13:05:13.20191364Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:04:37.080483Z",
  "last_location_at": "2026-10-30T13:04:37.080483Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/aa7f8784-8424-483c-bf70-9d58f64b4a2d/handover` → **200**

```json
{
  "command_id": "8ee1f495-4887-47ef-9aa3-aeb65b7c9600",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:04:37.080483Z",
  "last_location_at": "2026-10-30T13:04:37.080483Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/aa7f8784-8424-483c-bf70-9d58f64b4a2d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:14Z",
    "sequence": 1793365514808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:05:14.098768Z",
  "last_location_at": "2026-10-30T13:05:14.098768Z",
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
  "command_id": "ebace112-2220-49cd-aa14-1ced8e383008",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:14Z",
    "sequence": 1793365514809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c6b420bc-3913-40e0-9547-8e872ff15191",
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
  "last_heartbeat_at": "2026-10-30T13:05:14.684909Z",
  "last_location_at": "2026-10-30T13:05:14.684909Z",
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
  "session_id": "f719d5f1-3706-44b7-bffe-69b47bf0c658",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY0MTUsImlhdCI6MTc5MzM2NTUxNSwianRpIjoiNjgyZGY1OTgtYzFmOS00OWY4LWJkOGYtM2VlNmU1MTI1MzQ0Iiwic2lkIjoiZjcxOWQ1ZjEtMzcwNi00NGI3LWJmZmUtNjliNDdiZjBjNjU4In0.sG537aRkU5I9QFXVsp3hs-JrrJFBoc3p-pb7lymasxU",
  "access_expires_at": "2026-10-30T13:20:15.298034449Z",
  "refresh_token": "Xx4KJa1PCfR2YGFu28HhTQ56P6ZZrCO6IRnH52rnDMI",
  "refresh_expires_at": "2026-10-31T01:05:15.29738247Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "492628d4-3f0a-4514-af84-52af99457e3e",
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
  "id": "e8788c4f-7014-4af0-a93e-676574ab6aed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:15.593256Z",
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
  "command_id": "819a22f2-3f9e-4d3d-bfd9-04966e2425c3",
  "quote_id": "e8788c4f-7014-4af0-a93e-676574ab6aed",
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
  "id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
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
  "created_at": "2026-10-30T13:05:15.892649Z",
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
    "id": "c90d1f8e-7e5c-4dfb-b797-61999f6d23f3",
    "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
    "expires_at": "2026-10-30T13:05:30.896513Z",
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

`POST /api/driver/v1/offers/c90d1f8e-7e5c-4dfb-b797-61999f6d23f3/accept` → **200**

```json
{
  "command_id": "388b2752-7039-42f2-bab0-39c5607ed663"
}
```

```json
{
  "id": "6c5672f8-ba87-4e15-9bb8-a865c3ca73f5",
  "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "978dcc45-375d-4c48-9967-0af8b7284cf1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "978dcc45-375d-4c48-9967-0af8b7284cf1",
  "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
  "assignment_id": "6c5672f8-ba87-4e15-9bb8-a865c3ca73f5",
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

`POST /api/driver/v1/work-sessions/c6b420bc-3913-40e0-9547-8e872ff15191/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:05:17Z",
    "sequence": 1793365517340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c6b420bc-3913-40e0-9547-8e872ff15191",
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
  "last_heartbeat_at": "2026-10-30T13:05:17.35842Z",
  "last_location_at": "2026-10-30T13:05:17.35842Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/978dcc45-375d-4c48-9967-0af8b7284cf1/arrive` → **200**

```json
{
  "command_id": "75e9aabf-1a13-482c-9957-620238038c23",
  "expected_version": 0
}
```

```json
{
  "id": "978dcc45-375d-4c48-9967-0af8b7284cf1",
  "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
  "assignment_id": "6c5672f8-ba87-4e15-9bb8-a865c3ca73f5",
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
  "arrived_at": "2026-10-30T13:05:17.657714Z",
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

`POST /api/driver/v1/trips/978dcc45-375d-4c48-9967-0af8b7284cf1/start` → **200**

```json
{
  "command_id": "86c987cf-0b99-45d9-8626-3b7f1c0a8425",
  "expected_version": 1
}
```

```json
{
  "id": "978dcc45-375d-4c48-9967-0af8b7284cf1",
  "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
  "assignment_id": "6c5672f8-ba87-4e15-9bb8-a865c3ca73f5",
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
  "arrived_at": "2026-10-30T13:05:17.657714Z",
  "started_at": "2026-10-30T13:05:17.961838Z",
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

`POST /api/driver/v1/trips/978dcc45-375d-4c48-9967-0af8b7284cf1/complete` → **200**

```json
{
  "command_id": "945debef-e89a-4ada-94b2-f909fbe27316",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:05:18Z",
  "cash_received": true
}
```

```json
{
  "id": "978dcc45-375d-4c48-9967-0af8b7284cf1",
  "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
  "assignment_id": "6c5672f8-ba87-4e15-9bb8-a865c3ca73f5",
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
  "arrived_at": "2026-10-30T13:05:17.657714Z",
  "started_at": "2026-10-30T13:05:17.961838Z",
  "completed_at": "2026-10-30T13:05:18.274607Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/98a63f1f-01be-4b98-bb0d-82fa864394cc` → **200**

```json
{
  "id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
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
    "id": "6c5672f8-ba87-4e15-9bb8-a865c3ca73f5",
    "order_id": "98a63f1f-01be-4b98-bb0d-82fa864394cc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "978dcc45-375d-4c48-9967-0af8b7284cf1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:05:15.892649Z",
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
  "session_id": "aa7f8784-8424-483c-bf70-9d58f64b4a2d",
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
  "last_heartbeat_at": "2026-10-30T13:05:14.098768Z",
  "last_location_at": "2026-10-30T13:05:14.098768Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa7f8784-8424-483c-bf70-9d58f64b4a2d/close` → **200**

```json
{
  "command_id": "1bc4db1e-ecd7-4836-b3a6-76346dadb942",
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
  "session_id": "c6b420bc-3913-40e0-9547-8e872ff15191",
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
  "last_heartbeat_at": "2026-10-30T13:05:17.35842Z",
  "last_location_at": "2026-10-30T13:05:17.35842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6b420bc-3913-40e0-9547-8e872ff15191/close` → **200**

```json
{
  "command_id": "a789a647-0f39-4c9d-89cd-d7d2a672df1d",
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

Done: terminal order 98a63f1f-01be-4b98-bb0d-82fa864394cc by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10854"
}
```

```json
{
  "challenge_id": "a665dead-7847-4a13-912b-1decb22b51c3",
  "expires_at": "2026-10-30T13:10:23.366500898Z",
  "resend_available_at": "2026-10-30T13:05:24.366500898Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "791776",
  "sent_at": "2026-10-30T13:05:23.369335859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a665dead-7847-4a13-912b-1decb22b51c3",
  "code": "791776",
  "device_ref": "sandbox-10854"
}
```

```json
{
  "session_id": "5d5098fa-609c-4bf9-acd8-a0c1e9fd84bf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQyMywiaWF0IjoxNzkzMzY1NTIzLCJqdGkiOiJjZDVkMmVlYy1lNjczLTRmOWItYjUzNy0zMDM1MGYwNTQ3YjIiLCJzaWQiOiI1ZDUwOThmYS02MDljLTRiZjktYWNkOC1hMGMxZTlmZDg0YmYifQ.FYT9gix1vO0Krc_a_ySUHm9EE4iB6E7rwW9Z6_8RIss",
  "access_expires_at": "2026-10-30T13:20:23.678312124Z",
  "refresh_token": "r0bLEZm8eokwB36R0RsceEGVyJcErdPUVfYh5mllwPY",
  "refresh_expires_at": "2026-11-29T13:05:23.677805508Z",
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
  "device_ref": "sandbox-31679"
}
```

```json
{
  "challenge_id": "7ada9245-5d57-499b-a794-ad76707e7d78",
  "expires_at": "2026-10-30T13:10:24.245224256Z",
  "resend_available_at": "2026-10-30T13:05:25.245224256Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "048474",
  "sent_at": "2026-10-30T13:05:24.247906229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ada9245-5d57-499b-a794-ad76707e7d78",
  "code": "048474",
  "device_ref": "sandbox-31679"
}
```

```json
{
  "session_id": "a947ac3b-1c9c-4abd-9b83-9b6f13b64144",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQyNCwiaWF0IjoxNzkzMzY1NTI0LCJqdGkiOiJkNDhlMzQzMS05YTFkLTQzYjItYmI3OS04ODk0NmM3NTRjNWIiLCJzaWQiOiJhOTQ3YWMzYi0xYzljLTRhYmQtOWI4My05YjZmMTNiNjQxNDQifQ.dbhf2EMurge12NLzhb52sofpgtLN6zscWF25MDCXijo",
  "access_expires_at": "2026-10-30T13:20:24.563480566Z",
  "refresh_token": "eD2wF1ZMV9Y3gjGCml8xTwpcqyqPMGfV5zmxBp9C6uI",
  "refresh_expires_at": "2026-11-29T13:05:24.562649462Z",
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
  "device_ref": "sandbox-17004"
}
```

```json
{
  "challenge_id": "84117fd7-bb73-48bc-8aac-5bd9a66d6aa2",
  "expires_at": "2026-10-30T13:10:25.124339806Z",
  "resend_available_at": "2026-10-30T13:05:26.124339806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "787405",
  "sent_at": "2026-10-30T13:05:25.12696719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84117fd7-bb73-48bc-8aac-5bd9a66d6aa2",
  "code": "787405",
  "device_ref": "sandbox-17004"
}
```

```json
{
  "session_id": "68e3cdad-fa18-443f-acd6-afd0004e7ad7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NjQyNSwiaWF0IjoxNzkzMzY1NTI1LCJqdGkiOiJlYWU5YTFmMy03MWYyLTRhMGItOWFjMy03YzJmMmFlYzRkMjEiLCJzaWQiOiI2OGUzY2RhZC1mYTE4LTQ0M2YtYWNkNi1hZmQwMDA0ZTdhZDcifQ.QYP6AZamWAeGMi-yQoctj3ak84kGY4DmNvDdnnnmkUk",
  "access_expires_at": "2026-10-30T13:20:25.453839577Z",
  "refresh_token": "FcB-iF0bWkH3HrMZpYfzafbSR-QdP0SC8qslqkafVBo",
  "refresh_expires_at": "2026-11-29T13:05:25.453346125Z",
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
  "phone": "+380694706893",
  "device_ref": "sandbox-5886"
}
```

```json
{
  "challenge_id": "a47ef14b-ef04-418e-9560-80c83127146c",
  "expires_at": "2026-10-30T13:10:26.016407391Z",
  "resend_available_at": "2026-10-30T13:05:27.016407391Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694706893` → **200**

```json
{
  "phone": "+380694706893",
  "audience": "CLIENT",
  "code": "467960",
  "sent_at": "2026-10-30T13:05:26.019089214Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a47ef14b-ef04-418e-9560-80c83127146c",
  "code": "467960",
  "device_ref": "sandbox-5886"
}
```

```json
{
  "session_id": "f13264b5-1fc6-47f4-8f90-cc8b3e9422b9",
  "subject": {
    "type": "CLIENT",
    "id": "23da1b1a-9368-4340-b5d8-624ef2249afb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyM2RhMWIxYS05MzY4LTQzNDAtYjVkOC02MjRlZjIyNDlhZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY2NDI2LCJpYXQiOjE3OTMzNjU1MjYsImp0aSI6IjY4ODc2NTE3LWM1ZGMtNGI4Yy1iMWY4LTY5ZjZiMDhhNTk5YSIsInNpZCI6ImYxMzI2NGI1LTFmYzYtNDdmNC04ZjkwLWNjOGIzZTk0MjJiOSJ9.lMon4-7Lnpui5wCgtuyPazdGSnMYF2h1WAdIY1-rl2g",
  "access_expires_at": "2026-10-30T13:20:26.347228576Z",
  "refresh_token": "DEKXtjCKwSbgemN1Y5h8bL9-JBUiKJqWlXp0aYTakGY",
  "refresh_expires_at": "2026-11-29T13:05:26.346667523Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7d5484bc-e83d-46e1-8c39-edd344203267",
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
  "id": "687f2045-50f0-4281-b3c7-c331a01ccded",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:10:26.635893Z",
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
  "command_id": "257ff109-ce51-4200-b0d1-70ed2f6d3bd7",
  "quote_id": "687f2045-50f0-4281-b3c7-c331a01ccded",
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
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:05:26.948452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:05:26.948452Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.819508625
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.31642601
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.155777569
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

`GET /api/rider/v1/orders/345665b1-fd19-4eab-99e0-f12f0755a285` → **200**

```json
{
  "id": "345665b1-fd19-4eab-99e0-f12f0755a285",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "23da1b1a-9368-4340-b5d8-624ef2249afb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:05:26.948452Z",
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
  "session_id": "6d83fb02-a683-4d08-bb06-ba3a14f14c7f",
  "subject": {
    "type": "STAFF",
    "id": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGFiNjllZi0yOTAzLTQ4OTItOWUxNi01NDNlMGU3ZDljYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjY2MDgsImlhdCI6MTc5MzM2NTcwOCwianRpIjoiMjZiMzBmOGUtZmUyOC00OGU1LTg3NjUtMTAzNWZiMjJkYmVmIiwic2lkIjoiNmQ4M2ZiMDItYTY4My00ZDA4LWJiMDYtYmEzYTE0ZjE0YzdmIn0.Z4rOhpJBy5kAmOB_KiVUVeHyQVPLhfyb2pe-qqhPNhc",
  "access_expires_at": "2026-10-30T13:23:28.967305674Z",
  "refresh_token": "xc6SNFq3jAc53bxUttjA9s-_bFEyfsRRntwKGAwo08A",
  "refresh_expires_at": "2026-10-31T01:08:28.966603792Z",
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
  "id": "91c2998e-9b43-47de-b59c-110704816e08",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.279212Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.279247Z",
  "updated_at": "2026-10-30T13:08:29.297436Z",
  "finished_at": "2026-10-30T13:08:29.297436Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/91c2998e-9b43-47de-b59c-110704816e08` → **200**

```json
{
  "run": {
    "id": "91c2998e-9b43-47de-b59c-110704816e08",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:08:29.279212Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:08:29.279247Z",
    "updated_at": "2026-10-30T13:08:29.297436Z",
    "finished_at": "2026-10-30T13:08:29.297436Z",
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
  "id": "91c2998e-9b43-47de-b59c-110704816e08",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.279212Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.279247Z",
  "updated_at": "2026-10-30T13:08:29.297436Z",
  "finished_at": "2026-10-30T13:08:29.297436Z",
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
  "id": "91c2998e-9b43-47de-b59c-110704816e08",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.279212Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.279247Z",
  "updated_at": "2026-10-30T13:08:29.297436Z",
  "finished_at": "2026-10-30T13:08:29.297436Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3b196b81-6ef7-44bb-be7d-12a8375ec616` → **204**

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
  "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.73744Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.737476Z",
  "updated_at": "2026-10-30T13:08:29.745116Z",
  "finished_at": "2026-10-30T13:08:29.745116Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/e84251e2-e5ae-40ec-8651-14aa7bc39861` → **200**

```json
{
  "run": {
    "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:08:29.73744Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:08:29.737476Z",
    "updated_at": "2026-10-30T13:08:29.745116Z",
    "finished_at": "2026-10-30T13:08:29.745116Z",
    "version": 1
  },
  "items": [
    {
      "id": "4365f634-a14b-4e9b-88cd-d76686b2e277",
      "run_id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "2cb05d6a81ba95f78bf4d384f713622efb7c656d96d60a1f4c2c250fe3e287fd",
      "reference_display": "sandbox-reconciliation-3b196b81-6ef7-44bb-be7d-12a8375ec616",
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
      "provider_at": "2026-10-30T13:08:29Z",
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
  "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.73744Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.737476Z",
  "updated_at": "2026-10-30T13:08:29.745116Z",
  "finished_at": "2026-10-30T13:08:29.745116Z",
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
  "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.73744Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.737476Z",
  "updated_at": "2026-10-30T13:08:29.745116Z",
  "finished_at": "2026-10-30T13:08:29.745116Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/4365f634-a14b-4e9b-88cd-d76686b2e277/resolve` → **200**

```json
{
  "command_id": "8d2ac324-4ca4-4893-b39c-21d8734ce51b",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "4365f634-a14b-4e9b-88cd-d76686b2e277",
  "run_id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "2cb05d6a81ba95f78bf4d384f713622efb7c656d96d60a1f4c2c250fe3e287fd",
  "reference_display": "sandbox-reconciliation-3b196b81-6ef7-44bb-be7d-12a8375ec616",
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
  "provider_at": "2026-10-30T13:08:29Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "resolved_at": "2026-10-30T13:08:30.181128Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/4365f634-a14b-4e9b-88cd-d76686b2e277/resolve` → **200**

```json
{
  "command_id": "8d2ac324-4ca4-4893-b39c-21d8734ce51b",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "4365f634-a14b-4e9b-88cd-d76686b2e277",
  "run_id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "2cb05d6a81ba95f78bf4d384f713622efb7c656d96d60a1f4c2c250fe3e287fd",
  "reference_display": "sandbox-reconciliation-3b196b81-6ef7-44bb-be7d-12a8375ec616",
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
  "provider_at": "2026-10-30T13:08:29Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
  "resolved_at": "2026-10-30T13:08:30.181128Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/4365f634-a14b-4e9b-88cd-d76686b2e277/resolve` → **409**

```json
{
  "command_id": "5d108b23-dc5e-4859-90da-e7fb72528a94",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/4365f634-a14b-4e9b-88cd-d76686b2e277/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e79f4fec-b08e-4917-9d8b-b26a06c73527"
}
```

`GET /api/admin/v1/payment-reconciliations/e84251e2-e5ae-40ec-8651-14aa7bc39861` → **200**

```json
{
  "run": {
    "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:08:29.73744Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:08:29.737476Z",
    "updated_at": "2026-10-30T13:08:30.181128Z",
    "finished_at": "2026-10-30T13:08:29.745116Z",
    "version": 2
  },
  "items": [
    {
      "id": "4365f634-a14b-4e9b-88cd-d76686b2e277",
      "run_id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "2cb05d6a81ba95f78bf4d384f713622efb7c656d96d60a1f4c2c250fe3e287fd",
      "reference_display": "sandbox-reconciliation-3b196b81-6ef7-44bb-be7d-12a8375ec616",
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
      "provider_at": "2026-10-30T13:08:29Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "b0ab69ef-2903-4892-9e16-543e0e7d9cc9",
      "resolved_at": "2026-10-30T13:08:30.181128Z",
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
      "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:08:29.73744Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:08:29.737476Z",
      "updated_at": "2026-10-30T13:08:30.181128Z",
      "finished_at": "2026-10-30T13:08:29.745116Z",
      "version": 2
    },
    {
      "id": "35193eb6-e6ca-42c9-82cd-b4985d5b3d7e",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T13:00:16.602493Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:00:16.602937Z",
      "updated_at": "2026-10-30T13:00:16.610284Z",
      "finished_at": "2026-10-30T13:00:16.610284Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3b196b81-6ef7-44bb-be7d-12a8375ec616` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "e84251e2-e5ae-40ec-8651-14aa7bc39861",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:08:29.73744Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:08:29.737476Z",
  "updated_at": "2026-10-30T13:08:30.181128Z",
  "finished_at": "2026-10-30T13:08:29.745116Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793365836816E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793365837129E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793365837129E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793365836882E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79336583713E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
