# Sandbox transcript (2026-10-30T13:20:15Z, a33b89d)

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
  "correlation_id": "c295cbb1-f8d3-405c-8be7-4fbbca351bfb"
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
  "session_id": "ea74fd4a-0491-4a13-9af3-815755781b01",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMjMsImlhdCI6MTc5MzM2NjQyMywianRpIjoiMDM3OTcwZjUtODExYi00NDZjLTg1ZDUtNDg4YzAzMWUyZmQyIiwic2lkIjoiZWE3NGZkNGEtMDQ5MS00YTEzLTlhZjMtODE1NzU1NzgxYjAxIn0.hGbEcHJHBK_9Tc0ymUzgYh-UvxjBrhdP9hafS6pI2kA",
  "access_expires_at": "2026-10-30T13:35:23.740032742Z",
  "refresh_token": "WRrIb2artPHqYsRnlBS5KUpOGF3RG5f3TKywcDULDbg",
  "refresh_expires_at": "2026-10-31T01:20:23.737791594Z",
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
  "session_id": "0714f34a-a69b-4acd-bf3d-d4629bfbc498",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMjUsImlhdCI6MTc5MzM2NjQyNSwianRpIjoiMzNmMmU3YzctMjQ1Yy00MDM3LTk2YzktNGVkZTQ4NjVmODRkIiwic2lkIjoiMDcxNGYzNGEtYTY5Yi00YWNkLWJmM2QtZDQ2MjliZmJjNDk4In0.lCu31AS6ChG5k9um0iW_y66PTkRLY5TMd-BAQ2HUFb4",
  "access_expires_at": "2026-10-30T13:35:25.620447541Z",
  "refresh_token": "lVq5NvdLMzlQPzdxI_yhc8PobHdujS-RYxhx-krmMTE",
  "refresh_expires_at": "2026-10-31T01:20:25.619459564Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "device_ref": "sandbox-22610"
}
```

```json
{
  "challenge_id": "01eae6e3-b79b-4ef2-8bb3-7ffba6644d7c",
  "expires_at": "2026-10-30T13:25:26.25512258Z",
  "resend_available_at": "2026-10-30T13:20:27.25512258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "834191",
  "sent_at": "2026-10-30T13:20:26.268281278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01eae6e3-b79b-4ef2-8bb3-7ffba6644d7c",
  "code": "834191",
  "device_ref": "sandbox-22610"
}
```

```json
{
  "session_id": "8bc2bdd5-cce9-4a22-aa05-e3fd543d91c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMyNiwiaWF0IjoxNzkzMzY2NDI2LCJqdGkiOiJlYzY0Y2Y1Zi1hYzhiLTQzZmEtYmYyNC1kNTRlYmQyNmI0NmUiLCJzaWQiOiI4YmMyYmRkNS1jY2U5LTRhMjItYWEwNS1lM2ZkNTQzZDkxYzUifQ.PCvwUc86g-w68qznlxGpzaBLEE1NuStyOCqbEBMUt04",
  "access_expires_at": "2026-10-30T13:35:26.613672724Z",
  "refresh_token": "9HtvBgV7q-hwgTfBKAKN5hibwvCRWpcfSMKnjWS69kU",
  "refresh_expires_at": "2026-11-29T13:20:26.612498051Z",
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
  "command_id": "2e6f4d53-0819-472e-8315-e0584edbd8dc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:27Z",
    "sequence": 1793366427220
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bb7f47d2-c829-4642-bc65-397d2a72951e",
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
  "last_heartbeat_at": "2026-10-30T13:20:27.326965Z",
  "last_location_at": "2026-10-30T13:20:27.326965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636445181",
  "device_ref": "sandbox-388"
}
```

```json
{
  "challenge_id": "f911777c-7974-49ca-9ea4-81bdc57d6273",
  "expires_at": "2026-10-30T13:25:27.634957809Z",
  "resend_available_at": "2026-10-30T13:20:28.634957809Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636445181` → **200**

```json
{
  "phone": "+380636445181",
  "audience": "CLIENT",
  "code": "944992",
  "sent_at": "2026-10-30T13:20:27.640438284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f911777c-7974-49ca-9ea4-81bdc57d6273",
  "code": "944992",
  "device_ref": "sandbox-388"
}
```

```json
{
  "session_id": "a912ffc0-88cd-4f00-a7b3-2f151071fdae",
  "subject": {
    "type": "CLIENT",
    "id": "3b80dc3b-fb61-43ea-b19a-3ffaf4ae38db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjgwZGMzYi1mYjYxLTQzZWEtYjE5YS0zZmZhZjRhZTM4ZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzI3LCJpYXQiOjE3OTMzNjY0MjcsImp0aSI6ImJiNmU4ZGE2LWI0MWItNDVkZS1hYmE3LTFlYjMzNjBhY2I2YSIsInNpZCI6ImE5MTJmZmMwLTg4Y2QtNGYwMC1hN2IzLTJmMTUxMDcxZmRhZSJ9.tgj4akJMtQXv1IZEzHdHQfTcPBxw_qFzGAzNFhQJeKU",
  "access_expires_at": "2026-10-30T13:35:27.964354189Z",
  "refresh_token": "jelhQld7TtPxQMSRQSHLD7NjO23sboJESEX1PJUlM6I",
  "refresh_expires_at": "2026-11-29T13:20:27.963377103Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b8ef0d19-8474-4f0e-8f16-602be1f22b8e",
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
  "id": "4e700af9-4280-4727-bba8-8f26425f65ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:28.310137Z",
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
  "command_id": "293b8f32-29b5-45a7-9fbe-24cc4bb76aab",
  "quote_id": "4e700af9-4280-4727-bba8-8f26425f65ce",
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
  "id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3b80dc3b-fb61-43ea-b19a-3ffaf4ae38db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:20:28.711354Z",
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
    "id": "f12d5806-0c1c-4120-b742-720765fcca21",
    "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
    "expires_at": "2026-10-30T13:20:43.72287Z",
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

`POST /api/driver/v1/offers/f12d5806-0c1c-4120-b742-720765fcca21/accept` → **200**

```json
{
  "command_id": "36ce8568-78e7-4a59-a636-a23dc6f16a48"
}
```

```json
{
  "id": "e2d06c31-b90b-4c25-937b-a6239c1cb585",
  "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "89f5c186-ffbc-4e08-a92e-e2cd36e4e47f",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "command_id": "edc8c232-89c4-48e9-bc4e-7fd63e62b224",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:20:30.042081824Z"
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
  "id": "89f5c186-ffbc-4e08-a92e-e2cd36e4e47f",
  "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
  "assignment_id": "e2d06c31-b90b-4c25-937b-a6239c1cb585",
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

`POST /api/driver/v1/work-sessions/bb7f47d2-c829-4642-bc65-397d2a72951e/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:31Z",
    "sequence": 1793366431643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bb7f47d2-c829-4642-bc65-397d2a72951e",
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
  "last_heartbeat_at": "2026-10-30T13:20:31.090665Z",
  "last_location_at": "2026-10-30T13:20:31.090665Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/89f5c186-ffbc-4e08-a92e-e2cd36e4e47f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a7182dc2-aa97-4c08-9460-b7f49e36f51f",
  "expected_version": 0
}
```

```json
{
  "id": "89f5c186-ffbc-4e08-a92e-e2cd36e4e47f",
  "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
  "assignment_id": "e2d06c31-b90b-4c25-937b-a6239c1cb585",
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
  "arrived_at": "2026-10-30T13:20:31.419097Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/89f5c186-ffbc-4e08-a92e-e2cd36e4e47f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3819cf61-23cb-4ef2-aca9-8a48f87d0129",
  "expected_version": 1
}
```

```json
{
  "id": "89f5c186-ffbc-4e08-a92e-e2cd36e4e47f",
  "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
  "assignment_id": "e2d06c31-b90b-4c25-937b-a6239c1cb585",
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
  "arrived_at": "2026-10-30T13:20:31.419097Z",
  "started_at": "2026-10-30T13:20:31.735923Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/89f5c186-ffbc-4e08-a92e-e2cd36e4e47f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "61cab1ee-d350-460c-a32c-8d6cf11fdfdf",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:32Z",
  "cash_received": true
}
```

```json
{
  "id": "89f5c186-ffbc-4e08-a92e-e2cd36e4e47f",
  "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
  "assignment_id": "e2d06c31-b90b-4c25-937b-a6239c1cb585",
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
  "arrived_at": "2026-10-30T13:20:31.419097Z",
  "started_at": "2026-10-30T13:20:31.735923Z",
  "completed_at": "2026-10-30T13:20:32.05559Z",
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
  "session_id": "bb7f47d2-c829-4642-bc65-397d2a72951e",
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
  "last_heartbeat_at": "2026-10-30T13:20:31.090665Z",
  "last_location_at": "2026-10-30T13:20:31.090665Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bb7f47d2-c829-4642-bc65-397d2a72951e/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "cf3f5606-2d27-4d2a-b160-b33483368e3a",
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
  "command_id": "86ac48d2-e703-4ccb-a08a-3d1cef62f49c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:32Z",
    "sequence": 1793366433325
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
  "correlation_id": "c9eea911-bdd2-4189-ac8a-124accd0a6a9",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "7755c42d-f5bc-4300-8b38-7bd3d513fce2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:33Z",
    "sequence": 1793366433326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faa9c9a7-3943-4dd8-b36a-465789f7cd47",
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
  "last_heartbeat_at": "2026-10-30T13:20:33.347618Z",
  "last_location_at": "2026-10-30T13:20:33.347618Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:20:30.042082Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "34ea8231-2332-40ad-bff6-32bb1f38d3a6",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:20:33.976210848Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faa9c9a7-3943-4dd8-b36a-465789f7cd47",
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
  "last_heartbeat_at": "2026-10-30T13:20:33.347618Z",
  "last_location_at": "2026-10-30T13:20:33.347618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/faa9c9a7-3943-4dd8-b36a-465789f7cd47/close` → **200**

```json
{
  "command_id": "affb1f6c-05c5-44ae-8a09-8eefb99a30b5",
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
  "session_id": "10b89061-4ff4-4ef5-8a36-240c4071a33f",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMzUsImlhdCI6MTc5MzM2NjQzNSwianRpIjoiM2JmZDYyODAtMjNhOS00NGRkLTk1ZDctNThhYzRmNGU0YTg1Iiwic2lkIjoiMTBiODkwNjEtNGZmNC00ZWY1LThhMzYtMjQwYzQwNzFhMzNmIn0.4L0wZqLqTE-riI-WcRYI5fPw0YVCjII6KYtF0ZfrdN0",
  "access_expires_at": "2026-10-30T13:35:35.217229702Z",
  "refresh_token": "KTyq94jqq1bDSSENln98dpe6sSVv3BR31XP6zhWaAmg",
  "refresh_expires_at": "2026-10-31T01:20:35.216246015Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "602ea089-7222-4cfb-a63f-10970388243a",
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
  "id": "adffbdec-da70-49af-92f0-4daca57900ac",
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
  "created_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "created_at": "2026-10-30T13:20:35.544036Z",
  "updated_at": "2026-10-30T13:20:35.544036Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635887626",
  "device_ref": "sandbox-20118"
}
```

```json
{
  "challenge_id": "b5347b49-da7f-41e6-9aac-1553f9390e5f",
  "expires_at": "2026-10-30T13:25:35.861005584Z",
  "resend_available_at": "2026-10-30T13:20:36.861005584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635887626` → **200**

```json
{
  "phone": "+380635887626",
  "audience": "CLIENT",
  "code": "355459",
  "sent_at": "2026-10-30T13:20:35.865880246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5347b49-da7f-41e6-9aac-1553f9390e5f",
  "code": "355459",
  "device_ref": "sandbox-20118"
}
```

```json
{
  "session_id": "af3d17a0-a012-41a5-b2d3-162d44afd99f",
  "subject": {
    "type": "CLIENT",
    "id": "8bc87032-54b0-42d9-8114-974d2df97140"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YmM4NzAzMi01NGIwLTQyZDktODExNC05NzRkMmRmOTcxNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzM2LCJpYXQiOjE3OTMzNjY0MzYsImp0aSI6ImZkMzhlYjY2LTcxM2EtNDFjOS04Y2U2LTRlODE0Njg1NzAzOSIsInNpZCI6ImFmM2QxN2EwLWEwMTItNDFhNS1iMmQzLTE2MmQ0NGFmZDk5ZiJ9.CAzlOB9I_BwqR4JMAlsv0_tZ-DkcHvlyq-AWGv3oVCA",
  "access_expires_at": "2026-10-30T13:35:36.186214247Z",
  "refresh_token": "ixKSPrazQQXACe2Km-8388obTaB-tXbQe0erDBKN6bU",
  "refresh_expires_at": "2026-11-29T13:20:36.185377182Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635887626` → **200**

```json
{
  "client_id": "8bc87032-54b0-42d9-8114-974d2df97140"
}
```

`POST /api/admin/v1/rider-wallets/8bc87032-54b0-42d9-8114-974d2df97140/top-ups` → **201**

```json
{
  "command_id": "bdc97cf5-dfa7-4f69-bed4-ad7ae0617319",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "8bc87032-54b0-42d9-8114-974d2df97140",
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
      "id": "581f4950-6077-4452-99f2-ad3479f7e51a",
      "at": "2026-10-30T13:20:36.796487Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82bfbcc0-d7a5-49cb-bfb8-a2b8a588cc36",
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
  "id": "7d6c1536-3d96-4f14-8ab5-cdd6b5a826fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:37.146838Z",
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
      "id": "adffbdec-da70-49af-92f0-4daca57900ac",
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
  "device_ref": "sandbox-21081"
}
```

```json
{
  "challenge_id": "71b05eec-85a5-4ce1-8c95-e193b12f8662",
  "expires_at": "2026-10-30T13:25:37.460196414Z",
  "resend_available_at": "2026-10-30T13:20:38.460196414Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "678475",
  "sent_at": "2026-10-30T13:20:37.46547325Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71b05eec-85a5-4ce1-8c95-e193b12f8662",
  "code": "678475",
  "device_ref": "sandbox-21081"
}
```

```json
{
  "session_id": "65307eee-4639-44e7-ab66-ea41c009d490",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMzNywiaWF0IjoxNzkzMzY2NDM3LCJqdGkiOiI1MzhkZDk0ZC01ODIyLTQyYjEtYTYxNC1jZjVkODM2ZDZiODIiLCJzaWQiOiI2NTMwN2VlZS00NjM5LTQ0ZTctYWI2Ni1lYTQxYzAwOWQ0OTAifQ.40KYB1HprD0vlL4VMA5iAsmfrX3FnKpRIeQfNTM23vA",
  "access_expires_at": "2026-10-30T13:35:37.80470348Z",
  "refresh_token": "WmIiEs7VCbbj_K-ziG6_atJ29CiuzeBzqTbANmj2OsM",
  "refresh_expires_at": "2026-11-29T13:20:37.803885258Z",
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
  "command_id": "df5d3724-ff0d-4526-91a7-4ce024ab9bb1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:38Z",
    "sequence": 1793366438418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83ec5992-fd42-40dd-b9df-f50414b1ad35",
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
  "last_heartbeat_at": "2026-10-30T13:20:38.441323Z",
  "last_location_at": "2026-10-30T13:20:38.441323Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f1e4bbac-a804-4d21-bfe5-8e9f7dc95efc",
  "quote_id": "7d6c1536-3d96-4f14-8ab5-cdd6b5a826fc",
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
  "id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8bc87032-54b0-42d9-8114-974d2df97140",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:20:38.770257Z",
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
  "client_id": "8bc87032-54b0-42d9-8114-974d2df97140",
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
      "id": "581f4950-6077-4452-99f2-ad3479f7e51a",
      "at": "2026-10-30T13:20:36.796487Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
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
    "id": "e87d0b48-0cb1-48a0-b506-96eca06e7fd9",
    "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
    "expires_at": "2026-10-30T13:20:53.778858Z",
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

`POST /api/driver/v1/offers/e87d0b48-0cb1-48a0-b506-96eca06e7fd9/accept` → **200**

```json
{
  "command_id": "e9254c6f-7aeb-47ad-acca-2604a8500f4f"
}
```

```json
{
  "id": "05c5933f-f5be-4b4e-80c8-88120cc4b890",
  "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6793b24c-4344-4552-bdfc-fb08024606aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6793b24c-4344-4552-bdfc-fb08024606aa",
  "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
  "assignment_id": "05c5933f-f5be-4b4e-80c8-88120cc4b890",
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

(the car drives 2 s to the next point)

`POST /api/driver/v1/work-sessions/83ec5992-fd42-40dd-b9df-f50414b1ad35/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:42Z",
    "sequence": 1793366442337
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83ec5992-fd42-40dd-b9df-f50414b1ad35",
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
  "last_heartbeat_at": "2026-10-30T13:20:42.359661Z",
  "last_location_at": "2026-10-30T13:20:42.359661Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6793b24c-4344-4552-bdfc-fb08024606aa/arrive` → **200**

```json
{
  "command_id": "6fbf7b4c-8dda-4bdf-88a7-bc746f3025aa",
  "expected_version": 0
}
```

```json
{
  "id": "6793b24c-4344-4552-bdfc-fb08024606aa",
  "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
  "assignment_id": "05c5933f-f5be-4b4e-80c8-88120cc4b890",
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
  "arrived_at": "2026-10-30T13:20:42.674948Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6793b24c-4344-4552-bdfc-fb08024606aa/start` → **200**

```json
{
  "command_id": "c182ab44-5c3f-45b0-b302-2c5ce3e183fa",
  "expected_version": 1
}
```

```json
{
  "id": "6793b24c-4344-4552-bdfc-fb08024606aa",
  "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
  "assignment_id": "05c5933f-f5be-4b4e-80c8-88120cc4b890",
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
  "arrived_at": "2026-10-30T13:20:42.674948Z",
  "started_at": "2026-10-30T13:20:42.985584Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6793b24c-4344-4552-bdfc-fb08024606aa/complete` → **200**

```json
{
  "command_id": "9916d6fe-9db5-4d61-bac0-f9942e0736a3",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:43Z",
  "cash_received": true
}
```

```json
{
  "id": "6793b24c-4344-4552-bdfc-fb08024606aa",
  "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
  "assignment_id": "05c5933f-f5be-4b4e-80c8-88120cc4b890",
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
  "arrived_at": "2026-10-30T13:20:42.674948Z",
  "started_at": "2026-10-30T13:20:42.985584Z",
  "completed_at": "2026-10-30T13:20:43.337495Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8bc87032-54b0-42d9-8114-974d2df97140",
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
      "id": "8bd263c4-2f7d-4165-b81a-c8998588968e",
      "at": "2026-10-30T13:20:43.596865Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a"
    },
    {
      "id": "581f4950-6077-4452-99f2-ad3479f7e51a",
      "at": "2026-10-30T13:20:36.796487Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/adffbdec-da70-49af-92f0-4daca57900ac/archive` → **200**

```json
{
  "command_id": "a006a0d6-9d5c-4a14-a3d7-3d0811b4d53e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "adffbdec-da70-49af-92f0-4daca57900ac",
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
  "created_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "created_at": "2026-10-30T13:20:35.544036Z",
  "updated_at": "2026-10-30T13:20:46.976656Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83ec5992-fd42-40dd-b9df-f50414b1ad35",
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
  "last_heartbeat_at": "2026-10-30T13:20:42.359661Z",
  "last_location_at": "2026-10-30T13:20:42.359661Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83ec5992-fd42-40dd-b9df-f50414b1ad35/close` → **200**

```json
{
  "command_id": "5d83216d-3a13-4ab2-a100-f83fe8d032bb",
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

Done: order 6c4f2107-a56e-4a8f-a2da-54ef28c2166a.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-13213"
}
```

```json
{
  "challenge_id": "5e7c2827-7666-4722-b770-2ea489c85a73",
  "expires_at": "2026-10-30T13:25:47.91351207Z",
  "resend_available_at": "2026-10-30T13:20:48.91351207Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "939257",
  "sent_at": "2026-10-30T13:20:47.918333642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e7c2827-7666-4722-b770-2ea489c85a73",
  "code": "939257",
  "device_ref": "sandbox-13213"
}
```

```json
{
  "session_id": "e227acb6-24ce-40e7-a528-a1e8f7cb60ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM0OCwiaWF0IjoxNzkzMzY2NDQ4LCJqdGkiOiI3Mjg3ZjA2ZC02ZDVlLTQwNmMtOTNiZC1iZDU5YWI0NDVjZTkiLCJzaWQiOiJlMjI3YWNiNi0yNGNlLTQwZTctYTUyOC1hMWU4ZjdjYjYwZWEifQ.7Wv-OeQsie-HF80acbe9G0EzuUlI0nZaGaV6JO0VtBo",
  "access_expires_at": "2026-10-30T13:35:48.254509885Z",
  "refresh_token": "FmJf1mvMOZ0OEfJJbD6hYj7O3ndOJkroqDV6zqRQyew",
  "refresh_expires_at": "2026-11-29T13:20:48.253696493Z",
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
  "command_id": "a0525311-926a-4b16-b28e-d791ba581e9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:49Z",
    "sequence": 1793366449137
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e3621776-98a0-47b4-b146-83bd7f5b9300",
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
  "last_heartbeat_at": "2026-10-30T13:20:49.159003Z",
  "last_location_at": "2026-10-30T13:20:49.159003Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/e3621776-98a0-47b4-b146-83bd7f5b9300/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:54Z",
    "sequence": 1793366454463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e3621776-98a0-47b4-b146-83bd7f5b9300",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:20:54.485232Z",
  "last_location_at": "2026-10-30T13:20:49.159003Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_STALE"
  ],
  "accepted": false
}
```

## The operator's map still shows her in Warsaw

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
  "session_id": "28aba317-db96-4e1e-b462-4e22ead416ca",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczNTUsImlhdCI6MTc5MzM2NjQ1NSwianRpIjoiNWVjOWM3MWYtMTkyYy00YmM0LTk2YmYtNTRmOGYxZDdhZjA4Iiwic2lkIjoiMjhhYmEzMTctZGI5Ni00ZTFlLWI0NjItNGUyMmVhZDQxNmNhIn0.0JKB5wU6yKKh-MkwNtAe2DiHIJGh0oYKGpqBUbsc3Iw",
  "access_expires_at": "2026-10-30T13:35:55.087497696Z",
  "refresh_token": "bTBzpGFs2AbDjBnZyrnGzDvMnaYhwiFTjZwByXyhoSc",
  "refresh_expires_at": "2026-10-31T01:20:55.086762209Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T13:20:55.37793218Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000405",
      "name": "Anna Wiśniewska",
      "car": {
        "registration_number": "WA0002T",
        "make": "Kia",
        "model": "Ceed",
        "color": "blue",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "last_location_at": "2026-10-30T13:20:49.159003Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/e3621776-98a0-47b4-b146-83bd7f5b9300/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:55Z",
    "sequence": 1793366455691
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e3621776-98a0-47b4-b146-83bd7f5b9300",
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
  "last_heartbeat_at": "2026-10-30T13:20:55.712871Z",
  "last_location_at": "2026-10-30T13:20:55.712871Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

Done: the jump to Lviv was refused, the map kept Warsaw, the next plausible fix was accepted.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "e3621776-98a0-47b4-b146-83bd7f5b9300",
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
  "last_heartbeat_at": "2026-10-30T13:20:55.712871Z",
  "last_location_at": "2026-10-30T13:20:55.712871Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e3621776-98a0-47b4-b146-83bd7f5b9300/close` → **200**

```json
{
  "command_id": "13a85525-0607-4897-8c02-31cf5b8a9a56",
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

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-4436"
}
```

```json
{
  "challenge_id": "388d74fc-788f-4a5f-838b-535ed257d444",
  "expires_at": "2026-10-30T13:25:56.650876335Z",
  "resend_available_at": "2026-10-30T13:20:57.650876335Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "632894",
  "sent_at": "2026-10-30T13:20:56.655236961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "388d74fc-788f-4a5f-838b-535ed257d444",
  "code": "632894",
  "device_ref": "sandbox-4436"
}
```

```json
{
  "session_id": "014f3b3c-24aa-4c37-8ef6-35f21dcff869",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM1NiwiaWF0IjoxNzkzMzY2NDU2LCJqdGkiOiI3MTBmZDM0OC1kNDlkLTRhOTAtYjBhZS0wNDUyYzcwMTA2ZGQiLCJzaWQiOiIwMTRmM2IzYy0yNGFhLTRjMzctOGVmNi0zNWYyMWRjZmY4NjkifQ.lbZFyQdgQg8YRyTTH9DFbrKYbO5X288sfRniGfMubIo",
  "access_expires_at": "2026-10-30T13:35:56.982829349Z",
  "refresh_token": "mmUXVB5W7PIpY4lnbcT1Ak-GztCYRJr71FtYZm2LdfM",
  "refresh_expires_at": "2026-11-29T13:20:56.982046697Z",
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
  "device_ref": "sandbox-3475"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "2362aac7-5301-4133-b862-f8ce436f63eb",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-3475"
}
```

```json
{
  "challenge_id": "5289d520-f131-4fa0-b73e-d279159b9702",
  "expires_at": "2026-10-30T13:25:58.866137696Z",
  "resend_available_at": "2026-10-30T13:20:59.866137696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "666679",
  "sent_at": "2026-10-30T13:20:58.869877726Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5289d520-f131-4fa0-b73e-d279159b9702",
  "code": "666679",
  "device_ref": "sandbox-3475"
}
```

```json
{
  "session_id": "1f01f579-a6a0-4a11-b4d6-e142c05433d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM1OSwiaWF0IjoxNzkzMzY2NDU5LCJqdGkiOiJlYjU0NzA4Yi01ZmVmLTRlYjYtYTQyMy1jMjg3ZDE2ODA3ODAiLCJzaWQiOiIxZjAxZjU3OS1hNmEwLTRhMTEtYjRkNi1lMTQyYzA1NDMzZDkifQ.TIFKLOWJDvH1BN47Y618jJbEafLPlvQ-bqqZZWKF4bg",
  "access_expires_at": "2026-10-30T13:35:59.186816596Z",
  "refresh_token": "j3S5F4oqvt7pEcks39X_S25j17-ImhGbuHp7K919d5g",
  "refresh_expires_at": "2026-11-29T13:20:59.186102889Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-5138"
}
```

```json
{
  "challenge_id": "54f812d8-9ffb-476b-b1d2-bb5303f50659",
  "expires_at": "2026-10-30T13:25:59.491444637Z",
  "resend_available_at": "2026-10-30T13:21:00.491444637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "820601",
  "sent_at": "2026-10-30T13:20:59.495770321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54f812d8-9ffb-476b-b1d2-bb5303f50659",
  "code": "820601",
  "device_ref": "sandbox-5138"
}
```

```json
{
  "session_id": "824d4399-5c5d-4707-a109-275ec427417e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM1OSwiaWF0IjoxNzkzMzY2NDU5LCJqdGkiOiJmZDI0YjcwNy1iOGE4LTQwNjEtOWVmOS02ZDNhMWNlM2ViNzUiLCJzaWQiOiI4MjRkNDM5OS01YzVkLTQ3MDctYTEwOS0yNzVlYzQyNzQxN2UifQ.hrDrDxBuHf8XPbEojULctBl5mI3kJBlp5C0lo0EZ-Cs",
  "access_expires_at": "2026-10-30T13:35:59.825368054Z",
  "refresh_token": "wRIG2Yv63LEUewBIGUqU6kZbknrZXOKoanNiYiy1DGc",
  "refresh_expires_at": "2026-11-29T13:20:59.824701275Z",
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

(the car drives 183 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "5443cc26-c77b-401b-894e-e78e3156d858",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:03Z",
    "sequence": 1793366643739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "edf52ab8-9f64-4d37-acc9-06e90cf3e6e3",
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
  "last_heartbeat_at": "2026-10-30T13:24:03.762111Z",
  "last_location_at": "2026-10-30T13:24:03.762111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600371117",
  "device_ref": "sandbox-30732"
}
```

```json
{
  "challenge_id": "c7ff0fed-e871-48c5-9064-628490532e17",
  "expires_at": "2026-10-30T13:29:04.06942093Z",
  "resend_available_at": "2026-10-30T13:24:05.06942093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600371117` → **200**

```json
{
  "phone": "+48600371117",
  "audience": "CLIENT",
  "code": "470992",
  "sent_at": "2026-10-30T13:24:04.073490919Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7ff0fed-e871-48c5-9064-628490532e17",
  "code": "470992",
  "device_ref": "sandbox-30732"
}
```

```json
{
  "session_id": "4bf5f79a-eb11-4560-90fa-49baa651ec48",
  "subject": {
    "type": "CLIENT",
    "id": "156487f8-5a71-4bf3-9476-43a26921a211"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTY0ODdmOC01YTcxLTRiZjMtOTQ3Ni00M2EyNjkyMWEyMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTQ0LCJpYXQiOjE3OTMzNjY2NDQsImp0aSI6ImYzZjA3ZGU1LTRkMzctNDYzYy1iZjY4LTViZDU2MzM4M2Y3ZiIsInNpZCI6IjRiZjVmNzlhLWViMTEtNDU2MC05MGZhLTQ5YmFhNjUxZWM0OCJ9.McUJmfRV5zLy-tdE1Ja7NfLoUf095ZknCZxcQT2oDM8",
  "access_expires_at": "2026-10-30T13:39:04.411688884Z",
  "refresh_token": "lXcoBgXNczSUPWnElrUGKjHMRg8Ba1VA-wktmxPAZWk",
  "refresh_expires_at": "2026-11-29T13:24:04.411073638Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b71179a-5009-433a-8837-9970c0fb21bd",
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
  "id": "3c08a7fd-2b10-412c-b676-e900dc5fd07b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:04.717334Z",
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
  "command_id": "2dfa0899-064d-4cc0-a8cd-6e279a14e9fb",
  "quote_id": "3c08a7fd-2b10-412c-b676-e900dc5fd07b",
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
  "id": "3e853483-0d23-405f-acda-699848805974",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "156487f8-5a71-4bf3-9476-43a26921a211",
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
  "created_at": "2026-10-30T13:24:05.028925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e853483-0d23-405f-acda-699848805974` → **200**

```json
{
  "id": "3e853483-0d23-405f-acda-699848805974",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "156487f8-5a71-4bf3-9476-43a26921a211",
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
  "created_at": "2026-10-30T13:24:05.028925Z",
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

`POST /api/driver/v1/orders/3e853483-0d23-405f-acda-699848805974/claim` → **422**

```json
{
  "command_id": "52d43a4c-db22-4229-8f09-0f86c3ced96e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3e853483-0d23-405f-acda-699848805974/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "143ec2ec-d3e9-4ffa-bd4c-7ffddd770755"
}
```

`GET /api/rider/v1/orders/3e853483-0d23-405f-acda-699848805974` → **200**

```json
{
  "id": "3e853483-0d23-405f-acda-699848805974",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "156487f8-5a71-4bf3-9476-43a26921a211",
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
  "created_at": "2026-10-30T13:24:05.028925Z",
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

`POST /api/driver/v1/orders/5709a9c5-b0ac-4f36-adff-7d16143ca66d/claim` → **404**

```json
{
  "command_id": "2490e838-bd5d-49e5-95fc-d3a5a1c62780"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5709a9c5-b0ac-4f36-adff-7d16143ca66d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5330ec84-1b1e-4961-a8f3-83de811a19e7"
}
```

`POST /api/driver/v1/orders/4a744062-6da4-4f4d-a0ee-cdf7500cf734/claim` → **404**

```json
{
  "command_id": "8ed7be97-95db-4c07-8500-487d032875e1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4a744062-6da4-4f4d-a0ee-cdf7500cf734/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e0efc96b-cbee-4ddd-8690-f933c4bba9be"
}
```

`POST /api/driver/v1/orders/61c47c12-9286-427b-9fd1-727709046e15/claim` → **404**

```json
{
  "command_id": "8e1f9c0d-d015-4536-9950-fe4f5b677419"
}
```

```json
{
  "instance": "/api/driver/v1/orders/61c47c12-9286-427b-9fd1-727709046e15/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ba3118e8-ee10-45b4-8081-515e6f49fb31"
}
```

`POST /api/driver/v1/orders/800d0e85-8c13-44f0-bdc1-799c8be9efdc/claim` → **404**

```json
{
  "command_id": "df89d3a0-5d04-4dd4-98b9-bdbf283e0739"
}
```

```json
{
  "instance": "/api/driver/v1/orders/800d0e85-8c13-44f0-bdc1-799c8be9efdc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "26775eb2-549d-410f-8c37-c094c8715f24"
}
```

`POST /api/driver/v1/orders/c8f36d58-4727-4700-8130-96a2b95d0dd5/claim` → **404**

```json
{
  "command_id": "7ecf8013-ebbc-4572-a220-826ca5b6aaab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c8f36d58-4727-4700-8130-96a2b95d0dd5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "45426a1a-051c-4db4-b210-fb86024b0529"
}
```

`POST /api/driver/v1/orders/960ea495-8dea-41a8-8a90-5246f1c6b135/claim` → **404**

```json
{
  "command_id": "63d9ec12-647c-4f52-9eaf-28d5381e9e62"
}
```

```json
{
  "instance": "/api/driver/v1/orders/960ea495-8dea-41a8-8a90-5246f1c6b135/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "72f59172-f9b5-4ed2-9377-81da35c9b75a"
}
```

`POST /api/driver/v1/orders/d513f68c-c4d2-48b2-8f51-3253365f59d3/claim` → **404**

```json
{
  "command_id": "6069feb8-62af-4813-9b4f-47d6e8a53e2b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d513f68c-c4d2-48b2-8f51-3253365f59d3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bbafc3ad-3f28-4edd-ad5a-0148c93b8662"
}
```

`POST /api/driver/v1/orders/e71ac8d3-7c0b-477f-a29f-780566cacda4/claim` → **404**

```json
{
  "command_id": "e045738b-0a87-4eb0-93f1-f7422dc21775"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e71ac8d3-7c0b-477f-a29f-780566cacda4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9b87e897-d496-4ecb-98d8-de0cd6cf8208"
}
```

`POST /api/driver/v1/orders/541207a1-52c5-41f7-8220-c719533616d6/claim` → **404**

```json
{
  "command_id": "bb71eccb-153f-4a6c-be0f-8ec8cbeeff34"
}
```

```json
{
  "instance": "/api/driver/v1/orders/541207a1-52c5-41f7-8220-c719533616d6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "60a52648-8066-44e2-957f-b5e75110ae42"
}
```

`POST /api/driver/v1/orders/29d5e71d-1304-411b-83f7-494e2adce6fc/claim` → **404**

```json
{
  "command_id": "ba4c6055-1b64-469d-bcc2-6800a7618d3b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/29d5e71d-1304-411b-83f7-494e2adce6fc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a9baf979-1212-464f-946a-fb1d1e05e727"
}
```

`POST /api/driver/v1/orders/2a5a9e82-29b5-4256-b40b-5c628ce32145/claim` → **404**

```json
{
  "command_id": "41c8d2a4-0873-4963-8daf-03764202cd6a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2a5a9e82-29b5-4256-b40b-5c628ce32145/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ec14f768-4377-42ad-a4e4-56a47d485d3b"
}
```

`POST /api/driver/v1/orders/2b746037-6e5f-40fb-baf0-cd84aa62a9f0/claim` → **404**

```json
{
  "command_id": "755c8a23-0939-421f-8896-7f8da11f95d3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2b746037-6e5f-40fb-baf0-cd84aa62a9f0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2c664de2-e200-4f40-b25c-9e009ec53655"
}
```

`POST /api/driver/v1/orders/92d731a1-86e4-46d1-a003-4153c311caed/claim` → **404**

```json
{
  "command_id": "4c73b4f6-4d0f-4a19-bef6-6b14849e8c5f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/92d731a1-86e4-46d1-a003-4153c311caed/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "888f5cb7-6dba-4711-a5e1-33d77cc77715"
}
```

`POST /api/driver/v1/orders/99f1da36-4cbe-48b1-8c57-f901882eb168/claim` → **404**

```json
{
  "command_id": "35bfa2cf-2770-4167-b7ef-3045b2b4887f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/99f1da36-4cbe-48b1-8c57-f901882eb168/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "401ec5d2-d143-4c74-8eab-be8822f87e6c"
}
```

`POST /api/driver/v1/orders/4c254814-4dc8-4468-a73b-7cbf5f7e75a7/claim` → **404**

```json
{
  "command_id": "7f7d1562-aefd-4d38-9f60-7175aaba4fb4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4c254814-4dc8-4468-a73b-7cbf5f7e75a7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b98f9acc-d09f-4111-a437-86a00525377b"
}
```

`POST /api/driver/v1/orders/e3222880-077b-4fe0-b564-7f0a5f93d80c/claim` → **404**

```json
{
  "command_id": "e84ec425-967f-45a6-945c-e492edb5bc14"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e3222880-077b-4fe0-b564-7f0a5f93d80c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "071bda2a-1222-4091-95db-4ec533237b74"
}
```

`POST /api/driver/v1/orders/dd39987f-0907-4d00-a017-d3e8b0c95bd4/claim` → **404**

```json
{
  "command_id": "d26833dd-b69c-4586-b518-54dc21292ed0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dd39987f-0907-4d00-a017-d3e8b0c95bd4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b4c06a3e-7e82-439a-a682-b308f60cfaf6"
}
```

`POST /api/driver/v1/orders/ed558577-49f5-40d4-9714-7ba7dcc36c37/claim` → **404**

```json
{
  "command_id": "58c90ac4-98de-4260-b774-cf3c457c5681"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ed558577-49f5-40d4-9714-7ba7dcc36c37/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "88f5bf93-b338-449a-a6c4-4c1d0def9da2"
}
```

`POST /api/driver/v1/orders/e02a6857-e5d4-49e6-ba78-7ab04ebb1271/claim` → **404**

```json
{
  "command_id": "3e83cc68-150c-4354-ae8c-85b927c22046"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e02a6857-e5d4-49e6-ba78-7ab04ebb1271/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f420e5e8-ffb6-4222-a80d-8c0f45a90362"
}
```

`POST /api/driver/v1/orders/38d45508-9583-4b77-af28-e3262a18527c/claim` → **404**

```json
{
  "command_id": "c056d87d-951d-4a21-8ed5-bacd5e51bc07"
}
```

```json
{
  "instance": "/api/driver/v1/orders/38d45508-9583-4b77-af28-e3262a18527c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "775b5b5a-f763-4440-848e-387da6092094"
}
```

`POST /api/driver/v1/orders/0a4766ae-0026-4e96-88b6-d6fdca142bd3/claim` → **404**

```json
{
  "command_id": "006a4d47-4cb3-4124-831b-8cf6d52d2b71"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0a4766ae-0026-4e96-88b6-d6fdca142bd3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7b86b928-f40f-4899-bbc7-8a65cd496355"
}
```

`POST /api/driver/v1/orders/c52588bb-b48b-4f58-a77a-594189ed3af8/claim` → **404**

```json
{
  "command_id": "71957502-0a8a-4709-a41e-eb6d1e6d03ac"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c52588bb-b48b-4f58-a77a-594189ed3af8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "019979b3-9857-44c2-afd1-46e9aca8e9df"
}
```

`POST /api/driver/v1/orders/3851afa5-b002-4fc0-ad3c-61e1cf2209e3/claim` → **404**

```json
{
  "command_id": "853a87a4-32ff-4ad2-8b9f-4f70aff7589e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3851afa5-b002-4fc0-ad3c-61e1cf2209e3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b0930fed-1604-4515-8d08-f3ab8b9ab9ed"
}
```

`POST /api/driver/v1/orders/ef4d3eec-e5b0-4d0c-9f58-1563eb659734/claim` → **404**

```json
{
  "command_id": "4f0d403c-467e-4426-8804-f496b19c8692"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ef4d3eec-e5b0-4d0c-9f58-1563eb659734/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a35b2842-7dcb-4d16-ab04-297e24a0a914"
}
```

`POST /api/driver/v1/orders/268138f3-9ea4-4dc8-b4b8-cf2c4c370bbf/claim` → **404**

```json
{
  "command_id": "ea3ebb5c-e2f9-4ca5-a8d0-df7cd70ce9b6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/268138f3-9ea4-4dc8-b4b8-cf2c4c370bbf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "25e6462a-f6e2-4d08-964f-dd81b101477e"
}
```

`POST /api/driver/v1/orders/bd5356a9-88f9-4a6c-b3dd-926d9fe7cbcc/claim` → **404**

```json
{
  "command_id": "e674cad7-8832-4ace-8195-fe6967bf1a72"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bd5356a9-88f9-4a6c-b3dd-926d9fe7cbcc/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "47eb5c14-aa46-4b4a-8297-9c726f8ec3b5"
}
```

`POST /api/driver/v1/orders/e24c4b73-12e7-46ae-bedf-49144a9cba7b/claim` → **404**

```json
{
  "command_id": "5ad66329-dc7a-40d9-9f6f-413dc9cc1652"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e24c4b73-12e7-46ae-bedf-49144a9cba7b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "af303499-1741-4cb0-8389-4c2af023da9f"
}
```

`POST /api/driver/v1/orders/a094dd6c-c8c7-4a80-a640-948aa5713c45/claim` → **404**

```json
{
  "command_id": "4d1b6ff1-c57f-461f-941b-ffa6f1074229"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a094dd6c-c8c7-4a80-a640-948aa5713c45/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04ea0826-88e9-448b-a652-51f38e97705a"
}
```

`POST /api/driver/v1/orders/f519c8b3-8c05-4440-9383-bfd7c38288ee/claim` → **404**

```json
{
  "command_id": "8e2b8e26-8462-404f-9718-793a1e923d49"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f519c8b3-8c05-4440-9383-bfd7c38288ee/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "897d0865-6497-405e-b03e-bed64e1725c3"
}
```

`POST /api/driver/v1/orders/8c8b261a-000e-431c-80a5-58ad6c511fb4/claim` → **429**

```json
{
  "command_id": "907e8949-7c70-445d-937b-d8d0671baa72"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8c8b261a-000e-431c-80a5-58ad6c511fb4/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "ef9cbb57-d762-481c-af89-80e2fed97b58",
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
  "command_id": "7ef094f5-d6d1-4086-8059-c35c8b5e626e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:16Z",
    "sequence": 1793366656461
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "5058eb42-0616-4e70-acd5-5c8232f40a5b",
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
  "last_heartbeat_at": "2026-10-30T13:24:16.481898Z",
  "last_location_at": "2026-10-30T13:24:16.481898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "3e853483-0d23-405f-acda-699848805974",
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

`POST /api/driver/v1/orders/3e853483-0d23-405f-acda-699848805974/claim` → **409**

```json
{
  "command_id": "2ac6200d-6d92-41f7-b983-c041c22e83a6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3e853483-0d23-405f-acda-699848805974/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b6010c75-55b8-4ce9-b190-83d48a6751e5"
}
```

`POST /api/driver/v1/orders/3e853483-0d23-405f-acda-699848805974/claim` → **200**

```json
{
  "command_id": "a04cca30-1926-4020-af79-b31a32b1c5ca"
}
```

```json
{
  "id": "edb92c72-7caa-4f10-8b94-d1969dece963",
  "order_id": "3e853483-0d23-405f-acda-699848805974",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "456031b6-3660-4183-9d10-da310d18b399",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "456031b6-3660-4183-9d10-da310d18b399",
  "order_id": "3e853483-0d23-405f-acda-699848805974",
  "assignment_id": "edb92c72-7caa-4f10-8b94-d1969dece963",
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

`POST /api/driver/v1/trips/456031b6-3660-4183-9d10-da310d18b399/cancel` → **200**

```json
{
  "command_id": "0a4b034c-4d83-4441-bbc6-7077df90865c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "456031b6-3660-4183-9d10-da310d18b399",
  "order_id": "3e853483-0d23-405f-acda-699848805974",
  "assignment_id": "edb92c72-7caa-4f10-8b94-d1969dece963",
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

`GET /api/rider/v1/orders/3e853483-0d23-405f-acda-699848805974` → **200**

```json
{
  "id": "3e853483-0d23-405f-acda-699848805974",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "156487f8-5a71-4bf3-9476-43a26921a211",
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
    "id": "edb92c72-7caa-4f10-8b94-d1969dece963",
    "order_id": "3e853483-0d23-405f-acda-699848805974",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "456031b6-3660-4183-9d10-da310d18b399",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:24:05.028925Z",
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
  "session_id": "edf52ab8-9f64-4d37-acc9-06e90cf3e6e3",
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
  "last_heartbeat_at": "2026-10-30T13:24:03.762111Z",
  "last_location_at": "2026-10-30T13:24:03.762111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edf52ab8-9f64-4d37-acc9-06e90cf3e6e3/close` → **200**

```json
{
  "command_id": "ebe33365-4a4d-4e6e-82db-a6f420cff76a",
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
  "session_id": "5058eb42-0616-4e70-acd5-5c8232f40a5b",
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
  "last_heartbeat_at": "2026-10-30T13:24:16.481898Z",
  "last_location_at": "2026-10-30T13:24:16.481898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5058eb42-0616-4e70-acd5-5c8232f40a5b/close` → **200**

```json
{
  "command_id": "600db0bc-4694-4d0b-8306-2c8c7487f32d",
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
  "session_id": "031ff40e-5412-4244-8856-d4cf08b550c9",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NjAsImlhdCI6MTc5MzM2NjY2MCwianRpIjoiYzdhYmE2MTItYTAzOC00MzMxLTkyNDMtZmY1MDg5OWNkZmRmIiwic2lkIjoiMDMxZmY0MGUtNTQxMi00MjQ0LTg4NTYtZDRjZjA4YjU1MGM5In0.vE63bASfhw-V4nDVbGMmYyKyAvSHwLhC3vQnVKR7n6I",
  "access_expires_at": "2026-10-30T13:39:20.200068708Z",
  "refresh_token": "1l8uS_GUeQsygJ4hfxnWaXewB47Nmn-n7UK5E8VNtaY",
  "refresh_expires_at": "2026-10-31T01:24:20.199470396Z",
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
  "command_id": "21b13f53-78fc-4c17-b741-c0e59f12f5f4",
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
  "session_id": "20447403-1350-4fed-a4b6-44974a1a2b09",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NjEsImlhdCI6MTc5MzM2NjY2MSwianRpIjoiOTNjZjhkMTItZGRhOC00Mjk2LTk4ZTktOWJiNmIyNjliNzFkIiwic2lkIjoiMjA0NDc0MDMtMTM1MC00ZmVkLWE0YjYtNDQ5NzRhMWEyYjA5In0.bQ_yTDwQv2nfrrd2cJZXBsafZ1sfn2lu-zpkSDHKlkM",
  "access_expires_at": "2026-10-30T13:39:21.395285649Z",
  "refresh_token": "LBWS8YSWZ0TsFhuTpt2UB81caXvlsPXoWtxCfIv4wRE",
  "refresh_expires_at": "2026-10-31T01:24:21.394645328Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.77419959",
    "linkedid": "1730052700.77419959",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679343075"
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
    "id": "1730052700.77419959",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "2c1a6f6d-c346-4442-b521-db6a53ecbf9e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679343075",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:24:21.688687Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:24:21.713661Z",
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
    "id": "1730052600.275833282",
    "linkedid": "1730052600.275833282",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679343075"
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
      "id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679343075",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:24:22.066007Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/650cb52a-6336-4a08-b77d-ebcbb226190a/answer` → **200**

```json
{
  "command_id": "4545b2dc-3794-4ef2-b8df-2cf6305fbb1f"
}
```

```json
{
  "id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679343075",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "order_ids": [],
  "started_at": "2026-10-30T13:24:22.066007Z",
  "answered_at": "2026-10-30T13:24:22.407951Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.275833282",
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
    "id": "1730052600.275833282",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679343075",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:22.066007Z",
      "answered_at": "2026-10-30T13:24:22.407951Z",
      "ended_at": "2026-10-30T13:24:22.73765Z",
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
      "id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679343075",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:22.066007Z",
      "answered_at": "2026-10-30T13:24:22.407951Z",
      "ended_at": "2026-10-30T13:24:22.73765Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:24:24.276458Z"
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
      "id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679343075",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:22.066007Z",
      "answered_at": "2026-10-30T13:24:22.407951Z",
      "ended_at": "2026-10-30T13:24:22.73765Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:24:24.276458Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/650cb52a-6336-4a08-b77d-ebcbb226190a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/650cb52a-6336-4a08-b77d-ebcbb226190a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=650cb52a-6336-4a08-b77d-ebcbb226190a` → **200**

```json
{
  "changes": [
    {
      "id": "02ee5755-6ff6-41df-b1fe-b1cb9db68e58",
      "occurred_at": "2026-10-30T13:24:25.712726Z",
      "actor_type": "STAFF",
      "actor_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"366c6ee5-568f-4522-ae5e-ac4e29375069\", \"order_ids\": []}",
      "correlation_id": "d53b9f3a-9d7f-4715-a85b-1cf0673602e6"
    },
    {
      "id": "1cf6f4e4-335a-452a-b9fc-1661fcd508a6",
      "occurred_at": "2026-10-30T13:24:25.679901Z",
      "actor_type": "STAFF",
      "actor_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"366c6ee5-568f-4522-ae5e-ac4e29375069\", \"order_ids\": []}",
      "correlation_id": "6b30b42d-139d-432e-a5ff-9c6f59a5f6e7"
    }
  ]
}
```

Done: call 650cb52a-6336-4a08-b77d-ebcbb226190a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21987"
}
```

```json
{
  "challenge_id": "a575d554-ee63-47d4-bdb4-001ba150ad6a",
  "expires_at": "2026-10-30T13:29:26.055850781Z",
  "resend_available_at": "2026-10-30T13:24:27.055850781Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "221833",
  "sent_at": "2026-10-30T13:24:26.061514371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a575d554-ee63-47d4-bdb4-001ba150ad6a",
  "code": "221833",
  "device_ref": "sandbox-21987"
}
```

```json
{
  "session_id": "25a180dd-afd8-46d1-9597-d853aa7dbd31",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU2NiwiaWF0IjoxNzkzMzY2NjY2LCJqdGkiOiJmMzI4NTY5OS0yNDc4LTRiNzMtOWY5Mi1lOTk5NjM5ZTY2NmQiLCJzaWQiOiIyNWExODBkZC1hZmQ4LTQ2ZDEtOTU5Ny1kODUzYWE3ZGJkMzEifQ.zaY0GVJBWge7MiMmsP8GYlGTr5WMqJsEP7OxNzAw-qg",
  "access_expires_at": "2026-10-30T13:39:26.378603099Z",
  "refresh_token": "g4QkT68fjUiCKIxzM0ZQ1c3KqxxJ_2LN2Gi_gjQwY8Y",
  "refresh_expires_at": "2026-11-29T13:24:26.377955382Z",
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
  "command_id": "06e31b11-aa59-47bd-a880-cd5cfc5e61af",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:26Z",
    "sequence": 1793366666973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3770b8ca-2d42-45db-9b22-395cc8a5cbc1",
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
  "last_heartbeat_at": "2026-10-30T13:24:26.993318Z",
  "last_location_at": "2026-10-30T13:24:26.993318Z",
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
  "session_id": "155d7439-b53f-4b3a-8e60-567aa8dff880",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NjcsImlhdCI6MTc5MzM2NjY2NywianRpIjoiZDg2MGUyNDAtMDViNS00ZWNjLWIyODktODY0MzI5ZGZiNmIzIiwic2lkIjoiMTU1ZDc0MzktYjUzZi00YjNhLThlNjAtNTY3YWE4ZGZmODgwIn0.ySG1EW8wqV-55uMonWYCFlD-EV1FM9VTe44TmBOgRuw",
  "access_expires_at": "2026-10-30T13:39:27.590913715Z",
  "refresh_token": "YjLBk5OdpTUOiDmBdDkVLFod-WP6KKv5pH7mSRiXsG4",
  "refresh_expires_at": "2026-10-31T01:24:27.590352752Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "310d9b3e-7b42-4de3-8c8d-3c331d7267c7",
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
  "id": "fef04a73-fb3e-4152-a15e-40ac1c04dc30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:27.888449Z",
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
  "command_id": "37c48434-1de0-4ca4-9334-b8630968b6fc",
  "quote_id": "fef04a73-fb3e-4152-a15e-40ac1c04dc30",
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
    "phone": "+380678485613"
  }
}
```

```json
{
  "id": "c57e355b-7331-4f36-b38c-216003597a60",
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
  "created_at": "2026-10-30T13:24:28.216803Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678485613"
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
    "id": "7fc0e4cb-7c22-4aae-a00f-2f0870f8e873",
    "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
    "expires_at": "2026-10-30T13:24:43.221295Z",
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

`POST /api/driver/v1/offers/7fc0e4cb-7c22-4aae-a00f-2f0870f8e873/accept` → **200**

```json
{
  "command_id": "003a4221-ce10-48ab-add3-bcac04c389bf"
}
```

```json
{
  "id": "64159449-2ff4-4750-90fe-f5e1307d8afb",
  "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "820f74c8-d411-4940-be4a-1ef8e3aa4cbe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "820f74c8-d411-4940-be4a-1ef8e3aa4cbe",
  "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
  "assignment_id": "64159449-2ff4-4750-90fe-f5e1307d8afb",
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
    "phone": "+380678485613"
  }
}
```

`POST /api/driver/v1/work-sessions/3770b8ca-2d42-45db-9b22-395cc8a5cbc1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:30Z",
    "sequence": 1793366670586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3770b8ca-2d42-45db-9b22-395cc8a5cbc1",
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
  "last_heartbeat_at": "2026-10-30T13:24:30.6055Z",
  "last_location_at": "2026-10-30T13:24:30.6055Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/820f74c8-d411-4940-be4a-1ef8e3aa4cbe/arrive` → **200**

```json
{
  "command_id": "7b74e87a-9557-4edc-bacf-c68409ddc0fd",
  "expected_version": 0
}
```

```json
{
  "id": "820f74c8-d411-4940-be4a-1ef8e3aa4cbe",
  "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
  "assignment_id": "64159449-2ff4-4750-90fe-f5e1307d8afb",
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
  "arrived_at": "2026-10-30T13:24:30.905909Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678485613"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  },
  {
    "phone": "+380678485613",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:31.934661201Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  },
  {
    "phone": "+380678485613",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:31.934661201Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678485613` → **200**

```json
[
  {
    "phone": "+380678485613",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:29.925894857Z"
  },
  {
    "phone": "+380678485613",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:31.934661201Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/820f74c8-d411-4940-be4a-1ef8e3aa4cbe/start` → **200**

```json
{
  "command_id": "4860e7ce-21e8-4fa2-97cb-7356ff59a978",
  "expected_version": 1
}
```

```json
{
  "id": "820f74c8-d411-4940-be4a-1ef8e3aa4cbe",
  "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
  "assignment_id": "64159449-2ff4-4750-90fe-f5e1307d8afb",
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
  "arrived_at": "2026-10-30T13:24:30.905909Z",
  "started_at": "2026-10-30T13:24:32.328878Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678485613"
  }
}
```

`POST /api/driver/v1/trips/820f74c8-d411-4940-be4a-1ef8e3aa4cbe/complete` → **200**

```json
{
  "command_id": "cfc35b8c-271a-4e76-b958-f013055dc833",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:24:32Z",
  "cash_received": true
}
```

```json
{
  "id": "820f74c8-d411-4940-be4a-1ef8e3aa4cbe",
  "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
  "assignment_id": "64159449-2ff4-4750-90fe-f5e1307d8afb",
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
  "arrived_at": "2026-10-30T13:24:30.905909Z",
  "started_at": "2026-10-30T13:24:32.328878Z",
  "completed_at": "2026-10-30T13:24:32.648598Z",
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
  "session_id": "3770b8ca-2d42-45db-9b22-395cc8a5cbc1",
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
  "last_heartbeat_at": "2026-10-30T13:24:30.6055Z",
  "last_location_at": "2026-10-30T13:24:30.6055Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3770b8ca-2d42-45db-9b22-395cc8a5cbc1/close` → **200**

```json
{
  "command_id": "be5ae0d2-18a3-43ac-a09f-c73cb84b6f67",
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
  "phone": "+380637988315",
  "device_ref": "sandbox-1656"
}
```

```json
{
  "challenge_id": "cee30d58-8c0c-4756-887d-0b1cfdcb3be6",
  "expires_at": "2026-10-30T13:29:33.570522743Z",
  "resend_available_at": "2026-10-30T13:24:34.570522743Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637988315` → **200**

```json
{
  "phone": "+380637988315",
  "audience": "CLIENT",
  "code": "280393",
  "sent_at": "2026-10-30T13:24:33.573538079Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cee30d58-8c0c-4756-887d-0b1cfdcb3be6",
  "code": "280393",
  "device_ref": "sandbox-1656"
}
```

```json
{
  "session_id": "3b44b3dc-4415-48c4-9137-121d79786953",
  "subject": {
    "type": "CLIENT",
    "id": "4ff1eed9-2d20-4f53-933f-8ffef728762a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZmYxZWVkOS0yZDIwLTRmNTMtOTMzZi04ZmZlZjcyODc2MmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTczLCJpYXQiOjE3OTMzNjY2NzMsImp0aSI6IjNlYjEyOWQyLTViOGEtNGFhZS05ZGI0LThlNzlhZWZkMDNiMyIsInNpZCI6IjNiNDRiM2RjLTQ0MTUtNDhjNC05MTM3LTEyMWQ3OTc4Njk1MyJ9.bJDtCaS2la17blagBJPBFrbJqNN5AcUOVw-0aEI5Yvc",
  "access_expires_at": "2026-10-30T13:39:33.895049753Z",
  "refresh_token": "Vv9huSOHhRd8EgvHWv426FTKTKha2mI4fZMq8VrBGKk",
  "refresh_expires_at": "2026-11-29T13:24:33.894181919Z",
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
  "device_ref": "sandbox-13460"
}
```

```json
{
  "challenge_id": "4fd07e45-8d2e-4d1a-86a9-e48b1cf1e800",
  "expires_at": "2026-10-30T13:29:34.504199723Z",
  "resend_available_at": "2026-10-30T13:24:35.504199723Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "333479",
  "sent_at": "2026-10-30T13:24:34.506990616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fd07e45-8d2e-4d1a-86a9-e48b1cf1e800",
  "code": "333479",
  "device_ref": "sandbox-13460"
}
```

```json
{
  "session_id": "fd2de16c-209b-4862-9cb7-f465a2478682",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU3NCwiaWF0IjoxNzkzMzY2Njc0LCJqdGkiOiJmMTJjN2IwZC1jYmU5LTRjZWUtYTNhYy00ZmM3MTg1ZTNhMzkiLCJzaWQiOiJmZDJkZTE2Yy0yMDliLTQ4NjItOWNiNy1mNDY1YTI0Nzg2ODIifQ.PRZKdq7ns2pnc2w0pX2yxMSOfPxLsbL7yd1mC3Lw0xE",
  "access_expires_at": "2026-10-30T13:39:34.82630252Z",
  "refresh_token": "SWZy-tfXgiIUVvAwFRxL91kbhJlFOEVOnD5FUSnzpSw",
  "refresh_expires_at": "2026-11-29T13:24:34.825586067Z",
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
  "session_id": "4d30810c-077d-428c-8b27-6c42e6eb83b5",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NzUsImlhdCI6MTc5MzM2NjY3NSwianRpIjoiYjE5NDFkMjAtNzFkMy00Y2RmLWE2MjctY2VlNzY2Mjc0MDMzIiwic2lkIjoiNGQzMDgxMGMtMDc3ZC00MjhjLThiMjctNmM0MmU2ZWI4M2I1In0.w-rItPL-NYkbt9OoofKA52u50JyCXyj5Uc0bVSm9OpY",
  "access_expires_at": "2026-10-30T13:39:35.702198664Z",
  "refresh_token": "i94nfne0MRc2h3OpRxS23AnFX57bCtJCqU_39fpxXJE",
  "refresh_expires_at": "2026-10-31T01:24:35.700776108Z",
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
  "session_id": "4192d227-29db-4520-b92e-d8e0ce187c8c",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NzYsImlhdCI6MTc5MzM2NjY3NiwianRpIjoiODdmOTY2YmYtMGI0Ny00YmM1LWJhODYtYjFhMjU3YmRhYWJmIiwic2lkIjoiNDE5MmQyMjctMjlkYi00NTIwLWI5MmUtZDhlMGNlMTg3YzhjIn0.pZDY6SPrjiibfmBpFMIRvjT4XHm2-ULWyKVWgmmEMUc",
  "access_expires_at": "2026-10-30T13:39:36.287641659Z",
  "refresh_token": "XGUmMBwDEf_4iaHFtCc4VisN7JbxSfCaEZYwI0L8-iA",
  "refresh_expires_at": "2026-10-31T01:24:36.2870512Z",
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
  "command_id": "a49bf4e2-fb1c-4136-8e07-bb39dc699292",
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
  "id": "4439723c-3bb8-4404-8cc6-f4fdfb87206e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:36.861380Z",
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
  "command_id": "b503a418-160d-449e-b46a-e294551cc9bc",
  "quote_id": "4439723c-3bb8-4404-8cc6-f4fdfb87206e",
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
  "id": "5d1be3c0-c903-4713-97ce-dfb64de31b58",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ff1eed9-2d20-4f53-933f-8ffef728762a",
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
  "created_at": "2026-10-30T13:24:37.176958Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5d1be3c0-c903-4713-97ce-dfb64de31b58` → **200**

```json
{
  "id": "5d1be3c0-c903-4713-97ce-dfb64de31b58",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ff1eed9-2d20-4f53-933f-8ffef728762a",
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
  "created_at": "2026-10-30T13:24:37.176958Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5d1be3c0-c903-4713-97ce-dfb64de31b58/cancel` → **200**

```json
{
  "command_id": "ae20d0fe-4860-4560-9634-f08dc5a56c67",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "5d1be3c0-c903-4713-97ce-dfb64de31b58",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4ff1eed9-2d20-4f53-933f-8ffef728762a",
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
  "created_at": "2026-10-30T13:24:37.176958Z",
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
  "command_id": "54da2c01-4c32-4cd8-a9d4-8efac325a8e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:38Z",
    "sequence": 1793366678451
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fe44097-ac94-4da9-9816-8a06f940f7f9",
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
  "last_heartbeat_at": "2026-10-30T13:24:38.471569Z",
  "last_location_at": "2026-10-30T13:24:38.471569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22267"
}
```

```json
{
  "challenge_id": "df0ee340-ddc5-417f-82fb-22abd08d266e",
  "expires_at": "2026-10-30T13:29:38.771786663Z",
  "resend_available_at": "2026-10-30T13:24:39.771786663Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "871212",
  "sent_at": "2026-10-30T13:24:38.774928816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df0ee340-ddc5-417f-82fb-22abd08d266e",
  "code": "871212",
  "device_ref": "sandbox-22267"
}
```

```json
{
  "session_id": "b8489097-120c-42f4-a4a9-a5c77977e8c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU3OSwiaWF0IjoxNzkzMzY2Njc5LCJqdGkiOiI5MDAxZmMzZS1lNGEzLTRkNWYtODMzZi1kMGFmMzZkM2UyNGQiLCJzaWQiOiJiODQ4OTA5Ny0xMjBjLTQyZjQtYTRhOS1hNWM3Nzk3N2U4YzIifQ.klx19ZeNokuqY0T1x-JDNXGAR0dgOBeXglE9YWR6xUM",
  "access_expires_at": "2026-10-30T13:39:39.125842094Z",
  "refresh_token": "6YRIwZJFoj0JQNevCNpbd32G1nCTVIC0QivUc4lc4dY",
  "refresh_expires_at": "2026-11-29T13:24:39.125271452Z",
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
  "command_id": "6d4ac15b-16a9-4829-bcc2-39ab7e558fba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:39Z",
    "sequence": 1793366679715
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:24:39.736716Z",
  "last_location_at": "2026-10-30T13:24:39.736716Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6fb6ca65-853d-4c79-b42c-ca6f6b371a60",
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
  "id": "4964634d-6f89-414f-b1e9-f2f2acf0ad33",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:40.054731Z",
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
  "command_id": "be03d828-f301-4553-b346-240755dceded",
  "quote_id": "4964634d-6f89-414f-b1e9-f2f2acf0ad33",
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
  "id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ff1eed9-2d20-4f53-933f-8ffef728762a",
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
  "created_at": "2026-10-30T13:24:40.376511Z",
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
    "id": "42bd6f5a-089d-44d4-9a30-47990a1edded",
    "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
    "expires_at": "2026-10-30T13:24:55.382206Z",
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

`POST /api/driver/v1/offers/42bd6f5a-089d-44d4-9a30-47990a1edded/accept` → **200**

```json
{
  "command_id": "495e050a-ca38-4a2a-bb65-c3ae76ee583d"
}
```

```json
{
  "id": "83c74e34-09ad-443c-937f-912b44aa7764",
  "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "35932dde-1d2b-4e94-8171-9eeeee8ccd6f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "35932dde-1d2b-4e94-8171-9eeeee8ccd6f",
  "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "assignment_id": "83c74e34-09ad-443c-937f-912b44aa7764",
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

`POST /api/driver/v1/trips/35932dde-1d2b-4e94-8171-9eeeee8ccd6f/cancel` → **200**

```json
{
  "command_id": "84c8094a-e8f7-446a-86a4-7e692143fd5b",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "35932dde-1d2b-4e94-8171-9eeeee8ccd6f",
  "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "assignment_id": "83c74e34-09ad-443c-937f-912b44aa7764",
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

`GET /api/rider/v1/orders/741743d1-c859-4360-a0a8-276349e8abe8` → **200**

```json
{
  "id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4ff1eed9-2d20-4f53-933f-8ffef728762a",
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
    "id": "83c74e34-09ad-443c-937f-912b44aa7764",
    "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "35932dde-1d2b-4e94-8171-9eeeee8ccd6f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:24:40.376511Z",
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
    "id": "99aa2c14-f6ef-4fba-9c39-dcb3464420ec",
    "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
    "expires_at": "2026-10-30T13:24:56.645042Z",
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

`POST /api/driver/v1/offers/99aa2c14-f6ef-4fba-9c39-dcb3464420ec/accept` → **200**

```json
{
  "command_id": "ab829a33-cbe0-4297-8585-28b63286138b"
}
```

```json
{
  "id": "0ae68798-c97c-423f-aed2-de4fb3dc42cc",
  "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fcaf171e-7d33-4d08-8837-8ce68f00709d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fcaf171e-7d33-4d08-8837-8ce68f00709d",
  "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "assignment_id": "0ae68798-c97c-423f-aed2-de4fb3dc42cc",
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

`POST /api/driver/v1/trips/fcaf171e-7d33-4d08-8837-8ce68f00709d/cancel` → **200**

```json
{
  "command_id": "30053093-2add-49d1-8a6e-a30be4b4b026",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "fcaf171e-7d33-4d08-8837-8ce68f00709d",
  "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
  "assignment_id": "0ae68798-c97c-423f-aed2-de4fb3dc42cc",
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
    "id": "741743d1-c859-4360-a0a8-276349e8abe8",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:24:40.376511Z",
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
    "id": "5d1be3c0-c903-4713-97ce-dfb64de31b58",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:24:37.176958Z",
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

`GET /api/operator/v1/orders/741743d1-c859-4360-a0a8-276349e8abe8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:24:40.377554Z",
      "actor": {
        "type": "CLIENT",
        "id": "4ff1eed9-2d20-4f53-933f-8ffef728762a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
        "quote_id": "4964634d-6f89-414f-b1e9-f2f2acf0ad33",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "42faafc4-80ec-4b41-8354-38aa5da73107"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:24:40.38089Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
        "attempt_id": "5e32a6cd-27a8-4485-a64e-9980d3d9de85",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "42faafc4-80ec-4b41-8354-38aa5da73107"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:24:40.399811Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "42bd6f5a-089d-44d4-9a30-47990a1edded",
        "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "42faafc4-80ec-4b41-8354-38aa5da73107"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:24:41.024805Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "42bd6f5a-089d-44d4-9a30-47990a1edded",
        "order_id": "741743d1-c859-4360-a0a8-276349e8abe8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "83c74e34-09ad-443c-937f-912b44aa7764"
      },
      "correlation_id": "c26ef204-b52f-4121-878d-672895db59bf"
```

Done: orders 5d1be3c0-c903-4713-97ce-dfb64de31b58, 741743d1-c859-4360-a0a8-276349e8abe8.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735268708",
  "device_ref": "sandbox-17056"
}
```

```json
{
  "challenge_id": "cf905a4f-6513-497b-aa7b-063d3db45446",
  "expires_at": "2026-10-30T13:29:44.139060862Z",
  "resend_available_at": "2026-10-30T13:24:45.139060862Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735268708` → **200**

```json
{
  "phone": "+380735268708",
  "audience": "CLIENT",
  "code": "729216",
  "sent_at": "2026-10-30T13:24:44.142050904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf905a4f-6513-497b-aa7b-063d3db45446",
  "code": "729216",
  "device_ref": "sandbox-17056"
}
```

```json
{
  "session_id": "8ba53c43-504a-427d-ac0b-0224cd13fd25",
  "subject": {
    "type": "CLIENT",
    "id": "7779d9a9-d15c-498d-a904-1be59e0d4224"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Nzc5ZDlhOS1kMTVjLTQ5OGQtYTkwNC0xYmU1OWUwZDQyMjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTg0LCJpYXQiOjE3OTMzNjY2ODQsImp0aSI6IjEzNzcyYTBmLTE0NmUtNGFkMy1iM2FhLWNiNWI3MmM5ODBlOSIsInNpZCI6IjhiYTUzYzQzLTUwNGEtNDI3ZC1hYzBiLTAyMjRjZDEzZmQyNSJ9.WLL_RVOCPAVPYrB4tbqAnP70Jf1oh6tCYJRALYV9uo0",
  "access_expires_at": "2026-10-30T13:39:44.468331929Z",
  "refresh_token": "hMiMl7PoGFiChWjKOjenckPkaMd1UUoRy0F4Aq_obAY",
  "refresh_expires_at": "2026-11-29T13:24:44.467627339Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6cd18bb4-f889-48a5-bd39-4592eb96f83b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d035e886-7a23-4568-bfdb-296515474153",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d035e886-7a23-4568-bfdb-296515474153",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "708a1245d465173d34175a39b785831e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d035e886-7a23-4568-bfdb-296515474153",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735268708"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d035e886-7a23-4568-bfdb-296515474153",
  "expires_at": "2026-10-30T13:54:44.76705Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d035e886-7a23-4568-bfdb-296515474153` → **200**

```json
{
  "id": "d035e886-7a23-4568-bfdb-296515474153",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:54:44.76705Z",
  "card": {
    "id": "f7ec5c33-f11d-4c0c-b126-9dc7211f705d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1834",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:24:45.079533Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "f7ec5c33-f11d-4c0c-b126-9dc7211f705d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1834",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:24:45.079533Z"
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
  "device_ref": "sandbox-26217"
}
```

```json
{
  "challenge_id": "590cfa85-5d29-45cd-a436-a95d158f1d10",
  "expires_at": "2026-10-30T13:29:45.680111362Z",
  "resend_available_at": "2026-10-30T13:24:46.680111362Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "485727",
  "sent_at": "2026-10-30T13:24:45.683358998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "590cfa85-5d29-45cd-a436-a95d158f1d10",
  "code": "485727",
  "device_ref": "sandbox-26217"
}
```

```json
{
  "session_id": "495d2af6-e870-4975-9861-5133c73e049b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU4NiwiaWF0IjoxNzkzMzY2Njg2LCJqdGkiOiJlY2RjMDMwZC04MDcyLTQxZjAtYTkyNC1mMzVmZmZiNjg4Y2UiLCJzaWQiOiI0OTVkMmFmNi1lODcwLTQ5NzUtOTg2MS01MTMzYzczZTA0OWIifQ.A6w6hHzStGqn6DKNfXAe0F7JZ0bV2pUAY8B7DJPl_eU",
  "access_expires_at": "2026-10-30T13:39:46.004854171Z",
  "refresh_token": "Cx98yoyeGTTHMAJ2rY4-_NKjSZkpNjjVI76okgxgIAg",
  "refresh_expires_at": "2026-11-29T13:24:46.004191368Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:24:39.736716Z",
  "last_location_at": "2026-10-30T13:24:39.736716Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bb71be13-5013-4bcf-952a-0d5933dccb69/handover` → **200**

```json
{
  "command_id": "7b5d5482-00e8-4bb6-af84-197b9774fa2e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:24:39.736716Z",
  "last_location_at": "2026-10-30T13:24:39.736716Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/bb71be13-5013-4bcf-952a-0d5933dccb69/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:28Z",
    "sequence": 1793366728917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:25:28.936731Z",
  "last_location_at": "2026-10-30T13:25:28.936731Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f34f62b-94bc-4444-9bd1-f716708352ff",
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
  "id": "87493988-da4c-48d5-b782-9c4c171b53f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:29.250497Z",
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
  "command_id": "e1536225-3303-412a-a521-8dd9d3cf245a",
  "quote_id": "87493988-da4c-48d5-b782-9c4c171b53f2",
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
  "id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
  "created_at": "2026-10-30T13:25:29.565726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6` → **200**

```json
{
  "id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
  "created_at": "2026-10-30T13:25:29.565726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6` → **200**

```json
{
  "id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
  "created_at": "2026-10-30T13:25:29.565726Z",
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
    "id": "24c86734-a5bc-4c24-9960-72cb40d4931a",
    "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
    "expires_at": "2026-10-30T13:25:45.313108Z",
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

`POST /api/driver/v1/offers/24c86734-a5bc-4c24-9960-72cb40d4931a/accept` → **200**

```json
{
  "command_id": "fe12f165-17d4-4262-8028-87715c8cd824"
}
```

```json
{
  "id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "assignment_id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
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

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/bb71be13-5013-4bcf-952a-0d5933dccb69/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:37Z",
    "sequence": 1793366737420
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:25:37.440428Z",
  "last_location_at": "2026-10-30T13:25:37.440428Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a77df3e4-8dc8-464f-a18c-167532a9d841/arrive` → **200**

```json
{
  "command_id": "88162c94-2a57-4f57-b542-fa4ef59e64ad",
  "expected_version": 0
}
```

```json
{
  "id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "assignment_id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
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
  "arrived_at": "2026-10-30T13:25:37.741999Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a77df3e4-8dc8-464f-a18c-167532a9d841/start` → **200**

```json
{
  "command_id": "7d28e739-56ec-434f-bcb1-39be17f72530",
  "expected_version": 1
}
```

```json
{
  "id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "assignment_id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
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
  "arrived_at": "2026-10-30T13:25:37.741999Z",
  "started_at": "2026-10-30T13:25:38.053668Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a77df3e4-8dc8-464f-a18c-167532a9d841/complete` → **200**

```json
{
  "command_id": "06d163cf-cec4-4e5f-9fef-426410dca8bd",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:25:38Z",
  "cash_received": true
}
```

```json
{
  "id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "assignment_id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
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
  "arrived_at": "2026-10-30T13:25:37.741999Z",
  "started_at": "2026-10-30T13:25:38.053668Z",
  "completed_at": "2026-10-30T13:25:38.367018Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6` → **200**

```json
{
  "id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
    "id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
    "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:25:29.565726Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6` → **200**

```json
{
  "id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
    "id": "421419fb-1f07-4b40-8b8b-da44095de6d5",
    "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a77df3e4-8dc8-464f-a18c-167532a9d841",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:25:29.565726Z",
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

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6/tip` → **200**

```json
{
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
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
  "available_until": "2026-10-31T13:25:38.367018Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6/tip` → **201**

```json
{
  "command_id": "d19bbe7c-ec03-4c8b-a2c5-0cd98a9b4170",
  "amount_minor": 2500
}
```

```json
{
  "id": "dce1c958-9f0b-4c2e-a857-a0d04be30705",
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:25:40.920783Z"
}
```

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6/tip` → **200**

```json
{
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
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
  "available_until": "2026-10-31T13:25:38.367018Z",
  "open": false,
  "tip": {
    "id": "dce1c958-9f0b-4c2e-a857-a0d04be30705",
    "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:40.920783Z"
  }
}
```

`GET /api/rider/v1/orders/e1c09123-956d-448b-85cc-f054875a8bb6/tip` → **200**

```json
{
  "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
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
  "available_until": "2026-10-31T13:25:38.367018Z",
  "open": false,
  "tip": {
    "id": "dce1c958-9f0b-4c2e-a857-a0d04be30705",
    "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:40.920783Z"
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
      "id": "8270e4f4-0c42-498c-8e12-6e4702f8c9b5",
      "at": "2026-10-30T13:25:42.47736Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
      "counterpart_id": null
    },
    {
      "id": "5d3d230f-447a-4498-90f9-a23553b8e26e",
      "at": "2026-10-30T13:25:38.41006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3b271f7-c84e-4715-a083-16190158de20",
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
  "id": "2f71e886-e75b-4f1c-b2f8-1e8516c22313",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:43.171857Z",
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
  "session_id": "47bf64bf-67fd-49cb-8b5b-c8576502e6ce",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc2NDMsImlhdCI6MTc5MzM2Njc0MywianRpIjoiZDAyYjU5ZDktODdlNC00YjU5LThlYjktOTk4NmRhY2YzMjcyIiwic2lkIjoiNDdiZjY0YmYtNjdmZC00OWNiLThiNWItYzg1NzY1MDJlNmNlIn0._f1Yna0ow2ajTSI3hPvYMI8jCaPLmybVQHV3B2Poy2I",
  "access_expires_at": "2026-10-30T13:40:43.780922601Z",
  "refresh_token": "ytWYMPsB2UjWr8XiW84IvnJV9yH7eQ6-tTR0gWasyy4",
  "refresh_expires_at": "2026-10-31T01:25:43.780210998Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735268708` → **200**

```json
{
  "client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224"
}
```

`POST /api/admin/v1/rider-wallets/7779d9a9-d15c-498d-a904-1be59e0d4224/top-ups` → **201**

```json
{
  "command_id": "7bd1d55d-2adf-451c-995e-69ec59b13b0f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
      "id": "3c0f55b0-06e3-40bd-b37d-930ea6ded76a",
      "at": "2026-10-30T13:25:44.380339Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3be543b0-21ca-47b7-b587-c51b4857a9db",
  "quote_id": "2f71e886-e75b-4f1c-b2f8-1e8516c22313",
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
  "id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
  "created_at": "2026-10-30T13:25:44.704442Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ccafb4d5-98a1-43b8-a265-985ff8c8d8fe` → **200**

```json
{
  "id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
  "created_at": "2026-10-30T13:25:44.704442Z",
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
    "id": "af603e23-7ab4-4159-ac23-7e296c023b0a",
    "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
    "expires_at": "2026-10-30T13:25:59.708864Z",
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

`POST /api/driver/v1/offers/af603e23-7ab4-4159-ac23-7e296c023b0a/accept` → **200**

```json
{
  "command_id": "fe036cea-17f0-41cb-829b-a06433673764"
}
```

```json
{
  "id": "63f85991-5fa5-48d5-a955-b3ab8a498650",
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d117eb2-cb48-41c1-9357-8afc09f45e45",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d117eb2-cb48-41c1-9357-8afc09f45e45",
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "assignment_id": "63f85991-5fa5-48d5-a955-b3ab8a498650",
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

`POST /api/driver/v1/work-sessions/bb71be13-5013-4bcf-952a-0d5933dccb69/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:46Z",
    "sequence": 1793366746271
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:25:46.290905Z",
  "last_location_at": "2026-10-30T13:25:46.290905Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4d117eb2-cb48-41c1-9357-8afc09f45e45/arrive` → **200**

```json
{
  "command_id": "159964b6-c0a0-48b4-a01e-1593fe25dea1",
  "expected_version": 0
}
```

```json
{
  "id": "4d117eb2-cb48-41c1-9357-8afc09f45e45",
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "assignment_id": "63f85991-5fa5-48d5-a955-b3ab8a498650",
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
  "arrived_at": "2026-10-30T13:25:46.595246Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d117eb2-cb48-41c1-9357-8afc09f45e45/start` → **200**

```json
{
  "command_id": "d21dedd9-430c-40fa-b578-951c6dede122",
  "expected_version": 1
}
```

```json
{
  "id": "4d117eb2-cb48-41c1-9357-8afc09f45e45",
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "assignment_id": "63f85991-5fa5-48d5-a955-b3ab8a498650",
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
  "arrived_at": "2026-10-30T13:25:46.595246Z",
  "started_at": "2026-10-30T13:25:46.913845Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d117eb2-cb48-41c1-9357-8afc09f45e45/complete` → **200**

```json
{
  "command_id": "1f2bc7e9-d6d0-4884-b4e0-b65e663b40fc",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:25:47Z",
  "cash_received": true
}
```

```json
{
  "id": "4d117eb2-cb48-41c1-9357-8afc09f45e45",
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "assignment_id": "63f85991-5fa5-48d5-a955-b3ab8a498650",
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
  "arrived_at": "2026-10-30T13:25:46.595246Z",
  "started_at": "2026-10-30T13:25:46.913845Z",
  "completed_at": "2026-10-30T13:25:47.234091Z",
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
  "client_id": "7779d9a9-d15c-498d-a904-1be59e0d4224",
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
      "id": "3c0f55b0-06e3-40bd-b37d-930ea6ded76a",
      "at": "2026-10-30T13:25:44.380339Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
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

`GET /api/rider/v1/orders/ccafb4d5-98a1-43b8-a265-985ff8c8d8fe/tip` → **200**

```json
{
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
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
  "available_until": "2026-10-31T13:25:47.234091Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ccafb4d5-98a1-43b8-a265-985ff8c8d8fe/tip` → **201**

```json
{
  "command_id": "d4a3e500-5ab2-450b-87c8-f666a5c99c24",
  "amount_minor": 2500
}
```

```json
{
  "id": "f401e50d-7fa7-4add-9f97-7ec4bfd8ab0a",
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:25:48.425765Z"
}
```

`GET /api/rider/v1/orders/ccafb4d5-98a1-43b8-a265-985ff8c8d8fe/tip` → **200**

```json
{
  "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
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
  "available_until": "2026-10-31T13:25:47.234091Z",
  "open": false,
  "tip": {
    "id": "f401e50d-7fa7-4add-9f97-7ec4bfd8ab0a",
    "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:48.425765Z"
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
      "id": "e4b4f09e-3b94-4c01-8699-2c018d22903c",
      "at": "2026-10-30T13:25:47.538859Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
      "counterpart_id": null
    },
    {
      "id": "8270e4f4-0c42-498c-8e12-6e4702f8c9b5",
      "at": "2026-10-30T13:25:42.47736Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
      "counterpart_id": null
    },
    {
      "id": "5d3d230f-447a-4498-90f9-a23553b8e26e",
      "at": "2026-10-30T13:25:38.41006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
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
      "id": "01f43ab9-7719-4523-80e9-0a2d1c03e971",
      "at": "2026-10-30T13:25:49.571488Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
      "counterpart_id": null
    },
    {
      "id": "e4b4f09e-3b94-4c01-8699-2c018d22903c",
      "at": "2026-10-30T13:25:47.538859Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "ccafb4d5-98a1-43b8-a265-985ff8c8d8fe",
      "counterpart_id": null
    },
    {
      "id": "8270e4f4-0c42-498c-8e12-6e4702f8c9b5",
      "at": "2026-10-30T13:25:42.47736Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
      "counterpart_id": null
    },
    {
      "id": "5d3d230f-447a-4498-90f9-a23553b8e26e",
      "at": "2026-10-30T13:25:38.41006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e1c09123-956d-448b-85cc-f054875a8bb6",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bb71be13-5013-4bcf-952a-0d5933dccb69",
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
  "last_heartbeat_at": "2026-10-30T13:25:46.290905Z",
  "last_location_at": "2026-10-30T13:25:46.290905Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bb71be13-5013-4bcf-952a-0d5933dccb69/close` → **200**

```json
{
  "command_id": "97fce39e-2ccf-41f3-82d6-c89faeaa114d",
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

Done: card order ccafb4d5-98a1-43b8-a265-985ff8c8d8fe.

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
  "phone": "+380737531168",
  "device_ref": "sandbox-6997"
}
```

```json
{
  "challenge_id": "e98dc5e2-1e4c-4a6d-bcea-4989bb663562",
  "expires_at": "2026-10-30T13:30:51.543405414Z",
  "resend_available_at": "2026-10-30T13:25:52.543405414Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737531168` → **200**

```json
{
  "phone": "+380737531168",
  "audience": "CLIENT",
  "code": "479227",
  "sent_at": "2026-10-30T13:25:51.546125788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e98dc5e2-1e4c-4a6d-bcea-4989bb663562",
  "code": "479227",
  "device_ref": "sandbox-6997"
}
```

```json
{
  "session_id": "e58e5b35-cf2c-4192-b096-7839347ceb55",
  "subject": {
    "type": "CLIENT",
    "id": "2ddfeb5c-3492-48cb-bbaa-18c101c0ff0c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZGRmZWI1Yy0zNDkyLTQ4Y2ItYmJhYS0xOGMxMDFjMGZmMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjUxLCJpYXQiOjE3OTMzNjY3NTEsImp0aSI6IjYzZTkwOTQwLTg1NjktNDRiZi04MDdiLTEzYTUxM2IzNDk2MiIsInNpZCI6ImU1OGU1YjM1LWNmMmMtNDE5Mi1iMDk2LTc4MzkzNDdjZWI1NSJ9.4nh3EwvMC4_YnIn85Ve_05ExYlurODe4zefD-QP1-E0",
  "access_expires_at": "2026-10-30T13:40:51.859008243Z",
  "refresh_token": "DMIyc_x3H5Qsic4AprDJj-EJH9wtTCqVmfgJOziZ5FI",
  "refresh_expires_at": "2026-11-29T13:25:51.858484709Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "90b43611-6198-4f94-b771-e61ebc3fa55d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "73f39a49-ea5d-46ad-8f6b-23ffc6eb0751",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-73f39a49-ea5d-46ad-8f6b-23ffc6eb0751",
    "orderDate": "1793366752",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "ac1f1b1d354989471e41c65fcc21a359",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=73f39a49-ea5d-46ad-8f6b-23ffc6eb0751",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737531168"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=73f39a49-ea5d-46ad-8f6b-23ffc6eb0751",
  "created_at": "2026-10-30T13:25:52.157133Z",
  "expires_at": "2026-10-30T13:55:52.157133Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/73f39a49-ea5d-46ad-8f6b-23ffc6eb0751` → **200**

```json
{
  "id": "73f39a49-ea5d-46ad-8f6b-23ffc6eb0751",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:25:52.157133Z",
  "expires_at": "2026-10-30T13:55:52.157133Z",
  "completed_at": "2026-10-30T13:25:52.46303Z",
  "masked_pan": "41****2295",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2ddfeb5c-3492-48cb-bbaa-18c101c0ff0c",
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
      "id": "58c8de65-faee-42e8-a64c-914374e88a29",
      "at": "2026-10-30T13:25:52.587055Z",
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
  "client_id": "2ddfeb5c-3492-48cb-bbaa-18c101c0ff0c",
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
      "id": "58c8de65-faee-42e8-a64c-914374e88a29",
      "at": "2026-10-30T13:25:52.587055Z",
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
  "device_ref": "sandbox-21914"
}
```

```json
{
  "challenge_id": "b31ac72c-9acb-4ab1-8099-fb01af8d0c22",
  "expires_at": "2026-10-30T13:30:53.365705828Z",
  "resend_available_at": "2026-10-30T13:25:54.365705828Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "328520",
  "sent_at": "2026-10-30T13:25:53.36956824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b31ac72c-9acb-4ab1-8099-fb01af8d0c22",
  "code": "328520",
  "device_ref": "sandbox-21914"
}
```

```json
{
  "session_id": "face79f4-090b-4fac-85fe-c380dd9753d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzY1MywiaWF0IjoxNzkzMzY2NzUzLCJqdGkiOiJkNDg2YTNmMy05ZDg5LTQ3MzUtOThhZC00Mjk1YTNhNTBhODEiLCJzaWQiOiJmYWNlNzlmNC0wOTBiLTRmYWMtODVmZS1jMzgwZGQ5NzUzZDgifQ.SO1tBrTvbMCheF2J4H-e00mh14vZJ0ss-RwjvJvuqts",
  "access_expires_at": "2026-10-30T13:40:53.691091756Z",
  "refresh_token": "ExonosDiJ0u09rsfLStptdEZ7YKGlRhG7_jermzBlVI",
  "refresh_expires_at": "2026-11-29T13:25:53.690535682Z",
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
  "command_id": "57548faf-d1bd-44de-93a9-9ed505a109ce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c4418558-ecdd-4f96-9b85-c8d2087b733f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c4418558-ecdd-4f96-9b85-c8d2087b733f",
    "orderDate": "1793366754",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "60d607e01db5d47666bf1858a4ed959f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c4418558-ecdd-4f96-9b85-c8d2087b733f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c4418558-ecdd-4f96-9b85-c8d2087b733f",
  "created_at": "2026-10-30T13:25:54.273564Z",
  "expires_at": "2026-10-30T13:55:54.273564Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c4418558-ecdd-4f96-9b85-c8d2087b733f` → **200**

```json
{
  "id": "c4418558-ecdd-4f96-9b85-c8d2087b733f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:25:54.273564Z",
  "expires_at": "2026-10-30T13:55:54.273564Z",
  "completed_at": "2026-10-30T13:25:54.564789Z",
  "masked_pan": "41****5355",
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
      "id": "a6d7eb51-e336-4add-af35-4029e7dd012d",
      "at": "2026-10-30T13:25:54.593213Z",
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
  "command_id": "abfd4cdd-996f-413b-b725-f8691cc5d03d",
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
  "correlation_id": "94a8728e-165a-4779-a860-e9277a5d3c65"
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
  "device_ref": "sandbox-25461"
}
```

```json
{
  "challenge_id": "64a32bda-70f9-417c-b2f4-8b40fa532767",
  "expires_at": "2026-10-30T13:30:55.508876605Z",
  "resend_available_at": "2026-10-30T13:25:56.508876605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "063272",
  "sent_at": "2026-10-30T13:25:55.511519899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64a32bda-70f9-417c-b2f4-8b40fa532767",
  "code": "063272",
  "device_ref": "sandbox-25461"
}
```

```json
{
  "session_id": "43547a0e-01db-4e5e-ac3b-30776d9e2a8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzY1NSwiaWF0IjoxNzkzMzY2NzU1LCJqdGkiOiJmYzI2ZjU4Mi1mZTYwLTRmZjItOTY1Ni00ODRjMzI0ZjJjNjEiLCJzaWQiOiI0MzU0N2EwZS0wMWRiLTRlNWUtYWMzYi0zMDc3NmQ5ZTJhOGQifQ.Z9o8keEp9KntvNcDk4y11uA0XpmhpZ0q7w1rPmvLgAU",
  "access_expires_at": "2026-10-30T13:40:55.840345517Z",
  "refresh_token": "a5UH42Xc2no7LFa2wTmXPoeiQQtqG7f54XDnJvdynZ4",
  "refresh_expires_at": "2026-11-29T13:25:55.839659853Z",
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
  "command_id": "794c5922-672c-4f3c-b353-680f2b34673d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:56Z",
    "sequence": 1793366756434
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ecbe87a0-530b-4f23-847f-a04aaf0cd8c6",
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
  "last_heartbeat_at": "2026-10-30T13:25:56.454695Z",
  "last_location_at": "2026-10-30T13:25:56.454695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634896822",
  "device_ref": "sandbox-16341"
}
```

```json
{
  "challenge_id": "55c106be-c369-4ba3-ab7f-7fad3eaa6d52",
  "expires_at": "2026-10-30T13:30:56.756274692Z",
  "resend_available_at": "2026-10-30T13:25:57.756274692Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634896822` → **200**

```json
{
  "phone": "+380634896822",
  "audience": "CLIENT",
  "code": "625225",
  "sent_at": "2026-10-30T13:25:56.759367943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55c106be-c369-4ba3-ab7f-7fad3eaa6d52",
  "code": "625225",
  "device_ref": "sandbox-16341"
}
```

```json
{
  "session_id": "8a7e9558-3986-4e47-b949-39a3f4de1ea4",
  "subject": {
    "type": "CLIENT",
    "id": "95150d8d-ab54-427c-b318-fc222da0822c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTE1MGQ4ZC1hYjU0LTQyN2MtYjMxOC1mYzIyMmRhMDgyMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjU3LCJpYXQiOjE3OTMzNjY3NTcsImp0aSI6IjBiZDE2NjU5LTRlNzgtNGEzNC05MzkxLTg1ZWVmOGNlZTc3MSIsInNpZCI6IjhhN2U5NTU4LTM5ODYtNGU0Ny1iOTQ5LTM5YTNmNGRlMWVhNCJ9.We89gUC24vt_5aOBsJFyTEG2iezkpF52pkjxfawtB0o",
  "access_expires_at": "2026-10-30T13:40:57.075355994Z",
  "refresh_token": "ajGkhQdAaT_RHUzSfJvHrsehAsECNm5buPURSgVmGEc",
  "refresh_expires_at": "2026-11-29T13:25:57.074682111Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b8e2de6a-6bd0-4089-b155-7de579a6630b",
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
  "id": "f3308723-c63d-41aa-b324-fbb8983ee2f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:57.371469Z",
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
  "command_id": "9beac3fe-f4f6-4164-978d-58691af6355b",
  "quote_id": "f3308723-c63d-41aa-b324-fbb8983ee2f5",
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
  "id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "95150d8d-ab54-427c-b318-fc222da0822c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:25:57.679656Z",
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
    "id": "8d565213-8a4c-40f3-b62f-7261914b70fd",
    "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
    "expires_at": "2026-10-30T13:26:12.682801Z",
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

`POST /api/driver/v1/offers/8d565213-8a4c-40f3-b62f-7261914b70fd/accept` → **200**

```json
{
  "command_id": "f5f055e6-26dc-427e-890a-3672bba62865"
}
```

```json
{
  "id": "7869e84e-ee18-42cd-bfc1-4fae4b2db99b",
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9c64f1e-2eb8-46f7-98fb-1f9391c3358c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9c64f1e-2eb8-46f7-98fb-1f9391c3358c",
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "assignment_id": "7869e84e-ee18-42cd-bfc1-4fae4b2db99b",
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

`POST /api/driver/v1/work-sessions/ecbe87a0-530b-4f23-847f-a04aaf0cd8c6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:58Z",
    "sequence": 1793366758908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ecbe87a0-530b-4f23-847f-a04aaf0cd8c6",
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
  "last_heartbeat_at": "2026-10-30T13:25:58.927701Z",
  "last_location_at": "2026-10-30T13:25:58.927701Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e9c64f1e-2eb8-46f7-98fb-1f9391c3358c/arrive` → **200**

```json
{
  "command_id": "4573baa6-f0b3-4806-ae2f-db17a18889ef",
  "expected_version": 0
}
```

```json
{
  "id": "e9c64f1e-2eb8-46f7-98fb-1f9391c3358c",
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "assignment_id": "7869e84e-ee18-42cd-bfc1-4fae4b2db99b",
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
  "arrived_at": "2026-10-30T13:25:59.231046Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9c64f1e-2eb8-46f7-98fb-1f9391c3358c/start` → **200**

```json
{
  "command_id": "6e2ea18d-401e-403d-a657-e16fc653cc27",
  "expected_version": 1
}
```

```json
{
  "id": "e9c64f1e-2eb8-46f7-98fb-1f9391c3358c",
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "assignment_id": "7869e84e-ee18-42cd-bfc1-4fae4b2db99b",
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
  "arrived_at": "2026-10-30T13:25:59.231046Z",
  "started_at": "2026-10-30T13:25:59.53352Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9c64f1e-2eb8-46f7-98fb-1f9391c3358c/complete` → **200**

```json
{
  "command_id": "f66a9add-6c3f-4c03-a859-16b08893f5c7",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:25:59Z",
  "cash_received": false
}
```

```json
{
  "id": "e9c64f1e-2eb8-46f7-98fb-1f9391c3358c",
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "assignment_id": "7869e84e-ee18-42cd-bfc1-4fae4b2db99b",
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
  "arrived_at": "2026-10-30T13:25:59.231046Z",
  "started_at": "2026-10-30T13:25:59.53352Z",
  "completed_at": "2026-10-30T13:25:59.846857Z",
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
  "session_id": "bd9234a3-1ff0-4b2a-87e3-fcbb53e789cd",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc2NjAsImlhdCI6MTc5MzM2Njc2MCwianRpIjoiNDhkOWRjZjMtZTc2OS00YTI3LWE3YjItMWViMzdmNmI4YjIyIiwic2lkIjoiYmQ5MjM0YTMtMWZmMC00YjJhLTg3ZTMtZmNiYjUzZTc4OWNkIn0.9oaUsigR9teMtdQVUWU7zQvYBLTDpgJuQwtyLtdD_t4",
  "access_expires_at": "2026-10-30T13:41:00.456465481Z",
  "refresh_token": "20ZiLMXdCp6FjQBtR7IoLZkwDPpXdW6WC6O_H8Sv4DA",
  "refresh_expires_at": "2026-10-31T01:26:00.455747015Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/056fa40e-bab8-432b-bf52-17de83309a32/cash-dispute` → **200**

```json
{
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "95150d8d-ab54-427c-b318-fc222da0822c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:26:00.661366Z",
  "decide_by": "2026-11-13T13:26:00.661366Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:26:00.661366Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "95150d8d-ab54-427c-b318-fc222da0822c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:26:00.661366Z",
      "decide_by": "2026-11-13T13:26:00.661366Z",
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

`POST /api/admin/v1/orders/056fa40e-bab8-432b-bf52-17de83309a32/cash-dispute/decide` → **400**

```json
{
  "command_id": "5e857dc8-ac7c-4476-808b-556d7cf994c4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/056fa40e-bab8-432b-bf52-17de83309a32/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0382f547-0a72-420e-b3ac-9a4f057c1b0e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/056fa40e-bab8-432b-bf52-17de83309a32/cash-dispute/decide` → **200**

```json
{
  "command_id": "a9e5710b-b061-45cb-86b5-a2c3344068d2",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "95150d8d-ab54-427c-b318-fc222da0822c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:26:00.661366Z",
  "decide_by": "2026-11-13T13:26:00.661366Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:26:01.699992Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/056fa40e-bab8-432b-bf52-17de83309a32/cash-dispute/decide` → **409**

```json
{
  "command_id": "6e76842e-370f-4750-98f8-d527e1b32b66",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/056fa40e-bab8-432b-bf52-17de83309a32/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e37c0d4e-31d5-4c5b-8382-be99904c97fa"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ecbe87a0-530b-4f23-847f-a04aaf0cd8c6",
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
  "last_heartbeat_at": "2026-10-30T13:25:58.927701Z",
  "last_location_at": "2026-10-30T13:25:58.927701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ecbe87a0-530b-4f23-847f-a04aaf0cd8c6/close` → **200**

```json
{
  "command_id": "f0760d2e-85d1-45c1-8c08-539660539527",
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
  "phone": "+380737136578",
  "device_ref": "sandbox-6039"
}
```

```json
{
  "challenge_id": "cc9f9083-8d3b-4cc1-8808-635b7bef35c8",
  "expires_at": "2026-10-30T13:31:02.936527499Z",
  "resend_available_at": "2026-10-30T13:26:03.936527499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737136578` → **200**

```json
{
  "phone": "+380737136578",
  "audience": "CLIENT",
  "code": "275012",
  "sent_at": "2026-10-30T13:26:02.939485325Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc9f9083-8d3b-4cc1-8808-635b7bef35c8",
  "code": "275012",
  "device_ref": "sandbox-6039"
}
```

```json
{
  "session_id": "2faa2805-59e0-41f4-a933-bf506d9ccefd",
  "subject": {
    "type": "CLIENT",
    "id": "917a2417-5bf0-48ca-8a3e-af490c76e992"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTdhMjQxNy01YmYwLTQ4Y2EtOGEzZS1hZjQ5MGM3NmU5OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjYzLCJpYXQiOjE3OTMzNjY3NjMsImp0aSI6IjQ3YzcwNzE0LWUxNzQtNDc1Ny1iMDI1LTJhMmVkZjBjOWJjMSIsInNpZCI6IjJmYWEyODA1LTU5ZTAtNDFmNC1hOTMzLWJmNTA2ZDljY2VmZCJ9.D5g97aUqEwHf6csOwGJScX9laMENhlGIzc7aqQ9tilg",
  "access_expires_at": "2026-10-30T13:41:03.272141768Z",
  "refresh_token": "6t_KY5YUyQfWp2ZDKjNXJWWxFoMT_5QwB4nCyC7HTL0",
  "refresh_expires_at": "2026-11-29T13:26:03.271539689Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6198674b-bb01-4a3f-826f-3920193ad407",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3a7fb40a-abba-4304-8454-464cf36f3e2b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3a7fb40a-abba-4304-8454-464cf36f3e2b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "843f1ed8bce682f1fa546553a2bba5b1",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3a7fb40a-abba-4304-8454-464cf36f3e2b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737136578"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3a7fb40a-abba-4304-8454-464cf36f3e2b",
  "expires_at": "2026-10-30T13:56:03.575441Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3a7fb40a-abba-4304-8454-464cf36f3e2b` → **200**

```json
{
  "id": "3a7fb40a-abba-4304-8454-464cf36f3e2b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:56:03.575441Z",
  "card": {
    "id": "967e5497-5842-4579-9937-79a053f4d88f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9781",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:26:03.877234Z"
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
  "device_ref": "sandbox-25237"
}
```

```json
{
  "challenge_id": "1694e733-4017-40b0-a0ce-9419ff7c20e6",
  "expires_at": "2026-10-30T13:31:04.189137976Z",
  "resend_available_at": "2026-10-30T13:26:05.189137976Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "405879",
  "sent_at": "2026-10-30T13:26:04.191834449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1694e733-4017-40b0-a0ce-9419ff7c20e6",
  "code": "405879",
  "device_ref": "sandbox-25237"
}
```

```json
{
  "session_id": "282d125c-a2b9-4524-8b5a-3f4f6e332850",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzY2NCwiaWF0IjoxNzkzMzY2NzY0LCJqdGkiOiI1N2I0NjMzZS02N2NhLTQ0ODEtYTk2MC1lYjEyNjM1ZGRhNjAiLCJzaWQiOiIyODJkMTI1Yy1hMmI5LTQ1MjQtOGI1YS0zZjRmNmUzMzI4NTAifQ.4xjkKjlJNGMtK_PJ47Nr9_5ZY6zHpv9ZkjqB2JxRBF4",
  "access_expires_at": "2026-10-30T13:41:04.50871732Z",
  "refresh_token": "1WKeVoF1_MTeDT5MONZjFQseAIrsr8zO8qX1SSD0l94",
  "refresh_expires_at": "2026-11-29T13:26:04.508117415Z",
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
  "command_id": "ccd8f66d-ef15-4fd0-8415-3a6d4e17765c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:26:05Z",
    "sequence": 1793366765117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5",
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
  "last_heartbeat_at": "2026-10-30T13:26:05.137131Z",
  "last_location_at": "2026-10-30T13:26:05.137131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "707c5b55-7555-45e8-8595-2e6450432270",
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
  "id": "94c6652b-f2e6-4c08-9ef0-6900947f65b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:31:05.457068Z",
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
  "command_id": "7298b238-a110-4539-a101-06457a0dbb17",
  "quote_id": "94c6652b-f2e6-4c08-9ef0-6900947f65b6",
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
  "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
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
  "created_at": "2026-10-30T13:26:05.768871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd` → **200**

```json
{
  "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
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
  "created_at": "2026-10-30T13:26:05.768871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd` → **200**

```json
{
  "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
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
  "created_at": "2026-10-30T13:26:05.768871Z",
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
    "id": "970f51fa-74e3-4205-bf1b-85d9434d549d",
    "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
    "expires_at": "2026-10-30T13:26:21.71006Z",
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

`POST /api/driver/v1/offers/970f51fa-74e3-4205-bf1b-85d9434d549d/accept` → **200**

```json
{
  "command_id": "4e9328ba-4e3c-4745-966c-82709303799d"
}
```

```json
{
  "id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "assignment_id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
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

`POST /api/rider/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/messages` → **201**

```json
{
  "command_id": "c83ee7ce-c2f4-4b21-82b4-4bdcecdb9a4f",
  "body": "Я біля входу, мій номер +380737136578, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "36b6bc2c-7a03-49c0-a765-9935c8067373",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737136578, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:26:08.650554033Z"
}
```

`POST /api/driver/v1/trips/024236cc-9ad4-41eb-8c0a-8c938f044ce0/messages` → **201**

```json
{
  "command_id": "79a43240-841a-4936-bc84-53fae124fcb0",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "687d0ce4-88e1-4118-99a1-f2f20d0f7326",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:26:08.967069515Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:26:14Z",
    "sequence": 1793366774289
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5",
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
  "last_heartbeat_at": "2026-10-30T13:26:14.308525Z",
  "last_location_at": "2026-10-30T13:26:14.308525Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/024236cc-9ad4-41eb-8c0a-8c938f044ce0/arrive` → **200**

```json
{
  "command_id": "7ea77469-a681-4ddc-aa0b-f659d3a22a38",
  "expected_version": 0
}
```

```json
{
  "id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "assignment_id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
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
  "arrived_at": "2026-10-30T13:26:14.614214Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/024236cc-9ad4-41eb-8c0a-8c938f044ce0/start` → **200**

```json
{
  "command_id": "4b99251d-cdae-4207-8334-5592dcf9f8a7",
  "expected_version": 1
}
```

```json
{
  "id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "assignment_id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
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
  "arrived_at": "2026-10-30T13:26:14.614214Z",
  "started_at": "2026-10-30T13:26:14.926591Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:27:45Z",
    "sequence": 1793366865248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5",
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
  "last_heartbeat_at": "2026-10-30T13:27:45.267406Z",
  "last_location_at": "2026-10-30T13:27:45.267406Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/024236cc-9ad4-41eb-8c0a-8c938f044ce0/complete` → **200**

```json
{
  "command_id": "abf00824-0167-4f21-a031-fe7211149b29",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:27:45Z",
  "cash_received": false
}
```

```json
{
  "id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "assignment_id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
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
  "arrived_at": "2026-10-30T13:26:14.614214Z",
  "started_at": "2026-10-30T13:26:14.926591Z",
  "completed_at": "2026-10-30T13:27:45.573359Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd` → **200**

```json
{
  "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
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
    "id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
    "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:26:05.768871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd` → **200**

```json
{
  "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
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
    "id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
    "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:26:05.768871Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd` → **200**

```json
{
  "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
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
    "id": "6b9f21db-b576-4dd4-af78-621b8b6488f5",
    "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "024236cc-9ad4-41eb-8c0a-8c938f044ce0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:26:05.768871Z",
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
  "session_id": "5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5",
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
  "last_heartbeat_at": "2026-10-30T13:27:45.267406Z",
  "last_location_at": "2026-10-30T13:27:45.267406Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5ab8cdd9-30b0-4ff9-8cd8-419f2488c1f5/close` → **200**

```json
{
  "command_id": "86af8fa5-68e7-47dd-b6a6-12d78dd9815e",
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
  "session_id": "bd333b3a-107e-44d4-b783-15aa2aa3dbc5",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NjksImlhdCI6MTc5MzM2Njg2OSwianRpIjoiYjdlNzBlZGYtMGNiNy00YjVlLTkxNDItZjQwN2U3ZTA4Y2UwIiwic2lkIjoiYmQzMzNiM2EtMTA3ZS00NGQ0LWI3ODMtMTVhYTJhYTNkYmM1In0.Qy6hbYr8DL0VdUAIvw_ncT-mi4T-FYNcs5f5T_Apmw8",
  "access_expires_at": "2026-10-30T13:42:49.709072756Z",
  "refresh_token": "LJD8OeT5AsaOTRsjV5cWesTX7kuFU1HyU7Fm_7F1eBY",
  "refresh_expires_at": "2026-10-31T01:27:49.708510241Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5517dfe0-096a-452b-9309-57df2790a080"
}
```

`GET /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T13:27:50.302493504Z",
  "order": {
    "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
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
    "created_at": "2026-10-30T13:26:05.768871Z",
    "assigned_at": "2026-10-30T13:26:08.047732Z",
    "arrived_at": "2026-10-30T13:26:14.614214Z",
    "started_at": "2026-10-30T13:26:14.926591Z",
    "completed_at": "2026-10-30T13:27:45.573359Z"
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
    "id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
    "registered_at": "2026-10-30T13:26:03.269778Z",
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
      "created_at": "2026-10-30T13:26:05.770984Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T13:27:45.905407Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks` → **422**

```json
{
  "command_id": "b55f0180-af17-4a7d-be24-e3aba8f3cc00",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "aa74936e-73e1-4eb6-b6d5-57e3e2552ec2"
}
```

`POST /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks` → **201**

```json
{
  "command_id": "fe07bd1e-cecc-4d74-be8c-8c8f133d8632",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "cccf2aa2-6e48-4f41-8641-f4e00e25ecc5",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:27:50.998964Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks` → **201**

```json
{
  "command_id": "fe07bd1e-cecc-4d74-be8c-8c8f133d8632",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "cccf2aa2-6e48-4f41-8641-f4e00e25ecc5",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:27:50.998964Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/917a2417-5bf0-48ca-8a3e-af490c76e992` → **200**

```json
{
  "client": {
    "id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
    "phone": "+380737136578",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:26:03.269778Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:26:05.768871Z",
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

`GET /api/admin/v1/clients/917a2417-5bf0-48ca-8a3e-af490c76e992` → **200**

```json
{
  "client": {
    "id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
    "phone": "+380737136578",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:26:03.269778Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:26:05.768871Z",
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

`POST /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks/cccf2aa2-6e48-4f41-8641-f4e00e25ecc5/resolve` → **200**

```json
{
  "command_id": "7ce77aa0-af5a-4e03-8c88-e1080158ef16",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "cccf2aa2-6e48-4f41-8641-f4e00e25ecc5",
  "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T13:27:50.998964Z",
  "resolved_at": "2026-10-30T13:27:53.289378Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/917a2417-5bf0-48ca-8a3e-af490c76e992` → **200**

```json
{
  "client": {
    "id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
    "phone": "+380737136578",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:26:03.269778Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:26:05.768871Z",
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

`GET /api/admin/v1/clients/917a2417-5bf0-48ca-8a3e-af490c76e992` → **200**

```json
{
  "client": {
    "id": "917a2417-5bf0-48ca-8a3e-af490c76e992",
    "phone": "+380737136578",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:26:03.269778Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:26:05.768871Z",
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

`POST /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks/cccf2aa2-6e48-4f41-8641-f4e00e25ecc5/resolve` → **409**

```json
{
  "command_id": "4eec308b-e45e-40ad-ab65-1ca14bad9dae",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks/cccf2aa2-6e48-4f41-8641-f4e00e25ecc5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d73a2614-66ff-441b-a7cc-3f342621ff32"
}
```

`GET /api/admin/v1/orders/20eb7a88-5436-4479-82fd-c58690ef23cd/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "cccf2aa2-6e48-4f41-8641-f4e00e25ecc5",
      "order_id": "20eb7a88-5436-4479-82fd-c58690ef23cd",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T13:27:50.998964Z",
      "resolved_at": "2026-10-30T13:27:53.289378Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 20eb7a88-5436-4479-82fd-c58690ef23cd without phone or card digits; chargeback cccf2aa2-6e48-4f41-8641-f4e00e25ecc5 recorded and won.

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
  "session_id": "ca60a4b4-461d-40f9-8352-24d3a9292f57",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NzYsImlhdCI6MTc5MzM2Njg3NiwianRpIjoiYTFhNzcyYmUtMTE2NS00YWEyLWE0NTktZjQ4Mjk5YTM4ZDg5Iiwic2lkIjoiY2E2MGE0YjQtNDYxZC00MGY5LTgzNTItMjRkM2E5MjkyZjU3In0.dIWdazAhwpnLgwhxLkDSb2vPPMssxdyieDQHoS1_Qts",
  "access_expires_at": "2026-10-30T13:42:56.44369855Z",
  "refresh_token": "TAx46Ofh4DhG1ieqaaEpKtdUSShEtPDjRCIxDzWfTUw",
  "refresh_expires_at": "2026-10-31T01:27:56.443097573Z",
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
  "phone": "+48600128739",
  "device_ref": "sandbox-14923"
}
```

```json
{
  "challenge_id": "9a81dd5c-c6c2-475c-bc21-f2757a3ab1c4",
  "expires_at": "2026-10-30T13:32:57.349688646Z",
  "resend_available_at": "2026-10-30T13:27:58.349688646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600128739` → **200**

```json
{
  "phone": "+48600128739",
  "audience": "CLIENT",
  "code": "874248",
  "sent_at": "2026-10-30T13:27:57.353356292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a81dd5c-c6c2-475c-bc21-f2757a3ab1c4",
  "code": "874248",
  "device_ref": "sandbox-14923"
}
```

```json
{
  "session_id": "0f4ee236-efe5-4dc7-bb46-8cf9e33befe6",
  "subject": {
    "type": "CLIENT",
    "id": "e199f1b3-855f-4dde-aa18-74253ec39254"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTk5ZjFiMy04NTVmLTRkZGUtYWExOC03NDI1M2VjMzkyNTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzc3LCJpYXQiOjE3OTMzNjY4NzcsImp0aSI6IjgyYjM4OTY3LTZmZWEtNDZjMi04Y2Y5LTY5ZDBjZDYyYTJiNSIsInNpZCI6IjBmNGVlMjM2LWVmZTUtNGRjNy1iYjQ2LThjZjllMzNiZWZlNiJ9.Qhpw-ikq53yE2LKe-VPCq4a8qYcpUKadlOLnX2d1u3U",
  "access_expires_at": "2026-10-30T13:42:57.677579913Z",
  "refresh_token": "awAKNENQbBkyPzfcYfXHqxdy5XvvATsaRcQs7dXp3ps",
  "refresh_expires_at": "2026-11-29T13:27:57.677014623Z",
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
  "command_id": "3590a4ad-2913-41ce-80d0-ba9967c18bfb",
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
  "correlation_id": "eac0a44e-ad44-4b6e-b002-0e3eb4b463aa",
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
  "command_id": "c69bd3c9-271b-4a29-9a29-4dd4ee88faf4",
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
  "paused_at": "2026-10-30T13:27:58.860709403Z",
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
  "command_id": "b4c59eae-8e0d-4de4-8631-a47d27a5dfe9",
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
  "id": "29f2c74f-79bd-4aca-a477-e619442e4c80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:59.483618Z",
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
  "command_id": "6123bd54-a3de-4b21-8bb7-f1396e832c9e",
  "quote_id": "29f2c74f-79bd-4aca-a477-e619442e4c80",
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
  "correlation_id": "624270e4-a85f-49bb-94d7-b0c325345698"
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
  "paused_at": "2026-10-30T13:27:58.860709Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "384c47c6-59e5-4d67-b326-9c30ac612567",
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
  "command_id": "74dd3930-3a31-4709-ab34-c9bcdd7a8d35",
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
  "command_id": "153be38f-4c0b-4413-9350-998be56c7278",
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
  "id": "77fab1a0-9e1d-40e3-9762-aab0de62f275",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:01.325762Z",
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
  "command_id": "84b91fd3-2696-4ff5-9fc7-e1eff95d4542",
  "quote_id": "77fab1a0-9e1d-40e3-9762-aab0de62f275",
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
  "correlation_id": "4df0c69c-1b1e-43f5-b85e-a0bd5548d1a2"
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
  "command_id": "893d1f22-e8ab-412a-acff-21d0a33afe60",
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
  "command_id": "d4e3d6f3-25a7-46c1-b725-3803f75dfadd",
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
  "id": "605a847e-3875-4a19-bcc3-8b49bc73246b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:02.552921Z",
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
  "command_id": "ea58781a-c71c-4b7c-9360-9344cc149f69",
  "quote_id": "605a847e-3875-4a19-bcc3-8b49bc73246b",
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
  "correlation_id": "53033a7d-9dac-41a4-bc49-4775ca918366"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "e832e821-21a0-4c8d-b22a-93d3745dbac6",
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
  "correlation_id": "4ca945a1-200e-496f-95ff-a592842d73bb"
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
  "command_id": "b8fd6bde-c299-4b51-a4bd-07e87fc8cfa7",
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
  "phone": "+380676718292",
  "device_ref": "sandbox-21041"
}
```

```json
{
  "challenge_id": "8dc3a1fe-ca87-40e8-947b-655be140b02c",
  "expires_at": "2026-10-30T13:33:04.090981553Z",
  "resend_available_at": "2026-10-30T13:28:05.090981553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676718292` → **200**

```json
{
  "phone": "+380676718292",
  "audience": "CLIENT",
  "code": "946636",
  "sent_at": "2026-10-30T13:28:04.094489198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8dc3a1fe-ca87-40e8-947b-655be140b02c",
  "code": "946636",
  "device_ref": "sandbox-21041"
}
```

```json
{
  "session_id": "d694c49e-e54e-48ff-a10e-cbbc6731df82",
  "subject": {
    "type": "CLIENT",
    "id": "9da5fbb6-276e-4a56-9b11-f14ea6bbf267"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGE1ZmJiNi0yNzZlLTRhNTYtOWIxMS1mMTRlYTZiYmYyNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzg0LCJpYXQiOjE3OTMzNjY4ODQsImp0aSI6ImM5NjhhNGQwLThjOTEtNGRkNS1iNGQwLWViMmQxYzU0ODI3ZCIsInNpZCI6ImQ2OTRjNDllLWU1NGUtNDhmZi1hMTBlLWNiYmM2NzMxZGY4MiJ9.lVq9SNj4o3x4uqeLEmmMAcu9WJ7tQtRkDyfXKx7IA5Y",
  "access_expires_at": "2026-10-30T13:43:04.411839866Z",
  "refresh_token": "mNlndCh0fTQCqRI1iiDBns8fettuUuGGvY05QHI0W1Q",
  "refresh_expires_at": "2026-11-29T13:28:04.411109106Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9da5fbb6-276e-4a56-9b11-f14ea6bbf267",
  "session_id": "d694c49e-e54e-48ff-a10e-cbbc6731df82",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6d1d1b3-c3b0-4525-a0e0-ecf3eb5b4aa3",
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
  "id": "80e38803-468d-4ed9-9024-cc2fe2ac94ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:05.002657Z",
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
  "challenge_id": "994f3e6b-abc8-423b-a689-42d959ba15e6",
  "expires_at": "2026-10-30T13:33:07.312364669Z",
  "resend_available_at": "2026-10-30T13:28:08.312364669Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676718292` → **200**

```json
{
  "phone": "+380676718292",
  "audience": "CLIENT",
  "code": "457799",
  "sent_at": "2026-10-30T13:28:07.31523449Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "622bfe62-9cfe-49e0-b7f1-14f726ee6eac",
  "challenge_id": "994f3e6b-abc8-423b-a689-42d959ba15e6",
  "otp_code": "457799"
}
```

```json
{
  "client_id": "9da5fbb6-276e-4a56-9b11-f14ea6bbf267",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:28:07.693905491Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "50f6865e-7dcd-40c8-a55d-dd9164317126",
  "quote_id": "80e38803-468d-4ed9-9024-cc2fe2ac94ea",
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
  "correlation_id": "d17bb0fe-88f7-4eb7-bc05-b3ffaa9a8b0d"
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
  "session_id": "c35d09f9-ec45-4e61-b9b2-32f91ce8c2c8",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3ODgsImlhdCI6MTc5MzM2Njg4OCwianRpIjoiYWMzMGU0NmYtMGNhYi00ZGRkLTkzMWYtODJjNTFiODg4NGU0Iiwic2lkIjoiYzM1ZDA5ZjktZWM0NS00ZTYxLWI5YjItMzJmOTFjZThjMmM4In0.vbP7u-OZ2LS48KnF9l_SgTnxEO3jNyWaXX_hhVIpGCc",
  "access_expires_at": "2026-10-30T13:43:08.600942105Z",
  "refresh_token": "67fe2LO-RPYKUcU-4vCjPhiSo5EVqtOOYpt3iTFEPbA",
  "refresh_expires_at": "2026-10-31T01:28:08.600307655Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "9da5fbb6-276e-4a56-9b11-f14ea6bbf267",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:28:07.693905Z",
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

`POST /api/admin/v1/client-deletions/9da5fbb6-276e-4a56-9b11-f14ea6bbf267/complete` → **200**

```json
{
  "command_id": "16358617-b1e4-4094-95b2-aa34c3f83fe8",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "9da5fbb6-276e-4a56-9b11-f14ea6bbf267",
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
  "correlation_id": "c45fe6a8-1ec2-491b-bffd-2464daeeb603"
}
```

Done: client 9da5fbb6-276e-4a56-9b11-f14ea6bbf267 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668688331",
  "device_ref": "sandbox-440"
}
```

```json
{
  "challenge_id": "1d484604-018e-4fe2-8f90-b373f454ffb3",
  "expires_at": "2026-10-30T13:33:09.803241676Z",
  "resend_available_at": "2026-10-30T13:28:10.803241676Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668688331` → **200**

```json
{
  "phone": "+380668688331",
  "audience": "CLIENT",
  "code": "494123",
  "sent_at": "2026-10-30T13:28:09.806121551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d484604-018e-4fe2-8f90-b373f454ffb3",
  "code": "494123",
  "device_ref": "sandbox-440"
}
```

```json
{
  "session_id": "29529a25-6ad1-4782-a21f-a19335b54749",
  "subject": {
    "type": "CLIENT",
    "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTgxYWYwMS01YTdlLTQ1YTQtYWJjZC1iMGI0MDUyOTE1ZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NzkwLCJpYXQiOjE3OTMzNjY4OTAsImp0aSI6ImIwMzkzNjBlLTcxYmEtNDI2ZC05NDZkLTRkZjU1ZmQ5MWU2NSIsInNpZCI6IjI5NTI5YTI1LTZhZDEtNDc4Mi1hMjFmLWExOTMzNWI1NDc0OSJ9.l6JFqmUPsAjLaLtITCpK7FoHrbIsXhcXVypjbNaYwgI",
  "access_expires_at": "2026-10-30T13:43:10.132795748Z",
  "refresh_token": "ZT3V1eukBX79jcnFfANmqpwuhJlUGbOLctXAi8YVM0g",
  "refresh_expires_at": "2026-11-29T13:28:10.132197136Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
  "session_id": "29529a25-6ad1-4782-a21f-a19335b54749",
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
  "session_id": "69554555-6aa4-43ca-b201-4f3cbe6ea569",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3OTEsImlhdCI6MTc5MzM2Njg5MSwianRpIjoiMmRhYTE3NzktZGM5MS00ZWI2LWE3YjktNGRlMzhjNmU5NzNlIiwic2lkIjoiNjk1NTQ1NTUtNmFhNC00M2NhLWIyMDEtNGYzY2JlNmVhNTY5In0.o9yUsb1sEE96h8Niyc6dNJph9I9fuDsW_qRqBGOxmWA",
  "access_expires_at": "2026-10-30T13:43:11.010813856Z",
  "refresh_token": "PxrjxOD39FLWhOObV0dbGuKpz42qhqA_7eLDkuucCRk",
  "refresh_expires_at": "2026-10-31T01:28:11.010243155Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8688331&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
      "phone": "+380668688331",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:28:10.13042Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a581af01-5a7e-45a4-abcd-b0b4052915f7` → **200**

```json
{
  "client": {
    "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
    "phone": "+380668688331",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:28:10.13042Z",
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

`POST /api/admin/v1/clients/a581af01-5a7e-45a4-abcd-b0b4052915f7/block` → **400**

```json
{
  "command_id": "3700ce9f-52a3-4834-a7a2-816011486e85",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a581af01-5a7e-45a4-abcd-b0b4052915f7/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "88678787-f1fd-4cf1-8272-fd96aec0420d",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a581af01-5a7e-45a4-abcd-b0b4052915f7/block` → **200**

```json
{
  "command_id": "285d5af5-ecc6-4f3a-84e8-ba88c8e915bb",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
  "phone": "+380668688331",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:28:10.13042Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:28:12.294397Z",
    "by": "e963184c-985d-415a-89ba-c19f43a7b34d"
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
  "correlation_id": "f83de3f9-f9c8-46ab-8ea5-89cb2608872e"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668688331",
  "device_ref": "sandbox-23842"
}
```

```json
{
  "challenge_id": "d747826a-d0cf-4108-b3f5-410c46b2fba1",
  "expires_at": "2026-10-30T13:33:14.889070163Z",
  "resend_available_at": "2026-10-30T13:28:15.889070163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668688331` → **200**

```json
{
  "phone": "+380668688331",
  "audience": "CLIENT",
  "code": "457796",
  "sent_at": "2026-10-30T13:28:14.89288203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "d747826a-d0cf-4108-b3f5-410c46b2fba1",
  "code": "457796",
  "device_ref": "sandbox-23842"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "172f1d1f-5d28-4f1e-9a98-765c1ef88c88"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a581af01-5a7e-45a4-abcd-b0b4052915f7` → **200**

```json
{
  "client": {
    "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
    "phone": "+380668688331",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:28:10.13042Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:28:12.294397Z",
      "by": "e963184c-985d-415a-89ba-c19f43a7b34d"
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

`POST /api/admin/v1/clients/a581af01-5a7e-45a4-abcd-b0b4052915f7/unblock` → **200**

```json
{
  "command_id": "227e6183-11da-4b0e-8c65-9f283a381bba",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
  "phone": "+380668688331",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:28:10.13042Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668688331",
  "device_ref": "sandbox-29351"
}
```

```json
{
  "challenge_id": "c2b72f34-8885-4021-968b-f03a908cfcf6",
  "expires_at": "2026-10-30T13:33:18.142354196Z",
  "resend_available_at": "2026-10-30T13:28:19.142354196Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668688331` → **200**

```json
{
  "phone": "+380668688331",
  "audience": "CLIENT",
  "code": "543527",
  "sent_at": "2026-10-30T13:28:18.146081944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2b72f34-8885-4021-968b-f03a908cfcf6",
  "code": "543527",
  "device_ref": "sandbox-29351"
}
```

```json
{
  "session_id": "8247b555-bfbb-46de-b717-dbcd5cd09430",
  "subject": {
    "type": "CLIENT",
    "id": "a581af01-5a7e-45a4-abcd-b0b4052915f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTgxYWYwMS01YTdlLTQ1YTQtYWJjZC1iMGI0MDUyOTE1ZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzk4LCJpYXQiOjE3OTMzNjY4OTgsImp0aSI6IjhiYTkyZDRjLTcxOWUtNDMzNS1iMDk5LTdiM2RjMDVlNTE1ZSIsInNpZCI6IjgyNDdiNTU1LWJmYmItNDZkZS1iNzE3LWRiY2Q1Y2QwOTQzMCJ9.66qEMmds3X_6kV653rb3kefbTdbAZyE360ju2Uourl8",
  "access_expires_at": "2026-10-30T13:43:18.465366162Z",
  "refresh_token": "WNNP1sTyIARey3thY_NNY6Ilv-h0c1NmgMCqMgbyWBY",
  "refresh_expires_at": "2026-11-29T13:28:18.464796043Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a581af01-5a7e-45a4-abcd-b0b4052915f7",
  "session_id": "8247b555-bfbb-46de-b717-dbcd5cd09430",
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
  "phone": "+380668042886",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "challenge_id": "7139a33c-e8b2-47ef-9e17-ccf8d57774e1",
  "expires_at": "2026-10-30T13:33:19.057528507Z",
  "resend_available_at": "2026-10-30T13:28:20.057528507Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668042886` → **200**

```json
{
  "phone": "+380668042886",
  "audience": "CLIENT",
  "code": "795122",
  "sent_at": "2026-10-30T13:28:19.061196974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7139a33c-e8b2-47ef-9e17-ccf8d57774e1",
  "code": "795122",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "session_id": "0b6933bd-1d72-416e-9b7c-772d5c0a1353",
  "subject": {
    "type": "CLIENT",
    "id": "af9ed659-0be5-4dbc-b243-5e71563043fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjllZDY1OS0wYmU1LTRkYmMtYjI0My01ZTcxNTYzMDQzZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzk5LCJpYXQiOjE3OTMzNjY4OTksImp0aSI6ImRjYzkzMzkzLTE0OWYtNGVlNS04YTUxLTE0ZjM1MWI1YjUwOSIsInNpZCI6IjBiNjkzM2JkLTFkNzItNDE2ZS05YjdjLTc3MmQ1YzBhMTM1MyJ9.hP76B2PhggE1h-BgaKT1bdvswhCoXuzbgTHD0w_YMpE",
  "access_expires_at": "2026-10-30T13:43:19.376901747Z",
  "refresh_token": "Ti9NOQYIyTfYnyJI1sKfcokBpjgiLlPabDFWZnSqHZc",
  "refresh_expires_at": "2026-11-29T13:28:19.376286253Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba299663-c40e-4694-bd1d-c295132753e7",
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
  "id": "9490742e-2e26-4478-b062-edaccc0ff613",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:19.675403Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: a692955b-57cb-4aef-826c-cf035cb783b8) → **201**

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
  "session_id": "b67a9d17-b48f-48ce-9057-8b9eb7c7dc79",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MDAsImlhdCI6MTc5MzM2NjkwMCwianRpIjoiZDhiZjJjOWQtYTk4YS00ZWI2LWI1Y2MtMmRiODgzYjNmODcxIiwic2lkIjoiYjY3YTlkMTctYjQ4Zi00OGNlLTkwNTctOGI5ZWI3YzdkYzc5In0.NUpAZjNP9ijY2UXW-z0kwZS12-DIE6z1VafnQOXk7PI",
  "access_expires_at": "2026-10-30T13:43:20.312395195Z",
  "refresh_token": "9XaWH1V0-QdLcelg8lUzQ9K8-DPjEGKe4LQxAWdHNog",
  "refresh_expires_at": "2026-10-31T01:28:20.311787104Z",
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
  "session_id": "6a80e0fc-fe27-4d3e-b26a-91aaf94463ef",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MDAsImlhdCI6MTc5MzM2NjkwMCwianRpIjoiZWE0NTMwOWMtN2NjZi00OWJhLTg2ZTMtNjA3OWViODExNmVmIiwic2lkIjoiNmE4MGUwZmMtZmUyNy00ZDNlLWIyNmEtOTFhYWY5NDQ2M2VmIn0.XE_W7TlH1TYq-25T4DEg_hB8LxJ6bXUuf8Mgq0BL5po",
  "access_expires_at": "2026-10-30T13:43:20.900797642Z",
  "refresh_token": "8-drNIPms3PabMI8SZQuYfIRkJsMpA9qJAUKUa5gBow",
  "refresh_expires_at": "2026-10-31T01:28:20.90018858Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/53618ef2-da46-4540-acf2-146b346a7bb7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:28:19.982079Z",
      "actor": {
        "type": "CLIENT",
        "id": "af9ed659-0be5-4dbc-b243-5e71563043fd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "53618ef2-da46-4540-acf2-146b346a7bb7",
        "quote_id": "9490742e-2e26-4478-b062-edaccc0ff613",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a692955b-57cb-4aef-826c-cf035cb783b8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:28:19.984095Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "53618ef2-da46-4540-acf2-146b346a7bb7",
        "attempt_id": "5abc6020-64ee-4ad8-9d29-65152d313cab",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a692955b-57cb-4aef-826c-cf035cb783b8"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:28:19.991602Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "53618ef2-da46-4540-acf2-146b346a7bb7",
        "attempt_id": "5abc6020-64ee-4ad8-9d29-65152d313cab"
      },
      "correlation_id": "a692955b-57cb-4aef-826c-cf035cb783b8"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "5abc6020-64ee-4ad8-9d29-65152d313cab",
        "generation": 1,
        "started_at": "2026-10-30T13:28:19.983125Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:28:19.991602Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:28:19.984832Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/a692955b-57cb-4aef-826c-cf035cb783b8` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "53618ef2-da46-4540-acf2-146b346a7bb7:0",
      "order_id": "53618ef2-da46-4540-acf2-146b346a7bb7",
      "at": "2026-10-30T13:28:19.982079Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "53618ef2-da46-4540-acf2-146b346a7bb7:1",
      "order_id": "53618ef2-da46-4540-acf2-146b346a7bb7",
      "at": "2026-10-30T13:28:19.984095Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "53618ef2-da46-4540-acf2-146b346a7bb7:2",
      "order_id": "53618ef2-da46-4540-acf2-146b346a7bb7",
      "at": "2026-10-30T13:28:19.991602Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/5aafcb1d-5d93-4767-aad2-e9f92f1b714a` → **200**

```json
{
  "found": []
}
```

Done: request a692955b-57cb-4aef-826c-cf035cb783b8 — order 53618ef2-da46-4540-acf2-146b346a7bb7 found by its id.

`GET /api/rider/v1/orders/53618ef2-da46-4540-acf2-146b346a7bb7` → **200**

```json
{
  "id": "53618ef2-da46-4540-acf2-146b346a7bb7",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af9ed659-0be5-4dbc-b243-5e71563043fd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:28:19.981537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/53618ef2-da46-4540-acf2-146b346a7bb7/cancel` → **200**

```json
{
  "command_id": "f3fbc5ff-e8b4-4018-8b9a-8205c95024f3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "53618ef2-da46-4540-acf2-146b346a7bb7",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "af9ed659-0be5-4dbc-b243-5e71563043fd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:28:19.981537Z",
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
  "phone": "+380631857777",
  "device_ref": "sandbox-11459"
}
```

```json
{
  "challenge_id": "f4290b5f-5e67-4b21-8951-200c4add4ae9",
  "expires_at": "2026-10-30T13:33:22.763741489Z",
  "resend_available_at": "2026-10-30T13:28:23.763741489Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631857777` → **200**

```json
{
  "phone": "+380631857777",
  "audience": "CLIENT",
  "code": "187473",
  "sent_at": "2026-10-30T13:28:22.767495076Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4290b5f-5e67-4b21-8951-200c4add4ae9",
  "code": "187473",
  "device_ref": "sandbox-11459"
}
```

```json
{
  "session_id": "190188ce-eeef-497b-ad89-2d18bc132cd5",
  "subject": {
    "type": "CLIENT",
    "id": "0da596d8-0784-4f12-8c36-f7b846151e1a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGE1OTZkOC0wNzg0LTRmMTItOGMzNi1mN2I4NDYxNTFlMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODAzLCJpYXQiOjE3OTMzNjY5MDMsImp0aSI6IjJjNjgxODVmLWQ5ZTEtNGM3Yi1hYzFkLTI4OGMxODY4Yzk4OSIsInNpZCI6IjE5MDE4OGNlLWVlZWYtNDk3Yi1hZDg5LTJkMThiYzEzMmNkNSJ9.hemV0fXzATV8LJLGm_OLvnQGS7-aTBrms2S5yEstDiI",
  "access_expires_at": "2026-10-30T13:43:23.098443704Z",
  "refresh_token": "4P46XftRHqfmP69orcaKocGsmqRQqxx5bcPnsdhSd4o",
  "refresh_expires_at": "2026-11-29T13:28:23.097765623Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d012b5d7-e18e-4fdb-ba21-b9acf9b6cc85",
  "expires_at": "2026-10-30T13:33:25.396771468Z",
  "resend_available_at": "2026-10-30T13:28:26.396771468Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631857777` → **200**

```json
{
  "phone": "+380631857777",
  "audience": "CLIENT",
  "code": "730608",
  "sent_at": "2026-10-30T13:28:25.399421605Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "956ea300-5c73-43ff-bd25-b41353d19278",
  "challenge_id": "d012b5d7-e18e-4fdb-ba21-b9acf9b6cc85",
  "otp_code": "730608"
}
```

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9` → **200**

```json
{
  "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
  "state": "READY",
  "created_at": "2026-10-30T13:28:25.722748Z",
  "ready_at": "2026-10-30T13:28:34.322271Z",
  "expires_at": "2026-11-06T13:28:34.322271Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630103581",
  "device_ref": "sandbox-463"
}
```

```json
{
  "challenge_id": "82e4bc8b-7b16-4810-86e4-03aaea057a7c",
  "expires_at": "2026-10-30T13:33:35.351320499Z",
  "resend_available_at": "2026-10-30T13:28:36.351320499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630103581` → **200**

```json
{
  "phone": "+380630103581",
  "audience": "CLIENT",
  "code": "469285",
  "sent_at": "2026-10-30T13:28:35.354313304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82e4bc8b-7b16-4810-86e4-03aaea057a7c",
  "code": "469285",
  "device_ref": "sandbox-463"
}
```

```json
{
  "session_id": "a94f2f02-9668-4878-b50e-7da2210483be",
  "subject": {
    "type": "CLIENT",
    "id": "33737c85-90da-4e78-beca-c4e50ccd4b50"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzczN2M4NS05MGRhLTRlNzgtYmVjYS1jNGU1MGNjZDRiNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODE1LCJpYXQiOjE3OTMzNjY5MTUsImp0aSI6ImU5NDkxMzZmLTJlOTYtNDAyOS05NTI5LTQ4ZjRlOTY1Zjk5NiIsInNpZCI6ImE5NGYyZjAyLTk2NjgtNDg3OC1iNTBlLTdkYTIyMTA0ODNiZSJ9.3mi5kbc6oJeKu8a64kUa6QO2-baxxGEZd_tCZtcyqik",
  "access_expires_at": "2026-10-30T13:43:35.667606403Z",
  "refresh_token": "AGb-bDQdPLDs9houOdS511RrwmdxGZlQpbCvc7ctLD8",
  "refresh_expires_at": "2026-11-29T13:28:35.666996008Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/54a34c1a-ed24-4faa-8bac-ef2637d716c9/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "26094e93-3319-4b78-ab27-d975959c1bc1"
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
  "session_id": "87a44764-f4d2-4bdb-b692-7372908e3137",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MTYsImlhdCI6MTc5MzM2NjkxNiwianRpIjoiNTA5NmFiODAtOGFmNy00MDE3LTgwNjEtMzZhNzlkODhhZTAwIiwic2lkIjoiODdhNDQ3NjQtZjRkMi00YmRiLWI2OTItNzM3MjkwOGUzMTM3In0.B6lrWiHc95JUxaNuNlWsOW2VUZwBqcrAFDoGDp_PjY8",
  "access_expires_at": "2026-10-30T13:43:36.552533199Z",
  "refresh_token": "b6nvzjTQ6qWMsbZ6nm1BGejq1MwBl5qZ74nnY_0K4ig",
  "refresh_expires_at": "2026-10-31T01:28:36.551924849Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0da596d8-0784-4f12-8c36-f7b846151e1a",
  "session_id": "190188ce-eeef-497b-ad89-2d18bc132cd5",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/0da596d8-0784-4f12-8c36-f7b846151e1a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "54a34c1a-ed24-4faa-8bac-ef2637d716c9",
      "state": "READY",
      "created_at": "2026-10-30T13:28:25.722748Z",
      "ready_at": "2026-10-30T13:28:34.322271Z",
      "expires_at": "2026-11-06T13:28:34.322271Z",
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
  "device_ref": "sandbox-30174"
}
```

```json
{
  "challenge_id": "eb00d9eb-d34f-4cec-b982-5e82e9cedb49",
  "expires_at": "2026-10-30T13:33:37.456826463Z",
  "resend_available_at": "2026-10-30T13:28:38.456826463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "441010",
  "sent_at": "2026-10-30T13:28:37.459796804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb00d9eb-d34f-4cec-b982-5e82e9cedb49",
  "code": "441010",
  "device_ref": "sandbox-30174"
}
```

```json
{
  "session_id": "93c59c32-adb8-4e92-8f2d-b6226668a481",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzgxNywiaWF0IjoxNzkzMzY2OTE3LCJqdGkiOiI0ODJmZjUzZS0wZTQ2LTRkZTktOTQzZC0xOGU0YWMyYzJmN2UiLCJzaWQiOiI5M2M1OWMzMi1hZGI4LTRlOTItOGYyZC1iNjIyNjY2OGE0ODEifQ.G0JZ0dH7R6P7_3ft6H6AzTDW2XIe28uv0PEtXhl0_6w",
  "access_expires_at": "2026-10-30T13:43:37.776063349Z",
  "refresh_token": "KUkf73Kl8Lmx84nRrmbP5F7tIBEDoTm4CnNLX3ihUd4",
  "refresh_expires_at": "2026-11-29T13:28:37.775384633Z",
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
  "device_ref": "sandbox-8409"
}
```

```json
{
  "challenge_id": "f0a556c6-c779-406e-8f90-793a8acf25a1",
  "expires_at": "2026-10-30T13:33:38.353281272Z",
  "resend_available_at": "2026-10-30T13:28:39.353281272Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "568576",
  "sent_at": "2026-10-30T13:28:38.356314956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0a556c6-c779-406e-8f90-793a8acf25a1",
  "code": "568576",
  "device_ref": "sandbox-8409"
}
```

```json
{
  "session_id": "d81233a7-2385-482f-bad0-18fc72ce0f10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzgxOCwiaWF0IjoxNzkzMzY2OTE4LCJqdGkiOiIwZDA2MmJhMy1mN2MwLTRkM2QtYmMxNy1mYTU3MTNiOWJhYTEiLCJzaWQiOiJkODEyMzNhNy0yMzg1LTQ4MmYtYmFkMC0xOGZjNzJjZTBmMTAifQ.BRl48eXWQuV55iVbEmxsP-xBO4RI0sBMVEh21vjc9Mg",
  "access_expires_at": "2026-10-30T13:43:38.668930055Z",
  "refresh_token": "rp02ZHrXgavG3IYXJ5iZZvs7YxH3vQhsqu1w-9qhVDI",
  "refresh_expires_at": "2026-11-29T13:28:38.668340238Z",
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
  "command_id": "34045694-7734-45d4-a832-c39723196081",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:39Z",
    "sequence": 1793366919273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cb70e641-13b6-4a7d-8227-c69c6b9db86d",
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
  "last_heartbeat_at": "2026-10-30T13:28:39.292963Z",
  "last_location_at": "2026-10-30T13:28:39.292963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-752"
}
```

```json
{
  "challenge_id": "3b571f18-1ab7-47e2-88b8-8d7ace45af63",
  "expires_at": "2026-10-30T13:33:39.582247653Z",
  "resend_available_at": "2026-10-30T13:28:40.582247653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "039043",
  "sent_at": "2026-10-30T13:28:39.585029648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b571f18-1ab7-47e2-88b8-8d7ace45af63",
  "code": "039043",
  "device_ref": "sandbox-752"
}
```

```json
{
  "session_id": "e22e141f-0d9b-4186-ba4d-9b5665229a1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzgxOSwiaWF0IjoxNzkzMzY2OTE5LCJqdGkiOiI5MTQ5MGQ5Zi1jMTRmLTQ5ZGItYTVmZC0yNWI5Zjg5ZjkxN2EiLCJzaWQiOiJlMjJlMTQxZi0wZDliLTQxODYtYmE0ZC05YjU2NjUyMjlhMWQifQ.iWbzVxpOLHocf1XK7eoI81bzn5EdXusVq5CyUT22PAE",
  "access_expires_at": "2026-10-30T13:43:39.904891964Z",
  "refresh_token": "5xMNuAZVMABcU4JLMCp7lFiqZ4pABPKcIw-zvPi5h7M",
  "refresh_expires_at": "2026-11-29T13:28:39.904342853Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fe44097-ac94-4da9-9816-8a06f940f7f9",
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
  "last_heartbeat_at": "2026-10-30T13:24:38.471569Z",
  "last_location_at": "2026-10-30T13:24:38.471569Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fe44097-ac94-4da9-9816-8a06f940f7f9/handover` → **200**

```json
{
  "command_id": "6055ca2d-eb64-4556-81b1-46751f3b21a8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fe44097-ac94-4da9-9816-8a06f940f7f9",
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
  "last_heartbeat_at": "2026-10-30T13:24:38.471569Z",
  "last_location_at": "2026-10-30T13:24:38.471569Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fe44097-ac94-4da9-9816-8a06f940f7f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:40Z",
    "sequence": 1793366920817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fe44097-ac94-4da9-9816-8a06f940f7f9",
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
  "last_heartbeat_at": "2026-10-30T13:28:40.839023Z",
  "last_location_at": "2026-10-30T13:28:40.839023Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "d0f5ff47-c397-40f8-bfc1-df2dc64a53dc",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MjEsImlhdCI6MTc5MzM2NjkyMSwianRpIjoiOTUxMDJkMTUtNjdhYS00ODcyLTk0ZWEtYmQ0MTY1YzA1YzdkIiwic2lkIjoiZDBmNWZmNDctYzM5Ny00MGY4LWJmYzEtZGYyZGM2NGE1M2RjIn0.v3V32mx5Q7wx4qPwkbJKyHypTqvdSGNYt2nKWNAG5Qg",
  "access_expires_at": "2026-10-30T13:43:41.431364581Z",
  "refresh_token": "-iP0wgGH2NOQg3cfRbWEajK7OBZ_Ne0COC53ZJIPJC0",
  "refresh_expires_at": "2026-10-31T01:28:41.430769905Z",
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
  "session_id": "f94eb0d6-ae51-44c5-a224-f6d26a9cbe88",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MjIsImlhdCI6MTc5MzM2NjkyMiwianRpIjoiOTYwYmJiM2ItMmZmZC00OWRiLWEyMmItYWU0MmY1MGZjZGRiIiwic2lkIjoiZjk0ZWIwZDYtYWU1MS00NGM1LWEyMjQtZjZkMjZhOWNiZTg4In0.Mm9mX6p9tsPUC3Itazf0NVjZoIq0f4rFYOXAbj6yqM8",
  "access_expires_at": "2026-10-30T13:43:42.015644617Z",
  "refresh_token": "6EDrOUkqf987-MI6mI-RH85qLW-vdZxYCZnlanup3sY",
  "refresh_expires_at": "2026-10-31T01:28:42.015086349Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687731358",
  "device_ref": "sandbox-729"
}
```

```json
{
  "challenge_id": "68eff824-05b8-4367-955e-ad299443eb9a",
  "expires_at": "2026-10-30T13:33:42.313390173Z",
  "resend_available_at": "2026-10-30T13:28:43.313390173Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380687731358` → **200**

```json
{
  "phone": "+380687731358",
  "audience": "CLIENT",
  "code": "314858",
  "sent_at": "2026-10-30T13:28:42.316351827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68eff824-05b8-4367-955e-ad299443eb9a",
  "code": "314858",
  "device_ref": "sandbox-729"
}
```

```json
{
  "session_id": "24293961-1ca1-4881-a31c-f4204c6228ba",
  "subject": {
    "type": "CLIENT",
    "id": "4f79096f-0b9c-4ab5-8716-cc2d6985e6e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Zjc5MDk2Zi0wYjljLTRhYjUtODcxNi1jYzJkNjk4NWU2ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODIyLCJpYXQiOjE3OTMzNjY5MjIsImp0aSI6IjQ2ZDNjNzc3LTk3OWYtNDRkNS1iM2RlLTQwNmUyMzAwZTMwZCIsInNpZCI6IjI0MjkzOTYxLTFjYTEtNDg4MS1hMzFjLWY0MjA0YzYyMjhiYSJ9.0qLH58hBylZ_iT-W7KtIxOPlJHKA-JAaj_Tq_Ch8RYE",
  "access_expires_at": "2026-10-30T13:43:42.645069905Z",
  "refresh_token": "CPKs3JpMosFjj1Iks4aMEfBWobITA19zcgcAo_KEo0U",
  "refresh_expires_at": "2026-11-29T13:28:42.644480109Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f0f40ad-5a8d-46ee-89d1-0916d563a638",
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
  "id": "a1d4ce44-a23f-4393-b0ff-5dd6433eb7ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:42.951560Z",
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
  "command_id": "ccb1e788-f0ee-42f7-9902-2b8e0416484b",
  "quote_id": "a1d4ce44-a23f-4393-b0ff-5dd6433eb7ad",
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
  "id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f79096f-0b9c-4ab5-8716-cc2d6985e6e8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:28:43.273167Z",
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
    "id": "91e35042-c04e-45e4-8e08-7abc52edb07c",
    "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
    "expires_at": "2026-10-30T13:28:58.276014Z",
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

`POST /api/driver/v1/offers/91e35042-c04e-45e4-8e08-7abc52edb07c/reject` → **204**

```json
{
  "command_id": "de69e2cb-0beb-432d-8150-57e9fd1a4b43"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b669c985-4808-4a00-b682-9fb581cb57ed",
    "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
    "expires_at": "2026-10-30T13:28:58.895007Z",
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

`POST /api/driver/v1/offers/b669c985-4808-4a00-b682-9fb581cb57ed/accept` → **200**

```json
{
  "command_id": "96888f2b-6b5a-4d5d-a1bf-acb364933d86"
}
```

```json
{
  "id": "95b46a9c-912a-457a-a761-ca23497bfbe0",
  "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a1375d5c-a78c-4a15-8229-e14233973a9a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/20c38f89-80a4-495f-afdd-a1d541146c8f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:28:43.273613Z",
      "actor": {
        "type": "CLIENT",
        "id": "4f79096f-0b9c-4ab5-8716-cc2d6985e6e8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
        "quote_id": "a1d4ce44-a23f-4393-b0ff-5dd6433eb7ad",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7a157b0e-6c90-4e83-ad96-e233193d3cbf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:28:43.275387Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
        "attempt_id": "9eec7aaf-d0e5-4a58-be2c-1be9550fe81e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7a157b0e-6c90-4e83-ad96-e233193d3cbf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:28:43.278871Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "91e35042-c04e-45e4-8e08-7abc52edb07c",
        "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "7a157b0e-6c90-4e83-ad96-e233193d3cbf"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T13:28:43.893978Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "91e35042-c04e-45e4-8e08-7abc52edb07c",
        "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f"
      },
      "correlation_id": "978ea411-1cc1-4f59-a0b3-6f1a2973231e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 20c38f89-80a4-495f-afdd-a1d541146c8f — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/20c38f89-80a4-495f-afdd-a1d541146c8f` → **200**

```json
{
  "id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4f79096f-0b9c-4ab5-8716-cc2d6985e6e8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "95b46a9c-912a-457a-a761-ca23497bfbe0",
    "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a1375d5c-a78c-4a15-8229-e14233973a9a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:28:43.273167Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/20c38f89-80a4-495f-afdd-a1d541146c8f/cancel` → **200**

```json
{
  "command_id": "b8ff65fa-ef25-46f9-ba38-5fd05d315939",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4f79096f-0b9c-4ab5-8716-cc2d6985e6e8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "95b46a9c-912a-457a-a761-ca23497bfbe0",
    "order_id": "20c38f89-80a4-495f-afdd-a1d541146c8f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a1375d5c-a78c-4a15-8229-e14233973a9a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:28:43.273167Z",
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
  "session_id": "cb70e641-13b6-4a7d-8227-c69c6b9db86d",
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
  "last_heartbeat_at": "2026-10-30T13:28:39.292963Z",
  "last_location_at": "2026-10-30T13:28:39.292963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb70e641-13b6-4a7d-8227-c69c6b9db86d/close` → **200**

```json
{
  "command_id": "5a8676e2-885f-4756-b52e-fb39d1ca943d",
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
  "session_id": "4fe44097-ac94-4da9-9816-8a06f940f7f9",
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
  "last_heartbeat_at": "2026-10-30T13:28:40.839023Z",
  "last_location_at": "2026-10-30T13:28:40.839023Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4fe44097-ac94-4da9-9816-8a06f940f7f9/close` → **200**

```json
{
  "command_id": "50c7e5b0-2548-43a8-94e1-ffb0c3fd2854",
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

# Scenario: document-at-rest

## Oleh uploads a scan of his licence

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24184"
}
```

```json
{
  "challenge_id": "247f5ba5-36fb-44cd-8581-d7bef0ef35f2",
  "expires_at": "2026-10-30T13:33:46.742903315Z",
  "resend_available_at": "2026-10-30T13:28:47.742903315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "733379",
  "sent_at": "2026-10-30T13:28:46.745593613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "247f5ba5-36fb-44cd-8581-d7bef0ef35f2",
  "code": "733379",
  "device_ref": "sandbox-24184"
}
```

```json
{
  "session_id": "d1164c0d-1a34-4aef-ac95-2c8975b49152",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzgyNywiaWF0IjoxNzkzMzY2OTI3LCJqdGkiOiJkZDBlNDM1OC1jNTEwLTQ5NzItYjdmYi0yMTg5ZjU3ZDhjZmIiLCJzaWQiOiJkMTE2NGMwZC0xYTM0LTRhZWYtYWM5NS0yYzg5NzViNDkxNTIifQ.L46-ft1YBhYA3Ay9FGFBLDQgorX3uHRVJ9scpjURW_g",
  "access_expires_at": "2026-10-30T13:43:47.072775692Z",
  "refresh_token": "Ox1qCx-oeyzLd16UFcSKcFfnGvKLzusj5ry9q_CFpMk",
  "refresh_expires_at": "2026-11-29T13:28:47.07210329Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "77f3166b-bba7-436a-97f5-6c9a6d3ecd31",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "5005abf3-c620-463f-a875-ff762a5b1c9a",
  "upload_path": "/api/driver/v1/uploads/5005abf3-c620-463f-a875-ff762a5b1c9a",
  "expires_at": "2026-10-30T13:43:47.38264285Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/5005abf3-c620-463f-a875-ff762a5b1c9a` → **200**

```json
{
  "file_id": "5005abf3-c620-463f-a875-ff762a5b1c9a",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/5005abf3-c620-463f-a875-ff762a5b1c9a`, first bytes `425a46318ab61b1e` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/5005abf3-c620-463f-a875-ff762a5b1c9a` → **200**

SHA-256 uploaded `91db325042fcb83eff98ef49893905a45fd8be7b9ef4b28b57236b1017faa6af`, downloaded `91db325042fcb83eff98ef49893905a45fd8be7b9ef4b28b57236b1017faa6af`.

Done: document 5005abf3-c620-463f-a875-ff762a5b1c9a is encrypted on disk and downloads unchanged.

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
  "session_id": "0cd56b38-d912-42a3-ba43-98303f4fb33a",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MjgsImlhdCI6MTc5MzM2NjkyOCwianRpIjoiZTc0NTgyOTUtNWY3Mi00M2UwLWFlODEtYTdhM2M4OGY0NjU1Iiwic2lkIjoiMGNkNTZiMzgtZDkxMi00MmEzLWJhNDMtOTgzMDNmNGZiMzNhIn0.yc6cDE9KzzcXSpCx4JueXqx3TYwNkhKmkmuOkSu7IHA",
  "access_expires_at": "2026-10-30T13:43:48.090432348Z",
  "refresh_token": "LPV9WxH-3-QoJ8L-lK96iVVMWGMfVKhg2dN6E5UCx8Y",
  "refresh_expires_at": "2026-10-31T01:28:48.089800074Z",
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
  "command_id": "b6bec8b4-e933-41a4-8bc8-60ab1ecf4a21",
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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:28:48.704171Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "137dc89e-2594-4414-9e0b-cebfb5df2bc6",
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
  "correlation_id": "1d3ad274-1ca0-4758-8000-717c3f8861ad"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "810814aa-9c7a-4b27-bf1e-7c43620d13a7",
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
  "correlation_id": "5c8f02cd-34d4-4700-a374-64c516f27de7"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630149401",
  "device_ref": "sandbox-30039"
}
```

```json
{
  "challenge_id": "c79e215c-b698-46b7-ae60-a4d2d1a77bff",
  "expires_at": "2026-10-30T13:33:49.620859886Z",
  "resend_available_at": "2026-10-30T13:28:50.620859886Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630149401` → **200**

```json
{
  "phone": "+380630149401",
  "audience": "CLIENT",
  "code": "313839",
  "sent_at": "2026-10-30T13:28:49.624694141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c79e215c-b698-46b7-ae60-a4d2d1a77bff",
  "code": "313839",
  "device_ref": "sandbox-30039"
}
```

```json
{
  "session_id": "608cd1f6-7232-406b-9093-568a821b784f",
  "subject": {
    "type": "CLIENT",
    "id": "bdf4f395-27d0-4782-92b4-57a5fa8ef48e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGY0ZjM5NS0yN2QwLTQ3ODItOTJiNC01N2E1ZmE4ZWY0OGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODI5LCJpYXQiOjE3OTMzNjY5MjksImp0aSI6IjlkNjhkZDNhLWU3OTYtNGZmZi04MDg0LTFlOTFkNmJlNmViNSIsInNpZCI6IjYwOGNkMWY2LTcyMzItNDA2Yi05MDkzLTU2OGE4MjFiNzg0ZiJ9.v8ruZStIozFxZUtlIAFo3piplfpET_FINHm7f7eQB0U",
  "access_expires_at": "2026-10-30T13:43:49.949608725Z",
  "refresh_token": "u0mvhfyw_DZuouezgrjwRwx9trSNdj5Emvfxh_p4JYM",
  "refresh_expires_at": "2026-11-29T13:28:49.94894403Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77ce41ce-9c3b-4ef8-93a8-91c6bba31b14",
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
  "id": "081b43c4-1cb7-48c5-8eb4-7c0820507851",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:50.257288Z",
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
  "command_id": "1dfa8844-8b48-4a6b-9e48-4c2d4d29e807",
  "quote_id": "081b43c4-1cb7-48c5-8eb4-7c0820507851",
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
  "correlation_id": "0032e09d-80d5-4179-8a29-478e3a2e25fc"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cba21d51-e7df-42f1-ac92-b745e7d4d2e2",
  "quote_id": "081b43c4-1cb7-48c5-8eb4-7c0820507851",
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
  "id": "2c9b6b5a-5312-40b2-8687-822ab7457e8d",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bdf4f395-27d0-4782-92b4-57a5fa8ef48e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:28:50.878893Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2c9b6b5a-5312-40b2-8687-822ab7457e8d/cancel` → **200**

```json
{
  "command_id": "c695e2dd-5149-44ec-b92e-97592da1009f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2c9b6b5a-5312-40b2-8687-822ab7457e8d",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bdf4f395-27d0-4782-92b4-57a5fa8ef48e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:28:50.878893Z",
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
  "command_id": "92f7cb26-f80e-4b59-92ab-9cd22cd691ac",
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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:28:51.544176Z"
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
      "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:28:51.544176Z"
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
  "device_ref": "sandbox-28708"
}
```

```json
{
  "challenge_id": "1ea4d589-2722-42a4-b667-abdb0838a05d",
  "expires_at": "2026-10-30T13:33:52.460015404Z",
  "resend_available_at": "2026-10-30T13:28:53.460015404Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "179141",
  "sent_at": "2026-10-30T13:28:52.46351659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ea4d589-2722-42a4-b667-abdb0838a05d",
  "code": "179141",
  "device_ref": "sandbox-28708"
}
```

```json
{
  "session_id": "229cfe44-8109-49bf-be47-aa98638be344",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzgzMiwiaWF0IjoxNzkzMzY2OTMyLCJqdGkiOiJjYzEzZDBmMS1lOWVjLTQzNjUtYWNiNy05ZmY2MDQxNWE4MjIiLCJzaWQiOiIyMjljZmU0NC04MTA5LTQ5YmYtYmU0Ny1hYTk4NjM4YmUzNDQifQ.y5H84MuMqAOVfch96VRjOOxNTlGGvRB3vixutvuo0EA",
  "access_expires_at": "2026-10-30T13:43:52.790280042Z",
  "refresh_token": "Pj5zeyQpQxhs_2XJi6FC0M2TLhlaVPAW0hRe6XzdAw4",
  "refresh_expires_at": "2026-11-29T13:28:52.789700415Z",
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
  "command_id": "b47c46f5-90ca-45ce-94ed-3c250cce4848",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:53Z",
    "sequence": 1793366933403
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:28:53.422985Z",
  "last_location_at": "2026-10-30T13:28:53.422985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672960139",
  "device_ref": "sandbox-4162"
}
```

```json
{
  "challenge_id": "fe3a0d4b-4455-464b-84fc-308c39482f8d",
  "expires_at": "2026-10-30T13:33:53.72696486Z",
  "resend_available_at": "2026-10-30T13:28:54.72696486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672960139` → **200**

```json
{
  "phone": "+380672960139",
  "audience": "CLIENT",
  "code": "529189",
  "sent_at": "2026-10-30T13:28:53.730494068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe3a0d4b-4455-464b-84fc-308c39482f8d",
  "code": "529189",
  "device_ref": "sandbox-4162"
}
```

```json
{
  "session_id": "06a1d05d-41ae-49e7-a733-31fc179cda8b",
  "subject": {
    "type": "CLIENT",
    "id": "48baf56f-71c4-40eb-abd7-4dc57212d231"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OGJhZjU2Zi03MWM0LTQwZWItYWJkNy00ZGM1NzIxMmQyMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODM0LCJpYXQiOjE3OTMzNjY5MzQsImp0aSI6ImU0OTllNDMzLTViOGQtNDA1YS05OTg0LTdkZjExYzQ1OTZmNSIsInNpZCI6IjA2YTFkMDVkLTQxYWUtNDllNy1hNzMzLTMxZmMxNzljZGE4YiJ9.PyYqRa_0i6NwPjdkFrncAI_U9APNLLZnqwoO3hht8wE",
  "access_expires_at": "2026-10-30T13:43:54.045540812Z",
  "refresh_token": "BDX93FvO_AwEsUp5KSMQzWE_h_nGgpGuATkm8v75uTU",
  "refresh_expires_at": "2026-11-29T13:28:54.044960394Z",
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
  "command_id": "3a5a2165-427c-4f7b-b5b2-4b6a85d3cd30",
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
  "id": "30dc8bef-920c-41b5-9cc6-536e360d3c77",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:54.640251Z",
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
  "command_id": "22998f12-8f14-47b2-a7d4-6a987cb1ec5f",
  "platform": "ANDROID",
  "token": "sandbox-driver-586a918d-3e07-4a9c-81fd-4a78a215a4d5"
}
```

```json
{
  "id": "90b83aff-3331-4736-bf18-543093360695",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:28:54.96649Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "01ade71b-a2d1-40b5-bb98-a615c2f90602",
  "platform": "ANDROID",
  "token": "sandbox-rider-0f524af7-af85-4424-92d3-3066336bd41c"
}
```

```json
{
  "id": "c1ece5b3-0ab3-4b38-8b07-fa5b3dc9b8c7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:28:55.27839Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "98d8f5da-786d-4abd-88aa-2975cf41de9d",
  "quote_id": "30dc8bef-920c-41b5-9cc6-536e360d3c77",
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
  "id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "48baf56f-71c4-40eb-abd7-4dc57212d231",
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
  "created_at": "2026-10-30T13:28:55.594706Z",
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
    "id": "b621b625-1091-4270-a988-1a505d6d9c6b",
    "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
    "expires_at": "2026-10-30T13:29:10.598864Z",
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

`POST /api/driver/v1/offers/b621b625-1091-4270-a988-1a505d6d9c6b/accept` → **200**

```json
{
  "command_id": "70d3b3a8-71d9-4093-bf57-bbd58dfb3264"
}
```

```json
{
  "id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "817f4849-d508-4075-9c35-836b6947736e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:28:55.569Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:28:56.485652323Z",
    "token_suffix": "15a4d5",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
      "order_version": "2",
      "event_id": "6f9b7c65-f46e-45a3-9bd2-671a0180ecdc",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672960139&after=2026-10-30T13:28:55.569Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672960139&after=2026-10-30T13:28:55.569Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:28:57.49106497Z",
    "token_suffix": "6bd41c",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
      "order_version": "3",
      "event_id": "e275d219-bbad-4d9e-a92e-d1f4fe0f9488",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e0868b57-c7a7-4e08-81fd-136697cf7d47/messages` → **201**

```json
{
  "command_id": "a6302cb9-3015-4834-89f2-26adde3a951a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "941e830b-3e90-48f6-8ff6-fa4a25b8dc8e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:28:57.617275412Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "817f4849-d508-4075-9c35-836b6947736e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "assignment_id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
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

`POST /api/driver/v1/trips/817f4849-d508-4075-9c35-836b6947736e/messages` → **201**

```json
{
  "command_id": "4126713a-4bda-4451-b27a-7ad7f9421602",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "6652ae80-cd5c-4882-8e15-d5e3ac1e4bed",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:28:58.209293701Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e0868b57-c7a7-4e08-81fd-136697cf7d47/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/817f4849-d508-4075-9c35-836b6947736e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672960139"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:59Z",
    "sequence": 1793366939110
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:28:59.128602Z",
  "last_location_at": "2026-10-30T13:28:59.128602Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "817f4849-d508-4075-9c35-836b6947736e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "assignment_id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
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

`POST /api/driver/v1/trips/817f4849-d508-4075-9c35-836b6947736e/arrive` → **200**

```json
{
  "command_id": "950af5d9-6277-472f-a3a0-a71e8b99b2c6",
  "expected_version": 0
}
```

```json
{
  "id": "817f4849-d508-4075-9c35-836b6947736e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "assignment_id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
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
  "arrived_at": "2026-10-30T13:28:59.728443Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/817f4849-d508-4075-9c35-836b6947736e/start` → **200**

```json
{
  "command_id": "12a63dc6-b27b-42e7-bf71-5a1e291379bb",
  "expected_version": 1
}
```

```json
{
  "id": "817f4849-d508-4075-9c35-836b6947736e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "assignment_id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
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
  "arrived_at": "2026-10-30T13:28:59.728443Z",
  "started_at": "2026-10-30T13:29:00.037811Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:29:48Z",
    "sequence": 1793366988368
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:29:48.387715Z",
  "last_location_at": "2026-10-30T13:29:48.387715Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/817f4849-d508-4075-9c35-836b6947736e/complete` → **200**

```json
{
  "command_id": "831a1b15-a568-4216-85c3-eea2458898a4",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:29:48Z",
  "cash_received": true
}
```

```json
{
  "id": "817f4849-d508-4075-9c35-836b6947736e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "assignment_id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
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
  "arrived_at": "2026-10-30T13:28:59.728443Z",
  "started_at": "2026-10-30T13:29:00.037811Z",
  "completed_at": "2026-10-30T13:29:48.700521Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e0868b57-c7a7-4e08-81fd-136697cf7d47` → **200**

```json
{
  "id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "48baf56f-71c4-40eb-abd7-4dc57212d231",
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
    "id": "6043504f-3529-4406-b2e8-50e21c53a2b3",
    "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "817f4849-d508-4075-9c35-836b6947736e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:28:55.594706Z",
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
    "id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:28:55.594706Z",
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
    "id": "817f4849-d508-4075-9c35-836b6947736e",
    "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
    "order_short_number": 14,
    "created_at": "2026-10-30T13:28:56.218258Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e9c64f1e-2eb8-46f7-98fb-1f9391c3358c",
    "order_id": "056fa40e-bab8-432b-bf52-17de83309a32",
    "order_short_number": 9,
    "created_at": "2026-10-30T13:25:58.30481Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "820f74c8-d411-4940-be4a-1ef8e3aa4cbe",
    "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
    "order_short_number": 4,
    "created_at": "2026-10-30T13:24:28.876682Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6793b24c-4344-4552-bdfc-fb08024606aa",
    "order_id": "6c4f2107-a56e-4a8f-a2da-54ef28c2166a",
    "order_short_number": 2,
    "created_at": "2026-10-30T13:20:39.727674Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "89f5c186-ffbc-4e08-a92e-e2cd36e4e47f",
    "order_id": "6c038bf9-0377-4a56-98aa-5e061cf394ab",
    "order_short_number": 1,
    "created_at": "2026-10-30T13:20:29.409309Z",
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

`GET /api/rider/v1/orders/e0868b57-c7a7-4e08-81fd-136697cf7d47/tip` → **200**

```json
{
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
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
  "available_until": "2026-10-31T13:29:48.700521Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e0868b57-c7a7-4e08-81fd-136697cf7d47/tip` → **201**

```json
{
  "command_id": "6b91630d-0200-48c8-ab12-97f09748cdf5",
  "amount_minor": 1100
}
```

```json
{
  "id": "113194b2-627a-405e-8574-5bc9f9b81b9e",
  "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:29:53.858932Z"
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
  "session_id": "a8a8350b-fa0b-4e32-8b0f-62f04c3769c5",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTQsImlhdCI6MTc5MzM2Njk5NCwianRpIjoiMWZhNzQ3YTAtN2ZhMS00YWExLTg2MmUtZTU2MzU5ODVlNTIyIiwic2lkIjoiYThhODM1MGItZmEwYi00ZTMyLThiMGYtNjJmMDRjMzc2OWM1In0.L7gWzrR7aOemSHwx5BSyb0EOZRK3mAngSFfbVxxzlQo",
  "access_expires_at": "2026-10-30T13:44:54.461337792Z",
  "refresh_token": "mOSoOBw7k4dPJQNoMB513foeWGzjT0VgB6x8LgEstK0",
  "refresh_expires_at": "2026-10-31T01:29:54.460308118Z",
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
      "CASH": 11,
      "CARD": 2
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
  "generated_at": "2026-10-30T13:29:54.769884074Z"
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
  "generated_at": "2026-10-30T13:29:55.089791959Z"
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
  "session_id": "da2448cf-2a98-4fa9-b583-7d3dd71fcdf5",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTUsImlhdCI6MTc5MzM2Njk5NSwianRpIjoiMjQ3ZjhlY2QtMjQ2Mi00YzNlLThmMmYtNGUzZDZiMDZmNjI2Iiwic2lkIjoiZGEyNDQ4Y2YtMmE5OC00ZmE5LWI1ODMtN2QzZGQ3MWZjZGY1In0.4Yg6ja8uBOqWCTbJc_WEt09msC1h-KS0zlc4lMoleNA",
  "access_expires_at": "2026-10-30T13:44:55.700507893Z",
  "refresh_token": "r12p3nTuJ_pSUyrK4GQ3EK2FPzm64DU8SJFcSRfsRck",
  "refresh_expires_at": "2026-10-31T01:29:55.699406897Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e0868b57-c7a7-4e08-81fd-136697cf7d47/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:28:55.595337Z",
      "actor": {
        "type": "CLIENT",
        "id": "48baf56f-71c4-40eb-abd7-4dc57212d231",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
        "quote_id": "30dc8bef-920c-41b5-9cc6-536e360d3c77",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4f09b418-0425-45c6-97a7-ef05f26adcba"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:28:55.597724Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
        "attempt_id": "2cc528f7-72cd-470f-b448-47ade4fb8d01",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4f09b418-0425-45c6-97a7-ef05f26adcba"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:28:55.60111Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b621b625-1091-4270-a988-1a505d6d9c6b",
        "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "4f09b418-0425-45c6-97a7-ef05f26adcba"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:28:56.220186Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b621b625-1091-4270-a988-1a505d6d9c6b",
        "order_id": "e0868b57-c7a7-4e08-81fd-136697cf7d47",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6043504f-3529-4406-b2e8-50e21c53a2b3"
      },
      "correlation_id": "6516ead8-3da7-4011-b828-251cac22b654"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:29:56.307857521Z",
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
      "last_location_at": "2026-10-30T13:29:48.387715Z",
      "order_id": null
    }
  ]
}
```

Done: order e0868b57-c7a7-4e08-81fd-136697cf7d47.

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
  "session_id": "45f38586-b7d1-4e1b-9c0a-aca201bbb476",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTYsImlhdCI6MTc5MzM2Njk5NiwianRpIjoiYWNkMGMwMmQtMTI1MC00MzJhLWJhOGQtMjY0OThmY2ZhNDliIiwic2lkIjoiNDVmMzg1ODYtYjdkMS00ZTFiLTljMGEtYWNhMjAxYmJiNDc2In0.U9oF84BMkwAh2Ub9bEUmpcGgv2Efva_YwMNNnWiUadQ",
  "access_expires_at": "2026-10-30T13:44:56.920326031Z",
  "refresh_token": "2QDjxlOPSeIR1JJFip9xLntaxyj5G3RKvMunlzOv38M",
  "refresh_expires_at": "2026-10-31T01:29:56.919748498Z",
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
  "command_id": "a2f318a6-da61-49e3-a065-38d4f997eb38",
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
  "timestamp": "2026-10-30T13:29:57.000+0000",
  "channel": {
    "id": "1730052000.417724638",
    "linkedid": "1730052000.417724638",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677588456"
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
  "timestamp": "2026-10-30T13:29:57.000+0000",
  "channel": {
    "id": "1730052000.417724638",
    "linkedid": "1730052000.417724638",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677588456"
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
  "session_id": "edc5f1f6-b02c-4082-933c-4504e6f7d92a",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTgsImlhdCI6MTc5MzM2Njk5OCwianRpIjoiY2NiZTk4NzUtOWFlNy00NjE1LTlkOTktODJmYmFjZmU4NWY1Iiwic2lkIjoiZWRjNWYxZjYtYjAyYy00MDgyLTkzM2MtNDUwNGU2ZjdkOTJhIn0.f465ySF1lxdSsVQ3geWY0TjZ104JRRhBECfxMMjN54o",
  "access_expires_at": "2026-10-30T13:44:58.168455153Z",
  "refresh_token": "dZ-K52S5QDqqf1VAlokIVF6g0KUX9RkvqR6P_r-v4dw",
  "refresh_expires_at": "2026-10-31T01:29:58.167761955Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "62663b3a-8620-416f-b518-68f79cb0d196",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677588456",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:29:57Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/62663b3a-8620-416f-b518-68f79cb0d196/answer` → **200**

```json
{
  "command_id": "23cea1a0-d183-4903-b5ab-8a17947a8bad"
}
```

```json
{
  "id": "62663b3a-8620-416f-b518-68f79cb0d196",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677588456",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "order_ids": [],
  "started_at": "2026-10-30T13:29:57Z",
  "answered_at": "2026-10-30T13:29:58.79839Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.417724638",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "191c6a80-63d9-441d-be4f-08b17f773f05",
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
  "id": "0ad7dfb0-7843-4a00-ae24-d7f363fa8ee8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:59.133389Z",
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
  "command_id": "c2d09fa8-fcfd-44b1-ba90-60652cf5351e",
  "quote_id": "0ad7dfb0-7843-4a00-ae24-d7f363fa8ee8",
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
    "phone": "+380677588456"
  },
  "call_id": "62663b3a-8620-416f-b518-68f79cb0d196"
}
```

```json
{
  "id": "07276acd-d258-484b-921d-4c7947756226",
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
  "created_at": "2026-10-30T13:29:59.457409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677588456"
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
    "id": "1730052000.417724638",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "62663b3a-8620-416f-b518-68f79cb0d196",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677588456",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [
        "07276acd-d258-484b-921d-4c7947756226"
      ],
      "started_at": "2026-10-30T13:29:57Z",
      "answered_at": "2026-10-30T13:29:58.79839Z",
      "ended_at": "2026-10-30T13:29:59.803956Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "650cb52a-6336-4a08-b77d-ebcbb226190a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679343075",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:22.066007Z",
      "answered_at": "2026-10-30T13:24:22.407951Z",
      "ended_at": "2026-10-30T13:24:22.73765Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:24:24.276458Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/07276acd-d258-484b-921d-4c7947756226` → **200**

```json
{
  "id": "07276acd-d258-484b-921d-4c7947756226",
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
  "created_at": "2026-10-30T13:29:59.457409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677588456"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/07276acd-d258-484b-921d-4c7947756226` → **200**

```json
{
  "id": "07276acd-d258-484b-921d-4c7947756226",
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
  "created_at": "2026-10-30T13:29:59.457409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677588456"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/07276acd-d258-484b-921d-4c7947756226/cancel` → **200**

```json
{
  "command_id": "fe328065-8c5e-46d7-a07f-23cc5843919b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "07276acd-d258-484b-921d-4c7947756226",
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
  "created_at": "2026-10-30T13:29:59.457409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677588456"
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

Done: call 62663b3a-8620-416f-b518-68f79cb0d196 with order 07276acd-d258-484b-921d-4c7947756226.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2055"
}
```

```json
{
  "challenge_id": "ab4467de-703d-4dfe-92f6-e54c5c484c28",
  "expires_at": "2026-10-30T13:35:01.115209431Z",
  "resend_available_at": "2026-10-30T13:30:02.115209431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "568133",
  "sent_at": "2026-10-30T13:30:01.118364935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab4467de-703d-4dfe-92f6-e54c5c484c28",
  "code": "568133",
  "device_ref": "sandbox-2055"
}
```

```json
{
  "session_id": "e8b8c009-93ae-4eb5-a0fc-838e390b006b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzkwMSwiaWF0IjoxNzkzMzY3MDAxLCJqdGkiOiI3MzlhNDEzZC05MzA5LTQ1MmQtYmUwNC0zYzMxMWQxOTIwMzEiLCJzaWQiOiJlOGI4YzAwOS05M2FlLTRlYjUtYTBmYy04MzhlMzkwYjAwNmIifQ.VOOt4x-XKxKah3KlME9H1q6nSlC1Xa6ouK6dSMpdnpc",
  "access_expires_at": "2026-10-30T13:45:01.44306612Z",
  "refresh_token": "N6H52RnkXZ4oalka3iNhvBvx62PW466Xv2dE41uvI6s",
  "refresh_expires_at": "2026-11-29T13:30:01.44240977Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:29:48.387715Z",
  "last_location_at": "2026-10-30T13:29:48.387715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/handover` → **200**

```json
{
  "command_id": "61d8a120-e851-488a-a6c7-cb1f0b1351d8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:29:48.387715Z",
  "last_location_at": "2026-10-30T13:29:48.387715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:27Z",
    "sequence": 1793367087370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:31:27.390112Z",
  "last_location_at": "2026-10-30T13:31:27.390112Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668813017",
  "device_ref": "sandbox-17712"
}
```

```json
{
  "challenge_id": "dfba1f1a-a11f-4d56-bf86-508b87c66659",
  "expires_at": "2026-10-30T13:36:27.693949702Z",
  "resend_available_at": "2026-10-30T13:31:28.693949702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668813017` → **200**

```json
{
  "phone": "+380668813017",
  "audience": "CLIENT",
  "code": "593066",
  "sent_at": "2026-10-30T13:31:27.697598044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfba1f1a-a11f-4d56-bf86-508b87c66659",
  "code": "593066",
  "device_ref": "sandbox-17712"
}
```

```json
{
  "session_id": "e80f3763-320a-48f1-9130-befb021cbdce",
  "subject": {
    "type": "CLIENT",
    "id": "6c7de05f-429a-41c7-a1ae-4e4370a4484d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzdkZTA1Zi00MjlhLTQxYzctYTFhZS00ZTQzNzBhNDQ4NGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3OTg4LCJpYXQiOjE3OTMzNjcwODgsImp0aSI6IjUwOTI2MGMyLWY0Y2QtNDRkYS04MzA3LWIzMTJmYTU1MzA0MCIsInNpZCI6ImU4MGYzNzYzLTMyMGEtNDhmMS05MTMwLWJlZmIwMjFjYmRjZSJ9.KDvQB8kc-gOFK5Nn18CWsXR62lrI_y9FzzMasZa5KAE",
  "access_expires_at": "2026-10-30T13:46:28.019640272Z",
  "refresh_token": "GwJfcNpCIRAy-gbTm6ulVG7LEC9veVc8Z7Z2Qlo9ktk",
  "refresh_expires_at": "2026-11-29T13:31:28.019000312Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a2cd6ae8-d4a9-4ae9-a91e-56be3714f013",
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
  "id": "d110ebf7-f8c9-4d04-8bdf-9cd2191c598b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:36:28.317715Z",
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
  "command_id": "024fa947-f9fc-4f4a-ac85-f227d451bc93",
  "quote_id": "d110ebf7-f8c9-4d04-8bdf-9cd2191c598b",
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
  "id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c7de05f-429a-41c7-a1ae-4e4370a4484d",
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
  "created_at": "2026-10-30T13:31:28.627765Z",
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
    "id": "2e131d37-6587-4a92-be5b-cad963e9172f",
    "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
    "expires_at": "2026-10-30T13:31:43.631182Z",
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

`POST /api/driver/v1/offers/2e131d37-6587-4a92-be5b-cad963e9172f/accept` → **200**

```json
{
  "command_id": "574d1a2e-e9c4-4bc9-a28b-9918c1310f08"
}
```

```json
{
  "id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b",
  "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7e123aef-bf96-4489-beb6-c3ad110f3723",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7e123aef-bf96-4489-beb6-c3ad110f3723",
  "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
  "assignment_id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b",
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

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:29Z",
    "sequence": 1793367089886
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:31:29.904169Z",
  "last_location_at": "2026-10-30T13:31:29.904169Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7e123aef-bf96-4489-beb6-c3ad110f3723/arrive` → **200**

```json
{
  "command_id": "84188d78-5e3f-4b08-aea3-df18fbde4c9a",
  "expected_version": 0
}
```

```json
{
  "id": "7e123aef-bf96-4489-beb6-c3ad110f3723",
  "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
  "assignment_id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b",
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
  "arrived_at": "2026-10-30T13:31:30.221971Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7e123aef-bf96-4489-beb6-c3ad110f3723/start` → **200**

```json
{
  "command_id": "61c6758b-e6f7-44e5-bbce-f1b4ea7411d4",
  "expected_version": 1
}
```

```json
{
  "id": "7e123aef-bf96-4489-beb6-c3ad110f3723",
  "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
  "assignment_id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b",
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
  "arrived_at": "2026-10-30T13:31:30.221971Z",
  "started_at": "2026-10-30T13:31:30.544467Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:32:29Z",
    "sequence": 1793367149875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:32:29.893985Z",
  "last_location_at": "2026-10-30T13:32:29.893985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13359"
}
```

```json
{
  "challenge_id": "58331926-1654-4110-92a8-3efe03485fb5",
  "expires_at": "2026-10-30T13:37:30.189436302Z",
  "resend_available_at": "2026-10-30T13:32:31.189436302Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "286767",
  "sent_at": "2026-10-30T13:32:30.192127896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58331926-1654-4110-92a8-3efe03485fb5",
  "code": "286767",
  "device_ref": "sandbox-13359"
}
```

```json
{
  "session_id": "adceeacb-4816-4db5-a1f4-0372007e5d70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODA1MCwiaWF0IjoxNzkzMzY3MTUwLCJqdGkiOiI1ZGNhMDViYS0xYTJmLTQ2YzUtYTEwNS02OWQ3ZTE5ZjEzMzYiLCJzaWQiOiJhZGNlZWFjYi00ODE2LTRkYjUtYTFmNC0wMzcyMDA3ZTVkNzAifQ.wsP8A5cZbfgqgMmr8HCza_gqXJIO_OajbMDGqFxlmQQ",
  "access_expires_at": "2026-10-30T13:47:30.521686573Z",
  "refresh_token": "z241mLbwlKmGXYw0nHuduidUpKdorDWAX-GjzPfOdxg",
  "refresh_expires_at": "2026-11-29T13:32:30.520663311Z",
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
  "command_id": "3f03f78a-d542-473f-8afd-ca73e551f2b8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:32:31Z",
    "sequence": 1793367151136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8df1a27d-8395-4eb0-b8a0-2b2fe89858b6",
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
  "last_heartbeat_at": "2026-10-30T13:32:31.15491Z",
  "last_location_at": "2026-10-30T13:32:31.15491Z",
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
  "session_id": "ed766237-3190-4875-b1a7-cd55d38f8acc",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwNTEsImlhdCI6MTc5MzM2NzE1MSwianRpIjoiMjlhNGUwNmItMDViMS00NWNlLTlmY2QtNjRkYmU5MzRlYzJjIiwic2lkIjoiZWQ3NjYyMzctMzE5MC00ODc1LWIxYTctY2Q1NWQzOGY4YWNjIn0.KVIu2LrF4z1O2vJW9OlpqSXljJOeg2CLjkVRLdCzx_Y",
  "access_expires_at": "2026-10-30T13:47:31.744994804Z",
  "refresh_token": "KQfpZqGFEgjJ7S7ZYk11Ukz3218tLxKNGjneEP2DG-g",
  "refresh_expires_at": "2026-10-31T01:32:31.744413844Z",
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
  "session_id": "bbc26819-3728-4fe9-8e72-84f910a2235d",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwNTIsImlhdCI6MTc5MzM2NzE1MiwianRpIjoiYzZiZGUyZmQtNDM2MS00OGYxLWFmYTctMjBhNTlhNDZmYTRhIiwic2lkIjoiYmJjMjY4MTktMzcyOC00ZmU5LThlNzItODRmOTEwYTIyMzVkIn0.AgvDFl8OPvVPSy23ctmf_e4sPtE_JCetegFje-6ezUA",
  "access_expires_at": "2026-10-30T13:47:32.340539769Z",
  "refresh_token": "y_SPfpfrHkKZxSE8QGZ9Mx4EZ3quKz5zMmcJrf08Uyk",
  "refresh_expires_at": "2026-10-31T01:32:32.339868412Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1b0a8754-859d-4b7d-ac1b-1a34c38ac915` → **200**

```json
{
  "id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6c7de05f-429a-41c7-a1ae-4e4370a4484d",
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
    "id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b",
    "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7e123aef-bf96-4489-beb6-c3ad110f3723",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:31:28.627765Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1b0a8754-859d-4b7d-ac1b-1a34c38ac915/interrupt` → **200**

```json
{
  "command_id": "96347ec5-b049-418d-821c-928c66443efa",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6c7de05f-429a-41c7-a1ae-4e4370a4484d",
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
      "id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b",
      "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "7e123aef-bf96-4489-beb6-c3ad110f3723",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:31:28.627765Z",
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
    "id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6c7de05f-429a-41c7-a1ae-4e4370a4484d",
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
    "id": "7bedcd7a-3f40-48cd-ac47-5498183a965d",
    "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
    "expires_at": "2026-10-30T13:32:47.967896Z",
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

`POST /api/driver/v1/offers/7bedcd7a-3f40-48cd-ac47-5498183a965d/accept` → **200**

```json
{
  "command_id": "234b477a-62b0-4cfd-aafe-78dc7f9392ed"
}
```

```json
{
  "id": "5865b672-7304-4a89-b53d-2930c5180e4f",
  "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0426f40a-bcf0-4d7a-8f39-a148c7d14c84",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0426f40a-bcf0-4d7a-8f39-a148c7d14c84",
  "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
  "assignment_id": "5865b672-7304-4a89-b53d-2930c5180e4f",
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
  "session_id": "8df1a27d-8395-4eb0-b8a0-2b2fe89858b6",
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
  "last_heartbeat_at": "2026-10-30T13:32:31.15491Z",
  "last_location_at": "2026-10-30T13:32:31.15491Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8df1a27d-8395-4eb0-b8a0-2b2fe89858b6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:32:34Z",
    "sequence": 1793367154514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8df1a27d-8395-4eb0-b8a0-2b2fe89858b6",
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
  "last_heartbeat_at": "2026-10-30T13:32:34.533535Z",
  "last_location_at": "2026-10-30T13:32:34.533535Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0426f40a-bcf0-4d7a-8f39-a148c7d14c84/arrive` → **200**

```json
{
  "command_id": "0965ae20-ec83-4717-92e2-1cc75df0cdd2",
  "expected_version": 0
}
```

```json
{
  "id": "0426f40a-bcf0-4d7a-8f39-a148c7d14c84",
  "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
  "assignment_id": "5865b672-7304-4a89-b53d-2930c5180e4f",
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
  "arrived_at": "2026-10-30T13:32:34.847855Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0426f40a-bcf0-4d7a-8f39-a148c7d14c84/start` → **200**

```json
{
  "command_id": "8949b7c9-6ed5-47a2-aece-3a486c52b1b2",
  "expected_version": 1
}
```

```json
{
  "id": "0426f40a-bcf0-4d7a-8f39-a148c7d14c84",
  "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
  "assignment_id": "5865b672-7304-4a89-b53d-2930c5180e4f",
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
  "arrived_at": "2026-10-30T13:32:34.847855Z",
  "started_at": "2026-10-30T13:32:35.162132Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0426f40a-bcf0-4d7a-8f39-a148c7d14c84/complete` → **200**

```json
{
  "command_id": "d97e0c4a-b58c-4cfc-962c-d81d2ee1cd10",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:32:35Z"
}
```

```json
{
  "id": "0426f40a-bcf0-4d7a-8f39-a148c7d14c84",
  "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
  "assignment_id": "5865b672-7304-4a89-b53d-2930c5180e4f",
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
  "arrived_at": "2026-10-30T13:32:34.847855Z",
  "started_at": "2026-10-30T13:32:35.162132Z",
  "completed_at": "2026-10-30T13:32:35.471718Z",
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
    "id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:32:32.956868Z",
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
    "id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:31:28.627765Z",
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

`GET /api/operator/v1/orders/1b0a8754-859d-4b7d-ac1b-1a34c38ac915/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:31:28.628342Z",
      "actor": {
        "type": "CLIENT",
        "id": "6c7de05f-429a-41c7-a1ae-4e4370a4484d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
        "quote_id": "d110ebf7-f8c9-4d04-8bdf-9cd2191c598b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b20e829c-5d2f-4b80-af5c-61d531009479"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:31:28.630404Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
        "attempt_id": "fea709f2-28a7-4505-8d3f-539c9233b20a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b20e829c-5d2f-4b80-af5c-61d531009479"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:31:28.637694Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2e131d37-6587-4a92-be5b-cad963e9172f",
        "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b20e829c-5d2f-4b80-af5c-61d531009479"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:31:29.254737Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2e131d37-6587-4a92-be5b-cad963e9172f",
        "order_id": "1b0a8754-859d-4b7d-ac1b-1a34c38ac915",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5d02983c-defd-4fc4-97ef-a3f26ed8286b"
      },
      "correlation_id": "41d41854-8f65-4106-98a4-46588219f9b3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/ce1a1cb8-1d3f-4032-b10d-23493d24f421/tip` → **200**

```json
{
  "order_id": "ce1a1cb8-1d3f-4032-b10d-23493d24f421",
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
  "available_until": "2026-10-31T13:32:35.471718Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/ce1a1cb8-1d3f-4032-b10d-23493d24f421/tip` → **409**

```json
{
  "command_id": "e4ec25ea-cb68-4c36-ab19-b6885e1654af",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/ce1a1cb8-1d3f-4032-b10d-23493d24f421/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3c304cc6-8249-478d-bf32-c3f09b8cce41"
}
```

Done: interrupted 1b0a8754-859d-4b7d-ac1b-1a34c38ac915, follow-up ce1a1cb8-1d3f-4032-b10d-23493d24f421.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559d188b-c3cb-44da-9898-d8ce15bab184",
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
  "last_heartbeat_at": "2026-10-30T13:32:29.893985Z",
  "last_location_at": "2026-10-30T13:32:29.893985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/559d188b-c3cb-44da-9898-d8ce15bab184/close` → **200**

```json
{
  "command_id": "02237824-9471-4ba1-89ef-5fae0e3d69fa",
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
  "session_id": "8df1a27d-8395-4eb0-b8a0-2b2fe89858b6",
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
  "last_heartbeat_at": "2026-10-30T13:32:34.533535Z",
  "last_location_at": "2026-10-30T13:32:34.533535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8df1a27d-8395-4eb0-b8a0-2b2fe89858b6/close` → **200**

```json
{
  "command_id": "d864051e-82fd-4a08-8768-ba6791b68636",
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
  "session_id": "e0d2ad95-08ab-4276-b040-247fed7ef9be",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwNjEsImlhdCI6MTc5MzM2NzE2MSwianRpIjoiODEzYjdlOTItYTM4ZS00ZmU4LWJlMWItYTQ0Y2VkYTg4OTc4Iiwic2lkIjoiZTBkMmFkOTUtMDhhYi00Mjc2LWIwNDAtMjQ3ZmVkN2VmOWJlIn0.KGtui-kbsw2Lb1aoKLlIvuJMvNhVc4sX1StL2eUgsKc",
  "access_expires_at": "2026-10-30T13:47:41.826316352Z",
  "refresh_token": "hw4_8p2_OxDkdgl0muplREyi12JAfbClPtXce4hSFcM",
  "refresh_expires_at": "2026-10-31T01:32:41.825702912Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6bb677c9-601d-41da-af7f-376ad4400b15",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:42Z"
}
```

```json
{
  "id": "d5563a44-dcfa-44a2-bfd9-a27d4028614e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:42Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d5563a44-dcfa-44a2-bfd9-a27d4028614e/publish` → **200**

```json
{
  "command_id": "1114a351-c8f3-4a7c-97e7-6ee551f5f23b",
  "expected_version": 0
}
```

```json
{
  "id": "d5563a44-dcfa-44a2-bfd9-a27d4028614e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:42.454019Z",
  "published_at": "2026-10-30T13:32:42.454019Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "d5563a44-dcfa-44a2-bfd9-a27d4028614e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:32:42.454019Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631348597",
  "device_ref": "sandbox-2014"
}
```

```json
{
  "challenge_id": "0554346e-725c-4462-b437-259905198c12",
  "expires_at": "2026-10-30T13:37:43.041971519Z",
  "resend_available_at": "2026-10-30T13:32:44.041971519Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631348597` → **200**

```json
{
  "phone": "+380631348597",
  "audience": "CLIENT",
  "code": "538803",
  "sent_at": "2026-10-30T13:32:43.044598831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0554346e-725c-4462-b437-259905198c12",
  "code": "538803",
  "device_ref": "sandbox-2014"
}
```

```json
{
  "session_id": "d08485ee-43ec-42a8-9c1a-0803c21cb554",
  "subject": {
    "type": "CLIENT",
    "id": "647162a3-42bd-40a3-9454-781059d51674"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDcxNjJhMy00MmJkLTQwYTMtOTQ1NC03ODEwNTlkNTE2NzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MDYzLCJpYXQiOjE3OTMzNjcxNjMsImp0aSI6IjkzMjZlYjkwLTk2OGMtNDdmNC1iOWZhLWViZGUzODgyNjRhYSIsInNpZCI6ImQwODQ4NWVlLTQzZWMtNDJhOC05YzFhLTA4MDNjMjFjYjU1NCJ9.3rt-xGW5_kseBQAi5lOlUT-F4iMot38HfUtEDIhxsLU",
  "access_expires_at": "2026-10-30T13:47:43.359507702Z",
  "refresh_token": "sP_DK2CqUp3mEcLreO6sMwrvrLF4afYtArxBevmI3hc",
  "refresh_expires_at": "2026-11-29T13:32:43.358717168Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "d5563a44-dcfa-44a2-bfd9-a27d4028614e",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:32:42.454019Z",
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
  "command_id": "5b273964-7d12-4261-a41e-768b70200079",
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
  "id": "4c2287c4-2906-4638-8e49-65ee06c0c5ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:37:43.948488Z",
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
  "command_id": "0e753d9e-5193-4b3f-8381-edb1d53744e0",
  "quote_id": "4c2287c4-2906-4638-8e49-65ee06c0c5ed",
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
  "correlation_id": "8486c6a2-e26b-4157-a97a-d5b347e603e2"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ca18f399-36b2-42c5-b7ec-9463993d7d60",
  "version_id": "d5563a44-dcfa-44a2-bfd9-a27d4028614e",
  "language": "uk"
}
```

```json
{
  "version_id": "d5563a44-dcfa-44a2-bfd9-a27d4028614e",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:32:44.562702Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0538926-83d6-4ac6-83d7-5955f52c904f",
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
  "id": "f475fcd5-3da3-4a47-99a0-0ef4a70a917a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:37:44.857492Z",
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
  "command_id": "3053682f-ab83-4f4f-b1b0-540893ea56a9",
  "quote_id": "f475fcd5-3da3-4a47-99a0-0ef4a70a917a",
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
  "id": "84c88be6-8b48-435c-8411-6a8a32440ed3",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "647162a3-42bd-40a3-9454-781059d51674",
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
  "created_at": "2026-10-30T13:32:45.15712Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/84c88be6-8b48-435c-8411-6a8a32440ed3` → **200**

```json
{
  "id": "84c88be6-8b48-435c-8411-6a8a32440ed3",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "647162a3-42bd-40a3-9454-781059d51674",
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
  "created_at": "2026-10-30T13:32:45.15712Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/84c88be6-8b48-435c-8411-6a8a32440ed3/cancel` → **200**

```json
{
  "command_id": "9961b42e-a2a7-4360-8320-3deb3a1f1fd8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "84c88be6-8b48-435c-8411-6a8a32440ed3",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "647162a3-42bd-40a3-9454-781059d51674",
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
  "created_at": "2026-10-30T13:32:45.15712Z",
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

`POST /api/admin/v1/legal-documents/d5563a44-dcfa-44a2-bfd9-a27d4028614e` → **409**

```json
{
  "command_id": "2ea43eb4-e29e-4bb7-b65e-75bdfde5e6be",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:46Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/d5563a44-dcfa-44a2-bfd9-a27d4028614e",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e2f7cf7c-5ee9-498c-b3a3-5c58cf45d5e3"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "157db716-1068-417c-9601-ff87ca28c4c6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:32:46Z"
}
```

```json
{
  "id": "538be095-f6ac-4d83-8452-e1cc62f1a665",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:32:46Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/538be095-f6ac-4d83-8452-e1cc62f1a665/publish` → **200**

```json
{
  "command_id": "48c198e1-ea0a-458b-9fc8-a7d61bb32ecb",
  "expected_version": 0
}
```

```json
{
  "id": "538be095-f6ac-4d83-8452-e1cc62f1a665",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:32:46.736637Z",
  "published_at": "2026-10-30T13:32:46.736637Z",
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
  "device_ref": "sandbox-24183"
}
```

```json
{
  "challenge_id": "f0fabbc5-00f5-4291-8f61-cb2f26f7388f",
  "expires_at": "2026-10-30T13:37:47.037810136Z",
  "resend_available_at": "2026-10-30T13:32:48.037810136Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "619790",
  "sent_at": "2026-10-30T13:32:47.040534649Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0fabbc5-00f5-4291-8f61-cb2f26f7388f",
  "code": "619790",
  "device_ref": "sandbox-24183"
}
```

```json
{
  "session_id": "f10cb89d-51e9-4c59-a9b3-2588d19bc250",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODA2NywiaWF0IjoxNzkzMzY3MTY3LCJqdGkiOiI2MjA4ZGJiNS0wNDAzLTQ0ZmYtOGI2MC1hNjhjMzU0YTkwZjgiLCJzaWQiOiJmMTBjYjg5ZC01MWU5LTRjNTktYTliMy0yNTg4ZDE5YmMyNTAifQ.dlqTu8NCe6pvAklKR6sRpwQS7PSQIrfCCHGqMEvLbv0",
  "access_expires_at": "2026-10-30T13:47:47.357594865Z",
  "refresh_token": "xkItttYcYn8iBTdJVHqjHr4l0ZvKbt9MAT79av8IIDQ",
  "refresh_expires_at": "2026-11-29T13:32:47.356948043Z",
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

(the car drives 71 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "8bd8a0e8-eb10-43fc-ba2a-06b939932e77",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:33:58Z",
    "sequence": 1793367238975
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7798025b-42c9-46d7-80bb-ae94f67ddc04",
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
  "last_heartbeat_at": "2026-10-30T13:33:58.994321Z",
  "last_location_at": "2026-10-30T13:33:58.994321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672343985",
  "device_ref": "sandbox-6590"
}
```

```json
{
  "challenge_id": "d6095666-3d45-405e-ac39-2e200631a20a",
  "expires_at": "2026-10-30T13:38:59.289604617Z",
  "resend_available_at": "2026-10-30T13:34:00.289604617Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672343985` → **200**

```json
{
  "phone": "+380672343985",
  "audience": "CLIENT",
  "code": "597118",
  "sent_at": "2026-10-30T13:33:59.292655812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6095666-3d45-405e-ac39-2e200631a20a",
  "code": "597118",
  "device_ref": "sandbox-6590"
}
```

```json
{
  "session_id": "2e598bd7-9182-4054-9499-92e041eaf6da",
  "subject": {
    "type": "CLIENT",
    "id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzliNmQwMy1kYzdkLTQ3MjktOWJhMy00N2E1MjJhMWU4OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTM5LCJpYXQiOjE3OTMzNjcyMzksImp0aSI6IjM2YjFmYTE4LWUyMWQtNDBlZC04NGI1LTUzZDg4MDJlYWIyNiIsInNpZCI6IjJlNTk4YmQ3LTkxODItNDA1NC05NDk5LTkyZTA0MWVhZjZkYSJ9.luKRbooL1iJ_5VgV-IwHeU180oFCJJIXySiDu7LbkIw",
  "access_expires_at": "2026-10-30T13:48:59.613409108Z",
  "refresh_token": "bHu4PFiyIfmqW9rMHIId3YkIncZm-VhqFZnvcc2TxOQ",
  "refresh_expires_at": "2026-11-29T13:33:59.612843666Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "69683274-109f-4990-8599-997c17a23f1b",
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
  "id": "c84d5fd1-2df6-40ff-a594-e7ee1af6c842",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:59.912723Z",
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
  "command_id": "ef900023-a1ea-40aa-b8aa-d1ba799d7b93",
  "quote_id": "c84d5fd1-2df6-40ff-a594-e7ee1af6c842",
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
    "phone": "+380675142002"
  }
}
```

```json
{
  "id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:34:00.240745Z",
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
    "id": "9a150f71-eff4-4af9-80f3-5fa8840b1b10",
    "order_id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
    "expires_at": "2026-10-30T13:34:15.245185Z",
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

`POST /api/driver/v1/offers/9a150f71-eff4-4af9-80f3-5fa8840b1b10/accept` → **200**

```json
{
  "command_id": "ca2fab23-891e-45d3-847d-19b823120ede"
}
```

```json
{
  "id": "70699778-d379-4c96-bd56-e3c0046bca65",
  "order_id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4cec3c9d-d7a2-45bc-86e4-1eac3d77fb60",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4cec3c9d-d7a2-45bc-86e4-1eac3d77fb60",
  "order_id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
  "assignment_id": "70699778-d379-4c96-bd56-e3c0046bca65",
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
    "phone": "+380675142002"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11be36c8-1e0d-475e-adf9-a1784a18ba8d",
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
  "id": "5ced58f1-acf8-4559-bedb-38c171fe99f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:01.469974Z",
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
  "command_id": "5e171ac8-8ee5-469d-877e-f360bbfb3233",
  "quote_id": "5ced58f1-acf8-4559-bedb-38c171fe99f2",
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
  "id": "0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:34:01.796834Z",
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
  "command_id": "122249dd-b10a-49b3-a75f-6b32bbed22bf",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:34:02Z"
}
```

```json
{
  "id": "2b6483f4-a617-41bd-a4b0-3a7be281ec51",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:02.137866Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:34:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "687a8308-d8eb-4782-bfae-36dadc4da313",
  "quote_id": "2b6483f4-a617-41bd-a4b0-3a7be281ec51",
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
  "pickup_at": "2026-10-30T16:34:02Z"
}
```

```json
{
  "id": "df3b8a75-9774-402f-b51b-444e9efabebf",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:34:02.460293Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:34:02Z",
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
  "command_id": "646133f4-cbe4-40f6-ad78-fbe7078a7255",
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
  "id": "2c9c3e2b-7310-4dfc-b8a5-56fb79553811",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:02.789535Z",
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
  "command_id": "fa438764-9504-4105-8bb0-90e23e96a548",
  "quote_id": "2c9c3e2b-7310-4dfc-b8a5-56fb79553811",
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
  "correlation_id": "f10e4dd9-f5c3-428d-b869-99a2b05b20a4"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "df3b8a75-9774-402f-b51b-444e9efabebf",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:34:02.460293Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:34:02Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:34:01.796834Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:34:01.796834Z",
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

`GET /api/rider/v1/orders/baa1e313-18b0-447d-9f25-7a5d8b8474ea` → **200**

```json
{
  "id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "70699778-d379-4c96-bd56-e3c0046bca65",
    "order_id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4cec3c9d-d7a2-45bc-86e4-1eac3d77fb60",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:34:00.240745Z",
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
    "location_at": "2026-10-30T13:33:58.994321Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/baa1e313-18b0-447d-9f25-7a5d8b8474ea/cancel` → **200**

```json
{
  "command_id": "783849bd-54e3-4020-a168-348d07d81916",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "70699778-d379-4c96-bd56-e3c0046bca65",
    "order_id": "baa1e313-18b0-447d-9f25-7a5d8b8474ea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4cec3c9d-d7a2-45bc-86e4-1eac3d77fb60",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:34:00.240745Z",
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

`GET /api/rider/v1/orders/0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce` → **200**

```json
{
  "id": "0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:34:01.796834Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce/cancel` → **200**

```json
{
  "command_id": "52646a34-d5bb-4963-aeb3-8213d98e5638",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:34:01.796834Z",
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

`GET /api/rider/v1/orders/df3b8a75-9774-402f-b51b-444e9efabebf` → **200**

```json
{
  "id": "df3b8a75-9774-402f-b51b-444e9efabebf",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:34:02.460293Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:34:02Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/df3b8a75-9774-402f-b51b-444e9efabebf/cancel` → **200**

```json
{
  "command_id": "af490316-8768-4c0d-87a3-703437034f65",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "df3b8a75-9774-402f-b51b-444e9efabebf",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a39b6d03-dc7d-4729-9ba3-47a522a1e88f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:34:02.460293Z",
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
  "pickup_at": "2026-10-30T16:34:02Z",
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
  "session_id": "7798025b-42c9-46d7-80bb-ae94f67ddc04",
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
  "last_heartbeat_at": "2026-10-30T13:33:58.994321Z",
  "last_location_at": "2026-10-30T13:33:58.994321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7798025b-42c9-46d7-80bb-ae94f67ddc04/close` → **200**

```json
{
  "command_id": "01f5ce10-b20e-4d9b-9779-838483942211",
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

Done: orders baa1e313-18b0-447d-9f25-7a5d8b8474ea, 0a5e7b5e-0ac8-4026-9b2b-e43ab98ef2ce, df3b8a75-9774-402f-b51b-444e9efabebf.

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
  "session_id": "85c59f71-6fc0-4198-9513-e1e71e6e6057",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNDYsImlhdCI6MTc5MzM2NzI0NiwianRpIjoiZDE5YzZjZjUtY2UyNi00OWQ4LWJlNTMtOWNkYzg1MGY0NGQ1Iiwic2lkIjoiODVjNTlmNzEtNmZjMC00MTk4LTk1MTMtZTFlNzFlNmU2MDU3In0.4nfEcus-DCdESIXMcfxmzYVciSzRpM9wYUOVfCIRapg",
  "access_expires_at": "2026-10-30T13:49:06.873248512Z",
  "refresh_token": "9jnsyN1ZkLCZLy9WJfFDbrPIKTR-VRqUMfxcjhpePEw",
  "refresh_expires_at": "2026-10-31T01:34:06.872432895Z",
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
  "session_id": "cbb1feb2-ceaa-464a-83cf-0c8fe2a2dda4",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNDcsImlhdCI6MTc5MzM2NzI0NywianRpIjoiZmQwYzczNzYtYzA1Ni00YjZmLWExODYtYzUxZTQwMDM2OWI3Iiwic2lkIjoiY2JiMWZlYjItY2VhYS00NjRhLTgzY2YtMGM4ZmUyYTJkZGE0In0.mdRnEmkho6G_LQrYne5gtGvemLF6tTFx_eM9xs79Pik",
  "access_expires_at": "2026-10-30T13:49:07.507496982Z",
  "refresh_token": "bKZSsfUIMZg4AuzIP02mnMnnjG2fAM7p7x9hDf7NUB8",
  "refresh_expires_at": "2026-10-31T01:34:07.506855489Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9434"
}
```

```json
{
  "challenge_id": "b3dea430-5446-42e4-8296-f53a31a379b1",
  "expires_at": "2026-10-30T13:39:07.797189253Z",
  "resend_available_at": "2026-10-30T13:34:08.797189253Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "382616",
  "sent_at": "2026-10-30T13:34:07.80001501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3dea430-5446-42e4-8296-f53a31a379b1",
  "code": "382616",
  "device_ref": "sandbox-9434"
}
```

```json
{
  "session_id": "708eafd4-94b1-409c-a0b2-a0e4760154f8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODE0OCwiaWF0IjoxNzkzMzY3MjQ4LCJqdGkiOiJiNWU5OGFjOS1jYjc3LTRhNTItYTEwMS02ZTU3MjQ4MzJjYTUiLCJzaWQiOiI3MDhlYWZkNC05NGIxLTQwOWMtYTBiMi1hMGU0NzYwMTU0ZjgifQ.T6m-WoGNvqVJ8JZUYAzEnHAuzQDBD8-af5qIU1pSKqQ",
  "access_expires_at": "2026-10-30T13:49:08.12144233Z",
  "refresh_token": "dyqz6U6p63YJzmcP_QmjGFk86C5KZaSlz334uFkRvrg",
  "refresh_expires_at": "2026-11-29T13:34:08.12087219Z",
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
  "command_id": "45f50d9f-870d-4b92-ab59-70df57c437d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:34:08Z",
    "sequence": 1793367248720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97b97dd-18fa-4be1-aef3-f85a84649eaa",
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
  "last_heartbeat_at": "2026-10-30T13:34:08.73994Z",
  "last_location_at": "2026-10-30T13:34:08.73994Z",
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
  "command_id": "c8d90a88-72e6-4029-a8ca-4e5c95cb2210",
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
  "effective_at": "2026-10-30T13:34:09.379528Z",
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:24:32.654456Z",
  "last_entries": [
    {
      "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:24:32.654456Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b3492324-af39-467b-8eb6-b15bbd5ca26d",
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
  "id": "16ea4dba-24a0-4cd3-9219-f0a95729ccd7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:09.990488Z",
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
  "command_id": "99f8a74a-1999-4f86-85a3-5dafb79a487f",
  "quote_id": "16ea4dba-24a0-4cd3-9219-f0a95729ccd7",
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
    "phone": "+3806711128182"
  }
}
```

```json
{
  "id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
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
  "created_at": "2026-10-30T13:34:10.300822Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128182"
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
    "id": "5d7a9999-e432-4301-9347-878a5538df5d",
    "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
    "expires_at": "2026-10-30T13:34:25.30481Z",
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

`POST /api/driver/v1/offers/5d7a9999-e432-4301-9347-878a5538df5d/accept` → **200**

```json
{
  "command_id": "ee76fa84-582a-43a6-933e-fe1242b83153"
}
```

```json
{
  "id": "94b42ca8-6f7a-4ce9-9d91-ae3661449e66",
  "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "842b0078-6676-4738-aa77-398145432b7d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "842b0078-6676-4738-aa77-398145432b7d",
  "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
  "assignment_id": "94b42ca8-6f7a-4ce9-9d91-ae3661449e66",
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
    "phone": "+3806711128182"
  }
}
```

`POST /api/driver/v1/work-sessions/e97b97dd-18fa-4be1-aef3-f85a84649eaa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:34:11Z",
    "sequence": 1793367251512
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97b97dd-18fa-4be1-aef3-f85a84649eaa",
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
  "last_heartbeat_at": "2026-10-30T13:34:11.531042Z",
  "last_location_at": "2026-10-30T13:34:11.531042Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/842b0078-6676-4738-aa77-398145432b7d/arrive` → **200**

```json
{
  "command_id": "2e29eca2-aa4a-439f-a1ff-08a29cfb0b4e",
  "expected_version": 0
}
```

```json
{
  "id": "842b0078-6676-4738-aa77-398145432b7d",
  "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
  "assignment_id": "94b42ca8-6f7a-4ce9-9d91-ae3661449e66",
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
  "arrived_at": "2026-10-30T13:34:11.847997Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711128182"
  }
}
```

`POST /api/driver/v1/trips/842b0078-6676-4738-aa77-398145432b7d/start` → **200**

```json
{
  "command_id": "3c4a41e3-da21-44fe-a78c-b26c00144585",
  "expected_version": 1
}
```

```json
{
  "id": "842b0078-6676-4738-aa77-398145432b7d",
  "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
  "assignment_id": "94b42ca8-6f7a-4ce9-9d91-ae3661449e66",
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
  "arrived_at": "2026-10-30T13:34:11.847997Z",
  "started_at": "2026-10-30T13:34:12.183178Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711128182"
  }
}
```

`POST /api/driver/v1/trips/842b0078-6676-4738-aa77-398145432b7d/complete` → **200**

```json
{
  "command_id": "58dd7c98-3cb7-4ddf-872a-c83809a4dfdf",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:34:12Z",
  "cash_received": true
}
```

```json
{
  "id": "842b0078-6676-4738-aa77-398145432b7d",
  "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
  "assignment_id": "94b42ca8-6f7a-4ce9-9d91-ae3661449e66",
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
  "arrived_at": "2026-10-30T13:34:11.847997Z",
  "started_at": "2026-10-30T13:34:12.183178Z",
  "completed_at": "2026-10-30T13:34:12.496181Z",
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
  "command_id": "93fc8d95-26cd-4b4d-bee6-8f15b629a096",
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
  "id": "9a18ef51-dcdd-4a49-a039-c3a4d211f62b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:12.822374Z",
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
  "command_id": "4f39d694-1ae6-4062-858e-b79a1dd54dc6",
  "quote_id": "9a18ef51-dcdd-4a49-a039-c3a4d211f62b",
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
    "phone": "+380671112988"
  }
}
```

```json
{
  "id": "0a035914-0ebf-41a1-b12b-9b9f2f1fd242",
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
  "created_at": "2026-10-30T13:34:13.128539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112988"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0a035914-0ebf-41a1-b12b-9b9f2f1fd242` → **200**

```json
{
  "id": "0a035914-0ebf-41a1-b12b-9b9f2f1fd242",
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
  "created_at": "2026-10-30T13:34:13.128539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112988"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0a035914-0ebf-41a1-b12b-9b9f2f1fd242/cancel` → **200**

```json
{
  "command_id": "ecc0669d-b4a4-4f2e-b8e3-1fe4a49b016e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0a035914-0ebf-41a1-b12b-9b9f2f1fd242",
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
  "created_at": "2026-10-30T13:34:13.128539Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112988"
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
  "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:24:32.654456Z",
  "last_entries": [
    {
      "order_id": "0a035914-0ebf-41a1-b12b-9b9f2f1fd242",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:34:13.779891Z"
    },
    {
      "order_id": "4f5c4235-8ea6-41b3-bbfa-a29bcb439e75",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:34:12.501403Z"
    },
    {
      "order_id": "c57e355b-7331-4f36-b38c-216003597a60",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:24:32.654456Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e97b97dd-18fa-4be1-aef3-f85a84649eaa",
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
  "last_heartbeat_at": "2026-10-30T13:34:11.531042Z",
  "last_location_at": "2026-10-30T13:34:11.531042Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e97b97dd-18fa-4be1-aef3-f85a84649eaa/close` → **200**

```json
{
  "command_id": "98f96e78-3ff3-470b-9444-7088e7635a02",
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

Done: operator bonus for fulfilled 4f5c4235-8ea6-41b3-bbfa-a29bcb439e75 and operator-fault cancellation 0a035914-0ebf-41a1-b12b-9b9f2f1fd242.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679545969",
  "device_ref": "sandbox-26453"
}
```

```json
{
  "challenge_id": "fe893ab8-4338-42bc-b7a0-958c121d9be2",
  "expires_at": "2026-10-30T13:39:18.242713795Z",
  "resend_available_at": "2026-10-30T13:34:19.242713795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679545969` → **200**

```json
{
  "phone": "+380679545969",
  "audience": "CLIENT",
  "code": "683609",
  "sent_at": "2026-10-30T13:34:18.245307389Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672748602",
  "device_ref": "sandbox-54",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "f9636d47-2047-4a0d-b5bb-b3aee9d74d9e",
  "expires_at": "2026-10-30T13:39:19.76666863Z",
  "resend_available_at": "2026-10-30T13:34:20.76666863Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672748602` → **200**

```json
{
  "phone": "+380672748602",
  "audience": "CLIENT",
  "code": "909958",
  "sent_at": "2026-10-30T13:34:19.769052046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672748602",
  "device_ref": "sandbox-18576",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "37a1a6dd-6f9d-4640-8abd-9b25522586c4",
  "expires_at": "2026-10-30T13:39:21.301943234Z",
  "resend_available_at": "2026-10-30T13:34:22.301943234Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672748602` → **200**

```json
{
  "phone": "+380672748602",
  "audience": "CLIENT",
  "code": "455648",
  "sent_at": "2026-10-30T13:34:21.304618731Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670750000",
  "device_ref": "sandbox-1766"
}
```

```json
{
  "challenge_id": "035fd8f3-36ba-4a42-a019-e877d3664a19",
  "expires_at": "2026-10-30T13:39:22.82422385Z",
  "resend_available_at": "2026-10-30T13:34:23.82422385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670750000",
  "device_ref": "sandbox-25346"
}
```

```json
{
  "challenge_id": "548fe82e-9366-406d-a0ae-6600a462f602",
  "expires_at": "2026-10-30T13:39:24.317281902Z",
  "resend_available_at": "2026-10-30T13:34:25.317281902Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670750000` → **200**

```json
{
  "phone": "+380670750000",
  "audience": "CLIENT",
  "code": "920376",
  "sent_at": "2026-10-30T13:34:24.320962358Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670750000",
  "device_ref": "sandbox-2073",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a584031c-b202-4f99-ace5-3dbc036301dd",
  "expires_at": "2026-10-30T13:39:25.841205161Z",
  "resend_available_at": "2026-10-30T13:34:26.841205161Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670750000` → **200**

```json
{
  "phone": "+380670750000",
  "audience": "CLIENT",
  "code": "832985",
  "sent_at": "2026-10-30T13:34:25.84383233Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670750000",
  "device_ref": "sandbox-31040",
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
  "correlation_id": "7fc27d09-6caf-4d3b-aed1-d38a66e0c582",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000002515"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b35845e0-6a97-4d02-a497-0134a5fe9331"
}
```

`GET /sandbox/v1/otp?phone=%2B442000002515` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120027808"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "aed1345b-c082-4fa1-b812-c04c6c890305"
}
```

`GET /sandbox/v1/otp?phone=%2B37120027808` → **404**

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
  "session_id": "276b7240-9e4a-48bc-a2cd-fa719f8e5c54",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNjgsImlhdCI6MTc5MzM2NzI2OCwianRpIjoiM2UxZGZhM2QtOGE3YS00ZTBiLTliNWUtNWJiMTg0ZmFmNWYyIiwic2lkIjoiMjc2YjcyNDAtOWU0YS00OGJjLWEyY2QtZmE3MTlmOGU1YzU0In0.q_QPwBzlU8pBGcMRi-pFuI7Jh2LiAs5fVn6xVeQDM30",
  "access_expires_at": "2026-10-30T13:49:28.597419163Z",
  "refresh_token": "q4q-6VOgbK9lc9VeO-r9GcKNEGX7hyRCK1-MWjgUxtA",
  "refresh_expires_at": "2026-10-31T01:34:28.596556513Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670750000` → **200**

```json
{
  "deliveries": [
    {
      "id": "4dafb82e-af80-4acf-bf4e-f67e3a2949f3",
      "challenge_id": "a584031c-b202-4f99-ace5-3dbc036301dd",
      "phone": "+380670750000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-262c7bfa-3ae8-4ddc-977f-fdc69ee5a3c2",
      "error": null,
      "attempted_at": "2026-10-30T13:34:25.844313Z"
    },
    {
      "id": "faa78bba-7626-42a2-926e-a4a490170107",
      "challenge_id": "548fe82e-9366-406d-a0ae-6600a462f602",
      "phone": "+380670750000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-cc8cc918-d8a5-44cf-8666-daba57dfbe1b",
      "error": null,
      "attempted_at": "2026-10-30T13:34:24.321532Z"
    },
    {
      "id": "42925b89-6a06-4b95-bc6c-eb99d8dd2857",
      "challenge_id": "035fd8f3-36ba-4a42-a019-e877d3664a19",
      "phone": "+380670750000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:34:22.827089Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670750000` → **200**

```json
{
  "phone": "+380670750000",
  "audience": "CLIENT",
  "code": "832985",
  "sent_at": "2026-10-30T13:34:25.84383233Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672748602` → **200**

```json
{
  "deliveries": [
    {
      "id": "9571dc0a-0cf8-4479-b50a-40e9725d7009",
      "challenge_id": "37a1a6dd-6f9d-4640-8abd-9b25522586c4",
      "phone": "+380672748602",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-eefddb53-de91-4ac0-ab5f-f292b827496b",
      "error": null,
      "attempted_at": "2026-10-30T13:34:21.304847Z"
    },
    {
      "id": "b8cc6ab4-783d-492c-a3d5-99d521e0808e",
      "challenge_id": "f9636d47-2047-4a0d-b5bb-b3aee9d74d9e",
      "phone": "+380672748602",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1bec8c9f-d9ba-4689-bea9-3edd8ed2a65a",
      "error": null,
      "attempted_at": "2026-10-30T13:34:19.76959Z"
    }
  ]
}
```

Done: SMS to +380679545969; SMS then a call to +380672748602; a failed SMS, two calls and a refused third to +380670750000; +44 and +371 refused.

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
  "session_id": "a92f6a67-1e31-4379-adc4-b40ae3e92b05",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNjksImlhdCI6MTc5MzM2NzI2OSwianRpIjoiYjI1NTM3ZDUtZDIzYy00YjkzLWEwNDEtNmI4NDM0ZWZiN2I5Iiwic2lkIjoiYTkyZjZhNjctMWUzMS00Mzc5LWFkYzQtYjQwYWUzZTkyYjA1In0.obbep-Wp76m8-YVg-cV-nKqUnfa-O8d5Omcfz_SbJqw",
  "access_expires_at": "2026-10-30T13:49:29.820948828Z",
  "refresh_token": "K3FVZr_PNlRI4yOWgSJqPJW_RRCxF2Dl0yjkljy--mI",
  "refresh_expires_at": "2026-10-31T01:34:29.820242726Z",
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
  "session_id": "f5a70d5c-c70f-4ea9-9898-dea392180e14",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNzAsImlhdCI6MTc5MzM2NzI3MCwianRpIjoiY2M3NTllNWMtNDQ4ZS00MmNmLTkzN2EtZDk4OGNiZWI4OGQ1Iiwic2lkIjoiZjVhNzBkNWMtYzcwZi00ZWE5LTk4OTgtZGVhMzkyMTgwZTE0In0.auBngMZLYELT8nBmYze8cpDOiScgOFC3fs1eMtcf9B8",
  "access_expires_at": "2026-10-30T13:49:30.408825358Z",
  "refresh_token": "P9WkgU6ehD5Q6uoUvP1bFhCENTqIkkThnwYK1qQQNg0",
  "refresh_expires_at": "2026-10-31T01:34:30.40826629Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d",
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

`POST /api/admin/v1/staff-extensions/e963184c-985d-415a-89ba-c19f43a7b34d` → **200**

```json
{
  "command_id": "fdf3e6de-bed0-4ee5-8a44-4381025f563d",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d713eb43-8145-480d-b2a0-04dc52cac180",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:34:31.608391Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:34:31.608391Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7e7a8133-3bf7-42ca-93a6-6e70e317b73e",
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
  "id": "b11dd6bf-c4e6-44de-975c-a1deb3c76d0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:32.203099Z",
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
  "command_id": "bb24f34b-f170-43de-bd9e-1367944e94d3",
  "quote_id": "b11dd6bf-c4e6-44de-975c-a1deb3c76d0f",
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
    "phone": "+380677100900"
  }
}
```

```json
{
  "id": "3f37e125-06bb-4d0a-874d-318d674abf29",
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
  "created_at": "2026-10-30T13:34:32.530805Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677100900"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/3f37e125-06bb-4d0a-874d-318d674abf29/calls` → **201**

```json
{
  "command_id": "4c0cb8d2-c59d-4a34-83aa-6d69e699e0ed",
  "to": "CALLER"
}
```

```json
{
  "id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "order_ids": [
    "3f37e125-06bb-4d0a-874d-318d674abf29"
  ],
  "started_at": "2026-10-30T13:34:32.864979Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/3f37e125-06bb-4d0a-874d-318d674abf29/calls` → **201**

```json
{
  "command_id": "4c0cb8d2-c59d-4a34-83aa-6d69e699e0ed",
  "to": "CALLER"
}
```

```json
{
  "id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "order_ids": [
    "3f37e125-06bb-4d0a-874d-318d674abf29"
  ],
  "started_at": "2026-10-30T13:34:32.864979Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677100900",
    "at": "2026-10-30T13:34:32.867613517Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.4645",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "867167e8-1cdf-4789-be33-e9a1c3e85411"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=3f37e125-06bb-4d0a-874d-318d674abf29` → **200**

```json
{
  "calls": [
    {
      "id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [
        "3f37e125-06bb-4d0a-874d-318d674abf29"
      ],
      "started_at": "2026-10-30T13:34:32.864979Z",
      "answered_at": "2026-10-30T13:34:33.566346Z",
      "ended_at": "2026-10-30T13:34:33.5911Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3f37e125-06bb-4d0a-874d-318d674abf29` → **200**

```json
{
  "calls": [
    {
      "id": "867167e8-1cdf-4789-be33-e9a1c3e85411",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "order_ids": [
        "3f37e125-06bb-4d0a-874d-318d674abf29"
      ],
      "started_at": "2026-10-30T13:34:32.864979Z",
      "answered_at": "2026-10-30T13:34:33.566346Z",
      "ended_at": "2026-10-30T13:34:33.5911Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:34:34.372691Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/3f37e125-06bb-4d0a-874d-318d674abf29` → **200**

```json
{
  "id": "3f37e125-06bb-4d0a-874d-318d674abf29",
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
  "created_at": "2026-10-30T13:34:32.530805Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677100900"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3f37e125-06bb-4d0a-874d-318d674abf29/cancel` → **200**

```json
{
  "command_id": "24c6b721-a4f6-4026-92c2-9614566e2935",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3f37e125-06bb-4d0a-874d-318d674abf29",
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
  "created_at": "2026-10-30T13:34:32.530805Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677100900"
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
  "command_id": "93c11b82-a6cb-4331-9553-23d305ef253d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:34:36.921017Z",
  "extension": "101"
}
```

Done: outgoing call 867167e8-1cdf-4789-be33-e9a1c3e85411 from order 3f37e125-06bb-4d0a-874d-318d674abf29, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632701515",
  "device_ref": "sandbox-4896"
}
```

```json
{
  "challenge_id": "7bcba415-2c26-4f77-86d8-3504cf9ce6b9",
  "expires_at": "2026-10-30T13:39:37.236354921Z",
  "resend_available_at": "2026-10-30T13:34:38.236354921Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632701515` → **200**

```json
{
  "phone": "+380632701515",
  "audience": "CLIENT",
  "code": "087886",
  "sent_at": "2026-10-30T13:34:37.239107007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bcba415-2c26-4f77-86d8-3504cf9ce6b9",
  "code": "087886",
  "device_ref": "sandbox-4896"
}
```

```json
{
  "session_id": "5a721e78-ab70-431b-8b5d-83ee97a8df06",
  "subject": {
    "type": "CLIENT",
    "id": "04903cca-e8c7-428f-b00e-3c086b452e26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDkwM2NjYS1lOGM3LTQyOGYtYjAwZS0zYzA4NmI0NTJlMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTc3LCJpYXQiOjE3OTMzNjcyNzcsImp0aSI6ImM0YmJhNTgxLTljNjctNDE1Yy1iM2NmLTE5MGU5NjMyZDk3YyIsInNpZCI6IjVhNzIxZTc4LWFiNzAtNDMxYi04YjVkLTgzZWU5N2E4ZGYwNiJ9.S19hrnh7z7rp0EHy7F9f70ytlok9Ec28awVVIPmCK98",
  "access_expires_at": "2026-10-30T13:49:37.571118965Z",
  "refresh_token": "uT1DRysgwLnOEMzszgLJ-pTN8wWSZeVoZCLNY7gBXtc",
  "refresh_expires_at": "2026-11-29T13:34:37.57055721Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "04903cca-e8c7-428f-b00e-3c086b452e26",
  "session_id": "5a721e78-ab70-431b-8b5d-83ee97a8df06",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632701515",
  "device_ref": "sandbox-14800"
}
```

```json
{
  "challenge_id": "d9f4c393-9d5a-4b2d-bec1-d9649dfa5bc8",
  "expires_at": "2026-10-30T13:39:40.15773119Z",
  "resend_available_at": "2026-10-30T13:34:41.15773119Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632701515` → **200**

```json
{
  "phone": "+380632701515",
  "audience": "CLIENT",
  "code": "805402",
  "sent_at": "2026-10-30T13:34:40.16043647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9f4c393-9d5a-4b2d-bec1-d9649dfa5bc8",
  "code": "805402",
  "device_ref": "sandbox-14800"
}
```

```json
{
  "session_id": "5e1b1de0-47c4-4a55-a206-b4325f362cab",
  "subject": {
    "type": "CLIENT",
    "id": "04903cca-e8c7-428f-b00e-3c086b452e26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDkwM2NjYS1lOGM3LTQyOGYtYjAwZS0zYzA4NmI0NTJlMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTgwLCJpYXQiOjE3OTMzNjcyODAsImp0aSI6IjJhNTRlYjYyLTRkNGUtNDFkMy04MzU2LTAzYWM3NGI2YzViZiIsInNpZCI6IjVlMWIxZGUwLTQ3YzQtNGE1NS1hMjA2LWI0MzI1ZjM2MmNhYiJ9.2nfsPNAQmnv7L6-lolmRqpgY2LAPXMmg3znHxpXJznU",
  "access_expires_at": "2026-10-30T13:49:40.481130002Z",
  "refresh_token": "TaonTUSCzkx7tta35ZPbGMIqnuhuBfSGMMJW_1psOqQ",
  "refresh_expires_at": "2026-11-29T13:34:40.480549673Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "6a4cf579-0444-4799-84c3-f57d0edff3f3",
  "expires_at": "2026-10-30T13:39:42.77589959Z",
  "resend_available_at": "2026-10-30T13:34:43.77589959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632701515` → **200**

```json
{
  "phone": "+380632701515",
  "audience": "CLIENT",
  "code": "663195",
  "sent_at": "2026-10-30T13:34:42.778403515Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637967319"
}
```

```json
{
  "challenge_id": "e4ab3b77-bd5f-480c-8a90-1e7057c13641",
  "expires_at": "2026-10-30T13:39:43.0874749Z",
  "resend_available_at": "2026-10-30T13:34:44.0874749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637967319` → **200**

```json
{
  "phone": "+380637967319",
  "audience": "CLIENT",
  "code": "961334",
  "sent_at": "2026-10-30T13:34:43.090037874Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "dc694653-8e42-410a-8823-ebd05d9b3895",
  "current_challenge_id": "6a4cf579-0444-4799-84c3-f57d0edff3f3",
  "current_code": "000000",
  "new_challenge_id": "e4ab3b77-bd5f-480c-8a90-1e7057c13641",
  "new_code": "961334"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "bf9077d9-7991-4ed5-93a5-b1e845485ab7"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "f55f84c6-483b-4625-b864-7540e3575297",
  "current_challenge_id": "6a4cf579-0444-4799-84c3-f57d0edff3f3",
  "current_code": "663195",
  "new_challenge_id": "e4ab3b77-bd5f-480c-8a90-1e7057c13641",
  "new_code": "961334"
}
```

```json
{
  "subject_id": "04903cca-e8c7-428f-b00e-3c086b452e26",
  "phone": "+380637967319",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "04903cca-e8c7-428f-b00e-3c086b452e26",
  "session_id": "5a721e78-ab70-431b-8b5d-83ee97a8df06",
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
  "correlation_id": "eaa90e11-8be3-4536-807b-fa3ca9756d80"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637967319",
  "device_ref": "sandbox-5854"
}
```

```json
{
  "challenge_id": "48938fec-5e42-42a6-8c62-5f7757d453d7",
  "expires_at": "2026-10-30T13:39:46.631381392Z",
  "resend_available_at": "2026-10-30T13:34:47.631381392Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637967319` → **200**

```json
{
  "phone": "+380637967319",
  "audience": "CLIENT",
  "code": "471066",
  "sent_at": "2026-10-30T13:34:46.634078605Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48938fec-5e42-42a6-8c62-5f7757d453d7",
  "code": "471066",
  "device_ref": "sandbox-5854"
}
```

```json
{
  "session_id": "4cd186ff-0580-4353-bf26-6a26ea436e41",
  "subject": {
    "type": "CLIENT",
    "id": "04903cca-e8c7-428f-b00e-3c086b452e26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDkwM2NjYS1lOGM3LTQyOGYtYjAwZS0zYzA4NmI0NTJlMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTg2LCJpYXQiOjE3OTMzNjcyODYsImp0aSI6ImMyNTFiNzk5LTFjNzUtNDRjZC04YzczLTYzNDRjMDVkNzgwMyIsInNpZCI6IjRjZDE4NmZmLTA1ODAtNDM1My1iZjI2LTZhMjZlYTQzNmU0MSJ9.mr8tQmufE14_bKXN6qvLV_96LUawsSvW1jYdY625eIk",
  "access_expires_at": "2026-10-30T13:49:46.956136878Z",
  "refresh_token": "AcKegUzx7OwcH2ZJhBqM11_RRpRgGZboEbKIJFKQSaU",
  "refresh_expires_at": "2026-11-29T13:34:46.955582989Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "04903cca-e8c7-428f-b00e-3c086b452e26",
  "session_id": "4cd186ff-0580-4353-bf26-6a26ea436e41",
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
  "session_id": "920a0928-af9e-4d5e-986f-2381cfe51354",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxODcsImlhdCI6MTc5MzM2NzI4NywianRpIjoiOGYzMDIxOGQtYzc0Ny00YzJiLTljNDEtNjBlYjlkYTgyMGVkIiwic2lkIjoiOTIwYTA5MjgtYWY5ZS00ZDVlLTk4NmYtMjM4MWNmZTUxMzU0In0.uwnclGQ-uwYEspyY2XtJlkn8eTbvwFC2VWht_IZkVTk",
  "access_expires_at": "2026-10-30T13:49:47.835926058Z",
  "refresh_token": "7h8AdgXp9i7uetxfA-dwKw9Kk3XaxiQNbxfPm_au5lA",
  "refresh_expires_at": "2026-10-31T01:34:47.835228444Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26` → **200**

```json
{
  "client": {
    "id": "04903cca-e8c7-428f-b00e-3c086b452e26",
    "phone": "+380637967319",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:34:37.569002Z",
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

`POST /api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26/phone/new-code` → **201**

```json
{
  "phone": "+380637938362"
}
```

```json
{
  "challenge_id": "63f2d045-2a13-43f2-9b61-4dd0c8f31ced",
  "expires_at": "2026-10-30T13:39:48.46790924Z",
  "resend_available_at": "2026-10-30T13:34:49.46790924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637938362` → **200**

```json
{
  "phone": "+380637938362",
  "audience": "CLIENT",
  "code": "270330",
  "sent_at": "2026-10-30T13:34:48.470515425Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26/phone` → **422**

```json
{
  "command_id": "9510d389-601e-4ef3-a414-df32358f4407",
  "expected_version": 3,
  "new_challenge_id": "63f2d045-2a13-43f2-9b61-4dd0c8f31ced",
  "new_code": "270331",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "0a42e655-16f7-49c0-a5fc-5fbde2107f43"
}
```

`POST /api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26/phone` → **400**

```json
{
  "command_id": "ebb53e12-948a-453d-b5b4-73237995de19",
  "expected_version": 3,
  "new_challenge_id": "63f2d045-2a13-43f2-9b61-4dd0c8f31ced",
  "new_code": "270330",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7724705e-bd5c-4a4e-a3e5-a673cf450cb8",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/04903cca-e8c7-428f-b00e-3c086b452e26/phone` → **200**

```json
{
  "command_id": "eecf021b-4a5a-4b91-862c-79eed69d4f69",
  "expected_version": 3,
  "new_challenge_id": "63f2d045-2a13-43f2-9b61-4dd0c8f31ced",
  "new_code": "270330",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "04903cca-e8c7-428f-b00e-3c086b452e26",
  "phone": "+380637938362",
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
  "correlation_id": "b54aecbd-e47d-4f3a-9999-56af91f8db18"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637938362",
  "device_ref": "sandbox-710"
}
```

```json
{
  "challenge_id": "76da9bd8-9896-4933-8d0a-d6997a8dbfce",
  "expires_at": "2026-10-30T13:39:49.99381339Z",
  "resend_available_at": "2026-10-30T13:34:50.99381339Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637938362` → **200**

```json
{
  "phone": "+380637938362",
  "audience": "CLIENT",
  "code": "561505",
  "sent_at": "2026-10-30T13:34:49.996555668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76da9bd8-9896-4933-8d0a-d6997a8dbfce",
  "code": "561505",
  "device_ref": "sandbox-710"
}
```

```json
{
  "session_id": "16dd3805-bc55-4588-a1b8-4626dcf9de65",
  "subject": {
    "type": "CLIENT",
    "id": "04903cca-e8c7-428f-b00e-3c086b452e26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDkwM2NjYS1lOGM3LTQyOGYtYjAwZS0zYzA4NmI0NTJlMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTkwLCJpYXQiOjE3OTMzNjcyOTAsImp0aSI6IjQxMTNjZGUzLTY1YzItNDZmMC04MDg3LWQzOWVhNjExMWE3ZCIsInNpZCI6IjE2ZGQzODA1LWJjNTUtNDU4OC1hMWI4LTQ2MjZkY2Y5ZGU2NSJ9.m8zNst0ntzHnWz_Sb_DYDrOUL4Pp-qMx1CsbyRhbC6g",
  "access_expires_at": "2026-10-30T13:49:50.311614111Z",
  "refresh_token": "ChH2vLNZF5Z-uh3xdg11WJyknXut6flyseZ6qrVwqgU",
  "refresh_expires_at": "2026-11-29T13:34:50.311003697Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "04903cca-e8c7-428f-b00e-3c086b452e26",
  "session_id": "16dd3805-bc55-4588-a1b8-4626dcf9de65",
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
  "phone": "+380632148476",
  "device_ref": "sandbox-30884"
}
```

```json
{
  "challenge_id": "6a0abbd3-f633-4231-9ea4-eccb1ee907c1",
  "expires_at": "2026-10-30T13:39:50.903647499Z",
  "resend_available_at": "2026-10-30T13:34:51.903647499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632148476` → **200**

```json
{
  "phone": "+380632148476",
  "audience": "CLIENT",
  "code": "620175",
  "sent_at": "2026-10-30T13:34:50.906258362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a0abbd3-f633-4231-9ea4-eccb1ee907c1",
  "code": "620175",
  "device_ref": "sandbox-30884"
}
```

```json
{
  "session_id": "9bba2b8b-cea0-4e07-95a6-5ae5dae048b4",
  "subject": {
    "type": "CLIENT",
    "id": "aefbcc27-eaab-4698-8371-bb845a13be46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWZiY2MyNy1lYWFiLTQ2OTgtODM3MS1iYjg0NWExM2JlNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTkxLCJpYXQiOjE3OTMzNjcyOTEsImp0aSI6IjY3NzY2MDJlLTBmYmMtNDk0ZS04OTBhLTU3NmY1ZTUyODAwYyIsInNpZCI6IjliYmEyYjhiLWNlYTAtNGUwNy05NWE2LTVhZTVkYWUwNDhiNCJ9.Cl_pOJrsej2FowtfMWNadDhVc36A4ef7gGTuhNB71nc",
  "access_expires_at": "2026-10-30T13:49:51.230274252Z",
  "refresh_token": "KmBeX3Rn5b_-XgzXuhkFicf5eKa0K92CjtM2jsStepM",
  "refresh_expires_at": "2026-11-29T13:34:51.22970832Z",
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
  "session_id": "a1eab3fd-c647-4926-ad8e-39305383aab4",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxOTIsImlhdCI6MTc5MzM2NzI5MiwianRpIjoiNGM1MTIwYTYtMzFmMi00YmJlLTgyZjItMGJmNmI0MzBhZjI0Iiwic2lkIjoiYTFlYWIzZmQtYzY0Ny00OTI2LWFkOGUtMzkzMDUzODNhYWI0In0.cP9pOCGDP6R7gXaCYYeXGDbC01hluiMZUjxvzW8k334",
  "access_expires_at": "2026-10-30T13:49:52.48545078Z",
  "refresh_token": "PosqJB0Uwex4ABW_6nJZrz9STzvfRkHpcZ74W29Ekwk",
  "refresh_expires_at": "2026-10-31T01:34:52.484831668Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632148476` → **200**

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
  "correlation_id": "52e7e0d0-4e36-4b93-98cf-81a5d75f1f7c"
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
  "session_id": "eb258c67-61e4-4b25-ab36-f132e7f097f0",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxOTMsImlhdCI6MTc5MzM2NzI5MywianRpIjoiYWRmNmRiZTMtMDYxZC00MWM2LWJiZWYtMWEzMGUyNDQyYWJhIiwic2lkIjoiZWIyNThjNjctNjFlNC00YjI1LWFiMzYtZjEzMmU3ZjA5N2YwIn0.GJZQPQoWCx2UfgeH2NhTKk1MKyXug-6PN0myAw1c3Kw",
  "access_expires_at": "2026-10-30T13:49:53.67873415Z",
  "refresh_token": "QZWppWXOet_HCkqY54lS2XrbPCH6kyufK1fewt9Tdrk",
  "refresh_expires_at": "2026-10-31T01:34:53.678171134Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:20:33.976211Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "90d7f994-05fb-4b92-9aa2-5bbb85f5989a",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:34:54.282488887Z"
}
```

## The rider books the airport for 2026-10-30T16:34:53Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600771254",
  "device_ref": "sandbox-21290"
}
```

```json
{
  "challenge_id": "e27d14a2-88f4-4469-ad58-a23311d4a3e4",
  "expires_at": "2026-10-30T13:39:54.607114946Z",
  "resend_available_at": "2026-10-30T13:34:55.607114946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600771254` → **200**

```json
{
  "phone": "+48600771254",
  "audience": "CLIENT",
  "code": "570865",
  "sent_at": "2026-10-30T13:34:54.610000231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e27d14a2-88f4-4469-ad58-a23311d4a3e4",
  "code": "570865",
  "device_ref": "sandbox-21290"
}
```

```json
{
  "session_id": "243bf44b-c3f9-40e5-97d1-b9cdca77b848",
  "subject": {
    "type": "CLIENT",
    "id": "d09e4193-2e39-4f11-b197-8e347c68e68f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDllNDE5My0yZTM5LTRmMTEtYjE5Ny04ZTM0N2M2OGU2OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTk0LCJpYXQiOjE3OTMzNjcyOTQsImp0aSI6Ijk0NDUyYzE2LWFhNmUtNGFjYi04MmU0LTM2ZGQ5ZmFhYzVhMyIsInNpZCI6IjI0M2JmNDRiLWMzZjktNDBlNS05N2QxLWI5Y2RjYTc3Yjg0OCJ9.4dS47c8PZFyTRk5Yku29U2V00Js2gsi87mFx666SV1c",
  "access_expires_at": "2026-10-30T13:49:54.93704493Z",
  "refresh_token": "4sn0xC8697PlzYcWcMz-4hya9Azox_ZnVneR-g2tMUw",
  "refresh_expires_at": "2026-11-29T13:34:54.936505287Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a46c0f18-adc9-4cf1-b2e1-f332f1bc368b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:34:53Z"
}
```

```json
{
  "id": "57f56590-1365-4c10-9711-1152a7da1262",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:55.233089Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:34:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8fc88a65-dffd-4fd3-a2e5-6fc62d73e1f5",
  "quote_id": "57f56590-1365-4c10-9711-1152a7da1262",
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
  "pickup_at": "2026-10-30T16:34:53Z"
}
```

```json
{
  "id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d09e4193-2e39-4f11-b197-8e347c68e68f",
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
  "created_at": "2026-10-30T13:34:55.534913Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:34:53Z",
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
  "device_ref": "sandbox-14743"
}
```

```json
{
  "challenge_id": "21587c8b-6635-4ee4-851d-039c1dc1b1bc",
  "expires_at": "2026-10-30T13:39:55.841367514Z",
  "resend_available_at": "2026-10-30T13:34:56.841367514Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "255186",
  "sent_at": "2026-10-30T13:34:55.844089105Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21587c8b-6635-4ee4-851d-039c1dc1b1bc",
  "code": "255186",
  "device_ref": "sandbox-14743"
}
```

```json
{
  "session_id": "bf5a8108-bc18-4eb6-b622-4908dab2d430",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODE5NiwiaWF0IjoxNzkzMzY3Mjk2LCJqdGkiOiI3MmJmZGZmNi0xYzhmLTRmNTItOTdiMi1mMmJmMmY5MTM3ZTYiLCJzaWQiOiJiZjVhODEwOC1iYzE4LTRlYjYtYjYyMi00OTA4ZGFiMmQ0MzAifQ.ogJVfUes4MUdCjiFqmUnxEpV46tbyrvaff_sYa7gu_s",
  "access_expires_at": "2026-10-30T13:49:56.165715815Z",
  "refresh_token": "o4H1jO42z4QCPiGnZFk4KKFv-nNVEp2FwTu4yzDtC_M",
  "refresh_expires_at": "2026-11-29T13:34:56.165102635Z",
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
  "command_id": "524389d5-16b8-4a46-bc42-81c213351762",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:34:56Z",
    "sequence": 1793367296763
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b",
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
  "last_heartbeat_at": "2026-10-30T13:34:56.781286Z",
  "last_location_at": "2026-10-30T13:34:56.781286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
      "short_number": 25,
      "pickup_at": "2026-10-30T16:34:53Z",
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

`POST /api/driver/v1/preorders/7685c4a1-68e0-41b1-9f37-4aedd7cb70e8/reserve` → **200**

```json
{
  "command_id": "8cc5b880-c3af-4155-9757-3f50628c5178"
}
```

```json
{
  "id": "c83bd499-4f23-4fae-af2e-89e9fc581b9c",
  "state": "RESERVED",
  "order": {
    "order_id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
    "short_number": 25,
    "pickup_at": "2026-10-30T16:34:53Z",
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
  "reserved_at": "2026-10-30T13:34:57.386928Z",
  "confirm_from": "2026-10-30T16:04:53Z",
  "confirm_until": "2026-10-30T16:14:53Z",
  "drop_until": "2026-10-30T15:34:53Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c83bd499-4f23-4fae-af2e-89e9fc581b9c",
      "state": "RESERVED",
      "order": {
        "order_id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:34:53Z",
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
      "reserved_at": "2026-10-30T13:34:57.386928Z",
      "confirm_from": "2026-10-30T16:04:53Z",
      "confirm_until": "2026-10-30T16:14:53Z",
      "drop_until": "2026-10-30T15:34:53Z"
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
      "id": "c83bd499-4f23-4fae-af2e-89e9fc581b9c",
      "state": "RESERVED",
      "order": {
        "order_id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:34:53Z",
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
      "reserved_at": "2026-10-30T13:34:57.386928Z",
      "confirm_from": "2026-10-30T16:04:53Z",
      "confirm_until": "2026-10-30T16:14:53Z",
      "drop_until": "2026-10-30T15:34:53Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c83bd499-4f23-4fae-af2e-89e9fc581b9c/confirm` → **409**

```json
{
  "command_id": "b4860b28-8561-494d-aa47-ea150c291a76"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c83bd499-4f23-4fae-af2e-89e9fc581b9c/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "29a4610f-4502-4f85-8ccc-6656beb0174b"
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
  "session_id": "b61ada70-dd6f-48a2-be0e-e618189b2c50",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxOTgsImlhdCI6MTc5MzM2NzI5OCwianRpIjoiNmVjN2E0Y2ItMWJiOS00NzU2LThkZjMtNDg0ODhlM2RhYmI0Iiwic2lkIjoiYjYxYWRhNzAtZGQ2Zi00OGEyLWJlMGUtZTYxODE4OWIyYzUwIn0.dxjFvTiAHJJE1iFDCleJz4V6UZqTRMbSjDCthZl1tyY",
  "access_expires_at": "2026-10-30T13:49:58.859451832Z",
  "refresh_token": "lxhl5DnEDrEQdnZQoZlOnqljjKwy3T9gId6KTordWho",
  "refresh_expires_at": "2026-10-31T01:34:58.858834131Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7685c4a1-68e0-41b1-9f37-4aedd7cb70e8` → **200**

```json
{
  "id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d09e4193-2e39-4f11-b197-8e347c68e68f",
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
  "created_at": "2026-10-30T13:34:55.534913Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:34:53Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c83bd499-4f23-4fae-af2e-89e9fc581b9c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:34:57.386928Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7685c4a1-68e0-41b1-9f37-4aedd7cb70e8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:34:55.536373Z",
      "actor": {
        "type": "CLIENT",
        "id": "d09e4193-2e39-4f11-b197-8e347c68e68f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
        "preorder": true,
        "quote_id": "57f56590-1365-4c10-9711-1152a7da1262",
        "pickup_at": "2026-10-30T16:34:53Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ba8a44fd-e075-4fde-a7e3-79e8312b9da4"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:34:57.388209Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7685c4a1-68e0-41b1-9f37-4aedd7cb70e8",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c83bd499-4f23-4fae-af2e-89e9fc581b9c"
      },
      "correlation_id": "e11ca031-7a05-41df-be25-656f62d97756"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 7685c4a1-68e0-41b1-9f37-4aedd7cb70e8, reservation c83bd499-4f23-4fae-af2e-89e9fc581b9c.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12310"
}
```

```json
{
  "challenge_id": "771d1d12-58e6-46f8-900d-eb403f87e3c4",
  "expires_at": "2026-10-30T13:39:59.760719986Z",
  "resend_available_at": "2026-10-30T13:35:00.760719986Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "820132",
  "sent_at": "2026-10-30T13:34:59.763854869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "771d1d12-58e6-46f8-900d-eb403f87e3c4",
  "code": "820132",
  "device_ref": "sandbox-12310"
}
```

```json
{
  "session_id": "c642bc51-36f3-49d8-aa23-f1ad8edf03b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODIwMCwiaWF0IjoxNzkzMzY3MzAwLCJqdGkiOiIyNjcxMzlkMS0wMTM5LTQ5MjYtYmRlZS0wNzUzNDNlYmZmNmEiLCJzaWQiOiJjNjQyYmM1MS0zNmYzLTQ5ZDgtYWEyMy1mMWFkOGVkZjAzYjcifQ.AsrGtxJxvKoA-g3sZNWfeWZCOqFEbR5kTasziWy6BVI",
  "access_expires_at": "2026-10-30T13:50:00.078846408Z",
  "refresh_token": "5tHVlGzcxwjU0F-_Mn3vlSu3VXvreI7oRKRJEGUi-98",
  "refresh_expires_at": "2026-11-29T13:35:00.078045027Z",
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
  "command_id": "2e6b8882-3f15-47ee-bfc6-3448985406d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:35:00Z",
    "sequence": 1793367300693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:35:00.711986Z",
  "last_location_at": "2026-10-30T13:35:00.711986Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674181658",
  "device_ref": "sandbox-27934"
}
```

```json
{
  "challenge_id": "684d8fa6-8e80-44c0-8b33-649a6382767b",
  "expires_at": "2026-10-30T13:40:01.013588013Z",
  "resend_available_at": "2026-10-30T13:35:02.013588013Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674181658` → **200**

```json
{
  "phone": "+380674181658",
  "audience": "CLIENT",
  "code": "426072",
  "sent_at": "2026-10-30T13:35:01.016386861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "684d8fa6-8e80-44c0-8b33-649a6382767b",
  "code": "426072",
  "device_ref": "sandbox-27934"
}
```

```json
{
  "session_id": "66bfe061-a9b4-45d1-aeff-ba35065cb148",
  "subject": {
    "type": "CLIENT",
    "id": "5f18aa31-fa87-4dc0-81d9-a16a4a608536"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjE4YWEzMS1mYTg3LTRkYzAtODFkOS1hMTZhNGE2MDg1MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MjAxLCJpYXQiOjE3OTMzNjczMDEsImp0aSI6IjU1OGFlZjk0LTIxYzEtNDk0MC04NjYwLWY3N2YxMDQxYjNhMiIsInNpZCI6IjY2YmZlMDYxLWE5YjQtNDVkMS1hZWZmLWJhMzUwNjVjYjE0OCJ9.ADwZMKC8w49ypDqzJWqv9DCqvPWm3sMkiL--kJd72YQ",
  "access_expires_at": "2026-10-30T13:50:01.336686917Z",
  "refresh_token": "RHNOmVznKfbBJT-lBbZAgPNGy9Alur_4wOPanHOwyqE",
  "refresh_expires_at": "2026-11-29T13:35:01.336083244Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1a412c05-711b-4c1d-80ed-ae9bbb106fb9",
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
  "id": "4c5441ee-6446-43fa-b511-95bc70133995",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:40:01.639116Z",
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
  "command_id": "d788da48-9dc8-4b70-a443-32e359532bae",
  "quote_id": "4c5441ee-6446-43fa-b511-95bc70133995",
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
  "id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f18aa31-fa87-4dc0-81d9-a16a4a608536",
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
  "created_at": "2026-10-30T13:35:01.950991Z",
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
    "id": "177623d9-ca79-41c3-ade2-997f838132e7",
    "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
    "expires_at": "2026-10-30T13:35:16.954499Z",
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

`POST /api/driver/v1/offers/177623d9-ca79-41c3-ade2-997f838132e7/accept` → **200**

```json
{
  "command_id": "1f9029bb-f305-41a5-8e2d-2061868ebc3b"
}
```

```json
{
  "id": "44ef71ac-9e81-4f66-a998-4bf66411d014",
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51cc443a-195b-4307-a4a5-d835e7ef79c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51cc443a-195b-4307-a4a5-d835e7ef79c2",
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "assignment_id": "44ef71ac-9e81-4f66-a998-4bf66411d014",
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

`POST /api/driver/v1/work-sessions/22461ba4-556a-43d0-bf2f-a239d5b8f4d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:35:03Z",
    "sequence": 1793367303180
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:35:03.198728Z",
  "last_location_at": "2026-10-30T13:35:03.198728Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51cc443a-195b-4307-a4a5-d835e7ef79c2",
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "assignment_id": "44ef71ac-9e81-4f66-a998-4bf66411d014",
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

`POST /api/driver/v1/trips/51cc443a-195b-4307-a4a5-d835e7ef79c2/arrive` → **200**

```json
{
  "command_id": "ffdd5562-198c-4c0f-aff9-71119d63b694",
  "expected_version": 0
}
```

```json
{
  "id": "51cc443a-195b-4307-a4a5-d835e7ef79c2",
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "assignment_id": "44ef71ac-9e81-4f66-a998-4bf66411d014",
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
  "arrived_at": "2026-10-30T13:35:03.779788Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/51cc443a-195b-4307-a4a5-d835e7ef79c2/start` → **200**

```json
{
  "command_id": "72423556-c347-446a-9909-7083c670794f",
  "expected_version": 1
}
```

```json
{
  "id": "51cc443a-195b-4307-a4a5-d835e7ef79c2",
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "assignment_id": "44ef71ac-9e81-4f66-a998-4bf66411d014",
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
  "arrived_at": "2026-10-30T13:35:03.779788Z",
  "started_at": "2026-10-30T13:35:04.088823Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/22461ba4-556a-43d0-bf2f-a239d5b8f4d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:35:52Z",
    "sequence": 1793367352413
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:35:52.432334Z",
  "last_location_at": "2026-10-30T13:35:52.432334Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/51cc443a-195b-4307-a4a5-d835e7ef79c2/complete` → **200**

```json
{
  "command_id": "6f5ee5c7-3d08-4665-bc43-4b2796e4d609",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:35:52Z",
  "cash_received": true
}
```

```json
{
  "id": "51cc443a-195b-4307-a4a5-d835e7ef79c2",
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "assignment_id": "44ef71ac-9e81-4f66-a998-4bf66411d014",
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
  "arrived_at": "2026-10-30T13:35:03.779788Z",
  "started_at": "2026-10-30T13:35:04.088823Z",
  "completed_at": "2026-10-30T13:35:52.73882Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/d6676d92-bc97-4c18-8aed-78e84e6229cc/rating` → **200**

```json
{
  "command_id": "d8863212-e2c1-4793-a1c7-ef13f5beea23",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "score": 5,
  "created_at": "2026-10-30T13:35:53.066957421Z"
}
```

`POST /api/driver/v1/orders/d6676d92-bc97-4c18-8aed-78e84e6229cc/rating` → **200**

```json
{
  "command_id": "0bdcd442-79c0-4b6b-8702-bf2630753329",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
  "score": 4,
  "created_at": "2026-10-30T13:35:53.362572954Z"
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
  "session_id": "71b37b29-2671-4020-b221-e8a5f599a878",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNTQsImlhdCI6MTc5MzM2NzM1NCwianRpIjoiOTBkMGZiN2MtNTk4Zi00NGVlLTlhOTUtYTRkZDMyMzljNzM5Iiwic2lkIjoiNzFiMzdiMjktMjY3MS00MDIwLWIyMjEtZThhNWY1OTlhODc4In0.Gm8b7rsPu_hchfBuvEFS6wgSIQG8DXHSc0B6FTD9x9s",
  "access_expires_at": "2026-10-30T13:50:54.244699534Z",
  "refresh_token": "AOw9fV-ajBuZAO-lxPvaaqvM51oK--r21dR1df_B3Kc",
  "refresh_expires_at": "2026-10-31T01:35:54.243990296Z",
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
  "session_id": "d140f923-de0e-4e8e-83f7-f7801b0533c0",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNTQsImlhdCI6MTc5MzM2NzM1NCwianRpIjoiZTMxYzQzZDItMjFiYi00OGEwLWJlNGQtYWZkYWU0YWE1NTdhIiwic2lkIjoiZDE0MGY5MjMtZGUwZS00ZThlLTgzZjctZjc4MDFiMDUzM2MwIn0.KITL1PAhIXoFQ_NtvOe6NVWpf3fB5VPfwftT6NcP5n8",
  "access_expires_at": "2026-10-30T13:50:54.832022375Z",
  "refresh_token": "NCMVZ_CWlVaNZmaomDNwF4fLENJCA37qDsguLmRloHk",
  "refresh_expires_at": "2026-10-31T01:35:54.831468165Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d6676d92-bc97-4c18-8aed-78e84e6229cc/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
      "author_type": "RIDER",
      "author_id": "5f18aa31-fa87-4dc0-81d9-a16a4a608536",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:35:53.066957Z"
    },
    {
      "order_id": "d6676d92-bc97-4c18-8aed-78e84e6229cc",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "5f18aa31-fa87-4dc0-81d9-a16a4a608536",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:35:53.362573Z"
    }
  ]
}
```

Done: ratings for order d6676d92-bc97-4c18-8aed-78e84e6229cc.

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
  "session_id": "a1667509-aa68-46c6-ad0f-d759fe675a35",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNTUsImlhdCI6MTc5MzM2NzM1NSwianRpIjoiZTJhNjAzZDItYjRhYi00M2Q1LThjOGMtMDQxY2UxNjI3NGU3Iiwic2lkIjoiYTE2Njc1MDktYWE2OC00NmM2LWFkMGYtZDc1OWZlNjc1YTM1In0.Z4ee_xcFlzZpeMDP-092GthpUQe_rgNMwR03YxPDRUI",
  "access_expires_at": "2026-10-30T13:50:55.735413729Z",
  "refresh_token": "RXuyji7pn7V72yZyqmQL2o-Hqvmc17vDbekePkGTubI",
  "refresh_expires_at": "2026-10-31T01:35:55.734819523Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e42eee92-20dc-446b-b992-568beca19409",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "55e42a33-9b8b-4b9d-b9fa-368b78411d44",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:56.038711Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/55e42a33-9b8b-4b9d-b9fa-368b78411d44` → **200**

```json
{
  "id": "55e42a33-9b8b-4b9d-b9fa-368b78411d44",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:56.038711Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/55e42a33-9b8b-4b9d-b9fa-368b78411d44` → **200**

```json
{
  "id": "55e42a33-9b8b-4b9d-b9fa-368b78411d44",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:56.038711Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/55e42a33-9b8b-4b9d-b9fa-368b78411d44` → **200**

```json
{
  "id": "55e42a33-9b8b-4b9d-b9fa-368b78411d44",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:56.038711Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/55e42a33-9b8b-4b9d-b9fa-368b78411d44` → **200**

```json
{
  "id": "55e42a33-9b8b-4b9d-b9fa-368b78411d44",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:35:56.038711Z",
  "ready_at": "2026-10-30T13:35:59.538777Z",
  "expires_at": "2026-10-31T13:35:59.538777Z"
}
```

`GET /api/admin/v1/reports/exports/55e42a33-9b8b-4b9d-b9fa-368b78411d44/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6991b2f3-a736-4f56-8856-bb0b9c2d91a3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "45ceaab0-07bf-4a04-8426-9b0663ad4723",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:36:00.545098Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/45ceaab0-07bf-4a04-8426-9b0663ad4723` → **200**

```json
{
  "id": "45ceaab0-07bf-4a04-8426-9b0663ad4723",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:36:00.545098Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/45ceaab0-07bf-4a04-8426-9b0663ad4723` → **200**

```json
{
  "id": "45ceaab0-07bf-4a04-8426-9b0663ad4723",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:36:00.545098Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/45ceaab0-07bf-4a04-8426-9b0663ad4723` → **200**

```json
{
  "id": "45ceaab0-07bf-4a04-8426-9b0663ad4723",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:36:00.545098Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/45ceaab0-07bf-4a04-8426-9b0663ad4723` → **200**

```json
{
  "id": "45ceaab0-07bf-4a04-8426-9b0663ad4723",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:36:00.545098Z",
  "ready_at": "2026-10-30T13:36:04.547199Z",
  "expires_at": "2026-10-31T13:36:04.547199Z"
}
```

`GET /api/admin/v1/reports/exports/45ceaab0-07bf-4a04-8426-9b0663ad4723/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/217687bb-017a-4d9e-a477-b44294a8cbf7` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/217687bb-017a-4d9e-a477-b44294a8cbf7",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dae61d9d-96ec-4658-8c23-b774b05ad59e"
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
  "session_id": "f3c0f3f8-13a8-4016-92fe-6e002b1f0109",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNjUsImlhdCI6MTc5MzM2NzM2NSwianRpIjoiODUyMjMwYWUtMDNlYi00MTdhLWFhOGMtYWFiNTIyNmEzZDU5Iiwic2lkIjoiZjNjMGYzZjgtMTNhOC00MDE2LTkyZmUtNmUwMDJiMWYwMTA5In0.UmnW7esqhJ-QyteWAUBHQh4EetStD2Z_PtWJINgZtno",
  "access_expires_at": "2026-10-30T13:51:05.659886103Z",
  "refresh_token": "iNrzRGANvv8-OupnQK2ikzU01XpEOS14Gv0LqhwzO_Y",
  "refresh_expires_at": "2026-10-31T01:36:05.659285318Z",
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
  "command_id": "099ccf4b-bdd2-46a1-bad2-8bed392069c3",
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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:36:06.264771088Z"
}
```

`POST /sandbox/v1/retention/fixtures/6ac45a6d-1c78-4b36-ad6a-d1466a828741` → **200**

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

`GET /sandbox/v1/retention/fixtures/6ac45a6d-1c78-4b36-ad6a-d1466a828741` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/6ac45a6d-1c78-4b36-ad6a-d1466a828741` → **204**

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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:36:06.264771Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "e0fa2b93-2598-4452-80db-421c80e18ade",
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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T13:36:07.053120516Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25922"
}
```

```json
{
  "challenge_id": "bc04f1c5-2410-4bf4-9da5-751234ae96eb",
  "expires_at": "2026-10-30T13:41:07.396374397Z",
  "resend_available_at": "2026-10-30T13:36:08.396374397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "675798",
  "sent_at": "2026-10-30T13:36:07.400596767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc04f1c5-2410-4bf4-9da5-751234ae96eb",
  "code": "675798",
  "device_ref": "sandbox-25922"
}
```

```json
{
  "session_id": "1d0f3b15-d1fc-4e6a-ad4d-debb4b2d030f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI2NywiaWF0IjoxNzkzMzY3MzY3LCJqdGkiOiIyNGZkMmU0Yi01ZDZiLTQyNzYtOGYyYi0zY2U0MmI1MmE4ZDYiLCJzaWQiOiIxZDBmM2IxNS1kMWZjLTRlNmEtYWQ0ZC1kZWJiNGIyZDAzMGYifQ.8Z4nKZvsdBqMKbd6SiJQ-jfCd_TcGXX8PRWkWv-6h_8",
  "access_expires_at": "2026-10-30T13:51:07.745529248Z",
  "refresh_token": "kSbVuG0sxQ5wJsR_aTYYgshbmStRY8lkAMh0sd6LQtM",
  "refresh_expires_at": "2026-11-29T13:36:07.744885251Z",
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
  "command_id": "a9c01ff2-ad5f-438d-807c-d41462630505",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:08Z",
    "sequence": 1793367368657
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "861121d8-d439-4d60-b324-128cd795959a",
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
  "last_heartbeat_at": "2026-10-30T13:36:08.675853Z",
  "last_location_at": "2026-10-30T13:36:08.675853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "02e730c0-1d40-4d6c-825a-ea37090a2ce4",
  "points": [
    {
      "sequence": 1793367370972,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:35:10Z"
    },
    {
      "sequence": 1793367370979,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:36:10Z"
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
  "session_id": "ee028f0c-2d39-4f1a-85af-e74c38a240d7",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNzEsImlhdCI6MTc5MzM2NzM3MSwianRpIjoiYTI1ZjZlZDctN2NmOC00ZmEyLWI4MTEtYTFlOWJkMDkwZTc0Iiwic2lkIjoiZWUwMjhmMGMtMmQzOS00ZjFhLTg1YWYtZTc0YzM4YTI0MGQ3In0.KPFXBQI62qGSvybDlWs28b92ZmPs2x41yG1OEaajqN4",
  "access_expires_at": "2026-10-30T13:51:11.615909986Z",
  "refresh_token": "i1Kg2QY-upnZHt6n1bbNCRZGqZcXOFEepYCZHu2BeAM",
  "refresh_expires_at": "2026-10-31T01:36:11.615353582Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "a4df9744-2c03-463d-8813-b3eb08ea0082",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T13:36:10Z",
        "track_point_id": "ea0653aa-1429-4e32-9fdb-eaaf66546c20",
        "work_session_id": "861121d8-d439-4d60-b324-128cd795959a"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T13:36:10Z",
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

`POST /api/admin/v1/driver-risk-flags/a4df9744-2c03-463d-8813-b3eb08ea0082/confirm` → **200**

```json
{
  "command_id": "492fd61b-0b0c-4a99-a51e-6d90d981591a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a4df9744-2c03-463d-8813-b3eb08ea0082",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T13:36:10Z",
    "track_point_id": "ea0653aa-1429-4e32-9fdb-eaaf66546c20",
    "work_session_id": "861121d8-d439-4d60-b324-128cd795959a"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T13:36:10Z",
  "reason": null,
  "reviewed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reviewed_at": "2026-10-30T13:36:12.542941Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a4df9744-2c03-463d-8813-b3eb08ea0082/dismiss` → **409**

```json
{
  "command_id": "d13222e9-5457-4e0e-bb6d-bbb4927350f4",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a4df9744-2c03-463d-8813-b3eb08ea0082/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c9bbdfc3-6037-40dd-88b6-b14b63b2bad3"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "edf79762-57d5-45ac-980c-82ee9e1c9f9b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "fb28f6e3-3e7f-453c-86c4-8ebc35fea5aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "raised_at": "2026-10-30T13:36:13.14509Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/fb28f6e3-3e7f-453c-86c4-8ebc35fea5aa/dismiss` → **200**

```json
{
  "command_id": "f6227c59-9116-4bf7-9a7f-d0af53ac840b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "fb28f6e3-3e7f-453c-86c4-8ebc35fea5aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "raised_at": "2026-10-30T13:36:13.14509Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reviewed_at": "2026-10-30T13:36:13.452885Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "61fa9aa4-8248-4e93-b3c0-6677d61980bf",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a4df9744-2c03-463d-8813-b3eb08ea0082"
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
      "actor_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:36:13.791916Z"
    }
  ],
  "duplicates": []
}
```

Done: flag a4df9744-2c03-463d-8813-b3eb08ea0082 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "91bfc9c1-3b2e-4836-b162-af3606dbda4b",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNzQsImlhdCI6MTc5MzM2NzM3NCwianRpIjoiNjhmNTM4ZmYtNTkyNy00MzNkLTgwNjctZjk3ZjIyZjE4YTY2Iiwic2lkIjoiOTFiZmM5YzEtM2IyZS00ODM2LWIxNjItYWYzNjA2ZGJkYTRiIn0.xcp_xEG_PXgm8kMmNDNQm1jvTjtvIGD7lB85gzi88GE",
  "access_expires_at": "2026-10-30T13:51:14.69588334Z",
  "refresh_token": "iDWJPk8EjkjdqXF4I_5jk7Z3KtllMxG2PXLTD5erc5A",
  "refresh_expires_at": "2026-10-31T01:36:14.695301047Z",
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
      "actor_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:36:13.791916Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "bc0b491a-dbc4-408d-a344-2c9c188ad448",
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
  "session_id": "861121d8-d439-4d60-b324-128cd795959a",
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
  "last_heartbeat_at": "2026-10-30T13:36:08.675853Z",
  "last_location_at": "2026-10-30T13:36:08.675853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/861121d8-d439-4d60-b324-128cd795959a/close` → **200**

```json
{
  "command_id": "6aec2a40-47eb-42a7-99e4-f0ac7c4c93cd",
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
  "session_id": "8f196bb2-c8a9-41c1-882b-58e5c148cc8f",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNzYsImlhdCI6MTc5MzM2NzM3NiwianRpIjoiOTM2MmI3N2YtMTMyMS00OThhLTlmMmItMzZlODMxMjQ3OTFhIiwic2lkIjoiOGYxOTZiYjItYzhhOS00MWMxLTg4MmItNThlNWMxNDhjYzhmIn0.KXlWIgxcvJ8QHRN489yDnJgA5VPNgSS7SB46QNw73aA",
  "access_expires_at": "2026-10-30T13:51:16.530281061Z",
  "refresh_token": "ZSEumBjeIZylASfGLmCXzH6ObCKzhSsmRLxeXwK3J9g",
  "refresh_expires_at": "2026-10-31T01:36:16.529579337Z",
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
  "command_id": "7cceb41a-3526-473c-b8b6-022f2c9cee65",
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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:36:17.133767Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "7cceb41a-3526-473c-b8b6-022f2c9cee65",
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
  "changed_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:36:17.133767Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48064955281",
  "device_ref": "sandbox-19134"
}
```

```json
{
  "challenge_id": "b28065f4-9f90-452c-8de3-c1f999e8891f",
  "expires_at": "2026-10-30T13:41:17.767127462Z",
  "resend_available_at": "2026-10-30T13:36:18.767127462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48064955281` → **200**

```json
{
  "phone": "+48064955281",
  "audience": "CLIENT",
  "code": "715902",
  "sent_at": "2026-10-30T13:36:17.77002618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b28065f4-9f90-452c-8de3-c1f999e8891f",
  "code": "715902",
  "device_ref": "sandbox-19134"
}
```

```json
{
  "session_id": "dc87cdf8-529c-45a3-8dd3-f0b679aa6959",
  "subject": {
    "type": "CLIENT",
    "id": "fb60146e-f6e9-483a-aae6-1369d669d0fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjYwMTQ2ZS1mNmU5LTQ4M2EtYWFlNi0xMzY5ZDY2OWQwZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4Mjc4LCJpYXQiOjE3OTMzNjczNzgsImp0aSI6IjkxYTE3NTJmLWEyYTItNGI0MS1hMDM1LTQ4NTJjMWU4M2RkYiIsInNpZCI6ImRjODdjZGY4LTUyOWMtNDVhMy04ZGQzLWYwYjY3OWFhNjk1OSJ9.J5iZLT9IOfMfDRm2mlXyDPCbpqqdmFu5xuG31alWmo4",
  "access_expires_at": "2026-10-30T13:51:18.08632806Z",
  "refresh_token": "V0VvurwBJgq9EQaWk1r9EKe9DFgw-1aGZ2xpqKbjfDY",
  "refresh_expires_at": "2026-11-29T13:36:18.08575257Z",
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
  "correlation_id": "5e13ce03-2806-47d6-94cb-fc2d0b5cbb41"
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
  "device_ref": "sandbox-1226"
}
```

```json
{
  "challenge_id": "dba49735-e2cb-4cda-9064-805900a09740",
  "expires_at": "2026-10-30T13:41:18.982426993Z",
  "resend_available_at": "2026-10-30T13:36:19.982426993Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "739156",
  "sent_at": "2026-10-30T13:36:18.985004715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dba49735-e2cb-4cda-9064-805900a09740",
  "code": "739156",
  "device_ref": "sandbox-1226"
}
```

```json
{
  "session_id": "660bbfdf-4f10-4ec2-9349-c305c7cf90cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI3OSwiaWF0IjoxNzkzMzY3Mzc5LCJqdGkiOiJhZjYwYjMwZC1iN2RlLTRmZGUtYmMxYy1kOTMyMWJmY2IxZTMiLCJzaWQiOiI2NjBiYmZkZi00ZjEwLTRlYzItOTM0OS1jMzA1YzdjZjkwY2MifQ.mto6hlZHYDvZheEAu-rblHs63MYvl6kW3dV1AP76mEg",
  "access_expires_at": "2026-10-30T13:51:19.309038024Z",
  "refresh_token": "5qzl0SOHzjTzpGzHY9pWa85Ir7V9yrmowqYg14RKKiA",
  "refresh_expires_at": "2026-11-29T13:36:19.308456535Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b",
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
  "last_heartbeat_at": "2026-10-30T13:34:56.781286Z",
  "last_location_at": "2026-10-30T13:34:56.781286Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b/handover` → **200**

```json
{
  "command_id": "9e2ba8d8-137f-439d-bd94-fb3ef37796de",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b",
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
  "last_heartbeat_at": "2026-10-30T13:34:56.781286Z",
  "last_location_at": "2026-10-30T13:34:56.781286Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:20Z",
    "sequence": 1793367380235
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b",
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
  "last_heartbeat_at": "2026-10-30T13:36:20.255536Z",
  "last_location_at": "2026-10-30T13:36:20.255536Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b",
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
  "last_heartbeat_at": "2026-10-30T13:36:20.255536Z",
  "last_location_at": "2026-10-30T13:36:20.255536Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/37cc23fa-bfb1-4cd0-894b-c243d4c4fe4b/close` → **200**

```json
{
  "command_id": "82852d7a-bc9e-41f5-b2ba-b07d17ae9e6c",
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
  "correlation_id": "2ea21186-834a-4de1-950c-b2e662142cac"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674000799",
  "device_ref": "sandbox-13358"
}
```

```json
{
  "challenge_id": "0abe2838-c251-4ceb-ab18-14033961c7b4",
  "expires_at": "2026-10-30T13:41:21.762372795Z",
  "resend_available_at": "2026-10-30T13:36:22.762372795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674000799` → **200**

```json
{
  "phone": "+380674000799",
  "audience": "CLIENT",
  "code": "690413",
  "sent_at": "2026-10-30T13:36:21.76492371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0abe2838-c251-4ceb-ab18-14033961c7b4",
  "code": "690413",
  "device_ref": "sandbox-13358"
}
```

```json
{
  "session_id": "c463f2dc-689c-4fc0-a0c8-2828b39cbe5a",
  "subject": {
    "type": "CLIENT",
    "id": "d75b2aa5-408e-4162-998c-1ededafa9ae6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzViMmFhNS00MDhlLTQxNjItOTk4Yy0xZWRlZGFmYTlhZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MjgyLCJpYXQiOjE3OTMzNjczODIsImp0aSI6ImQ4YjhmMDk5LWE4OTgtNGY1MC1hOWFiLTgzMmM5ZDI4NDIzYyIsInNpZCI6ImM0NjNmMmRjLTY4OWMtNGZjMC1hMGM4LTI4MjhiMzljYmU1YSJ9.xkvmCcTJ_PPVvQSA-fea0_p7x7nsM31DY0v9tIV0tvY",
  "access_expires_at": "2026-10-30T13:51:22.079357737Z",
  "refresh_token": "iOh06Ra5LfblRcKmGbdNgso-kEUFvncXK7gMN_SCE10",
  "refresh_expires_at": "2026-11-29T13:36:22.078757611Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "639ff815-0d89-408b-91e3-d1c686cab71d",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "0c23eb17-d5f5-4f55-bc6c-f945b3f5bcbe",
  "upload_path": "/api/rider/v1/uploads/0c23eb17-d5f5-4f55-bc6c-f945b3f5bcbe",
  "expires_at": "2026-10-30T13:51:22.3865243Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/0c23eb17-d5f5-4f55-bc6c-f945b3f5bcbe` → **200**

```json
{
  "file_id": "0c23eb17-d5f5-4f55-bc6c-f945b3f5bcbe",
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
  "command_id": "3ac55f04-858f-485b-9cb4-26e6e63665ce",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "94f75040-6204-4b92-beda-c5f0a593592a",
  "upload_path": "/api/rider/v1/uploads/94f75040-6204-4b92-beda-c5f0a593592a",
  "expires_at": "2026-10-30T13:51:22.717072367Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/94f75040-6204-4b92-beda-c5f0a593592a` → **200**

```json
{
  "file_id": "94f75040-6204-4b92-beda-c5f0a593592a",
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
  "command_id": "051a0a40-8eec-4dae-bf6f-ce24a4bedc25",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
  "upload_path": "/api/rider/v1/uploads/bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
  "expires_at": "2026-10-30T13:51:23.040114297Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/bf57c4fe-1e2c-450e-8328-d4daca57ffd2` → **200**

```json
{
  "file_id": "bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "dafab0bf-7f82-483a-8653-550d7c30a7a0",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "bf57c4fe-1e2c-450e-8328-d4daca57ffd2"
  ]
}
```

```json
{
  "id": "04da6d28-f819-4066-9b22-7a64693763b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:36:23.372666Z",
  "updated_at": "2026-10-30T13:36:23.372666Z",
  "respond_by": "2026-10-30T17:36:23.372666Z",
  "messages": [
    {
      "id": "eea755c4-1bdc-44a7-9a12-f872b0522a54",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:36:23.373808Z",
      "attachments": [
        {
          "file_id": "bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
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
  "session_id": "ad73fc1d-1e92-4d49-9805-bc2692ce562a",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyODMsImlhdCI6MTc5MzM2NzM4MywianRpIjoiM2MxMDExNWMtYThlMC00NWY2LTkxNDYtNWVkNTEzY2E4ZTExIiwic2lkIjoiYWQ3M2ZjMWQtMWU5Mi00ZDQ5LTk4MDUtYmMyNjkyY2U1NjJhIn0.5o5m4u2WllSF-jkxOF26PcO2NksWuWapdsH8t7ageOk",
  "access_expires_at": "2026-10-30T13:51:23.985271137Z",
  "refresh_token": "_mmM1JE9plnvLnusDxfRd9JWnXMMsoVu68XPPc8eWqE",
  "refresh_expires_at": "2026-10-31T01:36:23.984683384Z",
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
  "session_id": "c96920a9-ea18-4f1a-b483-50febad6853f",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyODQsImlhdCI6MTc5MzM2NzM4NCwianRpIjoiZWE1YjA1YjQtNmNjMi00NzVlLThmZGItODVkYmY3YTY3MTViIiwic2lkIjoiYzk2OTIwYTktZWExOC00ZjFhLWI0ODMtNTBmZWJhZDY4NTNmIn0.zIFRIy3VA-WVK3ozkfaxu4IzDRv2VbOCy705yhCD5kM",
  "access_expires_at": "2026-10-30T13:51:24.576983937Z",
  "refresh_token": "wHdrl5csZa9kEeD2rnRa3RQyvnHvTm8iejBPdEnDnQc",
  "refresh_expires_at": "2026-10-31T01:36:24.576392294Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/04da6d28-f819-4066-9b22-7a64693763b4/attachments/bf57c4fe-1e2c-450e-8328-d4daca57ffd2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a3564b2f-6f19-40fe-8487-05b0eb2801bb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f1925e88-c5a9-45ff-9362-cd1069f9cc82",
  "upload_path": "/api/operator/v1/uploads/f1925e88-c5a9-45ff-9362-cd1069f9cc82",
  "expires_at": "2026-10-30T13:51:24.894129996Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f1925e88-c5a9-45ff-9362-cd1069f9cc82` → **200**

```json
{
  "file_id": "f1925e88-c5a9-45ff-9362-cd1069f9cc82",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/04da6d28-f819-4066-9b22-7a64693763b4` → **200**

```json
{
  "id": "04da6d28-f819-4066-9b22-7a64693763b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:36:23.372666Z",
  "updated_at": "2026-10-30T13:36:23.372666Z",
  "respond_by": "2026-10-30T17:36:23.372666Z",
  "messages": [
    {
      "id": "eea755c4-1bdc-44a7-9a12-f872b0522a54",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:36:23.373808Z",
      "attachments": [
        {
          "file_id": "bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/04da6d28-f819-4066-9b22-7a64693763b4/comments` → **200**

```json
{
  "command_id": "5201879e-05e8-49e7-876e-c6a92aaa9c1f",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f1925e88-c5a9-45ff-9362-cd1069f9cc82"
  ]
}
```

```json
{
  "id": "04da6d28-f819-4066-9b22-7a64693763b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:36:23.372666Z",
  "updated_at": "2026-10-30T13:36:25.538474Z",
  "respond_by": "2026-10-30T17:36:23.372666Z",
  "messages": [
    {
      "id": "eea755c4-1bdc-44a7-9a12-f872b0522a54",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:36:23.373808Z",
      "attachments": [
        {
          "file_id": "bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "369caf78-87ef-4da0-b973-246550e672b6",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:36:25.537912Z",
      "attachments": [
        {
          "file_id": "f1925e88-c5a9-45ff-9362-cd1069f9cc82",
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

`GET /api/rider/v1/support/cases/04da6d28-f819-4066-9b22-7a64693763b4` → **200**

```json
{
  "id": "04da6d28-f819-4066-9b22-7a64693763b4",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:36:23.372666Z",
  "updated_at": "2026-10-30T13:36:25.538474Z",
  "respond_by": "2026-10-30T17:36:23.372666Z",
  "messages": [
    {
      "id": "eea755c4-1bdc-44a7-9a12-f872b0522a54",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d75b2aa5-408e-4162-998c-1ededafa9ae6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:36:23.373808Z",
      "attachments": [
        {
          "file_id": "bf57c4fe-1e2c-450e-8328-d4daca57ffd2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "369caf78-87ef-4da0-b973-246550e672b6",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:36:25.537912Z",
      "attachments": [
        {
          "file_id": "f1925e88-c5a9-45ff-9362-cd1069f9cc82",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/04da6d28-f819-4066-9b22-7a64693763b4/attachments/f1925e88-c5a9-45ff-9362-cd1069f9cc82` → **200**

Done: support case 04da6d28-f819-4066-9b22-7a64693763b4, rider attachment bf57c4fe-1e2c-450e-8328-d4daca57ffd2, operator attachment f1925e88-c5a9-45ff-9362-cd1069f9cc82.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737497356",
  "device_ref": "sandbox-10397"
}
```

```json
{
  "challenge_id": "f200aba7-4ad6-4580-b979-ac3c67feea22",
  "expires_at": "2026-10-30T13:41:26.172958828Z",
  "resend_available_at": "2026-10-30T13:36:27.172958828Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737497356` → **200**

```json
{
  "phone": "+380737497356",
  "audience": "CLIENT",
  "code": "462077",
  "sent_at": "2026-10-30T13:36:26.176565036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f200aba7-4ad6-4580-b979-ac3c67feea22",
  "code": "462077",
  "device_ref": "sandbox-10397"
}
```

```json
{
  "session_id": "c10655de-e54e-4303-a9ec-9bb34d44d665",
  "subject": {
    "type": "CLIENT",
    "id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTBkZTdkNS00YmY5LTQyZmQtOGY4ZC1mMmM0MDc3OWIxN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4Mjg2LCJpYXQiOjE3OTMzNjczODYsImp0aSI6IjRlZjkxOTdjLThkN2MtNGE5Ny1hMmRkLTQwMzU5Mzg3Njc1OSIsInNpZCI6ImMxMDY1NWRlLWU1NGUtNDMwMy1hOWVjLTliYjM0ZDQ0ZDY2NSJ9.HJI073q9KI_Xzeir1nNYPg5UyuyXBGzfCzN7kRddfTM",
  "access_expires_at": "2026-10-30T13:51:26.485872247Z",
  "refresh_token": "Ua8f5X0OCSF-wggBSaF4boWblswRQgNdCn3jVv6lJfk",
  "refresh_expires_at": "2026-11-29T13:36:26.485307988Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "093b57f8-7a63-40cd-b585-dc852f9deb34",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cb89f34d-6f40-4c3c-a304-bc20d0b9f66d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cb89f34d-6f40-4c3c-a304-bc20d0b9f66d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9221136da775b614532a074a7c1ac748",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cb89f34d-6f40-4c3c-a304-bc20d0b9f66d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737497356"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cb89f34d-6f40-4c3c-a304-bc20d0b9f66d",
  "expires_at": "2026-10-30T14:06:26.780964Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/cb89f34d-6f40-4c3c-a304-bc20d0b9f66d` → **200**

```json
{
  "id": "cb89f34d-6f40-4c3c-a304-bc20d0b9f66d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:06:26.780964Z",
  "card": {
    "id": "36751bef-d144-475f-892b-08d91d075bd5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2407",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:36:27.083715Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "905223ac-9a4f-4cd9-b7b0-e6ddae4ffe1b",
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
  "id": "a422b857-5a8e-4c09-b9cf-93054d93ace5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:41:27.412031Z",
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
  "command_id": "0f6593dc-3aec-4b83-b060-52fdf6247d42",
  "quote_id": "a422b857-5a8e-4c09-b9cf-93054d93ace5",
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
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598` → **200**

```json
{
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598` → **200**

```json
{
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
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

`GET /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598` → **200**

```json
{
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598/switch-to-cash` → **200**

```json
{
  "command_id": "9b23bbce-14d1-4e98-a670-15a8b24d04a0",
  "expected_version": 3
}
```

```json
{
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598/switch-to-cash` → **409**

```json
{
  "command_id": "50b81340-33cc-4a02-aaba-d1331280ee79",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1a018942-20a6-48c2-84ca-bcc794acfc92"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598` → **200**

```json
{
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9ea647fc-bf18-4206-a4e4-ddcdb4024598/cancel` → **200**

```json
{
  "command_id": "6a0c1821-1966-4c1a-a732-b21b1306552c",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9ea647fc-bf18-4206-a4e4-ddcdb4024598",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e50de7d5-4bf9-42fd-8f8d-f2c40779b17f",
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
  "created_at": "2026-10-30T13:36:27.720093Z",
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
  "session_id": "f5d2a3c7-8fd3-4a9d-a98b-f13ba8a7fef1",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyOTEsImlhdCI6MTc5MzM2NzM5MSwianRpIjoiZDk5YzQ3ZjAtZjgwMC00MThlLTk5N2EtYjA3MDM2ZGE5MzVjIiwic2lkIjoiZjVkMmEzYzctOGZkMy00YTlkLWE5OGItZjEzYmE4YTdmZWYxIn0.xEwRQk-_7lzP2ZOSbYRnJyzOYoTRCwDyy-cXuJrZPM0",
  "access_expires_at": "2026-10-30T13:51:31.567355786Z",
  "refresh_token": "QZmrWTPKVdMoxnmuaBfKgP8nk_23XtqYMZ8iZwaOI-8",
  "refresh_expires_at": "2026-10-31T01:36:31.566767182Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28155"
}
```

```json
{
  "challenge_id": "d9fa1e4d-50eb-4dfd-aef0-87173956f385",
  "expires_at": "2026-10-30T13:41:31.861039498Z",
  "resend_available_at": "2026-10-30T13:36:32.861039498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "344656",
  "sent_at": "2026-10-30T13:36:31.86479016Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9fa1e4d-50eb-4dfd-aef0-87173956f385",
  "code": "344656",
  "device_ref": "sandbox-28155"
}
```

```json
{
  "session_id": "b87c37c6-e581-489d-913f-fc4a083a26e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI5MiwiaWF0IjoxNzkzMzY3MzkyLCJqdGkiOiJkMmVkMjQ2Ni04YzEwLTQ5ODktYTUzOS1lNmU0MzIxYzYzZGQiLCJzaWQiOiJiODdjMzdjNi1lNTgxLTQ4OWQtOTEzZi1mYzRhMDgzYTI2ZTMifQ.VTtdNN2m-GCOtIXdcj20A9YcIWfnsq4ZqeUHY2UmGU0",
  "access_expires_at": "2026-10-30T13:51:32.187288724Z",
  "refresh_token": "KbU8cXweGlIQsAeNvP1E0BvN0zpr4ksUcs_S0KtsuyQ",
  "refresh_expires_at": "2026-11-29T13:36:32.186723523Z",
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
      "actor_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:36:13.791916Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T13:36:15.321895Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "4a7b03ae-4cac-4f9d-918e-659adaec7532",
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
  "device_ref": "sandbox-17431"
}
```

```json
{
  "challenge_id": "fc881bab-cc96-4b6a-aa55-6c7b38742d07",
  "expires_at": "2026-10-30T13:41:33.395906489Z",
  "resend_available_at": "2026-10-30T13:36:34.395906489Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "304781",
  "sent_at": "2026-10-30T13:36:33.398552869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc881bab-cc96-4b6a-aa55-6c7b38742d07",
  "code": "304781",
  "device_ref": "sandbox-17431"
}
```

```json
{
  "session_id": "095394d3-0d04-4ffa-94f5-9ad5b89d7aa9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI5MywiaWF0IjoxNzkzMzY3MzkzLCJqdGkiOiJhYjI3YjU2My0yMTllLTQ1YzItOGRiMy0wMzdjYjYzYzJkZmYiLCJzaWQiOiIwOTUzOTRkMy0wZDA0LTRmZmEtOTRmNS05YWQ1Yjg5ZDdhYTkifQ.S8tH_7LokUOGAw6VpCqSbsUvUzJO9msREmYsxB7O7M0",
  "access_expires_at": "2026-10-30T13:51:33.726167708Z",
  "refresh_token": "EFPMiPgTcC2Id1LEG5Nzxw5SJbaWVrDHsxS-0UiLwUI",
  "refresh_expires_at": "2026-11-29T13:36:33.725604039Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:35:52.432334Z",
  "last_location_at": "2026-10-30T13:35:52.432334Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/22461ba4-556a-43d0-bf2f-a239d5b8f4d8/handover` → **200**

```json
{
  "command_id": "d24d03c1-02f6-4598-bcdd-4fc899ee681f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:35:52.432334Z",
  "last_location_at": "2026-10-30T13:35:52.432334Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/22461ba4-556a-43d0-bf2f-a239d5b8f4d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:41Z",
    "sequence": 1793367401661
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:36:41.681619Z",
  "last_location_at": "2026-10-30T13:36:41.681619Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "command_id": "8096b8db-a08a-4bff-87ba-082426e01519",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:42Z",
    "sequence": 1793367402288
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "705f9c11-0060-4c0a-b1c1-b2688959cf16",
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
  "last_heartbeat_at": "2026-10-30T13:36:42.307726Z",
  "last_location_at": "2026-10-30T13:36:42.307726Z",
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
  "session_id": "f4c126b0-58cf-40cb-8ebc-9a31d954151f",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgzMDIsImlhdCI6MTc5MzM2NzQwMiwianRpIjoiOTExZjEzODItMWM5OC00NmUzLWFiOGItZmExN2NiMjgwOGVmIiwic2lkIjoiZjRjMTI2YjAtNThjZi00MGNiLThlYmMtOWEzMWQ5NTQxNTFmIn0.uJsoc866kdZH6FtVEbTEQTm6czz4KkBMPJ5mAe2EB-0",
  "access_expires_at": "2026-10-30T13:51:42.904882719Z",
  "refresh_token": "p1f-hd2BiNV8zUjTnEw6tZIdglBQgjNOtlsB33qG1X8",
  "refresh_expires_at": "2026-10-31T01:36:42.90427547Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2c35836c-479f-4275-a70d-3d6ae3e49cc6",
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
  "id": "c35619af-216f-4d19-91bf-cbb4c7d7803d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:41:43.200651Z",
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
  "command_id": "27845645-f9cf-4983-ba49-03a8535208e5",
  "quote_id": "c35619af-216f-4d19-91bf-cbb4c7d7803d",
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
  "id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
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
  "created_at": "2026-10-30T13:36:43.516001Z",
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
    "id": "5838fae1-8d47-4c22-b2fb-69569baee883",
    "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
    "expires_at": "2026-10-30T13:36:58.520381Z",
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

`POST /api/driver/v1/offers/5838fae1-8d47-4c22-b2fb-69569baee883/accept` → **200**

```json
{
  "command_id": "63341c24-101d-47a0-a7d0-3a29dd7ab97c"
}
```

```json
{
  "id": "15423a1a-0ba0-4883-a251-ca8a32fdac7e",
  "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be",
  "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
  "assignment_id": "15423a1a-0ba0-4883-a251-ca8a32fdac7e",
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

(the car drives 9 s to the next point)

`POST /api/driver/v1/work-sessions/705f9c11-0060-4c0a-b1c1-b2688959cf16/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:54Z",
    "sequence": 1793367414513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "705f9c11-0060-4c0a-b1c1-b2688959cf16",
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
  "last_heartbeat_at": "2026-10-30T13:36:54.070264Z",
  "last_location_at": "2026-10-30T13:36:54.070264Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be/arrive` → **200**

```json
{
  "command_id": "a9bcb8ad-b3ef-4571-a913-371290b12e44",
  "expected_version": 0
}
```

```json
{
  "id": "e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be",
  "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
  "assignment_id": "15423a1a-0ba0-4883-a251-ca8a32fdac7e",
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
  "arrived_at": "2026-10-30T13:36:54.3743Z",
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

`POST /api/driver/v1/trips/e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be/start` → **200**

```json
{
  "command_id": "b8d306bf-0d1a-4794-bc8a-febdda03a20c",
  "expected_version": 1
}
```

```json
{
  "id": "e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be",
  "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
  "assignment_id": "15423a1a-0ba0-4883-a251-ca8a32fdac7e",
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
  "arrived_at": "2026-10-30T13:36:54.3743Z",
  "started_at": "2026-10-30T13:36:54.688117Z",
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

`POST /api/driver/v1/trips/e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be/complete` → **200**

```json
{
  "command_id": "b88faff5-b7a6-4b87-9ebe-3d92d4c7b1f6",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:36:54Z",
  "cash_received": true
}
```

```json
{
  "id": "e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be",
  "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
  "assignment_id": "15423a1a-0ba0-4883-a251-ca8a32fdac7e",
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
  "arrived_at": "2026-10-30T13:36:54.3743Z",
  "started_at": "2026-10-30T13:36:54.688117Z",
  "completed_at": "2026-10-30T13:36:54.998397Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/eacf7b00-7bb6-43d9-8cf6-b757924417d2` → **200**

```json
{
  "id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
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
    "id": "15423a1a-0ba0-4883-a251-ca8a32fdac7e",
    "order_id": "eacf7b00-7bb6-43d9-8cf6-b757924417d2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e6f9e6bf-b7ba-4bc2-8722-0f0730b6a4be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:36:43.516001Z",
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
  "session_id": "22461ba4-556a-43d0-bf2f-a239d5b8f4d8",
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
  "last_heartbeat_at": "2026-10-30T13:36:41.681619Z",
  "last_location_at": "2026-10-30T13:36:41.681619Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/22461ba4-556a-43d0-bf2f-a239d5b8f4d8/close` → **200**

```json
{
  "command_id": "a723fe14-1cdc-4c0d-936d-64c2c209d447",
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
  "session_id": "705f9c11-0060-4c0a-b1c1-b2688959cf16",
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
  "last_heartbeat_at": "2026-10-30T13:36:54.070264Z",
  "last_location_at": "2026-10-30T13:36:54.070264Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/705f9c11-0060-4c0a-b1c1-b2688959cf16/close` → **200**

```json
{
  "command_id": "d7fd6992-fc3b-4f39-8395-e7cc01f76bf2",
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

Done: terminal order eacf7b00-7bb6-43d9-8cf6-b757924417d2 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7427"
}
```

```json
{
  "challenge_id": "3448fd10-7a7d-4993-ab33-bd7769ee6fe9",
  "expires_at": "2026-10-30T13:42:00.118786751Z",
  "resend_available_at": "2026-10-30T13:37:01.118786751Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "422587",
  "sent_at": "2026-10-30T13:37:00.121990485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3448fd10-7a7d-4993-ab33-bd7769ee6fe9",
  "code": "422587",
  "device_ref": "sandbox-7427"
}
```

```json
{
  "session_id": "2a2ddd1f-ffb2-40f1-9df5-9393f560d548",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODMyMCwiaWF0IjoxNzkzMzY3NDIwLCJqdGkiOiIxMjE1NDY4YS1jNWQ5LTRlN2ItOWEwNi1lZThkNjAxNThmZDQiLCJzaWQiOiIyYTJkZGQxZi1mZmIyLTQwZjEtOWRmNS05MzkzZjU2MGQ1NDgifQ.dpB3K5p2ed4jpkR7zu8Iine6ox8ALE8ELPuxHH5J0vQ",
  "access_expires_at": "2026-10-30T13:52:00.445040605Z",
  "refresh_token": "3Gt4qMYoSvfJZD8sDFxPQX_IWodgYHwJ_gzkA7R5EK8",
  "refresh_expires_at": "2026-11-29T13:37:00.44447257Z",
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
  "device_ref": "sandbox-9038"
}
```

```json
{
  "challenge_id": "545a1e03-9539-419b-92b0-455ee10cb94b",
  "expires_at": "2026-10-30T13:42:01.034548379Z",
  "resend_available_at": "2026-10-30T13:37:02.034548379Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "866346",
  "sent_at": "2026-10-30T13:37:01.037212571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "545a1e03-9539-419b-92b0-455ee10cb94b",
  "code": "866346",
  "device_ref": "sandbox-9038"
}
```

```json
{
  "session_id": "69bbf76f-70de-43d4-a874-daec9e694bf2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODMyMSwiaWF0IjoxNzkzMzY3NDIxLCJqdGkiOiI0ZjJhM2RhNS1jYjhhLTQ5MzYtYTM4Yi02MjEzY2VjMWNhNDciLCJzaWQiOiI2OWJiZjc2Zi03MGRlLTQzZDQtYTg3NC1kYWVjOWU2OTRiZjIifQ.n4X7nM9XATsBnkgnDVmlUdjmdrqAxNrrwg9LIQO6cvo",
  "access_expires_at": "2026-10-30T13:52:01.365709737Z",
  "refresh_token": "37IKmnonu2Spm6f9Q8STHejZeUpbSpxA6jLdhmTmRLQ",
  "refresh_expires_at": "2026-11-29T13:37:01.365087291Z",
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
  "device_ref": "sandbox-29379"
}
```

```json
{
  "challenge_id": "9e4919cf-803a-4eca-aadc-f29fbbf053c5",
  "expires_at": "2026-10-30T13:42:01.9753371Z",
  "resend_available_at": "2026-10-30T13:37:02.9753371Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "366650",
  "sent_at": "2026-10-30T13:37:01.978005299Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e4919cf-803a-4eca-aadc-f29fbbf053c5",
  "code": "366650",
  "device_ref": "sandbox-29379"
}
```

```json
{
  "session_id": "bf978886-d0ed-4bfc-84cc-8fa3480aa3dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODMyMiwiaWF0IjoxNzkzMzY3NDIyLCJqdGkiOiI4YTkwNWJiMi0xNjQ1LTQwYTItYjI0MC1lNGZlYjlhYWRiNzUiLCJzaWQiOiJiZjk3ODg4Ni1kMGVkLTRiZmMtODRjYy04ZmEzNDgwYWEzZGMifQ.9dPxNRh3EGuXQr_qXSxmqoC5GuZCE0EQBJNkYvT8Skk",
  "access_expires_at": "2026-10-30T13:52:02.305109665Z",
  "refresh_token": "ARPixii1kDHdoQSSexk9b3VvgzoP3EsW7Q1o1GbCgiw",
  "refresh_expires_at": "2026-11-29T13:37:02.304549734Z",
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
  "phone": "+380690449702",
  "device_ref": "sandbox-28179"
}
```

```json
{
  "challenge_id": "6d33a581-6b09-41c7-8e68-cf8009c8f996",
  "expires_at": "2026-10-30T13:42:02.867787234Z",
  "resend_available_at": "2026-10-30T13:37:03.867787234Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380690449702` → **200**

```json
{
  "phone": "+380690449702",
  "audience": "CLIENT",
  "code": "347029",
  "sent_at": "2026-10-30T13:37:02.87030852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d33a581-6b09-41c7-8e68-cf8009c8f996",
  "code": "347029",
  "device_ref": "sandbox-28179"
}
```

```json
{
  "session_id": "98716039-8f39-4769-97ae-59a587b67d55",
  "subject": {
    "type": "CLIENT",
    "id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWI4MmI3Ny0zNGU1LTQ2NzAtYjQzYy0wYmI3YjlkMWIzZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MzIzLCJpYXQiOjE3OTMzNjc0MjMsImp0aSI6IjcyODVhNjhkLTQ2MmItNDdjZC1hZjI2LTA1OTUyNmMwOGZkYSIsInNpZCI6Ijk4NzE2MDM5LThmMzktNDc2OS05N2FlLTU5YTU4N2I2N2Q1NSJ9.nbCJe05lV6hpJ9rRDkVjfHcYhKW0Smnga4FFJazff2M",
  "access_expires_at": "2026-10-30T13:52:03.18680489Z",
  "refresh_token": "ejaPu-459rrSY9fPq5Q3x5jjjfbeQ9nNyqUdtQ6QSBk",
  "refresh_expires_at": "2026-11-29T13:37:03.186198834Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc86b8f9-ec8c-4889-9c3e-f105876bf24b",
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
  "id": "57b041aa-80b7-45c4-a1c4-22ffb3694e75",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:42:03.483665Z",
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
  "command_id": "1e618fac-d8bf-4f0b-ad7e-51cf6a17f4ea",
  "quote_id": "57b041aa-80b7-45c4-a1c4-22ffb3694e75",
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
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:37:03.827753Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:37:03.827753Z",
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
  "blizz_dispatch_excluded_total": 12,
  "blizz_sms_sent_total": 78
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 12.390039897
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.26123096
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.209831313
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 71.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/2d09134f-cf9b-4bb6-bf18-4651c33e7a40` → **200**

```json
{
  "id": "2d09134f-cf9b-4bb6-bf18-4651c33e7a40",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c1b82b77-34e5-4670-b43c-0bb7b9d1b3f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:37:03.827753Z",
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
  "session_id": "f530c634-0eaa-428b-9330-0d97ff671435",
  "subject": {
    "type": "STAFF",
    "id": "e963184c-985d-415a-89ba-c19f43a7b34d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTYzMTg0Yy05ODVkLTQxNWEtODliYS1jMTlmNDNhN2IzNGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjg1MTEsImlhdCI6MTc5MzM2NzYxMSwianRpIjoiYWZjODg5NjAtODU5Ny00Yjc0LTg5YzctM2E1ZjZjMDBjZGFkIiwic2lkIjoiZjUzMGM2MzQtMGVhYS00MjhiLTkzMzAtMGQ5N2ZmNjcxNDM1In0.Lg7le3rus1BOJ30u-Za0J5xHkXaBP9pBxbQsKzTV6lY",
  "access_expires_at": "2026-10-30T13:55:11.266357262Z",
  "refresh_token": "nH_WAz3V5TQKPpDjqyqM2GXofrlzBJU0jq5wcNrzmu0",
  "refresh_expires_at": "2026-10-31T01:40:11.26537215Z",
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
  "id": "3867b38c-7262-4e80-9cc3-464eebd34e8c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:11.584799Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:11.584837Z",
  "updated_at": "2026-10-30T13:40:11.605401Z",
  "finished_at": "2026-10-30T13:40:11.605401Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/3867b38c-7262-4e80-9cc3-464eebd34e8c` → **200**

```json
{
  "run": {
    "id": "3867b38c-7262-4e80-9cc3-464eebd34e8c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:40:11.584799Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:40:11.584837Z",
    "updated_at": "2026-10-30T13:40:11.605401Z",
    "finished_at": "2026-10-30T13:40:11.605401Z",
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
  "id": "3867b38c-7262-4e80-9cc3-464eebd34e8c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:11.584799Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:11.584837Z",
  "updated_at": "2026-10-30T13:40:11.605401Z",
  "finished_at": "2026-10-30T13:40:11.605401Z",
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
  "id": "3867b38c-7262-4e80-9cc3-464eebd34e8c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:11.584799Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:11.584837Z",
  "updated_at": "2026-10-30T13:40:11.605401Z",
  "finished_at": "2026-10-30T13:40:11.605401Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/83221607-7ad7-41d7-afc5-6de33121e669` → **204**

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
  "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:12.095102Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:12.095136Z",
  "updated_at": "2026-10-30T13:40:12.103139Z",
  "finished_at": "2026-10-30T13:40:12.103139Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/a0b1bcea-de15-4db6-b894-deb8fc9f58cd` → **200**

```json
{
  "run": {
    "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:40:12.095102Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:40:12.095136Z",
    "updated_at": "2026-10-30T13:40:12.103139Z",
    "finished_at": "2026-10-30T13:40:12.103139Z",
    "version": 1
  },
  "items": [
    {
      "id": "7388182e-22f2-4d87-a44d-f27354d2851c",
      "run_id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "c50d213d61448169b25aacf47a30d7b303df9127344d7a3be4b93dd337951ccf",
      "reference_display": "sandbox-reconciliation-#####-7ad7-41d7-afc5-6de#####e669",
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
      "provider_at": "2026-10-30T13:40:12Z",
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
  "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:12.095102Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:12.095136Z",
  "updated_at": "2026-10-30T13:40:12.103139Z",
  "finished_at": "2026-10-30T13:40:12.103139Z",
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
  "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:12.095102Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:12.095136Z",
  "updated_at": "2026-10-30T13:40:12.103139Z",
  "finished_at": "2026-10-30T13:40:12.103139Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/7388182e-22f2-4d87-a44d-f27354d2851c/resolve` → **200**

```json
{
  "command_id": "c1ec8b46-8df6-4d26-8e84-7a809b45c8fa",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7388182e-22f2-4d87-a44d-f27354d2851c",
  "run_id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "c50d213d61448169b25aacf47a30d7b303df9127344d7a3be4b93dd337951ccf",
  "reference_display": "sandbox-reconciliation-#####-7ad7-41d7-afc5-6de#####e669",
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
  "provider_at": "2026-10-30T13:40:12Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "resolved_at": "2026-10-30T13:40:12.54844Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7388182e-22f2-4d87-a44d-f27354d2851c/resolve` → **200**

```json
{
  "command_id": "c1ec8b46-8df6-4d26-8e84-7a809b45c8fa",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7388182e-22f2-4d87-a44d-f27354d2851c",
  "run_id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "c50d213d61448169b25aacf47a30d7b303df9127344d7a3be4b93dd337951ccf",
  "reference_display": "sandbox-reconciliation-#####-7ad7-41d7-afc5-6de#####e669",
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
  "provider_at": "2026-10-30T13:40:12Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
  "resolved_at": "2026-10-30T13:40:12.54844Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7388182e-22f2-4d87-a44d-f27354d2851c/resolve` → **409**

```json
{
  "command_id": "9468497f-e516-44c7-bf6e-0d6b9313d4c8",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/7388182e-22f2-4d87-a44d-f27354d2851c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fd6944da-e155-4673-a67e-aac1038fa48a"
}
```

`GET /api/admin/v1/payment-reconciliations/a0b1bcea-de15-4db6-b894-deb8fc9f58cd` → **200**

```json
{
  "run": {
    "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:40:12.095102Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:40:12.095136Z",
    "updated_at": "2026-10-30T13:40:12.54844Z",
    "finished_at": "2026-10-30T13:40:12.103139Z",
    "version": 2
  },
  "items": [
    {
      "id": "7388182e-22f2-4d87-a44d-f27354d2851c",
      "run_id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "c50d213d61448169b25aacf47a30d7b303df9127344d7a3be4b93dd337951ccf",
      "reference_display": "sandbox-reconciliation-#####-7ad7-41d7-afc5-6de#####e669",
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
      "provider_at": "2026-10-30T13:40:12Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "e963184c-985d-415a-89ba-c19f43a7b34d",
      "resolved_at": "2026-10-30T13:40:12.54844Z",
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
      "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:40:12.095102Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:40:12.095136Z",
      "updated_at": "2026-10-30T13:40:12.54844Z",
      "finished_at": "2026-10-30T13:40:12.103139Z",
      "version": 2
    },
    {
      "id": "a1242b8c-b5a9-40a6-a0e1-992da2db7737",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T13:20:44.24137Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:20:44.241469Z",
      "updated_at": "2026-10-30T13:20:44.247504Z",
      "finished_at": "2026-10-30T13:20:44.247504Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/83221607-7ad7-41d7-afc5-6de33121e669` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "a0b1bcea-de15-4db6-b894-deb8fc9f58cd",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:40:12.095102Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:40:12.095136Z",
  "updated_at": "2026-10-30T13:40:12.54844Z",
  "finished_at": "2026-10-30T13:40:12.103139Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793367739639E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793367740105E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793367740106E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793367739642E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793367740106E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
