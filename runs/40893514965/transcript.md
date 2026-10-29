# Sandbox transcript (2026-10-29T14:39:32Z, bade1bd)

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
  "correlation_id": "8d925ef2-bc4e-4bff-8e06-fda501e6573a"
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
  "session_id": "e4846983-91c2-4b9e-94fc-da86bc61293e",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2NzksImlhdCI6MTc5MzI4NDc3OSwianRpIjoiZTRjMDQxZjgtOGZkZi00ODIzLTg4NmQtOTA4ZGI2ZjFhYWVjIiwic2lkIjoiZTQ4NDY5ODMtOTFjMi00YjllLTk0ZmMtZGE4NmJjNjEyOTNlIn0.UpnxGpl-SxKyfaEx_x-YRaSE-r8JE5RqKgbjDkDFxiM",
  "access_expires_at": "2026-10-29T14:54:39.599976463Z",
  "refresh_token": "33Q30zedGi-OU6ai95PNsw1G1ivdzC5dQkw2cKvrH6E",
  "refresh_expires_at": "2026-10-30T02:39:39.597937434Z",
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
  "session_id": "56964d09-f313-41cc-8c3e-496b83df07f0",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2ODEsImlhdCI6MTc5MzI4NDc4MSwianRpIjoiY2EwOTc4MzctZTcxNy00OTAxLThlZDktMWRiZTk4OTRlNDFiIiwic2lkIjoiNTY5NjRkMDktZjMxMy00MWNjLThjM2UtNDk2YjgzZGYwN2YwIn0.z6z3Ak5dVaNFLgb-PcmPblTkAq-edKbr9XqToqoDFp4",
  "access_expires_at": "2026-10-29T14:54:41.459274606Z",
  "refresh_token": "XBwErAnNhAi8oqlvbZcpvevB-vUCeLsSbqUQxvnbEH8",
  "refresh_expires_at": "2026-10-30T02:39:41.458281057Z",
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
  "device_ref": "sandbox-25486"
}
```

```json
{
  "challenge_id": "e4b17838-a11c-4d02-96fe-7215b3cfb227",
  "expires_at": "2026-10-29T14:44:42.08057261Z",
  "resend_available_at": "2026-10-29T14:39:43.08057261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "560100",
  "sent_at": "2026-10-29T14:39:42.092767783Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4b17838-a11c-4d02-96fe-7215b3cfb227",
  "code": "560100",
  "device_ref": "sandbox-25486"
}
```

```json
{
  "session_id": "abec99a4-aa40-4c4c-b638-40dbfe29c8a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTY4MiwiaWF0IjoxNzkzMjg0NzgyLCJqdGkiOiJkY2ZjMjhmMi0zYWI5LTRlYTEtYWRkNC1jZTQwNTM4YzQ3ZGYiLCJzaWQiOiJhYmVjOTlhNC1hYTQwLTRjNGMtYjYzOC00MGRiZmUyOWM4YTUifQ.bKFxZjqhdzcBg7buVoO5ZedmFOdrA5-52ouTRUNR0nE",
  "access_expires_at": "2026-10-29T14:54:42.441112288Z",
  "refresh_token": "ygaxaTEOkjsg6g5TaWX9mjAeyKmi5QFWVBOM3P3-XC8",
  "refresh_expires_at": "2026-11-28T14:39:42.440096796Z",
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
  "command_id": "0337d759-933f-42bc-8d38-348d4cf1d8d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:43Z",
    "sequence": 1793284783363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "806cb9ce-ce0d-4c54-afcb-f31f4af95416",
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
  "last_heartbeat_at": "2026-10-29T14:39:43.290939Z",
  "last_location_at": "2026-10-29T14:39:43.290939Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639561954",
  "device_ref": "sandbox-1773"
}
```

```json
{
  "challenge_id": "df5b7def-2679-4316-8446-30e5a0345868",
  "expires_at": "2026-10-29T14:44:43.58366967Z",
  "resend_available_at": "2026-10-29T14:39:44.58366967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639561954` → **200**

```json
{
  "phone": "+380639561954",
  "audience": "CLIENT",
  "code": "347942",
  "sent_at": "2026-10-29T14:39:43.588264009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df5b7def-2679-4316-8446-30e5a0345868",
  "code": "347942",
  "device_ref": "sandbox-1773"
}
```

```json
{
  "session_id": "4b772a8c-02a8-49c3-9158-809a178dbc5a",
  "subject": {
    "type": "CLIENT",
    "id": "72565eec-5c38-4838-90d8-ab1a9c3d9927"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjU2NWVlYy01YzM4LTQ4MzgtOTBkOC1hYjFhOWMzZDk5MjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NjgzLCJpYXQiOjE3OTMyODQ3ODMsImp0aSI6ImQzMTEyM2QwLTI5M2ItNDg3Mi04N2I5LWZhYzkyNGYxNTc1YiIsInNpZCI6IjRiNzcyYThjLTAyYTgtNDljMy05MTU4LTgwOWExNzhkYmM1YSJ9.RQUEjBgmWXYb4MvClwLmMgHfz0A-CNpmhOqByUGH4eU",
  "access_expires_at": "2026-10-29T14:54:43.903150805Z",
  "refresh_token": "HLxjgcsSzSKgsCV6nV9BwCsqAU1zjLEuaHAUBQ_-yUM",
  "refresh_expires_at": "2026-11-28T14:39:43.902169884Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e280131a-2b7b-42a5-945a-69903db01e3c",
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
  "id": "1e28f70e-702e-4674-8666-0f1c087e637e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:44:44.240617Z",
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
  "command_id": "d72e38f5-3642-4e00-a8a1-46b43e59f9c1",
  "quote_id": "1e28f70e-702e-4674-8666-0f1c087e637e",
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
  "id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72565eec-5c38-4838-90d8-ab1a9c3d9927",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:39:44.623223Z",
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
    "id": "5c0e98cd-d70f-4141-ba51-2bd24375398c",
    "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
    "expires_at": "2026-10-29T14:39:59.633025Z",
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

`POST /api/driver/v1/offers/5c0e98cd-d70f-4141-ba51-2bd24375398c/accept` → **200**

```json
{
  "command_id": "db539d4e-12ba-48eb-ba14-9c9e3eb57c2f"
}
```

```json
{
  "id": "7cae1eb5-99dc-41b0-90a3-adb4797769b1",
  "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30cc2e98-ff7c-4cad-9a0b-f2d4d5538499",
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
  "command_id": "3a6fad28-b650-4957-91bd-dcfd90a634b2",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:39:45.882811056Z"
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
  "id": "30cc2e98-ff7c-4cad-9a0b-f2d4d5538499",
  "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
  "assignment_id": "7cae1eb5-99dc-41b0-90a3-adb4797769b1",
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

`POST /api/driver/v1/work-sessions/806cb9ce-ce0d-4c54-afcb-f31f4af95416/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:46Z",
    "sequence": 1793284786803
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "806cb9ce-ce0d-4c54-afcb-f31f4af95416",
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
  "last_heartbeat_at": "2026-10-29T14:39:46.830428Z",
  "last_location_at": "2026-10-29T14:39:46.830428Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/30cc2e98-ff7c-4cad-9a0b-f2d4d5538499/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "239c98ed-af61-4b6f-99ea-4547a28ee0c1",
  "expected_version": 0
}
```

```json
{
  "id": "30cc2e98-ff7c-4cad-9a0b-f2d4d5538499",
  "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
  "assignment_id": "7cae1eb5-99dc-41b0-90a3-adb4797769b1",
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
  "arrived_at": "2026-10-29T14:39:47.144048Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/30cc2e98-ff7c-4cad-9a0b-f2d4d5538499/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5727baf7-e581-4fda-9746-9bb8875bb454",
  "expected_version": 1
}
```

```json
{
  "id": "30cc2e98-ff7c-4cad-9a0b-f2d4d5538499",
  "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
  "assignment_id": "7cae1eb5-99dc-41b0-90a3-adb4797769b1",
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
  "arrived_at": "2026-10-29T14:39:47.144048Z",
  "started_at": "2026-10-29T14:39:47.457465Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/30cc2e98-ff7c-4cad-9a0b-f2d4d5538499/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "1b629ede-bf58-4d14-bb54-c9baf5c87f5e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:39:47Z",
  "cash_received": true
}
```

```json
{
  "id": "30cc2e98-ff7c-4cad-9a0b-f2d4d5538499",
  "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
  "assignment_id": "7cae1eb5-99dc-41b0-90a3-adb4797769b1",
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
  "arrived_at": "2026-10-29T14:39:47.144048Z",
  "started_at": "2026-10-29T14:39:47.457465Z",
  "completed_at": "2026-10-29T14:39:47.77509Z",
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
  "session_id": "806cb9ce-ce0d-4c54-afcb-f31f4af95416",
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
  "last_heartbeat_at": "2026-10-29T14:39:46.830428Z",
  "last_location_at": "2026-10-29T14:39:46.830428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/806cb9ce-ce0d-4c54-afcb-f31f4af95416/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "eef52d31-7041-416f-85f7-5ec19b8a5152",
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
  "command_id": "e5b8d210-4444-4542-acb6-1498107812fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:48Z",
    "sequence": 1793284788723
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
  "correlation_id": "44d6fd1c-1619-49dd-bae6-931d50bc4dd6",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "cc9033a7-ef28-493b-9073-225166c8b974",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:49Z",
    "sequence": 1793284789320
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7fb09a47-c5af-4926-a0a5-300530745869",
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
  "last_heartbeat_at": "2026-10-29T14:39:49.055087Z",
  "last_location_at": "2026-10-29T14:39:49.055087Z",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:39:45.882811Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "d79d2b9a-df3f-4fb3-9019-3c0142e3d819",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:39:49.677544419Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7fb09a47-c5af-4926-a0a5-300530745869",
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
  "last_heartbeat_at": "2026-10-29T14:39:49.055087Z",
  "last_location_at": "2026-10-29T14:39:49.055087Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7fb09a47-c5af-4926-a0a5-300530745869/close` → **200**

```json
{
  "command_id": "fc56a881-26e8-481c-8e9f-9abd7e401325",
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
  "session_id": "c4b277e8-c313-4442-bdd5-1d5560691be8",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2OTAsImlhdCI6MTc5MzI4NDc5MCwianRpIjoiNDUzNGNjZmYtZTQwNC00NjkyLWJkNWUtZGUyODcyOGFjOWIwIiwic2lkIjoiYzRiMjc3ZTgtYzMxMy00NDQyLWJkZDUtMWQ1NTYwNjkxYmU4In0.l44c4yTUW0t8GpB6oqQ9wAa_Ec92xTxm8o031fJSpxA",
  "access_expires_at": "2026-10-29T14:54:50.885876658Z",
  "refresh_token": "F2wTW0Wtmk6ROnD8UALUFFKsD4BKY9-17dWQh43Si0Q",
  "refresh_expires_at": "2026-10-30T02:39:50.885081525Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "92717044-fd8a-4463-adc1-26312215b53d",
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
  "id": "882e89e6-95aa-4e42-9d30-65c26b018591",
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
  "created_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "created_at": "2026-10-29T14:39:51.200273Z",
  "updated_at": "2026-10-29T14:39:51.200273Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637978678",
  "device_ref": "sandbox-26299"
}
```

```json
{
  "challenge_id": "7d16658b-9dd9-4c6f-8f05-456c76266954",
  "expires_at": "2026-10-29T14:44:51.509428547Z",
  "resend_available_at": "2026-10-29T14:39:52.509428547Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637978678` → **200**

```json
{
  "phone": "+380637978678",
  "audience": "CLIENT",
  "code": "646040",
  "sent_at": "2026-10-29T14:39:51.514167788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d16658b-9dd9-4c6f-8f05-456c76266954",
  "code": "646040",
  "device_ref": "sandbox-26299"
}
```

```json
{
  "session_id": "248c2966-42bc-493d-b467-6b0e04c096d0",
  "subject": {
    "type": "CLIENT",
    "id": "ead76015-a703-4f96-95bd-812b16a437a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYWQ3NjAxNS1hNzAzLTRmOTYtOTViZC04MTJiMTZhNDM3YTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NjkxLCJpYXQiOjE3OTMyODQ3OTEsImp0aSI6IjY4OTg1MWM2LWViNWEtNGY0My05ZjViLWM0ODYxZDU5MjI4ZSIsInNpZCI6IjI0OGMyOTY2LTQyYmMtNDkzZC1iNDY3LTZiMGUwNGMwOTZkMCJ9.5iZm4DyI6n_skFkF_scLP080VP3GzYXgcX7F3VVrRoU",
  "access_expires_at": "2026-10-29T14:54:51.828079312Z",
  "refresh_token": "CIrlOOUr5DR8Br9U3G-TQbsKH2mw5ZrdegMEg_L_TkQ",
  "refresh_expires_at": "2026-11-28T14:39:51.827286395Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637978678` → **200**

```json
{
  "client_id": "ead76015-a703-4f96-95bd-812b16a437a0"
}
```

`POST /api/admin/v1/rider-wallets/ead76015-a703-4f96-95bd-812b16a437a0/top-ups` → **201**

```json
{
  "command_id": "b311e3b3-3f73-4be8-8669-65b669ecffa4",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "ead76015-a703-4f96-95bd-812b16a437a0",
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
      "id": "28e0454e-ecc1-4dde-9fae-f33a85342d64",
      "at": "2026-10-29T14:39:52.422215Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dbc8e204-58e3-4757-9d17-fb29b01362f7",
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
  "id": "a526b798-949d-4093-8fe6-144c68e8d4cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:44:52.740613Z",
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
      "id": "882e89e6-95aa-4e42-9d30-65c26b018591",
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
  "device_ref": "sandbox-9189"
}
```

```json
{
  "challenge_id": "1f3a0ddd-f673-4c0d-be67-3ccec07883a3",
  "expires_at": "2026-10-29T14:44:53.044947548Z",
  "resend_available_at": "2026-10-29T14:39:54.044947548Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "080641",
  "sent_at": "2026-10-29T14:39:53.049177206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f3a0ddd-f673-4c0d-be67-3ccec07883a3",
  "code": "080641",
  "device_ref": "sandbox-9189"
}
```

```json
{
  "session_id": "acba1174-8943-4b04-9f69-29abe7a813e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTY5MywiaWF0IjoxNzkzMjg0NzkzLCJqdGkiOiI0ZjJhNDcwZi01NDA1LTQwZWItOGFjNi1mNmQ0YzI1NTc2YjYiLCJzaWQiOiJhY2JhMTE3NC04OTQzLTRiMDQtOWY2OS0yOWFiZTdhODEzZTUifQ.CA6uSTdHnacbp7hrw_chy7NNDkTC4xUcSTBhAuiS_1I",
  "access_expires_at": "2026-10-29T14:54:53.370827676Z",
  "refresh_token": "sGCyuqq-JBEauKTaNVJ2zhUADDQn9KTRykndHlSgpdk",
  "refresh_expires_at": "2026-11-28T14:39:53.37000781Z",
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
  "command_id": "ebfe0ff9-180b-43be-9b7e-243de6210886",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:53Z",
    "sequence": 1793284793951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "273ce383-8555-4b41-8290-4bea20ef00ec",
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
  "last_heartbeat_at": "2026-10-29T14:39:53.973561Z",
  "last_location_at": "2026-10-29T14:39:53.973561Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "22445e05-a4cc-47e6-b1e7-a80314680aa5",
  "quote_id": "a526b798-949d-4093-8fe6-144c68e8d4cf",
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
  "id": "aba73243-d581-49c4-984b-9a93af79ebde",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ead76015-a703-4f96-95bd-812b16a437a0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:39:54.29002Z",
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
  "client_id": "ead76015-a703-4f96-95bd-812b16a437a0",
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
      "id": "28e0454e-ecc1-4dde-9fae-f33a85342d64",
      "at": "2026-10-29T14:39:52.422215Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
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
    "id": "56633929-11a0-4a9e-89fd-0ece987b347d",
    "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
    "expires_at": "2026-10-29T14:40:09.302696Z",
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

`POST /api/driver/v1/offers/56633929-11a0-4a9e-89fd-0ece987b347d/accept` → **200**

```json
{
  "command_id": "2726d77d-690e-4384-a302-f3fb4dd1b5ca"
}
```

```json
{
  "id": "4a53b5b1-7e12-407e-a22b-1f2b27377bb0",
  "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24d59af8-6ed5-4fc7-bd41-e77a443bd7f6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24d59af8-6ed5-4fc7-bd41-e77a443bd7f6",
  "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
  "assignment_id": "4a53b5b1-7e12-407e-a22b-1f2b27377bb0",
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

`POST /api/driver/v1/work-sessions/273ce383-8555-4b41-8290-4bea20ef00ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:55Z",
    "sequence": 1793284795775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "273ce383-8555-4b41-8290-4bea20ef00ec",
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
  "last_heartbeat_at": "2026-10-29T14:39:55.796836Z",
  "last_location_at": "2026-10-29T14:39:55.796836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/24d59af8-6ed5-4fc7-bd41-e77a443bd7f6/arrive` → **200**

```json
{
  "command_id": "bd0c875a-c86d-466f-8963-a0bbd8c8b497",
  "expected_version": 0
}
```

```json
{
  "id": "24d59af8-6ed5-4fc7-bd41-e77a443bd7f6",
  "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
  "assignment_id": "4a53b5b1-7e12-407e-a22b-1f2b27377bb0",
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
  "arrived_at": "2026-10-29T14:39:56.112156Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/24d59af8-6ed5-4fc7-bd41-e77a443bd7f6/start` → **200**

```json
{
  "command_id": "6a5aa321-1e75-434e-99cc-84d976d04212",
  "expected_version": 1
}
```

```json
{
  "id": "24d59af8-6ed5-4fc7-bd41-e77a443bd7f6",
  "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
  "assignment_id": "4a53b5b1-7e12-407e-a22b-1f2b27377bb0",
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
  "arrived_at": "2026-10-29T14:39:56.112156Z",
  "started_at": "2026-10-29T14:39:56.432792Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/24d59af8-6ed5-4fc7-bd41-e77a443bd7f6/complete` → **200**

```json
{
  "command_id": "91059d40-8859-4277-b5a8-818184124596",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:39:56Z",
  "cash_received": true
}
```

```json
{
  "id": "24d59af8-6ed5-4fc7-bd41-e77a443bd7f6",
  "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
  "assignment_id": "4a53b5b1-7e12-407e-a22b-1f2b27377bb0",
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
  "arrived_at": "2026-10-29T14:39:56.112156Z",
  "started_at": "2026-10-29T14:39:56.432792Z",
  "completed_at": "2026-10-29T14:39:56.763444Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ead76015-a703-4f96-95bd-812b16a437a0",
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
      "id": "3ea37dec-bcc6-471b-9cc4-ff0eb42d9b61",
      "at": "2026-10-29T14:39:57.215241Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "aba73243-d581-49c4-984b-9a93af79ebde"
    },
    {
      "id": "28e0454e-ecc1-4dde-9fae-f33a85342d64",
      "at": "2026-10-29T14:39:52.422215Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/882e89e6-95aa-4e42-9d30-65c26b018591/archive` → **200**

```json
{
  "command_id": "2c3d41b5-3251-47a5-89d6-beea0224607a",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "882e89e6-95aa-4e42-9d30-65c26b018591",
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
  "created_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "created_at": "2026-10-29T14:39:51.200273Z",
  "updated_at": "2026-10-29T14:40:00.395111Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "273ce383-8555-4b41-8290-4bea20ef00ec",
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
  "last_heartbeat_at": "2026-10-29T14:39:55.796836Z",
  "last_location_at": "2026-10-29T14:39:55.796836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/273ce383-8555-4b41-8290-4bea20ef00ec/close` → **200**

```json
{
  "command_id": "a188fa2c-7a1b-4ba9-8211-aa4abd6460ea",
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

Done: order aba73243-d581-49c4-984b-9a93af79ebde.

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
  "session_id": "437d55a4-c5b6-42a4-bb28-cfecb4e91e0d",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MDEsImlhdCI6MTc5MzI4NDgwMSwianRpIjoiYzEzZWEwNmEtMjhjMi00MTM0LTk0ZWQtOWIwZjJmZWY3MjJmIiwic2lkIjoiNDM3ZDU1YTQtYzViNi00MmE0LWJiMjgtY2ZlY2I0ZTkxZTBkIn0.Auxq9tj_iky0APu8IGGbPk6NHi0XASvhqTsZCoMBNKg",
  "access_expires_at": "2026-10-29T14:55:01.674676189Z",
  "refresh_token": "pbBK_wcjonc7Copf2Nf1IVpvbQsuJgSAGXzkYUt6Tfc",
  "refresh_expires_at": "2026-10-30T02:40:01.673989309Z",
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
  "command_id": "eed340a4-2402-49c3-adc8-b5f458f66254",
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
  "session_id": "72a2de1c-1c11-4f87-b48e-481f9e1f4b7e",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MDIsImlhdCI6MTc5MzI4NDgwMiwianRpIjoiYjdlODlhMDQtMjA2Yy00ZDE3LTljYzAtYTJhN2QzZmNmOWYwIiwic2lkIjoiNzJhMmRlMWMtMWMxMS00Zjg3LWI0OGUtNDgxZjllMWY0YjdlIn0.KYT7bU5SROvvBsCy_38J9MnSWjKZ0pmfOLFT4t5qGVc",
  "access_expires_at": "2026-10-29T14:55:02.874616224Z",
  "refresh_token": "lVhm2Cbs-lTLOKz53HOwYl5iKwa8IlO1ARwzvlj1Huc",
  "refresh_expires_at": "2026-10-30T02:40:02.87387824Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.70705728",
    "linkedid": "1730052700.70705728",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677837322"
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
    "id": "1730052700.70705728",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "ffe31492-7ea0-4fc0-b97d-bc38c20cbabf",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.165042Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:40:03.192658Z",
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
    "id": "1730052600.2365629199",
    "linkedid": "1730052600.2365629199",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677837322"
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
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/94ac3f35-b32a-431e-879b-f377d97a6bf1/answer` → **200**

```json
{
  "command_id": "7fd0962a-88e8-474c-b332-57dd9779914e"
}
```

```json
{
  "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677837322",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "order_ids": [],
  "started_at": "2026-10-29T14:40:03.551123Z",
  "answered_at": "2026-10-29T14:40:03.895214Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2365629199",
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
    "id": "1730052600.2365629199",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": "2026-10-29T14:40:03.895214Z",
      "ended_at": "2026-10-29T14:40:04.235609Z",
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
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": "2026-10-29T14:40:03.895214Z",
      "ended_at": "2026-10-29T14:40:04.235609Z",
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
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": "2026-10-29T14:40:03.895214Z",
      "ended_at": "2026-10-29T14:40:04.235609Z",
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
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": "2026-10-29T14:40:03.895214Z",
      "ended_at": "2026-10-29T14:40:04.235609Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:10.967375Z"
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
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": "2026-10-29T14:40:03.895214Z",
      "ended_at": "2026-10-29T14:40:04.235609Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:10.967375Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/94ac3f35-b32a-431e-879b-f377d97a6bf1/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/94ac3f35-b32a-431e-879b-f377d97a6bf1/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=94ac3f35-b32a-431e-879b-f377d97a6bf1` → **200**

```json
{
  "changes": [
    {
      "id": "1836ebb0-affb-48fa-83c0-fbd5a6fc8dc2",
      "occurred_at": "2026-10-29T14:40:11.832594Z",
      "actor_type": "STAFF",
      "actor_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"db110906-0e99-42db-90fd-6b8d2aa4f5ed\", \"order_ids\": []}",
      "correlation_id": "64966e55-1c56-4686-a310-c1a67df22f09"
    },
    {
      "id": "45891787-08ad-4e1a-90b1-93871e4b75c3",
      "occurred_at": "2026-10-29T14:40:11.797111Z",
      "actor_type": "STAFF",
      "actor_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"db110906-0e99-42db-90fd-6b8d2aa4f5ed\", \"order_ids\": []}",
      "correlation_id": "e1bacadf-075e-4d6f-8c96-1246e7b6f99a"
    }
  ]
}
```

Done: call 94ac3f35-b32a-431e-879b-f377d97a6bf1 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12006"
}
```

```json
{
  "challenge_id": "7441e573-e544-4e0b-ab7e-169ca7df74df",
  "expires_at": "2026-10-29T14:45:12.180988092Z",
  "resend_available_at": "2026-10-29T14:40:13.180988092Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "393748",
  "sent_at": "2026-10-29T14:40:12.185354806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7441e573-e544-4e0b-ab7e-169ca7df74df",
  "code": "393748",
  "device_ref": "sandbox-12006"
}
```

```json
{
  "session_id": "7e2d6c33-2ca4-4f44-9c67-eef762797554",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcxMiwiaWF0IjoxNzkzMjg0ODEyLCJqdGkiOiJmZGJmYzViNy0wMzRjLTQ2ZTItOGJkYy1hYTc4YzEwNzdlYTQiLCJzaWQiOiI3ZTJkNmMzMy0yY2E0LTRmNDQtOWM2Ny1lZWY3NjI3OTc1NTQifQ.c8pLIV1SPb4BODw2ncLQa4aOB5tlcuNVOQf1AtTNp8A",
  "access_expires_at": "2026-10-29T14:55:12.519835746Z",
  "refresh_token": "ODPHDr4FdB1jXlwc5qwqrVAKLKw2fxEg1vFKN7HcegY",
  "refresh_expires_at": "2026-11-28T14:40:12.519123017Z",
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
  "command_id": "6faeb734-6515-485b-aeaa-1f6d5e9433bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:13Z",
    "sequence": 1793284813121
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c266b21-e5a9-4f44-90b6-388166b24ad6",
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
  "last_heartbeat_at": "2026-10-29T14:40:13.1447Z",
  "last_location_at": "2026-10-29T14:40:13.1447Z",
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
  "session_id": "ad75d619-3c41-425f-a1d3-2b7edfade736",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MTMsImlhdCI6MTc5MzI4NDgxMywianRpIjoiZjk2NDZmYzItNmQ5YS00MDYzLTgxODktNGEyZDkxMzc3ZjJmIiwic2lkIjoiYWQ3NWQ2MTktM2M0MS00MjVmLWExZDMtMmI3ZWRmYWRlNzM2In0.wMyBRCSx4WCZCzn9VUvZcH0sE_SY1H5fZ0vKRoGIxPM",
  "access_expires_at": "2026-10-29T14:55:13.753076209Z",
  "refresh_token": "Gf4Z4rFi0UPV4fX8DHNelpvItxmzMtZbymzQNh5wiMc",
  "refresh_expires_at": "2026-10-30T02:40:13.752398645Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8a12106d-86c9-472c-bccd-f6471765fb7f",
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
  "id": "e750ef89-10d5-4b8e-9b1a-512b53cb384e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:14.053750Z",
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
  "command_id": "313f1bc4-26f2-4550-8110-a09cc89c4677",
  "quote_id": "e750ef89-10d5-4b8e-9b1a-512b53cb384e",
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
    "phone": "+380671408697"
  }
}
```

```json
{
  "id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
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
  "created_at": "2026-10-29T14:40:14.377976Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671408697"
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
    "id": "b5a37082-fb47-4007-b29c-ce0a5ed83576",
    "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
    "expires_at": "2026-10-29T14:40:29.383749Z",
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

`POST /api/driver/v1/offers/b5a37082-fb47-4007-b29c-ce0a5ed83576/accept` → **200**

```json
{
  "command_id": "9aeeeecf-280a-4fab-8ca5-9b54597ae4d7"
}
```

```json
{
  "id": "62985150-f20b-47f1-b990-d828df3b805f",
  "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "22c33be8-664f-4c2e-84ea-ac2aca20a2ea",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "22c33be8-664f-4c2e-84ea-ac2aca20a2ea",
  "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
  "assignment_id": "62985150-f20b-47f1-b990-d828df3b805f",
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
    "phone": "+380671408697"
  }
}
```

`POST /api/driver/v1/work-sessions/5c266b21-e5a9-4f44-90b6-388166b24ad6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:16Z",
    "sequence": 1793284816679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c266b21-e5a9-4f44-90b6-388166b24ad6",
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
  "last_heartbeat_at": "2026-10-29T14:40:16.700792Z",
  "last_location_at": "2026-10-29T14:40:16.700792Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/22c33be8-664f-4c2e-84ea-ac2aca20a2ea/arrive` → **200**

```json
{
  "command_id": "21f373cc-4f6a-40c7-bd06-263ebb3e2a2e",
  "expected_version": 0
}
```

```json
{
  "id": "22c33be8-664f-4c2e-84ea-ac2aca20a2ea",
  "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
  "assignment_id": "62985150-f20b-47f1-b990-d828df3b805f",
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
  "arrived_at": "2026-10-29T14:40:16.990094Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671408697"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  },
  {
    "phone": "+380671408697",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:18.133228179Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  },
  {
    "phone": "+380671408697",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:18.133228179Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671408697` → **200**

```json
[
  {
    "phone": "+380671408697",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:16.120845055Z"
  },
  {
    "phone": "+380671408697",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:18.133228179Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/22c33be8-664f-4c2e-84ea-ac2aca20a2ea/start` → **200**

```json
{
  "command_id": "c46d0312-4d5f-4a88-bf9e-a997115a7b78",
  "expected_version": 1
}
```

```json
{
  "id": "22c33be8-664f-4c2e-84ea-ac2aca20a2ea",
  "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
  "assignment_id": "62985150-f20b-47f1-b990-d828df3b805f",
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
  "arrived_at": "2026-10-29T14:40:16.990094Z",
  "started_at": "2026-10-29T14:40:18.40342Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671408697"
  }
}
```

`POST /api/driver/v1/trips/22c33be8-664f-4c2e-84ea-ac2aca20a2ea/complete` → **200**

```json
{
  "command_id": "0954ec42-51ab-48c3-bce7-bfb8b34b8489",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:18Z",
  "cash_received": true
}
```

```json
{
  "id": "22c33be8-664f-4c2e-84ea-ac2aca20a2ea",
  "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
  "assignment_id": "62985150-f20b-47f1-b990-d828df3b805f",
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
  "arrived_at": "2026-10-29T14:40:16.990094Z",
  "started_at": "2026-10-29T14:40:18.40342Z",
  "completed_at": "2026-10-29T14:40:18.716614Z",
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
  "session_id": "5c266b21-e5a9-4f44-90b6-388166b24ad6",
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
  "last_heartbeat_at": "2026-10-29T14:40:16.700792Z",
  "last_location_at": "2026-10-29T14:40:16.700792Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5c266b21-e5a9-4f44-90b6-388166b24ad6/close` → **200**

```json
{
  "command_id": "32716739-8f7e-47ed-86a8-2390254c28c4",
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
  "phone": "+380639506757",
  "device_ref": "sandbox-8730"
}
```

```json
{
  "challenge_id": "b65603b8-19ca-49a4-9299-e5b81d23a8ba",
  "expires_at": "2026-10-29T14:45:19.627270963Z",
  "resend_available_at": "2026-10-29T14:40:20.627270963Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639506757` → **200**

```json
{
  "phone": "+380639506757",
  "audience": "CLIENT",
  "code": "426501",
  "sent_at": "2026-10-29T14:40:19.630912642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b65603b8-19ca-49a4-9299-e5b81d23a8ba",
  "code": "426501",
  "device_ref": "sandbox-8730"
}
```

```json
{
  "session_id": "66f15787-d2e5-4de1-9cc6-713099bf9060",
  "subject": {
    "type": "CLIENT",
    "id": "4025cb14-b995-4b81-b787-45571893da82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDI1Y2IxNC1iOTk1LTRiODEtYjc4Ny00NTU3MTg5M2RhODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzE5LCJpYXQiOjE3OTMyODQ4MTksImp0aSI6ImI0M2NjMTA3LWI4N2UtNGI0Zi04YzQ2LTc0NDFjNjZjMWRmYiIsInNpZCI6IjY2ZjE1Nzg3LWQyZTUtNGRlMS05Y2M2LTcxMzA5OWJmOTA2MCJ9.n9ebwt71EeUd5stMkXW8UnJL4uCpcOMIRp9jIT5mJZ8",
  "access_expires_at": "2026-10-29T14:55:19.960999597Z",
  "refresh_token": "1w5QukGvi0XE6hBGPHhun85nawA8FalcznE8WGaovAs",
  "refresh_expires_at": "2026-11-28T14:40:19.960372115Z",
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
  "device_ref": "sandbox-28594"
}
```

```json
{
  "challenge_id": "5572b78f-3e41-4584-8ad6-a650f0deac1a",
  "expires_at": "2026-10-29T14:45:20.541462695Z",
  "resend_available_at": "2026-10-29T14:40:21.541462695Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "690452",
  "sent_at": "2026-10-29T14:40:20.545618475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5572b78f-3e41-4584-8ad6-a650f0deac1a",
  "code": "690452",
  "device_ref": "sandbox-28594"
}
```

```json
{
  "session_id": "42f84954-3b60-4c3e-a24b-b1adfd1671b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcyMCwiaWF0IjoxNzkzMjg0ODIwLCJqdGkiOiIyYzY4NzBlNi05ZDQyLTQzNDYtYTM5Ny01MWJiNjQ0MWE2NzUiLCJzaWQiOiI0MmY4NDk1NC0zYjYwLTRjM2UtYTI0Yi1iMWFkZmQxNjcxYjcifQ.6LqrRd3D5IJj4pHT8jAdggnDoxIczhGTeh1O9EtZfls",
  "access_expires_at": "2026-10-29T14:55:20.866583972Z",
  "refresh_token": "5QU-hRan2cHIC3scrbfprry8GLqpv6eO8roUHBUn_sk",
  "refresh_expires_at": "2026-11-28T14:40:20.865905958Z",
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
  "session_id": "06100a9b-309f-4609-9430-4f486accec90",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MjEsImlhdCI6MTc5MzI4NDgyMSwianRpIjoiNjJmMDU2NmItNTBmOC00YTk3LTkwM2ItNjk3N2ZmNWFiYzA0Iiwic2lkIjoiMDYxMDBhOWItMzA5Zi00NjA5LTk0MzAtNGY0ODZhY2NlYzkwIn0.hB_VdajQ04NkgytvYzibMwmsC06MmeH2A7__uuJBaYs",
  "access_expires_at": "2026-10-29T14:55:21.738851659Z",
  "refresh_token": "O6ALtKPFugguZKSQbHkEDEMlBL7-T3u3KQ1Eofm0_XY",
  "refresh_expires_at": "2026-10-30T02:40:21.73820314Z",
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
  "session_id": "4d0607ac-966f-4336-88c9-d4255b5c3c77",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MjIsImlhdCI6MTc5MzI4NDgyMiwianRpIjoiMjBjODQ0YzAtZmM5Ni00OWM0LTk0MWUtZTE5MDFkYzY2ZTIwIiwic2lkIjoiNGQwNjA3YWMtOTY2Zi00MzM2LTg4YzktZDQyNTViNWMzYzc3In0.kp_22b9owpQDsJcyp2SbjpevRGzyLVR3ejHOn8dGnZU",
  "access_expires_at": "2026-10-29T14:55:22.339291992Z",
  "refresh_token": "a43N3jrX3sfVO_Tzvk1zOECWpLU2UZS1mCoFOsofXoA",
  "refresh_expires_at": "2026-10-30T02:40:22.338641086Z",
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
  "command_id": "4c54ac1d-be3e-412d-b346-f7bf7eb20cc1",
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
  "id": "0b3f42f4-58d0-48f2-b3ab-82fce698cba5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:22.933664Z",
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
  "command_id": "b27c40be-e82c-4a41-bb2c-447f8b158cae",
  "quote_id": "0b3f42f4-58d0-48f2-b3ab-82fce698cba5",
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
  "id": "077b367d-d3df-4e72-a92f-46c7a6251d11",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4025cb14-b995-4b81-b787-45571893da82",
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
  "created_at": "2026-10-29T14:40:23.251617Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/077b367d-d3df-4e72-a92f-46c7a6251d11` → **200**

```json
{
  "id": "077b367d-d3df-4e72-a92f-46c7a6251d11",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4025cb14-b995-4b81-b787-45571893da82",
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
  "created_at": "2026-10-29T14:40:23.251617Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/077b367d-d3df-4e72-a92f-46c7a6251d11/cancel` → **200**

```json
{
  "command_id": "fc7ae212-e60c-498a-a9a9-e51e2d4fef5f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "077b367d-d3df-4e72-a92f-46c7a6251d11",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4025cb14-b995-4b81-b787-45571893da82",
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
  "created_at": "2026-10-29T14:40:23.251617Z",
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
  "command_id": "0465e403-c33b-47c8-8b28-c7b6c003ce41",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:24Z",
    "sequence": 1793284824496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28d51e1f-f2de-4405-976f-58ae2540b783",
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
  "last_heartbeat_at": "2026-10-29T14:40:24.517109Z",
  "last_location_at": "2026-10-29T14:40:24.517109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27965"
}
```

```json
{
  "challenge_id": "8aabe9c8-a221-4c01-afca-f85686a267b9",
  "expires_at": "2026-10-29T14:45:24.810856328Z",
  "resend_available_at": "2026-10-29T14:40:25.810856328Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "530446",
  "sent_at": "2026-10-29T14:40:24.815355532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8aabe9c8-a221-4c01-afca-f85686a267b9",
  "code": "530446",
  "device_ref": "sandbox-27965"
}
```

```json
{
  "session_id": "ec3839e1-18bc-4fb4-996f-ddf2b58224ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcyNSwiaWF0IjoxNzkzMjg0ODI1LCJqdGkiOiJlNDRmNzRjMC1hY2QwLTRkMWQtODc2ZC1kODEyZjI0Mzg2ZGIiLCJzaWQiOiJlYzM4MzllMS0xOGJjLTRmYjQtOTk2Zi1kZGYyYjU4MjI0Y2EifQ.2p9LzFyfXZ1R-sBsgoNFPI8zFJoGs72G8VRG_dnIFhc",
  "access_expires_at": "2026-10-29T14:55:25.129888914Z",
  "refresh_token": "2zhplXY3un7z2l1t_QfXvDzN_aiBKy6fPjzz8ZnEQ9g",
  "refresh_expires_at": "2026-11-28T14:40:25.129216937Z",
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
  "command_id": "a55337bc-5eae-4dc3-95fd-5ab7f6b63efa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:25Z",
    "sequence": 1793284825706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:25.728846Z",
  "last_location_at": "2026-10-29T14:40:25.728846Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d71956bc-b52f-406f-a093-b65759ed17ad",
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
  "id": "92904db3-330e-46e7-a410-e818393c4aac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:26.039632Z",
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
  "command_id": "96f853ee-2c02-4abd-97b8-2a03865ebc8f",
  "quote_id": "92904db3-330e-46e7-a410-e818393c4aac",
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
  "id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4025cb14-b995-4b81-b787-45571893da82",
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
  "created_at": "2026-10-29T14:40:26.356804Z",
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
    "id": "1a0f0060-fb14-4221-87a0-5e2ee02e5d18",
    "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
    "expires_at": "2026-10-29T14:40:41.360873Z",
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

`POST /api/driver/v1/offers/1a0f0060-fb14-4221-87a0-5e2ee02e5d18/accept` → **200**

```json
{
  "command_id": "a2eee0b0-ebef-4cec-9422-2bda9628d8d4"
}
```

```json
{
  "id": "86566844-1ccc-4fdb-8f90-b7e018aed655",
  "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b64c5724-97a9-4d85-8999-a24f87dfc461",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b64c5724-97a9-4d85-8999-a24f87dfc461",
  "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "assignment_id": "86566844-1ccc-4fdb-8f90-b7e018aed655",
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

`POST /api/driver/v1/trips/b64c5724-97a9-4d85-8999-a24f87dfc461/cancel` → **200**

```json
{
  "command_id": "17cd41f2-9da3-4827-a558-d649a43e4154",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "b64c5724-97a9-4d85-8999-a24f87dfc461",
  "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "assignment_id": "86566844-1ccc-4fdb-8f90-b7e018aed655",
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

`GET /api/rider/v1/orders/2fc9b854-1eb3-490e-bd5d-2a8225963f3c` → **200**

```json
{
  "id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4025cb14-b995-4b81-b787-45571893da82",
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
    "id": "86566844-1ccc-4fdb-8f90-b7e018aed655",
    "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b64c5724-97a9-4d85-8999-a24f87dfc461",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:40:26.356804Z",
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
    "id": "1b36a7ec-69e1-4e7c-88e3-d464db2e937e",
    "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
    "expires_at": "2026-10-29T14:40:42.578695Z",
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

`POST /api/driver/v1/offers/1b36a7ec-69e1-4e7c-88e3-d464db2e937e/accept` → **200**

```json
{
  "command_id": "26e6a8fa-2043-4698-87a7-788bee2c049f"
}
```

```json
{
  "id": "29593f53-5c1d-42d0-802b-efd541a73e66",
  "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8e4d402f-4e6b-400d-9779-22fce6449cfd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8e4d402f-4e6b-400d-9779-22fce6449cfd",
  "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "assignment_id": "29593f53-5c1d-42d0-802b-efd541a73e66",
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

`POST /api/driver/v1/trips/8e4d402f-4e6b-400d-9779-22fce6449cfd/cancel` → **200**

```json
{
  "command_id": "83dc7c04-1e3d-494f-97c9-de9f00570517",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8e4d402f-4e6b-400d-9779-22fce6449cfd",
  "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
  "assignment_id": "29593f53-5c1d-42d0-802b-efd541a73e66",
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
    "id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:40:26.356804Z",
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
    "id": "077b367d-d3df-4e72-a92f-46c7a6251d11",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:40:23.251617Z",
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

`GET /api/operator/v1/orders/2fc9b854-1eb3-490e-bd5d-2a8225963f3c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:40:26.357464Z",
      "actor": {
        "type": "CLIENT",
        "id": "4025cb14-b995-4b81-b787-45571893da82",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
        "quote_id": "92904db3-330e-46e7-a410-e818393c4aac",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "3ae27e01-9277-4592-8d0c-a9408965af8a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:40:26.359868Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
        "attempt_id": "9574dbb6-dc5f-47ff-84c3-e37889638934",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3ae27e01-9277-4592-8d0c-a9408965af8a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:40:26.367677Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1a0f0060-fb14-4221-87a0-5e2ee02e5d18",
        "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "3ae27e01-9277-4592-8d0c-a9408965af8a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:40:26.970563Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1a0f0060-fb14-4221-87a0-5e2ee02e5d18",
        "order_id": "2fc9b854-1eb3-490e-bd5d-2a8225963f3c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "86566844-1ccc-4fdb-8f90-b7e018aed655"
      },
      "correlation_id": "4b1c0f2c-ad63-475f-80d7-0b14cc87f19a"
```

Done: orders 077b367d-d3df-4e72-a92f-46c7a6251d11, 2fc9b854-1eb3-490e-bd5d-2a8225963f3c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735839536",
  "device_ref": "sandbox-17743"
}
```

```json
{
  "challenge_id": "6f4abaf5-d7e2-467f-ab61-318520b8da5f",
  "expires_at": "2026-10-29T14:45:30.065803672Z",
  "resend_available_at": "2026-10-29T14:40:31.065803672Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735839536` → **200**

```json
{
  "phone": "+380735839536",
  "audience": "CLIENT",
  "code": "221131",
  "sent_at": "2026-10-29T14:40:30.069416056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f4abaf5-d7e2-467f-ab61-318520b8da5f",
  "code": "221131",
  "device_ref": "sandbox-17743"
}
```

```json
{
  "session_id": "debd443c-81dc-476f-9e06-c8221adffeef",
  "subject": {
    "type": "CLIENT",
    "id": "370146e2-10da-4568-b5fe-9c01faffa0e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNzAxNDZlMi0xMGRhLTQ1NjgtYjVmZS05YzAxZmFmZmEwZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzMwLCJpYXQiOjE3OTMyODQ4MzAsImp0aSI6Ijc0YWNiNTBlLTczZGEtNGU2ZS05ZmYxLTI5NjE5NWRmMDhmOSIsInNpZCI6ImRlYmQ0NDNjLTgxZGMtNDc2Zi05ZTA2LWM4MjIxYWRmZmVlZiJ9.9kFXKdGetjAGc6V9oGS4R4GzFM0MU5uW9pbOoEiUE58",
  "access_expires_at": "2026-10-29T14:55:30.39226153Z",
  "refresh_token": "ypyP_2B6tXiV1AdHRDH5zvqh8uakG0hMd0KRJng3JVo",
  "refresh_expires_at": "2026-11-28T14:40:30.391664865Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "fc1de106-016e-4c2b-9725-7cf21df97721",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "54259a0c-d11b-43e1-9ede-62337f43b11d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-54259a0c-d11b-43e1-9ede-62337f43b11d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "63a919b65121e37b3b6aded3f3389e20",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=54259a0c-d11b-43e1-9ede-62337f43b11d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735839536"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=54259a0c-d11b-43e1-9ede-62337f43b11d",
  "expires_at": "2026-10-29T15:10:30.687236Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/54259a0c-d11b-43e1-9ede-62337f43b11d` → **200**

```json
{
  "id": "54259a0c-d11b-43e1-9ede-62337f43b11d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:10:30.687236Z",
  "card": {
    "id": "6d41cadd-d6af-485e-b92d-827b2dd9bdd5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3126",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:40:31.002752Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6d41cadd-d6af-485e-b92d-827b2dd9bdd5",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3126",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:40:31.002752Z"
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
  "device_ref": "sandbox-16949"
}
```

```json
{
  "challenge_id": "a632ddb6-00a2-4714-b352-2e991f3a5a72",
  "expires_at": "2026-10-29T14:45:31.591350485Z",
  "resend_available_at": "2026-10-29T14:40:32.591350485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "900615",
  "sent_at": "2026-10-29T14:40:31.595080327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a632ddb6-00a2-4714-b352-2e991f3a5a72",
  "code": "900615",
  "device_ref": "sandbox-16949"
}
```

```json
{
  "session_id": "adc65b56-e83d-4d2c-bd01-7b05502162fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTczMSwiaWF0IjoxNzkzMjg0ODMxLCJqdGkiOiIxMTA5ZTQwMS00NDM2LTQxYWYtYjMzMy1hZjUxZTRhMWFmMjYiLCJzaWQiOiJhZGM2NWI1Ni1lODNkLTRkMmMtYmQwMS03YjA1NTAyMTYyZmUifQ.6jLMky3HSU9kLxkz0HE9iUMPujz866r1m0SQWnywZwE",
  "access_expires_at": "2026-10-29T14:55:31.915182792Z",
  "refresh_token": "tyIkXeA1VAxjBxapqT9Ypatk9H_vyP4u2JI8UrRBnQY",
  "refresh_expires_at": "2026-11-28T14:40:31.914583074Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:25.728846Z",
  "last_location_at": "2026-10-29T14:40:25.728846Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77599046-b8d8-42fb-8f1a-99bc678d8da4/handover` → **200**

```json
{
  "command_id": "1ddb4032-808f-4f1e-b99c-2713e02952b7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:25.728846Z",
  "last_location_at": "2026-10-29T14:40:25.728846Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77599046-b8d8-42fb-8f1a-99bc678d8da4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:32Z",
    "sequence": 1793284832797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:32.817018Z",
  "last_location_at": "2026-10-29T14:40:32.817018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b13624b4-da31-4fd6-a66d-c2ca9ddd4f8f",
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
  "id": "2de6f8a4-9785-46eb-bdaf-5bcc9f611f94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:33.121323Z",
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
  "command_id": "5e05c4a1-ffd9-44b1-8018-4c5048f735d5",
  "quote_id": "2de6f8a4-9785-46eb-bdaf-5bcc9f611f94",
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
  "id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
  "created_at": "2026-10-29T14:40:33.432745Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8` → **200**

```json
{
  "id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
  "created_at": "2026-10-29T14:40:33.432745Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8` → **200**

```json
{
  "id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
  "created_at": "2026-10-29T14:40:33.432745Z",
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
    "id": "d381cc0e-e869-4793-8c70-1770c24bb30a",
    "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
    "expires_at": "2026-10-29T14:40:49.438239Z",
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

`POST /api/driver/v1/offers/d381cc0e-e869-4793-8c70-1770c24bb30a/accept` → **200**

```json
{
  "command_id": "2bb5601f-020e-4585-9919-845869fd46d7"
}
```

```json
{
  "id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "assignment_id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
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

`POST /api/driver/v1/work-sessions/77599046-b8d8-42fb-8f1a-99bc678d8da4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:36Z",
    "sequence": 1793284836224
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:36.244997Z",
  "last_location_at": "2026-10-29T14:40:36.244997Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/850a10d6-cb98-4a76-8ab1-50dcb5234cd2/arrive` → **200**

```json
{
  "command_id": "e13fa226-ebb3-4afb-b4d1-820857ba1738",
  "expected_version": 0
}
```

```json
{
  "id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "assignment_id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
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
  "arrived_at": "2026-10-29T14:40:36.556904Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/850a10d6-cb98-4a76-8ab1-50dcb5234cd2/start` → **200**

```json
{
  "command_id": "2fcb3a1b-25cf-47d7-843e-535730463d95",
  "expected_version": 1
}
```

```json
{
  "id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "assignment_id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
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
  "arrived_at": "2026-10-29T14:40:36.556904Z",
  "started_at": "2026-10-29T14:40:36.863973Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/850a10d6-cb98-4a76-8ab1-50dcb5234cd2/complete` → **200**

```json
{
  "command_id": "3533af94-dfe7-4981-9396-228beb1eba5e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:37Z",
  "cash_received": true
}
```

```json
{
  "id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "assignment_id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
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
  "arrived_at": "2026-10-29T14:40:36.556904Z",
  "started_at": "2026-10-29T14:40:36.863973Z",
  "completed_at": "2026-10-29T14:40:37.180249Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8` → **200**

```json
{
  "id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
    "id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
    "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:33.432745Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8` → **200**

```json
{
  "id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
    "id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
    "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:33.432745Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8` → **200**

```json
{
  "id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
    "id": "0c84190c-c087-4dbb-9c77-9e90c7498385",
    "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "850a10d6-cb98-4a76-8ab1-50dcb5234cd2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:33.432745Z",
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

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8/tip` → **200**

```json
{
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
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
  "available_until": "2026-10-30T14:40:37.180249Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8/tip` → **201**

```json
{
  "command_id": "2c5adeab-edf0-42ee-9f13-db2bea885438",
  "amount_minor": 2500
}
```

```json
{
  "id": "709b56c7-cee0-4540-a6e4-79b08d27fe7e",
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:40:41.017406Z"
}
```

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8/tip` → **200**

```json
{
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
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
  "available_until": "2026-10-30T14:40:37.180249Z",
  "open": false,
  "tip": {
    "id": "709b56c7-cee0-4540-a6e4-79b08d27fe7e",
    "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:41.017406Z"
  }
}
```

`GET /api/rider/v1/orders/d57282a7-e9ae-496d-9909-f6f1e39183c8/tip` → **200**

```json
{
  "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
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
  "available_until": "2026-10-30T14:40:37.180249Z",
  "open": false,
  "tip": {
    "id": "709b56c7-cee0-4540-a6e4-79b08d27fe7e",
    "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:41.017406Z"
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
      "id": "e046de3d-d42f-4227-ab1a-b064c0e81630",
      "at": "2026-10-29T14:40:42.551042Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
      "counterpart_id": null
    },
    {
      "id": "3074d53d-ac61-46a4-b196-4bc39bfba374",
      "at": "2026-10-29T14:40:37.490995Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "67c0a959-c365-4ce4-8898-96ad55b582e0",
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
  "id": "1cabe635-da8b-474d-8dfe-b2ed50dba456",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:43.214123Z",
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
  "session_id": "19e960b9-a57f-4579-ad32-cf450eb1e752",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NDMsImlhdCI6MTc5MzI4NDg0MywianRpIjoiN2M3NzUzMWUtOTdkMC00ODFiLWE2MzQtODIzNTNiZjcwOTRkIiwic2lkIjoiMTllOTYwYjktYTU3Zi00NTc5LWFkMzItY2Y0NTBlYjFlNzUyIn0._XEu8K49b795L9HIoaot2KQ5A-u8wefoHl2LTGsvE80",
  "access_expires_at": "2026-10-29T14:55:43.818674057Z",
  "refresh_token": "G7zWxK_-Wygi-yHjoUtKARrlMoVdV4sE-82cbM4A1yE",
  "refresh_expires_at": "2026-10-30T02:40:43.818072416Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735839536` → **200**

```json
{
  "client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9"
}
```

`POST /api/admin/v1/rider-wallets/370146e2-10da-4568-b5fe-9c01faffa0e9/top-ups` → **201**

```json
{
  "command_id": "0699a480-c5c5-4136-932e-1df7a9756602",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
      "id": "c6637341-7194-41af-a15c-5662a9df0719",
      "at": "2026-10-29T14:40:44.389225Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bb239d11-c656-491e-ad00-6ecf585ab816",
  "quote_id": "1cabe635-da8b-474d-8dfe-b2ed50dba456",
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
  "id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
  "created_at": "2026-10-29T14:40:44.701479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b94baedc-caf9-42a1-9ad1-e99521e03ead` → **200**

```json
{
  "id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
  "created_at": "2026-10-29T14:40:44.701479Z",
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
    "id": "152716ab-c5ea-43e2-877c-013cce28661d",
    "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
    "expires_at": "2026-10-29T14:40:59.70632Z",
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

`POST /api/driver/v1/offers/152716ab-c5ea-43e2-877c-013cce28661d/accept` → **200**

```json
{
  "command_id": "7cf1fae0-acbc-4bc4-ac68-254a837a75d8"
}
```

```json
{
  "id": "47d95604-09a2-415d-9f3d-c15f4a700b52",
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b03570a9-0326-4d14-83ad-179ff192dfe4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b03570a9-0326-4d14-83ad-179ff192dfe4",
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "assignment_id": "47d95604-09a2-415d-9f3d-c15f4a700b52",
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

`POST /api/driver/v1/work-sessions/77599046-b8d8-42fb-8f1a-99bc678d8da4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:46Z",
    "sequence": 1793284846242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:46.262484Z",
  "last_location_at": "2026-10-29T14:40:46.262484Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b03570a9-0326-4d14-83ad-179ff192dfe4/arrive` → **200**

```json
{
  "command_id": "112f3e8f-4238-474f-94e3-b1f5d9a3385e",
  "expected_version": 0
}
```

```json
{
  "id": "b03570a9-0326-4d14-83ad-179ff192dfe4",
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "assignment_id": "47d95604-09a2-415d-9f3d-c15f4a700b52",
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
  "arrived_at": "2026-10-29T14:40:46.559086Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b03570a9-0326-4d14-83ad-179ff192dfe4/start` → **200**

```json
{
  "command_id": "062d45e3-586d-462e-82a8-5bc191dfcf1c",
  "expected_version": 1
}
```

```json
{
  "id": "b03570a9-0326-4d14-83ad-179ff192dfe4",
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "assignment_id": "47d95604-09a2-415d-9f3d-c15f4a700b52",
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
  "arrived_at": "2026-10-29T14:40:46.559086Z",
  "started_at": "2026-10-29T14:40:46.871985Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b03570a9-0326-4d14-83ad-179ff192dfe4/complete` → **200**

```json
{
  "command_id": "198c182f-c8da-4717-a84c-20ddc19f09ec",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:47Z",
  "cash_received": true
}
```

```json
{
  "id": "b03570a9-0326-4d14-83ad-179ff192dfe4",
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "assignment_id": "47d95604-09a2-415d-9f3d-c15f4a700b52",
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
  "arrived_at": "2026-10-29T14:40:46.559086Z",
  "started_at": "2026-10-29T14:40:46.871985Z",
  "completed_at": "2026-10-29T14:40:47.190666Z",
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
  "client_id": "370146e2-10da-4568-b5fe-9c01faffa0e9",
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
      "id": "c6637341-7194-41af-a15c-5662a9df0719",
      "at": "2026-10-29T14:40:44.389225Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
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

`GET /api/rider/v1/orders/b94baedc-caf9-42a1-9ad1-e99521e03ead/tip` → **200**

```json
{
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
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
  "available_until": "2026-10-30T14:40:47.190666Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b94baedc-caf9-42a1-9ad1-e99521e03ead/tip` → **201**

```json
{
  "command_id": "b5ad8602-edb7-4ebc-94a9-bdc73fe89cc2",
  "amount_minor": 2500
}
```

```json
{
  "id": "77a1e040-33f6-4b71-bbe3-7347042b255e",
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:40:48.394062Z"
}
```

`GET /api/rider/v1/orders/b94baedc-caf9-42a1-9ad1-e99521e03ead/tip` → **200**

```json
{
  "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
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
  "available_until": "2026-10-30T14:40:47.190666Z",
  "open": false,
  "tip": {
    "id": "77a1e040-33f6-4b71-bbe3-7347042b255e",
    "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:48.394062Z"
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
      "id": "3c5470b2-b1e5-40be-b08c-65189b171c53",
      "at": "2026-10-29T14:40:47.588257Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
      "counterpart_id": null
    },
    {
      "id": "e046de3d-d42f-4227-ab1a-b064c0e81630",
      "at": "2026-10-29T14:40:42.551042Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
      "counterpart_id": null
    },
    {
      "id": "3074d53d-ac61-46a4-b196-4bc39bfba374",
      "at": "2026-10-29T14:40:37.490995Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
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
      "id": "693a481e-7d85-47a4-8985-1c3b98e97229",
      "at": "2026-10-29T14:40:49.613362Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
      "counterpart_id": null
    },
    {
      "id": "3c5470b2-b1e5-40be-b08c-65189b171c53",
      "at": "2026-10-29T14:40:47.588257Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b94baedc-caf9-42a1-9ad1-e99521e03ead",
      "counterpart_id": null
    },
    {
      "id": "e046de3d-d42f-4227-ab1a-b064c0e81630",
      "at": "2026-10-29T14:40:42.551042Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
      "counterpart_id": null
    },
    {
      "id": "3074d53d-ac61-46a4-b196-4bc39bfba374",
      "at": "2026-10-29T14:40:37.490995Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d57282a7-e9ae-496d-9909-f6f1e39183c8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "77599046-b8d8-42fb-8f1a-99bc678d8da4",
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
  "last_heartbeat_at": "2026-10-29T14:40:46.262484Z",
  "last_location_at": "2026-10-29T14:40:46.262484Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77599046-b8d8-42fb-8f1a-99bc678d8da4/close` → **200**

```json
{
  "command_id": "5f31a423-da26-4923-9014-ed6bbac93457",
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

Done: card order b94baedc-caf9-42a1-9ad1-e99521e03ead.

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
  "phone": "+380731057734",
  "device_ref": "sandbox-30905"
}
```

```json
{
  "challenge_id": "45e1edb4-facf-4327-9936-52ff43b38f3a",
  "expires_at": "2026-10-29T14:45:51.483870758Z",
  "resend_available_at": "2026-10-29T14:40:52.483870758Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731057734` → **200**

```json
{
  "phone": "+380731057734",
  "audience": "CLIENT",
  "code": "280083",
  "sent_at": "2026-10-29T14:40:51.486792899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45e1edb4-facf-4327-9936-52ff43b38f3a",
  "code": "280083",
  "device_ref": "sandbox-30905"
}
```

```json
{
  "session_id": "4a434db5-3a3b-4aed-830f-52a47fb347ed",
  "subject": {
    "type": "CLIENT",
    "id": "19f86322-8fe3-4d81-b477-0c7cd32e66a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWY4NjMyMi04ZmUzLTRkODEtYjQ3Ny0wYzdjZDMyZTY2YTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzUxLCJpYXQiOjE3OTMyODQ4NTEsImp0aSI6ImY2YWFlZTgyLTUwYjctNDUwMy1hYzBjLTBkYWI3MjI4MDlmMyIsInNpZCI6IjRhNDM0ZGI1LTNhM2ItNGFlZC04MzBmLTUyYTQ3ZmIzNDdlZCJ9.tfjhwLnDWkZNw6lJcvBHaB2iQDVVaBpFWksKkTkbU-A",
  "access_expires_at": "2026-10-29T14:55:51.807403088Z",
  "refresh_token": "EMyzIK1p5BeqXlffSS6FAuENNbzSvI4x516iBPbKA3w",
  "refresh_expires_at": "2026-11-28T14:40:51.806724162Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c83617aa-f715-46f0-b3c6-69f56fe01557",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "94a3c40a-0c8c-4bb5-94b6-498f32229697",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-94a3c40a-0c8c-4bb5-94b6-498f32229697",
    "orderDate": "1793284852",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "03b2bfff87e9669bc974c2854a209983",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=94a3c40a-0c8c-4bb5-94b6-498f32229697",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731057734"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=94a3c40a-0c8c-4bb5-94b6-498f32229697",
  "created_at": "2026-10-29T14:40:52.112832Z",
  "expires_at": "2026-10-29T15:10:52.112832Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/94a3c40a-0c8c-4bb5-94b6-498f32229697` → **200**

```json
{
  "id": "94a3c40a-0c8c-4bb5-94b6-498f32229697",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:40:52.112832Z",
  "expires_at": "2026-10-29T15:10:52.112832Z",
  "completed_at": "2026-10-29T14:40:52.420594Z",
  "masked_pan": "41****2397",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "19f86322-8fe3-4d81-b477-0c7cd32e66a4",
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
      "id": "c1f03212-4f65-4e18-b7ff-b701263f01ab",
      "at": "2026-10-29T14:40:52.628936Z",
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
  "client_id": "19f86322-8fe3-4d81-b477-0c7cd32e66a4",
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
      "id": "c1f03212-4f65-4e18-b7ff-b701263f01ab",
      "at": "2026-10-29T14:40:52.628936Z",
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
  "device_ref": "sandbox-2366"
}
```

```json
{
  "challenge_id": "acb50428-befc-4f18-a35b-38268f9057eb",
  "expires_at": "2026-10-29T14:45:53.324575523Z",
  "resend_available_at": "2026-10-29T14:40:54.324575523Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "430212",
  "sent_at": "2026-10-29T14:40:53.328190473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "acb50428-befc-4f18-a35b-38268f9057eb",
  "code": "430212",
  "device_ref": "sandbox-2366"
}
```

```json
{
  "session_id": "432765fa-5095-470a-a2a5-41de7f404097",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc1MywiaWF0IjoxNzkzMjg0ODUzLCJqdGkiOiJhNTAwMTMyZS05MzRlLTRhM2QtODJkZi1mNDYwYTljMGM3ZTAiLCJzaWQiOiI0MzI3NjVmYS01MDk1LTQ3MGEtYTJhNS00MWRlN2Y0MDQwOTcifQ.dTQYVU5AIP3KGldmwthDSSdDEhFwUexi_D3MgWxCnSk",
  "access_expires_at": "2026-10-29T14:55:53.654143295Z",
  "refresh_token": "FIb0KS1H-KfDa4U8VvApIRKHogwxDBp6aq0as0NHBOw",
  "refresh_expires_at": "2026-11-28T14:40:53.653528871Z",
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
  "command_id": "7921dbc7-b772-4531-a7ae-e456ec7f8bd3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "252be85c-c255-4330-b883-bae9309b0c41",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-252be85c-c255-4330-b883-bae9309b0c41",
    "orderDate": "1793284854",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "f38c2959301213764c42e9f577710643",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=252be85c-c255-4330-b883-bae9309b0c41",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=252be85c-c255-4330-b883-bae9309b0c41",
  "created_at": "2026-10-29T14:40:54.243089Z",
  "expires_at": "2026-10-29T15:10:54.243089Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/252be85c-c255-4330-b883-bae9309b0c41` → **200**

```json
{
  "id": "252be85c-c255-4330-b883-bae9309b0c41",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:40:54.243089Z",
  "expires_at": "2026-10-29T15:10:54.243089Z",
  "completed_at": "2026-10-29T14:40:54.536755Z",
  "masked_pan": "41****9158",
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
      "id": "3abbe4cd-399c-4c7e-a936-08e1971d1fd4",
      "at": "2026-10-29T14:40:54.637413Z",
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
  "command_id": "c65b6aab-9284-4b86-914a-cf519a1aed3d",
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
  "correlation_id": "3c1e9172-bf60-4a8a-8b20-a52f87676e3f"
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
  "device_ref": "sandbox-28262"
}
```

```json
{
  "challenge_id": "9de10f94-653c-43a9-90f0-2eef9cf4e1b9",
  "expires_at": "2026-10-29T14:45:55.468540763Z",
  "resend_available_at": "2026-10-29T14:40:56.468540763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "031806",
  "sent_at": "2026-10-29T14:40:55.471247609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9de10f94-653c-43a9-90f0-2eef9cf4e1b9",
  "code": "031806",
  "device_ref": "sandbox-28262"
}
```

```json
{
  "session_id": "ebde0862-27e3-4361-a0d7-9944d845c20d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc1NSwiaWF0IjoxNzkzMjg0ODU1LCJqdGkiOiI4OTQ0MzY1ZS04NjFjLTQ0ODctOGFjMS01ZmY5MWE4YWY3ZDAiLCJzaWQiOiJlYmRlMDg2Mi0yN2UzLTQzNjEtYTBkNy05OTQ0ZDg0NWMyMGQifQ.ZgTkA9P0q9PRUjS6gxXOOY0NTCSeke0X6tsldk3pdks",
  "access_expires_at": "2026-10-29T14:55:55.780394595Z",
  "refresh_token": "JgTjEr1I2FPtjgbGMQR2IptE6_lucBs6WGXoWyJCX58",
  "refresh_expires_at": "2026-11-28T14:40:55.779790389Z",
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
  "command_id": "ab4b04ec-5a2e-4690-bda6-a6af3e36ec41",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:56Z",
    "sequence": 1793284856369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f978894-d43e-43c3-889e-73161854a078",
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
  "last_heartbeat_at": "2026-10-29T14:40:56.3891Z",
  "last_location_at": "2026-10-29T14:40:56.3891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630077083",
  "device_ref": "sandbox-16446"
}
```

```json
{
  "challenge_id": "aefe9450-0d19-411d-b2cc-891f4acb1f4b",
  "expires_at": "2026-10-29T14:45:56.698872528Z",
  "resend_available_at": "2026-10-29T14:40:57.698872528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630077083` → **200**

```json
{
  "phone": "+380630077083",
  "audience": "CLIENT",
  "code": "805385",
  "sent_at": "2026-10-29T14:40:56.70203886Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aefe9450-0d19-411d-b2cc-891f4acb1f4b",
  "code": "805385",
  "device_ref": "sandbox-16446"
}
```

```json
{
  "session_id": "2b179de4-4a31-4a61-ba8e-f5d127f91ec2",
  "subject": {
    "type": "CLIENT",
    "id": "4798fbee-ffe2-46d4-b9e3-e8518b7548ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Nzk4ZmJlZS1mZmUyLTQ2ZDQtYjllMy1lODUxOGI3NTQ4YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzU3LCJpYXQiOjE3OTMyODQ4NTcsImp0aSI6ImZmYjJiY2VkLWNlZGItNDk4ZC1iZTE0LTcxNTMzZjZmYTBiMyIsInNpZCI6IjJiMTc5ZGU0LTRhMzEtNGE2MS1iYThlLWY1ZDEyN2Y5MWVjMiJ9.94MfYOMrbT7SYL2f4dT-dbW1Y990opkVVBC2VpMPEKA",
  "access_expires_at": "2026-10-29T14:55:57.019073987Z",
  "refresh_token": "fWfbV8Q1-S2RZgARmgwXm6q4mYAxYGWu2cSJz9IEzvs",
  "refresh_expires_at": "2026-11-28T14:40:57.018547526Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "34c962e5-bde3-437c-b12a-38b2cde610b1",
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
  "id": "739b7f44-93fe-473c-bcf1-dd10bb353eba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:57.325779Z",
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
  "command_id": "1d9a16ec-bbcc-423c-9126-9366ca7e5650",
  "quote_id": "739b7f44-93fe-473c-bcf1-dd10bb353eba",
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
  "id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4798fbee-ffe2-46d4-b9e3-e8518b7548ab",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:40:57.639895Z",
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
    "id": "2e4f1bb1-0b1f-459e-b4e7-4e2bcca20046",
    "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
    "expires_at": "2026-10-29T14:41:12.643132Z",
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

`POST /api/driver/v1/offers/2e4f1bb1-0b1f-459e-b4e7-4e2bcca20046/accept` → **200**

```json
{
  "command_id": "d80ef796-fe33-4f3d-b023-f3f6c4b874ba"
}
```

```json
{
  "id": "62967bc3-28cd-4e41-93a3-b68f099b8173",
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d679c75b-32a2-4474-b82b-4a86ad21c599",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d679c75b-32a2-4474-b82b-4a86ad21c599",
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "assignment_id": "62967bc3-28cd-4e41-93a3-b68f099b8173",
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

`POST /api/driver/v1/work-sessions/8f978894-d43e-43c3-889e-73161854a078/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:58Z",
    "sequence": 1793284858836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f978894-d43e-43c3-889e-73161854a078",
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
  "last_heartbeat_at": "2026-10-29T14:40:58.856272Z",
  "last_location_at": "2026-10-29T14:40:58.856272Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d679c75b-32a2-4474-b82b-4a86ad21c599/arrive` → **200**

```json
{
  "command_id": "7f32507d-5fe1-4645-8ce9-6e45787f0276",
  "expected_version": 0
}
```

```json
{
  "id": "d679c75b-32a2-4474-b82b-4a86ad21c599",
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "assignment_id": "62967bc3-28cd-4e41-93a3-b68f099b8173",
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
  "arrived_at": "2026-10-29T14:40:59.168403Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d679c75b-32a2-4474-b82b-4a86ad21c599/start` → **200**

```json
{
  "command_id": "7bc99eae-6236-4466-a358-f0d7968277c0",
  "expected_version": 1
}
```

```json
{
  "id": "d679c75b-32a2-4474-b82b-4a86ad21c599",
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "assignment_id": "62967bc3-28cd-4e41-93a3-b68f099b8173",
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
  "arrived_at": "2026-10-29T14:40:59.168403Z",
  "started_at": "2026-10-29T14:40:59.485186Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d679c75b-32a2-4474-b82b-4a86ad21c599/complete` → **200**

```json
{
  "command_id": "b9741aea-000b-4c9e-9288-1aa5650d4aae",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:59Z",
  "cash_received": false
}
```

```json
{
  "id": "d679c75b-32a2-4474-b82b-4a86ad21c599",
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "assignment_id": "62967bc3-28cd-4e41-93a3-b68f099b8173",
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
  "arrived_at": "2026-10-29T14:40:59.168403Z",
  "started_at": "2026-10-29T14:40:59.485186Z",
  "completed_at": "2026-10-29T14:40:59.798669Z",
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
  "session_id": "7220be29-9dac-42e9-a5c9-e2f59240369a",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NjAsImlhdCI6MTc5MzI4NDg2MCwianRpIjoiZWM1NmY2NmItMDM1NS00MGY3LTgxMDgtNjNhNDExZDFjMTI3Iiwic2lkIjoiNzIyMGJlMjktOWRhYy00MmU5LWE1YzktZTJmNTkyNDAzNjlhIn0.2qO4zV-hedDEL9XSPqtoJ64SmoNMSugdj3CIEOu9RyU",
  "access_expires_at": "2026-10-29T14:56:00.395208925Z",
  "refresh_token": "pTyAotob4vDNGA4NqjqKoSK5QHcA5zA19dcEIETmKY0",
  "refresh_expires_at": "2026-10-30T02:41:00.394661815Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/503f2dd8-5236-49ce-aaa5-6a58a6d38d01/cash-dispute` → **200**

```json
{
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4798fbee-ffe2-46d4-b9e3-e8518b7548ab",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:41:00.688035Z",
  "decide_by": "2026-11-12T14:41:00.688035Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:41:00.688035Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "4798fbee-ffe2-46d4-b9e3-e8518b7548ab",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:41:00.688035Z",
      "decide_by": "2026-11-12T14:41:00.688035Z",
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

`POST /api/admin/v1/orders/503f2dd8-5236-49ce-aaa5-6a58a6d38d01/cash-dispute/decide` → **400**

```json
{
  "command_id": "b82bef74-d628-4b19-adb7-7a54400ffa30",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/503f2dd8-5236-49ce-aaa5-6a58a6d38d01/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0a6ce1ec-5330-49cb-a370-235cccbdc166",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/503f2dd8-5236-49ce-aaa5-6a58a6d38d01/cash-dispute/decide` → **200**

```json
{
  "command_id": "eaf2b3d0-49d2-4304-968c-fb7e3ca8184b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4798fbee-ffe2-46d4-b9e3-e8518b7548ab",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:41:00.688035Z",
  "decide_by": "2026-11-12T14:41:00.688035Z",
  "decision": "PAY_DRIVER",
  "decided_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:41:01.766823Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/503f2dd8-5236-49ce-aaa5-6a58a6d38d01/cash-dispute/decide` → **409**

```json
{
  "command_id": "a640ce63-73b5-4e68-982c-943a5e81e234",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/503f2dd8-5236-49ce-aaa5-6a58a6d38d01/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d9e4e9a1-7b8a-459e-af7a-408d546839d7"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f978894-d43e-43c3-889e-73161854a078",
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
  "last_heartbeat_at": "2026-10-29T14:40:58.856272Z",
  "last_location_at": "2026-10-29T14:40:58.856272Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8f978894-d43e-43c3-889e-73161854a078/close` → **200**

```json
{
  "command_id": "c63181f2-c3ac-4bb9-9b9f-edc12a23cfbe",
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
  "phone": "+380735943919",
  "device_ref": "sandbox-18311"
}
```

```json
{
  "challenge_id": "ecfd7f0a-f551-4f64-bb9e-c663db489371",
  "expires_at": "2026-10-29T14:46:02.984490494Z",
  "resend_available_at": "2026-10-29T14:41:03.984490494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735943919` → **200**

```json
{
  "phone": "+380735943919",
  "audience": "CLIENT",
  "code": "356456",
  "sent_at": "2026-10-29T14:41:02.987455502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecfd7f0a-f551-4f64-bb9e-c663db489371",
  "code": "356456",
  "device_ref": "sandbox-18311"
}
```

```json
{
  "session_id": "b3f91f7a-5476-47b4-800c-f99b82295038",
  "subject": {
    "type": "CLIENT",
    "id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZWQ3ZjIzZS03MTQyLTRkOGMtYjAxNi1mNGUzOTJjYzM0Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzYzLCJpYXQiOjE3OTMyODQ4NjMsImp0aSI6IjAwNzVhNTc3LWEzNjUtNDA1Ni1iZWIxLWRiODNiNzgyMDEwMiIsInNpZCI6ImIzZjkxZjdhLTU0NzYtNDdiNC04MDBjLWY5OWI4MjI5NTAzOCJ9.4yAA_e2WqVkWnrM9yP_8pD-uLe3eIKYndeO_p1WBEF0",
  "access_expires_at": "2026-10-29T14:56:03.303896013Z",
  "refresh_token": "uohV6bihOR_yYiyPEVtIV2T_sPNHvFG0f5YOvENPJSo",
  "refresh_expires_at": "2026-11-28T14:41:03.303317855Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a43888ae-6fce-4200-a8da-5980800b9359",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3c70aebb-dac8-4eb9-bdac-54c90452d19d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3c70aebb-dac8-4eb9-bdac-54c90452d19d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "cbc7eade20c82a03873e4e4f8fc7c0d6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3c70aebb-dac8-4eb9-bdac-54c90452d19d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735943919"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3c70aebb-dac8-4eb9-bdac-54c90452d19d",
  "expires_at": "2026-10-29T15:11:03.599035Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3c70aebb-dac8-4eb9-bdac-54c90452d19d` → **200**

```json
{
  "id": "3c70aebb-dac8-4eb9-bdac-54c90452d19d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:11:03.599035Z",
  "card": {
    "id": "669fc1c7-00a7-4a58-9a7a-f5ae2f8cc2c2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5322",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:41:03.905724Z"
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
  "device_ref": "sandbox-3418"
}
```

```json
{
  "challenge_id": "9bbe8a57-6f86-4807-9417-1e0f7d5a7c16",
  "expires_at": "2026-10-29T14:46:04.225707218Z",
  "resend_available_at": "2026-10-29T14:41:05.225707218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "391495",
  "sent_at": "2026-10-29T14:41:04.228404618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9bbe8a57-6f86-4807-9417-1e0f7d5a7c16",
  "code": "391495",
  "device_ref": "sandbox-3418"
}
```

```json
{
  "session_id": "72d98e0e-8e81-4a53-a928-33f55255b4cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc2NCwiaWF0IjoxNzkzMjg0ODY0LCJqdGkiOiJkZWFhZjA0Ny03MGExLTRiNGQtYWQ3Mi0wY2ViZjZlNGJmZTYiLCJzaWQiOiI3MmQ5OGUwZS04ZTgxLTRhNTMtYTkyOC0zM2Y1NTI1NWI0Y2IifQ.7Wj9VFX9M31WCyEFEKSb8F3jNqduqX7Aeg_Q8G-0CcA",
  "access_expires_at": "2026-10-29T14:56:04.543510834Z",
  "refresh_token": "oulk5UjUr30Y-DOpJfikXvbQFx77Q60M2cd7hzLC2OY",
  "refresh_expires_at": "2026-11-28T14:41:04.542972901Z",
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
  "command_id": "6afa49d0-efff-474c-a500-a2c3bc32b247",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:05Z",
    "sequence": 1793284865114
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a69e70b-a293-4867-a421-139db246ffb7",
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
  "last_heartbeat_at": "2026-10-29T14:41:05.134114Z",
  "last_location_at": "2026-10-29T14:41:05.134114Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc77b12d-8019-4099-9828-2f29b5cc7cea",
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
  "id": "bbf42117-046d-4007-a284-4cd790ecc411",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:05.458019Z",
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
  "command_id": "51619b27-7afc-4dbd-bd86-c5eac1151d45",
  "quote_id": "bbf42117-046d-4007-a284-4cd790ecc411",
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
  "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
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
  "created_at": "2026-10-29T14:41:05.766587Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb` → **200**

```json
{
  "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
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
  "created_at": "2026-10-29T14:41:05.766587Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb` → **200**

```json
{
  "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
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
  "created_at": "2026-10-29T14:41:05.766587Z",
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
    "id": "ad958a9d-1cf3-465f-bb05-a5482abf8b3a",
    "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
    "expires_at": "2026-10-29T14:41:21.73059Z",
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

`POST /api/driver/v1/offers/ad958a9d-1cf3-465f-bb05-a5482abf8b3a/accept` → **200**

```json
{
  "command_id": "5a78922f-f6e8-4045-8f7d-26d63d4019e6"
}
```

```json
{
  "id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "assignment_id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
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

`POST /api/rider/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/messages` → **201**

```json
{
  "command_id": "bd327ba5-2e73-4ab9-ae67-ca9c9f0a66e4",
  "body": "Я біля входу, мій номер +380735943919, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7697925d-41be-40ed-a535-fc5636cda203",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735943919, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:41:08.578231875Z"
}
```

`POST /api/driver/v1/trips/e9f5ab80-0688-44f7-abac-65372d0a7393/messages` → **201**

```json
{
  "command_id": "fa622b53-701d-49f2-9aaa-39319b236a0a",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "4a77b002-d70c-4dcb-b1da-c5d7623adfb1",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:41:08.889713177Z"
}
```

`POST /api/driver/v1/work-sessions/1a69e70b-a293-4867-a421-139db246ffb7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:09Z",
    "sequence": 1793284869174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a69e70b-a293-4867-a421-139db246ffb7",
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
  "last_heartbeat_at": "2026-10-29T14:41:09.19519Z",
  "last_location_at": "2026-10-29T14:41:09.19519Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e9f5ab80-0688-44f7-abac-65372d0a7393/arrive` → **200**

```json
{
  "command_id": "d9329edd-e213-4086-867a-357c39097925",
  "expected_version": 0
}
```

```json
{
  "id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "assignment_id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
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
  "arrived_at": "2026-10-29T14:41:09.497043Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9f5ab80-0688-44f7-abac-65372d0a7393/start` → **200**

```json
{
  "command_id": "883f68c4-b451-4a4f-834d-1f3ad43f6842",
  "expected_version": 1
}
```

```json
{
  "id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "assignment_id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
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
  "arrived_at": "2026-10-29T14:41:09.497043Z",
  "started_at": "2026-10-29T14:41:09.808245Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1a69e70b-a293-4867-a421-139db246ffb7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:10Z",
    "sequence": 1793284870878
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1a69e70b-a293-4867-a421-139db246ffb7",
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
  "last_heartbeat_at": "2026-10-29T14:41:10.107656Z",
  "last_location_at": "2026-10-29T14:41:10.107656Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e9f5ab80-0688-44f7-abac-65372d0a7393/complete` → **200**

```json
{
  "command_id": "7c564e23-a759-4222-93c5-baf7974859eb",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:41:10Z",
  "cash_received": false
}
```

```json
{
  "id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "assignment_id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
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
  "arrived_at": "2026-10-29T14:41:09.497043Z",
  "started_at": "2026-10-29T14:41:09.808245Z",
  "completed_at": "2026-10-29T14:41:10.411375Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb` → **200**

```json
{
  "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
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
    "id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
    "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:05.766587Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb` → **200**

```json
{
  "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
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
    "id": "cf1f582e-337c-4c7a-8b17-1fa1868fa816",
    "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e9f5ab80-0688-44f7-abac-65372d0a7393",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:05.766587Z",
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
  "session_id": "1a69e70b-a293-4867-a421-139db246ffb7",
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
  "last_heartbeat_at": "2026-10-29T14:41:10.107656Z",
  "last_location_at": "2026-10-29T14:41:10.107656Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1a69e70b-a293-4867-a421-139db246ffb7/close` → **200**

```json
{
  "command_id": "7d5a737c-c4e3-4f15-ad52-d5b25fa32cf1",
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
  "session_id": "e000034c-25e0-4c76-afde-a3c9e7cf2c75",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NzMsImlhdCI6MTc5MzI4NDg3MywianRpIjoiMDljOWE4MGQtZmRlYy00N2NkLWE4ZGUtOTdkNjQzYTgyNzI3Iiwic2lkIjoiZTAwMDAzNGMtMjVlMC00Yzc2LWFmZGUtYTNjOWU3Y2YyYzc1In0.72q36x8xgFYEg9rthk_36M7etp8e_TVQWF6XbOIqG_8",
  "access_expires_at": "2026-10-29T14:56:13.258686654Z",
  "refresh_token": "2FOaQ3DANeXB_dFVEHYCOzfc2EvW5J70k-QELKGWC7s",
  "refresh_expires_at": "2026-10-30T02:41:13.258112163Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e5f2c6b1-e1fc-4020-856f-4d6b811eaf35"
}
```

`GET /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:41:13.837945915Z",
  "order": {
    "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
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
    "created_at": "2026-10-29T14:41:05.766587Z",
    "assigned_at": "2026-10-29T14:41:07.981871Z",
    "arrived_at": "2026-10-29T14:41:09.497043Z",
    "started_at": "2026-10-29T14:41:09.808245Z",
    "completed_at": "2026-10-29T14:41:10.411375Z"
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
    "id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
    "registered_at": "2026-10-29T14:41:03.301539Z",
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
      "created_at": "2026-10-29T14:41:05.769236Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:41:10.789663Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks` → **422**

```json
{
  "command_id": "246e1359-321b-42ce-b0ec-07c670aba48e",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "c509a7ec-58b8-44f3-b3d6-3d044de7438f"
}
```

`POST /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks` → **201**

```json
{
  "command_id": "39b59cf8-81ff-4de3-8272-4594d2c82b9b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "fa750371-2772-49f0-b517-b03d8a4a0d96",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:41:14.496657Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks` → **201**

```json
{
  "command_id": "39b59cf8-81ff-4de3-8272-4594d2c82b9b",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "fa750371-2772-49f0-b517-b03d8a4a0d96",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:41:14.496657Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/ded7f23e-7142-4d8c-b016-f4e392cc34ca` → **200**

```json
{
  "client": {
    "id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
    "phone": "+380735943919",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:03.301539Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:05.766587Z",
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

`POST /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks/fa750371-2772-49f0-b517-b03d8a4a0d96/resolve` → **200**

```json
{
  "command_id": "4eaa1641-c2ce-407a-8eff-6bcaa991f535",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "fa750371-2772-49f0-b517-b03d8a4a0d96",
  "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:41:14.496657Z",
  "resolved_at": "2026-10-29T14:41:15.464838Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/ded7f23e-7142-4d8c-b016-f4e392cc34ca` → **200**

```json
{
  "client": {
    "id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
    "phone": "+380735943919",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:03.301539Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:05.766587Z",
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

`GET /api/admin/v1/clients/ded7f23e-7142-4d8c-b016-f4e392cc34ca` → **200**

```json
{
  "client": {
    "id": "ded7f23e-7142-4d8c-b016-f4e392cc34ca",
    "phone": "+380735943919",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:03.301539Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:05.766587Z",
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

`POST /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks/fa750371-2772-49f0-b517-b03d8a4a0d96/resolve` → **409**

```json
{
  "command_id": "cd99b472-a3c5-4bcc-8662-5799caaea9e8",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks/fa750371-2772-49f0-b517-b03d8a4a0d96/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "19ebac74-fb82-44b5-90a9-c1bee4e1fe6f"
}
```

`GET /api/admin/v1/orders/e91282be-8b7a-42eb-ab0d-e621234a24bb/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "fa750371-2772-49f0-b517-b03d8a4a0d96",
      "order_id": "e91282be-8b7a-42eb-ab0d-e621234a24bb",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:41:14.496657Z",
      "resolved_at": "2026-10-29T14:41:15.464838Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order e91282be-8b7a-42eb-ab0d-e621234a24bb without phone or card digits; chargeback fa750371-2772-49f0-b517-b03d8a4a0d96 recorded and won.

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
  "session_id": "627668df-9866-4275-b192-71d992878452",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NzgsImlhdCI6MTc5MzI4NDg3OCwianRpIjoiYmExY2ZkZDYtMzMxNi00NjY1LWE1NTItNjU2ZGYxMTNiZTg3Iiwic2lkIjoiNjI3NjY4ZGYtOTg2Ni00Mjc1LWIxOTItNzFkOTkyODc4NDUyIn0.sB6pqpY_d1X8OaqfeIpxkuCM1rvClw18daymW5vGCQE",
  "access_expires_at": "2026-10-29T14:56:18.633535281Z",
  "refresh_token": "e0oUjsjXhHxH4WBltOBOaY-P8R9sBJj3P6TNEiBK0I8",
  "refresh_expires_at": "2026-10-30T02:41:18.632957184Z",
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
  "phone": "+48600128449",
  "device_ref": "sandbox-28568"
}
```

```json
{
  "challenge_id": "cc651238-5d81-489c-83ac-63c95f24340b",
  "expires_at": "2026-10-29T14:46:19.520753815Z",
  "resend_available_at": "2026-10-29T14:41:20.520753815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600128449` → **200**

```json
{
  "phone": "+48600128449",
  "audience": "CLIENT",
  "code": "857225",
  "sent_at": "2026-10-29T14:41:19.523415827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc651238-5d81-489c-83ac-63c95f24340b",
  "code": "857225",
  "device_ref": "sandbox-28568"
}
```

```json
{
  "session_id": "dfb4ec11-127c-4519-93b0-9f7b8e998088",
  "subject": {
    "type": "CLIENT",
    "id": "62b77af9-2889-47ae-9bc9-c38b6167f7e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MmI3N2FmOS0yODg5LTQ3YWUtOWJjOS1jMzhiNjE2N2Y3ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Nzc5LCJpYXQiOjE3OTMyODQ4NzksImp0aSI6ImJlNzEwYjM5LWVhOTEtNDE4NS1hZjM3LWM2YTBmNjk1ZWZmZiIsInNpZCI6ImRmYjRlYzExLTEyN2MtNDUxOS05M2IwLTlmN2I4ZTk5ODA4OCJ9.Nxe2HL9PnfVyMr6M1KozIyLOqbXXK7th1c4FTF-bahw",
  "access_expires_at": "2026-10-29T14:56:19.834419321Z",
  "refresh_token": "m-YySIT_he-TXeL8M2ro8PPhCPG_aPVPFgBOpK5GSOw",
  "refresh_expires_at": "2026-11-28T14:41:19.833849671Z",
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
  "command_id": "f8033470-0e9c-4aaf-8b0a-b6390a67f0fe",
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
  "correlation_id": "55e410e4-55f4-460e-9100-3b4b84fd5dc3",
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
  "command_id": "02db187c-f91e-4718-9115-08b00a95755a",
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
  "paused_at": "2026-10-29T14:41:21.01857017Z",
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
  "command_id": "bfa776d0-7748-4c95-ac65-60b917b0c0ab",
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
  "id": "bcf46d8a-6c24-4ee5-abf0-f8435c940523",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:21.617875Z",
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
  "command_id": "18435a47-a7ca-423c-a466-402837261d76",
  "quote_id": "bcf46d8a-6c24-4ee5-abf0-f8435c940523",
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
  "correlation_id": "d57e3a53-8f0f-4171-8648-925289b5f833"
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
  "paused_at": "2026-10-29T14:41:21.01857Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "fa746926-e176-4feb-adc0-d260aa8281f3",
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
  "command_id": "39773541-817a-48b1-bbe0-1b8dc7401330",
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
  "command_id": "7e30679e-f899-49c6-a69f-ae2c0f5a5c36",
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
  "id": "a4c5759c-4c04-471a-a603-408ff060fbf3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:23.392830Z",
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
  "command_id": "ba11670b-7e27-41a4-89c7-31e8a422850b",
  "quote_id": "a4c5759c-4c04-471a-a603-408ff060fbf3",
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
  "correlation_id": "525c0c20-50db-41dd-a4ba-84097a1fccc3"
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
  "command_id": "85cec611-935d-4333-b900-ce14cb2a139f",
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
      "from": "17:00",
      "to": "18:00"
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
      "from": "17:00",
      "to": "18:00"
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
  "command_id": "92e64d2a-d5c2-4c2b-8816-fdb7a75bd2f7",
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
  "id": "6b238778-90d4-4878-840d-6c48b0bee448",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:24.583182Z",
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
  "command_id": "ccb8adab-471a-417c-bb41-1ac3b5825d0d",
  "quote_id": "6b238778-90d4-4878-840d-6c48b0bee448",
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
  "correlation_id": "c0a5e561-1e28-4c2f-aaa7-b667bef86532"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "e6602318-b257-4529-bfa3-92f27de60984",
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
  "correlation_id": "a630b09b-30b6-4dc2-ad29-1a2e0756c4c2"
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
      "from": "17:00",
      "to": "18:00"
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
  "command_id": "420fd1b1-b901-4a04-979d-729d8abbf646",
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
  "phone": "+380670398876",
  "device_ref": "sandbox-23584"
}
```

```json
{
  "challenge_id": "d6529cb2-d636-4770-87f5-0cf5f49c13f7",
  "expires_at": "2026-10-29T14:46:26.083924528Z",
  "resend_available_at": "2026-10-29T14:41:27.083924528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670398876` → **200**

```json
{
  "phone": "+380670398876",
  "audience": "CLIENT",
  "code": "591389",
  "sent_at": "2026-10-29T14:41:26.086707855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6529cb2-d636-4770-87f5-0cf5f49c13f7",
  "code": "591389",
  "device_ref": "sandbox-23584"
}
```

```json
{
  "session_id": "7d67274e-46e1-42cc-88b6-aa17aec746db",
  "subject": {
    "type": "CLIENT",
    "id": "e008b27f-459d-457a-b2ae-6629b429326e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMDA4YjI3Zi00NTlkLTQ1N2EtYjJhZS02NjI5YjQyOTMyNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Nzg2LCJpYXQiOjE3OTMyODQ4ODYsImp0aSI6ImZmMjg5MjE0LTdhMjEtNDI4Zi04MjM2LWI3ZDY2YzBmNTM5YiIsInNpZCI6IjdkNjcyNzRlLTQ2ZTEtNDJjYy04OGI2LWFhMTdhZWM3NDZkYiJ9.AmeHUACA9NlKTXSBPLoebx7NVl_Pqnny6xbiwQTe12Y",
  "access_expires_at": "2026-10-29T14:56:26.401115708Z",
  "refresh_token": "H3Pf3mFdlrl-WZUH3fUqbjASTWqnke4sZwT7U7c-eAI",
  "refresh_expires_at": "2026-11-28T14:41:26.400614433Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e008b27f-459d-457a-b2ae-6629b429326e",
  "session_id": "7d67274e-46e1-42cc-88b6-aa17aec746db",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f0b3038-ba3e-429d-9969-04dba2a84f99",
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
  "id": "04c9aca3-9e89-4005-940a-3b33b221f23b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:26.978766Z",
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
  "challenge_id": "ffd4cfa6-59c3-4cfb-b68a-789befe0c107",
  "expires_at": "2026-10-29T14:46:29.280326132Z",
  "resend_available_at": "2026-10-29T14:41:30.280326132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670398876` → **200**

```json
{
  "phone": "+380670398876",
  "audience": "CLIENT",
  "code": "482223",
  "sent_at": "2026-10-29T14:41:29.283742921Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "88ee5d6e-03af-4361-84d5-3f327229e5a0",
  "challenge_id": "ffd4cfa6-59c3-4cfb-b68a-789befe0c107",
  "otp_code": "482223"
}
```

```json
{
  "client_id": "e008b27f-459d-457a-b2ae-6629b429326e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:41:29.609727603Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "c4f19847-ae88-4866-86f4-3c53338b910f",
  "quote_id": "04c9aca3-9e89-4005-940a-3b33b221f23b",
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
  "correlation_id": "ba984373-494d-4d72-926b-4cddcd08aa42"
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
  "session_id": "ab498182-2778-450b-944e-f4b7702fc1b4",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3OTAsImlhdCI6MTc5MzI4NDg5MCwianRpIjoiODU5NTAyMzctZTlkOC00Yzg5LWI4MTgtOWFhNDYxNDVkOGNkIiwic2lkIjoiYWI0OTgxODItMjc3OC00NTBiLTk0NGUtZjRiNzcwMmZjMWI0In0.694ym3D16Ai7063TtlpyagLmmha4DGyDcTeW996hlhs",
  "access_expires_at": "2026-10-29T14:56:30.506693938Z",
  "refresh_token": "C8lOtjSE4bLDrdTZpEQeehWctJ2-aA5_sNdAfIhY5AE",
  "refresh_expires_at": "2026-10-30T02:41:30.506070015Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "e008b27f-459d-457a-b2ae-6629b429326e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:41:29.609728Z",
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

`POST /api/admin/v1/client-deletions/e008b27f-459d-457a-b2ae-6629b429326e/complete` → **200**

```json
{
  "command_id": "ab63498d-dd12-4823-8d94-9a128fd2f958",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "e008b27f-459d-457a-b2ae-6629b429326e",
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
  "correlation_id": "6a9ac37f-88f1-420a-bbc3-6b36712952c5"
}
```

Done: client e008b27f-459d-457a-b2ae-6629b429326e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669567813",
  "device_ref": "sandbox-18761"
}
```

```json
{
  "challenge_id": "bdcbc928-092c-4872-a270-f9a4d657b3f2",
  "expires_at": "2026-10-29T14:46:31.708474397Z",
  "resend_available_at": "2026-10-29T14:41:32.708474397Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669567813` → **200**

```json
{
  "phone": "+380669567813",
  "audience": "CLIENT",
  "code": "289116",
  "sent_at": "2026-10-29T14:41:31.71197871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdcbc928-092c-4872-a270-f9a4d657b3f2",
  "code": "289116",
  "device_ref": "sandbox-18761"
}
```

```json
{
  "session_id": "950b15a8-1d7a-4bd5-9f4c-3fc884f833e4",
  "subject": {
    "type": "CLIENT",
    "id": "de4b71da-8440-464c-ab83-7394385587e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTRiNzFkYS04NDQwLTQ2NGMtYWI4My03Mzk0Mzg1NTg3ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzkyLCJpYXQiOjE3OTMyODQ4OTIsImp0aSI6IjdkNTcwMzQzLWFhYzAtNDUwZC1hOGE5LTFmNzQyZWE0MDNiMiIsInNpZCI6Ijk1MGIxNWE4LTFkN2EtNGJkNS05ZjRjLTNmYzg4NGY4MzNlNCJ9.SF0cT3bTLPNEqBDVJTUcC-hUpI_vHNPWm6OAzN725z4",
  "access_expires_at": "2026-10-29T14:56:32.034213682Z",
  "refresh_token": "owx0S58GriIWmlCNdKoYDGvo4XQldrRbjGouurNFNl8",
  "refresh_expires_at": "2026-11-28T14:41:32.033691789Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "de4b71da-8440-464c-ab83-7394385587e4",
  "session_id": "950b15a8-1d7a-4bd5-9f4c-3fc884f833e4",
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
  "session_id": "9b084d61-6e0b-4883-bc97-0f28f2534a0f",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3OTIsImlhdCI6MTc5MzI4NDg5MiwianRpIjoiMTQ4YWNkMTctZDdlNi00ZjYxLWIyZWEtMWE1Y2RiNzQ5NjJiIiwic2lkIjoiOWIwODRkNjEtNmUwYi00ODgzLWJjOTctMGYyOGYyNTM0YTBmIn0.4tw9Y_R9Xffy94yJeyvNqBR5wJejblJMX3IsBYHEoww",
  "access_expires_at": "2026-10-29T14:56:32.897194826Z",
  "refresh_token": "QbxeycaPbRCmLAt3UI1R9y0ZSAOBcBmCPG8kwH2mNtg",
  "refresh_expires_at": "2026-10-30T02:41:32.896646644Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9567813&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "de4b71da-8440-464c-ab83-7394385587e4",
      "phone": "+380669567813",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:41:32.031886Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/de4b71da-8440-464c-ab83-7394385587e4` → **200**

```json
{
  "client": {
    "id": "de4b71da-8440-464c-ab83-7394385587e4",
    "phone": "+380669567813",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:32.031886Z",
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

`POST /api/admin/v1/clients/de4b71da-8440-464c-ab83-7394385587e4/block` → **400**

```json
{
  "command_id": "ea6e9410-0242-4b7f-ae69-f406c1bb1d92",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/de4b71da-8440-464c-ab83-7394385587e4/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4355bf0a-6ad7-4f08-9f82-21c18ec255ce",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/de4b71da-8440-464c-ab83-7394385587e4/block` → **200**

```json
{
  "command_id": "1ec8740b-1a30-4493-8f4e-965b54633ef5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "de4b71da-8440-464c-ab83-7394385587e4",
  "phone": "+380669567813",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:41:32.031886Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:41:34.123405Z",
    "by": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
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
  "correlation_id": "be883037-c2e9-4b96-86ad-e393aa36f381"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669567813",
  "device_ref": "sandbox-3136"
}
```

```json
{
  "challenge_id": "82a9eb51-e0a9-4531-a640-f81ff51e9e36",
  "expires_at": "2026-10-29T14:46:36.737029638Z",
  "resend_available_at": "2026-10-29T14:41:37.737029638Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669567813` → **200**

```json
{
  "phone": "+380669567813",
  "audience": "CLIENT",
  "code": "752850",
  "sent_at": "2026-10-29T14:41:36.739983544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "82a9eb51-e0a9-4531-a640-f81ff51e9e36",
  "code": "752850",
  "device_ref": "sandbox-3136"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "75986959-d83f-4989-9b42-da6058fee867"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/de4b71da-8440-464c-ab83-7394385587e4` → **200**

```json
{
  "client": {
    "id": "de4b71da-8440-464c-ab83-7394385587e4",
    "phone": "+380669567813",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:41:32.031886Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:41:34.123405Z",
      "by": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
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

`POST /api/admin/v1/clients/de4b71da-8440-464c-ab83-7394385587e4/unblock` → **200**

```json
{
  "command_id": "05e43439-550b-44d8-a07e-7c6e8841313a",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "de4b71da-8440-464c-ab83-7394385587e4",
  "phone": "+380669567813",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:41:32.031886Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669567813",
  "device_ref": "sandbox-3270"
}
```

```json
{
  "challenge_id": "7874bb7f-9e94-4599-bcbd-4366a7fb4d7b",
  "expires_at": "2026-10-29T14:46:39.997069936Z",
  "resend_available_at": "2026-10-29T14:41:40.997069936Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669567813` → **200**

```json
{
  "phone": "+380669567813",
  "audience": "CLIENT",
  "code": "641095",
  "sent_at": "2026-10-29T14:41:40.00004449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7874bb7f-9e94-4599-bcbd-4366a7fb4d7b",
  "code": "641095",
  "device_ref": "sandbox-3270"
}
```

```json
{
  "session_id": "a6ab8466-2c2f-47b0-bcb9-36e8630d6f12",
  "subject": {
    "type": "CLIENT",
    "id": "de4b71da-8440-464c-ab83-7394385587e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTRiNzFkYS04NDQwLTQ2NGMtYWI4My03Mzk0Mzg1NTg3ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODAwLCJpYXQiOjE3OTMyODQ5MDAsImp0aSI6IjczNTYwY2JmLWZiZmMtNGQxOS05ZWMwLTdmNWNjNzc4YzkwNyIsInNpZCI6ImE2YWI4NDY2LTJjMmYtNDdiMC1iY2I5LTM2ZTg2MzBkNmYxMiJ9.Mh5zJGzKN8sOmu_aTjw3B4y581PdOvbQQ2NCD-M_320",
  "access_expires_at": "2026-10-29T14:56:40.314951136Z",
  "refresh_token": "rDpTYgFyVAkTMhkkvNtTHG1wVXoEpXTShTlyZ81xk_c",
  "refresh_expires_at": "2026-11-28T14:41:40.314403305Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "de4b71da-8440-464c-ab83-7394385587e4",
  "session_id": "a6ab8466-2c2f-47b0-bcb9-36e8630d6f12",
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
  "phone": "+380663217279",
  "device_ref": "sandbox-19180"
}
```

```json
{
  "challenge_id": "7cc253e5-6f2c-4b26-8c9d-4d0c8076c2f4",
  "expires_at": "2026-10-29T14:46:40.910476566Z",
  "resend_available_at": "2026-10-29T14:41:41.910476566Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663217279` → **200**

```json
{
  "phone": "+380663217279",
  "audience": "CLIENT",
  "code": "484981",
  "sent_at": "2026-10-29T14:41:40.913698359Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cc253e5-6f2c-4b26-8c9d-4d0c8076c2f4",
  "code": "484981",
  "device_ref": "sandbox-19180"
}
```

```json
{
  "session_id": "e307c312-2451-42bd-bad9-69217f3fb36e",
  "subject": {
    "type": "CLIENT",
    "id": "1e3b54d3-dfb7-4469-830f-59d11c22f0fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTNiNTRkMy1kZmI3LTQ0NjktODMwZi01OWQxMWMyMmYwZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODAxLCJpYXQiOjE3OTMyODQ5MDEsImp0aSI6IjVmMzQwNzE4LTA1ODAtNGZhNy1hMzI2LWI3ODgyOWRkNGE3YSIsInNpZCI6ImUzMDdjMzEyLTI0NTEtNDJiZC1iYWQ5LTY5MjE3ZjNmYjM2ZSJ9.Sdy7pBlT6kGY8kq9h5D44enf9ViUlumggDvOUhw3NLc",
  "access_expires_at": "2026-10-29T14:56:41.244992124Z",
  "refresh_token": "XJqTavyEZCSqZmuZgdV-VuzIxfwozF_nZT10WsJPHB8",
  "refresh_expires_at": "2026-11-28T14:41:41.244348715Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7b17d92b-b11b-4dcd-8e4d-9193960ffaa8",
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
  "id": "858314c4-bb3c-4986-b1ff-ee97bab99c22",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:41.540958Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 7fc42254-75c7-47bc-ab42-8890eb44f7c9) → **201**

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
  "session_id": "c3421767-0e73-4dc7-b7d2-c7ae82300c01",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MDIsImlhdCI6MTc5MzI4NDkwMiwianRpIjoiM2Y2YTNkNDAtNThhYy00ODhjLTg2MTAtMGQwZDk4MDgzYWZmIiwic2lkIjoiYzM0MjE3NjctMGU3My00ZGM3LWI3ZDItYzdhZTgyMzAwYzAxIn0.UEoKuuvyHLN5kYhXiVRty4Wc9-ZazpYqc6nvc6RnVF0",
  "access_expires_at": "2026-10-29T14:56:42.177860532Z",
  "refresh_token": "tuhrfwFPbMmJ1hQniAy9UG6N_0dteDlD3Mo8DAeCFZ4",
  "refresh_expires_at": "2026-10-30T02:41:42.177154664Z",
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
  "session_id": "d77e9149-7fd7-4bf4-a1ef-27317e117023",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MDIsImlhdCI6MTc5MzI4NDkwMiwianRpIjoiNzAzZTIyOTEtOTllNC00NDdhLTk4MWQtZDEzMWQxNTk0NWI3Iiwic2lkIjoiZDc3ZTkxNDktN2ZkNy00YmY0LWExZWYtMjczMTdlMTE3MDIzIn0.6uWN5XDB_n6pDOGS6eYAv-WN2hOH9zJEZQ9gvec6CZc",
  "access_expires_at": "2026-10-29T14:56:42.759901353Z",
  "refresh_token": "ckoWFfnbtmk1uMU5OGPpTkDn4E3kaBovZd-O3CHllgo",
  "refresh_expires_at": "2026-10-30T02:41:42.759250259Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fcc433d9-ca30-407c-940b-ed85f2f9499a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:41:41.849999Z",
      "actor": {
        "type": "CLIENT",
        "id": "1e3b54d3-dfb7-4469-830f-59d11c22f0fb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
        "quote_id": "858314c4-bb3c-4986-b1ff-ee97bab99c22",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7fc42254-75c7-47bc-ab42-8890eb44f7c9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:41:41.852416Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
        "attempt_id": "94a3811e-683a-44f5-a16f-111e7415d83f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7fc42254-75c7-47bc-ab42-8890eb44f7c9"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:41:41.859711Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
        "attempt_id": "94a3811e-683a-44f5-a16f-111e7415d83f"
      },
      "correlation_id": "7fc42254-75c7-47bc-ab42-8890eb44f7c9"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "94a3811e-683a-44f5-a16f-111e7415d83f",
        "generation": 1,
        "started_at": "2026-10-29T14:41:41.851345Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:41:41.859711Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:41:41.853256Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/7fc42254-75c7-47bc-ab42-8890eb44f7c9` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "fcc433d9-ca30-407c-940b-ed85f2f9499a:0",
      "order_id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
      "at": "2026-10-29T14:41:41.849999Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "fcc433d9-ca30-407c-940b-ed85f2f9499a:1",
      "order_id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
      "at": "2026-10-29T14:41:41.852416Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "fcc433d9-ca30-407c-940b-ed85f2f9499a:2",
      "order_id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
      "at": "2026-10-29T14:41:41.859711Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/03470f0f-d279-4fc9-a889-649a965a290f` → **200**

```json
{
  "found": []
}
```

Done: request 7fc42254-75c7-47bc-ab42-8890eb44f7c9 — order fcc433d9-ca30-407c-940b-ed85f2f9499a found by its id.

`GET /api/rider/v1/orders/fcc433d9-ca30-407c-940b-ed85f2f9499a` → **200**

```json
{
  "id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e3b54d3-dfb7-4469-830f-59d11c22f0fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:41:41.849424Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fcc433d9-ca30-407c-940b-ed85f2f9499a/cancel` → **200**

```json
{
  "command_id": "ad595489-8d94-45a7-9d6a-569921edfb40",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fcc433d9-ca30-407c-940b-ed85f2f9499a",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1e3b54d3-dfb7-4469-830f-59d11c22f0fb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:41:41.849424Z",
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
  "phone": "+380637427064",
  "device_ref": "sandbox-7947"
}
```

```json
{
  "challenge_id": "0c0b40d0-2511-453c-a39e-e4e1dc9952f1",
  "expires_at": "2026-10-29T14:46:44.54525057Z",
  "resend_available_at": "2026-10-29T14:41:45.54525057Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637427064` → **200**

```json
{
  "phone": "+380637427064",
  "audience": "CLIENT",
  "code": "943595",
  "sent_at": "2026-10-29T14:41:44.548439676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c0b40d0-2511-453c-a39e-e4e1dc9952f1",
  "code": "943595",
  "device_ref": "sandbox-7947"
}
```

```json
{
  "session_id": "af5501d6-ff44-4372-8494-c5f6a5ea6896",
  "subject": {
    "type": "CLIENT",
    "id": "28b3bde6-069d-4937-a89b-3128e533ec93"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGIzYmRlNi0wNjlkLTQ5MzctYTg5Yi0zMTI4ZTUzM2VjOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODA0LCJpYXQiOjE3OTMyODQ5MDQsImp0aSI6ImE0M2Y5NDhiLTNhYzMtNGQ3MC1hZWI0LTViODkxZGNhNjExOCIsInNpZCI6ImFmNTUwMWQ2LWZmNDQtNDM3Mi04NDk0LWM1ZjZhNWVhNjg5NiJ9.wcubv__2T6DCRIST2aZHK_kg23dst86qTvlJMXqLdjM",
  "access_expires_at": "2026-10-29T14:56:44.860157476Z",
  "refresh_token": "4dCvXurEqidxlnkNfKXTRA0kWQwS8k9_cnrMYUR6-lU",
  "refresh_expires_at": "2026-11-28T14:41:44.859628557Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "c78d386f-f921-4e2f-910f-093f0823cb16",
  "expires_at": "2026-10-29T14:46:47.14971158Z",
  "resend_available_at": "2026-10-29T14:41:48.14971158Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637427064` → **200**

```json
{
  "phone": "+380637427064",
  "audience": "CLIENT",
  "code": "412868",
  "sent_at": "2026-10-29T14:41:47.152106246Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "73d2e9e0-1d23-4f6c-a53c-8e39add9a3a4",
  "challenge_id": "c78d386f-f921-4e2f-910f-093f0823cb16",
  "otp_code": "412868"
}
```

```json
{
  "id": "ed25a18f-070f-41f0-9557-8689e29ca1c1",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:47.470023Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1` → **200**

```json
{
  "id": "ed25a18f-070f-41f0-9557-8689e29ca1c1",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:47.470023Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1` → **200**

```json
{
  "id": "ed25a18f-070f-41f0-9557-8689e29ca1c1",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:47.470023Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1` → **200**

```json
{
  "id": "ed25a18f-070f-41f0-9557-8689e29ca1c1",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:47.470023Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1` → **200**

```json
{
  "id": "ed25a18f-070f-41f0-9557-8689e29ca1c1",
  "state": "READY",
  "created_at": "2026-10-29T14:41:47.470023Z",
  "ready_at": "2026-10-29T14:41:50.981745Z",
  "expires_at": "2026-11-05T14:41:50.981745Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635867384",
  "device_ref": "sandbox-18268"
}
```

```json
{
  "challenge_id": "87c780f2-6c44-4bc2-8093-c56acb9b66a6",
  "expires_at": "2026-10-29T14:46:51.924852067Z",
  "resend_available_at": "2026-10-29T14:41:52.924852067Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635867384` → **200**

```json
{
  "phone": "+380635867384",
  "audience": "CLIENT",
  "code": "970685",
  "sent_at": "2026-10-29T14:41:51.92820693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87c780f2-6c44-4bc2-8093-c56acb9b66a6",
  "code": "970685",
  "device_ref": "sandbox-18268"
}
```

```json
{
  "session_id": "ad9e4c3b-d356-4663-b44a-b4b5cf8b39cc",
  "subject": {
    "type": "CLIENT",
    "id": "453fafd3-13b0-42c9-a1da-b3bde615c256"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTNmYWZkMy0xM2IwLTQyYzktYTFkYS1iM2JkZTYxNWMyNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODEyLCJpYXQiOjE3OTMyODQ5MTIsImp0aSI6Ijg2OWY1YjBkLTdhYTktNDYwNy04OWY0LWQ2ZTEzNjkxNDJiYSIsInNpZCI6ImFkOWU0YzNiLWQzNTYtNDY2My1iNDRhLWI0YjVjZjhiMzljYyJ9.A9z42keQvuEqf2VuiF567gr4-hB6UqyJiSSFAZICFd8",
  "access_expires_at": "2026-10-29T14:56:52.251055655Z",
  "refresh_token": "OCsDqE_wrCajEZrYfLen8QVP0COSQHZp5cVYjtJTH4U",
  "refresh_expires_at": "2026-11-28T14:41:52.250532961Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/ed25a18f-070f-41f0-9557-8689e29ca1c1/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d24a47a9-ab02-4221-ac4f-526a1a9b96e3"
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
  "session_id": "4dda183f-b49f-44a4-8ef6-9bd1a8ec4a98",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MTMsImlhdCI6MTc5MzI4NDkxMywianRpIjoiMGI3MjcyMGUtNGE3NS00YWNmLWI4OTctYTZiOTZkMzU1N2JiIiwic2lkIjoiNGRkYTE4M2YtYjQ5Zi00NGE0LThlZjYtOWJkMWE4ZWM0YTk4In0.l7XDW0V1gxng4tHAgkOXGjYFEW7Wfs86RaNo3d0PYE4",
  "access_expires_at": "2026-10-29T14:56:53.117416941Z",
  "refresh_token": "r04f_gExrvQL_VwCvpJeLXIVPPejCtAsqd31LcEsoS0",
  "refresh_expires_at": "2026-10-30T02:41:53.116896271Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "28b3bde6-069d-4937-a89b-3128e533ec93",
  "session_id": "af5501d6-ff44-4372-8494-c5f6a5ea6896",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/28b3bde6-069d-4937-a89b-3128e533ec93/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "ed25a18f-070f-41f0-9557-8689e29ca1c1",
      "state": "READY",
      "created_at": "2026-10-29T14:41:47.470023Z",
      "ready_at": "2026-10-29T14:41:50.981745Z",
      "expires_at": "2026-11-05T14:41:50.981745Z",
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
  "device_ref": "sandbox-31616"
}
```

```json
{
  "challenge_id": "0a40d117-e054-49e0-b648-358e855e8833",
  "expires_at": "2026-10-29T14:46:53.97731527Z",
  "resend_available_at": "2026-10-29T14:41:54.97731527Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "104211",
  "sent_at": "2026-10-29T14:41:53.981197937Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a40d117-e054-49e0-b648-358e855e8833",
  "code": "104211",
  "device_ref": "sandbox-31616"
}
```

```json
{
  "session_id": "f6ba16a2-9553-41ab-a65e-3e7afe95cd26",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgxNCwiaWF0IjoxNzkzMjg0OTE0LCJqdGkiOiIxODc4MzkyMS0yODU4LTQyZGQtODk4YS1iYWM2MmFiYmM3ZDQiLCJzaWQiOiJmNmJhMTZhMi05NTUzLTQxYWItYTY1ZS0zZTdhZmU5NWNkMjYifQ.E68iFBW-KszbPMzqTkyTOCegu9IN0jE958DdayZY2sQ",
  "access_expires_at": "2026-10-29T14:56:54.294188484Z",
  "refresh_token": "Q3GPoyjP-cDKV_Nva23eXpo9v4sLIpuvcBvyeVJK01E",
  "refresh_expires_at": "2026-11-28T14:41:54.293652816Z",
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
  "device_ref": "sandbox-9139"
}
```

```json
{
  "challenge_id": "fb95eb11-1d2b-44c2-b823-0c8257a1c7bc",
  "expires_at": "2026-10-29T14:46:54.87348418Z",
  "resend_available_at": "2026-10-29T14:41:55.87348418Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "555323",
  "sent_at": "2026-10-29T14:41:54.87604888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb95eb11-1d2b-44c2-b823-0c8257a1c7bc",
  "code": "555323",
  "device_ref": "sandbox-9139"
}
```

```json
{
  "session_id": "4f020f75-de73-41e6-a218-0210f7c00ba3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgxNSwiaWF0IjoxNzkzMjg0OTE1LCJqdGkiOiI0ZGU3NGU1Yy0wOTQ1LTRjNGItODRjOC01NjUwYTgwOWZmZGMiLCJzaWQiOiI0ZjAyMGY3NS1kZTczLTQxZTYtYTIxOC0wMjEwZjdjMDBiYTMifQ.XiAX14aeya9m2HEIFJZB_ZbNeDvy4qN8JuV6C2DuFho",
  "access_expires_at": "2026-10-29T14:56:55.183779744Z",
  "refresh_token": "ImZRDN3ZUDEaPxZKSZ7AqwaqrearMZQUmK4z3j8xdMM",
  "refresh_expires_at": "2026-11-28T14:41:55.183198712Z",
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
  "command_id": "0178dd6a-adb6-4b0f-97e4-8a179f59cf4d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:55Z",
    "sequence": 1793284915752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b920c3d-91dd-483a-8e73-b683f3f123fb",
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
  "last_heartbeat_at": "2026-10-29T14:41:55.770924Z",
  "last_location_at": "2026-10-29T14:41:55.770924Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4529"
}
```

```json
{
  "challenge_id": "35b57779-4f40-4c98-ab6c-67de2da65f26",
  "expires_at": "2026-10-29T14:46:56.064432523Z",
  "resend_available_at": "2026-10-29T14:41:57.064432523Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "335459",
  "sent_at": "2026-10-29T14:41:56.067145071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35b57779-4f40-4c98-ab6c-67de2da65f26",
  "code": "335459",
  "device_ref": "sandbox-4529"
}
```

```json
{
  "session_id": "aed8d5af-6413-496e-826e-75a4040b2816",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgxNiwiaWF0IjoxNzkzMjg0OTE2LCJqdGkiOiIzZmFjODhmZS0xZGU4LTRlMDEtOTZhMy1mYjdiZWRkNzNlYzQiLCJzaWQiOiJhZWQ4ZDVhZi02NDEzLTQ5NmUtODI2ZS03NWE0MDQwYjI4MTYifQ.1Wllv6Yni1-Y0HMUrnxUoZOFVhQqkJEAxQ9IOpJmx44",
  "access_expires_at": "2026-10-29T14:56:56.383401223Z",
  "refresh_token": "jPY5Ytp4W0YehcMyHOg8EYwixFZdynfFJ-0XByqpYl8",
  "refresh_expires_at": "2026-11-28T14:41:56.382915487Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28d51e1f-f2de-4405-976f-58ae2540b783",
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
  "last_heartbeat_at": "2026-10-29T14:40:24.517109Z",
  "last_location_at": "2026-10-29T14:40:24.517109Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/28d51e1f-f2de-4405-976f-58ae2540b783/handover` → **200**

```json
{
  "command_id": "bd707e3b-597d-4c48-bbbd-b622097ae851",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28d51e1f-f2de-4405-976f-58ae2540b783",
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
  "last_heartbeat_at": "2026-10-29T14:40:24.517109Z",
  "last_location_at": "2026-10-29T14:40:24.517109Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/28d51e1f-f2de-4405-976f-58ae2540b783/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:57Z",
    "sequence": 1793284917256
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "28d51e1f-f2de-4405-976f-58ae2540b783",
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
  "last_heartbeat_at": "2026-10-29T14:41:57.275679Z",
  "last_location_at": "2026-10-29T14:41:57.275679Z",
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
  "session_id": "752caca5-e260-4284-a4b8-7f98dfa4adf8",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MTcsImlhdCI6MTc5MzI4NDkxNywianRpIjoiMzNlMzQ2ZjQtYzlkMC00NDBiLWE1NGItMWU5ODRkZjc1YmNhIiwic2lkIjoiNzUyY2FjYTUtZTI2MC00Mjg0LWE0YjgtN2Y5OGRmYTRhZGY4In0.Bv05vV_JnKdi6W7O76k6_rt6lAVZsqGwhlra-PwJfQE",
  "access_expires_at": "2026-10-29T14:56:57.851154235Z",
  "refresh_token": "d1L8p6LVBpbgDF_-EfhLjCHEAIdirbbSqJPF6GAoZEU",
  "refresh_expires_at": "2026-10-30T02:41:57.850619779Z",
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
  "session_id": "3c8f9d49-5f60-40d6-a77a-fdd40de81604",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MTgsImlhdCI6MTc5MzI4NDkxOCwianRpIjoiMGM5MjkyNzMtMGVmMy00OGZkLTgwNjctZmQ2NWU2ZDNkMGE0Iiwic2lkIjoiM2M4ZjlkNDktNWY2MC00MGQ2LWE3N2EtZmRkNDBkZTgxNjA0In0.kb9A3ccGDLc2m22D82eBh3MySqauPgKp9yJ7B0wB628",
  "access_expires_at": "2026-10-29T14:56:58.432985472Z",
  "refresh_token": "BoFwRAJJh7fvV05Re9s3yqBY5v9MhtWh9QUkU31b0RU",
  "refresh_expires_at": "2026-10-30T02:41:58.432439244Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680614065",
  "device_ref": "sandbox-17964"
}
```

```json
{
  "challenge_id": "7215c63f-d41b-4a91-9cf4-12ef5d61fb00",
  "expires_at": "2026-10-29T14:46:58.717115818Z",
  "resend_available_at": "2026-10-29T14:41:59.717115818Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680614065` → **200**

```json
{
  "phone": "+380680614065",
  "audience": "CLIENT",
  "code": "786463",
  "sent_at": "2026-10-29T14:41:58.720378629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7215c63f-d41b-4a91-9cf4-12ef5d61fb00",
  "code": "786463",
  "device_ref": "sandbox-17964"
}
```

```json
{
  "session_id": "633f5208-d847-4a06-bc56-f0c0745dbfaf",
  "subject": {
    "type": "CLIENT",
    "id": "13870d6e-273e-4199-8c39-592f13032dc4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzg3MGQ2ZS0yNzNlLTQxOTktOGMzOS01OTJmMTMwMzJkYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODE5LCJpYXQiOjE3OTMyODQ5MTksImp0aSI6IjBlMzFmOWRkLTUyYzktNGU5Yy1iOTU3LTI5NWEzNWZjMjU1OSIsInNpZCI6IjYzM2Y1MjA4LWQ4NDctNGEwNi1iYzU2LWYwYzA3NDVkYmZhZiJ9.R0K1Y87kkCFFgzzY45Cskjd4FxYa85aHFWbb4fekpy4",
  "access_expires_at": "2026-10-29T14:56:59.034924629Z",
  "refresh_token": "bKGeoDKeO7a2zCKLcwZPv_7qDG4XPoPwOX7LZ6wYWRE",
  "refresh_expires_at": "2026-11-28T14:41:59.034372196Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "291bdc45-9a93-4cf0-9948-8ae994530fce",
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
  "id": "df5947e0-5019-4b03-ab20-157ecb9bb9c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:59.345391Z",
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
  "command_id": "6e243064-9599-4981-b42d-22481eb7c127",
  "quote_id": "df5947e0-5019-4b03-ab20-157ecb9bb9c7",
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
  "id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13870d6e-273e-4199-8c39-592f13032dc4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:41:59.682805Z",
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
    "id": "0ccd50fe-3e76-4a08-92a6-c09725b1a51f",
    "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
    "expires_at": "2026-10-29T14:42:14.686393Z",
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

`POST /api/driver/v1/offers/0ccd50fe-3e76-4a08-92a6-c09725b1a51f/reject` → **204**

```json
{
  "command_id": "74701356-9437-4f39-a14b-9d9a86998ac2"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5cbcebc4-8d9f-48c7-b225-1cee7143b197",
    "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
    "expires_at": "2026-10-29T14:42:15.326831Z",
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

`POST /api/driver/v1/offers/5cbcebc4-8d9f-48c7-b225-1cee7143b197/accept` → **200**

```json
{
  "command_id": "0406cb16-17d7-4440-b66d-d6bfe507c1aa"
}
```

```json
{
  "id": "ad29b201-1226-486f-9ad9-c1640d9f88fb",
  "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "06f5a98c-1aed-41b0-b91f-3ad1e8ae6547",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/13b0890f-0ff6-488d-8e69-dda08fe7604e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:41:59.683292Z",
      "actor": {
        "type": "CLIENT",
        "id": "13870d6e-273e-4199-8c39-592f13032dc4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
        "quote_id": "df5947e0-5019-4b03-ab20-157ecb9bb9c7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a72238ab-cf36-4c9c-969d-1965272c59c0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:41:59.685565Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
        "attempt_id": "7bea5f2b-fd07-4156-bbd8-4f18aeef4232",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a72238ab-cf36-4c9c-969d-1965272c59c0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:41:59.689414Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0ccd50fe-3e76-4a08-92a6-c09725b1a51f",
        "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "a72238ab-cf36-4c9c-969d-1965272c59c0"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:42:00.325885Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0ccd50fe-3e76-4a08-92a6-c09725b1a51f",
        "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e"
      },
      "correlation_id": "b3413637-a1d2-4d3b-90c7-93d0df18d766"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 13b0890f-0ff6-488d-8e69-dda08fe7604e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/13b0890f-0ff6-488d-8e69-dda08fe7604e` → **200**

```json
{
  "id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "13870d6e-273e-4199-8c39-592f13032dc4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ad29b201-1226-486f-9ad9-c1640d9f88fb",
    "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "06f5a98c-1aed-41b0-b91f-3ad1e8ae6547",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:41:59.682805Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/13b0890f-0ff6-488d-8e69-dda08fe7604e/cancel` → **200**

```json
{
  "command_id": "13e6b7e6-7a7e-4bd0-bbaa-1e167afac1ca",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "13870d6e-273e-4199-8c39-592f13032dc4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ad29b201-1226-486f-9ad9-c1640d9f88fb",
    "order_id": "13b0890f-0ff6-488d-8e69-dda08fe7604e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "06f5a98c-1aed-41b0-b91f-3ad1e8ae6547",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:41:59.682805Z",
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
  "session_id": "6b920c3d-91dd-483a-8e73-b683f3f123fb",
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
  "last_heartbeat_at": "2026-10-29T14:41:55.770924Z",
  "last_location_at": "2026-10-29T14:41:55.770924Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b920c3d-91dd-483a-8e73-b683f3f123fb/close` → **200**

```json
{
  "command_id": "b81830dd-2f7e-49ce-8aa7-53ca339775a0",
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
  "session_id": "28d51e1f-f2de-4405-976f-58ae2540b783",
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
  "last_heartbeat_at": "2026-10-29T14:41:57.275679Z",
  "last_location_at": "2026-10-29T14:41:57.275679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28d51e1f-f2de-4405-976f-58ae2540b783/close` → **200**

```json
{
  "command_id": "7cec2369-a0d5-48cd-82df-dd0224e4be9a",
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
  "session_id": "ea0bfc99-1ab4-4d7f-a049-2da1afbe95e2",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MjMsImlhdCI6MTc5MzI4NDkyMywianRpIjoiM2QwNjRkZDEtNjUxYy00MzNhLTlhY2ItMjdiODg5MjFhNjQwIiwic2lkIjoiZWEwYmZjOTktMWFiNC00ZDdmLWEwNDktMmRhMWFmYmU5NWUyIn0.ULIs3tW2tvFuiqjpIselev5U0onFiz5lyC74sV1fSHo",
  "access_expires_at": "2026-10-29T14:57:03.434871779Z",
  "refresh_token": "bLASQpMTv04bCmAwGUOUHXWj_OSbfPeMeKwZzF9otdM",
  "refresh_expires_at": "2026-10-30T02:42:03.434220064Z",
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
  "command_id": "e1ebe98d-f6f8-4799-b9eb-ed637fb4fc75",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:42:04.05355Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "42731e5a-40b1-4565-a810-4943236fde5c",
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
  "correlation_id": "9ba73bba-d658-463c-8bb5-bb5b3ffd0bf9"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "4e9182c7-f8c2-452c-82bc-caa8d8b78ebe",
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
  "correlation_id": "0ceabe58-5374-4d08-ad8a-d223836235f2"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634431204",
  "device_ref": "sandbox-916"
}
```

```json
{
  "challenge_id": "c9f1bd52-cdeb-4ac2-87cc-a8557c8f0e41",
  "expires_at": "2026-10-29T14:47:04.950933953Z",
  "resend_available_at": "2026-10-29T14:42:05.950933953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634431204` → **200**

```json
{
  "phone": "+380634431204",
  "audience": "CLIENT",
  "code": "210332",
  "sent_at": "2026-10-29T14:42:04.953868926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9f1bd52-cdeb-4ac2-87cc-a8557c8f0e41",
  "code": "210332",
  "device_ref": "sandbox-916"
}
```

```json
{
  "session_id": "8d0acfde-43f3-4335-bc79-558472b2641f",
  "subject": {
    "type": "CLIENT",
    "id": "e7ffce12-4f8a-4670-8e30-f2bcf66f47e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlN2ZmY2UxMi00ZjhhLTQ2NzAtOGUzMC1mMmJjZjY2ZjQ3ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODI1LCJpYXQiOjE3OTMyODQ5MjUsImp0aSI6Ijg3ZDRiZjlkLTVmYWEtNDJlZi05ZGM4LTU0YTc2MmI4OTJlOCIsInNpZCI6IjhkMGFjZmRlLTQzZjMtNDMzNS1iYzc5LTU1ODQ3MmIyNjQxZiJ9.a5h4LDj_FHlsdBCNmEIQlKRas0q-h7D0RxgvrrG4md8",
  "access_expires_at": "2026-10-29T14:57:05.259233432Z",
  "refresh_token": "7sufdmG5-rY_exTrdRhnkWzF4v-CLVOeFvfJs8mg5-o",
  "refresh_expires_at": "2026-11-28T14:42:05.258716258Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a157e2a9-21f2-481e-97ba-c62d1697beb5",
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
  "id": "b88008cd-55d6-4280-80ee-300be83ee898",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:05.550981Z",
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
  "command_id": "7bdd732c-c5d8-46f0-b79c-37e472fb972d",
  "quote_id": "b88008cd-55d6-4280-80ee-300be83ee898",
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
  "correlation_id": "20b5d09f-0397-41cb-b0bf-eda9974fb2e3"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2ea8f8c2-0de5-433d-b4f6-3f3246800f48",
  "quote_id": "b88008cd-55d6-4280-80ee-300be83ee898",
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
  "id": "0a60f19a-ca44-4960-a2da-73c73ea007f0",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7ffce12-4f8a-4670-8e30-f2bcf66f47e4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:06.149654Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0a60f19a-ca44-4960-a2da-73c73ea007f0/cancel` → **200**

```json
{
  "command_id": "4ec1b827-0e5a-48a7-ab09-187d46327b98",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0a60f19a-ca44-4960-a2da-73c73ea007f0",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e7ffce12-4f8a-4670-8e30-f2bcf66f47e4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:06.149654Z",
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
  "command_id": "4caeb7a1-23c9-46d1-8bba-a96d240b8f54",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:42:06.81755Z"
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
      "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:42:06.81755Z"
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
  "device_ref": "sandbox-14054"
}
```

```json
{
  "challenge_id": "382529ba-9a55-4bbf-bc68-87657af5eab9",
  "expires_at": "2026-10-29T14:47:07.711965217Z",
  "resend_available_at": "2026-10-29T14:42:08.711965217Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "327067",
  "sent_at": "2026-10-29T14:42:07.714672774Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "382529ba-9a55-4bbf-bc68-87657af5eab9",
  "code": "327067",
  "device_ref": "sandbox-14054"
}
```

```json
{
  "session_id": "ee67fb6d-1db5-4a69-a39c-879ddb0f9a05",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgyOCwiaWF0IjoxNzkzMjg0OTI4LCJqdGkiOiI5OTU3NGE2Mi02NWYzLTRjZjgtOTI0ZC1hNGZiN2NlNmU2ZDIiLCJzaWQiOiJlZTY3ZmI2ZC0xZGI1LTRhNjktYTM5Yy04NzlkZGIwZjlhMDUifQ.KkboucQdgAFJmYLNZO0ppCAUig7CD-CXrXouykuymXg",
  "access_expires_at": "2026-10-29T14:57:08.031610886Z",
  "refresh_token": "ECumf4XOzJ54hZ_RQ-tVITaP6xzRDOa2Dw7DCO7Uy8g",
  "refresh_expires_at": "2026-11-28T14:42:08.031024737Z",
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
  "command_id": "e3818b94-9cf3-4ff9-b85d-3ae1ce4e540b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:08Z",
    "sequence": 1793284928585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:08.604676Z",
  "last_location_at": "2026-10-29T14:42:08.604676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670218760",
  "device_ref": "sandbox-5699"
}
```

```json
{
  "challenge_id": "c7e45915-b2ec-41ea-9f4c-ac5721613e9a",
  "expires_at": "2026-10-29T14:47:08.904588656Z",
  "resend_available_at": "2026-10-29T14:42:09.904588656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670218760` → **200**

```json
{
  "phone": "+380670218760",
  "audience": "CLIENT",
  "code": "938781",
  "sent_at": "2026-10-29T14:42:08.907277276Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7e45915-b2ec-41ea-9f4c-ac5721613e9a",
  "code": "938781",
  "device_ref": "sandbox-5699"
}
```

```json
{
  "session_id": "83df1a7a-3c42-440e-a5e1-092d906e18bd",
  "subject": {
    "type": "CLIENT",
    "id": "3d82a91e-1526-40e1-85b3-dc805c39d1b3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDgyYTkxZS0xNTI2LTQwZTEtODViMy1kYzgwNWMzOWQxYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODI5LCJpYXQiOjE3OTMyODQ5MjksImp0aSI6ImU0OTU5ZTVjLWJhMmUtNDA5My05MTA4LTEwMTcyZTUyNTBhMSIsInNpZCI6IjgzZGYxYTdhLTNjNDItNDQwZS1hNWUxLTA5MmQ5MDZlMThiZCJ9.cIUmz3oMm93bR8ztnHsPScbFNsiZrZ6q0AESCWgENzY",
  "access_expires_at": "2026-10-29T14:57:09.218974781Z",
  "refresh_token": "cv6gE8JmIbUK7hsckYZDX-jQtvObM8wIhw2ELOEcuT0",
  "refresh_expires_at": "2026-11-28T14:42:09.218455383Z",
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
  "command_id": "59770e51-0178-41d0-82cc-54f07abcea61",
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
  "id": "98b1052c-ac39-4c21-8ad2-c36300332939",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:09.804045Z",
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
  "command_id": "6f6917b5-7a7e-4632-b34d-7dc5dad13e8d",
  "platform": "ANDROID",
  "token": "sandbox-driver-b5300884-0a72-4227-b106-577ff086234d"
}
```

```json
{
  "id": "0d19b39f-e4b7-465e-9293-cd9764e08361",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:42:10.11695Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ba23c9ed-be6d-4011-956d-e04b80ca4899",
  "platform": "ANDROID",
  "token": "sandbox-rider-9354b170-2fa0-4726-9b52-6d357facdcd2"
}
```

```json
{
  "id": "f6f670cf-d5fb-42a4-aa0f-aebfef438e92",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:42:10.40756Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fa7f2f94-8958-4939-9bcb-d27ecedaacd8",
  "quote_id": "98b1052c-ac39-4c21-8ad2-c36300332939",
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
  "id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d82a91e-1526-40e1-85b3-dc805c39d1b3",
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
  "created_at": "2026-10-29T14:42:10.706551Z",
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
    "id": "bb8ad30b-405f-4f9b-a1ab-5ca113fbe402",
    "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
    "expires_at": "2026-10-29T14:42:25.709673Z",
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

`POST /api/driver/v1/offers/bb8ad30b-405f-4f9b-a1ab-5ca113fbe402/accept` → **200**

```json
{
  "command_id": "e13e2147-dfb9-4dbb-a604-6cfcb5bb8f48"
}
```

```json
{
  "id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:42:10.681Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:42:11.403716927Z",
    "token_suffix": "86234d",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
      "order_version": "2",
      "event_id": "fc5c7099-ca31-4a41-b2fc-058190fd12e0"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670218760&after=2026-10-29T14:42:10.681Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380670218760&after=2026-10-29T14:42:10.681Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:42:12.408056169Z",
    "token_suffix": "acdcd2",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
      "order_version": "3",
      "event_id": "acd4f9f9-d52d-4928-b243-50415c4f8b72"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/c74e582e-eda0-4e6d-8045-b9a01aa8d0fa/messages` → **201**

```json
{
  "command_id": "b95eb48c-b162-4677-9114-eeca8b00838c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "0883e933-beaf-4b8a-a860-574abda25901",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:42:12.703020998Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "assignment_id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
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

`POST /api/driver/v1/trips/dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1/messages` → **201**

```json
{
  "command_id": "d2e40a0b-daa4-46f9-bd96-0d9fa5763d8a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "cae358d2-1c28-467e-bf35-104a382f395b",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:42:13.28064088Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/c74e582e-eda0-4e6d-8045-b9a01aa8d0fa/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670218760"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:14Z",
    "sequence": 1793284934119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:14.138675Z",
  "last_location_at": "2026-10-29T14:42:14.138675Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "assignment_id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
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

`POST /api/driver/v1/trips/dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1/arrive` → **200**

```json
{
  "command_id": "22a790c0-ff3a-49e4-8c30-4eabf862987b",
  "expected_version": 0
}
```

```json
{
  "id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "assignment_id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
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
  "arrived_at": "2026-10-29T14:42:14.707409Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1/start` → **200**

```json
{
  "command_id": "5b835d2f-7031-4411-8526-fbac73ee7b7f",
  "expected_version": 1
}
```

```json
{
  "id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "assignment_id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
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
  "arrived_at": "2026-10-29T14:42:14.707409Z",
  "started_at": "2026-10-29T14:42:15.006655Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:15Z",
    "sequence": 1793284935293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:15.31233Z",
  "last_location_at": "2026-10-29T14:42:15.31233Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1/complete` → **200**

```json
{
  "command_id": "021c431d-d02c-4a1d-b99f-a72a6b0ed7d9",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:42:15Z",
  "cash_received": true
}
```

```json
{
  "id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "assignment_id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
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
  "arrived_at": "2026-10-29T14:42:14.707409Z",
  "started_at": "2026-10-29T14:42:15.006655Z",
  "completed_at": "2026-10-29T14:42:15.602704Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/c74e582e-eda0-4e6d-8045-b9a01aa8d0fa` → **200**

```json
{
  "id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3d82a91e-1526-40e1-85b3-dc805c39d1b3",
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
    "id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25",
    "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:42:10.706551Z",
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
    "id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:42:10.706551Z",
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
    "id": "dd9dbcd8-0e39-4313-b5d9-a7b0cde404c1",
    "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:42:11.313091Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d679c75b-32a2-4474-b82b-4a86ad21c599",
    "order_id": "503f2dd8-5236-49ce-aaa5-6a58a6d38d01",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:40:58.262241Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "22c33be8-664f-4c2e-84ea-ac2aca20a2ea",
    "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:40:15.007981Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "24d59af8-6ed5-4fc7-bd41-e77a443bd7f6",
    "order_id": "aba73243-d581-49c4-984b-9a93af79ebde",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:39:55.199951Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "30cc2e98-ff7c-4cad-9a0b-f2d4d5538499",
    "order_id": "cf3dbe55-e653-4b94-b0ef-2dc522531589",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:39:45.259808Z",
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

`GET /api/rider/v1/orders/c74e582e-eda0-4e6d-8045-b9a01aa8d0fa/tip` → **200**

```json
{
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
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
  "available_until": "2026-10-30T14:42:15.602704Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c74e582e-eda0-4e6d-8045-b9a01aa8d0fa/tip` → **201**

```json
{
  "command_id": "80055628-9891-4f99-b626-519e4fb49798",
  "amount_minor": 1100
}
```

```json
{
  "id": "04a1a9f2-00ae-46f7-a520-38b97e506450",
  "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:42:20.681652Z"
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
  "session_id": "5864c637-ee03-4c18-8c93-a254f8af43f1",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDEsImlhdCI6MTc5MzI4NDk0MSwianRpIjoiYjliZTJhMjUtZDhiNC00MGU3LWJjZjUtNzlmOWZjNmE5MzE4Iiwic2lkIjoiNTg2NGM2MzctZWUwMy00YzE4LThjOTMtYTI1NGY4YWY0M2YxIn0.WPwC2BPlNBsQdrAD8oku_l4LMaS1nvYrGBy-0kZ0epg",
  "access_expires_at": "2026-10-29T14:57:21.262739833Z",
  "refresh_token": "pJoLT2BL10Ink2zytvkFytnXLb1fjjHvfknTWrCIPxE",
  "refresh_expires_at": "2026-10-30T02:42:21.262200588Z",
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
  "generated_at": "2026-10-29T14:42:21.549141489Z"
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
  "generated_at": "2026-10-29T14:42:21.845625939Z"
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
  "session_id": "aed80bff-4601-4391-8fb2-ce6172dad07a",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDIsImlhdCI6MTc5MzI4NDk0MiwianRpIjoiZWRkNzY4MzgtNWZmNy00M2RkLTljMGQtZGEwNjMyNDFkNzU2Iiwic2lkIjoiYWVkODBiZmYtNDYwMS00MzkxLThmYjItY2U2MTcyZGFkMDdhIn0.wzxOFT9aiusC4OpzrPj56zN9l664ZHlYQV_W1NvRwmM",
  "access_expires_at": "2026-10-29T14:57:22.450700405Z",
  "refresh_token": "8UhDlfxbxtGD4lb7T0liivz4Ler7XIomgkm-EcxCzaU",
  "refresh_expires_at": "2026-10-30T02:42:22.450114834Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c74e582e-eda0-4e6d-8045-b9a01aa8d0fa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:10.707009Z",
      "actor": {
        "type": "CLIENT",
        "id": "3d82a91e-1526-40e1-85b3-dc805c39d1b3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
        "quote_id": "98b1052c-ac39-4c21-8ad2-c36300332939",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0a6c21e5-ea14-4aad-8359-98233cbe90d4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:10.708922Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
        "attempt_id": "c51cc2c7-e4e9-4bad-b1e3-976391504a02",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0a6c21e5-ea14-4aad-8359-98233cbe90d4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:10.711742Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb8ad30b-405f-4f9b-a1ab-5ca113fbe402",
        "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "0a6c21e5-ea14-4aad-8359-98233cbe90d4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:42:11.314664Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bb8ad30b-405f-4f9b-a1ab-5ca113fbe402",
        "order_id": "c74e582e-eda0-4e6d-8045-b9a01aa8d0fa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "93d04ef2-4cae-4df1-ab55-66ce3f944d25"
      },
      "correlation_id": "a52be88d-48dc-42ea-b145-b4b72ab5796f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:42:23.051574846Z",
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
      "last_location_at": "2026-10-29T14:42:15.31233Z",
      "order_id": null
    }
  ]
}
```

Done: order c74e582e-eda0-4e6d-8045-b9a01aa8d0fa.

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
  "session_id": "35af5d7e-9850-48f8-87bb-50f26359d6ec",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDMsImlhdCI6MTc5MzI4NDk0MywianRpIjoiZGU2ZmZhM2ItNDM3OS00YWYyLTlhMGMtZTRlYjFhNTQ0ZTgyIiwic2lkIjoiMzVhZjVkN2UtOTg1MC00OGY4LTg3YmItNTBmMjYzNTlkNmVjIn0.dkwmcfZpeSKg-TbFe8h1WApSvwFB7WIUfQWlUnUuYRE",
  "access_expires_at": "2026-10-29T14:57:23.654313666Z",
  "refresh_token": "xoVmjJwMiTOm_sz4mXqXFk5RU-D6N1bIRE9tbp2SbXg",
  "refresh_expires_at": "2026-10-30T02:42:23.653654731Z",
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
  "command_id": "3709d6b2-82c8-4136-b025-eb3d9e578665",
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
  "timestamp": "2026-10-29T14:42:24.000+0000",
  "channel": {
    "id": "1730052000.38528251",
    "linkedid": "1730052000.38528251",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677196791"
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
  "timestamp": "2026-10-29T14:42:24.000+0000",
  "channel": {
    "id": "1730052000.38528251",
    "linkedid": "1730052000.38528251",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677196791"
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
  "session_id": "3ee83864-3866-4f68-87cc-ab64af66f2fb",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDQsImlhdCI6MTc5MzI4NDk0NCwianRpIjoiYzM3ZTY3MTgtZGM4Zi00NTIwLWJkZDYtMzY3Nzk4MmIwNjYwIiwic2lkIjoiM2VlODM4NjQtMzg2Ni00ZjY4LTg3Y2MtYWI2NGFmNjZmMmZiIn0.kOPfX00nezjrostxurri6Dd25VINanpJPRJADotaF8s",
  "access_expires_at": "2026-10-29T14:57:24.858690081Z",
  "refresh_token": "QSQNe4Hz388HSUhxg-BUktskh-SmoLgI_NQFI4qiFys",
  "refresh_expires_at": "2026-10-30T02:42:24.858057302Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a0bd702e-5a07-4919-abf3-fffa05296e85",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677196791",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:42:24Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a0bd702e-5a07-4919-abf3-fffa05296e85/answer` → **200**

```json
{
  "command_id": "df65e41a-d70b-4d3c-9e32-267a506bc92e"
}
```

```json
{
  "id": "a0bd702e-5a07-4919-abf3-fffa05296e85",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677196791",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "order_ids": [],
  "started_at": "2026-10-29T14:42:24Z",
  "answered_at": "2026-10-29T14:42:25.455874Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.38528251",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cee8181f-66d6-4b24-ade2-82a79c97182d",
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
  "id": "b683e729-f15b-4186-bbec-5169991ec7f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:25.783774Z",
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
  "command_id": "9cd75e89-dce3-4621-ab5e-d871b468588a",
  "quote_id": "b683e729-f15b-4186-bbec-5169991ec7f9",
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
    "phone": "+380677196791"
  },
  "call_id": "a0bd702e-5a07-4919-abf3-fffa05296e85"
}
```

```json
{
  "id": "7d75c3c6-24c7-4b37-ad7f-98aa8d082a13",
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
  "created_at": "2026-10-29T14:42:26.099624Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677196791"
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
    "id": "1730052000.38528251",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a0bd702e-5a07-4919-abf3-fffa05296e85",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677196791",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [
        "7d75c3c6-24c7-4b37-ad7f-98aa8d082a13"
      ],
      "started_at": "2026-10-29T14:42:24Z",
      "answered_at": "2026-10-29T14:42:25.455874Z",
      "ended_at": "2026-10-29T14:42:26.421488Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "94ac3f35-b32a-431e-879b-f377d97a6bf1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677837322",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:03.551123Z",
      "answered_at": "2026-10-29T14:40:03.895214Z",
      "ended_at": "2026-10-29T14:40:04.235609Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:10.967375Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/7d75c3c6-24c7-4b37-ad7f-98aa8d082a13` → **200**

```json
{
  "id": "7d75c3c6-24c7-4b37-ad7f-98aa8d082a13",
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
  "created_at": "2026-10-29T14:42:26.099624Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677196791"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/7d75c3c6-24c7-4b37-ad7f-98aa8d082a13` → **200**

```json
{
  "id": "7d75c3c6-24c7-4b37-ad7f-98aa8d082a13",
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
  "created_at": "2026-10-29T14:42:26.099624Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677196791"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7d75c3c6-24c7-4b37-ad7f-98aa8d082a13/cancel` → **200**

```json
{
  "command_id": "04bb2a83-b09e-4b9e-8f28-9d4cef366a1a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7d75c3c6-24c7-4b37-ad7f-98aa8d082a13",
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
  "created_at": "2026-10-29T14:42:26.099624Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677196791"
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

Done: call a0bd702e-5a07-4919-abf3-fffa05296e85 with order 7d75c3c6-24c7-4b37-ad7f-98aa8d082a13.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2642"
}
```

```json
{
  "challenge_id": "2281b2ab-47c5-4821-8fcd-134eb0eeec31",
  "expires_at": "2026-10-29T14:47:27.701171174Z",
  "resend_available_at": "2026-10-29T14:42:28.701171174Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "564008",
  "sent_at": "2026-10-29T14:42:27.703914175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2281b2ab-47c5-4821-8fcd-134eb0eeec31",
  "code": "564008",
  "device_ref": "sandbox-2642"
}
```

```json
{
  "session_id": "193166c0-737a-45c2-b8b9-f9a3c63c4315",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg0OCwiaWF0IjoxNzkzMjg0OTQ4LCJqdGkiOiJhZTdkZjQyZC0wN2IyLTQ4ZDQtOTdhYy01OTAxNDBhNTFlN2QiLCJzaWQiOiIxOTMxNjZjMC03MzdhLTQ1YzItYjhiOS1mOWEzYzYzYzQzMTUifQ.1SqVwogExp5Y2J6OVge7UyQ1BS5ePVejh57x_G736_0",
  "access_expires_at": "2026-10-29T14:57:28.020675919Z",
  "refresh_token": "_Nu6j6-iJsqnLAkVila1mp3rArqEKcS-cUgR8quNXtg",
  "refresh_expires_at": "2026-11-28T14:42:28.020098115Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:15.31233Z",
  "last_location_at": "2026-10-29T14:42:15.31233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/handover` → **200**

```json
{
  "command_id": "22e0e9fd-190f-407f-bd2f-830c6cfd5178",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:15.31233Z",
  "last_location_at": "2026-10-29T14:42:15.31233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:28Z",
    "sequence": 1793284948923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:28.943051Z",
  "last_location_at": "2026-10-29T14:42:28.943051Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668853779",
  "device_ref": "sandbox-8300"
}
```

```json
{
  "challenge_id": "eea1396b-63a2-4869-a3f1-415729d115bb",
  "expires_at": "2026-10-29T14:47:29.242578684Z",
  "resend_available_at": "2026-10-29T14:42:30.242578684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668853779` → **200**

```json
{
  "phone": "+380668853779",
  "audience": "CLIENT",
  "code": "325279",
  "sent_at": "2026-10-29T14:42:29.245278405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eea1396b-63a2-4869-a3f1-415729d115bb",
  "code": "325279",
  "device_ref": "sandbox-8300"
}
```

```json
{
  "session_id": "b1313c15-7554-4d53-badf-f7283995cea7",
  "subject": {
    "type": "CLIENT",
    "id": "5e08444d-1ead-41b5-811b-af5986047026"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTA4NDQ0ZC0xZWFkLTQxYjUtODExYi1hZjU5ODYwNDcwMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODQ5LCJpYXQiOjE3OTMyODQ5NDksImp0aSI6ImQ3YmNmZmJiLWUzNzItNGQ3ZS04MzM0LTY0ZDMxZjc2MmExMiIsInNpZCI6ImIxMzEzYzE1LTc1NTQtNGQ1My1iYWRmLWY3MjgzOTk1Y2VhNyJ9._PM3EuRCrJA64StjnwW6ThghIJW9bPmcGXVeQe5Jv5Y",
  "access_expires_at": "2026-10-29T14:57:29.572885692Z",
  "refresh_token": "3O7b3X3prw7Fnz6lg_H-n6G9-6RbIDOtg7DN_GkQUO4",
  "refresh_expires_at": "2026-11-28T14:42:29.572302505Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "faf1d62d-e4a5-4729-bf7f-29237f384b20",
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
  "id": "bf76672d-8cfc-4df0-8c5e-7f4bef191cf9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:29.868152Z",
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
  "command_id": "9437834f-8382-48d4-bbf5-6b6142d7850f",
  "quote_id": "bf76672d-8cfc-4df0-8c5e-7f4bef191cf9",
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
  "id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5e08444d-1ead-41b5-811b-af5986047026",
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
  "created_at": "2026-10-29T14:42:30.165427Z",
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
    "id": "e56bde51-0927-487e-b6a0-cfee5fa4425f",
    "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
    "expires_at": "2026-10-29T14:42:45.1684Z",
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

`POST /api/driver/v1/offers/e56bde51-0927-487e-b6a0-cfee5fa4425f/accept` → **200**

```json
{
  "command_id": "8241308e-795b-4d68-be82-dbffb96c62a5"
}
```

```json
{
  "id": "98a47936-db74-4371-bcb6-2499ee5b55b4",
  "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3201b846-707b-4e59-9f9a-fc6bd3b2295a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3201b846-707b-4e59-9f9a-fc6bd3b2295a",
  "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
  "assignment_id": "98a47936-db74-4371-bcb6-2499ee5b55b4",
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

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:31Z",
    "sequence": 1793284951398
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:31.417463Z",
  "last_location_at": "2026-10-29T14:42:31.417463Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3201b846-707b-4e59-9f9a-fc6bd3b2295a/arrive` → **200**

```json
{
  "command_id": "a3607ae8-0306-4a18-b558-0b4b18ebbcde",
  "expected_version": 0
}
```

```json
{
  "id": "3201b846-707b-4e59-9f9a-fc6bd3b2295a",
  "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
  "assignment_id": "98a47936-db74-4371-bcb6-2499ee5b55b4",
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
  "arrived_at": "2026-10-29T14:42:31.737492Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3201b846-707b-4e59-9f9a-fc6bd3b2295a/start` → **200**

```json
{
  "command_id": "637169df-6264-45a1-8969-0702ae0c20b3",
  "expected_version": 1
}
```

```json
{
  "id": "3201b846-707b-4e59-9f9a-fc6bd3b2295a",
  "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
  "assignment_id": "98a47936-db74-4371-bcb6-2499ee5b55b4",
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
  "arrived_at": "2026-10-29T14:42:31.737492Z",
  "started_at": "2026-10-29T14:42:32.053236Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:32Z",
    "sequence": 1793284952355
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:32.375262Z",
  "last_location_at": "2026-10-29T14:42:32.375262Z",
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
  "device_ref": "sandbox-11657"
}
```

```json
{
  "challenge_id": "1c79787e-3acb-464d-bdc9-c77ed4e50bb0",
  "expires_at": "2026-10-29T14:47:32.66443769Z",
  "resend_available_at": "2026-10-29T14:42:33.66443769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "296177",
  "sent_at": "2026-10-29T14:42:32.668334993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c79787e-3acb-464d-bdc9-c77ed4e50bb0",
  "code": "296177",
  "device_ref": "sandbox-11657"
}
```

```json
{
  "session_id": "816251f4-6fd9-4b16-8e6a-b0d1252dc01a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg1MiwiaWF0IjoxNzkzMjg0OTUyLCJqdGkiOiJhMzliODk2MS1iNjY2LTQ2ZTItYWM4Zi1kNDcxMjI3ZjhhMzAiLCJzaWQiOiI4MTYyNTFmNC02ZmQ5LTRiMTYtOGU2YS1iMGQxMjUyZGMwMWEifQ.Q7e3iSf0ZYPS7CRJtYQEJW5rIrocF0dPV3SQ4Rp-RpM",
  "access_expires_at": "2026-10-29T14:57:32.992322822Z",
  "refresh_token": "kaRzvhVVFeRiX4OLIXLagEpS3_ELlGcHsE8-DpA4v6s",
  "refresh_expires_at": "2026-11-28T14:42:32.991353162Z",
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
  "command_id": "b05cb4fd-27eb-4401-8f45-20e6b29e3494",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:33Z",
    "sequence": 1793284953575
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "44e29983-a039-4cd8-9661-884c36b1227b",
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
  "last_heartbeat_at": "2026-10-29T14:42:33.594341Z",
  "last_location_at": "2026-10-29T14:42:33.594341Z",
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
  "session_id": "9423c199-e3a0-48ba-96e6-bb5064d09f0c",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NTQsImlhdCI6MTc5MzI4NDk1NCwianRpIjoiMWVmOGYzZWItOTBjMy00OWY0LThjYTctNTVkODMwOTNkOGIwIiwic2lkIjoiOTQyM2MxOTktZTNhMC00OGJhLTk2ZTYtYmI1MDY0ZDA5ZjBjIn0.sHTa6ZcINc7HL6JmY119Wvs3qRZjtBtfh0YyB7LysfU",
  "access_expires_at": "2026-10-29T14:57:34.181401361Z",
  "refresh_token": "tZz9DR48D1UwQm-BVyd-OHqrOoYRQXkW3MD53MRp1BQ",
  "refresh_expires_at": "2026-10-30T02:42:34.180801996Z",
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
  "session_id": "a92db08d-4c4e-4494-bcc7-fea9d77b724a",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NTQsImlhdCI6MTc5MzI4NDk1NCwianRpIjoiZmVlNmY4NDgtNTgzNy00NDFmLTlhNTQtZmU3ZWI3NGExMGUzIiwic2lkIjoiYTkyZGIwOGQtNGM0ZS00NDk0LWJjYzctZmVhOWQ3N2I3MjRhIn0.Am1l0GuNBn5-dCOlKoBgGqWOKlVt85-alaQxWVxF7m4",
  "access_expires_at": "2026-10-29T14:57:34.76647297Z",
  "refresh_token": "fe92PRjWHEqCY-TO1ao1C3zbb1MnmjLs67Uh87Su-GI",
  "refresh_expires_at": "2026-10-30T02:42:34.765692108Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8fa2433d-e7ab-4f43-b4ea-b0053972b273` → **200**

```json
{
  "id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5e08444d-1ead-41b5-811b-af5986047026",
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
    "id": "98a47936-db74-4371-bcb6-2499ee5b55b4",
    "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3201b846-707b-4e59-9f9a-fc6bd3b2295a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:42:30.165427Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8fa2433d-e7ab-4f43-b4ea-b0053972b273/interrupt` → **200**

```json
{
  "command_id": "889d667d-aaeb-4305-8da5-fe096185ae6a",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "5e08444d-1ead-41b5-811b-af5986047026",
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
      "id": "98a47936-db74-4371-bcb6-2499ee5b55b4",
      "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "3201b846-707b-4e59-9f9a-fc6bd3b2295a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:42:30.165427Z",
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
    "id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "5e08444d-1ead-41b5-811b-af5986047026",
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
    "id": "5287c3b1-8a53-4c63-b07e-8126bd4976a8",
    "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
    "expires_at": "2026-10-29T14:42:50.397752Z",
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

`POST /api/driver/v1/offers/5287c3b1-8a53-4c63-b07e-8126bd4976a8/accept` → **200**

```json
{
  "command_id": "ff74372a-2473-4ae4-a798-bb94e8e7e0ad"
}
```

```json
{
  "id": "6c43f739-876c-4f68-b4cf-8ff85e6345f1",
  "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6b58a273-9be9-4cfb-93fe-7de6901ef508",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6b58a273-9be9-4cfb-93fe-7de6901ef508",
  "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
  "assignment_id": "6c43f739-876c-4f68-b4cf-8ff85e6345f1",
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
  "session_id": "44e29983-a039-4cd8-9661-884c36b1227b",
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
  "last_heartbeat_at": "2026-10-29T14:42:33.594341Z",
  "last_location_at": "2026-10-29T14:42:33.594341Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/44e29983-a039-4cd8-9661-884c36b1227b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:36Z",
    "sequence": 1793284956891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "44e29983-a039-4cd8-9661-884c36b1227b",
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
  "last_heartbeat_at": "2026-10-29T14:42:36.910426Z",
  "last_location_at": "2026-10-29T14:42:36.910426Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6b58a273-9be9-4cfb-93fe-7de6901ef508/arrive` → **200**

```json
{
  "command_id": "db6b3a03-c060-429f-8c40-5c0a87da03e2",
  "expected_version": 0
}
```

```json
{
  "id": "6b58a273-9be9-4cfb-93fe-7de6901ef508",
  "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
  "assignment_id": "6c43f739-876c-4f68-b4cf-8ff85e6345f1",
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
  "arrived_at": "2026-10-29T14:42:37.212697Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6b58a273-9be9-4cfb-93fe-7de6901ef508/start` → **200**

```json
{
  "command_id": "9f33ce90-21a2-4f41-a6cd-268a031df120",
  "expected_version": 1
}
```

```json
{
  "id": "6b58a273-9be9-4cfb-93fe-7de6901ef508",
  "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
  "assignment_id": "6c43f739-876c-4f68-b4cf-8ff85e6345f1",
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
  "arrived_at": "2026-10-29T14:42:37.212697Z",
  "started_at": "2026-10-29T14:42:37.515777Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6b58a273-9be9-4cfb-93fe-7de6901ef508/complete` → **200**

```json
{
  "command_id": "5136f546-5249-4506-818c-b8ceae84c48a",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:42:37Z"
}
```

```json
{
  "id": "6b58a273-9be9-4cfb-93fe-7de6901ef508",
  "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
  "assignment_id": "6c43f739-876c-4f68-b4cf-8ff85e6345f1",
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
  "arrived_at": "2026-10-29T14:42:37.212697Z",
  "started_at": "2026-10-29T14:42:37.515777Z",
  "completed_at": "2026-10-29T14:42:37.83171Z",
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
    "id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:42:35.388712Z",
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
    "id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:42:30.165427Z",
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

`GET /api/operator/v1/orders/8fa2433d-e7ab-4f43-b4ea-b0053972b273/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:30.165923Z",
      "actor": {
        "type": "CLIENT",
        "id": "5e08444d-1ead-41b5-811b-af5986047026",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
        "quote_id": "bf76672d-8cfc-4df0-8c5e-7f4bef191cf9",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "c874e434-f448-483f-9079-820f5eea116e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:30.167711Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
        "attempt_id": "eef16383-f3d0-42c6-a37a-895cfb444264",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c874e434-f448-483f-9079-820f5eea116e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:30.170313Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e56bde51-0927-487e-b6a0-cfee5fa4425f",
        "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "c874e434-f448-483f-9079-820f5eea116e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:42:30.795251Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e56bde51-0927-487e-b6a0-cfee5fa4425f",
        "order_id": "8fa2433d-e7ab-4f43-b4ea-b0053972b273",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "98a47936-db74-4371-bcb6-2499ee5b55b4"
      },
      "correlation_id": "384c9349-92bc-4817-9654-90d052a7bcc5"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/1b59e8b4-7288-4f41-a37f-e30a8885908e/tip` → **200**

```json
{
  "order_id": "1b59e8b4-7288-4f41-a37f-e30a8885908e",
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
  "available_until": "2026-10-30T14:42:37.83171Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/1b59e8b4-7288-4f41-a37f-e30a8885908e/tip` → **409**

```json
{
  "command_id": "7ffaa0f3-fdde-40e2-8fb2-19c5f52f9950",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/1b59e8b4-7288-4f41-a37f-e30a8885908e/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "65dacd0f-c749-4d5c-ac3b-c4134df7a611"
}
```

Done: interrupted 8fa2433d-e7ab-4f43-b4ea-b0053972b273, follow-up 1b59e8b4-7288-4f41-a37f-e30a8885908e.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f144ce85-0f26-4c07-8c9f-68bc559f1d2c",
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
  "last_heartbeat_at": "2026-10-29T14:42:32.375262Z",
  "last_location_at": "2026-10-29T14:42:32.375262Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f144ce85-0f26-4c07-8c9f-68bc559f1d2c/close` → **200**

```json
{
  "command_id": "845fa227-b91d-45d6-8125-6407eb96a57d",
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
  "session_id": "44e29983-a039-4cd8-9661-884c36b1227b",
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
  "last_heartbeat_at": "2026-10-29T14:42:36.910426Z",
  "last_location_at": "2026-10-29T14:42:36.910426Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44e29983-a039-4cd8-9661-884c36b1227b/close` → **200**

```json
{
  "command_id": "c3c16d16-9216-4826-9eb9-85d04e23c03b",
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
  "session_id": "73e12d62-906b-4ba3-9dec-4f1f55aff080",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NjQsImlhdCI6MTc5MzI4NDk2NCwianRpIjoiNTQ3NTBhMTktNjViZi00NzI4LTgyOWYtNTBhNzViZDlkNzc1Iiwic2lkIjoiNzNlMTJkNjItOTA2Yi00YmEzLTlkZWMtNGYxZjU1YWZmMDgwIn0.dfE4dBgLjOrJdYBo87T2YPy2jkOKafY8WLzU1_iUa9c",
  "access_expires_at": "2026-10-29T14:57:44.142552923Z",
  "refresh_token": "mWDhHJOLk1L6EMwAp2dpm0DZra_ScHRH8O7u6yFO3bs",
  "refresh_expires_at": "2026-10-30T02:42:44.141349139Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3bc22c88-58ce-4f57-8172-107081d4d8ba",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:44Z"
}
```

```json
{
  "id": "cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:44Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/cfadfbf0-d929-4ae1-ab82-3b2d8bf03050/publish` → **200**

```json
{
  "command_id": "3b343d99-cc20-44ef-ad3b-0152f4342055",
  "expected_version": 0
}
```

```json
{
  "id": "cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:44.750756Z",
  "published_at": "2026-10-29T14:42:44.750756Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:42:44.750756Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633271174",
  "device_ref": "sandbox-8479"
}
```

```json
{
  "challenge_id": "bebd01fa-203e-46b5-ac30-6f312c1916fb",
  "expires_at": "2026-10-29T14:47:45.330830454Z",
  "resend_available_at": "2026-10-29T14:42:46.330830454Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633271174` → **200**

```json
{
  "phone": "+380633271174",
  "audience": "CLIENT",
  "code": "709257",
  "sent_at": "2026-10-29T14:42:45.33370574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bebd01fa-203e-46b5-ac30-6f312c1916fb",
  "code": "709257",
  "device_ref": "sandbox-8479"
}
```

```json
{
  "session_id": "3b2f3150-e408-4ea5-8b55-ee6171a916af",
  "subject": {
    "type": "CLIENT",
    "id": "9fbfb3b9-467a-4397-9901-93df17928626"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmJmYjNiOS00NjdhLTQzOTctOTkwMS05M2RmMTc5Mjg2MjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODY1LCJpYXQiOjE3OTMyODQ5NjUsImp0aSI6IjRkZWMwMTUwLTNhY2ItNDQzZC1iYTFiLWM4M2JjYzBmNDRjOSIsInNpZCI6IjNiMmYzMTUwLWU0MDgtNGVhNS04YjU1LWVlNjE3MWE5MTZhZiJ9.Nj8i6tQG708ymMnArq9L6m38DM7Ckb-nXZI5oZnbXSU",
  "access_expires_at": "2026-10-29T14:57:45.644187058Z",
  "refresh_token": "_vrT0A-YzDYkcuUZvzvsF7_SHbVJSIonhj60Le3r24E",
  "refresh_expires_at": "2026-11-28T14:42:45.64361943Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:42:44.750756Z",
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
  "command_id": "285bf3e6-b513-4a78-a624-eabda8f4738c",
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
  "id": "031ed28d-eeea-47d8-a639-ae90046a782b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:46.233684Z",
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
  "command_id": "74490364-cc01-430e-ae01-78dd2a8deb2d",
  "quote_id": "031ed28d-eeea-47d8-a639-ae90046a782b",
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
  "correlation_id": "9eda1645-3917-48d5-a936-b156b15ca09c"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ddd902bd-c604-416d-9536-d92ced45123b",
  "version_id": "cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
  "language": "uk"
}
```

```json
{
  "version_id": "cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:42:46.844996Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44822605-4e0b-429f-873c-dd2e8fd45ddc",
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
  "id": "a330f3e2-2ff2-4462-b7ac-020dd195c592",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:47.149160Z",
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
  "command_id": "69eff510-72e2-48bc-b7f8-58c4e6aa34e4",
  "quote_id": "a330f3e2-2ff2-4462-b7ac-020dd195c592",
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
  "id": "0b2abe41-9666-4685-971a-fabe68ef5636",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fbfb3b9-467a-4397-9901-93df17928626",
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
  "created_at": "2026-10-29T14:42:47.452608Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b2abe41-9666-4685-971a-fabe68ef5636` → **200**

```json
{
  "id": "0b2abe41-9666-4685-971a-fabe68ef5636",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fbfb3b9-467a-4397-9901-93df17928626",
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
  "created_at": "2026-10-29T14:42:47.452608Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0b2abe41-9666-4685-971a-fabe68ef5636/cancel` → **200**

```json
{
  "command_id": "9930b241-1252-476d-bdc0-0b9450a21722",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0b2abe41-9666-4685-971a-fabe68ef5636",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9fbfb3b9-467a-4397-9901-93df17928626",
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
  "created_at": "2026-10-29T14:42:47.452608Z",
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

`POST /api/admin/v1/legal-documents/cfadfbf0-d929-4ae1-ab82-3b2d8bf03050` → **409**

```json
{
  "command_id": "0fdf6f75-47c1-44b0-968c-3f466ab5b1e2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:48Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/cfadfbf0-d929-4ae1-ab82-3b2d8bf03050",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "df573a52-736c-4bca-87c4-9584d6c409ed"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "51dbf627-c6f4-405f-9979-3806a9a2b6fe",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:42:48Z"
}
```

```json
{
  "id": "da8c9934-faa1-415e-822c-3de56c62994e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:42:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/da8c9934-faa1-415e-822c-3de56c62994e/publish` → **200**

```json
{
  "command_id": "d3e9d4a0-a19b-486b-add4-d713d8c0e86e",
  "expected_version": 0
}
```

```json
{
  "id": "da8c9934-faa1-415e-822c-3de56c62994e",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:42:49.006988Z",
  "published_at": "2026-10-29T14:42:49.006988Z",
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
  "device_ref": "sandbox-26772"
}
```

```json
{
  "challenge_id": "3e1ce7ea-7af0-4ab4-a798-0d2c9420cc62",
  "expires_at": "2026-10-29T14:47:49.31766102Z",
  "resend_available_at": "2026-10-29T14:42:50.31766102Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "783610",
  "sent_at": "2026-10-29T14:42:49.320433398Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e1ce7ea-7af0-4ab4-a798-0d2c9420cc62",
  "code": "783610",
  "device_ref": "sandbox-26772"
}
```

```json
{
  "session_id": "a48ac0ff-93a3-43ac-9b06-b7861ed2504e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg2OSwiaWF0IjoxNzkzMjg0OTY5LCJqdGkiOiJjYThiZmRhZi1jODBlLTQyMTktYmQzZS01Y2FhNDJlYzVhZjMiLCJzaWQiOiJhNDhhYzBmZi05M2EzLTQzYWMtOWIwNi1iNzg2MWVkMjUwNGUifQ.Cmx2Lq0P4Iy1EmMyBKkMhKViG9I79AkPu8Vw0o8E8wo",
  "access_expires_at": "2026-10-29T14:57:49.646289873Z",
  "refresh_token": "i3PtgvUi61kbyl9sLyjZgTKXQhSqwoUD1uA8HSn4tuQ",
  "refresh_expires_at": "2026-11-28T14:42:49.645673381Z",
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
  "command_id": "e10958fe-a5a9-4d53-8f0b-225988646f60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:50Z",
    "sequence": 1793284970227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "aa9e4871-a013-434d-9d87-7164f1f1c87d",
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
  "last_heartbeat_at": "2026-10-29T14:42:50.246826Z",
  "last_location_at": "2026-10-29T14:42:50.246826Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678036038",
  "device_ref": "sandbox-29582"
}
```

```json
{
  "challenge_id": "6f62df47-894f-4634-a00e-a58f6c3b4993",
  "expires_at": "2026-10-29T14:47:50.541139821Z",
  "resend_available_at": "2026-10-29T14:42:51.541139821Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678036038` → **200**

```json
{
  "phone": "+380678036038",
  "audience": "CLIENT",
  "code": "678699",
  "sent_at": "2026-10-29T14:42:50.543914669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f62df47-894f-4634-a00e-a58f6c3b4993",
  "code": "678699",
  "device_ref": "sandbox-29582"
}
```

```json
{
  "session_id": "1d8b8d48-bfb7-4559-ad27-5113ccc1ef81",
  "subject": {
    "type": "CLIENT",
    "id": "8abb9bb5-c100-441f-9006-5b68c189afc0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWJiOWJiNS1jMTAwLTQ0MWYtOTAwNi01YjY4YzE4OWFmYzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODcwLCJpYXQiOjE3OTMyODQ5NzAsImp0aSI6IjU5YTBmMThkLTcxMzItNGQ2MC04MDdiLTNkY2NmNmFiMWVkNyIsInNpZCI6IjFkOGI4ZDQ4LWJmYjctNDU1OS1hZDI3LTUxMTNjY2MxZWY4MSJ9.T6nhW2HGeDuh7Mzi7av9xLYfX94XryTVN_IQp-ARugQ",
  "access_expires_at": "2026-10-29T14:57:50.870358677Z",
  "refresh_token": "_OKFxeFTxpUl0gZfhrcqUGyzH0hNVSdkwbHzkAU8P_I",
  "refresh_expires_at": "2026-11-28T14:42:50.869860549Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b52cd1b8-4090-448c-942e-1e099c817524",
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
  "id": "7dbebe12-73b0-4f92-9030-5755bf1dd2c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:51.165890Z",
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
  "command_id": "ad1bd8fb-a2cb-44a4-bcc0-96859d4d6335",
  "quote_id": "7dbebe12-73b0-4f92-9030-5755bf1dd2c1",
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
    "phone": "+380676443808"
  }
}
```

```json
{
  "id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:51.47618Z",
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
    "id": "6a14b956-15c7-4420-bf08-b3bc6ff034a7",
    "order_id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
    "expires_at": "2026-10-29T14:43:06.47964Z",
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

`POST /api/driver/v1/offers/6a14b956-15c7-4420-bf08-b3bc6ff034a7/accept` → **200**

```json
{
  "command_id": "ea6e3300-97eb-4576-abbb-9c4f9832acff"
}
```

```json
{
  "id": "21beec74-e02c-4993-998d-ea1f9e16bf8c",
  "order_id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0dec5739-34a0-4914-b8f4-b4c4f6766821",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0dec5739-34a0-4914-b8f4-b4c4f6766821",
  "order_id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
  "assignment_id": "21beec74-e02c-4993-998d-ea1f9e16bf8c",
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
    "phone": "+380676443808"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa66f0af-a189-493c-974c-5dcd51699772",
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
  "id": "9333a61f-a20f-45b3-b03e-b40344eb8062",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:52.730584Z",
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
  "command_id": "000b38ab-0790-415d-9f7d-a45056083ea8",
  "quote_id": "9333a61f-a20f-45b3-b03e-b40344eb8062",
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
  "id": "d63cbc8a-5d92-4821-bb21-41b88c20b09f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:53.030192Z",
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
  "command_id": "74acb970-97dd-4788-9e4c-f1ddae253414",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:42:53Z"
}
```

```json
{
  "id": "27b4cd0e-0871-4d5a-98fb-2ede174e356d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:53.365325Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:42:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c42f1de8-a67d-43ad-853b-b3b018fcc5b9",
  "quote_id": "27b4cd0e-0871-4d5a-98fb-2ede174e356d",
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
  "pickup_at": "2026-10-29T17:42:53Z"
}
```

```json
{
  "id": "1fc0e384-d181-44e8-8552-7a2015ff6ee2",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:42:53.680117Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:42:53Z",
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
  "command_id": "57a0e6eb-02c8-411c-87b6-fce74a9386e6",
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
  "id": "627707ae-49e1-4ba3-a6f7-b575187e4728",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:53.998926Z",
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
  "command_id": "d34bbdce-f791-4b62-ab44-baa6635e2be9",
  "quote_id": "627707ae-49e1-4ba3-a6f7-b575187e4728",
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
  "correlation_id": "b39335cc-d583-422d-8476-23155df268fe"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "1fc0e384-d181-44e8-8552-7a2015ff6ee2",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:42:53.680117Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:42:53Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d63cbc8a-5d92-4821-bb21-41b88c20b09f",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T14:42:53.030192Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d63cbc8a-5d92-4821-bb21-41b88c20b09f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:53.030192Z",
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

`GET /api/rider/v1/orders/c4922bf0-e82a-4f37-a28c-0a66dc74f989` → **200**

```json
{
  "id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "21beec74-e02c-4993-998d-ea1f9e16bf8c",
    "order_id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0dec5739-34a0-4914-b8f4-b4c4f6766821",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:42:51.47618Z",
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
    "location_at": "2026-10-29T14:42:50.246826Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/c4922bf0-e82a-4f37-a28c-0a66dc74f989/cancel` → **200**

```json
{
  "command_id": "e875da5d-2225-4d57-9bb1-f8fb6e52c105",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "21beec74-e02c-4993-998d-ea1f9e16bf8c",
    "order_id": "c4922bf0-e82a-4f37-a28c-0a66dc74f989",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0dec5739-34a0-4914-b8f4-b4c4f6766821",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:42:51.47618Z",
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

`GET /api/rider/v1/orders/d63cbc8a-5d92-4821-bb21-41b88c20b09f` → **200**

```json
{
  "id": "d63cbc8a-5d92-4821-bb21-41b88c20b09f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:53.030192Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d63cbc8a-5d92-4821-bb21-41b88c20b09f/cancel` → **200**

```json
{
  "command_id": "f2c9fed8-deed-4d81-ad07-1ed59b1875ec",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d63cbc8a-5d92-4821-bb21-41b88c20b09f",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:53.030192Z",
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

`GET /api/rider/v1/orders/1fc0e384-d181-44e8-8552-7a2015ff6ee2` → **200**

```json
{
  "id": "1fc0e384-d181-44e8-8552-7a2015ff6ee2",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:42:53.680117Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:42:53Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1fc0e384-d181-44e8-8552-7a2015ff6ee2/cancel` → **200**

```json
{
  "command_id": "e9046188-4cd1-4cdd-b517-db46466ec338",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1fc0e384-d181-44e8-8552-7a2015ff6ee2",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8abb9bb5-c100-441f-9006-5b68c189afc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:42:53.680117Z",
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
  "pickup_at": "2026-10-29T17:42:53Z",
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
  "session_id": "aa9e4871-a013-434d-9d87-7164f1f1c87d",
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
  "last_heartbeat_at": "2026-10-29T14:42:50.246826Z",
  "last_location_at": "2026-10-29T14:42:50.246826Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa9e4871-a013-434d-9d87-7164f1f1c87d/close` → **200**

```json
{
  "command_id": "e6b674d9-a396-4fcf-b011-a45108eca952",
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

Done: orders c4922bf0-e82a-4f37-a28c-0a66dc74f989, d63cbc8a-5d92-4821-bb21-41b88c20b09f, 1fc0e384-d181-44e8-8552-7a2015ff6ee2.

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
  "session_id": "17fb2143-fad6-4b95-84aa-e37a53d1df3e",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NzcsImlhdCI6MTc5MzI4NDk3NywianRpIjoiZGQxYzFjYTItMzM2YS00ZTg0LWE1YzUtZTJlMGI0MDlmZDhmIiwic2lkIjoiMTdmYjIxNDMtZmFkNi00Yjk1LTg0YWEtZTM3YTUzZDFkZjNlIn0.7jPl8_rx94qictevn-6ykBZihedjjfDK0bdMl6EaeQU",
  "access_expires_at": "2026-10-29T14:57:57.97910653Z",
  "refresh_token": "xb9rsCsIB887mg3qVLYEAZ_v0nsUr7eB13Is8YfmRI4",
  "refresh_expires_at": "2026-10-30T02:42:57.978525698Z",
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
  "session_id": "a7db8189-abc8-43ed-affe-a1861ca846bb",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NzgsImlhdCI6MTc5MzI4NDk3OCwianRpIjoiNDcwNGY1NjEtYjA5OS00NmIyLTkwMjUtYmVjM2IwMjYwYWQ3Iiwic2lkIjoiYTdkYjgxODktYWJjOC00M2VkLWFmZmUtYTE4NjFjYTg0NmJiIn0.5OIDIE0ELYA6c_ye7NGSrQB-KySm7tv7Nj0jaINJ4gc",
  "access_expires_at": "2026-10-29T14:57:58.559920898Z",
  "refresh_token": "-3etQrXM6JFOUJ1xpssTeYyTlG0fnO-GmHfj48TTIe8",
  "refresh_expires_at": "2026-10-30T02:42:58.559329616Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12166"
}
```

```json
{
  "challenge_id": "b77d7c1f-f89c-4508-ac5c-ed1965ceca9f",
  "expires_at": "2026-10-29T14:47:58.840823573Z",
  "resend_available_at": "2026-10-29T14:42:59.840823573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "890398",
  "sent_at": "2026-10-29T14:42:58.843829536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b77d7c1f-f89c-4508-ac5c-ed1965ceca9f",
  "code": "890398",
  "device_ref": "sandbox-12166"
}
```

```json
{
  "session_id": "84b7b633-b99d-473d-bf47-d078563daedf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg3OSwiaWF0IjoxNzkzMjg0OTc5LCJqdGkiOiJhMDhmOWJmYy04NDk0LTRhOGItOTI0ZS03YTNkMDFlODg3ODYiLCJzaWQiOiI4NGI3YjYzMy1iOTlkLTQ3M2QtYmY0Ny1kMDc4NTYzZGFlZGYifQ.SBWrZOV7VWH0CStm_1EyYUsPXN6qeIi11etgOPAySm8",
  "access_expires_at": "2026-10-29T14:57:59.17028857Z",
  "refresh_token": "4yDrQ8FYYmOuM__ylulbF9ns2mJsStvXDFOiSHpPDNk",
  "refresh_expires_at": "2026-11-28T14:42:59.169780322Z",
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
  "command_id": "d560f21b-43ed-4bad-8435-11b3f4ada871",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:59Z",
    "sequence": 1793284979778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08d77f56-f8b6-4104-998a-816a78e8242b",
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
  "last_heartbeat_at": "2026-10-29T14:42:59.798846Z",
  "last_location_at": "2026-10-29T14:42:59.798846Z",
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
  "command_id": "29440de1-a736-403d-8e98-135b7f0b693b",
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
  "effective_at": "2026-10-29T14:43:00.461673Z",
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:40:18.723088Z",
  "last_entries": [
    {
      "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:40:18.723088Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "159ce02e-3b94-4cde-b84d-fe1d400cf889",
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
  "id": "f5beda58-386a-4f1a-9b94-e4d7a866451a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:01.055021Z",
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
  "command_id": "445c9a99-894b-4a2c-a029-1942eb65dc62",
  "quote_id": "f5beda58-386a-4f1a-9b94-e4d7a866451a",
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
    "phone": "+3806711121746"
  }
}
```

```json
{
  "id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
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
  "created_at": "2026-10-29T14:43:01.371167Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121746"
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
    "id": "aef971c6-96d1-4a8a-bb4e-973575abc239",
    "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
    "expires_at": "2026-10-29T14:43:16.374757Z",
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

`POST /api/driver/v1/offers/aef971c6-96d1-4a8a-bb4e-973575abc239/accept` → **200**

```json
{
  "command_id": "8e63aab0-7616-4775-afac-94f36ecc235b"
}
```

```json
{
  "id": "9562ab45-9eff-43ee-b8ab-aebff8eb73ab",
  "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "836ab257-a5b7-40e8-ad1d-5cceaee043d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "836ab257-a5b7-40e8-ad1d-5cceaee043d3",
  "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
  "assignment_id": "9562ab45-9eff-43ee-b8ab-aebff8eb73ab",
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
    "phone": "+3806711121746"
  }
}
```

`POST /api/driver/v1/work-sessions/08d77f56-f8b6-4104-998a-816a78e8242b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:02Z",
    "sequence": 1793284982569
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08d77f56-f8b6-4104-998a-816a78e8242b",
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
  "last_heartbeat_at": "2026-10-29T14:43:02.588742Z",
  "last_location_at": "2026-10-29T14:43:02.588742Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/836ab257-a5b7-40e8-ad1d-5cceaee043d3/arrive` → **200**

```json
{
  "command_id": "4501120c-93e3-4c65-9f50-fcaa3e44ce25",
  "expected_version": 0
}
```

```json
{
  "id": "836ab257-a5b7-40e8-ad1d-5cceaee043d3",
  "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
  "assignment_id": "9562ab45-9eff-43ee-b8ab-aebff8eb73ab",
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
  "arrived_at": "2026-10-29T14:43:02.888341Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121746"
  }
}
```

`POST /api/driver/v1/trips/836ab257-a5b7-40e8-ad1d-5cceaee043d3/start` → **200**

```json
{
  "command_id": "49d3f07c-a2cf-4fe5-8a37-ef86fd129c92",
  "expected_version": 1
}
```

```json
{
  "id": "836ab257-a5b7-40e8-ad1d-5cceaee043d3",
  "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
  "assignment_id": "9562ab45-9eff-43ee-b8ab-aebff8eb73ab",
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
  "arrived_at": "2026-10-29T14:43:02.888341Z",
  "started_at": "2026-10-29T14:43:03.184547Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121746"
  }
}
```

`POST /api/driver/v1/trips/836ab257-a5b7-40e8-ad1d-5cceaee043d3/complete` → **200**

```json
{
  "command_id": "3d7839e9-0154-458a-911b-44a7acab7495",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:43:03Z",
  "cash_received": true
}
```

```json
{
  "id": "836ab257-a5b7-40e8-ad1d-5cceaee043d3",
  "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
  "assignment_id": "9562ab45-9eff-43ee-b8ab-aebff8eb73ab",
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
  "arrived_at": "2026-10-29T14:43:02.888341Z",
  "started_at": "2026-10-29T14:43:03.184547Z",
  "completed_at": "2026-10-29T14:43:03.495711Z",
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
  "command_id": "8671cf12-102f-4164-8293-8740fa7e3870",
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
  "id": "ba30a934-acb6-49e3-b87f-fd31f57e7e10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:03.821365Z",
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
  "command_id": "d4efa4da-0a05-4ac6-8ccd-cc4a5717b47c",
  "quote_id": "ba30a934-acb6-49e3-b87f-fd31f57e7e10",
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
    "phone": "+3806711119395"
  }
}
```

```json
{
  "id": "ea45cab7-85d1-4143-9aed-977477a14aad",
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
  "created_at": "2026-10-29T14:43:04.12595Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119395"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ea45cab7-85d1-4143-9aed-977477a14aad` → **200**

```json
{
  "id": "ea45cab7-85d1-4143-9aed-977477a14aad",
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
  "created_at": "2026-10-29T14:43:04.12595Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119395"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ea45cab7-85d1-4143-9aed-977477a14aad/cancel` → **200**

```json
{
  "command_id": "6b9a1647-c008-4823-bc00-c72524f59b93",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ea45cab7-85d1-4143-9aed-977477a14aad",
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
  "created_at": "2026-10-29T14:43:04.12595Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119395"
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
  "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:40:18.723088Z",
  "last_entries": [
    {
      "order_id": "ea45cab7-85d1-4143-9aed-977477a14aad",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:43:04.780991Z"
    },
    {
      "order_id": "5bdf943f-8ec3-4bca-9c12-b6ead7537c85",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:43:03.501104Z"
    },
    {
      "order_id": "04e21c47-b384-416a-93f2-d22bbd73f8b5",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:40:18.723088Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "08d77f56-f8b6-4104-998a-816a78e8242b",
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
  "last_heartbeat_at": "2026-10-29T14:43:02.588742Z",
  "last_location_at": "2026-10-29T14:43:02.588742Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/08d77f56-f8b6-4104-998a-816a78e8242b/close` → **200**

```json
{
  "command_id": "8b553d76-6d11-4a7a-9d65-8e456b476b4e",
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

Done: operator bonus for fulfilled 5bdf943f-8ec3-4bca-9c12-b6ead7537c85 and operator-fault cancellation ea45cab7-85d1-4143-9aed-977477a14aad.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673996489",
  "device_ref": "sandbox-9224"
}
```

```json
{
  "challenge_id": "5339e23e-9727-466c-aa07-d91961b7a02b",
  "expires_at": "2026-10-29T14:48:09.224410012Z",
  "resend_available_at": "2026-10-29T14:43:10.224410012Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673996489` → **200**

```json
{
  "phone": "+380673996489",
  "audience": "CLIENT",
  "code": "768428",
  "sent_at": "2026-10-29T14:43:09.227006979Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675237241",
  "device_ref": "sandbox-12295",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7ab43c34-3c57-49ec-91bb-4c6c19bcea76",
  "expires_at": "2026-10-29T14:48:10.749951316Z",
  "resend_available_at": "2026-10-29T14:43:11.749951316Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675237241` → **200**

```json
{
  "phone": "+380675237241",
  "audience": "CLIENT",
  "code": "827996",
  "sent_at": "2026-10-29T14:43:10.753007008Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675237241",
  "device_ref": "sandbox-25557",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1d66f3f2-9b15-4378-bc6d-f4fe749c12d2",
  "expires_at": "2026-10-29T14:48:12.270898631Z",
  "resend_available_at": "2026-10-29T14:43:13.270898631Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675237241` → **200**

```json
{
  "phone": "+380675237241",
  "audience": "CLIENT",
  "code": "985969",
  "sent_at": "2026-10-29T14:43:12.273798895Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678160000",
  "device_ref": "sandbox-3831"
}
```

```json
{
  "challenge_id": "ee61b672-eba5-4b8f-9200-4c4cff510c0c",
  "expires_at": "2026-10-29T14:48:13.799592243Z",
  "resend_available_at": "2026-10-29T14:43:14.799592243Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678160000",
  "device_ref": "sandbox-27258"
}
```

```json
{
  "challenge_id": "86228d70-ec94-4a19-8d9d-d36de11bdcab",
  "expires_at": "2026-10-29T14:48:15.294884173Z",
  "resend_available_at": "2026-10-29T14:43:16.294884173Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678160000` → **200**

```json
{
  "phone": "+380678160000",
  "audience": "CLIENT",
  "code": "731014",
  "sent_at": "2026-10-29T14:43:15.297865094Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678160000",
  "device_ref": "sandbox-1490",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "65c555a9-e7b8-403d-941b-25ee6e911278",
  "expires_at": "2026-10-29T14:48:16.812695534Z",
  "resend_available_at": "2026-10-29T14:43:17.812695534Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678160000` → **200**

```json
{
  "phone": "+380678160000",
  "audience": "CLIENT",
  "code": "750895",
  "sent_at": "2026-10-29T14:43:16.815543795Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380678160000",
  "device_ref": "sandbox-24160",
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
  "correlation_id": "bddb5e3d-f295-467b-9caa-fe6a225499bd",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000017847"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "29246aff-e1d3-4444-810d-28c8a392687b"
}
```

`GET /sandbox/v1/otp?phone=%2B442000017847` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120011426"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "d6f94da7-9677-4155-8edd-d267ec025556"
}
```

`GET /sandbox/v1/otp?phone=%2B37120011426` → **404**

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
  "session_id": "c6a6abb1-7787-44e2-aa39-7ff2332cdbe3",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4OTksImlhdCI6MTc5MzI4NDk5OSwianRpIjoiMjRjMGQzOGYtZjg5OS00MDVkLTlhZDAtN2FhMzE0Yjk5ODA3Iiwic2lkIjoiYzZhNmFiYjEtNzc4Ny00NGUyLWFhMzktN2ZmMjMzMmNkYmUzIn0.i7zVclnxnqgiiZmgXber9Q_0DyTdw8cqgfPWYgoaRLg",
  "access_expires_at": "2026-10-29T14:58:19.570292046Z",
  "refresh_token": "Joc_WuxFpgzr3grM8DFxj6Aa68w4T_AOe_OjuOARrhI",
  "refresh_expires_at": "2026-10-30T02:43:19.569755479Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678160000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8870d485-cf32-477b-802c-2a6e605254a9",
      "challenge_id": "65c555a9-e7b8-403d-941b-25ee6e911278",
      "phone": "+380678160000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-533abb70-2e6c-4d2c-bc58-a0685c22a8f8",
      "error": null,
      "attempted_at": "2026-10-29T14:43:16.815815Z"
    },
    {
      "id": "3e846158-0266-432a-b257-d7f7f1c555e4",
      "challenge_id": "86228d70-ec94-4a19-8d9d-d36de11bdcab",
      "phone": "+380678160000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-1344dab7-ff81-427b-b7fe-460ad151b0d7",
      "error": null,
      "attempted_at": "2026-10-29T14:43:15.298377Z"
    },
    {
      "id": "0215836e-2627-4f2f-aaf5-f33ce5358020",
      "challenge_id": "ee61b672-eba5-4b8f-9200-4c4cff510c0c",
      "phone": "+380678160000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:43:13.802661Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678160000` → **200**

```json
{
  "phone": "+380678160000",
  "audience": "CLIENT",
  "code": "750895",
  "sent_at": "2026-10-29T14:43:16.815543795Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675237241` → **200**

```json
{
  "deliveries": [
    {
      "id": "6eb5aaeb-869c-411a-a440-8fc7625eff7c",
      "challenge_id": "1d66f3f2-9b15-4378-bc6d-f4fe749c12d2",
      "phone": "+380675237241",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f4e1f94f-0deb-49ef-b5a0-d39ecd2863be",
      "error": null,
      "attempted_at": "2026-10-29T14:43:12.274368Z"
    },
    {
      "id": "999528ab-127c-46d8-aa2b-c5eabe35dc07",
      "challenge_id": "7ab43c34-3c57-49ec-91bb-4c6c19bcea76",
      "phone": "+380675237241",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7d1721ee-4e56-4ebb-8a69-b4f498558fea",
      "error": null,
      "attempted_at": "2026-10-29T14:43:10.753372Z"
    }
  ]
}
```

Done: SMS to +380673996489; SMS then a call to +380675237241; a failed SMS, two calls and a refused third to +380678160000; +44 and +371 refused.

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
  "session_id": "d977cc98-2940-44ef-bb5d-ab6217524a64",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDAsImlhdCI6MTc5MzI4NTAwMCwianRpIjoiNGU5ZWFkNjgtOTY4YS00MTdkLTk5ZmEtN2JmZDUwMTQ2ODQ1Iiwic2lkIjoiZDk3N2NjOTgtMjk0MC00NGVmLWJiNWQtYWI2MjE3NTI0YTY0In0.MubIEk2SOaz_T3M8WT_cypN2bTKTN1nVoANe142bBk4",
  "access_expires_at": "2026-10-29T14:58:20.788823147Z",
  "refresh_token": "UFmjYVNK_6uXgvcxl0SfXMmW9Fl8Y7iUDmkkGYrz-MI",
  "refresh_expires_at": "2026-10-30T02:43:20.787972052Z",
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
  "session_id": "4f7c5b70-017e-4ea2-9643-5c4063a0a59d",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDEsImlhdCI6MTc5MzI4NTAwMSwianRpIjoiOWE5OGFlOGUtMmRkYS00YzZiLWJhYjMtNzVhMGIwODJiZmE0Iiwic2lkIjoiNGY3YzViNzAtMDE3ZS00ZWEyLTk2NDMtNWM0MDYzYTBhNTlkIn0.GKf4MDWvhce_7zWfQ5hCGSlBBOAisO6yWIn_DJU81rA",
  "access_expires_at": "2026-10-29T14:58:21.383181622Z",
  "refresh_token": "12LZbP2etZSc9bCfsjZzSg4DDod5A28o5wa_c0IraAY",
  "refresh_expires_at": "2026-10-30T02:43:21.382638131Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
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

`POST /api/admin/v1/staff-extensions/91a787e8-0d08-43d0-ba81-f10a7606b53a` → **200**

```json
{
  "command_id": "23e034c6-db93-4d14-9744-ae449dd46164",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "9041e2f3-da10-4dab-8ddb-834001a19e25",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:43:22.567281Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:43:22.567281Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "201dd16e-432d-43dd-bb44-285ea53245bb",
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
  "id": "c69a4239-7fdb-4f92-9c6e-028814e46efb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:23.148803Z",
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
  "command_id": "176e395c-bb9a-4f53-b34d-087b5a835b03",
  "quote_id": "c69a4239-7fdb-4f92-9c6e-028814e46efb",
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
    "phone": "+380677505871"
  }
}
```

```json
{
  "id": "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf",
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
  "created_at": "2026-10-29T14:43:23.461382Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677505871"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/89b893b9-f0fa-4c5f-b36a-f9eced60ebcf/calls` → **201**

```json
{
  "command_id": "7741bf53-d241-47d1-b7a1-851b346d980c",
  "to": "CALLER"
}
```

```json
{
  "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "order_ids": [
    "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf"
  ],
  "started_at": "2026-10-29T14:43:23.793906Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/89b893b9-f0fa-4c5f-b36a-f9eced60ebcf/calls` → **201**

```json
{
  "command_id": "7741bf53-d241-47d1-b7a1-851b346d980c",
  "to": "CALLER"
}
```

```json
{
  "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "order_ids": [
    "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf"
  ],
  "started_at": "2026-10-29T14:43:23.793906Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677505871",
    "at": "2026-10-29T14:43:23.796653785Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.29882",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=89b893b9-f0fa-4c5f-b36a-f9eced60ebcf` → **200**

```json
{
  "calls": [
    {
      "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [
        "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf"
      ],
      "started_at": "2026-10-29T14:43:23.793906Z",
      "answered_at": "2026-10-29T14:43:24.490761Z",
      "ended_at": "2026-10-29T14:43:24.513734Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=89b893b9-f0fa-4c5f-b36a-f9eced60ebcf` → **200**

```json
{
  "calls": [
    {
      "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [
        "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf"
      ],
      "started_at": "2026-10-29T14:43:23.793906Z",
      "answered_at": "2026-10-29T14:43:24.490761Z",
      "ended_at": "2026-10-29T14:43:24.513734Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=89b893b9-f0fa-4c5f-b36a-f9eced60ebcf` → **200**

```json
{
  "calls": [
    {
      "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [
        "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf"
      ],
      "started_at": "2026-10-29T14:43:23.793906Z",
      "answered_at": "2026-10-29T14:43:24.490761Z",
      "ended_at": "2026-10-29T14:43:24.513734Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=89b893b9-f0fa-4c5f-b36a-f9eced60ebcf` → **200**

```json
{
  "calls": [
    {
      "id": "eb43bcad-b6ac-4f08-97e0-dc30efc59f02",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "order_ids": [
        "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf"
      ],
      "started_at": "2026-10-29T14:43:23.793906Z",
      "answered_at": "2026-10-29T14:43:24.490761Z",
      "ended_at": "2026-10-29T14:43:24.513734Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:43:31.007943Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/89b893b9-f0fa-4c5f-b36a-f9eced60ebcf` → **200**

```json
{
  "id": "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf",
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
  "created_at": "2026-10-29T14:43:23.461382Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677505871"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/89b893b9-f0fa-4c5f-b36a-f9eced60ebcf/cancel` → **200**

```json
{
  "command_id": "020f2d59-370d-4d41-86af-ee0674d612bb",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "89b893b9-f0fa-4c5f-b36a-f9eced60ebcf",
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
  "created_at": "2026-10-29T14:43:23.461382Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677505871"
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
  "command_id": "fc6aff10-53b4-4c22-b0aa-818da0f1df88",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:43:32.422251Z",
  "extension": "101"
}
```

Done: outgoing call eb43bcad-b6ac-4f08-97e0-dc30efc59f02 from order 89b893b9-f0fa-4c5f-b36a-f9eced60ebcf, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638093309",
  "device_ref": "sandbox-13192"
}
```

```json
{
  "challenge_id": "ae3df477-5433-43cc-beb4-67f25eebc212",
  "expires_at": "2026-10-29T14:48:32.748572726Z",
  "resend_available_at": "2026-10-29T14:43:33.748572726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638093309` → **200**

```json
{
  "phone": "+380638093309",
  "audience": "CLIENT",
  "code": "636579",
  "sent_at": "2026-10-29T14:43:32.751291748Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae3df477-5433-43cc-beb4-67f25eebc212",
  "code": "636579",
  "device_ref": "sandbox-13192"
}
```

```json
{
  "session_id": "6531b937-c23f-4c8b-97f8-55866fe871a7",
  "subject": {
    "type": "CLIENT",
    "id": "2c52e623-5e35-40dc-b609-3677fb71e5cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUyZTYyMy01ZTM1LTQwZGMtYjYwOS0zNjc3ZmI3MWU1Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTEzLCJpYXQiOjE3OTMyODUwMTMsImp0aSI6Ijc1ODdlYWRkLWZiMzQtNDc5Ni05ZDcyLTJmMmRjOTRjYjhlYiIsInNpZCI6IjY1MzFiOTM3LWMyM2YtNGM4Yi05N2Y4LTU1ODY2ZmU4NzFhNyJ9.UDgDOAff2gC1CSmFEDmpKYGYYd6PeyxJ5KX4-sG_Rxk",
  "access_expires_at": "2026-10-29T14:58:33.072336842Z",
  "refresh_token": "QEduluXyZ72keMjHGuVIsgbKDzxmL5hE-cZZtrAUZN4",
  "refresh_expires_at": "2026-11-28T14:43:33.07183168Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
  "session_id": "6531b937-c23f-4c8b-97f8-55866fe871a7",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638093309",
  "device_ref": "sandbox-5926"
}
```

```json
{
  "challenge_id": "efbf6293-7c01-4f65-a88d-09aa76e7552f",
  "expires_at": "2026-10-29T14:48:35.657289322Z",
  "resend_available_at": "2026-10-29T14:43:36.657289322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638093309` → **200**

```json
{
  "phone": "+380638093309",
  "audience": "CLIENT",
  "code": "540745",
  "sent_at": "2026-10-29T14:43:35.659786353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efbf6293-7c01-4f65-a88d-09aa76e7552f",
  "code": "540745",
  "device_ref": "sandbox-5926"
}
```

```json
{
  "session_id": "f9d4b3f1-5eb3-4f76-b341-756acfb09dbd",
  "subject": {
    "type": "CLIENT",
    "id": "2c52e623-5e35-40dc-b609-3677fb71e5cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUyZTYyMy01ZTM1LTQwZGMtYjYwOS0zNjc3ZmI3MWU1Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTE1LCJpYXQiOjE3OTMyODUwMTUsImp0aSI6IjBiMDQ1ZTZhLWY2MmQtNGQ4OS04NjE3LWFlOWQ2YTYwOTBjZCIsInNpZCI6ImY5ZDRiM2YxLTVlYjMtNGY3Ni1iMzQxLTc1NmFjZmIwOWRiZCJ9.nb_Wr5p6dTtaEx1R8he53IvBe_LtpBRf4_EM2v3XSdc",
  "access_expires_at": "2026-10-29T14:58:35.990454164Z",
  "refresh_token": "SPfZ4O0GVW2KeFHqHLSWPKAWqAMjd6HQK3xBEJt_FP8",
  "refresh_expires_at": "2026-11-28T14:43:35.989919989Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "d7efbffd-14c4-4c3e-b784-5129a84923bd",
  "expires_at": "2026-10-29T14:48:38.305162932Z",
  "resend_available_at": "2026-10-29T14:43:39.305162932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638093309` → **200**

```json
{
  "phone": "+380638093309",
  "audience": "CLIENT",
  "code": "596125",
  "sent_at": "2026-10-29T14:43:38.307673328Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632223165"
}
```

```json
{
  "challenge_id": "baece0b6-5dee-41f0-a69b-0e8bf3534e65",
  "expires_at": "2026-10-29T14:48:38.616146239Z",
  "resend_available_at": "2026-10-29T14:43:39.616146239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632223165` → **200**

```json
{
  "phone": "+380632223165",
  "audience": "CLIENT",
  "code": "167197",
  "sent_at": "2026-10-29T14:43:38.618679448Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "825171d2-0f2f-48f9-9d4d-c34f14cc4c24",
  "current_challenge_id": "d7efbffd-14c4-4c3e-b784-5129a84923bd",
  "current_code": "000000",
  "new_challenge_id": "baece0b6-5dee-41f0-a69b-0e8bf3534e65",
  "new_code": "167197"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "800996af-df8f-4ea4-bdde-69c2b1d74d6a"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "cd3d9b24-3ea1-4760-a91d-03b32c2941f4",
  "current_challenge_id": "d7efbffd-14c4-4c3e-b784-5129a84923bd",
  "current_code": "596125",
  "new_challenge_id": "baece0b6-5dee-41f0-a69b-0e8bf3534e65",
  "new_code": "167197"
}
```

```json
{
  "subject_id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
  "phone": "+380632223165",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
  "session_id": "6531b937-c23f-4c8b-97f8-55866fe871a7",
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
  "correlation_id": "228bbc5b-5d27-4014-802b-7fe5799cea02"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632223165",
  "device_ref": "sandbox-7841"
}
```

```json
{
  "challenge_id": "86f82d55-db04-4371-946c-19fe69c2cfba",
  "expires_at": "2026-10-29T14:48:42.128923422Z",
  "resend_available_at": "2026-10-29T14:43:43.128923422Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632223165` → **200**

```json
{
  "phone": "+380632223165",
  "audience": "CLIENT",
  "code": "378889",
  "sent_at": "2026-10-29T14:43:42.131737523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86f82d55-db04-4371-946c-19fe69c2cfba",
  "code": "378889",
  "device_ref": "sandbox-7841"
}
```

```json
{
  "session_id": "b9d24d6a-b712-4824-a23d-1398e989e02b",
  "subject": {
    "type": "CLIENT",
    "id": "2c52e623-5e35-40dc-b609-3677fb71e5cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUyZTYyMy01ZTM1LTQwZGMtYjYwOS0zNjc3ZmI3MWU1Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTIyLCJpYXQiOjE3OTMyODUwMjIsImp0aSI6IjVlMDYwMDQ0LTNjMzQtNDFhZi04MmZmLWE3ZGNkMjkwMWFlZSIsInNpZCI6ImI5ZDI0ZDZhLWI3MTItNDgyNC1hMjNkLTEzOThlOTg5ZTAyYiJ9.981ao7M7g9VVHNHTUafH6g_A8Szo82RYP8S4FZyiT9g",
  "access_expires_at": "2026-10-29T14:58:42.449620462Z",
  "refresh_token": "lJQ_8whEoBokZ2ZfqHMamfhDM_DYT1fhtaj5I0OZrh4",
  "refresh_expires_at": "2026-11-28T14:43:42.449021038Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
  "session_id": "b9d24d6a-b712-4824-a23d-1398e989e02b",
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
  "session_id": "45a8e990-d0c1-4b10-8208-ed858027fd54",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjMsImlhdCI6MTc5MzI4NTAyMywianRpIjoiODU4NDYxNWQtYThjYi00NjNlLWI3YjUtNDEyNGU2NWM2MzQzIiwic2lkIjoiNDVhOGU5OTAtZDBjMS00YjEwLTgyMDgtZWQ4NTgwMjdmZDU0In0.4c1A8rdomkc5I0WLpmHHxenfetL6pgDjxt634d5Jc-s",
  "access_expires_at": "2026-10-29T14:58:43.329244631Z",
  "refresh_token": "EslRVmIN6_bwMWQyoBhMvV8uVLmxV7-OjvcEPAQSJWA",
  "refresh_expires_at": "2026-10-30T02:43:43.328671644Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd` → **200**

```json
{
  "client": {
    "id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
    "phone": "+380632223165",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:43:33.070167Z",
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

`POST /api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd/phone/new-code` → **201**

```json
{
  "phone": "+380631278819"
}
```

```json
{
  "challenge_id": "9c9b9a7e-12ea-4040-ae53-3348e12de713",
  "expires_at": "2026-10-29T14:48:43.934103287Z",
  "resend_available_at": "2026-10-29T14:43:44.934103287Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631278819` → **200**

```json
{
  "phone": "+380631278819",
  "audience": "CLIENT",
  "code": "127646",
  "sent_at": "2026-10-29T14:43:43.936408422Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd/phone` → **422**

```json
{
  "command_id": "27e15acd-d0d2-43f0-9e8e-fc87fe174e6e",
  "expected_version": 3,
  "new_challenge_id": "9c9b9a7e-12ea-4040-ae53-3348e12de713",
  "new_code": "127647",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "5324034b-e956-42b1-a7ff-952ade62fb1b"
}
```

`POST /api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd/phone` → **400**

```json
{
  "command_id": "6d23954b-2d6d-4c59-bf29-6f6175e6f5c3",
  "expected_version": 3,
  "new_challenge_id": "9c9b9a7e-12ea-4040-ae53-3348e12de713",
  "new_code": "127646",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "01cfccb5-9c72-480c-bc3a-e4725d41c35c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/2c52e623-5e35-40dc-b609-3677fb71e5cd/phone` → **200**

```json
{
  "command_id": "68e94490-f045-4ada-ae9d-1a88f917cfd9",
  "expected_version": 3,
  "new_challenge_id": "9c9b9a7e-12ea-4040-ae53-3348e12de713",
  "new_code": "127646",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
  "phone": "+380631278819",
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
  "correlation_id": "90f4aff7-9ba1-42a8-8d05-0bd89921bf23"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631278819",
  "device_ref": "sandbox-12569"
}
```

```json
{
  "challenge_id": "aa0791dd-6f1f-4ada-b4da-56913d7f8a0c",
  "expires_at": "2026-10-29T14:48:45.451010808Z",
  "resend_available_at": "2026-10-29T14:43:46.451010808Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631278819` → **200**

```json
{
  "phone": "+380631278819",
  "audience": "CLIENT",
  "code": "906349",
  "sent_at": "2026-10-29T14:43:45.453855788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa0791dd-6f1f-4ada-b4da-56913d7f8a0c",
  "code": "906349",
  "device_ref": "sandbox-12569"
}
```

```json
{
  "session_id": "caf24f61-0ebb-4616-b003-4b7cd4bfdef1",
  "subject": {
    "type": "CLIENT",
    "id": "2c52e623-5e35-40dc-b609-3677fb71e5cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUyZTYyMy01ZTM1LTQwZGMtYjYwOS0zNjc3ZmI3MWU1Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTI1LCJpYXQiOjE3OTMyODUwMjUsImp0aSI6IjkxNDM5NjFjLTQ2NjYtNDZmYy1iYmRjLTA2ZTgxZmQ5OTFlYSIsInNpZCI6ImNhZjI0ZjYxLTBlYmItNDYxNi1iMDAzLTRiN2NkNGJmZGVmMSJ9.bq0q-d0Og5a8sWLsR_0bR8p_CPywme7HT0xltBn88_8",
  "access_expires_at": "2026-10-29T14:58:45.773661459Z",
  "refresh_token": "TnGaBzVHkf7kJLDzqp4XPxqzIOaexQKS4HrmoIxQ0MQ",
  "refresh_expires_at": "2026-11-28T14:43:45.773069577Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2c52e623-5e35-40dc-b609-3677fb71e5cd",
  "session_id": "caf24f61-0ebb-4616-b003-4b7cd4bfdef1",
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
  "phone": "+380637915841",
  "device_ref": "sandbox-3908"
}
```

```json
{
  "challenge_id": "3365e94a-2661-41a8-975f-913f3b8e044b",
  "expires_at": "2026-10-29T14:48:46.348095502Z",
  "resend_available_at": "2026-10-29T14:43:47.348095502Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637915841` → **200**

```json
{
  "phone": "+380637915841",
  "audience": "CLIENT",
  "code": "720886",
  "sent_at": "2026-10-29T14:43:46.350619785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3365e94a-2661-41a8-975f-913f3b8e044b",
  "code": "720886",
  "device_ref": "sandbox-3908"
}
```

```json
{
  "session_id": "e2b107da-2cb2-4f81-a1aa-6bc9d4ba7005",
  "subject": {
    "type": "CLIENT",
    "id": "5bdbab37-560c-4c5a-92fa-c317a9eb937d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmRiYWIzNy01NjBjLTRjNWEtOTJmYS1jMzE3YTllYjkzN2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTI2LCJpYXQiOjE3OTMyODUwMjYsImp0aSI6IjJmOTNiMmRkLTE4ZGUtNGE5ZC05ZDBkLWM2MmZiZWYxZTIwOCIsInNpZCI6ImUyYjEwN2RhLTJjYjItNGY4MS1hMWFhLTZiYzlkNGJhNzAwNSJ9.-V7Gyk7j_lSFz7SvGhGaIQwFAyFfN7lNKSecfdeB498",
  "access_expires_at": "2026-10-29T14:58:46.657917039Z",
  "refresh_token": "ASeEcJtW--ZgvZ745VYyAorCNGdG7MtivZ9YVZ1tT5U",
  "refresh_expires_at": "2026-11-28T14:43:46.657407861Z",
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
  "session_id": "6677f418-8d7d-41e1-be60-74d7f1746750",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjcsImlhdCI6MTc5MzI4NTAyNywianRpIjoiZDcwNTNhN2MtOGVjZi00ZTJjLTgzMWMtODk0YTQ5OWMxNzViIiwic2lkIjoiNjY3N2Y0MTgtOGQ3ZC00MWUxLWJlNjAtNzRkN2YxNzQ2NzUwIn0.JK14MBDTXBV-6qf76xMc9ArHbkXS7PrleZLR86lHqlc",
  "access_expires_at": "2026-10-29T14:58:47.865017397Z",
  "refresh_token": "iLwpDSAvmppXCJGePLjU-T56T1Y--e1JCMagTe0k0uQ",
  "refresh_expires_at": "2026-10-30T02:43:47.864418522Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637915841` → **200**

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
  "correlation_id": "ce3b1901-dc5b-43e7-83d1-7811db99d977"
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
  "session_id": "52e28d21-58f3-4b53-9723-b66e819ee1d4",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjksImlhdCI6MTc5MzI4NTAyOSwianRpIjoiM2RiZGRhNDQtNzViMS00NGMzLThhYzYtNTc0MzUyMGRkYzU4Iiwic2lkIjoiNTJlMjhkMjEtNThmMy00YjUzLTk3MjMtYjY2ZTgxOWVlMWQ0In0.Jli9pWvqb66OUAVHgnVWATi343MyoOyL8VLpMR2kYLM",
  "access_expires_at": "2026-10-29T14:58:49.029930874Z",
  "refresh_token": "s5B0oB2y6IXZcge8oXZdrOo_UQwn59NEJCMkyIsunvo",
  "refresh_expires_at": "2026-10-30T02:43:49.029328633Z",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:39:49.677544Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "f9d5f6f5-7179-43a5-b197-da9548d7fc79",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:43:49.637921287Z"
}
```

## The rider books the airport for 2026-10-29T17:43:48Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600719616",
  "device_ref": "sandbox-31139"
}
```

```json
{
  "challenge_id": "a1aafe2a-0601-4300-8d5c-3c5d4edeb5a8",
  "expires_at": "2026-10-29T14:48:49.95262891Z",
  "resend_available_at": "2026-10-29T14:43:50.95262891Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600719616` → **200**

```json
{
  "phone": "+48600719616",
  "audience": "CLIENT",
  "code": "320612",
  "sent_at": "2026-10-29T14:43:49.955362062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1aafe2a-0601-4300-8d5c-3c5d4edeb5a8",
  "code": "320612",
  "device_ref": "sandbox-31139"
}
```

```json
{
  "session_id": "74cf1b2d-68e5-4447-8cbb-d4c9e639447b",
  "subject": {
    "type": "CLIENT",
    "id": "eecf5cdf-37ad-4f19-aa86-518e790089f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWNmNWNkZi0zN2FkLTRmMTktYWE4Ni01MThlNzkwMDg5ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTMwLCJpYXQiOjE3OTMyODUwMzAsImp0aSI6ImQzYTFhOWI4LWFkMDMtNGQ4Zi1hNDI0LWUzZjc1YjZiZDA1MCIsInNpZCI6Ijc0Y2YxYjJkLTY4ZTUtNDQ0Ny04Y2JiLWQ0YzllNjM5NDQ3YiJ9.UxvI3BJIPLFY4un3KYwXbaf7Rzm_mTzPHBKz_GkOWxs",
  "access_expires_at": "2026-10-29T14:58:50.270288661Z",
  "refresh_token": "cO-PvZ-nTFfEj7QP85BY8WYS_RhUomVcvFwyf_b8lFM",
  "refresh_expires_at": "2026-11-28T14:43:50.269797145Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2928387d-1b23-4cb9-a074-f43b6125b5c9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:43:48Z"
}
```

```json
{
  "id": "c5f7e6b7-a869-4e5a-9f87-304e38d83aa6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:50.566557Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:43:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b0cacfc9-6618-4dc2-9fa7-9a094e9f2316",
  "quote_id": "c5f7e6b7-a869-4e5a-9f87-304e38d83aa6",
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
  "pickup_at": "2026-10-29T17:43:48Z"
}
```

```json
{
  "id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "eecf5cdf-37ad-4f19-aa86-518e790089f9",
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
  "created_at": "2026-10-29T14:43:50.870815Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:43:48Z",
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
  "device_ref": "sandbox-22860"
}
```

```json
{
  "challenge_id": "a75facde-8b40-49d4-a2a7-92e6292d69c5",
  "expires_at": "2026-10-29T14:48:51.177672327Z",
  "resend_available_at": "2026-10-29T14:43:52.177672327Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "713523",
  "sent_at": "2026-10-29T14:43:51.18027876Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a75facde-8b40-49d4-a2a7-92e6292d69c5",
  "code": "713523",
  "device_ref": "sandbox-22860"
}
```

```json
{
  "session_id": "3de02c4b-96c0-4160-95c4-19728ba4b176",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTkzMSwiaWF0IjoxNzkzMjg1MDMxLCJqdGkiOiI1ZTQ2NjEwZC05ZGQwLTQzMWQtYmI4Ni0xZWRlMmYwNDc1ZjMiLCJzaWQiOiIzZGUwMmM0Yi05NmMwLTQxNjAtOTVjNC0xOTcyOGJhNGIxNzYifQ.hY1qjp0jC2orwjr1542Txm3Gt0MFNkvC2ExGL27H72c",
  "access_expires_at": "2026-10-29T14:58:51.509836075Z",
  "refresh_token": "gwVPEEKFTRvDIEIzO8osrMYEH_vTJsIQlw6UiuCflP0",
  "refresh_expires_at": "2026-11-28T14:43:51.509272278Z",
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
  "command_id": "ec8ffadd-f7bc-4688-bbfa-d8abcefe500f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:52Z",
    "sequence": 1793285032766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4a68036e-ac38-43a0-8e3c-21a550e85f86",
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
  "last_heartbeat_at": "2026-10-29T14:43:52.095304Z",
  "last_location_at": "2026-10-29T14:43:52.095304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:43:48Z",
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

`POST /api/driver/v1/preorders/0c985da4-7af4-48a0-a0b1-12a1465e04b7/reserve` → **200**

```json
{
  "command_id": "82937550-4d69-4139-a918-15ffd8ce26b2"
}
```

```json
{
  "id": "d67db89b-3ca4-4979-b9ac-76d6278cdf8a",
  "state": "RESERVED",
  "order": {
    "order_id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:43:48Z",
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
  "reserved_at": "2026-10-29T14:43:52.693836Z",
  "confirm_from": "2026-10-29T17:13:48Z",
  "confirm_until": "2026-10-29T17:23:48Z",
  "drop_until": "2026-10-29T16:43:48Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d67db89b-3ca4-4979-b9ac-76d6278cdf8a",
      "state": "RESERVED",
      "order": {
        "order_id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:43:48Z",
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
      "reserved_at": "2026-10-29T14:43:52.693836Z",
      "confirm_from": "2026-10-29T17:13:48Z",
      "confirm_until": "2026-10-29T17:23:48Z",
      "drop_until": "2026-10-29T16:43:48Z"
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
      "id": "d67db89b-3ca4-4979-b9ac-76d6278cdf8a",
      "state": "RESERVED",
      "order": {
        "order_id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:43:48Z",
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
      "reserved_at": "2026-10-29T14:43:52.693836Z",
      "confirm_from": "2026-10-29T17:13:48Z",
      "confirm_until": "2026-10-29T17:23:48Z",
      "drop_until": "2026-10-29T16:43:48Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d67db89b-3ca4-4979-b9ac-76d6278cdf8a/confirm` → **409**

```json
{
  "command_id": "b9ab63e9-f125-446e-8a82-e6bd75c68bf7"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d67db89b-3ca4-4979-b9ac-76d6278cdf8a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "edc99460-5232-4486-a87f-59334dccec90"
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
  "session_id": "e77c842e-14f4-414d-9e4f-326ce8d14c9f",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MzQsImlhdCI6MTc5MzI4NTAzNCwianRpIjoiMjc2ZTliNjctOWE2NC00MzRlLWFlOWQtNzEzZDM5YTQ5ZWEzIiwic2lkIjoiZTc3Yzg0MmUtMTRmNC00MTRkLTllNGYtMzI2Y2U4ZDE0YzlmIn0.4oSbUVGmDZwCclxDf3odOVH_cjqeaSJDs_btLNJLNQ8",
  "access_expires_at": "2026-10-29T14:58:54.170739389Z",
  "refresh_token": "H_ZexEoqPQlMdgdt9IT64saSc4tH9bPrQmg6sgt04xQ",
  "refresh_expires_at": "2026-10-30T02:43:54.170047409Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0c985da4-7af4-48a0-a0b1-12a1465e04b7` → **200**

```json
{
  "id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "eecf5cdf-37ad-4f19-aa86-518e790089f9",
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
  "created_at": "2026-10-29T14:43:50.870815Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:43:48Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d67db89b-3ca4-4979-b9ac-76d6278cdf8a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:43:52.693836Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0c985da4-7af4-48a0-a0b1-12a1465e04b7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:43:50.87199Z",
      "actor": {
        "type": "CLIENT",
        "id": "eecf5cdf-37ad-4f19-aa86-518e790089f9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
        "preorder": true,
        "quote_id": "c5f7e6b7-a869-4e5a-9f87-304e38d83aa6",
        "pickup_at": "2026-10-29T17:43:48Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "8a717ec9-c807-4dd6-9cc7-2d88e9984652"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:43:52.694959Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0c985da4-7af4-48a0-a0b1-12a1465e04b7",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d67db89b-3ca4-4979-b9ac-76d6278cdf8a"
      },
      "correlation_id": "e1c36ba8-0332-4e59-b41e-98ae24a75531"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 0c985da4-7af4-48a0-a0b1-12a1465e04b7, reservation d67db89b-3ca4-4979-b9ac-76d6278cdf8a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25125"
}
```

```json
{
  "challenge_id": "04540401-60ac-4634-827d-8fb05315f3d1",
  "expires_at": "2026-10-29T14:48:55.056766957Z",
  "resend_available_at": "2026-10-29T14:43:56.056766957Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "420300",
  "sent_at": "2026-10-29T14:43:55.059357704Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04540401-60ac-4634-827d-8fb05315f3d1",
  "code": "420300",
  "device_ref": "sandbox-25125"
}
```

```json
{
  "session_id": "cedec037-fddd-45f5-9362-6642842cd4f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTkzNSwiaWF0IjoxNzkzMjg1MDM1LCJqdGkiOiJjMDQwN2YwNi02N2ZmLTQwZGItODJjYS0zYjQ1NWM2ZDg1ZWIiLCJzaWQiOiJjZWRlYzAzNy1mZGRkLTQ1ZjUtOTM2Mi02NjQyODQyY2Q0ZjcifQ.EAGQiqzWZ6nztFjsNC_7XHGhHibyzM6Z_FsDDuKQ9u4",
  "access_expires_at": "2026-10-29T14:58:55.392776035Z",
  "refresh_token": "QE4LPn5071S2gthMpsqq0AOlwH6646oNNE8uRgxOLXI",
  "refresh_expires_at": "2026-11-28T14:43:55.39220468Z",
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
  "command_id": "748c4453-1f64-45b1-afa7-08949af2c76d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:55Z",
    "sequence": 1793285035966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:43:55.98581Z",
  "last_location_at": "2026-10-29T14:43:55.98581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671885009",
  "device_ref": "sandbox-1244"
}
```

```json
{
  "challenge_id": "74b76896-a137-415c-922f-d7a02701b0a4",
  "expires_at": "2026-10-29T14:48:56.275082471Z",
  "resend_available_at": "2026-10-29T14:43:57.275082471Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671885009` → **200**

```json
{
  "phone": "+380671885009",
  "audience": "CLIENT",
  "code": "261791",
  "sent_at": "2026-10-29T14:43:56.277709666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74b76896-a137-415c-922f-d7a02701b0a4",
  "code": "261791",
  "device_ref": "sandbox-1244"
}
```

```json
{
  "session_id": "1323085e-7c64-4f75-be42-b951a2cebb9c",
  "subject": {
    "type": "CLIENT",
    "id": "31d0d3c5-2bb3-4db5-8d95-5ef8ee3dc7f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWQwZDNjNS0yYmIzLTRkYjUtOGQ5NS01ZWY4ZWUzZGM3ZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTM2LCJpYXQiOjE3OTMyODUwMzYsImp0aSI6IjYzYjFhYmM2LWUyYjUtNGZjMC1hZTU0LWUyMGM4ZWQzYzBmMSIsInNpZCI6IjEzMjMwODVlLTdjNjQtNGY3NS1iZTQyLWI5NTFhMmNlYmI5YyJ9._RYHdUjppOMTy3nBJnPEr3Wzd-_H9w8Z73tvmqLtCAk",
  "access_expires_at": "2026-10-29T14:58:56.604228993Z",
  "refresh_token": "dJi32cN88zG2sSqzHeZd7YdPgMrb66UqbghI0Cxrvjs",
  "refresh_expires_at": "2026-11-28T14:43:56.603544318Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c7fb9cd-be67-40a0-b040-d632fb929751",
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
  "id": "0b116e84-1848-4f0e-94ea-a81bd83ec4e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:56.902363Z",
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
  "command_id": "d9b70734-811e-405e-ba10-f2b5530554db",
  "quote_id": "0b116e84-1848-4f0e-94ea-a81bd83ec4e2",
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
  "id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "31d0d3c5-2bb3-4db5-8d95-5ef8ee3dc7f0",
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
  "created_at": "2026-10-29T14:43:57.20324Z",
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
    "id": "6162289f-6b0f-484e-92e0-a54f378c5c01",
    "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
    "expires_at": "2026-10-29T14:44:12.206853Z",
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

`POST /api/driver/v1/offers/6162289f-6b0f-484e-92e0-a54f378c5c01/accept` → **200**

```json
{
  "command_id": "cbc50e78-0e67-45dd-85bf-a67d891132df"
}
```

```json
{
  "id": "4bc9b28e-4d17-485c-a61f-96868e2a37de",
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1785725a-2825-4065-888d-8b2346dea153",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1785725a-2825-4065-888d-8b2346dea153",
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "assignment_id": "4bc9b28e-4d17-485c-a61f-96868e2a37de",
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

`POST /api/driver/v1/work-sessions/b14ead49-44a7-46de-ace3-114e7f48220c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:58Z",
    "sequence": 1793285038400
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:43:58.42084Z",
  "last_location_at": "2026-10-29T14:43:58.42084Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1785725a-2825-4065-888d-8b2346dea153",
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "assignment_id": "4bc9b28e-4d17-485c-a61f-96868e2a37de",
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

`POST /api/driver/v1/trips/1785725a-2825-4065-888d-8b2346dea153/arrive` → **200**

```json
{
  "command_id": "45fa0d65-a05f-4a54-930f-ad74944ea136",
  "expected_version": 0
}
```

```json
{
  "id": "1785725a-2825-4065-888d-8b2346dea153",
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "assignment_id": "4bc9b28e-4d17-485c-a61f-96868e2a37de",
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
  "arrived_at": "2026-10-29T14:43:59.028807Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1785725a-2825-4065-888d-8b2346dea153/start` → **200**

```json
{
  "command_id": "04b46138-a054-4746-80a6-bddf8ad38817",
  "expected_version": 1
}
```

```json
{
  "id": "1785725a-2825-4065-888d-8b2346dea153",
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "assignment_id": "4bc9b28e-4d17-485c-a61f-96868e2a37de",
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
  "arrived_at": "2026-10-29T14:43:59.028807Z",
  "started_at": "2026-10-29T14:43:59.341196Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b14ead49-44a7-46de-ace3-114e7f48220c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:59Z",
    "sequence": 1793285039653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:43:59.673394Z",
  "last_location_at": "2026-10-29T14:43:59.673394Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/1785725a-2825-4065-888d-8b2346dea153/complete` → **200**

```json
{
  "command_id": "865d88e2-68af-4867-9ed3-d9b92fdc1242",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:43:59Z",
  "cash_received": true
}
```

```json
{
  "id": "1785725a-2825-4065-888d-8b2346dea153",
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "assignment_id": "4bc9b28e-4d17-485c-a61f-96868e2a37de",
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
  "arrived_at": "2026-10-29T14:43:59.028807Z",
  "started_at": "2026-10-29T14:43:59.341196Z",
  "completed_at": "2026-10-29T14:43:59.968394Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/5bc69b94-957f-47dd-83bf-2222ee90425e/rating` → **200**

```json
{
  "command_id": "d839732c-1c86-43a7-8087-c969c48b3e85",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "score": 5,
  "created_at": "2026-10-29T14:44:00.272639159Z"
}
```

`POST /api/driver/v1/orders/5bc69b94-957f-47dd-83bf-2222ee90425e/rating` → **200**

```json
{
  "command_id": "e8ce4333-06a8-4582-8c66-44040a8a22c8",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
  "score": 4,
  "created_at": "2026-10-29T14:44:00.5671329Z"
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
  "session_id": "0768bc41-bc8a-43b7-ba92-feee1a1444ac",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDEsImlhdCI6MTc5MzI4NTA0MSwianRpIjoiN2ZhNWQxNzEtNzE5My00YmU4LTgwZDctMjlmZTY0ZjM0NzlhIiwic2lkIjoiMDc2OGJjNDEtYmM4YS00M2I3LWJhOTItZmVlZTFhMTQ0NGFjIn0.3go22Qdex367jKP8NA1UBh2eF6P0KR9KvxI_SLrPpb0",
  "access_expires_at": "2026-10-29T14:59:01.442427683Z",
  "refresh_token": "FoPjoMNQFRb7Bi8GbMD-4k8QdUmiyjnrLop5sMfL0Ik",
  "refresh_expires_at": "2026-10-30T02:44:01.441864805Z",
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
  "session_id": "98330d76-2ab9-45eb-a1b9-d9dc8065b266",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDIsImlhdCI6MTc5MzI4NTA0MiwianRpIjoiNGI1ZDNkNDctOWRlMy00N2IwLWIzZjYtNzBiMmI0ZGQ1NWI0Iiwic2lkIjoiOTgzMzBkNzYtMmFiOS00NWViLWExYjktZDlkYzgwNjViMjY2In0.WIIKzr9K5ljZLcZWBo-CfrD2_lpwTT4cnofeMF31cfI",
  "access_expires_at": "2026-10-29T14:59:02.018132088Z",
  "refresh_token": "fqQIXf8pNIRxnLrULjlBIf0lSoR-GoAH5vmVsxXyl-U",
  "refresh_expires_at": "2026-10-30T02:44:02.017607581Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5bc69b94-957f-47dd-83bf-2222ee90425e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
      "author_type": "RIDER",
      "author_id": "31d0d3c5-2bb3-4db5-8d95-5ef8ee3dc7f0",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:44:00.272639Z"
    },
    {
      "order_id": "5bc69b94-957f-47dd-83bf-2222ee90425e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "31d0d3c5-2bb3-4db5-8d95-5ef8ee3dc7f0",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:44:00.567133Z"
    }
  ]
}
```

Done: ratings for order 5bc69b94-957f-47dd-83bf-2222ee90425e.

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
  "session_id": "68773df1-6bea-4074-be3c-a66082bda293",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDIsImlhdCI6MTc5MzI4NTA0MiwianRpIjoiOTNkZTM3ZWEtZDJiZS00YTMzLWEwMDgtYmZkOGY4N2NlYWE4Iiwic2lkIjoiNjg3NzNkZjEtNmJlYS00MDc0LWJlM2MtYTY2MDgyYmRhMjkzIn0.jQ8bMb5rrvnW2jXsBfxV702tjPkBJOsf5e3hHgnJW94",
  "access_expires_at": "2026-10-29T14:59:02.898176083Z",
  "refresh_token": "44Hk28So_dno3TZ6K95x3AivPmaHVv8CDWJgSeeG974",
  "refresh_expires_at": "2026-10-30T02:44:02.897614918Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e623187d-cbec-4ef2-90e2-a8ebbed4d1a8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "178c61b1-1763-4f94-81e1-d67aaab443ed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:03.207723Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/178c61b1-1763-4f94-81e1-d67aaab443ed` → **200**

```json
{
  "id": "178c61b1-1763-4f94-81e1-d67aaab443ed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:03.207723Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/178c61b1-1763-4f94-81e1-d67aaab443ed` → **200**

```json
{
  "id": "178c61b1-1763-4f94-81e1-d67aaab443ed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:03.207723Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/178c61b1-1763-4f94-81e1-d67aaab443ed` → **200**

```json
{
  "id": "178c61b1-1763-4f94-81e1-d67aaab443ed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:44:03.207723Z",
  "ready_at": "2026-10-29T14:44:06.055561Z",
  "expires_at": "2026-10-30T14:44:06.055561Z"
}
```

`GET /api/admin/v1/reports/exports/178c61b1-1763-4f94-81e1-d67aaab443ed/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "556b9050-d640-4f11-9d3b-a3281a49cac7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "6a47069d-aba7-4e39-bf62-58a06192a416",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:06.403917Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6a47069d-aba7-4e39-bf62-58a06192a416` → **200**

```json
{
  "id": "6a47069d-aba7-4e39-bf62-58a06192a416",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:06.403917Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6a47069d-aba7-4e39-bf62-58a06192a416` → **200**

```json
{
  "id": "6a47069d-aba7-4e39-bf62-58a06192a416",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:06.403917Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6a47069d-aba7-4e39-bf62-58a06192a416` → **200**

```json
{
  "id": "6a47069d-aba7-4e39-bf62-58a06192a416",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:06.403917Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6a47069d-aba7-4e39-bf62-58a06192a416` → **200**

```json
{
  "id": "6a47069d-aba7-4e39-bf62-58a06192a416",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:06.403917Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6a47069d-aba7-4e39-bf62-58a06192a416` → **200**

```json
{
  "id": "6a47069d-aba7-4e39-bf62-58a06192a416",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:44:06.403917Z",
  "ready_at": "2026-10-29T14:44:11.063944Z",
  "expires_at": "2026-10-30T14:44:11.063944Z"
}
```

`GET /api/admin/v1/reports/exports/6a47069d-aba7-4e39-bf62-58a06192a416/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/0119350a-c78c-46a6-b73d-82a126f59bb6` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/0119350a-c78c-46a6-b73d-82a126f59bb6",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0f4abf76-c5ee-447a-b400-82307847d621"
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
  "device_ref": "sandbox-30602"
}
```

```json
{
  "challenge_id": "c0c07ebb-24ac-4b92-aa75-6ca4b2ab7586",
  "expires_at": "2026-10-29T14:49:12.463476725Z",
  "resend_available_at": "2026-10-29T14:44:13.463476725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "743081",
  "sent_at": "2026-10-29T14:44:12.466368923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0c07ebb-24ac-4b92-aa75-6ca4b2ab7586",
  "code": "743081",
  "device_ref": "sandbox-30602"
}
```

```json
{
  "session_id": "1227fc89-ef84-4f49-844a-5587f0ae6d4d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk1MiwiaWF0IjoxNzkzMjg1MDUyLCJqdGkiOiJjNDhmZDY0Ny02MGY2LTQzNTgtYjQ5Yi1iYzU2NmQ0ZDZmOGIiLCJzaWQiOiIxMjI3ZmM4OS1lZjg0LTRmNDktODQ0YS01NTg3ZjBhZTZkNGQifQ.xgNQwaT0uJnNFApHdIK41nMra-H86s-OTxTNZKIhQjk",
  "access_expires_at": "2026-10-29T14:59:12.786401313Z",
  "refresh_token": "aQKqzK42TlxOYAUounuEaNDYHInkEWDw7MIV1slH_oU",
  "refresh_expires_at": "2026-11-28T14:44:12.785889961Z",
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
  "command_id": "920d78a1-ad52-44df-9a86-b90f2e498f05",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:13Z",
    "sequence": 1793285053669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "53e024e0-ac38-4884-b844-a77ad1b9d7f3",
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
  "last_heartbeat_at": "2026-10-29T14:44:13.688656Z",
  "last_location_at": "2026-10-29T14:44:13.688656Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "3100daff-6e3f-4a38-9cc8-90fc775e2597",
  "points": [
    {
      "sequence": 1793285055991,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:43:15Z"
    },
    {
      "sequence": 1793285055999,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:44:16Z"
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
  "session_id": "52a5f4c8-7f93-4699-a230-e1696c0f612a",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NTYsImlhdCI6MTc5MzI4NTA1NiwianRpIjoiZWQxNDkzYjYtYWIwMC00MTExLTg3YjQtYTg1OTk4OWEyOTdiIiwic2lkIjoiNTJhNWY0YzgtN2Y5My00Njk5LWEyMzAtZTE2OTZjMGY2MTJhIn0.-uhMIgEwmgjrcTjaYpW8wGiR8AWLtOFoEwALiGZGhho",
  "access_expires_at": "2026-10-29T14:59:16.630786656Z",
  "refresh_token": "lvD9zfUobOTRECwtuVl8o1dgVAOqzSH1QytXRaF2Sjg",
  "refresh_expires_at": "2026-10-30T02:44:16.630213661Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "a7bb4867-dc5b-44a8-bd65-123cf2c1870b",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 61.0,
        "speed_kph": 2362,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:44:16Z",
        "track_point_id": "205073b8-931c-4f02-be7c-2d923859171a",
        "work_session_id": "53e024e0-ac38-4884-b844-a77ad1b9d7f3"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:44:16Z",
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

`POST /api/admin/v1/driver-risk-flags/a7bb4867-dc5b-44a8-bd65-123cf2c1870b/confirm` → **200**

```json
{
  "command_id": "37c7676a-c70b-4dec-861c-b4a6b58aac8a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a7bb4867-dc5b-44a8-bd65-123cf2c1870b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 61.0,
    "speed_kph": 2362,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:44:16Z",
    "track_point_id": "205073b8-931c-4f02-be7c-2d923859171a",
    "work_session_id": "53e024e0-ac38-4884-b844-a77ad1b9d7f3"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:44:16Z",
  "reason": null,
  "reviewed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reviewed_at": "2026-10-29T14:44:17.552234Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a7bb4867-dc5b-44a8-bd65-123cf2c1870b/dismiss` → **409**

```json
{
  "command_id": "a2b9a87a-0068-434e-a4a1-c265736f53bb",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a7bb4867-dc5b-44a8-bd65-123cf2c1870b/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dc569cba-34c6-449b-b25d-c8430184ce00"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "271bb1f0-2c6d-4af8-9572-fcc78792a90b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "69ef015b-8509-4254-a7c1-ce9877c9131b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "raised_at": "2026-10-29T14:44:18.163051Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/69ef015b-8509-4254-a7c1-ce9877c9131b/dismiss` → **200**

```json
{
  "command_id": "e6963b1a-2d6e-4ad6-8c8e-23ee5c76130e",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "69ef015b-8509-4254-a7c1-ce9877c9131b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "raised_at": "2026-10-29T14:44:18.163051Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reviewed_at": "2026-10-29T14:44:18.479933Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c6b59580-5665-45b5-85f3-58656fd715c4",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a7bb4867-dc5b-44a8-bd65-123cf2c1870b"
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
      "actor_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:18.784633Z"
    }
  ]
}
```

Done: flag a7bb4867-dc5b-44a8-bd65-123cf2c1870b confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "4d3c0252-29d5-43b8-bfa7-0023a291b560",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NTksImlhdCI6MTc5MzI4NTA1OSwianRpIjoiOTU2NzQ5YzAtMGI4NS00MmQ3LThkMTYtOGUwYTcwNjhmYzA2Iiwic2lkIjoiNGQzYzAyNTItMjlkNS00M2I4LWJmYTctMDAyM2EyOTFiNTYwIn0.GAq87Got247J8s9cN78NzWgSqfCJTvpIAFKfpuWWSWo",
  "access_expires_at": "2026-10-29T14:59:19.658620502Z",
  "refresh_token": "TunqNzu2K60Zq-Rd3OopVHeXecf4C0jaEN0lKyMj6oQ",
  "refresh_expires_at": "2026-10-30T02:44:19.6580719Z",
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
      "actor_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:18.784633Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "bd3cd549-c3bd-48cd-9d18-e31c355cf5e2",
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
  "session_id": "53e024e0-ac38-4884-b844-a77ad1b9d7f3",
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
  "last_heartbeat_at": "2026-10-29T14:44:13.688656Z",
  "last_location_at": "2026-10-29T14:44:13.688656Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/53e024e0-ac38-4884-b844-a77ad1b9d7f3/close` → **200**

```json
{
  "command_id": "4b5d478e-f7b4-423f-aa51-ea4145585372",
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
  "session_id": "1b228ce8-96a6-4059-9a4d-fdfb90657502",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjEsImlhdCI6MTc5MzI4NTA2MSwianRpIjoiMWEyODNkOTQtOTYxNC00OTkxLTg3NWQtNWQ4YWQyOWFmYzgyIiwic2lkIjoiMWIyMjhjZTgtOTZhNi00MDU5LTlhNGQtZmRmYjkwNjU3NTAyIn0._zitjssTMoN451RHip_7-InQIj_adHeliu2Fru_bad0",
  "access_expires_at": "2026-10-29T14:59:21.449417123Z",
  "refresh_token": "eVII9H4FWlaz5UA6u_uBI7gQOj-sFnai9CzLHVyv3p0",
  "refresh_expires_at": "2026-10-30T02:44:21.448852411Z",
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
  "command_id": "52b9e6c0-a270-4976-bbbf-857919dacf98",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:44:22.043947Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "52b9e6c0-a270-4976-bbbf-857919dacf98",
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
  "changed_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:44:22.043947Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48971664346",
  "device_ref": "sandbox-26551"
}
```

```json
{
  "challenge_id": "cfdd5364-3c48-499a-8530-ce9827cc8f30",
  "expires_at": "2026-10-29T14:49:22.657582045Z",
  "resend_available_at": "2026-10-29T14:44:23.657582045Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48971664346` → **200**

```json
{
  "phone": "+48971664346",
  "audience": "CLIENT",
  "code": "147799",
  "sent_at": "2026-10-29T14:44:22.660193497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfdd5364-3c48-499a-8530-ce9827cc8f30",
  "code": "147799",
  "device_ref": "sandbox-26551"
}
```

```json
{
  "session_id": "dab58e0b-3f40-4de0-8789-b958cd1b1374",
  "subject": {
    "type": "CLIENT",
    "id": "88ffdeed-04b3-4500-9c86-4096a6354af0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGZmZGVlZC0wNGIzLTQ1MDAtOWM4Ni00MDk2YTYzNTRhZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTYyLCJpYXQiOjE3OTMyODUwNjIsImp0aSI6IjYxZGFjZjVmLWRmYjgtNGQyYy04MGY0LTE0NWU0MWY1MjhlZSIsInNpZCI6ImRhYjU4ZTBiLTNmNDAtNGRlMC04Nzg5LWI5NThjZDFiMTM3NCJ9.qiyXIAklexArPsefL0Tg3i51qg4dv7BxOg9TZoEpGwc",
  "access_expires_at": "2026-10-29T14:59:22.977873727Z",
  "refresh_token": "0Ns-E-mIrFlxY2rrojiJ-C-iQWaqwSEIleiEQPkAs74",
  "refresh_expires_at": "2026-11-28T14:44:22.977308003Z",
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
  "correlation_id": "1142bb50-401f-4f08-af39-4458482ce413"
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
  "device_ref": "sandbox-3038"
}
```

```json
{
  "challenge_id": "23c4f1d4-5ace-4b0e-bdaf-6dfe8eb64447",
  "expires_at": "2026-10-29T14:49:23.85777893Z",
  "resend_available_at": "2026-10-29T14:44:24.85777893Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "749705",
  "sent_at": "2026-10-29T14:44:23.860309514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23c4f1d4-5ace-4b0e-bdaf-6dfe8eb64447",
  "code": "749705",
  "device_ref": "sandbox-3038"
}
```

```json
{
  "session_id": "39fcdc97-e624-41fb-be07-d31d13de219b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk2NCwiaWF0IjoxNzkzMjg1MDY0LCJqdGkiOiIwNTRhM2EwYS0xZWExLTQxMDYtOGJlMS02OWE1Y2NiYjY5NzkiLCJzaWQiOiIzOWZjZGM5Ny1lNjI0LTQxZmItYmUwNy1kMzFkMTNkZTIxOWIifQ.-UcS-BO9L0MXsTN4AQBEztosIaAcL-v-bn3kUA6oxPA",
  "access_expires_at": "2026-10-29T14:59:24.167346955Z",
  "refresh_token": "oACdFYvBKxRiQu7ulkLaGLSlUCHzGuI9VQ8tcuvQTI4",
  "refresh_expires_at": "2026-11-28T14:44:24.166853676Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4a68036e-ac38-43a0-8e3c-21a550e85f86",
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
  "last_heartbeat_at": "2026-10-29T14:43:52.095304Z",
  "last_location_at": "2026-10-29T14:43:52.095304Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4a68036e-ac38-43a0-8e3c-21a550e85f86/handover` → **200**

```json
{
  "command_id": "b9db8093-bb13-4c57-986b-eba2dca40fd3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4a68036e-ac38-43a0-8e3c-21a550e85f86",
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
  "last_heartbeat_at": "2026-10-29T14:43:52.095304Z",
  "last_location_at": "2026-10-29T14:43:52.095304Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4a68036e-ac38-43a0-8e3c-21a550e85f86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:25Z",
    "sequence": 1793285065375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4a68036e-ac38-43a0-8e3c-21a550e85f86",
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
  "last_heartbeat_at": "2026-10-29T14:44:25.056146Z",
  "last_location_at": "2026-10-29T14:44:25.056146Z",
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
  "session_id": "4a68036e-ac38-43a0-8e3c-21a550e85f86",
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
  "last_heartbeat_at": "2026-10-29T14:44:25.056146Z",
  "last_location_at": "2026-10-29T14:44:25.056146Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a68036e-ac38-43a0-8e3c-21a550e85f86/close` → **200**

```json
{
  "command_id": "8aeefb60-6572-4355-b5e8-3bdd4dc66c5b",
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
  "correlation_id": "c06c25e3-90cd-4ab6-8027-014d2ab9851f"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670973504",
  "device_ref": "sandbox-1530"
}
```

```json
{
  "challenge_id": "309d3bba-c967-4955-b041-d4bfc015f33e",
  "expires_at": "2026-10-29T14:49:26.538280264Z",
  "resend_available_at": "2026-10-29T14:44:27.538280264Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670973504` → **200**

```json
{
  "phone": "+380670973504",
  "audience": "CLIENT",
  "code": "625636",
  "sent_at": "2026-10-29T14:44:26.541647858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "309d3bba-c967-4955-b041-d4bfc015f33e",
  "code": "625636",
  "device_ref": "sandbox-1530"
}
```

```json
{
  "session_id": "ab7870d7-351e-434a-8588-da84610ef3cc",
  "subject": {
    "type": "CLIENT",
    "id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTIyMTFkMi03ZWQ0LTQzM2ItODU0Yi05YThhZmY3YjM0NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTY2LCJpYXQiOjE3OTMyODUwNjYsImp0aSI6ImVlNmVlMjIwLTFkMWQtNDA0NS05YjYwLWVjYWJkNWFlOGMwZiIsInNpZCI6ImFiNzg3MGQ3LTM1MWUtNDM0YS04NTg4LWRhODQ2MTBlZjNjYyJ9.lGRVOvNA5-Cd1_sbMWYwZHSioIar3WccRClRR4UPVe4",
  "access_expires_at": "2026-10-29T14:59:26.851032109Z",
  "refresh_token": "TEiBe2gJqmZaAAcjbjeWsw3qEsNfdo57_7mymhyrDjY",
  "refresh_expires_at": "2026-11-28T14:44:26.850466814Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "39941d30-b477-4a86-b6bc-9b3dcfb45f56",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "98c4ab73-ca92-4b31-9840-49ecc704e636",
  "upload_path": "/api/rider/v1/uploads/98c4ab73-ca92-4b31-9840-49ecc704e636",
  "expires_at": "2026-10-29T14:59:27.144106285Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/98c4ab73-ca92-4b31-9840-49ecc704e636` → **200**

```json
{
  "file_id": "98c4ab73-ca92-4b31-9840-49ecc704e636",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3544aeab-ad1a-45fc-a969-1c8a1e256f27",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "98c4ab73-ca92-4b31-9840-49ecc704e636"
  ]
}
```

```json
{
  "id": "c95be520-7c94-4a10-a9d9-2b6668ae5edc",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:44:27.462206Z",
  "updated_at": "2026-10-29T14:44:27.462206Z",
  "respond_by": "2026-10-29T18:44:27.462206Z",
  "messages": [
    {
      "id": "aac51120-f25c-495a-9079-c787c3a2fed9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:27.4632Z",
      "attachments": [
        {
          "file_id": "98c4ab73-ca92-4b31-9840-49ecc704e636",
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
  "session_id": "9af0a31d-9cdb-4854-8f57-cc1b30ed7229",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjgsImlhdCI6MTc5MzI4NTA2OCwianRpIjoiNGEwZGNmMmUtMjE1YS00NDVkLTg4YzUtNzhmMzlhMTMwNTUzIiwic2lkIjoiOWFmMGEzMWQtOWNkYi00ODU0LThmNTctY2MxYjMwZWQ3MjI5In0.EgZ3sojq0s2_K3uf91-NrIIvxrc8pyPkQ6d7zDLjGbU",
  "access_expires_at": "2026-10-29T14:59:28.056831743Z",
  "refresh_token": "QDfMsBeoJxbw_WigQl-nG4rd2wDzHGvty-MftDD04pk",
  "refresh_expires_at": "2026-10-30T02:44:28.056232757Z",
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
  "session_id": "91b3185a-c626-49bd-8813-2007a5005e96",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjgsImlhdCI6MTc5MzI4NTA2OCwianRpIjoiMTRkMzA5NzctZDM4NS00Yjk1LThjNWEtNzQzYjJhODBkNWM0Iiwic2lkIjoiOTFiMzE4NWEtYzYyNi00OWJkLTg4MTMtMjAwN2E1MDA1ZTk2In0.iKTXpWrRxdFPe_ehvscQEsaSMjg_k_mQcPahwOLfxWU",
  "access_expires_at": "2026-10-29T14:59:28.642586757Z",
  "refresh_token": "Ci5BzLnLbrFExxG94RaX-SzHsYtkQw4gPZaQikap-o8",
  "refresh_expires_at": "2026-10-30T02:44:28.642018538Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/c95be520-7c94-4a10-a9d9-2b6668ae5edc/attachments/98c4ab73-ca92-4b31-9840-49ecc704e636` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "fe91f70a-88fe-41e1-b904-21da4e6992cb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "cf0a6a4b-8241-4293-85fd-c03d594ddc76",
  "upload_path": "/api/operator/v1/uploads/cf0a6a4b-8241-4293-85fd-c03d594ddc76",
  "expires_at": "2026-10-29T14:59:28.950881589Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/cf0a6a4b-8241-4293-85fd-c03d594ddc76` → **200**

```json
{
  "file_id": "cf0a6a4b-8241-4293-85fd-c03d594ddc76",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/c95be520-7c94-4a10-a9d9-2b6668ae5edc` → **200**

```json
{
  "id": "c95be520-7c94-4a10-a9d9-2b6668ae5edc",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:44:27.462206Z",
  "updated_at": "2026-10-29T14:44:27.462206Z",
  "respond_by": "2026-10-29T18:44:27.462206Z",
  "messages": [
    {
      "id": "aac51120-f25c-495a-9079-c787c3a2fed9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:27.4632Z",
      "attachments": [
        {
          "file_id": "98c4ab73-ca92-4b31-9840-49ecc704e636",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/c95be520-7c94-4a10-a9d9-2b6668ae5edc/comments` → **200**

```json
{
  "command_id": "5fdb9b5b-9d8c-4d5f-826f-2a6fd2b5a2e6",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "cf0a6a4b-8241-4293-85fd-c03d594ddc76"
  ]
}
```

```json
{
  "id": "c95be520-7c94-4a10-a9d9-2b6668ae5edc",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:44:27.462206Z",
  "updated_at": "2026-10-29T14:44:29.587581Z",
  "respond_by": "2026-10-29T18:44:27.462206Z",
  "messages": [
    {
      "id": "aac51120-f25c-495a-9079-c787c3a2fed9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:27.4632Z",
      "attachments": [
        {
          "file_id": "98c4ab73-ca92-4b31-9840-49ecc704e636",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "73cd4685-9c28-4808-be32-e8abd1c28955",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:44:29.587125Z",
      "attachments": [
        {
          "file_id": "cf0a6a4b-8241-4293-85fd-c03d594ddc76",
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

`GET /api/rider/v1/support/cases/c95be520-7c94-4a10-a9d9-2b6668ae5edc` → **200**

```json
{
  "id": "c95be520-7c94-4a10-a9d9-2b6668ae5edc",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:44:27.462206Z",
  "updated_at": "2026-10-29T14:44:29.587581Z",
  "respond_by": "2026-10-29T18:44:27.462206Z",
  "messages": [
    {
      "id": "aac51120-f25c-495a-9079-c787c3a2fed9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ee2211d2-7ed4-433b-854b-9a8aff7b3449",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:27.4632Z",
      "attachments": [
        {
          "file_id": "98c4ab73-ca92-4b31-9840-49ecc704e636",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "73cd4685-9c28-4808-be32-e8abd1c28955",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:44:29.587125Z",
      "attachments": [
        {
          "file_id": "cf0a6a4b-8241-4293-85fd-c03d594ddc76",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/c95be520-7c94-4a10-a9d9-2b6668ae5edc/attachments/cf0a6a4b-8241-4293-85fd-c03d594ddc76` → **200**

Done: support case c95be520-7c94-4a10-a9d9-2b6668ae5edc, rider attachment 98c4ab73-ca92-4b31-9840-49ecc704e636, operator attachment cf0a6a4b-8241-4293-85fd-c03d594ddc76.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733213868",
  "device_ref": "sandbox-4796"
}
```

```json
{
  "challenge_id": "ead1501e-295b-4b81-9b5e-96300735a64b",
  "expires_at": "2026-10-29T14:49:30.22145071Z",
  "resend_available_at": "2026-10-29T14:44:31.22145071Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733213868` → **200**

```json
{
  "phone": "+380733213868",
  "audience": "CLIENT",
  "code": "777003",
  "sent_at": "2026-10-29T14:44:30.224196475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ead1501e-295b-4b81-9b5e-96300735a64b",
  "code": "777003",
  "device_ref": "sandbox-4796"
}
```

```json
{
  "session_id": "39bbd69e-4935-4ffc-b5a6-19a2e91b5265",
  "subject": {
    "type": "CLIENT",
    "id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjAwYjAxZC0xMDM0LTQ3ZDYtYTQ3ZS1mYTQ0ZGJhZmY3ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTcwLCJpYXQiOjE3OTMyODUwNzAsImp0aSI6ImYyYjdmMDRhLTAzMTYtNGJiYS05NjM5LTJkYmMxNWFlMzU4YSIsInNpZCI6IjM5YmJkNjllLTQ5MzUtNGZmYy1iNWE2LTE5YTJlOTFiNTI2NSJ9.VPdNlbyjxYQfoUVngmAGrf1eeAGkJ-xRypNIXnQ6bnM",
  "access_expires_at": "2026-10-29T14:59:30.532686712Z",
  "refresh_token": "y02Bp3-Gp810eExopeRkYjPPkJYCtUYCmjbY6Qg1hnk",
  "refresh_expires_at": "2026-11-28T14:44:30.532146485Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "66af764d-8adc-40ba-a76d-debbd59b4dc7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2ad7320f-ba21-4fef-a75c-b2ed3fb3b54a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2ad7320f-ba21-4fef-a75c-b2ed3fb3b54a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "dc171a8e4267f950fb9dec69ca052673",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2ad7320f-ba21-4fef-a75c-b2ed3fb3b54a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733213868"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2ad7320f-ba21-4fef-a75c-b2ed3fb3b54a",
  "expires_at": "2026-10-29T15:14:30.826021Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/2ad7320f-ba21-4fef-a75c-b2ed3fb3b54a` → **200**

```json
{
  "id": "2ad7320f-ba21-4fef-a75c-b2ed3fb3b54a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:14:30.826021Z",
  "card": {
    "id": "3bb65823-6ad7-4989-9580-a63b3eb58c34",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0360",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:44:31.129701Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "af316677-033e-4600-ab4e-b614e786aede",
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
  "id": "b1014a87-ef99-4fe6-91b2-7edafc3ccb63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:31.439287Z",
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
  "command_id": "e1195591-cc36-4d25-b21c-47a66e849b68",
  "quote_id": "b1014a87-ef99-4fe6-91b2-7edafc3ccb63",
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
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c` → **200**

```json
{
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c` → **200**

```json
{
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
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

`GET /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c` → **200**

```json
{
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c/switch-to-cash` → **200**

```json
{
  "command_id": "62f83319-22cc-48d9-97aa-7aa5283b472f",
  "expected_version": 3
}
```

```json
{
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c/switch-to-cash` → **409**

```json
{
  "command_id": "4da4dadf-dd9e-4a7f-b671-26e1a9274f01",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0c6d225e-dc14-4865-b053-a07ba5f4cabc"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c` → **200**

```json
{
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fc7df4bc-5f76-41e1-9af4-a4b94106033c/cancel` → **200**

```json
{
  "command_id": "316bbe96-6920-46c8-b1f8-00a78c308390",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc7df4bc-5f76-41e1-9af4-a4b94106033c",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7f00b01d-1034-47d6-a47e-fa44dbaff7e3",
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
  "created_at": "2026-10-29T14:44:31.751081Z",
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
  "session_id": "8f655760-e58a-4eff-a2b7-0127c6a317b1",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NzUsImlhdCI6MTc5MzI4NTA3NSwianRpIjoiOWY3NDEzZjktNTc5Mi00NGNmLTgwYzEtMTUyZDJjNDcwOTYzIiwic2lkIjoiOGY2NTU3NjAtZTU4YS00ZWZmLWEyYjctMDEyN2M2YTMxN2IxIn0.COipEwZUJK9DTCISbCkjFBm5QwgyTyhcp3XqNvWbNXc",
  "access_expires_at": "2026-10-29T14:59:35.509957994Z",
  "refresh_token": "JWyA5tj4ckGHenHWm1YSyPadz6A4bRyWrYfYizJRK5g",
  "refresh_expires_at": "2026-10-30T02:44:35.509402309Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14731"
}
```

```json
{
  "challenge_id": "9718eca4-e926-4595-9ac3-2eb20c246f95",
  "expires_at": "2026-10-29T14:49:35.802185086Z",
  "resend_available_at": "2026-10-29T14:44:36.802185086Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "984426",
  "sent_at": "2026-10-29T14:44:35.805345242Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9718eca4-e926-4595-9ac3-2eb20c246f95",
  "code": "984426",
  "device_ref": "sandbox-14731"
}
```

```json
{
  "session_id": "7d065d80-44e1-44f6-b57c-9ed939c6ea96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk3NiwiaWF0IjoxNzkzMjg1MDc2LCJqdGkiOiI3MDljMjIxYi0zNzljLTRhMTMtODZhNS0xZTMyNzkxNmYyMWMiLCJzaWQiOiI3ZDA2NWQ4MC00NGUxLTQ0ZjYtYjU3Yy05ZWQ5MzljNmVhOTYifQ.iPIwgU9y7ZF7I8FREKmgH3VkXtVb8hK-DGK053CRTWc",
  "access_expires_at": "2026-10-29T14:59:36.12946155Z",
  "refresh_token": "1qReBekR8JOiYbf2gjLqPs0KR3DQt9KK9A105IlcDNA",
  "refresh_expires_at": "2026-11-28T14:44:36.128958489Z",
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
      "actor_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:18.784633Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T14:44:20.25923Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d43dce16-c21a-4004-b486-8a3ddc1bda86",
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
  "device_ref": "sandbox-19275"
}
```

```json
{
  "challenge_id": "c31babe0-83a4-4fda-a1e1-e9e6db58e9a4",
  "expires_at": "2026-10-29T14:49:37.307558438Z",
  "resend_available_at": "2026-10-29T14:44:38.307558438Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "726538",
  "sent_at": "2026-10-29T14:44:37.310099332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c31babe0-83a4-4fda-a1e1-e9e6db58e9a4",
  "code": "726538",
  "device_ref": "sandbox-19275"
}
```

```json
{
  "session_id": "ca257783-7616-4059-b87a-bb5eb88a80fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk3NywiaWF0IjoxNzkzMjg1MDc3LCJqdGkiOiIxNzI4OTNjYi1kNDQ1LTRhMjktYTQ1MC0zZTdkZmMxNDNiMWMiLCJzaWQiOiJjYTI1Nzc4My03NjE2LTQwNTktYjg3YS1iYjVlYjg4YTgwZmIifQ.QiFlCmJB2ht8nywhlRfvJ1tl5qcDTCKTrlEfSgNnqSM",
  "access_expires_at": "2026-10-29T14:59:37.620411065Z",
  "refresh_token": "E1ZRDXtfd-CTLray-ZCKRdF2Ve4875Vth1EwWG_lduc",
  "refresh_expires_at": "2026-11-28T14:44:37.619917436Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:43:59.673394Z",
  "last_location_at": "2026-10-29T14:43:59.673394Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b14ead49-44a7-46de-ace3-114e7f48220c/handover` → **200**

```json
{
  "command_id": "e994d9a1-e250-45aa-9af6-991634f5b8bd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:43:59.673394Z",
  "last_location_at": "2026-10-29T14:43:59.673394Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b14ead49-44a7-46de-ace3-114e7f48220c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:38Z",
    "sequence": 1793285078492
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:44:38.511823Z",
  "last_location_at": "2026-10-29T14:44:38.511823Z",
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
  "command_id": "cec6d65a-ab0b-4e54-8d54-ebc25cef2840",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:39Z",
    "sequence": 1793285079107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1e095748-0c87-4553-9bb2-85bcdd07d637",
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
  "last_heartbeat_at": "2026-10-29T14:44:39.125919Z",
  "last_location_at": "2026-10-29T14:44:39.125919Z",
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
  "session_id": "4a2707a8-5453-4b72-b31f-fc9099c96e2b",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NzksImlhdCI6MTc5MzI4NTA3OSwianRpIjoiYzVhMWU3YzUtOTAzMS00NWIyLTk5NGUtNzgzNjE1OTlhNmU5Iiwic2lkIjoiNGEyNzA3YTgtNTQ1My00YjcyLWIzMWYtZmM5MDk5Yzk2ZTJiIn0.u1JUML-OHxvnvF9hTPIcUwRLYdWUUQkZ2qSEziEKslI",
  "access_expires_at": "2026-10-29T14:59:39.711483162Z",
  "refresh_token": "aq1tAk4FgAWMx6Ur7D1_OvTY2Czg1t-bTqplEgJIHEI",
  "refresh_expires_at": "2026-10-30T02:44:39.710963113Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "dacb736c-c21c-4a6a-8070-c994b40fee26",
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
  "id": "c3510018-d5e3-4752-805e-e91254b85f85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:40.000244Z",
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
  "command_id": "243aa2db-2271-4855-b313-4ca0acc05c2e",
  "quote_id": "c3510018-d5e3-4752-805e-e91254b85f85",
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
  "id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
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
  "created_at": "2026-10-29T14:44:40.298245Z",
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
    "id": "9a15a315-b91c-46f2-a042-e77cd06ac3e8",
    "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
    "expires_at": "2026-10-29T14:44:55.301895Z",
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

`POST /api/driver/v1/offers/9a15a315-b91c-46f2-a042-e77cd06ac3e8/accept` → **200**

```json
{
  "command_id": "bf3a44c8-984f-4c87-950a-693c3a60a005"
}
```

```json
{
  "id": "4ee9daee-66c7-4499-881e-6a788c847ac5",
  "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "724553a2-4841-40d1-969d-9a5459c9cf82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "724553a2-4841-40d1-969d-9a5459c9cf82",
  "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
  "assignment_id": "4ee9daee-66c7-4499-881e-6a788c847ac5",
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

`POST /api/driver/v1/work-sessions/1e095748-0c87-4553-9bb2-85bcdd07d637/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:41Z",
    "sequence": 1793285081790
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1e095748-0c87-4553-9bb2-85bcdd07d637",
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
  "last_heartbeat_at": "2026-10-29T14:44:41.810011Z",
  "last_location_at": "2026-10-29T14:44:41.810011Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/724553a2-4841-40d1-969d-9a5459c9cf82/arrive` → **200**

```json
{
  "command_id": "b4bc3460-b800-4d16-a606-2337938bb2bb",
  "expected_version": 0
}
```

```json
{
  "id": "724553a2-4841-40d1-969d-9a5459c9cf82",
  "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
  "assignment_id": "4ee9daee-66c7-4499-881e-6a788c847ac5",
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
  "arrived_at": "2026-10-29T14:44:42.117867Z",
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

`POST /api/driver/v1/trips/724553a2-4841-40d1-969d-9a5459c9cf82/start` → **200**

```json
{
  "command_id": "31755a87-56a0-449b-a4d6-199650315f20",
  "expected_version": 1
}
```

```json
{
  "id": "724553a2-4841-40d1-969d-9a5459c9cf82",
  "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
  "assignment_id": "4ee9daee-66c7-4499-881e-6a788c847ac5",
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
  "arrived_at": "2026-10-29T14:44:42.117867Z",
  "started_at": "2026-10-29T14:44:42.426675Z",
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

`POST /api/driver/v1/trips/724553a2-4841-40d1-969d-9a5459c9cf82/complete` → **200**

```json
{
  "command_id": "6e3b2f1f-5294-4c0b-b78f-d2364c9fef1b",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:44:42Z",
  "cash_received": true
}
```

```json
{
  "id": "724553a2-4841-40d1-969d-9a5459c9cf82",
  "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
  "assignment_id": "4ee9daee-66c7-4499-881e-6a788c847ac5",
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
  "arrived_at": "2026-10-29T14:44:42.117867Z",
  "started_at": "2026-10-29T14:44:42.426675Z",
  "completed_at": "2026-10-29T14:44:42.74653Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7` → **200**

```json
{
  "id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
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
    "id": "4ee9daee-66c7-4499-881e-6a788c847ac5",
    "order_id": "79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "724553a2-4841-40d1-969d-9a5459c9cf82",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:44:40.298245Z",
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
  "session_id": "b14ead49-44a7-46de-ace3-114e7f48220c",
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
  "last_heartbeat_at": "2026-10-29T14:44:38.511823Z",
  "last_location_at": "2026-10-29T14:44:38.511823Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b14ead49-44a7-46de-ace3-114e7f48220c/close` → **200**

```json
{
  "command_id": "6f24cb71-cccd-446e-9806-950389c026e7",
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
  "session_id": "1e095748-0c87-4553-9bb2-85bcdd07d637",
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
  "last_heartbeat_at": "2026-10-29T14:44:41.810011Z",
  "last_location_at": "2026-10-29T14:44:41.810011Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1e095748-0c87-4553-9bb2-85bcdd07d637/close` → **200**

```json
{
  "command_id": "e829faee-1ac0-4e2e-af25-1d4cf15be284",
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

Done: terminal order 79fefbc9-f322-4ae5-a9ba-2cbf7a6addd7 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-230"
}
```

```json
{
  "challenge_id": "41d88171-0b14-4406-ba46-900cc6c09a0a",
  "expires_at": "2026-10-29T14:49:47.802184678Z",
  "resend_available_at": "2026-10-29T14:44:48.802184678Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "525195",
  "sent_at": "2026-10-29T14:44:47.805162305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41d88171-0b14-4406-ba46-900cc6c09a0a",
  "code": "525195",
  "device_ref": "sandbox-230"
}
```

```json
{
  "session_id": "28982a41-1106-4e9e-a798-7c52e3d9be4e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk4OCwiaWF0IjoxNzkzMjg1MDg4LCJqdGkiOiI1ZjQ5ZjMzMi1lNjhhLTRmN2MtYWVlYS1kNWNjYTU1MmNlYTMiLCJzaWQiOiIyODk4MmE0MS0xMTA2LTRlOWUtYTc5OC03YzUyZTNkOWJlNGUifQ.VCG671Bgdjr-2ZD89eBX9lShjgofh8Jvc5XcnKIAGQQ",
  "access_expires_at": "2026-10-29T14:59:48.124874782Z",
  "refresh_token": "MU_XCtnq9ZQV2tN6P0NPcG7O12dqtnzNy52R15ylhUs",
  "refresh_expires_at": "2026-11-28T14:44:48.124346859Z",
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
  "device_ref": "sandbox-5814"
}
```

```json
{
  "challenge_id": "36b80474-36a9-4cdc-b4d0-770f142f8e5e",
  "expires_at": "2026-10-29T14:49:48.703525714Z",
  "resend_available_at": "2026-10-29T14:44:49.703525714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "530184",
  "sent_at": "2026-10-29T14:44:48.706634406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36b80474-36a9-4cdc-b4d0-770f142f8e5e",
  "code": "530184",
  "device_ref": "sandbox-5814"
}
```

```json
{
  "session_id": "7645a0af-5689-4d25-b6cb-9bc5d03eb51b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk4OSwiaWF0IjoxNzkzMjg1MDg5LCJqdGkiOiI4NGNjNGI5Ny00NGE1LTQ4ZmItOTQ3OC1hYWVlNGU3ZDA5ZDMiLCJzaWQiOiI3NjQ1YTBhZi01Njg5LTRkMjUtYjZjYi05YmM1ZDAzZWI1MWIifQ.nmF6DPC7FKbcOiCj_EIOvPM3pH4V6aceFeAbbuZL4Sc",
  "access_expires_at": "2026-10-29T14:59:49.030720419Z",
  "refresh_token": "2TNYNE3lBdUwk2kgXddN6kJ_X9406tm73uit_Zis0xg",
  "refresh_expires_at": "2026-11-28T14:44:49.030148885Z",
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
  "device_ref": "sandbox-16050"
}
```

```json
{
  "challenge_id": "253e3819-fcb7-4609-9928-b74fb62d7b15",
  "expires_at": "2026-10-29T14:49:49.611195723Z",
  "resend_available_at": "2026-10-29T14:44:50.611195723Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "147551",
  "sent_at": "2026-10-29T14:44:49.613868519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "253e3819-fcb7-4609-9928-b74fb62d7b15",
  "code": "147551",
  "device_ref": "sandbox-16050"
}
```

```json
{
  "session_id": "00fa7604-3754-4d8c-a4ce-85ecac8543e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk4OSwiaWF0IjoxNzkzMjg1MDg5LCJqdGkiOiJlZmMzNzM4Yi02OGFjLTQ4NjctOTc5Ny1lNDc5YzM2ZDdmZmMiLCJzaWQiOiIwMGZhNzYwNC0zNzU0LTRkOGMtYTRjZS04NWVjYWM4NTQzZTgifQ._wW8fQH-_NDTxq3Rj3hPlG-JHtuXT8g8s5FBWGAjkPw",
  "access_expires_at": "2026-10-29T14:59:49.918911361Z",
  "refresh_token": "84ST4hrba53f5lLxd_WQ9RM1JmKiiZm42r04HzNKZls",
  "refresh_expires_at": "2026-11-28T14:44:49.918367518Z",
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
  "phone": "+380699322371",
  "device_ref": "sandbox-29033"
}
```

```json
{
  "challenge_id": "76cdc806-0368-4810-b27c-c3b0ffe1bd1b",
  "expires_at": "2026-10-29T14:49:50.479954257Z",
  "resend_available_at": "2026-10-29T14:44:51.479954257Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699322371` → **200**

```json
{
  "phone": "+380699322371",
  "audience": "CLIENT",
  "code": "427433",
  "sent_at": "2026-10-29T14:44:50.482389223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76cdc806-0368-4810-b27c-c3b0ffe1bd1b",
  "code": "427433",
  "device_ref": "sandbox-29033"
}
```

```json
{
  "session_id": "416616c3-84b8-4f19-aa18-89f4043e7ae5",
  "subject": {
    "type": "CLIENT",
    "id": "028a402d-2457-434a-a657-a9a2b7e6d8c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjhhNDAyZC0yNDU3LTQzNGEtYTY1Ny1hOWEyYjdlNmQ4YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTkwLCJpYXQiOjE3OTMyODUwOTAsImp0aSI6IjRiNGNmZDg2LWI2MGYtNDEwMi05ZWY1LTNhMjcyYmMyNGRlOCIsInNpZCI6IjQxNjYxNmMzLTg0YjgtNGYxOS1hYTE4LTg5ZjQwNDNlN2FlNSJ9.dlQHnxPGWgwBaNKkQ3Sc8Qv3R9og1C3JiuCXu6Yclwk",
  "access_expires_at": "2026-10-29T14:59:50.792381298Z",
  "refresh_token": "GnHRgruI0LLTGfrj5RphGHc6wW074wO0cHyWJOLeTpQ",
  "refresh_expires_at": "2026-11-28T14:44:50.791905513Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1bb532bd-da55-4d83-9189-416b125686c8",
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
  "id": "63715243-2b0c-49f1-86f8-5b9209588bc0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:51.091205Z",
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
  "command_id": "2d62838c-a391-4eda-898d-75514da8c1e7",
  "quote_id": "63715243-2b0c-49f1-86f8-5b9209588bc0",
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
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:51.401751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:44:51.401751Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.558627561
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.149576353
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

`GET /api/rider/v1/orders/43944378-e7e6-4009-8876-b7756c89d9c4` → **200**

```json
{
  "id": "43944378-e7e6-4009-8876-b7756c89d9c4",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "028a402d-2457-434a-a657-a9a2b7e6d8c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:44:51.401751Z",
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
  "session_id": "8e54227c-115e-4b2f-b60b-cec28d1ea77d",
  "subject": {
    "type": "STAFF",
    "id": "91a787e8-0d08-43d0-ba81-f10a7606b53a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWE3ODdlOC0wZDA4LTQzZDAtYmE4MS1mMTBhNzYwNmI1M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODYxNzMsImlhdCI6MTc5MzI4NTI3MywianRpIjoiZjUyOTE2ZjctNjBmNS00NWNhLTg1NDAtYWFjMGYyNWM1YWRjIiwic2lkIjoiOGU1NDIyN2MtMTE1ZS00YjJmLWI2MGItY2VjMjhkMWVhNzdkIn0.iF1RVMYRtNGvAxE4gX7PZ7iyfvOgfrW3iAQgC-c1ODQ",
  "access_expires_at": "2026-10-29T15:02:53.522481799Z",
  "refresh_token": "QuZsEddt7duFH6Il2OStg5hd0JxtQnc5twYBX2UaKEs",
  "refresh_expires_at": "2026-10-30T02:47:53.521938428Z",
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
  "id": "82112812-510a-41a6-b638-dc12f4366530",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:53.844804Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:53.844902Z",
  "updated_at": "2026-10-29T14:47:53.86297Z",
  "finished_at": "2026-10-29T14:47:53.86297Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/82112812-510a-41a6-b638-dc12f4366530` → **200**

```json
{
  "run": {
    "id": "82112812-510a-41a6-b638-dc12f4366530",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:47:53.844804Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:47:53.844902Z",
    "updated_at": "2026-10-29T14:47:53.86297Z",
    "finished_at": "2026-10-29T14:47:53.86297Z",
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
  "id": "82112812-510a-41a6-b638-dc12f4366530",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:53.844804Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:53.844902Z",
  "updated_at": "2026-10-29T14:47:53.86297Z",
  "finished_at": "2026-10-29T14:47:53.86297Z",
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
  "id": "82112812-510a-41a6-b638-dc12f4366530",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:53.844804Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:53.844902Z",
  "updated_at": "2026-10-29T14:47:53.86297Z",
  "finished_at": "2026-10-29T14:47:53.86297Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ff2daa39-8a54-4775-ac0a-b77b482ad710` → **204**

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
  "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:54.323067Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:54.323115Z",
  "updated_at": "2026-10-29T14:47:54.33057Z",
  "finished_at": "2026-10-29T14:47:54.33057Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/3f3cf69e-e17a-497b-ba8f-93e3ed50b126` → **200**

```json
{
  "run": {
    "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:47:54.323067Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:47:54.323115Z",
    "updated_at": "2026-10-29T14:47:54.33057Z",
    "finished_at": "2026-10-29T14:47:54.33057Z",
    "version": 1
  },
  "items": [
    {
      "id": "846065b9-4838-4a1a-b7ec-18859a8fe692",
      "run_id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "cdebec1036e0cd304e306ba3b2297b6b87dc75d62d66f3ec3e592f2492a6079f",
      "reference_display": "sandbox-reconciliation-ff2daa39-8a54-4775-ac0a-b77b482ad710",
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
      "provider_at": "2026-10-29T14:47:54Z",
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
  "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:54.323067Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:54.323115Z",
  "updated_at": "2026-10-29T14:47:54.33057Z",
  "finished_at": "2026-10-29T14:47:54.33057Z",
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
  "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:54.323067Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:54.323115Z",
  "updated_at": "2026-10-29T14:47:54.33057Z",
  "finished_at": "2026-10-29T14:47:54.33057Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/846065b9-4838-4a1a-b7ec-18859a8fe692/resolve` → **200**

```json
{
  "command_id": "4360b852-d04c-4605-9bed-4073a4cd76d6",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "846065b9-4838-4a1a-b7ec-18859a8fe692",
  "run_id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "cdebec1036e0cd304e306ba3b2297b6b87dc75d62d66f3ec3e592f2492a6079f",
  "reference_display": "sandbox-reconciliation-ff2daa39-8a54-4775-ac0a-b77b482ad710",
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
  "provider_at": "2026-10-29T14:47:54Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "resolved_at": "2026-10-29T14:47:54.777029Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/846065b9-4838-4a1a-b7ec-18859a8fe692/resolve` → **200**

```json
{
  "command_id": "4360b852-d04c-4605-9bed-4073a4cd76d6",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "846065b9-4838-4a1a-b7ec-18859a8fe692",
  "run_id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "cdebec1036e0cd304e306ba3b2297b6b87dc75d62d66f3ec3e592f2492a6079f",
  "reference_display": "sandbox-reconciliation-ff2daa39-8a54-4775-ac0a-b77b482ad710",
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
  "provider_at": "2026-10-29T14:47:54Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
  "resolved_at": "2026-10-29T14:47:54.777029Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/846065b9-4838-4a1a-b7ec-18859a8fe692/resolve` → **409**

```json
{
  "command_id": "9889a9fa-066c-4a8e-9af7-312e363c6978",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/846065b9-4838-4a1a-b7ec-18859a8fe692/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0830588f-45c7-4cbe-9e95-30a3b74874ee"
}
```

`GET /api/admin/v1/payment-reconciliations/3f3cf69e-e17a-497b-ba8f-93e3ed50b126` → **200**

```json
{
  "run": {
    "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:47:54.323067Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:47:54.323115Z",
    "updated_at": "2026-10-29T14:47:54.777029Z",
    "finished_at": "2026-10-29T14:47:54.33057Z",
    "version": 2
  },
  "items": [
    {
      "id": "846065b9-4838-4a1a-b7ec-18859a8fe692",
      "run_id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "cdebec1036e0cd304e306ba3b2297b6b87dc75d62d66f3ec3e592f2492a6079f",
      "reference_display": "sandbox-reconciliation-ff2daa39-8a54-4775-ac0a-b77b482ad710",
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
      "provider_at": "2026-10-29T14:47:54Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "91a787e8-0d08-43d0-ba81-f10a7606b53a",
      "resolved_at": "2026-10-29T14:47:54.777029Z",
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
      "id": "2c7950d3-630f-499d-b986-f05ad361a9c4",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:40:00.931485Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:40:00.931653Z",
      "updated_at": "2026-10-29T14:40:00.937188Z",
      "finished_at": "2026-10-29T14:40:00.937188Z",
      "version": 1
    },
    {
      "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T14:47:54.323067Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:47:54.323115Z",
      "updated_at": "2026-10-29T14:47:54.777029Z",
      "finished_at": "2026-10-29T14:47:54.33057Z",
      "version": 2
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/ff2daa39-8a54-4775-ac0a-b77b482ad710` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "3f3cf69e-e17a-497b-ba8f-93e3ed50b126",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:47:54.323067Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:47:54.323115Z",
  "updated_at": "2026-10-29T14:47:54.777029Z",
  "finished_at": "2026-10-29T14:47:54.33057Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793285401166E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793285401315E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793285401315E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793285401317E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793285401316E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
