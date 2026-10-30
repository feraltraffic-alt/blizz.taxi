# Sandbox transcript (2026-10-30T10:05:48Z, 72c4002)

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
  "correlation_id": "c610c7b3-09e4-422e-b840-706eb5a0bf7e"
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
  "session_id": "64d0a76a-5b14-4576-ba2b-395f04397d22",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NTYsImlhdCI6MTc5MzM1NDc1NiwianRpIjoiMWRkODU3NGMtZjk0ZC00ZmY3LWJhYzItYzA0YWNhMDgyYTU5Iiwic2lkIjoiNjRkMGE3NmEtNWIxNC00NTc2LWJhMmItMzk1ZjA0Mzk3ZDIyIn0.MjtO-0GOmKjU7yh_ulhBY3hXWiuvX7cQi5szdkhdw9U",
  "access_expires_at": "2026-10-30T10:20:56.69193281Z",
  "refresh_token": "il7-9gpaicNHydJrcVgPTXDASUnDi_yht3W0NC-kmLI",
  "refresh_expires_at": "2026-10-30T22:05:56.689129786Z",
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
  "session_id": "04f657df-2f4d-4e35-8266-f104f1059b77",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NTgsImlhdCI6MTc5MzM1NDc1OCwianRpIjoiZDY2MDg5ZWItY2VkMi00MGU3LThiNjEtNGFiMWEzMjViYjJjIiwic2lkIjoiMDRmNjU3ZGYtMmY0ZC00ZTM1LTgyNjYtZjEwNGYxMDU5Yjc3In0.qUTXHgTIzXKDQjCUhWeSQBjgaQwDLIrDjcFCPo0zpVg",
  "access_expires_at": "2026-10-30T10:20:58.660017894Z",
  "refresh_token": "AFKAk-NfXl3bkY75wr-8-bKZTV3XZPBPhNFzcT7g554",
  "refresh_expires_at": "2026-10-30T22:05:58.65874555Z",
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
  "device_ref": "sandbox-30942"
}
```

```json
{
  "challenge_id": "c0c72a8d-f033-4d45-9469-56be8e0ef2e2",
  "expires_at": "2026-10-30T10:10:59.251713845Z",
  "resend_available_at": "2026-10-30T10:06:00.251713845Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "928536",
  "sent_at": "2026-10-30T10:05:59.26633988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0c72a8d-f033-4d45-9469-56be8e0ef2e2",
  "code": "928536",
  "device_ref": "sandbox-30942"
}
```

```json
{
  "session_id": "52125a14-15ae-45f2-900e-da38e9695789",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTY1OSwiaWF0IjoxNzkzMzU0NzU5LCJqdGkiOiJhMTU3ZTMwMC04MDM2LTQ1YjQtOGU5Ni04OTJiOTQ2OWJmMzAiLCJzaWQiOiI1MjEyNWExNC0xNWFlLTQ1ZjItOTAwZS1kYTM4ZTk2OTU3ODkifQ.UV3qkhNYb2xiJ5x9FNruMIUG8uYagsVZN7uxHlpD5ck",
  "access_expires_at": "2026-10-30T10:20:59.588560472Z",
  "refresh_token": "0ZdlHVOhlZtGonnYk_7nHEzMKY7toq5Vxyf-22kCaFA",
  "refresh_expires_at": "2026-11-29T10:05:59.587531652Z",
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
  "command_id": "346c0a25-b3ef-426e-9507-7b61b6fdce00",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:00Z",
    "sequence": 1793354760139
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fb41c9c-14ac-4848-9a2b-5de942a131a9",
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
  "last_heartbeat_at": "2026-10-30T10:06:00.263729Z",
  "last_location_at": "2026-10-30T10:06:00.263729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636226877",
  "device_ref": "sandbox-18356"
}
```

```json
{
  "challenge_id": "e09fa558-c649-48e3-8773-feede4931853",
  "expires_at": "2026-10-30T10:11:00.560531332Z",
  "resend_available_at": "2026-10-30T10:06:01.560531332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636226877` → **200**

```json
{
  "phone": "+380636226877",
  "audience": "CLIENT",
  "code": "662216",
  "sent_at": "2026-10-30T10:06:00.565051352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e09fa558-c649-48e3-8773-feede4931853",
  "code": "662216",
  "device_ref": "sandbox-18356"
}
```

```json
{
  "session_id": "a9744fc2-2b2d-48fc-93b2-c1f6200ee522",
  "subject": {
    "type": "CLIENT",
    "id": "64a0f58b-0e94-484e-b8e9-802d8451a8d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGEwZjU4Yi0wZTk0LTQ4NGUtYjhlOS04MDJkODQ1MWE4ZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjYwLCJpYXQiOjE3OTMzNTQ3NjAsImp0aSI6ImE0MDczODRmLWE2NGMtNDhjNy04MmI2LTg3OWM3NGRhNGI2ZSIsInNpZCI6ImE5NzQ0ZmMyLTJiMmQtNDhmYy05M2IyLWMxZjYyMDBlZTUyMiJ9.Aw_SBg0-c-mjI3Nc7OKnWQzUlgSvfj5T6I_JNKfTu6U",
  "access_expires_at": "2026-10-30T10:21:00.866311517Z",
  "refresh_token": "W5_5kKekHk3FPZgDKFTOPQkNmn21ui1HGq-FeD9lD5g",
  "refresh_expires_at": "2026-11-29T10:06:00.865377175Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73f71f99-0e7f-49f1-a8c9-c15e8476e4bf",
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
  "id": "808b9374-6020-4c38-a642-fc092764b8d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:01.185776Z",
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
  "command_id": "facc8c65-6f50-42ce-86b5-d02d1b694d94",
  "quote_id": "808b9374-6020-4c38-a642-fc092764b8d9",
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
  "id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64a0f58b-0e94-484e-b8e9-802d8451a8d5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:06:01.553281Z",
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
    "id": "fea4b6a4-8fdc-415a-a64f-f1ac11b2ef29",
    "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
    "expires_at": "2026-10-30T10:06:16.562701Z",
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

`POST /api/driver/v1/offers/fea4b6a4-8fdc-415a-a64f-f1ac11b2ef29/accept` → **200**

```json
{
  "command_id": "27bfdb05-2e57-460d-accd-ffac9e655e5c"
}
```

```json
{
  "id": "077f47e8-ebf4-48ec-875b-7a6f37a2648d",
  "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7119a68-0c15-4fd8-85ad-73d095ee2997",
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
  "command_id": "64a9c343-5fcf-445a-a027-74b783f557f8",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T10:06:02.741823181Z"
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
  "id": "c7119a68-0c15-4fd8-85ad-73d095ee2997",
  "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
  "assignment_id": "077f47e8-ebf4-48ec-875b-7a6f37a2648d",
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

`POST /api/driver/v1/work-sessions/6fb41c9c-14ac-4848-9a2b-5de942a131a9/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:03Z",
    "sequence": 1793354763585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6fb41c9c-14ac-4848-9a2b-5de942a131a9",
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
  "last_heartbeat_at": "2026-10-30T10:06:03.610515Z",
  "last_location_at": "2026-10-30T10:06:03.610515Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c7119a68-0c15-4fd8-85ad-73d095ee2997/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "46398807-557e-4ea9-a461-f5ee45d93bae",
  "expected_version": 0
}
```

```json
{
  "id": "c7119a68-0c15-4fd8-85ad-73d095ee2997",
  "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
  "assignment_id": "077f47e8-ebf4-48ec-875b-7a6f37a2648d",
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
  "arrived_at": "2026-10-30T10:06:03.907218Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c7119a68-0c15-4fd8-85ad-73d095ee2997/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e3bcba16-ddb4-4c24-8b01-599fa12f135f",
  "expected_version": 1
}
```

```json
{
  "id": "c7119a68-0c15-4fd8-85ad-73d095ee2997",
  "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
  "assignment_id": "077f47e8-ebf4-48ec-875b-7a6f37a2648d",
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
  "arrived_at": "2026-10-30T10:06:03.907218Z",
  "started_at": "2026-10-30T10:06:04.189557Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c7119a68-0c15-4fd8-85ad-73d095ee2997/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3061740b-c257-4ab9-a258-b0d7e8259d81",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:04Z",
  "cash_received": true
}
```

```json
{
  "id": "c7119a68-0c15-4fd8-85ad-73d095ee2997",
  "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
  "assignment_id": "077f47e8-ebf4-48ec-875b-7a6f37a2648d",
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
  "arrived_at": "2026-10-30T10:06:03.907218Z",
  "started_at": "2026-10-30T10:06:04.189557Z",
  "completed_at": "2026-10-30T10:06:04.489726Z",
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
  "session_id": "6fb41c9c-14ac-4848-9a2b-5de942a131a9",
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
  "last_heartbeat_at": "2026-10-30T10:06:03.610515Z",
  "last_location_at": "2026-10-30T10:06:03.610515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fb41c9c-14ac-4848-9a2b-5de942a131a9/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2678a65c-b785-4f21-be3d-5d49d8e9a8cc",
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
  "command_id": "4e0d7f8f-207e-459f-a11f-337a77625e22",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:05Z",
    "sequence": 1793354765385
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
  "correlation_id": "76e474a0-ef8a-49f1-8c4b-3e5afdc344f5",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "5ce008a7-02a8-4edd-9976-2f9c170ad5d7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:05Z",
    "sequence": 1793354765673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "178ea43b-5556-4240-8ddd-aac62d01abfc",
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
  "last_heartbeat_at": "2026-10-30T10:06:05.694041Z",
  "last_location_at": "2026-10-30T10:06:05.694041Z",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T10:06:02.741823Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4528b0a9-d72d-4201-921d-0936f0de5e04",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T10:06:06.251086535Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "178ea43b-5556-4240-8ddd-aac62d01abfc",
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
  "last_heartbeat_at": "2026-10-30T10:06:05.694041Z",
  "last_location_at": "2026-10-30T10:06:05.694041Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/178ea43b-5556-4240-8ddd-aac62d01abfc/close` → **200**

```json
{
  "command_id": "ecb84530-e1d4-4ecd-b8e9-53716e2a502a",
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
  "session_id": "0bf69ebe-4bf0-49f7-aa77-6c530fefc92a",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NjcsImlhdCI6MTc5MzM1NDc2NywianRpIjoiZWYyMzMyNTQtZTk2Ny00ZWI0LWJkMWItMWMzMTdiYjFlNGEzIiwic2lkIjoiMGJmNjllYmUtNGJmMC00OWY3LWFhNzctNmM1MzBmZWZjOTJhIn0.A8I6ozskjxhi9LUoF7Oivnu6yp-lBRjQw6b1JiX6ENo",
  "access_expires_at": "2026-10-30T10:21:07.427125395Z",
  "refresh_token": "lZU7M1Gwk4XPrUz9sd7vLVYN5lJXtbMHPPoGNSjtGJ0",
  "refresh_expires_at": "2026-10-30T22:06:07.426210128Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "15ae2e70-a6da-4f6a-852d-e972f5b4e12c",
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
  "id": "2bd118b4-ec87-4a6b-a21c-3031b26e1ce7",
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
  "created_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "created_at": "2026-10-30T10:06:07.708081Z",
  "updated_at": "2026-10-30T10:06:07.708081Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636062795",
  "device_ref": "sandbox-5560"
}
```

```json
{
  "challenge_id": "86a8a2f2-1096-49c2-90a7-19b50e893e7c",
  "expires_at": "2026-10-30T10:11:07.992939997Z",
  "resend_available_at": "2026-10-30T10:06:08.992939997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636062795` → **200**

```json
{
  "phone": "+380636062795",
  "audience": "CLIENT",
  "code": "370204",
  "sent_at": "2026-10-30T10:06:07.997592541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86a8a2f2-1096-49c2-90a7-19b50e893e7c",
  "code": "370204",
  "device_ref": "sandbox-5560"
}
```

```json
{
  "session_id": "d4544a45-3d69-4cd9-ada5-9cd54c94a893",
  "subject": {
    "type": "CLIENT",
    "id": "0143f442-98a0-4a97-86f0-013491cd0e3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTQzZjQ0Mi05OGEwLTRhOTctODZmMC0wMTM0OTFjZDBlM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NjY4LCJpYXQiOjE3OTMzNTQ3NjgsImp0aSI6ImZiNDA4NmVkLWZiMzEtNDRiZC1hNGI5LTA0ODIwODIyODQ5ZSIsInNpZCI6ImQ0NTQ0YTQ1LTNkNjktNGNkOS1hZGE1LTljZDU0Yzk0YTg5MyJ9.4L4szBAw-2XAsZGotOz_F_akKpH9zw43kB6FW6YUsTE",
  "access_expires_at": "2026-10-30T10:21:08.288228987Z",
  "refresh_token": "jQKzBzbY9AtgQp8kIX6hbiGbq7EBGmgseZlrspU0mjg",
  "refresh_expires_at": "2026-11-29T10:06:08.287174873Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636062795` → **200**

```json
{
  "client_id": "0143f442-98a0-4a97-86f0-013491cd0e3e"
}
```

`POST /api/admin/v1/rider-wallets/0143f442-98a0-4a97-86f0-013491cd0e3e/top-ups` → **201**

```json
{
  "command_id": "352375ce-fd11-4f26-bc3c-3e382c1bb2e6",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "0143f442-98a0-4a97-86f0-013491cd0e3e",
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
      "id": "f2d149c1-fb8f-47e2-8028-e31f1be5b124",
      "at": "2026-10-30T10:06:08.821361Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d36d6bd2-ea65-4e77-9c62-7e06e2c34e95",
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
  "id": "c8fc4d0d-a608-4c74-92d6-0f53527f45d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:09.122178Z",
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
      "id": "2bd118b4-ec87-4a6b-a21c-3031b26e1ce7",
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
  "device_ref": "sandbox-18524"
}
```

```json
{
  "challenge_id": "b9f719b3-fbd5-4ec9-a7b2-8d89ca734324",
  "expires_at": "2026-10-30T10:11:09.401814732Z",
  "resend_available_at": "2026-10-30T10:06:10.401814732Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "779843",
  "sent_at": "2026-10-30T10:06:09.406054363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9f719b3-fbd5-4ec9-a7b2-8d89ca734324",
  "code": "779843",
  "device_ref": "sandbox-18524"
}
```

```json
{
  "session_id": "beccbbe0-ba39-4a0e-8c2d-d11900686a4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTY2OSwiaWF0IjoxNzkzMzU0NzY5LCJqdGkiOiI0NjU3MzQ0MC03ZjVhLTQxM2UtYmNlZS00YWNhNzU0ZGM3NWEiLCJzaWQiOiJiZWNjYmJlMC1iYTM5LTRhMGUtOGMyZC1kMTE5MDA2ODZhNGEifQ.LcVX67aNuKEw_sdYlja3Vp5DeNkYzIxnr1Sr4pCmrKI",
  "access_expires_at": "2026-10-30T10:21:09.921521698Z",
  "refresh_token": "MCP7K60D6SlliRrnCS7n07XMmm9e2AN_p3PaswWZMhI",
  "refresh_expires_at": "2026-11-29T10:06:09.920465309Z",
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
  "command_id": "9250aaf0-d730-4697-8298-c356e310d49d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:10Z",
    "sequence": 1793354770466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64b08d09-864c-4016-a1af-30d7b8abd7b5",
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
  "last_heartbeat_at": "2026-10-30T10:06:10.486755Z",
  "last_location_at": "2026-10-30T10:06:10.486755Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "50321e75-a052-4b94-9dde-dd442b1e8869",
  "quote_id": "c8fc4d0d-a608-4c74-92d6-0f53527f45d2",
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
  "id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0143f442-98a0-4a97-86f0-013491cd0e3e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:06:10.775962Z",
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
  "client_id": "0143f442-98a0-4a97-86f0-013491cd0e3e",
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
      "id": "f2d149c1-fb8f-47e2-8028-e31f1be5b124",
      "at": "2026-10-30T10:06:08.821361Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
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
    "id": "fda7b78b-fddc-467c-ba6a-46d92f38a415",
    "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
    "expires_at": "2026-10-30T10:06:25.785686Z",
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

`POST /api/driver/v1/offers/fda7b78b-fddc-467c-ba6a-46d92f38a415/accept` → **200**

```json
{
  "command_id": "f56c8910-7db4-49e0-bd70-8ea4fb0a1480"
}
```

```json
{
  "id": "548c0738-7318-4447-b115-ae0ce09ba19b",
  "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2f040bf8-cacc-4f62-9dd2-6c27ebd0badc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2f040bf8-cacc-4f62-9dd2-6c27ebd0badc",
  "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
  "assignment_id": "548c0738-7318-4447-b115-ae0ce09ba19b",
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

`POST /api/driver/v1/work-sessions/64b08d09-864c-4016-a1af-30d7b8abd7b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:12Z",
    "sequence": 1793354772149
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64b08d09-864c-4016-a1af-30d7b8abd7b5",
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
  "last_heartbeat_at": "2026-10-30T10:06:12.169088Z",
  "last_location_at": "2026-10-30T10:06:12.169088Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2f040bf8-cacc-4f62-9dd2-6c27ebd0badc/arrive` → **200**

```json
{
  "command_id": "55a0438f-b65b-4c41-8d73-525191e67655",
  "expected_version": 0
}
```

```json
{
  "id": "2f040bf8-cacc-4f62-9dd2-6c27ebd0badc",
  "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
  "assignment_id": "548c0738-7318-4447-b115-ae0ce09ba19b",
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
  "arrived_at": "2026-10-30T10:06:12.450035Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2f040bf8-cacc-4f62-9dd2-6c27ebd0badc/start` → **200**

```json
{
  "command_id": "795d5795-78f0-4a6f-a326-e93ecee46ff2",
  "expected_version": 1
}
```

```json
{
  "id": "2f040bf8-cacc-4f62-9dd2-6c27ebd0badc",
  "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
  "assignment_id": "548c0738-7318-4447-b115-ae0ce09ba19b",
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
  "arrived_at": "2026-10-30T10:06:12.450035Z",
  "started_at": "2026-10-30T10:06:12.738877Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2f040bf8-cacc-4f62-9dd2-6c27ebd0badc/complete` → **200**

```json
{
  "command_id": "f5ef2fe9-8f48-493e-8642-cd6980e0d8ee",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:13Z",
  "cash_received": true
}
```

```json
{
  "id": "2f040bf8-cacc-4f62-9dd2-6c27ebd0badc",
  "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
  "assignment_id": "548c0738-7318-4447-b115-ae0ce09ba19b",
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
  "arrived_at": "2026-10-30T10:06:12.450035Z",
  "started_at": "2026-10-30T10:06:12.738877Z",
  "completed_at": "2026-10-30T10:06:13.048351Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0143f442-98a0-4a97-86f0-013491cd0e3e",
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
      "id": "18d7758a-5331-464b-bbc5-d2ee4b5fdaff",
      "at": "2026-10-30T10:06:13.873707Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2"
    },
    {
      "id": "f2d149c1-fb8f-47e2-8028-e31f1be5b124",
      "at": "2026-10-30T10:06:08.821361Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2bd118b4-ec87-4a6b-a21c-3031b26e1ce7/archive` → **200**

```json
{
  "command_id": "cd8b8f8e-bc33-4cea-81e5-8f99a04b81d3",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2bd118b4-ec87-4a6b-a21c-3031b26e1ce7",
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
  "created_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "created_at": "2026-10-30T10:06:07.708081Z",
  "updated_at": "2026-10-30T10:06:16.638947Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64b08d09-864c-4016-a1af-30d7b8abd7b5",
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
  "last_heartbeat_at": "2026-10-30T10:06:12.169088Z",
  "last_location_at": "2026-10-30T10:06:12.169088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/64b08d09-864c-4016-a1af-30d7b8abd7b5/close` → **200**

```json
{
  "command_id": "3a86578c-26db-4626-89e1-2961672c25f1",
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

Done: order 7bf95c76-b348-4e06-a3e9-ec5723cbdff2.

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
  "session_id": "325b0ceb-ae94-4005-8d6c-3091236c6d0a",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NzcsImlhdCI6MTc5MzM1NDc3NywianRpIjoiMjMwYTMyMzMtMDMxNy00OWZhLWEzNDYtNDYyMDc3MjZiMWU2Iiwic2lkIjoiMzI1YjBjZWItYWU5NC00MDA1LThkNmMtMzA5MTIzNmM2ZDBhIn0.JUECIx9SrBcfBFb4Kln9rj0nkyvGcr6sla3qdjxpUTA",
  "access_expires_at": "2026-10-30T10:21:17.801968927Z",
  "refresh_token": "hKIK2AotGza8VQolfekT6RQOdbd9m_sTbTXDpbbAy14",
  "refresh_expires_at": "2026-10-30T22:06:17.801199089Z",
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
  "command_id": "67f69e2a-05fd-4323-8a56-c43409ccb676",
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
  "session_id": "93b75034-6ace-49e4-add0-30a86cc3b2a7",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2NzgsImlhdCI6MTc5MzM1NDc3OCwianRpIjoiOGI3NWVjMTEtZWQ2ZS00M2YyLWE3N2UtNjA0MDZlNmQzNWRhIiwic2lkIjoiOTNiNzUwMzQtNmFjZS00OWU0LWFkZDAtMzBhODZjYzNiMmE3In0.cBvuBbTbf9TK3ekzexwyBROze6kEOA0PU9xIncL3vNk",
  "access_expires_at": "2026-10-30T10:21:18.963158502Z",
  "refresh_token": "cw1X5s6xm5sDltY3i8YC9GEwvGm-7Cbg6nVuqypDCQE",
  "refresh_expires_at": "2026-10-30T22:06:18.962450113Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.219919380",
    "linkedid": "1730052700.219919380",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673280758"
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
    "id": "1730052700.219919380",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "1a1414f0-8b9e-45af-a9df-22fd57dbf09a",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.231679Z",
      "answered_at": null,
      "ended_at": "2026-10-30T10:06:19.257156Z",
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
    "id": "1730052600.8155698",
    "linkedid": "1730052600.8155698",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673280758"
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
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/474be2af-00a7-4d8b-bab1-97908e802a8f/answer` → **200**

```json
{
  "command_id": "d5012e67-8d8e-42dc-b718-579967b0281b"
}
```

```json
{
  "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673280758",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "order_ids": [],
  "started_at": "2026-10-30T10:06:19.56046Z",
  "answered_at": "2026-10-30T10:06:19.869132Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.8155698",
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
    "id": "1730052600.8155698",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": "2026-10-30T10:06:19.869132Z",
      "ended_at": "2026-10-30T10:06:20.16598Z",
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
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": "2026-10-30T10:06:19.869132Z",
      "ended_at": "2026-10-30T10:06:20.16598Z",
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
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": "2026-10-30T10:06:19.869132Z",
      "ended_at": "2026-10-30T10:06:20.16598Z",
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
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": "2026-10-30T10:06:19.869132Z",
      "ended_at": "2026-10-30T10:06:20.16598Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:06:26.506832Z"
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
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": "2026-10-30T10:06:19.869132Z",
      "ended_at": "2026-10-30T10:06:20.16598Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:06:26.506832Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/474be2af-00a7-4d8b-bab1-97908e802a8f/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/474be2af-00a7-4d8b-bab1-97908e802a8f/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=474be2af-00a7-4d8b-bab1-97908e802a8f` → **200**

```json
{
  "changes": [
    {
      "id": "806bf629-a51e-46f0-a28c-4c3c84cba540",
      "occurred_at": "2026-10-30T10:06:27.598033Z",
      "actor_type": "STAFF",
      "actor_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c2d9a0e5-7732-49de-86fc-d812a135800b\", \"order_ids\": []}",
      "correlation_id": "263159a1-0819-4ca1-9934-bc51d196b5db"
    },
    {
      "id": "396180ee-4bf0-4776-94c8-3dd2cedd631b",
      "occurred_at": "2026-10-30T10:06:27.568016Z",
      "actor_type": "STAFF",
      "actor_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"c2d9a0e5-7732-49de-86fc-d812a135800b\", \"order_ids\": []}",
      "correlation_id": "b648277e-bb44-4b9e-8fc2-03746e5cadb3"
    }
  ]
}
```

Done: call 474be2af-00a7-4d8b-bab1-97908e802a8f recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8887"
}
```

```json
{
  "challenge_id": "3df6e1e1-3b11-4731-ad0f-0e12fe6abcbb",
  "expires_at": "2026-10-30T10:11:27.909012791Z",
  "resend_available_at": "2026-10-30T10:06:28.909012791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "598291",
  "sent_at": "2026-10-30T10:06:27.913288781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3df6e1e1-3b11-4731-ad0f-0e12fe6abcbb",
  "code": "598291",
  "device_ref": "sandbox-8887"
}
```

```json
{
  "session_id": "3ab45a44-5b2a-43fb-92ef-dc645df6e10b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTY4OCwiaWF0IjoxNzkzMzU0Nzg4LCJqdGkiOiIzYjA3MmY2MS1jMjg2LTRhOTctYjQyNC01YzFhYWNmYzNhODAiLCJzaWQiOiIzYWI0NWE0NC01YjJhLTQzZmItOTJlZi1kYzY0NWRmNmUxMGIifQ.zO139GftG7ztjroibwsH2U__zZ85WEe2TZMEMg3A-xM",
  "access_expires_at": "2026-10-30T10:21:28.218611754Z",
  "refresh_token": "cKNeEehGtMhIafISijcrbaHKKAbafI_G2kg1Yp4Vs1g",
  "refresh_expires_at": "2026-11-29T10:06:28.217647198Z",
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
  "command_id": "0d7ac523-0188-46e4-b0d0-80fd94afebc6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:28Z",
    "sequence": 1793354788740
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87518b5a-1aea-41c4-b86c-8c6ab8dca32c",
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
  "last_heartbeat_at": "2026-10-30T10:06:28.761592Z",
  "last_location_at": "2026-10-30T10:06:28.761592Z",
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
  "session_id": "6cb8daef-937a-42fc-9f17-a5bd61eaccdd",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2ODksImlhdCI6MTc5MzM1NDc4OSwianRpIjoiMGZiMTMwYTAtZjljMy00YTMzLTlhYWMtOGQ5ZmRhZjE0Nzg3Iiwic2lkIjoiNmNiOGRhZWYtOTM3YS00MmZjLTlmMTctYTViZDYxZWFjY2RkIn0.EJKgrS6h4eEFTbYLw1x3HI__biI2pkTFU6PpvcuQtUw",
  "access_expires_at": "2026-10-30T10:21:29.357795679Z",
  "refresh_token": "FxIdwljvkEBVPIT_JOyD9VfylH05kRBxv0SvbjUlSTE",
  "refresh_expires_at": "2026-10-30T22:06:29.357136173Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "16f22676-4077-47c3-990d-eff46cb6010c",
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
  "id": "060189a4-2683-4e9b-a36e-ba623caeb0e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:29.637269Z",
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
  "command_id": "97f01144-9320-4240-a115-1f5f4d205177",
  "quote_id": "060189a4-2683-4e9b-a36e-ba623caeb0e5",
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
    "phone": "+380673264428"
  }
}
```

```json
{
  "id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
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
  "created_at": "2026-10-30T10:06:29.941149Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673264428"
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
    "id": "17414324-28bb-45a9-ad6e-08361e38621a",
    "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
    "expires_at": "2026-10-30T10:06:44.946994Z",
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

`POST /api/driver/v1/offers/17414324-28bb-45a9-ad6e-08361e38621a/accept` → **200**

```json
{
  "command_id": "f1215589-b11e-4e5e-a2ca-d306d677129d"
}
```

```json
{
  "id": "bda4ee0a-f44f-498e-9ff5-5751e9b169b3",
  "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea57dede-82f4-407d-a9b1-8a9b5259eb0d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea57dede-82f4-407d-a9b1-8a9b5259eb0d",
  "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
  "assignment_id": "bda4ee0a-f44f-498e-9ff5-5751e9b169b3",
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
    "phone": "+380673264428"
  }
}
```

`POST /api/driver/v1/work-sessions/87518b5a-1aea-41c4-b86c-8c6ab8dca32c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:32Z",
    "sequence": 1793354792150
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87518b5a-1aea-41c4-b86c-8c6ab8dca32c",
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
  "last_heartbeat_at": "2026-10-30T10:06:32.169234Z",
  "last_location_at": "2026-10-30T10:06:32.169234Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea57dede-82f4-407d-a9b1-8a9b5259eb0d/arrive` → **200**

```json
{
  "command_id": "4e551dbe-806b-41e5-bdd7-84b552e21dcf",
  "expected_version": 0
}
```

```json
{
  "id": "ea57dede-82f4-407d-a9b1-8a9b5259eb0d",
  "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
  "assignment_id": "bda4ee0a-f44f-498e-9ff5-5751e9b169b3",
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
  "arrived_at": "2026-10-30T10:06:32.443104Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673264428"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  },
  {
    "phone": "+380673264428",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:33.770562951Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  },
  {
    "phone": "+380673264428",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:33.770562951Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673264428` → **200**

```json
[
  {
    "phone": "+380673264428",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:31.760979527Z"
  },
  {
    "phone": "+380673264428",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T10:06:33.770562951Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/ea57dede-82f4-407d-a9b1-8a9b5259eb0d/start` → **200**

```json
{
  "command_id": "12a1f3be-3ef1-433c-8d44-1ea5fe7f8ce3",
  "expected_version": 1
}
```

```json
{
  "id": "ea57dede-82f4-407d-a9b1-8a9b5259eb0d",
  "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
  "assignment_id": "bda4ee0a-f44f-498e-9ff5-5751e9b169b3",
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
  "arrived_at": "2026-10-30T10:06:32.443104Z",
  "started_at": "2026-10-30T10:06:34.853005Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673264428"
  }
}
```

`POST /api/driver/v1/trips/ea57dede-82f4-407d-a9b1-8a9b5259eb0d/complete` → **200**

```json
{
  "command_id": "5a7f546d-6d0f-4bdd-9989-3cb23c92277e",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:35Z",
  "cash_received": true
}
```

```json
{
  "id": "ea57dede-82f4-407d-a9b1-8a9b5259eb0d",
  "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
  "assignment_id": "bda4ee0a-f44f-498e-9ff5-5751e9b169b3",
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
  "arrived_at": "2026-10-30T10:06:32.443104Z",
  "started_at": "2026-10-30T10:06:34.853005Z",
  "completed_at": "2026-10-30T10:06:35.135114Z",
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
  "session_id": "87518b5a-1aea-41c4-b86c-8c6ab8dca32c",
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
  "last_heartbeat_at": "2026-10-30T10:06:32.169234Z",
  "last_location_at": "2026-10-30T10:06:32.169234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/87518b5a-1aea-41c4-b86c-8c6ab8dca32c/close` → **200**

```json
{
  "command_id": "6f15ed6f-1baa-4b15-b9c6-bf21691e3072",
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
  "phone": "+380633886711",
  "device_ref": "sandbox-31764"
}
```

```json
{
  "challenge_id": "c4ef95c0-a202-4dc4-983e-cbc258ccd30d",
  "expires_at": "2026-10-30T10:11:35.972965954Z",
  "resend_available_at": "2026-10-30T10:06:36.972965954Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633886711` → **200**

```json
{
  "phone": "+380633886711",
  "audience": "CLIENT",
  "code": "215893",
  "sent_at": "2026-10-30T10:06:35.976756697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4ef95c0-a202-4dc4-983e-cbc258ccd30d",
  "code": "215893",
  "device_ref": "sandbox-31764"
}
```

```json
{
  "session_id": "92604c03-98f1-4c00-9260-73b65df53f77",
  "subject": {
    "type": "CLIENT",
    "id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjA3YzViMi03NmQxLTQ2NTctYTRmZi0xMGM1MTA2YjkxZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Njk2LCJpYXQiOjE3OTMzNTQ3OTYsImp0aSI6ImU3ZTE0MjA1LTU2MDQtNGRjMi1hYzc1LTMwZWUxNGE0OWViYSIsInNpZCI6IjkyNjA0YzAzLTk4ZjEtNGMwMC05MjYwLTczYjY1ZGY1M2Y3NyJ9.__nvmJdj2xoiX4CW_HYb7i7XFFdpUGudJT3j9L5tpo4",
  "access_expires_at": "2026-10-30T10:21:36.267198392Z",
  "refresh_token": "FBySJkwhtIM4hmt9zb46mJfJDx5yXuF-Hc0zrvD2QZs",
  "refresh_expires_at": "2026-11-29T10:06:36.266501721Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-25416"
}
```

```json
{
  "challenge_id": "c61781c0-2d1c-4421-b51f-45fc73ed2788",
  "expires_at": "2026-10-30T10:11:36.811241734Z",
  "resend_available_at": "2026-10-30T10:06:37.811241734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "120614",
  "sent_at": "2026-10-30T10:06:36.814264753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c61781c0-2d1c-4421-b51f-45fc73ed2788",
  "code": "120614",
  "device_ref": "sandbox-25416"
}
```

```json
{
  "session_id": "5ecce413-f657-4d35-adc3-fb2150db5641",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTY5NywiaWF0IjoxNzkzMzU0Nzk3LCJqdGkiOiJmZDViMzJhYi00YmRkLTQzMTMtODlkNS1mM2FlNmRhNjAxMzkiLCJzaWQiOiI1ZWNjZTQxMy1mNjU3LTRkMzUtYWRjMy1mYjIxNTBkYjU2NDEifQ.Ilf3CqiB_zF0cmjUqaBqpphOE2qNrRv_wo2hrrqxFrk",
  "access_expires_at": "2026-10-30T10:21:37.105572721Z",
  "refresh_token": "Y0FHIP8YKJmLgrxFqchbh6ooTiYmvsseSS74Y3wwYcE",
  "refresh_expires_at": "2026-11-29T10:06:37.10473274Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
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
  "session_id": "c40c322b-2a9f-4ac8-9150-0d91b2ee8700",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2OTcsImlhdCI6MTc5MzM1NDc5NywianRpIjoiMGQzZTQxZDYtYWMxYi00ZTNhLWE1OTYtY2IxYWNiZGFiN2I0Iiwic2lkIjoiYzQwYzMyMmItMmE5Zi00YWM4LTkxNTAtMGQ5MWIyZWU4NzAwIn0.W8_H8pKxZS_I-dFH_81bULPRjMQtySy3cN3CPynMdYs",
  "access_expires_at": "2026-10-30T10:21:37.950937073Z",
  "refresh_token": "cSqp2i4U2F8ikpk-EdFMyx4wf21T1Sb1E4YP32CAhU8",
  "refresh_expires_at": "2026-10-30T22:06:37.950390978Z",
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
  "session_id": "8f217988-4e52-4b22-80bf-cc9fdee627d6",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU2OTgsImlhdCI6MTc5MzM1NDc5OCwianRpIjoiMDU2ODg2NjktZTI1ZS00OWY4LTg2NGYtMzA2NDkyOWE0NDY0Iiwic2lkIjoiOGYyMTc5ODgtNGU1Mi00YjIyLTgwYmYtY2M5ZmRlZTYyN2Q2In0.xUlVk_qCiqcki1xLi-BW88jyqxKfls0_aPcvNnBIUOU",
  "access_expires_at": "2026-10-30T10:21:38.539450006Z",
  "refresh_token": "aXple7qJxwtCmvxHcjrTrSI4owXSfFPwnjJ4FTwr89U",
  "refresh_expires_at": "2026-10-30T22:06:38.538657011Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "edeb0b2a-3bd7-47b2-b5df-8867f4ae010c",
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
  "id": "5f4ef48f-09cd-4653-8d5c-fdfee07ebd4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:39.092035Z",
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
  "command_id": "c6140816-a87a-4134-880b-62adbad9f30e",
  "quote_id": "5f4ef48f-09cd-4653-8d5c-fdfee07ebd4d",
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
  "id": "11e0e8c9-ad53-4539-875b-2256bd313802",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff",
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
  "created_at": "2026-10-30T10:06:39.375658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/11e0e8c9-ad53-4539-875b-2256bd313802` → **200**

```json
{
  "id": "11e0e8c9-ad53-4539-875b-2256bd313802",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff",
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
  "created_at": "2026-10-30T10:06:39.375658Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/11e0e8c9-ad53-4539-875b-2256bd313802/cancel` → **200**

```json
{
  "command_id": "372a25ef-0c32-4fb3-9bac-05bbec066882",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "11e0e8c9-ad53-4539-875b-2256bd313802",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff",
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
  "created_at": "2026-10-30T10:06:39.375658Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "6a8982d2-3d30-4341-ad1c-25de5ea549fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:40Z",
    "sequence": 1793354800516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8f5a3c3b-881c-4605-906f-c3c8c0f0859b",
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
  "last_heartbeat_at": "2026-10-30T10:06:40.535959Z",
  "last_location_at": "2026-10-30T10:06:40.535959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13648"
}
```

```json
{
  "challenge_id": "1b59f4e4-7c27-46d5-a4f3-d6590c9c7581",
  "expires_at": "2026-10-30T10:11:40.840600959Z",
  "resend_available_at": "2026-10-30T10:06:41.840600959Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "801482",
  "sent_at": "2026-10-30T10:06:40.844061167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b59f4e4-7c27-46d5-a4f3-d6590c9c7581",
  "code": "801482",
  "device_ref": "sandbox-13648"
}
```

```json
{
  "session_id": "cb9352b6-bf35-4279-bba5-9de22341b1d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcwMSwiaWF0IjoxNzkzMzU0ODAxLCJqdGkiOiIxNTFmMDhiZC1jOTlkLTRiOGMtODY5OC00MWRjMzliNmVjOGEiLCJzaWQiOiJjYjkzNTJiNi1iZjM1LTQyNzktYmJhNS05ZGUyMjM0MWIxZDkifQ.Tfhrr2MEiDv5RF8hPeLdtcOkxXKxjUGqrFQ-WLjkiFM",
  "access_expires_at": "2026-10-30T10:21:41.14100878Z",
  "refresh_token": "-T5B7STjjw_2YKdWoY5K6-LPn3ptaqlUlCipAEp9cm4",
  "refresh_expires_at": "2026-11-29T10:06:41.140413309Z",
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
  "command_id": "e36cc597-eee8-4226-a253-b0f28253b6e9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:41Z",
    "sequence": 1793354801682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:06:41.701201Z",
  "last_location_at": "2026-10-30T10:06:41.701201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb4b408e-fcd8-4b39-b080-48e7b938c5e3",
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
  "id": "3040c64a-7a73-454c-b4a2-4c7b60a065a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:41.978256Z",
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
  "command_id": "da824b9d-c95b-413c-a2a2-ff2e0cefa817",
  "quote_id": "3040c64a-7a73-454c-b4a2-4c7b60a065a5",
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
  "id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff",
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
  "created_at": "2026-10-30T10:06:42.264949Z",
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
    "id": "9ed41c8d-b566-4bea-bdaa-930abac32acc",
    "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
    "expires_at": "2026-10-30T10:06:57.268962Z",
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

`POST /api/driver/v1/offers/9ed41c8d-b566-4bea-bdaa-930abac32acc/accept` → **200**

```json
{
  "command_id": "8c2fbebc-c915-4b19-b197-c9aa9073cfcc"
}
```

```json
{
  "id": "67d9c7ca-3a24-4da2-9ea6-7b7e9bf42902",
  "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cff93088-60f5-4be8-b267-643c6170008e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cff93088-60f5-4be8-b267-643c6170008e",
  "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "assignment_id": "67d9c7ca-3a24-4da2-9ea6-7b7e9bf42902",
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

`POST /api/driver/v1/trips/cff93088-60f5-4be8-b267-643c6170008e/cancel` → **200**

```json
{
  "command_id": "f179bffb-a809-4d11-adce-fcdad25c484d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cff93088-60f5-4be8-b267-643c6170008e",
  "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "assignment_id": "67d9c7ca-3a24-4da2-9ea6-7b7e9bf42902",
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

`GET /api/rider/v1/orders/5483547c-aa1a-4045-bfab-085db9d48bd7` → **200**

```json
{
  "id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff",
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
    "id": "67d9c7ca-3a24-4da2-9ea6-7b7e9bf42902",
    "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cff93088-60f5-4be8-b267-643c6170008e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:06:42.264949Z",
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
    "id": "63655c66-c22c-4c25-b839-f9a2fec30327",
    "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
    "expires_at": "2026-10-30T10:06:58.397401Z",
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

`POST /api/driver/v1/offers/63655c66-c22c-4c25-b839-f9a2fec30327/accept` → **200**

```json
{
  "command_id": "5e4fb661-4431-4f47-bf70-e8a0de28f7bd"
}
```

```json
{
  "id": "0795dae6-d5a4-4249-8f5c-867009313737",
  "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "621f24c1-1251-4ee1-b98b-7d6223bdb9cb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "621f24c1-1251-4ee1-b98b-7d6223bdb9cb",
  "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "assignment_id": "0795dae6-d5a4-4249-8f5c-867009313737",
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

`POST /api/driver/v1/trips/621f24c1-1251-4ee1-b98b-7d6223bdb9cb/cancel` → **200**

```json
{
  "command_id": "4050bab2-c217-4bd6-ae8e-ced8750fe699",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "621f24c1-1251-4ee1-b98b-7d6223bdb9cb",
  "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
  "assignment_id": "0795dae6-d5a4-4249-8f5c-867009313737",
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
    "id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:06:42.264949Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "11e0e8c9-ad53-4539-875b-2256bd313802",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:06:39.375658Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/5483547c-aa1a-4045-bfab-085db9d48bd7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:06:42.265783Z",
      "actor": {
        "type": "CLIENT",
        "id": "8207c5b2-76d1-4657-a4ff-10c5106b91ff",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
        "quote_id": "3040c64a-7a73-454c-b4a2-4c7b60a065a5",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "f63a9125-6551-43f1-a64f-9328e8b96617"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:06:42.268097Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
        "attempt_id": "69747a35-ab07-4099-b91e-8e8d78478f78",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f63a9125-6551-43f1-a64f-9328e8b96617"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:06:42.274629Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9ed41c8d-b566-4bea-bdaa-930abac32acc",
        "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "f63a9125-6551-43f1-a64f-9328e8b96617"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:06:42.827775Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9ed41c8d-b566-4bea-bdaa-930abac32acc",
        "order_id": "5483547c-aa1a-4045-bfab-085db9d48bd7",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "67d9c7ca-3a24-4da2-9ea6-7b7e9bf42902"
      },
      "correlation_id": "61d666c9-415f-487a-a7ae-a5b787a60c85"
```

Done: orders 11e0e8c9-ad53-4539-875b-2256bd313802, 5483547c-aa1a-4045-bfab-085db9d48bd7.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737294668",
  "device_ref": "sandbox-15677"
}
```

```json
{
  "challenge_id": "f238f85a-e3ad-4e2d-8cb0-0918b9e0faa0",
  "expires_at": "2026-10-30T10:11:45.6464463Z",
  "resend_available_at": "2026-10-30T10:06:46.6464463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737294668` → **200**

```json
{
  "phone": "+380737294668",
  "audience": "CLIENT",
  "code": "167207",
  "sent_at": "2026-10-30T10:06:45.649693092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f238f85a-e3ad-4e2d-8cb0-0918b9e0faa0",
  "code": "167207",
  "device_ref": "sandbox-15677"
}
```

```json
{
  "session_id": "678af098-1ea9-49f3-9182-4a239b82d9ed",
  "subject": {
    "type": "CLIENT",
    "id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZGZjYzNkNC03ZDU1LTQ2N2QtYTY1Ny00ZDg3YTlhZDc1YjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzA1LCJpYXQiOjE3OTMzNTQ4MDUsImp0aSI6IjVhYWQ2YTFjLWE0NDQtNDU3NC1hM2IyLWE1NzZkMTUzNzZlOCIsInNpZCI6IjY3OGFmMDk4LTFlYTktNDlmMy05MTgyLTRhMjM5YjgyZDllZCJ9.aie4VcKJMhIGl9Li1y1e_C9jIT84H4IfW2aM9DICNq4",
  "access_expires_at": "2026-10-30T10:21:45.947385826Z",
  "refresh_token": "G-xxule_JKfRJDQCwbBf5uvLdhfe1b-elCIxIo4aKdw",
  "refresh_expires_at": "2026-11-29T10:06:45.946653944Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "067f7525-97fe-4ead-8eed-f05376facb56",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1215b0cf-3af8-467d-9d44-691aaa31a1f8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1215b0cf-3af8-467d-9d44-691aaa31a1f8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fb4b31ee2286831c5a2716bc36b929d6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1215b0cf-3af8-467d-9d44-691aaa31a1f8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737294668"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1215b0cf-3af8-467d-9d44-691aaa31a1f8",
  "expires_at": "2026-10-30T10:36:46.228163Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1215b0cf-3af8-467d-9d44-691aaa31a1f8` → **200**

```json
{
  "id": "1215b0cf-3af8-467d-9d44-691aaa31a1f8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:36:46.228163Z",
  "card": {
    "id": "456993e2-9b7d-4578-8231-c9ad6a8347b7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4522",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:06:46.516362Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "456993e2-9b7d-4578-8231-c9ad6a8347b7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4522",
      "card_type": "Visa",
      "created_at": "2026-10-30T10:06:46.516362Z"
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
  "device_ref": "sandbox-8827"
}
```

```json
{
  "challenge_id": "8d8dcaeb-d2aa-4df7-9a89-d18a69cab9a0",
  "expires_at": "2026-10-30T10:11:47.068942673Z",
  "resend_available_at": "2026-10-30T10:06:48.068942673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "408626",
  "sent_at": "2026-10-30T10:06:47.072377185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d8dcaeb-d2aa-4df7-9a89-d18a69cab9a0",
  "code": "408626",
  "device_ref": "sandbox-8827"
}
```

```json
{
  "session_id": "eaf95bd9-f0cb-48c4-9d03-0a6b69e640ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTcwNywiaWF0IjoxNzkzMzU0ODA3LCJqdGkiOiJmMzM2YWQwNC00NDViLTRlZTgtODU5NC1lNGVkM2Q2Nzg3MmYiLCJzaWQiOiJlYWY5NWJkOS1mMGNiLTQ4YzQtOWQwMy0wYTZiNjllNjQwYWIifQ.6u5U0hEnQpL9mLaupDIRSqbGa4iLelN_bwQcW69kBpA",
  "access_expires_at": "2026-10-30T10:21:47.36296304Z",
  "refresh_token": "nuxC67SlbrrtSH2WBuTJE60vFbc6CHwrPF_rWqt7C28",
  "refresh_expires_at": "2026-11-29T10:06:47.362293362Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:06:41.701201Z",
  "last_location_at": "2026-10-30T10:06:41.701201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5949ba10-8443-4a00-9880-3405f283e40f/handover` → **200**

```json
{
  "command_id": "834c55cb-de06-4e57-92d4-6315a5789582",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:06:41.701201Z",
  "last_location_at": "2026-10-30T10:06:41.701201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5949ba10-8443-4a00-9880-3405f283e40f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:48Z",
    "sequence": 1793354808196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:06:48.214841Z",
  "last_location_at": "2026-10-30T10:06:48.214841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "260b1aee-210f-4320-845d-b022456bbc96",
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
  "id": "97b1e589-1c69-4dba-9ef2-7e87ef109cef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:11:48.510135Z",
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
  "command_id": "3c934d11-9290-49b4-898f-6e5dbb980b6a",
  "quote_id": "97b1e589-1c69-4dba-9ef2-7e87ef109cef",
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
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
  "created_at": "2026-10-30T10:06:48.795206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd` → **200**

```json
{
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
  "created_at": "2026-10-30T10:06:48.795206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd` → **200**

```json
{
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
  "created_at": "2026-10-30T10:06:48.795206Z",
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
    "id": "c2559e8a-b2e7-4456-9c8b-b37a4001cc30",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "expires_at": "2026-10-30T10:07:04.156984Z",
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

`POST /api/driver/v1/offers/c2559e8a-b2e7-4456-9c8b-b37a4001cc30/accept` → **200**

```json
{
  "command_id": "0a706e13-fd41-4fd0-8f1b-69afed10f0b0"
}
```

```json
{
  "id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "assignment_id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
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

`POST /api/driver/v1/work-sessions/5949ba10-8443-4a00-9880-3405f283e40f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:06:51Z",
    "sequence": 1793354811444
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:06:51.46277Z",
  "last_location_at": "2026-10-30T10:06:51.46277Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b175fc2-d28f-4409-9c9b-2ddd664bc3fc/arrive` → **200**

```json
{
  "command_id": "23dee42c-e158-43cb-a2d7-b5317bab874d",
  "expected_version": 0
}
```

```json
{
  "id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "assignment_id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
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
  "arrived_at": "2026-10-30T10:06:51.744634Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b175fc2-d28f-4409-9c9b-2ddd664bc3fc/start` → **200**

```json
{
  "command_id": "ad767dcd-4c78-4e29-b152-2d6dee0de7fa",
  "expected_version": 1
}
```

```json
{
  "id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "assignment_id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
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
  "arrived_at": "2026-10-30T10:06:51.744634Z",
  "started_at": "2026-10-30T10:06:52.028569Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b175fc2-d28f-4409-9c9b-2ddd664bc3fc/complete` → **200**

```json
{
  "command_id": "302a31bc-242c-4429-b9bc-ce1838327626",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:06:52Z",
  "cash_received": true
}
```

```json
{
  "id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "assignment_id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
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
  "arrived_at": "2026-10-30T10:06:51.744634Z",
  "started_at": "2026-10-30T10:06:52.028569Z",
  "completed_at": "2026-10-30T10:06:52.319218Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd` → **200**

```json
{
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
    "id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:06:48.795206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd` → **200**

```json
{
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
    "id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:06:48.795206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd` → **200**

```json
{
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
    "id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:06:48.795206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd` → **200**

```json
{
  "id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
    "id": "c76b710a-9abb-43b5-992e-d11094c38b9f",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b175fc2-d28f-4409-9c9b-2ddd664bc3fc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:06:48.795206Z",
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

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd/tip` → **200**

```json
{
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
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
  "available_until": "2026-10-31T10:06:52.319218Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd/tip` → **201**

```json
{
  "command_id": "b4fb2e03-4313-49d8-b989-b25cc25b37f9",
  "amount_minor": 2500
}
```

```json
{
  "id": "bcd6985b-702e-4103-9d05-a67c58c9562f",
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T10:06:57.291672Z"
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd/tip` → **200**

```json
{
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
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
  "available_until": "2026-10-31T10:06:52.319218Z",
  "open": false,
  "tip": {
    "id": "bcd6985b-702e-4103-9d05-a67c58c9562f",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T10:06:57.291672Z"
  }
}
```

`GET /api/rider/v1/orders/519de86e-daa4-498a-92d3-09b603f40abd/tip` → **200**

```json
{
  "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
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
  "available_until": "2026-10-31T10:06:52.319218Z",
  "open": false,
  "tip": {
    "id": "bcd6985b-702e-4103-9d05-a67c58c9562f",
    "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T10:06:57.291672Z"
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
      "id": "1c9364ef-391c-48a4-9da0-af85ea37da42",
      "at": "2026-10-30T10:06:53.244038Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
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
      "id": "8ca5c791-3990-4958-8286-cdf4ff1190c7",
      "at": "2026-10-30T10:06:59.309905Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
      "counterpart_id": null
    },
    {
      "id": "1c9364ef-391c-48a4-9da0-af85ea37da42",
      "at": "2026-10-30T10:06:53.244038Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ffeae5e8-35a5-4f27-952e-9fe703a4e9be",
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
  "id": "6a5a1248-6b7c-4c42-a209-8bcc7dea16e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:00.668449Z",
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
  "session_id": "786c35d2-fa50-4057-9a12-798a24525820",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3MjEsImlhdCI6MTc5MzM1NDgyMSwianRpIjoiMjU0MzY4N2UtM2RiMi00NzM2LTk2MTYtN2RjMDRiNDI0YzU2Iiwic2lkIjoiNzg2YzM1ZDItZmE1MC00MDU3LTlhMTItNzk4YTI0NTI1ODIwIn0.dKtasWZxoWMxLAwnrsKv70gCxaukpTWO5R23itbGlmQ",
  "access_expires_at": "2026-10-30T10:22:01.269181926Z",
  "refresh_token": "9u7-7kbN_fWP7wHpq4Od0PUaxS1UWGTx4QVwLAUZoOs",
  "refresh_expires_at": "2026-10-30T22:07:01.268703327Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737294668` → **200**

```json
{
  "client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2"
}
```

`POST /api/admin/v1/rider-wallets/1dfcc3d4-7d55-467d-a657-4d87a9ad75b2/top-ups` → **201**

```json
{
  "command_id": "4a7ce514-043e-4efb-bcdf-af0be8b8e529",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
      "id": "941e311b-b0cf-4683-8e14-c962e3b9b77a",
      "at": "2026-10-30T10:07:01.799677Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fe0771d5-7925-477c-861b-13f1d88f3bae",
  "quote_id": "6a5a1248-6b7c-4c42-a209-8bcc7dea16e7",
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
  "id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
  "created_at": "2026-10-30T10:07:02.094625Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/122ad63a-7494-4106-887d-c3af6d27a35c` → **200**

```json
{
  "id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
  "created_at": "2026-10-30T10:07:02.094625Z",
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
    "id": "eb51afc4-062b-40fb-8458-b4de491772fa",
    "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
    "expires_at": "2026-10-30T10:07:17.100024Z",
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

`POST /api/driver/v1/offers/eb51afc4-062b-40fb-8458-b4de491772fa/accept` → **200**

```json
{
  "command_id": "53219df3-fb85-4610-a919-c516cf8b8d12"
}
```

```json
{
  "id": "58c7733b-abb0-4c0f-9a4b-996ece37db1f",
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60d54c52-6745-4f35-9bb7-501e937be5f3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "60d54c52-6745-4f35-9bb7-501e937be5f3",
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "assignment_id": "58c7733b-abb0-4c0f-9a4b-996ece37db1f",
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

`POST /api/driver/v1/work-sessions/5949ba10-8443-4a00-9880-3405f283e40f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:03Z",
    "sequence": 1793354823503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:07:03.521994Z",
  "last_location_at": "2026-10-30T10:07:03.521994Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/60d54c52-6745-4f35-9bb7-501e937be5f3/arrive` → **200**

```json
{
  "command_id": "25e99fe9-1ab6-4271-8c71-213cf93c428a",
  "expected_version": 0
}
```

```json
{
  "id": "60d54c52-6745-4f35-9bb7-501e937be5f3",
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "assignment_id": "58c7733b-abb0-4c0f-9a4b-996ece37db1f",
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
  "arrived_at": "2026-10-30T10:07:03.808631Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/60d54c52-6745-4f35-9bb7-501e937be5f3/start` → **200**

```json
{
  "command_id": "e3a7e646-da82-4a07-a7de-c6575d48b4fa",
  "expected_version": 1
}
```

```json
{
  "id": "60d54c52-6745-4f35-9bb7-501e937be5f3",
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "assignment_id": "58c7733b-abb0-4c0f-9a4b-996ece37db1f",
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
  "arrived_at": "2026-10-30T10:07:03.808631Z",
  "started_at": "2026-10-30T10:07:04.09346Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/60d54c52-6745-4f35-9bb7-501e937be5f3/complete` → **200**

```json
{
  "command_id": "486ccec2-1328-4364-b0fb-cb8560b201f4",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:07:04Z",
  "cash_received": true
}
```

```json
{
  "id": "60d54c52-6745-4f35-9bb7-501e937be5f3",
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "assignment_id": "58c7733b-abb0-4c0f-9a4b-996ece37db1f",
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
  "arrived_at": "2026-10-30T10:07:03.808631Z",
  "started_at": "2026-10-30T10:07:04.09346Z",
  "completed_at": "2026-10-30T10:07:04.385473Z",
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
  "client_id": "1dfcc3d4-7d55-467d-a657-4d87a9ad75b2",
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
      "id": "941e311b-b0cf-4683-8e14-c962e3b9b77a",
      "at": "2026-10-30T10:07:01.799677Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
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

`GET /api/rider/v1/orders/122ad63a-7494-4106-887d-c3af6d27a35c/tip` → **200**

```json
{
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
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
  "available_until": "2026-10-31T10:07:04.385473Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/122ad63a-7494-4106-887d-c3af6d27a35c/tip` → **201**

```json
{
  "command_id": "c4037988-2f96-4dce-b905-a93416f92cb2",
  "amount_minor": 2500
}
```

```json
{
  "id": "fb363f60-1ec1-43f2-9f3a-61475f2fae57",
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T10:07:05.495625Z"
}
```

`GET /api/rider/v1/orders/122ad63a-7494-4106-887d-c3af6d27a35c/tip` → **200**

```json
{
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
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
  "available_until": "2026-10-31T10:07:04.385473Z",
  "open": false,
  "tip": {
    "id": "fb363f60-1ec1-43f2-9f3a-61475f2fae57",
    "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T10:07:05.495625Z"
  }
}
```

`GET /api/rider/v1/orders/122ad63a-7494-4106-887d-c3af6d27a35c/tip` → **200**

```json
{
  "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
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
  "available_until": "2026-10-31T10:07:04.385473Z",
  "open": false,
  "tip": {
    "id": "fb363f60-1ec1-43f2-9f3a-61475f2fae57",
    "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T10:07:05.495625Z"
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
      "id": "9d467574-5264-4406-8658-661ce03377a0",
      "at": "2026-10-30T10:07:05.368293Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
      "counterpart_id": null
    },
    {
      "id": "8ca5c791-3990-4958-8286-cdf4ff1190c7",
      "at": "2026-10-30T10:06:59.309905Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
      "counterpart_id": null
    },
    {
      "id": "1c9364ef-391c-48a4-9da0-af85ea37da42",
      "at": "2026-10-30T10:06:53.244038Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
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
      "id": "429f1060-fdcb-4e34-8a3c-1d61017edf8f",
      "at": "2026-10-30T10:07:07.396039Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
      "counterpart_id": null
    },
    {
      "id": "9d467574-5264-4406-8658-661ce03377a0",
      "at": "2026-10-30T10:07:05.368293Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "122ad63a-7494-4106-887d-c3af6d27a35c",
      "counterpart_id": null
    },
    {
      "id": "8ca5c791-3990-4958-8286-cdf4ff1190c7",
      "at": "2026-10-30T10:06:59.309905Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
      "counterpart_id": null
    },
    {
      "id": "1c9364ef-391c-48a4-9da0-af85ea37da42",
      "at": "2026-10-30T10:06:53.244038Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "519de86e-daa4-498a-92d3-09b603f40abd",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5949ba10-8443-4a00-9880-3405f283e40f",
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
  "last_heartbeat_at": "2026-10-30T10:07:03.521994Z",
  "last_location_at": "2026-10-30T10:07:03.521994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5949ba10-8443-4a00-9880-3405f283e40f/close` → **200**

```json
{
  "command_id": "280f0ddd-1b57-4107-90e3-6f5f7eb3a1a6",
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

Done: card order 122ad63a-7494-4106-887d-c3af6d27a35c.

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
  "phone": "+380731908222",
  "device_ref": "sandbox-8367"
}
```

```json
{
  "challenge_id": "b7d09f42-10a6-4dac-b6f1-53135653157e",
  "expires_at": "2026-10-30T10:12:09.685543836Z",
  "resend_available_at": "2026-10-30T10:07:10.685543836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731908222` → **200**

```json
{
  "phone": "+380731908222",
  "audience": "CLIENT",
  "code": "362305",
  "sent_at": "2026-10-30T10:07:09.688086013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7d09f42-10a6-4dac-b6f1-53135653157e",
  "code": "362305",
  "device_ref": "sandbox-8367"
}
```

```json
{
  "session_id": "1f894951-909b-4b22-bf78-e5709ec2550c",
  "subject": {
    "type": "CLIENT",
    "id": "5cda06ab-82a7-4ba4-b1b9-bf21fb53c9c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Y2RhMDZhYi04MmE3LTRiYTQtYjFiOS1iZjIxZmI1M2M5YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzI5LCJpYXQiOjE3OTMzNTQ4MjksImp0aSI6ImJkMzcwYWMxLTI0ODgtNDgzZS1iYjM3LTVmMjBmZGM5N2I0MSIsInNpZCI6IjFmODk0OTUxLTkwOWItNGIyMi1iZjc4LWU1NzA5ZWMyNTUwYyJ9.UgmFuXVw3ITSUriLyBuvGdMO6pa5FMmPjHWyPXTjhoM",
  "access_expires_at": "2026-10-30T10:22:09.974223931Z",
  "refresh_token": "_rk0igONEtArxXhgrbEGWh9z2OV8UqtQeOWY2tWYSsk",
  "refresh_expires_at": "2026-11-29T10:07:09.973661739Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "3b9c8e0e-6a17-46c6-90dd-2cfcf0a8683e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "e7d47804-c18b-4753-990e-6b82b121cbf2",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e7d47804-c18b-4753-990e-6b82b121cbf2",
    "orderDate": "1793354830",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "9ee9c50e5dd6ecacd7f860c346bb63a5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e7d47804-c18b-4753-990e-6b82b121cbf2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731908222"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e7d47804-c18b-4753-990e-6b82b121cbf2",
  "created_at": "2026-10-30T10:07:10.247805Z",
  "expires_at": "2026-10-30T10:37:10.247805Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/e7d47804-c18b-4753-990e-6b82b121cbf2` → **200**

```json
{
  "id": "e7d47804-c18b-4753-990e-6b82b121cbf2",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T10:07:10.247805Z",
  "expires_at": "2026-10-30T10:37:10.247805Z",
  "completed_at": "2026-10-30T10:07:10.52708Z",
  "masked_pan": "41****1959",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5cda06ab-82a7-4ba4-b1b9-bf21fb53c9c7",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5cda06ab-82a7-4ba4-b1b9-bf21fb53c9c7",
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
      "id": "a1e7b7ae-bec7-42dc-ba3b-ab57691c307d",
      "at": "2026-10-30T10:07:11.418237Z",
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
  "client_id": "5cda06ab-82a7-4ba4-b1b9-bf21fb53c9c7",
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
      "id": "a1e7b7ae-bec7-42dc-ba3b-ab57691c307d",
      "at": "2026-10-30T10:07:11.418237Z",
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
  "device_ref": "sandbox-20733"
}
```

```json
{
  "challenge_id": "57dc860c-09a5-41d7-b771-75e47ef77e02",
  "expires_at": "2026-10-30T10:12:12.628915302Z",
  "resend_available_at": "2026-10-30T10:07:13.628915302Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "307905",
  "sent_at": "2026-10-30T10:07:12.631758026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57dc860c-09a5-41d7-b771-75e47ef77e02",
  "code": "307905",
  "device_ref": "sandbox-20733"
}
```

```json
{
  "session_id": "3600a579-f07a-4f99-aa69-209d433c246a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczMiwiaWF0IjoxNzkzMzU0ODMyLCJqdGkiOiIxNWYzOWI5NC01MWFlLTRkZTYtYTYyMC02NmQyMDAxYTM0NDUiLCJzaWQiOiIzNjAwYTU3OS1mMDdhLTRmOTktYWE2OS0yMDlkNDMzYzI0NmEifQ.uhXGEvVzp6O6ktWfSwoRUfsqxGhPyhsCvxqJMoBKndw",
  "access_expires_at": "2026-10-30T10:22:12.928639809Z",
  "refresh_token": "eY59Mmqv-xUUr4_dJmEPClCbU5gvOs63YbHtczY3SIA",
  "refresh_expires_at": "2026-11-29T10:07:12.928009011Z",
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
  "command_id": "d3e7e004-c3e3-4895-981f-ca8425941fb7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "7e353fa6-c6c6-4c10-a4ad-152059d42efd",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7e353fa6-c6c6-4c10-a4ad-152059d42efd",
    "orderDate": "1793354833",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5df6c09895586591a693de95339feaf8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7e353fa6-c6c6-4c10-a4ad-152059d42efd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7e353fa6-c6c6-4c10-a4ad-152059d42efd",
  "created_at": "2026-10-30T10:07:13.451612Z",
  "expires_at": "2026-10-30T10:37:13.451612Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/7e353fa6-c6c6-4c10-a4ad-152059d42efd` → **200**

```json
{
  "id": "7e353fa6-c6c6-4c10-a4ad-152059d42efd",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T10:07:13.451612Z",
  "expires_at": "2026-10-30T10:37:13.451612Z",
  "completed_at": "2026-10-30T10:07:13.732807Z",
  "masked_pan": "41****3342",
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
      "id": "c4d83f6f-01b0-44ae-92cb-13020cb8de8d",
      "at": "2026-10-30T10:07:14.427487Z",
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
  "command_id": "0cbfef75-dd93-4bc8-b941-9fbf44faaab1",
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
  "correlation_id": "f1788030-e8d6-4f3d-b94b-4e1d48bd8b11"
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
  "device_ref": "sandbox-17890"
}
```

```json
{
  "challenge_id": "452bf7e4-908b-4e3e-8b29-3b6b0450eadf",
  "expires_at": "2026-10-30T10:12:15.839106605Z",
  "resend_available_at": "2026-10-30T10:07:16.839106605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "173084",
  "sent_at": "2026-10-30T10:07:15.842314348Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "452bf7e4-908b-4e3e-8b29-3b6b0450eadf",
  "code": "173084",
  "device_ref": "sandbox-17890"
}
```

```json
{
  "session_id": "3b920bad-f8dd-421b-808a-b4a387989d5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTczNiwiaWF0IjoxNzkzMzU0ODM2LCJqdGkiOiI3ODk1YWE3OC01OGU5LTQyYTQtYmEzNy0wOWNkYTdjMzY3ZWEiLCJzaWQiOiIzYjkyMGJhZC1mOGRkLTQyMWItODA4YS1iNGEzODc5ODlkNWEifQ.pF7IFORTcufnGNgDhI27CuFtnTB6wJbl3WCTR_eqB4o",
  "access_expires_at": "2026-10-30T10:22:16.131029432Z",
  "refresh_token": "xKFy-mcT2j4CJkHYgkADxuEHah2lmI4N8bmovwmfHio",
  "refresh_expires_at": "2026-11-29T10:07:16.130364529Z",
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
  "command_id": "610f7ed2-1493-4d61-8594-8d9095c1e43e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:16Z",
    "sequence": 1793354836671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b61f0a-d14c-43e8-bb7a-7446ea0127ce",
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
  "last_heartbeat_at": "2026-10-30T10:07:16.688715Z",
  "last_location_at": "2026-10-30T10:07:16.688715Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630038423",
  "device_ref": "sandbox-15277"
}
```

```json
{
  "challenge_id": "7f320fa8-6ff5-497e-b536-bae15e0b0f7d",
  "expires_at": "2026-10-30T10:12:16.958178276Z",
  "resend_available_at": "2026-10-30T10:07:17.958178276Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630038423` → **200**

```json
{
  "phone": "+380630038423",
  "audience": "CLIENT",
  "code": "969267",
  "sent_at": "2026-10-30T10:07:16.960942395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f320fa8-6ff5-497e-b536-bae15e0b0f7d",
  "code": "969267",
  "device_ref": "sandbox-15277"
}
```

```json
{
  "session_id": "6e186a9d-930d-4d76-ae6c-3a07b540017b",
  "subject": {
    "type": "CLIENT",
    "id": "84bc5443-b6bf-4006-bb6e-6b6401ac72ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGJjNTQ0My1iNmJmLTQwMDYtYmI2ZS02YjY0MDFhYzcyYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzM3LCJpYXQiOjE3OTMzNTQ4MzcsImp0aSI6ImNjZDlkYTgxLTYwZTctNDQxZi05ZTUyLTFmOTZkOGMzNmJmZCIsInNpZCI6IjZlMTg2YTlkLTkzMGQtNGQ3Ni1hZTZjLTNhMDdiNTQwMDE3YiJ9.qEnQzdWeyB63Izo5ojsyOLlbqEXglKEIgsCGukA61bs",
  "access_expires_at": "2026-10-30T10:22:17.246726239Z",
  "refresh_token": "1lMCfLq0IXml6YfWPTpkCa0FvgaGJfVYSKMT3ZvKdEo",
  "refresh_expires_at": "2026-11-29T10:07:17.246045295Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aeadae94-302d-49d8-81b1-98a64b76ee18",
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
  "id": "39cf86a8-81d2-4ba1-b953-9bc2dc7843e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:17.519751Z",
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
  "command_id": "b82fbf93-1b43-4f6d-9cc1-7627714e0b72",
  "quote_id": "39cf86a8-81d2-4ba1-b953-9bc2dc7843e8",
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
  "id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "84bc5443-b6bf-4006-bb6e-6b6401ac72ac",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:07:17.806811Z",
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
    "id": "4cf3c0a1-5033-4efc-bd43-6139403bf4bc",
    "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
    "expires_at": "2026-10-30T10:07:32.809759Z",
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

`POST /api/driver/v1/offers/4cf3c0a1-5033-4efc-bd43-6139403bf4bc/accept` → **200**

```json
{
  "command_id": "48f51b93-290d-43bd-bff8-140c7077d4cb"
}
```

```json
{
  "id": "56e60cfd-f104-47c2-9dac-f0a4d1608aee",
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5569e8ca-f6c0-475d-b542-2bc6bdb7fee8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5569e8ca-f6c0-475d-b542-2bc6bdb7fee8",
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "assignment_id": "56e60cfd-f104-47c2-9dac-f0a4d1608aee",
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

`POST /api/driver/v1/work-sessions/04b61f0a-d14c-43e8-bb7a-7446ea0127ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:18Z",
    "sequence": 1793354838908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b61f0a-d14c-43e8-bb7a-7446ea0127ce",
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
  "last_heartbeat_at": "2026-10-30T10:07:18.927017Z",
  "last_location_at": "2026-10-30T10:07:18.927017Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5569e8ca-f6c0-475d-b542-2bc6bdb7fee8/arrive` → **200**

```json
{
  "command_id": "d1e43414-380b-4738-97b0-4321f5ef8165",
  "expected_version": 0
}
```

```json
{
  "id": "5569e8ca-f6c0-475d-b542-2bc6bdb7fee8",
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "assignment_id": "56e60cfd-f104-47c2-9dac-f0a4d1608aee",
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
  "arrived_at": "2026-10-30T10:07:19.199892Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5569e8ca-f6c0-475d-b542-2bc6bdb7fee8/start` → **200**

```json
{
  "command_id": "a916ebb2-1408-4da9-b503-ec11dd4c3bff",
  "expected_version": 1
}
```

```json
{
  "id": "5569e8ca-f6c0-475d-b542-2bc6bdb7fee8",
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "assignment_id": "56e60cfd-f104-47c2-9dac-f0a4d1608aee",
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
  "arrived_at": "2026-10-30T10:07:19.199892Z",
  "started_at": "2026-10-30T10:07:19.483145Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5569e8ca-f6c0-475d-b542-2bc6bdb7fee8/complete` → **200**

```json
{
  "command_id": "c7cc7f82-5833-47a7-8efa-c66017efc00d",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:07:19Z",
  "cash_received": false
}
```

```json
{
  "id": "5569e8ca-f6c0-475d-b542-2bc6bdb7fee8",
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "assignment_id": "56e60cfd-f104-47c2-9dac-f0a4d1608aee",
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
  "arrived_at": "2026-10-30T10:07:19.199892Z",
  "started_at": "2026-10-30T10:07:19.483145Z",
  "completed_at": "2026-10-30T10:07:19.767939Z",
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
  "session_id": "2c49cf0a-688e-4fbe-bdca-6a77d3f941db",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3NDAsImlhdCI6MTc5MzM1NDg0MCwianRpIjoiOGQwMGEwNDctZjU1YS00N2Q2LTlmNjMtOGJjOTRjZTA0NzE5Iiwic2lkIjoiMmM0OWNmMGEtNjg4ZS00ZmJlLWJkY2EtNmE3N2QzZjk0MWRiIn0.x4JL0WbtMJX5Zlpm-CobjufVAwadBLJSxhOWaa7C3NE",
  "access_expires_at": "2026-10-30T10:22:20.366202578Z",
  "refresh_token": "QsMZVVseIWi_Nu1r1pbv9s4A3GZhvRE63DVerMdU86o",
  "refresh_expires_at": "2026-10-30T22:07:20.36574559Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2/cash-dispute` → **200**

```json
{
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "84bc5443-b6bf-4006-bb6e-6b6401ac72ac",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T10:07:20.505102Z",
  "decide_by": "2026-11-13T10:07:20.505102Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T10:07:20.505102Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "84bc5443-b6bf-4006-bb6e-6b6401ac72ac",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T10:07:20.505102Z",
      "decide_by": "2026-11-13T10:07:20.505102Z",
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

`POST /api/admin/v1/orders/8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2/cash-dispute/decide` → **400**

```json
{
  "command_id": "47ed4344-82b6-4742-922b-13dc944e743a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "358daad7-bdfa-43ac-af89-5f393b7f1cca",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2/cash-dispute/decide` → **200**

```json
{
  "command_id": "72942d1b-038f-405c-be51-fea9d79ce129",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "84bc5443-b6bf-4006-bb6e-6b6401ac72ac",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T10:07:20.505102Z",
  "decide_by": "2026-11-13T10:07:20.505102Z",
  "decision": "PAY_DRIVER",
  "decided_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T10:07:21.502128Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2/cash-dispute/decide` → **409**

```json
{
  "command_id": "e9458cd9-fff7-4ca9-8ca6-7882529aa04f",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fe4191fa-797f-4da4-9860-219ff27185ed"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b61f0a-d14c-43e8-bb7a-7446ea0127ce",
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
  "last_heartbeat_at": "2026-10-30T10:07:18.927017Z",
  "last_location_at": "2026-10-30T10:07:18.927017Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04b61f0a-d14c-43e8-bb7a-7446ea0127ce/close` → **200**

```json
{
  "command_id": "cba03eb8-e79c-448e-a596-f92bda3ce65b",
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
  "phone": "+380731995527",
  "device_ref": "sandbox-3399"
}
```

```json
{
  "challenge_id": "3b86cbac-2177-4a47-8604-e4985567feea",
  "expires_at": "2026-10-30T10:12:22.607334463Z",
  "resend_available_at": "2026-10-30T10:07:23.607334463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731995527` → **200**

```json
{
  "phone": "+380731995527",
  "audience": "CLIENT",
  "code": "601120",
  "sent_at": "2026-10-30T10:07:22.610044233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b86cbac-2177-4a47-8604-e4985567feea",
  "code": "601120",
  "device_ref": "sandbox-3399"
}
```

```json
{
  "session_id": "e361c0f4-55e7-4db1-ba55-5c86f721c1ea",
  "subject": {
    "type": "CLIENT",
    "id": "e347c066-ec2c-4699-8be0-7e52e593ab17"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzQ3YzA2Ni1lYzJjLTQ2OTktOGJlMC03ZTUyZTU5M2FiMTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzQyLCJpYXQiOjE3OTMzNTQ4NDIsImp0aSI6ImE5MmU4NjA2LTMwNDctNDllOC1iYWMxLWU3MjBjNTA5OTFlYiIsInNpZCI6ImUzNjFjMGY0LTU1ZTctNGRiMS1iYTU1LTVjODZmNzIxYzFlYSJ9.fuFX0pm1XmsjHxEu5n1QXHBAnj5xBMfqJ0oL7vdxXl4",
  "access_expires_at": "2026-10-30T10:22:22.899553181Z",
  "refresh_token": "ac6YayKO80UN_2i88wQAh_1W5q_vLuI2olRpdOCkgXQ",
  "refresh_expires_at": "2026-11-29T10:07:22.898968176Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9a35b1d8-16a4-42d5-9dc4-813439f84f05",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "208def61-9e2e-41fe-b32e-f4c25467dba7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-208def61-9e2e-41fe-b32e-f4c25467dba7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "de49be223b8c300b3fee98ea1322988e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=208def61-9e2e-41fe-b32e-f4c25467dba7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731995527"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=208def61-9e2e-41fe-b32e-f4c25467dba7",
  "expires_at": "2026-10-30T10:37:23.164634Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/208def61-9e2e-41fe-b32e-f4c25467dba7` → **200**

```json
{
  "id": "208def61-9e2e-41fe-b32e-f4c25467dba7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:37:23.164634Z",
  "card": {
    "id": "18cb999e-fdc6-471d-8185-61424d85a0dc",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0717",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:07:23.436705Z"
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
  "device_ref": "sandbox-22194"
}
```

```json
{
  "challenge_id": "d5830e79-3809-458e-8af1-17867b0a9f7d",
  "expires_at": "2026-10-30T10:12:23.727356762Z",
  "resend_available_at": "2026-10-30T10:07:24.727356762Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "234975",
  "sent_at": "2026-10-30T10:07:23.729781651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5830e79-3809-458e-8af1-17867b0a9f7d",
  "code": "234975",
  "device_ref": "sandbox-22194"
}
```

```json
{
  "session_id": "d01b4e0c-b374-4848-b3bb-36b8cbdb873e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTc0NCwiaWF0IjoxNzkzMzU0ODQ0LCJqdGkiOiIxMjc3ZWVkZC1kNTI4LTQ5ZjUtYmVkYi1hZWUwMjYwNDA3YzYiLCJzaWQiOiJkMDFiNGUwYy1iMzc0LTQ4NDgtYjNiYi0zNmI4Y2JkYjg3M2UifQ.-Q4_HyF7ePtJ2AblwM-7l6wDhGV7B-Gopg9aI5wXgec",
  "access_expires_at": "2026-10-30T10:22:24.028383315Z",
  "refresh_token": "VR07vh3zagNnnkwWlQZVyaZX8_aoJij4kWLEeJvuEbU",
  "refresh_expires_at": "2026-11-29T10:07:24.027808744Z",
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
  "command_id": "678ed15b-b42b-473c-821a-61780d1130e2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:24Z",
    "sequence": 1793354844548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "187f61b8-1838-4b59-85e0-c17c724b68ef",
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
  "last_heartbeat_at": "2026-10-30T10:07:24.566393Z",
  "last_location_at": "2026-10-30T10:07:24.566393Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "448b9f32-b43d-47c6-a5ea-9642c743d58b",
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
  "id": "e4fccd31-1624-4a4a-9986-8d2da0bb6814",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:24.845399Z",
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
  "command_id": "e1a68d38-f828-4e92-8bf5-eb23a43f5639",
  "quote_id": "e4fccd31-1624-4a4a-9986-8d2da0bb6814",
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
  "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
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
  "created_at": "2026-10-30T10:07:25.12424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3` → **200**

```json
{
  "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
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
  "created_at": "2026-10-30T10:07:25.12424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3` → **200**

```json
{
  "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
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
  "created_at": "2026-10-30T10:07:25.12424Z",
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
    "id": "a2f9f8ac-b7c2-4174-a67a-b01670ece677",
    "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
    "expires_at": "2026-10-30T10:07:40.578012Z",
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

`POST /api/driver/v1/offers/a2f9f8ac-b7c2-4174-a67a-b01670ece677/accept` → **200**

```json
{
  "command_id": "fee0dff2-246d-4922-b068-649a212c621c"
}
```

```json
{
  "id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "590eb584-788f-4ff4-8037-5798da1c2f13",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "590eb584-788f-4ff4-8037-5798da1c2f13",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "assignment_id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
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

`POST /api/rider/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/messages` → **201**

```json
{
  "command_id": "ffe8f869-471c-4fee-9c6e-3280e05e4c4c",
  "body": "Я біля входу, мій номер +380731995527, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "f631b3cb-8fbd-4a20-b1f5-3f4718de9e5a",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731995527, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T10:07:27.830986236Z"
}
```

`POST /api/driver/v1/trips/590eb584-788f-4ff4-8037-5798da1c2f13/messages` → **201**

```json
{
  "command_id": "88b1d2c3-dd05-4cb7-923f-dd70f2da27a4",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "d42f23cf-452b-4fe2-bbcc-c3e73fb6f7c4",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T10:07:28.105829693Z"
}
```

`POST /api/driver/v1/work-sessions/187f61b8-1838-4b59-85e0-c17c724b68ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:28Z",
    "sequence": 1793354848370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "187f61b8-1838-4b59-85e0-c17c724b68ef",
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
  "last_heartbeat_at": "2026-10-30T10:07:28.387935Z",
  "last_location_at": "2026-10-30T10:07:28.387935Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/590eb584-788f-4ff4-8037-5798da1c2f13/arrive` → **200**

```json
{
  "command_id": "0e7cc115-d0be-426c-8d90-485146d871eb",
  "expected_version": 0
}
```

```json
{
  "id": "590eb584-788f-4ff4-8037-5798da1c2f13",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "assignment_id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
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
  "arrived_at": "2026-10-30T10:07:28.659123Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/590eb584-788f-4ff4-8037-5798da1c2f13/start` → **200**

```json
{
  "command_id": "c3385578-d226-41b5-8117-08daf0c9c6b3",
  "expected_version": 1
}
```

```json
{
  "id": "590eb584-788f-4ff4-8037-5798da1c2f13",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "assignment_id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
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
  "arrived_at": "2026-10-30T10:07:28.659123Z",
  "started_at": "2026-10-30T10:07:28.943861Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/187f61b8-1838-4b59-85e0-c17c724b68ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:07:29Z",
    "sequence": 1793354849221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "187f61b8-1838-4b59-85e0-c17c724b68ef",
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
  "last_heartbeat_at": "2026-10-30T10:07:29.239669Z",
  "last_location_at": "2026-10-30T10:07:29.239669Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/590eb584-788f-4ff4-8037-5798da1c2f13/complete` → **200**

```json
{
  "command_id": "8471c9d9-4f87-481b-825f-7b199c51dac1",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:07:29Z",
  "cash_received": false
}
```

```json
{
  "id": "590eb584-788f-4ff4-8037-5798da1c2f13",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "assignment_id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
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
  "arrived_at": "2026-10-30T10:07:28.659123Z",
  "started_at": "2026-10-30T10:07:28.943861Z",
  "completed_at": "2026-10-30T10:07:29.51679Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3` → **200**

```json
{
  "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
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
    "id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
    "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "590eb584-788f-4ff4-8037-5798da1c2f13",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:07:25.12424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3` → **200**

```json
{
  "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
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
    "id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
    "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "590eb584-788f-4ff4-8037-5798da1c2f13",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:07:25.12424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3` → **200**

```json
{
  "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
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
    "id": "fb92376f-1567-4df4-b789-fb73349c0bd6",
    "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "590eb584-788f-4ff4-8037-5798da1c2f13",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:07:25.12424Z",
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
  "session_id": "187f61b8-1838-4b59-85e0-c17c724b68ef",
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
  "last_heartbeat_at": "2026-10-30T10:07:29.239669Z",
  "last_location_at": "2026-10-30T10:07:29.239669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/187f61b8-1838-4b59-85e0-c17c724b68ef/close` → **200**

```json
{
  "command_id": "f5ea0807-9b77-421c-b362-19311518ab19",
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
  "session_id": "e70ae182-b8e8-4586-9b33-0869c5ee4d42",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3NTMsImlhdCI6MTc5MzM1NDg1MywianRpIjoiMTRjOGY5YjMtYzNmOS00Zjk5LTlhMmQtYWZjNzhjNzUzOTJkIiwic2lkIjoiZTcwYWUxODItYjhlOC00NTg2LTliMzMtMDg2OWM1ZWU0ZDQyIn0.P4YVZDSev-CNHeBtbuDiiCeSr0CdV8F2xyuWpVpICc8",
  "access_expires_at": "2026-10-30T10:22:33.485632679Z",
  "refresh_token": "dNuRl7PxPIII3UdYPVvtg84th0Y5Dbx15qG1VHwRSQ8",
  "refresh_expires_at": "2026-10-30T22:07:33.485139646Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "97563b18-86e3-41a3-92f2-d1fa0fe13aff"
}
```

`GET /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T10:07:34.024598507Z",
  "order": {
    "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
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
    "created_at": "2026-10-30T10:07:25.12424Z",
    "assigned_at": "2026-10-30T10:07:27.290965Z",
    "arrived_at": "2026-10-30T10:07:28.659123Z",
    "started_at": "2026-10-30T10:07:28.943861Z",
    "completed_at": "2026-10-30T10:07:29.51679Z"
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
    "id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
    "registered_at": "2026-10-30T10:07:22.897034Z",
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
      "created_at": "2026-10-30T10:07:25.127149Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T10:07:29.675722Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks` → **422**

```json
{
  "command_id": "cedcc9e2-85a5-4437-a734-446d9fbbde7e",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "36cb6db7-b59c-4f77-bb71-bd0f0c3a2abc"
}
```

`POST /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks` → **201**

```json
{
  "command_id": "0ee3d552-8b84-4c38-8206-852074b3c8f2",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "ca28b1f8-203b-4c07-b68b-dd19a0935184",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:07:34.646376Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks` → **201**

```json
{
  "command_id": "0ee3d552-8b84-4c38-8206-852074b3c8f2",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "ca28b1f8-203b-4c07-b68b-dd19a0935184",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T10:07:34.646376Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/e347c066-ec2c-4699-8be0-7e52e593ab17` → **200**

```json
{
  "client": {
    "id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
    "phone": "+380731995527",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:07:22.897034Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:07:25.12424Z",
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

`POST /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks/ca28b1f8-203b-4c07-b68b-dd19a0935184/resolve` → **200**

```json
{
  "command_id": "6b3abac6-e9c0-431c-bd3e-d7214c0e79c0",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "ca28b1f8-203b-4c07-b68b-dd19a0935184",
  "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T10:07:34.646376Z",
  "resolved_at": "2026-10-30T10:07:35.531519Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/e347c066-ec2c-4699-8be0-7e52e593ab17` → **200**

```json
{
  "client": {
    "id": "e347c066-ec2c-4699-8be0-7e52e593ab17",
    "phone": "+380731995527",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:07:22.897034Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T10:07:25.12424Z",
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

`POST /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks/ca28b1f8-203b-4c07-b68b-dd19a0935184/resolve` → **409**

```json
{
  "command_id": "b4be6d1c-b473-4292-acab-5532549d1fe4",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks/ca28b1f8-203b-4c07-b68b-dd19a0935184/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8dc34c60-25f9-4ec3-a577-eee9aa9cec7a"
}
```

`GET /api/admin/v1/orders/4e752248-85c4-4383-b59a-109dd91b6cb3/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "ca28b1f8-203b-4c07-b68b-dd19a0935184",
      "order_id": "4e752248-85c4-4383-b59a-109dd91b6cb3",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T10:07:34.646376Z",
      "resolved_at": "2026-10-30T10:07:35.531519Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 4e752248-85c4-4383-b59a-109dd91b6cb3 without phone or card digits; chargeback ca28b1f8-203b-4c07-b68b-dd19a0935184 recorded and won.

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
  "session_id": "31250322-6929-4c93-95c8-a2a72f4b7bc0",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3NTcsImlhdCI6MTc5MzM1NDg1NywianRpIjoiNWNjOWJkODctZDkxZS00YjFjLTkzN2EtYTNmZDg4NjA2YjgwIiwic2lkIjoiMzEyNTAzMjItNjkyOS00YzkzLTk1YzgtYTJhNzJmNGI3YmMwIn0.zSS3Qx9J_94DJQbfyg6VaWRJ6rRlDXV0MPHJULKhi4w",
  "access_expires_at": "2026-10-30T10:22:37.245564357Z",
  "refresh_token": "p4-WFoY1D4wpAWNwljb-A8WpS6nxULNP_vyV-5JhKzs",
  "refresh_expires_at": "2026-10-30T22:07:37.245061758Z",
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
  "phone": "+48600273173",
  "device_ref": "sandbox-26179"
}
```

```json
{
  "challenge_id": "aadfa108-5bfc-4389-b485-858485f8cf97",
  "expires_at": "2026-10-30T10:12:38.056248077Z",
  "resend_available_at": "2026-10-30T10:07:39.056248077Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600273173` → **200**

```json
{
  "phone": "+48600273173",
  "audience": "CLIENT",
  "code": "833768",
  "sent_at": "2026-10-30T10:07:38.058848992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aadfa108-5bfc-4389-b485-858485f8cf97",
  "code": "833768",
  "device_ref": "sandbox-26179"
}
```

```json
{
  "session_id": "2b5c1867-c922-45af-bd6f-085767bb35c4",
  "subject": {
    "type": "CLIENT",
    "id": "23192a5e-dbd9-4b7a-b39d-7862e267ea2f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMzE5MmE1ZS1kYmQ5LTRiN2EtYjM5ZC03ODYyZTI2N2VhMmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzU4LCJpYXQiOjE3OTMzNTQ4NTgsImp0aSI6IjhjODRhMzA5LTBhOGItNDk4Ny04ZGEyLTI4ZDU5ZGFlYzE5ZiIsInNpZCI6IjJiNWMxODY3LWM5MjItNDVhZi1iZDZmLTA4NTc2N2JiMzVjNCJ9.cgxTUV3q1xmmXc-z3E6866bPMslDdMgITlbDRT-MSn4",
  "access_expires_at": "2026-10-30T10:22:38.350121865Z",
  "refresh_token": "RiWNfzfnTe3Y-01R_O3wqijUqLBNYIrOcNZm4SMawEg",
  "refresh_expires_at": "2026-11-29T10:07:38.349675299Z",
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
  "command_id": "d4a7f442-7c07-404c-b467-4831b366eae2",
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
  "correlation_id": "73bb4618-7232-4705-91eb-1f6a8d9971d4",
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
  "command_id": "90b32181-1c85-49e7-a4c6-db0929343f2f",
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
  "paused_at": "2026-10-30T10:07:39.430865878Z",
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
  "command_id": "7085791f-175e-4d30-b717-c85c85724fc7",
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
  "id": "a70a2eee-0452-4d8a-8a6d-4a706bde2d01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:39.995224Z",
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
  "command_id": "98e863bd-ae94-4a1a-9337-8b6d5006eb1b",
  "quote_id": "a70a2eee-0452-4d8a-8a6d-4a706bde2d01",
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
  "correlation_id": "87669ecb-ea74-44a3-8bd0-6baa0728316c"
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
  "paused_at": "2026-10-30T10:07:39.430866Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "4594ef4d-ad72-4ce1-965f-624938f8e5ff",
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
  "command_id": "c796b802-02ed-4256-b139-d2f33fe8d0d5",
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
  "command_id": "3262a129-4147-41b8-93f8-8ff4455e98d1",
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
  "id": "42d4e6e5-1c3c-43da-80f5-9d62fa91626d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:41.652998Z",
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
  "command_id": "68b52919-a295-48a7-be79-9f7d359f857e",
  "quote_id": "42d4e6e5-1c3c-43da-80f5-9d62fa91626d",
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
  "correlation_id": "373caa81-991c-4a6d-bd76-cd3ca4f059a7"
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
  "command_id": "3dceb061-ee37-434a-984c-9cda7e12f7a4",
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
  "command_id": "bf67d9c1-1123-4b2b-afdc-4daa3d652485",
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
  "id": "1d557f52-a903-4964-a8f2-1e30d74799d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:42.760706Z",
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
  "command_id": "ec9ce0aa-1f2b-48e7-8267-f882e1da2f55",
  "quote_id": "1d557f52-a903-4964-a8f2-1e30d74799d0",
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
  "correlation_id": "414be8ae-f2fc-43f7-802b-ec63a59ac74b"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "e2d759a1-a242-43c4-9462-5341f5af89f0",
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
  "correlation_id": "7321d1b5-e230-4fd5-97a7-ce2fa8d2154b"
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
  "command_id": "4b8d5295-45c4-414f-a68e-9da58ff5c2ed",
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
  "phone": "+380673277721",
  "device_ref": "sandbox-28557"
}
```

```json
{
  "challenge_id": "a754f75d-0625-46be-9778-ab7994f70869",
  "expires_at": "2026-10-30T10:12:44.16093338Z",
  "resend_available_at": "2026-10-30T10:07:45.16093338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673277721` → **200**

```json
{
  "phone": "+380673277721",
  "audience": "CLIENT",
  "code": "874193",
  "sent_at": "2026-10-30T10:07:44.164697651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a754f75d-0625-46be-9778-ab7994f70869",
  "code": "874193",
  "device_ref": "sandbox-28557"
}
```

```json
{
  "session_id": "1481d674-0829-43d2-b675-32c0bbd245cf",
  "subject": {
    "type": "CLIENT",
    "id": "80e837df-3d0e-45e2-bc81-44ca8e9e31ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MGU4MzdkZi0zZDBlLTQ1ZTItYmM4MS00NGNhOGU5ZTMxY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzY0LCJpYXQiOjE3OTMzNTQ4NjQsImp0aSI6IjNmNzFiNDQ5LThjZjgtNGY4Yy05ZGYwLTE5OTU2MmY4MzRhNiIsInNpZCI6IjE0ODFkNjc0LTA4MjktNDNkMi1iNjc1LTMyYzBiYmQyNDVjZiJ9.fJxUyR8Ogs97t22t73Dg9s0BSol59sXWzKuh777-vAA",
  "access_expires_at": "2026-10-30T10:22:44.452188767Z",
  "refresh_token": "mlvsAx2aw4zEJD5EhzSfs2VtO4Z3YPmHXdxuXLNqM1A",
  "refresh_expires_at": "2026-11-29T10:07:44.451598202Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "80e837df-3d0e-45e2-bc81-44ca8e9e31ca",
  "session_id": "1481d674-0829-43d2-b675-32c0bbd245cf",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d23fae05-a560-43a9-ad69-3a98ecaac271",
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
  "id": "cf7c61bd-3d5e-443d-bb4d-f28b258c6170",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:44.985612Z",
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
  "challenge_id": "40885b68-028e-4da8-950d-f977a1f35569",
  "expires_at": "2026-10-30T10:12:47.262332996Z",
  "resend_available_at": "2026-10-30T10:07:48.262332996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673277721` → **200**

```json
{
  "phone": "+380673277721",
  "audience": "CLIENT",
  "code": "429811",
  "sent_at": "2026-10-30T10:07:47.264525951Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f4581866-eb58-4d71-8bce-61374649879e",
  "challenge_id": "40885b68-028e-4da8-950d-f977a1f35569",
  "otp_code": "429811"
}
```

```json
{
  "client_id": "80e837df-3d0e-45e2-bc81-44ca8e9e31ca",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T10:07:47.564743411Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "50cbfcbe-9ed3-4123-927d-d3bff4b15682",
  "quote_id": "cf7c61bd-3d5e-443d-bb4d-f28b258c6170",
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
  "correlation_id": "69dc09c3-8599-4eee-99a5-54453d91706a"
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
  "session_id": "e96f0f90-b836-45b8-a830-28fbf973a225",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3NjgsImlhdCI6MTc5MzM1NDg2OCwianRpIjoiMDhmMjJjZjctZGM5My00NzgyLTg4ODEtOWMyMWMxZGRmMTBhIiwic2lkIjoiZTk2ZjBmOTAtYjgzNi00NWI4LWE4MzAtMjhmYmY5NzNhMjI1In0.GJExdjJomY41CK0OjZTxQZmphD8Qrud1gwngqztni4Y",
  "access_expires_at": "2026-10-30T10:22:48.434398599Z",
  "refresh_token": "9AET_y-spbXeAifYCafUPtoMDKgvqHqhFus9U2umn5M",
  "refresh_expires_at": "2026-10-30T22:07:48.433872251Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "80e837df-3d0e-45e2-bc81-44ca8e9e31ca",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T10:07:47.564743Z",
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

`POST /api/admin/v1/client-deletions/80e837df-3d0e-45e2-bc81-44ca8e9e31ca/complete` → **200**

```json
{
  "command_id": "13f61e58-fc12-4f5b-a0da-eeb4055c19dd",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "80e837df-3d0e-45e2-bc81-44ca8e9e31ca",
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
  "correlation_id": "68d4340b-3f98-4566-9505-6f2fa02644aa"
}
```

Done: client 80e837df-3d0e-45e2-bc81-44ca8e9e31ca anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669254035",
  "device_ref": "sandbox-1039"
}
```

```json
{
  "challenge_id": "73dfed20-b786-460f-bee9-364e0389c345",
  "expires_at": "2026-10-30T10:12:49.548187894Z",
  "resend_available_at": "2026-10-30T10:07:50.548187894Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669254035` → **200**

```json
{
  "phone": "+380669254035",
  "audience": "CLIENT",
  "code": "450453",
  "sent_at": "2026-10-30T10:07:49.550733204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73dfed20-b786-460f-bee9-364e0389c345",
  "code": "450453",
  "device_ref": "sandbox-1039"
}
```

```json
{
  "session_id": "a826fecd-9b27-46a2-9ed8-82f95a711aa7",
  "subject": {
    "type": "CLIENT",
    "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmIxYWU1Yi02ZmY3LTQzODctYTYzMS0zMGRmODIyMGQ1ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzY5LCJpYXQiOjE3OTMzNTQ4NjksImp0aSI6ImU2OWI2MjY2LTQwOTgtNDQxNy1iMjhhLTdmN2MyMDkzYTE2MyIsInNpZCI6ImE4MjZmZWNkLTliMjctNDZhMi05ZWQ4LTgyZjk1YTcxMWFhNyJ9.Jd20huFGE__Abg9xa3e1TAYxjPByqnWKOMRmIKC9Uuw",
  "access_expires_at": "2026-10-30T10:22:49.853091234Z",
  "refresh_token": "GTugMp24a3237YwAAJkmwt85QcNkZ6EOUTM307XOv9I",
  "refresh_expires_at": "2026-11-29T10:07:49.85259415Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
  "session_id": "a826fecd-9b27-46a2-9ed8-82f95a711aa7",
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
  "session_id": "9eb3ec57-8bab-49c3-be9a-ff7052cb2640",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3NzAsImlhdCI6MTc5MzM1NDg3MCwianRpIjoiMGMzZGEwNjktZTRiOC00ZTFjLWE0MDYtMjc4NmQzNjZlZGFiIiwic2lkIjoiOWViM2VjNTctOGJhYi00OWMzLWJlOWEtZmY3MDUyY2IyNjQwIn0.4PtbGlYU4DzDrwcJGoQdJlGyp9-aUZQxziO5swNFKSM",
  "access_expires_at": "2026-10-30T10:22:50.69660219Z",
  "refresh_token": "sRM0eI6CuCyB6aDCkKbrpeL8ZyTX_STinv2uMLTkL0c",
  "refresh_expires_at": "2026-10-30T22:07:50.696041591Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9254035&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
      "phone": "+380669254035",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T10:07:49.850963Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c6b1ae5b-6ff7-4387-a631-30df8220d5fe` → **200**

```json
{
  "client": {
    "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
    "phone": "+380669254035",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:07:49.850963Z",
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

`POST /api/admin/v1/clients/c6b1ae5b-6ff7-4387-a631-30df8220d5fe/block` → **400**

```json
{
  "command_id": "cbd981d9-252c-413f-8556-85848c819371",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c6b1ae5b-6ff7-4387-a631-30df8220d5fe/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fedc1a74-b804-431f-a130-6d6ef8bb189b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c6b1ae5b-6ff7-4387-a631-30df8220d5fe/block` → **200**

```json
{
  "command_id": "df581ea7-a54a-422b-ad65-fb90f5685112",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
  "phone": "+380669254035",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T10:07:49.850963Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T10:07:51.854024Z",
    "by": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
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
  "correlation_id": "f2e7b716-0f22-440d-951d-1a971af8ec6f"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669254035",
  "device_ref": "sandbox-26021"
}
```

```json
{
  "challenge_id": "c5e29f8b-3980-422d-9256-adb06cdaee13",
  "expires_at": "2026-10-30T10:12:54.395103554Z",
  "resend_available_at": "2026-10-30T10:07:55.395103554Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669254035` → **200**

```json
{
  "phone": "+380669254035",
  "audience": "CLIENT",
  "code": "235206",
  "sent_at": "2026-10-30T10:07:54.3978707Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c5e29f8b-3980-422d-9256-adb06cdaee13",
  "code": "235206",
  "device_ref": "sandbox-26021"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "f9b17f4d-3be8-4e86-b100-b404cdba8ebc"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c6b1ae5b-6ff7-4387-a631-30df8220d5fe` → **200**

```json
{
  "client": {
    "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
    "phone": "+380669254035",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T10:07:49.850963Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T10:07:51.854024Z",
      "by": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
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

`POST /api/admin/v1/clients/c6b1ae5b-6ff7-4387-a631-30df8220d5fe/unblock` → **200**

```json
{
  "command_id": "7ed51608-bb99-41f0-a112-5401539e2a26",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
  "phone": "+380669254035",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T10:07:49.850963Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669254035",
  "device_ref": "sandbox-21981"
}
```

```json
{
  "challenge_id": "60a2031a-2987-4c63-bb73-e31f5b561b31",
  "expires_at": "2026-10-30T10:12:57.542965005Z",
  "resend_available_at": "2026-10-30T10:07:58.542965005Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669254035` → **200**

```json
{
  "phone": "+380669254035",
  "audience": "CLIENT",
  "code": "771730",
  "sent_at": "2026-10-30T10:07:57.545215877Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60a2031a-2987-4c63-bb73-e31f5b561b31",
  "code": "771730",
  "device_ref": "sandbox-21981"
}
```

```json
{
  "session_id": "3d913d6f-ea13-465b-954d-0d6231e07f54",
  "subject": {
    "type": "CLIENT",
    "id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmIxYWU1Yi02ZmY3LTQzODctYTYzMS0zMGRmODIyMGQ1ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Nzc3LCJpYXQiOjE3OTMzNTQ4NzcsImp0aSI6IjNlODgzMmZhLWRhNDUtNDQ5ZS1hNjFiLTU3NTQ2ODY5YTVjMSIsInNpZCI6IjNkOTEzZDZmLWVhMTMtNDY1Yi05NTRkLTBkNjIzMWUwN2Y1NCJ9.qgAurVBiYCwLVyOeJSKQPkz8TNpA3LC_3GKugPGOz5E",
  "access_expires_at": "2026-10-30T10:22:57.831986418Z",
  "refresh_token": "DsXr8u3HxrBgyAyvpHR3Lxo7HRHgwhVsimI8hjXHMT8",
  "refresh_expires_at": "2026-11-29T10:07:57.831524229Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c6b1ae5b-6ff7-4387-a631-30df8220d5fe",
  "session_id": "3d913d6f-ea13-465b-954d-0d6231e07f54",
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
  "phone": "+380665159127",
  "device_ref": "sandbox-32220"
}
```

```json
{
  "challenge_id": "afbdf662-c735-4512-8b3a-da1eac18b925",
  "expires_at": "2026-10-30T10:12:58.363340312Z",
  "resend_available_at": "2026-10-30T10:07:59.363340312Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665159127` → **200**

```json
{
  "phone": "+380665159127",
  "audience": "CLIENT",
  "code": "989528",
  "sent_at": "2026-10-30T10:07:58.365613451Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afbdf662-c735-4512-8b3a-da1eac18b925",
  "code": "989528",
  "device_ref": "sandbox-32220"
}
```

```json
{
  "session_id": "805325fa-cc7e-4c05-bd55-cf82245b2c2c",
  "subject": {
    "type": "CLIENT",
    "id": "f685c264-3ef2-4169-9947-f1dc2d60575a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjg1YzI2NC0zZWYyLTQxNjktOTk0Ny1mMWRjMmQ2MDU3NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Nzc4LCJpYXQiOjE3OTMzNTQ4NzgsImp0aSI6IjY3ODYzOWExLWVjYzktNDVmMi05MDM3LWQ2ZWQ3ODg3ZmQxZiIsInNpZCI6IjgwNTMyNWZhLWNjN2UtNGMwNS1iZDU1LWNmODIyNDViMmMyYyJ9.JakeHsl-rJplt06b_p1efCPX0woWWsloSSPLB_eM5yY",
  "access_expires_at": "2026-10-30T10:22:58.653696592Z",
  "refresh_token": "WEQvjnaiHxmZuhbCkGAKhPsxQaIwXtI4eKI7jZyixtg",
  "refresh_expires_at": "2026-11-29T10:07:58.65313772Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "64e1759d-551d-4be0-9497-54af6c4f3c9a",
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
  "id": "6d6ab36e-8527-49b6-b335-3f66f628b43b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:12:58.923484Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 46abc2bb-630a-4dc7-b5e3-b5ad39b4d146) → **201**

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
  "session_id": "93dee1fc-5220-4043-86da-a739e3bb6d07",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3NzksImlhdCI6MTc5MzM1NDg3OSwianRpIjoiM2M3MjVmNTQtYjI2NS00YmQ3LWEwZjUtNjcyODk0MDBkZTY5Iiwic2lkIjoiOTNkZWUxZmMtNTIyMC00MDQzLTg2ZGEtYTczOWUzYmI2ZDA3In0.ljMlQTMuNXDWhJ8Ss90ZYxtlhvb3LDvmm6EI_KwAFN8",
  "access_expires_at": "2026-10-30T10:22:59.551979316Z",
  "refresh_token": "pu1ZOJ6pDigUGWuQEPR7wltaFuCK6ptj5QIIUgzYewI",
  "refresh_expires_at": "2026-10-30T22:07:59.551455706Z",
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
  "session_id": "db53d0fa-9e27-4922-9540-1344cfe45a7b",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3ODAsImlhdCI6MTc5MzM1NDg4MCwianRpIjoiMzFkOTA5MjktNDUyYy00MGVmLWIxYzktZTg3MTRjOWZlNDU0Iiwic2lkIjoiZGI1M2QwZmEtOWUyNy00OTIyLTk1NDAtMTM0NGNmZTQ1YTdiIn0.JyNYcqQve3fSNfYFTDbtHRrE506-mZ4aj1nRvVI4A04",
  "access_expires_at": "2026-10-30T10:23:00.138854173Z",
  "refresh_token": "0CnaC2OO_tIv1v1CUhHuL-222iuMY6Fd5DJVY9CHTbc",
  "refresh_expires_at": "2026-10-30T22:08:00.138372137Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/89ae3beb-119e-4672-9875-9acafca10b0c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:07:59.200266Z",
      "actor": {
        "type": "CLIENT",
        "id": "f685c264-3ef2-4169-9947-f1dc2d60575a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "89ae3beb-119e-4672-9875-9acafca10b0c",
        "quote_id": "6d6ab36e-8527-49b6-b335-3f66f628b43b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "46abc2bb-630a-4dc7-b5e3-b5ad39b4d146"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:07:59.202193Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "89ae3beb-119e-4672-9875-9acafca10b0c",
        "attempt_id": "ca0b9319-750b-4bc6-8b99-7174e0ba1b2d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "46abc2bb-630a-4dc7-b5e3-b5ad39b4d146"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T10:07:59.208228Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "89ae3beb-119e-4672-9875-9acafca10b0c",
        "attempt_id": "ca0b9319-750b-4bc6-8b99-7174e0ba1b2d"
      },
      "correlation_id": "46abc2bb-630a-4dc7-b5e3-b5ad39b4d146"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "ca0b9319-750b-4bc6-8b99-7174e0ba1b2d",
        "generation": 1,
        "started_at": "2026-10-30T10:07:59.201412Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T10:07:59.208228Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T10:07:59.202822Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/46abc2bb-630a-4dc7-b5e3-b5ad39b4d146` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "89ae3beb-119e-4672-9875-9acafca10b0c:0",
      "order_id": "89ae3beb-119e-4672-9875-9acafca10b0c",
      "at": "2026-10-30T10:07:59.200266Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "89ae3beb-119e-4672-9875-9acafca10b0c:1",
      "order_id": "89ae3beb-119e-4672-9875-9acafca10b0c",
      "at": "2026-10-30T10:07:59.202193Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "89ae3beb-119e-4672-9875-9acafca10b0c:2",
      "order_id": "89ae3beb-119e-4672-9875-9acafca10b0c",
      "at": "2026-10-30T10:07:59.208228Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/b0ceb88e-f27b-4cc9-9eee-07cd7d3f397b` → **200**

```json
{
  "found": []
}
```

Done: request 46abc2bb-630a-4dc7-b5e3-b5ad39b4d146 — order 89ae3beb-119e-4672-9875-9acafca10b0c found by its id.

`GET /api/rider/v1/orders/89ae3beb-119e-4672-9875-9acafca10b0c` → **200**

```json
{
  "id": "89ae3beb-119e-4672-9875-9acafca10b0c",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f685c264-3ef2-4169-9947-f1dc2d60575a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:07:59.199775Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/89ae3beb-119e-4672-9875-9acafca10b0c/cancel` → **200**

```json
{
  "command_id": "62e55e67-ee2e-4149-a55e-12ae9d6e40e8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "89ae3beb-119e-4672-9875-9acafca10b0c",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f685c264-3ef2-4169-9947-f1dc2d60575a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:07:59.199775Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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
  "phone": "+380630383178",
  "device_ref": "sandbox-1543"
}
```

```json
{
  "challenge_id": "0758fb58-9b8c-46f6-a2d1-0b0a0bb07ac9",
  "expires_at": "2026-10-30T10:13:01.79557614Z",
  "resend_available_at": "2026-10-30T10:08:02.79557614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630383178` → **200**

```json
{
  "phone": "+380630383178",
  "audience": "CLIENT",
  "code": "275350",
  "sent_at": "2026-10-30T10:08:01.798658358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0758fb58-9b8c-46f6-a2d1-0b0a0bb07ac9",
  "code": "275350",
  "device_ref": "sandbox-1543"
}
```

```json
{
  "session_id": "d315c4a3-d861-4968-a9dc-2659c38c3032",
  "subject": {
    "type": "CLIENT",
    "id": "d724b489-091b-4513-b050-31ca00af7fcd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzI0YjQ4OS0wOTFiLTQ1MTMtYjA1MC0zMWNhMDBhZjdmY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1NzgyLCJpYXQiOjE3OTMzNTQ4ODIsImp0aSI6ImNhNzEwZDg0LTk1YTktNGFjMC04Y2MxLWJjODdiZGJmMDBmOSIsInNpZCI6ImQzMTVjNGEzLWQ4NjEtNDk2OC1hOWRjLTI2NTljMzhjMzAzMiJ9.z1Dx2NFzn0z98eBrTLc0eQGRRAwjh0ODbiY_lIQ6MOc",
  "access_expires_at": "2026-10-30T10:23:02.09401631Z",
  "refresh_token": "EU4HA2B2ALkZo5qVQqA2PmyacJ6r5imcNfhYRfmYNTc",
  "refresh_expires_at": "2026-11-29T10:08:02.093490152Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8dcb0864-3469-4e3c-a835-ded0d565e5a6",
  "expires_at": "2026-10-30T10:13:04.360327038Z",
  "resend_available_at": "2026-10-30T10:08:05.360327038Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630383178` → **200**

```json
{
  "phone": "+380630383178",
  "audience": "CLIENT",
  "code": "064745",
  "sent_at": "2026-10-30T10:08:04.36293726Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "24a37d62-5ea0-4649-a3c7-ff4322ac56f2",
  "challenge_id": "8dcb0864-3469-4e3c-a835-ded0d565e5a6",
  "otp_code": "064745"
}
```

```json
{
  "id": "c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a",
  "state": "PENDING",
  "created_at": "2026-10-30T10:08:04.668929Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a` → **200**

```json
{
  "id": "c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a",
  "state": "PENDING",
  "created_at": "2026-10-30T10:08:04.668929Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a` → **200**

```json
{
  "id": "c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a",
  "state": "PENDING",
  "created_at": "2026-10-30T10:08:04.668929Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a` → **200**

```json
{
  "id": "c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a",
  "state": "READY",
  "created_at": "2026-10-30T10:08:04.668929Z",
  "ready_at": "2026-10-30T10:08:06.540755Z",
  "expires_at": "2026-11-06T10:08:06.540755Z",
  "size_bytes": 1027
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638946921",
  "device_ref": "sandbox-28391"
}
```

```json
{
  "challenge_id": "7d74be17-650d-4c90-9299-0edcea4e629f",
  "expires_at": "2026-10-30T10:13:07.762090213Z",
  "resend_available_at": "2026-10-30T10:08:08.762090213Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638946921` → **200**

```json
{
  "phone": "+380638946921",
  "audience": "CLIENT",
  "code": "386807",
  "sent_at": "2026-10-30T10:08:07.764296293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d74be17-650d-4c90-9299-0edcea4e629f",
  "code": "386807",
  "device_ref": "sandbox-28391"
}
```

```json
{
  "session_id": "f393977b-f659-4c87-8d2a-251dd5ff2aed",
  "subject": {
    "type": "CLIENT",
    "id": "e62a13e3-5edf-4ebe-917c-76420f1ba5a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjJhMTNlMy01ZWRmLTRlYmUtOTE3Yy03NjQyMGYxYmE1YTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Nzg4LCJpYXQiOjE3OTMzNTQ4ODgsImp0aSI6IjJkM2ExZDViLWNhNWMtNGI4YS1hMTc0LTQ4OWZlZTA2ODhiZiIsInNpZCI6ImYzOTM5NzdiLWY2NTktNGM4Ny04ZDJhLTI1MWRkNWZmMmFlZCJ9.g0TzGK5acoBQwnIsyXISGj3g3SKX2Nhl3TysKUGU0z0",
  "access_expires_at": "2026-10-30T10:23:08.053108955Z",
  "refresh_token": "nIsjOaqiPQsDNUWVAp0TK00X0xvvP8VY0LlyCshUw4o",
  "refresh_expires_at": "2026-11-29T10:08:08.052542131Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5106417f-976a-40f7-8272-ff08d33080d8"
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
  "session_id": "abee7e94-aa91-4589-9db1-9025998b859f",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3ODgsImlhdCI6MTc5MzM1NDg4OCwianRpIjoiMzU5ZTIyYzQtNjYzYy00M2QwLWE1M2YtMzEzOWI1ZjAyNDE5Iiwic2lkIjoiYWJlZTdlOTQtYWE5MS00NTg5LTlkYjEtOTAyNTk5OGI4NTlmIn0.V0m7ONiZcoMsu0hJ10525mvJzYS98o15AaesqxIjyfI",
  "access_expires_at": "2026-10-30T10:23:08.906462341Z",
  "refresh_token": "4MYsEO1cD5qxGm0B2B5RfOVXMFqHLis6p3z3XPB65A0",
  "refresh_expires_at": "2026-10-30T22:08:08.906015059Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d724b489-091b-4513-b050-31ca00af7fcd",
  "session_id": "d315c4a3-d861-4968-a9dc-2659c38c3032",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d724b489-091b-4513-b050-31ca00af7fcd/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c1d8d5b1-04f2-4488-9bcd-bfcf83acd37a",
      "state": "READY",
      "created_at": "2026-10-30T10:08:04.668929Z",
      "ready_at": "2026-10-30T10:08:06.540755Z",
      "expires_at": "2026-11-06T10:08:06.540755Z",
      "size_bytes": 1027
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
  "device_ref": "sandbox-24092"
}
```

```json
{
  "challenge_id": "de2dd928-1ac3-4191-8f38-d1b2790272a2",
  "expires_at": "2026-10-30T10:13:09.71476458Z",
  "resend_available_at": "2026-10-30T10:08:10.71476458Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "140832",
  "sent_at": "2026-10-30T10:08:09.717552366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de2dd928-1ac3-4191-8f38-d1b2790272a2",
  "code": "140832",
  "device_ref": "sandbox-24092"
}
```

```json
{
  "session_id": "1c0a77f9-8375-4e84-abb9-e8f046f54653",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTc5MCwiaWF0IjoxNzkzMzU0ODkwLCJqdGkiOiJiNTVlMDRiNS1kZTEyLTRiYmEtYWYyMi1hNjQ0ZTM5MWFkYzQiLCJzaWQiOiIxYzBhNzdmOS04Mzc1LTRlODQtYWJiOS1lOGYwNDZmNTQ2NTMifQ.rKngsEA6XC-MR-M8uQj36uV4LPXKHYqjKsBJsLHJoQU",
  "access_expires_at": "2026-10-30T10:23:10.004345264Z",
  "refresh_token": "d2F3rFYBOdY8nQh3BRFQl7sKdntJ7gwkgMusaxsKnV8",
  "refresh_expires_at": "2026-11-29T10:08:10.003876436Z",
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
  "device_ref": "sandbox-15994"
}
```

```json
{
  "challenge_id": "a469f793-e4b0-45e9-8fb1-90a3bf5972f6",
  "expires_at": "2026-10-30T10:13:10.519116623Z",
  "resend_available_at": "2026-10-30T10:08:11.519116623Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "053092",
  "sent_at": "2026-10-30T10:08:10.521569835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a469f793-e4b0-45e9-8fb1-90a3bf5972f6",
  "code": "053092",
  "device_ref": "sandbox-15994"
}
```

```json
{
  "session_id": "d5bec866-75f6-493c-8413-ddefc0d7ad43",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTc5MCwiaWF0IjoxNzkzMzU0ODkwLCJqdGkiOiI1YTQyODc2Yy1hZjdjLTRiYjYtODc2Ni04NmQ4MDAyYjQxMDYiLCJzaWQiOiJkNWJlYzg2Ni03NWY2LTQ5M2MtODQxMy1kZGVmYzBkN2FkNDMifQ.o_C7IOUUQ8ACYPQYHLcYuDbx-8v5bj4zFhGvw5WxJ34",
  "access_expires_at": "2026-10-30T10:23:10.813570699Z",
  "refresh_token": "SDH0LyRm_8B0468ZN1LI4ZjzmB10lA1DUt8WYmwhZq4",
  "refresh_expires_at": "2026-11-29T10:08:10.812994742Z",
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
  "command_id": "10b784a6-bea6-4527-a5e2-634d67c1e57a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:11Z",
    "sequence": 1793354891336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e3cddc71-c355-4f48-a683-b91cc747b56a",
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
  "last_heartbeat_at": "2026-10-30T10:08:11.354543Z",
  "last_location_at": "2026-10-30T10:08:11.354543Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-7066"
}
```

```json
{
  "challenge_id": "bc535589-af7c-428b-9abb-3ff11edcd3a0",
  "expires_at": "2026-10-30T10:13:11.626674374Z",
  "resend_available_at": "2026-10-30T10:08:12.626674374Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "450562",
  "sent_at": "2026-10-30T10:08:11.629630015Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc535589-af7c-428b-9abb-3ff11edcd3a0",
  "code": "450562",
  "device_ref": "sandbox-7066"
}
```

```json
{
  "session_id": "5485a146-de1d-4985-9d0e-0449df8da807",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTc5MSwiaWF0IjoxNzkzMzU0ODkxLCJqdGkiOiIwMGMyYmMwNy1mMjE3LTRlMGQtYTY4MC1mZGMyMjkyNWNlNDEiLCJzaWQiOiI1NDg1YTE0Ni1kZTFkLTQ5ODUtOWQwZS0wNDQ5ZGY4ZGE4MDcifQ.nRRH9eMdkonuVw_h5lHp1RHxyQs3LkiVRag_tRZWrJM",
  "access_expires_at": "2026-10-30T10:23:11.912038521Z",
  "refresh_token": "ECedAZbjmQM0Y5QUNPctEaqOTe_JTLyu7uzcjepOaFg",
  "refresh_expires_at": "2026-11-29T10:08:11.911451891Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8f5a3c3b-881c-4605-906f-c3c8c0f0859b",
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
  "last_heartbeat_at": "2026-10-30T10:06:40.535959Z",
  "last_location_at": "2026-10-30T10:06:40.535959Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8f5a3c3b-881c-4605-906f-c3c8c0f0859b/handover` → **200**

```json
{
  "command_id": "c1739b66-1d0c-4cc1-8532-bfab224af943",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8f5a3c3b-881c-4605-906f-c3c8c0f0859b",
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
  "last_heartbeat_at": "2026-10-30T10:06:40.535959Z",
  "last_location_at": "2026-10-30T10:06:40.535959Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8f5a3c3b-881c-4605-906f-c3c8c0f0859b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:12Z",
    "sequence": 1793354892708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8f5a3c3b-881c-4605-906f-c3c8c0f0859b",
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
  "last_heartbeat_at": "2026-10-30T10:08:12.724825Z",
  "last_location_at": "2026-10-30T10:08:12.724825Z",
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
  "session_id": "3ada47b8-2729-46ca-93fc-dd6a05341ef2",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3OTMsImlhdCI6MTc5MzM1NDg5MywianRpIjoiODBmOWJhNzktOWRhZi00NGUzLTllMGYtYmRiYjBkNDhlNGE3Iiwic2lkIjoiM2FkYTQ3YjgtMjcyOS00NmNhLTkzZmMtZGQ2YTA1MzQxZWYyIn0.dRfM__dzacFKTUCBJb_53ULyAu8aVxPwEsV-aB6nsG4",
  "access_expires_at": "2026-10-30T10:23:13.306764724Z",
  "refresh_token": "UOicrbNc4CBR_VzXfjr8z604GyTKC6V7du3742J3UIY",
  "refresh_expires_at": "2026-10-30T22:08:13.306287832Z",
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
  "session_id": "4f22ee51-8530-4d23-92c3-6bcfbabde88c",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3OTMsImlhdCI6MTc5MzM1NDg5MywianRpIjoiOTRlODQxZDEtNWI5ZS00M2JkLTg4MjgtZGE4MzA1NzhhYjU2Iiwic2lkIjoiNGYyMmVlNTEtODUzMC00ZDIzLTkyYzMtNmJjZmJhYmRlODhjIn0.VKj7zqN2UkTerIA7uFODUjWfbtcfy6kibt9dzmZPztA",
  "access_expires_at": "2026-10-30T10:23:13.885231581Z",
  "refresh_token": "VEa6iIcJ6W7K7uw3RcVPcFKT1_Y_mFrgzFPfcuryMlI",
  "refresh_expires_at": "2026-10-30T22:08:13.884770048Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681160632",
  "device_ref": "sandbox-1390"
}
```

```json
{
  "challenge_id": "89595591-22ca-4cc4-b244-62c53137d00a",
  "expires_at": "2026-10-30T10:13:14.149822643Z",
  "resend_available_at": "2026-10-30T10:08:15.149822643Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681160632` → **200**

```json
{
  "phone": "+380681160632",
  "audience": "CLIENT",
  "code": "398212",
  "sent_at": "2026-10-30T10:08:14.15244211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89595591-22ca-4cc4-b244-62c53137d00a",
  "code": "398212",
  "device_ref": "sandbox-1390"
}
```

```json
{
  "session_id": "f2893733-c469-4ee7-bf10-735729ead63c",
  "subject": {
    "type": "CLIENT",
    "id": "1e98283e-4ff4-43fb-9622-ba27bb87faa4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTk4MjgzZS00ZmY0LTQzZmItOTYyMi1iYTI3YmI4N2ZhYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1Nzk0LCJpYXQiOjE3OTMzNTQ4OTQsImp0aSI6IjNhYzU0NzY0LTkwOWQtNDE2ZS05YWRlLWVjOThkZjY0OTRjMCIsInNpZCI6ImYyODkzNzMzLWM0NjktNGVlNy1iZjEwLTczNTcyOWVhZDYzYyJ9.XGMBKKxb1i-jsKC-XQu6gvQH1fExhGTF09stRoDQXnI",
  "access_expires_at": "2026-10-30T10:23:14.434593489Z",
  "refresh_token": "0JOOWDhQpVORwgrl9LyhgnR-RKT9adO0OPkLvXdKzZ8",
  "refresh_expires_at": "2026-11-29T10:08:14.433950171Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b10b3f29-89c5-44fa-b2fb-956becd0b1aa",
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
  "id": "04938c3e-1aa6-46c3-bc3f-4f47c7ee2dc4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:14.712620Z",
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
  "command_id": "e6365437-4955-42d8-9034-da681b9614c0",
  "quote_id": "04938c3e-1aa6-46c3-bc3f-4f47c7ee2dc4",
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
  "id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e98283e-4ff4-43fb-9622-ba27bb87faa4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:08:14.986871Z",
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
    "id": "5c40ef02-9b8d-4713-b04d-e7446100ac32",
    "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
    "expires_at": "2026-10-30T10:08:29.989899Z",
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

`POST /api/driver/v1/offers/5c40ef02-9b8d-4713-b04d-e7446100ac32/reject` → **204**

```json
{
  "command_id": "5c0b76f8-119c-4238-9e4e-8b1f1117c981"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7f8bc8bf-e5b8-4624-b946-65d230bee6d3",
    "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
    "expires_at": "2026-10-30T10:08:30.545228Z",
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

`POST /api/driver/v1/offers/7f8bc8bf-e5b8-4624-b946-65d230bee6d3/accept` → **200**

```json
{
  "command_id": "2c974805-ed01-4b12-8de6-779464bbec6e"
}
```

```json
{
  "id": "cf79924f-df44-4758-8c15-3b7bff5995fe",
  "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ed8b7756-71e8-4ea9-85e8-5020bfdef7ef",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/b1ef1cb2-3cc1-4779-8282-d2d42c8cd978/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:08:14.987437Z",
      "actor": {
        "type": "CLIENT",
        "id": "1e98283e-4ff4-43fb-9622-ba27bb87faa4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
        "quote_id": "04938c3e-1aa6-46c3-bc3f-4f47c7ee2dc4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a5c1f019-96ec-4c7c-bc42-e1281b6b36fe"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:08:14.98913Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
        "attempt_id": "dfc8fe52-386b-4fdc-939d-1c6f3c4b6ad1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a5c1f019-96ec-4c7c-bc42-e1281b6b36fe"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:08:14.992617Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5c40ef02-9b8d-4713-b04d-e7446100ac32",
        "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "a5c1f019-96ec-4c7c-bc42-e1281b6b36fe"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T10:08:15.544265Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5c40ef02-9b8d-4713-b04d-e7446100ac32",
        "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978"
      },
      "correlation_id": "77fbd1ce-9627-43e0-938c-58f835795872"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order b1ef1cb2-3cc1-4779-8282-d2d42c8cd978 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/b1ef1cb2-3cc1-4779-8282-d2d42c8cd978` → **200**

```json
{
  "id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1e98283e-4ff4-43fb-9622-ba27bb87faa4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cf79924f-df44-4758-8c15-3b7bff5995fe",
    "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ed8b7756-71e8-4ea9-85e8-5020bfdef7ef",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T10:08:14.986871Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b1ef1cb2-3cc1-4779-8282-d2d42c8cd978/cancel` → **200**

```json
{
  "command_id": "fe5fea0b-eda0-4f69-aeef-74ca93c44534",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1e98283e-4ff4-43fb-9622-ba27bb87faa4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cf79924f-df44-4758-8c15-3b7bff5995fe",
    "order_id": "b1ef1cb2-3cc1-4779-8282-d2d42c8cd978",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ed8b7756-71e8-4ea9-85e8-5020bfdef7ef",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:08:14.986871Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
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
  "session_id": "e3cddc71-c355-4f48-a683-b91cc747b56a",
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
  "last_heartbeat_at": "2026-10-30T10:08:11.354543Z",
  "last_location_at": "2026-10-30T10:08:11.354543Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e3cddc71-c355-4f48-a683-b91cc747b56a/close` → **200**

```json
{
  "command_id": "97a155f3-cb07-4d74-b5b1-cf29b367c6a3",
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
  "session_id": "8f5a3c3b-881c-4605-906f-c3c8c0f0859b",
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
  "last_heartbeat_at": "2026-10-30T10:08:12.724825Z",
  "last_location_at": "2026-10-30T10:08:12.724825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8f5a3c3b-881c-4605-906f-c3c8c0f0859b/close` → **200**

```json
{
  "command_id": "e2e8f3e6-7b7f-4a2d-adcb-0752bd6f90bb",
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
  "session_id": "9d7dac9c-48a3-4e0b-89c2-1e8ee8358c83",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU3OTgsImlhdCI6MTc5MzM1NDg5OCwianRpIjoiNjdkYWQ1MDUtMzI2Mi00Njc1LWJjNDUtYTQ4ZDFhNWI2NTFhIiwic2lkIjoiOWQ3ZGFjOWMtNDhhMy00ZTBiLTg5YzItMWU4ZWU4MzU4YzgzIn0.Ki5q36fFtx2-aFm6PEV7ed7CXjhe5VUNrTHwu9-6zxw",
  "access_expires_at": "2026-10-30T10:23:18.392897053Z",
  "refresh_token": "MrdClK0sEYUrkk4sGxj6SpN_ZcffyqiQ8OTe8_T46J4",
  "refresh_expires_at": "2026-10-30T22:08:18.392124019Z",
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
  "command_id": "a7e6f4a9-095b-4908-af6b-1139946db3f3",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T10:08:18.956654Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "4ec57824-0e82-4e6b-ab81-5c789a71f77a",
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
  "correlation_id": "dbc17e78-578b-4052-a6cc-c8ab09d25fb7"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "3d221727-1634-4094-aa07-b3c78e1c2340",
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
  "correlation_id": "15e32fe4-ec23-4733-95aa-3a1e4da8637b"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634637906",
  "device_ref": "sandbox-32760"
}
```

```json
{
  "challenge_id": "9dc16dda-7dac-4d6f-8cd7-642bbb99c79d",
  "expires_at": "2026-10-30T10:13:19.779330624Z",
  "resend_available_at": "2026-10-30T10:08:20.779330624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634637906` → **200**

```json
{
  "phone": "+380634637906",
  "audience": "CLIENT",
  "code": "585490",
  "sent_at": "2026-10-30T10:08:19.781783097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dc16dda-7dac-4d6f-8cd7-642bbb99c79d",
  "code": "585490",
  "device_ref": "sandbox-32760"
}
```

```json
{
  "session_id": "dc2b4f30-7d34-4aa9-86ff-d146e3bd0597",
  "subject": {
    "type": "CLIENT",
    "id": "c5e51d27-70dd-4c55-808c-db25caf168c1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWU1MWQyNy03MGRkLTRjNTUtODA4Yy1kYjI1Y2FmMTY4YzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODAwLCJpYXQiOjE3OTMzNTQ5MDAsImp0aSI6ImE3NTRhMDZkLTRhODUtNDg5Ny04MzU5LTc5MWJjZThmMDhlYiIsInNpZCI6ImRjMmI0ZjMwLTdkMzQtNGFhOS04NmZmLWQxNDZlM2JkMDU5NyJ9.b4mHDcMTxI4Pbux_eJvDQoErLuNI8o6gmnwsZuZbFrs",
  "access_expires_at": "2026-10-30T10:23:20.066725379Z",
  "refresh_token": "alsotVdOinUNEGzEn1cgxDSBkSKO1tSM0ew2yJY6d3c",
  "refresh_expires_at": "2026-11-29T10:08:20.066292514Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "74a6796a-eba1-48e5-8460-addd4b8fd5bc",
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
  "id": "60555aad-7f99-449c-9b9e-db9d99eb866a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:20.342916Z",
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
  "command_id": "409891f5-5af0-46c4-a86f-d780b7a2e8a8",
  "quote_id": "60555aad-7f99-449c-9b9e-db9d99eb866a",
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
  "correlation_id": "5229447b-7985-4ac6-9c4f-ea5fff3dc3cb"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9c4c6d91-5c28-49ff-ad50-4e6e26b2b51e",
  "quote_id": "60555aad-7f99-449c-9b9e-db9d99eb866a",
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
  "id": "3e844089-71f0-4e9f-ab87-e212de9ae3c2",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5e51d27-70dd-4c55-808c-db25caf168c1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:08:20.902932Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3e844089-71f0-4e9f-ab87-e212de9ae3c2/cancel` → **200**

```json
{
  "command_id": "36f3671c-1876-41e5-a0d7-283f897b9686",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3e844089-71f0-4e9f-ab87-e212de9ae3c2",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c5e51d27-70dd-4c55-808c-db25caf168c1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:08:20.902932Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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
  "command_id": "4c20e3d2-9cd8-4f96-82fe-efae55378cc1",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T10:08:21.489221Z"
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
      "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T10:08:21.489221Z"
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
  "device_ref": "sandbox-24798"
}
```

```json
{
  "challenge_id": "1f44fc6c-5f11-4bf4-a079-db3f90a433cd",
  "expires_at": "2026-10-30T10:13:22.318905184Z",
  "resend_available_at": "2026-10-30T10:08:23.318905184Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "599857",
  "sent_at": "2026-10-30T10:08:22.321532845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f44fc6c-5f11-4bf4-a079-db3f90a433cd",
  "code": "599857",
  "device_ref": "sandbox-24798"
}
```

```json
{
  "session_id": "43a8371e-1252-4d1e-8f23-181bea539410",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTgwMiwiaWF0IjoxNzkzMzU0OTAyLCJqdGkiOiJlNzNmNjBmZC0xYjlmLTQyMWItYTIzNC1hMjFhMzk2NzMxNDIiLCJzaWQiOiI0M2E4MzcxZS0xMjUyLTRkMWUtOGYyMy0xODFiZWE1Mzk0MTAifQ.qmgaFzzf6kiWhKDN9eItCAztPtcF6Eogl3qXKZb0r_U",
  "access_expires_at": "2026-10-30T10:23:22.612728527Z",
  "refresh_token": "NNVj8vLD4gj3CnJx67FogW7toY0PTSGWvj5E2Q8dhhI",
  "refresh_expires_at": "2026-11-29T10:08:22.612091566Z",
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
  "command_id": "d56d7efd-40a3-4f86-892c-81680fb79ebc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:23Z",
    "sequence": 1793354903130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:23.147495Z",
  "last_location_at": "2026-10-30T10:08:23.147495Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676192299",
  "device_ref": "sandbox-31634"
}
```

```json
{
  "challenge_id": "26ee8c6f-8482-427d-8dd5-bbf0ecd89bca",
  "expires_at": "2026-10-30T10:13:23.417959803Z",
  "resend_available_at": "2026-10-30T10:08:24.417959803Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676192299` → **200**

```json
{
  "phone": "+380676192299",
  "audience": "CLIENT",
  "code": "346303",
  "sent_at": "2026-10-30T10:08:23.420238122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26ee8c6f-8482-427d-8dd5-bbf0ecd89bca",
  "code": "346303",
  "device_ref": "sandbox-31634"
}
```

```json
{
  "session_id": "d10b5f7d-3df4-4e5b-8a12-b6234cd52991",
  "subject": {
    "type": "CLIENT",
    "id": "d9e4b300-725f-4c46-88bf-e1dc77ea3ceb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOWU0YjMwMC03MjVmLTRjNDYtODhiZi1lMWRjNzdlYTNjZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODAzLCJpYXQiOjE3OTMzNTQ5MDMsImp0aSI6IjFjN2ZjYjVhLWQwMTktNDlhNC05NjkzLTEzYjk0YTNjMmQ4NyIsInNpZCI6ImQxMGI1ZjdkLTNkZjQtNGU1Yi04YTEyLWI2MjM0Y2Q1Mjk5MSJ9.5KXwakMvZDq9WRiEpad2IGlFOXpA2uxor0sxLegTHZU",
  "access_expires_at": "2026-10-30T10:23:23.7049251Z",
  "refresh_token": "KkX0_s42eHM4tmWyOVeWDrw4UpFbSoQfQA_mZR2oSjQ",
  "refresh_expires_at": "2026-11-29T10:08:23.704332863Z",
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
  "command_id": "67244b46-3465-44e4-9c95-88f714689d26",
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
  "id": "cc3c1342-3402-4dd2-963b-ece6ee90f617",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:24.233852Z",
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
  "command_id": "eb50046f-deef-4e8c-9624-b952ecb644f5",
  "platform": "ANDROID",
  "token": "sandbox-driver-4c24158d-f40c-480f-986d-313aa5cac580"
}
```

```json
{
  "id": "145d7924-b215-4276-924b-18d7c458abb6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T10:08:24.520913Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ecce3f41-bf3e-4082-afc3-10b412e7749a",
  "platform": "ANDROID",
  "token": "sandbox-rider-35558848-c534-448e-9e35-81882b8e990f"
}
```

```json
{
  "id": "ece2e544-9927-4167-a3a5-b79f406da7dc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T10:08:24.811802Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9890be28-b7da-4f48-bf1d-5c3415dfb90a",
  "quote_id": "cc3c1342-3402-4dd2-963b-ece6ee90f617",
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
  "id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d9e4b300-725f-4c46-88bf-e1dc77ea3ceb",
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
  "created_at": "2026-10-30T10:08:25.100676Z",
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
    "id": "1b64bac2-c309-4f62-8cde-5be3ae0a4533",
    "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
    "expires_at": "2026-10-30T10:08:40.104004Z",
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

`POST /api/driver/v1/offers/1b64bac2-c309-4f62-8cde-5be3ae0a4533/accept` → **200**

```json
{
  "command_id": "4e0020c1-fa0f-4c00-8eca-c946f015eff8"
}
```

```json
{
  "id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T10:08:25.761Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T10:08:25.761Z` → **200**

```json
[
  {
    "at": "2026-10-30T10:08:26.115319938Z",
    "token_suffix": "cac580",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "6f52203b-a301-4767-aad9-04512a2f8ebe"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676192299&after=2026-10-30T10:08:25.761Z` → **200**

```json
[
  {
    "at": "2026-10-30T10:08:26.112347528Z",
    "token_suffix": "8e990f",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "1abfeb71-f785-4204-bfe0-c96fc097cd04"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/0724801c-a096-4d49-8ac4-ad7f45cafae6/messages` → **201**

```json
{
  "command_id": "6cc17bfa-8b04-437b-8a65-43f93388822a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "ce86791d-31a9-4ecb-b527-96fc2fda6ffa",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T10:08:27.037252667Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "assignment_id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
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

`POST /api/driver/v1/trips/2fea4f18-2a52-4214-a0a2-77166c4f0878/messages` → **201**

```json
{
  "command_id": "c3248372-b4eb-49f9-8f36-77943df831d1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "cb5bf45a-b3d5-45f6-b910-bfeef94c3059",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T10:08:27.562312691Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/0724801c-a096-4d49-8ac4-ad7f45cafae6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/2fea4f18-2a52-4214-a0a2-77166c4f0878/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676192299"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:28Z",
    "sequence": 1793354908344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:28.360936Z",
  "last_location_at": "2026-10-30T10:08:28.360936Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "assignment_id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
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

`POST /api/driver/v1/trips/2fea4f18-2a52-4214-a0a2-77166c4f0878/arrive` → **200**

```json
{
  "command_id": "cd10db7e-3f06-4c88-ac30-6c9cf3d27714",
  "expected_version": 0
}
```

```json
{
  "id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "assignment_id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
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
  "arrived_at": "2026-10-30T10:08:28.891297Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2fea4f18-2a52-4214-a0a2-77166c4f0878/start` → **200**

```json
{
  "command_id": "d75d1b2c-dd7d-4576-9a9f-b8e69a28ce61",
  "expected_version": 1
}
```

```json
{
  "id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "assignment_id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
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
  "arrived_at": "2026-10-30T10:08:28.891297Z",
  "started_at": "2026-10-30T10:08:29.170602Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:29Z",
    "sequence": 1793354909439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:29.465456Z",
  "last_location_at": "2026-10-30T10:08:29.465456Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/2fea4f18-2a52-4214-a0a2-77166c4f0878/complete` → **200**

```json
{
  "command_id": "b7e643b9-553c-4138-8de7-4e21577fa859",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:08:29Z",
  "cash_received": true
}
```

```json
{
  "id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "assignment_id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
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
  "arrived_at": "2026-10-30T10:08:28.891297Z",
  "started_at": "2026-10-30T10:08:29.170602Z",
  "completed_at": "2026-10-30T10:08:29.743572Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/0724801c-a096-4d49-8ac4-ad7f45cafae6` → **200**

```json
{
  "id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d9e4b300-725f-4c46-88bf-e1dc77ea3ceb",
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
    "id": "ac381159-cb2d-404c-ba13-d2085d2cf730",
    "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:08:25.100676Z",
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
    "id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T10:08:25.100676Z",
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
    "id": "2fea4f18-2a52-4214-a0a2-77166c4f0878",
    "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
    "order_short_number": 13,
    "created_at": "2026-10-30T10:08:25.676839Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5569e8ca-f6c0-475d-b542-2bc6bdb7fee8",
    "order_id": "8eeea616-3d4e-4e89-ba71-f0d52f6fd9c2",
    "order_short_number": 8,
    "created_at": "2026-10-30T10:07:18.372771Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ea57dede-82f4-407d-a9b1-8a9b5259eb0d",
    "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
    "order_short_number": 3,
    "created_at": "2026-10-30T10:06:30.51656Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2f040bf8-cacc-4f62-9dd2-6c27ebd0badc",
    "order_id": "7bf95c76-b348-4e06-a3e9-ec5723cbdff2",
    "order_short_number": 2,
    "created_at": "2026-10-30T10:06:11.621168Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c7119a68-0c15-4fd8-85ad-73d095ee2997",
    "order_id": "1c62727e-0cea-4504-bf65-4e6c70a74c33",
    "order_short_number": 1,
    "created_at": "2026-10-30T10:06:02.16044Z",
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

`GET /api/rider/v1/orders/0724801c-a096-4d49-8ac4-ad7f45cafae6/tip` → **200**

```json
{
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
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
  "available_until": "2026-10-31T10:08:29.743572Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0724801c-a096-4d49-8ac4-ad7f45cafae6/tip` → **201**

```json
{
  "command_id": "b7f620ed-3ef2-4083-a761-e5a53902f442",
  "amount_minor": 1100
}
```

```json
{
  "id": "b4c7cf9a-2567-444a-a537-bf4d2f596e93",
  "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T10:08:34.643061Z"
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
  "session_id": "a1725622-06f7-44b7-8922-78f9c0ebe421",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MTUsImlhdCI6MTc5MzM1NDkxNSwianRpIjoiNjhlZjg1MDUtNWQ1YS00MjcwLThlMTgtZGUwMTRiMzVkNjRlIiwic2lkIjoiYTE3MjU2MjItMDZmNy00NGI3LTg5MjItNzhmOWMwZWJlNDIxIn0.CglavQcI2JoyZF2FRjl739AHqGhwqiXQc82Jl41MEl4",
  "access_expires_at": "2026-10-30T10:23:35.253779911Z",
  "refresh_token": "0cTWkGIJsfarbX3zcrN_glUlIhrP2obhot_CIFUqwUs",
  "refresh_expires_at": "2026-10-30T22:08:35.253098612Z",
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
          "PHONE": 1,
          "APP": 12
        },
        "by_payment": {
          "CARD": 2,
          "CASH": 11
        },
        "cancelled_by": {
          "STAFF": 1,
          "DRIVER": 1,
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
      "CARD": 2,
      "CASH": 11
    },
    "cancelled_by": {
      "STAFF": 1,
      "DRIVER": 1,
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
  "generated_at": "2026-10-30T10:08:35.526474956Z"
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
  "generated_at": "2026-10-30T10:08:35.792634352Z"
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
  "session_id": "52c12499-f0b3-400a-a60c-4b8919374d71",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MTYsImlhdCI6MTc5MzM1NDkxNiwianRpIjoiZWNiZTMxMzktMmNhZi00Y2RjLTk2ODItNWU1MmQ5OTdjNzU4Iiwic2lkIjoiNTJjMTI0OTktZjBiMy00MDBhLWE2MGMtNGI4OTE5Mzc0ZDcxIn0.UGnTgktkkLDlBkSIBPv-eOlnuUWNp7qUqenbjfdCMu0",
  "access_expires_at": "2026-10-30T10:23:36.379772182Z",
  "refresh_token": "YYLQbeVA5UTfLBn_bIrIAvlSV71InlEH6_IryVWpfNo",
  "refresh_expires_at": "2026-10-30T22:08:36.379194641Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0724801c-a096-4d49-8ac4-ad7f45cafae6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:08:25.101242Z",
      "actor": {
        "type": "CLIENT",
        "id": "d9e4b300-725f-4c46-88bf-e1dc77ea3ceb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
        "quote_id": "cc3c1342-3402-4dd2-963b-ece6ee90f617",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "82b0d9f4-19d2-4ca4-9977-5d01c26a6523"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:08:25.103169Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
        "attempt_id": "5ab8a2a3-1094-4643-8014-cf27ff6d96fe",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "82b0d9f4-19d2-4ca4-9977-5d01c26a6523"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:08:25.106302Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1b64bac2-c309-4f62-8cde-5be3ae0a4533",
        "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "82b0d9f4-19d2-4ca4-9977-5d01c26a6523"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:08:25.678108Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1b64bac2-c309-4f62-8cde-5be3ae0a4533",
        "order_id": "0724801c-a096-4d49-8ac4-ad7f45cafae6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ac381159-cb2d-404c-ba13-d2085d2cf730"
      },
      "correlation_id": "79df8826-ff9c-4456-a9ec-98da316e769f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T10:08:36.923399123Z",
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
      "last_location_at": "2026-10-30T10:08:29.465456Z",
      "order_id": null
    }
  ]
}
```

Done: order 0724801c-a096-4d49-8ac4-ad7f45cafae6.

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
  "session_id": "bc5b28c6-39d5-4248-bed8-c8f111067436",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MTcsImlhdCI6MTc5MzM1NDkxNywianRpIjoiNTNhZjM3Y2UtY2FjMS00YTQwLWE4YjItYmU1NjEzZTgzYjZlIiwic2lkIjoiYmM1YjI4YzYtMzlkNS00MjQ4LWJlZDgtYzhmMTExMDY3NDM2In0.dEaqONbBAIOLvLdUyEvHFBhLItm2XCpwMxDk2RLgX2w",
  "access_expires_at": "2026-10-30T10:23:37.530701284Z",
  "refresh_token": "W6tXsPJewRrt8p-h29Lv6U8cOqVhEe_vmUZSafleCXw",
  "refresh_expires_at": "2026-10-30T22:08:37.530115921Z",
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
  "command_id": "5fa6bdb5-c85a-4b5a-9e2c-098601f5d4f7",
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
  "timestamp": "2026-10-30T10:08:38.000+0000",
  "channel": {
    "id": "1730052000.286956907",
    "linkedid": "1730052000.286956907",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677843511"
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
  "timestamp": "2026-10-30T10:08:38.000+0000",
  "channel": {
    "id": "1730052000.286956907",
    "linkedid": "1730052000.286956907",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677843511"
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
  "session_id": "ffe271f7-768c-45b0-a4b4-376c3e8c7e1b",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MTgsImlhdCI6MTc5MzM1NDkxOCwianRpIjoiZTQ3NjJkYzQtMmUzYi00YTAwLTgyMDktMWE0ZjZkNjA5MjZmIiwic2lkIjoiZmZlMjcxZjctNzY4Yy00NWIwLWE0YjQtMzc2YzNlOGM3ZTFiIn0.ZMSs5VpspqdsBz6rMcm7cV7UWoGyZbe7oeGdlmpvQW8",
  "access_expires_at": "2026-10-30T10:23:38.694092707Z",
  "refresh_token": "aNnVV0ibU2NQ2i0adk0ojOLhbo_x1XWJeq4St3M5wJQ",
  "refresh_expires_at": "2026-10-30T22:08:38.693562757Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "b46db3e6-70a9-43dd-8a2b-707ff5c7c259",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677843511",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T10:08:38Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/b46db3e6-70a9-43dd-8a2b-707ff5c7c259/answer` → **200**

```json
{
  "command_id": "e50c6836-2327-4d2b-ab1b-e442e26284da"
}
```

```json
{
  "id": "b46db3e6-70a9-43dd-8a2b-707ff5c7c259",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677843511",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "order_ids": [],
  "started_at": "2026-10-30T10:08:38Z",
  "answered_at": "2026-10-30T10:08:39.244572Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.286956907",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6e485a89-0435-43a4-b957-ace449eab42e",
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
  "id": "c7a3a202-c260-4168-83db-1754b880b9f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:39.544595Z",
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
  "command_id": "9cf1aae5-2720-48ee-8f4e-369ff2f7a303",
  "quote_id": "c7a3a202-c260-4168-83db-1754b880b9f9",
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
    "phone": "+380677843511"
  },
  "call_id": "b46db3e6-70a9-43dd-8a2b-707ff5c7c259"
}
```

```json
{
  "id": "6843ab1f-229a-4a25-93fe-f05f1fdf4cc0",
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
  "created_at": "2026-10-30T10:08:39.831863Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677843511"
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
    "id": "1730052000.286956907",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b46db3e6-70a9-43dd-8a2b-707ff5c7c259",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677843511",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [
        "6843ab1f-229a-4a25-93fe-f05f1fdf4cc0"
      ],
      "started_at": "2026-10-30T10:08:38Z",
      "answered_at": "2026-10-30T10:08:39.244572Z",
      "ended_at": "2026-10-30T10:08:40.15231Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "474be2af-00a7-4d8b-bab1-97908e802a8f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673280758",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [],
      "started_at": "2026-10-30T10:06:19.56046Z",
      "answered_at": "2026-10-30T10:06:19.869132Z",
      "ended_at": "2026-10-30T10:06:20.16598Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:06:26.506832Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/6843ab1f-229a-4a25-93fe-f05f1fdf4cc0` → **200**

```json
{
  "id": "6843ab1f-229a-4a25-93fe-f05f1fdf4cc0",
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
  "created_at": "2026-10-30T10:08:39.831863Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677843511"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/6843ab1f-229a-4a25-93fe-f05f1fdf4cc0` → **200**

```json
{
  "id": "6843ab1f-229a-4a25-93fe-f05f1fdf4cc0",
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
  "created_at": "2026-10-30T10:08:39.831863Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677843511"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6843ab1f-229a-4a25-93fe-f05f1fdf4cc0/cancel` → **200**

```json
{
  "command_id": "56f26a09-5060-402f-9cf5-d6189a8c44f2",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6843ab1f-229a-4a25-93fe-f05f1fdf4cc0",
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
  "created_at": "2026-10-30T10:08:39.831863Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677843511"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call b46db3e6-70a9-43dd-8a2b-707ff5c7c259 with order 6843ab1f-229a-4a25-93fe-f05f1fdf4cc0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15766"
}
```

```json
{
  "challenge_id": "5677c3d5-7065-403d-bffd-5bcdd71add01",
  "expires_at": "2026-10-30T10:13:41.304991687Z",
  "resend_available_at": "2026-10-30T10:08:42.304991687Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "429233",
  "sent_at": "2026-10-30T10:08:41.307510316Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5677c3d5-7065-403d-bffd-5bcdd71add01",
  "code": "429233",
  "device_ref": "sandbox-15766"
}
```

```json
{
  "session_id": "58e8d7bd-beb0-47b1-a5d9-6d521703795e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTgyMSwiaWF0IjoxNzkzMzU0OTIxLCJqdGkiOiIxNWRiOWVmYy1lNjJjLTQ4YTgtODY4MC1jODkyMjNkMzk2ZTkiLCJzaWQiOiI1OGU4ZDdiZC1iZWIwLTQ3YjEtYTVkOS02ZDUyMTcwMzc5NWUifQ.7_N31FTD4iCaMZ53_pEFL2iIkpz3oIikPRye5cTTdME",
  "access_expires_at": "2026-10-30T10:23:41.592801487Z",
  "refresh_token": "ODjViqFgoSakPl-7cAiA4Jb-EXsr-RbJ4dkKpyRLmwc",
  "refresh_expires_at": "2026-11-29T10:08:41.592338461Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:29.465456Z",
  "last_location_at": "2026-10-30T10:08:29.465456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/handover` → **200**

```json
{
  "command_id": "379f9384-0495-4bda-a4ea-4fdb2c3cfc08",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:29.465456Z",
  "last_location_at": "2026-10-30T10:08:29.465456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:42Z",
    "sequence": 1793354922406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:42.423304Z",
  "last_location_at": "2026-10-30T10:08:42.423304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662290112",
  "device_ref": "sandbox-9458"
}
```

```json
{
  "challenge_id": "9aed9318-e62d-4fd2-a098-6a68c2fd9a00",
  "expires_at": "2026-10-30T10:13:42.682826227Z",
  "resend_available_at": "2026-10-30T10:08:43.682826227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662290112` → **200**

```json
{
  "phone": "+380662290112",
  "audience": "CLIENT",
  "code": "280550",
  "sent_at": "2026-10-30T10:08:42.685074025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9aed9318-e62d-4fd2-a098-6a68c2fd9a00",
  "code": "280550",
  "device_ref": "sandbox-9458"
}
```

```json
{
  "session_id": "6ae87743-719c-4887-b184-01e818c091e2",
  "subject": {
    "type": "CLIENT",
    "id": "ea293c56-8a02-4345-8b26-81ebb288ecbb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYTI5M2M1Ni04YTAyLTQzNDUtOGIyNi04MWViYjI4OGVjYmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODIyLCJpYXQiOjE3OTMzNTQ5MjIsImp0aSI6ImM1MTYxOGQ2LWI5OTAtNDZmNS04NjMyLWU1YjE2YzM0YjUyYiIsInNpZCI6IjZhZTg3NzQzLTcxOWMtNDg4Ny1iMTg0LTAxZTgxOGMwOTFlMiJ9.UTzwPdOWyJGCWf6AF5AhCeNpZErcMWAn6mxXrL24LN0",
  "access_expires_at": "2026-10-30T10:23:42.966670024Z",
  "refresh_token": "Xx-ZxoM5_WRtXEbzEk8IpkArcaKSfLZCXpxg852J8MM",
  "refresh_expires_at": "2026-11-29T10:08:42.966229206Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bcbe146e-1c7b-49c7-85d5-be01876191bd",
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
  "id": "9d228381-796d-4571-aed8-395e34f512f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:43.234572Z",
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
  "command_id": "a5a75874-ef8c-49d2-90f6-08725d111456",
  "quote_id": "9d228381-796d-4571-aed8-395e34f512f4",
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
  "id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ea293c56-8a02-4345-8b26-81ebb288ecbb",
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
  "created_at": "2026-10-30T10:08:43.511107Z",
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
    "id": "c8bd0e0b-fafb-4f03-a0f5-8ad903deaa77",
    "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
    "expires_at": "2026-10-30T10:08:58.514068Z",
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

`POST /api/driver/v1/offers/c8bd0e0b-fafb-4f03-a0f5-8ad903deaa77/accept` → **200**

```json
{
  "command_id": "a374e7ff-a203-4ebf-a68c-19e077d2cdcb"
}
```

```json
{
  "id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8",
  "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "39687ee4-e83a-45a1-b723-df13dd002578",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "39687ee4-e83a-45a1-b723-df13dd002578",
  "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
  "assignment_id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8",
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

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:44Z",
    "sequence": 1793354924573
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:44.589647Z",
  "last_location_at": "2026-10-30T10:08:44.589647Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/39687ee4-e83a-45a1-b723-df13dd002578/arrive` → **200**

```json
{
  "command_id": "235ea5a6-4afc-4db8-a623-c75e9104f9ab",
  "expected_version": 0
}
```

```json
{
  "id": "39687ee4-e83a-45a1-b723-df13dd002578",
  "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
  "assignment_id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8",
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
  "arrived_at": "2026-10-30T10:08:44.857577Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/39687ee4-e83a-45a1-b723-df13dd002578/start` → **200**

```json
{
  "command_id": "6855dced-d405-49cc-95ed-4fb8e4529005",
  "expected_version": 1
}
```

```json
{
  "id": "39687ee4-e83a-45a1-b723-df13dd002578",
  "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
  "assignment_id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8",
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
  "arrived_at": "2026-10-30T10:08:44.857577Z",
  "started_at": "2026-10-30T10:08:45.145866Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:45Z",
    "sequence": 1793354925419
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:45.436271Z",
  "last_location_at": "2026-10-30T10:08:45.436271Z",
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
  "device_ref": "sandbox-18066"
}
```

```json
{
  "challenge_id": "11672dc2-8e6c-4f7f-9cc1-9e0fceccba4a",
  "expires_at": "2026-10-30T10:13:45.698208134Z",
  "resend_available_at": "2026-10-30T10:08:46.698208134Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "077836",
  "sent_at": "2026-10-30T10:08:45.701052235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11672dc2-8e6c-4f7f-9cc1-9e0fceccba4a",
  "code": "077836",
  "device_ref": "sandbox-18066"
}
```

```json
{
  "session_id": "4aa8c95f-8d09-49d9-b912-b3522760d722",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTgyNiwiaWF0IjoxNzkzMzU0OTI2LCJqdGkiOiJmMDRiMDFiYS03OGUyLTRjMTktODY5ZS02NmY5YjU0ZTUyYzYiLCJzaWQiOiI0YWE4Yzk1Zi04ZDA5LTQ5ZDktYjkxMi1iMzUyMjc2MGQ3MjIifQ.CzVZcineH2Lfb2ZNSmy16kF9Cy25lIW4rFK6Dad2Zt0",
  "access_expires_at": "2026-10-30T10:23:46.00433999Z",
  "refresh_token": "NSU3-9613oVC1kaAcuaYqgy9uaBro3x2wCKPtX1l7bg",
  "refresh_expires_at": "2026-11-29T10:08:46.003721411Z",
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
  "command_id": "9a3b6d0f-5f7f-45b9-8181-e83f02909584",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:46Z",
    "sequence": 1793354926529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27ea1296-d7b8-4267-9a06-88d46d7123fd",
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
  "last_heartbeat_at": "2026-10-30T10:08:46.548627Z",
  "last_location_at": "2026-10-30T10:08:46.548627Z",
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
  "session_id": "18cae896-6bfc-46e6-9fce-2bb1dcfad538",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MjcsImlhdCI6MTc5MzM1NDkyNywianRpIjoiMGE1ZmM0MzYtNTJiMS00YWU1LTgxYjgtMTJmMmJjYWJjYWVmIiwic2lkIjoiMThjYWU4OTYtNmJmYy00NmU2LTlmY2UtMmJiMWRjZmFkNTM4In0.tv4gx0eOsTj46nHJ8m7-fatg9CIawHOJMJKgpQxMNYk",
  "access_expires_at": "2026-10-30T10:23:47.140284744Z",
  "refresh_token": "alJJ6MXeO1bf6TMuM60Pz9PdQNQY_tnpKJXlRTx7fHs",
  "refresh_expires_at": "2026-10-30T22:08:47.139832143Z",
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
  "session_id": "3032fae3-4a37-4d5e-a8f5-fa76a0e8cea0",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MjcsImlhdCI6MTc5MzM1NDkyNywianRpIjoiYzBkZWJlMjktYmJiOS00N2EwLWFhZTMtMDBlYjRiZjMwNWRlIiwic2lkIjoiMzAzMmZhZTMtNGEzNy00ZDVlLWE4ZjUtZmE3NmEwZThjZWEwIn0.-iRwWlwS7M6k8uhpvjC09_laFYeUsyBaWcVl_hbxOzw",
  "access_expires_at": "2026-10-30T10:23:47.727909857Z",
  "refresh_token": "wfTZTo72wbzDt6G-ETELHtawzJSJZm3qxU5dwyytYy4",
  "refresh_expires_at": "2026-10-30T22:08:47.727374721Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eb6bff84-ca93-4781-ba6d-6bc222976e86` → **200**

```json
{
  "id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ea293c56-8a02-4345-8b26-81ebb288ecbb",
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
    "id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8",
    "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "39687ee4-e83a-45a1-b723-df13dd002578",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T10:08:43.511107Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/eb6bff84-ca93-4781-ba6d-6bc222976e86/interrupt` → **200**

```json
{
  "command_id": "2a1e699f-703c-4d66-86aa-0ebb5e5929c9",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "ea293c56-8a02-4345-8b26-81ebb288ecbb",
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
      "id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8",
      "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "39687ee4-e83a-45a1-b723-df13dd002578",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T10:08:43.511107Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "ea293c56-8a02-4345-8b26-81ebb288ecbb",
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
    "id": "19a6fa64-d082-4ee6-82cf-7ac59a1dfd53",
    "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
    "expires_at": "2026-10-30T10:09:03.30328Z",
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

`POST /api/driver/v1/offers/19a6fa64-d082-4ee6-82cf-7ac59a1dfd53/accept` → **200**

```json
{
  "command_id": "19a598e5-0f99-49cb-ad1a-5b408e5766a0"
}
```

```json
{
  "id": "6c0f29b9-ac4d-47b8-8354-5de938e4bd35",
  "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3c6ac6fc-92a4-4d42-b333-eaa2368b31f9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3c6ac6fc-92a4-4d42-b333-eaa2368b31f9",
  "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
  "assignment_id": "6c0f29b9-ac4d-47b8-8354-5de938e4bd35",
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
  "session_id": "27ea1296-d7b8-4267-9a06-88d46d7123fd",
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
  "last_heartbeat_at": "2026-10-30T10:08:46.548627Z",
  "last_location_at": "2026-10-30T10:08:46.548627Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/27ea1296-d7b8-4267-9a06-88d46d7123fd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:08:49Z",
    "sequence": 1793354929700
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27ea1296-d7b8-4267-9a06-88d46d7123fd",
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
  "last_heartbeat_at": "2026-10-30T10:08:49.71899Z",
  "last_location_at": "2026-10-30T10:08:49.71899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3c6ac6fc-92a4-4d42-b333-eaa2368b31f9/arrive` → **200**

```json
{
  "command_id": "a0414bdb-68f4-48e9-9ff8-1cd9cef1491b",
  "expected_version": 0
}
```

```json
{
  "id": "3c6ac6fc-92a4-4d42-b333-eaa2368b31f9",
  "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
  "assignment_id": "6c0f29b9-ac4d-47b8-8354-5de938e4bd35",
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
  "arrived_at": "2026-10-30T10:08:49.9994Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c6ac6fc-92a4-4d42-b333-eaa2368b31f9/start` → **200**

```json
{
  "command_id": "c54a0063-9776-4970-a7ab-85f1fd22af50",
  "expected_version": 1
}
```

```json
{
  "id": "3c6ac6fc-92a4-4d42-b333-eaa2368b31f9",
  "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
  "assignment_id": "6c0f29b9-ac4d-47b8-8354-5de938e4bd35",
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
  "arrived_at": "2026-10-30T10:08:49.9994Z",
  "started_at": "2026-10-30T10:08:50.292126Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c6ac6fc-92a4-4d42-b333-eaa2368b31f9/complete` → **200**

```json
{
  "command_id": "2c872dce-fc57-4c73-9773-40516191601d",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:08:50Z"
}
```

```json
{
  "id": "3c6ac6fc-92a4-4d42-b333-eaa2368b31f9",
  "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
  "assignment_id": "6c0f29b9-ac4d-47b8-8354-5de938e4bd35",
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
  "arrived_at": "2026-10-30T10:08:49.9994Z",
  "started_at": "2026-10-30T10:08:50.292126Z",
  "completed_at": "2026-10-30T10:08:50.57726Z",
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
    "id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T10:08:48.294693Z",
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
    "id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T10:08:43.511107Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
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

`GET /api/operator/v1/orders/eb6bff84-ca93-4781-ba6d-6bc222976e86/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T10:08:43.511643Z",
      "actor": {
        "type": "CLIENT",
        "id": "ea293c56-8a02-4345-8b26-81ebb288ecbb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
        "quote_id": "9d228381-796d-4571-aed8-395e34f512f4",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "805a05dc-98ad-45dc-9981-536315780a35"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T10:08:43.513395Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
        "attempt_id": "03c23ff0-5a70-4f76-bf01-5b479749e4ea",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "805a05dc-98ad-45dc-9981-536315780a35"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T10:08:43.515708Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c8bd0e0b-fafb-4f03-a0f5-8ad903deaa77",
        "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "805a05dc-98ad-45dc-9981-536315780a35"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T10:08:44.058563Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c8bd0e0b-fafb-4f03-a0f5-8ad903deaa77",
        "order_id": "eb6bff84-ca93-4781-ba6d-6bc222976e86",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6efa3c7f-ac96-4ba7-a13c-0e14a88d87c8"
      },
      "correlation_id": "c19ba0fb-8afc-49d9-9601-8b331cff3559"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0/tip` → **200**

```json
{
  "order_id": "08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0",
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
  "available_until": "2026-10-31T10:08:50.57726Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0/tip` → **409**

```json
{
  "command_id": "ff985bb8-8962-4f4f-81bd-0cc4380dc906",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c47dd3c0-08c2-4efb-97c9-17da3183e773"
}
```

Done: interrupted eb6bff84-ca93-4781-ba6d-6bc222976e86, follow-up 08de8dab-b4e7-4ce4-9bc8-5b3c27a7d1c0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a1fc4e7-7936-4d0f-b8a6-170289f53ede",
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
  "last_heartbeat_at": "2026-10-30T10:08:45.436271Z",
  "last_location_at": "2026-10-30T10:08:45.436271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a1fc4e7-7936-4d0f-b8a6-170289f53ede/close` → **200**

```json
{
  "command_id": "2e2b4d20-116f-4d35-aca2-70ce2f36e240",
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
  "session_id": "27ea1296-d7b8-4267-9a06-88d46d7123fd",
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
  "last_heartbeat_at": "2026-10-30T10:08:49.71899Z",
  "last_location_at": "2026-10-30T10:08:49.71899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27ea1296-d7b8-4267-9a06-88d46d7123fd/close` → **200**

```json
{
  "command_id": "87bededf-7ff8-43c0-b7ef-f4062b9f48a3",
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
  "session_id": "3ca760d9-67f1-4301-968d-337eaf896d96",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4MzYsImlhdCI6MTc5MzM1NDkzNiwianRpIjoiZjgxNGQ5ZDAtNTA3Ni00MDljLWJlM2MtZGYxYjBjOTUxNWMzIiwic2lkIjoiM2NhNzYwZDktNjdmMS00MzAxLTk2OGQtMzM3ZWFmODk2ZDk2In0.oYFa7Qau4NnvZ5K5p6loufDPkFZ7R8F8f1av4JDcMJI",
  "access_expires_at": "2026-10-30T10:23:56.673688688Z",
  "refresh_token": "Z-A8_28uhHKUV67GcgP20hZxYq86a3H_3JrMbzQdzy4",
  "refresh_expires_at": "2026-10-30T22:08:56.672575769Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "eec8cc29-3b27-414d-a076-2754c032bc61",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:08:56Z"
}
```

```json
{
  "id": "5727ad99-81c4-4db7-838e-9b1a6eab2022",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:08:56Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5727ad99-81c4-4db7-838e-9b1a6eab2022/publish` → **200**

```json
{
  "command_id": "d484b105-6538-430e-bdbe-7836b77be940",
  "expected_version": 0
}
```

```json
{
  "id": "5727ad99-81c4-4db7-838e-9b1a6eab2022",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:08:57.236439Z",
  "published_at": "2026-10-30T10:08:57.236439Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "5727ad99-81c4-4db7-838e-9b1a6eab2022",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T10:08:57.236439Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638443759",
  "device_ref": "sandbox-31150"
}
```

```json
{
  "challenge_id": "3c19c396-d1b3-484a-9514-3cfb39984f03",
  "expires_at": "2026-10-30T10:13:57.772922827Z",
  "resend_available_at": "2026-10-30T10:08:58.772922827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638443759` → **200**

```json
{
  "phone": "+380638443759",
  "audience": "CLIENT",
  "code": "543534",
  "sent_at": "2026-10-30T10:08:57.776073033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c19c396-d1b3-484a-9514-3cfb39984f03",
  "code": "543534",
  "device_ref": "sandbox-31150"
}
```

```json
{
  "session_id": "1b0166cb-7650-4784-90f4-1c97a63ea4fc",
  "subject": {
    "type": "CLIENT",
    "id": "881ef903-a595-4a32-abe2-f9a0738375c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODFlZjkwMy1hNTk1LTRhMzItYWJlMi1mOWEwNzM4Mzc1YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODM4LCJpYXQiOjE3OTMzNTQ5MzgsImp0aSI6ImU5OWFiYTlkLTI3OWUtNGMxMC05MjVjLWE4ZmM4OGI5MTA0YyIsInNpZCI6IjFiMDE2NmNiLTc2NTAtNDc4NC05MGY0LTFjOTdhNjNlYTRmYyJ9.O5gUxCjvurHdy-dqteVQNbKZ0cE1OInNsA49JK3ZHpw",
  "access_expires_at": "2026-10-30T10:23:58.069237399Z",
  "refresh_token": "tA-dKwe-Bp-chvXaHDKYwar-dSaNHJCRtRBm3RgjrJ4",
  "refresh_expires_at": "2026-11-29T10:08:58.068654811Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "5727ad99-81c4-4db7-838e-9b1a6eab2022",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T10:08:57.236439Z",
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
  "command_id": "92bcc476-3b37-416a-bebc-bd69963deb26",
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
  "id": "77140292-f33a-40ce-a563-c87499c4f50e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:58.609772Z",
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
  "command_id": "42ae5359-575c-490c-9aaa-7a47d20369e9",
  "quote_id": "77140292-f33a-40ce-a563-c87499c4f50e",
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
  "correlation_id": "0c1b8aac-dc6f-4aae-916c-a60afd84cdd8"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ad01a1f3-6e0c-4471-8d55-bd7e699fd98e",
  "version_id": "5727ad99-81c4-4db7-838e-9b1a6eab2022",
  "language": "uk"
}
```

```json
{
  "version_id": "5727ad99-81c4-4db7-838e-9b1a6eab2022",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T10:08:59.164562Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f57ac5a0-721a-4d49-8dce-c65272565c1a",
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
  "id": "6487a8de-f8b1-4d40-91a2-750eb2fe78c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:13:59.443610Z",
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
  "command_id": "6605c6a3-b630-499c-94eb-c56789dcc4a8",
  "quote_id": "6487a8de-f8b1-4d40-91a2-750eb2fe78c8",
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
  "id": "72d960e5-af4f-4bf2-aca8-47b1ca48a575",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "881ef903-a595-4a32-abe2-f9a0738375c8",
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
  "created_at": "2026-10-30T10:08:59.720019Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/72d960e5-af4f-4bf2-aca8-47b1ca48a575` → **200**

```json
{
  "id": "72d960e5-af4f-4bf2-aca8-47b1ca48a575",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "881ef903-a595-4a32-abe2-f9a0738375c8",
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
  "created_at": "2026-10-30T10:08:59.720019Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/72d960e5-af4f-4bf2-aca8-47b1ca48a575/cancel` → **200**

```json
{
  "command_id": "84a5b916-8227-48dd-bb8f-76d9050f47b7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "72d960e5-af4f-4bf2-aca8-47b1ca48a575",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "881ef903-a595-4a32-abe2-f9a0738375c8",
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
  "created_at": "2026-10-30T10:08:59.720019Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`POST /api/admin/v1/legal-documents/5727ad99-81c4-4db7-838e-9b1a6eab2022` → **409**

```json
{
  "command_id": "7c016484-790e-4cf8-930b-356ca8f50f57",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T10:09:00Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/5727ad99-81c4-4db7-838e-9b1a6eab2022",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "04435f68-537e-46fc-b193-ff28bd7a31da"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "36c18d86-827e-413c-a06d-7278a0336462",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:09:00Z"
}
```

```json
{
  "id": "fbdccb7d-3dc6-425b-bfd4-2dd8ef018623",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:09:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/fbdccb7d-3dc6-425b-bfd4-2dd8ef018623/publish` → **200**

```json
{
  "command_id": "723b1b94-a6e6-460a-91fb-33fa6ef7542a",
  "expected_version": 0
}
```

```json
{
  "id": "fbdccb7d-3dc6-425b-bfd4-2dd8ef018623",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T10:09:01.201117Z",
  "published_at": "2026-10-30T10:09:01.201117Z",
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
  "device_ref": "sandbox-32417"
}
```

```json
{
  "challenge_id": "4b806fae-e7e3-4bfd-b3ce-b9836eafa413",
  "expires_at": "2026-10-30T10:14:01.474005628Z",
  "resend_available_at": "2026-10-30T10:09:02.474005628Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "637353",
  "sent_at": "2026-10-30T10:09:01.476511831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b806fae-e7e3-4bfd-b3ce-b9836eafa413",
  "code": "637353",
  "device_ref": "sandbox-32417"
}
```

```json
{
  "session_id": "fe7d6b68-775f-4992-8767-5432aae91248",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTg0MSwiaWF0IjoxNzkzMzU0OTQxLCJqdGkiOiJkZWJjMzZkNS0xOGRmLTQ5YWQtODgzYy1jNGU3Y2VhMjU5NTEiLCJzaWQiOiJmZTdkNmI2OC03NzVmLTQ5OTItODc2Ny01NDMyYWFlOTEyNDgifQ.geFO_CAlXqNzWqpBS3k5lSBOHsnMDQEJTLY8zT-FjnA",
  "access_expires_at": "2026-10-30T10:24:01.762725908Z",
  "refresh_token": "Axn40v42OE5pxPzQbLHPt4b3tgGOA5qV0x-8eMmqZKs",
  "refresh_expires_at": "2026-11-29T10:09:01.762141154Z",
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
  "command_id": "bd55dc66-1db4-4a16-8606-a0bb04747f12",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:09:02Z",
    "sequence": 1793354942284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7445f3de-f037-4a5b-913f-079b64620a94",
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
  "last_heartbeat_at": "2026-10-30T10:09:02.301082Z",
  "last_location_at": "2026-10-30T10:09:02.301082Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679216360",
  "device_ref": "sandbox-25362"
}
```

```json
{
  "challenge_id": "be444018-a32b-4ccc-9c5b-ed549c979fb6",
  "expires_at": "2026-10-30T10:14:02.56896376Z",
  "resend_available_at": "2026-10-30T10:09:03.56896376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679216360` → **200**

```json
{
  "phone": "+380679216360",
  "audience": "CLIENT",
  "code": "048362",
  "sent_at": "2026-10-30T10:09:02.571291996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be444018-a32b-4ccc-9c5b-ed549c979fb6",
  "code": "048362",
  "device_ref": "sandbox-25362"
}
```

```json
{
  "session_id": "ee89e484-948d-43e3-b5b7-f5aea98aea7a",
  "subject": {
    "type": "CLIENT",
    "id": "6f76afac-dcb8-49ad-bf76-10778b65bff0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Zjc2YWZhYy1kY2I4LTQ5YWQtYmY3Ni0xMDc3OGI2NWJmZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODQyLCJpYXQiOjE3OTMzNTQ5NDIsImp0aSI6IjI2YmU1NTdkLWMxNWYtNDEwYS1iOTRjLWY0N2MzZTE2MDM3OCIsInNpZCI6ImVlODllNDg0LTk0OGQtNDNlMy1iNWI3LWY1YWVhOThhZWE3YSJ9.jzIav8_4L8-F4vSqtgdOf51uD6gRNoYDlQBX8fiz-6w",
  "access_expires_at": "2026-10-30T10:24:02.863779222Z",
  "refresh_token": "l1R3PGkhzcdGpnhK-gdbZBscogJx1-kbX6bIlsiegrI",
  "refresh_expires_at": "2026-11-29T10:09:02.863290712Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8b1e68f4-84cf-4418-bcb4-f21fb8d4cb35",
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
  "id": "cafeb58b-47c1-47e9-a7c7-8a8871dbe566",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:03.135464Z",
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
  "command_id": "02727ef1-d957-4925-bfde-2383c487ccb4",
  "quote_id": "cafeb58b-47c1-47e9-a7c7-8a8871dbe566",
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
    "phone": "+380676949382"
  }
}
```

```json
{
  "id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:09:03.417186Z",
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
    "id": "db6cb63d-c046-4621-99f0-7f02e66a7e37",
    "order_id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
    "expires_at": "2026-10-30T10:09:18.420624Z",
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

`POST /api/driver/v1/offers/db6cb63d-c046-4621-99f0-7f02e66a7e37/accept` → **200**

```json
{
  "command_id": "74c7adc9-6b2e-45b0-9fd4-d52c95267fb1"
}
```

```json
{
  "id": "09e9672e-a840-4e1b-a62b-a0469dd94668",
  "order_id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c0fc4a7-85b0-4e35-9284-a7ad352dcc8e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c0fc4a7-85b0-4e35-9284-a7ad352dcc8e",
  "order_id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
  "assignment_id": "09e9672e-a840-4e1b-a62b-a0469dd94668",
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
    "phone": "+380676949382"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c8a11d6b-4f82-4d28-88b8-a09fd9500a19",
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
  "id": "ebbecd86-0f5e-4945-a4c8-ecfdac001233",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:04.516716Z",
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
  "command_id": "0084fd90-c622-45cd-9d32-122ab07f7a35",
  "quote_id": "ebbecd86-0f5e-4945-a4c8-ecfdac001233",
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
  "id": "ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:09:04.799587Z",
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
  "command_id": "a9be3816-a809-4964-86e0-662ae7151ce0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T13:09:05Z"
}
```

```json
{
  "id": "036f950c-a836-4548-9b06-91239b992369",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:05.099149Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:09:05Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "31b75e37-46de-44c8-b15e-d41b1cc589cb",
  "quote_id": "036f950c-a836-4548-9b06-91239b992369",
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
  "pickup_at": "2026-10-30T13:09:05Z"
}
```

```json
{
  "id": "c3bccba2-cc62-4aca-bc6e-d188b40d7d3c",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:09:05.401243Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:09:05Z",
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
  "command_id": "359f4f0e-2d79-42ce-8e92-c79c07b903cc",
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
  "id": "c071b17e-bc15-46cc-b743-6e84dd25c3d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:05.693628Z",
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
  "command_id": "a25d0290-e0ad-433d-8e1c-dd2f1c27369b",
  "quote_id": "c071b17e-bc15-46cc-b743-6e84dd25c3d1",
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
  "correlation_id": "be544a59-72c1-4fd6-b093-aa69a500a7ff"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c3bccba2-cc62-4aca-bc6e-d188b40d7d3c",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T10:09:05.401243Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T13:09:05Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T10:09:04.799587Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:09:04.799587Z",
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

`GET /api/rider/v1/orders/7dd253d3-c500-45d3-b527-1a3c43bb6836` → **200**

```json
{
  "id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "09e9672e-a840-4e1b-a62b-a0469dd94668",
    "order_id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1c0fc4a7-85b0-4e35-9284-a7ad352dcc8e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T10:09:03.417186Z",
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
    "location_at": "2026-10-30T10:09:02.301082Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/7dd253d3-c500-45d3-b527-1a3c43bb6836/cancel` → **200**

```json
{
  "command_id": "d0babf85-c016-4ef6-a721-6bdf10172d45",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "09e9672e-a840-4e1b-a62b-a0469dd94668",
    "order_id": "7dd253d3-c500-45d3-b527-1a3c43bb6836",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1c0fc4a7-85b0-4e35-9284-a7ad352dcc8e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T10:09:03.417186Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab` → **200**

```json
{
  "id": "ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:09:04.799587Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab/cancel` → **200**

```json
{
  "command_id": "80f32f3e-5517-4c38-b7fc-c77436217d36",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:09:04.799587Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/c3bccba2-cc62-4aca-bc6e-d188b40d7d3c` → **200**

```json
{
  "id": "c3bccba2-cc62-4aca-bc6e-d188b40d7d3c",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:09:05.401243Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:09:05Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c3bccba2-cc62-4aca-bc6e-d188b40d7d3c/cancel` → **200**

```json
{
  "command_id": "0a7808c0-f79c-42b5-be90-51af85b6a794",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c3bccba2-cc62-4aca-bc6e-d188b40d7d3c",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6f76afac-dcb8-49ad-bf76-10778b65bff0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T10:09:05.401243Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-30T13:09:05Z",
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
  "session_id": "7445f3de-f037-4a5b-913f-079b64620a94",
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
  "last_heartbeat_at": "2026-10-30T10:09:02.301082Z",
  "last_location_at": "2026-10-30T10:09:02.301082Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7445f3de-f037-4a5b-913f-079b64620a94/close` → **200**

```json
{
  "command_id": "394ca2e3-bf58-491c-bba3-5319229ebd77",
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

Done: orders 7dd253d3-c500-45d3-b527-1a3c43bb6836, ad38afa9-108d-4b2d-b5fd-9fa13e7ccaab, c3bccba2-cc62-4aca-bc6e-d188b40d7d3c.

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
  "session_id": "48904151-967d-48b6-a2f5-e2d94707b4a1",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4NDksImlhdCI6MTc5MzM1NDk0OSwianRpIjoiMjFkNjY3ZTItNDczOS00NDU1LWJkN2YtMzdhNjI2OGJmOWRkIiwic2lkIjoiNDg5MDQxNTEtOTY3ZC00OGI2LWEyZjUtZTJkOTQ3MDdiNGExIn0.ZCdaEHveQ1o2B8iMKa_x8tiEknb0kHstLM2dWCEsbQs",
  "access_expires_at": "2026-10-30T10:24:09.323616852Z",
  "refresh_token": "nOYccFPQDGreVR8urY-Is2eFvfKnkSitXyV0ULwOxco",
  "refresh_expires_at": "2026-10-30T22:09:09.323018483Z",
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
  "session_id": "10a565e8-03de-48ec-9377-460ac68dd072",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4NDksImlhdCI6MTc5MzM1NDk0OSwianRpIjoiZjkwMDJkZjUtNDZmYS00YjIzLWI1ODMtNGI0MWU2Y2UzMTg5Iiwic2lkIjoiMTBhNTY1ZTgtMDNkZS00OGVjLTkzNzctNDYwYWM2OGRkMDcyIn0.DlAxR0cuB_gxpmH-rWr_Qeqis7A67UKj6eYfVIjp784",
  "access_expires_at": "2026-10-30T10:24:09.900030212Z",
  "refresh_token": "XxCi1CvfEe269b3T8DjsN9xLoD45OCXWshc8vPN4DZw",
  "refresh_expires_at": "2026-10-30T22:09:09.899485026Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19760"
}
```

```json
{
  "challenge_id": "76d32333-ba75-435f-bb8e-998f1dd4a847",
  "expires_at": "2026-10-30T10:14:10.156943452Z",
  "resend_available_at": "2026-10-30T10:09:11.156943452Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "725179",
  "sent_at": "2026-10-30T10:09:10.159550314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76d32333-ba75-435f-bb8e-998f1dd4a847",
  "code": "725179",
  "device_ref": "sandbox-19760"
}
```

```json
{
  "session_id": "e216f8bf-bc5c-4d70-99b2-38c78d81d09f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTg1MCwiaWF0IjoxNzkzMzU0OTUwLCJqdGkiOiIyYmNhODU3My0zYWE1LTQwNzktOWJiNy01YjYzNTQ5YTYyZTAiLCJzaWQiOiJlMjE2ZjhiZi1iYzVjLTRkNzAtOTliMi0zOGM3OGQ4MWQwOWYifQ.E_60Vksjqf4pwmTA6vjWcfeLrOpNz2Q8-aLAyTP_sq8",
  "access_expires_at": "2026-10-30T10:24:10.460801191Z",
  "refresh_token": "u3zvLcLPvGmJgpt2h6Wg_9eMQjBASJOctpuQwYI7NSM",
  "refresh_expires_at": "2026-11-29T10:09:10.460286944Z",
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
  "command_id": "ed29ebd7-4820-4414-be4d-51a2a4e19575",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:09:10Z",
    "sequence": 1793354950983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "545f0f9e-98a1-494c-ac55-92ff2620f6a5",
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
  "last_heartbeat_at": "2026-10-30T10:09:11.000019Z",
  "last_location_at": "2026-10-30T10:09:11.000019Z",
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
  "command_id": "ae72bb8d-0ed3-47b1-a743-56bce95b2dd2",
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
  "effective_at": "2026-10-30T10:09:11.540696Z",
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T10:06:35.141062Z",
  "last_entries": [
    {
      "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T10:06:35.141062Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e59d0897-396a-407e-aec8-609afaa1d3db",
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
  "id": "1020b55d-7c03-4d6a-a083-454caf9b8c81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:12.085744Z",
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
  "command_id": "a84e0598-7f47-4ccd-bf09-710d9c85df88",
  "quote_id": "1020b55d-7c03-4d6a-a083-454caf9b8c81",
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
    "phone": "+380671112392"
  }
}
```

```json
{
  "id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
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
  "created_at": "2026-10-30T10:09:12.367807Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112392"
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
    "id": "95a5e966-e71b-4041-9ef7-a699a2a0da4f",
    "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
    "expires_at": "2026-10-30T10:09:27.371228Z",
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

`POST /api/driver/v1/offers/95a5e966-e71b-4041-9ef7-a699a2a0da4f/accept` → **200**

```json
{
  "command_id": "b519fc8e-b67f-48f7-a313-0246a0e87628"
}
```

```json
{
  "id": "17b1edf1-378b-4437-bb13-fa7f414ad2c1",
  "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a79352fa-e5c3-4822-b39e-b9c2b18d8b86",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a79352fa-e5c3-4822-b39e-b9c2b18d8b86",
  "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
  "assignment_id": "17b1edf1-378b-4437-bb13-fa7f414ad2c1",
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
    "phone": "+380671112392"
  }
}
```

`POST /api/driver/v1/work-sessions/545f0f9e-98a1-494c-ac55-92ff2620f6a5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:09:13Z",
    "sequence": 1793354953458
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "545f0f9e-98a1-494c-ac55-92ff2620f6a5",
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
  "last_heartbeat_at": "2026-10-30T10:09:13.475338Z",
  "last_location_at": "2026-10-30T10:09:13.475338Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a79352fa-e5c3-4822-b39e-b9c2b18d8b86/arrive` → **200**

```json
{
  "command_id": "a3b49380-d321-494b-90b0-329e6d49d8d8",
  "expected_version": 0
}
```

```json
{
  "id": "a79352fa-e5c3-4822-b39e-b9c2b18d8b86",
  "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
  "assignment_id": "17b1edf1-378b-4437-bb13-fa7f414ad2c1",
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
  "arrived_at": "2026-10-30T10:09:13.74765Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112392"
  }
}
```

`POST /api/driver/v1/trips/a79352fa-e5c3-4822-b39e-b9c2b18d8b86/start` → **200**

```json
{
  "command_id": "acffe250-69b1-46e6-ae26-c2b16dc0f6e6",
  "expected_version": 1
}
```

```json
{
  "id": "a79352fa-e5c3-4822-b39e-b9c2b18d8b86",
  "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
  "assignment_id": "17b1edf1-378b-4437-bb13-fa7f414ad2c1",
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
  "arrived_at": "2026-10-30T10:09:13.74765Z",
  "started_at": "2026-10-30T10:09:14.029832Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112392"
  }
}
```

`POST /api/driver/v1/trips/a79352fa-e5c3-4822-b39e-b9c2b18d8b86/complete` → **200**

```json
{
  "command_id": "02484584-2502-4fab-abde-49b62d577874",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:09:14Z",
  "cash_received": true
}
```

```json
{
  "id": "a79352fa-e5c3-4822-b39e-b9c2b18d8b86",
  "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
  "assignment_id": "17b1edf1-378b-4437-bb13-fa7f414ad2c1",
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
  "arrived_at": "2026-10-30T10:09:13.74765Z",
  "started_at": "2026-10-30T10:09:14.029832Z",
  "completed_at": "2026-10-30T10:09:14.325107Z",
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
  "command_id": "5f3a25b7-35a8-41cd-bfac-b1406ddf135e",
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
  "id": "902c6596-6062-4048-8661-9de8431bc7cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:14.598339Z",
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
  "command_id": "f96b122e-ed8e-4e7c-98f0-707597f04cd6",
  "quote_id": "902c6596-6062-4048-8661-9de8431bc7cc",
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
    "phone": "+3806711119723"
  }
}
```

```json
{
  "id": "cb9c4af6-1f18-48fd-b9b3-72afbfad7409",
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
  "created_at": "2026-10-30T10:09:14.88198Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119723"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/cb9c4af6-1f18-48fd-b9b3-72afbfad7409` → **200**

```json
{
  "id": "cb9c4af6-1f18-48fd-b9b3-72afbfad7409",
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
  "created_at": "2026-10-30T10:09:14.88198Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119723"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cb9c4af6-1f18-48fd-b9b3-72afbfad7409/cancel` → **200**

```json
{
  "command_id": "2e4a652f-d702-47c3-9b6e-6f96fdf256be",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "cb9c4af6-1f18-48fd-b9b3-72afbfad7409",
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
  "created_at": "2026-10-30T10:09:14.88198Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119723"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
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
  "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T10:06:35.141062Z",
  "last_entries": [
    {
      "order_id": "cb9c4af6-1f18-48fd-b9b3-72afbfad7409",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T10:09:15.471887Z"
    },
    {
      "order_id": "5cd22542-23da-4ab2-aa5d-a6b50671bb26",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T10:09:14.329111Z"
    },
    {
      "order_id": "36883138-7fcd-484b-921d-ee1d0b762a3c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T10:06:35.141062Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "545f0f9e-98a1-494c-ac55-92ff2620f6a5",
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
  "last_heartbeat_at": "2026-10-30T10:09:13.475338Z",
  "last_location_at": "2026-10-30T10:09:13.475338Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/545f0f9e-98a1-494c-ac55-92ff2620f6a5/close` → **200**

```json
{
  "command_id": "849a16d5-cabf-4a4f-8935-5570b5d9c123",
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

Done: operator bonus for fulfilled 5cd22542-23da-4ab2-aa5d-a6b50671bb26 and operator-fault cancellation cb9c4af6-1f18-48fd-b9b3-72afbfad7409.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676290063",
  "device_ref": "sandbox-4297"
}
```

```json
{
  "challenge_id": "4be12a9c-56c5-40bc-aea6-e2b772dff82a",
  "expires_at": "2026-10-30T10:14:19.795730116Z",
  "resend_available_at": "2026-10-30T10:09:20.795730116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676290063` → **200**

```json
{
  "phone": "+380676290063",
  "audience": "CLIENT",
  "code": "252197",
  "sent_at": "2026-10-30T10:09:19.79789015Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675166072",
  "device_ref": "sandbox-17315",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "22294bcc-5a70-4aa9-9955-0e078683f343",
  "expires_at": "2026-10-30T10:14:21.290835767Z",
  "resend_available_at": "2026-10-30T10:09:22.290835767Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675166072` → **200**

```json
{
  "phone": "+380675166072",
  "audience": "CLIENT",
  "code": "816817",
  "sent_at": "2026-10-30T10:09:21.292781736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675166072",
  "device_ref": "sandbox-19545",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b0a80ac4-6061-492f-9aae-8671e7a2cb17",
  "expires_at": "2026-10-30T10:14:22.784274237Z",
  "resend_available_at": "2026-10-30T10:09:23.784274237Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675166072` → **200**

```json
{
  "phone": "+380675166072",
  "audience": "CLIENT",
  "code": "756442",
  "sent_at": "2026-10-30T10:09:22.786961747Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673670000",
  "device_ref": "sandbox-9616"
}
```

```json
{
  "challenge_id": "c01ab908-17b7-455f-a0ae-99c5fb3b77b5",
  "expires_at": "2026-10-30T10:14:24.282489162Z",
  "resend_available_at": "2026-10-30T10:09:25.282489162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673670000",
  "device_ref": "sandbox-6539"
}
```

```json
{
  "challenge_id": "e1ba5f74-0b75-403f-a337-3f30ca011f03",
  "expires_at": "2026-10-30T10:14:25.749335636Z",
  "resend_available_at": "2026-10-30T10:09:26.749335636Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673670000` → **200**

```json
{
  "phone": "+380673670000",
  "audience": "CLIENT",
  "code": "598150",
  "sent_at": "2026-10-30T10:09:25.77261974Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673670000",
  "device_ref": "sandbox-3094",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "472d396a-d9b9-41b7-9b51-2a5c89a33f6a",
  "expires_at": "2026-10-30T10:14:27.269280465Z",
  "resend_available_at": "2026-10-30T10:09:28.269280465Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673670000` → **200**

```json
{
  "phone": "+380673670000",
  "audience": "CLIENT",
  "code": "145288",
  "sent_at": "2026-10-30T10:09:27.271921467Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380673670000",
  "device_ref": "sandbox-1477",
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
  "correlation_id": "a43c5154-8254-46ae-9228-064c930dd950",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000012251"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "8e9470e5-e5dc-48a5-93a6-e0c0fa49f0ea"
}
```

`GET /sandbox/v1/otp?phone=%2B442000012251` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120030345"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "94434775-5dbe-4e05-b32f-7dcfc802cd79"
}
```

`GET /sandbox/v1/otp?phone=%2B37120030345` → **404**

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
  "session_id": "433a0abd-a7ad-4497-a3eb-92e7cb620fb9",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4NjksImlhdCI6MTc5MzM1NDk2OSwianRpIjoiMjQwNjk4NTQtNTY1MC00MGMyLThkNzAtYjFjNDNkMTBmZDU5Iiwic2lkIjoiNDMzYTBhYmQtYTdhZC00NDk3LWEzZWItOTJlN2NiNjIwZmI5In0.sAlOM4VHdm2dgCRmIK9HDcRsMaQ37E24paWJSOJTpqI",
  "access_expires_at": "2026-10-30T10:24:29.933803703Z",
  "refresh_token": "v_6fTsxK5aLvgZDtNyG8pzGEoH9geCObdOIT-r3bbfE",
  "refresh_expires_at": "2026-10-30T22:09:29.933330387Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673670000` → **200**

```json
{
  "deliveries": [
    {
      "id": "a722c8d1-6208-4457-aff6-ac980fb10706",
      "challenge_id": "472d396a-d9b9-41b7-9b51-2a5c89a33f6a",
      "phone": "+380673670000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-79be2c2f-2ab9-4879-8127-5f7da458d404",
      "error": null,
      "attempted_at": "2026-10-30T10:09:27.272524Z"
    },
    {
      "id": "214df15b-d068-46fa-ac70-267af88f9e42",
      "challenge_id": "e1ba5f74-0b75-403f-a337-3f30ca011f03",
      "phone": "+380673670000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-778d6d82-f16d-4a14-8e9b-37afbab154b2",
      "error": null,
      "attempted_at": "2026-10-30T10:09:25.77305Z"
    },
    {
      "id": "0bfb8115-12e9-4b6e-88bc-c864ae9e6915",
      "challenge_id": "c01ab908-17b7-455f-a0ae-99c5fb3b77b5",
      "phone": "+380673670000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T10:09:24.284913Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673670000` → **200**

```json
{
  "phone": "+380673670000",
  "audience": "CLIENT",
  "code": "145288",
  "sent_at": "2026-10-30T10:09:27.271921467Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675166072` → **200**

```json
{
  "deliveries": [
    {
      "id": "e79aa29f-8ff8-4dc3-8359-ae5ed1aaeb8a",
      "challenge_id": "b0a80ac4-6061-492f-9aae-8671e7a2cb17",
      "phone": "+380675166072",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1859aecb-e9e0-46e3-bfb1-a542e404608d",
      "error": null,
      "attempted_at": "2026-10-30T10:09:22.787461Z"
    },
    {
      "id": "0152b5bc-6fc4-4c21-a16b-9399ffb4ce17",
      "challenge_id": "22294bcc-5a70-4aa9-9955-0e078683f343",
      "phone": "+380675166072",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dca60114-ae5a-4806-9863-db14f41b2f07",
      "error": null,
      "attempted_at": "2026-10-30T10:09:21.293085Z"
    }
  ]
}
```

Done: SMS to +380676290063; SMS then a call to +380675166072; a failed SMS, two calls and a refused third to +380673670000; +44 and +371 refused.

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
  "session_id": "4172ccad-03e7-46f9-b408-8962f94741df",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4NzEsImlhdCI6MTc5MzM1NDk3MSwianRpIjoiMDljZTE0NWYtMGVlMi00MTM5LWI4ZTEtMzVkNDYyMmIwZWViIiwic2lkIjoiNDE3MmNjYWQtMDNlNy00NmY5LWI0MDgtODk2MmY5NDc0MWRmIn0.fPWLYHYXzTUNvCW_jxALS7Dd68BCM25BaqPYK61gceI",
  "access_expires_at": "2026-10-30T10:24:31.097538371Z",
  "refresh_token": "g7EDeoeMn6v__jLKh5mIqzdph-LkvwuW19y7CSjlpDM",
  "refresh_expires_at": "2026-10-30T22:09:31.096776046Z",
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
  "session_id": "8b9aae31-6893-4caa-9ee9-512734893265",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4NzEsImlhdCI6MTc5MzM1NDk3MSwianRpIjoiZTYxMmVkMjUtNjBkMC00NWEwLWExYTEtNTJiNTFlMmU2ODFkIiwic2lkIjoiOGI5YWFlMzEtNjg5My00Y2FhLTllZTktNTEyNzM0ODkzMjY1In0.OK92HXohIO--Z1vM1Ud_rEbXbaP_tGATbR56jLZeG7g",
  "access_expires_at": "2026-10-30T10:24:31.677435227Z",
  "refresh_token": "YBRTmMHyRyvhWuP73Qr3KgxyWxNmC46bV7cHoCtDljw",
  "refresh_expires_at": "2026-10-30T22:09:31.676905411Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
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

`POST /api/admin/v1/staff-extensions/64e3d877-e7ce-4f42-8498-69ee14ae4307` → **200**

```json
{
  "command_id": "4a8f5b7a-399a-4bff-bd8f-9a81633a58de",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "3d6365ea-1fcb-4408-802c-743b0e7f085b",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:09:32.776607Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T10:09:32.776607Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8e30fe7a-96d1-4ff4-a2b0-440a6e03338a",
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
  "id": "e5d39af1-2257-4b23-8e4f-8f3fea56058f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:33.313013Z",
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
  "command_id": "b9044396-2dd4-47fd-ab9a-9b9a4a89eb72",
  "quote_id": "e5d39af1-2257-4b23-8e4f-8f3fea56058f",
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
    "phone": "+380675684349"
  }
}
```

```json
{
  "id": "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204",
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
  "created_at": "2026-10-30T10:09:33.588376Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675684349"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/2fa3f7b0-5f8a-4698-bcaf-b25adef3c204/calls` → **201**

```json
{
  "command_id": "c82cfc50-d8b3-4cfa-bd7e-816b60b2d599",
  "to": "CALLER"
}
```

```json
{
  "id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "order_ids": [
    "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204"
  ],
  "started_at": "2026-10-30T10:09:33.884695Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/2fa3f7b0-5f8a-4698-bcaf-b25adef3c204/calls` → **201**

```json
{
  "command_id": "c82cfc50-d8b3-4cfa-bd7e-816b60b2d599",
  "to": "CALLER"
}
```

```json
{
  "id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "order_ids": [
    "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204"
  ],
  "started_at": "2026-10-30T10:09:33.884695Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675684349",
    "at": "2026-10-30T10:09:33.88714836Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.7505",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "86c95588-ba83-42b2-97b1-ec7083d4e3d7"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=2fa3f7b0-5f8a-4698-bcaf-b25adef3c204` → **200**

```json
{
  "calls": [
    {
      "id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [
        "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204"
      ],
      "started_at": "2026-10-30T10:09:33.884695Z",
      "answered_at": "2026-10-30T10:09:34.507411Z",
      "ended_at": "2026-10-30T10:09:34.526044Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=2fa3f7b0-5f8a-4698-bcaf-b25adef3c204` → **200**

```json
{
  "calls": [
    {
      "id": "86c95588-ba83-42b2-97b1-ec7083d4e3d7",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "order_ids": [
        "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204"
      ],
      "started_at": "2026-10-30T10:09:33.884695Z",
      "answered_at": "2026-10-30T10:09:34.507411Z",
      "ended_at": "2026-10-30T10:09:34.526044Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T10:09:36.562713Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/2fa3f7b0-5f8a-4698-bcaf-b25adef3c204` → **200**

```json
{
  "id": "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204",
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
  "created_at": "2026-10-30T10:09:33.588376Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675684349"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2fa3f7b0-5f8a-4698-bcaf-b25adef3c204/cancel` → **200**

```json
{
  "command_id": "e3e720a0-65ab-43b7-baa1-2254d6f7cdc3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2fa3f7b0-5f8a-4698-bcaf-b25adef3c204",
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
  "created_at": "2026-10-30T10:09:33.588376Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675684349"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
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
  "command_id": "a1843af3-3e32-4ac5-84ed-a2537b2f6998",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T10:09:37.681305Z",
  "extension": "101"
}
```

Done: outgoing call 86c95588-ba83-42b2-97b1-ec7083d4e3d7 from order 2fa3f7b0-5f8a-4698-bcaf-b25adef3c204, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637873702",
  "device_ref": "sandbox-18259"
}
```

```json
{
  "challenge_id": "3e0f6417-ec74-4da1-b805-42df4971d754",
  "expires_at": "2026-10-30T10:14:37.957317087Z",
  "resend_available_at": "2026-10-30T10:09:38.957317087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637873702` → **200**

```json
{
  "phone": "+380637873702",
  "audience": "CLIENT",
  "code": "827089",
  "sent_at": "2026-10-30T10:09:37.959704462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e0f6417-ec74-4da1-b805-42df4971d754",
  "code": "827089",
  "device_ref": "sandbox-18259"
}
```

```json
{
  "session_id": "6837f233-24ba-4291-bf3f-6a77564f3e39",
  "subject": {
    "type": "CLIENT",
    "id": "1baefa63-ceef-42b9-ad0d-be7973575133"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmFlZmE2My1jZWVmLTQyYjktYWQwZC1iZTc5NzM1NzUxMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODc4LCJpYXQiOjE3OTMzNTQ5NzgsImp0aSI6ImYxNWI3MDZlLTlmYjAtNDhjNi04NWViLWVlMmIzOWRiYjBjOCIsInNpZCI6IjY4MzdmMjMzLTI0YmEtNDI5MS1iZjNmLTZhNzc1NjRmM2UzOSJ9.WFPBnkG3sUPkyA5z3FzEZ7uX22frh-nFTaubb-n4Vew",
  "access_expires_at": "2026-10-30T10:24:38.247464902Z",
  "refresh_token": "4Ohb7DEI6jXg6C2u0BI5vVtUPVuiNhVaF8orJpVnY6w",
  "refresh_expires_at": "2026-11-29T10:09:38.246936078Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1baefa63-ceef-42b9-ad0d-be7973575133",
  "session_id": "6837f233-24ba-4291-bf3f-6a77564f3e39",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637873702",
  "device_ref": "sandbox-27821"
}
```

```json
{
  "challenge_id": "e86fdf3e-10b6-4482-af59-1a8d6bf4e3ba",
  "expires_at": "2026-10-30T10:14:40.773644743Z",
  "resend_available_at": "2026-10-30T10:09:41.773644743Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637873702` → **200**

```json
{
  "phone": "+380637873702",
  "audience": "CLIENT",
  "code": "795417",
  "sent_at": "2026-10-30T10:09:40.775598878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e86fdf3e-10b6-4482-af59-1a8d6bf4e3ba",
  "code": "795417",
  "device_ref": "sandbox-27821"
}
```

```json
{
  "session_id": "cdfc6900-ef1b-4a6d-8f57-2234dd51bd79",
  "subject": {
    "type": "CLIENT",
    "id": "1baefa63-ceef-42b9-ad0d-be7973575133"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmFlZmE2My1jZWVmLTQyYjktYWQwZC1iZTc5NzM1NzUxMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODgxLCJpYXQiOjE3OTMzNTQ5ODEsImp0aSI6IjQwY2U0MzQwLWE2YmQtNDBjMS04ZmEwLWQ2MmY0M2Q2MjlmMCIsInNpZCI6ImNkZmM2OTAwLWVmMWItNGE2ZC04ZjU3LTIyMzRkZDUxYmQ3OSJ9.x9sp7zMwMC5QBU0CVFTZz0YB3-kgxdTCDe5QgaTQ80w",
  "access_expires_at": "2026-10-30T10:24:41.068331419Z",
  "refresh_token": "_94ul1QaXlprSzAVJNwWpR8zstpyEJFOHDb6f1DwGbE",
  "refresh_expires_at": "2026-11-29T10:09:41.067734863Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "bedd390a-bbfb-41e0-8861-1a266359add5",
  "expires_at": "2026-10-30T10:14:43.338308236Z",
  "resend_available_at": "2026-10-30T10:09:44.338308236Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637873702` → **200**

```json
{
  "phone": "+380637873702",
  "audience": "CLIENT",
  "code": "038427",
  "sent_at": "2026-10-30T10:09:43.340254573Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630682023"
}
```

```json
{
  "challenge_id": "ec49b869-942b-4aee-81a1-b5e843e3e4f8",
  "expires_at": "2026-10-30T10:14:43.627997993Z",
  "resend_available_at": "2026-10-30T10:09:44.627997993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630682023` → **200**

```json
{
  "phone": "+380630682023",
  "audience": "CLIENT",
  "code": "501408",
  "sent_at": "2026-10-30T10:09:43.629817241Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "3015bdd3-ff14-4bd3-99be-587b6061c8ec",
  "current_challenge_id": "bedd390a-bbfb-41e0-8861-1a266359add5",
  "current_code": "000000",
  "new_challenge_id": "ec49b869-942b-4aee-81a1-b5e843e3e4f8",
  "new_code": "501408"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "764a428d-e28a-4f42-a595-f6c73747754a"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "0b01aac8-2f4a-49bf-a14e-056bf7e303a6",
  "current_challenge_id": "bedd390a-bbfb-41e0-8861-1a266359add5",
  "current_code": "038427",
  "new_challenge_id": "ec49b869-942b-4aee-81a1-b5e843e3e4f8",
  "new_code": "501408"
}
```

```json
{
  "subject_id": "1baefa63-ceef-42b9-ad0d-be7973575133",
  "phone": "+380630682023",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1baefa63-ceef-42b9-ad0d-be7973575133",
  "session_id": "6837f233-24ba-4291-bf3f-6a77564f3e39",
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
  "correlation_id": "621243ea-79b5-4860-a07c-dcb3d3b0b2f2"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630682023",
  "device_ref": "sandbox-7508"
}
```

```json
{
  "challenge_id": "f530ca69-5172-447e-823e-bfde45cb74c5",
  "expires_at": "2026-10-30T10:14:46.98477081Z",
  "resend_available_at": "2026-10-30T10:09:47.98477081Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630682023` → **200**

```json
{
  "phone": "+380630682023",
  "audience": "CLIENT",
  "code": "705984",
  "sent_at": "2026-10-30T10:09:46.987182096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f530ca69-5172-447e-823e-bfde45cb74c5",
  "code": "705984",
  "device_ref": "sandbox-7508"
}
```

```json
{
  "session_id": "d0dde1d5-71bd-4439-b177-164678697ed0",
  "subject": {
    "type": "CLIENT",
    "id": "1baefa63-ceef-42b9-ad0d-be7973575133"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmFlZmE2My1jZWVmLTQyYjktYWQwZC1iZTc5NzM1NzUxMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODg3LCJpYXQiOjE3OTMzNTQ5ODcsImp0aSI6IjlmM2ZmNDcxLWUxYzItNDU3Yi05NTNiLTA1NDQ2ZjFkNDQwMCIsInNpZCI6ImQwZGRlMWQ1LTcxYmQtNDQzOS1iMTc3LTE2NDY3ODY5N2VkMCJ9.DMIWeJh05P-x9vhslq2rxSHWf-LqzgAE2P0juAWulJo",
  "access_expires_at": "2026-10-30T10:24:47.278863143Z",
  "refresh_token": "SGZMMdurPteI2lly0PxIBDPC3wvi4-EuaDbsqch8p3o",
  "refresh_expires_at": "2026-11-29T10:09:47.278156087Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1baefa63-ceef-42b9-ad0d-be7973575133",
  "session_id": "d0dde1d5-71bd-4439-b177-164678697ed0",
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
  "session_id": "e87a7983-c398-497c-971a-08d0e1ab898b",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4ODgsImlhdCI6MTc5MzM1NDk4OCwianRpIjoiZTU2MWYxM2ItM2Y3Ni00YzI1LTk4YzctODI1ODBmNWJiZmMyIiwic2lkIjoiZTg3YTc5ODMtYzM5OC00OTdjLTk3MWEtMDhkMGUxYWI4OThiIn0._-_RB1QYQls-TCjLDLUzTabcxhqZubORZnP1wFIc3nc",
  "access_expires_at": "2026-10-30T10:24:48.115620158Z",
  "refresh_token": "HJ2mgHfq7Io301t2ko44HdLo3SXR53KHL5ZWKPyIeHY",
  "refresh_expires_at": "2026-10-30T22:09:48.115131464Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133` → **200**

```json
{
  "client": {
    "id": "1baefa63-ceef-42b9-ad0d-be7973575133",
    "phone": "+380630682023",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T10:09:38.245313Z",
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

`POST /api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133/phone/new-code` → **201**

```json
{
  "phone": "+380632811761"
}
```

```json
{
  "challenge_id": "c997e258-ba20-441d-9590-cd3ba6758d2a",
  "expires_at": "2026-10-30T10:14:48.677702073Z",
  "resend_available_at": "2026-10-30T10:09:49.677702073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632811761` → **200**

```json
{
  "phone": "+380632811761",
  "audience": "CLIENT",
  "code": "810584",
  "sent_at": "2026-10-30T10:09:48.679658821Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133/phone` → **422**

```json
{
  "command_id": "8443621c-9ae7-4503-bdeb-3ad81d149a60",
  "expected_version": 3,
  "new_challenge_id": "c997e258-ba20-441d-9590-cd3ba6758d2a",
  "new_code": "810585",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1f662aa5-8952-43f7-ba3f-4dda2f1df2a4"
}
```

`POST /api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133/phone` → **400**

```json
{
  "command_id": "f738403e-213e-45ba-8f55-150beb668645",
  "expected_version": 3,
  "new_challenge_id": "c997e258-ba20-441d-9590-cd3ba6758d2a",
  "new_code": "810584",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9dca91ed-fad3-4820-8350-2a3d2fe29921",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/1baefa63-ceef-42b9-ad0d-be7973575133/phone` → **200**

```json
{
  "command_id": "f7f533aa-d2fb-4cc6-b695-ab40c6e5f0c8",
  "expected_version": 3,
  "new_challenge_id": "c997e258-ba20-441d-9590-cd3ba6758d2a",
  "new_code": "810584",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "1baefa63-ceef-42b9-ad0d-be7973575133",
  "phone": "+380632811761",
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
  "correlation_id": "82aaa612-9ead-45f5-9104-a87c4006a730"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632811761",
  "device_ref": "sandbox-11807"
}
```

```json
{
  "challenge_id": "01e2dc11-d519-4261-8a03-25ab96beee8b",
  "expires_at": "2026-10-30T10:14:50.075296829Z",
  "resend_available_at": "2026-10-30T10:09:51.075296829Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632811761` → **200**

```json
{
  "phone": "+380632811761",
  "audience": "CLIENT",
  "code": "555272",
  "sent_at": "2026-10-30T10:09:50.077641568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01e2dc11-d519-4261-8a03-25ab96beee8b",
  "code": "555272",
  "device_ref": "sandbox-11807"
}
```

```json
{
  "session_id": "833c845f-282c-4f54-9d88-ee90da123e96",
  "subject": {
    "type": "CLIENT",
    "id": "1baefa63-ceef-42b9-ad0d-be7973575133"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmFlZmE2My1jZWVmLTQyYjktYWQwZC1iZTc5NzM1NzUxMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODkwLCJpYXQiOjE3OTMzNTQ5OTAsImp0aSI6IjQ0ZjZiMTdkLTAxYjctNDA0MS1iZDE1LWRjZWE3MTA5YjIzZiIsInNpZCI6IjgzM2M4NDVmLTI4MmMtNGY1NC05ZDg4LWVlOTBkYTEyM2U5NiJ9.Idrfo8PWQajDcfJUJXrHdgMDV-3dVytGtYIXDwGMPJg",
  "access_expires_at": "2026-10-30T10:24:50.365301981Z",
  "refresh_token": "ZDpXYvggIJIx0oM2KpnARi55WlI_CNSH3qWWRbKfLTA",
  "refresh_expires_at": "2026-11-29T10:09:50.364614008Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1baefa63-ceef-42b9-ad0d-be7973575133",
  "session_id": "833c845f-282c-4f54-9d88-ee90da123e96",
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
  "phone": "+380633070479",
  "device_ref": "sandbox-21424"
}
```

```json
{
  "challenge_id": "539be1ca-a9f8-439e-b8f3-3e73d137fcd7",
  "expires_at": "2026-10-30T10:14:50.900505343Z",
  "resend_available_at": "2026-10-30T10:09:51.900505343Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633070479` → **200**

```json
{
  "phone": "+380633070479",
  "audience": "CLIENT",
  "code": "941474",
  "sent_at": "2026-10-30T10:09:50.902845223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "539be1ca-a9f8-439e-b8f3-3e73d137fcd7",
  "code": "941474",
  "device_ref": "sandbox-21424"
}
```

```json
{
  "session_id": "5127d3be-0f6c-4d47-b7c3-5d1a4aa86bc8",
  "subject": {
    "type": "CLIENT",
    "id": "b861cb9b-e631-472f-b676-5662b5d778d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODYxY2I5Yi1lNjMxLTQ3MmYtYjY3Ni01NjYyYjVkNzc4ZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODkxLCJpYXQiOjE3OTMzNTQ5OTEsImp0aSI6IjgyNjM5M2FhLTVlMTgtNGY5MC1hYmNlLWY5OWY2ZmJjODE0ZSIsInNpZCI6IjUxMjdkM2JlLTBmNmMtNGQ0Ny1iN2MzLTVkMWE0YWE4NmJjOCJ9.wWuCq6iDpCZCNv_l76MsNs79DnlChwZ24jMJpyGwH4U",
  "access_expires_at": "2026-10-30T10:24:51.190790072Z",
  "refresh_token": "GGXP-mCtApIvqcwRILKlJsZzyejeS9sZxTc5OUzB5Ps",
  "refresh_expires_at": "2026-11-29T10:09:51.190331621Z",
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
  "session_id": "14eb9182-8878-450e-84bb-04bf83e218f4",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4OTIsImlhdCI6MTc5MzM1NDk5MiwianRpIjoiNThlNWEyNzItYThkZC00MWE3LWIxMTgtNTZkMmE4MGUwYWJiIiwic2lkIjoiMTRlYjkxODItODg3OC00NTBlLTg0YmItMDRiZjgzZTIxOGY0In0.IPKYMlMsH203A5iWHNRw0xvoick9_BD92xZBHFF7dUM",
  "access_expires_at": "2026-10-30T10:24:52.337400899Z",
  "refresh_token": "onSohQk_6eDgzbadZsFoYQkrM617Jk6_xnkm3H3r_Bs",
  "refresh_expires_at": "2026-10-30T22:09:52.33695665Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633070479` → **200**

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
  "correlation_id": "10e293ce-d935-4632-a2e8-aa75bcc6774d"
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
  "session_id": "aae5d82b-be89-47ae-8025-6451380a6b40",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4OTMsImlhdCI6MTc5MzM1NDk5MywianRpIjoiZmU4OTI3NmEtNTFkOS00ZWU2LWE5ZTgtNTExOTRiZDY0OTRjIiwic2lkIjoiYWFlNWQ4MmItYmU4OS00N2FlLTgwMjUtNjQ1MTM4MGE2YjQwIn0.JZy0vhpAC3OT1A0RQTQ9sBAWdKKmoMVSCPK48vZCvSE",
  "access_expires_at": "2026-10-30T10:24:53.458667518Z",
  "refresh_token": "cCovjfmJ76qWU1S2f8qGuodLNXYsTJXd_R8BakL5OfE",
  "refresh_expires_at": "2026-10-30T22:09:53.458134279Z",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T10:06:06.251087Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c36f29c5-037d-47f7-87dc-51f6aef6403d",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T10:09:53.999527463Z"
}
```

## The rider books the airport for 2026-10-30T13:09:53Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600826373",
  "device_ref": "sandbox-21390"
}
```

```json
{
  "challenge_id": "0057356b-c099-4cd1-8995-886ee28ba8b7",
  "expires_at": "2026-10-30T10:14:54.282707228Z",
  "resend_available_at": "2026-10-30T10:09:55.282707228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600826373` → **200**

```json
{
  "phone": "+48600826373",
  "audience": "CLIENT",
  "code": "377566",
  "sent_at": "2026-10-30T10:09:54.284927101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0057356b-c099-4cd1-8995-886ee28ba8b7",
  "code": "377566",
  "device_ref": "sandbox-21390"
}
```

```json
{
  "session_id": "d4ad0981-74ce-4aba-8be7-e27c4fbdb0ae",
  "subject": {
    "type": "CLIENT",
    "id": "404427e8-1c5f-4d19-a05a-0337fa4a46de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDQ0MjdlOC0xYzVmLTRkMTktYTA1YS0wMzM3ZmE0YTQ2ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1ODk0LCJpYXQiOjE3OTMzNTQ5OTQsImp0aSI6IjM0NGY4NTc5LWUyOWItNDQ4MC1iMjIwLTFhYzU5YWUxYTBhOCIsInNpZCI6ImQ0YWQwOTgxLTc0Y2UtNGFiYS04YmU3LWUyN2M0ZmJkYjBhZSJ9.J8fYK-3nLkNLawI7HM6s-fXslddmrqPnnIhRcbTjM5Q",
  "access_expires_at": "2026-10-30T10:24:54.570321673Z",
  "refresh_token": "Zjq3eIfRCB-aU2SR3pQ2mZuaN_XBuLu4fghy5ofzX6A",
  "refresh_expires_at": "2026-11-29T10:09:54.569698592Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f1b14d32-baaa-4418-bd93-011c90bd1f1f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T13:09:53Z"
}
```

```json
{
  "id": "51bdcb1b-7e40-42bf-a3af-5f37698ba36a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:14:54.840046Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T13:09:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "235cdd0e-b2a6-448d-82d1-943ce40a922f",
  "quote_id": "51bdcb1b-7e40-42bf-a3af-5f37698ba36a",
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
  "pickup_at": "2026-10-30T13:09:53Z"
}
```

```json
{
  "id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "404427e8-1c5f-4d19-a05a-0337fa4a46de",
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
  "created_at": "2026-10-30T10:09:55.125954Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T13:09:53Z",
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
  "device_ref": "sandbox-1998"
}
```

```json
{
  "challenge_id": "3c3ddb6d-a335-4d26-af27-366e6bacefaf",
  "expires_at": "2026-10-30T10:14:55.416190787Z",
  "resend_available_at": "2026-10-30T10:09:56.416190787Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "079563",
  "sent_at": "2026-10-30T10:09:55.418785611Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c3ddb6d-a335-4d26-af27-366e6bacefaf",
  "code": "079563",
  "device_ref": "sandbox-1998"
}
```

```json
{
  "session_id": "368a0991-89f4-42f2-86ea-07154307322d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTg5NSwiaWF0IjoxNzkzMzU0OTk1LCJqdGkiOiJiOWE1OGZiZi1kNTc0LTRlNDAtYTE1OS02MDE4ZmRhMmYzNWQiLCJzaWQiOiIzNjhhMDk5MS04OWY0LTQyZjItODZlYS0wNzE1NDMwNzMyMmQifQ.ysMLqxWlozmjn6HuzA-j258kT3TmFU4Un5F5ooeWG1s",
  "access_expires_at": "2026-10-30T10:24:55.698739801Z",
  "refresh_token": "H2W9m7JzQTG25h11MmCYb1jpJ7kZPrg5brRB4ZTc_RM",
  "refresh_expires_at": "2026-11-29T10:09:55.698198331Z",
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
  "command_id": "6710594e-48ee-4b4d-979c-b15830177fed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:09:56Z",
    "sequence": 1793354996225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "904b786f-06ae-49ef-8d25-280b71e0f017",
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
  "last_heartbeat_at": "2026-10-30T10:09:56.241508Z",
  "last_location_at": "2026-10-30T10:09:56.241508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
      "short_number": 24,
      "pickup_at": "2026-10-30T13:09:53Z",
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

`POST /api/driver/v1/preorders/2a0947e0-edf3-4039-8b63-636e0b9639d1/reserve` → **200**

```json
{
  "command_id": "4fbdb1e1-cf9a-411d-8dbf-6b958713340d"
}
```

```json
{
  "id": "00f674fb-529b-497f-877a-3e25e49d2ebd",
  "state": "RESERVED",
  "order": {
    "order_id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
    "short_number": 24,
    "pickup_at": "2026-10-30T13:09:53Z",
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
  "reserved_at": "2026-10-30T10:09:56.780889Z",
  "confirm_from": "2026-10-30T12:39:53Z",
  "confirm_until": "2026-10-30T12:49:53Z",
  "drop_until": "2026-10-30T12:09:53Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "00f674fb-529b-497f-877a-3e25e49d2ebd",
      "state": "RESERVED",
      "order": {
        "order_id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
        "short_number": 24,
        "pickup_at": "2026-10-30T13:09:53Z",
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
      "reserved_at": "2026-10-30T10:09:56.780889Z",
      "confirm_from": "2026-10-30T12:39:53Z",
      "confirm_until": "2026-10-30T12:49:53Z",
      "drop_until": "2026-10-30T12:09:53Z"
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
      "id": "00f674fb-529b-497f-877a-3e25e49d2ebd",
      "state": "RESERVED",
      "order": {
        "order_id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
        "short_number": 24,
        "pickup_at": "2026-10-30T13:09:53Z",
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
      "reserved_at": "2026-10-30T10:09:56.780889Z",
      "confirm_from": "2026-10-30T12:39:53Z",
      "confirm_until": "2026-10-30T12:49:53Z",
      "drop_until": "2026-10-30T12:09:53Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/00f674fb-529b-497f-877a-3e25e49d2ebd/confirm` → **409**

```json
{
  "command_id": "1b129c5a-6c5c-472e-9350-2eeb7d9443c9"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/00f674fb-529b-497f-877a-3e25e49d2ebd/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "29a4a5d8-8071-4ed4-bd67-76833f381aa1"
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
  "session_id": "373d1eb2-0fec-4e11-9e0c-18b3ad3464f6",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU4OTgsImlhdCI6MTc5MzM1NDk5OCwianRpIjoiODRiNzlkYjMtYmNiMi00MjNlLTgxYTQtOWEyMjI4ZDZkZWE4Iiwic2lkIjoiMzczZDFlYjItMGZlYy00ZTExLTllMGMtMThiM2FkMzQ2NGY2In0.991eclMUmpql3KGh7T6PQxCt-hdVpHuttrtMzGNiSGA",
  "access_expires_at": "2026-10-30T10:24:58.176223514Z",
  "refresh_token": "MWVIHRLNwzQem_BqIWB43bvA7s0rXQdtcrobGyYAAU0",
  "refresh_expires_at": "2026-10-30T22:09:58.175679156Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2a0947e0-edf3-4039-8b63-636e0b9639d1` → **200**

```json
{
  "id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "404427e8-1c5f-4d19-a05a-0337fa4a46de",
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
  "created_at": "2026-10-30T10:09:55.125954Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T13:09:53Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "00f674fb-529b-497f-877a-3e25e49d2ebd",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T10:09:56.780889Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2a0947e0-edf3-4039-8b63-636e0b9639d1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T10:09:55.127146Z",
      "actor": {
        "type": "CLIENT",
        "id": "404427e8-1c5f-4d19-a05a-0337fa4a46de",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
        "preorder": true,
        "quote_id": "51bdcb1b-7e40-42bf-a3af-5f37698ba36a",
        "pickup_at": "2026-10-30T13:09:53Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "15725b34-f21f-4d24-8146-c623c8817874"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T10:09:56.781923Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2a0947e0-edf3-4039-8b63-636e0b9639d1",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "00f674fb-529b-497f-877a-3e25e49d2ebd"
      },
      "correlation_id": "49b116d8-809c-4e87-b1f7-9c185ed1983a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 2a0947e0-edf3-4039-8b63-636e0b9639d1, reservation 00f674fb-529b-497f-877a-3e25e49d2ebd.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2261"
}
```

```json
{
  "challenge_id": "79f4071e-eaca-4a76-a188-da6efebf51f9",
  "expires_at": "2026-10-30T10:14:58.99920618Z",
  "resend_available_at": "2026-10-30T10:09:59.99920618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "013777",
  "sent_at": "2026-10-30T10:09:59.0016914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79f4071e-eaca-4a76-a188-da6efebf51f9",
  "code": "013777",
  "device_ref": "sandbox-2261"
}
```

```json
{
  "session_id": "3b00ae24-5370-4c9e-9991-0f0a2a841559",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTg5OSwiaWF0IjoxNzkzMzU0OTk5LCJqdGkiOiJiNTAzYWZjOC0yYzIwLTQ0ZGEtYjA1Yy1kMDQ4ZTAxZjY1M2YiLCJzaWQiOiIzYjAwYWUyNC01MzcwLTRjOWUtOTk5MS0wZjBhMmE4NDE1NTkifQ.WKzHOgL-w6-0b9RGuHMp9HosVDMEnjpopfvx3YR4jw4",
  "access_expires_at": "2026-10-30T10:24:59.284488579Z",
  "refresh_token": "ZiFWuSLj7_uaFJHbVzOgVHMPkDSF-8-g65FEzAskNqs",
  "refresh_expires_at": "2026-11-29T10:09:59.284012231Z",
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
  "command_id": "8fd002c1-378c-430a-8a23-4ccaf180a7fd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:09:59Z",
    "sequence": 1793354999809
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:09:59.826289Z",
  "last_location_at": "2026-10-30T10:09:59.826289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679902823",
  "device_ref": "sandbox-18713"
}
```

```json
{
  "challenge_id": "883618b2-38cc-40c1-b084-e8c43b5dbb27",
  "expires_at": "2026-10-30T10:15:00.088884304Z",
  "resend_available_at": "2026-10-30T10:10:01.088884304Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679902823` → **200**

```json
{
  "phone": "+380679902823",
  "audience": "CLIENT",
  "code": "366584",
  "sent_at": "2026-10-30T10:10:00.091269793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "883618b2-38cc-40c1-b084-e8c43b5dbb27",
  "code": "366584",
  "device_ref": "sandbox-18713"
}
```

```json
{
  "session_id": "524ef77d-1ba8-4343-ba5a-cd42eeb87b99",
  "subject": {
    "type": "CLIENT",
    "id": "9d722244-4519-4656-8106-1721ee55092d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDcyMjI0NC00NTE5LTQ2NTYtODEwNi0xNzIxZWU1NTA5MmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTAwLCJpYXQiOjE3OTMzNTUwMDAsImp0aSI6IjUwYjA3MGMzLWMyZWUtNDZjZS1iOWRiLTUyZThkMWEzMjRlZSIsInNpZCI6IjUyNGVmNzdkLTFiYTgtNDM0My1iYTVhLWNkNDJlZWI4N2I5OSJ9.qh4R52mtvC0eeRMz64eG9YR84_RMFGri3TrPx5Pr7KM",
  "access_expires_at": "2026-10-30T10:25:00.382844004Z",
  "refresh_token": "x047z5M2X42YdHEtdMgr1WFSkoaZts1z5vlxd3_xmhw",
  "refresh_expires_at": "2026-11-29T10:10:00.382363255Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "048f775a-f8c2-4c92-8d9f-fbc1ec55142a",
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
  "id": "95a715f7-cb16-4e28-9603-e7f396ce27a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:00.655321Z",
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
  "command_id": "d0d9b241-7b27-41f8-b5e8-eb89f0da9c30",
  "quote_id": "95a715f7-cb16-4e28-9603-e7f396ce27a4",
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
  "id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9d722244-4519-4656-8106-1721ee55092d",
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
  "created_at": "2026-10-30T10:10:00.936397Z",
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
    "id": "667cc932-b482-4c38-882c-5cff763f89e8",
    "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
    "expires_at": "2026-10-30T10:10:15.939333Z",
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

`POST /api/driver/v1/offers/667cc932-b482-4c38-882c-5cff763f89e8/accept` → **200**

```json
{
  "command_id": "6f00f3a9-975a-4809-ac6c-c48f0bc1d037"
}
```

```json
{
  "id": "f7520528-e691-4adf-82d5-74a6f4a42df0",
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "65859f66-a81b-4cb4-929c-a376f9d245df",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "65859f66-a81b-4cb4-929c-a376f9d245df",
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "assignment_id": "f7520528-e691-4adf-82d5-74a6f4a42df0",
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

`POST /api/driver/v1/work-sessions/1c426ec9-d532-4cd7-95c2-05ef2138e43a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:02Z",
    "sequence": 1793355002347
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:10:02.051836Z",
  "last_location_at": "2026-10-30T10:10:02.051836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "65859f66-a81b-4cb4-929c-a376f9d245df",
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "assignment_id": "f7520528-e691-4adf-82d5-74a6f4a42df0",
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

`POST /api/driver/v1/trips/65859f66-a81b-4cb4-929c-a376f9d245df/arrive` → **200**

```json
{
  "command_id": "ed4814c8-d594-4853-b1d6-b383e68a6128",
  "expected_version": 0
}
```

```json
{
  "id": "65859f66-a81b-4cb4-929c-a376f9d245df",
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "assignment_id": "f7520528-e691-4adf-82d5-74a6f4a42df0",
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
  "arrived_at": "2026-10-30T10:10:02.582359Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/65859f66-a81b-4cb4-929c-a376f9d245df/start` → **200**

```json
{
  "command_id": "d681087d-121c-49e3-a9c2-d62632d17346",
  "expected_version": 1
}
```

```json
{
  "id": "65859f66-a81b-4cb4-929c-a376f9d245df",
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "assignment_id": "f7520528-e691-4adf-82d5-74a6f4a42df0",
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
  "arrived_at": "2026-10-30T10:10:02.582359Z",
  "started_at": "2026-10-30T10:10:02.858692Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1c426ec9-d532-4cd7-95c2-05ef2138e43a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:03Z",
    "sequence": 1793355003116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:10:03.132416Z",
  "last_location_at": "2026-10-30T10:10:03.132416Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/65859f66-a81b-4cb4-929c-a376f9d245df/complete` → **200**

```json
{
  "command_id": "5d58f8bc-fbfd-4652-bfa1-c4eaae2d9ba3",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:10:03Z",
  "cash_received": true
}
```

```json
{
  "id": "65859f66-a81b-4cb4-929c-a376f9d245df",
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "assignment_id": "f7520528-e691-4adf-82d5-74a6f4a42df0",
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
  "arrived_at": "2026-10-30T10:10:02.582359Z",
  "started_at": "2026-10-30T10:10:02.858692Z",
  "completed_at": "2026-10-30T10:10:03.405862Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/14f7c3ba-3768-409e-bfc3-08fb9ec88314/rating` → **200**

```json
{
  "command_id": "0ff53654-509a-46a3-8f80-1b0a944bc4d8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "score": 5,
  "created_at": "2026-10-30T10:10:03.686465056Z"
}
```

`POST /api/driver/v1/orders/14f7c3ba-3768-409e-bfc3-08fb9ec88314/rating` → **200**

```json
{
  "command_id": "5aed4126-031b-4d6e-9c86-82183f3b38cb",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
  "score": 4,
  "created_at": "2026-10-30T10:10:03.960043113Z"
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
  "session_id": "59e180fd-b1a1-4899-a260-625129c54c55",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MDQsImlhdCI6MTc5MzM1NTAwNCwianRpIjoiN2FhMWU4M2YtYzc1Ni00ZjA2LWI3MTYtYmVhNzJhNDBiNWRjIiwic2lkIjoiNTllMTgwZmQtYjFhMS00ODk5LWEyNjAtNjI1MTI5YzU0YzU1In0.ESDvDTRQbM3gCggLEk80xXN61gRJx52fUootmv_cRzo",
  "access_expires_at": "2026-10-30T10:25:04.825553096Z",
  "refresh_token": "A1SHuzQ1Pg-fyjhOdRvuOMO2bppPu6T0VNbLXs3FxXQ",
  "refresh_expires_at": "2026-10-30T22:10:04.825005537Z",
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
  "session_id": "5814450d-cdb4-4638-8e2a-b0d58c6d28ea",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MDUsImlhdCI6MTc5MzM1NTAwNSwianRpIjoiMDQ5NjBlNTMtNDEwYS00NDQxLThmMGQtNDFlNGM0MGRhOTRlIiwic2lkIjoiNTgxNDQ1MGQtY2RiNC00NjM4LThlMmEtYjBkNThjNmQyOGVhIn0.WbM0jUVWKW_8C8ZCq7dJAQ5zLn55YCRGJ6PKdBo4AYw",
  "access_expires_at": "2026-10-30T10:25:05.40227306Z",
  "refresh_token": "4Yaj69ESHN1jFm07q-EvKY3rzE6AycLbBzmpKcL5jD8",
  "refresh_expires_at": "2026-10-30T22:10:05.401777507Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/14f7c3ba-3768-409e-bfc3-08fb9ec88314/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
      "author_type": "RIDER",
      "author_id": "9d722244-4519-4656-8106-1721ee55092d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T10:10:03.686465Z"
    },
    {
      "order_id": "14f7c3ba-3768-409e-bfc3-08fb9ec88314",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9d722244-4519-4656-8106-1721ee55092d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T10:10:03.960043Z"
    }
  ]
}
```

Done: ratings for order 14f7c3ba-3768-409e-bfc3-08fb9ec88314.

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
  "session_id": "ba494d5c-ae09-4931-994f-9fff1b11a816",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MDYsImlhdCI6MTc5MzM1NTAwNiwianRpIjoiYWZhNDFhZWUtNmRhOC00MzhkLWI5NzgtNTM3MDZhNzE0ZjdkIiwic2lkIjoiYmE0OTRkNWMtYWUwOS00OTMxLTk5NGYtOWZmZjFiMTFhODE2In0.cBh89gXVPi8zIC6A_nHBpktfHVZdk7Ts_LZqFE4kRwc",
  "access_expires_at": "2026-10-30T10:25:06.271657653Z",
  "refresh_token": "6AlTloG_mP3mjXtL2l53HCqn0JRT-vipeq2DcB7EJbw",
  "refresh_expires_at": "2026-10-30T22:10:06.271120729Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c0b402d1-e04a-4a51-a2d0-a0900830e9ef",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "22804e74-2907-4414-a49a-515c0a373e90",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:10:06.550682Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/22804e74-2907-4414-a49a-515c0a373e90` → **200**

```json
{
  "id": "22804e74-2907-4414-a49a-515c0a373e90",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:10:06.550682Z",
  "ready_at": "2026-10-30T10:10:06.585045Z",
  "expires_at": "2026-10-31T10:10:06.585045Z"
}
```

`GET /api/admin/v1/reports/exports/22804e74-2907-4414-a49a-515c0a373e90/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "55ce9220-0ce3-4eae-9412-d00fd706db93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "a0840662-3994-4787-a69d-f8d6c46e7fda",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:10:07.126348Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a0840662-3994-4787-a69d-f8d6c46e7fda` → **200**

```json
{
  "id": "a0840662-3994-4787-a69d-f8d6c46e7fda",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:10:07.126348Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a0840662-3994-4787-a69d-f8d6c46e7fda` → **200**

```json
{
  "id": "a0840662-3994-4787-a69d-f8d6c46e7fda",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:10:07.126348Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a0840662-3994-4787-a69d-f8d6c46e7fda` → **200**

```json
{
  "id": "a0840662-3994-4787-a69d-f8d6c46e7fda",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:10:07.126348Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a0840662-3994-4787-a69d-f8d6c46e7fda` → **200**

```json
{
  "id": "a0840662-3994-4787-a69d-f8d6c46e7fda",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T10:10:07.126348Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a0840662-3994-4787-a69d-f8d6c46e7fda` → **200**

```json
{
  "id": "a0840662-3994-4787-a69d-f8d6c46e7fda",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T10:10:07.126348Z",
  "ready_at": "2026-10-30T10:10:11.594318Z",
  "expires_at": "2026-10-31T10:10:11.594318Z"
}
```

`GET /api/admin/v1/reports/exports/a0840662-3994-4787-a69d-f8d6c46e7fda/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e31103e4-b32b-420d-9f0d-ff88a3e1714c` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e31103e4-b32b-420d-9f0d-ff88a3e1714c",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0f27e06e-ca60-4148-baf4-6e16f116588f"
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
  "session_id": "4afa8bcb-4cbc-4e4e-9e38-f911a1745cc5",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MTMsImlhdCI6MTc5MzM1NTAxMywianRpIjoiZTU2ZjFhYjYtYzVjMy00ZGJlLWI5NjMtZjQ3NWQ4YmM4NmMwIiwic2lkIjoiNGFmYThiY2ItNGNiYy00ZTRlLTllMzgtZjkxMWExNzQ1Y2M1In0.SSj25Klt63FZ2hfrdtNlke1cFRUxZgPtLoc8cjyvqAc",
  "access_expires_at": "2026-10-30T10:25:13.340817914Z",
  "refresh_token": "U1vFvlXBwpWcSEgh4evqtrPe45UrsFLOCt5Lj9upsTA",
  "refresh_expires_at": "2026-10-30T22:10:13.340351681Z",
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
  "command_id": "745a547b-4bdc-413b-bcfb-e2ca48d29ed6",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T10:10:13.895501709Z"
}
```

`POST /sandbox/v1/retention/fixtures/0cb0d5af-d991-4cfa-a9be-77835f1635a1` → **200**

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

`GET /sandbox/v1/retention/fixtures/0cb0d5af-d991-4cfa-a9be-77835f1635a1` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/0cb0d5af-d991-4cfa-a9be-77835f1635a1` → **204**

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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T10:10:13.895502Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "6edf02a5-4bd4-419c-a506-bd7601679330",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T10:10:14.549323876Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12661"
}
```

```json
{
  "challenge_id": "67751108-449c-476c-b32e-5eb33a1ebf89",
  "expires_at": "2026-10-30T10:15:14.823506154Z",
  "resend_available_at": "2026-10-30T10:10:15.823506154Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "744431",
  "sent_at": "2026-10-30T10:10:14.82575419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67751108-449c-476c-b32e-5eb33a1ebf89",
  "code": "744431",
  "device_ref": "sandbox-12661"
}
```

```json
{
  "session_id": "073c7af7-8c4f-4016-ad7f-8967ba7450db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTkxNSwiaWF0IjoxNzkzMzU1MDE1LCJqdGkiOiIzOGNmNjEwYy0wYTdkLTRkNDMtOTlkYi0xMDY1NzQ5MDY1NjgiLCJzaWQiOiIwNzNjN2FmNy04YzRmLTQwMTYtYWQ3Zi04OTY3YmE3NDUwZGIifQ.sDhajp4QZZfrO16bTGDqD7Mz2Rn9n9FZA1t5ibLeQpI",
  "access_expires_at": "2026-10-30T10:25:15.126038681Z",
  "refresh_token": "7-aoLmdRKVkIjgg88bz859B7zpZHZ_iqvKG_QzmL4w0",
  "refresh_expires_at": "2026-11-29T10:10:15.125611152Z",
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
  "command_id": "00d2b084-125f-468e-b081-7c9861c61fb1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:15Z",
    "sequence": 1793355015906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "71f2a085-0ef7-463a-9e40-a5a01578e259",
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
  "last_heartbeat_at": "2026-10-30T10:10:15.923258Z",
  "last_location_at": "2026-10-30T10:10:15.923258Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "89d59714-f148-4443-9af8-90e64c3723af",
  "points": [
    {
      "sequence": 1793355018197,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:09:18Z"
    },
    {
      "sequence": 1793355018204,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T10:10:18Z"
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
  "session_id": "152e9ed2-fd9e-4f6b-8590-5bdfe0a301d8",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MTgsImlhdCI6MTc5MzM1NTAxOCwianRpIjoiYWRmYjVhNDMtYmFiMC00MjY0LTkxOTQtYjUxOWM3MDAyMmM2Iiwic2lkIjoiMTUyZTllZDItZmQ5ZS00ZjZiLTg1OTAtNWJkZmUwYTMwMWQ4In0.JZ9ilYR_82s4tmY8rABtxPOUbAC_r20pogEigaSL7Gg",
  "access_expires_at": "2026-10-30T10:25:18.837782259Z",
  "refresh_token": "_OFiLwB3l4RP-yEmQRD6pk55kSuaItIHsk0NAss4iQE",
  "refresh_expires_at": "2026-10-30T22:10:18.837347076Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "03dd07a3-a7ff-4383-8673-745c16079504",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T10:10:18Z",
        "track_point_id": "144a66e5-ad5e-4109-bbb2-9db6ad1228e3",
        "work_session_id": "71f2a085-0ef7-463a-9e40-a5a01578e259"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T10:10:18Z",
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

`POST /api/admin/v1/driver-risk-flags/03dd07a3-a7ff-4383-8673-745c16079504/confirm` → **200**

```json
{
  "command_id": "f999d20c-7193-4c8d-81d5-3179691ad481",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "03dd07a3-a7ff-4383-8673-745c16079504",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T10:10:18Z",
    "track_point_id": "144a66e5-ad5e-4109-bbb2-9db6ad1228e3",
    "work_session_id": "71f2a085-0ef7-463a-9e40-a5a01578e259"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T10:10:18Z",
  "reason": null,
  "reviewed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reviewed_at": "2026-10-30T10:10:19.718746Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/03dd07a3-a7ff-4383-8673-745c16079504/dismiss` → **409**

```json
{
  "command_id": "fc3bc7a2-149e-48f2-a4b9-a0c609b98cfb",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/03dd07a3-a7ff-4383-8673-745c16079504/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "80e1b750-0c8e-4e82-8f6e-87596ee40787"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "5ac42e9a-a167-4c0e-bd9c-8e397921c68a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "0ada1d2f-d133-49ff-958d-705cc7d5e4c5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "raised_at": "2026-10-30T10:10:20.281984Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/0ada1d2f-d133-49ff-958d-705cc7d5e4c5/dismiss` → **200**

```json
{
  "command_id": "7a103b83-d90c-42c7-98b6-27dee564a18b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "0ada1d2f-d133-49ff-958d-705cc7d5e4c5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "raised_at": "2026-10-30T10:10:20.281984Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reviewed_at": "2026-10-30T10:10:20.561159Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2d82691f-0ed5-4808-b0c8-4ca6e90f8d6a",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "03dd07a3-a7ff-4383-8673-745c16079504"
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
      "actor_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:10:20.846015Z"
    }
  ]
}
```

Done: flag 03dd07a3-a7ff-4383-8673-745c16079504 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7d7a683a-a676-459e-b014-dfb47be723c7",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MjEsImlhdCI6MTc5MzM1NTAyMSwianRpIjoiYWMwYzZlMDEtYWM5YS00OWVlLWE5NjEtM2ViZGQ5YmRlMmFiIiwic2lkIjoiN2Q3YTY4M2EtYTY3Ni00NTllLWIwMTQtZGZiNDdiZTcyM2M3In0.FFt8AXrhMsVdi93FoO6auYG-0729qH52VPQ8h7wqVfA",
  "access_expires_at": "2026-10-30T10:25:21.723874989Z",
  "refresh_token": "AHcANKh9bdhaqpwp2FbTrxaxiNXoomSqsdNlrw8heXA",
  "refresh_expires_at": "2026-10-30T22:10:21.72339618Z",
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
      "actor_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:10:20.846015Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "ba696c29-6b50-48cf-b7a9-4865b808c97e",
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
  "session_id": "71f2a085-0ef7-463a-9e40-a5a01578e259",
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
  "last_heartbeat_at": "2026-10-30T10:10:15.923258Z",
  "last_location_at": "2026-10-30T10:10:15.923258Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71f2a085-0ef7-463a-9e40-a5a01578e259/close` → **200**

```json
{
  "command_id": "545cf886-41cb-4e0d-b218-369f3d9cad46",
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
  "session_id": "95f3e0eb-d4bb-4258-bd8f-0c687727a34b",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MjMsImlhdCI6MTc5MzM1NTAyMywianRpIjoiODRiYjFhOWUtZjZhMy00NTM0LWE5ZTItMjllYjM5NGU0ZGFmIiwic2lkIjoiOTVmM2UwZWItZDRiYi00MjU4LWJkOGYtMGM2ODc3MjdhMzRiIn0.XvVdb36ItLluhyYAQouyInDJ5MANmhZf9j15gzFLJyw",
  "access_expires_at": "2026-10-30T10:25:23.406497428Z",
  "refresh_token": "dD8Zn6dfj5WT9zyQkLj6izNkC9eU2_kq-Puc1MmS2R4",
  "refresh_expires_at": "2026-10-30T22:10:23.405956397Z",
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
  "command_id": "9a6b2279-5e5c-4a9e-a831-4ff525eca680",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:10:23.947331Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9a6b2279-5e5c-4a9e-a831-4ff525eca680",
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
  "changed_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T10:10:23.947331Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48747048856",
  "device_ref": "sandbox-30229"
}
```

```json
{
  "challenge_id": "f0971d39-2143-4a4b-8ae7-39d53d53a86e",
  "expires_at": "2026-10-30T10:15:24.505368635Z",
  "resend_available_at": "2026-10-30T10:10:25.505368635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48747048856` → **200**

```json
{
  "phone": "+48747048856",
  "audience": "CLIENT",
  "code": "223998",
  "sent_at": "2026-10-30T10:10:24.50807289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0971d39-2143-4a4b-8ae7-39d53d53a86e",
  "code": "223998",
  "device_ref": "sandbox-30229"
}
```

```json
{
  "session_id": "72e36a0c-bf2b-4f7a-913d-b6dac7b5e01b",
  "subject": {
    "type": "CLIENT",
    "id": "006e69b4-74f3-471b-9571-129231ed6764"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDZlNjliNC03NGYzLTQ3MWItOTU3MS0xMjkyMzFlZDY3NjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTI0LCJpYXQiOjE3OTMzNTUwMjQsImp0aSI6Ijk5MmNmYWJlLTVlNWUtNGE4YS05MjZiLTBiYjJiZGEzZGExMCIsInNpZCI6IjcyZTM2YTBjLWJmMmItNGY3YS05MTNkLWI2ZGFjN2I1ZTAxYiJ9.eRgQsVnLL3-xXFBHFkgqYr631HlM3gurOC1mwWfic7M",
  "access_expires_at": "2026-10-30T10:25:24.804025826Z",
  "refresh_token": "cjImVZVPXVGj2_ZNhrBL5VD-oKj25pU2349NbpENyEk",
  "refresh_expires_at": "2026-11-29T10:10:24.803502185Z",
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
  "correlation_id": "68be5e73-cf7c-46e0-8703-a2f8859967eb"
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
  "device_ref": "sandbox-22855"
}
```

```json
{
  "challenge_id": "7be0afd5-62f9-45ec-872b-4638d33e15f1",
  "expires_at": "2026-10-30T10:15:25.628553858Z",
  "resend_available_at": "2026-10-30T10:10:26.628553858Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "774546",
  "sent_at": "2026-10-30T10:10:25.631317039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7be0afd5-62f9-45ec-872b-4638d33e15f1",
  "code": "774546",
  "device_ref": "sandbox-22855"
}
```

```json
{
  "session_id": "750eaf83-fb5f-4fec-b76a-2c3ab075c3d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTkyNSwiaWF0IjoxNzkzMzU1MDI1LCJqdGkiOiIyMWI3YThkNy02MDA5LTQyZTUtOTkzZi04NzhmZGIxYzIzN2EiLCJzaWQiOiI3NTBlYWY4My1mYjVmLTRmZWMtYjc2YS0yYzNhYjA3NWMzZDIifQ.p0HE9BZ5SNwzSOOW03y3OUQL8fgK0NPXM_F5__qSSFQ",
  "access_expires_at": "2026-10-30T10:25:25.921508528Z",
  "refresh_token": "qysDym8PZcbXHF-YFmq371ECg4e_BLi-pPa-GP_6LlE",
  "refresh_expires_at": "2026-11-29T10:10:25.920955694Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "904b786f-06ae-49ef-8d25-280b71e0f017",
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
  "last_heartbeat_at": "2026-10-30T10:09:56.241508Z",
  "last_location_at": "2026-10-30T10:09:56.241508Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/904b786f-06ae-49ef-8d25-280b71e0f017/handover` → **200**

```json
{
  "command_id": "ca13f738-8102-4695-a1dd-0e242094228d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "904b786f-06ae-49ef-8d25-280b71e0f017",
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
  "last_heartbeat_at": "2026-10-30T10:09:56.241508Z",
  "last_location_at": "2026-10-30T10:09:56.241508Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/904b786f-06ae-49ef-8d25-280b71e0f017/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:26Z",
    "sequence": 1793355026738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "904b786f-06ae-49ef-8d25-280b71e0f017",
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
  "last_heartbeat_at": "2026-10-30T10:10:26.756143Z",
  "last_location_at": "2026-10-30T10:10:26.756143Z",
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
  "session_id": "904b786f-06ae-49ef-8d25-280b71e0f017",
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
  "last_heartbeat_at": "2026-10-30T10:10:26.756143Z",
  "last_location_at": "2026-10-30T10:10:26.756143Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/904b786f-06ae-49ef-8d25-280b71e0f017/close` → **200**

```json
{
  "command_id": "0d657f36-9cf5-453b-a8a0-02e1157d243c",
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
  "correlation_id": "959d8309-653b-4377-86de-abfa1e8d9340"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671869134",
  "device_ref": "sandbox-31932"
}
```

```json
{
  "challenge_id": "4b48592f-1658-49ca-82e0-467f16c8d386",
  "expires_at": "2026-10-30T10:15:28.099147727Z",
  "resend_available_at": "2026-10-30T10:10:29.099147727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671869134` → **200**

```json
{
  "phone": "+380671869134",
  "audience": "CLIENT",
  "code": "313399",
  "sent_at": "2026-10-30T10:10:28.101634122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b48592f-1658-49ca-82e0-467f16c8d386",
  "code": "313399",
  "device_ref": "sandbox-31932"
}
```

```json
{
  "session_id": "4f6d8c5e-197d-40d6-beea-52435cdf6e0f",
  "subject": {
    "type": "CLIENT",
    "id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDljODU2YS0yYmM0LTRlOTEtYjQ1ZC04MmM4YWFhYjdjNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTI4LCJpYXQiOjE3OTMzNTUwMjgsImp0aSI6ImE0M2NiMDk3LWU3MDctNGMzNS04MTMwLWZjNDNjMmI0ODgxMCIsInNpZCI6IjRmNmQ4YzVlLTE5N2QtNDBkNi1iZWVhLTUyNDM1Y2RmNmUwZiJ9.7R4sYRAYPr1gDSFq3SEAr6PavChNOHQuqxsHPZD7xd0",
  "access_expires_at": "2026-10-30T10:25:28.391202262Z",
  "refresh_token": "gx6Cn3DrIdZ2uOsItX-LPOgZ7dMVJY9u4Xoqfb6VLDQ",
  "refresh_expires_at": "2026-11-29T10:10:28.390677081Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "84ca4f48-0cc3-4495-9de5-259dcf98b0ba",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
  "upload_path": "/api/rider/v1/uploads/f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
  "expires_at": "2026-10-30T10:25:28.671180926Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/f15a87a3-f63d-45f7-a94c-31d78e0ad87a` → **200**

```json
{
  "file_id": "f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "afef92d4-30fe-4624-9859-e76555613162",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "f15a87a3-f63d-45f7-a94c-31d78e0ad87a"
  ]
}
```

```json
{
  "id": "85cb7127-d8ba-4cf5-a068-29d26198b5a0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:10:28.975582Z",
  "updated_at": "2026-10-30T10:10:28.975582Z",
  "respond_by": "2026-10-30T14:10:28.975582Z",
  "messages": [
    {
      "id": "449925e3-36b0-4362-af69-3f24bef73549",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:10:28.976387Z",
      "attachments": [
        {
          "file_id": "f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
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
  "session_id": "fb9b7a07-7de0-4a35-8d28-c8b09ed80c32",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MjksImlhdCI6MTc5MzM1NTAyOSwianRpIjoiMDk0ZmRlMzctYzUxMS00YjExLWIyZGItNGJlMGY3ZDJmNjk2Iiwic2lkIjoiZmI5YjdhMDctN2RlMC00YTM1LThkMjgtYzhiMDllZDgwYzMyIn0.Pvb2Y0wDObdM5t4c32UtyRJFNxJJ2cXadb4Oocdandw",
  "access_expires_at": "2026-10-30T10:25:29.586783557Z",
  "refresh_token": "slFR7kY8fsDjAgOR_LtSSBuxMvSsO5JARUlRucW4110",
  "refresh_expires_at": "2026-10-30T22:10:29.586255538Z",
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
  "session_id": "709fca1d-86d6-4263-955d-a6062d62fe5b",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MzAsImlhdCI6MTc5MzM1NTAzMCwianRpIjoiOGFjMTVhOTAtNTE2Mi00M2YzLThmZmMtYTE1NjAzMGIwY2IwIiwic2lkIjoiNzA5ZmNhMWQtODZkNi00MjYzLTk1NWQtYTYwNjJkNjJmZTViIn0.hUz6ed1NU-dUxpLEa-Z1G-qA7S7MjyYJrhk04_HDvT8",
  "access_expires_at": "2026-10-30T10:25:30.17019848Z",
  "refresh_token": "Ci-il9c_J1zg0Ve0Bq822_5Uicg9jw2HVqVqOISYbAI",
  "refresh_expires_at": "2026-10-30T22:10:30.169702981Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/85cb7127-d8ba-4cf5-a068-29d26198b5a0/attachments/f15a87a3-f63d-45f7-a94c-31d78e0ad87a` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "61132575-2a18-4287-8d2b-1e84ba1a6413",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "96ce99d3-2ce6-4c73-82bc-36acc6748cb8",
  "upload_path": "/api/operator/v1/uploads/96ce99d3-2ce6-4c73-82bc-36acc6748cb8",
  "expires_at": "2026-10-30T10:25:30.456173703Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/96ce99d3-2ce6-4c73-82bc-36acc6748cb8` → **200**

```json
{
  "file_id": "96ce99d3-2ce6-4c73-82bc-36acc6748cb8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/85cb7127-d8ba-4cf5-a068-29d26198b5a0` → **200**

```json
{
  "id": "85cb7127-d8ba-4cf5-a068-29d26198b5a0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T10:10:28.975582Z",
  "updated_at": "2026-10-30T10:10:28.975582Z",
  "respond_by": "2026-10-30T14:10:28.975582Z",
  "messages": [
    {
      "id": "449925e3-36b0-4362-af69-3f24bef73549",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:10:28.976387Z",
      "attachments": [
        {
          "file_id": "f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/85cb7127-d8ba-4cf5-a068-29d26198b5a0/comments` → **200**

```json
{
  "command_id": "339b80cb-1d51-4932-9672-22f37e366ac6",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "96ce99d3-2ce6-4c73-82bc-36acc6748cb8"
  ]
}
```

```json
{
  "id": "85cb7127-d8ba-4cf5-a068-29d26198b5a0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:10:28.975582Z",
  "updated_at": "2026-10-30T10:10:31.04106Z",
  "respond_by": "2026-10-30T14:10:28.975582Z",
  "messages": [
    {
      "id": "449925e3-36b0-4362-af69-3f24bef73549",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:10:28.976387Z",
      "attachments": [
        {
          "file_id": "f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8b5378bc-8f20-4330-9564-0c664ecf54f7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:10:31.04054Z",
      "attachments": [
        {
          "file_id": "96ce99d3-2ce6-4c73-82bc-36acc6748cb8",
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

`GET /api/rider/v1/support/cases/85cb7127-d8ba-4cf5-a068-29d26198b5a0` → **200**

```json
{
  "id": "85cb7127-d8ba-4cf5-a068-29d26198b5a0",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T10:10:28.975582Z",
  "updated_at": "2026-10-30T10:10:31.04106Z",
  "respond_by": "2026-10-30T14:10:28.975582Z",
  "messages": [
    {
      "id": "449925e3-36b0-4362-af69-3f24bef73549",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "149c856a-2bc4-4e91-b45d-82c8aaab7c77",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T10:10:28.976387Z",
      "attachments": [
        {
          "file_id": "f15a87a3-f63d-45f7-a94c-31d78e0ad87a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8b5378bc-8f20-4330-9564-0c664ecf54f7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T10:10:31.04054Z",
      "attachments": [
        {
          "file_id": "96ce99d3-2ce6-4c73-82bc-36acc6748cb8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/85cb7127-d8ba-4cf5-a068-29d26198b5a0/attachments/96ce99d3-2ce6-4c73-82bc-36acc6748cb8` → **200**

Done: support case 85cb7127-d8ba-4cf5-a068-29d26198b5a0, rider attachment f15a87a3-f63d-45f7-a94c-31d78e0ad87a, operator attachment 96ce99d3-2ce6-4c73-82bc-36acc6748cb8.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736892733",
  "device_ref": "sandbox-7966"
}
```

```json
{
  "challenge_id": "b517e705-1d67-455c-9a89-8ddded88eb16",
  "expires_at": "2026-10-30T10:15:31.626066811Z",
  "resend_available_at": "2026-10-30T10:10:32.626066811Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736892733` → **200**

```json
{
  "phone": "+380736892733",
  "audience": "CLIENT",
  "code": "536872",
  "sent_at": "2026-10-30T10:10:31.628169556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b517e705-1d67-455c-9a89-8ddded88eb16",
  "code": "536872",
  "device_ref": "sandbox-7966"
}
```

```json
{
  "session_id": "302f18be-ce30-41f7-910a-79c470dfd2ee",
  "subject": {
    "type": "CLIENT",
    "id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzE2NmM3ZS0xNDljLTQwYWEtYTYzZS0wYjVhNWZmMGRjN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTMxLCJpYXQiOjE3OTMzNTUwMzEsImp0aSI6IjBhODQxZTgyLTcwNWYtNDI5Ni05MTMyLTRiOGFiYmU1ZTNhMSIsInNpZCI6IjMwMmYxOGJlLWNlMzAtNDFmNy05MTBhLTc5YzQ3MGRmZDJlZSJ9.QamZ9_3JNo9tdULoHHl44BzLpSn3vrOZkoAQdNe_Rus",
  "access_expires_at": "2026-10-30T10:25:31.918467177Z",
  "refresh_token": "tS69XaJkgf6O-Gc1F1wIm5_SdhyDA4Odj7bTaEagk9I",
  "refresh_expires_at": "2026-11-29T10:10:31.918034607Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9c747d47-d4a8-4bdc-a7a9-2db46e309c21",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0b3b73e6-df59-4bc7-b14c-17ebc5207e50",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0b3b73e6-df59-4bc7-b14c-17ebc5207e50",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "adfbca0f61d314ae8554ee74cf30b592",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0b3b73e6-df59-4bc7-b14c-17ebc5207e50",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736892733"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0b3b73e6-df59-4bc7-b14c-17ebc5207e50",
  "expires_at": "2026-10-30T10:40:32.183267Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/0b3b73e6-df59-4bc7-b14c-17ebc5207e50` → **200**

```json
{
  "id": "0b3b73e6-df59-4bc7-b14c-17ebc5207e50",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T10:40:32.183267Z",
  "card": {
    "id": "3aba59f4-9e8c-4b70-8ba6-ad1afe92d3b6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4965",
    "card_type": "Visa",
    "created_at": "2026-10-30T10:10:32.451738Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "21ab9030-76e0-494c-9c33-0471781a8076",
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
  "id": "eaad0189-cb4c-451a-91f1-43fddc1ce71f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:32.743469Z",
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
  "command_id": "96014d3a-ee2d-428c-b54d-c0688262ce03",
  "quote_id": "eaad0189-cb4c-451a-91f1-43fddc1ce71f",
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
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8` → **200**

```json
{
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8` → **200**

```json
{
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
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

`GET /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8` → **200**

```json
{
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8/switch-to-cash` → **200**

```json
{
  "command_id": "063baccc-c74d-459f-820a-3dd615f21f99",
  "expected_version": 3
}
```

```json
{
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8/switch-to-cash` → **409**

```json
{
  "command_id": "679a6310-14d7-4c78-9692-0dd100afbb22",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4bb77fa6-e20d-43cf-b8ab-41524007ec03"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8` → **200**

```json
{
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7042e83b-aba5-46e8-9152-a9ef117d73f8/cancel` → **200**

```json
{
  "command_id": "d732ba0a-b12c-4f84-975c-bcb01afd17c0",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7042e83b-aba5-46e8-9152-a9ef117d73f8",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "33166c7e-149c-40aa-a63e-0b5a5ff0dc7d",
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
  "created_at": "2026-10-30T10:10:33.026395Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
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
  "session_id": "b8d421fe-8257-430f-a9cf-f4867d0e8c1b",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5MzYsImlhdCI6MTc5MzM1NTAzNiwianRpIjoiNmI2MTYxMTMtNmEzYi00NmFhLWI1ZGQtZWU4NTExOWU4NGE0Iiwic2lkIjoiYjhkNDIxZmUtODI1Ny00MzBmLWE5Y2YtZjQ4NjdkMGU4YzFiIn0.ADGNRcxHAOnuTRRhFRFDVj1b6424KSECrnzzKDirX-s",
  "access_expires_at": "2026-10-30T10:25:36.606465868Z",
  "refresh_token": "s3Ef-XJPSifU0S_iT85usI4FI0fBx9mC_NmLrLf_RZ4",
  "refresh_expires_at": "2026-10-30T22:10:36.606024384Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14292"
}
```

```json
{
  "challenge_id": "026e7c06-5420-4e65-a8bd-26520d7ae05d",
  "expires_at": "2026-10-30T10:15:36.874162655Z",
  "resend_available_at": "2026-10-30T10:10:37.874162655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "890696",
  "sent_at": "2026-10-30T10:10:36.876816601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "026e7c06-5420-4e65-a8bd-26520d7ae05d",
  "code": "890696",
  "device_ref": "sandbox-14292"
}
```

```json
{
  "session_id": "bf2e2c66-48e1-4a94-b090-78cb1e0bce77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTkzNywiaWF0IjoxNzkzMzU1MDM3LCJqdGkiOiI5NjBjZDUwYy1hZGY4LTRjYTktYjc5My00NmI4MWZmNGE2MGMiLCJzaWQiOiJiZjJlMmM2Ni00OGUxLTRhOTQtYjA5MC03OGNiMWUwYmNlNzcifQ.ma4Iynx3uYx71-xIu23CZK743KFbUxXWo4ky_XD81t8",
  "access_expires_at": "2026-10-30T10:25:37.165121265Z",
  "refresh_token": "uL0oN12K7gasrlSRqGB52IM7kAzl77qnX6-vY7q8bys",
  "refresh_expires_at": "2026-11-29T10:10:37.164566373Z",
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
      "actor_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T10:10:20.846015Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T10:10:22.271483Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "123974e8-83a8-4919-a68a-0510da6477c7",
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
  "device_ref": "sandbox-22079"
}
```

```json
{
  "challenge_id": "6dd0a843-6562-40ae-9150-76fa7a0fd051",
  "expires_at": "2026-10-30T10:15:38.226953299Z",
  "resend_available_at": "2026-10-30T10:10:39.226953299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "633535",
  "sent_at": "2026-10-30T10:10:38.229250799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6dd0a843-6562-40ae-9150-76fa7a0fd051",
  "code": "633535",
  "device_ref": "sandbox-22079"
}
```

```json
{
  "session_id": "0e6c2cc3-dc3e-4e10-b72e-3b624e96406a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTkzOCwiaWF0IjoxNzkzMzU1MDM4LCJqdGkiOiIwODM2YTBjZi0wZDYxLTRkZmYtODE1MC04MGE4ODBlOGJlM2QiLCJzaWQiOiIwZTZjMmNjMy1kYzNlLTRlMTAtYjcyZS0zYjYyNGU5NjQwNmEifQ.sXwPcM9B_RvI_g9qwbFmdG46W14hI2vJmUA3PnyuXV4",
  "access_expires_at": "2026-10-30T10:25:38.511026879Z",
  "refresh_token": "_3PevwveuUItl854AeA2_2dDveenWPQPQyIr66KInI0",
  "refresh_expires_at": "2026-11-29T10:10:38.510535499Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:10:03.132416Z",
  "last_location_at": "2026-10-30T10:10:03.132416Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1c426ec9-d532-4cd7-95c2-05ef2138e43a/handover` → **200**

```json
{
  "command_id": "8e08c568-62d8-41e5-866d-936396cec4d5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:10:03.132416Z",
  "last_location_at": "2026-10-30T10:10:03.132416Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1c426ec9-d532-4cd7-95c2-05ef2138e43a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:39Z",
    "sequence": 1793355039314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:10:39.331074Z",
  "last_location_at": "2026-10-30T10:10:39.331074Z",
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
  "command_id": "c817c42a-60c0-49f8-87fc-6891740dfd41",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:39Z",
    "sequence": 1793355039851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8817c473-674e-430f-b29b-e388f71e1f7f",
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
  "last_heartbeat_at": "2026-10-30T10:10:39.867821Z",
  "last_location_at": "2026-10-30T10:10:39.867821Z",
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
  "session_id": "6e59fb15-16bc-42c0-9d1a-4c1e71f47380",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTU5NDAsImlhdCI6MTc5MzM1NTA0MCwianRpIjoiZWNjZDZkNzEtYmRmZi00ZTg1LTk1ODctYjk5ODNlOGJmZWVlIiwic2lkIjoiNmU1OWZiMTUtMTZiYy00MmMwLTlkMWEtNGMxZTcxZjQ3MzgwIn0.GaVj96p12M8G_t72Vw7AtMkiQ5hkno1_IgY2gfE6LF4",
  "access_expires_at": "2026-10-30T10:25:40.4541729Z",
  "refresh_token": "cZowxRgA6QvyW-vCPoGZdzoF0AoptX6pTmJsH4qtqp4",
  "refresh_expires_at": "2026-10-30T22:10:40.453732821Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "208da386-2254-4b79-a502-ec69e73c0e48",
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
  "id": "e8af7cb6-693a-49fa-8289-0e614b784475",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:40.722242Z",
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
  "command_id": "d64118c0-3fbf-4260-a0ba-916cf2b9d240",
  "quote_id": "e8af7cb6-693a-49fa-8289-0e614b784475",
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
  "id": "4ef3178f-c398-4683-9359-b93a019ad417",
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
  "created_at": "2026-10-30T10:10:40.995032Z",
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
    "id": "6356ef0a-c791-4949-a550-37cd75187f23",
    "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
    "expires_at": "2026-10-30T10:10:55.998363Z",
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

`POST /api/driver/v1/offers/6356ef0a-c791-4949-a550-37cd75187f23/accept` → **200**

```json
{
  "command_id": "a3818382-273a-489b-ac57-5293abde8db8"
}
```

```json
{
  "id": "0349f59f-8af2-42da-883f-2e95744784f1",
  "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e51ae89e-3260-4554-bacc-1adfa3385670",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e51ae89e-3260-4554-bacc-1adfa3385670",
  "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
  "assignment_id": "0349f59f-8af2-42da-883f-2e95744784f1",
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

`POST /api/driver/v1/work-sessions/8817c473-674e-430f-b29b-e388f71e1f7f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T10:10:42Z",
    "sequence": 1793355042404
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8817c473-674e-430f-b29b-e388f71e1f7f",
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
  "last_heartbeat_at": "2026-10-30T10:10:42.421236Z",
  "last_location_at": "2026-10-30T10:10:42.421236Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e51ae89e-3260-4554-bacc-1adfa3385670/arrive` → **200**

```json
{
  "command_id": "cec360ac-3891-48a6-a25b-e4df8ed1c25f",
  "expected_version": 0
}
```

```json
{
  "id": "e51ae89e-3260-4554-bacc-1adfa3385670",
  "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
  "assignment_id": "0349f59f-8af2-42da-883f-2e95744784f1",
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
  "arrived_at": "2026-10-30T10:10:42.694983Z",
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

`POST /api/driver/v1/trips/e51ae89e-3260-4554-bacc-1adfa3385670/start` → **200**

```json
{
  "command_id": "574e067e-ccbe-44e3-baab-006fd6a6666e",
  "expected_version": 1
}
```

```json
{
  "id": "e51ae89e-3260-4554-bacc-1adfa3385670",
  "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
  "assignment_id": "0349f59f-8af2-42da-883f-2e95744784f1",
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
  "arrived_at": "2026-10-30T10:10:42.694983Z",
  "started_at": "2026-10-30T10:10:42.975952Z",
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

`POST /api/driver/v1/trips/e51ae89e-3260-4554-bacc-1adfa3385670/complete` → **200**

```json
{
  "command_id": "63226794-7dd9-46d5-8965-039ec536bbf1",
  "expected_version": 2,
  "reported_at": "2026-10-30T10:10:43Z",
  "cash_received": true
}
```

```json
{
  "id": "e51ae89e-3260-4554-bacc-1adfa3385670",
  "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
  "assignment_id": "0349f59f-8af2-42da-883f-2e95744784f1",
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
  "arrived_at": "2026-10-30T10:10:42.694983Z",
  "started_at": "2026-10-30T10:10:42.975952Z",
  "completed_at": "2026-10-30T10:10:43.262882Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/4ef3178f-c398-4683-9359-b93a019ad417` → **200**

```json
{
  "id": "4ef3178f-c398-4683-9359-b93a019ad417",
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
    "id": "0349f59f-8af2-42da-883f-2e95744784f1",
    "order_id": "4ef3178f-c398-4683-9359-b93a019ad417",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e51ae89e-3260-4554-bacc-1adfa3385670",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T10:10:40.995032Z",
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
  "session_id": "1c426ec9-d532-4cd7-95c2-05ef2138e43a",
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
  "last_heartbeat_at": "2026-10-30T10:10:39.331074Z",
  "last_location_at": "2026-10-30T10:10:39.331074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1c426ec9-d532-4cd7-95c2-05ef2138e43a/close` → **200**

```json
{
  "command_id": "927e9f0c-f7a7-4838-9e94-fe3729859614",
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
  "session_id": "8817c473-674e-430f-b29b-e388f71e1f7f",
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
  "last_heartbeat_at": "2026-10-30T10:10:42.421236Z",
  "last_location_at": "2026-10-30T10:10:42.421236Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8817c473-674e-430f-b29b-e388f71e1f7f/close` → **200**

```json
{
  "command_id": "3f364ca8-9e29-4778-a42d-4e9ef9379919",
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

Done: terminal order 4ef3178f-c398-4683-9359-b93a019ad417 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1682"
}
```

```json
{
  "challenge_id": "1cf28f77-652b-4a2d-8715-d78d9467b486",
  "expires_at": "2026-10-30T10:15:48.216087Z",
  "resend_available_at": "2026-10-30T10:10:49.216087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "433135",
  "sent_at": "2026-10-30T10:10:48.21855614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cf28f77-652b-4a2d-8715-d78d9467b486",
  "code": "433135",
  "device_ref": "sandbox-1682"
}
```

```json
{
  "session_id": "c3d48fb3-a606-4dee-afcb-ecbd220aa2d9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk0OCwiaWF0IjoxNzkzMzU1MDQ4LCJqdGkiOiIyYzQ3MWNhZC1hYzU3LTQwZjUtOTBlYy1jNzg1YzkxMjdmYTMiLCJzaWQiOiJjM2Q0OGZiMy1hNjA2LTRkZWUtYWZjYi1lY2JkMjIwYWEyZDkifQ.QNd0FUXSMNikzE_JOmd_DXiWz1pijkQim-PNECdMEOQ",
  "access_expires_at": "2026-10-30T10:25:48.49941535Z",
  "refresh_token": "lqptnAowZLSYw8uWCxU8vL-ZkaiN0EF7s1yNyq0Idz8",
  "refresh_expires_at": "2026-11-29T10:10:48.498970786Z",
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
  "device_ref": "sandbox-26599"
}
```

```json
{
  "challenge_id": "ce643e19-0c3b-4b78-9620-bb24eae25f0e",
  "expires_at": "2026-10-30T10:15:49.033048992Z",
  "resend_available_at": "2026-10-30T10:10:50.033048992Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "619126",
  "sent_at": "2026-10-30T10:10:49.035648994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce643e19-0c3b-4b78-9620-bb24eae25f0e",
  "code": "619126",
  "device_ref": "sandbox-26599"
}
```

```json
{
  "session_id": "96966972-2bb2-464f-8284-cfed75f0875e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk0OSwiaWF0IjoxNzkzMzU1MDQ5LCJqdGkiOiJkOTQ1YjQzNy1hNTllLTRmNWYtOTQ1OS1hZTVlMWIzZTNhN2EiLCJzaWQiOiI5Njk2Njk3Mi0yYmIyLTQ2NGYtODI4NC1jZmVkNzVmMDg3NWUifQ.pKAsMFIAqd8zm2c88w715uSRh_x7_vkJ_jG9hV62ajg",
  "access_expires_at": "2026-10-30T10:25:49.3213648Z",
  "refresh_token": "VW4n6T0554vSDgBqXjrzHo53AtT9fIrH7yzMOR2vL58",
  "refresh_expires_at": "2026-11-29T10:10:49.320810289Z",
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
  "device_ref": "sandbox-27632"
}
```

```json
{
  "challenge_id": "34433688-c610-42de-99d9-8b1ede9c1843",
  "expires_at": "2026-10-30T10:15:49.837888535Z",
  "resend_available_at": "2026-10-30T10:10:50.837888535Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "120838",
  "sent_at": "2026-10-30T10:10:49.840531383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34433688-c610-42de-99d9-8b1ede9c1843",
  "code": "120838",
  "device_ref": "sandbox-27632"
}
```

```json
{
  "session_id": "a266ef7c-cf97-4d79-a7b5-0be4f38e9e0e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1NTk1MCwiaWF0IjoxNzkzMzU1MDUwLCJqdGkiOiI5MTFjMTUyNC1iOWFlLTQ4MjMtYmEyOC02NWE5YWM3Y2RiZjAiLCJzaWQiOiJhMjY2ZWY3Yy1jZjk3LTRkNzktYTdiNS0wYmU0ZjM4ZTllMGUifQ.fxKfRK5DwBSa5R-OmgtvZbSqwBK8mi_EkTZ0Pd2Vevo",
  "access_expires_at": "2026-10-30T10:25:50.121969903Z",
  "refresh_token": "Gp3748VgFlidMEkF7__7X8uZvtHucIFVy_DTPQcb9BQ",
  "refresh_expires_at": "2026-11-29T10:10:50.121434027Z",
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
  "phone": "+380699890428",
  "device_ref": "sandbox-9603"
}
```

```json
{
  "challenge_id": "4cb5265c-050b-4eee-88b9-3c3bb99b5828",
  "expires_at": "2026-10-30T10:15:50.644387834Z",
  "resend_available_at": "2026-10-30T10:10:51.644387834Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699890428` → **200**

```json
{
  "phone": "+380699890428",
  "audience": "CLIENT",
  "code": "081131",
  "sent_at": "2026-10-30T10:10:50.646610151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cb5265c-050b-4eee-88b9-3c3bb99b5828",
  "code": "081131",
  "device_ref": "sandbox-9603"
}
```

```json
{
  "session_id": "1193d490-8e6c-4f26-8819-be3bc8de2c54",
  "subject": {
    "type": "CLIENT",
    "id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmIxNDViNC03MGI2LTQ1NDktYjFhMy05Y2I5NGYyZjY3YWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzU1OTUwLCJpYXQiOjE3OTMzNTUwNTAsImp0aSI6IjJlMmNhOTkzLTM1MTAtNDAwMC05NzJmLTVhZWVhNGJjYTQ2MyIsInNpZCI6IjExOTNkNDkwLThlNmMtNGYyNi04ODE5LWJlM2JjOGRlMmM1NCJ9.MwTkeB9_Xtn7hvhgXodt_o-o1S7IAf6KQ-uiPD1SdaI",
  "access_expires_at": "2026-10-30T10:25:50.933558046Z",
  "refresh_token": "8_a_XaIEFi-0M_qxgzrhSJwogf2Mwei4dELo6gXVY_Q",
  "refresh_expires_at": "2026-11-29T10:10:50.933027909Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9a7a4296-df8a-4b39-ab4d-f31fee8ecf30",
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
  "id": "cdcfab83-42c5-4343-844c-8848067f9b13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T10:15:51.198169Z",
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
  "command_id": "5e22054a-6ce0-48bc-b463-af5fd8a4a644",
  "quote_id": "cdcfab83-42c5-4343-844c-8848067f9b13",
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
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T10:10:51.471872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:10:51.471872Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.559537674
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.191356341
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

`GET /api/rider/v1/orders/8e6825a9-cd42-4c3a-8fa7-4b452b3610ec` → **200**

```json
{
  "id": "8e6825a9-cd42-4c3a-8fa7-4b452b3610ec",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "02b145b4-70b6-4549-b1a3-9cb94f2f67ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T10:10:51.471872Z",
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
  "session_id": "ddce42d8-bde6-4f9b-b778-0513e6f069dc",
  "subject": {
    "type": "STAFF",
    "id": "64e3d877-e7ce-4f42-8498-69ee14ae4307"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGUzZDg3Ny1lN2NlLTRmNDItODQ5OC02OWVlMTRhZTQzMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTYxMzcsImlhdCI6MTc5MzM1NTIzNywianRpIjoiZTdhY2UxYzQtM2Y3Zi00YmJiLTgzYTEtZGRhNDhkYWZlMmE3Iiwic2lkIjoiZGRjZTQyZDgtYmRlNi00ZjliLWI3NzgtMDUxM2U2ZjA2OWRjIn0.VZ5JoRLMwqOGtroNeteELaVXd_V5cZ08b4OQfKuq20k",
  "access_expires_at": "2026-10-30T10:28:57.786266504Z",
  "refresh_token": "qtkMBb9KvRoCSiNFPvmCGsf2HBPenfk7dekfyaeiqIw",
  "refresh_expires_at": "2026-10-30T22:13:57.785736964Z",
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
  "id": "c9c81a4a-cc32-49e8-ade6-54ccdf98ca20",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.064593Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.064662Z",
  "updated_at": "2026-10-30T10:13:58.081316Z",
  "finished_at": "2026-10-30T10:13:58.081316Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/c9c81a4a-cc32-49e8-ade6-54ccdf98ca20` → **200**

```json
{
  "run": {
    "id": "c9c81a4a-cc32-49e8-ade6-54ccdf98ca20",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:13:58.064593Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:13:58.064662Z",
    "updated_at": "2026-10-30T10:13:58.081316Z",
    "finished_at": "2026-10-30T10:13:58.081316Z",
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
  "id": "c9c81a4a-cc32-49e8-ade6-54ccdf98ca20",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.064593Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.064662Z",
  "updated_at": "2026-10-30T10:13:58.081316Z",
  "finished_at": "2026-10-30T10:13:58.081316Z",
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
  "id": "c9c81a4a-cc32-49e8-ade6-54ccdf98ca20",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.064593Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.064662Z",
  "updated_at": "2026-10-30T10:13:58.081316Z",
  "finished_at": "2026-10-30T10:13:58.081316Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/74c8ebc7-1824-4291-a061-b084c250d6aa` → **204**

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
  "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.483405Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.483497Z",
  "updated_at": "2026-10-30T10:13:58.491886Z",
  "finished_at": "2026-10-30T10:13:58.491886Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/ed407f40-9c46-4ed7-a587-5e4dc8b05278` → **200**

```json
{
  "run": {
    "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:13:58.483405Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:13:58.483497Z",
    "updated_at": "2026-10-30T10:13:58.491886Z",
    "finished_at": "2026-10-30T10:13:58.491886Z",
    "version": 1
  },
  "items": [
    {
      "id": "1bb05356-fa13-42cd-b8ba-3434773c4d0f",
      "run_id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "517e197cb9e66aff3448085e1abd972225964b7d89566b4d66812f5101b4f8da",
      "reference_display": "sandbox-reconciliation-74c8ebc7-1824-4291-a061-b084c250d6aa",
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
      "provider_at": "2026-10-30T10:13:58Z",
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
  "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.483405Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.483497Z",
  "updated_at": "2026-10-30T10:13:58.491886Z",
  "finished_at": "2026-10-30T10:13:58.491886Z",
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
  "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.483405Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.483497Z",
  "updated_at": "2026-10-30T10:13:58.491886Z",
  "finished_at": "2026-10-30T10:13:58.491886Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/1bb05356-fa13-42cd-b8ba-3434773c4d0f/resolve` → **200**

```json
{
  "command_id": "71c29125-6471-4a76-bae8-ce1b28872624",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "1bb05356-fa13-42cd-b8ba-3434773c4d0f",
  "run_id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "517e197cb9e66aff3448085e1abd972225964b7d89566b4d66812f5101b4f8da",
  "reference_display": "sandbox-reconciliation-74c8ebc7-1824-4291-a061-b084c250d6aa",
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
  "provider_at": "2026-10-30T10:13:58Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "resolved_at": "2026-10-30T10:13:58.914408Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/1bb05356-fa13-42cd-b8ba-3434773c4d0f/resolve` → **200**

```json
{
  "command_id": "71c29125-6471-4a76-bae8-ce1b28872624",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "1bb05356-fa13-42cd-b8ba-3434773c4d0f",
  "run_id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "517e197cb9e66aff3448085e1abd972225964b7d89566b4d66812f5101b4f8da",
  "reference_display": "sandbox-reconciliation-74c8ebc7-1824-4291-a061-b084c250d6aa",
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
  "provider_at": "2026-10-30T10:13:58Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
  "resolved_at": "2026-10-30T10:13:58.914408Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/1bb05356-fa13-42cd-b8ba-3434773c4d0f/resolve` → **409**

```json
{
  "command_id": "2a808c12-caa1-484c-bde7-92f091e49a68",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/1bb05356-fa13-42cd-b8ba-3434773c4d0f/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4e01b1b7-ace5-4e4c-a6a7-299bdc3ca114"
}
```

`GET /api/admin/v1/payment-reconciliations/ed407f40-9c46-4ed7-a587-5e4dc8b05278` → **200**

```json
{
  "run": {
    "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T10:13:58.483405Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T10:13:58.483497Z",
    "updated_at": "2026-10-30T10:13:58.914408Z",
    "finished_at": "2026-10-30T10:13:58.491886Z",
    "version": 2
  },
  "items": [
    {
      "id": "1bb05356-fa13-42cd-b8ba-3434773c4d0f",
      "run_id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "517e197cb9e66aff3448085e1abd972225964b7d89566b4d66812f5101b4f8da",
      "reference_display": "sandbox-reconciliation-74c8ebc7-1824-4291-a061-b084c250d6aa",
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
      "provider_at": "2026-10-30T10:13:58Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "64e3d877-e7ce-4f42-8498-69ee14ae4307",
      "resolved_at": "2026-10-30T10:13:58.914408Z",
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
      "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T10:13:58.483405Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:13:58.483497Z",
      "updated_at": "2026-10-30T10:13:58.914408Z",
      "finished_at": "2026-10-30T10:13:58.491886Z",
      "version": 2
    },
    {
      "id": "2a8ed444-5f5b-431f-9a70-81d52ccc1b9b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T10:06:16.518485Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T10:06:16.51864Z",
      "updated_at": "2026-10-30T10:06:16.528308Z",
      "finished_at": "2026-10-30T10:06:16.528308Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/74c8ebc7-1824-4291-a061-b084c250d6aa` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "ed407f40-9c46-4ed7-a587-5e4dc8b05278",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T10:13:58.483405Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T10:13:58.483497Z",
  "updated_at": "2026-10-30T10:13:58.914408Z",
  "finished_at": "2026-10-30T10:13:58.491886Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793355361683E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793355361969E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79335536197E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793355361714E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79335536197E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
