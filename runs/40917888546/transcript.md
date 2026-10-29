# Sandbox transcript (2026-10-29T17:06:15Z, 4f7b9d9)

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
  "correlation_id": "f5cf94e0-b011-4c22-9d06-38d2ba8d339b"
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
  "session_id": "9dda771d-2e48-47a7-b55d-27f0038f6e73",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ0ODQsImlhdCI6MTc5MzI5MzU4NCwianRpIjoiZmQ1MjA1ZGMtNjBmYS00MThkLWFiNGYtODgyYTVjMjFhNmEzIiwic2lkIjoiOWRkYTc3MWQtMmU0OC00N2E3LWI1NWQtMjdmMDAzOGY2ZTczIn0.qO8ev4z-4wwD7DeQwufVtfdptfA3l_sHZQloXOXaj2A",
  "access_expires_at": "2026-10-29T17:21:24.675394464Z",
  "refresh_token": "Ol7rMA7bxmV0AhS9TwD-uFY8bi8n5r7O700hi97ZuZs",
  "refresh_expires_at": "2026-10-30T05:06:24.673142164Z",
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
  "session_id": "ab7e8d99-37ec-49a2-bc63-266d26119dfe",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ0ODYsImlhdCI6MTc5MzI5MzU4NiwianRpIjoiN2Y5ZTg4NzktN2Q4ZS00OTk0LWE4NTctOTUzYmExYjVjYmQ3Iiwic2lkIjoiYWI3ZThkOTktMzdlYy00OWEyLWJjNjMtMjY2ZDI2MTE5ZGZlIn0.deTGcCgfr0xTAXRN-bv-REmuxYjurELuR00996fQUrY",
  "access_expires_at": "2026-10-29T17:21:26.509771369Z",
  "refresh_token": "qj2POwRFXDzxuq1-OQCm_UzMKwGMG7txXLmp77fshSA",
  "refresh_expires_at": "2026-10-30T05:06:26.508836934Z",
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
  "device_ref": "sandbox-25395"
}
```

```json
{
  "challenge_id": "87892977-fecf-4293-86fd-a0a083284183",
  "expires_at": "2026-10-29T17:11:27.118825684Z",
  "resend_available_at": "2026-10-29T17:06:28.118825684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320932",
  "sent_at": "2026-10-29T17:06:27.132224959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87892977-fecf-4293-86fd-a0a083284183",
  "code": "320932",
  "device_ref": "sandbox-25395"
}
```

```json
{
  "session_id": "3388f948-5af7-465c-8884-48d4b850496b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDQ4NywiaWF0IjoxNzkzMjkzNTg3LCJqdGkiOiJhODk4YzU5Ni05MDRhLTQ1OGUtYjM4Ny1hMWEwZDY3NzRkMDUiLCJzaWQiOiIzMzg4Zjk0OC01YWY3LTQ2NWMtODg4NC00OGQ0Yjg1MDQ5NmIifQ.heTSRm7LGo2HZNnRTif-uUxhY7u7s_6tgaubbyUxEbA",
  "access_expires_at": "2026-10-29T17:21:27.479055979Z",
  "refresh_token": "RzENlINvAzaq8tLLYBTcSuzBOH-gSZjaUacIXjmXmtQ",
  "refresh_expires_at": "2026-11-28T17:06:27.477970506Z",
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
  "command_id": "20381dab-0611-473d-863b-b4a9ac830f89",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:28Z",
    "sequence": 1793293588539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ace16f8b-5405-4baa-8838-5d89f3535de9",
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
  "last_heartbeat_at": "2026-10-29T17:06:28.198744Z",
  "last_location_at": "2026-10-29T17:06:28.198744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637867606",
  "device_ref": "sandbox-16705"
}
```

```json
{
  "challenge_id": "a41c4cc8-2441-461f-9215-3e5cc1bfc8e9",
  "expires_at": "2026-10-29T17:11:28.490598929Z",
  "resend_available_at": "2026-10-29T17:06:29.490598929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637867606` → **200**

```json
{
  "phone": "+380637867606",
  "audience": "CLIENT",
  "code": "204501",
  "sent_at": "2026-10-29T17:06:28.495085218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a41c4cc8-2441-461f-9215-3e5cc1bfc8e9",
  "code": "204501",
  "device_ref": "sandbox-16705"
}
```

```json
{
  "session_id": "9b3b7934-13e4-4c90-bd52-4fbc06d8ec45",
  "subject": {
    "type": "CLIENT",
    "id": "dae8c4b6-6062-480c-accc-f5dd0e047df6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYWU4YzRiNi02MDYyLTQ4MGMtYWNjYy1mNWRkMGUwNDdkZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NDg4LCJpYXQiOjE3OTMyOTM1ODgsImp0aSI6IjJjMmMzZGRmLTJiZWEtNDg5Mi1hZDQ2LTZkYzE1ZmE2NTE3ZSIsInNpZCI6IjliM2I3OTM0LTEzZTQtNGM5MC1iZDUyLTRmYmMwNmQ4ZWM0NSJ9._iqoC9iWuaYTIRVSCx3GDj1VJBNZF7hTyBT1o0Vy-qI",
  "access_expires_at": "2026-10-29T17:21:28.801178455Z",
  "refresh_token": "WYx_cTBMzK1FxY078s40_v92PlUf-Z70FxprD33eVlo",
  "refresh_expires_at": "2026-11-28T17:06:28.79999353Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ddb8bdc1-9ed8-439c-ae12-23adc42f03c3",
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
  "id": "c4ea50e3-f836-4bcd-acf3-5a09d0e2a53e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:11:29.140878Z",
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
  "command_id": "33444424-f70d-4ac7-a2fb-31798a56fdf7",
  "quote_id": "c4ea50e3-f836-4bcd-acf3-5a09d0e2a53e",
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
  "id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dae8c4b6-6062-480c-accc-f5dd0e047df6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:06:29.52962Z",
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
    "id": "8e02d80c-b7cf-4ebc-b694-1f176d8954bf",
    "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
    "expires_at": "2026-10-29T17:06:44.540778Z",
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

`POST /api/driver/v1/offers/8e02d80c-b7cf-4ebc-b694-1f176d8954bf/accept` → **200**

```json
{
  "command_id": "2d0277ce-e5ac-4ba4-9df9-1df25fd8d9d0"
}
```

```json
{
  "id": "e7345958-f524-4ce1-b0d7-21db13c60785",
  "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2484a845-37da-4685-89fe-16c872eec881",
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
  "command_id": "fbaea776-1fae-418d-9a4a-ea0d3fdc120c",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T17:06:30.828595356Z"
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
  "id": "2484a845-37da-4685-89fe-16c872eec881",
  "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
  "assignment_id": "e7345958-f524-4ce1-b0d7-21db13c60785",
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

`POST /api/driver/v1/work-sessions/ace16f8b-5405-4baa-8838-5d89f3535de9/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:31Z",
    "sequence": 1793293591741
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ace16f8b-5405-4baa-8838-5d89f3535de9",
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
  "last_heartbeat_at": "2026-10-29T17:06:31.766135Z",
  "last_location_at": "2026-10-29T17:06:31.766135Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2484a845-37da-4685-89fe-16c872eec881/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3da26cf9-1795-4de6-b7de-9aaf8bd7fe7a",
  "expected_version": 0
}
```

```json
{
  "id": "2484a845-37da-4685-89fe-16c872eec881",
  "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
  "assignment_id": "e7345958-f524-4ce1-b0d7-21db13c60785",
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
  "arrived_at": "2026-10-29T17:06:32.074363Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2484a845-37da-4685-89fe-16c872eec881/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0caf15d3-3b7c-4afd-b49b-120ac64c2722",
  "expected_version": 1
}
```

```json
{
  "id": "2484a845-37da-4685-89fe-16c872eec881",
  "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
  "assignment_id": "e7345958-f524-4ce1-b0d7-21db13c60785",
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
  "arrived_at": "2026-10-29T17:06:32.074363Z",
  "started_at": "2026-10-29T17:06:32.379752Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2484a845-37da-4685-89fe-16c872eec881/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e8f91b22-c4ef-4837-9275-104714413156",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:06:32Z",
  "cash_received": true
}
```

```json
{
  "id": "2484a845-37da-4685-89fe-16c872eec881",
  "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
  "assignment_id": "e7345958-f524-4ce1-b0d7-21db13c60785",
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
  "arrived_at": "2026-10-29T17:06:32.074363Z",
  "started_at": "2026-10-29T17:06:32.379752Z",
  "completed_at": "2026-10-29T17:06:32.703174Z",
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
  "session_id": "ace16f8b-5405-4baa-8838-5d89f3535de9",
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
  "last_heartbeat_at": "2026-10-29T17:06:31.766135Z",
  "last_location_at": "2026-10-29T17:06:31.766135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ace16f8b-5405-4baa-8838-5d89f3535de9/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ecb64434-1951-4141-a217-76ae14b09182",
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
  "command_id": "bc9ab175-35fc-4790-b3dc-f2f448fe3258",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:33Z",
    "sequence": 1793293593608
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
  "correlation_id": "88fbffd6-185d-43e9-8622-bc5f68171ec4",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "3d5c35cb-b1f5-48fd-b392-977ddba051ff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:33Z",
    "sequence": 1793293593910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6af6fcd8-970c-4835-b306-88878a1345bf",
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
  "last_heartbeat_at": "2026-10-29T17:06:33.931935Z",
  "last_location_at": "2026-10-29T17:06:33.931935Z",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T17:06:30.828595Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e81d2849-683c-4c7b-b281-8f542f924f3f",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T17:06:34.530078525Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6af6fcd8-970c-4835-b306-88878a1345bf",
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
  "last_heartbeat_at": "2026-10-29T17:06:33.931935Z",
  "last_location_at": "2026-10-29T17:06:33.931935Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6af6fcd8-970c-4835-b306-88878a1345bf/close` → **200**

```json
{
  "command_id": "eed09b2a-f85c-4dc1-abba-9149c7a339df",
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
  "session_id": "d3d375e6-175f-4f84-a5dd-32397fd4baa4",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ0OTUsImlhdCI6MTc5MzI5MzU5NSwianRpIjoiNWE1ZDdlY2EtN2U1OS00NDZkLWIwZGMtZGFlZmFmODI5MzhiIiwic2lkIjoiZDNkMzc1ZTYtMTc1Zi00Zjg0LWE1ZGQtMzIzOTdmZDRiYWE0In0.s0zA9dCRYf-NJd7G-o6BpPPIcrv0Th3iMe50BUc33Tw",
  "access_expires_at": "2026-10-29T17:21:35.724221674Z",
  "refresh_token": "PoaUekdvwur3CZhg0GpWvjVGtVbf_EqOzdc9xecMqAM",
  "refresh_expires_at": "2026-10-30T05:06:35.723452087Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "130d2f97-0b5f-483b-94da-8bb3c5d6b535",
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
  "id": "d816d8b2-0b81-450f-af23-07734546bb30",
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
  "created_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "created_at": "2026-10-29T17:06:36.021726Z",
  "updated_at": "2026-10-29T17:06:36.021726Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639621741",
  "device_ref": "sandbox-28501"
}
```

```json
{
  "challenge_id": "777f7e0d-dffe-45d6-b9b8-a6e005974df6",
  "expires_at": "2026-10-29T17:11:36.321010363Z",
  "resend_available_at": "2026-10-29T17:06:37.321010363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639621741` → **200**

```json
{
  "phone": "+380639621741",
  "audience": "CLIENT",
  "code": "947443",
  "sent_at": "2026-10-29T17:06:36.325391838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "777f7e0d-dffe-45d6-b9b8-a6e005974df6",
  "code": "947443",
  "device_ref": "sandbox-28501"
}
```

```json
{
  "session_id": "6f244ca6-462e-4d18-94c1-5fefb3b88897",
  "subject": {
    "type": "CLIENT",
    "id": "e0728172-9148-4fdc-8a6f-2ecd99bf7bc8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDcyODE3Mi05MTQ4LTRmZGMtOGE2Zi0yZWNkOTliZjdiYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NDk2LCJpYXQiOjE3OTMyOTM1OTYsImp0aSI6ImNiY2Q0YTJmLTNkNGUtNDUzYy1iOGY5LWFkMzVhZmM5ODJlMSIsInNpZCI6IjZmMjQ0Y2E2LTQ2MmUtNGQxOC05NGMxLTVmZWZiM2I4ODg5NyJ9.nACuvFo7kTirS2iKTwPbsibotA62JZUr8gq3KJhDrH4",
  "access_expires_at": "2026-10-29T17:21:36.63374545Z",
  "refresh_token": "v04NB_lxvHfWc_pfGn7Pya6W0-YYHsdX7MAMOn3koME",
  "refresh_expires_at": "2026-11-28T17:06:36.63291891Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639621741` → **200**

```json
{
  "client_id": "e0728172-9148-4fdc-8a6f-2ecd99bf7bc8"
}
```

`POST /api/admin/v1/rider-wallets/e0728172-9148-4fdc-8a6f-2ecd99bf7bc8/top-ups` → **201**

```json
{
  "command_id": "2b4566ec-15c2-4b01-812c-eb92ecd4d25d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e0728172-9148-4fdc-8a6f-2ecd99bf7bc8",
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
      "id": "5557df1e-366a-4c7e-917e-aa0c13a5e8a1",
      "at": "2026-10-29T17:06:37.200037Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "174c6f6a-e2c4-407b-9660-d98aa7c7ca25",
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
  "id": "47f35a2c-6def-4a10-8275-f7773950dc90",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:11:37.518793Z",
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
      "id": "d816d8b2-0b81-450f-af23-07734546bb30",
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
  "device_ref": "sandbox-2938"
}
```

```json
{
  "challenge_id": "c5b77165-c38e-4592-b691-bb09d6e153ca",
  "expires_at": "2026-10-29T17:11:37.820396085Z",
  "resend_available_at": "2026-10-29T17:06:38.820396085Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "697514",
  "sent_at": "2026-10-29T17:06:37.824840197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5b77165-c38e-4592-b691-bb09d6e153ca",
  "code": "697514",
  "device_ref": "sandbox-2938"
}
```

```json
{
  "session_id": "34be499e-3306-421a-a513-5f887198aa03",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDQ5OCwiaWF0IjoxNzkzMjkzNTk4LCJqdGkiOiI4YjA2ODZhOC04ZGJkLTRkNmYtYjE3NS1jYTllMzFlNDA1MTQiLCJzaWQiOiIzNGJlNDk5ZS0zMzA2LTQyMWEtYTUxMy01Zjg4NzE5OGFhMDMifQ.L8jfEZZ-kJ5z8QOizK60-wp3nUWHOdNDQr2KZTzgjuc",
  "access_expires_at": "2026-10-29T17:21:38.134933248Z",
  "refresh_token": "PR9lwb6Al1AHto3SulsVPcefG-99VD6hf7EPiUcG81k",
  "refresh_expires_at": "2026-11-28T17:06:38.134092485Z",
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
  "command_id": "723406dc-1fe7-4b3d-9554-1aeaa891d672",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:38Z",
    "sequence": 1793293598695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83b3ecda-ca44-43e9-9381-2e59a89e6083",
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
  "last_heartbeat_at": "2026-10-29T17:06:38.717436Z",
  "last_location_at": "2026-10-29T17:06:38.717436Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1af534cc-f4f0-48c5-bdf9-6140e05430b8",
  "quote_id": "47f35a2c-6def-4a10-8275-f7773950dc90",
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
  "id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0728172-9148-4fdc-8a6f-2ecd99bf7bc8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:06:39.033952Z",
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
  "client_id": "e0728172-9148-4fdc-8a6f-2ecd99bf7bc8",
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
      "id": "5557df1e-366a-4c7e-917e-aa0c13a5e8a1",
      "at": "2026-10-29T17:06:37.200037Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
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
    "id": "85c2383a-0eff-4c19-a7c5-ea14ff677350",
    "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
    "expires_at": "2026-10-29T17:06:54.044468Z",
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

`POST /api/driver/v1/offers/85c2383a-0eff-4c19-a7c5-ea14ff677350/accept` → **200**

```json
{
  "command_id": "044c8398-636d-409a-92b3-3ef5f2ef4890"
}
```

```json
{
  "id": "b677f908-69d3-4ea7-bac2-269378c67b8d",
  "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a856e4f0-17b5-482a-a617-1a1f8eac6890",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a856e4f0-17b5-482a-a617-1a1f8eac6890",
  "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
  "assignment_id": "b677f908-69d3-4ea7-bac2-269378c67b8d",
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

`POST /api/driver/v1/work-sessions/83b3ecda-ca44-43e9-9381-2e59a89e6083/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:40Z",
    "sequence": 1793293600532
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83b3ecda-ca44-43e9-9381-2e59a89e6083",
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
  "last_heartbeat_at": "2026-10-29T17:06:40.552899Z",
  "last_location_at": "2026-10-29T17:06:40.552899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a856e4f0-17b5-482a-a617-1a1f8eac6890/arrive` → **200**

```json
{
  "command_id": "4cfde091-4dfd-429d-bfeb-ad955687109c",
  "expected_version": 0
}
```

```json
{
  "id": "a856e4f0-17b5-482a-a617-1a1f8eac6890",
  "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
  "assignment_id": "b677f908-69d3-4ea7-bac2-269378c67b8d",
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
  "arrived_at": "2026-10-29T17:06:40.849103Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a856e4f0-17b5-482a-a617-1a1f8eac6890/start` → **200**

```json
{
  "command_id": "7f21f167-fe4c-43b1-b660-ac98e4daaa0d",
  "expected_version": 1
}
```

```json
{
  "id": "a856e4f0-17b5-482a-a617-1a1f8eac6890",
  "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
  "assignment_id": "b677f908-69d3-4ea7-bac2-269378c67b8d",
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
  "arrived_at": "2026-10-29T17:06:40.849103Z",
  "started_at": "2026-10-29T17:06:41.152853Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a856e4f0-17b5-482a-a617-1a1f8eac6890/complete` → **200**

```json
{
  "command_id": "320be86e-961b-450e-bba2-3839ad7400af",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:06:41Z",
  "cash_received": true
}
```

```json
{
  "id": "a856e4f0-17b5-482a-a617-1a1f8eac6890",
  "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
  "assignment_id": "b677f908-69d3-4ea7-bac2-269378c67b8d",
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
  "arrived_at": "2026-10-29T17:06:40.849103Z",
  "started_at": "2026-10-29T17:06:41.152853Z",
  "completed_at": "2026-10-29T17:06:41.477175Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e0728172-9148-4fdc-8a6f-2ecd99bf7bc8",
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
      "id": "2847b772-d094-4e99-80aa-6e961863ca3f",
      "at": "2026-10-29T17:06:42.515572Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25"
    },
    {
      "id": "5557df1e-366a-4c7e-917e-aa0c13a5e8a1",
      "at": "2026-10-29T17:06:37.200037Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/d816d8b2-0b81-450f-af23-07734546bb30/archive` → **200**

```json
{
  "command_id": "0245c8e7-d1cd-4a0e-b1c2-c9d2c7e91755",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "d816d8b2-0b81-450f-af23-07734546bb30",
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
  "created_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "created_at": "2026-10-29T17:06:36.021726Z",
  "updated_at": "2026-10-29T17:06:45.084821Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83b3ecda-ca44-43e9-9381-2e59a89e6083",
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
  "last_heartbeat_at": "2026-10-29T17:06:40.552899Z",
  "last_location_at": "2026-10-29T17:06:40.552899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83b3ecda-ca44-43e9-9381-2e59a89e6083/close` → **200**

```json
{
  "command_id": "46539962-1500-4fff-990c-190789909616",
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

Done: order c8d2ee28-6223-44ec-a948-ca58693d8d25.

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
  "session_id": "ca85ea7a-1af3-4283-868b-6516fedc337b",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1MDYsImlhdCI6MTc5MzI5MzYwNiwianRpIjoiZWVkZTYxZDItODdmZC00ZTJlLWFlNDMtM2NmZDM0YmQwOTMwIiwic2lkIjoiY2E4NWVhN2EtMWFmMy00MjgzLTg2OGItNjUxNmZlZGMzMzdiIn0.Mdv9Q7vJH5isqIiMWaWQmY8Mq_-0XZhTnVUe1a_hDoQ",
  "access_expires_at": "2026-10-29T17:21:46.282245172Z",
  "refresh_token": "XAihfkwpWJe_l5Bw-WVFhdpewjr7B_mZ1jKtwOlsjOY",
  "refresh_expires_at": "2026-10-30T05:06:46.281631427Z",
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
  "command_id": "eff046f1-1579-42b3-b849-9dd0177d60c5",
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
  "session_id": "15e30907-32dd-45b4-b286-4f4c1fc2c965",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1MDcsImlhdCI6MTc5MzI5MzYwNywianRpIjoiN2E5YzliOWMtMmNjYi00YzhhLThlMGItODgzNWQ3ZDI0YzY2Iiwic2lkIjoiMTVlMzA5MDctMzJkZC00NWI0LWIyODYtNGY0YzFmYzJjOTY1In0.5nlPxG3nW0DUe3MeFfKczYshVqiXq2dEJx3nFlsif5o",
  "access_expires_at": "2026-10-29T17:21:47.465825667Z",
  "refresh_token": "FVvO-B0O6IwZSOFxnSoBBeTuPQY6OETwWVT8iqb5wxE",
  "refresh_expires_at": "2026-10-30T05:06:47.464999817Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1092622720",
    "linkedid": "1730052700.1092622720",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673165891"
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
    "id": "1730052700.1092622720",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "7cddf7c3-5977-4dd8-96a0-37649b549f1e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T17:06:47.758924Z",
      "answered_at": null,
      "ended_at": "2026-10-29T17:06:47.784859Z",
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
    "id": "1730052600.2574410876",
    "linkedid": "1730052600.2574410876",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673165891"
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
      "id": "f4010910-acff-413e-8d6a-e13288338964",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T17:06:48.114674Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f4010910-acff-413e-8d6a-e13288338964/answer` → **200**

```json
{
  "command_id": "8fc7ec91-c9aa-4ae0-9c78-69e9ca507620"
}
```

```json
{
  "id": "f4010910-acff-413e-8d6a-e13288338964",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673165891",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "order_ids": [],
  "started_at": "2026-10-29T17:06:48.114674Z",
  "answered_at": "2026-10-29T17:06:48.44839Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2574410876",
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
    "id": "1730052600.2574410876",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f4010910-acff-413e-8d6a-e13288338964",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [],
      "started_at": "2026-10-29T17:06:48.114674Z",
      "answered_at": "2026-10-29T17:06:48.44839Z",
      "ended_at": "2026-10-29T17:06:48.762799Z",
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
      "id": "f4010910-acff-413e-8d6a-e13288338964",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [],
      "started_at": "2026-10-29T17:06:48.114674Z",
      "answered_at": "2026-10-29T17:06:48.44839Z",
      "ended_at": "2026-10-29T17:06:48.762799Z",
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
      "id": "f4010910-acff-413e-8d6a-e13288338964",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [],
      "started_at": "2026-10-29T17:06:48.114674Z",
      "answered_at": "2026-10-29T17:06:48.44839Z",
      "ended_at": "2026-10-29T17:06:48.762799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:06:53.205743Z"
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
      "id": "f4010910-acff-413e-8d6a-e13288338964",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [],
      "started_at": "2026-10-29T17:06:48.114674Z",
      "answered_at": "2026-10-29T17:06:48.44839Z",
      "ended_at": "2026-10-29T17:06:48.762799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:06:53.205743Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f4010910-acff-413e-8d6a-e13288338964/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f4010910-acff-413e-8d6a-e13288338964/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f4010910-acff-413e-8d6a-e13288338964` → **200**

```json
{
  "changes": [
    {
      "id": "95ec1695-a0a2-4ec7-bff1-4b60a68ae151",
      "occurred_at": "2026-10-29T17:06:54.006968Z",
      "actor_type": "STAFF",
      "actor_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f4010910-acff-413e-8d6a-e13288338964",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f7806f0b-221d-4810-8825-eb0195d311a0\", \"order_ids\": []}",
      "correlation_id": "ceae41bc-67c3-4e62-bbc6-28cbec8cc3dc"
    },
    {
      "id": "ab914ffa-cebd-4c18-8c8c-cc2b085910f8",
      "occurred_at": "2026-10-29T17:06:53.97225Z",
      "actor_type": "STAFF",
      "actor_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f4010910-acff-413e-8d6a-e13288338964",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f7806f0b-221d-4810-8825-eb0195d311a0\", \"order_ids\": []}",
      "correlation_id": "6eff4185-1993-4007-be5c-17960af0f7ca"
    }
  ]
}
```

Done: call f4010910-acff-413e-8d6a-e13288338964 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28295"
}
```

```json
{
  "challenge_id": "5a3b5c40-4f45-4704-b5c8-2c8a643becfc",
  "expires_at": "2026-10-29T17:11:54.334733913Z",
  "resend_available_at": "2026-10-29T17:06:55.334733913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "543901",
  "sent_at": "2026-10-29T17:06:54.339152248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a3b5c40-4f45-4704-b5c8-2c8a643becfc",
  "code": "543901",
  "device_ref": "sandbox-28295"
}
```

```json
{
  "session_id": "56800f66-e530-43b1-a91b-9942481c284e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDUxNCwiaWF0IjoxNzkzMjkzNjE0LCJqdGkiOiIyOWI2YTVlNy0zZmY4LTRkYzItODM3NC1iZmQwYjNhODNlOTAiLCJzaWQiOiI1NjgwMGY2Ni1lNTMwLTQzYjEtYTkxYi05OTQyNDgxYzI4NGUifQ.7B66b19EmmjfptsqBUgYhmnFwg-XxVeV4PymubwH91k",
  "access_expires_at": "2026-10-29T17:21:54.660651798Z",
  "refresh_token": "TFYbpMKmtXp_RutYLXcBdHqpY4EzZ8DLlHM4GEX6BSY",
  "refresh_expires_at": "2026-11-28T17:06:54.659965459Z",
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
  "command_id": "af888ca3-69ea-4f3d-b003-692f8fc337e4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:55Z",
    "sequence": 1793293615236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "442b755e-e189-4ab1-bf51-0c9fb1d85a5b",
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
  "last_heartbeat_at": "2026-10-29T17:06:55.256672Z",
  "last_location_at": "2026-10-29T17:06:55.256672Z",
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
  "session_id": "68d01157-9b66-4c84-8f38-2ca79efc8c69",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1MTUsImlhdCI6MTc5MzI5MzYxNSwianRpIjoiMGQwOWU4NjktZjUwMi00OGEwLWIzMDAtNDcyN2E3ZmFiZmRhIiwic2lkIjoiNjhkMDExNTctOWI2Ni00Yzg0LThmMzgtMmNhNzllZmM4YzY5In0.MfjLDbgZGjiHkD9bXIhz5l-sk7CI71HN5eO-UfPRhSE",
  "access_expires_at": "2026-10-29T17:21:55.845804633Z",
  "refresh_token": "DdtyT7YrRbboJ0dABtuZx6-KXz_IX9PzWBtcEcVoXRk",
  "refresh_expires_at": "2026-10-30T05:06:55.845154913Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6c6e208f-a423-49ee-96ab-55f2e31751d1",
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
  "id": "320661c3-29e6-4542-8b69-5f476ec376ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:11:56.145533Z",
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
  "command_id": "c4222cef-2752-458b-afbf-a4021f366f0a",
  "quote_id": "320661c3-29e6-4542-8b69-5f476ec376ff",
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
    "phone": "+380679896402"
  }
}
```

```json
{
  "id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
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
  "created_at": "2026-10-29T17:06:56.463477Z",
  "caller": {
    "name": "Олена",
    "phone": "+380679896402"
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
    "id": "c9cd6e06-0923-49f1-bb82-86e56d540f99",
    "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
    "expires_at": "2026-10-29T17:07:11.471341Z",
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

`POST /api/driver/v1/offers/c9cd6e06-0923-49f1-bb82-86e56d540f99/accept` → **200**

```json
{
  "command_id": "56c90dc8-7533-4167-a3ff-8833fd5a0892"
}
```

```json
{
  "id": "594fe94a-a513-4320-ae45-e285f36e7586",
  "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78af37fc-1097-487a-a3b6-56eea084ce04",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78af37fc-1097-487a-a3b6-56eea084ce04",
  "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
  "assignment_id": "594fe94a-a513-4320-ae45-e285f36e7586",
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
    "phone": "+380679896402"
  }
}
```

`POST /api/driver/v1/work-sessions/442b755e-e189-4ab1-bf51-0c9fb1d85a5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:06:58Z",
    "sequence": 1793293618805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "442b755e-e189-4ab1-bf51-0c9fb1d85a5b",
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
  "last_heartbeat_at": "2026-10-29T17:06:58.825787Z",
  "last_location_at": "2026-10-29T17:06:58.825787Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/78af37fc-1097-487a-a3b6-56eea084ce04/arrive` → **200**

```json
{
  "command_id": "ce2a6648-75e3-4946-a5a8-d879c7ab0b94",
  "expected_version": 0
}
```

```json
{
  "id": "78af37fc-1097-487a-a3b6-56eea084ce04",
  "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
  "assignment_id": "594fe94a-a513-4320-ae45-e285f36e7586",
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
  "arrived_at": "2026-10-29T17:06:59.125273Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679896402"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  },
  {
    "phone": "+380679896402",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T17:07:00.448863044Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  },
  {
    "phone": "+380679896402",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T17:07:00.448863044Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380679896402` → **200**

```json
[
  {
    "phone": "+380679896402",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:06:58.439255982Z"
  },
  {
    "phone": "+380679896402",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T17:07:00.448863044Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/78af37fc-1097-487a-a3b6-56eea084ce04/start` → **200**

```json
{
  "command_id": "e65cf362-e2a9-493f-a198-ff3d17a2a2ed",
  "expected_version": 1
}
```

```json
{
  "id": "78af37fc-1097-487a-a3b6-56eea084ce04",
  "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
  "assignment_id": "594fe94a-a513-4320-ae45-e285f36e7586",
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
  "arrived_at": "2026-10-29T17:06:59.125273Z",
  "started_at": "2026-10-29T17:07:00.542253Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380679896402"
  }
}
```

`POST /api/driver/v1/trips/78af37fc-1097-487a-a3b6-56eea084ce04/complete` → **200**

```json
{
  "command_id": "90910cdd-cf0d-4fe1-98be-0b8edcee5f07",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:07:00Z",
  "cash_received": true
}
```

```json
{
  "id": "78af37fc-1097-487a-a3b6-56eea084ce04",
  "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
  "assignment_id": "594fe94a-a513-4320-ae45-e285f36e7586",
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
  "arrived_at": "2026-10-29T17:06:59.125273Z",
  "started_at": "2026-10-29T17:07:00.542253Z",
  "completed_at": "2026-10-29T17:07:00.855583Z",
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
  "session_id": "442b755e-e189-4ab1-bf51-0c9fb1d85a5b",
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
  "last_heartbeat_at": "2026-10-29T17:06:58.825787Z",
  "last_location_at": "2026-10-29T17:06:58.825787Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/442b755e-e189-4ab1-bf51-0c9fb1d85a5b/close` → **200**

```json
{
  "command_id": "31d44076-bff9-4fd4-9067-b8fe0aff732b",
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
  "phone": "+380638294549",
  "device_ref": "sandbox-6780"
}
```

```json
{
  "challenge_id": "8a212a6d-9442-40b2-b2ca-7d6fd7524681",
  "expires_at": "2026-10-29T17:12:01.769705832Z",
  "resend_available_at": "2026-10-29T17:07:02.769705832Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638294549` → **200**

```json
{
  "phone": "+380638294549",
  "audience": "CLIENT",
  "code": "565439",
  "sent_at": "2026-10-29T17:07:01.773374831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a212a6d-9442-40b2-b2ca-7d6fd7524681",
  "code": "565439",
  "device_ref": "sandbox-6780"
}
```

```json
{
  "session_id": "7467ef25-f6f9-4865-85b5-072618c3bc0d",
  "subject": {
    "type": "CLIENT",
    "id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWRmZmM5MS02YzVkLTRmYjItOGFhMi1jZTkwYmRiMTg3OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTIyLCJpYXQiOjE3OTMyOTM2MjIsImp0aSI6IjY0ZGY1ZmUxLWI3MDQtNGJhNS04YmI3LWQ5M2U0ZTYyNGI4NyIsInNpZCI6Ijc0NjdlZjI1LWY2ZjktNDg2NS04NWI1LTA3MjYxOGMzYmMwZCJ9.0fkG6bGRb3GK2TM3iuXKebWpO1_zPoumgy2dembfrHk",
  "access_expires_at": "2026-10-29T17:22:02.103995884Z",
  "refresh_token": "kETfpMruQV8Tk7l4Cz59TqoLaiJL9yjkqIUZBuBSKpM",
  "refresh_expires_at": "2026-11-28T17:07:02.103175295Z",
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
  "device_ref": "sandbox-22818"
}
```

```json
{
  "challenge_id": "0eb256ad-4a6c-4b4e-aed4-6d02356e1b94",
  "expires_at": "2026-10-29T17:12:02.666279891Z",
  "resend_available_at": "2026-10-29T17:07:03.666279891Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "754647",
  "sent_at": "2026-10-29T17:07:02.669695413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0eb256ad-4a6c-4b4e-aed4-6d02356e1b94",
  "code": "754647",
  "device_ref": "sandbox-22818"
}
```

```json
{
  "session_id": "b3411b0b-b799-4a5e-a4c3-4f7edc22add6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDUyMiwiaWF0IjoxNzkzMjkzNjIyLCJqdGkiOiIyYmRhODljMS1jMGUwLTQ0M2ItYjIzNS00YmI2ZTQ2MTQyN2QiLCJzaWQiOiJiMzQxMWIwYi1iNzk5LTRhNWUtYTRjMy00ZjdlZGMyMmFkZDYifQ.V-jdiN7KftmI6aWUm_ZkQC982JUZQ9EwoPJFFl9Nmp0",
  "access_expires_at": "2026-10-29T17:22:02.981677794Z",
  "refresh_token": "s1b2vAvTnplON7XkD6LQe_GGl4LUhAPXJu5Xno7QWWU",
  "refresh_expires_at": "2026-11-28T17:07:02.98104272Z",
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
  "session_id": "8c9c354f-f60a-463d-8a60-72c3e89b406e",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1MjMsImlhdCI6MTc5MzI5MzYyMywianRpIjoiNzgyM2Y5MTUtZDU4NS00ZjIwLWJmNWQtMWNjMDkwYjhkMmUxIiwic2lkIjoiOGM5YzM1NGYtZjYwYS00NjNkLThhNjAtNzJjM2U4OWI0MDZlIn0.aaSzcfRWXagaWGTtVjsPmR3BUXnlZfCyauJZwmRGyek",
  "access_expires_at": "2026-10-29T17:22:03.858868253Z",
  "refresh_token": "YNTP-_sET4wVlT3vn_bvdvRvchZat2B4lcFhwndX3oc",
  "refresh_expires_at": "2026-10-30T05:07:03.858218245Z",
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
  "session_id": "f5f3ca7b-5f47-4587-b858-d085799abea2",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1MjQsImlhdCI6MTc5MzI5MzYyNCwianRpIjoiMDQ3OTFiZjYtNDkzNS00ZjY0LWI2MzYtZDljNGVjZDdiMGJlIiwic2lkIjoiZjVmM2NhN2ItNWY0Ny00NTg3LWI4NTgtZDA4NTc5OWFiZWEyIn0.pm1-5hynCvfCbiKXzWPGcvtblk4_S-u_fI1H9cZVDSw",
  "access_expires_at": "2026-10-29T17:22:04.46830438Z",
  "refresh_token": "gqFrfgtL7TSHwWimUx-_LwSVAhexqDnVABpwB971u10",
  "refresh_expires_at": "2026-10-30T05:07:04.467730172Z",
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
  "command_id": "c912a45b-b538-4af9-bfb6-8367cd1eb3e4",
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
  "id": "888b0330-f825-4495-8627-da168dbd8f2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:12:05.049565Z",
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
  "command_id": "a5ee4f63-f0b1-4282-8efd-8a98cf45122f",
  "quote_id": "888b0330-f825-4495-8627-da168dbd8f2e",
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
  "id": "0328c666-9c3d-45e3-8e5f-509ac691ef64",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b",
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
  "created_at": "2026-10-29T17:07:05.367896Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0328c666-9c3d-45e3-8e5f-509ac691ef64` → **200**

```json
{
  "id": "0328c666-9c3d-45e3-8e5f-509ac691ef64",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b",
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
  "created_at": "2026-10-29T17:07:05.367896Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0328c666-9c3d-45e3-8e5f-509ac691ef64/cancel` → **200**

```json
{
  "command_id": "559b3d76-dc08-43de-942b-f389ca833218",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "0328c666-9c3d-45e3-8e5f-509ac691ef64",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b",
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
  "created_at": "2026-10-29T17:07:05.367896Z",
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
  "command_id": "e6493025-23d5-49f9-8ce8-86e533047c86",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:06Z",
    "sequence": 1793293626637
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1c63eb4c-f746-4a70-96be-6d2f3e5cb203",
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
  "last_heartbeat_at": "2026-10-29T17:07:06.659593Z",
  "last_location_at": "2026-10-29T17:07:06.659593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25223"
}
```

```json
{
  "challenge_id": "877cd399-84f8-451c-846d-220adcdf4874",
  "expires_at": "2026-10-29T17:12:06.964645989Z",
  "resend_available_at": "2026-10-29T17:07:07.964645989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "277465",
  "sent_at": "2026-10-29T17:07:06.968197638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "877cd399-84f8-451c-846d-220adcdf4874",
  "code": "277465",
  "device_ref": "sandbox-25223"
}
```

```json
{
  "session_id": "ca06ea14-c065-478b-8976-78bbf24dc869",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDUyNywiaWF0IjoxNzkzMjkzNjI3LCJqdGkiOiJkYzM1NDBmNS1lMjY1LTQ3ZGYtOWMzZC0wYWYzNjcyMzUyMDYiLCJzaWQiOiJjYTA2ZWExNC1jMDY1LTQ3OGItODk3Ni03OGJiZjI0ZGM4NjkifQ.EfE3oAPEVxAK8IHtsuN5FDrSr1k0BpA8QL2cu5-8L8s",
  "access_expires_at": "2026-10-29T17:22:07.31236622Z",
  "refresh_token": "ODT0fvyZ_QJ1zzEC6zIrkeboYPGMNv1fYvl8VtuT_HI",
  "refresh_expires_at": "2026-11-28T17:07:07.311801808Z",
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
  "command_id": "1c01be33-4bae-4692-88f5-5da293351503",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:07Z",
    "sequence": 1793293627901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:07.922662Z",
  "last_location_at": "2026-10-29T17:07:07.922662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b5af2cf-05e0-4af5-a349-00778548627d",
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
  "id": "449c8914-4de1-4d84-9604-a0335cb4911c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:12:08.233068Z",
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
  "command_id": "07d1e248-9012-403e-8cbf-bba1d43aea4c",
  "quote_id": "449c8914-4de1-4d84-9604-a0335cb4911c",
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
  "id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b",
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
  "created_at": "2026-10-29T17:07:08.542491Z",
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
    "id": "ac52c6a2-8767-476a-b3bc-85b527740c45",
    "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
    "expires_at": "2026-10-29T17:07:23.546823Z",
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

`POST /api/driver/v1/offers/ac52c6a2-8767-476a-b3bc-85b527740c45/accept` → **200**

```json
{
  "command_id": "7eb092ee-3f8c-473d-b106-f6c9f0ad70da"
}
```

```json
{
  "id": "1d6c07fe-8b0f-4e7d-9521-b5a7da299b46",
  "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "adbd6caa-8183-4297-a1ec-de04f4ed0555",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "adbd6caa-8183-4297-a1ec-de04f4ed0555",
  "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "assignment_id": "1d6c07fe-8b0f-4e7d-9521-b5a7da299b46",
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

`POST /api/driver/v1/trips/adbd6caa-8183-4297-a1ec-de04f4ed0555/cancel` → **200**

```json
{
  "command_id": "16f3aecb-8075-4838-890b-6170812bb7da",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "adbd6caa-8183-4297-a1ec-de04f4ed0555",
  "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "assignment_id": "1d6c07fe-8b0f-4e7d-9521-b5a7da299b46",
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

`GET /api/rider/v1/orders/8011df53-1aae-4779-ab33-748bce5a012b` → **200**

```json
{
  "id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b",
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
    "id": "1d6c07fe-8b0f-4e7d-9521-b5a7da299b46",
    "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "adbd6caa-8183-4297-a1ec-de04f4ed0555",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T17:07:08.542491Z",
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
    "id": "27a9774b-611c-4c58-9caa-4861a63dca05",
    "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
    "expires_at": "2026-10-29T17:07:24.799288Z",
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

`POST /api/driver/v1/offers/27a9774b-611c-4c58-9caa-4861a63dca05/accept` → **200**

```json
{
  "command_id": "7a91cf6b-fe04-4cf2-8f43-2da41d01fc81"
}
```

```json
{
  "id": "042cc0c5-0f01-4bfe-98c7-5e55c84a43f1",
  "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fefb5d3a-fc0f-4aa1-a46b-44dd12578de7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fefb5d3a-fc0f-4aa1-a46b-44dd12578de7",
  "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "assignment_id": "042cc0c5-0f01-4bfe-98c7-5e55c84a43f1",
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

`POST /api/driver/v1/trips/fefb5d3a-fc0f-4aa1-a46b-44dd12578de7/cancel` → **200**

```json
{
  "command_id": "19a488e4-9ec1-449c-b938-1f8b6994d5f1",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "fefb5d3a-fc0f-4aa1-a46b-44dd12578de7",
  "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
  "assignment_id": "042cc0c5-0f01-4bfe-98c7-5e55c84a43f1",
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
    "id": "8011df53-1aae-4779-ab33-748bce5a012b",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T17:07:08.542491Z",
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
    "id": "0328c666-9c3d-45e3-8e5f-509ac691ef64",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T17:07:05.367896Z",
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

`GET /api/operator/v1/orders/8011df53-1aae-4779-ab33-748bce5a012b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:07:08.543177Z",
      "actor": {
        "type": "CLIENT",
        "id": "c5dffc91-6c5d-4fb2-8aa2-ce90bdb1878b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
        "quote_id": "449c8914-4de1-4d84-9604-a0335cb4911c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "9a87ba49-85cc-4249-9b6a-ba95f1fbb344"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:07:08.545796Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
        "attempt_id": "b45b8327-89b4-48a6-b222-8ef8eb1b142a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9a87ba49-85cc-4249-9b6a-ba95f1fbb344"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:07:08.554051Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ac52c6a2-8767-476a-b3bc-85b527740c45",
        "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "9a87ba49-85cc-4249-9b6a-ba95f1fbb344"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T17:07:09.172118Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ac52c6a2-8767-476a-b3bc-85b527740c45",
        "order_id": "8011df53-1aae-4779-ab33-748bce5a012b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "1d6c07fe-8b0f-4e7d-9521-b5a7da299b46"
      },
      "correlation_id": "3b0f5afc-9381-4c69-bf95-348ae798c75f"
```

Done: orders 0328c666-9c3d-45e3-8e5f-509ac691ef64, 8011df53-1aae-4779-ab33-748bce5a012b.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730087649",
  "device_ref": "sandbox-23864"
}
```

```json
{
  "challenge_id": "1b9188af-95c2-4c6e-acc3-5db68409a1ac",
  "expires_at": "2026-10-29T17:12:12.272519964Z",
  "resend_available_at": "2026-10-29T17:07:13.272519964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730087649` → **200**

```json
{
  "phone": "+380730087649",
  "audience": "CLIENT",
  "code": "405947",
  "sent_at": "2026-10-29T17:07:12.276751597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b9188af-95c2-4c6e-acc3-5db68409a1ac",
  "code": "405947",
  "device_ref": "sandbox-23864"
}
```

```json
{
  "session_id": "823c62db-714d-4d39-8861-242529f6a8df",
  "subject": {
    "type": "CLIENT",
    "id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDU1ODJiZi00YzRmLTQxMjgtOWQzNS01MWZhMzQwOGY3ZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTMyLCJpYXQiOjE3OTMyOTM2MzIsImp0aSI6IjI5ZGI2MTBiLTViZmYtNGM0Zi04YWIyLWQxMzc4MjQ4MzMwZSIsInNpZCI6IjgyM2M2MmRiLTcxNGQtNGQzOS04ODYxLTI0MjUyOWY2YThkZiJ9.OUCTnGuvnDGC--ICqprlGMFQ4z1NFq2k3N0waFTMZTc",
  "access_expires_at": "2026-10-29T17:22:12.601605772Z",
  "refresh_token": "h4QZ8FTgrM_qRF3d4k143Cy3OsF4F6AsSnTKhG48Ix0",
  "refresh_expires_at": "2026-11-28T17:07:12.601004743Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "17736bd7-a783-46d2-a0f6-b77ab6b023fa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d118b9e7-0972-4ad4-b686-c25562de4689",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d118b9e7-0972-4ad4-b686-c25562de4689",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1c43400a114fc94e59cc794afe0bf59d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d118b9e7-0972-4ad4-b686-c25562de4689",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730087649"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d118b9e7-0972-4ad4-b686-c25562de4689",
  "expires_at": "2026-10-29T17:37:12.906975Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d118b9e7-0972-4ad4-b686-c25562de4689` → **200**

```json
{
  "id": "d118b9e7-0972-4ad4-b686-c25562de4689",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T17:37:12.906975Z",
  "card": {
    "id": "a9bd909e-1fe0-4926-b1bd-fa91a608e7c1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2352",
    "card_type": "Visa",
    "created_at": "2026-10-29T17:07:13.224542Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a9bd909e-1fe0-4926-b1bd-fa91a608e7c1",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2352",
      "card_type": "Visa",
      "created_at": "2026-10-29T17:07:13.224542Z"
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
  "device_ref": "sandbox-24960"
}
```

```json
{
  "challenge_id": "01834d49-86b0-46f3-b3a4-3ac4d7989514",
  "expires_at": "2026-10-29T17:12:13.837371654Z",
  "resend_available_at": "2026-10-29T17:07:14.837371654Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "583749",
  "sent_at": "2026-10-29T17:07:13.840946441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01834d49-86b0-46f3-b3a4-3ac4d7989514",
  "code": "583749",
  "device_ref": "sandbox-24960"
}
```

```json
{
  "session_id": "08feffe8-a244-4090-8daf-359bc8108e66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDUzNCwiaWF0IjoxNzkzMjkzNjM0LCJqdGkiOiI2ZDI3N2U2Yi01MmJkLTQ2NmUtODcwYy1jYTk4NGFjNzE3NjAiLCJzaWQiOiIwOGZlZmZlOC1hMjQ0LTQwOTAtOGRhZi0zNTliYzgxMDhlNjYifQ.aBmjD9OFF0yDt3cT9SvVCB0LarUoUnKj0hclgoTK4X4",
  "access_expires_at": "2026-10-29T17:22:14.178844237Z",
  "refresh_token": "IuZoSC470hrcvzNWtg053cnoMUI6gk6Z9DBl4bj-6Iw",
  "refresh_expires_at": "2026-11-28T17:07:14.178255872Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:07.922662Z",
  "last_location_at": "2026-10-29T17:07:07.922662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc19355f-759b-4532-8812-ac1e7da1a44e/handover` → **200**

```json
{
  "command_id": "22cdb705-a621-43a7-aabc-39e60ede0d90",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:07.922662Z",
  "last_location_at": "2026-10-29T17:07:07.922662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc19355f-759b-4532-8812-ac1e7da1a44e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:15Z",
    "sequence": 1793293635669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:15.089544Z",
  "last_location_at": "2026-10-29T17:07:15.089544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5a8e5f0c-5e73-4995-9c0c-7ad622265de0",
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
  "id": "702bb3e9-bf7b-4aa2-850f-c1018dbb7e48",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:12:15.401525Z",
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
  "command_id": "8249657a-1508-4603-99d1-daf99ddb4b91",
  "quote_id": "702bb3e9-bf7b-4aa2-850f-c1018dbb7e48",
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
  "id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
  "created_at": "2026-10-29T17:07:15.72185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b` → **200**

```json
{
  "id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
  "created_at": "2026-10-29T17:07:15.72185Z",
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
    "id": "c20f41a5-988b-4350-b33d-d8a1625876e3",
    "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
    "expires_at": "2026-10-29T17:07:30.788024Z",
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

`POST /api/driver/v1/offers/c20f41a5-988b-4350-b33d-d8a1625876e3/accept` → **200**

```json
{
  "command_id": "5dae8cd2-8247-4701-aad7-a78618c1a752"
}
```

```json
{
  "id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "assignment_id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
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

`POST /api/driver/v1/work-sessions/bc19355f-759b-4532-8812-ac1e7da1a44e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:17Z",
    "sequence": 1793293637239
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:17.260967Z",
  "last_location_at": "2026-10-29T17:07:17.260967Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7aa8c788-589e-4515-b12c-e103dacdb3ee/arrive` → **200**

```json
{
  "command_id": "53ca7c2f-7ca2-42a5-8052-96cef1a130b6",
  "expected_version": 0
}
```

```json
{
  "id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "assignment_id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
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
  "arrived_at": "2026-10-29T17:07:17.583076Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7aa8c788-589e-4515-b12c-e103dacdb3ee/start` → **200**

```json
{
  "command_id": "a6dc4a24-7053-47f7-b2ab-8e792fe9551d",
  "expected_version": 1
}
```

```json
{
  "id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "assignment_id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
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
  "arrived_at": "2026-10-29T17:07:17.583076Z",
  "started_at": "2026-10-29T17:07:17.894898Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7aa8c788-589e-4515-b12c-e103dacdb3ee/complete` → **200**

```json
{
  "command_id": "f2aa7971-be9b-47e1-907c-60f96a0e5f1e",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:07:18Z",
  "cash_received": true
}
```

```json
{
  "id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "assignment_id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
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
  "arrived_at": "2026-10-29T17:07:17.583076Z",
  "started_at": "2026-10-29T17:07:17.894898Z",
  "completed_at": "2026-10-29T17:07:18.229075Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b` → **200**

```json
{
  "id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
    "id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
    "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:07:15.72185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b` → **200**

```json
{
  "id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
    "id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
    "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:07:15.72185Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b` → **200**

```json
{
  "id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
    "id": "c34226e3-c0bd-4c40-a555-488ecd5ce650",
    "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7aa8c788-589e-4515-b12c-e103dacdb3ee",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:07:15.72185Z",
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

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b/tip` → **200**

```json
{
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
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
  "available_until": "2026-10-30T17:07:18.229075Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b/tip` → **201**

```json
{
  "command_id": "d6d2e968-c112-4312-9f80-3ea853655b41",
  "amount_minor": 2500
}
```

```json
{
  "id": "e407b9ea-ec0e-4932-b4f3-7e7428e5d4a6",
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T17:07:22.064284Z"
}
```

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b/tip` → **200**

```json
{
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
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
  "available_until": "2026-10-30T17:07:18.229075Z",
  "open": false,
  "tip": {
    "id": "e407b9ea-ec0e-4932-b4f3-7e7428e5d4a6",
    "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T17:07:22.064284Z"
  }
}
```

`GET /api/rider/v1/orders/6ae90c7a-c8e8-4524-ab13-89e90b21709b/tip` → **200**

```json
{
  "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
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
  "available_until": "2026-10-30T17:07:18.229075Z",
  "open": false,
  "tip": {
    "id": "e407b9ea-ec0e-4932-b4f3-7e7428e5d4a6",
    "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T17:07:22.064284Z"
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
      "id": "41672ca6-71a2-4efe-8f13-c280d0b684e5",
      "at": "2026-10-29T17:07:23.960076Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
      "counterpart_id": null
    },
    {
      "id": "e37fd087-7f13-4fce-a4f1-d16a6b239df1",
      "at": "2026-10-29T17:07:18.889877Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7ce77cb7-f305-463e-8b5f-dfde8fa06bed",
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
  "id": "2c0af964-a66c-40e5-a99d-0bf05f5ff4ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:12:24.286443Z",
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
  "session_id": "7847c096-5c8f-4451-a5df-e2ac05fe414e",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1NDQsImlhdCI6MTc5MzI5MzY0NCwianRpIjoiYTk4ZGQ0NmYtMTAzMS00MGU3LWE3MmEtMGZmZjQ4ODE5Mjk1Iiwic2lkIjoiNzg0N2MwOTYtNWM4Zi00NDUxLWE1ZGYtZTJhYzA1ZmU0MTRlIn0.NtG4NtvDAvl48juYBo8HOxkAWCOytfLm4lspb0_-Vng",
  "access_expires_at": "2026-10-29T17:22:24.894133716Z",
  "refresh_token": "0riRCqxs2wIMFNnp5Ie_XcMGr24ErcfTuy8YPxbWqiE",
  "refresh_expires_at": "2026-10-30T05:07:24.893542344Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380730087649` → **200**

```json
{
  "client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0"
}
```

`POST /api/admin/v1/rider-wallets/a05582bf-4c4f-4128-9d35-51fa3408f7d0/top-ups` → **201**

```json
{
  "command_id": "ef6687c2-f216-4120-93a4-c778eaeb81f5",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
      "id": "50625b54-d57d-40d0-94e8-92848ff43b1e",
      "at": "2026-10-29T17:07:25.487432Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4f0bf7e9-fbeb-431f-869a-43a63a7b064a",
  "quote_id": "2c0af964-a66c-40e5-a99d-0bf05f5ff4ab",
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
  "id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
  "created_at": "2026-10-29T17:07:25.802606Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/12f9fc53-63d7-49be-9191-bbb692e70da4` → **200**

```json
{
  "id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
  "created_at": "2026-10-29T17:07:25.802606Z",
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
    "id": "725e9601-bbd3-4619-b401-9303ca0843ae",
    "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
    "expires_at": "2026-10-29T17:07:40.810252Z",
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

`POST /api/driver/v1/offers/725e9601-bbd3-4619-b401-9303ca0843ae/accept` → **200**

```json
{
  "command_id": "df4a5deb-e4e8-4df3-8796-2530d4d7d346"
}
```

```json
{
  "id": "bfa5a675-8f9b-4012-b4dd-e6632f5d45f9",
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f5580901-fb52-43c9-a53f-45a6a3b52d46",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f5580901-fb52-43c9-a53f-45a6a3b52d46",
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "assignment_id": "bfa5a675-8f9b-4012-b4dd-e6632f5d45f9",
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

`POST /api/driver/v1/work-sessions/bc19355f-759b-4532-8812-ac1e7da1a44e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:27Z",
    "sequence": 1793293647334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:27.355889Z",
  "last_location_at": "2026-10-29T17:07:27.355889Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f5580901-fb52-43c9-a53f-45a6a3b52d46/arrive` → **200**

```json
{
  "command_id": "cc4bd6fa-959b-4677-813b-6c73f34a6a29",
  "expected_version": 0
}
```

```json
{
  "id": "f5580901-fb52-43c9-a53f-45a6a3b52d46",
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "assignment_id": "bfa5a675-8f9b-4012-b4dd-e6632f5d45f9",
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
  "arrived_at": "2026-10-29T17:07:27.679024Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f5580901-fb52-43c9-a53f-45a6a3b52d46/start` → **200**

```json
{
  "command_id": "0e743663-cdc4-49dd-a68d-d13ac0e054d5",
  "expected_version": 1
}
```

```json
{
  "id": "f5580901-fb52-43c9-a53f-45a6a3b52d46",
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "assignment_id": "bfa5a675-8f9b-4012-b4dd-e6632f5d45f9",
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
  "arrived_at": "2026-10-29T17:07:27.679024Z",
  "started_at": "2026-10-29T17:07:27.991047Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f5580901-fb52-43c9-a53f-45a6a3b52d46/complete` → **200**

```json
{
  "command_id": "21a2950c-692a-4d48-92e6-94c2c116aad8",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:07:28Z",
  "cash_received": true
}
```

```json
{
  "id": "f5580901-fb52-43c9-a53f-45a6a3b52d46",
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "assignment_id": "bfa5a675-8f9b-4012-b4dd-e6632f5d45f9",
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
  "arrived_at": "2026-10-29T17:07:27.679024Z",
  "started_at": "2026-10-29T17:07:27.991047Z",
  "completed_at": "2026-10-29T17:07:28.309988Z",
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
  "client_id": "a05582bf-4c4f-4128-9d35-51fa3408f7d0",
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
      "id": "50625b54-d57d-40d0-94e8-92848ff43b1e",
      "at": "2026-10-29T17:07:25.487432Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
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

`GET /api/rider/v1/orders/12f9fc53-63d7-49be-9191-bbb692e70da4/tip` → **200**

```json
{
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
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
  "available_until": "2026-10-30T17:07:28.309988Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/12f9fc53-63d7-49be-9191-bbb692e70da4/tip` → **201**

```json
{
  "command_id": "e6f47487-c30b-4bc7-bade-8b8c995d7fab",
  "amount_minor": 2500
}
```

```json
{
  "id": "99dcc2d4-b4f0-425d-8ba3-60a53766b65f",
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T17:07:29.512643Z"
}
```

`GET /api/rider/v1/orders/12f9fc53-63d7-49be-9191-bbb692e70da4/tip` → **200**

```json
{
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
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
  "available_until": "2026-10-30T17:07:28.309988Z",
  "open": false,
  "tip": {
    "id": "99dcc2d4-b4f0-425d-8ba3-60a53766b65f",
    "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T17:07:29.512643Z"
  }
}
```

`GET /api/rider/v1/orders/12f9fc53-63d7-49be-9191-bbb692e70da4/tip` → **200**

```json
{
  "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
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
  "available_until": "2026-10-30T17:07:28.309988Z",
  "open": false,
  "tip": {
    "id": "99dcc2d4-b4f0-425d-8ba3-60a53766b65f",
    "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T17:07:29.512643Z"
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
      "id": "4ddadf9e-bb1e-464a-98da-3861745edb65",
      "at": "2026-10-29T17:07:31.0443Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
      "counterpart_id": null
    },
    {
      "id": "52121fa1-047b-4577-a866-5a26ebb2b931",
      "at": "2026-10-29T17:07:29.015387Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "12f9fc53-63d7-49be-9191-bbb692e70da4",
      "counterpart_id": null
    },
    {
      "id": "41672ca6-71a2-4efe-8f13-c280d0b684e5",
      "at": "2026-10-29T17:07:23.960076Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
      "counterpart_id": null
    },
    {
      "id": "e37fd087-7f13-4fce-a4f1-d16a6b239df1",
      "at": "2026-10-29T17:07:18.889877Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6ae90c7a-c8e8-4524-ab13-89e90b21709b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc19355f-759b-4532-8812-ac1e7da1a44e",
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
  "last_heartbeat_at": "2026-10-29T17:07:27.355889Z",
  "last_location_at": "2026-10-29T17:07:27.355889Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc19355f-759b-4532-8812-ac1e7da1a44e/close` → **200**

```json
{
  "command_id": "b64d48df-255d-413c-ac8f-088ff73c1094",
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

Done: card order 12f9fc53-63d7-49be-9191-bbb692e70da4.

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
  "phone": "+380731574216",
  "device_ref": "sandbox-12108"
}
```

```json
{
  "challenge_id": "c51f874b-06bd-4c05-8bfe-3ec4ac0924ab",
  "expires_at": "2026-10-29T17:12:32.603152113Z",
  "resend_available_at": "2026-10-29T17:07:33.603152113Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731574216` → **200**

```json
{
  "phone": "+380731574216",
  "audience": "CLIENT",
  "code": "055043",
  "sent_at": "2026-10-29T17:07:32.606687824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c51f874b-06bd-4c05-8bfe-3ec4ac0924ab",
  "code": "055043",
  "device_ref": "sandbox-12108"
}
```

```json
{
  "session_id": "a970f4f3-2d1e-4eff-87db-fbe3b38d5ace",
  "subject": {
    "type": "CLIENT",
    "id": "fc499d62-e903-4cbc-bb85-fc51b48722d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzQ5OWQ2Mi1lOTAzLTRjYmMtYmI4NS1mYzUxYjQ4NzIyZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTUyLCJpYXQiOjE3OTMyOTM2NTIsImp0aSI6IjAxNmQ4Mzg5LTUyNDQtNDBhNy1hZDQ2LTc0NDU0NWRmMzA1ZSIsInNpZCI6ImE5NzBmNGYzLTJkMWUtNGVmZi04N2RiLWZiZTNiMzhkNWFjZSJ9.Z_bb4ACJy43blGvX03xjCiK9zocsermqyrp6u6NJlgk",
  "access_expires_at": "2026-10-29T17:22:32.933078594Z",
  "refresh_token": "3nEA3UuzpQXxDrVmkbmQfEnvR5Q9KPQetIAWx6CTwIY",
  "refresh_expires_at": "2026-11-28T17:07:32.932388211Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "555164f1-cae8-4021-9f34-0760d39ab907",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b731df30-0530-453e-92ac-c5480e8c09dd",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b731df30-0530-453e-92ac-c5480e8c09dd",
    "orderDate": "1793293653",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "38102dc9655009ad7b59cd4a039110b8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b731df30-0530-453e-92ac-c5480e8c09dd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731574216"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b731df30-0530-453e-92ac-c5480e8c09dd",
  "created_at": "2026-10-29T17:07:33.233335Z",
  "expires_at": "2026-10-29T17:37:33.233335Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b731df30-0530-453e-92ac-c5480e8c09dd` → **200**

```json
{
  "id": "b731df30-0530-453e-92ac-c5480e8c09dd",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T17:07:33.233335Z",
  "expires_at": "2026-10-29T17:37:33.233335Z",
  "completed_at": "2026-10-29T17:07:33.545794Z",
  "masked_pan": "41****7636",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fc499d62-e903-4cbc-bb85-fc51b48722d3",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fc499d62-e903-4cbc-bb85-fc51b48722d3",
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
      "id": "29d7239a-b786-4cd1-b07e-cf7514f7c6c0",
      "at": "2026-10-29T17:07:34.062752Z",
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
  "client_id": "fc499d62-e903-4cbc-bb85-fc51b48722d3",
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
      "id": "29d7239a-b786-4cd1-b07e-cf7514f7c6c0",
      "at": "2026-10-29T17:07:34.062752Z",
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
  "device_ref": "sandbox-20672"
}
```

```json
{
  "challenge_id": "618f9fb2-65d8-41bb-bfb0-8ed488c2de81",
  "expires_at": "2026-10-29T17:12:35.751260526Z",
  "resend_available_at": "2026-10-29T17:07:36.751260526Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "835923",
  "sent_at": "2026-10-29T17:07:35.754194352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "618f9fb2-65d8-41bb-bfb0-8ed488c2de81",
  "code": "835923",
  "device_ref": "sandbox-20672"
}
```

```json
{
  "session_id": "6db0ec9b-2787-40bc-a255-17e99fa2cfd0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDU1NiwiaWF0IjoxNzkzMjkzNjU2LCJqdGkiOiIyMDc4NjkwOC1mYjYxLTRiNTgtODIxNC0xODRiNTBlMGVlYTEiLCJzaWQiOiI2ZGIwZWM5Yi0yNzg3LTQwYmMtYTI1NS0xN2U5OWZhMmNmZDAifQ.CocUxZR5EcpPsd7zDnT6QH5gLWA7hUjwJQ9cDXp6sXU",
  "access_expires_at": "2026-10-29T17:22:36.072555648Z",
  "refresh_token": "5znCGJtOFjh_16-1Q2Fj_FemzvLWsHUHHLu4kfEAJ4E",
  "refresh_expires_at": "2026-11-28T17:07:36.071578173Z",
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
  "command_id": "d19e574c-e9d9-43a0-8d14-d1f7725baa89",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "afdfb45e-7156-4cad-b228-d113d657140f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-afdfb45e-7156-4cad-b228-d113d657140f",
    "orderDate": "1793293656",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "1472f681e06617dd58e52de1cd08d343",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=afdfb45e-7156-4cad-b228-d113d657140f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=afdfb45e-7156-4cad-b228-d113d657140f",
  "created_at": "2026-10-29T17:07:36.673331Z",
  "expires_at": "2026-10-29T17:37:36.673331Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/afdfb45e-7156-4cad-b228-d113d657140f` → **200**

```json
{
  "id": "afdfb45e-7156-4cad-b228-d113d657140f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T17:07:36.673331Z",
  "expires_at": "2026-10-29T17:37:36.673331Z",
  "completed_at": "2026-10-29T17:07:36.968997Z",
  "masked_pan": "41****7315",
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
      "id": "1b42e06b-5bd9-4c14-84c5-b08b70d900ef",
      "at": "2026-10-29T17:07:37.076527Z",
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
  "command_id": "b5b152c2-5e18-40f2-8f17-821e0afedaca",
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
  "correlation_id": "343c725b-e192-4f2d-8e61-df24c48cd832"
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
  "device_ref": "sandbox-9318"
}
```

```json
{
  "challenge_id": "d7e8d145-2639-497d-9a7d-c2bb48f82fdb",
  "expires_at": "2026-10-29T17:12:37.901664892Z",
  "resend_available_at": "2026-10-29T17:07:38.901664892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "398275",
  "sent_at": "2026-10-29T17:07:37.904736212Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7e8d145-2639-497d-9a7d-c2bb48f82fdb",
  "code": "398275",
  "device_ref": "sandbox-9318"
}
```

```json
{
  "session_id": "e2e81df6-74f0-4f86-a34a-5c418a3e25f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDU1OCwiaWF0IjoxNzkzMjkzNjU4LCJqdGkiOiIyODFkM2I4Ny1kMTdlLTRmM2QtYmEzMy0wZjNkM2MzMTYwYmEiLCJzaWQiOiJlMmU4MWRmNi03NGYwLTRmODYtYTM0YS01YzQxOGEzZTI1ZjUifQ.H0x_RkuT3uJFsgV7MhMCZFVX-lmBRLmiE3E61OcOtsc",
  "access_expires_at": "2026-10-29T17:22:38.226422371Z",
  "refresh_token": "b4BwHLBtI1r7HoSil2jwYP1vTLrsBruYRkfULPqHp8c",
  "refresh_expires_at": "2026-11-28T17:07:38.225784273Z",
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
  "command_id": "cba9fd70-46ba-4501-bcf0-bb445363e88f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:38Z",
    "sequence": 1793293658805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f22a59e-f1ba-4f8f-b2c2-fc6ff2c44705",
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
  "last_heartbeat_at": "2026-10-29T17:07:38.825617Z",
  "last_location_at": "2026-10-29T17:07:38.825617Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630032446",
  "device_ref": "sandbox-22850"
}
```

```json
{
  "challenge_id": "2614bb20-2897-49c4-bf16-7e602f42f679",
  "expires_at": "2026-10-29T17:12:39.134383037Z",
  "resend_available_at": "2026-10-29T17:07:40.134383037Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630032446` → **200**

```json
{
  "phone": "+380630032446",
  "audience": "CLIENT",
  "code": "761922",
  "sent_at": "2026-10-29T17:07:39.137304961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2614bb20-2897-49c4-bf16-7e602f42f679",
  "code": "761922",
  "device_ref": "sandbox-22850"
}
```

```json
{
  "session_id": "fd77d77a-306b-44ac-9d3b-d1db7cb9b74f",
  "subject": {
    "type": "CLIENT",
    "id": "2cc9637f-4375-4609-88c7-c6bb455715e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyY2M5NjM3Zi00Mzc1LTQ2MDktODhjNy1jNmJiNDU1NzE1ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTU5LCJpYXQiOjE3OTMyOTM2NTksImp0aSI6IjUwZDY1M2ZjLWU5MGEtNDU1Zi1iZWRiLWZjZWY0NTlhNTFkYiIsInNpZCI6ImZkNzdkNzdhLTMwNmItNDRhYy05ZDNiLWQxZGI3Y2I5Yjc0ZiJ9.EMLUOzFr1JFdzWgxa4pYa0MTuufbNXfnhOYclyx3xNI",
  "access_expires_at": "2026-10-29T17:22:39.452386304Z",
  "refresh_token": "17QKO8YLrONsK7GFv3gmqPQDxANVjPPiTzYZX0DF9Vc",
  "refresh_expires_at": "2026-11-28T17:07:39.451791997Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f5dcff18-60e0-4569-84df-c9a1d84de8e4",
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
  "id": "4366464c-aa85-4c78-85a8-614a8d6e7952",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:12:39.756581Z",
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
  "command_id": "449dc3c3-86b3-4fde-81de-63f5a61664a1",
  "quote_id": "4366464c-aa85-4c78-85a8-614a8d6e7952",
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
  "id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2cc9637f-4375-4609-88c7-c6bb455715e6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:07:40.05974Z",
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
    "id": "d4e110f2-a854-4f9b-b137-1ff6adda901a",
    "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
    "expires_at": "2026-10-29T17:07:55.063246Z",
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

`POST /api/driver/v1/offers/d4e110f2-a854-4f9b-b137-1ff6adda901a/accept` → **200**

```json
{
  "command_id": "8314361e-463a-483e-8f4f-5dc36abe54a5"
}
```

```json
{
  "id": "9601b45f-2216-4002-a2d8-876bc80f16f8",
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b68f4482-c231-4cd6-9d75-3d8fd5f78b54",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b68f4482-c231-4cd6-9d75-3d8fd5f78b54",
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "assignment_id": "9601b45f-2216-4002-a2d8-876bc80f16f8",
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

`POST /api/driver/v1/work-sessions/0f22a59e-f1ba-4f8f-b2c2-fc6ff2c44705/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:41Z",
    "sequence": 1793293661257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f22a59e-f1ba-4f8f-b2c2-fc6ff2c44705",
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
  "last_heartbeat_at": "2026-10-29T17:07:41.279131Z",
  "last_location_at": "2026-10-29T17:07:41.279131Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b68f4482-c231-4cd6-9d75-3d8fd5f78b54/arrive` → **200**

```json
{
  "command_id": "a6254732-6012-4f31-ae9b-b2dca962a69d",
  "expected_version": 0
}
```

```json
{
  "id": "b68f4482-c231-4cd6-9d75-3d8fd5f78b54",
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "assignment_id": "9601b45f-2216-4002-a2d8-876bc80f16f8",
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
  "arrived_at": "2026-10-29T17:07:41.592787Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b68f4482-c231-4cd6-9d75-3d8fd5f78b54/start` → **200**

```json
{
  "command_id": "273154c8-7eee-4e7e-af85-e500780030eb",
  "expected_version": 1
}
```

```json
{
  "id": "b68f4482-c231-4cd6-9d75-3d8fd5f78b54",
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "assignment_id": "9601b45f-2216-4002-a2d8-876bc80f16f8",
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
  "arrived_at": "2026-10-29T17:07:41.592787Z",
  "started_at": "2026-10-29T17:07:41.901006Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b68f4482-c231-4cd6-9d75-3d8fd5f78b54/complete` → **200**

```json
{
  "command_id": "9ab30bff-ba40-40b0-ae54-4b150831c8c5",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:07:42Z",
  "cash_received": false
}
```

```json
{
  "id": "b68f4482-c231-4cd6-9d75-3d8fd5f78b54",
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "assignment_id": "9601b45f-2216-4002-a2d8-876bc80f16f8",
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
  "arrived_at": "2026-10-29T17:07:41.592787Z",
  "started_at": "2026-10-29T17:07:41.901006Z",
  "completed_at": "2026-10-29T17:07:42.210211Z",
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
  "session_id": "7f45dc7e-e184-4c75-9dc5-c6a7dc4f4a22",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1NjIsImlhdCI6MTc5MzI5MzY2MiwianRpIjoiMTkzZmNjZTItZWQ3OC00ZmExLWE4ZTAtOTEzMTM1OWMyYjQ0Iiwic2lkIjoiN2Y0NWRjN2UtZTE4NC00Yzc1LTlkYzUtYzZhN2RjNGY0YTIyIn0.TnHxFx69RKvjtCBocxXlNjc-uCo6ZDJzJ0TrkKosxSk",
  "access_expires_at": "2026-10-29T17:22:42.817225562Z",
  "refresh_token": "wEQMUDyEkJM2Bqh4yryL9l1hDsaCGwIspYrY2lH905o",
  "refresh_expires_at": "2026-10-30T05:07:42.816678283Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7140a2a8-b345-445d-87b0-faf8abb39f4f"
}
```

`GET /api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute` → **200**

```json
{
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2cc9637f-4375-4609-88c7-c6bb455715e6",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T17:07:43.157086Z",
  "decide_by": "2026-11-12T17:07:43.157086Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T17:07:43.157086Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2cc9637f-4375-4609-88c7-c6bb455715e6",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T17:07:43.157086Z",
      "decide_by": "2026-11-12T17:07:43.157086Z",
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

`POST /api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute/decide` → **400**

```json
{
  "command_id": "b90d8440-8188-46dd-bc2c-914269439526",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9978287a-79ea-4d10-b10e-14fc84a3b8fe",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute/decide` → **200**

```json
{
  "command_id": "59361776-9a11-4279-9860-966a90101639",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2cc9637f-4375-4609-88c7-c6bb455715e6",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T17:07:43.157086Z",
  "decide_by": "2026-11-12T17:07:43.157086Z",
  "decision": "PAY_DRIVER",
  "decided_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T17:07:45.380879Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute/decide` → **409**

```json
{
  "command_id": "cacd0e1d-6a72-424f-a618-d4e42c280a5a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6f9ce324-0eec-4d0b-a50e-0d9e677775ae/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "77fac60c-0cc2-4e0b-b56e-0b35432d85b8"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f22a59e-f1ba-4f8f-b2c2-fc6ff2c44705",
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
  "last_heartbeat_at": "2026-10-29T17:07:41.279131Z",
  "last_location_at": "2026-10-29T17:07:41.279131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0f22a59e-f1ba-4f8f-b2c2-fc6ff2c44705/close` → **200**

```json
{
  "command_id": "61ad06e3-4f14-45f9-b08b-5844291563e3",
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
  "phone": "+380735589503",
  "device_ref": "sandbox-30147"
}
```

```json
{
  "challenge_id": "73cb791a-4d66-4518-82a3-325b0c7d8836",
  "expires_at": "2026-10-29T17:12:46.588787561Z",
  "resend_available_at": "2026-10-29T17:07:47.588787561Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735589503` → **200**

```json
{
  "phone": "+380735589503",
  "audience": "CLIENT",
  "code": "055432",
  "sent_at": "2026-10-29T17:07:46.591616432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73cb791a-4d66-4518-82a3-325b0c7d8836",
  "code": "055432",
  "device_ref": "sandbox-30147"
}
```

```json
{
  "session_id": "6edb9305-542c-433c-b6bf-33360fdd05b9",
  "subject": {
    "type": "CLIENT",
    "id": "fc6fa977-693e-4788-b303-5c4300c8dcaa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzZmYTk3Ny02OTNlLTQ3ODgtYjMwMy01YzQzMDBjOGRjYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTY2LCJpYXQiOjE3OTMyOTM2NjYsImp0aSI6ImYyMzkyNjllLWZmMzktNDk5Ny1hMjc1LTU3MjViYWNmNzQ3NCIsInNpZCI6IjZlZGI5MzA1LTU0MmMtNDMzYy1iNmJmLTMzMzYwZmRkMDViOSJ9.JxCFFDNmX1f9PithkLnE9zErfm44h7lRsMdLzwQGFW4",
  "access_expires_at": "2026-10-29T17:22:46.915390584Z",
  "refresh_token": "RCnroqpcITBFa4xhJOU16VxMs588747dBIyC377pzdE",
  "refresh_expires_at": "2026-11-28T17:07:46.914825353Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "22762a93-74cb-4b6f-be67-79de154ae1ce",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f583a3ed-b847-42c5-8991-481fa07ade73",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f583a3ed-b847-42c5-8991-481fa07ade73",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "efa5edac4902509b56cc712b917486f2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f583a3ed-b847-42c5-8991-481fa07ade73",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735589503"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f583a3ed-b847-42c5-8991-481fa07ade73",
  "expires_at": "2026-10-29T17:37:47.208969Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/f583a3ed-b847-42c5-8991-481fa07ade73` → **200**

```json
{
  "id": "f583a3ed-b847-42c5-8991-481fa07ade73",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T17:37:47.208969Z",
  "card": {
    "id": "6825f72b-56a9-4bf4-9933-a8d259cd2c3c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9301",
    "card_type": "Visa",
    "created_at": "2026-10-29T17:07:47.512886Z"
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
  "device_ref": "sandbox-30752"
}
```

```json
{
  "challenge_id": "80bf6412-40a2-4d6e-8dc5-dee8c2431cc1",
  "expires_at": "2026-10-29T17:12:47.848099289Z",
  "resend_available_at": "2026-10-29T17:07:48.848099289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "753970",
  "sent_at": "2026-10-29T17:07:47.853654967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80bf6412-40a2-4d6e-8dc5-dee8c2431cc1",
  "code": "753970",
  "device_ref": "sandbox-30752"
}
```

```json
{
  "session_id": "8078499e-42e2-4923-b4c7-9b1b31188af5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDU2OCwiaWF0IjoxNzkzMjkzNjY4LCJqdGkiOiI5MThlNjA2ZC0zMjYzLTQ0ZGUtOGRlNC03MzAyMWU5NDEwZjciLCJzaWQiOiI4MDc4NDk5ZS00MmUyLTQ5MjMtYjRjNy05YjFiMzExODhhZjUifQ.skE4BYBGkHxHIhoWpGFuCMgABAiXkCQnU-W_x1xr3-0",
  "access_expires_at": "2026-10-29T17:22:48.178186953Z",
  "refresh_token": "knl623jpC3EVNuC8i_0I24WyhNahyQ3JX4RMxpLcJb4",
  "refresh_expires_at": "2026-11-28T17:07:48.177521433Z",
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
  "command_id": "ec4d8243-c7b9-4ea1-9f7b-81b59c4d748e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:48Z",
    "sequence": 1793293668767
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "01caa742-8dff-4676-9757-4ac7b6a2eb44",
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
  "last_heartbeat_at": "2026-10-29T17:07:48.787572Z",
  "last_location_at": "2026-10-29T17:07:48.787572Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc07b267-2c13-49eb-8de1-638192f00ef2",
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
  "id": "f51337de-a600-470b-a72a-afb61711b9ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:12:49.091677Z",
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
  "command_id": "93da1b63-4e05-429a-a903-58a7960f04a2",
  "quote_id": "f51337de-a600-470b-a72a-afb61711b9ba",
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
  "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
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
  "created_at": "2026-10-29T17:07:49.433243Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545` → **200**

```json
{
  "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
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
  "created_at": "2026-10-29T17:07:49.433243Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545` → **200**

```json
{
  "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
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
  "created_at": "2026-10-29T17:07:49.433243Z",
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
    "id": "0d36879d-58f6-4b30-b4e4-1eb0660ff6bd",
    "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
    "expires_at": "2026-10-29T17:08:05.21451Z",
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

`POST /api/driver/v1/offers/0d36879d-58f6-4b30-b4e4-1eb0660ff6bd/accept` → **200**

```json
{
  "command_id": "801909f6-fdf6-41b7-b388-ee0cb238ed25"
}
```

```json
{
  "id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "assignment_id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
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

`POST /api/rider/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/messages` → **201**

```json
{
  "command_id": "475f256e-2fb8-4db3-902a-98b0dbf08039",
  "body": "Я біля входу, мій номер +380735589503, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "3da54acb-69bf-4de4-b035-83cbfd0cff8b",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735589503, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T17:07:52.29294938Z"
}
```

`POST /api/driver/v1/trips/a7e86658-78e7-4ab0-b100-98407ee079f0/messages` → **201**

```json
{
  "command_id": "b7c87729-bfdd-4f5d-b3cc-910dc95c7104",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "01fce2b2-74aa-4d88-acb0-4ce1131502de",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T17:07:52.598006349Z"
}
```

`POST /api/driver/v1/work-sessions/01caa742-8dff-4676-9757-4ac7b6a2eb44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:52Z",
    "sequence": 1793293672875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "01caa742-8dff-4676-9757-4ac7b6a2eb44",
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
  "last_heartbeat_at": "2026-10-29T17:07:52.90048Z",
  "last_location_at": "2026-10-29T17:07:52.90048Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a7e86658-78e7-4ab0-b100-98407ee079f0/arrive` → **200**

```json
{
  "command_id": "b1d032cf-4264-4f8c-860f-3124d4898b44",
  "expected_version": 0
}
```

```json
{
  "id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "assignment_id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
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
  "arrived_at": "2026-10-29T17:07:53.205169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a7e86658-78e7-4ab0-b100-98407ee079f0/start` → **200**

```json
{
  "command_id": "e9b73f76-ddbd-480f-a056-46e768028536",
  "expected_version": 1
}
```

```json
{
  "id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "assignment_id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
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
  "arrived_at": "2026-10-29T17:07:53.205169Z",
  "started_at": "2026-10-29T17:07:53.512084Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/01caa742-8dff-4676-9757-4ac7b6a2eb44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:07:53Z",
    "sequence": 1793293673811
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "01caa742-8dff-4676-9757-4ac7b6a2eb44",
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
  "last_heartbeat_at": "2026-10-29T17:07:53.832878Z",
  "last_location_at": "2026-10-29T17:07:53.832878Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a7e86658-78e7-4ab0-b100-98407ee079f0/complete` → **200**

```json
{
  "command_id": "63cd31db-1499-4e36-9536-47b8bc85fd62",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:07:54Z",
  "cash_received": false
}
```

```json
{
  "id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "assignment_id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
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
  "arrived_at": "2026-10-29T17:07:53.205169Z",
  "started_at": "2026-10-29T17:07:53.512084Z",
  "completed_at": "2026-10-29T17:07:54.138787Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545` → **200**

```json
{
  "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
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
    "id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
    "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:07:49.433243Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545` → **200**

```json
{
  "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
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
    "id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
    "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:07:49.433243Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545` → **200**

```json
{
  "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
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
    "id": "b017a38e-57f2-42b3-97f0-6d8d5ba2e1bc",
    "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a7e86658-78e7-4ab0-b100-98407ee079f0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:07:49.433243Z",
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
  "session_id": "01caa742-8dff-4676-9757-4ac7b6a2eb44",
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
  "last_heartbeat_at": "2026-10-29T17:07:53.832878Z",
  "last_location_at": "2026-10-29T17:07:53.832878Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01caa742-8dff-4676-9757-4ac7b6a2eb44/close` → **200**

```json
{
  "command_id": "fc9a7a58-c1b5-47b6-afcf-d101ea9fa657",
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
  "session_id": "967fa950-0762-49a8-881b-6fa47f8c4618",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1NzgsImlhdCI6MTc5MzI5MzY3OCwianRpIjoiYjZlMjQwMWItMjBhMi00ZTA5LTk5YWEtN2YzMjY1MDRiNTNlIiwic2lkIjoiOTY3ZmE5NTAtMDc2Mi00OWE4LTg4MWItNmZhNDdmOGM0NjE4In0.g2Wal4iG-qAwsUB4G5aZdx2z2pNq4lKoPMF9sKMnnz8",
  "access_expires_at": "2026-10-29T17:22:58.276455853Z",
  "refresh_token": "Typ4q_JH3pZYfxd5sodNitOYViAGv1RfRAsSR_zdrvc",
  "refresh_expires_at": "2026-10-30T05:07:58.275887935Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "cef96375-ed84-4cb6-9697-859f8e76a267"
}
```

`GET /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T17:07:58.862961621Z",
  "order": {
    "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
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
    "created_at": "2026-10-29T17:07:49.433243Z",
    "assigned_at": "2026-10-29T17:07:51.700904Z",
    "arrived_at": "2026-10-29T17:07:53.205169Z",
    "started_at": "2026-10-29T17:07:53.512084Z",
    "completed_at": "2026-10-29T17:07:54.138787Z"
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
    "id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
    "registered_at": "2026-10-29T17:07:46.912968Z",
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
      "created_at": "2026-10-29T17:07:49.436474Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T17:07:54.290929Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks` → **422**

```json
{
  "command_id": "11fc1645-0b09-4632-9d71-3e8fd758b7c5",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "bacc4527-2fd3-42c0-a4d1-a5a12b8c2aec"
}
```

`POST /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks` → **201**

```json
{
  "command_id": "38ed6d25-21c0-4273-8c80-454104c882a8",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "8119793e-a3c3-4036-8564-bbb05a9e4094",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T17:07:59.552691Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks` → **201**

```json
{
  "command_id": "38ed6d25-21c0-4273-8c80-454104c882a8",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "8119793e-a3c3-4036-8564-bbb05a9e4094",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T17:07:59.552691Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/fc6fa977-693e-4788-b303-5c4300c8dcaa` → **200**

```json
{
  "client": {
    "id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
    "phone": "+380735589503",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:07:46.912968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:07:49.433243Z",
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

`GET /api/admin/v1/clients/fc6fa977-693e-4788-b303-5c4300c8dcaa` → **200**

```json
{
  "client": {
    "id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
    "phone": "+380735589503",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:07:46.912968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:07:49.433243Z",
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

`POST /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks/8119793e-a3c3-4036-8564-bbb05a9e4094/resolve` → **200**

```json
{
  "command_id": "36971edf-a33a-483e-930b-20b310d45834",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "8119793e-a3c3-4036-8564-bbb05a9e4094",
  "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T17:07:59.552691Z",
  "resolved_at": "2026-10-29T17:08:01.836292Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/fc6fa977-693e-4788-b303-5c4300c8dcaa` → **200**

```json
{
  "client": {
    "id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
    "phone": "+380735589503",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:07:46.912968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:07:49.433243Z",
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

`GET /api/admin/v1/clients/fc6fa977-693e-4788-b303-5c4300c8dcaa` → **200**

```json
{
  "client": {
    "id": "fc6fa977-693e-4788-b303-5c4300c8dcaa",
    "phone": "+380735589503",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:07:46.912968Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:07:49.433243Z",
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

`POST /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks/8119793e-a3c3-4036-8564-bbb05a9e4094/resolve` → **409**

```json
{
  "command_id": "ccc14c61-1671-484c-a0ca-61bb61ebb98b",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks/8119793e-a3c3-4036-8564-bbb05a9e4094/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "09a01b1e-ff09-417a-81d5-5964e6d39ab2"
}
```

`GET /api/admin/v1/orders/30fb9560-3a93-49c9-8541-f8b375bc8545/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "8119793e-a3c3-4036-8564-bbb05a9e4094",
      "order_id": "30fb9560-3a93-49c9-8541-f8b375bc8545",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T17:07:59.552691Z",
      "resolved_at": "2026-10-29T17:08:01.836292Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 30fb9560-3a93-49c9-8541-f8b375bc8545 without phone or card digits; chargeback 8119793e-a3c3-4036-8564-bbb05a9e4094 recorded and won.

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
  "session_id": "8d370166-868b-4a84-b772-26e74edeaed6",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1ODQsImlhdCI6MTc5MzI5MzY4NCwianRpIjoiM2NhMGQyN2UtOGRmNy00OThmLWFiNGEtY2UxMWYwZjNiYWE2Iiwic2lkIjoiOGQzNzAxNjYtODY4Yi00YTg0LWI3NzItMjZlNzRlZGVhZWQ2In0.IJVM4jQ6r8B1vQ0F82G4HABw90vsy47YoWPlMcZ1nuo",
  "access_expires_at": "2026-10-29T17:23:04.981193888Z",
  "refresh_token": "dt0WJX1STVV7zZnlBBK4fHFR38eiL2j8HjPSeX3poo8",
  "refresh_expires_at": "2026-10-30T05:08:04.980553104Z",
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
  "phone": "+48600748784",
  "device_ref": "sandbox-6541"
}
```

```json
{
  "challenge_id": "9292414e-0c79-4717-9626-9958a719e461",
  "expires_at": "2026-10-29T17:13:05.867796308Z",
  "resend_available_at": "2026-10-29T17:08:06.867796308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600748784` → **200**

```json
{
  "phone": "+48600748784",
  "audience": "CLIENT",
  "code": "016786",
  "sent_at": "2026-10-29T17:08:05.870365445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9292414e-0c79-4717-9626-9958a719e461",
  "code": "016786",
  "device_ref": "sandbox-6541"
}
```

```json
{
  "session_id": "a37962bd-56bd-4b20-a5d3-d0dcfc1b021f",
  "subject": {
    "type": "CLIENT",
    "id": "d954b5d2-1783-4a6e-b762-2c1b3eb7480e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTU0YjVkMi0xNzgzLTRhNmUtYjc2Mi0yYzFiM2ViNzQ4MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTg2LCJpYXQiOjE3OTMyOTM2ODYsImp0aSI6IjI4MzVhOTQxLTM2YjMtNDM4Yi05OTQxLWFhYzdjMDYxNDU4OCIsInNpZCI6ImEzNzk2MmJkLTU2YmQtNGIyMC1hNWQzLWQwZGNmYzFiMDIxZiJ9.awhbwWLf7enOrs4W4PdBnpJHTKt7G08Sa0_ueG6sMN8",
  "access_expires_at": "2026-10-29T17:23:06.186843026Z",
  "refresh_token": "umy2WEKr1Et1frr0DovdKHiZAJflQPf87gNmiQYylRY",
  "refresh_expires_at": "2026-11-28T17:08:06.186301367Z",
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
  "command_id": "0ad9acad-0b64-4776-99d3-25c424dde1fe",
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
  "correlation_id": "23481bcc-f984-4d8c-a4ce-f7b3f893e6d4",
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
  "command_id": "eff4c993-8690-484d-83e8-953390a61c7d",
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
  "paused_at": "2026-10-29T17:08:07.352779065Z",
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
  "command_id": "3234fe31-9e7f-40d9-9cb9-823a93f132da",
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
  "id": "43bb7809-d6c1-4fdc-b85a-e15aa89b0abc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:07.971858Z",
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
  "command_id": "47b19436-21d3-4bbc-a39b-69f64feb4e24",
  "quote_id": "43bb7809-d6c1-4fdc-b85a-e15aa89b0abc",
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
  "correlation_id": "c8276d1d-4ee3-45e7-9a8c-dceda09def70"
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
  "paused_at": "2026-10-29T17:08:07.352779Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "d794d0cb-b161-4771-8359-eb0e76687f16",
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
  "command_id": "9d68ca58-8843-4b39-a0ec-d3be2e491a55",
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
  "command_id": "789ab8c4-ffd1-42b9-824b-40a95093d3f5",
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
  "id": "979be389-5410-40fc-b2f9-0b7cdb9e6c8b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:09.804596Z",
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
  "command_id": "ef9d9823-63a5-4f01-a2aa-36496d35b305",
  "quote_id": "979be389-5410-40fc-b2f9-0b7cdb9e6c8b",
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
  "correlation_id": "d69fcce3-c764-4fbf-8b42-f53623faf28b"
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
  "command_id": "7273f702-66f2-4c2a-8300-13cb39ea367f",
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
      "from": "20:00",
      "to": "21:00"
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
      "from": "20:00",
      "to": "21:00"
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
  "command_id": "425f7e9e-ebd2-4db2-8a49-0b85b3f89616",
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
  "id": "4933826f-04b5-444c-8724-edc79a434c46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:11.026126Z",
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
  "command_id": "114ea7cb-7a91-44be-8bda-b91b931599ae",
  "quote_id": "4933826f-04b5-444c-8724-edc79a434c46",
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
  "correlation_id": "b5b812a8-e99e-456d-b917-3cdff5996d68"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "f68d20a8-6133-445d-841a-848bfa2a106e",
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
  "correlation_id": "faba271a-e661-4d19-be05-04eee322afdd"
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
      "from": "20:00",
      "to": "21:00"
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
  "command_id": "35761c61-1577-49a0-9c31-78a4bb88bce9",
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
  "phone": "+380670459467",
  "device_ref": "sandbox-14763"
}
```

```json
{
  "challenge_id": "31f967e8-4eb8-4694-9b69-10302f035a0b",
  "expires_at": "2026-10-29T17:13:12.576794386Z",
  "resend_available_at": "2026-10-29T17:08:13.576794386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670459467` → **200**

```json
{
  "phone": "+380670459467",
  "audience": "CLIENT",
  "code": "674419",
  "sent_at": "2026-10-29T17:08:12.579134638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31f967e8-4eb8-4694-9b69-10302f035a0b",
  "code": "674419",
  "device_ref": "sandbox-14763"
}
```

```json
{
  "session_id": "dbb9a5ab-f398-4df4-9dcb-f026289a77f3",
  "subject": {
    "type": "CLIENT",
    "id": "617ad0d2-a11e-4504-ba88-be504d163850"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTdhZDBkMi1hMTFlLTQ1MDQtYmE4OC1iZTUwNGQxNjM4NTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTkyLCJpYXQiOjE3OTMyOTM2OTIsImp0aSI6IjgyZWZiNDE3LWI4MzYtNGE3OS1hYzkwLThmNDViMjk3Yjg3NyIsInNpZCI6ImRiYjlhNWFiLWYzOTgtNGRmNC05ZGNiLWYwMjYyODlhNzdmMyJ9.1EFD_9-jCgRN4-Joc8WFx4aPQaIgAR4llM1eQa5vAeg",
  "access_expires_at": "2026-10-29T17:23:12.904087857Z",
  "refresh_token": "qS6x-zZi1P07lEydBEQ6wNDBaGrw2HoCN5pbH8oop3I",
  "refresh_expires_at": "2026-11-28T17:08:12.903486676Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "617ad0d2-a11e-4504-ba88-be504d163850",
  "session_id": "dbb9a5ab-f398-4df4-9dcb-f026289a77f3",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ed14016-abb4-4ed5-80df-41ff99bc0ad1",
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
  "id": "f0f8bacf-25cb-4bd9-8a45-f5cd62949020",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:13.508507Z",
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
  "challenge_id": "308a1519-5086-451b-89e1-263438fce0b4",
  "expires_at": "2026-10-29T17:13:15.806496551Z",
  "resend_available_at": "2026-10-29T17:08:16.806496551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670459467` → **200**

```json
{
  "phone": "+380670459467",
  "audience": "CLIENT",
  "code": "084518",
  "sent_at": "2026-10-29T17:08:15.809021666Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ef1641ac-7f6b-4baf-a350-d206a2c7c3d6",
  "challenge_id": "308a1519-5086-451b-89e1-263438fce0b4",
  "otp_code": "084518"
}
```

```json
{
  "client_id": "617ad0d2-a11e-4504-ba88-be504d163850",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T17:08:16.144003199Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "1b6eebf3-9065-41b6-81ba-52288ce0228e",
  "quote_id": "f0f8bacf-25cb-4bd9-8a45-f5cd62949020",
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
  "correlation_id": "3078b54b-92f3-4262-b685-d987a362fed4"
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
  "session_id": "353bb282-4d8b-49cd-a6c3-0b82c0b4a190",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1OTcsImlhdCI6MTc5MzI5MzY5NywianRpIjoiZTc4NGU4NGEtMGJlOS00YTY0LTlhYWYtNGY1YmVjYjVhM2IyIiwic2lkIjoiMzUzYmIyODItNGQ4Yi00OWNkLWE2YzMtMGI4MmMwYjRhMTkwIn0.n-u80mMgg_pZcJqu5Apm2LOpNVYlz86hYUJb5KYT0u8",
  "access_expires_at": "2026-10-29T17:23:17.036702603Z",
  "refresh_token": "aPL2yM90Q549IIxpemLYksIrdGz8MMeA7AbwkKc8Iyc",
  "refresh_expires_at": "2026-10-30T05:08:17.03604128Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "617ad0d2-a11e-4504-ba88-be504d163850",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T17:08:16.144003Z",
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

`POST /api/admin/v1/client-deletions/617ad0d2-a11e-4504-ba88-be504d163850/complete` → **200**

```json
{
  "command_id": "7fc120e2-b1f7-4989-bdcd-f5108d94925a",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "617ad0d2-a11e-4504-ba88-be504d163850",
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
  "correlation_id": "75d23d21-1519-4765-9da7-0dd230bed65a"
}
```

Done: client 617ad0d2-a11e-4504-ba88-be504d163850 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668415569",
  "device_ref": "sandbox-23291"
}
```

```json
{
  "challenge_id": "b9ede748-3e89-4597-8892-a1bb431ceb87",
  "expires_at": "2026-10-29T17:13:18.243841589Z",
  "resend_available_at": "2026-10-29T17:08:19.243841589Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668415569` → **200**

```json
{
  "phone": "+380668415569",
  "audience": "CLIENT",
  "code": "612444",
  "sent_at": "2026-10-29T17:08:18.247590174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9ede748-3e89-4597-8892-a1bb431ceb87",
  "code": "612444",
  "device_ref": "sandbox-23291"
}
```

```json
{
  "session_id": "9bf3060f-46e5-4924-8e91-757df5f9fcac",
  "subject": {
    "type": "CLIENT",
    "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTNkNWI1Yi1kNjFjLTRiZmEtOWRmOS1lNzFkNjIwOTc5MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NTk4LCJpYXQiOjE3OTMyOTM2OTgsImp0aSI6IjIyYmFlOTQ4LTA5NjAtNGJlYS04ZjkyLTUxNTZkNjA5ZDM0MiIsInNpZCI6IjliZjMwNjBmLTQ2ZTUtNDkyNC04ZTkxLTc1N2RmNWY5ZmNhYyJ9.YD_stEnUYLOXD3HipVjoV8GrBMVn4qlaCdPDHJeJL2g",
  "access_expires_at": "2026-10-29T17:23:18.585687849Z",
  "refresh_token": "cPrPLd1J3vw-OQ80Q7gBTiroAaGelp9KNVTqqWRlTgs",
  "refresh_expires_at": "2026-11-28T17:08:18.585024135Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
  "session_id": "9bf3060f-46e5-4924-8e91-757df5f9fcac",
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
  "session_id": "d1b4552a-2e61-4936-8a16-c48394e39a33",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ1OTksImlhdCI6MTc5MzI5MzY5OSwianRpIjoiZmQwMTYyOGItZjc2NS00NmU4LTg4NTEtZTg3ODE2N2FmZDU3Iiwic2lkIjoiZDFiNDU1MmEtMmU2MS00OTM2LThhMTYtYzQ4Mzk0ZTM5YTMzIn0.zlx6TnHlx_MJw7pGyN5nlV8hOaB-QTEv2KqGksYy14Q",
  "access_expires_at": "2026-10-29T17:23:19.463357734Z",
  "refresh_token": "jyr_BCC9MMBD1jDPFcGeSuNJAK8YqspMl7OWx_o2tiA",
  "refresh_expires_at": "2026-10-30T05:08:19.462839608Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8415569&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
      "phone": "+380668415569",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T17:08:18.583103Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/293d5b5b-d61c-4bfa-9df9-e71d62097905` → **200**

```json
{
  "client": {
    "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
    "phone": "+380668415569",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:08:18.583103Z",
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

`POST /api/admin/v1/clients/293d5b5b-d61c-4bfa-9df9-e71d62097905/block` → **400**

```json
{
  "command_id": "70a4e8a4-2fa6-4765-9ded-cf0d0badbc53",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/293d5b5b-d61c-4bfa-9df9-e71d62097905/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ced62110-9b9d-437c-81ef-82ac78bf3b78",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/293d5b5b-d61c-4bfa-9df9-e71d62097905/block` → **200**

```json
{
  "command_id": "d64b0056-074b-46a9-afa4-46977433d8c2",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
  "phone": "+380668415569",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T17:08:18.583103Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T17:08:20.714295Z",
    "by": "697d7752-12ef-4441-aa96-d99cb503c95e"
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
  "correlation_id": "85912fb7-c216-440e-b2fd-6cb898aa6803"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668415569",
  "device_ref": "sandbox-6076"
}
```

```json
{
  "challenge_id": "ef5d1f6b-370e-4b20-8605-13615ba78114",
  "expires_at": "2026-10-29T17:13:23.311737981Z",
  "resend_available_at": "2026-10-29T17:08:24.311737981Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668415569` → **200**

```json
{
  "phone": "+380668415569",
  "audience": "CLIENT",
  "code": "432599",
  "sent_at": "2026-10-29T17:08:23.314775524Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "ef5d1f6b-370e-4b20-8605-13615ba78114",
  "code": "432599",
  "device_ref": "sandbox-6076"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "5ec606ea-cc43-4899-a376-2bd3dfe28359"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/293d5b5b-d61c-4bfa-9df9-e71d62097905` → **200**

```json
{
  "client": {
    "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
    "phone": "+380668415569",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T17:08:18.583103Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T17:08:20.714295Z",
      "by": "697d7752-12ef-4441-aa96-d99cb503c95e"
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

`POST /api/admin/v1/clients/293d5b5b-d61c-4bfa-9df9-e71d62097905/unblock` → **200**

```json
{
  "command_id": "5e536c10-9af5-4273-ae02-2d39cdecd693",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
  "phone": "+380668415569",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T17:08:18.583103Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668415569",
  "device_ref": "sandbox-3162"
}
```

```json
{
  "challenge_id": "1d2e7abb-a21e-40d4-98c0-067d11126ac8",
  "expires_at": "2026-10-29T17:13:26.58406255Z",
  "resend_available_at": "2026-10-29T17:08:27.58406255Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668415569` → **200**

```json
{
  "phone": "+380668415569",
  "audience": "CLIENT",
  "code": "884562",
  "sent_at": "2026-10-29T17:08:26.586970834Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d2e7abb-a21e-40d4-98c0-067d11126ac8",
  "code": "884562",
  "device_ref": "sandbox-3162"
}
```

```json
{
  "session_id": "11fee65f-b7c0-4b48-af44-65d25cc2cfcc",
  "subject": {
    "type": "CLIENT",
    "id": "293d5b5b-d61c-4bfa-9df9-e71d62097905"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTNkNWI1Yi1kNjFjLTRiZmEtOWRmOS1lNzFkNjIwOTc5MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjA2LCJpYXQiOjE3OTMyOTM3MDYsImp0aSI6ImMzMTY1ZTI2LWQyMzEtNGJjMC1hODhlLThhNGJjZGIzY2ZiYiIsInNpZCI6IjExZmVlNjVmLWI3YzAtNGI0OC1hZjQ0LTY1ZDI1Y2MyY2ZjYyJ9.Wd6WwsQgkatdnajZix4uh-do3hibmA9AoKQ1MajoSX8",
  "access_expires_at": "2026-10-29T17:23:26.904290033Z",
  "refresh_token": "zQFBaFvsEj4Tpay7Tl-5QGE145NsSIhwfOApB0kr0Xs",
  "refresh_expires_at": "2026-11-28T17:08:26.903780223Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "293d5b5b-d61c-4bfa-9df9-e71d62097905",
  "session_id": "11fee65f-b7c0-4b48-af44-65d25cc2cfcc",
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
  "phone": "+380665513764",
  "device_ref": "sandbox-30009"
}
```

```json
{
  "challenge_id": "a0c2cfb4-1bfd-49fb-95f9-95caf6a8d7cd",
  "expires_at": "2026-10-29T17:13:27.503329951Z",
  "resend_available_at": "2026-10-29T17:08:28.503329951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665513764` → **200**

```json
{
  "phone": "+380665513764",
  "audience": "CLIENT",
  "code": "521926",
  "sent_at": "2026-10-29T17:08:27.506124572Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0c2cfb4-1bfd-49fb-95f9-95caf6a8d7cd",
  "code": "521926",
  "device_ref": "sandbox-30009"
}
```

```json
{
  "session_id": "95bd3040-e4b5-4d37-97cd-e1c725b8aed5",
  "subject": {
    "type": "CLIENT",
    "id": "559a9acb-f21a-40df-86f8-fe165f1c6015"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTlhOWFjYi1mMjFhLTQwZGYtODZmOC1mZTE2NWYxYzYwMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjA3LCJpYXQiOjE3OTMyOTM3MDcsImp0aSI6ImE2NTAyZDAyLTQ3NzUtNGU5ZC04MzI2LTU5NTA2NzkzNmQxMSIsInNpZCI6Ijk1YmQzMDQwLWU0YjUtNGQzNy05N2NkLWUxYzcyNWI4YWVkNSJ9.AcvHvXQK_p_Dome5iG9U1v5azorIuYMVnIx7obG68JE",
  "access_expires_at": "2026-10-29T17:23:27.837989698Z",
  "refresh_token": "tVa8hMDyrkKUxlG6mWLJ5g8d6H4uwFPWlqyhaBAQPW0",
  "refresh_expires_at": "2026-11-28T17:08:27.837340479Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aac5c0b0-2727-4fe2-99b2-a80cce5b5d25",
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
  "id": "1edb766b-026a-4167-bd7c-0625de46ccff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:28.128890Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 6d3a7933-83fa-4e79-bdf8-12fcf012fb9e) → **201**

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
  "session_id": "8645bdd6-7573-4034-a288-586bf5b7d8bf",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2MDgsImlhdCI6MTc5MzI5MzcwOCwianRpIjoiZjRkNDhhYmQtNjQyMi00MGM2LThjZTUtMjMzZjdkZmVhN2EyIiwic2lkIjoiODY0NWJkZDYtNzU3My00MDM0LWEyODgtNTg2YmY1YjdkOGJmIn0.W6kEeSWVEJM6_YOYjRg9vxV55EWA-tImKedW0jGKk3Y",
  "access_expires_at": "2026-10-29T17:23:28.776742653Z",
  "refresh_token": "DNbOwU0H8hoUCjfQiWko92sNIQ-K4f47-JfHY2nwvVk",
  "refresh_expires_at": "2026-10-30T05:08:28.776195093Z",
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
  "session_id": "5db5ac90-8d0f-4c87-beb2-58d26ac6732c",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2MDksImlhdCI6MTc5MzI5MzcwOSwianRpIjoiYzJhMzUyYWMtODA3Zi00OTFlLTk5MzQtNmQ3OWFjNGUyODVlIiwic2lkIjoiNWRiNWFjOTAtOGQwZi00Yzg3LWJlYjItNThkMjZhYzY3MzJjIn0.8N4N80juxbc_gziczk1bfEmthYyPPHNwGPAwoT7sNqU",
  "access_expires_at": "2026-10-29T17:23:29.353244066Z",
  "refresh_token": "pEybrxfcU-OFStDIQoLTkH-Nj00KiEE8j0Rqg87-taQ",
  "refresh_expires_at": "2026-10-30T05:08:29.352703619Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/383f6527-89f3-4f5a-9df0-2caba8cff487/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:08:28.437824Z",
      "actor": {
        "type": "CLIENT",
        "id": "559a9acb-f21a-40df-86f8-fe165f1c6015",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
        "quote_id": "1edb766b-026a-4167-bd7c-0625de46ccff",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6d3a7933-83fa-4e79-bdf8-12fcf012fb9e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:08:28.440448Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
        "attempt_id": "79ea8d51-ae74-4a20-b12e-627ea9e58bb1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6d3a7933-83fa-4e79-bdf8-12fcf012fb9e"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T17:08:28.451347Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
        "attempt_id": "79ea8d51-ae74-4a20-b12e-627ea9e58bb1"
      },
      "correlation_id": "6d3a7933-83fa-4e79-bdf8-12fcf012fb9e"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "79ea8d51-ae74-4a20-b12e-627ea9e58bb1",
        "generation": 1,
        "started_at": "2026-10-29T17:08:28.43924Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T17:08:28.451347Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T17:08:28.441297Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/6d3a7933-83fa-4e79-bdf8-12fcf012fb9e` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "383f6527-89f3-4f5a-9df0-2caba8cff487:0",
      "order_id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
      "at": "2026-10-29T17:08:28.437824Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "383f6527-89f3-4f5a-9df0-2caba8cff487:1",
      "order_id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
      "at": "2026-10-29T17:08:28.440448Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "383f6527-89f3-4f5a-9df0-2caba8cff487:2",
      "order_id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
      "at": "2026-10-29T17:08:28.451347Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/99ecafc1-13da-490b-aa5d-395591c5b518` → **200**

```json
{
  "found": []
}
```

Done: request 6d3a7933-83fa-4e79-bdf8-12fcf012fb9e — order 383f6527-89f3-4f5a-9df0-2caba8cff487 found by its id.

`GET /api/rider/v1/orders/383f6527-89f3-4f5a-9df0-2caba8cff487` → **200**

```json
{
  "id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "559a9acb-f21a-40df-86f8-fe165f1c6015",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:08:28.437202Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/383f6527-89f3-4f5a-9df0-2caba8cff487/cancel` → **200**

```json
{
  "command_id": "a67a9f74-41c5-4dfb-8d3c-803583c64ca9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "383f6527-89f3-4f5a-9df0-2caba8cff487",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "559a9acb-f21a-40df-86f8-fe165f1c6015",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:08:28.437202Z",
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
  "phone": "+380630980440",
  "device_ref": "sandbox-27317"
}
```

```json
{
  "challenge_id": "71399846-aeb7-4ab5-9db6-ffbc8d566d05",
  "expires_at": "2026-10-29T17:13:31.216410496Z",
  "resend_available_at": "2026-10-29T17:08:32.216410496Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630980440` → **200**

```json
{
  "phone": "+380630980440",
  "audience": "CLIENT",
  "code": "486039",
  "sent_at": "2026-10-29T17:08:31.21993862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71399846-aeb7-4ab5-9db6-ffbc8d566d05",
  "code": "486039",
  "device_ref": "sandbox-27317"
}
```

```json
{
  "session_id": "1795e22f-cfdd-420a-8253-f822f93641b4",
  "subject": {
    "type": "CLIENT",
    "id": "4e27681a-ff00-49a6-9077-6a6f813d464b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTI3NjgxYS1mZjAwLTQ5YTYtOTA3Ny02YTZmODEzZDQ2NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjExLCJpYXQiOjE3OTMyOTM3MTEsImp0aSI6ImY1M2Q5OTQyLTA5NjMtNGJjNS1iZjFiLTYwYjZhOTliNjU0MSIsInNpZCI6IjE3OTVlMjJmLWNmZGQtNDIwYS04MjUzLWY4MjJmOTM2NDFiNCJ9.xRsZX850Swpjd_5uXJug9Puu7V64ff_h1kcu76mlVCI",
  "access_expires_at": "2026-10-29T17:23:31.532718665Z",
  "refresh_token": "YezfcMGzCYzyP4DRkEiSkoAMNuIqNUYDHsOKnW0BxnU",
  "refresh_expires_at": "2026-11-28T17:08:31.532184396Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "4527c9b6-956c-4c79-bc6a-685d6bcb530e",
  "expires_at": "2026-10-29T17:13:33.828496522Z",
  "resend_available_at": "2026-10-29T17:08:34.828496522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630980440` → **200**

```json
{
  "phone": "+380630980440",
  "audience": "CLIENT",
  "code": "741681",
  "sent_at": "2026-10-29T17:08:33.830940354Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1890cee5-5272-48e7-91e2-6eec977309d8",
  "challenge_id": "4527c9b6-956c-4c79-bc6a-685d6bcb530e",
  "otp_code": "741681"
}
```

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "PENDING",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578` → **200**

```json
{
  "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
  "state": "READY",
  "created_at": "2026-10-29T17:08:34.167873Z",
  "ready_at": "2026-10-29T17:08:43.236601Z",
  "expires_at": "2026-11-05T17:08:43.236601Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632049448",
  "device_ref": "sandbox-28365"
}
```

```json
{
  "challenge_id": "7ee22ee1-3ba8-4d81-a360-471bd57d43f4",
  "expires_at": "2026-10-29T17:13:43.857464249Z",
  "resend_available_at": "2026-10-29T17:08:44.857464249Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632049448` → **200**

```json
{
  "phone": "+380632049448",
  "audience": "CLIENT",
  "code": "681031",
  "sent_at": "2026-10-29T17:08:43.861171344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ee22ee1-3ba8-4d81-a360-471bd57d43f4",
  "code": "681031",
  "device_ref": "sandbox-28365"
}
```

```json
{
  "session_id": "07d2e995-3cba-4ba5-af4e-0e04067f2c4a",
  "subject": {
    "type": "CLIENT",
    "id": "24af036d-6d7d-492e-af9e-09293d73dc9c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNGFmMDM2ZC02ZDdkLTQ5MmUtYWY5ZS0wOTI5M2Q3M2RjOWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjI0LCJpYXQiOjE3OTMyOTM3MjQsImp0aSI6IjQzMjA3MTQ1LWZlMjktNDJhYi1iODBkLTFiMWYxMjQ0ODA5MCIsInNpZCI6IjA3ZDJlOTk1LTNjYmEtNGJhNS1hZjRlLTBlMDQwNjdmMmM0YSJ9.Sbt9obpxoX95NX7isLOMI1sdKpxvcV5Em8ydQtyEHiw",
  "access_expires_at": "2026-10-29T17:23:44.182804821Z",
  "refresh_token": "KBKMP9EXJXnr_fmh8U0ubt5x7CdHMvQZWPsnIvqxvUA",
  "refresh_expires_at": "2026-11-28T17:08:44.18216102Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/96317199-0e2a-4b64-9f64-7e63b1c30578/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d20b0634-7eda-4dc3-ba44-4fe420cf5256"
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
  "session_id": "98d98e97-ee2c-4252-bff3-85c0968a798e",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2MjUsImlhdCI6MTc5MzI5MzcyNSwianRpIjoiYTI4MWU2MDUtYzNhZi00N2E4LWFiM2ItZDk2OGY3OTAxMWI2Iiwic2lkIjoiOThkOThlOTctZWUyYy00MjUyLWJmZjMtODVjMDk2OGE3OThlIn0.e8odo0B9GgqYJZ6AsjnvUdFFulkYjML-Aer3S2ZG4VQ",
  "access_expires_at": "2026-10-29T17:23:45.064883912Z",
  "refresh_token": "q2et_t657w06eLo44aHZ5Q4dFO3mUgZxycAY6yoFKZc",
  "refresh_expires_at": "2026-10-30T05:08:45.064312708Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4e27681a-ff00-49a6-9077-6a6f813d464b",
  "session_id": "1795e22f-cfdd-420a-8253-f822f93641b4",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/4e27681a-ff00-49a6-9077-6a6f813d464b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "96317199-0e2a-4b64-9f64-7e63b1c30578",
      "state": "READY",
      "created_at": "2026-10-29T17:08:34.167873Z",
      "ready_at": "2026-10-29T17:08:43.236601Z",
      "expires_at": "2026-11-05T17:08:43.236601Z",
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
  "device_ref": "sandbox-26680"
}
```

```json
{
  "challenge_id": "ba0253c3-8748-4a94-800c-63cbde857f5a",
  "expires_at": "2026-10-29T17:13:45.945070817Z",
  "resend_available_at": "2026-10-29T17:08:46.945070817Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "272702",
  "sent_at": "2026-10-29T17:08:45.947817612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba0253c3-8748-4a94-800c-63cbde857f5a",
  "code": "272702",
  "device_ref": "sandbox-26680"
}
```

```json
{
  "session_id": "b9ce13af-fac6-45fd-8ebf-0b09865a7eda",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDYyNiwiaWF0IjoxNzkzMjkzNzI2LCJqdGkiOiJjZjJlMzY1ZS0xZDRlLTRhMzItYWFmNC1hMjE2NTgyZGMyZmQiLCJzaWQiOiJiOWNlMTNhZi1mYWM2LTQ1ZmQtOGViZi0wYjA5ODY1YTdlZGEifQ.Eo5Oi1pEK9iFlFgebgmL5RAoFaOKH_ji_vUIsvnIvkk",
  "access_expires_at": "2026-10-29T17:23:46.254883509Z",
  "refresh_token": "byH5n0LtZsr7hbr8jYlPJ6N_bvUDfgZV6LX5xKDnl3k",
  "refresh_expires_at": "2026-11-28T17:08:46.254315951Z",
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
  "device_ref": "sandbox-4023"
}
```

```json
{
  "challenge_id": "b198f2f7-11df-4df0-bd2e-4e3412822715",
  "expires_at": "2026-10-29T17:13:46.830295801Z",
  "resend_available_at": "2026-10-29T17:08:47.830295801Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "778189",
  "sent_at": "2026-10-29T17:08:46.833598134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b198f2f7-11df-4df0-bd2e-4e3412822715",
  "code": "778189",
  "device_ref": "sandbox-4023"
}
```

```json
{
  "session_id": "1a8133df-cc8a-4086-8e2b-b5e85ecf447a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDYyNywiaWF0IjoxNzkzMjkzNzI3LCJqdGkiOiIzMDhkZGJhNC0zY2FmLTQxNmEtODhjNS00Zjg3M2NiZDY5NjYiLCJzaWQiOiIxYTgxMzNkZi1jYzhhLTQwODYtOGUyYi1iNWU4NWVjZjQ0N2EifQ.xwfdUEs6v-38CiD9jn4v3U2L0HCaD_0JjTpFpT05UKM",
  "access_expires_at": "2026-10-29T17:23:47.157691905Z",
  "refresh_token": "UU6vJprci3g8nmxslH9xAIpsJ-D9qq8hZPUoxert9FU",
  "refresh_expires_at": "2026-11-28T17:08:47.157073733Z",
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
  "command_id": "95de2794-8973-477c-b3ae-0e6e0c55ef4b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:08:47Z",
    "sequence": 1793293727742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d2496d3-4d5c-4cce-b040-4cf2d8d8c96a",
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
  "last_heartbeat_at": "2026-10-29T17:08:47.763379Z",
  "last_location_at": "2026-10-29T17:08:47.763379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26610"
}
```

```json
{
  "challenge_id": "c0e5977e-5c4e-488e-8341-a8d24d62fd6b",
  "expires_at": "2026-10-29T17:13:48.056454969Z",
  "resend_available_at": "2026-10-29T17:08:49.056454969Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "954236",
  "sent_at": "2026-10-29T17:08:48.059813545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0e5977e-5c4e-488e-8341-a8d24d62fd6b",
  "code": "954236",
  "device_ref": "sandbox-26610"
}
```

```json
{
  "session_id": "3a8ad265-3ae3-4ee4-b248-1d4c14d926ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDYyOCwiaWF0IjoxNzkzMjkzNzI4LCJqdGkiOiI4YWQxMzQ0YS0xYzliLTQyZDUtODIxMS0yYWZiMWI2MTE5ZTgiLCJzaWQiOiIzYThhZDI2NS0zYWUzLTRlZTQtYjI0OC0xZDRjMTRkOTI2YWMifQ.urj1VqvsoJeJkvBvoDECl-jLBKmAeXD9adXKqIz8XVs",
  "access_expires_at": "2026-10-29T17:23:48.377167285Z",
  "refresh_token": "VhslVccU3J4Sr2jUqj4hKMT6u_0lC176_QzINvjbtw8",
  "refresh_expires_at": "2026-11-28T17:08:48.376653639Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1c63eb4c-f746-4a70-96be-6d2f3e5cb203",
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
  "last_heartbeat_at": "2026-10-29T17:07:06.659593Z",
  "last_location_at": "2026-10-29T17:07:06.659593Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1c63eb4c-f746-4a70-96be-6d2f3e5cb203/handover` → **200**

```json
{
  "command_id": "7e65d963-a7dd-4e6e-9c69-bc18f46f9555",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1c63eb4c-f746-4a70-96be-6d2f3e5cb203",
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
  "last_heartbeat_at": "2026-10-29T17:07:06.659593Z",
  "last_location_at": "2026-10-29T17:07:06.659593Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1c63eb4c-f746-4a70-96be-6d2f3e5cb203/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:08:49Z",
    "sequence": 1793293729274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1c63eb4c-f746-4a70-96be-6d2f3e5cb203",
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
  "last_heartbeat_at": "2026-10-29T17:08:49.293921Z",
  "last_location_at": "2026-10-29T17:08:49.293921Z",
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
  "session_id": "c9adf4bb-672b-4f98-8682-8698fe7c3808",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2MjksImlhdCI6MTc5MzI5MzcyOSwianRpIjoiNmYwMDM4OGUtOTIzYy00ZjJmLTg4ZDUtYTU4OTBlMTNhNjE2Iiwic2lkIjoiYzlhZGY0YmItNjcyYi00Zjk4LTg2ODItODY5OGZlN2MzODA4In0.r8jkhJ6xXJi3jc37URQ3nk8QvY_rbiO8Qq4D82xKit4",
  "access_expires_at": "2026-10-29T17:23:49.898061139Z",
  "refresh_token": "2HL4LFq5Q-Y8GBoMxL5jRmpnwsMTw1L4xyj4qPfZJHQ",
  "refresh_expires_at": "2026-10-30T05:08:49.897472092Z",
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
  "session_id": "9f930bdb-0f1c-4be5-aa3f-ac3965473692",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2MzAsImlhdCI6MTc5MzI5MzczMCwianRpIjoiZDU0OGE1M2EtNWQ5Yi00YmFjLTk3YTEtMGM4YTc5NWRiYWFlIiwic2lkIjoiOWY5MzBiZGItMGYxYy00YmU1LWFhM2YtYWMzOTY1NDczNjkyIn0.cWISiyN8ce3TaNeO18HKv9OQHgn3EfAMgLlxifc7dE4",
  "access_expires_at": "2026-10-29T17:23:50.503854459Z",
  "refresh_token": "tMflD3AbBjJ_dGd_wRrPDVlZpJMTueuwiz71qSmcFfw",
  "refresh_expires_at": "2026-10-30T05:08:50.50321908Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685368269",
  "device_ref": "sandbox-19242"
}
```

```json
{
  "challenge_id": "9eac0d5f-0ceb-4871-9030-ff48233bebf1",
  "expires_at": "2026-10-29T17:13:50.818109763Z",
  "resend_available_at": "2026-10-29T17:08:51.818109763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685368269` → **200**

```json
{
  "phone": "+380685368269",
  "audience": "CLIENT",
  "code": "634774",
  "sent_at": "2026-10-29T17:08:50.821373486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9eac0d5f-0ceb-4871-9030-ff48233bebf1",
  "code": "634774",
  "device_ref": "sandbox-19242"
}
```

```json
{
  "session_id": "83abd96d-5d6a-49ef-a29c-5540967bd506",
  "subject": {
    "type": "CLIENT",
    "id": "8400c051-a94a-450c-9273-049cbf9c17ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDAwYzA1MS1hOTRhLTQ1MGMtOTI3My0wNDljYmY5YzE3YWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjMxLCJpYXQiOjE3OTMyOTM3MzEsImp0aSI6ImM3NjRkZGFkLWE0OWQtNDk4Yy1hNmIyLTAzNThkNTNlZWU2ZiIsInNpZCI6IjgzYWJkOTZkLTVkNmEtNDllZi1hMjljLTU1NDA5NjdiZDUwNiJ9.wwLhAy3VutzHNPv0TpgCOZ13jJFBbUug6ZgmqYObYL8",
  "access_expires_at": "2026-10-29T17:23:51.14023277Z",
  "refresh_token": "Uid5icifnxMGjmEu_WQkDcy9IAZiHixiZl9mOSQYkh4",
  "refresh_expires_at": "2026-11-28T17:08:51.139604461Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67d82df0-1db4-40ed-be49-09a739fec172",
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
  "id": "236a73a5-62c0-4978-ab77-452daabd30e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:51.448344Z",
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
  "command_id": "fdb291da-1a6b-48bd-9fa2-9bbb51a6d299",
  "quote_id": "236a73a5-62c0-4978-ab77-452daabd30e0",
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
  "id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8400c051-a94a-450c-9273-049cbf9c17ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:08:51.757338Z",
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
    "id": "adbd07ba-a919-4052-aa87-39606988c12c",
    "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
    "expires_at": "2026-10-29T17:09:06.760633Z",
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

`POST /api/driver/v1/offers/adbd07ba-a919-4052-aa87-39606988c12c/reject` → **204**

```json
{
  "command_id": "38cf2540-0348-4ed0-a75e-7f45420eafb1"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "aa2c4bae-730e-437e-9700-70692800600a",
    "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
    "expires_at": "2026-10-29T17:09:07.383373Z",
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

`POST /api/driver/v1/offers/aa2c4bae-730e-437e-9700-70692800600a/accept` → **200**

```json
{
  "command_id": "ff9afe0f-f1d3-4df9-9aca-c843c27c5841"
}
```

```json
{
  "id": "5dcb3e07-7fe3-41be-8cba-b8dddfdcfa0d",
  "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "04133bfd-93a7-4209-b0ba-5e8f05ed237f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/74b64874-a34e-4a56-bd9a-8dc3e4805835/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:08:51.757827Z",
      "actor": {
        "type": "CLIENT",
        "id": "8400c051-a94a-450c-9273-049cbf9c17ad",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
        "quote_id": "236a73a5-62c0-4978-ab77-452daabd30e0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8e0d5b27-1b2b-4ff1-a066-de3df496d504"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:08:51.759822Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
        "attempt_id": "449ff8f6-5952-447b-bb5e-364267ada917",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8e0d5b27-1b2b-4ff1-a066-de3df496d504"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:08:51.763581Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "adbd07ba-a919-4052-aa87-39606988c12c",
        "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "8e0d5b27-1b2b-4ff1-a066-de3df496d504"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T17:08:52.382113Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "adbd07ba-a919-4052-aa87-39606988c12c",
        "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835"
      },
      "correlation_id": "43e8bf3d-d4de-4e31-8462-a465ff7e16d7"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 74b64874-a34e-4a56-bd9a-8dc3e4805835 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/74b64874-a34e-4a56-bd9a-8dc3e4805835` → **200**

```json
{
  "id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8400c051-a94a-450c-9273-049cbf9c17ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5dcb3e07-7fe3-41be-8cba-b8dddfdcfa0d",
    "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "04133bfd-93a7-4209-b0ba-5e8f05ed237f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T17:08:51.757338Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/74b64874-a34e-4a56-bd9a-8dc3e4805835/cancel` → **200**

```json
{
  "command_id": "a2ce2407-2706-4400-a847-7b3d82f88eba",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8400c051-a94a-450c-9273-049cbf9c17ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5dcb3e07-7fe3-41be-8cba-b8dddfdcfa0d",
    "order_id": "74b64874-a34e-4a56-bd9a-8dc3e4805835",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "04133bfd-93a7-4209-b0ba-5e8f05ed237f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T17:08:51.757338Z",
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
  "session_id": "8d2496d3-4d5c-4cce-b040-4cf2d8d8c96a",
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
  "last_heartbeat_at": "2026-10-29T17:08:47.763379Z",
  "last_location_at": "2026-10-29T17:08:47.763379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d2496d3-4d5c-4cce-b040-4cf2d8d8c96a/close` → **200**

```json
{
  "command_id": "0dfdd7e5-444b-482e-b4a0-50a7a797cf26",
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
  "session_id": "1c63eb4c-f746-4a70-96be-6d2f3e5cb203",
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
  "last_heartbeat_at": "2026-10-29T17:08:49.293921Z",
  "last_location_at": "2026-10-29T17:08:49.293921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1c63eb4c-f746-4a70-96be-6d2f3e5cb203/close` → **200**

```json
{
  "command_id": "7db2de3e-24d7-42c9-8178-ffd1aad19e44",
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
  "session_id": "40779b84-859c-43a6-9e90-72c0392b4f68",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2MzUsImlhdCI6MTc5MzI5MzczNSwianRpIjoiYjI1OTIxOTMtY2FjMS00YjgzLTk1N2EtNWZjM2E4NGFlYmUzIiwic2lkIjoiNDA3NzliODQtODU5Yy00M2E2LTllOTAtNzJjMDM5MmI0ZjY4In0.gitUwt7pJoqRHdCiGCZ-4ntdedV45UnQr3jJWea0RpY",
  "access_expires_at": "2026-10-29T17:23:55.52579408Z",
  "refresh_token": "FFSxJ3IVqo6-D6wxAf0ypY7lkyUoGLEbANm4I8yma2k",
  "refresh_expires_at": "2026-10-30T05:08:55.5250307Z",
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
  "command_id": "773e6f59-8114-434d-a956-3008f8231dbd",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T17:08:56.151695Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "2a1d72e6-288e-4ad8-a267-b6b4a70296fd",
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
  "correlation_id": "bc27e546-f5e5-42d0-b89d-204af7aafdcd"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "14cb8782-e2d1-4d8f-b1a9-fd05d81f9141",
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
  "correlation_id": "e7748960-ed8d-4cc1-ae63-8449d6bbe8f9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636571630",
  "device_ref": "sandbox-31678"
}
```

```json
{
  "challenge_id": "518e6171-317d-4c73-883c-7268900574c9",
  "expires_at": "2026-10-29T17:13:57.055038965Z",
  "resend_available_at": "2026-10-29T17:08:58.055038965Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636571630` → **200**

```json
{
  "phone": "+380636571630",
  "audience": "CLIENT",
  "code": "853199",
  "sent_at": "2026-10-29T17:08:57.058657209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "518e6171-317d-4c73-883c-7268900574c9",
  "code": "853199",
  "device_ref": "sandbox-31678"
}
```

```json
{
  "session_id": "294b08d7-8d70-4d31-acfd-774b85f32011",
  "subject": {
    "type": "CLIENT",
    "id": "a12d8857-c212-4074-bbe9-31acc80a7db9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTJkODg1Ny1jMjEyLTQwNzQtYmJlOS0zMWFjYzgwYTdkYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjM3LCJpYXQiOjE3OTMyOTM3MzcsImp0aSI6IjdmNThmYmQwLWU4ODItNDZjZC05YTZlLWQ3MDRkNmQ1YzMwYiIsInNpZCI6IjI5NGIwOGQ3LThkNzAtNGQzMS1hY2ZkLTc3NGI4NWYzMjAxMSJ9.cVJZQj9nEC1yfDI7bdXZqHKOJTlt2LzqRFD3lL2rJfA",
  "access_expires_at": "2026-10-29T17:23:57.369260085Z",
  "refresh_token": "wc5XKZXmaz84VAn0QguqlPw23vu9hxBgD6FjSPFG3Ew",
  "refresh_expires_at": "2026-11-28T17:08:57.368751779Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bfad833c-3b06-4519-9bb3-b74c701f7bac",
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
  "id": "2e08f642-6733-4e85-8e53-c81c5cc52714",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:13:57.663150Z",
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
  "command_id": "daf6fa5e-845e-4fa0-a024-0b675447e0b9",
  "quote_id": "2e08f642-6733-4e85-8e53-c81c5cc52714",
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
  "correlation_id": "e6761eca-6b88-4440-ae0e-8faffaf5a3cb"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "25c3c59c-71ad-468f-92cf-06b9a3fc17c8",
  "quote_id": "2e08f642-6733-4e85-8e53-c81c5cc52714",
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
  "id": "6a55737d-60fa-48a4-8219-6506faf4a53f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a12d8857-c212-4074-bbe9-31acc80a7db9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:08:58.258271Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6a55737d-60fa-48a4-8219-6506faf4a53f/cancel` → **200**

```json
{
  "command_id": "26b52b4e-ec4c-42b6-bbdf-187de1a4d76d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6a55737d-60fa-48a4-8219-6506faf4a53f",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a12d8857-c212-4074-bbe9-31acc80a7db9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:08:58.258271Z",
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
  "command_id": "45a1e1cb-8d8a-4e98-acf3-e4d8081f768c",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T17:08:58.921533Z"
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
      "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T17:08:58.921533Z"
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
  "device_ref": "sandbox-32580"
}
```

```json
{
  "challenge_id": "8a953c18-68e6-444c-ad50-3619a10bd38e",
  "expires_at": "2026-10-29T17:13:59.825973939Z",
  "resend_available_at": "2026-10-29T17:09:00.825973939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "265590",
  "sent_at": "2026-10-29T17:08:59.828538698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a953c18-68e6-444c-ad50-3619a10bd38e",
  "code": "265590",
  "device_ref": "sandbox-32580"
}
```

```json
{
  "session_id": "e9bf0ae4-a6a0-4628-86ad-71f4adcc2cfa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDY0MCwiaWF0IjoxNzkzMjkzNzQwLCJqdGkiOiI5Yzg5Mjc0NC05Y2U5LTQyMzAtOGQwMC05OWI0ZDRiMmZkMGIiLCJzaWQiOiJlOWJmMGFlNC1hNmEwLTQ2MjgtODZhZC03MWY0YWRjYzJjZmEifQ.-psPzZsvuI3A4ZtoWyu9rV9SH_R6YSk9jY2Qgr5_PFU",
  "access_expires_at": "2026-10-29T17:24:00.145613533Z",
  "refresh_token": "SQ17QrgTbDRG8-3GnjZ3_dqtM11DjWWQ8uito5L6618",
  "refresh_expires_at": "2026-11-28T17:09:00.145023645Z",
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
  "command_id": "1735d183-1bbb-4400-a3eb-90c4732c6013",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:00Z",
    "sequence": 1793293740729
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:00.748444Z",
  "last_location_at": "2026-10-29T17:09:00.748444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672467031",
  "device_ref": "sandbox-25523"
}
```

```json
{
  "challenge_id": "863f9754-1647-421f-911e-4060d84397ef",
  "expires_at": "2026-10-29T17:14:01.044680991Z",
  "resend_available_at": "2026-10-29T17:09:02.044680991Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672467031` → **200**

```json
{
  "phone": "+380672467031",
  "audience": "CLIENT",
  "code": "110964",
  "sent_at": "2026-10-29T17:09:01.047465764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "863f9754-1647-421f-911e-4060d84397ef",
  "code": "110964",
  "device_ref": "sandbox-25523"
}
```

```json
{
  "session_id": "d458bfe4-033d-4264-8348-fedebaf6d9cc",
  "subject": {
    "type": "CLIENT",
    "id": "fe452acd-ed12-45ac-8749-d6a74fbbf4c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTQ1MmFjZC1lZDEyLTQ1YWMtODc0OS1kNmE3NGZiYmY0YzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjQxLCJpYXQiOjE3OTMyOTM3NDEsImp0aSI6IjU3YjcyMDZiLTkzMTEtNDNjZS1hZGJlLTRkMThmMmIwYjljYiIsInNpZCI6ImQ0NThiZmU0LTAzM2QtNDI2NC04MzQ4LWZlZGViYWY2ZDljYyJ9.ZAonKt6d0ReiGbPTuBIaepjhin-SDag9IRO5T_EEDrE",
  "access_expires_at": "2026-10-29T17:24:01.374389449Z",
  "refresh_token": "tlm0R13m9QFUQFX3climD6YHVWSZ0mUa295KhQ4bYwU",
  "refresh_expires_at": "2026-11-28T17:09:01.373810772Z",
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
  "command_id": "8c49a05c-ec17-4b63-8062-f15b61b8eeaa",
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
  "id": "21d77306-1ee0-4d49-a682-8ed1eed47447",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:01.955015Z",
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
  "command_id": "ca28e02c-f692-441b-824e-5dcd09330f38",
  "platform": "ANDROID",
  "token": "sandbox-driver-d2dfcff5-a54a-4067-bab4-1b01c60d943c"
}
```

```json
{
  "id": "d0f92a26-43a8-4eae-bcf3-e3abcfc768d8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T17:09:02.267447Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "827b80ca-cda0-494d-9c4a-46b8e89aa1b4",
  "platform": "ANDROID",
  "token": "sandbox-rider-3b1089b5-93ca-4ea2-b637-f699f9f940bf"
}
```

```json
{
  "id": "a79c25fa-3eaf-4373-9e62-d5630a194c5d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T17:09:02.573979Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b55841a4-bb67-430a-a3c8-98a09a01f6c6",
  "quote_id": "21d77306-1ee0-4d49-a682-8ed1eed47447",
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
  "id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe452acd-ed12-45ac-8749-d6a74fbbf4c8",
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
  "created_at": "2026-10-29T17:09:02.880147Z",
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
    "id": "a652504f-0634-4c95-857c-6fbd0a073f11",
    "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
    "expires_at": "2026-10-29T17:09:17.883045Z",
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

`POST /api/driver/v1/offers/a652504f-0634-4c95-857c-6fbd0a073f11/accept` → **200**

```json
{
  "command_id": "3aacad1d-554b-4530-9b48-56c21c54ee4f"
}
```

```json
{
  "id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "64273b7e-099d-456b-a191-de66fde99e3a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T17:09:02.854Z` → **200**

```json
[
  {
    "at": "2026-10-29T17:09:03.794561745Z",
    "token_suffix": "0d943c",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "74bdcd16-c5b8-4e1c-84e0-c7cd2b22a4e7",
      "order_version": "2",
      "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672467031&after=2026-10-29T17:09:02.854Z` → **200**

```json
[
  {
    "at": "2026-10-29T17:09:03.797264026Z",
    "token_suffix": "f940bf",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "8aba7445-687c-4c80-91e4-126d7bd7562a",
      "order_version": "3",
      "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/61d70773-1bbe-4d18-8afe-b444edb9effb/messages` → **201**

```json
{
  "command_id": "93e0d342-d0ef-4035-90b8-64da9cec4c8a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "e6e398c4-5965-4a93-bf8f-52d702bc2c37",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T17:09:03.867267837Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "64273b7e-099d-456b-a191-de66fde99e3a",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "assignment_id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
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

`POST /api/driver/v1/trips/64273b7e-099d-456b-a191-de66fde99e3a/messages` → **201**

```json
{
  "command_id": "2513db63-51d9-4f09-b5ce-306bc1c9b267",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "4ad166fc-eea8-436f-aa66-a40f3f82049a",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T17:09:04.468588631Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/61d70773-1bbe-4d18-8afe-b444edb9effb/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/64273b7e-099d-456b-a191-de66fde99e3a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672467031"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:05Z",
    "sequence": 1793293745340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:05.359636Z",
  "last_location_at": "2026-10-29T17:09:05.359636Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "64273b7e-099d-456b-a191-de66fde99e3a",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "assignment_id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
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

`POST /api/driver/v1/trips/64273b7e-099d-456b-a191-de66fde99e3a/arrive` → **200**

```json
{
  "command_id": "90e6570c-575f-4601-a382-f48315a63acd",
  "expected_version": 0
}
```

```json
{
  "id": "64273b7e-099d-456b-a191-de66fde99e3a",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "assignment_id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
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
  "arrived_at": "2026-10-29T17:09:05.93694Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/64273b7e-099d-456b-a191-de66fde99e3a/start` → **200**

```json
{
  "command_id": "05995936-ce57-4dd0-b835-f914054be64d",
  "expected_version": 1
}
```

```json
{
  "id": "64273b7e-099d-456b-a191-de66fde99e3a",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "assignment_id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
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
  "arrived_at": "2026-10-29T17:09:05.93694Z",
  "started_at": "2026-10-29T17:09:06.235053Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:06Z",
    "sequence": 1793293746523
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:06.542671Z",
  "last_location_at": "2026-10-29T17:09:06.542671Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/64273b7e-099d-456b-a191-de66fde99e3a/complete` → **200**

```json
{
  "command_id": "501638cc-958e-4a43-b88d-1499067dc668",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:09:06Z",
  "cash_received": true
}
```

```json
{
  "id": "64273b7e-099d-456b-a191-de66fde99e3a",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "assignment_id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
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
  "arrived_at": "2026-10-29T17:09:05.93694Z",
  "started_at": "2026-10-29T17:09:06.235053Z",
  "completed_at": "2026-10-29T17:09:06.848586Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/61d70773-1bbe-4d18-8afe-b444edb9effb` → **200**

```json
{
  "id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fe452acd-ed12-45ac-8749-d6a74fbbf4c8",
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
    "id": "7f7b5457-976d-423a-aba0-a5a5092c3434",
    "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "64273b7e-099d-456b-a191-de66fde99e3a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:09:02.880147Z",
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
    "id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T17:09:02.880147Z",
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
    "id": "64273b7e-099d-456b-a191-de66fde99e3a",
    "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
    "order_short_number": 13,
    "created_at": "2026-10-29T17:09:03.496651Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b68f4482-c231-4cd6-9d75-3d8fd5f78b54",
    "order_id": "6f9ce324-0eec-4d0b-a50e-0d9e677775ae",
    "order_short_number": 8,
    "created_at": "2026-10-29T17:07:40.687697Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "78af37fc-1097-487a-a3b6-56eea084ce04",
    "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
    "order_short_number": 3,
    "created_at": "2026-10-29T17:06:57.11933Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a856e4f0-17b5-482a-a617-1a1f8eac6890",
    "order_id": "c8d2ee28-6223-44ec-a948-ca58693d8d25",
    "order_short_number": 2,
    "created_at": "2026-10-29T17:06:39.954635Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2484a845-37da-4685-89fe-16c872eec881",
    "order_id": "2be0fdcf-3ffe-485f-8178-5e6133e8c57b",
    "order_short_number": 1,
    "created_at": "2026-10-29T17:06:30.190679Z",
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

`GET /api/rider/v1/orders/61d70773-1bbe-4d18-8afe-b444edb9effb/tip` → **200**

```json
{
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
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
  "available_until": "2026-10-30T17:09:06.848586Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/61d70773-1bbe-4d18-8afe-b444edb9effb/tip` → **201**

```json
{
  "command_id": "493cf85f-6947-42a4-be0e-b6e2249f1d68",
  "amount_minor": 1100
}
```

```json
{
  "id": "1ec14154-6495-4cc9-a8ca-78caf061a677",
  "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T17:09:11.948678Z"
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
  "session_id": "28719301-dd21-414f-9e4d-9cb8e1c271bb",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NTIsImlhdCI6MTc5MzI5Mzc1MiwianRpIjoiNGFlNjE5NDEtZmIzYi00ZTc4LWI3NTMtMWYwODc1NGQ0YzVjIiwic2lkIjoiMjg3MTkzMDEtZGQyMS00MTRmLTllNGQtOWNiOGUxYzI3MWJiIn0.qqD3ZK3YZOASOPvqMS-bRklvEIaJ5nBRtY9vqDYs1Xw",
  "access_expires_at": "2026-10-29T17:24:12.542761327Z",
  "refresh_token": "7CDQKmikwUPclctmZt72aABJXxpsxmWuEoZmhOOa5g8",
  "refresh_expires_at": "2026-10-30T05:09:12.542083504Z",
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
  "generated_at": "2026-10-29T17:09:12.842489284Z"
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
  "generated_at": "2026-10-29T17:09:13.14230188Z"
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
  "session_id": "bb216cd1-f3e3-4f8b-8f45-7d332f2669f1",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NTMsImlhdCI6MTc5MzI5Mzc1MywianRpIjoiODBiODljNDQtZTViYS00ZWU0LTg0NzMtYmI1MzMyYjkxMmM5Iiwic2lkIjoiYmIyMTZjZDEtZjNlMy00ZjhiLThmNDUtN2QzMzJmMjY2OWYxIn0.9pFVkpE65Pg1DnNe2IXq0gkDKx9p-SfpJpvcymPmFc4",
  "access_expires_at": "2026-10-29T17:24:13.754358472Z",
  "refresh_token": "IfDmVdgV1kHJ3IX0CFzU4kqBizIsS6nFyOsbk1h_CD0",
  "refresh_expires_at": "2026-10-30T05:09:13.753639429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/61d70773-1bbe-4d18-8afe-b444edb9effb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:09:02.880668Z",
      "actor": {
        "type": "CLIENT",
        "id": "fe452acd-ed12-45ac-8749-d6a74fbbf4c8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
        "quote_id": "21d77306-1ee0-4d49-a682-8ed1eed47447",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f386f734-0d16-4459-aaeb-31e35b27e996"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:09:02.882368Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
        "attempt_id": "8fb1db37-d004-49bf-9050-a501f3c4f30a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f386f734-0d16-4459-aaeb-31e35b27e996"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:09:02.88515Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a652504f-0634-4c95-857c-6fbd0a073f11",
        "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f386f734-0d16-4459-aaeb-31e35b27e996"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T17:09:03.498189Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a652504f-0634-4c95-857c-6fbd0a073f11",
        "order_id": "61d70773-1bbe-4d18-8afe-b444edb9effb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7f7b5457-976d-423a-aba0-a5a5092c3434"
      },
      "correlation_id": "981cebb8-a685-49f8-b6d6-5464e9735f59"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T17:09:14.380791854Z",
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
      "last_location_at": "2026-10-29T17:09:06.542671Z",
      "order_id": null
    }
  ]
}
```

Done: order 61d70773-1bbe-4d18-8afe-b444edb9effb.

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
  "session_id": "5f3e8014-d285-41ff-8f12-2e402316c86f",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NTQsImlhdCI6MTc5MzI5Mzc1NCwianRpIjoiMGZjNWU1MDItYWVhMC00YjIwLWFkNWQtNDlhZjEzZjRiYzEyIiwic2lkIjoiNWYzZTgwMTQtZDI4NS00MWZmLThmMTItMmU0MDIzMTZjODZmIn0.1CVJ1TtSDy6x0efeTDjBRnsqMP4HxQenWUytIwAdxkQ",
  "access_expires_at": "2026-10-29T17:24:14.994970537Z",
  "refresh_token": "o2c02Xgw1T0XP5an9FtOyaDzMHxcRVGssY55R0QkN_w",
  "refresh_expires_at": "2026-10-30T05:09:14.99426371Z",
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
  "command_id": "e95e8107-49e2-4483-bab6-e5214069aae3",
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
  "timestamp": "2026-10-29T17:09:15.000+0000",
  "channel": {
    "id": "1730052000.1139330095",
    "linkedid": "1730052000.1139330095",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676904075"
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
  "timestamp": "2026-10-29T17:09:15.000+0000",
  "channel": {
    "id": "1730052000.1139330095",
    "linkedid": "1730052000.1139330095",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676904075"
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
  "session_id": "93abfd6a-8339-4186-acb4-80d483cdedd9",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NTYsImlhdCI6MTc5MzI5Mzc1NiwianRpIjoiYmMwZjFkYzAtY2YzZS00NzUxLWJiMDYtY2JkOWYzZDFjNGY1Iiwic2lkIjoiOTNhYmZkNmEtODMzOS00MTg2LWFjYjQtODBkNDgzY2RlZGQ5In0.O7oJXYyrJtGciVQr9lUIjojcR7SSdOYR2FU_TFenOQE",
  "access_expires_at": "2026-10-29T17:24:16.217524079Z",
  "refresh_token": "tZs2zlLbMtx11rUxHOg-w2bIz_9Iq28wxF9vgbnNJhE",
  "refresh_expires_at": "2026-10-30T05:09:16.216879147Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "3dcdd92e-6ace-4dad-befc-3220dba7f697",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676904075",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T17:09:15Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/3dcdd92e-6ace-4dad-befc-3220dba7f697/answer` → **200**

```json
{
  "command_id": "b7caee0e-35b6-4ef1-9fd6-a49501b5d8f6"
}
```

```json
{
  "id": "3dcdd92e-6ace-4dad-befc-3220dba7f697",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676904075",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "order_ids": [],
  "started_at": "2026-10-29T17:09:15Z",
  "answered_at": "2026-10-29T17:09:16.82553Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1139330095",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "28b5be6e-5f1d-4c36-924b-5e687c17d264",
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
  "id": "548c149b-73c2-4ab2-9553-c80b02097275",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:17.149513Z",
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
  "command_id": "16ac346f-ef2e-40f7-beb1-d968bd561055",
  "quote_id": "548c149b-73c2-4ab2-9553-c80b02097275",
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
    "phone": "+380676904075"
  },
  "call_id": "3dcdd92e-6ace-4dad-befc-3220dba7f697"
}
```

```json
{
  "id": "c5be6acd-5b70-4a1b-94b8-c98cd784950e",
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
  "created_at": "2026-10-29T17:09:17.451654Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676904075"
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
    "id": "1730052000.1139330095",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3dcdd92e-6ace-4dad-befc-3220dba7f697",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676904075",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [
        "c5be6acd-5b70-4a1b-94b8-c98cd784950e"
      ],
      "started_at": "2026-10-29T17:09:15Z",
      "answered_at": "2026-10-29T17:09:16.82553Z",
      "ended_at": "2026-10-29T17:09:17.795323Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f4010910-acff-413e-8d6a-e13288338964",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673165891",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [],
      "started_at": "2026-10-29T17:06:48.114674Z",
      "answered_at": "2026-10-29T17:06:48.44839Z",
      "ended_at": "2026-10-29T17:06:48.762799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:06:53.205743Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/c5be6acd-5b70-4a1b-94b8-c98cd784950e` → **200**

```json
{
  "id": "c5be6acd-5b70-4a1b-94b8-c98cd784950e",
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
  "created_at": "2026-10-29T17:09:17.451654Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676904075"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c5be6acd-5b70-4a1b-94b8-c98cd784950e` → **200**

```json
{
  "id": "c5be6acd-5b70-4a1b-94b8-c98cd784950e",
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
  "created_at": "2026-10-29T17:09:17.451654Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676904075"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c5be6acd-5b70-4a1b-94b8-c98cd784950e/cancel` → **200**

```json
{
  "command_id": "f24ca30f-3055-4c31-8c46-a38a1b48bc83",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c5be6acd-5b70-4a1b-94b8-c98cd784950e",
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
  "created_at": "2026-10-29T17:09:17.451654Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676904075"
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

Done: call 3dcdd92e-6ace-4dad-befc-3220dba7f697 with order c5be6acd-5b70-4a1b-94b8-c98cd784950e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32417"
}
```

```json
{
  "challenge_id": "3e531624-a9cb-4017-bcf5-ec900d5783ac",
  "expires_at": "2026-10-29T17:14:19.069976364Z",
  "resend_available_at": "2026-10-29T17:09:20.069976364Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "360985",
  "sent_at": "2026-10-29T17:09:19.073576092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e531624-a9cb-4017-bcf5-ec900d5783ac",
  "code": "360985",
  "device_ref": "sandbox-32417"
}
```

```json
{
  "session_id": "da88e371-9bcf-479f-a5d4-ebe1c9bfefe4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDY1OSwiaWF0IjoxNzkzMjkzNzU5LCJqdGkiOiI0MjI5ZDhjMC02Yjc4LTRlOTMtYTE4ZC1hMjRiMDVmMTI1MDgiLCJzaWQiOiJkYTg4ZTM3MS05YmNmLTQ3OWYtYTVkNC1lYmUxYzliZmVmZTQifQ.-SxL4suA165pChQ_paJZDkTvvOpnH0dMQpa58p_xdco",
  "access_expires_at": "2026-10-29T17:24:19.416490209Z",
  "refresh_token": "bF_bl0UIIyOJaXkPXot4stRosyY3yfceXQaP4FgQLQc",
  "refresh_expires_at": "2026-11-28T17:09:19.415906542Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:06.542671Z",
  "last_location_at": "2026-10-29T17:09:06.542671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/handover` → **200**

```json
{
  "command_id": "83324865-6c62-4ab4-9fad-ed3c7346b06b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:06.542671Z",
  "last_location_at": "2026-10-29T17:09:06.542671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:20Z",
    "sequence": 1793293760302
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:20.322389Z",
  "last_location_at": "2026-10-29T17:09:20.322389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663444657",
  "device_ref": "sandbox-15887"
}
```

```json
{
  "challenge_id": "130bdafc-7dac-4e7c-ad33-6606dd1f7dc5",
  "expires_at": "2026-10-29T17:14:20.624728227Z",
  "resend_available_at": "2026-10-29T17:09:21.624728227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663444657` → **200**

```json
{
  "phone": "+380663444657",
  "audience": "CLIENT",
  "code": "597379",
  "sent_at": "2026-10-29T17:09:20.627227233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "130bdafc-7dac-4e7c-ad33-6606dd1f7dc5",
  "code": "597379",
  "device_ref": "sandbox-15887"
}
```

```json
{
  "session_id": "0f401fe3-001b-405c-8ab0-d8b67ac8b997",
  "subject": {
    "type": "CLIENT",
    "id": "552ab014-911f-4e7f-82b9-6ba7a4dad27d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTJhYjAxNC05MTFmLTRlN2YtODJiOS02YmE3YTRkYWQyN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjYwLCJpYXQiOjE3OTMyOTM3NjAsImp0aSI6ImM3YTJkZjg2LTUzM2MtNDc3Zi1iNGY0LTU4ZTRmZjhiNWFhNCIsInNpZCI6IjBmNDAxZmUzLTAwMWItNDA1Yy04YWIwLWQ4YjY3YWM4Yjk5NyJ9.C2MExbOfQYFbYXeS1cFJWMKB6VQD_8dmBHW3rot1qcY",
  "access_expires_at": "2026-10-29T17:24:20.948974863Z",
  "refresh_token": "qLBRhZy75px0JCgeKoGCQD8P79w8_Tw4WpgRFtIqg3k",
  "refresh_expires_at": "2026-11-28T17:09:20.948355615Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab7c4403-2401-4384-a2fb-67798b824ac9",
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
  "id": "2ab27ba0-34d0-4fa4-b954-65bb7c8eaf60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:21.246903Z",
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
  "command_id": "df240c53-22ad-47ce-927e-6b0f21075f8b",
  "quote_id": "2ab27ba0-34d0-4fa4-b954-65bb7c8eaf60",
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
  "id": "239cea96-212a-4187-af93-8d7adb4b25f3",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "552ab014-911f-4e7f-82b9-6ba7a4dad27d",
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
  "created_at": "2026-10-29T17:09:21.561256Z",
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
    "id": "a3d2cad3-3670-468f-b5c9-938c92beaa23",
    "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
    "expires_at": "2026-10-29T17:09:36.564126Z",
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

`POST /api/driver/v1/offers/a3d2cad3-3670-468f-b5c9-938c92beaa23/accept` → **200**

```json
{
  "command_id": "c01ffb05-4ecb-475b-90bc-4a028cf3fbf0"
}
```

```json
{
  "id": "b2402acc-cced-4855-80f7-7cdf3d066b30",
  "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "58fdffaa-54da-4b5b-8ea9-0ed02c2a984c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "58fdffaa-54da-4b5b-8ea9-0ed02c2a984c",
  "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
  "assignment_id": "b2402acc-cced-4855-80f7-7cdf3d066b30",
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

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:22Z",
    "sequence": 1793293762759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:22.778952Z",
  "last_location_at": "2026-10-29T17:09:22.778952Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/58fdffaa-54da-4b5b-8ea9-0ed02c2a984c/arrive` → **200**

```json
{
  "command_id": "70aeca15-359a-4e2e-a5eb-2f6ef35531e2",
  "expected_version": 0
}
```

```json
{
  "id": "58fdffaa-54da-4b5b-8ea9-0ed02c2a984c",
  "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
  "assignment_id": "b2402acc-cced-4855-80f7-7cdf3d066b30",
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
  "arrived_at": "2026-10-29T17:09:23.082992Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/58fdffaa-54da-4b5b-8ea9-0ed02c2a984c/start` → **200**

```json
{
  "command_id": "4bd36d4b-e251-458a-bac8-c8463b5489f6",
  "expected_version": 1
}
```

```json
{
  "id": "58fdffaa-54da-4b5b-8ea9-0ed02c2a984c",
  "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
  "assignment_id": "b2402acc-cced-4855-80f7-7cdf3d066b30",
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
  "arrived_at": "2026-10-29T17:09:23.082992Z",
  "started_at": "2026-10-29T17:09:23.403231Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:23Z",
    "sequence": 1793293763704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:23.72358Z",
  "last_location_at": "2026-10-29T17:09:23.72358Z",
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
  "device_ref": "sandbox-9148"
}
```

```json
{
  "challenge_id": "97802604-94af-469a-9b25-3d187d072191",
  "expires_at": "2026-10-29T17:14:24.017673685Z",
  "resend_available_at": "2026-10-29T17:09:25.017673685Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "667077",
  "sent_at": "2026-10-29T17:09:24.020531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97802604-94af-469a-9b25-3d187d072191",
  "code": "667077",
  "device_ref": "sandbox-9148"
}
```

```json
{
  "session_id": "a8996eb0-5f8f-4b3e-abdb-73dca17761a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDY2NCwiaWF0IjoxNzkzMjkzNzY0LCJqdGkiOiJhMzdmNTRkNS00M2U1LTQ2MzgtYmVmYS0zOWM3Mjg5ZDg2NzQiLCJzaWQiOiJhODk5NmViMC01ZjhmLTRiM2UtYWJkYi03M2RjYTE3NzYxYTgifQ.EqoPsWeDUgN0zrhRTDtacqT_smET8DV0T-j1yffPB6Y",
  "access_expires_at": "2026-10-29T17:24:24.352756391Z",
  "refresh_token": "ElkHtALmi4Gnh610XZOwvKNcw3omKEGDEDtVYz1th1Q",
  "refresh_expires_at": "2026-11-28T17:09:24.352084504Z",
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
  "command_id": "11cccaf7-c978-4d07-83f6-732cb615b852",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:24Z",
    "sequence": 1793293764927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3640e0a5-8e3c-40ac-aac7-fc1b7d45c5ed",
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
  "last_heartbeat_at": "2026-10-29T17:09:24.946741Z",
  "last_location_at": "2026-10-29T17:09:24.946741Z",
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
  "session_id": "cc950683-0f9a-4de6-b49e-938cf72e3f4a",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NjUsImlhdCI6MTc5MzI5Mzc2NSwianRpIjoiMWE1OGMwNjEtNTI3MS00NTRhLTg3NmItMTEwZjk5YWYxODAzIiwic2lkIjoiY2M5NTA2ODMtMGY5YS00ZGU2LWI0OWUtOTM4Y2Y3MmUzZjRhIn0.IuIxhFJwCRObKFKtOX8conEOYCBr-x8NurULUNA6boQ",
  "access_expires_at": "2026-10-29T17:24:25.530206162Z",
  "refresh_token": "vOwIlCZouVE4_77keOmhbiMsQ8jeAiP1QB6zOlctUok",
  "refresh_expires_at": "2026-10-30T05:09:25.529552789Z",
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
  "session_id": "02033211-e166-4d58-8c7c-a0e5bd11974c",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NjYsImlhdCI6MTc5MzI5Mzc2NiwianRpIjoiMzBjN2Y1ZmEtMGM3OC00N2JhLWJiMTMtMmNhZDRlODEyNzdhIiwic2lkIjoiMDIwMzMyMTEtZTE2Ni00ZDU4LThjN2MtYTBlNWJkMTE5NzRjIn0.9tH_J2dLkchFiLKw5vOHoGiiqS9Vvo43OpoJa7gAW7Q",
  "access_expires_at": "2026-10-29T17:24:26.116209449Z",
  "refresh_token": "B1xQv1ttrl4gm9WTOlxBZ16s4FYHLGv98StSLjFQMVw",
  "refresh_expires_at": "2026-10-30T05:09:26.115608207Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/239cea96-212a-4187-af93-8d7adb4b25f3` → **200**

```json
{
  "id": "239cea96-212a-4187-af93-8d7adb4b25f3",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "552ab014-911f-4e7f-82b9-6ba7a4dad27d",
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
    "id": "b2402acc-cced-4855-80f7-7cdf3d066b30",
    "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "58fdffaa-54da-4b5b-8ea9-0ed02c2a984c",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T17:09:21.561256Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/239cea96-212a-4187-af93-8d7adb4b25f3/interrupt` → **200**

```json
{
  "command_id": "af51b3ec-4fd8-4c58-abbf-8e380030702e",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "239cea96-212a-4187-af93-8d7adb4b25f3",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "552ab014-911f-4e7f-82b9-6ba7a4dad27d",
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
      "id": "b2402acc-cced-4855-80f7-7cdf3d066b30",
      "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "58fdffaa-54da-4b5b-8ea9-0ed02c2a984c",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T17:09:21.561256Z",
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
    "id": "9275a721-455c-4c4f-980e-6dffdd824a18",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "552ab014-911f-4e7f-82b9-6ba7a4dad27d",
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
    "id": "2962b075-f89f-4769-beea-8c8b82f51945",
    "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
    "expires_at": "2026-10-29T17:09:41.740068Z",
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

`POST /api/driver/v1/offers/2962b075-f89f-4769-beea-8c8b82f51945/accept` → **200**

```json
{
  "command_id": "751a3424-321b-48da-a0b4-c078db44dfb7"
}
```

```json
{
  "id": "9b9e0fae-0147-4763-b9f6-21c4b2c2ab49",
  "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c36d01f3-268c-4226-8742-23bd177f22df",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c36d01f3-268c-4226-8742-23bd177f22df",
  "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
  "assignment_id": "9b9e0fae-0147-4763-b9f6-21c4b2c2ab49",
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
  "session_id": "3640e0a5-8e3c-40ac-aac7-fc1b7d45c5ed",
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
  "last_heartbeat_at": "2026-10-29T17:09:24.946741Z",
  "last_location_at": "2026-10-29T17:09:24.946741Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3640e0a5-8e3c-40ac-aac7-fc1b7d45c5ed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:28Z",
    "sequence": 1793293768249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3640e0a5-8e3c-40ac-aac7-fc1b7d45c5ed",
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
  "last_heartbeat_at": "2026-10-29T17:09:28.270532Z",
  "last_location_at": "2026-10-29T17:09:28.270532Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c36d01f3-268c-4226-8742-23bd177f22df/arrive` → **200**

```json
{
  "command_id": "c16184b3-409b-4e21-ab3a-6050dba01aa1",
  "expected_version": 0
}
```

```json
{
  "id": "c36d01f3-268c-4226-8742-23bd177f22df",
  "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
  "assignment_id": "9b9e0fae-0147-4763-b9f6-21c4b2c2ab49",
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
  "arrived_at": "2026-10-29T17:09:28.574014Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c36d01f3-268c-4226-8742-23bd177f22df/start` → **200**

```json
{
  "command_id": "1abc574d-220f-4539-9152-a6cadf080e4a",
  "expected_version": 1
}
```

```json
{
  "id": "c36d01f3-268c-4226-8742-23bd177f22df",
  "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
  "assignment_id": "9b9e0fae-0147-4763-b9f6-21c4b2c2ab49",
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
  "arrived_at": "2026-10-29T17:09:28.574014Z",
  "started_at": "2026-10-29T17:09:28.872107Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c36d01f3-268c-4226-8742-23bd177f22df/complete` → **200**

```json
{
  "command_id": "d21317e3-f05a-45ca-baa0-fb519142b40a",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:09:29Z"
}
```

```json
{
  "id": "c36d01f3-268c-4226-8742-23bd177f22df",
  "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
  "assignment_id": "9b9e0fae-0147-4763-b9f6-21c4b2c2ab49",
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
  "arrived_at": "2026-10-29T17:09:28.574014Z",
  "started_at": "2026-10-29T17:09:28.872107Z",
  "completed_at": "2026-10-29T17:09:29.169739Z",
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
    "id": "9275a721-455c-4c4f-980e-6dffdd824a18",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T17:09:26.730322Z",
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
    "id": "239cea96-212a-4187-af93-8d7adb4b25f3",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T17:09:21.561256Z",
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

`GET /api/operator/v1/orders/239cea96-212a-4187-af93-8d7adb4b25f3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:09:21.561745Z",
      "actor": {
        "type": "CLIENT",
        "id": "552ab014-911f-4e7f-82b9-6ba7a4dad27d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
        "quote_id": "2ab27ba0-34d0-4fa4-b954-65bb7c8eaf60",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "272ff6f1-78ed-4880-af4c-8a8d22f239dd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:09:21.563496Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
        "attempt_id": "6f4536ca-8e4b-42a9-99c4-81245d4918b4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "272ff6f1-78ed-4880-af4c-8a8d22f239dd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:09:21.570128Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a3d2cad3-3670-468f-b5c9-938c92beaa23",
        "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "272ff6f1-78ed-4880-af4c-8a8d22f239dd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T17:09:22.18382Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a3d2cad3-3670-468f-b5c9-938c92beaa23",
        "order_id": "239cea96-212a-4187-af93-8d7adb4b25f3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b2402acc-cced-4855-80f7-7cdf3d066b30"
      },
      "correlation_id": "f77987f0-376a-4947-8a96-554a3a844689"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/9275a721-455c-4c4f-980e-6dffdd824a18/tip` → **200**

```json
{
  "order_id": "9275a721-455c-4c4f-980e-6dffdd824a18",
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
  "available_until": "2026-10-30T17:09:29.169739Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/9275a721-455c-4c4f-980e-6dffdd824a18/tip` → **409**

```json
{
  "command_id": "61617df8-54ad-42c8-9f62-541091df309d",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/9275a721-455c-4c4f-980e-6dffdd824a18/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7cd2cb9e-95b3-4335-b7b8-a57096dc8da5"
}
```

Done: interrupted 239cea96-212a-4187-af93-8d7adb4b25f3, follow-up 9275a721-455c-4c4f-980e-6dffdd824a18.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6918d693-8ea4-45e4-bfab-59db6c144bac",
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
  "last_heartbeat_at": "2026-10-29T17:09:23.72358Z",
  "last_location_at": "2026-10-29T17:09:23.72358Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6918d693-8ea4-45e4-bfab-59db6c144bac/close` → **200**

```json
{
  "command_id": "e633e15b-fb7b-4ea7-a468-e17bc386eda6",
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
  "session_id": "3640e0a5-8e3c-40ac-aac7-fc1b7d45c5ed",
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
  "last_heartbeat_at": "2026-10-29T17:09:28.270532Z",
  "last_location_at": "2026-10-29T17:09:28.270532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3640e0a5-8e3c-40ac-aac7-fc1b7d45c5ed/close` → **200**

```json
{
  "command_id": "352ca047-4429-4e5b-a334-4c2c0f105fcb",
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
  "session_id": "108abee5-4e44-4689-8671-e4e2a2526606",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2NzUsImlhdCI6MTc5MzI5Mzc3NSwianRpIjoiYWYxZGNiY2YtNGU2NS00MTY5LTk1ZmMtYjc1NWY4N2M3MmE3Iiwic2lkIjoiMTA4YWJlZTUtNGU0NC00Njg5LTg2NzEtZTRlMmEyNTI2NjA2In0.YtZKu5G4Meq9dP7eLWCW8hPSrf1hMIzTvTVVDfWKx-k",
  "access_expires_at": "2026-10-29T17:24:35.427974572Z",
  "refresh_token": "m-TAzNs0QMGBgK0aO_Za1ate9l4o8AwgW3vFEgA8w0M",
  "refresh_expires_at": "2026-10-30T05:09:35.427195541Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1a43352e-8ee2-4072-ae7d-c664fba9b99b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:09:35Z"
}
```

```json
{
  "id": "bf1eb20a-2941-451e-a106-91eb4c6d64b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:09:35Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/bf1eb20a-2941-451e-a106-91eb4c6d64b6/publish` → **200**

```json
{
  "command_id": "d8db7085-0826-4917-884b-62a2cf894d5b",
  "expected_version": 0
}
```

```json
{
  "id": "bf1eb20a-2941-451e-a106-91eb4c6d64b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:09:36.027791Z",
  "published_at": "2026-10-29T17:09:36.027791Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "bf1eb20a-2941-451e-a106-91eb4c6d64b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T17:09:36.027791Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632559836",
  "device_ref": "sandbox-15049"
}
```

```json
{
  "challenge_id": "ea5214fd-b203-474d-aac2-6627092dc707",
  "expires_at": "2026-10-29T17:14:36.593865849Z",
  "resend_available_at": "2026-10-29T17:09:37.593865849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632559836` → **200**

```json
{
  "phone": "+380632559836",
  "audience": "CLIENT",
  "code": "960776",
  "sent_at": "2026-10-29T17:09:36.596455983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea5214fd-b203-474d-aac2-6627092dc707",
  "code": "960776",
  "device_ref": "sandbox-15049"
}
```

```json
{
  "session_id": "8df1ecc3-e0ae-452a-a831-5f6be8107d13",
  "subject": {
    "type": "CLIENT",
    "id": "7ffd7c09-9575-4047-a33e-4d3fb3073a9c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZmZkN2MwOS05NTc1LTQwNDctYTMzZS00ZDNmYjMwNzNhOWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0Njc2LCJpYXQiOjE3OTMyOTM3NzYsImp0aSI6ImYxNWI4NDQwLWNjNjEtNDcxZC1hNTM0LTMwZjQwN2VlNDhhNSIsInNpZCI6IjhkZjFlY2MzLWUwYWUtNDUyYS1hODMxLTVmNmJlODEwN2QxMyJ9.WYTPegT6JFaJ8vxe3wJRxrmKHSzmUVWqVDE2uOkBVlY",
  "access_expires_at": "2026-10-29T17:24:36.910041497Z",
  "refresh_token": "5sueXTjsJ15jvqfIVjd8URy9HujcnHP5d3PiFrIUgYc",
  "refresh_expires_at": "2026-11-28T17:09:36.909524333Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "bf1eb20a-2941-451e-a106-91eb4c6d64b6",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T17:09:36.027791Z",
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
  "command_id": "7ad7c97f-bcf6-4ab3-8a7e-6dbec53d0c27",
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
  "id": "6713714b-d174-4911-a861-b6e30d489ff8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:37.480288Z",
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
  "command_id": "f8457b4b-4869-4c85-8aee-15e4c816c2ba",
  "quote_id": "6713714b-d174-4911-a861-b6e30d489ff8",
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
  "correlation_id": "d039de66-92f6-4fc2-98b4-a6507764ac7b"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "9b6a437c-ac2f-4e3b-94c3-297f00612b49",
  "version_id": "bf1eb20a-2941-451e-a106-91eb4c6d64b6",
  "language": "uk"
}
```

```json
{
  "version_id": "bf1eb20a-2941-451e-a106-91eb4c6d64b6",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T17:09:38.093233Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bae9555e-6a9b-4dc7-8813-2b5d9554b1b9",
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
  "id": "515b3917-74d4-484c-8232-556260e4bdc6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:38.382827Z",
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
  "command_id": "223c3bd8-5d3c-4b8e-a1e5-3c82d1889058",
  "quote_id": "515b3917-74d4-484c-8232-556260e4bdc6",
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
  "id": "8ccc15e8-c704-4824-bb26-d91a9fc15302",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7ffd7c09-9575-4047-a33e-4d3fb3073a9c",
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
  "created_at": "2026-10-29T17:09:38.681878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ccc15e8-c704-4824-bb26-d91a9fc15302` → **200**

```json
{
  "id": "8ccc15e8-c704-4824-bb26-d91a9fc15302",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7ffd7c09-9575-4047-a33e-4d3fb3073a9c",
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
  "created_at": "2026-10-29T17:09:38.681878Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8ccc15e8-c704-4824-bb26-d91a9fc15302/cancel` → **200**

```json
{
  "command_id": "a541222b-2cc6-4017-bce3-2a1dd98d0f35",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8ccc15e8-c704-4824-bb26-d91a9fc15302",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7ffd7c09-9575-4047-a33e-4d3fb3073a9c",
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
  "created_at": "2026-10-29T17:09:38.681878Z",
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

`POST /api/admin/v1/legal-documents/bf1eb20a-2941-451e-a106-91eb4c6d64b6` → **409**

```json
{
  "command_id": "a294b5b4-09c4-433a-a1c4-ac7962532511",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:09:39Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/bf1eb20a-2941-451e-a106-91eb4c6d64b6",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "42301823-55ed-4f99-ba01-44822843151d"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "4d0fbfac-d118-4f72-985c-2f33066543f5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T17:09:39Z"
}
```

```json
{
  "id": "587f8776-d21e-430d-a01d-79d42f11aabd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T17:09:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/587f8776-d21e-430d-a01d-79d42f11aabd/publish` → **200**

```json
{
  "command_id": "216dc6b1-0b6e-4f36-b063-7e006199e5b6",
  "expected_version": 0
}
```

```json
{
  "id": "587f8776-d21e-430d-a01d-79d42f11aabd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T17:09:40.218741Z",
  "published_at": "2026-10-29T17:09:40.218741Z",
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
  "device_ref": "sandbox-93"
}
```

```json
{
  "challenge_id": "bb815e49-aa07-46fd-975d-ba599a9de8ec",
  "expires_at": "2026-10-29T17:14:40.517012986Z",
  "resend_available_at": "2026-10-29T17:09:41.517012986Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "813391",
  "sent_at": "2026-10-29T17:09:40.519821584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb815e49-aa07-46fd-975d-ba599a9de8ec",
  "code": "813391",
  "device_ref": "sandbox-93"
}
```

```json
{
  "session_id": "775b290c-861a-43d0-ba06-5f36fcf942c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDY4MCwiaWF0IjoxNzkzMjkzNzgwLCJqdGkiOiJlMzdjMGZhOS03NGFlLTQ4YTktYWJhNy1hOGQwNzJkMDg0NTIiLCJzaWQiOiI3NzViMjkwYy04NjFhLTQzZDAtYmEwNi01ZjM2ZmNmOTQyYzIifQ.dxQO94-grgc6uYyui7GxwR47WnSMg6WLDc_2RIq7F5U",
  "access_expires_at": "2026-10-29T17:24:40.83080512Z",
  "refresh_token": "apwq_W5CKLlZGnH5UcllhXIxuEraspSTe8DgDdP6Wx0",
  "refresh_expires_at": "2026-11-28T17:09:40.830153948Z",
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
  "command_id": "a688408d-1ee4-48d1-8eef-bd24f36386c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:41Z",
    "sequence": 1793293781400
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "252ad830-a03e-4853-9887-4720922b4136",
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
  "last_heartbeat_at": "2026-10-29T17:09:41.419056Z",
  "last_location_at": "2026-10-29T17:09:41.419056Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677471514",
  "device_ref": "sandbox-14867"
}
```

```json
{
  "challenge_id": "d5e5b19b-1157-4e86-a039-daa5498e99ee",
  "expires_at": "2026-10-29T17:14:41.716441358Z",
  "resend_available_at": "2026-10-29T17:09:42.716441358Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677471514` → **200**

```json
{
  "phone": "+380677471514",
  "audience": "CLIENT",
  "code": "712411",
  "sent_at": "2026-10-29T17:09:41.719092993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5e5b19b-1157-4e86-a039-daa5498e99ee",
  "code": "712411",
  "device_ref": "sandbox-14867"
}
```

```json
{
  "session_id": "016e91ea-66f1-40e9-a857-41c00a52e90c",
  "subject": {
    "type": "CLIENT",
    "id": "53d754d2-225f-46f1-a443-afeeb2716645"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2Q3NTRkMi0yMjVmLTQ2ZjEtYTQ0My1hZmVlYjI3MTY2NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NjgyLCJpYXQiOjE3OTMyOTM3ODIsImp0aSI6ImZkYTExY2I5LTRhZmQtNDdhMS04M2Y2LTVlYjgwNDU4Y2UwYiIsInNpZCI6IjAxNmU5MWVhLTY2ZjEtNDBlOS1hODU3LTQxYzAwYTUyZTkwYyJ9.3Q8pnAtzua2pF2Z0Qu2-Vjqtjcxu4MNf4o70_W0jhhk",
  "access_expires_at": "2026-10-29T17:24:42.035151252Z",
  "refresh_token": "irVDtSIOYIl5BHtms9oAqVh2X2NHLgk9mpHTO1sM_Io",
  "refresh_expires_at": "2026-11-28T17:09:42.034608621Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fd33f2cd-3412-4451-aee0-a9374af1b3d9",
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
  "id": "184d3b6d-10b2-49bf-bea7-8e647ed47995",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:42.334045Z",
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
  "command_id": "26a3b6ea-ce14-49a0-b6a9-a30c0d6fdae4",
  "quote_id": "184d3b6d-10b2-49bf-bea7-8e647ed47995",
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
    "phone": "+380674293884"
  }
}
```

```json
{
  "id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:09:42.633919Z",
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
    "id": "6723a24a-33b7-47b3-9d87-77759ec07901",
    "order_id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
    "expires_at": "2026-10-29T17:09:57.637303Z",
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

`POST /api/driver/v1/offers/6723a24a-33b7-47b3-9d87-77759ec07901/accept` → **200**

```json
{
  "command_id": "54636236-b3bd-4e12-85d7-abc0a95ef47e"
}
```

```json
{
  "id": "7c0211b9-5807-4658-b0ba-370558a36518",
  "order_id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37b709d7-b508-4365-9cdd-ea107b349fb4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37b709d7-b508-4365-9cdd-ea107b349fb4",
  "order_id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
  "assignment_id": "7c0211b9-5807-4658-b0ba-370558a36518",
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
    "phone": "+380674293884"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db587077-2c73-45e3-9832-f7b6afe76d4f",
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
  "id": "dc721379-6c9c-46f3-8a11-4f1bb6415112",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:43.831148Z",
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
  "command_id": "504581e0-a40f-45d6-a908-06888f69e51d",
  "quote_id": "dc721379-6c9c-46f3-8a11-4f1bb6415112",
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
  "id": "02a30840-e82c-4257-b9f1-ed2768b14d62",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:09:44.12489Z",
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
  "command_id": "5e2b982b-e39d-45d3-a7ce-5b4b1780f585",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T20:09:44Z"
}
```

```json
{
  "id": "4412ffd0-1295-4751-af39-ccde48c6ecb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:44.441125Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T20:09:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "30257548-abe9-4ce0-b300-cc308b943220",
  "quote_id": "4412ffd0-1295-4751-af39-ccde48c6ecb4",
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
  "pickup_at": "2026-10-29T20:09:44Z"
}
```

```json
{
  "id": "28811a1e-d746-4d7b-b96a-510627aefa76",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T17:09:44.754819Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T20:09:44Z",
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
  "command_id": "96c614d2-cdc5-4e8f-bdeb-7c547d0a7cf7",
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
  "id": "a14c1621-d5e0-4213-ade6-4c1348b76f75",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:45.068774Z",
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
  "command_id": "f7802652-0ec9-473b-9de6-8cd81c161917",
  "quote_id": "a14c1621-d5e0-4213-ade6-4c1348b76f75",
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
  "correlation_id": "ff8ca5c7-b777-432f-a333-96996e94d384"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "28811a1e-d746-4d7b-b96a-510627aefa76",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T17:09:44.754819Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T20:09:44Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "02a30840-e82c-4257-b9f1-ed2768b14d62",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T17:09:44.12489Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "02a30840-e82c-4257-b9f1-ed2768b14d62",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:09:44.12489Z",
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

`GET /api/rider/v1/orders/ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9` → **200**

```json
{
  "id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7c0211b9-5807-4658-b0ba-370558a36518",
    "order_id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "37b709d7-b508-4365-9cdd-ea107b349fb4",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T17:09:42.633919Z",
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
    "location_at": "2026-10-29T17:09:41.419056Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9/cancel` → **200**

```json
{
  "command_id": "9c646fea-74b2-4f4d-8bda-99a6345f59be",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7c0211b9-5807-4658-b0ba-370558a36518",
    "order_id": "ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "37b709d7-b508-4365-9cdd-ea107b349fb4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T17:09:42.633919Z",
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

`GET /api/rider/v1/orders/02a30840-e82c-4257-b9f1-ed2768b14d62` → **200**

```json
{
  "id": "02a30840-e82c-4257-b9f1-ed2768b14d62",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:09:44.12489Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/02a30840-e82c-4257-b9f1-ed2768b14d62/cancel` → **200**

```json
{
  "command_id": "3b3ef756-adab-4161-a488-842397f89daf",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "02a30840-e82c-4257-b9f1-ed2768b14d62",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:09:44.12489Z",
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

`GET /api/rider/v1/orders/28811a1e-d746-4d7b-b96a-510627aefa76` → **200**

```json
{
  "id": "28811a1e-d746-4d7b-b96a-510627aefa76",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T17:09:44.754819Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T20:09:44Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/28811a1e-d746-4d7b-b96a-510627aefa76/cancel` → **200**

```json
{
  "command_id": "aff74a51-e597-42e9-a935-c667de837c5a",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "28811a1e-d746-4d7b-b96a-510627aefa76",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "53d754d2-225f-46f1-a443-afeeb2716645",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T17:09:44.754819Z",
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
  "pickup_at": "2026-10-29T20:09:44Z",
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
  "session_id": "252ad830-a03e-4853-9887-4720922b4136",
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
  "last_heartbeat_at": "2026-10-29T17:09:41.419056Z",
  "last_location_at": "2026-10-29T17:09:41.419056Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/252ad830-a03e-4853-9887-4720922b4136/close` → **200**

```json
{
  "command_id": "4596fbf8-835c-406e-87c2-8f0399052b3a",
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

Done: orders ae3b0f4c-76c3-4e23-b696-2fb33aaba1f9, 02a30840-e82c-4257-b9f1-ed2768b14d62, 28811a1e-d746-4d7b-b96a-510627aefa76.

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
  "session_id": "b32b0acb-a1ea-46e9-b896-5f760c31cfd0",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2ODgsImlhdCI6MTc5MzI5Mzc4OCwianRpIjoiMjI3NmQ1YjAtYzYzMS00ZWZkLWI5NjQtYjNmNDE0ODRjZWI4Iiwic2lkIjoiYjMyYjBhY2ItYTFlYS00NmU5LWI4OTYtNWY3NjBjMzFjZmQwIn0.5uu-IlmEVApugYYzHPRrogUa_gChbfH4HXXa8doWACU",
  "access_expires_at": "2026-10-29T17:24:48.901491622Z",
  "refresh_token": "U0DOkKk6Nvo6Su09oHAmt7YXezDfXhqe3NPXiB5lhOg",
  "refresh_expires_at": "2026-10-30T05:09:48.900974187Z",
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
  "session_id": "a20d034e-2aa1-42e2-b537-071a94a47129",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ2ODksImlhdCI6MTc5MzI5Mzc4OSwianRpIjoiYTJhMzkwYjYtODZiZC00YTk3LWFmYjItZGFkMDM5YzY1ZTRkIiwic2lkIjoiYTIwZDAzNGUtMmFhMS00MmUyLWI1MzctMDcxYTk0YTQ3MTI5In0.EpK7OJIysNZCAY-r9S-AbrX_G4FKjGKx46DOIu-dAaI",
  "access_expires_at": "2026-10-29T17:24:49.472682161Z",
  "refresh_token": "DEVfcgqZTueKcnEu6srmA-6jYVug_4U4xFZEOqBwDTA",
  "refresh_expires_at": "2026-10-30T05:09:49.472048753Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16151"
}
```

```json
{
  "challenge_id": "35f84ba2-8438-435c-92bf-abef9467e4bd",
  "expires_at": "2026-10-29T17:14:49.790681095Z",
  "resend_available_at": "2026-10-29T17:09:50.790681095Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "862996",
  "sent_at": "2026-10-29T17:09:49.793469435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35f84ba2-8438-435c-92bf-abef9467e4bd",
  "code": "862996",
  "device_ref": "sandbox-16151"
}
```

```json
{
  "session_id": "5bef3712-7a2a-4c3b-abda-afe38b4dd065",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDY5MCwiaWF0IjoxNzkzMjkzNzkwLCJqdGkiOiJhODNlN2IyNi0yMzZjLTQ0NWEtYmY0YS04ZjJiYjM4Y2Y0N2UiLCJzaWQiOiI1YmVmMzcxMi03YTJhLTRjM2ItYWJkYS1hZmUzOGI0ZGQwNjUifQ.YbdX4ez5em-zit_NQuZb7aNrif-O8O9Qo5nJE2Sz0QU",
  "access_expires_at": "2026-10-29T17:24:50.1240107Z",
  "refresh_token": "zheOEBuBz0wwEE_b--Je8J8EjUEkxd0kHXYZkEVHzA4",
  "refresh_expires_at": "2026-11-28T17:09:50.123445098Z",
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
  "command_id": "5f17240d-bc16-4768-b564-7efb2b93288c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:50Z",
    "sequence": 1793293790707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dadc9619-4747-42ee-ae83-3e44279de50a",
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
  "last_heartbeat_at": "2026-10-29T17:09:50.725559Z",
  "last_location_at": "2026-10-29T17:09:50.725559Z",
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
  "command_id": "2640fa33-7c72-4841-a9e1-41b67e4bb5a4",
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
  "effective_at": "2026-10-29T17:09:51.30827Z",
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T17:07:00.862493Z",
  "last_entries": [
    {
      "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T17:07:00.862493Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b7ec6bb5-9137-4ed4-8d7c-9fa8471cd9ea",
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
  "id": "52dc21cd-ce9d-40d0-8690-ec86da06b11d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:51.890431Z",
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
  "command_id": "a89b8178-d692-4e21-92fc-c761117c52ad",
  "quote_id": "52dc21cd-ce9d-40d0-8690-ec86da06b11d",
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
    "phone": "+3806711132410"
  }
}
```

```json
{
  "id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
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
  "created_at": "2026-10-29T17:09:52.186978Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132410"
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
    "id": "4ecbf914-df63-41e3-a2eb-7dd1876b2490",
    "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
    "expires_at": "2026-10-29T17:10:07.190911Z",
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

`POST /api/driver/v1/offers/4ecbf914-df63-41e3-a2eb-7dd1876b2490/accept` → **200**

```json
{
  "command_id": "098a1cf8-affe-45bf-a889-57f1b3fd5d02"
}
```

```json
{
  "id": "c49c6ff6-bdbc-4650-9c89-185b194c28ed",
  "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ac5abd12-8aa4-4b19-8385-a66f6d8202d6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ac5abd12-8aa4-4b19-8385-a66f6d8202d6",
  "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
  "assignment_id": "c49c6ff6-bdbc-4650-9c89-185b194c28ed",
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
    "phone": "+3806711132410"
  }
}
```

`POST /api/driver/v1/work-sessions/dadc9619-4747-42ee-ae83-3e44279de50a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:09:53Z",
    "sequence": 1793293793356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dadc9619-4747-42ee-ae83-3e44279de50a",
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
  "last_heartbeat_at": "2026-10-29T17:09:53.376892Z",
  "last_location_at": "2026-10-29T17:09:53.376892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ac5abd12-8aa4-4b19-8385-a66f6d8202d6/arrive` → **200**

```json
{
  "command_id": "a3c61d9d-7604-4ef9-81d6-1fd0fd3fadb6",
  "expected_version": 0
}
```

```json
{
  "id": "ac5abd12-8aa4-4b19-8385-a66f6d8202d6",
  "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
  "assignment_id": "c49c6ff6-bdbc-4650-9c89-185b194c28ed",
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
  "arrived_at": "2026-10-29T17:09:53.668603Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711132410"
  }
}
```

`POST /api/driver/v1/trips/ac5abd12-8aa4-4b19-8385-a66f6d8202d6/start` → **200**

```json
{
  "command_id": "b8d1f877-392c-4bef-bcff-8491280ecf59",
  "expected_version": 1
}
```

```json
{
  "id": "ac5abd12-8aa4-4b19-8385-a66f6d8202d6",
  "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
  "assignment_id": "c49c6ff6-bdbc-4650-9c89-185b194c28ed",
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
  "arrived_at": "2026-10-29T17:09:53.668603Z",
  "started_at": "2026-10-29T17:09:53.990813Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711132410"
  }
}
```

`POST /api/driver/v1/trips/ac5abd12-8aa4-4b19-8385-a66f6d8202d6/complete` → **200**

```json
{
  "command_id": "77e77063-6a4f-4666-b81f-4da06db4f39e",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:09:54Z",
  "cash_received": true
}
```

```json
{
  "id": "ac5abd12-8aa4-4b19-8385-a66f6d8202d6",
  "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
  "assignment_id": "c49c6ff6-bdbc-4650-9c89-185b194c28ed",
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
  "arrived_at": "2026-10-29T17:09:53.668603Z",
  "started_at": "2026-10-29T17:09:53.990813Z",
  "completed_at": "2026-10-29T17:09:54.300172Z",
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
  "command_id": "16c1d23c-1091-4fbf-8356-c4b7546ff3f9",
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
  "id": "114b38ff-9425-478d-b497-a17a678da693",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:14:54.601331Z",
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
  "command_id": "f062bfd0-a747-49b5-83e7-8264e6dbd4cc",
  "quote_id": "114b38ff-9425-478d-b497-a17a678da693",
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
    "phone": "+380671115334"
  }
}
```

```json
{
  "id": "fe62fa31-c2d0-4a59-a705-167060c5ef0d",
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
  "created_at": "2026-10-29T17:09:54.929021Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115334"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fe62fa31-c2d0-4a59-a705-167060c5ef0d` → **200**

```json
{
  "id": "fe62fa31-c2d0-4a59-a705-167060c5ef0d",
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
  "created_at": "2026-10-29T17:09:54.929021Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115334"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fe62fa31-c2d0-4a59-a705-167060c5ef0d/cancel` → **200**

```json
{
  "command_id": "34721b13-4f09-46bf-85ee-e552267c8185",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "fe62fa31-c2d0-4a59-a705-167060c5ef0d",
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
  "created_at": "2026-10-29T17:09:54.929021Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115334"
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
  "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T17:07:00.862493Z",
  "last_entries": [
    {
      "order_id": "fe62fa31-c2d0-4a59-a705-167060c5ef0d",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T17:09:55.559112Z"
    },
    {
      "order_id": "614085ad-6b12-4a0c-823d-85aa5d6ed6fd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T17:09:54.305474Z"
    },
    {
      "order_id": "ae54ff49-471d-4d0c-9c8d-0eac9f518e1e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T17:07:00.862493Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dadc9619-4747-42ee-ae83-3e44279de50a",
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
  "last_heartbeat_at": "2026-10-29T17:09:53.376892Z",
  "last_location_at": "2026-10-29T17:09:53.376892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dadc9619-4747-42ee-ae83-3e44279de50a/close` → **200**

```json
{
  "command_id": "d145b36c-0a29-4a5e-8c26-1b9e7db7ef6c",
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

Done: operator bonus for fulfilled 614085ad-6b12-4a0c-823d-85aa5d6ed6fd and operator-fault cancellation fe62fa31-c2d0-4a59-a705-167060c5ef0d.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671970140",
  "device_ref": "sandbox-11876"
}
```

```json
{
  "challenge_id": "b2ebcf83-0148-4a47-acfc-c816a0a03eb3",
  "expires_at": "2026-10-29T17:14:59.954930699Z",
  "resend_available_at": "2026-10-29T17:10:00.954930699Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671970140` → **200**

```json
{
  "phone": "+380671970140",
  "audience": "CLIENT",
  "code": "631146",
  "sent_at": "2026-10-29T17:09:59.957393073Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679690907",
  "device_ref": "sandbox-418",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "43978eca-95e2-4356-8899-1cd29e4f2a31",
  "expires_at": "2026-10-29T17:15:01.455482869Z",
  "resend_available_at": "2026-10-29T17:10:02.455482869Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679690907` → **200**

```json
{
  "phone": "+380679690907",
  "audience": "CLIENT",
  "code": "611927",
  "sent_at": "2026-10-29T17:10:01.458477903Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679690907",
  "device_ref": "sandbox-14742",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "33834278-c2e8-4953-ba36-c019441bff32",
  "expires_at": "2026-10-29T17:15:02.953995412Z",
  "resend_available_at": "2026-10-29T17:10:03.953995412Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679690907` → **200**

```json
{
  "phone": "+380679690907",
  "audience": "CLIENT",
  "code": "423304",
  "sent_at": "2026-10-29T17:10:02.956824236Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672100000",
  "device_ref": "sandbox-22337"
}
```

```json
{
  "challenge_id": "40522c4b-329d-4b6c-8a8c-eddb14fd15fb",
  "expires_at": "2026-10-29T17:15:04.463386954Z",
  "resend_available_at": "2026-10-29T17:10:05.463386954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672100000",
  "device_ref": "sandbox-27457"
}
```

```json
{
  "challenge_id": "2d80b501-e659-46ac-a968-fbf36c6b3135",
  "expires_at": "2026-10-29T17:15:05.948772811Z",
  "resend_available_at": "2026-10-29T17:10:06.948772811Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672100000` → **200**

```json
{
  "phone": "+380672100000",
  "audience": "CLIENT",
  "code": "415068",
  "sent_at": "2026-10-29T17:10:05.952126758Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672100000",
  "device_ref": "sandbox-17705",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7003b5c4-73f0-4b3f-bb10-fcd23fa4d182",
  "expires_at": "2026-10-29T17:15:07.46473721Z",
  "resend_available_at": "2026-10-29T17:10:08.46473721Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672100000` → **200**

```json
{
  "phone": "+380672100000",
  "audience": "CLIENT",
  "code": "097315",
  "sent_at": "2026-10-29T17:10:07.468544605Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380672100000",
  "device_ref": "sandbox-13705",
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
  "correlation_id": "26a84deb-59ef-41b9-af3c-5fe73b699daf",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000004409"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "7cc20798-9de9-4025-836f-eb89ce034494"
}
```

`GET /sandbox/v1/otp?phone=%2B442000004409` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120031505"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b0fb0426-82c6-44ac-895c-152bde37fdc9"
}
```

`GET /sandbox/v1/otp?phone=%2B37120031505` → **404**

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
  "session_id": "6523716e-5868-45a0-8709-d876ff5bc41d",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3MTAsImlhdCI6MTc5MzI5MzgxMCwianRpIjoiYTY1ZmE0ZTgtNGUxYi00OTViLThlY2EtYTBjZDcwMmQwOGQxIiwic2lkIjoiNjUyMzcxNmUtNTg2OC00NWEwLTg3MDktZDg3NmZmNWJjNDFkIn0.0cVeRnL-HTfjCulyhGUBo7k-HYsid1X5Csvr9xfPf5A",
  "access_expires_at": "2026-10-29T17:25:10.177639026Z",
  "refresh_token": "aqCERHY3bw8ZYpssP1WDTPKxXVE_Eb-lARZBxwOnawI",
  "refresh_expires_at": "2026-10-30T05:10:10.176994431Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672100000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8dfcb6e8-ac41-439f-912c-77d4c6d75b12",
      "challenge_id": "7003b5c4-73f0-4b3f-bb10-fcd23fa4d182",
      "phone": "+380672100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3500b666-392e-41f9-bd0d-8dd62545887c",
      "error": null,
      "attempted_at": "2026-10-29T17:10:07.468815Z"
    },
    {
      "id": "e6877fc5-8dec-404e-a1ba-71abdea4ff0b",
      "challenge_id": "2d80b501-e659-46ac-a968-fbf36c6b3135",
      "phone": "+380672100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a2e94ced-ded1-4913-90c1-17804f2e0987",
      "error": null,
      "attempted_at": "2026-10-29T17:10:05.952386Z"
    },
    {
      "id": "c9450c37-10cc-4205-a189-f99d0ef4dcc5",
      "challenge_id": "40522c4b-329d-4b6c-8a8c-eddb14fd15fb",
      "phone": "+380672100000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T17:10:04.465989Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672100000` → **200**

```json
{
  "phone": "+380672100000",
  "audience": "CLIENT",
  "code": "097315",
  "sent_at": "2026-10-29T17:10:07.468544605Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679690907` → **200**

```json
{
  "deliveries": [
    {
      "id": "37368d50-2cf8-414b-8b58-fc603afc91de",
      "challenge_id": "33834278-c2e8-4953-ba36-c019441bff32",
      "phone": "+380679690907",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-75f0f845-6025-438f-bda8-39cc6a60c714",
      "error": null,
      "attempted_at": "2026-10-29T17:10:02.95724Z"
    },
    {
      "id": "359fb9c8-f66b-4e7f-a4d8-e84c0094c8af",
      "challenge_id": "43978eca-95e2-4356-8899-1cd29e4f2a31",
      "phone": "+380679690907",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b21c8f6c-0b72-4aab-93be-a597810dc051",
      "error": null,
      "attempted_at": "2026-10-29T17:10:01.458901Z"
    }
  ]
}
```

Done: SMS to +380671970140; SMS then a call to +380679690907; a failed SMS, two calls and a refused third to +380672100000; +44 and +371 refused.

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
  "session_id": "62eca835-c71e-48b5-806c-31381b5b1619",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3MTEsImlhdCI6MTc5MzI5MzgxMSwianRpIjoiZDMxYTM0MjctZjU2ZS00ZTljLWE2MjYtOWE1NzgxYmUyMzVlIiwic2lkIjoiNjJlY2E4MzUtYzcxZS00OGI1LTgwNmMtMzEzODFiNWIxNjE5In0.vk6Az5_PFqmborympTdfakEmMmUfQ8ClhBRwbfCwFGY",
  "access_expires_at": "2026-10-29T17:25:11.358794523Z",
  "refresh_token": "wL1P3e4aspH5Nokgct1vc_7LpZ1Rll5569AWRdQiJ0s",
  "refresh_expires_at": "2026-10-30T05:10:11.358091835Z",
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
  "session_id": "5b8ffecb-fcfc-4a86-8f55-e9bf9d6c40b6",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3MTEsImlhdCI6MTc5MzI5MzgxMSwianRpIjoiOTM2ODYwODItMDljOC00ZThjLWEyMzAtYWI1YmE5ZDhlN2VhIiwic2lkIjoiNWI4ZmZlY2ItZmNmYy00YTg2LThmNTUtZTliZjlkNmM0MGI2In0.lv5vPlFYGddqiQXRaARhUSZrnHsmHCPcCXcGJ2WmseU",
  "access_expires_at": "2026-10-29T17:25:11.929336347Z",
  "refresh_token": "CTd9XRassE7Y_pYXL6ExZL8yoyDmKjVhLCwh-W8sFP8",
  "refresh_expires_at": "2026-10-30T05:10:11.928695744Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e",
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

`POST /api/admin/v1/staff-extensions/697d7752-12ef-4441-aa96-d99cb503c95e` → **200**

```json
{
  "command_id": "eb4ee493-a4fa-470b-bf6e-25528ad6545b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "fccaf613-e114-4efa-ba6d-bd30fb38f9be",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T17:10:13.051244Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T17:10:13.051244Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0ca81a89-85fa-46ae-aa80-8aa39452658a",
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
  "id": "b051a7fe-d1ba-44c7-be98-645075778026",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:15:13.636109Z",
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
  "command_id": "6417d965-7c8d-41e1-8b63-7410edae841c",
  "quote_id": "b051a7fe-d1ba-44c7-be98-645075778026",
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
    "phone": "+380674499029"
  }
}
```

```json
{
  "id": "5ad605ad-d8a6-4dc8-9f01-11afc6274596",
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
  "created_at": "2026-10-29T17:10:13.939988Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674499029"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/5ad605ad-d8a6-4dc8-9f01-11afc6274596/calls` → **201**

```json
{
  "command_id": "9d03642f-9488-424d-8913-ba215d2a2458",
  "to": "CALLER"
}
```

```json
{
  "id": "1d958fa7-515e-4365-993a-74137b60ac85",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "order_ids": [
    "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
  ],
  "started_at": "2026-10-29T17:10:14.263641Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/5ad605ad-d8a6-4dc8-9f01-11afc6274596/calls` → **201**

```json
{
  "command_id": "9d03642f-9488-424d-8913-ba215d2a2458",
  "to": "CALLER"
}
```

```json
{
  "id": "1d958fa7-515e-4365-993a-74137b60ac85",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "order_ids": [
    "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
  ],
  "started_at": "2026-10-29T17:10:14.263641Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "1d958fa7-515e-4365-993a-74137b60ac85",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674499029",
    "at": "2026-10-29T17:10:14.266371751Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1d958fa7-515e-4365-993a-74137b60ac85",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25201",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "1d958fa7-515e-4365-993a-74137b60ac85"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1d958fa7-515e-4365-993a-74137b60ac85",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=5ad605ad-d8a6-4dc8-9f01-11afc6274596` → **200**

```json
{
  "calls": [
    {
      "id": "1d958fa7-515e-4365-993a-74137b60ac85",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [
        "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
      ],
      "started_at": "2026-10-29T17:10:14.263641Z",
      "answered_at": "2026-10-29T17:10:14.933639Z",
      "ended_at": "2026-10-29T17:10:14.956254Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5ad605ad-d8a6-4dc8-9f01-11afc6274596` → **200**

```json
{
  "calls": [
    {
      "id": "1d958fa7-515e-4365-993a-74137b60ac85",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [
        "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
      ],
      "started_at": "2026-10-29T17:10:14.263641Z",
      "answered_at": "2026-10-29T17:10:14.933639Z",
      "ended_at": "2026-10-29T17:10:14.956254Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5ad605ad-d8a6-4dc8-9f01-11afc6274596` → **200**

```json
{
  "calls": [
    {
      "id": "1d958fa7-515e-4365-993a-74137b60ac85",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [
        "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
      ],
      "started_at": "2026-10-29T17:10:14.263641Z",
      "answered_at": "2026-10-29T17:10:14.933639Z",
      "ended_at": "2026-10-29T17:10:14.956254Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5ad605ad-d8a6-4dc8-9f01-11afc6274596` → **200**

```json
{
  "calls": [
    {
      "id": "1d958fa7-515e-4365-993a-74137b60ac85",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [
        "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
      ],
      "started_at": "2026-10-29T17:10:14.263641Z",
      "answered_at": "2026-10-29T17:10:14.933639Z",
      "ended_at": "2026-10-29T17:10:14.956254Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5ad605ad-d8a6-4dc8-9f01-11afc6274596` → **200**

```json
{
  "calls": [
    {
      "id": "1d958fa7-515e-4365-993a-74137b60ac85",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "order_ids": [
        "5ad605ad-d8a6-4dc8-9f01-11afc6274596"
      ],
      "started_at": "2026-10-29T17:10:14.263641Z",
      "answered_at": "2026-10-29T17:10:14.933639Z",
      "ended_at": "2026-10-29T17:10:14.956254Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:10:23.2521Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/5ad605ad-d8a6-4dc8-9f01-11afc6274596` → **200**

```json
{
  "id": "5ad605ad-d8a6-4dc8-9f01-11afc6274596",
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
  "created_at": "2026-10-29T17:10:13.939988Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674499029"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5ad605ad-d8a6-4dc8-9f01-11afc6274596/cancel` → **200**

```json
{
  "command_id": "dc2bf548-79ae-4459-b6e1-55ceeb1d3a69",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5ad605ad-d8a6-4dc8-9f01-11afc6274596",
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
  "created_at": "2026-10-29T17:10:13.939988Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674499029"
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
  "command_id": "fc1b22be-3d4d-40d8-ada9-dbbb12c6f5c5",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T17:10:25.03308Z",
  "extension": "101"
}
```

Done: outgoing call 1d958fa7-515e-4365-993a-74137b60ac85 from order 5ad605ad-d8a6-4dc8-9f01-11afc6274596, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637441027",
  "device_ref": "sandbox-7061"
}
```

```json
{
  "challenge_id": "5d987d19-e1c7-4c87-ac85-ba357d922431",
  "expires_at": "2026-10-29T17:15:25.34075284Z",
  "resend_available_at": "2026-10-29T17:10:26.34075284Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637441027` → **200**

```json
{
  "phone": "+380637441027",
  "audience": "CLIENT",
  "code": "387258",
  "sent_at": "2026-10-29T17:10:25.343162776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d987d19-e1c7-4c87-ac85-ba357d922431",
  "code": "387258",
  "device_ref": "sandbox-7061"
}
```

```json
{
  "session_id": "c25df633-628c-4cf9-897f-bd883a3ea1f7",
  "subject": {
    "type": "CLIENT",
    "id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWVlZDJjMC0wZTFkLTQ1ODgtYmRkNi1iNjEyZDU2YjJiNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzI1LCJpYXQiOjE3OTMyOTM4MjUsImp0aSI6IjM5MTk0NjY4LTY0ZDQtNDVhOC1hMTJmLTNiMmZlNDNmNmE1OCIsInNpZCI6ImMyNWRmNjMzLTYyOGMtNGNmOS04OTdmLWJkODgzYTNlYTFmNyJ9.EZPSAtSmlcq4MLYy5ESgfo9RM_Y28vlD8UQ3sFIQXTg",
  "access_expires_at": "2026-10-29T17:25:25.647124964Z",
  "refresh_token": "b0txA05FWwaaNkOyUmZ-kEuHRQcNm4oVsTEBvSbzLro",
  "refresh_expires_at": "2026-11-28T17:10:25.646590356Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
  "session_id": "c25df633-628c-4cf9-897f-bd883a3ea1f7",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637441027",
  "device_ref": "sandbox-26361"
}
```

```json
{
  "challenge_id": "681b47df-a277-485c-8fb7-f897420b7ff4",
  "expires_at": "2026-10-29T17:15:28.216110901Z",
  "resend_available_at": "2026-10-29T17:10:29.216110901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637441027` → **200**

```json
{
  "phone": "+380637441027",
  "audience": "CLIENT",
  "code": "441174",
  "sent_at": "2026-10-29T17:10:28.218921519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "681b47df-a277-485c-8fb7-f897420b7ff4",
  "code": "441174",
  "device_ref": "sandbox-26361"
}
```

```json
{
  "session_id": "65202069-db25-46b8-b11a-a2e8173e23d8",
  "subject": {
    "type": "CLIENT",
    "id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWVlZDJjMC0wZTFkLTQ1ODgtYmRkNi1iNjEyZDU2YjJiNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzI4LCJpYXQiOjE3OTMyOTM4MjgsImp0aSI6ImIwMGFlOWNlLTg4N2YtNGMxOS05MmFkLTk5MTY5YWMxMzhjYyIsInNpZCI6IjY1MjAyMDY5LWRiMjUtNDZiOC1iMTFhLWEyZTgxNzNlMjNkOCJ9.0OEW8EaGXIBqzezJJbnjTe1Osr_Ht6IGDQ0NS0gwUrE",
  "access_expires_at": "2026-10-29T17:25:28.523792784Z",
  "refresh_token": "n9iFdRuFtNtmcAaBlBMyVyK6mLN1KVT9nxNmwF0d6bg",
  "refresh_expires_at": "2026-11-28T17:10:28.523278916Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "2e452389-bd96-46e0-b271-b663b8a9c808",
  "expires_at": "2026-10-29T17:15:30.804840148Z",
  "resend_available_at": "2026-10-29T17:10:31.804840148Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637441027` → **200**

```json
{
  "phone": "+380637441027",
  "audience": "CLIENT",
  "code": "754825",
  "sent_at": "2026-10-29T17:10:30.807545394Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632488465"
}
```

```json
{
  "challenge_id": "4c055108-5bb8-45a5-8b80-1a8473e92eea",
  "expires_at": "2026-10-29T17:15:31.101454493Z",
  "resend_available_at": "2026-10-29T17:10:32.101454493Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632488465` → **200**

```json
{
  "phone": "+380632488465",
  "audience": "CLIENT",
  "code": "776912",
  "sent_at": "2026-10-29T17:10:31.104092681Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "c0217cb5-e061-435c-b540-387b43b5ad98",
  "current_challenge_id": "2e452389-bd96-46e0-b271-b663b8a9c808",
  "current_code": "000000",
  "new_challenge_id": "4c055108-5bb8-45a5-8b80-1a8473e92eea",
  "new_code": "776912"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "df9ab8bb-55c5-4a3e-8c2d-140f5cda0cbb"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "7571dcbe-608e-4f50-974b-2035a6f87579",
  "current_challenge_id": "2e452389-bd96-46e0-b271-b663b8a9c808",
  "current_code": "754825",
  "new_challenge_id": "4c055108-5bb8-45a5-8b80-1a8473e92eea",
  "new_code": "776912"
}
```

```json
{
  "subject_id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
  "phone": "+380632488465",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
  "session_id": "c25df633-628c-4cf9-897f-bd883a3ea1f7",
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
  "correlation_id": "27abb362-a2a0-4ce9-8031-36b6b1fd3412"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632488465",
  "device_ref": "sandbox-29562"
}
```

```json
{
  "challenge_id": "0632b880-4663-40e0-9a7e-335211a30d80",
  "expires_at": "2026-10-29T17:15:34.505227111Z",
  "resend_available_at": "2026-10-29T17:10:35.505227111Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632488465` → **200**

```json
{
  "phone": "+380632488465",
  "audience": "CLIENT",
  "code": "773835",
  "sent_at": "2026-10-29T17:10:34.507932278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0632b880-4663-40e0-9a7e-335211a30d80",
  "code": "773835",
  "device_ref": "sandbox-29562"
}
```

```json
{
  "session_id": "93ed24f0-8c3b-495f-97e0-8045bd561ed0",
  "subject": {
    "type": "CLIENT",
    "id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWVlZDJjMC0wZTFkLTQ1ODgtYmRkNi1iNjEyZDU2YjJiNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzM0LCJpYXQiOjE3OTMyOTM4MzQsImp0aSI6IjYzZmNmYmY5LWUwNWUtNGRhMS05NzVmLTk1NTAwNjhmNGIzNyIsInNpZCI6IjkzZWQyNGYwLThjM2ItNDk1Zi05N2UwLTgwNDViZDU2MWVkMCJ9.Iv-meJCV79sh6LKKdOTRduKL4ZK9IroAYje_3ewFEyY",
  "access_expires_at": "2026-10-29T17:25:34.81755662Z",
  "refresh_token": "szSas2anQt7ChyCRvf-D3LjItdL1qHgkNiX6ZTv1NmA",
  "refresh_expires_at": "2026-11-28T17:10:34.816900017Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
  "session_id": "93ed24f0-8c3b-495f-97e0-8045bd561ed0",
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
  "session_id": "8b096cd8-c047-41a3-96ab-02d547a0e65e",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3MzUsImlhdCI6MTc5MzI5MzgzNSwianRpIjoiYjFhNDhiOTEtNjc4Mi00Yjc1LThmOWMtNzViNjU4NmUzNzk1Iiwic2lkIjoiOGIwOTZjZDgtYzA0Ny00MWEzLTk2YWItMDJkNTQ3YTBlNjVlIn0.U1ui3rf5by4WE5e4ex_AVSYgPTIayAJfoeYiTAydTpA",
  "access_expires_at": "2026-10-29T17:25:35.654060592Z",
  "refresh_token": "oYf9HPcUohitHMAO-NZdRkAku33V0WNMvw2-RhbBUtY",
  "refresh_expires_at": "2026-10-30T05:10:35.653321449Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56` → **200**

```json
{
  "client": {
    "id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
    "phone": "+380632488465",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:10:25.645088Z",
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

`POST /api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56/phone/new-code` → **201**

```json
{
  "phone": "+380633105202"
}
```

```json
{
  "challenge_id": "4d4a5c43-3298-4684-8af8-0208451cfbbd",
  "expires_at": "2026-10-29T17:15:36.248622088Z",
  "resend_available_at": "2026-10-29T17:10:37.248622088Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633105202` → **200**

```json
{
  "phone": "+380633105202",
  "audience": "CLIENT",
  "code": "672389",
  "sent_at": "2026-10-29T17:10:36.251436208Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56/phone` → **422**

```json
{
  "command_id": "c155fa69-9d3e-4dbf-92f5-c692f5c2b2ca",
  "expected_version": 3,
  "new_challenge_id": "4d4a5c43-3298-4684-8af8-0208451cfbbd",
  "new_code": "672390",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "41cb77f9-b080-4175-bb36-d2e171b7cba8"
}
```

`POST /api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56/phone` → **400**

```json
{
  "command_id": "8029c6a7-6555-4763-ac77-8cc94e53433a",
  "expected_version": 3,
  "new_challenge_id": "4d4a5c43-3298-4684-8af8-0208451cfbbd",
  "new_code": "672389",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1ff493ce-3ced-4fbf-a6cd-f3c415ea3f71",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/baeed2c0-0e1d-4588-bdd6-b612d56b2b56/phone` → **200**

```json
{
  "command_id": "844c0de1-841f-411e-847e-5760a53c6067",
  "expected_version": 3,
  "new_challenge_id": "4d4a5c43-3298-4684-8af8-0208451cfbbd",
  "new_code": "672389",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
  "phone": "+380633105202",
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
  "correlation_id": "7ad646ca-9d06-4db2-a576-3eb238e3cd3d"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633105202",
  "device_ref": "sandbox-4700"
}
```

```json
{
  "challenge_id": "d88e2911-49e9-4293-893f-f3aeabe9698f",
  "expires_at": "2026-10-29T17:15:37.711901747Z",
  "resend_available_at": "2026-10-29T17:10:38.711901747Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633105202` → **200**

```json
{
  "phone": "+380633105202",
  "audience": "CLIENT",
  "code": "243612",
  "sent_at": "2026-10-29T17:10:37.714433226Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d88e2911-49e9-4293-893f-f3aeabe9698f",
  "code": "243612",
  "device_ref": "sandbox-4700"
}
```

```json
{
  "session_id": "a5cbc00e-e8c8-4e28-91fa-ff10064a3b71",
  "subject": {
    "type": "CLIENT",
    "id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWVlZDJjMC0wZTFkLTQ1ODgtYmRkNi1iNjEyZDU2YjJiNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzM4LCJpYXQiOjE3OTMyOTM4MzgsImp0aSI6ImI0NWNhZTJmLWVlZTgtNDBmMy1iMzA2LWViNDJjODc0NzRjMCIsInNpZCI6ImE1Y2JjMDBlLWU4YzgtNGUyOC05MWZhLWZmMTAwNjRhM2I3MSJ9.qirjm6f5coZPPLaMzS1F2a3x4Cl_S6muNUSz7w3eMPc",
  "access_expires_at": "2026-10-29T17:25:38.030477097Z",
  "refresh_token": "-VkIFXKLM3gDYIHkxvPlTfcMr3BAxLY6rnmYLYcEyZg",
  "refresh_expires_at": "2026-11-28T17:10:38.029982004Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "baeed2c0-0e1d-4588-bdd6-b612d56b2b56",
  "session_id": "a5cbc00e-e8c8-4e28-91fa-ff10064a3b71",
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
  "phone": "+380631311441",
  "device_ref": "sandbox-20926"
}
```

```json
{
  "challenge_id": "fe510dab-9b86-4ec4-a4ab-2d9dd0682463",
  "expires_at": "2026-10-29T17:15:38.57945562Z",
  "resend_available_at": "2026-10-29T17:10:39.57945562Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631311441` → **200**

```json
{
  "phone": "+380631311441",
  "audience": "CLIENT",
  "code": "271295",
  "sent_at": "2026-10-29T17:10:38.581847233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe510dab-9b86-4ec4-a4ab-2d9dd0682463",
  "code": "271295",
  "device_ref": "sandbox-20926"
}
```

```json
{
  "session_id": "3e271317-ff1b-468d-bd7c-228a523ff6e8",
  "subject": {
    "type": "CLIENT",
    "id": "e68b60d3-33e7-4229-8820-632ea5399fce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjhiNjBkMy0zM2U3LTQyMjktODgyMC02MzJlYTUzOTlmY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzM4LCJpYXQiOjE3OTMyOTM4MzgsImp0aSI6IjRlMjNlODUzLTdkMzQtNDExZC1hMTZlLTUxYTA2ZjdhZmNkNSIsInNpZCI6IjNlMjcxMzE3LWZmMWItNDY4ZC1iZDdjLTIyOGE1MjNmZjZlOCJ9.OeOwV1PyJfrdCF22ZJyCrW_dESQW0cd6aOOa2RrYC5s",
  "access_expires_at": "2026-10-29T17:25:38.880144823Z",
  "refresh_token": "fbAVQkPyan0CXtr_xZJH1y6pYso0VTFeANpPS06uL8c",
  "refresh_expires_at": "2026-11-28T17:10:38.879656353Z",
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
  "session_id": "153bf85c-be01-41a1-98f3-f3a496a7aa02",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NDAsImlhdCI6MTc5MzI5Mzg0MCwianRpIjoiNWM0YTFlMTQtMzU0Yy00ZTY2LTk5NDgtOGVlNmFmYmYzNzU5Iiwic2lkIjoiMTUzYmY4NWMtYmUwMS00MWExLTk4ZjMtZjNhNDk2YTdhYTAyIn0.iH_amDLeY4UJy_NUUYTAhNPdLVIlErZ1lASsVY3-IPo",
  "access_expires_at": "2026-10-29T17:25:40.023606421Z",
  "refresh_token": "IVDVh0OGbMYQwRudKzcCmXTx7s3fM_lRUK07WwHCa_g",
  "refresh_expires_at": "2026-10-30T05:10:40.023061339Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631311441` → **200**

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
  "correlation_id": "7a24352c-2227-40b3-8189-39f6eb2beb51"
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
  "session_id": "e70d0ad8-b5bd-43b1-8b78-cf76245ffdf3",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NDEsImlhdCI6MTc5MzI5Mzg0MSwianRpIjoiMTE3YTUyMmMtYTAyZC00Mzc3LTgxNTgtYjQyMmNiNjJlOWQ5Iiwic2lkIjoiZTcwZDBhZDgtYjViZC00M2IxLThiNzgtY2Y3NjI0NWZmZGYzIn0.aK8PXj1bgClf_xygh6y7QfTdNFtMMgkOKt42riiUalA",
  "access_expires_at": "2026-10-29T17:25:41.184705355Z",
  "refresh_token": "AyGbRn4vnOv1xSe2C2dbIWoj-Qi7p577noSr0sXM0is",
  "refresh_expires_at": "2026-10-30T05:10:41.184156967Z",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T17:06:34.530079Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "1631fd3d-5a30-4cc5-833f-35758705f6f5",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T17:10:41.75330209Z"
}
```

## The rider books the airport for 2026-10-29T20:10:40Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600155529",
  "device_ref": "sandbox-20145"
}
```

```json
{
  "challenge_id": "215c6679-8303-440b-81ba-c7da33a2f1a8",
  "expires_at": "2026-10-29T17:15:42.042253333Z",
  "resend_available_at": "2026-10-29T17:10:43.042253333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600155529` → **200**

```json
{
  "phone": "+48600155529",
  "audience": "CLIENT",
  "code": "355063",
  "sent_at": "2026-10-29T17:10:42.044918764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "215c6679-8303-440b-81ba-c7da33a2f1a8",
  "code": "355063",
  "device_ref": "sandbox-20145"
}
```

```json
{
  "session_id": "3fbfcee7-eca3-4c9c-afd7-8b2f574b69c3",
  "subject": {
    "type": "CLIENT",
    "id": "3d278c3c-0b01-4ffb-bd8a-8552a5977dc4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDI3OGMzYy0wYjAxLTRmZmItYmQ4YS04NTUyYTU5NzdkYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzQyLCJpYXQiOjE3OTMyOTM4NDIsImp0aSI6IjkyZmFiODU5LTJkZWUtNDhjYy1hMzJhLTY3ZDg4ODU3NjJhYiIsInNpZCI6IjNmYmZjZWU3LWVjYTMtNGM5Yy1hZmQ3LThiMmY1NzRiNjljMyJ9.WOTJwRVDzIgOXxN-wVa2oSAj2zgLwXnbbYy71FwsJZU",
  "access_expires_at": "2026-10-29T17:25:42.343017947Z",
  "refresh_token": "yjrQhepVX7X9IofvZJVRAfbodPwPo0MUxQpB_WD66yE",
  "refresh_expires_at": "2026-11-28T17:10:42.342554834Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0819349a-27f7-4a48-8e7d-0d1af6538f63",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T20:10:40Z"
}
```

```json
{
  "id": "1109ec05-83e1-44ef-a844-c270253e5e3f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:15:42.630851Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T20:10:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "10d5eef5-419a-46a8-bdfb-b21988937a02",
  "quote_id": "1109ec05-83e1-44ef-a844-c270253e5e3f",
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
  "pickup_at": "2026-10-29T20:10:40Z"
}
```

```json
{
  "id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3d278c3c-0b01-4ffb-bd8a-8552a5977dc4",
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
  "created_at": "2026-10-29T17:10:42.919696Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T20:10:40Z",
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
  "device_ref": "sandbox-26316"
}
```

```json
{
  "challenge_id": "0ecb0f23-8d7e-492d-bc8d-0dfc3fe34dd9",
  "expires_at": "2026-10-29T17:15:43.219594419Z",
  "resend_available_at": "2026-10-29T17:10:44.219594419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "382029",
  "sent_at": "2026-10-29T17:10:43.222062587Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ecb0f23-8d7e-492d-bc8d-0dfc3fe34dd9",
  "code": "382029",
  "device_ref": "sandbox-26316"
}
```

```json
{
  "session_id": "0c391c46-6e8c-403f-bf36-26ce8f8a02b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc0MywiaWF0IjoxNzkzMjkzODQzLCJqdGkiOiJmN2I3YjczMi0zMDAzLTRkMWYtYjI5Mi0zZmNlOTM5YWRjMWYiLCJzaWQiOiIwYzM5MWM0Ni02ZThjLTQwM2YtYmYzNi0yNmNlOGY4YTAyYjUifQ.0Hj1bPtvOV4eeb7IXxBJVqCH7Vy9sZrbGGmMuZaq6DI",
  "access_expires_at": "2026-10-29T17:25:43.53093485Z",
  "refresh_token": "InAMfYC5oYgOusVWhbd2pmIjGN1pSLgOmZfMcuoybS8",
  "refresh_expires_at": "2026-11-28T17:10:43.53043058Z",
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
  "command_id": "c5f96380-98ba-438a-9c61-913c4f0dea60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:10:44Z",
    "sequence": 1793293844101
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b6e677f9-453e-459f-950a-d9157b279e47",
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
  "last_heartbeat_at": "2026-10-29T17:10:44.119485Z",
  "last_location_at": "2026-10-29T17:10:44.119485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
      "short_number": 24,
      "pickup_at": "2026-10-29T20:10:40Z",
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

`POST /api/driver/v1/preorders/b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf/reserve` → **200**

```json
{
  "command_id": "5adea48b-45e8-4780-9e8b-cf23def2be08"
}
```

```json
{
  "id": "bc6476e6-8180-4232-845b-95d74727fa24",
  "state": "RESERVED",
  "order": {
    "order_id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
    "short_number": 24,
    "pickup_at": "2026-10-29T20:10:40Z",
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
  "reserved_at": "2026-10-29T17:10:44.679845Z",
  "confirm_from": "2026-10-29T19:40:40Z",
  "confirm_until": "2026-10-29T19:50:40Z",
  "drop_until": "2026-10-29T19:10:40Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "bc6476e6-8180-4232-845b-95d74727fa24",
      "state": "RESERVED",
      "order": {
        "order_id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
        "short_number": 24,
        "pickup_at": "2026-10-29T20:10:40Z",
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
      "reserved_at": "2026-10-29T17:10:44.679845Z",
      "confirm_from": "2026-10-29T19:40:40Z",
      "confirm_until": "2026-10-29T19:50:40Z",
      "drop_until": "2026-10-29T19:10:40Z"
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
      "id": "bc6476e6-8180-4232-845b-95d74727fa24",
      "state": "RESERVED",
      "order": {
        "order_id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
        "short_number": 24,
        "pickup_at": "2026-10-29T20:10:40Z",
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
      "reserved_at": "2026-10-29T17:10:44.679845Z",
      "confirm_from": "2026-10-29T19:40:40Z",
      "confirm_until": "2026-10-29T19:50:40Z",
      "drop_until": "2026-10-29T19:10:40Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/bc6476e6-8180-4232-845b-95d74727fa24/confirm` → **409**

```json
{
  "command_id": "0c940f3e-5ad1-44f2-872d-33b540079ee9"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/bc6476e6-8180-4232-845b-95d74727fa24/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e10e0b64-7330-4fdb-97de-ab22e3161759"
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
  "session_id": "b2c1e24d-96ea-427e-b8d9-601c2b636030",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NDYsImlhdCI6MTc5MzI5Mzg0NiwianRpIjoiYWExMWU2ZDAtYWZhZi00Y2MxLWI2MjItNDUxMzZlOTQyNzM5Iiwic2lkIjoiYjJjMWUyNGQtOTZlYS00MjdlLWI4ZDktNjAxYzJiNjM2MDMwIn0.utNu4lZZDJu7YlU1AiAv7fDaSpbP3nmr2o3lXAON3zQ",
  "access_expires_at": "2026-10-29T17:25:46.106633279Z",
  "refresh_token": "1Rb5AqNlr23TSWiuwZe_VKiqzDbnMK-U4NQ1CqVJGCA",
  "refresh_expires_at": "2026-10-30T05:10:46.106088443Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf` → **200**

```json
{
  "id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3d278c3c-0b01-4ffb-bd8a-8552a5977dc4",
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
  "created_at": "2026-10-29T17:10:42.919696Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T20:10:40Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "bc6476e6-8180-4232-845b-95d74727fa24",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T17:10:44.679845Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T17:10:42.920758Z",
      "actor": {
        "type": "CLIENT",
        "id": "3d278c3c-0b01-4ffb-bd8a-8552a5977dc4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
        "preorder": true,
        "quote_id": "1109ec05-83e1-44ef-a844-c270253e5e3f",
        "pickup_at": "2026-10-29T20:10:40Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "fe1cfc05-da28-4c89-ad0e-4cd837c8ef46"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T17:10:44.680882Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "bc6476e6-8180-4232-845b-95d74727fa24"
      },
      "correlation_id": "45e841c5-f0fc-4457-81c1-dcf0f0741faf"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order b96a0fdf-9cde-4d9f-bb47-2e64a297bbcf, reservation bc6476e6-8180-4232-845b-95d74727fa24.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4723"
}
```

```json
{
  "challenge_id": "0fd25f7f-743c-4804-a3ac-fc9c84997f9d",
  "expires_at": "2026-10-29T17:15:46.983358308Z",
  "resend_available_at": "2026-10-29T17:10:47.983358308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "394012",
  "sent_at": "2026-10-29T17:10:46.985847319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fd25f7f-743c-4804-a3ac-fc9c84997f9d",
  "code": "394012",
  "device_ref": "sandbox-4723"
}
```

```json
{
  "session_id": "aeb948ff-72b2-42b0-8ff9-1c08faa0a3f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc0NywiaWF0IjoxNzkzMjkzODQ3LCJqdGkiOiI1YzI5YmIzZi01YTA1LTQ4YzYtYjJiYS04NDQ4ZDhiZjQ2ZDUiLCJzaWQiOiJhZWI5NDhmZi03MmIyLTQyYjAtOGZmOS0xYzA4ZmFhMGEzZjQifQ.MakDse-jswPeS68eJq4oPcHP6GMt9abGcLyiZhzzLzw",
  "access_expires_at": "2026-10-29T17:25:47.287007289Z",
  "refresh_token": "nRJWQ9iYNST77Amo2gcyr9ot4HPvRqsJ12HKWPopj1k",
  "refresh_expires_at": "2026-11-28T17:10:47.286510693Z",
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
  "command_id": "22b8ce59-a195-4526-b208-ff7f1f2515ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:10:47Z",
    "sequence": 1793293847839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:10:47.859084Z",
  "last_location_at": "2026-10-29T17:10:47.859084Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675612434",
  "device_ref": "sandbox-24209"
}
```

```json
{
  "challenge_id": "8f21744e-0d47-4403-bc32-cb73633315ee",
  "expires_at": "2026-10-29T17:15:48.145588756Z",
  "resend_available_at": "2026-10-29T17:10:49.145588756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675612434` → **200**

```json
{
  "phone": "+380675612434",
  "audience": "CLIENT",
  "code": "202837",
  "sent_at": "2026-10-29T17:10:48.148256143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f21744e-0d47-4403-bc32-cb73633315ee",
  "code": "202837",
  "device_ref": "sandbox-24209"
}
```

```json
{
  "session_id": "2a8f7eda-d9c0-4bf8-a4e8-5e1c336029ef",
  "subject": {
    "type": "CLIENT",
    "id": "2e9fe00e-687a-4fe7-b86d-042a7e80c461"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTlmZTAwZS02ODdhLTRmZTctYjg2ZC0wNDJhN2U4MGM0NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzQ4LCJpYXQiOjE3OTMyOTM4NDgsImp0aSI6IjIxZmFiNjZlLTY1MWYtNGE4Yy1hMDk0LThhOTM4NDQzMGUxZSIsInNpZCI6IjJhOGY3ZWRhLWQ5YzAtNGJmOC1hNGU4LTVlMWMzMzYwMjllZiJ9.DpRI9i1ODZnR4zc_cySL4ARu1Xx69oXsxIhy_Wb65PM",
  "access_expires_at": "2026-10-29T17:25:48.448890641Z",
  "refresh_token": "WfEJSyuuZv2Jc5dLzW-bavoFcDIaLNxYwbN7XaKNjKc",
  "refresh_expires_at": "2026-11-28T17:10:48.448204432Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca5a49b4-e498-42e2-9e24-2e48808ecc59",
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
  "id": "18014cfb-c448-483f-9418-f320bac84ddf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:15:48.742735Z",
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
  "command_id": "3c24c899-baf0-42a2-b71a-0f171ab6e759",
  "quote_id": "18014cfb-c448-483f-9418-f320bac84ddf",
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
  "id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2e9fe00e-687a-4fe7-b86d-042a7e80c461",
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
  "created_at": "2026-10-29T17:10:49.031064Z",
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
    "id": "3596d9ca-ae9e-4649-bae0-51194f1f9fef",
    "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
    "expires_at": "2026-10-29T17:11:04.035608Z",
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

`POST /api/driver/v1/offers/3596d9ca-ae9e-4649-bae0-51194f1f9fef/accept` → **200**

```json
{
  "command_id": "979dbfd2-4d9e-4a3a-85ac-f4bc2e7dd4b3"
}
```

```json
{
  "id": "3e5080bd-0a48-4c7d-9f87-e78a56193ff8",
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aab090de-0bc7-41b3-90d1-b50a4322bb58",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aab090de-0bc7-41b3-90d1-b50a4322bb58",
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "assignment_id": "3e5080bd-0a48-4c7d-9f87-e78a56193ff8",
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

`POST /api/driver/v1/work-sessions/63237154-23ac-4883-90d7-ecd9b0a3c842/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:10:50Z",
    "sequence": 1793293850243
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:10:50.262174Z",
  "last_location_at": "2026-10-29T17:10:50.262174Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aab090de-0bc7-41b3-90d1-b50a4322bb58",
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "assignment_id": "3e5080bd-0a48-4c7d-9f87-e78a56193ff8",
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

`POST /api/driver/v1/trips/aab090de-0bc7-41b3-90d1-b50a4322bb58/arrive` → **200**

```json
{
  "command_id": "c0b3d8c5-10f7-4501-b473-02b558b92257",
  "expected_version": 0
}
```

```json
{
  "id": "aab090de-0bc7-41b3-90d1-b50a4322bb58",
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "assignment_id": "3e5080bd-0a48-4c7d-9f87-e78a56193ff8",
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
  "arrived_at": "2026-10-29T17:10:50.846522Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aab090de-0bc7-41b3-90d1-b50a4322bb58/start` → **200**

```json
{
  "command_id": "4ff3f624-ef77-4915-9185-1cd684be35fa",
  "expected_version": 1
}
```

```json
{
  "id": "aab090de-0bc7-41b3-90d1-b50a4322bb58",
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "assignment_id": "3e5080bd-0a48-4c7d-9f87-e78a56193ff8",
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
  "arrived_at": "2026-10-29T17:10:50.846522Z",
  "started_at": "2026-10-29T17:10:51.147133Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/63237154-23ac-4883-90d7-ecd9b0a3c842/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:10:51Z",
    "sequence": 1793293851432
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:10:51.450339Z",
  "last_location_at": "2026-10-29T17:10:51.450339Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/aab090de-0bc7-41b3-90d1-b50a4322bb58/complete` → **200**

```json
{
  "command_id": "53f7834a-f2dd-481f-b0d6-8ad1b3e661a3",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:10:51Z",
  "cash_received": true
}
```

```json
{
  "id": "aab090de-0bc7-41b3-90d1-b50a4322bb58",
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "assignment_id": "3e5080bd-0a48-4c7d-9f87-e78a56193ff8",
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
  "arrived_at": "2026-10-29T17:10:50.846522Z",
  "started_at": "2026-10-29T17:10:51.147133Z",
  "completed_at": "2026-10-29T17:10:51.730576Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/a9ba5b71-d999-4414-8217-83cc1bb6d091/rating` → **200**

```json
{
  "command_id": "4fc73a05-af84-4d4f-8c7d-8f91ed241543",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "score": 5,
  "created_at": "2026-10-29T17:10:52.034916054Z"
}
```

`POST /api/driver/v1/orders/a9ba5b71-d999-4414-8217-83cc1bb6d091/rating` → **200**

```json
{
  "command_id": "c978bbeb-81ec-4ab6-aa2c-dbcb2dba7e0e",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
  "score": 4,
  "created_at": "2026-10-29T17:10:52.319036724Z"
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
  "session_id": "1a624948-4bd1-4b2c-ae0c-d77b5c3851cf",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NTMsImlhdCI6MTc5MzI5Mzg1MywianRpIjoiZmVmOGNhMDgtMTliNi00MDIxLThiYmYtNDg1ZGFjZjkwMmVjIiwic2lkIjoiMWE2MjQ5NDgtNGJkMS00YjJjLWFlMGMtZDc3YjVjMzg1MWNmIn0.U2ys-fUZvzWaPCGazGXFPWEuPXGd8Bx_A-VudQ6AD9E",
  "access_expires_at": "2026-10-29T17:25:53.16225503Z",
  "refresh_token": "h5PsaNlz3jVKeSKPtE_Yr5G2qYHDrK0MS0dVYwLW-fY",
  "refresh_expires_at": "2026-10-30T05:10:53.161704684Z",
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
  "session_id": "94d1bc88-306e-4d16-87e4-c085c100dc02",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NTMsImlhdCI6MTc5MzI5Mzg1MywianRpIjoiYTc2MmVlMDgtN2IwMy00NzMzLThmNmEtMDc5NzIyNjE0M2Y1Iiwic2lkIjoiOTRkMWJjODgtMzA2ZS00ZDE2LTg3ZTQtYzA4NWMxMDBkYzAyIn0.1TF0qHLc2My2IBGz8OY4y8CYu84ICmhc130x3qHWUyI",
  "access_expires_at": "2026-10-29T17:25:53.730147041Z",
  "refresh_token": "GJDVGfAAHuV-6Ef7BH1IrPgCo7zah3LiB397NasgesE",
  "refresh_expires_at": "2026-10-30T05:10:53.72958899Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a9ba5b71-d999-4414-8217-83cc1bb6d091/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
      "author_type": "RIDER",
      "author_id": "2e9fe00e-687a-4fe7-b86d-042a7e80c461",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T17:10:52.034916Z"
    },
    {
      "order_id": "a9ba5b71-d999-4414-8217-83cc1bb6d091",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2e9fe00e-687a-4fe7-b86d-042a7e80c461",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T17:10:52.319037Z"
    }
  ]
}
```

Done: ratings for order a9ba5b71-d999-4414-8217-83cc1bb6d091.

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
  "session_id": "1831f933-00a5-4f72-978e-5b8707720726",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NTQsImlhdCI6MTc5MzI5Mzg1NCwianRpIjoiYWRkOWQwMjktZjkzMS00ZmE2LThlOGItNjZjMjFkNjlmYjdhIiwic2lkIjoiMTgzMWY5MzMtMDBhNS00ZjcyLTk3OGUtNWI4NzA3NzIwNzI2In0.1L0ESQ6dIPD4XIYuVstz56PefgaXaNEOjqhLOFVlqAw",
  "access_expires_at": "2026-10-29T17:25:54.609526509Z",
  "refresh_token": "lU9vYcQYgaulxcLuOjDNeaebemfqlk37gkoJ6EYG3MA",
  "refresh_expires_at": "2026-10-30T05:10:54.608998384Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "318b4f85-9565-4630-b388-e6c357698da0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "c3c16432-bf7f-49ef-96c5-300fd369df0d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:54.901096Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3c16432-bf7f-49ef-96c5-300fd369df0d` → **200**

```json
{
  "id": "c3c16432-bf7f-49ef-96c5-300fd369df0d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:54.901096Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3c16432-bf7f-49ef-96c5-300fd369df0d` → **200**

```json
{
  "id": "c3c16432-bf7f-49ef-96c5-300fd369df0d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:54.901096Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3c16432-bf7f-49ef-96c5-300fd369df0d` → **200**

```json
{
  "id": "c3c16432-bf7f-49ef-96c5-300fd369df0d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:54.901096Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c3c16432-bf7f-49ef-96c5-300fd369df0d` → **200**

```json
{
  "id": "c3c16432-bf7f-49ef-96c5-300fd369df0d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T17:10:54.901096Z",
  "ready_at": "2026-10-29T17:10:58.305716Z",
  "expires_at": "2026-10-30T17:10:58.305716Z"
}
```

`GET /api/admin/v1/reports/exports/c3c16432-bf7f-49ef-96c5-300fd369df0d/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3521946d-4c52-4d84-8daa-5405598b66bc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f3fbb426-d4db-4f50-9f90-0841dd0808df",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:59.325487Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f3fbb426-d4db-4f50-9f90-0841dd0808df` → **200**

```json
{
  "id": "f3fbb426-d4db-4f50-9f90-0841dd0808df",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:59.325487Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f3fbb426-d4db-4f50-9f90-0841dd0808df` → **200**

```json
{
  "id": "f3fbb426-d4db-4f50-9f90-0841dd0808df",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:59.325487Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f3fbb426-d4db-4f50-9f90-0841dd0808df` → **200**

```json
{
  "id": "f3fbb426-d4db-4f50-9f90-0841dd0808df",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:10:59.325487Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f3fbb426-d4db-4f50-9f90-0841dd0808df` → **200**

```json
{
  "id": "f3fbb426-d4db-4f50-9f90-0841dd0808df",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T17:10:59.325487Z",
  "ready_at": "2026-10-29T17:11:03.314141Z",
  "expires_at": "2026-10-30T17:11:03.314141Z"
}
```

`GET /api/admin/v1/reports/exports/f3fbb426-d4db-4f50-9f90-0841dd0808df/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/f1fb11b2-7466-4123-8907-3b90e9699f41` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/f1fb11b2-7466-4123-8907-3b90e9699f41",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54f777d0-cf51-4df0-b4ad-859ac5e5f8d9"
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
  "device_ref": "sandbox-31784"
}
```

```json
{
  "challenge_id": "b6b0ff4c-9c44-43f2-a38b-1a65068d87fb",
  "expires_at": "2026-10-29T17:16:04.026721657Z",
  "resend_available_at": "2026-10-29T17:11:05.026721657Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "959825",
  "sent_at": "2026-10-29T17:11:04.029319546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6b0ff4c-9c44-43f2-a38b-1a65068d87fb",
  "code": "959825",
  "device_ref": "sandbox-31784"
}
```

```json
{
  "session_id": "47895aad-3dd0-4df8-afb1-42df817eae60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc2NCwiaWF0IjoxNzkzMjkzODY0LCJqdGkiOiIwNmQzZGQyMC01MmI5LTQyNWItODYzMS1kNzlmZWIxZTVlZjciLCJzaWQiOiI0Nzg5NWFhZC0zZGQwLTRkZjgtYWZiMS00MmRmODE3ZWFlNjAifQ.2UHv-78N5z8nH4MtbuhD090lNRE5aPfxzFpVMHVnqgI",
  "access_expires_at": "2026-10-29T17:26:04.327023907Z",
  "refresh_token": "3BJncOEF2rdZA56mm1wrdpYaIWtPqSuXVEE3UB06tS8",
  "refresh_expires_at": "2026-11-28T17:11:04.32654256Z",
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
  "command_id": "5d791a48-d033-4910-9848-56884add72e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:11:05Z",
    "sequence": 1793293865143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0dad1306-4b2d-4342-8e87-7b5d47541fe3",
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
  "last_heartbeat_at": "2026-10-29T17:11:05.160188Z",
  "last_location_at": "2026-10-29T17:11:05.160188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "1ac3e489-47e5-4164-bbf6-1dc401d9ae29",
  "points": [
    {
      "sequence": 1793293867434,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T17:10:07Z"
    },
    {
      "sequence": 1793293867441,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T17:11:07Z"
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
  "session_id": "3da06400-951b-445a-ba88-c0738bb2b761",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NjgsImlhdCI6MTc5MzI5Mzg2OCwianRpIjoiM2IwZGIxODYtOWQ0MC00Y2NhLTk0ZDAtZmJjODAzOGI0NzQ2Iiwic2lkIjoiM2RhMDY0MDAtOTUxYi00NDVhLWJhODgtYzA3MzhiYjJiNzYxIn0.Fu932j9f-mJURhOp5l5zw423NDpj8swjTf_Ryteu-1c",
  "access_expires_at": "2026-10-29T17:26:08.058274948Z",
  "refresh_token": "TIeSVV-XY39QT5_gernzmC1Tcl6Jrw5FDCtZWUTItl0",
  "refresh_expires_at": "2026-10-30T05:11:08.057597189Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f7cd67f4-68d1-4a33-818b-6fba8f0b6744",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T17:11:07Z",
        "track_point_id": "2d1be550-6b7a-45c9-8935-73962488acbf",
        "work_session_id": "0dad1306-4b2d-4342-8e87-7b5d47541fe3"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T17:11:07Z",
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

`POST /api/admin/v1/driver-risk-flags/f7cd67f4-68d1-4a33-818b-6fba8f0b6744/confirm` → **200**

```json
{
  "command_id": "95fec5ac-f55a-4073-a281-9c64bbf50cff",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f7cd67f4-68d1-4a33-818b-6fba8f0b6744",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T17:11:07Z",
    "track_point_id": "2d1be550-6b7a-45c9-8935-73962488acbf",
    "work_session_id": "0dad1306-4b2d-4342-8e87-7b5d47541fe3"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T17:11:07Z",
  "reason": null,
  "reviewed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reviewed_at": "2026-10-29T17:11:08.957258Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f7cd67f4-68d1-4a33-818b-6fba8f0b6744/dismiss` → **409**

```json
{
  "command_id": "29166fb6-a0c2-473c-aad9-c511c854fe41",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f7cd67f4-68d1-4a33-818b-6fba8f0b6744/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "48c2e2e0-4c63-4198-b844-02346025f93d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c155c44e-e085-4bb1-96f6-b1d10e2b2841",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "d809cd50-6255-4e4c-8f74-e8ae4c59c0c1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "raised_at": "2026-10-29T17:11:09.539384Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/d809cd50-6255-4e4c-8f74-e8ae4c59c0c1/dismiss` → **200**

```json
{
  "command_id": "af82e697-2b8a-485c-b835-9901f5e8db60",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "d809cd50-6255-4e4c-8f74-e8ae4c59c0c1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "raised_at": "2026-10-29T17:11:09.539384Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reviewed_at": "2026-10-29T17:11:09.832697Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "a97395d3-b6ec-4979-bce4-a1b6b414ca58",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f7cd67f4-68d1-4a33-818b-6fba8f0b6744"
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
      "actor_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T17:11:10.132795Z"
    }
  ]
}
```

Done: flag f7cd67f4-68d1-4a33-818b-6fba8f0b6744 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "928271a5-bdcb-416a-bb63-e580201beb28",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NzAsImlhdCI6MTc5MzI5Mzg3MCwianRpIjoiOGUyN2U0YjYtZTM5NC00MmUzLThiZmQtMjIxNjk0NWJkMDhkIiwic2lkIjoiOTI4MjcxYTUtYmRjYi00MTZhLWJiNjMtZTU4MDIwMWJlYjI4In0.q9Xz_5xpCvDjFZQ3lN4oMJImA9HwUAIPgabcKiCv3bc",
  "access_expires_at": "2026-10-29T17:26:10.978897999Z",
  "refresh_token": "B8DrQV1XNTIW29q4BGFWTDuBL7WCA2_zxuikfDq9_K4",
  "refresh_expires_at": "2026-10-30T05:11:10.978193204Z",
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
      "actor_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T17:11:10.132795Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "186f7ae5-af3c-4149-92fc-3a9a1b06291d",
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
  "session_id": "0dad1306-4b2d-4342-8e87-7b5d47541fe3",
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
  "last_heartbeat_at": "2026-10-29T17:11:05.160188Z",
  "last_location_at": "2026-10-29T17:11:05.160188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0dad1306-4b2d-4342-8e87-7b5d47541fe3/close` → **200**

```json
{
  "command_id": "ae2f1f12-e292-420b-bd8e-6fd64d010946",
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
  "session_id": "192c61ba-2a2d-429f-8adc-2a482ebe3a1b",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NzIsImlhdCI6MTc5MzI5Mzg3MiwianRpIjoiODdlY2YxZWQtZGZkZi00ZWZhLWE5YWYtZjdlOWRmMWEyN2JlIiwic2lkIjoiMTkyYzYxYmEtMmEyZC00MjlmLThhZGMtMmE0ODJlYmUzYTFiIn0.4iU7zp9qIKl9-B4hSpBvV_bJFvnSKdqMNQ1yxln7Z5o",
  "access_expires_at": "2026-10-29T17:26:12.689907948Z",
  "refresh_token": "-mhExCrV6RK660FWXaXylZ8EWrmL-TQ-y30FL4nnLmk",
  "refresh_expires_at": "2026-10-30T05:11:12.689348837Z",
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
  "command_id": "675cbfb4-ec5f-4557-a5cb-a013b6828012",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T17:11:13.25293Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "675cbfb4-ec5f-4557-a5cb-a013b6828012",
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
  "changed_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T17:11:13.25293Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48059684629",
  "device_ref": "sandbox-28149"
}
```

```json
{
  "challenge_id": "35db6645-bcae-4f56-8309-01faafca2f87",
  "expires_at": "2026-10-29T17:16:13.837111126Z",
  "resend_available_at": "2026-10-29T17:11:14.837111126Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48059684629` → **200**

```json
{
  "phone": "+48059684629",
  "audience": "CLIENT",
  "code": "355353",
  "sent_at": "2026-10-29T17:11:13.840002912Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35db6645-bcae-4f56-8309-01faafca2f87",
  "code": "355353",
  "device_ref": "sandbox-28149"
}
```

```json
{
  "session_id": "895f7514-e760-484d-936f-a5e04a1fad35",
  "subject": {
    "type": "CLIENT",
    "id": "a2a6b3b0-93a5-4853-b299-22b02ddb8d03"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmE2YjNiMC05M2E1LTQ4NTMtYjI5OS0yMmIwMmRkYjhkMDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0Nzc0LCJpYXQiOjE3OTMyOTM4NzQsImp0aSI6ImQxMTkzNGQyLWRmNDItNDAzYS1iYThhLTgyNjk0YjZmNjUxYyIsInNpZCI6Ijg5NWY3NTE0LWU3NjAtNDg0ZC05MzZmLWE1ZTA0YTFmYWQzNSJ9.sAcEhSGvXUIWJT2wcTnI0guTE8K4a8fU37WnUWyJm9E",
  "access_expires_at": "2026-10-29T17:26:14.13987866Z",
  "refresh_token": "A1UhtkohxcfNnnYqX12Js1k-1yJ7RU-VSzEnhkUfAAc",
  "refresh_expires_at": "2026-11-28T17:11:14.13934738Z",
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
  "correlation_id": "46893f43-e205-4e9a-a613-c2414d9e9c47"
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
  "device_ref": "sandbox-13697"
}
```

```json
{
  "challenge_id": "0e8a8ef7-c841-44e4-98ac-504aff7c23ca",
  "expires_at": "2026-10-29T17:16:14.974070482Z",
  "resend_available_at": "2026-10-29T17:11:15.974070482Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "852040",
  "sent_at": "2026-10-29T17:11:14.976582797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e8a8ef7-c841-44e4-98ac-504aff7c23ca",
  "code": "852040",
  "device_ref": "sandbox-13697"
}
```

```json
{
  "session_id": "ee64e78b-680b-4dcf-873b-3dfa7a3e29ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc3NSwiaWF0IjoxNzkzMjkzODc1LCJqdGkiOiI4ZDRmMjcxOS1mMjQ5LTQwYzUtYWQzYi0zNTFlMjBjM2Y4NDMiLCJzaWQiOiJlZTY0ZTc4Yi02ODBiLTRkY2YtODczYi0zZGZhN2EzZTI5YWUifQ.LAn1hMtw1fnrzoaEWV6_K0EHD1Cf6NrmFrSXIxvijKA",
  "access_expires_at": "2026-10-29T17:26:15.277340215Z",
  "refresh_token": "-j8Hd7Pwv6prcyZ-adytner-PADDj91H-OpszNO37_Q",
  "refresh_expires_at": "2026-11-28T17:11:15.276868085Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b6e677f9-453e-459f-950a-d9157b279e47",
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
  "last_heartbeat_at": "2026-10-29T17:10:44.119485Z",
  "last_location_at": "2026-10-29T17:10:44.119485Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b6e677f9-453e-459f-950a-d9157b279e47/handover` → **200**

```json
{
  "command_id": "d847b395-4ff6-4030-b35d-1a4213e314b9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b6e677f9-453e-459f-950a-d9157b279e47",
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
  "last_heartbeat_at": "2026-10-29T17:10:44.119485Z",
  "last_location_at": "2026-10-29T17:10:44.119485Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b6e677f9-453e-459f-950a-d9157b279e47/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:11:16Z",
    "sequence": 1793293876115
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b6e677f9-453e-459f-950a-d9157b279e47",
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
  "last_heartbeat_at": "2026-10-29T17:11:16.133161Z",
  "last_location_at": "2026-10-29T17:11:16.133161Z",
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
  "session_id": "b6e677f9-453e-459f-950a-d9157b279e47",
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
  "last_heartbeat_at": "2026-10-29T17:11:16.133161Z",
  "last_location_at": "2026-10-29T17:11:16.133161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6e677f9-453e-459f-950a-d9157b279e47/close` → **200**

```json
{
  "command_id": "14e134dc-6326-41a2-9aff-7b239f8aee9a",
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
  "correlation_id": "20520f9a-3c05-4ffb-b36a-d606bd0fcde0"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673985243",
  "device_ref": "sandbox-5783"
}
```

```json
{
  "challenge_id": "1923530e-b268-49f6-8f73-0299edaa8937",
  "expires_at": "2026-10-29T17:16:17.542371162Z",
  "resend_available_at": "2026-10-29T17:11:18.542371162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673985243` → **200**

```json
{
  "phone": "+380673985243",
  "audience": "CLIENT",
  "code": "771581",
  "sent_at": "2026-10-29T17:11:17.545077929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1923530e-b268-49f6-8f73-0299edaa8937",
  "code": "771581",
  "device_ref": "sandbox-5783"
}
```

```json
{
  "session_id": "f75320e3-8cca-4ec7-80a6-eee379aae6c7",
  "subject": {
    "type": "CLIENT",
    "id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTFmYzlkMS1mNWE0LTQ1MzAtYjVjNS1lZWVmZjIxYjQyZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0Nzc3LCJpYXQiOjE3OTMyOTM4NzcsImp0aSI6ImUzMjdhNzgyLTViZTMtNDYyNS05YWY1LWMxYTJhMDRmMDkzMiIsInNpZCI6ImY3NTMyMGUzLThjY2EtNGVjNy04MGE2LWVlZTM3OWFhZTZjNyJ9.LWuIXoYnea3aQSBtP-ANzyjnxVOOmZJZU57f28x4_pQ",
  "access_expires_at": "2026-10-29T17:26:17.85832029Z",
  "refresh_token": "uFy_qpMncX1FAIg9znNeT1ZXd8AXY0XKTtnY-nmo3uw",
  "refresh_expires_at": "2026-11-28T17:11:17.857638055Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "9d0d37ee-e82a-4ea1-af55-4adfeff0f5f4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "299c1370-0f28-4372-a3fe-533c71247005",
  "upload_path": "/api/rider/v1/uploads/299c1370-0f28-4372-a3fe-533c71247005",
  "expires_at": "2026-10-29T17:26:18.15443346Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/299c1370-0f28-4372-a3fe-533c71247005` → **200**

```json
{
  "file_id": "299c1370-0f28-4372-a3fe-533c71247005",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "79ee6f9d-c25a-465b-94ce-e9a260dd0267",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "299c1370-0f28-4372-a3fe-533c71247005"
  ]
}
```

```json
{
  "id": "495304e1-b0bd-4103-afb1-798983a88e47",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T17:11:18.467954Z",
  "updated_at": "2026-10-29T17:11:18.467954Z",
  "respond_by": "2026-10-29T21:11:18.467954Z",
  "messages": [
    {
      "id": "342f1019-f03f-4f53-8ff0-d928d878830c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:11:18.46887Z",
      "attachments": [
        {
          "file_id": "299c1370-0f28-4372-a3fe-533c71247005",
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
  "session_id": "3d08b0a6-6e1c-4514-b53b-7392a7324f27",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NzksImlhdCI6MTc5MzI5Mzg3OSwianRpIjoiZDk1MjBmZmItZWZjOC00ZTBmLTk1YTUtZDc2N2JkMzQ4NjYyIiwic2lkIjoiM2QwOGIwYTYtNmUxYy00NTE0LWI1M2ItNzM5MmE3MzI0ZjI3In0._jqBRFj9dEjtgGuVnzjB47oNVUWwGRBJQA-E4pwbdrI",
  "access_expires_at": "2026-10-29T17:26:19.071315955Z",
  "refresh_token": "Uks0rW47atFC-etMBsrvrgvtFfj5nzAVKm6GXXBpezM",
  "refresh_expires_at": "2026-10-30T05:11:19.070806135Z",
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
  "session_id": "a922c478-281c-4697-8632-bbfa47c63d83",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3NzksImlhdCI6MTc5MzI5Mzg3OSwianRpIjoiYTIyMmEzNDYtZGE3Ny00NDg0LWEyNTQtNWQ4NDllNTUxNzI1Iiwic2lkIjoiYTkyMmM0NzgtMjgxYy00Njk3LTg2MzItYmJmYTQ3YzYzZDgzIn0.nCRb0FLI06t6XtD5xvGYsQjq0OHtMNeYxXhFovEktDM",
  "access_expires_at": "2026-10-29T17:26:19.635862504Z",
  "refresh_token": "Qru4JF6nSB2KhDNVx9GLO7fQ3kLdXJ6N396-L52c6NM",
  "refresh_expires_at": "2026-10-30T05:11:19.635347203Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/495304e1-b0bd-4103-afb1-798983a88e47/attachments/299c1370-0f28-4372-a3fe-533c71247005` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "b4788999-a6d1-4abb-b0f3-2184bca06c8e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f22acb3e-d7c7-4ff2-a837-3fb54338ddd5",
  "upload_path": "/api/operator/v1/uploads/f22acb3e-d7c7-4ff2-a837-3fb54338ddd5",
  "expires_at": "2026-10-29T17:26:19.928294444Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f22acb3e-d7c7-4ff2-a837-3fb54338ddd5` → **200**

```json
{
  "file_id": "f22acb3e-d7c7-4ff2-a837-3fb54338ddd5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/495304e1-b0bd-4103-afb1-798983a88e47` → **200**

```json
{
  "id": "495304e1-b0bd-4103-afb1-798983a88e47",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T17:11:18.467954Z",
  "updated_at": "2026-10-29T17:11:18.467954Z",
  "respond_by": "2026-10-29T21:11:18.467954Z",
  "messages": [
    {
      "id": "342f1019-f03f-4f53-8ff0-d928d878830c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:11:18.46887Z",
      "attachments": [
        {
          "file_id": "299c1370-0f28-4372-a3fe-533c71247005",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/495304e1-b0bd-4103-afb1-798983a88e47/comments` → **200**

```json
{
  "command_id": "3bbba2e0-071e-4c30-8281-52d53ce98742",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f22acb3e-d7c7-4ff2-a837-3fb54338ddd5"
  ]
}
```

```json
{
  "id": "495304e1-b0bd-4103-afb1-798983a88e47",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T17:11:18.467954Z",
  "updated_at": "2026-10-29T17:11:20.515182Z",
  "respond_by": "2026-10-29T21:11:18.467954Z",
  "messages": [
    {
      "id": "342f1019-f03f-4f53-8ff0-d928d878830c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:11:18.46887Z",
      "attachments": [
        {
          "file_id": "299c1370-0f28-4372-a3fe-533c71247005",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d7ce7196-ba1c-46f9-8294-5ca78e598184",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T17:11:20.514691Z",
      "attachments": [
        {
          "file_id": "f22acb3e-d7c7-4ff2-a837-3fb54338ddd5",
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

`GET /api/rider/v1/support/cases/495304e1-b0bd-4103-afb1-798983a88e47` → **200**

```json
{
  "id": "495304e1-b0bd-4103-afb1-798983a88e47",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T17:11:18.467954Z",
  "updated_at": "2026-10-29T17:11:20.515182Z",
  "respond_by": "2026-10-29T21:11:18.467954Z",
  "messages": [
    {
      "id": "342f1019-f03f-4f53-8ff0-d928d878830c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "311fc9d1-f5a4-4530-b5c5-eeeff21b42f1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:11:18.46887Z",
      "attachments": [
        {
          "file_id": "299c1370-0f28-4372-a3fe-533c71247005",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d7ce7196-ba1c-46f9-8294-5ca78e598184",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T17:11:20.514691Z",
      "attachments": [
        {
          "file_id": "f22acb3e-d7c7-4ff2-a837-3fb54338ddd5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/495304e1-b0bd-4103-afb1-798983a88e47/attachments/f22acb3e-d7c7-4ff2-a837-3fb54338ddd5` → **200**

Done: support case 495304e1-b0bd-4103-afb1-798983a88e47, rider attachment 299c1370-0f28-4372-a3fe-533c71247005, operator attachment f22acb3e-d7c7-4ff2-a837-3fb54338ddd5.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733315083",
  "device_ref": "sandbox-13718"
}
```

```json
{
  "challenge_id": "579b5eca-02a0-43e5-a6e5-468c69bb6aef",
  "expires_at": "2026-10-29T17:16:21.130763822Z",
  "resend_available_at": "2026-10-29T17:11:22.130763822Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733315083` → **200**

```json
{
  "phone": "+380733315083",
  "audience": "CLIENT",
  "code": "420919",
  "sent_at": "2026-10-29T17:11:21.133196169Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "579b5eca-02a0-43e5-a6e5-468c69bb6aef",
  "code": "420919",
  "device_ref": "sandbox-13718"
}
```

```json
{
  "session_id": "e1c5cf3e-b64f-4de9-9ad9-ba2fe9262e36",
  "subject": {
    "type": "CLIENT",
    "id": "9c17f685-8800-4eb1-8412-145cbf8fa22b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzE3ZjY4NS04ODAwLTRlYjEtODQxMi0xNDVjYmY4ZmEyMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0NzgxLCJpYXQiOjE3OTMyOTM4ODEsImp0aSI6ImVkMmYwYjZlLWMwNGMtNGJhNS1iODM3LWFlNjQ2NjYzNThiYyIsInNpZCI6ImUxYzVjZjNlLWI2NGYtNGRlOS05YWQ5LWJhMmZlOTI2MmUzNiJ9.eIagQOh_z1HzHPZVtTfP7S-UiQWJIG9CoZtzwuPSiwc",
  "access_expires_at": "2026-10-29T17:26:21.437225307Z",
  "refresh_token": "kmpBuZvl4UCOLwtAeFbELf27B0k_-115ND97JSpZ3Hk",
  "refresh_expires_at": "2026-11-28T17:11:21.436712993Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9aa095b9-bc7f-4493-ab20-92ac65086e42",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4ce1ad07-644d-4556-a0fb-1eb5ce35213d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4ce1ad07-644d-4556-a0fb-1eb5ce35213d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9de3c2b8d1643f23f70c2140b151e93e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4ce1ad07-644d-4556-a0fb-1eb5ce35213d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733315083"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4ce1ad07-644d-4556-a0fb-1eb5ce35213d",
  "expires_at": "2026-10-29T17:41:21.709389Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/4ce1ad07-644d-4556-a0fb-1eb5ce35213d` → **200**

```json
{
  "id": "4ce1ad07-644d-4556-a0fb-1eb5ce35213d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T17:41:21.709389Z",
  "card": {
    "id": "a08927ed-6937-4941-bdc5-d57f8f12a2a3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0950",
    "card_type": "Visa",
    "created_at": "2026-10-29T17:11:21.984706Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f77f9c9-6b1e-4a07-9571-5d24333e90a5",
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
  "id": "3393ef80-17bc-41d2-a45f-126a678420a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:16:22.295728Z",
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
  "command_id": "2bed77b2-359c-4537-a5dc-864be4be1226",
  "quote_id": "3393ef80-17bc-41d2-a45f-126a678420a3",
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
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6` → **200**

```json
{
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6` → **200**

```json
{
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
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

`GET /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6` → **200**

```json
{
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6/switch-to-cash` → **200**

```json
{
  "command_id": "017fca10-ebfc-4609-8150-3d132e8d5722",
  "expected_version": 3
}
```

```json
{
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6/switch-to-cash` → **409**

```json
{
  "command_id": "6e15142d-89d4-45fe-9f68-05f6b0b144d3",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3dec0d52-29b5-4c6f-98ef-f0bb9faaecc0"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6` → **200**

```json
{
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/213c136c-2d26-40f4-8db4-5ca3125788f6/cancel` → **200**

```json
{
  "command_id": "3532fc2e-567d-430c-97d7-ca4c0d61a0d8",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "213c136c-2d26-40f4-8db4-5ca3125788f6",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9c17f685-8800-4eb1-8412-145cbf8fa22b",
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
  "created_at": "2026-10-29T17:11:22.59088Z",
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
  "session_id": "ac2a2171-062e-485b-814c-084fa8ecc647",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3ODYsImlhdCI6MTc5MzI5Mzg4NiwianRpIjoiNGUxYzY1MDUtZTZmNC00YjM1LWJiZmMtMjY5NTdmODI0NzRlIiwic2lkIjoiYWMyYTIxNzEtMDYyZS00ODViLTgxNGMtMDg0ZmE4ZWNjNjQ3In0.ZdghoECuAF64N6iwDF5ExdnUui9vYRa9fGm9p0eMdF8",
  "access_expires_at": "2026-10-29T17:26:26.217109629Z",
  "refresh_token": "1JWzG8FpSWV0UFFkt7d0fX9j5O51DNW2EE5oG8wU-aw",
  "refresh_expires_at": "2026-10-30T05:11:26.216558476Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5621"
}
```

```json
{
  "challenge_id": "32cad05d-03d3-4f26-9a98-e3d858c035fc",
  "expires_at": "2026-10-29T17:16:26.490115087Z",
  "resend_available_at": "2026-10-29T17:11:27.490115087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "722312",
  "sent_at": "2026-10-29T17:11:26.493321106Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32cad05d-03d3-4f26-9a98-e3d858c035fc",
  "code": "722312",
  "device_ref": "sandbox-5621"
}
```

```json
{
  "session_id": "018c98c7-2394-4e42-8e6a-7b84b38ee0f9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc4NiwiaWF0IjoxNzkzMjkzODg2LCJqdGkiOiI1MmYyMjMxZC0yYzZlLTQ0NjMtOTljMi03YjFkZjdlN2Q5ZjUiLCJzaWQiOiIwMThjOThjNy0yMzk0LTRlNDItOGU2YS03Yjg0YjM4ZWUwZjkifQ.zu3DkgIuRnRQRbGEyZA_mb9US63sXDzcJUIyaRI9mmo",
  "access_expires_at": "2026-10-29T17:26:26.786049028Z",
  "refresh_token": "ue4_yRYCkauYE5ZLUlOkzWLVHkaW0Hk3hwHepTB9iYw",
  "refresh_expires_at": "2026-11-28T17:11:26.78556723Z",
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
      "actor_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T17:11:10.132795Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T17:11:11.540279Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "fddef068-437a-43b3-aea5-846258b05f3b",
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
  "device_ref": "sandbox-2223"
}
```

```json
{
  "challenge_id": "3cc966f2-6af5-4929-bbd9-9feec6935a5f",
  "expires_at": "2026-10-29T17:16:27.925212872Z",
  "resend_available_at": "2026-10-29T17:11:28.925212872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "262750",
  "sent_at": "2026-10-29T17:11:27.927818491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3cc966f2-6af5-4929-bbd9-9feec6935a5f",
  "code": "262750",
  "device_ref": "sandbox-2223"
}
```

```json
{
  "session_id": "572e0edc-8717-4fd8-bbd5-a1eb38bc32ad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc4OCwiaWF0IjoxNzkzMjkzODg4LCJqdGkiOiJiMWI2NDg2ZC1mYWRkLTRmZTQtYjhmNC1kYjQ4NmJlMTBkMTYiLCJzaWQiOiI1NzJlMGVkYy04NzE3LTRmZDgtYmJkNS1hMWViMzhiYzMyYWQifQ.nAbtKlA4oRGT7tfDdw7ISrIBbjK9dviY96DPHh562Ec",
  "access_expires_at": "2026-10-29T17:26:28.231049894Z",
  "refresh_token": "yXZ8onfzbTrYRTrJyAz4Pp88-bQsuVxw07ZN4NsQrlg",
  "refresh_expires_at": "2026-11-28T17:11:28.230544579Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:10:51.450339Z",
  "last_location_at": "2026-10-29T17:10:51.450339Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/63237154-23ac-4883-90d7-ecd9b0a3c842/handover` → **200**

```json
{
  "command_id": "0132d884-c6d2-458b-b4e6-bb58972a6a8e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:10:51.450339Z",
  "last_location_at": "2026-10-29T17:10:51.450339Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/63237154-23ac-4883-90d7-ecd9b0a3c842/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:11:29Z",
    "sequence": 1793293889626
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:11:29.080232Z",
  "last_location_at": "2026-10-29T17:11:29.080232Z",
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
  "command_id": "58c624c4-5e0b-47d9-95a7-dc95c82a6273",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:11:29Z",
    "sequence": 1793293889627
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2e461d22-e73d-4f43-a116-f475e66fd648",
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
  "last_heartbeat_at": "2026-10-29T17:11:29.638376Z",
  "last_location_at": "2026-10-29T17:11:29.638376Z",
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
  "session_id": "14c286e2-7f85-4df2-86ee-454929bccf45",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ3OTAsImlhdCI6MTc5MzI5Mzg5MCwianRpIjoiNDgzZmI0NDctMGVjOS00OWZlLWE3YWEtMzNiMDZjNDMxMDZlIiwic2lkIjoiMTRjMjg2ZTItN2Y4NS00ZGYyLTg2ZWUtNDU0OTI5YmNjZjQ1In0.u7tXLsFagSDvgv0QCXR82XhJbUN3ycVrPgrCyUEw24I",
  "access_expires_at": "2026-10-29T17:26:30.211628652Z",
  "refresh_token": "_u629LX9BxaBX7ziZb3-E0QxPow38gCi7XgF4nOMvD0",
  "refresh_expires_at": "2026-10-30T05:11:30.211084094Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c606e8b6-6e99-43a0-a4fa-0877c26c9047",
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
  "id": "32eaf53d-6472-4f4d-b1b4-4c75a8f665eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:16:30.484795Z",
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
  "command_id": "b3b434e3-a93e-4607-ad37-5c879d3a7237",
  "quote_id": "32eaf53d-6472-4f4d-b1b4-4c75a8f665eb",
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
  "id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
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
  "created_at": "2026-10-29T17:11:30.774135Z",
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
    "id": "996f7f83-89ea-41a9-ac65-df8b0d6a4171",
    "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
    "expires_at": "2026-10-29T17:11:45.778074Z",
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

`POST /api/driver/v1/offers/996f7f83-89ea-41a9-ac65-df8b0d6a4171/accept` → **200**

```json
{
  "command_id": "509c5a72-25a9-4338-b7a5-685f0af178d9"
}
```

```json
{
  "id": "f278e6c4-8cad-4f1c-a5fd-8f26d416c0f8",
  "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "46b5e6d5-a446-4da9-a81b-fc91ee891437",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "46b5e6d5-a446-4da9-a81b-fc91ee891437",
  "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
  "assignment_id": "f278e6c4-8cad-4f1c-a5fd-8f26d416c0f8",
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

`POST /api/driver/v1/work-sessions/2e461d22-e73d-4f43-a116-f475e66fd648/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:11:32Z",
    "sequence": 1793293892231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2e461d22-e73d-4f43-a116-f475e66fd648",
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
  "last_heartbeat_at": "2026-10-29T17:11:32.249069Z",
  "last_location_at": "2026-10-29T17:11:32.249069Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/46b5e6d5-a446-4da9-a81b-fc91ee891437/arrive` → **200**

```json
{
  "command_id": "e5dcb05b-d095-4ea0-8b80-e2173c7e3b04",
  "expected_version": 0
}
```

```json
{
  "id": "46b5e6d5-a446-4da9-a81b-fc91ee891437",
  "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
  "assignment_id": "f278e6c4-8cad-4f1c-a5fd-8f26d416c0f8",
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
  "arrived_at": "2026-10-29T17:11:32.52836Z",
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

`POST /api/driver/v1/trips/46b5e6d5-a446-4da9-a81b-fc91ee891437/start` → **200**

```json
{
  "command_id": "b4245d3f-90ea-4140-a083-57a519bbffde",
  "expected_version": 1
}
```

```json
{
  "id": "46b5e6d5-a446-4da9-a81b-fc91ee891437",
  "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
  "assignment_id": "f278e6c4-8cad-4f1c-a5fd-8f26d416c0f8",
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
  "arrived_at": "2026-10-29T17:11:32.52836Z",
  "started_at": "2026-10-29T17:11:32.811152Z",
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

`POST /api/driver/v1/trips/46b5e6d5-a446-4da9-a81b-fc91ee891437/complete` → **200**

```json
{
  "command_id": "02d6e095-3013-4637-851f-528feccf521d",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:11:33Z",
  "cash_received": true
}
```

```json
{
  "id": "46b5e6d5-a446-4da9-a81b-fc91ee891437",
  "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
  "assignment_id": "f278e6c4-8cad-4f1c-a5fd-8f26d416c0f8",
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
  "arrived_at": "2026-10-29T17:11:32.52836Z",
  "started_at": "2026-10-29T17:11:32.811152Z",
  "completed_at": "2026-10-29T17:11:33.112201Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f2d5edc7-a01f-4501-90ed-e8a8f7c11f94` → **200**

```json
{
  "id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
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
    "id": "f278e6c4-8cad-4f1c-a5fd-8f26d416c0f8",
    "order_id": "f2d5edc7-a01f-4501-90ed-e8a8f7c11f94",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "46b5e6d5-a446-4da9-a81b-fc91ee891437",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:11:30.774135Z",
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
  "session_id": "63237154-23ac-4883-90d7-ecd9b0a3c842",
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
  "last_heartbeat_at": "2026-10-29T17:11:29.080232Z",
  "last_location_at": "2026-10-29T17:11:29.080232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63237154-23ac-4883-90d7-ecd9b0a3c842/close` → **200**

```json
{
  "command_id": "01be0567-b360-4c3f-9e50-f8a7d9b698f2",
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
  "session_id": "2e461d22-e73d-4f43-a116-f475e66fd648",
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
  "last_heartbeat_at": "2026-10-29T17:11:32.249069Z",
  "last_location_at": "2026-10-29T17:11:32.249069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e461d22-e73d-4f43-a116-f475e66fd648/close` → **200**

```json
{
  "command_id": "457f7cb0-7f1e-4df8-b456-b2d98a84f4d8",
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

Done: terminal order f2d5edc7-a01f-4501-90ed-e8a8f7c11f94 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30309"
}
```

```json
{
  "challenge_id": "6a28d35d-b8eb-44eb-b15b-aeaf90c8cf79",
  "expires_at": "2026-10-29T17:16:38.09760731Z",
  "resend_available_at": "2026-10-29T17:11:39.09760731Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "202650",
  "sent_at": "2026-10-29T17:11:38.100435612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a28d35d-b8eb-44eb-b15b-aeaf90c8cf79",
  "code": "202650",
  "device_ref": "sandbox-30309"
}
```

```json
{
  "session_id": "0fd6d5d0-ecaf-4c8c-8ff2-ef528714abfc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc5OCwiaWF0IjoxNzkzMjkzODk4LCJqdGkiOiIxNWQzMGZkMi0zNDg3LTQ2NTMtYTc0Mi02OTVmMjdmMjU2ZDkiLCJzaWQiOiIwZmQ2ZDVkMC1lY2FmLTRjOGMtOGZmMi1lZjUyODcxNGFiZmMifQ.hJYR2GfUq2h1BN0Qd29EUeInUfZU5dzt6ujGgYmIkRQ",
  "access_expires_at": "2026-10-29T17:26:38.404889651Z",
  "refresh_token": "mN4doFqSs364bgDVRaOIWHj7pbAx1isMiuMib0FOA3g",
  "refresh_expires_at": "2026-11-28T17:11:38.404390415Z",
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
  "device_ref": "sandbox-6081"
}
```

```json
{
  "challenge_id": "95b0d7a1-d876-4016-804c-7eacbb6e5407",
  "expires_at": "2026-10-29T17:16:38.956774804Z",
  "resend_available_at": "2026-10-29T17:11:39.956774804Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "353735",
  "sent_at": "2026-10-29T17:11:38.959346712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95b0d7a1-d876-4016-804c-7eacbb6e5407",
  "code": "353735",
  "device_ref": "sandbox-6081"
}
```

```json
{
  "session_id": "82e6b16d-baad-4a43-a7be-f022ca92769d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDc5OSwiaWF0IjoxNzkzMjkzODk5LCJqdGkiOiJlZGZmODhjZC0wYzkyLTQxNDAtYTgwNC1hYjIwOWE5NjhjNDgiLCJzaWQiOiI4MmU2YjE2ZC1iYWFkLTRhNDMtYTdiZS1mMDIyY2E5Mjc2OWQifQ.DhuGbJBxPLzcVoPLTgtYON_EWvk8bOA8CED8QqRrVM0",
  "access_expires_at": "2026-10-29T17:26:39.257445937Z",
  "refresh_token": "GAof6Lx_TsSugKyrVhCpdOozVVpz0tiPJf9Y5anbGBw",
  "refresh_expires_at": "2026-11-28T17:11:39.256937585Z",
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
  "device_ref": "sandbox-18412"
}
```

```json
{
  "challenge_id": "caf4b71f-cdcf-4772-b772-2770a842da03",
  "expires_at": "2026-10-29T17:16:39.801512612Z",
  "resend_available_at": "2026-10-29T17:11:40.801512612Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "863747",
  "sent_at": "2026-10-29T17:11:39.804247758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "caf4b71f-cdcf-4772-b772-2770a842da03",
  "code": "863747",
  "device_ref": "sandbox-18412"
}
```

```json
{
  "session_id": "4e6604d8-8812-487c-a722-70be55b337f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NDgwMCwiaWF0IjoxNzkzMjkzOTAwLCJqdGkiOiJiY2NhYmI4NC0yYjY4LTQxZWMtYjUzNy00NGM3NGY1MDJiOWQiLCJzaWQiOiI0ZTY2MDRkOC04ODEyLTQ4N2MtYTcyMi03MGJlNTViMzM3ZjUifQ.2Zv0a3cQ8HFTiIJddkoIo_x2NjmXkRT8eNvtqICOVU8",
  "access_expires_at": "2026-10-29T17:26:40.093933929Z",
  "refresh_token": "2H-bqgWcBs7K5fMiHQaTtiHhvjhxZ26MwnKukMaLIsk",
  "refresh_expires_at": "2026-11-28T17:11:40.093378212Z",
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
  "phone": "+380699698325",
  "device_ref": "sandbox-10523"
}
```

```json
{
  "challenge_id": "16897bcf-5015-44cc-8c12-212f5c356bb1",
  "expires_at": "2026-10-29T17:16:40.647369948Z",
  "resend_available_at": "2026-10-29T17:11:41.647369948Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699698325` → **200**

```json
{
  "phone": "+380699698325",
  "audience": "CLIENT",
  "code": "165379",
  "sent_at": "2026-10-29T17:11:40.64968941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16897bcf-5015-44cc-8c12-212f5c356bb1",
  "code": "165379",
  "device_ref": "sandbox-10523"
}
```

```json
{
  "session_id": "8e23c490-a364-43b1-a7d3-b7ad688bbbc2",
  "subject": {
    "type": "CLIENT",
    "id": "94e87532-4d27-49e9-a209-2f65b7b7c993"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NGU4NzUzMi00ZDI3LTQ5ZTktYTIwOS0yZjY1YjdiN2M5OTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk0ODAwLCJpYXQiOjE3OTMyOTM5MDAsImp0aSI6IjVkY2E0N2RmLTdlZTQtNGQxMS04NGNlLWQ1MTI2Y2NkNTQwYSIsInNpZCI6IjhlMjNjNDkwLWEzNjQtNDNiMS1hN2QzLWI3YWQ2ODhiYmJjMiJ9.4FOvI6GjCqr8dNu24zlEHIZiW88lXBXzRrE-WZXQ3hA",
  "access_expires_at": "2026-10-29T17:26:40.945097253Z",
  "refresh_token": "tnF3BbAxXj9diAD973LXuPFw5wLhdllAxQ_6khnUnLw",
  "refresh_expires_at": "2026-11-28T17:11:40.944600628Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d51d0a8f-67c5-494e-99ff-57e8c08bc1a6",
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
  "id": "25a2ad86-f7a6-4a24-a3ab-82019b0959e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:16:41.234462Z",
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
  "command_id": "53abc66f-de03-4fdf-ab82-816d214a737a",
  "quote_id": "25a2ad86-f7a6-4a24-a3ab-82019b0959e7",
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
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T17:11:41.530859Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:11:41.530859Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.515247021
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.220186075
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

`GET /api/rider/v1/orders/a1ceac8a-1c97-4078-ac18-3292a3043bc8` → **200**

```json
{
  "id": "a1ceac8a-1c97-4078-ac18-3292a3043bc8",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94e87532-4d27-49e9-a209-2f65b7b7c993",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:11:41.530859Z",
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
  "session_id": "755f5b24-1f6c-4293-9d8e-9647c1d43598",
  "subject": {
    "type": "STAFF",
    "id": "697d7752-12ef-4441-aa96-d99cb503c95e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTdkNzc1Mi0xMmVmLTQ0NDEtYWE5Ni1kOTljYjUwM2M5NWUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTQ5ODgsImlhdCI6MTc5MzI5NDA4OCwianRpIjoiOTE5ZjJkMTAtYWQ3OC00NGZhLTkwYTYtYjk1MmVkNzMzZDRiIiwic2lkIjoiNzU1ZjViMjQtMWY2Yy00MjkzLTlkOGUtOTY0N2MxZDQzNTk4In0.ZjQbBuNR2X9wAj0ZVEIozEMNRj-kfdYU3OgMeswmj4c",
  "access_expires_at": "2026-10-29T17:29:48.355933617Z",
  "refresh_token": "nQZzcyaSziCOfVPrHzDevTdkUXIRlp4q93kEt5Oxl_U",
  "refresh_expires_at": "2026-10-30T05:14:48.355204422Z",
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
  "id": "18cf8be9-8ef0-40d5-b05d-9d4baebcb017",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:48.654348Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:48.654401Z",
  "updated_at": "2026-10-29T17:14:48.671814Z",
  "finished_at": "2026-10-29T17:14:48.671814Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/18cf8be9-8ef0-40d5-b05d-9d4baebcb017` → **200**

```json
{
  "run": {
    "id": "18cf8be9-8ef0-40d5-b05d-9d4baebcb017",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T17:14:48.654348Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T17:14:48.654401Z",
    "updated_at": "2026-10-29T17:14:48.671814Z",
    "finished_at": "2026-10-29T17:14:48.671814Z",
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
  "id": "18cf8be9-8ef0-40d5-b05d-9d4baebcb017",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:48.654348Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:48.654401Z",
  "updated_at": "2026-10-29T17:14:48.671814Z",
  "finished_at": "2026-10-29T17:14:48.671814Z",
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
  "id": "18cf8be9-8ef0-40d5-b05d-9d4baebcb017",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:48.654348Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:48.654401Z",
  "updated_at": "2026-10-29T17:14:48.671814Z",
  "finished_at": "2026-10-29T17:14:48.671814Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/390056cf-4142-4ddd-a1ee-39773dc0f30d` → **204**

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
  "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:49.120972Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:49.121007Z",
  "updated_at": "2026-10-29T17:14:49.12845Z",
  "finished_at": "2026-10-29T17:14:49.12845Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/076b6ff0-936c-4a2b-ac40-a0c875703b90` → **200**

```json
{
  "run": {
    "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T17:14:49.120972Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T17:14:49.121007Z",
    "updated_at": "2026-10-29T17:14:49.12845Z",
    "finished_at": "2026-10-29T17:14:49.12845Z",
    "version": 1
  },
  "items": [
    {
      "id": "c2bacf91-68e6-4d98-ad53-e09c3e7b0882",
      "run_id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "adffdf9bcac14eaf54265f7d7b936416e12212742341c2adfa9fba1ed6443976",
      "reference_display": "sandbox-reconciliation-#####cf-4142-4ddd-a1ee-#####dc0f30d",
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
      "provider_at": "2026-10-29T17:14:49Z",
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
  "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:49.120972Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:49.121007Z",
  "updated_at": "2026-10-29T17:14:49.12845Z",
  "finished_at": "2026-10-29T17:14:49.12845Z",
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
  "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:49.120972Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:49.121007Z",
  "updated_at": "2026-10-29T17:14:49.12845Z",
  "finished_at": "2026-10-29T17:14:49.12845Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/c2bacf91-68e6-4d98-ad53-e09c3e7b0882/resolve` → **200**

```json
{
  "command_id": "0996e75c-ffa9-42dc-8312-54e5b84adc42",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c2bacf91-68e6-4d98-ad53-e09c3e7b0882",
  "run_id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "adffdf9bcac14eaf54265f7d7b936416e12212742341c2adfa9fba1ed6443976",
  "reference_display": "sandbox-reconciliation-#####cf-4142-4ddd-a1ee-#####dc0f30d",
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
  "provider_at": "2026-10-29T17:14:49Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "resolved_at": "2026-10-29T17:14:49.545511Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c2bacf91-68e6-4d98-ad53-e09c3e7b0882/resolve` → **200**

```json
{
  "command_id": "0996e75c-ffa9-42dc-8312-54e5b84adc42",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c2bacf91-68e6-4d98-ad53-e09c3e7b0882",
  "run_id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "adffdf9bcac14eaf54265f7d7b936416e12212742341c2adfa9fba1ed6443976",
  "reference_display": "sandbox-reconciliation-#####cf-4142-4ddd-a1ee-#####dc0f30d",
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
  "provider_at": "2026-10-29T17:14:49Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
  "resolved_at": "2026-10-29T17:14:49.545511Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c2bacf91-68e6-4d98-ad53-e09c3e7b0882/resolve` → **409**

```json
{
  "command_id": "a20df002-3e1b-4373-81bb-dfa9fa2b3029",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/c2bacf91-68e6-4d98-ad53-e09c3e7b0882/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5779b516-7c2d-4768-9189-181db86bac93"
}
```

`GET /api/admin/v1/payment-reconciliations/076b6ff0-936c-4a2b-ac40-a0c875703b90` → **200**

```json
{
  "run": {
    "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T17:14:49.120972Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T17:14:49.121007Z",
    "updated_at": "2026-10-29T17:14:49.545511Z",
    "finished_at": "2026-10-29T17:14:49.12845Z",
    "version": 2
  },
  "items": [
    {
      "id": "c2bacf91-68e6-4d98-ad53-e09c3e7b0882",
      "run_id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "adffdf9bcac14eaf54265f7d7b936416e12212742341c2adfa9fba1ed6443976",
      "reference_display": "sandbox-reconciliation-#####cf-4142-4ddd-a1ee-#####dc0f30d",
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
      "provider_at": "2026-10-29T17:14:49Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "697d7752-12ef-4441-aa96-d99cb503c95e",
      "resolved_at": "2026-10-29T17:14:49.545511Z",
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
      "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T17:14:49.120972Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T17:14:49.121007Z",
      "updated_at": "2026-10-29T17:14:49.545511Z",
      "finished_at": "2026-10-29T17:14:49.12845Z",
      "version": 2
    },
    {
      "id": "8f751c9b-b9c0-41b6-a031-3aa7c533dd16",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T17:06:43.205678Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T17:06:43.205909Z",
      "updated_at": "2026-10-29T17:06:43.212277Z",
      "finished_at": "2026-10-29T17:06:43.212277Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/390056cf-4142-4ddd-a1ee-39773dc0f30d` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "076b6ff0-936c-4a2b-ac40-a0c875703b90",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:14:49.120972Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:14:49.121007Z",
  "updated_at": "2026-10-29T17:14:49.545511Z",
  "finished_at": "2026-10-29T17:14:49.12845Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79329421339E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793294213667E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793294213668E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793294213451E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793294213669E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
